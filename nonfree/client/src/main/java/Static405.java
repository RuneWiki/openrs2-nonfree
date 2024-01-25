import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZB)I")
	public static int method5732(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static76.anInt1404;
		if (local10 == 0) {
			return arg0 ? 0 : Static125.anInt2572;
		} else if (local10 == 1) {
			return Static125.anInt2572;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIBI)I")
	public static int method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg1 >> 2 & 0x3F) << 10) - (-(arg2 >> 5 << 7) - (arg0 >> 1));
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
	public static void method5734() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static334.aClass164ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static334.aClass164ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static146.anInt2951; local6++) {
					for (local9 = 0; local9 < Static602.anInt9668; local9++) {
						if (Static334.aClass164ArrayArrayArray3[local3][local6][local9] != null) {
							Static334.aClass164ArrayArrayArray3[local3][local6][local9].method4388();
						}
						Static334.aClass164ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static334.aClass164ArrayArrayArray3 = null;
		Static582.aClass21Array3 = null;
		if (Static275.aClass164ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static275.aClass164ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static146.anInt2951; local6++) {
					for (local9 = 0; local9 < Static602.anInt9668; local9++) {
						if (Static275.aClass164ArrayArrayArray2[local3][local6][local9] != null) {
							Static275.aClass164ArrayArrayArray2[local3][local6][local9].method4388();
						}
						Static275.aClass164ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static275.aClass164ArrayArrayArray2 = null;
		Static108.aClass21Array1 = null;
		Static15.aClass164ArrayArrayArray5 = null;
		Static121.aClass21Array2 = null;
		Static430.aBooleanArrayArray7 = null;
		Static600.aBooleanArrayArray8 = null;
		Static174.anIntArray300 = null;
		Static614.aBooleanArrayArrayArray2 = null;
		Static45.aBooleanArrayArrayArray1 = null;
		Static176.method3165();
		if (Static443.aClass28_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static77.anInt1423; local3++) {
				Static443.aClass28_Sub1_Sub1Array1[local3] = null;
			}
			Static77.anInt1423 = 0;
		}
		Static539.aClass28_Sub1Array26 = null;
		Static38.aClass28_Sub1Array5 = null;
		Static198.aClass28_Sub1Array37 = null;
		if (Static389.aClass28_Sub1Array15 != null) {
			for (local3 = 0; local3 < Static389.aClass28_Sub1Array15.length; local3++) {
				Static389.aClass28_Sub1Array15[local3] = null;
			}
			Static116.anInt2393 = 0;
		}
		if (Static523.aClass28_Sub1Array24 != null) {
			for (local3 = 0; local3 < Static523.aClass28_Sub1Array24.length; local3++) {
				Static523.aClass28_Sub1Array24[local3] = null;
			}
			Static367.anInt5935 = 0;
		}
		if (Static541.aClass265Array1 != null) {
			for (local3 = 0; local3 < Static486.anInt8045; local3++) {
				Static541.aClass265Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static183.anInt3720; local6++) {
				for (local9 = 0; local9 < Static146.anInt2951; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static602.anInt9668; local195++) {
						Static234.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static486.anInt8045 = 0;
		}
		Static585.method8257();
		Static645.aClass321_3 = Static645.aClass321_2;
		Static645.aClass321_3.method7867();
		Static62.aByteArrayArray5 = null;
		Static101.anIntArrayArray14 = null;
		Static495.aShortArrayArray28 = null;
		if (Static569.aClass383Array1 != null) {
			Static503.method7149();
			Static671.aClass13_21.method8521(1);
			Static671.aClass13_21.method8458(0);
		}
		if (Static324.aClass148Array1 != null) {
			Static324.aClass148Array1 = null;
		}
		Static671.aClass13_21 = null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIBI)I")
	public static int method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(18) int local18 = local7 < 8 ? arg3 : arg2;
		@Pc(39) int local39 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg0) : arg2;
		return ((local7 & 0x1) == 0 ? local18 : -local18) + ((local7 & 0x2) == 0 ? local39 : -local39);
	}
}
