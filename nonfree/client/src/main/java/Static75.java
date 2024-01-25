import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
	public static int anInt1880 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public static void method1766() {
		if (Static455.aClass3_Sub27_Sub1_1.method4048(Static275.anInt5823) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static453.anInt8598 - 4 & 0xFF);
		@Pc(23) int local23 = Static453.anInt8598 % Static460.anInt8640;
		@Pc(28) int local28;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local28 = 0; local28 < Static292.anInt7682; local28++) {
				Static570.aByteArrayArrayArray20[local25][local23][local28] = local19;
			}
		}
		if (Static212.anInt4380 == 3) {
			return;
		}
		for (local28 = 0; local28 < 2; local28++) {
			Static429.anIntArray509[local28] = -1000000;
			Static331.anIntArray443[local28] = 1000000;
			Static539.anIntArray649[local28] = 0;
			Static260.anIntArray333[local28] = 1000000;
			Static364.anIntArray461[local28] = 0;
		}
		@Pc(99) int local99;
		if (Static267.anInt5668 != 1) {
			local99 = Static274.method4782(Static496.anInt9269, Static212.anInt4380, Static594.anInt10391);
			if (local99 - Static360.anInt1771 < 3200 && (Static576.aByteArrayArrayArray21[Static212.anInt4380][Static594.anInt10391 >> 9][Static496.anInt9269 >> 9] & 0x4) != 0) {
				Static204.method3391(Static580.aClass125ArrayArrayArray3, false, Static594.anInt10391 >> 9, Static496.anInt9269 >> 9, 1);
				return;
			}
			return;
		}
		if ((Static576.aByteArrayArrayArray21[Static212.anInt4380][Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9][Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9] & 0x4) != 0) {
			Static204.method3391(Static580.aClass125ArrayArrayArray3, false, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9, 0);
		}
		if (Static522.anInt9554 >= 2560) {
			return;
		}
		local99 = Static594.anInt10391 >> 9;
		@Pc(180) int local180 = Static496.anInt9269 >> 9;
		@Pc(185) int local185 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9;
		@Pc(190) int local190 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9;
		@Pc(198) int local198;
		if (local99 < local185) {
			local198 = local185 - local99;
		} else {
			local198 = local99 - local185;
		}
		@Pc(212) int local212;
		if (local180 < local190) {
			local212 = local190 - local180;
		} else {
			local212 = local180 - local190;
		}
		if (local198 == 0 && local212 == 0 || -Static460.anInt8640 >= local198 || local198 >= Static460.anInt8640 || -Static292.anInt7682 >= local212 || local212 >= Static292.anInt7682) {
			Static468.method7192("RC: " + local99 + "," + local180 + " " + local185 + "," + local190 + " " + Static230.anInt4667 + "," + Static563.anInt10006, null);
			return;
		}
		@Pc(290) int local290;
		@Pc(292) int local292;
		if (local212 >= local198) {
			local290 = local198 * 65536 / local212;
			local292 = 32768;
			while (local180 != local190) {
				if (local180 < local190) {
					local180++;
				} else if (local180 > local190) {
					local180--;
				}
				if ((Static576.aByteArrayArrayArray21[Static212.anInt4380][local99][local180] & 0x4) != 0) {
					Static204.method3391(Static580.aClass125ArrayArrayArray3, false, local99, local180, 1);
					return;
				}
				local292 += local290;
				if (local292 >= 65536) {
					if (local99 < local185) {
						local99++;
					} else if (local185 < local99) {
						local99--;
					}
					local292 -= 65536;
					if ((Static576.aByteArrayArrayArray21[Static212.anInt4380][local99][local180] & 0x4) != 0) {
						Static204.method3391(Static580.aClass125ArrayArrayArray3, false, local99, local180, 1);
						return;
					}
				}
			}
			return;
		}
		local290 = local212 * 65536 / local198;
		local292 = 32768;
		while (local185 != local99) {
			if (local99 < local185) {
				local99++;
			} else if (local99 > local185) {
				local99--;
			}
			if ((Static576.aByteArrayArrayArray21[Static212.anInt4380][local99][local180] & 0x4) != 0) {
				Static204.method3391(Static580.aClass125ArrayArrayArray3, false, local99, local180, 1);
				return;
			}
			local292 += local290;
			if (local292 >= 65536) {
				if (local180 < local190) {
					local180++;
				} else if (local190 < local180) {
					local180--;
				}
				local292 -= 65536;
				if ((Static576.aByteArrayArrayArray21[Static212.anInt4380][local99][local180] & 0x4) != 0) {
					Static204.method3391(Static580.aClass125ArrayArrayArray3, false, local99, local180, 1);
					return;
				}
			}
		}
	}
}
