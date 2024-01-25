import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static694 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
	public static int anInt10675;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIIIII)V")
	public static void method9346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(25) Class311 local25 = Static632.aClass311ArrayArrayArray3[arg4][arg5][arg1];
			if (local25 == null) {
				local25 = new Class311(arg4);
			}
			if (arg0 == 1) {
				local25.aShort114 = (short) arg3;
				local25.aShort113 = (short) arg2;
			} else if (arg0 == 2) {
				local25.aShort111 = (short) arg3;
				local25.aShort112 = (short) arg2;
			}
			if (Static30.aBoolean65) {
				Static161.method2381();
			}
			return;
		}
		@Pc(83) int local83;
		@Pc(88) int local88;
		@Pc(92) int local92;
		@Pc(96) int local96;
		@Pc(106) int local106;
		@Pc(116) int local116;
		if (arg0 != 8) {
			local83 = (arg5 << Static260.anInt4053) + Static60.anInt1042;
			local88 = local83 - Static60.anInt1042;
			local92 = arg1 << Static260.anInt4053;
			local96 = Static60.anInt1042 + local92;
			local106 = Static126.aClass133Array1[arg4].method8217(arg5 + 1, arg1);
			local116 = Static126.aClass133Array1[arg4].method8217(arg5, arg1 + 1);
			Static449.aClass252Array4[Static670.anInt10425++] = new Class252(arg0, arg4, local83, local88, local88, local83, local106, local116, local116 - arg3, -arg3 + local106, local92, local96, local96, local92);
			return;
		}
		local83 = arg5 << Static260.anInt4053;
		local88 = Static60.anInt1042 + local83;
		local92 = arg1 << Static260.anInt4053;
		local96 = local92 + Static60.anInt1042;
		local106 = Static126.aClass133Array1[arg4].method8217(arg5, arg1);
		local116 = Static126.aClass133Array1[arg4].method8217(arg5 + 1, arg1 - -1);
		Static449.aClass252Array4[Static670.anInt10425++] = new Class252(arg0, arg4, local83, local88, local88, local83, local106, local116, local116 - arg3, local106 + -arg3, local92, local96, local96, local92);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V")
	public static void method9348(@OriginalArg(1) int arg0) {
		if (Static39.anInt535 == 0) {
			Static442.aClass2_Sub23_Sub5_3.method7682(arg0);
		} else {
			Static515.anInt8213 = arg0;
		}
	}
}
