import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!wga", name = "E", descriptor = "I")
	public static int anInt9444 = -1;

	@OriginalMember(owner = "client!wga", name = "L", descriptor = "I")
	public static int anInt9448 = 0;

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(B)V")
	public static void method7910() {
		for (@Pc(9) Class41_Sub2 local9 = (Class41_Sub2) Static447.aClass102_6.method2058(); local9 != null; local9 = (Class41_Sub2) Static447.aClass102_6.method2058()) {
			Static163.method2424(local9);
		}
		@Pc(34) int local34;
		@Pc(32) int local32;
		if (Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 1) {
			local32 = 3;
			local34 = 0;
		} else {
			local32 = Static326.anInt5965;
			local34 = Static326.anInt5965;
		}
		Static81.method1271();
		for (@Pc(42) int local42 = local34; local42 <= local32; local42++) {
			Static81.method1281();
			Static81.method1269(local42);
			Static81.method1273(local42);
		}
		Static81.method1276();
		Static81.method1280();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!iw;B)V")
	public static void method7911(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		@Pc(5) int local5 = 0;
		arg0.method3701();
		@Pc(17) int local17;
		@Pc(44) int local44;
		for (@Pc(12) int local12 = 0; local12 < Static72.anInt9084; local12++) {
			local17 = Static388.anIntArray381[local12];
			if ((Static291.aByteArray110[local17] & 0x1) == 0) {
				if (local5 > 0) {
					Static291.aByteArray110[local17] = (byte) (Static291.aByteArray110[local17] | 0x2);
					local5--;
				} else {
					local44 = arg0.method3702(1);
					if (local44 == 0) {
						local5 = Static309.method4758(arg0);
						Static291.aByteArray110[local17] = (byte) (Static291.aByteArray110[local17] | 0x2);
					} else {
						Static345.method5209(arg0, local17);
					}
				}
			}
		}
		arg0.method3710();
		if (local5 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3701();
		@Pc(124) int local124;
		for (local17 = 0; local17 < Static72.anInt9084; local17++) {
			local44 = Static388.anIntArray381[local17];
			if ((Static291.aByteArray110[local44] & 0x1) != 0) {
				if (local5 > 0) {
					local5--;
					Static291.aByteArray110[local44] = (byte) (Static291.aByteArray110[local44] | 0x2);
				} else {
					local124 = arg0.method3702(1);
					if (local124 == 0) {
						local5 = Static309.method4758(arg0);
						Static291.aByteArray110[local44] = (byte) (Static291.aByteArray110[local44] | 0x2);
					} else {
						Static345.method5209(arg0, local44);
					}
				}
			}
		}
		arg0.method3710();
		if (local5 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3701();
		@Pc(204) int local204;
		for (local44 = 0; local44 < Static28.anInt389; local44++) {
			local124 = Static670.anIntArray612[local44];
			if ((Static291.aByteArray110[local124] & 0x1) != 0) {
				if (local5 > 0) {
					Static291.aByteArray110[local124] = (byte) (Static291.aByteArray110[local124] | 0x2);
					local5--;
				} else {
					local204 = arg0.method3702(1);
					if (local204 == 0) {
						local5 = Static309.method4758(arg0);
						Static291.aByteArray110[local124] = (byte) (Static291.aByteArray110[local124] | 0x2);
					} else if (Static499.method7241(local124, arg0)) {
						Static291.aByteArray110[local124] = (byte) (Static291.aByteArray110[local124] | 0x2);
					}
				}
			}
		}
		arg0.method3710();
		if (local5 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3701();
		for (local124 = 0; local124 < Static28.anInt389; local124++) {
			local204 = Static670.anIntArray612[local124];
			if ((Static291.aByteArray110[local204] & 0x1) == 0) {
				if (local5 > 0) {
					Static291.aByteArray110[local204] = (byte) (Static291.aByteArray110[local204] | 0x2);
					local5--;
				} else {
					@Pc(293) int local293 = arg0.method3702(1);
					if (local293 == 0) {
						local5 = Static309.method4758(arg0);
						Static291.aByteArray110[local204] = (byte) (Static291.aByteArray110[local204] | 0x2);
					} else if (Static499.method7241(local204, arg0)) {
						Static291.aByteArray110[local204] = (byte) (Static291.aByteArray110[local204] | 0x2);
					}
				}
			}
		}
		arg0.method3710();
		if (local5 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static72.anInt9084 = 0;
		Static28.anInt389 = 0;
		for (local204 = 1; local204 < 2048; local204++) {
			Static291.aByteArray110[local204] = (byte) (Static291.aByteArray110[local204] >> 1);
			@Pc(359) Class41_Sub1_Sub1_Sub3_Sub2 local359 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local204];
			if (local359 == null) {
				Static670.anIntArray612[Static28.anInt389++] = local204;
			} else {
				Static388.anIntArray381[Static72.anInt9084++] = local204;
			}
		}
	}
}
