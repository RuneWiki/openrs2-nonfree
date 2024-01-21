import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class8_Sub3_Sub1 extends Class8_Sub3 {

	@OriginalMember(owner = "client!de", name = "Hb", descriptor = "I")
	public int anInt971;

	@OriginalMember(owner = "client!de", name = "Ob", descriptor = "I")
	public int anInt977;

	@OriginalMember(owner = "client!de", name = "Ub", descriptor = "I")
	public int anInt981;

	@OriginalMember(owner = "client!de", name = "Vb", descriptor = "Lclient!ee;")
	public Class8_Sub5 aClass8_Sub5_1;

	@OriginalMember(owner = "client!de", name = "Xb", descriptor = "I")
	public int anInt983;

	@OriginalMember(owner = "client!de", name = "Yb", descriptor = "I")
	public int anInt984;

	@OriginalMember(owner = "client!de", name = "Zb", descriptor = "I")
	public int anInt985;

	@OriginalMember(owner = "client!de", name = "bc", descriptor = "Lclient!vh;")
	public Class95 aClass95_18;

	@OriginalMember(owner = "client!de", name = "ec", descriptor = "Lclient!vd;")
	public Class92 aClass92_374;

	@OriginalMember(owner = "client!de", name = "gc", descriptor = "I")
	public int anInt990;

	@OriginalMember(owner = "client!de", name = "Kb", descriptor = "I")
	public int anInt974 = 0;

	@OriginalMember(owner = "client!de", name = "Mb", descriptor = "I")
	public int anInt975 = 0;

	@OriginalMember(owner = "client!de", name = "Sb", descriptor = "I")
	public int anInt979 = 0;

	@OriginalMember(owner = "client!de", name = "Qb", descriptor = "S")
	private short aShort1 = 0;

	@OriginalMember(owner = "client!de", name = "Wb", descriptor = "I")
	public int anInt982 = 0;

	@OriginalMember(owner = "client!de", name = "Ib", descriptor = "I")
	public int anInt972 = -1;

	@OriginalMember(owner = "client!de", name = "ic", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!de", name = "ac", descriptor = "I")
	public int anInt986 = 0;

	@OriginalMember(owner = "client!de", name = "jc", descriptor = "S")
	private short aShort2 = 0;

	@OriginalMember(owner = "client!de", name = "lc", descriptor = "I")
	public int anInt993 = -1;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2681() {
		return this.aClass95_18 != null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		return super.anInt3598;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass95_18 == null) {
			return;
		}
		@Pc(26) Class1_Sub3_Sub20 local26 = super.anInt3575 != -1 && super.anInt3589 == 0 ? Static84.method1279(super.anInt3575) : null;
		@Pc(51) Class1_Sub3_Sub20 local51 = super.anInt3616 == -1 || this.aBoolean62 || super.anInt3616 == super.anInt3574 && local26 != null ? null : Static84.method1279(super.anInt3616);
		@Pc(62) Class8_Sub5 local62 = this.aClass95_18.method3298(super.anInt3566, local51, local26, super.anInt3570);
		if (local62 == null) {
			return;
		}
		super.anInt3598 = local62.method2668();
		@Pc(77) int local77;
		@Pc(127) int local127;
		@Pc(138) int local138;
		@Pc(176) int local176;
		if (Static15.aClass8_Sub3_Sub1_1 == this) {
			for (local77 = Static117.aClass55Array1.length - 1; local77 >= 0; local77--) {
				@Pc(83) Class55 local83 = Static117.aClass55Array1[local77];
				if (local83 != null && local83.anInt2283 != -1) {
					if (local83.anInt2276 == 1 && local83.anInt2281 >= 0 && Static177.aClass8_Sub3_Sub2Array1.length > local83.anInt2281) {
						@Pc(114) Class8_Sub3_Sub2 local114 = Static177.aClass8_Sub3_Sub2Array1[local83.anInt2281];
						if (local114 != null) {
							local127 = local114.anInt3600 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
							local138 = local114.anInt3606 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
							this.method657(local127, local138, arg5, arg6, arg0, arg1, arg4, local83.anInt2283, arg7, arg3, arg2, local62);
						}
					}
					if (local83.anInt2276 == 2) {
						local176 = (local83.anInt2280 - Static100.anInt2141) * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
						local127 = (local83.anInt2274 - Static138.anInt2800) * 4 + 2 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
						this.method657(local176, local127, arg5, arg6, arg0, arg1, arg4, local83.anInt2283, arg7, arg3, arg2, local62);
					}
					if (local83.anInt2276 == 10 && local83.anInt2281 >= 0 && Static47.aClass8_Sub3_Sub1Array1.length > local83.anInt2281) {
						@Pc(227) Class8_Sub3_Sub1 local227 = Static47.aClass8_Sub3_Sub1Array1[local83.anInt2281];
						if (local227 != null) {
							local127 = local227.anInt3600 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3600 / 32;
							local138 = local227.anInt3606 / 32 - Static15.aClass8_Sub3_Sub1_1.anInt3606 / 32;
							this.method657(local127, local138, arg5, arg6, arg0, arg1, arg4, local83.anInt2283, arg7, arg3, arg2, local62);
						}
					}
				}
			}
		}
		@Pc(271) int local271 = 0;
		local77 = 0;
		local176 = 0;
		if (this.aShort2 != 0 && this.aShort1 != 0) {
			local127 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg0];
			@Pc(291) short local291 = this.aShort1;
			@Pc(294) short local294 = this.aShort2;
			local138 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg0];
			@Pc(303) int local303 = -local294 / 2;
			@Pc(308) int local308 = -local291 / 2;
			@Pc(319) int local319 = local138 * local308 - local303 * local127 >> 16;
			@Pc(330) int local330 = local308 * local127 + local138 * local303 >> 16;
			@Pc(342) int local342 = Static64.method1027(local319 + super.anInt3606, super.anInt3600 + local330, Static192.anInt4180);
			@Pc(347) int local347 = -local291 / 2;
			@Pc(351) int local351 = local294 / 2;
			@Pc(361) int local361 = local351 * local138 + local347 * local127 >> 16;
			@Pc(372) int local372 = local347 * local138 - local351 * local127 >> 16;
			@Pc(376) int local376 = local291 / 2;
			@Pc(381) int local381 = -local294 / 2;
			@Pc(392) int local392 = local376 * local127 + local138 * local381 >> 16;
			@Pc(403) int local403 = local138 * local376 - local127 * local381 >> 16;
			@Pc(407) int local407 = local294 / 2;
			@Pc(420) int local420 = Static64.method1027(local372 + super.anInt3606, super.anInt3600 - -local361, Static192.anInt4180);
			@Pc(424) int local424 = local291 / 2;
			@Pc(434) int local434 = local407 * local138 + local424 * local127 >> 16;
			@Pc(445) int local445 = local138 * local424 - local407 * local127 >> 16;
			@Pc(457) int local457 = Static64.method1027(super.anInt3606 + local403, local392 + super.anInt3600, Static192.anInt4180);
			@Pc(464) int local464 = local342 >= local420 ? local420 : local342;
			@Pc(476) int local476 = Static64.method1027(super.anInt3606 + local445, super.anInt3600 + local434, Static192.anInt4180);
			@Pc(487) int local487 = local457 >= local476 ? local476 : local457;
			@Pc(498) int local498 = local476 <= local420 ? local476 : local420;
			local176 = local476 + local342;
			local77 = (int) (Math.atan2((double) (local464 - local487), (double) local291) * 325.95D) & 0x7FF;
			if (local176 > local457 + local420) {
				local176 = local420 + local457;
			}
			if (local77 != 0) {
				local62.method2045(local77);
			}
			@Pc(541) int local541 = local342 >= local457 ? local457 : local342;
			local271 = (int) (Math.atan2((double) (local541 - local498), (double) local294) * 325.95D) & 0x7FF;
			if (local271 != 0) {
				local62.method2050(local271);
			}
			local176 = (local176 >> 1) - super.anInt3563;
			if (local176 != 0) {
				local62.method2039(0, local176, 0);
			}
		}
		@Pc(582) Class8_Sub5 local582 = null;
		if (!this.aBoolean62 && super.anInt3564 != -1 && super.anInt3608 != -1) {
			@Pc(599) Class1_Sub3_Sub11 local599 = Static116.method1724(super.anInt3564);
			local582 = local599.method1317(super.anInt3608);
			if (local582 != null) {
				local582.method2039(0, -super.anInt3591, 0);
				if (local599.aBoolean113) {
					if (local77 != 0) {
						local582.method2045(local77);
					}
					if (local271 != 0) {
						local582.method2050(local271);
					}
					if (local176 != 0) {
						local582.method2039(0, local176, 0);
					}
				}
			}
		}
		@Pc(639) Class8_Sub5 local639 = null;
		if (!this.aBoolean62 && this.aClass8_Sub5_1 != null) {
			if (Static155.anInt2981 >= this.anInt974) {
				this.aClass8_Sub5_1 = null;
			}
			if (Static155.anInt2981 >= this.anInt979 && Static155.anInt2981 < this.anInt974) {
				local639 = this.aClass8_Sub5_1;
				local639.method2039(this.anInt985 - super.anInt3600, this.anInt990 + -super.anInt3563, this.anInt977 - super.anInt3606);
				if (super.anInt3577 == 512) {
					local639.method2051();
				} else if (super.anInt3577 == 1024) {
					local639.method2053();
				} else if (super.anInt3577 == 1536) {
					local639.method2047();
				}
			}
		}
		if (local582 != null) {
			local62 = ((Class8_Sub5_Sub1) local62).method2057(local582);
		}
		if (local639 != null) {
			local62 = ((Class8_Sub5_Sub1) local62).method2057(local639);
		}
		local62.aBoolean163 = true;
		local62.method2672(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local639 == null) {
			return;
		}
		if (super.anInt3577 == 512) {
			local639.method2047();
		} else if (super.anInt3577 == 1024) {
			local639.method2053();
		} else if (super.anInt3577 == 1536) {
			local639.method2051();
		}
		local639.method2039(super.anInt3600 - this.anInt985, super.anInt3563 - this.anInt990, super.anInt3606 - this.anInt977);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ka;B)V")
	public void method655(@OriginalArg(0) Class1_Sub14 arg0) {
		arg0.anInt4061 = 0;
		@Pc(17) int local17 = arg0.method3010();
		if ((local17 & 0x2) == 2) {
			this.aShort2 = (short) (arg0.method3010() << 2);
			this.aShort1 = (short) (arg0.method3010() << 2);
		} else {
			this.aShort1 = 0;
			this.aShort2 = 0;
		}
		super.anInt3583 = (local17 >> 3) + 1;
		@Pc(57) int local57 = local17 & 0x1;
		this.anInt972 = arg0.method3009();
		@Pc(64) int local64 = -1;
		@Pc(72) boolean local72 = (local17 & 0x4) != 0;
		this.anInt993 = arg0.method3009();
		@Pc(80) int[] local80 = new int[12];
		this.anInt986 = 0;
		@Pc(106) int local106;
		@Pc(112) int local112;
		for (@Pc(85) int local85 = 0; local85 < 12; local85++) {
			@Pc(91) int local91 = arg0.method3010();
			if (local91 == 0) {
				local80[local85] = 0;
			} else {
				local106 = arg0.method3010();
				local112 = local106 + (local91 << 8);
				if (local85 == 0 && local112 == 65535) {
					local64 = arg0.method3023();
					break;
				}
				if (local112 >= 32768) {
					local112 = Static107.anIntArray175[local112 - 32768];
					local80[local85] = local112 | 0x40000000;
					@Pc(143) int local143 = Static102.method1549(local112).anInt3891;
					if (local143 != 0) {
						this.anInt986 = local143;
					}
				} else {
					local80[local85] = local112 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(165) int[] local165 = new int[5];
		for (local106 = 0; local106 < 5; local106++) {
			local112 = arg0.method3010();
			if (local112 < 0 || Static186.aShortArrayArray4[local106].length <= local112) {
				local112 = 0;
			}
			local165[local106] = local112;
		}
		super.anInt3574 = arg0.method3023();
		if (super.anInt3574 == 65535) {
			super.anInt3574 = -1;
		}
		super.anInt3601 = arg0.method3023();
		if (super.anInt3601 == 65535) {
			super.anInt3601 = -1;
		}
		super.anInt3571 = super.anInt3601;
		super.anInt3610 = arg0.method3023();
		if (super.anInt3610 == 65535) {
			super.anInt3610 = -1;
		}
		super.anInt3576 = arg0.method3023();
		if (super.anInt3576 == 65535) {
			super.anInt3576 = -1;
		}
		super.anInt3565 = arg0.method3023();
		if (super.anInt3565 == 65535) {
			super.anInt3565 = -1;
		}
		super.anInt3602 = arg0.method3023();
		if (super.anInt3602 == 65535) {
			super.anInt3602 = -1;
		}
		super.anInt3596 = arg0.method3023();
		if (super.anInt3596 == 65535) {
			super.anInt3596 = -1;
		}
		this.aClass92_374 = Static179.method2937(arg0.method3057()).method3198();
		this.anInt975 = arg0.method3010();
		if (local72) {
			this.anInt982 = arg0.method3023();
		} else {
			this.anInt982 = 0;
		}
		if (this.aClass95_18 == null) {
			this.aClass95_18 = new Class95();
		}
		this.aClass95_18.method3303(local57 == 1, local80, local64, local165);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIBIIIILclient!ee;)V")
	private void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class8_Sub5 arg11) {
		if (arg1 * arg1 + arg0 * arg0 > 360000) {
			return;
		}
		@Pc(30) int local30 = (int) (Math.atan2((double) arg0, (double) arg1) * 325.949D) & 0x7FF;
		@Pc(42) Class8_Sub5 local42 = Static80.method1238(super.anInt3606, super.anInt3563, super.anInt3600, arg11, arg7, local30);
		if (local42 != null) {
			local42.method2672(0, arg5, arg10, arg9, arg6, arg2, arg3, arg8, -1L);
		}
	}
}
