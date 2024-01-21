import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "[Lclient!gf;")
	public final Class1_Sub9_Sub1[] aClass1_Sub9_Sub1Array1 = new Class1_Sub9_Sub1[128];

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "[I")
	private int[] anIntArray70 = new int[128];

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "[Lclient!e;")
	public final Class20[] aClass20Array1 = new Class20[128];

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "[S")
	public final short[] aShortArray4 = new short[128];

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "[B")
	public final byte[] aByteArray1 = new byte[128];

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "[B")
	public final byte[] aByteArray2 = new byte[128];

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "[B")
	public final byte[] aByteArray3 = new byte[128];

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	public final int anInt495;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V")
	public Class1_Sub5(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub8 local36 = new Class1_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray12[local38 + local36.anInt1357] != 0; local38++) {
		}
		@Pc(52) byte[] local52 = new byte[local38];
		for (@Pc(54) int local54 = 0; local54 < local38; local54++) {
			local52[local54] = local36.method900();
		}
		local38++;
		local36.anInt1357++;
		@Pc(75) int local75 = 0;
		@Pc(78) int local78 = local36.anInt1357;
		local36.anInt1357 += local38;
		while (local36.aByteArray12[local75 + local36.anInt1357] != 0) {
			local75++;
		}
		@Pc(101) byte[] local101 = new byte[local75];
		for (@Pc(103) int local103 = 0; local103 < local75; local103++) {
			local101[local103] = local36.method900();
		}
		local75++;
		local36.anInt1357++;
		@Pc(125) int local125 = local36.anInt1357;
		@Pc(127) int local127 = 0;
		local36.anInt1357 += local75;
		while (local36.aByteArray12[local127 + local36.anInt1357] != 0) {
			local127++;
		}
		@Pc(150) byte[] local150 = new byte[local127];
		for (@Pc(152) int local152 = 0; local152 < local127; local152++) {
			local150[local152] = local36.method900();
		}
		local36.anInt1357++;
		local127++;
		@Pc(174) byte[] local174 = new byte[local127];
		@Pc(181) int local181;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local127 <= 1) {
			local181 = local127;
		} else {
			local174[1] = 1;
			local181 = 2;
			@Pc(191) int local191 = 1;
			for (local193 = 2; local193 < local127; local193++) {
				local199 = local36.method861();
				if (local199 == 0) {
					local191 = local181++;
				} else {
					if (local199 <= local191) {
						local199--;
					}
					local191 = local199;
				}
				local174[local193] = (byte) local191;
			}
		}
		@Pc(232) Class20[] local232 = new Class20[local181];
		for (local193 = 0; local193 < local232.length; local193++) {
			@Pc(244) Class20 local244 = local232[local193] = new Class20();
			@Pc(248) int local248 = local36.method861();
			if (local248 > 0) {
				local244.aByteArray7 = new byte[local248 * 2];
			}
			local248 = local36.method861();
			if (local248 > 0) {
				local244.aByteArray6 = new byte[local248 * 2 + 2];
				local244.aByteArray6[1] = 64;
			}
		}
		local199 = local36.method861();
		@Pc(303) byte[] local303 = local199 > 0 ? new byte[local199 * 2] : null;
		local199 = local36.method861();
		@Pc(316) byte[] local316 = local199 > 0 ? new byte[local199 * 2] : null;
		@Pc(318) int local318;
		for (local318 = 0; local36.aByteArray12[local318 + local36.anInt1357] != 0; local318++) {
		}
		@Pc(335) byte[] local335 = new byte[local318];
		for (@Pc(337) int local337 = 0; local337 < local318; local337++) {
			local335[local337] = local36.method900();
		}
		@Pc(351) int local351 = 0;
		local318++;
		local36.anInt1357++;
		for (@Pc(360) int local360 = 0; local360 < 128; local360++) {
			local351 += local36.method861();
			this.aShortArray4[local360] = (short) local351;
		}
		local351 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local351 += local36.method861();
			this.aShortArray4[local384] = (short) (this.aShortArray4[local384] + (local351 << 8));
		}
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		@Pc(413) int local413 = 0;
		for (@Pc(415) int local415 = 0; local415 < 128; local415++) {
			if (local409 == 0) {
				if (local411 < local335.length) {
					local409 = local335[local411++];
				} else {
					local409 = -1;
				}
				local413 = local36.method859();
			}
			this.aShortArray4[local415] = (short) (this.aShortArray4[local415] + ((local413 - 1 & 0x2) << 14));
			this.anIntArray70[local415] = local413;
			local409--;
		}
		local409 = 0;
		local411 = 0;
		@Pc(476) int local476 = 0;
		for (@Pc(478) int local478 = 0; local478 < 128; local478++) {
			if (this.anIntArray70[local478] != 0) {
				if (local409 == 0) {
					if (local52.length > local411) {
						local409 = local52[local411++];
					} else {
						local409 = -1;
					}
					local476 = local36.aByteArray12[local78++] - 1;
				}
				this.aByteArray2[local478] = (byte) local476;
				local409--;
			}
		}
		local409 = 0;
		local411 = 0;
		@Pc(532) int local532 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray70[local534] != 0) {
				if (local409 == 0) {
					if (local411 < local101.length) {
						local409 = local101[local411++];
					} else {
						local409 = -1;
					}
					local532 = local36.aByteArray12[local125++] + 16 << 2;
				}
				local409--;
				this.aByteArray1[local534] = (byte) local532;
			}
		}
		local409 = 0;
		local411 = 0;
		@Pc(592) Class20 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray70[local594] != 0) {
				if (local409 == 0) {
					local592 = local232[local174[local411]];
					if (local411 >= local150.length) {
						local409 = -1;
					} else {
						local409 = local150[local411++];
					}
				}
				this.aClass20Array1[local594] = local592;
				local409--;
			}
		}
		local409 = 0;
		local411 = 0;
		@Pc(644) int local644 = 0;
		for (@Pc(646) int local646 = 0; local646 < 128; local646++) {
			if (local409 == 0) {
				if (local335.length > local411) {
					local409 = local335[local411++];
				} else {
					local409 = -1;
				}
				if (this.anIntArray70[local646] > 0) {
					local644 = local36.method861() + 1;
				}
			}
			this.aByteArray3[local646] = (byte) local644;
			local409--;
		}
		this.anInt495 = local36.method861() + 1;
		@Pc(714) int local714;
		for (@Pc(703) int local703 = 0; local703 < local181; local703++) {
			@Pc(709) Class20 local709 = local232[local703];
			if (local709.aByteArray7 != null) {
				for (local714 = 1; local714 < local709.aByteArray7.length; local714 += 2) {
					local709.aByteArray7[local714] = local36.method900();
				}
			}
			if (local709.aByteArray6 != null) {
				for (local714 = 3; local714 < local709.aByteArray6.length - 2; local714 += 2) {
					local709.aByteArray6[local714] = local36.method900();
				}
			}
		}
		@Pc(767) int local767;
		if (local303 != null) {
			for (local767 = 1; local767 < local303.length; local767 += 2) {
				local303[local767] = local36.method900();
			}
		}
		if (local316 != null) {
			for (local767 = 1; local767 < local316.length; local767 += 2) {
				local316[local767] = local36.method900();
			}
		}
		@Pc(816) int local816;
		for (local767 = 0; local767 < local181; local767++) {
			@Pc(809) Class20 local809 = local232[local767];
			if (local809.aByteArray6 != null) {
				local351 = 0;
				for (local816 = 2; local816 < local809.aByteArray6.length; local816 += 2) {
					local351 = local351 + local36.method861() + 1;
					local809.aByteArray6[local816] = (byte) local351;
				}
			}
		}
		@Pc(862) int local862;
		for (local714 = 0; local714 < local181; local714++) {
			@Pc(855) Class20 local855 = local232[local714];
			if (local855.aByteArray7 != null) {
				local351 = 0;
				for (local862 = 2; local862 < local855.aByteArray7.length; local862 += 2) {
					local351 -= -local36.method861() - 1;
					local855.aByteArray7[local862] = (byte) local351;
				}
			}
		}
		@Pc(935) int local935;
		@Pc(958) int local958;
		@Pc(964) byte local964;
		@Pc(985) int local985;
		@Pc(987) int local987;
		@Pc(997) int local997;
		@Pc(933) byte local933;
		@Pc(1037) int local1037;
		if (local303 != null) {
			local351 = local36.method861();
			local303[0] = (byte) local351;
			for (local816 = 2; local816 < local303.length; local816 += 2) {
				local351 = local36.method861() + local351 + 1;
				local303[local816] = (byte) local351;
			}
			@Pc(929) byte local929 = local303[1];
			local933 = local303[0];
			for (local935 = 0; local935 < local933; local935++) {
				this.aByteArray3[local935] = (byte) (local929 * this.aByteArray3[local935] + 32 >> 6);
			}
			local958 = 2;
			while (local303.length > local958) {
				local964 = local303[local958];
				@Pc(970) byte local970 = local303[local958 + 1];
				local958 += 2;
				local985 = (local964 - local933) / 2 + (local964 - local933) * local929;
				for (local987 = local933; local987 < local964; local987++) {
					local997 = Static167.method2886(local985, local964 - local933);
					this.aByteArray3[local987] = (byte) (local997 * this.aByteArray3[local987] + 32 >> 6);
					local985 += local970 - local929;
				}
				local929 = local970;
				local933 = local964;
			}
			for (local1037 = local933; local1037 < 128; local1037++) {
				this.aByteArray3[local1037] = (byte) (local929 * this.aByteArray3[local1037] + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local316 != null) {
			local351 = local36.method861();
			local316[0] = (byte) local351;
			for (local816 = 2; local816 < local316.length; local816 += 2) {
				local351 = local351 + local36.method861() + 1;
				local316[local816] = (byte) local351;
			}
			local933 = local316[0];
			local1105 = local316[1] << 1;
			for (local935 = 0; local935 < local933; local935++) {
				local958 = (this.aByteArray1[local935] & 0xFF) + local1105;
				if (local958 < 0) {
					local958 = 0;
				}
				if (local958 > 128) {
					local958 = 128;
				}
				this.aByteArray1[local935] = (byte) local958;
			}
			local958 = 2;
			@Pc(1159) int local1159;
			while (local958 < local316.length) {
				local964 = local316[local958];
				local1159 = local316[local958 + 1] << 1;
				local958 += 2;
				local985 = (local964 - local933) * local1105 + (local964 - local933) / 2;
				for (local987 = local933; local987 < local964; local987++) {
					local997 = Static167.method2886(local985, local964 - local933);
					local985 += local1159 - local1105;
					@Pc(1202) int local1202 = local997 + (this.aByteArray1[local987] & 0xFF);
					if (local1202 < 0) {
						local1202 = 0;
					}
					if (local1202 > 128) {
						local1202 = 128;
					}
					this.aByteArray1[local987] = (byte) local1202;
				}
				local933 = local964;
				local1105 = local1159;
			}
			for (local1037 = local933; local1037 < 128; local1037++) {
				local1159 = local1105 + (this.aByteArray1[local1037] & 0xFF);
				if (local1159 < 0) {
					local1159 = 0;
				}
				if (local1159 > 128) {
					local1159 = 128;
				}
				this.aByteArray1[local1037] = (byte) local1159;
			}
		}
		for (local816 = 0; local816 < local181; local816++) {
			local232[local816].anInt975 = local36.method861();
		}
		for (local862 = 0; local862 < local181; local862++) {
			@Pc(1301) Class20 local1301 = local232[local862];
			if (local1301.aByteArray7 != null) {
				local1301.anInt977 = local36.method861();
			}
			if (local1301.aByteArray6 != null) {
				local1301.anInt986 = local36.method861();
			}
			if (local1301.anInt975 > 0) {
				local1301.anInt978 = local36.method861();
			}
		}
		for (local1105 = 0; local1105 < local181; local1105++) {
			local232[local1105].anInt981 = local36.method861();
		}
		for (local935 = 0; local935 < local181; local935++) {
			@Pc(1359) Class20 local1359 = local232[local935];
			if (local1359.anInt981 > 0) {
				local1359.anInt980 = local36.method861();
			}
		}
		for (local958 = 0; local958 < local181; local958++) {
			@Pc(1386) Class20 local1386 = local232[local958];
			if (local1386.anInt980 > 0) {
				local1386.anInt983 = local36.method861();
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([BLclient!gd;[IB)Z")
	public boolean method279(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class1_Sub9_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray70[local13];
				if (local28 != 0) {
					if (local28 != local9) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg1.method995(local28 >> 2, arg2);
						} else {
							local11 = arg1.method997(arg2, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass1_Sub9_Sub1Array1[local13] = local11;
						this.anIntArray70[local13] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public void method280() {
		this.anIntArray70 = null;
	}
}
