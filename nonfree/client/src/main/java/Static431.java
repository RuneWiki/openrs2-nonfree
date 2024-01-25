import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static431 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
	public static int[] anIntArray484;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_218 = new Class151(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)Z")
	public static boolean method5423(@OriginalArg(0) int arg0) {
		Static41.anInt752 = arg0 + 1 & 0xFFFF;
		Static189.aBoolean229 = true;
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)V")
	public static void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static271.anInt4271 <= arg3 && arg1 <= Static13.anInt263 && arg2 >= Static74.anInt1413 && Static149.anInt7384 >= arg4) {
			Static317.method4099(arg1, arg2, arg3, arg4, arg0);
		} else {
			Static369.method3953(arg3, arg1, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
	public static void method5425() {
		Static19.anInt396 = 0;
		Static50.aClass254_8.method5438();
		Static263.aBoolean329 = false;
	}
}
