import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	public static int anInt5082 = 0;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
	public static final int[] anIntArray1005 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_45 = new Class160(4);

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
	public static int anInt5086 = 1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!vh;II)V")
	public static void method4428(@OriginalArg(0) Class2_Sub16_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) boolean local15 = arg0.method5380(1) == 1;
		if (local15) {
			Static294.anIntArray1002[Static299.anInt5124++] = arg1;
		}
		@Pc(30) int local30 = arg0.method5380(2);
		@Pc(34) Class1_Sub5_Sub1_Sub1 local34 = Static125.aClass1_Sub5_Sub1_Sub1Array1[arg1];
		if (local30 != 0) {
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(147) int local147;
			if (local30 == 1) {
				local137 = arg0.method5380(3);
				local142 = local34.anIntArray1324[0];
				local147 = local34.anIntArray1323[0];
				if (local137 == 0) {
					local147--;
					local142--;
				} else if (local137 == 1) {
					local147--;
				} else if (local137 == 2) {
					local142++;
					local147--;
				} else if (local137 == 3) {
					local142--;
				} else if (local137 == 4) {
					local142++;
				} else if (local137 == 5) {
					local147++;
					local142--;
				} else if (local137 == 6) {
					local147++;
				} else if (local137 == 7) {
					local142++;
					local147++;
				}
				if (local15) {
					local34.anInt2276 = local147;
					local34.anInt2281 = local142;
				} else {
					local34.anInt2281 = -1;
					local34.method2252(local147, local142, Static95.aByteArray114[arg1]);
				}
			} else if (local30 == 2) {
				local137 = arg0.method5380(4);
				local142 = local34.anIntArray1324[0];
				local147 = local34.anIntArray1323[0];
				if (local137 == 0) {
					local147 -= 2;
					local142 -= 2;
				} else if (local137 == 1) {
					local147 -= 2;
					local142--;
				} else if (local137 == 2) {
					local147 -= 2;
				} else if (local137 == 3) {
					local142++;
					local147 -= 2;
				} else if (local137 == 4) {
					local142 += 2;
					local147 -= 2;
				} else if (local137 == 5) {
					local142 -= 2;
					local147--;
				} else if (local137 == 6) {
					local147--;
					local142 += 2;
				} else if (local137 == 7) {
					local142 -= 2;
				} else if (local137 == 8) {
					local142 += 2;
				} else if (local137 == 9) {
					local147++;
					local142 -= 2;
				} else if (local137 == 10) {
					local147++;
					local142 += 2;
				} else if (local137 == 11) {
					local147 += 2;
					local142 -= 2;
				} else if (local137 == 12) {
					local147 += 2;
					local142--;
				} else if (local137 == 13) {
					local147 += 2;
				} else if (local137 == 14) {
					local142++;
					local147 += 2;
				} else if (local137 == 15) {
					local142 += 2;
					local147 += 2;
				}
				if (local15) {
					local34.anInt2281 = local142;
					local34.anInt2276 = local147;
				} else {
					local34.anInt2281 = -1;
					local34.method2252(local147, local142, Static95.aByteArray114[arg1]);
				}
			} else {
				local137 = arg0.method5380(1);
				@Pc(409) int local409;
				@Pc(419) int local419;
				@Pc(432) int local432;
				@Pc(440) int local440;
				if (local137 == 0) {
					local142 = arg0.method5380(12);
					local147 = local142 >> 10;
					local409 = local142 >> 5 & 0x1F;
					if (local409 > 15) {
						local409 -= 32;
					}
					local419 = local142 & 0x1F;
					if (local419 > 15) {
						local419 -= 32;
					}
					local432 = local409 + local34.anIntArray1324[0];
					local440 = local34.anIntArray1323[0] + local419;
					if (local15) {
						local34.anInt2276 = local440;
						local34.anInt2281 = local432;
					} else {
						local34.anInt2281 = -1;
						local34.method2252(local440, local432, Static95.aByteArray114[arg1]);
					}
					local34.aByte69 = (byte) (local34.aByte69 + local147 & 0x3);
					if (arg1 == Static176.anInt3381) {
						Static382.anInt6523 = local34.aByte69;
					}
				} else {
					local142 = arg0.method5380(30);
					local147 = local142 >> 28;
					local409 = local142 >> 14 & 0x3FFF;
					local419 = local142 & 0x3FFF;
					local432 = (local34.anIntArray1324[0] + Static28.anInt606 + local409 & 0x3FFF) - Static28.anInt606;
					local440 = (local419 + local34.anIntArray1323[0] + Static319.anInt5425 & 0x3FFF) - Static319.anInt5425;
					if (local15) {
						local34.anInt2276 = local440;
						local34.anInt2281 = local432;
					} else {
						local34.anInt2281 = -1;
						local34.method2252(local440, local432, Static95.aByteArray114[arg1]);
					}
					local34.aByte69 = (byte) (local34.aByte69 + local147 & 0x3);
					if (Static176.anInt3381 == arg1) {
						Static382.anInt6523 = local34.aByte69;
					}
				}
			}
		} else if (local15) {
			local34.anInt2281 = -1;
		} else if (Static176.anInt3381 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			Static77.anIntArray337[arg1] = (local34.anIntArray1323[0] + Static319.anInt5425 >> 6) + (local34.aByte69 << 28) + (local34.anIntArray1324[0] + Static28.anInt606 >> 6 << 14);
			if (local34.anInt2280 == -1) {
				Static141.anIntArray582[arg1] = local34.aClass247_7.method5629();
			} else {
				Static141.anIntArray582[arg1] = local34.anInt2280;
			}
			Static72.anIntArray892[arg1] = local34.anInt6410;
			if (local34.anInt2296 > 0) {
				Static233.method3791(local34);
			}
			Static125.aClass1_Sub5_Sub1_Sub1Array1[arg1] = null;
			if (arg0.method5380(1) != 0) {
				Static56.method923(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public static void method4430() {
		for (@Pc(14) int local14 = 0; local14 < Static252.aClass119ArrayArray1.length; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static252.aClass119ArrayArray1[local14].length; local18++) {
				Static252.aClass119ArrayArray1[local14][local18] = Static79.aClass119_6;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method4431(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static46.method795(arg4, arg2, 0, arg0, arg3, arg5, arg1);
	}
}
