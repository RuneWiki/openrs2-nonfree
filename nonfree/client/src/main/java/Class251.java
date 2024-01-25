import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class251 implements Runnable {

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!cq;")
	private Class43 aClass43_9;

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "Z")
	private boolean aBoolean588 = false;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
	private int anInt6841 = 0;

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "I")
	private int anInt6847 = 0;

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "Z")
	private boolean aBoolean589 = false;

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "Lclient!li;")
	private final Class143 aClass143_5;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!li;)V")
	public Class251(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class143 arg1) throws IOException {
		this.aClass143_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!uu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5345();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public void method5341() {
		if (!this.aBoolean588) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public void method5342() throws IOException {
		if (!this.aBoolean588 && this.aBoolean589) {
			this.aBoolean589 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([BIIB)V")
	public void method5344(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean588) {
			return;
		}
		if (this.aBoolean589) {
			this.aBoolean589 = false;
			throw new IOException();
		}
		if (this.aByteArray87 == null) {
			this.aByteArray87 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray87[this.anInt6847] = arg0[local38];
				this.anInt6847 = (this.anInt6847 + 1) % 5000;
				if ((this.anInt6841 + 4900) % 5000 == this.anInt6847) {
					throw new IOException();
				}
			}
			if (this.aClass43_9 == null) {
				this.aClass43_9 = this.aClass143_5.method3397(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	public void method5345() {
		if (this.aBoolean588) {
			return;
		}
		synchronized (this) {
			this.aBoolean588 = true;
			this.notifyAll();
		}
		if (this.aClass43_9 != null) {
			while (this.aClass43_9.anInt1521 == 0) {
				Static360.method4758(1L);
			}
			if (this.aClass43_9.anInt1521 == 1) {
				try {
					((Thread) this.aClass43_9.anObject3).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass43_9 = null;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II[BI)V")
	public void method5346(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean588) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg2 -= local19;
		}
	}

	@OriginalMember(owner = "client!uu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt6841 == this.anInt6847) {
							if (this.aBoolean588) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt6841 <= this.anInt6847) {
							local41 = this.anInt6847 - this.anInt6841;
						} else {
							local41 = 5000 - this.anInt6841;
						}
						local52 = this.anInt6841;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray87, local52, local41);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean589 = true;
					}
					this.anInt6841 = (local41 + this.anInt6841) % 5000;
					try {
						if (this.anInt6847 == this.anInt6841) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean589 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray87 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static324.method5974(local122, null);
		}
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)I")
	public int method5348() throws IOException {
		return this.aBoolean588 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)I")
	public int method5349() throws IOException {
		return this.aBoolean588 ? 0 : this.anInputStream1.read();
	}
}
