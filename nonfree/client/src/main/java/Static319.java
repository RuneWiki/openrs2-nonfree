import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_99 = new Class154(64);

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "[I")
	public static final int[] anIntArray506 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!wf;")
	public static final Class4_Sub42 aClass4_Sub42_1 = new Class4_Sub42(0, 0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method5288() {
		@Pc(5) String local5 = "www";
		if (Static306.anInt6192 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(11) String local11 = "";
		if (Static153.aString115 != null) {
			local11 = "/p=" + Static153.aString115;
		}
		return Static269.anInt5508 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static253.anInt5246 + "/a=" + Static145.anInt3255 + local11 + "/" : "http://" + local5 + ".runescape.com/l=" + Static253.anInt5246 + "/a=" + Static145.anInt3255 + local11 + "/";
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!fd;I)Lclient!fd;")
	public static Class72 method5289(@OriginalArg(0) Class72 arg0) {
		if (arg0.anInt1813 != -1) {
			return Static66.method1243(arg0.anInt1813);
		}
		@Pc(20) int local20 = arg0.anInt1830 >>> 16;
		@Pc(25) Class128 local25 = new Class128(Static38.aClass198_5);
		for (@Pc(30) Class4_Sub8 local30 = (Class4_Sub8) local25.method3461(); local30 != null; local30 = (Class4_Sub8) local25.method3462()) {
			if (local30.anInt1670 == local20) {
				return Static66.method1243((int) local30.aLong259);
			}
		}
		return null;
	}
}
