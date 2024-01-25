import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_220 = new Class196(107, 0);

	@OriginalMember(owner = "client!nw", name = "D", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_11 = new Class307(11, 0, 1, 2);

	@OriginalMember(owner = "client!nw", name = "F", descriptor = "I")
	public static final int anInt7016 = 1409;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(Z)Z")
	public static boolean method5963() {
		try {
			@Pc(7) Class33 local7 = new Class33();
			@Pc(12) byte[] local12 = local7.method504(Static313.aByteArray55);
			Static47.method625(local12);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZLclient!kj;ZLjava/lang/String;I)V")
	public static void method5967(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		if (!arg0) {
			Static362.method5337(3, arg1, arg3);
			return;
		}
		@Pc(22) String local22;
		if (Static308.aString53.startsWith("win") && arg1.aBoolean384) {
			local22 = null;
			if (Static285.anApplet5 != null) {
				local22 = Static285.anApplet5.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(40) Class297 local40 = Static362.method5337(0, arg1, arg3);
				Static193.aString31 = arg3;
				Static509.aClass202_6 = arg1;
				Static612.aClass297_9 = local40;
				return;
			}
		}
		if (Static308.aString53.startsWith("mac")) {
			local22 = null;
			if (Static285.anApplet5 != null) {
				local22 = Static285.anApplet5.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg2) {
				Static362.method5337(1, arg1, arg3);
				return;
			}
		}
		Static362.method5337(2, arg1, arg3);
	}
}
