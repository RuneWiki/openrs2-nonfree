import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "[Lclient!gh;")
	public Class124[] aClass124Array1;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public int anInt9297;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "[S")
	public short[] aShortArray137;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "[Lclient!aaa;")
	public Class2_Sub1_Sub1[] aClass2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "[B")
	public byte[] aByteArray105;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
	private int[] anIntArray637;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "[B")
	public byte[] aByteArray106;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	private Class2_Sub47() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V")
	public Class2_Sub47(@OriginalArg(0) byte[] arg0) {
		this.aByteArray106 = new byte[128];
		this.aClass124Array1 = new Class124[128];
		this.aByteArray104 = new byte[128];
		this.aShortArray137 = new short[128];
		this.anIntArray637 = new int[128];
		this.aByteArray105 = new byte[128];
		this.aClass2_Sub1_Sub1Array1 = new Class2_Sub1_Sub1[128];
		@Pc(36) Class2_Sub22 local36 = new Class2_Sub22(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray115[local36.anInt10247 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method8548();
		}
		local38++;
		local36.anInt10247++;
		@Pc(79) int local79 = local36.anInt10247;
		local36.anInt10247 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray115[local87 + local36.anInt10247] != 0; local87++) {
		}
		@Pc(104) byte[] local104 = new byte[local87];
		for (@Pc(106) int local106 = 0; local106 < local87; local106++) {
			local104[local106] = local36.method8548();
		}
		local36.anInt10247++;
		local87++;
		@Pc(132) int local132 = local36.anInt10247;
		local36.anInt10247 += local87;
		@Pc(140) int local140;
		for (local140 = 0; local36.aByteArray115[local140 + local36.anInt10247] != 0; local140++) {
		}
		@Pc(157) byte[] local157 = new byte[local140];
		for (@Pc(159) int local159 = 0; local159 < local140; local159++) {
			local157[local159] = local36.method8548();
		}
		local140++;
		local36.anInt10247++;
		@Pc(185) byte[] local185 = new byte[local140];
		@Pc(190) int local190;
		@Pc(202) int local202;
		@Pc(208) int local208;
		if (local140 <= 1) {
			local190 = local140;
		} else {
			local185[1] = 1;
			local190 = 2;
			@Pc(200) int local200 = 1;
			for (local202 = 2; local202 < local140; local202++) {
				local208 = local36.method8547();
				if (local208 == 0) {
					local200 = local190++;
				} else {
					if (local200 >= local208) {
						local208--;
					}
					local200 = local208;
				}
				local185[local202] = (byte) local200;
			}
		}
		@Pc(233) Class124[] local233 = new Class124[local190];
		for (local202 = 0; local202 < local233.length; local202++) {
			@Pc(245) Class124 local245 = local233[local202] = new Class124();
			@Pc(249) int local249 = local36.method8547();
			if (local249 > 0) {
				local245.aByteArray39 = new byte[local249 * 2];
			}
			local249 = local36.method8547();
			if (local249 > 0) {
				local245.aByteArray40 = new byte[local249 * 2 + 2];
				local245.aByteArray40[1] = 64;
			}
		}
		local208 = local36.method8547();
		@Pc(297) byte[] local297 = local208 <= 0 ? null : new byte[local208 * 2];
		local208 = local36.method8547();
		@Pc(310) byte[] local310 = local208 <= 0 ? null : new byte[local208 * 2];
		@Pc(312) int local312;
		for (local312 = 0; local36.aByteArray115[local36.anInt10247 + local312] != 0; local312++) {
		}
		@Pc(330) byte[] local330 = new byte[local312];
		for (@Pc(332) int local332 = 0; local332 < local312; local332++) {
			local330[local332] = local36.method8548();
		}
		local312++;
		local36.anInt10247++;
		@Pc(353) int local353 = 0;
		for (@Pc(355) int local355 = 0; local355 < 128; local355++) {
			local353 += local36.method8547();
			this.aShortArray137[local355] = (short) local353;
		}
		local353 = 0;
		for (@Pc(379) int local379 = 0; local379 < 128; local379++) {
			local353 += local36.method8547();
			this.aShortArray137[local379] = (short) (this.aShortArray137[local379] + (local353 << 8));
		}
		@Pc(404) int local404 = 0;
		@Pc(406) int local406 = 0;
		@Pc(408) int local408 = 0;
		for (@Pc(410) int local410 = 0; local410 < 128; local410++) {
			if (local404 == 0) {
				if (local406 >= local330.length) {
					local404 = -1;
				} else {
					local404 = local330[local406++];
				}
				local408 = local36.method8523();
			}
			this.aShortArray137[local410] = (short) (this.aShortArray137[local410] + ((local408 - 1 & 0x2) << 14));
			this.anIntArray637[local410] = local408;
			local404--;
		}
		local404 = 0;
		local406 = 0;
		@Pc(471) int local471 = 0;
		for (@Pc(473) int local473 = 0; local473 < 128; local473++) {
			if (this.anIntArray637[local473] != 0) {
				if (local404 == 0) {
					if (local406 >= local55.length) {
						local404 = -1;
					} else {
						local404 = local55[local406++];
					}
					local471 = local36.aByteArray115[local79++] - 1;
				}
				local404--;
				this.aByteArray106[local473] = (byte) local471;
			}
		}
		local404 = 0;
		local406 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray637[local531] != 0) {
				if (local404 == 0) {
					local529 = local36.aByteArray115[local132++] + 16 << 2;
					if (local104.length > local406) {
						local404 = local104[local406++];
					} else {
						local404 = -1;
					}
				}
				local404--;
				this.aByteArray104[local531] = (byte) local529;
			}
		}
		local406 = 0;
		local404 = 0;
		@Pc(588) Class124 local588 = null;
		for (@Pc(590) int local590 = 0; local590 < 128; local590++) {
			if (this.anIntArray637[local590] != 0) {
				if (local404 == 0) {
					local588 = local233[local185[local406]];
					if (local157.length > local406) {
						local404 = local157[local406++];
					} else {
						local404 = -1;
					}
				}
				this.aClass124Array1[local590] = local588;
				local404--;
			}
		}
		local404 = 0;
		local406 = 0;
		@Pc(642) int local642 = 0;
		for (@Pc(644) int local644 = 0; local644 < 128; local644++) {
			if (local404 == 0) {
				if (local330.length > local406) {
					local404 = local330[local406++];
				} else {
					local404 = -1;
				}
				if (this.anIntArray637[local644] > 0) {
					local642 = local36.method8547() + 1;
				}
			}
			this.aByteArray105[local644] = (byte) local642;
			local404--;
		}
		this.anInt9297 = local36.method8547() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local190; local695++) {
			@Pc(701) Class124 local701 = local233[local695];
			if (local701.aByteArray39 != null) {
				for (local706 = 1; local706 < local701.aByteArray39.length; local706 += 2) {
					local701.aByteArray39[local706] = local36.method8548();
				}
			}
			if (local701.aByteArray40 != null) {
				for (local706 = 3; local706 < local701.aByteArray40.length - 2; local706 += 2) {
					local701.aByteArray40[local706] = local36.method8548();
				}
			}
		}
		@Pc(755) int local755;
		if (local297 != null) {
			for (local755 = 1; local755 < local297.length; local755 += 2) {
				local297[local755] = local36.method8548();
			}
		}
		if (local310 != null) {
			for (local755 = 1; local755 < local310.length; local755 += 2) {
				local310[local755] = local36.method8548();
			}
		}
		@Pc(808) int local808;
		for (local755 = 0; local755 < local190; local755++) {
			@Pc(801) Class124 local801 = local233[local755];
			if (local801.aByteArray40 != null) {
				local353 = 0;
				for (local808 = 2; local808 < local801.aByteArray40.length; local808 += 2) {
					local353 = local36.method8547() + local353 + 1;
					local801.aByteArray40[local808] = (byte) local353;
				}
			}
		}
		@Pc(849) int local849;
		for (local706 = 0; local706 < local190; local706++) {
			@Pc(842) Class124 local842 = local233[local706];
			if (local842.aByteArray39 != null) {
				local353 = 0;
				for (local849 = 2; local849 < local842.aByteArray39.length; local849 += 2) {
					local353 += local36.method8547() + 1;
					local842.aByteArray39[local849] = (byte) local353;
				}
			}
		}
		@Pc(922) int local922;
		@Pc(945) int local945;
		@Pc(951) byte local951;
		@Pc(971) int local971;
		@Pc(973) int local973;
		@Pc(983) int local983;
		@Pc(916) byte local916;
		@Pc(1026) int local1026;
		if (local297 != null) {
			local353 = local36.method8547();
			local297[0] = (byte) local353;
			for (local808 = 2; local808 < local297.length; local808 += 2) {
				local353 += local36.method8547() + 1;
				local297[local808] = (byte) local353;
			}
			local916 = local297[0];
			@Pc(920) byte local920 = local297[1];
			for (local922 = 0; local922 < local916; local922++) {
				this.aByteArray105[local922] = (byte) (this.aByteArray105[local922] * local920 + 32 >> 6);
			}
			local945 = 2;
			while (local297.length > local945) {
				local951 = local297[local945];
				@Pc(957) byte local957 = local297[local945 + 1];
				local971 = (local951 - local916) / 2 + (local951 - local916) * local920;
				for (local973 = local916; local973 < local951; local973++) {
					local983 = Static21.method419(local971, local951 - local916);
					this.aByteArray105[local973] = (byte) (this.aByteArray105[local973] * local983 + 32 >> 6);
					local971 += local957 - local920;
				}
				local945 += 2;
				local916 = local951;
				local920 = local957;
			}
			for (local1026 = local916; local1026 < 128; local1026++) {
				this.aByteArray105[local1026] = (byte) (this.aByteArray105[local1026] * local920 + 32 >> 6);
			}
		}
		@Pc(1096) int local1096;
		if (local310 != null) {
			local353 = local36.method8547();
			local310[0] = (byte) local353;
			for (local808 = 2; local808 < local310.length; local808 += 2) {
				local353 += local36.method8547() + 1;
				local310[local808] = (byte) local353;
			}
			local916 = local310[0];
			local1096 = local310[1] << 1;
			for (local922 = 0; local922 < local916; local922++) {
				local945 = local1096 + (this.aByteArray104[local922] & 0xFF);
				if (local945 < 0) {
					local945 = 0;
				}
				if (local945 > 128) {
					local945 = 128;
				}
				this.aByteArray104[local922] = (byte) local945;
			}
			local945 = 2;
			@Pc(1147) int local1147;
			while (local945 < local310.length) {
				local951 = local310[local945];
				local1147 = local310[local945 + 1] << 1;
				local971 = (local951 - local916) / 2 + (local951 - local916) * local1096;
				for (local973 = local916; local973 < local951; local973++) {
					local983 = Static21.method419(local971, local951 - local916);
					@Pc(1182) int local1182 = local983 + (this.aByteArray104[local973] & 0xFF);
					if (local1182 < 0) {
						local1182 = 0;
					}
					if (local1182 > 128) {
						local1182 = 128;
					}
					this.aByteArray104[local973] = (byte) local1182;
					local971 += local1147 - local1096;
				}
				local916 = local951;
				local945 += 2;
				local1096 = local1147;
			}
			for (local1026 = local916; local1026 < 128; local1026++) {
				local1147 = (this.aByteArray104[local1026] & 0xFF) + local1096;
				if (local1147 < 0) {
					local1147 = 0;
				}
				if (local1147 > 128) {
					local1147 = 128;
				}
				this.aByteArray104[local1026] = (byte) local1147;
			}
		}
		for (local808 = 0; local808 < local190; local808++) {
			local233[local808].anInt3156 = local36.method8547();
		}
		for (local849 = 0; local849 < local190; local849++) {
			@Pc(1289) Class124 local1289 = local233[local849];
			if (local1289.aByteArray39 != null) {
				local1289.anInt3162 = local36.method8547();
			}
			if (local1289.aByteArray40 != null) {
				local1289.anInt3158 = local36.method8547();
			}
			if (local1289.anInt3156 > 0) {
				local1289.anInt3161 = local36.method8547();
			}
		}
		for (local1096 = 0; local1096 < local190; local1096++) {
			local233[local1096].anInt3155 = local36.method8547();
		}
		for (local922 = 0; local922 < local190; local922++) {
			@Pc(1344) Class124 local1344 = local233[local922];
			if (local1344.anInt3155 > 0) {
				local1344.anInt3157 = local36.method8547();
			}
		}
		for (local945 = 0; local945 < local190; local945++) {
			@Pc(1368) Class124 local1368 = local233[local945];
			if (local1368.anInt3157 > 0) {
				local1368.anInt3154 = local36.method8547();
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([BILclient!km;[I)Z")
	public boolean method7803(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class195 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = 0;
		@Pc(16) Class2_Sub1_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray637[local18];
				if (local33 != 0) {
					if (local33 != local14) {
						local14 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg1.method4104(local33 >> 2, arg2);
						} else {
							local16 = arg1.method4103(local33 >> 2, arg2);
						}
						if (local16 == null) {
							local12 = false;
						}
					}
					if (local16 != null) {
						this.aClass2_Sub1_Sub1Array1[local18] = local16;
						this.anIntArray637[local18] = 0;
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public void method7805() {
		this.anIntArray637 = null;
	}
}
