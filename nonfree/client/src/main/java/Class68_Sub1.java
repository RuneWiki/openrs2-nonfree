import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
	private int anInt3014;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "[J")
	private long[] aLongArray18 = new long[10];

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
	private int anInt3013 = 0;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	private int anInt3011 = 1;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
	private int anInt3017 = 256;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "J")
	private long aLong101 = Static31.method591();

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class68_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray18[local22] = this.aLong101;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	@Override
	public void method2540() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray18[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)I")
	@Override
	public int method2537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt3017;
		this.anInt3017 = 300;
		@Pc(19) int local19 = this.anInt3011;
		this.anInt3011 = 1;
		this.aLong101 = Static31.method591();
		if (this.aLongArray18[this.anInt3014] == 0L) {
			this.anInt3017 = local9;
			this.anInt3011 = local19;
		} else if (this.aLong101 > this.aLongArray18[this.anInt3014]) {
			this.anInt3017 = (int) ((long) (arg1 * 2560) / (this.aLong101 - this.aLongArray18[this.anInt3014]));
		}
		if (this.anInt3017 < 25) {
			this.anInt3017 = 25;
		}
		if (this.anInt3017 > 256) {
			this.anInt3017 = 256;
			this.anInt3011 = (int) ((long) arg1 - (this.aLong101 - this.aLongArray18[this.anInt3014]) / 10L);
		}
		if (arg1 < this.anInt3011) {
			this.anInt3011 = arg1;
		}
		this.aLongArray18[this.anInt3014] = this.aLong101;
		this.anInt3014 = (this.anInt3014 + 1) % 10;
		@Pc(138) int local138;
		if (this.anInt3011 > 1) {
			for (local138 = 0; local138 < 10; local138++) {
				if (this.aLongArray18[local138] != 0L) {
					this.aLongArray18[local138] -= -((long) this.anInt3011);
				}
			}
		}
		local138 = 0;
		if (arg0 > this.anInt3011) {
			this.anInt3011 = arg0;
		}
		Static30.method587((long) this.anInt3011);
		while (this.anInt3013 < 256) {
			this.anInt3013 += this.anInt3017;
			local138++;
		}
		this.anInt3013 &= 0xFF;
		return local138;
	}
}
