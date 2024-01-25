import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class5_Sub1_Sub20 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(28) int[] local28 = this.method9210(2, arg0);
			@Pc(34) int[][] local34 = this.method9203(0, arg0);
			@Pc(40) int[][] local40 = this.method9203(1, arg0);
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static648.anInt9588; local78++) {
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
					@Pc(98) int local98 = 4096 - local84;
					local44[local78] = local56[local78] * local84 + local68[local78] * local98 >> 12;
					local48[local78] = local84 * local60[local78] + local72[local78] * local98 >> 12;
					local52[local78] = local76[local78] * local98 + local64[local78] * local84 >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(31) int[] local31 = this.method9210(0, arg0);
			@Pc(39) int[] local39 = this.method9210(1, arg0);
			@Pc(45) int[] local45 = this.method9210(2, arg0);
			for (@Pc(47) int local47 = 0; local47 < Static648.anInt9588; local47++) {
				@Pc(53) int local53 = local45[local47];
				if (local53 == 4096) {
					local11[local47] = local31[local47];
				} else if (local53 == 0) {
					local11[local47] = local39[local47];
				} else {
					local11[local47] = local53 * local31[local47] + (4096 - local53) * local39[local47] >> 12;
				}
			}
		}
		return local11;
	}
}
