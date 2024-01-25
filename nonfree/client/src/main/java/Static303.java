import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	public static int anInt5455;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(CB)C")
	public static char method4761(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public static void method4762() {
		if (Static494.anInt7890 == -1 || Static236.anInt4333 == -1) {
			return;
		}
		@Pc(21) int local21 = (Static241.anInt4678 * (Static472.anInt7602 - Static213.anInt4070) >> 16) + Static213.anInt4070;
		Static241.anInt4678 += local21;
		if (Static241.anInt4678 < 65535) {
			Static163.aBoolean261 = false;
			Static65.aBoolean151 = false;
		} else {
			Static241.anInt4678 = 65535;
			if (Static65.aBoolean151) {
				Static163.aBoolean261 = false;
			} else {
				Static163.aBoolean261 = true;
			}
			Static65.aBoolean151 = true;
		}
		@Pc(49) float local49 = (float) Static241.anInt4678 / 65535.0F;
		@Pc(52) float[] local52 = new float[3];
		@Pc(56) int local56 = Static352.anInt6102 * 2;
		@Pc(81) int local81;
		@Pc(114) int local114;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(136) int local136;
		@Pc(154) int local154;
		for (@Pc(58) int local58 = 0; local58 < 3; local58++) {
			@Pc(69) int local69 = Static297.anIntArrayArrayArray9[Static494.anInt7890][local56][local58] * 3;
			local81 = Static297.anIntArrayArrayArray9[Static494.anInt7890][local56 + 1][local58] * 3;
			local114 = (Static297.anIntArrayArrayArray9[Static494.anInt7890][local56 + 2][local58] + Static297.anIntArrayArrayArray9[Static494.anInt7890][local56 + 2][local58] - Static297.anIntArrayArrayArray9[Static494.anInt7890][local56 + 3][local58]) * 3;
			local122 = Static297.anIntArrayArrayArray9[Static494.anInt7890][local56][local58];
			local126 = local81 - local69;
			local136 = local69 + local114 - local81 * 2;
			local154 = Static297.anIntArrayArrayArray9[Static494.anInt7890][local56 + 2][local58] + local81 - local114 - local122;
			local52[local58] = local49 * ((local49 * (float) local154 + (float) local136) * local49 + (float) local126) + (float) local122;
		}
		Static576.anInt9403 = (int) local52[0] - Static406.anInt6899 * 512;
		Static479.anInt7769 = (int) local52[1] * -1;
		Static63.anInt1715 = (int) local52[2] - Static338.anInt5885 * 512;
		@Pc(210) float[] local210 = new float[3];
		local81 = Static249.anInt4785 * 2;
		for (local114 = 0; local114 < 3; local114++) {
			local122 = Static297.anIntArrayArrayArray9[Static236.anInt4333][local81][local114] * 3;
			local126 = Static297.anIntArrayArrayArray9[Static236.anInt4333][local81 + 1][local114] * 3;
			local136 = (Static297.anIntArrayArrayArray9[Static236.anInt4333][local81 + 2][local114] + Static297.anIntArrayArrayArray9[Static236.anInt4333][local81 + 2][local114] - Static297.anIntArrayArrayArray9[Static236.anInt4333][local81 + 3][local114]) * 3;
			local154 = Static297.anIntArrayArrayArray9[Static236.anInt4333][local81][local114];
			@Pc(286) int local286 = local126 - local122;
			@Pc(295) int local295 = local136 + local122 - local126 * 2;
			@Pc(312) int local312 = local126 + Static297.anIntArrayArrayArray9[Static236.anInt4333][local81 + 2][local114] - local154 - local136;
			local210[local114] = local49 * ((float) local286 + local49 * (local49 * (float) local312 + (float) local295)) + (float) local154;
		}
		@Pc(346) float local346 = local210[0] - local52[0];
		@Pc(362) float local362 = -1.0F * (local210[1] - local52[1]);
		@Pc(370) float local370 = local210[2] - local52[2];
		@Pc(380) double local380 = Math.sqrt((double) (local346 * local346 + local370 * local370));
		Static502.anInt9930 = (int) (Math.atan2((double) local362, local380) * 2607.5945876176133D) & 0x3FFF;
		Static400.anInt7896 = (int) (-Math.atan2((double) local346, (double) local370) * 2607.5945876176133D) & 0x3FFF;
		Static47.anInt1279 = Static297.anIntArrayArrayArray9[Static494.anInt7890][local56][3] + ((Static297.anIntArrayArrayArray9[Static494.anInt7890][local56 + 2][3] - Static297.anIntArrayArrayArray9[Static494.anInt7890][local56][3]) * Static241.anInt4678 >> 16);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLjava/awt/Canvas;II)Lclient!pca;")
	public static Class2_Sub26 method4763(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(14) Class local14 = Class.forName("Class2_Sub26_Sub2");
			@Pc(18) Class2_Sub26 local18 = (Class2_Sub26) local14.getDeclaredConstructor().newInstance();
			local18.method8913(arg2, arg1, arg0);
			return local18;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class2_Sub26_Sub1 local31 = new Class2_Sub26_Sub1();
			local31.method8913(arg2, arg1, arg0);
			return local31;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public static void method4764() {
		Static328.aClass69_32.method1905();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Z")
	public static boolean method4765(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 60 || arg0 == 58 || arg0 == 25 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 11 || arg0 == 1001;
		}
	}
}
