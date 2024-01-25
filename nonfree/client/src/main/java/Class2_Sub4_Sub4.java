import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub4_Sub4 extends Class2_Sub4 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	private int anInt497 = 1;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "I")
	private int anInt504 = 1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(31) int local31 = this.anInt497 + this.anInt497 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt504 + this.anInt504 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local31][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt497; local57 <= this.anInt497 + arg0; local57++) {
				@Pc(67) int[][] local67 = this.method5591(Static283.anInt4900 & local57, 0);
				@Pc(71) int[][] local71 = new int[3][Static76.anInt1458];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt504; local93 <= this.anInt504; local93++) {
					@Pc(99) int local99 = local93 & Static269.anInt4657;
					local73 += local81[local99];
					local75 += local85[local99];
					local77 += local89[local99];
				}
				@Pc(126) int[] local126 = local71[0];
				@Pc(130) int[] local130 = local71[1];
				@Pc(134) int[] local134 = local71[2];
				@Pc(136) int local136 = 0;
				while (local136 < Static76.anInt1458) {
					local126[local136] = local48 * local73 >> 16;
					local130[local136] = local75 * local48 >> 16;
					local134[local136] = local77 * local48 >> 16;
					@Pc(170) int local170 = local136 - this.anInt504 & Static269.anInt4657;
					local75 -= local85[local170];
					local73 -= local81[local170];
					local77 -= local89[local170];
					local136++;
					@Pc(196) int local196 = this.anInt504 + local136 & Static269.anInt4657;
					local73 += local81[local196];
					local77 += local89[local196];
					local75 += local85[local196];
				}
				local51[local57 + this.anInt497 - arg0] = local71;
			}
			@Pc(238) int[] local238 = local11[0];
			@Pc(242) int[] local242 = local11[1];
			@Pc(246) int[] local246 = local11[2];
			for (local75 = 0; local75 < Static76.anInt1458; local75++) {
				local77 = 0;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				for (@Pc(258) int local258 = 0; local258 < local31; local258++) {
					@Pc(264) int[][] local264 = local51[local258];
					local256 += local264[2][local75];
					local77 += local264[0][local75];
					local254 += local264[1][local75];
				}
				local238[local75] = local35 * local77 >> 16;
				local242[local75] = local35 * local254 >> 16;
				local246[local75] = local35 * local256 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt504 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt497 = arg0.method5350();
		} else if (arg1 == 2) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(28) int local28 = this.anInt497 + this.anInt497 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt504 + this.anInt504 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt497; local53 <= this.anInt497 + arg0; local53++) {
				@Pc(63) int[] local63 = this.method5600(Static283.anInt4900 & local53, 0);
				@Pc(66) int[] local66 = new int[Static76.anInt1458];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt504; local72 <= this.anInt504; local72++) {
					local68 += local63[local72 & Static269.anInt4657];
				}
				@Pc(93) int local93 = 0;
				while (Static76.anInt1458 > local93) {
					local66[local93] = local44 * local68 >> 16;
					local68 -= local63[local93 - this.anInt504 & Static269.anInt4657];
					local93++;
					local68 += local63[Static269.anInt4657 & local93 + this.anInt504];
				}
				local47[local53 + this.anInt497 - arg0] = local66;
			}
			for (@Pc(158) int local158 = 0; local158 < Static76.anInt1458; local158++) {
				@Pc(162) int local162 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local162 += local47[local68][local158];
				}
				local16[local158] = local32 * local162 >> 16;
			}
		}
		return local16;
	}
}
