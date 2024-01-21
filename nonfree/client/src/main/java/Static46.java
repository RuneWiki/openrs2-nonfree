import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!i", name = "E", descriptor = "[I")
	public static int[] anIntArray131 = new int[100];

	@OriginalMember(owner = "client!i", name = "N", descriptor = "I")
	public static int anInt1211 = 0;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static volatile int anInt1213 = 0;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "Lclient!ob;")
	public static Class55 aClass55_36 = new Class55(64);

	@OriginalMember(owner = "client!i", name = "W", descriptor = "I")
	public static int anInt1215 = -1;

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!je;")
	public static Class40 aClass40_616 = Static69.method1231("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIII)V")
	public static void method824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg0; local7 <= arg3 + arg0; local7++) {
			for (@Pc(11) int local11 = arg1; local11 <= arg1 + arg2; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static87.aByteArrayArrayArray9[0][local11][local7] = 127;
					if (local11 == arg1 && local11 > 0) {
						Static118.anIntArrayArrayArray6[0][local11][local7] = Static118.anIntArrayArrayArray6[0][local11 - 1][local7];
					}
					if (arg2 + arg1 == local11 && local11 < 103) {
						Static118.anIntArrayArrayArray6[0][local11][local7] = Static118.anIntArrayArrayArray6[0][local11 + 1][local7];
					}
					if (arg0 == local7 && local7 > 0) {
						Static118.anIntArrayArrayArray6[0][local11][local7] = Static118.anIntArrayArrayArray6[0][local11][local7 - 1];
					}
					if (arg0 + arg3 == local7 && local7 < 103) {
						Static118.anIntArrayArrayArray6[0][local11][local7] = Static118.anIntArrayArrayArray6[0][local11][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIILclient!qb;BI)V")
	public static void method825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub2_Sub4 arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = arg0 * arg0 + arg1 * arg1;
		if (local16 <= 4225 || local16 >= 90000) {
			Static121.method2036(arg1, arg2, arg0, arg3, arg4);
			return;
		}
		@Pc(37) int local37 = Static39.anInt1035 + Static19.anInt616 & 0x7FF;
		@Pc(41) int local41 = Class2_Sub1_Sub2_Sub2.anIntArray221[local37];
		@Pc(49) int local49 = local41 * 256 / (Static94.anInt2403 + 256);
		@Pc(53) int local53 = Class2_Sub1_Sub2_Sub2.anIntArray219[local37];
		@Pc(61) int local61 = local53 * 256 / (Static94.anInt2403 + 256);
		@Pc(71) int local71 = local49 * arg1 + arg0 * local61 >> 16;
		@Pc(82) int local82 = arg0 * local49 - arg1 * local61 >> 16;
		@Pc(88) double local88 = Math.atan2((double) local71, (double) local82);
		@Pc(94) int local94 = (int) (Math.sin(local88) * 63.0D);
		@Pc(100) int local100 = (int) (Math.cos(local88) * 57.0D);
		Static106.aClass2_Sub1_Sub2_Sub4_5.method1713(local94 + arg4 + 94 + 4 - 10, -local100 + -20 + (arg2 - -83), local88);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method826(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static49.aClass10_1);
		arg0.addMouseMotionListener(Static49.aClass10_1);
		arg0.addFocusListener(Static49.aClass10_1);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
	public static void method827() {
		Class2_Sub10.anIntArray132 = null;
		anIntArray131 = null;
		aClass40_616 = null;
		aClass55_36 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!je;Lclient!fd;Lclient!je;I)[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] method828(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class40 arg2) {
		@Pc(13) int local13 = arg1.method1915(arg2);
		@Pc(19) int local19 = arg1.method1918(arg0, local13);
		return Static124.method2073(local19, arg1, local13);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	public static void method829() {
		@Pc(13) int local13;
		if (anInt1211 > 0) {
			for (local13 = 0; local13 < 256; local13++) {
				if (anInt1211 > 768) {
					Static30.anIntArray86[local13] = Static72.method1224(1024 - anInt1211, Static21.anIntArray74[local13], Static81.anIntArray225[local13]);
				} else if (anInt1211 <= 256) {
					Static30.anIntArray86[local13] = Static72.method1224(256 - anInt1211, Static81.anIntArray225[local13], Static21.anIntArray74[local13]);
				} else {
					Static30.anIntArray86[local13] = Static81.anIntArray225[local13];
				}
			}
		} else if (Static70.anInt1887 <= 0) {
			for (local13 = 0; local13 < 256; local13++) {
				Static30.anIntArray86[local13] = Static21.anIntArray74[local13];
			}
		} else {
			for (local13 = 0; local13 < 256; local13++) {
				if (Static70.anInt1887 > 768) {
					Static30.anIntArray86[local13] = Static72.method1224(1024 - Static70.anInt1887, Static21.anIntArray74[local13], Static69.anIntArray206[local13]);
				} else if (Static70.anInt1887 > 256) {
					Static30.anIntArray86[local13] = Static69.anIntArray206[local13];
				} else {
					Static30.anIntArray86[local13] = Static72.method1224(256 - Static70.anInt1887, Static69.anIntArray206[local13], Static21.anIntArray74[local13]);
				}
			}
		}
		Static6.method1685(0, 9, 128, 263);
		Static95.aClass2_Sub1_Sub2_Sub4_4.method1712(0, 0);
		Static6.method1689();
		@Pc(158) int local158 = 6885;
		local13 = 0;
		@Pc(175) int local175;
		@Pc(179) int local179;
		@Pc(192) int local192;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(208) int local208;
		@Pc(213) int local213;
		for (@Pc(162) int local162 = 1; local162 < 255; local162++) {
			local175 = (256 - local162) * Static126.anIntArray346[local162] / 256;
			local179 = local175 + 22;
			if (local179 < 0) {
				local179 = 0;
			}
			local13 += local179;
			for (local192 = local179; local192 < 128; local192++) {
				local199 = Static97.anIntArray267[local13++];
				if (local199 == 0) {
					local158++;
				} else {
					local203 = local199;
					local208 = 256 - local199;
					local213 = Static65.aClass7_1.anIntArray353[local158];
					local199 = Static30.anIntArray86[local199];
					Static65.aClass7_1.anIntArray353[local158++] = (local208 * (local213 & 0xFF00FF) + local203 * (local199 & 0xFF00FF) & 0xFF00FF00) + (local203 * (local199 & 0xFF00) + (local208 * (local213 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local158 += local179 + 765 - 128;
		}
		local158 = 7546;
		Static6.method1685(637, 9, 765, 263);
		local13 = 0;
		Static93.aClass2_Sub1_Sub2_Sub4_3.method1712(382, 0);
		Static6.method1689();
		for (local175 = 1; local175 < 255; local175++) {
			local179 = (256 - local175) * Static126.anIntArray346[local175] / 256;
			local192 = 103 - local179;
			local158 += local179;
			for (local199 = 0; local199 < local192; local199++) {
				local203 = Static97.anIntArray267[local13++];
				if (local203 == 0) {
					local158++;
				} else {
					local208 = local203;
					local213 = 256 - local203;
					local203 = Static30.anIntArray86[local203];
					@Pc(358) int local358 = Static65.aClass7_1.anIntArray353[local158];
					Static65.aClass7_1.anIntArray353[local158++] = (local213 * (local358 & 0xFF00FF) + (local203 & 0xFF00FF) * local208 & 0xFF00FF00) + (local208 * (local203 & 0xFF00) + (local358 & 0xFF00) * local213 & 0xFF0000) >> 8;
				}
			}
			local158 += 765 - local192 - local179;
			local13 += 128 - local192;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!je;IIBLclient!je;)V")
	public static void method830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class40 arg5) {
		if (Static8.aBoolean21 || Static57.anInt1500 >= 500) {
			return;
		}
		Static45.aClass40Array4[Static57.anInt1500] = arg5;
		Static25.aClass40Array1[Static57.anInt1500] = arg2;
		Static83.anIntArray236[Static57.anInt1500] = arg4;
		Static103.anIntArray284[Static57.anInt1500] = arg3;
		Static38.anIntArray98[Static57.anInt1500] = arg1;
		Static129.anIntArray354[Static57.anInt1500] = arg0;
		Static57.anInt1500++;
	}
}
