import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static541 {

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIZIII)V")
	public static void method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((arg2 ? Static58.aClass6_Sub17_Sub1_1.anInt9288 : Static58.aClass6_Sub17_Sub1_1.anInt9279) != 0 && arg1 != 0 && Static300.anInt5490 < 50 && arg4 != -1) {
			Static486.aClass152Array1[Static300.anInt5490++] = new Class152((byte) (arg2 ? 3 : 2), arg4, arg1, arg3, arg0, 0);
		}
	}
}
