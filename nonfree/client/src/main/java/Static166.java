import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static166 {

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	public static int anInt3598 = 0;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIZIII)V")
	public static void method3203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static209.anInt9659 = arg3;
		Static319.anInt5734 = arg1;
		Static425.anInt7335 = arg4;
		Static12.anInt226 = arg5;
		Static580.anInt2680 = arg0;
		if (arg2 && Static580.anInt2680 >= 100) {
			Static473.anInt7978 = Static209.anInt9659 * 512 + 256;
			Static563.anInt9436 = Static12.anInt226 * 512 + 256;
			Static569.anInt4616 = Static160.method3164(Static473.anInt7978, Static320.anInt5748, Static563.anInt9436) - Static319.anInt5734;
		}
		Static555.anInt9335 = 2;
		Static140.anInt3147 = -1;
		Static380.anInt6749 = -1;
	}
}
