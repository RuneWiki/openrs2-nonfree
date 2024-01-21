import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!vc;")
	private static Class71 aClass71_713 = Static38.method736("flash3:");

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_714 = Static38.method736("Konfig geladen)3");

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_715 = Static38.method736("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_716 = aClass71_713;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Lclient!vc;")
	private static Class71 aClass71_719 = Static38.method736("Loading ignore list");

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_717 = aClass71_719;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "[Lclient!wd;")
	public static Class5_Sub1_Sub1_Sub7[] aClass5_Sub1_Sub1_Sub7Array1 = new Class5_Sub1_Sub1_Sub7[4];

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_718 = Static38.method736("backvmid2");

	@OriginalMember(owner = "client!id", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public static int anInt1406 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method956() {
		Static71.aClass57_10 = new Class57(32);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	public static void method957() {
		aClass71_719 = null;
		aClass71_713 = null;
		aClass5_Sub1_Sub1_Sub7Array1 = null;
		aClass71_718 = null;
		aClass71_716 = null;
		aClass71_714 = null;
		aClass71_717 = null;
		aClass71_715 = null;
		anObject2 = null;
		aBooleanArray10 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Z")
	public static boolean method958(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)J")
	public static synchronized long method959() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static119.aLong115 > local10) {
			Static104.aLong119 += Static119.aLong115 - local10;
		}
		Static119.aLong115 = local10;
		return local10 + Static104.aLong119;
	}
}
