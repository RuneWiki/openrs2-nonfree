import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
	private int anInt1613;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(15) int local15 = Static166.anIntArray619[arg0];
			for (@Pc(17) int local17 = 0; local17 < Static129.anInt3118; local17++) {
				@Pc(23) int local23 = Static163.anIntArray577[local17];
				@Pc(56) int local56;
				if (this.anInt1613 < local23 && local23 < 4096 - this.anInt1613 && 2048 - this.anInt1613 < local15 && local15 < this.anInt1613 + 2048) {
					local56 = 2048 - local23;
					local56 = local56 < 0 ? -local56 : local56;
					local56 <<= 0xC;
					local56 /= 2048 - this.anInt1613;
					local7[local17] = 4096 - local56;
				} else if (local23 > 2048 - this.anInt1613 && this.anInt1613 + 2048 > local23) {
					local56 = local15 - 2048;
					local56 = local56 < 0 ? -local56 : local56;
					local56 -= this.anInt1613;
					local56 <<= 0xC;
					local7[local17] = local56 / (2048 - this.anInt1613);
				} else if (local15 < this.anInt1613 || 4096 - this.anInt1613 < local15) {
					local56 = local23 - 2048;
					@Pc(157) int local157 = local56 < 0 ? -local56 : local56;
					@Pc(162) int local162 = local157 - this.anInt1613;
					@Pc(166) int local166 = local162 << 12;
					local7[local17] = local166 / (2048 - this.anInt1613);
				} else if (local23 >= this.anInt1613 && local23 <= 4096 - this.anInt1613) {
					local7[local17] = 0;
				} else {
					local56 = 2048 - local15;
					local56 = local56 < 0 ? -local56 : local56;
					local56 <<= 0xC;
					local56 /= 2048 - this.anInt1613;
					local7[local17] = 4096 - local56;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1613 = arg0.method2353();
		}
	}
}
