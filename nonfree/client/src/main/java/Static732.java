import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static732 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!nca;Lclient!d;Ljava/awt/Canvas;IB)Lclient!ha;")
	public static Class145 method4144(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) int arg3) {
		try {
			if (!Static604.method8252()) {
				throw new RuntimeException("");
			} else if (Static548.method7659("jagdx")) {
				@Pc(32) Class local32 = Class.forName("wu");
				@Pc(66) Method local66 = local32.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface3"), Class.forName("nca"), Class.forName("java.lang.Integer"));
				return (Class145) local66.invoke((Object) null, arg2, arg1, arg0, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(96) Throwable local96) {
			throw new RuntimeException("");
		}
	}
}
