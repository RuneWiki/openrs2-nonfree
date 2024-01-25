import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "Lclient!sca;")
	public static Class325 aClass325_1;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
	public static int anInt959 = 1;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_17 = new Class156(9, -1);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	public static void method973() {
		if (!Static421.aBoolean472) {
			return;
		}
		@Pc(14) Class238 local14 = Static333.method5035(Static516.anInt8202, Static14.anInt171);
		if (local14 != null && local14.anObjectArray18 != null) {
			@Pc(25) Class5_Sub24 local25 = new Class5_Sub24();
			local25.aClass238_6 = local14;
			local25.anObjectArray2 = local14.anObjectArray18;
			Static247.method3957(local25);
		}
		Static421.aBoolean472 = false;
		Static586.anInt9462 = -1;
		Static268.anInt4795 = -1;
		if (local14 != null) {
			Static333.method5032(local14);
		}
	}
}
