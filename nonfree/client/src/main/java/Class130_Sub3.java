import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class130_Sub3 extends Class130 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
	private long aLong242 = 0L;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	private int anInt9096 = 1;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "J")
	private long aLong243 = 0L;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "J")
	private long aLong244 = 0L;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	private int anInt9097 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)J")
	private long method7422() {
		@Pc(4) long local4 = Static582.method8056() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong244;
		this.aLong244 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray9[this.anInt9097] = local10;
			this.anInt9097 = (this.anInt9097 + 1) % 10;
			if (this.anInt9096 < 10) {
				this.anInt9096++;
			}
		}
		@Pc(52) long local52 = (long) 0;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt9096; local54++) {
			local52 += this.aLongArray9[(this.anInt9097 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt9096;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)J")
	@Override
	protected long method7416() {
		this.aLong243 += this.method7422();
		return this.aLong243 < this.aLong242 ? (this.aLong242 - this.aLong243) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	@Override
	public void method7417() {
		this.aLong244 = 0L;
		if (this.aLong243 < this.aLong242) {
			this.aLong243 += this.aLong242 - this.aLong243;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7420(@OriginalArg(1) long arg0) {
		if (this.aLong243 < this.aLong242) {
			this.aLong244 += this.aLong242 - this.aLong243;
			this.aLong243 += this.aLong242 - this.aLong243;
			this.aLong242 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			this.aLong242 += arg0;
			local12++;
		} while (local12 < 10 && this.aLong243 > this.aLong242);
		if (this.aLong243 > this.aLong242) {
			this.aLong242 = this.aLong243;
		}
		return local12;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)J")
	@Override
	public long method7418() {
		return this.aLong243;
	}
}
