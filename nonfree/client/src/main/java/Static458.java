import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ICI)I")
	public static int method5831(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(24) char local24 = Character.toLowerCase(arg1);
			local7 = (local24 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
	public static void method5832() {
		Static546.aClass182_105.anInt4310 = 1;
		if (Static98.anInt2140 == 15) {
			Static122.method2274();
		}
		Static225.method3326();
		Static95.aClass292_1.method6852();
		Static370.anInt5764 = 0;
		Static168.anInt2972 = 0;
		Static465.anInt7271 = 0;
		Static213.aBoolean221 = true;
		Static19.aBoolean43 = true;
		Static342.method4886();
		for (@Pc(8628) int local8628 = 0; local8628 < Static110.aClass197Array1.length; local8628++) {
			Static110.aClass197Array1[local8628] = null;
		}
		Static474.aBoolean505 = false;
		Static383.method5140();
		Static382.aFloat40 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
		Static635.anInt9788 = (int) (Math.random() * 100.0D) - 50;
		Static402.anInt6239 = (int) (Math.random() * 30.0D) - 20;
		Static88.anInt2043 = (int) (Math.random() * 80.0D) - 40;
		Static331.anInt5334 = (int) (Math.random() * 110.0D) - 55;
		Static194.anInt3310 = (int) (Math.random() * 120.0D) - 60;
		Static630.method8285();
		for (@Pc(8705) int local8705 = 0; local8705 < 2048; local8705++) {
			Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local8705] = null;
		}
		Static28.anInt1087 = 0;
		Static568.anInt8629 = 0;
		Static94.aClass313_8.method7101();
		Static355.aClass342_94.method7655();
		Static53.aClass313_6.method7101();
		Static291.aClass319_4.method7192();
		Static113.aClass313_9.method7101();
		Static629.aClass342_76 = new Class342();
		Static226.aClass342_35 = new Class342();
		Static380.aClass127_1.method2983();
		Static138.method2386();
		Static287.anInt4415 = 0;
		Static114.anInt2375 = 0;
		Static453.anInt6956 = 0;
		Static332.anInt5343 = 0;
		Static528.anInt8244 = 0;
		Static183.anInt3174 = 0;
		Static631.anInt9738 = 0;
		Static45.anInt1294 = 0;
		Static512.anInt10668 = 0;
		Static25.anInt766 = 0;
		for (@Pc(8777) int local8777 = 0; local8777 < Static227.anIntArray269.length; local8777++) {
			if (!Static317.aBooleanArray10[local8777]) {
				Static227.anIntArray269[local8777] = -1;
			}
		}
		if (Static589.anInt8959 != -1) {
			Static137.method2384(Static589.anInt8959);
		}
		for (@Pc(8816) Class3_Sub20 local8816 = (Class3_Sub20) Static432.aClass313_34.method7103(); local8816 != null; local8816 = (Class3_Sub20) Static432.aClass313_34.method7110()) {
			if (!local8816.method9597()) {
				local8816 = (Class3_Sub20) Static432.aClass313_34.method7103();
				if (local8816 == null) {
					break;
				}
			}
			Static46.method1229(true, false, local8816);
		}
		Static589.anInt8959 = -1;
		Static432.aClass313_34 = new Class313(8);
		Static490.method6634();
		Static710.aClass270_11 = null;
		for (@Pc(8862) int local8862 = 0; local8862 < 8; local8862++) {
			Static410.aStringArray14[local8862] = null;
			Static433.aBooleanArray15[local8862] = false;
			Static3.anIntArray4[local8862] = -1;
		}
		Static56.method1313();
		Static125.aBoolean163 = true;
		for (@Pc(8892) int local8892 = 0; local8892 < 100; local8892++) {
			Static572.aBooleanArray23[local8892] = true;
		}
		for (@Pc(8910) int local8910 = 0; local8910 < 6; local8910++) {
			Static469.aClass240Array1[local8910] = new Class240();
		}
		for (@Pc(8928) int local8928 = 0; local8928 < 25; local8928++) {
			Static410.anIntArray184[local8928] = 0;
			Static212.anIntArray243[local8928] = 0;
			Static400.anIntArray475[local8928] = 0;
		}
		Static509.method6646();
		Static96.aBoolean732 = true;
		Static657.aShortArray139 = Static94.aShortArray13 = Static214.aShortArray28 = Static397.aShortArray75 = new short[256];
		Static99.aString39 = Static430.aClass257_25.method5699(Static456.anInt7118);
		Static580.aClass3_Sub22_24.method2423(Static580.aClass3_Sub22_24.aClass21_Sub21_1.method6042(), Static580.aClass3_Sub22_24.aClass21_Sub21_2);
		Static580.aClass3_Sub22_24.method2423(Static580.aClass3_Sub22_24.aClass21_Sub15_1.method5064(), Static580.aClass3_Sub22_24.aClass21_Sub15_2);
		Static407.anInt6329 = 0;
		Static338.method4844();
		Static353.method4960();
		Static546.aClass182_105.anInt4310 = 2;
		Static85.aLong68 = 0L;
		Static369.aClass3_Sub3_2 = null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!ik;Lclient!ik;I)V")
	public static void method5833(@OriginalArg(1) Class182 arg0, @OriginalArg(2) Class182 arg1) {
		Static89.aClass182_23 = arg1;
		Static524.aClass182_104 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)I")
	public static int method5834() {
		return Static231.method3374(false);
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
	public static void method5835() {
		@Pc(1) Class307 local1 = Static91.aClass307_21;
		synchronized (Static91.aClass307_21) {
			Static91.aClass307_21.method7006();
		}
		local1 = Static386.aClass307_61;
		synchronized (Static386.aClass307_61) {
			Static386.aClass307_61.method7006();
		}
	}
}
