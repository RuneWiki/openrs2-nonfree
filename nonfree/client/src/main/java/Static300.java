import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "Z")
	public static boolean aBoolean485;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "Lclient!ps;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "[Lclient!nb;")
	public static Class1_Sub27_Sub1[] aClass1_Sub27_Sub1Array3;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
	public static final int anInt5108 = 1338;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
	public static int anInt5112 = 0;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "Lclient!jq;")
	public static Class1_Sub21 aClass1_Sub21_2 = null;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "[I")
	public static final int[] anIntArray609 = new int[50];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!at;ILclient!tq;)V")
	public static void method4492(@OriginalArg(2) Class17 arg0, @OriginalArg(4) Class164 arg1) {
		Static35.aClass17_8.method205();
		if (Static229.aBoolean380) {
			return;
		}
		for (@Pc(21) Class1_Sub24 local21 = (Class1_Sub24) arg0.method202(); local21 != null; local21 = (Class1_Sub24) arg0.method207()) {
			@Pc(31) Class97 local31 = Static353.aClass249_4.method5522(local21.anInt3616);
			if (Static354.method4948(local31)) {
				@Pc(43) boolean local43 = Static262.method5512(arg1, local21, local31);
				if (local43) {
					Static266.method4094(local31, arg1, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V")
	public static void method4493() {
		if (Static188.aClass135_Sub1_1.method2751(Static25.anInt394) != 2) {
			return;
		}
		@Pc(30) byte local30 = (byte) (Static32.anInt649 - 4 & 0xFF);
		@Pc(34) int local34 = Static32.anInt649 % Static92.anInt1675;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			for (local40 = 0; local40 < Static262.anInt6340; local40++) {
				Static383.aByteArrayArrayArray17[local36][local34][local40] = local30;
			}
		}
		if (Static122.anInt2188 == 3) {
			return;
		}
		for (local40 = 0; local40 < 2; local40++) {
			Static223.anIntArray479[local40] = -1000000;
			Static81.anIntArray196[local40] = 1000000;
			Static275.anIntArray581[local40] = 0;
			Static277.anIntArray586[local40] = 1000000;
			Static371.anIntArray329[local40] = 0;
		}
		@Pc(135) int local135;
		if (Static323.anInt5463 != 1) {
			local135 = Static236.method3260(Static122.anInt2188, Static133.anInt2471, Static256.anInt4409);
			if (local135 - Static337.anInt5598 >= 800 || (Static373.aByteArrayArrayArray16[Static122.anInt2188][Static256.anInt4409 >> 7][Static133.anInt2471 >> 7] & 0x4) == 0) {
				return;
			}
			Static287.method4351(Static25.aClass132ArrayArrayArray1, false, Static256.anInt4409 >> 7, Static133.anInt2471 >> 7, 1);
			return;
		}
		if ((Static373.aByteArrayArrayArray16[Static122.anInt2188][Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7][Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7] & 0x4) != 0) {
			Static287.method4351(Static25.aClass132ArrayArrayArray1, false, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7, Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7, 0);
		}
		if (Static311.anInt5293 >= 2560) {
			return;
		}
		local135 = Static256.anInt4409 >> 7;
		@Pc(139) int local139 = Static133.anInt2471 >> 7;
		@Pc(144) int local144 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7;
		@Pc(149) int local149 = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7;
		@Pc(161) int local161;
		if (local135 >= local144) {
			local161 = local135 - local144;
		} else {
			local161 = local144 - local135;
		}
		@Pc(180) int local180;
		if (local149 <= local139) {
			local180 = local139 - local149;
		} else {
			local180 = local149 - local139;
		}
		if ((local161 != 0 || local180 != 0) && local161 > -Static92.anInt1675 && Static92.anInt1675 > local161 && -Static262.anInt6340 < local180 && Static262.anInt6340 > local180) {
			@Pc(260) int local260;
			@Pc(262) int local262;
			if (local161 <= local180) {
				local260 = local161 * 65536 / local180;
				local262 = 32768;
				while (local139 != local149) {
					if (local139 < local149) {
						local139++;
					} else if (local139 > local149) {
						local139--;
					}
					if ((Static373.aByteArrayArrayArray16[Static122.anInt2188][local135][local139] & 0x4) != 0) {
						Static287.method4351(Static25.aClass132ArrayArrayArray1, false, local135, local139, 1);
						return;
					}
					local262 += local260;
					if (local262 >= 65536) {
						local262 -= 65536;
						if (local135 < local144) {
							local135++;
						} else if (local135 > local144) {
							local135--;
						}
						if ((Static373.aByteArrayArrayArray16[Static122.anInt2188][local135][local139] & 0x4) != 0) {
							Static287.method4351(Static25.aClass132ArrayArrayArray1, false, local135, local139, 1);
							return;
						}
					}
				}
				return;
			}
			local260 = local180 * 65536 / local161;
			local262 = 32768;
			while (local135 != local144) {
				if (local144 > local135) {
					local135++;
				} else if (local144 < local135) {
					local135--;
				}
				if ((Static373.aByteArrayArrayArray16[Static122.anInt2188][local135][local139] & 0x4) != 0) {
					Static287.method4351(Static25.aClass132ArrayArrayArray1, false, local135, local139, 1);
					return;
				}
				local262 += local260;
				if (local262 >= 65536) {
					local262 -= 65536;
					if (local139 < local149) {
						local139++;
					} else if (local149 < local139) {
						local139--;
					}
					if ((Static373.aByteArrayArrayArray16[Static122.anInt2188][local135][local139] & 0x4) != 0) {
						Static287.method4351(Static25.aClass132ArrayArrayArray1, false, local135, local139, 1);
						return;
					}
				}
			}
			return;
		}
		Static62.method1006(null, "RC: " + local135 + "," + local139 + " " + local144 + "," + local149 + " " + Static256.anInt4410 + "," + Static293.anInt5053);
		return;
	}
}
