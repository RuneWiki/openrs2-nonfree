import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class14_Sub39 extends Class14 {

	@OriginalMember(owner = "client!of", name = "y", descriptor = "I")
	private int anInt7584;

	@OriginalMember(owner = "client!of", name = "F", descriptor = "Lclient!qm;")
	private final Class14_Sub37 aClass14_Sub37_2;

	@OriginalMember(owner = "client!of", name = "E", descriptor = "Lclient!mf;")
	private final Class51_Sub2 aClass51_Sub2_1;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_10;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "I")
	private final int anInt7583;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "I")
	private final int anInt7581;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "I")
	private final int anInt7586;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	private final int anInt7582;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!of", name = "z", descriptor = "I")
	private int anInt7585;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!dk;")
	private final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Lclient!hl;")
	private final Interface10 anInterface10_11;

	@OriginalMember(owner = "client!of", name = "D", descriptor = "Lclient!jo;")
	private Class187 aClass187_53;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!of", name = "A", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!pj;Lclient!mf;Lclient!qm;[I)V")
	public Class14_Sub39(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) Class51_Sub2 arg1, @OriginalArg(2) Class14_Sub37 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass14_Sub37_2 = arg2;
		this.aClass51_Sub2_1 = arg1;
		this.aClass137_Sub1_10 = arg0;
		@Pc(22) int local22 = this.aClass14_Sub37_2.method7819() - (arg1.anInt9506 >> 1);
		this.anInt7583 = this.aClass14_Sub37_2.method7827() - local22 >> arg1.anInt9507;
		this.anInt7581 = this.aClass14_Sub37_2.method7827() + local22 >> arg1.anInt9507;
		this.anInt7586 = this.aClass14_Sub37_2.method7826() - local22 >> arg1.anInt9507;
		this.anInt7582 = this.aClass14_Sub37_2.method7826() + local22 >> arg1.anInt9507;
		@Pc(77) int local77 = this.anInt7581 + 1 - this.anInt7583;
		@Pc(86) int local86 = this.anInt7582 + 1 - this.anInt7586;
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray10 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(167) int local167;
		@Pc(184) int local184;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt7586 + local115;
			if (local122 > 0 && this.aClass51_Sub2_1.anInt9512 - 1 > local122) {
				for (local133 = 0; local133 <= local77; local133++) {
					local141 = local133 + this.anInt7583;
					if (local141 > 0 && local141 < this.aClass51_Sub2_1.anInt9511 - 1) {
						local167 = arg1.method7857(local122, local141 + 1) - arg1.method7857(local122, local141 - 1);
						local184 = arg1.method7857(local122 + 1, local141) - arg1.method7857(local122 - 1, local141);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + local167 * local167 + 65536)));
						this.aFloatArrayArray9[local133][local115] = local199 * (float) local167;
						this.aFloatArrayArray10[local133][local115] = -256.0F * local199;
						this.aFloatArrayArray11[local133][local115] = local199 * (float) local184;
					}
				}
			}
		}
		local122 = 0;
		@Pc(303) int local303;
		for (local133 = this.anInt7586; local133 <= this.anInt7582; local133++) {
			if (local133 >= 0 && arg1.anInt9512 > local133) {
				for (local141 = this.anInt7583; local141 <= this.anInt7581; local141++) {
					if (local141 >= 0 && arg1.anInt9511 > local141) {
						local167 = arg3[local122];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray5[local141][local133];
						if (local286 != null && local167 != 0) {
							if (local167 == 1) {
								local303 = 0;
								while (local286.length > local303) {
									if (local286[local303++] != -1 && local286[local303++] != -1 && local286[local303++] != -1) {
										this.anInt7585 += 3;
									}
								}
							} else {
								this.anInt7585 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt7581 - this.anInt7583;
			}
		}
		if (this.anInt7585 <= 0) {
			this.anInterface4_4 = null;
			this.anInterface10_11 = null;
		} else {
			this.aClass187_53 = new Class187(Static330.method5181(this.anInt7585));
			this.anInterface4_4 = this.aClass137_Sub1_10.method8073(false);
			this.anInterface4_4.method5678(this.anInt7585);
			@Pc(410) NativeHeapBuffer local410 = this.aClass137_Sub1_10.method8043(false, this.anInt7585 * 16);
			this.aStream4 = new Stream(local410);
			while (true) {
				@Pc(422) Buffer local422;
				do {
					local422 = this.anInterface4_4.method5680();
				} while (local422 == null);
				this.aStream5 = new Stream(local422);
				local122 = 0;
				local184 = 0;
				for (local303 = this.anInt7586; local303 <= this.anInt7582; local303++) {
					if (local303 >= 0 && local303 < arg1.anInt9512) {
						@Pc(447) int local447 = 0;
						for (@Pc(450) int local450 = this.anInt7583; local450 <= this.anInt7581; local450++) {
							if (local450 >= 0 && arg1.anInt9511 > local450) {
								@Pc(469) int local469 = arg3[local122];
								@Pc(476) int[] local476 = arg1.anIntArrayArrayArray5[local450][local303];
								if (local476 != null && local469 != 0) {
									if (local469 == 1) {
										@Pc(638) int[] local638 = arg1.anIntArrayArrayArray8[local450][local303];
										@Pc(645) int[] local645 = arg1.anIntArrayArrayArray9[local450][local303];
										@Pc(647) int local647 = 0;
										label118: while (true) {
											while (true) {
												if (local476.length <= local647) {
													break label118;
												}
												if (local476[local647] == -1 || local476[local647 + 1] == -1 || local476[local647 + 2] == -1) {
													local647 += 3;
												} else {
													this.method6236(local303, local184, local447, local450, local638[local647], local645[local647]);
													local647++;
													this.method6236(local303, local184, local447, local450, local638[local647], local645[local647]);
													local647++;
													this.method6236(local303, local184, local447, local450, local638[local647], local645[local647]);
													local647++;
												}
											}
										}
									} else if (local469 == 3) {
										this.method6236(local303, local184, local447, local450, 0, 0);
										this.method6236(local303, local184, local447, local450, arg1.anInt9506, 0);
										this.method6236(local303, local184, local447, local450, 0, arg1.anInt9506);
									} else if (local469 == 2) {
										this.method6236(local303, local184, local447, local450, arg1.anInt9506, 0);
										this.method6236(local303, local184, local447, local450, arg1.anInt9506, arg1.anInt9506);
										this.method6236(local303, local184, local447, local450, 0, 0);
									} else if (local469 == 5) {
										this.method6236(local303, local184, local447, local450, arg1.anInt9506, arg1.anInt9506);
										this.method6236(local303, local184, local447, local450, 0, arg1.anInt9506);
										this.method6236(local303, local184, local447, local450, arg1.anInt9506, 0);
									} else if (local469 == 4) {
										this.method6236(local303, local184, local447, local450, 0, arg1.anInt9506);
										this.method6236(local303, local184, local447, local450, 0, 0);
										this.method6236(local303, local184, local447, local450, arg1.anInt9506, arg1.anInt9506);
									}
								}
							}
							local447++;
							local122++;
						}
					} else {
						local122 += this.anInt7581 - this.anInt7583;
					}
					local184++;
				}
				this.aStream5.b();
				if (this.anInterface4_4.method5682()) {
					this.aStream4.b();
					this.anInterface10_11 = this.aClass137_Sub1_10.method7963(false);
					this.anInterface10_11.method3993(16, local410, this.anInt7584 * 16);
					break;
				}
				this.aStream4.b(0);
				this.aClass187_53.method4076();
			}
		}
		this.aClass187_53 = null;
		this.aStream4 = null;
		this.aStream5 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray10 = this.aFloatArrayArray11 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([[ZIIIB)V")
	public void method6231(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface4_4 == null || (this.anInt7583 > arg3 + arg2 || (arg3 - arg2 > this.anInt7581 || (this.anInt7586 > arg2 + arg1 || arg1 - arg2 > this.anInt7582)))) {
			return;
		}
		for (@Pc(52) int local52 = this.anInt7586; local52 <= this.anInt7582; local52++) {
			for (@Pc(57) int local57 = this.anInt7583; local57 <= this.anInt7581; local57++) {
				@Pc(64) int local64 = local57 - arg3;
				@Pc(69) int local69 = local52 - arg1;
				if (local64 > -arg2 && arg2 > local64 && local69 > -arg2 && arg2 > local69 && arg0[local64 + arg2][arg2 + local69]) {
					this.aClass137_Sub1_10.method8042((byte) (int) (this.aClass14_Sub37_2.method7825() * 255.0F));
					this.aClass137_Sub1_10.method8067(0, this.anInterface10_11);
					this.aClass137_Sub1_10.method8000(this.aClass137_Sub1_10.aClass201_19);
					this.aClass137_Sub1_10.method7980(this.anInt7585 / 3, this.anInterface4_4, 0, 0, this.anInt7584, Static620.aClass54_6);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBIIII)V")
	private void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass51_Sub2_1.anInt9507) + arg4;
		@Pc(23) int local23 = (arg0 << this.aClass51_Sub2_1.anInt9507) + arg5;
		@Pc(30) int local30 = this.aClass51_Sub2_1.method7866(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(61) Class14 local61 = this.aClass187_53.method4078(local7);
			if (local61 != null) {
				this.method6237(((Class14_Sub49) local61).aShort95);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt7584++;
		if (local7 != -1L) {
			this.aClass187_53.method4077(local7, new Class14_Sub49(local79));
		}
		@Pc(105) float local105;
		@Pc(112) float local112;
		@Pc(119) float local119;
		@Pc(227) float local227;
		@Pc(235) float local235;
		@Pc(242) float local242;
		@Pc(249) float local249;
		@Pc(256) float local256;
		@Pc(265) float local265;
		@Pc(274) float local274;
		@Pc(351) float local351;
		if (arg4 == 0 && arg5 == 0) {
			local105 = this.aFloatArrayArray9[arg2][arg1];
			local112 = this.aFloatArrayArray10[arg2][arg1];
			local119 = this.aFloatArrayArray11[arg2][arg1];
		} else if (arg4 == this.aClass51_Sub2_1.anInt9506 && arg5 == 0) {
			local105 = this.aFloatArrayArray9[arg2 + 1][arg1];
			local112 = this.aFloatArrayArray10[arg2 + 1][arg1];
			local119 = this.aFloatArrayArray11[arg2 + 1][arg1];
		} else if (this.aClass51_Sub2_1.anInt9506 == arg4 && arg5 == this.aClass51_Sub2_1.anInt9506) {
			local105 = this.aFloatArrayArray9[arg2 + 1][arg1 + 1];
			local119 = this.aFloatArrayArray11[arg2 + 1][arg1 + 1];
			local112 = this.aFloatArrayArray10[arg2 + 1][arg1 + 1];
		} else if (arg4 == 0 && this.aClass51_Sub2_1.anInt9506 == arg5) {
			local119 = this.aFloatArrayArray11[arg2][arg1 + 1];
			local112 = this.aFloatArrayArray10[arg2][arg1 + 1];
			local105 = this.aFloatArrayArray9[arg2][arg1 + 1];
		} else {
			local227 = (float) arg4 / (float) this.aClass51_Sub2_1.anInt9506;
			local235 = (float) arg5 / (float) this.aClass51_Sub2_1.anInt9506;
			local242 = this.aFloatArrayArray9[arg2][arg1];
			local249 = this.aFloatArrayArray10[arg2][arg1];
			local256 = this.aFloatArrayArray11[arg2][arg1];
			local265 = this.aFloatArrayArray9[arg2 + 1][arg1];
			local274 = this.aFloatArrayArray10[arg2 + 1][arg1];
			@Pc(290) float local290 = local242 + (this.aFloatArrayArray9[arg2][arg1 + 1] - local242) * local227;
			@Pc(308) float local308 = local265 + (this.aFloatArrayArray9[arg2 + 1][arg1 + 1] - local265) * local227;
			@Pc(324) float local324 = local249 + (this.aFloatArrayArray10[arg2][arg1 + 1] - local249) * local227;
			@Pc(342) float local342 = local274 + local227 * (this.aFloatArrayArray10[arg2 + 1][arg1 + 1] - local274);
			local351 = this.aFloatArrayArray11[arg2 + 1][arg1];
			@Pc(367) float local367 = local256 + local227 * (this.aFloatArrayArray11[arg2][arg1 + 1] - local256);
			@Pc(384) float local384 = local351 + local227 * (this.aFloatArrayArray11[arg2 + 1][arg1 + 1] - local351);
			local112 = local324 + local235 * (local342 - local324);
			local105 = local290 + (local308 - local290) * local235;
			local119 = local367 + local235 * (local384 - local367);
		}
		local227 = (float) (this.aClass14_Sub37_2.method7827() - local15);
		local235 = (float) (this.aClass14_Sub37_2.method7823() - local30);
		local242 = (float) (this.aClass14_Sub37_2.method7826() - local23);
		local249 = (float) Math.sqrt((double) (local242 * local242 + local227 * local227 + local235 * local235));
		local256 = 1.0F / local249;
		local235 *= local256;
		local227 *= local256;
		local242 *= local256;
		local265 = local249 / (float) this.aClass14_Sub37_2.method7819();
		local274 = 1.0F - local265 * local265;
		if (local274 < 0.0F) {
			local274 = 0.0F;
		}
		local351 = local242 * local119 + local235 * local112 + local105 * local227;
		if (local351 < 0.0F) {
			local351 = 0.0F;
		}
		@Pc(553) float local553 = local351 * local274 * 2.0F;
		if (local553 > 1.0F) {
			local553 = 1.0F;
		}
		@Pc(564) int local564 = this.aClass14_Sub37_2.method7820();
		@Pc(574) int local574 = (int) ((float) (local564 >> 16 & 0xFF) * local553);
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(591) int local591 = (int) ((float) (local564 >> 8 & 0xFF) * local553);
		if (local591 > 255) {
			local591 = 255;
		}
		@Pc(604) int local604 = (int) ((float) (local564 & 0xFF) * local553);
		if (local604 > 255) {
			local604 = 255;
		}
		if (Stream.c()) {
			this.aStream4.b((float) local15);
			this.aStream4.b((float) local30);
			this.aStream4.b((float) local23);
		} else {
			this.aStream4.a((float) local15);
			this.aStream4.a((float) local30);
			this.aStream4.a((float) local23);
		}
		if (this.aClass137_Sub1_10.anInt9724 == 0) {
			this.aStream4.f(local604);
			this.aStream4.f(local591);
			this.aStream4.f(local574);
		} else {
			this.aStream4.f(local574);
			this.aStream4.f(local591);
			this.aStream4.f(local604);
		}
		this.aStream4.f(255);
		this.method6237(local79);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BS)V")
	private void method6237(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream5.a(arg0);
		} else {
			this.aStream5.e(arg0);
		}
	}
}
