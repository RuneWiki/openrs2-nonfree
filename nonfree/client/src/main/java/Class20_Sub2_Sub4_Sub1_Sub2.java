import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class20_Sub2_Sub4_Sub1_Sub2 extends Class20_Sub2_Sub4_Sub1 {

	@OriginalMember(owner = "client!nu", name = "fd", descriptor = "Lclient!iv;")
	public Class162 aClass162_1;

	@OriginalMember(owner = "client!nu", name = "ad", descriptor = "I")
	public int anInt6473 = -1;

	@OriginalMember(owner = "client!nu", name = "wd", descriptor = "I")
	public int anInt6491 = -1;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIIIII)V")
	public void method5358(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		super.aByte116 = super.aByte117 = (byte) arg1;
		if (Static70.method1506(arg3, arg4)) {
			super.aByte117++;
		}
		if (super.anInt6438 != -1 && Static594.aClass311_2.method7009(super.anInt6438).anInt3735 == 1) {
			super.anIntArray429 = null;
			super.anInt6438 = -1;
		}
		@Pc(58) Class116 local58;
		if (super.anInt6416 != -1) {
			local58 = Static592.aClass98_2.method2295(super.anInt6416);
			if (local58.aBoolean216 && local58.anInt3012 != -1 && Static594.aClass311_2.method7009(local58.anInt3012).anInt3735 == 1) {
				super.anInt6416 = -1;
			}
		}
		if (super.anInt6452 != -1) {
			local58 = Static592.aClass98_2.method2295(super.anInt6452);
			if (local58.aBoolean216 && local58.anInt3012 != -1 && Static594.aClass311_2.method7009(local58.anInt3012).anInt3735 == 1) {
				super.anInt6452 = -1;
			}
		}
		if (!arg0) {
			@Pc(119) int local119 = arg4 - super.anIntArray437[0];
			@Pc(126) int local126 = arg3 - super.anIntArray436[0];
			if (local119 >= -8 && local119 <= 8 && local126 >= -8 && local126 <= 8) {
				if (super.anInt6469 < 9) {
					super.anInt6469++;
				}
				for (@Pc(159) int local159 = super.anInt6469; local159 > 0; local159--) {
					super.anIntArray437[local159] = super.anIntArray437[local159 - 1];
					super.anIntArray436[local159] = super.anIntArray436[local159 - 1];
					super.aByteArray70[local159] = super.aByteArray70[local159 - 1];
				}
				super.anIntArray437[0] = arg4;
				super.aByteArray70[0] = 1;
				super.anIntArray436[0] = arg3;
				return;
			}
		}
		super.anIntArray437[0] = arg4;
		super.anInt6467 = 0;
		super.anInt6469 = 0;
		super.anInt6466 = 0;
		super.anIntArray436[0] = arg3;
		super.anInt8795 = (arg2 << 8) + (super.anIntArray436[0] << 9);
		super.anInt8796 = (super.anIntArray437[0] << 9) + (arg2 << 8);
		if (super.aClass20_Sub5_4 != null) {
			super.aClass20_Sub5_4.method3660();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!iv;Z)V")
	public void method5359(@OriginalArg(0) Class162 arg0) {
		this.aClass162_1 = arg0;
		if (super.aClass20_Sub5_4 != null) {
			super.aClass20_Sub5_4.method3660();
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZI)V")
	public void method5360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray437[0];
		@Pc(15) int local15 = super.anIntArray436[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt6438 != -1 && Static594.aClass311_2.method7009(super.anInt6438).anInt3735 == 1) {
			super.anIntArray429 = null;
			super.anInt6438 = -1;
		}
		@Pc(89) Class116 local89;
		if (super.anInt6416 != -1) {
			local89 = Static592.aClass98_2.method2295(super.anInt6416);
			if (local89.aBoolean216 && local89.anInt3012 != -1 && Static594.aClass311_2.method7009(local89.anInt3012).anInt3735 == 1) {
				super.anInt6416 = -1;
			}
		}
		if (super.anInt6452 != -1) {
			local89 = Static592.aClass98_2.method2295(super.anInt6452);
			if (local89.aBoolean216 && local89.anInt3012 != -1 && Static594.aClass311_2.method7009(local89.anInt3012).anInt3735 == 1) {
				super.anInt6452 = -1;
			}
		}
		if (super.anInt6469 < 9) {
			super.anInt6469++;
		}
		for (@Pc(157) int local157 = super.anInt6469; local157 > 0; local157--) {
			super.anIntArray437[local157] = super.anIntArray437[local157 - 1];
			super.anIntArray436[local157] = super.anIntArray436[local157 - 1];
			super.aByteArray70[local157] = super.aByteArray70[local157 - 1];
		}
		super.anIntArray437[0] = local10;
		super.anIntArray436[0] = local15;
		super.aByteArray70[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(Z)I")
	@Override
	public int method5347() {
		if (this.aClass162_1.anIntArray267 != null) {
			@Pc(18) Class162 local18 = this.aClass162_1.method3802(Static121.aClass148_1);
			if (local18 != null && local18.anInt4399 != -1) {
				return local18.anInt4399;
			}
		}
		return this.aClass162_1.anInt4399 == -1 ? super.method5347() : this.aClass162_1.anInt4399;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
	@Override
	protected int method5343() {
		if (this.aClass162_1.anIntArray267 != null) {
			@Pc(18) Class162 local18 = this.aClass162_1.method3802(Static121.aClass148_1);
			if (local18 != null && local18.anInt4416 != -1) {
				return local18.anInt4416;
			}
		}
		return this.aClass162_1.anInt4416;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
		if (this.aClass162_1 == null || !super.aBoolean461 && !this.method5364(arg0, 0)) {
			return;
		}
		@Pc(20) Class209 local20 = arg0.method6441();
		local20.o(super.aClass66_7.method1724());
		local20.U(super.anInt8796, super.anInt8790 - 20, super.anInt8795);
		this.method5355(super.aClass61Array3, super.aBoolean461, local20, arg0);
		super.aClass61Array3[0] = super.aClass61Array3[1] = super.aClass61Array3[2] = null;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		if (this.aClass162_1 == null || !this.method5364(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class209 local19 = arg0.method6441();
		@Pc(24) int local24 = super.aClass66_7.method1724();
		local19.o(local24);
		@Pc(42) Class293 local42 = Static118.aClass293ArrayArrayArray14[super.aByte116][super.anInt8796 >> Static378.anInt6665][super.anInt8795 >> Static378.anInt6665];
		if (local42 == null || local42.aClass20_Sub2_Sub3_1 == null) {
			super.anInt6408 = (int) ((float) super.anInt6408 - (float) super.anInt6408 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt6408 - local42.aClass20_Sub2_Sub3_1.aShort76;
			super.anInt6408 = (int) ((float) super.anInt6408 - (float) local55 / 10.0F);
		}
		local19.U(super.anInt8796, -super.anInt6408 + super.anInt8790 - 20, super.anInt8795);
		@Pc(98) Class138 local98 = this.method5346();
		@Pc(111) Class162 local111 = this.aClass162_1.anIntArray267 == null ? this.aClass162_1 : this.aClass162_1.method3802(Static121.aClass148_1);
		super.aBoolean460 = false;
		if (Static479.aClass1_Sub7_Sub1_1.aBoolean225 && local111.aBoolean350 && local98.aBoolean330) {
			@Pc(142) Class131 local142 = super.anInt6438 != -1 && super.anInt6455 == 0 ? Static594.aClass311_2.method7009(super.anInt6438) : null;
			@Pc(160) Class131 local160 = super.anInt6454 == -1 || super.aBoolean457 && local142 != null ? null : Static594.aClass311_2.method7009(super.anInt6454);
			@Pc(210) Class61 local210 = Static278.method4293(super.anInt6403, super.aClass61Array3[0], local160 == null ? local142 : local160, super.anInt6415, arg0, super.anInt6389, local24, this.aClass162_1.aShort46 & 0xFFFF, this.aClass162_1.aByte58 & 0xFF, this.aClass162_1.anInt4408, this.aClass162_1.aShort47 & 0xFFFF, local160 == null ? super.anInt6392 : super.anInt6405, this.aClass162_1.aByte63 & 0xFF);
			if (local210 != null) {
				super.aBoolean460 = true;
				arg0.ZA(false);
				if (Static188.aBoolean320) {
					local210.method7592(local19, null, Static33.anInt894, 0);
				} else {
					local210.method7587(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local24);
		local19.U(super.anInt8796, -super.anInt6408 + super.anInt8790 - 5, super.anInt8795);
		@Pc(255) Class20_Sub8 local255 = null;
		if (this.method5365()) {
			local255 = Static593.method7897(super.aClass61Array3.length);
		}
		this.method5355(super.aClass61Array3, false, local19, arg0);
		@Pc(277) int local277;
		if (Static188.aBoolean320) {
			for (local277 = 0; local277 < super.aClass61Array3.length; local277++) {
				if (super.aClass61Array3[local277] != null) {
					super.aClass61Array3[local277].method7592(local19, local255 == null ? null : local255.aClass20_Sub3Array1[local277], Static33.anInt894, 0);
				}
			}
		} else {
			for (local277 = 0; super.aClass61Array3.length > local277; local277++) {
				if (super.aClass61Array3[local277] != null) {
					super.aClass61Array3[local277].method7587(local19, local255 == null ? null : local255.aClass20_Sub3Array1[local277], 0);
				}
			}
		}
		if (super.aClass20_Sub5_4 != null) {
			@Pc(349) Class82 local349 = super.aClass20_Sub5_4.method3664();
			if (Static188.aBoolean320) {
				arg0.method6404(local349, Static33.anInt894);
			} else {
				arg0.method6460(local349);
			}
		}
		for (local277 = 0; super.aClass61Array3.length > local277; local277++) {
			if (super.aClass61Array3[local277] != null) {
				super.aBoolean460 |= super.aClass61Array3[local277].LA();
			}
		}
		super.anInt6418 = Static473.anInt8020;
		super.aClass61Array3[0] = super.aClass61Array3[1] = super.aClass61Array3[2] = null;
		return local255;
	}

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "(I)Z")
	public boolean method5362() {
		return this.aClass162_1 != null;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)I")
	@Override
	public int method5350() {
		if (this.aClass162_1.anIntArray267 != null) {
			@Pc(21) Class162 local21 = this.aClass162_1.method3802(Static121.aClass148_1);
			if (local21 != null && local21.anInt4390 != -1) {
				return local21.anInt4390;
			}
		}
		return this.aClass162_1.anInt4390;
	}

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass162_1 == null || !this.method5364(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class209 local19 = arg0.method6441();
		@Pc(24) int local24 = super.aClass66_7.method1724();
		local19.o(local24);
		local19.U(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass61Array3.length > local39; local39++) {
			if (super.aClass61Array3[local39] != null) {
				@Pc(70) boolean local70 = this.aClass162_1.anInt4388 == -1 ? this.aClass162_1.anInt4408 == 1 : this.aClass162_1.anInt4388 == 1;
				@Pc(82) boolean local82;
				if (Static188.aBoolean320) {
					local82 = super.aClass61Array3[local39].method7606(arg2, arg1, local19, local70, Static33.anInt894);
				} else {
					local82 = super.aClass61Array3[local39].method7590(arg2, arg1, local19, local70);
				}
				if (local82) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass61Array3[0] = super.aClass61Array3[1] = super.aClass61Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!r;II)Z")
	private boolean method5364(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class138 local11 = this.method5346();
		@Pc(27) Class131 local27 = super.anInt6438 != -1 && super.anInt6455 == 0 ? Static594.aClass311_2.method7009(super.anInt6438) : null;
		@Pc(44) Class131 local44 = super.anInt6454 == -1 || super.aBoolean457 && local27 != null ? null : Static594.aClass311_2.method7009(super.anInt6454);
		@Pc(47) int local47 = local11.anInt3989;
		@Pc(50) int local50 = local11.anInt3994;
		if (local47 != 0 || local50 != 0 || local11.anInt3963 != 0 || local11.anInt3967 != 0) {
			arg1 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte88 != 0 && Static81.anInt1910 >= super.anInt6413 && super.anInt6461 > Static81.anInt1910;
		if (local92) {
			arg1 |= 0x80000;
		}
		@Pc(129) Class61 local129 = super.aClass61Array3[0] = this.aClass162_1.method3797(local27, super.anInt6447, super.anInt6392, Static594.aClass311_2, super.aClass313Array3, arg0, super.anInt6405, super.anInt6459, super.anInt6420, Static161.aClass291_1, Static121.aClass148_1, arg1, local44, super.anInt6423);
		if (local129 == null) {
			return false;
		}
		super.anInt6435 = local129.J();
		super.anInt6398 = local129.RA();
		this.method5351(local129);
		@Pc(158) int local158 = super.aClass66_7.method1724();
		if (local47 == 0 && local50 == 0) {
			this.method5342(local158, 0, this.method5349() << 9, this.method5349() << 9, 0);
		} else {
			this.method5342(local158, local11.anInt4002, local47, local50, local11.anInt4004);
			if (super.anInt6415 != 0) {
				super.aClass61Array3[0].MA(super.anInt6415);
			}
			if (super.anInt6389 != 0) {
				super.aClass61Array3[0].W(super.anInt6389);
			}
			if (super.anInt6403 != 0) {
				super.aClass61Array3[0].oa(0, super.anInt6403, 0);
			}
		}
		if (local92) {
			local129.method7607(super.aByte91, super.aByte90, super.aByte89, super.aByte88 & 0xFF);
		}
		@Pc(255) Class116 local255;
		@Pc(267) boolean local267;
		@Pc(269) int local269;
		@Pc(309) Class61 local309;
		if (super.anInt6416 == -1 || super.anInt6401 == -1) {
			super.aClass61Array3[1] = null;
		} else {
			local255 = Static592.aClass98_2.method2295(super.anInt6416);
			local267 = local255.aByte43 == 3 && (local47 != 0 || local50 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt6400 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt6444 != 0) {
					local269 |= 0x2;
				}
			}
			local309 = super.aClass61Array3[1] = local255.method2546(super.anInt6401, super.anInt6432, Static594.aClass311_2, super.anInt6402, local269, arg0);
			if (local309 != null) {
				if (super.anInt6444 != 0) {
					local309.oa(0, -super.anInt6444 << 2, 0);
				}
				if (super.anInt6400 != 0) {
					local309.M(super.anInt6400 * 2048);
				}
				if (local267) {
					if (super.anInt6415 != 0) {
						local309.MA(super.anInt6415);
					}
					if (super.anInt6389 != 0) {
						local309.W(super.anInt6389);
					}
					if (super.anInt6403 != 0) {
						local309.oa(0, super.anInt6403, 0);
					}
				}
			}
		}
		if (super.anInt6452 == -1 || super.anInt6451 == -1) {
			super.aClass61Array3[2] = null;
		} else {
			local255 = Static592.aClass98_2.method2295(super.anInt6452);
			local267 = local255.aByte43 == 3 && (local47 != 0 || local50 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt6430 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt6393 != 0) {
					local269 |= 0x2;
				}
			}
			local309 = super.aClass61Array3[2] = local255.method2544(super.anInt6397, local269, arg0, super.anInt6448, Static594.aClass311_2, super.anInt6451);
			if (local309 != null) {
				if (super.anInt6393 != 0) {
					local309.oa(0, -super.anInt6393 << 2, 0);
				}
				if (super.anInt6430 != 0) {
					local309.M(super.anInt6430 * 2048);
				}
				if (local267) {
					if (super.anInt6415 != 0) {
						local309.MA(super.anInt6415);
					}
					if (super.anInt6389 != 0) {
						local309.W(super.anInt6389);
					}
					if (super.anInt6403 != 0) {
						local309.oa(0, super.anInt6403, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "(B)Z")
	private boolean method5365() {
		return this.aClass162_1.aBoolean349;
	}
}
