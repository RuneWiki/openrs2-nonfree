import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!so", name = "l", descriptor = "[Lclient!ve;")
	public Class1_Sub15_Sub1[] aClass1_Sub15_Sub1Array1;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "[I")
	private int[] anIntArray483;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	public int anInt5810;

	@OriginalMember(owner = "client!so", name = "t", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "[Lclient!qq;")
	public Class173[] aClass173Array1;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	private Class1_Sub33() {
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "([B)V")
	public Class1_Sub33(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub15_Sub1Array1 = new Class1_Sub15_Sub1[128];
		this.anIntArray483 = new int[128];
		this.aShortArray114 = new short[128];
		this.aByteArray90 = new byte[128];
		this.aByteArray89 = new byte[128];
		this.aClass173Array1 = new Class173[128];
		this.aByteArray88 = new byte[128];
		@Pc(36) Class1_Sub8 local36 = new Class1_Sub8(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray81[local38 + local36.anInt5182] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method4558();
		}
		local36.anInt5182++;
		local38++;
		@Pc(83) int local83 = local36.anInt5182;
		local36.anInt5182 += local38;
		@Pc(91) int local91;
		for (local91 = 0; local36.aByteArray81[local36.anInt5182 + local91] != 0; local91++) {
		}
		@Pc(106) byte[] local106 = new byte[local91];
		for (@Pc(108) int local108 = 0; local108 < local91; local108++) {
			local106[local108] = local36.method4558();
		}
		local91++;
		local36.anInt5182++;
		@Pc(134) int local134 = local36.anInt5182;
		local36.anInt5182 += local91;
		@Pc(142) int local142;
		for (local142 = 0; local36.aByteArray81[local36.anInt5182 + local142] != 0; local142++) {
		}
		@Pc(157) byte[] local157 = new byte[local142];
		for (@Pc(159) int local159 = 0; local159 < local142; local159++) {
			local157[local159] = local36.method4558();
		}
		local36.anInt5182++;
		local142++;
		@Pc(181) byte[] local181 = new byte[local142];
		@Pc(192) int local192;
		@Pc(194) int local194;
		@Pc(200) int local200;
		if (local142 > 1) {
			local181[1] = 1;
			@Pc(190) int local190 = 1;
			local192 = 2;
			for (local194 = 2; local194 < local142; local194++) {
				local200 = local36.method4532();
				if (local200 == 0) {
					local190 = local192++;
				} else {
					if (local190 >= local200) {
						local200--;
					}
					local190 = local200;
				}
				local181[local194] = (byte) local190;
			}
		} else {
			local192 = local142;
		}
		@Pc(233) Class173[] local233 = new Class173[local192];
		for (local194 = 0; local194 < local233.length; local194++) {
			@Pc(245) Class173 local245 = local233[local194] = new Class173();
			@Pc(249) int local249 = local36.method4532();
			if (local249 > 0) {
				local245.aByteArray83 = new byte[local249 * 2];
			}
			local249 = local36.method4532();
			if (local249 > 0) {
				local245.aByteArray82 = new byte[local249 * 2 + 2];
				local245.aByteArray82[1] = 64;
			}
		}
		local200 = local36.method4532();
		@Pc(304) byte[] local304 = local200 > 0 ? new byte[local200 * 2] : null;
		local200 = local36.method4532();
		@Pc(317) byte[] local317 = local200 <= 0 ? null : new byte[local200 * 2];
		@Pc(319) int local319;
		for (local319 = 0; local36.aByteArray81[local36.anInt5182 + local319] != 0; local319++) {
		}
		@Pc(336) byte[] local336 = new byte[local319];
		for (@Pc(338) int local338 = 0; local338 < local319; local338++) {
			local336[local338] = local36.method4558();
		}
		local36.anInt5182++;
		local319++;
		@Pc(363) int local363 = 0;
		for (@Pc(365) int local365 = 0; local365 < 128; local365++) {
			local363 += local36.method4532();
			this.aShortArray114[local365] = (short) local363;
		}
		local363 = 0;
		for (@Pc(387) int local387 = 0; local387 < 128; local387++) {
			local363 += local36.method4532();
			this.aShortArray114[local387] = (short) (this.aShortArray114[local387] + (local363 << 8));
		}
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		@Pc(416) int local416 = 0;
		for (@Pc(418) int local418 = 0; local418 < 128; local418++) {
			if (local412 == 0) {
				if (local414 < local336.length) {
					local412 = local336[local414++];
				} else {
					local412 = -1;
				}
				local416 = local36.method4535();
			}
			this.aShortArray114[local418] = (short) (this.aShortArray114[local418] + ((local416 - 1 & 0x2) << 14));
			this.anIntArray483[local418] = local416;
			local412--;
		}
		local412 = 0;
		local414 = 0;
		@Pc(477) int local477 = 0;
		for (@Pc(479) int local479 = 0; local479 < 128; local479++) {
			if (this.anIntArray483[local479] != 0) {
				if (local412 == 0) {
					if (local414 >= local55.length) {
						local412 = -1;
					} else {
						local412 = local55[local414++];
					}
					local477 = local36.aByteArray81[local83++] - 1;
				}
				local412--;
				this.aByteArray90[local479] = (byte) local477;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(531) int local531 = 0;
		for (@Pc(533) int local533 = 0; local533 < 128; local533++) {
			if (this.anIntArray483[local533] != 0) {
				if (local412 == 0) {
					if (local106.length <= local414) {
						local412 = -1;
					} else {
						local412 = local106[local414++];
					}
					local531 = local36.aByteArray81[local134++] + 16 << 2;
				}
				this.aByteArray89[local533] = (byte) local531;
				local412--;
			}
		}
		local414 = 0;
		local412 = 0;
		@Pc(587) Class173 local587 = null;
		for (@Pc(589) int local589 = 0; local589 < 128; local589++) {
			if (this.anIntArray483[local589] != 0) {
				if (local412 == 0) {
					local587 = local233[local181[local414]];
					if (local157.length > local414) {
						local412 = local157[local414++];
					} else {
						local412 = -1;
					}
				}
				local412--;
				this.aClass173Array1[local589] = local587;
			}
		}
		local412 = 0;
		local414 = 0;
		@Pc(642) int local642 = 0;
		for (@Pc(644) int local644 = 0; local644 < 128; local644++) {
			if (local412 == 0) {
				if (local414 >= local336.length) {
					local412 = -1;
				} else {
					local412 = local336[local414++];
				}
				if (this.anIntArray483[local644] > 0) {
					local642 = local36.method4532() + 1;
				}
			}
			this.aByteArray88[local644] = (byte) local642;
			local412--;
		}
		this.anInt5810 = local36.method4532() + 1;
		@Pc(707) int local707;
		for (@Pc(696) int local696 = 0; local696 < local192; local696++) {
			@Pc(702) Class173 local702 = local233[local696];
			if (local702.aByteArray83 != null) {
				for (local707 = 1; local707 < local702.aByteArray83.length; local707 += 2) {
					local702.aByteArray83[local707] = local36.method4558();
				}
			}
			if (local702.aByteArray82 != null) {
				for (local707 = 3; local707 < local702.aByteArray82.length - 2; local707 += 2) {
					local702.aByteArray82[local707] = local36.method4558();
				}
			}
		}
		@Pc(752) int local752;
		if (local304 != null) {
			for (local752 = 1; local752 < local304.length; local752 += 2) {
				local304[local752] = local36.method4558();
			}
		}
		if (local317 != null) {
			for (local752 = 1; local752 < local317.length; local752 += 2) {
				local317[local752] = local36.method4558();
			}
		}
		@Pc(797) int local797;
		for (local752 = 0; local752 < local192; local752++) {
			@Pc(790) Class173 local790 = local233[local752];
			if (local790.aByteArray82 != null) {
				local363 = 0;
				for (local797 = 2; local797 < local790.aByteArray82.length; local797 += 2) {
					local363 = local363 + local36.method4532() + 1;
					local790.aByteArray82[local797] = (byte) local363;
				}
			}
		}
		@Pc(838) int local838;
		for (local707 = 0; local707 < local192; local707++) {
			@Pc(831) Class173 local831 = local233[local707];
			if (local831.aByteArray83 != null) {
				local363 = 0;
				for (local838 = 2; local838 < local831.aByteArray83.length; local838 += 2) {
					local363 += local36.method4532() + 1;
					local831.aByteArray83[local838] = (byte) local363;
				}
			}
		}
		@Pc(919) int local919;
		@Pc(942) int local942;
		@Pc(948) byte local948;
		@Pc(967) int local967;
		@Pc(969) int local969;
		@Pc(978) int local978;
		@Pc(913) byte local913;
		@Pc(1019) int local1019;
		if (local304 != null) {
			local363 = local36.method4532();
			local304[0] = (byte) local363;
			for (local797 = 2; local797 < local304.length; local797 += 2) {
				local363 = local363 + local36.method4532() + 1;
				local304[local797] = (byte) local363;
			}
			local913 = local304[0];
			@Pc(917) byte local917 = local304[1];
			for (local919 = 0; local919 < local913; local919++) {
				this.aByteArray88[local919] = (byte) (this.aByteArray88[local919] * local917 + 32 >> 6);
			}
			for (local942 = 2; local942 < local304.length; local942 += 2) {
				local948 = local304[local942];
				@Pc(954) byte local954 = local304[local942 + 1];
				local967 = (local948 - local913) * local917 + (local948 - local913) / 2;
				for (local969 = local913; local969 < local948; local969++) {
					local978 = Static81.method4489(local948 - local913, local967);
					local967 += local954 - local917;
					this.aByteArray88[local969] = (byte) (local978 * this.aByteArray88[local969] + 32 >> 6);
				}
				local917 = local954;
				local913 = local948;
			}
			for (local1019 = local913; local1019 < 128; local1019++) {
				this.aByteArray88[local1019] = (byte) (local917 * this.aByteArray88[local1019] + 32 >> 6);
			}
		}
		@Pc(1085) int local1085;
		if (local317 != null) {
			local363 = local36.method4532();
			local317[0] = (byte) local363;
			for (local797 = 2; local797 < local317.length; local797 += 2) {
				local363 = local36.method4532() + local363 + 1;
				local317[local797] = (byte) local363;
			}
			local913 = local317[0];
			local1085 = local317[1] << 1;
			for (local919 = 0; local919 < local913; local919++) {
				local942 = (this.aByteArray89[local919] & 0xFF) + local1085;
				if (local942 < 0) {
					local942 = 0;
				}
				if (local942 > 128) {
					local942 = 128;
				}
				this.aByteArray89[local919] = (byte) local942;
			}
			local942 = 2;
			@Pc(1136) int local1136;
			while (local942 < local317.length) {
				local948 = local317[local942];
				local1136 = local317[local942 + 1] << 1;
				local967 = (local948 - local913) * local1085 + (local948 - local913) / 2;
				for (local969 = local913; local969 < local948; local969++) {
					local978 = Static81.method4489(local948 - local913, local967);
					@Pc(1172) int local1172 = (this.aByteArray89[local969] & 0xFF) + local978;
					if (local1172 < 0) {
						local1172 = 0;
					}
					if (local1172 > 128) {
						local1172 = 128;
					}
					this.aByteArray89[local969] = (byte) local1172;
					local967 += local1136 - local1085;
				}
				local1085 = local1136;
				local942 += 2;
				local913 = local948;
			}
			for (local1019 = local913; local1019 < 128; local1019++) {
				local1136 = (this.aByteArray89[local1019] & 0xFF) + local1085;
				if (local1136 < 0) {
					local1136 = 0;
				}
				if (local1136 > 128) {
					local1136 = 128;
				}
				this.aByteArray89[local1019] = (byte) local1136;
			}
		}
		for (local797 = 0; local797 < local192; local797++) {
			local233[local797].anInt5357 = local36.method4532();
		}
		for (local838 = 0; local838 < local192; local838++) {
			@Pc(1274) Class173 local1274 = local233[local838];
			if (local1274.aByteArray83 != null) {
				local1274.anInt5356 = local36.method4532();
			}
			if (local1274.aByteArray82 != null) {
				local1274.anInt5359 = local36.method4532();
			}
			if (local1274.anInt5357 > 0) {
				local1274.anInt5353 = local36.method4532();
			}
		}
		for (local1085 = 0; local1085 < local192; local1085++) {
			local233[local1085].anInt5351 = local36.method4532();
		}
		for (local919 = 0; local919 < local192; local919++) {
			@Pc(1328) Class173 local1328 = local233[local919];
			if (local1328.anInt5351 > 0) {
				local1328.anInt5354 = local36.method4532();
			}
		}
		for (local942 = 0; local942 < local192; local942++) {
			@Pc(1348) Class173 local1348 = local233[local942];
			if (local1348.anInt5354 > 0) {
				local1348.anInt5360 = local36.method4532();
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V")
	public void method4968() {
		this.anIntArray483 = null;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([IB[BLclient!jm;)Z")
	public boolean method4972(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class107 arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class1_Sub15_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(36) int local36 = this.anIntArray483[local21];
				if (local36 != 0) {
					if (local17 != local36) {
						local17 = local36--;
						if ((local36 & 0x1) == 0) {
							local19 = arg2.method2877(arg0, local36 >> 2);
						} else {
							local19 = arg2.method2873(local36 >> 2, arg0);
						}
						if (local19 == null) {
							local15 = false;
						}
					}
					if (local19 != null) {
						this.aClass1_Sub15_Sub1Array1[local21] = local19;
						this.anIntArray483[local21] = 0;
					}
				}
			}
		}
		return local15;
	}
}
