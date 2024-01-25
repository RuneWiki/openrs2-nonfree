import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	public static int anInt3464 = -1;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)I")
	public static int method2911(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(27) int local27 = local13 | local13 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method2912(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg1, 3);
		local9.method7976();
		local9.aString131 = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZBZLclient!tca;)V")
	public static void method2913(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class6_Sub51 arg2) {
		@Pc(13) int local13 = arg2.anInt9360;
		@Pc(17) int local17 = (int) arg2.aLong314;
		arg2.method9174();
		if (arg0) {
			Static582.method8066(local13);
		}
		Static216.method3142(local13);
		@Pc(34) Class321 local34 = Static286.method4134(local17);
		if (local34 != null) {
			Static293.method4206(local34);
		}
		Static515.method7286();
		if (!arg1 && Static561.anInt9357 != -1) {
			Static363.method5233(1, Static561.anInt9357);
		}
		@Pc(56) Class331 local56 = new Class331(Static262.aClass209_35);
		for (@Pc(61) Class6_Sub51 local61 = (Class6_Sub51) local56.method7889(); local61 != null; local61 = (Class6_Sub51) local56.method7886()) {
			if (!local61.method9176()) {
				local61 = (Class6_Sub51) local56.method7889();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt9358 == 3) {
				@Pc(83) int local83 = (int) local61.aLong314;
				if (local83 >>> 16 == local13) {
					method2913(true, arg1, local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)Lclient!fa;")
	public static Class99 method2914(@OriginalArg(0) int arg0) {
		@Pc(12) Class99 local12 = (Class99) Static556.aClass10_53.method373((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static357.aClass8_95.method262(arg0, 1);
		local12 = new Class99();
		local12.anInt2463 = arg0;
		if (local22 != null) {
			local12.method2108(new Class6_Sub23(local22));
		}
		local12.method2109();
		if (local12.anInt2468 == 2 && Static402.aClass209_39.method5038((long) arg0) == null) {
			Static402.aClass209_39.method5035((long) arg0, new Class6_Sub36(Static267.anInt4665));
			Static656.aClass99Array1[Static267.anInt4665++] = local12;
		}
		Static556.aClass10_53.method366(local12, (long) arg0);
		return local12;
	}
}
