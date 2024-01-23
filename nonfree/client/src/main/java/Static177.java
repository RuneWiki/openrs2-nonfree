import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!uj;")
	public static Class4_Sub3_Sub14 aClass4_Sub3_Sub14_3;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	public static int anInt3358;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
	public static int anInt3360;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
	public static int anInt3357 = 0;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString207 = "Connection lost.";

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!cc;")
	public static Class26 aClass26_32 = new Class26(50);

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray28 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void method2783() {
		if (Static121.aFloat68 < Static121.aFloat69) {
			Static121.aFloat68 = (float) ((double) Static121.aFloat68 + (double) Static121.aFloat68 / 30.0D);
			if (Static121.aFloat69 < Static121.aFloat68) {
				Static121.aFloat68 = Static121.aFloat69;
			}
			Static204.method3262();
		} else if (Static121.aFloat68 > Static121.aFloat69) {
			Static121.aFloat68 = (float) ((double) Static121.aFloat68 - (double) Static121.aFloat68 / 30.0D);
			if (Static121.aFloat68 < Static121.aFloat69) {
				Static121.aFloat68 = Static121.aFloat69;
			}
			Static204.method3262();
		}
		if (Static229.anInt4394 != -1 && Static16.anInt929 != -1) {
			@Pc(64) int local64 = Static16.anInt929 - Static275.anInt5232;
			@Pc(69) int local69 = Static229.anInt4394 - Static22.anInt331;
			if (local64 < 2 || local64 > 2) {
				local64 >>= 0x4;
			}
			Static275.anInt5232 -= -local64;
			if (local69 < 2 || local69 > 2) {
				local69 >>= 0x4;
			}
			if (local69 == 0 && local64 == 0) {
				Static16.anInt929 = -1;
				Static229.anInt4394 = -1;
			}
			Static22.anInt331 += local69;
			Static204.method3262();
		}
		if (Static145.anInt2853 > 0) {
			Static216.anInt4216--;
			if (Static216.anInt4216 == 0) {
				Static145.anInt2853--;
				Static216.anInt4216 = 100;
			}
		} else {
			Static204.anInt3920 = -1;
			Static81.anInt1874 = -1;
		}
		if (!Static123.aBoolean166 || Static113.aClass114_13 == null) {
			return;
		}
		for (@Pc(153) Class4_Sub17 local153 = (Class4_Sub17) Static113.aClass114_13.method2623(); local153 != null; local153 = (Class4_Sub17) Static113.aClass114_13.method2629()) {
			@Pc(161) Class83 local161 = Static142.method2192(local153.aClass4_Sub3_Sub7_1.anInt1760);
			if (Static39.anInt640 == 0 && local153.method2936(Static286.anInt5358, Static312.anInt6042)) {
				if (!local153.aClass4_Sub3_Sub7_1.aBoolean105) {
					local153.aClass4_Sub3_Sub7_1.aBoolean105 = true;
					Static172.method2723(15, local153.aClass4_Sub3_Sub7_1.anInt1760, local161.anInt2284);
				}
				if (local153.aClass4_Sub3_Sub7_1.aBoolean105) {
					Static172.method2723(17, local153.aClass4_Sub3_Sub7_1.anInt1760, local161.anInt2284);
				}
			} else if (local153.aClass4_Sub3_Sub7_1.aBoolean105) {
				local153.aClass4_Sub3_Sub7_1.aBoolean105 = false;
				Static172.method2723(16, local153.aClass4_Sub3_Sub7_1.anInt1760, local161.anInt2284);
			}
		}
	}
}
