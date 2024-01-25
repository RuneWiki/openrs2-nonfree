import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
	public static int anInt7109;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
	public static int anInt7111;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "Lclient!ga;")
	public static Interface4 anInterface4_8;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
	public static int anInt7117 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5621(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static46.anInt861; local11++) {
			if (arg0.equalsIgnoreCase(Static284.aStringArray35[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
