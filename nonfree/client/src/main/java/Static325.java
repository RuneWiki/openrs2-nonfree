import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!va", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString282;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	public static int anInt5997 = 0;

	@OriginalMember(owner = "client!va", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[8];

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
	public static void method5421() {
		if (Static292.aClass34_1 != null) {
			Static292.aClass34_1.method5827();
		}
		if (Static326.aClass34_2 != null) {
			Static326.aClass34_2.method5827();
		}
		Static156.method5550(Static314.aBoolean195);
		Static292.aClass34_1 = Static198.method3624(22050, Static308.aClass206_5, 0, Static354.aCanvas5);
		Static292.aClass34_1.method5823(Static120.aClass6_Sub12_Sub1_1);
		Static326.aClass34_2 = Static198.method3624(2048, Static308.aClass206_5, 1, Static354.aCanvas5);
		Static326.aClass34_2.method5823(Static241.aClass6_Sub12_Sub3_6);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5422(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static189.anInt3601 == 0 && Static115.anInt2157 < 2) {
			return;
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static28.aBoolean38 = true;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static28.aBoolean38 = false;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static227.aClass109_6.method2946();
			}
			@Pc(47) int local47;
			@Pc(56) Runtime local56;
			@Pc(66) int local66;
			if (arg0.equalsIgnoreCase("gc")) {
				Static147.method2877();
				for (local47 = 0; local47 < 10; local47++) {
					System.gc();
				}
				local56 = Runtime.getRuntime();
				local66 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
				Static297.method5064("mem=" + local66 + "k");
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static147.method2877();
				for (local47 = 0; local47 < 10; local47++) {
					System.gc();
				}
				local56 = Runtime.getRuntime();
				local66 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
				Static297.method5064("Memory before cleanup=" + local66 + "k");
				Static162.method3238();
				Static147.method2877();
				for (@Pc(121) int local121 = 0; local121 < 10; local121++) {
					System.gc();
				}
				local66 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
				Static297.method5064("Memory after cleanup=" + local66 + "k");
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static297.method5064("Number of player models in cache:" + Static103.method2100());
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static21.method304();
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static124.aClass113_1.method3138();
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static124.aClass113_1.method3136();
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static308.aClass206_5.method5532();
				Static216.aClass11_5.method162();
				Static124.aClass113_1.method3131();
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static148.method2897();
				Static184.method3475();
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static54.method944(false, -1, 1, -1);
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static54.method944(false, -1, 2, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static54.method944(false, 1024, 3, 768);
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static334.method5541(0);
				Static213.anInt3920 = 0;
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static334.method5541(1);
				Static213.anInt3920 = 1;
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static334.method5541(2);
				Static213.anInt3920 = 2;
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static334.method5541(3);
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static119.aBoolean190 = !Static119.aBoolean190;
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
				Static148.method2897();
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static354.aBoolean428 = !Static354.aBoolean428;
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
				Static148.method2897();
			}
			if (arg0.startsWith("shadows ")) {
				Static282.anInt5340 = Static344.method5646(arg0.substring(8));
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
				Static148.method2897();
			}
			if (arg0.startsWith("setba")) {
				Static163.anInt3087 = Static344.method5646(arg0.substring(6));
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
			}
			if (arg0.startsWith("setparticles")) {
				Static239.method5787(Static344.method5646(arg0.substring(13)));
				Static71.method1264(Static308.aClass206_5);
				Static263.aBoolean339 = false;
			}
			if (arg0.startsWith("fps ") && Static189.anInt3601 != 0) {
				Static350.method5747(Static344.method5646(arg0.substring(4)));
			}
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("rect_debug")) {
				Static239.anInt6343 = Static344.method5646(arg0.substring(10).trim());
				Static297.method5064("rect_debug=" + Static239.anInt6343);
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static249.aBoolean326 = true;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static30.aBoolean42 = !Static30.aBoolean42;
				Static297.method5064("clipcomponents=" + Static30.aBoolean42);
			}
			if (arg0.startsWith("bloom")) {
				@Pc(449) boolean local449 = Static289.aClass81_7.method3024();
				if (!Static50.method846(!local449)) {
					Static297.method5064("Failed to enable bloom");
				} else if (local449) {
					Static297.method5064("Bloom disabled");
				} else {
					Static297.method5064("Bloom enabled");
				}
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static139.aBoolean207) {
					Static139.aBoolean207 = false;
					Static297.method5064("Forced tweening disabled.");
				} else {
					Static139.aBoolean207 = true;
					Static297.method5064("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static176.aBoolean237) {
					Static297.method5064("Shift-click disabled.");
					Static176.aBoolean237 = false;
				} else {
					Static297.method5064("Shift-click ENABLED!");
					Static176.aBoolean237 = true;
				}
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static297.method5064("x:" + (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7) + " z:" + (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7));
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static297.method5064("Height: " + Static203.aClass106Array3[Static343.anInt6225].method5720(Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7, Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7));
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static269.aClass53_124.method1017();
				Static269.aClass53_124.method1021();
				Static152.method3079();
				Static184.method3475();
			}
			if (arg0.startsWith("mc")) {
				if (Static289.aClass81_7.method2964()) {
					local47 = Integer.parseInt(arg0.substring(3));
					if (local47 < 1) {
						local47 = 1;
					} else if (local47 > 4) {
						local47 = 4;
					}
					Static220.anInt4057 = local47;
					Static289.aClass81_7.method3013(Static220.anInt4057);
					Static289.aClass81_7.method3039(0);
					Static297.method5064("Render cores now: " + Static220.anInt4057);
				} else {
					Static297.method5064("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg0.startsWith("cachespace")) {
				Static297.method5064("I(s): " + Static60.aClass70_26.method1408() + "/" + Static60.aClass70_26.method1398());
				Static297.method5064("I(m): " + Static174.aClass70_58.method1408() + "/" + Static174.aClass70_58.method1398());
				Static297.method5064("O(s): " + Static270.aClass137_1.method3626() + "/" + Static270.aClass137_1.method3633());
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static297.method5064("Pos: " + Static343.anInt6225 + "," + ((Static287.anInt5405 >> 7) + Static44.anInt881 >> 6) + "," + ((Static11.anInt197 >> 7) + Static300.anInt5672 >> 6) + "," + (Static44.anInt881 + (Static287.anInt5405 >> 7) & 0x3F) + "," + ((Static11.anInt197 >> 7) + Static300.anInt5672 & 0x3F) + " Height: " + (Static306.method5249(Static11.anInt197, Static287.anInt5405, Static343.anInt6225) - Static217.anInt4016));
				Static297.method5064("Look: " + Static343.anInt6225 + "," + (Static44.anInt881 + Static148.anInt2742 >> 6) + "," + (Static13.anInt229 + Static300.anInt5672 >> 6) + "," + (Static44.anInt881 + Static148.anInt2742 & 0x3F) + "," + (Static300.anInt5672 + Static13.anInt229 & 0x3F) + " Height: " + (Static306.method5249(Static13.anInt229, Static148.anInt2742, Static343.anInt6225) - Static273.anInt6141));
			}
			if (arg0.equals("showocc")) {
				Static169.aBoolean231 = !Static169.aBoolean231;
				Static148.method2897();
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static87.aBoolean118 = !Static87.aBoolean118;
				Static289.aClass81_7.method3012(Static87.aBoolean118);
				Static279.method4825();
			}
			if (arg0.equals("nonpcs")) {
				Static72.aBoolean91 = !Static72.aBoolean91;
			}
			if (arg0.equals("autoworld")) {
				Static343.method5641();
			}
			if (arg0.equals("heap")) {
				Static297.method5064("Heap: " + Static183.anInt3439 + "MB");
			}
			if (arg0.equals("savevarcs")) {
				Static95.method1718();
			}
			if (arg0.equals("scramblevarcs")) {
				for (local47 = 0; local47 < Static295.anIntArray624.length; local47++) {
					if (Static6.aBooleanArray1[local47]) {
						Static295.anIntArray624[local47] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static295.anIntArray624[local47] *= -1;
						}
					}
				}
				Static95.method1718();
			}
			if (arg0.equals("showcolmap")) {
				Static49.aBoolean76 = true;
				Static184.method3475();
			}
			if (arg0.equals("hidecolmap")) {
				Static49.aBoolean76 = false;
				Static184.method3475();
			}
			if (arg0.equals("resetcache")) {
				Static83.method1391();
			}
			if (arg0.equals("profilecpu")) {
				Static297.method5064(Static61.method996() + "ms");
			}
			if (Static129.anInt2374 == 30) {
				Static131.aClass6_Sub10_Sub1_2.method2886(8);
				Static131.aClass6_Sub10_Sub1_2.method3968(arg0.length() + 2);
				Static131.aClass6_Sub10_Sub1_2.method3968(arg1 ? 1 : 0);
				Static131.aClass6_Sub10_Sub1_2.method3966(arg0);
				return;
			}
		} catch (@Pc(982) Exception local982) {
			Static297.method5064("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)I")
	public static int method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static291.anIntArrayArray183 == null ? 0 : Static291.anIntArrayArray183[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!dp;Lclient!dp;Lclient!dp;Lclient!dp;)V")
	public static void method5424(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class53 arg2, @OriginalArg(4) Class53 arg3) {
		Static99.aClass53_153 = arg0;
		Static67.aClass53_35 = arg1;
		Static73.aClass53_37 = arg3;
		Static314.aClass53_71 = arg2;
		Static81.aClass132ArrayArray1 = new Class132[Static99.aClass53_153.method1003()][];
		Static69.aBooleanArray6 = new boolean[Static99.aClass53_153.method1003()];
	}
}
