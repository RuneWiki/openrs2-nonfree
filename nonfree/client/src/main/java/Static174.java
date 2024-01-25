import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
	public static int anInt3625;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString131 = "Select";

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString133 = "Loaded update list";

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	public static int anInt3622 = -1;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Lclient!jl;")
	public static final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "Z")
	public static boolean aBoolean197 = true;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I")
	public static int method2862(@OriginalArg(0) int arg0) {
		@Pc(12) Class200 local12 = Static160.method2551(arg0);
		@Pc(15) int local15 = local12.anInt6198;
		@Pc(18) int local18 = local12.anInt6197;
		@Pc(21) int local21 = local12.anInt6200;
		@Pc(28) int local28 = Class20.anIntArray22[local21 - local18];
		return Static38.anIntArray55[local15] >> local18 & local28;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public static void method2863() {
		for (@Pc(8) int local8 = -1; local8 < Static170.anInt6275; local8++) {
			@Pc(16) int local16;
			if (local8 == -1) {
				local16 = 2047;
			} else {
				local16 = Static235.anIntArray377[local8];
			}
			@Pc(26) Class5_Sub4_Sub4_Sub1 local26 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local16];
			if (local26 != null) {
				Static182.method3250(local26.method4208(), local26);
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIZ)V")
	public static void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static352.anInt6827 == 0) {
			Static233.method4014(false);
		} else {
			Static148.anInt2912 = Static352.anInt6827;
			Static276.method4628(0);
		}
		Static336.aBoolean438 = arg3;
		Static230.anInt6558 = arg1;
		Static189.anInt3968 = arg2;
		Static193.method1908(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III[B)Z")
	public static boolean method2865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub4 local12 = new Class3_Sub4(arg2);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local12.method3646();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(64) int local64;
				@Pc(94) Class170 local94;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method3633();
										if (local37 == 0) {
											continue label68;
										}
										local12.method3643();
									}
									local37 = local12.method3633();
									if (local37 == 0) {
										continue label68;
									}
									local29 += local37 - 1;
									@Pc(52) int local52 = local29 & 0x3F;
									@Pc(58) int local58 = local29 >> 6 & 0x3F;
									local64 = local12.method3643() >> 2;
									local68 = local58 + arg0;
									local72 = arg1 + local52;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (Static162.anInt2152 - 1 <= local68);
					} while (Static122.anInt2632 - 1 <= local72);
					local94 = Static268.method4553(local14);
				} while (local64 == 22 && !Static271.aBoolean338 && local94.anInt5227 == 0 && local94.anInt5211 != 1 && !local94.aBoolean316);
				local31 = true;
				if (!local94.method4405()) {
					local7 = false;
					Static290.anInt5803++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)Z")
	public static boolean method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static213.method3734(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static69.aClass22Array1[arg0].method4672(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static55.anInt5576) {
					if (!Static20.method420(local10, local23, local14)) {
						return false;
					}
					if (!Static20.method420(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static20.method420(local10, local27, local14)) {
						return false;
					}
					if (!Static20.method420(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static20.method420(local10, local31, local14)) {
					return false;
				}
				if (!Static20.method420(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static300.anInt5966) {
					if (!Static20.method420(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static20.method420(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static20.method420(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static20.method420(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static20.method420(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static20.method420(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static55.anInt5576) {
					if (!Static20.method420(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static20.method420(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static20.method420(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static20.method420(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static20.method420(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static20.method420(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static300.anInt5966) {
					if (!Static20.method420(local10, local23, local14)) {
						return false;
					}
					if (!Static20.method420(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static20.method420(local10, local27, local14)) {
						return false;
					}
					if (!Static20.method420(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static20.method420(local10, local31, local14)) {
					return false;
				}
				if (!Static20.method420(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static20.method420(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static20.method420(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static20.method420(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static20.method420(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static20.method420(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLclient!sj;)V")
	public static void method2867(@OriginalArg(1) Class181 arg0) {
		@Pc(11) int local11 = arg0.anInt5755;
		if (local11 == 324) {
			if (Static12.anInt322 == -1) {
				Static240.anInt4808 = arg0.anInt5748;
				Static12.anInt322 = arg0.anInt5778;
			}
			if (Static249.aClass174_3.aBoolean337) {
				arg0.anInt5778 = Static12.anInt322;
			} else {
				arg0.anInt5778 = Static240.anInt4808;
			}
		} else if (local11 == 325) {
			if (Static12.anInt322 == -1) {
				Static240.anInt4808 = arg0.anInt5748;
				Static12.anInt322 = arg0.anInt5778;
			}
			if (Static249.aClass174_3.aBoolean337) {
				arg0.anInt5778 = Static240.anInt4808;
			} else {
				arg0.anInt5778 = Static12.anInt322;
			}
		} else if (local11 == 327) {
			arg0.anInt5745 = 150;
			arg0.anInt5712 = (int) (Math.sin((double) Static51.anInt1101 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt5706 = 5;
			arg0.anInt5762 = -1;
		} else if (local11 == 328) {
			if (Static349.aClass5_Sub4_Sub4_Sub1_2.aString126 == null) {
				arg0.anInt5762 = 0;
				arg0.anInt5765 = 0;
			} else {
				arg0.anInt5745 = 150;
				arg0.anInt5712 = (int) (Math.sin((double) Static51.anInt1101 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt5762 = 2047;
				arg0.anInt5706 = 5;
				arg0.anInt5765 = Static15.method386(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126);
				arg0.anInt5754 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt4932;
				arg0.anInt5744 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt4928;
				arg0.anInt5741 = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt4911;
				arg0.anInt5774 = 0;
			}
		}
	}
}
