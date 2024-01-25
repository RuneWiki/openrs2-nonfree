import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub2_Sub38 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
	private int anInt6916 = 585;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(26) int local26 = Static405.anIntArray555[arg0];
			for (@Pc(28) int local28 = 0; local28 < Static217.anInt3574; local28++) {
				@Pc(34) int local34 = Static145.anIntArray199[local28];
				@Pc(72) int local72;
				if (this.anInt6916 < local34 && 4096 - this.anInt6916 > local34 && 2048 - this.anInt6916 < local26 && local26 < this.anInt6916 + 2048) {
					local72 = 2048 - local34;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6916;
					local18[local28] = 4096 - local72;
				} else if (2048 - this.anInt6916 < local34 && local34 < this.anInt6916 + 2048) {
					local72 = local26 - 2048;
					local72 = local72 >= 0 ? local72 : -local72;
					local72 -= this.anInt6916;
					local72 <<= 0xC;
					local18[local28] = local72 / (2048 - this.anInt6916);
				} else if (this.anInt6916 > local26 || local26 > 4096 - this.anInt6916) {
					local72 = local34 - 2048;
					@Pc(169) int local169 = local72 < 0 ? -local72 : local72;
					@Pc(174) int local174 = local169 - this.anInt6916;
					@Pc(178) int local178 = local174 << 12;
					local18[local28] = local178 / (2048 - this.anInt6916);
				} else if (this.anInt6916 <= local34 && 4096 - this.anInt6916 >= local34) {
					local18[local28] = 0;
				} else {
					local72 = 2048 - local26;
					local72 = local72 < 0 ? -local72 : local72;
					local72 <<= 0xC;
					local72 /= 2048 - this.anInt6916;
					local18[local28] = 4096 - local72;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6916 = arg0.method3555();
		}
	}
}
