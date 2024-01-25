import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method7969(@OriginalArg(1) Class100 arg0) {
		Static631.aClass50_12 = Static433.method6750(true, arg0, Static273.anInt5418);
		Static545.aClass133_42 = Static193.method3449(arg0, Static273.anInt5418);
		Static43.aClass50_2 = Static433.method6750(true, arg0, Static113.anInt2236);
		Static176.aClass133_45 = Static193.method3449(arg0, Static113.anInt2236);
		Static173.aClass50_5 = Static433.method6750(true, arg0, Static247.anInt4937);
		Static31.aClass133_3 = Static193.method3449(arg0, Static247.anInt4937);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)Z")
	public static boolean method7970(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method7972(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(22) int local22 = local6 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local22 / 4 * 3;
		if (local6 <= local22 - 2 || Static9.method193(arg0.charAt(local22 - 2)) == -1) {
			local28 -= 2;
		} else if (local6 <= local22 - 1 || Static9.method193(arg0.charAt(local22 - 1)) == -1) {
			local28--;
		}
		@Pc(71) byte[] local71 = new byte[local28];
		Static43.method823(local71, 0, arg0);
		return local71;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Lclient!iq;")
	public static Class20_Sub2_Sub4 method7974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class20_Sub2_Sub4 local14 = local7.aClass20_Sub2_Sub4_1;
			local7.aClass20_Sub2_Sub4_1 = null;
			Static10.method210(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILclient!wh;I)Lclient!iba;")
	public static Class3_Sub2_Sub1 method7976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class100_Sub3 arg4) {
		if (arg4.aBoolean709 || Static316.method5292(arg1) && Static316.method5292(arg0)) {
			return new Class3_Sub2_Sub1(arg4, 3553, arg2, arg3, arg1, arg0, true);
		} else if (arg4.aBoolean710) {
			return new Class3_Sub2_Sub1(arg4, 34037, arg2, arg3, arg1, arg0, true);
		} else {
			return new Class3_Sub2_Sub1(arg4, arg2, arg3, arg1, arg0, Static567.method8129(arg1), Static567.method8129(arg0), true);
		}
	}
}
