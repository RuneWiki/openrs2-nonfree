import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class24_Sub3_Sub2_Sub2 extends Class24_Sub3_Sub2 {

	@OriginalMember(owner = "client!sf", name = "Hc", descriptor = "Lclient!fd;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!sf", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!sf", name = "Nc", descriptor = "I")
	public int anInt6303;

	@OriginalMember(owner = "client!sf", name = "Wc", descriptor = "I")
	private int anInt6310;

	@OriginalMember(owner = "client!sf", name = "ed", descriptor = "I")
	public int anInt6317;

	@OriginalMember(owner = "client!sf", name = "td", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!sf", name = "Dc", descriptor = "I")
	public int anInt6296 = -1;

	@OriginalMember(owner = "client!sf", name = "Gc", descriptor = "I")
	public int anInt6298 = -1;

	@OriginalMember(owner = "client!sf", name = "Kc", descriptor = "I")
	public int anInt6301 = -1;

	@OriginalMember(owner = "client!sf", name = "Ec", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!sf", name = "Xc", descriptor = "I")
	public int anInt6311 = -1;

	@OriginalMember(owner = "client!sf", name = "Rc", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!sf", name = "Vc", descriptor = "I")
	public int anInt6309 = 0;

	@OriginalMember(owner = "client!sf", name = "Bc", descriptor = "B")
	private byte aByte74 = 0;

	@OriginalMember(owner = "client!sf", name = "Lc", descriptor = "I")
	public int anInt6302 = 255;

	@OriginalMember(owner = "client!sf", name = "ad", descriptor = "I")
	public int anInt6314 = 0;

	@OriginalMember(owner = "client!sf", name = "Pc", descriptor = "I")
	public int anInt6305 = -1;

	@OriginalMember(owner = "client!sf", name = "Tc", descriptor = "I")
	public int anInt6307 = -1;

	@OriginalMember(owner = "client!sf", name = "Cc", descriptor = "I")
	public int anInt6295 = -1;

	@OriginalMember(owner = "client!sf", name = "ld", descriptor = "B")
	private byte aByte75 = 0;

	@OriginalMember(owner = "client!sf", name = "qd", descriptor = "I")
	public int anInt6326 = 0;

	@OriginalMember(owner = "client!sf", name = "rd", descriptor = "I")
	public int anInt6327 = 0;

	@OriginalMember(owner = "client!sf", name = "od", descriptor = "I")
	public int anInt6324 = -1;

	@OriginalMember(owner = "client!sf", name = "sd", descriptor = "I")
	public int anInt6328 = 0;

	@OriginalMember(owner = "client!sf", name = "nd", descriptor = "B")
	private byte aByte76 = 0;

	@OriginalMember(owner = "client!sf", name = "Sc", descriptor = "Z")
	public boolean aBoolean408 = false;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "(I)Z")
	public boolean method4924() {
		return this.aClass75_1 != null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)V")
	public void method4925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6288 = 0;
		super.anInt6290 = 0;
		super.anIntArray610[0] = arg0;
		super.anInt6291 = 0;
		super.anIntArray611[0] = arg1;
		@Pc(26) int local26 = this.method4919();
		super.anInt7094 = local26 * 64 + super.anIntArray611[0] * 128;
		super.anInt7092 = super.anIntArray610[0] * 128 + local26 * 64;
		if (Static263.aClass24_Sub3_Sub2_Sub2_4 == this) {
			Static343.method4653();
		}
		if (super.aClass40_Sub6_6 != null) {
			super.aClass40_Sub6_6.method4093();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
		if (this.aClass75_1 != null && (super.aBoolean405 || this.method4929(0, arg0))) {
			this.method4916(super.aBoolean405, super.aClass63Array3, arg0);
			super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!e;IILclient!za;IZLclient!c;)V")
	private void method4926(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class50 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class34 arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg5 * arg5;
		if (local11 < 16384 || local11 > arg2) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg5, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(49) Class63 local49 = Static400.method5286(super.anInt6286, local37, arg0, super.anInt6224, super.anInt6280, arg4);
		if (local49 != null) {
			arg4.method5837(false);
			local49.method6090(arg6, null, 0);
			arg4.method5837(true);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method4927() {
		return this.aString58;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIB)V")
	public void method4928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6288 < 9) {
			super.anInt6288++;
		}
		for (@Pc(24) int local24 = super.anInt6288; local24 > 0; local24--) {
			super.anIntArray610[local24] = super.anIntArray610[local24 - 1];
			super.anIntArray611[local24] = super.anIntArray611[local24 - 1];
			super.aByteArray80[local24] = super.aByteArray80[local24 - 1];
		}
		super.anIntArray610[0] = arg0;
		super.aByteArray80[0] = arg2;
		super.anIntArray611[0] = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		if (this.aClass75_1 == null || !this.method4929(2048, arg0)) {
			return null;
		}
		@Pc(19) Class34 local19 = arg0.method5819();
		@Pc(24) int local24 = super.aClass145_7.method3304();
		local19.ca(local24);
		local19.W(super.anInt7092, super.anInt7096, super.anInt7094);
		@Pc(38) float local38 = arg0.T();
		@Pc(41) float local41 = arg0.aa();
		@Pc(106) int local106;
		if (Static361.aClass85_Sub1_1.aBoolean171) {
			@Pc(48) Class6 local48 = this.method4923();
			if (local48.aBoolean3 && (this.aClass75_1.anInt2171 == -1 || Static448.aClass38_4.method866(this.aClass75_1.anInt2171).aBoolean411)) {
				@Pc(83) Class137 local83 = super.anInt6211 != -1 && super.anInt6250 == 0 ? Static281.aClass98_3.method2405(super.anInt6211) : null;
				@Pc(104) Class137 local104 = super.anInt6238 == -1 || this.aBoolean406 || super.aBoolean403 && local83 != null ? null : Static281.aClass98_3.method2405(super.anInt6238);
				local106 = 0;
				if (super.anInt6256 != 0) {
					local106 = this.method4918();
				}
				@Pc(149) Class63 local149 = Static38.method527(160, 240, local104 == null ? local83 : local104, 1, super.anInt6224, local24, arg0, super.aClass63Array3[0], super.anInt6286, 0, local106, local104 == null ? super.anInt6231 : super.anInt6260, 0, super.anInt6280);
				if (local149 != null) {
					arg0.da(local38, local41 - 128.0F);
					arg0.method5837(false);
					local149.method6090(local19, null, 0);
					arg0.method5837(true);
				}
			}
		}
		if (Static263.aClass24_Sub3_Sub2_Sub2_4 == this) {
			arg0.da(local38, local41 - 144.0F);
			local19.U(super.anInt7092, super.anInt7096, super.anInt7094);
			for (@Pc(190) int local190 = Static362.aClass65Array1.length - 1; local190 >= 0; local190--) {
				@Pc(196) Class65 local196 = Static362.aClass65Array1[local190];
				if (local196 != null && local196.anInt1857 != -1) {
					@Pc(226) int local226;
					if (local196.anInt1850 == 1) {
						@Pc(214) Class10_Sub26 local214 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local196.anInt1856);
						if (local214 != null) {
							@Pc(219) Class24_Sub3_Sub2_Sub1 local219 = local214.aClass24_Sub3_Sub2_Sub1_2;
							local226 = local219.anInt7092 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092;
							@Pc(232) int local232 = local219.anInt7094 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094;
							this.method4926(local196.anInt1857, super.aClass63Array3[0], 5760000, local232, arg0, local226, local19);
						}
					}
					if (local196.anInt1850 == 2) {
						@Pc(259) int local259 = local196.anInt1855 + 64 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092;
						local106 = local196.anInt1860 + 64 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094;
						local226 = local196.anInt1852 << 7;
						local226 *= local226;
						this.method4926(local196.anInt1857, super.aClass63Array3[0], local226, local106, arg0, local259, local19);
					}
					if (local196.anInt1850 == 10 && local196.anInt1856 >= 0 && local196.anInt1856 < Static360.aClass24_Sub3_Sub2_Sub2Array1.length) {
						@Pc(313) Class24_Sub3_Sub2_Sub2 local313 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local196.anInt1856];
						if (local313 != null) {
							local106 = local313.anInt7092 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092;
							local226 = local313.anInt7094 - Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094;
							this.method4926(local196.anInt1857, super.aClass63Array3[0], 5760000, local226, arg0, local106, local19);
						}
					}
				}
			}
			local19.ca(local24);
			local19.W(super.anInt7092, super.anInt7096, super.anInt7094);
		}
		arg0.da(local38, local41);
		@Pc(370) Class40_Sub5 local370 = Static171.method2916(super.aClass63Array3.length);
		if (super.aClass40_Sub6_6 == null) {
			arg0.method5858(super.aClass63Array3, local19, local370.aClass40_Sub8Array1, Static263.aClass24_Sub3_Sub2_Sub2_4 == this ? 1 : 0);
		} else {
			@Pc(377) Class121 local377 = super.aClass40_Sub6_6.method4088();
			arg0.method5873(super.aClass63Array3, local377, local19, local370.aClass40_Sub8Array1, Static263.aClass24_Sub3_Sub2_Sub2_4 == this ? 1 : 0);
		}
		this.method4916(false, super.aClass63Array3, arg0);
		if (super.aClass63Array3[2] != null) {
			if (local24 != 0) {
				super.aClass63Array3[2].ma(local24);
			}
			super.aClass63Array3[2].a(-super.aClass10_Sub34_3.anInt5331 + super.anInt7092, super.anInt7096 - super.aClass10_Sub34_3.anInt5322, -super.aClass10_Sub34_3.anInt5318 + super.anInt7094);
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		super.anInt6217 = Static186.anInt3747;
		return local370;
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)I")
	@Override
	public int method5579() {
		return super.anInt6248;
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "(I)I")
	@Override
	public int method4919() {
		return this.aClass75_1 == null || this.aClass75_1.anInt2171 == -1 ? super.method4919() : Static448.aClass38_4.method866(this.aClass75_1.anInt2171).anInt6351;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!za;I)Z")
	private boolean method4929(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class6 local11 = this.method4923();
		@Pc(30) Class137 local30 = super.anInt6211 != -1 && super.anInt6250 == 0 ? Static281.aClass98_3.method2405(super.anInt6211) : null;
		@Pc(50) Class137 local50 = super.anInt6238 == -1 || this.aBoolean406 || super.aBoolean403 && local30 != null ? null : Static281.aClass98_3.method2405(super.anInt6238);
		@Pc(53) int local53 = local11.anInt66;
		@Pc(56) int local56 = local11.anInt39;
		if (local53 != 0 || local56 != 0 || local11.anInt56 != 0 || local11.anInt72 != 0) {
			arg0 |= 0x7;
		}
		@Pc(101) boolean local101 = super.aByte73 != 0 && Static400.anInt6752 >= super.anInt6218 && super.anInt6262 > Static400.anInt6752;
		if (local101) {
			arg0 |= 0x80000;
		}
		@Pc(142) Class63 local142 = super.aClass63Array3[0] = this.aClass75_1.method1898(local50, local30, Static281.aClass98_3, super.anInt6222, Static313.aClass272_2, Static133.aClass223_1, super.anInt6212, Static8.aClass100_1, super.anInt6231, super.anInt6271, arg1, super.anInt6214, Static448.aClass38_4, Static329.aClass201_9, super.aClass91Array3, super.anInt6260, arg0);
		@Pc(145) int local145 = Static325.method4455();
		if (Static108.anInt2167 < 96 && local145 > 50) {
			Static168.method2799();
		}
		@Pc(176) int local176;
		if (Static110.aClass151_5 != Static284.aClass151_8 && local145 < 50) {
			local176 = 50 - local145;
			while (local176 > Static332.anInt5638) {
				Static294.aByteArrayArray50[Static332.anInt5638] = new byte[102400];
				Static332.anInt5638++;
			}
			while (Static332.anInt5638 > local176) {
				Static332.anInt5638--;
				Static294.aByteArrayArray50[Static332.anInt5638] = null;
			}
		} else if (Static284.aClass151_8 != Static110.aClass151_5) {
			Static332.anInt5638 = 0;
			Static294.aByteArrayArray50 = new byte[50][];
		}
		if (local142 == null) {
			return false;
		}
		super.anInt6248 = local142.B();
		this.method4922(local142);
		local176 = super.aClass145_7.method3304();
		if (local53 == 0 && local56 == 0) {
			this.method4912(local176, this.method4919() << 7, 0, 0, this.method4919() << 7);
		} else {
			this.method4912(local176, local56, local11.anInt64, local11.anInt52, local53);
			if (super.anInt6286 != 0) {
				local142.W(super.anInt6286);
			}
			if (super.anInt6224 != 0) {
				local142.K(super.anInt6224);
			}
			if (super.anInt6280 != 0) {
				local142.a(0, super.anInt6280, 0);
			}
		}
		if (local101) {
			local142.method6087(super.aByte72, super.aByte71, super.aByte70, super.aByte73 & 0xFF);
		}
		@Pc(326) Class156 local326;
		@Pc(340) boolean local340;
		@Pc(342) int local342;
		@Pc(385) Class63 local385;
		if (this.aBoolean406 || super.anInt6274 == -1 || super.anInt6210 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local326 = Static147.aClass107_1.method2639(super.anInt6274);
			local340 = local326.aByte55 == 3 && (local53 != 0 || local56 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt6235 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt6229 != 0) {
					local342 |= 0x2;
				}
			}
			local385 = super.aClass63Array3[1] = local326.method3463(super.anInt6223, Static281.aClass98_3, local342, super.anInt6233, super.anInt6210, arg1);
			if (local385 != null) {
				if (super.anInt6229 != 0) {
					local385.a(0, -super.anInt6229 << 0, 0);
				}
				if (super.anInt6235 != 0) {
					local385.ma(super.anInt6235 * 2048);
				}
				if (local340) {
					if (super.anInt6286 != 0) {
						local385.W(super.anInt6286);
					}
					if (super.anInt6224 != 0) {
						local385.K(super.anInt6224);
					}
					if (super.anInt6280 != 0) {
						local385.a(0, super.anInt6280, 0);
					}
				}
			}
		}
		if (this.aBoolean406 || super.anInt6270 == -1 || super.anInt6237 == -1) {
			super.aClass63Array3[3] = null;
		} else {
			local326 = Static147.aClass107_1.method2639(super.anInt6270);
			local340 = local326.aByte55 == 3 && (local53 != 0 || local56 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt6279 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt6245 != 0) {
					local342 |= 0x2;
				}
			}
			local385 = super.aClass63Array3[3] = local326.method3468(local342, arg1, super.anInt6216, super.anInt6237, super.anInt6273, Static281.aClass98_3);
			if (local385 != null) {
				if (super.anInt6245 != 0) {
					local385.a(0, -super.anInt6245 << 0, 0);
				}
				if (super.anInt6279 != 0) {
					local385.ma(super.anInt6279 * 2048);
				}
				if (local340) {
					if (super.anInt6286 != 0) {
						local385.W(super.anInt6286);
					}
					if (super.anInt6224 != 0) {
						local385.K(super.anInt6224);
					}
					if (super.anInt6280 != 0) {
						local385.a(0, super.anInt6280, 0);
					}
				}
			}
		}
		super.aClass63Array3[2] = null;
		if (!this.aBoolean406 && super.aClass10_Sub34_3 != null) {
			if (Static400.anInt6752 >= super.aClass10_Sub34_3.anInt5326) {
				super.aClass10_Sub34_3 = null;
			} else if (super.aClass10_Sub34_3.anInt5319 <= Static400.anInt6752) {
				@Pc(609) Class63 local609 = super.aClass10_Sub34_3.method4260(local7 | 0x7, arg1);
				if (local609 != null) {
					local609.a(-super.anInt7092 + super.aClass10_Sub34_3.anInt5331, super.aClass10_Sub34_3.anInt5322 - super.anInt7096, super.aClass10_Sub34_3.anInt5318 - super.anInt7094);
					if (local176 != 0) {
						local609.ma(-local176 & 0x3FFF);
					}
					super.aClass63Array3[2] = local609;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!nn;)V")
	public void method4930(@OriginalArg(1) Class10_Sub8 arg0) {
		arg0.anInt2989 = 0;
		@Pc(12) int local12 = arg0.method2502();
		this.aByte75 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4919();
		this.method4917((local12 >> 3 & 0x7) + 1);
		this.aByte76 = (byte) (local12 >> 6 & 0x3);
		super.anInt7092 += this.method4919() - local41 << 6;
		super.anInt7094 += this.method4919() - local41 << 6;
		this.aByte74 = arg0.method2460();
		this.anInt6324 = arg0.method2460();
		this.anInt6311 = arg0.method2460();
		this.anInt6327 = 0;
		@Pc(110) int local110 = -1;
		@Pc(113) int[] local113 = new int[12];
		@Pc(133) int local133;
		@Pc(139) int local139;
		@Pc(178) int local178;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(121) int local121 = arg0.method2502();
			if (local121 == 0) {
				local113[local115] = 0;
			} else {
				local133 = arg0.method2502();
				local139 = (local121 << 8) + local133;
				if (local115 == 0 && local139 == 65535) {
					local110 = arg0.method2485();
					this.anInt6327 = arg0.method2502();
					break;
				}
				if (local139 >= 32768) {
					local139 = Static243.anIntArray443[local139 - 32768];
					local113[local115] = local139 | 0x40000000;
					local178 = Static313.aClass272_2.method6068(local139).anInt1724;
					if (local178 != 0) {
						this.anInt6327 = local178;
					}
				} else {
					local113[local115] = local139 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(203) int[] local203 = new int[5];
		for (local133 = 0; local133 < 5; local133++) {
			local139 = arg0.method2502();
			if (local139 < 0 || Static283.aShortArrayArray5[local133].length <= local139) {
				local139 = 0;
			}
			local203[local133] = local139;
		}
		this.anInt6310 = arg0.method2485();
		this.aString57 = arg0.method2478();
		if (local29) {
			this.aString58 = arg0.method2478();
		} else {
			this.aString58 = this.aString57;
		}
		this.anInt6314 = arg0.method2502();
		if (local37) {
			this.anInt6326 = arg0.method2485();
			this.anInt6309 = this.anInt6314;
			this.anInt6305 = -1;
		} else {
			this.anInt6326 = 0;
			this.anInt6309 = arg0.method2502();
			this.anInt6305 = arg0.method2502();
			if (this.anInt6305 == 255) {
				this.anInt6305 = -1;
			}
		}
		local139 = this.anInt6328;
		this.anInt6328 = arg0.method2502();
		@Pc(326) int local326;
		if (this.anInt6328 == 0) {
			Static428.method5675(this);
		} else {
			local178 = this.anInt6295;
			@Pc(323) int local323 = this.anInt6296;
			local326 = this.anInt6301;
			@Pc(329) int local329 = this.anInt6307;
			@Pc(332) int local332 = this.anInt6302;
			this.anInt6295 = arg0.method2485();
			this.anInt6296 = arg0.method2485();
			this.anInt6301 = arg0.method2485();
			this.anInt6307 = arg0.method2485();
			this.anInt6302 = arg0.method2502();
			if (this.anInt6328 != local139 || local178 != this.anInt6295 || local323 != this.anInt6296 || this.anInt6301 != local326 || local329 != this.anInt6307 || local332 != this.anInt6302) {
				Static16.method248(this);
			}
		}
		if (this.aClass75_1 == null) {
			this.aClass75_1 = new Class75();
		}
		local178 = this.aClass75_1.anInt2171;
		@Pc(408) int[] local408 = this.aClass75_1.anIntArray194;
		this.aClass75_1.method1894(local110, local113, local203, this.aByte75 == 1, this.method4910());
		if (local110 != local178) {
			super.anInt7092 = (super.anIntArray610[0] << 7) + (this.method4919() << 6);
			super.anInt7094 = (super.anIntArray611[0] << 7) + (this.method4919() << 6);
		}
		if (Static245.anInt4435 == super.anInt6228 && local408 != null) {
			for (local326 = 0; local326 < local203.length; local326++) {
				if (local203[local326] != local408[local326]) {
					Static313.aClass272_2.method6062();
					break;
				}
			}
		}
		if (super.aClass40_Sub6_6 != null) {
			super.aClass40_Sub6_6.method4093();
		}
		if (super.anInt6238 == -1 || !super.aBoolean403) {
			return;
		}
		@Pc(511) Class6 local511 = this.method4923();
		if (!local511.method36(super.anInt6238)) {
			super.aBoolean403 = false;
			super.anInt6238 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIB)V")
	public void method4931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6211 != -1 && Static281.aClass98_3.method2405(super.anInt6211).anInt4038 == 1) {
			super.anInt6211 = -1;
		}
		@Pc(41) Class156 local41;
		if (super.anInt6274 != -1) {
			local41 = Static147.aClass107_1.method2639(super.anInt6274);
			if (local41.aBoolean289 && local41.anInt4316 != -1 && Static281.aClass98_3.method2405(local41.anInt4316).anInt4038 == 1) {
				super.anInt6274 = -1;
			}
		}
		if (super.anInt6270 != -1) {
			local41 = Static147.aClass107_1.method2639(super.anInt6270);
			if (local41.aBoolean289 && local41.anInt4316 != -1 && Static281.aClass98_3.method2405(local41.anInt4316).anInt4038 == 1) {
				super.anInt6270 = -1;
			}
		}
		this.anInt6298 = -1;
		if (arg1 < 0 || arg1 >= Static2.anInt7 || arg0 < 0 || arg0 >= Static17.anInt315) {
			this.method4925(arg1, arg0);
		} else if (super.anIntArray610[0] >= 0 && Static2.anInt7 > super.anIntArray610[0] && super.anIntArray611[0] >= 0 && super.anIntArray611[0] < Static17.anInt315) {
			if (arg2 == 2) {
				Static31.method445(this, arg0, arg1);
			}
			this.method4928(arg1, arg0, arg2);
		} else {
			this.method4925(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I")
	@Override
	public int method4908() {
		return -1;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(ZZ)Ljava/lang/String;")
	public String method4933() {
		@Pc(7) String local7 = "";
		if (Static426.aStringArray55 != null) {
			local7 = local7 + Static426.aStringArray55[this.aByte76];
		}
		@Pc(34) int[] local34;
		if (this.aByte75 == 1 && Static370.anIntArray617 != null) {
			local34 = Static370.anIntArray617;
		} else {
			local34 = Static153.anIntArray298;
		}
		if (local34 != null && local34[this.aByte76] != -1) {
			@Pc(54) Class12 local54 = Static108.aClass263_1.method5783(local34[this.aByte76]);
			if (local54.aChar1 == 's') {
				local7 = local7 + local54.method171(this.aByte74 & 0xFF);
			} else {
				Static432.method5720("gdn1", new Throwable());
				local34[this.aByte76] = -1;
			}
		}
		local7 = local7 + this.aString57;
		if (Static276.aStringArray25 != null) {
			local7 = local7 + Static276.aStringArray25[this.aByte76];
		}
		return local7;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)I")
	@Override
	protected int method4910() {
		return this.anInt6310;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass75_1 == null || !this.method4929(131072, arg0)) {
			return false;
		}
		@Pc(19) Class34 local19 = arg0.method5819();
		@Pc(24) int local24 = super.aClass145_7.method3304();
		local19.ca(local24);
		local19.W(super.anInt7092, super.anInt7096, super.anInt7094);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass63Array3.length > local39; local39++) {
			if (super.aClass63Array3[local39] != null && super.aClass63Array3[local39].method6101(arg2, arg1, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		return local37;
	}
}
