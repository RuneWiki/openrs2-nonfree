import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(3, false);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(28) int[] local28 = this.method4716(2, arg0);
			@Pc(34) int[][] local34 = this.method4715(arg0, 0);
			@Pc(40) int[][] local40 = this.method4715(arg0, 1);
			@Pc(44) int[] local44 = local17[0];
			@Pc(48) int[] local48 = local17[2];
			@Pc(52) int[] local52 = local17[1];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local40[0];
			@Pc(68) int[] local68 = local40[1];
			@Pc(72) int[] local72 = local40[2];
			@Pc(76) int[] local76 = local34[2];
			for (@Pc(78) int local78 = 0; local78 < Static62.anInt1350; local78++) {
				@Pc(89) int local89 = local28[local78];
				if (local89 == 4096) {
					local44[local78] = local56[local78];
					local52[local78] = local60[local78];
					local48[local78] = local76[local78];
				} else if (local89 == 0) {
					local44[local78] = local64[local78];
					local52[local78] = local68[local78];
					local48[local78] = local72[local78];
				} else {
					@Pc(102) int local102 = 4096 - local89;
					local44[local78] = local64[local78] * local102 + local56[local78] * local89 >> 12;
					local52[local78] = local102 * local68[local78] + local89 * local60[local78] >> 12;
					local48[local78] = local89 * local76[local78] + local102 * local72[local78] >> 12;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(18) int[] local18 = this.method4716(0, arg0);
			@Pc(24) int[] local24 = this.method4716(1, arg0);
			@Pc(30) int[] local30 = this.method4716(2, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static62.anInt1350; local32++) {
				@Pc(43) int local43 = local30[local32];
				if (local43 == 4096) {
					local7[local32] = local18[local32];
				} else if (local43 == 0) {
					local7[local32] = local24[local32];
				} else {
					local7[local32] = (4096 - local43) * local24[local32] + local18[local32] * local43 >> 12;
				}
			}
		}
		return local7;
	}
}
