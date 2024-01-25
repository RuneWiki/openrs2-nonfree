import jagex3.jagmisc.jagmisc;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!ao;")
	public static Class6_Sub3 aClass6_Sub3_1;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	public static final int[] anIntArray65 = new int[13];

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!ep;")
	public static Class93 aClass93_1 = null;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZBLjava/lang/String;)V")
	public static void method980(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		if (Static186.aClass123_6 == Static230.aClass123_8 && Static456.anInt8437 < 2) {
			return;
		}
		if (arg2.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg2.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg2.equalsIgnoreCase("fpson")) {
				Static266.aBoolean375 = true;
				Static280.method3700("fps debug enabled");
				return;
			}
			if (arg2.equalsIgnoreCase("fpsoff")) {
				Static266.aBoolean375 = false;
				Static280.method3700("fps debug disabled");
				return;
			}
			if (arg2.equals("systemmem")) {
				try {
					Static280.method3700("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(79) Throwable local79) {
					return;
				}
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static211.anInt9770 = 0;
				Static63.anInt1505 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("cleartext")) {
				Static58.aClass267_2.method6536();
				Static280.method3700("Text coords cleared");
				return;
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(119) Runtime local119;
			if (arg2.equalsIgnoreCase("gc")) {
				Static104.method6572();
				for (local110 = 0; local110 < 10; local110++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static280.method3700("mem=" + local128 + "k");
				return;
			}
			if (arg2.equalsIgnoreCase("compact")) {
				Static104.method6572();
				for (local110 = 0; local110 < 10; local110++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static280.method3700("Memory before cleanup=" + local128 + "k");
				Static451.method6908();
				Static104.method6572();
				for (@Pc(186) int local186 = 0; local186 < 10; local186++) {
					System.gc();
				}
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static280.method3700("Memory after cleanup=" + local128 + "k");
				return;
			}
			if (arg2.equalsIgnoreCase("unloadnatives")) {
				Static280.method3700(Static105.method2179() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg2.equalsIgnoreCase("pcachesize")) {
				Static280.method3700("Number of player models in cache:" + Static293.method4805());
				return;
			}
			if (arg2.equalsIgnoreCase("clientdrop")) {
				Static280.method3700("Dropped client connection");
				if (Static325.anInt6149 == 10) {
					Static439.method6698();
					return;
				}
				if (Static325.anInt6149 == 11) {
					Static519.aBoolean682 = true;
				}
				return;
			}
			if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
				Static293.aClass275_2.method6665();
				Static280.method3700("Rotated connection methods");
				return;
			}
			if (arg2.equalsIgnoreCase("clientjs5drop")) {
				Static352.aClass228_3.method5718();
				Static280.method3700("Dropped client js5 net queue");
				return;
			}
			if (arg2.equalsIgnoreCase("serverjs5drop")) {
				Static352.aClass228_3.method5722();
				Static280.method3700("Dropped server js5 net queue");
				return;
			}
			if (arg2.equalsIgnoreCase("breakcon")) {
				Static414.aClass246_5.method6139();
				Static52.aClass64_1.method1816();
				Static352.aClass228_3.method5708();
				Static280.method3700("Breaking new connections for 5 seconds");
				return;
			}
			if (arg2.equalsIgnoreCase("rebuild")) {
				Static190.method3621();
				Static514.method7577();
				Static280.method3700("Rebuilding map");
				return;
			}
			if (arg2.equalsIgnoreCase("wm1")) {
				Static98.method2097(1, -1, false, -1);
				if (Static298.method4852() != 1) {
					Static280.method3700("wm1 failed");
					return;
				}
				Static280.method3700("wm1 succeeded");
				return;
			}
			if (arg2.equalsIgnoreCase("wm2")) {
				Static98.method2097(2, -1, false, -1);
				if (Static298.method4852() == 2) {
					Static280.method3700("wm2 succeeded");
					return;
				}
				Static280.method3700("wm2 failed");
				return;
			}
			if (arg2.equalsIgnoreCase("wm3")) {
				Static98.method2097(3, 1024, false, 768);
				if (Static298.method4852() != 3) {
					Static280.method3700("wm3 failed");
					return;
				}
				Static280.method3700("wm3 succeeded");
				return;
			}
			if (arg2.equalsIgnoreCase("tk0")) {
				Static419.method6517(0);
				if (Static5.anInt145 == 0) {
					Static280.method3700("Entered tk0");
					Static104.aClass6_Sub6_Sub1_4.anInt1182 = 0;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				Static280.method3700("Failed to enter tk0");
				return;
			}
			if (arg2.equalsIgnoreCase("tk1")) {
				Static419.method6517(1);
				if (Static5.anInt145 != 1) {
					Static280.method3700("Failed to enter tk1");
					return;
				}
				Static280.method3700("Entered tk1");
				Static104.aClass6_Sub6_Sub1_4.anInt1182 = 1;
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				Static54.aBoolean151 = false;
				return;
			}
			if (arg2.equalsIgnoreCase("tk2")) {
				Static419.method6517(2);
				if (Static5.anInt145 != 2) {
					Static280.method3700("Failed to enter tk2");
					return;
				}
				Static280.method3700("Entered tk2");
				Static104.aClass6_Sub6_Sub1_4.anInt1182 = 2;
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				Static54.aBoolean151 = false;
				return;
			}
			if (arg2.equalsIgnoreCase("tk3")) {
				Static419.method6517(3);
				if (Static5.anInt145 == 3) {
					Static280.method3700("Entered tk3");
					Static104.aClass6_Sub6_Sub1_4.anInt1182 = 3;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				Static280.method3700("Failed to enter tk3");
				return;
			}
			if (arg2.equalsIgnoreCase("tk4")) {
				Static419.method6517(4);
				if (Static5.anInt145 == 4) {
					Static280.method3700("Entered tk4");
					Static104.aClass6_Sub6_Sub1_4.anInt1182 = 4;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				Static280.method3700("Failed to enter tk4");
				return;
			}
			if (arg2.equalsIgnoreCase("tk5")) {
				Static419.method6517(5);
				if (Static5.anInt145 == 5) {
					Static280.method3700("Entered tk5");
					Static104.aClass6_Sub6_Sub1_4.anInt1182 = 5;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					return;
				}
				Static280.method3700("Failed to enter tk5");
				return;
			}
			if (arg2.equalsIgnoreCase("ot")) {
				Static104.aClass6_Sub6_Sub1_4.aBoolean124 = !Static104.aClass6_Sub6_Sub1_4.aBoolean124;
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				Static54.aBoolean151 = false;
				Static190.method3621();
				Static280.method3700("ot=" + Static104.aClass6_Sub6_Sub1_4.aBoolean124);
				return;
			}
			if (arg2.equalsIgnoreCase("gb")) {
				Static104.aClass6_Sub6_Sub1_4.aBoolean130 = !Static104.aClass6_Sub6_Sub1_4.aBoolean130;
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				Static54.aBoolean151 = false;
				Static190.method3621();
				Static280.method3700("gb=" + Static104.aClass6_Sub6_Sub1_4.aBoolean130);
				return;
			}
			@Pc(668) int local668;
			if (arg2.startsWith("shadows")) {
				if (arg2.length() < 8) {
					Static280.method3700("Invalid shadows value");
					return;
				}
				@Pc(658) String local658 = arg2.substring(8);
				local668 = Static251.method4415(local658) ? Static228.method4072(local658) : -1;
				if (local668 >= 0 && local668 <= 2) {
					Static104.aClass6_Sub6_Sub1_4.method1062(Static5.anInt145, local668);
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					Static190.method3621();
					Static280.method3700("shadows=" + local668);
					return;
				}
				Static280.method3700("Invalid shadows value");
				return;
			}
			if (arg2.startsWith("textures")) {
				Static104.aClass6_Sub6_Sub1_4.aBoolean135 = !Static104.aClass6_Sub6_Sub1_4.aBoolean135;
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				Static54.aBoolean151 = false;
				Static397.method6265();
				Static190.method3621();
				Static280.method3700("textures=" + Static104.aClass6_Sub6_Sub1_4.aBoolean135);
				return;
			}
			if (arg2.startsWith("lighting")) {
				Static104.aClass6_Sub6_Sub1_4.method1063(Static5.anInt145, !Static104.aClass6_Sub6_Sub1_4.method1064(Static5.anInt145));
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				Static54.aBoolean151 = false;
				Static200.method3771();
				Static397.method6265();
				Static190.method3621();
				Static280.method3700("lighting=" + Static104.aClass6_Sub6_Sub1_4.method1064(Static5.anInt145));
				return;
			}
			if (arg2.startsWith("setba")) {
				if (arg2.length() < 6) {
					Static280.method3700("Invalid buildarea value");
					return;
				}
				local110 = Static228.method4072(arg2.substring(6));
				if (local110 >= 0 && Static104.method6578(Static205.anInt4372) >= local110) {
					Static104.aClass6_Sub6_Sub1_4.anInt1162 = local110;
					Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
					Static54.aBoolean151 = false;
					Static280.method3700("maxbuildarea=" + Static104.aClass6_Sub6_Sub1_4.anInt1162);
					return;
				}
				Static280.method3700("Invalid buildarea value");
				return;
			}
			if (arg2.startsWith("setparticles")) {
				if (arg2.length() < 13) {
					Static280.method3700("Invalid particles value");
					return;
				}
				Static318.method5130(Static228.method4072(arg2.substring(13)));
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				Static54.aBoolean151 = false;
				Static280.method3700("particles=" + Static297.method4044());
				return;
			}
			if (arg2.startsWith("rect_debug")) {
				if (arg2.length() < 10) {
					Static280.method3700("Invalid rect_debug value");
					return;
				}
				Static337.anInt6225 = Static228.method4072(arg2.substring(10).trim());
				Static280.method3700("rect_debug=" + Static337.anInt6225);
				return;
			}
			if (arg2.equalsIgnoreCase("qa_op_test")) {
				Static13.aBoolean37 = true;
				Static280.method3700("qa_op_test=" + Static13.aBoolean37);
				return;
			}
			if (arg2.equalsIgnoreCase("clipcomponents")) {
				Static174.aBoolean324 = !Static174.aBoolean324;
				Static280.method3700("clipcomponents=" + Static174.aBoolean324);
				return;
			}
			if (arg2.startsWith("bloom")) {
				@Pc(948) boolean local948 = Static323.aClass9_8.method5398();
				if (!Static115.method2333(!local948)) {
					Static280.method3700("Failed to enable bloom");
					return;
				}
				if (!local948) {
					Static280.method3700("Bloom enabled");
					return;
				}
				Static280.method3700("Bloom disabled");
				return;
			}
			if (arg2.equalsIgnoreCase("tween")) {
				if (Static305.aBoolean438) {
					Static305.aBoolean438 = false;
					Static280.method3700("Forced tweening disabled.");
					return;
				}
				Static305.aBoolean438 = true;
				Static280.method3700("Forced tweening ENABLED!");
				return;
			}
			if (arg2.equalsIgnoreCase("shiftclick")) {
				if (!Static478.aBoolean650) {
					Static280.method3700("Shift-click ENABLED!");
					Static478.aBoolean650 = true;
					return;
				}
				Static280.method3700("Shift-click disabled.");
				Static478.aBoolean650 = false;
				return;
			}
			if (arg2.equalsIgnoreCase("getcgcoord")) {
				Static280.method3700("x:" + (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9) + " z:" + (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9));
				return;
			}
			if (arg2.equalsIgnoreCase("getheight")) {
				Static280.method3700("Height: " + Static47.aClass62Array1[Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77].JA(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 7, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 7));
				return;
			}
			if (arg2.equalsIgnoreCase("resetminimap")) {
				Static132.aClass168_118.method4447();
				Static132.aClass168_118.method4448();
				Static109.aClass226_3.method5640();
				Static17.aClass42_3.method1144();
				Static514.method7577();
				Static280.method3700("Minimap reset");
				return;
			}
			if (arg2.startsWith("mc")) {
				if (!Static323.aClass9_8.method5395()) {
					Static280.method3700("Current toolkit doesn't support multiple cores");
					return;
				}
				local110 = Integer.parseInt(arg2.substring(3));
				if (local110 < 1) {
					local110 = 1;
				} else if (local110 > 4) {
					local110 = 4;
				}
				Static43.anInt1257 = local110;
				Static323.aClass9_8.method5394(Static43.anInt1257);
				Static323.aClass9_8.method5459(0);
				Static280.method3700("Render cores now: " + Static43.anInt1257);
				return;
			}
			if (arg2.startsWith("cachespace")) {
				Static280.method3700("I(s): " + Static112.aClass245_24.method6078() + "/" + Static112.aClass245_24.method6084());
				Static280.method3700("I(m): " + Static226.aClass245_36.method6078() + "/" + Static226.aClass245_36.method6084());
				Static280.method3700("O(s): " + Static98.aClass203_1.aClass74_1.method2131() + "/" + Static98.aClass203_1.aClass74_1.method2134());
				return;
			}
			if (arg2.equalsIgnoreCase("getcamerapos")) {
				Static280.method3700("Pos: " + Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 + "," + (Static191.anInt4147 + (Static86.anInt2132 >> 9) >> 6) + "," + ((Static390.anInt7318 >> 9) + Static247.anInt5049 >> 6) + "," + (Static191.anInt4147 + (Static86.anInt2132 >> 9) & 0x3F) + "," + ((Static390.anInt7318 >> 9) + Static247.anInt5049 & 0x3F) + " Height: " + (Static482.method7333(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, Static390.anInt7318, Static86.anInt2132) - Static5.anInt142));
				Static280.method3700("Look: " + Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 + "," + (Static228.anInt4743 + Static191.anInt4147 >> 6) + "," + (Static367.anInt6943 + Static247.anInt5049 >> 6) + "," + (Static228.anInt4743 + Static191.anInt4147 & 0x3F) + "," + (Static367.anInt6943 + Static247.anInt5049 & 0x3F) + " Height: " + (Static482.method7333(Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77, Static367.anInt6943, Static228.anInt4743) - Static416.anInt7784));
				return;
			}
			if (arg2.equals("showocc")) {
				Static490.aBoolean665 = !Static490.aBoolean665;
				Static190.method3621();
				Static280.method3700("showocc=" + Static490.aBoolean665);
				return;
			}
			if (arg2.equals("wallocc")) {
				Static149.aBoolean473 = !Static149.aBoolean473;
				Static190.method3621();
				Static280.method3700("forcewallocc=" + Static149.aBoolean473);
				return;
			}
			if (arg2.equals("renderprofile") || arg2.equals("rp")) {
				Static354.aBoolean512 = !Static354.aBoolean512;
				Static323.aClass9_8.method5413(Static354.aBoolean512);
				Static74.method7243();
				Static280.method3700("showprofiling=" + Static354.aBoolean512);
				return;
			}
			if (arg2.startsWith("performancetest")) {
				local110 = -1;
				local668 = 1000;
				if (arg2.length() > 15) {
					@Pc(1407) String[] local1407 = Static288.method4721(arg2, ' ');
					try {
						if (local1407.length > 1) {
							local668 = Integer.parseInt(local1407[1]);
						}
					} catch (@Pc(1418) Throwable local1418) {
					}
					try {
						if (local1407.length > 2) {
							local110 = Integer.parseInt(local1407[2]);
						}
					} catch (@Pc(1431) Throwable local1431) {
					}
				}
				if (local110 == -1) {
					Static280.method3700("Java toolkit: " + Static239.method4221(0, local668));
					Static280.method3700("SSE toolkit:  " + Static239.method4221(2, local668));
					Static280.method3700("D3D toolkit:  " + Static239.method4221(3, local668));
					Static280.method3700("GL toolkit:   " + Static239.method4221(1, local668));
					Static280.method3700("GLX toolkit:  " + Static239.method4221(5, local668));
					return;
				}
				Static280.method3700("Performance: " + Static239.method4221(Static5.anInt145, local668));
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(1517) Class138 local1517 = Static323.aClass9_8.method5435();
				Static280.method3700("Vendor: " + local1517.anInt4341);
				Static280.method3700("Name: " + local1517.aString48);
				Static280.method3700("Version: " + local1517.anInt4340);
				Static280.method3700("Device: " + local1517.aString49);
				Static280.method3700("Driver Version: " + local1517.aLong85);
				return;
			}
			if (arg2.equals("nonpcs")) {
				Static274.aBoolean401 = !Static274.aBoolean401;
				Static280.method3700("nonpcs=" + Static274.aBoolean401);
				return;
			}
			if (arg2.equals("autoworld")) {
				Static88.method1976();
				Static280.method3700("auto world selected");
				return;
			}
			if (arg2.startsWith("switchworld")) {
				local110 = Integer.parseInt(arg2.substring(12));
				Static87.method1963(Static224.method4022(local110).aString39, local110);
				Static280.method3700("switched");
				return;
			}
			if (arg2.equals("getworld")) {
				Static280.method3700("w: " + Static293.aClass275_2.anInt7968);
				return;
			}
			if (arg2.startsWith("pc")) {
				Static298.method4854(Static40.aClass181_10);
				Static547.aClass6_Sub26_Sub2_2.method4950(0, -81849);
				local110 = Static547.aClass6_Sub26_Sub2_2.anInt5769;
				local668 = arg2.indexOf(" ", 4);
				Static547.aClass6_Sub26_Sub2_2.method4998(arg2.substring(3, local668));
				Static320.method5175(Static547.aClass6_Sub26_Sub2_2, arg2.substring(local668));
				Static547.aClass6_Sub26_Sub2_2.method4976(Static547.aClass6_Sub26_Sub2_2.anInt5769 - local110);
				return;
			}
			if (arg2.equals("heap")) {
				Static280.method3700("Heap: " + Static205.anInt4372 + "MB");
				return;
			}
			if (arg2.equals("savevarcs")) {
				Static277.method4599();
				Static280.method3700("perm varcs saved");
				return;
			}
			if (arg2.equals("scramblevarcs")) {
				for (local110 = 0; local110 < Static67.anIntArray106.length; local110++) {
					if (Static30.aBooleanArray4[local110]) {
						Static67.anIntArray106[local110] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static67.anIntArray106[local110] *= -1;
						}
					}
				}
				Static277.method4599();
				Static280.method3700("perm varcs scrambled");
				return;
			}
			if (arg2.equals("showcolmap")) {
				Static39.aBoolean144 = true;
				Static514.method7577();
				Static280.method3700("colmap is shown");
				return;
			}
			if (arg2.equals("hidecolmap")) {
				Static39.aBoolean144 = false;
				Static514.method7577();
				Static280.method3700("colmap is hidden");
				return;
			}
			if (arg2.equals("resetcache")) {
				Static41.method1127();
				Static280.method3700("Caches reset");
				return;
			}
			if (arg2.equals("profilecpu")) {
				Static280.method3700(Static323.method5222() + "ms");
				return;
			}
			if (arg2.startsWith("cpuusage")) {
				local110 = Integer.parseInt(arg2.substring(9));
				if (local110 >= 0 && local110 <= 4) {
					Static104.aClass6_Sub6_Sub1_4.anInt1165 = local110;
				}
				Static280.method3700("cpuusage=" + Static104.aClass6_Sub6_Sub1_4.anInt1165);
				return;
			}
			if (arg2.startsWith("getclientvarpbit")) {
				local110 = Integer.parseInt(arg2.substring(17));
				Static280.method3700("varpbit=" + Static435.aClass234_1.method5829(local110));
				return;
			}
			if (arg2.startsWith("getclientvarp")) {
				local110 = Integer.parseInt(arg2.substring(14));
				Static280.method3700("varp=" + Static435.aClass234_1.method5828(local110));
				return;
			}
			if (arg2.startsWith("demologin")) {
				Static241.method4243(0, false);
				return;
			}
			if (arg2.startsWith("newdemologin")) {
				Static241.method4243(0, true);
				return;
			}
			if (arg2.startsWith("directlogin")) {
				@Pc(1905) String[] local1905 = Static288.method4721(arg2.substring(12), ' ');
				if (local1905.length >= 2) {
					local668 = local1905.length <= 2 ? 0 : Integer.parseInt(local1905[2]);
					Static159.method3024(local1905[0], local1905[1], local668);
					return;
				}
			}
			if (arg2.startsWith("csprofileclear")) {
				Static89.method1987();
				return;
			}
			if (arg2.startsWith("csprofileoutputc")) {
				Static89.method1991();
				return;
			}
			if (arg2.startsWith("csprofileoutputt")) {
				Static89.method1991();
				return;
			}
			if (arg2.startsWith("texsize")) {
				local110 = Integer.parseInt(arg2.substring(8));
				Static323.aClass9_8.method5392(local110);
				return;
			}
			if (arg2.equals("soundstreamcount")) {
				Static280.method3700("Active streams: " + Static35.aClass6_Sub10_Sub3_1.method4743());
				return;
			}
			if (arg2.equals("autosetup")) {
				Static104.aClass6_Sub6_Sub1_4.method1067();
				Static280.method3700("Complete. Toolkit now: " + Static5.anInt145);
				return;
			}
			if (arg2.equals("errormessage")) {
				Static280.method3700(Static363.aClient1.method1432());
				return;
			}
			if (Static325.anInt6149 == 10) {
				Static298.method4854(Static242.aClass181_57);
				Static547.aClass6_Sub26_Sub2_2.method4950(arg2.length() + 3, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4950(arg1 ? 1 : 0, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4950(arg0 ? 1 : 0, -81849);
				Static547.aClass6_Sub26_Sub2_2.method4998(arg2);
			}
			if (arg2.startsWith("fps ") && Static186.aClass123_6 != Static230.aClass123_8) {
				Static16.method748(Static228.method4072(arg2.substring(4)));
				return;
			}
			if (Static325.anInt6149 != 10) {
				Static280.method3700("Unrecogonised commmand when not logged in: " + arg2);
				return;
			}
		} catch (@Pc(2078) Exception local2078) {
			Static280.method3700("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBILclient!pi;I)V")
	public static void method983(@OriginalArg(2) int arg0, @OriginalArg(3) Class11_Sub1_Sub1_Sub2 arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray526[0];
		@Pc(15) int local15 = arg1.anIntArray527[0];
		if (local10 < 0 || local10 >= Static228.anInt4746 || local15 < 0 || Static44.anInt1275 <= local15 || (arg0 < 0 || arg0 >= Static228.anInt4746 || arg2 < 0 || Static44.anInt1275 <= arg2)) {
			return;
		}
		@Pc(79) int local79 = Static150.method6218(0, Static225.anIntArray303, arg2, -4, Static55.aClass194Array1[arg1.aByte77], 0, 0, true, arg0, Static55.anIntArray97, 0, arg1.method6212(), local15, local10);
		if (local79 >= 1 && local79 <= 3) {
			for (@Pc(99) int local99 = 0; local99 < local79 - 1; local99++) {
				arg1.method6225(Static225.anIntArray303[local99], (byte) 2, Static55.anIntArray97[local99]);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method984() {
		Static387.aClass273_1.method6613();
		Static401.aClass4_1.method1211();
		Static363.aClient1.method1431();
		Static38.aCanvas4.setBackground(Color.black);
		Static367.anInt6941 = -1;
		Static387.aClass273_1 = Static314.method6697(Static38.aCanvas4);
		Static401.aClass4_1 = Static398.method6270(Static38.aCanvas4);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method985() {
		@Pc(13) int local13 = Static69.aByteArrayArray5.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static69.aByteArrayArray5[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static128.anInt2833; local25++) {
					if (Static341.anIntArray470[local15] == Static222.anIntArray298[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static222.anIntArray298[Static128.anInt2833] = Static341.anIntArray470[local15];
					local23 = Static128.anInt2833++;
				}
				@Pc(64) Class6_Sub26 local64 = new Class6_Sub26(Static69.aByteArrayArray5[local15]);
				@Pc(66) int local66 = 0;
				while (Static69.aByteArrayArray5[local15].length > local64.anInt5769 && local66 < 511 && Static208.anInt4409 < 1023) {
					@Pc(83) int local83 = local23 | local66++ << 6;
					@Pc(87) int local87 = local64.method4999();
					@Pc(91) int local91 = local87 >> 14;
					@Pc(97) int local97 = local87 >> 7 & 0x3F;
					@Pc(101) int local101 = local87 & 0x3F;
					@Pc(113) int local113 = (Static341.anIntArray470[local15] >> 8) * 64 + local97 - Static191.anInt4147;
					@Pc(125) int local125 = local101 + (Static341.anIntArray470[local15] & 0xFF) * 64 - Static247.anInt5049;
					@Pc(132) Class222 local132 = Static504.aClass343_2.method7994(local64.method4999());
					@Pc(139) Class6_Sub33 local139 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local83);
					if (local139 == null && (local132.aByte62 & 0x1) > 0 && Static410.anInt7667 == local91 && local113 >= 0 && Static228.anInt4746 > local132.anInt6248 + local113 && local125 >= 0 && local125 + local132.anInt6248 < Static44.anInt1275) {
						@Pc(187) Class11_Sub1_Sub1_Sub1 local187 = new Class11_Sub1_Sub1_Sub1();
						local187.anInt7392 = local83;
						@Pc(195) Class6_Sub33 local195 = new Class6_Sub33(local187);
						Static506.aClass305_36.method7448((long) local83, local195);
						Static9.aClass6_Sub33Array1[Static452.anInt8286++] = local195;
						Static70.anIntArray111[Static208.anInt4409++] = local83;
						local187.anInt7354 = Static508.anInt8998;
						local187.method611(local132);
						local187.method6220(local187.aClass222_1.anInt6248);
						local187.anInt7397 = local187.aClass222_1.anInt6247 << 3;
						local187.method6204(true, local187.aClass222_1.aByte58 + 4 << 11 & 0x3963);
						local187.method607(local91, true, local113, local187.method6212(), local125);
					}
				}
			}
		}
	}
}
