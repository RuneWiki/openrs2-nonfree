import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "Lclient!ah;")
	public static Class7 aClass7_7;

	@OriginalMember(owner = "client!bc", name = "eb", descriptor = "Lclient!oc;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
	public static int anInt409;

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array2 = new Class28[100];

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
	public static int anInt410 = 0;

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
	public static int anInt411 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIILclient!dg;IBI)V")
	public static void method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class21 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static179.aBoolean202 && (Static157.aByteArrayArrayArray41[0][arg1][arg0] & 0x2) == 0) {
			if ((Static157.aByteArrayArrayArray41[arg6][arg1][arg0] & 0x10) != 0) {
				return;
			}
			if (Static21.method593(arg0, arg6, arg1) != Static93.anInt2605) {
				return;
			}
		}
		if (Static170.anInt4097 > arg6) {
			Static170.anInt4097 = arg6;
		}
		@Pc(59) Class3_Sub2_Sub18 local59 = Static86.method1991(arg3);
		@Pc(75) int local75;
		@Pc(72) int local72;
		if (arg2 == 1 || arg2 == 3) {
			local75 = local59.anInt4226;
			local72 = local59.anInt4242;
		} else {
			local72 = local59.anInt4226;
			local75 = local59.anInt4242;
		}
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (local75 + arg1 > 104) {
			local89 = arg1;
			local93 = arg1 + 1;
		} else {
			local89 = (local75 >> 1) + arg1;
			local93 = (local75 + 1 >> 1) + arg1;
		}
		@Pc(128) int local128;
		@Pc(121) int local121;
		if (local72 + arg0 <= 104) {
			local121 = (local72 + 1 >> 1) + arg0;
			local128 = arg0 + (local72 >> 1);
		} else {
			local121 = arg0 + 1;
			local128 = arg0;
		}
		@Pc(139) int[][] local139 = Static90.anIntArrayArrayArray31[arg6];
		@Pc(147) int local147 = (arg1 << 7) + (local75 << 6);
		@Pc(174) int local174 = local139[local93][local121] + local139[local89][local128] + local139[local93][local128] + local139[local89][local121] >> 2;
		@Pc(182) int local182 = (arg0 << 7) + (local72 << 6);
		@Pc(199) long local199 = (long) (arg2 << 20 | arg5 << 14 | arg0 << 7 | arg1 | 0x40000000);
		if (local59.anInt4208 == 0) {
			local199 |= Long.MIN_VALUE;
		}
		if (local59.anInt4209 == 1) {
			local199 |= 0x400000L;
		}
		local199 |= (long) arg3 << 32;
		if (local59.method3183()) {
			Static113.method2279(arg0, local59, arg1, arg2, arg6);
		}
		@Pc(277) Class3_Sub2_Sub1 local277;
		if (arg5 != 22) {
			@Pc(368) int local368;
			if (arg5 == 10 || arg5 == 11) {
				if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
					local277 = local59.method3181(local182, local147, 10, local139, local174, arg2);
				} else {
					local277 = new Class3_Sub2_Sub1_Sub5(arg3, 10, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
				}
				if (local277 != null && Static90.method2047(arg6, arg1, arg0, local174, local75, local72, local277, arg5 == 11 ? 256 : 0, local199) && local59.aBoolean199) {
					local368 = 15;
					if (local277 instanceof Class3_Sub2_Sub1_Sub1) {
						local368 = ((Class3_Sub2_Sub1_Sub1) local277).method200() / 4;
						if (local368 > 30) {
							local368 = 30;
						}
					}
					for (@Pc(386) int local386 = 0; local386 <= local75; local386++) {
						for (@Pc(389) int local389 = 0; local389 <= local72; local389++) {
							if (Static172.aByteArrayArrayArray45[arg6][local386 + arg1][arg0 + local389] < local368) {
								Static172.aByteArrayArrayArray45[arg6][arg1 + local386][arg0 + local389] = (byte) local368;
							}
						}
					}
				}
				if (local59.anInt4236 != 0 && arg4 != null) {
					arg4.method800(arg0, local75, arg1, local59.aBoolean196, local72);
				}
			} else if (arg5 >= 12) {
				if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
					local277 = local59.method3181(local182, local147, arg5, local139, local174, arg2);
				} else {
					local277 = new Class3_Sub2_Sub1_Sub5(arg3, arg5, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
				}
				Static90.method2047(arg6, arg1, arg0, local174, 1, 1, local277, 0, local199);
				if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg6 > 0) {
					Static128.anIntArrayArrayArray36[arg6][arg1][arg0] |= 0x924;
				}
				if (local59.anInt4236 != 0 && arg4 != null) {
					arg4.method800(arg0, local75, arg1, local59.aBoolean196, local72);
				}
			} else if (arg5 == 0) {
				if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
					local277 = local59.method3181(local182, local147, 0, local139, local174, arg2);
				} else {
					local277 = new Class3_Sub2_Sub1_Sub5(arg3, 0, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
				}
				Static167.method3092(arg6, arg1, arg0, local174, local277, null, Static112.anIntArray503[arg2], 0, local199);
				if (arg2 == 0) {
					if (local59.aBoolean199) {
						Static172.aByteArrayArrayArray45[arg6][arg1][arg0] = 50;
						Static172.aByteArrayArrayArray45[arg6][arg1][arg0 + 1] = 50;
					}
					if (local59.aBoolean195) {
						Static128.anIntArrayArrayArray36[arg6][arg1][arg0] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local59.aBoolean199) {
						Static172.aByteArrayArrayArray45[arg6][arg1][arg0 + 1] = 50;
						Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0 + 1] = 50;
					}
					if (local59.aBoolean195) {
						Static128.anIntArrayArrayArray36[arg6][arg1][arg0 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local59.aBoolean199) {
						Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0] = 50;
						Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0 + 1] = 50;
					}
					if (local59.aBoolean195) {
						Static128.anIntArrayArrayArray36[arg6][arg1 + 1][arg0] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local59.aBoolean199) {
						Static172.aByteArrayArrayArray45[arg6][arg1][arg0] = 50;
						Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0] = 50;
					}
					if (local59.aBoolean195) {
						Static128.anIntArrayArrayArray36[arg6][arg1][arg0] |= 0x492;
					}
				}
				if (local59.anInt4236 != 0 && arg4 != null) {
					arg4.method804(arg0, arg2, arg5, arg1, local59.aBoolean196);
				}
				if (local59.anInt4239 != 16) {
					Static76.method1735(arg6, arg1, arg0, local59.anInt4239);
				}
			} else if (arg5 == 1) {
				if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
					local277 = local59.method3181(local182, local147, 1, local139, local174, arg2);
				} else {
					local277 = new Class3_Sub2_Sub1_Sub5(arg3, 1, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
				}
				Static167.method3092(arg6, arg1, arg0, local174, local277, null, Static135.anIntArray590[arg2], 0, local199);
				if (local59.aBoolean199) {
					if (arg2 == 0) {
						Static172.aByteArrayArrayArray45[arg6][arg1][arg0 + 1] = 50;
					} else if (arg2 == 1) {
						Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0 + 1] = 50;
					} else if (arg2 == 2) {
						Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0] = 50;
					} else if (arg2 == 3) {
						Static172.aByteArrayArrayArray45[arg6][arg1][arg0] = 50;
					}
				}
				if (local59.anInt4236 != 0 && arg4 != null) {
					arg4.method804(arg0, arg2, arg5, arg1, local59.aBoolean196);
				}
			} else {
				@Pc(953) int local953;
				if (arg5 == 2) {
					local953 = arg2 + 1 & 0x3;
					@Pc(982) Class3_Sub2_Sub1 local982;
					@Pc(972) Class3_Sub2_Sub1 local972;
					if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
						local972 = local59.method3181(local182, local147, 2, local139, local174, arg2 + 4);
						local982 = local59.method3181(local182, local147, 2, local139, local174, local953);
					} else {
						local972 = new Class3_Sub2_Sub1_Sub5(arg3, 2, arg2 + 4, arg6, arg1, arg0, local59.anInt4221, true, null);
						local982 = new Class3_Sub2_Sub1_Sub5(arg3, 2, local953, arg6, arg1, arg0, local59.anInt4221, true, null);
					}
					Static167.method3092(arg6, arg1, arg0, local174, local972, local982, Static112.anIntArray503[arg2], Static112.anIntArray503[local953], local199);
					if (local59.aBoolean195) {
						if (arg2 == 0) {
							Static128.anIntArrayArrayArray36[arg6][arg1][arg0] |= 0x249;
							Static128.anIntArrayArrayArray36[arg6][arg1][arg0 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static128.anIntArrayArrayArray36[arg6][arg1][arg0 + 1] |= 0x492;
							Static128.anIntArrayArrayArray36[arg6][arg1 + 1][arg0] |= 0x249;
						} else if (arg2 == 2) {
							Static128.anIntArrayArrayArray36[arg6][arg1 + 1][arg0] |= 0x249;
							Static128.anIntArrayArrayArray36[arg6][arg1][arg0] |= 0x492;
						} else if (arg2 == 3) {
							Static128.anIntArrayArrayArray36[arg6][arg1][arg0] |= 0x492;
							Static128.anIntArrayArrayArray36[arg6][arg1][arg0] |= 0x249;
						}
					}
					if (local59.anInt4236 != 0 && arg4 != null) {
						arg4.method804(arg0, arg2, arg5, arg1, local59.aBoolean196);
					}
					if (local59.anInt4239 != 16) {
						Static76.method1735(arg6, arg1, arg0, local59.anInt4239);
					}
				} else if (arg5 == 3) {
					if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
						local277 = local59.method3181(local182, local147, 3, local139, local174, arg2);
					} else {
						local277 = new Class3_Sub2_Sub1_Sub5(arg3, 3, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
					}
					Static167.method3092(arg6, arg1, arg0, local174, local277, null, Static135.anIntArray590[arg2], 0, local199);
					if (local59.aBoolean199) {
						if (arg2 == 0) {
							Static172.aByteArrayArrayArray45[arg6][arg1][arg0 + 1] = 50;
						} else if (arg2 == 1) {
							Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0 + 1] = 50;
						} else if (arg2 == 2) {
							Static172.aByteArrayArrayArray45[arg6][arg1 + 1][arg0] = 50;
						} else if (arg2 == 3) {
							Static172.aByteArrayArrayArray45[arg6][arg1][arg0] = 50;
						}
					}
					if (local59.anInt4236 != 0 && arg4 != null) {
						arg4.method804(arg0, arg2, arg5, arg1, local59.aBoolean196);
					}
				} else if (arg5 == 9) {
					if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
						local277 = local59.method3181(local182, local147, arg5, local139, local174, arg2);
					} else {
						local277 = new Class3_Sub2_Sub1_Sub5(arg3, arg5, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
					}
					Static90.method2047(arg6, arg1, arg0, local174, 1, 1, local277, 0, local199);
					if (local59.anInt4236 != 0 && arg4 != null) {
						arg4.method800(arg0, local75, arg1, local59.aBoolean196, local72);
					}
					if (local59.anInt4239 != 16) {
						Static76.method1735(arg6, arg1, arg0, local59.anInt4239);
					}
				} else if (arg5 == 4) {
					if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
						local277 = local59.method3181(local182, local147, 4, local139, local174, arg2);
					} else {
						local277 = new Class3_Sub2_Sub1_Sub5(arg3, 4, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
					}
					Static104.method2131(arg6, arg1, arg0, local174, local277, null, Static112.anIntArray503[arg2], 0, 0, 0, local199);
				} else {
					@Pc(1487) long local1487;
					@Pc(1523) Class3_Sub2_Sub1 local1523;
					if (arg5 == 5) {
						local1487 = Static80.method2760(arg6, arg1, arg0);
						local953 = 16;
						if (local1487 != 0L) {
							local953 = Static86.method1991(Integer.MAX_VALUE & (int) (local1487 >>> 32)).anInt4239;
						}
						if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
							local1523 = local59.method3181(local182, local147, 4, local139, local174, arg2);
						} else {
							local1523 = new Class3_Sub2_Sub1_Sub5(arg3, 4, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
						}
						Static104.method2131(arg6, arg1, arg0, local174, local1523, null, Static112.anIntArray503[arg2], 0, Static102.anIntArray467[arg2] * local953, local953 * Static117.anIntArray524[arg2], local199);
					} else if (arg5 == 6) {
						local953 = 8;
						local1487 = Static80.method2760(arg6, arg1, arg0);
						if (local1487 != 0L) {
							local953 = Static86.method1991(Integer.MAX_VALUE & (int) (local1487 >>> 32)).anInt4239 / 2;
						}
						if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
							local1523 = local59.method3181(local182, local147, 4, local139, local174, arg2 + 4);
						} else {
							local1523 = new Class3_Sub2_Sub1_Sub5(arg3, 4, arg2 + 4, arg6, arg1, arg0, local59.anInt4221, true, null);
						}
						Static104.method2131(arg6, arg1, arg0, local174, local1523, null, 256, arg2, local953 * Static61.anIntArray317[arg2], local953 * Static106.anIntArray486[arg2], local199);
					} else if (arg5 == 7) {
						local368 = arg2 + 2 & 0x3;
						if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
							local277 = local59.method3181(local182, local147, 4, local139, local174, local368 + 4);
						} else {
							local277 = new Class3_Sub2_Sub1_Sub5(arg3, 4, local368 + 4, arg6, arg1, arg0, local59.anInt4221, true, null);
						}
						Static104.method2131(arg6, arg1, arg0, local174, local277, null, 256, local368, 0, 0, local199);
					} else if (arg5 == 8) {
						local953 = 8;
						@Pc(1714) int local1714 = arg2 + 2 & 0x3;
						local1487 = Static80.method2760(arg6, arg1, arg0);
						if (local1487 != 0L) {
							local953 = Static86.method1991(Integer.MAX_VALUE & (int) (local1487 >>> 32)).anInt4239 / 2;
						}
						@Pc(1778) Class3_Sub2_Sub1 local1778;
						if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
							local1523 = local59.method3181(local182, local147, 4, local139, local174, arg2 + 4);
							local1778 = local59.method3181(local182, local147, 4, local139, local174, local1714 + 4);
						} else {
							local1523 = new Class3_Sub2_Sub1_Sub5(arg3, 4, arg2 + 4, arg6, arg1, arg0, local59.anInt4221, true, null);
							local1778 = new Class3_Sub2_Sub1_Sub5(arg3, 4, local1714 + 4, arg6, arg1, arg0, local59.anInt4221, true, null);
						}
						Static104.method2131(arg6, arg1, arg0, local174, local1523, local1778, 256, arg2, Static61.anIntArray317[arg2] * local953, Static106.anIntArray486[arg2] * local953, local199);
					}
				}
			}
		} else if (!Static179.aBoolean202 || local59.anInt4208 != 0 || local59.anInt4236 == 1 || local59.aBoolean201) {
			if (local59.anInt4221 == -1 && local59.anIntArray699 == null) {
				local277 = local59.method3181(local182, local147, 22, local139, local174, arg2);
			} else {
				local277 = new Class3_Sub2_Sub1_Sub5(arg3, 22, arg2, arg6, arg1, arg0, local59.anInt4221, true, null);
			}
			Static131.method2557(arg6, arg1, arg0, local174, local277, local199);
			if (local59.anInt4236 == 1 && arg4 != null) {
				arg4.method802(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILjava/awt/Color;Lclient!eh;)V")
	public static void method405(@OriginalArg(0) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Class28 arg2) {
		try {
			@Pc(6) Graphics local6 = Static41.aCanvas1.getGraphics();
			if (Static71.aFont1 == null) {
				Static71.aFont1 = new Font("Helvetica", 1, 13);
				Static136.aFontMetrics1 = Static41.aCanvas1.getFontMetrics(Static71.aFont1);
			}
			if (Static54.aBoolean92) {
				Static54.aBoolean92 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static15.anInt1149, Static107.anInt2763);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static24.anImage1 == null) {
					Static24.anImage1 = Static41.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static24.anImage1.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static71.aFont1);
				local51.setColor(Color.white);
				arg2.method933(local51, 22, (304 - arg2.method938(Static136.aFontMetrics1)) / 2);
				local6.drawImage(Static24.anImage1, Static15.anInt1149 / 2 - 152, Static107.anInt2763 / 2 + -18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static15.anInt1149 / 2 - 152;
				@Pc(141) int local141 = Static107.anInt2763 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local135, local141, 303, 33);
				local6.fillRect(local135 + 2, local141 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local135 + 1, local141 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local135 + 2, local141 - -2, 300 - arg0 * 3, 30);
				local6.setFont(Static71.aFont1);
				local6.setColor(Color.white);
				arg2.method933(local6, local141 + 22, local135 - -((-arg2.method938(Static136.aFontMetrics1) + 304) / 2));
			}
		} catch (@Pc(221) Exception local221) {
			Static41.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
	public static void method406() {
		aClass7_7 = null;
		aClass61_1 = null;
		aClass28Array2 = null;
	}
}
