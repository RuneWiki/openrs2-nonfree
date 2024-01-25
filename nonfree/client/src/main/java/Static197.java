import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "[I")
	public static final int[] anIntArray793 = new int[2500];

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
	public static int anInt6354 = -1;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method5561(@OriginalArg(0) Component arg0) {
		@Pc(11) Method local11 = Static168.aMethod2;
		if (local11 != null) {
			try {
				local11.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(25) Throwable local25) {
			}
		}
		arg0.addKeyListener(Static61.aClass79_1);
		arg0.addFocusListener(Static61.aClass79_1);
	}
}
