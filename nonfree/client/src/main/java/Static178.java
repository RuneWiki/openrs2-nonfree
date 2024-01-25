import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "Lclient!vr;")
	public static Class258 aClass258_27 = new Class258();

	@OriginalMember(owner = "client!it", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString37 = null;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIII)I")
	public static int method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int local13 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(20) int local20 = arg4;
			arg4 = arg0;
			arg0 = local20;
		}
		if (local13 == 0) {
			return arg3;
		} else if (local13 == 1) {
			return 1 + 7 - arg4 - arg1;
		} else if (local13 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)[Lclient!ud;")
	public static Class239[] method2598() {
		return new Class239[] { Static427.aClass239_7, Static6.aClass239_2, Static263.aClass239_5, Static124.aClass239_3, Static371.aClass239_6, Static3.aClass239_1 };
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([Lclient!f;I)V")
	public static void method2599(@OriginalArg(0) Class3[] arg0) {
		Static387.anInt6720 = arg0.length;
		Static208.aClass3Array9 = new Class3[Static387.anInt6720 + 10];
		Static429.anIntArray630 = new int[Static387.anInt6720 + 10];
		Static457.method1214(arg0, 0, Static208.aClass3Array9, 0, Static387.anInt6720);
		for (@Pc(38) int local38 = 0; local38 < Static387.anInt6720; local38++) {
			Static429.anIntArray630[local38] = Static208.aClass3Array9[local38].JA();
		}
		for (@Pc(57) int local57 = Static387.anInt6720; local57 < Static208.aClass3Array9.length; local57++) {
			Static429.anIntArray630[local57] = 12;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZ)I")
	public static int method2601(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static177.method2595(arg0);
	}
}
