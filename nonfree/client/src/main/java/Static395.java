import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "Lclient!fa;")
	public static Interface3 anInterface3_11;

	@OriginalMember(owner = "client!ow", name = "o", descriptor = "I")
	public static int anInt6904 = 0;

	@OriginalMember(owner = "client!ow", name = "p", descriptor = "I")
	public static int anInt6905 = -50;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
	public static void method5770() {
		Static229.aClass228_1.method6031();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static428.aLongArray14[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static339.aLongArray9[local26] = 0L;
		}
		Static102.anInt2078 = 0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method5771(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(112) int local112;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local112 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(155) int local155;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local155 = 0; local155 < arg0; local155++) {
				if (local155 >= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(200) int local200;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local200 = 0; local200 < arg0; local200++) {
				if (local200 <= local155 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(246) int local246;
		for (local200 = 0; local200 < arg0; local200++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local246 >= local200 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(307) int local307;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local246 >> 1 >= local307) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(353) int local353;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local353 = arg0 - 1; local353 >= 0; local353--) {
				if (local353 >= local307 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(394) int local394;
		for (local353 = arg0 - 1; local353 >= 0; local353--) {
			for (local394 = arg0 - 1; local394 >= 0; local394--) {
				if (local394 <= local353 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(436) int local436;
		for (local394 = arg0 - 1; local394 >= 0; local394--) {
			for (local436 = 0; local436 < arg0; local436++) {
				if (local436 >= local394 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(482) int local482;
		for (local436 = 0; local436 < arg0; local436++) {
			for (local482 = 0; local482 < arg0; local482++) {
				if (local482 <= local436 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(527) int local527;
		for (local482 = 0; local482 < arg0; local482++) {
			for (local527 = arg0 - 1; local527 >= 0; local527--) {
				if (local527 >= local482 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(567) int local567;
		for (local527 = arg0 - 1; local527 >= 0; local527--) {
			for (local567 = 0; local567 < arg0; local567++) {
				if (local567 >= local527 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(609) int local609;
		for (local567 = 0; local567 < arg0; local567++) {
			for (local609 = 0; local609 < arg0; local609++) {
				if (local609 <= local567 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(658) int local658;
		for (local609 = 0; local609 < arg0; local609++) {
			for (local658 = arg0 - 1; local658 >= 0; local658--) {
				if (local609 >> 1 <= local658) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(707) int local707;
		for (local658 = arg0 - 1; local658 >= 0; local658--) {
			for (local707 = arg0 - 1; local707 >= 0; local707--) {
				if (local658 << 1 >= local707) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(755) int local755;
		for (local707 = arg0 - 1; local707 >= 0; local707--) {
			for (local755 = arg0 - 1; local755 >= 0; local755--) {
				if (local707 >> 1 <= local755) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(800) int local800;
		for (local755 = arg0 - 1; local755 >= 0; local755--) {
			for (local800 = 0; local800 < arg0; local800++) {
				if (local800 <= local755 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(842) int local842;
		for (local800 = 0; local800 < arg0; local800++) {
			for (local842 = 0; local842 < arg0; local842++) {
				if (local800 >> 1 <= local842) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(887) int local887;
		for (local842 = 0; local842 < arg0; local842++) {
			for (local887 = arg0 - 1; local887 >= 0; local887--) {
				if (local842 << 1 >= local887) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(936) int local936;
		for (local887 = 0; local887 < arg0; local887++) {
			for (local936 = 0; local936 < arg0; local936++) {
				if (local936 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(987) int local987;
		for (local936 = 0; local936 < arg0; local936++) {
			for (local987 = 0; local987 < arg0; local987++) {
				if (arg0 / 2 >= local936) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1030) int local1030;
		for (local987 = 0; local987 < arg0; local987++) {
			for (local1030 = 0; local1030 < arg0; local1030++) {
				if (arg0 / 2 <= local1030) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1077) int local1077;
		for (local1030 = 0; local1030 < arg0; local1030++) {
			for (local1077 = 0; local1077 < arg0; local1077++) {
				if (local1030 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1124) int local1124;
		for (local1077 = 0; local1077 < arg0; local1077++) {
			for (local1124 = 0; local1124 < arg0; local1124++) {
				if (local1124 <= local1077 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1168) int local1168;
		for (local1124 = arg0 - 1; local1124 >= 0; local1124--) {
			for (local1168 = 0; local1168 < arg0; local1168++) {
				if (local1124 - arg0 / 2 >= local1168) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1223) int local1223;
		for (local1168 = arg0 - 1; local1168 >= 0; local1168--) {
			for (local1223 = arg0 - 1; local1223 >= 0; local1223--) {
				if (local1168 - arg0 / 2 >= local1223) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1271) int local1271;
		for (local1223 = 0; local1223 < arg0; local1223++) {
			for (local1271 = arg0 - 1; local1271 >= 0; local1271--) {
				if (local1271 <= local1223 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1312) int local1312;
		for (local1271 = 0; local1271 < arg0; local1271++) {
			for (local1312 = 0; local1312 < arg0; local1312++) {
				if (local1271 - arg0 / 2 <= local1312) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1359) int local1359;
		for (local1312 = arg0 - 1; local1312 >= 0; local1312--) {
			for (local1359 = 0; local1359 < arg0; local1359++) {
				if (local1312 - arg0 / 2 <= local1359) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1410) int local1410;
		for (local1359 = arg0 - 1; local1359 >= 0; local1359--) {
			for (local1410 = arg0 - 1; local1410 >= 0; local1410--) {
				if (local1359 - arg0 / 2 <= local1410) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1410 = 0; local1410 < arg0; local1410++) {
			for (@Pc(1455) int local1455 = arg0 - 1; local1455 >= 0; local1455--) {
				if (local1455 >= local1410 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)V")
	public static void method5772() {
		Static125.anInt2831 = -1;
		Static551.anInt8768 = -1;
		Static503.anInt8177 = 0;
		Static32.anInt609 = -1;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZIII)V")
	public static void method5773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class3_Sub7_Sub18 local13 = Static543.method7218(9, arg1);
		local13.method7326();
		local13.anInt8806 = arg2;
		local13.anInt8802 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILjava/awt/Component;Z)Lclient!ek;")
	public static Class86 method5775(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class86_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class86) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class86_Sub2(arg0, true);
		}
	}
}
