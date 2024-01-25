import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	private int anInt7947;

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "Lclient!jba;")
	private final Class17_Sub3 aClass17_Sub3_3;

	@OriginalMember(owner = "client!rv", name = "u", descriptor = "Lclient!qea;")
	private final Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!rv", name = "C", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_21;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	private final int anInt7945;

	@OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
	private final int anInt7952;

	@OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
	private final int anInt7941;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
	private final int anInt7944;

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!rv", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
	private int anInt7940;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "Lclient!wh;")
	private Class356 aClass356_35;

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "Lclient!kga;")
	private final Interface13 anInterface13_8;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!rv", name = "H", descriptor = "Lclient!wr;")
	private final Interface24 anInterface24_15;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!qq;Lclient!jba;Lclient!qea;[I)V")
	public Class1_Sub43(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class17_Sub3 arg1, @OriginalArg(2) Class1_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass17_Sub3_3 = arg1;
		this.aClass1_Sub5_2 = arg2;
		this.aClass12_Sub2_21 = arg0;
		@Pc(22) int local22 = this.aClass1_Sub5_2.method4162() - (arg1.anInt7986 >> 1);
		this.anInt7945 = this.aClass1_Sub5_2.method4159() - local22 >> arg1.anInt7988;
		this.anInt7952 = local22 + this.aClass1_Sub5_2.method4159() >> arg1.anInt7988;
		this.anInt7941 = this.aClass1_Sub5_2.method4158() - local22 >> arg1.anInt7988;
		this.anInt7944 = this.aClass1_Sub5_2.method4158() + local22 >> arg1.anInt7988;
		@Pc(75) int local75 = this.anInt7952 + 1 - this.anInt7945;
		@Pc(84) int local84 = this.anInt7944 + 1 - this.anInt7941;
		this.aFloatArrayArray10 = new float[local75 + 1][local84 + 1];
		this.aFloatArrayArray9 = new float[local75 + 1][local84 + 1];
		this.aFloatArrayArray11 = new float[local75 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(170) int local170;
		@Pc(186) int local186;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = local113 + this.anInt7941;
			if (local120 > 0 && this.aClass17_Sub3_3.anInt7984 - 1 > local120) {
				for (local135 = 0; local135 <= local75; local135++) {
					local142 = this.anInt7945 + local135;
					if (local142 > 0 && local142 < this.aClass17_Sub3_3.anInt7983 - 1) {
						local170 = arg1.method6642(local142 + 1, local120) - arg1.method6642(local142 - 1, local120);
						local186 = arg1.method6642(local142, local120 + 1) - arg1.method6642(local142, local120 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + local170 * local170 + 65536)));
						this.aFloatArrayArray11[local135][local113] = (float) local170 * local201;
						this.aFloatArrayArray9[local135][local113] = -256.0F * local201;
						this.aFloatArrayArray10[local135][local113] = (float) local186 * local201;
					}
				}
			}
		}
		local120 = 0;
		@Pc(310) int local310;
		for (local135 = this.anInt7941; local135 <= this.anInt7944; local135++) {
			if (local135 >= 0 && arg1.anInt7984 > local135) {
				for (local142 = this.anInt7945; local142 <= this.anInt7952; local142++) {
					if (local142 >= 0 && arg1.anInt7983 > local142) {
						local170 = arg3[local120];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray10[local142][local135];
						if (local291 != null && local170 != 0) {
							if (local170 == 1) {
								local310 = 0;
								while (local310 < local291.length) {
									if (local291[local310++] != -1 && local291[local310++] != -1 && local291[local310++] != -1) {
										this.anInt7940 += 3;
									}
								}
							} else {
								this.anInt7940 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt7952 - this.anInt7945;
			}
		}
		if (this.anInt7940 > 0) {
			this.aClass356_35 = new Class356(Static200.method3428(this.anInt7940));
			this.anInterface13_8 = this.aClass12_Sub2_21.method6193(false);
			this.anInterface13_8.method7650(this.anInt7940);
			@Pc(394) NativeHeapBuffer local394 = this.aClass12_Sub2_21.method6177(false, this.anInt7940 * 16);
			this.aStream6 = new Stream(local394);
			while (true) {
				@Pc(406) Buffer local406;
				do {
					local406 = this.anInterface13_8.method7648();
				} while (local406 == null);
				this.aStream7 = new Stream(local406);
				local186 = 0;
				local120 = 0;
				for (local310 = this.anInt7941; local310 <= this.anInt7944; local310++) {
					if (local310 >= 0 && arg1.anInt7984 > local310) {
						@Pc(438) int local438 = 0;
						for (@Pc(441) int local441 = this.anInt7945; local441 <= this.anInt7952; local441++) {
							if (local441 >= 0 && local441 < arg1.anInt7983) {
								@Pc(460) int local460 = arg3[local120];
								@Pc(467) int[] local467 = arg1.anIntArrayArrayArray10[local441][local310];
								if (local467 != null && local460 != 0) {
									if (local460 == 1) {
										@Pc(623) int[] local623 = arg1.anIntArrayArrayArray12[local441][local310];
										@Pc(630) int[] local630 = arg1.anIntArrayArrayArray13[local441][local310];
										@Pc(632) int local632 = 0;
										label118: while (true) {
											while (true) {
												if (local467.length <= local632) {
													break label118;
												}
												if (local467[local632] == -1 || local467[local632 + 1] == -1 || local467[local632 + 2] == -1) {
													local632 += 3;
												} else {
													this.method6616(local441, local623[local632], local186, local630[local632], local310, local438);
													local632++;
													this.method6616(local441, local623[local632], local186, local630[local632], local310, local438);
													local632++;
													this.method6616(local441, local623[local632], local186, local630[local632], local310, local438);
													local632++;
												}
											}
										}
									} else if (local460 == 3) {
										this.method6616(local441, 0, local186, 0, local310, local438);
										this.method6616(local441, arg1.anInt7986, local186, 0, local310, local438);
										this.method6616(local441, 0, local186, arg1.anInt7986, local310, local438);
									} else if (local460 == 2) {
										this.method6616(local441, arg1.anInt7986, local186, 0, local310, local438);
										this.method6616(local441, arg1.anInt7986, local186, arg1.anInt7986, local310, local438);
										this.method6616(local441, 0, local186, 0, local310, local438);
									} else if (local460 == 5) {
										this.method6616(local441, arg1.anInt7986, local186, arg1.anInt7986, local310, local438);
										this.method6616(local441, 0, local186, arg1.anInt7986, local310, local438);
										this.method6616(local441, arg1.anInt7986, local186, 0, local310, local438);
									} else if (local460 == 4) {
										this.method6616(local441, 0, local186, arg1.anInt7986, local310, local438);
										this.method6616(local441, 0, local186, 0, local310, local438);
										this.method6616(local441, arg1.anInt7986, local186, arg1.anInt7986, local310, local438);
									}
								}
							}
							local120++;
							local438++;
						}
					} else {
						local120 += this.anInt7952 - this.anInt7945;
					}
					local186++;
				}
				this.aStream7.a();
				if (this.anInterface13_8.method7652()) {
					this.aStream6.a();
					this.anInterface24_15 = this.aClass12_Sub2_21.method6176(false);
					this.anInterface24_15.method6517(local394, 16, this.anInt7947 * 16);
					break;
				}
				this.aStream6.c(0);
				this.aClass356_35.method7802();
			}
		} else {
			this.anInterface13_8 = null;
			this.anInterface24_15 = null;
		}
		this.aStream6 = null;
		this.aStream7 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray9 = this.aFloatArrayArray10 = null;
		this.aClass356_35 = null;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIZI)V")
	private void method6616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg1 + (arg0 << this.aClass17_Sub3_3.anInt7988);
		@Pc(25) int local25 = arg3 + (arg4 << this.aClass17_Sub3_3.anInt7988);
		@Pc(32) int local32 = this.aClass17_Sub3_3.method6637(local16, local25);
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | ((long) local25 & 0xFFFFL) << 16;
			@Pc(64) Class1 local64 = this.aClass356_35.method7796(local7);
			if (local64 != null) {
				this.method6622(((Class1_Sub4) local64).aShort7);
				return;
			}
		}
		@Pc(82) short local82 = (short) this.anInt7947++;
		if (local7 != -1L) {
			this.aClass356_35.method7800(local7, new Class1_Sub4(local82));
		}
		@Pc(121) float local121;
		@Pc(139) float local139;
		@Pc(130) float local130;
		@Pc(195) float local195;
		@Pc(203) float local203;
		@Pc(210) float local210;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(233) float local233;
		@Pc(242) float local242;
		@Pc(315) float local315;
		if (arg1 == 0 && arg3 == 0) {
			local139 = this.aFloatArrayArray9[arg5][arg2];
			local121 = this.aFloatArrayArray11[arg5][arg2];
			local130 = this.aFloatArrayArray10[arg5][arg2];
		} else if (arg1 == this.aClass17_Sub3_3.anInt7986 && arg3 == 0) {
			local121 = this.aFloatArrayArray11[arg5 + 1][arg2];
			local130 = this.aFloatArrayArray10[arg5 + 1][arg2];
			local139 = this.aFloatArrayArray9[arg5 + 1][arg2];
		} else if (arg1 == this.aClass17_Sub3_3.anInt7986 && this.aClass17_Sub3_3.anInt7986 == arg3) {
			local130 = this.aFloatArrayArray10[arg5 + 1][arg2 + 1];
			local139 = this.aFloatArrayArray9[arg5 + 1][arg2 + 1];
			local121 = this.aFloatArrayArray11[arg5 + 1][arg2 + 1];
		} else if (arg1 == 0 && this.aClass17_Sub3_3.anInt7986 == arg3) {
			local139 = this.aFloatArrayArray9[arg5][arg2 + 1];
			local121 = this.aFloatArrayArray11[arg5][arg2 + 1];
			local130 = this.aFloatArrayArray10[arg5][arg2 + 1];
		} else {
			local195 = (float) arg1 / (float) this.aClass17_Sub3_3.anInt7986;
			local203 = (float) arg3 / (float) this.aClass17_Sub3_3.anInt7986;
			local210 = this.aFloatArrayArray11[arg5][arg2];
			local217 = this.aFloatArrayArray9[arg5][arg2];
			local224 = this.aFloatArrayArray10[arg5][arg2];
			local233 = this.aFloatArrayArray11[arg5 + 1][arg2];
			local242 = this.aFloatArrayArray9[arg5 + 1][arg2];
			@Pc(259) float local259 = local233 + local195 * (this.aFloatArrayArray11[arg5 + 1][arg2 + 1] - local233);
			@Pc(275) float local275 = local210 + local195 * (this.aFloatArrayArray11[arg5][arg2 + 1] - local210);
			@Pc(290) float local290 = local224 + local195 * (this.aFloatArrayArray10[arg5][arg2 + 1] - local224);
			@Pc(306) float local306 = local217 + local195 * (this.aFloatArrayArray9[arg5][arg2 + 1] - local217);
			local315 = this.aFloatArrayArray10[arg5 + 1][arg2];
			@Pc(332) float local332 = local242 + local195 * (this.aFloatArrayArray9[arg5 + 1][arg2 + 1] - local242);
			local121 = local203 * (local259 - local275) + local275;
			@Pc(358) float local358 = local315 + (this.aFloatArrayArray10[arg5 + 1][arg2 + 1] - local315) * local195;
			local139 = (local332 - local306) * local203 + local306;
			local130 = local203 * (local358 - local290) + local290;
		}
		local195 = this.aClass1_Sub5_2.method4159() - local16;
		local203 = this.aClass1_Sub5_2.method4163() - local32;
		local210 = this.aClass1_Sub5_2.method4158() - local25;
		local217 = (float) Math.sqrt((double) (local210 * local210 + local203 * local203 + local195 * local195));
		local224 = 1.0F / local217;
		local203 *= local224;
		local210 *= local224;
		local195 *= local224;
		local233 = local217 / (float) this.aClass1_Sub5_2.method4162();
		local242 = 1.0F - local233 * local233;
		if (local242 < 0.0F) {
			local242 = 0.0F;
		}
		local315 = local130 * local210 + local139 * local203 + local121 * local195;
		if (local315 < 0.0F) {
			local315 = 0.0F;
		}
		@Pc(533) float local533 = local242 * local315 * 2.0F;
		if (local533 > 1.0F) {
			local533 = 1.0F;
		}
		@Pc(544) int local544 = this.aClass1_Sub5_2.method4165();
		@Pc(554) int local554 = (int) (local533 * (float) (local544 >> 16 & 0xFF));
		if (local554 > 255) {
			local554 = 255;
		}
		@Pc(571) int local571 = (int) ((float) (local544 >> 8 & 0xFF) * local533);
		if (local571 > 255) {
			local571 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local544 & 0xFF) * local533);
		if (local586 > 255) {
			local586 = 255;
		}
		if (Stream.c()) {
			this.aStream6.b((float) local16);
			this.aStream6.b((float) local32);
			this.aStream6.b((float) local25);
		} else {
			this.aStream6.a((float) local16);
			this.aStream6.a((float) local32);
			this.aStream6.a((float) local25);
		}
		if (this.aClass12_Sub2_21.anInt7554 == 0) {
			this.aStream6.d(local586);
			this.aStream6.d(local571);
			this.aStream6.d(local554);
		} else {
			this.aStream6.d(local554);
			this.aStream6.d(local571);
			this.aStream6.d(local586);
		}
		this.aStream6.d(255);
		this.method6622(local82);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[[ZIIB)V")
	public void method6621(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface13_8 == null || (this.anInt7945 > arg3 + arg0 || (arg3 - arg0 > this.anInt7952 || (this.anInt7941 > arg2 + arg0 || this.anInt7944 < arg2 - arg0)))) {
			return;
		}
		for (@Pc(47) int local47 = this.anInt7941; local47 <= this.anInt7944; local47++) {
			for (@Pc(54) int local54 = this.anInt7945; local54 <= this.anInt7952; local54++) {
				@Pc(60) int local60 = local54 - arg3;
				@Pc(64) int local64 = local47 - arg2;
				if (-arg0 < local60 && arg0 > local60 && -arg0 < local64 && local64 < arg0 && arg1[arg0 + local60][local64 + arg0]) {
					this.aClass12_Sub2_21.method6165((byte) (this.aClass1_Sub5_2.method4160() * 255.0F));
					this.aClass12_Sub2_21.method6276(0, this.anInterface24_15);
					this.aClass12_Sub2_21.method6194(this.aClass12_Sub2_21.aClass331_18);
					this.aClass12_Sub2_21.method6274(0, 0, this.anInterface13_8, this.anInt7940 / 3, this.anInt7947, Static312.aClass165_3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IS)V")
	private void method6622(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream7.b(arg0);
		} else {
			this.aStream7.e(arg0);
		}
	}
}
