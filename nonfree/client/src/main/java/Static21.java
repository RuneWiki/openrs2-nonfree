import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	public static int anInt465;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt454 = 0;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	public static int anInt457 = 0;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString22 = "Use";

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	public static int anInt460 = 0;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "S")
	public static short aShort6 = 32767;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "[I")
	public static int[] anIntArray56 = new int[500];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZIIIII[Lclient!rm;[BII)[I")
	public static int[] method368(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class154[] arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = (arg0 & 0x7) * 8;
		@Pc(21) int local21;
		@Pc(36) int local36;
		if (!arg1) {
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				for (local21 = 0; local21 < 8; local21++) {
					local36 = arg5 + Static119.method4235(arg2, local16 & 0x7, local21 & 0x7);
					@Pc(49) int local49 = arg4 + Static183.method3241(local21 & 0x7, local16 & 0x7, arg2);
					if (local36 > 0 && local36 < 103 && local49 > 0 && local49 < 103) {
						arg6[arg9].anIntArrayArray32[local36][local49] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(95) byte local95;
		if (arg1) {
			local95 = 1;
		} else {
			local95 = 4;
		}
		@Pc(105) int local105 = (arg3 & 0x7) * 8;
		@Pc(110) Class2_Sub16 local110 = new Class2_Sub16(arg7);
		local36 = (arg3 & 0x1FFFFFF8) << 3;
		local21 = (arg0 & 0xFFFFFFF8) << 3;
		@Pc(124) byte local124 = 0;
		@Pc(126) byte local126 = 0;
		if (arg2 == 1) {
			local126 = 1;
		} else if (arg2 == 2) {
			local124 = 1;
			local126 = 1;
		} else if (arg2 == 3) {
			local124 = 1;
		}
		@Pc(168) int local168;
		@Pc(240) int local240;
		@Pc(253) int local253;
		@Pc(285) int local285;
		@Pc(294) int local294;
		@Pc(320) int local320;
		@Pc(312) int local312;
		for (@Pc(154) int local154 = 0; local154 < local95; local154++) {
			for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
				for (local168 = 0; local168 < 64; local168++) {
					if (arg8 != local154 || local7 > local163 || local7 + 8 < local163 || local168 < local105 || local105 + 8 < local168) {
						Static218.method3618(-1, -1, false, arg1, 0, local110, 0, 0, 0, 0, 0);
					} else if (local7 + 8 == local163 || local168 == local105 + 8) {
						if (arg2 == 0) {
							local240 = arg5 + local163 - local7;
							local253 = arg4 + local168 - local105;
						} else if (arg2 == 1) {
							local253 = local7 + arg4 + 8 - local163;
							local240 = local168 + arg5 - local105;
						} else if (arg2 == 2) {
							local253 = local105 + arg4 + 8 - local168;
							local240 = arg5 + local7 + 8 - local163;
						} else {
							local240 = arg5 + local105 + 8 - local168;
							local253 = local163 + arg4 - local7;
						}
						Static218.method3618(local240, local253, true, arg1, arg9, local110, 0, 0, local163 + local21, 0, local36 + local168);
					} else {
						local240 = arg5 + Static119.method4235(arg2, local163 & 0x7, local168 & 0x7);
						local253 = arg4 + Static183.method3241(local168 & 0x7, local163 & 0x7, arg2);
						Static218.method3618(local240, local253, false, arg1, arg9, local110, local124, local126, local21 + local163, arg2, local168 + local36);
						if (local163 == 63 || local168 == 63) {
							local285 = local163 == 63 ? 64 : local163;
							local294 = local168 == 63 ? 64 : local168;
							if (arg2 == 0) {
								local320 = local285 + arg5 - local7;
								local312 = local294 + arg4 - local105;
							} else if (arg2 == 1) {
								local320 = local294 + arg5 - local105;
								local312 = local7 + arg4 + 8 - local285;
							} else if (arg2 == 2) {
								local312 = local105 + arg4 + 8 - local294;
								local320 = local7 + arg5 + 8 - local285;
							} else {
								local312 = arg4 + local285 - local7;
								local320 = local105 + arg5 + 8 - local294;
							}
							if (local320 >= 0 && local320 < 104 && local312 >= 0 && local312 < 104) {
								Static9.anIntArrayArrayArray7[arg9][local320][local312] = Static9.anIntArrayArrayArray7[arg9][local240 + local124][local126 + local253];
							}
						}
					}
				}
			}
		}
		@Pc(524) boolean local524 = false;
		@Pc(614) int local614;
		@Pc(657) int local657;
		while (local110.aByteArray17.length > local110.anInt2789) {
			local168 = local110.method2146();
			if (local168 == 128) {
				local524 = true;
				Static9.anIntArray300[0] = local110.method2130();
				Static9.anIntArray300[1] = local110.method2191();
				Static9.anIntArray300[2] = local110.method2191();
				Static9.anIntArray300[3] = local110.method2191();
				Static9.anIntArray300[4] = local110.method2130();
			} else {
				if (local168 != 129) {
					local110.anInt2789--;
					break;
				}
				for (local240 = 0; local240 < 4; local240++) {
					@Pc(565) byte local565 = local110.method2170();
					if (local565 == 0) {
						if (arg8 >= local240) {
							local285 = arg5;
							if (arg5 < 0) {
								local285 = 0;
							} else if (arg5 >= 104) {
								local285 = 104;
							}
							local294 = arg5 + 7;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 >= 104) {
								local294 = 104;
							}
							local320 = arg4;
							if (arg4 < 0) {
								local320 = 0;
							} else if (arg4 >= 104) {
								local320 = 104;
							}
							local312 = arg4 + 7;
							if (local312 < 0) {
								local312 = 0;
							} else if (local312 >= 104) {
								local312 = 104;
							}
							while (local285 < local294) {
								while (local320 < local312) {
									Static76.aByteArrayArrayArray5[arg9][local285][local320] = 0;
									local320++;
								}
								local285++;
							}
						}
					} else if (local565 == 1) {
						for (local285 = 0; local285 < 64; local285 += 4) {
							for (local294 = 0; local294 < 64; local294 += 4) {
								@Pc(593) byte local593 = local110.method2170();
								if (arg8 >= local240) {
									for (local312 = local285; local312 < local285 + 4; local312++) {
										for (local614 = local294; local614 < local294 + 4; local614++) {
											if (local312 >= local7 && local312 < local7 + 8 && local105 <= local614 && local105 + 8 > local105) {
												local657 = arg5 + Static119.method4235(arg2, local312 & 0x7, local614 & 0x7);
												@Pc(670) int local670 = arg4 + Static183.method3241(local614 & 0x7, local312 & 0x7, arg2);
												if (local657 >= 0 && local657 < 104 && local670 >= 0 && local670 < 104) {
													Static76.aByteArrayArrayArray5[arg9][local657][local670] = local593;
												}
											}
										}
									}
								}
							}
						}
					} else if (local565 != 2) {
					}
				}
			}
		}
		if (Static116.aBoolean184 && !arg1) {
			@Pc(849) Class100 local849 = null;
			while (true) {
				while (local110.aByteArray17.length > local110.anInt2789) {
					local240 = local110.method2146();
					if (local240 == 0) {
						local849 = new Class100(local110);
					} else if (local240 == 1) {
						local253 = local110.method2146();
						if (local253 > 0) {
							for (local285 = 0; local285 < local253; local285++) {
								@Pc(919) Class156 local919 = new Class156(local110);
								if (local919.anInt4991 == 31) {
									@Pc(930) Class36 local930 = Static200.method3400(local110.method2130());
									local919.method3988(local930.anInt1449, local930.anInt1441, local930.anInt1442, local930.anInt1450);
								}
								local320 = local919.anInt4995 >> 7;
								local312 = local919.anInt4984 >> 7;
								if (arg8 == local919.anInt4993 && local7 <= local320 && local7 + 8 > local320 && local312 >= local105 && local312 < local105 + 8) {
									local614 = (arg5 << 7) + Static203.method3463(local919.anInt4995 & 0x3FF, arg2, local919.anInt4984 & 0x3FF);
									local657 = Static141.method2500(local919.anInt4984 & 0x3FF, arg2, local919.anInt4995 & 0x3FF) + (arg4 << 7);
									local919.anInt4995 = local614;
									local320 = local919.anInt4995 >> 7;
									local919.anInt4984 = local657;
									local312 = local919.anInt4984 >> 7;
									if (local320 >= 0 && local312 >= 0 && local320 < 104 && local312 < 104) {
										local919.aBoolean330 = (Static13.aByteArrayArrayArray2[1][local320][local312] & 0x2) != 0;
										local919.anInt4986 = Static9.anIntArrayArrayArray7[local919.anInt4993][local320][local312] - local919.anInt4986;
										Static212.method3542(local919);
									}
								}
							}
						}
					} else if (local240 == 2) {
						if (local849 == null) {
							local849 = new Class100();
						}
						local849.method2851(local110);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local849 == null) {
					local849 = new Class100();
				}
				Static90.aClass100ArrayArray1[arg5 >> 3][arg4 >> 3] = local849;
				break;
			}
		}
		local168 = arg5 + 7;
		local240 = arg4 + 7;
		for (local253 = arg5; local253 < local168; local253++) {
			for (local285 = arg4; local285 < local240; local285++) {
				Static76.aByteArrayArrayArray5[arg9][local253][local285] = 0;
			}
		}
		return local524 ? Static9.anIntArray300 : null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/Object;Lclient!la;)V")
	public static void method369(@OriginalArg(1) Object arg0, @OriginalArg(2) Class102 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg1.anEventQueue1.peekEvent() != null; local12++) {
			Static138.method2475(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
