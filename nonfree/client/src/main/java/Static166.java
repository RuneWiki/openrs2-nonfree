import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fs", name = "Vc", descriptor = "Lclient!wu;")
	public static Class384 aClass384_43;

	@OriginalMember(owner = "client!fs", name = "td", descriptor = "Lclient!ga;")
	public static final Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!fs", name = "ud", descriptor = "Lclient!qj;")
	public static final Class288 aClass288_5 = new Class288();

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!ee;Z)Lclient!eja;")
	public static Class96_Sub1 method2526(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) Class96 local7 = Static607.method8453(arg0);
		@Pc(11) int local11 = arg0.method8631();
		@Pc(15) int local15 = arg0.method8631();
		@Pc(28) int local28 = arg0.method8631();
		@Pc(32) int local32 = arg0.method8631();
		@Pc(36) int local36 = arg0.method8631();
		@Pc(40) int local40 = arg0.method8631();
		return new Class96_Sub1(local7.aClass204_13, local7.aClass288_13, local7.anInt9354, local7.anInt9359, local7.anInt9360, local7.anInt9362, local7.anInt9357, local7.anInt9361, local7.anInt9355, local11, local15, local28, local32, local36, local40);
	}

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "(I)V")
	public static void method2528() {
		if (Static469.anInt7883 == 9) {
			Static214.method3254(5);
		} else if (Static469.anInt7883 == 5 || Static469.anInt7883 == 6) {
			Static214.method3254(3);
		} else if (Static469.anInt7883 == 12) {
			Static214.method3254(3);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!ha;IILclient!ro;)V")
	public static void method2532(@OriginalArg(1) Class126 arg0, @OriginalArg(4) Class306 arg1) {
		Static173.aClass306_13.method7315();
		if (Static243.aBoolean335) {
			return;
		}
		for (@Pc(16) Class5_Sub39 local16 = (Class5_Sub39) arg1.method7313(); local16 != null; local16 = (Class5_Sub39) arg1.method7301()) {
			@Pc(24) Class72 local24 = Static203.aClass273_2.method6529(local16.anInt7217);
			if (Static364.method5690(local24)) {
				@Pc(36) boolean local36 = Static54.method855(local24, arg0, local16);
				if (local36) {
					Static159.method2411(local16, arg0, local24);
				}
			}
		}
	}
}
