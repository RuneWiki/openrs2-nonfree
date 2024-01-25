import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
	public static void method4732() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static338.aClass162ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static338.aClass162ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static230.anInt4581; local6++) {
					for (local9 = 0; local9 < Static268.anInt5106; local9++) {
						if (Static338.aClass162ArrayArrayArray3[local3][local6][local9] != null) {
							Static338.aClass162ArrayArrayArray3[local3][local6][local9].method4082();
						}
						Static338.aClass162ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static338.aClass162ArrayArrayArray3 = null;
		Static267.aClass14Array2 = null;
		if (Static146.aClass162ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static146.aClass162ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static230.anInt4581; local6++) {
					for (local9 = 0; local9 < Static268.anInt5106; local9++) {
						if (Static146.aClass162ArrayArrayArray1[local3][local6][local9] != null) {
							Static146.aClass162ArrayArrayArray1[local3][local6][local9].method4082();
						}
						Static146.aClass162ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static146.aClass162ArrayArrayArray1 = null;
		Static77.aClass14Array1 = null;
		Static294.aClass162ArrayArrayArray2 = null;
		Static389.aClass14Array3 = null;
		Static20.anInt7227 = 0;
		if (Static114.aClass113Array1 != null) {
			for (local3 = 0; local3 < Static20.anInt7227; local3++) {
				Static114.aClass113Array1[local3] = null;
			}
		}
		if (Static95.aClass11_Sub5Array1 != null) {
			for (local3 = 0; local3 < Static132.anInt2706; local3++) {
				Static95.aClass11_Sub5Array1[local3] = null;
			}
			Static132.anInt2706 = 0;
		}
		if (client.lb != null) {
			for (local3 = 0; local3 < Static398.anInt7036; local3++) {
				client.lb[local3] = null;
			}
			for (local6 = 0; local6 < Static227.anInt4511; local6++) {
				for (local9 = 0; local9 < Static230.anInt4581; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static268.anInt5106; local160++) {
						Static170.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static398.anInt7036 = 0;
		}
		Static381.anIntArrayArrayArray11 = null;
		Static178.method3294();
		Static224.aClass273_1.method6243();
		Static410.aByteArrayArray20 = null;
		Static383.anIntArrayArray47 = null;
		Static231.aShortArrayArray6 = null;
		Static180.aClass32_1 = null;
		Static253.aClass72_4 = null;
		Static367.aClass30_20 = null;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)I")
	public static int method4733(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0x33333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
