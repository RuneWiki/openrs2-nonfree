import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!nm;")
	public static Class138 aClass138_3;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Z")
	public static boolean aBoolean130;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!ra;")
	public static Class170 aClass170_36;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public static final int anInt1965 = -13423323;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
	public static void method1806() {
		if (Static5.aFloat2 < 1024.0F) {
			Static5.aFloat2 = 1024.0F;
		}
		while (Static155.aFloat64 >= 16384.0F) {
			Static155.aFloat64 -= 16384.0F;
		}
		if (Static5.aFloat2 > 3072.0F) {
			Static5.aFloat2 = 3072.0F;
		}
		while (Static155.aFloat64 < 0.0F) {
			Static155.aFloat64 += 16384.0F;
		}
		@Pc(41) int local41 = Static259.anInt3210 >> 7;
		@Pc(45) int local45 = Static64.anInt1546 >> 7;
		@Pc(56) int local56 = Static66.method1393(Static64.anInt1546, Static156.anInt3123, Static259.anInt3210);
		@Pc(58) int local58 = 0;
		@Pc(76) int local76;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local76 = local41 - 4; local76 <= local41 + 4; local76++) {
				for (@Pc(82) int local82 = local45 - 4; local82 <= local45 + 4; local82++) {
					@Pc(86) int local86 = Static156.anInt3123;
					if (local86 < 3 && Static105.method2140(local82, local76)) {
						local86++;
					}
					@Pc(97) int local97 = 0;
					if (Static54.aByteArrayArrayArray6 != null && Static54.aByteArrayArrayArray6[local86] != null) {
						local97 = (Static54.aByteArrayArrayArray6[local86][local76][local82] & 0xFF) * 8;
					}
					@Pc(128) int local128 = local56 + local97 - Static130.aClass3Array2[local86].method5638(local76, local82);
					if (local58 < local128) {
						local58 = local128;
					}
				}
			}
		}
		local76 = local58 * 1536;
		if (local76 > 786432) {
			local76 = 786432;
		}
		if (local76 < 262144) {
			local76 = 262144;
		}
		if (Static288.anInt5540 < local76) {
			Static288.anInt5540 += (local76 - Static288.anInt5540) / 24;
		} else if (Static288.anInt5540 > local76) {
			Static288.anInt5540 += (local76 - Static288.anInt5540) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	public static void method1808(@OriginalArg(1) byte arg0) {
		if (Static293.aByteArrayArrayArray25 == null) {
			Static293.aByteArrayArrayArray25 = new byte[4][Static266.anInt5101][Static339.anInt6352];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static266.anInt5101; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static339.anInt6352; local22++) {
					Static293.aByteArrayArrayArray25[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
	public static boolean method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static189.method3465(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static49.method1101(local10 + 1, Static130.aClass3Array2[arg0].method5638(arg1, arg2) + arg3, local14 + 1) && Static49.method1101(local10 + 128 - 1, Static130.aClass3Array2[arg0].method5638(arg1 + 1, arg2) + arg3, local14 + 1) && Static49.method1101(local10 + 128 - 1, Static130.aClass3Array2[arg0].method5638(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static49.method1101(local10 + 1, Static130.aClass3Array2[arg0].method5638(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	public static void method1812(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub9_Sub16 local12 = Static239.method4052(14, arg0);
		local12.method4138();
	}
}
