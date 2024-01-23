import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public static int anInt4089 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method3056() {
		if (Static34.aClass109_2 != null) {
			Static34.aClass109_2.method3141();
			Static34.aClass109_2 = null;
		}
		Static24.method483();
		Static26.method382();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static47.aClass65Array1[local17].method2206();
		}
		Static152.method2728(false);
		System.gc();
		Static11.method224();
		Static30.anInt925 = -1;
		Static1.aBoolean1 = false;
		Static205.method3440(true);
		Static64.anInt1786 = 0;
		Static51.aBoolean84 = false;
		Static165.anInt3877 = 0;
		Static261.anInt5479 = 0;
		Static29.anInt907 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static75.aClass116Array1.length; local56++) {
			Static75.aClass116Array1[local56] = null;
		}
		Static238.anInt5146 = 0;
		Static16.anInt4955 = 0;
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static147.aClass9_Sub1_Sub1Array1[local77] = null;
			Static73.aClass1_Sub13Array1[local77] = null;
		}
		for (@Pc(95) int local95 = 0; local95 < 32768; local95++) {
			Static36.aClass9_Sub1_Sub2Array2[local95] = null;
		}
		for (@Pc(109) int local109 = 0; local109 < 4; local109++) {
			for (@Pc(113) int local113 = 0; local113 < 104; local113++) {
				for (@Pc(117) int local117 = 0; local117 < 104; local117++) {
					Static138.aClass3ArrayArrayArray1[local109][local113][local117] = null;
				}
			}
		}
		Static236.method3914();
		Static175.anInt4027 = 0;
		Static174.method2988();
		Static62.method1196();
		try {
			Static267.method82("loggedout", Static38.aClass28_1.anApplet1);
		} catch (@Pc(168) Throwable local168) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!ac;")
	public static Class1_Sub2_Sub1 method3057(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub1 local10 = (Class1_Sub2_Sub1) Static160.aClass58_10.method2093((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static42.aClass51_16.method1874(5, arg0);
		local10 = new Class1_Sub2_Sub1();
		if (local20 != null) {
			local10.method79(new Class1_Sub13(local20));
		}
		Static160.aClass58_10.method2089((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILclient!se;IIIB)V")
	public static void method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = arg6 * arg6 + arg2 * arg2;
		if (arg1 < local8) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg3.anInt4695 / 2, arg3.anInt4726 / 2);
		if (local35 * local35 >= local8) {
			Static55.method1070(arg6, arg0, arg2, Static106.aClass1_Sub2_Sub4Array9[arg5], arg4, arg3);
			return;
		}
		local35 -= 10;
		@Pc(48) int local48 = Static83.anInt2232 + (int) Static230.aFloat51 & 0x7FF;
		@Pc(52) int local52 = Class132.anIntArray440[local48];
		@Pc(60) int local60 = local52 * 256 / (Static44.anInt1333 + 256);
		@Pc(64) int local64 = Class132.anIntArray439[local48];
		@Pc(72) int local72 = local64 * 256 / (Static44.anInt1333 + 256);
		@Pc(82) int local82 = arg2 * local60 + arg6 * local72 >> 16;
		@Pc(92) int local92 = local72 * arg2 - local60 * arg6 >> 16;
		@Pc(98) double local98 = Math.atan2((double) local82, (double) local92);
		@Pc(105) int local105 = (int) (Math.sin(local98) * (double) local35);
		@Pc(112) int local112 = (int) (Math.cos(local98) * (double) local35);
		((Class1_Sub2_Sub4_Sub1) Static88.aClass1_Sub2_Sub4Array8[arg5]).method908(local105 + arg3.anInt4695 / 2 + arg0 - 10, -local112 + -10 + arg4 + arg3.anInt4726 / 2, local98);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method3059(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(18) int local18 = Static63.aClass1_Sub2_Sub7_1.method1918(arg1, 250);
		@Pc(25) int local25 = Static63.aClass1_Sub2_Sub7_1.method1928(arg1, 250) * 13;
		Static189.method3193(6, 6, local18 + 4 + 4, local25 - -4 + 4, 0);
		Static189.method3185(6, 6, local18 + 4 + 4, 4 + 4 + local25, 16777215);
		Static63.aClass1_Sub2_Sub7_1.method1930(arg1, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static199.method3321(6, local25 + 4 + 4, local18 + 8, 6);
		if (!arg0) {
			Static116.method2308(local25, local18, 10, 10);
			return;
		}
		try {
			@Pc(111) Graphics local111 = Static98.aCanvas1.getGraphics();
			Static193.aClass73_1.method2867(local111);
		} catch (@Pc(119) Exception local119) {
			Static98.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V")
	public static void method3060() {
		Static165.aClass79_24.method2479(5);
	}
}
