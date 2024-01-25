import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
	public static int anInt4331;

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
	public static int anInt4328 = 0;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BIIII)V")
	public static void method3781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		Static583.method7816(Static158.anIntArrayArray66[arg2], arg3, arg0 - arg1, arg1 + arg0);
		@Pc(32) int local32 = -1;
		while (local9 > local7) {
			local32 += 2;
			local12 += local32;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(58) int[] local58 = Static158.anIntArrayArray66[arg2 + local9];
				@Pc(64) int[] local64 = Static158.anIntArrayArray66[arg2 - local9];
				@Pc(68) int local68 = local7 + arg0;
				@Pc(73) int local73 = arg0 - local7;
				Static583.method7816(local58, arg3, local73, local68);
				Static583.method7816(local64, arg3, local73, local68);
			}
			@Pc(89) int local89 = arg0 + local9;
			@Pc(94) int local94 = arg0 - local9;
			@Pc(100) int[] local100 = Static158.anIntArrayArray66[local7 + arg2];
			@Pc(107) int[] local107 = Static158.anIntArrayArray66[arg2 - local7];
			Static583.method7816(local100, arg3, local94, local89);
			Static583.method7816(local107, arg3, local94, local89);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "()V")
	public static void method3782() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static17.aClass299ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static17.aClass299ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static155.anInt3254; local6++) {
					for (local9 = 0; local9 < Static39.anInt747; local9++) {
						if (Static17.aClass299ArrayArrayArray1[local3][local6][local9] != null) {
							Static17.aClass299ArrayArrayArray1[local3][local6][local9].method6506();
						}
						Static17.aClass299ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static17.aClass299ArrayArrayArray1 = null;
		Static108.aClass34Array6 = null;
		if (Static250.aClass299ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static250.aClass299ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static155.anInt3254; local6++) {
					for (local9 = 0; local9 < Static39.anInt747; local9++) {
						if (Static250.aClass299ArrayArrayArray2[local3][local6][local9] != null) {
							Static250.aClass299ArrayArrayArray2[local3][local6][local9].method6506();
						}
						Static250.aClass299ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static250.aClass299ArrayArrayArray2 = null;
		Static426.aClass34Array5 = null;
		Static309.aClass299ArrayArrayArray3 = null;
		Static68.aClass34Array1 = null;
		Static562.aBooleanArrayArray7 = null;
		Static387.aBooleanArrayArray2 = null;
		Static128.aBooleanArrayArrayArray1 = null;
		Static414.aBooleanArrayArrayArray2 = null;
		Static30.method496();
		if (Static294.aClass41_Sub2_Sub1Array7 != null) {
			for (local3 = 0; local3 < Static460.anInt6105; local3++) {
				Static294.aClass41_Sub2_Sub1Array7[local3] = null;
			}
			Static460.anInt6105 = 0;
		}
		if (Static417.aClass41_Sub2ArrayArray1 != null) {
			for (local3 = 0; local3 < Static279.anIntArray622[0]; local3++) {
				Static417.aClass41_Sub2ArrayArray1[0][local3] = null;
			}
			for (local6 = 0; local6 < Static279.anIntArray622[1]; local6++) {
				Static417.aClass41_Sub2ArrayArray1[1][local6] = null;
			}
			Static279.anIntArray622 = new int[2];
		}
		if (Static548.aClass41_Sub2ArrayArray3 != null) {
			for (local3 = 0; local3 < Static462.anIntArray496[0]; local3++) {
				Static548.aClass41_Sub2ArrayArray3[0][local3] = null;
			}
			for (local6 = 0; local6 < Static462.anIntArray496[1]; local6++) {
				Static548.aClass41_Sub2ArrayArray3[1][local6] = null;
			}
			Static462.anIntArray496 = new int[2];
		}
		if (Static533.aClass41_Sub2ArrayArray2 != null) {
			for (local3 = 0; local3 < Static505.anIntArray524[0]; local3++) {
				Static533.aClass41_Sub2ArrayArray2[0][local3] = null;
			}
			for (local6 = 0; local6 < Static505.anIntArray524[1]; local6++) {
				Static533.aClass41_Sub2ArrayArray2[1][local6] = null;
			}
			Static505.anIntArray524 = new int[2];
		}
		if (Static516.aClass41_Sub2Array2 != null) {
			for (local3 = 0; local3 < Static516.aClass41_Sub2Array2.length; local3++) {
				Static516.aClass41_Sub2Array2[local3] = null;
			}
			Static90.anInt1894 = 0;
		}
		if (Static390.aClass41_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static390.aClass41_Sub2Array1.length; local3++) {
				Static390.aClass41_Sub2Array1[local3] = null;
			}
			Static122.anInt2802 = 0;
		}
		if (Static169.aClass129Array1 != null) {
			for (local3 = 0; local3 < Static497.anInt8087; local3++) {
				Static169.aClass129Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static459.anInt7698; local6++) {
				for (local9 = 0; local9 < Static155.anInt3254; local9++) {
					for (@Pc(292) int local292 = 0; local292 < Static39.anInt747; local292++) {
						Static473.aLongArrayArrayArray1[local6][local9][local292] = 0L;
					}
				}
			}
			Static497.anInt8087 = 0;
		}
		Static437.method6114();
		Static212.aClass178_7.method4162();
		Static315.aByteArrayArray14 = null;
		Static15.anIntArrayArray6 = null;
		Static450.aShortArrayArray31 = null;
		if (Static174.aClass136Array1 != null) {
			Static79.method5516();
			Static511.aClass45_12.method7411(1);
			Static511.aClass45_12.method7416(0);
		}
		if (Static12.aClass187Array2 != null) {
			Static12.aClass187Array2 = null;
		}
		Static511.aClass45_12 = null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!kca;)Z")
	public static boolean method3783(@OriginalArg(1) Class174 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean349) {
			return false;
		} else if (!arg0.method4116(Static44.anInterface9_2)) {
			return false;
		} else if (Static160.aClass354_12.method7689((long) arg0.anInt4756) == null) {
			return Static522.aClass354_40.method7689((long) arg0.anInt4760) == null;
		} else {
			return false;
		}
	}
}
