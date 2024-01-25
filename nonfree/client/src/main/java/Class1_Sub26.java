import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	private int anInt4404;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	private int anInt4406;

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "Lclient!ae;")
	private final Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "Lclient!cba;")
	private final Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_20;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
	private final int anInt4411;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	private final int anInt4407;

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
	private final int anInt4408;

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
	private final int anInt4409;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Lclient!ro;")
	private final Class258 aClass258_5;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "Lclient!qo;")
	private final Interface15 anInterface15_2;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "Lclient!ro;")
	private final Class258 aClass258_6;

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "Lclient!wj;")
	private final Interface20 anInterface20_2;

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "Lclient!os;")
	private Class1_Sub17 aClass1_Sub17_4;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "Lclient!gt;")
	private Class1_Sub17_Sub1 aClass1_Sub17_Sub1_1;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "Lclient!pt;")
	private Class230 aClass230_26;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!mh;Lclient!ae;Lclient!cba;[I)V")
	public Class1_Sub26(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class7_Sub1 arg1, @OriginalArg(2) Class1_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass7_Sub1_2 = arg1;
		this.aClass1_Sub5_2 = arg2;
		this.aClass4_Sub3_20 = arg0;
		@Pc(23) int local23 = this.aClass1_Sub5_2.method4311() - (arg1.anInt9576 >> 1);
		this.anInt4411 = this.aClass1_Sub5_2.method4306() - local23 >> arg1.anInt9573;
		this.anInt4407 = this.aClass1_Sub5_2.method4306() + local23 >> arg1.anInt9573;
		this.anInt4408 = this.aClass1_Sub5_2.method4314() - local23 >> arg1.anInt9573;
		this.anInt4409 = this.aClass1_Sub5_2.method4314() + local23 >> arg1.anInt9573;
		@Pc(79) int local79 = this.anInt4407 + 1 - this.anInt4411;
		@Pc(88) int local88 = this.anInt4409 + 1 - this.anInt4408;
		this.aFloatArrayArray7 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray8 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray6 = new float[local79 + 1][local88 + 1];
		@Pc(125) int local125;
		@Pc(143) int local143;
		@Pc(150) int local150;
		@Pc(177) int local177;
		@Pc(191) int local191;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local125 = local117 + this.anInt4408;
			if (local125 > 0 && this.aClass7_Sub1_2.anInt9575 - 1 > local125) {
				for (local143 = 0; local143 <= local79; local143++) {
					local150 = this.anInt4411 + local143;
					if (local150 > 0 && local150 < this.aClass7_Sub1_2.anInt9577 - 1) {
						local177 = arg1.ba(local150 + 1, local125) - arg1.ba(local150 - 1, local125);
						local191 = arg1.ba(local150, local125 + 1) - arg1.ba(local150, local125 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local191 * local191 + 65536)));
						this.aFloatArrayArray6[local143][local117] = (float) local177 * local206;
						this.aFloatArrayArray8[local143][local117] = local206 * -256.0F;
						this.aFloatArrayArray7[local143][local117] = local206 * (float) local191;
					}
				}
			}
		}
		local125 = 0;
		local143 = 0;
		for (local150 = this.anInt4408; local150 <= this.anInt4409; local150++) {
			if (local150 >= 0 && arg1.anInt9575 > local150) {
				for (local177 = this.anInt4411; local177 <= this.anInt4407; local177++) {
					if (local177 >= 0 && local177 < arg1.anInt9577) {
						local191 = arg3[local143];
						@Pc(309) int[] local309 = arg1.anIntArrayArrayArray4[local177][local150];
						if (local309 != null && local191 != 0) {
							if (local191 == 1) {
								local125 += local309.length;
							} else {
								local125 += 3;
							}
						}
					}
					local143++;
				}
			} else {
				local143 += this.anInt4407 - this.anInt4411;
			}
		}
		if (local125 <= 0) {
			this.aClass258_5 = null;
			this.anInterface15_2 = null;
			this.aClass258_6 = null;
			this.anInterface20_2 = null;
		} else {
			this.aClass1_Sub17_4 = new Class1_Sub17(local125 * 2);
			this.aClass1_Sub17_Sub1_1 = new Class1_Sub17_Sub1(local125 * 16);
			this.aClass230_26 = new Class230(Static184.method3549(local125));
			local177 = 0;
			local143 = 0;
			for (local191 = this.anInt4408; local191 <= this.anInt4409; local191++) {
				if (local191 >= 0 && arg1.anInt9575 > local191) {
					@Pc(404) int local404 = 0;
					for (@Pc(407) int local407 = this.anInt4411; local407 <= this.anInt4407; local407++) {
						if (local407 >= 0 && arg1.anInt9577 > local407) {
							@Pc(422) int local422 = arg3[local143];
							@Pc(429) int[] local429 = arg1.anIntArrayArrayArray4[local407][local191];
							@Pc(436) int[] local436 = arg1.anIntArrayArrayArray1[local407][local191];
							if (local429 != null && local422 != 0) {
								if (local422 == 1) {
									for (@Pc(591) int local591 = 0; local591 < local429.length; local591++) {
										this.method4102(local191, local177, local436[local591], local404, local407, local429[local591]);
									}
								} else if (local422 == 3) {
									this.method4102(local191, local177, 0, local404, local407, 0);
									this.method4102(local191, local177, 0, local404, local407, arg1.anInt9576);
									this.method4102(local191, local177, arg1.anInt9576, local404, local407, 0);
								} else if (local422 == 2) {
									this.method4102(local191, local177, 0, local404, local407, arg1.anInt9576);
									this.method4102(local191, local177, arg1.anInt9576, local404, local407, arg1.anInt9576);
									this.method4102(local191, local177, 0, local404, local407, 0);
								} else if (local422 == 5) {
									this.method4102(local191, local177, arg1.anInt9576, local404, local407, arg1.anInt9576);
									this.method4102(local191, local177, arg1.anInt9576, local404, local407, 0);
									this.method4102(local191, local177, 0, local404, local407, arg1.anInt9576);
								} else if (local422 == 4) {
									this.method4102(local191, local177, arg1.anInt9576, local404, local407, 0);
									this.method4102(local191, local177, 0, local404, local407, 0);
									this.method4102(local191, local177, arg1.anInt9576, local404, local407, arg1.anInt9576);
								}
							}
						}
						local404++;
						local143++;
					}
				} else {
					local143 += this.anInt4407 - this.anInt4411;
				}
				local177++;
			}
			this.anInterface20_2 = this.aClass4_Sub3_20.method5304(this.aClass1_Sub17_4.aByteArray58, false, this.aClass1_Sub17_4.anInt4872);
			this.anInterface15_2 = this.aClass4_Sub3_20.method5299(this.aClass1_Sub17_Sub1_1.anInt4872, 16, this.aClass1_Sub17_Sub1_1.aByteArray58, false);
			this.aClass258_5 = new Class258(this.anInterface15_2, 5126, 3, 0);
			this.aClass258_6 = new Class258(this.anInterface15_2, 5121, 4, 12);
		}
		this.aClass230_26 = null;
		this.aClass1_Sub17_Sub1_1 = null;
		this.aClass1_Sub17_4 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III[[ZI)V")
	public void method4101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface20_2 == null || (this.anInt4411 > arg0 + arg2 || (arg2 - arg0 > this.anInt4407 || (arg0 + arg1 < this.anInt4408 || this.anInt4409 < arg1 - arg0)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt4408; local57 <= this.anInt4409; local57++) {
			for (@Pc(62) int local62 = this.anInt4411; local62 <= this.anInt4407; local62++) {
				@Pc(69) int local69 = local62 - arg2;
				@Pc(73) int local73 = local57 - arg1;
				if (local69 > -arg0 && arg0 > local69 && local73 > -arg0 && local73 < arg0 && arg3[local69 + arg0][local73 + arg0]) {
					this.aClass4_Sub3_20.method5226((int) (this.aClass1_Sub5_2.method4310() * 255.0F) << 24);
					this.aClass4_Sub3_20.method5298(null, this.aClass258_6, this.aClass258_5, null);
					this.aClass4_Sub3_20.method5287(this.anInt4406, this.anInterface20_2, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)V")
	private void method4102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = -1L;
		@Pc(20) int local20 = arg5 + (arg4 << this.aClass7_Sub1_2.anInt9573);
		@Pc(28) int local28 = (arg0 << this.aClass7_Sub1_2.anInt9573) + arg2;
		@Pc(34) int local34 = this.aClass7_Sub1_2.aa(local20, local28);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local11 = (long) local20 & 0xFFFFL | ((long) local28 & 0xFFFFL) << 16;
			@Pc(60) Class1 local60 = this.aClass230_26.method6144(local11);
			if (local60 != null) {
				this.method4103(((Class1_Sub49) local60).aShort117);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt4404++;
		if (local11 != -1L) {
			this.aClass230_26.method6139(local11, new Class1_Sub49(local78));
		}
		@Pc(109) float local109;
		@Pc(102) float local102;
		@Pc(116) float local116;
		@Pc(190) float local190;
		@Pc(198) float local198;
		@Pc(205) float local205;
		@Pc(212) float local212;
		@Pc(219) float local219;
		@Pc(228) float local228;
		@Pc(237) float local237;
		@Pc(329) float local329;
		if (arg5 == 0 && arg2 == 0) {
			local102 = this.aFloatArrayArray8[arg3][arg1];
			local109 = this.aFloatArrayArray6[arg3][arg1];
			local116 = this.aFloatArrayArray7[arg3][arg1];
		} else if (arg5 == this.aClass7_Sub1_2.anInt9576 && arg2 == 0) {
			local102 = this.aFloatArrayArray8[arg3 + 1][arg1];
			local116 = this.aFloatArrayArray7[arg3 + 1][arg1];
			local109 = this.aFloatArrayArray6[arg3 + 1][arg1];
		} else if (this.aClass7_Sub1_2.anInt9576 == arg5 && arg2 == this.aClass7_Sub1_2.anInt9576) {
			local102 = this.aFloatArrayArray8[arg3 + 1][arg1 + 1];
			local109 = this.aFloatArrayArray6[arg3 + 1][arg1 + 1];
			local116 = this.aFloatArrayArray7[arg3 + 1][arg1 + 1];
		} else if (arg5 == 0 && this.aClass7_Sub1_2.anInt9576 == arg2) {
			local109 = this.aFloatArrayArray6[arg3][arg1 + 1];
			local116 = this.aFloatArrayArray7[arg3][arg1 + 1];
			local102 = this.aFloatArrayArray8[arg3][arg1 + 1];
		} else {
			local190 = (float) arg5 / (float) this.aClass7_Sub1_2.anInt9576;
			local198 = (float) arg2 / (float) this.aClass7_Sub1_2.anInt9576;
			local205 = this.aFloatArrayArray6[arg3][arg1];
			local212 = this.aFloatArrayArray8[arg3][arg1];
			local219 = this.aFloatArrayArray7[arg3][arg1];
			local228 = this.aFloatArrayArray6[arg3 + 1][arg1];
			local237 = this.aFloatArrayArray8[arg3 + 1][arg1];
			@Pc(252) float local252 = local205 + (this.aFloatArrayArray6[arg3][arg1 + 1] - local205) * local190;
			@Pc(270) float local270 = local228 + (this.aFloatArrayArray6[arg3 + 1][arg1 + 1] - local228) * local190;
			@Pc(286) float local286 = local219 + (this.aFloatArrayArray7[arg3][arg1 + 1] - local219) * local190;
			@Pc(302) float local302 = local212 + (this.aFloatArrayArray8[arg3][arg1 + 1] - local212) * local190;
			@Pc(320) float local320 = local237 + local190 * (this.aFloatArrayArray8[arg3 + 1][arg1 + 1] - local237);
			local329 = this.aFloatArrayArray7[arg3 + 1][arg1];
			local109 = (local270 - local252) * local198 + local252;
			local102 = (local320 - local302) * local198 + local302;
			@Pc(362) float local362 = local329 + local190 * (this.aFloatArrayArray7[arg3 + 1][arg1 + 1] - local329);
			local116 = (local362 - local286) * local198 + local286;
		}
		local190 = this.aClass1_Sub5_2.method4306() - local20;
		local198 = this.aClass1_Sub5_2.method4305() - local34;
		local205 = this.aClass1_Sub5_2.method4314() - local28;
		local212 = (float) Math.sqrt((double) (local190 * local190 + local198 * local198 + local205 * local205));
		local219 = 1.0F / local212;
		local205 *= local219;
		local190 *= local219;
		local198 *= local219;
		local228 = local212 / (float) this.aClass1_Sub5_2.method4311();
		local237 = 1.0F - local228 * local228;
		if (local237 < 0.0F) {
			local237 = 0.0F;
		}
		local329 = local198 * local102 + local109 * local190 + local205 * local116;
		if (local329 < 0.0F) {
			local329 = 0.0F;
		}
		@Pc(535) float local535 = local329 * 2.0F * local237;
		if (local535 > 1.0F) {
			local535 = 1.0F;
		}
		@Pc(546) int local546 = this.aClass1_Sub5_2.method4313();
		@Pc(556) int local556 = (int) (local535 * (float) (local546 >> 16 & 0xFF));
		if (local556 > 255) {
			local556 = 255;
		}
		@Pc(573) int local573 = (int) (local535 * (float) (local546 >> 8 & 0xFF));
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local546 & 0xFF) * local535);
		if (local586 > 255) {
			local586 = 255;
		}
		if (this.aClass4_Sub3_20.aBoolean421) {
			this.aClass1_Sub17_Sub1_1.method3096((float) local20);
			this.aClass1_Sub17_Sub1_1.method3096((float) local34);
			this.aClass1_Sub17_Sub1_1.method3096((float) local28);
		} else {
			this.aClass1_Sub17_Sub1_1.method3095((float) local20);
			this.aClass1_Sub17_Sub1_1.method3095((float) local34);
			this.aClass1_Sub17_Sub1_1.method3095((float) local28);
		}
		this.aClass1_Sub17_Sub1_1.method4451(local556);
		this.aClass1_Sub17_Sub1_1.method4451(local573);
		this.aClass1_Sub17_Sub1_1.method4451(local586);
		this.aClass1_Sub17_Sub1_1.method4451(255);
		this.method4103(local78);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BS)V")
	private void method4103(@OriginalArg(1) short arg0) {
		if (this.aClass4_Sub3_20.aBoolean421) {
			this.aClass1_Sub17_4.method4473(arg0);
		} else {
			this.aClass1_Sub17_4.method4455(arg0);
		}
		this.anInt4406++;
	}
}
