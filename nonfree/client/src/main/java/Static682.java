import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;ILclient!gj;I)Lclient!ha;")
	public static Class16 method1778(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static35.method1089()) {
				throw new RuntimeException("");
			} else if (Static519.method7352("jagdx")) {
				@Pc(20) Class local20 = Class.forName("Class16_Sub1_Sub1");
				@Pc(52) Method local52 = local20.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface5"), Class.forName("Class143"), Class.forName("java.lang.Integer"));
				return (Class16) local52.invoke((Object) null, arg1, arg0, arg2, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
