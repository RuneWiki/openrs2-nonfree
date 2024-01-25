import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_131 = new Class40("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!st", name = "i", descriptor = "S")
	public static short aShort101 = 205;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)Z")
	public static boolean method6388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) boolean local20 = (arg1 & 0x37) == 0 ? Static404.method5867(arg1, arg0) : Static293.method4902(arg1, arg0);
		return local20 | Static77.method4917(arg0, arg1) | (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!ae;ZZLjava/lang/String;I)V")
	public static void method6390(@OriginalArg(0) Class9 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		if (!arg1) {
			Static166.method2947(arg3, arg0, 3);
			return;
		}
		@Pc(30) String local30;
		if (Static9.aString8.startsWith("win") && Static9.anInt148 != 3) {
			local30 = null;
			if (arg0.anApplet1 != null) {
				local30 = arg0.anApplet1.getParameter("haveie6");
			}
			if (local30 == null || !local30.equals("1")) {
				@Pc(50) Class83 local50 = Static166.method2947(arg3, arg0, 0);
				Static491.aString75 = arg3;
				Static22.aClass83_4 = local50;
				Static327.aClass9_19 = arg0;
				return;
			}
		}
		if (Static9.aString8.startsWith("mac")) {
			local30 = null;
			if (arg0.anApplet1 != null) {
				local30 = arg0.anApplet1.getParameter("havefirefox");
			}
			if (local30 != null && local30.equals("1") && arg2) {
				Static166.method2947(arg3, arg0, 1);
				return;
			}
		}
		Static166.method2947(arg3, arg0, 2);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZ)Lclient!he;")
	public static Class5_Sub24 method6391(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) long local16 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class5_Sub24) Static138.aClass42_7.method1109(local16);
	}
}
