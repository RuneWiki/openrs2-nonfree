import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
	private int anInt1742;

	@OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
	private int anInt1746;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(30) int local30 = this.anInt1746 + this.anInt1746 + 1;
			@Pc(33) int[][][] local33 = new int[local30][][];
			@Pc(41) int local41 = this.anInt1742 + this.anInt1742 + 1;
			@Pc(70) int local70;
			@Pc(62) int local62;
			for (@Pc(46) int local46 = arg0 - this.anInt1746; local46 <= arg0 + this.anInt1746; local46++) {
				@Pc(56) int[][] local56 = this.method3118(local46 & Static64.anInt1680, 0);
				@Pc(60) int[][] local60 = new int[3][Static110.anInt2825];
				local62 = 0;
				@Pc(64) int local64 = 0;
				@Pc(68) int[] local68 = local56[0];
				local70 = 0;
				@Pc(74) int[] local74 = local56[1];
				@Pc(78) int[] local78 = local56[2];
				for (@Pc(82) int local82 = -this.anInt1742; local82 <= this.anInt1742; local82++) {
					@Pc(88) int local88 = local82 & Static99.anInt2523;
					local64 += local68[local88];
					local70 += local74[local88];
					local62 += local78[local88];
				}
				@Pc(119) int[] local119 = local60[1];
				@Pc(123) int[] local123 = local60[0];
				@Pc(127) int[] local127 = local60[2];
				@Pc(129) int local129 = 0;
				while (local129 < Static110.anInt2825) {
					local123[local129] = local64 / local41;
					local119[local129] = local70 / local41;
					local127[local129] = local62 / local41;
					@Pc(156) int local156 = local129 - this.anInt1742 & Static99.anInt2523;
					local70 -= local74[local156];
					local64 -= local68[local156];
					local129++;
					local62 -= local78[local156];
					@Pc(182) int local182 = local129 + this.anInt1742 & Static99.anInt2523;
					local64 += local68[local182];
					local70 += local74[local182];
					local62 += local78[local182];
				}
				local33[this.anInt1746 + local46 - arg0] = local60;
			}
			@Pc(228) int[] local228 = local17[0];
			@Pc(232) int[] local232 = local17[1];
			@Pc(236) int[] local236 = local17[2];
			for (local70 = 0; local70 < Static110.anInt2825; local70++) {
				local62 = 0;
				@Pc(244) int local244 = 0;
				@Pc(246) int local246 = 0;
				for (@Pc(248) int local248 = 0; local248 < local30; local248++) {
					@Pc(254) int[][] local254 = local33[local248];
					local244 += local254[1][local70];
					local246 += local254[2][local70];
					local62 += local254[0][local70];
				}
				local228[local70] = local62 / local30;
				local232[local70] = local244 / local30;
				local236[local70] = local246 / local30;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1742 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt1746 = arg0.method861();
		} else if (arg1 == 2) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(24) int local24 = this.anInt1746 + this.anInt1746 + 1;
			@Pc(27) int[][] local27 = new int[local24][];
			@Pc(36) int local36 = this.anInt1742 + this.anInt1742 + 1;
			@Pc(57) int local57;
			for (@Pc(42) int local42 = arg0 - this.anInt1746; local42 <= this.anInt1746 + arg0; local42++) {
				@Pc(52) int[] local52 = this.method3130(0, local42 & Static64.anInt1680);
				@Pc(55) int[] local55 = new int[Static110.anInt2825];
				local57 = 0;
				for (@Pc(61) int local61 = -this.anInt1742; local61 <= this.anInt1742; local61++) {
					local57 += local52[Static99.anInt2523 & local61];
				}
				@Pc(82) int local82 = 0;
				while (Static110.anInt2825 > local82) {
					local55[local82] = local57 / local36;
					local57 -= local52[local82 - this.anInt1742 & Static99.anInt2523];
					local82++;
					local57 += local52[Static99.anInt2523 & this.anInt1742 + local82];
				}
				local27[this.anInt1746 + local42 - arg0] = local55;
			}
			for (@Pc(140) int local140 = 0; local140 < Static110.anInt2825; local140++) {
				@Pc(144) int local144 = 0;
				for (local57 = 0; local57 < local24; local57++) {
					local144 += local27[local57][local140];
				}
				local11[local140] = local144 / local24;
			}
		}
		return local11;
	}
}
