import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt3396;

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!lc;")
	public static Class41 aClass41_61;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!df;")
	public static Class16 aClass16_75;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray86 = new int[5][5000];

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	public static int anInt3392 = 0;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1408 = Static59.method1195("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1409 = Static59.method1195("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public static int anInt3397 = -1;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public static volatile int anInt3399 = 0;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "[I")
	public static int[] anIntArray384 = new int[100];

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "[B")
	public static byte[] aByteArray96 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1410 = Static59.method1195("Freunde");

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1411 = Static59.method1195("<col=ffffff>");

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray71 = new boolean[5];

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1412 = Static59.method1195("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method2260() {
		for (@Pc(18) Class3_Sub6 local18 = (Class3_Sub6) Static53.aClass5_14.method92(); local18 != null; local18 = (Class3_Sub6) Static53.aClass5_14.method90()) {
			if (local18.aClass3_Sub2_Sub1_2 != null) {
				Static125.aClass3_Sub2_Sub2_2.method712(local18.aClass3_Sub2_Sub1_2);
				local18.aClass3_Sub2_Sub1_2 = null;
			}
			if (local18.aClass3_Sub2_Sub1_1 != null) {
				Static125.aClass3_Sub2_Sub2_2.method712(local18.aClass3_Sub2_Sub1_1);
				local18.aClass3_Sub2_Sub1_1 = null;
			}
		}
		Static53.aClass5_14.method91();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!rc;")
	public static RuntimeException_Sub1 method2261(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!kf;")
	public static Class3_Sub1_Sub12 method2262(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub12 local10 = (Class3_Sub1_Sub12) Static61.aClass17_32.method643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static38.aClass25_7.method931(arg0, 4);
		local10 = new Class3_Sub1_Sub12();
		if (local20 != null) {
			local10.method1247(new Class3_Sub12(local20), arg0);
		}
		local10.method1243();
		Static61.aClass17_32.method644((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	public static void method2263() {
		@Pc(5) int local5 = Static26.anInt980 * 128 + 64;
		@Pc(15) int local15 = Static95.anInt2716 * 128 + 64;
		@Pc(23) int local23 = Static66.method1353(local5, Static119.anInt3243, local15) - Static42.anInt1407;
		if (Static98.anInt2824 < local15) {
			Static98.anInt2824 += Static53.anInt1747 + Static114.anInt3196 * (local15 - Static98.anInt2824) / 1000;
			if (Static98.anInt2824 > local15) {
				Static98.anInt2824 = local15;
			}
		}
		if (local23 > Static115.anInt3199) {
			Static115.anInt3199 += Static53.anInt1747 + (local23 - Static115.anInt3199) * Static114.anInt3196 / 1000;
			if (Static115.anInt3199 > local23) {
				Static115.anInt3199 = local23;
			}
		}
		if (local23 < Static115.anInt3199) {
			Static115.anInt3199 -= Static53.anInt1747 + (Static115.anInt3199 - local23) * Static114.anInt3196 / 1000;
			if (local23 > Static115.anInt3199) {
				Static115.anInt3199 = local23;
			}
		}
		if (Static71.anInt1493 < local5) {
			Static71.anInt1493 += Static114.anInt3196 * (local5 - Static71.anInt1493) / 1000 + Static53.anInt1747;
			if (Static71.anInt1493 > local5) {
				Static71.anInt1493 = local5;
			}
		}
		if (local5 < Static71.anInt1493) {
			Static71.anInt1493 -= Static114.anInt3196 * (Static71.anInt1493 - local5) / 1000 + Static53.anInt1747;
			if (Static71.anInt1493 < local5) {
				Static71.anInt1493 = local5;
			}
		}
		if (local15 < Static98.anInt2824) {
			Static98.anInt2824 -= Static53.anInt1747 + (Static98.anInt2824 - local15) * Static114.anInt3196 / 1000;
			if (Static98.anInt2824 < local15) {
				Static98.anInt2824 = local15;
			}
		}
		local5 = Static53.anInt1737 * 128 + 64;
		local15 = Static112.anInt3117 * 128 + 64;
		local23 = Static66.method1353(local5, Static119.anInt3243, local15) - Static29.anInt1008;
		@Pc(217) int local217 = local15 - Static98.anInt2824;
		@Pc(222) int local222 = local5 - Static71.anInt1493;
		@Pc(227) int local227 = local23 - Static115.anInt3199;
		@Pc(239) int local239 = (int) Math.sqrt((double) (local222 * local222 + local217 * local217));
		@Pc(250) int local250 = (int) (Math.atan2((double) local227, (double) local239) * 325.949D) & 0x7FF;
		@Pc(261) int local261 = (int) (-325.949D * Math.atan2((double) local222, (double) local217)) & 0x7FF;
		if (local250 < 128) {
			local250 = 128;
		}
		@Pc(273) int local273 = local261 - Static22.anInt871;
		if (local250 > 383) {
			local250 = 383;
		}
		if (local273 > 1024) {
			local273 -= 2048;
		}
		if (local273 < -1024) {
			local273 += 2048;
		}
		if (local273 > 0) {
			Static22.anInt871 += Static64.anInt2046 + local273 * Static22.anInt877 / 1000;
			Static22.anInt871 &= 0x7FF;
		}
		if (local273 < 0) {
			Static22.anInt871 -= Static64.anInt2046 + -local273 * Static22.anInt877 / 1000;
			Static22.anInt871 &= 0x7FF;
		}
		@Pc(328) int local328 = local261 - Static22.anInt871;
		if (local328 > 1024) {
			local328 -= 2048;
		}
		if (local250 > Static63.anInt2908) {
			Static63.anInt2908 += Static22.anInt877 * (local250 - Static63.anInt2908) / 1000 + Static64.anInt2046;
			if (Static63.anInt2908 > local250) {
				Static63.anInt2908 = local250;
			}
		}
		if (local328 < -1024) {
			local328 += 2048;
		}
		if (local328 < 0 && local273 > 0 || local328 > 0 && local273 < 0) {
			Static22.anInt871 = local261;
		}
		if (local250 >= Static63.anInt2908) {
			return;
		}
		Static63.anInt2908 -= Static64.anInt2046 + (Static63.anInt2908 - local250) * Static22.anInt877 / 1000;
		if (local250 > Static63.anInt2908) {
			Static63.anInt2908 = local250;
			return;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method2265() {
		@Pc(10) int local10 = Static79.aClass3_Sub12_Sub1_1.method1982(8);
		@Pc(19) int local19;
		if (Static53.anInt1744 > local10) {
			for (local19 = local10; local19 < Static53.anInt1744; local19++) {
				Static74.anIntArray239[Static118.anInt3220++] = Static14.anIntArray56[local19];
			}
		}
		if (local10 > Static53.anInt1744) {
			throw new RuntimeException("gppov1");
		}
		Static53.anInt1744 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(57) int local57 = Static14.anIntArray56[local19];
			@Pc(61) Class3_Sub1_Sub1_Sub3_Sub1 local61 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local57];
			@Pc(66) int local66 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
			if (local66 == 0) {
				Static14.anIntArray56[Static53.anInt1744++] = local57;
				local61.anInt1531 = Static34.anInt1183;
			} else {
				@Pc(88) int local88 = Static79.aClass3_Sub12_Sub1_1.method1982(2);
				if (local88 == 0) {
					Static14.anIntArray56[Static53.anInt1744++] = local57;
					local61.anInt1531 = Static34.anInt1183;
					Static46.anIntArray170[Static74.anInt2399++] = local57;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local88 == 1) {
						Static14.anIntArray56[Static53.anInt1744++] = local57;
						local61.anInt1531 = Static34.anInt1183;
						local135 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
						local61.method1016(false, local135);
						local145 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
						if (local145 == 1) {
							Static46.anIntArray170[Static74.anInt2399++] = local57;
						}
					} else if (local88 == 2) {
						Static14.anIntArray56[Static53.anInt1744++] = local57;
						local61.anInt1531 = Static34.anInt1183;
						local135 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
						local61.method1016(true, local135);
						local145 = Static79.aClass3_Sub12_Sub1_1.method1982(3);
						local61.method1016(true, local145);
						@Pc(199) int local199 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
						if (local199 == 1) {
							Static46.anIntArray170[Static74.anInt2399++] = local57;
						}
					} else if (local88 == 3) {
						Static74.anIntArray239[Static118.anInt3220++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)I")
	public static int method2266(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBI)I")
	public static int method2267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public static void method2268() {
		while (true) {
			@Pc(10) Class5 local10 = Static28.aClass5_22;
			@Pc(17) Class3_Sub20 local17;
			synchronized (Static28.aClass5_22) {
				local17 = (Class3_Sub20) Static16.aClass5_6.method78();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass25_Sub1_16.method934(local17.aClass13_4, false, local17.aByteArray79, (int) local17.aLong107);
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public static void method2269() {
		aClass60_1412 = null;
		aClass60_1408 = null;
		aClass60_1409 = null;
		anIntArrayArray86 = null;
		aClass60_1411 = null;
		aBooleanArray71 = null;
		aByteArray96 = null;
		anIntArray384 = null;
		aClass41_61 = null;
		aClass16_75 = null;
		aClass60_1410 = null;
	}
}
