import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!we;")
	public static Class62 aClass62_13;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public static int anInt1947;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!we;")
	public static Class62 aClass62_14;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!ea;")
	public static Class3_Sub6 aClass3_Sub6_1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public static int anInt1950;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "Lclient!na;")
	private static Class53 aClass53_870 = Static109.method1737("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_866 = aClass53_870;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!na;")
	private static Class53 aClass53_871 = Static109.method1737("FULL");

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_867 = aClass53_871;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
	public static int[] anIntArray259 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_868 = Static109.method1737("(U3");

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_869 = Static109.method1737("null");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public static void method1353() {
		aClass62_13 = null;
		anIntArray259 = null;
		aClass53_867 = null;
		aClass53_870 = null;
		aClass62_14 = null;
		aClass53_869 = null;
		aClass53_868 = null;
		aClass53_871 = null;
		aClass53_866 = null;
		aClass3_Sub6_1 = null;
		anIntArray258 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1354() {
		Static90.aClass75_60.method1724();
		Static35.aClass75_31.method1724();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)I")
	public static int method1355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 >> 7;
		@Pc(19) int local19 = arg0 >> 7;
		if (local15 < 0 || local19 < 0 || local15 > 103 || local19 > 103) {
			return 0;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = arg2 & 0x7F;
		if (arg1 < 3 && (Static37.aByteArrayArrayArray17[1][local15][local19] & 0x2) == 2) {
			local33 = arg1 + 1;
		}
		@Pc(56) int local56 = arg0 & 0x7F;
		@Pc(87) int local87 = local37 * Static107.anIntArrayArrayArray7[local33][local15 + 1][local19 + 1] + Static107.anIntArrayArrayArray7[local33][local15][local19 + 1] * (128 - local37) >> 7;
		@Pc(114) int local114 = local37 * Static107.anIntArrayArrayArray7[local33][local15 + 1][local19] + Static107.anIntArrayArrayArray7[local33][local15][local19] * (128 - local37) >> 7;
		return local56 * local87 + (128 - local56) * local114 >> 7;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILclient!dd;[B)V")
	public static void method1356(@OriginalArg(1) int arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(3) Class3_Sub9 local3 = new Class3_Sub9();
		local3.aLong94 = arg0;
		local3.aClass17_1 = arg1;
		local3.anInt1119 = 0;
		local3.aByteArray18 = arg2;
		@Pc(22) Class11 local22 = Static100.aClass11_11;
		synchronized (Static100.aClass11_11) {
			Static100.aClass11_11.method190(local3);
		}
		Static9.method138();
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method1357() {
		Static107.aClass75_67.method1724();
		Static108.aClass75_68.method1724();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
	public static boolean method1358(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static18.anIntArray48[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 53;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BJ)V")
	public static void method1359(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static68.anInt1724; local14++) {
			if (Static2.aLongArray1[local14] == arg0) {
				Static36.aBoolean40 = true;
				Static68.anInt1724--;
				for (@Pc(38) int local38 = local14; local38 < Static68.anInt1724; local38++) {
					Static52.aClass53Array11[local38] = Static52.aClass53Array11[local38 + 1];
					Static120.anIntArray405[local38] = Static120.anIntArray405[local38 + 1];
					Static2.aLongArray1[local38] = Static2.aLongArray1[local38 + 1];
					Static75.anIntArray250[local38] = Static75.anIntArray250[local38 + 1];
				}
				Static44.anInt1240 = Static27.anInt843 + 1;
				Static115.aClass3_Sub7_Sub1_3.method662(127);
				Static115.aClass3_Sub7_Sub1_3.method633(arg0);
				break;
			}
		}
	}
}
