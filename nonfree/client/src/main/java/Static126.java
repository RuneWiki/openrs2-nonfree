import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Lclient!cc;")
	public static Class22 aClass22_12;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public static int anInt2695 = -1;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public static int anInt2697 = 0;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
	public static int anInt2699 = 0;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method2090() {
		Static18.aClass33_3.method843();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2091(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method2092() {
		anIntArray243 = null;
		aClass22_12 = null;
		aLongArray6 = null;
	}
}
