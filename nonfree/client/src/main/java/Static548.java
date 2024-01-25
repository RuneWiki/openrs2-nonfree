import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZLclient!n;Lclient!kr;ILjava/awt/Canvas;)Lclient!qa;")
	public static Class122 method2371(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		try {
			if (!Static528.method7330()) {
				throw new RuntimeException("");
			} else if (Static193.method6050("jagdx")) {
				@Pc(24) Class local24 = Class.forName("Class122_Sub2_Sub1");
				@Pc(50) Method local50 = local24.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface8"), Class.forName("Class171"), Class.forName("java.lang.Integer"));
				return (Class122) local50.invoke(null, arg3, arg0, arg1, Integer.valueOf(arg2));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(80) Throwable local80) {
			throw new RuntimeException("");
		}
	}
}
