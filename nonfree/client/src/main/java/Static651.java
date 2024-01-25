import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!d;ILjava/awt/Canvas;Lclient!kha;I)Lclient!ha;")
	public static Class33 method1474(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Class181 arg3) {
		try {
			if (!Static211.method4161()) {
				throw new RuntimeException("");
			} else if (Static30.method575("jagdx")) {
				@Pc(21) Class local21 = Class.forName("Class33_Sub1_Sub2");
				@Pc(53) Method local53 = local21.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface5"), Class.forName("Class181"), Class.forName("java.lang.Integer"));
				return (Class33) local53.invoke(null, arg2, arg0, arg3, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(83) Throwable local83) {
			throw new RuntimeException("");
		}
	}
}
