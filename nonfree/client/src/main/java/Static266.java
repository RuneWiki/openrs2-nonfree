import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	public static int anInt4433;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "Lclient!ba;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
	public static int anInt4437;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "Lclient!co;")
	public static final Class35 aClass35_5 = new Class35("WTRC", 1);

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_114 = new Class163(0, 0);

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
	public static int anInt4438 = 0;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "Lclient!ga;")
	public static Class82 aClass82_15 = null;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(CI)Z")
	public static boolean method3699(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)Z")
	public static boolean method3702() {
		if (Static429.aBoolean487) {
			try {
				if ((Boolean) Static473.method5059(Static32.aClass51_1.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(23) Throwable local23) {
			}
		}
		return true;
	}
}
