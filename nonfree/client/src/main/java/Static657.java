import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILclient!d;Lclient!uu;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class82 method7746(@OriginalArg(1) int arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) Class343 arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static258.method4331()) {
				throw new RuntimeException("");
			} else if (Static422.method6653("jagdx")) {
				@Pc(20) Class local20 = Class.forName("Class82_Sub3_Sub2");
				@Pc(52) Method local52 = local20.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface5"), Class.forName("Class343"), Class.forName("java.lang.Integer"));
				return (Class82) local52.invoke((Object) null, arg3, arg1, arg2, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
