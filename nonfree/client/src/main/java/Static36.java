import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array6;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!ec;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!ff;")
	public static Class11 aClass11_18;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
	public static boolean aBoolean74;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!i;")
	public static Class32 aClass32_21 = new Class32(100);

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_399 = Static2.method59(" @whi@(X");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!wd;")
	public static Class80 aClass80_400 = Static2.method59("Von:");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array8 = new Class80[100];

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!wd;")
	public static Class80 aClass80_401 = Static2.method59("Handel)4Duell");

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public static int anInt1184 = 0;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static volatile int anInt1185 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method629() {
		aClass80_399 = null;
		aClass80_400 = null;
		aClass80_401 = null;
		aClass80Array8 = null;
		aClass18_1 = null;
		aClass32_21 = null;
		aClass2_Sub1_Sub9_Sub1Array6 = null;
		aClass11_18 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!ff;II)Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3 method630(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) int arg2) {
		return Static123.method1974(arg1, arg0, arg2) ? Static42.method683() : null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILclient!v;B)V")
	public static void method631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub9_Sub4 arg3) {
		Static48.aClass22_10.method1068();
		Static78.aClass2_Sub1_Sub9_Sub3_49.method1494(0, 0);
		arg3.method1927(Static63.aClass80_669, 55, 28, 16777215, true);
		if (arg1 == 0) {
			arg3.method1927(Static71.aClass80_737, 55, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg3.method1927(Static49.aClass80_540, 55, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg3.method1927(Static17.aClass80_229, 55, 41, 16711680, true);
		}
		if (arg1 == 3) {
			arg3.method1927(Static10.aClass80_135, 55, 41, 65535, true);
		}
		arg3.method1927(Static79.aClass80_795, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg3.method1927(Static71.aClass80_737, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg3.method1927(Static49.aClass80_540, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg3.method1927(Static17.aClass80_229, 184, 41, 16711680, true);
		}
		arg3.method1927(Static42.aClass80_464, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg3.method1927(Static71.aClass80_737, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg3.method1927(Static49.aClass80_540, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg3.method1927(Static17.aClass80_229, 324, 41, 16711680, true);
		}
		arg3.method1912(Static112.aClass80_1103, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(157) Graphics local157 = Static119.aCanvas2.getGraphics();
			Static48.aClass22_10.method1065(local157, 453, 0);
		} catch (@Pc(165) Exception local165) {
			Static119.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!me;BILclient!sa;IIIIII)V")
	public static void method632(@OriginalArg(0) Class49 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static100.anIntArrayArrayArray5[arg3][arg1][arg6];
		@Pc(23) int local23 = Static100.anIntArrayArrayArray5[arg3][arg1 + 1][arg6];
		@Pc(35) int local35 = Static100.anIntArrayArrayArray5[arg3][arg1 + 1][arg6 + 1];
		@Pc(45) int local45 = Static100.anIntArrayArrayArray5[arg3][arg1][arg6 + 1];
		@Pc(69) int local69 = local45 + local35 + local23 + local13 >> 2;
		@Pc(73) Class2_Sub1_Sub10 local73 = Static18.method404(arg8);
		@Pc(79) int local79 = arg7 + (arg4 << 6);
		@Pc(91) int local91 = arg1 + (arg6 << 7) + (arg8 << 14) + 1073741824;
		if (local73.anInt1653 == 0) {
			local91 += Integer.MIN_VALUE;
		}
		if (local73.anInt1622 == 1) {
			local79 += 256;
		}
		@Pc(130) Class2_Sub1_Sub1 local130;
		if (arg7 == 22) {
			if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
				local130 = local73.method959(arg4, local13, local45, 22, local23, local35);
			} else {
				local130 = new Class2_Sub1_Sub1_Sub7(arg8, 22, arg4, local13, local23, local35, local45, local73.anInt1650, true, null);
			}
			arg2.method1654(arg5, arg1, arg6, local69, local130, local91, local79);
			if (local73.anInt1641 == 1) {
				arg0.method1177(arg6, arg1);
			}
			return;
		}
		@Pc(224) int local224;
		if (arg7 == 10 || arg7 == 11) {
			if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
				local130 = local73.method959(arg4, local13, local45, 10, local23, local35);
			} else {
				local130 = new Class2_Sub1_Sub1_Sub7(arg8, 10, arg4, local13, local23, local35, local45, local73.anInt1650, true, null);
			}
			if (local130 != null) {
				@Pc(227) int local227;
				if (arg4 == 1 || arg4 == 3) {
					local224 = local73.anInt1630;
					local227 = local73.anInt1634;
				} else {
					local224 = local73.anInt1634;
					local227 = local73.anInt1630;
				}
				@Pc(237) int local237 = 0;
				if (arg7 == 11) {
					local237 += 256;
				}
				arg2.method1616(arg5, arg1, arg6, local69, local224, local227, local130, local237, local91, local79);
			}
			if (local73.anInt1641 != 0) {
				arg0.method1173(local73.aBoolean111, arg4, local73.anInt1630, local73.anInt1634, arg6, arg1);
			}
		} else if (arg7 >= 12) {
			if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
				local130 = local73.method959(arg4, local13, local45, arg7, local23, local35);
			} else {
				local130 = new Class2_Sub1_Sub1_Sub7(arg8, arg7, arg4, local13, local23, local35, local45, local73.anInt1650, true, null);
			}
			arg2.method1616(arg5, arg1, arg6, local69, 1, 1, local130, 0, local91, local79);
			if (local73.anInt1641 != 0) {
				arg0.method1173(local73.aBoolean111, arg4, local73.anInt1630, local73.anInt1634, arg6, arg1);
			}
		} else if (arg7 == 0) {
			if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
				local130 = local73.method959(arg4, local13, local45, 0, local23, local35);
			} else {
				local130 = new Class2_Sub1_Sub1_Sub7(arg8, 0, arg4, local13, local23, local35, local45, local73.anInt1650, true, null);
			}
			arg2.method1639(arg5, arg1, arg6, local69, local130, null, Static85.anIntArray276[arg4], 0, local91, local79);
			if (local73.anInt1641 != 0) {
				arg0.method1179(arg7, arg1, arg6, arg4, local73.aBoolean111);
			}
		} else if (arg7 == 1) {
			if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
				local130 = local73.method959(arg4, local13, local45, 1, local23, local35);
			} else {
				local130 = new Class2_Sub1_Sub1_Sub7(arg8, 1, arg4, local13, local23, local35, local45, local73.anInt1650, true, null);
			}
			arg2.method1639(arg5, arg1, arg6, local69, local130, null, Static9.anIntArray23[arg4], 0, local91, local79);
			if (local73.anInt1641 != 0) {
				arg0.method1179(arg7, arg1, arg6, arg4, local73.aBoolean111);
			}
		} else {
			@Pc(490) int local490;
			@Pc(529) Class2_Sub1_Sub1 local529;
			if (arg7 == 2) {
				local490 = arg4 + 1 & 0x3;
				@Pc(514) Class2_Sub1_Sub1 local514;
				if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
					local514 = local73.method959(arg4 + 4, local13, local45, 2, local23, local35);
					local529 = local73.method959(local490, local13, local45, 2, local23, local35);
				} else {
					local514 = new Class2_Sub1_Sub1_Sub7(arg8, 2, arg4 + 4, local13, local23, local35, local45, local73.anInt1650, true, null);
					local529 = new Class2_Sub1_Sub1_Sub7(arg8, 2, local490, local13, local23, local35, local45, local73.anInt1650, true, null);
				}
				arg2.method1639(arg5, arg1, arg6, local69, local514, local529, Static85.anIntArray276[arg4], Static85.anIntArray276[local490], local91, local79);
				if (local73.anInt1641 != 0) {
					arg0.method1179(arg7, arg1, arg6, arg4, local73.aBoolean111);
				}
			} else if (arg7 == 3) {
				if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
					local130 = local73.method959(arg4, local13, local45, 3, local23, local35);
				} else {
					local130 = new Class2_Sub1_Sub1_Sub7(arg8, 3, arg4, local13, local23, local35, local45, local73.anInt1650, true, null);
				}
				arg2.method1639(arg5, arg1, arg6, local69, local130, null, Static9.anIntArray23[arg4], 0, local91, local79);
				if (local73.anInt1641 != 0) {
					arg0.method1179(arg7, arg1, arg6, arg4, local73.aBoolean111);
				}
			} else if (arg7 == 9) {
				if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
					local130 = local73.method959(arg4, local13, local45, arg7, local23, local35);
				} else {
					local130 = new Class2_Sub1_Sub1_Sub7(arg8, arg7, arg4, local13, local23, local35, local45, local73.anInt1650, true, null);
				}
				arg2.method1616(arg5, arg1, arg6, local69, 1, 1, local130, 0, local91, local79);
				if (local73.anInt1641 != 0) {
					arg0.method1173(local73.aBoolean111, arg4, local73.anInt1630, local73.anInt1634, arg6, arg1);
				}
			} else {
				if (local73.aBoolean113) {
					if (arg4 == 1) {
						local490 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local490;
					} else if (arg4 == 2) {
						local490 = local45;
						local45 = local23;
						local23 = local490;
						local490 = local35;
						local35 = local13;
						local13 = local490;
					} else if (arg4 == 3) {
						local490 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local490;
					}
				}
				if (arg7 == 4) {
					if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
						local130 = local73.method959(0, local13, local45, 4, local23, local35);
					} else {
						local130 = new Class2_Sub1_Sub1_Sub7(arg8, 4, 0, local13, local23, local35, local45, local73.anInt1650, true, null);
					}
					arg2.method1637(arg5, arg1, arg6, local69, local130, Static85.anIntArray276[arg4], arg4 * 512, 0, 0, local91, local79);
				} else if (arg7 == 5) {
					local224 = arg2.method1656(arg5, arg1, arg6);
					local490 = 16;
					if (local224 != 0) {
						local490 = Static18.method404(local224 >> 14 & 0x7FFF).anInt1645;
					}
					if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
						local529 = local73.method959(0, local13, local45, 4, local23, local35);
					} else {
						local529 = new Class2_Sub1_Sub1_Sub7(arg8, 4, 0, local13, local23, local35, local45, local73.anInt1650, true, null);
					}
					arg2.method1637(arg5, arg1, arg6, local69, local529, Static85.anIntArray276[arg4], arg4 * 512, Static108.anIntArray367[arg4] * local490, Static21.anIntArray102[arg4] * local490, local91, local79);
				} else if (arg7 == 6) {
					if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
						local130 = local73.method959(0, local13, local45, 4, local23, local35);
					} else {
						local130 = new Class2_Sub1_Sub1_Sub7(arg8, 4, 0, local13, local23, local35, local45, local73.anInt1650, true, null);
					}
					arg2.method1637(arg5, arg1, arg6, local69, local130, 256, arg4, 0, 0, local91, local79);
				} else if (arg7 == 7) {
					if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
						local130 = local73.method959(0, local13, local45, 4, local23, local35);
					} else {
						local130 = new Class2_Sub1_Sub1_Sub7(arg8, 4, 0, local13, local23, local35, local45, local73.anInt1650, true, null);
					}
					arg2.method1637(arg5, arg1, arg6, local69, local130, 512, arg4, 0, 0, local91, local79);
				} else if (arg7 == 8) {
					if (local73.anInt1650 == -1 && local73.anIntArray207 == null) {
						local130 = local73.method959(0, local13, local45, 4, local23, local35);
					} else {
						local130 = new Class2_Sub1_Sub1_Sub7(arg8, 4, 0, local13, local23, local35, local45, local73.anInt1650, true, null);
					}
					arg2.method1637(arg5, arg1, arg6, local69, local130, 768, arg4, 0, 0, local91, local79);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method633() {
		for (@Pc(3) int local3 = 0; local3 < Static16.anInt443; local3++) {
			@Pc(9) int local9 = Static49.anIntArray191[local3]--;
			if (Static49.anIntArray191[local3] >= -10) {
				@Pc(80) Class25 local80 = Static82.aClass25Array56[local3];
				if (local80 == null) {
					local80 = Static128.method675(Static90.aClass11_Sub1_13, Static110.anIntArray379[local3]);
					if (local80 == null) {
						continue;
					}
					Static49.anIntArray191[local3] += local80.method674();
					Static82.aClass25Array56[local3] = local80;
				}
				if (Static49.anIntArray191[local3] < 0) {
					@Pc(209) int local209;
					if (Static23.anIntArray101[local3] == 0) {
						local209 = Static98.anInt2613;
					} else {
						@Pc(124) int local124 = (Static23.anIntArray101[local3] & 0xFF) * 128;
						@Pc(132) int local132 = Static23.anIntArray101[local3] >> 16 & 0xFF;
						@Pc(140) int local140 = Static23.anIntArray101[local3] >> 8 & 0xFF;
						@Pc(150) int local150 = local132 * 128 + 64 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370;
						if (local150 < 0) {
							local150 = -local150;
						}
						@Pc(168) int local168 = local140 * 128 + 64 - Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324;
						if (local168 < 0) {
							local168 = -local168;
						}
						@Pc(183) int local183 = local150 + local168 - 128;
						if (local183 > local124) {
							Static49.anIntArray191[local3] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local209 = Static22.anInt963 * (local124 - local183) / local124;
					}
					if (local209 > 0) {
						@Pc(223) Class2_Sub16_Sub1 local223 = local80.method677().method1509(aClass18_1);
						@Pc(228) Class2_Sub2_Sub4 local228 = Static133.method1558(local223, local209);
						local228.method1551(Static5.anIntArray13[local3] - 1);
						Static123.aClass2_Sub2_Sub2_2.method1231(local228);
					}
					Static49.anIntArray191[local3] = -100;
				}
			} else {
				Static16.anInt443--;
				for (@Pc(23) int local23 = local3; local23 < Static16.anInt443; local23++) {
					Static110.anIntArray379[local23] = Static110.anIntArray379[local23 + 1];
					Static82.aClass25Array56[local23] = Static82.aClass25Array56[local23 + 1];
					Static5.anIntArray13[local23] = Static5.anIntArray13[local23 + 1];
					Static49.anIntArray191[local23] = Static49.anIntArray191[local23 + 1];
					Static23.anIntArray101[local23] = Static23.anIntArray101[local23 + 1];
				}
				local3--;
			}
		}
		if (Static70.aBoolean132 && !Static39.method395()) {
			if (Static87.anInt2274 != 0 && Static91.anInt2226 != -1) {
				Static55.method712(Static87.anInt2274, 0, Static29.aClass11_Sub1_7, Static91.anInt2226);
			}
			Static70.aBoolean132 = false;
		}
	}
}
