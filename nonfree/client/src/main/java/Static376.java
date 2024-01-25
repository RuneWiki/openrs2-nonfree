import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	public static int anInt6106 = 0;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_127 = new Class55("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public static void method4835() {
		if (Static31.anInt529 == -1 || Static352.anInt5640 == -1) {
			return;
		}
		@Pc(24) int local24 = (Static392.anInt6271 * (Static69.anInt1362 - Static53.anInt3263) >> 16) + Static53.anInt3263;
		Static392.anInt6271 += local24;
		if (Static392.anInt6271 >= 65535) {
			Static392.anInt6271 = 65535;
			if (Static225.aBoolean310) {
				Static56.aBoolean60 = false;
			} else {
				Static56.aBoolean60 = true;
			}
			Static225.aBoolean310 = true;
		} else {
			Static225.aBoolean310 = false;
			Static56.aBoolean60 = false;
		}
		@Pc(54) float local54 = (float) Static392.anInt6271 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static79.anInt1608 * 2;
		@Pc(87) int local87;
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(131) int local131;
		@Pc(140) int local140;
		@Pc(159) int local159;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static412.anIntArrayArrayArray13[Static31.anInt529][local61][local63] * 3;
			local87 = Static412.anIntArrayArrayArray13[Static31.anInt529][local61 + 1][local63] * 3;
			local119 = (Static412.anIntArrayArrayArray13[Static31.anInt529][local61 + 2][local63] + Static412.anIntArrayArrayArray13[Static31.anInt529][local61 + 2][local63] - Static412.anIntArrayArrayArray13[Static31.anInt529][local61 + 3][local63]) * 3;
			local127 = Static412.anIntArrayArrayArray13[Static31.anInt529][local61][local63];
			local131 = local87 - local75;
			local140 = local75 + local119 - local87 * 2;
			local159 = Static412.anIntArrayArrayArray13[Static31.anInt529][local61 + 2][local63] + local87 - local119 - local127;
			local57[local63] = (float) local127 + local54 * ((float) local131 + local54 * ((float) local140 + local54 * (float) local159));
		}
		Static181.anInt3254 = (int) local57[2] - Static314.anInt5181 * 128;
		Static212.anInt3801 = (int) local57[1] * -1;
		Static46.anInt737 = (int) local57[0] - Static359.anInt5713 * 128;
		@Pc(215) float[] local215 = new float[3];
		local87 = Static77.anInt1587 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local127 = Static412.anIntArrayArrayArray13[Static352.anInt5640][local87][local119] * 3;
			local131 = Static412.anIntArrayArrayArray13[Static352.anInt5640][local87 + 1][local119] * 3;
			local140 = (Static412.anIntArrayArrayArray13[Static352.anInt5640][local87 + 2][local119] + Static412.anIntArrayArrayArray13[Static352.anInt5640][local87 + 2][local119] - Static412.anIntArrayArrayArray13[Static352.anInt5640][local87 + 3][local119]) * 3;
			local159 = Static412.anIntArrayArrayArray13[Static352.anInt5640][local87][local119];
			@Pc(290) int local290 = local131 - local127;
			@Pc(299) int local299 = local140 + local127 - local131 * 2;
			@Pc(316) int local316 = Static412.anIntArrayArrayArray13[Static352.anInt5640][local87 + 2][local119] + local131 - local159 - local140;
			local215[local119] = ((float) local290 + ((float) local299 + (float) local316 * local54) * local54) * local54 + (float) local159;
		}
		@Pc(350) float local350 = local215[0] - local57[0];
		@Pc(365) float local365 = (local215[1] - local57[1]) * -1.0F;
		@Pc(373) float local373 = local215[2] - local57[2];
		@Pc(383) double local383 = Math.sqrt((double) (local373 * local373 + local350 * local350));
		Static9.anInt55 = (int) (Math.atan2((double) local365, local383) * 2607.5945876176133D) & 0x3FFF;
		Static92.anInt1897 = (int) (-Math.atan2((double) local350, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static408.anInt6454 = (Static392.anInt6271 * (Static412.anIntArrayArrayArray13[Static31.anInt529][local61 + 2][3] - Static412.anIntArrayArrayArray13[Static31.anInt529][local61][3]) >> 16) + Static412.anIntArrayArrayArray13[Static31.anInt529][local61][3];
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZIILclient!go;)V")
	public static void method4839(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class95 arg3) {
		@Pc(8) int local8 = arg3.anInt2595;
		if (arg3.aByte24 == 0) {
			arg3.anInt2595 = arg3.anInt2598;
		} else if (arg3.aByte24 == 1) {
			arg3.anInt2595 = arg0 - arg3.anInt2598;
		} else if (arg3.aByte24 == 2) {
			arg3.anInt2595 = arg3.anInt2598 * arg0 >> 14;
		}
		@Pc(46) int local46 = arg3.anInt2638;
		if (arg3.aByte23 == 0) {
			arg3.anInt2638 = arg3.anInt2633;
		} else if (arg3.aByte23 == 1) {
			arg3.anInt2638 = arg2 - arg3.anInt2633;
		} else if (arg3.aByte23 == 2) {
			arg3.anInt2638 = arg2 * arg3.anInt2633 >> 14;
		}
		if (arg3.aByte24 == 4) {
			arg3.anInt2595 = arg3.anInt2638 * arg3.anInt2600 / arg3.anInt2656;
		}
		if (arg3.aByte23 == 4) {
			arg3.anInt2638 = arg3.anInt2656 * arg3.anInt2595 / arg3.anInt2600;
		}
		if (Static283.aBoolean297 && (Static52.method725(arg3).anInt2235 != 0 || arg3.anInt2616 == 0)) {
			if (arg3.anInt2638 < 5 && arg3.anInt2595 < 5) {
				arg3.anInt2595 = 5;
				arg3.anInt2638 = 5;
			} else {
				if (arg3.anInt2595 <= 0) {
					arg3.anInt2595 = 5;
				}
				if (arg3.anInt2638 <= 0) {
					arg3.anInt2638 = 5;
				}
			}
		}
		if (Static293.anInt4887 == arg3.anInt2607) {
			Static119.aClass95_3 = arg3;
		}
		if (arg1 && arg3.anObjectArray29 != null && (local8 != arg3.anInt2595 || arg3.anInt2638 != local46)) {
			@Pc(198) Class7_Sub18 local198 = new Class7_Sub18();
			local198.anObjectArray1 = arg3.anObjectArray29;
			local198.aClass95_5 = arg3;
			Static451.aClass85_48.method2011(local198);
		}
	}
}
