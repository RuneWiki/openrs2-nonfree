import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[Lclient!ij;")
	public Class114[] aClass114Array1;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	public int anInt6682;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "[S")
	public short[] aShortArray140;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "[Lclient!bq;")
	public Class3_Sub6_Sub1[] aClass3_Sub6_Sub1Array1;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	private Class3_Sub42() {
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([B)V")
	public Class3_Sub42(@OriginalArg(0) byte[] arg0) {
		this.anIntArray452 = new int[128];
		this.aClass3_Sub6_Sub1Array1 = new Class3_Sub6_Sub1[128];
		this.aByteArray86 = new byte[128];
		this.aByteArray85 = new byte[128];
		this.aClass114Array1 = new Class114[128];
		this.aShortArray140 = new short[128];
		this.aByteArray84 = new byte[128];
		@Pc(34) Class3_Sub7 local34 = new Class3_Sub7(arg0);
		@Pc(36) int local36;
		for (local36 = 0; local34.aByteArray46[local36 + local34.anInt3235] != 0; local36++) {
		}
		@Pc(52) byte[] local52 = new byte[local36];
		for (@Pc(54) int local54 = 0; local54 < local36; local54++) {
			local52[local54] = local34.method2612();
		}
		local36++;
		local34.anInt3235++;
		@Pc(79) int local79 = local34.anInt3235;
		local34.anInt3235 += local36;
		@Pc(87) int local87;
		for (local87 = 0; local34.aByteArray46[local87 + local34.anInt3235] != 0; local87++) {
		}
		@Pc(103) byte[] local103 = new byte[local87];
		for (@Pc(105) int local105 = 0; local105 < local87; local105++) {
			local103[local105] = local34.method2612();
		}
		local87++;
		local34.anInt3235++;
		@Pc(130) int local130 = local34.anInt3235;
		local34.anInt3235 += local87;
		@Pc(138) int local138;
		for (local138 = 0; local34.aByteArray46[local138 + local34.anInt3235] != 0; local138++) {
		}
		@Pc(154) byte[] local154 = new byte[local138];
		for (@Pc(156) int local156 = 0; local156 < local138; local156++) {
			local154[local156] = local34.method2612();
		}
		local138++;
		local34.anInt3235++;
		@Pc(177) byte[] local177 = new byte[local138];
		@Pc(182) int local182;
		@Pc(193) int local193;
		@Pc(198) int local198;
		if (local138 <= 1) {
			local182 = local138;
		} else {
			local177[1] = 1;
			@Pc(189) int local189 = 1;
			local182 = 2;
			for (local193 = 2; local193 < local138; local193++) {
				local198 = local34.method2582();
				if (local198 == 0) {
					local189 = local182++;
				} else {
					if (local189 >= local198) {
						local198--;
					}
					local189 = local198;
				}
				local177[local193] = (byte) local189;
			}
		}
		@Pc(226) Class114[] local226 = new Class114[local182];
		for (local193 = 0; local193 < local226.length; local193++) {
			@Pc(237) Class114 local237 = local226[local193] = new Class114();
			@Pc(241) int local241 = local34.method2582();
			if (local241 > 0) {
				local237.aByteArray48 = new byte[local241 * 2];
			}
			local241 = local34.method2582();
			if (local241 > 0) {
				local237.aByteArray49 = new byte[local241 * 2 + 2];
				local237.aByteArray49[1] = 64;
			}
		}
		local198 = local34.method2582();
		@Pc(292) byte[] local292 = local198 > 0 ? new byte[local198 * 2] : null;
		local198 = local34.method2582();
		@Pc(308) byte[] local308 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(310) int local310;
		for (local310 = 0; local34.aByteArray46[local34.anInt3235 + local310] != 0; local310++) {
		}
		@Pc(323) byte[] local323 = new byte[local310];
		for (@Pc(325) int local325 = 0; local325 < local310; local325++) {
			local323[local325] = local34.method2612();
		}
		local34.anInt3235++;
		local310++;
		@Pc(349) int local349 = 0;
		for (@Pc(351) int local351 = 0; local351 < 128; local351++) {
			local349 += local34.method2582();
			this.aShortArray140[local351] = (short) local349;
		}
		local349 = 0;
		for (@Pc(372) int local372 = 0; local372 < 128; local372++) {
			local349 += local34.method2582();
			this.aShortArray140[local372] = (short) (this.aShortArray140[local372] + (local349 << 8));
		}
		@Pc(396) int local396 = 0;
		@Pc(398) int local398 = 0;
		@Pc(400) int local400 = 0;
		for (@Pc(402) int local402 = 0; local402 < 128; local402++) {
			if (local396 == 0) {
				if (local398 >= local323.length) {
					local396 = -1;
				} else {
					local396 = local323[local398++];
				}
				local400 = local34.method2600();
			}
			this.aShortArray140[local402] = (short) (this.aShortArray140[local402] + ((local400 - 1 & 0x2) << 14));
			local396--;
			this.anIntArray452[local402] = local400;
		}
		local396 = 0;
		local398 = 0;
		@Pc(461) int local461 = 0;
		for (@Pc(463) int local463 = 0; local463 < 128; local463++) {
			if (this.anIntArray452[local463] != 0) {
				if (local396 == 0) {
					local461 = local34.aByteArray46[local79++] - 1;
					if (local52.length <= local398) {
						local396 = -1;
					} else {
						local396 = local52[local398++];
					}
				}
				this.aByteArray86[local463] = (byte) local461;
				local396--;
			}
		}
		local398 = 0;
		local396 = 0;
		@Pc(517) int local517 = 0;
		for (@Pc(519) int local519 = 0; local519 < 128; local519++) {
			if (this.anIntArray452[local519] != 0) {
				if (local396 == 0) {
					if (local103.length <= local398) {
						local396 = -1;
					} else {
						local396 = local103[local398++];
					}
					local517 = local34.aByteArray46[local130++] + 16 << 2;
				}
				this.aByteArray84[local519] = (byte) local517;
				local396--;
			}
		}
		local398 = 0;
		local396 = 0;
		@Pc(569) Class114 local569 = null;
		for (@Pc(571) int local571 = 0; local571 < 128; local571++) {
			if (this.anIntArray452[local571] != 0) {
				if (local396 == 0) {
					local569 = local226[local177[local398]];
					if (local154.length > local398) {
						local396 = local154[local398++];
					} else {
						local396 = -1;
					}
				}
				local396--;
				this.aClass114Array1[local571] = local569;
			}
		}
		local396 = 0;
		local398 = 0;
		@Pc(615) int local615 = 0;
		for (@Pc(617) int local617 = 0; local617 < 128; local617++) {
			if (local396 == 0) {
				if (local398 < local323.length) {
					local396 = local323[local398++];
				} else {
					local396 = -1;
				}
				if (this.anIntArray452[local617] > 0) {
					local615 = local34.method2582() + 1;
				}
			}
			this.aByteArray85[local617] = (byte) local615;
			local396--;
		}
		this.anInt6682 = local34.method2582() + 1;
		@Pc(681) int local681;
		for (@Pc(671) int local671 = 0; local671 < local182; local671++) {
			@Pc(676) Class114 local676 = local226[local671];
			if (local676.aByteArray48 != null) {
				for (local681 = 1; local681 < local676.aByteArray48.length; local681 += 2) {
					local676.aByteArray48[local681] = local34.method2612();
				}
			}
			if (local676.aByteArray49 != null) {
				for (local681 = 3; local681 < local676.aByteArray49.length - 2; local681 += 2) {
					local676.aByteArray49[local681] = local34.method2612();
				}
			}
		}
		@Pc(732) int local732;
		if (local292 != null) {
			for (local732 = 1; local732 < local292.length; local732 += 2) {
				local292[local732] = local34.method2612();
			}
		}
		if (local308 != null) {
			for (local732 = 1; local732 < local308.length; local732 += 2) {
				local308[local732] = local34.method2612();
			}
		}
		@Pc(774) int local774;
		for (local732 = 0; local732 < local182; local732++) {
			@Pc(767) Class114 local767 = local226[local732];
			if (local767.aByteArray49 != null) {
				local349 = 0;
				for (local774 = 2; local774 < local767.aByteArray49.length; local774 += 2) {
					local349 = local34.method2582() + local349 + 1;
					local767.aByteArray49[local774] = (byte) local349;
				}
			}
		}
		@Pc(813) int local813;
		for (local681 = 0; local681 < local182; local681++) {
			@Pc(806) Class114 local806 = local226[local681];
			if (local806.aByteArray48 != null) {
				local349 = 0;
				for (local813 = 2; local813 < local806.aByteArray48.length; local813 += 2) {
					local349 += local34.method2582() + 1;
					local806.aByteArray48[local813] = (byte) local349;
				}
			}
		}
		@Pc(889) int local889;
		@Pc(915) int local915;
		@Pc(920) byte local920;
		@Pc(940) int local940;
		@Pc(942) int local942;
		@Pc(951) int local951;
		@Pc(883) byte local883;
		@Pc(992) int local992;
		if (local292 != null) {
			local349 = local34.method2582();
			local292[0] = (byte) local349;
			for (local774 = 2; local774 < local292.length; local774 += 2) {
				local349 = local34.method2582() + local349 + 1;
				local292[local774] = (byte) local349;
			}
			local883 = local292[0];
			@Pc(887) byte local887 = local292[1];
			for (local889 = 0; local889 < local883; local889++) {
				this.aByteArray85[local889] = (byte) (this.aByteArray85[local889] * local887 + 32 >> 6);
			}
			local915 = 2;
			while (local292.length > local915) {
				local920 = local292[local915];
				@Pc(926) byte local926 = local292[local915 + 1];
				local940 = (local920 - local883) * local887 + (local920 - local883) / 2;
				for (local942 = local883; local942 < local920; local942++) {
					local951 = Static202.method3169(local940, local920 - local883);
					this.aByteArray85[local942] = (byte) (this.aByteArray85[local942] * local951 + 32 >> 6);
					local940 += local926 - local887;
				}
				local915 += 2;
				local883 = local920;
				local887 = local926;
			}
			for (local992 = local883; local992 < 128; local992++) {
				this.aByteArray85[local992] = (byte) (local887 * this.aByteArray85[local992] + 32 >> 6);
			}
		}
		@Pc(1058) int local1058;
		if (local308 != null) {
			local349 = local34.method2582();
			local308[0] = (byte) local349;
			for (local774 = 2; local774 < local308.length; local774 += 2) {
				local349 = local34.method2582() + local349 + 1;
				local308[local774] = (byte) local349;
			}
			local883 = local308[0];
			local1058 = local308[1] << 1;
			for (local889 = 0; local889 < local883; local889++) {
				local915 = (this.aByteArray84[local889] & 0xFF) + local1058;
				if (local915 < 0) {
					local915 = 0;
				}
				if (local915 > 128) {
					local915 = 128;
				}
				this.aByteArray84[local889] = (byte) local915;
			}
			local915 = 2;
			@Pc(1110) int local1110;
			while (local308.length > local915) {
				local920 = local308[local915];
				local1110 = local308[local915 + 1] << 1;
				local940 = (local920 - local883) * local1058 + (local920 - local883) / 2;
				for (local942 = local883; local942 < local920; local942++) {
					local951 = Static202.method3169(local940, local920 - local883);
					@Pc(1145) int local1145 = local951 + (this.aByteArray84[local942] & 0xFF);
					if (local1145 < 0) {
						local1145 = 0;
					}
					if (local1145 > 128) {
						local1145 = 128;
					}
					this.aByteArray84[local942] = (byte) local1145;
					local940 += local1110 - local1058;
				}
				local915 += 2;
				local1058 = local1110;
				local883 = local920;
			}
			for (local992 = local883; local992 < 128; local992++) {
				local1110 = (this.aByteArray84[local992] & 0xFF) + local1058;
				if (local1110 < 0) {
					local1110 = 0;
				}
				if (local1110 > 128) {
					local1110 = 128;
				}
				this.aByteArray84[local992] = (byte) local1110;
			}
		}
		for (local774 = 0; local774 < local182; local774++) {
			local226[local774].anInt3425 = local34.method2582();
		}
		for (local813 = 0; local813 < local182; local813++) {
			@Pc(1251) Class114 local1251 = local226[local813];
			if (local1251.aByteArray48 != null) {
				local1251.anInt3430 = local34.method2582();
			}
			if (local1251.aByteArray49 != null) {
				local1251.anInt3424 = local34.method2582();
			}
			if (local1251.anInt3425 > 0) {
				local1251.anInt3426 = local34.method2582();
			}
		}
		for (local1058 = 0; local1058 < local182; local1058++) {
			local226[local1058].anInt3428 = local34.method2582();
		}
		for (local889 = 0; local889 < local182; local889++) {
			@Pc(1304) Class114 local1304 = local226[local889];
			if (local1304.anInt3428 > 0) {
				local1304.anInt3429 = local34.method2582();
			}
		}
		for (local915 = 0; local915 < local182; local915++) {
			@Pc(1330) Class114 local1330 = local226[local915];
			if (local1330.anInt3429 > 0) {
				local1330.anInt3423 = local34.method2582();
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public void method5228() {
		this.anIntArray452 = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([B[ILclient!ld;I)Z")
	public boolean method5229(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class140 arg2) {
		@Pc(10) boolean local10 = true;
		@Pc(12) int local12 = 0;
		@Pc(14) Class3_Sub6_Sub1 local14 = null;
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			if (arg0 == null || arg0[local16] != 0) {
				@Pc(28) int local28 = this.anIntArray452[local16];
				if (local28 != 0) {
					if (local28 != local12) {
						local12 = local28--;
						if ((local28 & 0x1) == 0) {
							local14 = arg2.method3352(arg1, local28 >> 2);
						} else {
							local14 = arg2.method3349(local28 >> 2, arg1);
						}
						if (local14 == null) {
							local10 = false;
						}
					}
					if (local14 != null) {
						this.aClass3_Sub6_Sub1Array1[local16] = local14;
						this.anIntArray452[local16] = 0;
					}
				}
			}
		}
		return local10;
	}
}
