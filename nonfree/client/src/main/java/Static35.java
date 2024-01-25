import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bda", name = "m", descriptor = "Z")
	public static boolean aBoolean730 = false;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method8315(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static434.aClass271_33.method5972(Static483.anInt7694) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static434.aClass271_35.method5972(Static483.anInt7694) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8317(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
