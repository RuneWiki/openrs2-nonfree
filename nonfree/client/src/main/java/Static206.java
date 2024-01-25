import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IC)Z")
	public static boolean method3206(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([BBI)[B")
	public static byte[] method3212(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static468.method4350(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "()V")
	public static void method3214() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static345.aClass11ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static345.aClass11ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static54.anInt998; local6++) {
					for (local9 = 0; local9 < Static24.anInt401; local9++) {
						if (Static345.aClass11ArrayArrayArray3[local3][local6][local9] != null) {
							Static345.aClass11ArrayArrayArray3[local3][local6][local9].method118();
						}
						Static345.aClass11ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static345.aClass11ArrayArrayArray3 = null;
		Static256.aClass154Array2 = null;
		if (Static36.aClass11ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static36.aClass11ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static54.anInt998; local6++) {
					for (local9 = 0; local9 < Static24.anInt401; local9++) {
						if (Static36.aClass11ArrayArrayArray1[local3][local6][local9] != null) {
							Static36.aClass11ArrayArrayArray1[local3][local6][local9].method118();
						}
						Static36.aClass11ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static36.aClass11ArrayArrayArray1 = null;
		Static173.aClass154Array1 = null;
		Static309.aClass11ArrayArrayArray2 = null;
		Static332.aClass154Array3 = null;
		Static447.anInt6547 = 0;
		if (Static82.aClass81Array2 != null) {
			for (local3 = 0; local3 < Static447.anInt6547; local3++) {
				Static82.aClass81Array2[local3] = null;
			}
		}
		if (Static400.aClass24_Sub3Array3 != null) {
			for (local3 = 0; local3 < Static270.anInt4750; local3++) {
				Static400.aClass24_Sub3Array3[local3] = null;
			}
			Static270.anInt4750 = 0;
		}
		if (Static25.aClass225Array1 != null) {
			for (local3 = 0; local3 < Static135.anInt6872; local3++) {
				Static25.aClass225Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static285.anInt5004; local6++) {
				for (local9 = 0; local9 < Static54.anInt998; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static24.anInt401; local160++) {
						Static226.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static135.anInt6872 = 0;
		}
		Static432.anIntArrayArrayArray8 = null;
		Static33.method5357();
		Static191.aClass240_2.method5232();
		Static120.aByteArrayArray20 = null;
		Static290.anIntArrayArray46 = null;
		Static452.aShortArrayArray4 = null;
		Static39.aClass8_1 = null;
		Static364.aClass34_5 = null;
		Static142.aClass50_5 = null;
	}
}
