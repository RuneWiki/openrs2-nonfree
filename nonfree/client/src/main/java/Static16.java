import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Lclient!o;")
	public static Class40 aClass40_109 = Static13.method257("green:");

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!o;")
	public static Class40 aClass40_110 = Static13.method257("");

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_111 = Static13.method257("Report abuse @whi@");

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt410 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ud;I)V")
	public static void method340(@OriginalArg(0) Class5 arg0) {
		Static66.aClass5_21 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method344() {
		aClass40_109 = null;
		aClass40_111 = null;
		aByteArrayArray3 = null;
		aClass40_110 = null;
	}
}
