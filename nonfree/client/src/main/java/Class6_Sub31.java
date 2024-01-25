import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	private int anInt5893;

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "Lclient!si;")
	private final Class245_Sub2 aClass245_Sub2_2;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "Lclient!uv;")
	private final Class5_Sub2 aClass5_Sub2_10;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "Lclient!cba;")
	private final Class6_Sub10 aClass6_Sub10_2;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	private final int anInt5892;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
	private final int anInt5895;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	private final int anInt5894;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
	private final int anInt5897;

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	private int anInt5896;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "Lclient!tea;")
	private final Interface26 anInterface26_13;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "Lclient!ug;")
	private final Interface27 anInterface27_7;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "Lclient!wr;")
	private Class380 aClass380_22;

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!uv;Lclient!si;Lclient!cba;[I)V")
	public Class6_Sub31(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class245_Sub2 arg1, @OriginalArg(2) Class6_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass245_Sub2_2 = arg1;
		this.aClass5_Sub2_10 = arg0;
		this.aClass6_Sub10_2 = arg2;
		@Pc(23) int local23 = this.aClass6_Sub10_2.method5316() - (arg1.anInt9291 >> 1);
		this.anInt5892 = this.aClass6_Sub10_2.method5312() - local23 >> arg1.anInt9286;
		this.anInt5895 = local23 + this.aClass6_Sub10_2.method5312() >> arg1.anInt9286;
		this.anInt5894 = this.aClass6_Sub10_2.method5320() - local23 >> arg1.anInt9286;
		this.anInt5897 = this.aClass6_Sub10_2.method5320() + local23 >> arg1.anInt9286;
		@Pc(78) int local78 = this.anInt5895 + 1 - this.anInt5892;
		@Pc(87) int local87 = this.anInt5897 + 1 - this.anInt5894;
		this.aFloatArrayArray6 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray5 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(170) int local170;
		@Pc(187) int local187;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt5894 + local116;
			if (local123 > 0 && this.aClass245_Sub2_2.anInt9290 - 1 > local123) {
				for (local137 = 0; local137 <= local78; local137++) {
					local144 = local137 + this.anInt5892;
					if (local144 > 0 && this.aClass245_Sub2_2.anInt9289 - 1 > local144) {
						local170 = arg1.method7583(local123, local144 + 1) - arg1.method7583(local123, local144 - 1);
						local187 = arg1.method7583(local123 + 1, local144) - arg1.method7583(local123 - 1, local144);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local187 * local187 + 65536)));
						this.aFloatArrayArray5[local137][local116] = (float) local170 * local202;
						this.aFloatArrayArray7[local137][local116] = local202 * -256.0F;
						this.aFloatArrayArray6[local137][local116] = (float) local187 * local202;
					}
				}
			}
		}
		local123 = 0;
		@Pc(306) int local306;
		for (local137 = this.anInt5894; local137 <= this.anInt5897; local137++) {
			if (local137 >= 0 && local137 < arg1.anInt9290) {
				for (local144 = this.anInt5892; local144 <= this.anInt5895; local144++) {
					if (local144 >= 0 && arg1.anInt9289 > local144) {
						local170 = arg3[local123];
						@Pc(292) int[] local292 = arg1.anIntArrayArrayArray19[local144][local137];
						if (local292 != null && local170 != 0) {
							if (local170 == 1) {
								local306 = 0;
								while (local306 < local292.length) {
									if (local292[local306++] != -1 && local292[local306++] != -1 && local292[local306++] != -1) {
										this.anInt5896 += 3;
									}
								}
							} else {
								this.anInt5896 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt5895 - this.anInt5892;
			}
		}
		if (this.anInt5896 <= 0) {
			this.anInterface26_13 = null;
			this.anInterface27_7 = null;
		} else {
			this.aClass380_22 = new Class380(Static101.method2622(this.anInt5896));
			this.anInterface27_7 = this.aClass5_Sub2_10.method3993(false);
			this.anInterface27_7.method8101(this.anInt5896);
			@Pc(407) NativeHeapBuffer local407 = this.aClass5_Sub2_10.method3950(this.anInt5896 * 16, false);
			this.aStream5 = new Stream(local407);
			while (true) {
				@Pc(419) Buffer local419;
				do {
					local419 = this.anInterface27_7.method7962();
				} while (local419 == null);
				this.aStream6 = new Stream(local419);
				local123 = 0;
				local187 = 0;
				for (local306 = this.anInt5894; local306 <= this.anInt5897; local306++) {
					if (local306 >= 0 && arg1.anInt9290 > local306) {
						@Pc(444) int local444 = 0;
						for (@Pc(447) int local447 = this.anInt5892; local447 <= this.anInt5895; local447++) {
							if (local447 >= 0 && local447 < arg1.anInt9289) {
								@Pc(463) int local463 = arg3[local123];
								@Pc(470) int[] local470 = arg1.anIntArrayArrayArray19[local447][local306];
								if (local470 != null && local463 != 0) {
									if (local463 == 1) {
										@Pc(629) int[] local629 = arg1.anIntArrayArrayArray15[local447][local306];
										@Pc(636) int[] local636 = arg1.anIntArrayArrayArray18[local447][local306];
										@Pc(638) int local638 = 0;
										label119: while (true) {
											while (true) {
												if (local638 >= local470.length) {
													break label119;
												}
												if (local470[local638] == -1 || local470[local638 + 1] == -1 || local470[local638 + 2] == -1) {
													local638 += 3;
												} else {
													this.method4913(local187, local447, local306, local636[local638], local444, local629[local638]);
													local638++;
													this.method4913(local187, local447, local306, local636[local638], local444, local629[local638]);
													local638++;
													this.method4913(local187, local447, local306, local636[local638], local444, local629[local638]);
													local638++;
												}
											}
										}
									} else if (local463 == 3) {
										this.method4913(local187, local447, local306, 0, local444, 0);
										this.method4913(local187, local447, local306, 0, local444, arg1.anInt9291);
										this.method4913(local187, local447, local306, arg1.anInt9291, local444, 0);
									} else if (local463 == 2) {
										this.method4913(local187, local447, local306, 0, local444, arg1.anInt9291);
										this.method4913(local187, local447, local306, arg1.anInt9291, local444, arg1.anInt9291);
										this.method4913(local187, local447, local306, 0, local444, 0);
									} else if (local463 == 5) {
										this.method4913(local187, local447, local306, arg1.anInt9291, local444, arg1.anInt9291);
										this.method4913(local187, local447, local306, arg1.anInt9291, local444, 0);
										this.method4913(local187, local447, local306, 0, local444, arg1.anInt9291);
									} else if (local463 == 4) {
										this.method4913(local187, local447, local306, arg1.anInt9291, local444, 0);
										this.method4913(local187, local447, local306, 0, local444, 0);
										this.method4913(local187, local447, local306, arg1.anInt9291, local444, arg1.anInt9291);
									}
								}
							}
							local444++;
							local123++;
						}
					} else {
						local123 += this.anInt5895 - this.anInt5892;
					}
					local187++;
				}
				this.aStream6.c();
				if (this.anInterface27_7.method7963()) {
					this.aStream5.c();
					this.anInterface26_13 = this.aClass5_Sub2_10.method4063(false);
					this.anInterface26_13.method8108(this.anInt5893 * 16, 16, local407);
					break;
				}
				this.aStream5.b(0);
				this.aClass380_22.method8751();
			}
		}
		this.aFloatArrayArray5 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
		this.aStream5 = null;
		this.aClass380_22 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[[ZIII)V")
	public void method4911(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface27_7 == null || (arg1 + arg3 < this.anInt5892 || (this.anInt5895 < arg1 - arg3 || (this.anInt5894 > arg2 + arg3 || this.anInt5897 < arg2 - arg3)))) {
			return;
		}
		for (@Pc(52) int local52 = this.anInt5894; local52 <= this.anInt5897; local52++) {
			for (@Pc(57) int local57 = this.anInt5892; local57 <= this.anInt5895; local57++) {
				@Pc(64) int local64 = local57 - arg1;
				@Pc(68) int local68 = local52 - arg2;
				if (local64 > -arg3 && local64 < arg3 && -arg3 < local68 && arg3 > local68 && arg0[arg3 + local64][arg3 + local68]) {
					this.aClass5_Sub2_10.method3957((byte) (int) (this.aClass6_Sub10_2.method5314() * 255.0F));
					this.aClass5_Sub2_10.method3974(0, this.anInterface26_13);
					this.aClass5_Sub2_10.method4045(this.aClass5_Sub2_10.aClass270_19);
					this.aClass5_Sub2_10.method3976(Static574.aClass248_11, this.anInt5893, 0, this.anInterface27_7, 0, this.anInt5896 / 3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
	private void method4913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg5 + (arg1 << this.aClass245_Sub2_2.anInt9286);
		@Pc(24) int local24 = (arg2 << this.aClass245_Sub2_2.anInt9286) + arg3;
		@Pc(31) int local31 = this.aClass245_Sub2_2.method7580(local16, local24);
		if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local16 & 0xFFFFL;
			@Pc(59) Class6 local59 = this.aClass380_22.method8747(local7);
			if (local59 != null) {
				this.method4914(((Class6_Sub43) local59).aShort97);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt5893++;
		if (local7 != -1L) {
			this.aClass380_22.method8753(new Class6_Sub43(local77), local7);
		}
		@Pc(122) float local122;
		@Pc(115) float local115;
		@Pc(108) float local108;
		@Pc(163) float local163;
		@Pc(171) float local171;
		@Pc(178) float local178;
		@Pc(185) float local185;
		@Pc(192) float local192;
		@Pc(201) float local201;
		@Pc(210) float local210;
		@Pc(266) float local266;
		if (arg5 == 0 && arg3 == 0) {
			local108 = this.aFloatArrayArray6[arg4][arg0];
			local115 = this.aFloatArrayArray7[arg4][arg0];
			local122 = this.aFloatArrayArray5[arg4][arg0];
		} else if (this.aClass245_Sub2_2.anInt9291 == arg5 && arg3 == 0) {
			local115 = this.aFloatArrayArray7[arg4 + 1][arg0];
			local108 = this.aFloatArrayArray6[arg4 + 1][arg0];
			local122 = this.aFloatArrayArray5[arg4 + 1][arg0];
		} else if (arg5 == this.aClass245_Sub2_2.anInt9291 && arg3 == this.aClass245_Sub2_2.anInt9291) {
			local108 = this.aFloatArrayArray6[arg4 + 1][arg0 + 1];
			local122 = this.aFloatArrayArray5[arg4 + 1][arg0 + 1];
			local115 = this.aFloatArrayArray7[arg4 + 1][arg0 + 1];
		} else if (arg5 == 0 && this.aClass245_Sub2_2.anInt9291 == arg3) {
			local108 = this.aFloatArrayArray6[arg4][arg0 + 1];
			local122 = this.aFloatArrayArray5[arg4][arg0 + 1];
			local115 = this.aFloatArrayArray7[arg4][arg0 + 1];
		} else {
			local163 = (float) arg5 / (float) this.aClass245_Sub2_2.anInt9291;
			local171 = (float) arg3 / (float) this.aClass245_Sub2_2.anInt9291;
			local178 = this.aFloatArrayArray5[arg4][arg0];
			local185 = this.aFloatArrayArray7[arg4][arg0];
			local192 = this.aFloatArrayArray6[arg4][arg0];
			local201 = this.aFloatArrayArray5[arg4 + 1][arg0];
			local210 = this.aFloatArrayArray7[arg4 + 1][arg0];
			@Pc(226) float local226 = local192 + local163 * (this.aFloatArrayArray6[arg4][arg0 + 1] - local192);
			@Pc(242) float local242 = local185 + local163 * (this.aFloatArrayArray7[arg4][arg0 + 1] - local185);
			@Pc(257) float local257 = local178 + local163 * (this.aFloatArrayArray5[arg4][arg0 + 1] - local178);
			local266 = this.aFloatArrayArray6[arg4 + 1][arg0];
			@Pc(284) float local284 = local210 + local163 * (this.aFloatArrayArray7[arg4 + 1][arg0 + 1] - local210);
			@Pc(301) float local301 = local201 + (this.aFloatArrayArray5[arg4 + 1][arg0 + 1] - local201) * local163;
			local115 = local242 + local171 * (local284 - local242);
			@Pc(327) float local327 = local266 + local163 * (this.aFloatArrayArray6[arg4 + 1][arg0 + 1] - local266);
			local122 = local257 + (local301 - local257) * local171;
			local108 = local226 + (local327 - local226) * local171;
		}
		local163 = (float) (this.aClass6_Sub10_2.method5312() - local16);
		local171 = (float) (this.aClass6_Sub10_2.method5321() - local31);
		local178 = (float) (this.aClass6_Sub10_2.method5320() - local24);
		local185 = (float) Math.sqrt((double) (local171 * local171 + local163 * local163 + local178 * local178));
		local192 = 1.0F / local185;
		local163 *= local192;
		local178 *= local192;
		local171 *= local192;
		local201 = local185 / (float) this.aClass6_Sub10_2.method5316();
		local210 = 1.0F - local201 * local201;
		if (local210 < 0.0F) {
			local210 = 0.0F;
		}
		local266 = local178 * local108 + local163 * local122 + local171 * local115;
		if ((float) 0 > local266) {
			local266 = 0.0F;
		}
		@Pc(544) float local544 = local266 * local210 * 2.0F;
		if (local544 > 1.0F) {
			local544 = 1.0F;
		}
		@Pc(555) int local555 = this.aClass6_Sub10_2.method5319();
		@Pc(565) int local565 = (int) (local544 * (float) (local555 >> 16 & 0xFF));
		if (local565 > 255) {
			local565 = 255;
		}
		@Pc(582) int local582 = (int) ((float) (local555 >> 8 & 0xFF) * local544);
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(597) int local597 = (int) (local544 * (float) (local555 & 0xFF));
		if (local597 > 255) {
			local597 = 255;
		}
		if (Stream.a()) {
			this.aStream5.b((float) local16);
			this.aStream5.b((float) local31);
			this.aStream5.b((float) local24);
		} else {
			this.aStream5.a((float) local16);
			this.aStream5.a((float) local31);
			this.aStream5.a((float) local24);
		}
		if (this.aClass5_Sub2_10.anInt4868 == 0) {
			this.aStream5.e(local597);
			this.aStream5.e(local582);
			this.aStream5.e(local565);
		} else {
			this.aStream5.e(local565);
			this.aStream5.e(local582);
			this.aStream5.e(local597);
		}
		this.aStream5.e(255);
		this.method4914(local77);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(SI)V")
	private void method4914(@OriginalArg(0) short arg0) {
		if (Stream.a()) {
			this.aStream6.c(arg0);
		} else {
			this.aStream6.d(arg0);
		}
	}
}
