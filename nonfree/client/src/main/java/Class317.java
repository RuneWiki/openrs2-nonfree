import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class317 implements Runnable {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	private int anInt9175 = 0;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
	private int anInt9180 = 0;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	private final int anInt9178;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[B")
	private final byte[] aByteArray93;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class317(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt9178 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray93 = new byte[this.anInt9178];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method7736() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)Z")
	public boolean method7737(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt9178) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt9175 >= this.anInt9180) {
				local41 = this.anInt9175 - this.anInt9180;
			} else {
				local41 = this.anInt9175 + this.anInt9178 - this.anInt9180;
			}
			if (arg0 <= local41) {
				return true;
			} else if (this.anIOException1 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public void method7738() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(36) InterruptedException local36) {
		}
	}

	@OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(38) int local38;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt9180 == 0) {
						local38 = this.anInt9178 - this.anInt9175 - 1;
					} else if (this.anInt9180 > this.anInt9175) {
						local38 = this.anInt9180 - this.anInt9175 - 1;
					} else {
						local38 = this.anInt9178 - this.anInt9175;
					}
					if (local38 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(68) InterruptedException local68) {
					}
				}
			}
			@Pc(85) int local85;
			try {
				local85 = this.anInputStream1.read(this.aByteArray93, this.anInt9175, local38);
				if (local85 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95) {
				@Pc(95) IOException local95x = local95;
				synchronized (this) {
					this.anIOException1 = local95x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9175 = (local85 + this.anInt9175) % this.anInt9178;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[BI)I")
	public int method7739(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg2 + arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(51) int local51;
			if (this.anInt9180 > this.anInt9175) {
				local51 = this.anInt9178 + this.anInt9175 - this.anInt9180;
			} else {
				local51 = this.anInt9175 - this.anInt9180;
			}
			if (local51 < arg2) {
				arg2 = local51;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt9180 <= this.anInt9178) {
				Static735.method9185(this.aByteArray93, this.anInt9180, arg1, arg0, arg2);
			} else {
				@Pc(108) int local108 = this.anInt9178 - this.anInt9180;
				Static735.method9185(this.aByteArray93, this.anInt9180, arg1, arg0, local108);
				Static735.method9185(this.aByteArray93, 0, arg1, local108 + arg0, arg2 + -local108);
			}
			this.anInt9180 = (arg2 + this.anInt9180) % this.anInt9178;
			this.notifyAll();
			return arg2;
		}
	}
}
