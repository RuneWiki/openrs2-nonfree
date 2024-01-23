import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "Lclient!ub;")
	private Class163 aClass163_9;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private int anInt2702 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	private int anInt2707 = 0;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Lclient!bk;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!bk;)V")
	public Class92(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class17 arg1) throws IOException {
		this.aClass17_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
	public int method2175() throws IOException {
		return this.aBoolean224 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public void method2176() {
		if (this.aBoolean224) {
			return;
		}
		synchronized (this) {
			this.aBoolean224 = true;
			this.notifyAll();
		}
		if (this.aClass163_9 != null) {
			while (this.aClass163_9.anInt5259 == 0) {
				Static162.method2645(1L);
			}
			if (this.aClass163_9.anInt5259 == 1) {
				try {
					((Thread) this.aClass163_9.anObject7).join();
				} catch (@Pc(62) InterruptedException local62) {
				}
			}
		}
		this.aClass163_9 = null;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)I")
	public int method2177() throws IOException {
		return this.aBoolean224 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[BI)V")
	public void method2178(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean224) {
			return;
		}
		if (this.aBoolean225) {
			this.aBoolean225 = false;
			throw new IOException();
		}
		if (this.aByteArray21 == null) {
			this.aByteArray21 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				this.aByteArray21[this.anInt2702] = arg0[local40];
				this.anInt2702 = (this.anInt2702 + 1) % 5000;
				if (this.anInt2702 == (this.anInt2707 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass163_9 == null) {
				this.aClass163_9 = this.aClass17_1.method449(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public void method2179() throws IOException {
		if (!this.aBoolean224 && this.aBoolean225) {
			this.aBoolean225 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(35) int local35;
				@Pc(46) int local46;
				synchronized (this) {
					if (this.anInt2707 == this.anInt2702) {
						if (this.aBoolean224) {
							break;
						}
						try {
							this.wait();
						} catch (@Pc(23) InterruptedException local23) {
						}
					}
					if (this.anInt2707 <= this.anInt2702) {
						local35 = this.anInt2702 - this.anInt2707;
					} else {
						local35 = 5000 - this.anInt2707;
					}
					local46 = this.anInt2707;
				}
				if (local35 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray21, local46, local35);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean225 = true;
					}
					this.anInt2707 = (local35 + this.anInt2707) % 5000;
					try {
						if (this.anInt2702 == this.anInt2707) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean225 = true;
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
			} catch (@Pc(119) IOException local119) {
			}
			this.aByteArray21 = null;
		} catch (@Pc(124) Exception local124) {
			Static88.method1444(null, local124);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[B)V")
	public void method2182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean224) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg1 -= local19;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	public void method2183() {
		if (!this.aBoolean224) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2176();
	}
}
