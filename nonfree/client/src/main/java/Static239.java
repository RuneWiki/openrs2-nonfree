import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	public static int anInt5148;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public static int anInt5151;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	public static int anInt5153;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public static int anInt5156;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!hk;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	public static int anInt5157 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZB)V")
	public static void method3934(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static256.aBoolean277) {
			Static256.aBoolean277 = arg0;
			Static246.method4008();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
	public static void method3935() {
		Static236.aClass79_35.method2479(5);
		Static166.aClass79_25.method2479(5);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method3936() {
		Static197.aClass79_12.method2487();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public static void method3937() {
		if (Static106.anInt2860 != -1) {
			Static217.method3550(-1, Static106.anInt2860, -1);
			Static106.anInt2860 = -1;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILclient!sa;Lclient!sa;IIIIJ)V")
	public static void method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class85 local6 = new Class85();
		local6.aLong111 = arg10;
		local6.anInt3482 = arg1 * 128 + 64;
		local6.anInt3483 = arg2 * 128 + 64;
		local6.anInt3484 = arg3;
		local6.aClass9_3 = arg4;
		local6.aClass9_4 = arg5;
		local6.anInt3489 = arg6;
		local6.anInt3490 = arg7;
		local6.anInt3479 = arg8;
		local6.anInt3487 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static142.aClass1_Sub16ArrayArrayArray4[local46][arg1][arg2] == null) {
				Static142.aClass1_Sub16ArrayArrayArray4[local46][arg1][arg2] = new Class1_Sub16(local46, arg1, arg2);
			}
		}
		Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2].aClass85_1 = local6;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!se;B)V")
	public static void method3939(@OriginalArg(0) Class122 arg0) {
		@Pc(12) Class122 local12 = Static90.method1899(arg0);
		@Pc(16) int local16;
		@Pc(18) int local18;
		if (local12 == null) {
			local16 = Static200.anInt4411;
			local18 = Static251.anInt5352;
		} else {
			local18 = local12.anInt4726;
			local16 = local12.anInt4695;
		}
		Static136.method2543(false, local16, arg0, local18);
		Static3.method39(local16, local18, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	public static void method3940() {
		Static165.aClass79_24.method2487();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method3942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass144_1 != null && local7.aClass144_1.aLong176 == arg3) {
			return true;
		} else if (local7.aClass85_1 != null && local7.aClass85_1.aLong111 == arg3) {
			return true;
		} else if (local7.aClass148_1 != null && local7.aClass148_1.aLong181 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt2929; local46++) {
				if (local7.aClass47Array1[local46].aLong73 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
