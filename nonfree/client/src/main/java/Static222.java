import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZIIII)V")
	public static void method3433(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static535.aClass156ArrayArrayArray2 == null) {
			Static485.aClass126_17.method7045(arg4, arg3, arg0, arg2, -16777216);
		} else if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >= 0 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 < Static111.anInt1752 * 512 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >= 0 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 < Static279.anInt4567 * 512) {
			Static92.anInt9992++;
			if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 != null && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 + 256 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() * 256 >> 9 == Static269.anInt1227 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 + 256 - Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() * 256 >> 9 == Static119.anInt1885) {
				Static269.anInt1227 = -1;
				Static119.anInt1885 = -1;
				Static162.method2436();
			}
			Static404.method6198();
			if (!arg1) {
				Static170.method2646();
			}
			Static207.method3200();
			Static177.method2688(arg4, arg0, arg3, arg2, true);
			@Pc(113) int local113 = Static266.anInt4408;
			@Pc(115) int local115 = Static400.anInt6935;
			@Pc(117) int local117 = Static544.anInt9011;
			@Pc(119) int local119 = Static381.anInt6702;
			Static461.anInt7840 = Static461.anInt7805;
			@Pc(140) int local140;
			@Pc(175) int local175;
			if (Static584.anInt9543 == 1) {
				local140 = (int) Static371.aFloat65;
				if (Static93.anInt1497 >> 8 > local140) {
					local140 = Static93.anInt1497 >> 8;
				}
				if (Static274.aBooleanArray60[4] && local140 < Static39.anIntArray54[4] + 128) {
					local140 = Static39.anIntArray54[4] + 128;
				}
				local175 = (int) Static112.aFloat22 + Static145.anInt6904 & 0x3FFF;
				Static291.method4299(Static319.anInt5539, local140, Static134.anInt2212, local113, (local140 >> 3) * 3 + 600 << 2, Static600.method8378(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317, Static299.anInt4751) - 200, local175);
			} else if (Static584.anInt9543 == 4) {
				local140 = (int) Static371.aFloat65;
				if (Static93.anInt1497 >> 8 > local140) {
					local140 = Static93.anInt1497 >> 8;
				}
				if (Static274.aBooleanArray60[4] && Static39.anIntArray54[4] + 128 > local140) {
					local140 = Static39.anIntArray54[4] + 128;
				}
				local175 = (int) Static112.aFloat22 & 0x3FFF;
				Static291.method4299(Static319.anInt5539, local140, Static134.anInt2212, local113, (local140 >> 3) * 3 + 600 << 2, Static600.method8378(Static377.anInt6619, Static102.anInt1587, Static299.anInt4751) - 200, local175);
			} else if (Static584.anInt9543 == 5) {
				Static620.method8543(local113);
			}
			local140 = Static70.anInt9231;
			local175 = Static216.anInt3726;
			@Pc(272) int local272 = Static646.anInt10445;
			@Pc(274) int local274 = Static218.anInt3744;
			@Pc(276) int local276 = Static608.anInt9971;
			@Pc(329) int local329;
			for (@Pc(288) int local288 = 0; local288 < 5; local288++) {
				if (Static274.aBooleanArray60[local288]) {
					local329 = (int) (Math.random() * (double) (Static324.anIntArray410[local288] * 2 + 1) - (double) Static324.anIntArray410[local288] + Math.sin((double) Static48.anIntArray63[local288] * ((double) Static525.anIntArray681[local288] / 100.0D)) * (double) Static39.anIntArray54[local288]);
					if (local288 == 1) {
						Static216.anInt3726 += local329 << 2;
					}
					if (local288 == 2) {
						Static646.anInt10445 += local329 << 2;
					}
					if (local288 == 0) {
						Static70.anInt9231 += local329 << 2;
					}
					if (local288 == 3) {
						Static608.anInt9971 = Static608.anInt9971 + local329 & 0x3FFF;
					}
					if (local288 == 4) {
						Static218.anInt3744 += local329;
						if (Static218.anInt3744 < 1024) {
							Static218.anInt3744 = 1024;
						} else if (Static218.anInt3744 > 3072) {
							Static218.anInt3744 = 3072;
						}
					}
				}
			}
			if (Static70.anInt9231 < 0) {
				Static70.anInt9231 = 0;
			}
			if (Static646.anInt10445 < 0) {
				Static646.anInt10445 = 0;
			}
			if (Static70.anInt9231 > (Static129.anInt6336 << 9) - 1) {
				Static70.anInt9231 = (Static129.anInt6336 << 9) - 1;
			}
			if (Static646.anInt10445 > (Static150.anInt2400 << 9) - 1) {
				Static646.anInt10445 = (Static150.anInt2400 << 9) - 1;
			}
			Static85.method1345();
			Static383.method5943();
			Static485.aClass126_17.KA(local119, local115, local119 + local117, local115 + local113);
			Static554.method7810(true);
			if (Static144.aBoolean196) {
				Static538.method7675(Static375.anInt6599);
				if (Static461.anInt7840 != Static164.anInt5725) {
					Static367.aBoolean541 = true;
				}
				Static164.anInt5725 = Static461.anInt7840;
			} else {
				Static485.aClass126_17.ya();
				local329 = Static375.anInt6599;
				if (Static374.aClass218_1 == null) {
					Static485.aClass126_17.GA(local329);
				} else {
					Static374.aClass218_1.method5169(local329, local119, Static202.anInt3588 << 3, Static485.aClass126_17, Static608.anInt9971, Static218.anInt3744, local113, local115, local117);
				}
			}
			Static439.method6528();
			Static468.aClass117_6.method7254(Static70.anInt9231, Static216.anInt3726, Static646.anInt10445, -Static218.anInt3744 & 0x3FFF, -Static608.anInt9971 & 0x3FFF, -Static21.anInt457 & 0x3FFF);
			Static485.aClass126_17.method7040(Static468.aClass117_6);
			Static485.aClass126_17.DA(local119 + local117 / 2, local115 - -(local113 / 2), Static53.anInt814 << 1, Static53.anInt814 << 1);
			Static106.method1545(local115 + local113 / 2, Static53.anInt814 << 1, local119 + local117 / 2, Static53.anInt814 << 1);
			Static427.method6422(-Static608.anInt9971 & 0x3FFF, -Static218.anInt3744 & 0x3FFF, Static216.anInt3726, -Static21.anInt457 & 0x3FFF, Static70.anInt9231, Static646.anInt10445);
			@Pc(594) byte local594 = Static627.aClass5_Sub46_31.aClass11_Sub8_2.method2214() == 2 ? (byte) Static92.anInt9992 : 1;
			if (Static144.aBoolean196) {
				Static18.method446(-Static608.anInt9971 & 0x3FFF, -Static218.anInt3744 & 0x3FFF, -Static21.anInt457 & 0x3FFF);
				Static27.method544(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 + 1, Static352.anIntArray488, Static606.anIntArray803, Static627.aClass5_Sub46_31.aClass11_Sub13_1.method3955() == 0, local594, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >> 9, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >> 9, Static200.anIntArray291, Static131.anIntArray174, Static216.anInt3726, Static235.anInt3998, Static646.anInt10445, Static368.anIntArray509, Static70.anInt9231, Static461.anInt7840, Static479.aByteArrayArrayArray21);
			} else {
				Static374.method5828(Static235.anInt3998, Static70.anInt9231, Static216.anInt3726, Static646.anInt10445, Static479.aByteArrayArrayArray21, Static352.anIntArray488, Static200.anIntArray291, Static368.anIntArray509, Static606.anIntArray803, Static131.anIntArray174, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 + 1, local594, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >> 9, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >> 9, Static627.aClass5_Sub46_31.aClass11_Sub13_1.method3955() == 0, Static605.aBoolean812 ? Static461.anInt7840 : -1, 0, false);
			}
			Static439.method6528();
			if (Static469.anInt7883 == 10) {
				Static569.method6638(local113, local117, local119, local115);
				Static571.method8047(local117, local119, local113, local115);
				Static62.method1072(local113, local119, local115, local117);
				Static520.method7461(local115, local113, local119, local117);
			}
			Static475.method7469();
			Static646.anInt10445 = local272;
			Static70.anInt9231 = local140;
			Static608.anInt9971 = local276;
			Static218.anInt3744 = local274;
			Static216.anInt3726 = local175;
			if (Static503.aBoolean326 && Static49.aClass331_1.method7801() == 0) {
				Static503.aBoolean326 = false;
			}
			if (Static503.aBoolean326) {
				Static485.aClass126_17.method7045(local117, local113, local115, local119, -16777216);
				Static237.method3641(Static530.aClass298_13, Static437.aClass6_11, Static485.aClass126_17, false, Static76.aClass58_13.method1237(Static321.anInt5554));
			}
			Static554.method7810(false);
		} else {
			Static485.aClass126_17.method7045(arg4, arg3, arg0, arg2, -16777216);
		}
	}
}
