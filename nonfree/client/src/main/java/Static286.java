import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "[[Lclient!je;")
	public static Class117[][] aClass117ArrayArray2;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!fo;")
	public static Class1_Sub6_Sub4 aClass1_Sub6_Sub4_3;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!oa;")
	public static final Class170 aClass170_6 = new Class170();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)B")
	public static byte method4344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method4345() {
		Static139.aClass1_Sub33_Sub2_1.method5200();
		@Pc(13) int local13 = Static139.aClass1_Sub33_Sub2_1.method5191(8);
		@Pc(23) int local23;
		if (Static309.anInt5243 > local13) {
			for (local23 = local13; local23 < Static309.anInt5243; local23++) {
				Static88.anIntArray214[Static367.anInt5917++] = Static131.anIntArray302[local23];
			}
		}
		if (Static309.anInt5243 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static309.anInt5243 = 0;
		for (local23 = 0; local23 < local13; local23++) {
			@Pc(61) int local61 = Static131.anIntArray302[local23];
			@Pc(65) Class25_Sub1_Sub1_Sub2 local65 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local61];
			@Pc(70) int local70 = Static139.aClass1_Sub33_Sub2_1.method5191(1);
			if (local70 == 0) {
				Static131.anIntArray302[Static309.anInt5243++] = local61;
				local65.anInt2319 = Static366.anInt5883;
			} else {
				@Pc(90) int local90 = Static139.aClass1_Sub33_Sub2_1.method5191(2);
				if (local90 == 0) {
					Static131.anIntArray302[Static309.anInt5243++] = local61;
					local65.anInt2319 = Static366.anInt5883;
					Static200.anIntArray420[Static382.anInt6197++] = local61;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local90 == 1) {
						Static131.anIntArray302[Static309.anInt5243++] = local61;
						local65.anInt2319 = Static366.anInt5883;
						local135 = Static139.aClass1_Sub33_Sub2_1.method5191(3);
						local65.method1898(1, local135);
						local145 = Static139.aClass1_Sub33_Sub2_1.method5191(1);
						if (local145 == 1) {
							Static200.anIntArray420[Static382.anInt6197++] = local61;
						}
					} else if (local90 == 2) {
						Static131.anIntArray302[Static309.anInt5243++] = local61;
						local65.anInt2319 = Static366.anInt5883;
						if (Static139.aClass1_Sub33_Sub2_1.method5191(1) == 1) {
							local135 = Static139.aClass1_Sub33_Sub2_1.method5191(3);
							local65.method1898(2, local135);
							local145 = Static139.aClass1_Sub33_Sub2_1.method5191(3);
							local65.method1898(2, local145);
						} else {
							local135 = Static139.aClass1_Sub33_Sub2_1.method5191(3);
							local65.method1898(0, local135);
						}
						local135 = Static139.aClass1_Sub33_Sub2_1.method5191(1);
						if (local135 == 1) {
							Static200.anIntArray420[Static382.anInt6197++] = local61;
						}
					} else if (local90 == 3) {
						Static88.anIntArray214[Static367.anInt5917++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method4346() {
		for (@Pc(3) int local3 = 0; local3 < Static364.aClass161ArrayArray3.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static364.aClass161ArrayArray3[local3].length; local7++) {
				Static364.aClass161ArrayArray3[local3][local7] = Static121.aClass161_1;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ui;III)Lclient!is;")
	public static Class110 method4348(@OriginalArg(0) Class230 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method4985(0, arg1);
		return local9 == null ? null : new Class110(local9);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIII)I")
	public static int method4349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
