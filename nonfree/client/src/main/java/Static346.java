import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_112 = new Class44(83, 2);

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
	public static final int[] anIntArray461 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)Lclient!fi;")
	public static Class14_Sub3_Sub8 method5298(@OriginalArg(0) int arg0) {
		@Pc(10) Class14_Sub3_Sub8 local10 = (Class14_Sub3_Sub8) Static93.aClass57_9.method1424((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static366.aClass386_85.method9196(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		}
		try {
			local10 = Static414.method6184(local25);
		} catch (@Pc(39) Exception local39) {
			throw new RuntimeException(local39.getMessage() + " S: " + arg0);
		}
		Static93.aClass57_9.method1422(local10, (long) arg0);
		return local10;
	}
}
