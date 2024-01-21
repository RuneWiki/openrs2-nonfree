import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!bh", name = "zc", descriptor = "Lclient!bf;")
	public Class6_Sub3 aClass6_Sub3_1;

	@OriginalMember(owner = "client!bh", name = "Bc", descriptor = "Lclient!oc;")
	public Class65 aClass65_479;

	@OriginalMember(owner = "client!bh", name = "Gc", descriptor = "I")
	public int anInt596;

	@OriginalMember(owner = "client!bh", name = "Kc", descriptor = "I")
	public int anInt599;

	@OriginalMember(owner = "client!bh", name = "Wc", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!bh", name = "Xc", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!bh", name = "Yc", descriptor = "Lclient!di;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!bh", name = "ad", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!bh", name = "cd", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!bh", name = "ed", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!bh", name = "Jc", descriptor = "I")
	public int anInt598 = 0;

	@OriginalMember(owner = "client!bh", name = "Nc", descriptor = "I")
	public int anInt601 = 0;

	@OriginalMember(owner = "client!bh", name = "Fc", descriptor = "I")
	public int anInt595 = -1;

	@OriginalMember(owner = "client!bh", name = "Hc", descriptor = "S")
	private short aShort10 = 0;

	@OriginalMember(owner = "client!bh", name = "Ec", descriptor = "I")
	public int anInt594 = 0;

	@OriginalMember(owner = "client!bh", name = "Uc", descriptor = "I")
	public int anInt606 = 0;

	@OriginalMember(owner = "client!bh", name = "yc", descriptor = "S")
	private short aShort9 = 0;

	@OriginalMember(owner = "client!bh", name = "Mc", descriptor = "I")
	public int anInt600 = -1;

	@OriginalMember(owner = "client!bh", name = "dd", descriptor = "I")
	public int anInt613 = 0;

	@OriginalMember(owner = "client!bh", name = "Zc", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		return super.anInt3962;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!bf;IIIIIIIIIIIB)V")
	private void method377(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 * arg6 + arg7 * arg7 > 360000) {
			return;
		}
		@Pc(32) int local32 = (int) (Math.atan2((double) arg7, (double) arg6) * 325.949D) & 0x7FF;
		@Pc(44) Class6_Sub3 local44 = Static126.method2389(arg0, super.anInt3943, super.anInt3934, super.anInt3976, arg9, local32);
		if (local44 != null) {
			local44.method2989(0, arg10, arg11, arg4, arg8, arg5, arg3, arg1, -1L);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!wa;)V")
	public void method378(@OriginalArg(1) Class1_Sub14 arg0) {
		arg0.anInt2306 = 0;
		@Pc(10) int local10 = arg0.method1738();
		if ((local10 & 0x2) == 2) {
			this.aShort10 = (short) (arg0.method1738() << 2);
			this.aShort9 = (short) (arg0.method1738() << 2);
		} else {
			this.aShort10 = 0;
			this.aShort9 = 0;
		}
		super.anInt3959 = (local10 >> 3) + 1;
		@Pc(55) boolean local55 = (local10 & 0x4) != 0;
		@Pc(57) int local57 = -1;
		@Pc(61) int local61 = local10 & 0x1;
		this.anInt600 = arg0.method1720();
		this.anInt595 = arg0.method1720();
		this.anInt613 = 0;
		@Pc(77) int[] local77 = new int[12];
		@Pc(98) int local98;
		@Pc(104) int local104;
		for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
			@Pc(84) int local84 = arg0.method1738();
			if (local84 == 0) {
				local77[local79] = 0;
			} else {
				local98 = arg0.method1738();
				local104 = local98 + (local84 << 8);
				if (local79 == 0 && local104 == 65535) {
					local57 = arg0.method1753();
					break;
				}
				if (local104 >= 32768) {
					local104 = Static159.anIntArray428[local104 - 32768];
					local77[local79] = local104 | 0x40000000;
					@Pc(134) int local134 = Static40.method700(local104).anInt288;
					if (local134 != 0) {
						this.anInt613 = local134;
					}
				} else {
					local77[local79] = local104 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(162) int[] local162 = new int[5];
		for (local98 = 0; local98 < 5; local98++) {
			local104 = arg0.method1738();
			if (local104 < 0 || local104 >= Static168.aShortArrayArray5[local98].length) {
				local104 = 0;
			}
			local162[local98] = local104;
		}
		super.anInt3954 = arg0.method1753();
		if (super.anInt3954 == 65535) {
			super.anInt3954 = -1;
		}
		super.anInt3981 = arg0.method1753();
		if (super.anInt3981 == 65535) {
			super.anInt3981 = -1;
		}
		super.anInt3930 = super.anInt3981;
		super.anInt3972 = arg0.method1753();
		if (super.anInt3972 == 65535) {
			super.anInt3972 = -1;
		}
		super.anInt3932 = arg0.method1753();
		if (super.anInt3932 == 65535) {
			super.anInt3932 = -1;
		}
		super.anInt3938 = arg0.method1753();
		if (super.anInt3938 == 65535) {
			super.anInt3938 = -1;
		}
		super.anInt3969 = arg0.method1753();
		if (super.anInt3969 == 65535) {
			super.anInt3969 = -1;
		}
		super.anInt3927 = arg0.method1753();
		if (super.anInt3927 == 65535) {
			super.anInt3927 = -1;
		}
		this.aClass65_479 = Static134.method2558(arg0.method1732()).method2488();
		this.anInt606 = arg0.method1738();
		if (local55) {
			this.anInt601 = arg0.method1753();
		} else {
			this.anInt601 = 0;
		}
		if (this.aClass19_1 == null) {
			this.aClass19_1 = new Class19();
		}
		this.aClass19_1.method697(local57, local61 == 1, local162, local77);
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2996() {
		return this.aClass19_1 != null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass19_1 == null) {
			return;
		}
		@Pc(27) Class1_Sub2_Sub14 local27 = super.anInt3945 != -1 && super.anInt3956 == 0 ? Static173.method2924(super.anInt3945) : null;
		@Pc(52) Class1_Sub2_Sub14 local52 = super.anInt3946 == -1 || this.aBoolean25 || super.anInt3946 == super.anInt3954 && local27 != null ? null : Static173.method2924(super.anInt3946);
		@Pc(63) Class6_Sub3 local63 = this.aClass19_1.method698(super.anInt3968, super.anInt3933, local52, local27);
		if (local63 == null) {
			return;
		}
		super.anInt3962 = local63.method2984();
		@Pc(78) int local78;
		@Pc(126) int local126;
		@Pc(137) int local137;
		@Pc(172) int local172;
		if (Static201.aClass6_Sub4_Sub1_3 == this) {
			for (local78 = Static44.aClass49Array1.length - 1; local78 >= 0; local78--) {
				@Pc(84) Class49 local84 = Static44.aClass49Array1[local78];
				if (local84 != null && local84.anInt2326 != -1) {
					if (local84.anInt2337 == 1 && local84.anInt2327 >= 0 && local84.anInt2327 < Static106.aClass6_Sub4_Sub2Array1.length) {
						@Pc(113) Class6_Sub4_Sub2 local113 = Static106.aClass6_Sub4_Sub2Array1[local84.anInt2327];
						if (local113 != null) {
							local126 = local113.anInt3934 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
							local137 = local113.anInt3976 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
							this.method377(local63, arg7, arg0, arg6, arg3, arg5, local137, local126, arg4, local84.anInt2326, arg1, arg2);
						}
					}
					if (local84.anInt2337 == 2) {
						local172 = (local84.anInt2336 - Static205.anInt4337) * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
						local126 = (local84.anInt2331 - Static58.anInt1543) * 4 + 2 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
						this.method377(local63, arg7, arg0, arg6, arg3, arg5, local126, local172, arg4, local84.anInt2326, arg1, arg2);
					}
					if (local84.anInt2337 == 10 && local84.anInt2327 >= 0 && Static158.aClass6_Sub4_Sub1Array1.length > local84.anInt2327) {
						@Pc(230) Class6_Sub4_Sub1 local230 = Static158.aClass6_Sub4_Sub1Array1[local84.anInt2327];
						if (local230 != null) {
							local126 = local230.anInt3934 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3934 / 32;
							local137 = local230.anInt3976 / 32 - Static201.aClass6_Sub4_Sub1_3.anInt3976 / 32;
							this.method377(local63, arg7, arg0, arg6, arg3, arg5, local137, local126, arg4, local84.anInt2326, arg1, arg2);
						}
					}
				}
			}
		}
		@Pc(274) int local274 = 0;
		local78 = 0;
		local172 = 0;
		if (this.aShort10 != 0 && this.aShort9 != 0) {
			local126 = Class1_Sub2_Sub5_Sub2.anIntArray138[arg0];
			@Pc(297) short local297 = this.aShort10;
			local137 = Class1_Sub2_Sub5_Sub2.anIntArray142[arg0];
			@Pc(304) short local304 = this.aShort9;
			@Pc(309) int local309 = -local297 / 2;
			@Pc(314) int local314 = -local304 / 2;
			@Pc(324) int local324 = local309 * local137 + local314 * local126 >> 16;
			@Pc(335) int local335 = local314 * local137 - local126 * local309 >> 16;
			@Pc(339) int local339 = local297 / 2;
			@Pc(351) int local351 = Static171.method2896(local324 + super.anInt3934, Static207.anInt4425, local335 + super.anInt3976);
			@Pc(356) int local356 = -local304 / 2;
			@Pc(366) int local366 = local137 * local339 + local356 * local126 >> 16;
			@Pc(377) int local377 = local137 * local356 - local126 * local339 >> 16;
			@Pc(389) int local389 = Static171.method2896(local366 + super.anInt3934, Static207.anInt4425, super.anInt3976 + local377);
			@Pc(394) int local394 = -local297 / 2;
			@Pc(398) int local398 = local304 / 2;
			@Pc(409) int local409 = local137 * local398 - local126 * local394 >> 16;
			@Pc(419) int local419 = local394 * local137 + local126 * local398 >> 16;
			@Pc(423) int local423 = local304 / 2;
			@Pc(427) int local427 = local297 / 2;
			@Pc(438) int local438 = local423 * local137 - local427 * local126 >> 16;
			@Pc(450) int local450 = Static171.method2896(local419 + super.anInt3934, Static207.anInt4425, local409 + super.anInt3976);
			@Pc(460) int local460 = local137 * local427 + local126 * local423 >> 16;
			@Pc(473) int local473 = Static171.method2896(super.anInt3934 + local460, Static207.anInt4425, super.anInt3976 + local438);
			local172 = local351 + local473;
			if (local450 + local389 < local172) {
				local172 = local450 + local389;
			}
			@Pc(493) int local493 = local351 >= local389 ? local389 : local351;
			@Pc(504) int local504 = local473 > local450 ? local450 : local473;
			@Pc(511) int local511 = local351 >= local450 ? local450 : local351;
			@Pc(518) int local518 = local473 <= local389 ? local473 : local389;
			local78 = (int) (Math.atan2((double) (local493 - local504), (double) local304) * 325.95D) & 0x7FF;
			if (local78 != 0) {
				local63.method1182(local78);
			}
			local274 = (int) (Math.atan2((double) (local511 - local518), (double) local297) * 325.95D) & 0x7FF;
			if (local274 != 0) {
				local63.method1180(local274);
			}
			local172 = (local172 >> 1) - super.anInt3943;
			if (local172 != 0) {
				local63.method1171(0, local172, 0);
			}
		}
		@Pc(575) Class6_Sub3 local575 = null;
		if (!this.aBoolean25 && super.anInt3964 != -1 && super.anInt3977 != -1) {
			@Pc(592) Class1_Sub2_Sub9 local592 = Static18.method345(super.anInt3964);
			local575 = local592.method823(super.anInt3977);
			if (local575 != null) {
				local575.method1171(0, -super.anInt3960, 0);
				if (local592.aBoolean52) {
					if (local78 != 0) {
						local575.method1182(local78);
					}
					if (local274 != 0) {
						local575.method1180(local274);
					}
					if (local172 != 0) {
						local575.method1171(0, local172, 0);
					}
				}
			}
		}
		@Pc(632) Class6_Sub3 local632 = null;
		if (!this.aBoolean25 && this.aClass6_Sub3_1 != null) {
			if (Static174.anInt3887 >= this.anInt594) {
				this.aClass6_Sub3_1 = null;
			}
			if (this.anInt598 <= Static174.anInt3887 && Static174.anInt3887 < this.anInt594) {
				local632 = this.aClass6_Sub3_1;
				local632.method1171(this.anInt608 - super.anInt3934, -super.anInt3943 + this.anInt599, this.anInt609 - super.anInt3976);
				if (super.anInt3965 == 512) {
					local632.method1178();
				} else if (super.anInt3965 == 1024) {
					local632.method1174();
				} else if (super.anInt3965 == 1536) {
					local632.method1177();
				}
			}
		}
		if (local575 != null) {
			local63 = ((Class6_Sub3_Sub1) local63).method1194(local575);
		}
		if (local632 != null) {
			local63 = ((Class6_Sub3_Sub1) local63).method1194(local632);
		}
		local63.aBoolean76 = true;
		local63.method2989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local632 == null) {
			return;
		}
		if (super.anInt3965 == 512) {
			local632.method1177();
		} else if (super.anInt3965 == 1024) {
			local632.method1174();
		} else if (super.anInt3965 == 1536) {
			local632.method1178();
		}
		local632.method1171(super.anInt3934 - this.anInt608, -this.anInt599 + super.anInt3943, super.anInt3976 - this.anInt609);
	}
}
