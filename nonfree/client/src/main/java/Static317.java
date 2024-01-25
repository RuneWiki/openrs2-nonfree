import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_101 = new Class231("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_114 = new Class186(92, -1);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[BII)I")
	public static int method5229(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local7 = Class197.anIntArray448[(arg1[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public static void method5230() {
		if (!Static49.method904()) {
			return;
		}
		if (Static183.aStringArray40 == null) {
			Static413.method5605();
		}
		Static411.aBoolean471 = true;
		Static42.anInt908 = 0;
		try {
			Static15.aClipboard1 = Static160.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(20) Exception local20) {
		}
	}
}
