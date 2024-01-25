import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!sp", name = "wd", descriptor = "I")
	public static int anInt8603;

	@OriginalMember(owner = "client!sp", name = "yd", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!sp", name = "fd", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_276 = new Class123(55, 4);

	@OriginalMember(owner = "client!sp", name = "gd", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_19 = new Class364(12, 4);

	@OriginalMember(owner = "client!sp", name = "rd", descriptor = "I")
	public static int anInt8598 = 0;

	@OriginalMember(owner = "client!sp", name = "sd", descriptor = "I")
	public static int anInt8599 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!r;)V")
	public static void method6686(@OriginalArg(0) int arg0, @OriginalArg(2) Class31 arg1) {
		if (!Static383.aBoolean467) {
			Static473.anInt8222 = 0;
			return;
		}
		if (Static547.aBoolean632) {
			Static374.aLong178 = Static7.aClass29_1.method5617();
		}
		Static388.anInt6724 = 0;
		Static310.anInt5725 = 0;
		Static590.anInt10263 = 0;
		@Pc(25) int[] local25 = arg1.v();
		Static437.anInt7748 = (int) ((float) local25[2] / 3.0F);
		Static219.anInt4579 = (int) ((float) local25[3] / 3.0F);
		arg1.method8057(Static329.anIntArray318);
		if (Static69.anInt6608 != (int) ((float) Static329.anIntArray318[0] / 3.0F) || Static510.anInt8799 != (int) ((float) Static329.anIntArray318[1] / 3.0F)) {
			Static510.anInt8799 = (int) ((float) Static329.anIntArray318[1] / 3.0F);
			Static69.anInt6608 = (int) ((float) Static329.anIntArray318[0] / 3.0F);
			Static176.anInt3895 = Static69.anInt6608 >> 1;
			Static543.anIntArray544 = new int[Static510.anInt8799 * Static69.anInt6608];
			Static459.anInt8016 = Static510.anInt8799 >> 1;
		}
		Static362.aClass42_3 = arg1.method8075();
		Static473.anInt8222 = 0;
		for (@Pc(98) int local98 = 0; local98 < Static259.anInt1154; local98++) {
			Static369.method5230(arg1, Static559.aClass236Array6[local98], arg0);
		}
		for (@Pc(117) int local117 = 0; local117 < Static58.anInt1550; local117++) {
			Static369.method5230(arg1, Static100.aClass236Array5[local117], arg0);
		}
		for (@Pc(134) int local134 = 0; local134 < Static529.anInt9241; local134++) {
			Static369.method5230(arg1, Static71.aClass236Array1[local134], arg0);
		}
		Static325.anInt5933 = 0;
		if (Static473.anInt8222 > 0) {
			@Pc(157) int local157 = Static543.anIntArray544.length;
			@Pc(164) int local164 = local157 - local157 & 0x7;
			@Pc(166) int local166 = 0;
			while (local164 > local166) {
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
			}
			while (local166 < local157) {
				Static543.anIntArray544[local166++] = Integer.MAX_VALUE;
			}
			Static412.anInt7415 = 1;
			for (@Pc(233) int local233 = 0; local233 < Static473.anInt8222; local233++) {
				@Pc(239) Class236 local239 = Static122.aClass236Array3[local233];
				Static585.method7964(local239.aShortArray100[1], local239.aShortArray99[3], local239.aShortArray99[1], local239.aShortArray99[0], local239.aShortArray98[0], local239.aShortArray98[1], local239.aShortArray98[3], local239.aShortArray100[0], local239.aShortArray100[3]);
				Static585.method7964(local239.aShortArray100[2], local239.aShortArray99[3], local239.aShortArray99[2], local239.aShortArray99[1], local239.aShortArray98[1], local239.aShortArray98[2], local239.aShortArray98[3], local239.aShortArray100[1], local239.aShortArray100[3]);
			}
			Static412.anInt7415 = 2;
		}
		if (Static547.aBoolean632) {
			Static125.aLong58 = Static7.aClass29_1.method5617() - Static374.aLong178;
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(IIIIII)V")
	public static void method6687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg0) {
			Static160.method2920(arg3, arg1, arg0, arg4);
		} else if (Static384.anInt6641 <= arg1 - arg0 && Static191.anInt4134 >= arg0 + arg1 && arg3 - arg2 >= Static112.anInt2687 && Static333.anInt6022 >= arg2 + arg3) {
			Static543.method7445(arg4, arg0, arg3, arg2, arg1);
		} else {
			Static547.method7494(arg2, arg4, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "(I)V")
	public static void method6693() {
		for (@Pc(10) Class3_Sub29 local10 = (Class3_Sub29) Static391.aClass244_52.method5572(); local10 != null; local10 = (Class3_Sub29) Static391.aClass244_52.method5576()) {
			if (local10.anInt5015 == -1) {
				local10.anInt5011 = 0;
				if (local10.anInt5007 >= 0 && local10.anInt5012 >= 0 && local10.anInt5007 < Static345.anInt6228 && local10.anInt5012 < Static535.anInt9341) {
					Static368.method5219(local10);
				}
			} else {
				local10.method8128();
			}
		}
	}
}
