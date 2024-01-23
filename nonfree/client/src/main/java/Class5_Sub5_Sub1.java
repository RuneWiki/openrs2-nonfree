import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ed", name = "Rb", descriptor = "I")
	public int anInt1260;

	@OriginalMember(owner = "client!ed", name = "Sb", descriptor = "Lclient!sc;")
	public Class107 aClass107_351;

	@OriginalMember(owner = "client!ed", name = "cc", descriptor = "I")
	public int anInt1268;

	@OriginalMember(owner = "client!ed", name = "jc", descriptor = "Lclient!nb;")
	public Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!ed", name = "mc", descriptor = "I")
	public int anInt1275;

	@OriginalMember(owner = "client!ed", name = "oc", descriptor = "Lclient!id;")
	public Class56 aClass56_10;

	@OriginalMember(owner = "client!ed", name = "uc", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!ed", name = "vc", descriptor = "I")
	public int anInt1279;

	@OriginalMember(owner = "client!ed", name = "Bc", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!ed", name = "Fc", descriptor = "I")
	public int anInt1289;

	@OriginalMember(owner = "client!ed", name = "Yb", descriptor = "I")
	private int anInt1265 = 0;

	@OriginalMember(owner = "client!ed", name = "ac", descriptor = "I")
	public int anInt1267 = 0;

	@OriginalMember(owner = "client!ed", name = "Zb", descriptor = "I")
	public int anInt1266 = -1;

	@OriginalMember(owner = "client!ed", name = "bc", descriptor = "S")
	private short aShort22 = 0;

	@OriginalMember(owner = "client!ed", name = "hc", descriptor = "I")
	public int anInt1271 = -1;

	@OriginalMember(owner = "client!ed", name = "rc", descriptor = "S")
	private short aShort23 = 0;

	@OriginalMember(owner = "client!ed", name = "Vb", descriptor = "I")
	public int anInt1263 = -1;

	@OriginalMember(owner = "client!ed", name = "tc", descriptor = "I")
	public int anInt1277 = 0;

	@OriginalMember(owner = "client!ed", name = "Cc", descriptor = "I")
	public int anInt1286 = 0;

	@OriginalMember(owner = "client!ed", name = "Dc", descriptor = "I")
	public int anInt1287 = 0;

	@OriginalMember(owner = "client!ed", name = "zc", descriptor = "I")
	public int anInt1283 = 0;

	@OriginalMember(owner = "client!ed", name = "wc", descriptor = "I")
	public int anInt1280 = -1;

	@OriginalMember(owner = "client!ed", name = "yc", descriptor = "I")
	public int anInt1282 = -1;

	@OriginalMember(owner = "client!ed", name = "Ic", descriptor = "I")
	public int anInt1291 = 0;

	@OriginalMember(owner = "client!ed", name = "sc", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		return super.anInt2995;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass56_10 == null) {
			return;
		}
		@Pc(24) Class96 local24 = super.anInt3048 != -1 && super.anInt2996 == 0 ? Static2.method88(super.anInt3048) : null;
		@Pc(49) Class96 local49 = super.anInt3005 == -1 || this.aBoolean108 || super.anInt3022 == super.anInt3005 && local24 != null ? null : Static2.method88(super.anInt3005);
		@Pc(60) Class5_Sub3 local60 = this.aClass56_10.method1545(super.anInt3023, local24, local49, super.anInt3028);
		if (local60 == null) {
			return;
		}
		super.anInt2995 = local60.method2297();
		if (Static163.aBoolean316 && (this.aClass56_10.anInt1979 == -1 || Static139.method2340(this.aClass56_10.anInt1979).aBoolean91)) {
			@Pc(111) Class5_Sub3 local111 = Static58.method1128(0, local60, arg0, 1, super.aBoolean257, super.anInt3021, local49 == null ? local24 : local49, 240, super.anInt3000, super.anInt3044, 160, 0, local49 == null ? super.anInt3023 : super.anInt3028);
			local111.method2300(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(182) int local182;
		@Pc(193) int local193;
		@Pc(130) int local130;
		@Pc(229) int local229;
		if (Static204.aClass5_Sub5_Sub1_2 == this) {
			for (local130 = Static76.aClass68Array1.length - 1; local130 >= 0; local130--) {
				@Pc(136) Class68 local136 = Static76.aClass68Array1[local130];
				if (local136 != null && local136.anInt2511 != -1) {
					if (local136.anInt2519 == 1 && local136.anInt2515 >= 0 && Static33.aClass5_Sub5_Sub2Array1.length > local136.anInt2515) {
						@Pc(169) Class5_Sub5_Sub2 local169 = Static33.aClass5_Sub5_Sub2Array1[local136.anInt2515];
						if (local169 != null) {
							local182 = local169.anInt3021 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
							local193 = local169.anInt3044 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
							this.method1019(arg4, arg2, arg7, arg5, arg6, local60, arg1, arg0, arg3, local136.anInt2511, local182, local193);
						}
					}
					if (local136.anInt2519 == 2) {
						local229 = (local136.anInt2514 - Static36.anInt764) * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
						local182 = (local136.anInt2506 - Static152.anInt3377) * 4 + 2 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
						this.method1019(arg4, arg2, arg7, arg5, arg6, local60, arg1, arg0, arg3, local136.anInt2511, local229, local182);
					}
					if (local136.anInt2519 == 10 && local136.anInt2515 >= 0 && local136.anInt2515 < Static198.aClass5_Sub5_Sub1Array1.length) {
						@Pc(280) Class5_Sub5_Sub1 local280 = Static198.aClass5_Sub5_Sub1Array1[local136.anInt2515];
						if (local280 != null) {
							local182 = local280.anInt3021 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3021 / 32;
							local193 = local280.anInt3044 / 32 - Static204.aClass5_Sub5_Sub1_2.anInt3044 / 32;
							this.method1019(arg4, arg2, arg7, arg5, arg6, local60, arg1, arg0, arg3, local136.anInt2511, local182, local193);
						}
					}
				}
			}
		}
		local130 = 0;
		local229 = 0;
		@Pc(329) int local329 = 0;
		if (this.aShort22 != 0 && this.aShort23 != 0) {
			local182 = Class45.anIntArray159[arg0];
			local193 = Class45.anIntArray156[arg0];
			@Pc(349) short local349 = this.aShort22;
			@Pc(352) short local352 = this.aShort23;
			@Pc(357) int local357 = -local349 / 2;
			@Pc(362) int local362 = -local352 / 2;
			@Pc(373) int local373 = local193 * local362 - local357 * local182 >> 16;
			@Pc(383) int local383 = local193 * local357 + local182 * local362 >> 16;
			@Pc(396) int local396 = Static130.method2174(Static191.anInt4237, super.anInt3044 + local373, super.anInt3021 + local383);
			@Pc(400) int local400 = local349 / 2;
			@Pc(405) int local405 = -local352 / 2;
			@Pc(416) int local416 = local405 * local182 + local193 * local400 >> 16;
			@Pc(427) int local427 = local405 * local193 - local400 * local182 >> 16;
			@Pc(439) int local439 = Static130.method2174(Static191.anInt4237, local427 + super.anInt3044, super.anInt3021 + local416);
			@Pc(444) int local444 = -local349 / 2;
			@Pc(448) int local448 = local352 / 2;
			@Pc(458) int local458 = local444 * local193 + local182 * local448 >> 16;
			@Pc(468) int local468 = local448 * local193 - local444 * local182 >> 16;
			@Pc(472) int local472 = local349 / 2;
			@Pc(484) int local484 = Static130.method2174(Static191.anInt4237, local468 + super.anInt3044, super.anInt3021 + local458);
			@Pc(488) int local488 = local352 / 2;
			@Pc(499) int local499 = local193 * local488 - local472 * local182 >> 16;
			@Pc(509) int local509 = local472 * local193 + local488 * local182 >> 16;
			@Pc(522) int local522 = Static130.method2174(Static191.anInt4237, super.anInt3044 + local499, local509 + super.anInt3021);
			local229 = local522 + local396;
			if (local229 > local484 + local439) {
				local229 = local439 + local484;
			}
			@Pc(547) int local547 = local396 >= local439 ? local439 : local396;
			@Pc(558) int local558 = local439 >= local522 ? local522 : local439;
			@Pc(569) int local569 = local522 > local484 ? local484 : local522;
			local130 = (int) (Math.atan2((double) (local547 - local569), (double) local352) * 325.95D) & 0x7FF;
			if (local130 != 0) {
				local60.method530(local130);
			}
			@Pc(598) int local598 = local484 > local396 ? local396 : local484;
			local329 = (int) (Math.atan2((double) (local598 - local558), (double) local349) * 325.95D) & 0x7FF;
			if (local329 != 0) {
				local60.method528(local329);
			}
			local229 = (local229 >> 1) - super.anInt3000;
			if (local229 != 0) {
				local60.method532(0, local229, 0);
			}
		}
		@Pc(636) Class5_Sub3 local636 = null;
		if (!this.aBoolean108 && super.anInt3045 != -1 && super.anInt3038 != -1) {
			@Pc(653) Class69 local653 = Static89.method1514(super.anInt3045);
			local636 = local653.method2008(super.anInt3038);
			if (local636 != null) {
				local636.method532(0, -super.anInt3043, 0);
				if (local653.aBoolean217) {
					if (local130 != 0) {
						local636.method530(local130);
					}
					if (local329 != 0) {
						local636.method528(local329);
					}
					if (local229 != 0) {
						local636.method532(0, local229, 0);
					}
				}
			}
		}
		@Pc(693) Class5_Sub3 local693 = null;
		if (!this.aBoolean108 && this.aClass5_Sub3_1 != null) {
			if (Static128.anInt2802 >= this.anInt1267) {
				this.aClass5_Sub3_1 = null;
			}
			if (Static128.anInt2802 >= this.anInt1283 && this.anInt1267 > Static128.anInt2802) {
				local693 = this.aClass5_Sub3_1;
				local693.method532(this.anInt1260 - super.anInt3021, -super.anInt3000 + this.anInt1275, this.anInt1278 - super.anInt3044);
				if (super.anInt2994 == 512) {
					local693.method541();
				} else if (super.anInt2994 == 1024) {
					local693.method534();
				} else if (super.anInt2994 == 1536) {
					local693.method547();
				}
			}
		}
		if (local636 != null) {
			local60 = ((Class5_Sub3_Sub1) local60).method559(local636);
		}
		if (local693 != null) {
			local60 = ((Class5_Sub3_Sub1) local60).method559(local693);
		}
		local60.aBoolean45 = true;
		local60.method2300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local693 == null) {
			return;
		}
		if (super.anInt2994 == 512) {
			local693.method547();
		} else if (super.anInt2994 == 1024) {
			local693.method534();
		} else if (super.anInt2994 == 1536) {
			local693.method541();
		}
		local693.method532(super.anInt3021 - this.anInt1260, -this.anInt1275 + super.anInt3000, super.anInt3044 - this.anInt1278);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2308() {
		return this.aClass56_10 != null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!vf;)V")
	public void method1017(@OriginalArg(1) Class1_Sub26 arg0) {
		arg0.anInt4021 = 0;
		@Pc(12) int local12 = arg0.method2945();
		if ((local12 & 0x2) == 2) {
			this.aShort22 = (short) (arg0.method2945() << 2);
			this.aShort23 = (short) (arg0.method2945() << 2);
		} else {
			this.aShort22 = 0;
			this.aShort23 = 0;
		}
		@Pc(47) int local47 = local12 & 0x1;
		this.anInt1265 = local12 >> 6 & 0x3;
		@Pc(65) boolean local65 = (local12 & 0x4) != 0;
		@Pc(67) int local67 = -1;
		@Pc(70) int local70 = super.anInt2997;
		@Pc(73) int[] local73 = new int[12];
		super.anInt2997 = (local12 >> 3 & 0x7) + 1;
		super.anInt3021 += (super.anInt2997 - local70) * 64;
		super.anInt3044 += (super.anInt2997 - local70) * 64;
		this.anInt1280 = arg0.method2992();
		this.anInt1282 = arg0.method2992();
		this.anInt1287 = 0;
		@Pc(144) int local144;
		@Pc(151) int local151;
		@Pc(189) int local189;
		for (@Pc(123) int local123 = 0; local123 < 12; local123++) {
			@Pc(129) int local129 = arg0.method2945();
			if (local129 == 0) {
				local73[local123] = 0;
			} else {
				local144 = arg0.method2945();
				local151 = (local129 << 8) + local144;
				if (local123 == 0 && local151 == 65535) {
					local67 = arg0.method2964();
					break;
				}
				if (local151 >= 32768) {
					local151 = Static7.anIntArray16[local151 - 32768];
					local73[local123] = local151 | 0x40000000;
					local189 = Static128.method2147(local151).anInt2742;
					if (local189 != 0) {
						this.anInt1287 = local189;
					}
				} else {
					local73[local123] = local151 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(213) int[] local213 = new int[5];
		for (local144 = 0; local144 < 5; local144++) {
			local151 = arg0.method2945();
			if (local151 < 0 || Static49.aShortArrayArray3[local144].length <= local151) {
				local151 = 0;
			}
			local213[local144] = local151;
		}
		super.anInt3022 = arg0.method2964();
		if (super.anInt3022 == 65535) {
			super.anInt3022 = -1;
		}
		super.anInt3030 = arg0.method2964();
		if (super.anInt3030 == 65535) {
			super.anInt3030 = -1;
		}
		super.anInt3007 = super.anInt3030;
		super.anInt3037 = arg0.method2964();
		if (super.anInt3037 == 65535) {
			super.anInt3037 = -1;
		}
		super.anInt3035 = arg0.method2964();
		if (super.anInt3035 == 65535) {
			super.anInt3035 = -1;
		}
		super.anInt3052 = arg0.method2964();
		if (super.anInt3052 == 65535) {
			super.anInt3052 = -1;
		}
		super.anInt3020 = arg0.method2964();
		if (super.anInt3020 == 65535) {
			super.anInt3020 = -1;
		}
		super.anInt3002 = arg0.method2964();
		if (super.anInt3002 == 65535) {
			super.anInt3002 = -1;
		}
		this.aClass107_351 = Static19.method382(arg0.method2943()).method3092();
		this.anInt1286 = arg0.method2945();
		if (local65) {
			this.anInt1277 = arg0.method2964();
		} else {
			this.anInt1277 = 0;
		}
		local151 = this.anInt1291;
		this.anInt1291 = arg0.method2945();
		if (this.anInt1291 == 0) {
			Static116.method2006(this);
		} else {
			local189 = this.anInt1263;
			@Pc(390) int local390 = this.anInt1266;
			@Pc(393) int local393 = this.anInt1271;
			this.anInt1263 = arg0.method2964();
			this.anInt1266 = arg0.method2964();
			this.anInt1271 = arg0.method2964();
			if (this.anInt1291 != local151 || local189 != this.anInt1263 || this.anInt1266 != local390 || local393 != this.anInt1271) {
				Static21.method395(this);
			}
		}
		if (this.aClass56_10 == null) {
			this.aClass56_10 = new Class56();
		}
		this.aClass56_10.method1535(local67, local213, local73, local47 == 1);
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)Lclient!sc;")
	public Class107 method1018() {
		@Pc(11) Class107 local11 = this.aClass107_351;
		if (Static84.aClass107Array9 != null) {
			local11 = Static149.method2437(new Class107[] { Static84.aClass107Array9[this.anInt1265], local11 });
		}
		if (Static142.aClass107Array16 != null) {
			local11 = Static149.method2437(new Class107[] { local11, Static142.aClass107Array16[this.anInt1265] });
		}
		return local11;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIIIILclient!nb;IIIIII)V")
	private void method1019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub3 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) int local7 = arg11 * arg11 + arg10 * arg10;
		if (local7 < 16 || local7 > 360000) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg10, (double) arg11) * 325.949D) & 0x7FF;
		@Pc(41) Class5_Sub3 local41 = Static91.method1540(super.anInt3021, arg5, arg9, local29, super.anInt3044, super.anInt3000);
		if (local41 != null) {
			local41.method2300(0, arg6, arg1, arg8, arg0, arg3, arg4, arg2, -1L);
		}
	}
}
