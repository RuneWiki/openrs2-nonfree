import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!l", name = "U", descriptor = "I")
	private int anInt1966;

	@OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
	private int anInt1972;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1966 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt1972 = arg0.method1354();
		} else if (arg1 == 2) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(19) int local19 = this.anInt1972 + this.anInt1972 + 1;
			@Pc(28) int local28 = this.anInt1966 + this.anInt1966 + 1;
			@Pc(31) int[][][] local31 = new int[local19][][];
			@Pc(54) int local54;
			@Pc(60) int local60;
			for (@Pc(36) int local36 = arg0 - this.anInt1972; local36 <= this.anInt1972 + arg0; local36++) {
				@Pc(46) int[][] local46 = this.method2785(Static124.anInt2869 & local36, 0);
				@Pc(48) int local48 = 0;
				@Pc(52) int[][] local52 = new int[3][Static86.anInt1942];
				local54 = 0;
				@Pc(58) int[] local58 = local46[0];
				local60 = 0;
				@Pc(64) int[] local64 = local46[1];
				@Pc(68) int[] local68 = local46[2];
				for (@Pc(72) int local72 = -this.anInt1966; local72 <= this.anInt1966; local72++) {
					@Pc(78) int local78 = Static165.anInt321 & local72;
					local48 += local58[local78];
					local54 += local64[local78];
					local60 += local68[local78];
				}
				@Pc(105) int[] local105 = local52[0];
				@Pc(109) int[] local109 = local52[1];
				@Pc(113) int[] local113 = local52[2];
				@Pc(115) int local115 = 0;
				while (local115 < Static86.anInt1942) {
					local105[local115] = local48 / local28;
					local109[local115] = local54 / local28;
					local113[local115] = local60 / local28;
					@Pc(143) int local143 = Static165.anInt321 & local115 - this.anInt1966;
					local60 -= local68[local143];
					local48 -= local58[local143];
					local54 -= local64[local143];
					local115++;
					@Pc(169) int local169 = this.anInt1966 + local115 & Static165.anInt321;
					local60 += local68[local169];
					local48 += local58[local169];
					local54 += local64[local169];
				}
				local31[local36 + this.anInt1972 - arg0] = local52;
			}
			@Pc(215) int[] local215 = local7[0];
			@Pc(219) int[] local219 = local7[1];
			@Pc(223) int[] local223 = local7[2];
			for (local54 = 0; local54 < Static86.anInt1942; local54++) {
				@Pc(229) int local229 = 0;
				local60 = 0;
				@Pc(233) int local233 = 0;
				for (@Pc(235) int local235 = 0; local235 < local19; local235++) {
					@Pc(241) int[][] local241 = local31[local235];
					local233 += local241[2][local54];
					local229 += local241[1][local54];
					local60 += local241[0][local54];
				}
				local215[local54] = local60 / local19;
				local219[local54] = local229 / local19;
				local223[local54] = local233 / local19;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(28) int local28 = this.anInt1966 + this.anInt1966 + 1;
			@Pc(36) int local36 = this.anInt1972 + this.anInt1972 + 1;
			@Pc(39) int[][] local39 = new int[local36][];
			@Pc(60) int local60;
			for (@Pc(45) int local45 = arg0 - this.anInt1972; local45 <= arg0 + this.anInt1972; local45++) {
				@Pc(55) int[] local55 = this.method2787(local45 & Static124.anInt2869, 0);
				@Pc(58) int[] local58 = new int[Static86.anInt1942];
				local60 = 0;
				for (@Pc(64) int local64 = -this.anInt1966; local64 <= this.anInt1966; local64++) {
					local60 += local55[local64 & Static165.anInt321];
				}
				@Pc(85) int local85 = 0;
				while (Static86.anInt1942 > local85) {
					local58[local85] = local60 / local28;
					local60 -= local55[Static165.anInt321 & local85 - this.anInt1966];
					local85++;
					local60 += local55[Static165.anInt321 & local85 + this.anInt1966];
				}
				local39[this.anInt1972 + local45 - arg0] = local58;
			}
			for (@Pc(139) int local139 = 0; local139 < Static86.anInt1942; local139++) {
				@Pc(143) int local143 = 0;
				for (local60 = 0; local60 < local36; local60++) {
					local143 += local39[local60][local139];
				}
				local15[local139] = local143 / local36;
			}
		}
		return local15;
	}
}
