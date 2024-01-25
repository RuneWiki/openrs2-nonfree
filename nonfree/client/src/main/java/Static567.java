import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vm", name = "J", descriptor = "[Z")
	public static final boolean[] aBooleanArray41 = new boolean[5];

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_14 = new Class342(2, 4, 4, 0);

	@OriginalMember(owner = "client!vm", name = "T", descriptor = "Z")
	public static boolean aBoolean688 = false;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZII)V")
	public static void method7375(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub49 local10 = Static84.method1640(arg1, arg0);
		if (local10 != null) {
			for (@Pc(22) int local22 = 0; local22 < local10.anIntArray697.length; local22++) {
				local10.anIntArray697[local22] = -1;
				local10.anIntArray696[local22] = 0;
			}
		}
	}
}
