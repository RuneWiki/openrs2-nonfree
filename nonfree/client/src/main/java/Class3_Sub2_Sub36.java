import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!td", name = "M", descriptor = "I")
	private int anInt5402 = 1;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	private int anInt5404 = 1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt5402 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt5404 = arg1.method3915();
		} else if (arg0 == 2) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(30) int local30 = this.anInt5404 + this.anInt5404 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt5402 + this.anInt5402 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local30][];
			@Pc(54) int local54;
			for (local54 = arg0 - this.anInt5404; local54 <= arg0 + this.anInt5404; local54++) {
				@Pc(72) int[] local72 = this.method4954(Static148.anInt2810 & local54, 0);
				@Pc(75) int[] local75 = new int[Static22.anInt421];
				@Pc(77) int local77 = 0;
				@Pc(81) int local81;
				for (local81 = -this.anInt5402; local81 <= this.anInt5402; local81++) {
					local77 += local72[Static84.anInt1566 & local81];
				}
				local81 = 0;
				while (local81 < Static22.anInt421) {
					local75[local81] = local46 * local77 >> 16;
					local77 -= local72[local81 - this.anInt5402 & Static84.anInt1566];
					local81++;
					local77 += local72[Static84.anInt1566 & this.anInt5402 + local81];
				}
				local49[local54 + this.anInt5404 - arg0] = local75;
			}
			for (local54 = 0; local54 < Static22.anInt421; local54++) {
				@Pc(156) int local156 = 0;
				for (@Pc(158) int local158 = 0; local158 < local30; local158++) {
					local156 += local49[local158][local54];
				}
				local17[local54] = local156 * local34 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(31) int local31 = this.anInt5404 + this.anInt5404 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt5402 + this.anInt5402 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(80) int local80;
			@Pc(82) int local82;
			@Pc(84) int local84;
			for (@Pc(56) int local56 = arg0 - this.anInt5404; local56 <= arg0 + this.anInt5404; local56++) {
				@Pc(74) int[][] local74 = this.method4965(Static148.anInt2810 & local56, 0);
				@Pc(78) int[][] local78 = new int[3][Static22.anInt421];
				local80 = 0;
				local82 = 0;
				local84 = 0;
				@Pc(88) int[] local88 = local74[0];
				@Pc(92) int[] local92 = local74[1];
				@Pc(96) int[] local96 = local74[2];
				for (@Pc(100) int local100 = -this.anInt5402; local100 <= this.anInt5402; local100++) {
					@Pc(108) int local108 = local100 & Static84.anInt1566;
					local84 += local96[local108];
					local82 += local92[local108];
					local80 += local88[local108];
				}
				@Pc(133) int[] local133 = local78[0];
				@Pc(137) int[] local137 = local78[1];
				@Pc(141) int[] local141 = local78[2];
				@Pc(143) int local143 = 0;
				while (Static22.anInt421 > local143) {
					local133[local143] = local47 * local80 >> 16;
					local137[local143] = local47 * local82 >> 16;
					local141[local143] = local47 * local84 >> 16;
					@Pc(177) int local177 = Static84.anInt1566 & local143 - this.anInt5402;
					local143++;
					local84 -= local96[local177];
					local80 -= local88[local177];
					local82 -= local92[local177];
					@Pc(203) int local203 = Static84.anInt1566 & this.anInt5402 + local143;
					local82 += local92[local203];
					local80 += local88[local203];
					local84 += local96[local203];
				}
				local50[local56 + this.anInt5404 - arg0] = local78;
			}
			@Pc(240) int[] local240 = local18[1];
			@Pc(244) int[] local244 = local18[2];
			@Pc(248) int[] local248 = local18[0];
			for (local80 = 0; local80 < Static22.anInt421; local80++) {
				local82 = 0;
				local84 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local31; local265++) {
					@Pc(276) int[][] local276 = local50[local265];
					local82 += local276[0][local80];
					local263 += local276[2][local80];
					local84 += local276[1][local80];
				}
				local248[local80] = local82 * local35 >> 16;
				local240[local80] = local84 * local35 >> 16;
				local244[local80] = local263 * local35 >> 16;
			}
		}
		return local18;
	}
}
