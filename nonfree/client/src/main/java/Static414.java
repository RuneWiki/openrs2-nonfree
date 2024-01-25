import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!uq", name = "mc", descriptor = "I")
	public static int anInt6715 = -1;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method5534(@OriginalArg(1) Class39 arg0) {
		if (Static134.aClass181_22.method4108() == 0) {
			return;
		}
		@Pc(30) Class1_Sub15 local30;
		if (Static143.anInt2766 == 0) {
			for (local30 = (Class1_Sub15) Static134.aClass181_22.method4112(); local30 != null; local30 = (Class1_Sub15) Static134.aClass181_22.method4104()) {
				Static165.aClass19_1.method556(arg0, local30.anInt1842, local30.anInt1843, arg0, local30.aBoolean110 ? Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1 : null, local30.anInt1845, local30.anInt1846, false, false, Static26.aClass71_1, local30.anInt1841);
				local30.method6020();
			}
			Static319.method3515();
			return;
		}
		if (Static177.aClass39_3 == null) {
			@Pc(79) Canvas local79 = new Canvas();
			local79.setSize(36, 32);
			Static177.aClass39_3 = Static459.method4522(Static378.anInterface4_9, 0, Static77.aClass180_1, local79, 0);
			Static157.aClass71_6 = Static177.aClass39_3.method4564(Static41.method755(Static374.anInt6118, Static319.aClass246_127), Static461.method1446(Static345.aClass246_187, Static374.anInt6118));
		}
		for (local30 = (Class1_Sub15) Static134.aClass181_22.method4112(); local30 != null; local30 = (Class1_Sub15) Static134.aClass181_22.method4104()) {
			Static165.aClass19_1.method556(Static177.aClass39_3, local30.anInt1842, local30.anInt1843, arg0, local30.aBoolean110 ? Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1 : null, local30.anInt1845, local30.anInt1846, false, false, Static157.aClass71_6, local30.anInt1841);
			local30.method6020();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5543(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		Static193.method2984(Static111.aClass179_26);
		Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(arg0) + 1);
		Static92.aClass1_Sub5_Sub1_1.method5385(arg0);
		Static92.aClass1_Sub5_Sub1_1.method5381(arg1);
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(III)Z")
	public static boolean method5547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static223.method3420(arg0, arg1) | (arg0 & 0x800) != 0 || Static408.method5470(arg0, arg1);
	}
}
