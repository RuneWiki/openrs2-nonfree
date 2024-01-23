import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	public static int anInt858;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "B")
	public static byte aByte3;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
	public static int[] anIntArray138 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_160 = Static199.method3560("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_161 = Static199.method3560("http:)4)4");

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray27 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_162 = Static199.method3560("Standort");

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_163 = Static199.method3560("leuchten3:");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZII)V")
	public static void method625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = Static80.method1342(arg5, Static73.anInt1576, Static137.anInt3137);
		@Pc(23) int local23 = Static80.method1342(arg3, Static73.anInt1576, Static137.anInt3137);
		@Pc(29) int local29 = Static80.method1342(arg1, Static6.anInt187, Static101.anInt2213);
		@Pc(35) int local35 = Static80.method1342(arg2, Static6.anInt187, Static101.anInt2213);
		@Pc(43) int local43 = Static80.method1342(arg0 + arg5, Static73.anInt1576, Static137.anInt3137);
		@Pc(52) int local52 = Static80.method1342(arg3 - arg0, Static73.anInt1576, Static137.anInt3137);
		for (@Pc(54) int local54 = local17; local54 < local43; local54++) {
			Static221.method3893(arg4, local29, Static183.anIntArrayArray40[local54], local35);
		}
		for (@Pc(70) int local70 = local23; local70 > local52; local70--) {
			Static221.method3893(arg4, local29, Static183.anIntArrayArray40[local70], local35);
		}
		@Pc(92) int local92 = Static80.method1342(arg0 + arg1, Static6.anInt187, Static101.anInt2213);
		@Pc(101) int local101 = Static80.method1342(arg2 - arg0, Static6.anInt187, Static101.anInt2213);
		for (@Pc(103) int local103 = local43; local103 <= local52; local103++) {
			@Pc(109) int[] local109 = Static183.anIntArrayArray40[local103];
			Static221.method3893(arg4, local29, local109, local92);
			Static221.method3893(arg4, local101, local109, local35);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!mj;B)Z")
	public static boolean method627(@OriginalArg(0) Class64 arg0) {
		if (arg0.anIntArray501 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray501.length; local17++) {
			@Pc(24) int local24 = Static201.method3582(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray504[local17];
			if (arg0.anIntArray501[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray501[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray501[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BB)V")
	public static void method628(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (local7 < arg0.length) {
				@Pc(26) int local26 = (arg0[local7++] & 0xFF) * 64 - Static221.anInt4795;
				@Pc(38) int local38 = (arg0[local7++] & 0xFF) * 64 - Static45.anInt815;
				@Pc(89) byte local89;
				@Pc(67) int local67;
				if (local26 > 0 && local38 > 0 && Static151.anInt3457 > local26 + 64 && local38 + 64 < Static30.anInt547) {
					local67 = local26 >> 6;
					@Pc(76) int local76 = Static30.anInt547 - local38 - 1 >> 6;
					for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
						for (@Pc(82) int local82 = -64; local82 < 0; local82++) {
							local89 = arg0[local7++];
							if (local89 != 0) {
								if (Static38.aByteArrayArrayArray3[local67][local76] == null) {
									Static38.aByteArrayArrayArray3[local67][local76] = new byte[4096];
								}
								Static38.aByteArrayArrayArray3[local67][local76][(-(local82 + 1) << 6) + local78] = local89;
								@Pc(124) byte local124 = arg0[local7++];
								if (Static78.aByteArrayArrayArray6[local67][local76] == null) {
									Static78.aByteArrayArrayArray6[local67][local76] = new byte[4096];
								}
								Static78.aByteArrayArrayArray6[local67][local76][(-(local82 + 1) << 6) + local78] = local124;
							}
						}
					}
				} else {
					for (local67 = -4096; local67 < 0; local67++) {
						local89 = arg0[local7++];
						if (local89 != 0) {
							local7++;
						}
					}
				}
			}
			return;
		}
	}
}
