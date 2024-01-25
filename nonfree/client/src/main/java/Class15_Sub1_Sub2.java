import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class15_Sub1_Sub2 extends Class15_Sub1 {

	@OriginalMember(owner = "client!jfa", name = "ob", descriptor = "I")
	private int anInt5049;

	@OriginalMember(owner = "client!jfa", name = "zb", descriptor = "I")
	private int anInt5060;

	@OriginalMember(owner = "client!jfa", name = "Bb", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!jfa", name = "Ib", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class15_Sub1_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method5336(@OriginalArg(0) boolean arg0) {
		this.aBoolean430 = arg0;
	}

	@OriginalMember(owner = "client!jfa", name = "G", descriptor = "()V")
	@Override
	protected void method4270() {
		super.anInt5017 = -super.anInt5025 + super.anInt5021;
		super.anInt5015 = super.anInt5030 - super.anInt5025;
		super.anInt5033 = super.anInt5018 - super.anInt5020;
		super.anInt5042 = -super.anInt5020 + super.anInt5016;
		for (@Pc(38) int local38 = 0; local38 < super.anInt5019; local38++) {
			@Pc(47) Class165 local47 = ((Class91_Sub2) super.aClass91Array3[local38]).aClass165_1;
			local47.anInt4831 = super.anInt5020 - super.anInt5016;
			local47.anInt4835 = super.anInt5018 - super.anInt5016;
			local47.anInt4834 = -super.anInt5021 + super.anInt5025;
			local47.anInt4833 = super.anInt5030 - super.anInt5021;
		}
		@Pc(95) int local95 = super.anInt5037 * super.anInt5016 + super.anInt5021;
		for (@Pc(98) int local98 = super.anInt5016; local98 < super.anInt5018; local98++) {
			for (@Pc(102) int local102 = 0; local102 < super.anInt5019; local102++) {
				((Class91_Sub2) super.aClass91Array3[local102]).aClass165_1.anIntArray300[local98 - super.anInt5016] = local95;
			}
			local95 += super.anInt5037;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "([Lclient!ba;Lclient!qu;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5297(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				((Class21_Sub1) arg0[local7]).method7171(arg2, arg3 == null ? null : arg3[local7], arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5299() {
		@Pc(10) Class91_Sub2 local10 = (Class91_Sub2) this.method4266(Thread.currentThread());
		@Pc(13) Class165 local13 = local10.aClass165_1;
		local13.aBoolean408 = local13.anInt4833 < 5 || local13.anInt4833 < 75 || local13.anInt4833 < 15;
		local13.aBoolean406 = false;
		@Pc(53) int local53 = 15 - super.anInt5017;
		@Pc(58) int local58 = 5 - super.anInt5017;
		@Pc(63) int local63 = 10 - super.anInt5042;
		@Pc(68) int local68 = 50 - super.anInt5042;
		@Pc(73) int local73 = 90 - super.anInt5042;
		@Pc(78) int local78 = 75 - super.anInt5017;
		local13.aBoolean405 = false;
		local13.anInt4832 = 0;
		local13.method4066(local63, local68, local73, local58, local78, local53, 100, 100, 100, -65536, -65536, -65536);
		local13.aBoolean406 = true;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class4 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class4_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!jfa", name = "A", descriptor = "()V")
	@Override
	public void method5342() {
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(41) int local41;
		if (super.anInt5021 == 0 && super.anInt5030 == super.anInt5037 && super.anInt5016 == 0 && super.anInt5039 == super.anInt5018) {
			local32 = this.anIntArray310.length;
			local39 = local32 - local32 & 0x7;
			local41 = 0;
			while (local39 > local41) {
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
			}
			while (local32 > local41) {
				this.anIntArray310[local41++] = Integer.MAX_VALUE;
			}
			return;
		}
		local32 = super.anInt5030 - super.anInt5021;
		local39 = super.anInt5018 - super.anInt5016;
		local41 = super.anInt5037 - local32;
		@Pc(138) int local138 = super.anInt5021 + super.anInt5016 * super.anInt5037;
		@Pc(142) int local142 = local32 >> 3;
		@Pc(146) int local146 = local32 & 0x7;
		local32 = local138 - 1;
		for (@Pc(153) int local153 = -local39; local153 < 0; local153++) {
			@Pc(159) int local159;
			if (local142 > 0) {
				local159 = local142;
				do {
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local159--;
				} while (local159 > 0);
			}
			if (local146 > 0) {
				local159 = local146;
				do {
					local32++;
					this.anIntArray310[local32] = Integer.MAX_VALUE;
					local159--;
				} while (local159 > 0);
			}
			local32 += local41;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "n", descriptor = "()V")
	@Override
	public void method5303() {
		if (super.aCanvas8 == null) {
			super.anInt5039 = 1;
			super.anInt5037 = 1;
			super.anIntArray309 = null;
		} else {
			super.anIntArray309 = super.aClass3_Sub2_3.anIntArray656;
			super.anInt5037 = super.aClass3_Sub2_3.anInt9945;
			super.anInt5039 = super.aClass3_Sub2_3.anInt9943;
		}
		super.aClass37_26 = null;
		this.method4269();
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5319(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas8 = null;
			super.aClass3_Sub2_3 = null;
			if (super.aClass37_26 != null) {
				return;
			}
			super.anInt5037 = super.anInt5039 = 1;
			super.anIntArray309 = null;
			this.anInt5049 = this.anInt5060 = 1;
			this.method4269();
			return;
		}
		@Pc(14) Class3_Sub2 local14 = (Class3_Sub2) super.aClass25_20.method946((long) arg0.hashCode());
		if (local14 == null) {
			return;
		}
		super.aCanvas8 = arg0;
		super.aClass3_Sub2_3 = local14;
		if (super.aClass37_26 != null) {
			return;
		}
		super.anIntArray309 = local14.anIntArray656;
		super.anInt5039 = local14.anInt9943;
		super.anInt5037 = local14.anInt9945;
		if (super.anInt5037 != this.anInt5049 || super.anInt5039 != this.anInt5060) {
			this.anInt5049 = super.anInt5037;
			this.anInt5060 = super.anInt5039;
			this.anIntArray310 = new int[this.anInt5049 * this.anInt5060];
		}
		this.method4269();
		return;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method5302(@OriginalArg(0) Class37 arg0) {
		if (arg0 instanceof Class37_Sub2_Sub1) {
			@Pc(11) Class37_Sub2_Sub1 local11 = (Class37_Sub2_Sub1) arg0;
			super.anInt5037 = local11.anInt8031;
			super.aClass37_26 = arg0;
			super.anIntArray309 = local11.anIntArray133;
			super.anInt5039 = local11.anInt8021;
		} else if (arg0 instanceof Class37_Sub2_Sub3) {
			@Pc(34) Class37_Sub2_Sub3 local34 = (Class37_Sub2_Sub3) arg0;
			super.anIntArray309 = local34.anIntArray495;
			super.aClass37_26 = arg0;
			super.anInt5039 = local34.anInt8021;
			super.anInt5037 = local34.anInt8031;
		} else {
			throw new RuntimeException();
		}
		this.method4269();
	}

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)V")
	@Override
	public void method5317(@OriginalArg(0) int arg0) {
		super.aClass91Array3[arg0].method3265(Thread.currentThread());
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!tv;")
	@Override
	public Class91 method4266(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; super.anInt5019 > local7; local7++) {
			if (super.aClass91Array3[local7].aRunnable3 == arg0) {
				return super.aClass91Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
	@Override
	public void method5304(@OriginalArg(0) int arg0) {
		super.anInt5019 = arg0;
		super.aClass91Array3 = new Class91_Sub2[super.anInt5019];
		for (@Pc(15) int local15 = 0; super.anInt5019 > local15; local15++) {
			super.aClass91Array3[local15] = new Class91_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!fu;IIII)V")
	@Override
	public void method4275(@OriginalArg(0) Class55_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg0.anInt2867;
		@Pc(12) int local12 = arg4 << 1;
		if (local6 == -1) {
			this.method4284(arg1, arg2, arg0.anInt2864, arg3, arg4, 1);
			return;
		}
		if (local6 != super.anInt5046) {
			@Pc(32) Class37 local32 = (Class37) super.aClass211_38.method5534((long) local6);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method4271(local6);
				if (local38 == null) {
					return;
				}
				@Pc(49) int local49 = this.method4267(local6) ? 64 : 128;
				local32 = this.method5324(local38, local49, local49, local49);
				super.aClass211_38.method5529((long) local6, local32);
			}
			super.anInt5046 = local6;
			super.lb = local32;
		}
		local12++;
		this.method4283((Class37_Sub2_Sub3) super.lb, arg3, arg2 - arg4, 1, local12, 0, arg0.anInt2864, local12, arg1 - arg4);
	}

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		super.aClass91Array3[arg0].method3265(null);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_11.method3088(arg6).aBoolean488) {
			this.method4284(arg0, arg1, arg7, arg2, arg3, arg9);
			return;
		}
		if (super.anInt5046 != arg6) {
			@Pc(42) Class37 local42 = (Class37) super.aClass211_38.method5534((long) arg6);
			if (local42 == null) {
				@Pc(48) int[] local48 = this.method4271(arg6);
				if (local48 == null) {
					return;
				}
				@Pc(59) int local59 = this.method4267(arg6) ? 64 : 128;
				local42 = this.method5324(local48, local59, local59, local59);
				super.aClass211_38.method5529((long) arg6, local42);
			}
			super.anInt5046 = arg6;
			super.lb = local42;
		}
		this.method4283((Class37_Sub2_Sub3) super.lb, arg2, arg1 - arg4, arg9, arg4 << 1, arg8, arg7, arg3 << 1, arg0 - arg3);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!po;IIIIIIIII)V")
	private void method4283(@OriginalArg(0) Class37_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg7 <= 0 || arg4 <= 0) {
			return;
		}
		@Pc(17) int local17 = arg1 << 8;
		@Pc(19) int local19 = 0;
		@Pc(25) int local25 = 0;
		@Pc(34) int local34 = arg0.anInt8031 + arg0.anInt8037 + arg0.anInt8033;
		@Pc(43) int local43 = arg0.anInt8020 + arg0.anInt8021 + arg0.anInt8045;
		@Pc(49) int local49 = (local34 << 16) / arg7;
		@Pc(63) int local63;
		if (arg0.anInt8037 > 0) {
			local63 = (local49 + (arg0.anInt8037 << 16) - 1) / local49;
			local19 = local63 * local49 - (arg0.anInt8037 << 16);
			arg8 += local63;
		}
		@Pc(85) int local85 = (local43 << 16) / arg4;
		if (arg0.anInt8045 > 0) {
			local63 = ((arg0.anInt8045 << 16) + local85 - 1) / local85;
			arg2 += local63;
			local25 = local85 * local63 - (arg0.anInt8045 << 16);
		}
		if (arg0.anInt8031 < local34) {
			arg7 = (local49 + (arg0.anInt8031 << 16) - local19 - 1) / local49;
		}
		if (arg0.anInt8021 < local43) {
			arg4 = (local85 + (arg0.anInt8021 << 16) - local25 - 1) / local85;
		}
		local63 = super.anInt5037 * arg2 + arg8;
		@Pc(170) int local170 = super.anInt5037 - arg7;
		if (arg4 + arg2 > super.anInt5018) {
			arg4 -= arg2 + arg4 - super.anInt5018;
		}
		@Pc(200) int local200;
		if (arg2 < super.anInt5016) {
			local200 = super.anInt5016 - arg2;
			local63 += super.anInt5037 * local200;
			arg4 -= local200;
			local25 += local85 * local200;
		}
		if (super.anInt5030 < arg8 + arg7) {
			local200 = arg7 + arg8 - super.anInt5030;
			arg7 -= local200;
			local170 += local200;
		}
		if (arg8 < super.anInt5021) {
			local200 = super.anInt5021 - arg8;
			local170 += local200;
			local63 += local200;
			local19 += local200 * local49;
			arg7 -= local200;
		}
		@Pc(280) int local280;
		@Pc(289) int local289;
		@Pc(296) int local296;
		@Pc(385) int local385;
		@Pc(388) int local388;
		@Pc(397) int local397;
		@Pc(400) int local400;
		@Pc(421) int local421;
		@Pc(650) int local650;
		@Pc(658) int local658;
		@Pc(383) int local383;
		if (arg3 != 0) {
			@Pc(833) int local833;
			@Pc(1126) int local1126;
			@Pc(1134) int local1134;
			if (arg3 == 1) {
				if (arg5 == 1) {
					local200 = local19;
					for (local280 = -arg4; local280 < 0; local280++) {
						local289 = arg0.anInt8031 * (local25 >> 16);
						for (local296 = -arg7; local296 < 0; local296++) {
							if (this.anIntArray310[local63] > local17) {
								local385 = arg0.anIntArray495[local289 + (local19 >> 16)];
								local388 = local385 >>> 24;
								local397 = 256 - local388;
								local400 = super.anIntArray309[local63];
								super.anIntArray309[local63] = ((local400 & 0xFF00FF) * local397 + (local385 & 0xFF00FF) * local388 >> 8 & 0xFFFF00FF) + ((local400 >>> 8 & 0xFF00FF) * local397 + local388 * ((local385 & 0xFF00FF00) >>> 8) & 0xFF00FF00);
							}
							local63++;
							local19 += local49;
						}
						local25 += local85;
						local63 += local170;
						local19 = local200;
					}
				} else if (arg5 == 0) {
					local200 = local19;
					if ((arg6 & 0xFFFFFF) == 16777215) {
						for (local280 = -arg4; local280 < 0; local280++) {
							local289 = (local25 >> 16) * arg0.anInt8031;
							for (local296 = -arg7; local296 < 0; local296++) {
								if (this.anIntArray310[local63] > local17) {
									local385 = arg0.anIntArray495[(local19 >> 16) + local289];
									local388 = (local385 >>> 24) * (arg6 >>> 24) >> 8;
									local397 = 256 - local388;
									local400 = super.anIntArray309[local63];
									super.anIntArray309[local63] = (local397 * (local400 & 0xFF00FF) + local388 * (local385 & 0xFF00FF) & 0xFF00FF00) + ((local400 & 0xFF00) * local397 + (local385 & 0xFF00) * local388 & 0xFF0000) >> 8;
								}
								local19 += local49;
								local63++;
							}
							local25 += local85;
							local63 += local170;
							local19 = local200;
						}
					} else {
						local280 = arg6 >> 16 & 0xFF;
						local289 = arg6 >> 8 & 0xFF;
						local296 = arg6 & 0xFF;
						for (local385 = -arg4; local385 < 0; local385++) {
							local388 = arg0.anInt8031 * (local25 >> 16);
							for (local397 = -arg7; local397 < 0; local397++) {
								if (this.anIntArray310[local63] > local17) {
									local400 = arg0.anIntArray495[(local19 >> 16) + local388];
									local421 = (local400 >>> 24) * (arg6 >>> 24) >> 8;
									local650 = 256 - local421;
									if (local421 == 255) {
										local658 = (local400 & 0xFF0000) * local280 & 0xFF000000;
										local833 = local289 * (local400 & 0xFF00) & 0xFF0000;
										local1126 = local296 * (local400 & 0xFF) & 0xFF00;
										super.anIntArray309[local63] = (local658 | local833 | local1126) >>> 8;
									} else {
										local658 = local280 * (local400 & 0xFF0000) & 0xFF000000;
										local833 = local289 * (local400 & 0xFF00) & 0xFF0000;
										local1126 = local296 * (local400 & 0xFF) & 0xFF00;
										local400 = (local658 | local833 | local1126) >>> 8;
										local1134 = super.anIntArray309[local63];
										super.anIntArray309[local63] = ((local400 & 0xFF00) * local421 + (local1134 & 0xFF00) * local650 & 0xFF0000) + (local650 * (local1134 & 0xFF00FF) + local421 * (local400 & 0xFF00FF) & 0xFF00FF00) >> 8;
									}
								}
								local63++;
								local19 += local49;
							}
							local25 += local85;
							local63 += local170;
							local19 = local200;
						}
					}
				} else if (arg5 == 3) {
					local200 = local19;
					for (local280 = -arg4; local280 < 0; local280++) {
						local289 = (local25 >> 16) * arg0.anInt8031;
						for (local296 = -arg7; local296 < 0; local296++) {
							if (local17 < this.anIntArray310[local63]) {
								local385 = arg0.anIntArray495[(local19 >> 16) + local289];
								local388 = arg6 + local385;
								local397 = (arg6 & 0xFF00FF) + (local385 & 0xFF00FF);
								local400 = (local397 & 0x1000100) + (local388 - local397 & 0x10000);
								local400 = local400 - (local400 >>> 8) | -local400 + local388;
								local421 = (local400 >>> 24) * (arg6 >>> 24) >> 8;
								local650 = 256 - local421;
								if (local421 != 255) {
									local385 = local400;
									local400 = super.anIntArray309[local63];
									local400 = ((local385 & 0xFF00) * local421 + local650 * (local400 & 0xFF00) & 0xFF0000) + ((local385 & 0xFF00FF) * local421 + (local400 & 0xFF00FF) * local650 & 0xFF00FF00) >> 8;
								}
								super.anIntArray309[local63] = local400;
							}
							local19 += local49;
							local63++;
						}
						local25 += local85;
						local63 += local170;
						local19 = local200;
					}
				} else if (arg5 == 2) {
					local200 = arg6 >>> 24;
					local280 = 256 - local200;
					local289 = local280 * (arg6 & 0xFF00FF) & 0xFF00FF00;
					local296 = (arg6 & 0xFF00) * local280 & 0xFF0000;
					local383 = (local289 | local296) >>> 8;
					local385 = local19;
					for (local388 = -arg4; local388 < 0; local388++) {
						local397 = arg0.anInt8031 * (local25 >> 16);
						local25 += local85;
						for (local400 = -arg7; local400 < 0; local400++) {
							if (this.anIntArray310[local63] > local17) {
								local421 = arg0.anIntArray495[(local19 >> 16) + local397];
								local650 = local421 >>> 24;
								local658 = 256 - local650;
								local296 = (local421 & 0xFF00) * local200 & 0xFF0000;
								local289 = (local421 & 0xFF00FF) * local200 & 0xFF00FF00;
								local421 = ((local296 | local289) >>> 8) + local383;
								local833 = super.anIntArray309[local63];
								super.anIntArray309[local63] = (local650 * (local421 & 0xFF00FF) + local658 * (local833 & 0xFF00FF) & 0xFF00FF00) + ((local833 & 0xFF00) * local658 + local650 * (local421 & 0xFF00) & 0xFF0000) >> 8;
							}
							local63++;
							local19 += local49;
						}
						local19 = local385;
						local63 += local170;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg3 != 2) {
				throw new IllegalArgumentException();
			} else if (arg5 == 1) {
				local200 = local19;
				for (local280 = -arg4; local280 < 0; local280++) {
					local289 = arg0.anInt8031 * (local25 >> 16);
					local25 += local85;
					for (local296 = -arg7; local296 < 0; local296++) {
						if (local17 < this.anIntArray310[local63]) {
							local385 = arg0.anIntArray495[local289 + (local19 >> 16)];
							if (local385 != 0) {
								local388 = super.anIntArray309[local63];
								local397 = local388 + local385;
								local400 = (local388 & 0xFF00FF) + (local385 & 0xFF00FF);
								local388 = (local397 - local400 & 0x10000) + (local400 & 0x1000100);
								super.anIntArray309[local63] = local397 - local388 | -(local388 >>> 8) + local388;
							}
						}
						local63++;
						local19 += local49;
					}
					local19 = local200;
					local63 += local170;
				}
			} else if (arg5 == 0) {
				local200 = local19;
				local280 = arg6 >> 16 & 0xFF;
				local289 = arg6 >> 8 & 0xFF;
				local296 = arg6 & 0xFF;
				for (local385 = -arg4; local385 < 0; local385++) {
					local388 = arg0.anInt8031 * (local25 >> 16);
					local25 += local85;
					for (local397 = -arg7; local397 < 0; local397++) {
						if (local17 < this.anIntArray310[local63]) {
							local400 = arg0.anIntArray495[(local19 >> 16) + local388];
							if (local400 != 0) {
								local421 = (local400 & 0xFF0000) * local280 & 0xFF000000;
								local650 = local289 * (local400 & 0xFF00) & 0xFF0000;
								local658 = local296 * (local400 & 0xFF) & 0xFF00;
								local400 = (local650 | local421 | local658) >>> 8;
								local833 = super.anIntArray309[local63];
								local1126 = local400 + local833;
								local1134 = (local833 & 0xFF00FF) + (local400 & 0xFF00FF);
								local833 = (local1134 & 0x1000100) + (local1126 - local1134 & 0x10000);
								super.anIntArray309[local63] = local1126 - local833 | -(local833 >>> 8) + local833;
							}
						}
						local19 += local49;
						local63++;
					}
					local63 += local170;
					local19 = local200;
				}
			} else if (arg5 == 3) {
				local200 = local19;
				for (local280 = -arg4; local280 < 0; local280++) {
					local289 = arg0.anInt8031 * (local25 >> 16);
					local25 += local85;
					for (local296 = -arg7; local296 < 0; local296++) {
						if (this.anIntArray310[local63] > local17) {
							local385 = arg0.anIntArray495[local289 + (local19 >> 16)];
							local388 = local385 + arg6;
							local397 = (local385 & 0xFF00FF) + (arg6 & 0xFF00FF);
							local400 = (local388 - local397 & 0x10000) + (local397 & 0x1000100);
							local385 = local400 - (local400 >>> 8) | local388 + -local400;
							local400 = super.anIntArray309[local63];
							local388 = local400 + local385;
							local397 = (local400 & 0xFF00FF) + (local385 & 0xFF00FF);
							local400 = (local397 & 0x1000100) + (local388 - local397 & 0x10000);
							super.anIntArray309[local63] = local400 - (local400 >>> 8) | -local400 + local388;
						}
						local63++;
						local19 += local49;
					}
					local63 += local170;
					local19 = local200;
				}
			} else if (arg5 == 2) {
				local200 = arg6 >>> 24;
				local280 = 256 - local200;
				local289 = local280 * (arg6 & 0xFF00FF) & 0xFF00FF00;
				local296 = local280 * (arg6 & 0xFF00) & 0xFF0000;
				local383 = (local296 | local289) >>> 8;
				local385 = local19;
				for (local388 = -arg4; local388 < 0; local388++) {
					local397 = (local25 >> 16) * arg0.anInt8031;
					local25 += local85;
					for (local400 = -arg7; local400 < 0; local400++) {
						if (this.anIntArray310[local63] > local17) {
							local421 = arg0.anIntArray495[(local19 >> 16) + local397];
							if (local421 != 0) {
								local289 = local200 * (local421 & 0xFF00FF) & 0xFF00FF00;
								local296 = local200 * (local421 & 0xFF00) & 0xFF0000;
								local421 = local383 + ((local289 | local296) >>> 8);
								local650 = super.anIntArray309[local63];
								local658 = local421 + local650;
								local833 = (local650 & 0xFF00FF) + (local421 & 0xFF00FF);
								local650 = (local833 & 0x1000100) + (local658 - local833 & 0x10000);
								super.anIntArray309[local63] = local658 - local650 | -(local650 >>> 8) + local650;
							}
						}
						local63++;
						local19 += local49;
					}
					local63 += local170;
					local19 = local385;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg5 == 1) {
			local200 = local19;
			for (local280 = -arg4; local280 < 0; local280++) {
				local289 = arg0.anInt8031 * (local25 >> 16);
				local25 += local85;
				for (local296 = -arg7; local296 < 0; local296++) {
					if (local17 < this.anIntArray310[local63]) {
						super.anIntArray309[local63] = arg0.anIntArray495[local289 + (local19 >> 16)];
					}
					local63++;
					local19 += local49;
				}
				local63 += local170;
				local19 = local200;
			}
		} else if (arg5 == 0) {
			local200 = arg6 >> 16 & 0xFF;
			local280 = arg6 >> 8 & 0xFF;
			local289 = arg6 & 0xFF;
			local296 = local19;
			for (local385 = -arg4; local385 < 0; local385++) {
				local388 = (local25 >> 16) * arg0.anInt8031;
				local25 += local85;
				for (local397 = -arg7; local397 < 0; local397++) {
					if (this.anIntArray310[local63] > local17) {
						local400 = arg0.anIntArray495[local388 + (local19 >> 16)];
						local421 = local200 * (local400 & 0xFF0000) & 0xFF000000;
						local650 = (local400 & 0xFF00) * local280 & 0xFF0000;
						local658 = local289 * (local400 & 0xFF) & 0xFF00;
						super.anIntArray309[local63] = (local650 | local421 | local658) >>> 8;
					}
					local19 += local49;
					local63++;
				}
				local19 = local296;
				local63 += local170;
			}
		} else if (arg5 == 3) {
			local200 = local19;
			for (local280 = -arg4; local280 < 0; local280++) {
				local289 = arg0.anInt8031 * (local25 >> 16);
				for (local296 = -arg7; local296 < 0; local296++) {
					if (local17 < this.anIntArray310[local63]) {
						local385 = arg0.anIntArray495[(local19 >> 16) + local289];
						local388 = local385 + arg6;
						local397 = (arg6 & 0xFF00FF) + (local385 & 0xFF00FF);
						local400 = (local388 - local397 & 0x10000) + (local397 & 0x1000100);
						super.anIntArray309[local63] = local400 - (local400 >>> 8) | -local400 + local388;
					}
					local63++;
					local19 += local49;
				}
				local25 += local85;
				local63 += local170;
				local19 = local200;
			}
		} else if (arg5 == 2) {
			local200 = arg6 >>> 24;
			local280 = 256 - local200;
			local289 = (arg6 & 0xFF00FF) * local280 & 0xFF00FF00;
			local296 = (arg6 & 0xFF00) * local280 & 0xFF0000;
			local383 = (local289 | local296) >>> 8;
			local385 = local19;
			for (local388 = -arg4; local388 < 0; local388++) {
				local397 = (local25 >> 16) * arg0.anInt8031;
				for (local400 = -arg7; local400 < 0; local400++) {
					if (local17 < this.anIntArray310[local63]) {
						local421 = arg0.anIntArray495[(local19 >> 16) + local397];
						local296 = local200 * (local421 & 0xFF00) & 0xFF0000;
						local289 = local200 * (local421 & 0xFF00FF) & 0xFF00FF00;
						super.anIntArray309[local63] = local383 + ((local296 | local289) >>> 8);
					}
					local63++;
					local19 += local49;
				}
				local25 += local85;
				local19 = local385;
				local63 += local170;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class91_Sub2 local10 = (Class91_Sub2) this.method4266(Thread.currentThread());
		@Pc(13) Class165 local13 = local10.aClass165_1;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(23) int local23 = arg3 - arg1;
		@Pc(33) int local33 = local18 >= 0 ? local18 : -local18;
		@Pc(40) int local40 = local23 >= 0 ? local23 : -local23;
		@Pc(42) int local42 = local33;
		if (local40 > local33) {
			local42 = local40;
		}
		if (local42 == 0) {
			return;
		}
		@Pc(63) int local63 = (local18 << 16) / local42;
		local18 += local63 >> 16;
		@Pc(75) int local75 = (local23 << 16) / local42;
		local23 += local75 >> 16;
		if (local63 >= local75) {
			local63 = -local63;
		} else {
			local75 = -local75;
		}
		@Pc(102) int local102 = local75 * arg5 >> 17;
		@Pc(110) int local110 = local75 * arg5 + 1 >> 17;
		@Pc(116) int local116 = arg5 * local63 >> 17;
		@Pc(121) int local121 = arg0 - local13.method4061();
		@Pc(129) int local129 = local63 * arg5 + 1 >> 17;
		@Pc(134) int local134 = arg1 - local13.method4075();
		@Pc(138) int local138 = local121 + local102;
		@Pc(143) int local143 = local121 - local110;
		@Pc(150) int local150 = local121 + local18 - local110;
		@Pc(157) int local157 = local102 + local121 + local18;
		@Pc(161) int local161 = local116 + local134;
		@Pc(166) int local166 = local134 - local129;
		@Pc(173) int local173 = local134 + local23 - local129;
		@Pc(179) int local179 = local116 + local23 + local134;
		local13.anInt4832 = 0;
		local13.aBoolean408 = local138 < 0 || local13.anInt4833 < local138 || local143 < 0 || local143 > local13.anInt4833 || local150 < 0 || local13.anInt4833 < local150;
		local13.method4064(local161, local166, local173, local138, local143, local150, 0, 0, 0, arg4);
		local13.aBoolean408 = local138 < 0 || local138 > local13.anInt4833 || local150 < 0 || local150 > local13.anInt4833 || local157 < 0 || local157 > local13.anInt4833;
		local13.method4064(local161, local173, local179, local138, local150, local157, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5311(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class3_Sub2 local12 = (Class3_Sub2) super.aClass25_20.method946((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method8412();
		local12 = Static165.method3093(arg0);
		super.aClass25_20.method945(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas8 || super.aClass37_26 != null) {
			return;
		}
		super.anIntArray309 = local12.anIntArray656;
		super.anInt5039 = local12.anInt9943;
		super.anInt5037 = local12.anInt9945;
		super.aClass3_Sub2_3 = local12;
		if (super.anInt5037 != this.anInt5049 || super.anInt5039 != this.anInt5060) {
			this.anInt5049 = super.anInt5037;
			this.anInt5060 = super.anInt5039;
			this.anIntArray310 = new int[this.anInt5060 * this.anInt5049];
		}
		this.method4269();
		return;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!fca;IIII)Lclient!ba;")
	@Override
	public Class21 method5352(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub1_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(IIIIIII)V")
	private void method4284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 << 8;
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(21) int local21 = arg1 - arg4;
		if (local21 < super.anInt5016) {
			local21 = super.anInt5016;
		}
		@Pc(34) int local34 = arg1 + arg4 + 1;
		if (local34 > super.anInt5018) {
			local34 = super.anInt5018;
		}
		@Pc(47) int local47 = local21;
		@Pc(51) int local51 = arg4 * arg4;
		@Pc(53) int local53 = 0;
		@Pc(57) int local57 = arg1 - local21;
		@Pc(61) int local61 = local57 * local57;
		if (local34 < arg1) {
			arg1 = local34;
		}
		@Pc(71) int local71 = local61 - local57;
		@Pc(80) int local80 = arg2 >>> 24;
		@Pc(118) int local118;
		@Pc(133) int local133;
		@Pc(147) int local147;
		@Pc(150) int local150;
		if (arg5 == 0 || arg5 == 1 && local80 == 255) {
			while (arg1 > local47) {
				while (local71 <= local51 || local51 >= local61) {
					local61 += local53 + local53;
					local71 += local53++ + local53;
				}
				local118 = arg0 + 1 - local53;
				if (local118 < super.anInt5021) {
					local118 = super.anInt5021;
				}
				local133 = local53 + arg0;
				if (super.anInt5030 < local133) {
					local133 = super.anInt5030;
				}
				local147 = super.anInt5037 * local47 + local118;
				local47++;
				for (local150 = local118; local150 < local133; local150++) {
					if (this.anIntArray310[local147] > local9) {
						super.anIntArray309[local147] = arg2;
					}
					local147++;
				}
				local61 -= local57-- + local57;
				local71 -= local57 + local57;
			}
			local53 = arg4;
			local57 = local47 - arg1;
			local71 = local57 * local57 + local51;
			local61 = local71 - arg4;
			local71 -= local57;
			while (local47 < local34) {
				while (local51 < local71 && local51 < local61) {
					local71 -= local53-- + local53;
					local61 -= local53 + local53;
				}
				local118 = arg0 - local53;
				if (super.anInt5021 > local118) {
					local118 = super.anInt5021;
				}
				local133 = arg0 + local53;
				if (local133 > super.anInt5030 - 1) {
					local133 = super.anInt5030 - 1;
				}
				local147 = super.anInt5037 * local47 + local118;
				local71 += local57 + local57;
				local47++;
				for (local150 = local118; local150 <= local133; local150++) {
					if (local9 < this.anIntArray310[local147]) {
						super.anIntArray309[local147] = arg2;
					}
					local147++;
				}
				local61 += local57++ + local57;
			}
			return;
		}
		@Pc(425) int local425;
		@Pc(442) int local442;
		if (arg5 == 1) {
			@Pc(343) int local343 = (local80 << 24) + ((arg2 & 0xFF00FF) * local80 >> 8 & 0xFF00FF) + (local80 * (arg2 & 0xFF00) >> 8 & 0xFF00);
			local118 = 256 - local80;
			while (arg1 > local47) {
				while (local51 >= local71 || local61 <= local51) {
					local61 += local53 + local53;
					local71 += local53++ + local53;
				}
				local133 = arg0 + 1 - local53;
				if (local133 < super.anInt5021) {
					local133 = super.anInt5021;
				}
				local147 = local53 + arg0;
				if (super.anInt5030 < local147) {
					local147 = super.anInt5030;
				}
				local150 = super.anInt5037 * local47 + local133;
				local47++;
				local61 -= local57-- + local57;
				for (local425 = local133; local425 < local147; local425++) {
					if (this.anIntArray310[local150] > local9) {
						local442 = super.anIntArray309[local150];
						local442 = ((local442 & 0xFF00FF) * local118 >> 8 & 0xFF00FF) + ((local118 * (local442 & 0xFF00) & 0xFF002B) >> 8);
						super.anIntArray309[local150] = local442 + local343;
					}
					local150++;
				}
				local71 -= local57 + local57;
			}
			local53 = arg4;
			local57 = -local57;
			local71 = local57 * local57 + local51;
			local61 = local71 - arg4;
			local71 -= local57;
			while (local47 < local34) {
				while (local51 < local71 && local61 > local51) {
					local71 -= local53-- + local53;
					local61 -= local53 + local53;
				}
				local133 = arg0 - local53;
				if (local133 < super.anInt5021) {
					local133 = super.anInt5021;
				}
				local147 = local53 + arg0;
				if (super.anInt5030 - 1 < local147) {
					local147 = super.anInt5030 - 1;
				}
				local150 = local47 * super.anInt5037 + local133;
				for (local425 = local133; local425 <= local147; local425++) {
					if (local9 < this.anIntArray310[local150]) {
						local442 = super.anIntArray309[local150];
						local442 = (local118 * (local442 & 0xFF00) >> 8 & 0xFF00) + ((local442 & 0xFF00FF) * local118 >> 8 & 0xFF00FF);
						super.anIntArray309[local150] = local442 + local343;
					}
					local150++;
				}
				local47++;
				local71 += local57 + local57;
				local61 += local57++ + local57;
			}
		} else if (arg5 == 2) {
			@Pc(739) int local739;
			while (arg1 > local47) {
				while (local71 <= local51 || local51 >= local61) {
					local61 += local53 + local53;
					local71 += local53++ + local53;
				}
				local118 = arg0 + 1 - local53;
				if (local118 < super.anInt5021) {
					local118 = super.anInt5021;
				}
				local133 = arg0 + local53;
				if (super.anInt5030 < local133) {
					local133 = super.anInt5030;
				}
				local147 = super.anInt5037 * local47 + local118;
				local61 -= local57-- + local57;
				local47++;
				for (local150 = local118; local150 < local133; local150++) {
					if (this.anIntArray310[local147] > local9) {
						local425 = super.anIntArray309[local147];
						local442 = local425 + arg2;
						local739 = (arg2 & 0xFF00FF) + (local425 & 0xFF00FF);
						@Pc(749) int local749 = (local442 - local739 & 0x10000) + (local739 & 0x1000100);
						super.anIntArray309[local147] = local442 - local749 | local749 - (local749 >>> 8);
					}
					local147++;
				}
				local71 -= local57 + local57;
			}
			local53 = arg4;
			local57 = -local57;
			local71 = local57 * local57 + local51;
			local61 = local71 - arg4;
			local71 -= local57;
			while (local47 < local34) {
				while (local71 > local51 && local51 < local61) {
					local71 -= local53-- + local53;
					local61 -= local53 + local53;
				}
				local118 = arg0 - local53;
				if (local118 < super.anInt5021) {
					local118 = super.anInt5021;
				}
				local133 = arg0 + local53;
				if (super.anInt5030 - 1 < local133) {
					local133 = super.anInt5030 - 1;
				}
				local147 = local118 + super.anInt5037 * local47;
				local71 += local57 + local57;
				for (local150 = local118; local150 <= local133; local150++) {
					if (this.anIntArray310[local147] > local9) {
						local425 = super.anIntArray309[local147];
						local442 = local425 + arg2;
						local739 = (arg2 & 0xFF00FF) + (local425 & 0xFF00FF);
						local425 = (local739 & 0x1000100) + (local442 - local739 & 0x10000);
						super.anIntArray309[local147] = local442 - local425 | -(local425 >>> 8) + local425;
					}
					local147++;
				}
				local47++;
				local61 += local57++ + local57;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ht;I)V")
	@Override
	public void method5310(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class55_Sub3[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7145(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "()Z")
	@Override
	public boolean method5289() {
		return true;
	}
}
