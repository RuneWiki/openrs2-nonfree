import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
	public static int anInt6482;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	public static int anInt6483;

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
	public static int anInt6489;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "Lclient!hq;")
	public static Class94 aClass94_32;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_37 = new Class74();

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[5];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!pe;B)V")
	public static void method5538(@OriginalArg(0) Class89 arg0) {
		if (Static274.aBoolean403) {
			Static245.method4230(arg0);
		} else {
			Static79.method1631(arg0);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)V")
	public static void method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class22_Sub5 local13 = local7.aClass22_Sub5_2;
		@Pc(16) Class22_Sub5 local16 = local7.aClass22_Sub5_1;
		if (local13 != null) {
			local13.anInt6347 = local13.anInt6347 * arg3 / 16;
			local13.anInt6339 = local13.anInt6339 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt6347 = local16.anInt6347 * arg3 / 16;
			local16.anInt6339 = local16.anInt6339 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIII)I")
	public static int method5540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static331.aClass8Array5 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || Static15.anInt287 - 1 < local11 || local15 > Static325.anInt6173 - 1) {
			return 0;
		}
		@Pc(40) int local40 = arg0;
		if (arg0 < 3 && (Static92.aByteArrayArrayArray3[1][local11][local15] & 0x2) != 0) {
			local40 = arg0 + 1;
		}
		return Static331.aClass8Array5[local40].method4169(arg2, arg1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)V")
	public static void method5541(@OriginalArg(0) boolean arg0) {
		Static85.method1787(arg0, Static128.anInt2823, Static161.anInt3337, Static214.anInt4266);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!qo;I)V")
	public static void method5543(@OriginalArg(0) Class22_Sub2_Sub1_Sub2 arg0) {
		if (Static33.anInt735 >= 400) {
			return;
		}
		@Pc(12) Class174 local12 = arg0.aClass174_1;
		if (local12.anIntArray670 != null) {
			local12 = local12.method4438();
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean384) {
			return;
		}
		@Pc(33) String local33 = local12.aString328;
		if (local12.anInt5205 != 0) {
			@Pc(43) String local43 = Static345.anInt6530 == 1 ? Static304.aString376 : Static289.aString162;
			local33 = local33 + Static81.method1750(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020, local12.anInt5205) + " (" + local43 + local12.anInt5205 + ")";
		}
		if (Static127.anInt2799 == 1) {
			Static198.method3544(0, Static232.anInt4617, Static256.aString313, (long) arg0.anInt5115, Static205.aString266 + " -> <col=ffff00>" + local33, 11, 0);
		} else if (Static253.aBoolean361) {
			@Pc(107) Class7_Sub1_Sub2 local107 = Static88.anInt3954 == -1 ? null : Static113.method2182(Static88.anInt3954);
			if ((Static72.anInt1772 & 0x2) != 0) {
				if (local107 == null || local12.method4439(Static88.anInt3954, local107.anInt267) != local107.anInt267) {
					Static198.method3544(0, Static301.anInt5782, Static85.aString150, (long) arg0.anInt5115, Static277.aString348 + " -> <col=ffff00>" + local33, 32, 0);
				}
				return;
			}
		} else {
			@Pc(154) String[] local154 = local12.aStringArray44;
			if (Static352.aBoolean483) {
				local154 = Static16.method2748(local154);
			}
			@Pc(164) int local164;
			if (local154 != null) {
				for (local164 = 4; local164 >= 0; local164--) {
					if (local154[local164] != null && (Static345.anInt6530 != 0 || !local154[local164].equalsIgnoreCase(Static161.aString221))) {
						@Pc(183) byte local183 = 0;
						if (local164 == 0) {
							local183 = 41;
						}
						@Pc(192) int local192 = Static56.anInt1465;
						if (local164 == 1) {
							local183 = 35;
						}
						if (local164 == 2) {
							local183 = 7;
						}
						if (local164 == 3) {
							local183 = 22;
						}
						if (local164 == 4) {
							local183 = 23;
						}
						if (local164 == local12.anInt5212) {
							local192 = local12.anInt5190;
						}
						if (local12.anInt5187 == local164) {
							local192 = local12.anInt5210;
						}
						Static198.method3544(0, local192, local154[local164], (long) arg0.anInt5115, "<col=ffff00>" + local33, local183, 0);
					}
				}
			}
			if (Static345.anInt6530 == 0 && local154 != null) {
				for (local164 = 4; local164 >= 0; local164--) {
					if (local154[local164] != null && local154[local164].equalsIgnoreCase(Static161.aString221)) {
						@Pc(285) short local285 = 0;
						if (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020 < local12.anInt5205) {
							local285 = 2000;
						}
						@Pc(294) short local294 = 0;
						if (local164 == 0) {
							local294 = 41;
						}
						if (local164 == 1) {
							local294 = 35;
						}
						if (local164 == 2) {
							local294 = 7;
						}
						if (local164 == 3) {
							local294 = 22;
						}
						if (local164 == 4) {
							local294 = 23;
						}
						if (local294 != 0) {
							local294 += local285;
						}
						Static198.method3544(0, local12.anInt5186, local154[local164], (long) arg0.anInt5115, "<col=ffff00>" + local33, local294, 0);
					}
				}
			}
			Static198.method3544(0, Static227.anInt6306, Static98.aString90, (long) arg0.anInt5115, "<col=ffff00>" + local33, 1008, 0);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;IZLjava/awt/Color;Ljava/awt/Color;I)V")
	public static void method5544(@OriginalArg(0) Color arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Color arg4, @OriginalArg(5) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static269.aCanvas4.getGraphics();
			if (Static6.aFont1 == null) {
				Static6.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static128.anInt2823, Static214.anInt4266);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static89.anImage1 == null) {
					Static89.anImage1 = Static269.aCanvas4.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static89.anImage1.getGraphics();
				local59.setColor(arg5);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg4);
				local59.fillRect(2, 2, arg2 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local59.setFont(Static6.aFont1);
				local59.setColor(arg0);
				local59.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
				local2.drawImage(Static89.anImage1, Static128.anInt2823 / 2 - 152, Static214.anInt4266 / 2 - 18, null);
			} catch (@Pc(140) Exception local140) {
				@Pc(146) int local146 = Static128.anInt2823 / 2 - 152;
				@Pc(152) int local152 = Static214.anInt4266 / 2 - 18;
				local2.setColor(arg5);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local146 + 2, local152 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local146 + 1, local152 - -1, 301, 31);
				local2.fillRect(local146 + arg2 * 3 + 2, local152 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static6.aFont1);
				local2.setColor(arg0);
				local2.drawString(arg1, local146 + (304 - arg1.length() * 6) / 2, local152 + 22);
			}
			if (Static286.aString355 != null) {
				local2.setFont(Static6.aFont1);
				local2.setColor(arg0);
				local2.drawString(Static286.aString355, Static128.anInt2823 / 2 - Static286.aString355.length() * 6 / 2, Static214.anInt4266 / 2 + -26);
			}
		} catch (@Pc(261) Exception local261) {
			Static269.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
	public static int method5545(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(15) int local15 = arg2.length();
		@Pc(18) int local18 = arg0.length();
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) char local24 = 0;
		@Pc(26) char local26 = 0;
		while (local20 - local24 < local15 || local18 > local22 - local26) {
			if (local15 <= local20 - local24) {
				return -1;
			}
			if (local22 - local26 >= local18) {
				return 1;
			}
			@Pc(64) char local64;
			if (local24 == '\u0000') {
				local64 = arg2.charAt(local20++);
			} else {
				local64 = local24;
			}
			@Pc(76) char local76;
			if (local26 == '\u0000') {
				local76 = arg0.charAt(local22++);
			} else {
				local76 = local26;
			}
			local24 = Static49.method1085(local64);
			local26 = Static49.method1085(local76);
			local64 = Static55.method1162(arg1, local64);
			local76 = Static55.method1162(arg1, local76);
			if (local76 != local64 && Character.toUpperCase(local64) != Character.toUpperCase(local76)) {
				local64 = Character.toLowerCase(local64);
				local76 = Character.toLowerCase(local76);
				if (local76 != local64) {
					return Static244.method4212(local64, arg1) - Static244.method4212(local76, arg1);
				}
			}
		}
		@Pc(137) int local137 = Math.min(local15, local18);
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			if (arg1 == 2) {
				local22 = local18 - local139 - 1;
				local20 = local15 - local139 - 1;
			} else {
				local22 = local139;
				local20 = local139;
			}
			@Pc(168) char local168 = arg2.charAt(local20);
			@Pc(172) char local172 = arg0.charAt(local22);
			if (local168 != local172 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local172 != local168) {
					return Static244.method4212(local168, arg1) - Static244.method4212(local172, arg1);
				}
			}
		}
		@Pc(217) int local217 = local15 - local18;
		if (local217 != 0) {
			return local217;
		}
		for (@Pc(226) int local226 = 0; local226 < local137; local226++) {
			@Pc(231) char local231 = arg2.charAt(local226);
			@Pc(235) char local235 = arg0.charAt(local226);
			if (local231 != local235) {
				return Static244.method4212(local231, arg1) - Static244.method4212(local235, arg1);
			}
		}
		return 0;
	}
}
