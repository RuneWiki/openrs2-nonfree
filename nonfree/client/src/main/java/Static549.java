import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!kda;Lclient!n;)Lclient!qa;")
	public static Class9 method1410(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class160 arg2, @OriginalArg(4) Interface8 arg3) {
		try {
			if (!Static124.method4362()) {
				throw new RuntimeException("");
			} else if (Static531.method7565("jagdx")) {
				@Pc(21) Class local21 = Class.forName("Class9_Sub1_Sub2");
				@Pc(53) Method local53 = local21.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface8"), Class.forName("Class160"), Class.forName("java.lang.Integer"));
				return (Class9) local53.invoke(null, arg0, arg3, arg2, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(83) Throwable local83) {
			throw new RuntimeException("");
		}
	}
}
