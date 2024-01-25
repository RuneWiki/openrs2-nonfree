import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class4_Sub16 extends Class4 {

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "[I")
	private int[] anIntArray149;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	public int anInt3125;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "[Lclient!tk;")
	public Class4_Sub42_Sub1[] aClass4_Sub42_Sub1Array1;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "[Lclient!aw;")
	public Class24[] aClass24Array1;

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	private Class4_Sub16() {
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([B)V")
	public Class4_Sub16(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub42_Sub1Array1 = new Class4_Sub42_Sub1[128];
		this.aByteArray25 = new byte[128];
		this.anIntArray149 = new int[128];
		this.aClass24Array1 = new Class24[128];
		this.aByteArray24 = new byte[128];
		this.aByteArray26 = new byte[128];
		this.aShortArray25 = new short[128];
		@Pc(36) Class4_Sub13 local36 = new Class4_Sub13(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray88[local36.anInt9170 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method7011();
		}
		local38++;
		local36.anInt9170++;
		@Pc(77) int local77 = local36.anInt9170;
		local36.anInt9170 += local38;
		@Pc(85) int local85;
		for (local85 = 0; local36.aByteArray88[local36.anInt9170 + local85] != 0; local85++) {
		}
		@Pc(100) byte[] local100 = new byte[local85];
		for (@Pc(102) int local102 = 0; local102 < local85; local102++) {
			local100[local102] = local36.method7011();
		}
		local85++;
		local36.anInt9170++;
		@Pc(124) int local124 = local36.anInt9170;
		local36.anInt9170 += local85;
		@Pc(132) int local132;
		for (local132 = 0; local36.aByteArray88[local36.anInt9170 + local132] != 0; local132++) {
		}
		@Pc(146) byte[] local146 = new byte[local132];
		for (@Pc(148) int local148 = 0; local148 < local132; local148++) {
			local146[local148] = local36.method7011();
		}
		local132++;
		local36.anInt9170++;
		@Pc(174) byte[] local174 = new byte[local132];
		@Pc(181) int local181;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local132 <= 1) {
			local181 = local132;
		} else {
			local174[1] = 1;
			@Pc(189) int local189 = 1;
			local181 = 2;
			for (local193 = 2; local193 < local132; local193++) {
				local199 = local36.method7004();
				if (local199 == 0) {
					local189 = local181++;
				} else {
					if (local189 >= local199) {
						local199--;
					}
					local189 = local199;
				}
				local174[local193] = (byte) local189;
			}
		}
		@Pc(224) Class24[] local224 = new Class24[local181];
		for (local193 = 0; local193 < local224.length; local193++) {
			@Pc(236) Class24 local236 = local224[local193] = new Class24();
			@Pc(240) int local240 = local36.method7004();
			if (local240 > 0) {
				local236.aByteArray2 = new byte[local240 * 2];
			}
			local240 = local36.method7004();
			if (local240 > 0) {
				local236.aByteArray3 = new byte[local240 * 2 + 2];
				local236.aByteArray3[1] = 64;
			}
		}
		local199 = local36.method7004();
		@Pc(292) byte[] local292 = local199 <= 0 ? null : new byte[local199 * 2];
		local199 = local36.method7004();
		@Pc(308) byte[] local308 = local199 > 0 ? new byte[local199 * 2] : null;
		@Pc(310) int local310;
		for (local310 = 0; local36.aByteArray88[local310 + local36.anInt9170] != 0; local310++) {
		}
		@Pc(324) byte[] local324 = new byte[local310];
		for (@Pc(326) int local326 = 0; local326 < local310; local326++) {
			local324[local326] = local36.method7011();
		}
		local310++;
		local36.anInt9170++;
		@Pc(351) int local351 = 0;
		for (@Pc(353) int local353 = 0; local353 < 128; local353++) {
			local351 += local36.method7004();
			this.aShortArray25[local353] = (short) local351;
		}
		local351 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local351 += local36.method7004();
			this.aShortArray25[local377] = (short) (this.aShortArray25[local377] + (local351 << 8));
		}
		@Pc(402) int local402 = 0;
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		for (@Pc(408) int local408 = 0; local408 < 128; local408++) {
			if (local402 == 0) {
				if (local404 < local324.length) {
					local402 = local324[local404++];
				} else {
					local402 = -1;
				}
				local406 = local36.method7012();
			}
			this.aShortArray25[local408] = (short) (this.aShortArray25[local408] + ((local406 - 1 & 0x2) << 14));
			local402--;
			this.anIntArray149[local408] = local406;
		}
		local404 = 0;
		local402 = 0;
		@Pc(467) int local467 = 0;
		for (@Pc(469) int local469 = 0; local469 < 128; local469++) {
			if (this.anIntArray149[local469] != 0) {
				if (local402 == 0) {
					local467 = local36.aByteArray88[local77++] - 1;
					if (local404 < local53.length) {
						local402 = local53[local404++];
					} else {
						local402 = -1;
					}
				}
				this.aByteArray26[local469] = (byte) local467;
				local402--;
			}
		}
		local402 = 0;
		local404 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray149[local525] != 0) {
				if (local402 == 0) {
					if (local404 < local100.length) {
						local402 = local100[local404++];
					} else {
						local402 = -1;
					}
					local523 = local36.aByteArray88[local124++] + 16 << 2;
				}
				local402--;
				this.aByteArray25[local525] = (byte) local523;
			}
		}
		local402 = 0;
		local404 = 0;
		@Pc(580) Class24 local580 = null;
		for (@Pc(582) int local582 = 0; local582 < 128; local582++) {
			if (this.anIntArray149[local582] != 0) {
				if (local402 == 0) {
					local580 = local224[local174[local404]];
					if (local404 < local146.length) {
						local402 = local146[local404++];
					} else {
						local402 = -1;
					}
				}
				local402--;
				this.aClass24Array1[local582] = local580;
			}
		}
		local402 = 0;
		local404 = 0;
		@Pc(628) int local628 = 0;
		for (@Pc(630) int local630 = 0; local630 < 128; local630++) {
			if (local402 == 0) {
				if (local324.length <= local404) {
					local402 = -1;
				} else {
					local402 = local324[local404++];
				}
				if (this.anIntArray149[local630] > 0) {
					local628 = local36.method7004() + 1;
				}
			}
			local402--;
			this.aByteArray24[local630] = (byte) local628;
		}
		this.anInt3125 = local36.method7004() + 1;
		@Pc(696) int local696;
		for (@Pc(685) int local685 = 0; local685 < local181; local685++) {
			@Pc(691) Class24 local691 = local224[local685];
			if (local691.aByteArray2 != null) {
				for (local696 = 1; local696 < local691.aByteArray2.length; local696 += 2) {
					local691.aByteArray2[local696] = local36.method7011();
				}
			}
			if (local691.aByteArray3 != null) {
				for (local696 = 3; local696 < local691.aByteArray3.length - 2; local696 += 2) {
					local691.aByteArray3[local696] = local36.method7011();
				}
			}
		}
		@Pc(749) int local749;
		if (local292 != null) {
			for (local749 = 1; local749 < local292.length; local749 += 2) {
				local292[local749] = local36.method7011();
			}
		}
		if (local308 != null) {
			for (local749 = 1; local749 < local308.length; local749 += 2) {
				local308[local749] = local36.method7011();
			}
		}
		@Pc(802) int local802;
		for (local749 = 0; local749 < local181; local749++) {
			@Pc(795) Class24 local795 = local224[local749];
			if (local795.aByteArray3 != null) {
				local351 = 0;
				for (local802 = 2; local802 < local795.aByteArray3.length; local802 += 2) {
					local351 += local36.method7004() + 1;
					local795.aByteArray3[local802] = (byte) local351;
				}
			}
		}
		@Pc(847) int local847;
		for (local696 = 0; local696 < local181; local696++) {
			@Pc(840) Class24 local840 = local224[local696];
			if (local840.aByteArray2 != null) {
				local351 = 0;
				for (local847 = 2; local847 < local840.aByteArray2.length; local847 += 2) {
					local351 = local36.method7004() + local351 + 1;
					local840.aByteArray2[local847] = (byte) local351;
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
		@Pc(1021) int local1021;
		if (local292 != null) {
			local351 = local36.method7004();
			local292[0] = (byte) local351;
			for (local802 = 2; local802 < local292.length; local802 += 2) {
				local351 = local351 + local36.method7004() + 1;
				local292[local802] = (byte) local351;
			}
			local911 = local292[0];
			@Pc(915) byte local915 = local292[1];
			for (local917 = 0; local917 < local911; local917++) {
				this.aByteArray24[local917] = (byte) (this.aByteArray24[local917] * local915 + 32 >> 6);
			}
			for (local940 = 2; local940 < local292.length; local940 += 2) {
				local946 = local292[local940];
				@Pc(952) byte local952 = local292[local940 + 1];
				local966 = local915 * (local946 - local911) + (local946 - local911) / 2;
				for (local968 = local911; local968 < local946; local968++) {
					local978 = Static14.method8204(local946 - local911, local966);
					local966 += local952 - local915;
					this.aByteArray24[local968] = (byte) (local978 * this.aByteArray24[local968] + 32 >> 6);
				}
				local915 = local952;
				local911 = local946;
			}
			for (local1021 = local911; local1021 < 128; local1021++) {
				this.aByteArray24[local1021] = (byte) (this.aByteArray24[local1021] * local915 + 32 >> 6);
			}
		}
		@Pc(1086) int local1086;
		if (local308 != null) {
			local351 = local36.method7004();
			local308[0] = (byte) local351;
			for (local802 = 2; local802 < local308.length; local802 += 2) {
				local351 = local351 + local36.method7004() + 1;
				local308[local802] = (byte) local351;
			}
			local911 = local308[0];
			local1086 = local308[1] << 1;
			for (local917 = 0; local917 < local911; local917++) {
				local940 = (this.aByteArray25[local917] & 0xFF) + local1086;
				if (local940 < 0) {
					local940 = 0;
				}
				if (local940 > 128) {
					local940 = 128;
				}
				this.aByteArray25[local917] = (byte) local940;
			}
			local940 = 2;
			@Pc(1143) int local1143;
			while (local940 < local308.length) {
				local946 = local308[local940];
				local1143 = local308[local940 + 1] << 1;
				local966 = (local946 - local911) / 2 + local1086 * (local946 - local911);
				for (local968 = local911; local968 < local946; local968++) {
					local978 = Static14.method8204(local946 - local911, local966);
					@Pc(1177) int local1177 = (this.aByteArray25[local968] & 0xFF) + local978;
					if (local1177 < 0) {
						local1177 = 0;
					}
					if (local1177 > 128) {
						local1177 = 128;
					}
					local966 += local1143 - local1086;
					this.aByteArray25[local968] = (byte) local1177;
				}
				local911 = local946;
				local940 += 2;
				local1086 = local1143;
			}
			for (local1021 = local911; local1021 < 128; local1021++) {
				local1143 = (this.aByteArray25[local1021] & 0xFF) + local1086;
				if (local1143 < 0) {
					local1143 = 0;
				}
				if (local1143 > 128) {
					local1143 = 128;
				}
				this.aByteArray25[local1021] = (byte) local1143;
			}
		}
		for (local802 = 0; local802 < local181; local802++) {
			local224[local802].anInt1027 = local36.method7004();
		}
		for (local847 = 0; local847 < local181; local847++) {
			@Pc(1273) Class24 local1273 = local224[local847];
			if (local1273.aByteArray2 != null) {
				local1273.anInt1020 = local36.method7004();
			}
			if (local1273.aByteArray3 != null) {
				local1273.anInt1022 = local36.method7004();
			}
			if (local1273.anInt1027 > 0) {
				local1273.anInt1025 = local36.method7004();
			}
		}
		for (local1086 = 0; local1086 < local181; local1086++) {
			local224[local1086].anInt1026 = local36.method7004();
		}
		for (local917 = 0; local917 < local181; local917++) {
			@Pc(1324) Class24 local1324 = local224[local917];
			if (local1324.anInt1026 > 0) {
				local1324.anInt1021 = local36.method7004();
			}
		}
		for (local940 = 0; local940 < local181; local940++) {
			@Pc(1351) Class24 local1351 = local224[local940];
			if (local1351.anInt1021 > 0) {
				local1351.anInt1024 = local36.method7004();
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
	public void method2532() {
		this.anIntArray149 = null;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([BLclient!ap;[IB)Z")
	public boolean method2533(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class4_Sub42_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg0 == null || arg0[local21] != 0) {
				@Pc(36) int local36 = this.anIntArray149[local21];
				if (local36 != 0) {
					if (local17 != local36) {
						local17 = local36--;
						if ((local36 & 0x1) == 0) {
							local19 = arg1.method813(local36 >> 2, arg2);
						} else {
							local19 = arg1.method808(arg2, local36 >> 2);
						}
						if (local19 == null) {
							local7 = false;
						}
					}
					if (local19 != null) {
						this.aClass4_Sub42_Sub1Array1[local21] = local19;
						this.anIntArray149[local21] = 0;
					}
				}
			}
		}
		return local7;
	}
}
