import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
	public static int[] anIntArray894;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "[I")
	public static final int[] anIntArray895 = new int[25];

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_103 = new Class205(57, 3);

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "Z")
	public static boolean aBoolean347 = true;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "[Lclient!qp;")
	public static final Class202[] aClass202Array2 = new Class202[14];

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
	public static int anInt4642 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILclient!a;Lclient!a;)V")
	public static void method4109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1 arg3, @OriginalArg(4) Class1_Sub1 arg4) {
		@Pc(4) Class251 local4 = Static377.method4610(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub1_3 = arg3;
			local4.aClass1_Sub1_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!id;Lclient!we;IILclient!vc;)Z")
	public static boolean method4111(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) Class243 arg1, @OriginalArg(5) Class63 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray1317 != null) {
			local7 = Static338.anInt3302 + (Static338.anInt3303 - Static338.anInt3302) * (arg0.anInt2800 + arg1.anInt6366 - Static338.anInt3299) / (Static338.anInt3297 - Static338.anInt3299);
			local11 = Static338.anInt3304 - (arg0.anInt2803 + arg1.anInt6357 - Static338.anInt3298) * (-Static338.anInt3301 + Static338.anInt3304) / (Static338.anInt3300 - Static338.anInt3298);
			local13 = Static338.anInt3304 - (Static338.anInt3304 - Static338.anInt3301) * (-Static338.anInt3298 + arg0.anInt2803 + arg1.anInt6350) / (Static338.anInt3300 - Static338.anInt3298);
			local9 = Static338.anInt3302 + (Static338.anInt3303 - Static338.anInt3302) * (-Static338.anInt3299 + arg0.anInt2800 + arg1.anInt6375) / (Static338.anInt3297 - Static338.anInt3299);
		}
		@Pc(103) Class18 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(117) int local117 = 0;
		@Pc(119) int local119 = 0;
		if (arg1.anInt6344 != -1) {
			if (arg0.aBoolean210 && arg1.anInt6363 != -1) {
				local103 = arg1.method5519(true, arg2);
			} else {
				local103 = arg1.method5519(false, arg2);
			}
			if (local103 != null) {
				local105 = arg0.anInt2804 - (local103.method4564() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				local107 = arg0.anInt2804 + (local103.method4564() + 1 >> 1);
				local117 = arg0.anInt2802 - (local103.method4560() + 1 >> 1);
				if (local107 > local9) {
					local9 = local107;
				}
				if (local11 > local117) {
					local11 = local117;
				}
				local119 = arg0.anInt2802 + (local103.method4560() + 1 >> 1);
				if (local119 > local13) {
					local13 = local119;
				}
			}
		}
		@Pc(223) Class110 local223 = null;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(237) int local237 = 0;
		@Pc(286) int local286;
		@Pc(313) int local313;
		if (arg1.aString64 != null) {
			local223 = Static66.method1053(arg1.anInt6369);
			if (local223 != null) {
				local225 = Static374.aClass136_9.method3124(null, Static203.aStringArray95, null, arg1.aString64);
				local227 = arg0.anInt2802;
				if (local103 == null) {
					local227 -= local225 * local223.method2792() / 2;
				} else {
					local227 -= (local103.method4560() >> 1) + local223.method2791() * local225;
				}
				for (local286 = 0; local286 < local225; local286++) {
					@Pc(292) String local292 = Static203.aStringArray95[local286];
					if (local225 - 1 > local286) {
						local292 = local292.substring(0, local292.length() - 4);
					}
					local313 = local223.method2790(local292);
					if (local313 > local229) {
						local229 = local313;
					}
				}
				local231 = arg0.anInt2804 - local229 / 2;
				local233 = arg0.anInt2804 + local229 / 2;
				if (local7 > local231) {
					local7 = local231;
				}
				if (local233 > local9) {
					local9 = local233;
				}
				local235 = local227;
				local237 = local225 * local223.method2791() + local227;
				if (local235 < local11) {
					local11 = local235;
				}
				if (local237 > local13) {
					local13 = local237;
				}
			}
		}
		if (local9 < Static338.anInt3302 || local7 > Static338.anInt3303 || Static338.anInt3301 > local13 || local11 > Static338.anInt3304) {
			return true;
		}
		@Pc(420) int local420;
		if (arg1.anIntArray1317 != null) {
			@Pc(418) int[] local418 = new int[arg1.anIntArray1317.length];
			for (local420 = 0; local420 < local418.length / 2; local420++) {
				local313 = arg0.anInt2800 + arg1.anIntArray1317[local420 * 2];
				@Pc(444) int local444 = arg0.anInt2803 + arg1.anIntArray1317[local420 * 2 + 1];
				local418[local420 * 2] = (local313 - Static338.anInt3299) * (Static338.anInt3303 + -Static338.anInt3302) / (Static338.anInt3297 - Static338.anInt3299) + Static338.anInt3302;
				local418[local420 * 2 + 1] = Static338.anInt3304 - (local444 - Static338.anInt3298) * (-Static338.anInt3301 + Static338.anInt3304) / (Static338.anInt3300 - Static338.anInt3298);
			}
			Static134.method2635(arg2, local418, arg1.anInt6362);
			for (local313 = 0; local313 < local418.length / 2 - 1; local313++) {
				arg2.method1985(local418[local313 * 2 + 1], local418[(local313 + 1) * 2 + 1], arg1.anInt6348, local418[local313 * 2], local418[(local313 + 1) * 2]);
			}
			arg2.method1985(local418[local418.length - 1], local418[1], arg1.anInt6348, local418[local418.length - 2], local418[0]);
		}
		if (local103 != null) {
			if (Static121.anInt2597 > 0 && (Static17.anInt398 != -1 && Static17.anInt398 == arg0.anInt2801 || Static223.anInt3988 != -1 && arg1.anInt6354 == Static223.anInt3988)) {
				if (Static33.anInt699 > 50) {
					local286 = 200 - Static33.anInt699 * 2;
				} else {
					local286 = Static33.anInt699 * 2;
				}
				local420 = local286 << 24 | 0xFFFF00;
				arg2.method2048(arg0.anInt2802, local420, arg0.anInt2804, local103.method4563() / 2 + 7);
				arg2.method2048(arg0.anInt2802, local420, arg0.anInt2804, local103.method4563() / 2 + 5);
				arg2.method2048(arg0.anInt2802, local420, arg0.anInt2804, local103.method4563() / 2 + 3);
				arg2.method2048(arg0.anInt2802, local420, arg0.anInt2804, local103.method4563() / 2 + 1);
				arg2.method2048(arg0.anInt2802, local420, arg0.anInt2804, local103.method4563() / 2);
			}
			local103.method4558(arg0.anInt2804 - (local103.method4564() >> 1), arg0.anInt2802 + -(local103.method4560() >> 1));
		}
		if (arg1.aString64 != null && local223 != null) {
			Static161.method2877(arg0, local225, local227, local223, local229, arg2, arg1);
		}
		if (arg1.anInt6344 != -1 || arg1.aString64 != null) {
			@Pc(738) Class2_Sub44 local738 = new Class2_Sub44(arg0);
			local738.anInt6548 = local107;
			local738.anInt6558 = local235;
			local738.anInt6546 = local231;
			local738.anInt6551 = local119;
			local738.anInt6550 = local233;
			local738.anInt6549 = local237;
			local738.anInt6556 = local105;
			local738.anInt6553 = local117;
			Static224.aClass30_32.method685(local738);
		}
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)B")
	public static byte method4112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
