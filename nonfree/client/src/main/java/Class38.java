import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "[B")
	private byte[] aByteArray20;

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "Lclient!oc;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	private int anInt2103 = 0;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	private int anInt2105 = 0;

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "Lclient!qf;")
	private final Class68 aClass68_2;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qf;)V")
	public Class38(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class68 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass68_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(47) int local47;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt2105 == this.anInt2103) {
							if (this.aBoolean110) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2105;
						if (this.anInt2103 < this.anInt2105) {
							local47 = 5000 - this.anInt2105;
						} else {
							local47 = this.anInt2103 - this.anInt2105;
						}
					}
					if (local47 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray20, local32, local47);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean111 = true;
					}
					this.anInt2105 = (local47 + this.anInt2105) % 5000;
					try {
						if (this.anInt2105 == this.anInt2103) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean111 = true;
					}
					continue;
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
				} catch (@Pc(122) IOException local122) {
				}
				this.aByteArray20 = null;
				return;
			}
		} catch (@Pc(127) Exception local127) {
			Static146.method2791(local127, null);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public void method1632() {
		if (this.aBoolean110) {
			return;
		}
		synchronized (this) {
			this.aBoolean110 = true;
			this.notifyAll();
		}
		if (this.aClass61_2 != null) {
			while (this.aClass61_2.anInt2845 == 0) {
				Static65.method1574(1L);
			}
			if (this.aClass61_2.anInt2845 == 1) {
				try {
					((Thread) this.aClass61_2.anObject4).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass61_2 = null;
	}

	@OriginalMember(owner = "client!ig", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1632();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB[BI)V")
	public void method1633(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean110) {
			return;
		}
		if (this.aBoolean111) {
			this.aBoolean111 = false;
			throw new IOException();
		}
		if (this.aByteArray20 == null) {
			this.aByteArray20 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray20[this.anInt2103] = arg1[local40];
				this.anInt2103 = (this.anInt2103 + 1) % 5000;
				if (this.anInt2103 == (this.anInt2105 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass61_2 == null) {
				this.aClass61_2 = this.aClass68_2.method2525(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
	public int method1634() throws IOException {
		return this.aBoolean110 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I")
	public int method1635() throws IOException {
		return this.aBoolean110 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BII)V")
	public void method1636(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean110) {
			return;
		}
		while (arg2 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 += local18;
			arg2 -= local18;
		}
	}
}
