import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_6 = new Class252(33, 4);

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)Z")
	public static boolean method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
