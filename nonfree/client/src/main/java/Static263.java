import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[250][];

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBI)V")
	public static void method3719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local40);
		Static200.method2833(false, local40, true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;ZLjava/lang/String;ILjava/awt/Color;)V")
	public static void method3720(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static392.aCanvas5.getGraphics();
			if (Static317.aFont1 == null) {
				Static317.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static69.anInt1304, Static338.anInt5777);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static47.anImage1 == null) {
					Static47.anImage1 = Static392.aCanvas5.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static47.anImage1.getGraphics();
				local63.setColor(arg5);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg0);
				local63.fillRect(2, 2, arg4 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local63.setFont(Static317.aFont1);
				local63.setColor(arg1);
				local63.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local2.drawImage(Static47.anImage1, Static69.anInt1304 / 2 - 152, Static338.anInt5777 / 2 + -18, null);
			} catch (@Pc(142) Exception local142) {
				@Pc(148) int local148 = Static69.anInt1304 / 2 - 152;
				@Pc(154) int local154 = Static338.anInt5777 / 2 - 18;
				local2.setColor(arg5);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local148 + 2, local154 + 2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local148 + 1, local154 - -1, 301, 31);
				local2.fillRect(local148 + arg4 * 3 + 2, local154 + 2, 300 - arg4 * 3, 30);
				local2.setFont(Static317.aFont1);
				local2.setColor(arg1);
				local2.drawString(arg3, (304 - arg3.length() * 6) / 2 + local148, local154 + 22);
			}
			if (Static145.aString21 != null) {
				local2.setFont(Static317.aFont1);
				local2.setColor(arg1);
				local2.drawString(Static145.aString21, Static69.anInt1304 / 2 - Static145.aString21.length() * 6 / 2, Static338.anInt5777 / 2 + -26);
			}
		} catch (@Pc(262) Exception local262) {
			Static392.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIILclient!as;II)Z")
	public static boolean method3722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class14 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg7;
		@Pc(18) int local18 = arg5 - 64;
		Static77.anIntArrayArray22[64][64] = 99;
		@Pc(29) int local29 = arg7 - 64;
		Static88.anIntArrayArray24[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static2.anIntArray2[0] = arg5;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static149.anIntArray175[0] = arg7;
		@Pc(56) int[][] local56 = arg8.anIntArrayArray3;
		while (local43 != local46) {
			local9 = Static149.anIntArray175[local43];
			local7 = Static2.anIntArray2[local43];
			local43 = local43 + 1 & 0xFFF;
			@Pc(76) int local76 = local7 - local18;
			@Pc(81) int local81 = local9 - local29;
			@Pc(86) int local86 = local7 - arg8.anInt377;
			@Pc(92) int local92 = local9 - arg8.anInt374;
			if (arg1 == -4) {
				if (local7 == arg4 && arg9 == local9) {
					Static59.anInt1169 = local9;
					Static121.anInt2244 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static311.method4232(local9, local7, 2, arg6, arg2, 2, arg4, arg9)) {
					Static121.anInt2244 = local7;
					Static59.anInt1169 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg8.method272(local9, local7, arg9, 2, arg2, 2, arg0, arg4, arg6)) {
					Static121.anInt2244 = local7;
					Static59.anInt1169 = local9;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg8.method271(arg6, arg9, arg4, 2, local9, arg0, arg2, local7)) {
					Static121.anInt2244 = local7;
					Static59.anInt1169 = local9;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg8.method277(2, arg3, arg4, arg1, local9, arg9, local7)) {
					Static121.anInt2244 = local7;
					Static59.anInt1169 = local9;
					return true;
				}
			} else if (arg8.method278(arg1, local9, 2, arg4, arg9, arg3, local7)) {
				Static121.anInt2244 = local7;
				Static59.anInt1169 = local9;
				return true;
			}
			@Pc(248) int local248 = Static88.anIntArrayArray24[local76][local81] + 1;
			if (local76 > 0 && Static77.anIntArrayArray22[local76 - 1][local81] == 0 && (local56[local86 - 1][local92] & 0x43A40000) == 0 && (local56[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static2.anIntArray2[local46] = local7 - 1;
				Static149.anIntArray175[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local76 - 1][local81] = 2;
				Static88.anIntArrayArray24[local76 - 1][local81] = local248;
			}
			if (local76 < 126 && Static77.anIntArrayArray22[local76 + 1][local81] == 0 && (local56[local86 + 2][local92] & 0x60E40000) == 0 && (local56[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static2.anIntArray2[local46] = local7 + 1;
				Static149.anIntArray175[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local76 + 1][local81] = 8;
				Static88.anIntArrayArray24[local76 + 1][local81] = local248;
			}
			if (local81 > 0 && Static77.anIntArrayArray22[local76][local81 - 1] == 0 && (local56[local86][local92 - 1] & 0x43A40000) == 0 && (local56[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static2.anIntArray2[local46] = local7;
				Static149.anIntArray175[local46] = local9 - 1;
				Static77.anIntArrayArray22[local76][local81 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local76][local81 - 1] = local248;
			}
			if (local81 < 126 && Static77.anIntArrayArray22[local76][local81 + 1] == 0 && (local56[local86][local92 + 2] & 0x4E240000) == 0 && (local56[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static2.anIntArray2[local46] = local7;
				Static149.anIntArray175[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local76][local81 + 1] = 4;
				Static88.anIntArrayArray24[local76][local81 + 1] = local248;
			}
			if (local76 > 0 && local81 > 0 && Static77.anIntArrayArray22[local76 - 1][local81 - 1] == 0 && (local56[local86 - 1][local92] & 0x4FA40000) == 0 && (local56[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local86][local92 - 1] & 0x63E40000) == 0) {
				Static2.anIntArray2[local46] = local7 - 1;
				Static149.anIntArray175[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local76 - 1][local81 - 1] = 3;
				Static88.anIntArrayArray24[local76 - 1][local81 - 1] = local248;
			}
			if (local76 < 126 && local81 > 0 && Static77.anIntArrayArray22[local76 + 1][local81 - 1] == 0 && (local56[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local56[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local56[local86 + 2][local92] & 0x78E40000) == 0) {
				Static2.anIntArray2[local46] = local7 + 1;
				Static149.anIntArray175[local46] = local9 - 1;
				Static77.anIntArrayArray22[local76 + 1][local81 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local76 + 1][local81 - 1] = local248;
			}
			if (local76 > 0 && local81 < 126 && Static77.anIntArrayArray22[local76 - 1][local81 + 1] == 0 && (local56[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local56[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local56[local86][local92 + 2] & 0x7E240000) == 0) {
				Static2.anIntArray2[local46] = local7 - 1;
				Static149.anIntArray175[local46] = local9 + 1;
				Static77.anIntArrayArray22[local76 - 1][local81 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray24[local76 - 1][local81 + 1] = local248;
			}
			if (local76 < 126 && local81 < 126 && Static77.anIntArrayArray22[local76 + 1][local81 + 1] == 0 && (local56[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local56[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local56[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static2.anIntArray2[local46] = local7 + 1;
				Static149.anIntArray175[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static77.anIntArrayArray22[local76 + 1][local81 + 1] = 12;
				Static88.anIntArrayArray24[local76 + 1][local81 + 1] = local248;
			}
		}
		Static121.anInt2244 = local7;
		Static59.anInt1169 = local9;
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method3723() {
		if (Static90.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static335.anInt5705;
		@Pc(10) int local10 = Static51.anInt869;
		@Pc(17) int local17 = Static187.anInt3236 - Static69.anInt1304 - local8;
		@Pc(32) int local32 = Static285.anInt5014 - Static338.anInt5777 - local10;
		if (local8 <= 0 && local17 <= 0 && local10 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(48) Container local48;
			if (Static411.aFrame2 == null) {
				local48 = Static183.aClass83_2.anApplet1;
			} else {
				local48 = Static411.aFrame2;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (Static411.aFrame2 == local48) {
				@Pc(62) Insets local62 = Static411.aFrame2.getInsets();
				local54 = local62.left;
				local56 = local62.top;
			}
			@Pc(71) Graphics local71 = local48.getGraphics();
			local71.setColor(Color.black);
			if (local8 > 0) {
				local71.fillRect(local54, local56, local8, Static285.anInt5014);
			}
			if (local10 > 0) {
				local71.fillRect(local54, local56, Static187.anInt3236, local10);
			}
			if (local17 > 0) {
				local71.fillRect(local54 + Static187.anInt3236 - local17, local56, local17, Static285.anInt5014);
			}
			if (local32 > 0) {
				local71.fillRect(local54, Static285.anInt5014 + local56 - local32, Static187.anInt3236, local32);
				return;
			}
		} catch (@Pc(126) Exception local126) {
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)V")
	public static void method3724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 1);
		local8.method2661();
		local8.anInt3213 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
	public static void method3725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static453.aClass136_Sub1_1.anInt4444 * arg1 >> 8;
		if (local10 != 0 && arg2 != -1) {
			Static322.method4324(arg2, Static409.aClass82_93, local10);
			Static328.aBoolean637 = true;
		}
	}
}
