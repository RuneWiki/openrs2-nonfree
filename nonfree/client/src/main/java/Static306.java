import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "[I")
	public static final int[] anIntArray584 = new int[500];

	@OriginalMember(owner = "client!rs", name = "U", descriptor = "Lclient!us;")
	public static final Class234 aClass234_107 = new Class234(52, 0);

	@OriginalMember(owner = "client!rs", name = "W", descriptor = "Z")
	public static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
	public static void method4730() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static307.aClass48ArrayArrayArray5 != null) {
			for (local3 = 0; local3 < Static307.aClass48ArrayArrayArray5.length; local3++) {
				for (local6 = 0; local6 < Static44.anInt791; local6++) {
					for (local9 = 0; local9 < Static103.anInt2050; local9++) {
						if (Static307.aClass48ArrayArrayArray5[local3][local6][local9] != null) {
							Static307.aClass48ArrayArrayArray5[local3][local6][local9].method992();
						}
						Static307.aClass48ArrayArrayArray5[local3][local6][local9] = null;
					}
				}
			}
		}
		Static307.aClass48ArrayArrayArray5 = null;
		Static89.aClass7Array4 = null;
		if (Static81.aClass48ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static81.aClass48ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static44.anInt791; local6++) {
					for (local9 = 0; local9 < Static103.anInt2050; local9++) {
						if (Static81.aClass48ArrayArrayArray2[local3][local6][local9] != null) {
							Static81.aClass48ArrayArrayArray2[local3][local6][local9].method992();
						}
						Static81.aClass48ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static81.aClass48ArrayArrayArray2 = null;
		Static25.aClass7Array1 = null;
		Static69.aClass48ArrayArrayArray1 = null;
		Static337.aClass7Array3 = null;
		Static345.anInt5825 = 0;
		if (Static45.aClass80Array1 != null) {
			for (local3 = 0; local3 < Static345.anInt5825; local3++) {
				Static45.aClass80Array1[local3] = null;
			}
		}
		if (Static316.aClass28_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static30.anInt545; local3++) {
				Static316.aClass28_Sub1Array2[local3] = null;
			}
			Static30.anInt545 = 0;
		}
		if (Static19.aClass3_Sub12_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static104.anInt2067; local3++) {
				Static19.aClass3_Sub12_Sub1Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static164.anInt2901; local6++) {
				for (local9 = 0; local9 < Static44.anInt791; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static103.anInt2050; local160++) {
						Static201.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static104.anInt2067 = 0;
		}
		Static330.anIntArrayArrayArray15 = null;
		Static272.method4267();
		Static2.aClass22_1.method289();
		Static231.aByteArrayArray14 = null;
		Static185.anIntArrayArray35 = null;
		Static278.aByteArrayArray17 = null;
		Static317.aClass137_4 = null;
		Static376.aClass118_7 = null;
		Static121.aClass155_1 = null;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)I")
	public static int method4731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}
}
