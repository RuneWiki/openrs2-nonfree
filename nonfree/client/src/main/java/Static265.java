import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt5517 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method4658() {
		Static9.anInt173 = 0;
		for (@Pc(7) int local7 = 0; local7 < 2048; local7++) {
			Static165.aClass2_Sub12Array1[local7] = null;
			Static28.aByteArray5[local7] = 1;
		}
	}
}
