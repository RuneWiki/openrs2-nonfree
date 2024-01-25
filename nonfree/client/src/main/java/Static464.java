import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
	public static int anInt8027;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZIII)V")
	public static void method6724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static440.aClass217ArrayArrayArray3 == null) {
			Static600.aClass87_15.method7898(arg0, arg3, -16777216, arg4, arg1);
		} else if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >= 0 && Static3.anInt46 * 512 > Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >= 0 && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 < Static270.anInt5194 * 512) {
			Static143.anInt3169++;
			if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 != null && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 - (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() - 1) * 256 >> 9 == Static129.anInt2985 && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 - (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() - 1) * 256 >> 9 == Static271.anInt5226) {
				Static271.anInt5226 = -1;
				Static129.anInt2985 = -1;
				Static510.method7209();
			}
			Static286.method6697();
			if (!arg2) {
				Static104.method1767();
			}
			Static451.method6641();
			Static37.method820(true, arg0, arg4, arg3, arg1);
			@Pc(109) int local109 = Static389.anInt6997;
			@Pc(111) int local111 = Static421.anInt7650;
			@Pc(113) int local113 = Static108.anInt2143;
			Static388.anInt6979 = Static388.anInt6989;
			@Pc(117) int local117 = Static224.anInt4612;
			@Pc(139) int local139;
			@Pc(170) int local170;
			if (Static2.anInt31 == 1) {
				local139 = (int) Static189.aFloat109;
				if (local139 < Static600.anInt9884 >> 8) {
					local139 = Static600.anInt9884 >> 8;
				}
				if (Static276.aBooleanArray32[4] && Static311.anIntArray387[4] + 128 > local139) {
					local139 = Static311.anIntArray387[4] + 128;
				}
				local170 = Static479.anInt9936 + (int) Static378.aFloat160 & 0x3FFF;
				Static637.method8529(local139, Static85.anInt1773, local170, local113, Static57.anInt1181, Static582.method8038(Static16.anInt308, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929) - 200, (local139 >> 3) * 3 + 600 << 2);
			} else if (Static2.anInt31 == 4) {
				local139 = (int) Static189.aFloat109;
				if (local139 < Static600.anInt9884 >> 8) {
					local139 = Static600.anInt9884 >> 8;
				}
				if (Static276.aBooleanArray32[4] && Static311.anIntArray387[4] + 128 > local139) {
					local139 = Static311.anIntArray387[4] + 128;
				}
				local170 = (int) Static378.aFloat160 & 0x3FFF;
				Static637.method8529(local139, Static85.anInt1773, local170, local113, Static57.anInt1181, Static582.method8038(Static16.anInt308, Static215.anInt4487, Static61.anInt1274) - 200, 600 - -((local139 >> 3) * 3) << 2);
			} else if (Static2.anInt31 == 5) {
				Static264.method4290(local113);
			}
			local139 = Static53.anInt1153;
			local170 = Static64.anInt1371;
			@Pc(276) int local276 = Static395.anInt3530;
			@Pc(278) int local278 = Static512.anInt8589;
			@Pc(280) int local280 = Static105.anInt2114;
			@Pc(323) int local323;
			for (@Pc(282) int local282 = 0; local282 < 5; local282++) {
				if (Static276.aBooleanArray32[local282]) {
					local323 = (int) ((double) -Static557.anIntArray647[local282] + Math.random() * (double) (Static557.anIntArray647[local282] * 2 + 1) + Math.sin((double) Static416.anIntArray510[local282] * ((double) Static376.anIntArray448[local282] / 100.0D)) * (double) Static311.anIntArray387[local282]);
					if (local282 == 3) {
						Static105.anInt2114 = local323 + Static105.anInt2114 & 0x3FFF;
					}
					if (local282 == 1) {
						Static64.anInt1371 += local323 << 2;
					}
					if (local282 == 0) {
						Static53.anInt1153 += local323 << 2;
					}
					if (local282 == 4) {
						Static512.anInt8589 += local323;
						if (Static512.anInt8589 < 1024) {
							Static512.anInt8589 = 1024;
						} else if (Static512.anInt8589 > 3072) {
							Static512.anInt8589 = 3072;
						}
					}
					if (local282 == 2) {
						Static395.anInt3530 += local323 << 2;
					}
				}
			}
			if (Static53.anInt1153 < 0) {
				Static53.anInt1153 = 0;
			}
			if ((Static347.anInt6411 << 9) - 1 < Static53.anInt1153) {
				Static53.anInt1153 = (Static347.anInt6411 << 9) - 1;
			}
			if (Static395.anInt3530 < 0) {
				Static395.anInt3530 = 0;
			}
			if ((Static191.anInt6006 << 9) - 1 < Static395.anInt3530) {
				Static395.anInt3530 = (Static191.anInt6006 << 9) - 1;
			}
			Static581.method8035();
			Static569.method7833();
			Static600.aClass87_15.KA(local111, local109, local117 + local111, local113 + local109);
			Static271.method4375(true);
			if (Static558.aBoolean680) {
				Static575.method7995(Static121.anInt2897);
				if (Static388.anInt6979 != Static118.anInt2861) {
					Static445.aBoolean594 = true;
				}
				Static118.anInt2861 = Static388.anInt6979;
			} else {
				Static600.aClass87_15.ya();
				local323 = Static121.anInt2897;
				if (Static587.aClass17_1 == null) {
					Static600.aClass87_15.GA(local323);
				} else {
					Static587.aClass17_1.method326(local109, local113, Static512.anInt8589, local117, Static105.anInt2114, Static600.aClass87_15, Static202.anInt4261 << 3, local323, local111);
				}
			}
			Static77.method1461();
			Static386.aClass6_27.method6698(Static53.anInt1153, Static64.anInt1371, Static395.anInt3530, -Static512.anInt8589 & 0x3FFF, -Static105.anInt2114 & 0x3FFF, -Static103.anInt2093 & 0x3FFF);
			Static600.aClass87_15.method7896(Static386.aClass6_27);
			Static600.aClass87_15.DA(local117 / 2 + local111, local109 + local113 / 2, Static358.anInt6511 << 1, Static358.anInt6511 << 1);
			Static641.method8577(local113 / 2 + local109, local111 - -(local117 / 2), Static358.anInt6511 << 1, Static358.anInt6511 << 1);
			Static147.method2818(-Static105.anInt2114 & 0x3FFF, Static64.anInt1371, -Static512.anInt8589 & 0x3FFF, Static395.anInt3530, -Static103.anInt2093 & 0x3FFF, Static53.anInt1153);
			@Pc(578) byte local578 = Static404.aClass2_Sub13_2.aClass33_Sub10_1.method4036() == 2 ? (byte) Static143.anInt3169 : 1;
			if (Static558.aBoolean680) {
				Static403.method6230(-Static103.anInt2093 & 0x3FFF, -Static512.anInt8589 & 0x3FFF, -Static105.anInt2114 & 0x3FFF);
				Static5.method108(Static118.anIntArray207, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >> 9, Static395.anInt3530, Static498.anIntArray582, Static198.aByteArrayArrayArray8, Static64.anInt1371, Static388.anInt6979, Static382.anIntArray457, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >> 9, Static404.aClass2_Sub13_2.aClass33_Sub19_1.method6505() == 0, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 + 1, Static386.anIntArray467, local578, Static611.anIntArray695, Static325.anInt5888, Static53.anInt1153);
			} else {
				Static80.method1497(Static325.anInt5888, Static53.anInt1153, Static64.anInt1371, Static395.anInt3530, Static198.aByteArrayArrayArray8, Static118.anIntArray207, Static386.anIntArray467, Static498.anIntArray582, Static611.anIntArray695, Static382.anIntArray457, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 + 1, local578, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >> 9, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >> 9, Static404.aClass2_Sub13_2.aClass33_Sub19_1.method6505() == 0, Static172.aBoolean322 ? Static388.anInt6979 : -1, 0, false);
			}
			Static77.method1461();
			if (Static538.anInt8985 == 10) {
				Static104.method1771(local117, local111, local113, local109);
				Static479.method8324(local117, local113, local111, local109);
				Static432.method6474(local117, local111, local109, local113);
				Static90.method1586(local109, local113, local117, local111);
			}
			Static160.method3014();
			Static53.anInt1153 = local139;
			Static105.anInt2114 = local280;
			Static512.anInt8589 = local278;
			Static64.anInt1371 = local170;
			Static395.anInt3530 = local276;
			if (Static631.aBoolean749 && Static252.aClass190_1.method4610() == 0) {
				Static631.aBoolean749 = false;
			}
			if (Static631.aBoolean749) {
				Static600.aClass87_15.method7898(local113, local117, -16777216, local109, local111);
				Static86.method1555(Static600.aClass87_15, false, Static628.aClass369_12.method8475(Static377.anInt6756), Static428.aClass64_11, Static305.aClass114_29);
			}
			Static271.method4375(false);
		} else {
			Static600.aClass87_15.method7898(arg0, arg3, -16777216, arg4, arg1);
		}
	}
}
