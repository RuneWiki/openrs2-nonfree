import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class1_Sub5_Sub3 extends Class1_Sub5 {

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
	private int anInt477 = 585;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(26) int local26 = Static191.anIntArray379[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static75.anInt1566; local28++) {
				@Pc(34) int local34 = Static49.anIntArray492[local28];
				@Pc(66) int local66;
				if (this.anInt477 < local34 && local34 < 4096 - this.anInt477 && local26 > 2048 - this.anInt477 && local26 < this.anInt477 + 2048) {
					local66 = 2048 - local34;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt477;
					local11[local28] = 4096 - local66;
				} else if (2048 - this.anInt477 < local34 && this.anInt477 + 2048 > local34) {
					local66 = local26 - 2048;
					local66 = local66 >= 0 ? local66 : -local66;
					local66 -= this.anInt477;
					local66 <<= 0xC;
					local11[local28] = local66 / (2048 - this.anInt477);
				} else if (this.anInt477 > local26 || local26 > 4096 - this.anInt477) {
					local66 = local34 - 2048;
					@Pc(172) int local172 = local66 < 0 ? -local66 : local66;
					@Pc(177) int local177 = local172 - this.anInt477;
					@Pc(181) int local181 = local177 << 12;
					local11[local28] = local181 / (2048 - this.anInt477);
				} else if (local34 >= this.anInt477 && local34 <= 4096 - this.anInt477) {
					local11[local28] = 0;
				} else {
					local66 = 2048 - local26;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt477;
					local11[local28] = 4096 - local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt477 = arg0.method5715();
		}
	}
}
