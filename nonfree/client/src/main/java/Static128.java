import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array4;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "[I")
	public static final int[] anIntArray535 = new int[1000];

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	public static final int anInt2624 = 52;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "[I")
	public static final int[] anIntArray536 = new int[13];

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	public static int anInt2630 = -1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
	public static void method2522(@OriginalArg(1) int arg0) {
		Static209.method3515();
		@Pc(11) int local11 = Static215.aClass114_1.method2843(arg0).anInt4344;
		if (local11 == 0) {
			return;
		}
		@Pc(28) int local28 = Static321.aClass211_1.anIntArray1019[arg0];
		if (local11 == 6) {
			Static50.anInt1032 = local28;
		}
		if (local11 == 5) {
			Static267.anInt4642 = local28;
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)I")
	public static int method2524() {
		return 2;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method2527() {
		if (Static84.method1290() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static196.anInt4050 - 4 & 0xFF);
		@Pc(23) int local23 = Static196.anInt4050 % Static246.anInt4374;
		@Pc(34) int local34;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local34 = 0; local34 < Static185.anInt3485; local34++) {
				Static68.aByteArrayArrayArray1[local25][local23][local34] = local19;
			}
		}
		if (Static382.anInt6523 == 3) {
			return;
		}
		for (local34 = 0; local34 < 2; local34++) {
			Static9.anIntArray76[local34] = -1000000;
			Static356.anIntArray1261[local34] = 1000000;
			Static297.anIntArray1008[local34] = 0;
			Static86.anIntArray361[local34] = 1000000;
			Static167.anIntArray1056[local34] = 0;
		}
		@Pc(135) int local135;
		if (Static79.anInt4624 != 1) {
			local135 = Static170.method3006(Static224.anInt4006, Static51.anInt1057, Static382.anInt6523);
			if (local135 - Static285.anInt4940 >= 800 || (Static96.aByteArrayArrayArray8[Static382.anInt6523][Static224.anInt4006 >> 7][Static51.anInt1057 >> 7] & 0x4) == 0) {
				return;
			}
			Static65.method4155(Static64.aClass251ArrayArrayArray1, Static51.anInt1057 >> 7, Static224.anInt4006 >> 7, false, 1);
			return;
		}
		if ((Static96.aByteArrayArrayArray8[Static382.anInt6523][Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7][Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7] & 0x4) != 0) {
			Static65.method4155(Static64.aClass251ArrayArrayArray1, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7, false, 0);
		}
		if (Static14.anInt360 >= 2560) {
			return;
		}
		local135 = Static224.anInt4006 >> 7;
		@Pc(139) int local139 = Static51.anInt1057 >> 7;
		@Pc(144) int local144 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7;
		@Pc(149) int local149 = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7;
		@Pc(157) int local157;
		if (local135 < local144) {
			local157 = local144 - local135;
		} else {
			local157 = local135 - local144;
		}
		@Pc(176) int local176;
		if (local139 < local149) {
			local176 = local149 - local139;
		} else {
			local176 = local139 - local149;
		}
		if ((local157 != 0 || local176 != 0) && local157 > -Static246.anInt4374 && Static246.anInt4374 > local157 && -Static185.anInt3485 < local176 && local176 < Static185.anInt3485) {
			@Pc(248) int local248;
			@Pc(250) int local250;
			if (local176 >= local157) {
				local248 = local157 * 65536 / local176;
				local250 = 32768;
				while (local139 != local149) {
					if (local139 < local149) {
						local139++;
					} else if (local149 < local139) {
						local139--;
					}
					if ((Static96.aByteArrayArrayArray8[Static382.anInt6523][local135][local139] & 0x4) != 0) {
						Static65.method4155(Static64.aClass251ArrayArrayArray1, local139, local135, false, 1);
						return;
					}
					local250 += local248;
					if (local250 >= 65536) {
						if (local144 > local135) {
							local135++;
						} else if (local144 < local135) {
							local135--;
						}
						local250 -= 65536;
						if ((Static96.aByteArrayArrayArray8[Static382.anInt6523][local135][local139] & 0x4) != 0) {
							Static65.method4155(Static64.aClass251ArrayArrayArray1, local139, local135, false, 1);
							return;
						}
					}
				}
				return;
			}
			local248 = local176 * 65536 / local157;
			local250 = 32768;
			while (local135 != local144) {
				if (local135 < local144) {
					local135++;
				} else if (local135 > local144) {
					local135--;
				}
				if ((Static96.aByteArrayArrayArray8[Static382.anInt6523][local135][local139] & 0x4) != 0) {
					Static65.method4155(Static64.aClass251ArrayArrayArray1, local139, local135, false, 1);
					return;
				}
				local250 += local248;
				if (local250 >= 65536) {
					if (local139 < local149) {
						local139++;
					} else if (local139 > local149) {
						local139--;
					}
					local250 -= 65536;
					if ((Static96.aByteArrayArrayArray8[Static382.anInt6523][local135][local139] & 0x4) != 0) {
						Static65.method4155(Static64.aClass251ArrayArrayArray1, local139, local135, false, 1);
						return;
					}
				}
			}
			return;
		}
		Static142.method2676(null, "RC: " + local135 + "," + local139 + " " + local144 + "," + local149 + " " + Static28.anInt606 + "," + Static319.anInt5425);
		return;
	}
}
