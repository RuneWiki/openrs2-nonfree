import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_18 = new Class126(9, 6);

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
	public static int anInt1418 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIB)Z")
	public static boolean method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static388.method5659(arg1, arg0) || Static460.method6619(arg1, arg0);
	}
}
