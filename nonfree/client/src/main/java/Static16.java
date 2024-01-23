import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!b", name = "s", descriptor = "I")
	public static int anInt342;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method286(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
