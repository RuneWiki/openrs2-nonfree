import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Lclient!hk;")
	public static Class155 aClass155_15;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZ)V")
	public static void method5095(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) Class5_Sub31 local17 = Static93.method1470(arg1, arg0);
		if (local17 != null) {
			for (@Pc(23) int local23 = 0; local23 < local17.anIntArray328.length; local23++) {
				local17.anIntArray328[local23] = -1;
				local17.anIntArray327[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BC)Z")
	public static boolean method5097(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
