import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!nha", name = "Gb", descriptor = "I")
	public static int anInt6358;

	@OriginalMember(owner = "client!nha", name = "w", descriptor = "[I")
	public static final int[] anIntArray559 = new int[256];

	@OriginalMember(owner = "client!nha", name = "yc", descriptor = "I")
	public static int anInt6382 = -1;

	@OriginalMember(owner = "client!nha", name = "g", descriptor = "(I)V")
	public static void method5685() {
		if (Static674.aClass13_22.method8496()) {
			Static674.aClass13_22.method8464(Static126.aCanvas6);
			Static302.method4647();
			if (Static82.aBoolean134) {
				Static356.method5246(Static126.aCanvas6);
			} else {
				@Pc(22) Dimension local22 = Static126.aCanvas6.getSize();
				Static674.aClass13_22.method8468(Static126.aCanvas6, local22.width, local22.height);
			}
			Static674.aClass13_22.method8450(Static126.aCanvas6);
		} else {
			Static382.method5480(false, Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970());
		}
		Static540.method7765();
		Static27.aBoolean42 = true;
	}
}
