import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_573 = Static122.method531("(Y");

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "Lclient!d;")
	public static Class16 aClass16_3 = new Class16(4096);

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "Lclient!sd;")
	private static Class73 aClass73_574 = Static122.method531("Your account has been disabled)3");

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_575 = aClass73_574;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!vd;)V")
	public static void method770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class83 arg2) {
		if (Static16.aClass83_5 != null || Static169.aBoolean245 || (arg2 == null || Static163.method2273(arg2) == null)) {
			return;
		}
		Static16.aClass83_5 = arg2;
		Static58.aClass83_8 = Static163.method2273(arg2);
		Static37.anInt898 = arg0;
		Static173.aBoolean262 = false;
		Static32.anInt821 = arg1;
		Static163.anInt3133 = 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[BI)Lclient!sd;")
	public static Class73 method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(9) Class73 local9 = new Class73();
		local9.anInt3356 = 0;
		local9.aByteArray36 = new byte[arg0];
		for (@Pc(23) int local23 = arg1; local23 < arg0 + arg1; local23++) {
			if (arg2[local23] != 0) {
				local9.aByteArray36[local9.anInt3356++] = arg2[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V")
	public static void method772() {
		aClass16_3 = null;
		aClass73_574 = null;
		aClass73_573 = null;
		aClass73_575 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)V")
	public static void method773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static65.anIntArrayArrayArray5[arg2][arg1 + local7][arg0 + local11] = 0;
			}
		}
		if (arg1 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static65.anIntArrayArrayArray5[arg2][arg1][local11 + arg0] = Static65.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 + local11];
			}
		}
		if (arg0 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static65.anIntArrayArrayArray5[arg2][arg1 + local11][arg0] = Static65.anIntArrayArrayArray5[arg2][local11 + arg1][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static65.anIntArrayArrayArray5[arg2][arg1 - 1][arg0] != 0) {
			Static65.anIntArrayArrayArray5[arg2][arg1][arg0] = Static65.anIntArrayArrayArray5[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static65.anIntArrayArrayArray5[arg2][arg1][arg0 - 1] != 0) {
			Static65.anIntArrayArrayArray5[arg2][arg1][arg0] = Static65.anIntArrayArrayArray5[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static65.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static65.anIntArrayArrayArray5[arg2][arg1][arg0] = Static65.anIntArrayArrayArray5[arg2][arg1 - 1][arg0 - 1];
		}
	}
}
