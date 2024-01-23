import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt1424;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "[S")
	public short[] aShortArray23 = new short[128];

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "[B")
	public byte[] aByteArray18 = new byte[128];

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "[Lclient!om;")
	public Class1_Sub22_Sub1[] aClass1_Sub22_Sub1Array1 = new Class1_Sub22_Sub1[128];

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "[B")
	public byte[] aByteArray19 = new byte[128];

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "[Lclient!dd;")
	public Class33[] aClass33Array1 = new Class33[128];

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "[I")
	private int[] anIntArray171 = new int[128];

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "[B")
	public byte[] aByteArray20 = new byte[128];

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V")
	public Class1_Sub7(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class1_Sub18 local36 = new Class1_Sub18(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray71[local36.anInt3911 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		@Pc(58) int local58;
		for (local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method3082();
		}
		local38++;
		local36.anInt3911++;
		@Pc(79) int local79 = 0;
		local58 = local36.anInt3911;
		local36.anInt3911 += local38;
		while (local36.aByteArray71[local36.anInt3911 + local79] != 0) {
			local79++;
		}
		@Pc(103) byte[] local103 = new byte[local79];
		@Pc(105) int local105;
		for (local105 = 0; local105 < local79; local105++) {
			local103[local105] = local36.method3082();
		}
		local79++;
		local36.anInt3911++;
		@Pc(130) int local130 = 0;
		local105 = local36.anInt3911;
		local36.anInt3911 += local79;
		while (local36.aByteArray71[local130 + local36.anInt3911] != 0) {
			local130++;
		}
		@Pc(153) byte[] local153 = new byte[local130];
		for (@Pc(155) int local155 = 0; local155 < local130; local155++) {
			local153[local155] = local36.method3082();
		}
		local36.anInt3911++;
		local130++;
		@Pc(177) byte[] local177 = new byte[local130];
		@Pc(184) int local184;
		@Pc(192) int local192;
		if (local130 > 1) {
			local184 = 2;
			local177[1] = 1;
			@Pc(190) int local190 = 1;
			for (local192 = 2; local192 < local130; local192++) {
				@Pc(203) int local203 = local36.method3122();
				if (local203 == 0) {
					local190 = local184++;
				} else {
					if (local190 >= local203) {
						local203--;
					}
					local190 = local203;
				}
				local177[local192] = (byte) local190;
			}
		} else {
			local184 = local130;
		}
		@Pc(236) Class33[] local236 = new Class33[local184];
		for (local192 = 0; local192 < local236.length; local192++) {
			@Pc(254) Class33 local254 = local236[local192] = new Class33();
			@Pc(258) int local258 = local36.method3122();
			if (local258 > 0) {
				local254.aByteArray14 = new byte[local258 * 2];
			}
			local258 = local36.method3122();
			if (local258 > 0) {
				local254.aByteArray13 = new byte[local258 * 2 + 2];
				local254.aByteArray13[1] = 64;
			}
		}
		local192 = local36.method3122();
		@Pc(311) byte[] local311 = local192 <= 0 ? null : new byte[local192 * 2];
		local192 = local36.method3122();
		@Pc(317) int local317;
		for (local317 = 0; local36.aByteArray71[local36.anInt3911 + local317] != 0; local317++) {
		}
		@Pc(332) byte[] local332 = new byte[local317];
		@Pc(344) byte[] local344 = local192 > 0 ? new byte[local192 * 2] : null;
		@Pc(346) int local346;
		for (local346 = 0; local346 < local317; local346++) {
			local332[local346] = local36.method3082();
		}
		local317++;
		local36.anInt3911++;
		local346 = 0;
		@Pc(373) int local373;
		for (local373 = 0; local373 < 128; local373++) {
			local346 += local36.method3122();
			this.aShortArray23[local373] = (short) local346;
		}
		local346 = 0;
		for (local373 = 0; local373 < 128; local373++) {
			local346 += local36.method3122();
			this.aShortArray23[local373] = (short) (this.aShortArray23[local373] + (local346 << 8));
		}
		local373 = 0;
		@Pc(424) int local424 = 0;
		@Pc(426) int local426 = 0;
		@Pc(428) int local428;
		for (local428 = 0; local428 < 128; local428++) {
			if (local373 == 0) {
				if (local332.length > local424) {
					local373 = local332[local424++];
				} else {
					local373 = -1;
				}
				local426 = local36.method3059();
			}
			local373--;
			this.aShortArray23[local428] = (short) (this.aShortArray23[local428] + ((local426 - 1 & 0x2) << 14));
			this.anIntArray171[local428] = local426;
		}
		local373 = 0;
		local428 = 0;
		local424 = 0;
		@Pc(482) int local482;
		for (local482 = 0; local482 < 128; local482++) {
			if (this.anIntArray171[local482] != 0) {
				if (local373 == 0) {
					if (local56.length > local424) {
						local373 = local56[local424++];
					} else {
						local373 = -1;
					}
					local428 = local36.aByteArray71[local58++] - 1;
				}
				local373--;
				this.aByteArray19[local482] = (byte) local428;
			}
		}
		local424 = 0;
		local373 = 0;
		local482 = 0;
		for (@Pc(536) int local536 = 0; local536 < 128; local536++) {
			if (this.anIntArray171[local536] != 0) {
				if (local373 == 0) {
					local482 = local36.aByteArray71[local105++] + 16 << 2;
					if (local103.length <= local424) {
						local373 = -1;
					} else {
						local373 = local103[local424++];
					}
				}
				local373--;
				this.aByteArray18[local536] = (byte) local482;
			}
		}
		local373 = 0;
		local424 = 0;
		@Pc(594) Class33 local594 = null;
		@Pc(596) int local596;
		for (local596 = 0; local596 < 128; local596++) {
			if (this.anIntArray171[local596] != 0) {
				if (local373 == 0) {
					local594 = local236[local177[local424]];
					if (local153.length > local424) {
						local373 = local153[local424++];
					} else {
						local373 = -1;
					}
				}
				local373--;
				this.aClass33Array1[local596] = local594;
			}
		}
		local424 = 0;
		local596 = 0;
		local373 = 0;
		@Pc(655) int local655;
		for (local655 = 0; local655 < 128; local655++) {
			if (local373 == 0) {
				if (local424 < local332.length) {
					local373 = local332[local424++];
				} else {
					local373 = -1;
				}
				if (this.anIntArray171[local655] > 0) {
					local596 = local36.method3122() + 1;
				}
			}
			local373--;
			this.aByteArray20[local655] = (byte) local596;
		}
		this.anInt1424 = local36.method3122() + 1;
		@Pc(711) Class33 local711;
		@Pc(718) int local718;
		for (local655 = 0; local655 < local184; local655++) {
			local711 = local236[local655];
			if (local711.aByteArray14 != null) {
				for (local718 = 1; local718 < local711.aByteArray14.length; local718 += 2) {
					local711.aByteArray14[local718] = local36.method3082();
				}
			}
			if (local711.aByteArray13 != null) {
				for (local718 = 3; local718 < local711.aByteArray13.length - 2; local718 += 2) {
					local711.aByteArray13[local718] = local36.method3082();
				}
			}
		}
		if (local311 != null) {
			for (local655 = 1; local655 < local311.length; local655 += 2) {
				local311[local655] = local36.method3082();
			}
		}
		if (local344 != null) {
			for (local655 = 1; local655 < local344.length; local655 += 2) {
				local344[local655] = local36.method3082();
			}
		}
		for (local655 = 0; local655 < local184; local655++) {
			local711 = local236[local655];
			if (local711.aByteArray13 != null) {
				local346 = 0;
				for (local718 = 2; local718 < local711.aByteArray13.length; local718 += 2) {
					local346 = local36.method3122() + local346 + 1;
					local711.aByteArray13[local718] = (byte) local346;
				}
			}
		}
		for (local655 = 0; local655 < local184; local655++) {
			local711 = local236[local655];
			if (local711.aByteArray14 != null) {
				local346 = 0;
				for (local718 = 2; local718 < local711.aByteArray14.length; local718 += 2) {
					local346 = local346 + local36.method3122() + 1;
					local711.aByteArray14[local718] = (byte) local346;
				}
			}
		}
		@Pc(971) byte local971;
		@Pc(991) int local991;
		@Pc(993) int local993;
		@Pc(1008) int local1008;
		@Pc(1043) int local1043;
		@Pc(934) byte local934;
		if (local311 != null) {
			local346 = local36.method3122();
			local311[0] = (byte) local346;
			for (local655 = 2; local655 < local311.length; local655 += 2) {
				local346 = local346 + local36.method3122() + 1;
				local311[local655] = (byte) local346;
			}
			@Pc(930) byte local930 = local311[1];
			local934 = local311[0];
			for (local718 = 0; local718 < local934; local718++) {
				this.aByteArray20[local718] = (byte) (this.aByteArray20[local718] * local930 + 32 >> 6);
			}
			local718 = 2;
			while (local311.length > local718) {
				local971 = local311[local718];
				@Pc(977) byte local977 = local311[local718 + 1];
				local718 += 2;
				local991 = (local971 - local934) / 2 + local930 * (local971 - local934);
				for (local993 = local934; local993 < local971; local993++) {
					local1008 = Static20.method356(local991, local971 - local934);
					this.aByteArray20[local993] = (byte) (local1008 * this.aByteArray20[local993] + 32 >> 6);
					local991 += local977 - local930;
				}
				local934 = local971;
				local930 = local977;
			}
			for (local1043 = local934; local1043 < 128; local1043++) {
				this.aByteArray20[local1043] = (byte) (this.aByteArray20[local1043] * local930 + 32 >> 6);
			}
		}
		if (local344 != null) {
			local346 = local36.method3122();
			local344[0] = (byte) local346;
			for (local655 = 2; local655 < local344.length; local655 += 2) {
				local346 = local36.method3122() + local346 + 1;
				local344[local655] = (byte) local346;
			}
			local934 = local344[0];
			@Pc(1113) int local1113 = local344[1] << 1;
			for (local718 = 0; local718 < local934; local718++) {
				local1043 = (this.aByteArray18[local718] & 0xFF) + local1113;
				if (local1043 < 0) {
					local1043 = 0;
				}
				if (local1043 > 128) {
					local1043 = 128;
				}
				this.aByteArray18[local718] = (byte) local1043;
			}
			local718 = 2;
			@Pc(1172) int local1172;
			while (local344.length > local718) {
				local971 = local344[local718];
				local1172 = local344[local718 + 1] << 1;
				local718 += 2;
				local991 = local1113 * (local971 - local934) + (local971 - local934) / 2;
				for (local993 = local934; local993 < local971; local993++) {
					local1008 = Static20.method356(local991, local971 - local934);
					local991 += local1172 - local1113;
					@Pc(1216) int local1216 = (this.aByteArray18[local993] & 0xFF) + local1008;
					if (local1216 < 0) {
						local1216 = 0;
					}
					if (local1216 > 128) {
						local1216 = 128;
					}
					this.aByteArray18[local993] = (byte) local1216;
				}
				local934 = local971;
				local1113 = local1172;
			}
			for (local1043 = local934; local1043 < 128; local1043++) {
				local1172 = local1113 + (this.aByteArray18[local1043] & 0xFF);
				if (local1172 < 0) {
					local1172 = 0;
				}
				if (local1172 > 128) {
					local1172 = 128;
				}
				this.aByteArray18[local1043] = (byte) local1172;
			}
		}
		for (local655 = 0; local655 < local184; local655++) {
			local236[local655].anInt1073 = local36.method3122();
		}
		for (local655 = 0; local655 < local184; local655++) {
			local711 = local236[local655];
			if (local711.aByteArray14 != null) {
				local711.anInt1072 = local36.method3122();
			}
			if (local711.aByteArray13 != null) {
				local711.anInt1074 = local36.method3122();
			}
			if (local711.anInt1073 > 0) {
				local711.anInt1070 = local36.method3122();
			}
		}
		for (local655 = 0; local655 < local184; local655++) {
			local236[local655].anInt1069 = local36.method3122();
		}
		for (local655 = 0; local655 < local184; local655++) {
			local711 = local236[local655];
			if (local711.anInt1069 > 0) {
				local711.anInt1068 = local36.method3122();
			}
		}
		for (local655 = 0; local655 < local184; local655++) {
			local711 = local236[local655];
			if (local711.anInt1068 > 0) {
				local711.anInt1076 = local36.method3122();
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
	public void method1181() {
		this.anIntArray171 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ea;I[B[I)Z")
	public boolean method1182(@OriginalArg(0) Class42 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class1_Sub22_Sub1 local9 = null;
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(37) int local37 = this.anIntArray171[local13];
				if (local37 != 0) {
					if (local37 != local11) {
						local11 = local37--;
						if ((local37 & 0x1) == 0) {
							local9 = arg0.method1034(arg2, local37 >> 2);
						} else {
							local9 = arg0.method1031(local37 >> 2, arg2);
						}
						if (local9 == null) {
							local7 = false;
						}
					}
					if (local9 != null) {
						this.aClass1_Sub22_Sub1Array1[local13] = local9;
						this.anIntArray171[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
