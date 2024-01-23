import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class6_Sub6_Sub2 extends Class6_Sub6 {

	@OriginalMember(owner = "client!qm", name = "Dc", descriptor = "Ljava/lang/String;")
	public String aString147;

	@OriginalMember(owner = "client!qm", name = "Lc", descriptor = "Lclient!sk;")
	public Class149 aClass149_2;

	@OriginalMember(owner = "client!qm", name = "kc", descriptor = "I")
	public int anInt4585 = 0;

	@OriginalMember(owner = "client!qm", name = "rc", descriptor = "I")
	public int anInt4592 = -1;

	@OriginalMember(owner = "client!qm", name = "oc", descriptor = "I")
	public int anInt4589 = -1;

	@OriginalMember(owner = "client!qm", name = "uc", descriptor = "I")
	public int anInt4595 = 0;

	@OriginalMember(owner = "client!qm", name = "tc", descriptor = "I")
	public int anInt4594 = -1;

	@OriginalMember(owner = "client!qm", name = "zc", descriptor = "I")
	public int anInt4598 = -1;

	@OriginalMember(owner = "client!qm", name = "Bc", descriptor = "I")
	public int anInt4600 = 0;

	@OriginalMember(owner = "client!qm", name = "yc", descriptor = "I")
	public int anInt4597 = -1;

	@OriginalMember(owner = "client!qm", name = "Fc", descriptor = "I")
	public int anInt4602 = -1;

	@OriginalMember(owner = "client!qm", name = "Hc", descriptor = "I")
	public int anInt4604 = 255;

	@OriginalMember(owner = "client!qm", name = "Cc", descriptor = "I")
	public int anInt4601 = -1;

	@OriginalMember(owner = "client!qm", name = "sc", descriptor = "I")
	public int anInt4593 = 0;

	@OriginalMember(owner = "client!qm", name = "wc", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!qm", name = "Nc", descriptor = "I")
	public int anInt4609 = 0;

	@OriginalMember(owner = "client!qm", name = "Oc", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3514() {
		return this.aClass149_2 != null;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)I")
	@Override
	protected int method3505() {
		return this.anInt4546;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		if (this.aClass149_2 == null) {
			return;
		}
		@Pc(25) Class133 local25 = this.anInt4572 != -1 && this.anInt4506 == 0 ? Static262.method4031(this.anInt4572) : null;
		@Pc(51) Class133 local51 = this.anInt4544 == -1 || this.aBoolean344 || this.anInt4544 == this.method3503().anInt2197 && local25 != null ? null : Static262.method4031(this.anInt4544);
		@Pc(73) Class6_Sub2 local73 = this.aClass149_2.method3865(local25, this.aClass160Array3, this.anInt4507, this.anInt4570, this.anInt4549, this.anInt4526, local51, this.anInt4516, this.anInt4510);
		@Pc(76) int local76 = Static146.method2279();
		if (Static240.aBoolean369 && Static47.anInt5868 < 96 && local76 > 50) {
			Static17.method314();
		}
		@Pc(101) int local101;
		if (Static286.anInt5076 != 0 && local76 < 50) {
			local101 = 50 - local76;
			while (local101 > Static139.anInt2618) {
				Static94.aByteArrayArray6[Static139.anInt2618] = new byte[102400];
				Static139.anInt2618++;
			}
			while (local101 < Static139.anInt2618) {
				Static139.anInt2618--;
				Static94.aByteArrayArray6[Static139.anInt2618] = null;
			}
		}
		if (local73 == null) {
			return;
		}
		this.anInt4576 = local73.method3833();
		@Pc(189) Class6_Sub2 local189;
		if (Static97.aBoolean136 && (this.aClass149_2.anInt5039 == -1 || Static24.method424(this.aClass149_2.anInt5039).aBoolean57)) {
			local189 = Static108.method1717(arg0, local51 == null ? this.anInt4570 : this.anInt4526, this.aBoolean340, this.anInt4569, 0, local73, 160, this.anInt4562, local51 == null ? local25 : local51, 1, 240, this.anInt4533, 0);
			if (Static240.aBoolean369) {
				@Pc(193) float local193 = Static240.method3773();
				@Pc(195) float local195 = Static240.method3769();
				Static240.method3800();
				Static240.method3807(local193, local195 - 150.0F);
				local189.method3838(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static240.method3808();
				Static240.method3807(local193, local195);
			} else {
				local189.method3838(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static28.aClass6_Sub6_Sub2_1 == this) {
			for (local101 = Static187.aClass36Array1.length - 1; local101 >= 0; local101--) {
				@Pc(247) Class36 local247 = Static187.aClass36Array1[local101];
				if (local247 != null && local247.anInt1170 != -1) {
					@Pc(294) int local294;
					@Pc(304) int local304;
					if (local247.anInt1168 == 1 && local247.anInt1172 >= 0 && Static211.aClass6_Sub6_Sub1Array2.length > local247.anInt1172) {
						@Pc(279) Class6_Sub6_Sub1 local279 = Static211.aClass6_Sub6_Sub1Array2[local247.anInt1172];
						if (local279 != null) {
							local294 = local279.anInt4562 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
							local304 = local279.anInt4569 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
							this.method3521(local294, arg2, arg3, null, local73, arg1, arg4, arg5, arg9, arg6, arg0, local247.anInt1170, local304, 360000, arg7);
						}
					}
					if (local247.anInt1168 == 2) {
						local294 = (local247.anInt1159 - Static158.anInt2961) * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
						@Pc(357) int local357 = (local247.anInt1171 - Static224.anInt4695) * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
						local304 = local247.anInt1174 * 4;
						local304 *= local304;
						this.method3521(local357, arg2, arg3, null, local73, arg1, arg4, arg5, arg9, arg6, arg0, local247.anInt1170, local294, local304, arg7);
					}
					if (local247.anInt1168 == 10 && local247.anInt1172 >= 0 && Static77.aClass6_Sub6_Sub2Array1.length > local247.anInt1172) {
						@Pc(410) Class6_Sub6_Sub2 local410 = Static77.aClass6_Sub6_Sub2Array1[local247.anInt1172];
						if (local410 != null) {
							local294 = local410.anInt4562 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
							local304 = local410.anInt4569 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
							this.method3521(local294, arg2, arg3, null, local73, arg1, arg4, arg5, arg9, arg6, arg0, local247.anInt1170, local304, 360000, arg7);
						}
					}
				}
			}
		}
		this.method3504(local73);
		local189 = null;
		this.method3512(local73, arg0);
		if (!this.aBoolean344 && this.anInt4580 != -1 && this.anInt4578 != -1) {
			@Pc(489) Class25 local489 = Static280.method4295(this.anInt4580);
			local189 = local489.method711(this.anInt4525, this.anInt4571, this.anInt4578);
			if (local189 != null) {
				local189.method2073(0, -this.anInt4520, 0);
				if (local489.aBoolean79) {
					if (Static297.anInt5895 != 0) {
						local189.method2070(Static297.anInt5895);
					}
					if (Static299.anInt5916 != 0) {
						local189.method2085(Static299.anInt5916);
					}
					if (Static286.anInt5081 != 0) {
						local189.method2073(0, Static286.anInt5081, 0);
					}
				}
			}
		}
		@Pc(537) Class6_Sub2 local537 = null;
		if (!this.aBoolean344 && this.anObject6 != null) {
			if (Static261.anInt5259 >= this.anInt4518) {
				this.anObject6 = null;
			}
			if (Static261.anInt5259 >= this.anInt4534 && Static261.anInt5259 < this.anInt4518) {
				if (this.anObject6 instanceof Class6_Sub5) {
					local537 = (Class6_Sub2) ((Class6_Sub5) this.anObject6).method2831();
				} else {
					local537 = (Class6_Sub2) this.anObject6;
				}
				local537.method2073(this.anInt4530 - this.anInt4562, this.anInt4532 - this.anInt4533, this.anInt4531 - this.anInt4569);
				if (this.anInt4579 == 512) {
					local537.method2069();
				} else if (this.anInt4579 == 1024) {
					local537.method2089();
				} else if (this.anInt4579 == 1536) {
					local537.method2071();
				}
			}
		}
		if (Static240.aBoolean369) {
			local73.aBoolean176 = true;
			local73.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_6);
			if (local189 != null) {
				local189.aBoolean176 = true;
				local189.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_6);
			}
		} else {
			if (local189 != null) {
				local73 = ((Class6_Sub2_Sub1) local73).method590(local189);
			}
			if (local537 != null) {
				local73 = ((Class6_Sub2_Sub1) local73).method590(local537);
			}
			local73.aBoolean176 = true;
			local73.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_6);
		}
		if (local537 == null) {
			return;
		}
		if (this.anInt4579 == 512) {
			local537.method2071();
		} else if (this.anInt4579 == 1024) {
			local537.method2089();
		} else if (this.anInt4579 == 1536) {
			local537.method2069();
		}
		local537.method2073(this.anInt4562 - this.anInt4530, -this.anInt4532 + this.anInt4533, this.anInt4569 - this.anInt4531);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!jj;)V")
	public void method3516(@OriginalArg(1) Class1_Sub18 arg0) {
		arg0.anInt3911 = 0;
		@Pc(12) int local12 = arg0.method3122();
		@Pc(21) boolean local21 = (local12 & 0x4) != 0;
		@Pc(25) int local25 = super.method3509();
		@Pc(29) int local29 = local12 & 0x1;
		this.method3511((local12 >> 3 & 0x7) + 1);
		@Pc(41) int local41 = -1;
		@Pc(44) int[] local44 = new int[12];
		this.aByte20 = (byte) (local12 >> 6 & 0x3);
		this.anInt4562 += (this.method3509() - local25) * 64;
		this.anInt4569 += (this.method3509() - local25) * 64;
		this.anInt4601 = arg0.method3082();
		this.anInt4598 = arg0.method3082();
		this.anInt4600 = 0;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(122) int local122;
		@Pc(164) int local164;
		for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
			local102 = arg0.method3122();
			if (local102 == 0) {
				local44[local95] = 0;
			} else {
				local116 = arg0.method3122();
				local122 = local116 + (local102 << 8);
				if (local95 == 0 && local122 == 65535) {
					local41 = arg0.method3107();
					this.anInt4600 = arg0.method3122();
					break;
				}
				if (local122 >= 32768) {
					local122 = Static1.anIntArray1[local122 - 32768];
					local44[local95] = local122 | 0x40000000;
					local164 = Static183.method4458(local122).anInt3277;
					if (local164 != 0) {
						this.anInt4600 = local164;
					}
				} else {
					local44[local95] = local122 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(189) int[] local189 = new int[5];
		for (local102 = 0; local102 < 5; local102++) {
			local116 = arg0.method3122();
			if (local116 < 0 || local116 >= Static138.aShortArrayArray9[local102].length) {
				local116 = 0;
			}
			local189[local102] = local116;
		}
		this.anInt4546 = arg0.method3107();
		@Pc(229) long local229 = arg0.method3112();
		this.aString147 = Static266.method4096(local229);
		this.anInt4593 = arg0.method3122();
		if (local21) {
			this.anInt4585 = arg0.method3107();
			this.anInt4595 = this.anInt4593;
			this.anInt4592 = -1;
		} else {
			this.anInt4585 = 0;
			this.anInt4595 = arg0.method3122();
			this.anInt4592 = arg0.method3122();
			if (this.anInt4592 == 255) {
				this.anInt4592 = -1;
			}
		}
		local122 = this.anInt4609;
		this.anInt4609 = arg0.method3122();
		if (this.anInt4609 == 0) {
			Static112.method1750(this);
		} else {
			@Pc(302) int local302 = this.anInt4589;
			local164 = this.anInt4597;
			@Pc(308) int local308 = this.anInt4602;
			@Pc(311) int local311 = this.anInt4604;
			@Pc(314) int local314 = this.anInt4594;
			this.anInt4597 = arg0.method3107();
			this.anInt4589 = arg0.method3107();
			this.anInt4602 = arg0.method3107();
			this.anInt4594 = arg0.method3107();
			this.anInt4604 = arg0.method3122();
			if (local122 != this.anInt4609 || this.anInt4597 != local164 || this.anInt4589 != local302 || local308 != this.anInt4602 || local314 != this.anInt4594 || this.anInt4604 != local311) {
				Static196.method2968(this);
			}
		}
		if (this.aClass149_2 == null) {
			this.aClass149_2 = new Class149();
		}
		local164 = this.aClass149_2.anInt5039;
		this.aClass149_2.method3870(local189, this.anInt4546, local29 == 1, local44, local41);
		if (local164 != local41) {
			this.anInt4562 = this.anIntArray519[0] * 128 + this.method3509() * 64;
			this.anInt4569 = this.anIntArray516[0] * 128 + this.method3509() * 64;
		}
		if (this.aClass91_Sub1_6 != null) {
			this.aClass91_Sub1_6.method3051();
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method3517() {
		@Pc(2) String local2 = this.aString147;
		if (Static197.aStringArray21 != null) {
			local2 = Static197.aStringArray21[this.aByte20] + local2;
		}
		if (Static268.aStringArray31 != null) {
			local2 = local2 + Static268.aStringArray31[this.aByte20];
		}
		return local2;
	}

	@OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIZB)V")
	public void method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		super.method3500(arg2, arg0, arg1, this.method3509());
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		return this.anInt4576;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILclient!pe;Lclient!ei;IIIIIIIIIII)V")
	private void method3521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class91_Sub1 arg3, @OriginalArg(4) Class6_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(12) int local12 = arg0 * arg0 + arg12 * arg12;
		if (local12 < 16 || local12 > arg13) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg0, (double) arg12) * 325.949D) & 0x7FF;
		@Pc(46) Class6_Sub2 local46 = Static216.method3459(this.anInt4569, arg11, this.anInt4562, arg4, local34, this.anInt4533);
		if (local46 == null) {
			return;
		}
		if (!Static240.aBoolean369) {
			local46.method3838(0, arg5, arg1, arg2, arg6, arg7, arg9, arg14, -1L, arg8, arg3);
			return;
		}
		@Pc(67) float local67 = Static240.method3773();
		@Pc(69) float local69 = Static240.method3769();
		Static240.method3800();
		Static240.method3807(local67, local69 - 150.0F);
		local46.method3838(0, arg5, arg1, arg2, arg6, arg7, arg9, arg14, -1L, arg8, arg3);
		Static240.method3808();
		Static240.method3807(local67, local69);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)I")
	@Override
	public int method3509() {
		return this.aClass149_2 == null || this.aClass149_2.anInt5039 == -1 ? super.method3509() : Static24.method424(this.aClass149_2.anInt5039).anInt629;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
