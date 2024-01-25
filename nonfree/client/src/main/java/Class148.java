import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class148 implements Runnable {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!ph;")
	private Class162 aClass162_7;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "I")
	private int anInt4583 = 0;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	private int anInt4592 = 0;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!nh;")
	private final Class143 aClass143_4;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!nh;)V")
	public Class148(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class143 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass143_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public void method4119() {
		if (!this.aBoolean432) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public void method4120() throws IOException {
		if (!this.aBoolean432 && this.aBoolean433) {
			this.aBoolean433 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BII[B)V")
	public void method4122(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean432) {
			return;
		}
		if (this.aBoolean433) {
			this.aBoolean433 = false;
			throw new IOException();
		}
		if (this.aByteArray76 == null) {
			this.aByteArray76 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray76[this.anInt4592] = arg1[local38];
				this.anInt4592 = (this.anInt4592 + 1) % 5000;
				if ((this.anInt4583 + 4900) % 5000 == this.anInt4592) {
					throw new IOException();
				}
			}
			if (this.aClass162_7 == null) {
				this.aClass162_7 = this.aClass143_4.method3908(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4123();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public void method4123() {
		if (this.aBoolean432) {
			return;
		}
		synchronized (this) {
			this.aBoolean432 = true;
			this.notifyAll();
		}
		if (this.aClass162_7 != null) {
			while (this.aClass162_7.anInt4801 == 0) {
				Static190.method3690(1L);
			}
			if (this.aClass162_7.anInt4801 == 1) {
				try {
					((Thread) this.aClass162_7.anObject5).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass162_7 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III[B)V")
	public void method4124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean432) {
			return;
		}
		while (arg1 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg1 -= local20;
			arg0 += local20;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)I")
	public int method4125() throws IOException {
		return this.aBoolean432 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
	public int method4127() throws IOException {
		return this.aBoolean432 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt4592 == this.anInt4583) {
							if (this.aBoolean432) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt4583;
						if (this.anInt4583 > this.anInt4592) {
							local35 = 5000 - this.anInt4583;
						} else {
							local35 = this.anInt4592 - this.anInt4583;
						}
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray76, local24, local35);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean433 = true;
					}
					this.anInt4583 = (this.anInt4583 + local35) % 5000;
					try {
						if (this.anInt4583 == this.anInt4592) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean433 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray76 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static109.method2355(null, local114);
		}
	}
}
