import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class6_Sub46 extends Class6 {

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "[Lclient!ib;")
	public Class6_Sub27_Sub1[] aClass6_Sub27_Sub1Array1;

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!tba", name = "s", descriptor = "[S")
	public short[] aShortArray161;

	@OriginalMember(owner = "client!tba", name = "t", descriptor = "I")
	public int anInt9359;

	@OriginalMember(owner = "client!tba", name = "u", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!tba", name = "w", descriptor = "[Lclient!fm;")
	public Class105[] aClass105Array1;

	@OriginalMember(owner = "client!tba", name = "x", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
	private Class6_Sub46() {
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "([B)V")
	public Class6_Sub46(@OriginalArg(0) byte[] arg0) {
		this.anIntArray487 = new int[128];
		this.aByteArray89 = new byte[128];
		this.aClass6_Sub27_Sub1Array1 = new Class6_Sub27_Sub1[128];
		this.aByteArray88 = new byte[128];
		this.aByteArray90 = new byte[128];
		this.aShortArray161 = new short[128];
		this.aClass105Array1 = new Class105[128];
		@Pc(36) Class6_Sub8 local36 = new Class6_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray102[local38 + local36.anInt10061] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method8208();
		}
		local38++;
		local36.anInt10061++;
		@Pc(79) int local79 = local36.anInt10061;
		local36.anInt10061 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray102[local87 + local36.anInt10061] != 0; local87++) {
		}
		@Pc(101) byte[] local101 = new byte[local87];
		for (@Pc(103) int local103 = 0; local103 < local87; local103++) {
			local101[local103] = local36.method8208();
		}
		local87++;
		local36.anInt10061++;
		@Pc(125) int local125 = local36.anInt10061;
		local36.anInt10061 += local87;
		@Pc(133) int local133;
		for (local133 = 0; local36.aByteArray102[local133 + local36.anInt10061] != 0; local133++) {
		}
		@Pc(147) byte[] local147 = new byte[local133];
		for (@Pc(149) int local149 = 0; local149 < local133; local149++) {
			local147[local149] = local36.method8208();
		}
		local36.anInt10061++;
		local133++;
		@Pc(175) byte[] local175 = new byte[local133];
		@Pc(182) int local182;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local133 <= 1) {
			local182 = local133;
		} else {
			local175[1] = 1;
			local182 = 2;
			@Pc(192) int local192 = 1;
			for (local194 = 2; local194 < local133; local194++) {
				local200 = local36.method8246();
				if (local200 == 0) {
					local192 = local182++;
				} else {
					if (local192 >= local200) {
						local200--;
					}
					local192 = local200;
				}
				local175[local194] = (byte) local192;
			}
		}
		@Pc(233) Class105[] local233 = new Class105[local182];
		for (local194 = 0; local194 < local233.length; local194++) {
			@Pc(245) Class105 local245 = local233[local194] = new Class105();
			@Pc(249) int local249 = local36.method8246();
			if (local249 > 0) {
				local245.aByteArray25 = new byte[local249 * 2];
			}
			local249 = local36.method8246();
			if (local249 > 0) {
				local245.aByteArray24 = new byte[local249 * 2 + 2];
				local245.aByteArray24[1] = 64;
			}
		}
		local200 = local36.method8246();
		@Pc(297) byte[] local297 = local200 > 0 ? new byte[local200 * 2] : null;
		local200 = local36.method8246();
		@Pc(310) byte[] local310 = local200 > 0 ? new byte[local200 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray102[local36.anInt10061 + local312] != 0; local312++) {
		}
		@Pc(327) byte[] local327 = new byte[local312];
		for (@Pc(329) int local329 = 0; local329 < local312; local329++) {
			local327[local329] = local36.method8208();
		}
		local312++;
		local36.anInt10061++;
		@Pc(350) int local350 = 0;
		for (@Pc(352) int local352 = 0; local352 < 128; local352++) {
			local350 += local36.method8246();
			this.aShortArray161[local352] = (short) local350;
		}
		local350 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local350 += local36.method8246();
			this.aShortArray161[local376] = (short) (this.aShortArray161[local376] + (local350 << 8));
		}
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		@Pc(405) int local405 = 0;
		for (@Pc(407) int local407 = 0; local407 < 128; local407++) {
			if (local401 == 0) {
				if (local327.length <= local403) {
					local401 = -1;
				} else {
					local401 = local327[local403++];
				}
				local405 = local36.method8257();
			}
			this.aShortArray161[local407] = (short) (this.aShortArray161[local407] + ((local405 - 1 & 0x2) << 14));
			this.anIntArray487[local407] = local405;
			local401--;
		}
		local401 = 0;
		local403 = 0;
		@Pc(463) int local463 = 0;
		for (@Pc(465) int local465 = 0; local465 < 128; local465++) {
			if (this.anIntArray487[local465] != 0) {
				if (local401 == 0) {
					local463 = local36.aByteArray102[local79++] - 1;
					if (local55.length <= local403) {
						local401 = -1;
					} else {
						local401 = local55[local403++];
					}
				}
				this.aByteArray89[local465] = (byte) local463;
				local401--;
			}
		}
		local401 = 0;
		local403 = 0;
		@Pc(518) int local518 = 0;
		for (@Pc(520) int local520 = 0; local520 < 128; local520++) {
			if (this.anIntArray487[local520] != 0) {
				if (local401 == 0) {
					local518 = local36.aByteArray102[local125++] + 16 << 2;
					if (local403 < local101.length) {
						local401 = local101[local403++];
					} else {
						local401 = -1;
					}
				}
				local401--;
				this.aByteArray88[local520] = (byte) local518;
			}
		}
		local401 = 0;
		local403 = 0;
		@Pc(576) Class105 local576 = null;
		for (@Pc(578) int local578 = 0; local578 < 128; local578++) {
			if (this.anIntArray487[local578] != 0) {
				if (local401 == 0) {
					local576 = local233[local175[local403]];
					if (local147.length <= local403) {
						local401 = -1;
					} else {
						local401 = local147[local403++];
					}
				}
				local401--;
				this.aClass105Array1[local578] = local576;
			}
		}
		local403 = 0;
		local401 = 0;
		@Pc(621) int local621 = 0;
		for (@Pc(623) int local623 = 0; local623 < 128; local623++) {
			if (local401 == 0) {
				if (local327.length <= local403) {
					local401 = -1;
				} else {
					local401 = local327[local403++];
				}
				if (this.anIntArray487[local623] > 0) {
					local621 = local36.method8246() + 1;
				}
			}
			this.aByteArray90[local623] = (byte) local621;
			local401--;
		}
		this.anInt9359 = local36.method8246() + 1;
		@Pc(687) int local687;
		for (@Pc(676) int local676 = 0; local676 < local182; local676++) {
			@Pc(682) Class105 local682 = local233[local676];
			if (local682.aByteArray25 != null) {
				for (local687 = 1; local687 < local682.aByteArray25.length; local687 += 2) {
					local682.aByteArray25[local687] = local36.method8208();
				}
			}
			if (local682.aByteArray24 != null) {
				for (local687 = 3; local687 < local682.aByteArray24.length - 2; local687 += 2) {
					local682.aByteArray24[local687] = local36.method8208();
				}
			}
		}
		@Pc(736) int local736;
		if (local297 != null) {
			for (local736 = 1; local736 < local297.length; local736 += 2) {
				local297[local736] = local36.method8208();
			}
		}
		if (local310 != null) {
			for (local736 = 1; local736 < local310.length; local736 += 2) {
				local310[local736] = local36.method8208();
			}
		}
		@Pc(785) int local785;
		for (local736 = 0; local736 < local182; local736++) {
			@Pc(778) Class105 local778 = local233[local736];
			if (local778.aByteArray24 != null) {
				local350 = 0;
				for (local785 = 2; local785 < local778.aByteArray24.length; local785 += 2) {
					local350 = local36.method8246() + local350 + 1;
					local778.aByteArray24[local785] = (byte) local350;
				}
			}
		}
		@Pc(830) int local830;
		for (local687 = 0; local687 < local182; local687++) {
			@Pc(823) Class105 local823 = local233[local687];
			if (local823.aByteArray25 != null) {
				local350 = 0;
				for (local830 = 2; local830 < local823.aByteArray25.length; local830 += 2) {
					local350 -= -local36.method8246() - 1;
					local823.aByteArray25[local830] = (byte) local350;
				}
			}
		}
		@Pc(911) int local911;
		@Pc(934) int local934;
		@Pc(940) byte local940;
		@Pc(960) int local960;
		@Pc(962) int local962;
		@Pc(971) int local971;
		@Pc(905) byte local905;
		@Pc(1010) int local1010;
		if (local297 != null) {
			local350 = local36.method8246();
			local297[0] = (byte) local350;
			for (local785 = 2; local785 < local297.length; local785 += 2) {
				local350 += local36.method8246() + 1;
				local297[local785] = (byte) local350;
			}
			local905 = local297[0];
			@Pc(909) byte local909 = local297[1];
			for (local911 = 0; local911 < local905; local911++) {
				this.aByteArray90[local911] = (byte) (this.aByteArray90[local911] * local909 + 32 >> 6);
			}
			local934 = 2;
			while (local297.length > local934) {
				local940 = local297[local934];
				@Pc(946) byte local946 = local297[local934 + 1];
				local960 = (local940 - local905) * local909 + (local940 - local905) / 2;
				for (local962 = local905; local962 < local940; local962++) {
					local971 = Static594.method8188(local960, local940 - local905);
					this.aByteArray90[local962] = (byte) (local971 * this.aByteArray90[local962] + 32 >> 6);
					local960 += local946 - local909;
				}
				local934 += 2;
				local909 = local946;
				local905 = local940;
			}
			for (local1010 = local905; local1010 < 128; local1010++) {
				this.aByteArray90[local1010] = (byte) (this.aByteArray90[local1010] * local909 + 32 >> 6);
			}
		}
		@Pc(1077) int local1077;
		if (local310 != null) {
			local350 = local36.method8246();
			local310[0] = (byte) local350;
			for (local785 = 2; local785 < local310.length; local785 += 2) {
				local350 = local350 + local36.method8246() + 1;
				local310[local785] = (byte) local350;
			}
			local905 = local310[0];
			local1077 = local310[1] << 1;
			for (local911 = 0; local911 < local905; local911++) {
				local934 = (this.aByteArray88[local911] & 0xFF) + local1077;
				if (local934 < 0) {
					local934 = 0;
				}
				if (local934 > 128) {
					local934 = 128;
				}
				this.aByteArray88[local911] = (byte) local934;
			}
			local934 = 2;
			@Pc(1125) int local1125;
			while (local934 < local310.length) {
				local940 = local310[local934];
				local1125 = local310[local934 + 1] << 1;
				local960 = (local940 - local905) / 2 + local1077 * (local940 - local905);
				for (local962 = local905; local962 < local940; local962++) {
					local971 = Static594.method8188(local960, local940 - local905);
					@Pc(1159) int local1159 = local971 + (this.aByteArray88[local962] & 0xFF);
					if (local1159 < 0) {
						local1159 = 0;
					}
					if (local1159 > 128) {
						local1159 = 128;
					}
					this.aByteArray88[local962] = (byte) local1159;
					local960 += local1125 - local1077;
				}
				local934 += 2;
				local1077 = local1125;
				local905 = local940;
			}
			for (local1010 = local905; local1010 < 128; local1010++) {
				local1125 = local1077 + (this.aByteArray88[local1010] & 0xFF);
				if (local1125 < 0) {
					local1125 = 0;
				}
				if (local1125 > 128) {
					local1125 = 128;
				}
				this.aByteArray88[local1010] = (byte) local1125;
			}
		}
		for (local785 = 0; local785 < local182; local785++) {
			local233[local785].anInt3662 = local36.method8246();
		}
		for (local830 = 0; local830 < local182; local830++) {
			@Pc(1260) Class105 local1260 = local233[local830];
			if (local1260.aByteArray25 != null) {
				local1260.anInt3665 = local36.method8246();
			}
			if (local1260.aByteArray24 != null) {
				local1260.anInt3667 = local36.method8246();
			}
			if (local1260.anInt3662 > 0) {
				local1260.anInt3666 = local36.method8246();
			}
		}
		for (local1077 = 0; local1077 < local182; local1077++) {
			local233[local1077].anInt3664 = local36.method8246();
		}
		for (local911 = 0; local911 < local182; local911++) {
			@Pc(1318) Class105 local1318 = local233[local911];
			if (local1318.anInt3664 > 0) {
				local1318.anInt3663 = local36.method8246();
			}
		}
		for (local934 = 0; local934 < local182; local934++) {
			@Pc(1342) Class105 local1342 = local233[local934];
			if (local1342.anInt3663 > 0) {
				local1342.anInt3669 = local36.method8246();
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(Z)V")
	public void method7634() {
		this.anIntArray487 = null;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "([BLclient!sv;B[I)Z")
	public boolean method7638(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class315 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class6_Sub27_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray487[local18];
				if (local33 != 0) {
					if (local33 != local14) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg1.method7573(local33 >> 2, arg2);
						} else {
							local16 = arg1.method7575(local33 >> 2, arg2);
						}
						if (local16 == null) {
							local7 = false;
						}
					}
					if (local16 != null) {
						this.aClass6_Sub27_Sub1Array1[local18] = local16;
						this.anIntArray487[local18] = 0;
					}
				}
			}
		}
		return local7;
	}
}
