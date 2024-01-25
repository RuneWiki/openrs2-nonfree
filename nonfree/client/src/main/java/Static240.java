import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method4259() {
		@Pc(1) Class198 local1 = Static88.aClass198_76;
		synchronized (Static88.aClass198_76) {
			Static88.aClass198_76.method5209();
		}
		local1 = Static28.aClass198_241;
		synchronized (Static28.aClass198_241) {
			Static28.aClass198_241.method5209();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public static void method4264() {
		if (Static200.anInt4144 != 3) {
			Static215.anInt4413 = -1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4265(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static15.aClass4_Sub11_Sub1_2.method706(234);
			Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(arg0));
			Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZB)V")
	public static void method4266(@OriginalArg(0) boolean arg0) {
		Static77.aBoolean143 = arg0;
		@Pc(13) int local13;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(46) int local46;
		@Pc(52) int local52;
		@Pc(56) int local56;
		@Pc(166) int local166;
		@Pc(177) int local177;
		@Pc(185) int local185;
		if (!Static77.aBoolean143) {
			local13 = Static127.aClass4_Sub11_Sub1_3.method3401();
			@Pc(22) boolean local22 = Static127.aClass4_Sub11_Sub1_3.method3413() == 1;
			@Pc(26) int local26 = Static127.aClass4_Sub11_Sub1_3.method3412();
			local30 = Static127.aClass4_Sub11_Sub1_3.method3451();
			local34 = Static127.aClass4_Sub11_Sub1_3.method3415();
			local38 = Static127.aClass4_Sub11_Sub1_3.method3453();
			local46 = (Static133.anInt3104 - Static127.aClass4_Sub11_Sub1_3.anInt3768) / 16;
			Static90.anIntArrayArray63 = new int[local46][4];
			for (local52 = 0; local52 < local46; local52++) {
				for (local56 = 0; local56 < 4; local56++) {
					Static90.anIntArrayArray63[local52][local56] = Static127.aClass4_Sub11_Sub1_3.method3425();
				}
			}
			local56 = Static127.aClass4_Sub11_Sub1_3.method3412();
			Static135.method2881(local30);
			Static224.aByteArrayArray18 = new byte[local46][];
			Static247.anIntArray418 = new int[local46];
			Static293.aByteArrayArray16 = new byte[local46][];
			Static65.aByteArrayArray4 = new byte[local46][];
			Static332.anIntArray490 = new int[local46];
			Static184.anIntArray327 = new int[local46];
			Static155.anIntArray297 = new int[local46];
			Static261.aByteArrayArray20 = null;
			Static83.anIntArray202 = new int[local46];
			Static189.anIntArray337 = null;
			Static115.aByteArrayArray13 = new byte[local46][];
			@Pc(120) boolean local120 = false;
			if ((local13 / 8 == 48 || local13 / 8 == 49) && (local56 / 8) == 48) {
				local120 = true;
			}
			local46 = 0;
			if (local13 / 8 == 48 && local56 / 8 == 148) {
				local120 = true;
			}
			for (local166 = (local13 - (Static350.anInt6637 >> 4)) / 8; local166 <= (local13 + (Static350.anInt6637 >> 4)) / 8; local166++) {
				for (local177 = (local56 - (Static105.anInt2647 >> 4)) / 8; local177 <= ((Static105.anInt2647 >> 4) + local56) / 8; local177++) {
					local185 = (local166 << 8) + local177;
					if (local120 && (local177 == 49 || local177 == 149 || local177 == 147 || local166 == 50 || local166 == 49 && local177 == 47)) {
						Static155.anIntArray297[local46] = local185;
						Static247.anIntArray418[local46] = -1;
						Static83.anIntArray202[local46] = -1;
						Static332.anIntArray490[local46] = -1;
						Static184.anIntArray327[local46] = -1;
					} else {
						Static155.anIntArray297[local46] = local185;
						Static247.anIntArray418[local46] = Static287.aClass193_77.method5066("m" + local166 + "_" + local177);
						Static83.anIntArray202[local46] = Static287.aClass193_77.method5066("l" + local166 + "_" + local177);
						Static332.anIntArray490[local46] = Static287.aClass193_77.method5066("um" + local166 + "_" + local177);
						Static184.anIntArray327[local46] = Static287.aClass193_77.method5066("ul" + local166 + "_" + local177);
					}
					local46++;
				}
			}
			Static120.method2528(local34, local22, local56, local13, false, local38, local26);
			return;
		}
		local13 = Static127.aClass4_Sub11_Sub1_3.method3453();
		@Pc(356) int local356 = Static127.aClass4_Sub11_Sub1_3.method3440();
		@Pc(367) boolean local367 = Static127.aClass4_Sub11_Sub1_3.method3453() == 1;
		local30 = Static127.aClass4_Sub11_Sub1_3.method3415();
		local34 = Static127.aClass4_Sub11_Sub1_3.method3401();
		local38 = Static127.aClass4_Sub11_Sub1_3.method3401();
		local46 = Static127.aClass4_Sub11_Sub1_3.method3415();
		Static135.method2881(local13);
		Static127.aClass4_Sub11_Sub1_3.method705();
		@Pc(399) int local399;
		for (local52 = 0; local52 < 4; local52++) {
			for (local56 = 0; local56 < Static350.anInt6637 >> 3; local56++) {
				for (local399 = 0; local399 < Static105.anInt2647 >> 3; local399++) {
					local166 = Static127.aClass4_Sub11_Sub1_3.method711(1);
					if (local166 == 1) {
						Static345.anIntArrayArrayArray41[local52][local56][local399] = Static127.aClass4_Sub11_Sub1_3.method711(26);
					} else {
						Static345.anIntArrayArrayArray41[local52][local56][local399] = -1;
					}
				}
			}
		}
		Static127.aClass4_Sub11_Sub1_3.method712();
		local56 = (Static133.anInt3104 - Static127.aClass4_Sub11_Sub1_3.anInt3768) / 16;
		Static90.anIntArrayArray63 = new int[local56][4];
		for (local399 = 0; local399 < local56; local399++) {
			for (local166 = 0; local166 < 4; local166++) {
				Static90.anIntArrayArray63[local399][local166] = Static127.aClass4_Sub11_Sub1_3.method3418();
			}
		}
		Static155.anIntArray297 = new int[local56];
		Static224.aByteArrayArray18 = new byte[local56][];
		Static184.anIntArray327 = new int[local56];
		Static293.aByteArrayArray16 = new byte[local56][];
		Static261.aByteArrayArray20 = null;
		Static115.aByteArrayArray13 = new byte[local56][];
		Static247.anIntArray418 = new int[local56];
		Static332.anIntArray490 = new int[local56];
		Static189.anIntArray337 = null;
		Static83.anIntArray202 = new int[local56];
		Static65.aByteArrayArray4 = new byte[local56][];
		local56 = 0;
		for (local166 = 0; local166 < 4; local166++) {
			for (local177 = 0; local177 < Static350.anInt6637 >> 3; local177++) {
				for (local185 = 0; local185 < Static105.anInt2647 >> 3; local185++) {
					@Pc(546) int local546 = Static345.anIntArrayArrayArray41[local166][local177][local185];
					if (local546 != -1) {
						@Pc(555) int local555 = local546 >> 14 & 0x3FF;
						@Pc(561) int local561 = local546 >> 3 & 0x7FF;
						@Pc(571) int local571 = local561 / 8 + (local555 / 8 << 8);
						for (@Pc(573) int local573 = 0; local573 < local56; local573++) {
							if (Static155.anIntArray297[local573] == local571) {
								local571 = -1;
								break;
							}
						}
						if (local571 != -1) {
							Static155.anIntArray297[local56] = local571;
							@Pc(601) int local601 = local571 >> 8 & 0xFF;
							@Pc(605) int local605 = local571 & 0xFF;
							Static247.anIntArray418[local56] = Static287.aClass193_77.method5066("m" + local601 + "_" + local605);
							Static83.anIntArray202[local56] = Static287.aClass193_77.method5066("l" + local601 + "_" + local605);
							Static332.anIntArray490[local56] = Static287.aClass193_77.method5066("um" + local601 + "_" + local605);
							Static184.anIntArray327[local56] = Static287.aClass193_77.method5066("ul" + local601 + "_" + local605);
							local56++;
						}
					}
				}
			}
		}
		Static120.method2528(local34, local367, local30, local46, false, local356, local38);
	}
}
