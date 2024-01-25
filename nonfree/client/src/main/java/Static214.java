import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!gla", name = "d", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!gla", name = "f", descriptor = "I")
	public static int anInt3419 = -2;

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(III)V")
	public static void method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static537.anInt5296 = arg1 - Static90.anInt3348;
		Static657.anInt10294 = arg0 - Static90.anInt3353;
	}
}
