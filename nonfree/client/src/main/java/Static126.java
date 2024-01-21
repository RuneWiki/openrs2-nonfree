import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
	public static int anInt3091 = 127;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1702 = null;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
	public static int[] anIntArray330 = new int[128];

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public static volatile int anInt3098 = -1;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1703 = Static33.method650("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1704 = Static33.method650("@or2@");

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public static int anInt3102 = 0;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1705 = Static33.method650("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public static int anInt3105 = 0;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1706 = aClass56_1703;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method2008() {
		Static16.aClass33_1.method1516();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static111.aLongArray33[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static103.aLongArray29[local29] = 0L;
		}
		Static16.anInt468 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public static void method2011() {
		aClass56_1705 = null;
		aClass56_1704 = null;
		anIntArray330 = null;
		aClass56_1706 = null;
		aClass56_1703 = null;
		aClass56_1702 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)I")
	public static int method2013(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
