import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!ai", name = "Kc", descriptor = "Lclient!nj;")
	public Class94 aClass94_1;

	@OriginalMember(owner = "client!ai", name = "Sc", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!ai", name = "sc", descriptor = "I")
	public int anInt357 = 0;

	@OriginalMember(owner = "client!ai", name = "Hc", descriptor = "I")
	public int anInt370 = -1;

	@OriginalMember(owner = "client!ai", name = "uc", descriptor = "I")
	public int anInt359 = 0;

	@OriginalMember(owner = "client!ai", name = "zc", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ai", name = "tc", descriptor = "I")
	public int anInt358 = -1;

	@OriginalMember(owner = "client!ai", name = "Dc", descriptor = "I")
	public int anInt367 = 0;

	@OriginalMember(owner = "client!ai", name = "xc", descriptor = "I")
	public int anInt362 = 0;

	@OriginalMember(owner = "client!ai", name = "vc", descriptor = "I")
	public int anInt360 = -1;

	@OriginalMember(owner = "client!ai", name = "Gc", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!ai", name = "Rc", descriptor = "I")
	public int anInt379 = -1;

	@OriginalMember(owner = "client!ai", name = "Bc", descriptor = "I")
	public int anInt365 = -1;

	@OriginalMember(owner = "client!ai", name = "Jc", descriptor = "I")
	public int anInt372 = -1;

	@OriginalMember(owner = "client!ai", name = "rc", descriptor = "I")
	public int anInt356 = 0;

	@OriginalMember(owner = "client!ai", name = "Tc", descriptor = "I")
	public int anInt380 = 255;

	@OriginalMember(owner = "client!ai", name = "Fc", descriptor = "I")
	public int anInt369 = -1;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)I")
	@Override
	protected int method211() {
		return super.anInt432;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		return super.anInt482;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method219() {
		return this.aClass94_1 != null;
	}

	@OriginalMember(owner = "client!ai", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBIIIIIIIILclient!nl;IILclient!gh;)V")
	private void method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class96_Sub1 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class9_Sub5 arg14) {
		@Pc(12) int local12 = arg2 * arg2 + arg8 * arg8;
		if (local12 < 16 || local12 > arg0) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg2, (double) arg8) * 325.949D) & 0x7FF;
		@Pc(50) Class9_Sub5 local50 = Static152.method2729(super.anInt479, arg9, super.anInt401, arg14, super.anInt427, local38);
		if (local50 != null) {
			local50.method3588(0, arg1, arg10, arg5, arg4, arg3, arg13, arg7, -1L, arg6, arg11);
		}
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method184() {
		@Pc(2) String local2 = this.aString12;
		if (Static2.aStringArray1 != null) {
			local2 = Static2.aStringArray1[this.aByte1] + local2;
		}
		if (Static133.aStringArray26 != null) {
			local2 = local2 + Static133.aStringArray26[this.aByte1];
		}
		return local2;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)I")
	@Override
	public int method208() {
		return this.aClass94_1 == null || this.aClass94_1.anInt3806 == -1 ? super.method208() : Static155.method2756(this.aClass94_1.anInt3806).anInt2021;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ql;)V")
	public void method186(@OriginalArg(1) Class1_Sub13 arg0) {
		arg0.anInt2395 = 0;
		@Pc(12) int local12 = arg0.method1772();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(19) int[] local19 = new int[12];
		@Pc(30) boolean local30 = (local12 & 0x4) != 0;
		@Pc(34) int local34 = super.method208();
		@Pc(36) int local36 = -1;
		this.method212((local12 >> 3 & 0x7) + 1);
		this.aByte1 = (byte) (local12 >> 6 & 0x3);
		super.anInt427 += (this.method208() - local34) * 64;
		super.anInt479 += (this.method208() - local34) * 64;
		this.anInt372 = arg0.method1756();
		this.anInt358 = arg0.method1756();
		this.anInt362 = 0;
		@Pc(115) int local115;
		@Pc(121) int local121;
		for (@Pc(94) int local94 = 0; local94 < 12; local94++) {
			@Pc(100) int local100 = arg0.method1772();
			if (local100 == 0) {
				local19[local94] = 0;
			} else {
				local115 = arg0.method1772();
				local121 = local115 + (local100 << 8);
				if (local94 == 0 && local121 == 65535) {
					local36 = arg0.method1764();
					this.anInt362 = arg0.method1772();
					break;
				}
				if (local121 >= 32768) {
					local121 = Static242.anIntArray457[local121 - 32768];
					local19[local94] = local121 | 0x40000000;
					@Pc(162) int local162 = Static93.method2006(local121).anInt3665;
					if (local162 != 0) {
						this.anInt362 = local162;
					}
				} else {
					local19[local94] = local121 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(187) int[] local187 = new int[5];
		for (local115 = 0; local115 < 5; local115++) {
			local121 = arg0.method1772();
			if (local121 < 0 || local121 >= Static73.aShortArrayArray2[local115].length) {
				local121 = 0;
			}
			local187[local115] = local121;
		}
		super.anInt432 = arg0.method1764();
		@Pc(226) long local226 = arg0.method1810();
		this.aString12 = Static169.method2944(local226);
		this.anInt356 = arg0.method1772();
		if (local30) {
			this.anInt357 = arg0.method1764();
			this.anInt359 = this.anInt356;
			this.anInt365 = -1;
		} else {
			this.anInt357 = 0;
			this.anInt359 = arg0.method1772();
			this.anInt365 = arg0.method1772();
			if (this.anInt365 == 255) {
				this.anInt365 = -1;
			}
		}
		@Pc(275) int local275 = this.anInt367;
		this.anInt367 = arg0.method1772();
		@Pc(297) int local297;
		if (this.anInt367 == 0) {
			Static93.method2003(this);
		} else {
			@Pc(294) int local294 = this.anInt379;
			local297 = this.anInt360;
			@Pc(300) int local300 = this.anInt369;
			@Pc(303) int local303 = this.anInt370;
			@Pc(306) int local306 = this.anInt380;
			this.anInt360 = arg0.method1764();
			this.anInt379 = arg0.method1764();
			this.anInt370 = arg0.method1764();
			this.anInt369 = arg0.method1764();
			this.anInt380 = arg0.method1772();
			if (this.anInt367 != local275 || this.anInt360 != local297 || this.anInt379 != local294 || this.anInt370 != local303 || local300 != this.anInt369 || this.anInt380 != local306) {
				Static19.method359(this);
			}
		}
		if (this.aClass94_1 == null) {
			this.aClass94_1 = new Class94();
		}
		local297 = this.aClass94_1.anInt3806;
		this.aClass94_1.method2819(local19, local16 == 1, local187, local36, super.anInt432);
		if (local36 != local297) {
			super.anInt427 = super.anIntArray43[0] * 128 + this.method208() * 64;
			super.anInt479 = super.anIntArray41[0] * 128 + this.method208() * 64;
		}
		if (super.aClass96_Sub1_3 != null) {
			super.aClass96_Sub1_3.method2835();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBZ)V")
	public void method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		super.method206(this.method208(), arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
		if (this.aClass94_1 == null) {
			return;
		}
		@Pc(26) Class49 local26 = super.anInt443 != -1 && super.anInt399 == 0 ? Static131.method697(super.anInt443) : null;
		@Pc(49) Class49 local49 = super.anInt451 == -1 || this.aBoolean21 || super.anInt451 == this.method207().anInt2744 && local26 != null ? null : Static131.method697(super.anInt451);
		@Pc(71) Class9_Sub5 local71 = this.aClass94_1.method2825(super.anInt474, super.anInt407, super.anInt464, local26, local49, super.aClass83Array3, super.anInt422, super.anInt431, super.anInt450);
		@Pc(74) int local74 = Static83.method1672();
		@Pc(83) int local83;
		if (Static157.anInt3784 != 0 && local74 < 50) {
			local83 = 50 - local74;
			while (Static138.anInt3368 < local83) {
				Static243.aByteArrayArray12[Static138.anInt3368] = new byte[102400];
				Static138.anInt3368++;
			}
			while (local83 < Static138.anInt3368) {
				Static138.anInt3368--;
				Static243.aByteArrayArray12[Static138.anInt3368] = null;
			}
		}
		if (local71 == null) {
			return;
		}
		super.anInt482 = local71.method3587();
		@Pc(161) Class9_Sub5 local161;
		if (Static19.aBoolean37 && (this.aClass94_1.anInt3806 == -1 || Static155.method2756(this.aClass94_1.anInt3806).aBoolean119)) {
			local161 = Static24.method480(super.aBoolean23, 160, super.anInt427, local49 == null ? local26 : local49, local71, local49 == null ? super.anInt431 : super.anInt464, 0, 1, 240, arg0, 0, super.anInt401, super.anInt479);
			local161.method3588(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
		}
		if (Static83.aClass9_Sub1_Sub1_1 == this) {
			for (local83 = Static75.aClass116Array1.length - 1; local83 >= 0; local83--) {
				@Pc(188) Class116 local188 = Static75.aClass116Array1[local83];
				if (local188 != null && local188.anInt4409 != -1) {
					@Pc(232) int local232;
					@Pc(242) int local242;
					if (local188.anInt4410 == 1 && local188.anInt4406 >= 0 && Static36.aClass9_Sub1_Sub2Array2.length > local188.anInt4406) {
						@Pc(219) Class9_Sub1_Sub2 local219 = Static36.aClass9_Sub1_Sub2Array2[local188.anInt4406];
						if (local219 != null) {
							local232 = local219.anInt427 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
							local242 = local219.anInt479 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
							this.method180(360000, arg1, local232, arg5, arg4, arg3, arg9, arg7, local242, local188.anInt4409, arg2, null, arg0, arg6, local71);
						}
					}
					if (local188.anInt4410 == 2) {
						@Pc(281) int local281 = (local188.anInt4402 - Static64.anInt1786) * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
						local232 = (local188.anInt4405 - Static29.anInt907) * 4 + 2 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
						local242 = local188.anInt4401 * 4;
						local242 *= local242;
						this.method180(local242, arg1, local281, arg5, arg4, arg3, arg9, arg7, local232, local188.anInt4409, arg2, null, arg0, arg6, local71);
					}
					if (local188.anInt4410 == 10 && local188.anInt4406 >= 0 && Static147.aClass9_Sub1_Sub1Array1.length > local188.anInt4406) {
						@Pc(346) Class9_Sub1_Sub1 local346 = Static147.aClass9_Sub1_Sub1Array1[local188.anInt4406];
						if (local346 != null) {
							local242 = local346.anInt479 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt479 / 32;
							local232 = local346.anInt427 / 32 - Static83.aClass9_Sub1_Sub1_1.anInt427 / 32;
							this.method180(360000, arg1, local232, arg5, arg4, arg3, arg9, arg7, local242, local188.anInt4409, arg2, null, arg0, arg6, local71);
						}
					}
				}
			}
		}
		this.method214(local71);
		this.method213(local71, arg0);
		local161 = null;
		if (!this.aBoolean21 && super.anInt448 != -1 && super.anInt472 != -1) {
			@Pc(421) Class14 local421 = Static172.method2975(super.anInt448);
			local161 = local421.method332(super.anInt461, super.anInt472, super.anInt460);
			if (local161 != null) {
				local161.method3613(0, -super.anInt449, 0);
				if (local421.aBoolean34) {
					if (Static128.anInt3216 != 0) {
						local161.method3619(Static128.anInt3216);
					}
					if (Static65.anInt1817 != 0) {
						local161.method3614(Static65.anInt1817);
					}
					if (Static194.anInt4337 != 0) {
						local161.method3613(0, Static194.anInt4337, 0);
					}
				}
			}
		}
		@Pc(465) Class9_Sub5 local465 = null;
		if (!this.aBoolean21 && super.anObject3 != null) {
			if (Static156.anInt3722 >= super.anInt473) {
				super.anObject3 = null;
			}
			if (Static156.anInt3722 >= super.anInt441 && Static156.anInt3722 < super.anInt473) {
				if (super.anObject3 instanceof Class9_Sub4) {
					local465 = (Class9_Sub5) ((Class9_Sub4) super.anObject3).method1310();
				} else {
					local465 = (Class9_Sub5) super.anObject3;
				}
				local465.method3613(super.anInt400 - super.anInt427, super.anInt458 + -super.anInt401, super.anInt411 - super.anInt479);
				if (super.anInt418 == 512) {
					local465.method3612();
				} else if (super.anInt418 == 1024) {
					local465.method3618();
				} else if (super.anInt418 == 1536) {
					local465.method3626();
				}
			}
		}
		if (local161 != null) {
			local71 = ((Class9_Sub5_Sub1) local71).method3633(local161);
		}
		if (local465 != null) {
			local71 = ((Class9_Sub5_Sub1) local71).method3633(local465);
		}
		local71.aBoolean247 = true;
		local71.method3588(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.aClass96_Sub1_3);
		if (local465 == null) {
			return;
		}
		if (super.anInt418 == 512) {
			local465.method3626();
		} else if (super.anInt418 == 1024) {
			local465.method3618();
		} else if (super.anInt418 == 1536) {
			local465.method3612();
		}
		local465.method3613(-super.anInt400 + super.anInt427, -super.anInt458 + super.anInt401, super.anInt479 - super.anInt411);
	}
}
