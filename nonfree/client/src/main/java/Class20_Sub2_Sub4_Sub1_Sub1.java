import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class20_Sub2_Sub4_Sub1_Sub1 extends Class20_Sub2_Sub4_Sub1 {

	@OriginalMember(owner = "client!kba", name = "ed", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!kba", name = "nd", descriptor = "I")
	public int anInt4927;

	@OriginalMember(owner = "client!kba", name = "wd", descriptor = "I")
	private int anInt4934;

	@OriginalMember(owner = "client!kba", name = "xd", descriptor = "Lclient!bl;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!kba", name = "yd", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!kba", name = "Jd", descriptor = "I")
	public int anInt4942;

	@OriginalMember(owner = "client!kba", name = "gd", descriptor = "I")
	public int anInt4920 = 0;

	@OriginalMember(owner = "client!kba", name = "id", descriptor = "I")
	public int anInt4922 = 0;

	@OriginalMember(owner = "client!kba", name = "rd", descriptor = "I")
	public int anInt4930 = 0;

	@OriginalMember(owner = "client!kba", name = "kd", descriptor = "I")
	public int anInt4924 = -1;

	@OriginalMember(owner = "client!kba", name = "dd", descriptor = "I")
	public int anInt4919 = -1;

	@OriginalMember(owner = "client!kba", name = "jd", descriptor = "I")
	public int anInt4923 = 0;

	@OriginalMember(owner = "client!kba", name = "fd", descriptor = "B")
	private byte aByte75 = 0;

	@OriginalMember(owner = "client!kba", name = "ud", descriptor = "I")
	public int anInt4933 = 0;

	@OriginalMember(owner = "client!kba", name = "Hd", descriptor = "B")
	private byte aByte77 = 0;

	@OriginalMember(owner = "client!kba", name = "ld", descriptor = "I")
	public int anInt4925 = -1;

	@OriginalMember(owner = "client!kba", name = "Fd", descriptor = "Z")
	public boolean aBoolean378 = false;

	@OriginalMember(owner = "client!kba", name = "Ad", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!kba", name = "pd", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!kba", name = "td", descriptor = "I")
	public int anInt4932 = -1;

	@OriginalMember(owner = "client!kba", name = "vd", descriptor = "B")
	private byte aByte76 = 0;

	@OriginalMember(owner = "client!kba", name = "md", descriptor = "I")
	public int anInt4926 = -1;

	@OriginalMember(owner = "client!kba", name = "sd", descriptor = "I")
	public int anInt4931 = -1;

	@OriginalMember(owner = "client!kba", name = "od", descriptor = "I")
	public int anInt4928 = -1;

	@OriginalMember(owner = "client!kba", name = "Td", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!kba", name = "Bd", descriptor = "I")
	public int anInt4936 = -1;

	@OriginalMember(owner = "client!kba", name = "Ud", descriptor = "I")
	public int anInt4950 = 255;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!da;IILclient!r;ILclient!q;ZI)V")
	private void method4142(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class209 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg7 * arg7;
		if (local11 < 262144 || local11 > arg5) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg0, (double) arg7) * 2607.5945876176133D) & 0x3FFF;
		@Pc(45) Class61 local45 = Static135.method2272(arg4, super.anInt6403, arg2, super.anInt6389, super.anInt6415, local33);
		if (local45 != null) {
			arg4.ZA(false);
			local45.method7592(arg6, null, arg3, 0);
			arg4.ZA(true);
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)I")
	@Override
	public int method5350() {
		return -1;
	}

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "(I)Z")
	public boolean method4143() {
		return this.aClass34_1 != null;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		if (this.aClass34_1 == null || !this.method4149(arg0, 2048)) {
			return null;
		}
		@Pc(24) Class209 local24 = arg0.method6441();
		@Pc(29) int local29 = super.aClass66_7.method1724();
		local24.o(local29);
		@Pc(47) Class293 local47 = Static118.aClass293ArrayArrayArray14[super.aByte116][super.anInt8796 >> Static378.anInt6665][super.anInt8795 >> Static378.anInt6665];
		@Pc(74) int local74;
		if (local47 == null || local47.aClass20_Sub2_Sub3_1 == null) {
			super.anInt6408 = (int) ((float) super.anInt6408 - (float) super.anInt6408 / 10.0F);
		} else {
			local74 = super.anInt6408 - local47.aClass20_Sub2_Sub3_1.aShort76;
			super.anInt6408 = (int) ((float) super.anInt6408 - (float) local74 / 10.0F);
		}
		local24.U(super.anInt8796, super.anInt8790 - super.anInt6408 - 20, super.anInt8795);
		super.aBoolean460 = false;
		if (Static479.aClass1_Sub7_Sub1_1.aBoolean225) {
			@Pc(109) Class138 local109 = this.method5346();
			if (local109.aBoolean330 && (this.aClass34_1.anInt1112 == -1 || Static183.aClass182_1.method4062(this.aClass34_1.anInt1112).aBoolean350)) {
				@Pc(143) Class131 local143 = super.anInt6438 != -1 && super.anInt6455 == 0 ? Static594.aClass311_2.method7009(super.anInt6438) : null;
				@Pc(164) Class131 local164 = super.anInt6454 == -1 || this.aBoolean379 || super.aBoolean457 && local143 != null ? null : Static594.aClass311_2.method7009(super.anInt6454);
				@Pc(196) Class61 local196 = Static278.method4293(super.anInt6403, super.aClass61Array3[0], local164 == null ? local143 : local164, super.anInt6415, arg0, super.anInt6389, local29, 0, 160, 1, 0, local164 == null ? super.anInt6392 : super.anInt6405, 240);
				if (local196 != null) {
					super.aBoolean460 = true;
					arg0.ZA(false);
					if (Static188.aBoolean320) {
						local196.method7592(local24, null, Static33.anInt894, 0);
					} else {
						local196.method7587(local24, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == this) {
			local24.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			for (local74 = Static276.aClass221Array1.length - 1; local74 >= 0; local74--) {
				@Pc(244) Class221 local244 = Static276.aClass221Array1[local74];
				if (local244 != null && local244.anInt6043 != -1) {
					@Pc(275) int local275;
					if (local244.anInt6039 == 1) {
						@Pc(264) Class1_Sub39 local264 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local244.anInt6044);
						if (local264 != null) {
							@Pc(269) Class20_Sub2_Sub4_Sub1_Sub2 local269 = local264.aClass20_Sub2_Sub4_Sub1_Sub2_2;
							local275 = local269.anInt8796 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796;
							@Pc(281) int local281 = local269.anInt8795 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795;
							if (Static188.aBoolean320) {
								this.method4142(local275, super.aClass61Array3[0], local244.anInt6043, Static33.anInt894, arg0, 92160000, local24, local281);
							} else {
								this.method4144(super.aClass61Array3[0], local275, 92160000, local281, arg0, local24, local244.anInt6043);
							}
						}
					}
					@Pc(335) int local335;
					if (local244.anInt6039 == 2) {
						@Pc(326) int local326 = local244.anInt6035 + 256 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796;
						local335 = local244.anInt6042 + 256 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795;
						local275 = local244.anInt6038 << 9;
						local275 *= local275;
						if (Static188.aBoolean320) {
							this.method4142(local326, super.aClass61Array3[0], local244.anInt6043, Static33.anInt894, arg0, local275, local24, local335);
						} else {
							this.method4144(super.aClass61Array3[0], local326, local275, local335, arg0, local24, local244.anInt6043);
						}
					}
					if (local244.anInt6039 == 10 && local244.anInt6044 >= 0 && local244.anInt6044 < Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6.length) {
						@Pc(400) Class20_Sub2_Sub4_Sub1_Sub1 local400 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local244.anInt6044];
						if (local400 != null) {
							local335 = local400.anInt8796 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796;
							local275 = local400.anInt8795 - Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795;
							if (Static188.aBoolean320) {
								this.method4142(local335, super.aClass61Array3[0], local244.anInt6043, Static33.anInt894, arg0, 92160000, local24, local275);
							} else {
								this.method4144(super.aClass61Array3[0], local335, 92160000, local275, arg0, local24, local244.anInt6043);
							}
						}
					}
				}
			}
			local24.o(local29);
			local24.U(super.anInt8796, super.anInt8790, super.anInt8795);
		}
		local24.o(local29);
		local24.U(super.anInt8796, -super.anInt6408 + super.anInt8790 - 5, super.anInt8795);
		@Pc(486) Class20_Sub8 local486 = Static593.method7897(super.aClass61Array3.length);
		this.method5355(super.aClass61Array3, false, local24, arg0);
		@Pc(498) int local498;
		if (Static188.aBoolean320) {
			for (local498 = 0; local498 < super.aClass61Array3.length; local498++) {
				if (super.aClass61Array3[local498] != null) {
					super.aClass61Array3[local498].method7592(local24, local486.aClass20_Sub3Array1[local498], Static33.anInt894, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local498 = 0; local498 < super.aClass61Array3.length; local498++) {
				if (super.aClass61Array3[local498] != null) {
					super.aClass61Array3[local498].method7587(local24, local486.aClass20_Sub3Array1[local498], Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass20_Sub5_4 != null) {
			@Pc(568) Class82 local568 = super.aClass20_Sub5_4.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local568, Static33.anInt894);
			} else {
				arg0.method6460(local568);
			}
		}
		for (local498 = 0; super.aClass61Array3.length > local498; local498++) {
			if (super.aClass61Array3[local498] != null) {
				super.aBoolean460 |= super.aClass61Array3[local498].LA();
			}
		}
		super.aClass61Array3[0] = super.aClass61Array3[1] = super.aClass61Array3[2] = null;
		super.anInt6418 = Static473.anInt8020;
		return local486;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!da;IIILclient!r;Lclient!q;BI)V")
	private void method4144(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class209 arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = arg1 * arg1 + arg3 * arg3;
		if (local16 < 262144 || arg2 < local16) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg1, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class61 local52 = Static135.method2272(arg4, super.anInt6403, arg6, super.anInt6389, super.anInt6415, local40);
		if (local52 != null) {
			arg4.ZA(false);
			local52.method7587(arg5, null, 0);
			arg4.ZA(true);
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(ZII)V")
	public void method4147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6469 = 0;
		super.anInt6466 = 0;
		super.anIntArray437[0] = arg0;
		super.anInt6467 = 0;
		super.anIntArray436[0] = arg1;
		@Pc(26) int local26 = this.method5349();
		super.anInt8795 = local26 * 256 + super.anIntArray436[0] * 512;
		super.anInt8796 = local26 * 256 + super.anIntArray437[0] * 512;
		if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == this) {
			Static224.method3681();
		}
		if (super.aClass20_Sub5_4 != null) {
			super.aClass20_Sub5_4.method3660();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBII)V")
	public void method4148(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6469 < 9) {
			super.anInt6469++;
		}
		for (@Pc(18) int local18 = super.anInt6469; local18 > 0; local18--) {
			super.anIntArray437[local18] = super.anIntArray437[local18 - 1];
			super.anIntArray436[local18] = super.anIntArray436[local18 - 1];
			super.aByteArray70[local18] = super.aByteArray70[local18 - 1];
		}
		super.anIntArray437[0] = arg2;
		super.anIntArray436[0] = arg1;
		super.aByteArray70[0] = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!r;I)Z")
	private boolean method4149(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class138 local11 = this.method5346();
		@Pc(30) Class131 local30 = super.anInt6438 != -1 && super.anInt6455 == 0 ? Static594.aClass311_2.method7009(super.anInt6438) : null;
		@Pc(51) Class131 local51 = super.anInt6454 == -1 || this.aBoolean379 || super.aBoolean457 && local30 != null ? null : Static594.aClass311_2.method7009(super.anInt6454);
		@Pc(54) int local54 = local11.anInt3989;
		@Pc(57) int local57 = local11.anInt3994;
		if (local54 != 0 || local57 != 0 || local11.anInt3963 != 0 || local11.anInt3967 != 0) {
			arg1 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte88 != 0 && super.anInt6413 <= Static81.anInt1910 && Static81.anInt1910 < super.anInt6461;
		if (local97) {
			arg1 |= 0x80000;
		}
		@Pc(138) Class61 local138 = super.aClass61Array3[0] = this.aClass34_1.method1020(Static594.aClass311_2, local30, arg0, super.anInt6423, local51, arg1, super.aClass313Array3, super.anInt6447, super.anInt6459, Static121.aClass148_1, super.anInt6392, Static161.aClass291_1, Static183.aClass182_1, super.anInt6405, super.anInt6420, Static412.aClass93_1, Static46.aClass234_1);
		@Pc(141) int local141 = Static464.method6581();
		if (Static72.anInt1778 < 96 && local141 > 50) {
			Static567.method7641();
		}
		@Pc(164) int local164;
		if (Static253.aClass218_6 != Static122.aClass218_4 && local141 < 50) {
			local164 = 50 - local141;
			while (Static359.anInt6255 < local164) {
				Static542.aByteArrayArray28[Static359.anInt6255] = new byte[102400];
				Static359.anInt6255++;
			}
			while (local164 < Static359.anInt6255) {
				Static359.anInt6255--;
				Static542.aByteArrayArray28[Static359.anInt6255] = null;
			}
		} else if (Static122.aClass218_4 != Static253.aClass218_6) {
			Static359.anInt6255 = 0;
			Static542.aByteArrayArray28 = new byte[50][];
		}
		if (local138 == null) {
			return false;
		}
		super.anInt6435 = local138.J();
		super.anInt6398 = local138.RA();
		this.method5351(local138);
		local164 = super.aClass66_7.method1724();
		if (local54 == 0 && local57 == 0) {
			this.method5342(local164, 0, this.method5349() << 9, this.method5349() << 9, 0);
		} else {
			this.method5342(local164, local11.anInt4002, local54, local57, local11.anInt4004);
			if (super.anInt6415 != 0) {
				local138.MA(super.anInt6415);
			}
			if (super.anInt6389 != 0) {
				local138.W(super.anInt6389);
			}
			if (super.anInt6403 != 0) {
				local138.oa(0, super.anInt6403, 0);
			}
		}
		if (local97) {
			local138.method7607(super.aByte91, super.aByte90, super.aByte89, super.aByte88 & 0xFF);
		}
		@Pc(323) Class116 local323;
		@Pc(338) boolean local338;
		@Pc(340) int local340;
		@Pc(383) Class61 local383;
		if (this.aBoolean379 || super.anInt6416 == -1 || super.anInt6401 == -1) {
			super.aClass61Array3[1] = null;
		} else {
			local323 = Static592.aClass98_2.method2295(super.anInt6416);
			local338 = local323.aByte43 == 3 && (local54 != 0 || local57 != 0);
			local340 = local7;
			if (local338) {
				local340 = local7 | 0x7;
			} else {
				if (super.anInt6400 != 0) {
					local340 = local7 | 0x5;
				}
				if (super.anInt6444 != 0) {
					local340 |= 0x2;
				}
			}
			local383 = super.aClass61Array3[1] = local323.method2546(super.anInt6401, super.anInt6432, Static594.aClass311_2, super.anInt6402, local340, arg0);
			if (local383 != null) {
				if (super.anInt6444 != 0) {
					local383.oa(0, -super.anInt6444 << 2, 0);
				}
				if (super.anInt6400 != 0) {
					local383.M(super.anInt6400 * 2048);
				}
				if (local338) {
					if (super.anInt6415 != 0) {
						local383.MA(super.anInt6415);
					}
					if (super.anInt6389 != 0) {
						local383.W(super.anInt6389);
					}
					if (super.anInt6403 != 0) {
						local383.oa(0, super.anInt6403, 0);
					}
				}
			}
		}
		if (this.aBoolean379 || super.anInt6452 == -1 || super.anInt6451 == -1) {
			super.aClass61Array3[2] = null;
		} else {
			local323 = Static592.aClass98_2.method2295(super.anInt6452);
			local338 = local323.aByte43 == 3 && (local54 != 0 || local57 != 0);
			local340 = local7;
			if (local338) {
				local340 = local7 | 0x7;
			} else {
				if (super.anInt6430 != 0) {
					local340 = local7 | 0x5;
				}
				if (super.anInt6393 != 0) {
					local340 |= 0x2;
				}
			}
			local383 = super.aClass61Array3[2] = local323.method2544(super.anInt6397, local340, arg0, super.anInt6448, Static594.aClass311_2, super.anInt6451);
			if (local383 != null) {
				if (super.anInt6393 != 0) {
					local383.oa(0, -super.anInt6393 << 2, 0);
				}
				if (super.anInt6430 != 0) {
					local383.M(super.anInt6430 * 2048);
				}
				if (local338) {
					if (super.anInt6415 != 0) {
						local383.MA(super.anInt6415);
					}
					if (super.anInt6389 != 0) {
						local383.W(super.anInt6389);
					}
					if (super.anInt6403 != 0) {
						local383.oa(0, super.anInt6403, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)I")
	@Override
	protected int method5343() {
		return this.anInt4934;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		if (this.aClass34_1 == null || !super.aBoolean461 && !this.method4149(arg0, 0)) {
			return;
		}
		@Pc(20) Class209 local20 = arg0.method6441();
		local20.o(super.aClass66_7.method1724());
		local20.U(super.anInt8796, super.anInt8790 - 5, super.anInt8795);
		this.method5355(super.aClass61Array3, super.aBoolean461, local20, arg0);
		super.aClass61Array3[0] = super.aClass61Array3[1] = super.aClass61Array3[2] = null;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass34_1 == null || !this.method4149(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class209 local19 = arg0.method6441();
		@Pc(24) int local24 = super.aClass66_7.method1724();
		local19.o(local24);
		local19.U(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass61Array3.length; local39++) {
			if (super.aClass61Array3[local39] != null && (Static188.aBoolean320 ? super.aClass61Array3[local39].method7606(arg2, arg1, local19, true, Static33.anInt894) : super.aClass61Array3[local39].method7590(arg2, arg1, local19, true))) {
				local37 = true;
				break;
			}
		}
		super.aClass61Array3[0] = super.aClass61Array3[1] = super.aClass61Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIB)V")
	public void method4150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6438 != -1 && Static594.aClass311_2.method7009(super.anInt6438).anInt3735 == 1) {
			super.anIntArray429 = null;
			super.anInt6438 = -1;
		}
		@Pc(34) Class116 local34;
		if (super.anInt6416 != -1) {
			local34 = Static592.aClass98_2.method2295(super.anInt6416);
			if (local34.aBoolean216 && local34.anInt3012 != -1 && Static594.aClass311_2.method7009(local34.anInt3012).anInt3735 == 1) {
				super.anInt6416 = -1;
			}
		}
		if (super.anInt6452 != -1) {
			local34 = Static592.aClass98_2.method2295(super.anInt6452);
			if (local34.aBoolean216 && local34.anInt3012 != -1 && Static594.aClass311_2.method7009(local34.anInt3012).anInt3735 == 1) {
				super.anInt6452 = -1;
			}
		}
		this.anInt4932 = -1;
		if (arg0 < 0 || arg0 >= Static500.anInt6888 || arg1 < 0 || arg1 >= Static573.anInt9325) {
			this.method4147(arg0, arg1);
		} else if (super.anIntArray437[0] >= 0 && super.anIntArray437[0] < Static500.anInt6888 && super.anIntArray436[0] >= 0 && Static573.anInt9325 > super.anIntArray436[0]) {
			if (arg2 == 2) {
				Static503.method6987(arg1, arg0, this);
			}
			this.method4148(arg2, arg1, arg0);
		} else {
			this.method4147(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)I")
	@Override
	public int method5349() {
		return this.aClass34_1 == null || this.aClass34_1.anInt1112 == -1 ? super.method5349() : Static183.aClass182_1.method4062(this.aClass34_1.anInt1112).anInt4408;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4151() {
		return this.aString49;
	}

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!io;)V")
	public void method4152(@OriginalArg(1) Class1_Sub20 arg0) {
		arg0.anInt5238 = 0;
		@Pc(12) int local12 = arg0.method4393();
		this.aByte76 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean376;
		this.aBoolean376 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method5349();
		this.method5356((local12 >> 3 & 0x7) + 1);
		this.aByte77 = (byte) (local12 >> 6 & 0x3);
		super.anInt8796 += this.method5349() - local45 << 8;
		super.anInt8795 += this.method5349() - local45 << 8;
		this.aByte75 = arg0.method4432();
		this.anInt4926 = arg0.method4432();
		this.anInt4925 = arg0.method4432();
		@Pc(106) int local106 = -1;
		this.anInt4933 = 0;
		@Pc(112) int[] local112 = new int[12];
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(182) int local182;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(120) int local120 = arg0.method4393();
			if (local120 == 0) {
				local112[local114] = 0;
			} else {
				local132 = arg0.method4393();
				local138 = (local120 << 8) + local132;
				if (local114 == 0 && local138 == 65535) {
					local106 = arg0.method4426();
					this.anInt4933 = arg0.method4393();
					break;
				}
				if (local138 >= 32768) {
					local138 = Static509.anIntArray583[local138 - 32768];
					local112[local114] = local138 | 0x40000000;
					local182 = Static46.aClass234_1.method5390(local138).anInt8604;
					if (local182 != 0) {
						this.anInt4933 = local182;
					}
				} else {
					local112[local114] = local138 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local132 = 0; local132 < 5; local132++) {
			local138 = arg0.method4393();
			if (Static235.aShortArrayArrayArray1.length < 1 || local138 < 0 || Static235.aShortArrayArrayArray1[0][local132].length <= local138) {
				local138 = 0;
			}
			local204[local132] = local138;
		}
		this.anInt4934 = arg0.method4426();
		this.aString50 = arg0.method4388();
		this.aString49 = this.aString50;
		this.anInt4922 = arg0.method4393();
		if (local41) {
			this.anInt4923 = arg0.method4426();
			this.anInt4930 = this.anInt4922;
			this.anInt4928 = -1;
			if (this.anInt4923 == 65535) {
				this.anInt4923 = -1;
			}
		} else {
			this.anInt4923 = 0;
			this.anInt4930 = arg0.method4393();
			this.anInt4928 = arg0.method4393();
			if (this.anInt4928 == 255) {
				this.anInt4928 = -1;
			}
		}
		local138 = this.anInt4920;
		this.anInt4920 = arg0.method4393();
		@Pc(329) int local329;
		if (this.anInt4920 == 0) {
			Static52.method1236(this);
		} else {
			local182 = this.anInt4924;
			@Pc(323) int local323 = this.anInt4919;
			@Pc(326) int local326 = this.anInt4936;
			local329 = this.anInt4931;
			@Pc(332) int local332 = this.anInt4950;
			this.anInt4924 = arg0.method4426();
			this.anInt4919 = arg0.method4426();
			this.anInt4936 = arg0.method4426();
			this.anInt4931 = arg0.method4426();
			this.anInt4950 = arg0.method4393();
			if (this.aBoolean376 != local21 || this.anInt4920 != local138 || local182 != this.anInt4924 || local323 != this.anInt4919 || local326 != this.anInt4936 || local329 != this.anInt4931 || local332 != this.anInt4950) {
				Static588.method7846(this);
			}
		}
		if (this.aClass34_1 == null) {
			this.aClass34_1 = new Class34();
		}
		local182 = this.aClass34_1.anInt1112;
		@Pc(433) int[] local433 = this.aClass34_1.anIntArray46;
		this.aClass34_1.method1019(this.method5343(), this.aByte76 == 1, local204, local106, local112);
		if (local106 != local182) {
			super.anInt8796 = (super.anIntArray437[0] << 9) + (this.method5349() << 8);
			super.anInt8795 = (super.anIntArray436[0] << 9) + (this.method5349() << 8);
		}
		if (super.anInt6407 == Static594.anInt9653 && local433 != null) {
			for (local329 = 0; local329 < local204.length; local329++) {
				if (local433[local329] != local204[local329]) {
					Static46.aClass234_1.method5399();
					break;
				}
			}
		}
		if (super.aClass20_Sub5_4 != null) {
			super.aClass20_Sub5_4.method3660();
		}
		if (super.anInt6454 == -1 || !super.aBoolean457) {
			return;
		}
		@Pc(536) Class138 local536 = this.method5346();
		if (!local536.method3400(super.anInt6454)) {
			super.anInt6454 = -1;
			super.aBoolean457 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(ZB)Ljava/lang/String;")
	public String method4153() {
		@Pc(7) String local7 = "";
		if (Static103.aStringArray10 != null) {
			local7 = local7 + Static103.aStringArray10[this.aByte77];
		}
		@Pc(29) int[] local29;
		if (this.aByte76 == 1 && Static106.anIntArray129 != null) {
			local29 = Static106.anIntArray129;
		} else {
			local29 = Static416.anIntArray487;
		}
		if (local29 != null && local29[this.aByte77] != -1) {
			@Pc(50) Class129 local50 = Static327.aClass266_1.method6014(local29[this.aByte77]);
			if (local50.aChar2 == 's') {
				local7 = local7 + local50.method3227(this.aByte75 & 0xFF);
			} else {
				Static259.method4059("gdn1", new Throwable());
				local29[this.aByte77] = -1;
			}
		}
		local7 = local7 + this.aString50;
		if (Static306.aStringArray24 != null) {
			local7 = local7 + Static306.aStringArray24[this.aByte77];
		}
		return local7;
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		throw new IllegalStateException();
	}
}
