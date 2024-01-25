import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[Lclient!cq;")
	public static final Class6_Sub1_Sub5[] aClass6_Sub1_Sub5Array7 = new Class6_Sub1_Sub5[14];

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "[I")
	public static final int[] anIntArray456 = new int[100];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method4464(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static449.aClass207_11 == Static194.aClass207_8 && Static221.anInt3810 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static412.aBoolean472 = true;
				Static98.method5863("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static412.aBoolean472 = false;
				Static98.method5863("fps debug disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static59.anInt1234 = 0;
				Static371.anInt6171 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static28.aClass128_1.method2829();
				Static98.method5863("Text coords cleared");
				return;
			}
			@Pc(74) int local74;
			@Pc(94) int local94;
			@Pc(85) Runtime local85;
			if (arg0.equalsIgnoreCase("gc")) {
				Static240.method3726();
				for (local74 = 0; local74 < 10; local74++) {
					System.gc();
				}
				local85 = Runtime.getRuntime();
				local94 = (int) ((local85.totalMemory() - local85.freeMemory()) / 1024L);
				Static98.method5863("mem=" + local94 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static240.method3726();
				for (local74 = 0; local74 < 10; local74++) {
					System.gc();
				}
				local85 = Runtime.getRuntime();
				local94 = (int) ((local85.totalMemory() - local85.freeMemory()) / 1024L);
				Static98.method5863("Memory before cleanup=" + local94 + "k");
				Static291.method5976();
				Static240.method3726();
				for (@Pc(152) int local152 = 0; local152 < 10; local152++) {
					System.gc();
				}
				local94 = (int) ((local85.totalMemory() - local85.freeMemory()) / 1024L);
				Static98.method5863("Memory after cleanup=" + local94 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static98.method5863("Number of player models in cache:" + Static439.method5910());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static98.method5863("Dropped client connection");
				if (Static54.anInt1123 == 30) {
					Static109.method1806();
					return;
				}
				if (Static54.anInt1123 == 25) {
					Static234.aBoolean264 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static376.aClass179_3.method4133();
				Static98.method5863("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static376.aClass179_3.method4137();
				Static98.method5863("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static165.aClass103_3.method2369();
				Static103.aClass30_1.method736();
				Static376.aClass179_3.method4136();
				Static98.method5863("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static118.method1900();
				Static134.method2179();
				Static98.method5863("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static369.method5142(false, 1, -1, -1);
				if (Static172.method2743() == 1) {
					Static98.method5863("wm1 succeeded");
					return;
				}
				Static98.method5863("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static369.method5142(false, 2, -1, -1);
				if (Static172.method2743() != 2) {
					Static98.method5863("wm2 failed");
					return;
				}
				Static98.method5863("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static369.method5142(false, 3, 1024, 768);
				if (Static172.method2743() == 3) {
					Static98.method5863("wm3 succeeded");
					return;
				}
				Static98.method5863("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static385.method5310(0);
				if (Static155.anInt2774 != 0) {
					Static98.method5863("Failed to enter tk0");
					return;
				}
				Static98.method5863("Entered tk0");
				Static8.aClass173_Sub1_1.anInt4408 = 0;
				Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
				Static59.aBoolean106 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static385.method5310(1);
				if (Static155.anInt2774 != 1) {
					Static98.method5863("Failed to enter tk1");
					return;
				}
				Static98.method5863("Entered tk1");
				Static8.aClass173_Sub1_1.anInt4408 = 1;
				Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
				Static59.aBoolean106 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static385.method5310(2);
				if (Static155.anInt2774 == 2) {
					Static98.method5863("Entered tk2");
					Static8.aClass173_Sub1_1.anInt4408 = 2;
					Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
					Static59.aBoolean106 = false;
					return;
				}
				Static98.method5863("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static385.method5310(3);
				if (Static155.anInt2774 == 3) {
					Static98.method5863("Entered tk3");
					return;
				}
				Static98.method5863("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static8.aClass173_Sub1_1.aBoolean304 = !Static8.aClass173_Sub1_1.aBoolean304;
				Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
				Static59.aBoolean106 = false;
				Static118.method1900();
				Static98.method5863("ot=" + Static8.aClass173_Sub1_1.aBoolean304);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static8.aClass173_Sub1_1.aBoolean305 = !Static8.aClass173_Sub1_1.aBoolean305;
				Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
				Static59.aBoolean106 = false;
				Static118.method1900();
				Static98.method5863("gb=" + Static8.aClass173_Sub1_1.aBoolean305);
				return;
			}
			@Pc(527) int local527;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static98.method5863("Invalid shadows value");
					return;
				}
				@Pc(517) String local517 = arg0.substring(8);
				local527 = Static176.method2767(local517) ? Static265.method4063(local517) : -1;
				if (local527 >= 0 && local527 <= 2) {
					Static8.aClass173_Sub1_1.anInt4420 = local527;
					Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
					Static59.aBoolean106 = false;
					Static118.method1900();
					Static98.method5863("shadows=" + local527);
					return;
				}
				Static98.method5863("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static98.method5863("Invalid buildarea value");
					return;
				}
				local74 = Static265.method4063(arg0.substring(6));
				if (local74 >= 0 && Static254.method3445(Static2.anInt8) >= local74) {
					Static8.aClass173_Sub1_1.anInt4418 = local74;
					Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
					Static59.aBoolean106 = false;
					Static98.method5863("maxbuildarea=" + Static8.aClass173_Sub1_1.anInt4418);
					return;
				}
				Static98.method5863("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static98.method5863("Invalid particles value");
					return;
				}
				Static165.method2690(Static265.method4063(arg0.substring(13)));
				Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
				Static59.aBoolean106 = false;
				Static98.method5863("particles=" + Static171.method1545());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static98.method5863("Invalid rect_debug value");
					return;
				}
				Static320.anInt5213 = Static265.method4063(arg0.substring(10).trim());
				Static98.method5863("rect_debug=" + Static320.anInt5213);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static268.aBoolean330 = true;
				Static98.method5863("qa_op_test=" + Static268.aBoolean330);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static49.aBoolean80 = !Static49.aBoolean80;
				Static98.method5863("clipcomponents=" + Static49.aBoolean80);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(717) boolean local717 = Static44.aClass28_14.method3563();
				if (!Static416.method4229(!local717)) {
					Static98.method5863("Failed to enable bloom");
					return;
				}
				if (local717) {
					Static98.method5863("Bloom disabled");
					return;
				}
				Static98.method5863("Bloom enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static116.aBoolean157) {
					Static116.aBoolean157 = true;
					Static98.method5863("Forced tweening ENABLED!");
					return;
				}
				Static116.aBoolean157 = false;
				Static98.method5863("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static219.aBoolean247) {
					Static98.method5863("Shift-click ENABLED!");
					Static219.aBoolean247 = true;
					return;
				}
				Static98.method5863("Shift-click disabled.");
				Static219.aBoolean247 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static98.method5863("x:" + (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7) + " z:" + (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static98.method5863("Height: " + Static420.aClass84Array4[Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93].method5322(Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 >> 7, Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static76.aClass158_17.method3671();
				Static76.aClass158_17.method3689();
				Static405.aClass190_4.method4317();
				Static171.aClass254_3.method5835();
				Static134.method2179();
				Static98.method5863("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static44.aClass28_14.method3493()) {
					Static98.method5863("Current toolkit doesn't support multiple cores");
					return;
				}
				local74 = Integer.parseInt(arg0.substring(3));
				if (local74 < 1) {
					local74 = 1;
				} else if (local74 > 4) {
					local74 = 4;
				}
				Static373.anInt1818 = local74;
				Static44.aClass28_14.method3567(Static373.anInt1818);
				Static44.aClass28_14.method3490(0);
				Static98.method5863("Render cores now: " + Static373.anInt1818);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static98.method5863("I(s): " + Static434.aClass220_56.method4988() + "/" + Static434.aClass220_56.method4986());
				Static98.method5863("I(m): " + Static253.aClass220_38.method4988() + "/" + Static253.aClass220_38.method4986());
				Static98.method5863("O(s): " + Static354.aClass170_2.aClass49_1.method1380() + "/" + Static354.aClass170_2.aClass49_1.method1383());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static98.method5863("Pos: " + Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 + "," + ((Static32.anInt521 >> 7) + Static206.anInt3592 >> 6) + "," + (Static99.anInt1814 + (Static214.anInt3730 >> 7) >> 6) + "," + ((Static32.anInt521 >> 7) + Static206.anInt3592 & 0x3F) + "," + (Static99.anInt1814 + (Static214.anInt3730 >> 7) & 0x3F) + " Height: " + (Static165.method2689(Static32.anInt521, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93, Static214.anInt3730) - Static354.anInt5973));
				Static98.method5863("Look: " + Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 + "," + (Static38.anInt852 + Static206.anInt3592 >> 6) + "," + (Static99.anInt1814 + Static5.anInt47 >> 6) + "," + (Static38.anInt852 + Static206.anInt3592 & 0x3F) + "," + (Static5.anInt47 + Static99.anInt1814 & 0x3F) + " Height: " + (Static165.method2689(Static38.anInt852, Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93, Static5.anInt47) - Static46.anInt5784));
				return;
			}
			if (arg0.equals("showocc")) {
				Static367.aBoolean484 = !Static367.aBoolean484;
				Static118.method1900();
				Static98.method5863("showocc=" + Static367.aBoolean484);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static432.aBoolean489 = !Static432.aBoolean489;
				Static118.method1900();
				Static98.method5863("forcewallocc=" + Static432.aBoolean489);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static19.aBoolean15 = !Static19.aBoolean15;
				Static44.aClass28_14.method3505(Static19.aBoolean15);
				Static327.method4687();
				Static98.method5863("showprofiling=" + Static19.aBoolean15);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static98.method5863("Java toolkit: " + Static249.method3847(Static165.aClass103_3));
				Static98.method5863("GL toolkit:   " + Static249.method3847(Static165.aClass103_3));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static149.aBoolean194 = !Static149.aBoolean194;
				Static98.method5863("nonpcs=" + Static149.aBoolean194);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static157.method5939();
				Static98.method5863("auto world selected");
				return;
			}
			if (arg0.startsWith("pc")) {
				Static298.method4373(Static275.aClass25_73);
				Static449.aClass6_Sub15_Sub1_2.method3075(0);
				local74 = Static449.aClass6_Sub15_Sub1_2.anInt3487;
				local527 = arg0.indexOf(" ", 4);
				Static449.aClass6_Sub15_Sub1_2.method3094(arg0.substring(3, local527));
				Static155.method2530(Static449.aClass6_Sub15_Sub1_2, arg0.substring(local527));
				Static449.aClass6_Sub15_Sub1_2.method3118(Static449.aClass6_Sub15_Sub1_2.anInt3487 - local74);
				return;
			}
			if (arg0.equals("heap")) {
				Static98.method5863("Heap: " + Static2.anInt8 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static224.method3409();
				Static98.method5863("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local74 = 0; local74 < Static235.anIntArray358.length; local74++) {
					if (Static434.aBooleanArray27[local74]) {
						Static235.anIntArray358[local74] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static235.anIntArray358[local74] *= -1;
						}
					}
				}
				Static224.method3409();
				Static98.method5863("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static17.aBoolean14 = true;
				Static134.method2179();
				Static98.method5863("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static17.aBoolean14 = false;
				Static134.method2179();
				Static98.method5863("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static403.method5492();
				Static98.method5863("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static98.method5863(Static144.method2411() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local74 = Integer.parseInt(arg0.substring(9));
				if (local74 >= 0 && local74 <= 4) {
					Static8.aClass173_Sub1_1.anInt4405 = local74;
				}
				Static98.method5863("cpuusage=" + Static8.aClass173_Sub1_1.anInt4405);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local74 = Integer.parseInt(arg0.substring(17));
				Static98.method5863("varpbit=" + Static71.aClass126_1.method2802(local74));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local74 = Integer.parseInt(arg0.substring(14));
				Static98.method5863("varp=" + Static71.aClass126_1.method2803(local74));
				return;
			}
			if (arg0.startsWith("csprofileclear")) {
				Static308.method4425();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static308.method4422();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static308.method4422();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local74 = Integer.parseInt(arg0.substring(8));
				Static44.aClass28_14.method3500(local74);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static98.method5863("Active streams: " + Static371.aClass6_Sub5_Sub2_2.method2164());
				return;
			}
			if (Static54.anInt1123 == 30) {
				Static298.method4373(Static30.aClass25_12);
				Static449.aClass6_Sub15_Sub1_2.method3075(arg0.length() + 2);
				Static449.aClass6_Sub15_Sub1_2.method3075(arg1 ? 1 : 0);
				Static449.aClass6_Sub15_Sub1_2.method3094(arg0);
			}
			if (arg0.startsWith("fps ") && Static194.aClass207_8 != Static449.aClass207_11) {
				Static303.method4401(Static265.method4063(arg0.substring(4)));
				return;
			}
			if (Static54.anInt1123 != 30) {
				Static98.method5863("Unrecogonised commmand when not logged in: " + arg0);
				return;
			}
		} catch (@Pc(1553) Exception local1553) {
			Static98.method5863("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Lclient!wa;")
	public static Class257 method4465(@OriginalArg(1) int arg0) {
		@Pc(13) Class257[] local13 = Static75.method1409();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class257 local21 = local13[local15];
			if (arg0 == local21.anInt7176) {
				return local21;
			}
		}
		return null;
	}
}
