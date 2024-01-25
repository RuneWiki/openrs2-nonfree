import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!ok", name = "T", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
	public static int anInt5041;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
	public static int anInt5036 = 0;

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "Lclient!lf;")
	public static final Class145 aClass145_3 = new Class145("runescape", 0);

	@OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
	public static int anInt5039 = 0;

	@OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
	public static int anInt5040 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
	public static void method4075() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static182.aClass211ArrayArrayArray6 != null) {
			for (local3 = 0; local3 < Static182.aClass211ArrayArrayArray6.length; local3++) {
				for (local6 = 0; local6 < Static377.anInt6467; local6++) {
					for (local9 = 0; local9 < Static378.anInt6480; local9++) {
						if (Static182.aClass211ArrayArrayArray6[local3][local6][local9] != null) {
							Static182.aClass211ArrayArrayArray6[local3][local6][local9].method4953();
						}
						Static182.aClass211ArrayArrayArray6[local3][local6][local9] = null;
					}
				}
			}
		}
		Static182.aClass211ArrayArrayArray6 = null;
		Static328.aClass136Array3 = null;
		if (Static87.aClass211ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static87.aClass211ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static377.anInt6467; local6++) {
					for (local9 = 0; local9 < Static378.anInt6480; local9++) {
						if (Static87.aClass211ArrayArrayArray1[local3][local6][local9] != null) {
							Static87.aClass211ArrayArrayArray1[local3][local6][local9].method4953();
						}
						Static87.aClass211ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static87.aClass211ArrayArrayArray1 = null;
		Static160.aClass136Array2 = null;
		Static268.aClass211ArrayArrayArray4 = null;
		Static92.aClass136Array1 = null;
		Static361.anInt6131 = 0;
		if (Static179.aClass226Array1 != null) {
			for (local3 = 0; local3 < Static361.anInt6131; local3++) {
				Static179.aClass226Array1[local3] = null;
			}
		}
		if (Static455.aClass26_Sub2Array5 != null) {
			for (local3 = 0; local3 < Static22.anInt3913; local3++) {
				Static455.aClass26_Sub2Array5[local3] = null;
			}
			Static22.anInt3913 = 0;
		}
		if (Static110.aClass124Array2 != null) {
			for (local3 = 0; local3 < Static139.anInt2353; local3++) {
				Static110.aClass124Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static107.anInt1964; local6++) {
				for (local9 = 0; local9 < Static377.anInt6467; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static378.anInt6480; local160++) {
						Static242.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static139.anInt2353 = 0;
		}
		Static223.anIntArrayArrayArray10 = null;
		Static68.method1190();
		Static146.aClass188_4.method4529();
		Static403.aByteArrayArray135 = null;
		Static51.anIntArrayArray28 = null;
		Static242.aByteArrayArray83 = null;
		Static66.aClass54_1 = null;
		Static253.aClass18_5 = null;
		Static233.aClass109_7 = null;
	}
}
