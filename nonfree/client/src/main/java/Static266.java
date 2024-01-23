import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_10;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public static int anInt5000;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	public static int anInt5004;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Z")
	public static boolean aBoolean331 = true;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public static int anInt4997 = 0;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[I")
	public static int[] anIntArray447 = new int[200];

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public static void method3995() {
		anIntArray447 = null;
		aClass4_Sub2_Sub1_10 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
	public static void method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class145 local3 = new Class145();
		local3.anInt4480 = arg1 / 128;
		local3.anInt4473 = arg2 / 128;
		local3.anInt4465 = arg3 / 128;
		local3.anInt4466 = arg4 / 128;
		local3.anInt4476 = arg0;
		local3.anInt4481 = arg1;
		local3.anInt4457 = arg2;
		local3.anInt4477 = arg3;
		local3.anInt4479 = arg4;
		local3.anInt4478 = arg5;
		local3.anInt4470 = arg6;
		Static237.aClass145Array2[Static241.anInt4625++] = local3;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!p;I)V")
	public static void method3997(@OriginalArg(0) Class4_Sub17 arg0) {
		label122: while (true) {
			if (arg0.aByteArray30.length > arg0.anInt2400) {
				@Pc(18) int local18 = 0;
				@Pc(20) boolean local20 = false;
				@Pc(22) int local22 = 0;
				if (arg0.method1874() == 1) {
					local20 = true;
					local18 = arg0.method1874();
					local22 = arg0.method1874();
				}
				@Pc(41) int local41 = arg0.method1874();
				@Pc(45) int local45 = arg0.method1874();
				@Pc(56) int local56 = Static132.anInt2785 + Static92.anInt1912 - local45 * 64 - 1;
				@Pc(63) int local63 = local41 * 64 - Static81.anInt4033;
				@Pc(85) int local85;
				@Pc(89) int local89;
				if (local63 >= 0 && local56 - 63 >= 0 && local63 + 63 < Static269.anInt5031 && Static92.anInt1912 > local56) {
					local85 = local63 >> 6;
					local89 = local56 >> 6;
					@Pc(91) int local91 = 0;
					while (true) {
						if (local91 >= 64) {
							continue label122;
						}
						for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
							if (!local20 || local18 * 8 <= local91 && local91 < local18 * 8 + 8 && local22 * 8 <= local98 && local22 * 8 + 8 > local98) {
								@Pc(147) int local147 = arg0.method1874();
								if (local147 != 0) {
									@Pc(163) int local163;
									if ((local147 & 0x1) == 1) {
										local163 = arg0.method1874();
										if (Static121.aByteArrayArrayArray6[local85][local89] == null) {
											Static121.aByteArrayArrayArray6[local85][local89] = new byte[4096];
										}
										Static121.aByteArrayArrayArray6[local85][local89][(63 - local98 << 6) + local91] = (byte) local163;
									}
									if ((local147 & 0x2) == 2) {
										local163 = arg0.method1835();
										if (Static290.anIntArrayArrayArray14[local85][local89] == null) {
											Static290.anIntArrayArrayArray14[local85][local89] = new int[4096];
										}
										Static290.anIntArrayArrayArray14[local85][local89][(63 - local98 << 6) + local91] = local163;
									}
									if ((local147 & 0x4) == 4) {
										local163 = arg0.method1835();
										if (Static214.anIntArrayArrayArray10[local85][local89] == null) {
											Static214.anIntArrayArrayArray10[local85][local89] = new int[4096];
										}
										local163--;
										@Pc(259) Class47 local259 = Static170.method2683(local163);
										if (local259.anIntArray142 != null) {
											local259 = local259.method1096();
											if (local259 == null || local259.anInt1365 == -1) {
												continue;
											}
										}
										Static214.anIntArrayArrayArray10[local85][local89][local91 + (63 - local98 << 6)] = local259.anInt1366 + 1;
										@Pc(299) Class4_Sub13 local299 = new Class4_Sub13();
										local299.anInt1187 = local63;
										local299.anInt1182 = local259.anInt1365;
										local299.anInt1184 = local56;
										Static131.aClass10_29.method184(local299);
									}
								}
							}
						}
						local91++;
					}
				}
				local85 = 0;
				while (true) {
					if (local85 >= (local20 ? 64 : 4096)) {
						continue label122;
					}
					local89 = arg0.method1874();
					if (local89 != 0) {
						if ((local89 & 0x1) == 1) {
							arg0.anInt2400++;
						}
						if ((local89 & 0x2) == 2) {
							arg0.anInt2400 += 2;
						}
						if ((local89 & 0x4) == 4) {
							arg0.anInt2400 += 3;
						}
					}
					local85++;
				}
			}
			return;
		}
	}
}
