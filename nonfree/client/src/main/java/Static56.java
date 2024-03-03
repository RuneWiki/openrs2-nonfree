import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 8)
	public static void method886() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Class141.anInt3695 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "()V", line = 50)
	public static void method890() {
		for (@Pc(1) int local1 = 0; local1 < Class245.anInt7064; local1++) {
			@Pc(6) Class11_Sub5 local6 = Static91.aClass11_Sub5Array1[local1];
			Static308.method5660(local6);
			Static91.aClass11_Sub5Array1[local1] = null;
		}
		Class245.anInt7064 = 0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V", line = 74)
	public static void method891(@OriginalArg(1) boolean arg0) {
		Static121.method2437(Static161.anInt3295, Class97.anInt2592, arg0, Static231.anInt4656);
	}
}
