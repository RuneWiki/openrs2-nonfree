import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "Lclient!wp;")
	public static Class149 aClass149_1;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIII)V")
	public static void method2300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static193.anInt6666 * arg2 >> 8;
		if (local9 != 0 && arg0 != -1) {
			Static267.method4129(local9, arg0, Static209.aClass71_50);
			Static327.aBoolean445 = true;
		}
	}
}
