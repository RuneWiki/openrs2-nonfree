import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class194 implements Runnable {

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "Lclient!hma;")
	private Class163 aClass163_3;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
	private int anInt4562 = 0;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
	private int anInt4567 = 0;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!vo;")
	private final Class389 aClass389_5;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
	private final int anInt4566;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vo;I)V")
	public Class194(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class389 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass389_5 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt4566 = arg2;
	}

	@OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4169();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public void method4164(@OriginalArg(0) int arg0) {
		if (arg0 < 4) {
			Static296.method4166(-80, -123, -99, (Class202) null, -75);
		}
		if (!this.aBoolean398) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
	public int method4167() throws IOException {
		return this.aBoolean398 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)I")
	public int method4168() throws IOException {
		return this.aBoolean398 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(48) int local48;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt4562 == this.anInt4567) {
							if (this.aBoolean398) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt4562;
						if (this.anInt4567 >= this.anInt4562) {
							local48 = this.anInt4567 - this.anInt4562;
						} else {
							local48 = this.anInt4566 - this.anInt4562;
						}
					}
					if (local48 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray62, local32, local48);
					} catch (@Pc(79) IOException local79) {
						this.aBoolean397 = true;
					}
					this.anInt4562 = (this.anInt4562 + local48) % this.anInt4566;
					try {
						if (this.anInt4562 == this.anInt4567) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(105) IOException local105) {
						this.aBoolean397 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(133) IOException local133) {
				}
				this.aByteArray62 = null;
				return;
			}
		} catch (@Pc(138) Exception local138) {
			Static329.method4572((String) null, local138);
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
	public void method4169() {
		if (this.aBoolean398) {
			return;
		}
		synchronized (this) {
			this.aBoolean398 = true;
			this.notifyAll();
		}
		if (this.aClass163_3 != null) {
			while (this.aClass163_3.anInt3843 == 0) {
				Static570.method7907(1L);
			}
			if (this.aClass163_3.anInt3843 == 1) {
				try {
					((Thread) this.aClass163_3.anObject5).join();
				} catch (@Pc(67) InterruptedException local67) {
				}
			}
		}
		this.aClass163_3 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public void method4171() throws IOException {
		if (!this.aBoolean398 && this.aBoolean397) {
			this.aBoolean397 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[BII)V")
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean398) {
			return;
		}
		if (this.aBoolean397) {
			this.aBoolean397 = false;
			throw new IOException();
		}
		if (this.aByteArray62 == null) {
			this.aByteArray62 = new byte[this.anInt4566];
		}
		synchronized (this) {
			for (@Pc(44) int local44 = 0; local44 < arg0; local44++) {
				this.aByteArray62[this.anInt4567] = arg1[local44];
				this.anInt4567 = (this.anInt4567 + 1) % this.anInt4566;
				if (this.anInt4567 == (this.anInt4566 + this.anInt4562 - 100) % this.anInt4566) {
					throw new IOException();
				}
			}
			if (this.aClass163_3 == null) {
				this.aClass163_3 = this.aClass389_5.method9276(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ[BI)V")
	public void method4174(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean398) {
			return;
		}
		while (arg2 > 0) {
			@Pc(17) int local17 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local17 <= 0) {
				throw new EOFException();
			}
			arg0 += local17;
			arg2 -= local17;
		}
		if (false) {
			this.method4164(-48);
		}
	}
}
