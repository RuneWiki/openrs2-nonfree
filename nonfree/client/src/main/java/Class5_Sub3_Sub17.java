import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class5_Sub3_Sub17 extends Class5_Sub3 {

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
	private int anInt3273 = 585;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(27) int local27 = Static345.anIntArray627[arg0];
			for (@Pc(29) int local29 = 0; local29 < Static7.anInt129; local29++) {
				@Pc(35) int local35 = Static164.anIntArray337[local29];
				@Pc(72) int local72;
				if (this.anInt3273 < local35 && 4096 - this.anInt3273 > local35 && 2048 - this.anInt3273 < local27 && this.anInt3273 + 2048 > local27) {
					local72 = 2048 - local35;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt3273;
					local11[local29] = 4096 - local72;
				} else if (2048 - this.anInt3273 < local35 && this.anInt3273 + 2048 > local35) {
					local72 = local27 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt3273;
					local72 <<= 0xC;
					local11[local29] = local72 / (2048 - this.anInt3273);
				} else if (this.anInt3273 > local27 || local27 > 4096 - this.anInt3273) {
					local72 = local35 - 2048;
					@Pc(185) int local185 = local72 >= 0 ? local72 : -local72;
					@Pc(190) int local190 = local185 - this.anInt3273;
					@Pc(194) int local194 = local190 << 12;
					local11[local29] = local194 / (2048 - this.anInt3273);
				} else if (local35 >= this.anInt3273 && local35 <= 4096 - this.anInt3273) {
					local11[local29] = 0;
				} else {
					local72 = 2048 - local27;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt3273;
					local11[local29] = 4096 - local72;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3273 = arg0.method5106();
		}
	}
}
