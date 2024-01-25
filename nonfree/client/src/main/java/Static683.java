import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!wia;IZLclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class137 method7123(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static588.method8387()) {
				throw new RuntimeException("");
			} else if (Static160.method2605("jagdx")) {
				@Pc(20) Class local20 = Class.forName("Class137_Sub1_Sub2");
				@Pc(52) Method local52 = local20.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface3"), Class.forName("Class386"), Class.forName("java.lang.Integer"));
				return (Class137) local52.invoke((Object) null, arg3, arg2, arg0, Integer.valueOf(arg1));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(82) Throwable local82) {
			throw new RuntimeException("");
		}
	}
}
