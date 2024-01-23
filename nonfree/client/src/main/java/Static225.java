import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	public static int anInt4534 = 0;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
	public static int anInt4537 = 0;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLclient!cg;Lclient!cg;II)Lclient!jc;")
	public static Class4_Sub2_Sub9 method3542(@OriginalArg(1) Class22 arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(4) int arg2) {
		return method3549(0, arg1, arg2) ? Static80.method1372(arg0.method665(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)V")
	public static void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(18) int local18 = arg0 * arg0;
		@Pc(22) int local22 = arg3 * arg3;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg3 << 1;
		@Pc(44) int local44 = local18 * (1 - local34) + local26;
		@Pc(53) int local53 = local22 - local30 * (local34 - 1);
		@Pc(61) int local61 = local26 * 3;
		@Pc(65) int local65 = local18 << 2;
		@Pc(69) int local69 = local22 << 2;
		@Pc(77) int local77 = local30 * ((arg3 << 1) - 3);
		@Pc(83) int local83 = local69;
		@Pc(102) int local102;
		@Pc(111) int local111;
		if (Static293.anInt5688 <= arg4 && Static100.anInt1982 >= arg4) {
			local102 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 + arg0);
			local111 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 - arg0);
			Static190.method3151(local102, Static253.anIntArrayArray34[arg4], arg2, local111);
		}
		@Pc(125) int local125 = (arg3 - 1) * local65;
		while (local14 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local53 += local83;
					local44 += local61;
					local61 += local69;
					local83 += local69;
					local7++;
				}
			}
			local14--;
			if (local53 < 0) {
				local44 += local61;
				local7++;
				local61 += local69;
				local53 += local83;
				local83 += local69;
			}
			local53 += -local77;
			local44 += -local125;
			local125 -= local65;
			local77 -= local65;
			local111 = arg4 + local14;
			local102 = arg4 - local14;
			if (Static293.anInt5688 <= local111 && Static100.anInt1982 >= local102) {
				@Pc(217) int local217 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 + local7);
				@Pc(226) int local226 = Static101.method1680(Static121.anInt2460, Static173.anInt3481, arg1 - local7);
				if (Static293.anInt5688 <= local102) {
					Static190.method3151(local217, Static253.anIntArrayArray34[local102], arg2, local226);
				}
				if (local111 <= Static100.anInt1982) {
					Static190.method3151(local217, Static253.anIntArrayArray34[local111], arg2, local226);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 method3546() {
		@Pc(13) int local13 = Static246.anIntArray386[0] * Static107.anIntArray188[0];
		@Pc(17) byte[] local17 = Static99.aByteArrayArray8[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(28) int local28 = 0; local28 < local13; local28++) {
			local20[local28] = Static138.anIntArray228[local17[local28] & 0xFF];
		}
		@Pc(63) Class4_Sub2_Sub4_Sub2 local63 = new Class4_Sub2_Sub4_Sub2(Static31.anInt651, Static161.anInt3300, Static149.anIntArray238[0], Static278.anIntArray422[0], Static107.anIntArray188[0], Static246.anIntArray386[0], local20);
		Static184.method2969();
		return local63;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method3548(@OriginalArg(1) Class22 arg0) {
		Static64.aClass22_27 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBLclient!cg;I)Z")
	public static boolean method3549(@OriginalArg(0) int arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.method665(arg2, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static304.method4671(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([Lclient!lg;ZI)V")
	public static void method3550(@OriginalArg(0) Class97[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(24) Class97 local24 = arg0[local12];
			if (local24 != null) {
				if (local24.anInt3177 == 0) {
					if (local24.aClass97Array1 != null) {
						method3550(local24.aClass97Array1, arg1);
					}
					@Pc(48) Class4_Sub30 local48 = (Class4_Sub30) Static167.aClass163_25.method4188((long) local24.anInt3162);
					if (local48 != null) {
						Static85.method1423(local48.anInt5208, arg1);
					}
				}
				@Pc(69) Class4_Sub23 local69;
				if (arg1 == 0 && local24.anObjectArray4 != null) {
					local69 = new Class4_Sub23();
					local69.aClass97_15 = local24;
					local69.anObjectArray32 = local24.anObjectArray4;
					Static145.method4497(local69);
				}
				if (arg1 == 1 && local24.anObjectArray28 != null) {
					if (local24.anInt3146 >= 0) {
						@Pc(97) Class97 local97 = Static148.method2340(local24.anInt3162);
						if (local97 == null || local97.aClass97Array1 == null || local97.aClass97Array1.length <= local24.anInt3146 || local97.aClass97Array1[local24.anInt3146] != local24) {
							continue;
						}
					}
					local69 = new Class4_Sub23();
					local69.anObjectArray32 = local24.anObjectArray28;
					local69.aClass97_15 = local24;
					Static145.method4497(local69);
				}
			}
		}
	}
}
