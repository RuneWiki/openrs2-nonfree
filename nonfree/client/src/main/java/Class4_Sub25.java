import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	private int anInt4405;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!am;")
	private final Class4_Sub3 aClass4_Sub3_3;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_10;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "Lclient!sq;")
	private final Class115_Sub2 aClass115_Sub2_1;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
	private final int anInt4403;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private final int anInt4410;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private final int anInt4402;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	private final int anInt4411;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private int anInt4401;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "Lclient!mo;")
	private Class221 aClass221_9;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "Lclient!eu;")
	private final Interface6 anInterface6_6;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "Lclient!wf;")
	private final Interface24 anInterface24_8;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!nh;Lclient!sq;Lclient!am;[I)V")
	public Class4_Sub25(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Class115_Sub2 arg1, @OriginalArg(2) Class4_Sub3 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass4_Sub3_3 = arg2;
		this.aClass7_Sub1_10 = arg0;
		this.aClass115_Sub2_1 = arg1;
		@Pc(23) int local23 = this.aClass4_Sub3_3.method4950() - (arg1.anInt10333 >> 1);
		this.anInt4403 = this.aClass4_Sub3_3.method4954() - local23 >> arg1.anInt10331;
		this.anInt4410 = local23 + this.aClass4_Sub3_3.method4954() >> arg1.anInt10331;
		this.anInt4402 = this.aClass4_Sub3_3.method4949() - local23 >> arg1.anInt10331;
		this.anInt4411 = local23 + this.aClass4_Sub3_3.method4949() >> arg1.anInt10331;
		@Pc(77) int local77 = this.anInt4410 + 1 - this.anInt4403;
		@Pc(86) int local86 = this.anInt4411 + 1 - this.anInt4402;
		this.aFloatArrayArray7 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray8 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(176) int local176;
		@Pc(193) int local193;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt4402;
			if (local122 > 0 && local122 < this.aClass115_Sub2_1.anInt10327 - 1) {
				for (local140 = 0; local140 <= local77; local140++) {
					local147 = this.anInt4403 + local140;
					if (local147 > 0 && this.aClass115_Sub2_1.anInt10330 - 1 > local147) {
						local176 = arg1.method8055(local122, local147 + 1) - arg1.method8055(local122, local147 - 1);
						local193 = arg1.method8055(local122 + 1, local147) - arg1.method8055(local122 - 1, local147);
						@Pc(208) float local208 = (float) (1.0D / Math.sqrt((double) (local193 * local193 + local176 * local176 + 65536)));
						this.aFloatArrayArray7[local140][local115] = (float) local176 * local208;
						this.aFloatArrayArray9[local140][local115] = -256.0F * local208;
						this.aFloatArrayArray8[local140][local115] = (float) local193 * local208;
					}
				}
			}
		}
		local122 = 0;
		@Pc(311) int local311;
		for (local140 = this.anInt4402; local140 <= this.anInt4411; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt10327) {
				for (local147 = this.anInt4403; local147 <= this.anInt4410; local147++) {
					if (local147 >= 0 && local147 < arg1.anInt10330) {
						local176 = arg3[local122];
						@Pc(294) int[] local294 = arg1.anIntArrayArrayArray17[local147][local140];
						if (local294 != null && local176 != 0) {
							if (local176 == 1) {
								local311 = 0;
								while (local294.length > local311) {
									if (local294[local311++] != -1 && local294[local311++] != -1 && local294[local311++] != -1) {
										this.anInt4401 += 3;
									}
								}
							} else {
								this.anInt4401 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt4410 - this.anInt4403;
			}
		}
		if (this.anInt4401 > 0) {
			this.aClass221_9 = new Class221(Static488.method7100(this.anInt4401));
			this.anInterface6_6 = this.aClass7_Sub1_10.method5726(false);
			this.anInterface6_6.method7932(this.anInt4401);
			@Pc(406) NativeHeapBuffer local406 = this.aClass7_Sub1_10.method5725(this.anInt4401 * 16, false);
			this.aStream5 = new Stream(local406);
			while (true) {
				@Pc(418) Buffer local418;
				do {
					local418 = this.anInterface6_6.method7935();
				} while (local418 == null);
				this.aStream4 = new Stream(local418);
				local193 = 0;
				local122 = 0;
				for (local311 = this.anInt4402; local311 <= this.anInt4411; local311++) {
					if (local311 >= 0 && arg1.anInt10327 > local311) {
						@Pc(450) int local450 = 0;
						for (@Pc(453) int local453 = this.anInt4403; local453 <= this.anInt4410; local453++) {
							if (local453 >= 0 && local453 < arg1.anInt10330) {
								@Pc(468) int local468 = arg3[local122];
								@Pc(475) int[] local475 = arg1.anIntArrayArrayArray17[local453][local311];
								if (local475 != null && local468 != 0) {
									if (local468 == 1) {
										@Pc(494) int[] local494 = arg1.anIntArrayArrayArray19[local453][local311];
										@Pc(501) int[] local501 = arg1.anIntArrayArrayArray18[local453][local311];
										@Pc(503) int local503 = 0;
										label119: while (true) {
											while (true) {
												if (local503 >= local475.length) {
													break label119;
												}
												if (local475[local503] == -1 || local475[local503 + 1] == -1 || local475[local503 + 2] == -1) {
													local503 += 3;
												} else {
													this.method3405(local311, local193, local453, local501[local503], local494[local503], local450);
													local503++;
													this.method3405(local311, local193, local453, local501[local503], local494[local503], local450);
													local503++;
													this.method3405(local311, local193, local453, local501[local503], local494[local503], local450);
													local503++;
												}
											}
										}
									} else if (local468 == 3) {
										this.method3405(local311, local193, local453, 0, 0, local450);
										this.method3405(local311, local193, local453, 0, arg1.anInt10333, local450);
										this.method3405(local311, local193, local453, arg1.anInt10333, 0, local450);
									} else if (local468 == 2) {
										this.method3405(local311, local193, local453, 0, arg1.anInt10333, local450);
										this.method3405(local311, local193, local453, arg1.anInt10333, arg1.anInt10333, local450);
										this.method3405(local311, local193, local453, 0, 0, local450);
									} else if (local468 == 5) {
										this.method3405(local311, local193, local453, arg1.anInt10333, arg1.anInt10333, local450);
										this.method3405(local311, local193, local453, arg1.anInt10333, 0, local450);
										this.method3405(local311, local193, local453, 0, arg1.anInt10333, local450);
									} else if (local468 == 4) {
										this.method3405(local311, local193, local453, arg1.anInt10333, 0, local450);
										this.method3405(local311, local193, local453, 0, 0, local450);
										this.method3405(local311, local193, local453, arg1.anInt10333, arg1.anInt10333, local450);
									}
								}
							}
							local450++;
							local122++;
						}
					} else {
						local122 += this.anInt4410 - this.anInt4403;
					}
					local193++;
				}
				this.aStream4.a();
				if (this.anInterface6_6.method7936()) {
					this.aStream5.a();
					this.anInterface24_8 = this.aClass7_Sub1_10.method5704(false);
					this.anInterface24_8.method6548(16, local406, this.anInt4405 * 16);
					break;
				}
				this.aStream5.b(0);
				this.aClass221_9.method5078();
			}
		} else {
			this.anInterface6_6 = null;
			this.anInterface24_8 = null;
		}
		this.aStream5 = null;
		this.aClass221_9 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray9 = this.aFloatArrayArray8 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(SI)V")
	private void method3401(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream4.d(arg0);
		} else {
			this.aStream4.e(arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBII[[Z)V")
	public void method3403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface6_6 == null || (this.anInt4403 > arg1 + arg2 || (this.anInt4410 < arg1 - arg2 || (this.anInt4402 > arg2 + arg0 || this.anInt4411 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(59) int local59 = this.anInt4402; local59 <= this.anInt4411; local59++) {
			for (@Pc(64) int local64 = this.anInt4403; local64 <= this.anInt4410; local64++) {
				@Pc(71) int local71 = local64 - arg1;
				@Pc(75) int local75 = local59 - arg0;
				if (local71 > -arg2 && arg2 > local71 && -arg2 < local75 && local75 < arg2 && arg3[arg2 + local71][arg2 + local75]) {
					this.aClass7_Sub1_10.method5656((byte) (this.aClass4_Sub3_3.method4955() * 255.0F));
					this.aClass7_Sub1_10.method5721(this.anInterface24_8, 0);
					this.aClass7_Sub1_10.method5754(this.aClass7_Sub1_10.aClass82_14);
					this.aClass7_Sub1_10.method5680(this.anInt4401 / 3, 0, this.anInt4405, this.anInterface6_6, Static409.aClass119_6, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIZII)V")
	private void method3405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass115_Sub2_1.anInt10331) + arg4;
		@Pc(23) int local23 = arg3 + (arg0 << this.aClass115_Sub2_1.anInt10331);
		@Pc(30) int local30 = this.aClass115_Sub2_1.method8064(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(58) Class4 local58 = this.aClass221_9.method5075(local7);
			if (local58 != null) {
				this.method3401(((Class4_Sub49) local58).aShort123);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt4405++;
		if (local7 != -1L) {
			this.aClass221_9.method5073(new Class4_Sub49(local76), local7);
		}
		@Pc(105) float local105;
		@Pc(112) float local112;
		@Pc(119) float local119;
		@Pc(196) float local196;
		@Pc(204) float local204;
		@Pc(211) float local211;
		@Pc(218) float local218;
		@Pc(225) float local225;
		@Pc(234) float local234;
		@Pc(243) float local243;
		@Pc(319) float local319;
		if (arg4 == 0 && arg3 == 0) {
			local105 = this.aFloatArrayArray7[arg5][arg1];
			local112 = this.aFloatArrayArray9[arg5][arg1];
			local119 = this.aFloatArrayArray8[arg5][arg1];
		} else if (this.aClass115_Sub2_1.anInt10333 == arg4 && arg3 == 0) {
			local119 = this.aFloatArrayArray8[arg5 + 1][arg1];
			local105 = this.aFloatArrayArray7[arg5 + 1][arg1];
			local112 = this.aFloatArrayArray9[arg5 + 1][arg1];
		} else if (this.aClass115_Sub2_1.anInt10333 == arg4 && arg3 == this.aClass115_Sub2_1.anInt10333) {
			local119 = this.aFloatArrayArray8[arg5 + 1][arg1 + 1];
			local112 = this.aFloatArrayArray9[arg5 + 1][arg1 + 1];
			local105 = this.aFloatArrayArray7[arg5 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg3 == this.aClass115_Sub2_1.anInt10333) {
			local105 = this.aFloatArrayArray7[arg5][arg1 + 1];
			local119 = this.aFloatArrayArray8[arg5][arg1 + 1];
			local112 = this.aFloatArrayArray9[arg5][arg1 + 1];
		} else {
			local196 = (float) arg4 / (float) this.aClass115_Sub2_1.anInt10333;
			local204 = (float) arg3 / (float) this.aClass115_Sub2_1.anInt10333;
			local211 = this.aFloatArrayArray7[arg5][arg1];
			local218 = this.aFloatArrayArray9[arg5][arg1];
			local225 = this.aFloatArrayArray8[arg5][arg1];
			local234 = this.aFloatArrayArray7[arg5 + 1][arg1];
			local243 = this.aFloatArrayArray9[arg5 + 1][arg1];
			@Pc(259) float local259 = local211 + (this.aFloatArrayArray7[arg5][arg1 + 1] - local211) * local196;
			@Pc(275) float local275 = local218 + (this.aFloatArrayArray9[arg5][arg1 + 1] - local218) * local196;
			@Pc(293) float local293 = local234 + local196 * (this.aFloatArrayArray7[arg5 + 1][arg1 + 1] - local234);
			@Pc(310) float local310 = local243 + (this.aFloatArrayArray9[arg5 + 1][arg1 + 1] - local243) * local196;
			local319 = this.aFloatArrayArray8[arg5 + 1][arg1];
			@Pc(335) float local335 = local225 + local196 * (this.aFloatArrayArray8[arg5][arg1 + 1] - local225);
			local112 = local275 + local204 * (local310 - local275);
			@Pc(360) float local360 = local319 + local196 * (this.aFloatArrayArray8[arg5 + 1][arg1 + 1] - local319);
			local105 = local259 + (local293 - local259) * local204;
			local119 = local335 + local204 * (local360 - local335);
		}
		local196 = this.aClass4_Sub3_3.method4954() - local15;
		local204 = this.aClass4_Sub3_3.method4953() - local30;
		local211 = this.aClass4_Sub3_3.method4949() - local23;
		local218 = (float) Math.sqrt((double) (local204 * local204 + local196 * local196 + local211 * local211));
		local225 = 1.0F / local218;
		local211 *= local225;
		local204 *= local225;
		local196 *= local225;
		local234 = local218 / (float) this.aClass4_Sub3_3.method4950();
		local243 = 1.0F - local234 * local234;
		if (local243 < 0.0F) {
			local243 = 0.0F;
		}
		local319 = local105 * local196 + local112 * local204 + local211 * local119;
		if (local319 < 0.0F) {
			local319 = 0.0F;
		}
		@Pc(538) float local538 = local243 * 2.0F * local319;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(549) int local549 = this.aClass4_Sub3_3.method4952();
		@Pc(559) int local559 = (int) ((float) (local549 >> 16 & 0xFF) * local538);
		if (local559 > 255) {
			local559 = 255;
		}
		@Pc(576) int local576 = (int) ((float) (local549 >> 8 & 0xFF) * local538);
		if (local576 > 255) {
			local576 = 255;
		}
		@Pc(591) int local591 = (int) ((float) (local549 & 0xFF) * local538);
		if (Stream.c()) {
			this.aStream5.b((float) local15);
			this.aStream5.b((float) local30);
			this.aStream5.b((float) local23);
		} else {
			this.aStream5.a((float) local15);
			this.aStream5.a((float) local30);
			this.aStream5.a((float) local23);
		}
		if (local591 > 255) {
			local591 = 255;
		}
		if (this.aClass7_Sub1_10.anInt7351 == 0) {
			this.aStream5.a(local591);
			this.aStream5.a(local576);
			this.aStream5.a(local559);
		} else {
			this.aStream5.a(local559);
			this.aStream5.a(local576);
			this.aStream5.a(local591);
		}
		this.aStream5.a(255);
		this.method3401(local76);
	}
}
