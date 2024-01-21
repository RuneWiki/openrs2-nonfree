import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class4_Sub3_Sub28 extends Class4_Sub3 {

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
	private int anInt3168;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3168 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(27) int local27 = Static148.anIntArray321[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static134.anInt3188; local29++) {
				@Pc(35) int local35 = Static67.anIntArray170[local29];
				@Pc(75) int local75;
				if (this.anInt3168 < local35 && 4096 - this.anInt3168 > local35 && 2048 - this.anInt3168 < local27 && this.anInt3168 + 2048 > local27) {
					local75 = 2048 - local35;
					local75 = local75 >= 0 ? local75 : -local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt3168;
					local7[local29] = 4096 - local75;
				} else if (2048 - this.anInt3168 < local35 && this.anInt3168 + 2048 > local35) {
					local75 = local27 - 2048;
					local75 = local75 < 0 ? -local75 : local75;
					local75 -= this.anInt3168;
					local75 <<= 0xC;
					local7[local29] = local75 / (2048 - this.anInt3168);
				} else if (this.anInt3168 > local27 || local27 > 4096 - this.anInt3168) {
					local75 = local35 - 2048;
					@Pc(171) int local171 = local75 >= 0 ? local75 : -local75;
					@Pc(176) int local176 = local171 - this.anInt3168;
					@Pc(180) int local180 = local176 << 12;
					local7[local29] = local180 / (2048 - this.anInt3168);
				} else if (local35 >= this.anInt3168 && local35 <= 4096 - this.anInt3168) {
					local7[local29] = 0;
				} else {
					local75 = 2048 - local27;
					local75 = local75 < 0 ? -local75 : local75;
					local75 <<= 0xC;
					local75 /= 2048 - this.anInt3168;
					local7[local29] = 4096 - local75;
				}
			}
		}
		return local7;
	}
}
