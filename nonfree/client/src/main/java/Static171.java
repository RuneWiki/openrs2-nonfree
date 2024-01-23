import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public static int anInt3982 = 0;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!h;")
	public static Class1_Sub13_Sub1 aClass1_Sub13_Sub1_3 = new Class1_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	public static int anInt3993 = 0;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString265 = "Please remove ";

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)V")
	public static void method2962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static91.anIntArray189[arg0] = arg1;
		@Pc(19) Class1_Sub10 local19 = (Class1_Sub10) Static145.aClass140_10.method4014((long) arg0);
		if (local19 == null) {
			local19 = new Class1_Sub10(Static31.method591() + 500L);
			Static145.aClass140_10.method4011(local19, (long) arg0);
		} else {
			local19.aLong68 = Static31.method591() + 500L;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
	public static void method2964(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub2_Sub18 local16 = Static13.method232(arg0, 2);
		local16.method3805();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg2) {
			Static133.method2490(arg0, arg5, arg3, arg4, arg1, arg6);
		} else if (arg5 - arg0 >= Static167.anInt3907 && arg0 + arg5 <= Static150.anInt3860 && arg6 - arg2 >= Static202.anInt4469 && Static94.anInt4237 >= arg2 + arg6) {
			Static37.method659(arg2, arg1, arg5, arg4, arg0, arg6, arg3);
		} else {
			Static68.method976(arg6, arg4, arg5, arg3, arg1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method2967() {
		for (@Pc(10) Class1_Sub5 local10 = (Class1_Sub5) Static204.aClass140_13.method4012(); local10 != null; local10 = (Class1_Sub5) Static204.aClass140_13.method4013()) {
			@Pc(17) int local17 = local10.anInt1358;
			if (Static156.method2772(local17)) {
				@Pc(23) boolean local23 = true;
				@Pc(27) Class122[] local27 = Static80.aClass122ArrayArray1[local17];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					if (local27[local29] != null) {
						local23 = local27[local29].aBoolean228;
						break;
					}
				}
				if (!local23) {
					@Pc(57) int local57 = (int) local10.aLong184;
					@Pc(61) Class122 local61 = Static206.method3444(local57);
					if (local61 != null) {
						Static257.method4146(local61);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIILclient!sa;IJ)Z")
	public static boolean method2972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static242.method3984(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method2974(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static69.method1318(local13) : local13;
		} else if (arg1 instanceof Class57) {
			@Pc(27) Class57 local27 = (Class57) arg1;
			return local27.method2667();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
