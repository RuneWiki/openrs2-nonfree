import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!la;")
	public static Class196 aClass196_122;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "[I")
	public static final int[] anIntArray614 = new int[6];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([BIBI)[B")
	public static byte[] method8241(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static653.method6858(arg0, arg1, local11, 0, 32768);
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!dk;)[I")
	public static int[] method8243(@OriginalArg(1) Class3_Sub14 arg0) {
		@Pc(10) Class3_Sub3 local10 = new Class3_Sub3(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method4220(10);
		local10.method4265(local13[0]);
		local10.method4265(local13[1]);
		local10.method4265(local13[2]);
		local10.method4265(local13[3]);
		for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
			local10.method4265((int) (Math.random() * 9.9999999E7D));
		}
		local10.method4201((int) ((double) 99999999 * Math.random()));
		local10.method4234(Static16.aBigInteger6, Static56.aBigInteger2);
		arg0.aClass3_Sub3_Sub2_2.method4237(0, local10.aByteArray54, local10.anInt4736);
		return local13;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[F[IIII[II[FIII)V")
	public static void method8244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(15) int local15 = arg9 + arg10 * arg4;
		@Pc(22) int local22 = arg5 * arg1 + arg11;
		@Pc(27) int local27 = arg4 - arg7;
		@Pc(31) int local31 = arg5 - arg7;
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg6 == null) {
			for (local35 = 0; local35 < arg0; local35++) {
				local41 = local15 + arg7;
				while (local15 < local41) {
					arg8[local22++] = arg2[local15++];
				}
				local22 += local31;
				local15 += local27;
			}
		} else if (arg2 == null) {
			for (local35 = 0; local35 < arg0; local35++) {
				local41 = arg7 + local15;
				while (local41 > local15) {
					arg3[local22++] = arg6[local15++];
				}
				local15 += local27;
				local22 += local31;
			}
		} else {
			for (local35 = 0; local35 < arg0; local35++) {
				local41 = local15 + arg7;
				while (local41 > local15) {
					arg3[local22] = arg6[local15];
					arg8[local22++] = arg2[local15++];
				}
				local15 += local27;
				local22 += local31;
			}
		}
	}
}
