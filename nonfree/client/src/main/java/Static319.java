import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
	public static final int[] anIntArray534 = new int[50];

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	public static int anInt5487 = -1;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
	public static int anInt5496 = 0;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	public static int anInt5497 = 0;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
	public static final int[] anIntArray535 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "[I")
	public static final int[] anIntArray536 = new int[64];

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
	public static int anInt5498 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZI)I")
	public static int method4374(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(CZ)Z")
	public static boolean method4375(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIII)V")
	public static void method4376(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(6) Class40_Sub4 local6 = (Class40_Sub4) Static124.aClass240_1.method5227(); local6 != null; local6 = (Class40_Sub4) Static124.aClass240_1.method5230()) {
			if (local6.anInt4016 <= Static400.anInt6752) {
				local6.method4364();
			} else {
				Static444.method5933(local6.anInt4023, (local6.anInt4022 << 7) + 64, local6.anInt4021 * 2, arg2 >> 1, arg1 >> 1, (local6.anInt4017 << 7) + 64);
				Static330.aClass57_3.method5953(Static394.anIntArray650[0] + arg0, local6.aString32, local6.anInt4015 | 0xFF000000, Static394.anIntArray650[1] + arg3, 0);
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public static void method4377() {
		if (Static361.aClass85_Sub1_1.method2111(Static423.anInt7114) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static186.anInt3747 - 4 & 0xFF);
		@Pc(25) int local25 = Static186.anInt3747 % Static2.anInt7;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static17.anInt315; local31++) {
				Static255.aByteArrayArrayArray16[local27][local25][local31] = local21;
			}
		}
		if (Static96.anInt1983 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static328.anIntArray701[local31] = -1000000;
			Static372.anIntArray624[local31] = 1000000;
			Static64.anIntArray96[local31] = 0;
			Static370.anIntArray619[local31] = 1000000;
			Static314.anIntArray517[local31] = 0;
		}
		@Pc(103) int local103;
		if (Static157.anInt3176 != 1) {
			local103 = Static326.method4459(Static96.anInt1983, Static80.anInt1679, Static50.anInt906);
			if (local103 - Static8.anInt121 < 800 && (Static181.aByteArrayArrayArray15[Static96.anInt1983][Static80.anInt1679 >> 7][Static50.anInt906 >> 7] & 0x4) != 0) {
				Static436.method5772(Static50.anInt906 >> 7, Static309.aClass11ArrayArrayArray2, false, 1, Static80.anInt1679 >> 7);
				return;
			}
			return;
		}
		if ((Static181.aByteArrayArrayArray15[Static96.anInt1983][Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7][Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7] & 0x4) != 0) {
			Static436.method5772(Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7, Static309.aClass11ArrayArrayArray2, false, 0, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7);
		}
		if (Static127.anInt2604 >= 2560) {
			return;
		}
		local103 = Static80.anInt1679 >> 7;
		@Pc(182) int local182 = Static50.anInt906 >> 7;
		@Pc(187) int local187 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7;
		@Pc(192) int local192 = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7;
		@Pc(200) int local200;
		if (local103 < local187) {
			local200 = local187 - local103;
		} else {
			local200 = local103 - local187;
		}
		@Pc(219) int local219;
		if (local192 > local182) {
			local219 = local192 - local182;
		} else {
			local219 = local182 - local192;
		}
		if (local200 == 0 && local219 == 0 || local200 <= -Static2.anInt7 || Static2.anInt7 <= local200 || -Static17.anInt315 >= local219 || Static17.anInt315 <= local219) {
			Static432.method5720("RC: " + local103 + "," + local182 + " " + local187 + "," + local192 + " " + Static168.anInt3353 + "," + Static72.anInt1488, null);
			return;
		}
		@Pc(296) int local296;
		@Pc(298) int local298;
		if (local200 <= local219) {
			local296 = local200 * 65536 / local219;
			local298 = 32768;
			while (local192 != local182) {
				if (local192 > local182) {
					local182++;
				} else if (local192 < local182) {
					local182--;
				}
				if ((Static181.aByteArrayArrayArray15[Static96.anInt1983][local103][local182] & 0x4) != 0) {
					Static436.method5772(local182, Static309.aClass11ArrayArrayArray2, false, 1, local103);
					return;
				}
				local298 += local296;
				if (local298 >= 65536) {
					local298 -= 65536;
					if (local103 < local187) {
						local103++;
					} else if (local187 < local103) {
						local103--;
					}
					if ((Static181.aByteArrayArrayArray15[Static96.anInt1983][local103][local182] & 0x4) != 0) {
						Static436.method5772(local182, Static309.aClass11ArrayArrayArray2, false, 1, local103);
						return;
					}
				}
			}
			return;
		}
		local296 = local219 * 65536 / local200;
		local298 = 32768;
		while (local103 != local187) {
			if (local103 < local187) {
				local103++;
			} else if (local103 > local187) {
				local103--;
			}
			if ((Static181.aByteArrayArrayArray15[Static96.anInt1983][local103][local182] & 0x4) != 0) {
				Static436.method5772(local182, Static309.aClass11ArrayArrayArray2, false, 1, local103);
				return;
			}
			local298 += local296;
			if (local298 >= 65536) {
				local298 -= 65536;
				if (local182 < local192) {
					local182++;
				} else if (local192 < local182) {
					local182--;
				}
				if ((Static181.aByteArrayArrayArray15[Static96.anInt1983][local103][local182] & 0x4) != 0) {
					Static436.method5772(local182, Static309.aClass11ArrayArrayArray2, false, 1, local103);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!l;ILjava/awt/Canvas;Lclient!lt;B)Lclient!za;")
	public static Class50 method4378(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) Class159 arg4) {
		return new Class50_Sub1(arg2, arg3, arg1, arg0, arg4);
	}
}
