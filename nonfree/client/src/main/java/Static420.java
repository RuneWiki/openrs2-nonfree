import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
	public static int anInt7569;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "Lclient!ne;")
	public static final Class240 aClass240_5 = new Class240("LIVE", "", "", 0);

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "()V")
	public static void method6222() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static33.aClass58ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static33.aClass58ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static28.anInt704; local6++) {
					for (local9 = 0; local9 < Static55.anInt1384; local9++) {
						if (Static33.aClass58ArrayArrayArray1[local3][local6][local9] != null) {
							Static33.aClass58ArrayArrayArray1[local3][local6][local9].method1425();
						}
						Static33.aClass58ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static33.aClass58ArrayArrayArray1 = null;
		Static343.aClass51Array1 = null;
		if (Static646.aClass58ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static646.aClass58ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static28.anInt704; local6++) {
					for (local9 = 0; local9 < Static55.anInt1384; local9++) {
						if (Static646.aClass58ArrayArrayArray3[local3][local6][local9] != null) {
							Static646.aClass58ArrayArrayArray3[local3][local6][local9].method1425();
						}
						Static646.aClass58ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static646.aClass58ArrayArrayArray3 = null;
		Static473.aClass51Array2 = null;
		Static486.aClass58ArrayArrayArray2 = null;
		Static576.aClass51Array3 = null;
		Static255.aBooleanArrayArray2 = null;
		Static519.aBooleanArrayArray5 = null;
		Static465.anIntArray621 = null;
		Static256.aBooleanArrayArrayArray2 = null;
		Static51.aBooleanArrayArrayArray1 = null;
		Static186.method9079();
		if (Static217.aClass12_Sub2_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static585.anInt10026; local3++) {
				Static217.aClass12_Sub2_Sub2Array1[local3] = null;
			}
			Static585.anInt10026 = 0;
		}
		Static447.aClass12_Sub2Array8 = null;
		Static154.aClass12_Sub2Array1 = null;
		Static177.aClass12_Sub2Array2 = null;
		if (Static530.aClass12_Sub2Array6 != null) {
			for (local3 = 0; local3 < Static530.aClass12_Sub2Array6.length; local3++) {
				Static530.aClass12_Sub2Array6[local3] = null;
			}
			Static288.anInt8152 = 0;
		}
		if (Static601.aClass12_Sub2Array7 != null) {
			for (local3 = 0; local3 < Static601.aClass12_Sub2Array7.length; local3++) {
				Static601.aClass12_Sub2Array7[local3] = null;
			}
			Static415.anInt7536 = 0;
		}
		if (Static260.aClass328Array1 != null) {
			for (local3 = 0; local3 < Static253.anInt4485; local3++) {
				Static260.aClass328Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static613.anInt10338; local6++) {
				for (local9 = 0; local9 < Static28.anInt704; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static55.anInt1384; local195++) {
						Static295.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static253.anInt4485 = 0;
		}
		Static13.method130();
		Static326.aClass23_1 = Static326.aClass23_2;
		Static326.aClass23_1.method479();
		Static553.aByteArrayArray46 = null;
		Static676.anIntArrayArray62 = null;
		Static75.aShortArrayArray4 = null;
		if (Static113.aClass109Array1 != null) {
			Static305.method4467();
			Static533.aClass137_41.method7913(1);
			Static533.aClass137_41.method7926(0);
		}
		if (Static400.aClass134Array1 != null) {
			Static400.aClass134Array1 = null;
		}
		Static533.aClass137_41 = null;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)V")
	public static void method6223(@OriginalArg(1) int arg0) {
		Static368.anInt6814 = arg0;
		Static597.aClass264_59.method6360();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILclient!vn;I)V")
	public static void method6224(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub2_Sub2_Sub1 arg1) {
		if (arg1.anIntArray234 == null) {
			return;
		}
		@Pc(14) int local14 = arg1.anIntArray234[arg0 + 1];
		if (arg1.anInt2921 == local14) {
			return;
		}
		arg1.anInt2920 = 0;
		arg1.anInt2921 = local14;
		arg1.anInt2902 = 0;
		arg1.anInt2966 = arg1.anInt2964;
		arg1.anInt2898 = 0;
		arg1.anInt2958 = 1;
		if (arg1.anInt2921 != -1) {
			Static51.method1064(arg1, Static501.aClass191_2.method4322(arg1.anInt2921), arg1.anInt2902);
		}
	}
}
