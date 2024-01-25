import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public static int anInt1130;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	public static int anInt1131;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
	public static int[] anIntArray102;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!us;")
	public static final Class234 aClass234_24 = new Class234(4, -1);

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[I")
	public static final int[] anIntArray101 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_14 = new Class244(57, 3);

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_1 = new Class76(14, 1);

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_2 = new Class76(15, 4);

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_3 = new Class76(16, -2);

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_4 = new Class76(17, 0);

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_5 = new Class76(18, -2);

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_6 = new Class76(20, 6);

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_7 = new Class76(21, 8);

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_8 = new Class76(22, -2);

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_9 = new Class76(23, 4);

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!fa;")
	public static final Class76 aClass76_10 = new Class76(24, -1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	public static void method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static221.anInt3917 && arg2 <= Static365.anInt6140) {
			@Pc(11) int local11 = Static97.method1633(arg3, Static272.anInt4750, Static26.anInt345);
			@Pc(19) int local19 = Static97.method1633(arg1, Static272.anInt4750, Static26.anInt345);
			Static337.method5117(arg0, local19, arg2, local11);
		}
	}
}
