import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!gd;")
	public static Class27 aClass27_24;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Lclient!gd;")
	public static Class27 aClass27_25;

	@OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
	public static int anInt1638;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!jc;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Lclient!fa;")
	public static Class3_Sub7_Sub1 aClass3_Sub7_Sub1_2 = new Class3_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_715 = Static109.method1737("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_716 = Static109.method1737("chatback");

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_717 = Static109.method1737("sl_back");

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_718 = Static109.method1737("Titelbild geladen)3");

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
	public static int anInt1637 = 0;

	@OriginalMember(owner = "client!ke", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_719 = Static109.method1737("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z")
	public static boolean method1105() {
		@Pc(5) Class5 local5 = Static41.aClass5_1;
		synchronized (Static41.aClass5_1) {
			if (Static12.anInt316 == Static87.anInt2094) {
				return false;
			} else {
				Static20.anInt702 = Static20.anIntArray70[Static12.anInt316];
				Static122.anInt2839 = Static97.anIntArray313[Static12.anInt316];
				Static12.anInt316 = Static12.anInt316 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!na;Z)I")
	public static int method1106(@OriginalArg(0) Class53 arg0) {
		if (Static87.anInt2095 == 1) {
			return 7;
		} else if (arg0.method1291(Static116.aClass53_1332)) {
			return 1;
		} else if (arg0.method1291(Static31.aClass53_422)) {
			return 1;
		} else if (arg0.method1291(Static81.aClass53_928)) {
			return 2;
		} else if (arg0.method1291(Static45.aClass53_574)) {
			return 2;
		} else if (arg0.method1291(Static23.aClass53_296)) {
			return 3;
		} else if (arg0.method1291(Static43.aClass53_551)) {
			return 4;
		} else if (arg0.method1291(Static76.aClass53_848)) {
			return 5;
		} else if (arg0.method1291(Static8.aClass53_92)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method1107() {
		aClass53_716 = null;
		aClass53_715 = null;
		aClass27_24 = null;
		aClass27_25 = null;
		aClass53_717 = null;
		aClass38_1 = null;
		aClass53_718 = null;
		aClass3_Sub7_Sub1_2 = null;
		aClass53_719 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!na;Lclient!ob;)I")
	public static int method1108(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		@Pc(11) int local11 = arg1.anInt964;
		arg1.method645(arg0.anInt1890);
		arg1.anInt964 += Static95.aClass57_1.method1437(arg0.anInt1890, arg1.anInt964, 0, arg1.aByteArray15, arg0.aByteArray43);
		return arg1.anInt964 - local11;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public static void method1109() {
		if (Static75.aClass3_Sub1_Sub15_4 == null) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub15 local14 = Static75.aClass3_Sub1_Sub15_4;
		@Pc(18) Class3_Sub1_Sub15 local18 = Static16.method237(local14);
		if (local18 == null) {
			Static75.aClass3_Sub1_Sub15_4 = null;
			return;
		}
		Static32.anInt1081++;
		@Pc(31) int[] local31 = Static33.method1394(local18);
		@Pc(35) int[] local35 = Static33.method1394(local14);
		@Pc(40) int local40 = Static99.anInt2348 - Static121.anInt2824;
		@Pc(45) int local45 = Static105.anInt2433 - Static50.anInt2788;
		if (local14.anInt2684 >= local40 && local40 >= -local14.anInt2684 && local45 <= local14.anInt2684 && -local14.anInt2684 <= local45 && !Static85.aBoolean78) {
			local40 = 0;
			local45 = 0;
		} else if (local14.anInt2718 < Static32.anInt1081 || Static85.aBoolean78) {
			Static85.aBoolean78 = true;
		} else {
			local40 = 0;
			local45 = 0;
		}
		@Pc(108) int local108 = local45 + local35[1] - local31[1];
		@Pc(119) int local119 = local35[0] + local40 - local31[0];
		if (local119 < 0) {
			local119 = 0;
		}
		if (local108 < 0) {
			local108 = 0;
		}
		if (local18.anInt2727 < local14.anInt2727 + local119) {
			local119 = local18.anInt2727 - local14.anInt2727;
		}
		if (local18.anInt2703 < local14.anInt2703 + local108) {
			local108 = local18.anInt2703 - local14.anInt2703;
		}
		if (Static75.aClass3_Sub1_Sub15_4.anObjectArray6 != null && Static85.aBoolean78) {
			Static12.method188(0, local108, local14, local119, null, local14.anObjectArray6);
		}
		if (Static53.anInt2087 != 0) {
			return;
		}
		if (Static85.aBoolean78) {
			@Pc(229) int local229 = Static99.anInt2348 - local31[0];
			@Pc(235) int local235 = Static105.anInt2433 - local31[1];
			if (local229 < 0) {
				local229 = 0;
			}
			if (local18.anInt2727 - 1 < local229) {
				local229 = local18.anInt2727 - 1;
			}
			if (local235 < 0) {
				local235 = 0;
			}
			if (local18.anInt2703 - 1 < local235) {
				local235 = local18.anInt2703 - 1;
			}
			@Pc(278) Class3_Sub1_Sub15 local278 = Static5.method115(local18, local235, local229, local14);
			if (Static75.aClass3_Sub1_Sub15_4.anObjectArray13 != null) {
				Static12.method188(0, local108, local14, local119, local278, local14.anObjectArray13);
			}
			if (local278 != null && Static90.method1465(local14) != null) {
				Static115.aClass3_Sub7_Sub1_3.method662(224);
				Static115.aClass3_Sub7_Sub1_3.method622(local278.anInt2693);
				Static115.aClass3_Sub7_Sub1_3.method646(local278.anInt2686);
				Static115.aClass3_Sub7_Sub1_3.method623(local14.anInt2686);
				Static115.aClass3_Sub7_Sub1_3.method644(local14.anInt2693);
			}
		} else {
			if (Static75.aClass3_Sub1_Sub15_4.anObjectArray8 != null) {
				Static12.method188(0, local108, local14, local119, null, local14.anObjectArray8);
			}
			if ((Static126.anInt2183 == 1 || Static77.method1358(Static36.anInt1122 - 1)) && Static36.anInt1122 > 2) {
				Static13.method208();
			} else if (Static36.anInt1122 > 0) {
				Static71.method1206(Static36.anInt1122 - 1);
			}
		}
		Static75.aClass3_Sub1_Sub15_4 = null;
		return;
	}
}
