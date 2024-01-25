import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	public static int anInt6189 = 0;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "[I")
	public static final int[] anIntArray621 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt6191 = 0;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "[I")
	public static final int[] anIntArray622 = new int[200];

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!dr;B)V")
	public static void method5341(@OriginalArg(0) Class1_Sub12 arg0) {
		if (!Static308.aBoolean499) {
			arg0.method5796();
			Static61.anInt1413--;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method5342(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static32.method509(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIILclient!ii;IIIIII[[[B)V")
	public static void method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class105 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg8 == 0 || arg1 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg8 = 1;
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg8 = 8;
			arg0 = arg0 + 3 & 0x3;
		}
		arg5.method4302(arg3, arg4, arg10, arg9, arg7, arg2, arg11[arg8 - 1][arg0], arg1, arg6);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IZI)V")
	public static void method5344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class172 local13 = Static89.aClass172ArrayArray1[arg0][arg1];
		if (local13 != null) {
			Static169.anInt3544 = local13.anInt5231;
			Static326.anInt5671 = local13.anInt5221;
			Static59.anInt1394 = local13.anInt5219;
		}
		Static54.method1096();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method5345(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static217.anInt951 == 0 && Static305.anInt6104 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static248.aBoolean4 = true;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static248.aBoolean4 = false;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static208.anInt4355 = 0;
				Static229.anInt4788 = 0;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static172.aClass122_6.method2619();
			}
			@Pc(55) int local55;
			@Pc(64) Runtime local64;
			@Pc(73) int local73;
			if (arg0.equalsIgnoreCase("gc")) {
				Static29.method492();
				for (local55 = 0; local55 < 10; local55++) {
					System.gc();
				}
				local64 = Runtime.getRuntime();
				local73 = (int) ((local64.totalMemory() - local64.freeMemory()) / 1024L);
				Static34.method594("mem=" + local73 + "k");
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static29.method492();
				for (local55 = 0; local55 < 10; local55++) {
					System.gc();
				}
				local64 = Runtime.getRuntime();
				local73 = (int) ((local64.totalMemory() - local64.freeMemory()) / 1024L);
				Static34.method594("Memory before cleanup=" + local73 + "k");
				Static344.method5768();
				Static29.method492();
				for (@Pc(128) int local128 = 0; local128 < 10; local128++) {
					System.gc();
				}
				local73 = (int) ((local64.totalMemory() - local64.freeMemory()) / 1024L);
				Static34.method594("Memory after cleanup=" + local73 + "k");
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static34.method594("Number of player models in cache:" + Static94.method1477());
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static287.method5029();
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static114.aClass154_1.method4103();
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static114.aClass154_1.method4109();
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static197.aClass215_5.method5659();
				Static81.aClass202_3.method5479();
				Static114.aClass154_1.method4095();
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static4.method33();
				Static329.method5542();
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static146.method4165(1, false, -1, -1);
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static146.method4165(2, false, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static146.method4165(3, false, 1024, 768);
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static20.method360(0);
				Static248.anInt26 = 0;
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static20.method360(1);
				Static248.anInt26 = 1;
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static20.method360(2);
				Static248.anInt26 = 2;
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static20.method360(3);
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static329.aBoolean533 = !Static329.aBoolean533;
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
				Static4.method33();
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static5.aBoolean9 = !Static5.aBoolean9;
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
				Static4.method33();
			}
			if (arg0.startsWith("shadows ")) {
				Static256.anInt5260 = Static38.method2707(arg0.substring(8));
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
				Static4.method33();
			}
			if (arg0.startsWith("setba")) {
				Static313.anInt6232 = Static38.method2707(arg0.substring(6));
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
			}
			if (arg0.startsWith("setparticles")) {
				Static223.method1252(Static38.method2707(arg0.substring(13)));
				Static100.method1593(Static197.aClass215_5);
				Static275.aBoolean465 = false;
			}
			if (arg0.startsWith("fps ") && Static217.anInt951 != 0) {
				Static238.method4330(Static38.method2707(arg0.substring(4)));
			}
			if (arg0.startsWith("rect_debug")) {
				Static235.anInt6130 = Static38.method2707(arg0.substring(10).trim());
				Static34.method594("rect_debug=" + Static235.anInt6130);
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static173.aBoolean279 = true;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static207.aBoolean341 = !Static207.aBoolean341;
				Static34.method594("clipcomponents=" + Static207.aBoolean341);
			}
			if (arg0.startsWith("bloom")) {
				@Pc(448) boolean local448 = Static217.aClass105_5.method4296();
				if (!Static341.method5646(!local448)) {
					Static34.method594("Failed to enable bloom");
				} else if (local448) {
					Static34.method594("Bloom disabled");
				} else {
					Static34.method594("Bloom enabled");
				}
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static221.aBoolean374) {
					Static221.aBoolean374 = false;
					Static34.method594("Forced tweening disabled.");
				} else {
					Static221.aBoolean374 = true;
					Static34.method594("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static290.aBoolean485) {
					Static34.method594("Shift-click disabled.");
					Static290.aBoolean485 = false;
				} else {
					Static34.method594("Shift-click ENABLED!");
					Static290.aBoolean485 = true;
				}
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static34.method594("x:" + (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7) + " z:" + (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7));
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static34.method594("Height: " + Static263.aClass12Array2[Static127.anInt2487].method2704(Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7));
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static125.aClass134_55.method3013();
				Static125.aClass134_55.method3022();
				Static237.method4323();
				Static329.method5542();
			}
			if (arg0.startsWith("mc")) {
				if (Static217.aClass105_5.method4219()) {
					local55 = Integer.parseInt(arg0.substring(3));
					if (local55 < 1) {
						local55 = 1;
					} else if (local55 > 4) {
						local55 = 4;
					}
					Static220.anInt4683 = local55;
					Static217.aClass105_5.method4211(Static220.anInt4683);
					Static217.aClass105_5.method4205(0);
					Static34.method594("Render cores now: " + Static220.anInt4683);
				} else {
					Static34.method594("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg0.startsWith("cachespace")) {
				Static34.method594("I(s): " + Static329.aClass37_105.method913() + "/" + Static329.aClass37_105.method917());
				Static34.method594("I(m): " + Static57.aClass37_27.method913() + "/" + Static57.aClass37_27.method917());
				Static34.method594("O(s): " + Static61.aClass75_1.method1460() + "/" + Static61.aClass75_1.method1463());
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static34.method594("Pos: " + Static127.anInt2487 + "," + (Static92.anInt1755 + (Static4.anInt41 >> 7) >> 6) + "," + (Static98.anInt1911 + (Static177.anInt3734 >> 7) >> 6) + "," + (Static92.anInt1755 + (Static4.anInt41 >> 7) & 0x3F) + "," + (Static98.anInt1911 + (Static177.anInt3734 >> 7) & 0x3F) + " Height: " + (Static352.method5834(Static177.anInt3734, Static4.anInt41, Static127.anInt2487) - Static117.anInt2244));
				Static34.method594("Look: " + Static127.anInt2487 + "," + (Static63.anInt2655 + Static92.anInt1755 >> 6) + "," + (Static266.anInt5482 + Static98.anInt1911 >> 6) + "," + (Static92.anInt1755 + Static63.anInt2655 & 0x3F) + "," + (Static98.anInt1911 + Static266.anInt5482 & 0x3F) + " Height: " + (Static352.method5834(Static266.anInt5482, Static63.anInt2655, Static127.anInt2487) - Static174.anInt5776));
			}
			if (arg0.equals("showocc")) {
				Static18.aBoolean29 = !Static18.aBoolean29;
				Static4.method33();
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static313.aBoolean515 = !Static313.aBoolean515;
				Static217.aClass105_5.method4208(Static313.aBoolean515);
				Static193.method3428();
			}
			if (arg0.equals("nonpcs")) {
				Static245.aBoolean67 = !Static245.aBoolean67;
			}
			if (arg0.equals("autoworld")) {
				Static114.method1831();
			}
			if (arg0.equals("heap")) {
				Static34.method594("Heap: " + Static267.anInt5492 + "MB");
			}
			if (arg0.equals("savevarcs")) {
				Static250.method4491();
			}
			if (arg0.equals("scramblevarcs")) {
				for (local55 = 0; local55 < Static35.anIntArray51.length; local55++) {
					if (Static254.aBooleanArray21[local55]) {
						Static35.anIntArray51[local55] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static35.anIntArray51[local55] *= -1;
						}
					}
				}
				Static250.method4491();
			}
			if (arg0.equals("showcolmap")) {
				Static244.aBoolean512 = true;
				Static329.method5542();
			}
			if (arg0.equals("hidecolmap")) {
				Static244.aBoolean512 = false;
				Static329.method5542();
			}
			if (arg0.equals("resetcache")) {
				Static14.method208();
			}
			if (arg0.equals("profilecpu")) {
				Static34.method594(Static309.method5323() + "ms");
			}
			if (Static261.anInt5376 == 30) {
				Static305.aClass1_Sub21_Sub2_3.method5757(136);
				Static305.aClass1_Sub21_Sub2_3.method5718(arg0.length() + 2);
				Static305.aClass1_Sub21_Sub2_3.method5718(arg1 ? 1 : 0);
				Static305.aClass1_Sub21_Sub2_3.method5752(arg0);
			}
		} catch (@Pc(970) Exception local970) {
			Static34.method594("Whoops, something went wrong.");
		}
	}
}
