import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public static int anInt6541 = 0;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
	public static int anInt6542 = -1;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
	public static int anInt6546 = 0;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method5517(@OriginalArg(0) Canvas arg0) {
		@Pc(9) Dimension local9 = arg0.getSize();
		Static128.method2531(local9.height, local9.width);
		if (Static244.anInt4841 == 1) {
			Static167.aClass87_3.method7924(arg0, Static250.anInt8280, Static326.anInt5898);
		} else {
			Static167.aClass87_3.method7924(arg0, Static312.anInt5689, Static400.anInt7142);
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
	public static void method5521(@OriginalArg(0) int arg0) {
		Static113.anInt2175 = arg0;
	}
}
