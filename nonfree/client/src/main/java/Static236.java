import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public static int anInt1712 = 0;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt1713 = 0;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	public static int anInt1714 = -1;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZIIIIIIII)V")
	public static void method1276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		for (local7 = 0; local7 < 104; local7++) {
			for (local12 = 0; local12 < 104; local12++) {
				Static145.anIntArrayArray77[local7][local12] = 0;
				Static133.anIntArrayArray36[local7][local12] = 99999999;
			}
		}
		Static145.anIntArrayArray77[arg2][arg1] = 99;
		Static133.anIntArrayArray36[arg2][arg1] = 0;
		local7 = arg2;
		@Pc(53) byte local53 = 0;
		Static78.anIntArray189[0] = arg2;
		local12 = arg1;
		@Pc(62) int local62 = local53 + 1;
		Static134.anIntArray290[0] = arg1;
		@Pc(66) int local66 = 0;
		@Pc(71) int[][] local71 = Static82.aClass75Array1[Static185.anInt4085].anIntArrayArray30;
		@Pc(73) boolean local73 = false;
		@Pc(198) int local198;
		while (local66 != local62) {
			local12 = Static134.anIntArray290[local66];
			local7 = Static78.anIntArray189[local66];
			local66 = local66 + 1 & 0xFFF;
			if (arg6 == local7 && local12 == arg4) {
				local73 = true;
				break;
			}
			if (arg0 != 0) {
				if ((arg0 < 5 || arg0 == 10) && Static82.aClass75Array1[Static185.anInt4085].method1826(arg4, arg0 - 1, 1, arg6, arg7, local12, local7)) {
					local73 = true;
					break;
				}
				if (arg0 < 10 && Static82.aClass75Array1[Static185.anInt4085].method1825(arg6, arg4, arg0 - 1, local7, local12, arg7, 1)) {
					local73 = true;
					break;
				}
			}
			if (arg3 != 0 && arg5 != 0 && Static82.aClass75Array1[Static185.anInt4085].method1824(arg5, arg6, local7, arg4, arg3, 1, arg8, local12)) {
				local73 = true;
				break;
			}
			local198 = Static133.anIntArrayArray36[local7][local12] + 1;
			if (local7 > 0 && Static145.anIntArrayArray77[local7 - 1][local12] == 0 && (local71[local7 - 1][local12] & 0x2C0108) == 0) {
				Static78.anIntArray189[local62] = local7 - 1;
				Static134.anIntArray290[local62] = local12;
				local62 = local62 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local7 - 1][local12] = 2;
				Static133.anIntArrayArray36[local7 - 1][local12] = local198;
			}
			if (local7 < 103 && Static145.anIntArrayArray77[local7 + 1][local12] == 0 && (local71[local7 + 1][local12] & 0x2C0180) == 0) {
				Static78.anIntArray189[local62] = local7 + 1;
				Static134.anIntArray290[local62] = local12;
				Static145.anIntArrayArray77[local7 + 1][local12] = 8;
				local62 = local62 + 1 & 0xFFF;
				Static133.anIntArrayArray36[local7 + 1][local12] = local198;
			}
			if (local12 > 0 && Static145.anIntArrayArray77[local7][local12 - 1] == 0 && (local71[local7][local12 - 1] & 0x2C0102) == 0) {
				Static78.anIntArray189[local62] = local7;
				Static134.anIntArray290[local62] = local12 - 1;
				Static145.anIntArrayArray77[local7][local12 - 1] = 1;
				Static133.anIntArrayArray36[local7][local12 - 1] = local198;
				local62 = local62 + 1 & 0xFFF;
			}
			if (local12 < 103 && Static145.anIntArrayArray77[local7][local12 + 1] == 0 && (local71[local7][local12 + 1] & 0x2C0120) == 0) {
				Static78.anIntArray189[local62] = local7;
				Static134.anIntArray290[local62] = local12 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local7][local12 + 1] = 4;
				Static133.anIntArrayArray36[local7][local12 + 1] = local198;
			}
			if (local7 > 0 && local12 > 0 && Static145.anIntArrayArray77[local7 - 1][local12 - 1] == 0 && (local71[local7 - 1][local12 - 1] & 0x2C010E) == 0 && (local71[local7 - 1][local12] & 0x2C0108) == 0 && (local71[local7][local12 - 1] & 0x2C0102) == 0) {
				Static78.anIntArray189[local62] = local7 - 1;
				Static134.anIntArray290[local62] = local12 - 1;
				Static145.anIntArrayArray77[local7 - 1][local12 - 1] = 3;
				local62 = local62 + 1 & 0xFFF;
				Static133.anIntArrayArray36[local7 - 1][local12 - 1] = local198;
			}
			if (local7 < 103 && local12 > 0 && Static145.anIntArrayArray77[local7 + 1][local12 - 1] == 0 && (local71[local7 + 1][local12 - 1] & 0x2C0183) == 0 && (local71[local7 + 1][local12] & 0x2C0180) == 0 && (local71[local7][local12 - 1] & 0x2C0102) == 0) {
				Static78.anIntArray189[local62] = local7 + 1;
				Static134.anIntArray290[local62] = local12 - 1;
				Static145.anIntArrayArray77[local7 + 1][local12 - 1] = 9;
				local62 = local62 + 1 & 0xFFF;
				Static133.anIntArrayArray36[local7 + 1][local12 - 1] = local198;
			}
			if (local7 > 0 && local12 < 103 && Static145.anIntArrayArray77[local7 - 1][local12 + 1] == 0 && (local71[local7 - 1][local12 + 1] & 0x2C0138) == 0 && (local71[local7 - 1][local12] & 0x2C0108) == 0 && (local71[local7][local12 + 1] & 0x2C0120) == 0) {
				Static78.anIntArray189[local62] = local7 - 1;
				Static134.anIntArray290[local62] = local12 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local7 - 1][local12 + 1] = 6;
				Static133.anIntArrayArray36[local7 - 1][local12 + 1] = local198;
			}
			if (local7 < 103 && local12 < 103 && Static145.anIntArrayArray77[local7 + 1][local12 + 1] == 0 && (local71[local7 + 1][local12 + 1] & 0x2C01E0) == 0 && (local71[local7 + 1][local12] & 0x2C0180) == 0 && (local71[local7][local12 + 1] & 0x2C0120) == 0) {
				Static78.anIntArray189[local62] = local7 + 1;
				Static134.anIntArray290[local62] = local12 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static145.anIntArrayArray77[local7 + 1][local12 + 1] = 12;
				Static133.anIntArrayArray36[local7 + 1][local12 + 1] = local198;
			}
		}
		if (!local73) {
			local198 = 1000;
			@Pc(820) int local820 = 100;
			for (@Pc(827) int local827 = arg6 - 10; local827 <= arg6 + 10; local827++) {
				for (@Pc(837) int local837 = arg4 - 10; local837 <= arg4 + 10; local837++) {
					if (local827 >= 0 && local837 >= 0 && local827 < 104 && local837 < 104 && Static133.anIntArrayArray36[local827][local837] < 100) {
						@Pc(872) int local872 = 0;
						if (arg4 > local837) {
							local872 = arg4 - local837;
						} else if (arg5 + arg4 - 1 < local837) {
							local872 = local837 + 1 - arg5 - arg4;
						}
						@Pc(904) int local904 = 0;
						if (arg6 > local827) {
							local904 = arg6 - local827;
						} else if (arg3 + arg6 - 1 < local827) {
							local904 = local827 + 1 - arg6 - arg3;
						}
						@Pc(947) int local947 = local904 * local904 + local872 * local872;
						if (local198 > local947 || local947 == local198 && local820 > Static133.anIntArrayArray36[local827][local837]) {
							local12 = local837;
							local820 = Static133.anIntArrayArray36[local827][local837];
							local198 = local947;
							local7 = local827;
						}
					}
				}
			}
			if (local198 == 1000) {
				return;
			}
			if (arg2 == local7 && local12 == arg1) {
				return;
			}
		}
		Static280.anInt5624 = local7;
		Static240.aBoolean314 = false;
		Static259.anInt5240 = local12;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!hb;B)V")
	public static void method1277(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		@Pc(12) int local12 = arg1.anInt2208;
		@Pc(16) int local16 = (int) arg1.aLong247;
		arg1.method4767();
		if (arg0) {
			Static283.method4313(local12);
		}
		Static13.method342(local12);
		@Pc(32) Class191 local32 = Static171.method2789(local16);
		if (local32 != null) {
			Static40.method817(local32);
		}
		@Pc(41) int local41 = Static181.anInt3973;
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41; local43++) {
			if (Static316.method4772(Static86.aShortArray64[local43])) {
				Static117.method3399(local43);
			}
		}
		if (Static181.anInt3973 == 1) {
			Static128.aBoolean171 = false;
			Static155.method2520(Static96.anInt2211, Static303.anInt6021, Static60.anInt1307, Static175.anInt266);
		} else {
			Static155.method2520(Static96.anInt2211, Static303.anInt6021, Static60.anInt1307, Static175.anInt266);
			local43 = Static176.aClass1_Sub3_Sub5_2.method3510(Static8.aString19);
			for (@Pc(89) int local89 = 0; local89 < Static181.anInt3973; local89++) {
				@Pc(104) int local104 = Static176.aClass1_Sub3_Sub5_2.method3510(Static56.method1051(local89));
				if (local43 < local104) {
					local43 = local104;
				}
			}
			Static175.anInt266 = (Static161.aBoolean230 ? 26 : 22) + Static181.anInt3973 * 15;
			Static60.anInt1307 = local43 + 8;
		}
		if (Static36.anInt902 != -1) {
			Static82.method1413(Static36.anInt902, 1);
		}
	}
}
