import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "g", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_1 = new Class56(87, -2);

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!pp;")
	public static final Class201 aClass201_1 = new Class201("WIP", 2);

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt6 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method6(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static50.anInt812 = 1;
		Static11.anInt178 = -1;
		Static62.method867(arg0, arg1);
	}
}
