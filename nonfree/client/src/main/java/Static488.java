import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!r;ZLclient!fa;)V")
	public static void method7239(@OriginalArg(0) Class44 arg0, @OriginalArg(2) Interface11 arg1) {
		if (Static455.aClass4_Sub5_Sub8_2 == null) {
			return;
		}
		if (Static312.anInt6205 < 10) {
			if (!Static455.aClass176_47.method4004(Static455.aClass4_Sub5_Sub8_2.aString35)) {
				Static312.anInt6205 = Static12.aClass176_6.method3983(Static455.aClass4_Sub5_Sub8_2.aString35) / 10;
				return;
			}
			Static481.method7203();
			Static312.anInt6205 = 10;
		}
		if (Static312.anInt6205 == 10) {
			Static455.anInt3448 = Static455.aClass4_Sub5_Sub8_2.anInt3847 >> 6 << 6;
			Static455.anInt3450 = Static455.aClass4_Sub5_Sub8_2.anInt3854 >> 6 << 6;
			Static455.anInt3445 = (Static455.aClass4_Sub5_Sub8_2.anInt3846 >> 6 << 6) + 64 - Static455.anInt3448;
			Static455.anInt3442 = (Static455.aClass4_Sub5_Sub8_2.anInt3852 >> 6 << 6) - (Static455.anInt3450 - 64);
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static455.aClass4_Sub5_Sub8_2.method3437(Static552.anInt9805 + (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 >> 9), Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126, (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 >> 9) + Static254.anInt4667, local76)) {
				local80 = local76[2] - Static455.anInt3450;
				local78 = local76[1] - Static455.anInt3448;
			}
			if (!Static204.aBoolean623 && local78 >= 0 && Static455.anInt3445 > local78 && local80 >= 0 && local80 < Static455.anInt3442) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static529.anInt9422 = local78;
				Static480.anInt10076 = local80;
			} else if (Static56.anInt915 == -1 || Static368.anInt7165 == -1) {
				Static455.aClass4_Sub5_Sub8_2.method3444(local76, Static455.aClass4_Sub5_Sub8_2.anInt3849 >> 14 & 0x3FFF, Static455.aClass4_Sub5_Sub8_2.anInt3849 & 0x3FFF);
				Static480.anInt10076 = local76[2] - Static455.anInt3450;
				Static529.anInt9422 = local76[1] - Static455.anInt3448;
			} else {
				Static455.aClass4_Sub5_Sub8_2.method3444(local76, Static56.anInt915, Static368.anInt7165);
				Static368.anInt7165 = -1;
				Static56.anInt915 = -1;
				if (local76 != null) {
					Static529.anInt9422 = local76[1] - Static455.anInt3448;
					Static480.anInt10076 = local76[2] - Static455.anInt3450;
				}
				Static204.aBoolean623 = false;
			}
			if (Static455.aClass4_Sub5_Sub8_2.anInt3858 == 37) {
				Static455.aFloat121 = 3.0F;
				Static455.aFloat120 = 3.0F;
			} else if (Static455.aClass4_Sub5_Sub8_2.anInt3858 == 50) {
				Static455.aFloat121 = 4.0F;
				Static455.aFloat120 = 4.0F;
			} else if (Static455.aClass4_Sub5_Sub8_2.anInt3858 == 75) {
				Static455.aFloat121 = 6.0F;
				Static455.aFloat120 = 6.0F;
			} else if (Static455.aClass4_Sub5_Sub8_2.anInt3858 == 100) {
				Static455.aFloat121 = 8.0F;
				Static455.aFloat120 = 8.0F;
			} else if (Static455.aClass4_Sub5_Sub8_2.anInt3858 == 200) {
				Static455.aFloat121 = 16.0F;
				Static455.aFloat120 = 16.0F;
			} else {
				Static455.aFloat121 = 8.0F;
				Static455.aFloat120 = 8.0F;
			}
			Static455.anInt3438 = (int) Static455.aFloat121 >> 1;
			Static455.aByteArrayArrayArray2 = Static417.method6534(Static455.anInt3438);
			Static484.method7227();
			Static455.method3068();
			Static264.aClass244_39 = new Class244();
			Static455.anInt3439 += (int) (Math.random() * 5.0D) - 2;
			if (Static455.anInt3439 < -8) {
				Static455.anInt3439 = -8;
			}
			if (Static455.anInt3439 > 8) {
				Static455.anInt3439 = 8;
			}
			Static455.anInt3437 += (int) (Math.random() * 5.0D) - 2;
			if (Static455.anInt3437 < -16) {
				Static455.anInt3437 = -16;
			}
			if (Static455.anInt3437 > 16) {
				Static455.anInt3437 = 16;
			}
			Static455.method3061(arg1, Static455.anInt3439 >> 2 << 10, Static455.anInt3437 >> 1);
			Static455.aClass142_2.method3365(1024, 256);
			Static455.aClass237_2.method5790(256, 256);
			Static455.aClass139_5.method3312(4096);
			Static381.aClass2_4.method65(256);
			Static312.anInt6205 = 20;
		} else if (Static312.anInt6205 == 20) {
			Static419.method6560(true);
			Static455.method3063(arg0, Static455.anInt3439, Static455.anInt3437);
			Static312.anInt6205 = 60;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 60) {
			if (Static455.aClass176_47.method4001(Static455.aClass4_Sub5_Sub8_2.aString35 + "_staticelements")) {
				if (!Static455.aClass176_47.method4004(Static455.aClass4_Sub5_Sub8_2.aString35 + "_staticelements")) {
					return;
				}
				Static455.aClass59_3 = Static336.method5506(Static455.aClass4_Sub5_Sub8_2.aString35 + "_staticelements", Static475.aBoolean431, Static455.aClass176_47);
			} else {
				Static455.aClass59_3 = new Class59(0);
			}
			Static455.method3080();
			Static312.anInt6205 = 70;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 70) {
			Static230.aClass183_3 = new Class183(arg0, 11, true, Static475.aCanvas12);
			Static312.anInt6205 = 73;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 73) {
			Static428.aClass183_6 = new Class183(arg0, 12, true, Static475.aCanvas12);
			Static312.anInt6205 = 76;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 76) {
			Static471.aClass183_8 = new Class183(arg0, 14, true, Static475.aCanvas12);
			Static312.anInt6205 = 79;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 79) {
			Static224.aClass183_2 = new Class183(arg0, 17, true, Static475.aCanvas12);
			Static312.anInt6205 = 82;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 82) {
			Static451.aClass183_7 = new Class183(arg0, 19, true, Static475.aCanvas12);
			Static312.anInt6205 = 85;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 85) {
			Static347.aClass183_4 = new Class183(arg0, 22, true, Static475.aCanvas12);
			Static312.anInt6205 = 88;
			Static419.method6560(true);
			Static554.method8016();
		} else if (Static312.anInt6205 == 88) {
			Static347.aClass183_5 = new Class183(arg0, 26, true, Static475.aCanvas12);
			Static312.anInt6205 = 91;
			Static419.method6560(true);
			Static554.method8016();
		} else {
			Static2.aClass183_1 = new Class183(arg0, 30, true, Static475.aCanvas12);
			Static312.anInt6205 = 100;
			Static419.method6560(true);
			Static554.method8016();
			System.gc();
		}
	}
}
