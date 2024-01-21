import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!ef;")
	private Class22 aClass22_6;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	private int anInt1335 = 0;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	private int anInt1336 = 0;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!ba;")
	private final Class6 aClass6_2;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ba;)V")
	public Class37(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class6 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass6_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!jb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method948();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
	public int method947() throws IOException {
		return this.aBoolean49 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method948() {
		if (this.aBoolean49) {
			return;
		}
		synchronized (this) {
			this.aBoolean49 = true;
			this.notifyAll();
		}
		if (this.aClass22_6 != null) {
			while (this.aClass22_6.anInt864 == 0) {
				Static40.method822(1L);
			}
			if (this.aClass22_6.anInt864 == 1) {
				try {
					((Thread) this.aClass22_6.anObject2).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass22_6 = null;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
	public int method949() throws IOException {
		return this.aBoolean49 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BB)V")
	public void method953(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean49) {
			return;
		}
		if (this.aBoolean51) {
			this.aBoolean51 = false;
			throw new IOException();
		}
		if (this.aByteArray26 == null) {
			this.aByteArray26 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray26[this.anInt1336] = arg1[local32];
				this.anInt1336 = (this.anInt1336 + 1) % 5000;
				if ((this.anInt1335 + 4900) % 5000 == this.anInt1336) {
					throw new IOException();
				}
			}
			if (this.aClass22_6 == null) {
				this.aClass22_6 = this.aClass6_2.method122(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIII)V")
	public void method955(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean49) {
			return;
		}
		while (arg1 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg2 += local20;
			arg1 -= local20;
		}
	}

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt1335 == this.anInt1336) {
							if (this.aBoolean49) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1336 < this.anInt1335) {
							local40 = 5000 - this.anInt1335;
						} else {
							local40 = this.anInt1336 - this.anInt1335;
						}
						local52 = this.anInt1335;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray26, local52, local40);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean51 = true;
					}
					this.anInt1335 = (local40 + this.anInt1335) % 5000;
					try {
						if (this.anInt1336 == this.anInt1335) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean51 = true;
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
				this.aByteArray26 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static10.method172(null, local126);
		}
	}
}
