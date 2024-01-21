import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class3_Sub1_Sub4_Sub4 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
	public int anInt3598;

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
	public int anInt3599;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
	public int anInt3600;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
	public int anInt3601;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4_Sub4() {
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray449 = new int[arg0 * arg1];
		this.anInt3602 = this.anInt3603 = arg0;
		this.anInt3599 = this.anInt3598 = arg1;
		this.anInt3601 = this.anInt3600 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(5) Image local5 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(10) MediaTracker local10 = new MediaTracker(arg1);
			local10.addImage(local5, 0);
			local10.waitForAll();
			this.anInt3602 = local5.getWidth(arg1);
			this.anInt3599 = local5.getHeight(arg1);
			this.anInt3603 = this.anInt3602;
			this.anInt3598 = this.anInt3599;
			this.anInt3601 = 0;
			this.anInt3600 = 0;
			this.anIntArray449 = new int[this.anInt3602 * this.anInt3599];
			@Pc(64) PixelGrabber local64 = new PixelGrabber(local5, 0, 0, this.anInt3602, this.anInt3599, this.anIntArray449, 0, this.anInt3602);
			local64.grabPixels();
		} catch (@Pc(69) InterruptedException local69) {
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(IIII)V")
	public void method2580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt3602;
		@Pc(10) int local10 = this.anInt3599;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt3603;
		@Pc(20) int local20 = this.anInt3598;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt3601 > 0) {
			local46 = ((this.anInt3601 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt3601 << 16);
		}
		if (this.anInt3600 > 0) {
			local46 = ((this.anInt3600 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt3600 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static24.anInt3596;
		@Pc(130) int local130 = Static24.anInt3596 - arg2;
		if (arg1 + arg3 > Static24.anInt3595) {
			arg3 -= arg1 + arg3 - Static24.anInt3595;
		}
		@Pc(150) int local150;
		if (arg1 < Static24.anInt3594) {
			local150 = Static24.anInt3594 - arg1;
			arg3 -= local150;
			local46 += local150 * Static24.anInt3596;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static24.anInt3592) {
			local150 = arg0 + arg2 - Static24.anInt3592;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static24.anInt3593) {
			local150 = Static24.anInt3593 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static204.method2598(Static24.anIntArray448, this.anIntArray449, local12, local14, local46, local130, arg2, arg3, local26, local32, local7);
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
	public void method2581() {
		@Pc(6) int[] local6 = new int[this.anInt3602 * this.anInt3599];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt3599 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3602; local16++) {
				local6[local8++] = this.anIntArray449[local16 + local13 * this.anInt3602];
			}
		}
		this.anIntArray449 = local6;
		this.anInt3600 = this.anInt3598 - this.anInt3599 - this.anInt3600;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt3601;
		arg1 += this.anInt3600;
		@Pc(15) int local15 = arg0 + arg1 * Static24.anInt3596;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3599;
		@Pc(23) int local23 = this.anInt3602;
		@Pc(27) int local27 = Static24.anInt3596 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static24.anInt3594) {
			local36 = Static24.anInt3594 - arg1;
			local20 -= local36;
			arg1 = Static24.anInt3594;
			local17 = local36 * local23;
			local15 += local36 * Static24.anInt3596;
		}
		if (arg1 + local20 > Static24.anInt3595) {
			local20 -= arg1 + local20 - Static24.anInt3595;
		}
		if (arg0 < Static24.anInt3593) {
			local36 = Static24.anInt3593 - arg0;
			local23 -= local36;
			arg0 = Static24.anInt3593;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static24.anInt3592) {
			local36 = arg0 + local23 - Static24.anInt3592;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static204.method2588(Static24.anIntArray448, this.anIntArray449, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "()V")
	public void method2584() {
		if (this.anInt3602 == this.anInt3603 && this.anInt3599 == this.anInt3598) {
			return;
		}
		@Pc(17) int[] local17 = new int[this.anInt3603 * this.anInt3598];
		for (@Pc(19) int local19 = 0; local19 < this.anInt3599; local19++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt3602; local22++) {
				local17[(local19 + this.anInt3600) * this.anInt3603 + local22 + this.anInt3601] = this.anIntArray449[local19 * this.anInt3602 + local22];
			}
		}
		this.anIntArray449 = local17;
		this.anInt3602 = this.anInt3603;
		this.anInt3599 = this.anInt3598;
		this.anInt3601 = 0;
		this.anInt3600 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII[I[I)V")
	public void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * 256 >> 8;
			@Pc(39) int local39 = local27 * 256 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static24.anInt3596;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg7[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg8[local71]; local97 < 0; local97++) {
					@Pc(112) int local112 = this.anIntArray449[(local86 >> 16) + (local92 >> 16) * this.anInt3602];
					if (local112 == 0) {
						local80++;
					} else {
						Static24.anIntArray448[local80++] = local112;
					}
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static24.anInt3596;
			}
		} catch (@Pc(150) Exception local150) {
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	public void method2586(@OriginalArg(0) int arg0) {
		if (this.anInt3602 == this.anInt3603 && this.anInt3599 == this.anInt3598) {
			return;
		}
		@Pc(12) int local12 = arg0;
		if (arg0 > this.anInt3601) {
			local12 = this.anInt3601;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 + this.anInt3601 + this.anInt3602 > this.anInt3603) {
			local21 = this.anInt3603 - this.anInt3601 - this.anInt3602;
		}
		@Pc(42) int local42 = arg0;
		if (arg0 > this.anInt3600) {
			local42 = this.anInt3600;
		}
		@Pc(51) int local51 = arg0;
		if (arg0 + this.anInt3600 + this.anInt3599 > this.anInt3598) {
			local51 = this.anInt3598 - this.anInt3600 - this.anInt3599;
		}
		@Pc(77) int local77 = this.anInt3602 + local12 + local21;
		@Pc(84) int local84 = this.anInt3599 + local42 + local51;
		@Pc(89) int[] local89 = new int[local77 * local84];
		for (@Pc(91) int local91 = 0; local91 < this.anInt3599; local91++) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt3602; local94++) {
				local89[(local91 + local42) * local77 + local94 + local12] = this.anIntArray449[local91 * this.anInt3602 + local94];
			}
		}
		this.anIntArray449 = local89;
		this.anInt3602 = local77;
		this.anInt3599 = local84;
		this.anInt3601 -= local12;
		this.anInt3600 -= local42;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(IIIIII)V")
	private void method2587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			return;
		}
		@Pc(9) int local9 = arg0 - (this.anInt3601 << 4);
		@Pc(16) int local16 = arg1 - (this.anInt3600 << 4);
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) arg5 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) arg5 + 0.5D);
		@Pc(53) int local53 = -local9 * local43 + -local16 * local33;
		@Pc(62) int local62 = local9 * local33 + -local16 * local43;
		@Pc(76) int local76 = ((this.anInt3602 << 4) - local9) * local43 + -local16 * local33;
		@Pc(91) int local91 = -((this.anInt3602 << 4) - local9) * local33 + -local16 * local43;
		@Pc(105) int local105 = -local9 * local43 + ((this.anInt3599 << 4) - local16) * local33;
		@Pc(118) int local118 = local9 * local33 + ((this.anInt3599 << 4) - local16) * local43;
		@Pc(136) int local136 = ((this.anInt3602 << 4) - local9) * local43 + ((this.anInt3599 << 4) - local16) * local33;
		@Pc(155) int local155 = -((this.anInt3602 << 4) - local9) * local33 + ((this.anInt3599 << 4) - local16) * local43;
		@Pc(160) int local160;
		@Pc(162) int local162;
		if (local53 < local76) {
			local160 = local53;
			local162 = local76;
		} else {
			local160 = local76;
			local162 = local53;
		}
		if (local105 < local160) {
			local160 = local105;
		}
		if (local136 < local160) {
			local160 = local136;
		}
		if (local105 > local162) {
			local162 = local105;
		}
		if (local136 > local162) {
			local162 = local136;
		}
		@Pc(192) int local192;
		@Pc(194) int local194;
		if (local62 < local91) {
			local192 = local62;
			local194 = local91;
		} else {
			local192 = local91;
			local194 = local62;
		}
		if (local118 < local192) {
			local192 = local118;
		}
		if (local155 < local192) {
			local192 = local155;
		}
		if (local118 > local194) {
			local194 = local118;
		}
		if (local155 > local194) {
			local194 = local155;
		}
		local160 >>= 0xC;
		local162 = local162 + 4095 >> 12;
		local192 >>= 0xC;
		local194 = local194 + 4095 >> 12;
		local160 += arg2;
		local162 += arg2;
		local192 += arg3;
		local194 += arg3;
		local160 >>= 0x4;
		local162 = local162 + 15 >> 4;
		local192 >>= 0x4;
		local194 = local194 + 15 >> 4;
		if (local160 < Static24.anInt3593) {
			local160 = Static24.anInt3593;
		}
		if (local162 > Static24.anInt3592) {
			local162 = Static24.anInt3592;
		}
		if (local192 < Static24.anInt3594) {
			local192 = Static24.anInt3594;
		}
		if (local194 > Static24.anInt3595) {
			local194 = Static24.anInt3595;
		}
		local162 = local160 - local162;
		if (local162 >= 0) {
			return;
		}
		local194 = local192 - local194;
		if (local194 >= 0) {
			return;
		}
		@Pc(315) int local315 = local192 * Static24.anInt3596 + local160;
		@Pc(320) double local320 = 1.6777216E7D / (double) arg5;
		@Pc(329) int local329 = (int) Math.floor(Math.sin(local23) * local320 + 0.5D);
		@Pc(338) int local338 = (int) Math.floor(Math.cos(local23) * local320 + 0.5D);
		@Pc(346) int local346 = (local160 << 4) + 8 - arg2;
		@Pc(354) int local354 = (local192 << 4) + 8 - arg3;
		@Pc(364) int local364 = (local9 << 8) - (local354 * local329 >> 4);
		@Pc(374) int local374 = (local16 << 8) + (local354 * local338 >> 4);
		@Pc(485) int local485;
		@Pc(380) int local380;
		@Pc(383) int local383;
		@Pc(459) int local459;
		@Pc(389) int local389;
		@Pc(422) int local422;
		if (local338 != 0) {
			@Pc(681) int local681;
			if (local338 < 0) {
				if (local329 == 0) {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local681 = local364 + (local346 * local338 >> 4);
						local389 = local162;
						if (local374 >= 0 && local374 - (this.anInt3599 << 12) < 0) {
							@Pc(702) int local702;
							if ((local702 = local681 - (this.anInt3602 << 12)) >= 0) {
								local485 = (local338 - local702) / local338;
								local389 = local162 + local485;
								local681 += local338 * local485;
								local383 = local315 + local485;
							}
							@Pc(730) int local730;
							if ((local730 = (local681 - local338) / local338) > local389) {
								local389 = local730;
							}
							while (local389 < 0) {
								local422 = this.anIntArray449[(local374 >> 12) * this.anInt3602 + (local681 >> 12)];
								if (local422 == 0) {
									local383++;
								} else {
									Static24.anIntArray448[local383++] = local422;
								}
								local681 += local338;
								local389++;
							}
						}
						local380++;
						local374 += local338;
						local315 += Static24.anInt3596;
					}
				} else if (local329 < 0) {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local681 = local364 + (local346 * local338 >> 4);
						local459 = local374 + (local346 * local329 >> 4);
						local389 = local162;
						@Pc(810) int local810;
						if ((local810 = local681 - (this.anInt3602 << 12)) >= 0) {
							local485 = (local338 - local810) / local338;
							local389 = local162 + local485;
							local681 += local338 * local485;
							local459 += local329 * local485;
							local383 = local315 + local485;
						}
						@Pc(844) int local844;
						if ((local844 = (local681 - local338) / local338) > local389) {
							local389 = local844;
						}
						@Pc(856) int local856;
						if ((local856 = local459 - (this.anInt3599 << 12)) >= 0) {
							local485 = (local329 - local856) / local329;
							local389 += local485;
							local681 += local338 * local485;
							local459 += local329 * local485;
							local383 += local485;
						}
						@Pc(890) int local890;
						if ((local890 = (local459 - local329) / local329) > local389) {
							local389 = local890;
						}
						while (local389 < 0) {
							local422 = this.anIntArray449[(local459 >> 12) * this.anInt3602 + (local681 >> 12)];
							if (local422 == 0) {
								local383++;
							} else {
								Static24.anIntArray448[local383++] = local422;
							}
							local681 += local338;
							local459 += local329;
							local389++;
						}
						local380++;
						local364 -= local329;
						local374 += local338;
						local315 += Static24.anInt3596;
					}
				} else {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local681 = local364 + (local346 * local338 >> 4);
						local459 = local374 + (local346 * local329 >> 4);
						local389 = local162;
						@Pc(976) int local976;
						if ((local976 = local681 - (this.anInt3602 << 12)) >= 0) {
							local485 = (local338 - local976) / local338;
							local389 = local162 + local485;
							local681 += local338 * local485;
							local459 += local329 * local485;
							local383 = local315 + local485;
						}
						@Pc(1010) int local1010;
						if ((local1010 = (local681 - local338) / local338) > local389) {
							local389 = local1010;
						}
						if (local459 < 0) {
							local485 = (local329 - local459 - 1) / local329;
							local389 += local485;
							local681 += local338 * local485;
							local459 += local329 * local485;
							local383 += local485;
						}
						@Pc(1058) int local1058;
						if ((local1058 = (local459 + 1 - (this.anInt3599 << 12) - local329) / local329) > local389) {
							local389 = local1058;
						}
						while (local389 < 0) {
							local422 = this.anIntArray449[(local459 >> 12) * this.anInt3602 + (local681 >> 12)];
							if (local422 == 0) {
								local383++;
							} else {
								Static24.anIntArray448[local383++] = local422;
							}
							local681 += local338;
							local459 += local329;
							local389++;
						}
						local380++;
						local364 -= local329;
						local374 += local338;
						local315 += Static24.anInt3596;
					}
				}
			} else if (local329 == 0) {
				local380 = local194;
				while (local380 < 0) {
					local383 = local315;
					local681 = local364 + (local346 * local338 >> 4);
					local389 = local162;
					if (local374 >= 0 && local374 - (this.anInt3599 << 12) < 0) {
						if (local681 < 0) {
							local485 = (local338 - local681 - 1) / local338;
							local389 = local162 + local485;
							local681 += local338 * local485;
							local383 = local315 + local485;
						}
						@Pc(1179) int local1179;
						if ((local1179 = (local681 + 1 - (this.anInt3602 << 12) - local338) / local338) > local389) {
							local389 = local1179;
						}
						while (local389 < 0) {
							local422 = this.anIntArray449[(local374 >> 12) * this.anInt3602 + (local681 >> 12)];
							if (local422 == 0) {
								local383++;
							} else {
								Static24.anIntArray448[local383++] = local422;
							}
							local681 += local338;
							local389++;
						}
					}
					local380++;
					local374 += local338;
					local315 += Static24.anInt3596;
				}
			} else if (local329 < 0) {
				local380 = local194;
				while (local380 < 0) {
					local383 = local315;
					local681 = local364 + (local346 * local338 >> 4);
					local459 = local374 + (local346 * local329 >> 4);
					local389 = local162;
					if (local681 < 0) {
						local485 = (local338 - local681 - 1) / local338;
						local389 = local162 + local485;
						local681 += local338 * local485;
						local459 += local329 * local485;
						local383 = local315 + local485;
					}
					@Pc(1295) int local1295;
					if ((local1295 = (local681 + 1 - (this.anInt3602 << 12) - local338) / local338) > local389) {
						local389 = local1295;
					}
					@Pc(1307) int local1307;
					if ((local1307 = local459 - (this.anInt3599 << 12)) >= 0) {
						local485 = (local329 - local1307) / local329;
						local389 += local485;
						local681 += local338 * local485;
						local459 += local329 * local485;
						local383 += local485;
					}
					@Pc(1341) int local1341;
					if ((local1341 = (local459 - local329) / local329) > local389) {
						local389 = local1341;
					}
					while (local389 < 0) {
						local422 = this.anIntArray449[(local459 >> 12) * this.anInt3602 + (local681 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static24.anIntArray448[local383++] = local422;
						}
						local681 += local338;
						local459 += local329;
						local389++;
					}
					local380++;
					local364 -= local329;
					local374 += local338;
					local315 += Static24.anInt3596;
				}
			} else {
				local380 = local194;
				while (local380 < 0) {
					local383 = local315;
					local681 = local364 + (local346 * local338 >> 4);
					local459 = local374 + (local346 * local329 >> 4);
					local389 = local162;
					if (local681 < 0) {
						local485 = (local338 - local681 - 1) / local338;
						local389 = local162 + local485;
						local681 += local338 * local485;
						local459 += local329 * local485;
						local383 = local315 + local485;
					}
					@Pc(1463) int local1463;
					if ((local1463 = (local681 + 1 - (this.anInt3602 << 12) - local338) / local338) > local389) {
						local389 = local1463;
					}
					if (local459 < 0) {
						local485 = (local329 - local459 - 1) / local329;
						local389 += local485;
						local681 += local338 * local485;
						local459 += local329 * local485;
						local383 += local485;
					}
					@Pc(1511) int local1511;
					if ((local1511 = (local459 + 1 - (this.anInt3599 << 12) - local329) / local329) > local389) {
						local389 = local1511;
					}
					while (local389 < 0) {
						local422 = this.anIntArray449[(local459 >> 12) * this.anInt3602 + (local681 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static24.anIntArray448[local383++] = local422;
						}
						local681 += local338;
						local459 += local329;
						local389++;
					}
					local380++;
					local364 -= local329;
					local374 += local338;
					local315 += Static24.anInt3596;
				}
			}
		} else if (local329 == 0) {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local389 = local162;
				if (local364 >= 0 && local374 >= 0 && local364 - (this.anInt3602 << 12) < 0 && local374 - (this.anInt3599 << 12) < 0) {
					while (local389 < 0) {
						local422 = this.anIntArray449[(local374 >> 12) * this.anInt3602 + (local364 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static24.anIntArray448[local383++] = local422;
						}
						local389++;
					}
				}
				local380++;
				local315 += Static24.anInt3596;
			}
		} else if (local329 < 0) {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local459 = local374 + (local346 * local329 >> 4);
				local389 = local162;
				if (local364 >= 0 && local364 - (this.anInt3602 << 12) < 0) {
					@Pc(478) int local478;
					if ((local478 = local459 - (this.anInt3599 << 12)) >= 0) {
						local485 = (local329 - local478) / local329;
						local389 = local162 + local485;
						local459 += local329 * local485;
						local383 = local315 + local485;
					}
					@Pc(506) int local506;
					if ((local506 = (local459 - local329) / local329) > local389) {
						local389 = local506;
					}
					while (local389 < 0) {
						local422 = this.anIntArray449[(local459 >> 12) * this.anInt3602 + (local364 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static24.anIntArray448[local383++] = local422;
						}
						local459 += local329;
						local389++;
					}
				}
				local380++;
				local364 -= local329;
				local315 += Static24.anInt3596;
			}
		} else {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local459 = local374 + (local346 * local329 >> 4);
				local389 = local162;
				if (local364 >= 0 && local364 - (this.anInt3602 << 12) < 0) {
					if (local459 < 0) {
						local485 = (local329 - local459 - 1) / local329;
						local389 = local162 + local485;
						local459 += local329 * local485;
						local383 = local315 + local485;
					}
					@Pc(617) int local617;
					if ((local617 = (local459 + 1 - (this.anInt3599 << 12) - local329) / local329) > local389) {
						local389 = local617;
					}
					while (local389 < 0) {
						local422 = this.anIntArray449[(local459 >> 12) * this.anInt3602 + (local364 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static24.anIntArray448[local383++] = local422;
						}
						local459 += local329;
						local389++;
					}
				}
				local380++;
				local364 -= local329;
				local315 += Static24.anInt3596;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIDI)V")
	public void method2589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static24.anInt3596;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(68) int local68 = local63;
				@Pc(70) int local70 = local45;
				@Pc(72) int local72 = local57;
				for (@Pc(75) int local75 = -20; local75 < 0; local75++) {
					@Pc(90) int local90 = this.anIntArray449[(local70 >> 16) + (local72 >> 16) * this.anInt3602];
					if (local90 == 0) {
						local68++;
					} else {
						Static24.anIntArray448[local68++] = local90;
					}
					local70 += local33;
					local72 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static24.anInt3596;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
	public void method2592() {
		Static24.method2578(this.anIntArray449, this.anInt3602, this.anInt3599);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
	public void method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray449.length; local1++) {
			@Pc(7) int local7 = this.anIntArray449[local1];
			if (local7 != 0) {
				@Pc(15) int local15 = local7 >> 16 & 0xFF;
				local15 += arg0;
				if (local15 < 1) {
					local15 = 1;
				} else if (local15 > 255) {
					local15 = 255;
				}
				@Pc(36) int local36 = local7 >> 8 & 0xFF;
				local36 += arg1;
				if (local36 < 1) {
					local36 = 1;
				} else if (local36 > 255) {
					local36 = 255;
				}
				@Pc(55) int local55 = local7 & 0xFF;
				local55 += arg2;
				if (local55 < 1) {
					local55 = 1;
				} else if (local55 > 255) {
					local55 = 255;
				}
				this.anIntArray449[local1] = (local15 << 16) + (local36 << 8) + local55;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(IIIII)V")
	public void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt3602;
		@Pc(10) int local10 = this.anInt3599;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt3603;
		@Pc(20) int local20 = this.anInt3598;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt3601 > 0) {
			local46 = ((this.anInt3601 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt3601 << 16);
		}
		if (this.anInt3600 > 0) {
			local46 = ((this.anInt3600 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt3600 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static24.anInt3596;
		@Pc(130) int local130 = Static24.anInt3596 - arg2;
		if (arg1 + arg3 > Static24.anInt3595) {
			arg3 -= arg1 + arg3 - Static24.anInt3595;
		}
		@Pc(150) int local150;
		if (arg1 < Static24.anInt3594) {
			local150 = Static24.anInt3594 - arg1;
			arg3 -= local150;
			local46 += local150 * Static24.anInt3596;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static24.anInt3592) {
			local150 = arg0 + arg2 - Static24.anInt3592;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static24.anInt3593) {
			local150 = Static24.anInt3593 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static204.method2583(Static24.anIntArray448, this.anIntArray449, local12, local14, local46, local130, arg2, arg3, local26, local32, local7, arg4);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)V")
	public void method2595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3601;
		arg1 += this.anInt3600;
		@Pc(15) int local15 = arg0 + arg1 * Static24.anInt3596;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3599;
		@Pc(23) int local23 = this.anInt3602;
		@Pc(27) int local27 = Static24.anInt3596 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static24.anInt3594) {
			local36 = Static24.anInt3594 - arg1;
			local20 -= local36;
			arg1 = Static24.anInt3594;
			local17 = local36 * local23;
			local15 += local36 * Static24.anInt3596;
		}
		if (arg1 + local20 > Static24.anInt3595) {
			local20 -= arg1 + local20 - Static24.anInt3595;
		}
		if (arg0 < Static24.anInt3593) {
			local36 = Static24.anInt3593 - arg0;
			local23 -= local36;
			arg0 = Static24.anInt3593;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static24.anInt3592) {
			local36 = arg0 + local23 - Static24.anInt3592;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static204.method2591(Static24.anIntArray448, this.anIntArray449, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "()Lclient!sa;")
	public Class3_Sub1_Sub4_Sub4 method2596() {
		@Pc(7) Class3_Sub1_Sub4_Sub4 local7 = new Class3_Sub1_Sub4_Sub4(this.anInt3602, this.anInt3599);
		local7.anInt3603 = this.anInt3603;
		local7.anInt3598 = this.anInt3598;
		local7.anInt3601 = this.anInt3603 - this.anInt3602 - this.anInt3601;
		local7.anInt3600 = this.anInt3600;
		for (@Pc(31) int local31 = 0; local31 < this.anInt3599; local31++) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt3602; local34++) {
				local7.anIntArray449[local31 * this.anInt3602 + local34] = this.anIntArray449[local31 * this.anInt3602 + this.anInt3602 - local34 - 1];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "()V")
	public void method2597() {
		@Pc(6) int[] local6 = new int[this.anInt3602 * this.anInt3599];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt3599; local10++) {
			for (@Pc(16) int local16 = this.anInt3602 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.anIntArray449[local16 + local10 * this.anInt3602];
			}
		}
		this.anIntArray449 = local6;
		this.anInt3601 = this.anInt3603 - this.anInt3602 - this.anInt3601;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)V")
	public void method2599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3601;
		arg1 += this.anInt3600;
		@Pc(15) int local15 = arg0 + arg1 * Static24.anInt3596;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt3599;
		@Pc(23) int local23 = this.anInt3602;
		@Pc(27) int local27 = Static24.anInt3596 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static24.anInt3594) {
			local36 = Static24.anInt3594 - arg1;
			local20 -= local36;
			arg1 = Static24.anInt3594;
			local17 = local36 * local23;
			local15 += local36 * Static24.anInt3596;
		}
		if (arg1 + local20 > Static24.anInt3595) {
			local20 -= arg1 + local20 - Static24.anInt3595;
		}
		if (arg0 < Static24.anInt3593) {
			local36 = Static24.anInt3593 - arg0;
			local23 -= local36;
			arg0 = Static24.anInt3593;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static24.anInt3592) {
			local36 = arg0 + local23 - Static24.anInt3592;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static204.method2590(Static24.anIntArray448, this.anIntArray449, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I)V")
	public void method2600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (Static24.anInt3595 - Static24.anInt3594 != arg2.length) {
			throw new IllegalStateException();
		}
		arg0 += this.anInt3601;
		arg1 += this.anInt3600;
		@Pc(21) int local21 = 0;
		@Pc(24) int local24 = this.anInt3599;
		@Pc(27) int local27 = this.anInt3602;
		@Pc(31) int local31 = Static24.anInt3596 - local27;
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = arg0 + arg1 * Static24.anInt3596;
		@Pc(46) int local46;
		if (arg1 < Static24.anInt3594) {
			local46 = Static24.anInt3594 - arg1;
			local24 -= local46;
			arg1 = Static24.anInt3594;
			local21 = local46 * local27;
			local39 += local46 * Static24.anInt3596;
		}
		if (arg1 + local24 > Static24.anInt3595) {
			local24 -= arg1 + local24 - Static24.anInt3595;
		}
		if (arg0 < Static24.anInt3593) {
			local46 = Static24.anInt3593 - arg0;
			local27 -= local46;
			arg0 = Static24.anInt3593;
			local21 += local46;
			local39 += local46;
			local33 = local46;
			local31 += local46;
		}
		if (arg0 + local27 > Static24.anInt3592) {
			local46 = arg0 + local27 - Static24.anInt3592;
			local27 -= local46;
			local33 += local46;
			local31 += local46;
		}
		if (local27 <= 0 || local24 <= 0) {
			return;
		}
		local46 = arg0 - Static24.anInt3593;
		@Pc(142) int local142 = arg1 - Static24.anInt3594;
		for (@Pc(144) int local144 = local142; local144 < local142 + local24; local144++) {
			@Pc(149) int local149 = arg2[local144];
			@Pc(153) int local153 = arg3[local144];
			@Pc(155) int local155 = local27;
			@Pc(162) int local162;
			if (local46 > local149) {
				local162 = local46 - local149;
				if (local162 >= local153) {
					local21 += local27 + local33;
					local39 += local27 + local31;
					continue;
				}
				local153 -= local162;
			} else {
				local162 = local149 - local46;
				if (local162 >= local27) {
					local21 += local27 + local33;
					local39 += local27 + local31;
					continue;
				}
				local21 += local162;
				local155 = local27 - local162;
				local39 += local162;
			}
			local162 = 0;
			if (local155 < local153) {
				local153 = local155;
			} else {
				local162 = local155 - local153;
			}
			for (@Pc(230) int local230 = -local153; local230 < 0; local230++) {
				@Pc(237) int local237 = this.anIntArray449[local21++];
				if (local237 == 0) {
					local39++;
				} else {
					Static24.anIntArray448[local39++] = local237;
				}
			}
			local21 += local162 + local33;
			local39 += local162 + local31;
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(IIII)V")
	public void method2601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anInt3603 << 3;
		@Pc(9) int local9 = this.anInt3598 << 3;
		@Pc(17) int local17 = (arg0 << 4) + (local4 & 0xF);
		@Pc(25) int local25 = (arg1 << 4) + (local9 & 0xF);
		this.method2587(local4, local9, local17, local25, arg2, arg3);
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
	public void method2602(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[this.anInt3602 * this.anInt3599];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt3599; local10++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt3602; local13++) {
				@Pc(19) int local19 = this.anIntArray449[local8];
				if (local19 == 0) {
					if (local13 > 0 && this.anIntArray449[local8 - 1] != 0) {
						local19 = arg0;
					} else if (local10 > 0 && this.anIntArray449[local8 - this.anInt3602] != 0) {
						local19 = arg0;
					} else if (local13 < this.anInt3602 - 1 && this.anIntArray449[local8 + 1] != 0) {
						local19 = arg0;
					} else if (local10 < this.anInt3599 - 1 && this.anIntArray449[local8 + this.anInt3602] != 0) {
						local19 = arg0;
					}
				}
				local6[local8++] = local19;
			}
		}
		this.anIntArray449 = local6;
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(IIII)V")
	public void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt3601;
		arg1 += this.anInt3600;
		@Pc(23) int local23 = arg0 + arg1 * Static24.anInt3596;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = this.anInt3599;
		@Pc(31) int local31 = this.anInt3602;
		@Pc(35) int local35 = Static24.anInt3596 - local31;
		@Pc(37) int local37 = 0;
		@Pc(44) int local44;
		if (arg1 < Static24.anInt3594) {
			local44 = Static24.anInt3594 - arg1;
			local28 -= local44;
			arg1 = Static24.anInt3594;
			local25 = local44 * local31;
			local23 += local44 * Static24.anInt3596;
		}
		if (arg1 + local28 > Static24.anInt3595) {
			local28 -= arg1 + local28 - Static24.anInt3595;
		}
		if (arg0 < Static24.anInt3593) {
			local44 = Static24.anInt3593 - arg0;
			local31 -= local44;
			arg0 = Static24.anInt3593;
			local25 += local44;
			local23 += local44;
			local37 = local44;
			local35 += local44;
		}
		if (arg0 + local31 > Static24.anInt3592) {
			local44 = arg0 + local31 - Static24.anInt3592;
			local31 -= local44;
			local37 += local44;
			local35 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			Static204.method2604(Static24.anIntArray448, this.anIntArray449, local25, local23, local31, local28, local35, local37);
		}
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
	public void method2605(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt3599 - 1; local4 > 0; local4--) {
			@Pc(10) int local10 = local4 * this.anInt3602;
			for (@Pc(15) int local15 = this.anInt3602 - 1; local15 > 0; local15--) {
				if (this.anIntArray449[local15 + local10] == 0 && this.anIntArray449[local15 + local10 - this.anInt3602 - 1] != 0) {
					this.anIntArray449[local15 + local10] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIIIII[I[I)V")
	public void method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static24.anInt3596;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg8[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg9[local71]; local97 < 0; local97++) {
					Static24.anIntArray448[local80++] = this.anIntArray449[(local86 >> 16) + (local92 >> 16) * this.anInt3602];
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static24.anInt3596;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}
}
