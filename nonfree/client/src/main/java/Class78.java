import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class78 implements Runnable {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!n;")
	private Class51 aClass51_8;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "I")
	private int anInt3135 = 0;

	@OriginalMember(owner = "client!va", name = "x", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "I")
	private int anInt3142 = 0;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!oc;")
	private final Class55 aClass55_4;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!oc;)V")
	public Class78(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class55 arg1) throws IOException {
		this.aClass55_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I")
	public int method2175() throws IOException {
		return this.aBoolean120 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public void method2176() {
		if (this.aBoolean120) {
			return;
		}
		synchronized (this) {
			this.aBoolean120 = true;
			this.notifyAll();
		}
		if (this.aClass51_8 != null) {
			while (this.aClass51_8.anInt1880 == 0) {
				Static70.method1226(1L);
			}
			if (this.aClass51_8.anInt1880 == 1) {
				try {
					((Thread) this.aClass51_8.anObject2).join();
				} catch (@Pc(52) InterruptedException local52) {
				}
			}
		}
		this.aClass51_8 = null;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)I")
	public int method2179() throws IOException {
		return this.aBoolean120 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2176();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BII)V")
	public void method2180(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean120) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 += local18;
			arg1 -= local18;
		}
	}

	@OriginalMember(owner = "client!va", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt3135 == this.anInt3142) {
							if (this.aBoolean120) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt3142;
						if (this.anInt3135 >= this.anInt3142) {
							local44 = this.anInt3135 - this.anInt3142;
						} else {
							local44 = 5000 - this.anInt3142;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray38, local32, local44);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean119 = true;
					}
					this.anInt3142 = (local44 + this.anInt3142) % 5000;
					try {
						if (this.anInt3142 == this.anInt3135) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean119 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray38 = null;
				return;
			}
		} catch (@Pc(119) Exception local119) {
			Static122.method2173(local119, null);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBI[B)V")
	public void method2182(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean120) {
			return;
		}
		if (this.aBoolean119) {
			this.aBoolean119 = false;
			throw new IOException();
		}
		if (this.aByteArray38 == null) {
			this.aByteArray38 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg0; local40++) {
				this.aByteArray38[this.anInt3135] = arg1[local40];
				this.anInt3135 = (this.anInt3135 + 1) % 5000;
				if ((this.anInt3142 + 4900) % 5000 == this.anInt3135) {
					throw new IOException();
				}
			}
			if (this.aClass51_8 == null) {
				this.aClass51_8 = this.aClass55_4.method1537(3, this);
			}
			this.notifyAll();
		}
	}
}
