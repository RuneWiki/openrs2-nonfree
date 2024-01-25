import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static610 {

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_298 = new Class194(42, 6);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLclient!uu;)V")
	public static void method8346(@OriginalArg(1) Class343 arg0) {
		Static408.aClass343_192 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)Z")
	public static boolean method8361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static221.method8615(arg1, arg0) & Static281.method4576(arg0, arg1);
	}
}
