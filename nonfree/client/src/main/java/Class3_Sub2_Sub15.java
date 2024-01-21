import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
	private int anInt1689 = 1;

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
	private int anInt1688 = 1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1688 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt1689 = arg0.method1278();
		} else if (arg1 == 2) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(32) int local32 = this.anInt1689 + this.anInt1689 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(45) int local45 = this.anInt1688 + this.anInt1688 + 1;
			@Pc(48) int[][] local48 = new int[local32][];
			@Pc(52) int local52 = 65536 / local45;
			@Pc(73) int local73;
			for (@Pc(58) int local58 = arg0 - this.anInt1689; local58 <= this.anInt1689 + arg0; local58++) {
				@Pc(68) int[] local68 = this.method3328(0, Static170.anInt1101 & local58);
				@Pc(71) int[] local71 = new int[Static190.anInt3865];
				local73 = 0;
				for (@Pc(77) int local77 = -this.anInt1688; local77 <= this.anInt1688; local77++) {
					local73 += local68[Static134.anInt2681 & local77];
				}
				@Pc(94) int local94 = 0;
				while (local94 < Static190.anInt3865) {
					local71[local94] = local52 * local73 >> 16;
					local73 -= local68[local94 - this.anInt1688 & Static134.anInt2681];
					local94++;
					local73 += local68[Static134.anInt2681 & local94 + this.anInt1688];
				}
				local48[this.anInt1689 + local58 - arg0] = local71;
			}
			for (@Pc(155) int local155 = 0; local155 < Static190.anInt3865; local155++) {
				@Pc(159) int local159 = 0;
				for (local73 = 0; local73 < local32; local73++) {
					local159 += local48[local73][local155];
				}
				local11[local155] = local36 * local159 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(28) int local28 = this.anInt1689 + this.anInt1689 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt1688 + this.anInt1688 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(86) int local86;
			@Pc(84) int local84;
			for (@Pc(54) int local54 = arg0 - this.anInt1689; local54 <= this.anInt1689 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method3332(0, Static170.anInt1101 & local54);
				@Pc(66) int local66 = 0;
				@Pc(70) int[][] local70 = new int[3][Static190.anInt3865];
				@Pc(74) int[] local74 = local64[0];
				@Pc(78) int[] local78 = local64[2];
				@Pc(82) int[] local82 = local64[1];
				local84 = 0;
				local86 = 0;
				for (@Pc(90) int local90 = -this.anInt1688; local90 <= this.anInt1688; local90++) {
					@Pc(96) int local96 = Static134.anInt2681 & local90;
					local84 += local78[local96];
					local86 += local82[local96];
					local66 += local74[local96];
				}
				@Pc(127) int[] local127 = local70[0];
				@Pc(131) int[] local131 = local70[1];
				@Pc(135) int[] local135 = local70[2];
				@Pc(137) int local137 = 0;
				while (Static190.anInt3865 > local137) {
					local127[local137] = local66 * local45 >> 16;
					local131[local137] = local45 * local86 >> 16;
					local135[local137] = local84 * local45 >> 16;
					@Pc(171) int local171 = Static134.anInt2681 & local137 - this.anInt1688;
					local66 -= local74[local171];
					local137++;
					local86 -= local82[local171];
					local84 -= local78[local171];
					@Pc(197) int local197 = Static134.anInt2681 & this.anInt1688 + local137;
					local84 += local78[local197];
					local86 += local82[local197];
					local66 += local74[local197];
				}
				local48[this.anInt1689 + local54 - arg0] = local70;
			}
			@Pc(246) int[] local246 = local16[0];
			@Pc(250) int[] local250 = local16[2];
			@Pc(254) int[] local254 = local16[1];
			for (local86 = 0; local86 < Static190.anInt3865; local86++) {
				local84 = 0;
				@Pc(262) int local262 = 0;
				@Pc(264) int local264 = 0;
				for (@Pc(266) int local266 = 0; local266 < local28; local266++) {
					@Pc(272) int[][] local272 = local48[local266];
					local262 += local272[2][local86];
					local84 += local272[0][local86];
					local264 += local272[1][local86];
				}
				local246[local86] = local32 * local84 >> 16;
				local254[local86] = local264 * local32 >> 16;
				local250[local86] = local262 * local32 >> 16;
			}
		}
		return local16;
	}
}
