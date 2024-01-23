import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "[Lclient!jn;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
	public static int anInt151 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)V")
	public static void method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class2_Sub3_Sub16 local11 = Static119.method2204(arg0, 1);
		local11.method2718();
		local11.anInt3327 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V")
	public static void method119(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 8) {
			arg1 = 4;
		}
		if (arg1 == 4 && !Static233.aBoolean407) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static186.anInt3937 != arg1) {
			if (Static68.aBoolean124) {
				return;
			}
			if (Static186.anInt3937 != 0) {
				Static44.anInterface2Array1[Static186.anInt3937].method4853();
			}
			if (arg1 != 0) {
				@Pc(76) Interface2 local76 = Static44.anInterface2Array1[arg1];
				local76.method4855();
				local76.method4852(arg0);
			}
			Static260.anInt5421 = arg0;
			Static186.anInt3937 = arg1;
		} else if (arg1 != 0 && arg0 != Static260.anInt5421) {
			Static44.anInterface2Array1[arg1].method4852(arg0);
			Static260.anInt5421 = arg0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()V")
	public static void method120() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static272.aClass2_Sub31ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static272.aClass2_Sub31ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static26.anInt552; local9++) {
					for (local14 = 0; local14 < Static232.anInt4787; local14++) {
						Static272.aClass2_Sub31ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static103.aClass2_Sub12ArrayArray2 = null;
		if (Static102.aClass2_Sub31ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static102.aClass2_Sub31ArrayArrayArray1.length; local3++) {
				for (local9 = 0; local9 < Static26.anInt552; local9++) {
					for (local14 = 0; local14 < Static232.anInt4787; local14++) {
						Static102.aClass2_Sub31ArrayArrayArray1[local3][local9][local14] = null;
					}
				}
			}
		}
		Static284.aClass2_Sub12ArrayArray3 = null;
		Static72.anInt1555 = 0;
		if (Static173.aClass58Array2 != null) {
			for (local3 = 0; local3 < Static72.anInt1555; local3++) {
				Static173.aClass58Array2[local3] = null;
			}
		}
		if (Static292.aClass34Array3 != null) {
			for (local3 = 0; local3 < Static288.anInt5982; local3++) {
				Static292.aClass34Array3[local3] = null;
			}
			Static288.anInt5982 = 0;
		}
		if (Static225.aClass34Array1 != null) {
			for (local3 = 0; local3 < Static225.aClass34Array1.length; local3++) {
				Static225.aClass34Array1[local3] = null;
			}
		}
	}
}
