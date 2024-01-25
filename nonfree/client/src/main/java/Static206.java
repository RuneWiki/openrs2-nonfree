import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)Lclient!wp;")
	public static Class1_Sub51 method3168() {
		if (Static287.aClass111_18 == null || Static17.aClass265_1 == null) {
			return null;
		}
		Static17.aClass265_1.method5634(Static287.aClass111_18);
		@Pc(18) Class1_Sub51 local18 = (Class1_Sub51) Static17.aClass265_1.method5637();
		if (local18 == null) {
			return null;
		} else {
			@Pc(36) Class345 local36 = Static287.aClass113_3.method2595(local18.anInt9675);
			return local36 != null && local36.aBoolean686 && local36.method7486(Static287.anInterface17_2) ? local18 : Static535.method5755();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	public static void method3169() {
		Static281.method4188();
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
	public static void method3170() {
		if (Static339.anInt6245 == 1 || Static339.anInt6245 == 3 || Static533.anInt8982 != Static339.anInt6245 && (Static339.anInt6245 == 0 || Static533.anInt8982 == 0)) {
			Static547.anInt9151 = 0;
			Static306.anInt4911 = 0;
			Static372.aClass91_30.method2275();
		}
		Static533.anInt8982 = Static339.anInt6245;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIJ)V")
	public static void method3171(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(24) int local24 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static590.method7873(arg1, true, local17, local10, arg0, 0, 0, 0);
			return;
		}
		@Pc(52) Class178 local52 = Static347.aClass122_4.method2770(local24);
		@Pc(63) int local63;
		@Pc(66) int local66;
		if (local17 == 0 || local17 == 2) {
			local66 = local52.anInt4634;
			local63 = local52.anInt4627;
		} else {
			local63 = local52.anInt4634;
			local66 = local52.anInt4627;
		}
		@Pc(77) int local77 = local52.anInt4637;
		if (local17 != 0) {
			local77 = (local77 << local17 & 0xF) + (local77 >> 4 - local17);
		}
		Static590.method7873(arg1, true, 0, 0, arg0, local77, local63, local66);
	}
}
