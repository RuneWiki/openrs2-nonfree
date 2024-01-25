import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Lclient!dn;")
	public static Class56 aClass56_74;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array21;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_215 = new Class92(6, 6);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIJ)V")
	public static void method5070(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(15) int local15 = (int) arg2 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg2 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static454.method6065(0, local22, true, 0, arg1, arg0, 0, local15);
			return;
		}
		@Pc(45) Class128 local45 = Static55.aClass25_1.method855(local29);
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (local22 == 0 || local22 == 2) {
			local53 = local45.anInt4004;
			local56 = local45.anInt4036;
		} else {
			local56 = local45.anInt4004;
			local53 = local45.anInt4036;
		}
		@Pc(66) int local66 = local45.anInt4020;
		if (local22 != 0) {
			local66 = (local66 << local22 & 0xF) + (local66 >> 4 - local22);
		}
		Static454.method6065(local56, 0, true, local53, arg1, arg0, local66, 0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method5071(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 < 128 || arg0 < 128 || arg1 > (Static399.anInt6923 - 2) * 128 || arg0 > (Static127.anInt2696 - 2) * 128) {
			Static189.anIntArray294[0] = Static189.anIntArray294[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static124.method2209(arg2, arg1, arg0) - arg5;
		Static203.aClass106_2.ZA(arg4, 0, 0);
		Static266.aClass75_7.m(Static203.aClass106_2);
		Static266.aClass75_7.ia(arg1, local45, arg0, Static189.anIntArray294);
		Static203.aClass106_2.ZA(-arg4, 0, 0);
		Static266.aClass75_7.m(Static203.aClass106_2);
	}
}
