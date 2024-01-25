import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "Z")
	public static boolean aBoolean395;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	public static int anInt5870 = 0;

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
	public static int anInt5887 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!ec;)Lclient!db;")
	public static Class43_Sub1 method5313(@OriginalArg(1) Class6_Sub10 arg0) {
		return new Class43_Sub1(arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method3996(), arg0.method3996(), arg0.method3972());
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!ja;BIIIIII[[[BII)V")
	public static void method5314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg7 == 0 || arg3 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg1 = arg1 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg1 = arg1 + 3 & 0x3;
		}
		arg2.method2960(arg5, arg6, arg8, arg11, arg10, arg4, arg9[arg7 - 1][arg1], arg3, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILclient!im;Lclient!im;)V")
	public static void method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44_Sub1 arg3, @OriginalArg(4) Class44_Sub1 arg4) {
		if (Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static101.method2079(arg0, arg1, arg2);
		}
		Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2].aClass44_Sub1_1 = arg3;
		Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2].aClass44_Sub1_2 = arg4;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZIII)V")
	public static void method5316(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static13.anInt232 == 0) {
			Static31.method487(false);
		} else {
			Static320.anInt5929 = Static13.anInt232;
			Static334.method5541(0);
		}
		Static114.anInt2141 = arg3;
		Static125.anInt2331 = arg2;
		Static2.aBoolean7 = arg0;
		Static307.method1094(arg1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
	public static void method5317() {
		@Pc(1) Class70 local1 = Static215.aClass70_70;
		synchronized (Static215.aClass70_70) {
			Static215.aClass70_70.method1397(5);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIILclient!ja;ILclient!rc;)Lclient!rc;")
	public static Class78 method5318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class81 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class78 arg9) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class78 local12 = (Class78) Static242.aClass70_81.method1396(local6);
		if (local12 == null) {
			@Pc(22) Class57 local22 = Static287.method4917(arg5, Static17.aClass53_155);
			if (local22 == null) {
				return null;
			}
			local12 = arg7.method3016(local22, 1031, Static192.anInt3643, 64, 768);
			Static242.aClass70_81.method1406(local12, local6);
		}
		local12 = local12.method4661((byte) 2, 1031, true);
		if (arg2 != 0) {
			local12.method4648(arg2);
		}
		if (arg3 != 0) {
			local12.method4651(arg3);
		}
		if (arg4 != 0) {
			local12.method4658(arg4);
		}
		if (arg0 != 0) {
			local12.method4641(0, arg0, 0);
		}
		return local12;
	}
}
