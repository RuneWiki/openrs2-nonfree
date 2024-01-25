import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vr", name = "M", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_130 = new Class15(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!vr", name = "N", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(III)Z")
	public static boolean method5767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!pc;ZZLjava/lang/String;)V")
	public static void method5768(@OriginalArg(1) Class196 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg2) {
			Static34.method1702(arg3, arg0, 3);
			return;
		}
		@Pc(29) String local29;
		if (Static300.aString49.startsWith("win") && Static300.anInt4900 != 3) {
			local29 = null;
			if (arg0.anApplet1 != null) {
				local29 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local29 == null || !local29.equals("1")) {
				@Pc(49) Class45 local49 = Static34.method1702(arg3, arg0, 0);
				Static45.aClass196_3 = arg0;
				Static281.aString42 = arg3;
				Static65.aClass45_3 = local49;
				return;
			}
		}
		if (Static300.aString49.startsWith("mac")) {
			local29 = null;
			if (arg0.anApplet1 != null) {
				local29 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local29 != null && local29.equals("1") && arg1) {
				Static34.method1702(arg3, arg0, 1);
				return;
			}
		}
		Static34.method1702(arg3, arg0, 2);
	}
}
