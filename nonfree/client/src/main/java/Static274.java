import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt4959;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
	public static int anInt4965;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
	public static int anInt4968 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B[B)V")
	public static void method4149(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class2_Sub15 local15 = new Class2_Sub15(arg0);
		while (true) {
			@Pc(19) int local19;
			@Pc(40) int local40;
			@Pc(35) int local35;
			label45: do {
				while (true) {
					while (true) {
						local19 = local15.method4325();
						if (local19 == 0) {
							return;
						}
						if (local19 == 1) {
							@Pc(104) int[] local104 = Static515.anIntArray619 = new int[6];
							local104[0] = local15.method4294();
							local104[1] = local15.method4294();
							local104[2] = local15.method4294();
							local104[3] = local15.method4294();
							local104[4] = local15.method4294();
							local104[5] = local15.method4294();
						} else {
							if (local19 != 4) {
								continue label45;
							}
							local35 = local15.method4325();
							Static225.anIntArray268 = new int[local35];
							for (local40 = 0; local40 < local35; local40++) {
								Static225.anIntArray268[local40] = local15.method4294();
								if (Static225.anIntArray268[local40] == 65535) {
									Static225.anIntArray268[local40] = -1;
								}
							}
						}
					}
				}
			} while (local19 != 5);
			local35 = local15.method4325();
			Static565.anIntArray669 = new int[local35];
			for (local40 = 0; local40 < local35; local40++) {
				Static565.anIntArray669[local40] = local15.method4294();
				if (Static565.anIntArray669[local40] == 65535) {
					Static565.anIntArray669[local40] = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method4150() {
		if (Static412.aFloat13 < 1024.0F) {
			Static412.aFloat13 = 1024.0F;
		}
		if (Static412.aFloat13 > 3072.0F) {
			Static412.aFloat13 = 3072.0F;
		}
		while (Static447.aFloat233 >= 16384.0F) {
			Static447.aFloat233 -= 16384.0F;
		}
		while (Static447.aFloat233 < 0.0F) {
			Static447.aFloat233 += 16384.0F;
		}
		@Pc(41) int local41 = Static553.anInt9056 >> 9;
		@Pc(45) int local45 = Static264.anInt4870 >> 9;
		@Pc(51) int local51 = Static524.method7217(Static553.anInt9056, Static566.anInt9278, Static264.anInt4870);
		@Pc(53) int local53 = 0;
		@Pc(79) int local79;
		if (local41 > 3 && local45 > 3 && local41 < Static188.anInt3850 - 4 && local45 < Static49.anInt1174 - 4) {
			for (local79 = local41 - 4; local79 <= local41 + 4; local79++) {
				for (@Pc(85) int local85 = local45 - 4; local85 <= local45 + 4; local85++) {
					@Pc(89) int local89 = Static566.anInt9278;
					if (local89 < 3 && Static551.method7475(local85, local79)) {
						local89++;
					}
					@Pc(102) int local102 = 0;
					if (Static162.aClass49_Sub1_2.aByteArrayArrayArray28 != null && Static162.aClass49_Sub1_2.aByteArrayArrayArray28[local89] != null) {
						local102 = (Static162.aClass49_Sub1_2.aByteArrayArrayArray28[local89][local79][local85] & 0xFF) * 8;
					}
					if (Static421.aClass67Array7 != null && Static421.aClass67Array7[local89] != null) {
						@Pc(142) int local142 = local102 + local51 - Static421.aClass67Array7[local89].method6707(local85, local79);
						if (local53 < local142) {
							local53 = local142;
						}
					}
				}
			}
		}
		local79 = (local53 >> 2) * 1536;
		if (local79 > 786432) {
			local79 = 786432;
		}
		if (local79 < 262144) {
			local79 = 262144;
		}
		if (Static95.anInt2023 < local79) {
			Static95.anInt2023 += (local79 - Static95.anInt2023) / 24;
		} else if (Static95.anInt2023 > local79) {
			Static95.anInt2023 += (local79 - Static95.anInt2023) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!gb;B)I")
	public static int method4151(@OriginalArg(0) Class119 arg0) {
		if (Static325.aClass119_44 == arg0) {
			return 5890;
		} else if (Static113.aClass119_11 == arg0) {
			return 34167;
		} else if (arg0 == Static48.aClass119_5) {
			return 34168;
		} else if (Static224.aClass119_18 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)Z")
	public static boolean method4152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!bt;I)I")
	public static int method4153(@OriginalArg(0) Class42 arg0) {
		if (Static47.aClass42_1 == arg0) {
			return 5120;
		} else if (Static47.aClass42_2 == arg0) {
			return 5122;
		} else if (Static47.aClass42_3 == arg0) {
			return 5124;
		} else if (arg0 == Static47.aClass42_4) {
			return 5121;
		} else if (Static47.aClass42_5 == arg0) {
			return 5123;
		} else if (arg0 == Static47.aClass42_6) {
			return 5125;
		} else if (arg0 == Static47.aClass42_7) {
			return 5131;
		} else if (Static47.aClass42_8 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	public static int method4154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!kp;ZZ)V")
	public static void method4155(@OriginalArg(0) Class196 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) int local20 = arg0.anInt5146 == 0 ? arg0.anInt5130 : arg0.anInt5146;
		@Pc(29) int local29 = arg0.anInt5164 == 0 ? arg0.anInt5078 : arg0.anInt5164;
		Static478.method6776(local29, local20, Static2.aClass196ArrayArray1[arg0.anInt5112 >> 16], arg0.anInt5112, arg1);
		if (arg0.aClass196Array2 != null) {
			Static478.method6776(local29, local20, arg0.aClass196Array2, arg0.anInt5112, arg1);
		}
		@Pc(62) Class2_Sub44 local62 = (Class2_Sub44) Static217.aClass162_20.method3519((long) arg0.anInt5112);
		if (local62 != null) {
			Static322.method5000(local20, arg1, local62.anInt8608, local29);
		}
	}
}
