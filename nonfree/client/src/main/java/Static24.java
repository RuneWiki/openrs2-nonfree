import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_9 = new Class90(95, -1);

	@OriginalMember(owner = "client!av", name = "l", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_10 = new Class90(54, -2);

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!av", name = "n", descriptor = "[I")
	public static final int[] anIntArray24 = new int[1024];

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method902(@OriginalArg(0) Class7 arg0) {
		for (@Pc(10) Class21_Sub5 local10 = (Class21_Sub5) Static109.aClass158_8.method3726(); local10 != null; local10 = (Class21_Sub5) Static109.aClass158_8.method3721()) {
			if (local10.aBoolean282) {
				local10.method3044(arg0);
			}
		}
	}
}
