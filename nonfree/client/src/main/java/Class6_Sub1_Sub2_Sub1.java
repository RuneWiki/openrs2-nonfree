import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class6_Sub1_Sub2_Sub1 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!eca", name = "Jc", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!eca", name = "Tc", descriptor = "I")
	private int anInt2292;

	@OriginalMember(owner = "client!eca", name = "Yc", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!eca", name = "od", descriptor = "I")
	public int anInt2308;

	@OriginalMember(owner = "client!eca", name = "pd", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!eca", name = "qd", descriptor = "Lclient!vv;")
	public Class312 aClass312_1;

	@OriginalMember(owner = "client!eca", name = "Ec", descriptor = "I")
	public int anInt2280 = -1;

	@OriginalMember(owner = "client!eca", name = "Lc", descriptor = "I")
	public int anInt2284 = 0;

	@OriginalMember(owner = "client!eca", name = "Nc", descriptor = "I")
	public int anInt2286 = 255;

	@OriginalMember(owner = "client!eca", name = "gd", descriptor = "I")
	public int anInt2300 = -1;

	@OriginalMember(owner = "client!eca", name = "Kc", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!eca", name = "Zc", descriptor = "B")
	private byte aByte24 = 0;

	@OriginalMember(owner = "client!eca", name = "Sc", descriptor = "I")
	public int anInt2291 = -1;

	@OriginalMember(owner = "client!eca", name = "id", descriptor = "I")
	public int anInt2302 = 0;

	@OriginalMember(owner = "client!eca", name = "td", descriptor = "B")
	private byte aByte25 = 0;

	@OriginalMember(owner = "client!eca", name = "rd", descriptor = "I")
	public int anInt2309 = 0;

	@OriginalMember(owner = "client!eca", name = "Rc", descriptor = "I")
	public int anInt2290 = -1;

	@OriginalMember(owner = "client!eca", name = "wd", descriptor = "Z")
	public boolean aBoolean165 = false;

	@OriginalMember(owner = "client!eca", name = "kd", descriptor = "I")
	public int anInt2304 = -1;

	@OriginalMember(owner = "client!eca", name = "ld", descriptor = "I")
	public int anInt2305 = -1;

	@OriginalMember(owner = "client!eca", name = "zd", descriptor = "I")
	public int anInt2314 = -1;

	@OriginalMember(owner = "client!eca", name = "ud", descriptor = "I")
	public int anInt2310 = -1;

	@OriginalMember(owner = "client!eca", name = "Wc", descriptor = "Z")
	public boolean aBoolean163 = false;

	@OriginalMember(owner = "client!eca", name = "Xc", descriptor = "B")
	private byte aByte23 = 0;

	@OriginalMember(owner = "client!eca", name = "Cd", descriptor = "I")
	public int anInt2317 = 0;

	@OriginalMember(owner = "client!eca", name = "Ed", descriptor = "I")
	public int anInt2318 = 0;

	@OriginalMember(owner = "client!eca", name = "sd", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(III)V")
	public void method2044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt8600 = 0;
		super.anIntArray733[0] = arg0;
		super.anInt8599 = 0;
		super.anInt8598 = 0;
		super.anIntArray734[0] = arg1;
		@Pc(26) int local26 = this.method7083();
		super.anInt8813 = super.anIntArray734[0] * 512 + local26 * 256;
		super.anInt8811 = super.anIntArray733[0] * 512 + local26 * 256;
		if (Static111.aClass6_Sub1_Sub2_Sub1_3 == this) {
			Static245.method4229();
		}
		if (super.aClass4_Sub4_8 != null) {
			super.aClass4_Sub4_8.method4589();
		}
	}

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!q;Lclient!ba;IILclient!oa;III)V")
	private void method2045(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg4 * arg4 + arg2 * arg2;
		if (local11 < 262144 || local11 > arg6) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg4, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class2 local51 = Static348.method5670(super.anInt8564, local39, arg5, super.anInt8572, arg3, super.anInt8574);
		if (local51 != null) {
			arg3.method7412(false);
			local51.method5774(arg0, null, 0);
			arg3.method7412(true);
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "(B)I")
	@Override
	public int method7073() {
		return -1;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7083() {
		return this.aClass312_1 == null || this.aClass312_1.anInt9133 == -1 ? super.method7083() : Static345.aClass154_1.method4157(this.aClass312_1.anInt9133).anInt7040;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		if (this.aClass312_1 == null || !this.method2050(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class205 local19 = arg0.method7448();
		@Pc(31) int local31 = super.aClass173_7.method4694();
		local19.a(local31);
		local19.G(super.anInt8811, super.anInt8814 - 20, super.anInt8813);
		@Pc(109) int local109;
		if (Static7.aClass3_Sub15_Sub1_1.aBoolean608) {
			@Pc(51) Class73 local51 = this.method7088();
			if (local51.aBoolean168 && (this.aClass312_1.anInt9133 == -1 || Static345.aClass154_1.method4157(this.aClass312_1.anInt9133).aBoolean449)) {
				@Pc(86) Class122 local86 = super.anInt8592 != -1 && super.anInt8575 == 0 ? Static46.aClass247_1.method6029(super.anInt8592) : null;
				@Pc(107) Class122 local107 = super.anInt8534 == -1 || this.aBoolean163 || super.aBoolean630 && local86 != null ? null : Static46.aClass247_1.method6029(super.anInt8534);
				local109 = 0;
				if (super.anInt8531 != 0) {
					local109 = this.method7078();
				}
				@Pc(149) Class2 local149 = Static518.method1673(super.anInt8572, 160, 0, local107 == null ? super.anInt8584 : super.anInt8556, local31, local107 == null ? local86 : local107, 1, super.anInt8564, super.aClass2Array3[0], local109, 240, 0, super.anInt8574, arg0);
				if (local149 != null) {
					arg0.method7412(false);
					local149.method5774(local19, null, 0);
					arg0.method7412(true);
				}
			}
		}
		if (Static111.aClass6_Sub1_Sub2_Sub1_3 == this) {
			local19.GA(super.anInt8811, super.anInt8814, super.anInt8813);
			for (@Pc(178) int local178 = Static518.aClass296Array2.length - 1; local178 >= 0; local178--) {
				@Pc(184) Class296 local184 = Static518.aClass296Array2[local178];
				if (local184 != null && local184.anInt8738 != -1) {
					@Pc(216) int local216;
					if (local184.anInt8744 == 1) {
						@Pc(204) Class3_Sub3 local204 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local184.anInt8745);
						if (local204 != null) {
							@Pc(209) Class6_Sub1_Sub2_Sub2 local209 = local204.aClass6_Sub1_Sub2_Sub2_1;
							local216 = local209.anInt8811 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811;
							@Pc(223) int local223 = local209.anInt8813 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813;
							this.method2045(local19, super.aClass2Array3[0], local223, arg0, local216, local184.anInt8738, 92160000);
						}
					}
					if (local184.anInt8744 == 2) {
						@Pc(252) int local252 = local184.anInt8743 + 256 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811;
						local109 = local184.anInt8739 + 256 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813;
						local216 = local184.anInt8741 << 9;
						local216 *= local216;
						this.method2045(local19, super.aClass2Array3[0], local109, arg0, local252, local184.anInt8738, local216);
					}
					if (local184.anInt8744 == 10 && local184.anInt8745 >= 0 && Static498.aClass6_Sub1_Sub2_Sub1Array1.length > local184.anInt8745) {
						@Pc(304) Class6_Sub1_Sub2_Sub1 local304 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local184.anInt8745];
						if (local304 != null) {
							local109 = local304.anInt8811 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811;
							local216 = local304.anInt8813 - Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813;
							this.method2045(local19, super.aClass2Array3[0], local216, arg0, local109, local184.anInt8738, 92160000);
						}
					}
				}
			}
			local19.a(local31);
			local19.G(super.anInt8811, super.anInt8814, super.anInt8813);
		}
		local19.a(local31);
		local19.G(super.anInt8811, super.anInt8814 - 5, super.anInt8813);
		@Pc(369) Class4_Sub1 local369 = Static264.method4641(super.aClass2Array3.length);
		this.method7082(false, arg0, super.aClass2Array3, local19);
		if (super.aClass4_Sub4_8 == null) {
			arg0.method7468(super.aClass2Array3, local19, local369.aClass4_Sub7Array1, Static111.aClass6_Sub1_Sub2_Sub1_3 == this ? 1 : 0);
		} else {
			@Pc(384) Class26 local384 = super.aClass4_Sub4_8.method4590();
			arg0.method7478(super.aClass2Array3, local384, local19, local369.aClass4_Sub7Array1, Static111.aClass6_Sub1_Sub2_Sub1_3 == this ? 1 : 0);
		}
		super.anInt8595 = Static127.anInt2665;
		super.aClass2Array3[0] = super.aClass2Array3[1] = super.aClass2Array3[2] = super.aClass2Array3[3] = null;
		return local369;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		if (this.aClass312_1 == null || !super.aBoolean633 && !this.method2050(arg0, 0)) {
			return;
		}
		@Pc(20) Class205 local20 = arg0.method7448();
		local20.a(super.aClass173_7.method4694());
		local20.G(super.anInt8811, super.anInt8814 - 5, super.anInt8813);
		this.method7082(super.aBoolean633, arg0, super.aClass2Array3, local20);
		super.aClass2Array3[0] = super.aClass2Array3[1] = super.aClass2Array3[2] = super.aClass2Array3[3] = null;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILclient!rt;)V")
	public void method2047(@OriginalArg(1) Class3_Sub27 arg0) {
		arg0.anInt9191 = 0;
		@Pc(12) int local12 = arg0.method7548();
		this.aByte25 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean162;
		this.aBoolean162 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method7083();
		this.method7087((local12 >> 3 & 0x7) + 1);
		this.aByte24 = (byte) (local12 >> 6 & 0x3);
		super.anInt8811 += this.method7083() - local48 << 8;
		super.anInt8813 += this.method7083() - local48 << 8;
		this.aByte23 = arg0.method7584();
		this.anInt2280 = arg0.method7584();
		this.anInt2305 = arg0.method7584();
		@Pc(107) int local107 = -1;
		this.anInt2318 = 0;
		@Pc(113) int[] local113 = new int[12];
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(182) int local182;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(121) int local121 = arg0.method7548();
			if (local121 == 0) {
				local113[local115] = 0;
			} else {
				local136 = arg0.method7548();
				local143 = (local121 << 8) + local136;
				if (local115 == 0 && local143 == 65535) {
					local107 = arg0.method7591();
					this.anInt2318 = arg0.method7548();
					break;
				}
				if (local143 >= 32768) {
					local143 = Static270.anIntArray474[local143 - 32768];
					local113[local115] = local143 | 0x40000000;
					local182 = Static99.aClass96_7.method2508(local143).anInt809;
					if (local182 != 0) {
						this.anInt2318 = local182;
					}
				} else {
					local113[local115] = local143 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(207) int[] local207 = new int[5];
		for (local136 = 0; local136 < 5; local136++) {
			local143 = arg0.method7548();
			if (local143 < 0 || local143 >= Static522.aShortArrayArray10[local136].length) {
				local143 = 0;
			}
			local207[local136] = local143;
		}
		this.anInt2292 = arg0.method7591();
		this.aString28 = arg0.method7589();
		this.aString27 = this.aString28;
		this.anInt2302 = arg0.method7548();
		if (local44) {
			this.anInt2309 = arg0.method7591();
			this.anInt2284 = this.anInt2302;
			if (this.anInt2309 == 65535) {
				this.anInt2309 = -1;
			}
			this.anInt2291 = -1;
		} else {
			this.anInt2309 = 0;
			this.anInt2284 = arg0.method7548();
			this.anInt2291 = arg0.method7548();
			if (this.anInt2291 == 255) {
				this.anInt2291 = -1;
			}
		}
		local143 = this.anInt2317;
		this.anInt2317 = arg0.method7548();
		@Pc(323) int local323;
		if (this.anInt2317 == 0) {
			Static366.method5734(this);
		} else {
			local182 = this.anInt2310;
			@Pc(320) int local320 = this.anInt2314;
			local323 = this.anInt2300;
			@Pc(326) int local326 = this.anInt2304;
			@Pc(329) int local329 = this.anInt2286;
			this.anInt2310 = arg0.method7591();
			this.anInt2314 = arg0.method7591();
			this.anInt2300 = arg0.method7591();
			this.anInt2304 = arg0.method7591();
			this.anInt2286 = arg0.method7548();
			if (local21 != this.aBoolean162 || this.anInt2317 != local143 || local182 != this.anInt2310 || this.anInt2314 != local320 || this.anInt2300 != local323 || local326 != this.anInt2304 || local329 != this.anInt2286) {
				Static174.method3319(this);
			}
		}
		if (this.aClass312_1 == null) {
			this.aClass312_1 = new Class312();
		}
		local182 = this.aClass312_1.anInt9133;
		@Pc(430) int[] local430 = this.aClass312_1.anIntArray766;
		this.aClass312_1.method7538(local107, this.method7074(), local207, this.aByte25 == 1, local113);
		if (local182 != local107) {
			super.anInt8811 = (super.anIntArray733[0] << 9) + (this.method7083() << 8);
			super.anInt8813 = (super.anIntArray734[0] << 9) + (this.method7083() << 8);
		}
		if (Static342.anInt6448 == super.anInt8587 && local430 != null) {
			for (local323 = 0; local323 < local207.length; local323++) {
				if (local430[local323] != local207[local323]) {
					Static99.aClass96_7.method2499();
					break;
				}
			}
		}
		if (super.aClass4_Sub4_8 != null) {
			super.aClass4_Sub4_8.method4589();
		}
		if (super.anInt8534 == -1 || !super.aBoolean630) {
			return;
		}
		@Pc(540) Class73 local540 = this.method7088();
		if (!local540.method2120(super.anInt8534)) {
			super.aBoolean630 = false;
			super.anInt8534 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "(I)Z")
	public boolean method2048() {
		return this.aClass312_1 != null;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!oa;I)Z")
	private boolean method2050(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class73 local11 = this.method7088();
		@Pc(26) Class122 local26 = super.anInt8592 != -1 && super.anInt8575 == 0 ? Static46.aClass247_1.method6029(super.anInt8592) : null;
		@Pc(46) Class122 local46 = super.anInt8534 == -1 || this.aBoolean163 || super.aBoolean630 && local26 != null ? null : Static46.aClass247_1.method6029(super.anInt8534);
		@Pc(49) int local49 = local11.anInt2421;
		@Pc(52) int local52 = local11.anInt2430;
		if (local49 != 0 || local52 != 0 || local11.anInt2404 != 0 || local11.anInt2400 != 0) {
			arg1 |= 0x7;
		}
		@Pc(95) boolean local95 = super.aByte92 != 0 && super.anInt8547 <= Static223.anInt4829 && Static223.anInt4829 < super.anInt8523;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(136) Class2 local136 = super.aClass2Array3[0] = this.aClass312_1.method7535(Static99.aClass96_7, local46, local26, super.aClass152Array3, Static546.aClass132_1, Static345.aClass154_1, super.anInt8556, arg1, arg0, Static46.aClass247_1, Static127.aClass215_1, super.anInt8551, super.anInt8584, super.anInt8579, Static299.aClass69_2, super.anInt8540, super.anInt8580);
		@Pc(139) int local139 = Static498.method7192();
		if (Class5_Sub1.lb < 96 && local139 > 50) {
			Static97.method1902();
		}
		@Pc(174) int local174;
		if (Static327.aClass253_10 != Static464.aClass253_15 && local139 < 50) {
			local174 = 50 - local139;
			while (Static491.anInt9416 < local174) {
				Static76.aByteArrayArray7[Static491.anInt9416] = new byte[102400];
				Static491.anInt9416++;
			}
			while (Static491.anInt9416 > local174) {
				Static491.anInt9416--;
				Static76.aByteArrayArray7[Static491.anInt9416] = null;
			}
		} else if (Static327.aClass253_10 != Static464.aClass253_15) {
			Static491.anInt9416 = 0;
			Static76.aByteArrayArray7 = new byte[50][];
		}
		if (local136 == null) {
			return false;
		}
		super.anInt8530 = local136.DA();
		this.method7076(local136);
		local174 = super.aClass173_7.method4694();
		if (local49 == 0 && local52 == 0) {
			this.method7075(local174, this.method7083() << 9, this.method7083() << 9, 0, 0);
		} else {
			this.method7075(local174, local49, local52, local11.anInt2436, local11.anInt2401);
			if (super.anInt8574 != 0) {
				local136.AA(super.anInt8574);
			}
			if (super.anInt8564 != 0) {
				local136.v(super.anInt8564);
			}
			if (super.anInt8572 != 0) {
				local136.m(0, super.anInt8572, 0);
			}
		}
		if (local95) {
			local136.method5782(super.aByte90, super.aByte91, super.aByte89, super.aByte92 & 0xFF);
		}
		@Pc(334) Class186 local334;
		@Pc(354) boolean local354;
		@Pc(356) int local356;
		@Pc(401) Class2 local401;
		if (this.aBoolean163 || super.anInt8565 == -1 || super.anInt8562 == -1) {
			super.aClass2Array3[1] = null;
		} else {
			local334 = Static17.aClass231_2.method5905(super.anInt8565);
			local354 = local334.aByte48 == 3 && (local49 != 0 || local52 != 0);
			local356 = local7;
			if (local354) {
				local356 = local7 | 0x7;
			} else {
				if (super.anInt8596 != 0) {
					local356 = local7 | 0x5;
				}
				if (super.anInt8578 != 0) {
					local356 |= 0x2;
				}
			}
			local401 = super.aClass2Array3[1] = local334.method4868(super.anInt8562, local356, Static46.aClass247_1, arg0, super.anInt8581, super.anInt8549);
			if (local401 != null) {
				if (super.anInt8578 != 0) {
					local401.m(0, -super.anInt8578 << 2, 0);
				}
				if (super.anInt8596 != 0) {
					local401.I(super.anInt8596 * 2048);
				}
				if (local354) {
					if (super.anInt8574 != 0) {
						local401.AA(super.anInt8574);
					}
					if (super.anInt8564 != 0) {
						local401.v(super.anInt8564);
					}
					if (super.anInt8572 != 0) {
						local401.m(0, super.anInt8572, 0);
					}
				}
			}
		}
		if (this.aBoolean163 || super.anInt8526 == -1 || super.anInt8543 == -1) {
			super.aClass2Array3[3] = null;
		} else {
			local334 = Static17.aClass231_2.method5905(super.anInt8526);
			local354 = local334.aByte48 == 3 && (local49 != 0 || local52 != 0);
			local356 = local7;
			if (local354) {
				local356 = local7 | 0x7;
			} else {
				if (super.anInt8571 != 0) {
					local356 = local7 | 0x5;
				}
				if (super.anInt8524 != 0) {
					local356 |= 0x2;
				}
			}
			local401 = super.aClass2Array3[3] = local334.method4861(Static46.aClass247_1, super.anInt8543, super.anInt8529, local356, arg0, super.anInt8586);
			if (local401 != null) {
				if (super.anInt8524 != 0) {
					local401.m(0, -super.anInt8524 << 2, 0);
				}
				if (super.anInt8571 != 0) {
					local401.I(super.anInt8571 * 2048);
				}
				if (local354) {
					if (super.anInt8574 != 0) {
						local401.AA(super.anInt8574);
					}
					if (super.anInt8564 != 0) {
						local401.v(super.anInt8564);
					}
					if (super.anInt8572 != 0) {
						local401.m(0, super.anInt8572, 0);
					}
				}
			}
		}
		super.aClass2Array3[2] = null;
		if (!this.aBoolean163 && super.aClass3_Sub38_3 != null) {
			if (Static223.anInt4829 >= super.aClass3_Sub38_3.anInt6986) {
				super.aClass3_Sub38_3 = null;
			} else if (Static223.anInt4829 >= super.aClass3_Sub38_3.anInt6985) {
				@Pc(628) Class2 local628 = super.aClass3_Sub38_3.method5855(local7 | 0x7, arg0);
				if (local628 != null) {
					local628.m(super.aClass3_Sub38_3.anInt6983 - super.anInt8811, super.aClass3_Sub38_3.anInt6969 - super.anInt8814 + 5, -super.anInt8813 + super.aClass3_Sub38_3.anInt6980);
					if (local174 != 0) {
						local628.I(-local174 & 0x3FFF);
					}
					super.aClass2Array3[2] = local628;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method2051() {
		return this.aString27;
	}

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "(B)I")
	@Override
	public int method7240() {
		return super.anInt8530;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method2052() {
		@Pc(7) String local7 = "";
		if (Static230.aStringArray25 != null) {
			local7 = local7 + Static230.aStringArray25[this.aByte24];
		}
		@Pc(39) int[] local39;
		if (this.aByte25 == 1 && Static21.anIntArray125 != null) {
			local39 = Static21.anIntArray125;
		} else {
			local39 = Static145.anIntArray286;
		}
		if (local39 != null && local39[this.aByte24] != -1) {
			@Pc(60) Class301 local60 = Static402.aClass60_2.method1602(local39[this.aByte24]);
			if (local60.aChar4 == 's') {
				local7 = local7 + local60.method7226(this.aByte23 & 0xFF);
			} else {
				Static2.method220(new Throwable(), "gdn1");
				local39[this.aByte24] = -1;
			}
		}
		local7 = local7 + this.aString28;
		if (Static543.aStringArray52 != null) {
			local7 = local7 + Static543.aStringArray52[this.aByte24];
		}
		return local7;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIB)V")
	public void method2053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt8592 != -1 && Static46.aClass247_1.method6029(super.anInt8592).anInt4142 == 1) {
			super.anInt8592 = -1;
		}
		@Pc(30) Class186 local30;
		if (super.anInt8565 != -1) {
			local30 = Static17.aClass231_2.method5905(super.anInt8565);
			if (local30.aBoolean375 && local30.anInt5838 != -1 && Static46.aClass247_1.method6029(local30.anInt5838).anInt4142 == 1) {
				super.anInt8565 = -1;
			}
		}
		if (super.anInt8526 != -1) {
			local30 = Static17.aClass231_2.method5905(super.anInt8526);
			if (local30.aBoolean375 && local30.anInt5838 != -1 && Static46.aClass247_1.method6029(local30.anInt5838).anInt4142 == 1) {
				super.anInt8526 = -1;
			}
		}
		this.anInt2290 = -1;
		if (arg0 < 0 || arg0 >= Static118.anInt2527 || arg1 < 0 || arg1 >= Static549.anInt9482) {
			this.method2044(arg0, arg1);
		} else if (super.anIntArray733[0] >= 0 && Static118.anInt2527 > super.anIntArray733[0] && super.anIntArray734[0] >= 0 && super.anIntArray734[0] < Static549.anInt9482) {
			if (arg2 == 2) {
				Static267.method4688(arg1, arg0, this);
			}
			this.method2055(arg2, arg1, arg0);
		} else {
			this.method2044(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass312_1 == null || !this.method2050(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class205 local19 = arg1.method7448();
		@Pc(26) int local26 = super.aClass173_7.method4694();
		local19.a(local26);
		local19.G(super.anInt8811, super.anInt8814, super.anInt8813);
		@Pc(39) boolean local39 = false;
		for (@Pc(41) int local41 = 0; local41 < super.aClass2Array3.length; local41++) {
			if (super.aClass2Array3[local41] != null && super.aClass2Array3[local41].method5786(arg0, arg2, local19, true)) {
				local39 = true;
				break;
			}
		}
		super.aClass2Array3[0] = super.aClass2Array3[1] = super.aClass2Array3[2] = super.aClass2Array3[3] = null;
		return local39;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)I")
	@Override
	protected int method7074() {
		return this.anInt2292;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BIII)V")
	public void method2055(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt8599 < 9) {
			super.anInt8599++;
		}
		for (@Pc(20) int local20 = super.anInt8599; local20 > 0; local20--) {
			super.anIntArray733[local20] = super.anIntArray733[local20 - 1];
			super.anIntArray734[local20] = super.anIntArray734[local20 - 1];
			super.aByteArray99[local20] = super.aByteArray99[local20 - 1];
		}
		super.anIntArray733[0] = arg2;
		super.anIntArray734[0] = arg1;
		super.aByteArray99[0] = arg0;
	}
}
