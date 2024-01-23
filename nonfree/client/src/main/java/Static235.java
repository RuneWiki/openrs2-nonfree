import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	public static int anInt4581;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public static int anInt4579 = 0;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString155 = null;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
	public static int anInt4584 = 20;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZIIIBI)V")
	public static void method3669(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0) {
			Static178.method2762();
		}
		if (Static55.aFrame2 != null && (arg5 != 3 || arg4 != Static224.anInt4445 || arg2 != Static176.anInt808)) {
			Static168.method2659(Static87.aClass164_2, Static55.aFrame2);
			Static55.aFrame2 = null;
		}
		if (arg5 == 3 && Static55.aFrame2 == null) {
			Static55.aFrame2 = Static206.method3287(Static87.aClass164_2, 0, arg2, arg4);
			if (Static55.aFrame2 != null) {
				Static224.anInt4445 = arg4;
				Static176.anInt808 = arg2;
				Static102.method1649(Static87.aClass164_2);
			}
		}
		if (arg5 == 3 && Static55.aFrame2 == null) {
			method3669(true, true, -1, arg3, -1, Static116.anInt2573);
			return;
		}
		@Pc(83) Container local83;
		if (Static55.aFrame2 != null) {
			local83 = Static55.aFrame2;
		} else if (Static27.aFrame3 == null) {
			local83 = Static87.aClass164_2.anApplet1;
		} else {
			local83 = Static27.aFrame3;
		}
		Static179.anInt3545 = local83.getSize().width;
		Static210.anInt4102 = local83.getSize().height;
		@Pc(106) Insets local106;
		if (local83 == Static27.aFrame3) {
			local106 = Static27.aFrame3.getInsets();
			Static179.anInt3545 -= local106.left + local106.right;
			Static210.anInt4102 -= local106.top + local106.bottom;
		}
		if (arg5 >= 2) {
			Static122.anInt2660 = 0;
			Static35.anInt709 = 0;
			Static111.anInt2450 = Static179.anInt3545;
			Static216.anInt4287 = Static210.anInt4102;
		} else {
			Static216.anInt4287 = 503;
			Static111.anInt2450 = 765;
			Static35.anInt709 = (Static179.anInt3545 - 765) / 2;
			Static122.anInt2660 = 0;
		}
		if (arg1) {
			Static18.method323(aCanvas1);
			Static287.method1965(aCanvas1);
			if (Static223.aClass130_1 != null) {
				Static223.aClass130_1.method3213(aCanvas1);
			}
			Static114.aClient1.method656();
			Static161.method2516(aCanvas1);
			Static43.method4382(aCanvas1);
			if (Static223.aClass130_1 != null) {
				Static223.aClass130_1.method3217(aCanvas1);
			}
		} else {
			if (Static178.aBoolean216) {
				Static178.method2752(Static111.anInt2450, Static216.anInt4287);
			}
			aCanvas1.setSize(Static111.anInt2450, Static216.anInt4287);
			if (local83 == Static27.aFrame3) {
				local106 = Static27.aFrame3.getInsets();
				aCanvas1.setLocation(local106.left + Static35.anInt709, Static122.anInt2660 + local106.top);
			} else {
				aCanvas1.setLocation(Static35.anInt709, Static122.anInt2660);
			}
		}
		if (arg5 == 0 && arg3 > 0) {
			Static178.method2765(aCanvas1);
		}
		if (arg0 && arg5 > 0) {
			aCanvas1.setIgnoreRepaint(true);
			if (!Static10.aBoolean6) {
				Static118.method2032();
				Static26.aClass119_1 = null;
				Static26.aClass119_1 = Static267.method2843(aCanvas1, Static111.anInt2450, Static216.anInt4287);
				Static166.method2619();
				if (Static267.anInt3573 == 5) {
					Static155.method2475(Static289.aClass4_Sub2_Sub12_3, true);
				} else {
					Static265.method3986(Static86.aString50, false);
				}
				try {
					@Pc(257) Graphics local257 = aCanvas1.getGraphics();
					Static26.aClass119_1.method3931(local257);
				} catch (@Pc(265) Exception local265) {
				}
				Static59.method2488();
				if (arg3 == 0) {
					Static26.aClass119_1 = Static267.method2843(aCanvas1, 765, 503);
				} else {
					Static26.aClass119_1 = null;
				}
				@Pc(288) Class123 local288 = Static87.aClass164_2.method3946(Static114.aClient1.getClass());
				while (local288.anInt3791 == 0) {
					Static122.method2061(100L);
				}
				if (local288.anInt3791 == 1) {
					Static10.aBoolean6 = true;
				}
			}
			if (Static10.aBoolean6) {
				Static178.method2768(aCanvas1, Static218.anInt5374 * 2);
			}
		}
		if (!Static178.aBoolean216 && arg5 > 0) {
			method3669(true, true, -1, arg3, -1, 0);
			return;
		}
		if (arg5 > 0 && arg3 == 0) {
			Static279.aThread3.setPriority(5);
			Static26.aClass119_1 = null;
			Static37.method610();
			((Class71_Sub1) Static204.anInterface2_1).method1993(200);
			if (Static298.aBoolean357) {
				Static204.method3239(0.7F);
			}
			if (Static61.aClass64ArrayArray1 == null) {
				Static61.aClass64ArrayArray1 = new Class64[13][13];
			}
			Static12.method200();
			Static64.method980();
			Static106.method1733();
		} else if (arg5 == 0 && arg3 > 0) {
			Static279.aThread3.setPriority(1);
			Static26.aClass119_1 = Static267.method2843(aCanvas1, 765, 503);
			Static37.method606();
			Static109.method1757();
			((Class71_Sub1) Static204.anInterface2_1).method1993(20);
			if (Static298.aBoolean357) {
				if (Static165.anInt3301 == 1) {
					Static204.method3239(0.9F);
				}
				if (Static165.anInt3301 == 2) {
					Static204.method3239(0.8F);
				}
				if (Static165.anInt3301 == 3) {
					Static204.method3239(0.7F);
				}
				if (Static165.anInt3301 == 4) {
					Static204.method3239(0.6F);
				}
			}
			Static91.method1454();
			Static106.method1733();
		}
		Static11.aBoolean7 = !Static62.method957();
		if (arg0) {
			Static249.method3770();
		}
		if (arg5 < 2) {
			Static255.aBoolean312 = false;
		} else {
			Static255.aBoolean312 = true;
		}
		if (Static25.anInt448 != -1) {
			Static161.method2519(true);
		}
		if (Static259.aClass158_3 != null && (Static267.anInt3573 == 30 || Static267.anInt3573 == 25)) {
			Static183.method2858();
		}
		for (@Pc(480) int local480 = 0; local480 < 100; local480++) {
			Static222.aBooleanArray20[local480] = true;
		}
		Static196.aBoolean249 = true;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V")
	public static void method3670(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < Static231.aBooleanArray22.length) {
			Static231.aBooleanArray22[arg0] = !Static231.aBooleanArray22[arg0];
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
	public static void method3671() {
		aCanvas1 = null;
		aString155 = null;
	}
}
