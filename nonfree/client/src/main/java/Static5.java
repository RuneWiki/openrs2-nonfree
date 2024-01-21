import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public static int anInt210;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_56 = Static49.method1293("scrollbar");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!rf;")
	private static Class70 aClass70_58 = Static49.method1293("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_57 = aClass70_58;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public static int anInt212 = 0;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_59 = null;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method183() {
		aClass70_58 = null;
		aClass1_Sub1_Sub1_Sub4_1 = null;
		aClass70_57 = null;
		aClass70_59 = null;
		aClass70_56 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([[IZ)V")
	public static void method185(@OriginalArg(0) int[][] arg0) {
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)J")
	public static long method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass34_1 == null ? 0L : local7.aClass34_1.aLong59;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIILclient!s;IJ)Z")
	public static boolean method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub4 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static93.method2007(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}
}
