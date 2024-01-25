import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static592 {

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "[Lclient!i;")
	public static Class67[] aClass67Array4;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static72.aClass2_Sub12_Sub1_1.anInt1916 != 0 && arg3 != 0 && Static245.anInt4559 < 50 && arg1 != -1) {
			Static515.aClass351Array1[Static245.anInt4559++] = new Class351((byte) 1, arg1, arg3, arg0, arg4, arg2);
		}
	}
}
