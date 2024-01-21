import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!se", name = "r", descriptor = "[B")
	public final byte[] aByteArray37;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "[Lclient!vc;")
	public final Class82[] aClass82Array1;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "[Lclient!bb;")
	public final Class3_Sub4_Sub1[] aClass3_Sub4_Sub1Array1 = new Class3_Sub4_Sub1[128];

	@OriginalMember(owner = "client!se", name = "y", descriptor = "[B")
	public final byte[] aByteArray39;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
	public final byte[] aByteArray40 = new byte[128];

	@OriginalMember(owner = "client!se", name = "I", descriptor = "I")
	public final int anInt3381;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "[S")
	public final short[] aShortArray35;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V")
	public Class3_Sub20(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = 0;
		this.aShortArray35 = new short[128];
		this.aByteArray37 = new byte[128];
		this.aClass82Array1 = new Class82[128];
		this.anIntArray365 = new int[128];
		this.aByteArray39 = new byte[128];
		@Pc(38) Class3_Sub12 local38 = new Class3_Sub12(arg0);
		while (local38.aByteArray16[local38.anInt1793 + local13] != 0) {
			local13++;
		}
		@Pc(56) byte[] local56 = new byte[local13];
		for (@Pc(58) int local58 = 0; local58 < local13; local58++) {
			local56[local58] = local38.method1342();
		}
		local38.anInt1793++;
		local13++;
		@Pc(84) int local84 = local38.anInt1793;
		local38.anInt1793 += local13;
		@Pc(92) int local92;
		for (local92 = 0; local38.aByteArray16[local38.anInt1793 + local92] != 0; local92++) {
		}
		@Pc(107) byte[] local107 = new byte[local92];
		for (@Pc(109) int local109 = 0; local109 < local92; local109++) {
			local107[local109] = local38.method1342();
		}
		@Pc(127) int local127 = 0;
		local92++;
		local38.anInt1793++;
		@Pc(137) int local137 = local38.anInt1793;
		local38.anInt1793 += local92;
		while (local38.aByteArray16[local38.anInt1793 + local127] != 0) {
			local127++;
		}
		@Pc(157) byte[] local157 = new byte[local127];
		for (@Pc(159) int local159 = 0; local159 < local127; local159++) {
			local157[local159] = local38.method1342();
		}
		local38.anInt1793++;
		local127++;
		@Pc(185) byte[] local185 = new byte[local127];
		@Pc(192) int local192;
		@Pc(200) int local200;
		@Pc(206) int local206;
		if (local127 > 1) {
			local192 = 2;
			local185[1] = 1;
			@Pc(198) int local198 = 1;
			for (local200 = 2; local200 < local127; local200++) {
				local206 = local38.method1354();
				if (local206 == 0) {
					local198 = local192++;
				} else {
					if (local198 >= local206) {
						local206--;
					}
					local198 = local206;
				}
				local185[local200] = (byte) local198;
			}
		} else {
			local192 = local127;
		}
		@Pc(246) Class82[] local246 = new Class82[local192];
		for (local200 = 0; local200 < local246.length; local200++) {
			@Pc(258) Class82 local258 = local246[local200] = new Class82();
			@Pc(262) int local262 = local38.method1354();
			if (local262 > 0) {
				local258.aByteArray47 = new byte[local262 * 2];
			}
			local262 = local38.method1354();
			if (local262 > 0) {
				local258.aByteArray48 = new byte[local262 * 2 + 2];
				local258.aByteArray48[1] = 64;
			}
		}
		local206 = local38.method1354();
		@Pc(304) int local304 = 0;
		@Pc(316) byte[] local316 = local206 > 0 ? new byte[local206 * 2] : null;
		local206 = local38.method1354();
		@Pc(332) byte[] local332 = local206 <= 0 ? null : new byte[local206 * 2];
		while (local38.aByteArray16[local38.anInt1793 + local304] != 0) {
			local304++;
		}
		@Pc(347) byte[] local347 = new byte[local304];
		for (@Pc(349) int local349 = 0; local349 < local304; local349++) {
			local347[local349] = local38.method1342();
		}
		local304++;
		local38.anInt1793++;
		@Pc(374) int local374 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local374 += local38.method1354();
			this.aShortArray35[local376] = (short) local374;
		}
		local374 = 0;
		for (@Pc(400) int local400 = 0; local400 < 128; local400++) {
			local374 += local38.method1354();
			this.aShortArray35[local400] = (short) (this.aShortArray35[local400] + (local374 << 8));
		}
		@Pc(427) int local427 = 0;
		@Pc(429) int local429 = 0;
		@Pc(431) int local431 = 0;
		for (@Pc(433) int local433 = 0; local433 < 128; local433++) {
			if (local427 == 0) {
				if (local347.length <= local429) {
					local427 = -1;
				} else {
					local427 = local347[local429++];
				}
				local431 = local38.method1351();
			}
			local427--;
			this.aShortArray35[local433] = (short) (this.aShortArray35[local433] + ((local431 - 1 & 0x2) << 14));
			this.anIntArray365[local433] = local431;
		}
		local427 = 0;
		@Pc(485) int local485 = 0;
		local429 = 0;
		for (@Pc(489) int local489 = 0; local489 < 128; local489++) {
			if (this.anIntArray365[local489] != 0) {
				if (local427 == 0) {
					if (local429 < local56.length) {
						local427 = local56[local429++];
					} else {
						local427 = -1;
					}
					local485 = local38.aByteArray16[local84++] - 1;
				}
				local427--;
				this.aByteArray37[local489] = (byte) local485;
			}
		}
		local427 = 0;
		local429 = 0;
		@Pc(536) int local536 = 0;
		for (@Pc(538) int local538 = 0; local538 < 128; local538++) {
			if (this.anIntArray365[local538] != 0) {
				if (local427 == 0) {
					local536 = local38.aByteArray16[local137++] + 16 << 2;
					if (local107.length <= local429) {
						local427 = -1;
					} else {
						local427 = local107[local429++];
					}
				}
				local427--;
				this.aByteArray39[local538] = (byte) local536;
			}
		}
		local427 = 0;
		local429 = 0;
		@Pc(596) Class82 local596 = null;
		for (@Pc(598) int local598 = 0; local598 < 128; local598++) {
			if (this.anIntArray365[local598] != 0) {
				if (local427 == 0) {
					local596 = local246[local185[local429]];
					if (local157.length <= local429) {
						local427 = -1;
					} else {
						local427 = local157[local429++];
					}
				}
				local427--;
				this.aClass82Array1[local598] = local596;
			}
		}
		@Pc(645) int local645 = 0;
		local429 = 0;
		local427 = 0;
		for (@Pc(651) int local651 = 0; local651 < 128; local651++) {
			if (local427 == 0) {
				if (local429 >= local347.length) {
					local427 = -1;
				} else {
					local427 = local347[local429++];
				}
				if (this.anIntArray365[local651] > 0) {
					local645 = local38.method1354() + 1;
				}
			}
			this.aByteArray40[local651] = (byte) local645;
			local427--;
		}
		this.anInt3381 = local38.method1354() + 1;
		@Pc(719) int local719;
		for (@Pc(708) int local708 = 0; local708 < local192; local708++) {
			@Pc(714) Class82 local714 = local246[local708];
			if (local714.aByteArray47 != null) {
				for (local719 = 1; local719 < local714.aByteArray47.length; local719 += 2) {
					local714.aByteArray47[local719] = local38.method1342();
				}
			}
			if (local714.aByteArray48 != null) {
				for (local719 = 3; local719 < local714.aByteArray48.length - 2; local719 += 2) {
					local714.aByteArray48[local719] = local38.method1342();
				}
			}
		}
		@Pc(772) int local772;
		if (local316 != null) {
			for (local772 = 1; local772 < local316.length; local772 += 2) {
				local316[local772] = local38.method1342();
			}
		}
		if (local332 != null) {
			for (local772 = 1; local772 < local332.length; local772 += 2) {
				local332[local772] = local38.method1342();
			}
		}
		@Pc(821) int local821;
		for (local772 = 0; local772 < local192; local772++) {
			@Pc(814) Class82 local814 = local246[local772];
			if (local814.aByteArray48 != null) {
				local374 = 0;
				for (local821 = 2; local821 < local814.aByteArray48.length; local821 += 2) {
					local374 += local38.method1354() + 1;
					local814.aByteArray48[local821] = (byte) local374;
				}
			}
		}
		@Pc(862) int local862;
		for (local719 = 0; local719 < local192; local719++) {
			@Pc(855) Class82 local855 = local246[local719];
			if (local855.aByteArray47 != null) {
				local374 = 0;
				for (local862 = 2; local862 < local855.aByteArray47.length; local862 += 2) {
					local374 += local38.method1354() + 1;
					local855.aByteArray47[local862] = (byte) local374;
				}
			}
		}
		@Pc(940) int local940;
		@Pc(967) int local967;
		@Pc(979) byte local979;
		@Pc(994) int local994;
		@Pc(997) int local997;
		@Pc(1007) int local1007;
		@Pc(938) byte local938;
		@Pc(1047) int local1047;
		if (local316 != null) {
			local374 = local38.method1354();
			local316[0] = (byte) local374;
			for (local821 = 2; local821 < local316.length; local821 += 2) {
				local374 = local374 + local38.method1354() + 1;
				local316[local821] = (byte) local374;
			}
			@Pc(934) byte local934 = local316[1];
			local938 = local316[0];
			for (local940 = 0; local940 < local938; local940++) {
				this.aByteArray40[local940] = (byte) (local934 * this.aByteArray40[local940] + 32 >> 6);
			}
			local967 = 2;
			while (local967 < local316.length) {
				@Pc(975) byte local975 = local316[local967 + 1];
				local979 = local316[local967];
				local994 = local934 * (local979 - local938) + (local979 - local938) / 2;
				local967 += 2;
				for (local997 = local938; local997 < local979; local997++) {
					local1007 = Static148.method2450(local979 - local938, local994);
					local994 += local975 - local934;
					this.aByteArray40[local997] = (byte) (this.aByteArray40[local997] * local1007 + 32 >> 6);
				}
				local938 = local979;
				local934 = local975;
			}
			for (local1047 = local938; local1047 < 128; local1047++) {
				this.aByteArray40[local1047] = (byte) (this.aByteArray40[local1047] * local934 + 32 >> 6);
			}
		}
		@Pc(1119) int local1119;
		if (local332 != null) {
			local374 = local38.method1354();
			local332[0] = (byte) local374;
			for (local821 = 2; local821 < local332.length; local821 += 2) {
				local374 = local374 + local38.method1354() + 1;
				local332[local821] = (byte) local374;
			}
			local938 = local332[0];
			local1119 = local332[1] << 1;
			for (local940 = 0; local940 < local938; local940++) {
				local967 = local1119 + (this.aByteArray39[local940] & 0xFF);
				if (local967 < 0) {
					local967 = 0;
				}
				if (local967 > 128) {
					local967 = 128;
				}
				this.aByteArray39[local940] = (byte) local967;
			}
			local967 = 2;
			@Pc(1163) int local1163;
			while (local967 < local332.length) {
				local1163 = local332[local967 + 1] << 1;
				local979 = local332[local967];
				local967 += 2;
				local994 = (local979 - local938) / 2 + local1119 * (local979 - local938);
				for (local997 = local938; local997 < local979; local997++) {
					local1007 = Static148.method2450(local979 - local938, local994);
					@Pc(1202) int local1202 = (this.aByteArray39[local997] & 0xFF) + local1007;
					local994 += local1163 - local1119;
					if (local1202 < 0) {
						local1202 = 0;
					}
					if (local1202 > 128) {
						local1202 = 128;
					}
					this.aByteArray39[local997] = (byte) local1202;
				}
				local1119 = local1163;
				local938 = local979;
			}
			for (local1047 = local938; local1047 < 128; local1047++) {
				local1163 = local1119 + (this.aByteArray39[local1047] & 0xFF);
				if (local1163 < 0) {
					local1163 = 0;
				}
				if (local1163 > 128) {
					local1163 = 128;
				}
				this.aByteArray39[local1047] = (byte) local1163;
			}
		}
		for (local821 = 0; local821 < local192; local821++) {
			local246[local821].anInt3658 = local38.method1354();
		}
		for (local862 = 0; local862 < local192; local862++) {
			@Pc(1311) Class82 local1311 = local246[local862];
			if (local1311.aByteArray47 != null) {
				local1311.anInt3662 = local38.method1354();
			}
			if (local1311.aByteArray48 != null) {
				local1311.anInt3661 = local38.method1354();
			}
			if (local1311.anInt3658 > 0) {
				local1311.anInt3656 = local38.method1354();
			}
		}
		for (local1119 = 0; local1119 < local192; local1119++) {
			local246[local1119].anInt3664 = local38.method1354();
		}
		for (local940 = 0; local940 < local192; local940++) {
			@Pc(1366) Class82 local1366 = local246[local940];
			if (local1366.anInt3664 > 0) {
				local1366.anInt3663 = local38.method1354();
			}
		}
		for (local967 = 0; local967 < local192; local967++) {
			@Pc(1393) Class82 local1393 = local246[local967];
			if (local1393.anInt3663 > 0) {
				local1393.anInt3657 = local38.method1354();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([ILclient!wa;[BB)Z")
	public boolean method2457(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub4_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray365[local13];
				if (local28 != 0) {
					if (local28 != local9) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg1.method2700(arg0, local28 >> 2);
						} else {
							local11 = arg1.method2704(arg0, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub4_Sub1Array1[local13] = local11;
						this.anIntArray365[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
	public void method2461() {
		this.anIntArray365 = null;
	}
}
