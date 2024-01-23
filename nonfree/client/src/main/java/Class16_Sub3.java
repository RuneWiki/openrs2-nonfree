import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "J")
	private long aLong190 = 0L;

	@OriginalMember(owner = "client!te", name = "i", descriptor = "J")
	private long aLong191 = 0L;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	private int anInt5243 = 1;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "J")
	private long aLong192 = 0L;

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	private int anInt5244 = 0;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[J")
	private long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class16_Sub3() {
		this.aLong190 = this.aLong191 = jagmisc.nanoTime();
		if (this.aLong191 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	@Override
	public void method4239() {
		if (this.aLong190 > this.aLong191) {
			this.aLong191 += this.aLong190 - this.aLong191;
		}
		this.aLong192 = 0L;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)I")
	@Override
	public int method4236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static138.method2475((long) arg1);
		@Pc(8) long local8 = (long) arg0 * 1000000L;
		this.aLong191 += this.method4241();
		if (this.aLong191 < this.aLong190) {
			Static138.method2475((this.aLong190 - this.aLong191) / 1000000L);
			this.aLong192 += this.aLong190 - this.aLong191;
			this.aLong191 += this.aLong190 - this.aLong191;
			this.aLong190 += local8;
			return 1;
		}
		@Pc(34) int local34 = 0;
		do {
			local34++;
			this.aLong190 += local8;
		} while (local34 < 10 && this.aLong191 > this.aLong190);
		if (this.aLong191 > this.aLong190) {
			this.aLong190 = this.aLong191;
		}
		return local34;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)J")
	private long method4241() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = 0L;
		@Pc(12) long local12 = local1 - this.aLong192;
		this.aLong192 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray9[this.anInt5244] = local12;
			if (this.anInt5243 < 1) {
				this.anInt5243++;
			}
			this.anInt5244 = (this.anInt5244 + 1) % 10;
		}
		for (@Pc(56) int local56 = 1; local56 <= this.anInt5243; local56++) {
			local7 += this.aLongArray9[(this.anInt5244 + 10 - local56) % 10];
		}
		return local7 / (long) this.anInt5243;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)J")
	@Override
	public long method4237() {
		return this.aLong191;
	}
}
