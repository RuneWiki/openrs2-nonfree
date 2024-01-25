import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Lclient!kt;")
	public static Class141 aClass141_6;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_12 = new Class225(1, -1);

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_97 = new Class211(9, -2);

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_6 = new Class240("", 15);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
	public static void method3194() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static192.aClass270ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static192.aClass270ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static169.anInt2876; local6++) {
					for (local9 = 0; local9 < Static316.anInt5459; local9++) {
						if (Static192.aClass270ArrayArrayArray2[local3][local6][local9] != null) {
							Static192.aClass270ArrayArrayArray2[local3][local6][local9].method5699();
						}
						Static192.aClass270ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static192.aClass270ArrayArrayArray2 = null;
		Static314.aClass162Array2 = null;
		if (Static65.aClass270ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static65.aClass270ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static169.anInt2876; local6++) {
					for (local9 = 0; local9 < Static316.anInt5459; local9++) {
						if (Static65.aClass270ArrayArrayArray1[local3][local6][local9] != null) {
							Static65.aClass270ArrayArrayArray1[local3][local6][local9].method5699();
						}
						Static65.aClass270ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static65.aClass270ArrayArrayArray1 = null;
		Static109.aClass162Array1 = null;
		Static309.aClass270ArrayArrayArray3 = null;
		Static345.aClass162Array3 = null;
		Static10.anInt151 = 0;
		if (Static328.aClass22Array2 != null) {
			for (local3 = 0; local3 < Static10.anInt151; local3++) {
				Static328.aClass22Array2[local3] = null;
			}
		}
		if (Static117.aClass3_Sub4Array3 != null) {
			for (local3 = 0; local3 < Static289.anInt4758; local3++) {
				Static117.aClass3_Sub4Array3[local3] = null;
			}
			Static289.anInt4758 = 0;
		}
		if (Static210.aClass250Array1 != null) {
			for (local3 = 0; local3 < Static312.anInt5377; local3++) {
				Static210.aClass250Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static289.anInt4757; local6++) {
				for (local9 = 0; local9 < Static169.anInt2876; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static316.anInt5459; local160++) {
						Static174.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static312.anInt5377 = 0;
		}
		Static332.anIntArrayArrayArray12 = null;
		Static147.method2139();
		Static212.aClass93_3.method2073();
		Static94.aByteArrayArray60 = null;
		Static329.anIntArrayArray42 = null;
		Static116.aShortArrayArray2 = null;
		Static460.aClass45_4 = null;
		Static40.aClass31_1 = null;
		Static307.aClass163_7 = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!at;)Ljava/lang/String;")
	public static String method3195(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		if (!Static55.method815(arg1).method1536(arg0) && arg1.anObjectArray29 == null) {
			return null;
		} else if (arg1.aStringArray3 == null || arg1.aStringArray3.length <= arg0 || arg1.aStringArray3[arg0] == null || arg1.aStringArray3[arg0].trim().length() == 0) {
			return Static95.aBoolean158 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray3[arg0];
		}
	}
}
