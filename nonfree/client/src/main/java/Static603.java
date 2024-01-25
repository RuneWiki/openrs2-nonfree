import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vga", name = "h", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_1 = new Class244(14, 0);

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_2 = new Class244(15, 4);

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_3 = new Class244(16, -2);

	@OriginalMember(owner = "client!vga", name = "m", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_4 = new Class244(17, 0);

	@OriginalMember(owner = "client!vga", name = "n", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_5 = new Class244(18, -2);

	@OriginalMember(owner = "client!vga", name = "o", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_6 = new Class244(19, -2);

	@OriginalMember(owner = "client!vga", name = "p", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_7 = new Class244(22, -2);

	@OriginalMember(owner = "client!vga", name = "q", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_8 = new Class244(23, 4);

	@OriginalMember(owner = "client!vga", name = "r", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_9 = new Class244(24, -1);

	@OriginalMember(owner = "client!vga", name = "s", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_10 = new Class244(26, 0);

	@OriginalMember(owner = "client!vga", name = "t", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_11 = new Class244(27, 0);

	@OriginalMember(owner = "client!vga", name = "u", descriptor = "Lclient!nha;")
	public static final Class244 aClass244_12 = new Class244(28, -2);

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lclient!ha;III)V")
	public static void method8410(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static555.anInt7106 == 0 || Static617.anInt10033 == 0) {
			return;
		}
		@Pc(33) Class117 local33;
		@Pc(52) int local52;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(58) int local58;
		@Pc(65) int local65;
		if (Static144.aBoolean196) {
			Static125.method1885(false);
			local33 = arg0.method7037();
			@Pc(36) int[] local36 = arg0.Y();
			local40 = local36[1];
			local44 = local36[2];
			local48 = local36[3];
			local52 = local36[0];
			local58 = arg2 + Static470.method5107(false);
			local65 = arg1 + Static597.method8365(false);
		} else {
			arg0.DA(Static610.anInt9986, Static173.anInt3126, Static555.anInt7106, Static617.anInt10033);
			local40 = Static173.anInt3126;
			local52 = Static610.anInt9986;
			local48 = Static617.anInt10033;
			local44 = Static555.anInt7106;
			arg0.KA(Static76.anInt1278, Static455.anInt7664, Static555.anInt7106, Static617.anInt10033);
			local33 = arg0.method6998();
			local33.method7254(Static237.anInt4011, Static339.anInt5858, Static200.anInt3569, Static451.anInt7592, Static72.anInt1131, Static430.anInt7289);
			local58 = arg2;
			local65 = arg1;
			arg0.method7040(local33);
		}
		Static554.method7810(true);
		if (local48 == 0) {
			local48 = 1;
		}
		if (local44 == 0) {
			local44 = 1;
		}
		@Pc(137) int local137;
		@Pc(150) int local150;
		@Pc(160) int local160;
		@Pc(275) int local275;
		@Pc(284) int local284;
		@Pc(295) int local295;
		@Pc(306) int local306;
		@Pc(129) int local129;
		@Pc(353) int local353;
		if (Static492.aClass40Array3 != null && (!Static202.aBoolean295 || (Static42.anInt714 & 0x40) != 0)) {
			local129 = -1;
			@Pc(131) int local131 = -1;
			@Pc(134) int local134 = arg0.i();
			local137 = arg0.XA();
			@Pc(161) int local161;
			@Pc(149) int local149;
			if (Static605.aBoolean812) {
				local150 = local149 = (local58 - local52) * Static461.anInt7840 / local44;
				local161 = local160 = (local65 - local40) * Static461.anInt7840 / local48;
			} else {
				local161 = local134 * (local65 - local40) / local48;
				local160 = (local65 - local40) * local137 / local48;
				local149 = local137 * (local58 - local52) / local44;
				local150 = local134 * (local58 - local52) / local44;
			}
			@Pc(213) int[] local213 = new int[] { local150, local161, local134 };
			local33.method7252(local213);
			@Pc(231) int[] local231 = new int[] { local149, local160, local137 };
			local33.method7252(local231);
			@Pc(262) float local262 = Static542.method7726((float) local231[0], 4, (float) local213[2], (float) local231[2], (float) local231[1], (float) local213[0], (float) local213[1]);
			if (local262 > 0.0F) {
				local275 = local231[0] - local213[0];
				local284 = local231[2] - local213[2];
				local295 = (int) (local262 * (float) local275 + (float) local213[0]);
				local306 = (int) ((float) local284 * local262 + (float) local213[2]);
				local129 = local295 + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() - 1 << 8) >> 9;
				local131 = local306 + (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() - 1 << 8) >> 9;
				@Pc(335) byte local335 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125;
				if (local335 < 3 && (Static480.aByteArrayArrayArray19[1][local295 >> 9][local306 >> 9] & 0x2) != 0) {
					local353 = local335 + 1;
				}
			}
			if (local129 != -1 && local131 != -1) {
				if (Static202.aBoolean295 && (Static42.anInt714 & 0x40) != 0) {
					@Pc(371) Class357 local371 = Static318.method4971(Static402.anInt9331, Static343.anInt5922);
					if (local371 == null) {
						Static2.method24();
					} else {
						Static227.method3576(true, (long) (local129 << 0 | local131), 0L, true, local131, 21, false, -1, Static497.anInt8481, Static111.aString29, " ->", local129);
					}
				} else {
					if (Static186.aBoolean276) {
						Static227.method3576(true, (long) (local131 | local129 << 0), 0L, true, local131, 2, false, -1, -1, Static76.aClass58_28.method1237(Static321.anInt5554), "", local129);
					}
					Static227.method3576(true, (long) (local131 | local129 << 0), 0L, true, local131, 45, false, -1, Static106.anInt1655, Static490.aString118, "", local129);
				}
			}
		}
		if (Static144.aBoolean196) {
			Static348.method5296();
		}
		for (local129 = 0; (Static144.aBoolean196 ? 2 : 1) > local129; local129++) {
			@Pc(462) boolean local462 = local129 == 0;
			@Pc(468) Class43 local468 = local462 ? Static599.aClass43_3 : Static185.aClass43_1;
			local137 = arg2;
			local150 = arg1;
			if (Static144.aBoolean196) {
				Static125.method1885(local462);
				local137 = arg2 + Static470.method5107(local462);
				local150 = arg1 + Static597.method8365(local462);
			}
			@Pc(494) Class363 local494 = local468.aClass363_2;
			for (@Pc(499) Class14_Sub10 local499 = (Class14_Sub10) local494.method8484(); local499 != null; local499 = (Class14_Sub10) local494.method8478()) {
				if ((Static69.aBoolean75 || local499.aClass14_Sub1_23.aByte125 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) && local499.method8906(local137, arg0, local150)) {
					@Pc(529) int local529;
					if (local499.aClass14_Sub1_23 instanceof Class14_Sub1_Sub1) {
						local529 = ((Class14_Sub1_Sub1) local499.aClass14_Sub1_23).aShort71;
						local160 = ((Class14_Sub1_Sub1) local499.aClass14_Sub1_23).aShort74;
					} else {
						local529 = local499.aClass14_Sub1_23.anInt9315 >> 9;
						local160 = local499.aClass14_Sub1_23.anInt9317 >> 9;
					}
					@Pc(673) int local673;
					@Pc(685) int local685;
					@Pc(788) int local788;
					@Pc(562) int local562;
					if (local499.aClass14_Sub1_23 instanceof Class14_Sub1_Sub1_Sub3_Sub1) {
						@Pc(556) Class14_Sub1_Sub1_Sub3_Sub1 local556 = (Class14_Sub1_Sub1_Sub3_Sub1) local499.aClass14_Sub1_23;
						local562 = local556.method2509();
						if ((local562 & 0x1) == 0 && (local556.anInt9317 & 0x1FF) == 0 && (local556.anInt9315 & 0x1FF) == 0 || (local562 & 0x1) == 1 && (local556.anInt9317 & 0x1FF) == 256 && (local556.anInt9315 & 0x1FF) == 256) {
							local275 = local556.anInt9317 - (local556.method2509() - 1 << 8);
							local284 = local556.anInt9315 - (local556.method2509() - 1 << 8);
							for (local295 = 0; local295 < Static58.anInt926; local295++) {
								@Pc(643) Class5_Sub13 local643 = (Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local295]);
								if (local643 != null) {
									@Pc(648) Class14_Sub1_Sub1_Sub3_Sub2 local648 = local643.aClass14_Sub1_Sub1_Sub3_Sub2_1;
									if (local648.anInt2904 != Static235.anInt3998 && local648.aBoolean255) {
										local673 = local648.anInt9317 - (local648.aClass271_1.anInt7335 - 1 << 8);
										local685 = local648.anInt9315 - (local648.aClass271_1.anInt7335 - 1 << 8);
										if (local673 >= local275 && local648.aClass271_1.anInt7335 <= local556.method2509() - (local673 - local275 >> 9) && local284 <= local685 && local648.aClass271_1.anInt7335 <= local556.method2509() - (local685 - local284 >> 9)) {
											Static287.method4288(local648, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 != local499.aClass14_Sub1_23.aByte125);
											local648.anInt2904 = Static235.anInt3998;
										}
									}
								}
							}
							local306 = Static227.anInt3948;
							@Pc(749) int[] local749 = Static467.anIntArray632;
							for (local673 = 0; local673 < local306; local673++) {
								@Pc(759) Class14_Sub1_Sub1_Sub3_Sub1 local759 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local749[local673]];
								if (local759 != null && local759.anInt2904 != Static235.anInt3998 && local759 != local556 && local759.aBoolean255) {
									local788 = local759.anInt9317 - (local759.method2509() - 1 << 8);
									@Pc(801) int local801 = local759.anInt9315 - (local759.method2509() - 1 << 8);
									if (local788 >= local275 && local759.method2509() <= local556.method2509() - (local788 - local275 >> 9) && local801 >= local284 && local759.method2509() <= local556.method2509() - (local801 - local284 >> 9)) {
										Static468.method6877(local759, local499.aClass14_Sub1_23.aByte125 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125);
										local759.anInt2904 = Static235.anInt3998;
									}
								}
							}
						}
						if (local556.anInt2904 == Static235.anInt3998) {
							continue;
						}
						Static468.method6877(local556, local499.aClass14_Sub1_23.aByte125 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125);
						local556.anInt2904 = Static235.anInt3998;
					}
					if (local499.aClass14_Sub1_23 instanceof Class14_Sub1_Sub1_Sub3_Sub2) {
						@Pc(896) Class14_Sub1_Sub1_Sub3_Sub2 local896 = (Class14_Sub1_Sub1_Sub3_Sub2) local499.aClass14_Sub1_23;
						if (local896.aClass271_1 != null) {
							if ((local896.aClass271_1.anInt7335 & 0x1) == 0 && (local896.anInt9317 & 0x1FF) == 0 && (local896.anInt9315 & 0x1FF) == 0 || (local896.aClass271_1.anInt7335 & 0x1) == 1 && (local896.anInt9317 & 0x1FF) == 256 && (local896.anInt9315 & 0x1FF) == 256) {
								local562 = local896.anInt9317 - (local896.aClass271_1.anInt7335 - 1 << 8);
								local275 = local896.anInt9315 - (local896.aClass271_1.anInt7335 - 1 << 8);
								for (local284 = 0; local284 < Static58.anInt926; local284++) {
									@Pc(979) Class5_Sub13 local979 = (Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local284]);
									if (local979 != null) {
										@Pc(984) Class14_Sub1_Sub1_Sub3_Sub2 local984 = local979.aClass14_Sub1_Sub1_Sub3_Sub2_1;
										if (Static235.anInt3998 != local984.anInt2904 && local984 != local896 && local984.aBoolean255) {
											local353 = local984.anInt9317 - (local984.aClass271_1.anInt7335 - 1 << 8);
											local673 = local984.anInt9315 - (local984.aClass271_1.anInt7335 - 1 << 8);
											if (local353 >= local562 && local896.aClass271_1.anInt7335 - (local353 - local562 >> 9) >= local984.aClass271_1.anInt7335 && local275 <= local673 && local896.aClass271_1.anInt7335 - (local673 - local275 >> 9) >= local984.aClass271_1.anInt7335) {
												Static287.method4288(local984, local499.aClass14_Sub1_23.aByte125 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125);
												local984.anInt2904 = Static235.anInt3998;
											}
										}
									}
								}
								local295 = Static227.anInt3948;
								@Pc(1099) int[] local1099 = Static467.anIntArray632;
								for (local353 = 0; local353 < local295; local353++) {
									@Pc(1109) Class14_Sub1_Sub1_Sub3_Sub1 local1109 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local1099[local353]];
									if (local1109 != null && local1109.anInt2904 != Static235.anInt3998 && local1109.aBoolean255) {
										local685 = local1109.anInt9317 - (local1109.method2509() - 1 << 8);
										local788 = local1109.anInt9315 - (local1109.method2509() - 1 << 8);
										if (local562 <= local685 && local1109.method2509() <= local896.aClass271_1.anInt7335 - (local685 - local562 >> 9) && local788 >= local275 && local1109.method2509() <= local896.aClass271_1.anInt7335 - (local788 - local275 >> 9)) {
											Static468.method6877(local1109, local499.aClass14_Sub1_23.aByte125 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125);
											local1109.anInt2904 = Static235.anInt3998;
										}
									}
								}
							}
							if (local896.anInt2904 == Static235.anInt3998) {
								continue;
							}
							Static287.method4288(local896, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 != local499.aClass14_Sub1_23.aByte125);
							local896.anInt2904 = Static235.anInt3998;
						}
					}
					if (local499.aClass14_Sub1_23 instanceof Class14_Sub1_Sub4_Sub1) {
						@Pc(1244) int local1244 = Static113.anInt1785 + local160;
						local562 = local529 + Static622.anInt10087;
						@Pc(1266) Class5_Sub17 local1266 = (Class5_Sub17) Static402.aClass81_65.method1599((long) (local1244 | local499.aClass14_Sub1_23.aByte125 << 28 | local562 << 14));
						if (local1266 != null) {
							local284 = 0;
							@Pc(1276) Class5_Sub32 local1276 = (Class5_Sub32) local1266.aClass306_14.method7304();
							while (local1276 != null) {
								@Pc(1284) Class329 local1284 = Static479.aClass348_1.method8197(local1276.anInt5871);
								if (Static202.aBoolean295 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 == local499.aClass14_Sub1_23.aByte125) {
									@Pc(1307) Class230 local1307 = Static139.anInt2304 == -1 ? null : Static246.aClass258_1.method6202(Static139.anInt2304);
									if ((Static42.anInt714 & 0x1) != 0 && (local1307 == null || local1284.method7763(local1307.anInt6315, Static139.anInt2304) != local1307.anInt6315)) {
										Static227.method3576(true, (long) local284, (long) local1276.anInt5871, false, local529, 44, false, -1, Static497.anInt8481, Static111.aString29, Static485.aString115 + " -> <col=ff9040>" + local1284.aString127, local160);
									}
								}
								if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 == local499.aClass14_Sub1_23.aByte125) {
									@Pc(1370) String[] local1370 = local1284.aStringArray36;
									for (local673 = 4; local673 >= 0; local673--) {
										if (local1370 != null && local1370[local673] != null) {
											@Pc(1382) byte local1382 = 0;
											if (local673 == 0) {
												local1382 = 19;
											}
											local788 = Static308.anInt4884;
											if (local673 == 1) {
												local1382 = 15;
											}
											if (local673 == 2) {
												local1382 = 57;
											}
											if (local673 == 3) {
												local1382 = 50;
											}
											if (local673 == local1284.anInt9056) {
												local788 = local1284.anInt9062;
											}
											if (local673 == 4) {
												local1382 = 12;
											}
											if (local1284.anInt9033 == local673) {
												local788 = local1284.anInt9036;
											}
											Static227.method3576(true, (long) local284, (long) local1276.anInt5871, false, local529, local1382, false, -1, local788, local1370[local673], "<col=ff9040>" + local1284.aString127, local160);
										}
									}
								}
								Static227.method3576(true, (long) local284, (long) local1276.anInt5871, false, local529, 1011, local499.aClass14_Sub1_23.aByte125 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125, -1, Static268.anInt4461, Static76.aClass58_23.method1237(Static321.anInt5554), "<col=ff9040>" + local1284.aString127, local160);
								local1276 = (Class5_Sub32) local1266.aClass306_14.method7314();
								local284++;
							}
						}
					}
					if (local499.aClass14_Sub1_23 instanceof Interface20) {
						@Pc(1526) Interface20 local1526 = (Interface20) local499.aClass14_Sub1_23;
						@Pc(1533) Class283 local1533 = Static525.aClass371_4.method8554(local1526.method8009());
						if (local1533.anIntArray623 != null) {
							local1533 = local1533.method6858(Static564.aClass304_1);
						}
						if (local1533 != null) {
							if (Static202.aBoolean295 && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 == local499.aClass14_Sub1_23.aByte125) {
								@Pc(1567) Class230 local1567 = Static139.anInt2304 == -1 ? null : Static246.aClass258_1.method6202(Static139.anInt2304);
								if ((Static42.anInt714 & 0x4) != 0 && (local1567 == null || local1533.method6850(local1567.anInt6315, Static139.anInt2304) != local1567.anInt6315)) {
									Static227.method3576(true, (long) local1526.hashCode(), Static476.method6935(local1526, local529, local160), false, local529, 46, false, -1, Static497.anInt8481, Static111.aString29, Static485.aString115 + " -> <col=00ffff>" + local1533.aString113, local160);
								}
							}
							if (local499.aClass14_Sub1_23.aByte125 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) {
								@Pc(1629) String[] local1629 = local1533.aStringArray34;
								if (local1629 != null) {
									for (local284 = 4; local284 >= 0; local284--) {
										if (local1629[local284] != null) {
											@Pc(1641) short local1641 = 0;
											local306 = Static308.anInt4884;
											if (local284 == 0) {
												local1641 = 16;
											}
											if (local284 == 1) {
												local1641 = 4;
											}
											if (local284 == 2) {
												local1641 = 49;
											}
											if (local284 == 3) {
												local1641 = 10;
											}
											if (local1533.anInt7832 == local284) {
												local306 = local1533.anInt7841;
											}
											if (local284 == 4) {
												local1641 = 1008;
											}
											if (local1533.anInt7820 == local284) {
												local306 = local1533.anInt7826;
											}
											Static227.method3576(true, (long) local1526.hashCode(), Static476.method6935(local1526, local529, local160), false, local529, local1641, false, -1, local306, local1629[local284], "<col=00ffff>" + local1533.aString113, local160);
										}
									}
								}
								Static227.method3576(true, (long) local1526.hashCode(), (long) local1533.anInt7807, false, local529, 1009, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 != local499.aClass14_Sub1_23.aByte125, -1, Static268.anInt4461, Static76.aClass58_23.method1237(Static321.anInt5554), "<col=00ffff>" + local1533.aString113, local160);
							}
						}
					}
				}
			}
			if (Static144.aBoolean196) {
				Static348.method5296();
			}
		}
		Static554.method7810(false);
	}
}
