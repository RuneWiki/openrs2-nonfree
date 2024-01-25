import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!hfa", name = "o", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!hfa", name = "q", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!hfa", name = "r", descriptor = "I")
	public int anInt3250;

	@OriginalMember(owner = "client!hfa", name = "s", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!hfa", name = "t", descriptor = "[Lclient!mda;")
	public Class6_Sub12_Sub1[] aClass6_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!hfa", name = "u", descriptor = "[Lclient!vj;")
	public Class333[] aClass333Array1;

	@OriginalMember(owner = "client!hfa", name = "v", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!hfa", name = "x", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V")
	private Class6_Sub23() {
	}

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "([B)V")
	public Class6_Sub23(@OriginalArg(0) byte[] arg0) {
		this.aByteArray45 = new byte[128];
		this.aShortArray60 = new short[128];
		this.aByteArray44 = new byte[128];
		this.aByteArray46 = new byte[128];
		this.anIntArray381 = new int[128];
		this.aClass333Array1 = new Class333[128];
		this.aClass6_Sub12_Sub1Array1 = new Class6_Sub12_Sub1[128];
		@Pc(36) Class6_Sub14 local36 = new Class6_Sub14(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray88[local36.anInt7244 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method6034();
		}
		local38++;
		local36.anInt7244++;
		@Pc(80) int local80 = local36.anInt7244;
		local36.anInt7244 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray88[local88 + local36.anInt7244] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method6034();
		}
		local88++;
		local36.anInt7244++;
		@Pc(129) int local129 = local36.anInt7244;
		local36.anInt7244 += local88;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray88[local36.anInt7244 + local137] != 0; local137++) {
		}
		@Pc(151) byte[] local151 = new byte[local137];
		for (@Pc(153) int local153 = 0; local153 < local137; local153++) {
			local151[local153] = local36.method6034();
		}
		local36.anInt7244++;
		local137++;
		@Pc(175) byte[] local175 = new byte[local137];
		@Pc(182) int local182;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local137 <= 1) {
			local182 = local137;
		} else {
			local175[1] = 1;
			@Pc(190) int local190 = 1;
			local182 = 2;
			for (local194 = 2; local194 < local137; local194++) {
				local200 = local36.method6041();
				if (local200 == 0) {
					local190 = local182++;
				} else {
					if (local200 <= local190) {
						local200--;
					}
					local190 = local200;
				}
				local175[local194] = (byte) local190;
			}
		}
		@Pc(229) Class333[] local229 = new Class333[local182];
		for (local194 = 0; local194 < local229.length; local194++) {
			@Pc(241) Class333 local241 = local229[local194] = new Class333();
			@Pc(245) int local245 = local36.method6041();
			if (local245 > 0) {
				local241.aByteArray120 = new byte[local245 * 2];
			}
			local245 = local36.method6041();
			if (local245 > 0) {
				local241.aByteArray121 = new byte[local245 * 2 + 2];
				local241.aByteArray121[1] = 64;
			}
		}
		local200 = local36.method6041();
		@Pc(296) byte[] local296 = local200 <= 0 ? null : new byte[local200 * 2];
		local200 = local36.method6041();
		@Pc(309) byte[] local309 = local200 > 0 ? new byte[local200 * 2] : null;
		@Pc(311) int local311;
		for (local311 = 0; local36.aByteArray88[local311 + local36.anInt7244] != 0; local311++) {
		}
		@Pc(328) byte[] local328 = new byte[local311];
		for (@Pc(330) int local330 = 0; local330 < local311; local330++) {
			local328[local330] = local36.method6034();
		}
		local36.anInt7244++;
		local311++;
		@Pc(355) int local355 = 0;
		for (@Pc(357) int local357 = 0; local357 < 128; local357++) {
			local355 += local36.method6041();
			this.aShortArray60[local357] = (short) local355;
		}
		local355 = 0;
		for (@Pc(379) int local379 = 0; local379 < 128; local379++) {
			local355 += local36.method6041();
			this.aShortArray60[local379] = (short) (this.aShortArray60[local379] + (local355 << 8));
		}
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		for (@Pc(412) int local412 = 0; local412 < 128; local412++) {
			if (local406 == 0) {
				if (local328.length <= local408) {
					local406 = -1;
				} else {
					local406 = local328[local408++];
				}
				local410 = local36.method5984();
			}
			this.aShortArray60[local412] = (short) (this.aShortArray60[local412] + ((local410 - 1 & 0x2) << 14));
			this.anIntArray381[local412] = local410;
			local406--;
		}
		local406 = 0;
		local408 = 0;
		@Pc(468) int local468 = 0;
		for (@Pc(470) int local470 = 0; local470 < 128; local470++) {
			if (this.anIntArray381[local470] != 0) {
				if (local406 == 0) {
					if (local408 < local52.length) {
						local406 = local52[local408++];
					} else {
						local406 = -1;
					}
					local468 = local36.aByteArray88[local80++] - 1;
				}
				this.aByteArray46[local470] = (byte) local468;
				local406--;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(520) int local520 = 0;
		for (@Pc(522) int local522 = 0; local522 < 128; local522++) {
			if (this.anIntArray381[local522] != 0) {
				if (local406 == 0) {
					local520 = local36.aByteArray88[local129++] + 16 << 2;
					if (local408 < local105.length) {
						local406 = local105[local408++];
					} else {
						local406 = -1;
					}
				}
				local406--;
				this.aByteArray45[local522] = (byte) local520;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(579) Class333 local579 = null;
		for (@Pc(581) int local581 = 0; local581 < 128; local581++) {
			if (this.anIntArray381[local581] != 0) {
				if (local406 == 0) {
					local579 = local229[local175[local408]];
					if (local408 < local151.length) {
						local406 = local151[local408++];
					} else {
						local406 = -1;
					}
				}
				this.aClass333Array1[local581] = local579;
				local406--;
			}
		}
		local408 = 0;
		local406 = 0;
		@Pc(633) int local633 = 0;
		for (@Pc(635) int local635 = 0; local635 < 128; local635++) {
			if (local406 == 0) {
				if (local328.length > local408) {
					local406 = local328[local408++];
				} else {
					local406 = -1;
				}
				if (this.anIntArray381[local635] > 0) {
					local633 = local36.method6041() + 1;
				}
			}
			local406--;
			this.aByteArray44[local635] = (byte) local633;
		}
		this.anInt3250 = local36.method6041() + 1;
		@Pc(704) int local704;
		for (@Pc(693) int local693 = 0; local693 < local182; local693++) {
			@Pc(699) Class333 local699 = local229[local693];
			if (local699.aByteArray120 != null) {
				for (local704 = 1; local704 < local699.aByteArray120.length; local704 += 2) {
					local699.aByteArray120[local704] = local36.method6034();
				}
			}
			if (local699.aByteArray121 != null) {
				for (local704 = 3; local704 < local699.aByteArray121.length - 2; local704 += 2) {
					local699.aByteArray121[local704] = local36.method6034();
				}
			}
		}
		@Pc(757) int local757;
		if (local296 != null) {
			for (local757 = 1; local757 < local296.length; local757 += 2) {
				local296[local757] = local36.method6034();
			}
		}
		if (local309 != null) {
			for (local757 = 1; local757 < local309.length; local757 += 2) {
				local309[local757] = local36.method6034();
			}
		}
		@Pc(806) int local806;
		for (local757 = 0; local757 < local182; local757++) {
			@Pc(799) Class333 local799 = local229[local757];
			if (local799.aByteArray121 != null) {
				local355 = 0;
				for (local806 = 2; local806 < local799.aByteArray121.length; local806 += 2) {
					local355 = local36.method6041() + local355 + 1;
					local799.aByteArray121[local806] = (byte) local355;
				}
			}
		}
		@Pc(851) int local851;
		for (local704 = 0; local704 < local182; local704++) {
			@Pc(844) Class333 local844 = local229[local704];
			if (local844.aByteArray120 != null) {
				local355 = 0;
				for (local851 = 2; local851 < local844.aByteArray120.length; local851 += 2) {
					local355 += local36.method6041() + 1;
					local844.aByteArray120[local851] = (byte) local355;
				}
			}
		}
		@Pc(925) int local925;
		@Pc(952) int local952;
		@Pc(958) byte local958;
		@Pc(978) int local978;
		@Pc(980) int local980;
		@Pc(990) int local990;
		@Pc(919) byte local919;
		@Pc(1037) int local1037;
		if (local296 != null) {
			local355 = local36.method6041();
			local296[0] = (byte) local355;
			for (local806 = 2; local806 < local296.length; local806 += 2) {
				local355 += local36.method6041() + 1;
				local296[local806] = (byte) local355;
			}
			local919 = local296[0];
			@Pc(923) byte local923 = local296[1];
			for (local925 = 0; local925 < local919; local925++) {
				this.aByteArray44[local925] = (byte) (local923 * this.aByteArray44[local925] + 32 >> 6);
			}
			for (local952 = 2; local952 < local296.length; local952 += 2) {
				local958 = local296[local952];
				@Pc(964) byte local964 = local296[local952 + 1];
				local978 = local923 * (local958 - local919) + (local958 - local919) / 2;
				for (local980 = local919; local980 < local958; local980++) {
					local990 = Static331.method5356(local958 - local919, local978);
					this.aByteArray44[local980] = (byte) (this.aByteArray44[local980] * local990 + 32 >> 6);
					local978 += local964 - local923;
				}
				local919 = local958;
				local923 = local964;
			}
			for (local1037 = local919; local1037 < 128; local1037++) {
				this.aByteArray44[local1037] = (byte) (this.aByteArray44[local1037] * local923 + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local309 != null) {
			local355 = local36.method6041();
			local309[0] = (byte) local355;
			for (local806 = 2; local806 < local309.length; local806 += 2) {
				local355 = local36.method6041() + local355 + 1;
				local309[local806] = (byte) local355;
			}
			local919 = local309[0];
			local1105 = local309[1] << 1;
			for (local925 = 0; local925 < local919; local925++) {
				local952 = local1105 + (this.aByteArray45[local925] & 0xFF);
				if (local952 < 0) {
					local952 = 0;
				}
				if (local952 > 128) {
					local952 = 128;
				}
				this.aByteArray45[local925] = (byte) local952;
			}
			local952 = 2;
			@Pc(1153) int local1153;
			while (local309.length > local952) {
				local958 = local309[local952];
				local1153 = local309[local952 + 1] << 1;
				local978 = (local958 - local919) / 2 + local1105 * (local958 - local919);
				for (local980 = local919; local980 < local958; local980++) {
					local990 = Static331.method5356(local958 - local919, local978);
					@Pc(1188) int local1188 = local990 + (this.aByteArray45[local980] & 0xFF);
					if (local1188 < 0) {
						local1188 = 0;
					}
					if (local1188 > 128) {
						local1188 = 128;
					}
					local978 += local1153 - local1105;
					this.aByteArray45[local980] = (byte) local1188;
				}
				local919 = local958;
				local952 += 2;
				local1105 = local1153;
			}
			for (local1037 = local919; local1037 < 128; local1037++) {
				local1153 = local1105 + (this.aByteArray45[local1037] & 0xFF);
				if (local1153 < 0) {
					local1153 = 0;
				}
				if (local1153 > 128) {
					local1153 = 128;
				}
				this.aByteArray45[local1037] = (byte) local1153;
			}
		}
		for (local806 = 0; local806 < local182; local806++) {
			local229[local806].anInt9195 = local36.method6041();
		}
		for (local851 = 0; local851 < local182; local851++) {
			@Pc(1299) Class333 local1299 = local229[local851];
			if (local1299.aByteArray120 != null) {
				local1299.anInt9191 = local36.method6041();
			}
			if (local1299.aByteArray121 != null) {
				local1299.anInt9201 = local36.method6041();
			}
			if (local1299.anInt9195 > 0) {
				local1299.anInt9198 = local36.method6041();
			}
		}
		for (local1105 = 0; local1105 < local182; local1105++) {
			local229[local1105].anInt9193 = local36.method6041();
		}
		for (local925 = 0; local925 < local182; local925++) {
			@Pc(1354) Class333 local1354 = local229[local925];
			if (local1354.anInt9193 > 0) {
				local1354.anInt9203 = local36.method6041();
			}
		}
		for (local952 = 0; local952 < local182; local952++) {
			@Pc(1377) Class333 local1377 = local229[local952];
			if (local1377.anInt9203 > 0) {
				local1377.anInt9188 = local36.method6041();
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "([BLclient!iu;B[I)Z")
	public boolean method2763(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub12_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray381[local18];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg1.method3241(local30 >> 2, arg2);
						} else {
							local11 = arg1.method3240(local30 >> 2, arg2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub12_Sub1Array1[local18] = local11;
						this.anIntArray381[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V")
	public void method2768() {
		this.anIntArray381 = null;
	}
}
