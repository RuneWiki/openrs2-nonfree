import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!sk", name = "F", descriptor = "Lclient!na;")
	public static Class117 aClass117_2;

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Lclient!hc;")
	public static Class69 aClass69_1 = new Class69();

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
	public static int anInt5234 = 2;

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
	public static int anInt5245 = 0;

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "[I")
	public static int[] anIntArray550 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ug;II)Lclient!jo;")
	public static Class3_Sub4_Sub14 method4297(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		@Pc(37) Class3_Sub4_Sub14 local37 = new Class3_Sub4_Sub14(arg1, arg0.method3931(), arg0.method3931(), arg0.method3896(), arg0.method3896(), arg0.method3915() == 1, arg0.method3915());
		@Pc(41) int local41 = arg0.method3915();
		for (@Pc(43) int local43 = 0; local43 < local41; local43++) {
			local37.aClass56_6.method1282(new Class3_Sub5(arg0.method3915(), arg0.method3915(), arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948(), arg0.method3948()));
		}
		local37.method2359();
		return local37;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)I")
	public static int method4299() {
		if (Static73.aFrame1 != null) {
			return 3;
		} else if (Static283.aBoolean393 && Static91.aBoolean139) {
			return 2;
		} else if (Static283.aBoolean393 && !Static91.aBoolean139) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	public static void method4300() {
		if (Static73.aClass151_1 != null || (Static191.aClass151_10 != null || Static129.anInt2458 > 0)) {
			return;
		}
		@Pc(22) int local22 = Static40.anInt6052;
		@Pc(29) int local29;
		@Pc(85) int local85;
		if (!Static118.aBoolean169) {
			if (local22 == 1 && Static152.anInt2876 > 0) {
				@Pc(216) short local216 = Static259.aShortArray87[Static152.anInt2876 - 1];
				if (local216 == 43 || local216 == 3 || local216 == 24 || local216 == 9 || local216 == 7 || local216 == 21 || local216 == 47 || local216 == 12 || local216 == 15 || local216 == 51 || local216 == 16 || local216 == 1009) {
					local85 = Static196.anIntArray438[Static152.anInt2876 - 1];
					local29 = Static56.anIntArray99[Static152.anInt2876 - 1];
					@Pc(277) Class151 local277 = Static243.method4115(local85);
					@Pc(280) Class3_Sub31 local280 = Static42.method612(local277);
					if (local280.method4795() || local280.method4786()) {
						Static100.anInt1840 = 0;
						Static256.aBoolean366 = false;
						if (Static73.aClass151_1 != null) {
							Static134.method3639(Static73.aClass151_1);
						}
						Static73.aClass151_1 = Static243.method4115(local85);
						Static235.anInt4700 = Static293.anInt5844;
						Static4.anInt4060 = Static7.anInt169;
						Static94.anInt1708 = local29;
						Static134.method3639(Static73.aClass151_1);
						return;
					}
				}
			}
			if (local22 == 1 && (Static11.anInt5182 == 1 && Static152.anInt2876 > 2 || Static60.method598(Static152.anInt2876 - 1))) {
				local22 = 2;
			}
			if (local22 == 2 && Static152.anInt2876 > 0 || Static212.anInt4151 == 1) {
				Static173.method2867();
			}
			if (local22 == 1 && Static152.anInt2876 > 0 || Static212.anInt4151 == 2) {
				Static138.method2355();
			}
			return;
		}
		@Pc(31) int local31;
		if (local22 != 1) {
			local29 = Static153.anInt2892;
			local31 = Static167.anInt3153;
			if (local31 < Static173.anInt3249 - 10 || Static175.anInt3271 + Static173.anInt3249 + 10 < local31 || local29 < Static300.anInt5922 - 10 || Static205.anInt4054 + Static300.anInt5922 + 10 < local29) {
				Static118.aBoolean169 = false;
				Static35.method534(Static205.anInt4054, Static175.anInt3271, Static300.anInt5922, Static173.anInt3249);
			}
		}
		if (local22 != 1) {
			return;
		}
		local31 = Static173.anInt3249;
		local29 = Static300.anInt5922;
		@Pc(83) int local83 = Static293.anInt5844;
		local85 = Static175.anInt3271;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = Static7.anInt169;
		for (@Pc(91) int local91 = 0; local91 < Static152.anInt2876; local91++) {
			@Pc(113) int local113;
			if (Static34.aBoolean53) {
				local113 = local29 + (-local91 + (Static152.anInt2876 - 1)) * 15 + 33;
				if (local31 < local83 && local31 + local85 > local83 && local113 - 13 < local89 && local89 < local113 + 3) {
					local87 = local91;
				}
			} else {
				local113 = local29 + (Static152.anInt2876 - local91 + -1) * 15 + 31;
				if (local83 > local31 && local83 < local31 + local85 && local113 - 13 < local89 && local89 < local113 + 3) {
					local87 = local91;
				}
			}
		}
		if (local87 != -1) {
			Static286.method4486(local87);
		}
		Static118.aBoolean169 = false;
		Static35.method534(Static205.anInt4054, Static175.anInt3271, Static300.anInt5922, Static173.anInt3249);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Lclient!jg;")
	public static Class85 method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4483; local13++) {
			@Pc(22) Class85 local22 = local7.aClass85Array3[local13];
			if ((local22.aLong107 >> 29 & 0x3L) == 2L && local22.anInt2482 == arg1 && local22.anInt2480 == arg2) {
				Static167.method2791(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!rg;)Ljava/lang/String;")
	public static String method4303(@OriginalArg(1) int arg0, @OriginalArg(2) Class151 arg1) {
		if (!Static42.method612(arg1).method4794(arg0) && arg1.anObjectArray28 == null) {
			return null;
		} else if (arg1.aStringArray34 == null || arg1.aStringArray34.length <= arg0 || arg1.aStringArray34[arg0] == null || arg1.aStringArray34[arg0].trim().length() == 0) {
			return Static244.aBoolean346 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray34[arg0];
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZIIIIIF)[[I")
	public static int[][] method4304(@OriginalArg(8) float arg0) {
		@Pc(5) int[][] local5 = new int[256][64];
		@Pc(13) Class3_Sub2_Sub6 local13 = new Class3_Sub2_Sub6();
		local13.anInt803 = (int) (arg0 * 4096.0F);
		local13.anInt811 = 4;
		local13.anInt799 = 8;
		local13.anInt801 = 3;
		local13.aBoolean69 = false;
		local13.method4952();
		Static10.method156(256, 64);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method656(local40, local5[local40]);
		}
		return local5;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!rn;IB)[Lclient!kk;")
	public static Class81_Sub2[] method4305(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1) {
		return Static287.method4736(arg1, arg0) ? Static170.method2811() : null;
	}
}
