import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "Lclient!kea;")
	public static Class161 aClass161_42;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)V")
	public static void method3559(@OriginalArg(0) int arg0) {
		Static213.anInt4694 = arg0;
		Static469.anInt8466 = -1;
		Static106.anInt2360 = 100;
		Static307.anInt4841 = 3;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "()V")
	public static void method3562() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static40.aClass290ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static40.aClass290ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static126.anInt2626; local6++) {
					for (local9 = 0; local9 < Static108.anInt2385; local9++) {
						if (Static40.aClass290ArrayArrayArray4[local3][local6][local9] != null) {
							Static40.aClass290ArrayArrayArray4[local3][local6][local9].method7120();
						}
						Static40.aClass290ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static40.aClass290ArrayArrayArray4 = null;
		Static163.aClass52Array4 = null;
		if (Static23.aClass290ArrayArrayArray9 != null) {
			for (local3 = 0; local3 < Static23.aClass290ArrayArrayArray9.length; local3++) {
				for (local6 = 0; local6 < Static126.anInt2626; local6++) {
					for (local9 = 0; local9 < Static108.anInt2385; local9++) {
						if (Static23.aClass290ArrayArrayArray9[local3][local6][local9] != null) {
							Static23.aClass290ArrayArrayArray9[local3][local6][local9].method7120();
						}
						Static23.aClass290ArrayArrayArray9[local3][local6][local9] = null;
					}
				}
			}
		}
		Static23.aClass290ArrayArrayArray9 = null;
		Static238.aClass52Array2 = null;
		Static279.aClass290ArrayArrayArray7 = null;
		Static511.aClass52Array3 = null;
		Static400.anInt7398 = 0;
		if (Static410.aClass324Array2 != null) {
			for (local3 = 0; local3 < Static400.anInt7398; local3++) {
				Static410.aClass324Array2[local3] = null;
			}
		}
		if (Static167.aClass6_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static167.anInt3855; local3++) {
				Static167.aClass6_Sub1Array1[local3] = null;
			}
			Static167.anInt3855 = 0;
		}
		if (Static513.aClass103Array1 != null) {
			for (local3 = 0; local3 < Static84.anInt1836; local3++) {
				Static513.aClass103Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static399.anInt7385; local6++) {
				for (local9 = 0; local9 < Static126.anInt2626; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static108.anInt2385; local160++) {
						Static329.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static84.anInt1836 = 0;
		}
		Static40.anIntArrayArrayArray3 = null;
		Static288.method4871();
		Static210.aClass90_9.method2324();
		Static125.aByteArrayArray9 = null;
		Static63.anIntArrayArray20 = null;
		Static222.aShortArrayArray5 = null;
		Static442.aClass7_1 = null;
		Static531.aClass205_6 = null;
		Static263.aClass5_9 = null;
	}
}
