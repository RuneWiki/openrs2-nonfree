import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!gga", name = "l", descriptor = "Lclient!f;")
	public static Class73 aClass73_14;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIB)Z")
	public static boolean method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static384.anInt6641 && Static191.anInt4134 >= arg2 && arg6 >= Static112.anInt2687 && arg4 <= Static333.anInt6022) {
			Static209.method7867(arg0, arg6, arg2, arg4, arg5, arg1, arg3);
		} else {
			Static262.method4034(arg2, arg1, arg0, arg3, arg4, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BZLclient!ol;)V")
	public static void method3061(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class25_Sub2_Sub2_Sub5 arg1) {
		@Pc(17) Class122 local17 = arg1.method6683();
		if (arg1.anInt8580 == 0) {
			Static516.anInt8891 = 0;
			Static448.anInt10226 = -1;
			arg1.anInt8579 = 0;
			return;
		}
		if (arg1.anInt8545 != -1 && arg1.anInt8492 == 0) {
			@Pc(47) Class270 local47 = Static245.aClass155_1.method3820(arg1.anInt8545);
			if (arg1.anInt8578 > 0 && local47.anInt7684 == 0) {
				Static448.anInt10226 = -1;
				Static516.anInt8891 = 0;
				arg1.anInt8579++;
				return;
			}
			if (arg1.anInt8578 <= 0 && local47.anInt7695 == 0) {
				Static516.anInt8891 = 0;
				arg1.anInt8579++;
				Static448.anInt10226 = -1;
				return;
			}
		}
		@Pc(118) Class270 local118;
		@Pc(105) Class250 local105;
		if (arg1.anInt8548 != -1 && Static397.anInt6998 >= arg1.anInt8525) {
			local105 = Static386.aClass23_1.method228(arg1.anInt8548);
			if (local105.aBoolean484 && local105.anInt7025 != -1) {
				local118 = Static245.aClass155_1.method3820(local105.anInt7025);
				if (arg1.anInt8578 > 0 && local118.anInt7684 == 0) {
					Static448.anInt10226 = -1;
					Static516.anInt8891 = 0;
					arg1.anInt8579++;
					return;
				}
				if (arg1.anInt8578 <= 0 && local118.anInt7695 == 0) {
					arg1.anInt8579++;
					Static448.anInt10226 = -1;
					Static516.anInt8891 = 0;
					return;
				}
			}
		}
		if (arg1.anInt8548 != -1 && Static397.anInt6998 >= arg1.anInt8525) {
			local105 = Static386.aClass23_1.method228(arg1.anInt8548);
			if (local105.aBoolean484 && local105.anInt7025 != -1) {
				local118 = Static245.aClass155_1.method3820(local105.anInt7025);
				if (arg1.anInt8578 > 0 && local118.anInt7684 == 0) {
					Static448.anInt10226 = -1;
					Static516.anInt8891 = 0;
					arg1.anInt8579++;
					return;
				}
				if (arg1.anInt8578 <= 0 && local118.anInt7695 == 0) {
					Static516.anInt8891 = 0;
					arg1.anInt8579++;
					Static448.anInt10226 = -1;
					return;
				}
			}
		}
		@Pc(229) int local229 = arg1.anInt8476;
		@Pc(232) int local232 = arg1.anInt8482;
		@Pc(248) int local248 = arg1.anIntArray512[arg1.anInt8580 - 1] * 512 + arg1.method6668() * 256;
		@Pc(264) int local264 = arg1.anIntArray513[arg1.anInt8580 - 1] * 512 + arg1.method6668() * 256;
		if (local248 <= local229) {
			if (local229 > local248) {
				if (local264 > local232) {
					arg1.method6662(6144);
				} else if (local264 < local232) {
					arg1.method6662(2048);
				} else {
					arg1.method6662(4096);
				}
			} else if (local232 < local264) {
				arg1.method6662(8192);
			} else if (local264 < local232) {
				arg1.method6662(0);
			}
		} else if (local264 > local232) {
			arg1.method6662(10240);
		} else if (local232 <= local264) {
			arg1.method6662(12288);
		} else {
			arg1.method6662(14336);
		}
		@Pc(358) byte local358 = arg1.aByteArray209[arg1.anInt8580 - 1];
		if (!arg0 && (local248 - local229 > 1024 || local248 - local229 < -1024 || local264 - local232 > 1024 || local264 - local232 < -1024)) {
			arg1.anInt8482 = local264;
			arg1.anInt8476 = local248;
			arg1.method6672(false, arg1.anInt8500);
			Static516.anInt8891 = 0;
			Static448.anInt10226 = -1;
			if (arg1.anInt8578 > 0) {
				arg1.anInt8578--;
			}
			arg1.anInt8580--;
			return;
		}
		@Pc(423) int local423 = 16;
		@Pc(425) boolean local425 = true;
		if (arg1 instanceof Class25_Sub2_Sub2_Sub5_Sub2) {
			local425 = ((Class25_Sub2_Sub2_Sub5_Sub2) arg1).aClass213_1.aBoolean436;
		}
		@Pc(442) int local442;
		if (local425) {
			local442 = arg1.anInt8500 - arg1.aClass252_7.anInt7295;
			if (local442 != 0 && arg1.anInt8536 == -1 && arg1.anInt8506 != 0) {
				local423 = 8;
			}
			if (!arg0 && arg1.anInt8580 > 2) {
				local423 = 24;
			}
			if (!arg0 && arg1.anInt8580 > 3) {
				local423 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt8580 > 1) {
				local423 = 24;
			}
			if (!arg0 && arg1.anInt8580 > 2) {
				local423 = 32;
			}
		}
		if (arg1.anInt8579 > 0 && arg1.anInt8580 > 1) {
			local423 = 32;
			arg1.anInt8579--;
		}
		if (local358 == 2) {
			local423 <<= 0x1;
		} else if (local358 == 0) {
			local423 >>= 0x1;
		}
		Static516.anInt8891 = 0;
		if (local17.anInt4193 != -1) {
			local423 <<= 0x9;
			if (arg1.anInt8580 == 1) {
				local442 = arg1.anInt8577 * arg1.anInt8577;
				@Pc(575) int local575 = (arg1.anInt8476 > local248 ? arg1.anInt8476 - local248 : local248 + -arg1.anInt8476) << 9;
				@Pc(592) int local592 = (arg1.anInt8482 <= local264 ? local264 - arg1.anInt8482 : arg1.anInt8482 - local264) << 9;
				@Pc(603) int local603 = local592 >= local575 ? local592 : local575;
				@Pc(610) int local610 = local17.anInt4193 * 2 * local603;
				if (local610 < local442) {
					arg1.anInt8577 /= 2;
				} else if (local603 < local442 / 2) {
					arg1.anInt8577 -= local17.anInt4193;
					if (arg1.anInt8577 < 0) {
						arg1.anInt8577 = 0;
					}
				} else if (local423 > arg1.anInt8577) {
					arg1.anInt8577 += local17.anInt4193;
					if (arg1.anInt8577 > local423) {
						arg1.anInt8577 = local423;
					}
				}
			} else if (local423 > arg1.anInt8577) {
				arg1.anInt8577 += local17.anInt4193;
				if (local423 < arg1.anInt8577) {
					arg1.anInt8577 = local423;
				}
			} else if (arg1.anInt8577 > 0) {
				arg1.anInt8577 -= local17.anInt4193;
				if (arg1.anInt8577 < 0) {
					arg1.anInt8577 = 0;
				}
			}
			local423 = arg1.anInt8577 >> 9;
			if (local423 < 1) {
				local423 = 1;
			}
		}
		if (local248 == local229 && local232 == local264) {
			Static448.anInt10226 = -1;
		} else {
			if (local248 > local229) {
				Static516.anInt8891 |= 0x4;
				arg1.anInt8476 += local423;
				if (arg1.anInt8476 > local248) {
					arg1.anInt8476 = local248;
				}
			} else if (local248 < local229) {
				Static516.anInt8891 |= 0x8;
				arg1.anInt8476 -= local423;
				if (local248 > arg1.anInt8476) {
					arg1.anInt8476 = local248;
				}
			}
			if (local232 < local264) {
				arg1.anInt8482 += local423;
				Static516.anInt8891 |= 0x1;
				if (local264 < arg1.anInt8482) {
					arg1.anInt8482 = local264;
				}
			} else if (local232 > local264) {
				arg1.anInt8482 -= local423;
				Static516.anInt8891 |= 0x2;
				if (local264 > arg1.anInt8482) {
					arg1.anInt8482 = local264;
				}
			}
			if (local423 < 32) {
				Static448.anInt10226 = local358;
			} else {
				Static448.anInt10226 = 2;
			}
		}
		if (local248 == arg1.anInt8476 && arg1.anInt8482 == local264) {
			if (arg1.anInt8578 > 0) {
				arg1.anInt8578--;
			}
			arg1.anInt8580--;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method3065(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(23) int local23 = arg1[arg2 + local12] & 0xFF;
			if (local23 != 0) {
				if (local23 >= 128 && local23 < 160) {
					@Pc(42) char local42 = Static349.aCharArray7[local23 - 128];
					if (local42 == '\u0000') {
						local42 = '?';
					}
					local23 = local42;
				}
				local8[local10++] = (char) local23;
			}
		}
		return new String(local8, 0, local10);
	}
}
