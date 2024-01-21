import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!la", name = "p", descriptor = "[S")
	public final short[] aShortArray10 = new short[128];

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[B")
	public final byte[] aByteArray31 = new byte[128];

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[Lclient!mf;")
	public final Class51[] aClass51Array1 = new Class51[128];

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[B")
	public final byte[] aByteArray32 = new byte[128];

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	public final int anInt1663;

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "[Lclient!tc;")
	public final Class3_Sub2_Sub1[] aClass3_Sub2_Sub1Array1 = new Class3_Sub2_Sub1[128];

	@OriginalMember(owner = "client!la", name = "R", descriptor = "[B")
	public final byte[] aByteArray33 = new byte[128];

	@OriginalMember(owner = "client!la", name = "X", descriptor = "[I")
	private int[] anIntArray205 = new int[128];

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
	public Class3_Sub12(@OriginalArg(0) byte[] arg0) {
		@Pc(33) int local33 = 0;
		@Pc(38) Class3_Sub7 local38 = new Class3_Sub7(arg0);
		while (local38.aByteArray15[local33 + local38.anInt964] != 0) {
			local33++;
		}
		@Pc(52) byte[] local52 = new byte[local33];
		for (@Pc(54) int local54 = 0; local54 < local33; local54++) {
			local52[local54] = local38.method624();
		}
		local33++;
		local38.anInt964++;
		@Pc(76) int local76 = local38.anInt964;
		@Pc(78) int local78 = 0;
		local38.anInt964 += local33;
		while (local38.aByteArray15[local78 + local38.anInt964] != 0) {
			local78++;
		}
		@Pc(98) byte[] local98 = new byte[local78];
		for (@Pc(100) int local100 = 0; local100 < local78; local100++) {
			local98[local100] = local38.method624();
		}
		local78++;
		local38.anInt964++;
		@Pc(126) int local126 = local38.anInt964;
		@Pc(128) int local128 = 0;
		local38.anInt964 += local78;
		while (local38.aByteArray15[local38.anInt964 + local128] != 0) {
			local128++;
		}
		@Pc(148) byte[] local148 = new byte[local128];
		for (@Pc(150) int local150 = 0; local150 < local128; local150++) {
			local148[local150] = local38.method624();
		}
		local38.anInt964++;
		local128++;
		@Pc(176) byte[] local176 = new byte[local128];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local128 <= 1) {
			local183 = local128;
		} else {
			local183 = 2;
			@Pc(189) int local189 = 1;
			local176[1] = 1;
			for (local195 = 2; local195 < local128; local195++) {
				local201 = local38.method647();
				if (local201 == 0) {
					local189 = local183++;
				} else {
					if (local201 <= local189) {
						local201--;
					}
					local189 = local201;
				}
				local176[local195] = (byte) local189;
			}
		}
		@Pc(230) Class51[] local230 = new Class51[local183];
		for (local195 = 0; local195 < local230.length; local195++) {
			@Pc(242) Class51 local242 = local230[local195] = new Class51();
			@Pc(246) int local246 = local38.method647();
			if (local246 > 0) {
				local242.aByteArray42 = new byte[local246 * 2];
			}
			local246 = local38.method647();
			if (local246 > 0) {
				local242.aByteArray41 = new byte[local246 * 2 + 2];
				local242.aByteArray41[1] = 64;
			}
		}
		local201 = local38.method647();
		@Pc(297) byte[] local297 = local201 > 0 ? new byte[local201 * 2] : null;
		local201 = local38.method647();
		@Pc(310) byte[] local310 = local201 > 0 ? new byte[local201 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local38.aByteArray15[local38.anInt964 + local312] != 0; local312++) {
		}
		@Pc(330) byte[] local330 = new byte[local312];
		for (@Pc(332) int local332 = 0; local332 < local312; local332++) {
			local330[local332] = local38.method624();
		}
		@Pc(350) int local350 = 0;
		local38.anInt964++;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local350 += local38.method647();
			this.aShortArray10[local358] = (short) local350;
		}
		local312++;
		local350 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local350 += local38.method647();
			this.aShortArray10[local381] = (short) (this.aShortArray10[local381] + (local350 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local410 >= local330.length) {
					local408 = -1;
				} else {
					local408 = local330[local410++];
				}
				local412 = local38.method608();
			}
			local408--;
			this.aShortArray10[local414] = (short) (this.aShortArray10[local414] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray205[local414] = local412;
		}
		local410 = 0;
		local408 = 0;
		@Pc(473) int local473 = 0;
		for (@Pc(475) int local475 = 0; local475 < 128; local475++) {
			if (this.anIntArray205[local475] != 0) {
				if (local408 == 0) {
					if (local410 >= local52.length) {
						local408 = -1;
					} else {
						local408 = local52[local410++];
					}
					local473 = local38.aByteArray15[local76++] - 1;
				}
				local408--;
				this.aByteArray32[local475] = (byte) local473;
			}
		}
		local410 = 0;
		@Pc(530) int local530 = 0;
		local408 = 0;
		for (@Pc(534) int local534 = 0; local534 < 128; local534++) {
			if (this.anIntArray205[local534] != 0) {
				if (local408 == 0) {
					local530 = local38.aByteArray15[local126++] + 16 << 2;
					if (local98.length > local410) {
						local408 = local98[local410++];
					} else {
						local408 = -1;
					}
				}
				this.aByteArray33[local534] = (byte) local530;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(589) Class51 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray205[local591] != 0) {
				if (local408 == 0) {
					local589 = local230[local176[local410]];
					if (local410 >= local148.length) {
						local408 = -1;
					} else {
						local408 = local148[local410++];
					}
				}
				this.aClass51Array1[local591] = local589;
				local408--;
			}
		}
		local410 = 0;
		local408 = 0;
		@Pc(639) int local639 = 0;
		for (@Pc(641) int local641 = 0; local641 < 128; local641++) {
			if (local408 == 0) {
				if (local410 >= local330.length) {
					local408 = -1;
				} else {
					local408 = local330[local410++];
				}
				if (this.anIntArray205[local641] > 0) {
					local639 = local38.method647() + 1;
				}
			}
			this.aByteArray31[local641] = (byte) local639;
			local408--;
		}
		this.anInt1663 = local38.method647() + 1;
		@Pc(706) int local706;
		for (@Pc(695) int local695 = 0; local695 < local183; local695++) {
			@Pc(701) Class51 local701 = local230[local695];
			if (local701.aByteArray42 != null) {
				for (local706 = 1; local706 < local701.aByteArray42.length; local706 += 2) {
					local701.aByteArray42[local706] = local38.method624();
				}
			}
			if (local701.aByteArray41 != null) {
				for (local706 = 3; local706 < local701.aByteArray41.length - 2; local706 += 2) {
					local701.aByteArray41[local706] = local38.method624();
				}
			}
		}
		@Pc(755) int local755;
		if (local297 != null) {
			for (local755 = 1; local755 < local297.length; local755 += 2) {
				local297[local755] = local38.method624();
			}
		}
		if (local310 != null) {
			for (local755 = 1; local755 < local310.length; local755 += 2) {
				local310[local755] = local38.method624();
			}
		}
		@Pc(808) int local808;
		for (local755 = 0; local755 < local183; local755++) {
			@Pc(801) Class51 local801 = local230[local755];
			if (local801.aByteArray41 != null) {
				local350 = 0;
				for (local808 = 2; local808 < local801.aByteArray41.length; local808 += 2) {
					local350 = local38.method647() + local350 + 1;
					local801.aByteArray41[local808] = (byte) local350;
				}
			}
		}
		@Pc(849) int local849;
		for (local706 = 0; local706 < local183; local706++) {
			@Pc(842) Class51 local842 = local230[local706];
			if (local842.aByteArray42 != null) {
				local350 = 0;
				for (local849 = 2; local849 < local842.aByteArray42.length; local849 += 2) {
					local350 = local350 + local38.method647() + 1;
					local842.aByteArray42[local849] = (byte) local350;
				}
			}
		}
		@Pc(927) int local927;
		@Pc(950) int local950;
		@Pc(956) byte local956;
		@Pc(977) int local977;
		@Pc(979) int local979;
		@Pc(989) int local989;
		@Pc(921) byte local921;
		@Pc(1029) int local1029;
		if (local297 != null) {
			local350 = local38.method647();
			local297[0] = (byte) local350;
			for (local808 = 2; local808 < local297.length; local808 += 2) {
				local350 = local350 + local38.method647() + 1;
				local297[local808] = (byte) local350;
			}
			local921 = local297[0];
			@Pc(925) byte local925 = local297[1];
			for (local927 = 0; local927 < local921; local927++) {
				this.aByteArray31[local927] = (byte) (local925 * this.aByteArray31[local927] + 32 >> 6);
			}
			local950 = 2;
			while (local297.length > local950) {
				local956 = local297[local950];
				@Pc(962) byte local962 = local297[local950 + 1];
				local950 += 2;
				local977 = (local956 - local921) / 2 + local925 * (local956 - local921);
				for (local979 = local921; local979 < local956; local979++) {
					local989 = Static95.method1569(local977, local956 - local921);
					this.aByteArray31[local979] = (byte) (local989 * this.aByteArray31[local979] + 32 >> 6);
					local977 += local962 - local925;
				}
				local925 = local962;
				local921 = local956;
			}
			for (local1029 = local921; local1029 < 128; local1029++) {
				this.aByteArray31[local1029] = (byte) (this.aByteArray31[local1029] * local925 + 32 >> 6);
			}
		}
		@Pc(1101) int local1101;
		if (local310 != null) {
			local350 = local38.method647();
			local310[0] = (byte) local350;
			for (local808 = 2; local808 < local310.length; local808 += 2) {
				local350 = local350 + local38.method647() + 1;
				local310[local808] = (byte) local350;
			}
			local921 = local310[0];
			local1101 = local310[1] << 1;
			for (local927 = 0; local927 < local921; local927++) {
				local950 = (this.aByteArray33[local927] & 0xFF) + local1101;
				if (local950 < 0) {
					local950 = 0;
				}
				if (local950 > 128) {
					local950 = 128;
				}
				this.aByteArray33[local927] = (byte) local950;
			}
			local950 = 2;
			@Pc(1156) int local1156;
			while (local950 < local310.length) {
				local956 = local310[local950];
				local1156 = local310[local950 + 1] << 1;
				local950 += 2;
				local977 = (local956 - local921) / 2 + local1101 * (local956 - local921);
				for (local979 = local921; local979 < local956; local979++) {
					local989 = Static95.method1569(local977, local956 - local921);
					@Pc(1191) int local1191 = local989 + (this.aByteArray33[local979] & 0xFF);
					local977 += local1156 - local1101;
					if (local1191 < 0) {
						local1191 = 0;
					}
					if (local1191 > 128) {
						local1191 = 128;
					}
					this.aByteArray33[local979] = (byte) local1191;
				}
				local1101 = local1156;
				local921 = local956;
			}
			for (local1029 = local921; local1029 < 128; local1029++) {
				local1156 = (this.aByteArray33[local1029] & 0xFF) + local1101;
				if (local1156 < 0) {
					local1156 = 0;
				}
				if (local1156 > 128) {
					local1156 = 128;
				}
				this.aByteArray33[local1029] = (byte) local1156;
			}
		}
		for (local808 = 0; local808 < local183; local808++) {
			local230[local808].anInt1850 = local38.method647();
		}
		for (local849 = 0; local849 < local183; local849++) {
			@Pc(1292) Class51 local1292 = local230[local849];
			if (local1292.aByteArray42 != null) {
				local1292.anInt1866 = local38.method647();
			}
			if (local1292.aByteArray41 != null) {
				local1292.anInt1855 = local38.method647();
			}
			if (local1292.anInt1850 > 0) {
				local1292.anInt1858 = local38.method647();
			}
		}
		for (local1101 = 0; local1101 < local183; local1101++) {
			local230[local1101].anInt1860 = local38.method647();
		}
		for (local927 = 0; local927 < local183; local927++) {
			@Pc(1347) Class51 local1347 = local230[local927];
			if (local1347.anInt1860 > 0) {
				local1347.anInt1852 = local38.method647();
			}
		}
		for (local950 = 0; local950 < local183; local950++) {
			@Pc(1367) Class51 local1367 = local230[local950];
			if (local1367.anInt1852 > 0) {
				local1367.anInt1864 = local38.method647();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	public void method1131() {
		this.anIntArray205 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([BLclient!rd;[IB)Z")
	public boolean method1133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class3_Sub2_Sub1 local11 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg0 == null || arg0[local21] != 0) {
				@Pc(33) int local33 = this.anIntArray205[local21];
				if (local33 != 0) {
					if (local9 != local33) {
						local9 = local33--;
						if ((local33 & 0x1) == 0) {
							local11 = arg1.method1647(arg2, local33 >> 2);
						} else {
							local11 = arg1.method1640(arg2, local33 >> 2);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass3_Sub2_Sub1Array1[local21] = local11;
						this.anIntArray205[local21] = 0;
					}
				}
			}
		}
		return local7;
	}
}
