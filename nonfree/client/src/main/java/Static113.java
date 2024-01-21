import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
	public static int anInt2912;

	@OriginalMember(owner = "client!oe", name = "nb", descriptor = "[I")
	public static int[] anIntArray508;

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_940 = Static170.method3101("Please enter your username)3");

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_937 = aClass28_940;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_938 = Static170.method3101(" (X");

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_939 = Static170.method3101("");

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_941 = Static170.method3101(":assistreq:");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZZ)I")
	public static int method2277() {
		return Static61.anInt1844 + Static74.anInt2213;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(BLclient!gf;)Z")
	public static boolean method2278(@OriginalArg(1) Class33 arg0) {
		if (arg0.anIntArray258 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anIntArray258.length; local18++) {
			@Pc(24) int local24 = Static66.method1601(local18, arg0);
			@Pc(29) int local29 = arg0.anIntArray257[local18];
			if (arg0.anIntArray258[local18] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray258[local18] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray258[local18] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!wd;III)V")
	public static void method2279(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub18 local7 = new Class3_Sub18();
		local7.anInt3237 = arg2 * 128;
		local7.anInt3240 = arg0 * 128;
		local7.anInt3248 = arg1.anInt4244;
		local7.anInt3234 = arg1.anInt4230;
		@Pc(35) int local35 = arg1.anInt4226;
		local7.anIntArray562 = arg1.anIntArray700;
		@Pc(42) int local42 = arg1.anInt4242;
		if (arg3 == 1 || arg3 == 3) {
			local42 = arg1.anInt4226;
			local35 = arg1.anInt4242;
		}
		local7.anInt3253 = (arg2 + local42) * 128;
		local7.anInt3246 = arg1.anInt4224 * 128;
		local7.anInt3238 = arg4;
		local7.anInt3250 = (local35 + arg0) * 128;
		local7.anInt3254 = arg1.anInt4217;
		if (arg1.anIntArray699 != null) {
			local7.aClass3_Sub2_Sub18_1 = arg1;
			local7.method2497();
		}
		Static108.aClass23_11.method850(local7);
		if (local7.anIntArray562 != null) {
			local7.anInt3251 = local7.anInt3254 + (int) ((double) (local7.anInt3234 - local7.anInt3254) * Math.random());
		}
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
	public static void method2280() {
		aClass28_938 = null;
		anIntArray508 = null;
		aClass28_937 = null;
		aClass28_940 = null;
		aClass28_941 = null;
		aClass28_939 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBI)I")
	public static int method2281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 * (4096 - arg2) + arg2 * arg0 >> 12;
	}
}
