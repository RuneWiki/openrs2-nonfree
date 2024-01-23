import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "I")
	public static int anInt2545;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!db;")
	public static Class31 aClass31_22 = new Class31(5);

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public static int anInt2546 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!ak;)V")
	public static void method2137(@OriginalArg(1) Class7 arg0) {
		Static29.aClass7_33 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!jj;)Ljava/lang/String;")
	public static String method2138(@OriginalArg(1) Class1_Sub18 arg0) {
		return Static39.method714(arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII[Lclient!ac;BIIIZ[B)[I")
	public static int[] method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(11) int local11 = (arg7 & 0x7) * 8;
		@Pc(22) int local22;
		@Pc(37) int local37;
		if (!arg8) {
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				for (local22 = 0; local22 < 8; local22++) {
					local37 = Static195.method2962(local15 & 0x7, arg2, local22 & 0x7) + arg5;
					@Pc(49) int local49 = arg0 + Static27.method456(local15 & 0x7, arg2, local22 & 0x7);
					if (local37 > 0 && local37 < 103 && local49 > 0 && local49 < 103) {
						arg4[arg3].anIntArrayArray1[local37][local49] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(91) int local91 = (arg1 & 0x7) * 8;
		@Pc(95) byte local95;
		if (arg8) {
			local95 = 1;
		} else {
			local95 = 4;
		}
		local22 = (arg1 & 0x1FFFFFF8) << 3;
		local37 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(116) Class1_Sub18 local116 = new Class1_Sub18(arg9);
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (arg2 == 1) {
			local118 = 1;
		} else if (arg2 == 2) {
			local120 = 1;
			local118 = 1;
		} else if (arg2 == 3) {
			local120 = 1;
		}
		@Pc(162) int local162;
		@Pc(233) int local233;
		@Pc(246) int local246;
		@Pc(282) int local282;
		@Pc(289) int local289;
		@Pc(299) int local299;
		@Pc(307) int local307;
		for (@Pc(150) int local150 = 0; local150 < local95; local150++) {
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				for (local162 = 0; local162 < 64; local162++) {
					if (arg6 != local150 || local155 < local91 || local155 > local91 + 8 || local162 < local11 || local162 > local11 + 8) {
						Static84.method1405(arg8, -1, 0, 0, 0, false, 0, local116, 0, 0, -1);
					} else if (local155 == local91 + 8 || local162 == local11 + 8) {
						if (arg2 == 0) {
							local246 = local162 + arg0 - local11;
							local233 = arg5 + local155 - local91;
						} else if (arg2 == 1) {
							local246 = arg0 + local91 + 8 - local155;
							local233 = arg5 + local162 - local11;
						} else if (arg2 == 2) {
							local246 = arg0 + local11 + 8 - local162;
							local233 = local91 + arg5 + 8 - local155;
						} else {
							local246 = arg0 + local155 - local91;
							local233 = local11 + arg5 + 8 - local162;
						}
						Static84.method1405(arg8, local246, 0, arg3, 0, true, local155 + local22, local116, 0, local162 + local37, local233);
					} else {
						local233 = Static195.method2962(local155 & 0x7, arg2, local162 & 0x7) + arg5;
						local246 = arg0 + Static27.method456(local155 & 0x7, arg2, local162 & 0x7);
						Static84.method1405(arg8, local246, local120, arg3, arg2, false, local22 + local155, local116, local118, local162 + local37, local233);
						if (local155 == 63 || local162 == 63) {
							local282 = local155 == 63 ? 64 : local155;
							local289 = local162 == 63 ? 64 : local162;
							if (arg2 == 0) {
								local299 = arg5 + local282 - local91;
								local307 = local289 + arg0 - local11;
							} else if (arg2 == 1) {
								local307 = arg0 + local91 + 8 - local282;
								local299 = arg5 + local289 - local11;
							} else if (arg2 == 2) {
								local299 = local91 + arg5 + 8 - local282;
								local307 = local11 + arg0 + 8 - local289;
							} else {
								local307 = local282 + arg0 - local91;
								local299 = local11 + arg5 + 8 - local289;
							}
							if (local299 >= 0 && local299 < 104 && local307 >= 0 && local307 < 104) {
								Static163.anIntArrayArrayArray16[arg3][local299][local307] = Static163.anIntArrayArrayArray16[arg3][local120 + local233][local246 + local118];
							}
						}
					}
				}
			}
		}
		@Pc(523) boolean local523 = false;
		@Pc(641) int local641;
		@Pc(682) int local682;
		while (local116.anInt3911 < local116.aByteArray71.length) {
			local162 = local116.method3122();
			if (local162 == 128) {
				Static40.anIntArray123[0] = local116.method3107();
				Static40.anIntArray123[1] = local116.method3064();
				local523 = true;
				Static40.anIntArray123[2] = local116.method3064();
				Static40.anIntArray123[3] = local116.method3064();
				Static40.anIntArray123[4] = local116.method3107();
			} else {
				if (local162 != 129) {
					local116.anInt3911--;
					break;
				}
				for (local233 = 0; local233 < 4; local233++) {
					@Pc(598) byte local598 = local116.method3082();
					if (local598 == 0) {
						if (arg6 >= local233) {
							local282 = arg5;
							local289 = arg5 + 7;
							if (local289 < 0) {
								local289 = 0;
							} else if (local289 >= 104) {
								local289 = 104;
							}
							if (arg5 < 0) {
								local282 = 0;
							} else if (arg5 >= 104) {
								local282 = 104;
							}
							local299 = arg0;
							local307 = arg0 + 7;
							if (local307 < 0) {
								local307 = 0;
							} else if (local307 >= 104) {
								local307 = 104;
							}
							if (arg0 < 0) {
								local299 = 0;
							} else if (arg0 >= 104) {
								local299 = 104;
							}
							while (local289 > local282) {
								while (local299 < local307) {
									Static70.aByteArrayArrayArray8[arg3][local282][local299] = 0;
									local299++;
								}
								local282++;
							}
						}
					} else if (local598 == 1) {
						for (local282 = 0; local282 < 64; local282 += 4) {
							for (local289 = 0; local289 < 64; local289 += 4) {
								@Pc(620) byte local620 = local116.method3082();
								if (local233 <= arg6) {
									for (local307 = local282; local307 < local282 + 4; local307++) {
										for (local641 = local289; local641 < local289 + 4; local641++) {
											if (local91 <= local307 && local91 + 8 > local307 && local11 <= local641 && local11 + 8 > local11) {
												local682 = arg5 + Static195.method2962(local307 & 0x7, arg2, local641 & 0x7);
												@Pc(694) int local694 = Static27.method456(local307 & 0x7, arg2, local641 & 0x7) + arg0;
												if (local682 >= 0 && local682 < 104 && local694 >= 0 && local694 < 104) {
													Static70.aByteArrayArrayArray8[arg3][local682][local694] = local620;
												}
											}
										}
									}
								}
							}
						}
					} else if (local598 == 2) {
					}
				}
			}
		}
		if (Static240.aBoolean369 && !arg8) {
			@Pc(859) Class119 local859 = null;
			label289: while (true) {
				label282: do {
					while (true) {
						while (local116.anInt3911 < local116.aByteArray71.length) {
							local233 = local116.method3122();
							if (local233 == 0) {
								local859 = new Class119(local116);
							} else {
								if (local233 == 1) {
									local246 = local116.method3122();
									continue label282;
								}
								if (local233 != 2) {
									throw new IllegalStateException();
								}
								if (local859 == null) {
									local859 = new Class119();
								}
								local859.method2666(local116);
							}
						}
						if (local859 == null) {
							local859 = new Class119();
						}
						Static147.aClass119ArrayArray1[arg5 >> 3][arg0 >> 3] = local859;
						break label289;
					}
				} while (local246 <= 0);
				for (local282 = 0; local282 < local246; local282++) {
					@Pc(904) Class72 local904 = new Class72(local116);
					if (local904.anInt1964 == 31) {
						@Pc(917) Class27 local917 = Static16.method311(local116.method3107());
						local904.method1667(local917.anInt887, local917.anInt892, local917.anInt889, local917.anInt888);
					}
					local299 = local904.anInt1961 >> 7;
					local307 = local904.anInt1947 >> 7;
					if (arg6 == local904.anInt1953 && local91 <= local299 && local91 + 8 > local299 && local307 >= local11 && local11 + 8 > local307) {
						local641 = (arg5 << 7) + Static58.method999(local904.anInt1961 & 0x3FF, local904.anInt1947 & 0x3FF, arg2);
						local682 = Static100.method1634(local904.anInt1961 & 0x3FF, local904.anInt1947 & 0x3FF, arg2) + (arg0 << 7);
						local904.anInt1961 = local641;
						local299 = local904.anInt1961 >> 7;
						local904.anInt1947 = local682;
						local307 = local904.anInt1947 >> 7;
						if (local299 >= 0 && local307 >= 0 && local299 < 104 && local307 < 104) {
							local904.aBoolean141 = (Static242.aByteArrayArrayArray23[1][local299][local307] & 0x2) != 0;
							local904.anInt1965 = Static163.anIntArrayArrayArray16[local904.anInt1953][local299][local307] - local904.anInt1965;
							Static194.method2934(local904);
						}
					}
				}
			}
		}
		local233 = arg0 + 7;
		local162 = arg5 + 7;
		for (local246 = arg5; local246 < local162; local246++) {
			for (local282 = arg0; local282 < local233; local282++) {
				Static70.aByteArrayArrayArray8[arg3][local246][local282] = 0;
			}
		}
		return local523 ? Static40.anIntArray123 : null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2140(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static18.aClass163_1);
		arg0.removeFocusListener(Static18.aClass163_1);
		Static278.anInt5580 = -1;
	}
}
