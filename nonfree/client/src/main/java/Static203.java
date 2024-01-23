import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array9;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	public static int anInt3367;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[[[Lclient!jo;")
	public static Class96[][][] aClass96ArrayArrayArray5;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public static int anInt3368 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
	public static void method2967() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static193.aClass1_Sub16ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static193.aClass1_Sub16ArrayArrayArray2.length; local3++) {
				for (local9 = 0; local9 < Static220.anInt4129; local9++) {
					for (local14 = 0; local14 < Static298.anInt5372; local14++) {
						Static193.aClass1_Sub16ArrayArrayArray2[local3][local9][local14] = null;
					}
				}
			}
		}
		Static213.aClass1_Sub15ArrayArray37 = null;
		if (Static184.aClass1_Sub16ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static184.aClass1_Sub16ArrayArrayArray1.length; local3++) {
				for (local9 = 0; local9 < Static220.anInt4129; local9++) {
					for (local14 = 0; local14 < Static298.anInt5372; local14++) {
						Static184.aClass1_Sub16ArrayArrayArray1[local3][local9][local14] = null;
					}
				}
			}
		}
		Static142.aClass1_Sub15ArrayArray16 = null;
		Static3.anInt118 = 0;
		if (Static225.aClass59Array2 != null) {
			for (local3 = 0; local3 < Static3.anInt118; local3++) {
				Static225.aClass59Array2[local3] = null;
			}
		}
		if (Static242.aClass45Array3 != null) {
			for (local3 = 0; local3 < Static79.anInt1733; local3++) {
				Static242.aClass45Array3[local3] = null;
			}
			Static79.anInt1733 = 0;
		}
		if (Static80.aClass45Array1 != null) {
			for (local3 = 0; local3 < Static80.aClass45Array1.length; local3++) {
				Static80.aClass45Array1[local3] = null;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!nm;I)V")
	public static void method2968(@OriginalArg(0) Class119 arg0) {
		Static146.aClass119_58 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
	public static void method2969(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub5_Sub21 local4 = Static278.method4266(7, arg0);
		local4.method4064();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	public static void method2971(@OriginalArg(0) int arg0) {
		if (Static19.method322(arg0)) {
			Static309.method4596(-1, Static176.aClass157ArrayArray1[arg0]);
		}
	}
}
