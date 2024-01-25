import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!baa", name = "r", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!baa", name = "n", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_9 = new Class341(78, 4);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
	public static void method582(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7) {
		@Pc(9) Class309 local9 = Static470.aClass309Array3[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static470.aClass309Array3[local11] = Static470.aClass309Array3[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class309(arg1, arg7, arg0, arg6, arg4, arg2, arg5, arg3);
		} else {
			local9.method7899(arg0, arg2, arg5, arg6, arg7, arg1, arg3, arg4);
		}
		Static385.anInt7281 = Static397.anInt11030;
		Static470.aClass309Array3[0] = local9;
		Static287.anInt5258++;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
	public static void method583() {
		Static573.anInt10004 = 0;
		Static60.anInt1163 = 0;
		Static404.anInt7481 = 0;
		Static107.anInt1977 = 0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "()V")
	public static void method585() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static242.aClass291ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static242.aClass291ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static585.anInt10170; local6++) {
					for (local9 = 0; local9 < Static202.anInt4238; local9++) {
						if (Static242.aClass291ArrayArrayArray3[local3][local6][local9] != null) {
							Static242.aClass291ArrayArrayArray3[local3][local6][local9].method7528();
						}
						Static242.aClass291ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static242.aClass291ArrayArrayArray3 = null;
		Static549.aClass18Array30 = null;
		if (Static46.aClass291ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static46.aClass291ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static585.anInt10170; local6++) {
					for (local9 = 0; local9 < Static202.anInt4238; local9++) {
						if (Static46.aClass291ArrayArrayArray1[local3][local6][local9] != null) {
							Static46.aClass291ArrayArrayArray1[local3][local6][local9].method7528();
						}
						Static46.aClass291ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static46.aClass291ArrayArrayArray1 = null;
		Static93.aClass18Array33 = null;
		Static193.aClass291ArrayArrayArray2 = null;
		Static245.aClass18Array14 = null;
		Static423.aBooleanArrayArray8 = null;
		Static85.aBooleanArrayArray3 = null;
		Static101.anIntArray94 = null;
		Static151.aBooleanArrayArrayArray2 = null;
		Static135.aBooleanArrayArrayArray1 = null;
		Static148.method2555();
		if (Static212.aClass15_Sub3_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static533.anInt9353; local3++) {
				Static212.aClass15_Sub3_Sub3Array1[local3] = null;
			}
			Static533.anInt9353 = 0;
		}
		Static603.aClass15_Sub3Array5 = null;
		Static440.aClass15_Sub3Array4 = null;
		Static98.aClass15_Sub3Array2 = null;
		if (Static8.aClass15_Sub3Array1 != null) {
			for (local3 = 0; local3 < Static8.aClass15_Sub3Array1.length; local3++) {
				Static8.aClass15_Sub3Array1[local3] = null;
			}
			Static43.anInt8881 = 0;
		}
		if (Static425.aClass15_Sub3Array3 != null) {
			for (local3 = 0; local3 < Static425.aClass15_Sub3Array3.length; local3++) {
				Static425.aClass15_Sub3Array3[local3] = null;
			}
			Static644.anInt11134 = 0;
		}
		if (Static320.aClass84Array8 != null) {
			for (local3 = 0; local3 < Static262.anInt5002; local3++) {
				Static320.aClass84Array8[local3] = null;
			}
			for (local6 = 0; local6 < Static60.anInt1169; local6++) {
				for (local9 = 0; local9 < Static585.anInt10170; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static202.anInt4238; local195++) {
						Static163.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static262.anInt5002 = 0;
		}
		Static439.method7151();
		Static212.aClass217_1 = Static212.aClass217_2;
		Static212.aClass217_1.method5978();
		Static669.aByteArrayArray27 = null;
		Static503.anIntArrayArray38 = null;
		Static141.aShortArrayArray7 = null;
		if (Static549.aClass314Array1 != null) {
			Static10.method155();
			Static64.aClass101_1.method8088(1);
			Static64.aClass101_1.method8062(0);
		}
		if (Static647.aClass119Array1 != null) {
			Static647.aClass119Array1 = null;
		}
		Static64.aClass101_1 = null;
	}
}
