import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "Lclient!bh;")
	public static Class15 aClass15_5;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	public static int anInt3545;

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString115 = "scroll:";

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString116 = "Take";

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
	public static void method2813() {
		aString116 = null;
		aString115 = null;
		aStringArray29 = null;
		aClass15_5 = null;
		anIntArray299 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method2814(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(12) boolean local12 = false;
		@Pc(18) String local18 = Static176.method653(Static23.method377(arg0));
		for (@Pc(20) int local20 = 0; local20 < Static41.anInt856; local20++) {
			@Pc(29) Class12_Sub3_Sub2 local29 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local20]];
			if (local29 != null && local29.aString132 != null && local29.aString132.equalsIgnoreCase(local18)) {
				if (arg1 == 1) {
					Static142.aClass4_Sub17_Sub1_3.method1905(102);
					Static142.aClass4_Sub17_Sub1_3.method1855(Static85.anIntArray179[local20]);
					Static142.aClass4_Sub17_Sub1_3.method1884(0);
				} else if (arg1 == 4) {
					Static142.aClass4_Sub17_Sub1_3.method1905(19);
					Static142.aClass4_Sub17_Sub1_3.method1861(0);
					Static142.aClass4_Sub17_Sub1_3.method1897(Static85.anIntArray179[local20]);
				} else if (arg1 == 5) {
					Static142.aClass4_Sub17_Sub1_3.method1905(158);
					Static142.aClass4_Sub17_Sub1_3.method1884(0);
					Static142.aClass4_Sub17_Sub1_3.method1876(Static85.anIntArray179[local20]);
				} else if (arg1 == 6) {
					Static142.aClass4_Sub17_Sub1_3.method1905(212);
					Static142.aClass4_Sub17_Sub1_3.method1855(Static85.anIntArray179[local20]);
					Static142.aClass4_Sub17_Sub1_3.method1884(0);
				} else if (arg1 == 7) {
					Static142.aClass4_Sub17_Sub1_3.method1905(216);
					Static142.aClass4_Sub17_Sub1_3.method1855(Static85.anIntArray179[local20]);
					Static142.aClass4_Sub17_Sub1_3.method1861(0);
				}
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static271.method4062(Static76.aString40 + local18, 0, "");
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method2815(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)V")
	public static void method2816() {
		Static227.aClass33_30.method843();
		Static219.aClass33_32.method843();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B[J[I)V")
	public static void method2817(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static93.method1501(arg0, 0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILclient!en;IJIIII)Z")
	public static boolean method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static177.method2746(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(BI)Lclient!gg;")
	public static Class4_Sub2_Sub9 method2819(@OriginalArg(1) int arg0) {
		return (Class4_Sub2_Sub9) Static48.aClass97_1.method2360((long) arg0);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)V")
	public static void method2820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static229.anInt5382 > 0) {
			Static57.method926(Static229.anInt5382);
			Static229.anInt5382 = 0;
		}
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = Static166.anInt3305 * arg1;
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 1; local30 < 255; local30++) {
			@Pc(50) int local50 = Static212.anIntArray382[local30] * (256 - local30) / 256;
			if (local50 < 0) {
				local50 = 0;
			}
			local22 += local50;
			@Pc(64) int local64;
			for (local64 = local50; local64 < 128; local64++) {
				@Pc(72) int local72 = Static165.anIntArray292[local22++];
				@Pc(79) int local79 = Static166.anIntArray293[local26++ + arg0];
				if (local72 == 0) {
					Static168.aClass4_Sub2_Sub1_Sub1_3.anIntArray387[local28++] = local79;
				} else {
					@Pc(95) int local95 = 238 - local72;
					if (local95 > 255) {
						local95 = 255;
					}
					@Pc(105) int local105 = local72 + 18;
					local72 = Static89.anIntArray195[local72];
					if (local105 > 255) {
						local105 = 255;
					}
					Static168.aClass4_Sub2_Sub1_Sub1_3.anIntArray387[local28++] = ((local79 & 0xFF00FF) * local95 + (local72 & 0xFF00FF) * local105 & 0xFF00FF00) + ((local79 & 0xFF00) * local95 + (local72 & 0xFF00) * local105 & 0xFF0000) >> 8;
				}
			}
			for (local64 = 0; local64 < local50; local64++) {
				Static168.aClass4_Sub2_Sub1_Sub1_3.anIntArray387[local28++] = Static166.anIntArray293[local26++ + arg0];
			}
			local26 += Static166.anInt3305 - 128;
		}
		if (Static178.aBoolean216) {
			Static186.method2953(Static168.aClass4_Sub2_Sub1_Sub1_3.anIntArray387, arg0, arg1, Static168.aClass4_Sub2_Sub1_Sub1_3.anInt4301, Static168.aClass4_Sub2_Sub1_Sub1_3.anInt4308);
		} else {
			Static168.aClass4_Sub2_Sub1_Sub1_3.method3461(arg0, arg1);
		}
	}
}
