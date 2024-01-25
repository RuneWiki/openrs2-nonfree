import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!mha", name = "o", descriptor = "I")
	public static int anInt6266;

	@OriginalMember(owner = "client!mha", name = "C", descriptor = "Lclient!eo;")
	public static final Class108 aClass108_9 = new Class108(9, 2);

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method5290(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static114.aClass84_33.method1729(Static654.anInt10668) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static114.aClass84_35.method1729(Static654.anInt10668) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
