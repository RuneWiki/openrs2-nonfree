import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!rea", name = "u", descriptor = "I")
	public static int anInt7725;

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "J")
	public static long aLong237 = 0L;

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "Lclient!eca;")
	public static final Class82 aClass82_5 = new Class82();

	@OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
	public static int anInt7726 = 0;

	@OriginalMember(owner = "client!rea", name = "y", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_78 = new Class70(18, -1);

	@OriginalMember(owner = "client!rea", name = "z", descriptor = "I")
	public static int anInt7728 = 0;

	@OriginalMember(owner = "client!rea", name = "A", descriptor = "I")
	public static int anInt7729 = -1;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLclient!vg;I)Ljava/lang/String;")
	public static String method6179(@OriginalArg(1) Class341 arg0, @OriginalArg(2) int arg1) {
		if (!Static63.method1137(arg0).method7772(arg1) && arg0.anObjectArray17 == null) {
			return null;
		} else if (arg0.aStringArray38 == null || arg0.aStringArray38.length <= arg1 || arg0.aStringArray38[arg1] == null || arg0.aStringArray38[arg1].trim().length() == 0) {
			return Static595.aBoolean755 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray38[arg1];
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBI)Z")
	public static boolean method6181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
