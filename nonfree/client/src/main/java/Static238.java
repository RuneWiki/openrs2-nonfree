import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ls", name = "U", descriptor = "I")
	public static int anInt4206;

	@OriginalMember(owner = "client!ls", name = "I", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_67 = new Class96("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!ls", name = "M", descriptor = "Z")
	public static boolean aBoolean330 = false;

	@OriginalMember(owner = "client!ls", name = "O", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_11 = new Class60(11, 7);

	@OriginalMember(owner = "client!ls", name = "R", descriptor = "I")
	public static int anInt4203 = 0;

	@OriginalMember(owner = "client!ls", name = "T", descriptor = "I")
	public static final int anInt4205 = -1;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method3491(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static153.aClass174_7 == Static191.aClass174_5 && Static64.anInt1161 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static356.aBoolean529 = true;
				Static161.method2529("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static356.aBoolean529 = false;
				Static161.method2529("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static214.anInt6453 = 0;
				Static72.anInt1373 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static311.aClass242_8.method5505();
				Static161.method2529("Text coords cleared");
				return;
			}
			@Pc(72) int local72;
			@Pc(92) int local92;
			@Pc(83) Runtime local83;
			if (arg1.equalsIgnoreCase("gc")) {
				Static63.method957();
				for (local72 = 0; local72 < 10; local72++) {
					System.gc();
				}
				local83 = Runtime.getRuntime();
				local92 = (int) ((local83.totalMemory() - local83.freeMemory()) / 1024L);
				Static161.method2529("mem=" + local92 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static63.method957();
				for (local72 = 0; local72 < 10; local72++) {
					System.gc();
				}
				local83 = Runtime.getRuntime();
				local92 = (int) ((local83.totalMemory() - local83.freeMemory()) / 1024L);
				Static161.method2529("Memory before cleanup=" + local92 + "k");
				Static148.method5612();
				Static63.method957();
				for (@Pc(150) int local150 = 0; local150 < 10; local150++) {
					System.gc();
				}
				local92 = (int) ((local83.totalMemory() - local83.freeMemory()) / 1024L);
				Static161.method2529("Memory after cleanup=" + local92 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static161.method2529("Number of player models in cache:" + Static76.method1130());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static161.method2529("Dropped client connection");
				if (Static40.anInt629 == 30) {
					Static205.method4048();
					return;
				}
				if (Static40.anInt629 == 25) {
					Static158.aBoolean226 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static125.aClass164_2.method3589();
				Static161.method2529("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static125.aClass164_2.method3576();
				Static161.method2529("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static403.aClass42_6.method643();
				Static169.aClass114_4.method2492();
				Static125.aClass164_2.method3579();
				Static161.method2529("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static449.method5976();
				Static33.method459();
				Static161.method2529("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static230.method3353(-1, false, -1, 1);
				if (Static174.method2768() == 1) {
					Static161.method2529("wm1 succeeded");
					return;
				}
				Static161.method2529("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static230.method3353(-1, false, -1, 2);
				if (Static174.method2768() == 2) {
					Static161.method2529("wm2 succeeded");
					return;
				}
				Static161.method2529("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static230.method3353(768, false, 1024, 3);
				if (Static174.method2768() == 3) {
					Static161.method2529("wm3 succeeded");
					return;
				}
				Static161.method2529("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static375.method5899(0);
				if (Static146.anInt2664 == 0) {
					Static161.method2529("Entered tk0");
					Static327.aClass230_Sub1_1.anInt7313 = 0;
					Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
					Static291.aBoolean656 = false;
					return;
				}
				Static161.method2529("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static375.method5899(1);
				if (Static146.anInt2664 != 1) {
					Static161.method2529("Failed to enter tk1");
					return;
				}
				Static161.method2529("Entered tk1");
				Static327.aClass230_Sub1_1.anInt7313 = 1;
				Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
				Static291.aBoolean656 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static375.method5899(2);
				if (Static146.anInt2664 == 2) {
					Static161.method2529("Entered tk2");
					Static327.aClass230_Sub1_1.anInt7313 = 2;
					Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
					Static291.aBoolean656 = false;
					return;
				}
				Static161.method2529("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static375.method5899(3);
				if (Static146.anInt2664 != 3) {
					Static161.method2529("Failed to enter tk3");
					return;
				}
				Static161.method2529("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static327.aClass230_Sub1_1.aBoolean605 = !Static327.aClass230_Sub1_1.aBoolean605;
				Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
				Static291.aBoolean656 = false;
				Static449.method5976();
				Static161.method2529("ot=" + Static327.aClass230_Sub1_1.aBoolean605);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static327.aClass230_Sub1_1.aBoolean615 = !Static327.aClass230_Sub1_1.aBoolean615;
				Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
				Static291.aBoolean656 = false;
				Static449.method5976();
				Static161.method2529("gb=" + Static327.aClass230_Sub1_1.aBoolean615);
				return;
			}
			@Pc(537) int local537;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static161.method2529("Invalid shadows value");
					return;
				}
				@Pc(527) String local527 = arg1.substring(8);
				local537 = Static12.method213(local527) ? Static32.method455(local527) : -1;
				if (local537 >= 0 && local537 <= 2) {
					Static327.aClass230_Sub1_1.method5642(local537, Static146.anInt2664);
					Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
					Static291.aBoolean656 = false;
					Static449.method5976();
					Static161.method2529("shadows=" + local537);
					return;
				}
				Static161.method2529("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static327.aClass230_Sub1_1.aBoolean617 = !Static327.aClass230_Sub1_1.aBoolean617;
				Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
				Static291.aBoolean656 = false;
				Static366.method5216();
				Static449.method5976();
				Static161.method2529("textures=" + Static327.aClass230_Sub1_1.aBoolean617);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static161.method2529("Invalid buildarea value");
					return;
				}
				local72 = Static32.method455(arg1.substring(6));
				if (local72 >= 0 && Static219.method3244(Static188.anInt3481) >= local72) {
					Static327.aClass230_Sub1_1.anInt7294 = local72;
					Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
					Static291.aBoolean656 = false;
					Static161.method2529("maxbuildarea=" + Static327.aClass230_Sub1_1.anInt7294);
					return;
				}
				Static161.method2529("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static161.method2529("Invalid particles value");
					return;
				}
				Static403.method5490(Static32.method455(arg1.substring(13)));
				Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
				Static291.aBoolean656 = false;
				Static161.method2529("particles=" + Static235.method3424());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static161.method2529("Invalid rect_debug value");
					return;
				}
				Static41.anInt661 = Static32.method455(arg1.substring(10).trim());
				Static161.method2529("rect_debug=" + Static41.anInt661);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static424.aBoolean633 = true;
				Static161.method2529("qa_op_test=" + Static424.aBoolean633);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static167.aBoolean234 = !Static167.aBoolean234;
				Static161.method2529("clipcomponents=" + Static167.aBoolean234);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(769) boolean local769 = Static447.aClass121_11.method4613();
				if (Static124.method1938(!local769)) {
					if (local769) {
						Static161.method2529("Bloom disabled");
						return;
					}
					Static161.method2529("Bloom enabled");
					return;
				}
				Static161.method2529("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static147.aBoolean259) {
					Static147.aBoolean259 = false;
					Static161.method2529("Forced tweening disabled.");
					return;
				}
				Static147.aBoolean259 = true;
				Static161.method2529("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static54.aBoolean82) {
					Static161.method2529("Shift-click disabled.");
					Static54.aBoolean82 = false;
					return;
				}
				Static161.method2529("Shift-click ENABLED!");
				Static54.aBoolean82 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static161.method2529("x:" + (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7) + " z:" + (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static161.method2529("Height: " + Static256.aClass70Array2[Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97].I(Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static353.aClass109_79.method2338();
				Static353.aClass109_79.method2329();
				Static50.aClass177_1.method3803();
				Static86.aClass103_2.method2053();
				Static33.method459();
				Static161.method2529("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static447.aClass121_11.method4640()) {
					local72 = Integer.parseInt(arg1.substring(3));
					if (local72 < 1) {
						local72 = 1;
					} else if (local72 > 4) {
						local72 = 4;
					}
					Static144.anInt2601 = local72;
					Static447.aClass121_11.method4577(Static144.anInt2601);
					Static447.aClass121_11.method4609(0);
					Static161.method2529("Render cores now: " + Static144.anInt2601);
					return;
				}
				Static161.method2529("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static161.method2529("I(s): " + Static338.aClass151_145.method3284() + "/" + Static338.aClass151_145.method3293());
				Static161.method2529("I(m): " + Static331.aClass151_143.method3284() + "/" + Static331.aClass151_143.method3293());
				Static161.method2529("O(s): " + Static388.aClass193_3.aClass225_1.method5358() + "/" + Static388.aClass193_3.aClass225_1.method5359());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static161.method2529("Pos: " + Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 + "," + (Static190.anInt3507 + (Static302.anInt5030 >> 7) >> 6) + "," + (Static331.anInt6034 + (Static4.anInt149 >> 7) >> 6) + "," + ((Static302.anInt5030 >> 7) + Static190.anInt3507 & 0x3F) + "," + (Static331.anInt6034 + (Static4.anInt149 >> 7) & 0x3F) + " Height: " + (Static405.method5510(Static4.anInt149, Static302.anInt5030, Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97) - Static264.anInt4481));
				Static161.method2529("Look: " + Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 + "," + (Static190.anInt3507 + Static382.anInt5701 >> 6) + "," + (Static331.anInt6034 + Static321.anInt5590 >> 6) + "," + (Static382.anInt5701 + Static190.anInt3507 & 0x3F) + "," + (Static321.anInt5590 + Static331.anInt6034 & 0x3F) + " Height: " + (Static405.method5510(Static321.anInt5590, Static382.anInt5701, Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97) - Static84.anInt6174));
				return;
			}
			if (arg1.equals("showocc")) {
				Static61.aBoolean95 = !Static61.aBoolean95;
				Static449.method5976();
				Static161.method2529("showocc=" + Static61.aBoolean95);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static151.aBoolean220 = !Static151.aBoolean220;
				Static449.method5976();
				Static161.method2529("forcewallocc=" + Static151.aBoolean220);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static358.aBoolean530 = !Static358.aBoolean530;
				Static447.aClass121_11.method4624(Static358.aBoolean530);
				Static264.method3705();
				Static161.method2529("showprofiling=" + Static358.aBoolean530);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static161.method2529("Java toolkit: " + Static26.method371(Static403.aClass42_6));
				Static161.method2529("GL toolkit:   " + Static26.method371(Static403.aClass42_6));
				Static161.method2529("SSE toolkit:  " + Static26.method371(Static403.aClass42_6));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static179.aBoolean265 = !Static179.aBoolean265;
				Static161.method2529("nonpcs=" + Static179.aBoolean265);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static291.method5967();
				Static161.method2529("auto world selected");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static224.method3272(Static262.aClass254_91);
				Static201.aClass1_Sub14_Sub2_2.method4553(0);
				local72 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
				local537 = arg1.indexOf(" ", 4);
				Static201.aClass1_Sub14_Sub2_2.method4512(arg1.substring(3, local537));
				Static234.method3390(arg1.substring(local537), Static201.aClass1_Sub14_Sub2_2);
				Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local72);
				return;
			}
			if (arg1.equals("heap")) {
				Static161.method2529("Heap: " + Static188.anInt3481 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static51.method746();
				Static161.method2529("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local72 = 0; local72 < Static103.anIntArray102.length; local72++) {
					if (Static342.aBooleanArray23[local72]) {
						Static103.anIntArray102[local72] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static103.anIntArray102[local72] *= -1;
						}
					}
				}
				Static51.method746();
				Static161.method2529("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static84.aBoolean504 = true;
				Static33.method459();
				Static161.method2529("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static84.aBoolean504 = false;
				Static33.method459();
				Static161.method2529("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static278.method5798();
				Static161.method2529("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static161.method2529(Static252.method3608() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local72 = Integer.parseInt(arg1.substring(9));
				if (local72 >= 0 && local72 <= 4) {
					Static327.aClass230_Sub1_1.anInt7309 = local72;
				}
				Static161.method2529("cpuusage=" + Static327.aClass230_Sub1_1.anInt7309);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local72 = Integer.parseInt(arg1.substring(17));
				Static161.method2529("varpbit=" + Static237.aClass80_1.method1612(local72));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local72 = Integer.parseInt(arg1.substring(14));
				Static161.method2529("varp=" + Static237.aClass80_1.method1613(local72));
				return;
			}
			if (arg1.startsWith("csprofileclear")) {
				Static354.method5062();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static354.method5071();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static354.method5071();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local72 = Integer.parseInt(arg1.substring(8));
				Static447.aClass121_11.method4642(local72);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static161.method2529("Active streams: " + Static292.aClass1_Sub5_Sub1_2.method416());
				return;
			}
			if (Static40.anInt629 == 30) {
				Static224.method3272(Static435.aClass254_114);
				Static201.aClass1_Sub14_Sub2_2.method4553(arg1.length() + 2);
				Static201.aClass1_Sub14_Sub2_2.method4553(arg0 ? 1 : 0);
				Static201.aClass1_Sub14_Sub2_2.method4512(arg1);
			}
			if (arg1.startsWith("fps ") && Static191.aClass174_5 != Static153.aClass174_7) {
				Static315.method4344(Static32.method455(arg1.substring(4)));
				return;
			}
			if (Static40.anInt629 != 30) {
				Static161.method2529("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1612) Exception local1612) {
			Static161.method2529("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(IB)V")
	public static void method3493(@OriginalArg(0) int arg0) {
		Static300.anInt5009 = arg0;
		@Pc(7) Class151 local7 = Static241.aClass151_108;
		synchronized (Static241.aClass151_108) {
			Static241.aClass151_108.method3298();
		}
		local7 = Static299.aClass151_126;
		synchronized (Static299.aClass151_126) {
			Static299.aClass151_126.method3298();
		}
	}
}
