import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "Z")
	public static boolean aBoolean739 = true;

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)V")
	public static void method8395() {
		for (@Pc(9) int local9 = 0; local9 < Static37.anInt839; local9++) {
			@Pc(21) int local21 = Static431.method6190(Static37.anInt839, local9 + Static218.anInt4139) * Static153.anInt3033;
			for (@Pc(23) int local23 = 0; local23 < Static153.anInt3033; local23++) {
				@Pc(34) int local34 = local21 + Static431.method6190(Static153.anInt3033, Static146.anInt2953 + local23);
				if (Static677.anInt10887 == Static9.anIntArray17[local34]) {
					Static534.anInterface26Array1[local34].method9017(0, 0, Static336.anInt5533, Static9.anInt105, local23 * Static336.anInt5533, Static9.anInt105 * local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)V")
	public static void method8396(@OriginalArg(0) int arg0) {
		Static107.anInt2222 = arg0;
	}
}
