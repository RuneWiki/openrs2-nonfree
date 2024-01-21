import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!db", name = "C", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public static int anInt596;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "[Lclient!dc;")
	public static Class1_Sub5[] aClass1_Sub5Array1 = new Class1_Sub5[2048];

	@OriginalMember(owner = "client!db", name = "B", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!db", name = "N", descriptor = "Lclient!fc;")
	private static Class25 aClass25_269 = Static78.method1313("Type");

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Lclient!fc;")
	public static Class25 aClass25_266 = aClass25_269;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "Lclient!fc;")
	public static Class25 aClass25_267 = Static78.method1313("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!db", name = "F", descriptor = "Lclient!fc;")
	public static Class25 aClass25_268 = Static78.method1313("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public static int anInt590 = 0;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Lclient!fc;")
	private static Class25 aClass25_271 = Static78.method1313("Unable to find ");

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_270 = aClass25_271;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!db", name = "W", descriptor = "[I")
	public static int[] anIntArray138 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	public static int anInt601 = 127;

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_272 = Static78.method1313("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!db", name = "db", descriptor = "I")
	public static int anInt604 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static57.method1727(arg6)) {
			Static123.method1994(arg0, arg3, -1, Static56.aClass1_Sub2_Sub14ArrayArray1[arg6], 0, arg2, arg7, 0, arg5, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public static void method491() {
		aClass25_267 = null;
		anIntArray138 = null;
		aClass1_Sub5Array1 = null;
		aClass25_271 = null;
		aClass1_Sub2_Sub2_Sub1Array2 = null;
		aClass25_268 = null;
		aLongArray1 = null;
		aClass25_269 = null;
		aClass25_266 = null;
		aClass25_272 = null;
		aClass25_270 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V")
	public static void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static71.aClass2_8.method22(); local10 != null; local10 = (Class1_Sub4) Static71.aClass2_8.method23()) {
			if (local10.anInt591 != -1 || local10.anIntArray137 != null) {
				@Pc(26) int local26 = 0;
				if (arg1 > local10.anInt602) {
					local26 = arg1 - local10.anInt602;
				} else if (arg1 < local10.anInt599) {
					local26 = local10.anInt599 - arg1;
				}
				if (arg2 > local10.anInt594) {
					local26 += arg2 - local10.anInt594;
				} else if (arg2 < local10.anInt589) {
					local26 += local10.anInt589 - arg2;
				}
				if (local10.anInt587 < local26 - 64 || anInt601 == 0 || local10.anInt598 != arg0) {
					if (local10.aClass1_Sub3_Sub3_2 != null) {
						Static33.aClass1_Sub3_Sub2_1.method924(local10.aClass1_Sub3_Sub3_2);
						local10.aClass1_Sub3_Sub3_2 = null;
					}
					if (local10.aClass1_Sub3_Sub3_1 != null) {
						Static33.aClass1_Sub3_Sub2_1.method924(local10.aClass1_Sub3_Sub3_1);
						local10.aClass1_Sub3_Sub3_1 = null;
					}
				} else {
					local26 -= 64;
					if (local26 < 0) {
						local26 = 0;
					}
					@Pc(140) int local140 = anInt601 * (local10.anInt587 - local26) / local10.anInt587;
					if (local10.aClass1_Sub3_Sub3_2 != null) {
						local10.aClass1_Sub3_Sub3_2.method1486(local140);
					} else if (local10.anInt591 >= 0) {
						@Pc(158) Class16 local158 = Static131.method389(Static45.aClass56_Sub1_6, local10.anInt591, 0);
						if (local158 != null) {
							@Pc(165) Class1_Sub14_Sub1 local165 = local158.method386().method1538(Static55.aClass58_1);
							@Pc(170) Class1_Sub3_Sub3 local170 = Static135.method1504(local165, local140);
							local170.method1474(-1);
							Static33.aClass1_Sub3_Sub2_1.method925(local170);
							local10.aClass1_Sub3_Sub3_2 = local170;
						}
					}
					if (local10.aClass1_Sub3_Sub3_1 != null) {
						local10.aClass1_Sub3_Sub3_1.method1486(local140);
						if (!local10.aClass1_Sub3_Sub3_1.method2025()) {
							local10.aClass1_Sub3_Sub3_1 = null;
						}
					} else if (local10.anIntArray137 != null && (local10.anInt588 -= arg3) <= 0) {
						@Pc(204) int local204 = (int) (Math.random() * (double) local10.anIntArray137.length);
						@Pc(212) Class16 local212 = Static131.method389(Static45.aClass56_Sub1_6, local10.anIntArray137[local204], 0);
						if (local212 != null) {
							@Pc(219) Class1_Sub14_Sub1 local219 = local212.method386().method1538(Static55.aClass58_1);
							@Pc(224) Class1_Sub3_Sub3 local224 = Static135.method1504(local219, local140);
							local224.method1474(0);
							Static33.aClass1_Sub3_Sub2_1.method925(local224);
							local10.anInt588 = (int) (Math.random() * (double) (local10.anInt593 - local10.anInt595)) + local10.anInt595;
							local10.aClass1_Sub3_Sub3_1 = local224;
						}
					}
				}
			}
		}
	}
}
