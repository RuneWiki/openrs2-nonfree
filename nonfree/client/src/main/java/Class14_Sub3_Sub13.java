import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class14_Sub3_Sub13 extends Class14_Sub3 {

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub13() {
		super(3, false);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(31) int[] local31 = this.method6004(0, arg0);
			@Pc(37) int[] local37 = this.method6004(1, arg0);
			@Pc(43) int[] local43 = this.method6004(2, arg0);
			for (@Pc(45) int local45 = 0; local45 < Static294.anInt5657; local45++) {
				@Pc(51) int local51 = local43[local45];
				if (local51 == 4096) {
					local21[local45] = local31[local45];
				} else if (local51 == 0) {
					local21[local45] = local37[local45];
				} else {
					local21[local45] = (4096 - local51) * local37[local45] + local31[local45] * local51 >> 12;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(26) int[] local26 = this.method6004(2, arg0);
			@Pc(34) int[][] local34 = this.method5997(arg0, 0);
			@Pc(40) int[][] local40 = this.method5997(arg0, 1);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static294.anInt5657; local78++) {
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
					local44[local78] = local119 * local68[local78] + local56[local78] * local84 >> 12;
					local48[local78] = local119 * local72[local78] + local60[local78] * local84 >> 12;
					local52[local78] = local84 * local64[local78] + local119 * local76[local78] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}
}
