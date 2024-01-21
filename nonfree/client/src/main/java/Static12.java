import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
	public static int anInt221;

	@OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
	public static int anInt226;

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lclient!bg;")
	public static Class11 aClass11_12;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
	public static int anInt220 = 0;

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "Lclient!tf;")
	public static Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lclient!lf;")
	private static Class49 aClass49_115 = Static32.method683("Please reload this page)3");

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!lf;")
	public static Class49 aClass49_113 = aClass49_115;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_114 = Static32.method683("Benutzen");

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
	public static int anInt224 = 0;

	@OriginalMember(owner = "client!bb", name = "gb", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array2 = new Class49[1000];

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_117 = Static32.method683("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_116 = aClass49_117;

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "J")
	public static long aLong15 = 0L;

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_118 = Static32.method683("gleiten:");

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "Lclient!eh;")
	public static Class25 aClass25_2 = new Class25(4096);

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method183() {
		for (@Pc(7) int local7 = 0; local7 < Static84.anInt1796; local7++) {
			@Pc(13) int local13 = Static133.anIntArray327[local7]--;
			if (Static133.anIntArray327[local7] >= -10) {
				@Pc(80) Class53 local80 = Static117.aClass53Array1[local7];
				if (local80 == null) {
					local80 = Static190.method1807(Static120.aClass11_Sub1_27, Static66.anIntArray168[local7], 0);
					if (local80 == null) {
						continue;
					}
					Static133.anIntArray327[local7] += local80.method1806();
					Static117.aClass53Array1[local7] = local80;
				}
				if (Static133.anIntArray327[local7] < 0) {
					@Pc(121) int local121;
					if (Static30.anIntArray62[local7] == 0) {
						local121 = Static9.anInt167;
					} else {
						@Pc(131) int local131 = (Static30.anIntArray62[local7] & 0xFF) * 128;
						@Pc(139) int local139 = Static30.anIntArray62[local7] >> 16 & 0xFF;
						@Pc(149) int local149 = local139 * 128 + 64 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529;
						if (local149 < 0) {
							local149 = -local149;
						}
						@Pc(162) int local162 = Static30.anIntArray62[local7] >> 8 & 0xFF;
						@Pc(172) int local172 = local162 * 128 + 64 - Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578;
						if (local172 < 0) {
							local172 = -local172;
						}
						@Pc(183) int local183 = local172 + local149 - 128;
						if (local131 < local183) {
							Static133.anIntArray327[local7] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local121 = Static150.anInt3220 * (local131 - local183) / local131;
					}
					if (local121 > 0) {
						@Pc(215) Class2_Sub5_Sub1 local215 = local80.method1808().method1451(Static6.aClass64_1);
						@Pc(220) Class2_Sub14_Sub1 local220 = Static188.method1380(local215, local121);
						local220.method1349(Static146.anIntArray284[local7] - 1);
						Static128.aClass2_Sub14_Sub4_2.method2590(local220);
					}
					Static133.anIntArray327[local7] = -100;
				}
			} else {
				Static84.anInt1796--;
				for (@Pc(27) int local27 = local7; local27 < Static84.anInt1796; local27++) {
					Static66.anIntArray168[local27] = Static66.anIntArray168[local27 + 1];
					Static117.aClass53Array1[local27] = Static117.aClass53Array1[local27 + 1];
					Static146.anIntArray284[local27] = Static146.anIntArray284[local27 + 1];
					Static133.anIntArray327[local27] = Static133.anIntArray327[local27 + 1];
					Static30.anIntArray62[local27] = Static30.anIntArray62[local27 + 1];
				}
				local7--;
			}
		}
		if (Static33.aBoolean32 && !Static69.method1156()) {
			if (Static156.anInt3412 != 0 && Static116.anInt2424 != -1) {
				Static15.method217(0, Static156.anInt3412, Static116.anInt2424, Static91.aClass11_Sub1_23);
			}
			Static33.aBoolean32 = false;
		} else if (Static156.anInt3412 != 0 && Static116.anInt2424 != -1 && !Static69.method1156()) {
			Static176.aClass2_Sub13_Sub1_14.method2976(34);
			Static176.aClass2_Sub13_Sub1_14.method2952(Static116.anInt2424);
			Static116.anInt2424 = -1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
	public static void method184() {
		aClass49_114 = null;
		aClass81_1 = null;
		aClass49_118 = null;
		aClass49_113 = null;
		aClass49_116 = null;
		aClass49_117 = null;
		aClass25_2 = null;
		aClass49Array2 = null;
		aClass11_12 = null;
		aClass49_115 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!sh;Lclient!bg;Lclient!bg;Lclient!bg;)Z")
	public static boolean method186(@OriginalArg(1) Class2_Sub14_Sub3 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) Class11 arg3) {
		Static61.aClass2_Sub14_Sub3_1 = arg0;
		aClass11_12 = arg2;
		Static170.aClass11_133 = arg1;
		Static104.aClass11_85 = arg3;
		return true;
	}
}
