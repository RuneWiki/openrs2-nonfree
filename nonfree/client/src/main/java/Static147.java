import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	public static int anInt2479;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Lclient!oh;")
	public static Class273 method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class273 local7 = Static417.method6111(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass273Array4 == null || local7.aClass273Array4.length <= arg1) {
			return null;
		} else {
			return local7.aClass273Array4[arg1];
		}
	}
}
