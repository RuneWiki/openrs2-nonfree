import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!te", name = "D", descriptor = "Lclient!uj;")
	public static Class4_Sub3_Sub14 aClass4_Sub3_Sub14_8;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	public static int anInt5118 = 0;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "I")
	public static int anInt5121 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!pm;I)V")
	public static void method4186(@OriginalArg(0) Class139 arg0) {
		@Pc(3) Class105 local3 = null;
		Static10.anInt185 = 3;
		Static280.method665(true);
		Static66.aBoolean75 = true;
		Static233.aBoolean227 = true;
		Static141.aBoolean399 = true;
		Static208.anInt4120 = 127;
		Static27.aBoolean27 = true;
		Static117.aBoolean159 = true;
		Static56.aBoolean66 = true;
		Static312.aBoolean422 = true;
		Static303.aBoolean394 = true;
		Static273.aBoolean122 = true;
		Static179.anInt3403 = 0;
		Static279.aBoolean363 = true;
		Static114.anInt2298 = 2;
		Static171.anInt3315 = 127;
		Static137.anInt2627 = 0;
		Static55.anInt1125 = 0;
		Static82.aBoolean117 = true;
		Static21.anInt1051 = 0;
		Static24.anInt344 = 255;
		if (Static164.anInt3256 < 96) {
			Static184.method2970(0);
		} else {
			Static184.method2970(2);
		}
		Static205.aBoolean278 = false;
		Static192.anInt3637 = 0;
		Static300.aBoolean391 = false;
		Static222.anInt4292 = 0;
		Static61.aBoolean69 = true;
		Static203.anInt3909 = 0;
		Static212.aBoolean293 = false;
		try {
			@Pc(84) Class185 local84 = arg0.method3508("runescape");
			while (local84.anInt5623 == 0) {
				Static303.method4677(1L);
			}
			if (local84.anInt5623 == 1) {
				local3 = (Class105) local84.anObject7;
				@Pc(102) int local102 = 0;
				@Pc(108) byte[] local108 = new byte[(int) local3.method2243()];
				while (local102 < local108.length) {
					@Pc(126) int local126 = local3.method2242(local108, local108.length - local102, local102);
					if (local126 == -1) {
						throw new IOException("EOF");
					}
					local102 += local126;
				}
				Static303.method4680(new Class4_Sub10(local108));
			}
		} catch (@Pc(153) Exception local153) {
		}
		try {
			if (local3 != null) {
				local3.method2246();
			}
		} catch (@Pc(160) Exception local160) {
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ua;IIII)V")
	public static void method4189(@OriginalArg(0) Class171 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static300.anInt5638 >= 400) {
			return;
		}
		if (arg0.anIntArray590 != null) {
			arg0 = arg0.method4302();
		}
		if (arg0 == null || !arg0.aBoolean358) {
			return;
		}
		@Pc(38) String local38 = arg0.aString323;
		if (arg0.anInt5247 != 0) {
			@Pc(51) String local51 = Static76.anInt5724 == 1 ? Static20.aString29 : Static306.aString355;
			local38 = local38 + Static124.method1922(Static154.aClass53_Sub1_Sub1_2.anInt1597, arg0.anInt5247) + " (" + local51 + arg0.anInt5247 + ")";
		}
		if (Static69.anInt1334 == 1) {
			Static84.method1497((long) arg2, arg3, arg1, Static313.aString372 + " -> <col=ffff00>" + local38, Static194.aString321, (short) 33, Static82.anInt1937);
		} else if (Static135.aBoolean177) {
			@Pc(88) Class4_Sub3_Sub12 local88 = Static218.anInt4225 == -1 ? null : Static114.method1816(Static218.anInt4225);
			if ((Static187.anInt3560 & 0x2) != 0 && (local88 == null || arg0.method4299(local88.anInt2546, Static218.anInt4225) != local88.anInt2546)) {
				Static84.method1497((long) arg2, arg3, arg1, Static69.aString81 + " -> <col=ffff00>" + local38, Static155.aString140, (short) 42, Static237.anInt4467);
			}
		} else {
			@Pc(134) String[] local134 = arg0.aStringArray35;
			if (Static185.aBoolean254) {
				local134 = Static278.method4337(local134);
			}
			@Pc(145) int local145;
			if (local134 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local134[local145] != null && (Static76.anInt5724 != 0 || !local134[local145].equalsIgnoreCase(Static102.aString120))) {
						@Pc(167) byte local167 = 0;
						@Pc(169) int local169 = -1;
						if (local145 == arg0.anInt5246) {
							local169 = arg0.anInt5265;
						}
						if (arg0.anInt5234 == local145) {
							local169 = arg0.anInt5259;
						}
						if (local145 == 0) {
							local167 = 39;
						}
						if (local145 == 1) {
							local167 = 8;
						}
						if (local145 == 2) {
							local167 = 36;
						}
						if (local145 == 3) {
							local167 = 25;
						}
						if (local145 == 4) {
							local167 = 59;
						}
						Static84.method1497((long) arg2, arg3, arg1, "<col=ffff00>" + local38, local134[local145], local167, local169);
					}
				}
			}
			if (Static76.anInt5724 == 0 && local134 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local134[local145] != null && local134[local145].equalsIgnoreCase(Static102.aString120)) {
						@Pc(271) short local271 = 0;
						if (Static154.aClass53_Sub1_Sub1_2.anInt1597 < arg0.anInt5247) {
							local271 = 2000;
						}
						@Pc(281) short local281 = 0;
						if (local145 == 0) {
							local281 = 39;
						}
						if (local145 == 1) {
							local281 = 8;
						}
						if (local145 == 2) {
							local281 = 36;
						}
						if (local145 == 3) {
							local281 = 25;
						}
						if (local145 == 4) {
							local281 = 59;
						}
						if (local281 != 0) {
							local281 += local271;
						}
						Static84.method1497((long) arg2, arg3, arg1, "<col=ffff00>" + local38, local134[local145], local281, arg0.anInt5242);
					}
				}
			}
			Static84.method1497((long) arg2, arg3, arg1, "<col=ffff00>" + local38, Static13.aString22, (short) 1010, Static110.anInt2232);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIZ)I")
	public static int method4190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static256.aBoolean336) {
			arg2 = 1000000;
			Static256.aBoolean336 = false;
		}
		@Pc(17) Class191 local17 = Static218.aClass191ArrayArray1[arg3][arg1];
		@Pc(27) float local27 = local17.aFloat148 * ((float) arg0 * 0.1F + 0.7F);
		@Pc(30) int local30 = local17.anInt6038;
		@Pc(33) float local33 = local17.aFloat150;
		@Pc(36) float local36 = local17.aFloat149;
		@Pc(39) int local39 = local17.anInt6040;
		@Pc(48) int local48 = local17.anInt6047;
		if (!Static279.aBoolean363) {
			local48 = 0;
		}
		@Pc(56) Class4_Sub3_Sub10 local56 = local17.aClass4_Sub3_Sub10_7;
		@Pc(59) float local59 = local17.aFloat152;
		@Pc(62) float local62 = local17.aFloat151;
		@Pc(65) float local65 = local17.aFloat153;
		if (local30 != Static161.anInt3171 || Static141.aFloat146 != local27 || Static200.aFloat96 != local33 || Static245.aFloat90 != local36 || Static69.anInt1325 != local39 || local48 != Static68.anInt1317 || local56 != Static82.aClass4_Sub3_Sub10_3 || Static155.aFloat59 != local59 || Static16.aFloat24 != local65 || Static108.aFloat51 != local62) {
			Static210.anInt3764 = Static9.anInt131;
			Static252.anInt4802 = Static162.anInt3196;
			Static301.aFloat144 = Static235.aFloat108;
			Static140.aFloat62 = Static103.aFloat63;
			Static4.aFloat5 = Static167.aFloat85;
			Static83.aFloat42 = Static213.aFloat102;
			Static130.aClass4_Sub3_Sub10_4 = Static3.aClass4_Sub3_Sub10_1;
			Static251.anInt4794 = Static37.anInt611;
			Static113.aFloat54 = Static155.aFloat58;
			Static36.aFloat21 = Static141.aFloat145;
			if (Static24.aClass4_Sub3_Sub10_2 == null || Static130.aClass4_Sub3_Sub10_4 == Static24.aClass4_Sub3_Sub10_2) {
				Static24.aClass4_Sub3_Sub10_2 = new Class4_Sub3_Sub10();
			}
			Static68.anInt1317 = local48;
			Static245.aFloat90 = local36;
			Static141.aFloat146 = local27;
			Static93.anInt2579 = 0;
			Static161.anInt3171 = local30;
			Static16.aFloat24 = local65;
			Static82.aClass4_Sub3_Sub10_3 = local56;
			Static200.aFloat96 = local33;
			Static108.aFloat51 = local62;
			Static69.anInt1325 = local39;
			Static155.aFloat59 = local59;
		}
		if (Static93.anInt2579 < 65536) {
			Static93.anInt2579 += arg2 * 250;
			if (Static93.anInt2579 >= 65536) {
				Static141.aFloat145 = Static155.aFloat59;
				Static103.aFloat63 = Static200.aFloat96;
				Static155.aFloat58 = Static108.aFloat51;
				Static3.aClass4_Sub3_Sub10_1 = Static82.aClass4_Sub3_Sub10_3;
				Static37.anInt611 = Static68.anInt1317;
				Static167.aFloat85 = Static16.aFloat24;
				Static213.aFloat102 = Static141.aFloat146;
				Static162.anInt3196 = Static69.anInt1325;
				Static93.anInt2579 = 65536;
				Static130.aClass4_Sub3_Sub10_4 = null;
				Static235.aFloat108 = Static245.aFloat90;
				Static9.anInt131 = Static161.anInt3171;
			} else {
				@Pc(209) int local209 = 65536 - Static93.anInt2579 >> 8;
				@Pc(214) float local214 = (float) Static93.anInt2579 / 65536.0F;
				@Pc(218) int local218 = Static93.anInt2579 >> 8;
				Static37.anInt611 = Static251.anInt4794 * local209 + Static68.anInt1317 * local218 >> 8;
				Static9.anInt131 = (local209 * (Static210.anInt3764 & 0xFF00FF) + (Static161.anInt3171 & 0xFF00FF) * local218 & 0xFF00FF00) + (local218 * (Static161.anInt3171 & 0xFF00) + (Static210.anInt3764 & 0xFF00) * local209 & 0xFF0000) >> 8;
				@Pc(268) float local268 = (float) (65536 - Static93.anInt2579) / 65536.0F;
				Static213.aFloat102 = local214 * Static141.aFloat146 + Static83.aFloat42 * local268;
				Static235.aFloat108 = local214 * Static245.aFloat90 + Static301.aFloat144 * local268;
				Static141.aFloat145 = local268 * Static36.aFloat21 + local214 * Static155.aFloat59;
				Static103.aFloat63 = local214 * Static200.aFloat96 + Static140.aFloat62 * local268;
				Static162.anInt3196 = ((Static252.anInt4802 & 0xFF00) * local209 + (Static69.anInt1325 & 0xFF00) * local218 & 0xFF0000) + ((Static69.anInt1325 & 0xFF00FF) * local218 + local209 * (Static252.anInt4802 & 0xFF00FF) & 0xFF00FF00) >> 8;
				Static155.aFloat58 = local268 * Static113.aFloat54 + Static108.aFloat51 * local214;
				Static167.aFloat85 = Static16.aFloat24 * local214 + Static4.aFloat5 * local268;
				if (Static82.aClass4_Sub3_Sub10_3 != Static130.aClass4_Sub3_Sub10_4) {
					if (Static130.aClass4_Sub3_Sub10_4 == null || Static82.aClass4_Sub3_Sub10_3 == null) {
						Static3.aClass4_Sub3_Sub10_1 = null;
					} else {
						Static3.aClass4_Sub3_Sub10_1 = Static24.aClass4_Sub3_Sub10_2.method1836(Static130.aClass4_Sub3_Sub10_4, Static82.aClass4_Sub3_Sub10_3, (float) Static93.anInt2579 / 65536.0F);
					}
				}
			}
		}
		return Static162.anInt3196;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!vh;IIII)Z")
	public static boolean method4192(@OriginalArg(1) int arg0, @OriginalArg(2) Class184 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class146 local10 = Static80.method1400(arg1.anInt5516);
		if (local10.anInt4313 == -1) {
			return true;
		}
		if (arg1.aBoolean379) {
			@Pc(29) int local29 = arg3 + arg1.anInt5547;
			arg3 = local29 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(45) Class56_Sub1 local45 = local10.method3594(arg1.aBoolean383, arg3);
		if (local45 == null) {
			return false;
		}
		@Pc(53) int local53 = arg1.anInt5528;
		@Pc(56) int local56 = arg1.anInt5517;
		if ((arg3 & 0x1) == 1) {
			local53 = arg1.anInt5517;
			local56 = arg1.anInt5528;
		}
		@Pc(73) int local73 = local45.anInt3412;
		@Pc(76) int local76 = local45.anInt3410;
		if (local10.aBoolean304) {
			local73 = local53 * 4;
			local76 = local56 * 4;
		}
		if (local10.anInt4307 == 0) {
			local45.method1315(arg2 * 4 + 48, (-arg0 + 104 + -local56) * 4 + 48, local73, local76);
		} else {
			local45.method1316(arg2 * 4 + 48, (-local56 + -arg0 + 104) * 4 + 48, local73, local76, local10.anInt4307);
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method4193(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
