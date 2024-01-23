import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class97 implements Runnable {

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "Lclient!vd;")
	private Class185 aClass185_4;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	private int anInt2944 = 0;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	private int anInt2947 = 0;

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "Lclient!rj;")
	private Class154 aClass154_2;

	@OriginalMember(owner = "client!kn", name = "u", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!rj;)V")
	public Class97(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class154 arg1) throws IOException {
		this.aClass154_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public void method2546() {
		if (!this.aBoolean182) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public void method2547() {
		if (this.aBoolean182) {
			return;
		}
		synchronized (this) {
			this.aBoolean182 = true;
			this.notifyAll();
		}
		if (this.aClass185_4 != null) {
			while (this.aClass185_4.anInt5276 == 0) {
				Static282.method4345(1L);
			}
			if (this.aClass185_4.anInt5276 == 1) {
				try {
					((Thread) this.aClass185_4.anObject6).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass185_4 = null;
	}

	@OriginalMember(owner = "client!kn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2547();
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)I")
	public int method2548() throws IOException {
		return this.aBoolean182 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)I")
	public int method2551() throws IOException {
		return this.aBoolean182 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III[B)V")
	public void method2552(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean182) {
			return;
		}
		if (this.aBoolean183) {
			this.aBoolean183 = false;
			throw new IOException();
		}
		if (this.aByteArray35 == null) {
			this.aByteArray35 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
				this.aByteArray35[this.anInt2947] = arg1[local42];
				this.anInt2947 = (this.anInt2947 + 1) % 5000;
				if ((this.anInt2944 + 4900) % 5000 == this.anInt2947) {
					throw new IOException();
				}
			}
			if (this.aClass185_4 == null) {
				this.aClass185_4 = this.aClass154_2.method3881(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIB[B)V")
	public void method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean182) {
			return;
		}
		while (arg1 > 0) {
			@Pc(27) int local27 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local27 <= 0) {
				throw new EOFException();
			}
			arg0 += local27;
			arg1 -= local27;
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	public void method2557() throws IOException {
		if (!this.aBoolean182 && this.aBoolean183) {
			this.aBoolean183 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(50) int local50;
				@Pc(34) int local34;
				synchronized (this) {
					if (this.anInt2947 == this.anInt2944) {
						if (this.aBoolean182) {
							break;
						}
						try {
							this.wait();
						} catch (@Pc(31) InterruptedException local31) {
						}
					}
					local34 = this.anInt2944;
					if (this.anInt2944 <= this.anInt2947) {
						local50 = this.anInt2947 - this.anInt2944;
					} else {
						local50 = 5000 - this.anInt2944;
					}
				}
				if (local50 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray35, local34, local50);
					} catch (@Pc(77) IOException local77) {
						this.aBoolean183 = true;
					}
					this.anInt2944 = (local50 + this.anInt2944) % 5000;
					try {
						if (this.anInt2947 == this.anInt2944) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(102) IOException local102) {
						this.aBoolean183 = true;
					}
				}
			}
			try {
				if (this.anInputStream1 != null) {
					this.anInputStream1.close();
				}
				if (this.anOutputStream1 != null) {
					this.anOutputStream1.close();
				}
				if (this.aSocket1 != null) {
					this.aSocket1.close();
				}
			} catch (@Pc(129) IOException local129) {
			}
			this.aByteArray35 = null;
		} catch (@Pc(134) Exception local134) {
			Static159.method2733(local134, null);
		}
	}
}
