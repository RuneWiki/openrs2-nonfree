import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class326 implements Runnable {

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	private int anInt8263 = 0;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	private int anInt8264 = 0;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	private final int anInt8268;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "[B")
	private final byte[] aByteArray90;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class326(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt8268 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray90 = new byte[this.anInt8268];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZII[B)I")
	public int method6865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt8263 > this.anInt8264) {
				local46 = this.anInt8264 + this.anInt8268 - this.anInt8263;
			} else {
				local46 = this.anInt8264 - this.anInt8263;
			}
			if (local46 < arg1) {
				arg1 = local46;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg1 + this.anInt8263 <= this.anInt8268) {
				Static601.method2816(this.aByteArray90, this.anInt8263, arg2, arg0, arg1);
			} else {
				@Pc(103) int local103 = this.anInt8268 - this.anInt8263;
				Static601.method2816(this.aByteArray90, this.anInt8263, arg2, arg0, local103);
				Static601.method2816(this.aByteArray90, 0, arg2, local103 + arg0, -local103 + arg1);
			}
			this.anInt8263 = (this.anInt8263 + arg1) % this.anInt8268;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
	public boolean method6866(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt8268) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(33) int local33;
			if (this.anInt8263 > this.anInt8264) {
				local33 = this.anInt8264 + this.anInt8268 - this.anInt8263;
			} else {
				local33 = this.anInt8264 - this.anInt8263;
			}
			if (local33 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public void method6868() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!ti", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8263 == 0) {
						local30 = this.anInt8268 - this.anInt8264 - 1;
					} else if (this.anInt8264 > this.anInt8263) {
						local30 = this.anInt8268 - this.anInt8264;
					} else {
						local30 = this.anInt8263 - this.anInt8264 - 1;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(59) InterruptedException local59) {
					}
				}
			}
			@Pc(76) int local76;
			try {
				local76 = this.anInputStream1.read(this.aByteArray90, this.anInt8264, local30);
				if (local76 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException2 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8264 = (local76 + this.anInt8264) % this.anInt8268;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	public void method6870() {
		this.anInputStream1 = new InputStream_Sub2();
	}
}
