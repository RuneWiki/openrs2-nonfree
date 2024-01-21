import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public static int anInt3303 = 2;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!d;")
	public static Class16 aClass16_10 = new Class16(512);

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1807 = Static122.method531("Malformed login packet)3");

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1808 = aClass73_1807;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
	public static int[] anIntArray362 = new int[128];

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1809 = Static122.method531("sl_stars");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[B[Lclient!pf;Lclient!i;)V")
	public static void method2392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class60[] arg3, @OriginalArg(5) Class35 arg4) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class3_Sub12 local12 = new Class3_Sub12(arg2);
		while (true) {
			@Pc(16) int local16 = local12.method1379();
			if (local16 == 0) {
				return;
			}
			local7 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local12.method1379();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 >> 12;
				@Pc(54) int local54 = local12.method1354();
				@Pc(58) int local58 = local54 >> 2;
				@Pc(62) int local62 = local54 & 0x3;
				@Pc(67) int local67 = local40 + arg0;
				@Pc(72) int local72 = local46 + arg1;
				if (local72 > 0 && local67 > 0 && local72 < 103 && local67 < 103) {
					@Pc(89) Class60 local89 = null;
					@Pc(91) int local91 = local50;
					if ((Static110.aByteArrayArrayArray5[1][local72][local67] & 0x2) == 2) {
						local91 = local50 - 1;
					}
					if (local91 >= 0) {
						local89 = arg3[local91];
					}
					Static127.method483(local62, local50, local7, local67, local58, arg4, local72, local89);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!f;I)V")
	public static void method2393(@OriginalArg(0) Class13 arg0) {
		Static129.aClass13_25 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method2394() {
		aClass73_1808 = null;
		anIntArray362 = null;
		aClass73_1807 = null;
		aClass16_10 = null;
		aClass73_1809 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)Z")
	public static boolean method2395(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
