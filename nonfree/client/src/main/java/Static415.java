import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Z")
	public static final boolean aBoolean660 = false;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lclient!jj;")
	public static Class3_Sub4_Sub14 method7924(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub4_Sub14 local10 = (Class3_Sub4_Sub14) Static436.aClass357_3.method8390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static522.aClass196_109.method5102(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static564.method8102(local20);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static436.aClass357_3.method8392((long) arg0, local10);
		return local10;
	}
}
