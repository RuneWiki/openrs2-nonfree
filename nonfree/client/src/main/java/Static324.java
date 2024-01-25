import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	public static int anInt6407;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
	public static boolean aBoolean528 = true;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method5503() {
		if (Static81.aClass202_3 != null) {
			Static81.aClass202_3.method5477();
			Static81.aClass202_3 = null;
		}
		Static14.method208();
		Static60.method1146();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static313.aClass17Array1[local17].method333();
		}
		Static353.method5842(false);
		System.gc();
		Static284.method4996();
		Static92.aBoolean123 = false;
		Static248.anInt28 = -1;
		Static253.method4541(true);
		Static232.anInt4829 = 0;
		Static98.anInt1911 = 0;
		Static177.anInt3736 = 0;
		Static238.aBoolean402 = false;
		Static92.anInt1755 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static11.aClass65Array4.length; local54++) {
			Static11.aClass65Array4[local54] = null;
		}
		Static167.anInt3454 = 0;
		Static271.anInt5578 = 0;
		for (@Pc(71) int local71 = 0; local71 < 2048; local71++) {
			Static202.aClass10_Sub1_Sub2_Sub2Array1[local71] = null;
			Static83.aClass1_Sub21Array1[local71] = null;
		}
		for (@Pc(87) int local87 = 0; local87 < 32768; local87++) {
			Static178.aClass10_Sub1_Sub2_Sub1Array1[local87] = null;
		}
		Static98.aClass207_12.method5562();
		Static301.method5233();
		Static248.anInt27 = 0;
		Static234.method4199();
		Static13.method191();
		Static123.method4484();
		Static173.method3108(true);
		try {
			Static367.method3947(Static197.aClass215_5.anApplet1, "loggedout");
		} catch (@Pc(128) Throwable local128) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!mp;IIIII)V")
	public static void method5506(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6107 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static87.anIntArrayArrayArray4[arg1][local4][local7];
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
						@Pc(33) Class1_Sub19_Sub1 local33 = Static174.aClass1_Sub19_Sub1Array4[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt6107; local35++) {
							if (arg0.aClass1_Sub19_Sub1Array5[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass1_Sub19_Sub1Array5[arg0.anInt6107++] = local33;
						if (arg0.anInt6107 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt6107; local7 < 4; local7++) {
			arg0.aClass1_Sub19_Sub1Array5[local7] = null;
		}
	}
}
