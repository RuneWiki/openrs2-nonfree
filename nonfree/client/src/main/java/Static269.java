import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
	public static final int anInt5574 = 1339;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_95 = new Class133(98, -1);

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
	public static int anInt5577 = 0;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII)V")
	public static void method4697(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) Static226.aClass90_10.method2326(); local10 != null; local10 = (Class4_Sub2) Static226.aClass90_10.method2325()) {
			if (local10.anInt3708 <= Static223.anInt4829) {
				local10.method7407();
			} else {
				Static86.method1760((local10.anInt3713 << 9) + 256, local10.anInt3709 * 2, arg1 >> 1, local10.anInt3711, arg2 >> 1, (local10.anInt3707 << 9) + 256);
				Static294.aClass59_2.method7265(local10.anInt3710 | 0xFF000000, Static447.anIntArray695[1] + arg0, local10.aString32, 0, arg3 + Static447.anIntArray695[0]);
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IB)V")
	public static void method4698(@OriginalArg(0) int arg0) {
		Static103.method2054();
		Static69.method1406();
		Static547.method7812(true, arg0);
		Static124.method7287(Static19.aClass161_7, Static62.aClass161_105, Static121.aClass5_7);
		Static463.method6911(Static19.aClass161_7, Static121.aClass5_7);
		Static484.method7143();
		Static315.method5108(Static122.aClass119Array8);
		Static403.method6133();
		Static467.method6980();
		if (Static512.anInt8932 == 2) {
			Static333.method5283(3);
		} else if (Static512.anInt8932 == 6) {
			Static333.method5283(7);
		} else if (Static512.anInt8932 == 9) {
			Static333.method5283(10);
			return;
		} else if (Static512.anInt8932 == 1) {
			Static195.method3708(Static19.aClass161_7, Static121.aClass5_7);
			return;
		}
	}
}
