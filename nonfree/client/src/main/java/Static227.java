import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Lclient!n;")
	public static Interface8 anInterface8_11;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public static int anInt4495;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!dm;")
	public static final Class68 aClass68_4 = new Class68();

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	public static int anInt4490 = 10;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public static int anInt4494 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	public static void method3905() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static222.aClass255ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static222.aClass255ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static93.anInt1898; local6++) {
					for (local9 = 0; local9 < Static382.anInt6965; local9++) {
						if (Static222.aClass255ArrayArrayArray1[local3][local6][local9] != null) {
							Static222.aClass255ArrayArrayArray1[local3][local6][local9].method6108();
						}
						Static222.aClass255ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static222.aClass255ArrayArrayArray1 = null;
		Static16.aClass205Array1 = null;
		if (Static332.aClass255ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static332.aClass255ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static93.anInt1898; local6++) {
					for (local9 = 0; local9 < Static382.anInt6965; local9++) {
						if (Static332.aClass255ArrayArrayArray3[local3][local6][local9] != null) {
							Static332.aClass255ArrayArrayArray3[local3][local6][local9].method6108();
						}
						Static332.aClass255ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static332.aClass255ArrayArrayArray3 = null;
		Static209.aClass205Array2 = null;
		Static242.aClass255ArrayArrayArray2 = null;
		Static544.aClass205Array3 = null;
		Static216.anInt4206 = 0;
		if (Static224.aClass260Array1 != null) {
			for (local3 = 0; local3 < Static216.anInt4206; local3++) {
				Static224.aClass260Array1[local3] = null;
			}
		}
		if (Static301.aClass49_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static480.anInt7981; local3++) {
				Static301.aClass49_Sub2Array3[local3] = null;
			}
			Static480.anInt7981 = 0;
		}
		if (Static447.aClass62Array1 != null) {
			for (local3 = 0; local3 < Static246.anInt4872; local3++) {
				Static447.aClass62Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static388.anInt7032; local6++) {
				for (local9 = 0; local9 < Static93.anInt1898; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static382.anInt6965; local160++) {
						Static245.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static246.anInt4872 = 0;
		}
		Static87.anIntArrayArrayArray1 = null;
		Static205.method3536();
		Static153.aClass299_3.method7028();
		Static347.aByteArrayArray18 = null;
		Static193.anIntArrayArray95 = null;
		Static398.aShortArrayArray7 = null;
		Static497.aClass75_1 = null;
		Static142.aClass118_5 = null;
		Static416.aClass122_7 = null;
	}
}
