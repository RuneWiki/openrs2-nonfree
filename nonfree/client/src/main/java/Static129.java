import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt2788;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1099 = Static120.method1824("gr-Un:");

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt2784 = 0;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1101 = Static120.method1824("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1100 = aClass80_1101;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public static int anInt2787 = 0;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1102 = Static120.method1824("<col=00ff00>");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
	public static int method1945(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!bc;I)[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] method1946(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2) {
		return Static15.method244(arg0, arg2, arg1) ? Static147.method2357() : null;
	}
}
