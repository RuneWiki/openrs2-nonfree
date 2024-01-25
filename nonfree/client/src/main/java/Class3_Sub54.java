import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class3_Sub54 extends Class3 {

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public int anInt10563;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "[S")
	public short[] aShortArray152;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "[B")
	public byte[] aByteArray103;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "[I")
	private int[] anIntArray592;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "[Lclient!vca;")
	public Class381[] aClass381Array1;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "[Lclient!mca;")
	public Class3_Sub33_Sub1[] aClass3_Sub33_Sub1Array1;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "[B")
	public byte[] aByteArray105;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	private Class3_Sub54() {
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "([B)V")
	public Class3_Sub54(@OriginalArg(0) byte[] arg0) {
		this.anIntArray592 = new int[128];
		this.aByteArray105 = new byte[128];
		this.aShortArray152 = new short[128];
		this.aByteArray103 = new byte[128];
		this.aByteArray104 = new byte[128];
		this.aClass3_Sub33_Sub1Array1 = new Class3_Sub33_Sub1[128];
		this.aClass381Array1 = new Class381[128];
		@Pc(36) Class3_Sub28 local36 = new Class3_Sub28(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray50[local36.anInt6241 + local38] != 0; local38++) {
		}
		@Pc(58) byte[] local58 = new byte[local38];
		for (@Pc(60) int local60 = 0; local60 < local38; local60++) {
			local58[local60] = local36.method5288();
		}
		local36.anInt6241++;
		local38++;
		@Pc(84) int local84 = local36.anInt6241;
		local36.anInt6241 += local38;
		@Pc(92) int local92;
		for (local92 = 0; local36.aByteArray50[local92 + local36.anInt6241] != 0; local92++) {
		}
		@Pc(110) byte[] local110 = new byte[local92];
		for (@Pc(112) int local112 = 0; local112 < local92; local112++) {
			local110[local112] = local36.method5288();
		}
		local92++;
		local36.anInt6241++;
		@Pc(140) int local140 = local36.anInt6241;
		local36.anInt6241 += local92;
		@Pc(148) int local148;
		for (local148 = 0; local36.aByteArray50[local148 + local36.anInt6241] != 0; local148++) {
		}
		@Pc(169) byte[] local169 = new byte[local148];
		for (@Pc(171) int local171 = 0; local171 < local148; local171++) {
			local169[local171] = local36.method5288();
		}
		local36.anInt6241++;
		local148++;
		@Pc(195) byte[] local195 = new byte[local148];
		@Pc(204) int local204;
		@Pc(216) int local216;
		@Pc(222) int local222;
		if (local148 <= 1) {
			local204 = local148;
		} else {
			local195[1] = 1;
			local204 = 2;
			@Pc(214) int local214 = 1;
			for (local216 = 2; local216 < local148; local216++) {
				local222 = local36.method5322(-93);
				if (local222 == 0) {
					local214 = local204++;
				} else {
					if (local214 >= local222) {
						local222--;
					}
					local214 = local222;
				}
				local195[local216] = (byte) local214;
			}
		}
		@Pc(259) Class381[] local259 = new Class381[local204];
		for (local216 = 0; local216 < local259.length; local216++) {
			@Pc(271) Class381 local271 = local259[local216] = new Class381();
			@Pc(275) int local275 = local36.method5322(-26);
			if (local275 > 0) {
				local271.aByteArray107 = new byte[local275 * 2];
			}
			local275 = local36.method5322(-64);
			if (local275 > 0) {
				local271.aByteArray106 = new byte[local275 * 2 + 2];
				local271.aByteArray106[1] = 64;
			}
		}
		local222 = local36.method5322(-43);
		@Pc(331) byte[] local331 = local222 > 0 ? new byte[local222 * 2] : null;
		local222 = local36.method5322(-81);
		@Pc(348) byte[] local348 = local222 > 0 ? new byte[local222 * 2] : null;
		@Pc(350) int local350;
		for (local350 = 0; local36.aByteArray50[local36.anInt6241 + local350] != 0; local350++) {
		}
		@Pc(366) byte[] local366 = new byte[local350];
		for (@Pc(368) int local368 = 0; local368 < local350; local368++) {
			local366[local368] = local36.method5288();
		}
		local36.anInt6241++;
		local350++;
		@Pc(391) int local391 = 0;
		for (@Pc(393) int local393 = 0; local393 < 128; local393++) {
			local391 += local36.method5322(-127);
			this.aShortArray152[local393] = (short) local391;
		}
		local391 = 0;
		for (@Pc(419) int local419 = 0; local419 < 128; local419++) {
			local391 += local36.method5322(-27);
			this.aShortArray152[local419] = (short) (this.aShortArray152[local419] + (local391 << 8));
		}
		@Pc(448) int local448 = 0;
		@Pc(450) int local450 = 0;
		@Pc(452) int local452 = 0;
		for (@Pc(454) int local454 = 0; local454 < 128; local454++) {
			if (local448 == 0) {
				if (local450 < local366.length) {
					local448 = local366[local450++];
				} else {
					local448 = -1;
				}
				local452 = local36.method5276();
			}
			this.aShortArray152[local454] = (short) (this.aShortArray152[local454] + ((local452 - 1 & 0x2) << 14));
			local448--;
			this.anIntArray592[local454] = local452;
		}
		local450 = 0;
		local448 = 0;
		@Pc(516) int local516 = 0;
		for (@Pc(518) int local518 = 0; local518 < 128; local518++) {
			if (this.anIntArray592[local518] != 0) {
				if (local448 == 0) {
					local516 = local36.aByteArray50[local84++] - 1;
					if (local450 < local58.length) {
						local448 = local58[local450++];
					} else {
						local448 = -1;
					}
				}
				this.aByteArray103[local518] = (byte) local516;
				local448--;
			}
		}
		local450 = 0;
		local448 = 0;
		@Pc(578) int local578 = 0;
		for (@Pc(580) int local580 = 0; local580 < 128; local580++) {
			if (this.anIntArray592[local580] != 0) {
				if (local448 == 0) {
					if (local450 >= local110.length) {
						local448 = -1;
					} else {
						local448 = local110[local450++];
					}
					local578 = local36.aByteArray50[local140++] + 16 << 2;
				}
				local448--;
				this.aByteArray104[local580] = (byte) local578;
			}
		}
		local450 = 0;
		local448 = 0;
		@Pc(645) Class381 local645 = null;
		for (@Pc(647) int local647 = 0; local647 < 128; local647++) {
			if (this.anIntArray592[local647] != 0) {
				if (local448 == 0) {
					local645 = local259[local195[local450]];
					if (local169.length > local450) {
						local448 = local169[local450++];
					} else {
						local448 = -1;
					}
				}
				this.aClass381Array1[local647] = local645;
				local448--;
			}
		}
		local450 = 0;
		local448 = 0;
		@Pc(703) int local703 = 0;
		for (@Pc(705) int local705 = 0; local705 < 128; local705++) {
			if (local448 == 0) {
				if (local366.length <= local450) {
					local448 = -1;
				} else {
					local448 = local366[local450++];
				}
				if (this.anIntArray592[local705] > 0) {
					local703 = local36.method5322(-105) + 1;
				}
			}
			this.aByteArray105[local705] = (byte) local703;
			local448--;
		}
		this.anInt10563 = local36.method5322(-54) + 1;
		@Pc(775) int local775;
		for (@Pc(762) int local762 = 0; local762 < local204; local762++) {
			@Pc(770) Class381 local770 = local259[local762];
			if (local770.aByteArray107 != null) {
				for (local775 = 1; local775 < local770.aByteArray107.length; local775 += 2) {
					local770.aByteArray107[local775] = local36.method5288();
				}
			}
			if (local770.aByteArray106 != null) {
				for (local775 = 3; local775 < local770.aByteArray106.length - 2; local775 += 2) {
					local770.aByteArray106[local775] = local36.method5288();
				}
			}
		}
		@Pc(834) int local834;
		if (local331 != null) {
			for (local834 = 1; local834 < local331.length; local834 += 2) {
				local331[local834] = local36.method5288();
			}
		}
		if (local348 != null) {
			for (local834 = 1; local834 < local348.length; local834 += 2) {
				local348[local834] = local36.method5288();
			}
		}
		@Pc(893) int local893;
		for (local834 = 0; local834 < local204; local834++) {
			@Pc(886) Class381 local886 = local259[local834];
			if (local886.aByteArray106 != null) {
				local391 = 0;
				for (local893 = 2; local893 < local886.aByteArray106.length; local893 += 2) {
					local391 = local36.method5322(-92) + local391 + 1;
					local886.aByteArray106[local893] = (byte) local391;
				}
			}
		}
		@Pc(944) int local944;
		for (local775 = 0; local775 < local204; local775++) {
			@Pc(937) Class381 local937 = local259[local775];
			if (local937.aByteArray107 != null) {
				local391 = 0;
				for (local944 = 2; local944 < local937.aByteArray107.length; local944 += 2) {
					local391 -= -local36.method5322(-110) - 1;
					local937.aByteArray107[local944] = (byte) local391;
				}
			}
		}
		@Pc(1026) int local1026;
		@Pc(1053) int local1053;
		@Pc(1061) byte local1061;
		@Pc(1080) int local1080;
		@Pc(1082) int local1082;
		@Pc(1094) int local1094;
		@Pc(1020) byte local1020;
		@Pc(1143) int local1143;
		if (local331 != null) {
			local391 = local36.method5322(-109);
			local331[0] = (byte) local391;
			for (local893 = 2; local893 < local331.length; local893 += 2) {
				local391 = local391 + local36.method5322(-45) + 1;
				local331[local893] = (byte) local391;
			}
			local1020 = local331[0];
			@Pc(1024) byte local1024 = local331[1];
			for (local1026 = 0; local1026 < local1020; local1026++) {
				this.aByteArray105[local1026] = (byte) (this.aByteArray105[local1026] * local1024 + 32 >> 6);
			}
			for (local1053 = 2; local1053 < local331.length; local1053 += 2) {
				local1061 = local331[local1053];
				@Pc(1067) byte local1067 = local331[local1053 + 1];
				local1080 = (local1061 - local1020) / 2 + local1024 * (local1061 - local1020);
				for (local1082 = local1020; local1082 < local1061; local1082++) {
					local1094 = Static436.method6383(local1080, local1061 - local1020);
					local1080 += local1067 - local1024;
					this.aByteArray105[local1082] = (byte) (this.aByteArray105[local1082] * local1094 + 32 >> 6);
				}
				local1020 = local1061;
				local1024 = local1067;
			}
			for (local1143 = local1020; local1143 < 128; local1143++) {
				this.aByteArray105[local1143] = (byte) (local1024 * this.aByteArray105[local1143] + 32 >> 6);
			}
		}
		@Pc(1212) int local1212;
		if (local348 != null) {
			local391 = local36.method5322(-43);
			local348[0] = (byte) local391;
			for (local893 = 2; local893 < local348.length; local893 += 2) {
				local391 = local391 + local36.method5322(-50) + 1;
				local348[local893] = (byte) local391;
			}
			local1020 = local348[0];
			local1212 = local348[1] << 1;
			for (local1026 = 0; local1026 < local1020; local1026++) {
				local1053 = local1212 + (this.aByteArray104[local1026] & 0xFF);
				if (local1053 < 0) {
					local1053 = 0;
				}
				if (local1053 > 128) {
					local1053 = 128;
				}
				this.aByteArray104[local1026] = (byte) local1053;
			}
			@Pc(1268) int local1268;
			for (local1053 = 2; local1053 < local348.length; local1053 += 2) {
				local1061 = local348[local1053];
				local1268 = local348[local1053 + 1] << 1;
				local1080 = (local1061 - local1020) / 2 + local1212 * (local1061 - local1020);
				for (local1082 = local1020; local1082 < local1061; local1082++) {
					local1094 = Static436.method6383(local1080, local1061 - local1020);
					@Pc(1304) int local1304 = (this.aByteArray104[local1082] & 0xFF) + local1094;
					if (local1304 < 0) {
						local1304 = 0;
					}
					if (local1304 > 128) {
						local1304 = 128;
					}
					this.aByteArray104[local1082] = (byte) local1304;
					local1080 += local1268 - local1212;
				}
				local1212 = local1268;
				local1020 = local1061;
			}
			for (local1143 = local1020; local1143 < 128; local1143++) {
				local1268 = local1212 + (this.aByteArray104[local1143] & 0xFF);
				if (local1268 < 0) {
					local1268 = 0;
				}
				if (local1268 > 128) {
					local1268 = 128;
				}
				this.aByteArray104[local1143] = (byte) local1268;
			}
		}
		for (local893 = 0; local893 < local204; local893++) {
			local259[local893].anInt10653 = local36.method5322(-116);
		}
		for (local944 = 0; local944 < local204; local944++) {
			@Pc(1413) Class381 local1413 = local259[local944];
			if (local1413.aByteArray107 != null) {
				local1413.anInt10649 = local36.method5322(-88);
			}
			if (local1413.aByteArray106 != null) {
				local1413.anInt10659 = local36.method5322(-35);
			}
			if (local1413.anInt10653 > 0) {
				local1413.anInt10654 = local36.method5322(-73);
			}
		}
		for (local1212 = 0; local1212 < local204; local1212++) {
			local259[local1212].anInt10657 = local36.method5322(-128);
		}
		for (local1026 = 0; local1026 < local204; local1026++) {
			@Pc(1477) Class381 local1477 = local259[local1026];
			if (local1477.anInt10657 > 0) {
				local1477.anInt10655 = local36.method5322(-30);
			}
		}
		for (local1053 = 0; local1053 < local204; local1053++) {
			@Pc(1499) Class381 local1499 = local259[local1053];
			if (local1499.anInt10655 > 0) {
				local1499.anInt10652 = local36.method5322(-37);
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([I[BILclient!ec;)Z")
	public boolean method8835(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class86 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub33_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(29) int local29 = this.anIntArray592[local13];
				if (local29 != 0) {
					if (local9 != local29) {
						local9 = local29--;
						if ((local29 & 0x1) == 0) {
							local11 = arg2.method2222(arg0, local29 >> 2);
						} else {
							local11 = arg2.method2229(arg0, local29 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub33_Sub1Array1[local13] = local11;
						this.anIntArray592[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	public void method8838() {
		this.anIntArray592 = null;
	}
}
