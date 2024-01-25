import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_136 = new Class7("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_188 = new Class107(19, -2);

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "[C")
	public static final char[] aCharArray10 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
	public static int anInt6061 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIII)V")
	public static void method5057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static173.anInt3204 = arg1;
		Static222.anInt4040 = arg3;
		Static351.anInt5839 = arg2;
		Static368.anInt6042 = arg0;
		Static251.anInt4561 = arg5;
		Static410.anInt6627 = arg4;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method5059() {
		if (Static165.anIntArray277 != null) {
			return;
		}
		Static165.anIntArray277 = new int[65536];
		@Pc(22) double local22 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
			@Pc(38) float local38 = ((float) (local26 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local26 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(55) float local55 = (float) local49 / 128.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(59) float local59 = 0.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(65) float local65 = local38 / 60.0F;
				@Pc(68) int local68 = (int) local65;
				@Pc(72) int local72 = local68 % 6;
				@Pc(78) float local78 = (float) -local68 + local65;
				@Pc(84) float local84 = (1.0F - local47) * local55;
				@Pc(92) float local92 = local55 * (1.0F - local78 * local47);
				@Pc(104) float local104 = local55 * (1.0F - (1.0F - local78) * local47);
				if (local72 == 0) {
					local57 = local55;
					local59 = local104;
					local61 = local84;
				} else if (local72 == 1) {
					local57 = local92;
					local61 = local84;
					local59 = local55;
				} else if (local72 == 2) {
					local57 = local84;
					local61 = local104;
					local59 = local55;
				} else if (local72 == 3) {
					local57 = local84;
					local59 = local92;
					local61 = local55;
				} else if (local72 == 4) {
					local59 = local84;
					local61 = local55;
					local57 = local104;
				} else if (local72 == 5) {
					local59 = local84;
					local61 = local92;
					local57 = local55;
				}
				local57 = (float) Math.pow((double) local57, local22);
				local59 = (float) Math.pow((double) local59, local22);
				local61 = (float) Math.pow((double) local61, local22);
				@Pc(189) int local189 = (int) (local57 * 256.0F);
				@Pc(194) int local194 = (int) (local59 * 256.0F);
				@Pc(199) int local199 = (int) (local61 * 256.0F);
				@Pc(211) int local211 = local199 + (local194 << 8) + (local189 << 16) - 16777216;
				Static165.anIntArray277[local24++] = local211;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5060(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (Static35.aClass137_11 == Static45.aClass137_10 && Static225.anInt4107 < 2) {
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
				Static331.aBoolean498 = true;
				Static164.method2645("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static331.aBoolean498 = false;
				Static164.method2645("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static164.method2645("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(71) Throwable local71) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static242.anInt4434 = 0;
				Static49.anInt956 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static54.aClass141_3.method3358();
				Static164.method2645("Text coords cleared");
				return;
			}
			@Pc(118) int local118;
			@Pc(100) int local100;
			@Pc(108) Runtime local108;
			if (arg1.equalsIgnoreCase("gc")) {
				Static19.method500();
				for (local100 = 0; local100 < 10; local100++) {
					System.gc();
				}
				local108 = Runtime.getRuntime();
				local118 = (int) ((local108.totalMemory() - local108.freeMemory()) / 1024L);
				Static164.method2645("mem=" + local118 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static19.method500();
				for (local100 = 0; local100 < 10; local100++) {
					System.gc();
				}
				local108 = Runtime.getRuntime();
				local118 = (int) ((local108.totalMemory() - local108.freeMemory()) / 1024L);
				Static164.method2645("Memory before cleanup=" + local118 + "k");
				Static352.method4872();
				Static19.method500();
				for (@Pc(173) int local173 = 0; local173 < 10; local173++) {
					System.gc();
				}
				local118 = (int) ((local108.totalMemory() - local108.freeMemory()) / 1024L);
				Static164.method2645("Memory after cleanup=" + local118 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static164.method2645("Number of player models in cache:" + Static359.method4936());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static164.method2645("Dropped client connection");
				if (Static342.anInt5771 == 9) {
					Static276.method4032();
				} else if (Static342.anInt5771 == 10) {
					Static418.aBoolean473 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static365.aClass195_2.method4455();
				Static164.method2645("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static365.aClass195_2.method4446();
				Static164.method2645("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static77.aClass180_1.method4073();
				Static82.aClass229_1.method5210();
				Static365.aClass195_2.method4454();
				Static164.method2645("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static266.method5704();
				Static185.method2913();
				Static164.method2645("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static448.method5876(1, -1, -1, false);
				if (Static432.method5740() != 1) {
					Static164.method2645("wm1 failed");
					return;
				}
				Static164.method2645("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static448.method5876(2, -1, -1, false);
				if (Static432.method5740() != 2) {
					Static164.method2645("wm2 failed");
					return;
				}
				Static164.method2645("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static448.method5876(3, 768, 1024, false);
				if (Static432.method5740() != 3) {
					Static164.method2645("wm3 failed");
					return;
				}
				Static164.method2645("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static178.method2844(0);
				if (Static143.anInt2766 != 0) {
					Static164.method2645("Failed to enter tk0");
					return;
				}
				Static164.method2645("Entered tk0");
				Static38.aClass135_Sub1_1.anInt5098 = 0;
				Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
				Static77.aBoolean102 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static178.method2844(1);
				if (Static143.anInt2766 == 1) {
					Static164.method2645("Entered tk1");
					Static38.aClass135_Sub1_1.anInt5098 = 1;
					Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
					Static77.aBoolean102 = false;
					return;
				}
				Static164.method2645("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static178.method2844(2);
				if (Static143.anInt2766 != 2) {
					Static164.method2645("Failed to enter tk2");
					return;
				}
				Static164.method2645("Entered tk2");
				Static38.aClass135_Sub1_1.anInt5098 = 2;
				Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
				Static77.aBoolean102 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static178.method2844(3);
				if (Static143.anInt2766 != 3) {
					Static164.method2645("Failed to enter tk3");
					return;
				}
				Static164.method2645("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static38.aClass135_Sub1_1.aBoolean354 = !Static38.aClass135_Sub1_1.aBoolean354;
				Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
				Static77.aBoolean102 = false;
				Static266.method5704();
				Static164.method2645("ot=" + Static38.aClass135_Sub1_1.aBoolean354);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static38.aClass135_Sub1_1.aBoolean358 = !Static38.aClass135_Sub1_1.aBoolean358;
				Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
				Static77.aBoolean102 = false;
				Static266.method5704();
				Static164.method2645("gb=" + Static38.aClass135_Sub1_1.aBoolean358);
				return;
			}
			@Pc(552) int local552;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static164.method2645("Invalid shadows value");
					return;
				}
				@Pc(542) String local542 = arg1.substring(8);
				local552 = Static119.method749(local542) ? Static313.method4460(local542) : -1;
				if (local552 >= 0 && local552 <= 2) {
					Static38.aClass135_Sub1_1.method4232(Static143.anInt2766, local552);
					Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
					Static77.aBoolean102 = false;
					Static266.method5704();
					Static164.method2645("shadows=" + local552);
					return;
				}
				Static164.method2645("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static38.aClass135_Sub1_1.aBoolean357 = !Static38.aClass135_Sub1_1.aBoolean357;
				Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
				Static77.aBoolean102 = false;
				Static418.method5569();
				Static266.method5704();
				Static164.method2645("textures=" + Static38.aClass135_Sub1_1.aBoolean357);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static164.method2645("Invalid buildarea value");
					return;
				}
				local100 = Static313.method4460(arg1.substring(6));
				if (local100 >= 0 && local100 <= Static39.method721(Static79.anInt1766)) {
					Static38.aClass135_Sub1_1.anInt5103 = local100;
					Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
					Static77.aBoolean102 = false;
					Static164.method2645("maxbuildarea=" + Static38.aClass135_Sub1_1.anInt5103);
					return;
				}
				Static164.method2645("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static164.method2645("Invalid particles value");
					return;
				}
				Static278.method4057(Static313.method4460(arg1.substring(13)));
				Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
				Static77.aBoolean102 = false;
				Static164.method2645("particles=" + Static259.method3864());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static164.method2645("Invalid rect_debug value");
					return;
				}
				Static289.anInt6024 = Static313.method4460(arg1.substring(10).trim());
				Static164.method2645("rect_debug=" + Static289.anInt6024);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static313.aBoolean387 = true;
				Static164.method2645("qa_op_test=" + Static313.aBoolean387);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static278.aBoolean321 = !Static278.aBoolean321;
				Static164.method2645("clipcomponents=" + Static278.aBoolean321);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(779) boolean local779 = Static415.aClass39_11.method4547();
				if (Static341.method4807(!local779)) {
					if (!local779) {
						Static164.method2645("Bloom enabled");
						return;
					}
					Static164.method2645("Bloom disabled");
					return;
				}
				Static164.method2645("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static21.aBoolean16) {
					Static21.aBoolean16 = false;
					Static164.method2645("Forced tweening disabled.");
					return;
				}
				Static21.aBoolean16 = true;
				Static164.method2645("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static137.aBoolean164) {
					Static164.method2645("Shift-click disabled.");
					Static137.aBoolean164 = false;
					return;
				}
				Static164.method2645("Shift-click ENABLED!");
				Static137.aBoolean164 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static164.method2645("x:" + (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7) + " z:" + (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static164.method2645("Height: " + Static105.aClass149Array1[Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100].l(Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7, Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static345.aClass246_187.method5493();
				Static345.aClass246_187.method5474();
				Static343.aClass217_15.method4900();
				Static17.aClass78_3.method2115();
				Static185.method2913();
				Static164.method2645("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static415.aClass39_11.method4525()) {
					Static164.method2645("Current toolkit doesn't support multiple cores");
					return;
				}
				local100 = Integer.parseInt(arg1.substring(3));
				if (local100 < 1) {
					local100 = 1;
				} else if (local100 > 4) {
					local100 = 4;
				}
				Static276.anInt4868 = local100;
				Static415.aClass39_11.method4543(Static276.anInt4868);
				Static415.aClass39_11.method4531(0);
				Static164.method2645("Render cores now: " + Static276.anInt4868);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static164.method2645("I(s): " + Static70.aClass134_12.method3262() + "/" + Static70.aClass134_12.method3265());
				Static164.method2645("I(m): " + Static64.aClass134_11.method3262() + "/" + Static64.aClass134_11.method3265());
				Static164.method2645("O(s): " + Static165.aClass19_1.aClass122_1.method2908() + "/" + Static165.aClass19_1.aClass122_1.method2904());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static164.method2645("Pos: " + Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 + "," + (Static165.anInt3049 + (Static139.anInt2727 >> 7) >> 6) + "," + ((Static92.anInt1946 >> 7) + Static345.anInt5799 >> 6) + "," + (Static165.anInt3049 + (Static139.anInt2727 >> 7) & 0x3F) + "," + (Static345.anInt5799 + (Static92.anInt1946 >> 7) & 0x3F) + " Height: " + (Static301.method4312(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, Static139.anInt2727, Static92.anInt1946) - Static142.anInt5535));
				Static164.method2645("Look: " + Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 + "," + (Static372.anInt6092 + Static165.anInt3049 >> 6) + "," + (Static345.anInt5799 + Static374.anInt6117 >> 6) + "," + (Static372.anInt6092 + Static165.anInt3049 & 0x3F) + "," + (Static345.anInt5799 + Static374.anInt6117 & 0x3F) + " Height: " + (Static301.method4312(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, Static372.anInt6092, Static374.anInt6117) - Static452.anInt7261));
				return;
			}
			if (arg1.equals("showocc")) {
				Static429.aBoolean485 = !Static429.aBoolean485;
				Static266.method5704();
				Static164.method2645("showocc=" + Static429.aBoolean485);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static443.aBoolean492 = !Static443.aBoolean492;
				Static266.method5704();
				Static164.method2645("forcewallocc=" + Static443.aBoolean492);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static402.aBoolean443 = !Static402.aBoolean443;
				Static415.aClass39_11.method4539(Static402.aBoolean443);
				Static115.method2116();
				Static164.method2645("showprofiling=" + Static402.aBoolean443);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static164.method2645("Java toolkit: " + Static95.method1701(Static77.aClass180_1));
				Static164.method2645("GL toolkit:   " + Static95.method1701(Static77.aClass180_1));
				Static164.method2645("SSE toolkit:  " + Static95.method1701(Static77.aClass180_1));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static305.aBoolean379 = !Static305.aBoolean379;
				Static164.method2645("nonpcs=" + Static305.aBoolean379);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static35.method5798();
				Static164.method2645("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local100 = Integer.parseInt(arg1.substring(12));
				Static379.method3570(Static89.method1639(local100).aString21, local100);
				Static164.method2645("switched");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static193.method2984(Static186.aClass179_45);
				Static92.aClass1_Sub5_Sub1_1.method5396(0);
				local100 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
				local552 = arg1.indexOf(" ", 4);
				Static92.aClass1_Sub5_Sub1_1.method5385(arg1.substring(3, local552));
				Static446.method5864(Static92.aClass1_Sub5_Sub1_1, arg1.substring(local552));
				Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local100);
				return;
			}
			if (arg1.equals("heap")) {
				Static164.method2645("Heap: " + Static79.anInt1766 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static89.method1640();
				Static164.method2645("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local100 = 0; local100 < Static266.anIntArray630.length; local100++) {
					if (Static32.aBooleanArray1[local100]) {
						Static266.anIntArray630[local100] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static266.anIntArray630[local100] *= -1;
						}
					}
				}
				Static89.method1640();
				Static164.method2645("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static407.aBoolean447 = true;
				Static185.method2913();
				Static164.method2645("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static407.aBoolean447 = false;
				Static185.method2913();
				Static164.method2645("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static67.method1324();
				Static164.method2645("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static164.method2645(Static143.method2390() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local100 = Integer.parseInt(arg1.substring(9));
				if (local100 >= 0 && local100 <= 4) {
					Static38.aClass135_Sub1_1.anInt5105 = local100;
				}
				Static164.method2645("cpuusage=" + Static38.aClass135_Sub1_1.anInt5105);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local100 = Integer.parseInt(arg1.substring(17));
				Static164.method2645("varpbit=" + Static394.aClass23_1.method595(local100));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local100 = Integer.parseInt(arg1.substring(14));
				Static164.method2645("varp=" + Static394.aClass23_1.method594(local100));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static313.method4457(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static313.method4457(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1579) String[] local1579 = Static402.method5419(' ', arg1.substring(12));
				if (local1579.length >= 2) {
					local552 = local1579.length > 2 ? Integer.parseInt(local1579[2]) : 0;
					Static50.method892(local1579[1], local552, local1579[0]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static13.method361();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static13.method365();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static13.method365();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local100 = Integer.parseInt(arg1.substring(8));
				Static415.aClass39_11.method4511(local100);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static164.method2645("Active streams: " + Static59.aClass1_Sub19_Sub2_1.method2183());
				return;
			}
			if (Static342.anInt5771 == 9) {
				Static193.method2984(Static221.aClass179_29);
				Static92.aClass1_Sub5_Sub1_1.method5396(arg1.length() + 2);
				Static92.aClass1_Sub5_Sub1_1.method5396(arg0 ? 1 : 0);
				Static92.aClass1_Sub5_Sub1_1.method5385(arg1);
			}
			if (arg1.startsWith("fps ") && Static45.aClass137_10 != Static35.aClass137_11) {
				Static458.method6015(Static313.method4460(arg1.substring(4)));
				return;
			}
			if (Static342.anInt5771 != 9) {
				Static164.method2645("Unrecogonised commmand when not logged in: " + arg1);
			}
		} catch (@Pc(1716) Exception local1716) {
			Static164.method2645("Whoops, something went wrong.");
		}
	}
}
