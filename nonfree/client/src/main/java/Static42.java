import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "[B")
	public static byte[] aByteArray7;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_7;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	public static int anInt1444 = 0;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
	public static boolean aBoolean70 = true;

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "Lclient!ba;")
	public static Class5 aClass5_36 = new Class5(30);

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "[I")
	public static int[] anIntArray171 = new int[256];

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Lclient!gd;")
	public static Class23 aClass23_767 = Static15.method178("l");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public static void method903(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static77.method1346(arg0)) {
			return;
		}
		@Pc(16) Class1_Sub1_Sub7[] local16 = Static105.aClass1_Sub1_Sub7ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(28) Class1_Sub1_Sub7 local28 = local16[local18];
			if (local28.anObjectArray13 != null) {
				Static34.method585(local28.anObjectArray13, 0, 0, local28, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BBI)Lclient!gd;")
	public static Class23 method904(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class23 local7 = new Class23();
		local7.aByteArray4 = new byte[arg0];
		local7.anInt965 = 0;
		for (@Pc(16) int local16 = arg2; local16 < arg2 + arg0; local16++) {
			if (arg1[local16] != 0) {
				local7.aByteArray4[local7.anInt965++] = arg1[local16];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V")
	public static void method905() {
		for (@Pc(1) int local1 = 0; local1 < Static111.anInt2901; local1++) {
			@Pc(6) int local6 = Static7.anIntArray36[local1]--;
			if (Static7.anIntArray36[local1] >= -10) {
				@Pc(77) Class39 local77 = Static55.aClass39Array1[local1];
				if (local77 == null) {
					local77 = Static122.method1233(Static33.aClass55_Sub1_4, Static68.anIntArray62[local1]);
					if (local77 == null) {
						continue;
					}
					Static7.anIntArray36[local1] += local77.method1231();
					Static55.aClass39Array1[local1] = local77;
				}
				if (Static7.anIntArray36[local1] < 0) {
					@Pc(111) int local111;
					if (Static109.anIntArray394[local1] == 0) {
						local111 = Static97.anInt2526;
					} else {
						@Pc(120) int local120 = Static109.anIntArray394[local1] >> 16 & 0xFF;
						@Pc(130) int local130 = local120 * 128 + 64 - Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2196;
						@Pc(138) int local138 = (Static109.anIntArray394[local1] & 0xFF) * 128;
						if (local130 < 0) {
							local130 = -local130;
						}
						@Pc(154) int local154 = Static109.anIntArray394[local1] >> 8 & 0xFF;
						@Pc(164) int local164 = local154 * 128 + 64 - Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2232;
						if (local164 < 0) {
							local164 = -local164;
						}
						@Pc(175) int local175 = local164 + local130 - 128;
						if (local138 < local175) {
							Static7.anIntArray36[local1] = -100;
							continue;
						}
						if (local175 < 0) {
							local175 = 0;
						}
						local111 = (local138 - local175) * Static104.anInt2679 / local138;
					}
					@Pc(203) Class1_Sub9_Sub1 local203 = local77.method1232().method1670(Static73.aClass26_1);
					@Pc(208) Class1_Sub4_Sub2 local208 = Static120.method938(local203, local111);
					local208.method932(Static43.anIntArray173[local1] - 1);
					Static15.aClass1_Sub4_Sub1_1.method371(local208);
					Static7.anIntArray36[local1] = -100;
				}
			} else {
				Static111.anInt2901--;
				for (@Pc(22) int local22 = local1; local22 < Static111.anInt2901; local22++) {
					Static68.anIntArray62[local22] = Static68.anIntArray62[local22 + 1];
					Static55.aClass39Array1[local22] = Static55.aClass39Array1[local22 + 1];
					Static43.anIntArray173[local22] = Static43.anIntArray173[local22 + 1];
					Static7.anIntArray36[local22] = Static7.anIntArray36[local22 + 1];
					Static109.anIntArray394[local22] = Static109.anIntArray394[local22 + 1];
				}
				local1--;
			}
		}
		if (Static77.anInt2108 <= 0) {
			return;
		}
		Static77.anInt2108 -= 20;
		if (Static77.anInt2108 < 0) {
			Static77.anInt2108 = 0;
		}
		if (Static77.anInt2108 == 0 && Static13.anInt232 != 0 && Static115.anInt2966 != -1) {
			Static77.method1350(Static13.anInt232, Static115.anInt2966, 0, aClass55_Sub1_7);
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method906() {
		Static76.aClass1_Sub5_Sub1_2.method731(46);
		if (Static16.anInt335 != -1) {
			Static108.method1842(Static16.anInt335);
			Static34.aBoolean60 = true;
			Static64.aBoolean98 = true;
			Static47.anInt1599 = -1;
			Static16.anInt335 = -1;
		}
		if (Static92.anInt2913 != -1) {
			Static108.method1842(Static92.anInt2913);
			Static102.aBoolean123 = true;
			Static92.anInt2913 = -1;
			Static47.anInt1599 = -1;
		}
		if (Static77.anInt2096 != -1) {
			Static108.method1842(Static77.anInt2096);
			Static77.anInt2096 = -1;
			Static89.method1524(30);
		}
		if (Static87.anInt2866 != -1) {
			Static108.method1842(Static87.anInt2866);
			Static87.anInt2866 = -1;
		}
		if (Static109.anInt2824 != -1) {
			Static108.method1842(Static109.anInt2824);
			Static47.anInt1599 = -1;
			Static109.anInt2824 = -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	public static void method907() {
		if (Static65.anInt1963 != 1) {
			return;
		}
		if (Static111.anInt2890 >= 6 && Static111.anInt2890 <= 106 && Static74.anInt1803 >= 467 && Static74.anInt1803 <= 499) {
			Static2.anInt2292 = (Static2.anInt2292 + 1) % 4;
			Static102.aBoolean123 = true;
			Static74.aBoolean89 = true;
			Static76.aClass1_Sub5_Sub1_2.method731(96);
			Static76.aClass1_Sub5_Sub1_2.method674(Static2.anInt2292);
			Static76.aClass1_Sub5_Sub1_2.method674(Static77.anInt2097);
			Static76.aClass1_Sub5_Sub1_2.method674(Static62.anInt1905);
		}
		if (Static111.anInt2890 >= 135 && Static111.anInt2890 <= 235 && Static74.anInt1803 >= 467 && Static74.anInt1803 <= 499) {
			Static74.aBoolean89 = true;
			Static102.aBoolean123 = true;
			Static77.anInt2097 = (Static77.anInt2097 + 1) % 3;
			Static76.aClass1_Sub5_Sub1_2.method731(96);
			Static76.aClass1_Sub5_Sub1_2.method674(Static2.anInt2292);
			Static76.aClass1_Sub5_Sub1_2.method674(Static77.anInt2097);
			Static76.aClass1_Sub5_Sub1_2.method674(Static62.anInt1905);
		}
		if (Static111.anInt2890 >= 273 && Static111.anInt2890 <= 373 && Static74.anInt1803 >= 467 && Static74.anInt1803 <= 499) {
			Static102.aBoolean123 = true;
			Static74.aBoolean89 = true;
			Static62.anInt1905 = (Static62.anInt1905 + 1) % 3;
			Static76.aClass1_Sub5_Sub1_2.method731(96);
			Static76.aClass1_Sub5_Sub1_2.method674(Static2.anInt2292);
			Static76.aClass1_Sub5_Sub1_2.method674(Static77.anInt2097);
			Static76.aClass1_Sub5_Sub1_2.method674(Static62.anInt1905);
		}
		if (Static111.anInt2890 < 412 || Static111.anInt2890 > 512 || Static74.anInt1803 < 467 || Static74.anInt1803 > 499) {
			return;
		}
		if (Static109.anInt2824 != -1) {
			Static63.method1229(Static104.aClass23_1523, Static58.aClass23_1678, 0);
			return;
		}
		method906();
		if (Static114.anInt2951 != -1) {
			Static104.aClass23_1520 = Static104.aClass23_1523;
			Static32.aBoolean58 = false;
			Static57.anInt1779 = Static109.anInt2824 = Static114.anInt2951;
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method908(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static89.method1523(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			@Pc(100) Class62 local100 = Static82.aClass54_3.method1487(new URL(Static82.aClass54_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static96.anInt1791 + "&u=" + Static41.aLong34 + "&v1=" + Static86.aString2 + "&v2=" + Static86.aString3 + "&e=" + local5));
			while (local100.anInt2572 == 0) {
				Static39.method862(1L);
			}
			if (local100.anInt2572 == 1) {
				@Pc(118) DataInputStream local118 = (DataInputStream) local100.anObject4;
				local118.read();
				local118.close();
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method909() {
		aClass55_Sub1_7 = null;
		anIntArray171 = null;
		aClass5_36 = null;
		aClass23_767 = null;
		aByteArray7 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)I")
	public static int method910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return 7 - arg1;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
