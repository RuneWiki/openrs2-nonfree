import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!on", name = "m", descriptor = "[Lclient!ig;")
	public Class1_Sub20_Sub1[] aClass1_Sub20_Sub1Array1;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "[Lclient!vl;")
	public Class208[] aClass208Array1;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	public int anInt4640;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	private Class1_Sub33() {
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "([B)V")
	public Class1_Sub33(@OriginalArg(0) byte[] arg0) {
		this.aByteArray54 = new byte[128];
		this.anIntArray431 = new int[128];
		this.aByteArray52 = new byte[128];
		this.aByteArray53 = new byte[128];
		this.aClass208Array1 = new Class208[128];
		this.aClass1_Sub20_Sub1Array1 = new Class1_Sub20_Sub1[128];
		this.aShortArray60 = new short[128];
		@Pc(36) Class1_Sub21 local36 = new Class1_Sub21(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray82[local36.anInt6611 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method5721();
		}
		local38++;
		local36.anInt6611++;
		@Pc(77) int local77 = local36.anInt6611;
		local36.anInt6611 += local38;
		@Pc(85) int local85;
		for (local85 = 0; local36.aByteArray82[local85 + local36.anInt6611] != 0; local85++) {
		}
		@Pc(102) byte[] local102 = new byte[local85];
		for (@Pc(104) int local104 = 0; local104 < local85; local104++) {
			local102[local104] = local36.method5721();
		}
		local85++;
		local36.anInt6611++;
		@Pc(126) int local126 = local36.anInt6611;
		local36.anInt6611 += local85;
		@Pc(134) int local134;
		for (local134 = 0; local36.aByteArray82[local36.anInt6611 + local134] != 0; local134++) {
		}
		@Pc(148) byte[] local148 = new byte[local134];
		for (@Pc(150) int local150 = 0; local150 < local134; local150++) {
			local148[local150] = local36.method5721();
		}
		local134++;
		local36.anInt6611++;
		@Pc(172) byte[] local172 = new byte[local134];
		@Pc(185) int local185;
		@Pc(187) int local187;
		@Pc(193) int local193;
		if (local134 > 1) {
			local172[1] = 1;
			@Pc(183) int local183 = 1;
			local185 = 2;
			for (local187 = 2; local187 < local134; local187++) {
				local193 = local36.method5720();
				if (local193 == 0) {
					local183 = local185++;
				} else {
					if (local193 <= local183) {
						local193--;
					}
					local183 = local193;
				}
				local172[local187] = (byte) local183;
			}
		} else {
			local185 = local134;
		}
		@Pc(226) Class208[] local226 = new Class208[local185];
		for (local187 = 0; local187 < local226.length; local187++) {
			@Pc(238) Class208 local238 = local226[local187] = new Class208();
			@Pc(242) int local242 = local36.method5720();
			if (local242 > 0) {
				local238.aByteArray74 = new byte[local242 * 2];
			}
			local242 = local36.method5720();
			if (local242 > 0) {
				local238.aByteArray73 = new byte[local242 * 2 + 2];
				local238.aByteArray73[1] = 64;
			}
		}
		local193 = local36.method5720();
		@Pc(297) byte[] local297 = local193 <= 0 ? null : new byte[local193 * 2];
		local193 = local36.method5720();
		@Pc(310) byte[] local310 = local193 <= 0 ? null : new byte[local193 * 2];
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray82[local36.anInt6611 + local312] != 0; local312++) {
		}
		@Pc(326) byte[] local326 = new byte[local312];
		for (@Pc(328) int local328 = 0; local328 < local312; local328++) {
			local326[local328] = local36.method5721();
		}
		local312++;
		local36.anInt6611++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local36.method5720();
			this.aShortArray60[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(377) int local377 = 0; local377 < 128; local377++) {
			local353 += local36.method5720();
			this.aShortArray60[local377] = (short) (this.aShortArray60[local377] + (local353 << 8));
		}
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		for (@Pc(410) int local410 = 0; local410 < 128; local410++) {
			if (local404 == 0) {
				if (local326.length > local406) {
					local404 = local326[local406++];
				} else {
					local404 = -1;
				}
				local408 = local36.method5706();
			}
			this.aShortArray60[local410] = (short) (this.aShortArray60[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray431[local410] = local408;
			local404--;
		}
		local406 = 0;
		local404 = 0;
		@Pc(466) int local466 = 0;
		for (@Pc(468) int local468 = 0; local468 < 128; local468++) {
			if (this.anIntArray431[local468] != 0) {
				if (local404 == 0) {
					if (local406 < local53.length) {
						local404 = local53[local406++];
					} else {
						local404 = -1;
					}
					local466 = local36.aByteArray82[local77++] - 1;
				}
				this.aByteArray54[local468] = (byte) local466;
				local404--;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(525) int local525 = 0;
		for (@Pc(527) int local527 = 0; local527 < 128; local527++) {
			if (this.anIntArray431[local527] != 0) {
				if (local404 == 0) {
					local525 = local36.aByteArray82[local126++] + 16 << 2;
					if (local102.length > local406) {
						local404 = local102[local406++];
					} else {
						local404 = -1;
					}
				}
				this.aByteArray53[local527] = (byte) local525;
				local404--;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(581) Class208 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray431[local583] != 0) {
				if (local404 == 0) {
					local581 = local226[local172[local406]];
					if (local148.length <= local406) {
						local404 = -1;
					} else {
						local404 = local148[local406++];
					}
				}
				local404--;
				this.aClass208Array1[local583] = local581;
			}
		}
		local404 = 0;
		local406 = 0;
		@Pc(632) int local632 = 0;
		for (@Pc(634) int local634 = 0; local634 < 128; local634++) {
			if (local404 == 0) {
				if (local406 < local326.length) {
					local404 = local326[local406++];
				} else {
					local404 = -1;
				}
				if (this.anIntArray431[local634] > 0) {
					local632 = local36.method5720() + 1;
				}
			}
			this.aByteArray52[local634] = (byte) local632;
			local404--;
		}
		this.anInt4640 = local36.method5720() + 1;
		@Pc(702) int local702;
		for (@Pc(691) int local691 = 0; local691 < local185; local691++) {
			@Pc(697) Class208 local697 = local226[local691];
			if (local697.aByteArray74 != null) {
				for (local702 = 1; local702 < local697.aByteArray74.length; local702 += 2) {
					local697.aByteArray74[local702] = local36.method5721();
				}
			}
			if (local697.aByteArray73 != null) {
				for (local702 = 3; local702 < local697.aByteArray73.length - 2; local702 += 2) {
					local697.aByteArray73[local702] = local36.method5721();
				}
			}
		}
		@Pc(755) int local755;
		if (local297 != null) {
			for (local755 = 1; local755 < local297.length; local755 += 2) {
				local297[local755] = local36.method5721();
			}
		}
		if (local310 != null) {
			for (local755 = 1; local755 < local310.length; local755 += 2) {
				local310[local755] = local36.method5721();
			}
		}
		@Pc(808) int local808;
		for (local755 = 0; local755 < local185; local755++) {
			@Pc(801) Class208 local801 = local226[local755];
			if (local801.aByteArray73 != null) {
				local353 = 0;
				for (local808 = 2; local808 < local801.aByteArray73.length; local808 += 2) {
					local353 += local36.method5720() + 1;
					local801.aByteArray73[local808] = (byte) local353;
				}
			}
		}
		@Pc(857) int local857;
		for (local702 = 0; local702 < local185; local702++) {
			@Pc(850) Class208 local850 = local226[local702];
			if (local850.aByteArray74 != null) {
				local353 = 0;
				for (local857 = 2; local857 < local850.aByteArray74.length; local857 += 2) {
					local353 = local36.method5720() + local353 + 1;
					local850.aByteArray74[local857] = (byte) local353;
				}
			}
		}
		@Pc(938) int local938;
		@Pc(961) int local961;
		@Pc(967) byte local967;
		@Pc(987) int local987;
		@Pc(989) int local989;
		@Pc(999) int local999;
		@Pc(932) byte local932;
		@Pc(1039) int local1039;
		if (local297 != null) {
			local353 = local36.method5720();
			local297[0] = (byte) local353;
			for (local808 = 2; local808 < local297.length; local808 += 2) {
				local353 = local353 + local36.method5720() + 1;
				local297[local808] = (byte) local353;
			}
			local932 = local297[0];
			@Pc(936) byte local936 = local297[1];
			for (local938 = 0; local938 < local932; local938++) {
				this.aByteArray52[local938] = (byte) (this.aByteArray52[local938] * local936 + 32 >> 6);
			}
			for (local961 = 2; local961 < local297.length; local961 += 2) {
				local967 = local297[local961];
				@Pc(973) byte local973 = local297[local961 + 1];
				local987 = (local967 - local932) / 2 + (local967 - local932) * local936;
				for (local989 = local932; local989 < local967; local989++) {
					local999 = Static288.method5033(local967 - local932, local987);
					this.aByteArray52[local989] = (byte) (this.aByteArray52[local989] * local999 + 32 >> 6);
					local987 += local973 - local936;
				}
				local936 = local973;
				local932 = local967;
			}
			for (local1039 = local932; local1039 < 128; local1039++) {
				this.aByteArray52[local1039] = (byte) (this.aByteArray52[local1039] * local936 + 32 >> 6);
			}
		}
		@Pc(1109) int local1109;
		if (local310 != null) {
			local353 = local36.method5720();
			local310[0] = (byte) local353;
			for (local808 = 2; local808 < local310.length; local808 += 2) {
				local353 = local353 + local36.method5720() + 1;
				local310[local808] = (byte) local353;
			}
			local932 = local310[0];
			local1109 = local310[1] << 1;
			for (local938 = 0; local938 < local932; local938++) {
				local961 = local1109 + (this.aByteArray53[local938] & 0xFF);
				if (local961 < 0) {
					local961 = 0;
				}
				if (local961 > 128) {
					local961 = 128;
				}
				this.aByteArray53[local938] = (byte) local961;
			}
			local961 = 2;
			@Pc(1162) int local1162;
			while (local310.length > local961) {
				local967 = local310[local961];
				local1162 = local310[local961 + 1] << 1;
				local987 = (local967 - local932) / 2 + (local967 - local932) * local1109;
				for (local989 = local932; local989 < local967; local989++) {
					local999 = Static288.method5033(local967 - local932, local987);
					@Pc(1197) int local1197 = (this.aByteArray53[local989] & 0xFF) + local999;
					if (local1197 < 0) {
						local1197 = 0;
					}
					if (local1197 > 128) {
						local1197 = 128;
					}
					this.aByteArray53[local989] = (byte) local1197;
					local987 += local1162 - local1109;
				}
				local1109 = local1162;
				local961 += 2;
				local932 = local967;
			}
			for (local1039 = local932; local1039 < 128; local1039++) {
				local1162 = local1109 + (this.aByteArray53[local1039] & 0xFF);
				if (local1162 < 0) {
					local1162 = 0;
				}
				if (local1162 > 128) {
					local1162 = 128;
				}
				this.aByteArray53[local1039] = (byte) local1162;
			}
		}
		for (local808 = 0; local808 < local185; local808++) {
			local226[local808].anInt6469 = local36.method5720();
		}
		for (local857 = 0; local857 < local185; local857++) {
			@Pc(1300) Class208 local1300 = local226[local857];
			if (local1300.aByteArray74 != null) {
				local1300.anInt6472 = local36.method5720();
			}
			if (local1300.aByteArray73 != null) {
				local1300.anInt6466 = local36.method5720();
			}
			if (local1300.anInt6469 > 0) {
				local1300.anInt6465 = local36.method5720();
			}
		}
		for (local1109 = 0; local1109 < local185; local1109++) {
			local226[local1109].anInt6467 = local36.method5720();
		}
		for (local938 = 0; local938 < local185; local938++) {
			@Pc(1355) Class208 local1355 = local226[local938];
			if (local1355.anInt6467 > 0) {
				local1355.anInt6468 = local36.method5720();
			}
		}
		for (local961 = 0; local961 < local185; local961++) {
			@Pc(1382) Class208 local1382 = local226[local961];
			if (local1382.anInt6468 > 0) {
				local1382.anInt6471 = local36.method5720();
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([BLclient!cp;B[I)Z")
	public boolean method4034(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(19) Class1_Sub20_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg0 == null || arg0[local21] != 0) {
				@Pc(36) int local36 = this.anIntArray431[local21];
				if (local36 != 0) {
					if (local9 != local36) {
						local9 = local36--;
						if ((local36 & 0x1) == 0) {
							local19 = arg1.method902(arg2, local36 >> 2);
						} else {
							local19 = arg1.method903(local36 >> 2, arg2);
						}
						if (local19 == null) {
							local7 = false;
						}
					}
					if (local19 != null) {
						this.aClass1_Sub20_Sub1Array1[local21] = local19;
						this.anIntArray431[local21] = 0;
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public void method4035() {
		this.anIntArray431 = null;
	}
}
