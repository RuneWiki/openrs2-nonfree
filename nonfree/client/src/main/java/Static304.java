import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!rp", name = "pb", descriptor = "J")
	public static long aLong124;

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "[I")
	public static final int[] anIntArray359 = new int[13];

	@OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
	public static int anInt3133 = -1;

	@OriginalMember(owner = "client!rp", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray360 = new int[100];

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2737(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static400.method1877(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(II)I")
	public static int method2746(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = arg0 - 1;
		@Pc(17) int local17 = local11 | local11 >>> 1;
		@Pc(23) int local23 = local17 | local17 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIII)V")
	public static void method2754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg0; local3++) {
			Static349.method5265(arg2, arg4, arg1, Static325.anIntArrayArray50[local3]);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!qc;IIII)V")
	public static void method2774(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static278.method4351(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static44.anInt791) {
			Static278.method4351(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static278.method4351(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static103.anInt2050) {
			Static278.method4351(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static103.anInt2050) {
			Static278.method4351(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static44.anInt791 && arg4 <= Static103.anInt2050) {
			Static278.method4351(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static278.method4351(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static44.anInt791 && arg4 > 0) {
			Static278.method4351(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "(B)V")
	public static void method2789() {
		Static108.aClass110_6 = null;
		Static331.aClass110_16 = null;
		Static285.aClass110_14 = null;
		Static180.aClass110_8 = null;
		Static350.aClass110_18 = null;
		Static45.aClass110_1 = null;
		Static233.aClass110_9 = null;
		Static276.aClass110_13 = null;
	}
}
