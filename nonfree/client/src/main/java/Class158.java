import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class158 implements Runnable {

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Lclient!mq;")
	private Class134 aClass134_8;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
	private int anInt4777 = 0;

	@OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
	private int anInt4784 = 0;

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "Z")
	private boolean aBoolean400 = false;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Lclient!kq;")
	private final Class110 aClass110_9;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!kq;)V")
	public Class158(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class110 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass110_9 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II[BI)V")
	public void method4325(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean400) {
			return;
		}
		if (this.aBoolean399) {
			this.aBoolean399 = false;
			throw new IOException();
		}
		if (this.aByteArray78 == null) {
			this.aByteArray78 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray78[this.anInt4777] = arg0[local32];
				this.anInt4777 = (this.anInt4777 + 1) % 5000;
				if (this.anInt4777 == (this.anInt4784 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass134_8 == null) {
				this.aClass134_8 = this.aClass110_9.method3379(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)I")
	public int method4326() throws IOException {
		return this.aBoolean400 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!pr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4339();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[BII)V")
	public void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean400) {
			return;
		}
		while (arg0 > 0) {
			@Pc(24) int local24 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg0 -= local24;
			arg2 += local24;
		}
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
	public void method4334() throws IOException {
		if (!this.aBoolean400 && this.aBoolean399) {
			this.aBoolean399 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
	public void method4336() {
		if (!this.aBoolean400) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)I")
	public int method4337() throws IOException {
		return this.aBoolean400 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "(I)V")
	public void method4339() {
		if (this.aBoolean400) {
			return;
		}
		synchronized (this) {
			this.aBoolean400 = true;
			this.notifyAll();
		}
		if (this.aClass134_8 != null) {
			while (this.aClass134_8.anInt4033 == 0) {
				Static134.method2598(1L);
			}
			if (this.aClass134_8.anInt4033 == 1) {
				try {
					((Thread) this.aClass134_8.anObject6).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass134_8 = null;
	}

	@OriginalMember(owner = "client!pr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt4784 == this.anInt4777) {
							if (this.aBoolean400) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt4784;
						if (this.anInt4777 >= this.anInt4784) {
							local44 = this.anInt4777 - this.anInt4784;
						} else {
							local44 = 5000 - this.anInt4784;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray78, local28, local44);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean399 = true;
					}
					this.anInt4784 = (this.anInt4784 + local44) % 5000;
					try {
						if (this.anInt4784 == this.anInt4777) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean399 = true;
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
				this.aByteArray78 = null;
				return;
			}
		} catch (@Pc(127) Exception local127) {
			Static152.method2899(null, local127);
		}
	}
}
