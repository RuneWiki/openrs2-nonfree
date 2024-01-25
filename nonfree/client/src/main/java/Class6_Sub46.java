import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class6_Sub46 extends Class6 {

	@OriginalMember(owner = "client!u", name = "m", descriptor = "[Lclient!wb;")
	public Class6_Sub12_Sub1[] aClass6_Sub12_Sub1Array1;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
	private int[] anIntArray788;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "[B")
	public byte[] aByteArray112;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "[S")
	public short[] aShortArray157;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "[B")
	public byte[] aByteArray113;

	@OriginalMember(owner = "client!u", name = "x", descriptor = "[Lclient!nr;")
	public Class229[] aClass229Array1;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "[B")
	public byte[] aByteArray114;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	public int anInt8949;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	private Class6_Sub46() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
	public Class6_Sub46(@OriginalArg(0) byte[] arg0) {
		this.aByteArray114 = new byte[128];
		this.aByteArray112 = new byte[128];
		this.aClass6_Sub12_Sub1Array1 = new Class6_Sub12_Sub1[128];
		this.anIntArray788 = new int[128];
		this.aShortArray157 = new short[128];
		this.aClass229Array1 = new Class229[128];
		this.aByteArray113 = new byte[128];
		@Pc(36) Class6_Sub26 local36 = new Class6_Sub26(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray65[local36.anInt5769 + local38] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method4972();
		}
		local38++;
		local36.anInt5769++;
		@Pc(76) int local76 = local36.anInt5769;
		local36.anInt5769 += local38;
		@Pc(84) int local84;
		for (local84 = 0; local36.aByteArray65[local84 + local36.anInt5769] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local36.method4972();
		}
		local84++;
		local36.anInt5769++;
		@Pc(126) int local126 = local36.anInt5769;
		local36.anInt5769 += local84;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray65[local134 + local36.anInt5769] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method4972();
		}
		local36.anInt5769++;
		local134++;
		@Pc(172) byte[] local172 = new byte[local134];
		@Pc(183) int local183;
		@Pc(187) int local187;
		@Pc(193) int local193;
		if (local134 > 1) {
			local172[1] = 1;
			local183 = 2;
			@Pc(185) int local185 = 1;
			for (local187 = 2; local187 < local134; local187++) {
				local193 = local36.method4966();
				if (local193 == 0) {
					local185 = local183++;
				} else {
					if (local193 <= local185) {
						local193--;
					}
					local185 = local193;
				}
				local172[local187] = (byte) local185;
			}
		} else {
			local183 = local134;
		}
		@Pc(229) Class229[] local229 = new Class229[local183];
		for (local187 = 0; local187 < local229.length; local187++) {
			@Pc(241) Class229 local241 = local229[local187] = new Class229();
			@Pc(245) int local245 = local36.method4966();
			if (local245 > 0) {
				local241.aByteArray76 = new byte[local245 * 2];
			}
			local245 = local36.method4966();
			if (local245 > 0) {
				local241.aByteArray75 = new byte[local245 * 2 + 2];
				local241.aByteArray75[1] = 64;
			}
		}
		local193 = local36.method4966();
		@Pc(303) byte[] local303 = local193 > 0 ? new byte[local193 * 2] : null;
		local193 = local36.method4966();
		@Pc(319) byte[] local319 = local193 <= 0 ? null : new byte[local193 * 2];
		@Pc(321) int local321;
		for (local321 = 0; local36.aByteArray65[local36.anInt5769 + local321] != 0; local321++) {
		}
		@Pc(335) byte[] local335 = new byte[local321];
		for (@Pc(337) int local337 = 0; local337 < local321; local337++) {
			local335[local337] = local36.method4972();
		}
		local36.anInt5769++;
		local321++;
		@Pc(362) int local362 = 0;
		for (@Pc(364) int local364 = 0; local364 < 128; local364++) {
			local362 += local36.method4966();
			this.aShortArray157[local364] = (short) local362;
		}
		local362 = 0;
		for (@Pc(386) int local386 = 0; local386 < 128; local386++) {
			local362 += local36.method4966();
			this.aShortArray157[local386] = (short) (this.aShortArray157[local386] + (local362 << 8));
		}
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		@Pc(415) int local415 = 0;
		for (@Pc(417) int local417 = 0; local417 < 128; local417++) {
			if (local411 == 0) {
				if (local335.length > local413) {
					local411 = local335[local413++];
				} else {
					local411 = -1;
				}
				local415 = local36.method4981();
			}
			this.aShortArray157[local417] = (short) (this.aShortArray157[local417] + ((local415 - 1 & 0x2) << 14));
			this.anIntArray788[local417] = local415;
			local411--;
		}
		local411 = 0;
		local413 = 0;
		@Pc(475) int local475 = 0;
		for (@Pc(477) int local477 = 0; local477 < 128; local477++) {
			if (this.anIntArray788[local477] != 0) {
				if (local411 == 0) {
					local475 = local36.aByteArray65[local76++] - 1;
					if (local413 >= local52.length) {
						local411 = -1;
					} else {
						local411 = local52[local413++];
					}
				}
				this.aByteArray114[local477] = (byte) local475;
				local411--;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(532) int local532 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray788[local534] != 0) {
				if (local411 == 0) {
					if (local98.length <= local413) {
						local411 = -1;
					} else {
						local411 = local98[local413++];
					}
					local532 = local36.aByteArray65[local126++] + 16 << 2;
				}
				this.aByteArray112[local534] = (byte) local532;
				local411--;
			}
		}
		local413 = 0;
		local411 = 0;
		@Pc(592) Class229 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray788[local594] != 0) {
				if (local411 == 0) {
					local592 = local229[local172[local413]];
					if (local413 >= local148.length) {
						local411 = -1;
					} else {
						local411 = local148[local413++];
					}
				}
				this.aClass229Array1[local594] = local592;
				local411--;
			}
		}
		local411 = 0;
		local413 = 0;
		@Pc(645) int local645 = 0;
		for (@Pc(647) int local647 = 0; local647 < 128; local647++) {
			if (local411 == 0) {
				if (local413 < local335.length) {
					local411 = local335[local413++];
				} else {
					local411 = -1;
				}
				if (this.anIntArray788[local647] > 0) {
					local645 = local36.method4966() + 1;
				}
			}
			local411--;
			this.aByteArray113[local647] = (byte) local645;
		}
		this.anInt8949 = local36.method4966() + 1;
		@Pc(708) int local708;
		for (@Pc(697) int local697 = 0; local697 < local183; local697++) {
			@Pc(703) Class229 local703 = local229[local697];
			if (local703.aByteArray76 != null) {
				for (local708 = 1; local708 < local703.aByteArray76.length; local708 += 2) {
					local703.aByteArray76[local708] = local36.method4972();
				}
			}
			if (local703.aByteArray75 != null) {
				for (local708 = 3; local708 < local703.aByteArray75.length - 2; local708 += 2) {
					local703.aByteArray75[local708] = local36.method4972();
				}
			}
		}
		@Pc(761) int local761;
		if (local303 != null) {
			for (local761 = 1; local761 < local303.length; local761 += 2) {
				local303[local761] = local36.method4972();
			}
		}
		if (local319 != null) {
			for (local761 = 1; local761 < local319.length; local761 += 2) {
				local319[local761] = local36.method4972();
			}
		}
		@Pc(806) int local806;
		for (local761 = 0; local761 < local183; local761++) {
			@Pc(799) Class229 local799 = local229[local761];
			if (local799.aByteArray75 != null) {
				local362 = 0;
				for (local806 = 2; local806 < local799.aByteArray75.length; local806 += 2) {
					local362 = local36.method4966() + local362 + 1;
					local799.aByteArray75[local806] = (byte) local362;
				}
			}
		}
		@Pc(855) int local855;
		for (local708 = 0; local708 < local183; local708++) {
			@Pc(848) Class229 local848 = local229[local708];
			if (local848.aByteArray76 != null) {
				local362 = 0;
				for (local855 = 2; local855 < local848.aByteArray76.length; local855 += 2) {
					local362 = local362 + local36.method4966() + 1;
					local848.aByteArray76[local855] = (byte) local362;
				}
			}
		}
		@Pc(928) int local928;
		@Pc(955) int local955;
		@Pc(961) byte local961;
		@Pc(981) int local981;
		@Pc(983) int local983;
		@Pc(993) int local993;
		@Pc(922) byte local922;
		@Pc(1034) int local1034;
		if (local303 != null) {
			local362 = local36.method4966();
			local303[0] = (byte) local362;
			for (local806 = 2; local806 < local303.length; local806 += 2) {
				local362 += local36.method4966() + 1;
				local303[local806] = (byte) local362;
			}
			local922 = local303[0];
			@Pc(926) byte local926 = local303[1];
			for (local928 = 0; local928 < local922; local928++) {
				this.aByteArray113[local928] = (byte) (this.aByteArray113[local928] * local926 + 32 >> 6);
			}
			local955 = 2;
			while (local303.length > local955) {
				local961 = local303[local955];
				@Pc(967) byte local967 = local303[local955 + 1];
				local981 = (local961 - local922) / 2 + (local961 - local922) * local926;
				for (local983 = local922; local983 < local961; local983++) {
					local993 = Static538.method7767(local961 - local922, local981);
					local981 += local967 - local926;
					this.aByteArray113[local983] = (byte) (this.aByteArray113[local983] * local993 + 32 >> 6);
				}
				local955 += 2;
				local926 = local967;
				local922 = local961;
			}
			for (local1034 = local922; local1034 < 128; local1034++) {
				this.aByteArray113[local1034] = (byte) (local926 * this.aByteArray113[local1034] + 32 >> 6);
			}
		}
		@Pc(1104) int local1104;
		if (local319 != null) {
			local362 = local36.method4966();
			local319[0] = (byte) local362;
			for (local806 = 2; local806 < local319.length; local806 += 2) {
				local362 -= -local36.method4966() - 1;
				local319[local806] = (byte) local362;
			}
			local922 = local319[0];
			local1104 = local319[1] << 1;
			for (local928 = 0; local928 < local922; local928++) {
				local955 = (this.aByteArray112[local928] & 0xFF) + local1104;
				if (local955 < 0) {
					local955 = 0;
				}
				if (local955 > 128) {
					local955 = 128;
				}
				this.aByteArray112[local928] = (byte) local955;
			}
			local955 = 2;
			@Pc(1152) int local1152;
			while (local319.length > local955) {
				local961 = local319[local955];
				local1152 = local319[local955 + 1] << 1;
				local981 = local1104 * (local961 - local922) + (local961 - local922) / 2;
				for (local983 = local922; local983 < local961; local983++) {
					local993 = Static538.method7767(local961 - local922, local981);
					@Pc(1187) int local1187 = (this.aByteArray112[local983] & 0xFF) + local993;
					if (local1187 < 0) {
						local1187 = 0;
					}
					if (local1187 > 128) {
						local1187 = 128;
					}
					this.aByteArray112[local983] = (byte) local1187;
					local981 += local1152 - local1104;
				}
				local922 = local961;
				local955 += 2;
				local1104 = local1152;
			}
			for (local1034 = local922; local1034 < 128; local1034++) {
				local1152 = local1104 + (this.aByteArray112[local1034] & 0xFF);
				if (local1152 < 0) {
					local1152 = 0;
				}
				if (local1152 > 128) {
					local1152 = 128;
				}
				this.aByteArray112[local1034] = (byte) local1152;
			}
		}
		for (local806 = 0; local806 < local183; local806++) {
			local229[local806].anInt6819 = local36.method4966();
		}
		for (local855 = 0; local855 < local183; local855++) {
			@Pc(1288) Class229 local1288 = local229[local855];
			if (local1288.aByteArray76 != null) {
				local1288.anInt6818 = local36.method4966();
			}
			if (local1288.aByteArray75 != null) {
				local1288.anInt6823 = local36.method4966();
			}
			if (local1288.anInt6819 > 0) {
				local1288.anInt6820 = local36.method4966();
			}
		}
		for (local1104 = 0; local1104 < local183; local1104++) {
			local229[local1104].anInt6824 = local36.method4966();
		}
		for (local928 = 0; local928 < local183; local928++) {
			@Pc(1343) Class229 local1343 = local229[local928];
			if (local1343.anInt6824 > 0) {
				local1343.anInt6822 = local36.method4966();
			}
		}
		for (local955 = 0; local955 < local183; local955++) {
			@Pc(1363) Class229 local1363 = local229[local955];
			if (local1363.anInt6822 > 0) {
				local1363.anInt6821 = local36.method4966();
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public void method7504() {
		this.anIntArray788 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z[I[BLclient!rda;)Z")
	public boolean method7508(@OriginalArg(1) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class276 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub12_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(33) int local33 = this.anIntArray788[local13];
				if (local33 != 0) {
					if (local9 != local33) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg2.method6669(local33 >> 2, arg0);
						} else {
							local11 = arg2.method6667(arg0, local33 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub12_Sub1Array1[local13] = local11;
						this.anIntArray788[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
