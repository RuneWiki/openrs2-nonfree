import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!pu;Lclient!fa;Ljava/awt/Canvas;I)Lclient!r;")
	public static Class134 method1652(@OriginalArg(1) Class270 arg0, @OriginalArg(2) Interface7 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static537.method7347()) {
				throw new RuntimeException("");
			} else if (Static342.method4694("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class134_Sub1_Sub2");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface7"), Class.forName("Class270"), Class.forName("java.lang.Integer"));
				return (Class134) local52.invoke(null, arg2, arg1, arg0, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
