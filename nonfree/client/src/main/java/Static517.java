import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!bga;")
	public static Class31 aClass31_12;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt9665;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method7878(@OriginalArg(1) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) long local18 = 0L;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = (long) arg0.charAt(local20) + (local18 << 5) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([III[ILclient!ok;I)Lclient!lda;")
	public static Class204_Sub1 method7879(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class134_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = local12 * arg4 + arg0[local12];
			for (@Pc(24) int local24 = 0; local24 < arg2[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class204_Sub1(arg3, arg4, arg1, local10);
	}
}
