import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_95 = new Class186(56, 7);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static81.anInt1574 <= arg4 && arg2 <= Static99.anInt1808 && arg1 >= Static97.anInt1796 && Static85.anInt1636 >= arg3) {
			Static312.method4467(arg0, arg1, arg3, arg2, arg4);
		} else {
			Static199.method3154(arg2, arg3, arg1, arg4, arg0);
		}
	}
}
