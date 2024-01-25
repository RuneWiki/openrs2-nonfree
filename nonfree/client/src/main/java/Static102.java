import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!du", name = "i", descriptor = "I")
	public static int anInt1774;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Lclient!sea;")
	public static Class308 aClass308_40;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Lclient!em;")
	public static final Class83 aClass83_52 = new Class83(29, 5);

	@OriginalMember(owner = "client!du", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	public static final int anInt1773 = 1338;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!sea;I)V")
	public static void method1481(@OriginalArg(0) Class308 arg0) {
		Static456.anInt7982 = arg0.method6558("p11_full");
		Static414.anInt7794 = arg0.method6558("p12_full");
		Static377.anInt6738 = arg0.method6558("b12_full");
	}
}
