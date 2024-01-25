import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "[Lclient!oo;")
	public static final Class149[] aClass149Array1 = new Class149[29];

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "Z")
	public static boolean aBoolean596 = false;

	@OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
	public static int anInt6889 = -60;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString261 = "slide:";

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V")
	public static void method5714() {
		@Pc(5) byte local5 = 0;
		if (Static58.aBoolean95) {
			local5 = 55;
		}
		Static298.method5062(local5);
		Static266.method4640(local5);
		Static200.method3578(local5);
		Static284.method4852(local5);
		Static87.method1556(local5);
		Static45.method4800(local5);
		Static86.method1553(local5);
		Static32.method3145(local5);
		Static275.method4769(local5);
		if (Static139.anInt3135 == 10) {
			Static233.method3965(28);
		} else if (Static139.anInt3135 == 30) {
			Static233.method3965(25);
			return;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZILclient!vm;Lclient!bl;[Lclient!qs;I)V")
	public static void method5718(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) Class26 arg2, @OriginalArg(4) Class174[] arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17;
		@Pc(31) int local31;
		if (!arg0) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static92.anInt2048; local13++) {
					for (local17 = 0; local17 < Static290.anInt5893; local17++) {
						if ((Static348.aByteArrayArrayArray11[local9][local13][local17] & 0x1) != 0) {
							local31 = local9;
							if ((Static348.aByteArrayArrayArray11[1][local13][local17] & 0x2) != 0) {
								local31 = local9 - 1;
							}
							if (local31 >= 0) {
								arg3[local31].method4668(local13, local17);
							}
						}
					}
				}
			}
		}
		@Pc(77) int[][] local77 = new int[Static92.anInt2048][Static290.anInt5893];
		for (local17 = 0; local17 < arg4; local17++) {
			for (local31 = 0; local31 < Static290.anInt5893; local31++) {
				Static98.anIntArray525[local31] = 0;
				Static336.anIntArray529[local31] = 0;
				Static83.anIntArray174[local31] = 0;
				Static212.anIntArray370[local31] = 0;
				Static217.anIntArray375[local31] = 0;
			}
			for (@Pc(115) int local115 = -5; local115 < Static92.anInt2048; local115++) {
				@Pc(125) int local125;
				@Pc(142) int local142;
				@Pc(205) int local205;
				for (@Pc(119) int local119 = 0; local119 < Static290.anInt5893; local119++) {
					local125 = local115 + 5;
					@Pc(186) int local186;
					if (local125 < Static92.anInt2048) {
						local142 = Static269.aByteArrayArrayArray10[local17][local125][local119] & 0xFF;
						if (local142 > 0) {
							@Pc(150) Class172 local150 = Static128.method2580(local142 - 1);
							Static98.anIntArray525[local119] += local150.anInt5445;
							Static336.anIntArray529[local119] += local150.anInt5442;
							Static83.anIntArray174[local119] += local150.anInt5443;
							Static212.anIntArray370[local119] += local150.anInt5453;
							local186 = Static217.anIntArray375[local119]++;
						}
					}
					local142 = local115 - 5;
					if (local142 >= 0) {
						local205 = Static269.aByteArrayArrayArray10[local17][local142][local119] & 0xFF;
						if (local205 > 0) {
							@Pc(216) Class172 local216 = Static128.method2580(local205 - 1);
							Static98.anIntArray525[local119] -= local216.anInt5445;
							Static336.anIntArray529[local119] -= local216.anInt5442;
							Static83.anIntArray174[local119] -= local216.anInt5443;
							Static212.anIntArray370[local119] -= local216.anInt5453;
							local186 = Static217.anIntArray375[local119]--;
						}
					}
				}
				if (local115 >= 0) {
					local125 = 0;
					local142 = 0;
					local205 = 0;
					@Pc(269) int local269 = 0;
					@Pc(271) int local271 = 0;
					for (@Pc(273) int local273 = -5; local273 < Static290.anInt5893; local273++) {
						@Pc(279) int local279 = local273 + 5;
						if (local279 < Static290.anInt5893) {
							local269 += Static212.anIntArray370[local279];
							local271 += Static217.anIntArray375[local279];
							local205 += Static83.anIntArray174[local279];
							local142 += Static336.anIntArray529[local279];
							local125 += Static98.anIntArray525[local279];
						}
						@Pc(316) int local316 = local273 - 5;
						if (local316 >= 0) {
							local269 -= Static212.anIntArray370[local316];
							local205 -= Static83.anIntArray174[local316];
							local271 -= Static217.anIntArray375[local316];
							local142 -= Static336.anIntArray529[local316];
							local125 -= Static98.anIntArray525[local316];
						}
						if (local273 >= 0 && local269 > 0 && local271 > 0) {
							local77[local115][local273] = Static328.method5397(local142 / local271, local125 * 256 / local269, local205 / local271);
						}
					}
				}
			}
			Static237.method4083(arg0, Static230.aByteArrayArrayArray9[local17], Static307.aClass26Array3[local17], Static92.anInt2048, local17, arg2, arg1, Static217.aByteArrayArrayArray7[local17], Static269.aByteArrayArrayArray10[local17], Static290.anInt5893, local77, Static226.aByteArrayArrayArray8[local17]);
			Static269.aByteArrayArrayArray10[local17] = null;
			Static217.aByteArrayArrayArray7[local17] = null;
			Static226.aByteArrayArrayArray8[local17] = null;
			Static230.aByteArrayArrayArray9[local17] = null;
		}
		if (!arg0) {
			if (Static58.aBoolean95) {
				Static326.method5364();
			}
			if (Static192.anInt4154 != 0) {
				Static321.method5306();
			}
		}
		for (local31 = 0; local31 < arg4; local31++) {
			Static307.aClass26Array3[local31].method5005();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!or;IIII)V")
	public static void method5719(@OriginalArg(0) Class151 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static144.method2828(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static151.anInt3338) {
			Static144.method2828(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static144.method2828(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static220.anInt4569) {
			Static144.method2828(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static220.anInt4569) {
			Static144.method2828(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static151.anInt3338 && arg4 <= Static220.anInt4569) {
			Static144.method2828(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static144.method2828(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static151.anInt3338 && arg4 > 0) {
			Static144.method2828(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
