import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
	public static int anInt1086;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "[I")
	public static int[] anIntArray152;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
	public static int anInt1090;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
	public static int anInt1089 = 0;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_420 = Static120.method1824("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Lclient!rd;")
	public static Class80 aClass80_418 = aClass80_420;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIILclient!dd;IJZ)Z")
	public static boolean method738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static158.method2514(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
