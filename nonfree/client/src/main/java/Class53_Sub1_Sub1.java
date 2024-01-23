import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class53_Sub1_Sub1 extends Class53_Sub1 {

	@OriginalMember(owner = "client!f", name = "Oc", descriptor = "Ljava/lang/String;")
	public String aString88;

	@OriginalMember(owner = "client!f", name = "Tc", descriptor = "Lclient!qk;")
	public Class147 aClass147_2;

	@OriginalMember(owner = "client!f", name = "sc", descriptor = "I")
	public int anInt1576 = 0;

	@OriginalMember(owner = "client!f", name = "Ac", descriptor = "I")
	public int anInt1584 = 0;

	@OriginalMember(owner = "client!f", name = "wc", descriptor = "I")
	public int anInt1580 = -1;

	@OriginalMember(owner = "client!f", name = "yc", descriptor = "I")
	public int anInt1582 = 0;

	@OriginalMember(owner = "client!f", name = "Cc", descriptor = "I")
	public int anInt1586 = -1;

	@OriginalMember(owner = "client!f", name = "pc", descriptor = "I")
	public int anInt1573 = -1;

	@OriginalMember(owner = "client!f", name = "Dc", descriptor = "I")
	public int anInt1587 = 255;

	@OriginalMember(owner = "client!f", name = "zc", descriptor = "I")
	public int anInt1583 = -1;

	@OriginalMember(owner = "client!f", name = "Lc", descriptor = "I")
	public int anInt1593 = 0;

	@OriginalMember(owner = "client!f", name = "Fc", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!f", name = "Gc", descriptor = "I")
	public int anInt1589 = -1;

	@OriginalMember(owner = "client!f", name = "Ec", descriptor = "I")
	public int anInt1588 = -1;

	@OriginalMember(owner = "client!f", name = "Jc", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!f", name = "Qc", descriptor = "I")
	public int anInt1597 = 0;

	@OriginalMember(owner = "client!f", name = "Pc", descriptor = "I")
	public int anInt1596 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fd;B)V")
	public void method1170(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.anInt5713 = 0;
		@Pc(16) int local16 = -1;
		@Pc(20) int local20 = arg0.method4666();
		@Pc(31) boolean local31 = (local20 & 0x4) != 0;
		@Pc(35) int local35 = local20 & 0x1;
		@Pc(41) int local41 = super.method3324();
		this.method3329((local20 >> 3 & 0x7) + 1);
		this.aByte3 = (byte) (local20 >> 6 & 0x3);
		@Pc(64) int[] local64 = new int[12];
		this.anInt3974 += (this.method3324() - local41) * 64;
		this.anInt4002 += (this.method3324() - local41) * 64;
		this.anInt1573 = arg0.method4674();
		this.anInt1596 = arg0.method4674();
		this.anInt1593 = 0;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(136) int local136;
		@Pc(176) int local176;
		for (@Pc(107) int local107 = 0; local107 < 12; local107++) {
			local116 = arg0.method4666();
			if (local116 == 0) {
				local64[local107] = 0;
			} else {
				local129 = arg0.method4666();
				local136 = (local116 << 8) + local129;
				if (local107 == 0 && local136 == 65535) {
					local16 = arg0.method4653();
					this.anInt1593 = arg0.method4666();
					break;
				}
				if (local136 >= 32768) {
					local136 = Static263.anIntArray545[local136 - 32768];
					local64[local107] = local136 | 0x40000000;
					local176 = Static287.method4398(local136).anInt5100;
					if (local176 != 0) {
						this.anInt1593 = local176;
					}
				} else {
					local64[local107] = Integer.MIN_VALUE | local136 - 256;
				}
			}
		}
		@Pc(199) int[] local199 = new int[5];
		for (local116 = 0; local116 < 5; local116++) {
			local129 = arg0.method4666();
			if (local129 < 0 || Static258.aShortArrayArray6[local116].length <= local129) {
				local129 = 0;
			}
			local199[local116] = local129;
		}
		this.anInt3986 = arg0.method4653();
		@Pc(242) long local242 = arg0.method4659();
		this.aString88 = Static216.method3514(local242);
		this.anInt1597 = arg0.method4666();
		if (local31) {
			this.anInt1584 = arg0.method4653();
			this.anInt1576 = this.anInt1597;
			this.anInt1586 = -1;
		} else {
			this.anInt1584 = 0;
			this.anInt1576 = arg0.method4666();
			this.anInt1586 = arg0.method4666();
			if (this.anInt1586 == 255) {
				this.anInt1586 = -1;
			}
		}
		local136 = this.anInt1582;
		this.anInt1582 = arg0.method4666();
		if (this.anInt1582 == 0) {
			Static47.method739(this);
		} else {
			@Pc(304) int local304 = this.anInt1583;
			local176 = this.anInt1588;
			@Pc(310) int local310 = this.anInt1580;
			@Pc(313) int local313 = this.anInt1589;
			@Pc(316) int local316 = this.anInt1587;
			this.anInt1588 = arg0.method4653();
			this.anInt1583 = arg0.method4653();
			this.anInt1580 = arg0.method4653();
			this.anInt1589 = arg0.method4653();
			this.anInt1587 = arg0.method4666();
			if (this.anInt1582 != local136 || local176 != this.anInt1588 || local304 != this.anInt1583 || this.anInt1580 != local310 || this.anInt1589 != local313 || this.anInt1587 != local316) {
				Static27.method383(this);
			}
		}
		if (this.aClass147_2 == null) {
			this.aClass147_2 = new Class147();
		}
		local176 = this.aClass147_2.anInt4388;
		this.aClass147_2.method3647(local16, local64, this.anInt3986, local199, local35 == 1);
		if (local16 != local176) {
			this.anInt3974 = this.anIntArray422[0] * 128 + this.method3324() * 64;
			this.anInt4002 = this.anIntArray426[0] * 128 + this.method3324() * 64;
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2965();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()I")
	@Override
	public int method3850() {
		return this.anInt4016;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean285) {
			if (this.aClass147_2 == null) {
				return;
			}
			@Pc(26) Class46 local26 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static156.method2501(this.anInt4007) : null;
			@Pc(55) Class46 local55 = this.anInt4005 == -1 || this.aBoolean98 || this.anInt4005 == this.method3327().anInt860 && local26 != null ? null : Static156.method2501(this.anInt4005);
			@Pc(78) Class53_Sub4 local78 = this.aClass147_2.method3645(this.aClass153Array3, this.anInt4046, this.anInt4011, this.anInt4019, local55, this.anInt3970, false, this.anInt4000, local26, false, this.anInt4044);
			if (local78 == null) {
				return;
			}
			this.method3328(local78, null);
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2962(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
	@Override
	protected int method3316() {
		return this.anInt3986;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (this.aClass147_2 == null) {
			return;
		}
		@Pc(27) Class46 local27 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static156.method2501(this.anInt4007) : null;
		@Pc(31) Class34 local31 = this.method3327();
		@Pc(53) boolean local53 = local31.anInt844 != 0 || local31.anInt847 != 0 || local31.anInt850 != 0 || local31.anInt851 != 0;
		@Pc(82) Class46 local82 = this.anInt4005 == -1 || this.aBoolean98 || this.anInt4005 == this.method3327().anInt860 && local27 != null ? null : Static156.method2501(this.anInt4005);
		@Pc(105) Class53_Sub4 local105 = this.aClass147_2.method3645(this.aClass153Array3, this.anInt4046, this.anInt4011, this.anInt4019, local82, this.anInt3970, local53, this.anInt4000, local27, true, this.anInt4044);
		@Pc(108) int local108 = Static75.method1228();
		if (Static94.aBoolean138 && Static164.anInt3256 < 96 && local108 > 50) {
			Static160.method2580();
		}
		@Pc(134) int local134;
		if (Static298.anInt5544 != 0 && local108 < 50) {
			local134 = 50 - local108;
			while (Static290.anInt5426 < local134) {
				Static227.aByteArrayArray35[Static290.anInt5426] = new byte[102400];
				Static290.anInt5426++;
			}
			while (local134 < Static290.anInt5426) {
				Static290.anInt5426--;
				Static227.aByteArrayArray35[Static290.anInt5426] = null;
			}
		}
		if (local105 == null) {
			return;
		}
		this.anInt4016 = local105.method3850();
		@Pc(222) Class53_Sub4 local222;
		if (Static66.aBoolean75 && (this.aClass147_2.anInt4388 == -1 || Static84.method1495(this.aClass147_2.anInt4388).aBoolean355)) {
			local222 = Static48.method745(0, local82 == null ? local27 : local82, arg0, 1, 240, local105, local82 == null ? this.anInt3970 : this.anInt4046, this.anInt4006, this.anInt4002, this.aBoolean284, 0, 160, this.anInt3974);
			if (Static94.aBoolean138) {
				@Pc(241) float local241 = Static94.method1620();
				@Pc(243) float local243 = Static94.method1612();
				Static94.method1589();
				Static94.method1621(local241, local243 - 150.0F);
				local222.method3842(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static94.method1591();
				Static94.method1621(local241, local243);
			} else {
				local222.method3842(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static154.aClass53_Sub1_Sub1_2 == this) {
			for (local134 = Static305.aClass95Array1.length - 1; local134 >= 0; local134--) {
				@Pc(282) Class95 local282 = Static305.aClass95Array1[local134];
				if (local282 != null && local282.anInt2563 != -1) {
					@Pc(329) int local329;
					@Pc(339) int local339;
					if (local282.anInt2561 == 1 && local282.anInt2560 >= 0 && local282.anInt2560 < Static110.aClass53_Sub1_Sub2Array1.length) {
						@Pc(315) Class53_Sub1_Sub2 local315 = Static110.aClass53_Sub1_Sub2Array1[local282.anInt2560];
						if (local315 != null) {
							local329 = local315.anInt3974 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							local339 = local315.anInt4002 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							this.method1175(arg3, local339, null, arg2, arg9, arg1, arg0, arg5, local329, arg6, local282.anInt2563, arg4, 360000, local105, arg7);
						}
					}
					if (local282.anInt2561 == 2) {
						@Pc(378) int local378 = (local282.anInt2558 - Static220.anInt3983) * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
						local329 = (local282.anInt2565 - Static295.anInt5480) * 4 + 2 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
						local339 = local282.anInt2562 * 4;
						local339 *= local339;
						this.method1175(arg3, local329, null, arg2, arg9, arg1, arg0, arg5, local378, arg6, local282.anInt2563, arg4, local339, local105, arg7);
					}
					if (local282.anInt2561 == 10 && local282.anInt2560 >= 0 && Static182.aClass53_Sub1_Sub1Array1.length > local282.anInt2560) {
						@Pc(442) Class53_Sub1_Sub1 local442 = Static182.aClass53_Sub1_Sub1Array1[local282.anInt2560];
						if (local442 != null) {
							local329 = local442.anInt3974 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt3974 / 32;
							local339 = local442.anInt4002 / 32 - Static154.aClass53_Sub1_Sub1_2.anInt4002 / 32;
							this.method1175(arg3, local339, null, arg2, arg9, arg1, arg0, arg5, local329, arg6, local282.anInt2563, arg4, 360000, local105, arg7);
						}
					}
				}
			}
		}
		this.method3318(local105);
		local222 = null;
		this.method3325(local105, arg0);
		if (!this.aBoolean98 && this.anInt3961 != -1 && this.anInt4026 != -1) {
			@Pc(518) Class112 local518 = Static132.method2005(this.anInt3961);
			local222 = local518.method2582(this.anInt3976, this.anInt3968, this.anInt4026);
			if (local222 != null) {
				local222.method3860(0, -this.anInt3971, 0);
				if (local518.aBoolean221) {
					if (Static185.anInt3525 != 0) {
						local222.method3869(Static185.anInt3525);
					}
					if (Static258.anInt4908 != 0) {
						local222.method3854(Static258.anInt4908);
					}
					if (Static143.anInt2747 != 0) {
						local222.method3860(0, Static143.anInt2747, 0);
					}
				}
			}
		}
		@Pc(572) Class53_Sub4 local572 = null;
		if (!this.aBoolean98 && this.anObject5 != null) {
			if (this.anInt4010 <= Static50.anInt954) {
				this.anObject5 = null;
			}
			if (this.anInt4042 <= Static50.anInt954 && Static50.anInt954 < this.anInt4010) {
				if (this.anObject5 instanceof Class53_Sub7) {
					local572 = (Class53_Sub4) ((Class53_Sub7) this.anObject5).method3772();
				} else {
					local572 = (Class53_Sub4) this.anObject5;
				}
				local572.method3860(this.anInt4032 - this.anInt3974, this.anInt3975 + -this.anInt4006, this.anInt4027 - this.anInt4002);
				if (this.anInt4017 == 512) {
					local572.method3864();
				} else if (this.anInt4017 == 1024) {
					local572.method3865();
				} else if (this.anInt4017 == 1536) {
					local572.method3857();
				}
			}
		}
		if (Static94.aBoolean138) {
			this.method3328(local105, local222);
			local105.aBoolean325 = true;
			local105.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			if (local222 != null) {
				if (this.aClass20_Sub3_6 != null) {
					@Pc(736) Class53_Sub4_Sub2 local736 = (Class53_Sub4_Sub2) local222;
					this.aClass20_Sub3_6.method2980(local736.aClass161Array3, local736.aClass170Array3, true, local736.anIntArray507, local736.anIntArray504, local736.anIntArray502);
				}
				local222.aBoolean325 = true;
				local222.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			}
		} else {
			if (local222 != null) {
				local105 = ((Class53_Sub4_Sub1) local105).method2916(local222);
			}
			if (local572 != null) {
				local105 = ((Class53_Sub4_Sub1) local105).method2916(local572);
			}
			this.method3328(local105, local222);
			local105.aBoolean325 = true;
			local105.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
		}
		if (local572 == null) {
			return;
		}
		if (this.anInt4017 == 512) {
			local572.method3857();
		} else if (this.anInt4017 == 1024) {
			local572.method3865();
		} else if (this.anInt4017 == 1536) {
			local572.method3864();
		}
		local572.method3860(this.anInt3974 - this.anInt4032, this.anInt4006 - this.anInt3975, this.anInt4002 - this.anInt4027);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3323() {
		return this.aClass147_2 != null;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1173() {
		@Pc(11) String local11 = this.aString88;
		if (Static296.aStringArray38 != null) {
			local11 = Static296.aStringArray38[this.aByte3] + local11;
		}
		if (Static87.aStringArray42 != null) {
			local11 = local11 + Static87.aStringArray42[this.aByte3];
		}
		return local11;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)I")
	@Override
	public int method3324() {
		return this.aClass147_2 == null || this.aClass147_2.anInt4388 == -1 ? super.method3324() : Static84.method1495(this.aClass147_2.anInt4388).anInt5263;
	}

	@OriginalMember(owner = "client!f", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2971();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZBI)V")
	public void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		super.method3314(arg0, this.method3324(), arg2, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!ne;IIIIIIIIBIILclient!vg;I)V")
	private void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class53_Sub4 arg13, @OriginalArg(15) int arg14) {
		@Pc(15) int local15 = arg8 * arg8 + arg1 * arg1;
		if (local15 < 16 || local15 > arg12) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg8, (double) arg1) * 325.949D) & 0x7FF;
		@Pc(51) Class53_Sub4 local51 = Static211.method3440(local39, arg13, this.anInt4002, arg10, this.anInt4006, this.anInt3974);
		if (local51 == null) {
			return;
		}
		if (!Static94.aBoolean138) {
			local51.method3842(0, arg5, arg3, arg0, arg11, arg7, arg9, arg14, -1L, arg4, arg2);
			return;
		}
		@Pc(59) float local59 = Static94.method1620();
		@Pc(61) float local61 = Static94.method1612();
		Static94.method1589();
		Static94.method1621(local59, local61 - 150.0F);
		local51.method3842(0, arg5, arg3, arg0, arg11, arg7, arg9, arg14, -1L, arg4, arg2);
		Static94.method1591();
		Static94.method1621(local59, local61);
	}
}
