import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!hc", name = "tb", descriptor = "I")
	public static int anInt1182;

	@OriginalMember(owner = "client!hc", name = "xb", descriptor = "[[Lclient!of;")
	public static Class1_Sub17[][] aClass1_Sub17ArrayArray1;

	@OriginalMember(owner = "client!hc", name = "Nb", descriptor = "I")
	public static int anInt1195;

	@OriginalMember(owner = "client!hc", name = "ob", descriptor = "Lclient!af;")
	private static Class5 aClass5_611 = Static45.method1937("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!hc", name = "pb", descriptor = "Lclient!af;")
	public static Class5 aClass5_612 = Static45.method1937("");

	@OriginalMember(owner = "client!hc", name = "rb", descriptor = "[I")
	public static int[] anIntArray200 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!hc", name = "sb", descriptor = "Lclient!af;")
	public static Class5 aClass5_613 = Static45.method1937("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!hc", name = "ub", descriptor = "Lclient!gd;")
	public static Class28 aClass28_32 = new Class28(30);

	@OriginalMember(owner = "client!hc", name = "wb", descriptor = "Lclient!af;")
	public static Class5 aClass5_614 = aClass5_611;

	@OriginalMember(owner = "client!hc", name = "Bb", descriptor = "Lclient!af;")
	public static Class5 aClass5_615 = Static45.method1937(")4lang)4de");

	@OriginalMember(owner = "client!hc", name = "Gb", descriptor = "Lclient!af;")
	public static Class5 aClass5_616 = Static45.method1937("null");

	@OriginalMember(owner = "client!hc", name = "Kb", descriptor = "Lclient!af;")
	public static Class5 aClass5_617 = Static45.method1937("<col=ff0000>");

	@OriginalMember(owner = "client!hc", name = "Ob", descriptor = "Lclient!af;")
	public static Class5 aClass5_618 = aClass5_612;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method864(@OriginalArg(1) Class41 arg0) {
		Static82.aClass41_18 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(B)V")
	public static void method865() {
		aClass5_613 = null;
		aClass5_615 = null;
		aClass1_Sub17ArrayArray1 = null;
		aClass28_32 = null;
		anIntArray200 = null;
		aClass5_618 = null;
		aClass5_614 = null;
		aClass5_612 = null;
		aClass5_617 = null;
		aClass5_611 = null;
		aClass5_616 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BLclient!sa;II)V")
	public static void method866(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class1_Sub19 local3 = new Class1_Sub19();
		local3.aByteArray34 = arg0;
		local3.aLong95 = arg2;
		local3.aClass70_3 = arg1;
		local3.anInt2528 = 0;
		@Pc(22) Class53 local22 = Static8.aClass53_4;
		synchronized (Static8.aClass53_4) {
			Static8.aClass53_4.method1449(local3);
		}
		Static11.method290();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBII)V")
	public static void method867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = Static44.aClass68_1.method1875(arg4, arg1, arg2);
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(40) int local40;
		@Pc(36) int local36;
		@Pc(65) int local65;
		@Pc(71) int local71;
		if (local16 != 0) {
			local28 = Static44.aClass68_1.method1847(arg4, arg1, arg2, local16);
			local34 = local28 >> 6 & 0x3;
			local36 = arg0;
			local40 = local28 & 0x1F;
			@Pc(43) int[] local43 = Static8.aClass1_Sub3_Sub1_Sub2_1.anIntArray171;
			if (local16 > 0) {
				local36 = arg3;
			}
			local65 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
			local71 = local16 >> 14 & 0x7FFF;
			@Pc(75) Class1_Sub3_Sub10 local75 = Static131.method2263(local71);
			if (local75.anInt1671 == -1) {
				if (local40 == 0 || local40 == 2) {
					if (local34 == 0) {
						local43[local65] = local36;
						local43[local65 + 512] = local36;
						local43[local65 + 1024] = local36;
						local43[local65 + 1536] = local36;
					} else if (local34 == 1) {
						local43[local65] = local36;
						local43[local65 + 1] = local36;
						local43[local65 + 2] = local36;
						local43[local65 + 3] = local36;
					} else if (local34 == 2) {
						local43[local65 + 3] = local36;
						local43[local65 + 512 + 3] = local36;
						local43[local65 + 1027] = local36;
						local43[local65 + 1536 + 3] = local36;
					} else if (local34 == 3) {
						local43[local65 + 1536] = local36;
						local43[local65 + 1 + 1536] = local36;
						local43[local65 + 1536 + 2] = local36;
						local43[local65 + 3 + 1536] = local36;
					}
				}
				if (local40 == 3) {
					if (local34 == 0) {
						local43[local65] = local36;
					} else if (local34 == 1) {
						local43[local65 + 3] = local36;
					} else if (local34 == 2) {
						local43[local65 + 1539] = local36;
					} else if (local34 == 3) {
						local43[local65 + 1536] = local36;
					}
				}
				if (local40 == 2) {
					if (local34 == 3) {
						local43[local65] = local36;
						local43[local65 + 512] = local36;
						local43[local65 + 1024] = local36;
						local43[local65 + 1536] = local36;
					} else if (local34 == 0) {
						local43[local65] = local36;
						local43[local65 + 1] = local36;
						local43[local65 + 2] = local36;
						local43[local65 + 3] = local36;
					} else if (local34 == 1) {
						local43[local65 + 3] = local36;
						local43[local65 + 3 + 512] = local36;
						local43[local65 + 3 + 1024] = local36;
						local43[local65 + 3 + 1536] = local36;
					} else if (local34 == 2) {
						local43[local65 + 1536] = local36;
						local43[local65 + 1 + 1536] = local36;
						local43[local65 + 2 + 1536] = local36;
						local43[local65 + 1539] = local36;
					}
				}
			} else {
				@Pc(84) Class1_Sub3_Sub1_Sub3 local84 = Static74.aClass1_Sub3_Sub1_Sub3Array5[local75.anInt1671];
				if (local84 != null) {
					@Pc(97) int local97 = (local75.anInt1696 * 4 - local84.anInt2443) / 2;
					@Pc(108) int local108 = (local75.anInt1693 * 4 - local84.anInt2442) / 2;
					local84.method1687(arg1 * 4 + local97 + 48, local108 + (104 - (arg2 - -local75.anInt1693)) * 4 + 48);
				}
			}
		}
		local16 = Static44.aClass68_1.method1848(arg4, arg1, arg2);
		if (local16 != 0) {
			local28 = Static44.aClass68_1.method1847(arg4, arg1, arg2, local16);
			local34 = local28 >> 6 & 0x3;
			local40 = local28 & 0x1F;
			local36 = local16 >> 14 & 0x7FFF;
			@Pc(477) Class1_Sub3_Sub10 local477 = Static131.method2263(local36);
			@Pc(510) int local510;
			if (local477.anInt1671 != -1) {
				@Pc(486) Class1_Sub3_Sub1_Sub3 local486 = Static74.aClass1_Sub3_Sub1_Sub3Array5[local477.anInt1671];
				if (local486 != null) {
					local71 = (local477.anInt1696 * 4 - local486.anInt2443) / 2;
					local510 = (local477.anInt1693 * 4 - local486.anInt2442) / 2;
					local486.method1687(local71 + arg1 * 4 + 48, 48 - -((-arg2 + (104 - local477.anInt1693)) * 4) - -local510);
				}
			} else if (local40 == 9) {
				local510 = arg1 * 4 + (-(arg2 * 512) + 52736) * 4 + 24624;
				@Pc(560) int[] local560 = Static8.aClass1_Sub3_Sub1_Sub2_1.anIntArray171;
				local65 = 15658734;
				if (local16 > 0) {
					local65 = 15597568;
				}
				if (local34 == 0 || local34 == 2) {
					local560[local510 + 1536] = local65;
					local560[local510 + 1 + 1024] = local65;
					local560[local510 + 2 + 512] = local65;
					local560[local510 + 3] = local65;
				} else {
					local560[local510] = local65;
					local560[local510 + 512 + 1] = local65;
					local560[local510 + 2 + 1024] = local65;
					local560[local510 + 3 + 1536] = local65;
				}
			}
		}
		local16 = Static44.aClass68_1.method1862(arg4, arg1, arg2);
		if (local16 == 0) {
			return;
		}
		local28 = local16 >> 14 & 0x7FFF;
		@Pc(658) Class1_Sub3_Sub10 local658 = Static131.method2263(local28);
		if (local658.anInt1671 == -1) {
			return;
		}
		@Pc(667) Class1_Sub3_Sub1_Sub3 local667 = Static74.aClass1_Sub3_Sub1_Sub3Array5[local658.anInt1671];
		if (local667 != null) {
			local36 = (local658.anInt1696 * 4 - local667.anInt2443) / 2;
			@Pc(690) int local690 = (local658.anInt1693 * 4 - local667.anInt2442) / 2;
			local667.method1687(local36 + arg1 * 4 + 48, local690 + 48 + (-arg2 + 104 - local658.anInt1693) * 4);
			return;
		}
	}
}
