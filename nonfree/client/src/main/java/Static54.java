import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "Lclient!wo;")
	public static Class216 aClass216_15;

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_38 = new Class34("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "[S")
	public static short[] aShortArray12 = new short[256];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!aq;Lclient!aq;I)V")
	public static void method1412(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1) {
		Static342.aClass1_Sub8_Sub1_7.method3229(219);
		Static342.aClass1_Sub8_Sub1_7.method4529(arg1.anInt465);
		Static342.aClass1_Sub8_Sub1_7.method4529(arg0.anInt465);
		Static342.aClass1_Sub8_Sub1_7.method4557(arg0.anInt406);
		Static342.aClass1_Sub8_Sub1_7.method4515(arg0.anInt410);
		Static342.aClass1_Sub8_Sub1_7.method4542(arg1.anInt410);
		Static342.aClass1_Sub8_Sub1_7.method4542(arg1.anInt406);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILclient!uo;II[[[BIIIII)V")
	public static void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class32 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg3 == 0 || arg6 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg2 = arg2 + 1 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 10) {
			arg2 = arg2 + 3 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 11) {
			arg3 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg4.method2224(arg11, arg8, arg5, arg10, arg9, arg1, arg7[arg3 - 1][arg2], arg6, arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1414(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)Lclient!sf;")
	public static Class188 method1415(@OriginalArg(1) int arg0) {
		@Pc(10) Class188 local10 = (Class188) Static324.aClass87_58.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static109.aClass216_34.method5648(29, arg0);
		local10 = new Class188();
		if (local20 != null) {
			local10.method4902(new Class1_Sub8(local20), arg0);
		}
		Static324.aClass87_58.method2481(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(CZ)C")
	public static char method1416(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!uo;Lclient!na;Lclient!jk;IBLclient!pd;I)V")
	public static void method1417(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1_Sub27 arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg5.anInt4781 - arg6 / 2 - 5;
		@Pc(18) int local18 = arg0 + 2;
		if (arg2.anInt4240 != 0) {
			arg1.method2191(arg2.anInt4240, local14, arg6 + 10, local18, arg0 + arg4 * arg3.method2842() + 1 - local18);
		}
		if (arg2.anInt4242 != 0) {
			arg1.method2183(local14, local18, arg6 + 10, arg2.anInt4242, arg0 + arg4 * arg3.method2842() + 1 - local18);
		}
		@Pc(71) int local71 = arg2.anInt4239;
		if (arg5.aBoolean461 && arg2.anInt4223 != -1) {
			local71 = arg2.anInt4223;
		}
		for (@Pc(88) int local88 = 0; local88 < arg4; local88++) {
			@Pc(94) String local94 = Static92.aStringArray33[local88];
			if (arg4 - 1 > local88) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg3.method2844(arg1, local94, arg5.anInt4781, arg0, local71);
			arg0 += arg3.method2842();
		}
	}
}
