import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "[B")
	public final byte[] aByteArray32 = new byte[128];

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "[B")
	public final byte[] aByteArray33 = new byte[128];

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "[B")
	public final byte[] aByteArray34;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "[Lclient!ud;")
	public final Class78[] aClass78Array1 = new Class78[128];

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "[I")
	private int[] anIntArray314 = new int[128];

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "[S")
	public final short[] aShortArray33 = new short[128];

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "[Lclient!hb;")
	public final Class2_Sub5_Sub1[] aClass2_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
	public final int anInt2414;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub15(@OriginalArg(0) byte[] arg0) {
		@Pc(25) int local25 = 0;
		this.aClass2_Sub5_Sub1Array1 = new Class2_Sub5_Sub1[128];
		this.aByteArray34 = new byte[128];
		@Pc(38) Class2_Sub4 local38 = new Class2_Sub4(arg0);
		while (local38.aByteArray20[local25 + local38.anInt1298] != 0) {
			local25++;
		}
		@Pc(52) byte[] local52 = new byte[local25];
		for (@Pc(54) int local54 = 0; local54 < local25; local54++) {
			local52[local54] = local38.method922();
		}
		local38.anInt1298++;
		local25++;
		@Pc(79) int local79 = 0;
		@Pc(82) int local82 = local38.anInt1298;
		local38.anInt1298 += local25;
		while (local38.aByteArray20[local38.anInt1298 + local79] != 0) {
			local79++;
		}
		@Pc(106) byte[] local106 = new byte[local79];
		for (@Pc(108) int local108 = 0; local108 < local79; local108++) {
			local106[local108] = local38.method922();
		}
		local38.anInt1298++;
		local79++;
		@Pc(134) int local134 = local38.anInt1298;
		local38.anInt1298 += local79;
		@Pc(142) int local142;
		for (local142 = 0; local38.aByteArray20[local38.anInt1298 + local142] != 0; local142++) {
		}
		@Pc(157) byte[] local157 = new byte[local142];
		for (@Pc(159) int local159 = 0; local159 < local142; local159++) {
			local157[local159] = local38.method922();
		}
		local38.anInt1298++;
		local142++;
		@Pc(181) byte[] local181 = new byte[local142];
		@Pc(186) int local186;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local142 <= 1) {
			local186 = local142;
		} else {
			local186 = 2;
			local181[1] = 1;
			@Pc(196) int local196 = 1;
			for (local198 = 2; local198 < local142; local198++) {
				local204 = local38.method933();
				if (local204 == 0) {
					local196 = local186++;
				} else {
					if (local204 <= local196) {
						local204--;
					}
					local196 = local204;
				}
				local181[local198] = (byte) local196;
			}
		}
		@Pc(229) Class78[] local229 = new Class78[local186];
		for (local198 = 0; local198 < local229.length; local198++) {
			@Pc(241) Class78 local241 = local229[local198] = new Class78();
			@Pc(245) int local245 = local38.method933();
			if (local245 > 0) {
				local241.aByteArray38 = new byte[local245 * 2];
			}
			local245 = local38.method933();
			if (local245 > 0) {
				local241.aByteArray37 = new byte[local245 * 2 + 2];
				local241.aByteArray37[1] = 64;
			}
		}
		local204 = local38.method933();
		@Pc(293) byte[] local293 = local204 <= 0 ? null : new byte[local204 * 2];
		local204 = local38.method933();
		@Pc(306) byte[] local306 = local204 <= 0 ? null : new byte[local204 * 2];
		@Pc(308) int local308;
		for (local308 = 0; local38.aByteArray20[local308 + local38.anInt1298] != 0; local308++) {
		}
		@Pc(325) byte[] local325 = new byte[local308];
		for (@Pc(327) int local327 = 0; local327 < local308; local327++) {
			local325[local327] = local38.method922();
		}
		local38.anInt1298++;
		local308++;
		@Pc(348) int local348 = 0;
		for (@Pc(350) int local350 = 0; local350 < 128; local350++) {
			local348 += local38.method933();
			this.aShortArray33[local350] = (short) local348;
		}
		local348 = 0;
		for (@Pc(372) int local372 = 0; local372 < 128; local372++) {
			local348 += local38.method933();
			this.aShortArray33[local372] = (short) (this.aShortArray33[local372] + (local348 << 8));
		}
		@Pc(399) int local399 = 0;
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		for (@Pc(405) int local405 = 0; local405 < 128; local405++) {
			if (local399 == 0) {
				if (local403 < local325.length) {
					local399 = local325[local403++];
				} else {
					local399 = -1;
				}
				local401 = local38.method924();
			}
			local399--;
			this.aShortArray33[local405] = (short) (this.aShortArray33[local405] + ((local401 - 1 & 0x2) << 14));
			this.anIntArray314[local405] = local401;
		}
		local403 = 0;
		local399 = 0;
		@Pc(460) int local460 = 0;
		for (@Pc(462) int local462 = 0; local462 < 128; local462++) {
			if (this.anIntArray314[local462] != 0) {
				if (local399 == 0) {
					if (local403 < local52.length) {
						local399 = local52[local403++];
					} else {
						local399 = -1;
					}
					local460 = local38.aByteArray20[local82++] - 1;
				}
				this.aByteArray34[local462] = (byte) local460;
				local399--;
			}
		}
		local399 = 0;
		@Pc(519) int local519 = 0;
		local403 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray314[local523] != 0) {
				if (local399 == 0) {
					if (local106.length <= local403) {
						local399 = -1;
					} else {
						local399 = local106[local403++];
					}
					local519 = local38.aByteArray20[local134++] + 16 << 2;
				}
				this.aByteArray32[local523] = (byte) local519;
				local399--;
			}
		}
		local399 = 0;
		@Pc(579) Class78 local579 = null;
		local403 = 0;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray314[local583] != 0) {
				if (local399 == 0) {
					local579 = local229[local181[local403]];
					if (local403 >= local157.length) {
						local399 = -1;
					} else {
						local399 = local157[local403++];
					}
				}
				local399--;
				this.aClass78Array1[local583] = local579;
			}
		}
		local399 = 0;
		local403 = 0;
		@Pc(628) int local628 = 0;
		for (@Pc(630) int local630 = 0; local630 < 128; local630++) {
			if (local399 == 0) {
				if (local403 >= local325.length) {
					local399 = -1;
				} else {
					local399 = local325[local403++];
				}
				if (this.anIntArray314[local630] > 0) {
					local628 = local38.method933() + 1;
				}
			}
			local399--;
			this.aByteArray33[local630] = (byte) local628;
		}
		this.anInt2414 = local38.method933() + 1;
		@Pc(693) int local693;
		for (@Pc(682) int local682 = 0; local682 < local186; local682++) {
			@Pc(688) Class78 local688 = local229[local682];
			if (local688.aByteArray38 != null) {
				for (local693 = 1; local693 < local688.aByteArray38.length; local693 += 2) {
					local688.aByteArray38[local693] = local38.method922();
				}
			}
			if (local688.aByteArray37 != null) {
				for (local693 = 3; local693 < local688.aByteArray37.length - 2; local693 += 2) {
					local688.aByteArray37[local693] = local38.method922();
				}
			}
		}
		@Pc(738) int local738;
		if (local293 != null) {
			for (local738 = 1; local738 < local293.length; local738 += 2) {
				local293[local738] = local38.method922();
			}
		}
		if (local306 != null) {
			for (local738 = 1; local738 < local306.length; local738 += 2) {
				local306[local738] = local38.method922();
			}
		}
		@Pc(787) int local787;
		for (local738 = 0; local738 < local186; local738++) {
			@Pc(780) Class78 local780 = local229[local738];
			if (local780.aByteArray37 != null) {
				local348 = 0;
				for (local787 = 2; local787 < local780.aByteArray37.length; local787 += 2) {
					local348 -= -local38.method933() - 1;
					local780.aByteArray37[local787] = (byte) local348;
				}
			}
		}
		@Pc(832) int local832;
		for (local693 = 0; local693 < local186; local693++) {
			@Pc(825) Class78 local825 = local229[local693];
			if (local825.aByteArray38 != null) {
				local348 = 0;
				for (local832 = 2; local832 < local825.aByteArray38.length; local832 += 2) {
					local348 = local38.method933() + local348 + 1;
					local825.aByteArray38[local832] = (byte) local348;
				}
			}
		}
		@Pc(905) int local905;
		@Pc(928) int local928;
		@Pc(934) byte local934;
		@Pc(954) int local954;
		@Pc(957) int local957;
		@Pc(967) int local967;
		@Pc(899) byte local899;
		@Pc(1002) int local1002;
		if (local293 != null) {
			local348 = local38.method933();
			local293[0] = (byte) local348;
			for (local787 = 2; local787 < local293.length; local787 += 2) {
				local348 = local348 + local38.method933() + 1;
				local293[local787] = (byte) local348;
			}
			local899 = local293[0];
			@Pc(903) byte local903 = local293[1];
			for (local905 = 0; local905 < local899; local905++) {
				this.aByteArray33[local905] = (byte) (this.aByteArray33[local905] * local903 + 32 >> 6);
			}
			local928 = 2;
			while (local928 < local293.length) {
				local934 = local293[local928];
				@Pc(940) byte local940 = local293[local928 + 1];
				local954 = local903 * (local934 - local899) + (local934 - local899) / 2;
				local928 += 2;
				for (local957 = local899; local957 < local934; local957++) {
					local967 = Static70.method1232(local934 - local899, local954);
					local954 += local940 - local903;
					this.aByteArray33[local957] = (byte) (local967 * this.aByteArray33[local957] + 32 >> 6);
				}
				local903 = local940;
				local899 = local934;
			}
			for (local1002 = local899; local1002 < 128; local1002++) {
				this.aByteArray33[local1002] = (byte) (this.aByteArray33[local1002] * local903 + 32 >> 6);
			}
		}
		@Pc(1074) int local1074;
		if (local306 != null) {
			local348 = local38.method933();
			local306[0] = (byte) local348;
			for (local787 = 2; local787 < local306.length; local787 += 2) {
				local348 -= -local38.method933() - 1;
				local306[local787] = (byte) local348;
			}
			local899 = local306[0];
			local1074 = local306[1] << 1;
			for (local905 = 0; local905 < local899; local905++) {
				local928 = (this.aByteArray32[local905] & 0xFF) + local1074;
				if (local928 < 0) {
					local928 = 0;
				}
				if (local928 > 128) {
					local928 = 128;
				}
				this.aByteArray32[local905] = (byte) local928;
			}
			local928 = 2;
			@Pc(1146) int local1146;
			while (local306.length > local928) {
				local934 = local306[local928];
				local954 = (local934 - local899) / 2 + (local934 - local899) * local1074;
				local1146 = local306[local928 + 1] << 1;
				for (local957 = local899; local957 < local934; local957++) {
					local967 = Static70.method1232(local934 - local899, local954);
					local954 += local1146 - local1074;
					@Pc(1174) int local1174 = local967 + (this.aByteArray32[local957] & 0xFF);
					if (local1174 < 0) {
						local1174 = 0;
					}
					if (local1174 > 128) {
						local1174 = 128;
					}
					this.aByteArray32[local957] = (byte) local1174;
				}
				local928 += 2;
				local1074 = local1146;
				local899 = local934;
			}
			for (local1002 = local899; local1002 < 128; local1002++) {
				local1146 = (this.aByteArray32[local1002] & 0xFF) + local1074;
				if (local1146 < 0) {
					local1146 = 0;
				}
				if (local1146 > 128) {
					local1146 = 128;
				}
				this.aByteArray32[local1002] = (byte) local1146;
			}
		}
		for (local787 = 0; local787 < local186; local787++) {
			local229[local787].anInt2597 = local38.method933();
		}
		for (local832 = 0; local832 < local186; local832++) {
			@Pc(1278) Class78 local1278 = local229[local832];
			if (local1278.aByteArray38 != null) {
				local1278.anInt2594 = local38.method933();
			}
			if (local1278.aByteArray37 != null) {
				local1278.anInt2600 = local38.method933();
			}
			if (local1278.anInt2597 > 0) {
				local1278.anInt2590 = local38.method933();
			}
		}
		for (local1074 = 0; local1074 < local186; local1074++) {
			local229[local1074].anInt2593 = local38.method933();
		}
		for (local905 = 0; local905 < local186; local905++) {
			@Pc(1336) Class78 local1336 = local229[local905];
			if (local1336.anInt2593 > 0) {
				local1336.anInt2592 = local38.method933();
			}
		}
		for (local928 = 0; local928 < local186; local928++) {
			@Pc(1359) Class78 local1359 = local229[local928];
			if (local1359.anInt2592 > 0) {
				local1359.anInt2595 = local38.method933();
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([BLclient!lb;[IB)Z")
	public boolean method1729(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) Class2_Sub5_Sub1 local14 = null;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray314[local18];
				if (local30 != 0) {
					if (local16 != local30) {
						local16 = local30--;
						if ((local30 & 0x1) == 0) {
							local14 = arg1.method1122(arg2, local30 >> 2);
						} else {
							local14 = arg1.method1125(arg2, local30 >> 2);
						}
						if (local14 == null) {
							local7 = false;
						}
					}
					if (local14 != null) {
						this.aClass2_Sub5_Sub1Array1[local18] = local14;
						this.anIntArray314[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public void method1733() {
		this.anIntArray314 = null;
	}
}
