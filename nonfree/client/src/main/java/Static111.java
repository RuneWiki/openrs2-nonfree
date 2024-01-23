import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "Lclient!qg;")
	public static Class83 aClass83_2;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	public static int anInt2664;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Lclient!i;")
	public static Class41 aClass41_771 = Static184.method2923("Hidden)2use");

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
	public static int anInt2666 = 0;

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "Lclient!i;")
	public static Class41 aClass41_772 = Static184.method2923("Ablegen");

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!lf", name = "rb", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[50][];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILclient!nc;IJIIII)Z")
	public static boolean method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static98.method1686(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!nb;ILclient!nb;Lclient!nb;Lclient!nb;)V")
	public static void method1896(@OriginalArg(0) Class15 arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) Class15 arg2, @OriginalArg(4) Class15 arg3) {
		Static79.aClass15_19 = arg3;
		Static58.aClass15_13 = arg0;
		Static74.aClass15_18 = arg1;
		Static93.aClass15_20 = arg2;
		Static68.aClass80ArrayArray1 = new Class80[Static74.aClass15_18.method388()][];
		Static150.aBooleanArray18 = new boolean[Static74.aClass15_18.method388()];
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIILclient!nc;IJZ)Z")
	public static boolean method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static98.method1686(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIB)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static182.anInt4210; local3++) {
			if (arg3 < Static71.anIntArray175[local3] + Static118.anIntArray306[local3] && arg3 + arg1 > Static71.anIntArray175[local3] && arg2 < Static117.anIntArray303[local3] + Static70.anIntArray173[local3] && Static117.anIntArray303[local3] < arg0 + arg2) {
				Static199.aBooleanArray23[local3] = true;
			}
		}
	}
}
