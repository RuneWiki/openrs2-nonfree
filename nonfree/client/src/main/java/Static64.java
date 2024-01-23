import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "Lclient!si;")
	public static Class157 aClass157_5 = null;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "Lclient!io;")
	public static Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString49 = "wave:";

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "Z")
	public static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZII)V")
	public static void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		@Pc(18) int local18;
		for (local7 = arg3; local7 <= arg2 + arg3; local7++) {
			for (local18 = arg0; local18 <= arg1 + arg0; local18++) {
				if (local18 >= 0 && local18 < 104 && local7 >= 0 && local7 < 104) {
					Static312.aByteArrayArrayArray21[arg4][local18][local7] = 127;
				}
			}
		}
		for (local7 = arg3; local7 < arg3 + arg2; local7++) {
			for (local18 = arg0; local18 < arg1 + arg0; local18++) {
				if (local18 >= 0 && local18 < 104 && local7 >= 0 && local7 < 104) {
					Static280.anIntArrayArrayArray13[arg4][local18][local7] = arg4 > 0 ? Static280.anIntArrayArrayArray13[arg4 - 1][local18][local7] : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (local7 = arg3 + 1; local7 < arg2 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static280.anIntArrayArrayArray13[arg4][arg0][local7] = Static280.anIntArrayArrayArray13[arg4][arg0 - 1][local7];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local7 = arg0 + 1; local7 < arg1 + arg0; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static280.anIntArrayArrayArray13[arg4][local7][arg3] = Static280.anIntArrayArrayArray13[arg4][local7][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 > 0 && Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3] != 0) {
				Static280.anIntArrayArrayArray13[arg4][arg0][arg3] = Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3];
			} else if (arg3 > 0 && Static280.anIntArrayArrayArray13[arg4][arg0][arg3 - 1] != 0) {
				Static280.anIntArrayArrayArray13[arg4][arg0][arg3] = Static280.anIntArrayArrayArray13[arg4][arg0][arg3 - 1];
			} else if (arg0 > 0 && arg3 > 0 && Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3 - 1] != 0) {
				Static280.anIntArrayArrayArray13[arg4][arg0][arg3] = Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3 - 1];
			}
		} else if (arg0 > 0 && Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3] != Static280.anIntArrayArrayArray13[arg4 - 1][arg0 - 1][arg3]) {
			Static280.anIntArrayArrayArray13[arg4][arg0][arg3] = Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3];
		} else if (arg3 > 0 && Static280.anIntArrayArrayArray13[arg4][arg0][arg3 - 1] != Static280.anIntArrayArrayArray13[arg4 - 1][arg0][arg3 - 1]) {
			Static280.anIntArrayArrayArray13[arg4][arg0][arg3] = Static280.anIntArrayArrayArray13[arg4][arg0][arg3 - 1];
		} else if (arg0 > 0 && arg3 > 0 && Static280.anIntArrayArrayArray13[arg4 - 1][arg0 - 1][arg3 - 1] != Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3 - 1]) {
			Static280.anIntArrayArrayArray13[arg4][arg0][arg3] = Static280.anIntArrayArrayArray13[arg4][arg0 - 1][arg3 - 1];
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
	public static void method1134(@OriginalArg(0) int arg0) {
		if (Static63.anInt1315 == 0) {
			Static292.aClass1_Sub7_Sub2_3.method2762(arg0);
		} else {
			Static118.anInt2421 = arg0;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIZIZI)V")
	public static void method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2) {
			Static71.method1389();
		}
		if (Static196.aFrame1 != null && (arg3 != 3 || arg0 != Static299.anInt5384 || arg5 != Static80.anInt1772)) {
			Static258.method4025(Static222.aClass176_3, Static196.aFrame1);
			Static196.aFrame1 = null;
		}
		if (arg3 == 3 && Static196.aFrame1 == null) {
			Static196.aFrame1 = Static283.method4284(arg5, Static222.aClass176_3, 0, arg0);
			if (Static196.aFrame1 != null) {
				Static299.anInt5384 = arg0;
				Static80.anInt1772 = arg5;
				Static304.method4550(Static222.aClass176_3);
			}
		}
		if (arg3 == 3 && Static196.aFrame1 == null) {
			method1135(-1, arg1, true, Static271.anInt4996, true, -1);
			return;
		}
		@Pc(80) Container local80;
		if (Static196.aFrame1 != null) {
			local80 = Static196.aFrame1;
		} else if (Static311.aFrame2 == null) {
			local80 = Static222.aClass176_3.anApplet1;
		} else {
			local80 = Static311.aFrame2;
		}
		Static187.anInt3577 = local80.getSize().width;
		Static253.anInt4653 = local80.getSize().height;
		@Pc(102) Insets local102;
		if (Static311.aFrame2 == local80) {
			local102 = Static311.aFrame2.getInsets();
			Static253.anInt4653 -= local102.top + local102.bottom;
			Static187.anInt3577 -= local102.left + local102.right;
		}
		if (arg3 < 2) {
			Static24.anInt500 = 0;
			Static288.anInt5232 = 503;
			Static194.anInt3876 = 765;
			Static310.anInt5534 = (Static187.anInt3577 - 765) / 2;
		} else {
			Static310.anInt5534 = 0;
			Static288.anInt5232 = Static253.anInt4653;
			Static194.anInt3876 = Static187.anInt3577;
			Static24.anInt500 = 0;
		}
		if (arg4) {
			Static148.method2589(Static229.aCanvas2);
			Static155.method2674(Static229.aCanvas2);
			if (Static9.aClass47_1 != null) {
				Static9.aClass47_1.method1166(Static229.aCanvas2);
			}
			Static222.aClient1.method766();
			Static142.method2503(Static229.aCanvas2);
			Static156.method2692(Static229.aCanvas2);
			if (Static9.aClass47_1 != null) {
				Static9.aClass47_1.method1169(Static229.aCanvas2);
			}
		} else {
			if (Static71.aBoolean165) {
				Static71.method1410(Static194.anInt3876, Static288.anInt5232);
			}
			Static229.aCanvas2.setSize(Static194.anInt3876, Static288.anInt5232);
			if (Static311.aFrame2 == local80) {
				local102 = Static311.aFrame2.getInsets();
				Static229.aCanvas2.setLocation(Static310.anInt5534 + local102.left, Static24.anInt500 + local102.top);
			} else {
				Static229.aCanvas2.setLocation(Static310.anInt5534, Static24.anInt500);
			}
		}
		if (arg3 == 0 && arg1 > 0) {
			Static71.method1417(Static229.aCanvas2);
		}
		if (arg2 && arg3 > 0) {
			Static229.aCanvas2.setIgnoreRepaint(true);
			if (!Static129.aBoolean225) {
				Static203.method2967();
				Static82.aClass130_1 = null;
				Static82.aClass130_1 = Static268.method4138(Static288.anInt5232, Static229.aCanvas2, Static194.anInt3876);
				Static77.method1597();
				if (Static97.anInt2087 == 5) {
					Static58.method1042(Static19.aClass1_Sub5_Sub9_1, true);
				} else {
					Static288.method4341(false, Static270.aString192);
				}
				try {
					@Pc(258) Graphics local258 = Static229.aCanvas2.getGraphics();
					Static82.aClass130_1.method4486(local258);
				} catch (@Pc(266) Exception local266) {
				}
				Static51.method940();
				if (arg1 == 0) {
					Static82.aClass130_1 = Static268.method4138(503, Static229.aCanvas2, 765);
				} else {
					Static82.aClass130_1 = null;
				}
				@Pc(287) Class153 local287 = Static222.aClass176_3.method4379(Static222.aClient1.getClass());
				while (local287.anInt4614 == 0) {
					Static16.method242(100L);
				}
				if (local287.anInt4614 == 1) {
					Static129.aBoolean225 = true;
				}
			}
			if (Static129.aBoolean225) {
				Static71.method1401(Static229.aCanvas2, Static40.anInt844 * 2);
			}
		}
		if (!Static71.aBoolean165 && arg3 > 0) {
			method1135(-1, arg1, true, 0, true, -1);
			return;
		}
		if (arg3 > 0 && arg1 == 0) {
			Static222.aThread1.setPriority(5);
			Static82.aClass130_1 = null;
			Static169.method2929();
			((Class52_Sub1) Static119.anInterface5_1).method1489(200);
			if (Static69.aBoolean146) {
				Static119.method2167(0.7F);
			}
			if (Static54.aClass43ArrayArray1 == null) {
				Static54.aClass43ArrayArray1 = new Class43[13][13];
			}
			Static151.method2643();
			Static15.method226();
			Static158.method3207();
		} else if (arg3 == 0 && arg1 > 0) {
			Static222.aThread1.setPriority(1);
			Static82.aClass130_1 = Static268.method4138(503, Static229.aCanvas2, 765);
			Static169.method2927();
			Static52.method965();
			((Class52_Sub1) Static119.anInterface5_1).method1489(20);
			if (Static69.aBoolean146) {
				if (Static153.anInt2340 == 1) {
					Static119.method2167(0.9F);
				}
				if (Static153.anInt2340 == 2) {
					Static119.method2167(0.8F);
				}
				if (Static153.anInt2340 == 3) {
					Static119.method2167(0.7F);
				}
				if (Static153.anInt2340 == 4) {
					Static119.method2167(0.6F);
				}
			}
			Static123.method2226();
			Static158.method3207();
		}
		Static44.aBoolean96 = !Static115.method2108();
		Static52.method950(Static194.anInt3876, Static288.anInt5232);
		if (arg2) {
			Static51.method939();
		}
		if (arg3 >= 2) {
			Static202.aBoolean350 = true;
		} else {
			Static202.aBoolean350 = false;
		}
		if (Static315.anInt5636 != -1) {
			Static270.method4170(true);
		}
		if (Static97.aClass49_2 != null && (Static97.anInt2087 == 30 || Static97.anInt2087 == 25)) {
			Static92.method1759();
		}
		for (@Pc(474) int local474 = 0; local474 < 100; local474++) {
			Static166.aBooleanArray11[local474] = true;
		}
		Static183.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public static void method1136() {
		Static34.aClass175_7.method4287();
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)Lclient!wm;")
	public static Class192 method1137(@OriginalArg(1) int arg0) {
		@Pc(10) Class192 local10 = (Class192) Static128.aClass175_21.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static86.aClass119_37.method3235(arg0, 4);
		local10 = new Class192();
		if (local27 != null) {
			local10.method4668(new Class1_Sub13(local27), arg0);
		}
		Static128.aClass175_21.method4285(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZ)Ljava/lang/String;")
	public static String method1138(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static252.method3950(arg0);
	}
}
