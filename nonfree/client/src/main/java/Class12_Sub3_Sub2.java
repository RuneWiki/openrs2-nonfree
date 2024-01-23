import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class12_Sub3_Sub2 extends Class12_Sub3 {

	@OriginalMember(owner = "client!qb", name = "rc", descriptor = "Ljava/lang/String;")
	public String aString132;

	@OriginalMember(owner = "client!qb", name = "Fc", descriptor = "Lclient!ra;")
	public Class143 aClass143_1;

	@OriginalMember(owner = "client!qb", name = "qc", descriptor = "I")
	public int anInt4201 = 0;

	@OriginalMember(owner = "client!qb", name = "yc", descriptor = "I")
	public int anInt4207 = 255;

	@OriginalMember(owner = "client!qb", name = "Dc", descriptor = "I")
	public int anInt4211 = -1;

	@OriginalMember(owner = "client!qb", name = "zc", descriptor = "I")
	public int anInt4208 = 0;

	@OriginalMember(owner = "client!qb", name = "Hc", descriptor = "I")
	public int anInt4214 = -1;

	@OriginalMember(owner = "client!qb", name = "Cc", descriptor = "Z")
	public boolean aBoolean280 = false;

	@OriginalMember(owner = "client!qb", name = "Ec", descriptor = "I")
	public int anInt4212 = -1;

	@OriginalMember(owner = "client!qb", name = "xc", descriptor = "I")
	public int anInt4206 = 0;

	@OriginalMember(owner = "client!qb", name = "ic", descriptor = "I")
	public int anInt4195 = -1;

	@OriginalMember(owner = "client!qb", name = "Nc", descriptor = "I")
	public int anInt4218 = -1;

	@OriginalMember(owner = "client!qb", name = "Rc", descriptor = "I")
	public int anInt4221 = 0;

	@OriginalMember(owner = "client!qb", name = "sc", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!qb", name = "Kc", descriptor = "I")
	public int anInt4216 = -1;

	@OriginalMember(owner = "client!qb", name = "Tc", descriptor = "I")
	public int anInt4223 = -1;

	@OriginalMember(owner = "client!qb", name = "Vc", descriptor = "I")
	public int anInt4225 = 0;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method3378() {
		@Pc(6) String local6 = this.aString132;
		if (Static23.aStringArray4 != null) {
			local6 = Static23.aStringArray4[this.aByte18] + local6;
		}
		if (Static179.aStringArray29 != null) {
			local6 = local6 + Static179.aStringArray29[this.aByte18];
		}
		return local6;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3374() {
		return this.aClass143_1 != null;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		return this.anInt4146;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIILclient!id;IIILclient!uc;IIIIII)V")
	private void method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class67_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class12_Sub2 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(11) int local11 = arg10 * arg10 + arg0 * arg0;
		if (local11 < 16 || local11 > arg2) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg0, (double) arg10) * 325.949D) & 0x7FF;
		@Pc(49) Class12_Sub2 local49 = Static122.method2056(this.anInt4113, this.anInt4135, this.anInt4141, local35, arg9, arg13);
		if (local49 == null) {
			return;
		}
		if (!Static178.aBoolean216) {
			local49.method3357(0, arg7, arg1, arg12, arg6, arg8, arg4, arg14, -1L, arg3, arg5);
			return;
		}
		@Pc(71) float local71 = Static178.method2777();
		@Pc(73) float local73 = Static178.method2759();
		Static178.method2784();
		Static178.method2775(local71, local73 - 150.0F);
		local49.method3357(0, arg7, arg1, arg12, arg6, arg8, arg4, arg14, -1L, arg3, arg5);
		Static178.method2748();
		Static178.method2775(local71, local73);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!p;B)V")
	public void method3382(@OriginalArg(0) Class4_Sub17 arg0) {
		arg0.anInt2400 = 0;
		@Pc(12) int local12 = arg0.method1874();
		@Pc(16) int local16 = super.method3375();
		@Pc(24) boolean local24 = (local12 & 0x4) != 0;
		this.method3362((local12 >> 3 & 0x7) + 1);
		@Pc(38) int local38 = local12 & 0x1;
		@Pc(40) int local40 = -1;
		@Pc(43) int[] local43 = new int[12];
		this.aByte18 = (byte) (local12 >> 6 & 0x3);
		this.anInt4141 += (this.method3375() - local16) * 64;
		this.anInt4113 += (this.method3375() - local16) * 64;
		this.anInt4218 = arg0.method1892();
		this.anInt4214 = arg0.method1892();
		this.anInt4208 = 0;
		@Pc(106) int local106;
		@Pc(118) int local118;
		@Pc(124) int local124;
		@Pc(166) int local166;
		for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
			local106 = arg0.method1874();
			if (local106 == 0) {
				local43[local95] = 0;
			} else {
				local118 = arg0.method1874();
				local124 = (local106 << 8) + local118;
				if (local95 == 0 && local124 == 65535) {
					local40 = arg0.method1837();
					this.anInt4208 = arg0.method1874();
					break;
				}
				if (local124 >= 32768) {
					local124 = Static94.anIntArray208[local124 - 32768];
					local43[local95] = local124 | 0x40000000;
					local166 = Static277.method4117(local124).anInt4884;
					if (local166 != 0) {
						this.anInt4208 = local166;
					}
				} else {
					local43[local95] = local124 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(193) int[] local193 = new int[5];
		for (local106 = 0; local106 < 5; local106++) {
			local118 = arg0.method1874();
			if (local118 < 0 || Static118.aShortArrayArray1[local106].length <= local118) {
				local118 = 0;
			}
			local193[local106] = local118;
		}
		this.anInt4126 = arg0.method1837();
		@Pc(230) long local230 = arg0.method1864();
		this.aString132 = Static211.method3379(local230);
		this.anInt4201 = arg0.method1874();
		if (local24) {
			this.anInt4225 = arg0.method1837();
			this.anInt4223 = -1;
			this.anInt4206 = this.anInt4201;
		} else {
			this.anInt4225 = 0;
			this.anInt4206 = arg0.method1874();
			this.anInt4223 = arg0.method1874();
			if (this.anInt4223 == 255) {
				this.anInt4223 = -1;
			}
		}
		local124 = this.anInt4221;
		this.anInt4221 = arg0.method1874();
		if (this.anInt4221 == 0) {
			Static152.method2434(this);
		} else {
			local166 = this.anInt4211;
			@Pc(302) int local302 = this.anInt4212;
			@Pc(305) int local305 = this.anInt4216;
			@Pc(308) int local308 = this.anInt4207;
			@Pc(311) int local311 = this.anInt4195;
			this.anInt4211 = arg0.method1837();
			this.anInt4195 = arg0.method1837();
			this.anInt4216 = arg0.method1837();
			this.anInt4212 = arg0.method1837();
			this.anInt4207 = arg0.method1874();
			if (local124 != this.anInt4221 || this.anInt4211 != local166 || this.anInt4195 != local311 || this.anInt4216 != local305 || local302 != this.anInt4212 || local308 != this.anInt4207) {
				Static213.method3407(this);
			}
		}
		if (this.aClass143_1 == null) {
			this.aClass143_1 = new Class143();
		}
		local166 = this.aClass143_1.anInt4440;
		this.aClass143_1.method3563(this.anInt4126, local193, local38 == 1, local43, local40);
		if (local166 != local40) {
			this.anInt4141 = this.anIntArray376[0] * 128 + this.method3375() * 64;
			this.anInt4113 = this.anIntArray379[0] * 128 + this.method3375() * 64;
		}
		if (this.aClass67_Sub1_6 != null) {
			this.aClass67_Sub1_6.method1759();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)I")
	@Override
	public int method3375() {
		return this.aClass143_1 == null || this.aClass143_1.anInt4440 == -1 ? super.method3375() : Static262.method3970(this.aClass143_1.anInt4440).anInt5217;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZ)V")
	public void method3383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		super.method3367(arg0, arg1, this.method3375(), arg2);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		if (this.aClass143_1 == null) {
			return;
		}
		@Pc(27) Class141 local27 = this.anInt4178 != -1 && this.anInt4119 == 0 ? Static296.method1376(this.anInt4178) : null;
		@Pc(52) Class141 local52 = this.anInt4127 == -1 || this.aBoolean280 || this.anInt4127 == this.method3361().anInt2564 && local27 != null ? null : Static296.method1376(this.anInt4127);
		@Pc(74) Class12_Sub2 local74 = this.aClass143_1.method3570(local52, this.aClass28Array3, this.anInt4120, this.anInt4170, this.anInt4159, this.anInt4118, local27, this.anInt4152, this.anInt4123);
		@Pc(77) int local77 = Static236.method2948();
		if (Static178.aBoolean216 && Static193.anInt3800 < 96 && local77 > 50) {
			Static241.method3697();
		}
		@Pc(105) int local105;
		if (Static275.anInt5146 != 0 && local77 < 50) {
			local105 = 50 - local77;
			while (local105 > Static269.anInt5027) {
				Static175.aByteArrayArray14[Static269.anInt5027] = new byte[102400];
				Static269.anInt5027++;
			}
			while (Static269.anInt5027 > local105) {
				Static269.anInt5027--;
				Static175.aByteArrayArray14[Static269.anInt5027] = null;
			}
		}
		if (local74 == null) {
			return;
		}
		this.anInt4146 = local74.method3355();
		@Pc(194) Class12_Sub2 local194;
		if (Static171.aBoolean210 && (this.aClass143_1.anInt4440 == -1 || Static262.method3970(this.aClass143_1.anInt4440).aBoolean343)) {
			local194 = Static112.method1922(240, local52 == null ? local27 : local52, 1, this.aBoolean277, arg0, 0, this.anInt4135, this.anInt4113, this.anInt4141, 160, local74, 0, local52 == null ? this.anInt4170 : this.anInt4118);
			if (Static178.aBoolean216) {
				@Pc(213) float local213 = Static178.method2777();
				@Pc(215) float local215 = Static178.method2759();
				Static178.method2784();
				Static178.method2775(local213, local215 - 150.0F);
				local194.method3357(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static178.method2748();
				Static178.method2775(local213, local215);
			} else {
				local194.method3357(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static239.aClass12_Sub3_Sub2_2 == this) {
			for (local105 = Static250.aClass7Array1.length - 1; local105 >= 0; local105--) {
				@Pc(254) Class7 local254 = Static250.aClass7Array1[local105];
				if (local254 != null && local254.anInt140 != -1) {
					@Pc(296) int local296;
					@Pc(307) int local307;
					if (local254.anInt135 == 1 && local254.anInt133 >= 0 && Static100.aClass12_Sub3_Sub1Array1.length > local254.anInt133) {
						@Pc(284) Class12_Sub3_Sub1 local284 = Static100.aClass12_Sub3_Sub1Array1[local254.anInt133];
						if (local284 != null) {
							local296 = local284.anInt4141 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
							local307 = local284.anInt4113 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
							this.method3380(local296, arg2, 360000, arg9, arg6, null, arg4, arg1, arg5, local74, local307, arg0, arg3, local254.anInt140, arg7);
						}
					}
					if (local254.anInt135 == 2) {
						@Pc(348) int local348 = (local254.anInt137 - Static170.anInt3385) * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
						local307 = local254.anInt130 * 4;
						local296 = (-Static239.anInt4613 + local254.anInt139) * 4 + 2 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
						local307 *= local307;
						this.method3380(local348, arg2, local307, arg9, arg6, null, arg4, arg1, arg5, local74, local296, arg0, arg3, local254.anInt140, arg7);
					}
					if (local254.anInt135 == 10 && local254.anInt133 >= 0 && local254.anInt133 < Static257.aClass12_Sub3_Sub2Array1.length) {
						@Pc(416) Class12_Sub3_Sub2 local416 = Static257.aClass12_Sub3_Sub2Array1[local254.anInt133];
						if (local416 != null) {
							local296 = local416.anInt4141 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4141 / 32;
							local307 = local416.anInt4113 / 32 - Static239.aClass12_Sub3_Sub2_2.anInt4113 / 32;
							this.method3380(local296, arg2, 360000, arg9, arg6, null, arg4, arg1, arg5, local74, local307, arg0, arg3, local254.anInt140, arg7);
						}
					}
				}
			}
		}
		local194 = null;
		this.method3373(local74);
		this.method3369(arg0, local74);
		if (!this.aBoolean280 && this.anInt4125 != -1 && this.anInt4188 != -1) {
			@Pc(489) Class126 local489 = Static262.method3973(this.anInt4125);
			local194 = local489.method3023(this.anInt4158, this.anInt4188, this.anInt4154);
			if (local194 != null) {
				local194.method3155(0, -this.anInt4187, 0);
				if (local489.aBoolean246) {
					if (Static298.anInt5528 != 0) {
						local194.method3158(Static298.anInt5528);
					}
					if (Static175.anInt3449 != 0) {
						local194.method3162(Static175.anInt3449);
					}
					if (Static269.anInt5029 != 0) {
						local194.method3155(0, Static269.anInt5029, 0);
					}
				}
			}
		}
		@Pc(535) Class12_Sub2 local535 = null;
		if (!this.aBoolean280 && this.anObject6 != null) {
			if (this.anInt4177 <= Static104.anInt2226) {
				this.anObject6 = null;
			}
			if (Static104.anInt2226 >= this.anInt4131 && Static104.anInt2226 < this.anInt4177) {
				if (this.anObject6 instanceof Class12_Sub6) {
					local535 = (Class12_Sub2) ((Class12_Sub6) this.anObject6).method3303();
				} else {
					local535 = (Class12_Sub2) this.anObject6;
				}
				local535.method3155(this.anInt4182 - this.anInt4141, -this.anInt4135 + this.anInt4179, this.anInt4111 - this.anInt4113);
				if (this.anInt4136 == 512) {
					local535.method3140();
				} else if (this.anInt4136 == 1024) {
					local535.method3164();
				} else if (this.anInt4136 == 1536) {
					local535.method3141();
				}
			}
		}
		if (Static178.aBoolean216) {
			local74.aBoolean255 = true;
			local74.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_6);
			if (local194 != null) {
				local194.aBoolean255 = true;
				local194.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_6);
			}
		} else {
			if (local194 != null) {
				local74 = ((Class12_Sub2_Sub1) local74).method614(local194);
			}
			if (local535 != null) {
				local74 = ((Class12_Sub2_Sub1) local74).method614(local535);
			}
			local74.aBoolean255 = true;
			local74.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_6);
		}
		if (local535 == null) {
			return;
		}
		if (this.anInt4136 == 512) {
			local535.method3141();
		} else if (this.anInt4136 == 1024) {
			local535.method3164();
		} else if (this.anInt4136 == 1536) {
			local535.method3140();
		}
		local535.method3155(this.anInt4141 - this.anInt4182, -this.anInt4179 + this.anInt4135, this.anInt4113 - this.anInt4111);
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)I")
	@Override
	protected int method3366() {
		return this.anInt4126;
	}

	@OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}
}
