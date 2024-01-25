import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII[BII[BI)V")
	public static void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg4++;
				arg6[local28] = (byte) (arg6[local28] - arg3[arg7++]);
				@Pc(41) int local41 = arg4++;
				arg6[local41] = (byte) (arg6[local41] - arg3[arg7++]);
				@Pc(54) int local54 = arg4++;
				arg6[local54] = (byte) (arg6[local54] - arg3[arg7++]);
				@Pc(67) int local67 = arg4++;
				arg6[local67] = (byte) (arg6[local67] - arg3[arg7++]);
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local28 = arg4++;
				arg6[local28] = (byte) (arg6[local28] - arg3[arg7++]);
			}
			arg7 += arg2;
			arg4 += arg1;
		}
		if (-1040068350 == -1040068350) {
			;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method8449(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		} else if (arg0 && arg1 >= 0) {
			@Pc(56) int local56 = 2;
			for (@Pc(60) int local60 = arg1 / 10; local60 != 0; local60 /= 10) {
				local56++;
			}
			@Pc(77) char[] local77 = new char[local56];
			local77[0] = '+';
			for (@Pc(85) int local85 = local56 - 1; local85 > 0; local85--) {
				@Pc(91) int local91 = arg1;
				arg1 /= 10;
				@Pc(102) int local102 = local91 - arg1 * 10;
				if (local102 >= 10) {
					local77[local85] = (char) (local102 + 87);
				} else {
					local77[local85] = (char) (local102 + 48);
				}
			}
			return new String(local77);
		} else {
			return Integer.toString(arg1, 10);
		}
	}
}
