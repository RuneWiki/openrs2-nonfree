import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static694 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!rg;Ljava/awt/Canvas;Lclient!d;II)Lclient!ha;")
	public static Class144 method1853(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3) {
		try {
			if (!Static485.method7318()) {
				throw new RuntimeException("");
			} else if (Static425.method6393("jagdx")) {
				@Pc(32) Class local32 = Class.forName("hda");
				@Pc(66) Method local66 = local32.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("rg"), Class.forName("java.lang.Integer"));
				return (Class144) local66.invoke((Object) null, arg1, arg2, arg0, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(96) Throwable local96) {
			throw new RuntimeException("");
		}
	}
}
