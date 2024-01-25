import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583) {
			@Pc(26) int[] local26 = this.method5894(2, arg0);
			@Pc(34) int[][] local34 = this.method5899(0, arg0);
			@Pc(40) int[][] local40 = this.method5899(1, arg0);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static406.anInt6694; local78++) {
				@Pc(84) int local84 = local26[local78];
				if (local84 == 4096) {
					local44[local78] = local56[local78];
					local48[local78] = local60[local78];
					local52[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local68[local78];
					local48[local78] = local72[local78];
					local52[local78] = local76[local78];
				} else {
					@Pc(119) int local119 = 4096 - local84;
					local44[local78] = local56[local78] * local84 + local119 * local68[local78] >> 12;
					local48[local78] = local60[local78] * local84 + local72[local78] * local119 >> 12;
					local52[local78] = local76[local78] * local119 + local84 * local64[local78] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean650 = arg0.method2582() == 1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(25) int[] local25 = this.method5894(0, arg0);
			@Pc(31) int[] local31 = this.method5894(1, arg0);
			@Pc(39) int[] local39 = this.method5894(2, arg0);
			for (@Pc(41) int local41 = 0; local41 < Static406.anInt6694; local41++) {
				@Pc(47) int local47 = local39[local41];
				if (local47 == 4096) {
					local15[local41] = local25[local41];
				} else if (local47 == 0) {
					local15[local41] = local31[local41];
				} else {
					local15[local41] = local31[local41] * (4096 - local47) + local47 * local25[local41] >> 12;
				}
			}
		}
		return local15;
	}
}
