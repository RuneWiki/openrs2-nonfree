import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!et", name = "f", descriptor = "Lclient!vh;")
	public static Class250 aClass250_22;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_6 = new Class190("", 11);

	@OriginalMember(owner = "client!et", name = "u", descriptor = "I")
	public static int anInt1855 = 0;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public static void method1551() {
		Static187.anIntArray396 = Static296.method2397(0.4F);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)I")
	public static int method1552(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(14) int local14 = local4 | local4 >>> 1;
		@Pc(20) int local20 = local14 | local14 >>> 2;
		@Pc(26) int local26 = local20 | local20 >>> 4;
		@Pc(32) int local32 = local26 | local26 >>> 8;
		@Pc(38) int local38 = local32 | local32 >>> 16;
		return local38 + 1;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(III)V")
	public static void method1553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static208.anInt3847 == 1) {
			Static351.method4853(Static52.aClass1_Sub8_1, arg1, arg0);
		} else if (Static208.anInt3847 == 2) {
			Static359.method4948(arg1, arg0);
		}
		Static208.anInt3847 = 0;
		Static52.aClass1_Sub8_1 = null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static83.anInt7380 <= arg3 && arg2 <= Static221.anInt4001 && arg6 >= Static305.anInt5429 && Static212.anInt452 >= arg5) {
			Static255.method3757(arg1, arg4, arg3, arg0, arg2, arg5, arg6);
		} else {
			Static302.method4318(arg2, arg4, arg6, arg0, arg1, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(II)V")
	public static void method1556(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 5);
		local8.method195();
	}
}
