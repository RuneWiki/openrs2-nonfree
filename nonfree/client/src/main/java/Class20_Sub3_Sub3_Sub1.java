import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class20_Sub3_Sub3_Sub1 extends Class20_Sub3_Sub3 {

	@OriginalMember(owner = "client!oq", name = "xc", descriptor = "I")
	public int anInt4935;

	@OriginalMember(owner = "client!oq", name = "Cc", descriptor = "I")
	private int anInt4938;

	@OriginalMember(owner = "client!oq", name = "Kc", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!oq", name = "Uc", descriptor = "Lclient!da;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!oq", name = "Yc", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!oq", name = "kd", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!oq", name = "Bc", descriptor = "I")
	public int anInt4937 = -1;

	@OriginalMember(owner = "client!oq", name = "Gc", descriptor = "I")
	public int anInt4942 = 0;

	@OriginalMember(owner = "client!oq", name = "Pc", descriptor = "B")
	private byte aByte53 = 0;

	@OriginalMember(owner = "client!oq", name = "ed", descriptor = "I")
	public int anInt4961 = 0;

	@OriginalMember(owner = "client!oq", name = "Ac", descriptor = "Z")
	public boolean aBoolean394 = false;

	@OriginalMember(owner = "client!oq", name = "yc", descriptor = "I")
	public int anInt4936 = -1;

	@OriginalMember(owner = "client!oq", name = "zc", descriptor = "Z")
	public boolean aBoolean393 = false;

	@OriginalMember(owner = "client!oq", name = "Fc", descriptor = "I")
	public int anInt4941 = -1;

	@OriginalMember(owner = "client!oq", name = "jd", descriptor = "I")
	public int anInt4966 = -1;

	@OriginalMember(owner = "client!oq", name = "cd", descriptor = "I")
	public int anInt4959 = -1;

	@OriginalMember(owner = "client!oq", name = "Nc", descriptor = "Z")
	public boolean aBoolean395 = false;

	@OriginalMember(owner = "client!oq", name = "qd", descriptor = "I")
	public int anInt4971 = -1;

	@OriginalMember(owner = "client!oq", name = "Rc", descriptor = "I")
	public int anInt4949 = 0;

	@OriginalMember(owner = "client!oq", name = "Wc", descriptor = "I")
	public int anInt4953 = 0;

	@OriginalMember(owner = "client!oq", name = "Sc", descriptor = "I")
	public int anInt4950 = 0;

	@OriginalMember(owner = "client!oq", name = "rd", descriptor = "B")
	private byte aByte55 = 0;

	@OriginalMember(owner = "client!oq", name = "sd", descriptor = "I")
	public int anInt4972 = -1;

	@OriginalMember(owner = "client!oq", name = "pd", descriptor = "B")
	private byte aByte54 = 0;

	@OriginalMember(owner = "client!oq", name = "gd", descriptor = "I")
	public int anInt4963 = 255;

	@OriginalMember(owner = "client!oq", name = "td", descriptor = "I")
	public int anInt4973 = -1;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I")
	@Override
	public int method4683() {
		return -1;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3871() {
		return this.aString48;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILclient!ia;Lclient!qa;IIILclient!c;)V")
	private void method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class128 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class33 arg6) {
		@Pc(11) int local11 = arg4 * arg4 + arg0 * arg0;
		if (local11 < 16384 || arg1 < local11) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg0, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(50) Class33 local50 = Static185.method5137(super.anInt6072, local38, super.anInt6064, super.anInt6057, arg5, arg3);
		if (local50 != null) {
			arg3.method3598(false);
			local50.method5391(arg2, null, 0);
			arg3.method3598(true);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIIB)V")
	public void method3876(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt6051 != -1 && Static152.aClass213_1.method4410(super.anInt6051).anInt4259 == 1) {
			super.anInt6051 = -1;
		}
		@Pc(38) Class14 local38;
		if (super.anInt6014 != -1) {
			local38 = Static44.aClass190_2.method4005(super.anInt6014);
			if (local38.aBoolean27 && local38.anInt325 != -1 && Static152.aClass213_1.method4410(local38.anInt325).anInt4259 == 1) {
				super.anInt6014 = -1;
			}
		}
		if (super.anInt6019 != -1) {
			local38 = Static44.aClass190_2.method4005(super.anInt6019);
			if (local38.aBoolean27 && local38.anInt325 != -1 && Static152.aClass213_1.method4410(local38.anInt325).anInt4259 == 1) {
				super.anInt6019 = -1;
			}
		}
		this.anInt4972 = -1;
		if (arg2 < 0 || arg2 >= Static425.anInt6922 || arg1 < 0 || arg1 >= Static251.anInt4072) {
			this.method3877(arg2, arg1);
		} else if (super.anIntArray370[0] >= 0 && Static425.anInt6922 > super.anIntArray370[0] && super.anIntArray369[0] >= 0 && super.anIntArray369[0] < Static251.anInt4072) {
			if (arg0 == 2) {
				Static92.method1319(arg1, this, arg2);
			}
			this.method3878(arg2, arg1, arg0);
		} else {
			this.method3877(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)V")
	public void method3877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6087 = 0;
		super.anInt6088 = 0;
		super.anIntArray370[0] = arg0;
		super.anInt6086 = 0;
		super.anIntArray369[0] = arg1;
		@Pc(26) int local26 = this.method4678();
		super.anInt6616 = local26 * 64 + super.anIntArray369[0] * 128;
		super.anInt6613 = local26 * 64 + super.anIntArray370[0] * 128;
		if (Static239.aClass20_Sub3_Sub3_Sub1_1 == this) {
			Static421.method5243();
		}
		if (super.aClass13_Sub2_6 != null) {
			super.aClass13_Sub2_6.method697();
		}
	}

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)I")
	@Override
	public int method5097() {
		return super.anInt6017;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		if (this.aClass45_1 == null || !this.method3881(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class40 local19 = arg0.method3600();
		@Pc(24) int local24 = super.aClass145_7.method2946();
		local19.O(local24);
		local19.ZA(super.anInt6613, super.anInt6615, super.anInt6616);
		@Pc(38) float local38 = arg0.la();
		@Pc(41) float local41 = arg0.w();
		if (Static336.aClass106_Sub1_1.aBoolean473) {
			@Pc(48) Class51 local48 = this.method4676();
			if (local48.aBoolean103 && (this.aClass45_1.anInt1117 == -1 || Static304.aClass27_1.method588(this.aClass45_1.anInt1117).aBoolean558)) {
				@Pc(83) Class171 local83 = super.anInt6051 != -1 && super.anInt6040 == 0 ? Static152.aClass213_1.method4410(super.anInt6051) : null;
				@Pc(103) Class171 local103 = super.anInt6037 == -1 || this.aBoolean393 || super.aBoolean502 && local83 != null ? null : Static152.aClass213_1.method4410(super.anInt6037);
				@Pc(137) Class33 local137 = Static168.method2298(local103 == null ? local83 : local103, arg0, super.anInt6072, 1, super.aClass33Array3[0], super.aBoolean501, 0, local24, local103 == null ? super.anInt6044 : super.anInt6013, super.anInt6064, 0, 160, super.anInt6057, 240);
				if (local137 != null) {
					arg0.o(local38, local41 - 128.0F);
					arg0.method3598(false);
					local137.method5391(local19, null, 0);
					arg0.method3598(true);
				}
			}
		}
		if (Static239.aClass20_Sub3_Sub3_Sub1_1 == this) {
			arg0.o(local38, local41 - 144.0F);
			local19.R(super.anInt6613, super.anInt6615, super.anInt6616);
			for (@Pc(178) int local178 = Static162.aClass209Array1.length - 1; local178 >= 0; local178--) {
				@Pc(184) Class209 local184 = Static162.aClass209Array1[local178];
				if (local184 != null && local184.anInt5515 != -1) {
					@Pc(225) int local225;
					@Pc(219) int local219;
					if (local184.anInt5510 == 1 && local184.anInt5517 >= 0 && Static98.aClass20_Sub3_Sub3_Sub2Array1.length > local184.anInt5517) {
						@Pc(210) Class20_Sub3_Sub3_Sub2 local210 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local184.anInt5517];
						if (local210 != null) {
							local219 = local210.anInt6613 - Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613;
							local225 = local210.anInt6616 - Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616;
							this.method3872(local219, 5760000, local19, arg0, local225, local184.anInt5515, super.aClass33Array3[0]);
						}
					}
					if (local184.anInt5510 == 2) {
						@Pc(252) int local252 = local184.anInt5502 + 64 - Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613;
						local219 = local184.anInt5507 + 64 - Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616;
						local225 = local184.anInt5505 << 7;
						local225 *= local225;
						this.method3872(local252, local225, local19, arg0, local219, local184.anInt5515, super.aClass33Array3[0]);
					}
					if (local184.anInt5510 == 10 && local184.anInt5517 >= 0 && Static73.aClass20_Sub3_Sub3_Sub1Array1.length > local184.anInt5517) {
						@Pc(310) Class20_Sub3_Sub3_Sub1 local310 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local184.anInt5517];
						if (local310 != null) {
							local219 = local310.anInt6613 - Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613;
							local225 = local310.anInt6616 - Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616;
							this.method3872(local219, 5760000, local19, arg0, local225, local184.anInt5515, super.aClass33Array3[0]);
						}
					}
				}
			}
			local19.O(local24);
			local19.ZA(super.anInt6613, super.anInt6615, super.anInt6616);
		}
		arg0.o(local38, local41);
		@Pc(364) Class13_Sub4 local364 = Static192.method2550(super.aClass33Array3.length);
		if (super.aClass13_Sub2_6 == null) {
			arg0.method3541(super.aClass33Array3, local19, local364.aClass13_Sub8Array1, Static239.aClass20_Sub3_Sub3_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(371) Class194 local371 = super.aClass13_Sub2_6.method702();
			arg0.method3546(super.aClass33Array3, local371, local19, local364.aClass13_Sub8Array1, Static239.aClass20_Sub3_Sub3_Sub1_1 == this ? 1 : 0);
		}
		this.method4680(false, arg0, super.aClass33Array3);
		if (super.aClass33Array3[2] != null) {
			if (local24 != 0) {
				super.aClass33Array3[2].k(local24);
			}
			super.aClass33Array3[2].ja(super.anInt6613 - super.aClass1_Sub38_3.anInt6263, super.anInt6615 - super.aClass1_Sub38_3.anInt6272, -super.aClass1_Sub38_3.anInt6279 + super.anInt6616);
		}
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = super.aClass33Array3[3] = null;
		super.anInt6061 = Static116.anInt5420;
		return local364;
	}

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)I")
	@Override
	public int method4678() {
		return this.aClass45_1 == null || this.aClass45_1.anInt1117 == -1 ? super.method4678() : Static304.aClass27_1.method588(this.aClass45_1.anInt1117).anInt6830;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIB)V")
	public void method3878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6088 < 9) {
			super.anInt6088++;
		}
		for (@Pc(18) int local18 = super.anInt6088; local18 > 0; local18--) {
			super.anIntArray370[local18] = super.anIntArray370[local18 - 1];
			super.anIntArray369[local18] = super.anIntArray369[local18 - 1];
			super.aByteArray67[local18] = super.aByteArray67[local18 - 1];
		}
		super.anIntArray370[0] = arg0;
		super.aByteArray67[0] = arg2;
		super.anIntArray369[0] = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		if (this.aClass45_1 == null || !this.method3881(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class40 local19 = arg2.method3600();
		@Pc(24) int local24 = super.aClass145_7.method2946();
		local19.O(local24);
		local19.ZA(super.anInt6613, super.anInt6615, super.anInt6616);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass33Array3.length > local39; local39++) {
			if (super.aClass33Array3[local39] != null && super.aClass33Array3[local39].method5395(arg0, arg1, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = super.aClass33Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "(I)Z")
	public boolean method3879() {
		return this.aClass45_1 != null;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3880() {
		@Pc(15) String local15 = "";
		if (Static121.aStringArray19 != null) {
			local15 = local15 + Static121.aStringArray19[this.aByte53];
		}
		@Pc(39) int[] local39;
		if (this.aByte54 == 1 && Static292.anIntArray255 != null) {
			local39 = Static292.anIntArray255;
		} else {
			local39 = Static433.anIntArray485;
		}
		if (local39 != null && local39[this.aByte53] != -1) {
			@Pc(60) Class64 local60 = Static248.aClass242_1.method5027(local39[this.aByte53]);
			if (local60.aChar1 == 's') {
				local15 = local15 + local60.method1325(this.aByte55 & 0xFF);
			} else {
				Static211.method2815(new Throwable(), "gdn1");
				local39[this.aByte53] = -1;
			}
		}
		local15 = local15 + this.aString47;
		if (Static109.aStringArray18 != null) {
			local15 = local15 + Static109.aStringArray18[this.aByte53];
		}
		return local15;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!qa;II)Z")
	private boolean method3881(@OriginalArg(0) Class128 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class51 local11 = this.method4676();
		@Pc(29) Class171 local29 = super.anInt6051 != -1 && super.anInt6040 == 0 ? Static152.aClass213_1.method4410(super.anInt6051) : null;
		@Pc(49) Class171 local49 = super.anInt6037 == -1 || this.aBoolean393 || super.aBoolean502 && local29 != null ? null : Static152.aClass213_1.method4410(super.anInt6037);
		@Pc(52) int local52 = local11.anInt1301;
		@Pc(55) int local55 = local11.anInt1325;
		if (local52 != 0 || local55 != 0 || local11.anInt1293 != 0 || local11.anInt1299 != 0) {
			arg1 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte78 != 0 && Static368.anInt6250 >= super.anInt6024 && Static368.anInt6250 < super.anInt6055;
		if (local97) {
			arg1 |= 0x80000;
		}
		@Pc(138) Class33 local138 = super.aClass33Array3[0] = this.aClass45_1.method982(super.anInt6039, Static152.aClass213_1, arg0, Static227.aClass65_2, super.aClass99Array3, Static304.aClass27_1, super.anInt6044, Static221.aClass129_2, local49, Static364.aClass259_1, Static332.aClass174_1, super.anInt6083, super.anInt6022, arg1, super.anInt6068, local29, super.anInt6013);
		@Pc(141) int local141 = Static167.method2263();
		if (Static144.anInt2437 < 96 && local141 > 50) {
			Static295.method3873();
		}
		@Pc(170) int local170;
		if (Static209.aClass166_6 != Static136.aClass166_3 && local141 < 50) {
			local170 = 50 - local141;
			while (local170 > Static311.anInt5171) {
				Static91.aByteArrayArray12[Static311.anInt5171] = new byte[102400];
				Static311.anInt5171++;
			}
			while (local170 < Static311.anInt5171) {
				Static311.anInt5171--;
				Static91.aByteArrayArray12[Static311.anInt5171] = null;
			}
		} else if (Static209.aClass166_6 != Static136.aClass166_3) {
			Static311.anInt5171 = 0;
			Static91.aByteArrayArray12 = new byte[50][];
		}
		if (local138 == null) {
			return false;
		}
		super.anInt6017 = local138.b();
		this.method4681(local138);
		local170 = super.aClass145_7.method2946();
		if (local52 == 0 && local55 == 0) {
			this.method4690(this.method4678() << 7, local170, this.method4678() << 7, 0, 0);
		} else {
			this.method4690(local55, local170, local52, local11.anInt1319, local11.anInt1296);
			if (super.anInt6057 != 0) {
				local138.WA(super.anInt6057);
			}
			if (super.anInt6064 != 0) {
				local138.o(super.anInt6064);
			}
			if (super.anInt6072 != 0) {
				local138.ja(0, super.anInt6072, 0);
			}
		}
		if (local97) {
			local138.method5389(super.aByte80, super.aByte77, super.aByte79, super.aByte78 & 0xFF);
		}
		@Pc(322) Class14 local322;
		@Pc(339) boolean local339;
		@Pc(341) int local341;
		@Pc(384) Class33 local384;
		if (this.aBoolean393 || super.anInt6014 == -1 || super.anInt6041 == -1) {
			super.aClass33Array3[1] = null;
		} else {
			local322 = Static44.aClass190_2.method4005(super.anInt6014);
			local339 = local322.aByte2 == 3 && (local52 != 0 || local55 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt6028 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.anInt6050 != 0) {
					local341 |= 0x2;
				}
			}
			local384 = super.aClass33Array3[1] = local322.method268(super.anInt6041, arg0, super.anInt6069, super.anInt6030, Static152.aClass213_1, local341);
			if (local384 != null) {
				if (super.anInt6050 != 0) {
					local384.ja(0, -super.anInt6050 << 0, 0);
				}
				if (super.anInt6028 != 0) {
					local384.k(super.anInt6028 * 2048);
				}
				if (local339) {
					if (super.anInt6057 != 0) {
						local384.WA(super.anInt6057);
					}
					if (super.anInt6064 != 0) {
						local384.o(super.anInt6064);
					}
					if (super.anInt6072 != 0) {
						local384.ja(0, super.anInt6072, 0);
					}
				}
			}
		}
		if (this.aBoolean393 || super.anInt6019 == -1 || super.anInt6071 == -1) {
			super.aClass33Array3[3] = null;
		} else {
			local322 = Static44.aClass190_2.method4005(super.anInt6019);
			local339 = local322.aByte2 == 3 && (local52 != 0 || local55 != 0);
			local341 = local7;
			if (local339) {
				local341 = local7 | 0x7;
			} else {
				if (super.anInt6066 != 0) {
					local341 = local7 | 0x5;
				}
				if (super.anInt6011 != 0) {
					local341 |= 0x2;
				}
			}
			local384 = super.aClass33Array3[3] = local322.method276(super.anInt6073, super.anInt6035, Static152.aClass213_1, arg0, local341, super.anInt6071);
			if (local384 != null) {
				if (super.anInt6011 != 0) {
					local384.ja(0, -super.anInt6011 << 0, 0);
				}
				if (super.anInt6066 != 0) {
					local384.k(super.anInt6066 * 2048);
				}
				if (local339) {
					if (super.anInt6057 != 0) {
						local384.WA(super.anInt6057);
					}
					if (super.anInt6064 != 0) {
						local384.o(super.anInt6064);
					}
					if (super.anInt6072 != 0) {
						local384.ja(0, super.anInt6072, 0);
					}
				}
			}
		}
		super.aClass33Array3[2] = null;
		if (!this.aBoolean393 && super.aClass1_Sub38_3 != null) {
			if (Static368.anInt6250 >= super.aClass1_Sub38_3.anInt6266) {
				super.aClass1_Sub38_3 = null;
			} else if (Static368.anInt6250 >= super.aClass1_Sub38_3.anInt6275) {
				@Pc(615) Class33 local615 = super.aClass1_Sub38_3.method4823(local7 | 0x7, arg0);
				if (local615 != null) {
					local615.ja(super.aClass1_Sub38_3.anInt6263 - super.anInt6613, super.aClass1_Sub38_3.anInt6272 + -super.anInt6615, super.aClass1_Sub38_3.anInt6279 - super.anInt6616);
					if (local170 != 0) {
						local615.k(-local170 & 0x3FFF);
					}
					super.aClass33Array3[2] = local615;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
		if (this.aClass45_1 != null && (super.aBoolean504 || this.method3881(arg0, 0))) {
			this.method4680(super.aBoolean504, arg0, super.aClass33Array3);
			super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = super.aClass33Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method3882(@OriginalArg(0) Class1_Sub11 arg0) {
		arg0.anInt5766 = 0;
		@Pc(12) int local12 = arg0.method4463();
		this.aByte54 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method4678();
		this.method4691((local12 >> 3 & 0x7) + 1);
		this.aByte53 = (byte) (local12 >> 6 & 0x3);
		super.anInt6613 += this.method4678() - local44 << 6;
		super.anInt6616 += this.method4678() - local44 << 6;
		this.aByte55 = arg0.method4452();
		this.anInt4936 = arg0.method4452();
		this.anInt4937 = arg0.method4452();
		this.anInt4942 = 0;
		@Pc(108) int local108 = -1;
		@Pc(111) int[] local111 = new int[12];
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(179) int local179;
		for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
			@Pc(119) int local119 = arg0.method4463();
			if (local119 == 0) {
				local111[local113] = 0;
			} else {
				local134 = arg0.method4463();
				local140 = local134 + (local119 << 8);
				if (local113 == 0 && local140 == 65535) {
					local108 = arg0.method4485();
					this.anInt4942 = arg0.method4463();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static346.anIntArray340[local140 - 32768];
					local111[local113] = local140 | 0x40000000;
					local179 = Static227.aClass65_2.method1327(local140).anInt1844;
					if (local179 != 0) {
						this.anInt4942 = local179;
					}
				} else {
					local111[local113] = local140 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(201) int[] local201 = new int[5];
		for (local134 = 0; local134 < 5; local134++) {
			local140 = arg0.method4463();
			if (local140 < 0 || Static101.aShortArrayArray30[local134].length <= local140) {
				local140 = 0;
			}
			local201[local134] = local140;
		}
		this.anInt4938 = arg0.method4485();
		this.aString47 = arg0.method4484();
		if (local29) {
			this.aString48 = arg0.method4484();
		} else {
			this.aString48 = this.aString47;
		}
		this.anInt4949 = arg0.method4463();
		if (local40) {
			this.anInt4961 = arg0.method4485();
			this.anInt4950 = this.anInt4949;
			this.anInt4959 = -1;
		} else {
			this.anInt4961 = 0;
			this.anInt4950 = arg0.method4463();
			this.anInt4959 = arg0.method4463();
			if (this.anInt4959 == 255) {
				this.anInt4959 = -1;
			}
		}
		local140 = this.anInt4953;
		this.anInt4953 = arg0.method4463();
		@Pc(325) int local325;
		if (this.anInt4953 == 0) {
			Static359.method4656(this);
		} else {
			local179 = this.anInt4966;
			@Pc(322) int local322 = this.anInt4971;
			local325 = this.anInt4941;
			@Pc(328) int local328 = this.anInt4973;
			@Pc(331) int local331 = this.anInt4963;
			this.anInt4966 = arg0.method4485();
			this.anInt4971 = arg0.method4485();
			this.anInt4941 = arg0.method4485();
			this.anInt4973 = arg0.method4485();
			this.anInt4963 = arg0.method4463();
			if (this.anInt4953 != local140 || local179 != this.anInt4966 || local322 != this.anInt4971 || local325 != this.anInt4941 || this.anInt4973 != local328 || this.anInt4963 != local331) {
				Static160.method5147(this);
			}
		}
		if (this.aClass45_1 == null) {
			this.aClass45_1 = new Class45();
		}
		local179 = this.aClass45_1.anInt1117;
		@Pc(414) int[] local414 = this.aClass45_1.anIntArray51;
		this.aClass45_1.method974(this.aByte54 == 1, local111, local108, this.method4682(), local201);
		if (local179 != local108) {
			super.anInt6613 = (super.anIntArray370[0] << 7) + (this.method4678() << 6);
			super.anInt6616 = (super.anIntArray369[0] << 7) + (this.method4678() << 6);
		}
		if (super.anInt6045 == Static348.anInt5668 && local414 != null) {
			for (local325 = 0; local325 < local201.length; local325++) {
				if (local201[local325] != local414[local325]) {
					Static227.aClass65_2.method1331();
					break;
				}
			}
		}
		if (super.aClass13_Sub2_6 != null) {
			super.aClass13_Sub2_6.method697();
		}
		if (super.anInt6037 == -1 || !super.aBoolean502) {
			return;
		}
		@Pc(524) Class51 local524 = this.method4676();
		if (!local524.method1124(super.anInt6037)) {
			super.aBoolean502 = false;
			super.anInt6037 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)I")
	@Override
	protected int method4682() {
		return this.anInt4938;
	}
}
