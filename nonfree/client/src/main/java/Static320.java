import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_17 = new Class17(1, 6);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4946(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
