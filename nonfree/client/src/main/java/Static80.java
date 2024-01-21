import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "Lclient!gb;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array44;

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "Lclient!md;")
	public static Class30 aClass30_13;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "Z")
	public static volatile boolean aBoolean98 = true;

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1158 = Static33.method650("logo");

	@OriginalMember(owner = "client!o", name = "db", descriptor = "I")
	public static int anInt2138 = 1;

	@OriginalMember(owner = "client!o", name = "eb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1159 = Static33.method650("Loading wordpack )2 ");

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1160 = Static33.method650("(U1");

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1161 = Static33.method650("T");

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
	public static volatile int anInt2144 = 0;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "Lclient!n;")
	public static Class52 aClass52_42 = new Class52(64);

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1162 = Static33.method650("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1163 = Static33.method650("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1164 = aClass56_1159;

	@OriginalMember(owner = "client!o", name = "xb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1165 = Static33.method650("Side panel redrawn");

	@OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
	public static int anInt2149 = 0;

	@OriginalMember(owner = "client!o", name = "Ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1166 = Static33.method650("blinken2:");

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	public static void method1408() {
		Static86.aClass52_46.method1346();
		Static94.aClass52_50.method1346();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(ZI)V")
	public static void method1411(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static109.anInt1678; local3++) {
			@Pc(16) Class3_Sub1_Sub2_Sub4_Sub2 local16 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[Static75.anIntArray176[local3]];
			@Pc(25) int local25 = (Static75.anIntArray176[local3] << 14) + 536870912;
			if (local16 != null && local16.method2033() && arg0 == local16.aClass3_Sub1_Sub17_1.aBoolean158 && local16.aClass3_Sub1_Sub17_1.method1902()) {
				@Pc(50) int local50 = local16.anInt3187 >> 7;
				@Pc(55) int local55 = local16.anInt3196 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local16.anInt3190 == 1 && (local16.anInt3187 & 0x7F) == 64 && (local16.anInt3196 & 0x7F) == 64) {
						if (Static106.anInt2639 == Static4.anIntArrayArray1[local50][local55]) {
							continue;
						}
						Static4.anIntArrayArray1[local50][local55] = Static106.anInt2639;
					}
					if (!local16.aClass3_Sub1_Sub17_1.aBoolean159) {
						local25 += Integer.MIN_VALUE;
					}
					Static116.aClass14_1.method448(Static94.anInt2470, local16.anInt3187, local16.anInt3196, Static27.method560(local16.anInt3190 * 64 + local16.anInt3196 - 64, Static94.anInt2470, local16.anInt3187 + (local16.anInt3190 - 1) * 64), local16.anInt3190 * 64 - 4, local16, local16.anInt3156, local25, local16.aBoolean170);
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
	public static void method1414() {
		aClass56_1158 = null;
		aClass56_1165 = null;
		aClass3_Sub1_Sub1_Sub1_4 = null;
		aClass56_1161 = null;
		aClass56_1162 = null;
		aClass56_1159 = null;
		aClass52_42 = null;
		aClass56_1166 = null;
		aClass30_13 = null;
		aClass56_1164 = null;
		aClass56_1163 = null;
		aClass3_Sub1_Sub1_Sub4Array44 = null;
		aClass56_1160 = null;
	}
}
