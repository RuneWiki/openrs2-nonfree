import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
	public static boolean aBoolean597;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method7389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(20) int local20;
		if (local9 == 0) {
			local20 = 0;
		} else {
			local20 = 8 - local9;
		}
		@Pc(36) int local36 = -((arg4 + 7) / 8);
		@Pc(45) int local45 = -((arg1 + 8 - 1) / 8);
		for (@Pc(47) int local47 = local36; local47 < 0; local47++) {
			for (@Pc(53) int local53 = local45; local53 < 0; local53++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local20;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method7391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) char[] local6 = new char[arg0];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(19) int local19 = arg2[local10 + arg1] & 0xFF;
			if (local19 != 0) {
				if (local19 >= 128 && local19 < 160) {
					@Pc(41) char local41 = Static601.aCharArray10[local19 - 128];
					if (local41 == '\u0000') {
						local41 = '?';
					}
					local19 = local41;
				}
				local6[local8++] = (char) local19;
			}
		}
		return new String(local6, 0, local8);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
	public static void method7392() {
		Static605.aClass317_37.method7870(5);
	}
}
