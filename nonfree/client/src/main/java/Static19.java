import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	public static int anInt355;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "Lclient!td;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "Lclient!km;")
	public static Class91 aClass91_18;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "Z")
	public static boolean aBoolean30;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZBZII)V")
	public static void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static277.method4202();
		}
		if (Static237.aFrame2 != null && (arg0 != 3 || arg1 != Static75.anInt1605 || arg5 != Static146.anInt3171)) {
			Static246.method3819(Static253.aClass175_4, Static237.aFrame2);
			Static237.aFrame2 = null;
		}
		if (arg0 == 3 && Static237.aFrame2 == null) {
			Static237.aFrame2 = Static66.method1191(arg5, arg1, 0, Static253.aClass175_4);
			if (Static237.aFrame2 != null) {
				Static146.anInt3171 = arg5;
				Static75.anInt1605 = arg1;
				Static239.method3687(Static253.aClass175_4);
			}
		}
		if (arg0 == 3 && Static237.aFrame2 == null) {
			method362(Static296.anInt5585, -1, true, true, arg4, -1);
			return;
		}
		@Pc(84) Container local84;
		if (Static237.aFrame2 != null) {
			local84 = Static237.aFrame2;
		} else if (Static193.aFrame1 == null) {
			local84 = Static253.aClass175_4.anApplet1;
		} else {
			local84 = Static193.aFrame1;
		}
		Static82.anInt1780 = local84.getSize().width;
		Static179.anInt3754 = local84.getSize().height;
		@Pc(107) Insets local107;
		if (Static193.aFrame1 == local84) {
			local107 = Static193.aFrame1.getInsets();
			Static179.anInt3754 -= local107.top + local107.bottom;
			Static82.anInt1780 -= local107.left + local107.right;
		}
		if (arg0 < 2) {
			Static3.anInt122 = 765;
			Static148.anInt3206 = 503;
			Static273.anInt5328 = (Static82.anInt1780 - 765) / 2;
			Static98.anInt2312 = 0;
		} else {
			Static273.anInt5328 = 0;
			Static98.anInt2312 = 0;
			Static148.anInt3206 = Static179.anInt3754;
			Static3.anInt122 = Static82.anInt1780;
		}
		if (arg2) {
			Static68.method1246(Static156.aCanvas2);
			Static73.method1275(Static156.aCanvas2);
			if (Static190.aClass55_1 != null) {
				Static190.aClass55_1.method1570(Static156.aCanvas2);
			}
			Static237.aClient1.method758();
			Static154.method2705(Static156.aCanvas2);
			Static191.method3160(Static156.aCanvas2);
			if (Static190.aClass55_1 != null) {
				Static190.aClass55_1.method1572(Static156.aCanvas2);
			}
		} else {
			if (Static277.aBoolean412) {
				Static277.method4226(Static3.anInt122, Static148.anInt3206);
			}
			Static156.aCanvas2.setSize(Static3.anInt122, Static148.anInt3206);
			if (local84 == Static193.aFrame1) {
				local107 = Static193.aFrame1.getInsets();
				Static156.aCanvas2.setLocation(local107.left + Static273.anInt5328, local107.top + Static98.anInt2312);
			} else {
				Static156.aCanvas2.setLocation(Static273.anInt5328, Static98.anInt2312);
			}
		}
		if (arg0 == 0 && arg4 > 0) {
			Static277.method4211(Static156.aCanvas2);
		}
		if (arg3 && arg0 > 0) {
			Static156.aCanvas2.setIgnoreRepaint(true);
			if (!Static203.aBoolean319) {
				Static146.method2566();
				Static72.aClass99_1 = null;
				Static72.aClass99_1 = Static202.method3258(Static156.aCanvas2, Static148.anInt3206, Static3.anInt122);
				Static50.method962();
				if (Static194.anInt4017 == 5) {
					Static229.method3575(true, Static134.aClass1_Sub2_Sub1_3);
				} else {
					Static21.method412(false, Static186.aString229);
				}
				try {
					@Pc(265) Graphics local265 = Static156.aCanvas2.getGraphics();
					Static72.aClass99_1.method3514(local265);
				} catch (@Pc(273) Exception local273) {
				}
				Static10.method251();
				if (arg4 == 0) {
					Static72.aClass99_1 = Static202.method3258(Static156.aCanvas2, 503, 765);
				} else {
					Static72.aClass99_1 = null;
				}
				@Pc(296) Class116 local296 = Static253.aClass175_4.method4335(Static237.aClient1.getClass());
				while (local296.anInt3812 == 0) {
					Static48.method934(100L);
				}
				if (local296.anInt3812 == 1) {
					Static203.aBoolean319 = true;
				}
			}
			if (Static203.aBoolean319) {
				Static277.method4204(Static156.aCanvas2, Static63.anInt1347 * 2);
			}
		}
		if (!Static277.aBoolean412 && arg0 > 0) {
			method362(0, -1, true, true, arg4, -1);
			return;
		}
		if (arg0 > 0 && arg4 == 0) {
			Static243.aThread2.setPriority(5);
			Static72.aClass99_1 = null;
			Static271.method4129();
			((Class85_Sub1) Static110.anInterface2_1).method2283(200);
			if (Static188.aBoolean295) {
				Static110.method2021(0.7F);
			}
			if (Static73.aClass62ArrayArray1 == null) {
				Static73.aClass62ArrayArray1 = new Class62[13][13];
			}
			Static120.method2132();
			Static292.method4406();
			Static218.method3436();
		} else if (arg0 == 0 && arg4 > 0) {
			Static243.aThread2.setPriority(1);
			Static72.aClass99_1 = Static202.method3258(Static156.aCanvas2, 503, 765);
			Static271.method4134();
			Static235.method3617();
			((Class85_Sub1) Static110.anInterface2_1).method2283(20);
			if (Static188.aBoolean295) {
				if (Static285.anInt5431 == 1) {
					Static110.method2021(0.9F);
				}
				if (Static285.anInt5431 == 2) {
					Static110.method2021(0.8F);
				}
				if (Static285.anInt5431 == 3) {
					Static110.method2021(0.7F);
				}
				if (Static285.anInt5431 == 4) {
					Static110.method2021(0.6F);
				}
			}
			Static257.method3946();
			Static218.method3436();
		}
		Static174.aBoolean279 = !Static60.method1068();
		if (arg3) {
			Static191.method3158();
		}
		if (arg0 < 2) {
			Static253.aBoolean377 = false;
		} else {
			Static253.aBoolean377 = true;
		}
		if (Static116.anInt5593 != -1) {
			Static84.method1470(true);
		}
		if (Static87.aClass113_1 != null && (Static194.anInt4017 == 30 || Static194.anInt4017 == 25)) {
			Static78.method1358();
		}
		for (@Pc(495) int local495 = 0; local495 < 100; local495++) {
			Static272.aBooleanArray50[local495] = true;
		}
		Static115.aBoolean188 = true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZII)V")
	public static void method363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class1_Sub2_Sub18 local11 = Static130.method2227(arg0, 11);
		local11.method3905();
		local11.anInt5005 = arg1;
		local11.anInt5000 = arg2;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(B)V")
	public static void method365() {
		if (Static112.anIntArray231 != null && Static281.anIntArray463 != null) {
			return;
		}
		Static281.anIntArray463 = new int[256];
		Static112.anIntArray231 = new int[256];
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(33) double local33 = (double) local23 / 255.0D * 6.283185307179586D;
			Static112.anIntArray231[local23] = (int) (Math.sin(local33) * 4096.0D);
			Static281.anIntArray463[local23] = (int) (Math.cos(local33) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
	public static int method366() {
		return 6;
	}
}
