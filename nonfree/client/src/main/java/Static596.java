import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!fa;Ljava/awt/Canvas;ZLclient!ga;I)Lclient!r;")
	public static Class12 method886(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Class111 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static191.method3385()) {
				throw new RuntimeException("");
			} else if (Static293.method4616("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class12_Sub2_Sub1");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface5"), Class.forName("Class111"), Class.forName("java.lang.Integer"));
				return (Class12) local52.invoke(null, arg1, arg0, arg2, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
