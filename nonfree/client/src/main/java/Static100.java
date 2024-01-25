import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	public static int anInt1765;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	public static int anInt1766;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!em;")
	public static final Class83 aClass83_50 = new Class83(65, 28);

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_7 = new Class207(64);

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	public static int anInt1767 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z")
	public static boolean method1475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static99.method1471(arg1, arg0) & Static345.method7740(arg1, arg0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)Z")
	public static boolean method1477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
