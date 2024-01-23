import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "S")
	public static short aShort1 = 256;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString4 = "Loading textures - ";

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public static void method15() {
		Static299.aClass187_149.method4534(5);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZZI)V")
	public static void method16(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static156.method2697();
		}
		if (Static275.aFrame2 != null && (arg0 != 3 || arg2 != Static48.anInt956 || Static218.anInt1144 != arg5)) {
			Static75.method1470(Static26.aClass154_1, Static275.aFrame2);
			Static275.aFrame2 = null;
		}
		if (arg0 == 3 && Static275.aFrame2 == null) {
			Static275.aFrame2 = Static268.method4199(Static26.aClass154_1, 0, arg5, arg2);
			if (Static275.aFrame2 != null) {
				Static48.anInt956 = arg2;
				Static218.anInt1144 = arg5;
				Static286.method4396(Static26.aClass154_1);
			}
		}
		if (arg0 == 3 && Static275.aFrame2 == null) {
			method16(Static41.anInt852, arg1, -1, true, true, -1);
			return;
		}
		@Pc(81) Container local81;
		if (Static275.aFrame2 != null) {
			local81 = Static275.aFrame2;
		} else if (Static197.aFrame1 == null) {
			local81 = Static26.aClass154_1.anApplet1;
		} else {
			local81 = Static197.aFrame1;
		}
		Static171.anInt3365 = local81.getSize().width;
		Static132.anInt3685 = local81.getSize().height;
		@Pc(107) Insets local107;
		if (Static197.aFrame1 == local81) {
			local107 = Static197.aFrame1.getInsets();
			Static171.anInt3365 -= local107.left + local107.right;
			Static132.anInt3685 -= local107.bottom + local107.top;
		}
		if (arg0 < 2) {
			Static120.anInt2505 = 503;
			Static292.anInt5236 = 765;
			Static103.anInt2068 = (Static171.anInt3365 - 765) / 2;
			Static209.anInt3975 = 0;
		} else {
			Static292.anInt5236 = Static171.anInt3365;
			Static120.anInt2505 = Static132.anInt3685;
			Static103.anInt2068 = 0;
			Static209.anInt3975 = 0;
		}
		if (arg4) {
			Static56.method987(Static127.aCanvas1);
			Static49.method907(Static127.aCanvas1);
			if (Static123.aClass56_1 != null) {
				Static123.aClass56_1.method1644(Static127.aCanvas1);
			}
			Static196.aClient1.method669();
			Static287.method4401(Static127.aCanvas1);
			Static243.method4752(Static127.aCanvas1);
			if (Static123.aClass56_1 != null) {
				Static123.aClass56_1.method1642(Static127.aCanvas1);
			}
		} else {
			if (Static156.aBoolean211) {
				Static156.method2663(Static292.anInt5236, Static120.anInt2505);
			}
			Static127.aCanvas1.setSize(Static292.anInt5236, Static120.anInt2505);
			if (Static197.aFrame1 == local81) {
				local107 = Static197.aFrame1.getInsets();
				Static127.aCanvas1.setLocation(Static103.anInt2068 + local107.left, local107.top - -Static209.anInt3975);
			} else {
				Static127.aCanvas1.setLocation(Static103.anInt2068, Static209.anInt3975);
			}
		}
		if (arg0 == 0 && arg1 > 0) {
			Static156.method2688(Static127.aCanvas1);
		}
		if (arg3 && arg0 > 0) {
			Static127.aCanvas1.setIgnoreRepaint(true);
			if (!Static125.aBoolean164) {
				Static286.method4394();
				Static94.aClass58_3 = null;
				Static94.aClass58_3 = Static42.method795(Static127.aCanvas1, Static120.anInt2505, Static292.anInt5236);
				Static25.method400();
				if (Static37.anInt773 == 5) {
					Static191.method3102(true, Static307.aClass1_Sub2_Sub6_4);
				} else {
					Static1.method14(false, Static180.aString200);
				}
				try {
					@Pc(258) Graphics local258 = Static127.aCanvas1.getGraphics();
					Static94.aClass58_3.method2967(local258);
				} catch (@Pc(266) Exception local266) {
				}
				Static13.method176();
				if (arg1 == 0) {
					Static94.aClass58_3 = Static42.method795(Static127.aCanvas1, 503, 765);
				} else {
					Static94.aClass58_3 = null;
				}
				@Pc(287) Class185 local287 = Static26.aClass154_1.method3879(Static196.aClient1.getClass());
				while (local287.anInt5276 == 0) {
					Static282.method4345(100L);
				}
				if (local287.anInt5276 == 1) {
					Static125.aBoolean164 = true;
				}
			}
			if (Static125.aBoolean164) {
				Static156.method2667(Static127.aCanvas1, Static111.anInt2296 * 2);
			}
		}
		if (!Static156.aBoolean211 && arg0 > 0) {
			method16(0, arg1, -1, true, true, -1);
			return;
		}
		if (arg0 > 0 && arg1 == 0) {
			Static126.aThread3.setPriority(5);
			Static94.aClass58_3 = null;
			Static58.method1052();
			((Class30_Sub1) Static215.anInterface5_1).method799(200);
			if (Static311.aBoolean384) {
				Static215.method3362(0.7F);
			}
			if (Static85.aClass126ArrayArray1 == null) {
				Static85.aClass126ArrayArray1 = new Class126[13][13];
			}
			Static101.method1830();
			Static150.method2544();
			Static133.method2316();
		} else if (arg0 == 0 && arg1 > 0) {
			Static126.aThread3.setPriority(1);
			Static94.aClass58_3 = Static42.method795(Static127.aCanvas1, 503, 765);
			Static58.method1056();
			Static158.method2726();
			((Class30_Sub1) Static215.anInterface5_1).method799(20);
			if (Static311.aBoolean384) {
				if (Static184.anInt3503 == 1) {
					Static215.method3362(0.9F);
				}
				if (Static184.anInt3503 == 2) {
					Static215.method3362(0.8F);
				}
				if (Static184.anInt3503 == 3) {
					Static215.method3362(0.7F);
				}
				if (Static184.anInt3503 == 4) {
					Static215.method3362(0.6F);
				}
			}
			Static305.method4605();
			Static133.method2316();
		}
		Static303.aBoolean363 = !Static278.method4290();
		Static158.method2717(Static292.anInt5236, Static120.anInt2505);
		if (arg3) {
			Static113.method2018();
		}
		if (arg0 >= 2) {
			Static46.aBoolean53 = true;
		} else {
			Static46.aBoolean53 = false;
		}
		if (Static270.anInt4897 != -1) {
			Static113.method2024(true);
		}
		if (Static5.aClass97_1 != null && (Static37.anInt773 == 30 || Static37.anInt773 == 25)) {
			Static201.method3230();
		}
		for (@Pc(470) int local470 = 0; local470 < 100; local470++) {
			Static304.aBooleanArray23[local470] = true;
		}
		Static52.aBoolean380 = true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!nk;BI)[Lclient!fe;")
	public static Class23_Sub1[] method18(@OriginalArg(1) Class121 arg0, @OriginalArg(3) int arg1) {
		return Static313.method2575(arg1, 0, arg0) ? Static251.method3967() : null;
	}
}
