import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public static int anInt2301;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "[Lclient!gg;")
	public static Class9_Sub4[] aClass9_Sub4Array3;

	@OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
	public static int anInt2305;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
	public static int anInt2304 = 0;

	@OriginalMember(owner = "client!cfa", name = "o", descriptor = "[I")
	public static final int[] anIntArray74 = new int[14];

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
	public static void method2006() {
		Static97.aClass130_1.method7417();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static162.aLongArray4[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static476.aLongArray8[local22] = 0L;
		}
		Static2.anInt5126 = 0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IB)I")
	public static int method2008(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
