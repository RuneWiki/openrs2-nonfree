import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!w", name = "T", descriptor = "I")
	private int anInt5393 = 1;

	@OriginalMember(owner = "client!w", name = "W", descriptor = "I")
	private int anInt5395 = 1;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5393 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt5395 = arg0.method1772();
		} else if (arg1 == 2) {
			super.aBoolean275 = arg0.method1772() == 1;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(19) int local19 = this.anInt5395 + this.anInt5395 + 1;
			@Pc(23) int local23 = 65536 / local19;
			@Pc(31) int local31 = this.anInt5393 + this.anInt5393 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(38) int[][][] local38 = new int[local19][][];
			@Pc(58) int local58;
			@Pc(64) int local64;
			for (@Pc(44) int local44 = arg0 - this.anInt5395; local44 <= this.anInt5395 + arg0; local44++) {
				@Pc(48) int local48 = 0;
				@Pc(56) int[][] local56 = this.method4129(0, local44 & Static42.anInt1193);
				local58 = 0;
				@Pc(62) int[][] local62 = new int[3][Static110.anInt2934];
				local64 = 0;
				@Pc(68) int[] local68 = local56[0];
				@Pc(72) int[] local72 = local56[2];
				@Pc(76) int[] local76 = local56[1];
				for (@Pc(80) int local80 = -this.anInt5393; local80 <= this.anInt5393; local80++) {
					@Pc(86) int local86 = Static2.anInt38 & local80;
					local58 += local76[local86];
					local48 += local68[local86];
					local64 += local72[local86];
				}
				@Pc(113) int[] local113 = local62[1];
				@Pc(117) int[] local117 = local62[0];
				@Pc(121) int[] local121 = local62[2];
				@Pc(123) int local123 = 0;
				while (Static110.anInt2934 > local123) {
					local117[local123] = local48 * local35 >> 16;
					local113[local123] = local35 * local58 >> 16;
					local121[local123] = local35 * local64 >> 16;
					@Pc(157) int local157 = local123 - this.anInt5393 & Static2.anInt38;
					local123++;
					local58 -= local76[local157];
					local48 -= local68[local157];
					local64 -= local72[local157];
					@Pc(184) int local184 = Static2.anInt38 & local123 + this.anInt5393;
					local58 += local76[local184];
					local64 += local72[local184];
					local48 += local68[local184];
				}
				local38[this.anInt5395 + local44 - arg0] = local62;
			}
			@Pc(230) int[] local230 = local7[0];
			@Pc(234) int[] local234 = local7[2];
			@Pc(238) int[] local238 = local7[1];
			for (local58 = 0; local58 < Static110.anInt2934; local58++) {
				local64 = 0;
				@Pc(246) int local246 = 0;
				@Pc(248) int local248 = 0;
				for (@Pc(250) int local250 = 0; local250 < local19; local250++) {
					@Pc(256) int[][] local256 = local38[local250];
					local246 += local256[2][local58];
					local64 += local256[0][local58];
					local248 += local256[1][local58];
				}
				local230[local58] = local23 * local64 >> 16;
				local238[local58] = local248 * local23 >> 16;
				local234[local58] = local246 * local23 >> 16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(28) int local28 = this.anInt5395 + this.anInt5395 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(35) int[][] local35 = new int[local28][];
			@Pc(43) int local43 = this.anInt5393 + this.anInt5393 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(67) int local67;
			for (@Pc(52) int local52 = arg0 - this.anInt5395; local52 <= this.anInt5395 + arg0; local52++) {
				@Pc(62) int[] local62 = this.method4117(0, Static42.anInt1193 & local52);
				@Pc(65) int[] local65 = new int[Static110.anInt2934];
				local67 = 0;
				for (@Pc(71) int local71 = -this.anInt5393; local71 <= this.anInt5393; local71++) {
					local67 += local62[Static2.anInt38 & local71];
				}
				@Pc(92) int local92 = 0;
				while (Static110.anInt2934 > local92) {
					local65[local92] = local67 * local47 >> 16;
					local67 -= local62[Static2.anInt38 & local92 - this.anInt5393];
					local92++;
					local67 += local62[local92 + this.anInt5393 & Static2.anInt38];
				}
				local35[this.anInt5395 + local52 - arg0] = local65;
			}
			for (@Pc(152) int local152 = 0; local152 < Static110.anInt2934; local152++) {
				@Pc(156) int local156 = 0;
				for (local67 = 0; local67 < local28; local67++) {
					local156 += local35[local67][local152];
				}
				local16[local152] = local156 * local32 >> 16;
			}
		}
		return local16;
	}
}
