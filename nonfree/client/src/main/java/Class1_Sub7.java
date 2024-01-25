import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!br", name = "n", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	public int anInt592;

	@OriginalMember(owner = "client!br", name = "r", descriptor = "[Lclient!rn;")
	public Class221[] aClass221Array1;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!br", name = "C", descriptor = "[Lclient!cj;")
	public Class1_Sub8_Sub1[] aClass1_Sub8_Sub1Array1;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	private Class1_Sub7() {
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "([B)V")
	public Class1_Sub7(@OriginalArg(0) byte[] arg0) {
		this.aClass221Array1 = new Class221[128];
		this.aByteArray9 = new byte[128];
		this.anIntArray69 = new int[128];
		this.aByteArray7 = new byte[128];
		this.aShortArray11 = new short[128];
		this.aClass1_Sub8_Sub1Array1 = new Class1_Sub8_Sub1[128];
		this.aByteArray8 = new byte[128];
		@Pc(36) Class1_Sub19 local36 = new Class1_Sub19(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray38[local38 + local36.anInt3698] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method2917();
		}
		local38++;
		local36.anInt3698++;
		@Pc(83) int local83 = local36.anInt3698;
		local36.anInt3698 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray38[local91 + local36.anInt3698] != 0; local91++) {
		}
		@Pc(108) byte[] local108 = new byte[local91];
		for (@Pc(110) int local110 = 0; local110 < local91; local110++) {
			local108[local110] = local36.method2917();
		}
		local36.anInt3698++;
		local91++;
		@Pc(132) int local132 = local36.anInt3698;
		local36.anInt3698 += local91;
		@Pc(140) int local140;
		for (local140 = 0; local36.aByteArray38[local140 + local36.anInt3698] != 0; local140++) {
		}
		@Pc(157) byte[] local157 = new byte[local140];
		for (@Pc(159) int local159 = 0; local159 < local140; local159++) {
			local157[local159] = local36.method2917();
		}
		local140++;
		local36.anInt3698++;
		@Pc(185) byte[] local185 = new byte[local140];
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(206) int local206;
		if (local140 > 1) {
			local185[1] = 1;
			@Pc(196) int local196 = 1;
			local198 = 2;
			for (local200 = 2; local200 < local140; local200++) {
				local206 = local36.method2915();
				if (local206 == 0) {
					local196 = local198++;
				} else {
					if (local196 >= local206) {
						local206--;
					}
					local196 = local206;
				}
				local185[local200] = (byte) local196;
			}
		} else {
			local198 = local140;
		}
		@Pc(242) Class221[] local242 = new Class221[local198];
		for (local200 = 0; local200 < local242.length; local200++) {
			@Pc(254) Class221 local254 = local242[local200] = new Class221();
			@Pc(258) int local258 = local36.method2915();
			if (local258 > 0) {
				local254.aByteArray82 = new byte[local258 * 2];
			}
			local258 = local36.method2915();
			if (local258 > 0) {
				local254.aByteArray83 = new byte[local258 * 2 + 2];
				local254.aByteArray83[1] = 64;
			}
		}
		local206 = local36.method2915();
		@Pc(309) byte[] local309 = local206 > 0 ? new byte[local206 * 2] : null;
		local206 = local36.method2915();
		@Pc(325) byte[] local325 = local206 <= 0 ? null : new byte[local206 * 2];
		@Pc(327) int local327;
		for (local327 = 0; local36.aByteArray38[local327 + local36.anInt3698] != 0; local327++) {
		}
		@Pc(341) byte[] local341 = new byte[local327];
		for (@Pc(343) int local343 = 0; local343 < local327; local343++) {
			local341[local343] = local36.method2917();
		}
		local327++;
		local36.anInt3698++;
		@Pc(364) int local364 = 0;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local364 += local36.method2915();
			this.aShortArray11[local366] = (short) local364;
		}
		local364 = 0;
		for (@Pc(390) int local390 = 0; local390 < 128; local390++) {
			local364 += local36.method2915();
			this.aShortArray11[local390] = (short) (this.aShortArray11[local390] + (local364 << 8));
		}
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		for (@Pc(423) int local423 = 0; local423 < 128; local423++) {
			if (local417 == 0) {
				if (local341.length > local419) {
					local417 = local341[local419++];
				} else {
					local417 = -1;
				}
				local421 = local36.method2878();
			}
			this.aShortArray11[local423] = (short) (this.aShortArray11[local423] + ((local421 - 1 & 0x2) << 14));
			local417--;
			this.anIntArray69[local423] = local421;
		}
		local417 = 0;
		local419 = 0;
		@Pc(480) int local480 = 0;
		for (@Pc(482) int local482 = 0; local482 < 128; local482++) {
			if (this.anIntArray69[local482] != 0) {
				if (local417 == 0) {
					if (local55.length <= local419) {
						local417 = -1;
					} else {
						local417 = local55[local419++];
					}
					local480 = local36.aByteArray38[local83++] - 1;
				}
				local417--;
				this.aByteArray8[local482] = (byte) local480;
			}
		}
		local417 = 0;
		local419 = 0;
		@Pc(534) int local534 = 0;
		for (@Pc(536) int local536 = 0; local536 < 128; local536++) {
			if (this.anIntArray69[local536] != 0) {
				if (local417 == 0) {
					if (local108.length <= local419) {
						local417 = -1;
					} else {
						local417 = local108[local419++];
					}
					local534 = local36.aByteArray38[local132++] + 16 << 2;
				}
				local417--;
				this.aByteArray7[local536] = (byte) local534;
			}
		}
		local419 = 0;
		local417 = 0;
		@Pc(592) Class221 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray69[local594] != 0) {
				if (local417 == 0) {
					local592 = local242[local185[local419]];
					if (local419 >= local157.length) {
						local417 = -1;
					} else {
						local417 = local157[local419++];
					}
				}
				this.aClass221Array1[local594] = local592;
				local417--;
			}
		}
		local417 = 0;
		local419 = 0;
		@Pc(649) int local649 = 0;
		for (@Pc(651) int local651 = 0; local651 < 128; local651++) {
			if (local417 == 0) {
				if (local419 < local341.length) {
					local417 = local341[local419++];
				} else {
					local417 = -1;
				}
				if (this.anIntArray69[local651] > 0) {
					local649 = local36.method2915() + 1;
				}
			}
			this.aByteArray9[local651] = (byte) local649;
			local417--;
		}
		this.anInt592 = local36.method2915() + 1;
		@Pc(715) int local715;
		for (@Pc(704) int local704 = 0; local704 < local198; local704++) {
			@Pc(710) Class221 local710 = local242[local704];
			if (local710.aByteArray82 != null) {
				for (local715 = 1; local715 < local710.aByteArray82.length; local715 += 2) {
					local710.aByteArray82[local715] = local36.method2917();
				}
			}
			if (local710.aByteArray83 != null) {
				for (local715 = 3; local715 < local710.aByteArray83.length - 2; local715 += 2) {
					local710.aByteArray83[local715] = local36.method2917();
				}
			}
		}
		@Pc(764) int local764;
		if (local309 != null) {
			for (local764 = 1; local764 < local309.length; local764 += 2) {
				local309[local764] = local36.method2917();
			}
		}
		if (local325 != null) {
			for (local764 = 1; local764 < local325.length; local764 += 2) {
				local325[local764] = local36.method2917();
			}
		}
		@Pc(813) int local813;
		for (local764 = 0; local764 < local198; local764++) {
			@Pc(806) Class221 local806 = local242[local764];
			if (local806.aByteArray83 != null) {
				local364 = 0;
				for (local813 = 2; local813 < local806.aByteArray83.length; local813 += 2) {
					local364 += local36.method2915() + 1;
					local806.aByteArray83[local813] = (byte) local364;
				}
			}
		}
		@Pc(858) int local858;
		for (local715 = 0; local715 < local198; local715++) {
			@Pc(851) Class221 local851 = local242[local715];
			if (local851.aByteArray82 != null) {
				local364 = 0;
				for (local858 = 2; local858 < local851.aByteArray82.length; local858 += 2) {
					local364 += local36.method2915() + 1;
					local851.aByteArray82[local858] = (byte) local364;
				}
			}
		}
		@Pc(931) int local931;
		@Pc(954) int local954;
		@Pc(960) byte local960;
		@Pc(980) int local980;
		@Pc(982) int local982;
		@Pc(992) int local992;
		@Pc(925) byte local925;
		@Pc(1029) int local1029;
		if (local309 != null) {
			local364 = local36.method2915();
			local309[0] = (byte) local364;
			for (local813 = 2; local813 < local309.length; local813 += 2) {
				local364 += local36.method2915() + 1;
				local309[local813] = (byte) local364;
			}
			local925 = local309[0];
			@Pc(929) byte local929 = local309[1];
			for (local931 = 0; local931 < local925; local931++) {
				this.aByteArray9[local931] = (byte) (local929 * this.aByteArray9[local931] + 32 >> 6);
			}
			local954 = 2;
			while (local309.length > local954) {
				local960 = local309[local954];
				@Pc(966) byte local966 = local309[local954 + 1];
				local980 = (local960 - local925) / 2 + local929 * (local960 - local925);
				for (local982 = local925; local982 < local960; local982++) {
					local992 = Static383.method4926(local960 - local925, local980);
					this.aByteArray9[local982] = (byte) (local992 * this.aByteArray9[local982] + 32 >> 6);
					local980 += local966 - local929;
				}
				local954 += 2;
				local929 = local966;
				local925 = local960;
			}
			for (local1029 = local925; local1029 < 128; local1029++) {
				this.aByteArray9[local1029] = (byte) (this.aByteArray9[local1029] * local929 + 32 >> 6);
			}
		}
		@Pc(1098) int local1098;
		if (local325 != null) {
			local364 = local36.method2915();
			local325[0] = (byte) local364;
			for (local813 = 2; local813 < local325.length; local813 += 2) {
				local364 += local36.method2915() + 1;
				local325[local813] = (byte) local364;
			}
			local925 = local325[0];
			local1098 = local325[1] << 1;
			for (local931 = 0; local931 < local925; local931++) {
				local954 = (this.aByteArray7[local931] & 0xFF) + local1098;
				if (local954 < 0) {
					local954 = 0;
				}
				if (local954 > 128) {
					local954 = 128;
				}
				this.aByteArray7[local931] = (byte) local954;
			}
			local954 = 2;
			@Pc(1151) int local1151;
			while (local954 < local325.length) {
				local960 = local325[local954];
				local1151 = local325[local954 + 1] << 1;
				local980 = (local960 - local925) * local1098 + (local960 - local925) / 2;
				for (local982 = local925; local982 < local960; local982++) {
					local992 = Static383.method4926(local960 - local925, local980);
					@Pc(1186) int local1186 = local992 + (this.aByteArray7[local982] & 0xFF);
					if (local1186 < 0) {
						local1186 = 0;
					}
					if (local1186 > 128) {
						local1186 = 128;
					}
					this.aByteArray7[local982] = (byte) local1186;
					local980 += local1151 - local1098;
				}
				local954 += 2;
				local1098 = local1151;
				local925 = local960;
			}
			for (local1029 = local925; local1029 < 128; local1029++) {
				local1151 = (this.aByteArray7[local1029] & 0xFF) + local1098;
				if (local1151 < 0) {
					local1151 = 0;
				}
				if (local1151 > 128) {
					local1151 = 128;
				}
				this.aByteArray7[local1029] = (byte) local1151;
			}
		}
		for (local813 = 0; local813 < local198; local813++) {
			local242[local813].anInt5830 = local36.method2915();
		}
		for (local858 = 0; local858 < local198; local858++) {
			@Pc(1290) Class221 local1290 = local242[local858];
			if (local1290.aByteArray82 != null) {
				local1290.anInt5828 = local36.method2915();
			}
			if (local1290.aByteArray83 != null) {
				local1290.anInt5825 = local36.method2915();
			}
			if (local1290.anInt5830 > 0) {
				local1290.anInt5823 = local36.method2915();
			}
		}
		for (local1098 = 0; local1098 < local198; local1098++) {
			local242[local1098].anInt5829 = local36.method2915();
		}
		for (local931 = 0; local931 < local198; local931++) {
			@Pc(1352) Class221 local1352 = local242[local931];
			if (local1352.anInt5829 > 0) {
				local1352.anInt5826 = local36.method2915();
			}
		}
		for (local954 = 0; local954 < local198; local954++) {
			@Pc(1379) Class221 local1379 = local242[local954];
			if (local1379.anInt5826 > 0) {
				local1379.anInt5827 = local36.method2915();
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public void method542() {
		this.anIntArray69 = null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!dn;Z[I[B)Z")
	public boolean method544(@OriginalArg(0) Class58 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class1_Sub8_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg2 == null || arg2[local18] != 0) {
				@Pc(30) int local30 = this.anIntArray69[local18];
				if (local30 != 0) {
					if (local14 != local30) {
						local14 = local30--;
						if ((local30 & 0x1) == 0) {
							local16 = arg0.method948(local30 >> 2, arg1);
						} else {
							local16 = arg0.method956(arg1, local30 >> 2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub8_Sub1Array1[local18] = local16;
						this.anIntArray69[local18] = 0;
					}
				}
			}
		}
		return local12;
	}
}
