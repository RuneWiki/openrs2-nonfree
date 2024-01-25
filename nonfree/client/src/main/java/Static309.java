import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!os", name = "t", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_37 = new Class77(260);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!hm;Lclient!za;)V")
	public static void method4098(@OriginalArg(1) Class107 arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(31) boolean local31 = Static285.aClass226_2.method4787(arg0.anInt2586, arg0.anInt2645, arg1, arg0.anInt2631, arg0.anInt2641 | 0xFF000000, arg0.aBoolean263 ? Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1 : null, arg0.anInt2587) == null;
		if (local31) {
			Static285.aClass14_29.method205(new Class1_Sub34(arg0.anInt2631, arg0.anInt2586, arg0.anInt2645, arg0.anInt2641 | 0xFF000000, arg0.anInt2587, arg0.aBoolean263));
			Static260.method3633(arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(II)Z")
	public static boolean method4100(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZZI)V")
	public static void method4101(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static292.anInt4883--;
			if (Static292.anInt4883 == 0) {
				Static244.anIntArray44 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static23.anInt347--;
		if (Static23.anInt347 == 0) {
			Static134.anIntArray182 = null;
			return;
		}
	}
}
