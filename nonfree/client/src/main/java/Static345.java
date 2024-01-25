import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
	public static int anInt5641;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Lclient!et;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_32 = new Class177();

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_96 = new Class194(12, 3);

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_155 = new Class129(42, -1);

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	public static int anInt5644 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIZ)V")
	public static void method4478(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class5_Sub26 local10 = Static176.method2415(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray247.length; local15++) {
				local10.anIntArray247[local15] = -1;
				local10.anIntArray249[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4479(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static6.method94("\n", arg0, "%0a"));
	}
}
