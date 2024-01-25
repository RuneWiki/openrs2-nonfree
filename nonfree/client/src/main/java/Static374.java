import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!vs;")
	public static Class385 aClass385_6;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_112 = new Class322(73, 6);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BII)Z")
	public static boolean method5636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static669.method8875(arg1, arg0) || Static234.method4147(arg1, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[F[II[FBIII[IIII)V")
	public static void method5637(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg9 + arg0 * arg11;
		@Pc(17) int local17 = arg6 * arg5 + arg7;
		@Pc(21) int local21 = arg0 - arg3;
		@Pc(36) int local36 = arg6 - arg3;
		@Pc(44) int local44;
		@Pc(50) int local50;
		if (arg8 == null) {
			for (local44 = 0; local44 < arg10; local44++) {
				local50 = arg3 + local11;
				while (local11 < local50) {
					arg4[local17++] = arg1[local11++];
				}
				local11 += local21;
				local17 += local36;
			}
		} else if (arg1 == null) {
			for (local44 = 0; local44 < arg10; local44++) {
				local50 = arg3 + local11;
				while (local11 < local50) {
					arg2[local17++] = arg8[local11++];
				}
				local17 += local36;
				local11 += local21;
			}
		} else {
			for (local44 = 0; local44 < arg10; local44++) {
				local50 = arg3 + local11;
				while (local50 > local11) {
					arg2[local17] = arg8[local11];
					arg4[local17++] = arg1[local11++];
				}
				local17 += local36;
				local11 += local21;
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	public static void method5639(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 4);
		local9.method2038();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
	public static void method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static130.anIntArrayArray10 != null) {
			Static130.anIntArrayArray10[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static473.aShortArrayArray11 != null) {
			Static473.aShortArrayArray11[arg0][arg1] = (short) arg3;
		}
		if (Static273.aByteArrayArray84 != null) {
			Static273.aByteArrayArray84[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIB)Z")
	public static boolean method5641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static207.method3818(arg1, arg0) || Static584.method8153(arg0, arg1) || Static121.method2200(arg0, arg1);
	}
}
