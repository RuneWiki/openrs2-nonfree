import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_87 = new Class344(33, 3);

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
	public static int anInt9232 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)V")
	public static void method7080(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg0, 5);
		local8.method2302();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)V")
	public static void method7087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static289.anInt5872 = 0;
		Static160.anInt3347 = arg0;
		Static61.anInt1627 = arg1;
		Static292.anInt5983 = 0;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)V")
	public static void method7088() {
		if (Static294.aClass15_2 != null) {
			Static294.aClass15_2.method5351();
		}
		if (Static364.aClass15_3 != null) {
			Static364.aClass15_3.method5351();
		}
	}
}
