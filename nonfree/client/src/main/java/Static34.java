import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "Lclient!rb;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()V")
	public static void method589() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static276.aClass82ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static276.aClass82ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static362.anInt6113; local6++) {
					for (local9 = 0; local9 < Static195.anInt3127; local9++) {
						if (Static276.aClass82ArrayArrayArray3[local3][local6][local9] != null) {
							Static276.aClass82ArrayArrayArray3[local3][local6][local9].method1610();
						}
						Static276.aClass82ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static276.aClass82ArrayArrayArray3 = null;
		Static240.aClass163Array3 = null;
		if (Static55.aClass82ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static55.aClass82ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static362.anInt6113; local6++) {
					for (local9 = 0; local9 < Static195.anInt3127; local9++) {
						if (Static55.aClass82ArrayArrayArray1[local3][local6][local9] != null) {
							Static55.aClass82ArrayArrayArray1[local3][local6][local9].method1610();
						}
						Static55.aClass82ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static55.aClass82ArrayArrayArray1 = null;
		Static164.aClass163Array1 = null;
		Static159.aClass82ArrayArrayArray2 = null;
		Static202.aClass163Array2 = null;
		Static146.anInt6161 = 0;
		if (Static64.aClass147Array1 != null) {
			for (local3 = 0; local3 < Static146.anInt6161; local3++) {
				Static64.aClass147Array1[local3] = null;
			}
		}
		if (Static183.aClass20_Sub3Array5 != null) {
			for (local3 = 0; local3 < Static253.anInt4090; local3++) {
				Static183.aClass20_Sub3Array5[local3] = null;
			}
			Static253.anInt4090 = 0;
		}
		if (Static280.aClass71Array1 != null) {
			for (local3 = 0; local3 < Static73.anInt1403; local3++) {
				Static280.aClass71Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static97.anInt1709; local6++) {
				for (local9 = 0; local9 < Static362.anInt6113; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static195.anInt3127; local160++) {
						Static112.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static73.anInt1403 = 0;
		}
		Static126.anIntArrayArrayArray2 = null;
		Static108.method1522();
		Static449.aClass227_8.method4835();
		Static132.aByteArrayArray16 = null;
		Static223.anIntArrayArray91 = null;
		Static106.aByteArrayArray14 = null;
		Static63.aClass2_1 = null;
		Static144.aClass40_3 = null;
		Static257.aClass128_36 = null;
	}
}
