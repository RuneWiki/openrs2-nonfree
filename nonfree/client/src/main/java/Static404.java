import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_87 = new Class179(27, 15);

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Z")
	public static boolean aBoolean444 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5427(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) - (local10 - arg0.charAt(local17));
		}
		return local10;
	}
}
