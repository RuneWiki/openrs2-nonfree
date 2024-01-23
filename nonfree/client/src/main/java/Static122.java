import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!j", name = "F", descriptor = "Lclient!ml;")
	public static Class1_Sub3_Sub13 aClass1_Sub3_Sub13_7;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "[Lclient!wf;")
	public static Class191[] aClass191Array1;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "Lclient!th;")
	public static Class168 aClass168_91;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Lclient!ci;")
	public static Class26 aClass26_26 = new Class26();

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!j", name = "I", descriptor = "[I")
	public static int[] anIntArray270 = new int[128];

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	public static int anInt2670 = -1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!wf;III)V")
	public static void method2011(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt6131 == 1) {
			Static12.method2960(arg0.anInt6134, -1, 0L, "", 0, arg0.aString437, (short) 6);
		}
		@Pc(40) String local40;
		if (arg0.anInt6131 == 2 && !Static230.aBoolean185) {
			local40 = Static12.method2958(arg0);
			if (local40 != null) {
				Static12.method2960(arg0.anInt6134, -1, 0L, "<col=00ff00>" + arg0.aString435, -1, local40, (short) 24);
			}
		}
		if (arg0.anInt6131 == 3) {
			Static12.method2960(arg0.anInt6134, -1, 0L, "", 0, Static295.aString423, (short) 9);
		}
		if (arg0.anInt6131 == 4) {
			Static12.method2960(arg0.anInt6134, -1, 0L, "", 0, arg0.aString437, (short) 14);
		}
		if (arg0.anInt6131 == 5) {
			Static12.method2960(arg0.anInt6134, -1, 0L, "", 0, arg0.aString437, (short) 47);
		}
		if (arg0.anInt6131 == 6 && Static290.aClass191_16 == null) {
			Static12.method2960(arg0.anInt6134, -1, 0L, "", -1, arg0.aString437, (short) 31);
		}
		@Pc(167) int local167;
		@Pc(165) int local165;
		if (arg0.anInt6086 == 2) {
			local165 = 0;
			for (local167 = 0; local167 < arg0.anInt6102; local167++) {
				for (@Pc(173) int local173 = 0; local173 < arg0.anInt6150; local173++) {
					@Pc(189) int local189 = local167 * (arg0.anInt6148 + 32);
					@Pc(197) int local197 = local173 * (arg0.anInt6135 + 32);
					if (local165 < 20) {
						local189 += arg0.anIntArray545[local165];
						local197 += arg0.anIntArray548[local165];
					}
					if (arg1 >= local197 && arg2 >= local189 && local197 + 32 > arg1 && arg2 < local189 + 32) {
						Static143.anInt3267 = local165;
						Static210.aClass191_9 = arg0;
						if (arg0.anIntArray561[local165] > 0) {
							@Pc(255) Class1_Sub30 local255 = Static35.method737(arg0);
							@Pc(264) Class57 local264 = Static56.method1050(arg0.anIntArray561[local165] - 1);
							if (Static24.anInt662 == 1 && local255.method4553()) {
								if (arg0.anInt6134 != Static289.anInt5818 || local165 != Static174.anInt5576) {
									Static12.method2960(arg0.anInt6134, -1, (long) local264.anInt1776, Static311.aString444 + " -> <col=ff9040>" + local264.aString102, local165, Static163.aString216, (short) 11);
								}
							} else if (Static230.aBoolean185 && local255.method4553()) {
								@Pc(286) Class1_Sub3_Sub7 local286 = Static101.anInt155 == -1 ? null : Static279.method4264(Static101.anInt155);
								if ((Static56.anInt1257 & 0x10) != 0 && (local286 == null || local264.method1325(local286.anInt2417, Static101.anInt155) != local286.anInt2417)) {
									Static12.method2960(arg0.anInt6134, Static181.anInt3978, (long) local264.anInt1776, Static303.aString426 + " -> <col=ff9040>" + local264.aString102, local165, Static244.aString290, (short) 20);
								}
							} else {
								@Pc(344) String[] local344 = local264.aStringArray16;
								if (Static214.aBoolean290) {
									local344 = Static242.method3788(local344);
								}
								@Pc(357) int local357;
								@Pc(374) byte local374;
								if (local255.method4553()) {
									for (local357 = 4; local357 >= 3; local357--) {
										if (local344 != null && local344[local357] != null) {
											if (local357 == 3) {
												local374 = 60;
											} else {
												local374 = 57;
											}
											Static12.method2960(arg0.anInt6134, -1, (long) local264.anInt1776, "<col=ff9040>" + local264.aString102, local165, local344[local357], local374);
										}
									}
								}
								if (local255.method4559()) {
									Static12.method2960(arg0.anInt6134, Static7.anInt211, (long) local264.anInt1776, "<col=ff9040>" + local264.aString102, local165, Static163.aString216, (short) 33);
								}
								if (local255.method4553() && local344 != null) {
									for (local357 = 2; local357 >= 0; local357--) {
										if (local344[local357] != null) {
											local374 = 0;
											if (local357 == 0) {
												local374 = 38;
											}
											if (local357 == 1) {
												local374 = 42;
											}
											if (local357 == 2) {
												local374 = 25;
											}
											Static12.method2960(arg0.anInt6134, -1, (long) local264.anInt1776, "<col=ff9040>" + local264.aString102, local165, local344[local357], local374);
										}
									}
								}
								local344 = arg0.aStringArray49;
								if (Static214.aBoolean290) {
									local344 = Static242.method3788(local344);
								}
								if (local344 != null) {
									for (local357 = 4; local357 >= 0; local357--) {
										if (local344[local357] != null) {
											local374 = 0;
											if (local357 == 0) {
												local374 = 21;
											}
											if (local357 == 1) {
												local374 = 17;
											}
											if (local357 == 2) {
												local374 = 22;
											}
											if (local357 == 3) {
												local374 = 41;
											}
											if (local357 == 4) {
												local374 = 4;
											}
											Static12.method2960(arg0.anInt6134, -1, (long) local264.anInt1776, "<col=ff9040>" + local264.aString102, local165, local344[local357], local374);
										}
									}
								}
								Static12.method2960(arg0.anInt6134, Static234.anInt4944, (long) local264.anInt1776, "<col=ff9040>" + local264.aString102, local165, Static31.aString50, (short) 1001);
							}
						}
					}
					local165++;
				}
			}
		}
		if (!arg0.aBoolean408) {
			return;
		}
		if (!Static230.aBoolean185) {
			for (local165 = 9; local165 >= 5; local165--) {
				@Pc(686) String local686 = Static128.method2053(arg0, local165);
				if (local686 != null) {
					Static12.method2960(arg0.anInt6134, Static50.method281(local165, arg0), (long) (local165 + 1), arg0.aString433, arg0.anInt6165, local686, (short) 1010);
				}
			}
			local40 = Static12.method2958(arg0);
			if (local40 != null) {
				Static12.method2960(arg0.anInt6134, -1, 0L, arg0.aString433, arg0.anInt6165, local40, (short) 24);
			}
			for (local167 = 4; local167 >= 0; local167--) {
				@Pc(745) String local745 = Static128.method2053(arg0, local167);
				if (local745 != null) {
					Static12.method2960(arg0.anInt6134, Static50.method281(local167, arg0), (long) (local167 + 1), arg0.aString433, arg0.anInt6165, local745, (short) 43);
				}
			}
			if (Static35.method737(arg0).method4560()) {
				if (arg0.aString438 == null) {
					Static12.method2960(arg0.anInt6134, -1, 0L, "", arg0.anInt6165, Static286.aString410, (short) 31);
				} else {
					Static12.method2960(arg0.anInt6134, -1, 0L, "", arg0.anInt6165, arg0.aString438, (short) 31);
				}
			}
		} else if (Static35.method737(arg0).method4557() && (Static56.anInt1257 & 0x20) != 0) {
			Static12.method2960(arg0.anInt6134, Static181.anInt3978, 0L, Static303.aString426 + " -> " + arg0.aString433, arg0.anInt6165, Static244.aString290, (short) 16);
		}
	}
}
