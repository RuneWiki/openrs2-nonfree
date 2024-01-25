import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class349 implements Runnable {

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "Lclient!bp;")
	private Class39 aClass39_6;

	@OriginalMember(owner = "client!vea", name = "q", descriptor = "[B")
	private byte[] aByteArray92;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
	private int anInt8772 = 0;

	@OriginalMember(owner = "client!vea", name = "m", descriptor = "Z")
	private boolean aBoolean672 = false;

	@OriginalMember(owner = "client!vea", name = "k", descriptor = "I")
	private int anInt8778 = 0;

	@OriginalMember(owner = "client!vea", name = "s", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "client!vea", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!vea", name = "v", descriptor = "Lclient!pi;")
	private final Class258 aClass258_5;

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vea", name = "y", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pi;)V")
	public Class349(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class258 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass258_5 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!vea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7313();
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)I")
	public int method7306() throws IOException {
		return this.aBoolean672 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I[BBI)V")
	public void method7307(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean672) {
			return;
		}
		if (this.aBoolean673) {
			this.aBoolean673 = false;
			throw new IOException();
		}
		if (this.aByteArray92 == null) {
			this.aByteArray92 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray92[this.anInt8778] = arg1[local32];
				this.anInt8778 = (this.anInt8778 + 1) % 5000;
				if ((this.anInt8772 + 4900) % 5000 == this.anInt8778) {
					throw new IOException();
				}
			}
			if (this.aClass39_6 == null) {
				this.aClass39_6 = this.aClass258_5.method5881(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
	public void method7308() {
		if (!this.aBoolean672) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II[BI)V")
	public void method7309(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean672) {
			return;
		}
		while (arg2 > 0) {
			@Pc(22) int local22 = this.anInputStream2.read(arg1, arg0, arg2);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg0 += local22;
			arg2 -= local22;
		}
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)I")
	public int method7310() throws IOException {
		return this.aBoolean672 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "(I)V")
	public void method7313() {
		if (this.aBoolean672) {
			return;
		}
		synchronized (this) {
			this.aBoolean672 = true;
			this.notifyAll();
		}
		if (this.aClass39_6 != null) {
			while (this.aClass39_6.anInt894 == 0) {
				Static589.method7892(1L);
			}
			if (this.aClass39_6.anInt894 == 1) {
				try {
					((Thread) this.aClass39_6.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass39_6 = null;
	}

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)V")
	public void method7314() throws IOException {
		if (!this.aBoolean672 && this.aBoolean673) {
			this.aBoolean673 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!vea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt8778 == this.anInt8772) {
							if (this.aBoolean672) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt8772;
						if (this.anInt8778 < this.anInt8772) {
							local43 = 5000 - this.anInt8772;
						} else {
							local43 = this.anInt8778 - this.anInt8772;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray92, local28, local43);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean673 = true;
					}
					this.anInt8772 = (local43 + this.anInt8772) % 5000;
					try {
						if (this.anInt8772 == this.anInt8778) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean673 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray92 = null;
				return;
			}
		} catch (@Pc(119) Exception local119) {
			Static172.method7826(local119, null);
		}
	}
}
