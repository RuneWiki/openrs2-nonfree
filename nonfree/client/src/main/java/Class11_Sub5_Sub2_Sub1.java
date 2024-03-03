import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class11_Sub5_Sub2_Sub1 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!nh", name = "qc", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_37 = new Class98(64);

	@OriginalMember(owner = "client!nh", name = "pc", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!nh", name = "tc", descriptor = "I")
	public int anInt4163;

	@OriginalMember(owner = "client!nh", name = "Gc", descriptor = "I")
	public int anInt4175;

	@OriginalMember(owner = "client!nh", name = "Rc", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!nh", name = "Wc", descriptor = "I")
	private int anInt4189;

	@OriginalMember(owner = "client!nh", name = "ed", descriptor = "Lclient!jo;")
	public Class117 aClass117_1;

	@OriginalMember(owner = "client!nh", name = "rc", descriptor = "I")
	public int anInt4161 = -1;

	@OriginalMember(owner = "client!nh", name = "vc", descriptor = "I")
	public int anInt4165 = 0;

	@OriginalMember(owner = "client!nh", name = "Mc", descriptor = "I")
	public int anInt4181 = -1;

	@OriginalMember(owner = "client!nh", name = "yc", descriptor = "I")
	public int anInt4168 = -1;

	@OriginalMember(owner = "client!nh", name = "xc", descriptor = "I")
	public int anInt4167 = 0;

	@OriginalMember(owner = "client!nh", name = "zc", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!nh", name = "Sc", descriptor = "I")
	public int anInt4185 = -1;

	@OriginalMember(owner = "client!nh", name = "Oc", descriptor = "I")
	public int anInt4182 = -1;

	@OriginalMember(owner = "client!nh", name = "sc", descriptor = "I")
	public int anInt4162 = -1;

	@OriginalMember(owner = "client!nh", name = "Uc", descriptor = "I")
	public int anInt4187 = 0;

	@OriginalMember(owner = "client!nh", name = "mc", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!nh", name = "Ec", descriptor = "I")
	public int anInt4173 = 0;

	@OriginalMember(owner = "client!nh", name = "Zc", descriptor = "I")
	public int anInt4192 = -1;

	@OriginalMember(owner = "client!nh", name = "dd", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!nh", name = "Nc", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!nh", name = "Hc", descriptor = "I")
	public int anInt4176 = 0;

	@OriginalMember(owner = "client!nh", name = "Xc", descriptor = "I")
	public int anInt4190 = -1;

	@OriginalMember(owner = "client!nh", name = "gd", descriptor = "I")
	public int anInt4195 = 255;

	@OriginalMember(owner = "client!nh", name = "cd", descriptor = "Z")
	public boolean aBoolean276 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!wm;B)V", line = 4)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		if (this.aClass117_1 != null && (super.aBoolean321 || this.method4068(arg0, 0))) {
			this.method4334(arg0, super.aClass31Array3, super.aBoolean321);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 94)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V", line = 107)
	public void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt4634 = 0;
		super.anInt4632 = 0;
		super.anIntArray316[0] = arg0;
		super.anInt4633 = 0;
		super.anIntArray317[0] = arg1;
		@Pc(32) int local32 = this.method4329();
		super.anInt6768 = local32 * 64 + super.anIntArray316[0] * 128;
		super.anInt6770 = super.anIntArray317[0] * 128 + local32 * 64;
		if (Static17.aClass11_Sub5_Sub2_Sub1_3 == this) {
			Static323.method5829();
		}
		if (super.aClass12_Sub5_3 != null) {
			super.aClass12_Sub5_3.method4360();
		}
	}

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "(I)Z", line = 134)
	public boolean method4066() {
		return this.aClass117_1 != null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I", line = 151)
	@Override
	public int method4325() {
		return -1;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V", line = 163)
	@Override
	public void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)Z", line = 181)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(B)I", line = 204)
	@Override
	protected int method4330() {
		return this.anInt4189;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!bt;I)V", line = 223)
	public void method4067(@OriginalArg(0) Class2_Sub4 arg0) {
		arg0.anInt5289 = 0;
		@Pc(12) int local12 = arg0.method4816();
		this.aByte39 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method4329();
		this.method4323((local12 >> 3 & 0x7) + 1);
		this.aByte40 = (byte) (local12 >> 6 & 0x3);
		super.anInt6768 += (this.method4329() - local41) * 64;
		super.anInt6770 += (this.method4329() - local41) * 64;
		this.aByte38 = arg0.method4826();
		this.anInt4182 = arg0.method4826();
		this.anInt4192 = arg0.method4826();
		this.anInt4187 = 0;
		@Pc(113) int local113 = -1;
		@Pc(116) int[] local116 = new int[12];
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(182) int local182;
		for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
			@Pc(124) int local124 = arg0.method4816();
			if (local124 == 0) {
				local116[local118] = 0;
			} else {
				local136 = arg0.method4816();
				local143 = (local124 << 8) + local136;
				if (local118 == 0 && local143 == 65535) {
					local113 = arg0.method4830();
					this.anInt4187 = arg0.method4816();
					break;
				}
				if (local143 >= 32768) {
					local143 = Static12.anIntArray15[local143 - 32768];
					local116[local118] = local143 | 0x40000000;
					local182 = Static290.aClass107_2.method2761(local143).anInt5246;
					if (local182 != 0) {
						this.anInt4187 = local182;
					}
				} else {
					local116[local118] = local143 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(207) int[] local207 = new int[5];
		for (local136 = 0; local136 < 5; local136++) {
			local143 = arg0.method4816();
			if (local143 < 0 || local143 >= Static328.aShortArrayArray7[local136].length) {
				local143 = 0;
			}
			local207[local136] = local143;
		}
		this.anInt4189 = arg0.method4830();
		this.aString42 = arg0.method4810();
		if (local29) {
			this.aString41 = arg0.method4810();
		} else {
			this.aString41 = this.aString42;
		}
		this.anInt4173 = arg0.method4816();
		if (local37) {
			this.anInt4167 = arg0.method4830();
			this.anInt4185 = -1;
			this.anInt4165 = this.anInt4173;
		} else {
			this.anInt4167 = 0;
			this.anInt4165 = arg0.method4816();
			this.anInt4185 = arg0.method4816();
			if (this.anInt4185 == 255) {
				this.anInt4185 = -1;
			}
		}
		local143 = this.anInt4176;
		this.anInt4176 = arg0.method4816();
		@Pc(327) int local327;
		if (this.anInt4176 == 0) {
			Static275.method2425(this);
		} else {
			local182 = this.anInt4161;
			@Pc(324) int local324 = this.anInt4181;
			local327 = this.anInt4162;
			@Pc(330) int local330 = this.anInt4190;
			@Pc(333) int local333 = this.anInt4195;
			this.anInt4161 = arg0.method4830();
			this.anInt4181 = arg0.method4830();
			this.anInt4162 = arg0.method4830();
			this.anInt4190 = arg0.method4830();
			this.anInt4195 = arg0.method4816();
			if (local143 != this.anInt4176 || this.anInt4161 != local182 || local324 != this.anInt4181 || this.anInt4162 != local327 || this.anInt4190 != local330 || local333 != this.anInt4195) {
				Static301.method5543(this);
			}
		}
		if (this.aClass117_1 == null) {
			this.aClass117_1 = new Class117();
		}
		local182 = this.aClass117_1.anInt3181;
		@Pc(410) int[] local410 = this.aClass117_1.anIntArray194;
		this.aClass117_1.method3181(local207, local116, this.aByte39 == 1, local113, this.method4330());
		if (local113 != local182) {
			super.anInt6768 = super.anIntArray316[0] * 128 + this.method4329() * 64;
			super.anInt6770 = super.anIntArray317[0] * 128 + this.method4329() * 64;
		}
		if (Class11_Sub3_Sub2.anInt4220 == super.anInt4610 && local410 != null) {
			for (local327 = 0; local327 < local207.length; local327++) {
				if (local207[local327] != local410[local327]) {
					Static290.aClass107_2.method2762();
					break;
				}
			}
		}
		if (super.aClass12_Sub5_3 != null) {
			super.aClass12_Sub5_3.method4360();
		}
		if (super.anInt4577 == -1 || !super.aBoolean317) {
			return;
		}
		@Pc(513) Class222 local513 = this.method4333();
		if (!local513.method5693(super.anInt4577)) {
			super.anInt4577 = -1;
			super.aBoolean317 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!wm;I)Z", line = 422)
	private boolean method4068(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(13) Class222 local13 = this.method4333();
		@Pc(28) Class157 local28 = super.anInt4589 != -1 && super.anInt4582 == 0 ? Static37.aClass85_1.method2373(super.anInt4589) : null;
		@Pc(48) Class157 local48 = super.anInt4577 == -1 || this.aBoolean275 || super.aBoolean317 && local28 != null ? null : Static37.aClass85_1.method2373(super.anInt4577);
		@Pc(51) int local51 = local13.anInt6275;
		@Pc(54) int local54 = local13.anInt6278;
		if (local51 != 0 || local54 != 0 || local13.anInt6269 != 0 || local13.anInt6271 != 0) {
			arg1 |= 0x7;
		}
		super.aClass31Array3[0] = this.aClass117_1.method3192(super.anInt4615, Static55.aClass7_1, Static37.aClass85_1, Static21.aClass55_1, local28, super.anInt4584, super.anInt4620, arg1, super.anInt4585, super.anInt4617, local48, Static199.aClass226_1, Static290.aClass107_2, arg0, Static6.aClass219_1, super.aClass20Array3, super.anInt4599);
		@Pc(116) int local116 = Static340.method6118();
		if (Class208.anInt5790 < 96 && local116 > 50) {
			Static153.method3106();
		}
		@Pc(136) int local136;
		if (Class132.aClass127_6 != Static114.aClass127_4 && local116 < 50) {
			local136 = 50 - local116;
			while (Class41.anInt1331 < local136) {
				Static25.aByteArrayArray3[Class41.anInt1331] = new byte[102400];
				Class41.anInt1331++;
			}
			while (local136 < Class41.anInt1331) {
				Class41.anInt1331--;
				Static25.aByteArrayArray3[Class41.anInt1331] = null;
			}
		} else if (Static114.aClass127_4 != Class132.aClass127_6) {
			Class41.anInt1331 = 0;
			Static25.aByteArrayArray3 = new byte[50][];
		}
		if (super.aClass31Array3[0] == null) {
			return false;
		}
		super.anInt4621 = super.aClass31Array3[0].method3803();
		this.method4321(super.aClass31Array3[0]);
		local136 = super.aClass248_7.method6442();
		super.anInt4588 = 0;
		super.anInt4600 = 0;
		super.anInt4581 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4322(this.method4329() << 7, this.method4329() << 7, local136);
		} else {
			this.method4322(local54, local51, local136);
			if (super.anInt4581 != 0) {
				super.aClass31Array3[0].method3825(super.anInt4581);
			}
			if (super.anInt4588 != 0) {
				super.aClass31Array3[0].method3816(super.anInt4588);
			}
			if (super.anInt4600 != 0) {
				super.aClass31Array3[0].method3814(0, super.anInt4600, 0);
			}
		}
		super.aClass31Array3[1] = null;
		if (!this.aBoolean275 && super.anInt4586 != -1 && super.anInt4574 != -1) {
			@Pc(302) Class91 local302 = Static299.aClass211_2.method5408(super.anInt4586);
			@Pc(322) Class31 local322 = local302.method2435(super.anInt4603, super.anInt4611, arg0, (local302.aBoolean178 ? 7 : 2) | local7, Static37.aClass85_1, super.anInt4574);
			if (local322 != null) {
				local322.method3814(0, -super.anInt4630, 0);
				if (local302.aBoolean178 && (local51 != 0 || local54 != 0)) {
					if (super.anInt4581 != 0) {
						local322.method3825(super.anInt4581);
					}
					if (super.anInt4588 != 0) {
						local322.method3816(super.anInt4588);
					}
					if (super.anInt4600 != 0) {
						local322.method3814(0, super.anInt4600, 0);
					}
				}
				super.aClass31Array3[1] = local322;
			}
		}
		super.aClass31Array3[2] = null;
		if (!this.aBoolean275 && super.aClass2_Sub6_3 != null) {
			if (Class83.anInt2345 >= super.aClass2_Sub6_3.anInt1117) {
				super.aClass2_Sub6_3 = null;
			} else if (Class83.anInt2345 >= super.aClass2_Sub6_3.anInt1099) {
				@Pc(410) Class31 local410 = super.aClass2_Sub6_3.method1360(arg0, local7 | 0x7);
				if (local410 != null) {
					local410.method3814(super.aClass2_Sub6_3.anInt1103 - super.anInt6768, super.aClass2_Sub6_3.anInt1113 + -super.anInt6769, super.aClass2_Sub6_3.anInt1100 - super.anInt6770);
					if (local136 != 0) {
						local410.method3834(-local136 & 0x3FFF);
					}
					super.aClass31Array3[2] = local410;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIB)V", line = 569)
	public void method4069(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt4589 != -1 && Static37.aClass85_1.method2373(super.anInt4589).anInt4024 == 1) {
			super.anInt4589 = -1;
		}
		if (super.anInt4586 != -1) {
			@Pc(37) Class91 local37 = Static299.aClass211_2.method5408(super.anInt4586);
			if (local37.aBoolean177 && local37.anInt2445 != -1 && Static37.aClass85_1.method2373(local37.anInt2445).anInt4024 == 1) {
				super.anInt4586 = -1;
			}
		}
		this.anInt4168 = -1;
		if (arg1 < 0 || Class241.anInt7020 <= arg1 || arg0 < 0 || OutputStream_Sub1.anInt4442 <= arg0) {
			this.method4065(arg1, arg0);
		} else if (super.anIntArray316[0] >= 0 && super.anIntArray316[0] < Class241.anInt7020 && super.anIntArray317[0] >= 0 && OutputStream_Sub1.anInt4442 > super.anIntArray317[0]) {
			if (arg2 == 2) {
				Static351.method6285(this, arg1, arg0);
			}
			this.method4072(arg0, arg2, arg1);
		} else {
			this.method4065(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)I", line = 610)
	@Override
	public int method6081() {
		return super.anInt4621;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 625)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		if (this.aClass117_1 == null || !this.method4068(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class14 local19 = arg0.method2810();
		@Pc(24) int local24 = super.aClass248_7.method6442();
		local19.method3926(local24);
		local19.method3937(super.anInt6768, super.anInt6769, super.anInt6770);
		@Pc(45) float local45 = arg0.method2804();
		@Pc(48) float local48 = arg0.method2862();
		if (Static203.aClass177_Sub1_2.aBoolean358) {
			@Pc(55) Class222 local55 = this.method4333();
			if (local55.aBoolean424 && (this.aClass117_1.anInt3181 == -1 || Static6.aClass219_1.method5571(this.aClass117_1.anInt3181).aBoolean142)) {
				@Pc(87) Class157 local87 = super.anInt4589 != -1 && super.anInt4582 == 0 ? Static37.aClass85_1.method2373(super.anInt4589) : null;
				@Pc(108) Class157 local108 = super.anInt4577 == -1 || this.aBoolean275 || super.aBoolean317 && local87 != null ? null : Static37.aClass85_1.method2373(super.anInt4577);
				@Pc(142) Class31 local142 = Static166.method2342(local108 == null ? super.anInt4599 : super.anInt4617, 240, 160, super.anInt4588, local108 == null ? local87 : local108, 1, 0, super.aClass31Array3[0], local24, arg0, 0, super.aBoolean318, super.anInt4600, super.anInt4581);
				if (local142 != null) {
					arg0.method2825(local45, local48 - 128.0F);
					arg0.method2854(false);
					local142.method3836(local19, null, 0);
					arg0.method2854(true);
				}
			}
		}
		if (Static17.aClass11_Sub5_Sub2_Sub1_3 == this) {
			arg0.method2825(local45, local48 - 144.0F);
			local19.method3923(super.anInt6768, super.anInt6769, super.anInt6770);
			for (@Pc(183) int local183 = Class41.aClass84Array1.length - 1; local183 >= 0; local183--) {
				@Pc(189) Class84 local189 = Class41.aClass84Array1[local183];
				if (local189 != null && local189.anInt2358 != -1) {
					@Pc(239) int local239;
					@Pc(228) int local228;
					if (local189.anInt2352 == 1 && local189.anInt2351 >= 0 && local189.anInt2351 < Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1.length) {
						@Pc(215) Class11_Sub5_Sub2_Sub2 local215 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local189.anInt2351];
						if (local215 != null) {
							local228 = local215.anInt6768 / 32 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 / 32;
							local239 = local215.anInt6770 / 32 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 / 32;
							this.method4074(local189.anInt2358, 360000, local228, local239, local19, super.aClass31Array3[0], arg0);
						}
					}
					if (local189.anInt2352 == 2) {
						@Pc(273) int local273 = (local189.anInt2349 - Static154.anInt3136) * 4 + 2 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 / 32;
						local228 = (local189.anInt2361 - Static139.anInt2716) * 4 + 2 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 / 32;
						local239 = local189.anInt2346 * 4;
						local239 *= local239;
						this.method4074(local189.anInt2358, local239, local273, local228, local19, super.aClass31Array3[0], arg0);
					}
					if (local189.anInt2352 == 10 && local189.anInt2351 >= 0 && Class9.aClass11_Sub5_Sub2_Sub1Array1.length > local189.anInt2351) {
						@Pc(332) Class11_Sub5_Sub2_Sub1 local332 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local189.anInt2351];
						if (local332 != null) {
							local228 = local332.anInt6768 / 32 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 / 32;
							local239 = local332.anInt6770 / 32 - Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 / 32;
							this.method4074(local189.anInt2358, 360000, local228, local239, local19, super.aClass31Array3[0], arg0);
						}
					}
				}
			}
			local19.method3926(local24);
			local19.method3937(super.anInt6768, super.anInt6769, super.anInt6770);
		}
		arg0.method2825(local45, local48);
		@Pc(397) Class12_Sub4 local397 = Static138.method2708(super.aClass31Array3.length);
		if (super.aClass12_Sub5_3 == null) {
			arg0.method2883(super.aClass31Array3, local19, local397.aClass12_Sub2Array1, Static17.aClass11_Sub5_Sub2_Sub1_3 == this ? 1 : 0);
		} else {
			@Pc(419) Class224 local419 = super.aClass12_Sub5_3.method4359();
			arg0.method2832(super.aClass31Array3, local419, local19, local397.aClass12_Sub2Array1, Static17.aClass11_Sub5_Sub2_Sub1_3 == this ? 1 : 0);
		}
		this.method4334(arg0, super.aClass31Array3, false);
		if (super.aClass31Array3[2] != null) {
			if (local24 != 0) {
				super.aClass31Array3[2].method3834(local24);
			}
			super.aClass31Array3[2].method3814(super.anInt6768 - super.aClass2_Sub6_3.anInt1103, super.anInt6769 + -super.aClass2_Sub6_3.anInt1113, -super.aClass2_Sub6_3.anInt1100 + super.anInt6770);
		}
		super.anInt4595 = Class2_Sub2_Sub10_Sub1.anInt3082;
		return local397;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 905)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.aClass117_1 == null || !this.method4068(arg2, 65536)) {
			return true;
		}
		@Pc(19) Class14 local19 = arg2.method2810();
		@Pc(24) int local24 = super.aClass248_7.method6442();
		local19.method3926(local24);
		local19.method3937(super.anInt6768, super.anInt6769, super.anInt6770);
		for (@Pc(42) int local42 = 0; local42 < super.aClass31Array3.length; local42++) {
			if (super.aClass31Array3[local42] != null && super.aClass31Array3[local42].method3821(arg0, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I", line = 937)
	@Override
	public int method4329() {
		return this.aClass117_1 == null || this.aClass117_1.anInt3181 == -1 ? super.method4329() : Static6.aClass219_1.method5571(this.aClass117_1.anInt3181).anInt2038;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(ZI)Ljava/lang/String;", line = 952)
	public String method4071() {
		return this.aString41;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIBI)V", line = 976)
	public void method4072(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4634 < 9) {
			super.anInt4634++;
		}
		for (@Pc(18) int local18 = super.anInt4634; local18 > 0; local18--) {
			super.anIntArray316[local18] = super.anIntArray316[local18 - 1];
			super.anIntArray317[local18] = super.anIntArray317[local18 - 1];
			super.aByteArray51[local18] = super.aByteArray51[local18 - 1];
		}
		super.anIntArray316[0] = arg2;
		super.anIntArray317[0] = arg0;
		super.aByteArray51[0] = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 1010)
	public String method4073() {
		@Pc(17) String local17 = "";
		if (Static121.aStringArray19 != null) {
			local17 = local17 + Static121.aStringArray19[this.aByte40];
		}
		@Pc(39) int[] local39;
		if (this.aByte39 == 1 && Static301.anIntArray412 != null) {
			local39 = Static301.anIntArray412;
		} else {
			local39 = Static110.anIntArray150;
		}
		if (local39 != null && local39[this.aByte40] != -1) {
			@Pc(59) Class52 local59 = Static131.aClass109_1.method2781(local39[this.aByte40]);
			if (local59.aChar3 == 's') {
				local17 = local17 + local59.method1777(this.aByte38 & 0xFF);
			} else {
				Static241.method6254(new Throwable(), "gdn1");
				local39[this.aByte40] = -1;
			}
		}
		local17 = local17 + this.aString42;
		if (Static310.aStringArray67 != null) {
			local17 = local17 + Static310.aStringArray67[this.aByte40];
		}
		return local17;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIIIILclient!on;Lclient!gn;Lclient!wm;)V", line = 1082)
	private void method4074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class14 arg4, @OriginalArg(6) Class31 arg5, @OriginalArg(7) Class19 arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg2 * arg2;
		if (local11 < 16 || local11 > arg1) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg2, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class31 local54 = Static100.method2239(arg6, super.anInt6769, super.anInt6770, super.anInt4588, arg0, local35, super.anInt4581, super.anInt4600, arg5, super.anInt6768);
		if (local54 != null) {
			arg6.method2854(false);
			local54.method3836(arg4, null, 0);
			arg6.method2854(true);
		}
	}
}
