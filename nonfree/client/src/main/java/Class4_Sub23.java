import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "[Lclient!pb;")
	public Class4_Sub8_Sub1[] aClass4_Sub8_Sub1Array1;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
	public int anInt4327;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "[Lclient!si;")
	public Class160[] aClass160Array1;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "[I")
	private int[] anIntArray458 = new int[128];

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub23(@OriginalArg(0) byte[] arg0) {
		@Pc(9) int local9 = 0;
		this.aByteArray56 = new byte[128];
		this.aByteArray58 = new byte[128];
		this.aByteArray57 = new byte[128];
		this.aClass160Array1 = new Class160[128];
		this.aShortArray80 = new short[128];
		this.aClass4_Sub8_Sub1Array1 = new Class4_Sub8_Sub1[128];
		@Pc(38) Class4_Sub10 local38 = new Class4_Sub10(arg0);
		while (local38.aByteArray71[local9 + local38.anInt5713] != 0) {
			local9++;
		}
		@Pc(52) byte[] local52 = new byte[local9];
		@Pc(54) int local54;
		for (local54 = 0; local54 < local9; local54++) {
			local52[local54] = local38.method4674();
		}
		local9++;
		local38.anInt5713++;
		local54 = local38.anInt5713;
		local38.anInt5713 += local9;
		@Pc(88) int local88;
		for (local88 = 0; local38.aByteArray71[local38.anInt5713 + local88] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		@Pc(104) int local104;
		for (local104 = 0; local104 < local88; local104++) {
			local102[local104] = local38.method4674();
		}
		local88++;
		local38.anInt5713++;
		@Pc(125) int local125 = 0;
		local104 = local38.anInt5713;
		local38.anInt5713 += local88;
		while (local38.aByteArray71[local38.anInt5713 + local125] != 0) {
			local125++;
		}
		@Pc(149) byte[] local149 = new byte[local125];
		for (@Pc(151) int local151 = 0; local151 < local125; local151++) {
			local149[local151] = local38.method4674();
		}
		local125++;
		local38.anInt5713++;
		@Pc(173) byte[] local173 = new byte[local125];
		@Pc(182) int local182;
		@Pc(188) int local188;
		if (local125 > 1) {
			@Pc(180) int local180 = 1;
			local182 = 2;
			local173[1] = 1;
			for (local188 = 2; local188 < local125; local188++) {
				@Pc(195) int local195 = local38.method4666();
				if (local195 == 0) {
					local180 = local182++;
				} else {
					if (local180 >= local195) {
						local195--;
					}
					local180 = local195;
				}
				local173[local188] = (byte) local180;
			}
		} else {
			local182 = local125;
		}
		@Pc(228) Class160[] local228 = new Class160[local182];
		for (local188 = 0; local188 < local228.length; local188++) {
			@Pc(242) Class160 local242 = local228[local188] = new Class160();
			@Pc(246) int local246 = local38.method4666();
			if (local246 > 0) {
				local242.aByteArray65 = new byte[local246 * 2];
			}
			local246 = local38.method4666();
			if (local246 > 0) {
				local242.aByteArray64 = new byte[local246 * 2 + 2];
				local242.aByteArray64[1] = 64;
			}
		}
		local188 = local38.method4666();
		@Pc(298) byte[] local298 = local188 > 0 ? new byte[local188 * 2] : null;
		local188 = local38.method4666();
		@Pc(304) int local304 = 0;
		@Pc(314) byte[] local314 = local188 <= 0 ? null : new byte[local188 * 2];
		while (local38.aByteArray71[local304 + local38.anInt5713] != 0) {
			local304++;
		}
		@Pc(329) byte[] local329 = new byte[local304];
		@Pc(331) int local331;
		for (local331 = 0; local331 < local304; local331++) {
			local329[local331] = local38.method4674();
		}
		local38.anInt5713++;
		local304++;
		local331 = 0;
		@Pc(358) int local358;
		for (local358 = 0; local358 < 128; local358++) {
			local331 += local38.method4666();
			this.aShortArray80[local358] = (short) local331;
		}
		local331 = 0;
		for (local358 = 0; local358 < 128; local358++) {
			local331 += local38.method4666();
			this.aShortArray80[local358] = (short) (this.aShortArray80[local358] + (local331 << 8));
		}
		local358 = 0;
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		@Pc(411) int local411;
		for (local411 = 0; local411 < 128; local411++) {
			if (local358 == 0) {
				if (local407 >= local329.length) {
					local358 = -1;
				} else {
					local358 = local329[local407++];
				}
				local409 = local38.method4646();
			}
			this.aShortArray80[local411] = (short) (this.aShortArray80[local411] + ((local409 - 1 & 0x2) << 14));
			this.anIntArray458[local411] = local409;
			local358--;
		}
		local358 = 0;
		local407 = 0;
		local411 = 0;
		@Pc(471) int local471;
		for (local471 = 0; local471 < 128; local471++) {
			if (this.anIntArray458[local471] != 0) {
				if (local358 == 0) {
					local411 = local38.aByteArray71[local54++] - 1;
					if (local407 >= local52.length) {
						local358 = -1;
					} else {
						local358 = local52[local407++];
					}
				}
				this.aByteArray56[local471] = (byte) local411;
				local358--;
			}
		}
		local471 = 0;
		local407 = 0;
		local358 = 0;
		for (@Pc(527) int local527 = 0; local527 < 128; local527++) {
			if (this.anIntArray458[local527] != 0) {
				if (local358 == 0) {
					if (local102.length <= local407) {
						local358 = -1;
					} else {
						local358 = local102[local407++];
					}
					local471 = local38.aByteArray71[local104++] + 16 << 2;
				}
				this.aByteArray57[local527] = (byte) local471;
				local358--;
			}
		}
		local358 = 0;
		local407 = 0;
		@Pc(581) Class160 local581 = null;
		@Pc(583) int local583;
		for (local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray458[local583] != 0) {
				if (local358 == 0) {
					local581 = local228[local173[local407]];
					if (local149.length > local407) {
						local358 = local149[local407++];
					} else {
						local358 = -1;
					}
				}
				local358--;
				this.aClass160Array1[local583] = local581;
			}
		}
		local358 = 0;
		local407 = 0;
		local583 = 0;
		@Pc(642) int local642;
		for (local642 = 0; local642 < 128; local642++) {
			if (local358 == 0) {
				if (local329.length <= local407) {
					local358 = -1;
				} else {
					local358 = local329[local407++];
				}
				if (this.anIntArray458[local642] > 0) {
					local583 = local38.method4666() + 1;
				}
			}
			this.aByteArray58[local642] = (byte) local583;
			local358--;
		}
		this.anInt4327 = local38.method4666() + 1;
		@Pc(700) Class160 local700;
		@Pc(705) int local705;
		for (local642 = 0; local642 < local182; local642++) {
			local700 = local228[local642];
			if (local700.aByteArray65 != null) {
				for (local705 = 1; local705 < local700.aByteArray65.length; local705 += 2) {
					local700.aByteArray65[local705] = local38.method4674();
				}
			}
			if (local700.aByteArray64 != null) {
				for (local705 = 3; local705 < local700.aByteArray64.length - 2; local705 += 2) {
					local700.aByteArray64[local705] = local38.method4674();
				}
			}
		}
		if (local298 != null) {
			for (local642 = 1; local642 < local298.length; local642 += 2) {
				local298[local642] = local38.method4674();
			}
		}
		if (local314 != null) {
			for (local642 = 1; local642 < local314.length; local642 += 2) {
				local314[local642] = local38.method4674();
			}
		}
		for (local642 = 0; local642 < local182; local642++) {
			local700 = local228[local642];
			if (local700.aByteArray64 != null) {
				local331 = 0;
				for (local705 = 2; local705 < local700.aByteArray64.length; local705 += 2) {
					local331 += local38.method4666() + 1;
					local700.aByteArray64[local705] = (byte) local331;
				}
			}
		}
		for (local642 = 0; local642 < local182; local642++) {
			local700 = local228[local642];
			if (local700.aByteArray65 != null) {
				local331 = 0;
				for (local705 = 2; local705 < local700.aByteArray65.length; local705 += 2) {
					local331 = local38.method4666() + local331 + 1;
					local700.aByteArray65[local705] = (byte) local331;
				}
			}
		}
		@Pc(977) byte local977;
		@Pc(991) int local991;
		@Pc(993) int local993;
		@Pc(1004) int local1004;
		@Pc(1040) int local1040;
		@Pc(930) byte local930;
		if (local298 != null) {
			local331 = local38.method4666();
			local298[0] = (byte) local331;
			for (local642 = 2; local642 < local298.length; local642 += 2) {
				local331 = local331 + local38.method4666() + 1;
				local298[local642] = (byte) local331;
			}
			local930 = local298[0];
			@Pc(934) byte local934 = local298[1];
			for (local705 = 0; local705 < local930; local705++) {
				this.aByteArray58[local705] = (byte) (this.aByteArray58[local705] * local934 + 32 >> 6);
			}
			for (local705 = 2; local705 < local298.length; local705 += 2) {
				@Pc(973) byte local973 = local298[local705 + 1];
				local977 = local298[local705];
				local991 = (local977 - local930) / 2 + local934 * (local977 - local930);
				for (local993 = local930; local993 < local977; local993++) {
					local1004 = Static189.method3000(local977 - local930, local991);
					this.aByteArray58[local993] = (byte) (this.aByteArray58[local993] * local1004 + 32 >> 6);
					local991 += local973 - local934;
				}
				local934 = local973;
				local930 = local977;
			}
			for (local1040 = local930; local1040 < 128; local1040++) {
				this.aByteArray58[local1040] = (byte) (local934 * this.aByteArray58[local1040] + 32 >> 6);
			}
		}
		if (local314 != null) {
			local331 = local38.method4666();
			local314[0] = (byte) local331;
			for (local642 = 2; local642 < local314.length; local642 += 2) {
				local331 -= -local38.method4666() - 1;
				local314[local642] = (byte) local331;
			}
			@Pc(1103) int local1103 = local314[1] << 1;
			local930 = local314[0];
			for (local705 = 0; local705 < local930; local705++) {
				local1040 = (this.aByteArray57[local705] & 0xFF) + local1103;
				if (local1040 < 0) {
					local1040 = 0;
				}
				if (local1040 > 128) {
					local1040 = 128;
				}
				this.aByteArray57[local705] = (byte) local1040;
			}
			local705 = 2;
			@Pc(1170) int local1170;
			while (local314.length > local705) {
				local977 = local314[local705];
				local1170 = local314[local705 + 1] << 1;
				local705 += 2;
				local991 = local1103 * (local977 - local930) + (local977 - local930) / 2;
				for (local993 = local930; local993 < local977; local993++) {
					local1004 = Static189.method3000(local977 - local930, local991);
					local991 += local1170 - local1103;
					@Pc(1218) int local1218 = (this.aByteArray57[local993] & 0xFF) + local1004;
					if (local1218 < 0) {
						local1218 = 0;
					}
					if (local1218 > 128) {
						local1218 = 128;
					}
					this.aByteArray57[local993] = (byte) local1218;
				}
				local930 = local977;
				local1103 = local1170;
			}
			for (local1040 = local930; local1040 < 128; local1040++) {
				local1170 = local1103 + (this.aByteArray57[local1040] & 0xFF);
				if (local1170 < 0) {
					local1170 = 0;
				}
				if (local1170 > 128) {
					local1170 = 128;
				}
				this.aByteArray57[local1040] = (byte) local1170;
			}
		}
		for (local642 = 0; local642 < local182; local642++) {
			local228[local642].anInt4842 = local38.method4666();
		}
		for (local642 = 0; local642 < local182; local642++) {
			local700 = local228[local642];
			if (local700.aByteArray65 != null) {
				local700.anInt4843 = local38.method4666();
			}
			if (local700.aByteArray64 != null) {
				local700.anInt4849 = local38.method4666();
			}
			if (local700.anInt4842 > 0) {
				local700.anInt4840 = local38.method4666();
			}
		}
		for (local642 = 0; local642 < local182; local642++) {
			local228[local642].anInt4848 = local38.method4666();
		}
		for (local642 = 0; local642 < local182; local642++) {
			local700 = local228[local642];
			if (local700.anInt4848 > 0) {
				local700.anInt4841 = local38.method4666();
			}
		}
		for (local642 = 0; local642 < local182; local642++) {
			local700 = local228[local642];
			if (local700.anInt4841 > 0) {
				local700.anInt4846 = local38.method4666();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([ILclient!jk;I[B)Z")
	public boolean method3603(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class4_Sub8_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg2 == null || arg2[local21] != 0) {
				@Pc(40) int local40 = this.anIntArray458[local21];
				if (local40 != 0) {
					if (local40 != local17) {
						local17 = local40--;
						if ((local40 & 0x1) == 0) {
							local19 = arg1.method2062(arg0, local40 >> 2);
						} else {
							local19 = arg1.method2059(arg0, local40 >> 2);
						}
						if (local19 == null) {
							local15 = false;
						}
					}
					if (local19 != null) {
						this.aClass4_Sub8_Sub1Array1[local21] = local19;
						this.anIntArray458[local21] = 0;
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public void method3607() {
		this.anIntArray458 = null;
	}
}
