import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class156 implements Runnable {

	@OriginalMember(owner = "client!it", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	private int anInt4833 = 0;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "I")
	private int anInt4843 = 0;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	private final int anInt4835;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class156(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt4835 = arg1 + 1;
		this.aByteArray38 = new byte[this.anInt4835];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!it", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4833 == 0) {
						local35 = this.anInt4835 - this.anInt4843 - 1;
					} else if (this.anInt4833 >= this.anInt4843) {
						local35 = this.anInt4833 - this.anInt4843 - 1;
					} else {
						local35 = this.anInt4835 - this.anInt4843;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(63) InterruptedException local63) {
					}
				}
			}
			@Pc(80) int local80;
			try {
				local80 = this.anInputStream2.read(this.aByteArray38, this.anInt4843, local35);
				if (local80 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(88) IOException local88) {
				@Pc(88) IOException local88x = local88;
				synchronized (this) {
					this.anIOException1 = local88x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4843 = (this.anInt4843 + local80) % this.anInt4835;
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public void method3713() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public void method3714() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III[B)I")
	public int method3715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg2.length < arg0 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(43) int local43;
			if (this.anInt4843 >= this.anInt4833) {
				local43 = this.anInt4843 - this.anInt4833;
			} else {
				local43 = this.anInt4835 + this.anInt4843 - this.anInt4833;
			}
			if (local43 < arg0) {
				arg0 = local43;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt4833 + arg0 <= this.anInt4835) {
				Static599.method3060(this.aByteArray38, this.anInt4833, arg2, arg1, arg0);
			} else {
				@Pc(100) int local100 = this.anInt4835 - this.anInt4833;
				Static599.method3060(this.aByteArray38, this.anInt4833, arg2, arg1, local100);
				Static599.method3060(this.aByteArray38, 0, arg2, arg1 + local100, arg0 - local100);
			}
			this.anInt4833 = (arg0 + this.anInt4833) % this.anInt4835;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)Z")
	public boolean method3716(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt4835 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt4833 <= this.anInt4843) {
				local45 = this.anInt4843 - this.anInt4833;
			} else {
				local45 = this.anInt4843 + this.anInt4835 - this.anInt4833;
			}
			if (local45 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}
}
