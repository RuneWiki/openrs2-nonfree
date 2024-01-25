import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static464 {

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	public static int anInt7952;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString102;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "Z")
	public static boolean aBoolean601 = false;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
	public static boolean method6665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static670.method8772(arg1, arg0) & Static115.method2122(arg0, arg1);
	}
}
