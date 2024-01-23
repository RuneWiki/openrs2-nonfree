import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	public static int anInt4947;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "J")
	public static volatile long aLong191 = 0L;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V")
	public static void method4130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static306.method4566(arg4, Static231.anInt4333, Static218.anInt4086);
		@Pc(22) int local22 = Static306.method4566(arg3, Static231.anInt4333, Static218.anInt4086);
		@Pc(28) int local28 = Static306.method4566(arg1, Static188.anInt3598, Static289.anInt5245);
		@Pc(34) int local34 = Static306.method4566(arg2, Static188.anInt3598, Static289.anInt5245);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static103.method1978(arg0, local34, local28, Static40.anIntArrayArray6[local36]);
		}
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	public static void method4131() {
		if (Static184.aClass13_1 != null) {
			@Pc(6) Class13 local6 = Static184.aClass13_1;
			synchronized (Static184.aClass13_1) {
				Static184.aClass13_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	public static void method4132() {
		Static45.aClass96_3 = new Class96();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4133(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(11) String local11 = Static132.method2308(Static232.method3731(arg0));
		@Pc(13) boolean local13 = false;
		for (@Pc(23) int local23 = 0; local23 < Static275.anInt5043; local23++) {
			@Pc(32) Class11_Sub4_Sub1 local32 = Static14.aClass11_Sub4_Sub1Array1[Static135.anIntArray210[local23]];
			if (local32 != null && local32.aString99 != null && local32.aString99.equalsIgnoreCase(local11)) {
				local13 = true;
				if (arg1 == 1) {
					Static116.aClass1_Sub13_Sub1_48.method1887(198);
					Static116.aClass1_Sub13_Sub1_48.method1820(0);
					Static116.aClass1_Sub13_Sub1_48.method1818(Static135.anIntArray210[local23]);
				} else if (arg1 == 4) {
					Static116.aClass1_Sub13_Sub1_48.method1887(180);
					Static116.aClass1_Sub13_Sub1_48.method1820(0);
					Static116.aClass1_Sub13_Sub1_48.method1818(Static135.anIntArray210[local23]);
				} else if (arg1 == 5) {
					Static116.aClass1_Sub13_Sub1_48.method1887(5);
					Static116.aClass1_Sub13_Sub1_48.method1862(Static135.anIntArray210[local23]);
					Static116.aClass1_Sub13_Sub1_48.method1825(0);
				} else if (arg1 == 6) {
					Static116.aClass1_Sub13_Sub1_48.method1887(101);
					Static116.aClass1_Sub13_Sub1_48.method1818(Static135.anIntArray210[local23]);
					Static116.aClass1_Sub13_Sub1_48.method1822(0);
				} else if (arg1 == 7) {
					Static116.aClass1_Sub13_Sub1_48.method1887(97);
					Static116.aClass1_Sub13_Sub1_48.method1865(Static135.anIntArray210[local23]);
					Static116.aClass1_Sub13_Sub1_48.method1838(0);
				}
				break;
			}
		}
		if (!local13) {
			Static305.method4555(Static9.aString7 + local11, "", 0);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)Lclient!me;")
	public static Class1_Sub5_Sub9_Sub2 method4134(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub5_Sub9_Sub2 local10 = (Class1_Sub5_Sub9_Sub2) Static238.aClass175_30.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static110.aClass119_42.method3235(0, arg0);
		local10 = new Class1_Sub5_Sub9_Sub2(local20);
		local10.method2863(Static277.aClass57Array5, null);
		Static238.aClass175_30.method4285(local10, (long) arg0);
		return local10;
	}
}
