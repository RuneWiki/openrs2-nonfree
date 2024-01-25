import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static152 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public static int anInt2590 = 999999;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)V")
	public static void method2249(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static453.aClass136_Sub1_1.anInt4442 != 0 && arg3 != 0 && Static234.anInt4174 < 50 && arg0 != -1) {
			Static249.aClass266Array1[Static234.anInt4174++] = new Class266((byte) 2, arg0, arg3, arg1, arg2, 0);
		}
	}
}
