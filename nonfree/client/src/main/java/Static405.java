import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
	public static int anInt7184;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V")
	public static void method5930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static140.aClass6_Sub48_Sub1_1.anInt8997 != 0 && arg3 != 0 && Static559.anInt9221 < 50 && arg1 != -1) {
			Static546.aClass39Array1[Static559.anInt9221++] = new Class39((byte) 1, arg1, arg3, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)J")
	public static long method5931() {
		return Static25.aClass43_1.method3557();
	}
}
