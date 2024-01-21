import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "Lclient!qe;")
	private Class82 aClass82_3;

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	private int anInt2226 = 0;

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
	private int anInt2231 = 0;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!vi;")
	private final Class99 aClass99_3;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vi;)V")
	public Class53(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class99 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass99_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public void method1713() {
		if (this.aBoolean107) {
			return;
		}
		synchronized (this) {
			this.aBoolean107 = true;
			this.notifyAll();
		}
		if (this.aClass82_3 != null) {
			while (this.aClass82_3.anInt3421 == 0) {
				Static75.method3577(1L);
			}
			if (this.aClass82_3.anInt3421 == 1) {
				try {
					((Thread) this.aClass82_3.anObject2).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass82_3 = null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
	public int method1716() throws IOException {
		return this.aBoolean107 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1713();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[BII)V")
	public void method1717(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean107) {
			return;
		}
		if (this.aBoolean106) {
			this.aBoolean106 = false;
			throw new IOException();
		}
		if (this.aByteArray21 == null) {
			this.aByteArray21 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(35) int local35 = 0; local35 < arg1; local35++) {
				this.aByteArray21[this.anInt2231] = arg0[local35];
				this.anInt2231 = (this.anInt2231 + 1) % 5000;
				if (this.anInt2231 == (this.anInt2226 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass82_3 == null) {
				this.aClass82_3 = this.aClass99_3.method3421(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I")
	public int method1718() throws IOException {
		return this.aBoolean107 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!jj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt2226 == this.anInt2231) {
							if (this.aBoolean107) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2226 > this.anInt2231) {
							local36 = 5000 - this.anInt2226;
						} else {
							local36 = this.anInt2231 - this.anInt2226;
						}
						local48 = this.anInt2226;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray21, local48, local36);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean106 = true;
					}
					this.anInt2226 = (local36 + this.anInt2226) % 5000;
					try {
						if (this.anInt2231 == this.anInt2226) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean106 = true;
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
				this.aByteArray21 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static151.method2591(null, local119);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIIB)V")
	public void method1719(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean107) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 -= local14;
			arg1 += local14;
		}
	}
}
