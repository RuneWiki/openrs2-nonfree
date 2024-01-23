import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!en", name = "Ob", descriptor = "Lclient!nk;")
	public static Class121 aClass121_40;

	@OriginalMember(owner = "client!en", name = "Pb", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!en", name = "Tb", descriptor = "Lclient!hl;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!en", name = "Ub", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "client!en", name = "Mb", descriptor = "Lclient!vh;")
	public static Class187 aClass187_45 = new Class187(64);

	@OriginalMember(owner = "client!en", name = "Qb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!en", name = "Rb", descriptor = "I")
	public static int anInt1489 = 0;

	@OriginalMember(owner = "client!en", name = "Vb", descriptor = "I")
	public static int anInt1491 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIILclient!io;IJIIII)Z")
	public static boolean method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static52.method4723(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V")
	public static void method1409(@OriginalArg(1) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static156.aBoolean211 && arg0) {
			local11 = Static115.aByteArrayArray5;
			local13 = 1;
		} else {
			local11 = Static54.aByteArrayArray2;
			local13 = 4;
		}
		@Pc(22) int local22 = local11.length;
		@Pc(24) int local24;
		@Pc(49) int local49;
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(33) int[] local33 = null;
			@Pc(37) byte[] local37 = local11[local24];
			@Pc(43) int local43 = Static224.anIntArray348[local24] >> 8;
			local49 = Static224.anIntArray348[local24] & 0xFF;
			@Pc(56) int local56 = local43 * 64 - Static199.anInt3817;
			@Pc(63) int local63 = local49 * 64 - Static192.anInt3637;
			if (local37 != null) {
				Static115.method2067();
				local33 = Static311.method4758(local56, arg0, Static199.anInt3817, Static240.aClass118Array1, Static192.anInt3637, local37, local63);
			}
			if (!arg0 && Static129.anInt2589 / 8 == local43 && local49 == Static11.anInt171 / 8) {
				if (local33 == null) {
					Static269.anInt2494 = -1;
				} else {
					Static309.anInt5628 = local33[3];
					Static175.anInt3404 = local33[1];
					Static269.anInt2494 = local33[0];
					Static45.anInt932 = local33[2];
					Static134.anInt5655 = local33[4];
				}
			}
		}
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(148) int local148 = (Static224.anIntArray348[local24] >> 8) * 64 - Static199.anInt3817;
			@Pc(159) int local159 = (Static224.anIntArray348[local24] & 0xFF) * 64 - Static192.anInt3637;
			@Pc(163) byte[] local163 = local11[local24];
			if (local163 == null && Static11.anInt171 < 800) {
				Static115.method2067();
				for (local49 = 0; local49 < local13; local49++) {
					Static251.method3962(local49, 64, local148, local159, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "u", descriptor = "(I)V")
	public static void method1413() {
		Static80.aClass187_50.method4530();
	}
}
