import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	public static int anInt9680;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)Z")
	public static boolean method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static47.aClass81_1.method6591(arg1, arg0, arg2, Static299.anIntArray330);
		@Pc(13) int local13 = Static299.anIntArray330[2];
		if (local13 < 50) {
			return false;
		} else {
			Static299.anIntArray330[1] = Static32.anInt1172 * Static299.anIntArray330[1] / local13 + Static568.anInt10300;
			Static299.anIntArray330[0] = Static144.anInt3100 * Static299.anIntArray330[0] / local13 + Static270.anInt5668;
			Static299.anIntArray330[2] = local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method7456() {
		if (Static270.aClass316_4 == null) {
			return;
		}
		if (Static270.aClass316_4.anInt9478 == 1) {
			Static270.aClass316_4 = null;
			return;
		}
		if (Static270.aClass316_4.anInt9478 == 2) {
			Static441.method6510(Static104.aString198, 2, Static175.aClass366_2);
			Static270.aClass316_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public static void method7457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static572.aFloat202 < Static572.aFloat201) {
			Static572.aFloat202 = (float) ((double) Static572.aFloat202 + (double) Static572.aFloat202 / 30.0D);
			if (Static572.aFloat201 < Static572.aFloat202) {
				Static572.aFloat202 = Static572.aFloat201;
			}
			Static279.method4473();
			Static572.anInt10050 = (int) Static572.aFloat202 >> 1;
			Static572.aByteArrayArrayArray18 = Static114.method2102(Static572.anInt10050);
		} else if (Static572.aFloat201 < Static572.aFloat202) {
			Static572.aFloat202 = (float) ((double) Static572.aFloat202 - (double) Static572.aFloat202 / 30.0D);
			if (Static572.aFloat201 > Static572.aFloat202) {
				Static572.aFloat202 = Static572.aFloat201;
			}
			Static279.method4473();
			Static572.anInt10050 = (int) Static572.aFloat202 >> 1;
			Static572.aByteArrayArrayArray18 = Static114.method2102(Static572.anInt10050);
		}
		if (Static315.anInt6308 != -1 && Static465.anInt8867 != -1) {
			@Pc(83) int local83 = Static315.anInt6308 - Static43.anInt2490;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(102) int local102 = Static465.anInt8867 - Static555.anInt10135;
			if (local102 < 2 || local102 > 2) {
				local102 /= 8;
			}
			Static43.anInt2490 += local83;
			Static555.anInt10135 += local102;
			if (local83 == 0 && local102 == 0) {
				Static465.anInt8867 = -1;
				Static315.anInt6308 = -1;
			}
			Static279.method4473();
		}
		if (Static536.anInt9797 > 0) {
			Static44.anInt1296--;
			if (Static44.anInt1296 == 0) {
				Static44.anInt1296 = 100;
				Static536.anInt9797--;
			}
		} else {
			Static537.anInt9803 = -1;
			Static139.anInt3063 = -1;
		}
		if (!Static80.aBoolean169 || Static308.aClass22_40 == null) {
			return;
		}
		for (@Pc(167) Class4_Sub4 local167 = (Class4_Sub4) Static308.aClass22_40.method895(); local167 != null; local167 = (Class4_Sub4) Static308.aClass22_40.method889()) {
			@Pc(178) Class288 local178 = Static572.aClass121_4.method2676(local167.aClass4_Sub20_1.anInt3266);
			if (local167.method1010(arg0, arg1)) {
				if (local178.aStringArray32 != null) {
					if (local178.aStringArray32[4] != null) {
						Static437.method6478(local178.anInt8601, (long) local167.aClass4_Sub20_1.anInt3266, -1, 0, true, local178.aStringArray32[4], 1012, local178.aString178, false, -1);
					}
					if (local178.aStringArray32[3] != null) {
						Static437.method6478(local178.anInt8601, (long) local167.aClass4_Sub20_1.anInt3266, -1, 0, true, local178.aStringArray32[3], 1002, local178.aString178, false, -1);
					}
					if (local178.aStringArray32[2] != null) {
						Static437.method6478(local178.anInt8601, (long) local167.aClass4_Sub20_1.anInt3266, -1, 0, true, local178.aStringArray32[2], 1007, local178.aString178, false, -1);
					}
					if (local178.aStringArray32[1] != null) {
						Static437.method6478(local178.anInt8601, (long) local167.aClass4_Sub20_1.anInt3266, -1, 0, true, local178.aStringArray32[1], 1010, local178.aString178, false, -1);
					}
					if (local178.aStringArray32[0] != null) {
						Static437.method6478(local178.anInt8601, (long) local167.aClass4_Sub20_1.anInt3266, -1, 0, true, local178.aStringArray32[0], 1006, local178.aString178, false, -1);
					}
				}
				if (!local167.aClass4_Sub20_1.aBoolean239) {
					local167.aClass4_Sub20_1.aBoolean239 = true;
					Static471.method6882(Static214.aClass162_4, local167.aClass4_Sub20_1.anInt3266, local178.anInt8601);
				}
				if (local167.aClass4_Sub20_1.aBoolean239) {
					Static471.method6882(Static475.aClass162_12, local167.aClass4_Sub20_1.anInt3266, local178.anInt8601);
				}
			} else if (local167.aClass4_Sub20_1.aBoolean239) {
				local167.aClass4_Sub20_1.aBoolean239 = false;
				Static471.method6882(Static131.aClass162_3, local167.aClass4_Sub20_1.anInt3266, local178.anInt8601);
			}
		}
	}
}
