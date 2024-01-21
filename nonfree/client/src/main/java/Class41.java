import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!j", name = "g", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!k;")
	private Class47 aClass47_2;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	private int anInt1815 = 0;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	private int anInt1820 = 0;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!pf;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!j", name = "y", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pf;)V")
	public Class41(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class68 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass68_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II[BI)V")
	public void method1339(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean72) {
			return;
		}
		if (this.aBoolean71) {
			this.aBoolean71 = false;
			throw new IOException();
		}
		if (this.aByteArray10 == null) {
			this.aByteArray10 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray10[this.anInt1815] = arg1[local37];
				this.anInt1815 = (this.anInt1815 + 1) % 5000;
				if (this.anInt1815 == (this.anInt1820 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass47_2 == null) {
				this.aClass47_2 = this.aClass68_1.method2226(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public void method1340() {
		if (this.aBoolean72) {
			return;
		}
		synchronized (this) {
			this.aBoolean72 = true;
			this.notifyAll();
		}
		if (this.aClass47_2 != null) {
			while (this.aClass47_2.anInt1949 == 0) {
				Static133.method2259(1L);
			}
			if (this.aClass47_2.anInt1949 == 1) {
				try {
					((Thread) this.aClass47_2.anObject1).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass47_2 = null;
	}

	@OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1340();
	}

	@OriginalMember(owner = "client!j", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1820 == this.anInt1815) {
							if (this.aBoolean72) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1820;
						if (this.anInt1820 > this.anInt1815) {
							local43 = 5000 - this.anInt1820;
						} else {
							local43 = this.anInt1815 - this.anInt1820;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray10, local28, local43);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean71 = true;
					}
					this.anInt1820 = (this.anInt1820 + local43) % 5000;
					try {
						if (this.anInt1820 == this.anInt1815) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(95) IOException local95) {
						this.aBoolean71 = true;
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
				} catch (@Pc(119) IOException local119) {
				}
				this.aByteArray10 = null;
				return;
			}
		} catch (@Pc(124) Exception local124) {
			Static5.method115(null, local124);
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)I")
	public int method1343() throws IOException {
		return this.aBoolean72 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)I")
	public int method1344() throws IOException {
		return this.aBoolean72 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III[B)V")
	public void method1345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean72) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 += local14;
			arg0 -= local14;
		}
	}
}
