import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!o", name = "S", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array5;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "Lclient!af;")
	public static final Class5 aClass5_37 = new Class5(64);

	@OriginalMember(owner = "client!o", name = "P", descriptor = "[I")
	public static final int[] anIntArray359 = new int[32768];

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
	public static int anInt2695 = -1;

	@OriginalMember(owner = "client!o", name = "T", descriptor = "I")
	public static int anInt2696 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!rd;I)V")
	public static void method1860(@OriginalArg(0) Class80 arg0) {
		if (Static58.aClass61_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class80 local13 = Static116.aClass80_1744.method2435(Static58.aClass61_1.anApplet1);
			@Pc(19) Class80 local19 = Static89.aClass80_742.method2435(Static58.aClass61_1.anApplet1);
			@Pc(44) Class80 local44 = Static154.method2467(new Class80[] { local13, Static164.aClass80_1417, arg0, Static84.aClass80_1649, local19 });
			if (arg0.method2462() == 0) {
				local44 = Static154.method2467(new Class80[] { local44, Static116.aClass80_1746 });
			} else {
				local44 = Static154.method2467(new Class80[] { local44, Static94.aClass80_811, Static11.method217(Static86.method1251() + 94608000000L), Static177.aClass80_1532, Static135.method2052(94608000L) });
			}
			Static154.method2467(new Class80[] { Static38.aClass80_310, local44, Static165.aClass80_1421 }).method2430(Static58.aClass61_1.anApplet1);
		} catch (@Pc(120) Throwable local120) {
		}
	}
}
