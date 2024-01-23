import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 {

	@OriginalMember(owner = "client!kl", name = "Pc", descriptor = "Ljava/lang/String;")
	public String aString99;

	@OriginalMember(owner = "client!kl", name = "Sc", descriptor = "Lclient!ge;")
	public Class61 aClass61_2;

	@OriginalMember(owner = "client!kl", name = "kc", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!kl", name = "pc", descriptor = "I")
	public int anInt2998 = 0;

	@OriginalMember(owner = "client!kl", name = "rc", descriptor = "I")
	public int anInt3000 = -1;

	@OriginalMember(owner = "client!kl", name = "uc", descriptor = "I")
	public int anInt3003 = -1;

	@OriginalMember(owner = "client!kl", name = "mc", descriptor = "I")
	public int anInt2997 = -1;

	@OriginalMember(owner = "client!kl", name = "xc", descriptor = "I")
	public int anInt3005 = 0;

	@OriginalMember(owner = "client!kl", name = "tc", descriptor = "I")
	public int anInt3002 = 0;

	@OriginalMember(owner = "client!kl", name = "Jc", descriptor = "I")
	public int anInt3015 = 0;

	@OriginalMember(owner = "client!kl", name = "Gc", descriptor = "I")
	public int anInt3012 = -1;

	@OriginalMember(owner = "client!kl", name = "Fc", descriptor = "I")
	public int anInt3011 = 255;

	@OriginalMember(owner = "client!kl", name = "vc", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!kl", name = "Mc", descriptor = "I")
	public int anInt3018 = -1;

	@OriginalMember(owner = "client!kl", name = "Qc", descriptor = "I")
	public int anInt3021 = -1;

	@OriginalMember(owner = "client!kl", name = "Ac", descriptor = "I")
	public int anInt3007 = -1;

	@OriginalMember(owner = "client!kl", name = "zc", descriptor = "I")
	public int anInt3006 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)I")
	@Override
	protected int method3351() {
		return this.anInt3803;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3354() {
		return this.aClass61_2 != null;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
	@Override
	public int method3347() {
		return this.aClass61_2 == null || this.aClass61_2.anInt1864 == -1 ? super.method3347() : Static275.method4210(this.aClass61_2.anInt1864).anInt5436;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()I")
	@Override
	public int method4297() {
		return this.anInt3793;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean335) {
			if (this.aClass61_2 == null) {
				return;
			}
			@Pc(27) Class152 local27 = this.anInt3864 != -1 && this.anInt3798 == 0 ? Static107.method2016(this.anInt3864) : null;
			@Pc(54) Class152 local54 = this.anInt3828 == -1 || this.aBoolean259 || this.anInt3828 == this.method3348().anInt869 && local27 != null ? null : Static107.method2016(this.anInt3828);
			@Pc(77) Class11_Sub1 local77 = this.aClass61_2.method1707(local27, this.anInt3799, this.anInt3847, false, local54, this.anInt3850, false, this.anInt3794, this.anInt3842, this.aClass14Array3, this.anInt3826);
			if (local77 == null) {
				return;
			}
			this.method3346(null, local77);
		}
		if (this.aClass22_Sub3_6 != null) {
			this.aClass22_Sub3_6.method972(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method2581(@OriginalArg(0) Class1_Sub13 arg0) {
		arg0.anInt2018 = 0;
		@Pc(8) int local8 = arg0.method1853();
		@Pc(23) boolean local23 = (local8 & 0x4) != 0;
		@Pc(27) int local27 = local8 & 0x1;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = new int[12];
		@Pc(38) int local38 = super.method3347();
		this.method3352((local8 >> 3 & 0x7) + 1);
		this.aByte8 = (byte) (local8 >> 6 & 0x3);
		this.anInt3865 += (this.method3347() - local38) * 64;
		this.anInt3856 += (this.method3347() - local38) * 64;
		this.anInt3012 = arg0.method1829();
		this.anInt3018 = arg0.method1829();
		this.anInt2998 = 0;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(173) int local173;
		for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
			local108 = arg0.method1853();
			if (local108 == 0) {
				local32[local99] = 0;
			} else {
				local122 = arg0.method1853();
				local128 = local122 + (local108 << 8);
				if (local99 == 0 && local128 == 65535) {
					local29 = arg0.method1879();
					this.anInt2998 = arg0.method1853();
					break;
				}
				if (local128 < 32768) {
					local32[local99] = local128 - 256 | Integer.MIN_VALUE;
				} else {
					local128 = Static166.anIntArray297[local128 - 32768];
					local32[local99] = local128 | 0x40000000;
					local173 = Static69.method1330(local128).anInt143;
					if (local173 != 0) {
						this.anInt2998 = local173;
					}
				}
			}
		}
		@Pc(194) int[] local194 = new int[5];
		for (local108 = 0; local108 < 5; local108++) {
			local122 = arg0.method1853();
			if (local122 < 0 || Static222.aShortArrayArray8[local108].length <= local122) {
				local122 = 0;
			}
			local194[local108] = local122;
		}
		this.anInt3803 = arg0.method1879();
		@Pc(236) long local236 = arg0.method1833();
		this.aString99 = Static69.method1333(local236);
		this.anInt3015 = arg0.method1853();
		if (local23) {
			this.anInt3002 = arg0.method1879();
			this.anInt3006 = this.anInt3015;
			this.anInt2997 = -1;
		} else {
			this.anInt3002 = 0;
			this.anInt3006 = arg0.method1853();
			this.anInt2997 = arg0.method1853();
			if (this.anInt2997 == 255) {
				this.anInt2997 = -1;
			}
		}
		local128 = this.anInt3005;
		this.anInt3005 = arg0.method1853();
		if (this.anInt3005 == 0) {
			Static275.method4211(this);
		} else {
			local173 = this.anInt3003;
			@Pc(306) int local306 = this.anInt3021;
			@Pc(309) int local309 = this.anInt3007;
			@Pc(312) int local312 = this.anInt3000;
			@Pc(315) int local315 = this.anInt3011;
			this.anInt3003 = arg0.method1879();
			this.anInt3021 = arg0.method1879();
			this.anInt3007 = arg0.method1879();
			this.anInt3000 = arg0.method1879();
			this.anInt3011 = arg0.method1853();
			if (this.anInt3005 != local128 || this.anInt3003 != local173 || local306 != this.anInt3021 || local309 != this.anInt3007 || this.anInt3000 != local312 || this.anInt3011 != local315) {
				Static101.method1951(this);
			}
		}
		if (this.aClass61_2 == null) {
			this.aClass61_2 = new Class61();
		}
		local173 = this.aClass61_2.anInt1864;
		this.aClass61_2.method1712(local27 == 1, local29, local194, this.anInt3803, local32);
		if (local29 != local173) {
			this.anInt3865 = this.anIntArray407[0] * 128 + this.method3347() * 64;
			this.anInt3856 = this.anIntArray406[0] * 128 + this.method3347() * 64;
		}
		if (this.aClass22_Sub3_6 != null) {
			this.aClass22_Sub3_6.method958();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	@Override
	public void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10) {
		if (this.aClass61_2 == null) {
			return;
		}
		@Pc(26) Class152 local26 = this.anInt3864 != -1 && this.anInt3798 == 0 ? Static107.method2016(this.anInt3864) : null;
		@Pc(30) Class28 local30 = this.method3348();
		@Pc(50) boolean local50 = local30.anInt865 != 0 || local30.anInt873 != 0 || local30.anInt866 != 0 || local30.anInt854 != 0;
		@Pc(75) Class152 local75 = this.anInt3828 == -1 || this.aBoolean259 || this.anInt3828 == this.method3348().anInt869 && local26 != null ? null : Static107.method2016(this.anInt3828);
		@Pc(98) Class11_Sub1 local98 = this.aClass61_2.method1707(local26, this.anInt3799, this.anInt3847, local50, local75, this.anInt3850, true, this.anInt3794, this.anInt3842, this.aClass14Array3, this.anInt3826);
		@Pc(101) int local101 = Static268.method4137();
		if (Static71.aBoolean165 && Static73.anInt1579 < 96 && local101 > 50) {
			Static207.method4490();
		}
		@Pc(130) int local130;
		if (Static106.anInt3751 != 0 && local101 < 50) {
			local130 = 50 - local101;
			while (Static206.anInt3976 < local130) {
				Static158.aByteArrayArray14[Static206.anInt3976] = new byte[102400];
				Static206.anInt3976++;
			}
			while (local130 < Static206.anInt3976) {
				Static206.anInt3976--;
				Static158.aByteArrayArray14[Static206.anInt3976] = null;
			}
		}
		if (local98 == null) {
			return;
		}
		this.anInt3793 = local98.method4297();
		@Pc(214) Class11_Sub1 local214;
		if (Static294.aBoolean109 && (this.aClass61_2.anInt1864 == -1 || Static275.method4210(this.aClass61_2.anInt1864).aBoolean513)) {
			local214 = Static53.method980(this.aBoolean338, arg0, 0, 0, local98, this.anInt3865, 1, 160, local75 == null ? local26 : local75, this.anInt3856, local75 == null ? this.anInt3847 : this.anInt3799, 240, this.anInt3839);
			if (Static71.aBoolean165) {
				@Pc(233) float local233 = Static71.method1406();
				@Pc(235) float local235 = Static71.method1393();
				Static71.method1384();
				Static71.method1398(local233, local235 - 150.0F);
				local214.method4299(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static71.method1395();
				Static71.method1398(local233, local235);
			} else {
				local214.method4299(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static138.aClass11_Sub4_Sub1_3 == this) {
			for (local130 = Static160.aClass80Array1.length - 1; local130 >= 0; local130--) {
				@Pc(274) Class80 local274 = Static160.aClass80Array1[local130];
				if (local274 != null && local274.anInt2275 != -1) {
					@Pc(315) int local315;
					@Pc(325) int local325;
					if (local274.anInt2271 == 1 && local274.anInt2276 >= 0 && Static138.aClass11_Sub4_Sub2Array2.length > local274.anInt2276) {
						@Pc(302) Class11_Sub4_Sub2 local302 = Static138.aClass11_Sub4_Sub2Array2[local274.anInt2276];
						if (local302 != null) {
							local315 = local302.anInt3865 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
							local325 = local302.anInt3856 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
							this.method2582(arg3, 360000, local315, null, arg0, arg7, arg5, arg4, arg1, local325, arg9, local274.anInt2275, arg6, arg2, local98);
						}
					}
					if (local274.anInt2271 == 2) {
						local325 = local274.anInt2272 * 4;
						local325 *= local325;
						@Pc(375) int local375 = (local274.anInt2267 - Static38.anInt714) * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
						local315 = (local274.anInt2266 - Static135.anInt2659) * 4 + 2 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
						this.method2582(arg3, local325, local375, null, arg0, arg7, arg5, arg4, arg1, local315, arg9, local274.anInt2275, arg6, arg2, local98);
					}
					if (local274.anInt2271 == 10 && local274.anInt2276 >= 0 && local274.anInt2276 < Static14.aClass11_Sub4_Sub1Array1.length) {
						@Pc(435) Class11_Sub4_Sub1 local435 = Static14.aClass11_Sub4_Sub1Array1[local274.anInt2276];
						if (local435 != null) {
							local325 = local435.anInt3856 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3856 / 32;
							local315 = local435.anInt3865 / 32 - Static138.aClass11_Sub4_Sub1_3.anInt3865 / 32;
							this.method2582(arg3, 360000, local315, null, arg0, arg7, arg5, arg4, arg1, local325, arg9, local274.anInt2275, arg6, arg2, local98);
						}
					}
				}
			}
		}
		this.method3360(local98);
		this.method3350(local98, arg0);
		local214 = null;
		if (!this.aBoolean259 && this.anInt3857 != -1 && this.anInt3788 != -1) {
			@Pc(512) Class15 local512 = Static226.method3632(this.anInt3857);
			local214 = local512.method496(this.anInt3788, this.anInt3795, this.anInt3801);
			if (local214 != null) {
				local214.method2913(0, -this.anInt3805, 0);
				if (local512.aBoolean52) {
					if (Static223.anInt4195 != 0) {
						local214.method2896(Static223.anInt4195);
					}
					if (Static96.anInt2076 != 0) {
						local214.method2917(Static96.anInt2076);
					}
					if (Static83.anInt1854 != 0) {
						local214.method2913(0, Static83.anInt1854, 0);
					}
				}
			}
		}
		@Pc(562) Class11_Sub1 local562 = null;
		if (!this.aBoolean259 && this.anObject5 != null) {
			if (Static167.anInt637 >= this.anInt3841) {
				this.anObject5 = null;
			}
			if (Static167.anInt637 >= this.anInt3785 && Static167.anInt637 < this.anInt3841) {
				if (this.anObject5 instanceof Class11_Sub6) {
					local562 = (Class11_Sub1) ((Class11_Sub6) this.anObject5).method3561();
				} else {
					local562 = (Class11_Sub1) this.anObject5;
				}
				local562.method2913(this.anInt3815 - this.anInt3865, this.anInt3866 + -this.anInt3839, this.anInt3796 - this.anInt3856);
				if (this.anInt3853 == 512) {
					local562.method2920();
				} else if (this.anInt3853 == 1024) {
					local562.method2922();
				} else if (this.anInt3853 == 1536) {
					local562.method2918();
				}
			}
		}
		if (Static71.aBoolean165) {
			this.method3346(local214, local98);
			local98.aBoolean288 = true;
			local98.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_6);
			if (local214 != null) {
				if (this.aClass22_Sub3_6 != null) {
					@Pc(732) Class11_Sub1_Sub1 local732 = (Class11_Sub1_Sub1) local214;
					this.aClass22_Sub3_6.method971(local732.aClass146Array1, local732.aClass76Array1, true, local732.anIntArray46, local732.anIntArray45, local732.anIntArray41);
				}
				local214.aBoolean288 = true;
				local214.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_6);
			}
		} else {
			if (local214 != null) {
				local98 = ((Class11_Sub1_Sub2) local98).method2938(local214);
			}
			if (local562 != null) {
				local98 = ((Class11_Sub1_Sub2) local98).method2938(local562);
			}
			this.method3346(local214, local98);
			local98.aBoolean288 = true;
			local98.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_6);
		}
		if (local562 == null) {
			return;
		}
		if (this.anInt3853 == 512) {
			local562.method2918();
		} else if (this.anInt3853 == 1024) {
			local562.method2922();
		} else if (this.anInt3853 == 1536) {
			local562.method2920();
		}
		local562.method2913(this.anInt3865 - this.anInt3815, -this.anInt3866 + this.anInt3839, this.anInt3856 - this.anInt3796);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIILclient!dh;IIIIIIIIIBILclient!sm;)V")
	private void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class11_Sub1 arg14) {
		@Pc(11) int local11 = arg9 * arg9 + arg2 * arg2;
		if (local11 < 16 || arg1 < local11) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg2, (double) arg9) * 325.949D) & 0x7FF;
		@Pc(51) Class11_Sub1 local51 = Static135.method2346(arg11, this.anInt3865, local39, this.anInt3856, arg14, this.anInt3839);
		if (local51 == null) {
			return;
		}
		if (!Static71.aBoolean165) {
			local51.method4299(0, arg8, arg13, arg0, arg7, arg6, arg12, arg5, -1L, arg10, arg3);
			return;
		}
		@Pc(74) float local74 = Static71.method1406();
		@Pc(76) float local76 = Static71.method1393();
		Static71.method1384();
		Static71.method1398(local74, local76 - 150.0F);
		local51.method4299(0, arg8, arg13, arg0, arg7, arg6, arg12, arg5, -1L, arg10, arg3);
		Static71.method1395();
		Static71.method1398(local74, local76);
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method2583() {
		@Pc(6) String local6 = this.aString99;
		if (Static193.aStringArray23 != null) {
			local6 = Static193.aStringArray23[this.aByte8] + local6;
		}
		if (Static315.aStringArray38 != null) {
			local6 = local6 + Static315.aStringArray38[this.aByte8];
		}
		return local6;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIII)V")
	public void method2584(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.method3355(arg2, arg0, arg1, this.method3347());
	}

	@OriginalMember(owner = "client!kl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass22_Sub3_6 != null) {
			this.aClass22_Sub3_6.method955();
		}
	}
}
