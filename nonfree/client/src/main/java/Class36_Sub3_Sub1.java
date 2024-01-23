import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class36_Sub3_Sub1 extends Class36_Sub3 {

	@OriginalMember(owner = "client!pf", name = "yc", descriptor = "Lclient!am;")
	public Class11 aClass11_2;

	@OriginalMember(owner = "client!pf", name = "zc", descriptor = "Ljava/lang/String;")
	public String aString144;

	@OriginalMember(owner = "client!pf", name = "sc", descriptor = "I")
	public int anInt4022 = -1;

	@OriginalMember(owner = "client!pf", name = "wc", descriptor = "I")
	public int anInt4026 = -1;

	@OriginalMember(owner = "client!pf", name = "Gc", descriptor = "Z")
	public boolean aBoolean326 = false;

	@OriginalMember(owner = "client!pf", name = "qc", descriptor = "I")
	public int anInt4020 = -1;

	@OriginalMember(owner = "client!pf", name = "Fc", descriptor = "B")
	private byte aByte10 = 0;

	@OriginalMember(owner = "client!pf", name = "Ic", descriptor = "I")
	public int anInt4032 = -1;

	@OriginalMember(owner = "client!pf", name = "uc", descriptor = "I")
	public int anInt4024 = 0;

	@OriginalMember(owner = "client!pf", name = "oc", descriptor = "I")
	public int anInt4018 = 0;

	@OriginalMember(owner = "client!pf", name = "Kc", descriptor = "I")
	public int anInt4034 = 0;

	@OriginalMember(owner = "client!pf", name = "Ec", descriptor = "I")
	public int anInt4030 = 255;

	@OriginalMember(owner = "client!pf", name = "Wc", descriptor = "I")
	public int anInt4045 = 0;

	@OriginalMember(owner = "client!pf", name = "Mc", descriptor = "I")
	public int anInt4036 = -1;

	@OriginalMember(owner = "client!pf", name = "rc", descriptor = "I")
	public int anInt4021 = -1;

	@OriginalMember(owner = "client!pf", name = "Xc", descriptor = "I")
	public int anInt4046 = -1;

	@OriginalMember(owner = "client!pf", name = "Yc", descriptor = "I")
	public int anInt4047 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		if (this.aClass11_2 == null) {
			return;
		}
		@Pc(27) Class76 local27 = this.anInt4107 != -1 && this.anInt4113 == 0 ? Static115.method1855(this.anInt4107) : null;
		@Pc(56) Class76 local56 = this.anInt4067 == -1 || this.aBoolean326 || this.anInt4067 == this.method3105().anInt423 && local27 != null ? null : Static115.method1855(this.anInt4067);
		@Pc(78) Class36_Sub2 local78 = this.aClass11_2.method265(this.anInt4103, local56, this.anInt4104, this.aClass83Array3, this.anInt4132, this.anInt4122, this.anInt4120, local27, this.anInt4097);
		@Pc(81) int local81 = Static285.method4243();
		if (Static116.aBoolean188 && Static16.anInt3524 < 96 && local81 > 50) {
			Static99.method1576();
		}
		@Pc(106) int local106;
		if (Static66.anInt4469 != 0 && local81 < 50) {
			local106 = 50 - local81;
			while (local106 > Static83.anInt1804) {
				Static74.aByteArrayArray6[Static83.anInt1804] = new byte[102400];
				Static83.anInt1804++;
			}
			while (local106 < Static83.anInt1804) {
				Static83.anInt1804--;
				Static74.aByteArrayArray6[Static83.anInt1804] = null;
			}
		}
		if (local78 == null) {
			return;
		}
		this.anInt4102 = local78.method4175();
		@Pc(193) Class36_Sub2 local193;
		if (Static150.aBoolean367 && (this.aClass11_2.anInt364 == -1 || Static253.method3795(this.aClass11_2.anInt364).aBoolean473)) {
			local193 = Static55.method891(this.anInt4117, local56 == null ? local27 : local56, 1, this.anInt4086, arg0, 160, local78, 0, local56 == null ? this.anInt4103 : this.anInt4104, 0, 240, this.anInt4118, this.aBoolean330);
			if (Static116.aBoolean188) {
				@Pc(197) float local197 = Static116.method1869();
				@Pc(199) float local199 = Static116.method1886();
				Static116.method1874();
				Static116.method1909(local197, local199 - 150.0F);
				local193.method4173(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static116.method1881();
				Static116.method1909(local197, local199);
			} else {
				local193.method4173(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static21.aClass36_Sub3_Sub1_1 == this) {
			for (local106 = Static245.aClass18Array1.length - 1; local106 >= 0; local106--) {
				@Pc(253) Class18 local253 = Static245.aClass18Array1[local106];
				if (local253 != null && local253.anInt667 != -1) {
					@Pc(297) int local297;
					@Pc(308) int local308;
					if (local253.anInt668 == 1 && local253.anInt671 >= 0 && local253.anInt671 < Static48.aClass36_Sub3_Sub2Array1.length) {
						@Pc(283) Class36_Sub3_Sub2 local283 = Static48.aClass36_Sub3_Sub2Array1[local253.anInt671];
						if (local283 != null) {
							local297 = local283.anInt4117 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
							local308 = local283.anInt4118 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
							this.method3082(arg4, arg0, arg7, arg2, arg3, arg5, null, local297, 360000, arg6, local308, arg1, local78, local253.anInt667, arg9);
						}
					}
					if (local253.anInt668 == 2) {
						@Pc(350) int local350 = (local253.anInt675 - Static49.anInt1089) * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
						local297 = (local253.anInt664 - Static130.anInt2601) * 4 + 2 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
						local308 = local253.anInt676 * 4;
						local308 *= local308;
						this.method3082(arg4, arg0, arg7, arg2, arg3, arg5, null, local350, local308, arg6, local297, arg1, local78, local253.anInt667, arg9);
					}
					if (local253.anInt668 == 10 && local253.anInt671 >= 0 && local253.anInt671 < Static230.aClass36_Sub3_Sub1Array1.length) {
						@Pc(413) Class36_Sub3_Sub1 local413 = Static230.aClass36_Sub3_Sub1Array1[local253.anInt671];
						if (local413 != null) {
							local297 = local413.anInt4117 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4117 / 32;
							local308 = local413.anInt4118 / 32 - Static21.aClass36_Sub3_Sub1_1.anInt4118 / 32;
							this.method3082(arg4, arg0, arg7, arg2, arg3, arg5, null, local297, 360000, arg6, local308, arg1, local78, local253.anInt667, arg9);
						}
					}
				}
			}
		}
		this.method3113(local78);
		this.method3114(local78, arg0);
		local193 = null;
		if (!this.aBoolean326 && this.anInt4125 != -1 && this.anInt4127 != -1) {
			@Pc(490) Class144 local490 = Static81.method1346(this.anInt4125);
			local193 = local490.method3527(this.anInt4127, this.anInt4070, this.anInt4124);
			if (local193 != null) {
				local193.method3950(0, -this.anInt4095, 0);
				if (local490.aBoolean375) {
					if (Static169.anInt3377 != 0) {
						local193.method3945(Static169.anInt3377);
					}
					if (Static151.anInt4136 != 0) {
						local193.method3938(Static151.anInt4136);
					}
					if (Static219.anInt4499 != 0) {
						local193.method3950(0, Static219.anInt4499, 0);
					}
				}
			}
		}
		@Pc(535) Class36_Sub2 local535 = null;
		if (!this.aBoolean326 && this.anObject4 != null) {
			if (Static183.anInt3590 >= this.anInt4071) {
				this.anObject4 = null;
			}
			if (Static183.anInt3590 >= this.anInt4108 && this.anInt4071 > Static183.anInt3590) {
				if (this.anObject4 instanceof Class36_Sub4) {
					local535 = (Class36_Sub2) ((Class36_Sub4) this.anObject4).method2658();
				} else {
					local535 = (Class36_Sub2) this.anObject4;
				}
				local535.method3950(this.anInt4091 - this.anInt4117, this.anInt4150 - this.anInt4086, this.anInt4111 - this.anInt4118);
				if (this.anInt4081 == 512) {
					local535.method3940();
				} else if (this.anInt4081 == 1024) {
					local535.method3942();
				} else if (this.anInt4081 == 1536) {
					local535.method3941();
				}
			}
		}
		if (Static116.aBoolean188) {
			local78.aBoolean435 = true;
			local78.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_5);
			if (local193 != null) {
				local193.aBoolean435 = true;
				local193.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_5);
			}
		} else {
			if (local193 != null) {
				local78 = ((Class36_Sub2_Sub2) local78).method3980(local193);
			}
			if (local535 != null) {
				local78 = ((Class36_Sub2_Sub2) local78).method3980(local535);
			}
			local78.aBoolean435 = true;
			local78.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_5);
		}
		if (local535 == null) {
			return;
		}
		if (this.anInt4081 == 512) {
			local535.method3941();
		} else if (this.anInt4081 == 1024) {
			local535.method3942();
		} else if (this.anInt4081 == 1536) {
			local535.method3940();
		}
		local535.method3950(this.anInt4117 - this.anInt4091, -this.anInt4150 + this.anInt4086, this.anInt4118 - this.anInt4111);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!aj;)V")
	public void method3080(@OriginalArg(1) Class8_Sub2 arg0) {
		arg0.anInt2955 = 0;
		@Pc(12) int local12 = arg0.method2334();
		@Pc(23) boolean local23 = (local12 & 0x4) != 0;
		@Pc(27) int local27 = local12 & 0x1;
		@Pc(31) int local31 = super.method3110();
		this.method3115((local12 >> 3 & 0x7) + 1);
		this.aByte10 = (byte) (local12 >> 6 & 0x3);
		this.anInt4117 += (this.method3110() - local31) * 64;
		this.anInt4118 += (this.method3110() - local31) * 64;
		@Pc(79) int local79 = -1;
		@Pc(82) int[] local82 = new int[12];
		this.anInt4022 = arg0.method2374();
		this.anInt4026 = arg0.method2374();
		this.anInt4047 = 0;
		@Pc(106) int local106;
		@Pc(119) int local119;
		@Pc(125) int local125;
		@Pc(168) int local168;
		for (@Pc(97) int local97 = 0; local97 < 12; local97++) {
			local106 = arg0.method2334();
			if (local106 == 0) {
				local82[local97] = 0;
			} else {
				local119 = arg0.method2334();
				local125 = local119 + (local106 << 8);
				if (local97 == 0 && local125 == 65535) {
					local79 = arg0.method2375();
					this.anInt4047 = arg0.method2334();
					break;
				}
				if (local125 >= 32768) {
					local125 = Static200.anIntArray306[local125 - 32768];
					local82[local97] = local125 | 0x40000000;
					local168 = Static140.method2222(local125).anInt141;
					if (local168 != 0) {
						this.anInt4047 = local168;
					}
				} else {
					local82[local97] = local125 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(196) int[] local196 = new int[5];
		for (local106 = 0; local106 < 5; local106++) {
			local119 = arg0.method2334();
			if (local119 < 0 || Static152.aShortArrayArray5[local106].length <= local119) {
				local119 = 0;
			}
			local196[local106] = local119;
		}
		this.anInt4083 = arg0.method2375();
		@Pc(239) long local239 = arg0.method2347();
		this.aString144 = Static121.method1945(local239);
		this.anInt4018 = arg0.method2334();
		if (local23) {
			this.anInt4024 = arg0.method2375();
			this.anInt4021 = -1;
			this.anInt4034 = this.anInt4018;
		} else {
			this.anInt4024 = 0;
			this.anInt4034 = arg0.method2334();
			this.anInt4021 = arg0.method2334();
			if (this.anInt4021 == 255) {
				this.anInt4021 = -1;
			}
		}
		local125 = this.anInt4045;
		this.anInt4045 = arg0.method2334();
		if (this.anInt4045 == 0) {
			Static27.method462(this);
		} else {
			local168 = this.anInt4036;
			@Pc(310) int local310 = this.anInt4046;
			@Pc(313) int local313 = this.anInt4020;
			@Pc(316) int local316 = this.anInt4032;
			@Pc(319) int local319 = this.anInt4030;
			this.anInt4036 = arg0.method2375();
			this.anInt4046 = arg0.method2375();
			this.anInt4020 = arg0.method2375();
			this.anInt4032 = arg0.method2375();
			this.anInt4030 = arg0.method2334();
			if (this.anInt4045 != local125 || local168 != this.anInt4036 || this.anInt4046 != local310 || local313 != this.anInt4020 || this.anInt4032 != local316 || local319 != this.anInt4030) {
				Static231.method3534(this);
			}
		}
		if (this.aClass11_2 == null) {
			this.aClass11_2 = new Class11();
		}
		local168 = this.aClass11_2.anInt364;
		this.aClass11_2.method269(local79, local196, this.anInt4083, local27 == 1, local82);
		if (local79 != local168) {
			this.anInt4117 = this.anIntArray310[0] * 128 + this.method3110() * 64;
			this.anInt4118 = this.anIntArray308[0] * 128 + this.method3110() * 64;
		}
		if (this.aClass105_Sub1_5 != null) {
			this.aClass105_Sub1_5.method3484();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIILclient!rb;IIIIIILclient!ie;II)V")
	private void method3082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class105_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class36_Sub2 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(11) int local11 = arg10 * arg10 + arg7 * arg7;
		if (local11 < 16 || arg8 < local11) {
			return;
		}
		@Pc(36) int local36 = (int) (Math.atan2((double) arg7, (double) arg10) * 325.949D) & 0x7FF;
		@Pc(48) Class36_Sub2 local48 = Static248.method3679(arg12, this.anInt4118, this.anInt4086, this.anInt4117, arg13, local36);
		if (local48 == null) {
			return;
		}
		if (!Static116.aBoolean188) {
			local48.method4173(0, arg11, arg3, arg4, arg0, arg5, arg9, arg2, -1L, arg14, arg6);
			return;
		}
		@Pc(54) float local54 = Static116.method1869();
		@Pc(56) float local56 = Static116.method1886();
		Static116.method1874();
		Static116.method1909(local54, local56 - 150.0F);
		local48.method4173(0, arg11, arg3, arg4, arg0, arg5, arg9, arg2, -1L, arg14, arg6);
		Static116.method1881();
		Static116.method1909(local54, local56);
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I")
	@Override
	protected int method3109() {
		return this.anInt4083;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3112() {
		return this.aClass11_2 != null;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method3084() {
		@Pc(14) String local14 = this.aString144;
		if (Static225.aStringArray68 != null) {
			local14 = Static225.aStringArray68[this.aByte10] + local14;
		}
		if (Static168.aStringArray81 != null) {
			local14 = local14 + Static168.aStringArray81[this.aByte10];
		}
		return local14;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZ)V")
	public void method3085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		super.method3116(arg1, this.method3110(), arg0, arg2);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		return this.anInt4102;
	}

	@OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
	@Override
	public int method3110() {
		return this.aClass11_2 == null || this.aClass11_2.anInt364 == -1 ? super.method3110() : Static253.method3795(this.aClass11_2.anInt364).anInt5633;
	}
}
