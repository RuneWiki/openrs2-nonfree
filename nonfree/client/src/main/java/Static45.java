import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_8;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array4;

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array8;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "Lclient!na;")
	private static Class53 aClass53_575 = Static109.method1737("Connecting to update server");

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_570 = aClass53_575;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_571 = Static109.method1737("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_572 = Static109.method1737("p12_full");

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array10 = new Class53[5];

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Z")
	public static boolean aBoolean47 = false;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
	public static int[] anIntArray152 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "Lclient!na;")
	public static Class53 aClass53_573 = Static109.method1737("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "Lclient!na;")
	public static Class53 aClass53_574 = Static109.method1737("va");

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Lclient!na;")
	public static Class53 aClass53_576 = Static109.method1737("Konfig geladen)3");

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Lclient!na;")
	private static Class53 aClass53_577 = Static109.method1737("Location");

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "Lclient!na;")
	public static Class53 aClass53_578 = aClass53_577;

	@OriginalMember(owner = "client!ia", name = "P", descriptor = "Lclient!na;")
	public static Class53 aClass53_579 = Static109.method1737(" )2>");

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public static void method888() {
		aClass53_572 = null;
		aClass53_571 = null;
		aClass3_Sub1_Sub5_Sub3Array4 = null;
		aClass53_575 = null;
		aClass3_Sub1_Sub5_Sub4Array8 = null;
		aClass53_577 = null;
		anIntArray152 = null;
		aClass62_Sub1_8 = null;
		aClass53_570 = null;
		aClass53_573 = null;
		aClass53_578 = null;
		aClass53_574 = null;
		aClass53_576 = null;
		aClass53_579 = null;
		aClass53Array10 = null;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
	public static void method889() {
		@Pc(3) int local3 = Static37.anInt2216;
		@Pc(5) int local5 = Static116.anInt2638;
		@Pc(11) int local11 = Static87.anInt2096;
		@Pc(21) int local21 = Static19.anInt2422;
		Static84.method1316(local3, local5, local21, local11, 6116423);
		Static84.method1316(local3 + 1, local5 + 1, local21 - 2, 16, 0);
		Static84.method1324(local3 + 1, local5 + 18, local21 - 2, local11 + -19, 0);
		Static43.aClass3_Sub1_Sub5_Sub2_1.method746(Static15.aClass53_130, local3 + 3, local5 + 14, 6116423);
		@Pc(67) int local67 = Static105.anInt2433;
		@Pc(69) int local69 = Static99.anInt2348;
		if (Static35.anInt1112 == 0) {
			local69 -= 4;
			local67 -= 4;
		}
		if (Static35.anInt1112 == 1) {
			local67 -= 205;
			local69 -= 553;
		}
		if (Static35.anInt1112 == 2) {
			local69 -= 17;
			local67 -= 357;
		}
		for (@Pc(88) int local88 = 0; local88 < Static36.anInt1122; local88++) {
			@Pc(102) int local102 = local5 + (Static36.anInt1122 - local88 + -1) * 15 + 31;
			@Pc(104) int local104 = 16777215;
			if (local3 < local69 && local69 < local3 + local21 && local67 > local102 - 13 && local67 < local102 + 3) {
				local104 = 16776960;
			}
			Static43.aClass3_Sub1_Sub5_Sub2_1.method749(Static99.aClass53Array17[local88], local3 + 3, local102, local104, true);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BLclient!je;IIB[Lclient!bd;)V")
	public static void method890(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class9[] arg4) {
		@Pc(10) Class3_Sub7 local10 = new Class3_Sub7(arg0);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local10.method619();
			if (local26 == 0) {
				return;
			}
			@Pc(30) int local30 = 0;
			local22 += local26;
			while (true) {
				@Pc(38) int local38 = local10.method619();
				if (local38 == 0) {
					break;
				}
				local30 += local38 - 1;
				@Pc(53) int local53 = local30 & 0x3F;
				@Pc(59) int local59 = local30 >> 6 & 0x3F;
				@Pc(65) int local65 = local10.method647();
				@Pc(70) int local70 = local59 + arg3;
				@Pc(75) int local75 = local53 + arg2;
				@Pc(79) int local79 = local65 >> 2;
				@Pc(83) int local83 = local30 >> 12;
				@Pc(87) int local87 = local65 & 0x3;
				if (local70 > 0 && local75 > 0 && local70 < 103 && local75 < 103) {
					@Pc(107) int local107 = local83;
					if ((Static37.aByteArrayArrayArray17[1][local70][local75] & 0x2) == 2) {
						local107 = local83 - 1;
					}
					@Pc(121) Class9 local121 = null;
					if (local107 >= 0) {
						local121 = arg4[local107];
					}
					Static35.method757(local75, local83, local70, local87, local79, local121, arg1, local22);
				}
			}
		}
	}
}
