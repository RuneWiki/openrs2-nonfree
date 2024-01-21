import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!vb;")
	public static Class3_Sub1_Sub15 aClass3_Sub1_Sub15_3;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_5;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!gd;")
	public static Class27 aClass27_6;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!na;")
	private static Class53 aClass53_173 = Static109.method1737("Username: ");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!na;")
	private static Class53 aClass53_174 = Static109.method1737("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!na;")
	public static Class53 aClass53_175 = aClass53_173;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ud;")
	public static Class77 aClass77_2 = new Class77(4096);

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
	public static int[] anIntArray48 = new int[500];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!na;")
	public static Class53 aClass53_176 = aClass53_174;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	public static int anInt471 = 0;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "J")
	public static volatile long aLong24 = 0L;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	public static int[] anIntArray49 = new int[32768];

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	public static int anInt476 = 0;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!na;")
	private static Class53 aClass53_177 = Static109.method1737("Your profile will be transferred in:");

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!na;")
	public static Class53 aClass53_178 = aClass53_177;

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method292() {
		aClass53_177 = null;
		aClass53_174 = null;
		aClass62_Sub1_5 = null;
		aClass53_175 = null;
		aClass77_2 = null;
		anIntArray50 = null;
		anIntArray48 = null;
		aClass27_6 = null;
		aClass53_178 = null;
		aClass3_Sub1_Sub15_3 = null;
		aClass53_173 = null;
		anIntArray49 = null;
		aClass53_176 = null;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method294() {
		Static72.aClass75_50.method1724();
		Static46.aClass75_79.method1724();
		Static95.aClass75_62.method1724();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!na;ZLclient!na;Z)V")
	public static void method295(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) boolean arg2) {
		if (Static123.aBoolean128) {
			Static40.method820();
			Static123.aBoolean128 = false;
			Static99.method1642();
			Static50.method1909();
			Static109.method1739();
			Static50.method1912();
			Static85.method1430(Static9.anInt237, Static88.anInt2106, Static89.aClass3_Sub1_Sub5_Sub2_3, Static68.anInt1720);
			Static27.method523(Static22.anInt713, -1, Static60.anIntArray194, Static111.anInt2574 == -1);
			Static66.aBoolean58 = true;
			Static106.aBoolean103 = true;
			Static93.aBoolean90 = true;
		}
		Static106.method1711();
		@Pc(44) short local44 = 151;
		@Pc(45) int local45 = local44 - 3;
		Static89.aClass3_Sub1_Sub5_Sub2_3.method735(arg0, 257, 148, 0);
		Static89.aClass3_Sub1_Sub5_Sub2_3.method735(arg0, 256, 147, 16777215);
		if (arg1 != null) {
			local45 += 15;
			if (arg2) {
				@Pc(75) int local75 = Static89.aClass3_Sub1_Sub5_Sub2_3.method745(arg1) + 4;
				Static84.method1316(257 - local75 / 2, 152, local75, 11, 0);
			}
			Static89.aClass3_Sub1_Sub5_Sub2_3.method735(arg1, 257, 163, 0);
			Static89.aClass3_Sub1_Sub5_Sub2_3.method735(arg1, 256, 162, 16777215);
		}
		Static70.method1204();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!qe;)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub1 arg1) {
		if (arg1.anInt1462 > Static27.anInt843) {
			Static72.method1223(arg1);
		} else if (arg1.anInt1416 < Static27.anInt843) {
			Static76.method1270(arg1);
		} else {
			Static98.method1637(arg1);
		}
		if (arg1.anInt1424 < 128 || arg1.anInt1427 < 128 || arg1.anInt1424 >= 13184 || arg1.anInt1427 >= 13184) {
			arg1.anInt1424 = arg1.anInt1453 * 64 + arg1.anIntArray185[0] * 128;
			arg1.anInt1442 = -1;
			arg1.anInt1416 = 0;
			arg1.anInt1439 = -1;
			arg1.anInt1462 = 0;
			arg1.anInt1427 = arg1.anInt1453 * 64 + arg1.anIntArray181[0] * 128;
			arg1.method1034();
		}
		if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1 == arg1 && (arg1.anInt1424 < 1536 || arg1.anInt1427 < 1536 || arg1.anInt1424 >= 11776 || arg1.anInt1427 >= 11776)) {
			arg1.anInt1442 = -1;
			arg1.anInt1424 = arg1.anIntArray185[0] * 128 + arg1.anInt1453 * 64;
			arg1.anInt1416 = 0;
			arg1.anInt1462 = 0;
			arg1.anInt1427 = arg1.anInt1453 * 64 + arg1.anIntArray181[0] * 128;
			arg1.anInt1439 = -1;
			arg1.method1034();
		}
		Static123.method1959(arg1);
		Static108.method1722(arg1);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method298() {
		while (true) {
			@Pc(13) Class11 local13 = Static100.aClass11_11;
			@Pc(20) Class3_Sub9 local20;
			synchronized (Static100.aClass11_11) {
				local20 = (Class3_Sub9) Static16.aClass11_1.method193();
			}
			if (local20 == null) {
				return;
			}
			local20.aClass62_Sub1_6.method1523(local20.aByteArray18, (int) local20.aLong94, local20.aClass17_1, false);
		}
	}
}
