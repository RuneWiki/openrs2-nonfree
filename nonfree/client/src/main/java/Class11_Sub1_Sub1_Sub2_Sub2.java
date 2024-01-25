import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class11_Sub1_Sub1_Sub2_Sub2 extends Class11_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!fca", name = "cd", descriptor = "Lclient!np;")
	public Class236 aClass236_1;

	@OriginalMember(owner = "client!fca", name = "kd", descriptor = "I")
	public int anInt3305 = -1;

	@OriginalMember(owner = "client!fca", name = "bd", descriptor = "I")
	public int anInt3297 = -1;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "(B)Z")
	public boolean method2780() {
		return this.aClass236_1 != null;
	}

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "(I)V")
	@Override
	public void method8311() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZIIZI)V")
	public void method2781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte124 = super.aByte125 = (byte) arg0;
		if (Static471.method6782(arg4, arg1)) {
			super.aByte125++;
		}
		if (super.anInt3258 != -1 && Static185.aClass303_1.method7201(super.anInt3258).anInt4517 == 1) {
			super.anInt3258 = -1;
			super.anIntArray226 = null;
		}
		@Pc(52) Class69 local52;
		if (super.anInt3270 != -1) {
			local52 = Static414.aClass356_2.method8213(super.anInt3270);
			if (local52.aBoolean152 && local52.anInt1820 != -1 && Static185.aClass303_1.method7201(local52.anInt1820).anInt4517 == 1) {
				super.anInt3270 = -1;
			}
		}
		if (super.anInt3229 != -1) {
			local52 = Static414.aClass356_2.method8213(super.anInt3229);
			if (local52.aBoolean152 && local52.anInt1820 != -1 && Static185.aClass303_1.method7201(local52.anInt1820).anInt4517 == 1) {
				super.anInt3229 = -1;
			}
		}
		if (!arg3) {
			@Pc(113) int local113 = arg1 - super.anIntArray232[0];
			@Pc(120) int local120 = arg4 - super.anIntArray233[0];
			if (local113 >= -8 && local113 <= 8 && local120 >= -8 && local120 <= 8) {
				if (super.anInt3296 < 9) {
					super.anInt3296++;
				}
				for (@Pc(151) int local151 = super.anInt3296; local151 > 0; local151--) {
					super.anIntArray232[local151] = super.anIntArray232[local151 - 1];
					super.anIntArray233[local151] = super.anIntArray233[local151 - 1];
					super.aByteArray31[local151] = super.aByteArray31[local151 - 1];
				}
				super.anIntArray232[0] = arg1;
				super.aByteArray31[0] = 1;
				super.anIntArray233[0] = arg4;
				return;
			}
		}
		super.anInt3295 = 0;
		super.anInt3296 = 0;
		super.anInt3294 = 0;
		super.anIntArray232[0] = arg1;
		super.anIntArray233[0] = arg4;
		super.anInt9925 = (arg2 << 8) + (super.anIntArray232[0] << 9);
		super.anInt9929 = (super.anIntArray233[0] << 9) + (arg2 << 8);
		if (super.aClass11_Sub4_5 != null) {
			super.aClass11_Sub4_5.method2631();
		}
	}

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method8313() {
		return false;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BII)V")
	public void method2782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray232[0];
		@Pc(15) int local15 = super.anIntArray233[0];
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
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt3258 != -1 && Static185.aClass303_1.method7201(super.anInt3258).anInt4517 == 1) {
			super.anIntArray226 = null;
			super.anInt3258 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(87) Class69 local87;
		if (super.anInt3270 != -1) {
			local87 = Static414.aClass356_2.method8213(super.anInt3270);
			if (local87.aBoolean152 && local87.anInt1820 != -1 && Static185.aClass303_1.method7201(local87.anInt1820).anInt4517 == 1) {
				super.anInt3270 = -1;
			}
		}
		if (super.anInt3229 != -1) {
			local87 = Static414.aClass356_2.method8213(super.anInt3229);
			if (local87.aBoolean152 && local87.anInt1820 != -1 && Static185.aClass303_1.method7201(local87.anInt1820).anInt4517 == 1) {
				super.anInt3229 = -1;
			}
		}
		if (super.anInt3296 < 9) {
			super.anInt3296++;
		}
		for (@Pc(154) int local154 = super.anInt3296; local154 > 0; local154--) {
			super.anIntArray232[local154] = super.anIntArray232[local154 - 1];
			super.anIntArray233[local154] = super.anIntArray233[local154 - 1];
			super.aByteArray31[local154] = super.aByteArray31[local154 - 1];
		}
		super.anIntArray232[0] = local10;
		super.anIntArray233[0] = local15;
		super.aByteArray31[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BILclient!ha;Lclient!gs;ZII)V")
	@Override
	public void method8316(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class11_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass236_1 == null || !this.method2783(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class6 local19 = arg0.method7892();
		@Pc(24) int local24 = super.aClass82_7.method1815();
		local19.method6692(local24);
		local19.method6694(super.anInt9925, super.anInt9930, super.anInt9929);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass25Array3.length; local39++) {
			if (super.aClass25Array3[local39] != null) {
				@Pc(66) boolean var10000;
				label41: {
					if (this.aClass236_1.anInt6885 <= 0) {
						label39: {
							if (this.aClass236_1.anInt6905 == -1) {
								if (this.aClass236_1.anInt6892 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass236_1.anInt6905 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(81) boolean local81 = var10000;
				@Pc(96) boolean local96;
				if (Static172.aBoolean322) {
					local96 = super.aClass25Array3[local39].method7730(arg2, arg1, local19, local81, this.aClass236_1.anInt6885, Static388.anInt6979);
				} else {
					local96 = super.aClass25Array3[local39].method7721(arg2, arg1, local19, local81, this.aClass236_1.anInt6885);
				}
				if (local96) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass25Array3[0] = super.aClass25Array3[1] = super.aClass25Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLclient!ha;I)Z")
	private boolean method2783(@OriginalArg(1) Class87 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class165 local11 = this.method2761();
		@Pc(26) Class149 local26 = super.anInt3258 != -1 && super.anInt3232 == 0 ? Static185.aClass303_1.method7201(super.anInt3258) : null;
		@Pc(50) Class149 local50 = super.anInt3253 == -1 || super.aBoolean275 && local26 != null ? null : Static185.aClass303_1.method7201(super.anInt3253);
		@Pc(53) int local53 = local11.anInt4883;
		@Pc(56) int local56 = local11.anInt4898;
		if (local53 != 0 || local56 != 0 || local11.anInt4891 != 0 || local11.anInt4896 != 0) {
			arg1 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte60 != 0 && Static325.anInt5888 >= super.anInt3271 && super.anInt3228 > Static325.anInt5888;
		if (local98) {
			arg1 |= 0x80000;
		}
		@Pc(109) int local109 = super.aClass82_7.method1815();
		@Pc(143) Class25 local143 = super.aClass25Array3[0] = this.aClass236_1.method5785(arg0, super.anInt3263, super.anInt3243, local50, super.anIntArray231, Static182.aClass140_1, super.anInt3235, local109, super.anInt3225, super.anInt3266, super.anInt3281, Static185.aClass303_1, Static438.aClass198_1, local26, super.aClass203Array3, arg1);
		if (local143 == null) {
			return false;
		}
		super.anInt3238 = local143.fa();
		super.anInt3213 = local143.ma();
		this.method2770(local143);
		if (local53 == 0 && local56 == 0) {
			this.method2772(this.method2778() << 9, local109, this.method2778() << 9, 0, 0);
		} else {
			this.method2772(local56, local109, local53, local11.anInt4909, local11.anInt4894);
			if (super.anInt3233 != 0) {
				super.aClass25Array3[0].FA(super.anInt3233);
			}
			if (super.anInt3256 != 0) {
				super.aClass25Array3[0].VA(super.anInt3256);
			}
			if (super.lb != 0) {
				super.aClass25Array3[0].H(0, super.lb, 0);
			}
		}
		if (local98) {
			local143.method7733(super.aByte61, super.aByte62, super.aByte63, super.aByte60 & 0xFF);
		}
		@Pc(266) Class69 local266;
		@Pc(281) boolean local281;
		@Pc(283) int local283;
		@Pc(336) Class25 local336;
		@Pc(354) int local354;
		@Pc(356) int local356;
		@Pc(358) int local358;
		@Pc(445) int local445;
		@Pc(474) int local474;
		@Pc(483) int local483;
		@Pc(487) int local487;
		@Pc(497) int local497;
		if (super.anInt3270 == -1 || super.anInt3214 == -1) {
			super.aClass25Array3[1] = null;
		} else {
			local266 = Static414.aClass356_2.method8213(super.anInt3270);
			local281 = local266.aByte45 == 3 && (local53 != 0 || local56 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt3230 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt3268 != 0) {
					local283 |= 0x2;
				}
				if (super.anInt3242 != 0) {
					local283 |= 0x7;
				}
			}
			local336 = super.aClass25Array3[1] = local266.method1581(super.anInt3227, super.anInt3214, arg0, super.anInt3254, local283, Static185.aClass303_1);
			if (local336 != null) {
				if (super.anInt3242 >= 0) {
					local354 = 0;
					local356 = 0;
					local358 = 0;
					if (local11.anIntArrayArray39 != null && local11.anIntArrayArray39[super.anInt3242] != null) {
						local358 = local11.anIntArrayArray39[super.anInt3242][2];
						local356 = local11.anIntArrayArray39[super.anInt3242][1];
						local354 = local11.anIntArrayArray39[super.anInt3242][0];
					}
					if (local11.anIntArrayArray40 != null && local11.anIntArrayArray40[super.anInt3242] != null) {
						local358 += local11.anIntArrayArray40[super.anInt3242][2];
						local356 += local11.anIntArrayArray40[super.anInt3242][1];
						local354 += local11.anIntArrayArray40[super.anInt3242][0];
					}
					if (local358 != 0 || local354 != 0) {
						local445 = local109;
						if (super.anIntArray231 != null && super.anIntArray231[super.anInt3242] != -1) {
							local445 = super.anIntArray231[super.anInt3242];
						}
						local474 = local445 + super.anInt3230 * 2048 - local109 & 0x3FFF;
						if (local474 != 0) {
							local336.a(local474);
						}
						local483 = Class353.anIntArray681[local474];
						local487 = Class353.anIntArray682[local474];
						local497 = local487 * local354 + local358 * local483 >> 14;
						local358 = local358 * local487 - local354 * local483 >> 14;
						local354 = local497;
					}
					local336.H(local354, local356, local358);
				} else if (super.anInt3230 != 0) {
					local336.a(super.anInt3230 * 2048);
				}
				if (super.anInt3268 != 0) {
					local336.H(0, -super.anInt3268 << 2, 0);
				}
				if (local281) {
					if (super.anInt3233 != 0) {
						local336.FA(super.anInt3233);
					}
					if (super.anInt3256 != 0) {
						local336.VA(super.anInt3256);
					}
					if (super.lb != 0) {
						local336.H(0, super.lb, 0);
					}
				}
			}
		}
		if (super.anInt3229 == -1 || super.anInt3208 == -1) {
			super.aClass25Array3[2] = null;
		} else {
			local266 = Static414.aClass356_2.method8213(super.anInt3229);
			local281 = local266.aByte45 == 3 && (local53 != 0 || local56 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt3247 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt3244 != 0) {
					local283 |= 0x2;
				}
				if (super.anInt3218 != 0) {
					local283 |= 0x7;
				}
			}
			local336 = super.aClass25Array3[2] = local266.method1579(local283, super.anInt3208, Static185.aClass303_1, super.anInt3210, arg0, super.anInt3231);
			if (local336 != null) {
				if (super.anInt3218 >= 0 && local11.anIntArrayArray39 != null && local11.anIntArrayArray39[super.anInt3218] != null) {
					local354 = 0;
					local356 = 0;
					local358 = 0;
					if (local11.anIntArrayArray39 != null && local11.anIntArrayArray39[super.anInt3218] != null) {
						local358 = local11.anIntArrayArray39[super.anInt3218][2];
						local356 = local11.anIntArrayArray39[super.anInt3218][1];
						local354 = local11.anIntArrayArray39[super.anInt3218][0];
					}
					if (local11.anIntArrayArray40 != null && local11.anIntArrayArray40[super.anInt3218] != null) {
						local358 += local11.anIntArrayArray40[super.anInt3218][2];
						local356 += local11.anIntArrayArray40[super.anInt3218][1];
						local354 += local11.anIntArrayArray40[super.anInt3218][0];
					}
					if (local358 != 0 || local354 != 0) {
						local445 = local109;
						if (super.anIntArray231 != null && super.anIntArray231[super.anInt3218] != -1) {
							local445 = super.anIntArray231[super.anInt3218];
						}
						local474 = local445 + super.anInt3247 * 2048 - local109 & 0x3FFF;
						if (local474 != 0) {
							local336.a(local474);
						}
						local483 = Class353.anIntArray681[local474];
						local487 = Class353.anIntArray682[local474];
						local497 = local483 * local358 + local487 * local354 >> 14;
						local358 = local487 * local358 - local354 * local483 >> 14;
						local354 = local497;
					}
					local336.H(local354, local356, local358);
				} else if (super.anInt3247 != 0) {
					local336.a(super.anInt3247 * 2048);
				}
				if (super.anInt3244 != 0) {
					local336.H(0, -super.anInt3244 << 2, 0);
				}
				if (local281) {
					if (super.anInt3233 != 0) {
						local336.FA(super.anInt3233);
					}
					if (super.anInt3256 != 0) {
						local336.VA(super.anInt3256);
					}
					if (super.lb != 0) {
						local336.H(0, super.lb, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		if (this.aClass236_1 == null || !this.method2783(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class6 local19 = arg0.method7892();
		@Pc(24) int local24 = super.aClass82_7.method1815();
		local19.method6692(local24);
		@Pc(42) Class217 local42 = Static440.aClass217ArrayArrayArray3[super.aByte124][super.anInt9925 >> Static415.anInt7579][super.anInt9929 >> Static415.anInt7579];
		if (local42 == null || local42.aClass11_Sub1_Sub4_1 == null) {
			super.anInt3280 = (int) ((float) super.anInt3280 - (float) super.anInt3280 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt3280 - local42.aClass11_Sub1_Sub4_1.aShort113;
			super.anInt3280 = (int) ((float) super.anInt3280 - (float) local55 / 10.0F);
		}
		local19.method6694(super.anInt9925, super.anInt9930 - super.anInt3280 - 20, super.anInt9929);
		@Pc(103) Class165 local103 = this.method2761();
		@Pc(116) Class236 local116 = this.aClass236_1.anIntArray462 == null ? this.aClass236_1 : this.aClass236_1.method5779(Static438.aClass198_1);
		super.aBoolean278 = false;
		@Pc(121) Class11_Sub10 local121 = null;
		if (Static404.aClass2_Sub13_2.aClass33_Sub15_1.method4903() == 1 && local116.aBoolean514 && local103.aBoolean395) {
			@Pc(150) Class149 local150 = super.anInt3258 != -1 && super.anInt3232 == 0 ? Static185.aClass303_1.method7201(super.anInt3258) : null;
			@Pc(168) Class149 local168 = super.anInt3253 == -1 || super.aBoolean275 && local150 != null ? null : Static185.aClass303_1.method7201(super.anInt3253);
			@Pc(218) Class25 local218 = Static51.method993(this.aClass236_1.aByte101 & 0xFF, this.aClass236_1.aShort99 & 0xFFFF, this.aClass236_1.anInt6892, super.aClass25Array3[0], arg0, local24, super.lb, local168 == null ? super.anInt3263 : super.anInt3281, super.anInt3233, this.aClass236_1.aByte100 & 0xFF, super.anInt3256, this.aClass236_1.aShort98 & 0xFFFF, local168 == null ? local150 : local168);
			if (local218 != null) {
				local121 = Static600.method8238(super.aClass25Array3.length + 1, this.method2784());
				super.aBoolean278 = true;
				arg0.C(false);
				if (Static172.aBoolean322) {
					local218.method7725(local19, local121.aClass11_Sub7Array1[super.aClass25Array3.length], Static388.anInt6979, 0);
				} else {
					local218.method7735(local19, local121.aClass11_Sub7Array1[super.aClass25Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method6692(local24);
		local19.method6694(super.anInt9925, -super.anInt3280 + super.anInt9930 - 5, super.anInt9929);
		if (local121 == null) {
			local121 = Static600.method8238(super.aClass25Array3.length, this.method2784());
		}
		this.method2764(local19, super.aClass25Array3, arg0, false);
		@Pc(305) int local305;
		if (Static172.aBoolean322) {
			for (local305 = 0; local305 < super.aClass25Array3.length; local305++) {
				if (super.aClass25Array3[local305] != null) {
					super.aClass25Array3[local305].method7725(local19, local121.aClass11_Sub7Array1[local305], Static388.anInt6979, 0);
				}
			}
		} else {
			for (local305 = 0; local305 < super.aClass25Array3.length; local305++) {
				if (super.aClass25Array3[local305] != null) {
					super.aClass25Array3[local305].method7735(local19, local121.aClass11_Sub7Array1[local305], 0);
				}
			}
		}
		if (super.aClass11_Sub4_5 != null) {
			@Pc(365) Class247 local365 = super.aClass11_Sub4_5.method2638();
			if (Static172.aBoolean322) {
				arg0.method7972(local365, Static388.anInt6979);
			} else {
				arg0.method7939(local365);
			}
		}
		for (local305 = 0; super.aClass25Array3.length > local305; local305++) {
			if (super.aClass25Array3[local305] != null) {
				super.aBoolean278 |= super.aClass25Array3[local305].F();
			}
		}
		super.aClass25Array3[0] = super.aClass25Array3[1] = super.aClass25Array3[2] = null;
		super.anInt3211 = Static143.anInt3169;
		return local121;
	}

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "(B)Z")
	private boolean method2784() {
		return this.aClass236_1.aBoolean515;
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
		if (this.aClass236_1 == null || !super.aBoolean279 && !this.method2783(arg0, 0)) {
			return;
		}
		@Pc(27) Class6 local27 = arg0.method7892();
		local27.method6692(super.aClass82_7.method1815());
		local27.method6694(super.anInt9925, super.anInt9930 - 20, super.anInt9929);
		this.method2764(local27, super.aClass25Array3, arg0, super.aBoolean279);
		super.aClass25Array3[0] = super.aClass25Array3[1] = super.aClass25Array3[2] = null;
	}

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "(I)I")
	@Override
	public int method2775() {
		if (this.aClass236_1.anIntArray462 != null) {
			@Pc(18) Class236 local18 = this.aClass236_1.method5779(Static438.aClass198_1);
			if (local18 != null && local18.anInt6904 != -1) {
				return local18.anInt6904;
			}
		}
		return this.aClass236_1.anInt6904;
	}

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "(I)I")
	@Override
	public int method2776() {
		if (this.aClass236_1.anIntArray462 != null) {
			@Pc(18) Class236 local18 = this.aClass236_1.method5779(Static438.aClass198_1);
			if (local18 != null && local18.anInt6926 != -1) {
				return local18.anInt6926;
			}
		}
		return this.aClass236_1.anInt6926 == -1 ? super.method2776() : this.aClass236_1.anInt6926;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!np;I)V")
	public void method2785(@OriginalArg(0) Class236 arg0) {
		this.aClass236_1 = arg0;
		if (super.aClass11_Sub4_5 != null) {
			super.aClass11_Sub4_5.method2631();
		}
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)I")
	@Override
	protected int method2769() {
		if (this.aClass236_1.anIntArray462 != null) {
			@Pc(21) Class236 local21 = this.aClass236_1.method5779(Static438.aClass198_1);
			if (local21 != null && local21.anInt6898 != -1) {
				return local21.anInt6898;
			}
		}
		return this.aClass236_1.anInt6898;
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "(B)I")
	@Override
	public int method8305() {
		return this.aClass236_1 == null ? 0 : this.aClass236_1.anInt6885;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return null;
	}
}
