import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "Z")
	public static boolean aBoolean71;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
	public static int anInt1382;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "[I")
	public static final int[] anIntArray131 = new int[500];

	@OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
	public static int anInt1386 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ[Lclient!dc;I[S)V")
	public static void method1043(@OriginalArg(0) int arg0, @OriginalArg(2) Class20[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(24) int local24 = (arg2 + arg0) / 2;
		@Pc(26) int local26 = arg0;
		@Pc(30) Class20 local30 = arg1[local24];
		arg1[local24] = arg1[arg2];
		arg1[arg2] = local30;
		@Pc(44) short local44 = arg3[local24];
		arg3[local24] = arg3[arg2];
		arg3[arg2] = local44;
		for (@Pc(56) int local56 = arg0; local56 < arg2; local56++) {
			if (local30 == null || arg1[local56] != null && arg1[local56].method562(local30) < (local56 & 0x1)) {
				@Pc(86) Class20 local86 = arg1[local56];
				arg1[local56] = arg1[local26];
				arg1[local26] = local86;
				@Pc(100) short local100 = arg3[local56];
				arg3[local56] = arg3[local26];
				arg3[local26++] = local100;
			}
		}
		arg1[arg2] = arg1[local26];
		arg1[local26] = local30;
		arg3[arg2] = arg3[local26];
		arg3[local26] = local44;
		method1043(arg0, arg1, local26 - 1, arg3);
		method1043(local26 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B[B)V")
	public static void method1045(@OriginalArg(1) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (arg0.length > local7) {
				@Pc(23) int local23 = (arg0[local7++] & 0xFF) * 64 - Static207.anInt4070;
				@Pc(35) int local35 = (arg0[local7++] & 0xFF) * 64 - Static59.anInt1331;
				@Pc(82) byte local82;
				@Pc(60) int local60;
				if (local23 > 0 && local35 > 0 && Static131.anInt2727 > local23 + 64 && Static165.anInt2257 > local35 + 64) {
					local60 = local23 >> 6;
					@Pc(69) int local69 = Static165.anInt2257 - local35 - 1 >> 6;
					for (@Pc(71) int local71 = 0; local71 < 64; local71++) {
						for (@Pc(75) int local75 = -64; local75 < 0; local75++) {
							local82 = arg0[local7++];
							if (local82 != 0) {
								if (Static200.aByteArrayArrayArray15[local60][local69] == null) {
									Static200.aByteArrayArrayArray15[local60][local69] = new byte[4096];
								}
								Static200.aByteArrayArrayArray15[local60][local69][(-(local75 + 1) << 6) + local71] = local82;
								@Pc(122) byte local122 = arg0[local7++];
								if (Static94.aByteArrayArrayArray7[local60][local69] == null) {
									Static94.aByteArrayArrayArray7[local60][local69] = new byte[4096];
								}
								Static94.aByteArrayArrayArray7[local60][local69][(-(local75 + 1) << 6) + local71] = local122;
							}
						}
					}
				} else {
					for (local60 = -4096; local60 < 0; local60++) {
						local82 = arg0[local7++];
						if (local82 != 0) {
							local7++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lclient!cg;")
	public static Class5_Sub2_Sub7 method1046(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub7 local10 = (Class5_Sub2_Sub7) Static51.aClass8_11.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static10.aClass23_7.method738(Static151.method2316(arg0), Static122.method1925(arg0));
		local10 = new Class5_Sub2_Sub7();
		local10.anInt542 = arg0;
		if (local28 != null) {
			local10.method426(new Class5_Sub6(local28));
		}
		local10.method428();
		if (local10.aBoolean25) {
			local10.anInt548 = 0;
			local10.aBoolean27 = false;
		}
		if (!Static57.aBoolean70 && local10.aBoolean26) {
			local10.aClass20Array2 = null;
		}
		Static51.aClass8_11.method232((long) arg0, local10);
		return local10;
	}
}
