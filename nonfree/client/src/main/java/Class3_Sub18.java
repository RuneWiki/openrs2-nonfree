import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
	private int anInt3043;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "Lclient!up;")
	private final Class274_Sub3 aClass274_Sub3_1;

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_5;

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "Lclient!pk;")
	private final Class3_Sub27 aClass3_Sub27_1;

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
	private final int anInt3038;

	@OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
	private final int anInt3036;

	@OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
	private final int anInt3045;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "I")
	private final int anInt3037;

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
	private int anInt3040;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "Lclient!u;")
	private final Interface26 anInterface26_11;

	@OriginalMember(owner = "client!efa", name = "v", descriptor = "Lclient!ru;")
	private final Interface23 anInterface23_4;

	@OriginalMember(owner = "client!efa", name = "z", descriptor = "Lclient!sga;")
	private Class307 aClass307_17;

	@OriginalMember(owner = "client!efa", name = "E", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!efa", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!bm;Lclient!up;Lclient!pk;[I)V")
	public Class3_Sub18(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class274_Sub3 arg1, @OriginalArg(2) Class3_Sub27 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass274_Sub3_1 = arg1;
		this.aClass33_Sub1_5 = arg0;
		this.aClass3_Sub27_1 = arg2;
		@Pc(22) int local22 = this.aClass3_Sub27_1.method5624() - (arg1.anInt9722 >> 1);
		this.anInt3038 = this.aClass3_Sub27_1.method5627() - local22 >> arg1.anInt9727;
		this.anInt3036 = local22 + this.aClass3_Sub27_1.method5627() >> arg1.anInt9727;
		this.anInt3045 = this.aClass3_Sub27_1.method5630() - local22 >> arg1.anInt9727;
		this.anInt3037 = this.aClass3_Sub27_1.method5630() + local22 >> arg1.anInt9727;
		@Pc(77) int local77 = this.anInt3036 + 1 - this.anInt3038;
		@Pc(86) int local86 = this.anInt3037 + 1 - this.anInt3045;
		this.aFloatArrayArray2 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(169) int local169;
		@Pc(185) int local185;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt3045;
			if (local122 > 0 && this.aClass274_Sub3_1.anInt9723 - 1 > local122) {
				for (local133 = 0; local133 <= local77; local133++) {
					local140 = local133 + this.anInt3038;
					if (local140 > 0 && this.aClass274_Sub3_1.anInt9726 - 1 > local140) {
						local169 = arg1.method8041(local140 + 1, local122) - arg1.method8041(local140 - 1, local122);
						local185 = arg1.method8041(local140, local122 + 1) - arg1.method8041(local140, local122 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local169 * local169 + 65536)));
						this.aFloatArrayArray3[local133][local115] = local200 * (float) local169;
						this.aFloatArrayArray2[local133][local115] = local200 * -256.0F;
						this.aFloatArrayArray4[local133][local115] = (float) local185 * local200;
					}
				}
			}
		}
		local122 = 0;
		@Pc(303) int local303;
		for (local133 = this.anInt3045; local133 <= this.anInt3037; local133++) {
			if (local133 >= 0 && arg1.anInt9723 > local133) {
				for (local140 = this.anInt3038; local140 <= this.anInt3036; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt9726) {
						local169 = arg3[local122];
						@Pc(284) int[] local284 = arg1.anIntArrayArrayArray18[local140][local133];
						if (local284 != null && local169 != 0) {
							if (local169 == 1) {
								local303 = 0;
								while (local284.length > local303) {
									if (local284[local303++] != -1 && local284[local303++] != -1 && local284[local303++] != -1) {
										this.anInt3040 += 3;
									}
								}
							} else {
								this.anInt3040 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt3036 - this.anInt3038;
			}
		}
		if (this.anInt3040 <= 0) {
			this.anInterface26_11 = null;
			this.anInterface23_4 = null;
		} else {
			this.aClass307_17 = new Class307(Static95.method2482(this.anInt3040));
			this.anInterface23_4 = this.aClass33_Sub1_5.method1998(false);
			this.anInterface23_4.method7624(this.anInt3040);
			@Pc(407) NativeHeapBuffer local407 = this.aClass33_Sub1_5.method2036(this.anInt3040 * 16, false);
			this.aStream5 = new Stream(local407);
			while (true) {
				@Pc(419) Buffer local419;
				do {
					local419 = this.anInterface23_4.method4807();
				} while (local419 == null);
				this.aStream4 = new Stream(local419);
				local185 = 0;
				local122 = 0;
				for (local303 = this.anInt3045; local303 <= this.anInt3037; local303++) {
					if (local303 >= 0 && arg1.anInt9723 > local303) {
						@Pc(451) int local451 = 0;
						for (@Pc(454) int local454 = this.anInt3038; local454 <= this.anInt3036; local454++) {
							if (local454 >= 0 && arg1.anInt9726 > local454) {
								@Pc(469) int local469 = arg3[local122];
								@Pc(476) int[] local476 = arg1.anIntArrayArrayArray18[local454][local303];
								if (local476 != null && local469 != 0) {
									if (local469 == 1) {
										@Pc(492) int[] local492 = arg1.anIntArrayArrayArray17[local454][local303];
										@Pc(499) int[] local499 = arg1.anIntArrayArrayArray15[local454][local303];
										@Pc(501) int local501 = 0;
										label120: while (true) {
											while (true) {
												if (local501 >= local476.length) {
													break label120;
												}
												if (local476[local501] == -1 || local476[local501 + 1] == -1 || local476[local501 + 2] == -1) {
													local501 += 3;
												} else {
													this.method2799(local185, local499[local501], local454, local451, local492[local501], local303);
													local501++;
													this.method2799(local185, local499[local501], local454, local451, local492[local501], local303);
													local501++;
													this.method2799(local185, local499[local501], local454, local451, local492[local501], local303);
													local501++;
												}
											}
										}
									} else if (local469 == 3) {
										this.method2799(local185, 0, local454, local451, 0, local303);
										this.method2799(local185, 0, local454, local451, arg1.anInt9722, local303);
										this.method2799(local185, arg1.anInt9722, local454, local451, 0, local303);
									} else if (local469 == 2) {
										this.method2799(local185, 0, local454, local451, arg1.anInt9722, local303);
										this.method2799(local185, arg1.anInt9722, local454, local451, arg1.anInt9722, local303);
										this.method2799(local185, 0, local454, local451, 0, local303);
									} else if (local469 == 5) {
										this.method2799(local185, arg1.anInt9722, local454, local451, arg1.anInt9722, local303);
										this.method2799(local185, arg1.anInt9722, local454, local451, 0, local303);
										this.method2799(local185, 0, local454, local451, arg1.anInt9722, local303);
									} else if (local469 == 4) {
										this.method2799(local185, arg1.anInt9722, local454, local451, 0, local303);
										this.method2799(local185, 0, local454, local451, 0, local303);
										this.method2799(local185, arg1.anInt9722, local454, local451, arg1.anInt9722, local303);
									}
								}
							}
							local122++;
							local451++;
						}
					} else {
						local122 += this.anInt3036 - this.anInt3038;
					}
					local185++;
				}
				this.aStream4.a();
				if (this.anInterface23_4.method4806()) {
					this.aStream5.a();
					this.anInterface26_11 = this.aClass33_Sub1_5.method2008(false);
					this.anInterface26_11.method7634(this.anInt3043 * 16, 16, local407);
					break;
				}
				this.aStream5.f(0);
				this.aClass307_17.method7427();
			}
		}
		this.aStream4 = null;
		this.aStream5 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray4 = null;
		this.aClass307_17 = null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BII[[ZI)V")
	public void method2797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface23_4 == null || (this.anInt3038 > arg1 + arg3 || (arg1 - arg3 > this.anInt3036 || (this.anInt3045 > arg0 + arg3 || arg0 - arg3 > this.anInt3037)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt3045; local55 <= this.anInt3037; local55++) {
			for (@Pc(60) int local60 = this.anInt3038; local60 <= this.anInt3036; local60++) {
				@Pc(67) int local67 = local60 - arg1;
				@Pc(72) int local72 = local55 - arg0;
				if (local67 > -arg3 && local67 < arg3 && -arg3 < local72 && local72 < arg3 && arg2[arg3 + local67][arg3 + local72]) {
					this.aClass33_Sub1_5.method2086((byte) (this.aClass3_Sub27_1.method5631() * 255.0F));
					this.aClass33_Sub1_5.method2046(this.anInterface26_11, 0);
					this.aClass33_Sub1_5.method2003(this.aClass33_Sub1_5.aClass34_16);
					this.aClass33_Sub1_5.method2091(0, Static338.aClass304_5, 0, this.anInt3040 / 3, this.anInterface23_4, this.anInt3043);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIII)V")
	private void method2799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass274_Sub3_1.anInt9727) + arg4;
		@Pc(24) int local24 = arg1 + (arg5 << this.aClass274_Sub3_1.anInt9727);
		@Pc(31) int local31 = this.aClass274_Sub3_1.method8043(local24, local15);
		if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(60) Class3 local60 = this.aClass307_17.method7424(local7);
			if (local60 != null) {
				this.method2800(((Class3_Sub43) local60).aShort110);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt3043++;
		if (local7 != -1L) {
			this.aClass307_17.method7425(local7, new Class3_Sub43(local80));
		}
		@Pc(141) float local141;
		@Pc(163) float local163;
		@Pc(152) float local152;
		@Pc(184) float local184;
		@Pc(192) float local192;
		@Pc(199) float local199;
		@Pc(206) float local206;
		@Pc(213) float local213;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(305) float local305;
		if (arg4 == 0 && arg1 == 0) {
			local152 = this.aFloatArrayArray4[arg3][arg0];
			local141 = this.aFloatArrayArray3[arg3][arg0];
			local163 = this.aFloatArrayArray2[arg3][arg0];
		} else if (this.aClass274_Sub3_1.anInt9722 == arg4 && arg1 == 0) {
			local141 = this.aFloatArrayArray3[arg3 + 1][arg0];
			local163 = this.aFloatArrayArray2[arg3 + 1][arg0];
			local152 = this.aFloatArrayArray4[arg3 + 1][arg0];
		} else if (this.aClass274_Sub3_1.anInt9722 == arg4 && this.aClass274_Sub3_1.anInt9722 == arg1) {
			local141 = this.aFloatArrayArray3[arg3 + 1][arg0 + 1];
			local152 = this.aFloatArrayArray4[arg3 + 1][arg0 + 1];
			local163 = this.aFloatArrayArray2[arg3 + 1][arg0 + 1];
		} else if (arg4 == 0 && this.aClass274_Sub3_1.anInt9722 == arg1) {
			local141 = this.aFloatArrayArray3[arg3][arg0 + 1];
			local163 = this.aFloatArrayArray2[arg3][arg0 + 1];
			local152 = this.aFloatArrayArray4[arg3][arg0 + 1];
		} else {
			local184 = (float) arg4 / (float) this.aClass274_Sub3_1.anInt9722;
			local192 = (float) arg1 / (float) this.aClass274_Sub3_1.anInt9722;
			local199 = this.aFloatArrayArray3[arg3][arg0];
			local206 = this.aFloatArrayArray2[arg3][arg0];
			local213 = this.aFloatArrayArray4[arg3][arg0];
			local222 = this.aFloatArrayArray3[arg3 + 1][arg0];
			local231 = this.aFloatArrayArray2[arg3 + 1][arg0];
			@Pc(249) float local249 = local222 + (this.aFloatArrayArray3[arg3 + 1][arg0 + 1] - local222) * local184;
			@Pc(265) float local265 = local199 + local184 * (this.aFloatArrayArray3[arg3][arg0 + 1] - local199);
			@Pc(280) float local280 = local206 + (this.aFloatArrayArray2[arg3][arg0 + 1] - local206) * local184;
			@Pc(296) float local296 = local213 + local184 * (this.aFloatArrayArray4[arg3][arg0 + 1] - local213);
			local305 = this.aFloatArrayArray4[arg3 + 1][arg0];
			@Pc(323) float local323 = local231 + local184 * (this.aFloatArrayArray2[arg3 + 1][arg0 + 1] - local231);
			local141 = (local249 - local265) * local192 + local265;
			local163 = (local323 - local280) * local192 + local280;
			@Pc(358) float local358 = local305 + (this.aFloatArrayArray4[arg3 + 1][arg0 + 1] - local305) * local184;
			local152 = local192 * (local358 - local296) + local296;
		}
		local184 = this.aClass3_Sub27_1.method5627() - local15;
		local192 = this.aClass3_Sub27_1.method5628() - local31;
		local199 = this.aClass3_Sub27_1.method5630() - local24;
		local206 = (float) Math.sqrt((double) (local192 * local192 + local184 * local184 + local199 * local199));
		local213 = 1.0F / local206;
		local199 *= local213;
		local184 *= local213;
		local192 *= local213;
		local222 = local206 / (float) this.aClass3_Sub27_1.method5624();
		local231 = 1.0F - local222 * local222;
		if (local231 < 0.0F) {
			local231 = 0.0F;
		}
		local305 = local192 * local163 + local141 * local184 + local152 * local199;
		if ((float) 0 > local305) {
			local305 = 0.0F;
		}
		@Pc(551) float local551 = local231 * local305 * 2.0F;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass3_Sub27_1.method5626();
		@Pc(572) int local572 = (int) ((float) (local562 >> 16 & 0xFF) * local551);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(589) int local589 = (int) (local551 * (float) (local562 >> 8 & 0xFF));
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(602) int local602 = (int) (local551 * (float) (local562 & 0xFF));
		if (local602 > 255) {
			local602 = 255;
		}
		if (Stream.b()) {
			this.aStream5.a((float) local15);
			this.aStream5.a((float) local31);
			this.aStream5.a((float) local24);
		} else {
			this.aStream5.b((float) local15);
			this.aStream5.b((float) local31);
			this.aStream5.b((float) local24);
		}
		if (this.aClass33_Sub1_5.anInt2178 == 0) {
			this.aStream5.c(local602);
			this.aStream5.c(local589);
			this.aStream5.c(local572);
		} else {
			this.aStream5.c(local572);
			this.aStream5.c(local589);
			this.aStream5.c(local602);
		}
		this.aStream5.c(255);
		this.method2800(local80);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IS)V")
	private void method2800(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream4.e(arg0);
		} else {
			this.aStream4.a(arg0);
		}
	}
}
