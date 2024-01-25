import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "[Lclient!pca;")
	public static Class251[] aClass251Array2;

	@OriginalMember(owner = "client!lca", name = "O", descriptor = "I")
	private static int anInt1937;

	@OriginalMember(owner = "client!lca", name = "P", descriptor = "I")
	private static int anInt1938;

	@OriginalMember(owner = "client!lca", name = "Q", descriptor = "Z")
	private static boolean aBoolean150;

	@OriginalMember(owner = "client!lca", name = "R", descriptor = "I")
	private static int anInt1939;

	@OriginalMember(owner = "client!lca", name = "S", descriptor = "I")
	private static int anInt1940;

	@OriginalMember(owner = "client!lca", name = "T", descriptor = "Z")
	private static boolean aBoolean151;

	@OriginalMember(owner = "client!lca", name = "U", descriptor = "Z")
	private static boolean aBoolean152;

	@OriginalMember(owner = "client!lca", name = "V", descriptor = "Z")
	private static boolean aBoolean153;

	@OriginalMember(owner = "client!lca", name = "W", descriptor = "I")
	private static int anInt1941;

	@OriginalMember(owner = "client!lca", name = "X", descriptor = "Z")
	private static boolean aBoolean154;

	@OriginalMember(owner = "client!lca", name = "Y", descriptor = "Z")
	private static boolean aBoolean155;

	@OriginalMember(owner = "client!lca", name = "Z", descriptor = "I")
	private static int anInt1942;

	@OriginalMember(owner = "client!lca", name = "ab", descriptor = "Z")
	private static boolean aBoolean156;

	@OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
	public static int anInt1927 = 0;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "(B)Lclient!cca;")
	public static Class48_Sub1 method1699() {
		return Static497.aClass48_Sub1Array2.length > Static126.anInt2889 ? Static497.aClass48_Sub1Array2[Static126.anInt2889++] : null;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!ie;I)Lclient!ada;")
	public static Class8 method1700(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(7) int local7 = arg0.method6811();
		return new Class8(local7);
	}
}
