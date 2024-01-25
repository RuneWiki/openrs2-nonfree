import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lclient!mb;")
	public static Class136[] aClass136Array1;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public static int anInt6536;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "J")
	public static long aLong226 = 0L;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt6535 = -2;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
	public static int[] anIntArray831 = new int[2];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method5567() {
		@Pc(1) Class103 local1 = Static189.aClass103_34;
		synchronized (Static189.aClass103_34) {
			Static189.aClass103_34.method2678();
		}
		local1 = Static179.aClass103_30;
		synchronized (Static179.aClass103_30) {
			Static179.aClass103_30.method2678();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIBIIIII)V")
	public static void method5568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class7_Sub24 local7 = new Class7_Sub24();
		local7.anInt3853 = arg6;
		local7.anInt3858 = arg3;
		local7.anInt3850 = arg9;
		local7.anInt3863 = arg2;
		local7.anInt3849 = arg0;
		local7.anInt3860 = arg8;
		local7.anInt3859 = arg4;
		local7.anInt3857 = arg10;
		local7.anInt3862 = arg5;
		local7.anInt3856 = arg1;
		local7.anInt3854 = arg7;
		local7.anInt3851 = arg11;
		Static28.aClass74_3.method1802(local7);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (Static151.anInt3239 == 0 && Static244.anInt4842 < 2) {
			return;
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static198.aBoolean307 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static198.aBoolean307 = false;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static187.aClass191_4.method4865();
			}
			@Pc(43) int local43;
			@Pc(53) Runtime local53;
			@Pc(62) int local62;
			if (arg1.equalsIgnoreCase("gc")) {
				Static244.method4213();
				for (local43 = 0; local43 < 10; local43++) {
					System.gc();
				}
				local53 = Runtime.getRuntime();
				local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static59.method1195("mem=" + local62 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static244.method4213();
				for (local43 = 0; local43 < 10; local43++) {
					System.gc();
				}
				local53 = Runtime.getRuntime();
				local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static59.method1195("Memory before cleanup=" + local62 + "k");
				Static161.method3079();
				Static244.method4213();
				for (@Pc(116) int local116 = 0; local116 < 10; local116++) {
					System.gc();
				}
				local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static59.method1195("Memory after cleanup=" + local62 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static59.method1195("Number of player models in cache:" + Static345.method5564());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static141.method2850();
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static229.aClass160_3.method4105();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static229.aClass160_3.method4112();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static116.aClass21_4.method379();
				Static193.aClass61_1.method1381();
				Static229.aClass160_3.method4103();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static33.method684();
				Static168.method3213();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static216.method3821(false, -1, 1, -1);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static216.method3821(false, -1, 2, -1);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static216.method3821(false, 768, 3, 1024);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static244.method4219(0);
				Static244.anInt4807 = 0;
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static244.method4219(1);
				Static244.anInt4807 = 1;
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static244.method4219(2);
				Static244.anInt4807 = 2;
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static244.method4219(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static70.aBoolean128 = !Static70.aBoolean128;
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
				Static33.method684();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static53.aBoolean112 = !Static53.aBoolean112;
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
				Static33.method684();
			}
			if (arg1.startsWith("shadows ")) {
				Static336.anInt4180 = Static281.method4414(arg1.substring(8));
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
				Static33.method684();
			}
			if (arg1.startsWith("setba")) {
				Static186.anInt3771 = Static281.method4414(arg1.substring(6));
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static218.method3851(Static281.method4414(arg1.substring(13)));
				Static244.method4220(Static116.aClass21_4);
				Static35.aBoolean77 = false;
			}
			if (arg1.startsWith("fps ") && Static151.anInt3239 != 0) {
				Static194.method1515(Static281.method4414(arg1.substring(4)));
			}
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.startsWith("rect_debug")) {
				Static144.anInt3133 = Static281.method4414(arg1.substring(10).trim());
				Static59.method1195("rect_debug=" + Static144.anInt3133);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static105.aBoolean439 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static123.aBoolean493 = !Static123.aBoolean493;
				Static59.method1195("clipcomponents=" + Static123.aBoolean493);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(439) boolean local439 = Static128.aClass89_3.method5441();
				if (!Static290.method4752(!local439)) {
					Static59.method1195("Failed to enable bloom");
				} else if (local439) {
					Static59.method1195("Bloom disabled");
				} else {
					Static59.method1195("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static214.aBoolean327) {
					Static214.aBoolean327 = false;
					Static59.method1195("Forced tweening disabled.");
				} else {
					Static214.aBoolean327 = true;
					Static59.method1195("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static339.aBoolean467) {
					Static59.method1195("Shift-click disabled.");
					Static339.aBoolean467 = false;
				} else {
					Static59.method1195("Shift-click ENABLED!");
					Static339.aBoolean467 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static59.method1195("x:" + (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7) + " z:" + (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static59.method1195("Height: " + Static331.aClass8Array5[Static168.anInt3508].method4173(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static312.aClass180_89.method4565();
				Static312.aClass180_89.method4558();
				Static318.method469();
				Static168.method3213();
			}
			if (arg1.startsWith("mc")) {
				if (Static128.aClass89_3.method5458()) {
					local43 = Integer.parseInt(arg1.substring(3));
					if (local43 < 1) {
						local43 = 1;
					} else if (local43 > 4) {
						local43 = 4;
					}
					Static55.anInt1454 = local43;
					Static128.aClass89_3.method5400(Static55.anInt1454);
					Static128.aClass89_3.method5420(0);
					Static59.method1195("Render cores now: " + Static55.anInt1454);
				} else {
					Static59.method1195("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static59.method1195("I(s): " + Static21.aClass103_2.method2689() + "/" + Static21.aClass103_2.method2677());
				Static59.method1195("I(m): " + Static131.aClass103_26.method2689() + "/" + Static131.aClass103_26.method2677());
				Static59.method1195("O(s): " + Static17.aClass62_3.method1387() + "/" + Static17.aClass62_3.method1390());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static59.method1195("Pos: " + Static168.anInt3508 + "," + ((Static203.anInt4014 >> 7) + Static350.anInt6609 >> 6) + "," + ((Static24.anInt478 >> 7) + Static237.anInt4696 >> 6) + "," + (Static350.anInt6609 + (Static203.anInt4014 >> 7) & 0x3F) + "," + ((Static24.anInt478 >> 7) + Static237.anInt4696 & 0x3F) + " Height: " + (Static341.method5540(Static168.anInt3508, Static24.anInt478, Static203.anInt4014) - Static271.anInt5361));
				Static59.method1195("Look: " + Static168.anInt3508 + "," + (Static350.anInt6609 + Static121.anInt2750 >> 6) + "," + (Static175.anInt3621 + Static237.anInt4696 >> 6) + "," + (Static350.anInt6609 + Static121.anInt2750 & 0x3F) + "," + (Static237.anInt4696 + Static175.anInt3621 & 0x3F) + " Height: " + (Static341.method5540(Static168.anInt3508, Static175.anInt3621, Static121.anInt2750) - Static42.anInt1100));
			}
			if (arg1.equals("showocc")) {
				Static63.aBoolean406 = !Static63.aBoolean406;
				Static33.method684();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static227.aBoolean460 = !Static227.aBoolean460;
				Static128.aClass89_3.method5397(Static227.aBoolean460);
				Static315.method5105();
			}
			if (arg1.equals("nonpcs")) {
				Static341.aBoolean470 = !Static341.aBoolean470;
			}
			if (arg1.equals("autoworld")) {
				Static302.method5507();
			}
			if (arg1.equals("heap")) {
				Static59.method1195("Heap: " + Static194.anInt1874 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static288.method1007();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local43 = 0; local43 < Static165.anIntArray464.length; local43++) {
					if (Static120.aBooleanArray17[local43]) {
						Static165.anIntArray464[local43] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static165.anIntArray464[local43] *= -1;
						}
					}
				}
				Static288.method1007();
			}
			if (arg1.equals("showcolmap")) {
				Static275.aBoolean405 = true;
				Static168.method3213();
			}
			if (arg1.equals("hidecolmap")) {
				Static275.aBoolean405 = false;
				Static168.method3213();
			}
			if (arg1.equals("resetcache")) {
				Static143.method3641();
			}
			if (arg1.equals("profilecpu")) {
				Static59.method1195(Static86.method1825() + "ms");
			}
			if (Static85.anInt2215 == 30) {
				Static29.aClass7_Sub3_Sub2_1.method2799(141);
				Static29.aClass7_Sub3_Sub2_1.method2735(arg1.length() + 2);
				Static29.aClass7_Sub3_Sub2_1.method2735(arg0 ? 1 : 0);
				Static29.aClass7_Sub3_Sub2_1.method2738(arg1);
				return;
			}
		} catch (@Pc(968) Exception local968) {
			Static59.method1195("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!ce;II)V")
	public static void method5571(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) long local14 = (long) (arg2 | arg3 << 28 | arg0 << 14);
		@Pc(20) Class7_Sub35 local20 = (Class7_Sub35) Static185.aClass10_33.method163(local14);
		if (local20 == null) {
			local20 = new Class7_Sub35();
			Static185.aClass10_33.method161(local14, local20);
			local20.aClass74_35.method1802(arg1);
			return;
		}
		@Pc(47) Class138 local47 = Static17.method4472(arg1.anInt1050);
		@Pc(50) int local50 = local47.anInt4010;
		if (local47.anInt4004 == 1) {
			local50 *= arg1.anInt1054 + 1;
		}
		for (@Pc(69) Class7_Sub5 local69 = (Class7_Sub5) local20.aClass74_35.method1793(); local69 != null; local69 = (Class7_Sub5) local20.aClass74_35.method1798()) {
			local47 = Static17.method4472(local69.anInt1050);
			@Pc(78) int local78 = local47.anInt4010;
			if (local47.anInt4004 == 1) {
				local78 *= local69.anInt1054 + 1;
			}
			if (local50 > local78) {
				Static183.method3348(arg1, local69);
				return;
			}
		}
		local20.aClass74_35.method1802(arg1);
	}
}
