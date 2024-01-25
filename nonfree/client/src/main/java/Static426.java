import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!ofa", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIZI)Z")
	public static boolean method6149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static90.aByteArrayArrayArray25[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static90.aByteArrayArrayArray25[arg3][arg1][arg0] & 0x10) == 0) {
			return arg2 == Static229.method3905(arg0, arg1, arg3);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method6150(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg2];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg2; local10++) {
			@Pc(28) int local28 = arg0[arg1 + local10] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(47) char local47 = Static268.aCharArray7[local28 - 128];
					if (local47 == '\u0000') {
						local47 = '?';
					}
					local28 = local47;
				}
				local6[local8++] = (char) local28;
			}
		}
		return new String(local6, 0, local8);
	}
}
