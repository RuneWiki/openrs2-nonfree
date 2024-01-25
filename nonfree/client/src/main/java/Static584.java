import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!pq;Ljava/awt/Canvas;ILclient!e;)Lclient!oa;")
	public static Class121 method2961(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface7 arg3) {
		try {
			if (!Static80.method1296()) {
				throw new RuntimeException("");
			} else if (Static69.method889("jagdx")) {
				@Pc(21) Class local21 = Class.forName("Class121_Sub2_Sub2");
				@Pc(60) Method local60 = local21.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface7"), Class.forName("Class251"), Class.forName("java.lang.Integer"));
				return (Class121) local60.invoke(null, arg1, arg3, arg0, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(90) Throwable local90) {
			throw new RuntimeException("");
		}
	}
}
