import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
	public static int anInt136;

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)V")
	public static void method120(@OriginalArg(1) int arg0) {
		if (Static179.anInt4363 == 0) {
			Static78.aClass2_Sub7_Sub1_1.method1550(arg0);
		} else {
			Static53.anInt1661 = arg0;
		}
	}
}
