import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class109 implements Runnable {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "[B")
	private byte[] aByteArray46;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!vj;")
	private Class145 aClass145_7;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	private int anInt4185 = 0;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
	private int anInt4194 = 0;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!d;")
	private Class28 aClass28_6;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!d;)V")
	public Class109(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class28 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass28_6 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3141();
	}

	@OriginalMember(owner = "client!pl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(51) int local51;
					synchronized (this) {
						if (this.anInt4194 == this.anInt4185) {
							if (this.aBoolean203) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt4185 >= this.anInt4194) {
							local40 = this.anInt4185 - this.anInt4194;
						} else {
							local40 = 5000 - this.anInt4194;
						}
						local51 = this.anInt4194;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray46, local51, local40);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean204 = true;
					}
					this.anInt4194 = (this.anInt4194 + local40) % 5000;
					try {
						if (this.anInt4185 == this.anInt4194) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean204 = true;
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
				this.aByteArray46 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static57.method1101(null, local126);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public void method3141() {
		if (this.aBoolean203) {
			return;
		}
		synchronized (this) {
			this.aBoolean203 = true;
			this.notifyAll();
		}
		if (this.aClass145_7 != null) {
			while (this.aClass145_7.anInt5354 == 0) {
				Static30.method587(1L);
			}
			if (this.aClass145_7.anInt5354 == 1) {
				try {
					((Thread) this.aClass145_7.anObject7).join();
				} catch (@Pc(63) InterruptedException local63) {
				}
			}
		}
		this.aClass145_7 = null;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
	public int method3142() throws IOException {
		return this.aBoolean203 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)I")
	public int method3143() throws IOException {
		return this.aBoolean203 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
	public void method3145() throws IOException {
		if (!this.aBoolean203 && this.aBoolean204) {
			this.aBoolean204 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[BIZ)V")
	public void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean203) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 += local14;
			arg0 -= local14;
		}
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
	public void method3147() {
		if (!this.aBoolean203) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BIII)V")
	public void method3150(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean203) {
			return;
		}
		if (this.aBoolean204) {
			this.aBoolean204 = false;
			throw new IOException();
		}
		if (this.aByteArray46 == null) {
			this.aByteArray46 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray46[this.anInt4185] = arg0[local32];
				this.anInt4185 = (this.anInt4185 + 1) % 5000;
				if (this.anInt4185 == (this.anInt4194 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass145_7 == null) {
				this.aClass145_7 = this.aClass28_6.method719(this, 3);
			}
			this.notifyAll();
		}
	}
}
