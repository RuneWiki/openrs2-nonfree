import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array6;

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "Lclient!je;")
	public static Class124 aClass124_4;

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_75 = new Class96(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "[I")
	public static final int[] anIntArray361 = new int[8];

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;ZLjava/lang/String;ILjava/awt/Color;)V")
	public static void method3776(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static159.aCanvas3.getGraphics();
			if (Static240.aFont1 == null) {
				Static240.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static403.anInt7142, Static324.anInt5725);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static47.anImage1 == null) {
					Static47.anImage1 = Static159.aCanvas3.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static47.anImage1.getGraphics();
				local63.setColor(arg0);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg5);
				local63.fillRect(2, 2, arg1 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local63.setFont(Static240.aFont1);
				local63.setColor(arg2);
				local63.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static47.anImage1, Static403.anInt7142 / 2 - 152, Static324.anInt5725 / 2 + -18, null);
			} catch (@Pc(144) Exception local144) {
				@Pc(150) int local150 = Static403.anInt7142 / 2 - 152;
				@Pc(156) int local156 = Static324.anInt5725 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg5);
				local6.fillRect(local150 + 2, local156 - -2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local150 + 1, local156 + 1, 301, 31);
				local6.fillRect(local150 + arg1 * 3 + 2, local156 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static240.aFont1);
				local6.setColor(arg2);
				local6.drawString(arg4, (304 - arg4.length() * 6) / 2 + local150, local156 + 22);
			}
			if (Static90.aString32 != null) {
				local6.setFont(Static240.aFont1);
				local6.setColor(arg2);
				local6.drawString(Static90.aString32, Static403.anInt7142 / 2 - Static90.aString32.length() * 6 / 2, Static324.anInt5725 / 2 + -26);
			}
		} catch (@Pc(264) Exception local264) {
			Static159.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[IIIIZIIIII[IILclient!oe;)I")
	public static int method3778(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class181 arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static210.anIntArrayArray24[local3][local7] = 0;
				Static81.anIntArrayArray7[local3][local7] = 99999999;
			}
		}
		@Pc(60) boolean local60;
		if (arg9 == 1) {
			local60 = Static236.method3451(arg4, arg3, arg0, arg13, arg8, arg7, arg12, arg10, arg6, arg2);
		} else if (arg9 == 2) {
			local60 = Static312.method4272(arg3, arg4, arg0, arg6, arg10, arg2, arg7, arg13, arg8, arg12);
		} else {
			local60 = Static454.method5998(arg10, arg7, arg9, arg12, arg4, arg2, arg6, arg0, arg13, arg3, arg8);
		}
		@Pc(94) int local94 = arg12 - 64;
		@Pc(98) int local98 = arg3 - 64;
		@Pc(100) int local100 = Static148.anInt7258;
		@Pc(102) int local102 = Static135.anInt2444;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local60) {
			if (!arg5) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg6 - 10; local119 <= arg6 + 10; local119++) {
				for (@Pc(126) int local126 = arg7 - 10; local126 <= arg7 + 10; local126++) {
					@Pc(133) int local133 = local119 - local94;
					@Pc(138) int local138 = local126 - local98;
					if (local133 >= 0 && local138 >= 0 && local133 < 128 && local138 < 128 && Static81.anIntArrayArray7[local133][local138] < 100) {
						@Pc(163) int local163 = 0;
						if (arg6 > local119) {
							local163 = arg6 - local119;
						} else if (arg6 + arg10 - 1 < local119) {
							local163 = local119 + 1 - arg6 - arg10;
						}
						@Pc(195) int local195 = 0;
						if (arg7 > local126) {
							local195 = arg7 - local126;
						} else if (local126 > arg7 + arg0 - 1) {
							local195 = local126 + 1 - arg7 - arg0;
						}
						@Pc(228) int local228 = local163 * local163 + local195 * local195;
						if (local228 < local110 || local110 == local228 && Static81.anIntArrayArray7[local133][local138] < local112) {
							local112 = Static81.anIntArrayArray7[local133][local138];
							local102 = local126;
							local110 = local228;
							local100 = local119;
						}
					}
				}
			}
			if (local110 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg12 == local100 && arg3 == local102) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static355.anIntArray476[0] = local100;
		local110 = local297 + 1;
		Static366.anIntArray494[0] = local102;
		@Pc(318) int local318;
		local112 = local318 = Static210.anIntArrayArray24[local100 - local94][local102 - local98];
		while (local100 != arg12 || local102 != arg3) {
			if (local318 != local112) {
				Static355.anIntArray476[local110] = local100;
				local318 = local112;
				Static366.anIntArray494[local110++] = local102;
			}
			if ((local112 & 0x1) != 0) {
				local102++;
			} else if ((local112 & 0x4) != 0) {
				local102--;
			}
			if ((local112 & 0x2) != 0) {
				local100++;
			} else if ((local112 & 0x8) != 0) {
				local100--;
			}
			local112 = Static210.anIntArrayArray24[local100 - local94][local102 - local98];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg11[local119] = Static355.anIntArray476[local110];
			arg1[local119++] = Static366.anIntArray494[local110];
			if (arg11.length <= local119) {
				break;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I")
	public static int method3780(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
