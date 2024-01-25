import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!po", name = "ib", descriptor = "F")
	public static float aFloat187 = 1.0F;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "(I)V")
	public static void method6789() {
		if (Static645.anApplet2 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static645.anApplet2.getParameter("cookiehost");
			@Pc(19) int local19 = (int) (Static521.method7499() / (long) 86400000) - 11745;
			@Pc(31) String local31 = "usrdob=" + local19 + "; version=1; path=/; domain=" + local10;
			Static682.method5124("document.cookie=\"" + local31 + "\"", Static645.anApplet2);
		} catch (@Pc(45) Throwable local45) {
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BB)C")
	public static char method6790(@OriginalArg(0) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local15, 16) + " provided");
		}
		if (local15 >= 128 && local15 < 160) {
			@Pc(48) char local48 = Static571.aCharArray5[local15 - 128];
			if (local48 == '\u0000') {
				local48 = '?';
			}
			local15 = local48;
		}
		return (char) local15;
	}
}
