import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_5 = new Class90(47, 0);

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[I")
	public static int[] anIntArray16 = new int[2];

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public static int anInt864 = 0;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "F")
	public static float aFloat37 = 0.0F;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_6 = new Class90(63, 3);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)Z")
	public static boolean method758(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static39.aClass7_2.method7850();
		if (arg0 == local6) {
			return true;
		}
		if (!arg0) {
			Static39.aClass7_2.method7854();
		} else if (!Static39.aClass7_2.method7807()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static455.aClass4_Sub35_Sub1_1.aBoolean669 = arg0;
			Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
			return true;
		}
	}
}
