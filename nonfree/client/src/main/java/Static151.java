import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!kh;")
	public static Class29 aClass29_62;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_38;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1424 = Static51.method932("::clientdrop");

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1425 = Static51.method932("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!t", name = "z", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1427 = Static51.method932("Use");

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1426 = aClass10_1427;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "[I")
	public static int[] anIntArray343 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)I")
	public static int method2297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(14) int local14 = arg1;
			arg1 = arg5;
			arg5 = local14;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg3 - arg1;
		} else {
			return 1 + 7 - arg5 - arg2;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public static void method2298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static37.anInt932 != 0 && arg1 != -1) {
			Static63.method1124(0, Static115.aClass29_Sub1_37, Static37.anInt932, arg1);
			Static24.aBoolean22 = true;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZ)V")
	public static void method2299(@OriginalArg(3) boolean arg0) {
		Static130.anInt2892 = 2;
		Static45.anInt1131 = 22050;
		Static128.aBoolean130 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public static void method2300() {
		aClass10_1425 = null;
		anIntArray343 = null;
		aClass29_62 = null;
		aClass10_1424 = null;
		aClass2_Sub1_Sub4_Sub2_38 = null;
		aClass10_1426 = null;
		aClass10_1427 = null;
	}
}
