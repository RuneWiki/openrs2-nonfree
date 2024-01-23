import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!ak;")
	public static Class7 aClass7_97;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt1996;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt1993 = 0;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int anInt1994 = 0;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public static int anInt1999 = 0;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "[I")
	public static int[] anIntArray265 = new int[2];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZZII)V")
	public static void method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static240.method3803();
		}
		if (Static136.aFrame1 != null && (arg5 != 3 || arg0 != Static224.anInt4699 || Static44.anInt997 != arg1)) {
			Static106.method1682(Static13.aClass84_3, Static136.aFrame1);
			Static136.aFrame1 = null;
		}
		if (arg5 == 3 && Static136.aFrame1 == null) {
			Static136.aFrame1 = Static173.method2618(arg0, 0, Static13.aClass84_3, arg1);
			if (Static136.aFrame1 != null) {
				Static44.anInt997 = arg1;
				Static224.anInt4699 = arg0;
				Static147.method2287(Static13.aClass84_3);
			}
		}
		if (arg5 == 3 && Static136.aFrame1 == null) {
			method1684(-1, -1, true, true, arg4, Static8.anInt239);
			return;
		}
		@Pc(88) Container local88;
		if (Static136.aFrame1 != null) {
			local88 = Static136.aFrame1;
		} else if (Static299.aFrame2 == null) {
			local88 = Static13.aClass84_3.anApplet1;
		} else {
			local88 = Static299.aFrame2;
		}
		Static139.anInt2621 = local88.getSize().width;
		Static269.anInt5394 = local88.getSize().height;
		@Pc(110) Insets local110;
		if (local88 == Static299.aFrame2) {
			local110 = Static299.aFrame2.getInsets();
			Static269.anInt5394 -= local110.bottom + local110.top;
			Static139.anInt2621 -= local110.right + local110.left;
		}
		if (arg5 >= 2) {
			Static47.anInt5869 = 0;
			Static145.anInt2690 = Static139.anInt2621;
			Static125.anInt2380 = 0;
			Static166.anInt3046 = Static269.anInt5394;
		} else {
			Static145.anInt2690 = 765;
			Static47.anInt5869 = (Static139.anInt2621 - 765) / 2;
			Static125.anInt2380 = 0;
			Static166.anInt3046 = 503;
		}
		if (arg2) {
			Static134.method2140(Static189.aCanvas1);
			Static41.method751(Static189.aCanvas1);
			if (Static14.aClass90_1 != null) {
				Static14.aClass90_1.method3356(Static189.aCanvas1);
			}
			Static95.aClient1.method783();
			Static274.method4192(Static189.aCanvas1);
			Static230.method3691(Static189.aCanvas1);
			if (Static14.aClass90_1 != null) {
				Static14.aClass90_1.method3358(Static189.aCanvas1);
			}
		} else {
			if (Static240.aBoolean369) {
				Static240.method3793(Static145.anInt2690, Static166.anInt3046);
			}
			Static189.aCanvas1.setSize(Static145.anInt2690, Static166.anInt3046);
			if (local88 == Static299.aFrame2) {
				local110 = Static299.aFrame2.getInsets();
				Static189.aCanvas1.setLocation(local110.left + Static47.anInt5869, Static125.anInt2380 + local110.top);
			} else {
				Static189.aCanvas1.setLocation(Static47.anInt5869, Static125.anInt2380);
			}
		}
		if (arg5 == 0 && arg4 > 0) {
			Static240.method3795(Static189.aCanvas1);
		}
		if (arg3 && arg5 > 0) {
			Static189.aCanvas1.setIgnoreRepaint(true);
			if (!Static267.aBoolean411) {
				Static196.method2977();
				Static282.aClass23_33 = null;
				Static282.aClass23_33 = Static259.method4017(Static189.aCanvas1, Static166.anInt3046, Static145.anInt2690);
				Static213.method3379();
				if (Static98.anInt1878 == 5) {
					Static290.method4465(true, Static10.aClass1_Sub2_Sub12_1);
				} else {
					Static195.method2964(false, Static4.aString6);
				}
				try {
					@Pc(267) Graphics local267 = Static189.aCanvas1.getGraphics();
					Static282.aClass23_33.method1016(local267);
				} catch (@Pc(277) Exception local277) {
				}
				Static109.method1723();
				if (arg4 == 0) {
					Static282.aClass23_33 = Static259.method4017(Static189.aCanvas1, 503, 765);
				} else {
					Static282.aClass23_33 = null;
				}
				@Pc(299) Class118 local299 = Static13.aClass84_3.method1968(Static95.aClient1.getClass());
				while (local299.anInt3187 == 0) {
					Static275.method4233(100L);
				}
				if (local299.anInt3187 == 1) {
					Static267.aBoolean411 = true;
				}
			}
			if (Static267.aBoolean411) {
				Static240.method3770(Static189.aCanvas1, Static29.anInt623 * 2);
			}
		}
		if (!Static240.aBoolean369 && arg5 > 0) {
			method1684(-1, -1, true, true, arg4, 0);
			return;
		}
		if (arg5 > 0 && arg4 == 0) {
			Static257.aThread2.setPriority(5);
			Static282.aClass23_33 = null;
			Static31.method599();
			((Class40_Sub1) Static208.anInterface4_1).method997(200);
			if (Static294.aBoolean445) {
				Static208.method3234(0.7F);
			}
			if (Static147.aClass119ArrayArray1 == null) {
				Static147.aClass119ArrayArray1 = new Class119[13][13];
			}
			Static194.method2939();
			Static78.method1344();
			Static188.method2834();
		} else if (arg5 == 0 && arg4 > 0) {
			Static257.aThread2.setPriority(1);
			Static282.aClass23_33 = Static259.method4017(Static189.aCanvas1, 503, 765);
			Static31.method592();
			Static200.method3049();
			((Class40_Sub1) Static208.anInterface4_1).method997(20);
			if (Static294.aBoolean445) {
				if (Static176.anInt3254 == 1) {
					Static208.method3234(0.9F);
				}
				if (Static176.anInt3254 == 2) {
					Static208.method3234(0.8F);
				}
				if (Static176.anInt3254 == 3) {
					Static208.method3234(0.7F);
				}
				if (Static176.anInt3254 == 4) {
					Static208.method3234(0.6F);
				}
			}
			Static225.method3599();
			Static188.method2834();
		}
		Static131.aBoolean175 = !Static39.method718();
		if (arg3) {
			Static89.method1467();
		}
		if (arg5 < 2) {
			Static294.aBoolean444 = false;
		} else {
			Static294.aBoolean444 = true;
		}
		if (Static121.anInt2350 != -1) {
			Static156.method1490(true);
		}
		if (Static155.aClass73_3 != null && (Static98.anInt1878 == 30 || Static98.anInt1878 == 25)) {
			Static104.method2545();
		}
		for (@Pc(488) int local488 = 0; local488 < 100; local488++) {
			Static267.aBooleanArray25[local488] = true;
		}
		Static278.aBoolean425 = true;
	}
}
