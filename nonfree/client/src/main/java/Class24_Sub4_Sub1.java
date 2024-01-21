import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class24_Sub4_Sub1 extends Class24_Sub4 {

	@OriginalMember(owner = "client!kg", name = "Rb", descriptor = "I")
	public int anInt2287;

	@OriginalMember(owner = "client!kg", name = "Xb", descriptor = "I")
	public int anInt2293;

	@OriginalMember(owner = "client!kg", name = "cc", descriptor = "I")
	public int anInt2297;

	@OriginalMember(owner = "client!kg", name = "gc", descriptor = "I")
	public int anInt2301;

	@OriginalMember(owner = "client!kg", name = "jc", descriptor = "I")
	public int anInt2304;

	@OriginalMember(owner = "client!kg", name = "kc", descriptor = "Lclient!jc;")
	public Class49 aClass49_2;

	@OriginalMember(owner = "client!kg", name = "lc", descriptor = "Lclient!qe;")
	public Class83 aClass83_664;

	@OriginalMember(owner = "client!kg", name = "nc", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!kg", name = "oc", descriptor = "Lclient!gj;")
	public Class24_Sub3 aClass24_Sub3_1;

	@OriginalMember(owner = "client!kg", name = "tc", descriptor = "I")
	public int anInt2310;

	@OriginalMember(owner = "client!kg", name = "Ob", descriptor = "S")
	private short aShort1 = 0;

	@OriginalMember(owner = "client!kg", name = "Sb", descriptor = "I")
	public int anInt2288 = -1;

	@OriginalMember(owner = "client!kg", name = "Pb", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!kg", name = "Yb", descriptor = "I")
	public int anInt2294 = 0;

	@OriginalMember(owner = "client!kg", name = "bc", descriptor = "I")
	public int anInt2296 = -1;

	@OriginalMember(owner = "client!kg", name = "ac", descriptor = "S")
	private short aShort2 = 0;

	@OriginalMember(owner = "client!kg", name = "ec", descriptor = "I")
	public int anInt2299 = 0;

	@OriginalMember(owner = "client!kg", name = "fc", descriptor = "I")
	public int anInt2300 = 0;

	@OriginalMember(owner = "client!kg", name = "Zb", descriptor = "I")
	public int anInt2295 = 0;

	@OriginalMember(owner = "client!kg", name = "qc", descriptor = "I")
	public int anInt2307 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass49_2 == null) {
			return;
		}
		@Pc(23) Class2_Sub2_Sub16 local23 = super.anInt3336 != -1 && super.anInt3297 == 0 ? Static213.method3229(super.anInt3336) : null;
		@Pc(44) Class2_Sub2_Sub16 local44 = super.anInt3310 == -1 || this.aBoolean113 || super.anInt3310 == super.anInt3290 && local23 != null ? null : Static213.method3229(super.anInt3310);
		@Pc(55) Class24_Sub3 local55 = this.aClass49_2.method1521(local44, super.anInt3313, local23, super.anInt3322);
		if (local55 == null) {
			return;
		}
		super.anInt3307 = local55.method2978();
		@Pc(70) int local70;
		@Pc(120) int local120;
		@Pc(131) int local131;
		@Pc(167) int local167;
		if (Static54.aClass24_Sub4_Sub1_1 == this) {
			for (local70 = Static163.aClass76Array1.length - 1; local70 >= 0; local70--) {
				@Pc(76) Class76 local76 = Static163.aClass76Array1[local70];
				if (local76 != null && local76.anInt3012 != -1) {
					if (local76.anInt3018 == 1 && local76.anInt3019 >= 0 && Static47.aClass24_Sub4_Sub2Array1.length > local76.anInt3019) {
						@Pc(107) Class24_Sub4_Sub2 local107 = Static47.aClass24_Sub4_Sub2Array1[local76.anInt3019];
						if (local107 != null) {
							local120 = local107.anInt3316 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
							local131 = local107.anInt3349 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
							this.method1732(arg3, arg5, local120, arg4, arg0, local55, arg6, arg1, local131, arg2, local76.anInt3012, arg7);
						}
					}
					if (local76.anInt3018 == 2) {
						local167 = (local76.anInt3017 - Static2.anInt57) * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
						local120 = (-Static123.anInt2755 + local76.anInt3015) * 4 + 2 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
						this.method1732(arg3, arg5, local167, arg4, arg0, local55, arg6, arg1, local120, arg2, local76.anInt3012, arg7);
					}
					if (local76.anInt3018 == 10 && local76.anInt3019 >= 0 && local76.anInt3019 < Static22.aClass24_Sub4_Sub1Array1.length) {
						@Pc(218) Class24_Sub4_Sub1 local218 = Static22.aClass24_Sub4_Sub1Array1[local76.anInt3019];
						if (local218 != null) {
							local131 = local218.anInt3349 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3349 / 32;
							local120 = local218.anInt3316 / 32 - Static54.aClass24_Sub4_Sub1_1.anInt3316 / 32;
							this.method1732(arg3, arg5, local120, arg4, arg0, local55, arg6, arg1, local131, arg2, local76.anInt3012, arg7);
						}
					}
				}
			}
		}
		local70 = 0;
		@Pc(263) int local263 = 0;
		local167 = 0;
		if (this.aShort1 != 0 && this.aShort2 != 0) {
			local131 = Class16.anIntArray39[arg0];
			local120 = Class16.anIntArray44[arg0];
			@Pc(288) short local288 = this.aShort1;
			@Pc(291) short local291 = this.aShort2;
			@Pc(296) int local296 = -local291 / 2;
			@Pc(301) int local301 = -local288 / 2;
			@Pc(312) int local312 = local120 * local296 + local301 * local131 >> 16;
			@Pc(322) int local322 = local131 * local296 - local301 * local120 >> 16;
			@Pc(335) int local335 = Static177.method2711(super.anInt3316 + local312, Static43.anInt1126, local322 + super.anInt3349);
			@Pc(339) int local339 = local288 / 2;
			@Pc(344) int local344 = -local291 / 2;
			@Pc(354) int local354 = local131 * local344 - local120 * local339 >> 16;
			@Pc(359) int local359 = -local288 / 2;
			@Pc(363) int local363 = local291 / 2;
			@Pc(373) int local373 = local120 * local344 + local339 * local131 >> 16;
			@Pc(384) int local384 = local363 * local131 - local359 * local120 >> 16;
			@Pc(396) int local396 = Static177.method2711(super.anInt3316 + local373, Static43.anInt1126, super.anInt3349 + local354);
			@Pc(406) int local406 = local359 * local131 + local120 * local363 >> 16;
			@Pc(410) int local410 = local288 / 2;
			@Pc(423) int local423 = Static177.method2711(local406 + super.anInt3316, Static43.anInt1126, super.anInt3349 + local384);
			@Pc(427) int local427 = local291 / 2;
			@Pc(438) int local438 = local131 * local427 - local410 * local120 >> 16;
			@Pc(448) int local448 = local131 * local410 + local427 * local120 >> 16;
			@Pc(460) int local460 = Static177.method2711(local448 + super.anInt3316, Static43.anInt1126, local438 + super.anInt3349);
			local167 = local335 + local460;
			if (local396 + local423 < local167) {
				local167 = local396 + local423;
			}
			@Pc(489) int local489 = local396 <= local335 ? local396 : local335;
			@Pc(500) int local500 = local460 <= local423 ? local460 : local423;
			@Pc(507) int local507 = local460 > local396 ? local396 : local460;
			local70 = (int) (Math.atan2((double) (local489 - local500), (double) local291) * 325.95D) & 0x7FF;
			@Pc(527) int local527 = local423 > local335 ? local335 : local423;
			if (local70 != 0) {
				local55.method2736(local70);
			}
			local263 = (int) (Math.atan2((double) (local527 - local507), (double) local288) * 325.95D) & 0x7FF;
			if (local263 != 0) {
				local55.method2733(local263);
			}
			local167 = (local167 >> 1) - super.anInt3303;
			if (local167 != 0) {
				local55.method2728(0, local167, 0);
			}
		}
		@Pc(571) Class24_Sub3 local571 = null;
		if (!this.aBoolean113 && super.anInt3311 != -1 && super.anInt3343 != -1) {
			@Pc(588) Class2_Sub2_Sub8 local588 = Static158.method2448(super.anInt3311);
			local571 = local588.method955(super.anInt3343);
			if (local571 != null) {
				local571.method2728(0, -super.anInt3296, 0);
				if (local588.aBoolean71) {
					if (local70 != 0) {
						local571.method2736(local70);
					}
					if (local263 != 0) {
						local571.method2733(local263);
					}
					if (local167 != 0) {
						local571.method2728(0, local167, 0);
					}
				}
			}
		}
		@Pc(631) Class24_Sub3 local631 = null;
		if (!this.aBoolean113 && this.aClass24_Sub3_1 != null) {
			if (Static13.anInt386 >= this.anInt2295) {
				this.aClass24_Sub3_1 = null;
			}
			if (this.anInt2294 <= Static13.anInt386 && this.anInt2295 > Static13.anInt386) {
				local631 = this.aClass24_Sub3_1;
				local631.method2728(this.anInt2301 - super.anInt3316, this.anInt2304 + -super.anInt3303, this.anInt2287 - super.anInt3349);
				if (super.anInt3318 == 512) {
					local631.method2729();
				} else if (super.anInt3318 == 1024) {
					local631.method2740();
				} else if (super.anInt3318 == 1536) {
					local631.method2724();
				}
			}
		}
		if (local571 != null) {
			local55 = ((Class24_Sub3_Sub1) local55).method2742(local571);
		}
		if (local631 != null) {
			local55 = ((Class24_Sub3_Sub1) local55).method2742(local631);
		}
		local55.aBoolean170 = true;
		local55.method2974(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local631 == null) {
			return;
		}
		if (super.anInt3318 == 512) {
			local631.method2724();
		} else if (super.anInt3318 == 1024) {
			local631.method2740();
		} else if (super.anInt3318 == 1536) {
			local631.method2729();
		}
		local631.method2728(super.anInt3316 - this.anInt2301, -this.anInt2304 + super.anInt3303, super.anInt3349 - this.anInt2287);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLclient!ra;)V")
	public void method1731(@OriginalArg(1) Class2_Sub3 arg0) {
		arg0.anInt340 = 0;
		@Pc(12) int local12 = arg0.method260();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(24) boolean local24 = (local12 & 0x4) != 0;
		if ((local12 & 0x2) == 2) {
			this.aShort1 = (short) (arg0.method260() << 2);
			this.aShort2 = (short) (arg0.method260() << 2);
		} else {
			this.aShort1 = 0;
			this.aShort2 = 0;
		}
		super.anInt3332 = (local12 >> 3) + 1;
		this.anInt2288 = arg0.method221();
		@Pc(71) int local71 = -1;
		@Pc(74) int[] local74 = new int[12];
		this.anInt2296 = arg0.method221();
		this.anInt2307 = 0;
		@Pc(105) int local105;
		@Pc(111) int local111;
		for (@Pc(84) int local84 = 0; local84 < 12; local84++) {
			@Pc(90) int local90 = arg0.method260();
			if (local90 == 0) {
				local74[local84] = 0;
			} else {
				local105 = arg0.method260();
				local111 = (local90 << 8) + local105;
				if (local84 == 0 && local111 == 65535) {
					local71 = arg0.method269();
					break;
				}
				if (local111 >= 32768) {
					local111 = Static185.anIntArray368[local111 - 32768];
					local74[local84] = local111 | 0x40000000;
					@Pc(144) int local144 = Static113.method1987(local111).anInt456;
					if (local144 != 0) {
						this.anInt2307 = local144;
					}
				} else {
					local74[local84] = local111 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(168) int[] local168 = new int[5];
		for (local105 = 0; local105 < 5; local105++) {
			local111 = arg0.method260();
			if (local111 < 0 || local111 >= Static105.aShortArrayArray3[local105].length) {
				local111 = 0;
			}
			local168[local105] = local111;
		}
		super.anInt3290 = arg0.method269();
		if (super.anInt3290 == 65535) {
			super.anInt3290 = -1;
		}
		super.anInt3327 = arg0.method269();
		if (super.anInt3327 == 65535) {
			super.anInt3327 = -1;
		}
		super.anInt3328 = super.anInt3327;
		super.anInt3289 = arg0.method269();
		if (super.anInt3289 == 65535) {
			super.anInt3289 = -1;
		}
		super.anInt3292 = arg0.method269();
		if (super.anInt3292 == 65535) {
			super.anInt3292 = -1;
		}
		super.anInt3324 = arg0.method269();
		if (super.anInt3324 == 65535) {
			super.anInt3324 = -1;
		}
		super.anInt3350 = arg0.method269();
		if (super.anInt3350 == 65535) {
			super.anInt3350 = -1;
		}
		super.anInt3341 = arg0.method269();
		if (super.anInt3341 == 65535) {
			super.anInt3341 = -1;
		}
		this.aClass83_664 = Static12.method296(arg0.method243()).method2400();
		this.anInt2299 = arg0.method260();
		if (local24) {
			this.anInt2300 = arg0.method269();
		} else {
			this.anInt2300 = 0;
		}
		if (this.aClass49_2 == null) {
			this.aClass49_2 = new Class49();
		}
		this.aClass49_2.method1512(local74, local168, local16 == 1, local71);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method2521() {
		return this.aClass49_2 != null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		return super.anInt3307;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIILclient!gj;IIIIIII)V")
	private void method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class24_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg8 * arg8 + arg2 * arg2 > 360000) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg2, (double) arg8) * 325.949D) & 0x7FF;
		@Pc(44) Class24_Sub3 local44 = Static11.method294(local32, super.anInt3316, super.anInt3349, arg10, arg5, super.anInt3303);
		if (local44 != null) {
			local44.method2974(0, arg7, arg9, arg0, arg3, arg1, arg6, arg11, -1L);
		}
	}
}
