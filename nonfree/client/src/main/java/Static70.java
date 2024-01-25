import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!eg", name = "N", descriptor = "Lclient!jf;")
	public static Class96 aClass96_5 = null;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "[I")
	public static final int[] anIntArray82 = new int[50];

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
	public static int anInt1762 = 0;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!eg", name = "Z", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "[I")
	public static final int[] anIntArray84 = new int[4096];

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
	public static void method1548() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static275.aClass51ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static275.aClass51ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static12.anInt378; local6++) {
					for (local9 = 0; local9 < Static248.anInt4822; local9++) {
						if (Static275.aClass51ArrayArrayArray3[local3][local6][local9] != null) {
							Static275.aClass51ArrayArrayArray3[local3][local6][local9].method1255();
						}
						Static275.aClass51ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static275.aClass51ArrayArrayArray3 = null;
		Static262.aClass3Array3 = null;
		if (Static147.aClass51ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static147.aClass51ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static12.anInt378; local6++) {
					for (local9 = 0; local9 < Static248.anInt4822; local9++) {
						if (Static147.aClass51ArrayArrayArray2[local3][local6][local9] != null) {
							Static147.aClass51ArrayArrayArray2[local3][local6][local9].method1255();
						}
						Static147.aClass51ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static147.aClass51ArrayArrayArray2 = null;
		Static93.aClass3Array1 = null;
		Static138.aClass51ArrayArrayArray1 = null;
		Static130.aClass3Array2 = null;
		Static5.anInt176 = 0;
		if (Static225.aClass183Array1 != null) {
			for (local3 = 0; local3 < Static5.anInt176; local3++) {
				Static225.aClass183Array1[local3] = null;
			}
		}
		if (Static108.aClass25_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static77.anInt1849; local3++) {
				Static108.aClass25_Sub1Array3[local3] = null;
			}
			Static77.anInt1849 = 0;
		}
		if (Static233.aClass5_Sub13_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static132.anInt2864; local3++) {
				Static233.aClass5_Sub13_Sub1Array3[local3] = null;
			}
			for (local6 = 0; local6 < Static248.anInt4820; local6++) {
				for (local9 = 0; local9 < Static12.anInt378; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static248.anInt4822; local160++) {
						Static318.anIntArrayArrayArray19[local6][local9][local160] = 0;
					}
				}
			}
			Static132.anInt2864 = 0;
		}
		Static200.anIntArrayArrayArray16 = null;
		Static355.method5834();
		Static161.aClass24_1.method625();
		Static134.aClass28_1 = null;
		Static267.anIntArrayArray40 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)B")
	public static byte method1551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
