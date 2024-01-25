import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static701 {

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_193 = new Class186(63, 12);

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
	public static int anInt10979 = 0;

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
	public static int anInt10980 = -1;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method9171(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static271.method4143(local6.height, local6.width);
		if (Static293.anInt5243 == 1) {
			Static622.aClass67_15.method7669(arg0, Static306.anInt5501, Static648.anInt10431);
		} else {
			Static622.aClass67_15.method7669(arg0, Static396.anInt7103, Static161.anInt2962);
		}
	}
}
