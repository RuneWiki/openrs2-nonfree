import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
	public int anInt332;

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
	public int anInt333;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
	public int anInt334;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
	public int anInt335;

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
	public int anInt336;

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
	public int anInt337;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray26 = new int[arg0 * arg1];
		this.anInt336 = this.anInt333 = arg0;
		this.anInt334 = this.anInt337 = arg1;
		this.anInt335 = this.anInt332 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(5) Image local5 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(10) MediaTracker local10 = new MediaTracker(arg1);
			local10.addImage(local5, 0);
			local10.waitForAll();
			this.anInt336 = local5.getWidth(arg1);
			this.anInt334 = local5.getHeight(arg1);
			this.anInt333 = this.anInt336;
			this.anInt337 = this.anInt334;
			this.anInt335 = 0;
			this.anInt332 = 0;
			this.anIntArray26 = new int[this.anInt336 * this.anInt334];
			@Pc(64) PixelGrabber local64 = new PixelGrabber(local5, 0, 0, this.anInt336, this.anInt334, this.anIntArray26, 0, this.anInt336);
			local64.grabPixels();
		} catch (@Pc(69) InterruptedException local69) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(IIII)V")
	public void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt335;
		arg1 += this.anInt332;
		@Pc(23) int local23 = arg0 + arg1 * Static111.anInt2638;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = this.anInt334;
		@Pc(31) int local31 = this.anInt336;
		@Pc(35) int local35 = Static111.anInt2638 - local31;
		@Pc(37) int local37 = 0;
		@Pc(44) int local44;
		if (arg1 < Static111.anInt2641) {
			local44 = Static111.anInt2641 - arg1;
			local28 -= local44;
			arg1 = Static111.anInt2641;
			local25 = local44 * local31;
			local23 += local44 * Static111.anInt2638;
		}
		if (arg1 + local28 > Static111.anInt2640) {
			local28 -= arg1 + local28 - Static111.anInt2640;
		}
		if (arg0 < Static111.anInt2639) {
			local44 = Static111.anInt2639 - arg0;
			local31 -= local44;
			arg0 = Static111.anInt2639;
			local25 += local44;
			local23 += local44;
			local37 = local44;
			local35 += local44;
		}
		if (arg0 + local31 > Static111.anInt2642) {
			local44 = arg0 + local31 - Static111.anInt2642;
			local31 -= local44;
			local37 += local44;
			local35 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			Static134.method173(Static111.anIntArray333, this.anIntArray26, local25, local23, local31, local28, local35, local37);
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
	public void method176() {
		@Pc(6) int[] local6 = new int[this.anInt336 * this.anInt334];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt334 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt336; local16++) {
				local6[local8++] = this.anIntArray26[local16 + local13 * this.anInt336];
			}
		}
		this.anIntArray26 = local6;
		this.anInt332 = this.anInt337 - this.anInt334 - this.anInt332;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
	public void method177() {
		if (this.anInt336 == this.anInt333 && this.anInt334 == this.anInt337) {
			return;
		}
		@Pc(17) int[] local17 = new int[this.anInt333 * this.anInt337];
		for (@Pc(19) int local19 = 0; local19 < this.anInt334; local19++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt336; local22++) {
				local17[(local19 + this.anInt332) * this.anInt333 + local22 + this.anInt335] = this.anIntArray26[local19 * this.anInt336 + local22];
			}
		}
		this.anIntArray26 = local17;
		this.anInt336 = this.anInt333;
		this.anInt334 = this.anInt337;
		this.anInt335 = 0;
		this.anInt332 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(IIII)V")
	public void method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt336;
		@Pc(10) int local10 = this.anInt334;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt333;
		@Pc(20) int local20 = this.anInt337;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt335 > 0) {
			local46 = ((this.anInt335 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt335 << 16);
		}
		if (this.anInt332 > 0) {
			local46 = ((this.anInt332 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt332 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static111.anInt2638;
		@Pc(130) int local130 = Static111.anInt2638 - arg2;
		if (arg1 + arg3 > Static111.anInt2640) {
			arg3 -= arg1 + arg3 - Static111.anInt2640;
		}
		@Pc(150) int local150;
		if (arg1 < Static111.anInt2641) {
			local150 = Static111.anInt2641 - arg1;
			arg3 -= local150;
			local46 += local150 * Static111.anInt2638;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static111.anInt2642) {
			local150 = arg0 + arg2 - Static111.anInt2642;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static111.anInt2639) {
			local150 = Static111.anInt2639 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static134.method195(Static111.anIntArray333, this.anIntArray26, local12, local14, local46, local130, arg2, arg3, local26, local32, local7);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!e;II)V")
	public void method180(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static111.anInt2642 - Static111.anInt2639 != arg0.anInt883 || Static111.anInt2640 - Static111.anInt2641 != arg0.anInt880) {
			throw new IllegalStateException();
		}
		arg1 += this.anInt335;
		arg2 += this.anInt332;
		@Pc(31) int local31 = arg1 + arg2 * Static111.anInt2638;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = this.anInt334;
		@Pc(39) int local39 = this.anInt336;
		@Pc(43) int local43 = Static111.anInt2638 - local39;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52;
		if (arg2 < Static111.anInt2641) {
			local52 = Static111.anInt2641 - arg2;
			local36 -= local52;
			arg2 = Static111.anInt2641;
			local33 = local52 * local39;
			local31 += local52 * Static111.anInt2638;
		}
		if (arg2 + local36 > Static111.anInt2640) {
			local36 -= arg2 + local36 - Static111.anInt2640;
		}
		if (arg1 < Static111.anInt2639) {
			local52 = Static111.anInt2639 - arg1;
			local39 -= local52;
			arg1 = Static111.anInt2639;
			local33 += local52;
			local31 += local52;
			local45 = local52;
			local43 += local52;
		}
		if (arg1 + local39 > Static111.anInt2642) {
			local52 = arg1 + local39 - Static111.anInt2642;
			local39 -= local52;
			local45 += local52;
			local43 += local52;
		}
		if (local39 > 0 && local36 > 0) {
			local52 = arg1 + (arg2 - Static111.anInt2641) * arg0.anInt883 - Static111.anInt2639;
			@Pc(156) int local156 = arg0.anInt883 - local39;
			Static134.method187(Static111.anIntArray333, this.anIntArray26, local33, local31, local52, local39, local36, local43, local45, local156, arg0.aByteArray12);
		}
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(IIII)V")
	public void method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method183(this.anInt333 << 3, this.anInt337 << 3, arg0 << 4, arg1 << 4, arg2, arg3);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	public void method182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt335;
		arg1 += this.anInt332;
		@Pc(15) int local15 = arg0 + arg1 * Static111.anInt2638;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt334;
		@Pc(23) int local23 = this.anInt336;
		@Pc(27) int local27 = Static111.anInt2638 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static111.anInt2641) {
			local36 = Static111.anInt2641 - arg1;
			local20 -= local36;
			arg1 = Static111.anInt2641;
			local17 = local36 * local23;
			local15 += local36 * Static111.anInt2638;
		}
		if (arg1 + local20 > Static111.anInt2640) {
			local20 -= arg1 + local20 - Static111.anInt2640;
		}
		if (arg0 < Static111.anInt2639) {
			local36 = Static111.anInt2639 - arg0;
			local23 -= local36;
			arg0 = Static111.anInt2639;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static111.anInt2642) {
			local36 = arg0 + local23 - Static111.anInt2642;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static134.method179(Static111.anIntArray333, this.anIntArray26, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(IIIIII)V")
	private void method183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 == 0) {
			return;
		}
		@Pc(9) int local9 = arg0 - (this.anInt335 << 4);
		@Pc(16) int local16 = arg1 - (this.anInt332 << 4);
		@Pc(23) double local23 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
		@Pc(33) int local33 = (int) Math.floor(Math.sin(local23) * (double) arg5 + 0.5D);
		@Pc(43) int local43 = (int) Math.floor(Math.cos(local23) * (double) arg5 + 0.5D);
		@Pc(53) int local53 = -local9 * local43 + -local16 * local33;
		@Pc(62) int local62 = local9 * local33 + -local16 * local43;
		@Pc(76) int local76 = ((this.anInt336 << 4) - local9) * local43 + -local16 * local33;
		@Pc(91) int local91 = -((this.anInt336 << 4) - local9) * local33 + -local16 * local43;
		@Pc(105) int local105 = -local9 * local43 + ((this.anInt334 << 4) - local16) * local33;
		@Pc(118) int local118 = local9 * local33 + ((this.anInt334 << 4) - local16) * local43;
		@Pc(136) int local136 = ((this.anInt336 << 4) - local9) * local43 + ((this.anInt334 << 4) - local16) * local33;
		@Pc(155) int local155 = -((this.anInt336 << 4) - local9) * local33 + ((this.anInt334 << 4) - local16) * local43;
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
		if (local160 < Static111.anInt2639) {
			local160 = Static111.anInt2639;
		}
		if (local162 > Static111.anInt2642) {
			local162 = Static111.anInt2642;
		}
		if (local192 < Static111.anInt2641) {
			local192 = Static111.anInt2641;
		}
		if (local194 > Static111.anInt2640) {
			local194 = Static111.anInt2640;
		}
		local162 = local160 - local162;
		if (local162 >= 0) {
			return;
		}
		local194 = local192 - local194;
		if (local194 >= 0) {
			return;
		}
		@Pc(315) int local315 = local192 * Static111.anInt2638 + local160;
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
						if (local374 >= 0 && local374 - (this.anInt334 << 12) < 0) {
							@Pc(702) int local702;
							if ((local702 = local681 - (this.anInt336 << 12)) >= 0) {
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
								local422 = this.anIntArray26[(local374 >> 12) * this.anInt336 + (local681 >> 12)];
								if (local422 == 0) {
									local383++;
								} else {
									Static111.anIntArray333[local383++] = local422;
								}
								local681 += local338;
								local389++;
							}
						}
						local380++;
						local374 += local338;
						local315 += Static111.anInt2638;
					}
				} else if (local329 < 0) {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local681 = local364 + (local346 * local338 >> 4);
						local459 = local374 + (local346 * local329 >> 4);
						local389 = local162;
						@Pc(810) int local810;
						if ((local810 = local681 - (this.anInt336 << 12)) >= 0) {
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
						if ((local856 = local459 - (this.anInt334 << 12)) >= 0) {
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
							local422 = this.anIntArray26[(local459 >> 12) * this.anInt336 + (local681 >> 12)];
							if (local422 == 0) {
								local383++;
							} else {
								Static111.anIntArray333[local383++] = local422;
							}
							local681 += local338;
							local459 += local329;
							local389++;
						}
						local380++;
						local364 -= local329;
						local374 += local338;
						local315 += Static111.anInt2638;
					}
				} else {
					local380 = local194;
					while (local380 < 0) {
						local383 = local315;
						local681 = local364 + (local346 * local338 >> 4);
						local459 = local374 + (local346 * local329 >> 4);
						local389 = local162;
						@Pc(976) int local976;
						if ((local976 = local681 - (this.anInt336 << 12)) >= 0) {
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
						if ((local1058 = (local459 + 1 - (this.anInt334 << 12) - local329) / local329) > local389) {
							local389 = local1058;
						}
						while (local389 < 0) {
							local422 = this.anIntArray26[(local459 >> 12) * this.anInt336 + (local681 >> 12)];
							if (local422 == 0) {
								local383++;
							} else {
								Static111.anIntArray333[local383++] = local422;
							}
							local681 += local338;
							local459 += local329;
							local389++;
						}
						local380++;
						local364 -= local329;
						local374 += local338;
						local315 += Static111.anInt2638;
					}
				}
			} else if (local329 == 0) {
				local380 = local194;
				while (local380 < 0) {
					local383 = local315;
					local681 = local364 + (local346 * local338 >> 4);
					local389 = local162;
					if (local374 >= 0 && local374 - (this.anInt334 << 12) < 0) {
						if (local681 < 0) {
							local485 = (local338 - local681 - 1) / local338;
							local389 = local162 + local485;
							local681 += local338 * local485;
							local383 = local315 + local485;
						}
						@Pc(1179) int local1179;
						if ((local1179 = (local681 + 1 - (this.anInt336 << 12) - local338) / local338) > local389) {
							local389 = local1179;
						}
						while (local389 < 0) {
							local422 = this.anIntArray26[(local374 >> 12) * this.anInt336 + (local681 >> 12)];
							if (local422 == 0) {
								local383++;
							} else {
								Static111.anIntArray333[local383++] = local422;
							}
							local681 += local338;
							local389++;
						}
					}
					local380++;
					local374 += local338;
					local315 += Static111.anInt2638;
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
					if ((local1295 = (local681 + 1 - (this.anInt336 << 12) - local338) / local338) > local389) {
						local389 = local1295;
					}
					@Pc(1307) int local1307;
					if ((local1307 = local459 - (this.anInt334 << 12)) >= 0) {
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
						local422 = this.anIntArray26[(local459 >> 12) * this.anInt336 + (local681 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static111.anIntArray333[local383++] = local422;
						}
						local681 += local338;
						local459 += local329;
						local389++;
					}
					local380++;
					local364 -= local329;
					local374 += local338;
					local315 += Static111.anInt2638;
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
					if ((local1463 = (local681 + 1 - (this.anInt336 << 12) - local338) / local338) > local389) {
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
					if ((local1511 = (local459 + 1 - (this.anInt334 << 12) - local329) / local329) > local389) {
						local389 = local1511;
					}
					while (local389 < 0) {
						local422 = this.anIntArray26[(local459 >> 12) * this.anInt336 + (local681 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static111.anIntArray333[local383++] = local422;
						}
						local681 += local338;
						local459 += local329;
						local389++;
					}
					local380++;
					local364 -= local329;
					local374 += local338;
					local315 += Static111.anInt2638;
				}
			}
		} else if (local329 == 0) {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local389 = local162;
				if (local364 >= 0 && local374 >= 0 && local364 - (this.anInt336 << 12) < 0 && local374 - (this.anInt334 << 12) < 0) {
					while (local389 < 0) {
						local422 = this.anIntArray26[(local374 >> 12) * this.anInt336 + (local364 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static111.anIntArray333[local383++] = local422;
						}
						local389++;
					}
				}
				local380++;
				local315 += Static111.anInt2638;
			}
		} else if (local329 < 0) {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local459 = local374 + (local346 * local329 >> 4);
				local389 = local162;
				if (local364 >= 0 && local364 - (this.anInt336 << 12) < 0) {
					@Pc(478) int local478;
					if ((local478 = local459 - (this.anInt334 << 12)) >= 0) {
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
						local422 = this.anIntArray26[(local459 >> 12) * this.anInt336 + (local364 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static111.anIntArray333[local383++] = local422;
						}
						local459 += local329;
						local389++;
					}
				}
				local380++;
				local364 -= local329;
				local315 += Static111.anInt2638;
			}
		} else {
			local380 = local194;
			while (local380 < 0) {
				local383 = local315;
				local459 = local374 + (local346 * local329 >> 4);
				local389 = local162;
				if (local364 >= 0 && local364 - (this.anInt336 << 12) < 0) {
					if (local459 < 0) {
						local485 = (local329 - local459 - 1) / local329;
						local389 = local162 + local485;
						local459 += local329 * local485;
						local383 = local315 + local485;
					}
					@Pc(617) int local617;
					if ((local617 = (local459 + 1 - (this.anInt334 << 12) - local329) / local329) > local389) {
						local389 = local617;
					}
					while (local389 < 0) {
						local422 = this.anIntArray26[(local459 >> 12) * this.anInt336 + (local364 >> 12)];
						if (local422 == 0) {
							local383++;
						} else {
							Static111.anIntArray333[local383++] = local422;
						}
						local459 += local329;
						local389++;
					}
				}
				local380++;
				local364 -= local329;
				local315 += Static111.anInt2638;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
	public void method185(@OriginalArg(0) int arg0) {
		if (this.anInt336 == this.anInt333 && this.anInt334 == this.anInt337) {
			return;
		}
		@Pc(12) int local12 = arg0;
		if (arg0 > this.anInt335) {
			local12 = this.anInt335;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 + this.anInt335 + this.anInt336 > this.anInt333) {
			local21 = this.anInt333 - this.anInt335 - this.anInt336;
		}
		@Pc(42) int local42 = arg0;
		if (arg0 > this.anInt332) {
			local42 = this.anInt332;
		}
		@Pc(51) int local51 = arg0;
		if (arg0 + this.anInt332 + this.anInt334 > this.anInt337) {
			local51 = this.anInt337 - this.anInt332 - this.anInt334;
		}
		@Pc(77) int local77 = this.anInt336 + local12 + local21;
		@Pc(84) int local84 = this.anInt334 + local42 + local51;
		@Pc(89) int[] local89 = new int[local77 * local84];
		for (@Pc(91) int local91 = 0; local91 < this.anInt334; local91++) {
			for (@Pc(94) int local94 = 0; local94 < this.anInt336; local94++) {
				local89[(local91 + local42) * local77 + local94 + local12] = this.anIntArray26[local91 * this.anInt336 + local94];
			}
		}
		this.anIntArray26 = local89;
		this.anInt336 = local77;
		this.anInt334 = local84;
		this.anInt335 -= local12;
		this.anInt332 -= local42;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(IIIII)V")
	public void method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(7) int local7 = this.anInt336;
		@Pc(10) int local10 = this.anInt334;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = this.anInt333;
		@Pc(20) int local20 = this.anInt337;
		@Pc(26) int local26 = (local17 << 16) / arg2;
		@Pc(32) int local32 = (local20 << 16) / arg3;
		@Pc(46) int local46;
		if (this.anInt335 > 0) {
			local46 = ((this.anInt335 << 16) + local26 - 1) / local26;
			arg0 += local46;
			local12 = local46 * local26 - (this.anInt335 << 16);
		}
		if (this.anInt332 > 0) {
			local46 = ((this.anInt332 << 16) + local32 - 1) / local32;
			arg1 += local46;
			local14 = local46 * local32 - (this.anInt332 << 16);
		}
		if (local7 < local17) {
			arg2 = ((local7 << 16) + local26 - local12 - 1) / local26;
		}
		if (local10 < local20) {
			arg3 = ((local10 << 16) + local32 - local14 - 1) / local32;
		}
		local46 = arg0 + arg1 * Static111.anInt2638;
		@Pc(130) int local130 = Static111.anInt2638 - arg2;
		if (arg1 + arg3 > Static111.anInt2640) {
			arg3 -= arg1 + arg3 - Static111.anInt2640;
		}
		@Pc(150) int local150;
		if (arg1 < Static111.anInt2641) {
			local150 = Static111.anInt2641 - arg1;
			arg3 -= local150;
			local46 += local150 * Static111.anInt2638;
			local14 += local32 * local150;
		}
		if (arg0 + arg2 > Static111.anInt2642) {
			local150 = arg0 + arg2 - Static111.anInt2642;
			arg2 -= local150;
			local130 += local150;
		}
		if (arg0 < Static111.anInt2639) {
			local150 = Static111.anInt2639 - arg0;
			arg2 -= local150;
			local46 += local150;
			local12 += local26 * local150;
			local130 += local150;
		}
		Static134.method175(Static111.anIntArray333, this.anIntArray26, local12, local14, local46, local130, arg2, arg3, local26, local32, local7, arg4);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	public void method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray26.length; local1++) {
			@Pc(7) int local7 = this.anIntArray26[local1];
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
				this.anIntArray26[local1] = (local15 << 16) + (local36 << 8) + local55;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIII[I[I)V")
	public void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static111.anInt2638;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg8[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg9[local71]; local97 < 0; local97++) {
					Static111.anIntArray333[local80++] = this.anIntArray26[(local86 >> 16) + (local92 >> 16) * this.anInt336];
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static111.anInt2638;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
	public void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0 += this.anInt335;
		arg1 += this.anInt332;
		@Pc(15) int local15 = arg0 + arg1 * Static111.anInt2638;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt334;
		@Pc(23) int local23 = this.anInt336;
		@Pc(27) int local27 = Static111.anInt2638 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static111.anInt2641) {
			local36 = Static111.anInt2641 - arg1;
			local20 -= local36;
			arg1 = Static111.anInt2641;
			local17 = local36 * local23;
			local15 += local36 * Static111.anInt2638;
		}
		if (arg1 + local20 > Static111.anInt2640) {
			local20 -= arg1 + local20 - Static111.anInt2640;
		}
		if (arg0 < Static111.anInt2639) {
			local36 = Static111.anInt2639 - arg0;
			local23 -= local36;
			arg0 = Static111.anInt2639;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static111.anInt2642) {
			local36 = arg0 + local23 - Static111.anInt2642;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static134.method172(Static111.anIntArray333, this.anIntArray26, local17, local15, local23, local20, local27, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
	public void method191(@OriginalArg(0) int arg0) {
		for (@Pc(4) int local4 = this.anInt334 - 1; local4 > 0; local4--) {
			@Pc(10) int local10 = local4 * this.anInt336;
			for (@Pc(15) int local15 = this.anInt336 - 1; local15 > 0; local15--) {
				if (this.anIntArray26[local15 + local10] == 0 && this.anIntArray26[local15 + local10 - this.anInt336 - 1] != 0) {
					this.anIntArray26[local15 + local10] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
	public void method192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt335;
		arg1 += this.anInt332;
		@Pc(15) int local15 = arg0 + arg1 * Static111.anInt2638;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt334;
		@Pc(23) int local23 = this.anInt336;
		@Pc(27) int local27 = Static111.anInt2638 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static111.anInt2641) {
			local36 = Static111.anInt2641 - arg1;
			local20 -= local36;
			arg1 = Static111.anInt2641;
			local17 = local36 * local23;
			local15 += local36 * Static111.anInt2638;
		}
		if (arg1 + local20 > Static111.anInt2640) {
			local20 -= arg1 + local20 - Static111.anInt2640;
		}
		if (arg0 < Static111.anInt2639) {
			local36 = Static111.anInt2639 - arg0;
			local23 -= local36;
			arg0 = Static111.anInt2639;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static111.anInt2642) {
			local36 = arg0 + local23 - Static111.anInt2642;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static134.method184(Static111.anIntArray333, this.anIntArray26, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "()V")
	public void method193() {
		Static111.method1764(this.anIntArray26, this.anInt336, this.anInt334);
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "()Lclient!ae;")
	public Class1_Sub1_Sub2_Sub1 method194() {
		@Pc(7) Class1_Sub1_Sub2_Sub1 local7 = new Class1_Sub1_Sub2_Sub1(this.anInt336, this.anInt334);
		local7.anInt333 = this.anInt333;
		local7.anInt337 = this.anInt337;
		local7.anInt335 = this.anInt333 - this.anInt336 - this.anInt335;
		local7.anInt332 = this.anInt332;
		for (@Pc(31) int local31 = 0; local31 < this.anInt334; local31++) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt336; local34++) {
				local7.anIntArray26[local31 * this.anInt336 + local34] = this.anIntArray26[local31 * this.anInt336 + this.anInt336 - local34 - 1];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIDI)V")
	public void method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static111.anInt2638;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(68) int local68 = local63;
				@Pc(70) int local70 = local45;
				@Pc(72) int local72 = local57;
				for (@Pc(75) int local75 = -20; local75 < 0; local75++) {
					@Pc(90) int local90 = this.anIntArray26[(local70 >> 16) + (local72 >> 16) * this.anInt336];
					if (local90 == 0) {
						local68++;
					} else {
						Static111.anIntArray333[local68++] = local90;
					}
					local70 += local33;
					local72 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static111.anInt2638;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V")
	public void method197(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[this.anInt336 * this.anInt334];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt334; local10++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt336; local13++) {
				@Pc(19) int local19 = this.anIntArray26[local8];
				if (local19 == 0) {
					if (local13 > 0 && this.anIntArray26[local8 - 1] != 0) {
						local19 = arg0;
					} else if (local10 > 0 && this.anIntArray26[local8 - this.anInt336] != 0) {
						local19 = arg0;
					} else if (local13 < this.anInt336 - 1 && this.anIntArray26[local8 + 1] != 0) {
						local19 = arg0;
					} else if (local10 < this.anInt334 - 1 && this.anIntArray26[local8 + this.anInt336] != 0) {
						local19 = arg0;
					}
				}
				local6[local8++] = local19;
			}
		}
		this.anIntArray26 = local6;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "()V")
	public void method198() {
		@Pc(6) int[] local6 = new int[this.anInt336 * this.anInt334];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt334; local10++) {
			for (@Pc(16) int local16 = this.anInt336 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.anIntArray26[local16 + local10 * this.anInt336];
			}
		}
		this.anIntArray26 = local6;
		this.anInt335 = this.anInt333 - this.anInt336 - this.anInt335;
	}
}
