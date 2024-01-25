import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "I")
	private int anInt3570;

	@OriginalMember(owner = "client!hm", name = "D", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_9;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "Lclient!kb;")
	private final Class2_Sub24 aClass2_Sub24_2;

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "Lclient!sba;")
	private final Class76_Sub3 aClass76_Sub3_2;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
	private final int anInt3568;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
	private final int anInt3566;

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
	private final int anInt3574;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	private final int anInt3567;

	@OriginalMember(owner = "client!hm", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
	private int anInt3577;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "Lclient!ho;")
	private final Interface10 anInterface10_4;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "Lclient!lk;")
	private final Interface16 anInterface16_3;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "Lclient!gca;")
	private Class118 aClass118_16;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!pga;Lclient!sba;Lclient!kb;[I)V")
	public Class2_Sub19(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class76_Sub3 arg1, @OriginalArg(2) Class2_Sub24 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass95_Sub3_9 = arg0;
		this.aClass2_Sub24_2 = arg2;
		this.aClass76_Sub3_2 = arg1;
		@Pc(22) int local22 = this.aClass2_Sub24_2.method6302() - (arg1.anInt8792 >> 1);
		this.anInt3568 = this.aClass2_Sub24_2.method6299() - local22 >> arg1.anInt8795;
		this.anInt3566 = local22 + this.aClass2_Sub24_2.method6299() >> arg1.anInt8795;
		this.anInt3574 = this.aClass2_Sub24_2.method6301() - local22 >> arg1.anInt8795;
		this.anInt3567 = this.aClass2_Sub24_2.method6301() + local22 >> arg1.anInt8795;
		@Pc(76) int local76 = this.anInt3566 + 1 - this.anInt3568;
		@Pc(85) int local85 = this.anInt3567 + 1 - this.anInt3574;
		this.aFloatArrayArray10 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(172) int local172;
		@Pc(189) int local189;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt3574;
			if (local121 > 0 && this.aClass76_Sub3_2.anInt8794 - 1 > local121) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = this.anInt3568 + local136;
					if (local143 > 0 && this.aClass76_Sub3_2.anInt8791 - 1 > local143) {
						local172 = arg1.method7396(local121, local143 + 1) - arg1.method7396(local121, local143 - 1);
						local189 = arg1.method7396(local121 + 1, local143) - arg1.method7396(local121 - 1, local143);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local189 * local189 + 65536)));
						this.aFloatArrayArray9[local136][local114] = local205 * (float) local172;
						this.aFloatArrayArray10[local136][local114] = local205 * -256.0F;
						this.aFloatArrayArray8[local136][local114] = local205 * (float) local189;
					}
				}
			}
		}
		local121 = 0;
		@Pc(297) int local297;
		for (local136 = this.anInt3574; local136 <= this.anInt3567; local136++) {
			if (local136 >= 0 && arg1.anInt8794 > local136) {
				for (local143 = this.anInt3568; local143 <= this.anInt3566; local143++) {
					if (local143 >= 0 && local143 < arg1.anInt8791) {
						local172 = arg3[local121];
						@Pc(288) int[] local288 = arg1.anIntArrayArrayArray13[local143][local136];
						if (local288 != null && local172 != 0) {
							if (local172 == 1) {
								local297 = 0;
								while (local297 < local288.length) {
									if (local288[local297++] != -1 && local288[local297++] != -1 && local288[local297++] != -1) {
										this.anInt3577 += 3;
									}
								}
							} else {
								this.anInt3577 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt3566 - this.anInt3568;
			}
		}
		if (this.anInt3577 <= 0) {
			this.anInterface10_4 = null;
			this.anInterface16_3 = null;
		} else {
			this.aClass118_16 = new Class118(Static350.method4699(this.anInt3577));
			this.anInterface10_4 = this.aClass95_Sub3_9.method7119(false);
			this.anInterface10_4.method7382(this.anInt3577);
			@Pc(412) NativeHeapBuffer local412 = this.aClass95_Sub3_9.method7097(this.anInt3577 * 16, false);
			this.aStream2 = new Stream(local412);
			while (true) {
				@Pc(424) Buffer local424;
				do {
					local424 = this.anInterface10_4.method7385();
				} while (local424 == null);
				this.aStream1 = new Stream(local424);
				local189 = 0;
				local121 = 0;
				for (local297 = this.anInt3574; local297 <= this.anInt3567; local297++) {
					if (local297 >= 0 && arg1.anInt8794 > local297) {
						@Pc(449) int local449 = 0;
						for (@Pc(452) int local452 = this.anInt3568; local452 <= this.anInt3566; local452++) {
							if (local452 >= 0 && local452 < arg1.anInt8791) {
								@Pc(467) int local467 = arg3[local121];
								@Pc(474) int[] local474 = arg1.anIntArrayArrayArray13[local452][local297];
								if (local474 != null && local467 != 0) {
									if (local467 == 1) {
										@Pc(637) int[] local637 = arg1.anIntArrayArrayArray17[local452][local297];
										@Pc(644) int[] local644 = arg1.anIntArrayArrayArray18[local452][local297];
										@Pc(646) int local646 = 0;
										label120: while (true) {
											while (true) {
												if (local646 >= local474.length) {
													break label120;
												}
												if (local474[local646] == -1 || local474[local646 + 1] == -1 || local474[local646 + 2] == -1) {
													local646 += 3;
												} else {
													this.method2983(local449, local637[local646], local452, local297, local644[local646], local189);
													local646++;
													this.method2983(local449, local637[local646], local452, local297, local644[local646], local189);
													local646++;
													this.method2983(local449, local637[local646], local452, local297, local644[local646], local189);
													local646++;
												}
											}
										}
									} else if (local467 == 3) {
										this.method2983(local449, 0, local452, local297, 0, local189);
										this.method2983(local449, arg1.anInt8792, local452, local297, 0, local189);
										this.method2983(local449, 0, local452, local297, arg1.anInt8792, local189);
									} else if (local467 == 2) {
										this.method2983(local449, arg1.anInt8792, local452, local297, 0, local189);
										this.method2983(local449, arg1.anInt8792, local452, local297, arg1.anInt8792, local189);
										this.method2983(local449, 0, local452, local297, 0, local189);
									} else if (local467 == 5) {
										this.method2983(local449, arg1.anInt8792, local452, local297, arg1.anInt8792, local189);
										this.method2983(local449, 0, local452, local297, arg1.anInt8792, local189);
										this.method2983(local449, arg1.anInt8792, local452, local297, 0, local189);
									} else if (local467 == 4) {
										this.method2983(local449, 0, local452, local297, arg1.anInt8792, local189);
										this.method2983(local449, 0, local452, local297, 0, local189);
										this.method2983(local449, arg1.anInt8792, local452, local297, arg1.anInt8792, local189);
									}
								}
							}
							local449++;
							local121++;
						}
					} else {
						local121 += this.anInt3566 - this.anInt3568;
					}
					local189++;
				}
				this.aStream1.c();
				if (this.anInterface10_4.method7384()) {
					this.aStream2.c();
					this.anInterface16_3 = this.aClass95_Sub3_9.method7122(false);
					this.anInterface16_3.method7460(local412, 16, this.anInt3570 * 16);
					break;
				}
				this.aStream2.f(0);
				this.aClass118_16.method2599();
			}
		}
		this.aFloatArrayArray9 = this.aFloatArrayArray10 = this.aFloatArrayArray8 = null;
		this.aStream2 = null;
		this.aStream1 = null;
		this.aClass118_16 = null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII)V")
	private void method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass76_Sub3_2.anInt8795) + arg1;
		@Pc(24) int local24 = arg4 + (arg3 << this.aClass76_Sub3_2.anInt8795);
		@Pc(31) int local31 = this.aClass76_Sub3_2.method7398(local15, local24);
		if ((arg1 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local15 & 0xFFFFL;
			@Pc(62) Class2 local62 = this.aClass118_16.method2595(local7);
			if (local62 != null) {
				this.method2985(((Class2_Sub16) local62).aShort33);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt3570++;
		if (local7 != -1L) {
			this.aClass118_16.method2601(new Class2_Sub16(local80), local7);
		}
		@Pc(132) float local132;
		@Pc(143) float local143;
		@Pc(154) float local154;
		@Pc(203) float local203;
		@Pc(211) float local211;
		@Pc(218) float local218;
		@Pc(225) float local225;
		@Pc(232) float local232;
		@Pc(241) float local241;
		@Pc(250) float local250;
		@Pc(259) float local259;
		if (arg1 == 0 && arg4 == 0) {
			local154 = this.aFloatArrayArray8[arg0][arg5];
			local132 = this.aFloatArrayArray9[arg0][arg5];
			local143 = this.aFloatArrayArray10[arg0][arg5];
		} else if (this.aClass76_Sub3_2.anInt8792 == arg1 && arg4 == 0) {
			local132 = this.aFloatArrayArray9[arg0 + 1][arg5];
			local143 = this.aFloatArrayArray10[arg0 + 1][arg5];
			local154 = this.aFloatArrayArray8[arg0 + 1][arg5];
		} else if (this.aClass76_Sub3_2.anInt8792 == arg1 && arg4 == this.aClass76_Sub3_2.anInt8792) {
			local132 = this.aFloatArrayArray9[arg0 + 1][arg5 + 1];
			local143 = this.aFloatArrayArray10[arg0 + 1][arg5 + 1];
			local154 = this.aFloatArrayArray8[arg0 + 1][arg5 + 1];
		} else if (arg1 == 0 && arg4 == this.aClass76_Sub3_2.anInt8792) {
			local132 = this.aFloatArrayArray9[arg0][arg5 + 1];
			local154 = this.aFloatArrayArray8[arg0][arg5 + 1];
			local143 = this.aFloatArrayArray10[arg0][arg5 + 1];
		} else {
			local203 = (float) arg1 / (float) this.aClass76_Sub3_2.anInt8792;
			local211 = (float) arg4 / (float) this.aClass76_Sub3_2.anInt8792;
			local218 = this.aFloatArrayArray9[arg0][arg5];
			local225 = this.aFloatArrayArray10[arg0][arg5];
			local232 = this.aFloatArrayArray8[arg0][arg5];
			local241 = this.aFloatArrayArray9[arg0 + 1][arg5];
			local250 = this.aFloatArrayArray10[arg0 + 1][arg5];
			local259 = this.aFloatArrayArray8[arg0 + 1][arg5];
			@Pc(274) float local274 = local232 + local203 * (this.aFloatArrayArray8[arg0][arg5 + 1] - local232);
			@Pc(289) float local289 = local218 + (this.aFloatArrayArray9[arg0][arg5 + 1] - local218) * local203;
			@Pc(307) float local307 = local241 + local203 * (this.aFloatArrayArray9[arg0 + 1][arg5 + 1] - local241);
			@Pc(323) float local323 = local225 + local203 * (this.aFloatArrayArray10[arg0][arg5 + 1] - local225);
			@Pc(341) float local341 = local250 + (this.aFloatArrayArray10[arg0 + 1][arg5 + 1] - local250) * local203;
			local143 = (local341 - local323) * local211 + local323;
			@Pc(367) float local367 = local259 + local203 * (this.aFloatArrayArray8[arg0 + 1][arg5 + 1] - local259);
			local132 = local289 + local211 * (local307 - local289);
			local154 = (local367 - local274) * local211 + local274;
		}
		local203 = this.aClass2_Sub24_2.method6299() - local15;
		local211 = this.aClass2_Sub24_2.method6308() - local31;
		local218 = this.aClass2_Sub24_2.method6301() - local24;
		local225 = (float) Math.sqrt((double) (local211 * local211 + local203 * local203 + local218 * local218));
		local232 = 1.0F / local225;
		local203 *= local232;
		local211 *= local232;
		local218 *= local232;
		local241 = local225 / (float) this.aClass2_Sub24_2.method6302();
		local250 = 1.0F - local241 * local241;
		if (local250 < 0.0F) {
			local250 = 0.0F;
		}
		local259 = local132 * local203 + local143 * local211 + local154 * local218;
		if (local259 < 0.0F) {
			local259 = 0.0F;
		}
		@Pc(538) float local538 = local259 * local250 * 2.0F;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(549) int local549 = this.aClass2_Sub24_2.method6305();
		@Pc(559) int local559 = (int) (local538 * (float) (local549 >> 16 & 0xFF));
		if (local559 > 255) {
			local559 = 255;
		}
		@Pc(576) int local576 = (int) (local538 * (float) (local549 >> 8 & 0xFF));
		if (local576 > 255) {
			local576 = 255;
		}
		@Pc(589) int local589 = (int) (local538 * (float) (local549 & 0xFF));
		if (Stream.a()) {
			this.aStream2.b((float) local15);
			this.aStream2.b((float) local31);
			this.aStream2.b((float) local24);
		} else {
			this.aStream2.a((float) local15);
			this.aStream2.a((float) local31);
			this.aStream2.a((float) local24);
		}
		if (local589 > 255) {
			local589 = 255;
		}
		if (this.aClass95_Sub3_9.anInt8380 == 0) {
			this.aStream2.a(local589);
			this.aStream2.a(local576);
			this.aStream2.a(local559);
		} else {
			this.aStream2.a(local559);
			this.aStream2.a(local576);
			this.aStream2.a(local589);
		}
		this.aStream2.a(255);
		this.method2985(local80);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(SI)V")
	private void method2985(@OriginalArg(0) short arg0) {
		if (Stream.a()) {
			this.aStream1.e(arg0);
		} else {
			this.aStream1.b(arg0);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII[[Z)V")
	public void method2988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface10_4 == null || (this.anInt3568 > arg1 + arg0 || (this.anInt3566 < arg1 - arg0 || (arg2 + arg0 < this.anInt3574 || arg2 - arg0 > this.anInt3567)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt3574; local51 <= this.anInt3567; local51++) {
			for (@Pc(56) int local56 = this.anInt3568; local56 <= this.anInt3566; local56++) {
				@Pc(63) int local63 = local56 - arg1;
				@Pc(68) int local68 = local51 - arg2;
				if (local63 > -arg0 && arg0 > local63 && local68 > -arg0 && local68 < arg0 && arg3[arg0 + local63][local68 + arg0]) {
					this.aClass95_Sub3_9.method7045((byte) (this.aClass2_Sub24_2.method6307() * 255.0F));
					this.aClass95_Sub3_9.method7054(0, this.anInterface16_3);
					this.aClass95_Sub3_9.method7059(this.aClass95_Sub3_9.aClass72_21);
					this.aClass95_Sub3_9.method7060(Static286.aClass30_3, 0, 0, this.anInt3570, this.anInterface10_4, this.anInt3577 / 3);
					return;
				}
			}
		}
	}
}
