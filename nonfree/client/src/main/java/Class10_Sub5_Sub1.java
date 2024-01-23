import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class10_Sub5_Sub1 extends Class10_Sub5 {

	@OriginalMember(owner = "client!nc", name = "Lc", descriptor = "Ljava/lang/String;")
	public String aString124;

	@OriginalMember(owner = "client!nc", name = "Yc", descriptor = "Ljava/lang/String;")
	public String aString125;

	@OriginalMember(owner = "client!nc", name = "jd", descriptor = "Lclient!oj;")
	public Class131 aClass131_2;

	@OriginalMember(owner = "client!nc", name = "Bc", descriptor = "I")
	public int anInt3568 = 0;

	@OriginalMember(owner = "client!nc", name = "Dc", descriptor = "I")
	public int anInt3570 = -1;

	@OriginalMember(owner = "client!nc", name = "Ic", descriptor = "I")
	public int anInt3575 = -1;

	@OriginalMember(owner = "client!nc", name = "Tc", descriptor = "I")
	public int anInt3583 = 0;

	@OriginalMember(owner = "client!nc", name = "Mc", descriptor = "I")
	public int anInt3577 = -1;

	@OriginalMember(owner = "client!nc", name = "Xc", descriptor = "I")
	public int anInt3587 = 0;

	@OriginalMember(owner = "client!nc", name = "zc", descriptor = "I")
	public int anInt3566 = 0;

	@OriginalMember(owner = "client!nc", name = "Nc", descriptor = "I")
	public int anInt3578 = -1;

	@OriginalMember(owner = "client!nc", name = "bd", descriptor = "I")
	public int anInt3590 = 0;

	@OriginalMember(owner = "client!nc", name = "Vc", descriptor = "I")
	public int anInt3585 = 255;

	@OriginalMember(owner = "client!nc", name = "Zc", descriptor = "I")
	public int anInt3588 = -1;

	@OriginalMember(owner = "client!nc", name = "Rc", descriptor = "I")
	public int anInt3582 = -1;

	@OriginalMember(owner = "client!nc", name = "Kc", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!nc", name = "cd", descriptor = "I")
	public int anInt3591 = -1;

	@OriginalMember(owner = "client!nc", name = "ed", descriptor = "B")
	private byte aByte17 = 0;

	@OriginalMember(owner = "client!nc", name = "kd", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean355) {
			if (this.aClass131_2 == null) {
				return;
			}
			@Pc(25) Class15 local25 = this.anInt5061 != -1 && this.anInt5027 == 0 ? Static253.method4288(this.anInt5061) : null;
			@Pc(53) Class15 local53 = this.anInt5066 == -1 || this.aBoolean258 || this.anInt5066 == this.method4191().anInt912 && local25 != null ? null : Static253.method4288(this.anInt5066);
			@Pc(76) Class10_Sub4 local76 = this.aClass131_2.method3351(local53, false, local25, false, this.aClass145Array3, this.anInt5035, this.anInt5020, this.anInt5034, this.anInt5081, this.anInt5049, this.anInt5025);
			if (local76 == null) {
				return;
			}
			this.method4203(local76, null);
		}
		if (this.aClass47_Sub1_4 != null) {
			this.aClass47_Sub1_4.method1093(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)I")
	@Override
	protected int method4192() {
		return this.anInt5090;
	}

	@OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass47_Sub1_4 != null) {
			this.aClass47_Sub1_4.method1092();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method3041(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString125 : this.aString124;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4189() {
		return this.aClass131_2 != null;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
	@Override
	public int method4186() {
		return this.aClass131_2 == null || this.aClass131_2.anInt3981 == -1 ? super.method4186() : Static218.method3602(this.aClass131_2.anInt3981).anInt3781;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIILclient!hm;BIIIIILclient!em;I)V")
	private void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class10_Sub4 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class47_Sub1 arg13, @OriginalArg(15) int arg14) {
		@Pc(12) int local12 = arg10 * arg10 + arg9 * arg9;
		if (local12 < 16 || arg0 < local12) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg10, (double) arg9) * 325.949D) & 0x7FF;
		@Pc(53) Class10_Sub4 local53 = Static83.method1277(arg1, this.anInt5073, local41, this.anInt5046, arg7, this.anInt5016);
		if (local53 == null) {
			return;
		}
		if (!Static283.aBoolean393) {
			local53.method4982(0, arg4, arg2, arg5, arg12, arg6, arg11, arg14, -1L, arg3, arg13);
			return;
		}
		@Pc(60) float local60 = Static283.method4632();
		@Pc(62) float local62 = Static283.method4667();
		Static283.method4641();
		Static283.method4628(local60, local62 - 150.0F);
		local53.method4982(0, arg4, arg2, arg5, arg12, arg6, arg11, arg14, -1L, arg3, arg13);
		Static283.method4653();
		Static283.method4628(local60, local62);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		return this.anInt5079;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		if (this.aClass131_2 == null) {
			return;
		}
		@Pc(27) Class15 local27 = this.anInt5061 != -1 && this.anInt5027 == 0 ? Static253.method4288(this.anInt5061) : null;
		@Pc(31) Class31 local31 = this.method4191();
		@Pc(52) boolean local52 = local31.anInt911 != 0 || local31.anInt903 != 0 || local31.anInt891 != 0 || local31.anInt886 != 0;
		@Pc(76) Class15 local76 = this.anInt5066 == -1 || this.aBoolean258 || this.anInt5066 == this.method4191().anInt912 && local27 != null ? null : Static253.method4288(this.anInt5066);
		@Pc(99) Class10_Sub4 local99 = this.aClass131_2.method3351(local76, local52, local27, true, this.aClass145Array3, this.anInt5035, this.anInt5020, this.anInt5034, this.anInt5081, this.anInt5049, this.anInt5025);
		@Pc(102) int local102 = Static148.method2519();
		if (Static283.aBoolean393 && Static258.anInt5304 < 96 && local102 > 50) {
			Static78.method1217();
		}
		@Pc(124) int local124;
		if (Static69.anInt1255 != 0 && local102 < 50) {
			local124 = 50 - local102;
			while (local124 > Static220.anInt5202) {
				Static34.aByteArrayArray15[Static220.anInt5202] = new byte[102400];
				Static220.anInt5202++;
			}
			while (local124 < Static220.anInt5202) {
				Static220.anInt5202--;
				Static34.aByteArrayArray15[Static220.anInt5202] = null;
			}
		}
		if (local99 == null) {
			return;
		}
		this.anInt5079 = local99.method4973();
		@Pc(206) Class10_Sub4 local206;
		if (Static199.aBoolean275 && (this.aClass131_2.anInt3981 == -1 || Static218.method3602(this.aClass131_2.anInt3981).aBoolean265)) {
			local206 = Static34.method529(local76 == null ? local27 : local76, this.anInt5046, 0, 1, 240, local99, 160, this.anInt5016, this.anInt5073, this.aBoolean356, 0, local76 == null ? this.anInt5049 : this.anInt5025, arg0);
			if (Static283.aBoolean393) {
				@Pc(210) float local210 = Static283.method4632();
				@Pc(212) float local212 = Static283.method4667();
				Static283.method4641();
				Static283.method4628(local210, local212 - 150.0F);
				local206.method4982(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static283.method4653();
				Static283.method4628(local210, local212);
			} else {
				local206.method4982(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static136.aClass10_Sub5_Sub1_1 == this) {
			for (local124 = Static51.aClass121Array1.length - 1; local124 >= 0; local124--) {
				@Pc(268) Class121 local268 = Static51.aClass121Array1[local124];
				if (local268 != null && local268.anInt3692 != -1) {
					@Pc(306) int local306;
					@Pc(316) int local316;
					if (local268.anInt3691 == 1 && local268.anInt3690 >= 0 && local268.anInt3690 < Static110.aClass10_Sub5_Sub2Array1.length) {
						@Pc(294) Class10_Sub5_Sub2 local294 = Static110.aClass10_Sub5_Sub2Array1[local268.anInt3690];
						if (local294 != null) {
							local306 = local294.anInt5073 / 32 - Static136.aClass10_Sub5_Sub1_1.anInt5073 / 32;
							local316 = local294.anInt5016 / 32 - Static136.aClass10_Sub5_Sub1_1.anInt5016 / 32;
							this.method3043(360000, local268.anInt3692, arg2, arg9, arg1, arg3, arg5, local99, arg0, local316, local306, arg6, arg4, null, arg7);
						}
					}
					if (local268.anInt3691 == 2) {
						@Pc(357) int local357 = (local268.anInt3703 - Static101.anInt1844) * 4 + 2 - Static136.aClass10_Sub5_Sub1_1.anInt5073 / 32;
						local316 = local268.anInt3698 * 4;
						local316 *= local316;
						local306 = (local268.anInt3696 - Static43.anInt798) * 4 + 2 - Static136.aClass10_Sub5_Sub1_1.anInt5016 / 32;
						this.method3043(local316, local268.anInt3692, arg2, arg9, arg1, arg3, arg5, local99, arg0, local306, local357, arg6, arg4, null, arg7);
					}
					if (local268.anInt3691 == 10 && local268.anInt3690 >= 0 && Static52.aClass10_Sub5_Sub1Array1.length > local268.anInt3690) {
						@Pc(419) Class10_Sub5_Sub1 local419 = Static52.aClass10_Sub5_Sub1Array1[local268.anInt3690];
						if (local419 != null) {
							local306 = local419.anInt5073 / 32 - Static136.aClass10_Sub5_Sub1_1.anInt5073 / 32;
							local316 = local419.anInt5016 / 32 - Static136.aClass10_Sub5_Sub1_1.anInt5016 / 32;
							this.method3043(360000, local268.anInt3692, arg2, arg9, arg1, arg3, arg5, local99, arg0, local316, local306, arg6, arg4, null, arg7);
						}
					}
				}
			}
		}
		this.method4205(local99);
		local206 = null;
		this.method4202(local99, arg0);
		if (!this.aBoolean258 && this.anInt5023 != -1 && this.anInt5047 != -1) {
			@Pc(492) Class173 local492 = Static297.method1843(this.anInt5023);
			local206 = local492.method4451(this.anInt5047, this.anInt5069, this.anInt5101);
			if (local206 != null) {
				local206.method1964(0, -this.anInt5033, 0);
				if (local492.aBoolean379) {
					if (Static36.anInt642 != 0) {
						local206.method1958(Static36.anInt642);
					}
					if (Static22.anInt423 != 0) {
						local206.method1947(Static22.anInt423);
					}
					if (Static50.anInt948 != 0) {
						local206.method1964(0, Static50.anInt948, 0);
					}
				}
			}
		}
		@Pc(538) Class10_Sub4 local538 = null;
		if (!this.aBoolean258 && this.anObject5 != null) {
			if (Static124.anInt2371 >= this.anInt5098) {
				this.anObject5 = null;
			}
			if (Static124.anInt2371 >= this.anInt5082 && Static124.anInt2371 < this.anInt5098) {
				if (this.anObject5 instanceof Class10_Sub6) {
					local538 = (Class10_Sub4) ((Class10_Sub6) this.anObject5).method4232();
				} else {
					local538 = (Class10_Sub4) this.anObject5;
				}
				local538.method1964(this.anInt5087 - this.anInt5073, -this.anInt5046 + this.anInt5055, this.anInt5089 - this.anInt5016);
				if (this.anInt5018 == 512) {
					local538.method1956();
				} else if (this.anInt5018 == 1024) {
					local538.method1942();
				} else if (this.anInt5018 == 1536) {
					local538.method1950();
				}
			}
		}
		if (Static283.aBoolean393) {
			this.method4203(local99, local206);
			local99.aBoolean171 = true;
			local99.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_4);
			if (local206 != null) {
				if (this.aClass47_Sub1_4 != null) {
					@Pc(659) Class10_Sub4_Sub1 local659 = (Class10_Sub4_Sub1) local206;
					this.aClass47_Sub1_4.method1089(local659.aClass190Array2, local659.aClass67Array2, true, local659.anIntArray174, local659.anIntArray177, local659.anIntArray173);
				}
				local206.aBoolean171 = true;
				local206.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_4);
			}
		} else {
			if (local206 != null) {
				local99 = ((Class10_Sub4_Sub2) local99).method1973(local206);
			}
			if (local538 != null) {
				local99 = ((Class10_Sub4_Sub2) local99).method1973(local538);
			}
			this.method4203(local99, local206);
			local99.aBoolean171 = true;
			local99.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_4);
		}
		if (local538 == null) {
			return;
		}
		if (this.anInt5018 == 512) {
			local538.method1950();
		} else if (this.anInt5018 == 1024) {
			local538.method1942();
		} else if (this.anInt5018 == 1536) {
			local538.method1956();
		}
		local538.method1964(this.anInt5073 - this.anInt5087, this.anInt5046 - this.anInt5055, this.anInt5016 - this.anInt5089);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method3045() {
		@Pc(9) String local9 = "";
		if (Static204.aStringArray27 != null) {
			local9 = local9 + Static204.aStringArray27[this.aByte17];
		}
		if (Static266.anIntArray564 != null && Static266.anIntArray564[this.aByte17] != -1) {
			@Pc(43) Class3_Sub4_Sub4 local43 = Static192.method3195(Static266.anIntArray564[this.aByte17]);
			if (local43.aChar2 == 's') {
				local9 = local9 + local43.method777(this.aByte18 & 0xFF);
			} else {
				Static42.method613("gdn1", new Throwable());
				Static266.anIntArray564[this.aByte17] = -1;
			}
		}
		local9 = local9 + this.aString125;
		if (Static235.aStringArray32 != null) {
			local9 = local9 + Static235.aStringArray32[this.aByte17];
		}
		return local9;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)I")
	@Override
	public int method4190() {
		return -1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBZ)V")
	public void method3047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		super.method4197(this.method4186(), arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!ug;IB)V")
	public void method3049(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt4615 = 0;
		@Pc(8) int local8 = arg0.method3915();
		@Pc(12) int local12 = local8 & 0x1;
		@Pc(24) boolean local24 = (local8 & 0x2) != 0;
		@Pc(35) boolean local35 = (local8 & 0x4) != 0;
		@Pc(39) int local39 = super.method4186();
		this.method4199((local8 >> 3 & 0x7) + 1);
		@Pc(51) int local51 = -1;
		@Pc(54) int[] local54 = new int[12];
		this.aByte17 = (byte) (local8 >> 6 & 0x3);
		this.anInt5073 += (this.method4186() - local39) * 64;
		this.anInt5016 += (this.method4186() - local39) * 64;
		this.aByte18 = arg0.method3920();
		this.anInt3582 = arg0.method3920();
		this.anInt3588 = arg0.method3920();
		this.anInt3568 = 0;
		@Pc(123) int local123;
		@Pc(139) int local139;
		@Pc(146) int local146;
		@Pc(185) int local185;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			local123 = arg0.method3915();
			if (local123 == 0) {
				local54[local114] = 0;
			} else {
				local139 = arg0.method3915();
				local146 = (local123 << 8) + local139;
				if (local114 == 0 && local146 == 65535) {
					local51 = arg0.method3948();
					this.anInt3568 = arg0.method3915();
					break;
				}
				if (local146 >= 32768) {
					local146 = Static95.anIntArray167[local146 - 32768];
					local54[local114] = local146 | 0x40000000;
					local185 = Static133.method2309(local146).anInt519;
					if (local185 != 0) {
						this.anInt3568 = local185;
					}
				} else {
					local54[local114] = Integer.MIN_VALUE | local146 - 256;
				}
			}
		}
		@Pc(210) int[] local210 = new int[5];
		for (local123 = 0; local123 < 5; local123++) {
			local139 = arg0.method3915();
			if (local139 < 0 || local139 >= Static263.aShortArrayArray8[local123].length) {
				local139 = 0;
			}
			local210[local123] = local139;
		}
		this.anInt5090 = arg0.method3948();
		this.aString125 = arg0.method3931();
		if (local24) {
			this.aString124 = arg0.method3931();
		} else {
			this.aString124 = this.aString125;
		}
		this.anInt3590 = arg0.method3915();
		if (local35) {
			this.anInt3566 = arg0.method3948();
			this.anInt3570 = -1;
			this.anInt3583 = this.anInt3590;
		} else {
			this.anInt3566 = 0;
			this.anInt3583 = arg0.method3915();
			this.anInt3570 = arg0.method3915();
			if (this.anInt3570 == 255) {
				this.anInt3570 = -1;
			}
		}
		local123 = this.anInt3587;
		this.anInt3587 = arg0.method3915();
		if (this.anInt3587 == 0) {
			Static50.method787(arg1, this);
		} else {
			local146 = this.anInt3577;
			local139 = this.anInt3591;
			local185 = this.anInt3575;
			@Pc(334) int local334 = this.anInt3585;
			@Pc(337) int local337 = this.anInt3578;
			this.anInt3591 = arg0.method3948();
			this.anInt3577 = arg0.method3948();
			this.anInt3575 = arg0.method3948();
			this.anInt3578 = arg0.method3948();
			this.anInt3585 = arg0.method3915();
			if (local123 != this.anInt3587 || this.anInt3591 != local139 || local146 != this.anInt3577 || this.anInt3575 != local185 || this.anInt3578 != local337 || this.anInt3585 != local334) {
				Static145.method2481(arg1, this);
			}
		}
		if (this.aClass131_2 == null) {
			this.aClass131_2 = new Class131();
		}
		local139 = this.aClass131_2.anInt3981;
		this.aClass131_2.method3358(this.anInt5090, local210, local54, local12 == 1, local51);
		if (local139 != local51) {
			this.anInt5073 = this.anIntArray537[0] * 128 + this.method4186() * 64;
			this.anInt5016 = this.anIntArray535[0] * 128 + this.method4186() * 64;
		}
		if (this.aClass47_Sub1_4 != null) {
			this.aClass47_Sub1_4.method1072();
		}
	}
}
