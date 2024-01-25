import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public static int anInt4990;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_79 = new Class25(50, 8);

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!ha;")
	public static Class6_Sub15 aClass6_Sub15_6 = new Class6_Sub15(1);

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public static int anInt4989 = 0;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public static int anInt4991 = 2;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "S")
	public static short aShort68 = 205;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method4401(@OriginalArg(0) int arg0) {
		Static405.anInt6805 = 1000 / arg0;
	}
}
