import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
	public static int anInt4680;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public static int anInt4684;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()V", line = 4)
	public static void method4367() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static364.aClass67ArrayArrayArray5 != null) {
			for (local3 = 0; local3 < Static364.aClass67ArrayArrayArray5.length; local3++) {
				for (local6 = 0; local6 < Static68.anInt1682; local6++) {
					for (local9 = 0; local9 < Static196.anInt3769; local9++) {
						if (Static364.aClass67ArrayArrayArray5[local3][local6][local9] != null) {
							Static364.aClass67ArrayArrayArray5[local3][local6][local9].method1966();
						}
						Static364.aClass67ArrayArrayArray5[local3][local6][local9] = null;
					}
				}
			}
		}
		Static364.aClass67ArrayArrayArray5 = null;
		Static307.aClass6Array3 = null;
		if (Static84.aClass67ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static84.aClass67ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static68.anInt1682; local6++) {
					for (local9 = 0; local9 < Static196.anInt3769; local9++) {
						if (Static84.aClass67ArrayArrayArray4[local3][local6][local9] != null) {
							Static84.aClass67ArrayArrayArray4[local3][local6][local9].method1966();
						}
						Static84.aClass67ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static84.aClass67ArrayArrayArray4 = null;
		Static174.aClass6Array2 = null;
		Static307.aClass67ArrayArrayArray3 = null;
		Static340.aClass6Array4 = null;
		Static245.anInt4891 = 0;
		if (Static227.aClass58Array3 != null) {
			for (local3 = 0; local3 < Static245.anInt4891; local3++) {
				Static227.aClass58Array3[local3] = null;
			}
		}
		if (Static91.aClass11_Sub5Array1 != null) {
			for (local3 = 0; local3 < Class245.anInt7064; local3++) {
				Static91.aClass11_Sub5Array1[local3] = null;
			}
			Class245.anInt7064 = 0;
		}
		if (Static283.aClass2_Sub26_Sub1Array2 != null) {
			for (local3 = 0; local3 < Static154.anInt3135; local3++) {
				Static283.aClass2_Sub26_Sub1Array2[local3] = null;
			}
			for (local6 = 0; local6 < Static86.anInt1912; local6++) {
				for (local9 = 0; local9 < Static68.anInt1682; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static196.anInt3769; local160++) {
						Static48.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static154.anInt3135 = 0;
		}
		Static155.anIntArrayArrayArray9 = null;
		Static316.method5760();
		Class2_Sub4.aClass36_6.method1418();
		Static291.aByteArrayArray17 = null;
		Static78.anIntArrayArray16 = null;
		Static31.aByteArrayArray4 = null;
		Static153.aClass15_1 = null;
		Static48.aClass14_2 = null;
		Static16.aClass19_10 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)I", line = 162)
	public static int method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 190)
	public static void method4370() {
		if (Static90.anInt2032 != -1) {
			Static238.method4403(false, -1, Static90.anInt2032, -1);
			Static90.anInt2032 = -1;
		}
	}
}
