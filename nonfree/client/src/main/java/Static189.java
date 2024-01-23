import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public static int anInt3604;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Lclient!kf;")
	public static Class90 aClass90_7;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt3606 = 0;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
	public static int[] anIntArray299 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	public static int anInt3607 = 0;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
	public static int anInt3609 = 2;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public static int anInt3613 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZILclient!nk;II)V")
	public static void method3084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		Static282.anInt5096 = 0;
		Static168.aBoolean223 = false;
		Static13.aClass121_11 = arg2;
		Static111.anInt2293 = 10000;
		Static190.anInt3615 = 1;
		Static209.anInt3978 = arg1;
		Static213.anInt4453 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[B)Z")
	public static boolean method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class1_Sub14 local12 = new Class1_Sub14(arg2);
		@Pc(14) int local14 = -1;
		label57: while (true) {
			@Pc(18) int local18 = local12.method1354();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(37) int local37;
				while (!local31) {
					local37 = local12.method1362();
					if (local37 == 0) {
						continue label57;
					}
					local29 += local37 - 1;
					@Pc(67) int local67 = local29 & 0x3F;
					@Pc(73) int local73 = local12.method1378() >> 2;
					@Pc(77) int local77 = arg0 + local67;
					@Pc(83) int local83 = local29 >> 6 & 0x3F;
					@Pc(88) int local88 = local83 + arg1;
					if (local88 > 0 && local77 > 0 && local88 < 103 && local77 < 103) {
						@Pc(106) Class71 local106 = Static255.method4052(local14);
						if (local73 != 22 || Static239.aBoolean299 || local106.anInt2391 != 0 || local106.anInt2393 == 1 || local106.aBoolean151) {
							local31 = true;
							if (!local106.method2028()) {
								Static258.anInt4706++;
								local7 = false;
							}
						}
					}
				}
				local37 = local12.method1362();
				if (local37 == 0) {
					break;
				}
				local12.method1378();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!rj;I)V")
	public static void method3086(@OriginalArg(0) Class154 arg0) {
		Static184.anInt3503 = 3;
		Static303.method4585(true);
		Static192.anInt3641 = 2;
		Static37.anInt771 = 0;
		Static123.aBoolean160 = true;
		Static94.aBoolean232 = true;
		Static111.anInt2296 = 0;
		Static152.aBoolean35 = true;
		Static239.aBoolean299 = true;
		Static182.anInt3491 = 255;
		Static64.anInt1228 = 127;
		Static311.aBoolean384 = true;
		Static249.aBoolean306 = true;
		Static183.aBoolean241 = true;
		Static310.aBoolean382 = true;
		Static187.aBoolean243 = true;
		Static102.aBoolean113 = true;
		@Pc(49) Class132 local49 = null;
		Static218.anInt1144 = 0;
		Static219.aBoolean281 = true;
		Static294.anInt5275 = 127;
		Static48.anInt956 = 0;
		if (Static207.anInt3958 < 96) {
			Static158.method2721(0);
		} else {
			Static158.method2721(2);
		}
		Static27.anInt478 = 0;
		Static73.aBoolean87 = false;
		Static277.aBoolean341 = false;
		Static138.anInt2784 = 0;
		Static261.aBoolean326 = true;
		Static36.aBoolean28 = false;
		Static41.anInt852 = 0;
		try {
			@Pc(85) Class185 local85 = arg0.method3893("runescape");
			while (local85.anInt5276 == 0) {
				Static282.method4345(1L);
			}
			if (local85.anInt5276 == 1) {
				local49 = (Class132) local85.anObject6;
				@Pc(110) byte[] local110 = new byte[(int) local49.method3354()];
				@Pc(127) int local127;
				for (@Pc(112) int local112 = 0; local112 < local110.length; local112 += local127) {
					local127 = local49.method3351(local110.length - local112, local110, local112);
					if (local127 == -1) {
						throw new IOException("EOF");
					}
				}
				Static220.method3440(new Class1_Sub14(local110));
			}
		} catch (@Pc(154) Exception local154) {
		}
		try {
			if (local49 != null) {
				local49.method3356();
			}
		} catch (@Pc(161) Exception local161) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z")
	public static boolean method3087(@OriginalArg(0) int arg0) {
		@Pc(7) Class29_Sub1 local7 = Static126.method1641(arg0);
		if (local7 == null) {
			return false;
		} else if (Static246.anInt4462 == 1 || Static246.anInt4462 == 2 || Static85.anInt1679 == 2) {
			Static77.aString93 = local7.aString325;
			Static312.anInt5731 = local7.anInt5342;
			if (Static85.anInt1679 != 0) {
				Static270.anInt4895 = Static312.anInt5731 + 50000;
				Static141.anInt2839 = Static312.anInt5731 + 40000;
				Static94.anInt3445 = Static141.anInt2839;
			}
			return true;
		} else {
			@Pc(51) String local51 = "";
			if (Static85.anInt1679 != 0) {
				local51 = ":" + (local7.anInt5342 + 7000);
			}
			@Pc(71) String local71 = "";
			if (Static37.aString43 != null) {
				local71 = "/p=" + Static37.aString43;
			}
			@Pc(130) String local130 = "http://" + local7.aString325 + local51 + "/l=" + Static114.anInt2371 + "/a=" + Static71.anInt1519 + local71 + "/j" + (Static96.aBoolean106 ? "1" : "0") + ",o" + (Static155.aBoolean191 ? "1" : "0") + ",a2,m" + (Static113.aBoolean138 ? "1" : "0");
			try {
				Static196.aClient1.getAppletContext().showDocument(new URL(local130), "_self");
				return true;
			} catch (@Pc(146) Exception local146) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method3089() {
		Static194.aClass187_103.method4525();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIZI)V")
	public static void method3090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static17.aClass23Array1[0].method3909(arg1, arg2);
		@Pc(23) int local23 = arg4 * (arg4 - 32) / arg0;
		if (local23 < 8) {
			local23 = 8;
		}
		@Pc(44) int local44 = arg3 * (arg4 - local23 - 32) / (arg0 - arg4);
		Static17.aClass23Array1[1].method3909(arg1, arg4 + arg2 - 16);
		if (!Static156.aBoolean211) {
			Static25.method385(arg1, arg2 + 16, 16, arg4 - 32, Static107.anInt2205);
			Static25.method385(arg1, local44 + arg2 + 16, 16, local23, Static34.anInt4471);
			Static25.method409(arg1, local44 + arg2 + 16, local23, Static145.anInt2882);
			Static25.method409(arg1 + 1, arg2 + 16 - -local44, local23, Static145.anInt2882);
			Static25.method398(arg1, arg2 + local44 + 16, 16, Static145.anInt2882);
			Static25.method398(arg1, arg2 + local44 + 17, 16, Static145.anInt2882);
			Static25.method409(arg1 + 15, arg2 - (-local44 + -16), local23, Static289.anInt5162);
			Static25.method409(arg1 + 14, local44 + 17 + arg2, local23 - 1, Static289.anInt5162);
			Static25.method398(arg1, arg2 + local44 + local23 + 15, 16, Static289.anInt5162);
			Static25.method398(arg1 + 1, arg2 + 14 - -local44 + local23, 15, Static289.anInt5162);
			return;
		}
		Static119.method2129(arg1, arg2 + 16, 16, arg4 - 32, Static107.anInt2205);
		Static119.method2129(arg1, local44 + arg2 + 16, 16, local23, Static34.anInt4471);
		Static119.method2136(arg1, local44 + arg2 + 16, local23, Static145.anInt2882);
		Static119.method2136(arg1 + 1, arg2 + 16 + local44, local23, Static145.anInt2882);
		Static119.method2127(arg1, local44 + arg2 + 16, 16, Static145.anInt2882);
		Static119.method2127(arg1, local44 + arg2 + 17, 16, Static145.anInt2882);
		Static119.method2136(arg1 + 15, arg2 + 16 + local44, local23, Static289.anInt5162);
		Static119.method2136(arg1 + 14, local44 + 17 + arg2, local23 - 1, Static289.anInt5162);
		Static119.method2127(arg1, local23 + arg2 + local44 + 15, 16, Static289.anInt5162);
		Static119.method2127(arg1 + 1, local23 + local44 + 14 + arg2, 15, Static289.anInt5162);
	}
}
