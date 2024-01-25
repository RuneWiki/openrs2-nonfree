import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "Lclient!bu;")
	public static final Class30 aClass30_2 = new Class30("WTWIP", 3);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIII)V")
	public static void method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class135[] local3 = Static133.aClass135Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Class135 local13 = local3[local5];
			if (local13 != null && local13.anInt3824 == 2) {
				Static116.method1850(local13.anInt3814, arg0 >> 1, local13.anInt3818, local13.anInt3821 * 2, arg1 >> 1, local13.anInt3822);
				if (Static224.anIntArray240[0] > -1 && Static236.anInt4213 % 20 < 10) {
					Static94.aClass6Array5[local13.anInt3816].method5894(arg3 + Static224.anIntArray240[0] - 12, Static224.anIntArray240[1] + -28 + arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	public static void method596() {
		Static26.method350();
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
	public static void method597() {
		if (Static278.aClass232_5 == null) {
			return;
		}
		if (Static278.aClass232_5.anInt6402 == 1) {
			Static278.aClass232_5 = null;
			return;
		}
		if (Static278.aClass232_5.anInt6402 == 2) {
			Static456.method5943(Static161.aClass83_1, Static113.aString22, 2);
			Static278.aClass232_5 = null;
			return;
		}
	}
}
