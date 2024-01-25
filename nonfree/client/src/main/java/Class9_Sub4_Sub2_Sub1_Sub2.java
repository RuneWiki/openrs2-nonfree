import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class9_Sub4_Sub2_Sub1_Sub2 extends Class9_Sub4_Sub2_Sub1 {

	@OriginalMember(owner = "client!gv", name = "kd", descriptor = "Lclient!tfa;")
	public Class320 aClass320_1;

	@OriginalMember(owner = "client!gv", name = "nd", descriptor = "I")
	public int anInt4370;

	@OriginalMember(owner = "client!gv", name = "yd", descriptor = "I")
	private int anInt4379;

	@OriginalMember(owner = "client!gv", name = "Kd", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!gv", name = "Ld", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!gv", name = "Vd", descriptor = "I")
	public int anInt4394;

	@OriginalMember(owner = "client!gv", name = "bd", descriptor = "I")
	public int anInt4362 = -1;

	@OriginalMember(owner = "client!gv", name = "fd", descriptor = "I")
	public int anInt4365 = -1;

	@OriginalMember(owner = "client!gv", name = "jd", descriptor = "I")
	public int anInt4368 = -1;

	@OriginalMember(owner = "client!gv", name = "cd", descriptor = "B")
	private byte aByte45 = 0;

	@OriginalMember(owner = "client!gv", name = "ld", descriptor = "I")
	public int anInt4369 = 0;

	@OriginalMember(owner = "client!gv", name = "rd", descriptor = "I")
	public int anInt4373 = -1;

	@OriginalMember(owner = "client!gv", name = "Cd", descriptor = "Z")
	public boolean aBoolean356 = false;

	@OriginalMember(owner = "client!gv", name = "Gd", descriptor = "I")
	public int anInt4383 = -1;

	@OriginalMember(owner = "client!gv", name = "pd", descriptor = "Z")
	public boolean aBoolean354 = false;

	@OriginalMember(owner = "client!gv", name = "zd", descriptor = "I")
	public int anInt4380 = -1;

	@OriginalMember(owner = "client!gv", name = "Nd", descriptor = "I")
	public int anInt4387 = 0;

	@OriginalMember(owner = "client!gv", name = "Md", descriptor = "B")
	private byte aByte47 = 0;

	@OriginalMember(owner = "client!gv", name = "dd", descriptor = "I")
	public int anInt4363 = 255;

	@OriginalMember(owner = "client!gv", name = "sd", descriptor = "I")
	public int anInt4374 = 0;

	@OriginalMember(owner = "client!gv", name = "Fd", descriptor = "Z")
	public boolean aBoolean357 = false;

	@OriginalMember(owner = "client!gv", name = "ud", descriptor = "Z")
	public boolean aBoolean355 = false;

	@OriginalMember(owner = "client!gv", name = "wd", descriptor = "I")
	public int anInt4377 = 0;

	@OriginalMember(owner = "client!gv", name = "od", descriptor = "I")
	public int anInt4371 = -1;

	@OriginalMember(owner = "client!gv", name = "vd", descriptor = "I")
	public int anInt4376 = -1;

	@OriginalMember(owner = "client!gv", name = "Ad", descriptor = "B")
	private byte aByte46 = 0;

	@OriginalMember(owner = "client!gv", name = "md", descriptor = "Z")
	public boolean aBoolean353 = false;

	@OriginalMember(owner = "client!gv", name = "Zd", descriptor = "I")
	public int anInt4398 = 0;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(B)Z")
	public boolean method3634() {
		return this.aClass320_1 != null;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BIII)V")
	public void method3635(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4359 < 9) {
			super.anInt4359++;
		}
		for (@Pc(18) int local18 = super.anInt4359; local18 > 0; local18--) {
			super.anIntArray197[local18] = super.anIntArray197[local18 - 1];
			super.anIntArray198[local18] = super.anIntArray198[local18 - 1];
			super.aByteArray31[local18] = super.aByteArray31[local18 - 1];
		}
		super.anIntArray197[0] = arg2;
		super.anIntArray198[0] = arg1;
		super.aByteArray31[0] = arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIBI)V")
	public void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt4341 != -1 && Static528.aClass198_2.method5706(super.anInt4341).anInt3847 == 1) {
			super.anInt4341 = -1;
			super.anIntArray189 = null;
		}
		@Pc(34) Class124 local34;
		if (super.anInt4306 != -1) {
			local34 = Static360.aClass312_2.method7492(super.anInt4306);
			if (local34.aBoolean336 && local34.anInt4155 != -1 && Static528.aClass198_2.method5706(local34.anInt4155).anInt3847 == 1) {
				super.anInt4306 = -1;
			}
		}
		if (super.anInt4294 != -1) {
			local34 = Static360.aClass312_2.method7492(super.anInt4294);
			if (local34.aBoolean336 && local34.anInt4155 != -1 && Static528.aClass198_2.method5706(local34.anInt4155).anInt3847 == 1) {
				super.anInt4294 = -1;
			}
		}
		this.anInt4362 = -1;
		if (arg0 < 0 || Static306.anInt6176 <= arg0 || arg1 < 0 || arg1 >= Static108.anInt2930) {
			this.method3639(arg1, arg0);
		} else if (super.anIntArray197[0] >= 0 && super.anIntArray197[0] < Static306.anInt6176 && super.anIntArray198[0] >= 0 && super.anIntArray198[0] < Static108.anInt2930) {
			if (arg2 == 2) {
				Static617.method8472(this, arg1, arg0);
			}
			this.method3635(arg2, arg1, arg0);
		} else {
			this.method3639(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLclient!ha;I)Z")
	private boolean method3637(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class303 local11 = this.method3625();
		@Pc(26) Class113 local26 = super.anInt4341 != -1 && super.anInt4326 == 0 ? Static528.aClass198_2.method5706(super.anInt4341) : null;
		@Pc(54) Class113 local54 = super.anInt4312 == -1 || this.aBoolean353 || super.aBoolean349 && local26 != null ? null : Static528.aClass198_2.method5706(super.anInt4312);
		@Pc(57) int local57 = local11.anInt8944;
		@Pc(60) int local60 = local11.anInt8961;
		if (local57 != 0 || local60 != 0 || local11.anInt8974 != 0 || local11.anInt8945 != 0) {
			arg1 |= 0x7;
		}
		@Pc(91) int local91 = super.aClass332_7.method7925();
		@Pc(109) boolean local109 = super.aByte44 != 0 && Static384.anInt7234 >= super.anInt4331 && Static384.anInt7234 < super.anInt4275;
		if (local109) {
			arg1 |= 0x80000;
		}
		@Pc(153) Class92 local153 = super.aClass92Array3[0] = this.aClass320_1.method7664(Static629.aClass271_1, local26, local54, Static528.aClass198_2, super.anInt4319, Static287.aClass99_1, super.anIntArray188, Static356.aClass221_1, super.anInt4336, super.aClass241Array3, Static8.aClass309_1, Static140.aClass157_1, arg1, super.anInt4348, super.lb, super.anInt4290, super.anInt4276, local91, arg0);
		@Pc(156) int local156 = Static105.method2434();
		if (Static510.anInt8806 < 96 && local156 > 50) {
			Static374.method7977();
		}
		if (Static86.aClass212_19 != Static630.aClass212_18 && local156 < 50) {
			@Pc(189) int local189 = 50 - local156;
			while (local189 > Static599.anInt10171) {
				Static144.aByteArrayArray36[Static599.anInt10171] = new byte[102400];
				Static599.anInt10171++;
			}
			while (Static599.anInt10171 > local189) {
				Static599.anInt10171--;
				Static144.aByteArrayArray36[Static599.anInt10171] = null;
			}
		} else if (Static630.aClass212_18 != Static86.aClass212_19) {
			Static599.anInt10171 = 0;
			Static144.aByteArrayArray36 = new byte[50][];
		}
		if (local153 == null) {
			return false;
		}
		super.anInt4278 = local153.fa();
		super.anInt4281 = local153.ma();
		this.method3632(local153);
		if (local57 == 0 && local60 == 0) {
			this.method3626(0, this.method3620() << 9, this.method3620() << 9, local91, 0);
		} else {
			this.method3626(local11.anInt8941, local57, local60, local91, local11.anInt8972);
			if (super.anInt4313 != 0) {
				local153.FA(super.anInt4313);
			}
			if (super.anInt4302 != 0) {
				local153.VA(super.anInt4302);
			}
			if (super.anInt4344 != 0) {
				local153.H(0, super.anInt4344, 0);
			}
		}
		if (local109) {
			local153.method7065(super.aByte43, super.aByte42, super.aByte41, super.aByte44 & 0xFF);
		}
		@Pc(351) boolean local351;
		@Pc(353) int local353;
		@Pc(403) Class92 local403;
		@Pc(422) int local422;
		@Pc(424) int local424;
		@Pc(426) int local426;
		@Pc(513) int local513;
		@Pc(542) int local542;
		@Pc(551) int local551;
		@Pc(555) int local555;
		@Pc(565) int local565;
		@Pc(336) Class124 local336;
		if (this.aBoolean353 || super.anInt4306 == -1 || super.anInt4301 == -1) {
			super.aClass92Array3[1] = null;
		} else {
			local336 = Static360.aClass312_2.method7492(super.anInt4306);
			local351 = local336.aByte36 == 3 && (local57 != 0 || local60 != 0);
			local353 = local7;
			if (local351) {
				local353 = local7 | 0x7;
			} else {
				if (super.anInt4314 != 0) {
					local353 = local7 | 0x5;
				}
				if (super.anInt4310 != 0) {
					local353 |= 0x2;
				}
				if (super.anInt4337 >= 0) {
					local353 |= 0x7;
				}
			}
			local403 = super.aClass92Array3[1] = local336.method3529(super.anInt4301, Static528.aClass198_2, local353, super.anInt4323, super.anInt4296, arg0);
			if (local403 != null) {
				if (super.anInt4337 >= 0 && local11.anIntArrayArray47 != null && local11.anIntArrayArray47[super.anInt4337] != null) {
					local422 = 0;
					local424 = 0;
					local426 = 0;
					if (local11.anIntArrayArray47 != null && local11.anIntArrayArray47[super.anInt4337] != null) {
						local426 = local11.anIntArrayArray47[super.anInt4337][2];
						local422 = local11.anIntArrayArray47[super.anInt4337][0];
						local424 = local11.anIntArrayArray47[super.anInt4337][1];
					}
					if (local11.anIntArrayArray46 != null && local11.anIntArrayArray46[super.anInt4337] != null) {
						local426 += local11.anIntArrayArray46[super.anInt4337][2];
						local422 += local11.anIntArrayArray46[super.anInt4337][0];
						local424 += local11.anIntArrayArray46[super.anInt4337][1];
					}
					if (local426 != 0 || local422 != 0) {
						local513 = local91;
						if (super.anIntArray188 != null && super.anIntArray188[super.anInt4337] != -1) {
							local513 = super.anIntArray188[super.anInt4337];
						}
						local542 = local513 + super.anInt4314 * 2048 - local91 & 0x3FFF;
						if (local542 != 0) {
							local403.a(local542);
						}
						local551 = Class78_Sub2_Sub2.anIntArray270[local542];
						local555 = Class78_Sub2_Sub2.anIntArray271[local542];
						local565 = local555 * local422 + local551 * local426 >> 14;
						local426 = local426 * local555 - local422 * local551 >> 14;
						local422 = local565;
					}
					local403.H(local422, local424, local426);
				} else if (super.anInt4314 != 0) {
					local403.a(super.anInt4314 * 2048);
				}
				if (super.anInt4310 != 0) {
					local403.H(0, -super.anInt4310 << 2, 0);
				}
				if (local351) {
					if (super.anInt4313 != 0) {
						local403.FA(super.anInt4313);
					}
					if (super.anInt4302 != 0) {
						local403.VA(super.anInt4302);
					}
					if (super.anInt4344 != 0) {
						local403.H(0, super.anInt4344, 0);
					}
				}
			}
		}
		if (this.aBoolean353 || super.anInt4294 == -1 || super.anInt4356 == -1) {
			super.aClass92Array3[2] = null;
		} else {
			local336 = Static360.aClass312_2.method7492(super.anInt4294);
			local351 = local336.aByte36 == 3 && (local57 != 0 || local60 != 0);
			local353 = local7;
			if (local351) {
				local353 = local7 | 0x7;
			} else {
				if (super.anInt4288 != 0) {
					local353 = local7 | 0x5;
				}
				if (super.anInt4292 != 0) {
					local353 |= 0x2;
				}
				if (super.anInt4279 >= 0) {
					local353 |= 0x7;
				}
			}
			local403 = super.aClass92Array3[2] = local336.method3522(arg0, super.anInt4350, local353, Static528.aClass198_2, super.anInt4353, super.anInt4356);
			if (local403 != null) {
				if (super.anInt4279 >= 0 && local11.anIntArrayArray47 != null && local11.anIntArrayArray47[super.anInt4279] != null) {
					local422 = 0;
					local424 = 0;
					local426 = 0;
					if (local11.anIntArrayArray47 != null && local11.anIntArrayArray47[super.anInt4279] != null) {
						local426 = local11.anIntArrayArray47[super.anInt4279][2];
						local424 = local11.anIntArrayArray47[super.anInt4279][1];
						local422 = local11.anIntArrayArray47[super.anInt4279][0];
					}
					if (local11.anIntArrayArray46 != null && local11.anIntArrayArray46[super.anInt4279] != null) {
						local426 += local11.anIntArrayArray46[super.anInt4279][2];
						local424 += local11.anIntArrayArray46[super.anInt4279][1];
						local422 += local11.anIntArrayArray46[super.anInt4279][0];
					}
					if (local426 != 0 || local422 != 0) {
						local513 = local91;
						if (super.anIntArray188 != null && super.anIntArray188[super.anInt4279] != -1) {
							local513 = super.anIntArray188[super.anInt4279];
						}
						local542 = super.anInt4288 * 2048 + local513 - local91 & 0x3FFF;
						if (local542 != 0) {
							local403.a(local542);
						}
						local551 = Class78_Sub2_Sub2.anIntArray270[local542];
						local555 = Class78_Sub2_Sub2.anIntArray271[local542];
						local565 = local422 * local555 + local551 * local426 >> 14;
						local426 = local555 * local426 - local551 * local422 >> 14;
						local422 = local565;
					}
					local403.H(local422, local424, local426);
				} else if (super.anInt4288 != 0) {
					local403.a(super.anInt4288 * 2048);
				}
				if (super.anInt4292 != 0) {
					local403.H(0, -super.anInt4292 << 2, 0);
				}
				if (local351) {
					if (super.anInt4313 != 0) {
						local403.FA(super.anInt4313);
					}
					if (super.anInt4302 != 0) {
						local403.VA(super.anInt4302);
					}
					if (super.anInt4344 != 0) {
						local403.H(0, super.anInt4344, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8417() {
		return false;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3638() {
		return this.aString46;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(III)V")
	public void method3639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray197[0] = arg1;
		super.anInt4358 = 0;
		super.anInt4361 = 0;
		super.anInt4359 = 0;
		super.anIntArray198[0] = arg0;
		@Pc(32) int local32 = this.method3620();
		super.anInt10360 = super.anIntArray197[0] * 512 + local32 * 256;
		super.anInt10357 = local32 * 256 + super.anIntArray198[0] * 512;
		if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == this) {
			Static638.method8737();
		}
		if (super.aClass9_Sub5_3 != null) {
			super.aClass9_Sub5_3.method5233();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!ha;IIIZLclient!hba;IILclient!ka;)V")
	private void method3640(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class115 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class92 arg7) {
		@Pc(11) int local11 = arg1 * arg1 + arg3 * arg3;
		if (local11 < 262144 || arg5 < local11) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg3, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class92 local54 = Static251.method4466(super.anInt4302, local42, super.anInt4313, arg0, arg6, super.anInt4344);
		if (local54 != null) {
			arg0.C(false);
			local54.method7057(arg4, (Class9_Sub6) null, arg2, 0);
			arg0.C(true);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method3641(@OriginalArg(0) Class6_Sub8 arg0) {
		arg0.anInt10061 = 0;
		@Pc(12) int local12 = arg0.method8246();
		this.aByte46 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean355;
		this.aBoolean355 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method3620();
		this.method3631((local12 >> 3 & 0x7) + 1);
		this.aByte45 = (byte) (local12 >> 6 & 0x3);
		super.anInt10360 += this.method3620() - local45 << 8;
		super.anInt10357 += this.method3620() - local45 << 8;
		this.aByte47 = arg0.method8208();
		this.anInt4365 = arg0.method8208();
		this.anInt4380 = arg0.method8208();
		this.aBoolean354 = arg0.method8208() == 1;
		if (Static630.aClass212_18 == Static86.aClass212_19 && Static497.anInt8643 >= 2) {
			this.aBoolean354 = false;
		}
		@Pc(126) int local126 = -1;
		this.anInt4377 = 0;
		@Pc(132) int[] local132 = new int[12];
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(197) int local197;
		for (@Pc(134) int local134 = 0; local134 < 12; local134++) {
			@Pc(140) int local140 = arg0.method8246();
			if (local140 == 0) {
				local132[local134] = 0;
			} else {
				local152 = arg0.method8246();
				local158 = (local140 << 8) + local152;
				if (local134 == 0 && local158 == 65535) {
					local126 = arg0.method8220();
					this.anInt4377 = arg0.method8246();
					break;
				}
				if (local158 >= 32768) {
					local158 = Static448.anIntArray422[local158 - 32768];
					local132[local134] = local158 | 0x40000000;
					local197 = Static356.aClass221_1.method5923(local158).anInt9051;
					if (local197 != 0) {
						this.anInt4377 = local197;
					}
				} else {
					local132[local134] = Integer.MIN_VALUE | local158 - 256;
				}
			}
		}
		@Pc(219) int[] local219 = new int[5];
		for (local152 = 0; local152 < 5; local152++) {
			local158 = arg0.method8246();
			if (Static119.aShortArrayArrayArray3.length < 1 || local158 < 0 || Static119.aShortArrayArrayArray3[0][local152].length <= local158) {
				local158 = 0;
			}
			local219[local152] = local158;
		}
		this.anInt4379 = arg0.method8220();
		this.aString45 = arg0.method8221();
		this.aString46 = this.aString45;
		if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == this) {
			Static534.aString98 = this.aString45;
		}
		this.anInt4369 = arg0.method8246();
		if (local41) {
			this.anInt4387 = arg0.method8220();
			this.anInt4383 = -1;
			this.anInt4398 = this.anInt4369;
			if (this.anInt4387 == 65535) {
				this.anInt4387 = -1;
			}
		} else {
			this.anInt4387 = 0;
			this.anInt4398 = arg0.method8246();
			this.anInt4383 = arg0.method8246();
			if (this.anInt4383 == 255) {
				this.anInt4383 = -1;
			}
		}
		local158 = this.anInt4374;
		this.anInt4374 = arg0.method8246();
		@Pc(353) int local353;
		if (this.anInt4374 == 0) {
			Static383.method6041(this);
		} else {
			local197 = this.anInt4376;
			@Pc(350) int local350 = this.anInt4373;
			local353 = this.anInt4371;
			@Pc(356) int local356 = this.anInt4368;
			@Pc(359) int local359 = this.anInt4363;
			this.anInt4376 = arg0.method8220();
			this.anInt4373 = arg0.method8220();
			this.anInt4371 = arg0.method8220();
			this.anInt4368 = arg0.method8220();
			this.anInt4363 = arg0.method8246();
			if (local21 != this.aBoolean355 || local158 != this.anInt4374 || local197 != this.anInt4376 || local350 != this.anInt4373 || local353 != this.anInt4371 || local356 != this.anInt4368 || this.anInt4363 != local359) {
				Static556.method7799(this);
			}
		}
		if (this.aClass320_1 == null) {
			this.aClass320_1 = new Class320();
		}
		local197 = this.aClass320_1.anInt9402;
		@Pc(439) int[] local439 = this.aClass320_1.anIntArray497;
		this.aClass320_1.method7663(local132, this.aByte46 == 1, local219, this.method3616(), local126);
		if (local126 != local197) {
			super.anInt10360 = (super.anIntArray197[0] << 9) + (this.method3620() << 8);
			super.anInt10357 = (super.anIntArray198[0] << 9) + (this.method3620() << 8);
		}
		if (super.anInt4299 == Static238.anInt5268 && local439 != null) {
			for (local353 = 0; local353 < local219.length; local353++) {
				if (local439[local353] != local219[local353]) {
					Static356.aClass221_1.method5926();
					break;
				}
			}
		}
		if (super.aClass9_Sub5_3 != null) {
			super.aClass9_Sub5_3.method5233();
		}
		if (super.anInt4312 == -1 || !super.aBoolean349) {
			return;
		}
		@Pc(555) Class303 local555 = this.method3625();
		if (!local555.method7367(super.anInt4312)) {
			super.aBoolean349 = false;
			super.anInt4312 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!gg;BZILclient!ha;II)V")
	@Override
	public void method8416(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass320_1 == null || !this.method3637(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class115 local19 = arg1.method6156();
		@Pc(24) int local24 = super.aClass332_7.method7925();
		local19.method6291(local24);
		local19.method6296(super.anInt10360, super.anInt10365, super.anInt10357);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass92Array3.length > local39; local39++) {
			if (super.aClass92Array3[local39] != null && (Static423.aBoolean622 ? super.aClass92Array3[local39].method7061(arg0, arg2, local19, true, 0, Static32.anInt849) : super.aClass92Array3[local39].method7067(arg0, arg2, local19, true, 0))) {
				local37 = true;
				break;
			}
		}
		super.aClass92Array3[0] = super.aClass92Array3[1] = super.aClass92Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3642() {
		@Pc(7) String local7 = "";
		if (Static214.aStringArray13 != null) {
			local7 = local7 + Static214.aStringArray13[this.aByte45];
		}
		@Pc(35) int[] local35;
		if (this.aByte46 == 1 && Static72.anIntArray80 != null) {
			local35 = Static72.anIntArray80;
		} else {
			local35 = Static477.anIntArray433;
		}
		if (local35 != null && local35[this.aByte45] != -1) {
			@Pc(56) Class313 local56 = Static251.aClass43_1.method1765(local35[this.aByte45]);
			if (local56.aChar5 == 's') {
				local7 = local7 + local56.method7525(this.aByte47 & 0xFF);
			} else {
				Static358.method5809(new Throwable(), "gdn1");
				local35[this.aByte45] = -1;
			}
		}
		local7 = local7 + this.aString45;
		if (Static155.aStringArray10 != null) {
			local7 = local7 + Static155.aStringArray10[this.aByte45];
		}
		return local7;
	}

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "(I)I")
	@Override
	public int method3621() {
		return -1;
	}

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
		if (this.aClass320_1 == null || !super.aBoolean351 && !this.method3637(arg0, 0)) {
			return;
		}
		@Pc(20) Class115 local20 = arg0.method6156();
		local20.method6291(super.aClass332_7.method7925());
		local20.method6296(super.anInt10360, super.anInt10365 - 5, super.anInt10357);
		this.method3622(arg0, super.aBoolean351, local20, super.aClass92Array3);
		super.aClass92Array3[0] = super.aClass92Array3[1] = super.aClass92Array3[2] = null;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)I")
	@Override
	public int method3620() {
		return this.aClass320_1 == null || this.aClass320_1.anInt9402 == -1 ? super.method3620() : Static8.aClass309_1.method7453(this.aClass320_1.anInt9402).anInt5826;
	}

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "(B)V")
	@Override
	public void method8427() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		if (this.aClass320_1 == null || !this.method3637(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class115 local19 = arg0.method6156();
		@Pc(24) int local24 = super.aClass332_7.method7925();
		local19.method6291(local24);
		@Pc(42) Class186 local42 = Static26.aClass186ArrayArrayArray1[super.aByte135][super.anInt10360 >> Static606.anInt10280][super.anInt10357 >> Static606.anInt10280];
		if (local42 == null || local42.aClass9_Sub4_Sub3_1 == null) {
			super.anInt4277 = (int) ((float) super.anInt4277 - (float) super.anInt4277 / 10.0F);
		} else {
			@Pc(68) int local68 = super.anInt4277 - local42.aClass9_Sub4_Sub3_1.aShort96;
			super.anInt4277 = (int) ((float) super.anInt4277 - (float) local68 / 10.0F);
		}
		local19.method6296(super.anInt10360, -super.anInt4277 + super.anInt10365 - 20, super.anInt10357);
		@Pc(95) Class9_Sub2 local95 = null;
		super.aBoolean352 = false;
		if (Static87.aClass6_Sub33_6.aClass14_Sub26_1.method8192() == 1) {
			@Pc(115) Class303 local115 = this.method3625();
			if (local115.aBoolean726 && (this.aClass320_1.anInt9402 == -1 || Static8.aClass309_1.method7453(this.aClass320_1.anInt9402).aBoolean455)) {
				@Pc(147) Class113 local147 = super.anInt4341 != -1 && super.anInt4326 == 0 ? Static528.aClass198_2.method5706(super.anInt4341) : null;
				@Pc(168) Class113 local168 = super.anInt4312 == -1 || this.aBoolean353 || super.aBoolean349 && local147 != null ? null : Static528.aClass198_2.method5706(super.anInt4312);
				@Pc(200) Class92 local200 = Static185.method3445(local168 == null ? local147 : local168, super.anInt4302, 1, 240, super.aClass92Array3[0], super.anInt4313, local24, 160, 0, local168 == null ? super.anInt4319 : super.anInt4276, arg0, 0, super.anInt4344);
				if (local200 != null) {
					local95 = Static167.method3172(super.aClass92Array3.length + 1, true);
					super.aBoolean352 = true;
					arg0.C(false);
					if (Static423.aBoolean622) {
						local200.method7057(local19, local95.aClass9_Sub6Array1[super.aClass92Array3.length], Static32.anInt849, 0);
					} else {
						local200.method7053(local19, local95.aClass9_Sub6Array1[super.aClass92Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(261) int local261;
		if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == this) {
			local19.method6290(super.anInt10360, super.anInt10365, super.anInt10357);
			for (local261 = Static189.aClass50Array1.length - 1; local261 >= 0; local261--) {
				@Pc(267) Class50 local267 = Static189.aClass50Array1[local261];
				if (local267 != null && local267.anInt2405 != -1) {
					@Pc(299) int local299;
					if (local267.anInt2414 == 1) {
						@Pc(287) Class6_Sub42 local287 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local267.anInt2411);
						if (local287 != null) {
							@Pc(292) Class9_Sub4_Sub2_Sub1_Sub1 local292 = local287.aClass9_Sub4_Sub2_Sub1_Sub1_1;
							local299 = local292.anInt10360 - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360;
							@Pc(305) int local305 = local292.anInt10357 - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357;
							if (Static423.aBoolean622) {
								this.method3640(arg0, local305, Static32.anInt849, local299, local19, 92160000, local267.anInt2405, super.aClass92Array3[0]);
							} else {
								this.method3645(local305, local19, local299, super.aClass92Array3[0], 92160000, arg0, local267.anInt2405);
							}
						}
					}
					@Pc(360) int local360;
					if (local267.anInt2414 == 2) {
						@Pc(351) int local351 = local267.anInt2404 + 256 - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360;
						local360 = local267.anInt2415 + 256 - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357;
						local299 = local267.anInt2406 << 9;
						local299 *= local299;
						if (Static423.aBoolean622) {
							this.method3640(arg0, local360, Static32.anInt849, local351, local19, local299, local267.anInt2405, super.aClass92Array3[0]);
						} else {
							this.method3645(local360, local19, local351, super.aClass92Array3[0], local299, arg0, local267.anInt2405);
						}
					}
					if (local267.anInt2414 == 10 && local267.anInt2411 >= 0 && local267.anInt2411 < Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1.length) {
						@Pc(424) Class9_Sub4_Sub2_Sub1_Sub2 local424 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local267.anInt2411];
						if (local424 != null) {
							local360 = local424.anInt10360 - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360;
							local299 = local424.anInt10357 - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357;
							if (Static423.aBoolean622) {
								this.method3640(arg0, local299, Static32.anInt849, local360, local19, 92160000, local267.anInt2405, super.aClass92Array3[0]);
							} else {
								this.method3645(local299, local19, local360, super.aClass92Array3[0], 92160000, arg0, local267.anInt2405);
							}
						}
					}
				}
			}
			local19.method6291(local24);
			local19.method6296(super.anInt10360, super.anInt10365, super.anInt10357);
		}
		local19.method6291(local24);
		local19.method6296(super.anInt10360, -super.anInt4277 + super.anInt10365 - 5, super.anInt10357);
		if (local95 == null) {
			local95 = Static167.method3172(super.aClass92Array3.length, true);
		}
		this.method3622(arg0, false, local19, super.aClass92Array3);
		if (Static423.aBoolean622) {
			for (local261 = 0; local261 < super.aClass92Array3.length; local261++) {
				if (super.aClass92Array3[local261] != null) {
					super.aClass92Array3[local261].method7057(local19, local95.aClass9_Sub6Array1[local261], Static32.anInt849, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == this ? 1 : 0);
				}
			}
		} else {
			for (local261 = 0; super.aClass92Array3.length > local261; local261++) {
				if (super.aClass92Array3[local261] != null) {
					super.aClass92Array3[local261].method7053(local19, local95.aClass9_Sub6Array1[local261], Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass9_Sub5_3 != null) {
			@Pc(605) Class257 local605 = super.aClass9_Sub5_3.method5222();
			if (Static423.aBoolean622) {
				arg0.method6148(local605, Static32.anInt849);
			} else {
				arg0.method6183(local605);
			}
		}
		for (local261 = 0; super.aClass92Array3.length > local261; local261++) {
			if (super.aClass92Array3[local261] != null) {
				super.aBoolean352 |= super.aClass92Array3[local261].F();
			}
		}
		super.anInt4345 = Static322.anInt6388;
		super.aClass92Array3[0] = super.aClass92Array3[1] = super.aClass92Array3[2] = null;
		return local95;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)I")
	@Override
	protected int method3616() {
		return this.anInt4379;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!hba;IZLclient!ka;ILclient!ha;I)V")
	private void method3645(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class92 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg2 * arg2;
		if (local11 < 262144 || local11 > arg4) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg2, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(49) Class92 local49 = Static251.method4466(super.anInt4302, local37, super.anInt4313, arg5, arg6, super.anInt4344);
		if (local49 != null) {
			arg5.C(false);
			local49.method7053(arg1, (Class9_Sub6) null, 0);
			arg5.C(true);
		}
	}
}
