import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!ffa", name = "F", descriptor = "Lclient!nba;")
	public static Class245 aClass245_1;

	@OriginalMember(owner = "client!ffa", name = "G", descriptor = "Lclient!tb;")
	public static Class49 aClass49_8;

	@OriginalMember(owner = "client!ffa", name = "L", descriptor = "Lclient!uu;")
	public static final Class369 aClass369_6 = new Class369(7, 2);

	@OriginalMember(owner = "client!ffa", name = "J", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_48 = new Class322(97, -1);

	@OriginalMember(owner = "client!ffa", name = "D", descriptor = "Lclient!fs;")
	public static final Class121 aClass121_2 = new Class121("game3", "Game 3", 2);

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZIII)V")
	public static void method3116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg2 >= Static398.anInt6878 && arg3 + arg2 <= Static8.anInt136 && Static605.anInt9561 <= arg1 - arg2 && Static223.anInt4380 >= arg2 + arg1) {
			Static266.method4535(arg0, arg2, arg1, arg3);
		} else {
			Static48.method6010(arg3, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(CB)Z")
	public static boolean method3118(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
