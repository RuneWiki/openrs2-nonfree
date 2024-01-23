import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
	public static int anInt5177;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
	public static int[] anIntArray459 = new int[14];

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "[B")
	public static byte[] aByteArray67 = new byte[520];

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Lclient!hi;")
	public static Class61 aClass61_28 = new Class61();

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	public static int anInt5178 = 0;

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
	public static int anInt5179 = 0;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method4052() {
		@Pc(5) String local5 = "www";
		if (Static111.anInt2557 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(21) String local21 = "";
		if (Static253.aString292 != null) {
			local21 = "/p=" + Static253.aString292;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static202.anInt4089 + "/a=" + Static98.anInt2315 + local21 + "/";
	}
}
