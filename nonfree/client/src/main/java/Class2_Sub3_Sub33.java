import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class2_Sub3_Sub33 extends Class2_Sub3 {

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub33() {
		super(3, false);
	}

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(28) int[] local28 = this.method9156(arg0, 2);
			@Pc(34) int[][] local34 = this.method9147(arg0, 0);
			@Pc(40) int[][] local40 = this.method9147(arg0, 1);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static222.anInt4971; local78++) {
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
					@Pc(97) int local97 = 4096 - local84;
					local44[local78] = local68[local78] * local97 + local56[local78] * local84 >> 12;
					local48[local78] = local72[local78] * local97 + local60[local78] * local84 >> 12;
					local52[local78] = local64[local78] * local84 + local76[local78] * local97 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(28) int[] local28 = this.method9156(arg0, 0);
			@Pc(34) int[] local34 = this.method9156(arg0, 1);
			@Pc(42) int[] local42 = this.method9156(arg0, 2);
			for (@Pc(44) int local44 = 0; local44 < Static222.anInt4971; local44++) {
				@Pc(50) int local50 = local42[local44];
				if (local50 == 4096) {
					local16[local44] = local28[local44];
				} else if (local50 == 0) {
					local16[local44] = local34[local44];
				} else {
					local16[local44] = local50 * local28[local44] + local34[local44] * (4096 - local50) >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}
}
