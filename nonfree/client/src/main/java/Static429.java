import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "Lclient!ch;")
	public static Class30_Sub1_Sub1_Sub2 aClass30_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_97 = new Class91(32);

	@OriginalMember(owner = "client!vk", name = "l", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_173 = new Class263(3, -2);

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
	public static int anInt7614 = -1;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!dv;[[BZ)V")
	public static void method5772(@OriginalArg(0) Class29_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(6) int local6 = Static311.aByteArrayArray18.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(18) byte[] local18 = arg1[local8];
			if (local18 != null) {
				@Pc(30) int local30 = (Static168.anIntArray147[local8] >> 8) * 64 - Static278.anInt5374;
				@Pc(40) int local40 = (Static168.anIntArray147[local8] & 0xFF) * 64 - Static380.anInt6896;
				Static326.method4622();
				arg0.method1550(local40, Static30.aClass106_3, local18, local30, Static19.aClass120Array1);
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIB)V")
	public static void method5775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static377.aFloat70 > Static377.aFloat69) {
			Static377.aFloat69 = (float) ((double) Static377.aFloat69 + (double) Static377.aFloat69 / 30.0D);
			if (Static377.aFloat69 > Static377.aFloat70) {
				Static377.aFloat69 = Static377.aFloat70;
			}
			Static376.method5225();
			Static377.anInt5028 = (int) Static377.aFloat69 >> 1;
			Static377.aByteArrayArrayArray18 = Static144.method2314(Static377.anInt5028);
		} else if (Static377.aFloat70 < Static377.aFloat69) {
			Static377.aFloat69 = (float) ((double) Static377.aFloat69 - (double) Static377.aFloat69 / 30.0D);
			if (Static377.aFloat69 < Static377.aFloat70) {
				Static377.aFloat69 = Static377.aFloat70;
			}
			Static376.method5225();
			Static377.anInt5028 = (int) Static377.aFloat69 >> 1;
			Static377.aByteArrayArrayArray18 = Static144.method2314(Static377.anInt5028);
		}
		if (Static135.anInt3020 != -1 && Static332.anInt6412 != -1) {
			@Pc(79) int local79 = Static135.anInt3020 - Static226.anInt4474;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(95) int local95 = Static332.anInt6412 - Static125.anInt2774;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			Static226.anInt4474 += local79;
			if (local79 == 0 && local95 == 0) {
				Static332.anInt6412 = -1;
				Static135.anInt3020 = -1;
			}
			Static125.anInt2774 += local95;
			Static376.method5225();
		}
		if (Static305.anInt5723 > 0) {
			Static9.anInt3081--;
			if (Static9.anInt3081 == 0) {
				Static305.anInt5723--;
				Static9.anInt3081 = 100;
			}
		} else {
			Static331.anInt6090 = -1;
			Static140.anInt3084 = -1;
		}
		if (!Static302.aBoolean364 || Static140.aClass203_19 == null) {
			return;
		}
		for (@Pc(167) Class1_Sub43 local167 = (Class1_Sub43) Static140.aClass203_19.method4548(); local167 != null; local167 = (Class1_Sub43) Static140.aClass203_19.method4545()) {
			@Pc(176) Class47 local176 = Static377.aClass170_4.method3739(local167.aClass1_Sub28_1.anInt4940);
			if (local167.method5566(arg0, arg1)) {
				if (local176.aStringArray8 != null) {
					if (local176.aStringArray8[4] != null) {
						Static453.method6150(1012, true, false, -1, -1, 0, (long) local167.aClass1_Sub28_1.anInt4940, local176.anInt1531, local176.aStringArray8[4], local176.aString12);
					}
					if (local176.aStringArray8[3] != null) {
						Static453.method6150(1008, true, false, -1, -1, 0, (long) local167.aClass1_Sub28_1.anInt4940, local176.anInt1531, local176.aStringArray8[3], local176.aString12);
					}
					if (local176.aStringArray8[2] != null) {
						Static453.method6150(1003, true, false, -1, -1, 0, (long) local167.aClass1_Sub28_1.anInt4940, local176.anInt1531, local176.aStringArray8[2], local176.aString12);
					}
					if (local176.aStringArray8[1] != null) {
						Static453.method6150(1001, true, false, -1, -1, 0, (long) local167.aClass1_Sub28_1.anInt4940, local176.anInt1531, local176.aStringArray8[1], local176.aString12);
					}
					if (local176.aStringArray8[0] != null) {
						Static453.method6150(1004, true, false, -1, -1, 0, (long) local167.aClass1_Sub28_1.anInt4940, local176.anInt1531, local176.aStringArray8[0], local176.aString12);
					}
				}
				if (!local167.aClass1_Sub28_1.aBoolean312) {
					local167.aClass1_Sub28_1.aBoolean312 = true;
					Static178.method3004(Static400.aClass65_11, local167.aClass1_Sub28_1.anInt4940, local176.anInt1531);
				}
				if (local167.aClass1_Sub28_1.aBoolean312) {
					Static178.method3004(Static386.aClass65_9, local167.aClass1_Sub28_1.anInt4940, local176.anInt1531);
				}
			} else if (local167.aClass1_Sub28_1.aBoolean312) {
				local167.aClass1_Sub28_1.aBoolean312 = false;
				Static178.method3004(Static271.aClass65_7, local167.aClass1_Sub28_1.anInt4940, local176.anInt1531);
			}
		}
	}
}
