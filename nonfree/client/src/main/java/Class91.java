import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class91 implements Runnable {

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "Lclient!nn;")
	private Class119 aClass119_5;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	private int anInt2847 = 0;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	private int anInt2855 = 0;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "Lclient!we;")
	private Class184 aClass184_4;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!we;)V")
	public Class91(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class184 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass184_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public void method2295() throws IOException {
		if (!this.aBoolean184 && this.aBoolean183) {
			this.aBoolean183 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)I")
	public int method2300() throws IOException {
		return this.aBoolean184 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2302();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public void method2301() {
		if (!this.aBoolean184) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public void method2302() {
		if (this.aBoolean184) {
			return;
		}
		synchronized (this) {
			this.aBoolean184 = true;
			this.notifyAll();
		}
		if (this.aClass119_5 != null) {
			while (this.aClass119_5.anInt3695 == 0) {
				Static193.method3169(1L);
			}
			if (this.aClass119_5.anInt3695 == 1) {
				try {
					((Thread) this.aClass119_5.anObject4).join();
				} catch (@Pc(61) InterruptedException local61) {
				}
			}
		}
		this.aClass119_5 = null;
	}

	@OriginalMember(owner = "client!kh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(42) int local42;
				@Pc(30) int local30;
				synchronized (this) {
					if (this.anInt2855 == this.anInt2847) {
						if (this.aBoolean184) {
							break;
						}
						try {
							this.wait();
						} catch (@Pc(27) InterruptedException local27) {
						}
					}
					local30 = this.anInt2855;
					if (this.anInt2855 <= this.anInt2847) {
						local42 = this.anInt2847 - this.anInt2855;
					} else {
						local42 = 5000 - this.anInt2855;
					}
				}
				if (local42 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray32, local30, local42);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean183 = true;
					}
					this.anInt2855 = (local42 + this.anInt2855) % 5000;
					try {
						if (this.anInt2847 == this.anInt2855) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(95) IOException local95) {
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
			} catch (@Pc(123) IOException local123) {
			}
			this.aByteArray32 = null;
		} catch (@Pc(128) Exception local128) {
			Static204.method3269(local128, null);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BZ)V")
	public void method2303(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean184) {
			return;
		}
		if (this.aBoolean183) {
			this.aBoolean183 = false;
			throw new IOException();
		}
		if (this.aByteArray32 == null) {
			this.aByteArray32 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray32[this.anInt2847] = arg1[local40];
				this.anInt2847 = (this.anInt2847 + 1) % 5000;
				if (this.anInt2847 == (this.anInt2855 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass119_5 == null) {
				this.aClass119_5 = this.aClass184_4.method4621(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIII)V")
	public void method2304(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean184) {
			return;
		}
		while (arg2 > 0) {
			@Pc(24) int local24 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg1 += local24;
			arg2 -= local24;
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I")
	public int method2305() throws IOException {
		return this.aBoolean184 ? 0 : this.anInputStream1.read();
	}
}
