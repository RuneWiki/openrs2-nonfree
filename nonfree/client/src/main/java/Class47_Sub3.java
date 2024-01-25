import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class47_Sub3 extends Class47 {

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "J")
	private long aLong254 = 0L;

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "J")
	private long aLong255 = 0L;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
	private int anInt9891 = 1;

	@OriginalMember(owner = "client!vca", name = "m", descriptor = "[J")
	private final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	private int anInt9890 = 0;

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "J")
	private long aLong256 = 0L;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
	public Class47_Sub3() {
		this.aLong254 = this.aLong255 = jagmisc.nanoTime();
		if (this.aLong255 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)J")
	private long method8507() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong256;
		this.aLong256 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray16[this.anInt9890] = local7;
			this.anInt9890 = (this.anInt9890 + 1) % 10;
			if (this.anInt9891 < 1) {
				this.anInt9891++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt9891; local53++) {
			local46 += this.aLongArray16[(this.anInt9890 + 10 - local53) % 10];
		}
		return local46 / (long) this.anInt9891;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)J")
	@Override
	public long method8504() {
		return this.aLong255;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	@Override
	public void method8500() {
		this.aLong256 = 0L;
		if (this.aLong255 < this.aLong254) {
			this.aLong255 += this.aLong254 - this.aLong255;
		}
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)J")
	@Override
	protected long method8501() {
		this.aLong255 += this.method8507();
		return this.aLong255 < this.aLong254 ? (this.aLong254 - this.aLong255) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(JB)I")
	@Override
	protected int method8503(@OriginalArg(0) long arg0) {
		if (this.aLong254 > this.aLong255) {
			this.aLong256 += this.aLong254 - this.aLong255;
			this.aLong255 += this.aLong254 - this.aLong255;
			this.aLong254 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			this.aLong254 += arg0;
			local17++;
		} while (local17 < 10 && this.aLong255 > this.aLong254);
		if (this.aLong254 < this.aLong255) {
			this.aLong254 = this.aLong255;
		}
		return local17;
	}
}
