import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!in", name = "v", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_58 = new Class93("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!in", name = "w", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!in", name = "x", descriptor = "[I")
	public static final int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!in", name = "y", descriptor = "Z")
	public static final boolean aBoolean251 = false;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V")
	public static void method2767() {
		@Pc(1) Class119 local1 = Static296.aClass119_182;
		synchronized (Static296.aClass119_182) {
			Static296.aClass119_182.method3304();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIZI)V")
	public static void method2768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg4; local7++) {
			Static205.method3670(arg2, arg3, Static146.anIntArrayArray91[local7], arg0);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIZIILclient!p;I)Z")
	public static boolean method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class151 arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg4 - 64;
		@Pc(23) int local23 = arg3 - 64;
		Static350.anIntArrayArray185[64][64] = 99;
		Static130.anIntArrayArray137[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static256.anIntArray386[0] = arg4;
		@Pc(51) int local51 = local42 + 1;
		Static104.anIntArray408[0] = arg3;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray128;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(82) int local82;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(242) int local242;
				@Pc(285) int local285;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static81.anInt1750 = local7;
									Static251.anInt4951 = local9;
									return false;
								}
								local7 = Static256.anIntArray386[local44];
								local9 = Static104.anIntArray408[local44];
								local71 = local7 - local18;
								local44 = local44 + 1 & 0xFFF;
								local82 = local9 - local23;
								local88 = local7 - arg9.anInt4563;
								local94 = local9 - arg9.anInt4572;
								if (arg8 == -4) {
									if (local7 == arg10 && arg2 == local9) {
										Static251.anInt4951 = local9;
										Static81.anInt1750 = local7;
										return true;
									}
								} else if (arg8 == -3) {
									if (Static263.method4787(arg0, local9, arg1, arg10, arg6, arg1, local7, arg2)) {
										Static251.anInt4951 = local9;
										Static81.anInt1750 = local7;
										return true;
									}
								} else if (arg8 == -2) {
									if (arg9.method4098(arg6, arg7, arg0, arg1, arg10, local9, arg1, local7, arg2)) {
										Static81.anInt1750 = local7;
										Static251.anInt4951 = local9;
										return true;
									}
								} else if (arg8 == -1) {
									if (arg9.method4103(arg7, arg10, arg0, arg6, arg1, local7, local9, arg2)) {
										Static81.anInt1750 = local7;
										Static251.anInt4951 = local9;
										return true;
									}
								} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
									if (arg9.method4105(local7, local9, arg2, arg1, arg10, arg8, arg5)) {
										Static251.anInt4951 = local9;
										Static81.anInt1750 = local7;
										return true;
									}
								} else if (arg9.method4100(arg2, local9, arg8, arg10, arg1, local7, arg5)) {
									Static81.anInt1750 = local7;
									Static251.anInt4951 = local9;
									return true;
								}
								local242 = Static130.anIntArrayArray137[local71][local82] + 1;
								if (local71 > 0 && Static350.anIntArrayArray185[local71 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + arg1 - 1] & 0x4E240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg1 - 1) {
											Static256.anIntArray386[local51] = local7 - 1;
											Static104.anIntArray408[local51] = local9;
											Static350.anIntArrayArray185[local71 - 1][local82] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static130.anIntArrayArray137[local71 - 1][local82] = local242;
											break;
										}
										if ((local56[local88 - 1][local94 + local285] & 0x4FA40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local71 < 128 - arg1 && Static350.anIntArrayArray185[local71 + 1][local82] == 0 && (local56[local88 + arg1][local94] & 0x60E40000) == 0 && (local56[local88 + arg1][arg1 + local94 - 1] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (arg1 - 1 <= local285) {
											Static256.anIntArray386[local51] = local7 + 1;
											Static104.anIntArray408[local51] = local9;
											Static350.anIntArrayArray185[local71 + 1][local82] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static130.anIntArrayArray137[local71 + 1][local82] = local242;
											break;
										}
										if ((local56[arg1 + local88][local285 + local94] & 0x78E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local82 > 0 && Static350.anIntArrayArray185[local71][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[arg1 + local88 - 1][local94 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg1 - 1) {
											Static256.anIntArray386[local51] = local7;
											Static104.anIntArray408[local51] = local9 - 1;
											Static350.anIntArrayArray185[local71][local82 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static130.anIntArrayArray137[local71][local82 - 1] = local242;
											break;
										}
										if ((local56[local285 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local82 < 128 - arg1 && Static350.anIntArrayArray185[local71][local82 + 1] == 0 && (local56[local88][local94 + arg1] & 0x4E240000) == 0 && (local56[arg1 + local88 - 1][arg1 + local94] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (arg1 - 1 <= local285) {
											Static256.anIntArray386[local51] = local7;
											Static104.anIntArray408[local51] = local9 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static350.anIntArrayArray185[local71][local82 + 1] = 4;
											Static130.anIntArrayArray137[local71][local82 + 1] = local242;
											break;
										}
										if ((local56[local285 + local88][arg1 + local94] & 0x7E240000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local71 > 0 && local82 > 0 && Static350.anIntArrayArray185[local71 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local285 = 1;
									while (true) {
										if (arg1 <= local285) {
											Static256.anIntArray386[local51] = local7 - 1;
											Static104.anIntArray408[local51] = local9 - 1;
											Static350.anIntArrayArray185[local71 - 1][local82 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static130.anIntArrayArray137[local71 - 1][local82 - 1] = local242;
											break;
										}
										if ((local56[local88 - 1][local94 + local285 - 1] & 0x4FA40000) != 0 || (local56[local88 + local285 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (128 - arg1 > local71 && local82 > 0 && Static350.anIntArrayArray185[local71 + 1][local82 - 1] == 0 && (local56[arg1 + local88][local94 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg1) {
											Static256.anIntArray386[local51] = local7 + 1;
											Static104.anIntArray408[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static350.anIntArrayArray185[local71 + 1][local82 - 1] = 9;
											Static130.anIntArrayArray137[local71 + 1][local82 - 1] = local242;
											break;
										}
										if ((local56[local88 + arg1][local94 + local285 - 1] & 0x78E40000) != 0 || (local56[local285 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local71 > 0 && 128 - arg1 > local82 && Static350.anIntArrayArray185[local71 - 1][local82 + 1] == 0 && (local56[local88 - 1][arg1 + local94] & 0x4E240000) == 0) {
									for (local285 = 1; local285 < arg1; local285++) {
										if ((local56[local88 - 1][local285 + local94] & 0x4FA40000) != 0 || (local56[local88 + local285 - 1][arg1 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static256.anIntArray386[local51] = local7 - 1;
									Static104.anIntArray408[local51] = local9 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static350.anIntArrayArray185[local71 - 1][local82 + 1] = 6;
									Static130.anIntArrayArray137[local71 - 1][local82 + 1] = local242;
								}
							} while (128 - arg1 <= local71);
						} while (128 - arg1 <= local82);
					} while (Static350.anIntArrayArray185[local71 + 1][local82 + 1] != 0);
				} while ((local56[local88 + arg1][arg1 + local94] & 0x78240000) != 0);
				for (local285 = 1; local285 < arg1; local285++) {
					if ((local56[local88 + local285][arg1 + local94] & 0x7E240000) != 0 || (local56[local88 + arg1][local94 + local285] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static256.anIntArray386[local51] = local7 + 1;
				Static104.anIntArray408[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static350.anIntArrayArray185[local71 + 1][local82 + 1] = 12;
				Static130.anIntArrayArray137[local71 + 1][local82 + 1] = local242;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(Z)V")
	public static void method2770() {
		Static218.anIntArray332 = Static134.method2690(0.4F);
	}
}
