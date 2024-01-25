import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	public static int anInt6939;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "[I")
	public static int[] anIntArray627;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "[I")
	public static int[] anIntArray628;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "[I")
	public static int[] anIntArray629;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "[I")
	public static int[] anIntArray630;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
	public static void method5703() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static18.aClass80ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static18.aClass80ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static132.anInt2639; local6++) {
					for (local9 = 0; local9 < Static87.anInt1875; local9++) {
						if (Static18.aClass80ArrayArrayArray2[local3][local6][local9] != null) {
							Static18.aClass80ArrayArrayArray2[local3][local6][local9].method2142();
						}
						Static18.aClass80ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static18.aClass80ArrayArrayArray2 = null;
		Static269.aClass149Array2 = null;
		if (Static346.aClass80ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static346.aClass80ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static132.anInt2639; local6++) {
					for (local9 = 0; local9 < Static87.anInt1875; local9++) {
						if (Static346.aClass80ArrayArrayArray3[local3][local6][local9] != null) {
							Static346.aClass80ArrayArrayArray3[local3][local6][local9].method2142();
						}
						Static346.aClass80ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static346.aClass80ArrayArrayArray3 = null;
		Static277.aClass149Array3 = null;
		client.lb = null;
		Static105.aClass149Array1 = null;
		Static397.anInt6372 = 0;
		if (Static85.aClass128Array1 != null) {
			for (local3 = 0; local3 < Static397.anInt6372; local3++) {
				Static85.aClass128Array1[local3] = null;
			}
		}
		if (Static429.aClass31_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static4.anInt121; local3++) {
				Static429.aClass31_Sub2Array3[local3] = null;
			}
			Static4.anInt121 = 0;
		}
		if (Static124.aClass243Array5 != null) {
			for (local3 = 0; local3 < Static54.anInt1001; local3++) {
				Static124.aClass243Array5[local3] = null;
			}
			for (local6 = 0; local6 < Static68.anInt1553; local6++) {
				for (local9 = 0; local9 < Static132.anInt2639; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static87.anInt1875; local160++) {
						Static61.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static54.anInt1001 = 0;
		}
		Static254.anIntArrayArrayArray13 = null;
		Static118.method2145();
		Static36.aClass141_2.method3358();
		Static443.aByteArrayArray21 = null;
		Static222.anIntArrayArray41 = null;
		Static34.aShortArrayArray1 = null;
		Static135.aClass6_1 = null;
		Static227.aClass33_3 = null;
		Static242.aClass39_7 = null;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
	public static void method5704() {
		if (Static342.anInt5771 == 2) {
			Static193.method2987(3);
		} else if (Static342.anInt5771 == 6) {
			Static193.method2987(7);
		} else if (Static342.anInt5771 == 9) {
			Static193.method2987(10);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(FFIF)F")
	public static float method5705(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + (arg0 - arg1) * arg2;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIZIFII)[[I")
	public static int[][] method5706(@OriginalArg(6) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class1_Sub4_Sub27 local11 = new Class1_Sub4_Sub27();
		local11.anInt5249 = 3;
		local11.anInt5256 = 8;
		local11.aBoolean378 = false;
		local11.anInt5251 = 4;
		local11.anInt5258 = (int) (arg0 * 4096.0F);
		local11.method5950();
		Static179.method2848(64, 256);
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			local11.method4355(local43, local7[local43]);
		}
		return local7;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
	public static void method5707() {
		if (Static282.anInt4930 == 2) {
			Static79.anInt1766 = 96;
			return;
		}
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Long local31 = (Long) local21.invoke(local25, (Object[]) null);
					Static79.anInt1766 = (int) (local31 / 1048576L) + 1;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}
}
