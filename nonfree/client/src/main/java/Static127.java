import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method2103(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static586.method8376(local6.width, local6.height);
		if (Static453.anInt7941 == 1) {
			Static117.aClass137_46.method7898(arg0, Static497.anInt10443, Static608.anInt10279);
		} else {
			Static117.aClass137_46.method7898(arg0, Static503.anInt8861, Static496.anInt8827);
		}
	}
}
