import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public static int anInt1935;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Lclient!cq;")
	public static Class8 aClass8_14;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!lm;")
	public static Class134 aClass134_45;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public static int anInt1936;

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int anInt1933 = -1;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "Lclient!ql;")
	public static final Class169 aClass169_4 = new Class169();

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public static int anInt1934 = -1;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!wd;)V")
	public static void method1593(@OriginalArg(1) Class215 arg0) {
		@Pc(13) Class108 local13 = null;
		try {
			@Pc(17) Class193 local17 = arg0.method5678();
			while (local17.anInt5986 == 0) {
				Static163.method2863(1L);
			}
			if (local17.anInt5986 == 1) {
				local13 = (Class108) local17.anObject7;
				@Pc(36) Class1_Sub21 local36 = Static254.method4544();
				local13.method2209(local36.aByteArray82, local36.anInt6611, 0);
			}
		} catch (@Pc(46) Exception local46) {
		}
		try {
			if (local13 != null) {
				local13.method2207();
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!fp;Lclient!ii;BLclient!ni;I)Z")
	public static boolean method1594(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Class105 arg1, @OriginalArg(4) Class1_Sub29 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg0.anIntArray149 != null) {
			local18 = Static150.anInt2641 - (Static150.anInt2641 - Static150.anInt2635) * (arg2.anInt4245 + arg0.anInt1740 - Static150.anInt2634) / (Static150.anInt2633 - Static150.anInt2634);
			local7 = (Static150.anInt2640 - Static150.anInt2642) * (arg0.anInt1735 + arg2.anInt4238 - Static150.anInt2644) / (Static150.anInt2637 - Static150.anInt2644) + Static150.anInt2642;
			local16 = Static150.anInt2641 - (arg2.anInt4245 + arg0.anInt1745 - Static150.anInt2634) * (-Static150.anInt2635 + Static150.anInt2641) / (Static150.anInt2633 - Static150.anInt2634);
			local9 = Static150.anInt2642 + (arg0.anInt1737 + arg2.anInt4238 - Static150.anInt2644) * (-Static150.anInt2642 + Static150.anInt2640) / (Static150.anInt2637 - Static150.anInt2644);
		}
		@Pc(108) Class8 local108 = null;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg0.anInt1725 != -1) {
			if (arg2.aBoolean339 && arg0.anInt1752 != -1) {
				local108 = arg0.method1458(true, arg1);
			} else {
				local108 = arg0.method1458(false, arg1);
			}
			if (local108 != null) {
				local110 = arg2.anInt4240 - (local108.method4381() + 1 >> 1);
				local112 = arg2.anInt4240 + (local108.method4381() + 1 >> 1);
				if (local110 < local7) {
					local7 = local110;
				}
				if (local9 < local112) {
					local9 = local112;
				}
				local114 = arg2.anInt4244 - (local108.method4395() + 1 >> 1);
				if (local114 < local16) {
					local16 = local114;
				}
				local116 = arg2.anInt4244 + (local108.method4395() + 1 >> 1);
				if (local18 < local116) {
					local18 = local116;
				}
			}
		}
		@Pc(211) Class90 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(274) int local274;
		@Pc(301) int local301;
		if (arg0.aString71 != null) {
			local211 = Static97.method1552(arg0.anInt1748);
			if (local211 != null) {
				local213 = Static273.aClass34_8.method797(Static200.aStringArray29, arg0.aString71, null, null);
				local215 = arg2.anInt4244;
				if (local108 == null) {
					local215 -= local211.method1714() * local213 / 2;
				} else {
					local215 -= (local108.method4395() >> 1) + local211.method1717() * local213;
				}
				for (local274 = 0; local274 < local213; local274++) {
					@Pc(280) String local280 = Static200.aStringArray29[local274];
					if (local274 < local213 - 1) {
						local280 = local280.substring(0, local280.length() - 4);
					}
					local301 = local211.method1718(local280);
					if (local217 < local301) {
						local217 = local301;
					}
				}
				local219 = arg2.anInt4240 - local217 / 2;
				local221 = local217 / 2 + arg2.anInt4240;
				if (local219 < local7) {
					local7 = local219;
				}
				if (local9 < local221) {
					local9 = local221;
				}
				local223 = local215;
				if (local16 > local223) {
					local16 = local223;
				}
				local225 = local211.method1717() * local213 + local215;
				if (local18 < local225) {
					local18 = local225;
				}
			}
		}
		if (local9 < Static150.anInt2642 || local7 > Static150.anInt2640 || local18 < Static150.anInt2635 || local16 > Static150.anInt2641) {
			return true;
		}
		@Pc(412) int local412;
		if (arg0.anIntArray149 != null) {
			@Pc(410) int[] local410 = new int[arg0.anIntArray149.length];
			for (local412 = 0; local412 < local410.length / 2; local412++) {
				local301 = arg2.anInt4238 + arg0.anIntArray149[local412 * 2];
				@Pc(437) int local437 = arg0.anIntArray149[local412 * 2 + 1] + arg2.anInt4245;
				local410[local412 * 2] = Static150.anInt2642 + (Static150.anInt2640 - Static150.anInt2642) * (-Static150.anInt2644 + local301) / (Static150.anInt2637 - Static150.anInt2644);
				local410[local412 * 2 + 1] = Static150.anInt2641 - (Static150.anInt2641 - Static150.anInt2635) * (-Static150.anInt2634 + local437) / (Static150.anInt2633 - Static150.anInt2634);
			}
			Static104.method1635(arg1, local410, arg0.anInt1747);
			for (local301 = 0; local301 < local410.length / 2 - 1; local301++) {
				arg1.method4252(local410[(local301 + 1) * 2], local410[local301 * 2 + 1], local410[local301 * 2], local410[local301 * 2 + 2 + 1], arg0.anInt1738);
			}
			arg1.method4252(local410[0], local410[local410.length - 1], local410[local410.length - 2], local410[1], arg0.anInt1738);
		}
		if (local108 != null) {
			if (Static284.anInt5720 > 0 && (Static289.anInt5793 != -1 && Static289.anInt5793 == arg2.anInt4242 || Static101.anInt1939 != -1 && arg0.anInt1727 == Static101.anInt1939)) {
				if (Static72.anInt1505 <= 50) {
					local274 = Static72.anInt1505 * 2;
				} else {
					local274 = 200 - Static72.anInt1505 * 2;
				}
				local412 = local274 << 24 | 0xFFFF00;
				arg1.method4209(arg2.anInt4244, local108.method4383() / 2 + 7, arg2.anInt4240, local412);
				arg1.method4209(arg2.anInt4244, local108.method4383() / 2 + 5, arg2.anInt4240, local412);
				arg1.method4209(arg2.anInt4244, local108.method4383() / 2 + 3, arg2.anInt4240, local412);
				arg1.method4209(arg2.anInt4244, local108.method4383() / 2 + 1, arg2.anInt4240, local412);
				arg1.method4209(arg2.anInt4244, local108.method4383() / 2, arg2.anInt4240, local412);
			}
			local108.method4393(arg2.anInt4240 - (local108.method4381() >> 1), arg2.anInt4244 + -(local108.method4395() >> 1));
		}
		if (arg0.aString71 != null && local211 != null) {
			Static248.method23(local211, arg1, local217, arg2, arg0, local215, local213);
		}
		if (arg0.anInt1725 != -1 || arg0.aString71 != null) {
			@Pc(732) Class1_Sub22 local732 = new Class1_Sub22(arg2);
			local732.anInt3372 = local110;
			local732.anInt3377 = local116;
			local732.anInt3381 = local219;
			local732.anInt3379 = local221;
			local732.anInt3370 = local114;
			local732.anInt3373 = local112;
			local732.anInt3380 = local223;
			local732.anInt3378 = local225;
			Static332.aClass14_35.method300(local732);
		}
		return false;
	}
}
