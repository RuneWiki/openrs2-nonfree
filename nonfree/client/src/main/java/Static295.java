import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt5480;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!dj;")
	public static Class40 aClass40_15 = new Class40(16);

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	public static int[] anIntArray626 = new int[5];

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
	public static int anInt5487 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4473() {
		@Pc(5) String local5 = "www";
		if (Static166.anInt3406 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(12) String local12 = "";
		if (Static227.aString268 != null) {
			local12 = "/p=" + Static227.aString268;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static9.anInt124 + "/a=" + Static259.anInt4939 + local12 + "/";
	}
}
