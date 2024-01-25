import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_45 = new Class236(59, -1);

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	public static final int anInt4419 = 0;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public static void method3851() {
		if (Static300.aClass5_Sub28_Sub1_1.method4129(Static17.anInt459) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static314.anInt4188 - 4 & 0xFF);
		@Pc(25) int local25 = Static314.anInt4188 % Static460.anInt7894;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (@Pc(31) int local31 = 0; local31 < Static235.anInt4493; local31++) {
				Static203.aByteArrayArrayArray7[local27][local25][local31] = local21;
			}
		}
		if (Static367.anInt6860 == 3) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < 2; local67++) {
			Static253.anIntArray659[local67] = -1000000;
			Static30.anIntArray47[local67] = 1000000;
			Static223.anIntArray287[local67] = 0;
			Static254.anIntArray687[local67] = 1000000;
			Static53.anIntArray154[local67] = 0;
		}
		@Pc(133) int local133;
		if (Static166.anInt3343 != 1) {
			local133 = Static191.method5464(Static367.anInt6861, Static364.anInt6817, Static367.anInt6860);
			if (local133 - Static182.anInt3520 >= 800 || (Static429.aByteArrayArrayArray17[Static367.anInt6860][Static367.anInt6861 >> 7][Static364.anInt6817 >> 7] & 0x4) == 0) {
				return;
			}
			Static137.method1273(false, Static367.anInt6861 >> 7, Static364.anInt6817 >> 7, Static152.aClass37ArrayArrayArray1, 1);
			return;
		}
		if ((Static429.aByteArrayArrayArray17[Static367.anInt6860][Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7][Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7] & 0x4) != 0) {
			Static137.method1273(false, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7, Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7, Static152.aClass37ArrayArrayArray1, 0);
		}
		if (Static180.anInt3500 >= 2560) {
			return;
		}
		local133 = Static367.anInt6861 >> 7;
		@Pc(137) int local137 = Static364.anInt6817 >> 7;
		@Pc(142) int local142 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7;
		@Pc(147) int local147 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7;
		@Pc(155) int local155;
		if (local133 < local142) {
			local155 = local142 - local133;
		} else {
			local155 = local133 - local142;
		}
		@Pc(174) int local174;
		if (local137 < local147) {
			local174 = local147 - local137;
		} else {
			local174 = local137 - local147;
		}
		if ((local155 != 0 || local174 != 0) && local155 > -Static460.anInt7894 && Static460.anInt7894 > local155 && local174 > -Static235.anInt4493 && Static235.anInt4493 > local174) {
			@Pc(253) int local253;
			@Pc(255) int local255;
			if (local174 >= local155) {
				local253 = local155 * 65536 / local174;
				local255 = 32768;
				while (local147 != local137) {
					if (local147 > local137) {
						local137++;
					} else if (local147 < local137) {
						local137--;
					}
					if ((Static429.aByteArrayArrayArray17[Static367.anInt6860][local133][local137] & 0x4) != 0) {
						Static137.method1273(false, local133, local137, Static152.aClass37ArrayArrayArray1, 1);
						return;
					}
					local255 += local253;
					if (local255 >= 65536) {
						local255 -= 65536;
						if (local142 > local133) {
							local133++;
						} else if (local142 < local133) {
							local133--;
						}
						if ((Static429.aByteArrayArrayArray17[Static367.anInt6860][local133][local137] & 0x4) != 0) {
							Static137.method1273(false, local133, local137, Static152.aClass37ArrayArrayArray1, 1);
							return;
						}
					}
				}
				return;
			}
			local253 = local174 * 65536 / local155;
			local255 = 32768;
			while (local142 != local133) {
				if (local133 < local142) {
					local133++;
				} else if (local142 < local133) {
					local133--;
				}
				if ((Static429.aByteArrayArrayArray17[Static367.anInt6860][local133][local137] & 0x4) != 0) {
					Static137.method1273(false, local133, local137, Static152.aClass37ArrayArrayArray1, 1);
					return;
				}
				local255 += local253;
				if (local255 >= 65536) {
					if (local137 < local147) {
						local137++;
					} else if (local147 < local137) {
						local137--;
					}
					local255 -= 65536;
					if ((Static429.aByteArrayArrayArray17[Static367.anInt6860][local133][local137] & 0x4) != 0) {
						Static137.method1273(false, local133, local137, Static152.aClass37ArrayArrayArray1, 1);
						return;
					}
				}
			}
			return;
		}
		Static370.method6434("RC: " + local133 + "," + local137 + " " + local142 + "," + local147 + " " + Static515.anInt3214 + "," + Static338.anInt6353, null);
		return;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!gp;Lclient!n;Ljava/awt/Canvas;)Lclient!qa;")
	public static Class62 method3852(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static463.method6456()) {
			throw new RuntimeException("");
		} else if (Static66.method1216("jaggl")) {
			@Pc(31) OpenGL local31 = new OpenGL();
			@Pc(41) long local41 = local31.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local41 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(62) Class62_Sub1_Sub2 local62 = new Class62_Sub1_Sub2(local31, arg3, local41, arg2, arg1, arg0);
			local62.method4691();
			return local62;
		} else {
			throw new RuntimeException("");
		}
	}
}
