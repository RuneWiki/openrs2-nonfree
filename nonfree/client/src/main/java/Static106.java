import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!qd;")
	public static Class51 aClass51_4;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_954 = Static56.method1206("null");

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public static int anInt2789 = 0;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!lc;")
	public static Class31 aClass31_955 = Static56.method1206("earlier today");

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public static int anInt2795 = 0;

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
	public static int[] anIntArray391 = new int[2000];

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_956 = Static56.method1206("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method1750() {
		for (@Pc(11) int local11 = 0; local11 < Static64.anInt624; local11++) {
			@Pc(17) int local17 = Static91.anIntArray352[local11];
			@Pc(21) Class2_Sub1_Sub4_Sub6_Sub2 local21 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local17];
			@Pc(25) int local25 = Static3.aClass2_Sub6_Sub1_1.method665();
			if ((local25 & 0x20) != 0) {
				local21.anInt2019 = Static3.aClass2_Sub6_Sub1_1.method627();
				if (local21.anInt2019 == 65535) {
					local21.anInt2019 = -1;
				}
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			if ((local25 & 0x40) != 0) {
				local52 = Static3.aClass2_Sub6_Sub1_1.method656();
				local56 = Static3.aClass2_Sub6_Sub1_1.method628();
				local21.method1269(Static49.anInt2694, local56, local52);
				local21.anInt2021 = Static49.anInt2694 + 300;
				local21.anInt1993 = Static3.aClass2_Sub6_Sub1_1.method671();
				local21.anInt2002 = Static3.aClass2_Sub6_Sub1_1.method656();
			}
			if ((local25 & 0x8) != 0) {
				local52 = Static3.aClass2_Sub6_Sub1_1.method667();
				local56 = Static3.aClass2_Sub6_Sub1_1.method665();
				if (local52 == 65535) {
					local52 = -1;
				}
				if (local21.anInt2014 == local52 && local52 != -1) {
					@Pc(154) int local154 = Static54.method1158(local52).anInt2088;
					if (local154 == 1) {
						local21.anInt1986 = local56;
						local21.anInt1987 = 0;
						local21.anInt1980 = 0;
						local21.anInt1977 = 0;
					}
					if (local154 == 2) {
						local21.anInt1980 = 0;
					}
				} else if (local52 == -1 || local21.anInt2014 == -1 || Static54.method1158(local52).anInt2101 >= Static54.method1158(local21.anInt2014).anInt2101) {
					local21.anInt1977 = 0;
					local21.anInt1980 = 0;
					local21.anInt2014 = local52;
					local21.anInt1986 = local56;
					local21.anInt1996 = local21.anInt2000;
					local21.anInt1987 = 0;
				}
			}
			if ((local25 & 0x1) != 0) {
				local52 = Static3.aClass2_Sub6_Sub1_1.method656();
				local56 = Static3.aClass2_Sub6_Sub1_1.method628();
				local21.method1269(Static49.anInt2694, local56, local52);
				local21.anInt2021 = Static49.anInt2694 + 300;
				local21.anInt1993 = Static3.aClass2_Sub6_Sub1_1.method665();
				local21.anInt2002 = Static3.aClass2_Sub6_Sub1_1.method656();
			}
			if ((local25 & 0x80) != 0) {
				local21.anInt1995 = Static3.aClass2_Sub6_Sub1_1.method633();
				local52 = Static3.aClass2_Sub6_Sub1_1.method663();
				local21.anInt2033 = local52 >> 16;
				if (local21.anInt1995 == 65535) {
					local21.anInt1995 = -1;
				}
				local21.anInt1978 = 0;
				local21.anInt1990 = (local52 & 0xFFFF) + Static49.anInt2694;
				local21.anInt1983 = 0;
				if (local21.anInt1990 > Static49.anInt2694) {
					local21.anInt1983 = -1;
				}
			}
			if ((local25 & 0x2) != 0) {
				local21.aClass31_708 = Static3.aClass2_Sub6_Sub1_1.method670();
				local21.anInt1981 = 100;
			}
			if ((local25 & 0x4) != 0) {
				local21.aClass2_Sub1_Sub8_1 = Static79.method1443(Static3.aClass2_Sub6_Sub1_1.method627());
				local21.anInt1984 = local21.aClass2_Sub1_Sub8_1.anInt1856;
				local21.anInt1994 = local21.aClass2_Sub1_Sub8_1.anInt1863;
				local21.anInt2003 = local21.aClass2_Sub1_Sub8_1.anInt1855;
				local21.anInt2007 = local21.aClass2_Sub1_Sub8_1.anInt1868;
				local21.anInt2029 = local21.aClass2_Sub1_Sub8_1.anInt1867;
				local21.anInt2022 = local21.aClass2_Sub1_Sub8_1.anInt1848;
				local21.anInt2039 = local21.aClass2_Sub1_Sub8_1.anInt1847;
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt2038 = Static3.aClass2_Sub6_Sub1_1.method627();
				local21.anInt1985 = Static3.aClass2_Sub6_Sub1_1.method632();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public static void method1753() {
		anIntArray391 = null;
		aClass31_955 = null;
		aClass31_954 = null;
		aClass51_4 = null;
		aClass31_956 = null;
	}
}
