import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class5_Sub3_Sub18 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
	private int anInt3935 = 585;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(26) int local26 = Static458.anIntArray438[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static7.anInt102; local28++) {
				@Pc(34) int local34 = Static382.anIntArray368[local28];
				@Pc(72) int local72;
				if (local34 > this.anInt3935 && 4096 - this.anInt3935 > local34 && local26 > 2048 - this.anInt3935 && this.anInt3935 + 2048 > local26) {
					local72 = 2048 - local34;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt3935;
					local18[local28] = 4096 - local72;
				} else if (2048 - this.anInt3935 < local34 && this.anInt3935 + 2048 > local34) {
					local72 = local26 - 2048;
					local72 = local72 < 0 ? -local72 : local72;
					local72 -= this.anInt3935;
					local72 <<= 0xC;
					local18[local28] = local72 / (2048 - this.anInt3935);
				} else if (local26 < this.anInt3935 || 4096 - this.anInt3935 < local26) {
					local72 = local34 - 2048;
					@Pc(188) int local188 = local72 >= 0 ? local72 : -local72;
					@Pc(193) int local193 = local188 - this.anInt3935;
					@Pc(197) int local197 = local193 << 12;
					local18[local28] = local197 / (2048 - this.anInt3935);
				} else if (local34 >= this.anInt3935 && 4096 - this.anInt3935 >= local34) {
					local18[local28] = 0;
				} else {
					local72 = 2048 - local26;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt3935;
					local18[local28] = 4096 - local72;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3935 = arg0.method7333();
		}
	}
}
