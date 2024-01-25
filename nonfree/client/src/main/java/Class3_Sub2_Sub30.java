import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class3_Sub2_Sub30 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
	private int anInt9160 = 585;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9160 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(26) int local26 = Static372.anIntArray207[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static491.anInt8519; local28++) {
				@Pc(34) int local34 = Static546.anIntArray582[local28];
				@Pc(66) int local66;
				if (local34 > this.anInt9160 && local34 < 4096 - this.anInt9160 && local26 > 2048 - this.anInt9160 && this.anInt9160 + 2048 > local26) {
					local66 = 2048 - local34;
					local66 = local66 >= 0 ? local66 : -local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt9160;
					local18[local28] = 4096 - local66;
				} else if (2048 - this.anInt9160 < local34 && this.anInt9160 + 2048 > local34) {
					local66 = local26 - 2048;
					local66 = local66 < 0 ? -local66 : local66;
					local66 -= this.anInt9160;
					local66 <<= 0xC;
					local18[local28] = local66 / (2048 - this.anInt9160);
				} else if (local26 < this.anInt9160 || local26 > 4096 - this.anInt9160) {
					local66 = local34 - 2048;
					@Pc(174) int local174 = local66 < 0 ? -local66 : local66;
					@Pc(179) int local179 = local174 - this.anInt9160;
					@Pc(183) int local183 = local179 << 12;
					local18[local28] = local183 / (2048 - this.anInt9160);
				} else if (this.anInt9160 <= local34 && 4096 - this.anInt9160 >= local34) {
					local18[local28] = 0;
				} else {
					local66 = 2048 - local26;
					local66 = local66 < 0 ? -local66 : local66;
					local66 <<= 0xC;
					local66 /= 2048 - this.anInt9160;
					local18[local28] = 4096 - local66;
				}
			}
		}
		return local18;
	}
}
