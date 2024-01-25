import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public static int anInt39;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt41;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!hv;")
	public static final Class107 aClass107_2 = new Class107();

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_2 = new Class177();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZILclient!za;IILclient!la;)V")
	public static void method33(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class23 arg5) {
		if (arg0) {
			Static306.aClass49_11.method5785((Static178.anInt5792 - Static306.aClass49_11.RA()) / 2, (Static102.anInt1723 - Static306.aClass49_11.Q()) / 2);
			Static66.aClass49_6.method5785((Static178.anInt5792 - Static66.aClass49_6.RA()) / 2, 18);
		}
		@Pc(35) String local35 = "";
		if (Static60.aClass197_1 == Static217.aClass197_2) {
			local35 = Static163.aClass198_50.method4012(Static38.anInt4834);
		} else if (Static217.aClass197_2 == Static369.aClass197_4) {
			local35 = Static418.aClass198_114.method4012(Static38.anInt4834);
		}
		arg5.method5739(Static178.anInt5792 / 2, local35, Static102.anInt1723 / 2 - 26, arg1, -1);
		@Pc(73) int local73 = Static102.anInt1723 / 2 - 18;
		arg2.method5814(Static178.anInt5792 / 2 - 152, local73, 304, 34, arg3, 0);
		arg2.method5814(Static178.anInt5792 / 2 - 151, local73 + 1, 302, 32, 0, 0);
		arg2.P(Static178.anInt5792 / 2 - 150, local73 - -2, Static422.anInt7074 * 3, 30, arg4, 0);
		arg2.P(Static422.anInt7074 * 3 + Static178.anInt5792 / 2 - 150, local73 + 2, 300 - Static422.anInt7074 * 3, 30, 0, 0);
		arg5.method5739(Static178.anInt5792 / 2, Static94.aString12, Static102.anInt1723 / 2 + 4, arg1, -1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	public static void method34() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static107.aClass258ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static107.aClass258ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static439.anInt7318; local6++) {
					for (local9 = 0; local9 < Static459.anInt4775; local9++) {
						if (Static107.aClass258ArrayArrayArray2[local3][local6][local9] != null) {
							Static107.aClass258ArrayArrayArray2[local3][local6][local9].method5803();
						}
						Static107.aClass258ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static107.aClass258ArrayArrayArray2 = null;
		Static110.aClass125Array1 = null;
		if (Static102.aClass258ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static102.aClass258ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static439.anInt7318; local6++) {
					for (local9 = 0; local9 < Static459.anInt4775; local9++) {
						if (Static102.aClass258ArrayArrayArray1[local3][local6][local9] != null) {
							Static102.aClass258ArrayArrayArray1[local3][local6][local9].method5803();
						}
						Static102.aClass258ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static102.aClass258ArrayArrayArray1 = null;
		Static408.aClass125Array2 = null;
		Static319.aClass258ArrayArrayArray3 = null;
		Static410.aClass125Array3 = null;
		Static188.anInt3158 = 0;
		if (Static243.aClass247Array1 != null) {
			for (local3 = 0; local3 < Static188.anInt3158; local3++) {
				Static243.aClass247Array1[local3] = null;
			}
		}
		if (Static430.aClass2_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static371.anInt6082; local3++) {
				Static430.aClass2_Sub1Array3[local3] = null;
			}
			Static371.anInt6082 = 0;
		}
		if (Static68.aClass111Array1 != null) {
			for (local3 = 0; local3 < Static70.anInt1276; local3++) {
				Static68.aClass111Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static96.anInt1667; local6++) {
				for (local9 = 0; local9 < Static439.anInt7318; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static459.anInt4775; local160++) {
						Static76.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static70.anInt1276 = 0;
		}
		Static239.anIntArrayArrayArray15 = null;
		Static127.method1778();
		Static322.aClass107_10.method2329();
		Static145.aByteArrayArray5 = null;
		Static419.anIntArrayArray62 = null;
		Static130.aShortArrayArray6 = null;
		Static449.aClass77_1 = null;
		Static36.aClass29_1 = null;
		Static293.aClass200_5 = null;
	}
}
