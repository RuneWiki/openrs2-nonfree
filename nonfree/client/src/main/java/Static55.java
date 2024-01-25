import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_1 = new Class45(0, Static601.aClass346_18, Static601.aClass346_18, 0, 1);

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_2 = new Class45(1, Static601.aClass346_18, 2);

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_3 = new Class45(2, Static601.aClass346_18, Static601.aClass346_18, 2, 3);

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_4 = new Class45(3, Static601.aClass346_18, 3);

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_5 = new Class45(4, Static601.aClass346_18, Static601.aClass346_18, 3, 4);

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_6 = new Class45(5, Static601.aClass346_18, 4);

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_7 = new Class45(6, Static601.aClass346_18, 4);

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_8 = new Class45(7, Static601.aClass346_18, Static601.aClass346_18, 4, 5);

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_9 = new Class45(8, Static601.aClass346_18, Static601.aClass346_18, 5, 98, true, true);

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_10 = new Class45(9, Static601.aClass346_18, 99);

	@OriginalMember(owner = "client!bu", name = "w", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_11 = new Class45(10, Static601.aClass346_18, 100);

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_12 = new Class45(11, Static601.aClass346_19, Static601.aClass346_19, 0, 92, true, true);

	@OriginalMember(owner = "client!bu", name = "y", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_13 = new Class45(12, Static601.aClass346_19, Static601.aClass346_19, 92, 92);

	@OriginalMember(owner = "client!bu", name = "z", descriptor = "Lclient!bu;")
	private static final Class45 aClass45_14 = new Class45(13, Static601.aClass346_19, Static601.aClass346_19, 92, 93);

	@OriginalMember(owner = "client!bu", name = "A", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_15 = new Class45(14, Static601.aClass346_19, Static601.aClass346_19, 94, 95);

	@OriginalMember(owner = "client!bu", name = "B", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_16 = new Class45(15, Static601.aClass346_19, Static601.aClass346_19, 96, 97);

	@OriginalMember(owner = "client!bu", name = "C", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_17 = new Class45(16, Static601.aClass346_19, 97);

	@OriginalMember(owner = "client!bu", name = "D", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_18 = new Class45(17, Static601.aClass346_19, 97);

	@OriginalMember(owner = "client!bu", name = "E", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_19 = new Class45(18, Static601.aClass346_19, 100);

	@OriginalMember(owner = "client!bu", name = "F", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_20 = new Class45(19, Static601.aClass346_19, 100);

	@OriginalMember(owner = "client!bu", name = "G", descriptor = "Lclient!bu;")
	public static final Class45 aClass45_21 = new Class45(20, Static601.aClass346_19, 100);

	@OriginalMember(owner = "client!bu", name = "H", descriptor = "Lclient!gia;")
	public static Class118 aClass118_2 = null;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public static void method1207() {
		@Pc(9) int local9 = Static547.anInt8967 * 512 + 256;
		@Pc(15) int local15 = Static38.anInt905 * 512 + 256;
		@Pc(23) int local23 = Static168.method3058(Static309.anInt5138, local9, local15) - Static533.anInt8786;
		if (Static327.anInt5437 < 100) {
			if (local9 > Static509.anInt8222) {
				Static509.anInt8222 += Static554.anInt9042 + Static327.anInt5437 * (local9 - Static509.anInt8222) / 1000;
				if (local9 < Static509.anInt8222) {
					Static509.anInt8222 = local9;
				}
			}
			if (Static509.anInt8222 > local9) {
				Static509.anInt8222 -= Static327.anInt5437 * (Static509.anInt8222 - local9) / 1000 + Static554.anInt9042;
				if (local9 > Static509.anInt8222) {
					Static509.anInt8222 = local9;
				}
			}
			if (local23 > Static146.anInt2945) {
				Static146.anInt2945 += Static327.anInt5437 * (local23 - Static146.anInt2945) / 1000 + Static554.anInt9042;
				if (local23 < Static146.anInt2945) {
					Static146.anInt2945 = local23;
				}
			}
			if (Static652.anInt10382 < local15) {
				Static652.anInt10382 += Static554.anInt9042 + (local15 - Static652.anInt10382) * Static327.anInt5437 / 1000;
				if (Static652.anInt10382 > local15) {
					Static652.anInt10382 = local15;
				}
			}
			if (local23 < Static146.anInt2945) {
				Static146.anInt2945 -= Static554.anInt9042 + (Static146.anInt2945 - local23) * Static327.anInt5437 / 1000;
				if (Static146.anInt2945 < local23) {
					Static146.anInt2945 = local23;
				}
			}
			if (local15 < Static652.anInt10382) {
				Static652.anInt10382 -= Static327.anInt5437 * (Static652.anInt10382 - local15) / 1000 + Static554.anInt9042;
				if (Static652.anInt10382 < local15) {
					Static652.anInt10382 = local15;
				}
			}
		} else {
			Static509.anInt8222 = Static547.anInt8967 * 512 + 256;
			Static652.anInt10382 = Static38.anInt905 * 512 + 256;
			Static146.anInt2945 = Static168.method3058(Static309.anInt5138, Static509.anInt8222, Static652.anInt10382) - Static533.anInt8786;
		}
		local9 = Static225.anInt4206 * 512 + 256;
		local15 = Static532.anInt8768 * 512 + 256;
		local23 = Static168.method3058(Static309.anInt5138, local9, local15) - Static322.anInt5378;
		@Pc(214) int local214 = local9 - Static509.anInt8222;
		@Pc(218) int local218 = local23 - Static146.anInt2945;
		@Pc(222) int local222 = local15 - Static652.anInt10382;
		@Pc(237) int local237 = (int) Math.sqrt((double) (local222 * local222 + local214 * local214));
		@Pc(248) int local248 = (int) (Math.atan2((double) local218, (double) local237) * 2607.5945876176133D) & 0x3FFF;
		@Pc(259) int local259 = (int) (-2607.5945876176133D * Math.atan2((double) local214, (double) local222)) & 0x3FFF;
		if (local248 < 1024) {
			local248 = 1024;
		}
		if (local248 > 3072) {
			local248 = 3072;
		}
		if (Static520.anInt8367 < local248) {
			Static520.anInt8367 += Static676.anInt10886 + (local248 - Static520.anInt8367 >> 3) * Static72.anInt1357 / 1000 << 3;
			if (Static520.anInt8367 > local248) {
				Static520.anInt8367 = local248;
			}
		}
		if (Static520.anInt8367 > local248) {
			Static520.anInt8367 -= Static676.anInt10886 + Static72.anInt1357 * (Static520.anInt8367 - local248 >> 3) / 1000 << 3;
			if (local248 > Static520.anInt8367) {
				Static520.anInt8367 = local248;
			}
		}
		@Pc(336) int local336 = local259 - Static57.anInt1188;
		if (local336 > 8192) {
			local336 -= 16384;
		}
		if (local336 < -8192) {
			local336 += 16384;
		}
		local336 >>= 0x3;
		if (local336 > 0) {
			Static57.anInt1188 += Static72.anInt1357 * local336 / 1000 + Static676.anInt10886 << 3;
			Static57.anInt1188 &= 0x3FFF;
		}
		if (local336 < 0) {
			Static57.anInt1188 -= -local336 * Static72.anInt1357 / 1000 + Static676.anInt10886 << 3;
			Static57.anInt1188 &= 0x3FFF;
		}
		@Pc(392) int local392 = local259 - Static57.anInt1188;
		if (local392 > 8192) {
			local392 -= 16384;
		}
		if (local392 < -8192) {
			local392 += 16384;
		}
		Static631.anInt10060 = 0;
		if (local392 < 0 && local336 > 0 || local392 > 0 && local336 < 0) {
			Static57.anInt1188 = local259;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method1208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg1 + arg2;
		while (local17 < local21) {
			@Pc(30) int local30 = arg0[local17++] & 0xFF;
			@Pc(39) int local39;
			if (local30 < 128) {
				if (local30 == 0) {
					local39 = 65533;
				} else {
					local39 = local30;
				}
			} else if (local30 < 192) {
				local39 = 65533;
			} else if (local30 < 224) {
				if (local17 < local21 && (arg0[local17] & 0xC0) == 128) {
					local39 = (local30 & 0x1F) << 6 | arg0[local17++] & 0x3F;
					if (local39 < 128) {
						local39 = 65533;
					}
				} else {
					local39 = 65533;
				}
			} else if (local30 < 240) {
				if (local21 > local17 + 1 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128) {
					local39 = (arg0[local17++] & 0x3F) << 6 | (local30 & 0xF) << 12 | arg0[local17++] & 0x3F;
					if (local39 < 2048) {
						local39 = 65533;
					}
				} else {
					local39 = 65533;
				}
			} else if (local30 >= 248) {
				local39 = 65533;
			} else if (local17 + 2 < local21 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128 && (arg0[local17 + 2] & 0xC0) == 128) {
				local39 = (arg0[local17++] & 0x3F) << 12 | local30 << 18 & 0x1C0000 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
				if (local39 >= 65536 && local39 <= 1114111) {
					local39 = 65533;
				} else {
					local39 = 65533;
				}
			} else {
				local39 = 65533;
			}
			local13[local15++] = (char) local39;
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)[Lclient!bu;")
	public static Class45[] method1211() {
		return new Class45[] { aClass45_1, aClass45_2, aClass45_3, aClass45_4, aClass45_5, aClass45_6, aClass45_7, aClass45_8, aClass45_9, aClass45_10, aClass45_11, aClass45_12, aClass45_13, aClass45_14, aClass45_15, aClass45_16, aClass45_17, aClass45_18, aClass45_19, aClass45_20, aClass45_21 };
	}
}
