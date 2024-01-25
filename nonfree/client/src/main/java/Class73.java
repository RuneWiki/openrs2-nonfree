import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class73 implements Runnable {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!it;")
	private Class122 aClass122_2;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	private int anInt2291 = 0;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
	private int anInt2293 = 0;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!qn;")
	private final Class209 aClass209_35;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class267("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qn;)V")
	public Class73(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class209 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass209_35 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	public int method1872() throws IOException {
		return this.aBoolean157 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BZI)V")
	public void method1873(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean157) {
			return;
		}
		if (this.aBoolean156) {
			this.aBoolean156 = false;
			throw new IOException();
		}
		if (this.aByteArray30 == null) {
			this.aByteArray30 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray30[this.anInt2293] = arg1[local38];
				this.anInt2293 = (this.anInt2293 + 1) % 5000;
				if ((this.anInt2291 + 4900) % 5000 == this.anInt2293) {
					throw new IOException();
				}
			}
			if (this.aClass122_2 == null) {
				this.aClass122_2 = this.aClass209_35.method4687(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	public int method1874() throws IOException {
		return this.aBoolean157 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt2291 == this.anInt2293) {
							if (this.aBoolean157) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt2291;
						if (this.anInt2291 <= this.anInt2293) {
							local44 = this.anInt2293 - this.anInt2291;
						} else {
							local44 = 5000 - this.anInt2291;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray30, local32, local44);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean156 = true;
					}
					this.anInt2291 = (local44 + this.anInt2291) % 5000;
					try {
						if (this.anInt2293 == this.anInt2291) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean156 = true;
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
				this.aByteArray30 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static390.method5741(local126, null);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public void method1875() {
		if (this.aBoolean157) {
			return;
		}
		synchronized (this) {
			this.aBoolean157 = true;
			this.notifyAll();
		}
		if (this.aClass122_2 != null) {
			while (this.aClass122_2.anInt3557 == 0) {
				Static88.method4161(1L);
			}
			if (this.aClass122_2.anInt3557 == 1) {
				try {
					((Thread) this.aClass122_2.anObject7).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass122_2 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB[BI)V")
	public void method1877(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean157) {
			return;
		}
		while (arg0 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg2 += local23;
			arg0 -= local23;
		}
	}

	@OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1875();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public void method1879() {
		if (!this.aBoolean157) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public void method1880() throws IOException {
		if (!this.aBoolean157 && this.aBoolean156) {
			this.aBoolean156 = false;
			throw new IOException();
		}
	}
}
