import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!dr;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "[I")
	public static final int[] anIntArray124 = new int[500];

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_52 = new Class157(10, -1);

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_53 = new Class157(13, 7);

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_62 = new Class221(91, 7);

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()V")
	public static void method1604() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static150.aClass51ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static150.aClass51ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static344.anInt6692; local6++) {
					for (local9 = 0; local9 < Static63.anInt1129; local9++) {
						if (Static150.aClass51ArrayArrayArray2[local3][local6][local9] != null) {
							Static150.aClass51ArrayArrayArray2[local3][local6][local9].method1206();
						}
						Static150.aClass51ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static150.aClass51ArrayArrayArray2 = null;
		Static101.aClass105Array2 = null;
		if (Static54.aClass51ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static54.aClass51ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static344.anInt6692; local6++) {
					for (local9 = 0; local9 < Static63.anInt1129; local9++) {
						if (Static54.aClass51ArrayArrayArray1[local3][local6][local9] != null) {
							Static54.aClass51ArrayArrayArray1[local3][local6][local9].method1206();
						}
						Static54.aClass51ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static54.aClass51ArrayArrayArray1 = null;
		Static121.aClass105Array3 = null;
		Static196.aClass51ArrayArrayArray3 = null;
		Static9.aClass105Array1 = null;
		Static336.anInt6523 = 0;
		if (Static133.aClass175Array2 != null) {
			for (local3 = 0; local3 < Static336.anInt6523; local3++) {
				Static133.aClass175Array2[local3] = null;
			}
		}
		if (Static230.aClass1_Sub2Array6 != null) {
			for (local3 = 0; local3 < Static204.anInt4466; local3++) {
				Static230.aClass1_Sub2Array6[local3] = null;
			}
			Static204.anInt4466 = 0;
		}
		if (Static120.aClass2_Sub10_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static88.anInt1647; local3++) {
				Static120.aClass2_Sub10_Sub1Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static32.anInt516; local6++) {
				for (local9 = 0; local9 < Static344.anInt6692; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static63.anInt1129; local160++) {
						Static360.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static88.anInt1647 = 0;
		}
		Static46.anIntArrayArrayArray3 = null;
		Static186.method3505();
		Static45.aClass193_4.method5218();
		Static328.aClass80_29 = null;
		Static26.anIntArrayArray35 = null;
		Static299.aClass38_5 = null;
		Static145.aClass37_8 = null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)Lclient!ek;")
	public static Class61 method1616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class61 local7 = new Class61();
		local7.anInt1473 = arg1 + 5 + 1;
		local7.anInt1460 = -1;
		local7.anInt1457 = -1;
		local7.anInt1459 = arg0 + 1 + 5;
		local7.anIntArrayArray19 = new int[local7.anInt1473][local7.anInt1459];
		local7.method1611();
		return local7;
	}
}
