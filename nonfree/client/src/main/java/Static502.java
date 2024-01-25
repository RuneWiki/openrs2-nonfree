import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!in;")
	public static Class157 aClass157_259;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method7993(@OriginalArg(1) Canvas arg0) {
		@Pc(10) Dimension local10 = arg0.getSize();
		Static317.method5512(local10.height, local10.width);
		if (Static66.anInt10075 == 1) {
			Static214.aClass20_7.method7272(arg0, Static37.anInt816, Static506.anInt9325);
		} else {
			Static214.aClass20_7.method7272(arg0, Static487.anInt9598, Static353.anInt7031);
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Lclient!og;")
	public static Class242 method7998(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static608.aClass242Array1[arg0] : null;
	}
}
