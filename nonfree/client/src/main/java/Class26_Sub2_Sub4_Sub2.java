import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class26_Sub2_Sub4_Sub2 extends Class26_Sub2_Sub4 {

	@OriginalMember(owner = "client!vi", name = "Hc", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!vi", name = "Ic", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!vi", name = "dd", descriptor = "I")
	public int anInt7139;

	@OriginalMember(owner = "client!vi", name = "md", descriptor = "I")
	private int anInt7146;

	@OriginalMember(owner = "client!vi", name = "nd", descriptor = "I")
	public int anInt7147;

	@OriginalMember(owner = "client!vi", name = "wd", descriptor = "Lclient!fb;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!vi", name = "Pc", descriptor = "I")
	public int anInt7126 = 0;

	@OriginalMember(owner = "client!vi", name = "Yc", descriptor = "B")
	private byte aByte97 = 0;

	@OriginalMember(owner = "client!vi", name = "hd", descriptor = "Z")
	public boolean aBoolean482 = false;

	@OriginalMember(owner = "client!vi", name = "ad", descriptor = "I")
	public int anInt7136 = 0;

	@OriginalMember(owner = "client!vi", name = "Jc", descriptor = "I")
	public int anInt7121 = -1;

	@OriginalMember(owner = "client!vi", name = "Kc", descriptor = "I")
	public int anInt7122 = 255;

	@OriginalMember(owner = "client!vi", name = "Ec", descriptor = "Z")
	public boolean aBoolean480 = false;

	@OriginalMember(owner = "client!vi", name = "ld", descriptor = "I")
	public int anInt7145 = -1;

	@OriginalMember(owner = "client!vi", name = "jd", descriptor = "I")
	public int anInt7143 = 0;

	@OriginalMember(owner = "client!vi", name = "gd", descriptor = "B")
	private byte aByte98 = 0;

	@OriginalMember(owner = "client!vi", name = "Rc", descriptor = "I")
	public int anInt7128 = -1;

	@OriginalMember(owner = "client!vi", name = "Lc", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!vi", name = "bd", descriptor = "I")
	public int anInt7137 = -1;

	@OriginalMember(owner = "client!vi", name = "Tc", descriptor = "I")
	public int anInt7130 = -1;

	@OriginalMember(owner = "client!vi", name = "Vc", descriptor = "I")
	public int anInt7132 = -1;

	@OriginalMember(owner = "client!vi", name = "vd", descriptor = "B")
	private byte aByte99 = 0;

	@OriginalMember(owner = "client!vi", name = "kd", descriptor = "I")
	public int anInt7144 = -1;

	@OriginalMember(owner = "client!vi", name = "sd", descriptor = "I")
	public int anInt7152 = -1;

	@OriginalMember(owner = "client!vi", name = "Uc", descriptor = "I")
	public int anInt7131 = 0;

	@OriginalMember(owner = "client!vi", name = "Ad", descriptor = "I")
	public int anInt7158 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!t;IIIBLclient!ya;Lclient!c;)V")
	private void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class51 arg5, @OriginalArg(7) Class33 arg6) {
		@Pc(11) int local11 = arg4 * arg4 + arg0 * arg0;
		if (local11 < 16384 || arg3 < local11) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg4, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(41) Class163 local41 = Static430.method5564(arg2, super.anInt7089, local29, super.anInt7067, super.anInt7113, arg5);
		if (local41 != null) {
			arg5.method5333(false);
			local41.method4667(arg6, null, 0);
			arg5.method5333(true);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ya;II)Z")
	private boolean method5523(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class78 local11 = this.method5507();
		@Pc(29) Class139 local29 = super.anInt7046 != -1 && super.anInt7069 == 0 ? Static364.aClass151_2.method3293(super.anInt7046) : null;
		@Pc(49) Class139 local49 = super.anInt7103 == -1 || this.aBoolean481 || super.aBoolean475 && local29 != null ? null : Static364.aClass151_2.method3293(super.anInt7103);
		@Pc(52) int local52 = local11.anInt2287;
		@Pc(55) int local55 = local11.anInt2295;
		if (local52 != 0 || local55 != 0 || local11.anInt2285 != 0 || local11.anInt2300 != 0) {
			arg1 |= 0x7;
		}
		@Pc(95) boolean local95 = super.aByte94 != 0 && super.anInt7049 <= Static274.anInt4617 && Static274.anInt4617 < super.anInt7053;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(142) Class163 local142 = super.aClass163Array3[0] = this.aClass75_1.method1849(super.anInt7104, super.lb, super.anInt7076, arg1, Static442.aClass98_1, Static259.aClass206_2, arg0, Static223.aClass154_1, Static364.aClass151_2, local29, local49, super.aClass69Array3, super.anInt7055, super.anInt7061, Static224.aClass239_7, super.anInt7050, Static430.aClass162_2);
		@Pc(145) int local145 = Static305.method5644();
		if (Static268.anInt4537 < 96 && local145 > 50) {
			Static346.method4466();
		}
		@Pc(166) int local166;
		if (Static313.aClass136_7 != Static167.aClass136_5 && local145 < 50) {
			local166 = 50 - local145;
			while (local166 > Static144.anInt2767) {
				Static423.aByteArrayArray23[Static144.anInt2767] = new byte[102400];
				Static144.anInt2767++;
			}
			while (local166 < Static144.anInt2767) {
				Static144.anInt2767--;
				Static423.aByteArrayArray23[Static144.anInt2767] = null;
			}
		} else if (Static313.aClass136_7 != Static167.aClass136_5) {
			Static144.anInt2767 = 0;
			Static423.aByteArrayArray23 = new byte[50][];
		}
		if (local142 == null) {
			return false;
		}
		super.anInt7102 = local142.MA();
		this.method5506(local142);
		local166 = super.aClass158_7.method3356();
		if (local52 == 0 && local55 == 0) {
			this.method5514(this.method5512() << 7, 0, local166, this.method5512() << 7, 0);
		} else {
			this.method5514(local52, local11.anInt2262, local166, local55, local11.anInt2282);
			if (super.anInt7113 != 0) {
				local142.Z(super.anInt7113);
			}
			if (super.anInt7089 != 0) {
				local142.R(super.anInt7089);
			}
			if (super.anInt7067 != 0) {
				local142.JA(0, super.anInt7067, 0);
			}
		}
		if (local95) {
			local142.method4656(super.aByte93, super.aByte96, super.aByte95, super.aByte94 & 0xFF);
		}
		@Pc(320) Class105 local320;
		@Pc(337) boolean local337;
		@Pc(339) int local339;
		@Pc(382) Class163 local382;
		if (this.aBoolean481 || super.anInt7066 == -1 || super.anInt7099 == -1) {
			super.aClass163Array3[1] = null;
		} else {
			local320 = Static79.aClass231_1.method4830(super.anInt7066);
			local337 = local320.aByte28 == 3 && (local52 != 0 || local55 != 0);
			local339 = local7;
			if (local337) {
				local339 = local7 | 0x7;
			} else {
				if (super.anInt7094 != 0) {
					local339 = local7 | 0x5;
				}
				if (super.anInt7047 != 0) {
					local339 |= 0x2;
				}
			}
			local382 = super.aClass163Array3[1] = local320.method2333(super.anInt7042, local339, super.anInt7056, super.anInt7099, arg0, Static364.aClass151_2);
			if (local382 != null) {
				if (super.anInt7047 != 0) {
					local382.JA(0, -super.anInt7047 << 0, 0);
				}
				if (super.anInt7094 != 0) {
					local382.Q(super.anInt7094 * 2048);
				}
				if (local337) {
					if (super.anInt7113 != 0) {
						local382.Z(super.anInt7113);
					}
					if (super.anInt7089 != 0) {
						local382.R(super.anInt7089);
					}
					if (super.anInt7067 != 0) {
						local382.JA(0, super.anInt7067, 0);
					}
				}
			}
		}
		if (this.aBoolean481 || super.anInt7065 == -1 || super.anInt7037 == -1) {
			super.aClass163Array3[3] = null;
		} else {
			local320 = Static79.aClass231_1.method4830(super.anInt7065);
			local337 = local320.aByte28 == 3 && (local52 != 0 || local55 != 0);
			local339 = local7;
			if (local337) {
				local339 = local7 | 0x7;
			} else {
				if (super.anInt7068 != 0) {
					local339 = local7 | 0x5;
				}
				if (super.anInt7082 != 0) {
					local339 |= 0x2;
				}
			}
			local382 = super.aClass163Array3[3] = local320.method2338(super.anInt7073, Static364.aClass151_2, local339, super.anInt7037, super.anInt7041, arg0);
			if (local382 != null) {
				if (super.anInt7082 != 0) {
					local382.JA(0, -super.anInt7082 << 0, 0);
				}
				if (super.anInt7068 != 0) {
					local382.Q(super.anInt7068 * 2048);
				}
				if (local337) {
					if (super.anInt7113 != 0) {
						local382.Z(super.anInt7113);
					}
					if (super.anInt7089 != 0) {
						local382.R(super.anInt7089);
					}
					if (super.anInt7067 != 0) {
						local382.JA(0, super.anInt7067, 0);
					}
				}
			}
		}
		super.aClass163Array3[2] = null;
		if (!this.aBoolean481 && super.aClass7_Sub42_3 != null) {
			if (Static274.anInt4617 >= super.aClass7_Sub42_3.anInt6165) {
				super.aClass7_Sub42_3 = null;
			} else if (super.aClass7_Sub42_3.anInt6171 <= Static274.anInt4617) {
				@Pc(616) Class163 local616 = super.aClass7_Sub42_3.method4917(arg0, local7 | 0x7);
				if (local616 != null) {
					local616.JA(-super.anInt7388 + super.aClass7_Sub42_3.anInt6164, super.aClass7_Sub42_3.anInt6169 + -super.anInt7390, super.aClass7_Sub42_3.anInt6176 - super.anInt7383);
					if (local166 != 0) {
						local616.Q(-local166 & 0x3FFF);
					}
					super.aClass163Array3[2] = local616;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5713(@OriginalArg(0) Class51 arg0) {
		if (this.aClass75_1 != null && (super.aBoolean479 || this.method5523(arg0, 0))) {
			this.method5509(super.aClass163Array3, super.aBoolean479, arg0);
			super.aClass163Array3[0] = super.aClass163Array3[1] = super.aClass163Array3[2] = super.aClass163Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5721() {
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)I")
	@Override
	public int method5695() {
		return super.anInt7102;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ya;IIILclient!qj;IZ)V")
	@Override
	public void method5712(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Lclient!ya;I)Lclient!mo;")
	@Override
	public Class28_Sub4 method5714(@OriginalArg(0) Class51 arg0) {
		if (this.aClass75_1 == null || !this.method5523(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class33 local19 = arg0.method5285();
		@Pc(24) int local24 = super.aClass158_7.method3356();
		local19.ra(local24);
		local19.o(super.anInt7388, super.anInt7390, super.anInt7383);
		@Pc(38) float local38 = arg0.W();
		@Pc(41) float local41 = arg0.xa();
		if (Static130.aClass153_Sub1_1.aBoolean351) {
			@Pc(48) Class78 local48 = this.method5507();
			if (local48.aBoolean123 && (this.aClass75_1.anInt2160 == -1 || Static442.aClass98_1.method2241(this.aClass75_1.anInt2160).aBoolean424)) {
				@Pc(83) Class139 local83 = super.anInt7046 != -1 && super.anInt7069 == 0 ? Static364.aClass151_2.method3293(super.anInt7046) : null;
				@Pc(104) Class139 local104 = super.anInt7103 == -1 || this.aBoolean481 || super.aBoolean475 && local83 != null ? null : Static364.aClass151_2.method3293(super.anInt7103);
				@Pc(138) Class163 local138 = Static301.method4017(super.aClass163Array3[0], 1, 160, super.aBoolean477, 0, arg0, local104 == null ? super.anInt7061 : super.lb, super.anInt7067, 0, super.anInt7113, local104 == null ? local83 : local104, super.anInt7089, 240, local24);
				if (local138 != null) {
					arg0.g(local38, local41 - 128.0F);
					arg0.method5333(false);
					local138.method4667(local19, null, 0);
					arg0.method5333(true);
				}
			}
		}
		if (Static104.aClass26_Sub2_Sub4_Sub2_2 == this) {
			arg0.g(local38, local41 - 144.0F);
			local19.j(super.anInt7388, super.anInt7390, super.anInt7383);
			for (@Pc(179) int local179 = Static325.aClass150Array1.length - 1; local179 >= 0; local179--) {
				@Pc(185) Class150 local185 = Static325.aClass150Array1[local179];
				if (local185 != null && local185.anInt4141 != -1) {
					@Pc(234) int local234;
					@Pc(227) int local227;
					if (local185.anInt4136 == 1 && local185.anInt4139 >= 0 && Static171.aClass26_Sub2_Sub4_Sub1Array1.length > local185.anInt4139) {
						@Pc(218) Class26_Sub2_Sub4_Sub1 local218 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local185.anInt4139];
						if (local218 != null) {
							local227 = local218.anInt7388 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388;
							local234 = local218.anInt7383 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383;
							this.method5522(local234, super.aClass163Array3[0], local185.anInt4141, 5760000, local227, arg0, local19);
						}
					}
					if (local185.anInt4136 == 2) {
						@Pc(263) int local263 = local185.anInt4144 + 64 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388;
						local227 = local185.anInt4134 + 64 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383;
						local234 = local185.anInt4135 << 7;
						local234 *= local234;
						this.method5522(local227, super.aClass163Array3[0], local185.anInt4141, local234, local263, arg0, local19);
					}
					if (local185.anInt4136 == 10 && local185.anInt4139 >= 0 && Static410.aClass26_Sub2_Sub4_Sub2Array1.length > local185.anInt4139) {
						@Pc(317) Class26_Sub2_Sub4_Sub2 local317 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local185.anInt4139];
						if (local317 != null) {
							local227 = local317.anInt7388 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388;
							local234 = local317.anInt7383 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383;
							this.method5522(local234, super.aClass163Array3[0], local185.anInt4141, 5760000, local227, arg0, local19);
						}
					}
				}
			}
			local19.ra(local24);
			local19.o(super.anInt7388, super.anInt7390, super.anInt7383);
		}
		arg0.g(local38, local41);
		@Pc(373) Class28_Sub4 local373 = Static329.method4328(super.aClass163Array3.length);
		if (super.aClass28_Sub3_7 == null) {
			arg0.method5334(super.aClass163Array3, local19, local373.aClass28_Sub6Array1, Static104.aClass26_Sub2_Sub4_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(395) Class201 local395 = super.aClass28_Sub3_7.method3164();
			arg0.method5322(super.aClass163Array3, local395, local19, local373.aClass28_Sub6Array1, Static104.aClass26_Sub2_Sub4_Sub2_2 == this ? 1 : 0);
		}
		this.method5509(super.aClass163Array3, false, arg0);
		if (super.aClass163Array3[2] != null) {
			if (local24 != 0) {
				super.aClass163Array3[2].Q(local24);
			}
			super.aClass163Array3[2].JA(-super.aClass7_Sub42_3.anInt6164 + super.anInt7388, -super.aClass7_Sub42_3.anInt6169 + super.anInt7390, super.anInt7383 - super.aClass7_Sub42_3.anInt6176);
		}
		super.anInt7045 = Static143.anInt2745;
		super.aClass163Array3[0] = super.aClass163Array3[1] = super.aClass163Array3[2] = super.aClass163Array3[3] = null;
		return local373;
	}

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "(B)I")
	@Override
	protected int method5517() {
		return this.anInt7146;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5711(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass75_1 == null || !this.method5523(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class33 local19 = arg1.method5285();
		@Pc(24) int local24 = super.aClass158_7.method3356();
		local19.ra(local24);
		local19.o(super.anInt7388, super.anInt7390, super.anInt7383);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass163Array3.length; local39++) {
			if (super.aClass163Array3[local39] != null && super.aClass163Array3[local39].method4653(arg0, arg2, local19, true)) {
				local37 = true;
				break;
			}
		}
		super.aClass163Array3[0] = super.aClass163Array3[1] = super.aClass163Array3[2] = super.aClass163Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
	@Override
	public int method5508() {
		return -1;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
	@Override
	public void method5715() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBI)V")
	public void method5524(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7117 < 9) {
			super.anInt7117++;
		}
		for (@Pc(20) int local20 = super.anInt7117; local20 > 0; local20--) {
			super.anIntArray603[local20] = super.anIntArray603[local20 - 1];
			super.anIntArray604[local20] = super.anIntArray604[local20 - 1];
			super.aByteArray94[local20] = super.aByteArray94[local20 - 1];
		}
		super.anIntArray603[0] = arg2;
		super.aByteArray94[0] = arg1;
		super.anIntArray604[0] = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)I")
	@Override
	public int method5512() {
		return this.aClass75_1 == null || this.aClass75_1.anInt2160 == -1 ? super.method5512() : Static442.aClass98_1.method2241(this.aClass75_1.anInt2160).anInt6507;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!gk;Z)V")
	public void method5525(@OriginalArg(0) Class7_Sub14 arg0) {
		arg0.anInt4989 = 0;
		@Pc(18) int local18 = arg0.method3981();
		this.aByte97 = (byte) (local18 & 0x1);
		@Pc(35) boolean local35 = (local18 & 0x2) != 0;
		@Pc(43) boolean local43 = (local18 & 0x4) != 0;
		@Pc(47) int local47 = super.method5512();
		this.method5519((local18 >> 3 & 0x7) + 1);
		this.aByte99 = (byte) (local18 >> 6 & 0x3);
		super.anInt7388 += this.method5512() - local47 << 6;
		super.anInt7383 += this.method5512() - local47 << 6;
		this.aByte98 = arg0.method3930();
		this.anInt7128 = arg0.method3930();
		this.anInt7144 = arg0.method3930();
		this.anInt7131 = 0;
		@Pc(110) int local110 = -1;
		@Pc(113) int[] local113 = new int[12];
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(182) int local182;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(121) int local121 = arg0.method3981();
			if (local121 == 0) {
				local113[local115] = 0;
			} else {
				local133 = arg0.method3981();
				local140 = (local121 << 8) + local133;
				if (local115 == 0 && local140 == 65535) {
					local110 = arg0.method3943();
					this.anInt7131 = arg0.method3981();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static330.anIntArray492[local140 - 32768];
					local113[local115] = local140 | 0x40000000;
					local182 = Static259.aClass206_2.method4320(local140).anInt965;
					if (local182 != 0) {
						this.anInt7131 = local182;
					}
				} else {
					local113[local115] = Integer.MIN_VALUE | local140 - 256;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local133 = 0; local133 < 5; local133++) {
			local140 = arg0.method3981();
			if (local140 < 0 || local140 >= Static407.aShortArrayArray7[local133].length) {
				local140 = 0;
			}
			local204[local133] = local140;
		}
		this.anInt7146 = arg0.method3943();
		this.aString70 = arg0.method3986();
		if (local35) {
			this.aString69 = arg0.method3986();
		} else {
			this.aString69 = this.aString70;
		}
		this.anInt7143 = arg0.method3981();
		if (local43) {
			this.anInt7158 = arg0.method3943();
			this.anInt7136 = this.anInt7143;
			this.anInt7130 = -1;
		} else {
			this.anInt7158 = 0;
			this.anInt7136 = arg0.method3981();
			this.anInt7130 = arg0.method3981();
			if (this.anInt7130 == 255) {
				this.anInt7130 = -1;
			}
		}
		local140 = this.anInt7126;
		this.anInt7126 = arg0.method3981();
		@Pc(321) int local321;
		if (this.anInt7126 == 0) {
			Static213.method3051(this);
		} else {
			local182 = this.anInt7121;
			@Pc(318) int local318 = this.anInt7137;
			local321 = this.anInt7152;
			@Pc(324) int local324 = this.anInt7132;
			@Pc(327) int local327 = this.anInt7122;
			this.anInt7121 = arg0.method3943();
			this.anInt7137 = arg0.method3943();
			this.anInt7152 = arg0.method3943();
			this.anInt7132 = arg0.method3943();
			this.anInt7122 = arg0.method3981();
			if (local140 != this.anInt7126 || this.anInt7121 != local182 || local318 != this.anInt7137 || this.anInt7152 != local321 || local324 != this.anInt7132 || this.anInt7122 != local327) {
				Static333.method2747(this);
			}
		}
		if (this.aClass75_1 == null) {
			this.aClass75_1 = new Class75();
		}
		local182 = this.aClass75_1.anInt2160;
		@Pc(407) int[] local407 = this.aClass75_1.anIntArray146;
		this.aClass75_1.method1845(local204, this.aByte97 == 1, local110, this.method5517(), local113);
		if (local182 != local110) {
			super.anInt7388 = (super.anIntArray603[0] << 7) + (this.method5512() << 6);
			super.anInt7383 = (super.anIntArray604[0] << 7) + (this.method5512() << 6);
		}
		if (super.anInt7080 == Static296.anInt4920 && local407 != null) {
			for (local321 = 0; local321 < local204.length; local321++) {
				if (local407[local321] != local204[local321]) {
					Static259.aClass206_2.method4325();
					break;
				}
			}
		}
		if (super.aClass28_Sub3_7 != null) {
			super.aClass28_Sub3_7.method3168();
		}
		if (super.anInt7103 == -1 || !super.aBoolean475) {
			return;
		}
		@Pc(512) Class78 local512 = this.method5507();
		if (!local512.method1922(super.anInt7103)) {
			super.aBoolean475 = false;
			super.anInt7103 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)V")
	public void method5526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt7116 = 0;
		super.anIntArray603[0] = arg1;
		super.anInt7114 = 0;
		super.anInt7117 = 0;
		super.anIntArray604[0] = arg0;
		@Pc(34) int local34 = this.method5512();
		super.anInt7388 = local34 * 64 + super.anIntArray603[0] * 128;
		super.anInt7383 = super.anIntArray604[0] * 128 + local34 * 64;
		if (Static104.aClass26_Sub2_Sub4_Sub2_2 == this) {
			Static379.method4655();
		}
		if (super.aClass28_Sub3_7 != null) {
			super.aClass28_Sub3_7.method3168();
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method5527() {
		@Pc(12) String local12 = "";
		if (Static209.aStringArray32 != null) {
			local12 = local12 + Static209.aStringArray32[this.aByte99];
		}
		@Pc(36) int[] local36;
		if (this.aByte97 == 1 && Static186.anIntArray303 != null) {
			local36 = Static186.anIntArray303;
		} else {
			local36 = Static268.anIntArray414;
		}
		if (local36 != null && local36[this.aByte99] != -1) {
			@Pc(59) Class218 local59 = Static258.aClass208_1.method4373(local36[this.aByte99]);
			if (local59.aChar1 == 's') {
				local12 = local12 + local59.method4462(this.aByte98 & 0xFF);
			} else {
				Static419.method5247(new Throwable(), "gdn1");
				local36[this.aByte99] = -1;
			}
		}
		local12 = local12 + this.aString70;
		if (Static317.aStringArray42 != null) {
			local12 = local12 + Static317.aStringArray42[this.aByte99];
		}
		return local12;
	}

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "(I)Z")
	public boolean method5528() {
		return this.aClass75_1 != null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method5529() {
		return this.aString69;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBII)V")
	public void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7046 != -1 && Static364.aClass151_2.method3293(super.anInt7046).anInt3932 == 1) {
			super.anInt7046 = -1;
		}
		@Pc(36) Class105 local36;
		if (super.anInt7066 != -1) {
			local36 = Static79.aClass231_1.method4830(super.anInt7066);
			if (local36.aBoolean176 && local36.anInt2900 != -1 && Static364.aClass151_2.method3293(local36.anInt2900).anInt3932 == 1) {
				super.anInt7066 = -1;
			}
		}
		if (super.anInt7065 != -1) {
			local36 = Static79.aClass231_1.method4830(super.anInt7065);
			if (local36.aBoolean176 && local36.anInt2900 != -1 && Static364.aClass151_2.method3293(local36.anInt2900).anInt3932 == 1) {
				super.anInt7065 = -1;
			}
		}
		this.anInt7145 = -1;
		if (arg0 < 0 || Static333.anInt3375 <= arg0 || arg2 < 0 || arg2 >= Static102.anInt2086) {
			this.method5526(arg2, arg0);
		} else if (super.anIntArray603[0] >= 0 && Static333.anInt3375 > super.anIntArray603[0] && super.anIntArray604[0] >= 0 && Static102.anInt2086 > super.anIntArray604[0]) {
			if (arg1 == 2) {
				Static385.method4935(this, arg0, arg2);
			}
			this.method5524(arg2, arg1, arg0);
		} else {
			this.method5526(arg2, arg0);
		}
	}
}
