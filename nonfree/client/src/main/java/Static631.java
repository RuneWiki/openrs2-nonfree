import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static631 {

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_53 = new Class307(16);

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
	public static int anInt10399 = 0;

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "Z")
	public static boolean aBoolean871 = true;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)Z")
	public static boolean method8541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static63.method1346(arg0, arg1) | Static191.method3803(arg1, arg0) | Static487.method7149(arg1, arg0)) & Static78.method1880(arg1, arg0);
	}
}
