import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qe", name = "Fb", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!qe", name = "Hb", descriptor = "Lclient!ia;")
	public static Class43 aClass43_3;

	@OriginalMember(owner = "client!qe", name = "A", descriptor = "[[B")
	public static final byte[][] aByteArrayArray23 = new byte[50][];

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_90 = new Class96("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!qe", name = "ob", descriptor = "Z")
	public static boolean aBoolean452 = true;

	@OriginalMember(owner = "client!qe", name = "sb", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_139 = new Class151(8);

	@OriginalMember(owner = "client!qe", name = "ub", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!qe", name = "wb", descriptor = "I")
	public static int anInt5633 = 0;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public static void method4448() {
		Static98.aClass142_13.method3206();
		for (@Pc(13) Class1_Sub3 local13 = (Class1_Sub3) Static251.aClass142_26.method3199(); local13 != null; local13 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
			if (local13.anInt227 < 1000) {
				local13.method5965();
				Static98.aClass142_13.method3212(local13);
			}
		}
		Static98.aClass142_13.method3209(Static251.aClass142_26);
		@Pc(41) int local41 = -1;
		@Pc(46) Class1_Sub22 local46 = (Class1_Sub22) Static335.aClass142_42.method3199();
		if (local46 != null) {
			local41 = local46.method2937();
		}
		if (!Static378.aBoolean549) {
			if (local41 == 0 && (Static82.anInt1486 == 1 && Static119.anInt2296 > 2 || Static102.method1634())) {
				local41 = 2;
			}
			if (local41 == 2 && Static119.anInt2296 > 0 && local46 != null) {
				if (Static206.aClass229_6 == null && Static105.anInt2085 == 0) {
					Static393.method5337(local46.method2936(), local46.method2939());
				} else {
					Static228.anInt3921 = 2;
				}
			}
			if (local41 == 0 && Static119.anInt2296 > 0) {
				Static341.method4906();
			}
			if (Static206.aClass229_6 != null || Static105.anInt2085 != 0) {
				return;
			}
			Static228.anInt3921 = 0;
			Static241.aClass1_Sub3_2 = null;
			return;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local41 == -1) {
			local70 = Static38.aClass32_1.method3517();
			local74 = Static38.aClass32_1.method3524();
			if (Static256.anInt4398 - 10 > local70 || Static256.anInt4398 + Static102.anInt1978 + 10 < local70 || local74 < Static423.anInt7379 - 10 || local74 > Static423.anInt7379 + Static369.anInt6690 + 10) {
				Static378.aBoolean549 = false;
				Static176.method2836(Static423.anInt7379, Static256.anInt4398, Static102.anInt1978, Static369.anInt6690);
			}
		}
		if (local41 != 0) {
			return;
		}
		local70 = Static256.anInt4398;
		local74 = Static423.anInt7379;
		@Pc(118) int local118 = Static102.anInt1978;
		@Pc(122) int local122 = local46.method2939();
		@Pc(126) int local126 = local46.method2936();
		@Pc(128) int local128 = -1;
		@Pc(146) int local146;
		for (@Pc(130) int local130 = 0; local130 < Static119.anInt2296; local130++) {
			if (Static264.aBoolean355) {
				local146 = (Static119.anInt2296 - local130 - 1) * 16 + local74 + 33;
				if (local70 < local122 && local70 + local118 > local122 && local146 - 13 < local126 && local126 < local146 + 4) {
					local128 = local130;
				}
			} else {
				local146 = local74 + (Static119.anInt2296 + (-1 - local130)) * 16 + 31;
				if (local122 > local70 && local118 + local70 > local122 && local126 > local146 - 13 && local146 + 3 > local126) {
					local128 = local130;
				}
			}
		}
		if (local128 != -1) {
			local146 = 0;
			@Pc(228) Class117 local228 = new Class117(Static251.aClass142_26);
			for (@Pc(233) Class1_Sub3 local233 = (Class1_Sub3) local228.method2533(); local233 != null; local233 = (Class1_Sub3) local228.method2532()) {
				if (local146 == local128) {
					Static257.method3642(local233, local126, local122);
				}
				local146++;
			}
		}
		Static378.aBoolean549 = false;
		Static176.method2836(Static423.anInt7379, Static256.anInt4398, Static102.anInt1978, Static369.anInt6690);
		return;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ci;IIIIB)Ljava/awt/Frame;")
	public static Frame method4469(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0.method658()) {
			return null;
		}
		@Pc(17) Class173[] local17 = Static304.method4178(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg2 == local17[local25].anInt4475 && local17[local25].anInt4476 == arg1 && (!local23 || local17[local25].anInt4480 > arg3)) {
				local23 = true;
				arg3 = local17[local25].anInt4480;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(98) Class159 local98 = arg0.method652(arg3, arg1, arg2);
		while (local98.anInt4271 == 0) {
			Static366.method5214(10L);
		}
		@Pc(113) Frame local113 = (Frame) local98.anObject8;
		if (local113 == null) {
			return null;
		} else if (local98.anInt4271 == 2) {
			Static131.method2036(local113, arg0);
			return null;
		} else {
			return local113;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Z")
	public static boolean method4477(@OriginalArg(1) int arg0) {
		@Pc(7) Class48_Sub1 local7 = Static242.method3810(arg0);
		if (local7 == null) {
			return false;
		} else if (Static48.anInt770 == 3) {
			@Pc(38) String local38 = "";
			if (Static153.aClass174_7 != Static191.aClass174_5) {
				local38 = ":" + (local7.anInt1026 + 7000);
			}
			@Pc(59) String local59 = "";
			if (Static87.aString67 != null) {
				local59 = "/p=" + Static87.aString67;
			}
			@Pc(108) String local108 = "http://" + local7.aString19 + local38 + "/l=" + Static389.anInt7061 + "/a=" + Static311.anInt6534 + local59 + "/j" + (Static189.aBoolean273 ? "1" : "0") + ",o" + (Static310.aBoolean422 ? "1" : "0") + ",a2";
			try {
				Static451.aClient1.getAppletContext().showDocument(new URL(local108), "_self");
				return true;
			} catch (@Pc(118) Exception local118) {
				return false;
			}
		} else {
			Static20.anInt299 = local7.anInt1026;
			Static63.aString24 = local7.aString19;
			if (Static191.aClass174_5 != Static153.aClass174_7) {
				Static168.anInt3019 = Static20.anInt299 + 40000;
				Static11.anInt231 = Static20.anInt299 + 50000;
				Static29.anInt481 = Static168.anInt3019;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!ir;IIIZ)V")
	public static void method4482(@OriginalArg(2) Class47_Sub1_Sub5 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static435.method4778(arg1, arg2, arg3, arg0.anInt7060, arg0.aByte97, arg0.anInt7066, 0);
	}
}
