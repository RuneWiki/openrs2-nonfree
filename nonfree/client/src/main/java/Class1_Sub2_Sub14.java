import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ih", name = "bb", descriptor = "Z")
	private boolean aBoolean103;

	@OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
	private int anInt2015;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2015 = arg0.method878();
		} else if (arg1 == 1) {
			this.aBoolean103 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(25) int[] local25 = this.method3130(0, arg0 - 1 & Static64.anInt1680);
			@Pc(31) int[] local31 = this.method3130(0, arg0);
			@Pc(41) int[] local41 = this.method3130(0, arg0 + 1 & Static64.anInt1680);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static110.anInt2825; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt2015;
				@Pc(89) int local89 = (local31[local55 + 1 & Static99.anInt2523] - local31[Static99.anInt2523 & local55 - 1]) * this.anInt2015;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((local109 + local103 + 4096) / 4096)) * 4096.0D);
				@Pc(128) int local128;
				@Pc(130) int local130;
				@Pc(126) int local126;
				if (local122 == 0) {
					local126 = 0;
					local128 = 0;
					local130 = 0;
				} else {
					local128 = local89 / local122;
					local130 = local69 / local122;
					local126 = 16777216 / local122;
				}
				if (this.aBoolean103) {
					local130 = (local130 >> 1) + 2048;
					local126 = (local126 >> 1) + 2048;
					local128 = (local128 >> 1) + 2048;
				}
				local45[local55] = local128;
				local49[local55] = local130;
				local53[local55] = local126;
			}
		}
		return local11;
	}
}
