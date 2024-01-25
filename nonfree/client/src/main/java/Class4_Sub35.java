import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class4_Sub35 extends Class4 {

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
	private int anInt5841;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!ll;")
	private final Class42_Sub3 aClass42_Sub3_1;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_13;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!kp;")
	private final Class4_Sub29 aClass4_Sub29_3;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	private final int anInt5838;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	private final int anInt5837;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private final int anInt5836;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	private final int anInt5835;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
	private int anInt5842;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Lclient!je;")
	private final Interface16 anInterface16_4;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Lclient!oda;")
	private final Interface19 anInterface19_5;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!dj;")
	private Class66 aClass66_27;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!wg;Lclient!ll;Lclient!kp;[I)V")
	public Class4_Sub35(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Class42_Sub3 arg1, @OriginalArg(2) Class4_Sub29 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass42_Sub3_1 = arg1;
		this.aClass33_Sub2_13 = arg0;
		this.aClass4_Sub29_3 = arg2;
		@Pc(22) int local22 = this.aClass4_Sub29_3.method7632() - (arg1.anInt8631 >> 1);
		this.anInt5838 = this.aClass4_Sub29_3.method7627() - local22 >> arg1.anInt8635;
		this.anInt5837 = this.aClass4_Sub29_3.method7627() + local22 >> arg1.anInt8635;
		this.anInt5836 = this.aClass4_Sub29_3.method7628() - local22 >> arg1.anInt8635;
		this.anInt5835 = local22 + this.aClass4_Sub29_3.method7628() >> arg1.anInt8635;
		@Pc(76) int local76 = this.anInt5837 + 1 - this.anInt5838;
		@Pc(85) int local85 = this.anInt5835 + 1 - this.anInt5836;
		this.aFloatArrayArray15 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray17 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray16 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(175) int local175;
		@Pc(191) int local191;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt5836 + local114;
			if (local121 > 0 && local121 < this.aClass42_Sub3_1.anInt8630 - 1) {
				for (local135 = 0; local135 <= local76; local135++) {
					local142 = this.anInt5838 + local135;
					if (local142 > 0 && this.aClass42_Sub3_1.anInt8638 - 1 > local142) {
						local175 = arg1.method7450(local121, local142 + 1) - arg1.method7450(local121, local142 - 1);
						local191 = arg1.method7450(local121 + 1, local142) - arg1.method7450(local121 - 1, local142);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + local191 * local191 + 65536)));
						this.aFloatArrayArray15[local135][local114] = local206 * (float) local175;
						this.aFloatArrayArray17[local135][local114] = -256.0F * local206;
						this.aFloatArrayArray16[local135][local114] = (float) local191 * local206;
					}
				}
			}
		}
		local121 = 0;
		@Pc(312) int local312;
		for (local135 = this.anInt5836; local135 <= this.anInt5835; local135++) {
			if (local135 >= 0 && local135 < arg1.anInt8630) {
				for (local142 = this.anInt5838; local142 <= this.anInt5837; local142++) {
					if (local142 >= 0 && arg1.anInt8638 > local142) {
						local175 = arg3[local121];
						@Pc(300) int[] local300 = arg1.anIntArrayArrayArray12[local142][local135];
						if (local300 != null && local175 != 0) {
							if (local175 == 1) {
								local312 = 0;
								while (local300.length > local312) {
									if (local300[local312++] != -1 && local300[local312++] != -1 && local300[local312++] != -1) {
										this.anInt5842 += 3;
									}
								}
							} else {
								this.anInt5842 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt5837 - this.anInt5838;
			}
		}
		if (this.anInt5842 <= 0) {
			this.anInterface16_4 = null;
			this.anInterface19_5 = null;
		} else {
			this.aClass66_27 = new Class66(Static162.method2593(this.anInt5842));
			this.anInterface16_4 = this.aClass33_Sub2_13.method8265(false);
			this.anInterface16_4.method8360(this.anInt5842);
			@Pc(406) NativeHeapBuffer local406 = this.aClass33_Sub2_13.method8192(this.anInt5842 * 16, false);
			this.aStream1 = new Stream(local406);
			while (true) {
				@Pc(418) Buffer local418;
				do {
					local418 = this.anInterface16_4.method8364();
				} while (local418 == null);
				this.aStream2 = new Stream(local418);
				local191 = 0;
				local121 = 0;
				for (local312 = this.anInt5836; local312 <= this.anInt5835; local312++) {
					if (local312 >= 0 && local312 < arg1.anInt8630) {
						@Pc(447) int local447 = 0;
						for (@Pc(450) int local450 = this.anInt5838; local450 <= this.anInt5837; local450++) {
							if (local450 >= 0 && arg1.anInt8638 > local450) {
								@Pc(462) int local462 = arg3[local121];
								@Pc(469) int[] local469 = arg1.anIntArrayArrayArray12[local450][local312];
								if (local469 != null && local462 != 0) {
									if (local462 == 1) {
										@Pc(631) int[] local631 = arg1.anIntArrayArrayArray14[local450][local312];
										@Pc(638) int[] local638 = arg1.anIntArrayArrayArray11[local450][local312];
										@Pc(640) int local640 = 0;
										label119: while (true) {
											while (true) {
												if (local640 >= local469.length) {
													break label119;
												}
												if (local469[local640] == -1 || local469[local640 + 1] == -1 || local469[local640 + 2] == -1) {
													local640 += 3;
												} else {
													this.method5125(local312, local447, local191, local631[local640], local450, local638[local640]);
													local640++;
													this.method5125(local312, local447, local191, local631[local640], local450, local638[local640]);
													local640++;
													this.method5125(local312, local447, local191, local631[local640], local450, local638[local640]);
													local640++;
												}
											}
										}
									} else if (local462 == 3) {
										this.method5125(local312, local447, local191, 0, local450, 0);
										this.method5125(local312, local447, local191, arg1.anInt8631, local450, 0);
										this.method5125(local312, local447, local191, 0, local450, arg1.anInt8631);
									} else if (local462 == 2) {
										this.method5125(local312, local447, local191, arg1.anInt8631, local450, 0);
										this.method5125(local312, local447, local191, arg1.anInt8631, local450, arg1.anInt8631);
										this.method5125(local312, local447, local191, 0, local450, 0);
									} else if (local462 == 5) {
										this.method5125(local312, local447, local191, arg1.anInt8631, local450, arg1.anInt8631);
										this.method5125(local312, local447, local191, 0, local450, arg1.anInt8631);
										this.method5125(local312, local447, local191, arg1.anInt8631, local450, 0);
									} else if (local462 == 4) {
										this.method5125(local312, local447, local191, 0, local450, arg1.anInt8631);
										this.method5125(local312, local447, local191, 0, local450, 0);
										this.method5125(local312, local447, local191, arg1.anInt8631, local450, arg1.anInt8631);
									}
								}
							}
							local121++;
							local447++;
						}
					} else {
						local121 += this.anInt5837 - this.anInt5838;
					}
					local191++;
				}
				this.aStream2.c();
				if (this.anInterface16_4.method8363()) {
					this.aStream1.c();
					this.anInterface19_5 = this.aClass33_Sub2_13.method8157(false);
					this.anInterface19_5.method6565(local406, this.anInt5841 * 16, 16);
					break;
				}
				this.aStream1.b(0);
				this.aClass66_27.method1988();
			}
		}
		this.aFloatArrayArray15 = this.aFloatArrayArray17 = this.aFloatArrayArray16 = null;
		this.aStream2 = null;
		this.aClass66_27 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII[[Z)V")
	public void method5122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface16_4 == null || (arg1 + arg2 < this.anInt5838 || (arg2 - arg1 > this.anInt5837 || (this.anInt5836 > arg1 + arg0 || arg0 - arg1 > this.anInt5835)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt5836; local54 <= this.anInt5835; local54++) {
			for (@Pc(59) int local59 = this.anInt5838; local59 <= this.anInt5837; local59++) {
				@Pc(65) int local65 = local59 - arg2;
				@Pc(70) int local70 = local54 - arg0;
				if (-arg1 < local65 && local65 < arg1 && local70 > -arg1 && local70 < arg1 && arg3[arg1 + local65][arg1 + local70]) {
					this.aClass33_Sub2_13.method8244((byte) (int) (this.aClass4_Sub29_3.method7626() * 255.0F));
					this.aClass33_Sub2_13.method8175(this.anInterface19_5, 0);
					this.aClass33_Sub2_13.method8179(this.aClass33_Sub2_13.aClass247_23);
					this.aClass33_Sub2_13.method8279(this.anInterface16_4, this.anInt5841, Static83.aClass194_13, 0, this.anInt5842 / 3, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IS)V")
	private void method5123(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream2.f(arg0);
		} else {
			this.aStream2.d(arg0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)V")
	private void method5125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass42_Sub3_1.anInt8635) + arg3;
		@Pc(23) int local23 = (arg0 << this.aClass42_Sub3_1.anInt8635) + arg5;
		@Pc(30) int local30 = this.aClass42_Sub3_1.method7453(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(64) Class4 local64 = this.aClass66_27.method1994(local7);
			if (local64 != null) {
				this.method5123(((Class4_Sub36) local64).aShort90);
				return;
			}
		}
		@Pc(82) short local82 = (short) this.anInt5841++;
		if (local7 != -1L) {
			this.aClass66_27.method1985(new Class4_Sub36(local82), local7);
		}
		@Pc(148) float local148;
		@Pc(130) float local130;
		@Pc(139) float local139;
		@Pc(183) float local183;
		@Pc(191) float local191;
		@Pc(198) float local198;
		@Pc(205) float local205;
		@Pc(212) float local212;
		@Pc(221) float local221;
		@Pc(230) float local230;
		@Pc(321) float local321;
		if (arg3 == 0 && arg5 == 0) {
			local130 = this.aFloatArrayArray17[arg1][arg2];
			local148 = this.aFloatArrayArray15[arg1][arg2];
			local139 = this.aFloatArrayArray16[arg1][arg2];
		} else if (arg3 == this.aClass42_Sub3_1.anInt8631 && arg5 == 0) {
			local130 = this.aFloatArrayArray17[arg1 + 1][arg2];
			local139 = this.aFloatArrayArray16[arg1 + 1][arg2];
			local148 = this.aFloatArrayArray15[arg1 + 1][arg2];
		} else if (this.aClass42_Sub3_1.anInt8631 == arg3 && arg5 == this.aClass42_Sub3_1.anInt8631) {
			local148 = this.aFloatArrayArray15[arg1 + 1][arg2 + 1];
			local139 = this.aFloatArrayArray16[arg1 + 1][arg2 + 1];
			local130 = this.aFloatArrayArray17[arg1 + 1][arg2 + 1];
		} else if (arg3 == 0 && arg5 == this.aClass42_Sub3_1.anInt8631) {
			local130 = this.aFloatArrayArray17[arg1][arg2 + 1];
			local148 = this.aFloatArrayArray15[arg1][arg2 + 1];
			local139 = this.aFloatArrayArray16[arg1][arg2 + 1];
		} else {
			local183 = (float) arg3 / (float) this.aClass42_Sub3_1.anInt8631;
			local191 = (float) arg5 / (float) this.aClass42_Sub3_1.anInt8631;
			local198 = this.aFloatArrayArray15[arg1][arg2];
			local205 = this.aFloatArrayArray17[arg1][arg2];
			local212 = this.aFloatArrayArray16[arg1][arg2];
			local221 = this.aFloatArrayArray15[arg1 + 1][arg2];
			local230 = this.aFloatArrayArray17[arg1 + 1][arg2];
			@Pc(247) float local247 = local230 + local183 * (this.aFloatArrayArray17[arg1 + 1][arg2 + 1] - local230);
			@Pc(263) float local263 = local205 + (this.aFloatArrayArray17[arg1][arg2 + 1] - local205) * local183;
			@Pc(279) float local279 = local198 + local183 * (this.aFloatArrayArray15[arg1][arg2 + 1] - local198);
			@Pc(294) float local294 = local212 + (this.aFloatArrayArray16[arg1][arg2 + 1] - local212) * local183;
			@Pc(312) float local312 = local221 + local183 * (this.aFloatArrayArray15[arg1 + 1][arg2 + 1] - local221);
			local321 = this.aFloatArrayArray16[arg1 + 1][arg2];
			local148 = local191 * (local312 - local279) + local279;
			@Pc(346) float local346 = local321 + (this.aFloatArrayArray16[arg1 + 1][arg2 + 1] - local321) * local183;
			local130 = local263 + (local247 - local263) * local191;
			local139 = local294 + local191 * (local346 - local294);
		}
		local183 = (float) (this.aClass4_Sub29_3.method7627() - local15);
		local191 = (float) (this.aClass4_Sub29_3.method7630() - local30);
		local198 = (float) (this.aClass4_Sub29_3.method7628() - local23);
		local205 = (float) Math.sqrt((double) (local183 * local183 + local191 * local191 + local198 * local198));
		local212 = 1.0F / local205;
		local183 *= local212;
		local191 *= local212;
		local198 *= local212;
		local221 = local205 / (float) this.aClass4_Sub29_3.method7632();
		local230 = 1.0F - local221 * local221;
		if (local230 < 0.0F) {
			local230 = 0.0F;
		}
		local321 = local139 * local198 + local191 * local130 + local183 * local148;
		if (local321 < 0.0F) {
			local321 = 0.0F;
		}
		@Pc(556) float local556 = local230 * 2.0F * local321;
		if (local556 > 1.0F) {
			local556 = 1.0F;
		}
		@Pc(567) int local567 = this.aClass4_Sub29_3.method7633();
		@Pc(577) int local577 = (int) (local556 * (float) (local567 >> 16 & 0xFF));
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(592) int local592 = (int) (local556 * (float) (local567 >> 8 & 0xFF));
		if (local592 > 255) {
			local592 = 255;
		}
		@Pc(605) int local605 = (int) ((float) (local567 & 0xFF) * local556);
		if (Stream.b()) {
			this.aStream1.a((float) local15);
			this.aStream1.a((float) local30);
			this.aStream1.a((float) local23);
		} else {
			this.aStream1.b((float) local15);
			this.aStream1.b((float) local30);
			this.aStream1.b((float) local23);
		}
		if (local605 > 255) {
			local605 = 255;
		}
		if (this.aClass33_Sub2_13.anInt9650 == 0) {
			this.aStream1.a(local605);
			this.aStream1.a(local592);
			this.aStream1.a(local577);
		} else {
			this.aStream1.a(local577);
			this.aStream1.a(local592);
			this.aStream1.a(local605);
		}
		this.aStream1.a(255);
		this.method5123(local82);
	}
}
