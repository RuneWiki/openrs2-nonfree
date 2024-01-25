import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class41_Sub2_Sub1_Sub4_Sub2 extends Class41_Sub2_Sub1_Sub4 {

	@OriginalMember(owner = "client!wn", name = "Sc", descriptor = "I")
	public int anInt9537;

	@OriginalMember(owner = "client!wn", name = "Wc", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!wn", name = "ad", descriptor = "Lclient!ea;")
	public Class78 aClass78_1;

	@OriginalMember(owner = "client!wn", name = "jd", descriptor = "I")
	public int anInt9550;

	@OriginalMember(owner = "client!wn", name = "nd", descriptor = "I")
	private int anInt9554;

	@OriginalMember(owner = "client!wn", name = "Ed", descriptor = "Ljava/lang/String;")
	public String aString96;

	@OriginalMember(owner = "client!wn", name = "Uc", descriptor = "I")
	public int anInt9539 = -1;

	@OriginalMember(owner = "client!wn", name = "Yc", descriptor = "Z")
	public boolean aBoolean743 = false;

	@OriginalMember(owner = "client!wn", name = "bd", descriptor = "Z")
	public boolean aBoolean744 = false;

	@OriginalMember(owner = "client!wn", name = "sd", descriptor = "I")
	public int anInt9557 = -1;

	@OriginalMember(owner = "client!wn", name = "rd", descriptor = "Z")
	public boolean aBoolean745 = false;

	@OriginalMember(owner = "client!wn", name = "od", descriptor = "I")
	public int anInt9555 = -1;

	@OriginalMember(owner = "client!wn", name = "id", descriptor = "I")
	public int anInt9549 = -1;

	@OriginalMember(owner = "client!wn", name = "vd", descriptor = "I")
	public int anInt9560 = -1;

	@OriginalMember(owner = "client!wn", name = "Xc", descriptor = "I")
	public int anInt9541 = -1;

	@OriginalMember(owner = "client!wn", name = "Hd", descriptor = "Z")
	public boolean aBoolean746 = false;

	@OriginalMember(owner = "client!wn", name = "Zc", descriptor = "I")
	public int anInt9542 = 0;

	@OriginalMember(owner = "client!wn", name = "Dd", descriptor = "I")
	public int anInt9567 = -1;

	@OriginalMember(owner = "client!wn", name = "Id", descriptor = "B")
	private byte aByte126 = 0;

	@OriginalMember(owner = "client!wn", name = "Fd", descriptor = "B")
	private byte aByte125 = 0;

	@OriginalMember(owner = "client!wn", name = "Nd", descriptor = "I")
	public int anInt9572 = 0;

	@OriginalMember(owner = "client!wn", name = "Jd", descriptor = "Z")
	public boolean aBoolean747 = false;

	@OriginalMember(owner = "client!wn", name = "Pd", descriptor = "I")
	public int anInt9574 = 0;

	@OriginalMember(owner = "client!wn", name = "xd", descriptor = "B")
	private byte aByte124 = 0;

	@OriginalMember(owner = "client!wn", name = "Qd", descriptor = "I")
	public int anInt9575 = -1;

	@OriginalMember(owner = "client!wn", name = "Rd", descriptor = "I")
	public int anInt9576 = 255;

	@OriginalMember(owner = "client!wn", name = "Ld", descriptor = "I")
	public int anInt9570 = 0;

	@OriginalMember(owner = "client!wn", name = "Md", descriptor = "I")
	public int anInt9571 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	public void method7871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt9533 = 0;
		super.anInt9535 = 0;
		super.anIntArray629[0] = arg0;
		super.anInt9534 = 0;
		super.anIntArray628[0] = arg1;
		@Pc(34) int local34 = this.method7858();
		super.anInt9442 = super.anIntArray628[0] * 512 + local34 * 256;
		super.anInt9444 = super.anIntArray629[0] * 512 + local34 * 256;
		if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == this) {
			Static428.method6060();
		}
		if (super.aClass41_Sub9_6 != null) {
			super.aClass41_Sub9_6.method7730();
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!r;)Z")
	private boolean method7872(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class365 local11 = this.method7861();
		@Pc(26) Class185 local26 = super.anInt9489 != -1 && super.anInt9509 == 0 ? Static545.aClass240_2.method5680(super.anInt9489) : null;
		@Pc(46) Class185 local46 = super.anInt9512 == -1 || this.aBoolean745 || super.aBoolean739 && local26 != null ? null : Static545.aClass240_2.method5680(super.anInt9512);
		@Pc(49) int local49 = local11.anInt9753;
		@Pc(52) int local52 = local11.anInt9743;
		if (local49 != 0 || local52 != 0 || local11.anInt9754 != 0 || local11.anInt9721 != 0) {
			arg0 |= 0x7;
		}
		@Pc(88) boolean local88 = super.aByte120 != 0 && super.anInt9493 <= Static506.anInt8251 && super.anInt9511 > Static506.anInt8251;
		if (local88) {
			arg0 |= 0x80000;
		}
		@Pc(129) Class60 local129 = super.aClass60Array3[0] = this.aClass78_1.method1908(super.aClass152Array3, Static6.aClass92_1, Static43.aClass23_1, local46, Static491.aClass318_1, super.anInt9460, super.anInt9462, arg1, Static545.aClass240_2, arg0, Static401.aClass33_1, super.anInt9478, Static361.aClass229_13, local26, super.anInt9473, super.anInt9526, super.anInt9527);
		@Pc(132) int local132 = Static5.method79();
		if (Static350.anInt6083 < 96 && local132 > 50) {
			Static587.method7878();
		}
		@Pc(165) int local165;
		if (Static516.aClass272_11 != Static478.aClass272_10 && local132 < 50) {
			local165 = 50 - local132;
			while (local165 > Static421.anInt7166) {
				Static46.aByteArrayArray3[Static421.anInt7166] = new byte[102400];
				Static421.anInt7166++;
			}
			while (local165 < Static421.anInt7166) {
				Static421.anInt7166--;
				Static46.aByteArrayArray3[Static421.anInt7166] = null;
			}
		} else if (Static478.aClass272_10 != Static516.aClass272_11) {
			Static46.aByteArrayArray3 = new byte[50][];
			Static421.anInt7166 = 0;
		}
		if (local129 == null) {
			return false;
		}
		super.anInt9514 = local129.J();
		super.anInt9464 = local129.RA();
		this.method7856(local129);
		local165 = super.aClass259_7.method5914();
		if (local49 == 0 && local52 == 0) {
			this.method7869(0, 0, this.method7858() << 9, this.method7858() << 9, local165);
		} else {
			this.method7869(local11.anInt9731, local11.anInt9751, local52, local49, local165);
			if (super.anInt9461 != 0) {
				local129.MA(super.anInt9461);
			}
			if (super.anInt9481 != 0) {
				local129.W(super.anInt9481);
			}
			if (super.lb != 0) {
				local129.oa(0, super.lb, 0);
			}
		}
		if (local88) {
			local129.method7232(super.aByte122, super.aByte121, super.aByte123, super.aByte120 & 0xFF);
		}
		@Pc(312) Class284 local312;
		@Pc(329) boolean local329;
		@Pc(331) int local331;
		@Pc(374) Class60 local374;
		if (this.aBoolean745 || super.anInt9528 == -1 || super.anInt9525 == -1) {
			super.aClass60Array3[1] = null;
		} else {
			local312 = Static368.aClass278_1.method6127(super.anInt9528);
			local329 = local312.aByte96 == 3 && (local49 != 0 || local52 != 0);
			local331 = local7;
			if (local329) {
				local331 = local7 | 0x7;
			} else {
				if (super.anInt9515 != 0) {
					local331 = local7 | 0x5;
				}
				if (super.anInt9454 != 0) {
					local331 |= 0x2;
				}
			}
			local374 = super.aClass60Array3[1] = local312.method6244(local331, Static545.aClass240_2, arg1, super.anInt9498, super.anInt9525, super.anInt9470);
			if (local374 != null) {
				if (super.anInt9454 != 0) {
					local374.oa(0, -super.anInt9454 << 2, 0);
				}
				if (super.anInt9515 != 0) {
					local374.M(super.anInt9515 * 2048);
				}
				if (local329) {
					if (super.anInt9461 != 0) {
						local374.MA(super.anInt9461);
					}
					if (super.anInt9481 != 0) {
						local374.W(super.anInt9481);
					}
					if (super.lb != 0) {
						local374.oa(0, super.lb, 0);
					}
				}
			}
		}
		if (this.aBoolean745 || super.anInt9482 == -1 || super.anInt9455 == -1) {
			super.aClass60Array3[2] = null;
		} else {
			local312 = Static368.aClass278_1.method6127(super.anInt9482);
			local329 = local312.aByte96 == 3 && (local49 != 0 || local52 != 0);
			local331 = local7;
			if (local329) {
				local331 = local7 | 0x7;
			} else {
				if (super.anInt9467 != 0) {
					local331 = local7 | 0x5;
				}
				if (super.anInt9497 != 0) {
					local331 |= 0x2;
				}
			}
			local374 = super.aClass60Array3[2] = local312.method6242(arg1, local331, Static545.aClass240_2, super.anInt9523, super.anInt9477, super.anInt9455);
			if (local374 != null) {
				if (super.anInt9497 != 0) {
					local374.oa(0, -super.anInt9497 << 2, 0);
				}
				if (super.anInt9467 != 0) {
					local374.M(super.anInt9467 * 2048);
				}
				if (local329) {
					if (super.anInt9461 != 0) {
						local374.MA(super.anInt9461);
					}
					if (super.anInt9481 != 0) {
						local374.W(super.anInt9481);
					}
					if (super.lb != 0) {
						local374.oa(0, super.lb, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		if (this.aClass78_1 == null || !this.method7872(2048, arg0)) {
			return null;
		}
		@Pc(19) Class11 local19 = arg0.method7397();
		@Pc(24) int local24 = super.aClass259_7.method5914();
		local19.o(local24);
		@Pc(42) Class299 local42 = Static309.aClass299ArrayArrayArray3[super.aByte117][super.anInt9444 >> Static315.anInt5369][super.anInt9442 >> Static315.anInt5369];
		@Pc(55) int local55;
		if (local42 == null || local42.aClass41_Sub2_Sub5_1 == null) {
			super.anInt9508 = (int) ((float) super.anInt9508 - (float) super.anInt9508 / 10.0F);
		} else {
			local55 = super.anInt9508 - local42.aClass41_Sub2_Sub5_1.aShort64;
			super.anInt9508 = (int) ((float) super.anInt9508 - (float) local55 / 10.0F);
		}
		local19.U(super.anInt9444, super.anInt9443 - super.anInt9508 - 20, super.anInt9442);
		super.aBoolean742 = false;
		if (Static405.aClass3_Sub3_Sub1_1.aBoolean576) {
			@Pc(104) Class365 local104 = this.method7861();
			if (local104.aBoolean767 && (this.aClass78_1.anInt2165 == -1 || Static361.aClass229_13.method5396(this.aClass78_1.anInt2165).aBoolean534)) {
				@Pc(139) Class185 local139 = super.anInt9489 != -1 && super.anInt9509 == 0 ? Static545.aClass240_2.method5680(super.anInt9489) : null;
				@Pc(160) Class185 local160 = super.anInt9512 == -1 || this.aBoolean745 || super.aBoolean739 && local139 != null ? null : Static545.aClass240_2.method5680(super.anInt9512);
				@Pc(192) Class60 local192 = Static596.method7950(0, 160, local24, super.lb, super.anInt9481, local160 == null ? local139 : local160, 1, local160 == null ? super.anInt9473 : super.anInt9526, super.anInt9461, 0, super.aClass60Array3[0], 240, arg0);
				if (local192 != null) {
					super.aBoolean742 = true;
					arg0.ZA(false);
					if (Static453.aBoolean599) {
						local192.method7224(local19, null, Static340.anInt5962, 0);
					} else {
						local192.method7230(local19, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == this) {
			local19.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			for (local55 = Static283.aClass205Array1.length - 1; local55 >= 0; local55--) {
				@Pc(240) Class205 local240 = Static283.aClass205Array1[local55];
				if (local240 != null && local240.anInt5478 != -1) {
					@Pc(270) int local270;
					if (local240.anInt5477 == 1) {
						@Pc(258) Class3_Sub34 local258 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local240.anInt5482);
						if (local258 != null) {
							@Pc(263) Class41_Sub2_Sub1_Sub4_Sub1 local263 = local258.aClass41_Sub2_Sub1_Sub4_Sub1_2;
							local270 = local263.anInt9444 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444;
							@Pc(277) int local277 = local263.anInt9442 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442;
							if (Static453.aBoolean599) {
								this.method7881(Static340.anInt5962, super.aClass60Array3[0], arg0, 92160000, local240.anInt5478, local277, local270, local19);
							} else {
								this.method7882(local277, super.aClass60Array3[0], 92160000, local240.anInt5478, arg0, local270, local19);
							}
						}
					}
					@Pc(334) int local334;
					if (local240.anInt5477 == 2) {
						@Pc(325) int local325 = local240.anInt5481 + 256 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444;
						local334 = local240.anInt5474 + 256 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442;
						local270 = local240.anInt5473 << 9;
						local270 *= local270;
						if (Static453.aBoolean599) {
							this.method7881(Static340.anInt5962, super.aClass60Array3[0], arg0, local270, local240.anInt5478, local334, local325, local19);
						} else {
							this.method7882(local334, super.aClass60Array3[0], local270, local240.anInt5478, arg0, local325, local19);
						}
					}
					if (local240.anInt5477 == 10 && local240.anInt5482 >= 0 && Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1.length > local240.anInt5482) {
						@Pc(399) Class41_Sub2_Sub1_Sub4_Sub2 local399 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local240.anInt5482];
						if (local399 != null) {
							local334 = local399.anInt9444 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444;
							local270 = local399.anInt9442 - Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442;
							if (Static453.aBoolean599) {
								this.method7881(Static340.anInt5962, super.aClass60Array3[0], arg0, 92160000, local240.anInt5478, local270, local334, local19);
							} else {
								this.method7882(local270, super.aClass60Array3[0], 92160000, local240.anInt5478, arg0, local334, local19);
							}
						}
					}
				}
			}
			local19.o(local24);
			local19.U(super.anInt9444, super.anInt9443, super.anInt9442);
		}
		local19.o(local24);
		local19.U(super.anInt9444, super.anInt9443 - super.anInt9508 - 5, super.anInt9442);
		@Pc(486) Class41_Sub10 local486 = Static458.method6411(super.aClass60Array3.length);
		this.method7866(arg0, super.aClass60Array3, local19, false);
		@Pc(498) int local498;
		if (Static453.aBoolean599) {
			for (local498 = 0; super.aClass60Array3.length > local498; local498++) {
				if (super.aClass60Array3[local498] != null) {
					super.aClass60Array3[local498].method7224(local19, local486.aClass41_Sub8Array1[local498], Static340.anInt5962, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local498 = 0; super.aClass60Array3.length > local498; local498++) {
				if (super.aClass60Array3[local498] != null) {
					super.aClass60Array3[local498].method7230(local19, local486.aClass41_Sub8Array1[local498], Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass41_Sub9_6 != null) {
			@Pc(572) Class283 local572 = super.aClass41_Sub9_6.method7724();
			if (Static453.aBoolean599) {
				arg0.method7358(local572, Static340.anInt5962);
			} else {
				arg0.method7396(local572);
			}
		}
		for (local498 = 0; super.aClass60Array3.length > local498; local498++) {
			if (super.aClass60Array3[local498] != null) {
				super.aBoolean742 |= super.aClass60Array3[local498].LA();
			}
		}
		super.anInt9500 = Static81.anInt1761;
		super.aClass60Array3[0] = super.aClass60Array3[1] = super.aClass60Array3[2] = null;
		return local486;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!np;)V")
	public void method7873(@OriginalArg(1) Class3_Sub11 arg0) {
		arg0.anInt6128 = 0;
		@Pc(12) int local12 = arg0.method5175();
		this.aByte126 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean744;
		this.aBoolean744 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method7858();
		this.method7859((local12 >> 3 & 0x7) + 1);
		this.aByte124 = (byte) (local12 >> 6 & 0x3);
		super.anInt9444 += this.method7858() - local48 << 8;
		super.anInt9442 += this.method7858() - local48 << 8;
		this.aByte125 = arg0.method5212();
		this.anInt9557 = arg0.method5212();
		this.anInt9575 = arg0.method5212();
		this.aBoolean746 = arg0.method5212() == 1;
		if (Static500.anInt8114 >= 2) {
			this.aBoolean746 = false;
		}
		@Pc(131) int local131 = -1;
		this.anInt9574 = 0;
		@Pc(137) int[] local137 = new int[12];
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(204) int local204;
		for (@Pc(139) int local139 = 0; local139 < 12; local139++) {
			@Pc(145) int local145 = arg0.method5175();
			if (local145 == 0) {
				local137[local139] = 0;
			} else {
				local157 = arg0.method5175();
				local163 = (local145 << 8) + local157;
				if (local139 == 0 && local163 == 65535) {
					local131 = arg0.method5198();
					this.anInt9574 = arg0.method5175();
					break;
				}
				if (local163 >= 32768) {
					local163 = Static136.anIntArray135[local163 - 32768];
					local137[local139] = local163 | 0x40000000;
					local204 = Static6.aClass92_1.method2673(local163).anInt5197;
					if (local204 != 0) {
						this.anInt9574 = local204;
					}
				} else {
					local137[local139] = Integer.MIN_VALUE | local163 - 256;
				}
			}
		}
		@Pc(231) int[] local231 = new int[5];
		for (local157 = 0; local157 < 5; local157++) {
			local163 = arg0.method5175();
			if (Static158.aShortArrayArrayArray1.length < 1 || local163 < 0 || Static158.aShortArrayArrayArray1[0][local157].length <= local163) {
				local163 = 0;
			}
			local231[local157] = local163;
		}
		this.anInt9554 = arg0.method5198();
		this.aString96 = arg0.method5181();
		this.aString95 = this.aString96;
		this.anInt9571 = arg0.method5175();
		if (local44) {
			this.anInt9572 = arg0.method5198();
			this.anInt9542 = this.anInt9571;
			this.anInt9539 = -1;
			if (this.anInt9572 == 65535) {
				this.anInt9572 = -1;
			}
		} else {
			this.anInt9572 = 0;
			this.anInt9542 = arg0.method5175();
			this.anInt9539 = arg0.method5175();
			if (this.anInt9539 == 255) {
				this.anInt9539 = -1;
			}
		}
		local163 = this.anInt9570;
		this.anInt9570 = arg0.method5175();
		@Pc(358) int local358;
		if (this.anInt9570 == 0) {
			Static350.method5140(this);
		} else {
			local204 = this.anInt9549;
			@Pc(355) int local355 = this.anInt9567;
			local358 = this.anInt9555;
			@Pc(361) int local361 = this.anInt9541;
			@Pc(364) int local364 = this.anInt9576;
			this.anInt9549 = arg0.method5198();
			this.anInt9567 = arg0.method5198();
			this.anInt9555 = arg0.method5198();
			this.anInt9541 = arg0.method5198();
			this.anInt9576 = arg0.method5175();
			if (this.aBoolean744 != local21 || local163 != this.anInt9570 || this.anInt9549 != local204 || local355 != this.anInt9567 || local358 != this.anInt9555 || this.anInt9541 != local361 || this.anInt9576 != local364) {
				Static114.method1961(this);
			}
		}
		if (this.aClass78_1 == null) {
			this.aClass78_1 = new Class78();
		}
		local204 = this.aClass78_1.anInt2165;
		@Pc(452) int[] local452 = this.aClass78_1.anIntArray97;
		this.aClass78_1.method1917(local231, this.method7868(), local131, local137, this.aByte126 == 1);
		if (local131 != local204) {
			super.anInt9444 = (super.anIntArray629[0] << 9) + (this.method7858() << 8);
			super.anInt9442 = (super.anIntArray628[0] << 9) + (this.method7858() << 8);
		}
		if (super.anInt9472 == Static166.anInt3327 && local452 != null) {
			for (local358 = 0; local358 < local231.length; local358++) {
				if (local231[local358] != local452[local358]) {
					Static6.aClass92_1.method2674();
					break;
				}
			}
		}
		if (super.aClass41_Sub9_6 != null) {
			super.aClass41_Sub9_6.method7730();
		}
		if (super.anInt9512 == -1 || !super.aBoolean739) {
			return;
		}
		@Pc(555) Class365 local555 = this.method7861();
		if (!local555.method7940(super.anInt9512)) {
			super.anInt9512 = -1;
			super.aBoolean739 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "(I)Z")
	public boolean method7876() {
		return this.aClass78_1 != null;
	}

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass78_1 == null || !this.method7872(131072, arg0)) {
			return false;
		}
		@Pc(19) Class11 local19 = arg0.method7397();
		@Pc(24) int local24 = super.aClass259_7.method5914();
		local19.o(local24);
		local19.U(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass60Array3.length > local39; local39++) {
			if (super.aClass60Array3[local39] != null && (Static453.aBoolean599 ? super.aClass60Array3[local39].method7237(arg1, arg2, local19, true, Static340.anInt5962) : super.aClass60Array3[local39].method7246(arg1, arg2, local19, true))) {
				local37 = true;
				break;
			}
		}
		super.aClass60Array3[0] = super.aClass60Array3[1] = super.aClass60Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "(I)I")
	@Override
	protected int method7868() {
		return this.anInt9554;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBII)V")
	public void method7877(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt9535 < 9) {
			super.anInt9535++;
		}
		for (@Pc(20) int local20 = super.anInt9535; local20 > 0; local20--) {
			super.anIntArray629[local20] = super.anIntArray629[local20 - 1];
			super.anIntArray628[local20] = super.anIntArray628[local20 - 1];
			super.aByteArray102[local20] = super.aByteArray102[local20 - 1];
		}
		super.anIntArray629[0] = arg2;
		super.anIntArray628[0] = arg0;
		super.aByteArray102[0] = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method7879() {
		return this.aString95;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIB)V")
	public void method7880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt9489 != -1 && Static545.aClass240_2.method5680(super.anInt9489).anInt4985 == 1) {
			super.anIntArray627 = null;
			super.anInt9489 = -1;
		}
		@Pc(33) Class284 local33;
		if (super.anInt9528 != -1) {
			local33 = Static368.aClass278_1.method6127(super.anInt9528);
			if (local33.aBoolean565 && local33.anInt7490 != -1 && Static545.aClass240_2.method5680(local33.anInt7490).anInt4985 == 1) {
				super.anInt9528 = -1;
			}
		}
		if (super.anInt9482 != -1) {
			local33 = Static368.aClass278_1.method6127(super.anInt9482);
			if (local33.aBoolean565 && local33.anInt7490 != -1 && Static545.aClass240_2.method5680(local33.anInt7490).anInt4985 == 1) {
				super.anInt9482 = -1;
			}
		}
		this.anInt9560 = -1;
		if (arg0 < 0 || arg0 >= Static54.anInt1038 || arg1 < 0 || Static140.anInt3026 <= arg1) {
			this.method7871(arg0, arg1);
		} else if (super.anIntArray629[0] >= 0 && Static54.anInt1038 > super.anIntArray629[0] && super.anIntArray628[0] >= 0 && Static140.anInt3026 > super.anIntArray628[0]) {
			if (arg2 == 2) {
				Static355.method5378(arg1, this, arg0);
			}
			this.method7877(arg1, arg2, arg0);
		} else {
			this.method7871(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	@Override
	public int method7858() {
		return this.aClass78_1 == null || this.aClass78_1.anInt2165 == -1 ? super.method7858() : Static361.aClass229_13.method5396(this.aClass78_1.anInt2165).anInt7163;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
		if (this.aClass78_1 == null || !super.aBoolean741 && !this.method7872(0, arg0)) {
			return;
		}
		@Pc(20) Class11 local20 = arg0.method7397();
		local20.o(super.aClass259_7.method5914());
		local20.U(super.anInt9444, super.anInt9443 - 5, super.anInt9442);
		this.method7866(arg0, super.aClass60Array3, local20, super.aBoolean741);
		super.aClass60Array3[0] = super.aClass60Array3[1] = super.aClass60Array3[2] = null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!da;BLclient!r;IIIILclient!q;)V")
	private void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) Class45 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class11 arg7) {
		@Pc(12) int local12 = arg6 * arg6 + arg5 * arg5;
		if (local12 < 262144 || local12 > arg3) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg6, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(53) Class60 local53 = Static278.method4185(super.anInt9461, super.anInt9481, arg2, arg4, local34, super.lb);
		if (local53 != null) {
			arg2.ZA(false);
			local53.method7224(arg7, null, arg0, 0);
			arg2.ZA(true);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!da;IILclient!r;IILclient!q;)V")
	private void method7882(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class45 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class11 arg6) {
		@Pc(12) int local12 = arg5 * arg5 + arg0 * arg0;
		if (local12 < 262144 || local12 > arg2) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg5, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class60 local52 = Static278.method4185(super.anInt9461, super.anInt9481, arg4, arg3, local40, super.lb);
		if (local52 != null) {
			arg4.ZA(false);
			local52.method7230(arg6, null, 0);
			arg4.ZA(true);
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method7884() {
		@Pc(13) String local13 = "";
		if (Static453.aStringArray31 != null) {
			local13 = local13 + Static453.aStringArray31[this.aByte124];
		}
		@Pc(37) int[] local37;
		if (this.aByte126 == 1 && Static199.anIntArray198 != null) {
			local37 = Static199.anIntArray198;
		} else {
			local37 = Static587.anIntArray630;
		}
		if (local37 != null && local37[this.aByte124] != -1) {
			@Pc(60) Class233 local60 = Static584.aClass138_1.method3398(local37[this.aByte124]);
			if (local60.aChar5 == 's') {
				local13 = local13 + local60.method5426(this.aByte125 & 0xFF);
			} else {
				Static172.method7826(new Throwable(), "gdn1");
				local37[this.aByte124] = -1;
			}
		}
		local13 = local13 + this.aString96;
		if (Static421.aStringArray29 != null) {
			local13 = local13 + Static421.aStringArray29[this.aByte124];
		}
		return local13;
	}

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "(I)I")
	@Override
	public int method7864() {
		return -1;
	}
}
