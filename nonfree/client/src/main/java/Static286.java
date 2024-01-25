import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "Lclient!tg;")
	public static Class321 aClass321_2;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "[I")
	public static final int[] anIntArray266 = new int[32];

	@OriginalMember(owner = "client!kba", name = "n", descriptor = "D")
	public static double aDouble7 = -1.0D;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!ov;ZI)V")
	public static void method4976(@OriginalArg(0) Class6_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean609) {
			if (arg0.anInt7727 < 0 || Static610.method8368(arg0.anInt7723, arg0.anInt7727)) {
				if (arg1) {
					Static250.method4442((Class200) null, arg0.anInt7721, arg0.anInt7724, arg0.anInt7720, arg0.anInt7726);
				} else {
					Static49.method1564(arg0.anInt7727, arg0.anInt7721, arg0.anInt7726, arg0.anInt7729, arg0.anInt7724, arg0.anInt7720, -1, arg0.anInt7723);
				}
				arg0.method8792();
			}
		} else if (arg0.aBoolean608 && arg0.anInt7720 >= 1 && arg0.anInt7721 >= 1 && Static306.anInt6176 - 2 >= arg0.anInt7720 && Static108.anInt2930 - 2 >= arg0.anInt7721) {
			if (arg0.anInt7722 >= 0 && !Static610.method8368(arg0.anInt7730, arg0.anInt7722)) {
				return;
			}
			if (arg1) {
				Static250.method4442(arg0.aClass200_1, arg0.anInt7721, arg0.anInt7724, arg0.anInt7720, arg0.anInt7726);
			} else {
				Static49.method1564(arg0.anInt7722, arg0.anInt7721, arg0.anInt7726, arg0.anInt7728, arg0.anInt7724, arg0.anInt7720, -1, arg0.anInt7730);
			}
			arg0.aBoolean608 = false;
			if (!arg1 && arg0.anInt7727 == arg0.anInt7722 && arg0.anInt7727 == -1) {
				arg0.method8792();
				return;
			}
			if (!arg1 && arg0.anInt7722 == arg0.anInt7727 && arg0.anInt7729 == arg0.anInt7728 && arg0.anInt7723 == arg0.anInt7730) {
				arg0.method8792();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
	public static void method4977(@OriginalArg(1) int arg0) {
		Static191.anInt4141 = arg0;
		Static135.aClass94_14.method2952();
	}
}
