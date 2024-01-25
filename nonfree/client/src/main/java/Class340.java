import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class340 implements Runnable {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
	private int anInt8803 = 0;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
	private int anInt8807 = 0;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
	private final int anInt8801;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "[B")
	private final byte[] aByteArray91;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class340(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt8801 = arg1 + 1;
		this.aByteArray91 = new byte[this.anInt8801];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public void method7546() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II[BI)I")
	public int method7547(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg0 + arg2 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(51) int local51;
			if (this.anInt8807 < this.anInt8803) {
				local51 = this.anInt8807 + this.anInt8801 - this.anInt8803;
			} else {
				local51 = this.anInt8807 - this.anInt8803;
			}
			if (local51 < arg2) {
				arg2 = local51;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg2 + this.anInt8803 > this.anInt8801) {
				@Pc(92) int local92 = this.anInt8801 - this.anInt8803;
				Static693.method8320(this.aByteArray91, this.anInt8803, arg1, arg0, local92);
				Static693.method8320(this.aByteArray91, 0, arg1, arg0 + local92, -local92 + arg2);
			} else {
				Static693.method8320(this.aByteArray91, this.anInt8803, arg1, arg0, arg2);
			}
			this.anInt8803 = (arg2 + this.anInt8803) % this.anInt8801;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z")
	public boolean method7548(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt8801) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(39) int local39;
			if (this.anInt8803 > this.anInt8807) {
				local39 = this.anInt8801 + this.anInt8807 - this.anInt8803;
			} else {
				local39 = this.anInt8807 - this.anInt8803;
			}
			if (arg0 <= local39) {
				return true;
			} else if (this.anIOException2 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8803 == 0) {
						local34 = this.anInt8801 - this.anInt8807 - 1;
					} else if (this.anInt8803 <= this.anInt8807) {
						local34 = this.anInt8801 - this.anInt8807;
					} else {
						local34 = this.anInt8803 - this.anInt8807 - 1;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(69) InterruptedException local69) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray91, this.anInt8807, local34);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95) {
				@Pc(95) IOException local95x = local95;
				synchronized (this) {
					this.anIOException2 = local95x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8807 = (this.anInt8807 + local86) % this.anInt8801;
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	public void method7549() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(36) InterruptedException local36) {
		}
	}
}
