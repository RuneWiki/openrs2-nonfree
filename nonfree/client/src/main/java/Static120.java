import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "Lclient!ra;")
	public static Class78 aClass78_4;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1043 = method1824("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1038 = aClass80_1043;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1039 = method1824("jlv");

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1040 = aClass80_1043;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1041 = method1824("as it was used to break our rules)3");

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1042 = method1824("sl_back");

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
	public static int anInt2634 = 0;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1044 = aClass80_1041;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1045 = method1824("Continue");

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1046 = method1824(" has logged in)3");

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	public static int anInt2639 = 1;

	@OriginalMember(owner = "client!nd", name = "U", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1047 = aClass80_1046;

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1048 = aClass80_1045;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method1823() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static173.anInt3892 - 1; local18++) {
				if (Static160.aShortArray46[local18] < 1000 && Static160.aShortArray46[local18 + 1] > 1000) {
					@Pc(36) Class80 local36 = Static18.aClass80Array5[local18];
					local12 = false;
					Static18.aClass80Array5[local18] = Static18.aClass80Array5[local18 + 1];
					Static18.aClass80Array5[local18 + 1] = local36;
					@Pc(56) Class80 local56 = Static148.aClass80Array25[local18];
					Static148.aClass80Array25[local18] = Static148.aClass80Array25[local18 + 1];
					Static148.aClass80Array25[local18 + 1] = local56;
					@Pc(74) int local74 = Static73.anIntArray200[local18];
					Static73.anIntArray200[local18] = Static73.anIntArray200[local18 + 1];
					Static73.anIntArray200[local18 + 1] = local74;
					@Pc(92) int local92 = Static19.anIntArray67[local18];
					Static19.anIntArray67[local18] = Static19.anIntArray67[local18 + 1];
					Static19.anIntArray67[local18 + 1] = local92;
					@Pc(110) short local110 = Static160.aShortArray46[local18];
					Static160.aShortArray46[local18] = Static160.aShortArray46[local18 + 1];
					Static160.aShortArray46[local18 + 1] = local110;
					@Pc(128) long local128 = Static176.aLongArray9[local18];
					Static176.aLongArray9[local18] = Static176.aLongArray9[local18 + 1];
					Static176.aLongArray9[local18 + 1] = local128;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!rd;")
	public static Class80 method1824(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(8) int local8 = 0;
		@Pc(19) int local19 = local6.length;
		@Pc(23) Class80 local23 = new Class80();
		local23.aByteArray43 = new byte[local19];
		while (local19 > local8) {
			@Pc(35) int local35 = local6[local8++] & 0xFF;
			if (local35 <= 45 && local35 >= 40) {
				if (local19 <= local8) {
					break;
				}
				@Pc(55) int local55 = local6[local8++] & 0xFF;
				local23.aByteArray43[local23.anInt3421++] = (byte) (local35 * 43 + local55 - 1720 - 48);
			} else if (local35 != 0) {
				local23.aByteArray43[local23.anInt3421++] = (byte) local35;
			}
		}
		local23.method2439();
		return local23.method2425();
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	public static void method1825() {
		@Pc(9) int local9 = Static7.anInt223 * 128 + 64;
		@Pc(15) int local15 = Static71.anInt1577 * 128 + 64;
		@Pc(23) int local23 = Static50.method742(Static153.anInt673, local9, local15) - Static162.anInt3631;
		if (local23 > Static149.anInt3350) {
			Static149.anInt3350 += Static49.anInt1090 + Static184.anInt4146 * (local23 - Static149.anInt3350) / 1000;
			if (local23 < Static149.anInt3350) {
				Static149.anInt3350 = local23;
			}
		}
		if (Static86.anInt1786 < local9) {
			Static86.anInt1786 += Static49.anInt1090 + (local9 - Static86.anInt1786) * Static184.anInt4146 / 1000;
			if (Static86.anInt1786 > local9) {
				Static86.anInt1786 = local9;
			}
		}
		if (Static149.anInt3350 > local23) {
			Static149.anInt3350 -= Static49.anInt1090 + (Static149.anInt3350 - local23) * Static184.anInt4146 / 1000;
			if (local23 > Static149.anInt3350) {
				Static149.anInt3350 = local23;
			}
		}
		if (Static56.anInt1216 < local15) {
			Static56.anInt1216 += Static49.anInt1090 + Static184.anInt4146 * (local15 - Static56.anInt1216) / 1000;
			if (Static56.anInt1216 > local15) {
				Static56.anInt1216 = local15;
			}
		}
		if (Static86.anInt1786 > local9) {
			Static86.anInt1786 -= Static49.anInt1090 + (Static86.anInt1786 - local9) * Static184.anInt4146 / 1000;
			if (local9 > Static86.anInt1786) {
				Static86.anInt1786 = local9;
			}
		}
		if (local15 < Static56.anInt1216) {
			Static56.anInt1216 -= (Static56.anInt1216 - local15) * Static184.anInt4146 / 1000 + Static49.anInt1090;
			if (Static56.anInt1216 < local15) {
				Static56.anInt1216 = local15;
			}
		}
		local15 = Static31.anInt749 * 128 + 64;
		local9 = Static32.anInt4271 * 128 + 64;
		local23 = Static50.method742(Static153.anInt673, local9, local15) - Static16.anInt364;
		@Pc(205) int local205 = local15 - Static56.anInt1216;
		@Pc(210) int local210 = local9 - Static86.anInt1786;
		@Pc(215) int local215 = local23 - Static149.anInt3350;
		@Pc(227) int local227 = (int) Math.sqrt((double) (local205 * local205 + local210 * local210));
		@Pc(238) int local238 = (int) (Math.atan2((double) local215, (double) local227) * 325.949D) & 0x7FF;
		if (local238 < 128) {
			local238 = 128;
		}
		if (local238 > 383) {
			local238 = 383;
		}
		@Pc(261) int local261 = (int) (-325.949D * Math.atan2((double) local205, (double) local210)) & 0x7FF;
		@Pc(265) int local265 = local261 - Static163.anInt3648;
		if (local265 > 1024) {
			local265 -= 2048;
		}
		if (local238 > Static165.anInt3680) {
			Static165.anInt3680 += (local238 - Static165.anInt3680) * Static68.anInt1520 / 1000 + Static58.anInt1282;
			if (local238 < Static165.anInt3680) {
				Static165.anInt3680 = local238;
			}
		}
		if (local265 < -1024) {
			local265 += 2048;
		}
		if (local238 < Static165.anInt3680) {
			Static165.anInt3680 -= Static58.anInt1282 + (Static165.anInt3680 - local238) * Static68.anInt1520 / 1000;
			if (local238 > Static165.anInt3680) {
				Static165.anInt3680 = local238;
			}
		}
		if (local265 > 0) {
			Static163.anInt3648 += Static58.anInt1282 + Static68.anInt1520 * local265 / 1000;
			Static163.anInt3648 &= 0x7FF;
		}
		if (local265 < 0) {
			Static163.anInt3648 -= Static58.anInt1282 + Static68.anInt1520 * -local265 / 1000;
			Static163.anInt3648 &= 0x7FF;
		}
		@Pc(359) int local359 = local261 - Static163.anInt3648;
		if (local359 > 1024) {
			local359 -= 2048;
		}
		if (local359 < -1024) {
			local359 += 2048;
		}
		if (local359 < 0 && local265 > 0 || local359 > 0 && local265 < 0) {
			Static163.anInt3648 = local261;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!bc;II)Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 method1829(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1) {
		return Static73.method1102(arg0, arg1) ? Static138.method2143() : null;
	}
}
