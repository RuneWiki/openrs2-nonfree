import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!tj;")
	public static Class4 aClass4_11;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "J")
	public static long aLong211;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_107 = new Class218(3, -2);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([BIILjava/lang/String;)I")
	public static int method6903(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static494.method7241(arg2.charAt(local12));
			@Pc(39) int local39 = local12 + 1 < local10 ? Static494.method7241(arg2.charAt(local12 + 1)) : -1;
			@Pc(54) int local54 = local10 > local12 + 2 ? Static494.method7241(arg2.charAt(local12 + 2)) : -1;
			@Pc(73) int local73 = local12 + 3 < local10 ? Static494.method7241(arg2.charAt(local12 + 3)) : -1;
			arg0[arg1++] = (byte) (local39 >>> 4 | local20 << 2);
			if (local54 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local54 >>> 2 | (local39 & 0xF) << 4);
			if (local73 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local54 & 0x3) << 6 | local73);
		}
		return arg1;
	}
}
