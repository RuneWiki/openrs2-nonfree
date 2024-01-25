import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt7631;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public static int anInt7634;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!sg;")
	public static Class226 aClass226_15;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static int anInt7629 = -1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_115 = new Class217(64, 7);

	@OriginalMember(owner = "client!g", name = "g", descriptor = "I")
	public static int anInt7632 = 0;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
	public static int[] anIntArray532 = new int[1];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method5962() {
		if (Static166.anInt3384 == -1 || Static362.anInt6125 == -1) {
			return;
		}
		@Pc(21) int local21 = ((Static219.anInt4145 - Static49.anInt1182) * Static374.anInt6290 >> 16) + Static49.anInt1182;
		Static374.anInt6290 += local21;
		if (Static374.anInt6290 < 65535) {
			Static454.aBoolean658 = false;
			Static169.aBoolean498 = false;
		} else {
			Static374.anInt6290 = 65535;
			if (Static169.aBoolean498) {
				Static454.aBoolean658 = false;
			} else {
				Static454.aBoolean658 = true;
			}
			Static169.aBoolean498 = true;
		}
		@Pc(49) float local49 = (float) Static374.anInt6290 / 65535.0F;
		@Pc(52) float[] local52 = new float[3];
		@Pc(56) int local56 = Static106.anInt2386 * 2;
		@Pc(81) int local81;
		@Pc(114) int local114;
		@Pc(122) int local122;
		@Pc(127) int local127;
		@Pc(136) int local136;
		@Pc(154) int local154;
		for (@Pc(58) int local58 = 0; local58 < 3; local58++) {
			@Pc(69) int local69 = Static431.anIntArrayArrayArray14[Static166.anInt3384][local56][local58] * 3;
			local81 = Static431.anIntArrayArrayArray14[Static166.anInt3384][local56 + 1][local58] * 3;
			local114 = (Static431.anIntArrayArrayArray14[Static166.anInt3384][local56 + 2][local58] + Static431.anIntArrayArrayArray14[Static166.anInt3384][local56 + 2][local58] - Static431.anIntArrayArrayArray14[Static166.anInt3384][local56 + 3][local58]) * 3;
			local122 = Static431.anIntArrayArrayArray14[Static166.anInt3384][local56][local58];
			local127 = local81 - local69;
			local136 = local69 + local114 - local81 * 2;
			local154 = local81 + Static431.anIntArrayArrayArray14[Static166.anInt3384][local56 + 2][local58] - local114 - local122;
			local52[local58] = (float) local122 + local49 * (((float) local154 * local49 + (float) local136) * local49 + (float) local127);
		}
		Static276.anInt5105 = (int) local52[0] - Static223.anInt7618 * 128;
		Static265.anInt5008 = (int) local52[2] - Static57.anInt5085 * 128;
		Static439.anInt7400 = (int) local52[1] * -1;
		@Pc(207) float[] local207 = new float[3];
		local81 = Static198.anInt3915 * 2;
		for (local114 = 0; local114 < 3; local114++) {
			local122 = Static431.anIntArrayArrayArray14[Static362.anInt6125][local81][local114] * 3;
			local127 = Static431.anIntArrayArrayArray14[Static362.anInt6125][local81 + 1][local114] * 3;
			local136 = (Static431.anIntArrayArrayArray14[Static362.anInt6125][local81 + 2][local114] + Static431.anIntArrayArrayArray14[Static362.anInt6125][local81 + 2][local114] - Static431.anIntArrayArrayArray14[Static362.anInt6125][local81 + 3][local114]) * 3;
			local154 = Static431.anIntArrayArrayArray14[Static362.anInt6125][local81][local114];
			@Pc(282) int local282 = local127 - local122;
			@Pc(290) int local290 = local122 + local136 - local127 * 2;
			@Pc(307) int local307 = local127 + Static431.anIntArrayArrayArray14[Static362.anInt6125][local81 + 2][local114] - local154 - local136;
			local207[local114] = ((float) local282 + local49 * (local49 * (float) local307 + (float) local290)) * local49 + (float) local154;
		}
		@Pc(339) float local339 = local207[0] - local52[0];
		@Pc(354) float local354 = (local207[1] - local52[1]) * -1.0F;
		@Pc(362) float local362 = local207[2] - local52[2];
		@Pc(372) double local372 = Math.sqrt((double) (local339 * local339 + local362 * local362));
		Static298.anInt5734 = (int) (Math.atan2((double) local354, local372) * 2607.5945876176133D) & 0x3FFF;
		Static445.anInt7532 = (int) (-Math.atan2((double) local339, (double) local362) * 2607.5945876176133D) & 0x3FFF;
		Static445.anInt7524 = Static431.anIntArrayArrayArray14[Static166.anInt3384][local56][3] + (Static374.anInt6290 * (Static431.anIntArrayArrayArray14[Static166.anInt3384][local56 + 2][3] - Static431.anIntArrayArrayArray14[Static166.anInt3384][local56][3]) >> 16);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	public static void method5964(@OriginalArg(0) int arg0) {
		Static182.anInt3626 = arg0;
		@Pc(12) Class126 local12 = Static179.aClass126_46;
		synchronized (Static179.aClass126_46) {
			Static179.aClass126_46.method3135();
		}
		local12 = Static219.aClass126_25;
		synchronized (Static219.aClass126_25) {
			Static219.aClass126_25.method3135();
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public static void method5967() {
		Static177.aClass11_21.method312();
		Static286.aClass11_6.method312();
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
	public static void method5969() {
		Static452.aClass3_Sub5_Sub4_3.method5157();
		Static410.anInt6753 = 1;
		Static50.aClass32_21 = null;
	}
}
