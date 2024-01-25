import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Lclient!r;")
	public static Class78 aClass78_153;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "[Lclient!vv;")
	public static Class11_Sub1[] aClass11_Sub1Array141;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public static int anInt9736 = 104;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZIZIII)V")
	public static void method7910(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static568.aClass360ArrayArrayArray22 == null) {
			Static31.aClass78_18.method6800(-16777216, arg2, arg3, arg4, arg0);
		} else if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 >= 0 && anInt9736 * 512 > Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 >= 0 && Static378.anInt6747 * 512 > Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906) {
			Static450.anInt7909++;
			if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 != null && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 + 256 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() * 256 >> 9 == Static258.anInt4724 && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 + 256 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() * 256 >> 9 == Static345.anInt9498) {
				Static258.anInt4724 = -1;
				Static345.anInt9498 = -1;
				Static62.method1010();
			}
			Static425.method6086();
			if (!arg1) {
				Static137.method2398();
			}
			Static147.method2483();
			Static311.method4639(arg3, arg2, true, arg4, arg0);
			@Pc(113) int local113 = Static357.anInt6522;
			@Pc(115) int local115 = Static187.anInt3716;
			@Pc(117) int local117 = Static186.anInt3690;
			@Pc(119) int local119 = Static105.anInt8047;
			@Pc(127) int local127;
			@Pc(168) int local168;
			if (Static358.anInt9363 == 1) {
				local127 = (int) Static487.aFloat206;
				if (local127 < Static140.anInt2732 >> 8) {
					local127 = Static140.anInt2732 >> 8;
				}
				if (Static586.aBooleanArray40[4] && Static293.anIntArray308[4] + 128 > local127) {
					local127 = Static293.anIntArray308[4] + 128;
				}
				local168 = (int) Static331.aFloat172 + Static570.anInt9433 & 0x3FFF;
				Static91.method6730((local127 >> 3) * 3 + 600 << 2, local168, Static538.method6114(Static240.anInt4414, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902) - 200, Static183.anInt3630, local117, local127, Static173.anInt3244);
			} else if (Static358.anInt9363 == 4) {
				local127 = (int) Static487.aFloat206;
				if (local127 < Static140.anInt2732 >> 8) {
					local127 = Static140.anInt2732 >> 8;
				}
				if (Static586.aBooleanArray40[4] && Static293.anIntArray308[4] + 128 > local127) {
					local127 = Static293.anIntArray308[4] + 128;
				}
				local168 = (int) Static331.aFloat172 & 0x3FFF;
				Static91.method6730((local127 >> 3) * 3 + 600 << 2, local168, Static538.method6114(Static240.anInt4414, Static273.anInt1191, Static576.anInt4080) - 200, Static183.anInt3630, local117, local127, Static173.anInt3244);
			} else if (Static358.anInt9363 == 5) {
				Static254.method2371(local117);
			}
			local127 = Static393.anInt6978;
			local168 = Static20.anInt542;
			@Pc(281) int local281 = Static78.anInt1534;
			@Pc(283) int local283 = Static428.anInt7673;
			@Pc(285) int local285 = Static175.anInt3256;
			@Pc(329) int local329;
			for (@Pc(287) int local287 = 0; local287 < 5; local287++) {
				if (Static586.aBooleanArray40[local287]) {
					local329 = (int) ((double) -Static260.anIntArray262[local287] + Math.random() * (double) (Static260.anIntArray262[local287] * 2 + 1) + Math.sin((double) Static537.anIntArray567[local287] / 100.0D * (double) Static472.anIntArray513[local287]) * (double) Static293.anIntArray308[local287]);
					if (local287 == 3) {
						Static175.anInt3256 = local329 + Static175.anInt3256 & 0x3FFF;
					}
					if (local287 == 0) {
						Static393.anInt6978 += local329 << 2;
					}
					if (local287 == 4) {
						Static428.anInt7673 += local329;
						if (Static428.anInt7673 < 1024) {
							Static428.anInt7673 = 1024;
						} else if (Static428.anInt7673 > 3072) {
							Static428.anInt7673 = 3072;
						}
					}
					if (local287 == 2) {
						Static78.anInt1534 += local329 << 2;
					}
					if (local287 == 1) {
						Static20.anInt542 += local329 << 2;
					}
				}
			}
			if (Static393.anInt6978 < 0) {
				Static393.anInt6978 = 0;
			}
			if ((Static327.anInt5993 << 9) - 1 < Static393.anInt6978) {
				Static393.anInt6978 = (Static327.anInt5993 << 9) - 1;
			}
			if (Static78.anInt1534 < 0) {
				Static78.anInt1534 = 0;
			}
			if ((Static191.anInt3757 << 9) - 1 < Static78.anInt1534) {
				Static78.anInt1534 = (Static191.anInt3757 << 9) - 1;
			}
			Static329.method4870();
			Static205.method3164();
			Static31.aClass78_18.da(local115, local119, local115 + local113, local119 - -local117);
			Static31.aClass78_18.ya();
			local329 = Static100.anInt1766;
			if (Static242.aClass289_1 == null) {
				Static31.aClass78_18.ja(local329);
			} else {
				Static242.aClass289_1.method6205(Static31.aClass78_18, local113, local115, local117, local119, Static175.anInt3256, Static428.anInt7673, Static100.anInt1765 << 3, local329);
			}
			Static275.method4012();
			Static160.aClass34_1.na(Static393.anInt6978, Static20.anInt542, Static78.anInt1534, -Static428.anInt7673 & 0x3FFF, -Static175.anInt3256 & 0x3FFF, -Static76.anInt6369 & 0x3FFF);
			Static31.aClass78_18.method6812(Static160.aClass34_1);
			Static31.aClass78_18.la(local113 / 2 + local115, local119 + local117 / 2, Static362.anInt6567 << 1, Static362.anInt6567 << 1);
			Static87.method1374(Static362.anInt6567 << 1, local113 / 2 + local115, Static362.anInt6567 << 1, local117 / 2 + local119);
			Static136.method2378(Static78.anInt1534, Static20.anInt542, -Static175.anInt3256 & 0x3FFF, -Static76.anInt6369 & 0x3FFF, Static393.anInt6978, -Static428.anInt7673 & 0x3FFF);
			@Pc(557) byte local557 = Static86.aClass1_Sub30_Sub1_1.method5033(Static286.anInt5239) == 2 ? (byte) Static450.anInt7909 : 1;
			Static70.method1170(Static518.anInt9331, Static393.anInt6978, Static20.anInt542, Static78.anInt1534, Static368.aByteArrayArrayArray12, Static389.anIntArray408, Static142.anIntArray123, Static527.anIntArray556, Static146.anIntArray128, Static584.anIntArray615, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 + 1, local557, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 >> 9, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 >> 9, !Static86.aClass1_Sub30_Sub1_1.aBoolean488);
			Static275.method4012();
			if (Static55.anInt1068 == 10) {
				Static157.method2589(local115, local117, local113, local119);
				Static293.method4368(local117, local115, local113, local119);
				Static8.method4851(local119, local113, local115, local117);
				Static240.method3548(local117, local115, local119, local113);
			}
			Static405.method5820();
			Static20.anInt542 = local168;
			Static428.anInt7673 = local283;
			Static78.anInt1534 = local281;
			Static393.anInt6978 = local127;
			Static175.anInt3256 = local285;
			if (Static109.aBoolean121 && Static571.aClass205_3.method4370() == 0) {
				Static109.aBoolean121 = false;
			}
			if (Static109.aBoolean121) {
				Static31.aClass78_18.method6800(-16777216, local117, local115, local113, local119);
				Static307.method6069(Static375.aClass253_16.method5453(Static161.anInt3095), Static339.aClass96_9, false, Static31.aClass78_18, Static552.aClass352_20);
			}
		} else {
			Static31.aClass78_18.method6800(-16777216, arg2, arg3, arg4, arg0);
		}
	}
}
