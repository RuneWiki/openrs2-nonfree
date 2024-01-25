import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class3_Sub2_Sub1_Sub2 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!sk", name = "wc", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!sk", name = "Ac", descriptor = "I")
	public int anInt6212;

	@OriginalMember(owner = "client!sk", name = "Jc", descriptor = "Lclient!go;")
	public Class97 aClass97_1;

	@OriginalMember(owner = "client!sk", name = "Nc", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!sk", name = "Pc", descriptor = "I")
	public int anInt6222;

	@OriginalMember(owner = "client!sk", name = "ed", descriptor = "I")
	private int anInt6234;

	@OriginalMember(owner = "client!sk", name = "Ec", descriptor = "I")
	public int anInt6215 = 0;

	@OriginalMember(owner = "client!sk", name = "Kc", descriptor = "I")
	public int anInt6218 = -1;

	@OriginalMember(owner = "client!sk", name = "Hc", descriptor = "I")
	public int anInt6217 = 0;

	@OriginalMember(owner = "client!sk", name = "Bc", descriptor = "Z")
	public boolean aBoolean431 = false;

	@OriginalMember(owner = "client!sk", name = "Ic", descriptor = "Z")
	public boolean aBoolean433 = false;

	@OriginalMember(owner = "client!sk", name = "Wc", descriptor = "I")
	public int anInt6229 = -1;

	@OriginalMember(owner = "client!sk", name = "cd", descriptor = "B")
	private byte aByte94 = 0;

	@OriginalMember(owner = "client!sk", name = "Tc", descriptor = "I")
	public int anInt6226 = 0;

	@OriginalMember(owner = "client!sk", name = "Fc", descriptor = "Z")
	public boolean aBoolean432 = false;

	@OriginalMember(owner = "client!sk", name = "Cc", descriptor = "I")
	public int anInt6213 = -1;

	@OriginalMember(owner = "client!sk", name = "Lc", descriptor = "I")
	public int anInt6219 = -1;

	@OriginalMember(owner = "client!sk", name = "id", descriptor = "B")
	private byte aByte95 = 0;

	@OriginalMember(owner = "client!sk", name = "vc", descriptor = "I")
	public int anInt6209 = -1;

	@OriginalMember(owner = "client!sk", name = "ad", descriptor = "B")
	private byte aByte93 = 0;

	@OriginalMember(owner = "client!sk", name = "Qc", descriptor = "I")
	public int anInt6223 = 0;

	@OriginalMember(owner = "client!sk", name = "od", descriptor = "I")
	public int anInt6243 = 255;

	@OriginalMember(owner = "client!sk", name = "qd", descriptor = "I")
	public int anInt6245 = 0;

	@OriginalMember(owner = "client!sk", name = "hd", descriptor = "I")
	public int anInt6237 = -1;

	@OriginalMember(owner = "client!sk", name = "ud", descriptor = "I")
	public int anInt6247 = -1;

	@OriginalMember(owner = "client!sk", name = "ld", descriptor = "I")
	public int anInt6240 = -1;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ya;BI)Z")
	private boolean method4937(@OriginalArg(0) Class49 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class156 local11 = this.method4925();
		@Pc(29) Class250 local29 = super.anInt6163 != -1 && super.anInt6139 == 0 ? Static338.aClass12_2.method255(super.anInt6163) : null;
		@Pc(52) Class250 local52 = super.anInt6177 == -1 || this.aBoolean433 || super.aBoolean429 && local29 != null ? null : Static338.aClass12_2.method255(super.anInt6177);
		@Pc(55) int local55 = local11.anInt4463;
		@Pc(58) int local58 = local11.anInt4442;
		if (local55 != 0 || local58 != 0 || local11.anInt4467 != 0 || local11.anInt4462 != 0) {
			arg1 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte92 != 0 && super.anInt6148 <= Static131.anInt2821 && super.anInt6132 > Static131.anInt2821;
		if (local100) {
			arg1 |= 0x80000;
		}
		@Pc(141) Class91 local141 = super.aClass91Array3[0] = this.aClass97_1.method2228(Static356.aClass259_2, Static338.aClass12_2, local52, Static344.aClass108_1, arg0, super.anInt6169, super.anInt6192, super.aClass190Array3, super.anInt6149, Static219.aClass76_2, super.anInt6178, Static318.aClass144_6, local29, Static262.aClass51_3, arg1, super.anInt6180, super.anInt6190);
		@Pc(144) int local144 = Static111.method2015();
		if (Static7.anInt219 < 96 && local144 > 50) {
			Static258.method587();
		}
		@Pc(180) int local180;
		if (Static53.aClass56_2 != Static23.aClass56_1 && local144 < 50) {
			local180 = 50 - local144;
			while (Static333.anInt5770 < local180) {
				Static260.aByteArrayArray38[Static333.anInt5770] = new byte[102400];
				Static333.anInt5770++;
			}
			while (Static333.anInt5770 > local180) {
				Static333.anInt5770--;
				Static260.aByteArrayArray38[Static333.anInt5770] = null;
			}
		} else if (Static53.aClass56_2 != Static23.aClass56_1) {
			Static260.aByteArrayArray38 = new byte[50][];
			Static333.anInt5770 = 0;
		}
		if (local141 == null) {
			return false;
		}
		super.anInt6194 = local141.MA();
		this.method4927(local141);
		local180 = super.aClass266_7.method5718();
		if (local55 == 0 && local58 == 0) {
			this.method4923(local180, 0, 0, this.method4935() << 7, this.method4935() << 7);
		} else {
			this.method4923(local180, local11.anInt4436, local11.anInt4451, local58, local55);
			if (super.anInt6200 != 0) {
				local141.Z(super.anInt6200);
			}
			if (super.anInt6191 != 0) {
				local141.R(super.anInt6191);
			}
			if (super.anInt6165 != 0) {
				local141.JA(0, super.anInt6165, 0);
			}
		}
		if (local100) {
			local141.method3291(super.lb, super.aByte91, super.aByte90, super.aByte92 & 0xFF);
		}
		@Pc(334) Class203 local334;
		@Pc(351) boolean local351;
		@Pc(353) int local353;
		@Pc(395) Class91 local395;
		if (this.aBoolean433 || super.anInt6150 == -1 || super.anInt6164 == -1) {
			super.aClass91Array3[1] = null;
		} else {
			local334 = Static395.aClass247_2.method5407(super.anInt6150);
			local351 = local334.aByte86 == 3 && (local55 != 0 || local58 != 0);
			local353 = local7;
			if (local351) {
				local353 = local7 | 0x7;
			} else {
				if (super.anInt6158 != 0) {
					local353 = local7 | 0x5;
				}
				if (super.anInt6199 != 0) {
					local353 |= 0x2;
				}
			}
			local395 = super.aClass91Array3[1] = local334.method4517(super.anInt6171, Static338.aClass12_2, local353, super.anInt6164, super.anInt6176, arg0);
			if (local395 != null) {
				if (super.anInt6199 != 0) {
					local395.JA(0, -super.anInt6199 << 0, 0);
				}
				if (super.anInt6158 != 0) {
					local395.Q(super.anInt6158 * 2048);
				}
				if (local351) {
					if (super.anInt6200 != 0) {
						local395.Z(super.anInt6200);
					}
					if (super.anInt6191 != 0) {
						local395.R(super.anInt6191);
					}
					if (super.anInt6165 != 0) {
						local395.JA(0, super.anInt6165, 0);
					}
				}
			}
		}
		if (this.aBoolean433 || super.anInt6126 == -1 || super.anInt6185 == -1) {
			super.aClass91Array3[3] = null;
		} else {
			local334 = Static395.aClass247_2.method5407(super.anInt6126);
			local351 = local334.aByte86 == 3 && (local55 != 0 || local58 != 0);
			local353 = local7;
			if (local351) {
				local353 = local7 | 0x7;
			} else {
				if (super.anInt6152 != 0) {
					local353 = local7 | 0x5;
				}
				if (super.anInt6133 != 0) {
					local353 |= 0x2;
				}
			}
			local395 = super.aClass91Array3[3] = local334.method4518(arg0, super.anInt6185, local353, super.anInt6166, super.anInt6136, Static338.aClass12_2);
			if (local395 != null) {
				if (super.anInt6133 != 0) {
					local395.JA(0, -super.anInt6133 << 0, 0);
				}
				if (super.anInt6152 != 0) {
					local395.Q(super.anInt6152 * 2048);
				}
				if (local351) {
					if (super.anInt6200 != 0) {
						local395.Z(super.anInt6200);
					}
					if (super.anInt6191 != 0) {
						local395.R(super.anInt6191);
					}
					if (super.anInt6165 != 0) {
						local395.JA(0, super.anInt6165, 0);
					}
				}
			}
		}
		super.aClass91Array3[2] = null;
		if (!this.aBoolean433 && super.aClass2_Sub13_3 != null) {
			if (Static131.anInt2821 >= super.aClass2_Sub13_3.anInt2350) {
				super.aClass2_Sub13_3 = null;
			} else if (super.aClass2_Sub13_3.anInt2347 <= Static131.anInt2821) {
				@Pc(635) Class91 local635 = super.aClass2_Sub13_3.method1840(arg0, local7 | 0x7);
				if (local635 != null) {
					local635.JA(super.aClass2_Sub13_3.anInt2348 - super.anInt6119, -super.anInt6120 + super.aClass2_Sub13_3.anInt2344, -super.anInt6121 + super.aClass2_Sub13_3.anInt2346);
					if (local180 != 0) {
						local635.Q(-local180 & 0x3FFF);
					}
					super.aClass91Array3[2] = local635;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(B)I")
	@Override
	public int method4932() {
		return -1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIBB)V")
	public void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt6163 != -1 && Static338.aClass12_2.method255(super.anInt6163).anInt7021 == 1) {
			super.anInt6163 = -1;
		}
		@Pc(36) Class203 local36;
		if (super.anInt6150 != -1) {
			local36 = Static395.aClass247_2.method5407(super.anInt6150);
			if (local36.aBoolean398 && local36.anInt5615 != -1 && Static338.aClass12_2.method255(local36.anInt5615).anInt7021 == 1) {
				super.anInt6150 = -1;
			}
		}
		if (super.anInt6126 != -1) {
			local36 = Static395.aClass247_2.method5407(super.anInt6126);
			if (local36.aBoolean398 && local36.anInt5615 != -1 && Static338.aClass12_2.method255(local36.anInt5615).anInt7021 == 1) {
				super.anInt6126 = -1;
			}
		}
		this.anInt6209 = -1;
		if (arg1 < 0 || Static229.anInt4427 <= arg1 || arg0 < 0 || Static379.anInt6422 <= arg0) {
			this.method4948(arg1, arg0);
		} else if (super.anIntArray525[0] >= 0 && Static229.anInt4427 > super.anIntArray525[0] && super.anIntArray524[0] >= 0 && Static379.anInt6422 > super.anIntArray524[0]) {
			if (arg2 == 2) {
				Static374.method5054(arg1, arg0, this);
			}
			this.method4944(arg0, arg2, arg1);
		} else {
			this.method4948(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(B)I")
	@Override
	protected int method4926() {
		return this.anInt6234;
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(B)I")
	@Override
	public int method4935() {
		return this.aClass97_1 == null || this.aClass97_1.anInt2827 == -1 ? super.method4935() : Static219.aClass76_2.method1888(this.aClass97_1.anInt2827).anInt2128;
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(B)Z")
	public boolean method4941() {
		return this.aClass97_1 != null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!si;I)V")
	public void method4942(@OriginalArg(0) Class2_Sub23 arg0) {
		arg0.anInt6952 = 0;
		@Pc(12) int local12 = arg0.method5495();
		this.aByte93 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4935();
		this.method4929((local12 >> 3 & 0x7) + 1);
		this.aByte94 = (byte) (local12 >> 6 & 0x3);
		super.anInt6119 += this.method4935() - local41 << 6;
		super.anInt6121 += this.method4935() - local41 << 6;
		this.aByte95 = arg0.method5484();
		this.anInt6240 = arg0.method5484();
		this.anInt6237 = arg0.method5484();
		@Pc(102) int local102 = -1;
		this.anInt6215 = 0;
		@Pc(108) int[] local108 = new int[12];
		@Pc(128) int local128;
		@Pc(134) int local134;
		@Pc(173) int local173;
		for (@Pc(110) int local110 = 0; local110 < 12; local110++) {
			@Pc(116) int local116 = arg0.method5495();
			if (local116 == 0) {
				local108[local110] = 0;
			} else {
				local128 = arg0.method5495();
				local134 = (local116 << 8) + local128;
				if (local110 == 0 && local134 == 65535) {
					local102 = arg0.method5500();
					this.anInt6215 = arg0.method5495();
					break;
				}
				if (local134 >= 32768) {
					local134 = Static381.anIntArray533[local134 - 32768];
					local108[local110] = local134 | 0x40000000;
					local173 = Static318.aClass144_6.method3265(local134).anInt1085;
					if (local173 != 0) {
						this.anInt6215 = local173;
					}
				} else {
					local108[local110] = Integer.MIN_VALUE | local134 - 256;
				}
			}
		}
		@Pc(197) int[] local197 = new int[5];
		for (local128 = 0; local128 < 5; local128++) {
			local134 = arg0.method5495();
			if (local134 < 0 || Static239.aShortArrayArray5[local128].length <= local134) {
				local134 = 0;
			}
			local197[local128] = local134;
		}
		this.anInt6234 = arg0.method5500();
		this.aString55 = arg0.method5494();
		if (local26) {
			this.aString56 = arg0.method5494();
		} else {
			this.aString56 = this.aString55;
		}
		this.anInt6217 = arg0.method5495();
		if (local37) {
			this.anInt6223 = arg0.method5500();
			this.anInt6245 = this.anInt6217;
			this.anInt6229 = -1;
		} else {
			this.anInt6223 = 0;
			this.anInt6245 = arg0.method5495();
			this.anInt6229 = arg0.method5495();
			if (this.anInt6229 == 255) {
				this.anInt6229 = -1;
			}
		}
		local134 = this.anInt6226;
		this.anInt6226 = arg0.method5495();
		@Pc(314) int local314;
		if (this.anInt6226 == 0) {
			Static389.method5170(this);
		} else {
			local173 = this.anInt6213;
			@Pc(311) int local311 = this.anInt6219;
			local314 = this.anInt6218;
			@Pc(317) int local317 = this.anInt6247;
			@Pc(320) int local320 = this.anInt6243;
			this.anInt6213 = arg0.method5500();
			this.anInt6219 = arg0.method5500();
			this.anInt6218 = arg0.method5500();
			this.anInt6247 = arg0.method5500();
			this.anInt6243 = arg0.method5495();
			if (this.anInt6226 != local134 || this.anInt6213 != local173 || this.anInt6219 != local311 || this.anInt6218 != local314 || local317 != this.anInt6247 || this.anInt6243 != local320) {
				Static254.method3859(this);
			}
		}
		if (this.aClass97_1 == null) {
			this.aClass97_1 = new Class97();
		}
		local173 = this.aClass97_1.anInt2827;
		@Pc(413) int[] local413 = this.aClass97_1.anIntArray255;
		this.aClass97_1.method2238(local102, local197, this.method4926(), local108, this.aByte93 == 1);
		if (local102 != local173) {
			super.anInt6119 = (super.anIntArray525[0] << 7) + (this.method4935() << 6);
			super.anInt6121 = (super.anIntArray524[0] << 7) + (this.method4935() << 6);
		}
		if (super.anInt6137 == Static399.anInt6656 && local413 != null) {
			for (local314 = 0; local314 < local197.length; local314++) {
				if (local197[local314] != local413[local314]) {
					Static318.aClass144_6.method3271();
					break;
				}
			}
		}
		if (super.aClass8_Sub3_7 != null) {
			super.aClass8_Sub3_7.method560();
		}
		if (super.anInt6177 == -1 || !super.aBoolean429) {
			return;
		}
		@Pc(517) Class156 local517 = this.method4925();
		if (!local517.method3602(super.anInt6177)) {
			super.aBoolean429 = false;
			super.anInt6177 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		if (this.aClass97_1 == null || !this.method4937(arg0, 2048)) {
			return null;
		}
		@Pc(24) Class35 local24 = arg0.method4445();
		@Pc(29) int local29 = super.aClass266_7.method5718();
		local24.ra(local29);
		local24.o(super.anInt6119, super.anInt6120, super.anInt6121);
		@Pc(43) float local43 = arg0.W();
		@Pc(46) float local46 = arg0.xa();
		if (Static12.aClass79_Sub1_1.aBoolean366) {
			@Pc(53) Class156 local53 = this.method4925();
			if (local53.aBoolean324 && (this.aClass97_1.anInt2827 == -1 || Static219.aClass76_2.method1888(this.aClass97_1.anInt2827).aBoolean138)) {
				@Pc(88) Class250 local88 = super.anInt6163 != -1 && super.anInt6139 == 0 ? Static338.aClass12_2.method255(super.anInt6163) : null;
				@Pc(108) Class250 local108 = super.anInt6177 == -1 || this.aBoolean433 || super.aBoolean429 && local88 != null ? null : Static338.aClass12_2.method255(super.anInt6177);
				@Pc(142) Class91 local142 = Static236.method3661(0, local108 == null ? local88 : local108, 160, super.aClass91Array3[0], local108 == null ? super.anInt6149 : super.anInt6190, arg0, 0, 240, super.aBoolean427, super.anInt6191, super.anInt6200, local29, 1, super.anInt6165);
				if (local142 != null) {
					arg0.g(local43, local46 - 128.0F);
					arg0.method4416(false);
					local142.method3276(local24, null, 0);
					arg0.method4416(true);
				}
			}
		}
		if (Static375.aClass3_Sub2_Sub1_Sub2_7 == this) {
			arg0.g(local43, local46 - 144.0F);
			local24.j(super.anInt6119, super.anInt6120, super.anInt6121);
			for (@Pc(183) int local183 = Static20.aClass237Array1.length - 1; local183 >= 0; local183--) {
				@Pc(189) Class237 local189 = Static20.aClass237Array1[local183];
				if (local189 != null && local189.anInt6466 != -1) {
					@Pc(232) int local232;
					@Pc(225) int local225;
					if (local189.anInt6468 == 1 && local189.anInt6464 >= 0 && Static174.aClass3_Sub2_Sub1_Sub1Array1.length > local189.anInt6464) {
						@Pc(217) Class3_Sub2_Sub1_Sub1 local217 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local189.anInt6464];
						if (local217 != null) {
							local225 = local217.anInt6119 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119;
							local232 = local217.anInt6121 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121;
							this.method4945(super.aClass91Array3[0], local232, arg0, local24, 5760000, local189.anInt6466, local225);
						}
					}
					if (local189.anInt6468 == 2) {
						@Pc(259) int local259 = local189.anInt6459 + 64 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119;
						local225 = local189.anInt6458 + 64 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121;
						local232 = local189.anInt6465 << 7;
						local232 *= local232;
						this.method4945(super.aClass91Array3[0], local225, arg0, local24, local232, local189.anInt6466, local259);
					}
					if (local189.anInt6468 == 10 && local189.anInt6464 >= 0 && Static74.aClass3_Sub2_Sub1_Sub2Array1.length > local189.anInt6464) {
						@Pc(317) Class3_Sub2_Sub1_Sub2 local317 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local189.anInt6464];
						if (local317 != null) {
							local225 = local317.anInt6119 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119;
							local232 = local317.anInt6121 - Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121;
							this.method4945(super.aClass91Array3[0], local232, arg0, local24, 5760000, local189.anInt6466, local225);
						}
					}
				}
			}
			local24.ra(local29);
			local24.o(super.anInt6119, super.anInt6120, super.anInt6121);
		}
		arg0.g(local43, local46);
		@Pc(371) Class8_Sub5 local371 = Static367.method4998(super.aClass91Array3.length);
		if (super.aClass8_Sub3_7 == null) {
			arg0.method4409(super.aClass91Array3, local24, local371.aClass8_Sub4Array1, Static375.aClass3_Sub2_Sub1_Sub2_7 == this ? 1 : 0);
		} else {
			@Pc(393) Class194 local393 = super.aClass8_Sub3_7.method561();
			arg0.method4421(super.aClass91Array3, local393, local24, local371.aClass8_Sub4Array1, Static375.aClass3_Sub2_Sub1_Sub2_7 == this ? 1 : 0);
		}
		this.method4919(super.aClass91Array3, false, arg0);
		if (super.aClass91Array3[2] != null) {
			if (local29 != 0) {
				super.aClass91Array3[2].Q(local29);
			}
			super.aClass91Array3[2].JA(super.anInt6119 - super.aClass2_Sub13_3.anInt2348, super.anInt6120 + -super.aClass2_Sub13_3.anInt2344, -super.aClass2_Sub13_3.anInt2346 + super.anInt6121);
		}
		super.aClass91Array3[0] = super.aClass91Array3[1] = super.aClass91Array3[2] = super.aClass91Array3[3] = null;
		super.anInt6188 = Static356.anInt6044;
		return local371;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4943() {
		return this.aString56;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIBI)V")
	public void method4944(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6206 < 9) {
			super.anInt6206++;
		}
		for (@Pc(18) int local18 = super.anInt6206; local18 > 0; local18--) {
			super.anIntArray525[local18] = super.anIntArray525[local18 - 1];
			super.anIntArray524[local18] = super.anIntArray524[local18 - 1];
			super.aByteArray119[local18] = super.aByteArray119[local18 - 1];
		}
		super.anIntArray525[0] = arg2;
		super.aByteArray119[0] = arg1;
		super.anIntArray524[0] = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(Z)I")
	@Override
	public int method4916() {
		return super.anInt6194;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!t;ILclient!ya;Lclient!c;IIII)V")
	private void method4945(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 * arg6 + arg1 * arg1;
		if (local11 < 16384 || arg4 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg6, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class91 local51 = Static139.method2374(arg2, super.anInt6200, super.anInt6165, local33, super.anInt6191, arg5);
		if (local51 != null) {
			arg2.method4416(false);
			local51.method3276(arg3, null, 0);
			arg2.method4416(true);
		}
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		if (this.aClass97_1 != null && (super.aBoolean430 || this.method4937(arg0, 0))) {
			this.method4919(super.aClass91Array3, super.aBoolean430, arg0);
			super.aClass91Array3[0] = super.aClass91Array3[1] = super.aClass91Array3[2] = super.aClass91Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)V")
	public void method4948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6204 = 0;
		super.anIntArray525[0] = arg0;
		super.anInt6206 = 0;
		super.anInt6203 = 0;
		super.anIntArray524[0] = arg1;
		@Pc(30) int local30 = this.method4935();
		super.anInt6121 = local30 * 64 + super.anIntArray524[0] * 128;
		super.anInt6119 = local30 * 64 + super.anIntArray525[0] * 128;
		if (Static375.aClass3_Sub2_Sub1_Sub2_7 == this) {
			Static277.method4067();
		}
		if (super.aClass8_Sub3_7 != null) {
			super.aClass8_Sub3_7.method560();
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass97_1 == null || !this.method4937(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class35 local19 = arg1.method4445();
		@Pc(24) int local24 = super.aClass266_7.method5718();
		local19.ra(local24);
		local19.o(super.anInt6119, super.anInt6120, super.anInt6121);
		@Pc(37) boolean local37 = false;
		for (@Pc(45) int local45 = 0; super.aClass91Array3.length > local45; local45++) {
			if (super.aClass91Array3[local45] != null && super.aClass91Array3[local45].method3288(arg2, arg0, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass91Array3[0] = super.aClass91Array3[1] = super.aClass91Array3[2] = super.aClass91Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method4950() {
		@Pc(7) String local7 = "";
		if (Static154.aStringArray19 != null) {
			local7 = local7 + Static154.aStringArray19[this.aByte94];
		}
		@Pc(31) int[] local31;
		if (this.aByte93 == 1 && Static193.anIntArray327 != null) {
			local31 = Static193.anIntArray327;
		} else {
			local31 = Static136.anIntArray259;
		}
		if (local31 != null && local31[this.aByte94] != -1) {
			@Pc(51) Class255 local51 = Static390.aClass125_1.method2841(local31[this.aByte94]);
			if (local51.aChar5 == 's') {
				local7 = local7 + local51.method5653(this.aByte95 & 0xFF);
			} else {
				Static361.method4904(new Throwable(), "gdn1");
				local31[this.aByte94] = -1;
			}
		}
		local7 = local7 + this.aString55;
		if (Static16.aStringArray2 != null) {
			local7 = local7 + Static16.aStringArray2[this.aByte94];
		}
		return local7;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
