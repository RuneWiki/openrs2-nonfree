import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
	public static int anInt3600;

	@OriginalMember(owner = "client!haa", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray80;

	@OriginalMember(owner = "client!haa", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray81;

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_18 = new Class6(64);

	@OriginalMember(owner = "client!haa", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!haa", name = "x", descriptor = "I")
	public static int anInt3613 = -1;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V")
	public static void method3211() {
		if (Static376.aFrame4 != null) {
			return;
		}
		@Pc(10) int local10 = Static322.anInt5444;
		@Pc(12) int local12 = Static486.anInt7950;
		@Pc(20) int local20 = Static308.anInt5172 - local10 - Static40.anInt758;
		@Pc(29) int local29 = Static570.anInt9271 - Static308.anInt5171 - local12;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local29 <= 0) {
			return;
		}
		try {
			@Pc(50) Container local50;
			if (Static203.aFrame3 != null) {
				local50 = Static203.aFrame3;
			} else if (Static31.anApplet1 == null) {
				local50 = Static150.anApplet_Sub1_1;
			} else {
				local50 = Static31.anApplet1;
			}
			@Pc(62) int local62 = 0;
			@Pc(64) int local64 = 0;
			if (local50 == Static203.aFrame3) {
				@Pc(70) Insets local70 = Static203.aFrame3.getInsets();
				local64 = local70.top;
				local62 = local70.left;
			}
			@Pc(79) Graphics local79 = local50.getGraphics();
			local79.setColor(Color.black);
			if (local10 > 0) {
				local79.fillRect(local62, local64, local10, Static570.anInt9271);
			}
			if (local12 > 0) {
				local79.fillRect(local62, local64, Static308.anInt5172, local12);
			}
			if (local20 > 0) {
				local79.fillRect(local62 + Static308.anInt5172 - local20, local64, local20, Static570.anInt9271);
			}
			if (local29 > 0) {
				local79.fillRect(local62, Static570.anInt9271 + local64 - local29, Static308.anInt5172, local29);
				return;
			}
		} catch (@Pc(136) Exception local136) {
			return;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZIBII)V")
	public static void method3212(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg2 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(42) int local42 = Static50.aShort3 + (Static177.aShort43 - Static50.aShort3) * local21 / 100;
		if (local42 < Static277.aShort76) {
			local42 = Static277.aShort76;
		} else if (local42 > Static389.aShort2) {
			local42 = Static389.aShort2;
		}
		@Pc(64) int local64 = arg2 * 512 * local42 / (arg4 * 334);
		@Pc(105) int local105;
		@Pc(111) int local111;
		@Pc(80) short local80;
		if (Static104.aShort27 > local64) {
			local80 = Static104.aShort27;
			local42 = local80 * arg4 * 334 / (arg2 * 512);
			if (Static389.aShort2 < local42) {
				local42 = Static389.aShort2;
				local105 = arg2 * local42 * 512 / (local80 * 334);
				local111 = (arg4 - local105) / 2;
				if (arg1) {
					Static505.aClass45_11.JA();
					Static505.aClass45_11.method7425(arg2, arg3, arg0, -16777216, local111);
					Static505.aClass45_11.method7425(arg2, arg3 + arg4 - local111, arg0, -16777216, local111);
				}
				arg4 -= local111 * 2;
				arg3 += local111;
			}
		} else if (Static450.aShort143 < local64) {
			local80 = Static450.aShort143;
			local42 = local80 * arg4 * 334 / (arg2 * 512);
			if (local42 < Static277.aShort76) {
				local42 = Static277.aShort76;
				local105 = local80 * 334 * arg4 / (local42 * 512);
				local111 = (arg2 - local105) / 2;
				if (arg1) {
					Static505.aClass45_11.JA();
					Static505.aClass45_11.method7425(local111, arg3, arg0, -16777216, arg4);
					Static505.aClass45_11.method7425(local111, arg3, arg0 + arg2 - local111, -16777216, arg4);
				}
				arg2 -= local111 * 2;
				arg0 += local111;
			}
		}
		Static150.anInt3156 = arg0;
		Static469.anInt4272 = local42 * arg2 / 334;
		Static318.anInt5429 = arg3;
		Static111.anInt8659 = (short) arg4;
		Static569.anInt3538 = (short) arg2;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3214(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static591.anInt9675; local16++) {
			if (arg0.equalsIgnoreCase(Static22.aStringArray1[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;I[BI)I")
	public static int method3216(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static169.method3032(arg0.charAt(local17));
			@Pc(46) int local46 = local17 + 1 < local15 ? Static169.method3032(arg0.charAt(local17 + 1)) : -1;
			@Pc(67) int local67 = local15 <= local17 + 2 ? -1 : Static169.method3032(arg0.charAt(local17 + 2));
			@Pc(82) int local82 = local17 + 3 >= local15 ? -1 : Static169.method3032(arg0.charAt(local17 + 3));
			arg1[arg2++] = (byte) (local46 >>> 4 | local25 << 2);
			if (local67 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local46 & 0xF) << 4 | local67 >>> 2);
			if (local82 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local67 & 0x3) << 6 | local82);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZLclient!oh;B)V")
	public static void method3219(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub1 arg1) {
		if (Static571.anInt9281 >= 400) {
			return;
		}
		@Pc(14) Class264 local14 = arg1.aClass264_1;
		if (local14.anIntArray443 != null) {
			local14 = local14.method5994(Static491.aClass318_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean536) {
			return;
		}
		@Pc(32) String local32 = local14.aString63;
		if (local14.anInt7165 != 0) {
			@Pc(51) String local51 = Static121.aClass274_1 == Static473.aClass274_4 ? Static544.aClass343_34.method7222(Static256.anInt4535) : Static544.aClass343_32.method7222(Static256.anInt4535);
			local32 = local32 + Static14.method210(local14.anInt7165, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571) + " (" + local51 + local14.anInt7165 + ")";
		}
		if (Static369.aBoolean463 && !arg0) {
			@Pc(88) Class10 local88 = Static176.anInt3442 == -1 ? null : Static137.aClass124_1.method3255(Static176.anInt3442);
			if ((Static215.anInt3875 & 0x2) != 0 && (local88 == null || local14.method5995(local88.anInt193, Static176.anInt3442) != local88.anInt193)) {
				Static137.method2680(-1, 0, Static585.aString93 + " -> <col=ffff00>" + local32, (long) arg1.anInt9472, true, 16, Static16.aString4, false, Static288.anInt4931, 0);
			}
		}
		if (!arg0) {
			@Pc(142) String[] local142 = local14.aStringArray27;
			if (Static325.aBoolean400) {
				local142 = Static180.method3111(local142);
			}
			@Pc(152) int local152;
			if (local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && (local14.aByte83 == 0 || !local142[local152].equalsIgnoreCase(Static544.aClass343_27.method7222(Static256.anInt4535)))) {
						@Pc(172) byte local172 = 0;
						if (local152 == 0) {
							local172 = 20;
						}
						@Pc(181) int local181 = Static559.anInt9109;
						if (local152 == 1) {
							local172 = 18;
						}
						if (local152 == 2) {
							local172 = 48;
						}
						if (local152 == 3) {
							local172 = 13;
						}
						if (local14.anInt7162 == local152) {
							local181 = local14.anInt7151;
						}
						if (local152 == 4) {
							local172 = 6;
						}
						if (local152 == local14.anInt7135) {
							local181 = local14.anInt7159;
						}
						Static137.method2680(-1, 0, "<col=ffff00>" + local32, (long) arg1.anInt9472, true, local172, local142[local152], false, local142[local152].equalsIgnoreCase(Static544.aClass343_27.method7222(Static256.anInt4535)) ? local14.anInt7171 : local181, 0);
					}
				}
			}
			if (local14.aByte83 == 1 && local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && local142[local152].equalsIgnoreCase(Static544.aClass343_27.method7222(Static256.anInt4535))) {
						@Pc(293) short local293 = 0;
						if (local14.anInt7165 > Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9571) {
							local293 = 2000;
						}
						@Pc(302) short local302 = 0;
						if (local152 == 0) {
							local302 = 20;
						}
						if (local152 == 1) {
							local302 = 18;
						}
						if (local152 == 2) {
							local302 = 48;
						}
						if (local152 == 3) {
							local302 = 13;
						}
						if (local152 == 4) {
							local302 = 6;
						}
						if (local302 != 0) {
							local302 += local293;
						}
						Static137.method2680(-1, 0, "<col=ffff00>" + local32, (long) arg1.anInt9472, true, local302, local142[local152], false, local14.anInt7171, 0);
					}
				}
			}
		}
		Static137.method2680(-1, 0, "<col=ffff00>" + local32, (long) arg1.anInt9472, true, 1006, Static544.aClass343_26.method7222(Static256.anInt4535), arg0, Static417.anInt7072, 0);
	}
}
