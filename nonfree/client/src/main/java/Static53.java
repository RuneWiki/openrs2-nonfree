import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!pa;")
	public static Class51 aClass51_31;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "Lclient!jd;")
	public static Class36 aClass36_34;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_641 = Static2.method66("scrollbar");

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_642 = Static2.method66("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_643 = Static2.method66("@gr1@");

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!ke;")
	private static Class39 aClass39_644 = Static2.method66("Connecting to friendserver");

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_645 = Static2.method66("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!ke;")
	public static Class39 aClass39_646 = Static2.method66("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Lclient!ke;")
	public static Class39 aClass39_647 = aClass39_644;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!ke;")
	public static Class39 aClass39_648 = Static2.method66("Schlie-8en");

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	public static int anInt1469 = 0;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_649 = Static2.method66("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ne;IIILclient!le;IIBI)V")
	public static void method1006(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class43 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static22.anIntArrayArrayArray3[arg0][arg6 + 1][arg7];
		@Pc(25) int local25 = Static22.anIntArrayArrayArray3[arg0][arg6 + 1][arg7 + 1];
		@Pc(33) int local33 = Static22.anIntArrayArrayArray3[arg0][arg6][arg7];
		@Pc(43) int local43 = Static22.anIntArrayArrayArray3[arg0][arg6][arg7 + 1];
		@Pc(47) Class2_Sub1_Sub5 local47 = Static48.method916(arg4);
		@Pc(57) int local57 = local43 + local13 + local33 + local25 >> 2;
		@Pc(63) int local63 = arg8 + (arg3 << 6);
		if (local47.anInt529 == 1) {
			local63 += 256;
		}
		@Pc(81) int local81 = arg6 + (arg7 << 7) + (arg4 << 14) + 1073741824;
		if (local47.anInt551 == 0) {
			local81 += Integer.MIN_VALUE;
		}
		@Pc(117) Class2_Sub1_Sub2 local117;
		if (arg8 == 22) {
			if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
				local117 = local47.method415(arg3, local43, local13, 22, local33, local25);
			} else {
				local117 = new Class2_Sub1_Sub2_Sub6(arg4, 22, arg3, local33, local13, local25, local43, local47.anInt544, true);
			}
			arg5.method1197(arg2, arg6, arg7, local57, local117, local81, local63);
			if (local47.aBoolean30 && local47.anInt551 == 1) {
				arg1.method1470(arg6, arg7);
			}
			return;
		}
		@Pc(206) int local206;
		if (arg8 == 10 || arg8 == 11) {
			if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
				local117 = local47.method415(arg3, local43, local13, 10, local33, local25);
			} else {
				local117 = new Class2_Sub1_Sub2_Sub6(arg4, 10, arg3, local33, local13, local25, local43, local47.anInt544, true);
			}
			if (local117 != null) {
				@Pc(203) int local203;
				if (arg3 == 1 || arg3 == 3) {
					local206 = local47.anInt537;
					local203 = local47.anInt528;
				} else {
					local203 = local47.anInt537;
					local206 = local47.anInt528;
				}
				@Pc(215) int local215 = 0;
				if (arg8 == 11) {
					local215 += 256;
				}
				arg5.method1201(arg2, arg6, arg7, local57, local206, local203, local117, local215, local81, local63);
			}
			if (local47.aBoolean30) {
				arg1.method1466(local47.anInt537, arg3, arg7, local47.anInt528, local47.aBoolean31, arg6);
			}
		} else if (arg8 >= 12) {
			if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
				local117 = local47.method415(arg3, local43, local13, arg8, local33, local25);
			} else {
				local117 = new Class2_Sub1_Sub2_Sub6(arg4, arg8, arg3, local33, local13, local25, local43, local47.anInt544, true);
			}
			arg5.method1201(arg2, arg6, arg7, local57, 1, 1, local117, 0, local81, local63);
			if (local47.aBoolean30) {
				arg1.method1466(local47.anInt537, arg3, arg7, local47.anInt528, local47.aBoolean31, arg6);
			}
		} else if (arg8 == 0) {
			if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
				local117 = local47.method415(arg3, local43, local13, 0, local33, local25);
			} else {
				local117 = new Class2_Sub1_Sub2_Sub6(arg4, 0, arg3, local33, local13, local25, local43, local47.anInt544, true);
			}
			arg5.method1206(arg2, arg6, arg7, local57, local117, null, Static20.anIntArray64[arg3], 0, local81, local63);
			if (local47.aBoolean30) {
				arg1.method1459(local47.aBoolean31, arg3, arg7, arg8, arg6);
			}
		} else if (arg8 == 1) {
			if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
				local117 = local47.method415(arg3, local43, local13, 1, local33, local25);
			} else {
				local117 = new Class2_Sub1_Sub2_Sub6(arg4, 1, arg3, local33, local13, local25, local43, local47.anInt544, true);
			}
			arg5.method1206(arg2, arg6, arg7, local57, local117, null, Static77.anIntArray276[arg3], 0, local81, local63);
			if (local47.aBoolean30) {
				arg1.method1459(local47.aBoolean31, arg3, arg7, arg8, arg6);
			}
		} else {
			@Pc(450) int local450;
			@Pc(473) Class2_Sub1_Sub2 local473;
			@Pc(487) Class2_Sub1_Sub2 local487;
			if (arg8 == 2) {
				local450 = arg3 + 1 & 0x3;
				if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
					local473 = local47.method415(arg3 + 4, local43, local13, 2, local33, local25);
					local487 = local47.method415(local450, local43, local13, 2, local33, local25);
				} else {
					local473 = new Class2_Sub1_Sub2_Sub6(arg4, 2, arg3 + 4, local33, local13, local25, local43, local47.anInt544, true);
					local487 = new Class2_Sub1_Sub2_Sub6(arg4, 2, local450, local33, local13, local25, local43, local47.anInt544, true);
				}
				arg5.method1206(arg2, arg6, arg7, local57, local473, local487, Static20.anIntArray64[arg3], Static20.anIntArray64[local450], local81, local63);
				if (local47.aBoolean30) {
					arg1.method1459(local47.aBoolean31, arg3, arg7, arg8, arg6);
				}
			} else if (arg8 == 3) {
				if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
					local117 = local47.method415(arg3, local43, local13, 3, local33, local25);
				} else {
					local117 = new Class2_Sub1_Sub2_Sub6(arg4, 3, arg3, local33, local13, local25, local43, local47.anInt544, true);
				}
				arg5.method1206(arg2, arg6, arg7, local57, local117, null, Static77.anIntArray276[arg3], 0, local81, local63);
				if (local47.aBoolean30) {
					arg1.method1459(local47.aBoolean31, arg3, arg7, arg8, arg6);
				}
			} else if (arg8 == 9) {
				if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
					local117 = local47.method415(arg3, local43, local13, arg8, local33, local25);
				} else {
					local117 = new Class2_Sub1_Sub2_Sub6(arg4, arg8, arg3, local33, local13, local25, local43, local47.anInt544, true);
				}
				arg5.method1201(arg2, arg6, arg7, local57, 1, 1, local117, 0, local81, local63);
				if (local47.aBoolean30) {
					arg1.method1466(local47.anInt537, arg3, arg7, local47.anInt528, local47.aBoolean31, arg6);
				}
			} else {
				if (local47.aBoolean26) {
					if (arg3 == 1) {
						local450 = local43;
						local43 = local25;
						local25 = local13;
						local13 = local33;
						local33 = local450;
					} else if (arg3 == 2) {
						local450 = local43;
						local43 = local13;
						local13 = local450;
						@Pc(690) int local690 = local25;
						local25 = local33;
						local33 = local690;
					} else if (arg3 == 3) {
						local450 = local43;
						local43 = local33;
						local33 = local13;
						local13 = local25;
						local25 = local450;
					}
				}
				if (arg8 == 4) {
					if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
						local117 = local47.method415(0, local43, local13, 4, local33, local25);
					} else {
						local117 = new Class2_Sub1_Sub2_Sub6(arg4, 4, 0, local33, local13, local25, local43, local47.anInt544, true);
					}
					arg5.method1176(arg2, arg6, arg7, local57, local117, Static20.anIntArray64[arg3], arg3 * 512, 0, 0, local81, local63);
				} else if (arg8 == 5) {
					local450 = 16;
					local206 = arg5.method1195(arg2, arg6, arg7);
					if (local206 > 0) {
						local450 = Static48.method916(local206 >> 14 & 0x7FFF).anInt539;
					}
					if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
						local487 = local47.method415(0, local43, local13, 4, local33, local25);
					} else {
						local487 = new Class2_Sub1_Sub2_Sub6(arg4, 4, 0, local33, local13, local25, local43, local47.anInt544, true);
					}
					arg5.method1176(arg2, arg6, arg7, local57, local487, Static20.anIntArray64[arg3], arg3 * 512, local450 * Static69.anIntArray248[arg3], Static39.anIntArray166[arg3] * local450, local81, local63);
				} else if (arg8 == 6) {
					if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
						local117 = local47.method415(0, local43, local13, 4, local33, local25);
					} else {
						local117 = new Class2_Sub1_Sub2_Sub6(arg4, 4, 0, local33, local13, local25, local43, local47.anInt544, true);
					}
					arg5.method1176(arg2, arg6, arg7, local57, local117, 256, arg3, 0, 0, local81, local63);
				} else if (arg8 == 7) {
					if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
						local117 = local47.method415(0, local43, local13, 4, local33, local25);
					} else {
						local117 = new Class2_Sub1_Sub2_Sub6(arg4, 4, 0, local33, local13, local25, local43, local47.anInt544, true);
					}
					arg5.method1176(arg2, arg6, arg7, local57, local117, 512, arg3, 0, 0, local81, local63);
				} else if (arg8 == 8) {
					if (local47.anInt544 == -1 && local47.anIntArray61 == null) {
						local473 = local47.method415(0, local43, local13, 4, local33, local25);
					} else {
						local473 = new Class2_Sub1_Sub2_Sub6(arg4, 4, 0, local33, local13, local25, local43, local47.anInt544, true);
					}
					arg5.method1176(arg2, arg6, arg7, local57, local473, 768, arg3, 0, 0, local81, local63);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ec;B)Z")
	public static boolean method1007(@OriginalArg(0) Class2_Sub1_Sub6 arg0) {
		@Pc(13) int local13 = arg0.anInt722;
		if (local13 >= 1 && local13 <= 200 || !(local13 < 701 || local13 > 900)) {
			if (local13 >= 801) {
				local13 -= 701;
			} else if (local13 >= 701) {
				local13 -= 601;
			} else if (local13 < 101) {
				local13--;
			} else {
				local13 -= 101;
			}
			Static84.method2048(0, Static25.aClass39_343, Static20.method431(new Class39[] { Static79.aClass39_1261, Static75.aClass39Array4[local13] }), 32, 0, 0);
			Static84.method2048(0, Static109.aClass39_1334, Static20.method431(new Class39[] { Static79.aClass39_1261, Static75.aClass39Array4[local13] }), 10, 0, 0);
			return true;
		} else if (local13 >= 401 && local13 <= 500) {
			Static84.method2048(0, Static25.aClass39_343, Static20.method431(new Class39[] { Static79.aClass39_1261, arg0.aClass39_341 }), 9, 0, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method1008() {
		aClass39_642 = null;
		aClass36_34 = null;
		aClass39_644 = null;
		aClass39_648 = null;
		aClass39_641 = null;
		aClass39_647 = null;
		aClass51_31 = null;
		aClass39_645 = null;
		aClass39_643 = null;
		aClass39_646 = null;
		aClass39_649 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method1009() {
		for (@Pc(26) Class2_Sub3 local26 = (Class2_Sub3) Static89.aClass34_44.method872(); local26 != null; local26 = (Class2_Sub3) Static89.aClass34_44.method879()) {
			if (local26.anInt499 > 0) {
				local26.anInt499--;
			}
			if (local26.anInt499 != 0) {
				if (local26.anInt494 > 0) {
					local26.anInt494--;
				}
				if (local26.anInt494 == 0 && local26.anInt500 >= 1 && local26.anInt497 >= 1 && local26.anInt500 <= 102 && local26.anInt497 <= 102 && (local26.anInt492 < 0 || Static102.method1974(local26.anInt492, local26.anInt488))) {
					Static96.method1848(local26.anInt500, local26.anInt495, local26.anInt487, local26.anInt497, local26.anInt488, local26.anInt492, local26.anInt502);
					local26.anInt494 = -1;
					if (local26.anInt496 == local26.anInt492 && local26.anInt496 == -1) {
						local26.method2045();
					} else if (local26.anInt492 == local26.anInt496 && local26.anInt487 == local26.anInt490 && local26.anInt488 == local26.anInt501) {
						local26.method2045();
					}
				}
			} else if (local26.anInt496 < 0 || Static102.method1974(local26.anInt496, local26.anInt501)) {
				Static96.method1848(local26.anInt500, local26.anInt495, local26.anInt490, local26.anInt497, local26.anInt501, local26.anInt496, local26.anInt502);
				local26.method2045();
			}
		}
	}
}
