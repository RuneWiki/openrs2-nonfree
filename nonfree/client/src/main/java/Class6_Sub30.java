import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!jga", name = "B", descriptor = "I")
	private int anInt4702;

	@OriginalMember(owner = "client!jga", name = "l", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_13;

	@OriginalMember(owner = "client!jga", name = "w", descriptor = "Lclient!aga;")
	private final Class12_Sub1 aClass12_Sub1_2;

	@OriginalMember(owner = "client!jga", name = "y", descriptor = "Lclient!sca;")
	private final Class6_Sub17 aClass6_Sub17_1;

	@OriginalMember(owner = "client!jga", name = "F", descriptor = "I")
	private final int anInt4704;

	@OriginalMember(owner = "client!jga", name = "x", descriptor = "I")
	private final int anInt4701;

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
	private final int anInt4697;

	@OriginalMember(owner = "client!jga", name = "I", descriptor = "I")
	private final int anInt4707;

	@OriginalMember(owner = "client!jga", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!jga", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!jga", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!jga", name = "r", descriptor = "I")
	private int anInt4699;

	@OriginalMember(owner = "client!jga", name = "p", descriptor = "Lclient!pm;")
	private final Interface21 anInterface21_4;

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "Lclient!fw;")
	private final Interface12 anInterface12_3;

	@OriginalMember(owner = "client!jga", name = "m", descriptor = "Lclient!lk;")
	private Class209 aClass209_20;

	@OriginalMember(owner = "client!jga", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!jga", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!lba;Lclient!aga;Lclient!sca;[I)V")
	public Class6_Sub30(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) Class6_Sub17 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass132_Sub1_13 = arg0;
		this.aClass12_Sub1_2 = arg1;
		this.aClass6_Sub17_1 = arg2;
		@Pc(22) int local22 = this.aClass6_Sub17_1.method8520() - (arg1.anInt9306 >> 1);
		this.anInt4704 = this.aClass6_Sub17_1.method8518() - local22 >> arg1.anInt9312;
		this.anInt4701 = this.aClass6_Sub17_1.method8518() + local22 >> arg1.anInt9312;
		this.anInt4697 = this.aClass6_Sub17_1.method8521() - local22 >> arg1.anInt9312;
		this.anInt4707 = local22 + this.aClass6_Sub17_1.method8521() >> arg1.anInt9312;
		@Pc(76) int local76 = this.anInt4701 + 1 - this.anInt4704;
		@Pc(85) int local85 = this.anInt4707 + 1 - this.anInt4697;
		this.aFloatArrayArray11 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray10 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(139) int local139;
		@Pc(167) int local167;
		@Pc(183) int local183;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt4697 + local114;
			if (local121 > 0 && this.aClass12_Sub1_2.anInt9313 - 1 > local121) {
				for (local132 = 0; local132 <= local76; local132++) {
					local139 = local132 + this.anInt4704;
					if (local139 > 0 && this.aClass12_Sub1_2.anInt9314 - 1 > local139) {
						local167 = arg1.method7846(local139 + 1, local121) - arg1.method7846(local139 - 1, local121);
						local183 = arg1.method7846(local139, local121 + 1) - arg1.method7846(local139, local121 - 1);
						@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local167 * local167 + 65536)));
						this.aFloatArrayArray11[local132][local114] = (float) local167 * local198;
						this.aFloatArrayArray10[local132][local114] = local198 * -256.0F;
						this.aFloatArrayArray9[local132][local114] = local198 * (float) local183;
					}
				}
			}
		}
		local121 = 0;
		@Pc(285) int local285;
		for (local132 = this.anInt4697; local132 <= this.anInt4707; local132++) {
			if (local132 >= 0 && arg1.anInt9313 > local132) {
				for (local139 = this.anInt4704; local139 <= this.anInt4701; local139++) {
					if (local139 >= 0 && arg1.anInt9314 > local139) {
						local167 = arg3[local121];
						@Pc(276) int[] local276 = arg1.anIntArrayArrayArray3[local139][local132];
						if (local276 != null && local167 != 0) {
							if (local167 == 1) {
								local285 = 0;
								while (local285 < local276.length) {
									if (local276[local285++] != -1 && local276[local285++] != -1 && local276[local285++] != -1) {
										this.anInt4699 += 3;
									}
								}
							} else {
								this.anInt4699 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt4701 - this.anInt4704;
			}
		}
		if (this.anInt4699 <= 0) {
			this.anInterface21_4 = null;
			this.anInterface12_3 = null;
		} else {
			this.aClass209_20 = new Class209(Static655.method8912(this.anInt4699));
			this.anInterface21_4 = this.aClass132_Sub1_13.method7532(false);
			this.anInterface21_4.method5800(this.anInt4699);
			@Pc(396) NativeHeapBuffer local396 = this.aClass132_Sub1_13.method7524(false, this.anInt4699 * 16);
			this.aStream1 = new Stream(local396);
			while (true) {
				@Pc(408) Buffer local408;
				do {
					local408 = this.anInterface21_4.method5806();
				} while (local408 == null);
				this.aStream2 = new Stream(local408);
				local121 = 0;
				local183 = 0;
				for (local285 = this.anInt4697; local285 <= this.anInt4707; local285++) {
					if (local285 >= 0 && arg1.anInt9313 > local285) {
						@Pc(440) int local440 = 0;
						for (@Pc(443) int local443 = this.anInt4704; local443 <= this.anInt4701; local443++) {
							if (local443 >= 0 && arg1.anInt9314 > local443) {
								@Pc(459) int local459 = arg3[local121];
								@Pc(466) int[] local466 = arg1.anIntArrayArrayArray3[local443][local285];
								if (local466 != null && local459 != 0) {
									if (local459 == 1) {
										@Pc(485) int[] local485 = arg1.anIntArrayArrayArray6[local443][local285];
										@Pc(492) int[] local492 = arg1.anIntArrayArrayArray1[local443][local285];
										@Pc(494) int local494 = 0;
										label120: while (true) {
											while (true) {
												if (local494 >= local466.length) {
													break label120;
												}
												if (local466[local494] == -1 || local466[local494 + 1] == -1 || local466[local494 + 2] == -1) {
													local494 += 3;
												} else {
													this.method4008(local440, local485[local494], local492[local494], local183, local443, local285);
													local494++;
													this.method4008(local440, local485[local494], local492[local494], local183, local443, local285);
													local494++;
													this.method4008(local440, local485[local494], local492[local494], local183, local443, local285);
													local494++;
												}
											}
										}
									} else if (local459 == 3) {
										this.method4008(local440, 0, 0, local183, local443, local285);
										this.method4008(local440, arg1.anInt9306, 0, local183, local443, local285);
										this.method4008(local440, 0, arg1.anInt9306, local183, local443, local285);
									} else if (local459 == 2) {
										this.method4008(local440, arg1.anInt9306, 0, local183, local443, local285);
										this.method4008(local440, arg1.anInt9306, arg1.anInt9306, local183, local443, local285);
										this.method4008(local440, 0, 0, local183, local443, local285);
									} else if (local459 == 5) {
										this.method4008(local440, arg1.anInt9306, arg1.anInt9306, local183, local443, local285);
										this.method4008(local440, 0, arg1.anInt9306, local183, local443, local285);
										this.method4008(local440, arg1.anInt9306, 0, local183, local443, local285);
									} else if (local459 == 4) {
										this.method4008(local440, 0, arg1.anInt9306, local183, local443, local285);
										this.method4008(local440, 0, 0, local183, local443, local285);
										this.method4008(local440, arg1.anInt9306, arg1.anInt9306, local183, local443, local285);
									}
								}
							}
							local121++;
							local440++;
						}
					} else {
						local121 += this.anInt4701 - this.anInt4704;
					}
					local183++;
				}
				this.aStream2.c();
				if (this.anInterface21_4.method5808()) {
					this.aStream1.c();
					this.anInterface12_3 = this.aClass132_Sub1_13.method7564(false);
					this.anInterface12_3.method8890(16, local396, this.anInt4702 * 16);
					break;
				}
				this.aStream1.a(0);
				this.aClass209_20.method5041();
			}
		}
		this.aStream1 = null;
		this.aClass209_20 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray10 = this.aFloatArrayArray9 = null;
		this.aStream2 = null;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IS)V")
	private void method4006(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream2.b(arg0);
		} else {
			this.aStream2.c(arg0);
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIIZI)V")
	private void method4008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass12_Sub1_2.anInt9312) + arg1;
		@Pc(24) int local24 = arg2 + (arg5 << this.aClass12_Sub1_2.anInt9312);
		@Pc(31) int local31 = this.aClass12_Sub1_2.method7854(local24, local15);
		if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local24 & 0xFFFFL) << 16;
			@Pc(60) Class6 local60 = this.aClass209_20.method5038(local7);
			if (local60 != null) {
				this.method4006(((Class6_Sub40) local60).aShort83);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt4702++;
		if (local7 != -1L) {
			this.aClass209_20.method5035(local7, new Class6_Sub40(local78));
		}
		@Pc(145) float local145;
		@Pc(134) float local134;
		@Pc(156) float local156;
		@Pc(173) float local173;
		@Pc(181) float local181;
		@Pc(188) float local188;
		@Pc(195) float local195;
		@Pc(202) float local202;
		@Pc(211) float local211;
		@Pc(220) float local220;
		@Pc(262) float local262;
		if (arg1 == 0 && arg2 == 0) {
			local134 = this.aFloatArrayArray10[arg0][arg3];
			local145 = this.aFloatArrayArray11[arg0][arg3];
			local156 = this.aFloatArrayArray9[arg0][arg3];
		} else if (arg1 == this.aClass12_Sub1_2.anInt9306 && arg2 == 0) {
			local134 = this.aFloatArrayArray10[arg0 + 1][arg3];
			local156 = this.aFloatArrayArray9[arg0 + 1][arg3];
			local145 = this.aFloatArrayArray11[arg0 + 1][arg3];
		} else if (this.aClass12_Sub1_2.anInt9306 == arg1 && arg2 == this.aClass12_Sub1_2.anInt9306) {
			local134 = this.aFloatArrayArray10[arg0 + 1][arg3 + 1];
			local145 = this.aFloatArrayArray11[arg0 + 1][arg3 + 1];
			local156 = this.aFloatArrayArray9[arg0 + 1][arg3 + 1];
		} else if (arg1 == 0 && arg2 == this.aClass12_Sub1_2.anInt9306) {
			local145 = this.aFloatArrayArray11[arg0][arg3 + 1];
			local156 = this.aFloatArrayArray9[arg0][arg3 + 1];
			local134 = this.aFloatArrayArray10[arg0][arg3 + 1];
		} else {
			local173 = (float) arg1 / (float) this.aClass12_Sub1_2.anInt9306;
			local181 = (float) arg2 / (float) this.aClass12_Sub1_2.anInt9306;
			local188 = this.aFloatArrayArray11[arg0][arg3];
			local195 = this.aFloatArrayArray10[arg0][arg3];
			local202 = this.aFloatArrayArray9[arg0][arg3];
			local211 = this.aFloatArrayArray11[arg0 + 1][arg3];
			local220 = this.aFloatArrayArray10[arg0 + 1][arg3];
			@Pc(236) float local236 = local202 + (this.aFloatArrayArray9[arg0][arg3 + 1] - local202) * local173;
			@Pc(253) float local253 = local211 + (this.aFloatArrayArray11[arg0 + 1][arg3 + 1] - local211) * local173;
			local262 = this.aFloatArrayArray9[arg0 + 1][arg3];
			@Pc(279) float local279 = local220 + local173 * (this.aFloatArrayArray10[arg0 + 1][arg3 + 1] - local220);
			@Pc(295) float local295 = local188 + local173 * (this.aFloatArrayArray11[arg0][arg3 + 1] - local188);
			@Pc(311) float local311 = local195 + (this.aFloatArrayArray10[arg0][arg3 + 1] - local195) * local173;
			local134 = local311 + local181 * (local279 - local311);
			local145 = (local253 - local295) * local181 + local295;
			@Pc(344) float local344 = local262 + local173 * (this.aFloatArrayArray9[arg0 + 1][arg3 + 1] - local262);
			local156 = local236 + local181 * (local344 - local236);
		}
		local173 = (float) (this.aClass6_Sub17_1.method8518() - local15);
		local181 = (float) (this.aClass6_Sub17_1.method8522() - local31);
		local188 = (float) (this.aClass6_Sub17_1.method8521() - local24);
		local195 = (float) Math.sqrt((double) (local173 * local173 + local181 * local181 + local188 * local188));
		local202 = 1.0F / local195;
		local181 *= local202;
		local173 *= local202;
		local188 *= local202;
		local211 = local195 / (float) this.aClass6_Sub17_1.method8520();
		local220 = 1.0F - local211 * local211;
		if (local220 < 0.0F) {
			local220 = 0.0F;
		}
		local262 = local188 * local156 + local134 * local181 + local145 * local173;
		if (local262 < 0.0F) {
			local262 = 0.0F;
		}
		@Pc(535) float local535 = local220 * 2.0F * local262;
		if (local535 > 1.0F) {
			local535 = 1.0F;
		}
		@Pc(546) int local546 = this.aClass6_Sub17_1.method8519();
		@Pc(556) int local556 = (int) ((float) (local546 >> 16 & 0xFF) * local535);
		if (local556 > 255) {
			local556 = 255;
		}
		@Pc(573) int local573 = (int) ((float) (local546 >> 8 & 0xFF) * local535);
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(588) int local588 = (int) (local535 * (float) (local546 & 0xFF));
		if (Stream.b()) {
			this.aStream1.a((float) local15);
			this.aStream1.a((float) local31);
			this.aStream1.a((float) local24);
		} else {
			this.aStream1.b((float) local15);
			this.aStream1.b((float) local31);
			this.aStream1.b((float) local24);
		}
		if (local588 > 255) {
			local588 = 255;
		}
		if (this.aClass132_Sub1_13.anInt8981 == 0) {
			this.aStream1.d(local588);
			this.aStream1.d(local573);
			this.aStream1.d(local556);
		} else {
			this.aStream1.d(local556);
			this.aStream1.d(local573);
			this.aStream1.d(local588);
		}
		this.aStream1.d(255);
		this.method4006(local78);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(II[[ZII)V")
	public void method4010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface21_4 == null || (this.anInt4704 > arg3 + arg1 || (arg3 - arg1 > this.anInt4701 || (this.anInt4697 > arg0 + arg1 || arg0 - arg1 > this.anInt4707)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt4697; local51 <= this.anInt4707; local51++) {
			for (@Pc(56) int local56 = this.anInt4704; local56 <= this.anInt4701; local56++) {
				@Pc(62) int local62 = local56 - arg3;
				@Pc(67) int local67 = local51 - arg0;
				if (local62 > -arg1 && local62 < arg1 && local67 > -arg1 && arg1 > local67 && arg2[arg1 + local62][arg1 + local67]) {
					this.aClass132_Sub1_13.method7572((byte) (int) (this.aClass6_Sub17_1.method8524() * 255.0F));
					this.aClass132_Sub1_13.method7529(this.anInterface12_3, 0);
					this.aClass132_Sub1_13.method7628(this.aClass132_Sub1_13.aClass34_20);
					this.aClass132_Sub1_13.method7573(0, Static122.aClass60_1, this.anInterface21_4, this.anInt4699 / 3, 0, this.anInt4702);
					return;
				}
			}
		}
	}
}
