import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
	public static int anInt430;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "[Lclient!ec;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "Lclient!qf;")
	private static Class60 aClass60_190 = Static59.method1195("Prepared sound engine");

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Lclient!qf;")
	public static Class60 aClass60_183 = aClass60_190;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "Lclient!qf;")
	private static Class60 aClass60_187 = Static59.method1195("Loaded sprites");

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "Lclient!qf;")
	public static Class60 aClass60_184 = aClass60_187;

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "Lclient!qf;")
	private static Class60 aClass60_194 = Static59.method1195("Free world");

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Lclient!qf;")
	public static Class60 aClass60_185 = aClass60_194;

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "Lclient!qf;")
	public static Class60 aClass60_188 = Static59.method1195(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "[I")
	public static int[] anIntArray56 = new int[2048];

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_189 = Static59.method1195("titlebutton");

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
	public static volatile int anInt433 = 0;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!qf;")
	public static Class60 aClass60_191 = Static59.method1195("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "Lclient!qf;")
	public static Class60 aClass60_192 = Static59.method1195("(U5");

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
	public static int anInt434 = 0;

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "Lclient!qf;")
	public static Class60 aClass60_193 = Static59.method1195(",Zffentlicher Chat");

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public static void method368() {
		aClass60_183 = null;
		aClass60_189 = null;
		aClass60_185 = null;
		aClass60_190 = null;
		anIntArray56 = null;
		aClass60_191 = null;
		aClass18Array1 = null;
		aClass60_193 = null;
		aClass60_192 = null;
		aClass60_184 = null;
		aClass3_Sub1_Sub2_Sub3Array1 = null;
		aClass60_194 = null;
		aClass60_187 = null;
		aClass60_188 = null;
		anIntArray57 = null;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public static void method369() {
		if (Static109.aBooleanArray65[98]) {
			Static48.anInt1551 += (12 - Static48.anInt1551) / 2;
		} else if (Static109.aBooleanArray65[99]) {
			Static48.anInt1551 += (-Static48.anInt1551 - 12) / 2;
		} else {
			Static48.anInt1551 /= 2;
		}
		Static52.anInt1724 += Static48.anInt1551 / 2;
		if (Static109.aBooleanArray65[96]) {
			Static125.anInt3380 += (-Static125.anInt3380 - 24) / 2;
		} else if (Static109.aBooleanArray65[97]) {
			Static125.anInt3380 += (24 - Static125.anInt3380) / 2;
		} else {
			Static125.anInt3380 /= 2;
		}
		@Pc(82) int local82 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1524 + Static128.anInt3458;
		if (Static52.anInt1724 < 128) {
			Static52.anInt1724 = 128;
		}
		Static107.anInt3040 = Static125.anInt3380 / 2 + Static107.anInt3040 & 0x7FF;
		@Pc(106) int local106 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt1494 + Static125.anInt3376;
		if (Static24.anInt919 - local82 < -500 || Static24.anInt919 - local82 > 500 || Static57.anInt3396 - local106 < -500 || Static57.anInt3396 - local106 > 500) {
			Static57.anInt3396 = local106;
			Static24.anInt919 = local82;
		}
		if (local82 != Static24.anInt919) {
			Static24.anInt919 += (local82 - Static24.anInt919) / 16;
		}
		@Pc(156) int local156 = Static24.anInt919 >> 7;
		@Pc(158) int local158 = 0;
		if (Static52.anInt1724 > 383) {
			Static52.anInt1724 = 383;
		}
		if (Static57.anInt3396 != local106) {
			Static57.anInt3396 += (local106 - Static57.anInt3396) / 16;
		}
		@Pc(183) int local183 = Static57.anInt3396 >> 7;
		@Pc(189) int local189 = Static66.method1353(Static24.anInt919, Static119.anInt3243, Static57.anInt3396);
		@Pc(207) int local207;
		if (local156 > 3 && local183 > 3 && local156 < 100 && local183 < 100) {
			for (local207 = local156 - 4; local207 <= local156 + 4; local207++) {
				for (@Pc(213) int local213 = local183 - 4; local213 <= local183 + 4; local213++) {
					@Pc(217) int local217 = Static119.anInt3243;
					if (local217 < 3 && (Static60.aByteArrayArrayArray4[1][local207][local213] & 0x2) == 2) {
						local217++;
					}
					@Pc(245) int local245 = local189 - Static51.anIntArrayArrayArray3[local217][local207][local213];
					if (local245 > local158) {
						local158 = local245;
					}
				}
			}
		}
		local207 = local158 * 192;
		if (local207 > 98048) {
			local207 = 98048;
		}
		if (local207 < 32768) {
			local207 = 32768;
		}
		if (Static114.anInt3197 < local207) {
			Static114.anInt3197 += (local207 - Static114.anInt3197) / 24;
		} else if (Static114.anInt3197 > local207) {
			Static114.anInt3197 += (local207 - Static114.anInt3197) / 80;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I")
	public static int method370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static65.method1338(4, arg0 + 91923, arg1 - -45365) + (Static65.method1338(2, arg0 + 37821, arg1 - -10294) - 128 >> 1) + (Static65.method1338(1, arg0, arg1) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}
}
