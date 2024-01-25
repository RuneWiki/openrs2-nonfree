import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!tt", name = "Kb", descriptor = "I")
	public static int anInt9546;

	@OriginalMember(owner = "client!tt", name = "Mb", descriptor = "J")
	public static long aLong247;

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_55 = new Class166(4);

	@OriginalMember(owner = "client!tt", name = "Gb", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_56 = new Class166(3000000, 200);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BIIIIIIILclient!tea;II)Z")
	public static boolean method8087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class319 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(23) int local23 = arg2 - 64;
		Static524.anIntArrayArray46[64][64] = 99;
		Static533.anIntArrayArray49[64][64] = 0;
		@Pc(45) byte local45 = 0;
		Static151.anIntArray179[0] = arg6;
		@Pc(51) int local51 = 0;
		@Pc(54) int local54 = local45 + 1;
		Static430.anIntArray478[0] = arg2;
		@Pc(59) int[][] local59 = arg7.anIntArrayArray52;
		while (local54 != local51) {
			local9 = Static430.anIntArray478[local51];
			local7 = Static151.anIntArray179[local51];
			@Pc(74) int local74 = local9 - local23;
			@Pc(80) int local80 = local9 - arg7.anInt9322;
			local51 = local51 + 1 & 0xFFF;
			@Pc(92) int local92 = local7 - arg7.anInt9338;
			@Pc(97) int local97 = local7 - local18;
			if (arg8 == -4) {
				if (local7 == arg5 && arg9 == local9) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static53.method901(arg5, 1, arg0, arg4, local7, arg9, 1, local9)) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg7.method7931(1, local7, arg5, local9, arg9, arg4, 1, arg3, arg0)) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg7.method7935(arg5, arg0, arg3, arg4, arg9, 1, local7, local9)) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg7.method7938(local9, arg9, arg8, arg5, 1, arg1, local7)) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg7.method7945(1, arg9, local7, arg8, arg5, local9, arg1)) {
				Static75.anInt1537 = local9;
				Static189.anInt3799 = local7;
				return true;
			}
			@Pc(235) int local235 = Static533.anIntArrayArray49[local97][local74] + 1;
			if (local97 > 0 && Static524.anIntArrayArray46[local97 - 1][local74] == 0 && (local59[local92 - 1][local80] & 0x42240000) == 0) {
				Static151.anIntArray179[local54] = local7 - 1;
				Static430.anIntArray478[local54] = local9;
				local54 = local54 + 1 & 0xFFF;
				Static524.anIntArrayArray46[local97 - 1][local74] = 2;
				Static533.anIntArrayArray49[local97 - 1][local74] = local235;
			}
			if (local97 < 127 && Static524.anIntArrayArray46[local97 + 1][local74] == 0 && (local59[local92 + 1][local80] & 0x60240000) == 0) {
				Static151.anIntArray179[local54] = local7 + 1;
				Static430.anIntArray478[local54] = local9;
				Static524.anIntArrayArray46[local97 + 1][local74] = 8;
				local54 = local54 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local97 + 1][local74] = local235;
			}
			if (local74 > 0 && Static524.anIntArrayArray46[local97][local74 - 1] == 0 && (local59[local92][local80 - 1] & 0x40A40000) == 0) {
				Static151.anIntArray179[local54] = local7;
				Static430.anIntArray478[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static524.anIntArrayArray46[local97][local74 - 1] = 1;
				Static533.anIntArrayArray49[local97][local74 - 1] = local235;
			}
			if (local74 < 127 && Static524.anIntArrayArray46[local97][local74 + 1] == 0 && (local59[local92][local80 + 1] & 0x48240000) == 0) {
				Static151.anIntArray179[local54] = local7;
				Static430.anIntArray478[local54] = local9 + 1;
				Static524.anIntArrayArray46[local97][local74 + 1] = 4;
				local54 = local54 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local97][local74 + 1] = local235;
			}
			if (local97 > 0 && local74 > 0 && Static524.anIntArrayArray46[local97 - 1][local74 - 1] == 0 && (local59[local92 - 1][local80 - 1] & 0x43A40000) == 0 && (local59[local92 - 1][local80] & 0x42240000) == 0 && (local59[local92][local80 - 1] & 0x40A40000) == 0) {
				Static151.anIntArray179[local54] = local7 - 1;
				Static430.anIntArray478[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static524.anIntArrayArray46[local97 - 1][local74 - 1] = 3;
				Static533.anIntArrayArray49[local97 - 1][local74 - 1] = local235;
			}
			if (local97 < 127 && local74 > 0 && Static524.anIntArrayArray46[local97 + 1][local74 - 1] == 0 && (local59[local92 + 1][local80 - 1] & 0x60E40000) == 0 && (local59[local92 + 1][local80] & 0x60240000) == 0 && (local59[local92][local80 - 1] & 0x40A40000) == 0) {
				Static151.anIntArray179[local54] = local7 + 1;
				Static430.anIntArray478[local54] = local9 - 1;
				Static524.anIntArrayArray46[local97 + 1][local74 - 1] = 9;
				local54 = local54 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local97 + 1][local74 - 1] = local235;
			}
			if (local97 > 0 && local74 < 127 && Static524.anIntArrayArray46[local97 - 1][local74 + 1] == 0 && (local59[local92 - 1][local80 + 1] & 0x4E240000) == 0 && (local59[local92 - 1][local80] & 0x42240000) == 0 && (local59[local92][local80 + 1] & 0x48240000) == 0) {
				Static151.anIntArray179[local54] = local7 - 1;
				Static430.anIntArray478[local54] = local9 + 1;
				Static524.anIntArrayArray46[local97 - 1][local74 + 1] = 6;
				local54 = local54 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local97 - 1][local74 + 1] = local235;
			}
			if (local97 < 127 && local74 < 127 && Static524.anIntArrayArray46[local97 + 1][local74 + 1] == 0 && (local59[local92 + 1][local80 + 1] & 0x78240000) == 0 && (local59[local92 + 1][local80] & 0x60240000) == 0 && (local59[local92][local80 + 1] & 0x48240000) == 0) {
				Static151.anIntArray179[local54] = local7 + 1;
				Static430.anIntArray478[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static524.anIntArrayArray46[local97 + 1][local74 + 1] = 12;
				Static533.anIntArrayArray49[local97 + 1][local74 + 1] = local235;
			}
		}
		Static75.anInt1537 = local9;
		Static189.anInt3799 = local7;
		return false;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!hd;Lclient!mia;I)Lclient!cq;")
	public static Class6_Sub9 method8089(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class208 arg1) {
		@Pc(8) Class6_Sub9 local8 = Static147.method2342();
		local8.anInt1709 = arg1.anInt6548;
		local8.aClass208_16 = arg1;
		if (local8.anInt1709 == -1) {
			local8.aClass6_Sub40_Sub2_1 = new Class6_Sub40_Sub2(260);
		} else if (local8.anInt1709 == -2) {
			local8.aClass6_Sub40_Sub2_1 = new Class6_Sub40_Sub2(10000);
		} else if (local8.anInt1709 <= 18) {
			local8.aClass6_Sub40_Sub2_1 = new Class6_Sub40_Sub2(20);
		} else if (local8.anInt1709 > 98) {
			local8.aClass6_Sub40_Sub2_1 = new Class6_Sub40_Sub2(260);
		} else {
			local8.aClass6_Sub40_Sub2_1 = new Class6_Sub40_Sub2(100);
		}
		local8.aClass6_Sub40_Sub2_1.method8622(arg0);
		local8.aClass6_Sub40_Sub2_1.method8626(local8.aClass208_16.method5624());
		local8.anInt1708 = 0;
		return local8;
	}
}
