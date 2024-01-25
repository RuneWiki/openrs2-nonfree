import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!tf", name = "Vb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!tf", name = "Fb", descriptor = "[Lclient!id;")
	public static final Class119[] aClass119Array2 = new Class119[14];

	@OriginalMember(owner = "client!tf", name = "Rb", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_115 = new Class15("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!fh;)Lclient!om;")
	public static Class51_Sub1 method5065(@OriginalArg(1) Class4_Sub9 arg0) {
		return new Class51_Sub1(arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5061(), arg0.method5008(), arg0.method5007());
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg5 < 1 || Static337.anInt5497 - 2 < arg1 || arg5 > Static282.anInt4644 - 2) {
			return;
		}
		@Pc(33) int local33 = arg2;
		if (arg2 < 3 && Static215.method4450(arg1, arg5)) {
			local33 = arg2 + 1;
		}
		if (!Static413.aClass49_Sub1_1.method2485(Static341.anInt5549) && !Static376.method4953(local33, arg1, Static163.anInt3008, arg5)) {
			return;
		}
		if (Static432.aClass75ArrayArrayArray6 == null) {
			return;
		}
		Static102.aClass26_Sub1_1.method1718(arg4, arg5, arg2, Static39.aClass135_1, Static409.aClass128Array1[arg2], arg1);
		if (arg6 < 0) {
			return;
		}
		@Pc(74) boolean local74 = Static413.aClass49_Sub1_1.aBoolean233;
		Static413.aClass49_Sub1_1.aBoolean233 = true;
		Static102.aClass26_Sub1_1.method1716(arg0, arg5, arg7, arg6, arg2, Static409.aClass128Array1[arg2], Static39.aClass135_1, local33, arg3, arg1);
		Static413.aClass49_Sub1_1.aBoolean233 = local74;
		return;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[B)[B")
	public static byte[] method5073(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static461.method1985(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
	public static void method5075() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static458.aClass75ArrayArrayArray5 != null) {
			for (local3 = 0; local3 < Static458.aClass75ArrayArrayArray5.length; local3++) {
				for (local6 = 0; local6 < Static81.anInt1606; local6++) {
					for (local9 = 0; local9 < Static18.anInt297; local9++) {
						if (Static458.aClass75ArrayArrayArray5[local3][local6][local9] != null) {
							Static458.aClass75ArrayArrayArray5[local3][local6][local9].method1511();
						}
						Static458.aClass75ArrayArrayArray5[local3][local6][local9] = null;
					}
				}
			}
		}
		Static458.aClass75ArrayArrayArray5 = null;
		Static228.aClass41Array2 = null;
		if (Static221.aClass75ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static221.aClass75ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static81.anInt1606; local6++) {
					for (local9 = 0; local9 < Static18.anInt297; local9++) {
						if (Static221.aClass75ArrayArrayArray3[local3][local6][local9] != null) {
							Static221.aClass75ArrayArrayArray3[local3][local6][local9].method1511();
						}
						Static221.aClass75ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static221.aClass75ArrayArrayArray3 = null;
		Static169.aClass41Array1 = null;
		Static432.aClass75ArrayArrayArray6 = null;
		Static278.aClass41Array3 = null;
		Static349.anInt5769 = 0;
		if (Static190.aClass145Array1 != null) {
			for (local3 = 0; local3 < Static349.anInt5769; local3++) {
				Static190.aClass145Array1[local3] = null;
			}
		}
		if (Static298.aClass8_Sub3Array3 != null) {
			for (local3 = 0; local3 < Static41.anInt669; local3++) {
				Static298.aClass8_Sub3Array3[local3] = null;
			}
			Static41.anInt669 = 0;
		}
		if (Static367.aClass154Array1 != null) {
			for (local3 = 0; local3 < Static440.anInt7325; local3++) {
				Static367.aClass154Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static320.anInt5205; local6++) {
				for (local9 = 0; local9 < Static81.anInt1606; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static18.anInt297; local160++) {
						Static81.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static440.anInt7325 = 0;
		}
		anIntArrayArrayArray8 = null;
		Static331.method4358();
		Static301.aClass248_6.method5581();
		Static436.aByteArrayArray19 = null;
		Static169.anIntArrayArray37 = null;
		Static240.aShortArrayArray4 = null;
		Static146.aClass28_1 = null;
		Static290.aClass35_2 = null;
		Static323.aClass135_12 = null;
	}
}
