import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class14_Sub1_Sub2 extends Class14_Sub1 {

	@OriginalMember(owner = "client!mq", name = "qb", descriptor = "[I")
	public int[] anIntArray435;

	@OriginalMember(owner = "client!mq", name = "zb", descriptor = "I")
	private int anInt5855;

	@OriginalMember(owner = "client!mq", name = "Tb", descriptor = "I")
	private int anInt5874;

	@OriginalMember(owner = "client!mq", name = "ub", descriptor = "Z")
	public boolean aBoolean412 = true;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class14_Sub1_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	@Override
	public void method6850(@OriginalArg(0) int arg0) {
		super.aClass44Array3[arg0].method6769(null);
	}

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "()Z")
	@Override
	public boolean method6876() {
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6900(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aClass6_Sub23_3 = null;
			super.aCanvas11 = null;
			if (super.aClass58_30 != null) {
				return;
			}
			this.anInt5855 = this.anInt5874 = 1;
			super.lb = null;
			super.anInt5817 = super.anInt5843 = 1;
			this.method5047();
			return;
		}
		@Pc(14) Class6_Sub23 local14 = (Class6_Sub23) super.aClass128_28.method3263((long) arg0.hashCode());
		if (local14 == null) {
			return;
		}
		super.aClass6_Sub23_3 = local14;
		super.aCanvas11 = arg0;
		if (super.aClass58_30 != null) {
			return;
		}
		super.lb = local14.anIntArray539;
		super.anInt5843 = local14.anInt7484;
		super.anInt5817 = local14.anInt7481;
		if (this.anInt5855 != super.anInt5817 || super.anInt5843 != this.anInt5874) {
			this.anInt5874 = super.anInt5843;
			this.anInt5855 = super.anInt5817;
			this.anIntArray435 = new int[this.anInt5855 * this.anInt5874];
		}
		this.method5047();
		return;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!xa;Z)V")
	@Override
	protected void method6821(@OriginalArg(0) Class58 arg0) {
		if (arg0 instanceof Class58_Sub1_Sub1) {
			@Pc(36) Class58_Sub1_Sub1 local36 = (Class58_Sub1_Sub1) arg0;
			super.aClass58_30 = arg0;
			super.lb = local36.anIntArray135;
			super.anInt5817 = local36.anInt9369;
			super.anInt5843 = local36.anInt9392;
		} else if (arg0 instanceof Class58_Sub1_Sub2) {
			@Pc(12) Class58_Sub1_Sub2 local12 = (Class58_Sub1_Sub2) arg0;
			super.anInt5817 = local12.anInt9369;
			super.anInt5843 = local12.anInt9392;
			super.lb = local12.anIntArray171;
			super.aClass58_30 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method5047();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class59 method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class59_Sub1_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIII)V")
	private void method5061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg3 << 8;
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(22) int local22 = arg5 - arg4;
		if (local22 < super.anInt5831) {
			local22 = super.anInt5831;
		}
		@Pc(35) int local35 = arg4 + arg5 + 1;
		if (local35 > super.anInt5838) {
			local35 = super.anInt5838;
		}
		@Pc(48) int local48 = local22;
		@Pc(58) int local58 = arg4 * arg4;
		@Pc(60) int local60 = 0;
		@Pc(65) int local65 = arg5 - local22;
		@Pc(69) int local69 = local65 * local65;
		if (arg5 > local35) {
			arg5 = local35;
		}
		@Pc(83) int local83 = local69 - local65;
		@Pc(87) int local87 = arg1 >>> 24;
		@Pc(132) int local132;
		@Pc(143) int local143;
		@Pc(157) int local157;
		@Pc(160) int local160;
		if (arg2 == 0 || arg2 == 1 && local87 == 255) {
			while (local48 < arg5) {
				while (local58 >= local83 || local69 <= local58) {
					local69 += local60 + local60;
					local83 += local60++ + local60;
				}
				local132 = arg0 + 1 - local60;
				if (local132 < super.anInt5844) {
					local132 = super.anInt5844;
				}
				local143 = arg0 + local60;
				if (super.anInt5825 < local143) {
					local143 = super.anInt5825;
				}
				local157 = local48 * super.anInt5817 + local132;
				local48++;
				for (local160 = local132; local160 < local143; local160++) {
					if (local5 < this.anIntArray435[local157]) {
						super.lb[local157] = arg1;
					}
					local157++;
				}
				local69 -= local65-- + local65;
				local83 -= local65 + local65;
			}
			local65 = local48 - arg5;
			local60 = arg4;
			local83 = local58 + local65 * local65;
			local69 = local83 - arg4;
			local83 -= local65;
			while (local35 > local48) {
				while (local58 < local83 && local69 > local58) {
					local83 -= local60-- + local60;
					local69 -= local60 + local60;
				}
				local132 = arg0 - local60;
				if (super.anInt5844 > local132) {
					local132 = super.anInt5844;
				}
				local143 = local60 + arg0;
				if (local143 > super.anInt5825 - 1) {
					local143 = super.anInt5825 - 1;
				}
				local157 = local132 + local48 * super.anInt5817;
				local83 += local65 + local65;
				local48++;
				for (local160 = local132; local160 <= local143; local160++) {
					if (this.anIntArray435[local157] > local5) {
						super.lb[local157] = arg1;
					}
					local157++;
				}
				local69 += local65++ + local65;
			}
			return;
		}
		@Pc(413) int local413;
		@Pc(418) int local418;
		if (arg2 == 1) {
			@Pc(667) int local667 = (local87 << 24) + ((arg1 & 0xFF00FF) * local87 >> 8 & 0xFF00FF) + ((arg1 & 0xFF00) * local87 >> 8 & 0xFF00);
			local132 = 256 - local87;
			while (local48 < arg5) {
				while (local58 >= local83 || local58 >= local69) {
					local69 += local60 + local60;
					local83 += local60++ + local60;
				}
				local143 = arg0 + 1 - local60;
				if (local143 < super.anInt5844) {
					local143 = super.anInt5844;
				}
				local157 = arg0 + local60;
				if (super.anInt5825 < local157) {
					local157 = super.anInt5825;
				}
				local160 = local48 * super.anInt5817 + local143;
				local69 -= local65-- + local65;
				local48++;
				for (local413 = local143; local413 < local157; local413++) {
					if (this.anIntArray435[local160] > local5) {
						local418 = super.lb[local160];
						@Pc(781) int local781 = ((local418 & 0xFF00) * local132 >> 8 & 0xFF00) + (local132 * (local418 & 0xFF00FF) >> 8 & 0xFF00FF);
						super.lb[local160] = local667 + local781;
					}
					local160++;
				}
				local83 -= local65 + local65;
			}
			local60 = arg4;
			local65 = -local65;
			local83 = local65 * local65 + local58;
			local69 = local83 - arg4;
			local83 -= local65;
			while (local48 < local35) {
				while (local83 > local58 && local69 > local58) {
					local83 -= local60-- + local60;
					local69 -= local60 + local60;
				}
				local143 = arg0 - local60;
				if (super.anInt5844 > local143) {
					local143 = super.anInt5844;
				}
				local157 = arg0 + local60;
				if (local157 > super.anInt5825 - 1) {
					local157 = super.anInt5825 - 1;
				}
				local160 = local143 + super.anInt5817 * local48;
				local83 += local65 + local65;
				local48++;
				for (local413 = local143; local413 <= local157; local413++) {
					if (local5 < this.anIntArray435[local160]) {
						local418 = super.lb[local160];
						local418 = ((local418 & 0xFF00FF) * local132 >> 8 & 0xFF00FF) + (((local418 & 0xFF00) * local132 & 0xFF006B) >> 8);
						super.lb[local160] = local667 + local418;
					}
					local160++;
				}
				local69 += local65++ + local65;
			}
		} else if (arg2 == 2) {
			@Pc(426) int local426;
			while (local48 < arg5) {
				while (local58 >= local83 || local69 <= local58) {
					local69 += local60 + local60;
					local83 += local60++ + local60;
				}
				local132 = arg0 + 1 - local60;
				if (super.anInt5844 > local132) {
					local132 = super.anInt5844;
				}
				local143 = arg0 + local60;
				if (local143 > super.anInt5825) {
					local143 = super.anInt5825;
				}
				local157 = super.anInt5817 * local48 + local132;
				local69 -= local65-- + local65;
				local48++;
				for (local160 = local132; local160 < local143; local160++) {
					if (this.anIntArray435[local157] > local5) {
						local413 = super.lb[local157];
						local418 = arg1 + local413;
						local426 = (local413 & 0xFF00FF) + (arg1 & 0xFF00FF);
						local413 = (local418 - local426 & 0x10000) + (local426 & 0x1000100);
						super.lb[local157] = local413 - (local413 >>> 8) | -local413 + local418;
					}
					local157++;
				}
				local83 -= local65 + local65;
			}
			local65 = -local65;
			local60 = arg4;
			local83 = local58 + local65 * local65;
			local69 = local83 - arg4;
			local83 -= local65;
			while (local48 < local35) {
				while (local83 > local58 && local58 < local69) {
					local83 -= local60-- + local60;
					local69 -= local60 + local60;
				}
				local132 = arg0 - local60;
				if (local132 < super.anInt5844) {
					local132 = super.anInt5844;
				}
				local143 = local60 + arg0;
				if (local143 > super.anInt5825 - 1) {
					local143 = super.anInt5825 - 1;
				}
				local157 = local48 * super.anInt5817 + local132;
				for (local160 = local132; local160 <= local143; local160++) {
					if (local5 < this.anIntArray435[local157]) {
						local413 = super.lb[local157];
						local418 = arg1 + local413;
						local426 = (arg1 & 0xFF00FF) + (local413 & 0xFF00FF);
						local413 = (local418 - local426 & 0x10000) + (local426 & 0x1000100);
						super.lb[local157] = local418 - local413 | -(local413 >>> 8) + local413;
					}
					local157++;
				}
				local83 += local65 + local65;
				local48++;
				local69 += local65++ + local65;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!nj;IIII)Lclient!ba;")
	@Override
	public Class20 method6833(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIZIILclient!en;II)V")
	private void method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class58_Sub1_Sub2 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 <= 0 || arg2 <= 0) {
			return;
		}
		@Pc(14) int local14 = arg3 << 8;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(41) int local41 = arg6.anInt9367 + arg6.anInt9369 + arg6.anInt9385;
		@Pc(50) int local50 = arg6.anInt9382 + arg6.anInt9389 + arg6.anInt9392;
		@Pc(56) int local56 = (local41 << 16) / arg5;
		@Pc(62) int local62 = (local50 << 16) / arg2;
		@Pc(76) int local76;
		if (arg6.anInt9367 > 0) {
			local76 = (local56 + (arg6.anInt9367 << 16) - 1) / local56;
			arg4 += local76;
			local29 = local56 * local76 - (arg6.anInt9367 << 16);
		}
		if (local41 > arg6.anInt9369) {
			arg5 = ((arg6.anInt9369 << 16) + local56 - local29 - 1) / local56;
		}
		if (arg6.anInt9389 > 0) {
			local76 = (local62 + (arg6.anInt9389 << 16) - 1) / local62;
			local31 = local76 * local62 - (arg6.anInt9389 << 16);
			arg7 += local76;
		}
		if (local50 > arg6.anInt9392) {
			arg2 = ((arg6.anInt9392 << 16) + local62 - local31 - 1) / local62;
		}
		local76 = arg7 * super.anInt5817 + arg4;
		if (super.anInt5838 < arg7 + arg2) {
			arg2 -= arg2 + arg7 - super.anInt5838;
		}
		@Pc(196) int local196 = super.anInt5817 - arg5;
		@Pc(205) int local205;
		if (arg7 < super.anInt5831) {
			local205 = super.anInt5831 - arg7;
			arg2 -= local205;
			local76 += local205 * super.anInt5817;
			local31 += local62 * local205;
		}
		if (arg5 + arg4 > super.anInt5825) {
			local205 = arg5 + arg4 - super.anInt5825;
			arg5 -= local205;
			local196 += local205;
		}
		if (arg4 < super.anInt5844) {
			local205 = super.anInt5844 - arg4;
			local29 += local56 * local205;
			local196 += local205;
			local76 += local205;
			arg5 -= local205;
		}
		@Pc(297) int local297;
		@Pc(306) int local306;
		@Pc(309) int local309;
		@Pc(326) int local326;
		@Pc(336) int local336;
		@Pc(340) int local340;
		@Pc(345) int local345;
		@Pc(464) int local464;
		@Pc(468) int local468;
		@Pc(481) int local481;
		@Pc(652) int local652;
		if (arg8 != 0) {
			@Pc(489) int local489;
			@Pc(497) int local497;
			@Pc(510) int local510;
			if (arg8 == 1) {
				if (arg0 == 1) {
					local205 = local29;
					for (local297 = -arg2; local297 < 0; local297++) {
						local306 = (local31 >> 16) * arg6.anInt9369;
						local31 += local62;
						for (local309 = -arg5; local309 < 0; local309++) {
							if (local14 < this.anIntArray435[local76]) {
								local326 = arg6.anIntArray171[(local29 >> 16) + local306];
								local336 = local326 >>> 24;
								local340 = 256 - local336;
								local345 = super.lb[local76];
								super.lb[local76] = (local340 * (local345 & 0xFF00FF) + (local326 & 0xFF00FF) * local336 >> 8 & 0xFFFF00FF) + ((local326 >>> 8 & 0xFF00FF) * local336 + local340 * (local345 >>> 8 & 0xFF00FF) & 0xFF00FF00);
							}
							local29 += local56;
							local76++;
						}
						local29 = local205;
						local76 += local196;
					}
				} else if (arg0 == 0) {
					local205 = local29;
					if ((arg1 & 0xFFFFFF) == 16777215) {
						for (local297 = -arg2; local297 < 0; local297++) {
							local306 = (local31 >> 16) * arg6.anInt9369;
							for (local309 = -arg5; local309 < 0; local309++) {
								if (this.anIntArray435[local76] > local14) {
									local326 = arg6.anIntArray171[local306 + (local29 >> 16)];
									local336 = (arg1 >>> 24) * (local326 >>> 24) >> 8;
									local340 = 256 - local336;
									local345 = super.lb[local76];
									super.lb[local76] = (local336 * (local326 & 0xFF00) + local340 * (local345 & 0xFF00) & 0xFF0000) + (local336 * (local326 & 0xFF00FF) + local340 * (local345 & 0xFF00FF) & 0xFF00FF00) >> 8;
								}
								local76++;
								local29 += local56;
							}
							local31 += local62;
							local76 += local196;
							local29 = local205;
						}
					} else {
						local297 = arg1 >> 16 & 0xFF;
						local306 = arg1 >> 8 & 0xFF;
						local309 = arg1 & 0xFF;
						for (local326 = -arg2; local326 < 0; local326++) {
							local336 = (local31 >> 16) * arg6.anInt9369;
							for (local340 = -arg5; local340 < 0; local340++) {
								if (local14 < this.anIntArray435[local76]) {
									local345 = arg6.anIntArray171[local336 + (local29 >> 16)];
									local464 = (arg1 >>> 24) * (local345 >>> 24) >> 8;
									local468 = 256 - local464;
									if (local464 == 255) {
										local481 = (local345 & 0xFF0000) * local297 & 0xFF000000;
										local489 = (local345 & 0xFF00) * local306 & 0xFF0000;
										local497 = (local345 & 0xFF) * local309 & 0xFF00;
										super.lb[local76] = (local497 | local481 | local489) >>> 8;
									} else {
										local481 = (local345 & 0xFF0000) * local297 & 0xFF000000;
										local489 = (local345 & 0xFF00) * local306 & 0xFF0000;
										local497 = (local345 & 0xFF) * local309 & 0xFF00;
										local345 = (local489 | local481 | local497) >>> 8;
										local510 = super.lb[local76];
										super.lb[local76] = ((local345 & 0xFF00FF) * local464 + (local510 & 0xFF00FF) * local468 & 0xFF00FF00) + ((local510 & 0xFF00) * local468 + local464 * (local345 & 0xFF00) & 0xFF0000) >> 8;
									}
								}
								local76++;
								local29 += local56;
							}
							local31 += local62;
							local29 = local205;
							local76 += local196;
						}
					}
				} else if (arg0 == 3) {
					local205 = local29;
					for (local297 = -arg2; local297 < 0; local297++) {
						local306 = (local31 >> 16) * arg6.anInt9369;
						local31 += local62;
						for (local309 = -arg5; local309 < 0; local309++) {
							if (local14 < this.anIntArray435[local76]) {
								local326 = arg6.anIntArray171[(local29 >> 16) + local306];
								local336 = arg1 + local326;
								local340 = (local326 & 0xFF00FF) + (arg1 & 0xFF00FF);
								local345 = (local336 - local340 & 0x10000) + (local340 & 0x1000100);
								local345 = local345 - (local345 >>> 8) | local336 - local345;
								local464 = (local345 >>> 24) * (arg1 >>> 24) >> 8;
								local468 = 256 - local464;
								if (local464 != 255) {
									local326 = local345;
									local345 = super.lb[local76];
									local345 = (local464 * (local326 & 0xFF00) + local468 * (local345 & 0xFF00) & 0xFF0000) + ((local345 & 0xFF00FF) * local468 + (local326 & 0xFF00FF) * local464 & 0xFF00FF00) >> 8;
								}
								super.lb[local76] = local345;
							}
							local76++;
							local29 += local56;
						}
						local29 = local205;
						local76 += local196;
					}
				} else if (arg0 == 2) {
					local205 = arg1 >>> 24;
					local297 = 256 - local205;
					local306 = (arg1 & 0xFF00FF) * local297 & 0xFF00FF00;
					local309 = (arg1 & 0xFF00) * local297 & 0xFF0000;
					local652 = (local306 | local309) >>> 8;
					local326 = local29;
					for (local336 = -arg2; local336 < 0; local336++) {
						local340 = arg6.anInt9369 * (local31 >> 16);
						local31 += local62;
						for (local345 = -arg5; local345 < 0; local345++) {
							if (this.anIntArray435[local76] > local14) {
								local464 = arg6.anIntArray171[(local29 >> 16) + local340];
								local468 = local464 >>> 24;
								local306 = local205 * (local464 & 0xFF00FF) & 0xFF00FF00;
								local481 = 256 - local468;
								local309 = local205 * (local464 & 0xFF00) & 0xFF0000;
								local464 = ((local306 | local309) >>> 8) + local652;
								local489 = super.lb[local76];
								super.lb[local76] = (local481 * (local489 & 0xFF00) + local468 * (local464 & 0xFF00) & 0xFF0000) + ((local489 & 0xFF00FF) * local481 + local468 * (local464 & 0xFF00FF) & 0xFF00FF00) >> 8;
							}
							local29 += local56;
							local76++;
						}
						local76 += local196;
						local29 = local326;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg8 != 2) {
				throw new IllegalArgumentException();
			} else if (arg0 == 1) {
				local205 = local29;
				for (local297 = -arg2; local297 < 0; local297++) {
					local306 = arg6.anInt9369 * (local31 >> 16);
					for (local309 = -arg5; local309 < 0; local309++) {
						if (local14 < this.anIntArray435[local76]) {
							local326 = arg6.anIntArray171[(local29 >> 16) + local306];
							if (local326 != 0) {
								local336 = super.lb[local76];
								local340 = local326 + local336;
								local345 = (local336 & 0xFF00FF) + (local326 & 0xFF00FF);
								local336 = (local345 & 0x1000100) + (local340 - local345 & 0x10000);
								super.lb[local76] = local336 - (local336 >>> 8) | -local336 + local340;
							}
						}
						local29 += local56;
						local76++;
					}
					local31 += local62;
					local29 = local205;
					local76 += local196;
				}
			} else if (arg0 == 0) {
				local205 = local29;
				local297 = arg1 >> 16 & 0xFF;
				local306 = arg1 >> 8 & 0xFF;
				local309 = arg1 & 0xFF;
				for (local326 = -arg2; local326 < 0; local326++) {
					local336 = arg6.anInt9369 * (local31 >> 16);
					for (local340 = -arg5; local340 < 0; local340++) {
						if (local14 < this.anIntArray435[local76]) {
							local345 = arg6.anIntArray171[local336 + (local29 >> 16)];
							if (local345 != 0) {
								local464 = (local345 & 0xFF0000) * local297 & 0xFF000000;
								local468 = local306 * (local345 & 0xFF00) & 0xFF0000;
								local481 = local309 * (local345 & 0xFF) & 0xFF00;
								local345 = (local468 | local464 | local481) >>> 8;
								local489 = super.lb[local76];
								local497 = local489 + local345;
								local510 = (local345 & 0xFF00FF) + (local489 & 0xFF00FF);
								local489 = (local497 - local510 & 0x10000) + (local510 & 0x1000100);
								super.lb[local76] = local489 - (local489 >>> 8) | local497 + -local489;
							}
						}
						local29 += local56;
						local76++;
					}
					local31 += local62;
					local76 += local196;
					local29 = local205;
				}
			} else if (arg0 == 3) {
				local205 = local29;
				for (local297 = -arg2; local297 < 0; local297++) {
					local306 = (local31 >> 16) * arg6.anInt9369;
					for (local309 = -arg5; local309 < 0; local309++) {
						if (this.anIntArray435[local76] > local14) {
							local326 = arg6.anIntArray171[local306 + (local29 >> 16)];
							local336 = arg1 + local326;
							local340 = (local326 & 0xFF00FF) + (arg1 & 0xFF00FF);
							local345 = (local340 & 0x1000100) + (local336 - local340 & 0x10000);
							local326 = local345 - (local345 >>> 8) | local336 + -local345;
							local345 = super.lb[local76];
							local340 = (local345 & 0xFF00FF) + (local326 & 0xFF00FF);
							local336 = local345 + local326;
							local345 = (local340 & 0x1000100) + (local336 - local340 & 0x10000);
							super.lb[local76] = local345 - (local345 >>> 8) | -local345 + local336;
						}
						local29 += local56;
						local76++;
					}
					local31 += local62;
					local76 += local196;
					local29 = local205;
				}
			} else if (arg0 == 2) {
				local205 = arg1 >>> 24;
				local297 = 256 - local205;
				local306 = (arg1 & 0xFF00FF) * local297 & 0xFF00FF00;
				local309 = (arg1 & 0xFF00) * local297 & 0xFF0000;
				local652 = (local309 | local306) >>> 8;
				local326 = local29;
				for (local336 = -arg2; local336 < 0; local336++) {
					local340 = arg6.anInt9369 * (local31 >> 16);
					local31 += local62;
					for (local345 = -arg5; local345 < 0; local345++) {
						if (local14 < this.anIntArray435[local76]) {
							local464 = arg6.anIntArray171[(local29 >> 16) + local340];
							if (local464 != 0) {
								local309 = (local464 & 0xFF00) * local205 & 0xFF0000;
								local306 = (local464 & 0xFF00FF) * local205 & 0xFF00FF00;
								local464 = ((local306 | local309) >>> 8) + local652;
								local468 = super.lb[local76];
								local481 = local464 + local468;
								local489 = (local468 & 0xFF00FF) + (local464 & 0xFF00FF);
								local468 = (local489 & 0x1000100) + (local481 - local489 & 0x10000);
								super.lb[local76] = local468 - (local468 >>> 8) | local481 + -local468;
							}
						}
						local29 += local56;
						local76++;
					}
					local76 += local196;
					local29 = local326;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg0 == 1) {
			local205 = local29;
			for (local297 = -arg2; local297 < 0; local297++) {
				local306 = arg6.anInt9369 * (local31 >> 16);
				local31 += local62;
				for (local309 = -arg5; local309 < 0; local309++) {
					if (this.anIntArray435[local76] > local14) {
						super.lb[local76] = arg6.anIntArray171[local306 + (local29 >> 16)];
					}
					local76++;
					local29 += local56;
				}
				local76 += local196;
				local29 = local205;
			}
		} else if (arg0 == 0) {
			local205 = arg1 >> 16 & 0xFF;
			local297 = arg1 >> 8 & 0xFF;
			local306 = arg1 & 0xFF;
			local309 = local29;
			for (local326 = -arg2; local326 < 0; local326++) {
				local336 = arg6.anInt9369 * (local31 >> 16);
				for (local340 = -arg5; local340 < 0; local340++) {
					if (local14 < this.anIntArray435[local76]) {
						local345 = arg6.anIntArray171[local336 + (local29 >> 16)];
						local464 = local205 * (local345 & 0xFF0000) & 0xFF000000;
						local468 = local297 * (local345 & 0xFF00) & 0xFF0000;
						local481 = local306 * (local345 & 0xFF) & 0xFF00;
						super.lb[local76] = (local481 | local464 | local468) >>> 8;
					}
					local76++;
					local29 += local56;
				}
				local31 += local62;
				local76 += local196;
				local29 = local309;
			}
		} else if (arg0 == 3) {
			local205 = local29;
			for (local297 = -arg2; local297 < 0; local297++) {
				local306 = (local31 >> 16) * arg6.anInt9369;
				local31 += local62;
				for (local309 = -arg5; local309 < 0; local309++) {
					if (this.anIntArray435[local76] > local14) {
						local326 = arg6.anIntArray171[(local29 >> 16) + local306];
						local336 = arg1 + local326;
						local340 = (arg1 & 0xFF00FF) + (local326 & 0xFF00FF);
						local345 = (local336 - local340 & 0x10000) + (local340 & 0x1000100);
						super.lb[local76] = local336 - local345 | local345 + -(local345 >>> 8);
					}
					local29 += local56;
					local76++;
				}
				local29 = local205;
				local76 += local196;
			}
		} else if (arg0 == 2) {
			local205 = arg1 >>> 24;
			local297 = 256 - local205;
			local306 = local297 * (arg1 & 0xFF00FF) & 0xFF00FF00;
			local309 = (arg1 & 0xFF00) * local297 & 0xFF0000;
			local652 = (local309 | local306) >>> 8;
			local326 = local29;
			for (local336 = -arg2; local336 < 0; local336++) {
				local340 = (local31 >> 16) * arg6.anInt9369;
				local31 += local62;
				for (local345 = -arg5; local345 < 0; local345++) {
					if (local14 < this.anIntArray435[local76]) {
						local464 = arg6.anIntArray171[(local29 >> 16) + local340];
						local306 = (local464 & 0xFF00FF) * local205 & 0xFF00FF00;
						local309 = local205 * (local464 & 0xFF00) & 0xFF0000;
						super.lb[local76] = ((local309 | local306) >>> 8) + local652;
					}
					local76++;
					local29 += local56;
				}
				local76 += local196;
				local29 = local326;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "()V")
	@Override
	protected void method5052() {
		super.anInt5824 = -super.anInt5827 + super.anInt5825;
		super.anInt5816 = super.anInt5831 - super.anInt5837;
		super.anInt5823 = super.anInt5844 - super.anInt5827;
		super.anInt5821 = -super.anInt5837 + super.anInt5838;
		for (@Pc(37) int local37 = 0; local37 < super.anInt5834; local37++) {
			@Pc(46) Class188 local46 = ((Class44_Sub1) super.aClass44Array3[local37]).aClass188_1;
			local46.anInt5285 = -super.anInt5844 + super.anInt5827;
			local46.anInt5282 = -super.anInt5831 + super.anInt5837;
			local46.anInt5281 = super.anInt5825 - super.anInt5844;
			local46.anInt5286 = super.anInt5838 - super.anInt5831;
		}
		@Pc(97) int local97 = super.anInt5831 * super.anInt5817 + super.anInt5844;
		for (@Pc(100) int local100 = super.anInt5831; super.anInt5838 > local100; local100++) {
			for (@Pc(104) int local104 = 0; local104 < super.anInt5834; local104++) {
				((Class44_Sub1) super.aClass44Array3[local104]).aClass188_1.anIntArray397[local100 - super.anInt5831] = local97;
			}
			local97 += super.anInt5817;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6823(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class6_Sub23 local12 = (Class6_Sub23) super.aClass128_28.method3263((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7804();
		local12 = Static176.method3226(arg0);
		super.aClass128_28.method3267(local12, (long) arg0.hashCode());
		if (arg0 != super.aCanvas11 || super.aClass58_30 != null) {
			return;
		}
		super.anInt5817 = local12.anInt7481;
		super.lb = local12.anIntArray539;
		super.anInt5843 = local12.anInt7484;
		super.aClass6_Sub23_3 = local12;
		if (this.anInt5855 != super.anInt5817 || this.anInt5874 != super.anInt5843) {
			this.anInt5855 = super.anInt5817;
			this.anInt5874 = super.anInt5843;
			this.anIntArray435 = new int[this.anInt5855 * this.anInt5874];
		}
		this.method5047();
		return;
	}

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "()V")
	@Override
	public void method6892() {
		@Pc(36) int local36;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (super.anInt5844 == 0 && super.anInt5825 == super.anInt5817 && super.anInt5831 == 0 && super.anInt5843 == super.anInt5838) {
			local36 = this.anIntArray435.length;
			local43 = local36 - local36 & 0x7;
			local45 = 0;
			while (local45 < local43) {
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
			}
			while (local36 > local45) {
				this.anIntArray435[local45++] = Integer.MAX_VALUE;
			}
			return;
		}
		local36 = super.anInt5825 - super.anInt5844;
		local43 = -super.anInt5831 + super.anInt5838;
		local45 = super.anInt5817 - local36;
		@Pc(143) int local143 = super.anInt5844 + super.anInt5831 * super.anInt5817;
		@Pc(147) int local147 = local36 >> 3;
		@Pc(151) int local151 = local36 & 0x7;
		local36 = local143 - 1;
		for (@Pc(158) int local158 = -local43; local158 < 0; local158++) {
			@Pc(167) int local167;
			if (local147 > 0) {
				local167 = local147;
				do {
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local167--;
				} while (local167 > 0);
			}
			if (local151 > 0) {
				local167 = local151;
				do {
					local36++;
					this.anIntArray435[local36] = Integer.MAX_VALUE;
					local167--;
				} while (local167 > 0);
			}
			local36 += local45;
		}
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)V")
	@Override
	public void method6873(@OriginalArg(0) int arg0) {
		super.aClass44Array3[arg0].method6769(Thread.currentThread());
	}

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "()V")
	@Override
	public void method6858() {
		if (super.aCanvas11 == null) {
			super.anInt5817 = 1;
			super.anInt5843 = 1;
			super.lb = null;
		} else {
			super.lb = super.aClass6_Sub23_3.anIntArray539;
			super.anInt5817 = super.aClass6_Sub23_3.anInt7481;
			super.anInt5843 = super.aClass6_Sub23_3.anInt7484;
		}
		super.aClass58_30 = null;
		this.method5047();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6885(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class98_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7256(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)V")
	@Override
	public void method6880(@OriginalArg(0) boolean arg0) {
		this.aBoolean412 = arg0;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6868() {
		@Pc(10) Class44_Sub1 local10 = (Class44_Sub1) this.method5048(Thread.currentThread());
		@Pc(13) Class188 local13 = local10.aClass188_1;
		local13.aBoolean378 = local13.anInt5281 < 5 || local13.anInt5281 < 75 || local13.anInt5281 < 15;
		local13.aBoolean376 = false;
		@Pc(54) int local54 = 10 - super.anInt5816;
		@Pc(59) int local59 = 15 - super.anInt5823;
		@Pc(64) int local64 = 5 - super.anInt5823;
		@Pc(69) int local69 = 50 - super.anInt5816;
		@Pc(74) int local74 = 90 - super.anInt5816;
		@Pc(79) int local79 = 75 - super.anInt5823;
		local13.aBoolean377 = false;
		local13.anInt5283 = 0;
		local13.method4585(local54, local69, local74, local64, local79, local59, 100, 100, 100, -65536, -65536, -65536);
		local13.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "(I)V")
	@Override
	public void method6905(@OriginalArg(0) int arg0) {
		super.anInt5834 = arg0;
		super.aClass44Array3 = new Class44_Sub1[super.anInt5834];
		for (@Pc(15) int local15 = 0; super.anInt5834 > local15; local15++) {
			super.aClass44Array3[local15] = new Class44_Sub1(this);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!fm;IIII)V")
	@Override
	public void method5059(@OriginalArg(0) Class98_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg0.anInt9524;
		@Pc(12) int local12 = arg4 << 1;
		if (local6 == -1) {
			this.method5061(arg1, arg0.anInt9521, 1, arg3, arg4, arg2);
			return;
		}
		if (super.anInt5846 != local6) {
			@Pc(39) Class58 local39 = (Class58) super.aClass136_69.method3473((long) local6);
			if (local39 == null) {
				@Pc(45) int[] local45 = this.method5049(local6);
				if (local45 == null) {
					return;
				}
				@Pc(56) int local56 = this.method5057(local6) ? 64 : 128;
				local39 = this.method6863(local45, local56, local56, local56);
				super.aClass136_69.method3482((long) local6, local39);
			}
			super.aClass58_31 = local39;
			super.anInt5846 = local6;
		}
		local12++;
		this.method5063(0, arg0.anInt9521, local12, arg3, arg1 - arg4, local12, (Class58_Sub1_Sub2) super.aClass58_31, arg2 - arg4, 1);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class44_Sub1 local10 = (Class44_Sub1) this.method5048(Thread.currentThread());
		@Pc(13) Class188 local13 = local10.aClass188_1;
		@Pc(18) int local18 = arg2 - arg0;
		@Pc(22) int local22 = arg3 - arg1;
		@Pc(29) int local29 = local18 >= 0 ? local18 : -local18;
		@Pc(36) int local36 = local22 < 0 ? -local22 : local22;
		@Pc(38) int local38 = local29;
		if (local36 > local29) {
			local38 = local36;
		}
		if (local38 == 0) {
			return;
		}
		@Pc(55) int local55 = (local18 << 16) / local38;
		@Pc(61) int local61 = (local22 << 16) / local38;
		local18 += local55 >> 16;
		local22 += local61 >> 16;
		if (local55 < local61) {
			local61 = -local61;
		} else {
			local55 = -local55;
		}
		@Pc(94) int local94 = local61 * arg5 >> 17;
		@Pc(102) int local102 = arg5 * local61 + 1 >> 17;
		@Pc(108) int local108 = local55 * arg5 >> 17;
		@Pc(116) int local116 = arg5 * local55 + 1 >> 17;
		@Pc(121) int local121 = arg0 - local13.method4581();
		@Pc(126) int local126 = arg1 - local13.method4573();
		@Pc(130) int local130 = local94 + local121;
		@Pc(134) int local134 = local121 - local102;
		@Pc(140) int local140 = local18 + local121 - local102;
		@Pc(146) int local146 = local121 + local18 + local94;
		@Pc(150) int local150 = local126 + local108;
		@Pc(155) int local155 = local126 - local116;
		@Pc(162) int local162 = local126 + local22 - local116;
		@Pc(168) int local168 = local108 + local22 + local126;
		local13.anInt5283 = 0;
		local13.aBoolean378 = local130 < 0 || local130 > local13.anInt5281 || local134 < 0 || local134 > local13.anInt5281 || local140 < 0 || local140 > local13.anInt5281;
		local13.method4567(local150, local155, local162, local130, local134, local140, 0, 0, 0, arg4);
		local13.aBoolean378 = local130 < 0 || local130 > local13.anInt5281 || local140 < 0 || local13.anInt5281 < local140 || local146 < 0 || local13.anInt5281 < local146;
		local13.method4567(local150, local162, local168, local130, local140, local146, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!cm;")
	@Override
	public Class44 method5048(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt5834; local7++) {
			if (arg0 == super.aClass44Array3[local7].aRunnable4) {
				return super.aClass44Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_15.method4234(arg6).aBoolean593) {
			this.method5061(arg0, arg7, arg9, arg2, arg3, arg1);
			return;
		}
		if (arg6 != super.anInt5846) {
			@Pc(43) Class58 local43 = (Class58) super.aClass136_69.method3473((long) arg6);
			if (local43 == null) {
				@Pc(49) int[] local49 = this.method5049(arg6);
				if (local49 == null) {
					return;
				}
				@Pc(60) int local60 = this.method5057(arg6) ? 64 : 128;
				local43 = this.method6863(local49, local60, local60, local60);
				super.aClass136_69.method3482((long) arg6, local43);
			}
			super.aClass58_31 = local43;
			super.anInt5846 = arg6;
		}
		this.method5063(arg8, arg7, arg4 << 1, arg2, arg0 - arg3, arg3 << 1, (Class58_Sub1_Sub2) super.aClass58_31, arg1 - arg4, arg9);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([Lclient!ba;Lclient!ig;Lclient!q;[Lclient!po;I)V")
	@Override
	public void method6872(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				((Class20_Sub1) arg0[local7]).method7273(arg2, arg3 == null ? null : arg3[local7], arg1, arg4);
			}
		}
	}
}
