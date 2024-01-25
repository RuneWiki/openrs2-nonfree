import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Z")
	public static boolean method502(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZZI)Lclient!ld;")
	public static Class3_Sub38 method503(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(13) long local13 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub38) Static537.aClass313_41.method7104(local13);
	}
}
