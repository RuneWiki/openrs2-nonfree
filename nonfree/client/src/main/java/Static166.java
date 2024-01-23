import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	public static int anInt3879;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public static int anInt3882;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[J")
	public static long[] aLongArray24 = new long[1000];

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!lc;")
	public static Class79 aClass79_25 = new Class79(64);

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString254 = "white:";

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public static void method2881(@OriginalArg(1) int arg0) {
		if (Static143.anInt3473 == 0) {
			Static13.aClass1_Sub4_Sub2_1.method1239(arg0);
		} else {
			Static194.anInt4334 = arg0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method2882() {
		@Pc(8) int[] local8 = new int[Static94.anInt4255];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static94.anInt4255; local12++) {
			@Pc(18) Class89 local18 = Static93.method2006(local12);
			if (local18.anInt3651 >= 0 || local18.anInt3648 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static242.anIntArray457 = new int[local10];
		for (@Pc(38) int local38 = 0; local38 < local10; local38++) {
			Static242.anIntArray457[local38] = local8[local38];
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method2883() {
		if (Static140.anInt3388 != -1) {
			Static63.method1218(Static140.anInt3388);
		}
		for (@Pc(14) int local14 = 0; local14 < Static255.anInt5426; local14++) {
			if (Static198.aBooleanArray19[local14]) {
				Static186.aBooleanArray17[local14] = true;
			}
			Static93.aBooleanArray6[local14] = Static198.aBooleanArray19[local14];
			Static198.aBooleanArray19[local14] = false;
		}
		Static224.anInt4924 = -1;
		Static194.aClass122_14 = null;
		Static147.anInt3576 = -1;
		Static263.anInt5531 = Static156.anInt3722;
		if (Static140.anInt3388 != -1) {
			Static255.anInt5426 = 0;
			Static182.method3127();
		}
		Static189.method3184();
		Static37.anInt999 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!sa;IIIII)V")
	public static void method2884(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static256.anInt5440) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static94.anInt4252) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static239.anInt5153 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub16 local62 = Static142.aClass1_Sub16ArrayArrayArray4[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static38.anIntArrayArrayArray6[local17][local23][local32] + Static38.anIntArrayArrayArray6[local17][local23 + 1][local32] + Static38.anIntArrayArrayArray6[local17][local23][local32 + 1] + Static38.anIntArrayArrayArray6[local17][local23 + 1][local32 + 1]) / 4 - (Static38.anIntArrayArrayArray6[arg1][arg2][arg3] + Static38.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + Static38.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + Static38.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class144 local151 = local62.aClass144_1;
									if (local151 != null) {
										if (local151.aClass9_8.method3597()) {
											arg0.method3596(local151.aClass9_8, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass9_9 != null && local151.aClass9_9.method3597()) {
											arg0.method3596(local151.aClass9_9, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt2929; local222++) {
										@Pc(228) Class47 local228 = local62.aClass47Array1[local222];
										if (local228 != null && local228.aClass9_1.method3597() && (local23 == local228.anInt2146 || local23 == local3) && (local32 == local228.anInt2148 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt2160 + 1 - local228.anInt2146;
											@Pc(265) int local265 = local228.anInt2158 + 1 - local228.anInt2148;
											arg0.method3596(local228.aClass9_1, (local228.anInt2146 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt2148 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
