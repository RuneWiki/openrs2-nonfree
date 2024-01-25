import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()V")
	public static void method6676() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static368.aClass360ArrayArrayArray18 != null) {
			for (local3 = 0; local3 < Static368.aClass360ArrayArrayArray18.length; local3++) {
				for (local6 = 0; local6 < Static327.anInt5993; local6++) {
					for (local9 = 0; local9 < Static191.anInt3757; local9++) {
						if (Static368.aClass360ArrayArrayArray18[local3][local6][local9] != null) {
							Static368.aClass360ArrayArrayArray18[local3][local6][local9].method7790();
						}
						Static368.aClass360ArrayArrayArray18[local3][local6][local9] = null;
					}
				}
			}
		}
		Static368.aClass360ArrayArrayArray18 = null;
		Static36.aClass129Array7 = null;
		if (Static156.aClass360ArrayArrayArray8 != null) {
			for (local3 = 0; local3 < Static156.aClass360ArrayArrayArray8.length; local3++) {
				for (local6 = 0; local6 < Static327.anInt5993; local6++) {
					for (local9 = 0; local9 < Static191.anInt3757; local9++) {
						if (Static156.aClass360ArrayArrayArray8[local3][local6][local9] != null) {
							Static156.aClass360ArrayArrayArray8[local3][local6][local9].method7790();
						}
						Static156.aClass360ArrayArrayArray8[local3][local6][local9] = null;
					}
				}
			}
		}
		Static156.aClass360ArrayArrayArray8 = null;
		Static150.aClass129Array4 = null;
		Static568.aClass360ArrayArrayArray22 = null;
		Static310.aClass129Array5 = null;
		Static496.aBooleanArrayArray7 = null;
		Static321.aBooleanArrayArray5 = null;
		Static288.aBooleanArrayArrayArray4 = null;
		Static36.aBooleanArrayArrayArray6 = null;
		Static275.method4010();
		if (Static299.aClass11_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static435.anInt7764; local3++) {
				Static299.aClass11_Sub1_Sub1Array1[local3] = null;
			}
			Static435.anInt7764 = 0;
		}
		if (Static319.aClass11_Sub1ArrayArray3 != null) {
			for (local3 = 0; local3 < Static420.anIntArray440[0]; local3++) {
				Static319.aClass11_Sub1ArrayArray3[0][local3] = null;
			}
			for (local6 = 0; local6 < Static420.anIntArray440[1]; local6++) {
				Static319.aClass11_Sub1ArrayArray3[1][local6] = null;
			}
			Static420.anIntArray440 = new int[2];
		}
		if (Static267.aClass11_Sub1ArrayArray2 != null) {
			for (local3 = 0; local3 < Static512.anIntArray540[0]; local3++) {
				Static267.aClass11_Sub1ArrayArray2[0][local3] = null;
			}
			for (local6 = 0; local6 < Static512.anIntArray540[1]; local6++) {
				Static267.aClass11_Sub1ArrayArray2[1][local6] = null;
			}
			Static512.anIntArray540 = new int[2];
		}
		if (Static176.aClass11_Sub1ArrayArray1 != null) {
			for (local3 = 0; local3 < Static275.anIntArray276[0]; local3++) {
				Static176.aClass11_Sub1ArrayArray1[0][local3] = null;
			}
			for (local6 = 0; local6 < Static275.anIntArray276[1]; local6++) {
				Static176.aClass11_Sub1ArrayArray1[1][local6] = null;
			}
			Static275.anIntArray276 = new int[2];
		}
		if (Static458.aClass11_Sub1Array141 != null) {
			for (local3 = 0; local3 < Static458.aClass11_Sub1Array141.length; local3++) {
				Static458.aClass11_Sub1Array141[local3] = null;
			}
			Static300.anInt9562 = 0;
		}
		if (Static21.aClass11_Sub1Array11 != null) {
			for (local3 = 0; local3 < Static21.aClass11_Sub1Array11.length; local3++) {
				Static21.aClass11_Sub1Array11[local3] = null;
			}
			Static443.anInt7826 = 0;
		}
		if (Static31.aClass49Array1 != null) {
			for (local3 = 0; local3 < Static356.anInt6520; local3++) {
				Static31.aClass49Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static119.anInt2474; local6++) {
				for (local9 = 0; local9 < Static327.anInt5993; local9++) {
					for (@Pc(292) int local292 = 0; local292 < Static191.anInt3757; local292++) {
						Static121.aLongArrayArrayArray1[local6][local9][local292] = 0L;
					}
				}
			}
			Static356.anInt6520 = 0;
		}
		Static61.method1009();
		Static572.aClass196_9.method4031();
		Static411.aByteArrayArray22 = null;
		Static351.anIntArrayArray33 = null;
		Static131.aShortArrayArray1 = null;
		if (Static511.aClass80Array1 != null) {
			Static375.method5456();
			Static458.aClass78_153.method6793(1);
			Static458.aClass78_153.method6849(0);
		}
		if (Static198.aClass187Array1 != null) {
			Static198.aClass187Array1 = null;
		}
		Static458.aClass78_153 = null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([FII)[F")
	public static float[] method6677(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static598.method776(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
