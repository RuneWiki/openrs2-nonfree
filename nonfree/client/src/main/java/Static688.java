import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!bt;ZLclient!d;I)Lclient!ha;")
	public static Class33 method8796(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) Interface9 arg2, @OriginalArg(4) int arg3) {
		try {
			if (!Static667.method8904()) {
				throw new RuntimeException("");
			} else if (Static678.method8984("jagdx")) {
				@Pc(20) Class local20 = Class.forName("Class33_Sub2_Sub2");
				@Pc(51) Method local51 = local20.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface9"), Class.forName("Class34"), Class.forName("java.lang.Integer"));
				return (Class33) local51.invoke((Object) null, arg0, arg2, arg1, Integer.valueOf(arg3));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(81) Throwable local81) {
			throw new RuntimeException("");
		}
	}
}
