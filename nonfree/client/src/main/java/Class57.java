import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class57 implements Runnable {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!nc;")
	private Class65 aClass65_6;

	@OriginalMember(owner = "client!le", name = "r", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	private int anInt2411 = 0;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	private int anInt2417 = 0;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "Lclient!d;")
	private final Class24 aClass24_3;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!d;)V")
	public Class57(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class24 arg1) throws IOException {
		this.aClass24_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
	public int method1668() throws IOException {
		return this.aBoolean142 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt2417 == this.anInt2411) {
							if (this.aBoolean142) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2411 < this.anInt2417) {
							local36 = 5000 - this.anInt2417;
						} else {
							local36 = this.anInt2411 - this.anInt2417;
						}
						local48 = this.anInt2417;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray15, local48, local36);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean143 = true;
					}
					this.anInt2417 = (local36 + this.anInt2417) % 5000;
					try {
						if (this.anInt2411 == this.anInt2417) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean143 = true;
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
				this.aByteArray15 = null;
				break;
			}
		} catch (@Pc(122) Exception local122) {
			Static61.method998(local122, null);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI[BI)V")
	public void method1671(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean142) {
			return;
		}
		while (arg2 > 0) {
			@Pc(26) int local26 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local26 <= 0) {
				throw new EOFException();
			}
			arg0 += local26;
			arg2 -= local26;
		}
	}

	@OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1672();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public void method1672() {
		if (this.aBoolean142) {
			return;
		}
		synchronized (this) {
			this.aBoolean142 = true;
			this.notifyAll();
		}
		if (this.aClass65_6 != null) {
			while (this.aClass65_6.anInt2681 == 0) {
				Static199.method3292(1L);
			}
			if (this.aClass65_6.anInt2681 == 1) {
				try {
					((Thread) this.aClass65_6.anObject3).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass65_6 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[BI)V")
	public void method1673(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean142) {
			return;
		}
		if (this.aBoolean143) {
			this.aBoolean143 = false;
			throw new IOException();
		}
		if (this.aByteArray15 == null) {
			this.aByteArray15 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray15[this.anInt2411] = arg0[local32];
				this.anInt2411 = (this.anInt2411 + 1) % 5000;
				if ((this.anInt2417 + 4900) % 5000 == this.anInt2411) {
					throw new IOException();
				}
			}
			if (this.aClass65_6 == null) {
				this.aClass65_6 = this.aClass24_3.method560(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I")
	public int method1674() throws IOException {
		return this.aBoolean142 ? 0 : this.anInputStream1.available();
	}
}
