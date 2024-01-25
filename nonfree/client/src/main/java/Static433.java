import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_7;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Lclient!sk;")
	public static Class226 aClass226_2;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public static int anInt7309 = 0;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public static int anInt7312 = 0;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public static int anInt7313 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public static void method5871() {
		Static28.aClass75_3.JA(Static289.aFloat74 * ((float) Static434.aClass165_Sub1_1.anInt4210 * 0.1F + 0.7F));
		Static28.aClass75_3.B(Static326.anInt5851, Static22.aFloat6, Static85.aFloat11, (float) (Static258.anInt4503 << 0), (float) (Static449.anInt7477 << 0), (float) (Static73.anInt1228 << 0));
		Static28.aClass75_3.method5958(Static218.aClass141_2);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)I")
	public static int method5872() {
		if ((double) Static5.aFloat87 == 3.0D) {
			return 37;
		} else if ((double) Static5.aFloat87 == 4.0D) {
			return 50;
		} else if ((double) Static5.aFloat87 == 6.0D) {
			return 75;
		} else if ((double) Static5.aFloat87 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
	public static void method5874(@OriginalArg(1) int arg0) {
		Static111.anInt1853 = arg0;
		@Pc(7) Class188 local7 = Static194.aClass188_32;
		synchronized (Static194.aClass188_32) {
			Static194.aClass188_32.method4156();
		}
		local7 = Static270.aClass188_40;
		synchronized (Static270.aClass188_40) {
			Static270.aClass188_40.method4156();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	public static void method5875() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static292.aClass36ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static292.aClass36ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static212.anInt3636; local6++) {
					for (local9 = 0; local9 < Static104.anInt1675; local9++) {
						if (Static292.aClass36ArrayArrayArray2[local3][local6][local9] != null) {
							Static292.aClass36ArrayArrayArray2[local3][local6][local9].method701();
						}
						Static292.aClass36ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static292.aClass36ArrayArrayArray2 = null;
		Static114.aClass22Array2 = null;
		if (Static317.aClass36ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static317.aClass36ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static212.anInt3636; local6++) {
					for (local9 = 0; local9 < Static104.anInt1675; local9++) {
						if (Static317.aClass36ArrayArrayArray3[local3][local6][local9] != null) {
							Static317.aClass36ArrayArrayArray3[local3][local6][local9].method701();
						}
						Static317.aClass36ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static317.aClass36ArrayArrayArray3 = null;
		Static46.aClass22Array1 = null;
		Static175.aClass36ArrayArrayArray1 = null;
		Static241.aClass22Array3 = null;
		Static461.anInt7751 = 0;
		if (Static123.aClass160Array1 != null) {
			for (local3 = 0; local3 < Static461.anInt7751; local3++) {
				Static123.aClass160Array1[local3] = null;
			}
		}
		if (Static218.aClass11_Sub5Array3 != null) {
			for (local3 = 0; local3 < Static315.anInt5651; local3++) {
				Static218.aClass11_Sub5Array3[local3] = null;
			}
			Static315.anInt5651 = 0;
		}
		if (Static330.aClass38Array1 != null) {
			for (local3 = 0; local3 < Static439.anInt7384; local3++) {
				Static330.aClass38Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static180.anInt3181; local6++) {
				for (local9 = 0; local9 < Static212.anInt3636; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static104.anInt1675; local160++) {
						Static254.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static439.anInt7384 = 0;
		}
		Static59.anIntArrayArrayArray16 = null;
		Static268.method3718();
		Static393.aClass97_8.method2147();
		Static182.aByteArrayArray11 = null;
		Static427.anIntArrayArray176 = null;
		Static131.aShortArrayArray3 = null;
		Static45.aClass20_1 = null;
		Static34.aClass6_1 = null;
		Static29.aClass75_4 = null;
	}
}
