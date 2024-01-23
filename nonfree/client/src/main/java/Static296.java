import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!cg;")
	public static Class22 aClass22_105;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
	public static int[] anIntArray462 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!ul;")
	public static Class172 aClass172_49 = new Class172(64);

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString191 = "flash1:";

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBZIIIZ)V")
	public static void method4590(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			Static251.method3875();
		}
		if (Static250.aFrame2 != null && (arg0 != 3 || Static121.anInt2458 != arg3 || Static104.anInt2103 != arg2)) {
			Static157.method261(Static95.aClass184_3, Static250.aFrame2);
			Static250.aFrame2 = null;
		}
		if (arg0 == 3 && Static250.aFrame2 == null) {
			Static250.aFrame2 = Static247.method3795(0, Static95.aClass184_3, arg3, arg2);
			if (Static250.aFrame2 != null) {
				Static104.anInt2103 = arg2;
				Static121.anInt2458 = arg3;
				Static204.method3268(Static95.aClass184_3);
			}
		}
		if (arg0 == 3 && Static250.aFrame2 == null) {
			method4590(Static228.anInt4580, true, -1, -1, arg4, true);
			return;
		}
		@Pc(82) Container local82;
		if (Static250.aFrame2 != null) {
			local82 = Static250.aFrame2;
		} else if (Static32.aFrame1 == null) {
			local82 = Static95.aClass184_3.anApplet1;
		} else {
			local82 = Static32.aFrame1;
		}
		Static162.anInt3312 = local82.getSize().width;
		Static242.anInt4775 = local82.getSize().height;
		@Pc(105) Insets local105;
		if (Static32.aFrame1 == local82) {
			local105 = Static32.aFrame1.getInsets();
			Static242.anInt4775 -= local105.bottom + local105.top;
			Static162.anInt3312 -= local105.left + local105.right;
		}
		if (arg0 < 2) {
			Static303.anInt5768 = 0;
			Static189.anInt5672 = 765;
			Static268.anInt5346 = (Static162.anInt3312 - 765) / 2;
			Static292.anInt5674 = 503;
		} else {
			Static268.anInt5346 = 0;
			Static292.anInt5674 = Static242.anInt4775;
			Static303.anInt5768 = 0;
			Static189.anInt5672 = Static162.anInt3312;
		}
		if (arg1) {
			Static295.method4587(Static139.aCanvas1);
			Static93.method2553(Static139.aCanvas1);
			if (Static42.aClass47_1 != null) {
				Static42.aClass47_1.method1208(Static139.aCanvas1);
			}
			Static191.aClient1.method774();
			Static7.method116(Static139.aCanvas1);
			Static29.method608(Static139.aCanvas1);
			if (Static42.aClass47_1 != null) {
				Static42.aClass47_1.method1212(Static139.aCanvas1);
			}
		} else {
			if (Static251.aBoolean330) {
				Static251.method3857(Static189.anInt5672, Static292.anInt5674);
			}
			Static139.aCanvas1.setSize(Static189.anInt5672, Static292.anInt5674);
			if (local82 == Static32.aFrame1) {
				local105 = Static32.aFrame1.getInsets();
				Static139.aCanvas1.setLocation(local105.left + Static268.anInt5346, Static303.anInt5768 + local105.top);
			} else {
				Static139.aCanvas1.setLocation(Static268.anInt5346, Static303.anInt5768);
			}
		}
		if (arg0 == 0 && arg4 > 0) {
			Static251.method3860(Static139.aCanvas1);
		}
		if (arg5 && arg0 > 0) {
			Static139.aCanvas1.setIgnoreRepaint(true);
			if (!Static274.aBoolean365) {
				Static242.method3716();
				Static147.aClass42_1 = null;
				Static147.aClass42_1 = Static186.method2979(Static189.anInt5672, Static292.anInt5674, Static139.aCanvas1);
				Static258.method4024();
				if (Static204.anInt4047 == 5) {
					Static182.method2938(true, Static86.aClass4_Sub2_Sub9_3);
				} else {
					Static250.method3846(Static174.aString124, false);
				}
				try {
					@Pc(262) Graphics local262 = Static139.aCanvas1.getGraphics();
					Static147.aClass42_1.method3931(local262);
				} catch (@Pc(270) Exception local270) {
				}
				Static20.method2333();
				if (arg4 == 0) {
					Static147.aClass42_1 = Static186.method2979(765, 503, Static139.aCanvas1);
				} else {
					Static147.aClass42_1 = null;
				}
				@Pc(290) Class119 local290 = Static95.aClass184_3.method4601(Static191.aClient1.getClass());
				while (local290.anInt3695 == 0) {
					Static193.method3169(100L);
				}
				if (local290.anInt3695 == 1) {
					Static274.aBoolean365 = true;
				}
			}
			if (Static274.aBoolean365) {
				Static251.method3881(Static139.aCanvas1, Static174.anInt3538 * 2);
			}
		}
		if (!Static251.aBoolean330 && arg0 > 0) {
			method4590(0, true, -1, -1, arg4, true);
			return;
		}
		if (arg0 > 0 && arg4 == 0) {
			Static169.aThread2.setPriority(5);
			Static147.aClass42_1 = null;
			Static18.method413();
			((Class95_Sub1) Static283.anInterface1_1).method2439(200);
			if (Static253.aBoolean335) {
				Static283.method4413(0.7F);
			}
			if (Static41.aClass54ArrayArray1 == null) {
				Static41.aClass54ArrayArray1 = new Class54[13][13];
			}
			Static142.method2276();
			Static249.method3814();
			Static201.method3247();
		} else if (arg0 == 0 && arg4 > 0) {
			Static169.aThread2.setPriority(1);
			Static147.aClass42_1 = Static186.method2979(765, 503, Static139.aCanvas1);
			Static18.method412();
			Static117.method1982();
			((Class95_Sub1) Static283.anInterface1_1).method2439(20);
			if (Static253.aBoolean335) {
				if (Static248.anInt4872 == 1) {
					Static283.method4413(0.9F);
				}
				if (Static248.anInt4872 == 2) {
					Static283.method4413(0.8F);
				}
				if (Static248.anInt4872 == 3) {
					Static283.method4413(0.7F);
				}
				if (Static248.anInt4872 == 4) {
					Static283.method4413(0.6F);
				}
			}
			Static26.method569();
			Static201.method3247();
		}
		Static78.aBoolean93 = !Static162.method2605();
		Static117.method1993(Static189.anInt5672, Static292.anInt5674);
		if (arg5) {
			Static201.method3248();
		}
		if (arg0 >= 2) {
			Static107.aBoolean124 = true;
		} else {
			Static107.aBoolean124 = false;
		}
		if (Static56.anInt1264 != -1) {
			Static143.method2292(true);
		}
		if (Static261.aClass91_3 != null && (Static204.anInt4047 == 30 || Static204.anInt4047 == 25)) {
			Static195.method3184();
		}
		for (@Pc(473) int local473 = 0; local473 < 100; local473++) {
			Static48.aBooleanArray14[local473] = true;
		}
		Static159.aBoolean210 = true;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Lclient!ie;")
	public static Class73 method4591(@OriginalArg(1) int arg0) {
		@Pc(10) Class73 local10 = (Class73) Static53.aClass172_11.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static107.aClass22_36.method665(Static148.method2341(arg0), Static307.method4704(arg0));
		local10 = new Class73();
		local10.anInt2237 = arg0;
		if (local25 != null) {
			local10.method1892(new Class4_Sub24(local25));
		}
		local10.method1900();
		if (local10.aBoolean132) {
			local10.aBoolean128 = false;
			local10.anInt2270 = 0;
		}
		if (!Static20.aBoolean185 && local10.aBoolean141) {
			local10.aStringArray14 = null;
		}
		Static53.aClass172_11.method4345(local10, (long) arg0);
		return local10;
	}
}
