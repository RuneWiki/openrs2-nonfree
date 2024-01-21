import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static int anInt2294;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1311 = Static122.method531("Choose Option");

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1312 = aClass73_1311;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array14 = new Class73[100];

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1313 = Static122.method531("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "[I")
	public static int[] anIntArray230 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1314 = Static122.method531("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1776() {
		aCanvas1 = null;
		anIntArray230 = null;
		aClass73_1314 = null;
		aClass73Array14 = null;
		aClass73_1313 = null;
		aClass73_1311 = null;
		aClass73_1312 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!f;IB)Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 method1777(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1) {
		return Static150.method2592(arg0, arg1) ? Static133.method2205() : null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBLclient!id;II)V")
	public static void method1778(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static142.anInt3262 >= 400) {
			return;
		}
		if (arg1.anIntArray174 != null) {
			arg1 = arg1.method1201();
		}
		if (arg1 == null || !arg1.aBoolean99) {
			return;
		}
		@Pc(36) Class73 local36 = arg1.aClass73_845;
		if (arg1.anInt1554 != 0) {
			local36 = Static19.method372(new Class73[] { local36, Static141.method2359(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2712, arg1.anInt1554), Static45.aClass73_615, Static121.aClass73_1601, Static154.method2485(arg1.anInt1554), Static40.aClass73_573 });
		}
		if (Static4.anInt71 == 1) {
			Static63.method1125(arg2, arg0, Static63.aClass73_815, Static19.method372(new Class73[] { Static122.aClass73_397, Static86.aClass73_1047, local36 }), 7, arg3);
		} else if (!Static159.aBoolean233) {
			@Pc(90) Class73[] local90 = arg1.aClass73Array11;
			if (Static125.aBoolean192) {
				local90 = Static149.method2458(local90);
			}
			@Pc(100) int local100;
			if (local90 != null) {
				for (local100 = 4; local100 >= 0; local100--) {
					if (local90[local100] != null && !local90[local100].method2438(Static99.aClass73_1262)) {
						@Pc(119) byte local119 = 0;
						if (local100 == 0) {
							local119 = 15;
						}
						if (local100 == 1) {
							local119 = 1;
						}
						if (local100 == 2) {
							local119 = 26;
						}
						if (local100 == 3) {
							local119 = 41;
						}
						if (local100 == 4) {
							local119 = 11;
						}
						Static63.method1125(arg2, arg0, local90[local100], Static19.method372(new Class73[] { Static57.aClass73_733, local36 }), local119, arg3);
					}
				}
			}
			if (local90 != null) {
				for (local100 = 4; local100 >= 0; local100--) {
					if (local90[local100] != null && local90[local100].method2438(Static99.aClass73_1262)) {
						@Pc(197) short local197 = 0;
						@Pc(199) int local199 = 0;
						if (Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt2712 < arg1.anInt1554) {
							local197 = 2000;
						}
						if (local100 == 0) {
							local199 = local197 + 15;
						}
						if (local100 == 1) {
							local199 = local197 + 1;
						}
						if (local100 == 2) {
							local199 = local197 + 26;
						}
						if (local100 == 3) {
							local199 = local197 + 41;
						}
						if (local100 == 4) {
							local199 = local197 + 11;
						}
						Static63.method1125(arg2, arg0, local90[local100], Static19.method372(new Class73[] { Static57.aClass73_733, local36 }), local199, arg3);
					}
				}
			}
			Static63.method1125(arg2, arg0, Static4.aClass73_52, Static19.method372(new Class73[] { Static57.aClass73_733, local36 }), 1007, arg3);
			return;
		} else if ((Static44.anInt1025 & 0x2) == 2) {
			Static63.method1125(arg2, arg0, Static90.aClass73_1133, Static19.method372(new Class73[] { Static39.aClass73_541, Static86.aClass73_1047, local36 }), 34, arg3);
			return;
		}
	}
}
