import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!ke;")
	private Class43 aClass43_4;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	private int anInt1481 = 0;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt1488 = 0;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!ve;")
	private final Class81 aClass81_2;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ve;)V")
	public Class37(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class81 arg1) throws IOException {
		this.aClass81_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!jb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method877();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	public int method870() throws IOException {
		return this.aBoolean45 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt1481 == this.anInt1488) {
							if (this.aBoolean45) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt1481 > this.anInt1488) {
							local40 = 5000 - this.anInt1481;
						} else {
							local40 = this.anInt1488 - this.anInt1481;
						}
						local52 = this.anInt1481;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray13, local52, local40);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean46 = true;
					}
					this.anInt1481 = (this.anInt1481 + local40) % 5000;
					try {
						if (this.anInt1481 == this.anInt1488) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray13 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static117.method1885(null, local122);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBI[B)V")
	public void method873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean45) {
			return;
		}
		while (arg0 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 -= local18;
			arg1 += local18;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[B)V")
	public void method875(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean45) {
			return;
		}
		if (this.aBoolean46) {
			this.aBoolean46 = false;
			throw new IOException();
		}
		if (this.aByteArray13 == null) {
			this.aByteArray13 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray13[this.anInt1488] = arg1[local37];
				this.anInt1488 = (this.anInt1488 + 1) % 5000;
				if (this.anInt1488 == (this.anInt1481 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass43_4 == null) {
				this.aClass43_4 = this.aClass81_2.method1937(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
	public int method876() throws IOException {
		return this.aBoolean45 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
	public void method877() {
		if (this.aBoolean45) {
			return;
		}
		synchronized (this) {
			this.aBoolean45 = true;
			this.notifyAll();
		}
		if (this.aClass43_4 != null) {
			while (this.aClass43_4.anInt1565 == 0) {
				Static103.method1711(1L);
			}
			if (this.aClass43_4.anInt1565 == 1) {
				try {
					((Thread) this.aClass43_4.anObject2).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass43_4 = null;
	}
}
