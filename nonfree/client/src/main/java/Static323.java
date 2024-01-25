import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt6326 = 1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILclient!mr;Lclient!mr;IIII)V")
	public static void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub3 arg4, @OriginalArg(5) Class1_Sub2_Sub3 arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg4.method5776();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class46 local21 = (Class46) Static304.aClass107_50.method3021((long) local7);
		if (local21 == null) {
			@Pc(28) Class40[] local28 = Static368.method833(Static338.aClass104_184, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static51.aClass37_1.method3708(local28[0]);
			Static304.aClass107_50.method3018((long) local7, local21);
		}
		Static30.method404(arg5.anInt6893, arg5.anInt6888, arg5.aByte77, arg0 >> 1, arg3 >> 1, arg5.method5787() * 64, 0);
		@Pc(74) int local74 = Static311.anIntArray474[0] + arg2 - 18;
		@Pc(82) int local82 = local74 + arg1 / 4 * 18;
		@Pc(93) int local93 = arg6 + Static311.anIntArray474[1] - 54 - 16;
		@Pc(101) int local101 = local93 + arg1 % 4 * 18;
		local21.method5016(local82, local101);
		if (arg4 == arg5) {
			Static51.aClass37_1.method3737(18, local82 - 1, -256, local101 - 1, 18);
		}
		@Pc(123) Class57_Sub3 local123 = Static31.method432();
		local123.anInt1446 = local101 + 16;
		local123.aClass1_Sub2_Sub3_1 = arg4;
		local123.anInt1447 = local82 + 16;
		local123.anInt1445 = local82;
		local123.anInt1448 = local101;
		Static319.aClass193_9.method5222(local123);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5332(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static228.aCharArray5[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
	public static void method5333(@OriginalArg(0) int arg0) {
		Static255.anInt5284 = arg0;
		Static354.aClass107_57.method3015();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5334(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static343.method3354(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static221.anInt4878; local25++) {
			@Pc(36) String local36 = Static363.aStringArray44[local25];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static343.method3354(local36);
			if (local36 != null && local36.equals(local20)) {
				Static221.anInt4878--;
				for (@Pc(60) int local60 = local25; local60 < Static221.anInt4878; local60++) {
					Static363.aStringArray44[local60] = Static363.aStringArray44[local60 + 1];
					Static26.aStringArray25[local60] = Static26.aStringArray25[local60 + 1];
					Static213.aStringArray31[local60] = Static213.aStringArray31[local60 + 1];
					Static2.aStringArray1[local60] = Static2.aStringArray1[local60 + 1];
					Static332.aBooleanArray28[local60] = Static332.aBooleanArray28[local60 + 1];
				}
				Static193.anInt4255 = Static125.anInt2664;
				Static300.method5057(Static225.aClass157_148);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(arg0));
				Static197.aClass2_Sub12_Sub2_2.method3156(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	public static void method5335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray535[0];
		@Pc(13) int local13 = Static177.aClass1_Sub2_Sub3_Sub1_1.anIntArray534[0];
		if (Static150.aClass172_3 == Static13.aClass172_1) {
			if (Static86.method1714(1, arg1, 0, local8, local13, -2, arg0, 1, false, 0)) {
				return;
			}
			Static86.method1714(1, arg1, 0, local8, local13, -3, arg0, 1, false, 0);
		} else if (Static86.method1714(1, arg1, 0, local8, local13, -3, arg0, 1, false, 0)) {
			return;
		} else {
			Static86.method1714(1, arg1, 0, local8, local13, -2, arg0, 1, false, 0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method5336(@OriginalArg(1) Class104 arg0) {
		Static219.anInt4849 = 0;
		Static122.anInt2597 = 0;
		Static67.aClass193_5 = new Class193();
		Static269.aClass57_Sub1_Sub1_Sub1Array4 = new Class57_Sub1_Sub1_Sub1[1024];
		Static101.method2010(arg0);
		Static356.method5685(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)V")
	public static void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(9) int local9 = arg3; local9 <= arg4; local9++) {
			Static115.method2278(Static364.anIntArrayArray57[local9], arg1, arg0, arg2);
		}
	}
}
