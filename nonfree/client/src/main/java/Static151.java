import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 6)
	public static void method2970() {
		Class86.aClass98_16.method2616();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)[B", line = 17)
	public static byte[] method2971(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub4 local8 = new Class2_Sub4(arg0);
		@Pc(12) int local12 = local8.method4816();
		@Pc(23) int local23 = local8.method4837();
		if (local23 < 0 || client.anInt1197 != 0 && client.anInt1197 < local23) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(45) byte[] local45 = new byte[local23];
			local8.method4800(local45, local23);
			return local45;
		} else {
			@Pc(57) int local57 = local8.method4837();
			if (local57 < 0 || client.anInt1197 != 0 && client.anInt1197 < local57) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local57];
			if (local12 == 1) {
				Static383.method3743(local71, local57, arg0, local23);
			} else {
				Class68.aClass92_1.method2438(local71, local8);
			}
			return local71;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 95)
	public static void method2973(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (Class132.aClass127_6 == Static114.aClass127_4 && Class3_Sub1.anInt90 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Class2_Sub2_Sub6_Sub2.aBoolean456 = true;
				Static149.method2941("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Class2_Sub2_Sub6_Sub2.aBoolean456 = false;
				Static149.method2941("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Class123_Sub1.anInt3381 = 0;
				Class2_Sub3_Sub36.anInt6904 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Class190.aClass36_7.method1418();
				Static149.method2941("Text coords cleared");
				return;
			}
			@Pc(76) int local76;
			@Pc(96) int local96;
			@Pc(87) Runtime local87;
			if (arg0.equalsIgnoreCase("gc")) {
				Static55.method1645();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static149.method2941("mem=" + local96 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static55.method1645();
				for (local76 = 0; local76 < 10; local76++) {
					System.gc();
				}
				local87 = Runtime.getRuntime();
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static149.method2941("Memory before cleanup=" + local96 + "k");
				Static153.method3106();
				Static55.method1645();
				for (@Pc(153) int local153 = 0; local153 < 10; local153++) {
					System.gc();
				}
				local96 = (int) ((local87.totalMemory() - local87.freeMemory()) / 1024L);
				Static149.method2941("Memory after cleanup=" + local96 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static149.method2941("Number of player models in cache:" + Static340.method6118());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static149.method2941("Dropped client connection");
				if (Class2_Sub3_Sub35.anInt6430 == 30) {
					Static197.method3726();
					return;
				}
				if (Class2_Sub3_Sub35.anInt6430 == 25) {
					Class73.aBoolean158 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static264.aClass183_3.method4646();
				Static149.method2941("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static264.aClass183_3.method4636();
				Static149.method2941("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static305.aClass152_5.method3761();
				Static312.aClass111_4.method2803();
				Static264.aClass183_3.method4634();
				Static149.method2941("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static322.method5828();
				Static228.method4300();
				Static149.method2941("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static134.method2679(-1, 1, false, -1);
				if (Static135.method2694() == 1) {
					Static149.method2941("wm1 succeeded");
					return;
				}
				Static149.method2941("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static134.method2679(-1, 2, false, -1);
				if (Static135.method2694() == 2) {
					Static149.method2941("wm2 succeeded");
					return;
				}
				Static149.method2941("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static134.method2679(768, 3, false, 1024);
				if (Static135.method2694() == 3) {
					Static149.method2941("wm3 succeeded");
					return;
				}
				Static149.method2941("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static74.method5702(0);
				if (Class2_Sub10.anInt1760 == 0) {
					Static149.method2941("Entered tk0");
					Static203.aClass177_Sub1_2.anInt4868 = 0;
					Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
					Class161.aBoolean288 = false;
					return;
				}
				Static149.method2941("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static74.method5702(1);
				if (Class2_Sub10.anInt1760 != 1) {
					Static149.method2941("Failed to enter tk1");
					return;
				}
				Static149.method2941("Entered tk1");
				Static203.aClass177_Sub1_2.anInt4868 = 1;
				Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
				Class161.aBoolean288 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static74.method5702(2);
				if (Class2_Sub10.anInt1760 != 2) {
					Static149.method2941("Failed to enter tk2");
					return;
				}
				Static149.method2941("Entered tk2");
				Static203.aClass177_Sub1_2.anInt4868 = 2;
				Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
				Class161.aBoolean288 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static74.method5702(3);
				if (Class2_Sub10.anInt1760 == 3) {
					Static149.method2941("Entered tk3");
					return;
				}
				Static149.method2941("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static203.aClass177_Sub1_2.aBoolean355 = !Static203.aClass177_Sub1_2.aBoolean355;
				Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
				Class161.aBoolean288 = false;
				Static322.method5828();
				Static149.method2941("ot=" + Static203.aClass177_Sub1_2.aBoolean355);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static203.aClass177_Sub1_2.aBoolean357 = !Static203.aClass177_Sub1_2.aBoolean357;
				Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
				Class161.aBoolean288 = false;
				Static322.method5828();
				Static149.method2941("gb=" + Static203.aClass177_Sub1_2.aBoolean357);
				return;
			}
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static149.method2941("Invalid shadows value");
					return;
				}
				@Pc(521) String local521 = arg0.substring(8);
				@Pc(531) int local531 = Static123.method2487(local521) ? Static137.method2700(local521) : -1;
				if (local531 >= 0 && local531 <= 2) {
					Static203.aClass177_Sub1_2.anInt4876 = local531;
					Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
					Class161.aBoolean288 = false;
					Static322.method5828();
					Static149.method2941("shadows=" + local531);
					return;
				}
				Static149.method2941("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static149.method2941("Invalid buildarea value");
					return;
				}
				local76 = Static137.method2700(arg0.substring(6));
				if (local76 >= 0 && local76 <= Static266.method5020(Class208.anInt5790)) {
					Static203.aClass177_Sub1_2.anInt4873 = local76;
					Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
					Class161.aBoolean288 = false;
					Static149.method2941("maxbuildarea=" + Static203.aClass177_Sub1_2.anInt4873);
					return;
				}
				Static149.method2941("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static149.method2941("Invalid particles value");
					return;
				}
				Static25.method864(Static137.method2700(arg0.substring(13)));
				Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
				Class161.aBoolean288 = false;
				Static149.method2941("particles=" + Static172.method3392());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static149.method2941("Invalid rect_debug value");
					return;
				}
				Class109.anInt2804 = Static137.method2700(arg0.substring(10).trim());
				Static149.method2941("rect_debug=" + Class109.anInt2804);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Class15_Sub1.aBoolean30 = true;
				Static149.method2941("qa_op_test=" + Class15_Sub1.aBoolean30);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Class65.aBoolean134 = !Class65.aBoolean134;
				Static149.method2941("clipcomponents=" + Class65.aBoolean134);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(736) boolean local736 = Static177.aClass19_8.method2894();
				if (Static261.method4883(!local736)) {
					if (!local736) {
						Static149.method2941("Bloom enabled");
						return;
					}
					Static149.method2941("Bloom disabled");
					return;
				}
				Static149.method2941("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Class213.aBoolean408) {
					Class213.aBoolean408 = true;
					Static149.method2941("Forced tweening ENABLED!");
					return;
				}
				Class213.aBoolean408 = false;
				Static149.method2941("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Class105.aBoolean192) {
					Static149.method2941("Shift-click disabled.");
					Class105.aBoolean192 = false;
					return;
				}
				Static149.method2941("Shift-click ENABLED!");
				Class105.aBoolean192 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static149.method2941("x:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7) + " z:" + (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static149.method2941("Height: " + Static340.aClass6Array4[Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78].method5720(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7, Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static29.aClass197_5.method5091();
				Static29.aClass197_5.method5069();
				Static297.aClass104_2.method2709();
				Static219.aClass125_1.method3381();
				Static228.method4300();
				Static149.method2941("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static177.aClass19_8.method2871()) {
					local76 = Integer.parseInt(arg0.substring(3));
					if (local76 < 1) {
						local76 = 1;
					} else if (local76 > 4) {
						local76 = 4;
					}
					Class57_Sub2.anInt3587 = local76;
					Static177.aClass19_8.method2856(Class57_Sub2.anInt3587);
					Static177.aClass19_8.method2895(0);
					Static149.method2941("Render cores now: " + Class57_Sub2.anInt3587);
					return;
				}
				Static149.method2941("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static149.method2941("I(s): " + Class222.aClass98_57.method2618() + "/" + Class222.aClass98_57.method2622());
				Static149.method2941("I(m): " + Class11_Sub5.aClass98_63.method2618() + "/" + Class11_Sub5.aClass98_63.method2622());
				Static149.method2941("O(s): " + Static290.aClass107_2.aClass97_1.method2589() + "/" + Static290.aClass107_2.aClass97_1.method2594());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static149.method2941("Pos: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static154.anInt3136 + (Static127.anInt6765 >> 7) >> 6) + "," + ((Static197.anInt3773 >> 7) + Static139.anInt2716 >> 6) + "," + (Static154.anInt3136 + (Static127.anInt6765 >> 7) & 0x3F) + "," + (Static139.anInt2716 + (Static197.anInt3773 >> 7) & 0x3F) + " Height: " + (Static360.method6033(Static127.anInt6765, Static197.anInt3773, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static95.anInt3588));
				Static149.method2941("Look: " + Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 + "," + (Static154.anInt3136 + Static234.anInt4689 >> 6) + "," + (Static116.anInt2417 + Static139.anInt2716 >> 6) + "," + (Static234.anInt4689 + Static154.anInt3136 & 0x3F) + "," + (Static139.anInt2716 + Static116.anInt2417 & 0x3F) + " Height: " + (Static360.method6033(Static234.anInt4689, Static116.anInt2417, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) - Static53.anInt1462));
				return;
			}
			if (arg0.equals("showocc")) {
				Class114.aBoolean206 = !Class114.aBoolean206;
				Static322.method5828();
				Static149.method2941("showocc=" + Class114.aBoolean206);
				return;
			}
			if (arg0.equals("wallocc")) {
				Class2_Sub3_Sub23.aBoolean329 = !Class2_Sub3_Sub23.aBoolean329;
				Static322.method5828();
				Static149.method2941("forcewallocc=" + Class2_Sub3_Sub23.aBoolean329);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Class2_Sub31.aBoolean392 = !Class2_Sub31.aBoolean392;
				Static177.aClass19_8.method2857(Class2_Sub31.aBoolean392);
				Static46.method1473();
				Static149.method2941("showprofiling=" + Class2_Sub31.aBoolean392);
				return;
			}
			if (arg0.equals("nonpcs")) {
				Class37_Sub1.aBoolean102 = !Class37_Sub1.aBoolean102;
				Static149.method2941("nonpcs=" + Class37_Sub1.aBoolean102);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static187.method3645();
				Static149.method2941("auto world selected");
				return;
			}
			if (arg0.equals("heap")) {
				Static149.method2941("Heap: " + Class208.anInt5790 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static317.method5766();
				Static149.method2941("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local76 = 0; local76 < Static71.anIntArray117.length; local76++) {
					if (Static83.aBooleanArray18[local76]) {
						Static71.anIntArray117[local76] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static71.anIntArray117[local76] *= -1;
						}
					}
				}
				Static317.method5766();
				Static149.method2941("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Class36.aBoolean100 = true;
				Static228.method4300();
				Static149.method2941("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Class36.aBoolean100 = false;
				Static228.method4300();
				Static149.method2941("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static197.method3722();
				Static149.method2941("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static149.method2941(Static349.method6274() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local76 = Integer.parseInt(arg0.substring(9));
				if (local76 >= 0 && local76 <= 4) {
					Static203.aClass177_Sub1_2.anInt4871 = local76;
				}
				Static149.method2941("cpuusage=" + Static203.aClass177_Sub1_2.anInt4871);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local76 = Integer.parseInt(arg0.substring(17));
				Static149.method2941("varpbit=" + Static199.aClass226_1.method5779(local76));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local76 = Integer.parseInt(arg0.substring(14));
				Static149.method2941("varp=" + Static199.aClass226_1.method5778(local76));
				return;
			}
			if (Class2_Sub3_Sub35.anInt6430 == 30) {
				Static85.method1962(Class2_Sub2_Sub13.aClass145_162);
				Class14.aClass2_Sub4_Sub2_4.method4843(arg0.length() + 2);
				Class14.aClass2_Sub4_Sub2_4.method4843(arg1 ? 1 : 0);
				Class14.aClass2_Sub4_Sub2_4.method4823(arg0);
			}
			if (arg0.startsWith("fps ") && Class132.aClass127_6 != Static114.aClass127_4) {
				Static231.method4347(Static137.method2700(arg0.substring(4)));
				return;
			}
			if (Class2_Sub3_Sub35.anInt6430 != 30) {
				Static149.method2941("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1450) Exception local1450) {
			Static149.method2941("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V", line = 765)
	public static void method2974(@OriginalArg(1) boolean arg0) {
		Static36.method1135();
		if (Class2_Sub3_Sub35.anInt6430 != 30 && Class2_Sub3_Sub35.anInt6430 != 25) {
			return;
		}
		Class2_Sub2_Sub17.anInt6863++;
		if (Class2_Sub2_Sub17.anInt6863 < 50 && !arg0) {
			return;
		}
		Class2_Sub2_Sub17.anInt6863 = 0;
		if (!Class73.aBoolean158 && Static312.aClass111_4 != null) {
			Static85.method1962(Class12.aClass145_228);
			try {
				Static312.aClass111_4.method2799(Class14.aClass2_Sub4_Sub2_4.anInt5289, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
				Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
			} catch (@Pc(57) IOException local57) {
				Class73.aBoolean158 = true;
			}
		}
		Static36.method1135();
	}
}
