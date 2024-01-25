import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class2_Sub46 extends Class2 {

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[Lclient!lf;")
	public Class2_Sub14_Sub1[] aClass2_Sub14_Sub1Array1;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	public int anInt7435;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[Lclient!sn;")
	public Class228[] aClass228Array1;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[I")
	private int[] anIntArray610;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "[S")
	public short[] aShortArray118;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	private Class2_Sub46() {
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub46(@OriginalArg(0) byte[] arg0) {
		this.aByteArray92 = new byte[128];
		this.aClass228Array1 = new Class228[128];
		this.aClass2_Sub14_Sub1Array1 = new Class2_Sub14_Sub1[128];
		this.aByteArray93 = new byte[128];
		this.aByteArray91 = new byte[128];
		this.anIntArray610 = new int[128];
		this.aShortArray118 = new short[128];
		@Pc(36) Class2_Sub17 local36 = new Class2_Sub17(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray94[local36.anInt7523 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method6120();
		}
		local38++;
		local36.anInt7523++;
		@Pc(81) int local81 = local36.anInt7523;
		local36.anInt7523 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray94[local89 + local36.anInt7523] != 0; local89++) {
		}
		@Pc(103) byte[] local103 = new byte[local89];
		for (@Pc(105) int local105 = 0; local105 < local89; local105++) {
			local103[local105] = local36.method6120();
		}
		local36.anInt7523++;
		local89++;
		@Pc(131) int local131 = local36.anInt7523;
		local36.anInt7523 += local89;
		@Pc(139) int local139;
		for (local139 = 0; local36.aByteArray94[local36.anInt7523 + local139] != 0; local139++) {
		}
		@Pc(156) byte[] local156 = new byte[local139];
		for (@Pc(158) int local158 = 0; local158 < local139; local158++) {
			local156[local158] = local36.method6120();
		}
		local139++;
		local36.anInt7523++;
		@Pc(184) byte[] local184 = new byte[local139];
		@Pc(189) int local189;
		@Pc(201) int local201;
		@Pc(207) int local207;
		if (local139 <= 1) {
			local189 = local139;
		} else {
			local184[1] = 1;
			@Pc(197) int local197 = 1;
			local189 = 2;
			for (local201 = 2; local201 < local139; local201++) {
				local207 = local36.method6138();
				if (local207 == 0) {
					local197 = local189++;
				} else {
					if (local207 <= local197) {
						local207--;
					}
					local197 = local207;
				}
				local184[local201] = (byte) local197;
			}
		}
		@Pc(240) Class228[] local240 = new Class228[local189];
		for (local201 = 0; local201 < local240.length; local201++) {
			@Pc(252) Class228 local252 = local240[local201] = new Class228();
			@Pc(256) int local256 = local36.method6138();
			if (local256 > 0) {
				local252.aByteArray71 = new byte[local256 * 2];
			}
			local256 = local36.method6138();
			if (local256 > 0) {
				local252.aByteArray72 = new byte[local256 * 2 + 2];
				local252.aByteArray72[1] = 64;
			}
		}
		local207 = local36.method6138();
		@Pc(304) byte[] local304 = local207 > 0 ? new byte[local207 * 2] : null;
		local207 = local36.method6138();
		@Pc(317) byte[] local317 = local207 > 0 ? new byte[local207 * 2] : null;
		@Pc(319) int local319;
		for (local319 = 0; local36.aByteArray94[local36.anInt7523 + local319] != 0; local319++) {
		}
		@Pc(337) byte[] local337 = new byte[local319];
		for (@Pc(339) int local339 = 0; local339 < local319; local339++) {
			local337[local339] = local36.method6120();
		}
		local36.anInt7523++;
		local319++;
		@Pc(364) int local364 = 0;
		for (@Pc(366) int local366 = 0; local366 < 128; local366++) {
			local364 += local36.method6138();
			this.aShortArray118[local366] = (short) local364;
		}
		local364 = 0;
		for (@Pc(390) int local390 = 0; local390 < 128; local390++) {
			local364 += local36.method6138();
			this.aShortArray118[local390] = (short) (this.aShortArray118[local390] + (local364 << 8));
		}
		@Pc(415) int local415 = 0;
		@Pc(417) int local417 = 0;
		@Pc(419) int local419 = 0;
		for (@Pc(421) int local421 = 0; local421 < 128; local421++) {
			if (local415 == 0) {
				if (local417 >= local337.length) {
					local415 = -1;
				} else {
					local415 = local337[local417++];
				}
				local419 = local36.method6162();
			}
			this.aShortArray118[local421] = (short) (this.aShortArray118[local421] + ((local419 - 1 & 0x2) << 14));
			this.anIntArray610[local421] = local419;
			local415--;
		}
		local417 = 0;
		local415 = 0;
		@Pc(479) int local479 = 0;
		for (@Pc(481) int local481 = 0; local481 < 128; local481++) {
			if (this.anIntArray610[local481] != 0) {
				if (local415 == 0) {
					local479 = local36.aByteArray94[local81++] - 1;
					if (local53.length <= local417) {
						local415 = -1;
					} else {
						local415 = local53[local417++];
					}
				}
				this.aByteArray92[local481] = (byte) local479;
				local415--;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(535) int local535 = 0;
		for (@Pc(537) int local537 = 0; local537 < 128; local537++) {
			if (this.anIntArray610[local537] != 0) {
				if (local415 == 0) {
					local535 = local36.aByteArray94[local131++] + 16 << 2;
					if (local417 < local103.length) {
						local415 = local103[local417++];
					} else {
						local415 = -1;
					}
				}
				local415--;
				this.aByteArray91[local537] = (byte) local535;
			}
		}
		local417 = 0;
		local415 = 0;
		@Pc(592) Class228 local592 = null;
		for (@Pc(594) int local594 = 0; local594 < 128; local594++) {
			if (this.anIntArray610[local594] != 0) {
				if (local415 == 0) {
					local592 = local240[local184[local417]];
					if (local156.length <= local417) {
						local415 = -1;
					} else {
						local415 = local156[local417++];
					}
				}
				this.aClass228Array1[local594] = local592;
				local415--;
			}
		}
		local415 = 0;
		local417 = 0;
		@Pc(646) int local646 = 0;
		for (@Pc(648) int local648 = 0; local648 < 128; local648++) {
			if (local415 == 0) {
				if (local417 < local337.length) {
					local415 = local337[local417++];
				} else {
					local415 = -1;
				}
				if (this.anIntArray610[local648] > 0) {
					local646 = local36.method6138() + 1;
				}
			}
			local415--;
			this.aByteArray93[local648] = (byte) local646;
		}
		this.anInt7435 = local36.method6138() + 1;
		@Pc(711) int local711;
		for (@Pc(700) int local700 = 0; local700 < local189; local700++) {
			@Pc(706) Class228 local706 = local240[local700];
			if (local706.aByteArray71 != null) {
				for (local711 = 1; local711 < local706.aByteArray71.length; local711 += 2) {
					local706.aByteArray71[local711] = local36.method6120();
				}
			}
			if (local706.aByteArray72 != null) {
				for (local711 = 3; local711 < local706.aByteArray72.length - 2; local711 += 2) {
					local706.aByteArray72[local711] = local36.method6120();
				}
			}
		}
		@Pc(760) int local760;
		if (local304 != null) {
			for (local760 = 1; local760 < local304.length; local760 += 2) {
				local304[local760] = local36.method6120();
			}
		}
		if (local317 != null) {
			for (local760 = 1; local760 < local317.length; local760 += 2) {
				local317[local760] = local36.method6120();
			}
		}
		@Pc(809) int local809;
		for (local760 = 0; local760 < local189; local760++) {
			@Pc(802) Class228 local802 = local240[local760];
			if (local802.aByteArray72 != null) {
				local364 = 0;
				for (local809 = 2; local809 < local802.aByteArray72.length; local809 += 2) {
					local364 = local364 + local36.method6138() + 1;
					local802.aByteArray72[local809] = (byte) local364;
				}
			}
		}
		@Pc(854) int local854;
		for (local711 = 0; local711 < local189; local711++) {
			@Pc(847) Class228 local847 = local240[local711];
			if (local847.aByteArray71 != null) {
				local364 = 0;
				for (local854 = 2; local854 < local847.aByteArray71.length; local854 += 2) {
					local364 -= -local36.method6138() - 1;
					local847.aByteArray71[local854] = (byte) local364;
				}
			}
		}
		@Pc(933) int local933;
		@Pc(960) int local960;
		@Pc(966) byte local966;
		@Pc(986) int local986;
		@Pc(988) int local988;
		@Pc(998) int local998;
		@Pc(927) byte local927;
		@Pc(1041) int local1041;
		if (local304 != null) {
			local364 = local36.method6138();
			local304[0] = (byte) local364;
			for (local809 = 2; local809 < local304.length; local809 += 2) {
				local364 = local364 + local36.method6138() + 1;
				local304[local809] = (byte) local364;
			}
			local927 = local304[0];
			@Pc(931) byte local931 = local304[1];
			for (local933 = 0; local933 < local927; local933++) {
				this.aByteArray93[local933] = (byte) (this.aByteArray93[local933] * local931 + 32 >> 6);
			}
			local960 = 2;
			while (local304.length > local960) {
				local966 = local304[local960];
				@Pc(972) byte local972 = local304[local960 + 1];
				local986 = local931 * (local966 - local927) + (local966 - local927) / 2;
				for (local988 = local927; local988 < local966; local988++) {
					local998 = Static381.method5252(local966 - local927, local986);
					local986 += local972 - local931;
					this.aByteArray93[local988] = (byte) (local998 * this.aByteArray93[local988] + 32 >> 6);
				}
				local927 = local966;
				local960 += 2;
				local931 = local972;
			}
			for (local1041 = local927; local1041 < 128; local1041++) {
				this.aByteArray93[local1041] = (byte) (this.aByteArray93[local1041] * local931 + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local317 != null) {
			local364 = local36.method6138();
			local317[0] = (byte) local364;
			for (local809 = 2; local809 < local317.length; local809 += 2) {
				local364 = local36.method6138() + local364 + 1;
				local317[local809] = (byte) local364;
			}
			local927 = local317[0];
			local1105 = local317[1] << 1;
			for (local933 = 0; local933 < local927; local933++) {
				local960 = local1105 + (this.aByteArray91[local933] & 0xFF);
				if (local960 < 0) {
					local960 = 0;
				}
				if (local960 > 128) {
					local960 = 128;
				}
				this.aByteArray91[local933] = (byte) local960;
			}
			@Pc(1160) int local1160;
			for (local960 = 2; local960 < local317.length; local960 += 2) {
				local966 = local317[local960];
				local1160 = local317[local960 + 1] << 1;
				local986 = (local966 - local927) / 2 + (local966 - local927) * local1105;
				for (local988 = local927; local988 < local966; local988++) {
					local998 = Static381.method5252(local966 - local927, local986);
					@Pc(1195) int local1195 = local998 + (this.aByteArray91[local988] & 0xFF);
					if (local1195 < 0) {
						local1195 = 0;
					}
					if (local1195 > 128) {
						local1195 = 128;
					}
					local986 += local1160 - local1105;
					this.aByteArray91[local988] = (byte) local1195;
				}
				local1105 = local1160;
				local927 = local966;
			}
			for (local1041 = local927; local1041 < 128; local1041++) {
				local1160 = local1105 + (this.aByteArray91[local1041] & 0xFF);
				if (local1160 < 0) {
					local1160 = 0;
				}
				if (local1160 > 128) {
					local1160 = 128;
				}
				this.aByteArray91[local1041] = (byte) local1160;
			}
		}
		for (local809 = 0; local809 < local189; local809++) {
			local240[local809].anInt6593 = local36.method6138();
		}
		for (local854 = 0; local854 < local189; local854++) {
			@Pc(1298) Class228 local1298 = local240[local854];
			if (local1298.aByteArray71 != null) {
				local1298.anInt6592 = local36.method6138();
			}
			if (local1298.aByteArray72 != null) {
				local1298.anInt6583 = local36.method6138();
			}
			if (local1298.anInt6593 > 0) {
				local1298.anInt6591 = local36.method6138();
			}
		}
		for (local1105 = 0; local1105 < local189; local1105++) {
			local240[local1105].anInt6590 = local36.method6138();
		}
		for (local933 = 0; local933 < local189; local933++) {
			@Pc(1349) Class228 local1349 = local240[local933];
			if (local1349.anInt6590 > 0) {
				local1349.anInt6589 = local36.method6138();
			}
		}
		for (local960 = 0; local960 < local189; local960++) {
			@Pc(1376) Class228 local1376 = local240[local960];
			if (local1376.anInt6589 > 0) {
				local1376.anInt6584 = local36.method6138();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B[ILclient!ek;)Z")
	public boolean method6042(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class69 arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class2_Sub14_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(31) int local31 = this.anIntArray610[local19];
				if (local31 != 0) {
					if (local31 != local15) {
						local15 = local31--;
						if ((local31 & 0x1) == 0) {
							local17 = arg2.method1418(local31 >> 2, arg1);
						} else {
							local17 = arg2.method1421(arg1, local31 >> 2);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass2_Sub14_Sub1Array1[local19] = local17;
						this.anIntArray610[local19] = 0;
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public void method6043() {
		this.anIntArray610 = null;
	}
}
