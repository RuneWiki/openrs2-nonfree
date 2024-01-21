import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class2_Sub3_Sub32 extends Class2_Sub3 {

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
	private int anInt3380;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt3380 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(24) int local24 = Static50.anIntArray106[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static53.anInt1184; local26++) {
				@Pc(32) int local32 = Static43.anIntArray102[local26];
				@Pc(71) int local71;
				if (this.anInt3380 < local32 && local32 < 4096 - this.anInt3380 && 2048 - this.anInt3380 < local24 && this.anInt3380 + 2048 > local24) {
					local71 = 2048 - local32;
					local71 = local71 < 0 ? -local71 : local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt3380;
					local7[local26] = 4096 - local71;
				} else if (local32 > 2048 - this.anInt3380 && local32 < this.anInt3380 + 2048) {
					local71 = local24 - 2048;
					local71 = local71 >= 0 ? local71 : -local71;
					local71 -= this.anInt3380;
					local71 <<= 0xC;
					local7[local26] = local71 / (2048 - this.anInt3380);
				} else if (this.anInt3380 > local24 || 4096 - this.anInt3380 < local24) {
					local71 = local32 - 2048;
					@Pc(180) int local180 = local71 < 0 ? -local71 : local71;
					@Pc(185) int local185 = local180 - this.anInt3380;
					@Pc(189) int local189 = local185 << 12;
					local7[local26] = local189 / (2048 - this.anInt3380);
				} else if (local32 >= this.anInt3380 && local32 <= 4096 - this.anInt3380) {
					local7[local26] = 0;
				} else {
					local71 = 2048 - local24;
					local71 = local71 < 0 ? -local71 : local71;
					local71 <<= 0xC;
					local71 /= 2048 - this.anInt3380;
					local7[local26] = 4096 - local71;
				}
			}
		}
		return local7;
	}
}
