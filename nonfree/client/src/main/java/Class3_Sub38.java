import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "[Lclient!qp;")
	public Class296[] aClass296Array1;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "[Lclient!rea;")
	public Class3_Sub12_Sub1[] aClass3_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
	public int anInt6871;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "[S")
	public short[] aShortArray136;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	private Class3_Sub38() {
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "([B)V")
	public Class3_Sub38(@OriginalArg(0) byte[] arg0) {
		this.aByteArray63 = new byte[128];
		this.aClass296Array1 = new Class296[128];
		this.aByteArray64 = new byte[128];
		this.aClass3_Sub12_Sub1Array1 = new Class3_Sub12_Sub1[128];
		this.aByteArray65 = new byte[128];
		this.aShortArray136 = new short[128];
		this.anIntArray429 = new int[128];
		@Pc(36) Class3_Sub17 local36 = new Class3_Sub17(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray59[local38 + local36.lb] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4861();
		}
		local38++;
		local36.lb++;
		@Pc(76) int local76 = local36.lb;
		local36.lb += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray59[local84 + local36.lb] != 0; local84++) {
		}
		@Pc(101) byte[] local101 = new byte[local84];
		for (@Pc(103) int local103 = 0; local103 < local84; local103++) {
			local101[local103] = local36.method4861();
		}
		local84++;
		local36.lb++;
		@Pc(129) int local129 = local36.lb;
		local36.lb += local84;
		@Pc(137) int local137;
		for (local137 = 0; local36.aByteArray59[local36.lb + local137] != 0; local137++) {
		}
		@Pc(152) byte[] local152 = new byte[local137];
		for (@Pc(154) int local154 = 0; local154 < local137; local154++) {
			local152[local154] = local36.method4861();
		}
		local36.lb++;
		local137++;
		@Pc(176) byte[] local176 = new byte[local137];
		@Pc(187) int local187;
		@Pc(191) int local191;
		@Pc(197) int local197;
		if (local137 > 1) {
			local176[1] = 1;
			local187 = 2;
			@Pc(189) int local189 = 1;
			for (local191 = 2; local191 < local137; local191++) {
				local197 = local36.method4888();
				if (local197 == 0) {
					local189 = local187++;
				} else {
					if (local189 >= local197) {
						local197--;
					}
					local189 = local197;
				}
				local176[local191] = (byte) local189;
			}
		} else {
			local187 = local137;
		}
		@Pc(230) Class296[] local230 = new Class296[local187];
		for (local191 = 0; local191 < local230.length; local191++) {
			@Pc(242) Class296 local242 = local230[local191] = new Class296();
			@Pc(246) int local246 = local36.method4888();
			if (local246 > 0) {
				local242.aByteArray79 = new byte[local246 * 2];
			}
			local246 = local36.method4888();
			if (local246 > 0) {
				local242.aByteArray80 = new byte[local246 * 2 + 2];
				local242.aByteArray80[1] = 64;
			}
		}
		local197 = local36.method4888();
		@Pc(294) byte[] local294 = local197 <= 0 ? null : new byte[local197 * 2];
		local197 = local36.method4888();
		@Pc(310) byte[] local310 = local197 > 0 ? new byte[local197 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray59[local312 + local36.lb] != 0; local312++) {
		}
		@Pc(326) byte[] local326 = new byte[local312];
		for (@Pc(328) int local328 = 0; local328 < local312; local328++) {
			local326[local328] = local36.method4861();
		}
		local36.lb++;
		local312++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local36.method4888();
			this.aShortArray136[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local353 += local36.method4888();
			this.aShortArray136[local377] = (short) (this.aShortArray136[local377] + (local353 << 8));
		}
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		for (@Pc(410) int local410 = 0; local410 < 128; local410++) {
			if (local404 == 0) {
				if (local406 >= local326.length) {
					local404 = -1;
				} else {
					local404 = local326[local406++];
				}
				local408 = local36.method4859();
			}
			this.aShortArray136[local410] = (short) (this.aShortArray136[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray429[local410] = local408;
			local404--;
		}
		local404 = 0;
		local406 = 0;
		@Pc(466) int local466 = 0;
		for (@Pc(468) int local468 = 0; local468 < 128; local468++) {
			if (this.anIntArray429[local468] != 0) {
				if (local404 == 0) {
					if (local52.length > local406) {
						local404 = local52[local406++];
					} else {
						local404 = -1;
					}
					local466 = local36.aByteArray59[local76++] - 1;
				}
				local404--;
				this.aByteArray65[local468] = (byte) local466;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(518) int local518 = 0;
		for (@Pc(520) int local520 = 0; local520 < 128; local520++) {
			if (this.anIntArray429[local520] != 0) {
				if (local404 == 0) {
					if (local101.length <= local406) {
						local404 = -1;
					} else {
						local404 = local101[local406++];
					}
					local518 = local36.aByteArray59[local129++] + 16 << 2;
				}
				this.aByteArray64[local520] = (byte) local518;
				local404--;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(579) Class296 local579 = null;
		for (@Pc(581) int local581 = 0; local581 < 128; local581++) {
			if (this.anIntArray429[local581] != 0) {
				if (local404 == 0) {
					local579 = local230[local176[local406]];
					if (local406 < local152.length) {
						local404 = local152[local406++];
					} else {
						local404 = -1;
					}
				}
				this.aClass296Array1[local581] = local579;
				local404--;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(629) int local629 = 0;
		for (@Pc(631) int local631 = 0; local631 < 128; local631++) {
			if (local404 == 0) {
				if (local406 >= local326.length) {
					local404 = -1;
				} else {
					local404 = local326[local406++];
				}
				if (this.anIntArray429[local631] > 0) {
					local629 = local36.method4888() + 1;
				}
			}
			this.aByteArray63[local631] = (byte) local629;
			local404--;
		}
		this.anInt6871 = local36.method4888() + 1;
		@Pc(695) int local695;
		for (@Pc(684) int local684 = 0; local684 < local187; local684++) {
			@Pc(690) Class296 local690 = local230[local684];
			if (local690.aByteArray79 != null) {
				for (local695 = 1; local695 < local690.aByteArray79.length; local695 += 2) {
					local690.aByteArray79[local695] = local36.method4861();
				}
			}
			if (local690.aByteArray80 != null) {
				for (local695 = 3; local695 < local690.aByteArray80.length - 2; local695 += 2) {
					local690.aByteArray80[local695] = local36.method4861();
				}
			}
		}
		@Pc(752) int local752;
		if (local294 != null) {
			for (local752 = 1; local752 < local294.length; local752 += 2) {
				local294[local752] = local36.method4861();
			}
		}
		if (local310 != null) {
			for (local752 = 1; local752 < local310.length; local752 += 2) {
				local310[local752] = local36.method4861();
			}
		}
		@Pc(797) int local797;
		for (local752 = 0; local752 < local187; local752++) {
			@Pc(790) Class296 local790 = local230[local752];
			if (local790.aByteArray80 != null) {
				local353 = 0;
				for (local797 = 2; local797 < local790.aByteArray80.length; local797 += 2) {
					local353 = local36.method4888() + local353 + 1;
					local790.aByteArray80[local797] = (byte) local353;
				}
			}
		}
		@Pc(842) int local842;
		for (local695 = 0; local695 < local187; local695++) {
			@Pc(835) Class296 local835 = local230[local695];
			if (local835.aByteArray79 != null) {
				local353 = 0;
				for (local842 = 2; local842 < local835.aByteArray79.length; local842 += 2) {
					local353 = local353 + local36.method4888() + 1;
					local835.aByteArray79[local842] = (byte) local353;
				}
			}
		}
		@Pc(911) int local911;
		@Pc(934) int local934;
		@Pc(940) byte local940;
		@Pc(960) int local960;
		@Pc(962) int local962;
		@Pc(972) int local972;
		@Pc(905) byte local905;
		@Pc(1015) int local1015;
		if (local294 != null) {
			local353 = local36.method4888();
			local294[0] = (byte) local353;
			for (local797 = 2; local797 < local294.length; local797 += 2) {
				local353 = local353 + local36.method4888() + 1;
				local294[local797] = (byte) local353;
			}
			local905 = local294[0];
			@Pc(909) byte local909 = local294[1];
			for (local911 = 0; local911 < local905; local911++) {
				this.aByteArray63[local911] = (byte) (local909 * this.aByteArray63[local911] + 32 >> 6);
			}
			for (local934 = 2; local934 < local294.length; local934 += 2) {
				local940 = local294[local934];
				@Pc(946) byte local946 = local294[local934 + 1];
				local960 = (local940 - local905) / 2 + local909 * (local940 - local905);
				for (local962 = local905; local962 < local940; local962++) {
					local972 = Static117.method2131(local960, local940 - local905);
					local960 += local946 - local909;
					this.aByteArray63[local962] = (byte) (local972 * this.aByteArray63[local962] + 32 >> 6);
				}
				local905 = local940;
				local909 = local946;
			}
			for (local1015 = local905; local1015 < 128; local1015++) {
				this.aByteArray63[local1015] = (byte) (local909 * this.aByteArray63[local1015] + 32 >> 6);
			}
		}
		@Pc(1083) int local1083;
		if (local310 != null) {
			local353 = local36.method4888();
			local310[0] = (byte) local353;
			for (local797 = 2; local797 < local310.length; local797 += 2) {
				local353 = local353 + local36.method4888() + 1;
				local310[local797] = (byte) local353;
			}
			local905 = local310[0];
			local1083 = local310[1] << 1;
			for (local911 = 0; local911 < local905; local911++) {
				local934 = local1083 + (this.aByteArray64[local911] & 0xFF);
				if (local934 < 0) {
					local934 = 0;
				}
				if (local934 > 128) {
					local934 = 128;
				}
				this.aByteArray64[local911] = (byte) local934;
			}
			local934 = 2;
			@Pc(1135) int local1135;
			while (local310.length > local934) {
				local940 = local310[local934];
				local1135 = local310[local934 + 1] << 1;
				local960 = (local940 - local905) / 2 + (local940 - local905) * local1083;
				for (local962 = local905; local962 < local940; local962++) {
					local972 = Static117.method2131(local960, local940 - local905);
					@Pc(1169) int local1169 = (this.aByteArray64[local962] & 0xFF) + local972;
					if (local1169 < 0) {
						local1169 = 0;
					}
					if (local1169 > 128) {
						local1169 = 128;
					}
					local960 += local1135 - local1083;
					this.aByteArray64[local962] = (byte) local1169;
				}
				local1083 = local1135;
				local934 += 2;
				local905 = local940;
			}
			for (local1015 = local905; local1015 < 128; local1015++) {
				local1135 = (this.aByteArray64[local1015] & 0xFF) + local1083;
				if (local1135 < 0) {
					local1135 = 0;
				}
				if (local1135 > 128) {
					local1135 = 128;
				}
				this.aByteArray64[local1015] = (byte) local1135;
			}
		}
		for (local797 = 0; local797 < local187; local797++) {
			local230[local797].anInt8334 = local36.method4888();
		}
		for (local842 = 0; local842 < local187; local842++) {
			@Pc(1274) Class296 local1274 = local230[local842];
			if (local1274.aByteArray79 != null) {
				local1274.anInt8337 = local36.method4888();
			}
			if (local1274.aByteArray80 != null) {
				local1274.anInt8332 = local36.method4888();
			}
			if (local1274.anInt8334 > 0) {
				local1274.anInt8330 = local36.method4888();
			}
		}
		for (local1083 = 0; local1083 < local187; local1083++) {
			local230[local1083].anInt8335 = local36.method4888();
		}
		for (local911 = 0; local911 < local187; local911++) {
			@Pc(1333) Class296 local1333 = local230[local911];
			if (local1333.anInt8335 > 0) {
				local1333.anInt8328 = local36.method4888();
			}
		}
		for (local934 = 0; local934 < local187; local934++) {
			@Pc(1360) Class296 local1360 = local230[local934];
			if (local1360.anInt8328 > 0) {
				local1360.anInt8333 = local36.method4888();
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public void method5745() {
		this.anIntArray429 = null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLclient!ea;[B[I)Z")
	public boolean method5746(@OriginalArg(1) Class91 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub12_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(36) int local36 = this.anIntArray429[local13];
				if (local36 != 0) {
					if (local9 != local36) {
						local9 = local36--;
						if ((local36 & 0x1) == 0) {
							local11 = arg0.method2189(local36 >> 2, arg2);
						} else {
							local11 = arg0.method2193(arg2, local36 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub12_Sub1Array1[local13] = local11;
						this.anIntArray429[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
