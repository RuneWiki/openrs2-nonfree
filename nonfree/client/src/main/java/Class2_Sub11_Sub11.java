import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class2_Sub11_Sub11 extends Class2_Sub11 {

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(31) int[] local31 = this.method9540(arg0, 0);
			@Pc(37) int[] local37 = this.method9540(arg0, 1);
			@Pc(43) int[] local43 = this.method9540(arg0, 2);
			for (@Pc(45) int local45 = 0; local45 < Static301.anInt10214; local45++) {
				@Pc(51) int local51 = local43[local45];
				if (local51 == 4096) {
					local21[local45] = local31[local45];
				} else if (local51 == 0) {
					local21[local45] = local37[local45];
				} else {
					local21[local45] = local37[local45] * (4096 - local51) + local51 * local31[local45] >> 12;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(28) int[] local28 = this.method9540(arg0, 2);
			@Pc(34) int[][] local34 = this.method9538(0, arg0);
			@Pc(40) int[][] local40 = this.method9538(1, arg0);
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static301.anInt10214; local78++) {
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
					@Pc(142) int local142 = 4096 - local84;
					local44[local78] = local56[local78] * local84 + local142 * local68[local78] >> 12;
					local48[local78] = local142 * local72[local78] + local60[local78] * local84 >> 12;
					local52[local78] = local76[local78] * local142 + local64[local78] * local84 >> 12;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}
}
