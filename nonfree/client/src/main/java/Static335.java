import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
	public static int anInt6499 = 0;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString254 = "skill: ";

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public static void method5586() {
		@Pc(1) Class37 local1 = Static50.aClass37_24;
		synchronized (Static50.aClass37_24) {
			Static50.aClass37_24.method919();
		}
		local1 = Static203.aClass37_65;
		synchronized (Static203.aClass37_65) {
			Static203.aClass37_65.method919();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5587(@OriginalArg(1) String arg0) {
		Static306.method5295(0, 0, "", arg0, "");
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	public static void method5588() {
		Static25.aClass37_11.method919();
	}
}
