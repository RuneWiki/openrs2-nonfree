import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static680 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!d;ILjava/awt/Canvas;Lclient!ae;)Lclient!ha;")
	public static Class132 method2218(@OriginalArg(0) int arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class8 arg3) {
		try {
			if (!Static424.method6294()) {
				throw new RuntimeException("");
			} else if (Static272.method4009("jagdx")) {
				@Pc(23) Class local23 = Class.forName("Class132_Sub1_Sub2");
				@Pc(49) Method local49 = local23.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface6"), Class.forName("Class8"), Class.forName("java.lang.Integer"));
				return (Class132) local49.invoke((Object) null, arg2, arg1, arg3, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(92) Throwable local92) {
			throw new RuntimeException("");
		}
	}
}
