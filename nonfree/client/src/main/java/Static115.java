import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Lclient!sd;")
	public static Class2 aClass2_27;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt2974;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!o;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!da;")
	public static Class18 aClass18_4;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1352 = Static56.method972("Loaded title screen");

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1351 = aClass5_1352;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!bd;")
	public static Class9 aClass9_27 = new Class9(100);

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1353 = Static56.method972("sideicons");

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "[I")
	public static int[] anIntArray380 = new int[50];

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	public static int anInt2975 = 0;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1354 = Static56.method972(":  ");

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public static int anInt2976 = -1;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1355 = Static56.method972("mapedge");

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1356 = Static56.method972("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
	public static int anInt2977 = 0;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	public static int anInt2978 = 1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBIII)V")
	public static void method1954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = arg1; local12 <= arg1 + arg3; local12++) {
			for (@Pc(16) int local16 = arg0; local16 <= arg0 + arg2; local16++) {
				if (local16 >= 0 && local16 < 104 && local12 >= 0 && local12 < 104) {
					Static19.aByteArrayArrayArray2[0][local16][local12] = 127;
					if (local16 == arg0 && local16 > 0) {
						Static111.anIntArrayArrayArray7[0][local16][local12] = Static111.anIntArrayArrayArray7[0][local16 - 1][local12];
					}
					if (arg0 + arg2 == local16 && local16 < 103) {
						Static111.anIntArrayArrayArray7[0][local16][local12] = Static111.anIntArrayArrayArray7[0][local16 + 1][local12];
					}
					if (arg1 == local12 && local12 > 0) {
						Static111.anIntArrayArrayArray7[0][local16][local12] = Static111.anIntArrayArrayArray7[0][local16][local12 - 1];
					}
					if (arg3 + arg1 == local12 && local12 < 103) {
						Static111.anIntArrayArrayArray7[0][local16][local12] = Static111.anIntArrayArrayArray7[0][local16][local12 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method1955() {
		aClass5_1354 = null;
		aClass5_1353 = null;
		aClass9_27 = null;
		aClass2_27 = null;
		aClass5_1355 = null;
		aClass18_4 = null;
		aClass5_1351 = null;
		aClass37_1 = null;
		anIntArray380 = null;
		aClass5_1356 = null;
		aClass5_1352 = null;
		anIntArray381 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!vb;BLclient!ba;I)V")
	public static void method1956(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(2) Class8 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class51 local9 = Static18.aClass51_5;
		synchronized (Static18.aClass51_5) {
			for (@Pc(16) Class3_Sub9 local16 = (Class3_Sub9) Static18.aClass51_5.method1316(); local16 != null; local16 = (Class3_Sub9) Static18.aClass51_5.method1310()) {
				if (local16.aLong85 == (long) arg2 && local16.aClass8_2 == arg1 && local16.anInt1958 == 0) {
					local7 = local16.aByteArray14;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(72) byte[] local72 = arg1.method199(arg2);
			arg0.method1890(local72, arg2, true, arg1);
		} else {
			arg0.method1890(local7, arg2, true, arg1);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!bb;II)V")
	public static void method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		Static112.aClass2_25.method1318();
		Static88.aClass3_Sub1_Sub2_Sub4_9.method1857(0, 0);
		arg2.method266(Static56.aClass5_735, 55, 28, 16777215, true);
		if (arg1 == 0) {
			arg2.method266(Static83.aClass5_936, 55, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg2.method266(Static52.aClass5_683, 55, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg2.method266(Static76.aClass5_1166, 55, 41, 16711680, true);
		}
		if (arg1 == 3) {
			arg2.method266(Static45.aClass5_598, 55, 41, 65535, true);
		}
		arg2.method266(Static48.aClass5_632, 184, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method266(Static83.aClass5_936, 184, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method266(Static52.aClass5_683, 184, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method266(Static76.aClass5_1166, 184, 41, 16711680, true);
		}
		arg2.method266(Static99.aClass5_1126, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method266(Static83.aClass5_936, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method266(Static52.aClass5_683, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method266(Static76.aClass5_1166, 324, 41, 16711680, true);
		}
		arg2.method255(Static51.aClass5_1095, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(161) Graphics local161 = Static62.aCanvas1.getGraphics();
			Static112.aClass2_25.method1322(local161, 0, 453);
		} catch (@Pc(169) Exception local169) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lclient!qc;")
	public static Class3_Sub1_Sub13 method1958(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub13 local10 = (Class3_Sub1_Sub13) Static75.aClass9_19.method282((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static55.aClass11_32.method1882(9, arg0);
		local10 = new Class3_Sub1_Sub13();
		local10.anInt2212 = arg0;
		if (local20 != null) {
			local10.method1479(new Class3_Sub6(local20));
		}
		local10.method1483();
		Static75.aClass9_19.method284(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public static void method1959() {
		Static15.aClass21_4 = new Class21(32);
	}
}
