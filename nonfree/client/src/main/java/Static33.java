import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
	public static int[] anIntArray67;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
	public static int[] anIntArray68;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_401 = Static51.method932("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public static void method673() {
		Static75.aClass2_Sub11_Sub1_1.method1498();
		@Pc(7) int local7 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
		if (local7 == 0) {
			return;
		}
		@Pc(22) int local22 = Static75.aClass2_Sub11_Sub1_1.method1490(2);
		if (local22 == 0) {
			Static142.anIntArray334[Static97.anInt2273++] = 2047;
			return;
		}
		@Pc(51) int local51;
		@Pc(61) int local61;
		if (local22 == 1) {
			local51 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
			Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.method2461(false, local51);
			local61 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
			if (local61 == 1) {
				Static142.anIntArray334[Static97.anInt2273++] = 2047;
			}
			return;
		}
		@Pc(103) int local103;
		if (local22 == 2) {
			local51 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
			Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.method2461(true, local51);
			local61 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
			Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.method2461(true, local61);
			local103 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
			if (local103 == 1) {
				Static142.anIntArray334[Static97.anInt2273++] = 2047;
			}
		} else if (local22 == 3) {
			local51 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
			local61 = Static75.aClass2_Sub11_Sub1_1.method1490(7);
			local103 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
			if (local103 == 1) {
				Static142.anIntArray334[Static97.anInt2273++] = 2047;
			}
			Static56.anInt1432 = Static75.aClass2_Sub11_Sub1_1.method1490(2);
			@Pc(160) int local160 = Static75.aClass2_Sub11_Sub1_1.method1490(7);
			Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.method2468(local160, local51 == 1, local61);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public static void method674(@OriginalArg(0) int arg0) {
		Static56.anInt1431 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public static void method675() {
		anIntArray67 = null;
		aClass10_401 = null;
		aLongArray3 = null;
		anIntArray68 = null;
	}
}
