import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static int anInt3717;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!bg;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!ra;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	public static int anInt3716 = 0;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
	public static int[] anIntArray337 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3005(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = Static142.method2529(arg0);
		return local13 == -1 ? "" : Static260.method4429("<br>", " ", Static159.aClass78_2.aStringArray14[local13]);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z")
	public static boolean method3006(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static213.aShortArray71[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1006;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!lg;)V")
	public static void method3008(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub1 arg1) {
		if (Static32.anInt809 < arg1.anInt1633) {
			Static49.method1044(arg1);
		} else if (Static32.anInt809 <= arg1.anInt1630) {
			Static215.method3783(arg1);
		} else {
			Static54.method1093(arg1);
		}
		if (arg1.anInt1635 < 128 || arg1.anInt1604 < 128 || arg1.anInt1635 >= 13184 || arg1.anInt1604 >= 13184) {
			arg1.anInt1633 = 0;
			arg1.anInt1630 = 0;
			arg1.anInt1625 = -1;
			arg1.anInt1669 = -1;
			arg1.anInt1635 = arg1.anIntArray172[0] * 128 + arg1.method1243() * 64;
			arg1.anInt1604 = arg1.anIntArray173[0] * 128 + arg1.method1243() * 64;
			arg1.method1237();
		}
		if (Static239.aClass25_Sub1_Sub1_2 == arg1 && (arg1.anInt1635 < 1536 || arg1.anInt1604 < 1536 || arg1.anInt1635 >= 11776 || arg1.anInt1604 >= 11776)) {
			arg1.anInt1630 = 0;
			arg1.anInt1669 = -1;
			arg1.anInt1625 = -1;
			arg1.anInt1633 = 0;
			arg1.anInt1635 = arg1.anIntArray172[0] * 128 + arg1.method1243() * 64;
			arg1.anInt1604 = arg1.anIntArray173[0] * 128 + arg1.method1243() * 64;
			arg1.method1237();
		}
		Static122.method2093(arg1);
		Static194.method3448(arg1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!kb;II)[Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1[] method3010(@OriginalArg(1) Class83 arg0, @OriginalArg(3) int arg1) {
		return Static19.method387(arg1, 0, arg0) ? Static34.method720() : null;
	}
}
