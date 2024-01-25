import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt1943;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!sd;")
	public static final Class220 aClass220_10 = new Class220(14, 0, 4, 1);

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_54 = new Class12(7, -2);

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_52 = new Class119("M", "M", "M", "M");

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_53 = new Class119("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)Lclient!qu;")
	public static Class207 method1611(@OriginalArg(1) int arg0) {
		@Pc(15) Class207 local15 = (Class207) Static399.aClass102_54.method2258((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static141.aClass82_65.method1817(0, arg0);
		local15 = new Class207();
		if (local25 != null) {
			local15.method4545(new Class1_Sub28(local25), arg0);
		}
		Static399.aClass102_54.method2272((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZB)V")
	public static void method1613(@OriginalArg(0) boolean arg0) {
		Static111.method1777();
		if (!Static247.method3528(Static312.anInt5414)) {
			return;
		}
		Static343.anInt5889++;
		if (Static343.anInt5889 < 50 && !arg0) {
			return;
		}
		Static343.anInt5889 = 0;
		if (!Static321.aBoolean622 && Static395.aClass131_3 != null) {
			Static52.method867(Static412.aClass103_239);
			try {
				Static395.aClass131_3.method2928(Static18.aClass1_Sub28_Sub1_1.aByteArray86, Static18.aClass1_Sub28_Sub1_1.anInt6812);
				Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
			} catch (@Pc(50) IOException local50) {
				Static321.aBoolean622 = true;
			}
		}
		Static111.method1777();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public static void method1619() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static7.aClass169ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static7.aClass169ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static37.anInt666; local6++) {
					for (local9 = 0; local9 < Static408.anInt6716; local9++) {
						if (Static7.aClass169ArrayArrayArray1[local3][local6][local9] != null) {
							Static7.aClass169ArrayArrayArray1[local3][local6][local9].method3810();
						}
						Static7.aClass169ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static7.aClass169ArrayArrayArray1 = null;
		Static330.aClass157Array2 = null;
		if (Static145.aClass169ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static145.aClass169ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static37.anInt666; local6++) {
					for (local9 = 0; local9 < Static408.anInt6716; local9++) {
						if (Static145.aClass169ArrayArrayArray4[local3][local6][local9] != null) {
							Static145.aClass169ArrayArrayArray4[local3][local6][local9].method3810();
						}
						Static145.aClass169ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static145.aClass169ArrayArrayArray4 = null;
		Static343.aClass157Array3 = null;
		Static359.aClass169ArrayArrayArray5 = null;
		Static94.aClass157Array1 = null;
		Static278.anInt4935 = 0;
		if (Static78.aClass252Array5 != null) {
			for (local3 = 0; local3 < Static278.anInt4935; local3++) {
				Static78.aClass252Array5[local3] = null;
			}
		}
		if (Static372.aClass25_Sub5Array2 != null) {
			for (local3 = 0; local3 < Static131.anInt2379; local3++) {
				Static372.aClass25_Sub5Array2[local3] = null;
			}
			Static131.anInt2379 = 0;
		}
		if (Static45.aClass137Array4 != null) {
			for (local3 = 0; local3 < Static358.anInt1533; local3++) {
				Static45.aClass137Array4[local3] = null;
			}
			for (local6 = 0; local6 < anInt1943; local6++) {
				for (local9 = 0; local9 < Static37.anInt666; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static408.anInt6716; local160++) {
						Static261.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static358.anInt1533 = 0;
		}
		Static271.anIntArrayArrayArray15 = null;
		Static334.method4494();
		Static252.aClass262_10.method5812();
		Static438.aByteArrayArray19 = null;
		Static47.anIntArrayArray10 = null;
		Static142.aShortArrayArray4 = null;
		Static344.aClass58_1 = null;
		Static270.aClass32_7 = null;
		Static52.aClass34_1 = null;
	}
}
