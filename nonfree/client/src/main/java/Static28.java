import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_15;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public static int anInt794 = 0;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!wb;")
	private static Class65 aClass65_379 = Static24.method441("Login");

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_374 = aClass65_379;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Lclient!wb;")
	private static Class65 aClass65_375 = Static24.method441("Message");

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!wb;")
	private static Class65 aClass65_376 = Static24.method441("wishes to trade with you)3");

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Lclient!wb;")
	public static Class65 aClass65_377 = aClass65_376;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_378 = Static24.method441("mapmarker");

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_380 = aClass65_375;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
	public static int[] anIntArray111 = new int[5];

	@OriginalMember(owner = "client!f", name = "s", descriptor = "[I")
	public static int[] anIntArray112 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method502() {
		anObject2 = null;
		aClass65_374 = null;
		aClass65_379 = null;
		aClass65_380 = null;
		aClass65_378 = null;
		aClass33_Sub1_15 = null;
		aClass65_375 = null;
		aClass65_377 = null;
		anIntArray111 = null;
		anIntArray112 = null;
		anIntArray110 = null;
		aClass65_376 = null;
		anIntArray109 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!ab;")
	public static Class2_Sub1_Sub2 method503(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static89.aClass2_Sub1_Sub2ArrayArray1[local7] == null || Static89.aClass2_Sub1_Sub2ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static46.method816(local7);
			if (!local25) {
				return null;
			}
		}
		return Static89.aClass2_Sub1_Sub2ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static void method504(@OriginalArg(1) int arg0) {
		if (!Static46.method816(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub1_Sub2[] local14 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class2_Sub1_Sub2 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt196 = 0;
				local22.anInt190 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[Lclient!uc;I[BIIIIBLclient!fc;I)V")
	public static void method505(@OriginalArg(0) int arg0, @OriginalArg(1) Class58[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class18 arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class2_Sub8 local10 = new Class2_Sub8(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method1376();
			if (local20 == 0) {
				return;
			}
			local12 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method1376();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local10.method1410();
				@Pc(65) int local65 = local61 & 0x3;
				@Pc(69) int local69 = local61 >> 2;
				if (arg4 == local57 && arg7 <= local53 && local53 < arg7 + 8 && arg5 <= local47 && local47 < arg5 + 8) {
					@Pc(108) Class2_Sub1_Sub14 local108 = Static29.method518(local12);
					@Pc(125) int local125 = Static102.method1721(arg0, local47 & 0x7, local65, local108.anInt2621, local53 & 0x7, local108.anInt2634) + arg6;
					@Pc(143) int local143 = arg9 + Static83.method1430(local108.anInt2634, arg0, local53 & 0x7, local47 & 0x7, local65, local108.anInt2621);
					if (local125 > 0 && local143 > 0 && local125 < 103 && local143 < 103) {
						@Pc(155) Class58 local155 = null;
						@Pc(157) int local157 = arg2;
						if ((Static50.aByteArrayArrayArray6[1][local125][local143] & 0x2) == 2) {
							local157 = arg2 - 1;
						}
						if (local157 >= 0) {
							local155 = arg1[local157];
						}
						Static96.method1649(local12, arg2, arg0 + local65 & 0x3, arg8, local125, local143, local69, local155);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIILclient!wc;I)V")
	public static void method506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub4_Sub4 arg2, @OriginalArg(4) int arg3) {
		Static29.aClass15_22.method1098();
		Static90.aClass2_Sub1_Sub4_Sub3_13.method1479(0, 0);
		arg2.method1832(Static29.aClass65_391, 55, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method1832(Static83.aClass65_1064, 55, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method1832(Static63.aClass65_863, 55, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method1832(Static4.aClass65_93, 55, 41, 16711680, true);
		}
		if (arg0 == 3) {
			arg2.method1832(Static35.aClass65_509, 55, 41, 65535, true);
		}
		arg2.method1832(Static5.aClass65_115, 184, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method1832(Static83.aClass65_1064, 184, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method1832(Static63.aClass65_863, 184, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method1832(Static4.aClass65_93, 184, 41, 16711680, true);
		}
		arg2.method1832(Static65.aClass65_892, 324, 28, 16777215, true);
		if (arg1 == 0) {
			arg2.method1832(Static83.aClass65_1064, 324, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg2.method1832(Static63.aClass65_863, 324, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg2.method1832(Static4.aClass65_93, 324, 41, 16711680, true);
		}
		arg2.method1825(Static52.aClass65_724, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(158) Graphics local158 = Static70.aCanvas1.getGraphics();
			Static29.aClass15_22.method1104(453, local158, 0);
		} catch (@Pc(166) Exception local166) {
			Static70.aCanvas1.repaint();
		}
	}
}
