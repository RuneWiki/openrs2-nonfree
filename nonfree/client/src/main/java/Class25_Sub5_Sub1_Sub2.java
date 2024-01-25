import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class25_Sub5_Sub1_Sub2 extends Class25_Sub5_Sub1 {

	@OriginalMember(owner = "client!lr", name = "Lc", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!lr", name = "Mc", descriptor = "I")
	private int anInt4317;

	@OriginalMember(owner = "client!lr", name = "Wc", descriptor = "I")
	public int anInt4325;

	@OriginalMember(owner = "client!lr", name = "rd", descriptor = "I")
	public int anInt4343;

	@OriginalMember(owner = "client!lr", name = "Id", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!lr", name = "Jd", descriptor = "Lclient!oe;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!lr", name = "Qc", descriptor = "I")
	public int anInt4320 = -1;

	@OriginalMember(owner = "client!lr", name = "Sc", descriptor = "I")
	public int anInt4321 = 255;

	@OriginalMember(owner = "client!lr", name = "Rc", descriptor = "B")
	private byte aByte64 = 0;

	@OriginalMember(owner = "client!lr", name = "cd", descriptor = "I")
	public int anInt4330 = -1;

	@OriginalMember(owner = "client!lr", name = "kd", descriptor = "I")
	public int anInt4336 = 0;

	@OriginalMember(owner = "client!lr", name = "bd", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!lr", name = "fd", descriptor = "Z")
	public boolean aBoolean487 = false;

	@OriginalMember(owner = "client!lr", name = "hd", descriptor = "B")
	private byte aByte65 = 0;

	@OriginalMember(owner = "client!lr", name = "dd", descriptor = "I")
	public int anInt4331 = 0;

	@OriginalMember(owner = "client!lr", name = "sd", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!lr", name = "Vc", descriptor = "I")
	public int anInt4324 = 0;

	@OriginalMember(owner = "client!lr", name = "Cd", descriptor = "I")
	public int anInt4351 = -1;

	@OriginalMember(owner = "client!lr", name = "Dd", descriptor = "Z")
	public boolean aBoolean488 = false;

	@OriginalMember(owner = "client!lr", name = "ud", descriptor = "I")
	public int anInt4345 = -1;

	@OriginalMember(owner = "client!lr", name = "vd", descriptor = "I")
	public int anInt4346 = -1;

	@OriginalMember(owner = "client!lr", name = "Gd", descriptor = "I")
	public int anInt4354 = -1;

	@OriginalMember(owner = "client!lr", name = "ld", descriptor = "I")
	public int anInt4337 = 0;

	@OriginalMember(owner = "client!lr", name = "Fd", descriptor = "I")
	public int anInt4353 = -1;

	@OriginalMember(owner = "client!lr", name = "md", descriptor = "I")
	public int anInt4338 = -1;

	@OriginalMember(owner = "client!lr", name = "Kd", descriptor = "I")
	public int anInt4356 = 0;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		if (this.aClass173_1 != null && (super.aBoolean485 || this.method3438(arg0, 0))) {
			this.method3421(super.aBoolean485, arg0, super.aClass57Array3);
			super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)I")
	@Override
	public int method3427() {
		return this.aClass173_1 == null || this.aClass173_1.anInt4998 == -1 ? super.method3427() : Static161.aClass231_2.method5022(this.aClass173_1.anInt4998).anInt1348;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3437() {
		return this.aString51;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I")
	@Override
	public int method4341() {
		return super.anInt4264;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!za;II)Z")
	private boolean method3438(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class236 local11 = this.method3428();
		@Pc(29) Class177 local29 = super.anInt4270 != -1 && super.anInt4235 == 0 ? Static174.aClass254_1.method5670(super.anInt4270) : null;
		@Pc(49) Class177 local49 = super.anInt4287 == -1 || this.aBoolean488 || super.aBoolean483 && local29 != null ? null : Static174.aClass254_1.method5670(super.anInt4287);
		@Pc(52) int local52 = local11.anInt6460;
		@Pc(55) int local55 = local11.anInt6482;
		if (local52 != 0 || local55 != 0 || local11.anInt6476 != 0 || local11.anInt6481 != 0) {
			arg1 |= 0x7;
		}
		@Pc(95) boolean local95 = super.aByte61 != 0 && super.anInt4251 <= Static236.anInt4213 && super.anInt4305 > Static236.anInt4213;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(136) Class57 local136 = super.aClass57Array3[0] = this.aClass173_1.method3916(super.aClass74Array3, Static320.aClass249_2, super.lb, super.anInt4311, local29, arg0, super.anInt4260, Static174.aClass254_1, Static342.aClass155_2, super.anInt4301, super.anInt4271, super.anInt4240, Static291.aClass21_1, Static339.aClass215_2, local49, arg1, Static161.aClass231_2);
		@Pc(139) int local139 = Static392.method5128();
		if (Static270.anInt4858 < 96 && local139 > 50) {
			Static201.method2867();
		}
		@Pc(169) int local169;
		if (Static459.aClass30_13 != Static328.aClass30_10 && local139 < 50) {
			local169 = 50 - local139;
			while (Static102.anInt1846 < local169) {
				Static335.aByteArrayArray23[Static102.anInt1846] = new byte[102400];
				Static102.anInt1846++;
			}
			while (Static102.anInt1846 > local169) {
				Static102.anInt1846--;
				Static335.aByteArrayArray23[Static102.anInt1846] = null;
			}
		} else if (Static459.aClass30_13 != Static328.aClass30_10) {
			Static102.anInt1846 = 0;
			Static335.aByteArrayArray23 = new byte[50][];
		}
		if (local136 == null) {
			return false;
		}
		super.anInt4264 = local136.B();
		this.method3425(local136);
		local169 = super.aClass265_7.method5841();
		if (local52 == 0 && local55 == 0) {
			this.method3419(0, this.method3427() << 7, this.method3427() << 7, 0, local169);
		} else {
			this.method3419(local11.anInt6471, local52, local55, local11.anInt6469, local169);
			if (super.anInt4242 != 0) {
				local136.W(super.anInt4242);
			}
			if (super.anInt4247 != 0) {
				local136.K(super.anInt4247);
			}
			if (super.anInt4255 != 0) {
				local136.a(0, super.anInt4255, 0);
			}
		}
		if (local95) {
			local136.method5950(super.aByte63, super.aByte62, super.aByte60, super.aByte61 & 0xFF);
		}
		@Pc(325) Class130 local325;
		@Pc(340) boolean local340;
		@Pc(342) int local342;
		@Pc(388) Class57 local388;
		if (this.aBoolean488 || super.anInt4283 == -1 || super.anInt4252 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local325 = Static88.aClass69_1.method1553(super.anInt4283);
			local340 = local325.aByte50 == 3 && (local52 != 0 || local55 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt4265 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt4276 != 0) {
					local342 |= 0x2;
				}
			}
			local388 = super.aClass57Array3[1] = local325.method2914(Static174.aClass254_1, local342, super.anInt4257, super.anInt4300, arg0, super.anInt4252);
			if (local388 != null) {
				if (super.anInt4276 != 0) {
					local388.a(0, -super.anInt4276 << 0, 0);
				}
				if (super.anInt4265 != 0) {
					local388.ma(super.anInt4265 * 2048);
				}
				if (local340) {
					if (super.anInt4242 != 0) {
						local388.W(super.anInt4242);
					}
					if (super.anInt4247 != 0) {
						local388.K(super.anInt4247);
					}
					if (super.anInt4255 != 0) {
						local388.a(0, super.anInt4255, 0);
					}
				}
			}
		}
		if (this.aBoolean488 || super.anInt4267 == -1 || super.anInt4258 == -1) {
			super.aClass57Array3[3] = null;
		} else {
			local325 = Static88.aClass69_1.method1553(super.anInt4267);
			local340 = local325.aByte50 == 3 && (local52 != 0 || local55 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt4302 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt4243 != 0) {
					local342 |= 0x2;
				}
			}
			local388 = super.aClass57Array3[3] = local325.method2909(super.anInt4306, local342, Static174.aClass254_1, super.anInt4290, super.anInt4258, arg0);
			if (local388 != null) {
				if (super.anInt4243 != 0) {
					local388.a(0, -super.anInt4243 << 0, 0);
				}
				if (super.anInt4302 != 0) {
					local388.ma(super.anInt4302 * 2048);
				}
				if (local340) {
					if (super.anInt4242 != 0) {
						local388.W(super.anInt4242);
					}
					if (super.anInt4247 != 0) {
						local388.K(super.anInt4247);
					}
					if (super.anInt4255 != 0) {
						local388.a(0, super.anInt4255, 0);
					}
				}
			}
		}
		super.aClass57Array3[2] = null;
		if (!this.aBoolean488 && super.aClass1_Sub17_3 != null) {
			if (Static236.anInt4213 >= super.aClass1_Sub17_3.anInt1711) {
				super.aClass1_Sub17_3 = null;
			} else if (Static236.anInt4213 >= super.aClass1_Sub17_3.anInt1716) {
				@Pc(623) Class57 local623 = super.aClass1_Sub17_3.method1490(arg0, local7 | 0x7);
				if (local623 != null) {
					local623.a(super.aClass1_Sub17_3.anInt1715 - super.anInt5518, super.aClass1_Sub17_3.anInt1710 - super.anInt5517, super.aClass1_Sub17_3.anInt1722 - super.anInt5514);
					if (local169 != 0) {
						local623.ma(-local169 & 0x3FFF);
					}
					super.aClass57Array3[2] = local623;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIBI)V")
	public void method3439(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4314 < 9) {
			super.anInt4314++;
		}
		for (@Pc(25) int local25 = super.anInt4314; local25 > 0; local25--) {
			super.anIntArray283[local25] = super.anIntArray283[local25 - 1];
			super.anIntArray284[local25] = super.anIntArray284[local25 - 1];
			super.aByteArray51[local25] = super.aByteArray51[local25 - 1];
		}
		super.anIntArray283[0] = arg0;
		super.aByteArray51[0] = arg1;
		super.anIntArray284[0] = arg2;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!za;ILclient!c;IIILclient!e;)V")
	private void method3440(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class57 arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg2 * arg2;
		if (local11 < 16384 || local11 > arg4) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg2, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(53) Class57 local53 = Static284.method3909(arg1, arg5, super.anInt4255, super.anInt4247, super.anInt4242, local41);
		if (local53 != null) {
			arg1.method5745(false);
			local53.method5953(arg3, null, 0);
			arg1.method5745(true);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
	public void method3441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt4315 = 0;
		super.anIntArray283[0] = arg0;
		super.anInt4314 = 0;
		super.anInt4316 = 0;
		super.anIntArray284[0] = arg1;
		@Pc(26) int local26 = this.method3427();
		super.anInt5518 = super.anIntArray283[0] * 128 + local26 * 64;
		super.anInt5514 = local26 * 64 + super.anIntArray284[0] * 128;
		if (Static447.aClass25_Sub5_Sub1_Sub2_4 == this) {
			Static129.method2031();
		}
		if (super.aClass4_Sub2_5 != null) {
			super.aClass4_Sub2_5.method1246();
		}
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "(B)Z")
	public boolean method3442() {
		return this.aClass173_1 != null;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)I")
	@Override
	public int method3423() {
		return -1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIB)V")
	public void method3443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt4270 != -1 && Static174.aClass254_1.method5670(super.anInt4270).anInt5036 == 1) {
			super.anInt4270 = -1;
		}
		@Pc(29) Class130 local29;
		if (super.anInt4283 != -1) {
			local29 = Static88.aClass69_1.method1553(super.anInt4283);
			if (local29.aBoolean410 && local29.anInt3576 != -1 && Static174.aClass254_1.method5670(local29.anInt3576).anInt5036 == 1) {
				super.anInt4283 = -1;
			}
		}
		if (super.anInt4267 != -1) {
			local29 = Static88.aClass69_1.method1553(super.anInt4267);
			if (local29.aBoolean410 && local29.anInt3576 != -1 && Static174.aClass254_1.method5670(local29.anInt3576).anInt5036 == 1) {
				super.anInt4267 = -1;
			}
		}
		this.anInt4346 = -1;
		if (arg0 < 0 || Static296.anInt5187 <= arg0 || arg1 < 0 || Static206.anInt3607 <= arg1) {
			this.method3441(arg0, arg1);
		} else if (super.anIntArray283[0] >= 0 && super.anIntArray283[0] < Static296.anInt5187 && super.anIntArray284[0] >= 0 && Static206.anInt3607 > super.anIntArray284[0]) {
			if (arg2 == 2) {
				Static236.method3395(this, arg1, arg0);
			}
			this.method3439(arg0, arg2, arg1);
		} else {
			this.method3441(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		if (this.aClass173_1 == null || !this.method3438(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class32 local19 = arg0.method5747();
		@Pc(24) int local24 = super.aClass265_7.method5841();
		local19.ca(local24);
		local19.W(super.anInt5518, super.anInt5517, super.anInt5514);
		@Pc(38) float local38 = arg0.T();
		@Pc(41) float local41 = arg0.aa();
		@Pc(110) int local110;
		if (Static453.aClass136_Sub1_1.aBoolean503) {
			@Pc(48) Class236 local48 = this.method3428();
			if (local48.aBoolean708 && (this.aClass173_1.anInt4998 == -1 || Static161.aClass231_2.method5022(this.aClass173_1.anInt4998).aBoolean153)) {
				@Pc(86) Class177 local86 = super.anInt4270 != -1 && super.anInt4235 == 0 ? Static174.aClass254_1.method5670(super.anInt4270) : null;
				@Pc(108) Class177 local108 = super.anInt4287 == -1 || this.aBoolean488 || super.aBoolean483 && local86 != null ? null : Static174.aClass254_1.method5670(super.anInt4287);
				local110 = 0;
				if (super.anInt4297 != 0) {
					local110 = this.method3433();
				}
				@Pc(153) Class57 local153 = Static41.method586(1, 0, local108 == null ? local86 : local108, super.anInt4242, super.anInt4247, arg0, local110, super.anInt4255, super.aClass57Array3[0], local108 == null ? super.anInt4301 : super.anInt4240, 240, 160, local24, 0);
				if (local153 != null) {
					arg0.da(local38, local41 - 128.0F);
					arg0.method5745(false);
					local153.method5953(local19, null, 0);
					arg0.method5745(true);
				}
			}
		}
		if (Static447.aClass25_Sub5_Sub1_Sub2_4 == this) {
			arg0.da(local38, local41 - 144.0F);
			local19.U(super.anInt5518, super.anInt5517, super.anInt5514);
			for (@Pc(194) int local194 = Static133.aClass135Array1.length - 1; local194 >= 0; local194--) {
				@Pc(200) Class135 local200 = Static133.aClass135Array1[local194];
				if (local200 != null && local200.anInt3823 != -1) {
					@Pc(245) int local245;
					if (local200.anInt3824 == 1 && local200.anInt3817 >= 0 && Static87.aClass25_Sub5_Sub1_Sub1Array6.length > local200.anInt3817) {
						@Pc(229) Class25_Sub5_Sub1_Sub1 local229 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local200.anInt3817];
						if (local229 != null) {
							local110 = local229.anInt5518 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518;
							local245 = local229.anInt5514 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514;
							this.method3440(local245, arg0, local110, local19, 5760000, local200.anInt3823, super.aClass57Array3[0]);
						}
					}
					if (local200.anInt3824 == 2) {
						@Pc(275) int local275 = local200.anInt3818 + 64 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518;
						local110 = local200.anInt3814 + 64 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514;
						local245 = local200.anInt3825 << 7;
						local245 *= local245;
						this.method3440(local110, arg0, local275, local19, local245, local200.anInt3823, super.aClass57Array3[0]);
					}
					if (local200.anInt3824 == 10 && local200.anInt3817 >= 0 && Static28.aClass25_Sub5_Sub1_Sub2Array1.length > local200.anInt3817) {
						@Pc(328) Class25_Sub5_Sub1_Sub2 local328 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local200.anInt3817];
						if (local328 != null) {
							local110 = local328.anInt5518 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518;
							local245 = local328.anInt5514 - Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514;
							this.method3440(local245, arg0, local110, local19, 5760000, local200.anInt3823, super.aClass57Array3[0]);
						}
					}
				}
			}
			local19.ca(local24);
			local19.W(super.anInt5518, super.anInt5517, super.anInt5514);
		}
		arg0.da(local38, local41);
		@Pc(383) Class4_Sub7 local383 = Static142.method2157(super.aClass57Array3.length);
		if (super.aClass4_Sub2_5 == null) {
			arg0.method5771(super.aClass57Array3, local19, local383.aClass4_Sub8Array1, Static447.aClass25_Sub5_Sub1_Sub2_4 == this ? 1 : 0);
		} else {
			@Pc(390) Class71 local390 = super.aClass4_Sub2_5.method1240();
			arg0.method5797(super.aClass57Array3, local390, local19, local383.aClass4_Sub8Array1, Static447.aClass25_Sub5_Sub1_Sub2_4 == this ? 1 : 0);
		}
		this.method3421(false, arg0, super.aClass57Array3);
		if (super.aClass57Array3[2] != null) {
			if (local24 != 0) {
				super.aClass57Array3[2].ma(local24);
			}
			super.aClass57Array3[2].a(-super.aClass1_Sub17_3.anInt1715 + super.anInt5518, super.anInt5517 - super.aClass1_Sub17_3.anInt1710, super.anInt5514 - super.aClass1_Sub17_3.anInt1722);
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		super.anInt4308 = Static49.anInt840;
		return local383;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I")
	@Override
	protected int method3417() {
		return this.anInt4317;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass173_1 == null || !this.method3438(arg1, 131072)) {
			return false;
		}
		@Pc(25) Class32 local25 = arg1.method5747();
		@Pc(30) int local30 = super.aClass265_7.method5841();
		local25.ca(local30);
		local25.W(super.anInt5518, super.anInt5517, super.anInt5514);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass57Array3.length; local45++) {
			if (super.aClass57Array3[local45] != null && super.aClass57Array3[local45].method5957(arg2, arg0, local25, true)) {
				local43 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method3447() {
		@Pc(7) String local7 = "";
		if (Static431.aStringArray47 != null) {
			local7 = local7 + Static431.aStringArray47[this.aByte66];
		}
		@Pc(29) int[] local29;
		if (this.aByte65 == 1 && Static378.anIntArray190 != null) {
			local29 = Static378.anIntArray190;
		} else {
			local29 = Static438.anIntArray306;
		}
		if (local29 != null && local29[this.aByte66] != -1) {
			@Pc(49) Class144 local49 = Static18.aClass40_1.method983(local29[this.aByte66]);
			if (local49.aChar3 == 's') {
				local7 = local7 + local49.method3278(this.aByte64 & 0xFF);
			} else {
				Static55.method972(new Throwable(), "gdn1");
				local29[this.aByte66] = -1;
			}
		}
		local7 = local7 + this.aString52;
		if (Static315.aStringArray35 != null) {
			local7 = local7 + Static315.aStringArray35[this.aByte66];
		}
		return local7;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method3448(@OriginalArg(0) Class1_Sub28 arg0) {
		arg0.anInt6812 = 0;
		@Pc(12) int local12 = arg0.method5337();
		this.aByte65 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method3427();
		this.method3431((local12 >> 3 & 0x7) + 1);
		this.aByte66 = (byte) (local12 >> 6 & 0x3);
		super.anInt5518 += this.method3427() - local41 << 6;
		super.anInt5514 += this.method3427() - local41 << 6;
		this.aByte64 = arg0.method5367();
		this.anInt4345 = arg0.method5367();
		this.anInt4354 = arg0.method5367();
		@Pc(102) int local102 = -1;
		this.anInt4336 = 0;
		@Pc(108) int[] local108 = new int[12];
		@Pc(131) int local131;
		@Pc(137) int local137;
		@Pc(177) int local177;
		for (@Pc(110) int local110 = 0; local110 < 12; local110++) {
			@Pc(116) int local116 = arg0.method5337();
			if (local116 == 0) {
				local108[local110] = 0;
			} else {
				local131 = arg0.method5337();
				local137 = (local116 << 8) + local131;
				if (local110 == 0 && local137 == 65535) {
					local102 = arg0.method5335();
					this.anInt4336 = arg0.method5337();
					break;
				}
				if (local137 >= 32768) {
					local137 = Static286.anIntArray324[local137 - 32768];
					local108[local110] = local137 | 0x40000000;
					local177 = Static342.aClass155_2.method3548(local137).anInt4720;
					if (local177 != 0) {
						this.anInt4336 = local177;
					}
				} else {
					local108[local110] = local137 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(207) int[] local207 = new int[5];
		for (local131 = 0; local131 < 5; local131++) {
			local137 = arg0.method5337();
			if (local137 < 0 || Static452.aShortArrayArray13[local131].length <= local137) {
				local137 = 0;
			}
			local207[local131] = local137;
		}
		this.anInt4317 = arg0.method5335();
		this.aString52 = arg0.method5381();
		if (local26) {
			this.aString51 = arg0.method5381();
		} else {
			this.aString51 = this.aString52;
		}
		this.anInt4324 = arg0.method5337();
		if (local37) {
			this.anInt4356 = arg0.method5335();
			this.anInt4337 = this.anInt4324;
			this.anInt4338 = -1;
		} else {
			this.anInt4356 = 0;
			this.anInt4337 = arg0.method5337();
			this.anInt4338 = arg0.method5337();
			if (this.anInt4338 == 255) {
				this.anInt4338 = -1;
			}
		}
		local137 = this.anInt4331;
		this.anInt4331 = arg0.method5337();
		@Pc(331) int local331;
		if (this.anInt4331 == 0) {
			Static61.method1291(this);
		} else {
			local177 = this.anInt4330;
			@Pc(328) int local328 = this.anInt4353;
			local331 = this.anInt4351;
			@Pc(334) int local334 = this.anInt4320;
			@Pc(337) int local337 = this.anInt4321;
			this.anInt4330 = arg0.method5335();
			this.anInt4353 = arg0.method5335();
			this.anInt4351 = arg0.method5335();
			this.anInt4320 = arg0.method5335();
			this.anInt4321 = arg0.method5337();
			if (this.anInt4331 != local137 || local177 != this.anInt4330 || local328 != this.anInt4353 || local331 != this.anInt4351 || this.anInt4320 != local334 || local337 != this.anInt4321) {
				Static403.method5243(this);
			}
		}
		if (this.aClass173_1 == null) {
			this.aClass173_1 = new Class173();
		}
		local177 = this.aClass173_1.anInt4998;
		@Pc(421) int[] local421 = this.aClass173_1.anIntArray319;
		this.aClass173_1.method3910(this.aByte65 == 1, local207, this.method3417(), local108, local102);
		if (local102 != local177) {
			super.anInt5518 = (super.anIntArray283[0] << 7) + (this.method3427() << 6);
			super.anInt5514 = (super.anIntArray284[0] << 7) + (this.method3427() << 6);
		}
		if (Static296.anInt5181 == super.anInt4284 && local421 != null) {
			for (local331 = 0; local331 < local207.length; local331++) {
				if (local207[local331] != local421[local331]) {
					Static342.aClass155_2.method3544();
					break;
				}
			}
		}
		if (super.aClass4_Sub2_5 != null) {
			super.aClass4_Sub2_5.method1246();
		}
		if (super.anInt4287 == -1 || !super.aBoolean483) {
			return;
		}
		@Pc(524) Class236 local524 = this.method3428();
		if (!local524.method5071(super.anInt4287)) {
			super.aBoolean483 = false;
			super.anInt4287 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		throw new IllegalStateException();
	}
}
