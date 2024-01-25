import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
	public static int anInt7028;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V")
	public static void method5896() {
		if (Static632.anApplet2 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static632.anApplet2.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static444.method6719() / 86400000L) - 11745;
			@Pc(34) String local34 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static653.method5389(Static632.anApplet2, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(48) Throwable local48) {
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
	public static Object method5897(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static4.aBoolean4) {
			try {
				@Pc(25) Class143 local25 = (Class143) Class.forName("Class143_Sub1").getDeclaredConstructor().newInstance();
				local25.method4422(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static4.aBoolean4 = true;
			}
		}
		return arg0;
	}
}
