import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!be;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!gd;")
	private static Class23 aClass23_150 = Static15.method178("Please reload this page)3");

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!gd;")
	private static Class23 aClass23_151 = Static15.method178("Loading friend list");

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_152 = aClass23_151;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!gd;")
	public static Class23 aClass23_153 = Static15.method178("::clientdrop");

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "[Lclient!gd;")
	public static Class23[] aClass23Array4 = new Class23[200];

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public static int anInt186 = 0;

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	public static int anInt187 = 0;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!gd;")
	private static Class23 aClass23_154 = Static15.method178("green:");

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[104][104];

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_155 = aClass23_154;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Lclient!gd;")
	private static Class23 aClass23_157 = Static15.method178(" from your ignore list first");

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_156 = aClass23_157;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!gd;")
	public static Class23 aClass23_158 = aClass23_150;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Lclient!gd;")
	public static Class23 aClass23_159 = Static15.method178("@cr1@");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIII)I")
	public static int method95(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static95.aByteArrayArrayArray5[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static95.aByteArrayArrayArray5[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method100() {
		aClass23_158 = null;
		aClass23_150 = null;
		aClass23_153 = null;
		aClass23_156 = null;
		aClass23_152 = null;
		aClass23_157 = null;
		anIntArray37 = null;
		aClass23Array4 = null;
		aClass23_151 = null;
		aClass23_155 = null;
		aClass23_154 = null;
		aClass23_159 = null;
		aClass9_1 = null;
		anIntArrayArray7 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIIII)V")
	public static void method101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static104.anInt2681 == arg4 && Static110.anInt2867 == arg1 && (arg0 == Static61.anInt1894 || !Static9.aBoolean7)) {
			return;
		}
		Static110.anInt2867 = arg1;
		Static104.anInt2681 = arg4;
		Static61.anInt1894 = arg0;
		if (!Static9.aBoolean7) {
			Static61.anInt1894 = 0;
		}
		Static89.method1524(25);
		Static83.method1459(false, null, Static56.aClass23_933);
		@Pc(35) int local35 = Static104.anInt2684;
		@Pc(37) int local37 = Static107.anInt2745;
		Static104.anInt2684 = (arg4 - 6) * 8;
		@Pc(52) int local52 = Static104.anInt2684 - local35;
		Static107.anInt2745 = arg1 * 8 - 48;
		@Pc(65) int local65 = Static107.anInt2745 - local37;
		for (@Pc(69) int local69 = 0; local69 < 32768; local69++) {
			@Pc(74) Class1_Sub1_Sub2_Sub1_Sub1 local74 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local69];
			if (local74 != null) {
				for (@Pc(78) int local78 = 0; local78 < 10; local78++) {
					local74.anIntArray264[local78] -= local52;
					local74.anIntArray266[local78] -= local65;
				}
				local74.anInt2232 -= local65 * 128;
				local74.anInt2196 -= local52 * 128;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < 2048; local121++) {
			@Pc(126) Class1_Sub1_Sub2_Sub1_Sub2 local126 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local121];
			if (local126 != null) {
				for (@Pc(130) int local130 = 0; local130 < 10; local130++) {
					local126.anIntArray264[local130] -= local52;
					local126.anIntArray266[local130] -= local65;
				}
				local126.anInt2232 -= local65 * 128;
				local126.anInt2196 -= local52 * 128;
			}
		}
		Static79.anInt2137 = arg0;
		Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1391(arg3, false, arg2);
		@Pc(183) byte local183 = 0;
		@Pc(185) byte local185 = 1;
		@Pc(187) byte local187 = 104;
		if (local52 < 0) {
			local185 = -1;
			local187 = -1;
			local183 = 103;
		}
		@Pc(200) byte local200 = 0;
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 104;
		if (local65 < 0) {
			local204 = -1;
			local200 = 103;
			local202 = -1;
		}
		for (@Pc(217) int local217 = local183; local217 != local187; local217 += local185) {
			for (@Pc(220) int local220 = local200; local220 != local204; local220 += local202) {
				@Pc(226) int local226 = local217 + local52;
				@Pc(230) int local230 = local65 + local220;
				for (@Pc(232) int local232 = 0; local232 < 4; local232++) {
					if (local226 >= 0 && local230 >= 0 && local226 < 104 && local230 < 104) {
						Static49.aClass45ArrayArrayArray3[local232][local217][local220] = Static49.aClass45ArrayArrayArray3[local232][local226][local230];
					} else {
						Static49.aClass45ArrayArrayArray3[local232][local217][local220] = null;
					}
				}
			}
		}
		for (@Pc(298) Class1_Sub11 local298 = (Class1_Sub11) Static109.aClass45_9.method1299(); local298 != null; local298 = (Class1_Sub11) Static109.aClass45_9.method1288()) {
			local298.anInt2041 -= local65;
			local298.anInt2039 -= local52;
			if (local298.anInt2039 < 0 || local298.anInt2041 < 0 || local298.anInt2039 >= 104 || local298.anInt2041 >= 104) {
				local298.method1913();
			}
		}
		Static9.aBoolean5 = false;
		Static105.anInt2698 = -1;
		Static111.anInt2901 = 0;
		if (Static40.anInt1397 != 0) {
			Static28.anInt2178 -= local65;
			Static40.anInt1397 -= local52;
		}
		Static71.aClass45_5.method1291();
		Static20.aClass45_1.method1291();
	}
}
