import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Lclient!cs;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_17 = new Class211(64, 8);

	@OriginalMember(owner = "client!na", name = "F", descriptor = "[I")
	public static final int[] anIntArray121 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!na", name = "H", descriptor = "I")
	public static int anInt804 = 0;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lclient!so;")
	public static Class124_Sub1 method617() {
		return Static32.anInt650 < Static52.aClass124_Sub1Array1.length ? Static52.aClass124_Sub1Array1[Static32.anInt650++] : null;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
	public static void method618() {
		Static236.anInt3955 = Static75.aClass110_1.anInt2963 + Static75.aClass110_1.anInt2957 + 2;
		Static6.anInt74 = Static102.aClass110_3.anInt2963 + Static102.aClass110_3.anInt2957 + 2;
		Static231.aStringArray79 = new String[500];
		for (@Pc(32) int local32 = 0; local32 < Static231.aStringArray79.length; local32++) {
			Static231.aStringArray79[local32] = "";
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
	public static void method619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static75.anInt1459; local7++) {
			@Pc(13) Rectangle local13 = Class198.aRectangleArray1[local7];
			if (local13.x + local13.width > arg0 && local13.x < arg0 + arg2 && arg3 < local13.y + local13.height && arg1 + arg3 > local13.y) {
				Static277.aBooleanArray26[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	public static void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class117 local8 = Static84.method1246(arg5, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(18) Class1_Sub39 local18 = new Class1_Sub39();
			local18.anObjectArray34 = local8.anObjectArray15;
			local18.aClass117_16 = local8;
			Static387.method5496(local18);
		}
		Static176.anInt3186 = arg2;
		Static283.anInt4904 = arg4;
		Static137.anInt2555 = arg1;
		Static236.anInt3954 = arg0;
		Static215.anInt3687 = arg3;
		Static90.aBoolean144 = true;
		Static267.anInt4674 = local8.anInt3080;
		Static119.anInt2128 = arg5;
		Static312.method4635(local8);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method621() {
		for (@Pc(15) Class1_Sub14 local15 = (Class1_Sub14) Static271.aClass17_53.method202(); local15 != null; local15 = (Class1_Sub14) Static271.aClass17_53.method207()) {
			if (local15.anInt1829 == -1) {
				local15.anInt1832 = 0;
				Static161.method2395(local15);
			} else {
				local15.method5577();
			}
		}
	}
}
