import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!th;")
	public static Class168 aClass168_188;

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
	public static int anInt5551;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString391 = "Loaded textures";

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
	public static int[] anIntArray502 = new int[50];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLjava/lang/String;Ljava/awt/Color;I)V")
	public static void method4186(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(6) Graphics local6 = Static108.aCanvas1.getGraphics();
			if (Static140.aFont1 == null) {
				Static140.aFont1 = new Font("Helvetica", 1, 13);
				Static98.aFontMetrics12 = Static108.aCanvas1.getFontMetrics(Static140.aFont1);
			}
			if (arg0) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static38.anInt950, Static270.anInt5412);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static196.anImage4 == null) {
					Static196.anImage4 = Static108.aCanvas1.createImage(304, 34);
				}
				@Pc(53) Graphics local53 = Static196.anImage4.getGraphics();
				local53.setColor(arg2);
				local53.drawRect(0, 0, 303, 33);
				local53.fillRect(2, 2, arg3 * 3, 30);
				local53.setColor(Color.black);
				local53.drawRect(1, 1, 301, 31);
				local53.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local53.setFont(Static140.aFont1);
				local53.setColor(Color.white);
				local53.drawString(arg1, (304 - Static98.aFontMetrics12.stringWidth(arg1)) / 2, 22);
				local6.drawImage(Static196.anImage4, Static38.anInt950 / 2 - 152, Static270.anInt5412 / 2 + -18, null);
			} catch (@Pc(135) Exception local135) {
				@Pc(141) int local141 = Static38.anInt950 / 2 - 152;
				@Pc(147) int local147 = Static270.anInt5412 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local141, local147, 303, 33);
				local6.fillRect(local141 + 2, local147 - -2, arg3 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local141 + 1, local147 + 1, 301, 31);
				local6.fillRect(local141 + arg3 * 3 + 2, local147 - -2, 300 - arg3 * 3, 30);
				local6.setFont(Static140.aFont1);
				local6.setColor(Color.white);
				local6.drawString(arg1, (304 - Static98.aFontMetrics12.stringWidth(arg1)) / 2 + local141, local147 + 22);
			}
			if (Static87.aString115 != null) {
				local6.setFont(Static140.aFont1);
				local6.setColor(Color.white);
				local6.drawString(Static87.aString115, Static38.anInt950 / 2 - Static98.aFontMetrics12.stringWidth(Static87.aString115) / 2, Static270.anInt5412 / 2 - 26);
			}
		} catch (@Pc(251) Exception local251) {
			Static108.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!kh;Lclient!kh;B)V")
	public static void method4188(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0.aClass1_Sub3_75 != null) {
			arg0.method4652();
		}
		arg0.aClass1_Sub3_75 = arg1;
		arg0.aClass1_Sub3_74 = arg1.aClass1_Sub3_74;
		arg0.aClass1_Sub3_75.aClass1_Sub3_74 = arg0;
		arg0.aClass1_Sub3_74.aClass1_Sub3_75 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)I")
	public static int method4189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class146.anIntArray463[arg2 * 1024 / arg0] >> 1;
		return (arg3 * local16 >> 16) + (arg1 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lclient!me;")
	public static Class106 method4190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass106_1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lclient!ic;IZIZI[BI)[I")
	public static int[] method4192(@OriginalArg(0) Class75[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17;
		@Pc(22) int local22;
		if (!arg3) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				for (local17 = 0; local17 < 64; local17++) {
					for (local22 = 0; local22 < 64; local22++) {
						if (local17 + arg1 > 0 && arg1 + local17 < 103 && local22 + arg2 > 0 && arg2 + local22 < 103) {
							arg0[local10].anIntArrayArray30[arg1 + local17][local22 + arg2] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(100) Class1_Sub14 local100 = new Class1_Sub14(arg5);
		@Pc(104) byte local104;
		if (arg3) {
			local104 = 1;
		} else {
			local104 = 4;
		}
		local17 = arg4 + arg1;
		local22 = arg2 + arg6;
		@Pc(129) int local129;
		for (@Pc(119) int local119 = 0; local119 < local104; local119++) {
			for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
				for (local129 = 0; local129 < 64; local129++) {
					Static295.method4530(local119, 0, arg3, arg2 + local129, arg1 + local124, local22 + local129, local17 + local124, local100, false, 0, 0);
				}
			}
		}
		@Pc(164) boolean local164 = false;
		@Pc(166) boolean local166 = false;
		@Pc(224) int local224;
		@Pc(238) int local238;
		@Pc(254) int local254;
		@Pc(275) int local275;
		@Pc(292) int local292;
		while (local100.anInt3000 < local100.aByteArray55.length) {
			local129 = local100.method2199();
			if (local129 == 128) {
				Static84.anIntArray201[0] = local100.method2244();
				Static84.anIntArray201[1] = local100.method2248();
				local164 = true;
				Static84.anIntArray201[2] = local100.method2248();
				Static84.anIntArray201[3] = local100.method2248();
				Static84.anIntArray201[4] = local100.method2244();
			} else {
				if (local129 != 129) {
					local100.anInt3000--;
					break;
				}
				local166 = true;
				for (local224 = 0; local224 < 4; local224++) {
					@Pc(231) byte local231 = local100.method2212();
					if (local231 == 0) {
						local238 = arg1;
						if (arg1 < 0) {
							local238 = 0;
						} else if (arg1 >= 104) {
							local238 = 104;
						}
						local254 = arg1 + 64;
						if (local254 < 0) {
							local254 = 0;
						} else if (local254 >= 104) {
							local254 = 104;
						}
						local275 = arg2 + 64;
						if (local275 < 0) {
							local275 = 0;
						} else if (local275 >= 104) {
							local275 = 104;
						}
						local292 = arg2;
						if (arg2 < 0) {
							local292 = 0;
						} else if (arg2 >= 104) {
							local292 = 104;
						}
						while (local238 < local254) {
							while (local275 > local292) {
								Static290.aByteArrayArrayArray17[local224][local238][local292] = 0;
								local292++;
							}
							local238++;
						}
					} else if (local231 == 1) {
						for (local238 = 0; local238 < 64; local238 += 4) {
							for (local254 = 0; local254 < 64; local254 += 4) {
								@Pc(451) byte local451 = local100.method2212();
								for (local275 = local238 + arg1; local275 < arg1 + local238 + 4; local275++) {
									for (@Pc(468) int local468 = local254 + arg2; local468 < arg2 + local254 + 4; local468++) {
										if (local275 >= 0 && local275 < 104 && local468 >= 0 && local468 < 104) {
											Static290.aByteArrayArrayArray17[local224][local275][local468] = local451;
										}
									}
								}
							}
						}
					} else if (local231 == 2 && local224 > 0) {
						local238 = arg1;
						if (arg1 < 0) {
							local238 = 0;
						} else if (arg1 >= 104) {
							local238 = 104;
						}
						local292 = arg2;
						if (arg2 < 0) {
							local292 = 0;
						} else if (arg2 >= 104) {
							local292 = 104;
						}
						local254 = arg1 + 64;
						local275 = arg2 + 64;
						if (local254 < 0) {
							local254 = 0;
						} else if (local254 >= 104) {
							local254 = 104;
						}
						if (local275 < 0) {
							local275 = 0;
						} else if (local275 >= 104) {
							local275 = 104;
						}
						while (local254 > local238) {
							while (local275 > local292) {
								Static290.aByteArrayArrayArray17[local224][local238][local292] = Static290.aByteArrayArrayArray17[local224 - 1][local238][local292];
								local292++;
							}
							local238++;
						}
					}
				}
			}
		}
		@Pc(574) int local574;
		if (Static294.aBoolean367 && !arg3) {
			@Pc(530) Class61 local530 = null;
			label286: while (true) {
				while (true) {
					while (local100.anInt3000 < local100.aByteArray55.length) {
						local224 = local100.method2199();
						if (local224 == 0) {
							local530 = new Class61(local100);
						} else if (local224 == 1) {
							local574 = local100.method2199();
							if (local574 > 0) {
								for (local238 = 0; local238 < local574; local238++) {
									@Pc(588) Class59 local588 = new Class59(local100);
									if (local588.anInt1840 == 31) {
										@Pc(601) Class182 local601 = Static182.method2955(local100.method2244());
										local588.method1356(local601.anInt5892, local601.anInt5896, local601.anInt5897, local601.anInt5891);
									}
									local588.anInt1852 += arg1 << 7;
									local292 = local588.anInt1852 >> 7;
									local588.anInt1847 += arg2 << 7;
									local275 = local588.anInt1847 >> 7;
									if (local292 >= 0 && local275 >= 0 && local292 < 104 && local275 < 104) {
										local588.aBoolean128 = (Static303.aByteArrayArrayArray19[1][local292][local275] & 0x2) != 0;
										local588.anInt1848 = Static46.anIntArrayArrayArray1[local588.anInt1851][local292][local275] - local588.anInt1848;
										Static191.method3094(local588);
									}
								}
							}
						} else if (local224 == 2) {
							if (local530 == null) {
								local530 = new Class61();
							}
							local530.method1432(local100);
						} else {
							throw new IllegalStateException();
						}
					}
					if (local530 == null) {
						local530 = new Class61();
					}
					for (local224 = 0; local224 < 8; local224++) {
						for (local574 = 0; local574 < 8; local574++) {
							local238 = (arg1 >> 3) + local224;
							local254 = local574 + (arg2 >> 3);
							if (local238 >= 0 && local238 < 13 && local254 >= 0 && local254 < 13) {
								Static87.aClass61ArrayArray1[local238][local254] = local530;
							}
						}
					}
					break label286;
				}
			}
		}
		if (!local166) {
			for (local129 = 0; local129 < 4; local129++) {
				for (local224 = 0; local224 < 16; local224++) {
					for (local574 = 0; local574 < 16; local574++) {
						local238 = local224 + (arg1 >> 2);
						local254 = local574 + (arg2 >> 2);
						if (local238 >= 0 && local238 < 26 && local254 >= 0 && local254 < 26) {
							Static290.aByteArrayArrayArray17[local129][local238][local254] = 0;
						}
					}
				}
			}
		}
		return local164 ? Static84.anIntArray201 : null;
	}
}
