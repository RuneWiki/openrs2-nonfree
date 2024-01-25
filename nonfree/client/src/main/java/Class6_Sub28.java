import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "[Lclient!ft;")
	public Class6_Sub19_Sub1[] aClass6_Sub19_Sub1Array1;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "[Lclient!js;")
	public Class162[] aClass162Array1;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "[I")
	private int[] anIntArray366;

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	private Class6_Sub28() {
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([B)V")
	public Class6_Sub28(@OriginalArg(0) byte[] arg0) {
		this.aClass6_Sub19_Sub1Array1 = new Class6_Sub19_Sub1[128];
		this.aByteArray54 = new byte[128];
		this.aClass162Array1 = new Class162[128];
		this.aByteArray55 = new byte[128];
		this.aShortArray54 = new short[128];
		this.aByteArray56 = new byte[128];
		this.anIntArray366 = new int[128];
		@Pc(36) Class6_Sub21 local36 = new Class6_Sub21(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray93[local36.anInt7338 + local38] != 0; local38++) {
		}
		@Pc(56) byte[] local56 = new byte[local38];
		for (@Pc(58) int local58 = 0; local58 < local38; local58++) {
			local56[local58] = local36.method6055();
		}
		local36.anInt7338++;
		local38++;
		@Pc(80) int local80 = local36.anInt7338;
		local36.anInt7338 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray93[local88 + local36.anInt7338] != 0; local88++) {
		}
		@Pc(105) byte[] local105 = new byte[local88];
		for (@Pc(107) int local107 = 0; local107 < local88; local107++) {
			local105[local107] = local36.method6055();
		}
		local88++;
		local36.anInt7338++;
		@Pc(133) int local133 = local36.anInt7338;
		local36.anInt7338 += local88;
		@Pc(141) int local141;
		for (local141 = 0; local36.aByteArray93[local36.anInt7338 + local141] != 0; local141++) {
		}
		@Pc(158) byte[] local158 = new byte[local141];
		for (@Pc(160) int local160 = 0; local160 < local141; local160++) {
			local158[local160] = local36.method6055();
		}
		local36.anInt7338++;
		local141++;
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
				local205 = local36.method6069();
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
		@Pc(237) Class162[] local237 = new Class162[local187];
		for (local199 = 0; local199 < local237.length; local199++) {
			@Pc(249) Class162 local249 = local237[local199] = new Class162();
			@Pc(253) int local253 = local36.method6069();
			if (local253 > 0) {
				local249.aByteArray51 = new byte[local253 * 2];
			}
			local253 = local36.method6069();
			if (local253 > 0) {
				local249.aByteArray52 = new byte[local253 * 2 + 2];
				local249.aByteArray52[1] = 64;
			}
		}
		local205 = local36.method6069();
		@Pc(308) byte[] local308 = local205 <= 0 ? null : new byte[local205 * 2];
		local205 = local36.method6069();
		@Pc(324) byte[] local324 = local205 <= 0 ? null : new byte[local205 * 2];
		@Pc(326) int local326;
		for (local326 = 0; local36.aByteArray93[local326 + local36.anInt7338] != 0; local326++) {
		}
		@Pc(340) byte[] local340 = new byte[local326];
		for (@Pc(342) int local342 = 0; local342 < local326; local342++) {
			local340[local342] = local36.method6055();
		}
		local326++;
		local36.anInt7338++;
		@Pc(367) int local367 = 0;
		for (@Pc(369) int local369 = 0; local369 < 128; local369++) {
			local367 += local36.method6069();
			this.aShortArray54[local369] = (short) local367;
		}
		local367 = 0;
		for (@Pc(391) int local391 = 0; local391 < 128; local391++) {
			local367 += local36.method6069();
			this.aShortArray54[local391] = (short) (this.aShortArray54[local391] + (local367 << 8));
		}
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		for (@Pc(422) int local422 = 0; local422 < 128; local422++) {
			if (local416 == 0) {
				if (local340.length <= local418) {
					local416 = -1;
				} else {
					local416 = local340[local418++];
				}
				local420 = local36.method6027();
			}
			this.aShortArray54[local422] = (short) (this.aShortArray54[local422] + ((local420 - 1 & 0x2) << 14));
			local416--;
			this.anIntArray366[local422] = local420;
		}
		local418 = 0;
		local416 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < 128; local479++) {
			if (this.anIntArray366[local479] != 0) {
				if (local416 == 0) {
					if (local56.length <= local418) {
						local416 = -1;
					} else {
						local416 = local56[local418++];
					}
					local477 = local36.aByteArray93[local80++] - 1;
				}
				this.aByteArray54[local479] = (byte) local477;
				local416--;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(531) int local531 = 0;
		for (@Pc(533) int local533 = 0; local533 < 128; local533++) {
			if (this.anIntArray366[local533] != 0) {
				if (local416 == 0) {
					local531 = local36.aByteArray93[local133++] + 16 << 2;
					if (local105.length > local418) {
						local416 = local105[local418++];
					} else {
						local416 = -1;
					}
				}
				this.aByteArray55[local533] = (byte) local531;
				local416--;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(589) Class162 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray366[local591] != 0) {
				if (local416 == 0) {
					local589 = local237[local182[local418]];
					if (local418 < local158.length) {
						local416 = local158[local418++];
					} else {
						local416 = -1;
					}
				}
				local416--;
				this.aClass162Array1[local591] = local589;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(636) int local636 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local416 == 0) {
				if (local418 >= local340.length) {
					local416 = -1;
				} else {
					local416 = local340[local418++];
				}
				if (this.anIntArray366[local638] > 0) {
					local636 = local36.method6069() + 1;
				}
			}
			this.aByteArray56[local638] = (byte) local636;
			local416--;
		}
		this.anInt4886 = local36.method6069() + 1;
		@Pc(700) int local700;
		for (@Pc(689) int local689 = 0; local689 < local187; local689++) {
			@Pc(695) Class162 local695 = local237[local689];
			if (local695.aByteArray51 != null) {
				for (local700 = 1; local700 < local695.aByteArray51.length; local700 += 2) {
					local695.aByteArray51[local700] = local36.method6055();
				}
			}
			if (local695.aByteArray52 != null) {
				for (local700 = 3; local700 < local695.aByteArray52.length - 2; local700 += 2) {
					local695.aByteArray52[local700] = local36.method6055();
				}
			}
		}
		@Pc(753) int local753;
		if (local308 != null) {
			for (local753 = 1; local753 < local308.length; local753 += 2) {
				local308[local753] = local36.method6055();
			}
		}
		if (local324 != null) {
			for (local753 = 1; local753 < local324.length; local753 += 2) {
				local324[local753] = local36.method6055();
			}
		}
		@Pc(806) int local806;
		for (local753 = 0; local753 < local187; local753++) {
			@Pc(799) Class162 local799 = local237[local753];
			if (local799.aByteArray52 != null) {
				local367 = 0;
				for (local806 = 2; local806 < local799.aByteArray52.length; local806 += 2) {
					local367 = local36.method6069() + local367 + 1;
					local799.aByteArray52[local806] = (byte) local367;
				}
			}
		}
		@Pc(855) int local855;
		for (local700 = 0; local700 < local187; local700++) {
			@Pc(848) Class162 local848 = local237[local700];
			if (local848.aByteArray51 != null) {
				local367 = 0;
				for (local855 = 2; local855 < local848.aByteArray51.length; local855 += 2) {
					local367 = local36.method6069() + local367 + 1;
					local848.aByteArray51[local855] = (byte) local367;
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
		if (local308 != null) {
			local367 = local36.method6069();
			local308[0] = (byte) local367;
			for (local806 = 2; local806 < local308.length; local806 += 2) {
				local367 = local367 + local36.method6069() + 1;
				local308[local806] = (byte) local367;
			}
			local927 = local308[0];
			@Pc(931) byte local931 = local308[1];
			for (local933 = 0; local933 < local927; local933++) {
				this.aByteArray56[local933] = (byte) (this.aByteArray56[local933] * local931 + 32 >> 6);
			}
			local960 = 2;
			while (local960 < local308.length) {
				local966 = local308[local960];
				@Pc(972) byte local972 = local308[local960 + 1];
				local986 = local931 * (local966 - local927) + (local966 - local927) / 2;
				for (local988 = local927; local988 < local966; local988++) {
					local998 = Static347.method5323(local966 - local927, local986);
					local986 += local972 - local931;
					this.aByteArray56[local988] = (byte) (local998 * this.aByteArray56[local988] + 32 >> 6);
				}
				local960 += 2;
				local927 = local966;
				local931 = local972;
			}
			for (local1041 = local927; local1041 < 128; local1041++) {
				this.aByteArray56[local1041] = (byte) (local931 * this.aByteArray56[local1041] + 32 >> 6);
			}
		}
		@Pc(1105) int local1105;
		if (local324 != null) {
			local367 = local36.method6069();
			local324[0] = (byte) local367;
			for (local806 = 2; local806 < local324.length; local806 += 2) {
				local367 += local36.method6069() + 1;
				local324[local806] = (byte) local367;
			}
			local927 = local324[0];
			local1105 = local324[1] << 1;
			for (local933 = 0; local933 < local927; local933++) {
				local960 = (this.aByteArray55[local933] & 0xFF) + local1105;
				if (local960 < 0) {
					local960 = 0;
				}
				if (local960 > 128) {
					local960 = 128;
				}
				this.aByteArray55[local933] = (byte) local960;
			}
			local960 = 2;
			@Pc(1156) int local1156;
			while (local960 < local324.length) {
				local966 = local324[local960];
				local1156 = local324[local960 + 1] << 1;
				local986 = local1105 * (local966 - local927) + (local966 - local927) / 2;
				for (local988 = local927; local988 < local966; local988++) {
					local998 = Static347.method5323(local966 - local927, local986);
					@Pc(1191) int local1191 = local998 + (this.aByteArray55[local988] & 0xFF);
					if (local1191 < 0) {
						local1191 = 0;
					}
					if (local1191 > 128) {
						local1191 = 128;
					}
					local986 += local1156 - local1105;
					this.aByteArray55[local988] = (byte) local1191;
				}
				local960 += 2;
				local927 = local966;
				local1105 = local1156;
			}
			for (local1041 = local927; local1041 < 128; local1041++) {
				local1156 = (this.aByteArray55[local1041] & 0xFF) + local1105;
				if (local1156 < 0) {
					local1156 = 0;
				}
				if (local1156 > 128) {
					local1156 = 128;
				}
				this.aByteArray55[local1041] = (byte) local1156;
			}
		}
		for (local806 = 0; local806 < local187; local806++) {
			local237[local806].anInt4857 = local36.method6069();
		}
		for (local855 = 0; local855 < local187; local855++) {
			@Pc(1304) Class162 local1304 = local237[local855];
			if (local1304.aByteArray51 != null) {
				local1304.anInt4855 = local36.method6069();
			}
			if (local1304.aByteArray52 != null) {
				local1304.anInt4856 = local36.method6069();
			}
			if (local1304.anInt4857 > 0) {
				local1304.anInt4859 = local36.method6069();
			}
		}
		for (local1105 = 0; local1105 < local187; local1105++) {
			local237[local1105].anInt4860 = local36.method6069();
		}
		for (local933 = 0; local933 < local187; local933++) {
			@Pc(1362) Class162 local1362 = local237[local933];
			if (local1362.anInt4860 > 0) {
				local1362.anInt4854 = local36.method6069();
			}
		}
		for (local960 = 0; local960 < local187; local960++) {
			@Pc(1386) Class162 local1386 = local237[local960];
			if (local1386.anInt4854 > 0) {
				local1386.anInt4858 = local36.method6069();
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	public void method4226() {
		this.anIntArray366 = null;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!fea;[B[II)Z")
	public boolean method4228(@OriginalArg(0) Class93 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class6_Sub19_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg1 == null || arg1[local13] != 0) {
				@Pc(28) int local28 = this.anIntArray366[local13];
				if (local28 != 0) {
					if (local9 != local28) {
						local9 = local28--;
						if ((local28 & 0x1) == 0) {
							local11 = arg0.method2629(local28 >> 2, arg2);
						} else {
							local11 = arg0.method2628(arg2, local28 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass6_Sub19_Sub1Array1[local13] = local11;
						this.anIntArray366[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
