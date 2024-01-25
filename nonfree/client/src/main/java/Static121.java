import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!aha;")
	public static Class15_Sub1 aClass15_Sub1_2;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "Lclient!hu;")
	public static Class44 aClass44_6;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
	public static void method1818() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static138.aClass156ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static138.aClass156ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static129.anInt6336; local6++) {
					for (local9 = 0; local9 < Static150.anInt2400; local9++) {
						if (Static138.aClass156ArrayArrayArray1[local3][local6][local9] != null) {
							Static138.aClass156ArrayArrayArray1[local3][local6][local9].method3617();
						}
						Static138.aClass156ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static138.aClass156ArrayArrayArray1 = null;
		Static492.aClass40Array3 = null;
		if (Static573.aClass156ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static573.aClass156ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static129.anInt6336; local6++) {
					for (local9 = 0; local9 < Static150.anInt2400; local9++) {
						if (Static573.aClass156ArrayArrayArray3[local3][local6][local9] != null) {
							Static573.aClass156ArrayArrayArray3[local3][local6][local9].method3617();
						}
						Static573.aClass156ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static573.aClass156ArrayArrayArray3 = null;
		Static327.aClass40Array2 = null;
		Static535.aClass156ArrayArrayArray2 = null;
		Static299.aClass40Array1 = null;
		Static601.aBooleanArrayArray17 = null;
		Static192.aBooleanArrayArray15 = null;
		Static636.anIntArray827 = null;
		Static563.aBooleanArrayArrayArray2 = null;
		Static176.aBooleanArrayArrayArray1 = null;
		Static342.method5249();
		if (Static53.aClass14_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static594.anInt9723; local3++) {
				Static53.aClass14_Sub1_Sub1Array1[local3] = null;
			}
			Static594.anInt9723 = 0;
		}
		Static250.aClass14_Sub1Array2 = null;
		Static151.aClass14_Sub1Array1 = null;
		Static469.aClass14_Sub1Array5 = null;
		if (Static444.aClass14_Sub1Array4 != null) {
			for (local3 = 0; local3 < Static444.aClass14_Sub1Array4.length; local3++) {
				Static444.aClass14_Sub1Array4[local3] = null;
			}
			Static229.anInt3963 = 0;
		}
		if (Static294.aClass14_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static294.aClass14_Sub1Array3.length; local3++) {
				Static294.aClass14_Sub1Array3[local3] = null;
			}
			Static113.anInt1784 = 0;
		}
		if (Static580.aClass175Array12 != null) {
			for (local3 = 0; local3 < Static181.anInt3279; local3++) {
				Static580.aClass175Array12[local3] = null;
			}
			for (local6 = 0; local6 < Static36.anInt662; local6++) {
				for (local9 = 0; local9 < Static129.anInt6336; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static150.anInt2400; local195++) {
						Static484.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static181.anInt3279 = 0;
		}
		Static189.method3006();
		Static599.aClass43_3 = Static599.aClass43_2;
		Static599.aClass43_3.method869();
		Static423.aByteArrayArray17 = null;
		Static413.anIntArrayArray37 = null;
		Static402.aShortArrayArray19 = null;
		if (Static311.aClass301Array1 != null) {
			Static115.method1659();
			Static480.aClass126_12.method7007(1);
			Static480.aClass126_12.method7049(0);
		}
		if (Static589.aClass350Array3 != null) {
			Static589.aClass350Array3 = null;
		}
		Static480.aClass126_12 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZIII)V")
	public static void method1819(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 0) {
			Static451.method6704(false);
		} else {
			Static431.anInt773 = Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289();
			Static590.method8288(true, 0);
		}
		Static528.anInt8800 = arg3;
		Static601.anInt9877 = arg0;
		Static591.aBoolean778 = arg1;
		Static203.method163(arg2);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Z")
	public static boolean method1820(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
