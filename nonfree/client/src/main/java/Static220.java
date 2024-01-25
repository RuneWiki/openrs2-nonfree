import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hfa", name = "E", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
	public static void method3440() {
		Static418.method5969();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static27.aClass198Array1[local8].method4537();
		}
		Static542.method7494();
		Static389.method5059();
		Static17.method713();
		System.gc();
		Static582.aClass16_12.ya();
	}

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "(III)Z")
	public static boolean method3442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static304.method4692(arg0, arg1) | (arg0 & 0x70000) != 0 || Static519.method7350(arg0, arg1);
	}
}
