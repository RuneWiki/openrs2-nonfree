import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static328 {

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_65 = new Class179(4, 6);

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)Z")
	public static boolean method4405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static515.method7209(arg0, arg1) | (arg1 & 0x60000) != 0 || Static293.method4047(arg0, arg1) || Static639.method8588(arg0, arg1);
	}
}
