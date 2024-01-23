import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class105 implements Runnable {

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!eg;")
	private Class33 aClass33_17;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private int anInt4656 = 0;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private int anInt4653 = 0;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!gj;")
	private Class41 aClass41_4;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gj;)V")
	public Class105(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class41 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass41_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I")
	public int method3690() throws IOException {
		return this.aBoolean199 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt4656 == this.anInt4653) {
							if (this.aBoolean199) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt4656;
						if (this.anInt4653 >= this.anInt4656) {
							local40 = this.anInt4653 - this.anInt4656;
						} else {
							local40 = 5000 - this.anInt4656;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray54, local28, local40);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean198 = true;
					}
					this.anInt4656 = (this.anInt4656 + local40) % 5000;
					try {
						if (this.anInt4656 == this.anInt4653) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(88) IOException local88) {
						this.aBoolean198 = true;
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
				} catch (@Pc(112) IOException local112) {
				}
				this.aByteArray54 = null;
				break;
			}
		} catch (@Pc(117) Exception local117) {
			Static139.method2127(local117, null);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[BI)V")
	public void method3692(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean199) {
			return;
		}
		if (this.aBoolean198) {
			this.aBoolean198 = false;
			throw new IOException();
		}
		if (this.aByteArray54 == null) {
			this.aByteArray54 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				this.aByteArray54[this.anInt4653] = arg0[local30];
				this.anInt4653 = (this.anInt4653 + 1) % 5000;
				if ((this.anInt4656 + 4900) % 5000 == this.anInt4653) {
					throw new IOException();
				}
			}
			if (this.aClass33_17 == null) {
				this.aClass33_17 = this.aClass41_4.method1259(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II[BI)V")
	public void method3694(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean199) {
			return;
		}
		while (arg0 > 0) {
			@Pc(25) int local25 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local25 <= 0) {
				throw new EOFException();
			}
			arg2 += local25;
			arg0 -= local25;
		}
	}

	@OriginalMember(owner = "client!vb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3695();
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public void method3695() {
		if (this.aBoolean199) {
			return;
		}
		synchronized (this) {
			this.aBoolean199 = true;
			this.notifyAll();
		}
		if (this.aClass33_17 != null) {
			while (this.aClass33_17.anInt947 == 0) {
				Static156.method2805(1L);
			}
			if (this.aClass33_17.anInt947 == 1) {
				try {
					((Thread) this.aClass33_17.anObject2).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass33_17 = null;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
	public int method3699() throws IOException {
		return this.aBoolean199 ? 0 : this.anInputStream1.read();
	}
}
