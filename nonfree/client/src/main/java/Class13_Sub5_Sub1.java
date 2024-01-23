import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class13_Sub5_Sub1 extends Class13_Sub5 {

	@OriginalMember(owner = "client!qe", name = "wc", descriptor = "Lclient!ve;")
	public Class175 aClass175_2;

	@OriginalMember(owner = "client!qe", name = "Kc", descriptor = "Ljava/lang/String;")
	public String aString148;

	@OriginalMember(owner = "client!qe", name = "Cc", descriptor = "I")
	public int anInt4455 = 0;

	@OriginalMember(owner = "client!qe", name = "xc", descriptor = "I")
	public int anInt4450 = 0;

	@OriginalMember(owner = "client!qe", name = "Gc", descriptor = "I")
	public int anInt4459 = -1;

	@OriginalMember(owner = "client!qe", name = "Jc", descriptor = "I")
	public int anInt4462 = 0;

	@OriginalMember(owner = "client!qe", name = "Fc", descriptor = "I")
	public int anInt4458 = -1;

	@OriginalMember(owner = "client!qe", name = "zc", descriptor = "I")
	public int anInt4452 = 0;

	@OriginalMember(owner = "client!qe", name = "yc", descriptor = "I")
	public int anInt4451 = 0;

	@OriginalMember(owner = "client!qe", name = "Nc", descriptor = "I")
	public int anInt4465 = -1;

	@OriginalMember(owner = "client!qe", name = "Uc", descriptor = "Z")
	public boolean aBoolean279 = false;

	@OriginalMember(owner = "client!qe", name = "Yc", descriptor = "I")
	public int anInt4474 = 255;

	@OriginalMember(owner = "client!qe", name = "Lc", descriptor = "I")
	public int anInt4463 = -1;

	@OriginalMember(owner = "client!qe", name = "Pc", descriptor = "I")
	public int anInt4466 = -1;

	@OriginalMember(owner = "client!qe", name = "Oc", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!qe", name = "Wc", descriptor = "I")
	public int anInt4472 = -1;

	@OriginalMember(owner = "client!qe", name = "bd", descriptor = "I")
	public int anInt4476 = -1;

	@OriginalMember(owner = "client!qe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub1_7 != null) {
			this.aClass21_Sub1_7.method1985();
		}
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method3494() {
		@Pc(8) String local8 = this.aString148;
		if (Static234.aStringArray31 != null) {
			local8 = Static234.aStringArray31[this.aByte15] + local8;
		}
		if (Static152.aStringArray18 != null) {
			local8 = local8 + Static152.aStringArray18[this.aByte15];
		}
		return local8;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean350) {
			if (this.aClass175_2 == null) {
				return;
			}
			@Pc(30) Class186 local30 = this.anInt5305 != -1 && this.anInt5251 == 0 ? Static51.method992(this.anInt5305) : null;
			@Pc(54) Class186 local54 = this.anInt5307 == -1 || this.aBoolean279 || this.anInt5307 == this.method4212().anInt1156 && local30 != null ? null : Static51.method992(this.anInt5307);
			@Pc(76) Class13_Sub1 local76 = this.aClass175_2.method4468(false, local54, this.anInt5249, local30, this.anInt5333, this.anInt5313, this.aClass170Array3, this.anInt5247, this.anInt5260, this.anInt5287);
			if (local76 == null) {
				return;
			}
			this.method4225(local76, null);
		}
		if (this.aClass21_Sub1_7 != null) {
			this.aClass21_Sub1_7.method1976(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)I")
	@Override
	protected int method4223() {
		return this.anInt5275;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		return this.anInt5296;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		if (this.aClass175_2 == null) {
			return;
		}
		@Pc(26) Class186 local26 = this.anInt5305 != -1 && this.anInt5251 == 0 ? Static51.method992(this.anInt5305) : null;
		@Pc(50) Class186 local50 = this.anInt5307 == -1 || this.aBoolean279 || this.anInt5307 == this.method4212().anInt1156 && local26 != null ? null : Static51.method992(this.anInt5307);
		@Pc(72) Class13_Sub1 local72 = this.aClass175_2.method4468(true, local50, this.anInt5249, local26, this.anInt5333, this.anInt5313, this.aClass170Array3, this.anInt5247, this.anInt5260, this.anInt5287);
		@Pc(75) int local75 = Static100.method1657();
		if (Static251.aBoolean330 && Static160.anInt3283 < 96 && local75 > 50) {
			Static173.method2812();
		}
		@Pc(99) int local99;
		if (Static29.anInt630 != 0 && local75 < 50) {
			local99 = 50 - local75;
			while (Static15.anInt320 < local99) {
				Static65.aByteArrayArray16[Static15.anInt320] = new byte[102400];
				Static15.anInt320++;
			}
			while (Static15.anInt320 > local99) {
				Static15.anInt320--;
				Static65.aByteArrayArray16[Static15.anInt320] = null;
			}
		}
		if (local72 == null) {
			return;
		}
		this.anInt5296 = local72.method4266();
		@Pc(182) Class13_Sub1 local182;
		if (Static114.aBoolean143 && (this.aClass175_2.anInt5594 == -1 || Static22.method458(this.aClass175_2.anInt5594).aBoolean399)) {
			local182 = Static178.method2920(arg0, this.anInt5315, this.anInt5334, 160, 0, local72, 240, this.aBoolean353, local50 == null ? this.anInt5249 : this.anInt5287, this.anInt5294, 1, 0, local50 == null ? local26 : local50);
			if (Static251.aBoolean330) {
				@Pc(186) float local186 = Static251.method3883();
				@Pc(188) float local188 = Static251.method3884();
				Static251.method3856();
				Static251.method3877(local186, local188 - 150.0F);
				local182.method4262(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static251.method3878();
				Static251.method3877(local186, local188);
			} else {
				local182.method4262(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static72.aClass13_Sub5_Sub1_1 == this) {
			for (local99 = Static56.aClass171Array1.length - 1; local99 >= 0; local99--) {
				@Pc(243) Class171 local243 = Static56.aClass171Array1[local99];
				if (local243 != null && local243.anInt5459 != -1) {
					@Pc(299) int local299;
					@Pc(289) int local289;
					if (local243.anInt5452 == 1 && local243.anInt5453 >= 0 && local243.anInt5453 < Static260.aClass13_Sub5_Sub2Array114.length) {
						@Pc(275) Class13_Sub5_Sub2 local275 = Static260.aClass13_Sub5_Sub2Array114[local243.anInt5453];
						if (local275 != null) {
							local289 = local275.anInt5294 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
							local299 = local275.anInt5334 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
							this.method3495(arg7, arg5, local299, arg3, 360000, local243.anInt5459, arg4, arg1, local72, arg0, arg6, null, arg2, arg9, local289);
						}
					}
					if (local243.anInt5452 == 2) {
						@Pc(338) int local338 = (local243.anInt5454 - Static269.anInt5357) * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
						local289 = local243.anInt5460 * 4;
						local289 *= local289;
						local299 = (local243.anInt5458 - Static105.anInt2105) * 4 + 2 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
						this.method3495(arg7, arg5, local338, arg3, local289, local243.anInt5459, arg4, arg1, local72, arg0, arg6, null, arg2, arg9, local299);
					}
					if (local243.anInt5452 == 10 && local243.anInt5453 >= 0 && local243.anInt5453 < Static100.aClass13_Sub5_Sub1Array1.length) {
						@Pc(402) Class13_Sub5_Sub1 local402 = Static100.aClass13_Sub5_Sub1Array1[local243.anInt5453];
						if (local402 != null) {
							local299 = local402.anInt5334 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5334 / 32;
							local289 = local402.anInt5294 / 32 - Static72.aClass13_Sub5_Sub1_1.anInt5294 / 32;
							this.method3495(arg7, arg5, local299, arg3, 360000, local243.anInt5459, arg4, arg1, local72, arg0, arg6, null, arg2, arg9, local289);
						}
					}
				}
			}
		}
		this.method4226(local72);
		this.method4214(local72, arg0);
		local182 = null;
		if (!this.aBoolean279 && this.anInt5291 != -1 && this.anInt5279 != -1) {
			@Pc(478) Class120 local478 = Static32.method639(this.anInt5291);
			local182 = local478.method3158(this.anInt5280, this.anInt5281, this.anInt5279);
			if (local182 != null) {
				local182.method2740(0, -this.anInt5304, 0);
				if (local478.aBoolean240) {
					if (Static144.anInt2843 != 0) {
						local182.method2733(Static144.anInt2843);
					}
					if (Static248.anInt4870 != 0) {
						local182.method2757(Static248.anInt4870);
					}
					if (Static266.anInt5237 != 0) {
						local182.method2740(0, Static266.anInt5237, 0);
					}
				}
			}
		}
		@Pc(527) Class13_Sub1 local527 = null;
		if (!this.aBoolean279 && this.anObject7 != null) {
			if (this.anInt5270 <= Static50.anInt1118) {
				this.anObject7 = null;
			}
			if (this.anInt5264 <= Static50.anInt1118 && this.anInt5270 > Static50.anInt1118) {
				if (this.anObject7 instanceof Class13_Sub2) {
					local527 = (Class13_Sub1) ((Class13_Sub2) this.anObject7).method563();
				} else {
					local527 = (Class13_Sub1) this.anObject7;
				}
				local527.method2740(this.anInt5321 - this.anInt5334, -this.anInt5315 + this.anInt5263, this.anInt5288 - this.anInt5294);
				if (this.anInt5266 == 512) {
					local527.method2747();
				} else if (this.anInt5266 == 1024) {
					local527.method2730();
				} else if (this.anInt5266 == 1536) {
					local527.method2745();
				}
			}
		}
		if (Static251.aBoolean330) {
			this.method4225(local72, local182);
			local72.aBoolean223 = true;
			local72.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_7);
			if (local182 != null) {
				if (this.aClass21_Sub1_7 != null) {
					@Pc(684) Class13_Sub1_Sub2 local684 = (Class13_Sub1_Sub2) local182;
					this.aClass21_Sub1_7.method1974(local684.aClass62Array2, local684.aClass88Array2, true, local684.anIntArray289, local684.anIntArray286, local684.anIntArray290);
				}
				local182.aBoolean223 = true;
				local182.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_7);
			}
		} else {
			if (local182 != null) {
				local72 = ((Class13_Sub1_Sub1) local72).method403(local182);
			}
			if (local527 != null) {
				local72 = ((Class13_Sub1_Sub1) local72).method403(local527);
			}
			this.method4225(local72, local182);
			local72.aBoolean223 = true;
			local72.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_7);
		}
		if (local527 == null) {
			return;
		}
		if (this.anInt5266 == 512) {
			local527.method2745();
		} else if (this.anInt5266 == 1024) {
			local527.method2730();
		} else if (this.anInt5266 == 1536) {
			local527.method2747();
		}
		local527.method2740(this.anInt5334 - this.anInt5321, -this.anInt5263 + this.anInt5315, this.anInt5294 - this.anInt5288);
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)I")
	@Override
	public int method4219() {
		return this.aClass175_2 == null || this.aClass175_2.anInt5594 == -1 ? super.method4219() : Static22.method458(this.aClass175_2.anInt5594).anInt5803;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIILclient!gk;IILclient!il;IIII)V")
	private void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class13_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class21_Sub1 arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(14) int local14 = arg2 * arg2 + arg14 * arg14;
		if (local14 < 16 || arg4 < local14) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg2, (double) arg14) * 325.949D) & 0x7FF;
		@Pc(50) Class13_Sub1 local50 = Static17.method308(arg5, this.anInt5334, local38, this.anInt5315, arg8, this.anInt5294);
		if (local50 == null) {
			return;
		}
		if (!Static251.aBoolean330) {
			local50.method4262(0, arg7, arg12, arg3, arg6, arg1, arg10, arg0, -1L, arg13, arg11);
			return;
		}
		@Pc(72) float local72 = Static251.method3883();
		@Pc(74) float local74 = Static251.method3884();
		Static251.method3856();
		Static251.method3877(local72, local74 - 150.0F);
		local50.method4262(0, arg7, arg12, arg3, arg6, arg1, arg10, arg0, -1L, arg13, arg11);
		Static251.method3878();
		Static251.method3877(local72, local74);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4213() {
		return this.aClass175_2 != null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZIB)V")
	public void method3496(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		super.method4221(arg1, arg2, this.method4219(), arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!pi;I)V")
	public void method3497(@OriginalArg(0) Class4_Sub24 arg0) {
		arg0.anInt3822 = 0;
		@Pc(12) int local12 = arg0.method3110();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(27) boolean local27 = (local12 & 0x4) != 0;
		@Pc(31) int local31 = super.method4219();
		this.method4217((local12 >> 3 & 0x7) + 1);
		this.aByte15 = (byte) (local12 >> 6 & 0x3);
		this.anInt5334 += (this.method4219() - local31) * 64;
		@Pc(66) int local66 = -1;
		@Pc(69) int[] local69 = new int[12];
		this.anInt5294 += (this.method4219() - local31) * 64;
		this.anInt4458 = arg0.method3069();
		this.anInt4476 = arg0.method3069();
		this.anInt4462 = 0;
		@Pc(108) int local108;
		@Pc(123) int local123;
		@Pc(129) int local129;
		@Pc(170) int local170;
		for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
			local108 = arg0.method3110();
			if (local108 == 0) {
				local69[local99] = 0;
			} else {
				local123 = arg0.method3110();
				local129 = (local108 << 8) + local123;
				if (local99 == 0 && local129 == 65535) {
					local66 = arg0.method3085();
					this.anInt4462 = arg0.method3110();
					break;
				}
				if (local129 >= 32768) {
					local129 = Static246.anIntArray385[local129 - 32768];
					local69[local99] = local129 | 0x40000000;
					local170 = Static187.method3128(local129).anInt1027;
					if (local170 != 0) {
						this.anInt4462 = local170;
					}
				} else {
					local69[local99] = Integer.MIN_VALUE | local129 - 256;
				}
			}
		}
		@Pc(194) int[] local194 = new int[5];
		for (local108 = 0; local108 < 5; local108++) {
			local123 = arg0.method3110();
			if (local123 < 0 || local123 >= Static56.aShortArrayArray1[local108].length) {
				local123 = 0;
			}
			local194[local108] = local123;
		}
		this.anInt5275 = arg0.method3085();
		@Pc(236) long local236 = arg0.method3113();
		this.aString148 = Static94.method1558(local236);
		this.anInt4452 = arg0.method3110();
		if (local27) {
			this.anInt4450 = arg0.method3085();
			this.anInt4451 = this.anInt4452;
			this.anInt4465 = -1;
		} else {
			this.anInt4450 = 0;
			this.anInt4451 = arg0.method3110();
			this.anInt4465 = arg0.method3110();
			if (this.anInt4465 == 255) {
				this.anInt4465 = -1;
			}
		}
		local129 = this.anInt4455;
		this.anInt4455 = arg0.method3110();
		if (this.anInt4455 == 0) {
			Static174.method2881(this);
		} else {
			local170 = this.anInt4459;
			@Pc(307) int local307 = this.anInt4474;
			@Pc(310) int local310 = this.anInt4466;
			@Pc(313) int local313 = this.anInt4472;
			@Pc(316) int local316 = this.anInt4463;
			this.anInt4459 = arg0.method3085();
			this.anInt4463 = arg0.method3085();
			this.anInt4472 = arg0.method3085();
			this.anInt4466 = arg0.method3085();
			this.anInt4474 = arg0.method3110();
			if (this.anInt4455 != local129 || local170 != this.anInt4459 || local316 != this.anInt4463 || this.anInt4472 != local313 || this.anInt4466 != local310 || local307 != this.anInt4474) {
				Static259.method4048(this);
			}
		}
		if (this.aClass175_2 == null) {
			this.aClass175_2 = new Class175();
		}
		local170 = this.aClass175_2.anInt5594;
		this.aClass175_2.method4474(local16 == 1, local194, local69, local66, this.anInt5275);
		if (local170 != local66) {
			this.anInt5334 = this.anIntArray411[0] * 128 + this.method4219() * 64;
			this.anInt5294 = this.anIntArray418[0] * 128 + this.method4219() * 64;
		}
		if (this.aClass21_Sub1_7 != null) {
			this.aClass21_Sub1_7.method1981();
		}
	}
}
