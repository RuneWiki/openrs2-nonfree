import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public static void method357() {
		if (!Static396.method5463()) {
			return;
		}
		if (Static20.aStringArray8 == null) {
			Static252.method3492();
		}
		Static300.anInt5409 = 0;
		Static162.aBoolean186 = true;
		try {
			Static38.aClipboard1 = Static94.aClient2.getToolkit().getSystemClipboard();
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!mn;I)Lclient!aq;")
	public static Class15 method358(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1) {
		@Pc(8) byte[] local8 = arg1.method3664(arg0);
		return local8 == null ? null : new Class15(local8);
	}
}
