import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!kia", name = "o", descriptor = "I")
	public int anInt5663;

	@OriginalMember(owner = "client!kia", name = "q", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!kia", name = "t", descriptor = "[Lclient!ud;")
	public Class2_Sub44_Sub1[] aClass2_Sub44_Sub1Array1;

	@OriginalMember(owner = "client!kia", name = "u", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!kia", name = "v", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!kia", name = "x", descriptor = "[Lclient!ada;")
	public Class8[] aClass8Array1;

	@OriginalMember(owner = "client!kia", name = "y", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "()V")
	private Class2_Sub36() {
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "([B)V")
	public Class2_Sub36(@OriginalArg(0) byte[] arg0) {
		this.aShortArray87 = new short[128];
		this.anIntArray289 = new int[128];
		this.aByteArray47 = new byte[128];
		this.aByteArray46 = new byte[128];
		this.aByteArray48 = new byte[128];
		this.aClass8Array1 = new Class8[128];
		this.aClass2_Sub44_Sub1Array1 = new Class2_Sub44_Sub1[128];
		@Pc(36) Class2_Sub8 local36 = new Class2_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.lb[local38 + local36.anInt5725] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method5175();
		}
		local36.anInt5725++;
		local38++;
		@Pc(80) int local80 = local36.anInt5725;
		local36.anInt5725 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.lb[local36.anInt5725 + local88] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method5175();
		}
		local88++;
		local36.anInt5725++;
		@Pc(133) int local133 = local36.anInt5725;
		local36.anInt5725 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.lb[local141 + local36.anInt5725] != 0; local141++) {
		}
		@Pc(158) byte[] local158 = new byte[local141];
		for (@Pc(160) int local160 = 0; local160 < local141; local160++) {
			local158[local160] = local36.method5175();
		}
		local141++;
		local36.anInt5725++;
		@Pc(182) byte[] local182 = new byte[local141];
		@Pc(191) int local191;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local141 > 1) {
			local182[1] = 1;
			local191 = 2;
			@Pc(193) int local193 = 1;
			for (local195 = 2; local195 < local141; local195++) {
				local201 = local36.method5203();
				if (local201 == 0) {
					local193 = local191++;
				} else {
					if (local193 >= local201) {
						local201--;
					}
					local193 = local201;
				}
				local182[local195] = (byte) local193;
			}
		} else {
			local191 = local141;
		}
		@Pc(241) Class8[] local241 = new Class8[local191];
		for (local195 = 0; local195 < local241.length; local195++) {
			@Pc(253) Class8 local253 = local241[local195] = new Class8();
			@Pc(257) int local257 = local36.method5203();
			if (local257 > 0) {
				local253.aByteArray2 = new byte[local257 * 2];
			}
			local257 = local36.method5203();
			if (local257 > 0) {
				local253.aByteArray3 = new byte[local257 * 2 + 2];
				local253.aByteArray3[1] = 64;
			}
		}
		local201 = local36.method5203();
		@Pc(315) byte[] local315 = local201 > 0 ? new byte[local201 * 2] : null;
		local201 = local36.method5203();
		@Pc(331) byte[] local331 = local201 > 0 ? new byte[local201 * 2] : null;
		@Pc(333) int local333;
		for (local333 = 0; local36.lb[local36.anInt5725 + local333] != 0; local333++) {
		}
		@Pc(347) byte[] local347 = new byte[local333];
		for (@Pc(349) int local349 = 0; local349 < local333; local349++) {
			local347[local349] = local36.method5175();
		}
		local333++;
		local36.anInt5725++;
		@Pc(374) int local374 = 0;
		for (@Pc(376) int local376 = 0; local376 < 128; local376++) {
			local374 += local36.method5203();
			this.aShortArray87[local376] = (short) local374;
		}
		local374 = 0;
		for (@Pc(400) int local400 = 0; local400 < 128; local400++) {
			local374 += local36.method5203();
			this.aShortArray87[local400] = (short) (this.aShortArray87[local400] + (local374 << 8));
		}
		@Pc(425) int local425 = 0;
		@Pc(427) int local427 = 0;
		@Pc(429) int local429 = 0;
		for (@Pc(431) int local431 = 0; local431 < 128; local431++) {
			if (local425 == 0) {
				if (local427 < local347.length) {
					local425 = local347[local427++];
				} else {
					local425 = -1;
				}
				local429 = local36.method5215();
			}
			this.aShortArray87[local431] = (short) (this.aShortArray87[local431] + ((local429 - 1 & 0x2) << 14));
			this.anIntArray289[local431] = local429;
			local425--;
		}
		local425 = 0;
		local427 = 0;
		@Pc(487) int local487 = 0;
		for (@Pc(489) int local489 = 0; local489 < 128; local489++) {
			if (this.anIntArray289[local489] != 0) {
				if (local425 == 0) {
					local487 = local36.lb[local80++] - 1;
					if (local52.length <= local427) {
						local425 = -1;
					} else {
						local425 = local52[local427++];
					}
				}
				this.aByteArray46[local489] = (byte) local487;
				local425--;
			}
		}
		local427 = 0;
		local425 = 0;
		@Pc(542) int local542 = 0;
		for (@Pc(544) int local544 = 0; local544 < 128; local544++) {
			if (this.anIntArray289[local544] != 0) {
				if (local425 == 0) {
					local542 = local36.lb[local133++] + 16 << 2;
					if (local105.length <= local427) {
						local425 = -1;
					} else {
						local425 = local105[local427++];
					}
				}
				local425--;
				this.aByteArray48[local544] = (byte) local542;
			}
		}
		local427 = 0;
		local425 = 0;
		@Pc(601) Class8 local601 = null;
		for (@Pc(603) int local603 = 0; local603 < 128; local603++) {
			if (this.anIntArray289[local603] != 0) {
				if (local425 == 0) {
					local601 = local241[local182[local427]];
					if (local427 >= local158.length) {
						local425 = -1;
					} else {
						local425 = local158[local427++];
					}
				}
				this.aClass8Array1[local603] = local601;
				local425--;
			}
		}
		local425 = 0;
		local427 = 0;
		@Pc(651) int local651 = 0;
		for (@Pc(653) int local653 = 0; local653 < 128; local653++) {
			if (local425 == 0) {
				if (local427 < local347.length) {
					local425 = local347[local427++];
				} else {
					local425 = -1;
				}
				if (this.anIntArray289[local653] > 0) {
					local651 = local36.method5203() + 1;
				}
			}
			local425--;
			this.aByteArray47[local653] = (byte) local651;
		}
		this.anInt5663 = local36.method5203() + 1;
		@Pc(722) int local722;
		for (@Pc(711) int local711 = 0; local711 < local191; local711++) {
			@Pc(717) Class8 local717 = local241[local711];
			if (local717.aByteArray2 != null) {
				for (local722 = 1; local722 < local717.aByteArray2.length; local722 += 2) {
					local717.aByteArray2[local722] = local36.method5175();
				}
			}
			if (local717.aByteArray3 != null) {
				for (local722 = 3; local722 < local717.aByteArray3.length - 2; local722 += 2) {
					local717.aByteArray3[local722] = local36.method5175();
				}
			}
		}
		@Pc(767) int local767;
		if (local315 != null) {
			for (local767 = 1; local767 < local315.length; local767 += 2) {
				local315[local767] = local36.method5175();
			}
		}
		if (local331 != null) {
			for (local767 = 1; local767 < local331.length; local767 += 2) {
				local331[local767] = local36.method5175();
			}
		}
		@Pc(812) int local812;
		for (local767 = 0; local767 < local191; local767++) {
			@Pc(805) Class8 local805 = local241[local767];
			if (local805.aByteArray3 != null) {
				local374 = 0;
				for (local812 = 2; local812 < local805.aByteArray3.length; local812 += 2) {
					local374 = local36.method5203() + local374 + 1;
					local805.aByteArray3[local812] = (byte) local374;
				}
			}
		}
		@Pc(861) int local861;
		for (local722 = 0; local722 < local191; local722++) {
			@Pc(854) Class8 local854 = local241[local722];
			if (local854.aByteArray2 != null) {
				local374 = 0;
				for (local861 = 2; local861 < local854.aByteArray2.length; local861 += 2) {
					local374 = local374 + local36.method5203() + 1;
					local854.aByteArray2[local861] = (byte) local374;
				}
			}
		}
		@Pc(939) int local939;
		@Pc(966) int local966;
		@Pc(972) byte local972;
		@Pc(991) int local991;
		@Pc(993) int local993;
		@Pc(1003) int local1003;
		@Pc(933) byte local933;
		@Pc(1046) int local1046;
		if (local315 != null) {
			local374 = local36.method5203();
			local315[0] = (byte) local374;
			for (local812 = 2; local812 < local315.length; local812 += 2) {
				local374 = local374 + local36.method5203() + 1;
				local315[local812] = (byte) local374;
			}
			local933 = local315[0];
			@Pc(937) byte local937 = local315[1];
			for (local939 = 0; local939 < local933; local939++) {
				this.aByteArray47[local939] = (byte) (local937 * this.aByteArray47[local939] + 32 >> 6);
			}
			local966 = 2;
			while (local966 < local315.length) {
				local972 = local315[local966];
				@Pc(978) byte local978 = local315[local966 + 1];
				local991 = (local972 - local933) / 2 + local937 * (local972 - local933);
				for (local993 = local933; local993 < local972; local993++) {
					local1003 = Static454.method5732(local991, local972 - local933);
					this.aByteArray47[local993] = (byte) (local1003 * this.aByteArray47[local993] + 32 >> 6);
					local991 += local978 - local937;
				}
				local933 = local972;
				local966 += 2;
				local937 = local978;
			}
			for (local1046 = local933; local1046 < 128; local1046++) {
				this.aByteArray47[local1046] = (byte) (local937 * this.aByteArray47[local1046] + 32 >> 6);
			}
		}
		@Pc(1112) int local1112;
		if (local331 != null) {
			local374 = local36.method5203();
			local331[0] = (byte) local374;
			for (local812 = 2; local812 < local331.length; local812 += 2) {
				local374 = local36.method5203() + local374 + 1;
				local331[local812] = (byte) local374;
			}
			local933 = local331[0];
			local1112 = local331[1] << 1;
			for (local939 = 0; local939 < local933; local939++) {
				local966 = local1112 + (this.aByteArray48[local939] & 0xFF);
				if (local966 < 0) {
					local966 = 0;
				}
				if (local966 > 128) {
					local966 = 128;
				}
				this.aByteArray48[local939] = (byte) local966;
			}
			@Pc(1163) int local1163;
			for (local966 = 2; local966 < local331.length; local966 += 2) {
				local972 = local331[local966];
				local1163 = local331[local966 + 1] << 1;
				local991 = (local972 - local933) * local1112 + (local972 - local933) / 2;
				for (local993 = local933; local993 < local972; local993++) {
					local1003 = Static454.method5732(local991, local972 - local933);
					@Pc(1198) int local1198 = local1003 + (this.aByteArray48[local993] & 0xFF);
					if (local1198 < 0) {
						local1198 = 0;
					}
					if (local1198 > 128) {
						local1198 = 128;
					}
					this.aByteArray48[local993] = (byte) local1198;
					local991 += local1163 - local1112;
				}
				local933 = local972;
				local1112 = local1163;
			}
			for (local1046 = local933; local1046 < 128; local1046++) {
				local1163 = (this.aByteArray48[local1046] & 0xFF) + local1112;
				if (local1163 < 0) {
					local1163 = 0;
				}
				if (local1163 > 128) {
					local1163 = 128;
				}
				this.aByteArray48[local1046] = (byte) local1163;
			}
		}
		for (local812 = 0; local812 < local191; local812++) {
			local241[local812].anInt140 = local36.method5203();
		}
		for (local861 = 0; local861 < local191; local861++) {
			@Pc(1304) Class8 local1304 = local241[local861];
			if (local1304.aByteArray2 != null) {
				local1304.anInt137 = local36.method5203();
			}
			if (local1304.aByteArray3 != null) {
				local1304.anInt139 = local36.method5203();
			}
			if (local1304.anInt140 > 0) {
				local1304.anInt141 = local36.method5203();
			}
		}
		for (local1112 = 0; local1112 < local191; local1112++) {
			local241[local1112].anInt138 = local36.method5203();
		}
		for (local939 = 0; local939 < local191; local939++) {
			@Pc(1359) Class8 local1359 = local241[local939];
			if (local1359.anInt138 > 0) {
				local1359.anInt142 = local36.method5203();
			}
		}
		for (local966 = 0; local966 < local191; local966++) {
			@Pc(1382) Class8 local1382 = local241[local966];
			if (local1382.anInt142 > 0) {
				local1382.anInt143 = local36.method5203();
			}
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "([I[BILclient!ria;)Z")
	public boolean method5128(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class316 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub44_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray289[local18];
				if (local33 != 0) {
					if (local33 != local9) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg2.method8014(local33 >> 2, arg0);
						} else {
							local11 = arg2.method8011(arg0, local33 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub44_Sub1Array1[local18] = local11;
						this.anIntArray289[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V")
	public void method5129() {
		this.anIntArray289 = null;
	}
}
