import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!fa;Lclient!om;)Lclient!r;")
	public static Class43 method2160(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) Class246 arg3) {
		try {
			if (!Static71.method1657()) {
				throw new RuntimeException("");
			} else if (Static557.method7419("jagdx")) {
				@Pc(19) Class local19 = Class.forName("Class43_Sub1_Sub1");
				@Pc(58) Method local58 = local19.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface8"), Class.forName("Class246"), Class.forName("java.lang.Integer"));
				return (Class43) local58.invoke(null, arg0, arg2, arg3, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(88) Throwable local88) {
			throw new RuntimeException("");
		}
	}
}
