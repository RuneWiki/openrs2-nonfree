import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
	public static int anInt7426;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZIII)V")
	public static void method6456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static554.anInt8294;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static98.anInt2026 = arg0;
			Static215.anInt3475 = arg1;
			Static554.anInt8294 = 2;
			Static296.anInt4682 = arg2;
			Static171.anInt3034 = arg3;
		} else if (local5 == 2) {
			if (arg1 > Static215.anInt3475) {
				Static215.anInt3475 = arg1;
			}
			if (Static171.anInt3034 > arg3) {
				Static171.anInt3034 = arg3;
			}
			if (arg0 > Static98.anInt2026) {
				Static98.anInt2026 = arg0;
			}
			if (Static296.anInt4682 > arg2) {
				Static296.anInt4682 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)V")
	public static void method6457() {
		Static403.aClass352_37.method7663(5);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!bt;Z)Lclient!bq;")
	public static Class31 method6458(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(9) byte[] local9 = arg1.method1239(arg0, 0);
		return local9 == null ? null : new Class31(local9);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!jv;)V")
	public static void method6459(@OriginalArg(1) Class4_Sub27 arg0) {
		if (Static267.aClass73ArrayArrayArray2 == null) {
			return;
		}
		@Pc(13) Interface20 local13 = null;
		if (arg0.anInt4662 == 0) {
			local13 = (Interface20) Static572.method7588(arg0.anInt4668, arg0.anInt4663, arg0.anInt4666);
		}
		if (arg0.anInt4662 == 1) {
			local13 = (Interface20) Static273.method3954(arg0.anInt4668, arg0.anInt4663, arg0.anInt4666);
		}
		if (arg0.anInt4662 == 2) {
			local13 = (Interface20) Static130.method2321(arg0.anInt4668, arg0.anInt4663, arg0.anInt4666, qb.class);
		}
		if (arg0.anInt4662 == 3) {
			local13 = (Interface20) Static191.method2972(arg0.anInt4668, arg0.anInt4663, arg0.anInt4666);
		}
		if (local13 == null) {
			arg0.anInt4658 = -1;
			arg0.anInt4657 = 0;
			arg0.anInt4664 = 0;
		} else {
			arg0.anInt4658 = local13.method7087();
			arg0.anInt4657 = local13.method7086();
			arg0.anInt4664 = local13.method7088();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBLclient!lc;Ljava/lang/String;)Lclient!pga;")
	public static Class281 method6460(@OriginalArg(0) int arg0, @OriginalArg(2) Class207 arg1, @OriginalArg(3) String arg2) {
		return Static195.method3023(arg1, "openjs", arg0, arg2);
	}
}
