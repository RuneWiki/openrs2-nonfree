import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!pja", name = "i", descriptor = "I")
	public static int anInt8476 = -1;

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
	public static void method7117(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static271.method4143(local6.height, local6.width);
		if (Static293.anInt5243 == 1) {
			Static622.aClass67_15.method7631(arg0, Static306.anInt5501, Static648.anInt10431);
		} else {
			Static622.aClass67_15.method7631(arg0, Static396.anInt7103, Static161.anInt2962);
		}
	}
}
