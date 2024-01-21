import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!sh", name = "eb", descriptor = "Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5 aClass1_Sub3_Sub1_Sub5_4;

	@OriginalMember(owner = "client!sh", name = "Z", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1740 = Static187.method3089("Loading title screen )2 ");

	@OriginalMember(owner = "client!sh", name = "X", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1739 = aClass92_1740;

	@OriginalMember(owner = "client!sh", name = "db", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!sh", name = "fb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1741 = Static187.method3089("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!sh", name = "gb", descriptor = "[I")
	public static final int[] anIntArray313 = new int[100];

	@OriginalMember(owner = "client!sh", name = "hb", descriptor = "[I")
	public static final int[] anIntArray314 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!sh", name = "ib", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1742 = aClass92_1741;

	@OriginalMember(owner = "client!sh", name = "lb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1745 = Static187.method3089("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!sh", name = "jb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1743 = aClass92_1745;

	@OriginalMember(owner = "client!sh", name = "kb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1744 = Static187.method3089("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
	public static void method2714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= Static102.anInt2207 && Static116.anInt2488 >= arg0 && Static118.anInt2521 <= arg5 && arg3 <= Static204.anInt2389) {
			if (arg1 == 1) {
				Static50.method2313(arg0, arg4, arg2, arg5, arg3);
			} else {
				Static114.method1705(arg5, arg2, arg0, arg3, arg4, arg1);
			}
		} else if (arg1 == 1) {
			Static56.method925(arg3, arg2, arg0, arg5, arg4);
		} else {
			Static91.method1350(arg0, arg3, arg5, arg4, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ca;)V")
	public static void method2715(@OriginalArg(0) Class16 arg0) {
		for (@Pc(2) int local2 = arg0.anInt536; local2 <= arg0.anInt547; local2++) {
			for (@Pc(6) int local6 = arg0.anInt540; local6 <= arg0.anInt537; local6++) {
				@Pc(16) Class1_Sub17 local16 = Static179.aClass1_Sub17ArrayArrayArray1[arg0.anInt546][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt2380; local20++) {
						if (local16.aClass16Array3[local20] == arg0) {
							local16.anInt2380--;
							for (local35 = local20; local35 < local16.anInt2380; local35++) {
								local16.aClass16Array3[local35] = local16.aClass16Array3[local35 + 1];
								local16.anIntArray178[local35] = local16.anIntArray178[local35 + 1];
							}
							local16.aClass16Array3[local16.anInt2380] = null;
							break;
						}
					}
					local16.anInt2385 = 0;
					for (local35 = 0; local35 < local16.anInt2380; local35++) {
						local16.anInt2385 |= local16.anIntArray178[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
	public static void method2717(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static186.aBooleanArray16[arg0]) {
			return;
		}
		Static177.aClass3_35.method3261(arg0);
		if (Static194.aClass11ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < Static194.aClass11ArrayArray1[arg0].length; local31++) {
			if (Static194.aClass11ArrayArray1[arg0][local31] != null) {
				if (Static194.aClass11ArrayArray1[arg0][local31].anInt326 == 2) {
					local29 = false;
				} else {
					Static194.aClass11ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local29) {
			Static194.aClass11ArrayArray1[arg0] = null;
		}
		Static186.aBooleanArray16[arg0] = false;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z[B)V")
	public static void method2718(@OriginalArg(1) byte[] arg0) {
		@Pc(13) int local13 = 0;
		while (true) {
			while (arg0.length > local13) {
				@Pc(26) int local26 = (arg0[local13++] & 0xFF) * 64 - Static150.anInt3065;
				@Pc(38) int local38 = (arg0[local13++] & 0xFF) * 64 - Static52.anInt1305;
				@Pc(84) byte local84;
				@Pc(63) int local63;
				if (local26 > 0 && local38 > 0 && Static90.anInt1950 > local26 + 64 && local38 + 64 < Static35.anInt988) {
					local63 = local26 >> 6;
					@Pc(71) int local71 = Static35.anInt988 - local38 - 1 >> 6;
					for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
						for (@Pc(77) int local77 = -64; local77 < 0; local77++) {
							local84 = arg0[local13++];
							if (local84 != 0) {
								if (Static64.aByteArrayArrayArray17[local63][local71] == null) {
									Static64.aByteArrayArrayArray17[local63][local71] = new byte[4096];
								}
								Static64.aByteArrayArrayArray17[local63][local71][local73 + (-(local77 + 1) << 6)] = local84;
								@Pc(119) byte local119 = arg0[local13++];
								if (Static164.aByteArrayArrayArray40[local63][local71] == null) {
									Static164.aByteArrayArrayArray40[local63][local71] = new byte[4096];
								}
								Static164.aByteArrayArrayArray40[local63][local71][(-(local77 + 1) << 6) + local73] = local119;
							}
						}
					}
				} else {
					for (local63 = -4096; local63 < 0; local63++) {
						local84 = arg0[local13++];
						if (local84 != 0) {
							local13++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)I")
	public static int method2719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
