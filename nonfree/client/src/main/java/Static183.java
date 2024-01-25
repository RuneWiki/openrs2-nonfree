import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "Lclient!wl;")
	public static Class360 aClass360_2;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
	public static int anInt3799 = 0;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_8 = new Class113(6, 4);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!fa;Lclient!r;I)V")
	public static void method3149(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class100 arg1) {
		if (Static270.aClass2_Sub3_Sub3_2 == null) {
			return;
		}
		if (Static499.anInt8380 < 10) {
			if (!Static270.aClass259_37.method5982(Static270.aClass2_Sub3_Sub3_2.aString18)) {
				Static499.anInt8380 = Static59.aClass259_29.method5972(Static270.aClass2_Sub3_Sub3_2.aString18) / 10;
				return;
			}
			Static476.method6769();
			Static499.anInt8380 = 10;
		}
		if (Static499.anInt8380 == 10) {
			Static270.anInt1800 = Static270.aClass2_Sub3_Sub3_2.anInt2226 >> 6 << 6;
			Static270.anInt1801 = Static270.aClass2_Sub3_Sub3_2.anInt2214 >> 6 << 6;
			Static270.anInt1805 = (Static270.aClass2_Sub3_Sub3_2.anInt2222 >> 6 << 6) + 64 - Static270.anInt1800;
			Static270.anInt1797 = (Static270.aClass2_Sub3_Sub3_2.anInt2225 >> 6 << 6) + 64 - Static270.anInt1801;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static270.aClass2_Sub3_Sub3_2.method1630((Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 >> 9) + Static35.anInt906, (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 >> 9) + Static130.anInt5246, local74, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112)) {
				local76 = local74[1] - Static270.anInt1801;
				local78 = local74[2] - Static270.anInt1800;
			}
			if (!Static311.aBoolean436 && local76 >= 0 && local76 < Static270.anInt1797 && local78 >= 0 && Static270.anInt1805 > local78) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static549.anInt8926 = local76;
				Static75.anInt1651 = local78;
			} else if (Static382.anInt6767 == -1 || Static218.anInt5026 == -1) {
				Static270.aClass2_Sub3_Sub3_2.method1629(Static270.aClass2_Sub3_Sub3_2.anInt2216 >> 14 & 0x3FFF, Static270.aClass2_Sub3_Sub3_2.anInt2216 & 0x3FFF, local74);
				Static549.anInt8926 = local74[1] - Static270.anInt1801;
				Static75.anInt1651 = local74[2] - Static270.anInt1800;
			} else {
				Static270.aClass2_Sub3_Sub3_2.method1629(Static382.anInt6767, Static218.anInt5026, local74);
				Static218.anInt5026 = -1;
				Static382.anInt6767 = -1;
				if (local74 != null) {
					Static75.anInt1651 = local74[2] - Static270.anInt1800;
					Static549.anInt8926 = local74[1] - Static270.anInt1801;
				}
				Static311.aBoolean436 = false;
			}
			if (Static270.aClass2_Sub3_Sub3_2.anInt2218 == 37) {
				Static270.aFloat47 = 3.0F;
				Static270.aFloat48 = 3.0F;
			} else if (Static270.aClass2_Sub3_Sub3_2.anInt2218 == 50) {
				Static270.aFloat47 = 4.0F;
				Static270.aFloat48 = 4.0F;
			} else if (Static270.aClass2_Sub3_Sub3_2.anInt2218 == 75) {
				Static270.aFloat47 = 6.0F;
				Static270.aFloat48 = 6.0F;
			} else if (Static270.aClass2_Sub3_Sub3_2.anInt2218 == 100) {
				Static270.aFloat47 = 8.0F;
				Static270.aFloat48 = 8.0F;
			} else if (Static270.aClass2_Sub3_Sub3_2.anInt2218 == 200) {
				Static270.aFloat47 = 16.0F;
				Static270.aFloat48 = 16.0F;
			} else {
				Static270.aFloat47 = 8.0F;
				Static270.aFloat48 = 8.0F;
			}
			Static270.anInt1791 = (int) Static270.aFloat47 >> 1;
			Static270.aByteArrayArrayArray14 = Static334.method5123(Static270.anInt1791);
			Static246.method3822();
			Static270.method1324();
			Static36.aClass8_3 = new Class8();
			Static270.anInt1793 += (int) (Math.random() * 5.0D) - 2;
			if (Static270.anInt1793 < -8) {
				Static270.anInt1793 = -8;
			}
			Static270.anInt1792 += (int) (Math.random() * 5.0D) - 2;
			if (Static270.anInt1793 > 8) {
				Static270.anInt1793 = 8;
			}
			if (Static270.anInt1792 < -16) {
				Static270.anInt1792 = -16;
			}
			if (Static270.anInt1792 > 16) {
				Static270.anInt1792 = 16;
			}
			Static270.method1304(arg0, Static270.anInt1793 >> 2 << 10, Static270.anInt1792 >> 1);
			Static270.aClass25_2.method441(256, 1024);
			Static270.aClass306_2.method6832(256, 256);
			Static270.aClass97_3.method1792(4096);
			Static49.aClass282_1.method6477(256);
			Static499.anInt8380 = 20;
		} else if (Static499.anInt8380 == 20) {
			Static472.method6646(true);
			Static270.method1308(arg1, Static270.anInt1793, Static270.anInt1792);
			Static499.anInt8380 = 60;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 60) {
			if (Static270.aClass259_37.method5993(Static270.aClass2_Sub3_Sub3_2.aString18 + "_staticelements")) {
				if (!Static270.aClass259_37.method5982(Static270.aClass2_Sub3_Sub3_2.aString18 + "_staticelements")) {
					return;
				}
				Static270.aClass288_2 = Static341.method5172(Static270.aClass259_37, Static451.aBoolean23, Static270.aClass2_Sub3_Sub3_2.aString18 + "_staticelements");
			} else {
				Static270.aClass288_2 = new Class288(0);
			}
			Static270.method1316();
			Static499.anInt8380 = 70;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 70) {
			Static80.aClass243_2 = new Class243(arg1, 11, true, Static471.aCanvas12);
			Static499.anInt8380 = 73;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 73) {
			Static157.aClass243_4 = new Class243(arg1, 12, true, Static471.aCanvas12);
			Static499.anInt8380 = 76;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 76) {
			Static16.aClass243_1 = new Class243(arg1, 14, true, Static471.aCanvas12);
			Static499.anInt8380 = 79;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 79) {
			Static87.aClass243_3 = new Class243(arg1, 17, true, Static471.aCanvas12);
			Static499.anInt8380 = 82;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 82) {
			Static331.aClass243_6 = new Class243(arg1, 19, true, Static471.aCanvas12);
			Static499.anInt8380 = 85;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 85) {
			Static407.aClass243_7 = new Class243(arg1, 22, true, Static471.aCanvas12);
			Static499.anInt8380 = 88;
			Static472.method6646(true);
			Static505.method7024();
		} else if (Static499.anInt8380 == 88) {
			Static488.aClass243_8 = new Class243(arg1, 26, true, Static471.aCanvas12);
			Static499.anInt8380 = 91;
			Static472.method6646(true);
			Static505.method7024();
		} else {
			Static204.aClass243_5 = new Class243(arg1, 30, true, Static471.aCanvas12);
			Static499.anInt8380 = 100;
			Static472.method6646(true);
			Static505.method7024();
			System.gc();
		}
	}
}
