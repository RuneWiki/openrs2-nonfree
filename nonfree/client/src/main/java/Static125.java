import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
	public static int anInt2898;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	public static void method2514() {
		Static198.aClass211_25.method5538(50);
		Static402.aClass211_65.method5538(50);
		Static228.aClass211_33.method5538(50);
		Static237.aClass211_36.method5538(50);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)Z")
	public static boolean method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static434.method6852(arg0, arg1) || Static577.method8260(arg1, arg0);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)Lclient!kq;")
	public static Class3_Sub32 method2516() {
		if (Static87.aClass183_42 == null || Static282.aClass327_1 == null) {
			return null;
		}
		Static282.aClass327_1.method7866(Static87.aClass183_42);
		@Pc(18) Class3_Sub32 local18 = (Class3_Sub32) Static282.aClass327_1.method7867();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class70 local33 = Static87.aClass10_4.method400(local18.anInt5918);
			return local33 != null && local33.aBoolean182 && local33.method2132(Static87.anInterface15_2) ? local18 : Static447.method7001();
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!tc;B)V")
	public static void method2517(@OriginalArg(0) Class305 arg0) {
		@Pc(11) Class305 local11 = Static324.method5639(arg0);
		@Pc(17) int local17;
		@Pc(15) int local15;
		if (local11 == null) {
			local15 = Static294.anInt10217;
			local17 = Static582.anInt10234;
		} else {
			local17 = local11.anInt9242;
			local15 = local11.anInt9160;
		}
		Static149.method2487(local15, local17, false, arg0);
		Static368.method6034(local15, local17, arg0);
	}
}
