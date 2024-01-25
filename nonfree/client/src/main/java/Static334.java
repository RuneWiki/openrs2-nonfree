import jaggl.OpenGL;
import java.applet.Applet;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
	public static int anInt6734 = 0;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!d;Lclient!in;II)Lclient!ha;")
	public static Class20 method5734(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(4) int arg3) {
		if (!Static194.method3948()) {
			throw new RuntimeException("");
		} else if (Static472.method7443("jaggl")) {
			@Pc(26) OpenGL local26 = new OpenGL();
			@Pc(36) long local36 = local26.init(arg0, 8, 8, 8, 24, 0, arg3);
			if (local36 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(60) Class20_Sub2_Sub2 local60 = new Class20_Sub2_Sub2(local26, arg0, local36, arg1, arg2, arg3);
			local60.method1564();
			return local60;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method5735(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static653.method7723(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method5736(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static653.method7723(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
