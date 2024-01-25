import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jka", name = "G", descriptor = "Lclient!ud;")
	public static Class349 aClass349_2;

	@OriginalMember(owner = "client!jka", name = "H", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!jka", name = "I", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!jka", name = "K", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!jka", name = "B", descriptor = "Lclient!oja;")
	public static final Class257 aClass257_4 = new Class257();

	@OriginalMember(owner = "client!jka", name = "J", descriptor = "[B")
	public static final byte[] aByteArray50 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "([BB)V")
	public static void method4103(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub23 local10 = new Class6_Sub23(arg0);
		while (true) {
			while (true) {
				@Pc(14) int local14 = local10.method8374();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					@Pc(29) int[] local29 = Static392.anIntArray117 = new int[6];
					local29[0] = local10.method8363();
					local29[1] = local10.method8363();
					local29[2] = local10.method8363();
					local29[3] = local10.method8363();
					local29[4] = local10.method8363();
					local29[5] = local10.method8363();
				} else {
					@Pc(76) int local76;
					@Pc(81) int local81;
					if (local14 == 4) {
						local76 = local10.method8374();
						Static507.anIntArray560 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static507.anIntArray560[local81] = local10.method8363();
							if (Static507.anIntArray560[local81] == 65535) {
								Static507.anIntArray560[local81] = -1;
							}
						}
					} else if (local14 == 5) {
						local76 = local10.method8374();
						Static598.anIntArray650 = new int[local76];
						for (local81 = 0; local81 < local76; local81++) {
							Static598.anIntArray650[local81] = local10.method8363();
							if (Static598.anIntArray650[local81] == 65535) {
								Static598.anIntArray650[local81] = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIIII)V")
	public static void method4104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg1;
		@Pc(14) int local14 = arg3 - arg2;
		if (local14 == 0) {
			if (local9 != 0) {
				Static562.method7898(arg1, arg0, arg4, arg2);
			}
		} else if (local9 == 0) {
			Static206.method3064(arg2, arg1, arg3, arg4);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(61) boolean local61 = local14 < local9;
			@Pc(65) int local65;
			@Pc(69) int local69;
			if (local61) {
				local65 = arg2;
				arg2 = arg1;
				local69 = arg3;
				arg1 = local65;
				arg3 = arg0;
				arg0 = local69;
			}
			if (arg3 < arg2) {
				local65 = arg2;
				arg2 = arg3;
				local69 = arg1;
				arg3 = local65;
				arg1 = arg0;
				arg0 = local69;
			}
			local65 = arg1;
			local69 = arg3 - arg2;
			@Pc(107) int local107 = arg0 - arg1;
			@Pc(112) int local112 = -(local69 >> 1);
			if (local107 < 0) {
				local107 = -local107;
			}
			@Pc(128) int local128 = arg0 <= arg1 ? -1 : 1;
			@Pc(132) int local132;
			if (local61) {
				for (local132 = arg2; local132 <= arg3; local132++) {
					Static173.anIntArrayArray15[local132][local65] = arg4;
					local112 += local107;
					if (local112 > 0) {
						local112 -= local69;
						local65 += local128;
					}
				}
			} else {
				for (local132 = arg2; local132 <= arg3; local132++) {
					Static173.anIntArrayArray15[local65][local132] = arg4;
					local112 += local107;
					if (local112 > 0) {
						local112 -= local69;
						local65 += local128;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZILjava/lang/String;Ljava/lang/String;BZ)V")
	public static void method4105(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) boolean arg5) {
		Static169.aClass8_53.anInt268 = 1;
		@Pc(11) String local11 = arg4.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg0 != -1) {
			@Pc(27) Class325 local27 = aClass349_2.method8157(arg0);
			if (local27 == null || local27.method7797() != arg1) {
				return;
			}
			if (local27.method7797()) {
				local18 = local27.aString129;
			} else {
				local16 = local27.anInt9243;
			}
		}
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static340.aClass121_1.anInt3173; local58++) {
			@Pc(65) Class216 local65 = Static340.aClass121_1.method2647(local58);
			if ((!arg5 || local65.aBoolean400) && local65.anInt6088 == -1 && local65.anInt6049 == -1 && local65.anInt6087 == -1 && local65.anInt6043 == 0 && local65.aString77.toLowerCase().indexOf(local11) != -1) {
				if (arg0 != -1) {
					if (arg1) {
						if (!arg3.equals(local65.method5143(arg0, local18))) {
							continue;
						}
					} else if (local65.method5149(local16, arg0) != arg2) {
						continue;
					}
				}
				if (local56 >= 250) {
					Static123.aShortArray41 = null;
					Static403.anInt6786 = -1;
					return;
				}
				if (local14.length <= local56) {
					@Pc(138) short[] local138 = new short[local14.length * 2];
					for (@Pc(140) int local140 = 0; local140 < local56; local140++) {
						local138[local140] = local14[local140];
					}
					local14 = local138;
				}
				local14[local56++] = (short) local58;
			}
		}
		Static123.aShortArray41 = local14;
		Static277.anInt4792 = 0;
		Static403.anInt6786 = local56;
		@Pc(178) String[] local178 = new String[Static403.anInt6786];
		for (@Pc(180) int local180 = 0; local180 < Static403.anInt6786; local180++) {
			local178[local180] = Static340.aClass121_1.method2647(local14[local180]).aString77;
		}
		Static510.method7254(Static123.aShortArray41, local178);
		Static169.aClass8_53.method257();
		Static169.aClass8_53.anInt268 = 2;
	}
}
