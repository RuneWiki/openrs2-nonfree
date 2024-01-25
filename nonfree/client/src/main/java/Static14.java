import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_5 = new Class306("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[BILclient!uq;IIZI)Lclient!em;")
	public static Class73_Sub1_Sub1 method425(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122_Sub3 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean575 || Static535.method7411(arg3) && Static535.method7411(arg1)) {
			return new Class73_Sub1_Sub1(arg2, 3553, 6406, arg3, arg1, false, arg0, 6406);
		} else if (arg2.aBoolean579) {
			return new Class73_Sub1_Sub1(arg2, 34037, 6406, arg3, arg1, false, arg0, 6406);
		} else {
			return new Class73_Sub1_Sub1(arg2, 6406, arg3, arg1, Static352.method5306(arg3), Static352.method5306(arg1), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
	public static void method427() {
		Static16.anInt415 = 0;
		Static248.aClass37_30.method967();
		Static15.aBoolean16 = false;
	}
}
