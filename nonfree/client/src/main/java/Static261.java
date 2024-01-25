import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!iu", name = "D", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "Z")
	public static boolean aBoolean343 = false;

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "I")
	public static int anInt4675 = 0;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4270(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub40 local10 = (Class3_Sub40) Static244.aClass83_11.method2368((long) arg0);
		if (local10 != null) {
			@Pc(22) Class3_Sub19_Sub3 local22 = local10.aClass121_Sub1_1.method3606();
			if (local22 != null) {
				@Pc(29) double local29 = local10.aClass121_Sub1_1.method3615();
				if ((double) local22.method4290() <= local29 && (double) local22.method4287() >= local29) {
					return local22.method4288();
				}
			}
		}
		return null;
	}
}
