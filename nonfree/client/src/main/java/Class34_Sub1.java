import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "J")
	private long aLong29 = 0L;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "J")
	private long aLong30 = 0L;

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "J")
	private long aLong31 = 0L;

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
	private int anInt709 = 1;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
	private int anInt710 = 0;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.aLong29 = this.aLong30 = jagmisc.nanoTime();
		if (this.aLong30 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)J")
	@Override
	public long method5275() {
		return this.aLong30;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)I")
	@Override
	public int method5276(@OriginalArg(0) int arg0) {
		this.aLong30 += this.method663();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong30 < this.aLong29) {
			Static129.method2634((this.aLong29 - this.aLong30) / 1000000L);
			this.aLong31 += this.aLong29 - this.aLong30;
			this.aLong30 += this.aLong29 - this.aLong30;
			this.aLong29 += local17;
			return 1;
		}
		@Pc(64) int local64 = 0;
		do {
			local64++;
			this.aLong29 += local17;
		} while (local64 < 10 && this.aLong29 < this.aLong30);
		if (this.aLong30 > this.aLong29) {
			this.aLong29 = this.aLong30;
		}
		return local64;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
	@Override
	public void method5280() {
		if (this.aLong29 > this.aLong30) {
			this.aLong30 += this.aLong29 - this.aLong30;
		}
		this.aLong31 = 0L;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)J")
	private long method663() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong31;
		this.aLong31 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt710] = local7;
			this.anInt710 = (this.anInt710 + 1) % 10;
			if (this.anInt709 < 1) {
				this.anInt709++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt709; local56++) {
			local46 += this.aLongArray1[(this.anInt710 + 10 - local56) % 10];
		}
		return local46 / (long) this.anInt709;
	}
}
