import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!nc;")
	private Class54 aClass54_1;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	private int anInt696 = 0;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	private int anInt700 = 0;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!kc;")
	private final Class43 aClass43_2;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!kc;)V")
	public Class17(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class43 arg1) throws IOException {
		this.aClass43_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method498();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BBII)V")
	public void method493(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean32) {
			return;
		}
		if (this.aBoolean33) {
			this.aBoolean33 = false;
			throw new IOException();
		}
		if (this.aByteArray8 == null) {
			this.aByteArray8 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray8[this.anInt700] = arg0[local32];
				this.anInt700 = (this.anInt700 + 1) % 5000;
				if (this.anInt700 == (this.anInt696 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass54_1 == null) {
				this.aClass54_1 = this.aClass43_2.method1093(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)I")
	public int method496() throws IOException {
		return this.aBoolean32 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public void method498() {
		if (this.aBoolean32) {
			return;
		}
		synchronized (this) {
			this.aBoolean32 = true;
			this.notifyAll();
		}
		if (this.aClass54_1 != null) {
			while (this.aClass54_1.anInt2077 == 0) {
				Static68.method1266(1L);
			}
			if (this.aClass54_1.anInt2077 == 1) {
				try {
					((Thread) this.aClass54_1.anObject2).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass54_1 = null;
	}

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt700 == this.anInt696) {
							if (this.aBoolean32) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt696;
						if (this.anInt700 < this.anInt696) {
							local43 = 5000 - this.anInt696;
						} else {
							local43 = this.anInt700 - this.anInt696;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray8, local28, local43);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean33 = true;
					}
					this.anInt696 = (local43 + this.anInt696) % 5000;
					try {
						if (this.anInt696 == this.anInt700) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean33 = true;
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
				this.aByteArray8 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static61.method1200(null, local122);
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I")
	public int method499() throws IOException {
		return this.aBoolean32 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[BI)V")
	public void method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		if (this.aBoolean32) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 += local18;
			arg1 -= local18;
		}
	}
}
