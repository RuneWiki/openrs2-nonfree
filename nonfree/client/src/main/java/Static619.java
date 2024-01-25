import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!vaa", name = "m", descriptor = "Lclient!mia;")
	public static Class233 aClass233_3;

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "Lclient!pb;")
	public static final Class267 aClass267_7 = new Class267("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!vaa", name = "l", descriptor = "Lclient!eca;")
	public static final Class90 aClass90_3 = new Class90();

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZI)V")
	public static void method8292(@OriginalArg(1) int arg0) {
		Static151.method7369();
		@Pc(11) int local11 = Static532.aClass260_1.method6449(arg0).anInt6240;
		if (local11 == 0) {
			return;
		}
		@Pc(26) int local26 = Static413.aClass63_1.anIntArray70[arg0];
		if (local11 == 6) {
			Static94.anInt1556 = local26;
		}
		if (local11 == 5) {
			Static171.anInt2827 = local26;
		}
	}
}
