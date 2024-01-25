import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "Lclient!ho;")
	public static Class163 aClass163_5;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public static int anInt10204;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!hh;")
	public static final Class155 aClass155_60 = new Class155(1);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	public static void method8797(@OriginalArg(1) int arg0) {
		Static314.anInt5452 = arg0;
		Static688.aClass359_71.method8507();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Z")
	public static boolean method8799() {
		return Static687.aBoolean733;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8800(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method8801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static398.anInt6878 <= arg4 && Static8.anInt136 >= arg4 && arg6 >= Static398.anInt6878 && Static8.anInt136 >= arg6 && Static398.anInt6878 <= arg5 && arg5 <= Static8.anInt136 && arg3 >= Static398.anInt6878 && arg3 <= Static8.anInt136 && arg1 >= Static605.anInt9561 && arg1 <= Static223.anInt4380 && arg2 >= Static605.anInt9561 && arg2 <= Static223.anInt4380 && arg8 >= Static605.anInt9561 && Static223.anInt4380 >= arg8 && arg7 >= Static605.anInt9561 && arg7 <= Static223.anInt4380) {
			Static114.method2146(arg2, arg3, arg4, arg0, arg5, arg7, arg8, arg6, arg1);
		} else {
			Static587.method8172(arg4, arg6, arg5, arg1, arg0, arg2, arg7, arg8, arg3);
		}
	}
}
