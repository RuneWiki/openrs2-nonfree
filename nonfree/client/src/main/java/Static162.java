import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int anInt1247 = 0;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt1251 = 0;

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!sg;")
	public static Class77 aClass77_505 = Static146.method2172(" )2>");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)I")
	public static int method884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
	public static void method892() {
		aClass77_505 = null;
	}
}
