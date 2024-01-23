import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class22_Sub3_Sub2 extends Class22_Sub3 {

	@OriginalMember(owner = "client!qm", name = "Gc", descriptor = "Lclient!nh;")
	public Class119 aClass119_2;

	@OriginalMember(owner = "client!qm", name = "Nc", descriptor = "Ljava/lang/String;")
	public String aString152;

	@OriginalMember(owner = "client!qm", name = "Oc", descriptor = "Ljava/lang/String;")
	public String aString153;

	@OriginalMember(owner = "client!qm", name = "sc", descriptor = "I")
	public int anInt4652 = 0;

	@OriginalMember(owner = "client!qm", name = "vc", descriptor = "I")
	public int anInt4655 = -1;

	@OriginalMember(owner = "client!qm", name = "Ec", descriptor = "B")
	private byte aByte26 = 0;

	@OriginalMember(owner = "client!qm", name = "Dc", descriptor = "I")
	public int anInt4663 = -1;

	@OriginalMember(owner = "client!qm", name = "yc", descriptor = "I")
	public int anInt4658 = -1;

	@OriginalMember(owner = "client!qm", name = "Cc", descriptor = "I")
	public int anInt4662 = 0;

	@OriginalMember(owner = "client!qm", name = "xc", descriptor = "I")
	public int anInt4657 = 0;

	@OriginalMember(owner = "client!qm", name = "tc", descriptor = "I")
	public int anInt4653 = 0;

	@OriginalMember(owner = "client!qm", name = "Sc", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!qm", name = "Uc", descriptor = "I")
	public int anInt4674 = 0;

	@OriginalMember(owner = "client!qm", name = "Wc", descriptor = "I")
	public int anInt4676 = -1;

	@OriginalMember(owner = "client!qm", name = "Zc", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!qm", name = "Fc", descriptor = "I")
	public int anInt4664 = -1;

	@OriginalMember(owner = "client!qm", name = "Rc", descriptor = "I")
	public int anInt4672 = -1;

	@OriginalMember(owner = "client!qm", name = "Jc", descriptor = "I")
	public int anInt4667 = 255;

	@OriginalMember(owner = "client!qm", name = "bd", descriptor = "I")
	public int anInt4679 = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		if (this.aClass119_2 == null) {
			return;
		}
		@Pc(27) Class167 local27 = this.anInt4642 != -1 && this.anInt4632 == 0 ? Static313.method4648(this.anInt4642) : null;
		@Pc(31) Class78 local31 = this.method3659();
		@Pc(57) boolean local57 = local31.anInt2141 != 0 || local31.anInt2165 != 0 || local31.anInt2164 != 0 || local31.anInt2129 != 0;
		@Pc(86) Class167 local86 = this.anInt4566 == -1 || this.aBoolean334 || this.anInt4566 == this.method3659().anInt2171 && local27 != null ? null : Static313.method4648(this.anInt4566);
		@Pc(109) Class22_Sub4 local109 = this.aClass119_2.method3030(local27, this.anInt4609, this.anInt4576, this.anInt4597, this.anInt4645, this.anInt4635, this.aClass53Array3, this.anInt4612, local57, local86, true);
		@Pc(112) int local112 = Static2.method32();
		if (Static291.aBoolean404 && Static83.anInt1516 < 96 && local112 > 50) {
			Static276.method2813();
		}
		@Pc(139) int local139;
		if (Static134.anInt2682 != 0 && local112 < 50) {
			local139 = 50 - local112;
			while (Static111.anInt2189 < local139) {
				Static40.aByteArrayArray2[Static111.anInt2189] = new byte[102400];
				Static111.anInt2189++;
			}
			while (local139 < Static111.anInt2189) {
				Static111.anInt2189--;
				Static40.aByteArrayArray2[Static111.anInt2189] = null;
			}
		}
		if (local109 == null) {
			return;
		}
		this.anInt4615 = local109.method4071();
		@Pc(228) Class22_Sub4 local228;
		if (Static285.aBoolean387 && (this.aClass119_2.anInt3701 == -1 || Static195.method3169(this.aClass119_2.anInt3701).aBoolean243)) {
			local228 = Static236.method3737(this.anInt4601, arg0, 160, 240, 0, this.anInt4623, 1, local86 == null ? local27 : local86, local109, this.aBoolean332, this.anInt4579, 0, local86 == null ? this.anInt4597 : this.anInt4635);
			if (Static291.aBoolean404) {
				@Pc(247) float local247 = Static291.method4329();
				@Pc(249) float local249 = Static291.method4298();
				Static291.method4330();
				Static291.method4291(local247, local249 - 150.0F);
				local228.method4073(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static291.method4333();
				Static291.method4291(local247, local249);
			} else {
				local228.method4073(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static229.aClass22_Sub3_Sub2_2 == this) {
			for (local139 = Static257.aClass68Array1.length - 1; local139 >= 0; local139--) {
				@Pc(287) Class68 local287 = Static257.aClass68Array1[local139];
				if (local287 != null && local287.anInt1788 != -1) {
					@Pc(332) int local332;
					@Pc(342) int local342;
					if (local287.anInt1791 == 1 && local287.anInt1785 >= 0 && Static265.aClass22_Sub3_Sub1Array1.length > local287.anInt1785) {
						@Pc(317) Class22_Sub3_Sub1 local317 = Static265.aClass22_Sub3_Sub1Array1[local287.anInt1785];
						if (local317 != null) {
							local332 = local317.anInt4601 / 32 - Static229.aClass22_Sub3_Sub2_2.anInt4601 / 32;
							local342 = local317.anInt4623 / 32 - Static229.aClass22_Sub3_Sub2_2.anInt4623 / 32;
							this.method3664(arg5, local109, local342, arg7, arg4, arg9, null, arg6, arg0, arg1, arg3, 360000, arg2, local332, local287.anInt1788);
						}
					}
					if (local287.anInt1791 == 2) {
						local342 = local287.anInt1790 * 4;
						local332 = (local287.anInt1795 - Static118.anInt2409) * 4 + 2 - Static229.aClass22_Sub3_Sub2_2.anInt4623 / 32;
						@Pc(405) int local405 = (local287.anInt1786 - Static290.anInt5497) * 4 + 2 - Static229.aClass22_Sub3_Sub2_2.anInt4601 / 32;
						local342 *= local342;
						this.method3664(arg5, local109, local332, arg7, arg4, arg9, null, arg6, arg0, arg1, arg3, local342, arg2, local405, local287.anInt1788);
					}
					if (local287.anInt1791 == 10 && local287.anInt1785 >= 0 && local287.anInt1785 < Static195.aClass22_Sub3_Sub2Array1.length) {
						@Pc(450) Class22_Sub3_Sub2 local450 = Static195.aClass22_Sub3_Sub2Array1[local287.anInt1785];
						if (local450 != null) {
							local332 = local450.anInt4601 / 32 - Static229.aClass22_Sub3_Sub2_2.anInt4601 / 32;
							local342 = local450.anInt4623 / 32 - Static229.aClass22_Sub3_Sub2_2.anInt4623 / 32;
							this.method3664(arg5, local109, local342, arg7, arg4, arg9, null, arg6, arg0, arg1, arg3, 360000, arg2, local332, local287.anInt1788);
						}
					}
				}
			}
		}
		this.method3643(local109);
		this.method3652(arg0, local109);
		local228 = null;
		if (!this.aBoolean334 && this.anInt4562 != -1 && this.anInt4619 != -1) {
			@Pc(528) Class97 local528 = Static239.method3759(this.anInt4562);
			local228 = local528.method2204(this.anInt4607, this.anInt4596, this.anInt4619);
			if (local228 != null) {
				local228.method3577(0, -this.anInt4569, 0);
				if (local528.aBoolean195) {
					if (Static85.anInt1546 != 0) {
						local228.method3565(Static85.anInt1546);
					}
					if (Static225.anInt4444 != 0) {
						local228.method3576(Static225.anInt4444);
					}
					if (Static165.anInt3458 != 0) {
						local228.method3577(0, Static165.anInt3458, 0);
					}
				}
			}
		}
		@Pc(577) Class22_Sub4 local577 = null;
		if (!this.aBoolean334 && this.anObject7 != null) {
			if (Static37.anInt757 >= this.anInt4599) {
				this.anObject7 = null;
			}
			if (Static37.anInt757 >= this.anInt4578 && Static37.anInt757 < this.anInt4599) {
				if (this.anObject7 instanceof Class22_Sub5) {
					local577 = (Class22_Sub4) ((Class22_Sub5) this.anObject7).method1831();
				} else {
					local577 = (Class22_Sub4) this.anObject7;
				}
				local577.method3577(this.anInt4630 - this.anInt4601, -this.anInt4579 + this.anInt4590, this.anInt4613 - this.anInt4623);
				if (this.anInt4561 == 512) {
					local577.method3556();
				} else if (this.anInt4561 == 1024) {
					local577.method3555();
				} else if (this.anInt4561 == 1536) {
					local577.method3578();
				}
			}
		}
		if (Static291.aBoolean404) {
			this.method3658(local228, local109);
			local109.aBoolean315 = true;
			local109.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_7);
			if (local228 != null) {
				if (this.aClass45_Sub2_7 != null) {
					@Pc(702) Class22_Sub4_Sub1 local702 = (Class22_Sub4_Sub1) local228;
					this.aClass45_Sub2_7.method2405(local702.aClass49Array1, local702.aClass15Array1, true, local702.anIntArray174, local702.anIntArray175, local702.anIntArray170);
				}
				local228.aBoolean315 = true;
				local228.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_7);
			}
		} else {
			if (local228 != null) {
				local109 = ((Class22_Sub4_Sub2) local109).method3588(local228);
			}
			if (local577 != null) {
				local109 = ((Class22_Sub4_Sub2) local109).method3588(local577);
			}
			this.method3658(local228, local109);
			local109.aBoolean315 = true;
			local109.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_7);
		}
		if (local577 == null) {
			return;
		}
		if (this.anInt4561 == 512) {
			local577.method3578();
		} else if (this.anInt4561 == 1024) {
			local577.method3555();
		} else if (this.anInt4561 == 1536) {
			local577.method3556();
		}
		local577.method3577(this.anInt4601 - this.anInt4630, this.anInt4579 - this.anInt4590, this.anInt4623 - this.anInt4613);
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)I")
	@Override
	public int method3660() {
		return this.aClass119_2 == null || this.aClass119_2.anInt3701 == -1 ? super.method3660() : Static195.method3169(this.aClass119_2.anInt3701).anInt3495;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		return this.anInt4615;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
	@Override
	protected int method3640() {
		return this.anInt4646;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIZ)V")
	public void method3661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		super.method3650(arg0, arg1, this.method3660(), arg2);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	@Override
	public int method3641() {
		return -1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3663() {
		@Pc(3) String local3 = "";
		if (Static88.aStringArray15 != null) {
			local3 = local3 + Static88.aStringArray15[this.aByte27];
		}
		if (Static225.anIntArray370 != null && Static225.anIntArray370[this.aByte27] != -1) {
			@Pc(33) Class1_Sub1_Sub22 local33 = Static130.method2050(Static225.anIntArray370[this.aByte27]);
			if (local33.aChar5 == 's') {
				local3 = local3 + local33.method4177(this.aByte26 & 0xFF);
			} else {
				Static195.method3178("gdn1", new Throwable());
				Static225.anIntArray370[this.aByte27] = -1;
			}
		}
		local3 = local3 + this.aString152;
		if (Static177.aStringArray19 != null) {
			local3 = local3 + Static177.aStringArray19[this.aByte27];
		}
		return local3;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!hc;IIIILclient!ko;IIIIIIBII)V")
	private void method3664(@OriginalArg(0) int arg0, @OriginalArg(1) Class22_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class45_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(20) int local20 = arg2 * arg2 + arg13 * arg13;
		if (local20 < 16 || local20 > arg11) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg13, (double) arg2) * 325.949D) & 0x7FF;
		@Pc(50) Class22_Sub4 local50 = Static30.method532(this.anInt4601, local38, arg1, this.anInt4579, this.anInt4623, arg14);
		if (local50 == null) {
			return;
		}
		if (!Static291.aBoolean404) {
			local50.method4073(0, arg9, arg12, arg10, arg4, arg0, arg7, arg3, -1L, arg5, arg6);
			return;
		}
		@Pc(58) float local58 = Static291.method4329();
		@Pc(60) float local60 = Static291.method4298();
		Static291.method4330();
		Static291.method4291(local58, local60 - 150.0F);
		local50.method4073(0, arg9, arg12, arg10, arg4, arg0, arg7, arg3, -1L, arg5, arg6);
		Static291.method4333();
		Static291.method4291(local58, local60);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3667(@OriginalArg(1) boolean arg0) {
		return arg0 ? this.aString152 : this.aString153;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!sb;BI)V")
	public void method3668(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		arg0.anInt3290 = 0;
		@Pc(12) int local12 = arg0.method2595();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(18) int local18 = -1;
		@Pc(29) boolean local29 = (local12 & 0x4) != 0;
		@Pc(32) int[] local32 = new int[12];
		@Pc(43) boolean local43 = (local12 & 0x2) != 0;
		@Pc(53) int local53 = super.method3660();
		this.method3654((local12 >> 3 & 0x7) + 1);
		this.aByte27 = (byte) (local12 >> 6 & 0x3);
		this.anInt4601 += (this.method3660() - local53) * 64;
		this.anInt4623 += (this.method3660() - local53) * 64;
		this.aByte26 = arg0.method2598();
		this.anInt4655 = arg0.method2598();
		this.anInt4664 = arg0.method2598();
		this.anInt4652 = 0;
		@Pc(126) int local126;
		@Pc(139) int local139;
		@Pc(145) int local145;
		@Pc(187) int local187;
		for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
			local126 = arg0.method2595();
			if (local126 == 0) {
				local32[local117] = 0;
			} else {
				local139 = arg0.method2595();
				local145 = (local126 << 8) + local139;
				if (local117 == 0 && local145 == 65535) {
					local18 = arg0.method2593();
					this.anInt4652 = arg0.method2595();
					break;
				}
				if (local145 >= 32768) {
					local145 = Static268.anIntArray536[local145 - 32768];
					local32[local117] = local145 | 0x40000000;
					local187 = Static271.method4006(local145).anInt4804;
					if (local187 != 0) {
						this.anInt4652 = local187;
					}
				} else {
					local32[local117] = Integer.MIN_VALUE | local145 - 256;
				}
			}
		}
		@Pc(209) int[] local209 = new int[5];
		for (local126 = 0; local126 < 5; local126++) {
			local139 = arg0.method2595();
			if (local139 < 0 || Static313.aShortArrayArray42[local126].length <= local139) {
				local139 = 0;
			}
			local209[local126] = local139;
		}
		this.anInt4646 = arg0.method2593();
		this.aString152 = arg0.method2605();
		if (local43) {
			this.aString153 = arg0.method2605();
		} else {
			this.aString153 = this.aString152;
		}
		this.anInt4674 = arg0.method2595();
		if (local29) {
			this.anInt4662 = arg0.method2593();
			this.anInt4657 = this.anInt4674;
			this.anInt4679 = -1;
		} else {
			this.anInt4662 = 0;
			this.anInt4657 = arg0.method2595();
			this.anInt4679 = arg0.method2595();
			if (this.anInt4679 == 255) {
				this.anInt4679 = -1;
			}
		}
		local126 = this.anInt4653;
		this.anInt4653 = arg0.method2595();
		if (this.anInt4653 == 0) {
			Static232.method2980(this, arg1);
		} else {
			local145 = this.anInt4672;
			local187 = this.anInt4676;
			@Pc(326) int local326 = this.anInt4667;
			local139 = this.anInt4663;
			@Pc(332) int local332 = this.anInt4658;
			this.anInt4663 = arg0.method2593();
			this.anInt4672 = arg0.method2593();
			this.anInt4676 = arg0.method2593();
			this.anInt4658 = arg0.method2593();
			this.anInt4667 = arg0.method2595();
			if (this.anInt4653 != local126 || local139 != this.anInt4663 || this.anInt4672 != local145 || this.anInt4676 != local187 || local332 != this.anInt4658 || local326 != this.anInt4667) {
				Static57.method979(this, arg1);
			}
		}
		if (this.aClass119_2 == null) {
			this.aClass119_2 = new Class119();
		}
		local139 = this.aClass119_2.anInt3701;
		this.aClass119_2.method3025(local209, local16 == 1, local32, local18, this.anInt4646);
		if (local139 != local18) {
			this.anInt4601 = this.anIntArray427[0] * 128 + this.method3660() * 64;
			this.anInt4623 = this.anIntArray424[0] * 128 + this.method3660() * 64;
		}
		if (this.aClass45_Sub2_7 != null) {
			this.aClass45_Sub2_7.method2398();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean330) {
			if (this.aClass119_2 == null) {
				return;
			}
			@Pc(29) Class167 local29 = this.anInt4642 != -1 && this.anInt4632 == 0 ? Static313.method4648(this.anInt4642) : null;
			@Pc(56) Class167 local56 = this.anInt4566 == -1 || this.aBoolean334 || this.anInt4566 == this.method3659().anInt2171 && local29 != null ? null : Static313.method4648(this.anInt4566);
			@Pc(79) Class22_Sub4 local79 = this.aClass119_2.method3030(local29, this.anInt4609, this.anInt4576, this.anInt4597, this.anInt4645, this.anInt4635, this.aClass53Array3, this.anInt4612, false, local56, false);
			if (local79 == null) {
				return;
			}
			this.method3658(null, local79);
		}
		if (this.aClass45_Sub2_7 != null) {
			this.aClass45_Sub2_7.method2396(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3655() {
		return this.aClass119_2 != null;
	}

	@OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass45_Sub2_7 != null) {
			this.aClass45_Sub2_7.method2416();
		}
	}
}
