import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method5118(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(16) char[] local16 = new char[arg2];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			@Pc(30) int local30 = arg1[local20 + arg0] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(47) char local47 = Static595.aCharArray12[local30 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local30 = local47;
				}
				local16[local18++] = (char) local30;
			}
		}
		return new String(local16, 0, local18);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)Z")
	public static boolean method5122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static442.method7196(arg0, arg1) || Static330.method5099(arg1, arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "([BIIIII)V")
	public static void method5123(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(24) int local24 = arg3 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(33) int local33 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg2 = local43 + 1;
			arg0[local43] = 1;
		}
	}
}
