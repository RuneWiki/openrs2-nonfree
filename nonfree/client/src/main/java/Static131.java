import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!hp", name = "W", descriptor = "I")
	public static int anInt2691;

	@OriginalMember(owner = "client!hp", name = "jb", descriptor = "I")
	public static int anInt2701;

	@OriginalMember(owner = "client!hp", name = "kb", descriptor = "I")
	public static int anInt2702;

	@OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
	public static int anInt2686 = 0;

	@OriginalMember(owner = "client!hp", name = "T", descriptor = "I")
	public static int anInt2688 = 0;

	@OriginalMember(owner = "client!hp", name = "Y", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_62 = new Class205(77, -2);

	@OriginalMember(owner = "client!hp", name = "bb", descriptor = "Z")
	public static boolean aBoolean207 = false;

	@OriginalMember(owner = "client!hp", name = "eb", descriptor = "[S")
	public static final short[] aShortArray41 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!hp", name = "fb", descriptor = "I")
	public static int anInt2697 = 999999;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BB)Lclient!ks;")
	public static Class2_Sub10_Sub11 method2581(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class2_Sub10_Sub11 local9 = new Class2_Sub10_Sub11();
		@Pc(14) Class2_Sub16 local14 = new Class2_Sub16(arg0);
		local14.anInt6145 = local14.aByteArray112.length - 2;
		@Pc(25) int local25 = local14.method5312();
		@Pc(36) int local36 = local14.aByteArray112.length - local25 - 2 - 12;
		local14.anInt6145 = local36;
		@Pc(45) int local45 = local14.method5346();
		local9.anInt3505 = local14.method5312();
		local9.anInt3501 = local14.method5312();
		local9.anInt3500 = local14.method5312();
		local9.anInt3502 = local14.method5312();
		@Pc(76) int local76 = local14.method5350();
		@Pc(87) int local87;
		@Pc(93) int local93;
		if (local76 > 0) {
			local9.aClass246Array1 = new Class246[local76];
			for (local87 = 0; local87 < local76; local87++) {
				local93 = local14.method5312();
				@Pc(102) Class246 local102 = new Class246(Static6.method148(local93));
				local9.aClass246Array1[local87] = local102;
				while (local93-- > 0) {
					@Pc(113) int local113 = local14.method5346();
					@Pc(117) int local117 = local14.method5346();
					local102.method5609(new Class2_Sub14(local117), (long) local113);
				}
			}
		}
		local14.anInt6145 = 0;
		local9.aString37 = local14.method5363();
		local9.anIntArray685 = new int[local45];
		local9.anIntArray684 = new int[local45];
		local9.aStringArray86 = new String[local45];
		local87 = 0;
		while (local36 > local14.anInt6145) {
			local93 = local14.method5312();
			if (local93 == 3) {
				local9.aStringArray86[local87] = local14.method5364().intern();
			} else if (local93 >= 100 || local93 == 21 || local93 == 38 || local93 == 39) {
				local9.anIntArray684[local87] = local14.method5350();
			} else {
				local9.anIntArray684[local87] = local14.method5346();
			}
			local9.anIntArray685[local87++] = local93;
		}
		return local9;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIII)V")
	public static void method2582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1009) {
			Static256.method4002(Static144.aClass101_8, arg1, arg2);
		} else if (arg0 == 1012) {
			Static256.method4002(Static358.aClass101_6, arg1, arg2);
		} else if (arg0 == 1006) {
			Static256.method4002(Static161.aClass101_9, arg1, arg2);
		} else if (arg0 == 1004) {
			Static256.method4002(Static3.aClass101_1, arg1, arg2);
		} else if (arg0 == 1010) {
			Static256.method4002(Static89.aClass101_5, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;")
	public static String method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local22 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg1 > 0) {
			for (local47 = 0; local47 < arg1; local47++) {
				local52 = (int) arg2;
				arg2 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg2 * 10));
			}
			local43.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg2;
			arg2 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local22) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg3) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BC)Z")
	public static boolean method2584(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class2_Sub10_Sub2 local13 = Static217.method3611(arg0, 3);
		local13.method864();
		local13.aString14 = arg1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ml;ZLclient!ml;I)I")
	public static int method2587(@OriginalArg(0) int arg0, @OriginalArg(1) Class138_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class138_Sub1 arg3) {
		@Pc(13) int local13;
		@Pc(16) int local16;
		if (arg0 == 1) {
			local13 = arg3.anInt3871;
			local16 = arg1.anInt3871;
			if (!arg2) {
				if (local16 == -1) {
					local16 = 2001;
				}
				if (local13 == -1) {
					local13 = 2001;
				}
			}
			return local13 - local16;
		} else if (arg0 == 2) {
			return Static162.method2892(arg1.method3574().aString57, arg3.method3574().aString57, Static107.anInt2498);
		} else if (arg0 == 3) {
			if (arg3.aString46.equals("-")) {
				if (arg1.aString46.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString46.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static162.method2892(arg1.aString46, arg3.aString46, Static107.anInt2498);
			}
		} else if (arg0 == 4) {
			if (arg3.method3570()) {
				return arg1.method3570() ? 0 : 1;
			} else if (arg1.method3570()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method3565()) {
				return arg1.method3565() ? 0 : 1;
			} else if (arg1.method3565()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method3569()) {
				return arg1.method3569() ? 0 : 1;
			} else if (arg1.method3569()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg3.method3566()) {
				return arg1.method3566() ? 0 : 1;
			} else if (arg1.method3566()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local13 = arg3.anInt3884;
			local16 = arg1.anInt3884;
			if (arg2) {
				if (local16 == 1000) {
					local16 = -1;
				}
				if (local13 == 1000) {
					local13 = -1;
				}
			} else {
				if (local13 == -1) {
					local13 = 1000;
				}
				if (local16 == -1) {
					local16 = 1000;
				}
			}
			return local13 - local16;
		} else {
			return arg3.anInt3885 - arg1.anInt3885;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!fo;IIII)V")
	public static void method2588(@OriginalArg(0) Class1_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class103 local9 = arg0.method5552();
		@Pc(19) int local19 = arg0.anInt6397 - arg0.aClass247_7.anInt6566 & 0x3FFF;
		if (arg2 == -1) {
			if (local19 != 0 || arg0.anInt6418 > 25) {
				arg0.aBoolean460 = false;
				if (arg3 < 0 && local9.anInt2812 != -1) {
					arg0.anInt6423 = local9.anInt2812;
				} else if (arg3 <= 0 || local9.anInt2833 == -1) {
					arg0.anInt6423 = local9.anInt2816;
				} else {
					arg0.anInt6423 = local9.anInt2833;
				}
			} else if (!arg0.aBoolean460 || !local9.method2673(arg0.anInt6423)) {
				arg0.anInt6423 = local9.method2674();
				arg0.aBoolean460 = arg0.anInt6423 != -1;
			}
		} else if (arg0.anInt6410 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(287) int local287 = Static138.anIntArray185[arg1] - arg0.aClass247_7.anInt6566 & 0x3FFF;
			arg0.aBoolean460 = false;
			if (arg2 == 2 && local9.anInt2819 != -1) {
				if (local287 > 2048 && local287 <= 6144 && local9.anInt2827 != -1) {
					arg0.anInt6423 = local9.anInt2827;
				} else if (local287 >= 10240 && local287 < 14336 && local9.anInt2828 != -1) {
					arg0.anInt6423 = local9.anInt2828;
				} else if (local287 <= 6144 || local287 >= 10240 || local9.anInt2824 == -1) {
					arg0.anInt6423 = local9.anInt2819;
				} else {
					arg0.anInt6423 = local9.anInt2824;
				}
			} else if (arg2 == 0 && local9.anInt2836 != -1) {
				if (local287 > 2048 && local287 <= 6144 && local9.anInt2813 != -1) {
					arg0.anInt6423 = local9.anInt2813;
				} else if (local287 >= 10240 && local287 < 14336 && local9.anInt2826 != -1) {
					arg0.anInt6423 = local9.anInt2826;
				} else if (local287 <= 6144 || local287 >= 10240 || local9.anInt2820 == -1) {
					arg0.anInt6423 = local9.anInt2836;
				} else {
					arg0.anInt6423 = local9.anInt2820;
				}
			} else if (local287 > 2048 && local287 <= 6144 && local9.anInt2808 != -1) {
				arg0.anInt6423 = local9.anInt2808;
			} else if (local287 >= 10240 && local287 < 14336 && local9.anInt2841 != -1) {
				arg0.anInt6423 = local9.anInt2841;
			} else if (local287 <= 6144 || local287 >= 10240 || local9.anInt2848 == -1) {
				arg0.anInt6423 = local9.anInt2816;
			} else {
				arg0.anInt6423 = local9.anInt2848;
			}
		} else if (local19 == 0 && arg0.anInt6418 <= 25) {
			arg0.aBoolean460 = false;
			if (arg2 == 2 && local9.anInt2819 != -1) {
				arg0.anInt6423 = local9.anInt2819;
			} else if (arg2 == 0 && local9.anInt2836 != -1) {
				arg0.anInt6423 = local9.anInt2836;
			} else {
				arg0.anInt6423 = local9.anInt2816;
			}
		} else {
			if (arg2 == 2 && local9.anInt2819 != -1) {
				if (arg3 < 0 && local9.anInt2809 != -1) {
					arg0.anInt6423 = local9.anInt2809;
				} else if (arg3 <= 0 || local9.anInt2821 == -1) {
					arg0.anInt6423 = local9.anInt2819;
				} else {
					arg0.anInt6423 = local9.anInt2821;
				}
			} else if (arg2 == 0 && local9.anInt2836 != -1) {
				if (arg3 < 0 && local9.anInt2832 != -1) {
					arg0.anInt6423 = local9.anInt2832;
				} else if (arg3 <= 0 || local9.anInt2814 == -1) {
					arg0.anInt6423 = local9.anInt2836;
				} else {
					arg0.anInt6423 = local9.anInt2814;
				}
			} else if (arg3 < 0 && local9.anInt2835 != -1) {
				arg0.anInt6423 = local9.anInt2835;
			} else if (arg3 <= 0 || local9.anInt2831 == -1) {
				arg0.anInt6423 = local9.anInt2816;
			} else {
				arg0.anInt6423 = local9.anInt2831;
			}
			arg0.aBoolean460 = false;
		}
	}
}
