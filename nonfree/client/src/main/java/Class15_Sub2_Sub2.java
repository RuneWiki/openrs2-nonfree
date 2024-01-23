import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class15_Sub2_Sub2 extends Class15_Sub2 {

	@OriginalMember(owner = "client!th", name = "pc", descriptor = "Lclient!kk;")
	public Class97 aClass97_2;

	@OriginalMember(owner = "client!th", name = "tc", descriptor = "Ljava/lang/String;")
	public String aString184;

	@OriginalMember(owner = "client!th", name = "Ec", descriptor = "Ljava/lang/String;")
	public String aString185;

	@OriginalMember(owner = "client!th", name = "qc", descriptor = "I")
	public int anInt5382 = 0;

	@OriginalMember(owner = "client!th", name = "oc", descriptor = "I")
	public int anInt5381 = -1;

	@OriginalMember(owner = "client!th", name = "Bc", descriptor = "I")
	public int anInt5391 = -1;

	@OriginalMember(owner = "client!th", name = "xc", descriptor = "B")
	private byte aByte24 = 0;

	@OriginalMember(owner = "client!th", name = "Lc", descriptor = "I")
	public int anInt5399 = -1;

	@OriginalMember(owner = "client!th", name = "Nc", descriptor = "I")
	public int anInt5401 = 0;

	@OriginalMember(owner = "client!th", name = "Pc", descriptor = "Z")
	public boolean aBoolean359 = false;

	@OriginalMember(owner = "client!th", name = "Mc", descriptor = "I")
	public int anInt5400 = -1;

	@OriginalMember(owner = "client!th", name = "Gc", descriptor = "I")
	public int anInt5394 = -1;

	@OriginalMember(owner = "client!th", name = "uc", descriptor = "I")
	public int anInt5385 = -1;

	@OriginalMember(owner = "client!th", name = "wc", descriptor = "I")
	public int anInt5387 = 0;

	@OriginalMember(owner = "client!th", name = "Cc", descriptor = "B")
	private byte aByte25 = 0;

	@OriginalMember(owner = "client!th", name = "Uc", descriptor = "I")
	public int anInt5407 = 255;

	@OriginalMember(owner = "client!th", name = "Rc", descriptor = "I")
	public int anInt5404 = 0;

	@OriginalMember(owner = "client!th", name = "Ac", descriptor = "I")
	public int anInt5390 = -1;

	@OriginalMember(owner = "client!th", name = "Xc", descriptor = "I")
	public int anInt5409 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIILclient!gl;Lclient!hb;IIIIII)V")
	private void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class20_Sub2 arg8, @OriginalArg(9) Class15_Sub5 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(17) int local17 = arg4 * arg4 + arg12 * arg12;
		if (local17 < 16 || arg0 < local17) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg12, (double) arg4) * 325.949D) & 0x7FF;
		@Pc(51) Class15_Sub5 local51 = Static94.method1660(this.anInt5358, this.anInt5371, this.anInt5308, local39, arg9, arg3);
		if (local51 == null) {
			return;
		}
		if (!Static116.aBoolean184) {
			local51.method4272(0, arg2, arg1, arg6, arg5, arg7, arg11, arg10, -1L, arg13, arg8);
			return;
		}
		@Pc(58) float local58 = Static116.method1980();
		@Pc(60) float local60 = Static116.method1964();
		Static116.method1947();
		Static116.method1956(local58, local60 - 150.0F);
		local51.method4272(0, arg2, arg1, arg6, arg5, arg7, arg11, arg10, -1L, arg13, arg8);
		Static116.method1958();
		Static116.method1956(local58, local60);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method4299(@OriginalArg(1) boolean arg0) {
		return arg0 ? this.aString185 : this.aString184;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean352) {
			if (this.aClass97_2 == null) {
				return;
			}
			@Pc(27) Class112 local27 = this.anInt5332 != -1 && this.anInt5343 == 0 ? Static208.method3496(this.anInt5332) : null;
			@Pc(55) Class112 local55 = this.anInt5365 == -1 || this.aBoolean359 || this.anInt5365 == this.method4297().anInt4136 && local27 != null ? null : Static208.method3496(this.anInt5365);
			@Pc(78) Class15_Sub5 local78 = this.aClass97_2.method2813(this.anInt5368, false, this.anInt5318, this.aClass62Array3, local55, local27, false, this.anInt5319, this.anInt5340, this.anInt5362, this.anInt5377);
			if (local78 == null) {
				return;
			}
			this.method4290(local78, null);
		}
		if (this.aClass20_Sub2_6 != null) {
			this.aClass20_Sub2_6.method1691(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4282() {
		return this.aClass97_2 != null;
	}

	@OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub2_6 != null) {
			this.aClass20_Sub2_6.method1694();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I")
	@Override
	public int method4286() {
		return this.aClass97_2 == null || this.aClass97_2.anInt3399 == -1 ? super.method4286() : Static60.method1158(this.aClass97_2.anInt3399).anInt5867;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)I")
	@Override
	protected int method4291() {
		return this.anInt5338;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILclient!gl;)V")
	@Override
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub2 arg10) {
		if (this.aClass97_2 == null) {
			return;
		}
		@Pc(28) Class112 local28 = this.anInt5332 != -1 && this.anInt5343 == 0 ? Static208.method3496(this.anInt5332) : null;
		@Pc(32) Class123 local32 = this.method4297();
		@Pc(52) boolean local52 = local32.anInt4135 != 0 || local32.anInt4109 != 0 || local32.anInt4125 != 0 || local32.anInt4115 != 0;
		@Pc(76) Class112 local76 = this.anInt5365 == -1 || this.aBoolean359 || this.anInt5365 == this.method4297().anInt4136 && local28 != null ? null : Static208.method3496(this.anInt5365);
		@Pc(99) Class15_Sub5 local99 = this.aClass97_2.method2813(this.anInt5368, local52, this.anInt5318, this.aClass62Array3, local76, local28, true, this.anInt5319, this.anInt5340, this.anInt5362, this.anInt5377);
		@Pc(102) int local102 = Static33.method646();
		if (Static116.aBoolean184 && Static167.anInt3694 < 96 && local102 > 50) {
			Static300.method4557();
		}
		@Pc(126) int local126;
		if (Static248.anInt2154 != 0 && local102 < 50) {
			local126 = 50 - local102;
			while (Static169.anInt3735 < local126) {
				Static2.aByteArrayArray1[Static169.anInt3735] = new byte[102400];
				Static169.anInt3735++;
			}
			while (Static169.anInt3735 > local126) {
				Static169.anInt3735--;
				Static2.aByteArrayArray1[Static169.anInt3735] = null;
			}
		}
		if (local99 == null) {
			return;
		}
		this.anInt5348 = local99.method4274();
		@Pc(217) Class15_Sub5 local217;
		if (Static191.aBoolean276 && (this.aClass97_2.anInt3399 == -1 || Static60.method1158(this.aClass97_2.anInt3399).aBoolean390)) {
			local217 = Static31.method631(1, local99, 0, this.anInt5358, 0, this.anInt5371, local76 == null ? this.anInt5377 : this.anInt5319, this.anInt5308, 240, this.aBoolean356, arg0, 160, local76 == null ? local28 : local76);
			if (Static116.aBoolean184) {
				@Pc(221) float local221 = Static116.method1980();
				@Pc(223) float local223 = Static116.method1964();
				Static116.method1947();
				Static116.method1956(local221, local223 - 150.0F);
				local217.method4272(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static116.method1958();
				Static116.method1956(local221, local223);
			} else {
				local217.method4272(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static22.aClass15_Sub2_Sub2_1 == this) {
			for (local126 = Static308.aClass47Array1.length - 1; local126 >= 0; local126--) {
				@Pc(278) Class47 local278 = Static308.aClass47Array1[local126];
				if (local278 != null && local278.anInt1840 != -1) {
					@Pc(324) int local324;
					@Pc(334) int local334;
					if (local278.anInt1830 == 1 && local278.anInt1838 >= 0 && local278.anInt1838 < Static35.aClass15_Sub2_Sub1Array2.length) {
						@Pc(309) Class15_Sub2_Sub1 local309 = Static35.aClass15_Sub2_Sub1Array2[local278.anInt1838];
						if (local309 != null) {
							local324 = local309.anInt5358 / 32 - Static22.aClass15_Sub2_Sub2_1.anInt5358 / 32;
							local334 = local309.anInt5371 / 32 - Static22.aClass15_Sub2_Sub2_1.anInt5371 / 32;
							this.method4298(360000, arg2, arg1, local278.anInt1840, local334, arg4, arg3, arg5, null, local99, arg7, arg6, local324, arg9, arg0);
						}
					}
					if (local278.anInt1830 == 2) {
						@Pc(373) int local373 = (local278.anInt1846 + -Static160.anInt5159) * 4 + 2 - Static22.aClass15_Sub2_Sub2_1.anInt5358 / 32;
						local324 = (-Static234.anInt4705 + local278.anInt1832) * 4 + 2 - Static22.aClass15_Sub2_Sub2_1.anInt5371 / 32;
						local334 = local278.anInt1834 * 4;
						local334 *= local334;
						this.method4298(local334, arg2, arg1, local278.anInt1840, local324, arg4, arg3, arg5, null, local99, arg7, arg6, local373, arg9, arg0);
					}
					if (local278.anInt1830 == 10 && local278.anInt1838 >= 0 && Static188.aClass15_Sub2_Sub2Array41.length > local278.anInt1838) {
						@Pc(438) Class15_Sub2_Sub2 local438 = Static188.aClass15_Sub2_Sub2Array41[local278.anInt1838];
						if (local438 != null) {
							local324 = local438.anInt5358 / 32 - Static22.aClass15_Sub2_Sub2_1.anInt5358 / 32;
							local334 = local438.anInt5371 / 32 - Static22.aClass15_Sub2_Sub2_1.anInt5371 / 32;
							this.method4298(360000, arg2, arg1, local278.anInt1840, local334, arg4, arg3, arg5, null, local99, arg7, arg6, local324, arg9, arg0);
						}
					}
				}
			}
		}
		this.method4296(local99);
		this.method4295(local99, arg0);
		local217 = null;
		if (!this.aBoolean359 && this.anInt5301 != -1 && this.anInt5316 != -1) {
			@Pc(514) Class96 local514 = Static156.method2852(this.anInt5301);
			local217 = local514.method2801(this.anInt5316, this.anInt5321, this.anInt5363);
			if (local217 != null) {
				local217.method2356(0, -this.anInt5326, 0);
				if (local514.aBoolean233) {
					if (Static53.anInt1320 != 0) {
						local217.method2347(Static53.anInt1320);
					}
					if (Static83.anInt1962 != 0) {
						local217.method2334(Static83.anInt1962);
					}
					if (Static170.anInt3752 != 0) {
						local217.method2356(0, Static170.anInt3752, 0);
					}
				}
			}
		}
		@Pc(562) Class15_Sub5 local562 = null;
		if (!this.aBoolean359 && this.anObject7 != null) {
			if (this.anInt5359 <= Static268.anInt5236) {
				this.anObject7 = null;
			}
			if (this.anInt5312 <= Static268.anInt5236 && this.anInt5359 > Static268.anInt5236) {
				if (this.anObject7 instanceof Class15_Sub4) {
					local562 = (Class15_Sub5) ((Class15_Sub4) this.anObject7).method1727();
				} else {
					local562 = (Class15_Sub5) this.anObject7;
				}
				local562.method2356(this.anInt5299 - this.anInt5358, this.anInt5294 - this.anInt5308, this.anInt5357 - this.anInt5371);
				if (this.anInt5313 == 512) {
					local562.method2357();
				} else if (this.anInt5313 == 1024) {
					local562.method2344();
				} else if (this.anInt5313 == 1536) {
					local562.method2346();
				}
			}
		}
		if (Static116.aBoolean184) {
			this.method4290(local99, local217);
			local99.aBoolean206 = true;
			local99.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_6);
			if (local217 != null) {
				if (this.aClass20_Sub2_6 != null) {
					@Pc(724) Class15_Sub5_Sub2 local724 = (Class15_Sub5_Sub2) local217;
					this.aClass20_Sub2_6.method1699(local724.aClass185Array2, local724.aClass176Array2, true, local724.anIntArray285, local724.anIntArray287, local724.anIntArray288);
				}
				local217.aBoolean206 = true;
				local217.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_6);
			}
		} else {
			if (local217 != null) {
				local99 = ((Class15_Sub5_Sub1) local99).method2262(local217);
			}
			if (local562 != null) {
				local99 = ((Class15_Sub5_Sub1) local99).method2262(local562);
			}
			this.method4290(local99, local217);
			local99.aBoolean206 = true;
			local99.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_6);
		}
		if (local562 == null) {
			return;
		}
		if (this.anInt5313 == 512) {
			local562.method2346();
		} else if (this.anInt5313 == 1024) {
			local562.method2344();
		} else if (this.anInt5313 == 1536) {
			local562.method2357();
		}
		local562.method2356(this.anInt5358 - this.anInt5299, -this.anInt5294 + this.anInt5308, this.anInt5371 - this.anInt5357);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)I")
	@Override
	public int method4293() {
		return -1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!oe;)V")
	public void method4301(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		arg1.anInt2789 = 0;
		@Pc(12) int local12 = arg1.method2146();
		@Pc(23) boolean local23 = (local12 & 0x4) != 0;
		@Pc(32) boolean local32 = (local12 & 0x2) != 0;
		@Pc(36) int local36 = local12 & 0x1;
		@Pc(40) int local40 = super.method4286();
		@Pc(43) int[] local43 = new int[12];
		@Pc(45) int local45 = -1;
		this.method4285((local12 >> 3 & 0x7) + 1);
		this.aByte24 = (byte) (local12 >> 6 & 0x3);
		this.anInt5358 += (this.method4286() - local40) * 64;
		this.anInt5371 += (this.method4286() - local40) * 64;
		this.aByte25 = arg1.method2170();
		this.anInt5385 = arg1.method2170();
		this.anInt5394 = arg1.method2170();
		this.anInt5387 = 0;
		@Pc(120) int local120;
		@Pc(136) int local136;
		@Pc(142) int local142;
		@Pc(182) int local182;
		for (@Pc(111) int local111 = 0; local111 < 12; local111++) {
			local120 = arg1.method2146();
			if (local120 == 0) {
				local43[local111] = 0;
			} else {
				local136 = arg1.method2146();
				local142 = local136 + (local120 << 8);
				if (local111 == 0 && local142 == 65535) {
					local45 = arg1.method2130();
					this.anInt5387 = arg1.method2146();
					break;
				}
				if (local142 >= 32768) {
					local142 = Static278.anIntArray523[local142 - 32768];
					local43[local111] = local142 | 0x40000000;
					local182 = Static87.method1546(local142).anInt2256;
					if (local182 != 0) {
						this.anInt5387 = local182;
					}
				} else {
					local43[local111] = local142 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(204) int[] local204 = new int[5];
		for (local120 = 0; local120 < 5; local120++) {
			local136 = arg1.method2146();
			if (local136 < 0 || local136 >= Static249.aShortArrayArray8[local120].length) {
				local136 = 0;
			}
			local204[local120] = local136;
		}
		this.anInt5338 = arg1.method2130();
		this.aString185 = arg1.method2158();
		if (local32) {
			this.aString184 = arg1.method2158();
		} else {
			this.aString184 = this.aString185;
		}
		this.anInt5382 = arg1.method2146();
		if (local23) {
			this.anInt5404 = arg1.method2130();
			this.anInt5409 = this.anInt5382;
			this.anInt5381 = -1;
		} else {
			this.anInt5404 = 0;
			this.anInt5409 = arg1.method2146();
			this.anInt5381 = arg1.method2146();
			if (this.anInt5381 == 255) {
				this.anInt5381 = -1;
			}
		}
		local120 = this.anInt5401;
		this.anInt5401 = arg1.method2146();
		if (this.anInt5401 == 0) {
			Static170.method3082(arg0, this);
		} else {
			local136 = this.anInt5391;
			local182 = this.anInt5400;
			local142 = this.anInt5399;
			@Pc(325) int local325 = this.anInt5390;
			@Pc(328) int local328 = this.anInt5407;
			this.anInt5391 = arg1.method2130();
			this.anInt5399 = arg1.method2130();
			this.anInt5400 = arg1.method2130();
			this.anInt5390 = arg1.method2130();
			this.anInt5407 = arg1.method2146();
			if (local120 != this.anInt5401 || local136 != this.anInt5391 || local142 != this.anInt5399 || local182 != this.anInt5400 || local325 != this.anInt5390 || local328 != this.anInt5407) {
				Static213.method3557(arg0, this);
			}
		}
		if (this.aClass97_2 == null) {
			this.aClass97_2 = new Class97();
		}
		local136 = this.aClass97_2.anInt3399;
		this.aClass97_2.method2803(local43, local204, this.anInt5338, local36 == 1, local45);
		if (local136 != local45) {
			this.anInt5358 = this.anIntArray516[0] * 128 + this.method4286() * 64;
			this.anInt5371 = this.anIntArray518[0] * 128 + this.method4286() * 64;
		}
		if (this.aClass20_Sub2_6 != null) {
			this.aClass20_Sub2_6.method1688();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4303() {
		@Pc(3) String local3 = "";
		if (Static29.aStringArray3 != null) {
			local3 = local3 + Static29.aStringArray3[this.aByte24];
		}
		if (Static34.anIntArray77 != null && Static34.anIntArray77[this.aByte24] != -1) {
			@Pc(41) Class2_Sub8_Sub9 local41 = Static244.method3898(Static34.anIntArray77[this.aByte24]);
			if (local41.aChar2 == 's') {
				local3 = local3 + local41.method2030(this.aByte25 & 0xFF);
			} else {
				Static183.method3240(new Throwable(), "gdn1");
				Static34.anIntArray77[this.aByte24] = -1;
			}
		}
		local3 = local3 + this.aString185;
		if (Static246.aStringArray39 != null) {
			local3 = local3 + Static246.aStringArray39[this.aByte24];
		}
		return local3;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
	@Override
	public int method4274() {
		return this.anInt5348;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIII)V")
	public void method4305(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.method4287(arg2, arg1, arg0, this.method4286());
	}
}
