import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "Lclient!mg;")
	public static Class2_Sub5_Sub3 aClass2_Sub5_Sub3_4;

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
	public static int anInt5943;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
	public static int anInt5935 = 0;

	@OriginalMember(owner = "client!aa", name = "X", descriptor = "Lclient!a;")
	public static Class1 aClass1_34 = new Class1();

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
	public static int anInt5946 = 0;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V")
	public static void method4757() {
		Static292.anIntArray519 = Static192.method3213(0.4F);
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)V")
	public static void method4758() {
		for (@Pc(1) int local1 = 0; local1 < Static63.anInt1426; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static26.anInt552; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static232.anInt4787; local11++) {
					@Pc(22) Class2_Sub31 local22 = Static180.aClass2_Sub31ArrayArrayArray2[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class168 local27 = local22.aClass168_1;
						if (local27 != null && local27.aClass36_10.method4891()) {
							Static156.method4440(local27.aClass36_10, local1, local6, local11, 1, 1);
							if (local27.aClass36_9 != null && local27.aClass36_9.method4891()) {
								Static156.method4440(local27.aClass36_9, local1, local6, local11, 1, 1);
								local27.aClass36_10.method4877(local27.aClass36_9, 0, 0, 0, false);
								local27.aClass36_9 = local27.aClass36_9.method4889();
							}
							local27.aClass36_10 = local27.aClass36_10.method4889();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt5708; local83++) {
							@Pc(92) Class34 local92 = local22.aClass34Array2[local83];
							if (local92 != null && local92.aClass36_1.method4891()) {
								Static156.method4440(local92.aClass36_1, local1, local6, local11, local92.anInt896 + 1 - local92.anInt894, local92.anInt902 - local92.anInt897 + 1);
								local92.aClass36_1 = local92.aClass36_1.method4889();
							}
						}
						@Pc(131) Class65 local131 = local22.aClass65_1;
						if (local131 != null && local131.aClass36_5.method4891()) {
							Static107.method1995(local131.aClass36_5, local1, local6, local11);
							local131.aClass36_5 = local131.aClass36_5.method4889();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!bc;B)V")
	public static void method4761(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(1) long local1 = 0L;
		@Pc(15) int local15 = -1;
		if (arg0.anInt400 == 0) {
			local1 = Static243.method3054(arg0.anInt390, arg0.anInt405, arg0.anInt389);
		}
		if (arg0.anInt400 == 1) {
			local1 = Static103.method1930(arg0.anInt390, arg0.anInt405, arg0.anInt389);
		}
		@Pc(45) int local45 = 0;
		if (arg0.anInt400 == 2) {
			local1 = Static54.method1072(arg0.anInt390, arg0.anInt405, arg0.anInt389);
		}
		@Pc(62) int local62 = 0;
		if (arg0.anInt400 == 3) {
			local1 = Static219.method3696(arg0.anInt390, arg0.anInt405, arg0.anInt389);
		}
		if (local1 != 0L) {
			local62 = (int) local1 >> 14 & 0x1F;
			local15 = (int) (local1 >>> 32) & Integer.MAX_VALUE;
			local45 = (int) local1 >> 20 & 0x3;
		}
		arg0.anInt393 = local62;
		arg0.anInt392 = local15;
		arg0.anInt399 = local45;
	}
}
