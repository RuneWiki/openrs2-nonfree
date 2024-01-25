import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!an;ILclient!n;)Lclient!qa;")
	public static Class42 method4406(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) Interface11 arg3) {
		try {
			if (!Static249.method4284()) {
				throw new RuntimeException("");
			} else if (Static222.method4058("jagdx")) {
				@Pc(20) Class local20 = Class.forName("Class42_Sub1_Sub1");
				@Pc(52) Method local52 = local20.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface11"), Class.forName("Class16"), Class.forName("java.lang.Integer"));
				return (Class42) local52.invoke(null, arg0, arg3, arg2, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
