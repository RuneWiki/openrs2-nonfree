import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_24 = new Class222(4);

	@OriginalMember(owner = "client!hr", name = "gb", descriptor = "I")
	public static int anInt4028 = 1;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(B)V")
	public static void method3242() {
		for (@Pc(6) Class1_Sub51 local6 = (Class1_Sub51) Static310.aClass353_32.method7677(); local6 != null; local6 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			if (Static479.method6516(local6.anInt9638)) {
				Static219.method5964(local6);
			}
		}
		if (Static337.anInt8004 == 1) {
			Static497.method4933();
			return;
		}
		Static14.method148(Static518.anInt8770, Static330.anInt5532, Static110.anInt2169, Static274.anInt307);
		@Pc(54) int local54 = Static373.aClass334_13.method7354(Static568.aClass351_28.method7651(Static307.anInt5279));
		for (@Pc(59) Class1_Sub51 local59 = (Class1_Sub51) Static310.aClass353_32.method7677(); local59 != null; local59 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			@Pc(65) int local65 = Static385.method5301(local59);
			if (local65 > local54) {
				local54 = local65;
			}
		}
		Static110.anInt2169 = Static337.anInt8004 * 16 + (Static244.aBoolean336 ? 26 : 22);
		Static274.anInt307 = local54 + 8;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!rda;B)Z")
	public static boolean method3243(@OriginalArg(0) Interface19 arg0) {
		@Pc(10) Class95 local10 = Static518.aClass96_4.method1925(arg0.method7640());
		if (local10.anInt2421 == -1) {
			return true;
		} else {
			@Pc(22) Class281 local22 = Static521.aClass257_4.method5590(local10.anInt2421);
			return local22.anInt7676 == -1 ? true : local22.method6110();
		}
	}
}
