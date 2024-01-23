import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public static int anInt2892 = 0;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!l;")
	public static Class98 aClass98_21 = new Class98(64);

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
	public static int[] anIntArray332 = new int[500];

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!ea;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt2895 = 0;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Z")
	public static boolean aBoolean205 = true;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method2574() {
		@Pc(10) int local10 = Static249.aClass3_Sub26_Sub1_3.method3962(8);
		@Pc(15) int local15;
		if (local10 < Static152.anInt2869) {
			for (local15 = local10; local15 < Static152.anInt2869; local15++) {
				Static103.anIntArray192[Static192.anInt3770++] = Static102.anIntArray188[local15];
			}
		}
		if (Static152.anInt2869 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static152.anInt2869 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(64) int local64 = Static102.anIntArray188[local15];
			@Pc(68) Class10_Sub5_Sub1 local68 = Static52.aClass10_Sub5_Sub1Array1[local64];
			@Pc(73) int local73 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
			if (local73 == 0) {
				Static102.anIntArray188[Static152.anInt2869++] = local64;
				local68.anInt5095 = Static124.anInt2371;
			} else {
				@Pc(94) int local94 = Static249.aClass3_Sub26_Sub1_3.method3962(2);
				if (local94 == 0) {
					Static102.anIntArray188[Static152.anInt2869++] = local64;
					local68.anInt5095 = Static124.anInt2371;
					Static178.anIntArray405[Static11.anInt5178++] = local64;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local94 == 1) {
						Static102.anIntArray188[Static152.anInt2869++] = local64;
						local68.anInt5095 = Static124.anInt2371;
						local139 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
						local68.method4196(local139, 1);
						local149 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
						if (local149 == 1) {
							Static178.anIntArray405[Static11.anInt5178++] = local64;
						}
					} else if (local94 == 2) {
						Static102.anIntArray188[Static152.anInt2869++] = local64;
						local68.anInt5095 = Static124.anInt2371;
						if (Static249.aClass3_Sub26_Sub1_3.method3962(1) == 1) {
							local139 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
							local68.method4196(local139, 2);
							local149 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
							local68.method4196(local149, 2);
						} else {
							local139 = Static249.aClass3_Sub26_Sub1_3.method3962(3);
							local68.method4196(local139, 0);
						}
						local139 = Static249.aClass3_Sub26_Sub1_3.method3962(1);
						if (local139 == 1) {
							Static178.anIntArray405[Static11.anInt5178++] = local64;
						}
					} else if (local94 == 3) {
						Static103.anIntArray192[Static192.anInt3770++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ec;)Z")
	public static boolean method2576(@OriginalArg(1) Class40 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean89) {
			return false;
		} else if (!arg0.method978()) {
			return false;
		} else if (Static130.aClass30_15.method663((long) arg0.anInt1171) == null) {
			return Static51.aClass30_8.method663((long) arg0.anInt1166) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method2577(@OriginalArg(0) int arg0) {
		return Static103.aStringArray19[arg0].length() > 0 ? Static73.aStringArray13[arg0] + Static3.aString1 + Static103.aStringArray19[arg0] : Static73.aStringArray13[arg0];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method2578() {
		Static28.aClass98_6.method2571();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBI)I")
	public static int method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static100.aBoolean152) {
			Static100.aBoolean152 = false;
			arg1 = 1000000;
		}
		@Pc(18) Class74 local18 = Static43.aClass74ArrayArray1[arg2][arg3];
		@Pc(21) float local21 = local18.aFloat37;
		@Pc(34) int local34 = local18.anInt2030;
		@Pc(44) float local44 = local18.aFloat38 * ((float) arg0 * 0.1F + 0.7F);
		@Pc(47) float local47 = local18.aFloat39;
		@Pc(50) int local50 = local18.anInt2031;
		@Pc(53) int local53 = local18.anInt2027;
		@Pc(56) Class3_Sub4_Sub24 local56 = local18.aClass3_Sub4_Sub24_4;
		if (!Static218.aBoolean307) {
			local53 = 0;
		}
		@Pc(63) float local63 = local18.aFloat35;
		@Pc(66) float local66 = local18.aFloat36;
		@Pc(69) float local69 = local18.aFloat34;
		if (local34 != Static300.anInt5923 || local44 != Static253.aFloat64 || Static292.aFloat71 != local21 || Static222.aFloat56 != local47 || local50 != Static115.anInt2145 || Static167.anInt3156 != local53 || Static194.aClass3_Sub4_Sub24_6 != local56 || Static52.aFloat13 != local66 || local69 != Static26.aFloat10 || Static4.aFloat54 != local63) {
			Static94.aFloat23 = Static23.aFloat9;
			Static5.aFloat4 = Static78.aFloat20;
			Static65.aFloat14 = Static295.aFloat60;
			Static215.anInt4216 = Static87.anInt4430;
			Static216.anInt4236 = Static252.anInt5209;
			Static60.aClass3_Sub4_Sub24_2 = Static177.aClass3_Sub4_Sub24_5;
			Static186.aFloat52 = Static224.aFloat75;
			Static88.aFloat22 = Static41.aFloat11;
			Static78.anInt1467 = Static23.anInt431;
			Static220.aFloat63 = Static185.aFloat51;
			if (Static237.aClass3_Sub4_Sub24_7 == null || Static60.aClass3_Sub4_Sub24_2 == Static237.aClass3_Sub4_Sub24_7) {
				Static237.aClass3_Sub4_Sub24_7 = new Class3_Sub4_Sub24();
			}
			Static253.aFloat64 = local44;
			Static26.aFloat10 = local69;
			Static230.anInt4490 = 0;
			Static167.anInt3156 = local53;
			Static292.aFloat71 = local21;
			Static300.anInt5923 = local34;
			Static4.aFloat54 = local63;
			Static115.anInt2145 = local50;
			Static194.aClass3_Sub4_Sub24_6 = local56;
			Static52.aFloat13 = local66;
			Static222.aFloat56 = local47;
		}
		if (Static230.anInt4490 < 65536) {
			Static230.anInt4490 += arg1 * 250;
			if (Static230.anInt4490 >= 65536) {
				Static177.aClass3_Sub4_Sub24_5 = Static194.aClass3_Sub4_Sub24_6;
				Static252.anInt5209 = Static115.anInt2145;
				Static23.anInt431 = Static167.anInt3156;
				Static78.aFloat20 = Static26.aFloat10;
				Static23.aFloat9 = Static253.aFloat64;
				Static230.anInt4490 = 65536;
				Static41.aFloat11 = Static52.aFloat13;
				Static295.aFloat60 = Static292.aFloat71;
				Static185.aFloat51 = Static222.aFloat56;
				Static224.aFloat75 = Static4.aFloat54;
				Static87.anInt4430 = Static300.anInt5923;
				Static60.aClass3_Sub4_Sub24_2 = null;
			} else {
				@Pc(212) int local212 = 65536 - Static230.anInt4490 >> 8;
				@Pc(216) int local216 = Static230.anInt4490 >> 8;
				@Pc(224) float local224 = (float) (65536 - Static230.anInt4490) / 65536.0F;
				@Pc(229) float local229 = (float) Static230.anInt4490 / 65536.0F;
				Static87.anInt4430 = ((Static300.anInt5923 & 0xFF00) * local216 + (Static215.anInt4216 & 0xFF00) * local212 & 0xFF0000) + ((Static300.anInt5923 & 0xFF00FF) * local216 + (Static215.anInt4216 & 0xFF00FF) * local212 & 0xFF00FF00) >> 8;
				Static185.aFloat51 = Static222.aFloat56 * local229 + Static220.aFloat63 * local224;
				Static78.aFloat20 = local229 * Static26.aFloat10 + Static5.aFloat4 * local224;
				Static23.aFloat9 = local229 * Static253.aFloat64 + Static94.aFloat23 * local224;
				Static224.aFloat75 = local229 * Static4.aFloat54 + local224 * Static186.aFloat52;
				Static295.aFloat60 = Static65.aFloat14 * local224 + Static292.aFloat71 * local229;
				Static252.anInt5209 = ((Static216.anInt4236 & 0xFF00FF) * local212 + (Static115.anInt2145 & 0xFF00FF) * local216 & 0xFF00FF00) + (local216 * (Static115.anInt2145 & 0xFF00) + local212 * (Static216.anInt4236 & 0xFF00) & 0xFF0000) >> 8;
				Static23.anInt431 = Static78.anInt1467 * local212 + Static167.anInt3156 * local216 >> 8;
				Static41.aFloat11 = Static88.aFloat22 * local224 + Static52.aFloat13 * local229;
				if (Static194.aClass3_Sub4_Sub24_6 != Static60.aClass3_Sub4_Sub24_2) {
					if (Static60.aClass3_Sub4_Sub24_2 == null || Static194.aClass3_Sub4_Sub24_6 == null) {
						Static177.aClass3_Sub4_Sub24_5 = null;
					} else {
						Static177.aClass3_Sub4_Sub24_5 = Static237.aClass3_Sub4_Sub24_7.method5025(Static60.aClass3_Sub4_Sub24_2, Static194.aClass3_Sub4_Sub24_6, (float) Static230.anInt4490 / 65536.0F);
					}
				}
			}
		}
		return Static252.anInt5209;
	}
}
