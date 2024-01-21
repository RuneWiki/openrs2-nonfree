import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!oa;")
	public static Class9 aClass9_16;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public static int anInt2114;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!je;")
	public static Class2_Sub8 aClass2_Sub8_1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_740 = Static56.method1206(":tradereq:");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!lc;")
	public static Class31 aClass31_741 = Static56.method1206("Yesterday");

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!lc;")
	public static Class31 aClass31_742 = Static56.method1206("(U2");

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public static int anInt2112 = 0;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!nb;")
	public static Class36 aClass36_5 = new Class36();

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static int anInt2116 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1313() {
		while (true) {
			if (Static3.aClass2_Sub6_Sub1_1.method680(Static87.anInt2339) >= 26) {
				@Pc(16) int local16 = Static3.aClass2_Sub6_Sub1_1.method687(14);
				if (local16 != 16383) {
					if (Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local16] == null) {
						Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local16] = new Class2_Sub1_Sub4_Sub6_Sub2();
					}
					@Pc(33) Class2_Sub1_Sub4_Sub6_Sub2 local33 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[local16];
					Static57.anIntArray383[Static49.anInt2696++] = local16;
					local33.anInt2030 = Static49.anInt2694;
					@Pc(49) int local49 = Static3.aClass2_Sub6_Sub1_1.method687(5);
					@Pc(56) int local56 = Static3.aClass2_Sub6_Sub1_1.method687(1);
					if (local49 > 15) {
						local49 -= 32;
					}
					local33.aClass2_Sub1_Sub8_1 = Static79.method1443(Static3.aClass2_Sub6_Sub1_1.method687(13));
					@Pc(79) int local79 = Static3.aClass2_Sub6_Sub1_1.method687(5);
					if (local79 > 15) {
						local79 -= 32;
					}
					@Pc(90) int local90 = Static3.aClass2_Sub6_Sub1_1.method687(1);
					if (local90 == 1) {
						Static91.anIntArray352[Static64.anInt624++] = local16;
					}
					local33.anInt2003 = local33.aClass2_Sub1_Sub8_1.anInt1855;
					local33.anInt2039 = local33.aClass2_Sub1_Sub8_1.anInt1847;
					local33.anInt2022 = local33.aClass2_Sub1_Sub8_1.anInt1848;
					local33.anInt1984 = local33.aClass2_Sub1_Sub8_1.anInt1856;
					local33.anInt2029 = local33.aClass2_Sub1_Sub8_1.anInt1867;
					local33.anInt2007 = local33.aClass2_Sub1_Sub8_1.anInt1868;
					local33.anInt1994 = local33.aClass2_Sub1_Sub8_1.anInt1863;
					local33.method1278(local56 == 1, local79 + Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0] + local49);
					continue;
				}
			}
			Static3.aClass2_Sub6_Sub1_1.method682();
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1314() {
		aClass31_742 = null;
		aClass31_740 = null;
		aClass36_5 = null;
		aClass2_Sub8_1 = null;
		aClass31_741 = null;
		aClass9_16 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V")
	public static void method1315(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static34.anInt1312 >= 100 && Static12.anInt540 != 1) {
			Static74.method1397(Static5.aClass31_71, 0, Static39.aClass31_531);
		} else if (Static34.anInt1312 >= 200) {
			Static74.method1397(Static5.aClass31_71, 0, Static39.aClass31_531);
		} else {
			@Pc(43) Class31 local43 = Static39.method1010(arg0).method1196();
			for (@Pc(45) int local45 = 0; local45 < Static34.anInt1312; local45++) {
				if (arg0 == Static45.aLongArray4[local45]) {
					Static74.method1397(Static37.method974(new Class31[] { local43, Static27.aClass31_379 }), 0, Static39.aClass31_531);
					return;
				}
			}
			for (@Pc(80) int local80 = 0; local80 < Static88.anInt2367; local80++) {
				if (arg0 == Static16.aLongArray2[local80]) {
					Static74.method1397(Static37.method974(new Class31[] { Static53.aClass31_638, local43, Static86.aClass31_810 }), 0, Static39.aClass31_531);
					return;
				}
			}
			if (!local43.method1199(Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass31_612)) {
				Static51.aClass31Array7[Static34.anInt1312] = local43;
				Static45.aLongArray4[Static34.anInt1312] = arg0;
				Static41.anIntArray246[Static34.anInt1312] = 0;
				Static92.aBoolean81 = true;
				Static34.anInt1312++;
				Static20.aClass2_Sub6_Sub1_11.method684(98);
				Static20.aClass2_Sub6_Sub1_11.method626(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II[B[Lclient!vb;III)V")
	public static void method1316(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class60[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
					if (arg5 + local7 > 0 && local7 + arg5 < 103 && arg0 + local11 > 0 && arg0 + local11 < 103) {
						arg2[local3].anIntArrayArray69[arg5 + local7][local11 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(84) Class2_Sub6 local84 = new Class2_Sub6(arg1);
		for (@Pc(98) int local98 = 0; local98 < 4; local98++) {
			for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
				for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
					Static47.method1105(arg4, local84, arg3, arg5 + local102, 0, local98, local106 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1317() {
		Static79.aClass9_23.method861();
		Static70.aClass2_Sub1_Sub3_Sub1_13.method291(0, 0);
		Static3.anIntArray14 = Static97.method1653(Static3.anIntArray14);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] method1318() {
		@Pc(8) Class2_Sub1_Sub3_Sub2[] local8 = new Class2_Sub1_Sub3_Sub2[Static41.anInt1575];
		for (@Pc(10) int local10 = 0; local10 < Static41.anInt1575; local10++) {
			@Pc(20) Class2_Sub1_Sub3_Sub2 local20 = local8[local10] = new Class2_Sub1_Sub3_Sub2();
			local20.anInt687 = Static15.anInt655;
			local20.anInt689 = Static58.anInt1946;
			local20.anInt691 = Static95.anIntArray366[local10];
			local20.anInt688 = Static76.anIntArray316[local10];
			local20.anInt690 = Static50.anIntArray74[local10];
			local20.anInt686 = Static91.anIntArray346[local10];
			@Pc(50) byte[] local50 = Static77.aByteArrayArray10[local10];
			@Pc(56) int local56 = local20.anInt690 * local20.anInt686;
			local20.anIntArray89 = new int[local56];
			for (@Pc(62) int local62 = 0; local62 < local56; local62++) {
				local20.anIntArray89[local62] = Static67.anIntArray301[local50[local62] & 0xFF];
			}
		}
		Static4.method95();
		return local8;
	}
}
