import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString212;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public static int anInt5731;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!dj;")
	public static Class43 aClass43_3 = new Class43();

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	public static boolean aBoolean375 = false;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!bn;")
	public static Class25 aClass25_32 = new Class25(64);

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ah;Lclient!ap;ILjava/awt/Canvas;II)Lclient!e;")
	public static synchronized Class46 method5095(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static64.aBooleanArray2[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(43) Class46 local43;
		if (arg4 == 0) {
			local43 = Static272.method4616(local7, arg0, arg2);
		} else if (arg4 == 1) {
			local43 = Static227.method4025(arg0, arg1, arg3, arg2, local7);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static64.aBooleanArray2[local7] = true;
		return local43;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
	public static void method5115() {
		Static297.method5075(false);
		if (Static263.anInt5036 >= 0 && Static263.anInt5036 != 0) {
			Static253.method1025(Static263.anInt5036);
			Static263.anInt5036 = -1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!ap;ZLjava/lang/String;Z)V")
	public static void method5164(@OriginalArg(1) Class15 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static136.method2751(arg2, 3, arg0);
			return;
		}
		@Pc(24) String local24;
		if (Static12.aString10.startsWith("win") && Static12.anInt244 != 3) {
			local24 = null;
			if (arg0.anApplet1 != null) {
				local24 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class205 local44 = Static136.method2751(arg2, 0, arg0);
				Static133.aClass15_7 = arg0;
				Static209.aString150 = arg2;
				Static43.aClass205_3 = local44;
				return;
			}
		}
		if (Static12.aString10.startsWith("mac")) {
			local24 = null;
			if (arg0.anApplet1 != null) {
				local24 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg1) {
				Static136.method2751(arg2, 1, arg0);
				return;
			}
		}
		Static136.method2751(arg2, 2, arg0);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V")
	public static void method5169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static190.aClass11_85 = new Class11(arg1);
		Static167.aClass11_125 = new Class11(arg0);
	}

	@OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
	public static void method5181() {
		if (Static267.aFrame1 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static277.aFrame2 == null) {
			local13 = Static105.aClass15_2.anApplet1;
		} else {
			local13 = Static277.aFrame2;
		}
		Static2.anInt104 = local13.getSize().width;
		Static218.anInt4396 = local13.getSize().height;
		@Pc(31) Insets local31;
		if (Static277.aFrame2 == local13) {
			local31 = Static277.aFrame2.getInsets();
			Static218.anInt4396 -= local31.top + local31.bottom;
			Static2.anInt104 -= local31.left + local31.right;
		}
		if (Static237.method4149() == 1) {
			Static249.anInt4822 = 0;
			Static46.anInt1173 = 503;
			Static205.anInt4113 = (Static2.anInt104 - 765) / 2;
			Static294.anInt5659 = 765;
		} else if (Static127.anInt2786 < 96 && Static67.anInt1615 == 0) {
			@Pc(71) int local71 = Static2.anInt104 > 1024 ? 1024 : Static2.anInt104;
			Static205.anInt4113 = (Static2.anInt104 - local71) / 2;
			Static294.anInt5659 = local71;
			@Pc(89) int local89 = Static218.anInt4396 <= 768 ? Static218.anInt4396 : 768;
			Static249.anInt4822 = 0;
			Static46.anInt1173 = local89;
		} else {
			Static249.anInt4822 = 0;
			Static46.anInt1173 = Static218.anInt4396;
			Static205.anInt4113 = 0;
			Static294.anInt5659 = Static2.anInt104;
		}
		if (Static322.anInt6208 != 0) {
			@Pc(135) boolean local135;
			if (Static294.anInt5659 < 1024 && Static46.anInt1173 < 768) {
				local135 = true;
			} else {
				local135 = false;
			}
		}
		Static95.aCanvas2.setSize(Static294.anInt5659, Static46.anInt1173);
		if (Static218.aClass46_5 != null) {
			Static218.aClass46_5.method5117();
		}
		if (Static277.aFrame2 == local13) {
			local31 = Static277.aFrame2.getInsets();
			Static95.aCanvas2.setLocation(Static205.anInt4113 + local31.left, Static249.anInt4822 + local31.top);
		} else {
			Static95.aCanvas2.setLocation(Static205.anInt4113, Static249.anInt4822);
		}
		if (Static324.anInt6226 != -1) {
			Static161.method3223(true);
		}
		Static102.method2261();
	}
}
