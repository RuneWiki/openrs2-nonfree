import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!na", name = "N", descriptor = "Lclient!qs;")
	public static Class211 aClass211_69;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_5 = new Class220(1, 2, 2, 0);

	@OriginalMember(owner = "client!na", name = "H", descriptor = "I")
	public static int anInt5071 = 0;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "I")
	public static int anInt5075 = 0;

	@OriginalMember(owner = "client!na", name = "O", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_118 = new Class263(97, 6);

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
	public static void method3899(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub11 local12 = Static248.method3707(arg0, 11);
		local12.method2954();
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	public static void method3900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass30_Sub4_2 != null) {
			local7.aClass30_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)V")
	public static void method3902() {
		if (Static12.aClass34_Sub1_1.method5471(Static262.anInt2805) || Static313.anInt5847 == Static426.anInt1486) {
			Static20.method423(Static30.aClass106_3);
			if (Static13.anInt3417 != Static426.anInt1486) {
				Static257.method3816();
			}
		} else {
			Static149.method2372(10, false, Static76.anInt1937, Static150.anInt3209);
		}
	}
}
