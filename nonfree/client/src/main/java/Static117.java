import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
	public static int anInt2173 = 0;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
	public static void method1779() {
		Static146.aClass28Array3 = null;
		Static17.aClass28_2 = null;
		Static613.aClass28Array21 = null;
		Static351.aClass28Array16 = null;
		Static273.aClass28Array13 = null;
		Static16.aClass55_1 = null;
		Static556.aClass28Array19 = null;
		Static160.aClass28Array20 = null;
		Static386.aClass28Array18 = null;
		Static602.aClass55_16 = null;
		Static281.aClass55_8 = null;
		Static217.aClass28Array9 = null;
		Static477.aClass28_28 = null;
		Static197.aClass28Array22 = null;
		Static114.aClass28Array2 = null;
		Static207.aClass28Array8 = null;
		Static262.aClass28Array12 = null;
		Static562.aClass28Array15 = null;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!lw;I)I")
	public static int method1781(@OriginalArg(0) Class223 arg0) {
		if (Static20.aClass223_3 == arg0) {
			return 6407;
		} else if (arg0 == Static576.aClass223_16) {
			return 6408;
		} else if (Static356.aClass223_12 == arg0) {
			return 6406;
		} else if (Static498.aClass223_13 == arg0) {
			return 6409;
		} else if (arg0 == Static9.aClass223_2) {
			return 6410;
		} else if (arg0 == Static3.aClass223_17) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method1782(@OriginalArg(0) Canvas arg0) {
		@Pc(14) Dimension local14 = arg0.getSize();
		Static137.method2017(local14.width, local14.height);
		if (Static483.anInt8236 == 1) {
			Static9.aClass133_1.method7273(arg0, Static404.anInt6761, Static447.anInt7618);
		} else {
			Static9.aClass133_1.method7273(arg0, Static111.anInt2087, Static517.anInt8880);
		}
	}
}
