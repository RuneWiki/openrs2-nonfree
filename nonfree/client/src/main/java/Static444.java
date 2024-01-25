import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_184 = new Class251(75, 7);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	public static void method6621() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static501.aClass89ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static501.aClass89ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static654.anInt10715; local6++) {
					for (local9 = 0; local9 < Static180.anInt2928; local9++) {
						if (Static501.aClass89ArrayArrayArray3[local3][local6][local9] != null) {
							Static501.aClass89ArrayArrayArray3[local3][local6][local9].method1856();
						}
						Static501.aClass89ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static501.aClass89ArrayArrayArray3 = null;
		Static445.aClass159Array3 = null;
		if (Static389.aClass89ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static389.aClass89ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static654.anInt10715; local6++) {
					for (local9 = 0; local9 < Static180.anInt2928; local9++) {
						if (Static389.aClass89ArrayArrayArray2[local3][local6][local9] != null) {
							Static389.aClass89ArrayArrayArray2[local3][local6][local9].method1856();
						}
						Static389.aClass89ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static389.aClass89ArrayArrayArray2 = null;
		Static346.aClass159Array2 = null;
		Static63.aClass89ArrayArrayArray1 = null;
		Static258.aClass159Array1 = null;
		Static18.aBooleanArrayArray1 = null;
		Static208.aBooleanArrayArray12 = null;
		Static77.anIntArray72 = null;
		Static684.aBooleanArrayArrayArray2 = null;
		Static218.aBooleanArrayArrayArray1 = null;
		Static396.method6069();
		if (Static95.aClass4_Sub3_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static380.anInt6702; local3++) {
				Static95.aClass4_Sub3_Sub3Array1[local3] = null;
			}
			Static380.anInt6702 = 0;
		}
		Static664.aClass4_Sub3Array5 = null;
		Static111.aClass4_Sub3Array2 = null;
		Static170.aClass4_Sub3Array3 = null;
		if (Static91.aClass4_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static91.aClass4_Sub3Array1.length; local3++) {
				Static91.aClass4_Sub3Array1[local3] = null;
			}
			Static383.anInt6725 = 0;
		}
		if (Static482.aClass4_Sub3Array4 != null) {
			for (local3 = 0; local3 < Static482.aClass4_Sub3Array4.length; local3++) {
				Static482.aClass4_Sub3Array4[local3] = null;
			}
			Static521.anInt8910 = 0;
		}
		if (Static351.aClass275Array5 != null) {
			for (local3 = 0; local3 < Static306.anInt6132; local3++) {
				Static351.aClass275Array5[local3] = null;
			}
			for (local6 = 0; local6 < Static59.anInt987; local6++) {
				for (local9 = 0; local9 < Static654.anInt10715; local9++) {
					for (@Pc(217) int local217 = 0; local217 < Static180.anInt2928; local217++) {
						Static378.aLongArrayArrayArray1[local6][local9][local217] = 0L;
					}
				}
			}
			Static306.anInt6132 = 0;
		}
		Static344.method5260();
		Static603.aClass307_3 = Static603.aClass307_4;
		Static603.aClass307_3.method7676();
		Static690.aByteArrayArray33 = null;
		Static200.anIntArrayArray59 = null;
		Static587.aShortArrayArray4 = null;
		if (Static156.aClass143Array1 != null) {
			Static256.method4311();
			Static554.aClass144_12.method6913(1);
			Static554.aClass144_12.method6900(0);
		}
		if (Static100.aClass399Array1 != null) {
			Static100.aClass399Array1 = null;
		}
		Static554.aClass144_12 = null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZC)Z")
	public static boolean method6623(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
