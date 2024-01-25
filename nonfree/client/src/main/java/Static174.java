import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[5];

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_61 = new Class268(37, -2);

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)I")
	public static int method3208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static304.method5162(local7, local17);
		@Pc(35) int local35 = Static304.method5162(local7 + 1, local17);
		@Pc(44) int local44 = Static304.method5162(local7, local17 + 1);
		@Pc(55) int local55 = Static304.method5162(local7 + 1, local17 + 1);
		@Pc(62) int local62 = Static501.method7466(arg2, local28, local35, local13);
		@Pc(69) int local69 = Static501.method7466(arg2, local44, local55, local13);
		return Static501.method7466(arg2, local62, local69, local23);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)V")
	public static void method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static272.aClass97ArrayArrayArray3[0][arg1][arg2] != null && Static272.aClass97ArrayArrayArray3[0][arg1][arg2].aClass97_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static272.aClass97ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(44) Class97 local44 = Static272.aClass97ArrayArrayArray3[local22][arg1][arg2] = new Class97(local22);
				if (local20) {
					local44.aByte52++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[Ljava/lang/String;[SB)V")
	public static void method3211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) short[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) String local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) short local30 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local30;
		for (@Pc(42) int local42 = arg0; local42 < arg1; local42++) {
			if (local16 == null || arg2[local42] != null && (local42 & 0x1) > arg2[local42].compareTo(local16)) {
				@Pc(63) String local63 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12] = local63;
				@Pc(77) short local77 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local77;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg1] = arg3[local12];
		arg3[local12] = local30;
		method3211(arg0, local12 - 1, arg2, arg3);
		method3211(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "()V")
	public static void method3212() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static360.aClass97ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static360.aClass97ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static544.anInt9353; local6++) {
					for (local9 = 0; local9 < Static608.anInt10072; local9++) {
						if (Static360.aClass97ArrayArrayArray4[local3][local6][local9] != null) {
							Static360.aClass97ArrayArrayArray4[local3][local6][local9].method2391();
						}
						Static360.aClass97ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static360.aClass97ArrayArrayArray4 = null;
		Static228.aClass199Array2 = null;
		if (Static179.aClass97ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static179.aClass97ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static544.anInt9353; local6++) {
					for (local9 = 0; local9 < Static608.anInt10072; local9++) {
						if (Static179.aClass97ArrayArrayArray1[local3][local6][local9] != null) {
							Static179.aClass97ArrayArrayArray1[local3][local6][local9].method2391();
						}
						Static179.aClass97ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static179.aClass97ArrayArrayArray1 = null;
		Static510.aClass199Array3 = null;
		Static272.aClass97ArrayArrayArray3 = null;
		Static195.aClass199Array1 = null;
		Static460.aBooleanArrayArray6 = null;
		Static195.aBooleanArrayArray4 = null;
		Static580.anIntArray588 = null;
		Static431.aBooleanArrayArrayArray2 = null;
		Static120.aBooleanArrayArrayArray1 = null;
		Static216.method3666();
		if (Static61.aClass20_Sub2_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static205.anInt4091; local3++) {
				Static61.aClass20_Sub2_Sub2Array1[local3] = null;
			}
			Static205.anInt4091 = 0;
		}
		Static158.aClass20_Sub2Array7 = null;
		Static311.aClass20_Sub2Array11 = null;
		Static411.aClass20_Sub2Array12 = null;
		if (Static109.aClass20_Sub2Array13 != null) {
			for (local3 = 0; local3 < Static109.aClass20_Sub2Array13.length; local3++) {
				Static109.aClass20_Sub2Array13[local3] = null;
			}
			Static242.anInt4833 = 0;
		}
		if (Static626.aClass20_Sub2Array14 != null) {
			for (local3 = 0; local3 < Static626.aClass20_Sub2Array14.length; local3++) {
				Static626.aClass20_Sub2Array14[local3] = null;
			}
			Static189.anInt3797 = 0;
		}
		if (Static105.aClass68Array1 != null) {
			for (local3 = 0; local3 < Static523.anInt9117; local3++) {
				Static105.aClass68Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static535.anInt9275; local6++) {
				for (local9 = 0; local9 < Static544.anInt9353; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static608.anInt10072; local195++) {
						Static85.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static523.anInt9117 = 0;
		}
		Static324.method5383();
		Static94.aClass65_1 = Static94.aClass65_2;
		Static94.aClass65_1.method1719();
		Static393.aByteArrayArray114 = null;
		Static400.anIntArrayArray31 = null;
		Static464.aShortArrayArray16 = null;
		if (Static574.aClass334Array1 != null) {
			Static621.method8660();
			Static565.aClass100_15.method8817(1);
			Static565.aClass100_15.method8805(0);
		}
		if (Static322.aClass352Array1 != null) {
			Static322.aClass352Array1 = null;
		}
		Static565.aClass100_15 = null;
	}
}
