import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "[Lclient!bi;")
	public static Class1_Sub6[] aClass1_Sub6Array1;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString258 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString259 = "Loaded sprites";

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!qj;")
	public static Class148 aClass148_8 = new Class148(64);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public static void method3873() {
		Static127.aClass1_Sub14_Sub1_3.method1408(227);
		Static127.aClass1_Sub14_Sub1_3.method1338(Static57.anInt1083);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
	public static void method3874(@OriginalArg(0) int arg0) {
		Static283.method4351(Static283.anInt5101, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static283.method4354(-50.0F, -60.0F, -50.0F);
		Static283.method4358(Static283.anInt5100, 0, false);
		Static283.method4350();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg3 && arg0 == arg5 && arg1 == arg6 && arg2 == arg7) {
			Static26.method439(arg4, arg6, arg0, arg8, arg2);
			return;
		}
		@Pc(45) int local45 = arg0;
		@Pc(47) int local47 = arg4;
		@Pc(51) int local51 = arg0 * 3;
		@Pc(55) int local55 = arg4 * 3;
		@Pc(59) int local59 = arg3 * 3;
		@Pc(63) int local63 = arg5 * 3;
		@Pc(67) int local67 = arg7 * 3;
		@Pc(71) int local71 = arg1 * 3;
		@Pc(81) int local81 = local71 + local55 - local59 - local59;
		@Pc(91) int local91 = local67 + local51 - local63 - local63;
		@Pc(96) int local96 = local59 - local55;
		@Pc(101) int local101 = local63 - local51;
		@Pc(111) int local111 = arg6 + local59 - arg4 - local71;
		@Pc(121) int local121 = local63 + arg2 - arg0 - local67;
		for (@Pc(123) int local123 = 128; local123 <= 4096; local123 += 128) {
			@Pc(132) int local132 = local123 * local123 >> 12;
			@Pc(138) int local138 = local132 * local123 >> 12;
			@Pc(142) int local142 = local111 * local138;
			@Pc(146) int local146 = local81 * local132;
			@Pc(150) int local150 = local138 * local121;
			@Pc(154) int local154 = local132 * local91;
			@Pc(158) int local158 = local123 * local96;
			@Pc(162) int local162 = local101 * local123;
			@Pc(172) int local172 = (local146 + local142 + local158 >> 12) + arg4;
			@Pc(185) int local185 = arg0 + (local150 + local154 + local162 >> 12);
			Static26.method439(local47, local172, local45, arg8, local185);
			local45 = local185;
			local47 = local172;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Z")
	public static boolean method3877(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ua;)Z")
	public static boolean method3878(@OriginalArg(1) Class175 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean345) {
			return false;
		} else if (!arg0.method4294()) {
			return false;
		} else if (Static240.aClass142_22.method3543((long) arg0.anInt5006) == null) {
			return Static56.aClass142_4.method3543((long) arg0.anInt5011) == null;
		} else {
			return false;
		}
	}
}
