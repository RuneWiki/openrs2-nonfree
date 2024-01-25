import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class5_Sub39 extends Class5 {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	private int anInt6733;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_13;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!jw;")
	private final Class5_Sub3 aClass5_Sub3_2;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "Lclient!mg;")
	private final Class88_Sub2 aClass88_Sub2_3;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	private final int anInt6730;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
	private final int anInt6738;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	private final int anInt6734;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	private final int anInt6736;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
	private int anInt6731;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!fka;")
	private final Interface6 anInterface6_14;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "Lclient!mq;")
	private final Interface16 anInterface16_5;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!tga;")
	private Class335 aClass335_34;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!wk;Lclient!mg;Lclient!jw;[I)V")
	public Class5_Sub39(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class5_Sub3 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass143_Sub1_13 = arg0;
		this.aClass5_Sub3_2 = arg2;
		this.aClass88_Sub2_3 = arg1;
		@Pc(23) int local23 = this.aClass5_Sub3_2.method8319() - (arg1.anInt10540 >> 1);
		this.anInt6730 = this.aClass5_Sub3_2.method8317() - local23 >> arg1.anInt10547;
		this.anInt6738 = this.aClass5_Sub3_2.method8317() + local23 >> arg1.anInt10547;
		this.anInt6734 = this.aClass5_Sub3_2.method8323() - local23 >> arg1.anInt10547;
		this.anInt6736 = local23 + this.aClass5_Sub3_2.method8323() >> arg1.anInt10547;
		@Pc(79) int local79 = this.anInt6738 + 1 - this.anInt6730;
		@Pc(88) int local88 = this.anInt6736 + 1 - this.anInt6734;
		this.aFloatArrayArray10 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray11 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray12 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(176) int local176;
		@Pc(192) int local192;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = local117 + this.anInt6734;
			if (local124 > 0 && local124 < this.aClass88_Sub2_3.anInt10545 - 1) {
				for (local138 = 0; local138 <= local79; local138++) {
					local146 = local138 + this.anInt6730;
					if (local146 > 0 && this.aClass88_Sub2_3.anInt10541 - 1 > local146) {
						local176 = arg1.method8749(local146 + 1, local124) - arg1.method8749(local146 - 1, local124);
						local192 = arg1.method8749(local146, local124 + 1) - arg1.method8749(local146, local124 - 1);
						@Pc(207) float local207 = (float) (1.0D / Math.sqrt((double) (local192 * local192 + local176 * local176 + 65536)));
						this.aFloatArrayArray12[local138][local117] = (float) local176 * local207;
						this.aFloatArrayArray10[local138][local117] = -256.0F * local207;
						this.aFloatArrayArray11[local138][local117] = (float) local192 * local207;
					}
				}
			}
		}
		local124 = 0;
		@Pc(316) int local316;
		for (local138 = this.anInt6734; local138 <= this.anInt6736; local138++) {
			if (local138 >= 0 && arg1.anInt10545 > local138) {
				for (local146 = this.anInt6730; local146 <= this.anInt6738; local146++) {
					if (local146 >= 0 && arg1.anInt10541 > local146) {
						local176 = arg3[local124];
						@Pc(297) int[] local297 = arg1.anIntArrayArrayArray9[local146][local138];
						if (local297 != null && local176 != 0) {
							if (local176 == 1) {
								local316 = 0;
								while (local316 < local297.length) {
									if (local297[local316++] != -1 && local297[local316++] != -1 && local297[local316++] != -1) {
										this.anInt6731 += 3;
									}
								}
							} else {
								this.anInt6731 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt6738 - this.anInt6730;
			}
		}
		if (this.anInt6731 <= 0) {
			this.anInterface6_14 = null;
			this.anInterface16_5 = null;
		} else {
			this.aClass335_34 = new Class335(Static209.method2991(this.anInt6731));
			this.anInterface16_5 = this.aClass143_Sub1_13.method6279(false);
			this.anInterface16_5.method7863(this.anInt6731);
			@Pc(420) NativeHeapBuffer local420 = this.aClass143_Sub1_13.method6343(false, this.anInt6731 * 16);
			this.aStream5 = new Stream(local420);
			while (true) {
				@Pc(432) Buffer local432;
				do {
					local432 = this.anInterface16_5.method7864();
				} while (local432 == null);
				this.aStream6 = new Stream(local432);
				local124 = 0;
				local192 = 0;
				for (local316 = this.anInt6734; local316 <= this.anInt6736; local316++) {
					if (local316 >= 0 && arg1.anInt10545 > local316) {
						@Pc(474) int local474 = 0;
						for (@Pc(477) int local477 = this.anInt6730; local477 <= this.anInt6738; local477++) {
							if (local477 >= 0 && arg1.anInt10541 > local477) {
								@Pc(492) int local492 = arg3[local124];
								@Pc(499) int[] local499 = arg1.anIntArrayArrayArray9[local477][local316];
								if (local499 != null && local492 != 0) {
									if (local492 == 1) {
										@Pc(515) int[] local515 = arg1.anIntArrayArrayArray10[local477][local316];
										@Pc(522) int[] local522 = arg1.anIntArrayArrayArray11[local477][local316];
										@Pc(524) int local524 = 0;
										label118: while (true) {
											while (true) {
												if (local499.length <= local524) {
													break label118;
												}
												if (local499[local524] == -1 || local499[local524 + 1] == -1 || local499[local524 + 2] == -1) {
													local524 += 3;
												} else {
													this.method5677(local316, local192, local515[local524], local522[local524], local477, local474);
													local524++;
													this.method5677(local316, local192, local515[local524], local522[local524], local477, local474);
													local524++;
													this.method5677(local316, local192, local515[local524], local522[local524], local477, local474);
													local524++;
												}
											}
										}
									} else if (local492 == 3) {
										this.method5677(local316, local192, 0, 0, local477, local474);
										this.method5677(local316, local192, arg1.anInt10540, 0, local477, local474);
										this.method5677(local316, local192, 0, arg1.anInt10540, local477, local474);
									} else if (local492 == 2) {
										this.method5677(local316, local192, arg1.anInt10540, 0, local477, local474);
										this.method5677(local316, local192, arg1.anInt10540, arg1.anInt10540, local477, local474);
										this.method5677(local316, local192, 0, 0, local477, local474);
									} else if (local492 == 5) {
										this.method5677(local316, local192, arg1.anInt10540, arg1.anInt10540, local477, local474);
										this.method5677(local316, local192, 0, arg1.anInt10540, local477, local474);
										this.method5677(local316, local192, arg1.anInt10540, 0, local477, local474);
									} else if (local492 == 4) {
										this.method5677(local316, local192, 0, arg1.anInt10540, local477, local474);
										this.method5677(local316, local192, 0, 0, local477, local474);
										this.method5677(local316, local192, arg1.anInt10540, arg1.anInt10540, local477, local474);
									}
								}
							}
							local124++;
							local474++;
						}
					} else {
						local124 += this.anInt6738 - this.anInt6730;
					}
					local192++;
				}
				this.aStream6.c();
				if (this.anInterface16_5.method7862()) {
					this.aStream5.c();
					this.anInterface6_14 = this.aClass143_Sub1_13.method6373(false);
					this.anInterface6_14.method3122(16, this.anInt6733 * 16, local420);
					break;
				}
				this.aStream5.d(0);
				this.aClass335_34.method7773();
			}
		}
		this.aStream5 = null;
		this.aStream6 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray10 = this.aFloatArrayArray11 = null;
		this.aClass335_34 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZS)V")
	private void method5675(@OriginalArg(1) short arg0) {
		if (Stream.a()) {
			this.aStream6.b(arg0);
		} else {
			this.aStream6.f(arg0);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[ZIBI)V")
	public void method5676(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface16_5 == null || (arg3 + arg0 < this.anInt6730 || (arg0 - arg3 > this.anInt6738 || (arg3 + arg2 < this.anInt6734 || this.anInt6736 < arg2 - arg3)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt6734; local57 <= this.anInt6736; local57++) {
			for (@Pc(62) int local62 = this.anInt6730; local62 <= this.anInt6738; local62++) {
				@Pc(69) int local69 = local62 - arg0;
				@Pc(74) int local74 = local57 - arg2;
				if (local69 > -arg3 && arg3 > local69 && local74 > -arg3 && arg3 > local74 && arg1[arg3 + local69][local74 + arg3]) {
					this.aClass143_Sub1_13.method6306((byte) (int) (this.aClass5_Sub3_2.method8314() * 255.0F));
					this.aClass143_Sub1_13.method6325(0, this.anInterface6_14);
					this.aClass143_Sub1_13.method6333(this.aClass143_Sub1_13.aClass48_18);
					this.aClass143_Sub1_13.method6367(Static536.aClass323_4, 0, this.anInterface16_5, 0, this.anInt6733, this.anInt6731 / 3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V")
	private void method5677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) long local13 = -1L;
		@Pc(22) int local22 = arg2 + (arg4 << this.aClass88_Sub2_3.anInt10547);
		@Pc(31) int local31 = arg3 + (arg0 << this.aClass88_Sub2_3.anInt10547);
		@Pc(38) int local38 = this.aClass88_Sub2_3.method8753(local22, local31);
		if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local13 = ((long) local31 & 0xFFFFL) << 16 | (long) local22 & 0xFFFFL;
			@Pc(70) Class5 local70 = this.aClass335_34.method7766(local13);
			if (local70 != null) {
				this.method5675(((Class5_Sub19) local70).aShort26);
				return;
			}
		}
		@Pc(88) short local88 = (short) this.anInt6733++;
		if (local13 != -1L) {
			this.aClass335_34.method7770(local13, new Class5_Sub19(local88));
		}
		@Pc(131) float local131;
		@Pc(149) float local149;
		@Pc(140) float local140;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(314) float local314;
		if (arg2 == 0 && arg3 == 0) {
			local140 = this.aFloatArrayArray11[arg5][arg1];
			local131 = this.aFloatArrayArray12[arg5][arg1];
			local149 = this.aFloatArrayArray10[arg5][arg1];
		} else if (this.aClass88_Sub2_3.anInt10540 == arg2 && arg3 == 0) {
			local131 = this.aFloatArrayArray12[arg5 + 1][arg1];
			local140 = this.aFloatArrayArray11[arg5 + 1][arg1];
			local149 = this.aFloatArrayArray10[arg5 + 1][arg1];
		} else if (this.aClass88_Sub2_3.anInt10540 == arg2 && arg3 == this.aClass88_Sub2_3.anInt10540) {
			local149 = this.aFloatArrayArray10[arg5 + 1][arg1 + 1];
			local131 = this.aFloatArrayArray12[arg5 + 1][arg1 + 1];
			local140 = this.aFloatArrayArray11[arg5 + 1][arg1 + 1];
		} else if (arg2 == 0 && arg3 == this.aClass88_Sub2_3.anInt10540) {
			local140 = this.aFloatArrayArray11[arg5][arg1 + 1];
			local131 = this.aFloatArrayArray12[arg5][arg1 + 1];
			local149 = this.aFloatArrayArray10[arg5][arg1 + 1];
		} else {
			local209 = (float) arg2 / (float) this.aClass88_Sub2_3.anInt10540;
			local217 = (float) arg3 / (float) this.aClass88_Sub2_3.anInt10540;
			local224 = this.aFloatArrayArray12[arg5][arg1];
			local231 = this.aFloatArrayArray10[arg5][arg1];
			local238 = this.aFloatArrayArray11[arg5][arg1];
			local247 = this.aFloatArrayArray12[arg5 + 1][arg1];
			local256 = this.aFloatArrayArray10[arg5 + 1][arg1];
			@Pc(273) float local273 = local247 + (this.aFloatArrayArray12[arg5 + 1][arg1 + 1] - local247) * local209;
			@Pc(289) float local289 = local231 + local209 * (this.aFloatArrayArray10[arg5][arg1 + 1] - local231);
			@Pc(305) float local305 = local238 + (this.aFloatArrayArray11[arg5][arg1 + 1] - local238) * local209;
			local314 = this.aFloatArrayArray11[arg5 + 1][arg1];
			@Pc(329) float local329 = local224 + local209 * (this.aFloatArrayArray12[arg5][arg1 + 1] - local224);
			@Pc(346) float local346 = local256 + local209 * (this.aFloatArrayArray10[arg5 + 1][arg1 + 1] - local256);
			local149 = local217 * (local346 - local289) + local289;
			local131 = local329 + (local273 - local329) * local217;
			@Pc(380) float local380 = local314 + (this.aFloatArrayArray11[arg5 + 1][arg1 + 1] - local314) * local209;
			local140 = local305 + local217 * (local380 - local305);
		}
		local209 = (float) (this.aClass5_Sub3_2.method8317() - local22);
		local217 = (float) (this.aClass5_Sub3_2.method8313() - local38);
		local224 = (float) (this.aClass5_Sub3_2.method8323() - local31);
		local231 = (float) Math.sqrt((double) (local224 * local224 + local209 * local209 + local217 * local217));
		local238 = 1.0F / local231;
		local217 *= local238;
		local224 *= local238;
		local209 *= local238;
		local247 = local231 / (float) this.aClass5_Sub3_2.method8319();
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		local314 = local224 * local140 + local217 * local149 + local209 * local131;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(547) float local547 = local256 * 2.0F * local314;
		if (local547 > 1.0F) {
			local547 = 1.0F;
		}
		@Pc(558) int local558 = this.aClass5_Sub3_2.method8322();
		@Pc(568) int local568 = (int) (local547 * (float) (local558 >> 16 & 0xFF));
		if (local568 > 255) {
			local568 = 255;
		}
		@Pc(583) int local583 = (int) ((float) (local558 >> 8 & 0xFF) * local547);
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(598) int local598 = (int) ((float) (local558 & 0xFF) * local547);
		if (Stream.a()) {
			this.aStream5.b((float) local22);
			this.aStream5.b((float) local38);
			this.aStream5.b((float) local31);
		} else {
			this.aStream5.a((float) local22);
			this.aStream5.a((float) local38);
			this.aStream5.a((float) local31);
		}
		if (local598 > 255) {
			local598 = 255;
		}
		if (this.aClass143_Sub1_13.anInt7376 == 0) {
			this.aStream5.c(local598);
			this.aStream5.c(local583);
			this.aStream5.c(local568);
		} else {
			this.aStream5.c(local568);
			this.aStream5.c(local583);
			this.aStream5.c(local598);
		}
		this.aStream5.c(255);
		this.method5675(local88);
	}
}
