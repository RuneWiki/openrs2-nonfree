import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!kj", name = "cb", descriptor = "Lclient!jb;")
	public static Class28 aClass28_46;

	@OriginalMember(owner = "client!kj", name = "db", descriptor = "Lclient!sc;")
	private static Class107 aClass107_690 = Static231.method3737("wishes to trade with you)3");

	@OriginalMember(owner = "client!kj", name = "bb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_689 = aClass107_690;

	@OriginalMember(owner = "client!kj", name = "gb", descriptor = "Lclient!ak;")
	public static Class8 aClass8_7 = new Class8(64);

	@OriginalMember(owner = "client!kj", name = "ib", descriptor = "Lclient!sc;")
	private static Class107 aClass107_692 = Static231.method3737(" has logged out)3");

	@OriginalMember(owner = "client!kj", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_691 = aClass107_692;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIILclient!og;II)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt3424 == -1 && arg2.anIntArray300 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		if (arg2.anInt3412 < arg0) {
			local16 = arg0 - arg2.anInt3412;
		} else if (arg2.anInt3413 > arg0) {
			local16 = arg2.anInt3413 - arg0;
		}
		if (arg1 > arg2.anInt3420) {
			local16 += arg1 - arg2.anInt3420;
		} else if (arg2.anInt3418 > arg1) {
			local16 += arg2.anInt3418 - arg1;
		}
		if (arg2.anInt3414 == 0 || local16 - 64 > arg2.anInt3414 || Static90.anInt1961 == 0 || arg2.anInt3425 != arg4) {
			if (arg2.aClass1_Sub6_Sub3_3 != null) {
				Static42.aClass1_Sub6_Sub1_1.method966(arg2.aClass1_Sub6_Sub3_3);
				arg2.aClass1_Sub6_Sub3_3 = null;
			}
			if (arg2.aClass1_Sub6_Sub3_2 != null) {
				Static42.aClass1_Sub6_Sub1_1.method966(arg2.aClass1_Sub6_Sub3_2);
				arg2.aClass1_Sub6_Sub3_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(137) int local137 = (arg2.anInt3414 - local16) * Static90.anInt1961 / arg2.anInt3414;
		if (arg2.aClass1_Sub6_Sub3_3 != null) {
			arg2.aClass1_Sub6_Sub3_3.method1826(local137);
		} else if (arg2.anInt3424 >= 0) {
			@Pc(149) Class43 local149 = Static237.method1256(Static156.aClass28_Sub1_90, arg2.anInt3424, 0);
			if (local149 != null) {
				@Pc(156) Class1_Sub7_Sub1 local156 = local149.method1253().method1034(Static218.aClass108_1);
				@Pc(161) Class1_Sub6_Sub3 local161 = Static238.method1831(local156, local137);
				local161.method1837(-1);
				Static42.aClass1_Sub6_Sub1_1.method972(local161);
				arg2.aClass1_Sub6_Sub3_3 = local161;
			}
		}
		if (arg2.aClass1_Sub6_Sub3_2 != null) {
			arg2.aClass1_Sub6_Sub3_2.method1826(local137);
			if (!arg2.aClass1_Sub6_Sub3_2.method3732()) {
				arg2.aClass1_Sub6_Sub3_2 = null;
			}
		} else if (arg2.anIntArray300 != null && (arg2.anInt3426 -= arg3) <= 0) {
			@Pc(215) int local215 = (int) (Math.random() * (double) arg2.anIntArray300.length);
			@Pc(223) Class43 local223 = Static237.method1256(Static156.aClass28_Sub1_90, arg2.anIntArray300[local215], 0);
			if (local223 != null) {
				@Pc(230) Class1_Sub7_Sub1 local230 = local223.method1253().method1034(Static218.aClass108_1);
				@Pc(235) Class1_Sub6_Sub3 local235 = Static238.method1831(local230, local137);
				local235.method1837(0);
				Static42.aClass1_Sub6_Sub1_1.method972(local235);
				arg2.aClass1_Sub6_Sub3_2 = local235;
				arg2.anInt3426 = (int) ((double) (arg2.anInt3411 - arg2.anInt3428) * Math.random()) + arg2.anInt3428;
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZI)V")
	public static void method2000() {
		@Pc(13) byte[][] local13 = Static85.aByteArrayArray3;
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static30.method587();
			for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
				for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
					@Pc(29) boolean local29 = false;
					@Pc(37) int local37 = Static60.anIntArrayArrayArray6[local15][local21][local25];
					if (local37 != -1) {
						@Pc(47) int local47 = local37 >> 24 & 0x3;
						@Pc(57) int local57 = local37 >> 1 & 0x3;
						@Pc(63) int local63 = local37 >> 14 & 0x3FF;
						@Pc(69) int local69 = local37 >> 3 & 0x7FF;
						@Pc(79) int local79 = local69 / 8 + (local63 / 8 << 8);
						for (@Pc(81) int local81 = 0; local81 < Static182.anIntArray343.length; local81++) {
							if (local79 == Static182.anIntArray343[local81] && local13[local81] != null) {
								Static75.method1336((local69 & 0x7) * 8, Static107.aClass60Array1, local15, (local63 & 0x7) * 8, local13[local81], local57, local25 * 8, local47, local21 * 8);
								local29 = true;
								break;
							}
						}
					}
					if (!local29) {
						Static19.method373(local15, 8, 8, local21 * 8, local25 * 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)Lclient!sc;")
	public static Class107 method2001(@OriginalArg(1) int arg0) {
		return Static7.method243(false, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(Lclient!jb;I)V")
	public static void method2002(@OriginalArg(0) Class28 arg0) {
		Static96.aClass28_36 = arg0;
		Static100.anInt2153 = Static96.aClass28_36.method832(16);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!jb;Lclient!jb;I)V")
	public static void method2003(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1) {
		Static24.aClass28_12 = arg0;
		Static31.aClass28_51 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
	public static void method2004() {
		@Pc(3) int local3 = Static175.aClass1_Sub2_Sub15_3.method3350(Static191.aClass107_1107);
		@Pc(15) int local15;
		for (@Pc(5) int local5 = 0; local5 < Static8.anInt259; local5++) {
			local15 = Static175.aClass1_Sub2_Sub15_3.method3350(Static75.method1338(local5));
			if (local15 > local3) {
				local3 = local15;
			}
		}
		local3 += 8;
		local15 = Static8.anInt259 * 15 + 21;
		@Pc(50) int local50 = Static32.anInt604 - local3 / 2;
		@Pc(52) int local52 = Static11.anInt298;
		if (local50 + local3 > Static158.anInt3484) {
			local50 = Static158.anInt3484 - local3;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		if (local15 + local52 > Static180.anInt4990) {
			local52 = Static180.anInt4990 - local15;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		if (Static157.anInt3442 != 1) {
			if (Static20.anInt2218 == Static32.anInt604 && Static11.anInt298 == Static161.anInt3533) {
				Static101.anInt2176 = Static8.anInt259 * 15 + 22;
				Static40.aBoolean81 = true;
				Static157.anInt3442 = 0;
				Static44.anInt965 = local3;
				Static104.anInt3191 = local52;
				Static100.anInt2167 = local50;
				return;
			}
			Static1.anInt74 = Static161.anInt3533;
			Static37.anInt767 = Static20.anInt2218;
			Static157.anInt3442 = 1;
		} else if (Static37.anInt767 == Static32.anInt604 && Static1.anInt74 == Static11.anInt298) {
			Static40.aBoolean81 = true;
			Static100.anInt2167 = local50;
			Static157.anInt3442 = 0;
			Static101.anInt2176 = Static8.anInt259 * 15 + 22;
			Static44.anInt965 = local3;
			Static104.anInt3191 = local52;
			return;
		}
	}

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)Lclient!th;")
	public static Class67 method2005() {
		try {
			return (Class67) Class.forName("Class67_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
