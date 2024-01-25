import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static241 {

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
	public static int anInt4307;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_74 = new Class237(40, 11);

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	public static int anInt4308 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(CZ)Z")
	public static boolean method3554(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Z")
	public static boolean method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static428.method5727(arg0, arg1) || Static300.method4296(arg0, arg1);
	}
}
