import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class6_Sub2_Sub20 extends Class6_Sub2 {

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(28) int[] local28 = this.method5858(2, arg0);
			@Pc(34) int[][] local34 = this.method5867(arg0, 0);
			@Pc(40) int[][] local40 = this.method5867(arg0, 1);
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static185.anInt4925; local78++) {
				@Pc(84) int local84 = local28[local78];
				if (local84 == 4096) {
					local44[local78] = local56[local78];
					local48[local78] = local60[local78];
					local52[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local68[local78];
					local48[local78] = local72[local78];
					local52[local78] = local76[local78];
				} else {
					@Pc(116) int local116 = 4096 - local84;
					local44[local78] = local68[local78] * local116 + local84 * local56[local78] >> 12;
					local48[local78] = local72[local78] * local116 + local84 * local60[local78] >> 12;
					local52[local78] = local64[local78] * local84 + local76[local78] * local116 >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int[] local26 = this.method5858(0, arg0);
			@Pc(32) int[] local32 = this.method5858(1, arg0);
			@Pc(38) int[] local38 = this.method5858(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static185.anInt4925; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = (4096 - local46) * local32[local40] + local26[local40] * local46 >> 12;
				}
			}
		}
		return local16;
	}
}
