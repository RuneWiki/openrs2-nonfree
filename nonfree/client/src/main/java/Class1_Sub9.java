import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "[Lclient!be;")
	public Class13[] aClass13Array1 = new Class13[128];

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "[B")
	public byte[] aByteArray11 = new byte[128];

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "[B")
	public byte[] aByteArray12 = new byte[128];

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "[B")
	public byte[] aByteArray13 = new byte[128];

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "[Lclient!oh;")
	public Class1_Sub6_Sub1[] aClass1_Sub6_Sub1Array1 = new Class1_Sub6_Sub1[128];

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	public int anInt1276;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[S")
	public short[] aShortArray8 = new short[128];

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub9(@OriginalArg(0) byte[] arg0) {
		@Pc(29) int local29 = 0;
		this.anIntArray80 = new int[128];
		@Pc(38) Class1_Sub16 local38 = new Class1_Sub16(arg0);
		while (local38.aByteArray62[local29 + local38.anInt4860] != 0) {
			local29++;
		}
		@Pc(52) byte[] local52 = new byte[local29];
		for (@Pc(54) int local54 = 0; local54 < local29; local54++) {
			local52[local54] = local38.method3802();
		}
		local38.anInt4860++;
		local29++;
		@Pc(80) int local80 = local38.anInt4860;
		local38.anInt4860 += local29;
		@Pc(88) int local88;
		for (local88 = 0; local38.aByteArray62[local88 + local38.anInt4860] != 0; local88++) {
		}
		@Pc(102) byte[] local102 = new byte[local88];
		for (@Pc(104) int local104 = 0; local104 < local88; local104++) {
			local102[local104] = local38.method3802();
		}
		local38.anInt4860++;
		local88++;
		@Pc(130) int local130 = local38.anInt4860;
		@Pc(132) int local132 = 0;
		local38.anInt4860 += local88;
		while (local38.aByteArray62[local132 + local38.anInt4860] != 0) {
			local132++;
		}
		@Pc(152) byte[] local152 = new byte[local132];
		for (@Pc(154) int local154 = 0; local154 < local132; local154++) {
			local152[local154] = local38.method3802();
		}
		local38.anInt4860++;
		local132++;
		@Pc(180) byte[] local180 = new byte[local132];
		@Pc(189) int local189;
		@Pc(193) int local193;
		@Pc(199) int local199;
		if (local132 > 1) {
			local180[1] = 1;
			local189 = 2;
			@Pc(191) int local191 = 1;
			for (local193 = 2; local193 < local132; local193++) {
				local199 = local38.method3793();
				if (local199 == 0) {
					local191 = local189++;
				} else {
					if (local191 >= local199) {
						local199--;
					}
					local191 = local199;
				}
				local180[local193] = (byte) local191;
			}
		} else {
			local189 = local132;
		}
		@Pc(232) Class13[] local232 = new Class13[local189];
		for (local193 = 0; local193 < local232.length; local193++) {
			@Pc(244) Class13 local244 = local232[local193] = new Class13();
			@Pc(248) int local248 = local38.method3793();
			if (local248 > 0) {
				local244.aByteArray6 = new byte[local248 * 2];
			}
			local248 = local38.method3793();
			if (local248 > 0) {
				local244.aByteArray7 = new byte[local248 * 2 + 2];
				local244.aByteArray7[1] = 64;
			}
		}
		local199 = local38.method3793();
		@Pc(297) byte[] local297 = local199 <= 0 ? null : new byte[local199 * 2];
		local199 = local38.method3793();
		@Pc(310) byte[] local310 = local199 > 0 ? new byte[local199 * 2] : null;
		@Pc(312) int local312;
		for (local312 = 0; local38.aByteArray62[local312 + local38.anInt4860] != 0; local312++) {
		}
		@Pc(329) byte[] local329 = new byte[local312];
		for (@Pc(331) int local331 = 0; local331 < local312; local331++) {
			local329[local331] = local38.method3802();
		}
		local312++;
		local38.anInt4860++;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local38.method3793();
			this.aShortArray8[local358] = (short) local356;
		}
		local356 = 0;
		for (@Pc(382) int local382 = 0; local382 < 128; local382++) {
			local356 += local38.method3793();
			this.aShortArray8[local382] = (short) (this.aShortArray8[local382] + (local356 << 8));
		}
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		for (@Pc(413) int local413 = 0; local413 < 128; local413++) {
			if (local409 == 0) {
				if (local329.length > local407) {
					local409 = local329[local407++];
				} else {
					local409 = -1;
				}
				local411 = local38.method3773();
			}
			this.aShortArray8[local413] = (short) (this.aShortArray8[local413] + ((local411 - 1 & 0x2) << 14));
			this.anIntArray80[local413] = local411;
			local409--;
		}
		local407 = 0;
		@Pc(472) int local472 = 0;
		local409 = 0;
		for (@Pc(476) int local476 = 0; local476 < 128; local476++) {
			if (this.anIntArray80[local476] != 0) {
				if (local409 == 0) {
					if (local407 >= local52.length) {
						local409 = -1;
					} else {
						local409 = local52[local407++];
					}
					local472 = local38.aByteArray62[local80++] - 1;
				}
				local409--;
				this.aByteArray12[local476] = (byte) local472;
			}
		}
		@Pc(522) int local522 = 0;
		local409 = 0;
		local407 = 0;
		for (@Pc(528) int local528 = 0; local528 < 128; local528++) {
			if (this.anIntArray80[local528] != 0) {
				if (local409 == 0) {
					local522 = local38.aByteArray62[local130++] + 16 << 2;
					if (local102.length > local407) {
						local409 = local102[local407++];
					} else {
						local409 = -1;
					}
				}
				local409--;
				this.aByteArray13[local528] = (byte) local522;
			}
		}
		local409 = 0;
		local407 = 0;
		@Pc(580) Class13 local580 = null;
		for (@Pc(582) int local582 = 0; local582 < 128; local582++) {
			if (this.anIntArray80[local582] != 0) {
				if (local409 == 0) {
					local580 = local232[local180[local407]];
					if (local407 >= local152.length) {
						local409 = -1;
					} else {
						local409 = local152[local407++];
					}
				}
				this.aClass13Array1[local582] = local580;
				local409--;
			}
		}
		@Pc(630) int local630 = 0;
		local409 = 0;
		local407 = 0;
		for (@Pc(636) int local636 = 0; local636 < 128; local636++) {
			if (local409 == 0) {
				if (local329.length > local407) {
					local409 = local329[local407++];
				} else {
					local409 = -1;
				}
				if (this.anIntArray80[local636] > 0) {
					local630 = local38.method3793() + 1;
				}
			}
			this.aByteArray11[local636] = (byte) local630;
			local409--;
		}
		this.anInt1276 = local38.method3793() + 1;
		@Pc(697) int local697;
		for (@Pc(686) int local686 = 0; local686 < local189; local686++) {
			@Pc(692) Class13 local692 = local232[local686];
			if (local692.aByteArray6 != null) {
				for (local697 = 1; local697 < local692.aByteArray6.length; local697 += 2) {
					local692.aByteArray6[local697] = local38.method3802();
				}
			}
			if (local692.aByteArray7 != null) {
				for (local697 = 3; local697 < local692.aByteArray7.length - 2; local697 += 2) {
					local692.aByteArray7[local697] = local38.method3802();
				}
			}
		}
		@Pc(746) int local746;
		if (local297 != null) {
			for (local746 = 1; local746 < local297.length; local746 += 2) {
				local297[local746] = local38.method3802();
			}
		}
		if (local310 != null) {
			for (local746 = 1; local746 < local310.length; local746 += 2) {
				local310[local746] = local38.method3802();
			}
		}
		@Pc(799) int local799;
		for (local746 = 0; local746 < local189; local746++) {
			@Pc(792) Class13 local792 = local232[local746];
			if (local792.aByteArray7 != null) {
				local356 = 0;
				for (local799 = 2; local799 < local792.aByteArray7.length; local799 += 2) {
					local356 = local38.method3793() + local356 + 1;
					local792.aByteArray7[local799] = (byte) local356;
				}
			}
		}
		@Pc(840) int local840;
		for (local697 = 0; local697 < local189; local697++) {
			@Pc(833) Class13 local833 = local232[local697];
			if (local833.aByteArray6 != null) {
				local356 = 0;
				for (local840 = 2; local840 < local833.aByteArray6.length; local840 += 2) {
					local356 = local356 + local38.method3793() + 1;
					local833.aByteArray6[local840] = (byte) local356;
				}
			}
		}
		@Pc(918) int local918;
		@Pc(945) int local945;
		@Pc(951) byte local951;
		@Pc(965) int local965;
		@Pc(974) int local974;
		@Pc(984) int local984;
		@Pc(916) byte local916;
		@Pc(1023) int local1023;
		if (local297 != null) {
			local356 = local38.method3793();
			local297[0] = (byte) local356;
			for (local799 = 2; local799 < local297.length; local799 += 2) {
				local356 += local38.method3793() + 1;
				local297[local799] = (byte) local356;
			}
			@Pc(912) byte local912 = local297[1];
			local916 = local297[0];
			for (local918 = 0; local918 < local916; local918++) {
				this.aByteArray11[local918] = (byte) (this.aByteArray11[local918] * local912 + 32 >> 6);
			}
			local945 = 2;
			while (local297.length > local945) {
				local951 = local297[local945];
				local965 = (local951 - local916) / 2 + local912 * (local951 - local916);
				@Pc(971) byte local971 = local297[local945 + 1];
				local945 += 2;
				for (local974 = local916; local974 < local951; local974++) {
					local984 = Static11.method167(local965, local951 - local916);
					local965 += local971 - local912;
					this.aByteArray11[local974] = (byte) (this.aByteArray11[local974] * local984 + 32 >> 6);
				}
				local916 = local951;
				local912 = local971;
			}
			for (local1023 = local916; local1023 < 128; local1023++) {
				this.aByteArray11[local1023] = (byte) (local912 * this.aByteArray11[local1023] + 32 >> 6);
			}
		}
		@Pc(1089) int local1089;
		if (local310 != null) {
			local356 = local38.method3793();
			local310[0] = (byte) local356;
			for (local799 = 2; local799 < local310.length; local799 += 2) {
				local356 -= -local38.method3793() - 1;
				local310[local799] = (byte) local356;
			}
			local1089 = local310[1] << 1;
			local916 = local310[0];
			for (local918 = 0; local918 < local916; local918++) {
				local945 = (this.aByteArray13[local918] & 0xFF) + local1089;
				if (local945 < 0) {
					local945 = 0;
				}
				if (local945 > 128) {
					local945 = 128;
				}
				this.aByteArray13[local918] = (byte) local945;
			}
			local945 = 2;
			@Pc(1147) int local1147;
			while (local310.length > local945) {
				local951 = local310[local945];
				local1147 = local310[local945 + 1] << 1;
				local945 += 2;
				local965 = local1089 * (local951 - local916) + (local951 - local916) / 2;
				for (local974 = local916; local974 < local951; local974++) {
					local984 = Static11.method167(local965, local951 - local916);
					local965 += local1147 - local1089;
					@Pc(1190) int local1190 = (this.aByteArray13[local974] & 0xFF) + local984;
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					this.aByteArray13[local974] = (byte) local1190;
				}
				local1089 = local1147;
				local916 = local951;
			}
			for (local1023 = local916; local1023 < 128; local1023++) {
				local1147 = local1089 + (this.aByteArray13[local1023] & 0xFF);
				if (local1147 < 0) {
					local1147 = 0;
				}
				if (local1147 > 128) {
					local1147 = 128;
				}
				this.aByteArray13[local1023] = (byte) local1147;
			}
		}
		for (local799 = 0; local799 < local189; local799++) {
			local232[local799].anInt390 = local38.method3793();
		}
		for (local840 = 0; local840 < local189; local840++) {
			@Pc(1289) Class13 local1289 = local232[local840];
			if (local1289.aByteArray6 != null) {
				local1289.anInt378 = local38.method3793();
			}
			if (local1289.aByteArray7 != null) {
				local1289.anInt380 = local38.method3793();
			}
			if (local1289.anInt390 > 0) {
				local1289.anInt377 = local38.method3793();
			}
		}
		for (local1089 = 0; local1089 < local189; local1089++) {
			local232[local1089].anInt381 = local38.method3793();
		}
		for (local918 = 0; local918 < local189; local918++) {
			@Pc(1344) Class13 local1344 = local232[local918];
			if (local1344.anInt381 > 0) {
				local1344.anInt389 = local38.method3793();
			}
		}
		for (local945 = 0; local945 < local189; local945++) {
			@Pc(1368) Class13 local1368 = local232[local945];
			if (local1368.anInt389 > 0) {
				local1368.anInt382 = local38.method3793();
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
	public void method953() {
		this.anIntArray80 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([IB[BLclient!pi;)Z")
	public boolean method956(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class88 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(5) int local5 = 0;
		@Pc(16) Class1_Sub6_Sub1 local16 = null;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray80[local18];
				if (local33 != 0) {
					if (local5 != local33) {
						local5 = local33--;
						if ((local33 & 0x1) == 0) {
							local16 = arg2.method2694(local33 >> 2, arg0);
						} else {
							local16 = arg2.method2688(arg0, local33 >> 2);
						}
						if (local16 == null) {
							local3 = false;
						}
					}
					if (local16 != null) {
						this.aClass1_Sub6_Sub1Array1[local18] = local16;
						this.anIntArray80[local18] = 0;
					}
				}
			}
		}
		return local3;
	}
}
