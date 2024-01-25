import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static685 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!d;ILclient!uq;)Lclient!ha;")
	public static Class95 method6291(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(4) Class362 arg3) {
		try {
			if (!Static1.method8752()) {
				throw new RuntimeException("");
			} else if (Static634.method5642("jagdx")) {
				@Pc(26) Class local26 = Class.forName("Class95_Sub1_Sub2");
				@Pc(52) Method local52 = local26.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface2"), Class.forName("Class362"), Class.forName("java.lang.Integer"));
				return (Class95) local52.invoke((Object) null, arg1, arg2, arg3, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
