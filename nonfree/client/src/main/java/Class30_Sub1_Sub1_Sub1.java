import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class30_Sub1_Sub1_Sub1 extends Class30_Sub1_Sub1 {

	@OriginalMember(owner = "client!bea", name = "Ac", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!bea", name = "Mc", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!bea", name = "Tc", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!bea", name = "Vc", descriptor = "Lclient!co;")
	public Class58 aClass58_1;

	@OriginalMember(owner = "client!bea", name = "ld", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!bea", name = "sd", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!bea", name = "Ec", descriptor = "I")
	public int anInt732 = -1;

	@OriginalMember(owner = "client!bea", name = "Cc", descriptor = "I")
	public int anInt730 = 0;

	@OriginalMember(owner = "client!bea", name = "Sc", descriptor = "B")
	private byte aByte21 = 0;

	@OriginalMember(owner = "client!bea", name = "Zc", descriptor = "I")
	public int anInt748 = -1;

	@OriginalMember(owner = "client!bea", name = "Yc", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!bea", name = "yc", descriptor = "I")
	public int anInt727 = -1;

	@OriginalMember(owner = "client!bea", name = "cd", descriptor = "Z")
	public boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bea", name = "Qc", descriptor = "I")
	public int anInt742 = -1;

	@OriginalMember(owner = "client!bea", name = "Fc", descriptor = "I")
	public int anInt733 = 255;

	@OriginalMember(owner = "client!bea", name = "Kc", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!bea", name = "hd", descriptor = "I")
	public int anInt754 = 0;

	@OriginalMember(owner = "client!bea", name = "Hc", descriptor = "I")
	public int anInt735 = -1;

	@OriginalMember(owner = "client!bea", name = "Lc", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!bea", name = "od", descriptor = "I")
	public int anInt761 = 0;

	@OriginalMember(owner = "client!bea", name = "Uc", descriptor = "I")
	public int anInt745 = 0;

	@OriginalMember(owner = "client!bea", name = "md", descriptor = "I")
	public int anInt759 = -1;

	@OriginalMember(owner = "client!bea", name = "fd", descriptor = "Z")
	public boolean aBoolean43 = false;

	@OriginalMember(owner = "client!bea", name = "gd", descriptor = "I")
	public int anInt753 = -1;

	@OriginalMember(owner = "client!bea", name = "Wc", descriptor = "I")
	public int anInt746 = -1;

	@OriginalMember(owner = "client!bea", name = "Jc", descriptor = "I")
	public int anInt737 = 0;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return false;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!qa;II)Z")
	private boolean method776(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class166 local11 = this.method3602();
		@Pc(30) Class64 local30 = super.anInt4138 != -1 && super.anInt4178 == 0 ? Static47.aClass41_1.method911(super.anInt4138) : null;
		@Pc(51) Class64 local51 = super.anInt4155 == -1 || this.aBoolean42 || super.aBoolean335 && local30 != null ? null : Static47.aClass41_1.method911(super.anInt4155);
		@Pc(54) int local54 = local11.anInt4977;
		@Pc(57) int local57 = local11.anInt4988;
		if (local54 != 0 || local57 != 0 || local11.anInt4955 != 0 || local11.anInt4995 != 0) {
			arg1 |= 0x7;
		}
		@Pc(96) boolean local96 = super.aByte57 != 0 && super.anInt4139 <= Static409.anInt7683 && Static409.anInt7683 < super.anInt4198;
		if (local96) {
			arg1 |= 0x80000;
		}
		@Pc(137) Class26 local137 = super.aClass26Array3[0] = this.aClass58_1.method1587(super.anInt4164, super.aClass288Array3, Static274.aClass78_1, Static218.aClass160_1, super.anInt4188, arg1, super.anInt4124, local51, Static150.aClass254_2, local30, Static47.aClass41_1, super.anInt4187, Static393.aClass31_1, Static161.aClass110_3, super.anInt4168, arg0, super.anInt4142);
		@Pc(140) int local140 = Static547.method8023();
		if (Static458.anInt8335 < 96 && local140 > 50) {
			Static143.method2852();
		}
		@Pc(180) int local180;
		if (Static79.aClass285_2 != Static171.aClass285_4 && local140 < 50) {
			local180 = 50 - local140;
			while (Static106.anInt2437 < local180) {
				Static407.aByteArrayArray25[Static106.anInt2437] = new byte[102400];
				Static106.anInt2437++;
			}
			while (local180 < Static106.anInt2437) {
				Static106.anInt2437--;
				Static407.aByteArrayArray25[Static106.anInt2437] = null;
			}
		} else if (Static79.aClass285_2 != Static171.aClass285_4) {
			Static407.aByteArrayArray25 = new byte[50][];
			Static106.anInt2437 = 0;
		}
		if (local137 == null) {
			return false;
		}
		super.anInt4190 = local137.TA();
		this.method3596(local137);
		local180 = super.aClass221_7.method5389();
		if (local54 == 0 && local57 == 0) {
			this.method3598(this.method3591() << 7, 0, local180, 0, this.method3591() << 7);
		} else {
			this.method3598(local57, local11.anInt4960, local180, local11.anInt4980, local54);
			if (super.anInt4192 != 0) {
				local137.D(super.anInt4192);
			}
			if (super.anInt4179 != 0) {
				local137.b(super.anInt4179);
			}
			if (super.anInt4166 != 0) {
				local137.ca(0, super.anInt4166, 0);
			}
		}
		if (local96) {
			local137.method7995(super.aByte60, super.aByte59, super.aByte58, super.aByte57 & 0xFF);
		}
		@Pc(330) Class50 local330;
		@Pc(345) boolean local345;
		@Pc(347) int local347;
		@Pc(393) Class26 local393;
		if (this.aBoolean42 || super.anInt4157 == -1 || super.anInt4145 == -1) {
			super.aClass26Array3[1] = null;
		} else {
			local330 = Static82.aClass212_2.method5063(super.anInt4157);
			local345 = local330.aByte29 == 3 && (local54 != 0 || local57 != 0);
			local347 = local7;
			if (local345) {
				local347 = local7 | 0x7;
			} else {
				if (super.anInt4195 != 0) {
					local347 = local7 | 0x5;
				}
				if (super.anInt4184 != 0) {
					local347 |= 0x2;
				}
			}
			local393 = super.aClass26Array3[1] = local330.method1440(super.anInt4130, local347, super.anInt4145, Static47.aClass41_1, arg0, super.anInt4191);
			if (local393 != null) {
				if (super.anInt4184 != 0) {
					local393.ca(0, -super.anInt4184 << 0, 0);
				}
				if (super.anInt4195 != 0) {
					local393.OA(super.anInt4195 * 2048);
				}
				if (local345) {
					if (super.anInt4192 != 0) {
						local393.D(super.anInt4192);
					}
					if (super.anInt4179 != 0) {
						local393.b(super.anInt4179);
					}
					if (super.anInt4166 != 0) {
						local393.ca(0, super.anInt4166, 0);
					}
				}
			}
		}
		if (this.aBoolean42 || super.anInt4126 == -1 || super.anInt4140 == -1) {
			super.aClass26Array3[3] = null;
		} else {
			local330 = Static82.aClass212_2.method5063(super.anInt4126);
			local345 = local330.aByte29 == 3 && (local54 != 0 || local57 != 0);
			local347 = local7;
			if (local345) {
				local347 = local7 | 0x7;
			} else {
				if (super.anInt4136 != 0) {
					local347 = local7 | 0x5;
				}
				if (super.anInt4185 != 0) {
					local347 |= 0x2;
				}
			}
			local393 = super.aClass26Array3[3] = local330.method1439(super.anInt4140, arg0, local347, super.anInt4183, Static47.aClass41_1, super.anInt4134);
			if (local393 != null) {
				if (super.anInt4185 != 0) {
					local393.ca(0, -super.anInt4185 << 0, 0);
				}
				if (super.anInt4136 != 0) {
					local393.OA(super.anInt4136 * 2048);
				}
				if (local345) {
					if (super.anInt4192 != 0) {
						local393.D(super.anInt4192);
					}
					if (super.anInt4179 != 0) {
						local393.b(super.anInt4179);
					}
					if (super.anInt4166 != 0) {
						local393.ca(0, super.anInt4166, 0);
					}
				}
			}
		}
		super.aClass26Array3[2] = null;
		if (!this.aBoolean42 && super.aClass12_Sub26_3 != null) {
			if (super.aClass12_Sub26_3.anInt4801 <= Static409.anInt7683) {
				super.aClass12_Sub26_3 = null;
			} else if (super.aClass12_Sub26_3.anInt4794 <= Static409.anInt7683) {
				@Pc(621) Class26 local621 = super.aClass12_Sub26_3.method4059(arg0, local7 | 0x7);
				if (local621 != null) {
					local621.ca(-super.anInt9418 + super.aClass12_Sub26_3.anInt4802, super.aClass12_Sub26_3.anInt4799 - super.anInt9422, super.aClass12_Sub26_3.anInt4796 - super.anInt9416);
					if (local180 != 0) {
						local621.OA(-local180 & 0x3FFF);
					}
					super.aClass26Array3[2] = local621;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!r;ILclient!m;Lclient!qa;IIII)V")
	private void method777(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg4 * arg4 + arg1 * arg1;
		if (local18 < 16384 || arg6 < local18) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg1, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(50) Class26 local50 = Static61.method1452(arg3, local38, super.anInt4179, super.anInt4192, arg5, super.anInt4166);
		if (local50 != null) {
			arg3.method5822(false);
			local50.method8003(arg2, null, 0);
			arg3.method5822(true);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7903(@OriginalArg(0) Class42 arg0) {
		if (this.aClass58_1 != null && (super.aBoolean337 || this.method776(arg0, 0))) {
			this.method3592(super.aBoolean337, arg0, super.aClass26Array3);
			super.aClass26Array3[0] = super.aClass26Array3[1] = super.aClass26Array3[2] = super.aClass26Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)I")
	@Override
	public int method3590() {
		return -1;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method778() {
		@Pc(7) String local7 = "";
		if (Static394.aStringArray47 != null) {
			local7 = local7 + Static394.aStringArray47[this.aByte19];
		}
		@Pc(39) int[] local39;
		if (this.aByte20 == 1 && Static43.anIntArray121 != null) {
			local39 = Static43.anIntArray121;
		} else {
			local39 = Static207.anIntArray337;
		}
		if (local39 != null && local39[this.aByte19] != -1) {
			@Pc(59) Class305 local59 = Static461.aClass95_1.method2637(local39[this.aByte19]);
			if (local59.aChar4 == 's') {
				local7 = local7 + local59.method7724(this.aByte21 & 0xFF);
			} else {
				Static508.method7541(new Throwable(), "gdn1");
				local39[this.aByte19] = -1;
			}
		}
		local7 = local7 + this.aString7;
		if (Static372.aStringArray44 != null) {
			local7 = local7 + Static372.aStringArray44[this.aByte19];
		}
		return local7;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BIII)V")
	public void method779(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4138 != -1 && Static47.aClass41_1.method911(super.anInt4138).anInt1975 == 1) {
			super.anInt4138 = -1;
		}
		@Pc(29) Class50 local29;
		if (super.anInt4157 != -1) {
			local29 = Static82.aClass212_2.method5063(super.anInt4157);
			if (local29.aBoolean101 && local29.anInt1432 != -1 && Static47.aClass41_1.method911(local29.anInt1432).anInt1975 == 1) {
				super.anInt4157 = -1;
			}
		}
		if (super.anInt4126 != -1) {
			local29 = Static82.aClass212_2.method5063(super.anInt4126);
			if (local29.aBoolean101 && local29.anInt1432 != -1 && Static47.aClass41_1.method911(local29.anInt1432).anInt1975 == 1) {
				super.anInt4126 = -1;
			}
		}
		this.anInt746 = -1;
		if (arg1 < 0 || arg1 >= Static37.anInt7512 || arg2 < 0 || arg2 >= Static329.anInt6247) {
			this.method782(arg1, arg2);
		} else if (super.anIntArray316[0] >= 0 && super.anIntArray316[0] < Static37.anInt7512 && super.anIntArray317[0] >= 0 && super.anIntArray317[0] < Static329.anInt6247) {
			if (arg0 == 2) {
				Static207.method3852(this, arg2, arg1);
			}
			this.method783(arg1, arg0, arg2);
		} else {
			this.method782(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZIILclient!jt;ILclient!qa;)V")
	@Override
	public void method7904(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class42 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(ZLclient!qa;)Lclient!vw;")
	@Override
	public Class7_Sub8 method7908(@OriginalArg(1) Class42 arg0) {
		if (this.aClass58_1 == null || !this.method776(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class91 local19 = arg0.method5847();
		@Pc(24) int local24 = super.aClass221_7.method5389();
		local19.ma(local24);
		local19.TA(super.anInt9418, super.anInt9422, super.anInt9416);
		@Pc(38) float local38 = arg0.P();
		@Pc(41) float local41 = arg0.ra();
		@Pc(105) int local105;
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean182) {
			@Pc(48) Class166 local48 = this.method3602();
			if (local48.aBoolean390 && (this.aClass58_1.anInt1697 == -1 || Static161.aClass110_3.method3018(this.aClass58_1.anInt1697).aBoolean326)) {
				@Pc(83) Class64 local83 = super.anInt4138 != -1 && super.anInt4178 == 0 ? Static47.aClass41_1.method911(super.anInt4138) : null;
				@Pc(103) Class64 local103 = super.anInt4155 == -1 || this.aBoolean42 || super.aBoolean335 && local83 != null ? null : Static47.aClass41_1.method911(super.anInt4155);
				local105 = 0;
				if (super.anInt4146 != 0) {
					local105 = this.method3593();
				}
				@Pc(148) Class26 local148 = Static226.method4098(240, 0, local103 == null ? super.anInt4142 : super.anInt4187, super.aClass26Array3[0], local24, local105, 160, super.anInt4192, arg0, super.anInt4179, super.anInt4166, 1, local103 == null ? local83 : local103, 0);
				if (local148 != null) {
					arg0.la(local38, local41 - 128.0F);
					arg0.method5822(false);
					local148.method8003(local19, null, 0);
					arg0.method5822(true);
				}
			}
		}
		if (Static440.aClass30_Sub1_Sub1_Sub1_2 == this) {
			arg0.la(local38, local41 - 144.0F);
			local19.oa(super.anInt9418, super.anInt9422, super.anInt9416);
			for (@Pc(189) int local189 = Static22.aClass76Array28.length - 1; local189 >= 0; local189--) {
				@Pc(195) Class76 local195 = Static22.aClass76Array28[local189];
				if (local195 != null && local195.anInt2316 != -1) {
					@Pc(226) int local226;
					if (local195.anInt2310 == 1) {
						@Pc(214) Class12_Sub41 local214 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local195.anInt2309);
						if (local214 != null) {
							@Pc(219) Class30_Sub1_Sub1_Sub2 local219 = local214.aClass30_Sub1_Sub1_Sub2_2;
							local226 = local219.anInt9418 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418;
							@Pc(233) int local233 = local219.anInt9416 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416;
							this.method777(super.aClass26Array3[0], local226, local19, arg0, local233, local195.anInt2316, 5760000);
						}
					}
					if (local195.anInt2310 == 2) {
						@Pc(262) int local262 = local195.anInt2313 + 64 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418;
						local105 = local195.anInt2317 + 64 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416;
						local226 = local195.anInt2311 << 7;
						local226 *= local226;
						this.method777(super.aClass26Array3[0], local262, local19, arg0, local105, local195.anInt2316, local226);
					}
					if (local195.anInt2310 == 10 && local195.anInt2309 >= 0 && Static90.aClass30_Sub1_Sub1_Sub1Array1.length > local195.anInt2309) {
						@Pc(316) Class30_Sub1_Sub1_Sub1 local316 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local195.anInt2309];
						if (local316 != null) {
							local105 = local316.anInt9418 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418;
							local226 = local316.anInt9416 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416;
							this.method777(super.aClass26Array3[0], local105, local19, arg0, local226, local195.anInt2316, 5760000);
						}
					}
				}
			}
			local19.ma(local24);
			local19.TA(super.anInt9418, super.anInt9422, super.anInt9416);
		}
		arg0.la(local38, local41);
		@Pc(379) Class7_Sub8 local379 = Static196.method3703(super.aClass26Array3.length);
		if (super.aClass7_Sub3_3 == null) {
			arg0.method5860(super.aClass26Array3, local19, local379.aClass7_Sub4Array1, Static440.aClass30_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(401) Class136 local401 = super.aClass7_Sub3_3.method4202();
			arg0.method5809(super.aClass26Array3, local401, local19, local379.aClass7_Sub4Array1, Static440.aClass30_Sub1_Sub1_Sub1_2 == this ? 1 : 0);
		}
		this.method3592(false, arg0, super.aClass26Array3);
		super.anInt4158 = Static491.anInt8889;
		super.aClass26Array3[0] = super.aClass26Array3[1] = super.aClass26Array3[2] = super.aClass26Array3[3] = null;
		return local379;
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method780() {
		return this.aString6;
	}

	@OriginalMember(owner = "client!bea", name = "n", descriptor = "(I)Z")
	public boolean method781() {
		return this.aClass58_1 != null;
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(B)I")
	@Override
	protected int method3600() {
		return this.anInt744;
	}

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "(I)I")
	@Override
	public int method7815() {
		return super.anInt4190;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III)V")
	public void method782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray316[0] = arg0;
		super.anInt4201 = 0;
		super.anInt4202 = 0;
		super.anInt4203 = 0;
		super.anIntArray317[0] = arg1;
		@Pc(26) int local26 = this.method3591();
		super.anInt9418 = super.anIntArray316[0] * 128 + local26 * 64;
		super.anInt9416 = super.anIntArray317[0] * 128 + local26 * 64;
		if (Static440.aClass30_Sub1_Sub1_Sub1_2 == this) {
			Static299.method4822();
		}
		if (super.aClass7_Sub3_3 != null) {
			super.aClass7_Sub3_3.method4190();
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIBI)V")
	public void method783(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4201 < 9) {
			super.anInt4201++;
		}
		for (@Pc(24) int local24 = super.anInt4201; local24 > 0; local24--) {
			super.anIntArray316[local24] = super.anIntArray316[local24 - 1];
			super.anIntArray317[local24] = super.anIntArray317[local24 - 1];
			super.aByteArray49[local24] = super.aByteArray49[local24 - 1];
		}
		super.anIntArray316[0] = arg0;
		super.aByteArray49[0] = arg1;
		super.anIntArray317[0] = arg2;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!daa;B)V")
	public void method784(@OriginalArg(0) Class12_Sub8 arg0) {
		arg0.anInt6217 = 0;
		@Pc(12) int local12 = arg0.method5216();
		this.aByte20 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(34) boolean local34 = (local12 & 0x4) != 0;
		@Pc(38) int local38 = super.method3591();
		this.method3599((local12 >> 3 & 0x7) + 1);
		this.aByte19 = (byte) (local12 >> 6 & 0x3);
		super.anInt9418 += this.method3591() - local38 << 6;
		super.anInt9416 += this.method3591() - local38 << 6;
		this.aByte21 = arg0.method5173();
		this.anInt732 = arg0.method5173();
		this.anInt735 = arg0.method5173();
		this.anInt737 = 0;
		@Pc(108) int local108 = -1;
		@Pc(111) int[] local111 = new int[12];
		@Pc(134) int local134;
		@Pc(140) int local140;
		@Pc(179) int local179;
		for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
			@Pc(119) int local119 = arg0.method5216();
			if (local119 == 0) {
				local111[local113] = 0;
			} else {
				local134 = arg0.method5216();
				local140 = local134 + (local119 << 8);
				if (local113 == 0 && local140 == 65535) {
					local108 = arg0.method5199();
					this.anInt737 = arg0.method5216();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static374.anIntArray481[local140 - 32768];
					local111[local113] = local140 | 0x40000000;
					local179 = Static150.aClass254_2.method6340(local140).anInt1624;
					if (local179 != 0) {
						this.anInt737 = local179;
					}
				} else {
					local111[local113] = local140 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local134 = 0; local134 < 5; local134++) {
			local140 = arg0.method5216();
			if (local140 < 0 || Static468.aShortArrayArray10[local134].length <= local140) {
				local140 = 0;
			}
			local204[local134] = local140;
		}
		this.anInt744 = arg0.method5199();
		this.aString7 = arg0.method5206();
		if (local26) {
			this.aString6 = arg0.method5206();
		} else {
			this.aString6 = this.aString7;
		}
		this.anInt730 = arg0.method5216();
		if (local34) {
			this.anInt745 = arg0.method5199();
			this.anInt748 = -1;
			this.anInt761 = this.anInt730;
		} else {
			this.anInt745 = 0;
			this.anInt761 = arg0.method5216();
			this.anInt748 = arg0.method5216();
			if (this.anInt748 == 255) {
				this.anInt748 = -1;
			}
		}
		local140 = this.anInt754;
		this.anInt754 = arg0.method5216();
		@Pc(316) int local316;
		if (this.anInt754 == 0) {
			Static342.method2040(this);
		} else {
			local179 = this.anInt753;
			@Pc(313) int local313 = this.anInt742;
			local316 = this.anInt759;
			@Pc(319) int local319 = this.anInt727;
			@Pc(322) int local322 = this.anInt733;
			this.anInt753 = arg0.method5199();
			this.anInt742 = arg0.method5199();
			this.anInt759 = arg0.method5199();
			this.anInt727 = arg0.method5199();
			this.anInt733 = arg0.method5216();
			if (local140 != this.anInt754 || this.anInt753 != local179 || local313 != this.anInt742 || this.anInt759 != local316 || this.anInt727 != local319 || this.anInt733 != local322) {
				Static105.method2176(this);
			}
		}
		if (this.aClass58_1 == null) {
			this.aClass58_1 = new Class58();
		}
		local179 = this.aClass58_1.anInt1697;
		@Pc(403) int[] local403 = this.aClass58_1.anIntArray178;
		this.aClass58_1.method1586(local108, this.method3600(), this.aByte20 == 1, local204, local111);
		if (local179 != local108) {
			super.anInt9418 = (super.anIntArray316[0] << 7) + (this.method3591() << 6);
			super.anInt9416 = (super.anIntArray317[0] << 7) + (this.method3591() << 6);
		}
		if (Static396.anInt7452 == super.anInt4197 && local403 != null) {
			for (local316 = 0; local316 < local204.length; local316++) {
				if (local204[local316] != local403[local316]) {
					Static150.aClass254_2.method6349();
					break;
				}
			}
		}
		if (super.aClass7_Sub3_3 != null) {
			super.aClass7_Sub3_3.method4190();
		}
		if (super.anInt4155 == -1 || !super.aBoolean335) {
			return;
		}
		@Pc(511) Class166 local511 = this.method3602();
		if (!local511.method4182(super.anInt4155)) {
			super.anInt4155 = -1;
			super.aBoolean335 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "(I)V")
	@Override
	public void method7909() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLclient!qa;)Lclient!nk;")
	@Override
	public Class218 method7906(@OriginalArg(1) Class42 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method7907(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass58_1 == null || !this.method776(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class91 local19 = arg0.method5847();
		@Pc(24) int local24 = super.aClass221_7.method5389();
		local19.ma(local24);
		local19.TA(super.anInt9418, super.anInt9422, super.anInt9416);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass26Array3.length; local39++) {
			if (super.aClass26Array3[local39] != null && super.aClass26Array3[local39].method8005(arg1, arg2, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass26Array3[0] = super.aClass26Array3[1] = super.aClass26Array3[2] = super.aClass26Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!bea", name = "k", descriptor = "(I)I")
	@Override
	public int method3591() {
		return this.aClass58_1 == null || this.aClass58_1.anInt1697 == -1 ? super.method3591() : Static161.aClass110_3.method3018(this.aClass58_1.anInt1697).anInt4113;
	}
}
