import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fw", name = "W", descriptor = "I")
	public static int anInt2463;

	@OriginalMember(owner = "client!fw", name = "M", descriptor = "I")
	public static int anInt2456 = 0;

	@OriginalMember(owner = "client!fw", name = "P", descriptor = "[I")
	public static final int[] anIntArray173 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ)V")
	public static void method2052(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 11);
		local8.method4710();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(CI)Z")
	public static boolean method2053(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
