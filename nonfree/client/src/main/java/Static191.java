import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static int anInt4270;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	public static int anInt4274 = 0;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString287 = "wave:";

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[50][];

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Z")
	public static boolean aBoolean213 = true;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIILclient!sa;JZ)V")
	public static void method3226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class148 local6 = new Class148();
		local6.aClass9_10 = arg4;
		local6.anInt5465 = arg1 * 128 + 64;
		local6.anInt5466 = arg2 * 128 + 64;
		local6.anInt5464 = arg3;
		local6.aLong181 = arg5;
		if (Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2] = new Class1_Sub16(arg0, arg1, arg2);
		}
		Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2].aClass148_1 = local6;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3227(@OriginalArg(0) String arg0) {
		Static135.aString214 = arg0;
		if (Static38.aClass28_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(19) String local19 = Static38.aClass28_1.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static38.aClass28_1.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local19 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static224.method3730(Static31.method591() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static267.method83(Static38.aClass28_1.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(88) Throwable local88) {
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII[Lclient!jb;IZ[BII)[I")
	public static int[] method3228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class65[] arg5, @OriginalArg(8) byte[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(11) int local11 = (arg0 & 0x7) * 8;
		@Pc(27) int local27;
		@Pc(41) int local41;
		@Pc(54) int local54;
		for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
			for (local27 = 0; local27 < 8; local27++) {
				local41 = arg4 + Static253.method2832(arg1, local27 & 0x7, local23 & 0x7);
				local54 = arg2 + Static223.method3706(arg1, local23 & 0x7, local27 & 0x7);
				if (local41 > 0 && local41 < 103 && local54 > 0 && local54 < 103) {
					arg5[arg3].anIntArrayArray19[local41][local54] &= 0xFFDFFFFF;
				}
			}
		}
		@Pc(100) int local100 = (arg8 & 0x7) * 8;
		local27 = (arg0 & 0x1FFFFFF8) << 3;
		@Pc(111) Class1_Sub13 local111 = new Class1_Sub13(arg6);
		local41 = (arg8 & 0xFFFFFFF8) << 3;
		@Pc(178) int local178;
		@Pc(190) int local190;
		@Pc(220) int local220;
		@Pc(227) int local227;
		@Pc(247) int local247;
		@Pc(240) int local240;
		for (local54 = 0; local54 < 4; local54++) {
			for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
				for (@Pc(127) int local127 = 0; local127 < 64; local127++) {
					if (local54 != arg7 || local11 > local123 || local123 > local11 + 8 || local127 < local100 || local127 > local100 + 8) {
						Static43.method921(0, -1, 0, 0, -1, 0, false, local111);
					} else if (local123 == local11 + 8 || local127 == local100 + 8) {
						if (arg1 == 0) {
							local178 = local123 + arg4 - local11;
							local190 = arg2 + local127 - local100;
						} else if (arg1 == 1) {
							local178 = arg4 + local127 - local100;
							local190 = local11 + arg2 + 8 - local123;
						} else if (arg1 == 2) {
							local178 = local11 + arg4 + 8 - local123;
							local190 = local100 + arg2 + 8 - local127;
						} else {
							local178 = local100 + arg4 + 8 - local127;
							local190 = arg2 + local123 - local11;
						}
						Static43.method921(local41 + local127, local178, local123 + local27, arg3, local190, 0, true, local111);
					} else {
						local178 = arg4 + Static253.method2832(arg1, local127 & 0x7, local123 & 0x7);
						local190 = Static223.method3706(arg1, local123 & 0x7, local127 & 0x7) + arg2;
						Static43.method921(local127 + local41, local178, local123 + local27, arg3, local190, arg1, false, local111);
						if (local123 == 63 || local127 == 63) {
							local220 = local123 == 63 ? 64 : local123;
							local227 = local127 == 63 ? 64 : local127;
							if (arg1 == 0) {
								local240 = local227 + arg2 - local100;
								local247 = arg4 + local220 - local11;
							} else if (arg1 == 1) {
								local247 = local227 + arg4 - local100;
								local240 = arg2 + local11 + 8 - local220;
							} else if (arg1 == 2) {
								local247 = local11 + arg4 + 8 - local220;
								local240 = local100 + arg2 + 8 - local227;
							} else {
								local247 = local100 + arg4 + 8 - local227;
								local240 = arg2 + local220 - local11;
							}
							if (local247 >= 0 && local247 < 104 && local240 >= 0 && local240 < 104) {
								Static38.anIntArrayArrayArray6[local54][local247][local240] = Static38.anIntArrayArrayArray6[local54][local178][local190];
							}
						}
					}
				}
			}
		}
		@Pc(464) boolean local464 = false;
		while (local111.aByteArray29.length > local111.anInt2395) {
			local178 = local111.method1772();
			if (local178 == 128) {
				local464 = true;
				Static8.anIntArray18[0] = local111.method1764();
				Static8.anIntArray18[1] = local111.method1798();
				Static8.anIntArray18[2] = local111.method1798();
				Static8.anIntArray18[3] = local111.method1798();
				Static8.anIntArray18[4] = local111.method1764();
			} else {
				if (local178 != 129) {
					local111.anInt2395--;
					break;
				}
				for (local190 = 0; local190 < 4; local190++) {
					@Pc(501) byte local501 = local111.method1756();
					@Pc(547) int local547;
					if (local501 == 0) {
						if (local190 <= arg7) {
							local227 = arg4;
							if (arg4 < 0) {
								local227 = 0;
							} else if (arg4 >= 104) {
								local227 = 104;
							}
							local247 = arg4 + 7;
							if (local247 < 0) {
								local247 = 0;
							} else if (local247 >= 104) {
								local247 = 104;
							}
							local240 = arg2;
							local547 = arg2 + 7;
							if (local547 < 0) {
								local547 = 0;
							} else if (local547 >= 104) {
								local547 = 104;
							}
							if (arg2 < 0) {
								local240 = 0;
							} else if (arg2 >= 104) {
								local240 = 104;
							}
							while (local247 > local227) {
								while (local547 > local240) {
									Static144.aByteArrayArrayArray12[arg3][local227][local240] = 0;
									local240++;
								}
								local227++;
							}
						}
					} else if (local501 == 1) {
						for (local227 = 0; local227 < 64; local227 += 4) {
							for (local247 = 0; local247 < 64; local247 += 4) {
								@Pc(612) byte local612 = local111.method1756();
								if (local190 <= arg7) {
									for (local547 = local227; local547 < local227 + 4; local547++) {
										for (@Pc(621) int local621 = local247; local621 < local247 + 4; local621++) {
											if (local11 <= local547 && local547 < local11 + 8 && local621 >= local100 && local100 + 8 > local100) {
												@Pc(656) int local656 = arg4 + Static253.method2832(arg1, local621 & 0x7, local547 & 0x7);
												@Pc(668) int local668 = Static223.method3706(arg1, local547 & 0x7, local621 & 0x7) + arg2;
												if (local656 >= 0 && local656 < 104 && local668 >= 0 && local668 < 104) {
													Static144.aByteArrayArrayArray12[arg3][local656][local668] = local612;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		local190 = arg2 + 7;
		local178 = arg4 + 7;
		for (local220 = arg4; local220 < local178; local220++) {
			for (local227 = arg2; local227 < local190; local227++) {
				Static144.aByteArrayArrayArray12[arg3][local220][local227] = 0;
			}
		}
		if (local464) {
			return Static8.anIntArray18;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	public static int method3229(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class2 local3 = new Class2();
		local3.anInt52 = arg1 / 128;
		local3.anInt48 = arg2 / 128;
		local3.anInt30 = arg3 / 128;
		local3.anInt53 = arg4 / 128;
		local3.anInt42 = arg0;
		local3.anInt36 = arg1;
		local3.anInt33 = arg2;
		local3.anInt31 = arg3;
		local3.anInt49 = arg4;
		local3.anInt45 = arg5;
		local3.anInt40 = arg6;
		Static255.aClass2Array2[Static217.anInt4761++] = local3;
	}
}
