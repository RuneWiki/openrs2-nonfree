import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "[S")
	public final short[] aShortArray39 = new short[128];

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
	public final int anInt2820;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "[I")
	private int[] anIntArray407 = new int[128];

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "[B")
	public final byte[] aByteArray73 = new byte[128];

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "[Lclient!eb;")
	public final Class21[] aClass21Array1 = new Class21[128];

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "[B")
	public final byte[] aByteArray74 = new byte[128];

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "[Lclient!pe;")
	public final Class4_Sub6_Sub1[] aClass4_Sub6_Sub1Array1 = new Class4_Sub6_Sub1[128];

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "[B")
	public final byte[] aByteArray75 = new byte[128];

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class4_Sub24(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class4_Sub10 local38 = new Class4_Sub10(arg0);
		while (local38.aByteArray17[local38.anInt931 + local33] != 0) {
			local33++;
		}
		@Pc(56) byte[] local56 = new byte[local33];
		for (@Pc(58) int local58 = 0; local58 < local33; local58++) {
			local56[local58] = local38.method579();
		}
		local33++;
		@Pc(73) int local73 = 0;
		local38.anInt931++;
		@Pc(82) int local82 = local38.anInt931;
		local38.anInt931 += local33;
		while (local38.aByteArray17[local38.anInt931 + local73] != 0) {
			local73++;
		}
		@Pc(106) byte[] local106 = new byte[local73];
		for (@Pc(108) int local108 = 0; local108 < local73; local108++) {
			local106[local108] = local38.method579();
		}
		local38.anInt931++;
		local73++;
		@Pc(134) int local134 = local38.anInt931;
		local38.anInt931 += local73;
		@Pc(142) int local142;
		for (local142 = 0; local38.aByteArray17[local38.anInt931 + local142] != 0; local142++) {
		}
		@Pc(156) byte[] local156 = new byte[local142];
		for (@Pc(158) int local158 = 0; local158 < local142; local158++) {
			local156[local158] = local38.method579();
		}
		local142++;
		local38.anInt931++;
		@Pc(184) byte[] local184 = new byte[local142];
		@Pc(189) int local189;
		@Pc(201) int local201;
		@Pc(207) int local207;
		if (local142 <= 1) {
			local189 = local142;
		} else {
			local184[1] = 1;
			local189 = 2;
			@Pc(199) int local199 = 1;
			for (local201 = 2; local201 < local142; local201++) {
				local207 = local38.method599();
				if (local207 == 0) {
					local199 = local189++;
				} else {
					if (local207 <= local199) {
						local207--;
					}
					local199 = local207;
				}
				local184[local201] = (byte) local199;
			}
		}
		@Pc(232) Class21[] local232 = new Class21[local189];
		for (local201 = 0; local201 < local232.length; local201++) {
			@Pc(244) Class21 local244 = local232[local201] = new Class21();
			@Pc(248) int local248 = local38.method599();
			if (local248 > 0) {
				local244.aByteArray6 = new byte[local248 * 2];
			}
			local248 = local38.method599();
			if (local248 > 0) {
				local244.aByteArray5 = new byte[local248 * 2 + 2];
				local244.aByteArray5[1] = 64;
			}
		}
		local207 = local38.method599();
		@Pc(300) byte[] local300 = local207 <= 0 ? null : new byte[local207 * 2];
		local207 = local38.method599();
		@Pc(306) int local306;
		for (local306 = 0; local38.aByteArray17[local38.anInt931 + local306] != 0; local306++) {
		}
		@Pc(323) byte[] local323 = new byte[local306];
		for (@Pc(325) int local325 = 0; local325 < local306; local325++) {
			local323[local325] = local38.method579();
		}
		@Pc(343) int local343 = 0;
		@Pc(352) byte[] local352 = local207 <= 0 ? null : new byte[local207 * 2];
		local38.anInt931++;
		local306++;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local343 += local38.method599();
			this.aShortArray39[local361] = (short) local343;
		}
		local343 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local343 += local38.method599();
			this.aShortArray39[local383] = (short) (this.aShortArray39[local383] + (local343 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local412 == 0) {
				if (local408 < local323.length) {
					local412 = local323[local408++];
				} else {
					local412 = -1;
				}
				local410 = local38.method550();
			}
			local412--;
			this.aShortArray39[local414] = (short) (this.aShortArray39[local414] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray407[local414] = local410;
		}
		local408 = 0;
		local412 = 0;
		@Pc(472) int local472 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray407[local474] != 0) {
				if (local412 == 0) {
					if (local408 >= local56.length) {
						local412 = -1;
					} else {
						local412 = local56[local408++];
					}
					local472 = local38.aByteArray17[local82++] - 1;
				}
				this.aByteArray74[local474] = (byte) local472;
				local412--;
			}
		}
		local408 = 0;
		local412 = 0;
		@Pc(524) int local524 = 0;
		for (@Pc(526) int local526 = 0; local526 < 128; local526++) {
			if (this.anIntArray407[local526] != 0) {
				if (local412 == 0) {
					if (local106.length <= local408) {
						local412 = -1;
					} else {
						local412 = local106[local408++];
					}
					local524 = local38.aByteArray17[local134++] + 16 << 2;
				}
				local412--;
				this.aByteArray75[local526] = (byte) local524;
			}
		}
		local408 = 0;
		@Pc(579) Class21 local579 = null;
		local412 = 0;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray407[local583] != 0) {
				if (local412 == 0) {
					local579 = local232[local184[local408]];
					if (local408 >= local156.length) {
						local412 = -1;
					} else {
						local412 = local156[local408++];
					}
				}
				this.aClass21Array1[local583] = local579;
				local412--;
			}
		}
		@Pc(631) int local631 = 0;
		local412 = 0;
		local408 = 0;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (local412 == 0) {
				if (local408 >= local323.length) {
					local412 = -1;
				} else {
					local412 = local323[local408++];
				}
				if (this.anIntArray407[local637] > 0) {
					local631 = local38.method599() + 1;
				}
			}
			this.aByteArray73[local637] = (byte) local631;
			local412--;
		}
		this.anInt2820 = local38.method599() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local189; local690++) {
			@Pc(696) Class21 local696 = local232[local690];
			if (local696.aByteArray6 != null) {
				for (local701 = 1; local701 < local696.aByteArray6.length; local701 += 2) {
					local696.aByteArray6[local701] = local38.method579();
				}
			}
			if (local696.aByteArray5 != null) {
				for (local701 = 3; local701 < local696.aByteArray5.length - 2; local701 += 2) {
					local696.aByteArray5[local701] = local38.method579();
				}
			}
		}
		@Pc(750) int local750;
		if (local300 != null) {
			for (local750 = 1; local750 < local300.length; local750 += 2) {
				local300[local750] = local38.method579();
			}
		}
		if (local352 != null) {
			for (local750 = 1; local750 < local352.length; local750 += 2) {
				local352[local750] = local38.method579();
			}
		}
		@Pc(795) int local795;
		for (local750 = 0; local750 < local189; local750++) {
			@Pc(788) Class21 local788 = local232[local750];
			if (local788.aByteArray5 != null) {
				local343 = 0;
				for (local795 = 2; local795 < local788.aByteArray5.length; local795 += 2) {
					local343 = local343 + local38.method599() + 1;
					local788.aByteArray5[local795] = (byte) local343;
				}
			}
		}
		@Pc(840) int local840;
		for (local701 = 0; local701 < local189; local701++) {
			@Pc(833) Class21 local833 = local232[local701];
			if (local833.aByteArray6 != null) {
				local343 = 0;
				for (local840 = 2; local840 < local833.aByteArray6.length; local840 += 2) {
					local343 = local38.method599() + local343 + 1;
					local833.aByteArray6[local840] = (byte) local343;
				}
			}
		}
		@Pc(917) int local917;
		@Pc(940) int local940;
		@Pc(946) byte local946;
		@Pc(966) int local966;
		@Pc(968) int local968;
		@Pc(978) int local978;
		@Pc(911) byte local911;
		@Pc(1013) int local1013;
		if (local300 != null) {
			local343 = local38.method599();
			local300[0] = (byte) local343;
			for (local795 = 2; local795 < local300.length; local795 += 2) {
				local343 = local38.method599() + local343 + 1;
				local300[local795] = (byte) local343;
			}
			local911 = local300[0];
			@Pc(915) byte local915 = local300[1];
			for (local917 = 0; local917 < local911; local917++) {
				this.aByteArray73[local917] = (byte) (this.aByteArray73[local917] * local915 + 32 >> 6);
			}
			local940 = 2;
			while (local940 < local300.length) {
				local946 = local300[local940];
				@Pc(952) byte local952 = local300[local940 + 1];
				local940 += 2;
				local966 = (local946 - local911) / 2 + (local946 - local911) * local915;
				for (local968 = local911; local968 < local946; local968++) {
					local978 = Static31.method445(local966, local946 - local911);
					this.aByteArray73[local968] = (byte) (local978 * this.aByteArray73[local968] + 32 >> 6);
					local966 += local952 - local915;
				}
				local911 = local946;
				local915 = local952;
			}
			for (local1013 = local911; local1013 < 128; local1013++) {
				this.aByteArray73[local1013] = (byte) (this.aByteArray73[local1013] * local915 + 32 >> 6);
			}
		}
		@Pc(1080) int local1080;
		if (local352 != null) {
			local343 = local38.method599();
			local352[0] = (byte) local343;
			for (local795 = 2; local795 < local352.length; local795 += 2) {
				local343 = local343 + local38.method599() + 1;
				local352[local795] = (byte) local343;
			}
			local911 = local352[0];
			local1080 = local352[1] << 1;
			for (local917 = 0; local917 < local911; local917++) {
				local940 = local1080 + (this.aByteArray75[local917] & 0xFF);
				if (local940 < 0) {
					local940 = 0;
				}
				if (local940 > 128) {
					local940 = 128;
				}
				this.aByteArray75[local917] = (byte) local940;
			}
			@Pc(1145) int local1145;
			for (local940 = 2; local940 < local352.length; local940 += 2) {
				local946 = local352[local940];
				local966 = (local946 - local911) / 2 + local1080 * (local946 - local911);
				local1145 = local352[local940 + 1] << 1;
				for (local968 = local911; local968 < local946; local968++) {
					local978 = Static31.method445(local966, local946 - local911);
					local966 += local1145 - local1080;
					@Pc(1173) int local1173 = (this.aByteArray75[local968] & 0xFF) + local978;
					if (local1173 < 0) {
						local1173 = 0;
					}
					if (local1173 > 128) {
						local1173 = 128;
					}
					this.aByteArray75[local968] = (byte) local1173;
				}
				local1080 = local1145;
				local911 = local946;
			}
			for (local1013 = local911; local1013 < 128; local1013++) {
				local1145 = local1080 + (this.aByteArray75[local1013] & 0xFF);
				if (local1145 < 0) {
					local1145 = 0;
				}
				if (local1145 > 128) {
					local1145 = 128;
				}
				this.aByteArray75[local1013] = (byte) local1145;
			}
		}
		for (local795 = 0; local795 < local189; local795++) {
			local232[local795].anInt574 = local38.method599();
		}
		for (local840 = 0; local840 < local189; local840++) {
			@Pc(1277) Class21 local1277 = local232[local840];
			if (local1277.aByteArray6 != null) {
				local1277.anInt571 = local38.method599();
			}
			if (local1277.aByteArray5 != null) {
				local1277.anInt564 = local38.method599();
			}
			if (local1277.anInt574 > 0) {
				local1277.anInt575 = local38.method599();
			}
		}
		for (local1080 = 0; local1080 < local189; local1080++) {
			local232[local1080].anInt566 = local38.method599();
		}
		for (local917 = 0; local917 < local189; local917++) {
			@Pc(1332) Class21 local1332 = local232[local917];
			if (local1332.anInt566 > 0) {
				local1332.anInt567 = local38.method599();
			}
		}
		for (local940 = 0; local940 < local189; local940++) {
			@Pc(1356) Class21 local1356 = local232[local940];
			if (local1356.anInt567 > 0) {
				local1356.anInt570 = local38.method599();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!md;[I[BI)Z")
	public boolean method2006(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = true;
		@Pc(11) Class4_Sub6_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray407[local13];
				if (local28 != 0) {
					if (local7 != local28) {
						local7 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg0.method1356(local28 >> 2, arg1);
						} else {
							local11 = arg0.method1354(local28 >> 2, arg1);
						}
						if (local11 == null) {
							local9 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub6_Sub1Array1[local13] = local11;
						this.anIntArray407[local13] = 0;
					}
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public void method2010() {
		this.anIntArray407 = null;
	}
}
