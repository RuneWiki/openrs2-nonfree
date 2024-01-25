import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!cb;")
	public static Class50 aClass50_76;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Z")
	public static final boolean aBoolean292 = false;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public static void method3866() {
		for (@Pc(6) Class5_Sub27 local6 = (Class5_Sub27) Static298.aClass335_23.method7768(); local6 != null; local6 = (Class5_Sub27) Static298.aClass335_23.method7777()) {
			if (local6.aClass104_Sub1_1.method2091()) {
				Static314.method4802(local6.anInt3825);
			} else {
				local6.aClass104_Sub1_1.method2102();
				try {
					local6.aClass104_Sub1_1.method2087();
				} catch (@Pc(27) Exception local27) {
					Static17.method268("TV: " + local6.anInt3825, local27);
					Static314.method4802(local6.anInt3825);
				}
				if (!local6.aBoolean262 && !local6.aBoolean263) {
					@Pc(55) Class5_Sub1_Sub2 local55 = local6.aClass104_Sub1_1.method2090();
					if (local55 != null) {
						@Pc(61) Class5_Sub14_Sub2 local61 = local55.method5853();
						if (local61 != null) {
							local61.method1694(local6.anInt3824);
							Static229.aClass5_Sub14_Sub3_1.method2298(local61);
							local6.aBoolean262 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public static void method3867() {
		@Pc(25) int local25 = Static514.anInt8683 * 512 + 256;
		@Pc(31) int local31 = Static293.anInt4550 * 512 + 256;
		@Pc(40) int local40 = Static161.method1246(Static458.anInt7955, local31, local25) - Static92.anInt1528;
		if (Static69.anInt1063 < 100) {
			if (local25 > Static570.anInt9347) {
				Static570.anInt9347 += Static552.anInt10277 + Static69.anInt1063 * (local25 - Static570.anInt9347) / 1000;
				if (local25 < Static570.anInt9347) {
					Static570.anInt9347 = local25;
				}
			}
			if (Static570.anInt9347 > local25) {
				Static570.anInt9347 -= (Static570.anInt9347 - local25) * Static69.anInt1063 / 1000 + Static552.anInt10277;
				if (local25 > Static570.anInt9347) {
					Static570.anInt9347 = local25;
				}
			}
			if (local40 > Static546.anInt8938) {
				Static546.anInt8938 += (local40 - Static546.anInt8938) * Static69.anInt1063 / 1000 + Static552.anInt10277;
				if (Static546.anInt8938 > local40) {
					Static546.anInt8938 = local40;
				}
			}
			if (local31 > Static105.anInt1868) {
				Static105.anInt1868 += (local31 - Static105.anInt1868) * Static69.anInt1063 / 1000 + Static552.anInt10277;
				if (Static105.anInt1868 > local31) {
					Static105.anInt1868 = local31;
				}
			}
			if (Static546.anInt8938 > local40) {
				Static546.anInt8938 -= Static552.anInt10277 + Static69.anInt1063 * (Static546.anInt8938 - local40) / 1000;
				if (local40 > Static546.anInt8938) {
					Static546.anInt8938 = local40;
				}
			}
			if (local31 < Static105.anInt1868) {
				Static105.anInt1868 -= Static552.anInt10277 + Static69.anInt1063 * (Static105.anInt1868 - local31) / 1000;
				if (local31 > Static105.anInt1868) {
					Static105.anInt1868 = local31;
				}
			}
		} else {
			Static105.anInt1868 = Static293.anInt4550 * 512 + 256;
			Static570.anInt9347 = Static514.anInt8683 * 512 + 256;
			Static546.anInt8938 = Static161.method1246(Static458.anInt7955, Static105.anInt1868, Static570.anInt9347) - Static92.anInt1528;
		}
		local31 = Static144.anInt10373 * 512 + 256;
		local25 = Static345.anInt6197 * 512 + 256;
		local40 = Static161.method1246(Static458.anInt7955, local31, local25) - Static310.anInt5525;
		@Pc(230) int local230 = local25 - Static570.anInt9347;
		@Pc(234) int local234 = local40 - Static546.anInt8938;
		@Pc(238) int local238 = local31 - Static105.anInt1868;
		@Pc(249) int local249 = (int) Math.sqrt((double) (local230 * local230 + local238 * local238));
		@Pc(260) int local260 = (int) (Math.atan2((double) local234, (double) local249) * 2607.5945876176133D) & 0x3FFF;
		if (local260 < 1024) {
			local260 = 1024;
		}
		@Pc(278) int local278 = (int) (-2607.5945876176133D * Math.atan2((double) local230, (double) local238)) & 0x3FFF;
		if (local260 > 3072) {
			local260 = 3072;
		}
		if (local260 > Static498.anInt8495) {
			Static498.anInt8495 += Static19.anInt269 * (local260 - Static498.anInt8495 >> 3) / 1000 + Static394.anInt6803 << 3;
			if (local260 < Static498.anInt8495) {
				Static498.anInt8495 = local260;
			}
		}
		if (Static498.anInt8495 > local260) {
			Static498.anInt8495 -= Static19.anInt269 * (Static498.anInt8495 - local260 >> 3) / 1000 + Static394.anInt6803 << 3;
			if (Static498.anInt8495 < local260) {
				Static498.anInt8495 = local260;
			}
		}
		@Pc(343) int local343 = local278 - Static493.anInt8442;
		if (local343 > 8192) {
			local343 -= 16384;
		}
		if (local343 < -8192) {
			local343 += 16384;
		}
		local343 >>= 0x3;
		if (local343 > 0) {
			Static493.anInt8442 += local343 * Static19.anInt269 / 1000 + Static394.anInt6803 << 3;
			Static493.anInt8442 &= 0x3FFF;
		}
		if (local343 < 0) {
			Static493.anInt8442 -= -local343 * Static19.anInt269 / 1000 + Static394.anInt6803 << 3;
			Static493.anInt8442 &= 0x3FFF;
		}
		@Pc(402) int local402 = local278 - Static493.anInt8442;
		if (local402 > 8192) {
			local402 -= 16384;
		}
		if (local402 < -8192) {
			local402 += 16384;
		}
		Static78.anInt1274 = 0;
		if (local402 < 0 && local343 > 0 || local402 > 0 && local343 < 0) {
			Static493.anInt8442 = local278;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBLclient!aba;ILclient!fda;IIIIIII)V")
	public static void method3868(@OriginalArg(0) int arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class112 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static509.anInt5959 = arg6;
		Static272.aClass4_10 = arg1;
		Static594.aClass112_18 = arg3;
		Static292.anInt4547 = arg7;
		Static405.anInt6984 = arg8;
		Static561.anInt9150 = arg4;
		Static82.aClass301_1 = null;
		Static526.anInt8724 = arg5;
		Static366.anInt6507 = arg2;
		Static425.anInt7565 = arg10;
		Static174.anInt2874 = arg9;
		Static270.aClass301_2 = null;
		Static602.anInt9871 = arg0;
		Static613.aClass301_3 = null;
		Static192.method2758();
		Static215.aBoolean245 = true;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	public static void method3871() {
		Static254.method3575(-1, 255);
	}
}
