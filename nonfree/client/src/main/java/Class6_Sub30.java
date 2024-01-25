import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
	private int anInt5596;

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "Lclient!ta;")
	private final Class6_Sub10 aClass6_Sub10_1;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_14;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!eh;")
	private final Class96_Sub1 aClass96_Sub1_2;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
	private final int anInt5588;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
	private final int anInt5589;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
	private final int anInt5595;

	@OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
	private final int anInt5594;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!kr", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
	private int anInt5591;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "Lclient!dfa;")
	private Class74 aClass74_38;

	@OriginalMember(owner = "client!kr", name = "E", descriptor = "Lclient!uba;")
	private final Interface25 anInterface25_6;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "Lclient!bl;")
	private final Interface6 anInterface6_9;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!jj;Lclient!eh;Lclient!ta;[I)V")
	public Class6_Sub30(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class96_Sub1 arg1, @OriginalArg(2) Class6_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass6_Sub10_1 = arg2;
		this.aClass75_Sub1_14 = arg0;
		this.aClass96_Sub1_2 = arg1;
		@Pc(23) int local23 = this.aClass6_Sub10_1.method8331() - (arg1.anInt9246 >> 1);
		this.anInt5588 = this.aClass6_Sub10_1.method8332() - local23 >> arg1.anInt9248;
		this.anInt5589 = local23 + this.aClass6_Sub10_1.method8332() >> arg1.anInt9248;
		this.anInt5595 = this.aClass6_Sub10_1.method8329() - local23 >> arg1.anInt9248;
		this.anInt5594 = this.aClass6_Sub10_1.method8329() + local23 >> arg1.anInt9248;
		@Pc(77) int local77 = this.anInt5589 + 1 - this.anInt5588;
		@Pc(86) int local86 = this.anInt5594 + 1 - this.anInt5595;
		this.aFloatArrayArray5 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray7 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray6 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(177) int local177;
		@Pc(194) int local194;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt5595 + local115;
			if (local122 > 0 && local122 < this.aClass96_Sub1_2.anInt9257 - 1) {
				for (local138 = 0; local138 <= local77; local138++) {
					local145 = local138 + this.anInt5588;
					if (local145 > 0 && local145 < this.aClass96_Sub1_2.anInt9255 - 1) {
						local177 = arg1.method8080(local145 + 1, local122) - arg1.method8080(local145 - 1, local122);
						local194 = arg1.method8080(local145, local122 + 1) - arg1.method8080(local145, local122 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local194 * local194 + 65536)));
						this.aFloatArrayArray6[local138][local115] = (float) local177 * local209;
						this.aFloatArrayArray5[local138][local115] = local209 * -256.0F;
						this.aFloatArrayArray7[local138][local115] = (float) local194 * local209;
					}
				}
			}
		}
		local122 = 0;
		@Pc(331) int local331;
		for (local138 = this.anInt5595; local138 <= this.anInt5594; local138++) {
			if (local138 >= 0 && arg1.anInt9257 > local138) {
				for (local145 = this.anInt5588; local145 <= this.anInt5589; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt9255) {
						local177 = arg3[local122];
						@Pc(316) int[] local316 = arg1.anIntArrayArrayArray4[local145][local138];
						if (local316 != null && local177 != 0) {
							if (local177 == 1) {
								local331 = 0;
								while (local316.length > local331) {
									if (local316[local331++] != -1 && local316[local331++] != -1 && local316[local331++] != -1) {
										this.anInt5591 += 3;
									}
								}
							} else {
								this.anInt5591 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt5589 - this.anInt5588;
			}
		}
		if (this.anInt5591 > 0) {
			this.aClass74_38 = new Class74(Static314.method4970(this.anInt5591));
			this.anInterface25_6 = this.aClass75_Sub1_14.method6817(false);
			this.anInterface25_6.method8679(this.anInt5591);
			@Pc(444) NativeHeapBuffer local444 = this.aClass75_Sub1_14.method6822(false, this.anInt5591 * 16);
			this.aStream4 = new Stream(local444);
			while (true) {
				@Pc(456) Buffer local456;
				do {
					local456 = this.anInterface25_6.method8677();
				} while (local456 == null);
				this.aStream5 = new Stream(local456);
				local194 = 0;
				local122 = 0;
				for (local331 = this.anInt5595; local331 <= this.anInt5594; local331++) {
					if (local331 >= 0 && arg1.anInt9257 > local331) {
						@Pc(503) int local503 = 0;
						for (@Pc(506) int local506 = this.anInt5588; local506 <= this.anInt5589; local506++) {
							if (local506 >= 0 && local506 < arg1.anInt9255) {
								@Pc(522) int local522 = arg3[local122];
								@Pc(529) int[] local529 = arg1.anIntArrayArrayArray4[local506][local331];
								if (local529 != null && local522 != 0) {
									if (local522 == 1) {
										@Pc(707) int[] local707 = arg1.anIntArrayArrayArray3[local506][local331];
										@Pc(714) int[] local714 = arg1.anIntArrayArrayArray6[local506][local331];
										@Pc(716) int local716 = 0;
										label118: while (true) {
											while (true) {
												if (local716 >= local529.length) {
													break label118;
												}
												if (local529[local716] == -1 || local529[local716 + 1] == -1 || local529[local716 + 2] == -1) {
													local716 += 3;
												} else {
													this.method5089(local707[local716], local506, local503, local714[local716], local331, local194);
													local716++;
													this.method5089(local707[local716], local506, local503, local714[local716], local331, local194);
													local716++;
													this.method5089(local707[local716], local506, local503, local714[local716], local331, local194);
													local716++;
												}
											}
										}
									} else if (local522 == 3) {
										this.method5089(0, local506, local503, 0, local331, local194);
										this.method5089(arg1.anInt9246, local506, local503, 0, local331, local194);
										this.method5089(0, local506, local503, arg1.anInt9246, local331, local194);
									} else if (local522 == 2) {
										this.method5089(arg1.anInt9246, local506, local503, 0, local331, local194);
										this.method5089(arg1.anInt9246, local506, local503, arg1.anInt9246, local331, local194);
										this.method5089(0, local506, local503, 0, local331, local194);
									} else if (local522 == 5) {
										this.method5089(arg1.anInt9246, local506, local503, arg1.anInt9246, local331, local194);
										this.method5089(0, local506, local503, arg1.anInt9246, local331, local194);
										this.method5089(arg1.anInt9246, local506, local503, 0, local331, local194);
									} else if (local522 == 4) {
										this.method5089(0, local506, local503, arg1.anInt9246, local331, local194);
										this.method5089(0, local506, local503, 0, local331, local194);
										this.method5089(arg1.anInt9246, local506, local503, arg1.anInt9246, local331, local194);
									}
								}
							}
							local503++;
							local122++;
						}
					} else {
						local122 += this.anInt5589 - this.anInt5588;
					}
					local194++;
				}
				this.aStream5.a();
				if (this.anInterface25_6.method8676()) {
					this.aStream4.a();
					this.anInterface6_9 = this.aClass75_Sub1_14.method6768(false);
					this.anInterface6_9.method3660(local444, 16, this.anInt5596 * 16);
					break;
				}
				this.aStream4.d(0);
				this.aClass74_38.method1398();
			}
		} else {
			this.anInterface25_6 = null;
			this.anInterface6_9 = null;
		}
		this.aStream5 = null;
		this.aClass74_38 = null;
		this.aStream4 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray5 = this.aFloatArrayArray7 = null;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZS)V")
	private void method5086(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream5.b(arg0);
		} else {
			this.aStream5.a(arg0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII[[Z)V")
	public void method5087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface25_6 == null || (arg1 + arg2 < this.anInt5588 || (this.anInt5589 < arg1 - arg2 || (this.anInt5595 > arg0 + arg2 || this.anInt5594 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(67) int local67 = this.anInt5595; local67 <= this.anInt5594; local67++) {
			for (@Pc(72) int local72 = this.anInt5588; local72 <= this.anInt5589; local72++) {
				@Pc(79) int local79 = local72 - arg1;
				@Pc(84) int local84 = local67 - arg0;
				if (-arg2 < local79 && local79 < arg2 && local84 > -arg2 && local84 < arg2 && arg3[local79 + arg2][arg2 + local84]) {
					this.aClass75_Sub1_14.method6731((byte) (int) (this.aClass6_Sub10_1.method8334() * 255.0F));
					this.aClass75_Sub1_14.method6827(this.anInterface6_9, 0);
					this.aClass75_Sub1_14.method6753(this.aClass75_Sub1_14.aClass207_18);
					this.aClass75_Sub1_14.method6746(Static118.aClass51_4, 0, this.anInt5596, this.anInterface25_6, 0, this.anInt5591 / 3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BIIIIII)V")
	private void method5089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg0 + (arg1 << this.aClass96_Sub1_2.anInt9248);
		@Pc(24) int local24 = arg3 + (arg4 << this.aClass96_Sub1_2.anInt9248);
		@Pc(31) int local31 = this.aClass96_Sub1_2.method8077(local15, local24);
		if ((arg0 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local24 & 0xFFFFL) << 16;
			@Pc(65) Class6 local65 = this.aClass74_38.method1401(local7);
			if (local65 != null) {
				this.method5086(((Class6_Sub52) local65).aShort130);
				return;
			}
		}
		@Pc(84) short local84 = (short) this.anInt5596++;
		if (local7 != -1L) {
			this.aClass74_38.method1399(new Class6_Sub52(local84), local7);
		}
		@Pc(336) float local336;
		@Pc(310) float local310;
		@Pc(345) float local345;
		@Pc(164) float local164;
		@Pc(172) float local172;
		@Pc(179) float local179;
		@Pc(186) float local186;
		@Pc(193) float local193;
		@Pc(202) float local202;
		@Pc(211) float local211;
		@Pc(220) float local220;
		if (arg0 == 0 && arg3 == 0) {
			local345 = this.aFloatArrayArray7[arg2][arg5];
			local310 = this.aFloatArrayArray5[arg2][arg5];
			local336 = this.aFloatArrayArray6[arg2][arg5];
		} else if (this.aClass96_Sub1_2.anInt9246 == arg0 && arg3 == 0) {
			local345 = this.aFloatArrayArray7[arg2 + 1][arg5];
			local310 = this.aFloatArrayArray5[arg2 + 1][arg5];
			local336 = this.aFloatArrayArray6[arg2 + 1][arg5];
		} else if (this.aClass96_Sub1_2.anInt9246 == arg0 && arg3 == this.aClass96_Sub1_2.anInt9246) {
			local336 = this.aFloatArrayArray6[arg2 + 1][arg5 + 1];
			local345 = this.aFloatArrayArray7[arg2 + 1][arg5 + 1];
			local310 = this.aFloatArrayArray5[arg2 + 1][arg5 + 1];
		} else if (arg0 == 0 && this.aClass96_Sub1_2.anInt9246 == arg3) {
			local336 = this.aFloatArrayArray6[arg2][arg5 + 1];
			local345 = this.aFloatArrayArray7[arg2][arg5 + 1];
			local310 = this.aFloatArrayArray5[arg2][arg5 + 1];
		} else {
			local164 = (float) arg0 / (float) this.aClass96_Sub1_2.anInt9246;
			local172 = (float) arg3 / (float) this.aClass96_Sub1_2.anInt9246;
			local179 = this.aFloatArrayArray6[arg2][arg5];
			local186 = this.aFloatArrayArray5[arg2][arg5];
			local193 = this.aFloatArrayArray7[arg2][arg5];
			local202 = this.aFloatArrayArray6[arg2 + 1][arg5];
			local211 = this.aFloatArrayArray5[arg2 + 1][arg5];
			local220 = this.aFloatArrayArray7[arg2 + 1][arg5];
			@Pc(236) float local236 = local193 + local164 * (this.aFloatArrayArray7[arg2][arg5 + 1] - local193);
			@Pc(252) float local252 = local179 + (this.aFloatArrayArray6[arg2][arg5 + 1] - local179) * local164;
			@Pc(267) float local267 = local186 + (this.aFloatArrayArray5[arg2][arg5 + 1] - local186) * local164;
			@Pc(285) float local285 = local211 + local164 * (this.aFloatArrayArray5[arg2 + 1][arg5 + 1] - local211);
			@Pc(302) float local302 = local202 + local164 * (this.aFloatArrayArray6[arg2 + 1][arg5 + 1] - local202);
			local310 = (local285 - local267) * local172 + local267;
			@Pc(328) float local328 = local220 + (this.aFloatArrayArray7[arg2 + 1][arg5 + 1] - local220) * local164;
			local336 = local172 * (local302 - local252) + local252;
			local345 = (local328 - local236) * local172 + local236;
		}
		local164 = (float) (this.aClass6_Sub10_1.method8332() - local15);
		local172 = (float) (this.aClass6_Sub10_1.method8327() - local31);
		local179 = (float) (this.aClass6_Sub10_1.method8329() - local24);
		local186 = (float) Math.sqrt((double) (local172 * local172 + local164 * local164 + local179 * local179));
		local193 = 1.0F / local186;
		local172 *= local193;
		local164 *= local193;
		local179 *= local193;
		local202 = local186 / (float) this.aClass6_Sub10_1.method8331();
		local211 = 1.0F - local202 * local202;
		if (local211 < 0.0F) {
			local211 = 0.0F;
		}
		local220 = local310 * local172 + local336 * local164 + local345 * local179;
		if (local220 < 0.0F) {
			local220 = 0.0F;
		}
		@Pc(563) float local563 = local211 * 2.0F * local220;
		if (local563 > 1.0F) {
			local563 = 1.0F;
		}
		@Pc(574) int local574 = this.aClass6_Sub10_1.method8328();
		@Pc(584) int local584 = (int) ((float) (local574 >> 16 & 0xFF) * local563);
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(607) int local607 = (int) ((float) (local574 >> 8 & 0xFF) * local563);
		if (local607 > 255) {
			local607 = 255;
		}
		@Pc(620) int local620 = (int) ((float) (local574 & 0xFF) * local563);
		if (Stream.b()) {
			this.aStream4.a((float) local15);
			this.aStream4.a((float) local31);
			this.aStream4.a((float) local24);
		} else {
			this.aStream4.b((float) local15);
			this.aStream4.b((float) local31);
			this.aStream4.b((float) local24);
		}
		if (local620 > 255) {
			local620 = 255;
		}
		if (this.aClass75_Sub1_14.anInt7674 == 0) {
			this.aStream4.c(local620);
			this.aStream4.c(local607);
			this.aStream4.c(local584);
		} else {
			this.aStream4.c(local584);
			this.aStream4.c(local607);
			this.aStream4.c(local620);
		}
		this.aStream4.c(255);
		this.method5086(local84);
	}
}
