import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_1 = new Class277(2, 7);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
	public static int method979(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(45) int local45 = (arg0 & 0x7F) * 96 >> 7;
			if (local45 < 2) {
				local45 = 2;
			} else if (local45 > 126) {
				local45 = 126;
			}
			return local45 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZI)V")
	public static void method983(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(0, 15);
		local8.method2303();
		local8.anInt2872 = arg0;
		local8.anInt2865 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
	public static void method987() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static175.aClass182ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static175.aClass182ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static10.anInt812; local6++) {
					for (local9 = 0; local9 < Static255.anInt5209; local9++) {
						if (Static175.aClass182ArrayArrayArray1[local3][local6][local9] != null) {
							Static175.aClass182ArrayArrayArray1[local3][local6][local9].method4453();
						}
						Static175.aClass182ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static175.aClass182ArrayArrayArray1 = null;
		Static432.aClass115Array3 = null;
		if (Static288.aClass182ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static288.aClass182ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static10.anInt812; local6++) {
					for (local9 = 0; local9 < Static255.anInt5209; local9++) {
						if (Static288.aClass182ArrayArrayArray2[local3][local6][local9] != null) {
							Static288.aClass182ArrayArrayArray2[local3][local6][local9].method4453();
						}
						Static288.aClass182ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static288.aClass182ArrayArrayArray2 = null;
		Static140.aClass115Array1 = null;
		Static571.aClass182ArrayArrayArray3 = null;
		Static255.aClass115Array2 = null;
		Static339.aBooleanArrayArray8 = null;
		Static586.aBooleanArrayArray12 = null;
		Static375.aBooleanArrayArrayArray2 = null;
		Static212.aBooleanArrayArrayArray1 = null;
		Static147.method2543();
		if (Static80.aClass21_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static496.anInt9339; local3++) {
				Static80.aClass21_Sub1_Sub1Array1[local3] = null;
			}
			Static496.anInt9339 = 0;
		}
		if (Static48.aClass21_Sub1ArrayArray4 != null) {
			for (local3 = 0; local3 < Static137.anIntArray143[0]; local3++) {
				Static48.aClass21_Sub1ArrayArray4[0][local3] = null;
			}
			for (local6 = 0; local6 < Static137.anIntArray143[1]; local6++) {
				Static48.aClass21_Sub1ArrayArray4[1][local6] = null;
			}
			Static137.anIntArray143 = new int[2];
		}
		if (Static338.aClass21_Sub1ArrayArray2 != null) {
			for (local3 = 0; local3 < Static254.anIntArray281[0]; local3++) {
				Static338.aClass21_Sub1ArrayArray2[0][local3] = null;
			}
			for (local6 = 0; local6 < Static254.anIntArray281[1]; local6++) {
				Static338.aClass21_Sub1ArrayArray2[1][local6] = null;
			}
			Static254.anIntArray281 = new int[2];
		}
		if (Static375.aClass21_Sub1ArrayArray3 != null) {
			for (local3 = 0; local3 < Static27.anIntArray195[0]; local3++) {
				Static375.aClass21_Sub1ArrayArray3[0][local3] = null;
			}
			for (local6 = 0; local6 < Static27.anIntArray195[1]; local6++) {
				Static375.aClass21_Sub1ArrayArray3[1][local6] = null;
			}
			Static27.anIntArray195 = new int[2];
		}
		if (Static562.aClass21_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static562.aClass21_Sub1Array2.length; local3++) {
				Static562.aClass21_Sub1Array2[local3] = null;
			}
			Static277.anInt5771 = 0;
		}
		if (Static378.aClass21_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static378.aClass21_Sub1Array1.length; local3++) {
				Static378.aClass21_Sub1Array1[local3] = null;
			}
			Static459.anInt8207 = 0;
		}
		if (Static201.aClass85Array1 != null) {
			for (local3 = 0; local3 < Static566.anInt10281; local3++) {
				Static201.aClass85Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static218.anInt4559; local6++) {
				for (local9 = 0; local9 < Static10.anInt812; local9++) {
					for (@Pc(292) int local292 = 0; local292 < Static255.anInt5209; local292++) {
						Static358.aLongArrayArrayArray1[local6][local9][local292] = 0L;
					}
				}
			}
			Static566.anInt10281 = 0;
		}
		Static252.method4016();
		Static322.aClass158_13.method3724();
		Static254.aByteArrayArray18 = null;
		Static511.anIntArrayArray56 = null;
		Static565.aShortArrayArray14 = null;
		if (Static574.aClass180Array1 != null) {
			Static363.method5476();
			Static299.aClass7_12.method7790(1);
			Static299.aClass7_12.method7839(0);
		}
		if (Static112.aClass203Array1 != null) {
			Static112.aClass203Array1 = null;
		}
		Static299.aClass7_12 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!r;)V")
	public static void method988(@OriginalArg(1) Class7 arg0) {
		Static464.aClass45_9 = Static63.method1399(Static9.anInt757, true, arg0);
		Static174.aClass198_8 = Static539.method7543(Static9.anInt757, arg0);
		Static127.aClass45_1 = Static63.method1399(Static410.anInt8176, true, arg0);
		Static478.aClass198_11 = Static539.method7543(Static410.anInt8176, arg0);
		Static306.aClass45_4 = Static63.method1399(Static558.anInt10185, true, arg0);
		Static503.aClass198_12 = Static539.method7543(Static558.anInt10185, arg0);
	}
}
