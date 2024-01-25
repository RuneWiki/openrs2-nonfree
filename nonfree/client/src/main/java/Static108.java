import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
	public static int anInt1826;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_13 = new Class85(8);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method1601(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static322.method4459(local6.width, local6.height);
		if (Static240.anInt10701 == 1) {
			Static614.aClass145_14.method9662(arg0, Static501.anInt5842, Static23.anInt6817);
		} else {
			Static614.aClass145_14.method9662(arg0, Static482.anInt7726, Static72.anInt1263);
		}
	}
}
