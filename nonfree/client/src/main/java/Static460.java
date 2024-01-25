import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	public static void method6317() {
		@Pc(9) int local9 = Static429.anInt7994 * 512 + 256;
		@Pc(15) int local15 = Static512.anInt8854 * 512 + 256;
		@Pc(24) int local24 = Static78.method3298(local9, Static594.anInt10310, local15) - Static448.anInt10232;
		if (Static524.anInt9196 < 100) {
			if (Static407.anInt7345 < local9) {
				Static407.anInt7345 += Static524.anInt9196 * (local9 - Static407.anInt7345) / 1000 + Static557.anInt6113;
				if (local9 < Static407.anInt7345) {
					Static407.anInt7345 = local9;
				}
			}
			if (local9 < Static407.anInt7345) {
				Static407.anInt7345 -= (Static407.anInt7345 - local9) * Static524.anInt9196 / 1000 + Static557.anInt6113;
				if (Static407.anInt7345 < local9) {
					Static407.anInt7345 = local9;
				}
			}
			if (local24 > Static335.anInt6057) {
				Static335.anInt6057 += (local24 - Static335.anInt6057) * Static524.anInt9196 / 1000 + Static557.anInt6113;
				if (Static335.anInt6057 > local24) {
					Static335.anInt6057 = local24;
				}
			}
			if (local15 > Static418.anInt7466) {
				Static418.anInt7466 += Static557.anInt6113 + Static524.anInt9196 * (local15 - Static418.anInt7466) / 1000;
				if (Static418.anInt7466 > local15) {
					Static418.anInt7466 = local15;
				}
			}
			if (Static335.anInt6057 > local24) {
				Static335.anInt6057 -= Static557.anInt6113 + (Static335.anInt6057 - local24) * Static524.anInt9196 / 1000;
				if (Static335.anInt6057 < local24) {
					Static335.anInt6057 = local24;
				}
			}
			if (Static418.anInt7466 > local15) {
				Static418.anInt7466 -= (Static418.anInt7466 - local15) * Static524.anInt9196 / 1000 + Static557.anInt6113;
				if (local15 > Static418.anInt7466) {
					Static418.anInt7466 = local15;
				}
			}
		} else {
			Static418.anInt7466 = Static512.anInt8854 * 512 + 256;
			Static407.anInt7345 = Static429.anInt7994 * 512 + 256;
			Static335.anInt6057 = Static78.method3298(Static407.anInt7345, Static594.anInt10310, Static418.anInt7466) - Static448.anInt10232;
		}
		local15 = Static258.anInt5017 * 512 + 256;
		local9 = Static472.anInt8217 * 512 + 256;
		local24 = Static78.method3298(local9, Static594.anInt10310, local15) - Static77.anInt2106;
		@Pc(218) int local218 = local9 - Static407.anInt7345;
		@Pc(222) int local222 = local24 - Static335.anInt6057;
		@Pc(227) int local227 = local15 - Static418.anInt7466;
		@Pc(239) int local239 = (int) Math.sqrt((double) (local218 * local218 + local227 * local227));
		@Pc(250) int local250 = (int) (Math.atan2((double) local222, (double) local239) * 2607.5945876176133D) & 0x3FFF;
		@Pc(261) int local261 = (int) (Math.atan2((double) local218, (double) local227) * -2607.5945876176133D) & 0x3FFF;
		if (local250 < 1024) {
			local250 = 1024;
		}
		if (local250 > 3072) {
			local250 = 3072;
		}
		if (Static568.anInt9808 < local250) {
			Static568.anInt9808 += Static299.anInt5597 + Static15.anInt134 * (local250 - Static568.anInt9808 >> 3) / 1000 << 3;
			if (local250 < Static568.anInt9808) {
				Static568.anInt9808 = local250;
			}
		}
		if (Static568.anInt9808 > local250) {
			Static568.anInt9808 -= Static15.anInt134 * (Static568.anInt9808 - local250 >> 3) / 1000 + Static299.anInt5597 << 3;
			if (Static568.anInt9808 < local250) {
				Static568.anInt9808 = local250;
			}
		}
		@Pc(338) int local338 = local261 - Static421.anInt7497;
		if (local338 > 8192) {
			local338 -= 16384;
		}
		if (local338 < -8192) {
			local338 += 16384;
		}
		local338 >>= 0x3;
		if (local338 > 0) {
			Static421.anInt7497 += Static299.anInt5597 + local338 * Static15.anInt134 / 1000 << 3;
			Static421.anInt7497 &= 0x3FFF;
		}
		if (local338 < 0) {
			Static421.anInt7497 -= Static299.anInt5597 + Static15.anInt134 * -local338 / 1000 << 3;
			Static421.anInt7497 &= 0x3FFF;
		}
		@Pc(396) int local396 = local261 - Static421.anInt7497;
		if (local396 > 8192) {
			local396 -= 16384;
		}
		if (local396 < -8192) {
			local396 += 16384;
		}
		Static528.anInt10345 = 0;
		if (local396 < 0 && local338 > 0 || local396 > 0 && local338 < 0) {
			Static421.anInt7497 = local261;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method6318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static160.method2927(arg6)) {
			return;
		}
		if (Static516.aClass251ArrayArray2[arg6] == null) {
			Static70.method1708(Static449.aClass251ArrayArray1[arg6], -1, arg4, arg1, arg3, arg2, arg5, arg7, arg0, arg8);
		} else {
			Static70.method1708(Static516.aClass251ArrayArray2[arg6], -1, arg4, arg1, arg3, arg2, arg5, arg7, arg0, arg8);
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	public static void method6319(@OriginalArg(0) int arg0) {
		Static289.anInt5399 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static349.anInt6237; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static414.anInt7451; local6++) {
				if (Static189.aClass333ArrayArrayArray1[arg0][local3][local6] == null) {
					Static189.aClass333ArrayArrayArray1[arg0][local3][local6] = new Class333(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([ILclient!pba;I[I[I)V")
	public static void method6320(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class25_Sub2_Sub2_Sub5_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) int local13 = arg0[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg2[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg1.aClass271Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass271Array3[local23] = null;
					} else {
						@Pc(48) Class270 local48 = Static245.aClass155_1.method3820(local13);
						@Pc(51) int local51 = local48.anInt7686;
						@Pc(56) Class271 local56 = arg1.aClass271Array3[local23];
						if (local56 != null) {
							if (local56.anInt7811 == local13) {
								if (local51 == 0) {
									local56 = arg1.aClass271Array3[local23] = null;
								} else if (local51 == 1) {
									local56.anInt7816 = 0;
									local56.anInt7813 = local21;
									local56.anInt7809 = 0;
									local56.anInt7812 = 0;
									local56.anInt7815 = 1;
									if (!arg1.aBoolean578) {
										Static217.method3600(0, arg1, local48);
									}
								} else if (local51 == 2) {
									local56.anInt7812 = 0;
								}
							} else if (local48.anInt7694 >= Static245.aClass155_1.method3820(local56.anInt7811).anInt7694) {
								local56 = arg1.aClass271Array3[local23] = null;
							}
						}
						if (local56 == null) {
							local56 = arg1.aClass271Array3[local23] = new Class271();
							local56.anInt7815 = 1;
							local56.anInt7813 = local21;
							local56.anInt7811 = local13;
							local56.anInt7812 = 0;
							local56.anInt7816 = 0;
							local56.anInt7809 = 0;
							if (!arg1.aBoolean578) {
								Static217.method3600(0, arg1, local48);
							}
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
