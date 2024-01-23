import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	public static int anInt1335;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!p;")
	public static Class75 aClass75_2;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "Lclient!cc;")
	public static Class2_Sub2_Sub4 aClass2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_387 = Static184.method2923(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_388 = Static184.method2923(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!i;")
	private static Class41 aClass41_389 = Static184.method2923("Loading config )2 ");

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_390 = aClass41_389;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public static int anInt1337 = 0;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!i;")
	public static Class41 aClass41_391 = Static184.method2923("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "S")
	public static short aShort15 = 205;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!q;")
	public static Class80 aClass80_4 = null;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public static int anInt1339 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)V")
	public static void method930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static60.anInt4779 <= arg5 && Static11.anInt385 >= arg0 && arg2 >= anInt1337 && arg6 <= Static17.anInt457) {
			Static170.method2737(arg4, arg2, arg6, arg3, arg5, arg0, arg1);
		} else {
			Static132.method2098(arg4, arg0, arg2, arg5, arg6, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!rh;I)V")
	public static void method931(@OriginalArg(0) Class60_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static196.anIntArray461.length; local7++) {
			Static196.anIntArray461[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * 128.0D * Math.random());
			Static196.anIntArray461[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(61) int local61;
		for (local32 = 0; local32 < 20; local32++) {
			for (local49 = 1; local49 < 255; local49++) {
				for (local53 = 1; local53 < 127; local53++) {
					local61 = (local49 << 7) + local53;
					Static99.anIntArray242[local61] = (Static196.anIntArray461[local61 - 128] + Static196.anIntArray461[local61 + 1] + Static196.anIntArray461[local61 - 1] + Static196.anIntArray461[local61 - -128]) / 4;
				}
			}
			@Pc(107) int[] local107 = Static196.anIntArray461;
			Static196.anIntArray461 = Static99.anIntArray242;
			Static99.anIntArray242 = local107;
		}
		if (arg0 == null) {
			return;
		}
		local49 = 0;
		for (local53 = 0; local53 < arg0.anInt3993; local53++) {
			for (local61 = 0; local61 < arg0.anInt3991; local61++) {
				if (arg0.aByteArray55[local49++] != 0) {
					@Pc(152) int local152 = arg0.anInt3994 + local61 + 16;
					@Pc(159) int local159 = arg0.anInt3989 + local53 + 16;
					@Pc(166) int local166 = local152 + (local159 << 7);
					Static196.anIntArray461[local166] = 0;
				}
			}
		}
	}
}
