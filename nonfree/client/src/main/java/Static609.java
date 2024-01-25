import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!pfa;Lclient!e;)Lclient!oa;")
	public static Class14 method6725(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Class251 arg2, @OriginalArg(4) Interface4 arg3) {
		try {
			if (!Static481.method6625()) {
				throw new RuntimeException("");
			} else if (Static511.method7084("jagdx")) {
				@Pc(33) Class local33 = Class.forName("Class14_Sub2_Sub2");
				@Pc(59) Method local59 = local33.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class251"), Class.forName("java.lang.Integer"));
				return (Class14) local59.invoke(null, arg1, arg3, arg2, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(89) Throwable local89) {
			throw new RuntimeException("");
		}
	}
}
