import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public static int anInt3370;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
	public static int anInt3375;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	public static int anInt3377;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "Lclient!eo;")
	public static Class67 aClass67_5;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
	public static int anInt3366 = 100;

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_54 = new Class154(8);

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Z")
	public static boolean aBoolean283 = true;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)Lclient!ce;")
	public static Class34 method2927(@OriginalArg(1) int arg0) {
		@Pc(5) Class154 local5 = Static133.aClass154_44;
		@Pc(14) Class34 local14;
		synchronized (Static133.aClass154_44) {
			local14 = (Class34) Static133.aClass154_44.method4222((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static223.aClass11_87.method288(Static10.method247(arg0), Static156.method3021(arg0));
		local14 = new Class34();
		local14.anInt857 = arg0;
		if (local39 != null) {
			local14.method743(new Class4_Sub7(local39));
		}
		local14.method746();
		@Pc(60) Class154 local60 = Static133.aClass154_44;
		synchronized (Static133.aClass154_44) {
			Static133.aClass154_44.method4221((long) arg0, local14);
			return local14;
		}
	}
}
