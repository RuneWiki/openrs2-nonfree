import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Z")
	public static boolean aBoolean442;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
	public static int anInt6122;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_73 = new Class316(68, 11);

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[128][128];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!ql;IB)Z")
	public static boolean method4956(@OriginalArg(0) Class6_Sub12_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method6061(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local8 == 0) {
			if (arg0.method6061(1) != 0) {
				method4956(arg0, arg1);
			}
			local25 = arg0.method6061(6);
			local30 = arg0.method6061(6);
			@Pc(42) boolean local42 = arg0.method6061(1) == 1;
			if (local42) {
				Static124.anIntArray181[Static534.anInt8867++] = arg1;
			}
			if (Static551.aClass15_Sub2_Sub4_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(65) Class83 local65 = Static252.aClass83Array1[arg1];
			@Pc(73) Class15_Sub2_Sub4_Sub2 local73 = Static551.aClass15_Sub2_Sub4_Sub2Array1[arg1] = new Class15_Sub2_Sub4_Sub2();
			local73.anInt8924 = arg1;
			if (Static76.aClass6_Sub12Array1[arg1] != null) {
				local73.method7154(Static76.aClass6_Sub12Array1[arg1]);
			}
			local73.method7143(local65.anInt1961, true);
			local73.anInt8927 = local65.anInt1956;
			local99 = local65.anInt1959;
			local103 = local99 >> 28;
			local109 = local99 >> 14 & 0xFF;
			@Pc(113) int local113 = local99 & 0xFF;
			local73.aBoolean586 = local65.aBoolean130;
			local73.aByteArray106[0] = Static507.aByteArray104[arg1];
			local73.aByte98 = (byte) local103;
			local73.method7146(local25 + (local109 << 6) - Static150.anInt2792, -Static154.anInt2878 + local30 + (local113 << 6));
			local73.aBoolean584 = false;
			Static252.aClass83Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg0.method6061(2);
			local30 = Static252.aClass83Array1[arg1].anInt1959;
			Static252.aClass83Array1[arg1].anInt1959 = (local30 & 0xFFFFFFF) + (((local30 >> 28) + local25 & 0x3) << 28);
			return false;
		} else {
			@Pc(209) int local209;
			@Pc(214) int local214;
			@Pc(222) int local222;
			if (local8 != 2) {
				local25 = arg0.method6061(18);
				local30 = local25 >> 16;
				local209 = local25 >> 8 & 0xFF;
				local214 = local25 & 0xFF;
				local222 = Static252.aClass83Array1[arg1].anInt1959;
				local99 = local30 + (local222 >> 28) & 0x3;
				local103 = (local222 >> 14) + local209 & 0xFF;
				local109 = local214 + local222 & 0xFF;
				Static252.aClass83Array1[arg1].anInt1959 = local109 + (local99 << 28) + (local103 << 14);
				return false;
			}
			local25 = arg0.method6061(5);
			local30 = local25 >> 3;
			local209 = local25 & 0x7;
			local214 = Static252.aClass83Array1[arg1].anInt1959;
			local222 = (local214 >> 28) + local30 & 0x3;
			local99 = local214 >> 14 & 0xFF;
			local103 = local214 & 0xFF;
			if (local209 == 0) {
				local103--;
				local99--;
			}
			if (local209 == 1) {
				local103--;
			}
			if (local209 == 2) {
				local103--;
				local99++;
			}
			if (local209 == 3) {
				local99--;
			}
			if (local209 == 4) {
				local99++;
			}
			if (local209 == 5) {
				local99--;
				local103++;
			}
			if (local209 == 6) {
				local103++;
			}
			if (local209 == 7) {
				local99++;
				local103++;
			}
			Static252.aClass83Array1[arg1].anInt1959 = (local99 << 14) + (local222 << 28) + local103;
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIIIII)I")
	public static int method4959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg0;
			arg0 = local10;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 1 + 7 - arg5 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIJI)V")
	public static void method4962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		@Pc(22) int local22 = (int) arg2 >> 14 & 0x1F;
		@Pc(29) int local29 = (int) arg2 >> 20 & 0x3;
		@Pc(36) int local36 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local22 != 10 && local22 != 11 && local22 != 22) {
			Static227.method3563(0, 0, true, local22, arg0, local29, 0, arg1);
			return;
		}
		@Pc(66) Class192 local66 = Static85.aClass27_1.method516(local36);
		@Pc(77) int local77;
		@Pc(74) int local74;
		if (local29 == 0 || local29 == 2) {
			local74 = local66.anInt5570;
			local77 = local66.anInt5577;
		} else {
			local77 = local66.anInt5570;
			local74 = local66.anInt5577;
		}
		@Pc(88) int local88 = local66.anInt5621;
		if (local29 != 0) {
			local88 = (local88 << local29 & 0xF) + (local88 >> 4 - local29);
		}
		Static227.method3563(local77, local74, true, 0, arg0, 0, local88, arg1);
	}
}
