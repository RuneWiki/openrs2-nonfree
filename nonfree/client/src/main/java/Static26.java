import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[B")
	public static byte[] aByteArray7;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt709;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[5][5000];

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	public static int anInt701 = 0;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!lc;")
	public static Class79 aClass79_4 = new Class79(4);

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString28 = "Drop";

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!se;)Lclient!se;")
	public static Class122 method381(@OriginalArg(1) Class122 arg0) {
		@Pc(6) Class122 local6 = Static39.method712(arg0);
		if (local6 == null) {
			local6 = arg0.aClass122_16;
		}
		return local6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	public static void method382() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static84.aClass1_Sub16ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static84.aClass1_Sub16ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static94.anInt4252; local6++) {
					for (local9 = 0; local9 < Static239.anInt5153; local9++) {
						Static84.aClass1_Sub16ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		if (Static150.aClass1_Sub16ArrayArrayArray5 != null) {
			for (local3 = 0; local3 < Static150.aClass1_Sub16ArrayArrayArray5.length; local3++) {
				for (local6 = 0; local6 < Static94.anInt4252; local6++) {
					for (local9 = 0; local9 < Static239.anInt5153; local9++) {
						Static150.aClass1_Sub16ArrayArrayArray5[local3][local6][local9] = null;
					}
				}
			}
		}
		Static217.anInt4761 = 0;
		if (Static255.aClass2Array2 != null) {
			for (local3 = 0; local3 < Static217.anInt4761; local3++) {
				Static255.aClass2Array2[local3] = null;
			}
		}
		if (Static145.aClass47Array2 != null) {
			for (local3 = 0; local3 < Static11.anInt496; local3++) {
				Static145.aClass47Array2[local3] = null;
			}
			Static11.anInt496 = 0;
		}
		if (Static252.aClass47Array3 != null) {
			for (local3 = 0; local3 < Static252.aClass47Array3.length; local3++) {
				Static252.aClass47Array3[local3] = null;
			}
		}
	}
}
