import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!va;")
	private Class64 aClass64_2;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	private int anInt777 = 0;

	@OriginalMember(owner = "client!fb", name = "H", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
	private int anInt793 = 0;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!jb;")
	private final Class32 aClass32_1;

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!jb;)V")
	public Class20(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class32 arg1) throws IOException {
		this.aClass32_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[BZI)V")
	public void method648(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean44) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg2 -= local19;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)I")
	public int method650() throws IOException {
		return this.aBoolean44 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI[B)V")
	public void method651(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean44) {
			return;
		}
		if (this.aBoolean46) {
			this.aBoolean46 = false;
			throw new IOException();
		}
		if (this.aByteArray8 == null) {
			this.aByteArray8 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray8[this.anInt777] = arg1[local32];
				this.anInt777 = (this.anInt777 + 1) % 5000;
				if ((this.anInt793 + 4900) % 5000 == this.anInt777) {
					throw new IOException();
				}
			}
			if (this.aClass64_2 == null) {
				this.aClass64_2 = this.aClass32_1.method952(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method656();
	}

	@OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(39) int local39;
					@Pc(50) int local50;
					synchronized (this) {
						if (this.anInt777 == this.anInt793) {
							if (this.aBoolean44) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt777 < this.anInt793) {
							local39 = 5000 - this.anInt793;
						} else {
							local39 = this.anInt777 - this.anInt793;
						}
						local50 = this.anInt793;
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray8, local50, local39);
					} catch (@Pc(70) IOException local70) {
						this.aBoolean46 = true;
					}
					this.anInt793 = (local39 + this.anInt793) % 5000;
					try {
						if (this.anInt777 == this.anInt793) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(95) IOException local95) {
						this.aBoolean46 = true;
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
				} catch (@Pc(119) IOException local119) {
				}
				this.aByteArray8 = null;
				return;
			}
		} catch (@Pc(124) Exception local124) {
			Static16.method293(null, local124);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)I")
	public int method655() throws IOException {
		return this.aBoolean44 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public void method656() {
		if (this.aBoolean44) {
			return;
		}
		synchronized (this) {
			this.aBoolean44 = true;
			this.notifyAll();
		}
		if (this.aClass64_2 != null) {
			while (this.aClass64_2.anInt2678 == 0) {
				Static41.method888(1L);
			}
			if (this.aClass64_2.anInt2678 == 1) {
				try {
					((Thread) this.aClass64_2.anObject6).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass64_2 = null;
	}
}
