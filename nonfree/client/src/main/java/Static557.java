import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!ts", name = "Y", descriptor = "Lclient!qc;")
	public static final Class272 aClass272_6 = new Class272();

	@OriginalMember(owner = "client!ts", name = "ob", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_167 = new Class73(24, 6);

	@OriginalMember(owner = "client!ts", name = "pb", descriptor = "[I")
	public static final int[] anIntArray506 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(Z)V")
	public static void method7834() {
		if (Static282.aClass114_2 != null) {
			Static282.aClass114_2.method4229();
		}
		if (Static57.aClass114_1 != null) {
			Static57.aClass114_1.method4229();
		}
	}

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "(I)I")
	public static int method7835() {
		@Pc(22) byte local22;
		if (Static510.anInt8806 >= 96) {
			@Pc(11) int local11 = Static420.method6590();
			if (local11 <= 100) {
				Static290.method4995();
				local22 = 4;
			} else if (local11 <= 500) {
				local22 = 3;
				Static624.method8538();
			} else if (local11 > 1000) {
				Static367.method7654();
				local22 = 1;
			} else {
				local22 = 2;
				Static502.method6026();
			}
		} else {
			local22 = 1;
			Static367.method7654();
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != 0) {
			Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
			Static237.method4302(0, false);
		}
		Static541.method7640();
		return local22;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIII[FI[III[FII)V")
	public static void method7836(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) int arg11) {
		@Pc(15) int local15 = arg2 * arg0 + arg3;
		@Pc(21) int local21 = arg9 + arg11 * arg6;
		@Pc(26) int local26 = arg0 - arg4;
		@Pc(31) int local31 = arg11 - arg4;
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 == null) {
			for (local35 = 0; local35 < arg8; local35++) {
				local41 = local15 + arg4;
				while (local41 > local15) {
					arg5[local21++] = arg10[local15++];
				}
				local15 += local26;
				local21 += local31;
			}
		} else if (arg10 == null) {
			for (local35 = 0; local35 < arg8; local35++) {
				local41 = local15 + arg4;
				while (local15 < local41) {
					arg7[local21++] = arg1[local15++];
				}
				local21 += local31;
				local15 += local26;
			}
		} else {
			for (local35 = 0; local35 < arg8; local35++) {
				local41 = local15 + arg4;
				while (local15 < local41) {
					arg7[local21] = arg1[local15];
					arg5[local21++] = arg10[local15++];
				}
				local21 += local31;
				local15 += local26;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBI)B")
	public static byte method7838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
