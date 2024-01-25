import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
	public static int anInt1399 = 0;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "Lclient!ae;")
	public static Class6 aClass6_1 = new Class6(8);

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "[Lclient!si;")
	public static final Class113_Sub1[] aClass113_Sub1Array1 = new Class113_Sub1[29];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Lclient!vf;")
	public static Class24 method1144() {
		try {
			return (Class24) Class.forName("Class24_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLclient!cd;)V")
	public static void method1145(@OriginalArg(1) Class10_Sub1_Sub2_Sub1 arg0) {
		for (@Pc(15) Class1_Sub43 local15 = (Class1_Sub43) Static337.aClass14_36.method302(); local15 != null; local15 = (Class1_Sub43) Static337.aClass14_36.method313()) {
			if (local15.aClass10_Sub1_Sub2_Sub1_1 == arg0) {
				if (local15.aClass1_Sub31_Sub1_3 != null) {
					Static142.aClass1_Sub31_Sub2_1.method4444(local15.aClass1_Sub31_Sub1_3);
					local15.aClass1_Sub31_Sub1_3 = null;
				}
				local15.method5796();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "()V")
	public static void method1146() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static321.aClass83ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static321.aClass83ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static97.anInt1852; local6++) {
					for (local9 = 0; local9 < Static3.anInt38; local9++) {
						if (Static321.aClass83ArrayArrayArray2[local3][local6][local9] != null) {
							Static321.aClass83ArrayArrayArray2[local3][local6][local9].method1603();
						}
						Static321.aClass83ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static321.aClass83ArrayArrayArray2 = null;
		Static278.aClass12Array3 = null;
		if (Static298.aClass83ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static298.aClass83ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static97.anInt1852; local6++) {
					for (local9 = 0; local9 < Static3.anInt38; local9++) {
						if (Static298.aClass83ArrayArrayArray1[local3][local6][local9] != null) {
							Static298.aClass83ArrayArrayArray1[local3][local6][local9].method1603();
						}
						Static298.aClass83ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static298.aClass83ArrayArrayArray1 = null;
		Static81.aClass12Array1 = null;
		Static347.aClass83ArrayArrayArray3 = null;
		Static263.aClass12Array2 = null;
		Static274.anInt5613 = 0;
		if (Static82.aClass46Array2 != null) {
			for (local3 = 0; local3 < Static274.anInt5613; local3++) {
				Static82.aClass46Array2[local3] = null;
			}
		}
		if (Static51.aClass10_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static44.anInt1171; local3++) {
				Static51.aClass10_Sub1Array1[local3] = null;
			}
			Static44.anInt1171 = 0;
		}
		if (Static174.aClass1_Sub19_Sub1Array4 != null) {
			for (local3 = 0; local3 < Static168.anInt3459; local3++) {
				Static174.aClass1_Sub19_Sub1Array4[local3] = null;
			}
			for (local6 = 0; local6 < Static132.anInt6773; local6++) {
				for (local9 = 0; local9 < Static97.anInt1852; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static3.anInt38; local160++) {
						Static87.anIntArrayArrayArray4[local6][local9][local160] = 0;
					}
				}
			}
			Static168.anInt3459 = 0;
		}
		Static200.anIntArrayArrayArray10 = null;
		Static354.method5861();
		Static88.aClass122_1.method2619();
		Static71.aClass135_1 = null;
		Static345.anIntArrayArray60 = null;
	}
}
