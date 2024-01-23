import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class9_Sub4_Sub1 extends Class9_Sub4 {

	@OriginalMember(owner = "client!f", name = "Qb", descriptor = "I")
	public int anInt1397;

	@OriginalMember(owner = "client!f", name = "Tb", descriptor = "I")
	public int anInt1400;

	@OriginalMember(owner = "client!f", name = "ac", descriptor = "I")
	public int anInt1405;

	@OriginalMember(owner = "client!f", name = "bc", descriptor = "I")
	public int anInt1406;

	@OriginalMember(owner = "client!f", name = "cc", descriptor = "Lclient!cf;")
	public Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!f", name = "dc", descriptor = "I")
	public int anInt1407;

	@OriginalMember(owner = "client!f", name = "ec", descriptor = "Lclient!kh;")
	public Class60 aClass60_414;

	@OriginalMember(owner = "client!f", name = "gc", descriptor = "Lclient!ij;")
	public Class50 aClass50_2;

	@OriginalMember(owner = "client!f", name = "jc", descriptor = "I")
	public int anInt1410;

	@OriginalMember(owner = "client!f", name = "wc", descriptor = "I")
	public int anInt1419;

	@OriginalMember(owner = "client!f", name = "Wb", descriptor = "S")
	private short aShort12 = 0;

	@OriginalMember(owner = "client!f", name = "Xb", descriptor = "I")
	public int anInt1403 = -1;

	@OriginalMember(owner = "client!f", name = "Rb", descriptor = "I")
	public int anInt1398 = 0;

	@OriginalMember(owner = "client!f", name = "Zb", descriptor = "I")
	public int anInt1404 = -1;

	@OriginalMember(owner = "client!f", name = "Ob", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!f", name = "hc", descriptor = "I")
	public int anInt1409 = 0;

	@OriginalMember(owner = "client!f", name = "ic", descriptor = "S")
	private short aShort13 = 0;

	@OriginalMember(owner = "client!f", name = "tc", descriptor = "I")
	public int anInt1417 = 0;

	@OriginalMember(owner = "client!f", name = "mc", descriptor = "I")
	public int anInt1412 = 0;

	@OriginalMember(owner = "client!f", name = "uc", descriptor = "I")
	public int anInt1418 = 0;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2907() {
		return this.aClass50_2 != null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!cf;IIIIIIIIII)V")
	private void method1012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(16) int local16 = arg4 * arg4 + arg5 * arg5;
		if (local16 < 16 || local16 > 360000) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg4, (double) arg5) * 325.949D) & 0x7FF;
		@Pc(48) Class9_Sub2 local48 = Static68.method1233(arg2, local34, super.anInt3925, super.anInt3927, super.anInt3903, arg10);
		if (local48 != null) {
			local48.method2903(0, arg8, arg11, arg1, arg7, arg6, arg0, arg3, -1L);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!nc;)V")
	public void method1015(@OriginalArg(1) Class1_Sub9 arg0) {
		arg0.anInt1192 = 0;
		@Pc(12) int local12 = arg0.method895();
		@Pc(14) int local14 = -1;
		if ((local12 & 0x2) == 2) {
			this.aShort13 = (short) (arg0.method895() << 2);
			this.aShort12 = (short) (arg0.method895() << 2);
		} else {
			this.aShort13 = 0;
			this.aShort12 = 0;
		}
		@Pc(53) boolean local53 = (local12 & 0x4) != 0;
		super.anInt3937 = (local12 >> 3) + 1;
		@Pc(64) int local64 = local12 & 0x1;
		@Pc(67) int[] local67 = new int[12];
		this.anInt1403 = arg0.method891();
		this.anInt1404 = arg0.method891();
		this.anInt1398 = 0;
		@Pc(118) int local118;
		@Pc(125) int local125;
		for (@Pc(100) int local100 = 0; local100 < 12; local100++) {
			@Pc(106) int local106 = arg0.method895();
			if (local106 == 0) {
				local67[local100] = 0;
			} else {
				local118 = arg0.method895();
				local125 = (local106 << 8) + local118;
				if (local100 == 0 && local125 == 65535) {
					local14 = arg0.method946();
					break;
				}
				if (local125 >= 32768) {
					local125 = Static186.anIntArray516[local125 - 32768];
					local67[local100] = local125 | 0x40000000;
					@Pc(159) int local159 = Static191.method2990(local125).anInt2979;
					if (local159 != 0) {
						this.anInt1398 = local159;
					}
				} else {
					local67[local100] = local125 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(184) int[] local184 = new int[5];
		for (local118 = 0; local118 < 5; local118++) {
			local125 = arg0.method895();
			if (local125 < 0 || local125 >= Static190.aShortArrayArray7[local118].length) {
				local125 = 0;
			}
			local184[local118] = local125;
		}
		super.anInt3932 = arg0.method946();
		if (super.anInt3932 == 65535) {
			super.anInt3932 = -1;
		}
		super.anInt3947 = arg0.method946();
		if (super.anInt3947 == 65535) {
			super.anInt3947 = -1;
		}
		super.anInt3931 = super.anInt3947;
		super.anInt3938 = arg0.method946();
		if (super.anInt3938 == 65535) {
			super.anInt3938 = -1;
		}
		super.anInt3928 = arg0.method946();
		if (super.anInt3928 == 65535) {
			super.anInt3928 = -1;
		}
		super.anInt3919 = arg0.method946();
		if (super.anInt3919 == 65535) {
			super.anInt3919 = -1;
		}
		super.anInt3942 = arg0.method946();
		if (super.anInt3942 == 65535) {
			super.anInt3942 = -1;
		}
		super.anInt3923 = arg0.method946();
		if (super.anInt3923 == 65535) {
			super.anInt3923 = -1;
		}
		this.aClass60_414 = Static144.method2484(arg0.method909()).method1812();
		this.anInt1412 = arg0.method895();
		if (local53) {
			this.anInt1417 = arg0.method946();
		} else {
			this.anInt1417 = 0;
		}
		if (this.aClass50_2 == null) {
			this.aClass50_2 = new Class50();
		}
		this.aClass50_2.method1520(local64 == 1, local67, local184, local14);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		return super.anInt3936;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass50_2 == null) {
			return;
		}
		@Pc(24) Class1_Sub1_Sub21 local24 = super.anInt3896 != -1 && super.anInt3906 == 0 ? Static74.method1343(super.anInt3896) : null;
		@Pc(45) Class1_Sub1_Sub21 local45 = super.anInt3905 == -1 || this.aBoolean71 || super.anInt3932 == super.anInt3905 && local24 != null ? null : Static74.method1343(super.anInt3905);
		@Pc(56) Class9_Sub2 local56 = this.aClass50_2.method1526(local24, super.anInt3948, super.anInt3897, local45);
		if (local56 == null) {
			return;
		}
		super.anInt3936 = local56.method2902();
		@Pc(71) int local71;
		@Pc(118) int local118;
		@Pc(129) int local129;
		@Pc(167) int local167;
		if (Static84.aClass9_Sub4_Sub1_2 == this) {
			for (local71 = Static77.aClass94Array1.length - 1; local71 >= 0; local71--) {
				@Pc(77) Class94 local77 = Static77.aClass94Array1[local71];
				if (local77 != null && local77.anInt3974 != -1) {
					if (local77.anInt3978 == 1 && local77.anInt3970 >= 0 && Static1.aClass9_Sub4_Sub2Array1.length > local77.anInt3970) {
						@Pc(105) Class9_Sub4_Sub2 local105 = Static1.aClass9_Sub4_Sub2Array1[local77.anInt3970];
						if (local105 != null) {
							local118 = local105.anInt3925 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
							local129 = local105.anInt3903 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
							this.method1012(arg6, arg3, local56, arg7, local118, local129, arg5, arg4, arg1, arg0, local77.anInt3974, arg2);
						}
					}
					if (local77.anInt3978 == 2) {
						local167 = (local77.anInt3966 - Static128.anInt2813) * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
						local118 = (local77.anInt3969 - Static163.anInt3587) * 4 + 2 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
						this.method1012(arg6, arg3, local56, arg7, local167, local118, arg5, arg4, arg1, arg0, local77.anInt3974, arg2);
					}
					if (local77.anInt3978 == 10 && local77.anInt3970 >= 0 && Static41.aClass9_Sub4_Sub1Array2.length > local77.anInt3970) {
						@Pc(217) Class9_Sub4_Sub1 local217 = Static41.aClass9_Sub4_Sub1Array2[local77.anInt3970];
						if (local217 != null) {
							local129 = local217.anInt3903 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3903 / 32;
							local118 = local217.anInt3925 / 32 - Static84.aClass9_Sub4_Sub1_2.anInt3925 / 32;
							this.method1012(arg6, arg3, local56, arg7, local118, local129, arg5, arg4, arg1, arg0, local77.anInt3974, arg2);
						}
					}
				}
			}
		}
		local71 = 0;
		@Pc(267) int local267 = 0;
		local167 = 0;
		if (this.aShort13 != 0 && this.aShort12 != 0) {
			local118 = Class46.anIntArray226[arg0];
			local129 = Class46.anIntArray225[arg0];
			@Pc(289) short local289 = this.aShort12;
			@Pc(294) int local294 = -local289 / 2;
			@Pc(297) short local297 = this.aShort13;
			@Pc(302) int local302 = -local297 / 2;
			@Pc(313) int local313 = local294 * local118 + local302 * local129 >> 16;
			@Pc(324) int local324 = local129 * local294 - local302 * local118 >> 16;
			@Pc(336) int local336 = Static165.method2268(local324 + super.anInt3903, Static180.anInt3841, local313 + super.anInt3925);
			@Pc(341) int local341 = -local289 / 2;
			@Pc(345) int local345 = local297 / 2;
			@Pc(355) int local355 = local129 * local345 + local341 * local118 >> 16;
			@Pc(360) int local360 = -local297 / 2;
			@Pc(370) int local370 = local129 * local341 - local345 * local118 >> 16;
			@Pc(382) int local382 = Static165.method2268(local370 + super.anInt3903, Static180.anInt3841, local355 + super.anInt3925);
			@Pc(386) int local386 = local289 / 2;
			@Pc(397) int local397 = local386 * local129 - local118 * local360 >> 16;
			@Pc(407) int local407 = local360 * local129 + local118 * local386 >> 16;
			@Pc(420) int local420 = Static165.method2268(super.anInt3903 + local397, Static180.anInt3841, local407 + super.anInt3925);
			@Pc(424) int local424 = local297 / 2;
			@Pc(428) int local428 = local289 / 2;
			@Pc(438) int local438 = local428 * local129 - local424 * local118 >> 16;
			@Pc(449) int local449 = local118 * local428 + local424 * local129 >> 16;
			@Pc(461) int local461 = Static165.method2268(local438 + super.anInt3903, Static180.anInt3841, local449 + super.anInt3925);
			@Pc(472) int local472 = local382 > local336 ? local336 : local382;
			local167 = local461 + local336;
			@Pc(483) int local483 = local420 < local461 ? local420 : local461;
			if (local382 + local420 < local167) {
				local167 = local382 + local420;
			}
			local71 = (int) (Math.atan2((double) (local472 - local483), (double) local289) * 325.95D) & 0x7FF;
			if (local71 != 0) {
				local56.method1698(local71);
			}
			@Pc(530) int local530 = local336 >= local420 ? local420 : local336;
			@Pc(537) int local537 = local382 >= local461 ? local461 : local382;
			local267 = (int) (Math.atan2((double) (local530 - local537), (double) local297) * 325.95D) & 0x7FF;
			if (local267 != 0) {
				local56.method1702(local267);
			}
			local167 = (local167 >> 1) - super.anInt3927;
			if (local167 != 0) {
				local56.method1694(0, local167, 0);
			}
		}
		@Pc(574) Class9_Sub2 local574 = null;
		if (!this.aBoolean71 && super.anInt3914 != -1 && super.anInt3893 != -1) {
			@Pc(592) Class1_Sub1_Sub4 local592 = Static191.method2988(super.anInt3914);
			local574 = local592.method326(super.anInt3893);
			if (local574 != null) {
				local574.method1694(0, -super.anInt3934, 0);
				if (local592.aBoolean37) {
					if (local71 != 0) {
						local574.method1698(local71);
					}
					if (local267 != 0) {
						local574.method1702(local267);
					}
					if (local167 != 0) {
						local574.method1694(0, local167, 0);
					}
				}
			}
		}
		@Pc(632) Class9_Sub2 local632 = null;
		if (!this.aBoolean71 && this.aClass9_Sub2_1 != null) {
			if (this.anInt1409 <= Static42.anInt910) {
				this.aClass9_Sub2_1 = null;
			}
			if (Static42.anInt910 >= this.anInt1418 && Static42.anInt910 < this.anInt1409) {
				local632 = this.aClass9_Sub2_1;
				local632.method1694(this.anInt1410 - super.anInt3925, this.anInt1419 - super.anInt3927, this.anInt1406 - super.anInt3903);
				if (super.anInt3930 == 512) {
					local632.method1704();
				} else if (super.anInt3930 == 1024) {
					local632.method1708();
				} else if (super.anInt3930 == 1536) {
					local632.method1701();
				}
			}
		}
		if (local574 != null) {
			local56 = ((Class9_Sub2_Sub1) local56).method1715(local574);
		}
		if (local632 != null) {
			local56 = ((Class9_Sub2_Sub1) local56).method1715(local632);
		}
		local56.aBoolean122 = true;
		local56.method2903(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local632 == null) {
			return;
		}
		if (super.anInt3930 == 512) {
			local632.method1701();
		} else if (super.anInt3930 == 1024) {
			local632.method1708();
		} else if (super.anInt3930 == 1536) {
			local632.method1704();
		}
		local632.method1694(super.anInt3925 - this.anInt1410, super.anInt3927 + -this.anInt1419, super.anInt3903 - this.anInt1406);
	}
}
