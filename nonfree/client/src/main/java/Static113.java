import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static113 {

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "Lclient!vr;")
	public static Class258 aClass258_17;

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
	public static int anInt2415;

	@OriginalMember(owner = "client!fi", name = "L", descriptor = "Lclient!vr;")
	public static final Class258 aClass258_16 = new Class258();

	@OriginalMember(owner = "client!fi", name = "Q", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean186 = Boolean.FALSE;

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
	public static int anInt2413 = 0;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1808(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
