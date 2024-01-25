import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "[Lclient!jk;")
	public Class2_Sub20_Sub1[] aClass2_Sub20_Sub1Array1;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
	public int anInt6047;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "[Lclient!jf;")
	public Class117[] aClass117Array1;

	@OriginalMember(owner = "client!sr", name = "D", descriptor = "[I")
	private int[] anIntArray525;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	private Class2_Sub36() {
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "([B)V")
	public Class2_Sub36(@OriginalArg(0) byte[] arg0) {
		this.aShortArray112 = new short[128];
		this.aClass2_Sub20_Sub1Array1 = new Class2_Sub20_Sub1[128];
		this.aByteArray90 = new byte[128];
		this.aByteArray91 = new byte[128];
		this.aClass117Array1 = new Class117[128];
		this.anIntArray525 = new int[128];
		this.aByteArray89 = new byte[128];
		@Pc(36) Class2_Sub24 local36 = new Class2_Sub24(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray100[local36.anInt6669 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method5759();
		}
		local36.anInt6669++;
		local38++;
		@Pc(83) int local83 = local36.anInt6669;
		local36.anInt6669 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray100[local36.anInt6669 + local91] != 0; local91++) {
		}
		@Pc(109) byte[] local109 = new byte[local91];
		for (@Pc(111) int local111 = 0; local111 < local91; local111++) {
			local109[local111] = local36.method5759();
		}
		local36.anInt6669++;
		local91++;
		@Pc(133) int local133 = local36.anInt6669;
		local36.anInt6669 += local91;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray100[local36.anInt6669 + local141] != 0; local141++) {
		}
		@Pc(158) byte[] local158 = new byte[local141];
		for (@Pc(160) int local160 = 0; local160 < local141; local160++) {
			local158[local160] = local36.method5759();
		}
		local141++;
		local36.anInt6669++;
		@Pc(182) byte[] local182 = new byte[local141];
		@Pc(187) int local187;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local141 <= 1) {
			local187 = local141;
		} else {
			local182[1] = 1;
			@Pc(195) int local195 = 1;
			local187 = 2;
			for (local199 = 2; local199 < local141; local199++) {
				local205 = local36.method5732();
				if (local205 == 0) {
					local195 = local187++;
				} else {
					if (local195 >= local205) {
						local205--;
					}
					local195 = local205;
				}
				local182[local199] = (byte) local195;
			}
		}
		@Pc(238) Class117[] local238 = new Class117[local187];
		for (local199 = 0; local199 < local238.length; local199++) {
			@Pc(250) Class117 local250 = local238[local199] = new Class117();
			@Pc(254) int local254 = local36.method5732();
			if (local254 > 0) {
				local250.aByteArray38 = new byte[local254 * 2];
			}
			local254 = local36.method5732();
			if (local254 > 0) {
				local250.aByteArray39 = new byte[local254 * 2 + 2];
				local250.aByteArray39[1] = 64;
			}
		}
		local205 = local36.method5732();
		@Pc(309) byte[] local309 = local205 <= 0 ? null : new byte[local205 * 2];
		local205 = local36.method5732();
		@Pc(325) byte[] local325 = local205 > 0 ? new byte[local205 * 2] : null;
		@Pc(327) int local327;
		for (local327 = 0; local36.aByteArray100[local36.anInt6669 + local327] != 0; local327++) {
		}
		@Pc(342) byte[] local342 = new byte[local327];
		for (@Pc(344) int local344 = 0; local344 < local327; local344++) {
			local342[local344] = local36.method5759();
		}
		local327++;
		local36.anInt6669++;
		@Pc(365) int local365 = 0;
		for (@Pc(367) int local367 = 0; local367 < 128; local367++) {
			local365 += local36.method5732();
			this.aShortArray112[local367] = (short) local365;
		}
		local365 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			local365 += local36.method5732();
			this.aShortArray112[local391] = (short) (this.aShortArray112[local391] + (local365 << 8));
		}
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		@Pc(422) int local422 = 0;
		for (@Pc(424) int local424 = 0; local424 < 128; local424++) {
			if (local418 == 0) {
				if (local420 >= local342.length) {
					local418 = -1;
				} else {
					local418 = local342[local420++];
				}
				local422 = local36.method5769();
			}
			this.aShortArray112[local424] = (short) (this.aShortArray112[local424] + ((local422 - 1 & 0x2) << 14));
			local418--;
			this.anIntArray525[local424] = local422;
		}
		local418 = 0;
		local420 = 0;
		@Pc(483) int local483 = 0;
		for (@Pc(485) int local485 = 0; local485 < 128; local485++) {
			if (this.anIntArray525[local485] != 0) {
				if (local418 == 0) {
					local483 = local36.aByteArray100[local83++] - 1;
					if (local55.length > local420) {
						local418 = local55[local420++];
					} else {
						local418 = -1;
					}
				}
				local418--;
				this.aByteArray91[local485] = (byte) local483;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(534) int local534 = 0;
		for (@Pc(536) int local536 = 0; local536 < 128; local536++) {
			if (this.anIntArray525[local536] != 0) {
				if (local418 == 0) {
					if (local109.length > local420) {
						local418 = local109[local420++];
					} else {
						local418 = -1;
					}
					local534 = local36.aByteArray100[local133++] + 16 << 2;
				}
				this.aByteArray89[local536] = (byte) local534;
				local418--;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(597) Class117 local597 = null;
		for (@Pc(599) int local599 = 0; local599 < 128; local599++) {
			if (this.anIntArray525[local599] != 0) {
				if (local418 == 0) {
					local597 = local238[local182[local420]];
					if (local420 < local158.length) {
						local418 = local158[local420++];
					} else {
						local418 = -1;
					}
				}
				this.aClass117Array1[local599] = local597;
				local418--;
			}
		}
		local420 = 0;
		local418 = 0;
		@Pc(648) int local648 = 0;
		for (@Pc(650) int local650 = 0; local650 < 128; local650++) {
			if (local418 == 0) {
				if (local420 < local342.length) {
					local418 = local342[local420++];
				} else {
					local418 = -1;
				}
				if (this.anIntArray525[local650] > 0) {
					local648 = local36.method5732() + 1;
				}
			}
			this.aByteArray90[local650] = (byte) local648;
			local418--;
		}
		this.anInt6047 = local36.method5732() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local187; local698++) {
			@Pc(704) Class117 local704 = local238[local698];
			if (local704.aByteArray38 != null) {
				for (local709 = 1; local709 < local704.aByteArray38.length; local709 += 2) {
					local704.aByteArray38[local709] = local36.method5759();
				}
			}
			if (local704.aByteArray39 != null) {
				for (local709 = 3; local709 < local704.aByteArray39.length - 2; local709 += 2) {
					local704.aByteArray39[local709] = local36.method5759();
				}
			}
		}
		@Pc(758) int local758;
		if (local309 != null) {
			for (local758 = 1; local758 < local309.length; local758 += 2) {
				local309[local758] = local36.method5759();
			}
		}
		if (local325 != null) {
			for (local758 = 1; local758 < local325.length; local758 += 2) {
				local325[local758] = local36.method5759();
			}
		}
		@Pc(811) int local811;
		for (local758 = 0; local758 < local187; local758++) {
			@Pc(804) Class117 local804 = local238[local758];
			if (local804.aByteArray39 != null) {
				local365 = 0;
				for (local811 = 2; local811 < local804.aByteArray39.length; local811 += 2) {
					local365 = local36.method5732() + local365 + 1;
					local804.aByteArray39[local811] = (byte) local365;
				}
			}
		}
		@Pc(860) int local860;
		for (local709 = 0; local709 < local187; local709++) {
			@Pc(853) Class117 local853 = local238[local709];
			if (local853.aByteArray38 != null) {
				local365 = 0;
				for (local860 = 2; local860 < local853.aByteArray38.length; local860 += 2) {
					local365 = local365 + local36.method5732() + 1;
					local853.aByteArray38[local860] = (byte) local365;
				}
			}
		}
		@Pc(934) int local934;
		@Pc(961) int local961;
		@Pc(967) byte local967;
		@Pc(987) int local987;
		@Pc(989) int local989;
		@Pc(999) int local999;
		@Pc(928) byte local928;
		@Pc(1046) int local1046;
		if (local309 != null) {
			local365 = local36.method5732();
			local309[0] = (byte) local365;
			for (local811 = 2; local811 < local309.length; local811 += 2) {
				local365 = local365 + local36.method5732() + 1;
				local309[local811] = (byte) local365;
			}
			local928 = local309[0];
			@Pc(932) byte local932 = local309[1];
			for (local934 = 0; local934 < local928; local934++) {
				this.aByteArray90[local934] = (byte) (local932 * this.aByteArray90[local934] + 32 >> 6);
			}
			local961 = 2;
			while (local309.length > local961) {
				local967 = local309[local961];
				@Pc(973) byte local973 = local309[local961 + 1];
				local987 = (local967 - local928) / 2 + local932 * (local967 - local928);
				for (local989 = local928; local989 < local967; local989++) {
					local999 = Static279.method4642(local967 - local928, local987);
					this.aByteArray90[local989] = (byte) (this.aByteArray90[local989] * local999 + 32 >> 6);
					local987 += local973 - local932;
				}
				local932 = local973;
				local961 += 2;
				local928 = local967;
			}
			for (local1046 = local928; local1046 < 128; local1046++) {
				this.aByteArray90[local1046] = (byte) (local932 * this.aByteArray90[local1046] + 32 >> 6);
			}
		}
		@Pc(1111) int local1111;
		if (local325 != null) {
			local365 = local36.method5732();
			local325[0] = (byte) local365;
			for (local811 = 2; local811 < local325.length; local811 += 2) {
				local365 = local365 + local36.method5732() + 1;
				local325[local811] = (byte) local365;
			}
			local928 = local325[0];
			local1111 = local325[1] << 1;
			for (local934 = 0; local934 < local928; local934++) {
				local961 = (this.aByteArray89[local934] & 0xFF) + local1111;
				if (local961 < 0) {
					local961 = 0;
				}
				if (local961 > 128) {
					local961 = 128;
				}
				this.aByteArray89[local934] = (byte) local961;
			}
			@Pc(1166) int local1166;
			for (local961 = 2; local961 < local325.length; local961 += 2) {
				local967 = local325[local961];
				local1166 = local325[local961 + 1] << 1;
				local987 = (local967 - local928) / 2 + local1111 * (local967 - local928);
				for (local989 = local928; local989 < local967; local989++) {
					local999 = Static279.method4642(local967 - local928, local987);
					@Pc(1201) int local1201 = (this.aByteArray89[local989] & 0xFF) + local999;
					if (local1201 < 0) {
						local1201 = 0;
					}
					if (local1201 > 128) {
						local1201 = 128;
					}
					this.aByteArray89[local989] = (byte) local1201;
					local987 += local1166 - local1111;
				}
				local928 = local967;
				local1111 = local1166;
			}
			for (local1046 = local928; local1046 < 128; local1046++) {
				local1166 = local1111 + (this.aByteArray89[local1046] & 0xFF);
				if (local1166 < 0) {
					local1166 = 0;
				}
				if (local1166 > 128) {
					local1166 = 128;
				}
				this.aByteArray89[local1046] = (byte) local1166;
			}
		}
		for (local811 = 0; local811 < local187; local811++) {
			local238[local811].anInt3319 = local36.method5732();
		}
		for (local860 = 0; local860 < local187; local860++) {
			@Pc(1303) Class117 local1303 = local238[local860];
			if (local1303.aByteArray38 != null) {
				local1303.anInt3321 = local36.method5732();
			}
			if (local1303.aByteArray39 != null) {
				local1303.anInt3322 = local36.method5732();
			}
			if (local1303.anInt3319 > 0) {
				local1303.anInt3316 = local36.method5732();
			}
		}
		for (local1111 = 0; local1111 < local187; local1111++) {
			local238[local1111].anInt3320 = local36.method5732();
		}
		for (local934 = 0; local934 < local187; local934++) {
			@Pc(1357) Class117 local1357 = local238[local934];
			if (local1357.anInt3320 > 0) {
				local1357.anInt3323 = local36.method5732();
			}
		}
		for (local961 = 0; local961 < local187; local961++) {
			@Pc(1384) Class117 local1384 = local238[local961];
			if (local1384.anInt3323 > 0) {
				local1384.anInt3315 = local36.method5732();
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	public void method5287() {
		this.anIntArray525 = null;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([IILclient!pq;[B)Z")
	public boolean method5291(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class186 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub20_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray525[local13];
				if (local28 != 0) {
					if (local9 != local28) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg1.method4586(arg0, local28 >> 2);
						} else {
							local11 = arg1.method4584(local28 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub20_Sub1Array1[local13] = local11;
						this.anIntArray525[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
