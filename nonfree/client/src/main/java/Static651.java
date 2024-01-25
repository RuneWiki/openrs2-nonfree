import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!d;Lclient!nd;)Lclient!ha;")
	public static Class13 method3000(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Class238 arg3) {
		try {
			if (!Static211.method3532()) {
				throw new RuntimeException("");
			} else if (Static354.method5314("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class13_Sub3_Sub2");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface2"), Class.forName("Class238"), Class.forName("java.lang.Integer"));
				return (Class13) local52.invoke((Object) null, arg1, arg2, arg3, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
