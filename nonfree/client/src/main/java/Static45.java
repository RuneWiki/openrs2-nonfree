import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "Lclient!bb;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
	public static final int anInt720 = 1401;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
	public static int anInt721 = 0;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_16 = new Class25(2, 10);

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Lclient!lm;")
	public static final Class163 aClass163_1 = new Class163(9, -1);

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!mn;I)V")
	public static void method699(@OriginalArg(0) Class171 arg0) {
		Static117.aClass171_31 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lclient!fv;")
	public static Class11_Sub1 method700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub1_2;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
	public static boolean method703(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)V")
	public static void method704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 + arg1;
		@Pc(15) int local15 = arg2 - arg1;
		for (@Pc(17) int local17 = arg3; local17 < local10; local17++) {
			Static215.method3035(arg5, arg4, Static46.anIntArrayArray24[local17], arg0);
		}
		@Pc(39) int local39 = arg4 - arg1;
		@Pc(43) int local43 = arg5 + arg1;
		for (@Pc(45) int local45 = arg2; local45 > local15; local45--) {
			Static215.method3035(arg5, arg4, Static46.anIntArrayArray24[local45], arg0);
		}
		for (@Pc(65) int local65 = local10; local65 <= local15; local65++) {
			@Pc(77) int[] local77 = Static46.anIntArrayArray24[local65];
			Static215.method3035(arg5, local43, local77, arg0);
			Static215.method3035(local39, arg4, local77, arg0);
		}
	}
}
