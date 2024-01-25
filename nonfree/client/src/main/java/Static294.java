import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!me", name = "d", descriptor = "B")
	public static byte aByte71;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public static void method5133(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub2_Sub2 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class7 local8 = Static411.aClass7Array12[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static420.anInt7323; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static501.anInt9458; local15++) {
						local1 = local8.X(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static275.anInt5260;
							@Pc(32) int local32 = local12 << Static275.anInt5260;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class7 local41 = Static411.aClass7Array12[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ba(local15, local12) - local41.ba(local15, local12);
									@Pc(67) int local67 = local8.ba(local15 + 1, local12) - local41.ba(local15 + 1, local12);
									@Pc(85) int local85 = local8.ba(local15 + 1, local12 + 1) - local41.ba(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ba(local15, local12 + 1) - local41.ba(local15, local12 + 1);
									local41.ya(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!os;I)Lclient!bb;")
	public static Class22_Sub1 method5134(@OriginalArg(0) Class1_Sub17 arg0) {
		return new Class22_Sub1(arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4447(), arg0.method4486(), arg0.method4486(), arg0.method4487());
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	public static void method5135(@OriginalArg(1) int arg0) {
		Static374.anInt6710 = arg0;
		@Pc(13) Class277 local13 = Static332.aClass277_47;
		synchronized (Static332.aClass277_47) {
			Static332.aClass277_47.method7019();
		}
	}
}
