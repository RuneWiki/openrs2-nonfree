import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "J")
	private long aLong31 = 0L;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "J")
	private long aLong32 = 0L;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	private int anInt1075 = 1;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	private int anInt1076 = 0;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "J")
	private long aLong33 = 0L;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class3_Sub2() {
		this.aLong32 = this.aLong31 = jagmisc.nanoTime();
		if (this.aLong31 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)J")
	@Override
	public long method6619() {
		return this.aLong31;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method6617(@OriginalArg(1) long arg0) {
		if (this.aLong32 > this.aLong31) {
			this.aLong33 += this.aLong32 - this.aLong31;
			this.aLong31 += this.aLong32 - this.aLong31;
			this.aLong32 += arg0;
			return 1;
		}
		@Pc(47) int local47 = 0;
		do {
			this.aLong32 += arg0;
			local47++;
		} while (local47 < 10 && this.aLong31 > this.aLong32);
		if (this.aLong31 > this.aLong32) {
			this.aLong32 = this.aLong31;
		}
		return local47;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)J")
	@Override
	protected long method6622() {
		this.aLong31 += this.method1018();
		return this.aLong31 < this.aLong32 ? (this.aLong32 - this.aLong31) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)V")
	@Override
	public void method6623() {
		if (this.aLong32 > this.aLong31) {
			this.aLong31 += this.aLong32 - this.aLong31;
		}
		this.aLong33 = 0L;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)J")
	private long method1018() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong33;
		this.aLong33 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray3[this.anInt1076] = local7;
			this.anInt1076 = (this.anInt1076 + 1) % 10;
			if (this.anInt1075 < 1) {
				this.anInt1075++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt1075; local52++) {
			local50 += this.aLongArray3[(this.anInt1076 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt1075;
	}
}
