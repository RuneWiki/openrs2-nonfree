import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array10;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!e;")
	public static Class19 aClass19_1 = new Class19();

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1755 = Static32.method683("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1756 = Static32.method683("::gc");

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1757 = Static32.method683("Please remove ");

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1758 = aClass49_1757;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Lclient!rc;")
	public static Class74 aClass74_95 = new Class74(30);

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1759 = aClass49_1757;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "Lclient!tf;")
	public static Class81 aClass81_16 = new Class81();

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1761 = Static32.method683("glow1:");

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1760 = aClass49_1761;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1762 = Static32.method683("<br>");

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1763 = Static32.method683("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	public static int anInt4077 = -1;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1764 = aClass49_1761;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!sd;III)V")
	public static void method3041(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static133.anInt3713 >= 400) {
			return;
		}
		if (arg1.anIntArray288 != null) {
			arg1 = arg1.method2469();
		}
		if (arg1 == null || !arg1.aBoolean137) {
			return;
		}
		@Pc(33) Class49 local33 = arg1.aClass49_1449;
		if (arg1.anInt3197 != 0) {
			local33 = Static33.method692(new Class49[] { local33, Static18.method347(arg1.anInt3197, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3599), Static27.aClass49_334, Static84.aClass49_898, Static48.method882(arg1.anInt3197), Static64.aClass49_714 });
		}
		if (Static124.anInt2746 == 1) {
			Static11.method162(arg2, arg0, Static64.aClass49_696, (short) 26, (long) arg3, Static33.method692(new Class49[] { Static180.aClass49_1728, Static86.aClass49_1597, local33 }));
		} else if (!Static108.aBoolean93) {
			@Pc(124) Class49[] local124 = arg1.aClass49Array18;
			if (Static9.aBoolean10) {
				local124 = Static91.method1579(local124);
			}
			@Pc(134) int local134;
			if (local124 != null) {
				for (local134 = 4; local134 >= 0; local134--) {
					if (local124[local134] != null && !local124[local134].method1645(Static83.aClass49_885)) {
						@Pc(153) byte local153 = 0;
						if (local134 == 0) {
							local153 = 37;
						}
						if (local134 == 1) {
							local153 = 6;
						}
						if (local134 == 2) {
							local153 = 35;
						}
						if (local134 == 3) {
							local153 = 9;
						}
						if (local134 == 4) {
							local153 = 32;
						}
						Static11.method162(arg2, arg0, local124[local134], local153, (long) arg3, Static33.method692(new Class49[] { Static98.aClass49_995, local33 }));
					}
				}
			}
			if (local124 != null) {
				for (local134 = 4; local134 >= 0; local134--) {
					if (local124[local134] != null && local124[local134].method1645(Static83.aClass49_885)) {
						@Pc(230) short local230 = 0;
						if (arg1.anInt3197 > Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3599) {
							local230 = 2000;
						}
						@Pc(243) short local243 = 0;
						if (local134 == 0) {
							local243 = 37;
						}
						if (local134 == 1) {
							local243 = 6;
						}
						if (local134 == 2) {
							local243 = 35;
						}
						if (local134 == 3) {
							local243 = 9;
						}
						if (local134 == 4) {
							local243 = 32;
						}
						if (local243 != 0) {
							local243 += local230;
						}
						Static11.method162(arg2, arg0, local124[local134], local243, (long) arg3, Static33.method692(new Class49[] { Static98.aClass49_995, local33 }));
					}
				}
			}
			Static11.method162(arg2, arg0, Static51.aClass49_589, (short) 1004, (long) arg3, Static33.method692(new Class49[] { Static98.aClass49_995, local33 }));
		} else if ((Static138.anInt2937 & 0x2) == 2) {
			Static11.method162(arg2, arg0, Static103.aClass49_1026, (short) 51, (long) arg3, Static33.method692(new Class49[] { Static150.aClass49_1450, Static86.aClass49_1597, local33 }));
			return;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method3042() {
		aClass74_95 = null;
		aClass49_1764 = null;
		aClass49_1759 = null;
		aClass19_1 = null;
		aClass49_1760 = null;
		aClass49_1757 = null;
		aClass2_Sub2_Sub2_Sub2Array10 = null;
		aClass49_1755 = null;
		aClass49_1761 = null;
		aClass49_1762 = null;
		aClass49_1763 = null;
		aClass81_16 = null;
		aClass49_1758 = null;
		aClass49_1756 = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIILclient!lb;ZIII)V")
	public static void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class48 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class2_Sub2_Sub9 local9 = Static124.method2146(arg0);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (arg1 == 1 || arg1 == 3) {
			local23 = local9.anInt1482;
			local20 = local9.anInt1480;
		} else {
			local20 = local9.anInt1482;
			local23 = local9.anInt1480;
		}
		@Pc(52) int local52;
		@Pc(46) int local46;
		if (arg3 + local23 <= 104) {
			local46 = arg3 + (local23 + 1 >> 1);
			local52 = (local23 >> 1) + arg3;
		} else {
			local46 = arg3 + 1;
			local52 = arg3;
		}
		@Pc(73) int local73;
		@Pc(82) int local82;
		if (arg6 + local20 <= 104) {
			local73 = arg6 + (local20 >> 1);
			local82 = arg6 + (local20 + 1 >> 1);
		} else {
			local73 = arg6;
			local82 = arg6 + 1;
		}
		@Pc(94) int[][] local94 = Static162.anIntArrayArrayArray7[arg5];
		@Pc(127) int local127 = local94[local82][local46] + local94[local73][local52] + local94[local82][local52] + local94[local73][local46] >> 2;
		@Pc(135) int local135 = (local20 << 6) + (arg6 << 7);
		@Pc(143) int local143 = (local23 << 6) + (arg3 << 7);
		@Pc(160) long local160 = (long) (arg1 << 20 | arg2 << 14 | arg6 | arg3 << 7 | 0x40000000);
		if (local9.anInt1501 == 0) {
			local160 |= Long.MIN_VALUE;
		}
		if (local9.anInt1483 == 1) {
			local160 |= 0x400000L;
		}
		local160 |= (long) arg0 << 32;
		@Pc(206) Class2_Sub2_Sub3 local206;
		if (arg2 == 22) {
			if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
				local206 = local9.method1201(local135, arg1, local127, local94, 22, local143);
			} else {
				local206 = new Class2_Sub2_Sub3_Sub1(arg0, 22, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
			}
			Static149.method2454(arg7, arg6, arg3, local127, local206, local160);
			if (local9.anInt1490 == 1) {
				arg4.method1595(arg3, arg6);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
				local206 = local9.method1201(local135, arg1, local127, local94, 10, local143);
			} else {
				local206 = new Class2_Sub2_Sub3_Sub1(arg0, 10, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
			}
			if (local206 != null) {
				Static182.method3025(arg7, arg6, arg3, local127, local20, local23, local206, arg2 == 11 ? 256 : 0, local160);
			}
			if (local9.anInt1490 != 0) {
				arg4.method1590(arg6, local20, local9.aBoolean66, arg3, local23);
			}
		} else if (arg2 >= 12) {
			if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
				local206 = local9.method1201(local135, arg1, local127, local94, arg2, local143);
			} else {
				local206 = new Class2_Sub2_Sub3_Sub1(arg0, arg2, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
			}
			Static182.method3025(arg7, arg6, arg3, local127, 1, 1, local206, 0, local160);
			if (local9.anInt1490 != 0) {
				arg4.method1590(arg6, local20, local9.aBoolean66, arg3, local23);
			}
		} else if (arg2 == 0) {
			if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
				local206 = local9.method1201(local135, arg1, local127, local94, 0, local143);
			} else {
				local206 = new Class2_Sub2_Sub3_Sub1(arg0, 0, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
			}
			Static112.method1900(arg7, arg6, arg3, local127, local206, null, Static20.anIntArray40[arg1], 0, local160);
			if (local9.anInt1490 != 0) {
				arg4.method1594(arg6, local9.aBoolean66, arg1, arg2, arg3);
			}
		} else if (arg2 == 1) {
			if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
				local206 = local9.method1201(local135, arg1, local127, local94, 1, local143);
			} else {
				local206 = new Class2_Sub2_Sub3_Sub1(arg0, 1, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
			}
			Static112.method1900(arg7, arg6, arg3, local127, local206, null, Static23.anIntArray43[arg1], 0, local160);
			if (local9.anInt1490 != 0) {
				arg4.method1594(arg6, local9.aBoolean66, arg1, arg2, arg3);
			}
		} else {
			@Pc(520) int local520;
			if (arg2 == 2) {
				local520 = arg1 + 1 & 0x3;
				@Pc(557) Class2_Sub2_Sub3 local557;
				@Pc(543) Class2_Sub2_Sub3 local543;
				if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
					local543 = local9.method1201(local135, arg1 + 4, local127, local94, 2, local143);
					local557 = local9.method1201(local135, local520, local127, local94, 2, local143);
				} else {
					local543 = new Class2_Sub2_Sub3_Sub1(arg0, 2, arg1 + 4, arg5, arg6, arg3, local9.anInt1512, true, null);
					local557 = new Class2_Sub2_Sub3_Sub1(arg0, 2, local520, arg5, arg6, arg3, local9.anInt1512, true, null);
				}
				Static112.method1900(arg7, arg6, arg3, local127, local543, local557, Static20.anIntArray40[arg1], Static20.anIntArray40[local520], local160);
				if (local9.anInt1490 != 0) {
					arg4.method1594(arg6, local9.aBoolean66, arg1, arg2, arg3);
				}
			} else if (arg2 == 3) {
				if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
					local206 = local9.method1201(local135, arg1, local127, local94, 3, local143);
				} else {
					local206 = new Class2_Sub2_Sub3_Sub1(arg0, 3, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
				}
				Static112.method1900(arg7, arg6, arg3, local127, local206, null, Static23.anIntArray43[arg1], 0, local160);
				if (local9.anInt1490 != 0) {
					arg4.method1594(arg6, local9.aBoolean66, arg1, arg2, arg3);
				}
			} else if (arg2 == 9) {
				if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
					local206 = local9.method1201(local135, arg1, local127, local94, arg2, local143);
				} else {
					local206 = new Class2_Sub2_Sub3_Sub1(arg0, arg2, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
				}
				Static182.method3025(arg7, arg6, arg3, local127, 1, 1, local206, 0, local160);
				if (local9.anInt1490 != 0) {
					arg4.method1590(arg6, local20, local9.aBoolean66, arg3, local23);
				}
			} else if (arg2 == 4) {
				if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
					local206 = local9.method1201(local135, arg1, local127, local94, 4, local143);
				} else {
					local206 = new Class2_Sub2_Sub3_Sub1(arg0, 4, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
				}
				Static33.method690(arg7, arg6, arg3, local127, local206, null, Static20.anIntArray40[arg1], 0, 0, 0, local160);
			} else {
				@Pc(797) long local797;
				@Pc(832) Class2_Sub2_Sub3 local832;
				if (arg2 == 5) {
					local797 = Static17.method2057(arg7, arg6, arg3);
					local520 = 16;
					if (local797 != 0L) {
						local520 = Static124.method2146((int) (local797 >>> 32) & Integer.MAX_VALUE).anInt1489;
					}
					if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
						local832 = local9.method1201(local135, arg1, local127, local94, 4, local143);
					} else {
						local832 = new Class2_Sub2_Sub3_Sub1(arg0, 4, arg1, arg5, arg6, arg3, local9.anInt1512, true, null);
					}
					Static33.method690(arg7, arg6, arg3, local127, local832, null, Static20.anIntArray40[arg1], 0, local520 * Static86.anIntArray315[arg1], local520 * Static179.anIntArray366[arg1], local160);
				} else if (arg2 == 6) {
					local520 = 8;
					local797 = Static17.method2057(arg7, arg6, arg3);
					if (local797 != 0L) {
						local520 = Static124.method2146(Integer.MAX_VALUE & (int) (local797 >>> 32)).anInt1489 / 2;
					}
					if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
						local832 = local9.method1201(local135, arg1 + 4, local127, local94, 4, local143);
					} else {
						local832 = new Class2_Sub2_Sub3_Sub1(arg0, 4, arg1 + 4, arg5, arg6, arg3, local9.anInt1512, true, null);
					}
					Static33.method690(arg7, arg6, arg3, local127, local832, null, 256, arg1, local520 * Static38.anIntArray85[arg1], Static91.anIntArray198[arg1] * local520, local160);
				} else if (arg2 == 7) {
					@Pc(965) int local965 = arg1 + 2 & 0x3;
					if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
						local206 = local9.method1201(local135, local965 + 4, local127, local94, 4, local143);
					} else {
						local206 = new Class2_Sub2_Sub3_Sub1(arg0, 4, local965 + 4, arg5, arg6, arg3, local9.anInt1512, true, null);
					}
					Static33.method690(arg7, arg6, arg3, local127, local206, null, 256, local965, 0, 0, local160);
				} else if (arg2 == 8) {
					local797 = Static17.method2057(arg7, arg6, arg3);
					local520 = 8;
					if (local797 != 0L) {
						local520 = Static124.method2146(Integer.MAX_VALUE & (int) (local797 >>> 32)).anInt1489 / 2;
					}
					@Pc(1048) int local1048 = arg1 + 2 & 0x3;
					@Pc(1079) Class2_Sub2_Sub3 local1079;
					if (local9.anInt1512 == -1 && local9.anIntArray177 == null) {
						local832 = local9.method1201(local135, arg1 + 4, local127, local94, 4, local143);
						local1079 = local9.method1201(local135, local1048 + 4, local127, local94, 4, local143);
					} else {
						local832 = new Class2_Sub2_Sub3_Sub1(arg0, 4, arg1 + 4, arg5, arg6, arg3, local9.anInt1512, true, null);
						local1079 = new Class2_Sub2_Sub3_Sub1(arg0, 4, local1048 + 4, arg5, arg6, arg3, local9.anInt1512, true, null);
					}
					Static33.method690(arg7, arg6, arg3, local127, local832, local1079, 256, arg1, Static38.anIntArray85[arg1] * local520, Static91.anIntArray198[arg1] * local520, local160);
				}
			}
		}
	}
}
