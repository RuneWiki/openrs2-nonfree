import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static573 {

	@OriginalMember(owner = "client!uga", name = "W", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!uga", name = "Y", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!uga", name = "eb", descriptor = "Lclient!uh;")
	public static final Class342 aClass342_5 = new Class342();

	@OriginalMember(owner = "client!uga", name = "hb", descriptor = "J")
	public static long aLong259 = 0L;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZII)Z")
	public static boolean method7973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static371.method5820(arg1, arg0) || Static376.method5847(arg1, arg0);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(CI)Z")
	public static boolean method7975(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
