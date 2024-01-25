import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLjava/awt/Canvas;Lclient!la;ILclient!d;)Lclient!ha;")
	public static Class5 method4788(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Class196 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface7 arg3) {
		try {
			if (!Static118.method2413()) {
				throw new RuntimeException("");
			} else if (Static522.method7730("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class5_Sub1_Sub1");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface7"), Class.forName("Class196"), Class.forName("java.lang.Integer"));
				return (Class5) local52.invoke(null, arg0, arg3, arg1, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
