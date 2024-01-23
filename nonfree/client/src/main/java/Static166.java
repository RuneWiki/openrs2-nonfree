import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "[Lclient!wf;")
	public static Class189[] aClass189Array3;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	public static int anInt3406 = 0;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	public static int anInt3407 = -1;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString211 = "Prepared sound engine";

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIIZIIZ)V")
	public static void method2826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			Static94.method1605();
		}
		if (Static122.aFrame1 != null && (arg4 != 3 || arg0 != Static179.anInt3403 || arg3 != Static137.anInt2627)) {
			Static237.method3695(Static276.aClass139_4, Static122.aFrame1);
			Static122.aFrame1 = null;
		}
		if (arg4 == 3 && Static122.aFrame1 == null) {
			Static122.aFrame1 = Static4.method67(0, arg0, arg3, Static276.aClass139_4);
			if (Static122.aFrame1 != null) {
				Static179.anInt3403 = arg0;
				Static137.anInt2627 = arg3;
				Static66.method1055(Static276.aClass139_4);
			}
		}
		if (arg4 == 3 && Static122.aFrame1 == null) {
			method2826(-1, arg1, true, -1, Static192.anInt3637, true);
			return;
		}
		@Pc(83) Container local83;
		if (Static122.aFrame1 != null) {
			local83 = Static122.aFrame1;
		} else if (Static172.aFrame2 == null) {
			local83 = Static276.aClass139_4.anApplet1;
		} else {
			local83 = Static172.aFrame2;
		}
		Static73.anInt1635 = local83.getSize().width;
		Static228.anInt4381 = local83.getSize().height;
		@Pc(110) Insets local110;
		if (local83 == Static172.aFrame2) {
			local110 = Static172.aFrame2.getInsets();
			Static73.anInt1635 -= local110.right + local110.left;
			Static228.anInt4381 -= local110.top + local110.bottom;
		}
		if (arg4 >= 2) {
			Static300.anInt5626 = 0;
			Static31.anInt526 = Static73.anInt1635;
			Static255.anInt4860 = 0;
			Static40.anInt690 = Static228.anInt4381;
		} else {
			Static255.anInt4860 = (Static73.anInt1635 - 765) / 2;
			Static31.anInt526 = 765;
			Static40.anInt690 = 503;
			Static300.anInt5626 = 0;
		}
		if (arg2) {
			Static38.method588(Static188.aCanvas115);
			Static54.method891(Static188.aCanvas115);
			if (Static253.aClass19_1 != null) {
				Static253.aClass19_1.method894(Static188.aCanvas115);
			}
			Static292.aClient1.method669();
			Static125.method1927(Static188.aCanvas115);
			Static54.method883(Static188.aCanvas115);
			if (Static253.aClass19_1 != null) {
				Static253.aClass19_1.method900(Static188.aCanvas115);
			}
		} else {
			if (Static94.aBoolean138) {
				Static94.method1587(Static31.anInt526, Static40.anInt690);
			}
			Static188.aCanvas115.setSize(Static31.anInt526, Static40.anInt690);
			if (local83 == Static172.aFrame2) {
				local110 = Static172.aFrame2.getInsets();
				Static188.aCanvas115.setLocation(Static255.anInt4860 + local110.left, Static300.anInt5626 + local110.top);
			} else {
				Static188.aCanvas115.setLocation(Static255.anInt4860, Static300.anInt5626);
			}
		}
		if (arg4 == 0 && arg1 > 0) {
			Static94.method1611(Static188.aCanvas115);
		}
		if (arg5 && arg4 > 0) {
			Static188.aCanvas115.setIgnoreRepaint(true);
			if (!Static67.aBoolean76) {
				Static281.method4347();
				Static152.aClass59_1 = null;
				Static152.aClass59_1 = Static174.method2740(Static40.anInt690, Static31.anInt526, Static188.aCanvas115);
				Static270.method4264();
				if (Static169.anInt3304 == 5) {
					Static207.method3344(true, Static211.aClass4_Sub3_Sub5_3);
				} else {
					Static306.method4753(Static156.aString187, false);
				}
				try {
					@Pc(268) Graphics local268 = Static188.aCanvas115.getGraphics();
					Static152.aClass59_1.method4275(local268);
				} catch (@Pc(276) Exception local276) {
				}
				Static211.method3443();
				if (arg1 == 0) {
					Static152.aClass59_1 = Static174.method2740(503, 765, Static188.aCanvas115);
				} else {
					Static152.aClass59_1 = null;
				}
				@Pc(299) Class185 local299 = Static276.aClass139_4.method3495(Static292.aClient1.getClass());
				while (local299.anInt5623 == 0) {
					Static303.method4677(100L);
				}
				if (local299.anInt5623 == 1) {
					Static67.aBoolean76 = true;
				}
			}
			if (Static67.aBoolean76) {
				Static94.method1623(Static188.aCanvas115, Static55.anInt1125 * 2);
			}
		}
		if (!Static94.aBoolean138 && arg4 > 0) {
			method2826(-1, arg1, true, -1, 0, true);
			return;
		}
		if (arg4 > 0 && arg1 == 0) {
			Static308.aThread3.setPriority(5);
			Static152.aClass59_1 = null;
			Static180.method2928();
			((Class24_Sub1) Static158.anInterface5_1).method463(200);
			if (Static56.aBoolean66) {
				Static158.method2552(0.7F);
			}
			if (Static218.aClass191ArrayArray1 == null) {
				Static218.aClass191ArrayArray1 = new Class191[13][13];
			}
			Static196.method3122();
			Static74.method1205();
			Static298.method4484();
		} else if (arg4 == 0 && arg1 > 0) {
			Static308.aThread3.setPriority(1);
			Static152.aClass59_1 = Static174.method2740(503, 765, Static188.aCanvas115);
			Static180.method2919();
			Static184.method2964();
			((Class24_Sub1) Static158.anInterface5_1).method463(20);
			if (Static56.aBoolean66) {
				if (Static10.anInt185 == 1) {
					Static158.method2552(0.9F);
				}
				if (Static10.anInt185 == 2) {
					Static158.method2552(0.8F);
				}
				if (Static10.anInt185 == 3) {
					Static158.method2552(0.7F);
				}
				if (Static10.anInt185 == 4) {
					Static158.method2552(0.6F);
				}
			}
			Static120.method1869();
			Static298.method4484();
		}
		Static239.aBoolean314 = !Static29.method456();
		Static184.method2979(Static31.anInt526, Static40.anInt690);
		if (arg5) {
			Static32.method516();
		}
		if (arg4 < 2) {
			Static140.aBoolean184 = false;
		} else {
			Static140.aBoolean184 = true;
		}
		if (Static107.anInt5399 != -1) {
			Static50.method777(true);
		}
		if (Static134.aClass52_7 != null && (Static169.anInt3304 == 30 || Static169.anInt3304 == 25)) {
			Static131.method2002();
		}
		for (@Pc(490) int local490 = 0; local490 < 100; local490++) {
			Static85.aBooleanArray8[local490] = true;
		}
		Static239.aBoolean315 = true;
	}
}
