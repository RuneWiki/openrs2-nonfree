import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class28_Sub4_Sub2_Sub1 extends Class28_Sub4_Sub2 {

	@OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
	private int anInt9659;

	@OriginalMember(owner = "client!uea", name = "O", descriptor = "S")
	private short aShort109;

	@OriginalMember(owner = "client!uea", name = "S", descriptor = "Lclient!ut;")
	public Class28_Sub9 aClass28_Sub9_1;

	@OriginalMember(owner = "client!uea", name = "M", descriptor = "S")
	private short aShort107;

	@OriginalMember(owner = "client!uea", name = "B", descriptor = "S")
	private short aShort106;

	@OriginalMember(owner = "client!uea", name = "P", descriptor = "S")
	private short aShort110;

	@OriginalMember(owner = "client!uea", name = "N", descriptor = "S")
	private short aShort108;

	@OriginalMember(owner = "client!uea", name = "R", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
	private int anInt9660;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!ut;IIIIIIIIIIIZZ)V")
	public Class28_Sub4_Sub2_Sub1(@OriginalArg(0) Class28_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub9_1 = arg0;
		super.anInt9656 = arg1 << 12;
		super.anInt9650 = arg2 << 12;
		super.anInt9652 = arg3 << 12;
		super.anInt9658 = arg9;
		this.aShort106 = this.aShort107 = (short) arg8;
		super.anInt9651 = arg10;
		super.anInt9657 = arg11;
		super.aBoolean743 = arg13;
		this.aShort110 = (short) arg4;
		this.aShort108 = (short) arg5;
		this.aShort111 = (short) arg6;
		this.anInt9660 = arg7;
		super.aByte150 = this.aClass28_Sub9_1.aClass49_2.aByte20;
		this.method8435();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "()V")
	private void method8435() {
		@Pc(4) int local4 = this.aClass28_Sub9_1.aClass28_Sub7_6.anInt9055;
		if (this.aClass28_Sub9_1.aClass28_Sub7_6.aClass28_Sub4_Sub2_Sub1Array2[local4] != null) {
			this.aClass28_Sub9_1.aClass28_Sub7_6.aClass28_Sub4_Sub2_Sub1Array2[local4].method8437();
		}
		this.aClass28_Sub9_1.aClass28_Sub7_6.aClass28_Sub4_Sub2_Sub1Array2[local4] = this;
		this.aShort109 = (short) this.aClass28_Sub9_1.aClass28_Sub7_6.anInt9055;
		this.aClass28_Sub9_1.aClass28_Sub7_6.anInt9055 = local4 + 1 & 0x1FFF;
		this.aClass28_Sub9_1.aClass371_9.method8908(this);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!ha;J)V")
	public void method8436(@OriginalArg(0) Class13 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt9656 >> Static391.anInt10262 + 12;
		@Pc(13) int local13 = super.anInt9652 >> Static391.anInt10262 + 12;
		@Pc(18) int local18 = super.anInt9650 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static146.anInt2951 || local13 < 0 || local13 >= Static602.anInt9668) {
			this.method8437();
			return;
		}
		@Pc(40) Class28_Sub7 local40 = this.aClass28_Sub9_1.aClass28_Sub7_6;
		@Pc(44) Class235 local44 = this.aClass28_Sub9_1.aClass235_1;
		@Pc(46) Class21[] local46 = Static121.aClass21Array2;
		@Pc(49) int local49 = local40.anInt9057;
		@Pc(58) Class164 local58 = Static15.aClass164ArrayArrayArray5[local40.anInt9057][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte68;
		}
		@Pc(71) int local71 = local46[local49].method7973(local6, local13);
		@Pc(86) int local86;
		if (local49 < Static183.anInt3720 - 1) {
			local86 = local46[local49 + 1].method7973(local6, local13);
		} else {
			local86 = local71 - (0x8 << Static391.anInt10262);
		}
		if (local44.aBoolean435) {
			if (local44.anInt6141 == -1 && local18 > local71) {
				this.method8437();
				return;
			}
			if (local44.anInt6141 >= 0 && local18 > local46[local44.anInt6141].method7973(local6, local13)) {
				this.method8437();
				return;
			}
			if (local44.anInt6172 == -1 && local18 < local86) {
				this.method8437();
				return;
			}
			if (local44.anInt6172 >= 0 && local18 < local46[local44.anInt6172 + 1].method7973(local6, local13)) {
				this.method8437();
				return;
			}
		}
		@Pc(154) int local154;
		for (local154 = Static183.anInt3720 - 1; local154 > 0 && local18 > local46[local154].method7973(local6, local13); local154--) {
		}
		if (local44.aBoolean438 && local154 == 0 && local18 > local46[0].method7973(local6, local13)) {
			this.method8437();
		} else if (local154 == Static183.anInt3720 - 1 && local46[local154].method7973(local6, local13) - local18 > 0x8 << Static391.anInt10262) {
			this.method8437();
		} else {
			local58 = Static15.aClass164ArrayArrayArray5[local154][local6][local13];
			@Pc(261) int local261;
			if (local58 == null) {
				if (local154 == 0 || Static15.aClass164ArrayArrayArray5[0][local6][local13] == null) {
					local58 = Static15.aClass164ArrayArrayArray5[0][local6][local13] = new Class164(0);
				}
				@Pc(251) boolean local251 = Static15.aClass164ArrayArrayArray5[0][local6][local13].aClass164_1 != null;
				if (local154 == 3 && local251) {
					this.method8437();
					return;
				}
				for (local261 = 1; local261 <= local154; local261++) {
					if (Static15.aClass164ArrayArrayArray5[local261][local6][local13] == null) {
						local58 = Static15.aClass164ArrayArrayArray5[local261][local6][local13] = new Class164(local261);
						if (local251) {
							local58.aByte68++;
						}
					}
				}
			}
			if (local44.aBoolean437) {
				@Pc(304) int local304 = super.anInt9656 >> 12;
				local261 = super.anInt9652 >> 12;
				@Pc(318) Class92 local318;
				if (local58.aClass28_Sub1_Sub4_2 != null) {
					local318 = local58.aClass28_Sub1_Sub4_2.method9284(arg0);
					if (local318 != null && local318.method2544(local261, local18, local304)) {
						this.method8437();
						return;
					}
				}
				if (local58.aClass28_Sub1_Sub4_1 != null) {
					local318 = local58.aClass28_Sub1_Sub4_1.method9284(arg0);
					if (local318 != null && local318.method2544(local261, local18, local304)) {
						this.method8437();
						return;
					}
				}
				if (local58.aClass28_Sub1_Sub3_1 != null) {
					local318 = local58.aClass28_Sub1_Sub3_1.method9284(arg0);
					if (local318 != null && local318.method2544(local261, local18, local304)) {
						this.method8437();
						return;
					}
				}
				for (@Pc(375) Class125 local375 = local58.aClass125_2; local375 != null; local375 = local375.aClass125_1) {
					@Pc(382) Class92 local382 = local375.aClass28_Sub1_Sub1_1.method9284(arg0);
					if (local382 != null && local382.method2544(local261, local18, local304)) {
						this.method8437();
						return;
					}
				}
			}
			local40.aClass84_1.aClass137_1.method3829(this);
		}
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "()V")
	public void method8437() {
		this.aClass28_Sub9_1.aClass28_Sub7_6.aClass28_Sub4_Sub2_Sub1Array2[this.aShort109] = null;
		Static293.aClass28_Sub4_Sub2_Sub1Array1[Static206.anInt3947] = this;
		Static206.anInt3947 = Static206.anInt3947 + 1 & 0x3FF;
		this.method9276();
		this.method8430();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(JI)V")
	public void method8438(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort107 = (short) (this.aShort107 - arg1);
		if (this.aShort107 <= 0) {
			this.method8437();
			return;
		}
		@Pc(17) int local17 = super.anInt9656 >> 12;
		@Pc(22) int local22 = super.anInt9650 >> 12;
		@Pc(27) int local27 = super.anInt9652 >> 12;
		@Pc(31) Class28_Sub7 local31 = this.aClass28_Sub9_1.aClass28_Sub7_6;
		@Pc(35) Class235 local35 = this.aClass28_Sub9_1.aClass235_1;
		if (local35.anInt6148 != 0) {
			@Pc(65) int local65;
			if (this.aShort106 - this.aShort107 <= local35.anInt6138) {
				local65 = (super.anInt9658 >> 8 & 0xFF00) + (this.anInt9659 >> 16 & 0xFF) + local35.anInt6171 * arg1;
				@Pc(82) int local82 = (super.anInt9658 & 0xFF00) + (this.anInt9659 >> 8 & 0xFF) + local35.anInt6187 * arg1;
				@Pc(99) int local99 = ((super.anInt9658 & 0xFF) << 8) + (this.anInt9659 & 0xFF) + local35.anInt6184 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt9658 &= 0xFF000000;
				super.anInt9658 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt9659 &= 0xFF000000;
				this.anInt9659 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort106 - this.aShort107 <= local35.anInt6176) {
				local65 = (super.anInt9658 >> 16 & 0xFF00) + (this.anInt9659 >> 24 & 0xFF) + local35.anInt6180 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt9658 &= 0xFFFFFF;
				super.anInt9658 |= (local65 & 0xFF00) << 16;
				this.anInt9659 &= 0xFFFFFF;
				this.anInt9659 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6155 != -1 && this.aShort106 - this.aShort107 <= local35.anInt6185) {
			this.anInt9660 += local35.anInt6139 * arg1;
		}
		if (local35.lb != -1 && this.aShort106 - this.aShort107 <= local35.anInt6186) {
			super.anInt9651 += local35.anInt6178 * arg1;
		}
		@Pc(296) double local296 = (double) this.aShort110;
		@Pc(300) double local300 = (double) this.aShort108;
		@Pc(304) double local304 = (double) this.aShort111;
		@Pc(306) boolean local306 = false;
		@Pc(317) int local317;
		@Pc(324) int local324;
		@Pc(331) int local331;
		@Pc(348) int local348;
		@Pc(356) long local356;
		if (local35.anInt6166 == 1) {
			local317 = local17 - this.aClass28_Sub9_1.aClass254_1.anInt6873;
			local324 = local22 - this.aClass28_Sub9_1.aClass254_1.anInt6862;
			local331 = local27 - this.aClass28_Sub9_1.aClass254_1.anInt6872;
			local348 = (int) Math.sqrt((double) (local317 * local317 + local324 * local324 + local331 * local331)) >> 2;
			local356 = (long) (local35.anInt6174 * local348 * arg1);
			this.anInt9660 = (int) ((long) this.anInt9660 - ((long) this.anInt9660 * local356 >> 18));
		} else if (local35.anInt6166 == 2) {
			local317 = local17 - this.aClass28_Sub9_1.aClass254_1.anInt6873;
			local324 = local22 - this.aClass28_Sub9_1.aClass254_1.anInt6862;
			local331 = local27 - this.aClass28_Sub9_1.aClass254_1.anInt6872;
			local348 = local317 * local317 + local324 * local324 + local331 * local331;
			local356 = (long) (local35.anInt6174 * local348 * arg1);
			this.anInt9660 = (int) ((long) this.anInt9660 - ((long) this.anInt9660 * local356 >> 28));
		}
		if (local35.anIntArray542 != null) {
			@Pc(437) Class3 local437 = local31.aClass338_205.aClass3_302;
			for (@Pc(440) Class3 local440 = local437.aClass3_337; local440 != local437; local440 = local440.aClass3_337) {
				@Pc(444) Class3_Sub11_Sub17 local444 = (Class3_Sub11_Sub17) local440;
				@Pc(447) Class59 local447 = local444.aClass59_1;
				if (local447.anInt1355 != 1) {
					@Pc(453) boolean local453 = false;
					for (@Pc(455) int local455 = 0; local455 < local35.anIntArray542.length; local455++) {
						if (local35.anIntArray542[local455] == local447.anInt1344) {
							local453 = true;
							break;
						}
					}
					if (local453) {
						@Pc(480) double local480 = (double) (local17 - local444.anInt9301);
						@Pc(486) double local486 = (double) (local22 - local444.anInt9295);
						@Pc(492) double local492 = (double) (local27 - local444.anInt9298);
						@Pc(504) double local504 = local480 * local480 + local486 * local486 + local492 * local492;
						if (!(local504 > (double) local447.aLong39)) {
							@Pc(513) double local513 = Math.sqrt(local504);
							if (local513 == 0.0D) {
								local513 = 1.0D;
							}
							@Pc(545) double local545 = (local480 * (double) local444.anInt9297 + local486 * (double) local447.anInt1343 + local492 * (double) local444.anInt9299) * 65535.0D / ((double) local447.anInt1348 * local513);
							if (!(local545 < (double) local447.anInt1346)) {
								@Pc(553) double local553 = 0.0D;
								if (local447.anInt1345 == 1) {
									local553 = local513 / 16.0D * (double) local447.anInt1347;
								} else if (local447.anInt1345 == 2) {
									local553 = local513 / 16.0D * (local513 / 16.0D) * (double) local447.anInt1347;
								}
								if (local447.anInt1358 != 0) {
									@Pc(678) double local678 = local480 / local513 * (double) local447.anInt1348;
									@Pc(686) double local686 = local486 / local513 * (double) local447.anInt1348;
									@Pc(694) double local694 = local492 / local513 * (double) local447.anInt1348;
									if (local447.anInt1351 == 0) {
										local296 += local678 * (double) arg1;
										local300 += local686 * (double) arg1;
										local304 += local694 * (double) arg1;
										local306 = true;
									} else {
										super.anInt9656 = (int) ((double) super.anInt9656 + local678 * (double) arg1);
										super.anInt9650 = (int) ((double) super.anInt9650 + local686 * (double) arg1);
										super.anInt9652 = (int) ((double) super.anInt9652 + local694 * (double) arg1);
									}
								} else if (local447.anInt1351 == 0) {
									local296 += ((double) local444.anInt9297 - local553) * (double) arg1;
									local300 += ((double) local447.anInt1343 - local553) * (double) arg1;
									local304 += ((double) local444.anInt9299 - local553) * (double) arg1;
									local306 = true;
								} else {
									super.anInt9656 = (int) ((double) super.anInt9656 + ((double) local444.anInt9297 - local553) * (double) arg1);
									super.anInt9650 = (int) ((double) super.anInt9650 + ((double) local447.anInt1343 - local553) * (double) arg1);
									super.anInt9652 = (int) ((double) super.anInt9652 + ((double) local444.anInt9299 - local553) * (double) arg1);
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray545 != null) {
			for (local317 = 0; local317 < local35.anIntArray545.length; local317++) {
				@Pc(776) Class3_Sub11_Sub17 local776 = (Class3_Sub11_Sub17) Static457.aClass332_1.method8067((long) local35.anIntArray545[local317]);
				while (local776 != null) {
					@Pc(780) Class59 local780 = local776.aClass59_1;
					@Pc(786) double local786 = (double) (local17 - local776.anInt9301);
					@Pc(792) double local792 = (double) (local22 - local776.anInt9295);
					@Pc(798) double local798 = (double) (local27 - local776.anInt9298);
					@Pc(810) double local810 = local786 * local786 + local792 * local792 + local798 * local798;
					if (local810 > (double) local780.aLong39) {
						local776 = (Class3_Sub11_Sub17) Static457.aClass332_1.method8065();
					} else {
						@Pc(825) double local825 = Math.sqrt(local810);
						if (local825 == 0.0D) {
							local825 = 1.0D;
						}
						@Pc(857) double local857 = (local786 * (double) local776.anInt9297 + local792 * (double) local780.anInt1343 + local798 * (double) local776.anInt9299) * 65535.0D / ((double) local780.anInt1348 * local825);
						if (local857 < (double) local780.anInt1346) {
							local776 = (Class3_Sub11_Sub17) Static457.aClass332_1.method8065();
						} else {
							@Pc(871) double local871 = 0.0D;
							if (local780.anInt1345 == 1) {
								local871 = local825 / 16.0D * (double) local780.anInt1347;
							} else if (local780.anInt1345 == 2) {
								local871 = local825 / 16.0D * (local825 / 16.0D) * (double) local780.anInt1347;
							}
							if (local780.anInt1358 != 0) {
								@Pc(996) double local996 = local786 / local825 * (double) local780.anInt1348;
								@Pc(1004) double local1004 = local792 / local825 * (double) local780.anInt1348;
								@Pc(1012) double local1012 = local798 / local825 * (double) local780.anInt1348;
								if (local780.anInt1351 == 0) {
									local296 += local996 * (double) arg1;
									local300 += local1004 * (double) arg1;
									local304 += local1012 * (double) arg1;
									local306 = true;
								} else {
									super.anInt9656 = (int) ((double) super.anInt9656 + local996 * (double) arg1);
									super.anInt9650 = (int) ((double) super.anInt9650 + local1004 * (double) arg1);
									super.anInt9652 = (int) ((double) super.anInt9652 + local1012 * (double) arg1);
								}
							} else if (local780.anInt1351 == 0) {
								local296 += ((double) local776.anInt9297 - local871) * (double) arg1;
								local300 += ((double) local780.anInt1343 - local871) * (double) arg1;
								local304 += ((double) local776.anInt9299 - local871) * (double) arg1;
								local306 = true;
							} else {
								super.anInt9656 = (int) ((double) super.anInt9656 + ((double) local776.anInt9297 - local871) * (double) arg1);
								super.anInt9650 = (int) ((double) super.anInt9650 + ((double) local780.anInt1343 - local871) * (double) arg1);
								super.anInt9652 = (int) ((double) super.anInt9652 + ((double) local776.anInt9299 - local871) * (double) arg1);
							}
							local776 = (Class3_Sub11_Sub17) Static457.aClass332_1.method8065();
						}
					}
				}
			}
		}
		if (local35.anIntArray544 != null) {
			if (local35.anIntArray543 == null) {
				local35.anIntArray543 = new int[local35.anIntArray544.length];
				for (local317 = 0; local317 < local35.anIntArray544.length; local317++) {
					Static37.method940(local35.anIntArray544[local317]);
					local35.anIntArray543[local317] = ((Class3_Sub33) Static672.aClass83_47.method2368((long) local35.anIntArray544[local317])).anInt4831;
				}
			}
			for (local317 = 0; local317 < local35.anIntArray543.length; local317++) {
				@Pc(1137) Class59 local1137 = Static178.aClass59Array1[local35.anIntArray543[local317]];
				if (local1137.anInt1351 == 0) {
					local296 += (double) (local1137.anInt1352 * arg1);
					local300 += (double) (local1137.anInt1343 * arg1);
					local304 += (double) (local1137.anInt1342 * arg1);
					local306 = true;
				} else {
					super.anInt9656 += local1137.anInt1352 * arg1;
					super.anInt9650 += local1137.anInt1343 * arg1;
					super.anInt9652 += local1137.anInt1342 * arg1;
				}
			}
		}
		if (local306) {
			while (true) {
				if (!(local296 > 32767.0D) && !(local300 > 32767.0D) && !(local304 > 32767.0D) && !(local296 < -32767.0D) && !(local300 < -32767.0D) && !(local304 < -32767.0D)) {
					this.aShort110 = (short) (int) local296;
					this.aShort108 = (short) (int) local300;
					this.aShort111 = (short) (int) local304;
					break;
				}
				local296 /= 2.0D;
				local300 /= 2.0D;
				local304 /= 2.0D;
				this.anInt9660 <<= 0x1;
			}
		}
		super.anInt9656 = (int) ((long) super.anInt9656 + ((long) this.aShort110 * (long) (this.anInt9660 << 2) >> 23) * (long) arg1);
		super.anInt9650 = (int) ((long) super.anInt9650 + ((long) this.aShort108 * (long) (this.anInt9660 << 2) >> 23) * (long) arg1);
		super.anInt9652 = (int) ((long) super.anInt9652 + ((long) this.aShort111 * (long) (this.anInt9660 << 2) >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!ut;IIIIIIIIIIIZZ)V")
	public void method8439(@OriginalArg(0) Class28_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass28_Sub9_1 = arg0;
		super.anInt9656 = arg1 << 12;
		super.anInt9650 = arg2 << 12;
		super.anInt9652 = arg3 << 12;
		super.anInt9658 = arg9;
		this.aShort106 = this.aShort107 = (short) arg8;
		super.anInt9651 = arg10;
		super.anInt9657 = arg11;
		super.aBoolean743 = arg13;
		this.aShort110 = (short) arg4;
		this.aShort108 = (short) arg5;
		this.aShort111 = (short) arg6;
		this.anInt9660 = arg7;
		super.aByte150 = this.aClass28_Sub9_1.aClass49_2.aByte20;
		this.method8435();
	}
}
