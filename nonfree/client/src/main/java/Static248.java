import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mk", name = "O", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_150 = new Class189("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
	public static void method3735() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static276.aClass118ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static276.aClass118ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static405.anInt6684; local6++) {
					for (local9 = 0; local9 < Static37.anInt1025; local9++) {
						if (Static276.aClass118ArrayArrayArray3[local3][local6][local9] != null) {
							Static276.aClass118ArrayArrayArray3[local3][local6][local9].method2820();
						}
						Static276.aClass118ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static276.aClass118ArrayArrayArray3 = null;
		Static26.aClass159Array1 = null;
		if (Static38.aClass118ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static38.aClass118ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static405.anInt6684; local6++) {
					for (local9 = 0; local9 < Static37.anInt1025; local9++) {
						if (Static38.aClass118ArrayArrayArray1[local3][local6][local9] != null) {
							Static38.aClass118ArrayArrayArray1[local3][local6][local9].method2820();
						}
						Static38.aClass118ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static38.aClass118ArrayArrayArray1 = null;
		Static85.aClass159Array2 = null;
		Static263.aClass118ArrayArrayArray2 = null;
		Static444.aClass159Array3 = null;
		Static135.anInt2831 = 0;
		if (Static161.aClass155Array1 != null) {
			for (local3 = 0; local3 < Static135.anInt2831; local3++) {
				Static161.aClass155Array1[local3] = null;
			}
		}
		if (Static434.aClass7_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static232.anInt4417; local3++) {
				Static434.aClass7_Sub2Array3[local3] = null;
			}
			Static232.anInt4417 = 0;
		}
		if (Static375.aClass191Array2 != null) {
			for (local3 = 0; local3 < Static268.anInt5045; local3++) {
				Static375.aClass191Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static362.anInt6122; local6++) {
				for (local9 = 0; local9 < Static405.anInt6684; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static37.anInt1025; local160++) {
						Static24.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static268.anInt5045 = 0;
		}
		Static74.anIntArrayArrayArray3 = null;
		Static281.method5785();
		Static344.aClass138_5.method3308();
		Static419.aByteArrayArray22 = null;
		Static305.anIntArrayArray37 = null;
		Static267.aByteArrayArray12 = null;
		Static275.aClass22_1 = null;
		Static12.aClass107_1 = null;
		Static255.aClass172_9 = null;
	}
}
