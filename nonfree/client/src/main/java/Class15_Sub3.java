import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "J")
	private long aLong168 = 0L;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	private int anInt6369 = 1;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	private int anInt6370 = 0;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class15_Sub3() {
		this.aLong167 = System.nanoTime();
		this.aLong166 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)J")
	@Override
	public long method5279() {
		return this.aLong167;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	@Override
	public void method5283() {
		this.aLong168 = 0;
		if (this.aLong167 < this.aLong166) {
			this.aLong167 += this.aLong166 - this.aLong167;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)J")
	@Override
	protected long method5281() {
		this.aLong167 += this.method5284();
		return this.aLong166 > this.aLong167 ? (this.aLong166 - this.aLong167) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(JB)I")
	@Override
	protected int method5280(@OriginalArg(0) long arg0) {
		if (this.aLong167 < this.aLong166) {
			this.aLong168 += this.aLong166 - this.aLong167;
			this.aLong167 += this.aLong166 - this.aLong167;
			this.aLong166 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			this.aLong166 += arg0;
			local44++;
		} while (local44 < 10 && this.aLong166 < this.aLong167);
		if (this.aLong167 > this.aLong166) {
			this.aLong166 = this.aLong167;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)J")
	private long method5284() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong168;
		this.aLong168 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray9[this.anInt6370] = local7;
			this.anInt6370 = (this.anInt6370 + 1) % 10;
			if (this.anInt6369 < 1) {
				this.anInt6369++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt6369; local55++) {
			local47 += this.aLongArray9[(this.anInt6370 + 10 - local55) % 10];
		}
		return local47 / (long) this.anInt6369;
	}
}
