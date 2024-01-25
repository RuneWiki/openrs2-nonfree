import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "Lclient!ef;")
	public static Class53 aClass53_4;

	@OriginalMember(owner = "client!ns", name = "B", descriptor = "Lclient!vj;")
	public static Class58 aClass58_46;

	@OriginalMember(owner = "client!ns", name = "D", descriptor = "[Lclient!nn;")
	public static Class144[] aClass144Array2;

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
	public static int anInt6565 = 100;

	@OriginalMember(owner = "client!ns", name = "E", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_358 = new Class159("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ns", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray181 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(IIII)V")
	public static void method5508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class8_Sub2 local13 = local7.aClass8_Sub2_1;
		@Pc(16) Class8_Sub2 local16 = local7.aClass8_Sub2_2;
		if (local13 != null) {
			local13.anInt5893 = local13.anInt5893 * arg3 / 16;
			local13.anInt5894 = local13.anInt5894 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5893 = local16.anInt5893 * arg3 / 16;
			local16.anInt5894 = local16.anInt5894 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIILclient!bb;ILclient!br;Lclient!sg;ILjava/lang/String;IILclient!ug;)V")
	public static void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(5) Class21 arg4, @OriginalArg(6) Class118 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class51 arg10) {
		@Pc(15) int local15;
		if (Static353.anInt2640 == 4) {
			local15 = (int) Static106.aFloat31 & 0x3FFF;
		} else {
			local15 = Static75.anInt1928 + (int) Static106.aFloat31 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg4.anInt740 / 2, arg4.anInt758 / 2) + 10;
		@Pc(42) int local42 = arg2 * arg2 + arg1 * arg1;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(52) int local52 = Class118_Sub1.anIntArray314[local15];
		@Pc(56) int local56 = Class118_Sub1.anIntArray317[local15];
		if (Static353.anInt2640 != 4) {
			local52 = local52 * 256 / (Static255.anInt5169 + 256);
			local56 = local56 * 256 / (Static255.anInt5169 + 256);
		}
		@Pc(85) int local85 = local52 * arg2 + arg1 * local56 >> 15;
		@Pc(95) int local95 = local56 * arg2 - local52 * arg1 >> 15;
		@Pc(104) int local104 = arg3.method326(arg7, null, 100);
		@Pc(110) int local110 = local85 - local104 / 2;
		@Pc(118) int local118 = arg3.method325(arg7, null);
		if (local110 >= -arg4.anInt740 && arg4.anInt740 >= local110 && local95 >= -arg4.anInt758 && arg4.anInt758 >= local95) {
			arg10.method4244(0, 1, arg0, arg7, 0, local110 + arg6 + arg4.anInt740 / 2, 50, arg5, arg9 + arg4.anInt758 / 2 - arg8 - local95 - local118, 0, arg6, null, arg9, local104, null);
		}
	}
}
