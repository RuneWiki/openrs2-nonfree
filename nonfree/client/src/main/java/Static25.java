import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!f", name = "O", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_4;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!p;")
	public static Class45 aClass45_12;

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	public static int anInt667 = 2;

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "Lclient!qc;")
	public static Class47 aClass47_7 = new Class47(100);

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_191 = Static13.method257("mapback");

	@OriginalMember(owner = "client!f", name = "sb", descriptor = "Lclient!o;")
	public static Class40 aClass40_192 = Static13.method257("Please reload this page)3");

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	public static void method520() {
		while (true) {
			if (Static56.aClass2_Sub3_Sub1_5.method1742(Static33.anInt785) >= 26) {
				@Pc(17) int local17 = Static56.aClass2_Sub3_Sub1_5.method1743(14);
				if (local17 != 16383) {
					if (Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local17] == null) {
						Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local17] = new Class2_Sub2_Sub12_Sub1_Sub2();
					}
					@Pc(34) Class2_Sub2_Sub12_Sub1_Sub2 local34 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local17];
					Static63.anIntArray326[Static73.anInt1800++] = local17;
					local34.anInt2274 = Static107.anInt2511;
					@Pc(50) int local50 = Static56.aClass2_Sub3_Sub1_5.method1743(5);
					if (local50 > 15) {
						local50 -= 32;
					}
					@Pc(61) int local61 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
					local34.aClass2_Sub2_Sub7_1 = Static36.method640(Static56.aClass2_Sub3_Sub1_5.method1743(13));
					@Pc(78) int local78 = Static56.aClass2_Sub3_Sub1_5.method1743(5);
					@Pc(85) int local85 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
					if (local85 == 1) {
						Static98.anIntArray504[Static53.anInt1190++] = local17;
					}
					local34.anInt2290 = local34.aClass2_Sub2_Sub7_1.anInt767;
					local34.anInt2303 = local34.aClass2_Sub2_Sub7_1.anInt764;
					local34.anInt2322 = local34.aClass2_Sub2_Sub7_1.anInt761;
					local34.anInt2304 = local34.aClass2_Sub2_Sub7_1.anInt771;
					local34.anInt2285 = local34.aClass2_Sub2_Sub7_1.anInt769;
					local34.anInt2278 = local34.aClass2_Sub2_Sub7_1.anInt758;
					if (local78 > 15) {
						local78 -= 32;
					}
					local34.anInt2269 = local34.aClass2_Sub2_Sub7_1.anInt777;
					local34.method1545(local61 == 1, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] + local78, local50 + Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0]);
					continue;
				}
			}
			Static56.aClass2_Sub3_Sub1_5.method1739();
			return;
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void method524() {
		Static87.aClass18_1.method1280();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static88.aLongArray5[local6] = 0L;
		}
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static97.aLongArray6[local18] = 0L;
		}
		Static23.anInt587 = 0;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public static void method525() {
		aClass45_12 = null;
		aClass40_192 = null;
		aClass47_7 = null;
		aFontMetrics1 = null;
		aClass5_Sub1_4 = null;
		aClass40_191 = null;
		anIntArray126 = null;
	}
}
