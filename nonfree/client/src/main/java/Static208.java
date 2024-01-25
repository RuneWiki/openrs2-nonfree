import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gga", name = "A", descriptor = "Lclient!bi;")
	public static Class29 aClass29_2;

	@OriginalMember(owner = "client!gga", name = "y", descriptor = "I")
	public static int anInt3615 = 0;

	@OriginalMember(owner = "client!gga", name = "w", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)I")
	public static int method3100(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(40) int local40 = (arg0 & 0x7F) * 96 >> 7;
			if (local40 < 2) {
				local40 = 2;
			} else if (local40 > 126) {
				local40 = 126;
			}
			return (arg0 & 0xFF80) + local40;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
	public static int method3101(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(20) int local20 = arg0.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22 += 4) {
			@Pc(32) int local32 = Static363.method5197(arg0.charAt(local22));
			@Pc(47) int local47 = local22 + 1 >= local20 ? -1 : Static363.method5197(arg0.charAt(local22 + 1));
			@Pc(63) int local63 = local22 + 2 < local20 ? Static363.method5197(arg0.charAt(local22 + 2)) : -1;
			@Pc(79) int local79 = local22 + 3 >= local20 ? -1 : Static363.method5197(arg0.charAt(local22 + 3));
			arg2[arg1++] = (byte) (local32 << 2 | local47 >>> 4);
			if (local63 == -1) {
				break;
			}
			arg2[arg1++] = (byte) ((local47 & 0xF) << 4 | local63 >>> 2);
			if (local79 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local79 | (local63 & 0x3) << 6);
		}
		return arg1;
	}
}
