import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
	public static int anInt1735;

	@OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
	public static final int anInt1738 = 50;

	@OriginalMember(owner = "client!ke", name = "kb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_942 = Static33.method650("gelb:");

	@OriginalMember(owner = "client!ke", name = "rb", descriptor = "I")
	public static int anInt1748 = 0;

	@OriginalMember(owner = "client!ke", name = "tb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_943 = Static33.method650("Chat panel redrawn");

	@OriginalMember(owner = "client!ke", name = "wb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_945 = Static33.method650("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ke", name = "Ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_946 = Static33.method650("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ke", name = "Eb", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[5];

	@OriginalMember(owner = "client!ke", name = "Qb", descriptor = "I")
	public static volatile int anInt1763 = 0;

	@OriginalMember(owner = "client!ke", name = "Zb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_947 = aClass56_945;

	@OriginalMember(owner = "client!ke", name = "ec", descriptor = "I")
	public static int anInt1776 = 0;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!b;I)Lclient!oa;")
	public static Class56 method1187(@OriginalArg(0) Class3_Sub2 arg0) {
		return Static117.method1917(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V")
	public static void method1191() {
		aClass56_945 = null;
		aBooleanArray5 = null;
		aClass56_947 = null;
		aClass56_943 = null;
		aClass56_942 = null;
		aClass56_946 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I")
	public static int method1198(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
