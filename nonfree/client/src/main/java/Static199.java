import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	public static int anInt6294;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public static volatile int anInt6293 = -1;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
	public static boolean aBoolean418 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZIIZII)V")
	public static void method4758(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0) {
			Static294.method4523();
		}
		if (Static229.aFrame1 != null && (arg1 != 3 || arg2 != Static153.anInt3412 || arg5 != Static139.anInt3176)) {
			Static173.method2821(Static229.aFrame1, Static142.aClass112_2);
			Static229.aFrame1 = null;
		}
		if (arg1 == 3 && Static229.aFrame1 == null) {
			Static229.aFrame1 = Static84.method1461(arg5, arg2, Static142.aClass112_2, 0);
			if (Static229.aFrame1 != null) {
				Static139.anInt3176 = arg5;
				Static153.anInt3412 = arg2;
				Static24.method510(Static142.aClass112_2);
			}
		}
		if (arg1 == 3 && Static229.aFrame1 == null) {
			method4758(true, Static309.anInt6184, -1, true, arg4, -1);
			return;
		}
		@Pc(80) Container local80;
		if (Static229.aFrame1 != null) {
			local80 = Static229.aFrame1;
		} else if (Static280.aFrame2 == null) {
			local80 = Static142.aClass112_2.anApplet1;
		} else {
			local80 = Static280.aFrame2;
		}
		Static163.anInt3557 = local80.getSize().width;
		Static7.anInt207 = local80.getSize().height;
		@Pc(102) Insets local102;
		if (Static280.aFrame2 == local80) {
			local102 = Static280.aFrame2.getInsets();
			Static163.anInt3557 -= local102.right + local102.left;
			Static7.anInt207 -= local102.top + local102.bottom;
		}
		if (arg1 < 2) {
			Static38.anInt950 = 765;
			Static270.anInt5412 = 503;
			Static69.anInt1438 = (Static163.anInt3557 - 765) / 2;
			Static146.anInt4438 = 0;
		} else {
			Static69.anInt1438 = 0;
			Static270.anInt5412 = Static7.anInt207;
			Static146.anInt4438 = 0;
			Static38.anInt950 = Static163.anInt3557;
		}
		if (arg3) {
			Static234.method3710(Static108.aCanvas1);
			Static301.method3615(Static108.aCanvas1);
			if (Static223.aClass69_1 != null) {
				Static223.aClass69_1.method1699(Static108.aCanvas1);
			}
			Static241.aClient1.method723();
			Static60.method1081(Static108.aCanvas1);
			Static169.method2750(Static108.aCanvas1);
			if (Static223.aClass69_1 != null) {
				Static223.aClass69_1.method1697(Static108.aCanvas1);
			}
		} else {
			if (Static294.aBoolean367) {
				Static294.method4504(Static38.anInt950, Static270.anInt5412);
			}
			Static108.aCanvas1.setSize(Static38.anInt950, Static270.anInt5412);
			if (Static280.aFrame2 == local80) {
				local102 = Static280.aFrame2.getInsets();
				Static108.aCanvas1.setLocation(local102.left + Static69.anInt1438, Static146.anInt4438 + local102.top);
			} else {
				Static108.aCanvas1.setLocation(Static69.anInt1438, Static146.anInt4438);
			}
		}
		if (arg1 == 0 && arg4 > 0) {
			Static294.method4519(Static108.aCanvas1);
		}
		if (arg0 && arg1 > 0) {
			Static108.aCanvas1.setIgnoreRepaint(true);
			if (!Static238.aBoolean312) {
				Static290.method4444();
				Static293.aClass3_1 = null;
				Static293.aClass3_1 = Static87.method1509(Static38.anInt950, Static270.anInt5412, Static108.aCanvas1);
				Static231.method3627();
				if (Static96.anInt2212 == 5) {
					Static129.method2071(Static176.aClass1_Sub3_Sub5_2, true);
				} else {
					Static182.method2957(Static115.aString149, false);
				}
				try {
					@Pc(269) Graphics local269 = Static108.aCanvas1.getGraphics();
					Static293.aClass3_1.method2410(local269);
				} catch (@Pc(277) Exception local277) {
				}
				Static297.method4538();
				if (arg4 == 0) {
					Static293.aClass3_1 = Static87.method1509(765, 503, Static108.aCanvas1);
				} else {
					Static293.aClass3_1 = null;
				}
				@Pc(300) Class47 local300 = Static142.aClass112_2.method2897(Static241.aClient1.getClass());
				while (local300.anInt1417 == 0) {
					Static312.method4734(100L);
				}
				if (local300.anInt1417 == 1) {
					Static238.aBoolean312 = true;
				}
			}
			if (Static238.aBoolean312) {
				Static294.method4505(Static108.aCanvas1, Static309.anInt6196 * 2);
			}
		}
		if (!Static294.aBoolean367 && arg1 > 0) {
			method4758(true, 0, -1, true, arg4, -1);
			return;
		}
		if (arg1 > 0 && arg4 == 0) {
			Static147.aThread2.setPriority(5);
			Static293.aClass3_1 = null;
			Static26.method577();
			((Class63_Sub1) Static237.anInterface1_1).method4608(200);
			if (Static65.aBoolean96) {
				Static237.method3738(0.7F);
			}
			if (Static87.aClass61ArrayArray1 == null) {
				Static87.aClass61ArrayArray1 = new Class61[13][13];
			}
			Static191.method3096();
			Static177.method2851();
			Static186.method3010();
		} else if (arg1 == 0 && arg4 > 0) {
			Static147.aThread2.setPriority(1);
			Static293.aClass3_1 = Static87.method1509(765, 503, Static108.aCanvas1);
			Static26.method588();
			Static42.method853();
			((Class63_Sub1) Static237.anInterface1_1).method4608(20);
			if (Static65.aBoolean96) {
				if (Static166.anInt3743 == 1) {
					Static237.method3738(0.9F);
				}
				if (Static166.anInt3743 == 2) {
					Static237.method3738(0.8F);
				}
				if (Static166.anInt3743 == 3) {
					Static237.method3738(0.7F);
				}
				if (Static166.anInt3743 == 4) {
					Static237.method3738(0.6F);
				}
			}
			Static276.method4170();
			Static186.method3010();
		}
		Static275.aBoolean345 = !Static241.method3782();
		Static42.method865(Static38.anInt950, Static270.anInt5412);
		if (arg0) {
			Static241.method3787();
		}
		if (arg1 >= 2) {
			Static147.aBoolean214 = true;
		} else {
			Static147.aBoolean214 = false;
		}
		if (Static36.anInt902 != -1) {
			Static210.method3373(true);
		}
		if (Static5.aClass104_5 != null && (Static96.anInt2212 == 30 || Static96.anInt2212 == 25)) {
			Static304.method4620();
		}
		for (@Pc(488) int local488 = 0; local488 < 100; local488++) {
			Static29.aBooleanArray6[local488] = true;
		}
		Static283.aBoolean358 = true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4759(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!th;)V")
	public static void method4760(@OriginalArg(1) Class168 arg0) {
		Static111.aClass168_83 = arg0;
	}
}
