import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
	private int anInt3373;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_9;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!eha;")
	private final Class91_Sub1 aClass91_Sub1_2;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!tj;")
	private final Class3_Sub22 aClass3_Sub22_1;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	private final int anInt3367;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	private final int anInt3378;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	private final int anInt3370;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private final int anInt3369;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	private int anInt3368;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!js;")
	private final Interface12 anInterface12_1;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!rv;")
	private final Interface22 anInterface22_3;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!baa;")
	private Class25 aClass25_18;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!rl;Lclient!eha;Lclient!tj;[I)V")
	public Class3_Sub20(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) Class91_Sub1 arg1, @OriginalArg(2) Class3_Sub22 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass82_Sub3_9 = arg0;
		this.aClass91_Sub1_2 = arg1;
		this.aClass3_Sub22_1 = arg2;
		@Pc(22) int local22 = this.aClass3_Sub22_1.method8382() - (arg1.anInt8986 >> 1);
		this.anInt3367 = this.aClass3_Sub22_1.method8391() - local22 >> arg1.anInt8988;
		this.anInt3378 = this.aClass3_Sub22_1.method8391() + local22 >> arg1.anInt8988;
		this.anInt3370 = this.aClass3_Sub22_1.method8386() - local22 >> arg1.anInt8988;
		this.anInt3369 = local22 + this.aClass3_Sub22_1.method8386() >> arg1.anInt8988;
		@Pc(77) int local77 = this.anInt3378 + 1 - this.anInt3367;
		@Pc(86) int local86 = this.anInt3369 + 1 - this.anInt3370;
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray6 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray5 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(165) int local165;
		@Pc(182) int local182;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt3370 + local115;
			if (local122 > 0 && local122 < this.aClass91_Sub1_2.anInt8985 - 1) {
				for (local133 = 0; local133 <= local77; local133++) {
					local140 = this.anInt3367 + local133;
					if (local140 > 0 && this.aClass91_Sub1_2.anInt8983 - 1 > local140) {
						local165 = arg1.method7724(local122, local140 + 1) - arg1.method7724(local122, local140 - 1);
						local182 = arg1.method7724(local122 + 1, local140) - arg1.method7724(local122 - 1, local140);
						@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local182 * local182 + local165 * local165 + 65536)));
						this.aFloatArrayArray6[local133][local115] = (float) local165 * local197;
						this.aFloatArrayArray5[local133][local115] = -256.0F * local197;
						this.aFloatArrayArray4[local133][local115] = (float) local182 * local197;
					}
				}
			}
		}
		local122 = 0;
		@Pc(312) int local312;
		for (local133 = this.anInt3370; local133 <= this.anInt3369; local133++) {
			if (local133 >= 0 && arg1.anInt8985 > local133) {
				for (local140 = this.anInt3367; local140 <= this.anInt3378; local140++) {
					if (local140 >= 0 && arg1.anInt8983 > local140) {
						local165 = arg3[local122];
						@Pc(298) int[] local298 = arg1.anIntArrayArrayArray12[local140][local133];
						if (local298 != null && local165 != 0) {
							if (local165 == 1) {
								local312 = 0;
								while (local312 < local298.length) {
									if (local298[local312++] != -1 && local298[local312++] != -1 && local298[local312++] != -1) {
										this.anInt3368 += 3;
									}
								}
							} else {
								this.anInt3368 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt3378 - this.anInt3367;
			}
		}
		if (this.anInt3368 <= 0) {
			this.anInterface12_1 = null;
			this.anInterface22_3 = null;
		} else {
			this.aClass25_18 = new Class25(Static533.method1203(this.anInt3368));
			this.anInterface12_1 = this.aClass82_Sub3_9.method4985(false);
			this.anInterface12_1.method7563(this.anInt3368);
			@Pc(421) NativeHeapBuffer local421 = this.aClass82_Sub3_9.method5004(false, this.anInt3368 * 16);
			this.aStream3 = new Stream(local421);
			while (true) {
				@Pc(433) Buffer local433;
				do {
					local433 = this.anInterface12_1.method7573();
				} while (local433 == null);
				this.aStream2 = new Stream(local433);
				local182 = 0;
				local122 = 0;
				for (local312 = this.anInt3370; local312 <= this.anInt3369; local312++) {
					if (local312 >= 0 && arg1.anInt8985 > local312) {
						@Pc(461) int local461 = 0;
						for (@Pc(464) int local464 = this.anInt3367; local464 <= this.anInt3378; local464++) {
							if (local464 >= 0 && local464 < arg1.anInt8983) {
								@Pc(476) int local476 = arg3[local122];
								@Pc(483) int[] local483 = arg1.anIntArrayArrayArray12[local464][local312];
								if (local483 != null && local476 != 0) {
									if (local476 == 1) {
										@Pc(497) int[] local497 = arg1.anIntArrayArrayArray17[local464][local312];
										@Pc(504) int[] local504 = arg1.anIntArrayArrayArray13[local464][local312];
										@Pc(506) int local506 = 0;
										label119: while (true) {
											while (true) {
												if (local506 >= local483.length) {
													break label119;
												}
												if (local483[local506] == -1 || local483[local506 + 1] == -1 || local483[local506 + 2] == -1) {
													local506 += 3;
												} else {
													this.method2896(local182, local464, local504[local506], local312, local461, local497[local506]);
													local506++;
													this.method2896(local182, local464, local504[local506], local312, local461, local497[local506]);
													local506++;
													this.method2896(local182, local464, local504[local506], local312, local461, local497[local506]);
													local506++;
												}
											}
										}
									} else if (local476 == 3) {
										this.method2896(local182, local464, 0, local312, local461, 0);
										this.method2896(local182, local464, 0, local312, local461, arg1.anInt8986);
										this.method2896(local182, local464, arg1.anInt8986, local312, local461, 0);
									} else if (local476 == 2) {
										this.method2896(local182, local464, 0, local312, local461, arg1.anInt8986);
										this.method2896(local182, local464, arg1.anInt8986, local312, local461, arg1.anInt8986);
										this.method2896(local182, local464, 0, local312, local461, 0);
									} else if (local476 == 5) {
										this.method2896(local182, local464, arg1.anInt8986, local312, local461, arg1.anInt8986);
										this.method2896(local182, local464, arg1.anInt8986, local312, local461, 0);
										this.method2896(local182, local464, 0, local312, local461, arg1.anInt8986);
									} else if (local476 == 4) {
										this.method2896(local182, local464, arg1.anInt8986, local312, local461, 0);
										this.method2896(local182, local464, 0, local312, local461, 0);
										this.method2896(local182, local464, arg1.anInt8986, local312, local461, arg1.anInt8986);
									}
								}
							}
							local461++;
							local122++;
						}
					} else {
						local122 += this.anInt3378 - this.anInt3367;
					}
					local182++;
				}
				this.aStream2.b();
				if (this.anInterface12_1.method7574()) {
					this.aStream3.b();
					this.anInterface22_3 = this.aClass82_Sub3_9.method4925(false);
					this.anInterface22_3.method1388(this.anInt3373 * 16, 16, local421);
					break;
				}
				this.aStream3.e(0);
				this.aClass25_18.method433();
			}
		}
		this.aClass25_18 = null;
		this.aStream2 = null;
		this.aStream3 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray5 = this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII[[Z)V")
	public void method2894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface12_1 == null || (this.anInt3367 > arg0 + arg2 || (arg0 - arg2 > this.anInt3378 || (arg1 + arg2 < this.anInt3370 || this.anInt3369 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt3370; local55 <= this.anInt3369; local55++) {
			for (@Pc(60) int local60 = this.anInt3367; local60 <= this.anInt3378; local60++) {
				@Pc(67) int local67 = local60 - arg0;
				@Pc(71) int local71 = local55 - arg1;
				if (-arg2 < local67 && local67 < arg2 && -arg2 < local71 && arg2 > local71 && arg3[arg2 + local67][arg2 + local71]) {
					this.aClass82_Sub3_9.method4951((byte) (int) (this.aClass3_Sub22_1.method8387() * 255.0F));
					this.aClass82_Sub3_9.method4995(0, this.anInterface22_3);
					this.aClass82_Sub3_9.method4960(this.aClass82_Sub3_9.aClass43_17);
					this.aClass82_Sub3_9.method4993(this.anInt3373, this.anInterface12_1, Static525.aClass376_6, this.anInt3368 / 3, 0, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIZII)V")
	private void method2896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = -1L;
		@Pc(20) int local20 = arg5 + (arg1 << this.aClass91_Sub1_2.anInt8988);
		@Pc(28) int local28 = arg2 + (arg3 << this.aClass91_Sub1_2.anInt8988);
		@Pc(35) int local35 = this.aClass91_Sub1_2.method7725(local20, local28);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local11 = (long) local20 & 0xFFFFL | ((long) local28 & 0xFFFFL) << 16;
			@Pc(64) Class3 local64 = this.aClass25_18.method426(local11);
			if (local64 != null) {
				this.method2897(((Class3_Sub8) local64).aShort1);
				return;
			}
		}
		@Pc(82) short local82 = (short) this.anInt3373++;
		if (local11 != -1L) {
			this.aClass25_18.method434(local11, new Class3_Sub8(local82));
		}
		@Pc(112) float local112;
		@Pc(126) float local126;
		@Pc(119) float local119;
		@Pc(230) float local230;
		@Pc(238) float local238;
		@Pc(245) float local245;
		@Pc(252) float local252;
		@Pc(259) float local259;
		@Pc(268) float local268;
		@Pc(277) float local277;
		@Pc(367) float local367;
		if (arg5 == 0 && arg2 == 0) {
			local112 = this.aFloatArrayArray6[arg4][arg0];
			local119 = this.aFloatArrayArray4[arg4][arg0];
			local126 = this.aFloatArrayArray5[arg4][arg0];
		} else if (this.aClass91_Sub1_2.anInt8986 == arg5 && arg2 == 0) {
			local119 = this.aFloatArrayArray4[arg4 + 1][arg0];
			local112 = this.aFloatArrayArray6[arg4 + 1][arg0];
			local126 = this.aFloatArrayArray5[arg4 + 1][arg0];
		} else if (this.aClass91_Sub1_2.anInt8986 == arg5 && arg2 == this.aClass91_Sub1_2.anInt8986) {
			local126 = this.aFloatArrayArray5[arg4 + 1][arg0 + 1];
			local112 = this.aFloatArrayArray6[arg4 + 1][arg0 + 1];
			local119 = this.aFloatArrayArray4[arg4 + 1][arg0 + 1];
		} else if (arg5 == 0 && arg2 == this.aClass91_Sub1_2.anInt8986) {
			local112 = this.aFloatArrayArray6[arg4][arg0 + 1];
			local119 = this.aFloatArrayArray4[arg4][arg0 + 1];
			local126 = this.aFloatArrayArray5[arg4][arg0 + 1];
		} else {
			local230 = (float) arg5 / (float) this.aClass91_Sub1_2.anInt8986;
			local238 = (float) arg2 / (float) this.aClass91_Sub1_2.anInt8986;
			local245 = this.aFloatArrayArray6[arg4][arg0];
			local252 = this.aFloatArrayArray5[arg4][arg0];
			local259 = this.aFloatArrayArray4[arg4][arg0];
			local268 = this.aFloatArrayArray6[arg4 + 1][arg0];
			local277 = this.aFloatArrayArray5[arg4 + 1][arg0];
			@Pc(292) float local292 = local259 + (this.aFloatArrayArray4[arg4][arg0 + 1] - local259) * local230;
			@Pc(308) float local308 = local245 + (this.aFloatArrayArray6[arg4][arg0 + 1] - local245) * local230;
			@Pc(326) float local326 = local268 + local230 * (this.aFloatArrayArray6[arg4 + 1][arg0 + 1] - local268);
			@Pc(343) float local343 = local277 + (this.aFloatArrayArray5[arg4 + 1][arg0 + 1] - local277) * local230;
			@Pc(358) float local358 = local252 + (this.aFloatArrayArray5[arg4][arg0 + 1] - local252) * local230;
			local367 = this.aFloatArrayArray4[arg4 + 1][arg0];
			@Pc(384) float local384 = local367 + (this.aFloatArrayArray4[arg4 + 1][arg0 + 1] - local367) * local230;
			local126 = local358 + local238 * (local343 - local358);
			local112 = local308 + (local326 - local308) * local238;
			local119 = local292 + (local384 - local292) * local238;
		}
		local230 = (float) (this.aClass3_Sub22_1.method8391() - local20);
		local238 = (float) (this.aClass3_Sub22_1.method8383() - local35);
		local245 = (float) (this.aClass3_Sub22_1.method8386() - local28);
		local252 = (float) Math.sqrt((double) (local245 * local245 + local238 * local238 + local230 * local230));
		local259 = 1.0F / local252;
		local230 *= local259;
		local238 *= local259;
		local245 *= local259;
		local268 = local252 / (float) this.aClass3_Sub22_1.method8382();
		local277 = 1.0F - local268 * local268;
		if (local277 < 0.0F) {
			local277 = 0.0F;
		}
		local367 = local119 * local245 + local126 * local238 + local112 * local230;
		if (local367 < 0.0F) {
			local367 = 0.0F;
		}
		@Pc(540) float local540 = local367 * 2.0F * local277;
		if (local540 > 1.0F) {
			local540 = 1.0F;
		}
		@Pc(551) int local551 = this.aClass3_Sub22_1.method8384();
		@Pc(561) int local561 = (int) (local540 * (float) (local551 >> 16 & 0xFF));
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(578) int local578 = (int) (local540 * (float) (local551 >> 8 & 0xFF));
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(593) int local593 = (int) (local540 * (float) (local551 & 0xFF));
		if (local593 > 255) {
			local593 = 255;
		}
		if (Stream.c()) {
			this.aStream3.a((float) local20);
			this.aStream3.a((float) local35);
			this.aStream3.a((float) local28);
		} else {
			this.aStream3.b((float) local20);
			this.aStream3.b((float) local35);
			this.aStream3.b((float) local28);
		}
		if (this.aClass82_Sub3_9.anInt5858 == 0) {
			this.aStream3.b(local593);
			this.aStream3.b(local578);
			this.aStream3.b(local561);
		} else {
			this.aStream3.b(local561);
			this.aStream3.b(local578);
			this.aStream3.b(local593);
		}
		this.aStream3.b(255);
		this.method2897(local82);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(SI)V")
	private void method2897(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream2.c(arg0);
		} else {
			this.aStream2.f(arg0);
		}
	}
}
