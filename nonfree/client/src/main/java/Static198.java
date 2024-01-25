import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static198 {

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public static int anInt3925;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_19 = new Class8();

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_59 = new Class286(22, 7);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)Z")
	public static boolean method3258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static80.method1266(arg0, arg1) || Static222.method3494(arg1, arg0);
	}
}
