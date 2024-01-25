import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "J")
	private long aLong60 = 0L;

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "J")
	private long aLong59 = 0L;

	@OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
	private int anInt2209 = 1;

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
	private int anInt2210 = 0;

	@OriginalMember(owner = "client!daa", name = "k", descriptor = "J")
	private long aLong61 = 0L;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	public Class64_Sub1() {
		this.aLong60 = this.aLong59 = jagmisc.nanoTime();
		if (this.aLong59 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)J")
	private long method1849() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong61;
		this.aLong61 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray3[this.anInt2210] = local7;
			this.anInt2210 = (this.anInt2210 + 1) % 10;
			if (this.anInt2209 < 1) {
				this.anInt2209++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt2209; local57++) {
			local55 += this.aLongArray3[(this.anInt2210 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt2209;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)J")
	@Override
	protected long method6918() {
		this.aLong59 += this.method1849();
		return this.aLong60 > this.aLong59 ? (this.aLong60 - this.aLong59) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
	@Override
	public void method6920() {
		this.aLong61 = (long) 0;
		if (this.aLong60 > this.aLong59) {
			this.aLong59 += this.aLong60 - this.aLong59;
		}
	}

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "(I)J")
	@Override
	public long method6923() {
		return this.aLong59;
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(JI)I")
	@Override
	protected int method6919(@OriginalArg(0) long arg0) {
		if (this.aLong60 > this.aLong59) {
			this.aLong61 += this.aLong60 - this.aLong59;
			this.aLong59 += this.aLong60 - this.aLong59;
			this.aLong60 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong60 += arg0;
		} while (local17 < 10 && this.aLong60 < this.aLong59);
		if (this.aLong60 < this.aLong59) {
			this.aLong60 = this.aLong59;
		}
		return local17;
	}
}
