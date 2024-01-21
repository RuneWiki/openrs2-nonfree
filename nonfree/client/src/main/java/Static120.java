import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!kb;")
	public static Class41 aClass41_16;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	public static int anInt1842;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "Lclient!kb;")
	public static Class41 aClass41_17;

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "Lclient!r;")
	public static Class41_Sub1 aClass41_Sub1_14;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int anInt1835 = 0;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_919 = Static45.method1937(")2");

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!af;")
	private static Class5 aClass5_920 = Static45.method1937("Sep");

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!af;")
	private static Class5 aClass5_924 = Static45.method1937("Jan");

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!af;")
	private static Class5 aClass5_922 = Static45.method1937("Feb");

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!af;")
	private static Class5 aClass5_927 = Static45.method1937("Mar");

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "Lclient!af;")
	private static Class5 aClass5_929 = Static45.method1937("Apr");

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!af;")
	private static Class5 aClass5_925 = Static45.method1937("May");

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!af;")
	private static Class5 aClass5_933 = Static45.method1937("Jun");

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "Lclient!af;")
	private static Class5 aClass5_936 = Static45.method1937("Jul");

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!af;")
	private static Class5 aClass5_928 = Static45.method1937("Aug");

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Lclient!af;")
	private static Class5 aClass5_934 = Static45.method1937("Oct");

	@OriginalMember(owner = "client!ud", name = "x", descriptor = "Lclient!af;")
	private static Class5 aClass5_931 = Static45.method1937("Nov");

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "Lclient!af;")
	private static Class5 aClass5_935 = Static45.method1937("Dec");

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array15 = new Class5[] { aClass5_924, aClass5_922, aClass5_927, aClass5_929, aClass5_925, aClass5_933, aClass5_936, aClass5_928, aClass5_920, aClass5_934, aClass5_931, aClass5_935 };

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_921 = Static45.method1937(")4l");

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
	public static int anInt1840 = 0;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_923 = Static45.method1937("<br>(X");

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_926 = Static45.method1937("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public static int anInt1841 = 0;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Lclient!af;")
	public static Class5 aClass5_930 = Static45.method1937(" <col=00ff80>");

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!af;")
	public static Class5 aClass5_932 = Static45.method1937("Art");

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
	public static int anInt1843 = 0;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
	public static int anInt1845 = 0;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "Lclient!af;")
	public static Class5 aClass5_937 = Static45.method1937("<br>");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 1 || arg5 < 1 || arg6 > 102 || arg5 > 102) {
			return;
		}
		if (Static79.aBoolean64 && Static7.anInt213 != arg0) {
			return;
		}
		@Pc(35) int local35 = 0;
		if (arg4 == 0) {
			local35 = Static44.aClass68_1.method1875(arg0, arg6, arg5);
		}
		if (arg4 == 1) {
			local35 = Static44.aClass68_1.method1869(arg0, arg6, arg5);
		}
		if (arg4 == 2) {
			local35 = Static44.aClass68_1.method1848(arg0, arg6, arg5);
		}
		if (arg4 == 3) {
			local35 = Static44.aClass68_1.method1862(arg0, arg6, arg5);
		}
		@Pc(91) int local91;
		if (local35 != 0) {
			@Pc(84) int local84 = local35 >> 14 & 0x7FFF;
			local91 = Static44.aClass68_1.method1847(arg0, arg6, arg5, local35);
			@Pc(95) int local95 = local91 & 0x1F;
			@Pc(101) int local101 = local91 >> 6 & 0x3;
			@Pc(112) Class1_Sub3_Sub10 local112;
			if (arg4 == 0) {
				Static44.aClass68_1.method1842(arg0, arg6, arg5);
				local112 = Static131.method2263(local84);
				if (local112.anInt1681 != 0) {
					Static131.aClass49Array1[arg0].method1331(arg5, local112.aBoolean58, local95, arg6, local101);
				}
			}
			if (arg4 == 1) {
				Static44.aClass68_1.method1865(arg0, arg6, arg5);
			}
			if (arg4 == 2) {
				Static44.aClass68_1.method1850(arg0, arg6, arg5);
				local112 = Static131.method2263(local84);
				if (arg6 + local112.anInt1696 > 103 || arg5 + local112.anInt1696 > 103 || local112.anInt1693 + arg6 > 103 || arg5 + local112.anInt1693 > 103) {
					return;
				}
				if (local112.anInt1681 != 0) {
					Static131.aClass49Array1[arg0].method1319(local112.anInt1693, arg6, local112.anInt1696, local101, arg5, local112.aBoolean58);
				}
			}
			if (arg4 == 3) {
				Static44.aClass68_1.method1835(arg0, arg6, arg5);
				local112 = Static131.method2263(local84);
				if (local112.anInt1681 == 1) {
					Static131.aClass49Array1[arg0].method1328(arg5, arg6);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		local91 = arg0;
		if (arg0 < 3 && (Static25.aByteArrayArrayArray1[1][arg6][arg5] & 0x2) == 2) {
			local91 = arg0 + 1;
		}
		Static24.method537(arg0, Static131.aClass49Array1[arg0], arg6, arg5, local91, arg1, Static44.aClass68_1, arg3, arg2);
		return;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method1342() {
		Static2.aClass1_Sub1_Sub3_1.method1175();
		Static73.aClass41_12 = null;
		Static125.anInt3198 = 1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!af;II)V")
	public static void method1345(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class5 local11 = arg0.method186().method219();
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < Static111.anInt2739; local15++) {
			@Pc(25) Class1_Sub3_Sub4_Sub2_Sub1 local25 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[Static77.anIntArray299[local15]];
			if (local25 != null && local25.aClass5_985 != null && local25.aClass5_985.method207(local11)) {
				Static54.method946(local25.anIntArray443[0], local25.anIntArray446[0], 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0], 0, 1, 1, false, 2, 0, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0]);
				local13 = true;
				if (arg1 == 1) {
					Static44.aClass1_Sub20_Sub1_1.method2108(200);
					Static44.aClass1_Sub20_Sub1_1.method2061(Static77.anIntArray299[local15]);
				}
				if (arg1 == 4) {
					Static44.aClass1_Sub20_Sub1_1.method2108(84);
					Static44.aClass1_Sub20_Sub1_1.method2055(Static77.anIntArray299[local15]);
				}
				break;
			}
		}
		if (!local13) {
			Static50.method893(Static100.method1696(new Class5[] { Static68.aClass5_798, local11 }), 0, Static49.aClass5_612);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!dd;")
	public static Class1_Sub3_Sub6 method1346(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub3_Sub6 local10 = (Class1_Sub3_Sub6) Static46.aClass28_29.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static75.aClass41_13.method1710(8, arg0);
		local10 = new Class1_Sub3_Sub6();
		if (local20 != null) {
			local10.method565(new Class1_Sub20(local20));
		}
		Static46.aClass28_29.method789(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	public static void method1347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static23.anInt750 == 2) {
			Static47.method835((Static40.anInt1044 - Static129.anInt3262 << 7) + Static19.anInt649, (Static115.anInt2845 + -Static32.anInt927 << 7) - -Static2.anInt54, Static92.anInt2325 * 2);
			if (Static68.anInt1572 > -1 && Static131.anInt3270 % 20 < 10) {
				Static97.aClass1_Sub3_Sub1_Sub2Array6[0].method735(arg1 + Static68.anInt1572 - 12, arg0 + Static12.anInt3244 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method1348() {
		aClass5_937 = null;
		aClass5_936 = null;
		aClass5_927 = null;
		aClass5_926 = null;
		aClass5Array15 = null;
		aClass41_17 = null;
		aClass5_925 = null;
		aClass5_930 = null;
		aClass5_923 = null;
		aClass5_933 = null;
		aClass5_932 = null;
		aClass5_921 = null;
		aClass5_919 = null;
		aClass5_922 = null;
		aClass5_929 = null;
		aClass41_Sub1_14 = null;
		aClass5_934 = null;
		aClass5_928 = null;
		aClass5_931 = null;
		aClass41_16 = null;
		aClass5_920 = null;
		aClass5_924 = null;
		aClass5_935 = null;
	}
}
