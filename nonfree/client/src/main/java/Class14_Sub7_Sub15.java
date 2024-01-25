import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class14_Sub7_Sub15 extends Class14_Sub7 {

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub15() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(31) int[] local31 = this.method9379(0, arg0);
			@Pc(37) int[] local37 = this.method9379(1, arg0);
			@Pc(43) int[] local43 = this.method9379(2, arg0);
			for (@Pc(45) int local45 = 0; local45 < Static613.anInt10114; local45++) {
				@Pc(51) int local51 = local43[local45];
				if (local51 == 4096) {
					local11[local45] = local31[local45];
				} else if (local51 == 0) {
					local11[local45] = local37[local45];
				} else {
					local11[local45] = local31[local45] * local51 + (4096 - local51) * local37[local45] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			super.aBoolean773 = arg1.method7695(117) == 1;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(28) int[] local28 = this.method9379(2, arg0);
			@Pc(34) int[][] local34 = this.method9384(arg0, 0);
			@Pc(40) int[][] local40 = this.method9384(arg0, 1);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static613.anInt10114; local78++) {
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
					@Pc(96) int local96 = 4096 - local84;
					local44[local78] = local96 * local68[local78] + local56[local78] * local84 >> 12;
					local48[local78] = local72[local78] * local96 + local84 * local60[local78] >> 12;
					local52[local78] = local76[local78] * local96 + local64[local78] * local84 >> 12;
				}
			}
		}
		return local11;
	}
}
