import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	private int anInt6443 = 585;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(24) int local24 = Static7.anIntArray20[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static452.anInt7734; local26++) {
				@Pc(32) int local32 = Static228.anIntArray442[local26];
				@Pc(65) int local65;
				if (local32 > this.anInt6443 && local32 < 4096 - this.anInt6443 && local24 > 2048 - this.anInt6443 && local24 < this.anInt6443 + 2048) {
					local65 = 2048 - local32;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt6443;
					local16[local26] = 4096 - local65;
				} else if (local32 > 2048 - this.anInt6443 && local32 < this.anInt6443 + 2048) {
					local65 = local24 - 2048;
					local65 = local65 < 0 ? -local65 : local65;
					local65 -= this.anInt6443;
					local65 <<= 0xC;
					local16[local26] = local65 / (2048 - this.anInt6443);
				} else if (local24 < this.anInt6443 || local24 > 4096 - this.anInt6443) {
					local65 = local32 - 2048;
					@Pc(173) int local173 = local65 < 0 ? -local65 : local65;
					@Pc(178) int local178 = local173 - this.anInt6443;
					@Pc(182) int local182 = local178 << 12;
					local16[local26] = local182 / (2048 - this.anInt6443);
				} else if (this.anInt6443 <= local32 && local32 <= 4096 - this.anInt6443) {
					local16[local26] = 0;
				} else {
					local65 = 2048 - local24;
					local65 = local65 >= 0 ? local65 : -local65;
					local65 <<= 0xC;
					local65 /= 2048 - this.anInt6443;
					local16[local26] = 4096 - local65;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6443 = arg0.method3967();
		}
	}
}
