import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!up;")
	public static Class240 aClass240_5;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Z")
	public static boolean aBoolean248 = false;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_97 = new Class92(60, -1);

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "S")
	public static short aShort93 = 320;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_102 = new Class184(102, -2);

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
	public static void method2521() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static9.aClass217ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static9.aClass217ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static177.anInt3621; local6++) {
					for (local9 = 0; local9 < Static57.anInt1411; local9++) {
						if (Static9.aClass217ArrayArrayArray1[local3][local6][local9] != null) {
							Static9.aClass217ArrayArrayArray1[local3][local6][local9].method5243();
						}
						Static9.aClass217ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static9.aClass217ArrayArrayArray1 = null;
		Static205.aClass64Array2 = null;
		if (Static93.aClass217ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static93.aClass217ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static177.anInt3621; local6++) {
					for (local9 = 0; local9 < Static57.anInt1411; local9++) {
						if (Static93.aClass217ArrayArrayArray2[local3][local6][local9] != null) {
							Static93.aClass217ArrayArrayArray2[local3][local6][local9].method5243();
						}
						Static93.aClass217ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static93.aClass217ArrayArrayArray2 = null;
		Static401.aClass64Array3 = null;
		Static151.aClass217ArrayArrayArray3 = null;
		Static120.aClass64Array1 = null;
		Static396.anInt6816 = 0;
		if (Static35.aClass70Array3 != null) {
			for (local3 = 0; local3 < Static396.anInt6816; local3++) {
				Static35.aClass70Array3[local3] = null;
			}
		}
		if (Static36.aClass1_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static389.anInt6739; local3++) {
				Static36.aClass1_Sub3Array1[local3] = null;
			}
			Static389.anInt6739 = 0;
		}
		if (Static303.aClass54Array1 != null) {
			for (local3 = 0; local3 < Static298.anInt5454; local3++) {
				Static303.aClass54Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static281.anInt5169; local6++) {
				for (local9 = 0; local9 < Static177.anInt3621; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static57.anInt1411; local160++) {
						Static341.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static298.anInt5454 = 0;
		}
		Static92.anIntArrayArrayArray9 = null;
		Static294.method4290();
		Static201.aClass40_4.method1194();
		Static44.aByteArrayArray21 = null;
		Static336.anIntArrayArray50 = null;
		Static215.aByteArrayArray13 = null;
		Static137.aClass6_1 = null;
		Static275.aClass106_3 = null;
		Static355.aClass75_10 = null;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Lclient!ef;")
	public static Class3_Sub3_Sub7 method2522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = (Class3_Sub3_Sub7) Static132.aClass127_13.method3246((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class3_Sub3_Sub7(arg0, arg1);
			Static132.aClass127_13.method3257(local15.aLong227, local15);
		}
		return local15;
	}
}
