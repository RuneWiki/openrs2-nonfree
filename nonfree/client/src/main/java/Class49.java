import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class49 implements Runnable {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!sc;")
	private Class153 aClass153_4;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	private int anInt1459 = 0;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	private int anInt1465 = 0;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!uo;")
	private Class176 aClass176_2;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!uo;)V")
	public Class49(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class176 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass176_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(36) int var1;
				@Pc(48) int var2;
				label87: {
					synchronized (this) {
						label88: {
							if (this.anInt1459 == this.anInt1465) {
								if (this.aBoolean142) {
									break label88;
								}
								try {
									this.wait();
								} catch (@Pc(25) InterruptedException local25) {
								}
							}
							if (this.anInt1459 > this.anInt1465) {
								var1 = 5000 - this.anInt1459;
							} else {
								var1 = this.anInt1465 - this.anInt1459;
							}
							var2 = this.anInt1459;
							break label87;
						}
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
					} catch (@Pc(119) IOException local119) {
					}
					this.aByteArray52 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray52, var2, var1);
					} catch (@Pc(70) IOException local70) {
						this.aBoolean143 = true;
					}
					this.anInt1459 = (this.anInt1459 + var1) % 5000;
					try {
						if (this.anInt1465 == this.anInt1459) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean143 = true;
					}
				}
			}
		} catch (@Pc(124) Exception local124) {
			Static6.method4140(local124, null);
		}
	}

	@OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1307();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I")
	public int method1300() throws IOException {
		return this.aBoolean142 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	public int method1301() throws IOException {
		return this.aBoolean142 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[BIB)V")
	public void method1302(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean142) {
			return;
		}
		if (this.aBoolean143) {
			this.aBoolean143 = false;
			throw new IOException();
		}
		if (this.aByteArray52 == null) {
			this.aByteArray52 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				this.aByteArray52[this.anInt1465] = arg0[local33];
				this.anInt1465 = (this.anInt1465 + 1) % 5000;
				if ((this.anInt1459 + 4900) % 5000 == this.anInt1465) {
					throw new IOException();
				}
			}
			if (this.aClass153_4 == null) {
				this.aClass153_4 = this.aClass176_2.method4373(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[BBI)V")
	public void method1303(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean142) {
			return;
		}
		while (arg2 > 0) {
			@Pc(28) int local28 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local28 <= 0) {
				throw new EOFException();
			}
			arg2 -= local28;
			arg0 += local28;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public void method1304() throws IOException {
		if (!this.aBoolean142 && this.aBoolean143) {
			this.aBoolean143 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public void method1305() {
		if (!this.aBoolean142) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public void method1307() {
		if (this.aBoolean142) {
			return;
		}
		synchronized (this) {
			this.aBoolean142 = true;
			this.notifyAll();
		}
		if (this.aClass153_4 != null) {
			while (this.aClass153_4.anInt4614 == 0) {
				Static16.method242(1L);
			}
			if (this.aClass153_4.anInt4614 == 1) {
				try {
					((Thread) this.aClass153_4.anObject6).join();
				} catch (@Pc(62) InterruptedException local62) {
				}
			}
		}
		this.aClass153_4 = null;
	}
}
