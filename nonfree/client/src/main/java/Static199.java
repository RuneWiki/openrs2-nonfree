import jagex3.jagmisc.jagmisc;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public static int anInt3571;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
	public static int anInt3573;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!ov;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLjava/lang/String;ZB)V")
	public static void method3075(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (Static80.aClass35_1 == Static230.aClass35_2 && Static300.anInt5196 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg1.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static38.aBoolean35 = true;
				Static61.method1151("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static38.aBoolean35 = false;
				Static61.method1151("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static61.method1151("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(77) Throwable local77) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static22.anInt381 = 0;
				Static458.anInt7716 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static125.aClass194_3.method4583();
				Static61.method1151("Text coords cleared");
				return;
			}
			@Pc(124) int local124;
			@Pc(106) int local106;
			@Pc(115) Runtime local115;
			if (arg1.equalsIgnoreCase("gc")) {
				Static341.method4764();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local115 = Runtime.getRuntime();
				local124 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static61.method1151("mem=" + local124 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static341.method4764();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local115 = Runtime.getRuntime();
				local124 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static61.method1151("Memory before cleanup=" + local124 + "k");
				Static9.method138();
				Static341.method4764();
				for (@Pc(181) int local181 = 0; local181 < 10; local181++) {
					System.gc();
				}
				local124 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static61.method1151("Memory after cleanup=" + local124 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static61.method1151("Number of player models in cache:" + Static386.method5389());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static61.method1151("Dropped client connection");
				if (Static345.anInt5823 == 9) {
					Static234.method3419();
				} else if (Static345.anInt5823 == 10) {
					Static346.aBoolean409 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static338.aClass191_3.method4513();
				Static61.method1151("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static338.aClass191_3.method4510();
				Static61.method1151("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static32.aClass51_1.method1377();
				Static328.aClass116_1.method2923();
				Static338.aClass191_3.method4509();
				Static61.method1151("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static409.method5642();
				Static138.method2121();
				Static61.method1151("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static435.method5879(-1, 1, -1, false);
				if (Static282.method3967() == 1) {
					Static61.method1151("wm1 succeeded");
					return;
				}
				Static61.method1151("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static435.method5879(-1, 2, -1, false);
				if (Static282.method3967() != 2) {
					Static61.method1151("wm2 failed");
					return;
				}
				Static61.method1151("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static435.method5879(1024, 3, 768, false);
				if (Static282.method3967() == 3) {
					Static61.method1151("wm3 succeeded");
					return;
				}
				Static61.method1151("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static299.method4264(0);
				if (Static402.anInt6656 == 0) {
					Static61.method1151("Entered tk0");
					Static39.aClass79_Sub1_1.anInt2161 = 0;
					Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
					Static171.aBoolean244 = false;
					return;
				}
				Static61.method1151("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static299.method4264(1);
				if (Static402.anInt6656 != 1) {
					Static61.method1151("Failed to enter tk1");
					return;
				}
				Static61.method1151("Entered tk1");
				Static39.aClass79_Sub1_1.anInt2161 = 1;
				Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
				Static171.aBoolean244 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static299.method4264(2);
				if (Static402.anInt6656 != 2) {
					Static61.method1151("Failed to enter tk2");
					return;
				}
				Static61.method1151("Entered tk2");
				Static39.aClass79_Sub1_1.anInt2161 = 2;
				Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
				Static171.aBoolean244 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static299.method4264(3);
				if (Static402.anInt6656 == 3) {
					Static61.method1151("Entered tk3");
					return;
				}
				Static61.method1151("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static39.aClass79_Sub1_1.aBoolean154 = !Static39.aClass79_Sub1_1.aBoolean154;
				Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
				Static171.aBoolean244 = false;
				Static409.method5642();
				Static61.method1151("ot=" + Static39.aClass79_Sub1_1.aBoolean154);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static39.aClass79_Sub1_1.aBoolean149 = !Static39.aClass79_Sub1_1.aBoolean149;
				Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
				Static171.aBoolean244 = false;
				Static409.method5642();
				Static61.method1151("gb=" + Static39.aClass79_Sub1_1.aBoolean149);
				return;
			}
			@Pc(569) int local569;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static61.method1151("Invalid shadows value");
					return;
				}
				@Pc(557) String local557 = arg1.substring(8);
				local569 = Static38.method611(local557) ? Static160.method2518(local557) : -1;
				if (local569 >= 0 && local569 <= 2) {
					Static39.aClass79_Sub1_1.method1937(Static402.anInt6656, local569);
					Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
					Static171.aBoolean244 = false;
					Static409.method5642();
					Static61.method1151("shadows=" + local569);
					return;
				}
				Static61.method1151("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static39.aClass79_Sub1_1.aBoolean161 = !Static39.aClass79_Sub1_1.aBoolean161;
				Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
				Static171.aBoolean244 = false;
				Static444.method5197();
				Static409.method5642();
				Static61.method1151("textures=" + Static39.aClass79_Sub1_1.aBoolean161);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static61.method1151("Invalid buildarea value");
					return;
				}
				local106 = Static160.method2518(arg1.substring(6));
				if (local106 >= 0 && local106 <= Static141.method2175(Static61.anInt1155)) {
					Static39.aClass79_Sub1_1.anInt2159 = local106;
					Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
					Static171.aBoolean244 = false;
					Static61.method1151("maxbuildarea=" + Static39.aClass79_Sub1_1.anInt2159);
					return;
				}
				Static61.method1151("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static61.method1151("Invalid particles value");
					return;
				}
				Static377.method5243(Static160.method2518(arg1.substring(13)));
				Static39.aClass79_Sub1_1.method1953(Static32.aClass51_1);
				Static171.aBoolean244 = false;
				Static61.method1151("particles=" + Static96.method1664());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static61.method1151("Invalid rect_debug value");
					return;
				}
				Static87.anInt1588 = Static160.method2518(arg1.substring(10).trim());
				Static61.method1151("rect_debug=" + Static87.anInt1588);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static64.aBoolean82 = true;
				Static61.method1151("qa_op_test=" + Static64.aBoolean82);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static229.aBoolean282 = !Static229.aBoolean282;
				Static61.method1151("clipcomponents=" + Static229.aBoolean282);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(815) boolean local815 = Static413.aClass167_11.method6019();
				if (Static340.method4761(!local815)) {
					if (local815) {
						Static61.method1151("Bloom disabled");
						return;
					}
					Static61.method1151("Bloom enabled");
					return;
				}
				Static61.method1151("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static454.aBoolean509) {
					Static454.aBoolean509 = true;
					Static61.method1151("Forced tweening ENABLED!");
					return;
				}
				Static454.aBoolean509 = false;
				Static61.method1151("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static310.aBoolean386) {
					Static61.method1151("Shift-click disabled.");
					Static310.aBoolean386 = false;
					return;
				}
				Static61.method1151("Shift-click ENABLED!");
				Static310.aBoolean386 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static61.method1151("x:" + (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7) + " z:" + (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static61.method1151("Height: " + Static178.aClass55Array1[Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101].oa(Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 >> 7, Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static8.aClass250_2.method5801();
				Static8.aClass250_2.method5794();
				Static462.aClass182_4.method4368();
				Static212.aClass45_3.method1251();
				Static138.method2121();
				Static61.method1151("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static413.aClass167_11.method5949()) {
					Static61.method1151("Current toolkit doesn't support multiple cores");
					return;
				}
				local106 = Integer.parseInt(arg1.substring(3));
				if (local106 < 1) {
					local106 = 1;
				} else if (local106 > 4) {
					local106 = 4;
				}
				Static326.anInt5454 = local106;
				Static413.aClass167_11.method6022(Static326.anInt5454);
				Static413.aClass167_11.method6000(0);
				Static61.method1151("Render cores now: " + Static326.anInt5454);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static61.method1151("I(s): " + Static89.aClass268_15.method6162() + "/" + Static89.aClass268_15.method6169());
				Static61.method1151("I(m): " + Static425.aClass268_21.method6162() + "/" + Static425.aClass268_21.method6169());
				Static61.method1151("O(s): " + Static158.aClass272_1.aClass257_1.method5887() + "/" + Static158.aClass272_1.aClass257_1.method5875());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static61.method1151("Pos: " + Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 + "," + (Static59.anInt1127 + (Static266.anInt4433 >> 7) >> 6) + "," + ((Static152.anInt7561 >> 7) + Static49.anInt873 >> 6) + "," + (Static59.anInt1127 + (Static266.anInt4433 >> 7) & 0x3F) + "," + (Static49.anInt873 + (Static152.anInt7561 >> 7) & 0x3F) + " Height: " + (Static181.method4212(Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101, Static152.anInt7561, Static266.anInt4433) - Static410.anInt6946));
				Static61.method1151("Look: " + Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 + "," + (Static59.anInt1127 + anInt3573 >> 6) + "," + (Static49.anInt873 + Static136.anInt2402 >> 6) + "," + (Static59.anInt1127 + anInt3573 & 0x3F) + "," + (Static136.anInt2402 + Static49.anInt873 & 0x3F) + " Height: " + (Static181.method4212(Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101, Static136.anInt2402, anInt3573) - Static218.anInt7513));
				return;
			}
			if (arg1.equals("showocc")) {
				Static260.aBoolean426 = !Static260.aBoolean426;
				Static409.method5642();
				Static61.method1151("showocc=" + Static260.aBoolean426);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static301.aBoolean378 = !Static301.aBoolean378;
				Static409.method5642();
				Static61.method1151("forcewallocc=" + Static301.aBoolean378);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static269.aBoolean256 = !Static269.aBoolean256;
				Static413.aClass167_11.method6020(Static269.aBoolean256);
				Static173.method3102();
				Static61.method1151("showprofiling=" + Static269.aBoolean256);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static61.method1151("Java toolkit: " + Static72.method1303(Static32.aClass51_1));
				Static61.method1151("GL toolkit:   " + Static72.method1303(Static32.aClass51_1));
				Static61.method1151("SSE toolkit:  " + Static72.method1303(Static32.aClass51_1));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static358.aBoolean420 = !Static358.aBoolean420;
				Static61.method1151("nonpcs=" + Static358.aBoolean420);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static18.method334();
				Static61.method1151("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local106 = Integer.parseInt(arg1.substring(12));
				Static68.method1256(Static157.method2462(local106).aString65, local106);
				Static61.method1151("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static61.method1151("w: " + Static367.aClass241_6.anInt6624);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static307.method4633(Static410.aClass163_176);
				Static243.aClass3_Sub25_Sub1_7.method4081(0);
				local106 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
				local569 = arg1.indexOf(" ", 4);
				Static243.aClass3_Sub25_Sub1_7.method4080(arg1.substring(3, local569));
				Static189.method2956(arg1.substring(local569), Static243.aClass3_Sub25_Sub1_7);
				Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local106);
				return;
			}
			if (arg1.equals("heap")) {
				Static61.method1151("Heap: " + Static61.anInt1155 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static174.method2777();
				Static61.method1151("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local106 = 0; local106 < Static59.anIntArray56.length; local106++) {
					if (Static322.aBooleanArray19[local106]) {
						Static59.anIntArray56[local106] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static59.anIntArray56[local106] *= -1;
						}
					}
				}
				Static174.method2777();
				Static61.method1151("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static431.aBoolean491 = true;
				Static138.method2121();
				Static61.method1151("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static431.aBoolean491 = false;
				Static138.method2121();
				Static61.method1151("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static342.method4772();
				Static61.method1151("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static61.method1151(Static429.method5847() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local106 = Integer.parseInt(arg1.substring(9));
				if (local106 >= 0 && local106 <= 4) {
					Static39.aClass79_Sub1_1.anInt2156 = local106;
				}
				Static61.method1151("cpuusage=" + Static39.aClass79_Sub1_1.anInt2156);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local106 = Integer.parseInt(arg1.substring(17));
				Static61.method1151("varpbit=" + Static119.aClass47_1.method1268(local106));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local106 = Integer.parseInt(arg1.substring(14));
				Static61.method1151("varp=" + Static119.aClass47_1.method1267(local106));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static72.method1301(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static72.method1301(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1635) String[] local1635 = Static403.method5514(arg1.substring(12), ' ');
				if (local1635.length >= 2) {
					local569 = local1635.length <= 2 ? 0 : Integer.parseInt(local1635[2]);
					Static383.method5320(local1635[0], local569, local1635[1]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static219.method3206();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static219.method3205();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static219.method3205();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local106 = Integer.parseInt(arg1.substring(8));
				Static413.aClass167_11.method5953(local106);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static61.method1151("Active streams: " + Static440.aClass3_Sub1_Sub2_2.method5095());
				return;
			}
			if (arg1.equals("errormessage")) {
				Static61.method1151(Static382.aClient1.method1037());
				return;
			}
			if (Static345.anInt5823 == 9) {
				Static307.method4633(Static333.aClass163_138);
				Static243.aClass3_Sub25_Sub1_7.method4081(arg1.length() + 3);
				Static243.aClass3_Sub25_Sub1_7.method4081(arg0 ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4081(arg2 ? 1 : 0);
				Static243.aClass3_Sub25_Sub1_7.method4080(arg1);
			}
			if (arg1.startsWith("fps ") && Static230.aClass35_2 != Static80.aClass35_1) {
				Static235.method3434(Static160.method2518(arg1.substring(4)));
				return;
			}
			if (Static345.anInt5823 != 9) {
				Static61.method1151("Unrecogonised commmand when not logged in: " + arg1);
			}
		} catch (@Pc(1794) Exception local1794) {
			Static61.method1151("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3076(@OriginalArg(1) long arg0) {
		Static126.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static126.aCalendar1.get(7);
		@Pc(17) int local17 = Static126.aCalendar1.get(5);
		@Pc(28) int local28 = Static126.aCalendar1.get(2);
		@Pc(32) int local32 = Static126.aCalendar1.get(1);
		@Pc(36) int local36 = Static126.aCalendar1.get(11);
		@Pc(40) int local40 = Static126.aCalendar1.get(12);
		@Pc(44) int local44 = Static126.aCalendar1.get(13);
		return Static246.aStringArray25[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static221.aStringArray43[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!ga;)Lclient!ga;")
	public static Class82 method3077(@OriginalArg(1) Class82 arg0) {
		@Pc(11) Class82 local11 = Static54.method1054(arg0);
		if (local11 == null) {
			local11 = arg0.aClass82_7;
		}
		return local11;
	}
}
