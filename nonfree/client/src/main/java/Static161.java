import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	public static int anInt3459;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method2787() {
		@Pc(10) int local10 = Static187.aClass1_Sub11_Sub1_2.method2701(8);
		@Pc(20) int local20;
		if (Static278.anInt5374 > local10) {
			for (local20 = local10; local20 < Static278.anInt5374; local20++) {
				Static59.anIntArray358[Static68.anInt1450++] = Static17.anIntArray444[local20];
			}
		}
		if (Static278.anInt5374 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static278.anInt5374 = 0;
		for (local20 = 0; local20 < local10; local20++) {
			@Pc(67) int local67 = Static17.anIntArray444[local20];
			@Pc(71) Class14_Sub2_Sub1 local71 = Static98.aClass14_Sub2_Sub1Array1[local67];
			@Pc(76) int local76 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
			if (local76 == 0) {
				Static17.anIntArray444[Static278.anInt5374++] = local67;
				local71.anInt4645 = Static237.anInt4710;
			} else {
				@Pc(98) int local98 = Static187.aClass1_Sub11_Sub1_2.method2701(2);
				if (local98 == 0) {
					Static17.anIntArray444[Static278.anInt5374++] = local67;
					local71.anInt4645 = Static237.anInt4710;
					Static226.anIntArray399[Static1.anInt4241++] = local67;
				} else {
					@Pc(146) int local146;
					@Pc(156) int local156;
					if (local98 == 1) {
						Static17.anIntArray444[Static278.anInt5374++] = local67;
						local71.anInt4645 = Static237.anInt4710;
						local146 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
						local71.method3655(local146, 1);
						local156 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
						if (local156 == 1) {
							Static226.anIntArray399[Static1.anInt4241++] = local67;
						}
					} else if (local98 == 2) {
						Static17.anIntArray444[Static278.anInt5374++] = local67;
						local71.anInt4645 = Static237.anInt4710;
						if (Static187.aClass1_Sub11_Sub1_2.method2701(1) == 1) {
							local146 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
							local71.method3655(local146, 2);
							local156 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
							local71.method3655(local156, 2);
						} else {
							local146 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
							local71.method3655(local146, 0);
						}
						local146 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
						if (local146 == 1) {
							Static226.anIntArray399[Static1.anInt4241++] = local67;
						}
					} else if (local98 == 3) {
						Static59.anIntArray358[Static68.anInt1450++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)I")
	public static int method2788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)I")
	public static int method2789(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method2790() {
		for (@Pc(7) int local7 = 0; local7 < Static233.anInt4582; local7++) {
			@Pc(18) int local18 = Static281.anIntArray464[local7];
			@Pc(22) Class14_Sub2_Sub2 local22 = Static254.aClass14_Sub2_Sub2Array1[local18];
			if (local22 != null) {
				Static62.method1122(local22.aClass46_1.anInt1532, local22);
			}
		}
	}
}
