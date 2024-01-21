import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
	public static int[] anIntArray191 = new int[500];

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!kb;")
	public static Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	public static int anInt1646 = 0;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!vc;")
	private static Class71 aClass71_814 = Static38.method736("System update in: ");

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public static int anInt1647 = 0;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	public static int anInt1648 = 78;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_815 = Static38.method736("sideicons");

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_816 = Static38.method736("This computers address has been blocked");

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public static volatile int anInt1649 = -1;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "[Lclient!qe;")
	public static Class5_Sub11[] aClass5_Sub11Array1 = new Class5_Sub11[2048];

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_817 = aClass71_816;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!vc;")
	private static Class71 aClass71_821 = Static38.method736("Drop");

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!vc;")
	public static Class71 aClass71_818 = aClass71_821;

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "Lclient!vc;")
	private static Class71 aClass71_823 = Static38.method736("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_819 = aClass71_823;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	public static int anInt1650 = 0;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_820 = aClass71_814;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
	public static int anInt1651 = 0;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_822 = Static38.method736(": ");

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
	public static int anInt1652 = 0;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	public static volatile int anInt1653 = 0;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "[S")
	public static short[] aShortArray2 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!qe;B)Lclient!vc;")
	public static Class71 method1130(@OriginalArg(0) Class5_Sub11 arg0) {
		return Static21.method522(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!nb;Lclient!vc;BLclient!vc;)Lclient!we;")
	public static Class5_Sub1_Sub10_Sub4 method1131(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(13) int local13 = arg0.method650(arg1);
		@Pc(19) int local19 = arg0.method664(arg2, local13);
		return Static68.method1143(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIILclient!ic;IIILclient!l;)V")
	public static void method1132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class43 arg7) {
		if (Static21.aBoolean28 && (Static59.aByteArrayArrayArray2[0][arg2][arg6] & 0x2) == 0) {
			if ((Static59.aByteArrayArrayArray2[arg4][arg2][arg6] & 0x10) != 0) {
				return;
			}
			if (Static94.method1574(arg4, arg2, arg6) != Static19.anInt644) {
				return;
			}
		}
		if (Static77.anInt1920 > arg4) {
			Static77.anInt1920 = arg4;
		}
		@Pc(63) int local63 = Static51.anIntArrayArrayArray3[arg4][arg2][arg6];
		@Pc(73) int local73 = Static51.anIntArrayArrayArray3[arg4][arg2 + 1][arg6];
		@Pc(85) int local85 = Static51.anIntArrayArrayArray3[arg4][arg2 + 1][arg6 + 1];
		@Pc(95) int local95 = Static51.anIntArrayArrayArray3[arg4][arg2][arg6 + 1];
		@Pc(99) Class5_Sub1_Sub15 local99 = Static97.method1606(arg5);
		@Pc(110) int local110 = local95 + local85 + local63 + local73 >> 2;
		@Pc(124) int local124 = arg2 + (arg6 << 7) + (arg5 << 14) + 1073741824;
		if (local99.anInt2576 == 0) {
			local124 += Integer.MIN_VALUE;
		}
		@Pc(140) int local140 = arg1 + (arg0 << 6);
		if (local99.anInt2551 == 1) {
			local140 += 256;
		}
		if (local99.method1708()) {
			Static72.method1195(arg2, local99, arg4, arg0, arg6);
		}
		@Pc(192) Class5_Sub1_Sub1 local192;
		if (arg1 != 22) {
			@Pc(291) int local291;
			if (arg1 == 10 || arg1 == 11) {
				if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
					local192 = local99.method1717(10, arg0, local95, local63, local73, local85);
				} else {
					local192 = new Class5_Sub1_Sub1_Sub1(arg5, 10, arg0, local63, local73, local85, local95, local99.anInt2574, true, null);
				}
				if (local192 != null) {
					@Pc(288) int local288;
					if (arg0 == 1 || arg0 == 3) {
						local291 = local99.anInt2572;
						local288 = local99.anInt2559;
					} else {
						local288 = local99.anInt2572;
						local291 = local99.anInt2559;
					}
					@Pc(301) int local301 = 0;
					if (arg1 == 11) {
						local301 += 256;
					}
					if (arg7.method1066(arg4, arg2, arg6, local110, local291, local288, local192, local301, local124, local140) && local99.aBoolean116) {
						@Pc(325) int local325 = 15;
						if (local192 instanceof Class5_Sub1_Sub1_Sub2) {
							local325 = ((Class5_Sub1_Sub1_Sub2) local192).method253() / 4;
							if (local325 > 30) {
								local325 = 30;
							}
						}
						for (@Pc(341) int local341 = 0; local341 <= local291; local341++) {
							for (@Pc(345) int local345 = 0; local345 <= local288; local345++) {
								if (Static23.aByteArrayArrayArray1[arg4][arg2 + local341][local345 + arg6] < local325) {
									Static23.aByteArrayArrayArray1[arg4][local341 + arg2][arg6 + local345] = (byte) local325;
								}
							}
						}
					}
				}
				if (local99.aBoolean111 && arg3 != null) {
					arg3.method952(local99.aBoolean109, arg2, local99.anInt2559, arg0, arg6, local99.anInt2572);
				}
			} else if (arg1 >= 12) {
				if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
					local192 = local99.method1717(arg1, arg0, local95, local63, local73, local85);
				} else {
					local192 = new Class5_Sub1_Sub1_Sub1(arg5, arg1, arg0, local63, local73, local85, local95, local99.anInt2574, true, null);
				}
				arg7.method1066(arg4, arg2, arg6, local110, 1, 1, local192, 0, local124, local140);
				if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg4 > 0) {
					Static64.anIntArrayArrayArray9[arg4][arg2][arg6] |= 0x924;
				}
				if (local99.aBoolean111 && arg3 != null) {
					arg3.method952(local99.aBoolean109, arg2, local99.anInt2559, arg0, arg6, local99.anInt2572);
				}
			} else if (arg1 == 0) {
				if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
					local192 = local99.method1717(0, arg0, local95, local63, local73, local85);
				} else {
					local192 = new Class5_Sub1_Sub1_Sub1(arg5, 0, arg0, local63, local73, local85, local95, local99.anInt2574, true, null);
				}
				arg7.method1086(arg4, arg2, arg6, local110, local192, null, Static3.anIntArray5[arg0], 0, local124, local140);
				if (arg0 == 0) {
					if (local99.aBoolean116) {
						Static23.aByteArrayArrayArray1[arg4][arg2][arg6] = 50;
						Static23.aByteArrayArrayArray1[arg4][arg2][arg6 + 1] = 50;
					}
					if (local99.aBoolean110) {
						Static64.anIntArrayArrayArray9[arg4][arg2][arg6] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local99.aBoolean116) {
						Static23.aByteArrayArrayArray1[arg4][arg2][arg6 + 1] = 50;
						Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6 + 1] = 50;
					}
					if (local99.aBoolean110) {
						Static64.anIntArrayArrayArray9[arg4][arg2][arg6 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local99.aBoolean116) {
						Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6] = 50;
						Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6 + 1] = 50;
					}
					if (local99.aBoolean110) {
						Static64.anIntArrayArrayArray9[arg4][arg2 + 1][arg6] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local99.aBoolean116) {
						Static23.aByteArrayArrayArray1[arg4][arg2][arg6] = 50;
						Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6] = 50;
					}
					if (local99.aBoolean110) {
						Static64.anIntArrayArrayArray9[arg4][arg2][arg6] |= 0x492;
					}
				}
				if (local99.aBoolean111 && arg3 != null) {
					arg3.method946(arg1, arg0, arg6, local99.aBoolean109, arg2);
				}
				if (local99.anInt2544 != 16) {
					arg7.method1078(arg4, arg2, arg6, local99.anInt2544);
				}
			} else if (arg1 == 1) {
				if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
					local192 = local99.method1717(1, arg0, local95, local63, local73, local85);
				} else {
					local192 = new Class5_Sub1_Sub1_Sub1(arg5, 1, arg0, local63, local73, local85, local95, local99.anInt2574, true, null);
				}
				arg7.method1086(arg4, arg2, arg6, local110, local192, null, Static81.anIntArray246[arg0], 0, local124, local140);
				if (local99.aBoolean116) {
					if (arg0 == 0) {
						Static23.aByteArrayArrayArray1[arg4][arg2][arg6 + 1] = 50;
					} else if (arg0 == 1) {
						Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6 + 1] = 50;
					} else if (arg0 == 2) {
						Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6] = 50;
					} else if (arg0 == 3) {
						Static23.aByteArrayArrayArray1[arg4][arg2][arg6] = 50;
					}
				}
				if (local99.aBoolean111 && arg3 != null) {
					arg3.method946(arg1, arg0, arg6, local99.aBoolean109, arg2);
				}
			} else {
				@Pc(929) int local929;
				@Pc(959) Class5_Sub1_Sub1 local959;
				if (arg1 == 2) {
					local929 = arg0 + 1 & 0x3;
					@Pc(949) Class5_Sub1_Sub1 local949;
					if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
						local949 = local99.method1717(2, arg0 + 4, local95, local63, local73, local85);
						local959 = local99.method1717(2, local929, local95, local63, local73, local85);
					} else {
						local949 = new Class5_Sub1_Sub1_Sub1(arg5, 2, arg0 + 4, local63, local73, local85, local95, local99.anInt2574, true, null);
						local959 = new Class5_Sub1_Sub1_Sub1(arg5, 2, local929, local63, local73, local85, local95, local99.anInt2574, true, null);
					}
					arg7.method1086(arg4, arg2, arg6, local110, local949, local959, Static3.anIntArray5[arg0], Static3.anIntArray5[local929], local124, local140);
					if (local99.aBoolean110) {
						if (arg0 == 0) {
							Static64.anIntArrayArrayArray9[arg4][arg2][arg6] |= 0x249;
							Static64.anIntArrayArrayArray9[arg4][arg2][arg6 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static64.anIntArrayArrayArray9[arg4][arg2][arg6 + 1] |= 0x492;
							Static64.anIntArrayArrayArray9[arg4][arg2 + 1][arg6] |= 0x249;
						} else if (arg0 == 2) {
							Static64.anIntArrayArrayArray9[arg4][arg2 + 1][arg6] |= 0x249;
							Static64.anIntArrayArrayArray9[arg4][arg2][arg6] |= 0x492;
						} else if (arg0 == 3) {
							Static64.anIntArrayArrayArray9[arg4][arg2][arg6] |= 0x492;
							Static64.anIntArrayArrayArray9[arg4][arg2][arg6] |= 0x249;
						}
					}
					if (local99.aBoolean111 && arg3 != null) {
						arg3.method946(arg1, arg0, arg6, local99.aBoolean109, arg2);
					}
					if (local99.anInt2544 != 16) {
						arg7.method1078(arg4, arg2, arg6, local99.anInt2544);
					}
				} else if (arg1 == 3) {
					if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
						local192 = local99.method1717(3, arg0, local95, local63, local73, local85);
					} else {
						local192 = new Class5_Sub1_Sub1_Sub1(arg5, 3, arg0, local63, local73, local85, local95, local99.anInt2574, true, null);
					}
					arg7.method1086(arg4, arg2, arg6, local110, local192, null, Static81.anIntArray246[arg0], 0, local124, local140);
					if (local99.aBoolean116) {
						if (arg0 == 0) {
							Static23.aByteArrayArrayArray1[arg4][arg2][arg6 + 1] = 50;
						} else if (arg0 == 1) {
							Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6 + 1] = 50;
						} else if (arg0 == 2) {
							Static23.aByteArrayArrayArray1[arg4][arg2 + 1][arg6] = 50;
						} else if (arg0 == 3) {
							Static23.aByteArrayArrayArray1[arg4][arg2][arg6] = 50;
						}
					}
					if (local99.aBoolean111 && arg3 != null) {
						arg3.method946(arg1, arg0, arg6, local99.aBoolean109, arg2);
					}
				} else if (arg1 == 9) {
					if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
						local192 = local99.method1717(arg1, arg0, local95, local63, local73, local85);
					} else {
						local192 = new Class5_Sub1_Sub1_Sub1(arg5, arg1, arg0, local63, local73, local85, local95, local99.anInt2574, true, null);
					}
					arg7.method1066(arg4, arg2, arg6, local110, 1, 1, local192, 0, local124, local140);
					if (local99.aBoolean111 && arg3 != null) {
						arg3.method952(local99.aBoolean109, arg2, local99.anInt2559, arg0, arg6, local99.anInt2572);
					}
				} else {
					if (local99.aBoolean114) {
						if (arg0 == 1) {
							local929 = local95;
							local95 = local85;
							local85 = local73;
							local73 = local63;
							local63 = local929;
						} else if (arg0 == 2) {
							local929 = local95;
							local95 = local73;
							local73 = local929;
							local929 = local85;
							local85 = local63;
							local63 = local929;
						} else if (arg0 == 3) {
							local929 = local95;
							local95 = local63;
							local63 = local73;
							local73 = local85;
							local85 = local929;
						}
					}
					if (arg1 == 4) {
						if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
							local192 = local99.method1717(4, 0, local95, local63, local73, local85);
						} else {
							local192 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local63, local73, local85, local95, local99.anInt2574, true, null);
						}
						arg7.method1095(arg4, arg2, arg6, local110, local192, Static3.anIntArray5[arg0], arg0 * 512, 0, 0, local124, local140);
					} else if (arg1 == 5) {
						local929 = 16;
						local291 = arg7.method1072(arg4, arg2, arg6);
						if (local291 != 0) {
							local929 = Static97.method1606(local291 >> 14 & 0x7FFF).anInt2544;
						}
						if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
							local959 = local99.method1717(4, 0, local95, local63, local73, local85);
						} else {
							local959 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local63, local73, local85, local95, local99.anInt2574, true, null);
						}
						arg7.method1095(arg4, arg2, arg6, local110, local959, Static3.anIntArray5[arg0], arg0 * 512, local929 * Static35.anIntArray119[arg0], Static30.anIntArray101[arg0] * local929, local124, local140);
					} else if (arg1 == 6) {
						if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
							local192 = local99.method1717(4, 0, local95, local63, local73, local85);
						} else {
							local192 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local63, local73, local85, local95, local99.anInt2574, true, null);
						}
						arg7.method1095(arg4, arg2, arg6, local110, local192, 256, arg0, 0, 0, local124, local140);
					} else if (arg1 == 7) {
						if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
							local192 = local99.method1717(4, 0, local95, local63, local73, local85);
						} else {
							local192 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local63, local73, local85, local95, local99.anInt2574, true, null);
						}
						arg7.method1095(arg4, arg2, arg6, local110, local192, 512, arg0, 0, 0, local124, local140);
					} else if (arg1 == 8) {
						if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
							local192 = local99.method1717(4, 0, local95, local63, local73, local85);
						} else {
							local192 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local63, local73, local85, local95, local99.anInt2574, true, null);
						}
						arg7.method1095(arg4, arg2, arg6, local110, local192, 768, arg0, 0, 0, local124, local140);
					}
				}
			}
		} else if (!Static21.aBoolean28 || local99.anInt2576 != 0 || local99.aBoolean112) {
			if (local99.anInt2574 == -1 && local99.anIntArray267 == null) {
				local192 = local99.method1717(22, arg0, local95, local63, local73, local85);
			} else {
				local192 = new Class5_Sub1_Sub1_Sub1(arg5, 22, arg0, local63, local73, local85, local95, local99.anInt2574, true, null);
			}
			arg7.method1080(arg4, arg2, arg6, local110, local192, local124, local140);
			if (local99.aBoolean111 && local99.anInt2576 == 1 && arg3 != null) {
				arg3.method950(arg2, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1133() {
		aClass71_815 = null;
		aClass71_823 = null;
		aClass5_Sub11Array1 = null;
		aClass71_818 = null;
		anIntArray191 = null;
		aClass71_817 = null;
		aClass71_819 = null;
		anIntArray192 = null;
		aClass40_1 = null;
		aByteArrayArrayArray3 = null;
		aClass71_822 = null;
		aClass71_814 = null;
		aShortArray2 = null;
		aClass71_820 = null;
		aClass71_821 = null;
		aClass71_816 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1134() {
		if (Static58.aClass35_2 != null) {
			Static58.aClass35_2.method961();
			Static58.aClass35_2 = null;
		}
		Static56.method995();
		Static7.aClass43_1.method1083();
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			Static111.aClass33Array3[local31].method955();
		}
		System.gc();
		Static10.method204();
		Static97.anInt2322 = -1;
		Static76.anInt1881 = 0;
		Static32.method616();
		Static27.method571(10);
	}
}
