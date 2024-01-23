import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	public static int anInt4367;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "S")
	public static short aShort31 = 256;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1155 = Static231.method3737(")3runescape)3com");

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
	public static long aLong155 = 0L;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1156 = Static231.method3737(" (X");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I")
	public static int method3232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static3.method2853(arg1 - 1, arg0 + -1) + Static3.method2853(arg1 + 1, arg0 - 1) + Static3.method2853(arg1 + -1, arg0 + 1) + Static3.method2853(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static3.method2853(arg1 - 1, arg0) + Static3.method2853(arg1 + 1, arg0) + Static3.method2853(arg1, arg0 - 1) + Static3.method2853(arg1, arg0 + 1);
		@Pc(81) int local81 = Static3.method2853(arg1, arg0);
		return local81 / 4 + local76 / 8 + local46 / 16;
	}
}
