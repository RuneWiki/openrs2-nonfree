import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
	public static int anInt6797;

	@OriginalMember(owner = "client!wl", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!wl", name = "M", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
	public static int anInt6800 = 0;

	@OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
	public static int anInt6803 = 0;

	@OriginalMember(owner = "client!wl", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString257 = "rating: ";

	@OriginalMember(owner = "client!wl", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString258 = "Cancel";

	@OriginalMember(owner = "client!wl", name = "Z", descriptor = "I")
	public static int anInt6809 = 0;

	@OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
	public static int anInt6810 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!ps;IIII)V")
	public static void method5689(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub4_Sub4 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static123.method2166(arg2, arg1.anInt5901, arg0, 0, arg3, arg1.anInt5905);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!qc;I)I")
	public static int method5690(@OriginalArg(0) Class5_Sub4_Sub4_Sub2 arg0) {
		@Pc(8) Class119 local8 = arg0.aClass119_1;
		if (local8.anIntArray248 != null) {
			local8 = local8.method2882();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local8.anInt3665;
		@Pc(31) Class54 local31 = arg0.method4201();
		if (arg0.aBoolean285) {
			local27 = local8.anInt3653;
		} else if (arg0.anInt4911 == local31.anInt1509 || local31.anInt1491 == arg0.anInt4911 || arg0.anInt4911 == local31.anInt1505 || local31.anInt1498 == arg0.anInt4911) {
			local27 = local8.anInt3654;
		} else if (local31.anInt1499 == arg0.anInt4911 || arg0.anInt4911 == local31.anInt1473 || local31.anInt1475 == arg0.anInt4911 || local31.anInt1482 == arg0.anInt4911) {
			local27 = local8.anInt3655;
		}
		return local27;
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
	public static void method5691() {
		Static316.aClass70_1.method5394();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static68.aLongArray3[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static160.aLongArray5[local29] = 0L;
		}
		Static295.anInt5866 = 0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)V")
	public static void method5692(@OriginalArg(0) boolean arg0) {
		Static186.aBoolean166 = arg0;
		Static323.aBoolean426 = !Static75.method1142();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg0) {
			Static212.method1615(arg2, arg3, arg0, arg1, arg4, arg5);
		} else if (arg4 - arg0 >= Static19.anInt533 && Static4.anInt75 >= arg4 + arg0 && arg1 - arg6 >= Static236.anInt4721 && arg1 + arg6 <= Static73.anInt1425) {
			Static288.method4938(arg4, arg0, arg6, arg5, arg1, arg3, arg2);
		} else {
			Static107.method1840(arg0, arg5, arg2, arg4, arg6, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V")
	public static void method5694(@OriginalArg(0) int arg0) {
		if (Static149.method2419(arg0)) {
			Static197.method3459(Static311.aClass181ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILclient!tj;ILclient!qb;IBII)Lclient!qb;")
	public static Class124 method5695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class122 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class124 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(12) Class124 local12 = (Class124) Static346.aClass198_62.method5242(local6);
		if (local12 == null) {
			@Pc(22) Class40 local22 = Static26.method559(Static100.aClass100_38, arg2);
			if (local22 == null) {
				return null;
			}
			local12 = arg4.method4794(local22, 1031, Static195.anInt4016, 64, 768);
			Static346.aClass198_62.method5231(local6, local12);
		}
		local12 = local12.method4094((byte) 2, 1031, true);
		if (arg9 != 0) {
			local12.method4091(arg9);
		}
		if (arg8 != 0) {
			local12.method4105(arg8);
		}
		if (arg1 != 0) {
			local12.method4111(arg1);
		}
		if (arg7 != 0) {
			local12.method4077(0, arg7, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IC)Z")
	public static boolean method5696(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
