import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
	public static int anInt5328;

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "Lclient!mo;")
	public static Class143 aClass143_98;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray64 = new String[8];

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "[S")
	public static short[] aShortArray105 = new short[256];

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "Lclient!al;")
	public static Class11 aClass11_123 = new Class11(64);

	@OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
	public static int anInt5338 = 1;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method4748() {
		if (Static302.anInt5842 == 10 || Static302.anInt5842 == 28) {
			Static218.method3939(Static124.anInt2717 >> 10, Static141.anInt2986 >> 10);
		} else {
			Static218.method3939(Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] >> 3, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] >> 3);
		}
		Static104.method2275();
		Static215.method3860();
		Static234.method4100();
		Static153.method3020();
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V")
	public static void method4749() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static189.aBooleanArray24[local3] = false;
		}
		Static17.anInt351 = 0;
		Static205.anInt4115 = 1;
		Static290.anInt5596 = -1;
		Static334.anInt6460 = -1;
		Static18.anInt378 = 0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4751(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static302.anInt5838 >= 100 && !Static301.aBoolean408 || Static302.anInt5838 >= 200) {
			Static276.method4684(Static349.aString249);
			return;
		}
		@Pc(28) String local28 = Static280.method5743(arg0);
		if (local28 == null) {
			return;
		}
		@Pc(68) String local68;
		for (@Pc(33) int local33 = 0; local33 < Static302.anInt5838; local33++) {
			@Pc(41) String local41 = Static280.method5743(Static120.aStringArray36[local33]);
			if (local41 != null && local41.equals(local28)) {
				Static276.method4684(arg0 + Static322.aString229);
				return;
			}
			if (Static339.aStringArray34[local33] != null) {
				local68 = Static280.method5743(Static339.aStringArray34[local33]);
				if (local68 != null && local68.equals(local28)) {
					Static276.method4684(arg0 + Static322.aString229);
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static217.anInt4354; local95++) {
			local68 = Static280.method5743(Static38.aStringArray20[local95]);
			if (local68 != null && local68.equals(local28)) {
				Static276.method4684(Static235.aString173 + arg0 + Static260.aString187);
				return;
			}
			if (Static143.aStringArray40[local95] != null) {
				@Pc(132) String local132 = Static280.method5743(Static143.aStringArray40[local95]);
				if (local132 != null && local132.equals(local28)) {
					Static276.method4684(Static235.aString173 + arg0 + Static260.aString187);
					return;
				}
			}
		}
		if (Static280.method5743(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224).equals(local28)) {
			Static276.method4684(Static296.aString210);
		} else {
			Static164.aClass14_Sub4_Sub2_3.method2557(198);
			Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(arg0));
			Static164.aClass14_Sub4_Sub2_3.method2527(arg0);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg3 < 0 || Static195.anInt3965 - 1 <= arg0 || arg3 >= Static298.anInt5716 - 1) {
			return;
		}
		if (Static98.aClass213ArrayArrayArray2 == null) {
			return;
		}
		@Pc(42) Interface7 local42;
		if (arg5 != 0) {
			if (arg5 == 1) {
				local42 = (Interface7) Static216.method3896(arg1, arg0, arg3);
				if (local42 != null) {
					if (local42 instanceof Class10_Sub4_Sub2) {
						((Class10_Sub4_Sub2) local42).aClass150_3.method3816(arg4);
						return;
					}
					@Pc(58) int local58 = local42.method4070();
					if (arg2 != 4 && arg2 != 5) {
						if (arg2 == 6) {
							Static99.method2224(arg5, arg3, 4, arg4, local58, arg0, arg1, arg6 + 4);
						} else if (arg2 == 7) {
							Static99.method2224(arg5, arg3, 4, arg4, local58, arg0, arg1, (arg6 + 2 & 0x3) + 4);
							return;
						} else if (arg2 == 8) {
							Static99.method2224(arg5, arg3, 4, arg4, local58, arg0, arg1, arg6 + 4);
							Static99.method2224(arg5, arg3, 4, arg4, local58, arg0, arg1, (arg6 + 2 & 0x3) + 4);
							return;
						}
						return;
					}
					Static99.method2224(arg5, arg3, 4, arg4, local58, arg0, arg1, arg6);
					return;
				}
				return;
			}
			if (arg5 == 2) {
				local42 = (Interface7) Static263.method4514(arg1, arg0, arg3, up.class);
				if (local42 != null) {
					if (arg2 == 11) {
						arg2 = 10;
					}
					if (!(local42 instanceof Class10_Sub3_Sub2)) {
						Static99.method2224(arg5, arg3, arg2, arg4, local42.method4070(), arg0, arg1, arg6);
						return;
					}
					((Class10_Sub3_Sub2) local42).aClass150_2.method3816(arg4);
					return;
				}
				return;
			}
			if (arg5 == 3) {
				local42 = (Interface7) Static274.method4660(arg1, arg0, arg3);
				if (local42 != null) {
					if (local42 instanceof Class10_Sub5_Sub2) {
						((Class10_Sub5_Sub2) local42).aClass150_4.method3816(arg4);
						return;
					}
					Static99.method2224(arg5, arg3, arg2, arg4, local42.method4070(), arg0, arg1, arg6);
					return;
				}
			}
			return;
		}
		local42 = (Interface7) Static242.method4277(arg1, arg0, arg3);
		@Pc(248) Interface7 local248 = (Interface7) Static313.method5403(arg1, arg0, arg3);
		if (local42 != null && arg2 != 2) {
			if (local42 instanceof Class10_Sub2_Sub1) {
				((Class10_Sub2_Sub1) local42).aClass150_1.method3816(arg4);
			} else {
				Static99.method2224(arg5, arg3, arg2, arg4, local42.method4070(), arg0, arg1, arg6);
			}
		}
		if (local248 == null) {
			return;
		}
		if (local248 instanceof Class10_Sub2_Sub1) {
			((Class10_Sub2_Sub1) local248).aClass150_1.method3816(arg4);
			return;
		}
		Static99.method2224(arg5, arg3, arg2, arg4, local248.method4070(), arg0, arg1, arg6);
		return;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!sd;II)V")
	public static void method4754(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub3_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt5961 && arg0 != -1) {
			@Pc(73) Class79 local73 = Static233.method4080(arg0);
			@Pc(76) int local76 = local73.anInt2361;
			if (local76 == 1) {
				arg1.anInt5975 = 1;
				arg1.anInt5933 = 0;
				arg1.anInt5968 = 0;
				arg1.anInt5963 = arg2;
				arg1.anInt5945 = 0;
				Static273.method4631(arg1.anInt5908, arg1.anInt5933, arg1.anInt5910, false, local73);
			}
			if (local76 == 2) {
				arg1.anInt5945 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt5961 == -1 || Static233.method4080(arg0).anInt2357 >= Static233.method4080(arg1.anInt5961).anInt2357) {
			arg1.anInt5968 = 0;
			arg1.anInt5975 = 1;
			arg1.anInt5963 = arg2;
			arg1.anInt5933 = 0;
			arg1.anInt5945 = 0;
			arg1.anInt5961 = arg0;
			arg1.anInt5988 = arg1.anInt5986;
			if (arg1.anInt5961 != -1) {
				Static273.method4631(arg1.anInt5908, arg1.anInt5933, arg1.anInt5910, false, Static233.method4080(arg1.anInt5961));
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V")
	public static void method4756(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static113.aByteArrayArray6;
		} else {
			local9 = Static196.aByteArrayArray14;
		}
		@Pc(16) int local16 = Static334.aByteArrayArray26.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = local9[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static8.anIntArray9[local18] >> 8) * 64 - Static151.anInt3234;
				@Pc(48) int local48 = (Static8.anIntArray9[local18] & 0xFF) * 64 - Static251.anInt3170;
				Static151.method3006();
				Static286.method4895(Static218.aClass46_5, arg0, local37, local48, local24, Static75.aClass65Array1);
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method4759(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static322.anInt6208 == 0 && Static40.anInt979 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static66.aBoolean104 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static66.aBoolean104 = false;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static354.anInt6718 = 0;
				Static274.anInt5227 = 0;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static242.aClass126_5.method3398();
			}
			@Pc(63) int local63;
			@Pc(72) Runtime local72;
			@Pc(82) int local82;
			if (arg1.equalsIgnoreCase("gc")) {
				Static257.method4005();
				for (local63 = 0; local63 < 10; local63++) {
					System.gc();
				}
				local72 = Runtime.getRuntime();
				local82 = (int) ((local72.totalMemory() - local72.freeMemory()) / 1024L);
				Static85.method2094("mem=" + local82 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static257.method4005();
				for (local63 = 0; local63 < 10; local63++) {
					System.gc();
				}
				local72 = Runtime.getRuntime();
				local82 = (int) ((local72.totalMemory() - local72.freeMemory()) / 1024L);
				Static85.method2094("Memory before cleanup=" + local82 + "k");
				Static263.method4515();
				Static257.method4005();
				for (@Pc(139) int local139 = 0; local139 < 10; local139++) {
					System.gc();
				}
				local82 = (int) ((local72.totalMemory() - local72.freeMemory()) / 1024L);
				Static85.method2094("Memory after cleanup=" + local82 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static85.method2094("Number of player models in cache:" + Static234.method4105());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static48.method1176();
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static155.aClass35_2.method1140();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static155.aClass35_2.method1151();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static105.aClass15_2.method289();
				Static138.aClass159_3.method4077();
				Static155.aClass35_2.method1141();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static51.method1236();
				Static255.method4392();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static288.method4959(false, -1, 1, -1);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static288.method4959(false, -1, 2, -1);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static288.method4959(false, 768, 3, 1024);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static253.method1025(0);
				Static203.anInt6246 = 0;
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static253.method1025(1);
				Static203.anInt6246 = 1;
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static253.method1025(2);
				Static203.anInt6246 = 2;
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static253.method1025(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static27.aBoolean30 = !Static27.aBoolean30;
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
				Static51.method1236();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static267.aBoolean340 = !Static267.aBoolean340;
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
				Static51.method1236();
			}
			if (arg1.startsWith("shadows ")) {
				Static109.anInt2428 = Static75.method1895(arg1.substring(8));
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
				Static51.method1236();
			}
			if (arg1.startsWith("setba")) {
				Static228.anInt4497 = Static75.method1895(arg1.substring(6));
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static252.method4374(Static75.method1895(arg1.substring(13)));
				Static324.method5568(Static105.aClass15_2);
				Static251.aBoolean207 = false;
			}
			if (arg1.startsWith("fps ") && Static322.anInt6208 != 0) {
				Static155.method3053(Static75.method1895(arg1.substring(4)));
			}
			if (arg1.startsWith("rect_debug")) {
				Static9.anInt209 = Static75.method1895(arg1.substring(10).trim());
				Static85.method2094("rect_debug=" + Static9.anInt209);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static195.aBoolean248 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static205.aBoolean255 = !Static205.aBoolean255;
				Static85.method2094("clipcomponents=" + Static205.aBoolean255);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(463) boolean local463 = Static218.aClass46_5.method5151();
				if (!Static131.method1800(!local463)) {
					Static85.method2094("Failed to enable bloom");
				} else if (local463) {
					Static85.method2094("Bloom disabled");
				} else {
					Static85.method2094("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static308.aBoolean300) {
					Static308.aBoolean300 = false;
					Static85.method2094("Forced tweening disabled.");
				} else {
					Static308.aBoolean300 = true;
					Static85.method2094("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static153.aBoolean211) {
					Static85.method2094("Shift-click disabled.");
					Static153.aBoolean211 = false;
				} else {
					Static85.method2094("Shift-click ENABLED!");
					Static153.aBoolean211 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static85.method2094("x:" + (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7) + " z:" + (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static85.method2094("Height: " + Static158.aClass114Array2[Static219.anInt4400].method3610(Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				aClass143_98.method3753();
				aClass143_98.method3748();
				Static338.method5821();
				Static255.method4392();
			}
			if (arg1.startsWith("mc")) {
				if (Static218.aClass46_5.method5162()) {
					local63 = Integer.parseInt(arg1.substring(3));
					if (local63 < 1) {
						local63 = 1;
					} else if (local63 > 4) {
						local63 = 4;
					}
					Static202.anInt4074 = local63;
					Static218.aClass46_5.method5171(Static202.anInt4074);
					Static218.aClass46_5.method5132(0);
					Static85.method2094("Render cores now: " + Static202.anInt4074);
				} else {
					Static85.method2094("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static85.method2094("I(s): " + Static13.aClass11_56.method216() + "/" + Static13.aClass11_56.method217());
				Static85.method2094("I(m): " + Static120.aClass11_60.method216() + "/" + Static120.aClass11_60.method217());
				Static85.method2094("O(s): " + Static92.aClass139_1.method3707() + "/" + Static92.aClass139_1.method3701());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static85.method2094("Pos: " + Static219.anInt4400 + "," + ((Static124.anInt2717 >> 7) + Static151.anInt3234 >> 6) + "," + ((Static141.anInt2986 >> 7) + Static251.anInt3170 >> 6) + "," + ((Static124.anInt2717 >> 7) + Static151.anInt3234 & 0x3F) + "," + ((Static141.anInt2986 >> 7) + Static251.anInt3170 & 0x3F) + " Height: " + (Static279.method4730(Static219.anInt4400, Static124.anInt2717, Static141.anInt2986) - Static103.anInt2301));
				Static85.method2094("Look: " + Static219.anInt4400 + "," + (Static151.anInt3234 + Static341.anInt6533 >> 6) + "," + (Static251.anInt3170 + Static162.anInt3405 >> 6) + "," + (Static151.anInt3234 + Static341.anInt6533 & 0x3F) + "," + (Static251.anInt3170 + Static162.anInt3405 & 0x3F) + " Height: " + (Static279.method4730(Static219.anInt4400, Static341.anInt6533, Static162.anInt3405) - Static13.anInt2444));
			}
			if (arg1.equals("showocc")) {
				Static238.aBoolean306 = !Static238.aBoolean306;
				Static51.method1236();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static266.aBoolean337 = !Static266.aBoolean337;
				Static218.aClass46_5.method5125(Static266.aBoolean337);
				Static189.method5493();
			}
			if (arg1.equals("nonpcs")) {
				Static265.aBoolean336 = !Static265.aBoolean336;
			}
			if (arg1.equals("autoworld")) {
				Static144.method2891();
			}
			if (arg1.equals("heap")) {
				Static85.method2094("Heap: " + Static127.anInt2786 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static189.method5490();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local63 = 0; local63 < Static30.anIntArray45.length; local63++) {
					if (Static120.aBooleanArray12[local63]) {
						Static30.anIntArray45[local63] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static30.anIntArray45[local63] *= -1;
						}
					}
				}
				Static189.method5490();
			}
			if (arg1.equals("showcolmap")) {
				Static316.aBoolean225 = true;
				Static255.method4392();
			}
			if (arg1.equals("hidecolmap")) {
				Static316.aBoolean225 = false;
				Static255.method4392();
			}
			if (arg1.equals("resetcache")) {
				Static244.method4283();
			}
			if (arg1.equals("profilecpu")) {
				Static85.method2094(Static309.method5332() + "ms");
			}
			if (Static302.anInt5842 == 30) {
				Static164.aClass14_Sub4_Sub2_3.method2557(99);
				Static164.aClass14_Sub4_Sub2_3.method2538(arg1.length() + 2);
				Static164.aClass14_Sub4_Sub2_3.method2538(arg0 ? 1 : 0);
				Static164.aClass14_Sub4_Sub2_3.method2527(arg1);
				return;
			}
		} catch (@Pc(982) Exception local982) {
			Static85.method2094("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Lclient!ml;")
	public static Class141 method4760(@OriginalArg(1) int arg0) {
		@Pc(10) Class141 local10 = (Class141) Static308.aClass11_96.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static16.aClass143_11.method3745(35, arg0);
		local10 = new Class141();
		if (local20 != null) {
			local10.method3712(new Class14_Sub4(local20));
		}
		local10.method3710();
		Static308.aClass11_96.method219((long) arg0, local10);
		return local10;
	}
}
