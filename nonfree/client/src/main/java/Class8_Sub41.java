import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class8_Sub41 extends Class8 {

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "[Lclient!cba;")
	public Class8_Sub9_Sub1[] aClass8_Sub9_Sub1Array1;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	public int anInt8298;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "[Lclient!pm;")
	public Class260[] aClass260Array1;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	private Class8_Sub41() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class8_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray72 = new byte[128];
		this.anIntArray444 = new int[128];
		this.aClass8_Sub9_Sub1Array1 = new Class8_Sub9_Sub1[128];
		this.aByteArray74 = new byte[128];
		this.aByteArray73 = new byte[128];
		this.aClass260Array1 = new Class260[128];
		this.aShortArray102 = new short[128];
		@Pc(36) Class8_Sub8 local36 = new Class8_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray107[local38 + local36.anInt10588] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method8550();
		}
		local38++;
		local36.anInt10588++;
		@Pc(79) int local79 = local36.anInt10588;
		local36.anInt10588 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray107[local36.anInt10588 + local87] != 0; local87++) {
		}
		@Pc(102) byte[] local102 = new byte[local87];
		for (@Pc(104) int local104 = 0; local104 < local87; local104++) {
			local102[local104] = local36.method8550();
		}
		local36.anInt10588++;
		local87++;
		@Pc(130) int local130 = local36.anInt10588;
		local36.anInt10588 += local87;
		@Pc(138) int local138;
		for (local138 = 0; local36.aByteArray107[local138 + local36.anInt10588] != 0; local138++) {
		}
		@Pc(155) byte[] local155 = new byte[local138];
		for (@Pc(157) int local157 = 0; local157 < local138; local157++) {
			local155[local157] = local36.method8550();
		}
		local36.anInt10588++;
		local138++;
		@Pc(183) byte[] local183 = new byte[local138];
		@Pc(188) int local188;
		@Pc(200) int local200;
		@Pc(206) int local206;
		if (local138 <= 1) {
			local188 = local138;
		} else {
			local183[1] = 1;
			local188 = 2;
			@Pc(198) int local198 = 1;
			for (local200 = 2; local200 < local138; local200++) {
				local206 = local36.method8525();
				if (local206 == 0) {
					local198 = local188++;
				} else {
					if (local206 <= local198) {
						local206--;
					}
					local198 = local206;
				}
				local183[local200] = (byte) local198;
			}
		}
		@Pc(238) Class260[] local238 = new Class260[local188];
		for (local200 = 0; local200 < local238.length; local200++) {
			@Pc(250) Class260 local250 = local238[local200] = new Class260();
			@Pc(254) int local254 = local36.method8525();
			if (local254 > 0) {
				local250.aByteArray70 = new byte[local254 * 2];
			}
			local254 = local36.method8525();
			if (local254 > 0) {
				local250.aByteArray71 = new byte[local254 * 2 + 2];
				local250.aByteArray71[1] = 64;
			}
		}
		local206 = local36.method8525();
		@Pc(312) byte[] local312 = local206 <= 0 ? null : new byte[local206 * 2];
		local206 = local36.method8525();
		@Pc(328) byte[] local328 = local206 <= 0 ? null : new byte[local206 * 2];
		@Pc(330) int local330;
		for (local330 = 0; local36.aByteArray107[local36.anInt10588 + local330] != 0; local330++) {
		}
		@Pc(348) byte[] local348 = new byte[local330];
		for (@Pc(350) int local350 = 0; local350 < local330; local350++) {
			local348[local350] = local36.method8550();
		}
		local36.anInt10588++;
		local330++;
		@Pc(375) int local375 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local375 += local36.method8525();
			this.aShortArray102[local377] = (short) local375;
		}
		local375 = 0;
		for (@Pc(399) int local399 = 0; local399 < 128; local399++) {
			local375 += local36.method8525();
			this.aShortArray102[local399] = (short) (this.aShortArray102[local399] + (local375 << 8));
		}
		@Pc(424) int local424 = 0;
		@Pc(426) int local426 = 0;
		@Pc(428) int local428 = 0;
		for (@Pc(430) int local430 = 0; local430 < 128; local430++) {
			if (local424 == 0) {
				if (local348.length > local426) {
					local424 = local348[local426++];
				} else {
					local424 = -1;
				}
				local428 = local36.method8580();
			}
			this.aShortArray102[local430] = (short) (this.aShortArray102[local430] + ((local428 - 1 & 0x2) << 14));
			this.anIntArray444[local430] = local428;
			local424--;
		}
		local426 = 0;
		local424 = 0;
		@Pc(484) int local484 = 0;
		for (@Pc(486) int local486 = 0; local486 < 128; local486++) {
			if (this.anIntArray444[local486] != 0) {
				if (local424 == 0) {
					local484 = local36.aByteArray107[local79++] - 1;
					if (local426 < local55.length) {
						local424 = local55[local426++];
					} else {
						local424 = -1;
					}
				}
				this.aByteArray73[local486] = (byte) local484;
				local424--;
			}
		}
		local424 = 0;
		local426 = 0;
		@Pc(539) int local539 = 0;
		for (@Pc(541) int local541 = 0; local541 < 128; local541++) {
			if (this.anIntArray444[local541] != 0) {
				if (local424 == 0) {
					local539 = local36.aByteArray107[local130++] + 16 << 2;
					if (local426 < local102.length) {
						local424 = local102[local426++];
					} else {
						local424 = -1;
					}
				}
				this.aByteArray74[local541] = (byte) local539;
				local424--;
			}
		}
		local426 = 0;
		local424 = 0;
		@Pc(598) Class260 local598 = null;
		for (@Pc(600) int local600 = 0; local600 < 128; local600++) {
			if (this.anIntArray444[local600] != 0) {
				if (local424 == 0) {
					local598 = local238[local183[local426]];
					if (local155.length <= local426) {
						local424 = -1;
					} else {
						local424 = local155[local426++];
					}
				}
				local424--;
				this.aClass260Array1[local600] = local598;
			}
		}
		local426 = 0;
		local424 = 0;
		@Pc(648) int local648 = 0;
		for (@Pc(650) int local650 = 0; local650 < 128; local650++) {
			if (local424 == 0) {
				if (local348.length > local426) {
					local424 = local348[local426++];
				} else {
					local424 = -1;
				}
				if (this.anIntArray444[local650] > 0) {
					local648 = local36.method8525() + 1;
				}
			}
			local424--;
			this.aByteArray72[local650] = (byte) local648;
		}
		this.anInt8298 = local36.method8525() + 1;
		@Pc(713) int local713;
		for (@Pc(702) int local702 = 0; local702 < local188; local702++) {
			@Pc(708) Class260 local708 = local238[local702];
			if (local708.aByteArray70 != null) {
				for (local713 = 1; local713 < local708.aByteArray70.length; local713 += 2) {
					local708.aByteArray70[local713] = local36.method8550();
				}
			}
			if (local708.aByteArray71 != null) {
				for (local713 = 3; local713 < local708.aByteArray71.length - 2; local713 += 2) {
					local708.aByteArray71[local713] = local36.method8550();
				}
			}
		}
		@Pc(762) int local762;
		if (local312 != null) {
			for (local762 = 1; local762 < local312.length; local762 += 2) {
				local312[local762] = local36.method8550();
			}
		}
		if (local328 != null) {
			for (local762 = 1; local762 < local328.length; local762 += 2) {
				local328[local762] = local36.method8550();
			}
		}
		@Pc(811) int local811;
		for (local762 = 0; local762 < local188; local762++) {
			@Pc(804) Class260 local804 = local238[local762];
			if (local804.aByteArray71 != null) {
				local375 = 0;
				for (local811 = 2; local811 < local804.aByteArray71.length; local811 += 2) {
					local375 = local375 + local36.method8525() + 1;
					local804.aByteArray71[local811] = (byte) local375;
				}
			}
		}
		@Pc(853) int local853;
		for (local713 = 0; local713 < local188; local713++) {
			@Pc(846) Class260 local846 = local238[local713];
			if (local846.aByteArray70 != null) {
				local375 = 0;
				for (local853 = 2; local853 < local846.aByteArray70.length; local853 += 2) {
					local375 = local375 + local36.method8525() + 1;
					local846.aByteArray70[local853] = (byte) local375;
				}
			}
		}
		@Pc(932) int local932;
		@Pc(959) int local959;
		@Pc(965) byte local965;
		@Pc(985) int local985;
		@Pc(987) int local987;
		@Pc(997) int local997;
		@Pc(926) byte local926;
		@Pc(1038) int local1038;
		if (local312 != null) {
			local375 = local36.method8525();
			local312[0] = (byte) local375;
			for (local811 = 2; local811 < local312.length; local811 += 2) {
				local375 = local375 + local36.method8525() + 1;
				local312[local811] = (byte) local375;
			}
			local926 = local312[0];
			@Pc(930) byte local930 = local312[1];
			for (local932 = 0; local932 < local926; local932++) {
				this.aByteArray72[local932] = (byte) (this.aByteArray72[local932] * local930 + 32 >> 6);
			}
			local959 = 2;
			while (local312.length > local959) {
				local965 = local312[local959];
				@Pc(971) byte local971 = local312[local959 + 1];
				local985 = (local965 - local926) / 2 + (local965 - local926) * local930;
				for (local987 = local926; local987 < local965; local987++) {
					local997 = Static233.method4305(local985, local965 - local926);
					this.aByteArray72[local987] = (byte) (local997 * this.aByteArray72[local987] + 32 >> 6);
					local985 += local971 - local930;
				}
				local926 = local965;
				local959 += 2;
				local930 = local971;
			}
			for (local1038 = local926; local1038 < 128; local1038++) {
				this.aByteArray72[local1038] = (byte) (this.aByteArray72[local1038] * local930 + 32 >> 6);
			}
		}
		@Pc(1111) int local1111;
		if (local328 != null) {
			local375 = local36.method8525();
			local328[0] = (byte) local375;
			for (local811 = 2; local811 < local328.length; local811 += 2) {
				local375 = local375 + local36.method8525() + 1;
				local328[local811] = (byte) local375;
			}
			local926 = local328[0];
			local1111 = local328[1] << 1;
			for (local932 = 0; local932 < local926; local932++) {
				local959 = local1111 + (this.aByteArray74[local932] & 0xFF);
				if (local959 < 0) {
					local959 = 0;
				}
				if (local959 > 128) {
					local959 = 128;
				}
				this.aByteArray74[local932] = (byte) local959;
			}
			local959 = 2;
			@Pc(1159) int local1159;
			while (local959 < local328.length) {
				local965 = local328[local959];
				local1159 = local328[local959 + 1] << 1;
				local985 = local1111 * (local965 - local926) + (local965 - local926) / 2;
				for (local987 = local926; local987 < local965; local987++) {
					local997 = Static233.method4305(local985, local965 - local926);
					@Pc(1193) int local1193 = local997 + (this.aByteArray74[local987] & 0xFF);
					if (local1193 < 0) {
						local1193 = 0;
					}
					if (local1193 > 128) {
						local1193 = 128;
					}
					local985 += local1159 - local1111;
					this.aByteArray74[local987] = (byte) local1193;
				}
				local959 += 2;
				local1111 = local1159;
				local926 = local965;
			}
			for (local1038 = local926; local1038 < 128; local1038++) {
				local1159 = local1111 + (this.aByteArray74[local1038] & 0xFF);
				if (local1159 < 0) {
					local1159 = 0;
				}
				if (local1159 > 128) {
					local1159 = 128;
				}
				this.aByteArray74[local1038] = (byte) local1159;
			}
		}
		for (local811 = 0; local811 < local188; local811++) {
			local238[local811].anInt8171 = local36.method8525();
		}
		for (local853 = 0; local853 < local188; local853++) {
			@Pc(1288) Class260 local1288 = local238[local853];
			if (local1288.aByteArray70 != null) {
				local1288.anInt8169 = local36.method8525();
			}
			if (local1288.aByteArray71 != null) {
				local1288.anInt8164 = local36.method8525();
			}
			if (local1288.anInt8171 > 0) {
				local1288.anInt8167 = local36.method8525();
			}
		}
		for (local1111 = 0; local1111 < local188; local1111++) {
			local238[local1111].anInt8163 = local36.method8525();
		}
		for (local932 = 0; local932 < local188; local932++) {
			@Pc(1350) Class260 local1350 = local238[local932];
			if (local1350.anInt8163 > 0) {
				local1350.anInt8165 = local36.method8525();
			}
		}
		for (local959 = 0; local959 < local188; local959++) {
			@Pc(1374) Class260 local1374 = local238[local959];
			if (local1374.anInt8165 > 0) {
				local1374.anInt8166 = local36.method8525();
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public void method6857() {
		this.anIntArray444 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[ILclient!vi;[B)Z")
	public boolean method6858(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class8_Sub9_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg2 == null || arg2[local13] != 0) {
				@Pc(25) int local25 = this.anIntArray444[local13];
				if (local25 != 0) {
					if (local25 != local9) {
						local9 = local25--;
						if ((local25 & 0x1) == 0) {
							local11 = arg1.method8274(local25 >> 2, arg0);
						} else {
							local11 = arg1.method8276(arg0, local25 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass8_Sub9_Sub1Array1[local13] = local11;
						this.anIntArray444[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
