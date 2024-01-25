import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	public static int anInt3486 = 0;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_96 = new Class119("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!u;ZIZLclient!u;Z)I")
	public static int method2832(@OriginalArg(0) int arg0, @OriginalArg(1) Class147_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class147_Sub1 arg5) {
		@Pc(18) int local18 = Static180.method2603(arg0, arg1, arg5, arg2);
		if (local18 != 0) {
			return arg2 ? -local18 : local18;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static180.method2603(arg3, arg1, arg5, arg4);
			return arg4 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZILjava/lang/String;Z)V")
	public static void method2833(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static328.aClass30_10 == Static459.aClass30_13 && Static154.anInt2601 < 2) {
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
				Static303.aBoolean817 = true;
				Static324.method4374("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static303.aBoolean817 = false;
				Static324.method4374("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static324.method4374("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(83) Throwable local83) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static119.anInt2216 = 0;
				Static188.anInt3240 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static172.aClass262_5.method5812();
				Static324.method4374("Text coords cleared");
				return;
			}
			@Pc(132) int local132;
			@Pc(112) int local112;
			@Pc(123) Runtime local123;
			if (arg1.equalsIgnoreCase("gc")) {
				Static202.method2882();
				for (local112 = 0; local112 < 10; local112++) {
					System.gc();
				}
				local123 = Runtime.getRuntime();
				local132 = (int) ((local123.totalMemory() - local123.freeMemory()) / 1024L);
				Static324.method4374("mem=" + local132 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static202.method2882();
				for (local112 = 0; local112 < 10; local112++) {
					System.gc();
				}
				local123 = Runtime.getRuntime();
				local132 = (int) ((local123.totalMemory() - local123.freeMemory()) / 1024L);
				Static324.method4374("Memory before cleanup=" + local132 + "k");
				Static201.method2867();
				Static202.method2882();
				for (@Pc(188) int local188 = 0; local188 < 10; local188++) {
					System.gc();
				}
				local132 = (int) ((local123.totalMemory() - local123.freeMemory()) / 1024L);
				Static324.method4374("Memory after cleanup=" + local132 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static324.method4374("Number of player models in cache:" + Static392.method5128());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static324.method4374("Dropped client connection");
				if (Static312.anInt5414 == 9) {
					Static34.method490();
				} else if (Static312.anInt5414 == 10) {
					Static321.aBoolean622 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static32.aClass224_1.method4927();
				Static324.method4374("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static32.aClass224_1.method4929();
				Static324.method4374("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static183.aClass83_2.method1875();
				Static395.aClass131_3.method2931();
				Static32.aClass224_1.method4925();
				Static324.method4374("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static353.method4772();
				Static72.method1154();
				Static324.method4374("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static169.method2392(-1, 1, -1, false);
				if (Static101.method1560() == 1) {
					Static324.method4374("wm1 succeeded");
					return;
				}
				Static324.method4374("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static169.method2392(-1, 2, -1, false);
				if (Static101.method1560() != 2) {
					Static324.method4374("wm2 failed");
					return;
				}
				Static324.method4374("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static169.method2392(1024, 3, 768, false);
				if (Static101.method1560() != 3) {
					Static324.method4374("wm3 failed");
					return;
				}
				Static324.method4374("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static379.method4990(0);
				if (Static14.anInt293 != 0) {
					Static324.method4374("Failed to enter tk0");
					return;
				}
				Static324.method4374("Entered tk0");
				Static453.aClass136_Sub1_1.anInt4439 = 0;
				Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
				Static303.aBoolean816 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static379.method4990(1);
				if (Static14.anInt293 != 1) {
					Static324.method4374("Failed to enter tk1");
					return;
				}
				Static324.method4374("Entered tk1");
				Static453.aClass136_Sub1_1.anInt4439 = 1;
				Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
				Static303.aBoolean816 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static379.method4990(2);
				if (Static14.anInt293 == 2) {
					Static324.method4374("Entered tk2");
					Static453.aClass136_Sub1_1.anInt4439 = 2;
					Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
					Static303.aBoolean816 = false;
					return;
				}
				Static324.method4374("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static379.method4990(3);
				if (Static14.anInt293 == 3) {
					Static324.method4374("Entered tk3");
					return;
				}
				Static324.method4374("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static453.aClass136_Sub1_1.aBoolean506 = !Static453.aClass136_Sub1_1.aBoolean506;
				Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
				Static303.aBoolean816 = false;
				Static353.method4772();
				Static324.method4374("ot=" + Static453.aClass136_Sub1_1.aBoolean506);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static453.aClass136_Sub1_1.aBoolean510 = !Static453.aClass136_Sub1_1.aBoolean510;
				Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
				Static303.aBoolean816 = false;
				Static353.method4772();
				Static324.method4374("gb=" + Static453.aClass136_Sub1_1.aBoolean510);
				return;
			}
			@Pc(569) int local569;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static324.method4374("Invalid shadows value");
					return;
				}
				@Pc(559) String local559 = arg1.substring(8);
				local569 = Static48.method797(local559) ? Static219.method3201(local559) : -1;
				if (local569 >= 0 && local569 <= 2) {
					Static453.aClass136_Sub1_1.method3518(Static14.anInt293, local569);
					Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
					Static303.aBoolean816 = false;
					Static353.method4772();
					Static324.method4374("shadows=" + local569);
					return;
				}
				Static324.method4374("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static453.aClass136_Sub1_1.aBoolean505 = !Static453.aClass136_Sub1_1.aBoolean505;
				Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
				Static303.aBoolean816 = false;
				Static354.method4773();
				Static353.method4772();
				Static324.method4374("textures=" + Static453.aClass136_Sub1_1.aBoolean505);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static324.method4374("Invalid buildarea value");
					return;
				}
				local112 = Static219.method3201(arg1.substring(6));
				if (local112 >= 0 && local112 <= Static127.method2012(Static270.anInt4858)) {
					Static453.aClass136_Sub1_1.anInt4446 = local112;
					Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
					Static303.aBoolean816 = false;
					Static324.method4374("maxbuildarea=" + Static453.aClass136_Sub1_1.anInt4446);
					return;
				}
				Static324.method4374("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static324.method4374("Invalid particles value");
					return;
				}
				Static300.method4092(Static219.method3201(arg1.substring(13)));
				Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
				Static303.aBoolean816 = false;
				Static324.method4374("particles=" + Static241.method3473());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static324.method4374("Invalid rect_debug value");
					return;
				}
				Static231.anInt4065 = Static219.method3201(arg1.substring(10).trim());
				Static324.method4374("rect_debug=" + Static231.anInt4065);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static239.aBoolean665 = true;
				Static324.method4374("qa_op_test=" + Static239.aBoolean665);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static456.aBoolean820 = !Static456.aBoolean820;
				Static324.method4374("clipcomponents=" + Static456.aBoolean820);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(803) boolean local803 = Static185.aClass34_7.method5734();
				if (!Static18.method276(!local803)) {
					Static324.method4374("Failed to enable bloom");
					return;
				}
				if (local803) {
					Static324.method4374("Bloom disabled");
					return;
				}
				Static324.method4374("Bloom enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static389.aBoolean713) {
					Static389.aBoolean713 = true;
					Static324.method4374("Forced tweening ENABLED!");
					return;
				}
				Static389.aBoolean713 = false;
				Static324.method4374("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static345.aBoolean678) {
					Static324.method4374("Shift-click disabled.");
					Static345.aBoolean678 = false;
					return;
				}
				Static324.method4374("Shift-click ENABLED!");
				Static345.aBoolean678 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static324.method4374("x:" + (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7) + " z:" + (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static324.method4374("Height: " + Static94.aClass157Array1[Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94].ua(Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static448.aClass82_104.method1833();
				Static448.aClass82_104.method1837();
				Static355.aClass263_4.method5836();
				Static392.aClass178_4.method3961();
				Static72.method1154();
				Static324.method4374("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static185.aClass34_7.method5732()) {
					local112 = Integer.parseInt(arg1.substring(3));
					if (local112 < 1) {
						local112 = 1;
					} else if (local112 > 4) {
						local112 = 4;
					}
					Static126.anInt2335 = local112;
					Static185.aClass34_7.method5757(Static126.anInt2335);
					Static185.aClass34_7.method5742(0);
					Static324.method4374("Render cores now: " + Static126.anInt2335);
					return;
				}
				Static324.method4374("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static324.method4374("I(s): " + Static190.aClass102_23.method2265() + "/" + Static190.aClass102_23.method2266());
				Static324.method4374("I(m): " + Static370.aClass102_46.method2265() + "/" + Static370.aClass102_46.method2266());
				Static324.method4374("O(s): " + Static342.aClass155_2.aClass120_1.method2674() + "/" + Static342.aClass155_2.aClass120_1.method2686());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static324.method4374("Pos: " + Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 + "," + ((Static213.anInt258 >> 7) + Static199.anInt3480 >> 6) + "," + (Static164.anInt2731 + (Static360.anInt6145 >> 7) >> 6) + "," + ((Static213.anInt258 >> 7) + Static199.anInt3480 & 0x3F) + "," + (Static164.anInt2731 + (Static360.anInt6145 >> 7) & 0x3F) + " Height: " + (Static335.method4499(Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94, Static213.anInt258, Static360.anInt6145) - Static391.anInt6529));
				Static324.method4374("Look: " + Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 + "," + (Static199.anInt3480 + Static145.anInt1966 >> 6) + "," + (Static164.anInt2731 + Static260.anInt2259 >> 6) + "," + (Static145.anInt1966 + Static199.anInt3480 & 0x3F) + "," + (Static164.anInt2731 + Static260.anInt2259 & 0x3F) + " Height: " + (Static335.method4499(Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94, Static145.anInt1966, Static260.anInt2259) - Static309.anInt5374));
				return;
			}
			if (arg1.equals("showocc")) {
				Static59.aBoolean121 = !Static59.aBoolean121;
				Static353.method4772();
				Static324.method4374("showocc=" + Static59.aBoolean121);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static335.aBoolean651 = !Static335.aBoolean651;
				Static353.method4772();
				Static324.method4374("forcewallocc=" + Static335.aBoolean651);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static372.aBoolean702 = !Static372.aBoolean702;
				Static185.aClass34_7.method5737(Static372.aBoolean702);
				Static272.method3801();
				Static324.method4374("showprofiling=" + Static372.aBoolean702);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static324.method4374("Java toolkit: " + Static333.method4487(Static183.aClass83_2));
				Static324.method4374("GL toolkit:   " + Static333.method4487(Static183.aClass83_2));
				Static324.method4374("SSE toolkit:  " + Static333.method4487(Static183.aClass83_2));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static189.aBoolean377 = !Static189.aBoolean377;
				Static324.method4374("nonpcs=" + Static189.aBoolean377);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static418.method5569();
				Static324.method4374("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local112 = Integer.parseInt(arg1.substring(12));
				Static244.method3508(local112, Static363.method4853(local112).aString73);
				Static324.method4374("switched");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static52.method867(Static441.aClass103_251);
				Static18.aClass1_Sub28_Sub1_1.method5398(0);
				local112 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
				local569 = arg1.indexOf(" ", 4);
				Static18.aClass1_Sub28_Sub1_1.method5364(arg1.substring(3, local569));
				Static207.method4750(arg1.substring(local569), Static18.aClass1_Sub28_Sub1_1);
				Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local112);
				return;
			}
			if (arg1.equals("heap")) {
				Static324.method4374("Heap: " + Static270.anInt4858 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static364.method2863();
				Static324.method4374("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local112 = 0; local112 < Static352.anIntArray414.length; local112++) {
					if (Static148.aBooleanArray9[local112]) {
						Static352.anIntArray414[local112] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static352.anIntArray414[local112] *= -1;
						}
					}
				}
				Static364.method2863();
				Static324.method4374("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static88.aBoolean185 = true;
				Static72.method1154();
				Static324.method4374("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static88.aBoolean185 = false;
				Static72.method1154();
				Static324.method4374("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static417.method5509();
				Static324.method4374("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static324.method4374(Static380.method5015() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local112 = Integer.parseInt(arg1.substring(9));
				if (local112 >= 0 && local112 <= 4) {
					Static453.aClass136_Sub1_1.anInt4459 = local112;
				}
				Static324.method4374("cpuusage=" + Static453.aClass136_Sub1_1.anInt4459);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local112 = Integer.parseInt(arg1.substring(17));
				Static324.method4374("varpbit=" + Static320.aClass249_2.method5594(local112));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local112 = Integer.parseInt(arg1.substring(14));
				Static324.method4374("varp=" + Static320.aClass249_2.method5593(local112));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static220.method3223(0, false);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static220.method3223(0, true);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1587) String[] local1587 = Static192.method2761(' ', arg1.substring(12));
				if (local1587.length >= 2) {
					local569 = local1587.length <= 2 ? 0 : Integer.parseInt(local1587[2]);
					Static331.method4436(local569, local1587[0], local1587[1]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static298.method4077();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static298.method4072();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static298.method4072();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local112 = Integer.parseInt(arg1.substring(8));
				Static185.aClass34_7.method5790(local112);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static324.method4374("Active streams: " + Static355.aClass1_Sub6_Sub4_2.method5173());
				return;
			}
			if (Static312.anInt5414 == 9) {
				Static52.method867(Static130.aClass103_99);
				Static18.aClass1_Sub28_Sub1_1.method5398(arg1.length() + 3);
				Static18.aClass1_Sub28_Sub1_1.method5398(arg2 ? 1 : 0);
				Static18.aClass1_Sub28_Sub1_1.method5398(arg0 ? 1 : 0);
				Static18.aClass1_Sub28_Sub1_1.method5364(arg1);
			}
			if (arg1.startsWith("fps ") && Static328.aClass30_10 != Static459.aClass30_13) {
				Static277.method4340(Static219.method3201(arg1.substring(4)));
				return;
			}
			if (Static312.anInt5414 != 9) {
				Static324.method4374("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1732) Exception local1732) {
			Static324.method4374("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(CZ)Z")
	public static boolean method2835(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(31) char[] local31 = Static95.aCharArray1;
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				@Pc(39) char local39 = local31[local33];
				if (local39 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
