import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bm", name = "Y", descriptor = "J")
	public static long aLong33;

	@OriginalMember(owner = "client!bm", name = "X", descriptor = "Lclient!jl;")
	public static Class89 aClass89_4 = new Class89(100);

	@OriginalMember(owner = "client!bm", name = "Z", descriptor = "I")
	public static int anInt612 = 10;

	@OriginalMember(owner = "client!bm", name = "ab", descriptor = "I")
	public static int anInt613 = -1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V")
	public static void method471(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub3_Sub22 local14 = Static271.method4108(6, arg0);
		local14.method4464();
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V")
	public static void method472() {
		@Pc(7) int local7 = Static303.anInt6021;
		@Pc(9) int local9 = Static60.anInt1307;
		@Pc(13) int local13 = Static175.anInt266 - 3;
		@Pc(15) int local15 = Static96.anInt2211;
		if (Static187.aClass1_Sub3_Sub13_12 == null || Static146.aClass1_Sub3_Sub13_13 == null) {
			if (Static277.aClass168_188.method4038(Static197.anInt4317) && Static277.aClass168_188.method4038(Static58.anInt1265)) {
				Static187.aClass1_Sub3_Sub13_12 = Static204.method3258(Static277.aClass168_188, Static197.anInt4317);
				Static146.aClass1_Sub3_Sub13_13 = Static204.method3258(Static277.aClass168_188, Static58.anInt1265);
				if (Static294.aBoolean367) {
					if (Static187.aClass1_Sub3_Sub13_12 instanceof Class1_Sub3_Sub13_Sub2_Sub1) {
						Static187.aClass1_Sub3_Sub13_12 = new Class1_Sub3_Sub13_Sub1_Sub1((Class1_Sub3_Sub13_Sub2) Static187.aClass1_Sub3_Sub13_12);
					} else {
						Static187.aClass1_Sub3_Sub13_12 = new Class1_Sub3_Sub13_Sub1((Class1_Sub3_Sub13_Sub2) Static187.aClass1_Sub3_Sub13_12);
					}
					if (Static146.aClass1_Sub3_Sub13_13 instanceof Class1_Sub3_Sub13_Sub2_Sub1) {
						Static146.aClass1_Sub3_Sub13_13 = new Class1_Sub3_Sub13_Sub1_Sub1((Class1_Sub3_Sub13_Sub2) Static146.aClass1_Sub3_Sub13_13);
					} else {
						Static146.aClass1_Sub3_Sub13_13 = new Class1_Sub3_Sub13_Sub1((Class1_Sub3_Sub13_Sub2) Static146.aClass1_Sub3_Sub13_13);
					}
				}
			} else if (Static294.aBoolean367) {
				Static156.method2547(local15, local7, local9, 20, Static140.anInt3201, 256 - Static230.anInt3031);
			} else {
				Static231.method3650(local15, local7, local9, 20, Static140.anInt3201, 256 - Static230.anInt3031);
			}
		}
		@Pc(122) int local122;
		@Pc(124) int local124;
		if (Static187.aClass1_Sub3_Sub13_12 != null && Static146.aClass1_Sub3_Sub13_13 != null) {
			local122 = (local9 - Static146.aClass1_Sub3_Sub13_13.anInt5571 * 2) / Static187.aClass1_Sub3_Sub13_12.anInt5571;
			for (local124 = 0; local124 < local122; local124++) {
				Static187.aClass1_Sub3_Sub13_12.method4204(Static187.aClass1_Sub3_Sub13_12.anInt5571 * local124 + local15 + Static146.aClass1_Sub3_Sub13_13.anInt5571, local7);
			}
			Static146.aClass1_Sub3_Sub13_13.method4204(local15, local7);
			Static146.aClass1_Sub3_Sub13_13.method4208(local15 + local9 - Static146.aClass1_Sub3_Sub13_13.anInt5571, local7);
		}
		Static176.aClass1_Sub3_Sub5_2.method3503(Static8.aString19, local15 + 3, local7 - -14, Static182.anInt4014, -1);
		if (Static294.aBoolean367) {
			Static156.method2547(local15, local7 + 20, local9, local13 - 20, Static140.anInt3201, 256 - Static230.anInt3031);
		} else {
			Static231.method3650(local15, local7 + 20, local9, local13 - 20, Static140.anInt3201, 256 - Static230.anInt3031);
		}
		local124 = Static289.anInt5816;
		local122 = Static89.anInt5974;
		@Pc(218) int local218;
		@Pc(237) int local237;
		for (local218 = 0; local218 < Static181.anInt3973; local218++) {
			local237 = local7 + (-local218 + (Static181.anInt3973 - 1)) * 15 + 20 + 13;
			if (local15 < local122 && local9 + local15 > local122 && local124 > local237 - 13 && local124 < local237 + 3) {
				if (Static294.aBoolean367) {
					Static156.method2547(local15, local237 - 12, local9, 15, Static5.anInt3332, 256 - Static71.anInt1646);
				} else {
					Static231.method3650(local15, local237 - 12, local9, 15, Static5.anInt3332, 256 - Static71.anInt1646);
				}
			}
		}
		if ((Static313.aClass1_Sub3_Sub13_15 == null || Static139.aClass1_Sub3_Sub13_8 == null || Static184.aClass1_Sub3_Sub13_11 == null) && Static277.aClass168_188.method4038(Static79.anInt1831) && Static277.aClass168_188.method4038(Static146.anInt4437) && Static277.aClass168_188.method4038(Static187.anInt4124)) {
			Static313.aClass1_Sub3_Sub13_15 = Static204.method3258(Static277.aClass168_188, Static79.anInt1831);
			Static139.aClass1_Sub3_Sub13_8 = Static204.method3258(Static277.aClass168_188, Static146.anInt4437);
			Static184.aClass1_Sub3_Sub13_11 = Static204.method3258(Static277.aClass168_188, Static187.anInt4124);
			if (Static294.aBoolean367) {
				if (Static313.aClass1_Sub3_Sub13_15 instanceof Class1_Sub3_Sub13_Sub2_Sub1) {
					Static313.aClass1_Sub3_Sub13_15 = new Class1_Sub3_Sub13_Sub1_Sub1((Class1_Sub3_Sub13_Sub2) Static313.aClass1_Sub3_Sub13_15);
				} else {
					Static313.aClass1_Sub3_Sub13_15 = new Class1_Sub3_Sub13_Sub1((Class1_Sub3_Sub13_Sub2) Static313.aClass1_Sub3_Sub13_15);
				}
				if (Static139.aClass1_Sub3_Sub13_8 instanceof Class1_Sub3_Sub13_Sub2_Sub1) {
					Static139.aClass1_Sub3_Sub13_8 = new Class1_Sub3_Sub13_Sub1_Sub1((Class1_Sub3_Sub13_Sub2) Static139.aClass1_Sub3_Sub13_8);
				} else {
					Static139.aClass1_Sub3_Sub13_8 = new Class1_Sub3_Sub13_Sub1((Class1_Sub3_Sub13_Sub2) Static139.aClass1_Sub3_Sub13_8);
				}
				if (Static184.aClass1_Sub3_Sub13_11 instanceof Class1_Sub3_Sub13_Sub2_Sub1) {
					Static184.aClass1_Sub3_Sub13_11 = new Class1_Sub3_Sub13_Sub1_Sub1((Class1_Sub3_Sub13_Sub2) Static184.aClass1_Sub3_Sub13_11);
				} else {
					Static184.aClass1_Sub3_Sub13_11 = new Class1_Sub3_Sub13_Sub1((Class1_Sub3_Sub13_Sub2) Static184.aClass1_Sub3_Sub13_11);
				}
			}
		}
		@Pc(446) int local446;
		if (Static313.aClass1_Sub3_Sub13_15 != null && Static139.aClass1_Sub3_Sub13_8 != null && Static184.aClass1_Sub3_Sub13_11 != null) {
			local218 = (local9 - Static184.aClass1_Sub3_Sub13_11.anInt5571 * 2) / Static313.aClass1_Sub3_Sub13_15.anInt5571;
			for (local237 = 0; local237 < local218; local237++) {
				Static313.aClass1_Sub3_Sub13_15.method4204(Static184.aClass1_Sub3_Sub13_11.anInt5571 + local15 + Static313.aClass1_Sub3_Sub13_15.anInt5571 * local237, local7 + local13 - Static313.aClass1_Sub3_Sub13_15.anInt5573);
			}
			local237 = (local13 - Static184.aClass1_Sub3_Sub13_11.anInt5573 - 20) / Static139.aClass1_Sub3_Sub13_8.anInt5573;
			for (local446 = 0; local446 < local237; local446++) {
				Static139.aClass1_Sub3_Sub13_8.method4204(local15, Static139.aClass1_Sub3_Sub13_8.anInt5573 * local446 + local7 + 20);
				Static139.aClass1_Sub3_Sub13_8.method4208(local15 + local9 - Static139.aClass1_Sub3_Sub13_8.anInt5571, local446 * Static139.aClass1_Sub3_Sub13_8.anInt5573 + 20 + local7);
			}
			Static184.aClass1_Sub3_Sub13_11.method4204(local15, local13 + local7 - Static184.aClass1_Sub3_Sub13_11.anInt5573);
			Static184.aClass1_Sub3_Sub13_11.method4208(local9 + local15 - Static184.aClass1_Sub3_Sub13_11.anInt5571, local13 + local7 + -Static184.aClass1_Sub3_Sub13_11.anInt5573);
		}
		for (local218 = 0; local218 < Static181.anInt3973; local218++) {
			local237 = (Static181.anInt3973 - local218 - 1) * 15 + local7 + 33;
			local446 = Static182.anInt4014;
			if (local122 > local15 && local9 + local15 > local122 && local237 - 13 < local124 && local237 + 3 > local124) {
				local446 = Static27.anInt4398;
			}
			Static176.aClass1_Sub3_Sub5_2.method3503(Static56.method1051(local218), local15 + 3, local237, local446, 0);
		}
		Static163.method2578(Static96.anInt2211, Static60.anInt1307, Static175.anInt266, Static303.anInt6021);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
	public static String method476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		@Pc(30) StringBuffer local30 = new StringBuffer(26);
		if (arg3 < 0L) {
			local25 = true;
			arg3 = -arg3;
		}
		@Pc(56) int local56;
		@Pc(62) int local62;
		if (arg0 > 0) {
			for (local56 = 0; local56 < arg0; local56++) {
				local62 = (int) arg3;
				arg3 /= 10L;
				local30.append((char) (local62 + 48 - (int) arg3 * 10));
			}
			local30.append(local7);
		}
		local56 = 0;
		while (true) {
			local62 = (int) arg3;
			arg3 /= 10L;
			local30.append((char) (local62 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local25) {
					local30.append('-');
				}
				return local30.reverse().toString();
			}
			if (arg2) {
				local56++;
				if (local56 % 3 == 0) {
					local30.append(local9);
				}
			}
		}
	}
}
