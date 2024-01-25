import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!e;ILjava/awt/Canvas;Lclient!pj;)Lclient!oa;")
	public static Class90 method7859(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class248 arg3) {
		try {
			if (!Static413.method5908()) {
				throw new RuntimeException("");
			} else if (Static560.method7781("jagdx")) {
				@Pc(19) Class local19 = Class.forName("Class90_Sub3_Sub2");
				@Pc(58) Method local58 = local19.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("Interface2"), Class.forName("Class248"), Class.forName("java.lang.Integer"));
				return (Class90) local58.invoke(null, arg2, arg1, arg3, Integer.valueOf(arg0));
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(88) Throwable local88) {
			throw new RuntimeException("");
		}
	}
}
