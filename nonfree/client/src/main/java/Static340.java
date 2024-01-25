import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!po;")
	public static Class165 aClass165_2;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!vq", name = "tb", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!vq", name = "cb", descriptor = "[Lclient!ji;")
	public static final Class105[] aClass105Array1 = new Class105[8];

	@OriginalMember(owner = "client!vq", name = "hb", descriptor = "I")
	public static int anInt6545 = 0;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg6 < 1 || Static233.anInt5573 - 2 < arg0 || arg6 > Static134.anInt2971 - 2) {
			return;
		}
		if (!Static40.method953() && !Static106.method2323(arg6, arg0, Static141.anInt6334, arg5)) {
			return;
		}
		if (Static77.aClass194ArrayArrayArray1 == null) {
			return;
		}
		@Pc(42) int local42 = arg5;
		if (arg5 < 3 && Static187.method3663(arg0, arg6)) {
			local42 = arg5 + 1;
		}
		Static161.method3251(arg5, local42, arg6, Static29.aClass71Array1[arg5], Static208.aClass32_11, arg2, arg0);
		if (arg7 < 0) {
			return;
		}
		@Pc(71) boolean local71 = Static84.aBoolean195;
		Static84.aBoolean195 = true;
		Static71.method3160(arg3, Static208.aClass32_11, local42, arg5, false, arg4, arg7, arg1, arg0, false, arg6, Static29.aClass71Array1[arg5]);
		Static84.aBoolean195 = local71;
		return;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)I")
	public static int method5486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(30) int local30 = 255 - arg0;
		return local26 + (((arg1 & 0xFF00FF) * local30 & 0xFF00FF00 | local30 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
	public static void method5487() {
		if (Static224.anInt4662 == -1 || Static227.anInt4727 == -1) {
			return;
		}
		@Pc(23) int local23 = Static179.anInt3885 + (Static95.anInt2325 * (Static140.anInt3089 - Static179.anInt3885) >> 16);
		Static95.anInt2325 += local23;
		if (Static95.anInt2325 < 65535) {
			Static42.aBoolean128 = false;
			Static80.aBoolean190 = false;
		} else {
			if (Static80.aBoolean190) {
				Static42.aBoolean128 = false;
			} else {
				Static42.aBoolean128 = true;
			}
			Static95.anInt2325 = 65535;
			Static80.aBoolean190 = true;
		}
		@Pc(53) float local53 = (float) Static95.anInt2325 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static59.anInt1751 * 2;
		@Pc(86) int local86;
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(132) int local132;
		@Pc(141) int local141;
		@Pc(158) int local158;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(74) int local74 = Static191.anIntArrayArrayArray11[Static224.anInt4662][local60][local62] * 3;
			local86 = Static191.anIntArrayArrayArray11[Static224.anInt4662][local60 + 1][local62] * 3;
			local119 = (Static191.anIntArrayArrayArray11[Static224.anInt4662][local60 + 2][local62] + Static191.anIntArrayArrayArray11[Static224.anInt4662][local60 + 2][local62] - Static191.anIntArrayArrayArray11[Static224.anInt4662][local60 + 3][local62]) * 3;
			local127 = Static191.anIntArrayArrayArray11[Static224.anInt4662][local60][local62];
			local132 = local86 - local74;
			local141 = local119 + local74 - local86 * 2;
			local158 = Static191.anIntArrayArrayArray11[Static224.anInt4662][local60 + 2][local62] + local86 - local127 - local119;
			local56[local62] = local53 * ((float) local132 + local53 * ((float) local141 + (float) local158 * local53)) + (float) local127;
		}
		Static95.anInt2319 = (int) local56[1] * -1;
		Static64.anInt1797 = (int) local56[2] - Static32.anInt2224 * 128;
		Static320.anInt5326 = (int) local56[0] - Static234.anInt4783 * 128;
		@Pc(214) float[] local214 = new float[3];
		local86 = Static117.anInt2675 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local127 = Static191.anIntArrayArrayArray11[Static227.anInt4727][local86][local119] * 3;
			local132 = Static191.anIntArrayArrayArray11[Static227.anInt4727][local86 + 1][local119] * 3;
			local141 = (Static191.anIntArrayArrayArray11[Static227.anInt4727][local86 + 2][local119] + Static191.anIntArrayArrayArray11[Static227.anInt4727][local86 + 2][local119] - Static191.anIntArrayArrayArray11[Static227.anInt4727][local86 + 3][local119]) * 3;
			local158 = Static191.anIntArrayArrayArray11[Static227.anInt4727][local86][local119];
			@Pc(291) int local291 = local132 - local127;
			@Pc(300) int local300 = local127 + local141 - local132 * 2;
			@Pc(319) int local319 = Static191.anIntArrayArrayArray11[Static227.anInt4727][local86 + 2][local119] + local132 - local158 - local141;
			local214[local119] = (float) local158 + local53 * ((float) local291 + (local53 * (float) local319 + (float) local300) * local53);
		}
		@Pc(354) float local354 = local214[0] - local56[0];
		@Pc(365) float local365 = -1.0F * (local214[1] - local56[1]);
		@Pc(373) float local373 = local214[2] - local56[2];
		@Pc(388) double local388 = Math.sqrt((double) (local373 * local373 + local354 * local354));
		Static179.anInt3884 = (int) (Math.atan2((double) local365, local388) * 2607.5945876176133D) & 0x3FFF;
		Static18.anInt555 = (int) (-Math.atan2((double) local354, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static121.anInt2762 = Static191.anIntArrayArrayArray11[Static224.anInt4662][local60][3] + ((Static191.anIntArrayArrayArray11[Static224.anInt4662][local60 + 2][3] - Static191.anIntArrayArrayArray11[Static224.anInt4662][local60][3]) * Static95.anInt2325 >> 16);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLclient!aq;)Lclient!aq;")
	public static Class12 method5488(@OriginalArg(1) Class12 arg0) {
		@Pc(11) Class12 local11 = Static44.method1014(arg0);
		if (local11 == null) {
			local11 = arg0.aClass12_2;
		}
		return local11;
	}
}
