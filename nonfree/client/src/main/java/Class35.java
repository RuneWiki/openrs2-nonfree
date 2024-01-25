import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class35 implements Runnable {

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
	private int anInt717 = 0;

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
	private int anInt723 = 0;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
	private final int anInt715;

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!bea", name = "p", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class35(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt715 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray2 = new byte[this.anInt715];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
	public void method683() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z")
	public boolean method685(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt715) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt717 < this.anInt723) {
				local46 = this.anInt715 + this.anInt717 - this.anInt723;
			} else {
				local46 = this.anInt717 - this.anInt723;
			}
			if (arg0 <= local46) {
				return true;
			} else if (this.anIOException1 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	public void method686() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(36) InterruptedException local36) {
		}
	}

	@OriginalMember(owner = "client!bea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(44) int local44;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt723 == 0) {
						local44 = this.anInt715 - this.anInt717 - 1;
					} else if (this.anInt723 > this.anInt717) {
						local44 = this.anInt723 - this.anInt717 - 1;
					} else {
						local44 = this.anInt715 - this.anInt717;
					}
					if (local44 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			@Pc(87) int local87;
			try {
				local87 = this.anInputStream1.read(this.aByteArray2, this.anInt717, local44);
				if (local87 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(96) IOException local96) {
				@Pc(96) IOException local96x = local96;
				synchronized (this) {
					this.anIOException1 = local96x;
					return;
				}
			}
			synchronized (this) {
				this.anInt717 = (this.anInt717 + local87) % this.anInt715;
			}
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([BIII)I")
	public int method689(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(47) int local47;
			if (this.anInt717 >= this.anInt723) {
				local47 = this.anInt717 - this.anInt723;
			} else {
				local47 = this.anInt715 + this.anInt717 - this.anInt723;
			}
			if (local47 < arg1) {
				arg1 = local47;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg1 + this.anInt723 > this.anInt715) {
				@Pc(101) int local101 = this.anInt715 - this.anInt723;
				Static682.method799(this.aByteArray2, this.anInt723, arg0, arg2, local101);
				Static682.method799(this.aByteArray2, 0, arg0, arg2 + local101, arg1 + -local101);
			} else {
				Static682.method799(this.aByteArray2, this.anInt723, arg0, arg2, arg1);
			}
			this.anInt723 = (this.anInt723 + arg1) % this.anInt715;
			this.notifyAll();
			return arg1;
		}
	}
}
