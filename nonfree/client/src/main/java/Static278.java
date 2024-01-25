import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "[Lclient!ck;")
	public static Class12[] aClass12Array3;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
	public static boolean aBoolean473 = true;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;)V")
	public static void method4959(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static235.aCanvas6.getGraphics();
			if (Static110.aFont1 == null) {
				Static110.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static26.anInt476, Static321.anInt6388);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static79.anImage43 == null) {
					Static79.anImage43 = Static235.aCanvas6.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static79.anImage43.getGraphics();
				local59.setColor(arg2);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg5);
				local59.fillRect(2, 2, arg0 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local59.setFont(Static110.aFont1);
				local59.setColor(arg3);
				local59.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
				local2.drawImage(Static79.anImage43, Static26.anInt476 / 2 - 152, Static321.anInt6388 / 2 + -18, null);
			} catch (@Pc(138) Exception local138) {
				@Pc(144) int local144 = Static26.anInt476 / 2 - 152;
				@Pc(150) int local150 = Static321.anInt6388 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg5);
				local2.fillRect(local144 + 2, local150 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local144 + 1, local150 - -1, 301, 31);
				local2.fillRect(local144 + arg0 * 3 + 2, local150 - -2, 300 - arg0 * 3, 30);
				local2.setFont(Static110.aFont1);
				local2.setColor(arg3);
				local2.drawString(arg1, local144 + (304 - arg1.length() * 6) / 2, local150 + 22);
			}
			if (Static281.aString222 != null) {
				local2.setFont(Static110.aFont1);
				local2.setColor(arg3);
				local2.drawString(Static281.aString222, Static26.anInt476 / 2 - Static281.aString222.length() * 6 / 2, Static321.anInt6388 / 2 + -26);
			}
		} catch (@Pc(257) Exception local257) {
			Static235.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIILclient!ba;I)Z")
	public static boolean method4960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class17 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg4;
		@Pc(23) int local23 = arg7 - 64;
		Static131.anIntArrayArray25[64][64] = 99;
		@Pc(34) int local34 = arg4 - 64;
		Static257.anIntArrayArray41[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static222.anIntArray437[0] = arg7;
		@Pc(51) int local51 = local42 + 1;
		Static121.anIntArray392[0] = arg4;
		@Pc(56) int[][] local56 = arg8.anIntArrayArray5;
		while (local44 != local51) {
			local9 = Static121.anIntArray392[local44];
			local7 = Static222.anIntArray437[local44];
			@Pc(71) int local71 = local7 - arg8.anInt365;
			local44 = local44 + 1 & 0xFFF;
			@Pc(82) int local82 = local7 - local23;
			@Pc(87) int local87 = local9 - local34;
			@Pc(93) int local93 = local9 - arg8.anInt370;
			if (arg3 == -4) {
				if (local7 == arg6 && arg9 == local9) {
					Static315.anInt6285 = local7;
					Static100.anInt1936 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static12.method187(arg6, arg9, arg2, local7, 1, 1, arg1, local9)) {
					Static100.anInt1936 = local9;
					Static315.anInt6285 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg8.method323(1, arg2, arg0, arg9, arg6, 1, local7, local9, arg1)) {
					Static315.anInt6285 = local7;
					Static100.anInt1936 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg8.method337(arg0, 1, local7, local9, arg1, arg6, arg9, arg2)) {
					Static315.anInt6285 = local7;
					Static100.anInt1936 = local9;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg8.method340(arg9, arg3, arg5, 1, arg6, local7, local9)) {
					Static100.anInt1936 = local9;
					Static315.anInt6285 = local7;
					return true;
				}
			} else if (arg8.method329(local9, 1, arg5, arg9, local7, arg6, arg3)) {
				Static100.anInt1936 = local9;
				Static315.anInt6285 = local7;
				return true;
			}
			@Pc(250) int local250 = Static257.anIntArrayArray41[local82][local87] + 1;
			if (local82 > 0 && Static131.anIntArrayArray25[local82 - 1][local87] == 0 && (local56[local71 - 1][local93] & 0x42240000) == 0) {
				Static222.anIntArray437[local51] = local7 - 1;
				Static121.anIntArray392[local51] = local9;
				Static131.anIntArrayArray25[local82 - 1][local87] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local82 - 1][local87] = local250;
			}
			if (local82 < 127 && Static131.anIntArrayArray25[local82 + 1][local87] == 0 && (local56[local71 + 1][local93] & 0x60240000) == 0) {
				Static222.anIntArray437[local51] = local7 + 1;
				Static121.anIntArray392[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local82 + 1][local87] = 8;
				Static257.anIntArrayArray41[local82 + 1][local87] = local250;
			}
			if (local87 > 0 && Static131.anIntArrayArray25[local82][local87 - 1] == 0 && (local56[local71][local93 - 1] & 0x40A40000) == 0) {
				Static222.anIntArray437[local51] = local7;
				Static121.anIntArray392[local51] = local9 - 1;
				Static131.anIntArrayArray25[local82][local87 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local82][local87 - 1] = local250;
			}
			if (local87 < 127 && Static131.anIntArrayArray25[local82][local87 + 1] == 0 && (local56[local71][local93 + 1] & 0x48240000) == 0) {
				Static222.anIntArray437[local51] = local7;
				Static121.anIntArray392[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local82][local87 + 1] = 4;
				Static257.anIntArrayArray41[local82][local87 + 1] = local250;
			}
			if (local82 > 0 && local87 > 0 && Static131.anIntArrayArray25[local82 - 1][local87 - 1] == 0 && (local56[local71 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local71 - 1][local93] & 0x42240000) == 0 && (local56[local71][local93 - 1] & 0x40A40000) == 0) {
				Static222.anIntArray437[local51] = local7 - 1;
				Static121.anIntArray392[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local82 - 1][local87 - 1] = 3;
				Static257.anIntArrayArray41[local82 - 1][local87 - 1] = local250;
			}
			if (local82 < 127 && local87 > 0 && Static131.anIntArrayArray25[local82 + 1][local87 - 1] == 0 && (local56[local71 + 1][local93 - 1] & 0x60E40000) == 0 && (local56[local71 + 1][local93] & 0x60240000) == 0 && (local56[local71][local93 - 1] & 0x40A40000) == 0) {
				Static222.anIntArray437[local51] = local7 + 1;
				Static121.anIntArray392[local51] = local9 - 1;
				Static131.anIntArrayArray25[local82 + 1][local87 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local82 + 1][local87 - 1] = local250;
			}
			if (local82 > 0 && local87 < 127 && Static131.anIntArrayArray25[local82 - 1][local87 + 1] == 0 && (local56[local71 - 1][local93 + 1] & 0x4E240000) == 0 && (local56[local71 - 1][local93] & 0x42240000) == 0 && (local56[local71][local93 + 1] & 0x48240000) == 0) {
				Static222.anIntArray437[local51] = local7 - 1;
				Static121.anIntArray392[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local82 - 1][local87 + 1] = 6;
				Static257.anIntArrayArray41[local82 - 1][local87 + 1] = local250;
			}
			if (local82 < 127 && local87 < 127 && Static131.anIntArrayArray25[local82 + 1][local87 + 1] == 0 && (local56[local71 + 1][local93 + 1] & 0x78240000) == 0 && (local56[local71 + 1][local93] & 0x60240000) == 0 && (local56[local71][local93 + 1] & 0x48240000) == 0) {
				Static222.anIntArray437[local51] = local7 + 1;
				Static121.anIntArray392[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static131.anIntArrayArray25[local82 + 1][local87 + 1] = 12;
				Static257.anIntArrayArray41[local82 + 1][local87 + 1] = local250;
			}
		}
		Static100.anInt1936 = local9;
		Static315.anInt6285 = local7;
		return false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjava/awt/Frame;Lclient!wd;)V")
	public static void method4962(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class215 arg1) {
		while (true) {
			@Pc(10) Class193 local10 = arg1.method5658(arg0);
			while (local10.anInt5986 == 0) {
				Static163.method2863(10L);
			}
			if (local10.anInt5986 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static163.method2863(100L);
		}
	}
}
