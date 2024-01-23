import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
	public static int anInt1930;

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array5;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "[Lclient!ic;")
	public static Class75[] aClass75Array1 = new Class75[4];

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "Lclient!hh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
	public static int anInt1933 = 0;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method1412() {
		if (Static248.anInt5065 == -1 || Static226.anInt4821 == -1) {
			return;
		}
		@Pc(24) int local24 = (Static121.anInt2631 * (Static124.anInt2703 - Static270.anInt5407) >> 16) + Static270.anInt5407;
		@Pc(27) float[] local27 = new float[3];
		Static121.anInt2631 += local24;
		if (Static121.anInt2631 >= 65535) {
			if (Static148.aBoolean216) {
				Static2.aBoolean2 = false;
			} else {
				Static2.aBoolean2 = true;
			}
			Static121.anInt2631 = 65535;
			Static148.aBoolean216 = true;
		} else {
			Static2.aBoolean2 = false;
			Static148.aBoolean216 = false;
		}
		@Pc(61) int local61 = Static299.anInt5948 * 2;
		@Pc(66) float local66 = (float) Static121.anInt2631 / 65535.0F;
		@Pc(81) int local81;
		@Pc(93) int local93;
		@Pc(126) int local126;
		@Pc(134) int local134;
		@Pc(139) int local139;
		@Pc(149) int local149;
		@Pc(168) int local168;
		for (@Pc(68) int local68 = 0; local68 < 3; local68++) {
			local81 = Static167.anIntArrayArrayArray7[Static248.anInt5065][local61][local68] * 3;
			local93 = Static167.anIntArrayArrayArray7[Static248.anInt5065][local61 + 1][local68] * 3;
			local126 = (Static167.anIntArrayArrayArray7[Static248.anInt5065][local61 + 2][local68] + Static167.anIntArrayArrayArray7[Static248.anInt5065][local61 + 2][local68] - Static167.anIntArrayArrayArray7[Static248.anInt5065][local61 + 3][local68]) * 3;
			local134 = Static167.anIntArrayArrayArray7[Static248.anInt5065][local61][local68];
			local139 = local93 - local81;
			local149 = local81 + local126 - local93 * 2;
			local168 = Static167.anIntArrayArrayArray7[Static248.anInt5065][local61 - -2][local68] + local93 - local126 - local134;
			local27[local68] = (float) local134 + ((float) local139 + local66 * ((float) local149 + (float) local168 * local66)) * local66;
		}
		Static58.anInt1269 = (int) local27[0] - Static159.anInt3527 * 128;
		Static315.anInt6297 = (int) local27[1] * -1;
		Static94.anInt2161 = (int) local27[2] - Static217.anInt4673 * 128;
		@Pc(221) float[] local221 = new float[3];
		local81 = Static66.anInt4756 * 2;
		for (local93 = 0; local93 < 3; local93++) {
			local126 = Static167.anIntArrayArrayArray7[Static226.anInt4821][local81][local93] * 3;
			local134 = Static167.anIntArrayArrayArray7[Static226.anInt4821][local81 + 1][local93] * 3;
			local139 = (Static167.anIntArrayArrayArray7[Static226.anInt4821][local81 + 2][local93] + Static167.anIntArrayArrayArray7[Static226.anInt4821][local81 + 2][local93] - Static167.anIntArrayArrayArray7[Static226.anInt4821][local81 + 3][local93]) * 3;
			local149 = Static167.anIntArrayArrayArray7[Static226.anInt4821][local81][local93];
			local168 = local134 - local126;
			@Pc(308) int local308 = local139 + local126 - local134 * 2;
			@Pc(326) int local326 = local134 + Static167.anIntArrayArrayArray7[Static226.anInt4821][local81 + 2][local93] - local149 - local139;
			local221[local93] = (float) local149 + ((float) local168 + local66 * (local66 * (float) local326 + (float) local308)) * local66;
		}
		@Pc(357) float local357 = local221[0] - local27[0];
		@Pc(367) float local367 = -1.0F * (local221[1] - local27[1]);
		@Pc(376) float local376 = local221[2] - local27[2];
		@Pc(386) double local386 = Math.sqrt((double) (local357 * local357 + local376 * local376));
		Static194.aFloat43 = (float) Math.atan2((double) local367, local386);
		Static192.aFloat42 = -((float) Math.atan2((double) local357, (double) local376));
		Static44.anInt1071 = (int) ((double) Static194.aFloat43 * 325.949D) & 0x7FF;
		Static120.anInt6251 = (int) ((double) Static192.aFloat42 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(III)V")
	public static void method1413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static99.method1656(arg0)) {
			Static209.method3350(arg1, Static34.aClass191ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)V")
	public static void method1415() {
		Static214.aClass89_32.method2265();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZBIZ)V")
	public static void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static118.method1908(arg1, 0, arg2, Static313.aClass80_Sub1Array2.length - 1, arg3, arg0);
	}
}
