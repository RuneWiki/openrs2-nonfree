import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "J")
	private long aLong143 = 0L;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	private int anInt4301 = 0;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
	private int anInt4302 = 1;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class20_Sub3() {
		this.aLong144 = System.nanoTime();
		this.aLong143 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)J")
	private long method3407() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong145;
		this.aLong145 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt4301] = local7;
			this.anInt4301 = (this.anInt4301 + 1) % 10;
			if (this.anInt4302 < 1) {
				this.anInt4302++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt4302; local49++) {
			local47 += this.aLongArray6[(this.anInt4301 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt4302;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)J")
	@Override
	public long method3404() {
		return this.aLong144;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	@Override
	public void method3403() {
		this.aLong145 = 0L;
		if (this.aLong143 > this.aLong144) {
			this.aLong144 += this.aLong143 - this.aLong144;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)I")
	@Override
	public int method3401(@OriginalArg(1) int arg0) {
		this.aLong144 += this.method3407();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong143 > this.aLong144) {
			Static331.method4343((this.aLong143 - this.aLong144) / 1000000L);
			this.aLong145 += this.aLong143 - this.aLong144;
			this.aLong144 += this.aLong143 - this.aLong144;
			this.aLong143 += local12;
			return 1;
		}
		@Pc(28) int local28 = 0;
		do {
			this.aLong143 += local12;
			local28++;
		} while (local28 < 10 && this.aLong144 > this.aLong143);
		if (this.aLong144 > this.aLong143) {
			this.aLong143 = this.aLong144;
		}
		return local28;
	}
}
