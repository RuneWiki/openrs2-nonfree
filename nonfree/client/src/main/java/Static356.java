import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public static int anInt6347;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!si;")
	public static final Class223 aClass223_1 = new Class223(14, 1);

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!si;")
	public static final Class223 aClass223_2 = new Class223(15, 4);

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!si;")
	public static final Class223 aClass223_3 = new Class223(16, -2);

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!si;")
	public static final Class223 aClass223_4 = new Class223(17, 0);

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!si;")
	public static final Class223 aClass223_5 = new Class223(18, -2);

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!si;")
	public static final Class223 aClass223_6 = new Class223(20, 6);

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!si;")
	public static final Class223 aClass223_7 = new Class223(21, 8);

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!si;")
	public static final Class223 aClass223_8 = new Class223(22, -2);

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!si;")
	public static final Class223 aClass223_9 = new Class223(23, 4);

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!si;")
	public static final Class223 aClass223_10 = new Class223(24, -1);

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_331 = new Class123(51, 6);

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "[B")
	public static final byte[] aByteArray79 = new byte[2048];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
	public static void method5274(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 11);
		local8.method3084();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!wd;Lclient!qs;BILclient!eq;)Z")
	public static boolean method5276(@OriginalArg(1) Class260 arg0, @OriginalArg(2) Class6_Sub32 arg1, @OriginalArg(5) Class66 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray531 != null) {
			local7 = Static7.anInt1145 + (arg1.anInt5701 + arg0.anInt7734 - Static7.anInt1144) * (-Static7.anInt1145 + Static7.anInt1142) / (Static7.anInt1140 - Static7.anInt1144);
			local13 = Static7.anInt1148 - (Static7.anInt1148 - Static7.anInt1143) * (arg0.anInt7737 - (-arg1.anInt5705 + Static7.anInt1146)) / (Static7.anInt1149 - Static7.anInt1146);
			local9 = Static7.anInt1145 + (Static7.anInt1142 - Static7.anInt1145) * (arg0.anInt7748 - -arg1.anInt5701 - Static7.anInt1144) / (Static7.anInt1140 - Static7.anInt1144);
			local11 = Static7.anInt1148 - (Static7.anInt1148 - Static7.anInt1143) * (arg1.anInt5705 + arg0.anInt7727 - Static7.anInt1146) / (Static7.anInt1149 - Static7.anInt1146);
		}
		@Pc(103) Class87 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg0.anInt7745 != -1) {
			if (arg1.aBoolean354 && arg0.anInt7753 != -1) {
				local103 = arg0.method6335(arg2, true);
			} else {
				local103 = arg0.method6335(arg2, false);
			}
			if (local103 != null) {
				local105 = arg1.anInt5702 - (local103.method6565() + 1 >> 1);
				local107 = arg1.anInt5702 + (local103.method6565() + 1 >> 1);
				if (local7 > local105) {
					local7 = local105;
				}
				if (local9 < local107) {
					local9 = local107;
				}
				local109 = arg1.anInt5703 - (local103.method6561() + 1 >> 1);
				if (local109 < local11) {
					local11 = local109;
				}
				local111 = arg1.anInt5703 + (local103.method6561() + 1 >> 1);
				if (local13 < local111) {
					local13 = local111;
				}
			}
		}
		@Pc(205) Class116 local205 = null;
		@Pc(207) int local207 = 0;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(276) int local276;
		@Pc(303) int local303;
		if (arg0.aString70 != null) {
			local205 = Static157.method2649(arg0.anInt7751);
			if (local205 != null) {
				local207 = Static8.aClass166_1.method3883(null, arg0.aString70, Static301.aStringArray31, null);
				local209 = arg1.anInt5703;
				if (local103 == null) {
					local209 -= local207 * local205.method2800() / 2;
				} else {
					local209 -= (local103.method6561() >> 1) + (local207 * local205.method2799());
				}
				for (local276 = 0; local276 < local207; local276++) {
					@Pc(282) String local282 = Static301.aStringArray31[local276];
					if (local276 < local207 - 1) {
						local282 = local282.substring(0, local282.length() - 4);
					}
					local303 = local205.method2797(local282);
					if (local303 > local211) {
						local211 = local303;
					}
				}
				local213 = arg1.anInt5702 - local211 / 2;
				local220 = local211 / 2 + arg1.anInt5702;
				if (local7 > local213) {
					local7 = local213;
				}
				if (local9 < local220) {
					local9 = local220;
				}
				local222 = local209;
				local224 = local207 * local205.method2799() + local209;
				if (local11 > local222) {
					local11 = local222;
				}
				if (local13 < local224) {
					local13 = local224;
				}
			}
		}
		if (Static7.anInt1145 > local9 || Static7.anInt1142 < local7 || local13 < Static7.anInt1143 || Static7.anInt1148 < local11) {
			return true;
		}
		@Pc(404) int local404;
		if (arg0.anIntArray531 != null) {
			@Pc(402) int[] local402 = new int[arg0.anIntArray531.length];
			for (local404 = 0; local404 < local402.length / 2; local404++) {
				local303 = arg1.anInt5701 + arg0.anIntArray531[local404 * 2];
				@Pc(428) int local428 = arg0.anIntArray531[local404 * 2 + 1] + arg1.anInt5705;
				local402[local404 * 2] = (Static7.anInt1142 - Static7.anInt1145) * (local303 + -Static7.anInt1144) / (Static7.anInt1140 - Static7.anInt1144) + Static7.anInt1145;
				local402[local404 * 2 + 1] = Static7.anInt1148 - (local428 - Static7.anInt1146) * (Static7.anInt1148 - Static7.anInt1143) / (Static7.anInt1149 - Static7.anInt1146);
			}
			Static239.method3685(arg2, local402, arg0.anInt7747);
			for (local303 = 0; local303 < local402.length / 2 - 1; local303++) {
				arg2.method5001(local402[local303 * 2 + 2], local402[local303 * 2 + 2 + 1], local402[local303 * 2], local402[local303 * 2 + 1], arg0.anInt7740);
			}
			arg2.method5001(local402[0], local402[1], local402[local402.length - 2], local402[local402.length - 1], arg0.anInt7740);
		}
		if (local103 != null) {
			if (Static224.anInt4061 > 0 && (Static224.anInt4054 != -1 && arg1.anInt5707 == Static224.anInt4054 || Static138.anInt4528 != -1 && Static138.anInt4528 == arg0.anInt7733)) {
				if (Static373.anInt6709 <= 50) {
					local276 = Static373.anInt6709 * 2;
				} else {
					local276 = 200 - Static373.anInt6709 * 2;
				}
				local404 = local276 << 24 | 0xFFFF00;
				arg2.method5043(local404, arg1.anInt5703, local103.method6555() / 2 + 7, arg1.anInt5702);
				arg2.method5043(local404, arg1.anInt5703, local103.method6555() / 2 + 5, arg1.anInt5702);
				arg2.method5043(local404, arg1.anInt5703, local103.method6555() / 2 + 3, arg1.anInt5702);
				arg2.method5043(local404, arg1.anInt5703, local103.method6555() / 2 + 1, arg1.anInt5702);
				arg2.method5043(local404, arg1.anInt5703, local103.method6555() / 2, arg1.anInt5702);
			}
			local103.method6567(arg1.anInt5702 - (local103.method6565() >> 1), arg1.anInt5703 - (local103.method6561() >> 1));
		}
		if (arg0.aString70 != null && local205 != null) {
			Static202.method3128(local207, local211, local205, arg2, arg1, local209, arg0);
		}
		if (arg0.anInt7745 != -1 || arg0.aString70 != null) {
			@Pc(706) Class6_Sub31 local706 = new Class6_Sub31(arg1);
			local706.anInt5684 = local220;
			local706.anInt5680 = local213;
			local706.anInt5688 = local105;
			local706.anInt5691 = local107;
			local706.anInt5681 = local109;
			local706.anInt5683 = local222;
			local706.anInt5685 = local224;
			local706.anInt5690 = local111;
			Static173.aClass244_15.method5966(local706);
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!ts;I)V")
	public static void method5277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2) {
		if (Static174.aBoolean224) {
			@Pc(18) Class171 local18 = Static327.anInt5631 == -1 ? null : Static80.aClass181_1.method4294(Static327.anInt5631);
			if (Static50.method1150(arg2).method1220() && (Static405.anInt7261 & 0x20) != 0 && (local18 == null || arg2.method5737(Static327.anInt5631, local18.anInt4865) != local18.anInt4865)) {
				Static114.method4751(true, 0L, 57, Static104.aString16, arg2.anInt6907, arg2.anInt6903, Static289.aString36 + " -> " + arg2.aString60, arg2.anInt6908, false, Static67.anInt1750);
			}
			return;
		}
		@Pc(84) String local84;
		for (@Pc(77) int local77 = 9; local77 >= 5; local77--) {
			local84 = Static135.method2403(local77, arg2);
			if (local84 != null) {
				Static114.method4751(true, (long) (local77 + 1), 1011, local84, arg2.anInt6907, arg2.anInt6903, arg2.aString60, arg2.anInt6908, false, Static231.method6546(arg2, local77));
			}
		}
		local84 = Static39.method947(arg2);
		if (local84 != null) {
			Static114.method4751(true, 0L, 18, local84, arg2.anInt6907, arg2.anInt6903, arg2.aString60, arg2.anInt6908, false, arg2.anInt6957);
		}
		for (@Pc(147) int local147 = 4; local147 >= 0; local147--) {
			@Pc(154) String local154 = Static135.method2403(local147, arg2);
			if (local154 != null) {
				Static114.method4751(true, (long) (local147 + 1), 60, local154, arg2.anInt6907, arg2.anInt6903, arg2.aString60, arg2.anInt6908, false, Static231.method6546(arg2, local147));
			}
		}
		if (!Static50.method1150(arg2).method1227()) {
			return;
		}
		if (arg2.aString59 == null) {
			Static114.method4751(true, 0L, 46, Static306.aClass267_72.method6581(Static161.anInt3239), arg2.anInt6907, arg2.anInt6903, "", arg2.anInt6908, false, -1);
		} else {
			Static114.method4751(true, 0L, 46, arg2.aString59, arg2.anInt6907, arg2.anInt6903, "", arg2.anInt6908, false, -1);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
	public static int method5278() {
		return 2;
	}
}
