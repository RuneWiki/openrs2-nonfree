import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
	public static void method7128(@OriginalArg(1) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static471.method7069(local6.width, local6.height);
		if (Static18.anInt243 == 1) {
			Static22.aClass144_1.method6917(arg0, Static187.anInt3099, Static347.anInt5886);
		} else {
			Static22.aClass144_1.method6917(arg0, Static453.anInt7570, Static649.anInt10660);
		}
	}
}
