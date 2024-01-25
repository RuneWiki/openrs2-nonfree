import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
	public static int anInt3154 = 2;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString123 = "";

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public static int anInt3156 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!jk;IIIII)V")
	public static void method2984(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2459 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static116.anIntArrayArrayArray7[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class1_Sub31_Sub1 local33 = Static327.aClass1_Sub31_Sub1Array3[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt2459; local35++) {
							if (arg0.aClass1_Sub31_Sub1Array2[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass1_Sub31_Sub1Array2[arg0.anInt2459++] = local33;
						if (arg0.anInt2459 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt2459; local7 < 4; local7++) {
			arg0.aClass1_Sub31_Sub1Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
	public static void method2985() {
		Static265.aClass140_135.method3824(50);
		Static158.aClass140_83.method3824(50);
		Static252.aClass140_130.method3824(50);
		Static270.aClass140_141.method3824(50);
		Static230.aClass140_119.method3824(50);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)V")
	public static void method2986(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static34.aClass2_6 = Static2.method3301(Static123.anInt2389 * 2, arg1, Static261.aCanvas4, Static180.aClass110_6, Static62.anInterface7_1);
		} else {
			if (arg0) {
				Static34.aClass2_6 = Static2.method3301(0, 0, Static261.aCanvas4, Static180.aClass110_6, Static62.anInterface7_1);
				Static34.aClass2_6.method3309(0);
				@Pc(20) Class38 local20 = Static179.method3492(Static236.aClass165_72, Static186.anInt3864);
				@Pc(29) Class13 local29 = Static34.aClass2_6.method3306(local20, Static363.method3773(Static297.aClass165_88, Static186.anInt3864));
				Static56.method1211(Static118.aString194, true, local29);
				Static34.aClass2_6.method3264();
				Static99.method1804();
				Static34.aClass2_6.method3324();
			}
			try {
				Static34.aClass2_6 = Static2.method3301(Static123.anInt2389 * 2, arg1, Static261.aCanvas4, Static180.aClass110_6, Static62.anInterface7_1);
			} catch (@Pc(53) Throwable local53) {
				Static34.aClass2_6 = Static2.method3301(0, 0, Static261.aCanvas4, Static180.aClass110_6, Static62.anInterface7_1);
				arg1 = 0;
			}
		}
		if (Static34.aClass2_6.method3240()) {
			@Pc(86) Class1_Sub13 local86 = Static34.aClass2_6.method3275();
			Static34.aClass2_6.method3338(local86);
		}
		Static258.anInt5029 = arg1;
		Static78.method1540();
		if (!Static34.aClass2_6.method3293()) {
			Static138.anInt2755 = 1;
		}
		Static34.aClass2_6.method3316(Static138.anInt2755);
		Static34.aClass2_6.method3313(0);
		Static302.aClass21_6 = Static34.aClass2_6.method3298();
		Static158.aClass21_5 = Static34.aClass2_6.method3298();
		@Pc(118) int local118 = (int) ((double) Static48.anInt1107 * 34.46D);
		if (Static34.aClass2_6.method3261()) {
			local118 += 128;
		}
		Static34.aClass2_6.method3280(50, local118);
		Static34.aClass2_6.method3304(!Static305.aBoolean515);
		if (Static34.aClass2_6.method3238()) {
			Static155.method2949(Static344.aBoolean555);
		}
		Static233.aBoolean384 = !Static123.method2195();
		Static317.method5334(Static337.anInt6402 >> 3, Static48.anInt1107 >> 3, Static34.aClass2_6);
		Static190.method3667();
		Static7.aBoolean21 = false;
	}
}
