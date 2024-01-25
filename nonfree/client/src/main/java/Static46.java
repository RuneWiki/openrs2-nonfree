import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public static int anInt5339;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public static int anInt5338 = 13156520;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
	public static final int[] anIntArray458 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!co;")
	public static final Class41 aClass41_63 = new Class41(50);

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_160 = new Class208(15, 6);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!so;ZILclient!fg;ILclient!oj;)Z")
	public static boolean method4756(@OriginalArg(0) Class212 arg0, @OriginalArg(3) Class2_Sub10 arg1, @OriginalArg(5) Class48 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray522 != null) {
			local13 = Static20.anInt4607 - (arg1.anInt2178 + arg0.anInt6004 - Static20.anInt4610) * (-Static20.anInt4609 + Static20.anInt4607) / (Static20.anInt4613 - Static20.anInt4610);
			local11 = Static20.anInt4607 - (arg0.anInt5997 + arg1.anInt2178 - Static20.anInt4610) * (Static20.anInt4607 - Static20.anInt4609) / (Static20.anInt4613 - Static20.anInt4610);
			local9 = (Static20.anInt4602 - Static20.anInt4604) * (arg1.anInt2184 + arg0.anInt5999 - Static20.anInt4608) / (Static20.anInt4605 - Static20.anInt4608) + Static20.anInt4604;
			local7 = Static20.anInt4604 + (arg1.anInt2184 + arg0.anInt5996 - Static20.anInt4608) * (Static20.anInt4602 - Static20.anInt4604) / (Static20.anInt4605 - Static20.anInt4608);
		}
		@Pc(99) Class27 local99 = null;
		@Pc(101) int local101 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (arg0.anInt5994 != -1) {
			if (arg1.aBoolean161 && arg0.anInt5982 != -1) {
				local99 = arg0.method5243(arg2, true);
			} else {
				local99 = arg0.method5243(arg2, false);
			}
			if (local99 != null) {
				local101 = arg1.anInt2185 - (local99.method5317() + 1 >> 1);
				local108 = arg1.anInt2185 + (local99.method5317() + 1 >> 1);
				if (local7 > local101) {
					local7 = local101;
				}
				if (local108 > local9) {
					local9 = local108;
				}
				local110 = arg1.anInt2182 - (local99.method5328() + 1 >> 1);
				local112 = arg1.anInt2182 + (local99.method5328() + 1 >> 1);
				if (local110 < local11) {
					local11 = local110;
				}
				if (local13 < local112) {
					local13 = local112;
				}
			}
		}
		@Pc(217) Class73 local217 = null;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(280) int local280;
		@Pc(307) int local307;
		if (arg0.aString58 != null) {
			local217 = Static378.method4272(arg0.anInt5993);
			if (local217 != null) {
				local219 = Static35.aClass24_1.method330(null, Static376.aStringArray43, arg0.aString58, null);
				local221 = arg1.anInt2182;
				if (local99 == null) {
					local221 -= local219 * local217.method1633() / 2;
				} else {
					local221 -= (local99.method5328() >> 1) + local219 * local217.method1635();
				}
				for (local280 = 0; local280 < local219; local280++) {
					@Pc(286) String local286 = Static376.aStringArray43[local280];
					if (local219 - 1 > local280) {
						local286 = local286.substring(0, local286.length() - 4);
					}
					local307 = local217.method1634(local286);
					if (local307 > local223) {
						local223 = local307;
					}
				}
				local225 = arg1.anInt2185 - local223 / 2;
				if (local225 < local7) {
					local7 = local225;
				}
				local227 = local223 / 2 + arg1.anInt2185;
				local229 = local221;
				if (local227 > local9) {
					local9 = local227;
				}
				if (local229 < local11) {
					local11 = local229;
				}
				local231 = local221 + local219 * local217.method1635();
				if (local13 < local231) {
					local13 = local231;
				}
			}
		}
		if (Static20.anInt4604 > local9 || Static20.anInt4602 < local7 || local13 < Static20.anInt4609 || local11 > Static20.anInt4607) {
			return true;
		}
		@Pc(411) int local411;
		if (arg0.anIntArray522 != null) {
			@Pc(409) int[] local409 = new int[arg0.anIntArray522.length];
			for (local411 = 0; local411 < local409.length / 2; local411++) {
				local307 = arg0.anIntArray522[local411 * 2] + arg1.anInt2184;
				@Pc(436) int local436 = arg0.anIntArray522[local411 * 2 + 1] + arg1.anInt2178;
				local409[local411 * 2] = (local307 - Static20.anInt4608) * (Static20.anInt4602 - Static20.anInt4604) / (Static20.anInt4605 - Static20.anInt4608) + Static20.anInt4604;
				local409[local411 * 2 + 1] = Static20.anInt4607 - (local436 - Static20.anInt4610) * (Static20.anInt4607 - Static20.anInt4609) / (Static20.anInt4613 - Static20.anInt4610);
			}
			Static163.method2887(arg2, local409, arg0.anInt5976);
			for (local307 = 0; local307 < local409.length / 2 - 1; local307++) {
				arg2.method2536(local409[local307 * 2], local409[local307 * 2 + 2], local409[(local307 + 1) * 2 + 1], arg0.anInt5975, local409[local307 * 2 + 1]);
			}
			arg2.method2536(local409[local409.length - 2], local409[0], local409[1], arg0.anInt5975, local409[local409.length - 1]);
		}
		if (local99 != null) {
			if (Static11.anInt211 > 0 && (Static340.anInt6283 != -1 && Static340.anInt6283 == arg1.anInt2183 || Static228.anInt4596 != -1 && arg0.anInt5985 == Static228.anInt4596)) {
				if (Static313.anInt5728 <= 50) {
					local280 = Static313.anInt5728 * 2;
				} else {
					local280 = 200 - Static313.anInt5728 * 2;
				}
				local411 = local280 << 24 | 0xFFFF00;
				arg2.method2507(arg1.anInt2182, local99.method5320() / 2 + 7, local411, arg1.anInt2185);
				arg2.method2507(arg1.anInt2182, local99.method5320() / 2 + 5, local411, arg1.anInt2185);
				arg2.method2507(arg1.anInt2182, local99.method5320() / 2 + 3, local411, arg1.anInt2185);
				arg2.method2507(arg1.anInt2182, local99.method5320() / 2 + 1, local411, arg1.anInt2185);
				arg2.method2507(arg1.anInt2182, local99.method5320() / 2, local411, arg1.anInt2185);
			}
			local99.method5318(arg1.anInt2185 - (local99.method5317() >> 1), arg1.anInt2182 + -(local99.method5328() >> 1));
		}
		if (arg0.aString58 != null && local217 != null) {
			Static293.method773(local217, arg2, arg0, local223, arg1, local219, local221);
		}
		if (arg0.anInt5994 != -1 || arg0.aString58 != null) {
			@Pc(720) Class2_Sub6 local720 = new Class2_Sub6(arg1);
			local720.anInt586 = local227;
			local720.anInt579 = local108;
			local720.anInt577 = local229;
			local720.anInt589 = local110;
			local720.anInt581 = local112;
			local720.anInt585 = local231;
			local720.anInt587 = local225;
			local720.anInt578 = local101;
			Static340.aClass238_39.method5796(local720);
		}
		return false;
	}
}
