import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	public static int anInt11034;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	public static int anInt11039;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas10;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Z")
	public static boolean aBoolean753 = false;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public static void method9213() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static608.aClass242Array1[local11] = null;
		}
		Static13.anInt195 = 0;
	}
}
