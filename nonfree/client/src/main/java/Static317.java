import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kv", name = "mb", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z")
	public static boolean method5006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(DI)V")
	public static void method5009(@OriginalArg(0) double arg0) {
		Static378.aClass26_6.method6447(Static5.aClass26_11);
		Static378.aClass26_6.method6443(0, 0, (int) arg0);
		Static117.aClass137_46.method7950(Static378.aClass26_6);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
	public static void method5018() {
		Static15.method141(Static56.aClass14_Sub22_5.aClass21_Sub26_1.method8389() == 1);
		Static113.aClass112_2 = Static372.method5548(Static68.aCanvas2, 22050, 0, Static234.aClass333_5);
		Static254.method3733(Static191.method2988((Class14_Sub5_Sub2) null));
		Static248.aClass112_3 = Static372.method5548(Static68.aCanvas2, 2048, 1, Static234.aClass333_5);
		Static217.aClass14_Sub5_Sub3_1 = new Class14_Sub5_Sub3();
		Static248.aClass112_3.method5376(Static217.aClass14_Sub5_Sub3_1);
		Static360.aClass147_1 = new Class147(22050, Static515.anInt9036);
		Static669.method9260();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5023(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static592.anInt1870; local18++) {
			if (arg0.equalsIgnoreCase(Static369.aStringArray24[local18])) {
				return local18;
			}
		}
		return -1;
	}
}
