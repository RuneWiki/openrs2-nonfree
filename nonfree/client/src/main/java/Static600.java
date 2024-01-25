import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!mv;IILclient!fa;)Lclient!r;")
	public static Class162 method4362(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface9 arg3) {
		try {
			if (!Static463.method5982()) {
				throw new RuntimeException("");
			} else if (Static560.method7324("jagdx")) {
				@Pc(27) Class local27 = Class.forName("Class162_Sub1_Sub1");
				@Pc(53) Method local53 = local27.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface9"), Class.forName("Class229"), Class.forName("java.lang.Integer"));
				return (Class162) local53.invoke(null, arg0, arg3, arg1, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(83) Throwable local83) {
			throw new RuntimeException("");
		}
	}
}
