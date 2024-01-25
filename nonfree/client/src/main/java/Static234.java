import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "Lclient!cw;")
	public static final Class63 aClass63_8 = new Class63("game3", 2);

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "Lclient!nt;")
	public static Class238 aClass238_27 = new Class238();

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZIIIIIFI)[I")
	public static int[] method3888(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub10_Sub2 local10 = new Class2_Sub10_Sub2();
		local10.anInt1224 = (int) (arg0 * 4096.0F);
		local10.anInt1220 = 8;
		local10.aBoolean87 = true;
		local10.anInt1216 = 4;
		local10.anInt1219 = 35;
		local10.anInt1223 = 8;
		local10.method8407();
		Static385.method5797(1, 2048);
		local10.method1087(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V")
	public static void method3889() {
		Static34.aClass222_2.method5469();
		Static133.aClass222_9.method5469();
	}
}
