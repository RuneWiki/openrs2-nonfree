import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!ih;")
	public static Class90 aClass90_3;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!wc;")
	public static Class11_Sub2_Sub6_Sub1 aClass11_Sub2_Sub6_Sub1_4;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
	public static final int[] anIntArray493 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method5771() {
		Static87.aClass141_1 = new Class141(8);
		Static129.anInt2808 = 0;
		for (@Pc(17) Class32_Sub2 local17 = (Class32_Sub2) Static185.aClass195_5.method5302(); local17 != null; local17 = (Class32_Sub2) Static185.aClass195_5.method5298()) {
			local17.method1398();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BIIZLclient!kg;)V")
	public static void method5773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class112 arg3) {
		@Pc(8) int local8 = arg3.anInt3381;
		if (arg3.aByte24 == 0) {
			arg3.anInt3381 = arg3.anInt3447;
		} else if (arg3.aByte24 == 1) {
			arg3.anInt3381 = arg1 - arg3.anInt3447;
		} else if (arg3.aByte24 == 2) {
			arg3.anInt3381 = arg1 * arg3.anInt3447 >> 14;
		}
		@Pc(50) int local50 = arg3.anInt3444;
		if (arg3.aByte22 == 0) {
			arg3.anInt3444 = arg3.anInt3390;
		} else if (arg3.aByte22 == 1) {
			arg3.anInt3444 = arg0 - arg3.anInt3390;
		} else if (arg3.aByte22 == 2) {
			arg3.anInt3444 = arg3.anInt3390 * arg0 >> 14;
		}
		if (arg3.aByte24 == 4) {
			arg3.anInt3381 = arg3.anInt3413 * arg3.anInt3444 / arg3.anInt3443;
		}
		if (arg3.aByte22 == 4) {
			arg3.anInt3444 = arg3.anInt3381 * arg3.anInt3443 / arg3.anInt3413;
		}
		if (Static339.aBoolean444 && (Static44.method1079(arg3).anInt6536 != 0 || arg3.anInt3373 == 0)) {
			if (arg3.anInt3444 < 5 && arg3.anInt3381 < 5) {
				arg3.anInt3381 = 5;
				arg3.anInt3444 = 5;
			} else {
				if (arg3.anInt3381 <= 0) {
					arg3.anInt3381 = 5;
				}
				if (arg3.anInt3444 <= 0) {
					arg3.anInt3444 = 5;
				}
			}
		}
		if (Static145.anInt3088 == arg3.anInt3446) {
			Static150.aClass112_18 = arg3;
		}
		if (arg2 && arg3.anObjectArray19 != null && (local8 != arg3.anInt3381 || arg3.anInt3444 != local50)) {
			@Pc(195) Class1_Sub35 local195 = new Class1_Sub35();
			local195.anObjectArray34 = arg3.anObjectArray19;
			local195.aClass112_16 = arg3;
			Static215.aClass42_37.method1549(local195);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!gt;BLclient!ic;)Lclient!fp;")
	public static Class63 method5775(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(5) Interface3 arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class63_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, ic.class, Integer.TYPE, Integer.TYPE, gt.class);
			return (Class63) local57.newInstance(arg0, arg4, Integer.valueOf(arg1), new Integer(arg2), arg3);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5777(@OriginalArg(1) String arg0) {
		Static220.aString43 = arg0;
		if (Static227.aClass75_5.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static227.aClass75_5.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static227.aClass75_5.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static317.method5483(Static183.method3462() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static381.method4929("document.cookie=\"" + local34 + "\"", Static227.aClass75_5.anApplet1);
		} catch (@Pc(86) Throwable local86) {
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5782(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static157.method2978(Static125.method2624(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
