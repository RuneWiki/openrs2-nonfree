import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!dn;BILjava/awt/Canvas;Lclient!n;)Lclient!qa;")
	public static Class4 method6570(@OriginalArg(0) Class69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Interface13 arg3) {
		try {
			if (!Static510.method7784()) {
				throw new RuntimeException("");
			} else if (Static259.method4668("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class4_Sub2_Sub1");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface13"), Class.forName("Class69"), Class.forName("java.lang.Integer"));
				return (Class4) local52.invoke(null, arg2, arg3, arg0, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
