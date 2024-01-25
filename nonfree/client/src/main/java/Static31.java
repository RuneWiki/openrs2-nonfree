import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_2 = new Class358(14, 0, 4, 1);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IBILclient!vc;)V")
	public static void method498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class344 arg2) {
		Static554.aClass344ArrayArray1[arg0][arg1] = arg2;
	}
}
