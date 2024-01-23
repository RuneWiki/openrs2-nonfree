import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!fa;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	private int anInt323 = 0;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	private int anInt334 = 0;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!mi;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!mi;)V")
	public Class11(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class72 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass72_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[BI)V")
	public void method269(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean11) {
			return;
		}
		if (this.aBoolean10) {
			this.aBoolean10 = false;
			throw new IOException();
		}
		if (this.aByteArray5 == null) {
			this.aByteArray5 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray5[this.anInt334] = arg1[local40];
				this.anInt334 = (this.anInt334 + 1) % 5000;
				if ((this.anInt323 + 4900) % 5000 == this.anInt334) {
					throw new IOException();
				}
			}
			if (this.aClass38_1 == null) {
				this.aClass38_1 = this.aClass72_2.method2246(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public void method271() {
		if (this.aBoolean11) {
			return;
		}
		synchronized (this) {
			this.aBoolean11 = true;
			this.notifyAll();
		}
		if (this.aClass38_1 != null) {
			while (this.aClass38_1.anInt1236 == 0) {
				Static186.method3115(1L);
			}
			if (this.aClass38_1.anInt1236 == 1) {
				try {
					((Thread) this.aClass38_1.anObject3).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass38_1 = null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
	public int method273() throws IOException {
		return this.aBoolean11 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt334 == this.anInt323) {
							if (this.aBoolean11) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt323 <= this.anInt334) {
							local40 = this.anInt334 - this.anInt323;
						} else {
							local40 = 5000 - this.anInt323;
						}
						local51 = this.anInt323;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray5, local51, local40);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean10 = true;
					}
					this.anInt323 = (this.anInt323 + local40) % 5000;
					try {
						if (this.anInt323 == this.anInt334) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean10 = true;
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
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray5 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static34.method595(null, local126);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([BIIB)V")
	public void method274(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean11) {
			return;
		}
		while (arg2 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg1 += local18;
			arg2 -= local18;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
	public int method275() throws IOException {
		return this.aBoolean11 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method271();
	}
}
