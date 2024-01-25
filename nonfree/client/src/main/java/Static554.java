import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vfa", name = "S", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_17 = new Class101(12, 0, 1, 0);

	@OriginalMember(owner = "client!vfa", name = "W", descriptor = "Z")
	public static boolean aBoolean708 = false;

	@OriginalMember(owner = "client!vfa", name = "gb", descriptor = "Lclient!ba;")
	public static final Class23 aClass23_8 = new Class23(1);

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIB)Z")
	public static boolean method7554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = (arg1 & 0x37) == 0 ? Static113.method1787(arg1, arg0) : Static10.method103(arg1, arg0);
		return local22 | (arg0 & 0x10000) != 0 | Static50.method830(arg1, arg0);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7555(@OriginalArg(0) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V")
	public static void method7559() {
		if (Static110.anInt2171 == -1 || Static196.anInt3664 == -1) {
			return;
		}
		@Pc(25) int local25 = (Static87.anInt5335 * (Static98.anInt6241 - Static592.anInt9639) >> 16) + Static592.anInt9639;
		Static87.anInt5335 += local25;
		if (Static87.anInt5335 < 65535) {
			Static104.aBoolean163 = false;
			Static386.aBoolean534 = false;
		} else {
			if (Static104.aBoolean163) {
				Static386.aBoolean534 = false;
			} else {
				Static386.aBoolean534 = true;
			}
			Static87.anInt5335 = 65535;
			Static104.aBoolean163 = true;
		}
		@Pc(57) float local57 = (float) Static87.anInt5335 / 65535.0F;
		@Pc(64) float[] local64 = new float[3];
		@Pc(68) int local68 = Static275.anInt4801 * 2;
		@Pc(94) int local94;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(140) int local140;
		@Pc(149) int local149;
		@Pc(166) int local166;
		for (@Pc(70) int local70 = 0; local70 < 3; local70++) {
			@Pc(82) int local82 = Static405.anIntArrayArrayArray14[Static110.anInt2171][local68][local70] * 3;
			local94 = Static405.anIntArrayArrayArray14[Static110.anInt2171][local68 + 1][local70] * 3;
			local127 = (Static405.anIntArrayArrayArray14[Static110.anInt2171][local68 + 2][local70] + Static405.anIntArrayArrayArray14[Static110.anInt2171][local68 + 2][local70] - Static405.anIntArrayArrayArray14[Static110.anInt2171][local68 + 3][local70]) * 3;
			local135 = Static405.anIntArrayArrayArray14[Static110.anInt2171][local68][local70];
			local140 = local94 - local82;
			local149 = local127 + local82 - local94 * 2;
			local166 = local94 + Static405.anIntArrayArrayArray14[Static110.anInt2171][local68 + 2][local70] - local135 - local127;
			local64[local70] = ((float) local140 + ((float) local166 * local57 + (float) local149) * local57) * local57 + (float) local135;
		}
		Static405.anInt7085 = (int) local64[0] - Static541.anInt9058 * 512;
		Static295.anInt5077 = (int) local64[1] * -1;
		Static59.anInt1132 = (int) local64[2] - Static116.anInt2289 * 512;
		@Pc(222) float[] local222 = new float[3];
		local94 = Static579.anInt9072 * 2;
		for (local127 = 0; local127 < 3; local127++) {
			local135 = Static405.anIntArrayArrayArray14[Static196.anInt3664][local94][local127] * 3;
			local140 = Static405.anIntArrayArrayArray14[Static196.anInt3664][local94 + 1][local127] * 3;
			local149 = (Static405.anIntArrayArrayArray14[Static196.anInt3664][local94 + 2][local127] + Static405.anIntArrayArrayArray14[Static196.anInt3664][local94 + 2][local127] - Static405.anIntArrayArrayArray14[Static196.anInt3664][local94 + 3][local127]) * 3;
			local166 = Static405.anIntArrayArrayArray14[Static196.anInt3664][local94][local127];
			@Pc(298) int local298 = local140 - local135;
			@Pc(307) int local307 = local135 + local149 - local140 * 2;
			@Pc(324) int local324 = Static405.anIntArrayArrayArray14[Static196.anInt3664][local94 + 2][local127] + local140 - local166 - local149;
			local222[local127] = (float) local166 + local57 * (local57 * ((float) local307 + (float) local324 * local57) + (float) local298);
		}
		@Pc(359) float local359 = local222[0] - local64[0];
		@Pc(370) float local370 = -1.0F * (local222[1] - local64[1]);
		@Pc(379) float local379 = local222[2] - local64[2];
		@Pc(389) double local389 = Math.sqrt((double) (local379 * local379 + local359 * local359));
		Static103.anInt2093 = (int) (Math.atan2((double) local370, local389) * 2607.5945876176133D) & 0x3FFF;
		Static561.anInt9344 = (int) (-Math.atan2((double) local359, (double) local379) * 2607.5945876176133D) & 0x3FFF;
		Static395.anInt6894 = ((Static405.anIntArrayArrayArray14[Static110.anInt2171][local68 + 2][3] - Static405.anIntArrayArrayArray14[Static110.anInt2171][local68][3]) * Static87.anInt5335 >> 16) + Static405.anIntArrayArrayArray14[Static110.anInt2171][local68][3];
	}
}
