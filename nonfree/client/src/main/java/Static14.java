import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aj", name = "sb", descriptor = "Lclient!wn;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
	public static int anInt397 = 0;

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method345(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(38) int local38 = arg0 / 10;
		while (local38 != 0) {
			local38 /= 10;
			local34++;
		}
		@Pc(66) char[] local66 = new char[local34];
		local66[0] = '+';
		for (@Pc(74) int local74 = local34 - 1; local74 > 0; local74--) {
			@Pc(78) int local78 = arg0;
			arg0 /= 10;
			@Pc(89) int local89 = local78 - arg0 * 10;
			if (local89 < 10) {
				local66[local74] = (char) (local89 + 48);
			} else {
				local66[local74] = (char) (local89 + 87);
			}
		}
		return new String(local66);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[B[[B[I[II[[BI)I")
	public static int method346(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg3[arg4];
		@Pc(16) int local16 = local9 + arg2[arg4];
		@Pc(20) int local20 = arg3[arg6];
		@Pc(27) int local27 = local20 + arg2[arg6];
		@Pc(29) int local29 = local9;
		if (local20 > local9) {
			local29 = local20;
		}
		@Pc(40) int local40 = local16;
		if (local16 > local27) {
			local40 = local27;
		}
		@Pc(60) int local60 = arg0[arg4] & 0xFF;
		if (local60 > (arg0[arg6] & 0xFF)) {
			local60 = arg0[arg6] & 0xFF;
		}
		@Pc(77) byte[] local77 = arg5[arg4];
		@Pc(81) byte[] local81 = arg1[arg6];
		@Pc(86) int local86 = local29 - local9;
		@Pc(91) int local91 = local29 - local20;
		for (@Pc(93) int local93 = local29; local93 < local40; local93++) {
			@Pc(106) int local106 = local77[local86++] + local81[local91++];
			if (local106 < local60) {
				local60 = local106;
			}
		}
		return -local60;
	}
}
