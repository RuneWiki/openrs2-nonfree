import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "J")
	private long aLong33 = 0L;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "J")
	private long aLong34 = 0L;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "J")
	private long aLong35 = 0L;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	private int anInt1076 = 0;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
	private int anInt1077 = 1;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class20_Sub1() {
		this.aLong34 = this.aLong33 = jagmisc.nanoTime();
		if (this.aLong33 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)J")
	private long method946() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong35;
		this.aLong35 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray2[this.anInt1076] = local12;
			this.anInt1076 = (this.anInt1076 + 1) % 10;
			if (this.anInt1077 < 1) {
				this.anInt1077++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt1077; local53++) {
			local51 += this.aLongArray2[(this.anInt1076 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt1077;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)I")
	@Override
	public int method3401(@OriginalArg(1) int arg0) {
		this.aLong33 += this.method946();
		@Pc(20) long local20 = (long) arg0 * 1000000L;
		if (this.aLong34 > this.aLong33) {
			Static331.method4343((this.aLong34 - this.aLong33) / 1000000L);
			this.aLong35 += this.aLong34 - this.aLong33;
			this.aLong33 += this.aLong34 - this.aLong33;
			this.aLong34 += local20;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			local68++;
			this.aLong34 += local20;
		} while (local68 < 10 && this.aLong34 < this.aLong33);
		if (this.aLong33 > this.aLong34) {
			this.aLong34 = this.aLong33;
		}
		return local68;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
	@Override
	public void method3403() {
		if (this.aLong34 > this.aLong33) {
			this.aLong33 += this.aLong34 - this.aLong33;
		}
		this.aLong35 = 0L;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)J")
	@Override
	public long method3404() {
		return this.aLong33;
	}
}
