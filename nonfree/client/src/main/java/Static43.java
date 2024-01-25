import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt2553;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!sc;")
	public static Class179 aClass179_3;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_86 = new Class221(8, 3);

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public static int anInt2554 = 0;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public static int anInt2555 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public static void method2355(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub9_Sub16 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class105 local8 = Static101.aClass105Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static63.anInt1129; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static344.anInt6692; local15++) {
						local1 = local8.method4445(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static325.anInt6336;
							@Pc(32) int local32 = local12 << Static325.anInt6336;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class105 local41 = Static101.aClass105Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4453(local15, local12) - local41.method4453(local15, local12);
									@Pc(67) int local67 = local8.method4453(local15 + 1, local12) - local41.method4453(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4453(local15 + 1, local12 + 1) - local41.method4453(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4453(local15, local12 + 1) - local41.method4453(local15, local12 + 1);
									local41.method4448(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)I")
	public static int method2356(@OriginalArg(0) int arg0) {
		if (Static129.aClass117_2 != null) {
			Static129.aClass117_2.method3278();
			Static129.aClass117_2 = null;
		}
		Static366.anInt4510++;
		if (Static366.anInt4510 > 4) {
			Static366.anInt4510 = 0;
			Static54.anInt976 = 0;
			return arg0;
		}
		Static54.anInt976 = 0;
		if (Static35.anInt6892 == Static134.anInt2875) {
			Static134.anInt2875 = Static15.anInt269;
		} else {
			Static134.anInt2875 = Static35.anInt6892;
		}
		return -1;
	}
}
