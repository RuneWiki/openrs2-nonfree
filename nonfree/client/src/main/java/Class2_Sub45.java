import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	public int anInt8833;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "[I")
	private int[] anIntArray639;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "[Lclient!oaa;")
	public Class2_Sub7_Sub1[] aClass2_Sub7_Sub1Array1;

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "[Lclient!mu;")
	public Class226[] aClass226Array1;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	private Class2_Sub45() {
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([B)V")
	public Class2_Sub45(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub7_Sub1Array1 = new Class2_Sub7_Sub1[128];
		this.aByteArray88 = new byte[128];
		this.aByteArray89 = new byte[128];
		this.aClass226Array1 = new Class226[128];
		this.anIntArray639 = new int[128];
		this.aByteArray90 = new byte[128];
		this.aShortArray120 = new short[128];
		@Pc(36) Class2_Sub15 local36 = new Class2_Sub15(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray62[local38 + local36.anInt5241] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4304();
		}
		local38++;
		local36.anInt5241++;
		@Pc(80) int local80 = local36.anInt5241;
		local36.anInt5241 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray62[local88 + local36.anInt5241] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method4304();
		}
		local88++;
		local36.anInt5241++;
		@Pc(133) int local133 = local36.anInt5241;
		local36.anInt5241 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray62[local141 + local36.anInt5241] != 0; local141++) {
		}
		@Pc(158) byte[] local158 = new byte[local141];
		for (@Pc(160) int local160 = 0; local160 < local141; local160++) {
			local158[local160] = local36.method4304();
		}
		local36.anInt5241++;
		local141++;
		@Pc(182) byte[] local182 = new byte[local141];
		@Pc(187) int local187;
		@Pc(199) int local199;
		@Pc(205) int local205;
		if (local141 <= 1) {
			local187 = local141;
		} else {
			local182[1] = 1;
			local187 = 2;
			@Pc(197) int local197 = 1;
			for (local199 = 2; local199 < local141; local199++) {
				local205 = local36.method4325();
				if (local205 == 0) {
					local197 = local187++;
				} else {
					if (local197 >= local205) {
						local205--;
					}
					local197 = local205;
				}
				local182[local199] = (byte) local197;
			}
		}
		@Pc(238) Class226[] local238 = new Class226[local187];
		for (local199 = 0; local199 < local238.length; local199++) {
			@Pc(250) Class226 local250 = local238[local199] = new Class226();
			@Pc(254) int local254 = local36.method4325();
			if (local254 > 0) {
				local250.aByteArray66 = new byte[local254 * 2];
			}
			local254 = local36.method4325();
			if (local254 > 0) {
				local250.aByteArray65 = new byte[local254 * 2 + 2];
				local250.aByteArray65[1] = 64;
			}
		}
		local205 = local36.method4325();
		@Pc(302) byte[] local302 = local205 <= 0 ? null : new byte[local205 * 2];
		local205 = local36.method4325();
		@Pc(318) byte[] local318 = local205 > 0 ? new byte[local205 * 2] : null;
		@Pc(320) int local320;
		for (local320 = 0; local36.aByteArray62[local36.anInt5241 + local320] != 0; local320++) {
		}
		@Pc(337) byte[] local337 = new byte[local320];
		for (@Pc(339) int local339 = 0; local339 < local320; local339++) {
			local337[local339] = local36.method4304();
		}
		local320++;
		local36.anInt5241++;
		@Pc(364) int local364 = 0;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local364 += local36.method4325();
			this.aShortArray120[local366] = (short) local364;
		}
		local364 = 0;
		for (@Pc(388) int local388 = 0; local388 < 128; local388++) {
			local364 += local36.method4325();
			this.aShortArray120[local388] = (short) (this.aShortArray120[local388] + (local364 << 8));
		}
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		for (@Pc(419) int local419 = 0; local419 < 128; local419++) {
			if (local413 == 0) {
				if (local415 >= local337.length) {
					local413 = -1;
				} else {
					local413 = local337[local415++];
				}
				local417 = local36.method4315();
			}
			this.aShortArray120[local419] = (short) (this.aShortArray120[local419] + ((local417 - 1 & 0x2) << 14));
			local413--;
			this.anIntArray639[local419] = local417;
		}
		local415 = 0;
		local413 = 0;
		@Pc(474) int local474 = 0;
		for (@Pc(476) int local476 = 0; local476 < 128; local476++) {
			if (this.anIntArray639[local476] != 0) {
				if (local413 == 0) {
					if (local415 >= local52.length) {
						local413 = -1;
					} else {
						local413 = local52[local415++];
					}
					local474 = local36.aByteArray62[local80++] - 1;
				}
				local413--;
				this.aByteArray88[local476] = (byte) local474;
			}
		}
		local413 = 0;
		local415 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray639[local525] != 0) {
				if (local413 == 0) {
					local523 = local36.aByteArray62[local133++] + 16 << 2;
					if (local105.length <= local415) {
						local413 = -1;
					} else {
						local413 = local105[local415++];
					}
				}
				local413--;
				this.aByteArray89[local525] = (byte) local523;
			}
		}
		local415 = 0;
		local413 = 0;
		@Pc(580) Class226 local580 = null;
		for (@Pc(582) int local582 = 0; local582 < 128; local582++) {
			if (this.anIntArray639[local582] != 0) {
				if (local413 == 0) {
					local580 = local238[local182[local415]];
					if (local158.length <= local415) {
						local413 = -1;
					} else {
						local413 = local158[local415++];
					}
				}
				local413--;
				this.aClass226Array1[local582] = local580;
			}
		}
		local415 = 0;
		local413 = 0;
		@Pc(629) int local629 = 0;
		for (@Pc(631) int local631 = 0; local631 < 128; local631++) {
			if (local413 == 0) {
				if (local337.length <= local415) {
					local413 = -1;
				} else {
					local413 = local337[local415++];
				}
				if (this.anIntArray639[local631] > 0) {
					local629 = local36.method4325() + 1;
				}
			}
			this.aByteArray90[local631] = (byte) local629;
			local413--;
		}
		this.anInt8833 = local36.method4325() + 1;
		@Pc(696) int local696;
		for (@Pc(685) int local685 = 0; local685 < local187; local685++) {
			@Pc(691) Class226 local691 = local238[local685];
			if (local691.aByteArray66 != null) {
				for (local696 = 1; local696 < local691.aByteArray66.length; local696 += 2) {
					local691.aByteArray66[local696] = local36.method4304();
				}
			}
			if (local691.aByteArray65 != null) {
				for (local696 = 3; local696 < local691.aByteArray65.length - 2; local696 += 2) {
					local691.aByteArray65[local696] = local36.method4304();
				}
			}
		}
		@Pc(741) int local741;
		if (local302 != null) {
			for (local741 = 1; local741 < local302.length; local741 += 2) {
				local302[local741] = local36.method4304();
			}
		}
		if (local318 != null) {
			for (local741 = 1; local741 < local318.length; local741 += 2) {
				local318[local741] = local36.method4304();
			}
		}
		@Pc(790) int local790;
		for (local741 = 0; local741 < local187; local741++) {
			@Pc(783) Class226 local783 = local238[local741];
			if (local783.aByteArray65 != null) {
				local364 = 0;
				for (local790 = 2; local790 < local783.aByteArray65.length; local790 += 2) {
					local364 = local364 + local36.method4325() + 1;
					local783.aByteArray65[local790] = (byte) local364;
				}
			}
		}
		@Pc(839) int local839;
		for (local696 = 0; local696 < local187; local696++) {
			@Pc(832) Class226 local832 = local238[local696];
			if (local832.aByteArray66 != null) {
				local364 = 0;
				for (local839 = 2; local839 < local832.aByteArray66.length; local839 += 2) {
					local364 += local36.method4325() + 1;
					local832.aByteArray66[local839] = (byte) local364;
				}
			}
		}
		@Pc(916) int local916;
		@Pc(943) int local943;
		@Pc(949) byte local949;
		@Pc(969) int local969;
		@Pc(971) int local971;
		@Pc(980) int local980;
		@Pc(910) byte local910;
		@Pc(1027) int local1027;
		if (local302 != null) {
			local364 = local36.method4325();
			local302[0] = (byte) local364;
			for (local790 = 2; local790 < local302.length; local790 += 2) {
				local364 += local36.method4325() + 1;
				local302[local790] = (byte) local364;
			}
			local910 = local302[0];
			@Pc(914) byte local914 = local302[1];
			for (local916 = 0; local916 < local910; local916++) {
				this.aByteArray90[local916] = (byte) (local914 * this.aByteArray90[local916] + 32 >> 6);
			}
			local943 = 2;
			while (local943 < local302.length) {
				local949 = local302[local943];
				@Pc(955) byte local955 = local302[local943 + 1];
				local969 = local914 * (local949 - local910) + (local949 - local910) / 2;
				for (local971 = local910; local971 < local949; local971++) {
					local980 = Static274.method4154(local969, local949 - local910);
					local969 += local955 - local914;
					this.aByteArray90[local971] = (byte) (local980 * this.aByteArray90[local971] + 32 >> 6);
				}
				local914 = local955;
				local943 += 2;
				local910 = local949;
			}
			for (local1027 = local910; local1027 < 128; local1027++) {
				this.aByteArray90[local1027] = (byte) (local914 * this.aByteArray90[local1027] + 32 >> 6);
			}
		}
		@Pc(1095) int local1095;
		if (local318 != null) {
			local364 = local36.method4325();
			local318[0] = (byte) local364;
			for (local790 = 2; local790 < local318.length; local790 += 2) {
				local364 += local36.method4325() + 1;
				local318[local790] = (byte) local364;
			}
			local910 = local318[0];
			local1095 = local318[1] << 1;
			for (local916 = 0; local916 < local910; local916++) {
				local943 = local1095 + (this.aByteArray89[local916] & 0xFF);
				if (local943 < 0) {
					local943 = 0;
				}
				if (local943 > 128) {
					local943 = 128;
				}
				this.aByteArray89[local916] = (byte) local943;
			}
			local943 = 2;
			@Pc(1146) int local1146;
			while (local318.length > local943) {
				local949 = local318[local943];
				local1146 = local318[local943 + 1] << 1;
				local969 = local1095 * (local949 - local910) + (local949 - local910) / 2;
				for (local971 = local910; local971 < local949; local971++) {
					local980 = Static274.method4154(local969, local949 - local910);
					@Pc(1181) int local1181 = (this.aByteArray89[local971] & 0xFF) + local980;
					if (local1181 < 0) {
						local1181 = 0;
					}
					if (local1181 > 128) {
						local1181 = 128;
					}
					local969 += local1146 - local1095;
					this.aByteArray89[local971] = (byte) local1181;
				}
				local943 += 2;
				local1095 = local1146;
				local910 = local949;
			}
			for (local1027 = local910; local1027 < 128; local1027++) {
				local1146 = (this.aByteArray89[local1027] & 0xFF) + local1095;
				if (local1146 < 0) {
					local1146 = 0;
				}
				if (local1146 > 128) {
					local1146 = 128;
				}
				this.aByteArray89[local1027] = (byte) local1146;
			}
		}
		for (local790 = 0; local790 < local187; local790++) {
			local238[local790].anInt6248 = local36.method4325();
		}
		for (local839 = 0; local839 < local187; local839++) {
			@Pc(1294) Class226 local1294 = local238[local839];
			if (local1294.aByteArray66 != null) {
				local1294.anInt6252 = local36.method4325();
			}
			if (local1294.aByteArray65 != null) {
				local1294.anInt6254 = local36.method4325();
			}
			if (local1294.anInt6248 > 0) {
				local1294.anInt6256 = local36.method4325();
			}
		}
		for (local1095 = 0; local1095 < local187; local1095++) {
			local238[local1095].anInt6249 = local36.method4325();
		}
		for (local916 = 0; local916 < local187; local916++) {
			@Pc(1353) Class226 local1353 = local238[local916];
			if (local1353.anInt6249 > 0) {
				local1353.anInt6250 = local36.method4325();
			}
		}
		for (local943 = 0; local943 < local187; local943++) {
			@Pc(1380) Class226 local1380 = local238[local943];
			if (local1380.anInt6250 > 0) {
				local1380.anInt6251 = local36.method4325();
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([ILclient!pj;[BI)Z")
	public boolean method7379(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class2_Sub7_Sub1 local11 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray639[local18];
				if (local30 != 0) {
					if (local30 != local9) {
						local9 = local30--;
						if ((local30 & 0x1) == 0) {
							local11 = arg1.method5956(local30 >> 2, arg0);
						} else {
							local11 = arg1.method5957(local30 >> 2, arg0);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass2_Sub7_Sub1Array1[local18] = local11;
						this.anIntArray639[local18] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public void method7380() {
		this.anIntArray639 = null;
	}
}
