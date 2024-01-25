import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!ce;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_27 = new Class211(101, 8);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Z")
	public static final boolean aBoolean108 = false;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_35 = new Class48(41, 3);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1006(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg0 != null) {
				local11 = Static13.method108(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg1;
			}
			Static82.method1219(local11);
			local11 = Static137.method2032("%3a", local11, ":");
			local11 = Static137.method2032("%40", local11, "@");
			local11 = Static137.method2032("%26", local11, "&");
			local11 = Static137.method2032("%23", local11, "#");
			if (Static50.aClass162_1.anApplet1 != null) {
				@Pc(103) Class112 local103 = Static50.aClass162_1.method3263(new URL(Static50.aClass162_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static193.anInt3401 + "&u=" + Static161.aLong90 + "&v1=" + Static237.aString49 + "&v2=" + Static237.aString48 + "&e=" + local11));
				while (local103.anInt2969 == 0) {
					Static57.method5056(1L);
				}
				if (local103.anInt2969 == 1) {
					@Pc(119) DataInputStream local119 = (DataInputStream) local103.anObject5;
					local119.read();
					local119.close();
				}
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public static void method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static353.aFloat15 < Static353.aFloat16) {
			Static353.aFloat15 = (float) ((double) Static353.aFloat15 + (double) Static353.aFloat15 / 30.0D);
			if (Static353.aFloat15 > Static353.aFloat16) {
				Static353.aFloat15 = Static353.aFloat16;
			}
			Static201.method2874();
			Static353.anInt2619 = (int) Static353.aFloat15 >> 1;
			Static353.aByteArrayArrayArray2 = Static344.method4809(Static353.anInt2619);
		} else if (Static353.aFloat15 > Static353.aFloat16) {
			Static353.aFloat15 = (float) ((double) Static353.aFloat15 - (double) Static353.aFloat15 / 30.0D);
			if (Static353.aFloat15 < Static353.aFloat16) {
				Static353.aFloat15 = Static353.aFloat16;
			}
			Static201.method2874();
			Static353.anInt2619 = (int) Static353.aFloat15 >> 1;
			Static353.aByteArrayArrayArray2 = Static344.method4809(Static353.anInt2619);
		}
		if (Static359.anInt6301 != -1 && Static390.anInt6367 != -1) {
			@Pc(78) int local78 = Static359.anInt6301 - Static386.anInt6289;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(97) int local97 = Static390.anInt6367 - Static299.anInt6015;
			Static386.anInt6289 -= -local78;
			if (local97 < 2 || local97 > 2) {
				local97 /= 8;
			}
			Static299.anInt6015 -= -local97;
			if (local78 == 0 && local97 == 0) {
				Static390.anInt6367 = -1;
				Static359.anInt6301 = -1;
			}
			Static201.method2874();
		}
		if (Static346.anInt5675 <= 0) {
			Static355.anInt4357 = -1;
			Static276.anInt5133 = -1;
		} else {
			Static134.anInt2508--;
			if (Static134.anInt2508 == 0) {
				Static134.anInt2508 = 100;
				Static346.anInt5675--;
			}
		}
		if (!Static14.aBoolean17 || Static35.aClass17_8 == null) {
			return;
		}
		for (@Pc(161) Class1_Sub10 local161 = (Class1_Sub10) Static35.aClass17_8.method202(); local161 != null; local161 = (Class1_Sub10) Static35.aClass17_8.method207()) {
			@Pc(170) Class97 local170 = Static353.aClass249_4.method5522(local161.aClass1_Sub24_1.anInt3616);
			if (local161.method1170(arg1, arg0)) {
				if (local170.aStringArray34 != null) {
					if (local170.aStringArray34[4] != null) {
						Static337.method4814((long) local161.aClass1_Sub24_1.anInt3616, 1001, true, -1, local170.aString21, local170.aStringArray34[4], local170.anInt2292, -1, false, 0);
					}
					if (local170.aStringArray34[3] != null) {
						Static337.method4814((long) local161.aClass1_Sub24_1.anInt3616, 1010, true, -1, local170.aString21, local170.aStringArray34[3], local170.anInt2292, -1, false, 0);
					}
					if (local170.aStringArray34[2] != null) {
						Static337.method4814((long) local161.aClass1_Sub24_1.anInt3616, 1007, true, -1, local170.aString21, local170.aStringArray34[2], local170.anInt2292, -1, false, 0);
					}
					if (local170.aStringArray34[1] != null) {
						Static337.method4814((long) local161.aClass1_Sub24_1.anInt3616, 1011, true, -1, local170.aString21, local170.aStringArray34[1], local170.anInt2292, -1, false, 0);
					}
					if (local170.aStringArray34[0] != null) {
						Static337.method4814((long) local161.aClass1_Sub24_1.anInt3616, 1003, true, -1, local170.aString21, local170.aStringArray34[0], local170.anInt2292, -1, false, 0);
					}
				}
				if (!local161.aClass1_Sub24_1.aBoolean351) {
					local161.aClass1_Sub24_1.aBoolean351 = true;
					Static387.method5498(Static360.aClass213_16, local161.aClass1_Sub24_1.anInt3616, local170.anInt2292);
				}
				if (local161.aClass1_Sub24_1.aBoolean351) {
					Static387.method5498(Static80.aClass213_5, local161.aClass1_Sub24_1.anInt3616, local170.anInt2292);
				}
			} else if (local161.aClass1_Sub24_1.aBoolean351) {
				local161.aClass1_Sub24_1.aBoolean351 = false;
				Static387.method5498(Static298.aClass213_9, local161.aClass1_Sub24_1.anInt3616, local170.anInt2292);
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;ILclient!tr;Z)V")
	public static void method1008(@OriginalArg(0) String arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(25) int local25 = Static75.aClass110_1.method2411(arg0, 250, null);
		@Pc(34) int local34 = Static75.aClass110_1.method2415(null, 250, arg0) * 13;
		Static66.aClass164_2.method5321(6, 6, local25 + 4 + 4, local34 - -4 + 4, -16777216, 0);
		Static66.aClass164_2.method5382(6, 6, local25 + 4 + 4, local34 + 4 + 4, -1, 0);
		arg1.method5096(local34, local25, 0, arg0, 0, -1, null, null, 10, 1, 1, null, 0, -1, 10);
		Static83.method1220(6, local25 + 8, 6, local34 + 4 + 4);
		if (arg2) {
			Static66.aClass164_2.method5404();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	public static void method1009() {
		if (Static237.anInt3958 != 3) {
			Static233.anInt3887 = -1;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method1011() {
		Static209.aClass1_Sub33_Sub2_2.lb = 0;
		Static144.aClass211_67 = null;
		Static11.anInt3595 = 0;
		Static186.aClass211_85 = null;
		Static71.aClass211_28 = null;
		Static140.anInt6076 = 0;
		Static342.aClass211_149 = null;
		Static139.aClass1_Sub33_Sub2_1.lb = 0;
		Static121.anInt2167 = 0;
		Static88.method1340();
		Static115.method1695();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			Static225.aClass25_Sub1_Sub1_Sub1Array3[local36] = null;
		}
		Static321.aClass25_Sub1_Sub1_Sub1_2 = null;
		for (@Pc(52) int local52 = 0; local52 < Static171.aClass25_Sub1_Sub1_Sub2Array1.length; local52++) {
			@Pc(58) Class25_Sub1_Sub1_Sub2 local58 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local52];
			if (local58 != null) {
				local58.anInt2353 = -1;
			}
		}
		Static14.method112();
		Static323.anInt5463 = 1;
		Static212.method2974(30);
		for (@Pc(77) int local77 = 0; local77 < 100; local77++) {
			Static96.aBooleanArray9[local77] = true;
		}
		Static68.method1131();
		Static370.aLong196 = 0L;
		Static88.aClass1_Sub21_1 = null;
	}
}
