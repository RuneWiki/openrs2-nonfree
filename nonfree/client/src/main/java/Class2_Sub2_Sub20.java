import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
	private int anInt3456 = 1;

	@OriginalMember(owner = "client!kk", name = "R", descriptor = "I")
	private int anInt3458 = 1;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(28) int local28 = this.anInt3458 + this.anInt3458 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3456 + this.anInt3456 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt3458; local53 <= this.anInt3458 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method5876(0, Static285.anInt5782 & local53);
				@Pc(66) int[] local66 = new int[Static339.anInt6735];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt3456; local72 <= this.anInt3456; local72++) {
					local68 += local63[local72 & Static25.anInt1346];
				}
				@Pc(89) int local89 = 0;
				while (Static339.anInt6735 > local89) {
					local66[local89] = local44 * local68 >> 16;
					local68 -= local63[local89 - this.anInt3456 & Static25.anInt1346];
					local89++;
					local68 += local63[local89 + this.anInt3456 & Static25.anInt1346];
				}
				local47[this.anInt3458 + local53 - arg0] = local66;
			}
			for (@Pc(148) int local148 = 0; local148 < Static339.anInt6735; local148++) {
				@Pc(152) int local152 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local152 += local47[local68][local148];
				}
				local16[local148] = local152 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(32) int local32 = this.anInt3458 + this.anInt3458 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt3456 + this.anInt3456 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt3458; local57 <= arg0 + this.anInt3458; local57++) {
				@Pc(67) int[][] local67 = this.method5887(local57 & Static285.anInt5782, 0);
				@Pc(71) int[][] local71 = new int[3][Static339.anInt6735];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt3456; local93 <= this.anInt3456; local93++) {
					@Pc(99) int local99 = Static25.anInt1346 & local93;
					local75 += local85[local99];
					local77 += local89[local99];
					local73 += local81[local99];
				}
				@Pc(130) int[] local130 = local71[0];
				@Pc(134) int[] local134 = local71[1];
				@Pc(138) int[] local138 = local71[2];
				@Pc(140) int local140 = 0;
				while (Static339.anInt6735 > local140) {
					local130[local140] = local48 * local73 >> 16;
					local134[local140] = local75 * local48 >> 16;
					local138[local140] = local48 * local77 >> 16;
					@Pc(174) int local174 = local140 - this.anInt3456 & Static25.anInt1346;
					local75 -= local85[local174];
					local77 -= local89[local174];
					local73 -= local81[local174];
					local140++;
					@Pc(201) int local201 = local140 + this.anInt3456 & Static25.anInt1346;
					local73 += local81[local201];
					local77 += local89[local201];
					local75 += local85[local201];
				}
				local51[local57 + this.anInt3458 - arg0] = local71;
			}
			@Pc(247) int[] local247 = local19[0];
			@Pc(251) int[] local251 = local19[1];
			@Pc(255) int[] local255 = local19[2];
			for (local75 = 0; local75 < Static339.anInt6735; local75++) {
				local77 = 0;
				@Pc(263) int local263 = 0;
				@Pc(265) int local265 = 0;
				for (@Pc(267) int local267 = 0; local267 < local32; local267++) {
					@Pc(273) int[][] local273 = local51[local267];
					local77 += local273[0][local75];
					local263 += local273[1][local75];
					local265 += local273[2][local75];
				}
				local247[local75] = local36 * local77 >> 16;
				local251[local75] = local263 * local36 >> 16;
				local255[local75] = local36 * local265 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt3456 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt3458 = arg1.method4421();
		} else if (arg0 == 2) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}
}
