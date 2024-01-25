import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public static int anInt10789;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "D")
	public static double aDouble24;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
	public static int anInt10793;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "Lclient!qea;")
	public static final Class288 aClass288_7 = new Class288();

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
	public static int anInt10792 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZIIII)V")
	public static void method9280(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static601.method8649();
		Static147.aLong71 = 0L;
		@Pc(10) int local10 = Static341.method5176();
		if (arg3 == 3 || local10 == 3) {
			arg0 = true;
		}
		if (!Static457.aClass57_11.method7694()) {
			arg0 = true;
		}
		Static367.method8725(arg3, local10, arg2, arg1, arg0);
	}
}
