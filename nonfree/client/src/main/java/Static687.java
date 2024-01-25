import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!wm;Ljava/awt/Canvas;ILclient!d;)Lclient!ha;")
	public static Class65 method5735(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Interface4 arg3) {
		try {
			if (!Static513.method7299()) {
				throw new RuntimeException("");
			} else if (Static278.method4508("jagdx")) {
				@Pc(27) Class local27 = Class.forName("Class65_Sub2_Sub1");
				@Pc(53) Method local53 = local27.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface4"), Class.forName("Class390"), Class.forName("java.lang.Integer"));
				return (Class65) local53.invoke((Object) null, arg2, arg3, arg1, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(83) Throwable local83) {
			throw new RuntimeException("");
		}
	}
}
