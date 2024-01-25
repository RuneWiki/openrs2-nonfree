import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class4_Sub35 extends Class4 {

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
	private int anInt7773;

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "Lclient!ul;")
	private final Class4_Sub24 aClass4_Sub24_3;

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "Lclient!jda;")
	private final Class83_Sub2 aClass83_Sub2_1;

	@OriginalMember(owner = "client!pu", name = "A", descriptor = "Lclient!ifa;")
	private final Class44_Sub2 aClass44_Sub2_13;

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
	private final int anInt7781;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	private final int anInt7774;

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
	private final int anInt7775;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
	private final int anInt7779;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!pu", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
	private int anInt7778;

	@OriginalMember(owner = "client!pu", name = "I", descriptor = "Lclient!el;")
	private final Interface9 anInterface9_14;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "Lclient!cda;")
	private final Interface3 anInterface3_5;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "Lclient!waa;")
	private Class350 aClass350_33;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!pu", name = "G", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!ifa;Lclient!jda;Lclient!ul;[I)V")
	public Class4_Sub35(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) Class83_Sub2 arg1, @OriginalArg(2) Class4_Sub24 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass4_Sub24_3 = arg2;
		this.aClass83_Sub2_1 = arg1;
		this.aClass44_Sub2_13 = arg0;
		@Pc(22) int local22 = this.aClass4_Sub24_3.method7151() - (arg1.anInt8824 >> 1);
		this.anInt7781 = this.aClass4_Sub24_3.method7145() - local22 >> arg1.anInt8825;
		this.anInt7774 = local22 + this.aClass4_Sub24_3.method7145() >> arg1.anInt8825;
		this.anInt7775 = this.aClass4_Sub24_3.method7142() - local22 >> arg1.anInt8825;
		this.anInt7779 = this.aClass4_Sub24_3.method7142() + local22 >> arg1.anInt8825;
		@Pc(76) int local76 = this.anInt7774 + 1 - this.anInt7781;
		@Pc(84) int local84 = this.anInt7779 + 1 - this.anInt7775;
		this.aFloatArrayArray9 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray11 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray10 = new float[local76 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(170) int local170;
		@Pc(186) int local186;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = local113 + this.anInt7775;
			if (local120 > 0 && this.aClass83_Sub2_1.anInt8830 - 1 > local120) {
				for (local138 = 0; local138 <= local76; local138++) {
					local145 = local138 + this.anInt7781;
					if (local145 > 0 && this.aClass83_Sub2_1.anInt8829 - 1 > local145) {
						local170 = arg1.method7217(local120, local145 + 1) - arg1.method7217(local120, local145 - 1);
						local186 = arg1.method7217(local120 + 1, local145) - arg1.method7217(local120 - 1, local145);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local186 * local186 + 65536)));
						this.aFloatArrayArray10[local138][local113] = local201 * (float) local170;
						this.aFloatArrayArray9[local138][local113] = -256.0F * local201;
						this.aFloatArrayArray11[local138][local113] = local201 * (float) local186;
					}
				}
			}
		}
		local120 = 0;
		@Pc(309) int local309;
		for (local138 = this.anInt7775; local138 <= this.anInt7779; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt8830) {
				for (local145 = this.anInt7781; local145 <= this.anInt7774; local145++) {
					if (local145 >= 0 && arg1.anInt8829 > local145) {
						local170 = arg3[local120];
						@Pc(298) int[] local298 = arg1.anIntArrayArrayArray9[local145][local138];
						if (local298 != null && local170 != 0) {
							if (local170 == 1) {
								local309 = 0;
								while (local309 < local298.length) {
									if (local298[local309++] != -1 && local298[local309++] != -1 && local298[local309++] != -1) {
										this.anInt7778 += 3;
									}
								}
							} else {
								this.anInt7778 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt7774 - this.anInt7781;
			}
		}
		if (this.anInt7778 <= 0) {
			this.anInterface9_14 = null;
			this.anInterface3_5 = null;
		} else {
			this.aClass350_33 = new Class350(Static341.method5553(this.anInt7778));
			this.anInterface3_5 = this.aClass44_Sub2_13.method4245(false);
			this.anInterface3_5.method5228(this.anInt7778);
			@Pc(410) NativeHeapBuffer local410 = this.aClass44_Sub2_13.method4360(this.anInt7778 * 16, false);
			this.aStream4 = new Stream(local410);
			while (true) {
				@Pc(422) Buffer local422;
				do {
					local422 = this.anInterface3_5.method5235();
				} while (local422 == null);
				this.aStream5 = new Stream(local422);
				local186 = 0;
				local120 = 0;
				for (local309 = this.anInt7775; local309 <= this.anInt7779; local309++) {
					if (local309 >= 0 && local309 < arg1.anInt8830) {
						@Pc(454) int local454 = 0;
						for (@Pc(457) int local457 = this.anInt7781; local457 <= this.anInt7774; local457++) {
							if (local457 >= 0 && arg1.anInt8829 > local457) {
								@Pc(473) int local473 = arg3[local120];
								@Pc(480) int[] local480 = arg1.anIntArrayArrayArray9[local457][local309];
								if (local480 != null && local473 != 0) {
									if (local473 == 1) {
										@Pc(496) int[] local496 = arg1.anIntArrayArrayArray6[local457][local309];
										@Pc(503) int[] local503 = arg1.anIntArrayArrayArray8[local457][local309];
										@Pc(505) int local505 = 0;
										label119: while (true) {
											while (true) {
												if (local505 >= local480.length) {
													break label119;
												}
												if (local480[local505] == -1 || local480[local505 + 1] == -1 || local480[local505 + 2] == -1) {
													local505 += 3;
												} else {
													this.method6489(local457, local186, local496[local505], local454, local309, local503[local505]);
													local505++;
													this.method6489(local457, local186, local496[local505], local454, local309, local503[local505]);
													local505++;
													this.method6489(local457, local186, local496[local505], local454, local309, local503[local505]);
													local505++;
												}
											}
										}
									} else if (local473 == 3) {
										this.method6489(local457, local186, 0, local454, local309, 0);
										this.method6489(local457, local186, arg1.anInt8824, local454, local309, 0);
										this.method6489(local457, local186, 0, local454, local309, arg1.anInt8824);
									} else if (local473 == 2) {
										this.method6489(local457, local186, arg1.anInt8824, local454, local309, 0);
										this.method6489(local457, local186, arg1.anInt8824, local454, local309, arg1.anInt8824);
										this.method6489(local457, local186, 0, local454, local309, 0);
									} else if (local473 == 5) {
										this.method6489(local457, local186, arg1.anInt8824, local454, local309, arg1.anInt8824);
										this.method6489(local457, local186, 0, local454, local309, arg1.anInt8824);
										this.method6489(local457, local186, arg1.anInt8824, local454, local309, 0);
									} else if (local473 == 4) {
										this.method6489(local457, local186, 0, local454, local309, arg1.anInt8824);
										this.method6489(local457, local186, 0, local454, local309, 0);
										this.method6489(local457, local186, arg1.anInt8824, local454, local309, arg1.anInt8824);
									}
								}
							}
							local120++;
							local454++;
						}
					} else {
						local120 += this.anInt7774 - this.anInt7781;
					}
					local186++;
				}
				this.aStream5.a();
				if (this.anInterface3_5.method5237()) {
					this.aStream4.a();
					this.anInterface9_14 = this.aClass44_Sub2_13.method4286(false);
					this.anInterface9_14.method5103(this.anInt7773 * 16, 16, local410);
					break;
				}
				this.aStream4.c(0);
				this.aClass350_33.method8203();
			}
		}
		this.aStream5 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray9 = this.aFloatArrayArray11 = null;
		this.aStream4 = null;
		this.aClass350_33 = null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[[ZI)V")
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface3_5 == null || (this.anInt7781 > arg2 + arg0 || (arg0 - arg2 > this.anInt7774 || (this.anInt7775 > arg1 + arg2 || arg1 - arg2 > this.anInt7779)))) {
			return;
		}
		for (@Pc(59) int local59 = this.anInt7775; local59 <= this.anInt7779; local59++) {
			for (@Pc(64) int local64 = this.anInt7781; local64 <= this.anInt7774; local64++) {
				@Pc(71) int local71 = local64 - arg0;
				@Pc(76) int local76 = local59 - arg1;
				if (-arg2 < local71 && arg2 > local71 && local76 > -arg2 && arg2 > local76 && arg3[arg2 + local71][arg2 + local76]) {
					this.aClass44_Sub2_13.method4365((byte) (this.aClass4_Sub24_3.method7144() * 255.0F));
					this.aClass44_Sub2_13.method4358(0, this.anInterface9_14);
					this.aClass44_Sub2_13.method4374(this.aClass44_Sub2_13.aClass3_18);
					this.aClass44_Sub2_13.method4361(0, Static262.aClass271_5, this.anInt7778 / 3, 0, this.anInt7773, this.anInterface3_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(SI)V")
	private void method6487(@OriginalArg(0) short arg0) {
		if (Stream.b()) {
			this.aStream5.e(arg0);
		} else {
			this.aStream5.f(arg0);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIZI)V")
	private void method6489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg2 + (arg0 << this.aClass83_Sub2_1.anInt8825);
		@Pc(23) int local23 = (arg4 << this.aClass83_Sub2_1.anInt8825) + arg5;
		@Pc(30) int local30 = this.aClass83_Sub2_1.method7213(local15, local23);
		if ((arg2 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class4 local59 = this.aClass350_33.method8207(local7);
			if (local59 != null) {
				this.method6487(((Class4_Sub30) local59).aShort82);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt7773++;
		if (local7 != -1L) {
			this.aClass350_33.method8199(local7, new Class4_Sub30(local77));
		}
		@Pc(143) float local143;
		@Pc(125) float local125;
		@Pc(134) float local134;
		@Pc(213) float local213;
		@Pc(221) float local221;
		@Pc(228) float local228;
		@Pc(235) float local235;
		@Pc(242) float local242;
		@Pc(251) float local251;
		@Pc(260) float local260;
		@Pc(351) float local351;
		if (arg2 == 0 && arg5 == 0) {
			local134 = this.aFloatArrayArray11[arg3][arg1];
			local125 = this.aFloatArrayArray9[arg3][arg1];
			local143 = this.aFloatArrayArray10[arg3][arg1];
		} else if (this.aClass83_Sub2_1.anInt8824 == arg2 && arg5 == 0) {
			local125 = this.aFloatArrayArray9[arg3 + 1][arg1];
			local134 = this.aFloatArrayArray11[arg3 + 1][arg1];
			local143 = this.aFloatArrayArray10[arg3 + 1][arg1];
		} else if (arg2 == this.aClass83_Sub2_1.anInt8824 && arg5 == this.aClass83_Sub2_1.anInt8824) {
			local143 = this.aFloatArrayArray10[arg3 + 1][arg1 + 1];
			local134 = this.aFloatArrayArray11[arg3 + 1][arg1 + 1];
			local125 = this.aFloatArrayArray9[arg3 + 1][arg1 + 1];
		} else if (arg2 == 0 && this.aClass83_Sub2_1.anInt8824 == arg5) {
			local143 = this.aFloatArrayArray10[arg3][arg1 + 1];
			local134 = this.aFloatArrayArray11[arg3][arg1 + 1];
			local125 = this.aFloatArrayArray9[arg3][arg1 + 1];
		} else {
			local213 = (float) arg2 / (float) this.aClass83_Sub2_1.anInt8824;
			local221 = (float) arg5 / (float) this.aClass83_Sub2_1.anInt8824;
			local228 = this.aFloatArrayArray10[arg3][arg1];
			local235 = this.aFloatArrayArray9[arg3][arg1];
			local242 = this.aFloatArrayArray11[arg3][arg1];
			local251 = this.aFloatArrayArray10[arg3 + 1][arg1];
			local260 = this.aFloatArrayArray9[arg3 + 1][arg1];
			@Pc(276) float local276 = local235 + local213 * (this.aFloatArrayArray9[arg3][arg1 + 1] - local235);
			@Pc(292) float local292 = local242 + local213 * (this.aFloatArrayArray11[arg3][arg1 + 1] - local242);
			@Pc(308) float local308 = local228 + local213 * (this.aFloatArrayArray10[arg3][arg1 + 1] - local228);
			@Pc(325) float local325 = local260 + (this.aFloatArrayArray9[arg3 + 1][arg1 + 1] - local260) * local213;
			@Pc(342) float local342 = local251 + (this.aFloatArrayArray10[arg3 + 1][arg1 + 1] - local251) * local213;
			local351 = this.aFloatArrayArray11[arg3 + 1][arg1];
			local125 = local276 + local221 * (local325 - local276);
			local143 = (local342 - local308) * local221 + local308;
			@Pc(385) float local385 = local351 + (this.aFloatArrayArray11[arg3 + 1][arg1 + 1] - local351) * local213;
			local134 = local221 * (local385 - local292) + local292;
		}
		local213 = this.aClass4_Sub24_3.method7145() - local15;
		local221 = this.aClass4_Sub24_3.method7147() - local30;
		local228 = this.aClass4_Sub24_3.method7142() - local23;
		local235 = (float) Math.sqrt((double) (local228 * local228 + local213 * local213 + local221 * local221));
		local242 = 1.0F / local235;
		local221 *= local242;
		local228 *= local242;
		local213 *= local242;
		local251 = local235 / (float) this.aClass4_Sub24_3.method7151();
		local260 = 1.0F - local251 * local251;
		if (local260 < 0.0F) {
			local260 = 0.0F;
		}
		local351 = local228 * local134 + local125 * local221 + local213 * local143;
		if (local351 < 0.0F) {
			local351 = 0.0F;
		}
		@Pc(553) float local553 = local351 * 2.0F * local260;
		if (local553 > 1.0F) {
			local553 = 1.0F;
		}
		@Pc(564) int local564 = this.aClass4_Sub24_3.method7149();
		@Pc(574) int local574 = (int) (local553 * (float) (local564 >> 16 & 0xFF));
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(589) int local589 = (int) (local553 * (float) (local564 >> 8 & 0xFF));
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(602) int local602 = (int) ((float) (local564 & 0xFF) * local553);
		if (local602 > 255) {
			local602 = 255;
		}
		if (Stream.b()) {
			this.aStream4.b((float) local15);
			this.aStream4.b((float) local30);
			this.aStream4.b((float) local23);
		} else {
			this.aStream4.a((float) local15);
			this.aStream4.a((float) local30);
			this.aStream4.a((float) local23);
		}
		if (this.aClass44_Sub2_13.anInt4940 == 0) {
			this.aStream4.d(local602);
			this.aStream4.d(local589);
			this.aStream4.d(local574);
		} else {
			this.aStream4.d(local574);
			this.aStream4.d(local589);
			this.aStream4.d(local602);
		}
		this.aStream4.d(255);
		this.method6487(local77);
	}
}
