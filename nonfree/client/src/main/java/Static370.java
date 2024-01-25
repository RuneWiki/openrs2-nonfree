import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "[I")
	public static int[] anIntArray541;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_86 = new Class160(72, -1);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IZIZII)V")
	public static void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((arg1 ? Static480.aClass6_Sub37_Sub1_1.anInt6049 : Static480.aClass6_Sub37_Sub1_1.anInt6047) != 0 && arg4 != 0 && Static231.anInt3927 < 50 && arg0 != -1) {
			Static103.aClass172Array7[Static231.anInt3927++] = new Class172((byte) (arg1 ? 3 : 2), arg0, arg4, arg2, arg3, 0);
		}
	}
}
