import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
	public static int anInt2702;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
	public static int anInt2700 = -1;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIIII)V")
	public static void method2308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static214.anInt7120 = arg3;
		Static486.anInt8619 = arg1;
		Static412.anInt9780 = arg2;
		Static116.anInt1992 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIII)V")
	public static void method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class279[] local3 = Static168.aClass279Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class279 local11 = local3[local5];
			if (local11 != null && local11.anInt7966 == 2) {
				Static234.method3601(local11.anInt7971, arg1 >> 1, local11.anInt7960, local11.anInt7969 * 2, arg3 >> 1, local11.anInt7961);
				if (Static10.anIntArray8[0] > -1 && Static363.anInt6671 % 20 < 10) {
					Static544.aClass71Array44[local11.anInt7965].method7775(Static10.anIntArray8[0] + arg2 - 12, Static10.anIntArray8[1] + -28 + arg0);
				}
			}
		}
	}
}
