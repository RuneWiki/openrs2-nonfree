import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public static int anInt3045;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1694 = Static122.method531("<col=ffb000>");

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1695 = Static122.method531("(U1");

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1697 = Static122.method531("Loading )2 please wait)3");

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1696 = aClass73_1697;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
	public static int anInt3052 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!f;Z)Z")
	public static boolean method2204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2) {
		@Pc(9) byte[] local9 = arg2.method348(arg0, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static113.method2037(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 method2205() {
		@Pc(9) Class3_Sub1_Sub3_Sub4 local9 = new Class3_Sub1_Sub3_Sub4();
		local9.anInt3223 = Static37.anIntArray89[0];
		local9.anInt3225 = Static72.anIntArray177[0];
		local9.anInt3226 = Static143.anIntArray350[0];
		local9.anInt3222 = Static86.anInt1939;
		@Pc(33) int local33 = local9.anInt3226 * local9.anInt3223;
		local9.anInt3221 = Static42.anIntArray46[0];
		@Pc(42) byte[] local42 = Static124.aByteArrayArray8[0];
		local9.anIntArray336 = new int[local33];
		local9.anInt3224 = Static57.anInt1344;
		for (@Pc(51) int local51 = 0; local51 < local33; local51++) {
			local9.anIntArray336[local51] = Static9.anIntArray12[local42[local51] & 0xFF];
		}
		Static90.method1592();
		return local9;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIBI)I")
	public static int method2206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(26) int local26 = arg1;
			arg1 = arg4;
			arg4 = local26;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return 7 + 1 - arg0 - arg1;
		} else if (local7 == 2) {
			return 7 + 1 - arg3 - arg4;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V")
	public static void method2207() {
		aClass73_1695 = null;
		aClass73_1696 = null;
		aClass73_1697 = null;
		aClass73_1694 = null;
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public static void method2208() {
		Static139.aClass3_Sub12_Sub1_3.method1400(197);
		Static139.aClass3_Sub12_Sub1_3.method1382(0L);
	}
}
