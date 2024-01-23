import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
	public static int[] anIntArray518 = new int[128];

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1431 = method3527("Select a world");

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1430 = aClass50_1431;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!qh;")
	public static Class93 aClass93_126 = null;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public static int anInt4481 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!qh;")
	public static Class93 method3524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class93 local12 = Static164.method2725(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass93Array1 == null || local12.aClass93Array1.length <= arg0) {
			return null;
		} else {
			return local12.aClass93Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!hh;")
	public static Class50 method3527(@OriginalArg(0) String arg0) {
		@Pc(11) byte[] local11 = arg0.getBytes();
		@Pc(14) int local14 = local11.length;
		@Pc(18) Class50 local18 = new Class50();
		@Pc(20) int local20 = 0;
		local18.aByteArray12 = new byte[local14];
		while (local20 < local14) {
			@Pc(32) int local32 = local11[local20++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local14 <= local20) {
					break;
				}
				@Pc(72) int local72 = local11[local20++] & 0xFF;
				local18.aByteArray12[local18.anInt1705++] = (byte) ((local32 - 40) * 43 + local72 - 48);
			} else if (local32 != 0) {
				local18.aByteArray12[local18.anInt1705++] = (byte) local32;
			}
		}
		local18.method1215();
		return local18.method1258();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	public static void method3528() {
		if (Static9.aClass93_9 != null || Static54.aClass93_35 != null) {
			return;
		}
		@Pc(13) int local13 = Static2.anInt59;
		@Pc(87) int local87;
		@Pc(93) int local93;
		if (Static40.aBoolean44) {
			@Pc(177) int local177;
			if (local13 != 1) {
				local177 = Static117.anInt2301;
				local87 = Static110.anInt2205;
				if (local177 < Static143.anInt2913 - 10 || Static126.anInt2534 + Static143.anInt2913 + 10 < local177 || Static15.anInt284 - 10 > local87 || Static15.anInt284 + Static233.anInt4463 + 10 < local87) {
					Static40.aBoolean44 = false;
					Static73.method2567(Static143.anInt2913, Static233.anInt4463, Static126.anInt2534, Static15.anInt284);
				}
			}
			if (local13 != 1) {
				return;
			}
			local177 = Static143.anInt2913;
			local93 = Static126.anInt2534;
			@Pc(233) int local233 = Static70.anInt1323;
			local87 = Static15.anInt284;
			@Pc(237) int local237 = Static163.anInt3374;
			@Pc(239) int local239 = -1;
			for (@Pc(241) int local241 = 0; local241 < Static193.anInt3035; local241++) {
				@Pc(256) int local256 = (Static193.anInt3035 - local241 - 1) * 15 + local87 + 31;
				if (local177 < local233 && local233 < local177 + local93 && local256 - 13 < local237 && local256 + 3 > local237) {
					local239 = local241;
				}
			}
			if (local239 != -1) {
				Static224.method67(local239);
			}
			Static40.aBoolean44 = false;
			Static73.method2567(Static143.anInt2913, Static233.anInt4463, Static126.anInt2534, Static15.anInt284);
			return;
		}
		if (local13 == 1 && Static193.anInt3035 > 0) {
			@Pc(37) short local37 = Static27.aShortArray4[Static193.anInt3035 - 1];
			if (local37 == 20 || local37 == 14 || local37 == 37 || local37 == 51 || local37 == 31 || local37 == 36 || local37 == 30 || local37 == 9 || local37 == 12 || local37 == 42 || local37 == 17 || local37 == 1004) {
				local87 = Static9.anIntArray21[Static193.anInt3035 - 1];
				local93 = Static66.anIntArray109[Static193.anInt3035 - 1];
				@Pc(97) Class93 local97 = Static164.method2725(local93);
				if (Static87.method1370(Static35.method552(local97)) || Static159.method3332(Static35.method552(local97))) {
					Static63.anInt1260 = 0;
					Static177.aBoolean168 = false;
					if (Static9.aClass93_9 != null) {
						Static66.method999(Static9.aClass93_9);
					}
					Static9.aClass93_9 = Static164.method2725(local93);
					Static45.anInt940 = Static70.anInt1323;
					Static58.anInt1155 = local87;
					Static196.anInt3982 = Static163.anInt3374;
					Static66.method999(Static9.aClass93_9);
					return;
				}
			}
		}
		if (local13 == 1 && (Static92.anInt1866 == 1 && Static193.anInt3035 > 2 || Static7.method126(Static193.anInt3035 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static193.anInt3035 > 0) {
			Static224.method67(Static193.anInt3035 - 1);
		}
		if (local13 == 2 && Static193.anInt3035 > 0) {
			Static97.method1525();
			return;
		}
	}
}
