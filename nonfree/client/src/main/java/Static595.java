import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!uba", name = "A", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_245 = new Class381(14, 4);

	@OriginalMember(owner = "client!uba", name = "y", descriptor = "Z")
	public static boolean aBoolean673 = false;

	@OriginalMember(owner = "client!uba", name = "C", descriptor = "I")
	public static final int anInt9608 = 0;

	@OriginalMember(owner = "client!uba", name = "D", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_246 = new Class381(1, -1);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	public static void method8191() {
		if (Static273.aClass100_6.method8657()) {
			Static273.aClass100_6.method8627(Static357.aCanvas8);
			Static106.method1602();
			if (Static377.aBoolean419) {
				Static169.method3032(Static357.aCanvas8);
			} else {
				@Pc(31) Dimension local31 = Static357.aCanvas8.getSize();
				Static273.aClass100_6.method8613(Static357.aCanvas8, local31.width, local31.height);
			}
			Static273.aClass100_6.method8646(Static357.aCanvas8);
		} else {
			Static462.method6506(false, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102());
		}
		Static352.method5188(-116);
		Static597.aBoolean675 = true;
	}
}
