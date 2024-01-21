import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	public static int anInt1932;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public static int anInt1933;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Lclient!dd;")
	private static Class13 aClass13_665 = Static161.method2971("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_656 = aClass13_665;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
	public static int[] anIntArray199 = new int[500];

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!dd;")
	private static Class13 aClass13_661 = Static161.method2971("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_657 = aClass13_661;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "Lclient!dd;")
	private static Class13 aClass13_662 = Static161.method2971("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_658 = aClass13_662;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	public static int anInt1929 = 0;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Lclient!dd;")
	private static Class13 aClass13_664 = Static161.method2971("red:");

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_659 = aClass13_664;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Lclient!dd;")
	private static Class13 aClass13_666 = Static161.method2971("Your account has been disabled)3");

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Lclient!dd;")
	public static Class13 aClass13_660 = aClass13_666;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!dd;")
	public static Class13 aClass13_663 = aClass13_664;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method1438() {
		aClass13_659 = null;
		aClass13_658 = null;
		aClass13_663 = null;
		aClass13_657 = null;
		aClass13_664 = null;
		aClass13_665 = null;
		anIntArray199 = null;
		aClass13_666 = null;
		aClass13_661 = null;
		aClass13_662 = null;
		aClass13_656 = null;
		aClass13_660 = null;
		anIntArray200 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public static void method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static71.aBoolean156 = true;
		Static165.anInt3891 = arg0;
		Static67.anInt1964 = arg1;
		Static99.anInt2784 = arg2;
		Static168.anInt3947 = -1;
		Static61.anInt1892 = -1;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public static void method1442() {
		Static49.anInt1575 = 0;
		@Pc(8) int local8 = Static153.anInt3629 + (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 >> 7);
		@Pc(15) int local15 = (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 >> 7) + Static60.anInt1864;
		if (local8 >= 3053 && local8 <= 3156 && local15 >= 3056 && local15 <= 3136) {
			Static49.anInt1575 = 1;
		}
		if (local8 >= 3072 && local8 <= 3118 && local15 >= 9492 && local15 <= 9535) {
			Static49.anInt1575 = 1;
		}
		if (Static49.anInt1575 == 1 && local8 >= 3139 && local8 <= 3199 && local15 >= 3008 && local15 <= 3062) {
			Static49.anInt1575 = 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!md;")
	public static Class1_Sub2_Sub11 method1445(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub11 local12 = (Class1_Sub2_Sub11) Static51.aClass47_11.method1999((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static122.aClass4_Sub1_40.method2243(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub2_Sub11();
		@Pc(37) int local37 = 0;
		@Pc(42) Class1_Sub8 local42 = new Class1_Sub8(local22);
		local42.anInt2195 = local42.aByteArray27.length - 12;
		@Pc(53) int local53 = local42.method1626();
		local12.anInt2949 = local42.method1642();
		local12.anInt2953 = local42.method1642();
		local12.anInt2950 = local42.method1642();
		local12.anInt2948 = local42.method1642();
		local42.anInt2195 = 0;
		local12.aClass13_975 = local42.method1619();
		local12.anIntArray289 = new int[local53];
		local12.anIntArray291 = new int[local53];
		local12.aClass13Array20 = new Class13[local53];
		while (local42.anInt2195 < local42.aByteArray27.length - 12) {
			@Pc(99) int local99 = local42.method1642();
			if (local99 == 3) {
				local12.aClass13Array20[local37] = local42.method1622();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray289[local37] = local42.method1607();
			} else {
				local12.anIntArray289[local37] = local42.method1626();
			}
			local12.anIntArray291[local37++] = local99;
		}
		Static51.aClass47_11.method1998(local12, (long) arg0);
		return local12;
	}
}
