import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILjava/lang/String;)V", line = 82)
	public static void method3257(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static85.method1962(Class2_Sub41.aClass145_258);
		Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(arg1) + 1);
		Class14.aClass2_Sub4_Sub2_4.method4828(arg0);
		Class14.aClass2_Sub4_Sub2_4.method4823(arg1);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIIZII)V", line = 119)
	public static void method3259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static307.aClass67ArrayArrayArray3 == null) {
			Static177.aClass19_8.method2870(arg4, arg1, arg0, -16777216, arg3);
		} else if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >= 0 && Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 < Class241.anInt7020 * 128 && Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >= 0 && Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 < OutputStream_Sub1.anInt4442 * 128) {
			Class2_Sub2_Sub10_Sub1.anInt3082++;
			if (Static17.aClass11_Sub5_Sub2_Sub1_3 != null && Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.method4329() * 64 >> 7 == Class130.anInt6538 && Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 + 64 - Static17.aClass11_Sub5_Sub2_Sub1_3.method4329() * 64 >> 7 == Class2_Sub3_Sub31.anInt5832) {
				Class130.anInt6538 = -1;
				Class2_Sub3_Sub31.anInt5832 = -1;
				Static334.method6010();
			}
			Static237.method3938();
			if (!arg2) {
				Static278.method5189();
			}
			Static170.method3388();
			Static285.method5274(arg1, arg4, true, arg3, arg0);
			@Pc(104) int local104 = Class123.anInt3364;
			@Pc(106) int local106 = Class110.anInt2805;
			@Pc(108) int local108 = Class124.anInt3404;
			@Pc(110) int local110 = Class243.anInt7038;
			@Pc(118) int local118;
			@Pc(151) int local151;
			if (Static291.anInt5899 == 1) {
				local118 = (int) Class28.aFloat27;
				if (local118 < Class66.anInt1883 >> 8) {
					local118 = Class66.anInt1883 >> 8;
				}
				if (Class132.aBooleanArray33[4] && local118 < Class2_Sub3_Sub11.anIntArray134[4] + 128) {
					local118 = Class2_Sub3_Sub11.anIntArray134[4] + 128;
				}
				local151 = Class11_Sub4.anInt3961 + (int) Class187.aFloat66 & 0x3FFF;
				Static324.method5834((local118 >> 3) * 3 + 600, Static265.anInt5451, local108, Static360.method6033(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770, Static330.anInt6573) - 50, Static58.anInt2392, local151, local118);
			} else if (Static291.anInt5899 == 4) {
				local118 = (int) Class28.aFloat27;
				if (local118 < Class66.anInt1883 >> 8) {
					local118 = Class66.anInt1883 >> 8;
				}
				if (Class132.aBooleanArray33[4] && Class2_Sub3_Sub11.anIntArray134[4] + 128 > local118) {
					local118 = Class2_Sub3_Sub11.anIntArray134[4] + 128;
				}
				local151 = (int) Class187.aFloat66 & 0x3FFF;
				Static324.method5834((local118 >> 3) * 3 + 600, Static265.anInt5451, local108, Static360.method6033(Class2_Sub3_Sub39.anInt7251, Class229.anInt6436, Static330.anInt6573) - 50, Static58.anInt2392, local151, local118);
			} else if (Static291.anInt5899 == 5) {
				Static359.method6433(local108);
			}
			local118 = Static127.anInt6765;
			local151 = Static95.anInt3588;
			@Pc(254) int local254 = Static197.anInt3773;
			@Pc(256) int local256 = Static244.anInt4847;
			@Pc(258) int local258 = Static4.anInt87;
			@Pc(301) int local301;
			for (@Pc(260) int local260 = 0; local260 < 5; local260++) {
				if (Class132.aBooleanArray33[local260]) {
					local301 = (int) ((double) (Class96.anIntArray164[local260] * 2 + 1) * Math.random() - (double) Class96.anIntArray164[local260] + Math.sin((double) Class84.anIntArray149[local260] * ((double) Class2_Sub2_Sub3.anIntArray87[local260] / 100.0D)) * (double) Class2_Sub3_Sub11.anIntArray134[local260]);
					if (local260 == 4) {
						Static244.anInt4847 += local301;
						if (Static244.anInt4847 < 1024) {
							Static244.anInt4847 = 1024;
						} else if (Static244.anInt4847 > 3072) {
							Static244.anInt4847 = 3072;
						}
					}
					if (local260 == 1) {
						Static95.anInt3588 += local301;
					}
					if (local260 == 3) {
						Static4.anInt87 = local301 + Static4.anInt87 & 0x3FFF;
					}
					if (local260 == 2) {
						Static197.anInt3773 += local301;
					}
					if (local260 == 0) {
						Static127.anInt6765 += local301;
					}
				}
			}
			if (Static127.anInt6765 < 0) {
				Static127.anInt6765 = 0;
			}
			if (Static197.anInt3773 < 0) {
				Static197.anInt3773 = 0;
			}
			if ((Static68.anInt1682 << 7) - 1 < Static127.anInt6765) {
				Static127.anInt6765 = (Static68.anInt1682 << 7) - 1;
			}
			if (Static197.anInt3773 > (Static196.anInt3769 << 7) - 1) {
				Static197.anInt3773 = (Static196.anInt3769 << 7) - 1;
			}
			Static338.method6092();
			Static52.method1613();
			Static177.aClass19_8.method2897(local104, local110, local106 + local104, local110 + local108);
			Static177.aClass19_8.method2821();
			local301 = Static92.anInt2092;
			if (Static343.aClass43_1 == null) {
				Static177.aClass19_8.method2869(local301);
			} else {
				Static343.aClass43_1.method1614(Static4.anInt87, Static68.anInt1681 << 3, Static177.aClass19_8, local108, Static244.anInt4847, local301, local104, local106, local110);
			}
			Static36.method1135();
			Static72.aClass14_3.method3931(Static127.anInt6765, Static95.anInt3588, Static197.anInt3773, -Static244.anInt4847 & 0x3FFF, -Static4.anInt87 & 0x3FFF, -Static319.anInt5645 & 0x3FFF);
			Static177.aClass19_8.method2898(Static72.aClass14_3);
			Static177.aClass19_8.method2823(local104 + local106 / 2, local110 + local108 / 2, Class2_Sub35.anInt5994 << 1, Class2_Sub35.anInt5994 << 1);
			Static283.method5255(Class2_Sub35.anInt5994 << 1, local106 / 2 + local104, Class2_Sub35.anInt5994 << 1, local110 + local108 / 2);
			Static89.method2087(Static197.anInt3773, Static95.anInt3588, -Static319.anInt5645 & 0x3FFF, -Static4.anInt87 & 0x3FFF, -Static244.anInt4847 & 0x3FFF, Static127.anInt6765);
			@Pc(541) byte local541 = Static203.aClass177_Sub1_2.method4493(Class2_Sub10.anInt1760) == 2 ? (byte) Class2_Sub2_Sub10_Sub1.anInt3082 : 1;
			Static209.method3955(Static177.aClass19_8, Class83.anInt2345, Class57_Sub2.anInt3587, Static72.aClass14_3, Static127.anInt6765, Static95.anInt3588, Static197.anInt3773, Static213.aByteArrayArrayArray13, Class233.anIntArray448, Class77.anIntArray136, Class11_Sub5_Sub2_Sub2.anIntArray318, Class217.anIntArray409, Class11_Sub3_Sub1.anIntArray122, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + 1, local541, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7, !Static203.aClass177_Sub1_2.aBoolean353);
			Static36.method1135();
			if (Class2_Sub3_Sub35.anInt6430 == 30) {
				Static283.method5254(local110, local108, local106, local104);
				Static212.method3996(local104, local106, local108, local110);
				Static158.method3214(local108, local104, local106, local110);
				Static213.method4017(local110, local108, local104, local106);
			}
			Static56.method890();
			Static95.anInt3588 = local151;
			Static197.anInt3773 = local254;
			Static127.anInt6765 = local118;
			Static244.anInt4847 = local256;
			Static4.anInt87 = local258;
			if (Class12_Sub1_Sub1.aBoolean308 && Static264.aClass183_3.method4638() == 0) {
				Class12_Sub1_Sub1.aBoolean308 = false;
			}
			if (Class12_Sub1_Sub1.aBoolean308) {
				Static177.aClass19_8.method2870(local108, local104, local110, -16777216, local106);
				Static326.method5858(Static253.aClass130_4, false, Class11_Sub5_Sub3.aClass79_102.method2269(Class197.anInt5569));
			}
		} else {
			Static177.aClass19_8.method2870(arg4, arg1, arg0, -16777216, arg3);
		}
	}
}
