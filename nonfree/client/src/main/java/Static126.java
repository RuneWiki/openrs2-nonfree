import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fv", name = "V", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!hq;)V")
	public static void method1844(@OriginalArg(1) Class2_Sub20_Sub1 arg0) {
		arg0.method2499();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(43) int local43;
		for (@Pc(12) int local12 = 0; local12 < Static348.anInt6137; local12++) {
			local18 = Static348.anIntArray412[local12];
			if ((Static152.aByteArray81[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static152.aByteArray81[local18] = (byte) (Static152.aByteArray81[local18] | 0x2);
					local10--;
				} else {
					local43 = arg0.method2505(1);
					if (local43 == 0) {
						local10 = Static368.method5152(arg0);
						Static152.aByteArray81[local18] = (byte) (Static152.aByteArray81[local18] | 0x2);
					} else {
						Static9.method186(arg0, local18);
					}
				}
			}
		}
		arg0.method2506();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2499();
		@Pc(117) int local117;
		for (local18 = 0; local18 < Static348.anInt6137; local18++) {
			local43 = Static348.anIntArray412[local18];
			if ((Static152.aByteArray81[local43] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static152.aByteArray81[local43] = (byte) (Static152.aByteArray81[local43] | 0x2);
				} else {
					local117 = arg0.method2505(1);
					if (local117 == 0) {
						local10 = Static368.method5152(arg0);
						Static152.aByteArray81[local43] = (byte) (Static152.aByteArray81[local43] | 0x2);
					} else {
						Static9.method186(arg0, local43);
					}
				}
			}
		}
		arg0.method2506();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2499();
		@Pc(205) int local205;
		for (local43 = 0; local43 < Static98.anInt2181; local43++) {
			local117 = Static231.anIntArray306[local43];
			if ((Static152.aByteArray81[local117] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static152.aByteArray81[local117] = (byte) (Static152.aByteArray81[local117] | 0x2);
				} else {
					local205 = arg0.method2505(1);
					if (local205 == 0) {
						local10 = Static368.method5152(arg0);
						Static152.aByteArray81[local117] = (byte) (Static152.aByteArray81[local117] | 0x2);
					} else if (Static427.method5777(local117, arg0)) {
						Static152.aByteArray81[local117] = (byte) (Static152.aByteArray81[local117] | 0x2);
					}
				}
			}
		}
		arg0.method2506();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2499();
		for (local117 = 0; local117 < Static98.anInt2181; local117++) {
			local205 = Static231.anIntArray306[local117];
			if ((Static152.aByteArray81[local205] & 0x1) == 0) {
				if (local10 > 0) {
					Static152.aByteArray81[local205] = (byte) (Static152.aByteArray81[local205] | 0x2);
					local10--;
				} else {
					@Pc(299) int local299 = arg0.method2505(1);
					if (local299 == 0) {
						local10 = Static368.method5152(arg0);
						Static152.aByteArray81[local205] = (byte) (Static152.aByteArray81[local205] | 0x2);
					} else if (Static427.method5777(local205, arg0)) {
						Static152.aByteArray81[local205] = (byte) (Static152.aByteArray81[local205] | 0x2);
					}
				}
			}
		}
		arg0.method2506();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static348.anInt6137 = 0;
		Static98.anInt2181 = 0;
		for (local205 = 1; local205 < 2048; local205++) {
			Static152.aByteArray81[local205] = (byte) (Static152.aByteArray81[local205] >> 1);
			@Pc(368) Class4_Sub2_Sub2_Sub1 local368 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local205];
			if (local368 == null) {
				Static231.anIntArray306[Static98.anInt2181++] = local205;
			} else {
				Static348.anIntArray412[Static348.anInt6137++] = local205;
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(B)V")
	public static void method1845() {
		Static450.aClass41ArrayArray2 = new Class41[Static320.aClass188_129.method4299()][];
		Static117.aClass41ArrayArray1 = new Class41[Static320.aClass188_129.method4299()][];
		Static272.aBooleanArray51 = new boolean[Static320.aClass188_129.method4299()];
	}
}
