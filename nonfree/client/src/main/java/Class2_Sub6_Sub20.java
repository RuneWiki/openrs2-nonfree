import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub6_Sub20 extends Class2_Sub6 {

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
	private int anInt3617 = 1;

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
	private int anInt3620 = 1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3620 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt3617 = arg0.method4240();
		} else if (arg1 == 2) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(28) int local28 = this.anInt3617 + this.anInt3617 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3620 + this.anInt3620 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(70) int local70;
			@Pc(72) int local72;
			for (@Pc(52) int local52 = arg0 - this.anInt3617; local52 <= arg0 + this.anInt3617; local52++) {
				@Pc(62) int[][] local62 = this.method5640(0, Static71.anInt1349 & local52);
				@Pc(66) int[][] local66 = new int[3][Static151.anInt2711];
				@Pc(68) int local68 = 0;
				local70 = 0;
				local72 = 0;
				@Pc(76) int[] local76 = local62[0];
				@Pc(80) int[] local80 = local62[1];
				@Pc(84) int[] local84 = local62[2];
				for (@Pc(88) int local88 = -this.anInt3620; local88 <= this.anInt3620; local88++) {
					@Pc(94) int local94 = Static274.anInt1078 & local88;
					local72 += local84[local94];
					local70 += local80[local94];
					local68 += local76[local94];
				}
				@Pc(121) int[] local121 = local66[0];
				@Pc(125) int[] local125 = local66[1];
				@Pc(129) int[] local129 = local66[2];
				@Pc(131) int local131 = 0;
				while (Static151.anInt2711 > local131) {
					local121[local131] = local68 * local44 >> 16;
					local125[local131] = local44 * local70 >> 16;
					local129[local131] = local72 * local44 >> 16;
					@Pc(165) int local165 = local131 - this.anInt3620 & Static274.anInt1078;
					local72 -= local84[local165];
					local68 -= local76[local165];
					local70 -= local80[local165];
					local131++;
					@Pc(191) int local191 = this.anInt3620 + local131 & Static274.anInt1078;
					local70 += local80[local191];
					local72 += local84[local191];
					local68 += local76[local191];
				}
				local47[local52 + this.anInt3617 - arg0] = local66;
			}
			@Pc(242) int[] local242 = local11[0];
			@Pc(246) int[] local246 = local11[1];
			@Pc(250) int[] local250 = local11[2];
			for (local70 = 0; local70 < Static151.anInt2711; local70++) {
				local72 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local28; local262++) {
					@Pc(268) int[][] local268 = local47[local262];
					local72 += local268[0][local70];
					local260 += local268[2][local70];
					local258 += local268[1][local70];
				}
				local242[local70] = local32 * local72 >> 16;
				local246[local70] = local32 * local258 >> 16;
				local250[local70] = local32 * local260 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(31) int local31 = this.anInt3617 + this.anInt3617 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt3620 + this.anInt3620 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt3617; local55 <= arg0 + this.anInt3617; local55++) {
				@Pc(65) int[] local65 = this.method5635(Static71.anInt1349 & local55, 0);
				@Pc(68) int[] local68 = new int[Static151.anInt2711];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt3620; local74 <= this.anInt3620; local74++) {
					local70 += local65[Static274.anInt1078 & local74];
				}
				@Pc(95) int local95 = 0;
				while (local95 < Static151.anInt2711) {
					local68[local95] = local70 * local47 >> 16;
					local70 -= local65[local95 - this.anInt3620 & Static274.anInt1078];
					local95++;
					local70 += local65[Static274.anInt1078 & this.anInt3620 + local95];
				}
				local50[local55 + this.anInt3617 - arg0] = local68;
			}
			for (@Pc(156) int local156 = 0; local156 < Static151.anInt2711; local156++) {
				@Pc(160) int local160 = 0;
				for (local70 = 0; local70 < local31; local70++) {
					local160 += local50[local70][local156];
				}
				local19[local156] = local35 * local160 >> 16;
			}
		}
		return local19;
	}
}
