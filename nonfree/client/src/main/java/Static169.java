import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!d;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "Lclient!vb;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1699 = Static187.method3089("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
	public static int anInt3511 = 0;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	public static int anInt3512 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lclient!eh;")
	public static Class1_Sub3_Sub4 method2638(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub4 local10 = (Class1_Sub3_Sub4) Static176.aClass47_24.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static88.aClass3_14.method3265(16, arg0);
		local10 = new Class1_Sub3_Sub4();
		if (local27 != null) {
			local10.method817(new Class1_Sub14(local27));
		}
		Static176.aClass47_24.method1273((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z")
	public static boolean method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static36.anInt1021; local1++) {
			@Pc(6) Class74 local6 = Static48.aClass74Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2835 == 1) {
				local15 = local6.anInt2825 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2838 + (local6.anInt2834 * local15 >> 8);
					local37 = local6.anInt2823 + (local6.anInt2826 * local15 >> 8);
					local47 = local6.anInt2839 + (local6.anInt2842 * local15 >> 8);
					local57 = local6.anInt2824 + (local6.anInt2844 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2835 == 2) {
				local15 = arg0 - local6.anInt2825;
				if (local15 > 0) {
					local27 = local6.anInt2838 + (local6.anInt2834 * local15 >> 8);
					local37 = local6.anInt2823 + (local6.anInt2826 * local15 >> 8);
					local47 = local6.anInt2839 + (local6.anInt2842 * local15 >> 8);
					local57 = local6.anInt2824 + (local6.anInt2844 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2835 == 3) {
				local15 = local6.anInt2838 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2825 + (local6.anInt2843 * local15 >> 8);
					local37 = local6.anInt2829 + (local6.anInt2827 * local15 >> 8);
					local47 = local6.anInt2839 + (local6.anInt2842 * local15 >> 8);
					local57 = local6.anInt2824 + (local6.anInt2844 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2835 == 4) {
				local15 = arg2 - local6.anInt2838;
				if (local15 > 0) {
					local27 = local6.anInt2825 + (local6.anInt2843 * local15 >> 8);
					local37 = local6.anInt2829 + (local6.anInt2827 * local15 >> 8);
					local47 = local6.anInt2839 + (local6.anInt2842 * local15 >> 8);
					local57 = local6.anInt2824 + (local6.anInt2844 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2835 == 5) {
				local15 = arg1 - local6.anInt2839;
				if (local15 > 0) {
					local27 = local6.anInt2825 + (local6.anInt2843 * local15 >> 8);
					local37 = local6.anInt2829 + (local6.anInt2827 * local15 >> 8);
					local47 = local6.anInt2838 + (local6.anInt2834 * local15 >> 8);
					local57 = local6.anInt2823 + (local6.anInt2826 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ab;Z)V")
	public static void method2640(@OriginalArg(0) Class3 arg0) {
		Static88.aClass3_14 = arg0;
		Static83.anInt1837 = Static88.aClass3_14.method3270(16);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
	public static void method2642(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub25 local14 = (Class1_Sub25) Static71.aClass97_7.method3375((long) arg0);
		if (local14 != null) {
			for (@Pc(19) int local19 = 0; local19 < local14.anIntArray326.length; local19++) {
				local14.anIntArray326[local19] = -1;
				local14.anIntArray325[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method2643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static102.anInt2207 && arg1 <= Static116.anInt2488 && Static102.anInt2207 <= arg3 && Static116.anInt2488 >= arg3 && Static102.anInt2207 <= arg5 && Static116.anInt2488 >= arg5 && Static102.anInt2207 <= arg4 && Static116.anInt2488 >= arg4 && arg8 >= Static118.anInt2521 && arg8 <= Static204.anInt2389 && Static118.anInt2521 <= arg6 && arg6 <= Static204.anInt2389 && arg2 >= Static118.anInt2521 && arg2 <= Static204.anInt2389 && arg0 >= Static118.anInt2521 && Static204.anInt2389 >= arg0) {
			Static17.method2610(arg4, arg1, arg6, arg3, arg2, arg0, arg7, arg5, arg8);
		} else {
			Static186.method3064(arg1, arg7, arg2, arg4, arg5, arg8, arg0, arg3, arg6);
		}
	}
}
