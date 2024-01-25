import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!vd;Lclient!d;II)Lclient!ha;")
	public static Class100 method3153(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3) {
		try {
			if (!Static377.method7189()) {
				throw new RuntimeException("");
			} else if (Static96.method1571("jagdx")) {
				@Pc(29) Class local29 = Class.forName("Class100_Sub1_Sub1");
				@Pc(55) Method local55 = local29.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class353"), Class.forName("java.lang.Integer"));
				return (Class100) local55.invoke((Object) null, arg0, arg2, arg1, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(85) Throwable local85) {
			throw new RuntimeException("");
		}
	}
}
