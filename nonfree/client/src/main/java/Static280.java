import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	public static void method4434() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static423.anInt7844 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4435(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 2);
		local8.method6968();
		local8.aString172 = arg1;
	}
}
