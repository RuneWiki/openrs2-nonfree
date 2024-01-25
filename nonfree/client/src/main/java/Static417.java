import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt7078;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_249 = new Class186(5, 14);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZ)V")
	public static void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static137.aFloat153 < Static137.aFloat154) {
			Static137.aFloat153 = (float) ((double) Static137.aFloat153 + (double) Static137.aFloat153 / 30.0D);
			if (Static137.aFloat153 > Static137.aFloat154) {
				Static137.aFloat153 = Static137.aFloat154;
			}
			Static28.method540();
			Static137.anInt5578 = (int) Static137.aFloat153 >> 1;
			Static137.aByteArrayArrayArray9 = Static39.method1433(Static137.anInt5578);
		} else if (Static137.aFloat153 > Static137.aFloat154) {
			Static137.aFloat153 = (float) ((double) Static137.aFloat153 - (double) Static137.aFloat153 / 30.0D);
			if (Static137.aFloat153 < Static137.aFloat154) {
				Static137.aFloat153 = Static137.aFloat154;
			}
			Static28.method540();
			Static137.anInt5578 = (int) Static137.aFloat153 >> 1;
			Static137.aByteArrayArrayArray9 = Static39.method1433(Static137.anInt5578);
		}
		if (Static367.anInt6516 != -1 && Static97.anInt2094 != -1) {
			@Pc(82) int local82 = Static367.anInt6516 - Static348.anInt6296;
			if (local82 < 2 || local82 > 2) {
				local82 /= 8;
			}
			@Pc(98) int local98 = Static97.anInt2094 - Static4.anInt162;
			if (local98 < 2 || local98 > 2) {
				local98 /= 8;
			}
			Static348.anInt6296 += local82;
			Static4.anInt162 += local98;
			if (local82 == 0 && local98 == 0) {
				Static97.anInt2094 = -1;
				Static367.anInt6516 = -1;
			}
			Static28.method540();
		}
		if (Static2.anInt6973 <= 0) {
			Static129.anInt2584 = -1;
			Static158.anInt2992 = -1;
		} else {
			Static98.anInt2095--;
			if (Static98.anInt2095 == 0) {
				Static2.anInt6973--;
				Static98.anInt2095 = 100;
			}
		}
		if (!Static78.aBoolean122 || Static113.aClass258_17 == null) {
			return;
		}
		for (@Pc(161) Class4_Sub42 local161 = (Class4_Sub42) Static113.aClass258_17.method5538(); local161 != null; local161 = (Class4_Sub42) Static113.aClass258_17.method5528()) {
			@Pc(170) Class25 local170 = Static137.aClass198_4.method4491(local161.aClass4_Sub32_1.anInt5601);
			if (local161.method5490(arg1, arg0)) {
				if (local170.aStringArray5 != null) {
					if (local170.aStringArray5[4] != null) {
						Static191.method2806(local170.anInt865, (long) local161.aClass4_Sub32_1.anInt5601, false, -1, true, local170.aStringArray5[4], local170.aString9, 0, -1, 1002);
					}
					if (local170.aStringArray5[3] != null) {
						Static191.method2806(local170.anInt865, (long) local161.aClass4_Sub32_1.anInt5601, false, -1, true, local170.aStringArray5[3], local170.aString9, 0, -1, 1010);
					}
					if (local170.aStringArray5[2] != null) {
						Static191.method2806(local170.anInt865, (long) local161.aClass4_Sub32_1.anInt5601, false, -1, true, local170.aStringArray5[2], local170.aString9, 0, -1, 1001);
					}
					if (local170.aStringArray5[1] != null) {
						Static191.method2806(local170.anInt865, (long) local161.aClass4_Sub32_1.anInt5601, false, -1, true, local170.aStringArray5[1], local170.aString9, 0, -1, 1011);
					}
					if (local170.aStringArray5[0] != null) {
						Static191.method2806(local170.anInt865, (long) local161.aClass4_Sub32_1.anInt5601, false, -1, true, local170.aStringArray5[0], local170.aString9, 0, -1, 1012);
					}
				}
				if (!local161.aClass4_Sub32_1.aBoolean373) {
					local161.aClass4_Sub32_1.aBoolean373 = true;
					Static172.method2509(Static119.aClass93_5, local161.aClass4_Sub32_1.anInt5601, local170.anInt865);
				}
				if (local161.aClass4_Sub32_1.aBoolean373) {
					Static172.method2509(Static407.aClass93_9, local161.aClass4_Sub32_1.anInt5601, local170.anInt865);
				}
			} else if (local161.aClass4_Sub32_1.aBoolean373) {
				local161.aClass4_Sub32_1.aBoolean373 = false;
				Static172.method2509(Static352.aClass93_6, local161.aClass4_Sub32_1.anInt5601, local170.anInt865);
			}
		}
	}
}
