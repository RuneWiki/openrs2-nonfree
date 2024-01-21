import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class13 implements Runnable {

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!gb;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	private int anInt484 = 0;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	private int anInt481 = 0;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!sb;")
	private final Class53 aClass53_1;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!sb;)V")
	public Class13(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class53 arg1) throws IOException {
		this.aClass53_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[B)V")
	public void method313(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean36) {
			return;
		}
		if (this.aBoolean35) {
			this.aBoolean35 = false;
			throw new IOException();
		}
		if (this.aByteArray15 == null) {
			this.aByteArray15 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray15[this.anInt484] = arg1[local32];
				this.anInt484 = (this.anInt484 + 1) % 5000;
				if (this.anInt484 == (this.anInt481 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass20_2 == null) {
				this.aClass20_2 = this.aClass53_1.method1628(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method316() {
		if (this.aBoolean36) {
			return;
		}
		synchronized (this) {
			this.aBoolean36 = true;
			this.notifyAll();
		}
		if (this.aClass20_2 != null) {
			while (this.aClass20_2.anInt1156 == 0) {
				Static34.method698(1L);
			}
			if (this.aClass20_2.anInt1156 == 1) {
				try {
					((Thread) this.aClass20_2.anObject4).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass20_2 = null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(III[B)V")
	public void method317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean36) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 += local19;
			arg0 -= local19;
		}
	}

	@OriginalMember(owner = "client!ce", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(48) int local48;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt484 == this.anInt481) {
							if (this.aBoolean36) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt481;
						if (this.anInt481 <= this.anInt484) {
							local48 = this.anInt484 - this.anInt481;
						} else {
							local48 = 5000 - this.anInt481;
						}
					}
					if (local48 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray15, local32, local48);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean35 = true;
					}
					this.anInt481 = (local48 + this.anInt481) % 5000;
					try {
						if (this.anInt481 == this.anInt484) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean35 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray15 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static30.method573(null, local123);
		}
	}

	@OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method316();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I")
	public int method321() throws IOException {
		return this.aBoolean36 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)I")
	public int method323() throws IOException {
		return this.aBoolean36 ? 0 : this.anInputStream1.available();
	}
}
