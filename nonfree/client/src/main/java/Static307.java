import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "Lclient!via;")
	public static Class358 aClass358_2;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)I")
	public static int method5177() {
		@Pc(15) int local15;
		if (Static87.aClass6_Sub33_6.aClass14_Sub2_1.method715() == 0) {
			for (local15 = 0; local15 < Static564.anInt9701; local15++) {
				if (Static37.anInterface8Array1[local15].method2083() == 's' || Static37.anInterface8Array1[local15].method2083() == 'S') {
					Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub2_1);
					Static153.aBoolean281 = true;
					break;
				}
			}
		}
		@Pc(63) int local63;
		if (Static91.aClass90_1 == Static140.aClass90_3) {
			@Pc(54) Runtime local54 = Runtime.getRuntime();
			local63 = (int) ((local54.totalMemory() - local54.freeMemory()) / 1024L);
			@Pc(66) long local66 = Static582.method8056();
			if (Static324.aLong177 == 0L) {
				Static324.aLong177 = local66;
			}
			if (local63 > 16384 && local66 - Static324.aLong177 < 5000L) {
				if (local66 - Static106.aLong160 > 1000L) {
					System.gc();
					Static106.aLong160 = local66;
				}
				return 0;
			}
		}
		if (Static91.aClass90_1 == Static140.aClass90_4) {
			if (Static301.aClass126_1 == null) {
				Static301.aClass126_1 = new Class126(Static633.aClass152_3, Static314.aClass267_2, Static522.aBigInteger5, Static130.aBigInteger8);
			}
			if (!Static301.aClass126_1.method3586()) {
				return 0;
			}
			Static553.method7740((String) null, 0, true);
			Static246.aBoolean433 = !Static214.method3815();
			Static3.aClass223_1 = Static428.method6627(false, 1, Static246.aBoolean433 ? 34 : 32);
			Static85.aClass223_35 = Static428.method6627(false, 1, 33);
			Static74.aClass223_31 = Static428.method6627(false, 1, 13);
		}
		@Pc(157) boolean local157;
		if (Static91.aClass90_1 == Static140.aClass90_5) {
			local157 = Static85.aClass223_35.method5939();
			local63 = Static180.aClass193_Sub1Array1[33].method5579();
			local63 += Static180.aClass193_Sub1Array1[Static246.aBoolean433 ? 34 : 32].method5579();
			local63 += Static180.aClass193_Sub1Array1[13].method5579();
			local63 += local157 ? 100 : Static85.aClass223_35.method5971();
			if (local63 != 400) {
				return local63 / 4;
			}
			Static500.anInt9328 = Static3.aClass223_1.method5944();
			Static218.anInt4659 = Static85.aClass223_35.method5944();
			Static155.method3067(Static3.aClass223_1);
			@Pc(218) int local218 = Static87.aClass6_Sub33_6.aClass14_Sub4_1.method2188();
			Static7.aClass293_1 = new Class293(Static8.aClass290_1, Static638.anInt10709, Static85.aClass223_35);
			@Pc(230) int[] local230 = Static7.aClass293_1.method7194(local218);
			if (local230.length == 0) {
				local230 = Static7.aClass293_1.method7194(0);
			}
			@Pc(244) Class366 local244 = new Class366(Static3.aClass223_1, Static74.aClass223_31);
			if (local230.length > 0) {
				Static294.anInterface12Array1 = new Interface12[local230.length];
				for (@Pc(253) int local253 = 0; local253 < Static294.anInterface12Array1.length; local253++) {
					Static294.anInterface12Array1[local253] = new Class226(Static7.aClass293_1.method7195(local230[local253]), local244);
				}
			}
		}
		if (Static91.aClass90_1 == Static140.aClass90_6) {
			Static146.method6220(Static74.aClass223_31, Static228.method4134(), Static3.aClass223_1);
		}
		if (Static91.aClass90_1 == Static140.aClass90_7) {
			local15 = Static615.method8459();
			local63 = Static72.method2063();
			if (local63 > local15) {
				return local15 * 100 / local63;
			}
		}
		if (Static140.aClass90_8 == Static91.aClass90_1) {
			if (Static294.anInterface12Array1 != null && Static294.anInterface12Array1.length > 0) {
				if (Static294.anInterface12Array1[0].method7298() < 100) {
					return 0;
				}
				if (Static294.anInterface12Array1.length > 1 && Static7.aClass293_1.method7196() && Static294.anInterface12Array1[1].method7298() < 100) {
					return 0;
				}
			}
			Static328.method5504(Static467.aClass5_13);
			Static559.method7848(Static467.aClass5_13);
			Static119.method2558(1);
		}
		if (Static91.aClass90_1 == Static140.aClass90_9) {
			for (local15 = 0; local15 < 4; local15++) {
				Static313.aClass258Array1[local15] = Static521.method8021(Static108.anInt2930, Static306.anInt6176);
			}
		}
		if (Static91.aClass90_1 == Static140.aClass90_10) {
			Static436.aClass223_98 = Static428.method6627(false, 1, 8);
			Static167.aClass223_46 = Static428.method6627(false, 1, 0);
			Static558.aClass223_131 = Static428.method6627(false, 1, 1);
			Static75.aClass223_32 = Static428.method6627(false, 1, 2);
			Static482.aClass223_113 = Static428.method6627(false, 1, 3);
			Static168.aClass223_47 = Static428.method6627(false, 1, 4);
			Static415.aClass223_90 = Static428.method6627(true, 1, 5);
			Static5.aClass223_2 = Static428.method6627(true, 1, 6);
			Static450.aClass223_101 = Static428.method6627(false, 1, 7);
			Static269.aClass223_138 = Static428.method6627(false, 1, 9);
			Static457.aClass223_104 = Static428.method6627(false, 1, 10);
			Static119.aClass223_40 = Static428.method6627(false, 1, 11);
			Static105.aClass223_38 = Static428.method6627(false, 1, 12);
			Static360.aClass223_74 = Static428.method6627(false, 1, 14);
			Static312.aClass223_66 = Static428.method6627(false, 1, 15);
			Static640.aClass223_144 = Static428.method6627(false, 1, 16);
			Static395.aClass223_85 = Static428.method6627(false, 1, 17);
			Static415.aClass223_91 = Static428.method6627(false, 1, 18);
			Static376.aClass223_79 = Static428.method6627(false, 1, 19);
			Static183.aClass223_139 = Static428.method6627(false, 1, 20);
			Static131.aClass223_41 = Static428.method6627(false, 1, 21);
			Static356.aClass223_73 = Static428.method6627(false, 1, 22);
			Static453.aClass223_102 = Static428.method6627(true, 1, 23);
			Static152.aClass223_42 = Static428.method6627(false, 1, 24);
			Static556.aClass223_129 = Static428.method6627(false, 1, 25);
			Static482.aClass223_112 = Static428.method6627(true, 1, 26);
			Static433.aClass223_97 = Static428.method6627(false, 1, 27);
			Static446.aClass223_100 = Static428.method6627(true, 1, 28);
			Static401.aClass223_87 = Static428.method6627(false, 1, 29);
			Static433.aClass223_96 = Static428.method6627(true, 1, 30);
			Static382.aClass223_83 = Static428.method6627(true, 1, 31);
			Static91.aClass223_36 = Static428.method6627(true, 2, 36);
		}
		if (Static140.aClass90_11 == Static91.aClass90_1) {
			local15 = 0;
			for (local63 = 0; local63 < 37; local63++) {
				if (Static180.aClass193_Sub1Array1[local63] != null) {
					local15 += Static180.aClass193_Sub1Array1[local63].method5579() * Static143.anIntArray130[local63] / 100;
				}
			}
			if (local15 != 100) {
				if (Static268.anInt5776 < 0) {
					Static268.anInt5776 = local15;
				}
				return (local15 - Static268.anInt5776) * 100 / (100 - Static268.anInt5776);
			}
			Static3.method55(Static436.aClass223_98);
			Static146.method6220(Static74.aClass223_31, Static228.method4134(), Static436.aClass223_98);
		}
		if (Static91.aClass90_1 == Static140.aClass90_12) {
			if (Static167.anInt3749 == -1) {
				Static167.anInt3749 = Static5.aClass223_2.method5959("scape main");
			}
			Static182.method3420();
			Static119.method2558(2);
		}
		if (Static91.aClass90_1 == Static140.aClass90_13) {
			Static622.method8524(Static433.aClass223_96, Static496.aClass104_4);
		}
		if (Static140.aClass90_14 == Static91.aClass90_1) {
			local15 = Static243.method3831();
			if (local15 < 100) {
				return local15;
			}
			Static487.method7136(Static446.aClass223_100.method5942(1));
			Static297.method5088(Static446.aClass223_100.method5942(3));
		}
		if (Static140.aClass90_15 == Static91.aClass90_1) {
			if (Static151.anInt3538 != -1 && !Static450.aClass223_101.method5960(0, Static151.anInt3538)) {
				return 99;
			}
			Static295.anInterface7_9 = new Class274(Static482.aClass223_112, Static269.aClass223_138, Static436.aClass223_98);
			Static69.aClass369_1 = new Class369(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static629.aClass271_1 = new Class271(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static40.aClass19_1 = new Class19(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32, Static436.aClass223_98);
			Static251.aClass43_1 = new Class43(Static8.aClass290_1, Static638.anInt10709, Static395.aClass223_85);
			Static365.aClass46_4 = new Class46(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static153.aClass167_1 = new Class167(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static205.aClass137_4 = new Class137(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32, Static436.aClass223_98);
			Static287.aClass99_1 = new Class99(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32, Static450.aClass223_101);
			Static252.aClass15_1 = new Class15(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static37.aClass282_1 = new Class282(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static249.aClass310_1 = new Class310(Static8.aClass290_1, Static638.anInt10709, true, Static640.aClass223_144, Static450.aClass223_101);
			Static385.aClass345_2 = new Class345(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32, Static436.aClass223_98);
			Static386.aClass341_2 = new Class341(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32, Static436.aClass223_98);
			Static8.aClass309_1 = new Class309(Static8.aClass290_1, Static638.anInt10709, true, Static415.aClass223_91, Static450.aClass223_101);
			Static356.aClass221_1 = new Class221(Static8.aClass290_1, Static638.anInt10709, true, Static69.aClass369_1, Static376.aClass223_79, Static450.aClass223_101);
			Static526.aClass21_1 = new Class21(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static528.aClass198_2 = new Class198(Static8.aClass290_1, Static638.anInt10709, Static183.aClass223_139, Static167.aClass223_46, Static558.aClass223_131);
			Static82.aClass74_1 = new Class74(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static181.aClass132_1 = new Class132(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static360.aClass312_2 = new Class312(Static8.aClass290_1, Static638.anInt10709, Static131.aClass223_41, Static450.aClass223_101);
			Static120.aClass278_1 = new Class278(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static176.aClass255_1 = new Class255(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static587.aClass148_1 = new Class148(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static39.aClass214_1 = new Class214(Static8.aClass290_1, Static638.anInt10709, Static356.aClass223_73);
			Static259.aClass156_2 = new Class156(Static8.aClass290_1, Static638.anInt10709, Static75.aClass223_32);
			Static167.method3173(Static482.aClass223_113, Static74.aClass223_31, Static436.aClass223_98, Static450.aClass223_101);
			Static446.method6812(Static401.aClass223_87);
			Static389.aClass228_1 = new Class228(Static638.anInt10709, Static152.aClass223_42, Static556.aClass223_129);
			Static105.aClass291_1 = new Class291(Static638.anInt10709, Static152.aClass223_42, Static556.aClass223_129, new Class269());
			Static543.method7661();
			Static249.aClass310_1.method7480(Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 0);
			Static140.aClass157_1 = new Class157();
			Static174.method3297();
			Static460.method6924(Static433.aClass223_97);
			Static439.method6720(Static450.aClass223_101, Static295.anInterface7_9);
			@Pc(954) Class229 local954 = new Class229(Static457.aClass223_104.method5948("huffman", ""));
			Static507.method7290(local954);
			try {
				jagmisc.init();
			} catch (@Pc(961) Throwable local961) {
			}
			Static97.aClass130_1 = Static198.method3588();
			Static18.aClass6_Sub38_1 = new Class6_Sub38(true, Static496.aClass104_4);
		}
		if (Static91.aClass90_1 == Static140.aClass90_17) {
			local15 = Static520.method7445(Static436.aClass223_98) + Static258.method4589(true);
			local63 = Static599.method8297() + Static72.method2063();
			if (local15 < local63) {
				return local15 * 100 / local63;
			}
		}
		if (Static91.aClass90_1 == Static140.aClass90_18) {
			Static491.method6568(Static453.aClass223_102, Static365.aClass46_4, Static153.aClass167_1, Static249.aClass310_1, Static385.aClass345_2, Static386.aClass341_2, Static140.aClass157_1);
		}
		if (Static140.aClass90_19 == Static91.aClass90_1) {
			Static272.aBooleanArray10 = new boolean[Static587.aClass148_1.anInt5481];
			Static19.aStringArray1 = new String[Static176.aClass255_1.anInt7802];
			Static267.anIntArray256 = new int[Static587.aClass148_1.anInt5481];
			for (local15 = 0; local15 < Static587.aClass148_1.anInt5481; local15++) {
				if (Static587.aClass148_1.method4489(local15).anInt3671 == 0) {
					Static272.aBooleanArray10[local15] = true;
					Static494.anInt8611++;
				}
				Static267.anIntArray256[local15] = -1;
			}
			Static148.method2949();
			Static518.anInt9088 = Static482.aClass223_113.method5959("loginscreen");
			Static41.anInt1433 = Static482.aClass223_113.method5959("lobbyscreen");
			Static415.aClass223_90.method5956(false);
			Static5.aClass223_2.method5956(true);
			Static436.aClass223_98.method5956(true);
			Static74.aClass223_31.method5956(true);
			Static457.aClass223_104.method5956(true);
			Static482.aClass223_113.method5956(true);
			Static573.aBoolean777 = true;
			Static75.aClass223_32.anInt7135 = 2;
			Static395.aClass223_85.anInt7135 = 2;
			Static640.aClass223_144.anInt7135 = 2;
			Static415.aClass223_91.anInt7135 = 2;
			Static376.aClass223_79.anInt7135 = 2;
			Static183.aClass223_139.anInt7135 = 2;
			Static131.aClass223_41.anInt7135 = 2;
		}
		if (Static140.aClass90_20 == Static91.aClass90_1) {
			if (!Static156.method3070(Static518.anInt9088)) {
				return 0;
			}
			local157 = true;
			for (local63 = 0; local63 < Static299.aClass302ArrayArray2[Static518.anInt9088].length; local63++) {
				@Pc(1141) Class302 local1141 = Static299.aClass302ArrayArray2[Static518.anInt9088][local63];
				if (local1141.anInt8936 == 5 && local1141.anInt8860 != -1 && !Static436.aClass223_98.method5960(0, local1141.anInt8860)) {
					local157 = false;
				}
			}
			if (!local157) {
				return 0;
			}
		}
		if (Static91.aClass90_1 == Static140.aClass90_21) {
			Static473.method7028(true);
		}
		if (Static140.aClass90_22 == Static91.aClass90_1) {
			Static272.aClass61_1.method2365();
			try {
				Static450.aThread4.join();
			} catch (@Pc(1200) InterruptedException local1200) {
				return 0;
			}
			Static294.anInterface12Array1 = null;
			Static450.aThread4 = null;
			Static3.aClass223_1 = null;
			Static272.aClass61_1 = null;
			Static85.aClass223_35 = null;
			Static7.aClass293_1 = null;
			Static576.method8014();
			Static325.aBoolean503 = Static87.aClass6_Sub33_6.aClass14_Sub2_1.method715() == 1;
			Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub2_1);
			if (Static325.aBoolean503) {
				Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
			} else if (Static87.aClass6_Sub33_6.aClass14_Sub8_2.aBoolean240 && Static18.aClass6_Sub38_1.anInt7891 < 512 && Static18.aClass6_Sub38_1.anInt7891 != 0) {
				Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
			}
			Static541.method7640();
			if (Static325.aBoolean503) {
				Static237.method4302(0, false);
			} else {
				Static237.method4302(Static87.aClass6_Sub33_6.aClass14_Sub8_2.method2640(), false);
			}
			Static210.method3780(Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282(), -1, -1, false);
			Static328.method5504(Static467.aClass5_13);
			Static559.method7848(Static467.aClass5_13);
			Static273.method4870(Static467.aClass5_13, Static436.aClass223_98);
			Static526.method7484(Static393.aClass4Array11);
		}
		return Static615.method8456();
	}
}
