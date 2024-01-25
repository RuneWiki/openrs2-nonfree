import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
	public static int anInt7824;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	public static void method6898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static620.aFloat147 < Static620.aFloat146) {
			Static620.aFloat147 = (float) ((double) Static620.aFloat147 + (double) Static620.aFloat147 / 30.0D);
			if (Static620.aFloat147 > Static620.aFloat146) {
				Static620.aFloat147 = Static620.aFloat146;
			}
			Static494.method7232();
			Static620.anInt8198 = (int) Static620.aFloat147 >> 1;
			Static620.aByteArrayArrayArray20 = Static320.method4868(Static620.anInt8198);
		} else if (Static620.aFloat147 > Static620.aFloat146) {
			Static620.aFloat147 = (float) ((double) Static620.aFloat147 - (double) Static620.aFloat147 / 30.0D);
			if (Static620.aFloat147 < Static620.aFloat146) {
				Static620.aFloat147 = Static620.aFloat146;
			}
			Static494.method7232();
			Static620.anInt8198 = (int) Static620.aFloat147 >> 1;
			Static620.aByteArrayArrayArray20 = Static320.method4868(Static620.anInt8198);
		}
		if (Static523.anInt8995 != -1 && Static181.anInt3236 != -1) {
			@Pc(84) int local84 = Static523.anInt8995 - Static196.anInt3883;
			if (local84 < 2 || local84 > 2) {
				local84 /= 8;
			}
			@Pc(103) int local103 = Static181.anInt3236 - Static235.anInt4321;
			Static196.anInt3883 += local84;
			if (local103 < 2 || local103 > 2) {
				local103 /= 8;
			}
			if (local84 == 0 && local103 == 0) {
				Static181.anInt3236 = -1;
				Static523.anInt8995 = -1;
			}
			Static235.anInt4321 -= -local103;
			Static494.method7232();
		}
		if (Static248.anInt4508 <= 0) {
			Static165.anInt10647 = -1;
			Static555.anInt9372 = -1;
		} else {
			Static374.anInt6199--;
			if (Static374.anInt6199 == 0) {
				Static248.anInt4508--;
				Static374.anInt6199 = 100;
			}
		}
		if (!Static466.aBoolean553 || Static608.aClass330_62 == null) {
			return;
		}
		for (@Pc(170) Class5_Sub8 local170 = (Class5_Sub8) Static608.aClass330_62.method7908(); local170 != null; local170 = (Class5_Sub8) Static608.aClass330_62.method7914()) {
			@Pc(179) Class299 local179 = Static620.aClass42_4.method937(local170.aClass5_Sub26_1.anInt4151);
			if (local170.method957(arg0, arg1)) {
				if (local179.aStringArray66 != null) {
					if (local179.aStringArray66[4] != null) {
						Static150.method2214(0, local179.aString94, true, false, -1, local179.anInt8121, -1, (long) local170.aClass5_Sub26_1.anInt4151, false, local179.aStringArray66[4], 1002, (long) local170.aClass5_Sub26_1.anInt4151);
					}
					if (local179.aStringArray66[3] != null) {
						Static150.method2214(0, local179.aString94, true, false, -1, local179.anInt8121, -1, (long) local170.aClass5_Sub26_1.anInt4151, false, local179.aStringArray66[3], 1012, (long) local170.aClass5_Sub26_1.anInt4151);
					}
					if (local179.aStringArray66[2] != null) {
						Static150.method2214(0, local179.aString94, true, false, -1, local179.anInt8121, -1, (long) local170.aClass5_Sub26_1.anInt4151, false, local179.aStringArray66[2], 1008, (long) local170.aClass5_Sub26_1.anInt4151);
					}
					if (local179.aStringArray66[1] != null) {
						Static150.method2214(0, local179.aString94, true, false, -1, local179.anInt8121, -1, (long) local170.aClass5_Sub26_1.anInt4151, false, local179.aStringArray66[1], 1003, (long) local170.aClass5_Sub26_1.anInt4151);
					}
					if (local179.aStringArray66[0] != null) {
						Static150.method2214(0, local179.aString94, true, false, -1, local179.anInt8121, -1, (long) local170.aClass5_Sub26_1.anInt4151, false, local179.aStringArray66[0], 1007, (long) local170.aClass5_Sub26_1.anInt4151);
					}
				}
				if (!local170.aClass5_Sub26_1.aBoolean309) {
					local170.aClass5_Sub26_1.aBoolean309 = true;
					Static370.method5470(Static529.aClass98_45, local170.aClass5_Sub26_1.anInt4151, local179.anInt8121);
				}
				if (local170.aClass5_Sub26_1.aBoolean309) {
					Static370.method5470(Static591.aClass98_49, local170.aClass5_Sub26_1.anInt4151, local179.anInt8121);
				}
			} else if (local170.aClass5_Sub26_1.aBoolean309) {
				local170.aClass5_Sub26_1.aBoolean309 = false;
				Static370.method5470(Static296.aClass98_24, local170.aClass5_Sub26_1.anInt4151, local179.anInt8121);
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZB)I")
	public static int method6899(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static483.anInt8236;
		if (local10 == 0) {
			return arg0 ? 0 : Static601.anInt10083;
		} else if (local10 == 1) {
			return Static601.anInt10083;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!raa;B)V")
	public static void method6901(@OriginalArg(0) Class295 arg0) {
		if (arg0.anInt7961 == Static444.anInt7588) {
			Static264.aBooleanArray16[arg0.anInt8038] = true;
		}
	}
}
