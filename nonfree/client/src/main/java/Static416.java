import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
	public static int anInt7352 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!mw;I)V")
	public static void method5916(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub1 arg1) {
		Static430.aBoolean581 = false;
		Static149.anInt2838 = 0;
		Static209.method7202(arg1);
		Static242.method3591(arg1);
		if (Static430.aBoolean581) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt9802 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt9802 + " psize:" + arg0);
		}
	}
}
