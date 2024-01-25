import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
	public static int anInt2105;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!ej;")
	public static final Class84 aClass84_5 = new Class84("", 17);

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "J")
	public static long aLong60 = 0L;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	public static int anInt2101 = 0;

	@OriginalMember(owner = "client!ep", name = "s", descriptor = "Lclient!ej;")
	public static final Class84 aClass84_6 = new Class84("", 15);

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "Lclient!tk;")
	public static final Class305 aClass305_2 = new Class305();

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "()V")
	public static void method1820() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static144.aClass9ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static144.aClass9ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static80.anInt1391; local6++) {
					for (local9 = 0; local9 < Static164.anInt2881; local9++) {
						if (Static144.aClass9ArrayArrayArray1[local3][local6][local9] != null) {
							Static144.aClass9ArrayArrayArray1[local3][local6][local9].method132();
						}
						Static144.aClass9ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static144.aClass9ArrayArrayArray1 = null;
		Static34.aClass60Array10 = null;
		if (Static177.aClass9ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static177.aClass9ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static80.anInt1391; local6++) {
					for (local9 = 0; local9 < Static164.anInt2881; local9++) {
						if (Static177.aClass9ArrayArrayArray2[local3][local6][local9] != null) {
							Static177.aClass9ArrayArrayArray2[local3][local6][local9].method132();
						}
						Static177.aClass9ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static177.aClass9ArrayArrayArray2 = null;
		Static127.aClass60Array7 = null;
		Static208.aClass9ArrayArrayArray3 = null;
		Static285.aClass60Array8 = null;
		Static342.anInt9106 = 0;
		if (Static175.aClass268Array2 != null) {
			for (local3 = 0; local3 < Static342.anInt9106; local3++) {
				Static175.aClass268Array2[local3] = null;
			}
		}
		if (Static187.aClass29_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static402.anInt7079; local3++) {
				Static187.aClass29_Sub2Array3[local3] = null;
			}
			Static402.anInt7079 = 0;
		}
		if (Static149.aClass178Array1 != null) {
			for (local3 = 0; local3 < Static164.anInt2888; local3++) {
				Static149.aClass178Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static41.anInt687; local6++) {
				for (local9 = 0; local9 < Static80.anInt1391; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static164.anInt2881; local160++) {
						Static140.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static164.anInt2888 = 0;
		}
		Static448.anIntArrayArrayArray18 = null;
		Static68.method884();
		Static78.aClass249_1.method5818();
		Static151.aByteArrayArray8 = null;
		Static284.anIntArrayArray56 = null;
		Static24.aShortArrayArray11 = null;
		Static325.aClass158_1 = null;
		Static565.aClass34_11 = null;
		Static432.aClass121_14 = null;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[BIB)I")
	public static int method1828(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = -1;
		for (@Pc(17) int local17 = arg0; local17 < arg2; local17++) {
			local15 = local15 >>> 8 ^ Class187.anIntArray455[(local15 ^ arg1[local17]) & 0xFF];
		}
		return ~local15;
	}
}
