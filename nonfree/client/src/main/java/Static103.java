import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "Lclient!qha;")
	public static final Class291 aClass291_7 = new Class291(8);

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "Lclient!up;")
	public static final Class357 aClass357_2 = new Class357();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
	public static void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(20) int local20 = arg3 * arg3;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = local24 << 1;
		@Pc(32) int local32 = local20 << 1;
		@Pc(36) int local36 = arg0 << 1;
		@Pc(45) int local45 = (1 - local36) * local20 + local28;
		@Pc(54) int local54 = local24 - local32 * (local36 - 1);
		@Pc(58) int local58 = local20 << 2;
		@Pc(62) int local62 = local24 << 2;
		@Pc(70) int local70 = local28 * 3;
		@Pc(78) int local78 = ((arg0 << 1) - 3) * local32;
		@Pc(84) int local84 = local62;
		Static646.method7025(Static569.anIntArrayArray54[arg2], arg4 - arg3, arg3 + arg4, arg1);
		@Pc(103) int local103 = (arg0 - 1) * local58;
		while (local9 > 0) {
			if (local45 < 0) {
				while (local45 < 0) {
					local54 += local84;
					local45 += local70;
					local7++;
					local70 += local62;
					local84 += local62;
				}
			}
			if (local54 < 0) {
				local45 += local70;
				local54 += local84;
				local7++;
				local84 += local62;
				local70 += local62;
			}
			local45 += -local103;
			local54 += -local78;
			local103 -= local58;
			local9--;
			local78 -= local58;
			@Pc(182) int local182 = arg2 - local9;
			@Pc(187) int local187 = arg2 + local9;
			@Pc(191) int local191 = local7 + arg4;
			@Pc(196) int local196 = arg4 - local7;
			Static646.method7025(Static569.anIntArrayArray54[local182], local196, local191, arg1);
			Static646.method7025(Static569.anIntArrayArray54[local187], local196, local191, arg1);
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)Z")
	public static boolean method1468(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!ha;IILclient!cn;IIILclient!aa;)V")
	public static void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class73 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(10) Class315 local10 = Static2.aClass33_1.method657(arg6);
		if (local10 == null || !local10.aBoolean675 || !local10.method7598(Static413.aClass118_1)) {
			return;
		}
		@Pc(36) int local36;
		if (local10.anIntArray514 != null) {
			@Pc(34) int[] local34 = new int[local10.anIntArray514.length];
			@Pc(52) int local52;
			@Pc(63) int local63;
			@Pc(67) int local67;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static79.anInt1216 == 4) {
					local52 = (int) Static429.aFloat132 & 0x3FFF;
				} else {
					local52 = Static609.anInt10107 + (int) Static429.aFloat132 & 0x3FFF;
				}
				local63 = Class5_Sub12.anIntArray544[local52];
				local67 = Class5_Sub12.anIntArray543[local52];
				if (Static79.anInt1216 != 4) {
					local63 = local63 * 256 / (Static438.anInt7509 + 256);
					local67 = local67 * 256 / (Static438.anInt7509 + 256);
				}
				local34[local36 * 2] = (local63 * (local10.anIntArray514[local36 * 2 + 1] * 4 + arg3) + (local10.anIntArray514[local36 * 2] * 4 + arg0) * local67 >> 14) + arg4.anInt1384 / 2 + arg2;
				local34[local36 * 2 + 1] = arg5 + arg4.anInt1394 / 2 - (local67 * (arg3 + local10.anIntArray514[local36 * 2 + 1] * 4) - (local10.anIntArray514[local36 * 2] * 4 + arg0) * local63 >> 14);
			}
			Static146.method2063(arg1, local34, local10.anInt8881, arg4.anIntArray61, arg4.anIntArray68);
			if (local10.anInt8891 <= 0) {
				for (local52 = 0; local52 < local34.length / 2 - 1; local52++) {
					arg1.method7691(local34[local52 * 2], local34[local52 * 2 + 1], local34[local52 * 2 + 2], local34[local52 * 2 + 1 + 2], local10.anIntArray515[local10.aByteArray83[local52] & 0xFF], arg7, arg2, arg5);
				}
				arg1.method7691(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local10.anIntArray515[local10.aByteArray83[local10.aByteArray83.length - 1] & 0xFF], arg7, arg2, arg5);
			} else {
				@Pc(331) int local331;
				@Pc(341) int local341;
				@Pc(364) int local364;
				@Pc(376) int local376;
				for (local52 = 0; local52 < local34.length / 2 - 1; local52++) {
					local63 = local34[local52 * 2];
					local67 = local34[local52 * 2 + 1];
					local331 = local34[(local52 + 1) * 2];
					local341 = local34[local52 * 2 + 2 + 1];
					if (local331 < local63) {
						local364 = local63;
						local63 = local331;
						local376 = local67;
						local67 = local341;
						local331 = local364;
						local341 = local376;
					} else if (local331 == local63 && local341 < local67) {
						local364 = local67;
						local67 = local341;
						local341 = local364;
					}
					arg1.method7684(local63, local67, local331, local341, local10.anIntArray515[local10.aByteArray83[local52] & 0xFF], arg7, arg2, arg5, local10.anInt8891, local10.anInt8901, local10.anInt8870);
				}
				local63 = local34[local34.length - 2];
				local67 = local34[local34.length - 1];
				local331 = local34[0];
				local341 = local34[1];
				if (local331 < local63) {
					local364 = local63;
					local63 = local331;
					local376 = local67;
					local331 = local364;
					local67 = local341;
					local341 = local376;
				} else if (local331 == local63 && local67 > local341) {
					local364 = local67;
					local67 = local341;
					local341 = local364;
				}
				arg1.method7684(local63, local67, local331, local341, local10.anIntArray515[local10.aByteArray83[local10.aByteArray83.length - 1] & 0xFF], arg7, arg2, arg5, local10.anInt8891, local10.anInt8901, local10.anInt8870);
			}
		}
		@Pc(504) Class134 local504 = null;
		if (local10.anInt8895 != -1) {
			local504 = local10.method7606(false, arg1);
			if (local504 != null) {
				Static27.method453(arg5, arg4, local504, arg2, arg7, arg3, arg0);
			}
		}
		if (local10.aString116 == null) {
			return;
		}
		local36 = 0;
		if (local504 != null) {
			local36 = local504.method9219();
		}
		@Pc(540) Class80 local540 = Static41.aClass80_2;
		@Pc(542) Class224 local542 = Static473.aClass224_10;
		if (local10.anInt8903 == 1) {
			local542 = Static570.aClass224_11;
			local540 = Static582.aClass80_12;
		}
		if (local10.anInt8903 == 2) {
			local542 = Static594.aClass224_12;
			local540 = Static533.aClass80_10;
		}
		Static124.method1753(local542, local10.aString116, arg4, local540, arg5, local10.anInt8886, arg2, arg0, arg3, arg7, local36);
	}
}
