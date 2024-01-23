import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
	public static int anInt854;

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
	public static int anInt855;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_283 = Static231.method3737(")2");

	@OriginalMember(owner = "client!de", name = "ib", descriptor = "Lclient!sc;")
	public static Class107 aClass107_284 = Static231.method3737("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
	public static int anInt856 = 3353893;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "[I")
	public static int[] anIntArray85 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "Z")
	public static volatile boolean aBoolean82 = true;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V")
	public static void method771() {
		Static120.aClass61_50.method1695(5);
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)Z")
	public static boolean method772() {
		if (Static100.anInt2169 != 0) {
			try {
				Static101.aClass107_595.method3113(Static117.aClass34_2.anApplet1);
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!bj;)V")
	public static void method773(@OriginalArg(1) Class17 arg0) {
		Static93.aClass17_2 = arg0;
	}
}
