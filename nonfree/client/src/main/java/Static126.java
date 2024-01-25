import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "[Lclient!td;")
	public static Class4_Sub12_Sub1[] aClass4_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
	public static int anInt2829;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Z")
	public static boolean aBoolean236 = false;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!ic", name = "jb", descriptor = "[I")
	public static final int[] anIntArray261 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!lh;IILjava/awt/Component;I)Lclient!ck;")
	public static Class39 method2523(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static57.anInt1232 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class39 local34 = (Class39) Class.forName("Class39_Sub2").getDeclaredConstructor().newInstance();
			local34.anInt5677 = arg3;
			local34.anIntArray460 = new int[(Static288.aBoolean515 ? 2 : 1) * 256];
			local34.method4803(arg2);
			local34.anInt5676 = (arg3 & 0xFFFFFC00) + 1024;
			if (local34.anInt5676 > 16384) {
				local34.anInt5676 = 16384;
			}
			local34.method4794(local34.anInt5676);
			if (Static325.anInt6399 > 0 && Static288.aClass90_1 == null) {
				Static288.aClass90_1 = new Class90();
				Static288.aClass90_1.aClass120_2 = arg0;
				arg0.method3232(Static288.aClass90_1, Static325.anInt6399);
			}
			if (Static288.aClass90_1 != null) {
				if (Static288.aClass90_1.aClass39Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static288.aClass90_1.aClass39Array1[arg1] = local34;
			}
			return local34;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class39_Sub1 local112 = new Class39_Sub1(arg0, arg1);
				local112.anIntArray460 = new int[(Static288.aBoolean515 ? 2 : 1) * 256];
				local112.anInt5677 = arg3;
				local112.method4803(arg2);
				local112.anInt5676 = 16384;
				local112.method4794(local112.anInt5676);
				if (Static325.anInt6399 > 0 && Static288.aClass90_1 == null) {
					Static288.aClass90_1 = new Class90();
					Static288.aClass90_1.aClass120_2 = arg0;
					arg0.method3232(Static288.aClass90_1, Static325.anInt6399);
				}
				if (Static288.aClass90_1 != null) {
					if (Static288.aClass90_1.aClass39Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static288.aClass90_1.aClass39Array1[arg1] = local112;
				}
				return local112;
			} catch (@Pc(176) Throwable local176) {
				return new Class39();
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method2524() {
		@Pc(1) Class154 local1 = Static133.aClass154_44;
		synchronized (Static133.aClass154_44) {
			Static133.aClass154_44.method4212();
		}
		local1 = Static199.aClass154_102;
		synchronized (Static199.aClass154_102) {
			Static199.aClass154_102.method4212();
		}
		local1 = Static310.aClass154_95;
		synchronized (Static310.aClass154_95) {
			Static310.aClass154_95.method4212();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method2525(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static306.anInt6192 == 0 && Static98.anInt6644 < 2) {
			return;
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static258.aBoolean450 = true;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static258.aBoolean450 = false;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static71.aClass204_2.method5362();
			}
			@Pc(42) int local42;
			@Pc(53) Runtime local53;
			@Pc(62) int local62;
			if (arg0.equalsIgnoreCase("gc")) {
				Static270.method5482();
				for (local42 = 0; local42 < 10; local42++) {
					System.gc();
				}
				local53 = Runtime.getRuntime();
				local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static107.method5698("mem=" + local62 + "k");
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static270.method5482();
				for (local42 = 0; local42 < 10; local42++) {
					System.gc();
				}
				local53 = Runtime.getRuntime();
				local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static107.method5698("Memory before cleanup=" + local62 + "k");
				Static309.method5197();
				Static270.method5482();
				for (@Pc(118) int local118 = 0; local118 < 10; local118++) {
					System.gc();
				}
				local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
				Static107.method5698("Memory after cleanup=" + local62 + "k");
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static107.method5698("Number of player models in cache:" + Static240.method4160());
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static181.method3368();
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static331.aClass93_2.method2429();
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static331.aClass93_2.method2428();
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static212.aClass120_3.method3217();
				Static131.aClass171_3.method4629();
				Static331.aClass93_2.method2434();
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static107.method5712();
				Static170.method3202();
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static39.method732(false, -1, -1, 1);
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static39.method732(false, -1, -1, 2);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static39.method732(false, 768, 1024, 3);
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static306.method5196(0);
				Static273.anInt5611 = 0;
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static306.method5196(1);
				Static273.anInt5611 = 1;
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static306.method5196(2);
				Static273.anInt5611 = 2;
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static306.method5196(3);
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static318.aBoolean552 = !Static318.aBoolean552;
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
				Static107.method5712();
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static68.aBoolean122 = !Static68.aBoolean122;
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
				Static107.method5712();
			}
			if (arg0.startsWith("shadows ")) {
				Static192.anInt4154 = Static120.method2435(arg0.substring(8));
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
				Static107.method5712();
			}
			if (arg0.startsWith("setba")) {
				Static152.anInt3390 = Static120.method2435(arg0.substring(6));
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
			}
			if (arg0.startsWith("setparticles")) {
				Static239.method5168(Static120.method2435(arg0.substring(13)));
				Static290.method4960(Static212.aClass120_3);
				Static243.aBoolean429 = false;
			}
			if (arg0.startsWith("fps ") && Static306.anInt6192 != 0) {
				Static271.method4738(Static120.method2435(arg0.substring(4)));
			}
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("rect_debug")) {
				Static264.anInt3389 = Static120.method2435(arg0.substring(10).trim());
				Static107.method5698("rect_debug=" + Static264.anInt3389);
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static93.aBoolean179 = true;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				aBoolean236 = !aBoolean236;
				Static107.method5698("clipcomponents=" + aBoolean236);
			}
			if (arg0.startsWith("bloom")) {
				@Pc(453) boolean local453 = Static164.aClass92_7.method4461();
				if (!Static311.method5227(!local453)) {
					Static107.method5698("Failed to enable bloom");
				} else if (local453) {
					Static107.method5698("Bloom disabled");
				} else {
					Static107.method5698("Bloom enabled");
				}
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static199.aBoolean564) {
					Static199.aBoolean564 = false;
					Static107.method5698("Forced tweening disabled.");
				} else {
					Static199.aBoolean564 = true;
					Static107.method5698("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static106.aBoolean205) {
					Static107.method5698("Shift-click disabled.");
					Static106.aBoolean205 = false;
				} else {
					Static107.method5698("Shift-click ENABLED!");
					Static106.aBoolean205 = true;
				}
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static107.method5698("x:" + (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7) + " z:" + (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7));
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static107.method5698("Height: " + Static307.aClass26Array3[Static279.anInt5645].method4996(Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7, Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7));
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static292.aClass11_130.method302();
				Static292.aClass11_130.method285();
				Static313.method5253();
				Static170.method3202();
			}
			if (arg0.startsWith("mc")) {
				if (Static164.aClass92_7.method4485()) {
					local42 = Integer.parseInt(arg0.substring(3));
					if (local42 < 1) {
						local42 = 1;
					} else if (local42 > 4) {
						local42 = 4;
					}
					Static117.anInt2483 = local42;
					Static164.aClass92_7.method4510(Static117.anInt2483);
					Static164.aClass92_7.method4514(0);
					Static107.method5698("Render cores now: " + Static117.anInt2483);
				} else {
					Static107.method5698("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg0.startsWith("cachespace")) {
				Static107.method5698("I(s): " + Static37.aClass154_11.method4217() + "/" + Static37.aClass154_11.method4223());
				Static107.method5698("I(m): " + Static77.aClass154_24.method4217() + "/" + Static77.aClass154_24.method4223());
				Static107.method5698("O(s): " + Static234.aClass85_1.method2018() + "/" + Static234.aClass85_1.method2009());
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static107.method5698("Pos: " + Static279.anInt5645 + "," + (Static10.anInt231 + (Static230.anInt4796 >> 7) >> 6) + "," + (Static81.anInt1732 + (Static133.anInt3056 >> 7) >> 6) + "," + (Static10.anInt231 + (Static230.anInt4796 >> 7) & 0x3F) + "," + (Static81.anInt1732 + (Static133.anInt3056 >> 7) & 0x3F) + " Height: " + (Static119.method2125(Static230.anInt4796, Static133.anInt3056, Static279.anInt5645) - Static105.anInt6098));
				Static107.method5698("Look: " + Static279.anInt5645 + "," + (Static10.anInt231 + Static9.anInt6459 >> 6) + "," + (Static81.anInt1732 + Static80.anInt1721 >> 6) + "," + (Static9.anInt6459 + Static10.anInt231 & 0x3F) + "," + (Static80.anInt1721 + Static81.anInt1732 & 0x3F) + " Height: " + (Static119.method2125(Static9.anInt6459, Static80.anInt1721, Static279.anInt5645) - Static155.anInt3462));
			}
			if (arg0.equals("showocc")) {
				Static291.aBoolean520 = !Static291.aBoolean520;
				Static107.method5712();
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static339.aBoolean581 = !Static339.aBoolean581;
				Static164.aClass92_7.method4527(Static339.aBoolean581);
				Static37.method716();
			}
			if (arg0.equals("nonpcs")) {
				Static144.aBoolean272 = !Static144.aBoolean272;
			}
			if (arg0.equals("autoworld")) {
				Static54.method1000();
			}
			if (arg0.equals("heap")) {
				Static107.method5698("Heap: " + Static161.anInt3644 + "MB");
			}
			if (arg0.equals("savevarcs")) {
				Static188.method3431();
			}
			if (arg0.equals("scramblevarcs")) {
				for (local42 = 0; local42 < Static289.anIntArray486.length; local42++) {
					if (Static72.aBooleanArray12[local42]) {
						Static289.anIntArray486[local42] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static289.anIntArray486[local42] *= -1;
						}
					}
				}
				Static188.method3431();
			}
			if (arg0.equals("showcolmap")) {
				Static191.aBoolean340 = true;
				Static170.method3202();
			}
			if (arg0.equals("hidecolmap")) {
				Static191.aBoolean340 = false;
				Static170.method3202();
			}
			if (arg0.equals("resetcache")) {
				Static207.method3647();
			}
			if (arg0.equals("profilecpu")) {
				Static107.method5698(Static27.method478() + "ms");
			}
			if (Static139.anInt3135 == 30) {
				Static320.aClass4_Sub7_Sub1_3.method1237(193);
				Static320.aClass4_Sub7_Sub1_3.method2416(arg0.length() + 2);
				Static320.aClass4_Sub7_Sub1_3.method2416(arg1 ? 1 : 0);
				Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
				return;
			}
		} catch (@Pc(982) Exception local982) {
			Static107.method5698("Whoops, something went wrong.");
			return;
		}
	}
}
