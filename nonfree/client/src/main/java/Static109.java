import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lclient!tb;")
	public static Class44 aClass44_39;

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "Lclient!tb;")
	public static Class44 aClass44_40;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!oa;")
	private static Class56 aClass56_906 = Static33.method650(" has logged in)3");

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "Lclient!oa;")
	private static Class56 aClass56_910 = Static33.method650("Please contact customer support)3");

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_907 = aClass56_910;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "Lclient!oa;")
	private static Class56 aClass56_909 = Static33.method650("button near the top of that page)3");

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_908 = aClass56_909;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
	public static int anInt1678 = 0;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "Lclient!oa;")
	public static Class56 aClass56_911 = aClass56_906;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_912 = Static33.method650("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lclient!ab;")
	public static Class2 aClass2_5 = new Class2(4096);

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "Lclient!oa;")
	public static Class56 aClass56_913 = aClass56_912;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_914 = Static33.method650(":chalreq:");

	@OriginalMember(owner = "client!tb", name = "gb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_915 = Static33.method650("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_916 = Static33.method650("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "Lclient!oa;")
	public static Class56 aClass56_917 = Static33.method650("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
	public static int anInt1693 = -1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIIII)V")
	public static void method1135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static116.aClass14_1.method436(arg2, arg1, arg4);
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(53) int local53;
		@Pc(69) int local69;
		if (local15 != 0) {
			local24 = Static116.aClass14_1.method429(arg2, arg1, arg4, local15);
			local30 = local24 >> 6 & 0x3;
			local34 = local24 & 0x1F;
			local36 = arg3;
			local53 = arg1 * 4 + (-(arg4 * 512) + 52736) * 4 + 24624;
			if (local15 > 0) {
				local36 = arg0;
			}
			@Pc(63) int[] local63 = Static53.aClass3_Sub1_Sub1_Sub2_3.anIntArray101;
			local69 = local15 >> 14 & 0x7FFF;
			@Pc(73) Class3_Sub1_Sub15 local73 = Static122.method1962(local69);
			if (local73.anInt2739 == -1) {
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						local63[local53] = local36;
						local63[local53 + 512] = local36;
						local63[local53 + 1024] = local36;
						local63[local53 + 1536] = local36;
					} else if (local30 == 1) {
						local63[local53] = local36;
						local63[local53 + 1] = local36;
						local63[local53 + 2] = local36;
						local63[local53 + 3] = local36;
					} else if (local30 == 2) {
						local63[local53 + 3] = local36;
						local63[local53 + 512 + 3] = local36;
						local63[local53 + 3 + 1024] = local36;
						local63[local53 + 1539] = local36;
					} else if (local30 == 3) {
						local63[local53 + 1536] = local36;
						local63[local53 + 1 + 1536] = local36;
						local63[local53 + 1536 + 2] = local36;
						local63[local53 + 1536 + 3] = local36;
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						local63[local53] = local36;
					} else if (local30 == 1) {
						local63[local53 + 3] = local36;
					} else if (local30 == 2) {
						local63[local53 + 1536 + 3] = local36;
					} else if (local30 == 3) {
						local63[local53 + 1536] = local36;
					}
				}
				if (local34 == 2) {
					if (local30 == 3) {
						local63[local53] = local36;
						local63[local53 + 512] = local36;
						local63[local53 + 1024] = local36;
						local63[local53 + 1536] = local36;
					} else if (local30 == 0) {
						local63[local53] = local36;
						local63[local53 + 1] = local36;
						local63[local53 + 2] = local36;
						local63[local53 + 3] = local36;
					} else if (local30 == 1) {
						local63[local53 + 3] = local36;
						local63[local53 + 3 + 512] = local36;
						local63[local53 + 1024 + 3] = local36;
						local63[local53 + 1539] = local36;
					} else if (local30 == 2) {
						local63[local53 + 1536] = local36;
						local63[local53 + 1536 + 1] = local36;
						local63[local53 + 1536 + 2] = local36;
						local63[local53 + 1539] = local36;
					}
				}
			} else {
				@Pc(83) Class3_Sub1_Sub1_Sub4 local83 = Static18.aClass3_Sub1_Sub1_Sub4Array12[local73.anInt2739];
				if (local83 != null) {
					@Pc(96) int local96 = (local73.anInt2743 * 4 - local83.anInt2252) / 2;
					@Pc(106) int local106 = (local73.anInt2745 * 4 - local83.anInt2250) / 2;
					local83.method1504(arg1 * 4 + local106 + 48, local96 + (48 - -((-arg4 + 104 - local73.anInt2743) * 4)));
				}
			}
		}
		local15 = Static116.aClass14_1.method446(arg2, arg1, arg4);
		if (local15 != 0) {
			local24 = Static116.aClass14_1.method429(arg2, arg1, arg4, local15);
			local30 = local24 >> 6 & 0x3;
			local34 = local24 & 0x1F;
			local36 = local15 >> 14 & 0x7FFF;
			@Pc(467) Class3_Sub1_Sub15 local467 = Static122.method1962(local36);
			@Pc(501) int local501;
			if (local467.anInt2739 != -1) {
				@Pc(477) Class3_Sub1_Sub1_Sub4 local477 = Static18.aClass3_Sub1_Sub1_Sub4Array12[local467.anInt2739];
				if (local477 != null) {
					local69 = (local467.anInt2745 * 4 - local477.anInt2250) / 2;
					local501 = (local467.anInt2743 * 4 - local477.anInt2252) / 2;
					local477.method1504(arg1 * 4 + local69 + 48, local501 + (48 - -((-arg4 + 104 + -local467.anInt2743) * 4)));
				}
			} else if (local34 == 9) {
				local501 = arg1 * 4 + (103 - arg4) * 2048 + 24624;
				local53 = 15658734;
				@Pc(550) int[] local550 = Static53.aClass3_Sub1_Sub1_Sub2_3.anIntArray101;
				if (local15 > 0) {
					local53 = 15597568;
				}
				if (local30 == 0 || local30 == 2) {
					local550[local501 + 1536] = local53;
					local550[local501 + 1025] = local53;
					local550[local501 + 512 + 2] = local53;
					local550[local501 + 3] = local53;
				} else {
					local550[local501] = local53;
					local550[local501 + 512 + 1] = local53;
					local550[local501 + 1024 + 2] = local53;
					local550[local501 + 1536 + 3] = local53;
				}
			}
		}
		local15 = Static116.aClass14_1.method419(arg2, arg1, arg4);
		if (local15 == 0) {
			return;
		}
		local24 = local15 >> 14 & 0x7FFF;
		@Pc(641) Class3_Sub1_Sub15 local641 = Static122.method1962(local24);
		if (local641.anInt2739 == -1) {
			return;
		}
		@Pc(650) Class3_Sub1_Sub1_Sub4 local650 = Static18.aClass3_Sub1_Sub1_Sub4Array12[local641.anInt2739];
		if (local650 != null) {
			local36 = (local641.anInt2745 * 4 - local650.anInt2250) / 2;
			@Pc(672) int local672 = (local641.anInt2743 * 4 - local650.anInt2252) / 2;
			local650.method1504(arg1 * 4 + local36 + 48, 48 - (-((-local641.anInt2743 + (104 - arg4)) * 4) - local672));
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1140() {
		aClass56_916 = null;
		aClass56_914 = null;
		aClass56_908 = null;
		aClass56_915 = null;
		aClass56_907 = null;
		aClass56_906 = null;
		aClass56_910 = null;
		aClass56_913 = null;
		aClass56_912 = null;
		aClass56_917 = null;
		aClass44_40 = null;
		aClass2_5 = null;
		aClass56_911 = null;
		aBigInteger2 = null;
		aClass56_909 = null;
		aClass44_39 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)I")
	public static int method1142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIB)V")
	public static void method1144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static94.anInt2473 = -1;
			Static49.anInt1492 = -1;
			return;
		}
		@Pc(37) int local37 = Static27.method560(arg1, Static94.anInt2470, arg2) - arg0;
		@Pc(41) int local41 = local37 - Static111.anInt2863;
		@Pc(45) int local45 = arg2 - Static57.anInt1615;
		@Pc(49) int local49 = Class3_Sub1_Sub1_Sub3.anIntArray116[Static97.anInt2547];
		@Pc(58) int local58 = Class3_Sub1_Sub1_Sub3.anIntArray115[Static97.anInt2547];
		@Pc(62) int local62 = Class3_Sub1_Sub1_Sub3.anIntArray116[Static94.anInt2474];
		@Pc(66) int local66 = arg1 - Static15.anInt433;
		@Pc(70) int local70 = Class3_Sub1_Sub1_Sub3.anIntArray115[Static94.anInt2474];
		@Pc(81) int local81 = local62 * local66 + local45 * local70 >> 16;
		@Pc(91) int local91 = local66 * local70 - local45 * local62 >> 16;
		@Pc(93) int local93 = local81;
		@Pc(103) int local103 = local58 * local41 - local91 * local49 >> 16;
		@Pc(113) int local113 = local58 * local91 + local41 * local49 >> 16;
		if (local113 < 50) {
			Static49.anInt1492 = -1;
			Static94.anInt2473 = -1;
		} else {
			Static94.anInt2473 = (local93 << 9) / local113 + 256;
			Static49.anInt1492 = (local103 << 9) / local113 + 167;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z")
	public static boolean method1156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static116.aClass14_1.method429(Static94.anInt2470, arg0, arg2, arg1);
		if (local18 == -1) {
			return false;
		}
		@Pc(29) int local29 = local18 >> 6 & 0x3;
		@Pc(33) int local33 = local18 & 0x1F;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(74) Class3_Sub1_Sub15 local74 = Static122.method1962(local11);
			@Pc(77) int local77 = local74.anInt2714;
			@Pc(93) int local93;
			@Pc(90) int local90;
			if (local29 == 0 || local29 == 2) {
				local93 = local74.anInt2745;
				local90 = local74.anInt2743;
			} else {
				local90 = local74.anInt2745;
				local93 = local74.anInt2743;
			}
			if (local29 != 0) {
				local77 = (local77 << local29 & 0xF) + (local77 >> 4 - local29);
			}
			Static26.method538(2, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, local90, true, arg2, arg0, local77, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], local93);
		} else {
			Static26.method538(2, local29, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], local33 + 1, 0, true, arg2, arg0, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
		}
		Static69.anInt1924 = 2;
		Static9.anInt224 = Static71.anInt1970;
		Static91.anInt2390 = Static127.anInt3209;
		Static24.anInt705 = 0;
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLclient!td;)Z")
	public static boolean method1157(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		if (Static67.aBoolean105) {
			if (Static34.method652(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2857 == 0) {
				return false;
			}
		}
		return arg0.aBoolean148;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method1158() {
		if (Static36.anInt1014 != 1) {
			return;
		}
		if (Static127.anInt3209 >= 6 && Static127.anInt3209 <= 106 && Static71.anInt1970 >= 467 && Static71.anInt1970 <= 499) {
			Static105.aBoolean120 = true;
			Static66.anInt541 = (Static66.anInt541 + 1) % 4;
			Static12.aBoolean17 = true;
			Static111.aClass3_Sub2_Sub1_4.method325(214);
			Static111.aClass3_Sub2_Sub1_4.method303(Static66.anInt541);
			Static111.aClass3_Sub2_Sub1_4.method303(Static46.anInt2266);
			Static111.aClass3_Sub2_Sub1_4.method303(Static56.anInt1592);
		}
		if (Static127.anInt3209 >= 135 && Static127.anInt3209 <= 235 && Static71.anInt1970 >= 467 && Static71.anInt1970 <= 499) {
			Static12.aBoolean17 = true;
			Static46.anInt2266 = (Static46.anInt2266 + 1) % 3;
			Static105.aBoolean120 = true;
			Static111.aClass3_Sub2_Sub1_4.method325(214);
			Static111.aClass3_Sub2_Sub1_4.method303(Static66.anInt541);
			Static111.aClass3_Sub2_Sub1_4.method303(Static46.anInt2266);
			Static111.aClass3_Sub2_Sub1_4.method303(Static56.anInt1592);
		}
		if (Static127.anInt3209 >= 273 && Static127.anInt3209 <= 373 && Static71.anInt1970 >= 467 && Static71.anInt1970 <= 499) {
			Static12.aBoolean17 = true;
			Static105.aBoolean120 = true;
			Static56.anInt1592 = (Static56.anInt1592 + 1) % 3;
			Static111.aClass3_Sub2_Sub1_4.method325(214);
			Static111.aClass3_Sub2_Sub1_4.method303(Static66.anInt541);
			Static111.aClass3_Sub2_Sub1_4.method303(Static46.anInt2266);
			Static111.aClass3_Sub2_Sub1_4.method303(Static56.anInt1592);
		}
		if (Static127.anInt3209 < 412 || Static127.anInt3209 > 512 || Static71.anInt1970 < 467 || Static71.anInt1970 > 499) {
			return;
		}
		if (Static57.anInt1607 != -1) {
			Static75.method1348(0, Static38.aClass56_574, Static122.aClass56_1633);
			if (Static35.aClass56_550 != null) {
				Static75.method1348(0, Static35.aClass56_550, Static122.aClass56_1633);
				return;
			}
			return;
		}
		Static1.method1();
		if (Static25.anInt756 != -1) {
			Static70.aBoolean87 = false;
			Static122.aClass56_1631 = Static122.aClass56_1633;
			Static43.anInt1143 = Static57.anInt1607 = Static25.anInt756;
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!oa;Lclient!tb;BLclient!oa;)Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 method1161(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) Class56 arg2) {
		@Pc(8) int local8 = arg1.method1148(arg2);
		@Pc(19) int local19 = arg1.method1136(arg0, local8);
		return Static28.method576(local8, local19, arg1);
	}
}
