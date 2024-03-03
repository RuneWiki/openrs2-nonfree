import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	public static int anInt6779;

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "Lclient!be;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	public static int anInt6788;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
	public static int anInt6791;

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "[Lclient!kh;")
	public static Class124[] aClass124Array1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V", line = 91)
	public static void method6091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg1 > arg0) {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static332.anIntArrayArray58[local10][arg3] = arg2;
			}
		} else {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static332.anIntArrayArray58[local10][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V", line = 208)
	public static void method6092() {
		if (Static203.aClass177_Sub1_2.method4493(Class2_Sub10.anInt1760) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Class2_Sub2_Sub10_Sub1.anInt3082 - 4 & 0xFF);
		@Pc(25) int local25 = Class2_Sub2_Sub10_Sub1.anInt3082 % Class241.anInt7020;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < OutputStream_Sub1.anInt4442; local31++) {
				Static213.aByteArrayArrayArray13[local27][local25][local31] = local21;
			}
		}
		if (Static330.anInt6573 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Class233.anIntArray448[local31] = -1000000;
			Class77.anIntArray136[local31] = 1000000;
			Class11_Sub5_Sub2_Sub2.anIntArray318[local31] = 0;
			Class11_Sub3_Sub1.anIntArray122[local31] = 1000000;
			Class217.anIntArray409[local31] = 0;
		}
		@Pc(94) int local94;
		if (Static291.anInt5899 != 1) {
			local94 = Static360.method6033(Static127.anInt6765, Static197.anInt3773, Static330.anInt6573);
			if (local94 - Static95.anInt3588 < 800 && (Static334.aByteArrayArrayArray16[Static330.anInt6573][Static127.anInt6765 >> 7][Static197.anInt3773 >> 7] & 0x4) != 0) {
				Static77.method3668(Static307.aClass67ArrayArrayArray3, false, Static127.anInt6765 >> 7, Static197.anInt3773 >> 7, 1);
				return;
			}
			return;
		}
		if ((Static334.aByteArrayArrayArray16[Static330.anInt6573][Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7][Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7] & 0x4) != 0) {
			Static77.method3668(Static307.aClass67ArrayArrayArray3, false, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7, 0);
		}
		if (Static244.anInt4847 >= 2560) {
			return;
		}
		local94 = Static127.anInt6765 >> 7;
		@Pc(175) int local175 = Static197.anInt3773 >> 7;
		@Pc(180) int local180 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7;
		@Pc(185) int local185 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7;
		@Pc(196) int local196;
		if (local180 <= local94) {
			local196 = local94 - local180;
		} else {
			local196 = local180 - local94;
		}
		@Pc(210) int local210;
		if (local185 <= local175) {
			local210 = local175 - local185;
		} else {
			local210 = local185 - local175;
		}
		if (local196 == 0 && local210 == 0 || local196 <= -Class241.anInt7020 || Class241.anInt7020 <= local196 || local210 <= -OutputStream_Sub1.anInt4442 || local210 >= OutputStream_Sub1.anInt4442) {
			Static241.method6254(null, "RC: " + local94 + "," + local175 + " " + local180 + "," + local185 + " " + Static154.anInt3136 + "," + Static139.anInt2716);
			return;
		}
		@Pc(290) int local290;
		@Pc(292) int local292;
		if (local210 >= local196) {
			local290 = local196 * 65536 / local210;
			local292 = 32768;
			while (local185 != local175) {
				if (local185 > local175) {
					local175++;
				} else if (local175 > local185) {
					local175--;
				}
				if ((Static334.aByteArrayArrayArray16[Static330.anInt6573][local94][local175] & 0x4) != 0) {
					Static77.method3668(Static307.aClass67ArrayArrayArray3, false, local94, local175, 1);
					return;
				}
				local292 += local290;
				if (local292 >= 65536) {
					local292 -= 65536;
					if (local94 < local180) {
						local94++;
					} else if (local94 > local180) {
						local94--;
					}
					if ((Static334.aByteArrayArrayArray16[Static330.anInt6573][local94][local175] & 0x4) != 0) {
						Static77.method3668(Static307.aClass67ArrayArrayArray3, false, local94, local175, 1);
						return;
					}
				}
			}
			return;
		}
		local290 = local210 * 65536 / local196;
		local292 = 32768;
		while (local94 != local180) {
			if (local94 < local180) {
				local94++;
			} else if (local180 < local94) {
				local94--;
			}
			if ((Static334.aByteArrayArrayArray16[Static330.anInt6573][local94][local175] & 0x4) != 0) {
				Static77.method3668(Static307.aClass67ArrayArrayArray3, false, local94, local175, 1);
				return;
			}
			local292 += local290;
			if (local292 >= 65536) {
				local292 -= 65536;
				if (local175 < local185) {
					local175++;
				} else if (local185 < local175) {
					local175--;
				}
				if ((Static334.aByteArrayArrayArray16[Static330.anInt6573][local94][local175] & 0x4) != 0) {
					Static77.method3668(Static307.aClass67ArrayArrayArray3, false, local94, local175, 1);
					return;
				}
			}
		}
	}
}
