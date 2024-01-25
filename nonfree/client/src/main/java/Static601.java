import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static601 {

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	public static int anInt9749;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	public static final int anInt9746 = 1337;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!mga;")
	public static final Class220 aClass220_14 = new Class220("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
	public static boolean method8292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static311.method5228(arg1, arg0) || Static395.method6226(arg1, arg0);
	}
}
