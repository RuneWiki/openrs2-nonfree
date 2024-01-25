import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	private int anInt5120;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_10;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "Lclient!ha;")
	private final Class52_Sub2 aClass52_Sub2_2;

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "Lclient!oj;")
	private final Class3_Sub30 aClass3_Sub30_2;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	private final int anInt5118;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
	private final int anInt5121;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	private final int anInt5119;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
	private final int anInt5115;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!kj", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "I")
	private int anInt5123;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "Lclient!cca;")
	private final Interface3 anInterface3_9;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "Lclient!nq;")
	private final Interface14 anInterface14_4;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "Lclient!sd;")
	private Class267 aClass267_21;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!tu;Lclient!ha;Lclient!oj;[I)V")
	public Class3_Sub25(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class52_Sub2 arg1, @OriginalArg(2) Class3_Sub30 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub3_10 = arg0;
		this.aClass52_Sub2_2 = arg1;
		this.aClass3_Sub30_2 = arg2;
		@Pc(22) int local22 = this.aClass3_Sub30_2.method5387() - (arg1.anInt9493 >> 1);
		this.anInt5118 = this.aClass3_Sub30_2.method5386() - local22 >> arg1.anInt9494;
		this.anInt5121 = this.aClass3_Sub30_2.method5386() + local22 >> arg1.anInt9494;
		this.anInt5119 = this.aClass3_Sub30_2.method5388() - local22 >> arg1.anInt9494;
		this.anInt5115 = local22 + this.aClass3_Sub30_2.method5388() >> arg1.anInt9494;
		@Pc(78) int local78 = this.anInt5121 + 1 - this.anInt5118;
		@Pc(87) int local87 = this.anInt5115 + 1 - this.anInt5119;
		this.aFloatArrayArray9 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray10 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray11 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(175) int local175;
		@Pc(190) int local190;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = local116 + this.anInt5119;
			if (local123 > 0 && local123 < this.aClass52_Sub2_2.anInt9492 - 1) {
				for (local138 = 0; local138 <= local78; local138++) {
					local145 = local138 + this.anInt5118;
					if (local145 > 0 && local145 < this.aClass52_Sub2_2.anInt9491 - 1) {
						local175 = arg1.JA(local145 + 1, local123) - arg1.JA(local145 - 1, local123);
						local190 = arg1.JA(local145, local123 + 1) - arg1.JA(local145, local123 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + local190 * local190 + 65536)));
						this.aFloatArrayArray11[local138][local116] = (float) local175 * local206;
						this.aFloatArrayArray9[local138][local116] = local206 * -256.0F;
						this.aFloatArrayArray10[local138][local116] = (float) local190 * local206;
					}
				}
			}
		}
		local123 = 0;
		@Pc(299) int local299;
		for (local138 = this.anInt5119; local138 <= this.anInt5115; local138++) {
			if (local138 >= 0 && arg1.anInt9492 > local138) {
				for (local145 = this.anInt5118; local145 <= this.anInt5121; local145++) {
					if (local145 >= 0 && arg1.anInt9491 > local145) {
						local175 = arg3[local123];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray7[local145][local138];
						if (local290 != null && local175 != 0) {
							if (local175 == 1) {
								local299 = 0;
								while (local299 < local290.length) {
									if (local290[local299++] != -1 && local290[local299++] != -1 && local290[local299++] != -1) {
										this.anInt5123 += 3;
									}
								}
							} else {
								this.anInt5123 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt5121 - this.anInt5118;
			}
		}
		if (this.anInt5123 <= 0) {
			this.anInterface3_9 = null;
			this.anInterface14_4 = null;
		} else {
			this.aClass267_21 = new Class267(Static483.method7134(this.anInt5123));
			this.anInterface14_4 = this.aClass5_Sub3_10.method6325(false);
			this.anInterface14_4.method3137(this.anInt5123);
			@Pc(411) NativeHeapBuffer local411 = this.aClass5_Sub3_10.method6421(false, this.anInt5123 * 16);
			this.aStream4 = new Stream(local411);
			while (true) {
				@Pc(423) Buffer local423;
				do {
					local423 = this.anInterface14_4.method3136();
				} while (local423 == null);
				this.aStream5 = new Stream(local423);
				local123 = 0;
				local190 = 0;
				for (local299 = this.anInt5119; local299 <= this.anInt5115; local299++) {
					if (local299 >= 0 && local299 < arg1.anInt9492) {
						@Pc(463) int local463 = 0;
						for (@Pc(466) int local466 = this.anInt5118; local466 <= this.anInt5121; local466++) {
							if (local466 >= 0 && local466 < arg1.anInt9491) {
								@Pc(485) int local485 = arg3[local123];
								@Pc(492) int[] local492 = arg1.anIntArrayArrayArray7[local466][local299];
								if (local492 != null && local485 != 0) {
									if (local485 == 1) {
										@Pc(506) int[] local506 = arg1.anIntArrayArrayArray12[local466][local299];
										@Pc(513) int[] local513 = arg1.anIntArrayArrayArray11[local466][local299];
										@Pc(515) int local515 = 0;
										label120: while (true) {
											while (true) {
												if (local515 >= local492.length) {
													break label120;
												}
												if (local492[local515] == -1 || local492[local515 + 1] == -1 || local492[local515 + 2] == -1) {
													local515 += 3;
												} else {
													this.method4296(local506[local515], local513[local515], local466, local190, local463, local299);
													local515++;
													this.method4296(local506[local515], local513[local515], local466, local190, local463, local299);
													local515++;
													this.method4296(local506[local515], local513[local515], local466, local190, local463, local299);
													local515++;
												}
											}
										}
									} else if (local485 == 3) {
										this.method4296(0, 0, local466, local190, local463, local299);
										this.method4296(arg1.anInt9493, 0, local466, local190, local463, local299);
										this.method4296(0, arg1.anInt9493, local466, local190, local463, local299);
									} else if (local485 == 2) {
										this.method4296(arg1.anInt9493, 0, local466, local190, local463, local299);
										this.method4296(arg1.anInt9493, arg1.anInt9493, local466, local190, local463, local299);
										this.method4296(0, 0, local466, local190, local463, local299);
									} else if (local485 == 5) {
										this.method4296(arg1.anInt9493, arg1.anInt9493, local466, local190, local463, local299);
										this.method4296(0, arg1.anInt9493, local466, local190, local463, local299);
										this.method4296(arg1.anInt9493, 0, local466, local190, local463, local299);
									} else if (local485 == 4) {
										this.method4296(0, arg1.anInt9493, local466, local190, local463, local299);
										this.method4296(0, 0, local466, local190, local463, local299);
										this.method4296(arg1.anInt9493, arg1.anInt9493, local466, local190, local463, local299);
									}
								}
							}
							local123++;
							local463++;
						}
					} else {
						local123 += this.anInt5121 - this.anInt5118;
					}
					local190++;
				}
				this.aStream5.a();
				if (this.anInterface14_4.method3135()) {
					this.aStream4.a();
					this.anInterface3_9 = this.aClass5_Sub3_10.method6422(false);
					this.anInterface3_9.method2578(local411, 16, this.anInt5120 * 16);
					break;
				}
				this.aStream4.e(0);
				this.aClass267_21.method6648();
			}
		}
		this.aClass267_21 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray9 = this.aFloatArrayArray10 = null;
		this.aStream4 = null;
		this.aStream5 = null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIII)V")
	private void method4296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg0 + (arg2 << this.aClass52_Sub2_2.anInt9494);
		@Pc(25) int local25 = arg1 + (arg5 << this.aClass52_Sub2_2.anInt9494);
		@Pc(31) int local31 = this.aClass52_Sub2_2.sa(local16, local25);
		if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = ((long) local25 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(57) Class3 local57 = this.aClass267_21.method6644(local7);
			if (local57 != null) {
				this.method4297(((Class3_Sub18) local57).aShort44);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt5120++;
		if (local7 != -1L) {
			this.aClass267_21.method6640(new Class3_Sub18(local75), local7);
		}
		@Pc(290) float local290;
		@Pc(281) float local281;
		@Pc(315) float local315;
		@Pc(136) float local136;
		@Pc(144) float local144;
		@Pc(151) float local151;
		@Pc(158) float local158;
		@Pc(165) float local165;
		@Pc(174) float local174;
		@Pc(183) float local183;
		@Pc(240) float local240;
		if (arg0 == 0 && arg1 == 0) {
			local315 = this.aFloatArrayArray10[arg4][arg3];
			local290 = this.aFloatArrayArray11[arg4][arg3];
			local281 = this.aFloatArrayArray9[arg4][arg3];
		} else if (arg0 == this.aClass52_Sub2_2.anInt9493 && arg1 == 0) {
			local290 = this.aFloatArrayArray11[arg4 + 1][arg3];
			local281 = this.aFloatArrayArray9[arg4 + 1][arg3];
			local315 = this.aFloatArrayArray10[arg4 + 1][arg3];
		} else if (this.aClass52_Sub2_2.anInt9493 == arg0 && this.aClass52_Sub2_2.anInt9493 == arg1) {
			local290 = this.aFloatArrayArray11[arg4 + 1][arg3 + 1];
			local281 = this.aFloatArrayArray9[arg4 + 1][arg3 + 1];
			local315 = this.aFloatArrayArray10[arg4 + 1][arg3 + 1];
		} else if (arg0 == 0 && arg1 == this.aClass52_Sub2_2.anInt9493) {
			local315 = this.aFloatArrayArray10[arg4][arg3 + 1];
			local281 = this.aFloatArrayArray9[arg4][arg3 + 1];
			local290 = this.aFloatArrayArray11[arg4][arg3 + 1];
		} else {
			local136 = (float) arg0 / (float) this.aClass52_Sub2_2.anInt9493;
			local144 = (float) arg1 / (float) this.aClass52_Sub2_2.anInt9493;
			local151 = this.aFloatArrayArray11[arg4][arg3];
			local158 = this.aFloatArrayArray9[arg4][arg3];
			local165 = this.aFloatArrayArray10[arg4][arg3];
			local174 = this.aFloatArrayArray11[arg4 + 1][arg3];
			local183 = this.aFloatArrayArray9[arg4 + 1][arg3];
			@Pc(200) float local200 = local174 + local136 * (this.aFloatArrayArray11[arg4 + 1][arg3 + 1] - local174);
			@Pc(215) float local215 = local158 + local136 * (this.aFloatArrayArray9[arg4][arg3 + 1] - local158);
			@Pc(231) float local231 = local151 + local136 * (this.aFloatArrayArray11[arg4][arg3 + 1] - local151);
			local240 = this.aFloatArrayArray10[arg4 + 1][arg3];
			@Pc(255) float local255 = local165 + (this.aFloatArrayArray10[arg4][arg3 + 1] - local165) * local136;
			@Pc(273) float local273 = local183 + (this.aFloatArrayArray9[arg4 + 1][arg3 + 1] - local183) * local136;
			local281 = local215 + (local273 - local215) * local144;
			local290 = local231 + (local200 - local231) * local144;
			@Pc(307) float local307 = local240 + (this.aFloatArrayArray10[arg4 + 1][arg3 + 1] - local240) * local136;
			local315 = local255 + local144 * (local307 - local255);
		}
		local136 = this.aClass3_Sub30_2.method5386() - local16;
		local144 = this.aClass3_Sub30_2.method5390() - local31;
		local151 = this.aClass3_Sub30_2.method5388() - local25;
		local158 = (float) Math.sqrt((double) (local136 * local136 + local144 * local144 + local151 * local151));
		local165 = 1.0F / local158;
		local136 *= local165;
		local151 *= local165;
		local144 *= local165;
		local174 = local158 / (float) this.aClass3_Sub30_2.method5387();
		local183 = 1.0F - local174 * local174;
		if (local183 < 0.0F) {
			local183 = 0.0F;
		}
		local240 = local315 * local151 + local281 * local144 + local136 * local290;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		@Pc(534) float local534 = local240 * 2.0F * local183;
		if (local534 > 1.0F) {
			local534 = 1.0F;
		}
		@Pc(545) int local545 = this.aClass3_Sub30_2.method5391();
		@Pc(561) int local561 = (int) (local534 * (float) (local545 >> 16 & 0xFF));
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(578) int local578 = (int) ((float) (local545 >> 8 & 0xFF) * local534);
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(591) int local591 = (int) (local534 * (float) (local545 & 0xFF));
		if (local591 > 255) {
			local591 = 255;
		}
		if (Stream.c()) {
			this.aStream4.a((float) local16);
			this.aStream4.a((float) local31);
			this.aStream4.a((float) local25);
		} else {
			this.aStream4.b((float) local16);
			this.aStream4.b((float) local31);
			this.aStream4.b((float) local25);
		}
		if (this.aClass5_Sub3_10.anInt7747 == 0) {
			this.aStream4.a(local591);
			this.aStream4.a(local578);
			this.aStream4.a(local561);
		} else {
			this.aStream4.a(local561);
			this.aStream4.a(local578);
			this.aStream4.a(local591);
		}
		this.aStream4.a(255);
		this.method4297(local75);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BS)V")
	private void method4297(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream5.c(arg0);
		} else {
			this.aStream5.b(arg0);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIII[[Z)V")
	public void method4298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface14_4 == null || (this.anInt5118 > arg1 + arg2 || (arg2 - arg1 > this.anInt5121 || (this.anInt5119 > arg0 + arg1 || arg0 - arg1 > this.anInt5115)))) {
			return;
		}
		for (@Pc(61) int local61 = this.anInt5119; local61 <= this.anInt5115; local61++) {
			for (@Pc(66) int local66 = this.anInt5118; local66 <= this.anInt5121; local66++) {
				@Pc(73) int local73 = local66 - arg2;
				@Pc(78) int local78 = local61 - arg0;
				if (-arg1 < local73 && local73 < arg1 && local78 > -arg1 && arg1 > local78 && arg3[local73 + arg1][local78 + arg1]) {
					this.aClass5_Sub3_10.method6377((byte) (this.aClass3_Sub30_2.method5382() * 255.0F));
					this.aClass5_Sub3_10.method6382(this.anInterface3_9, 0);
					this.aClass5_Sub3_10.method6333(this.aClass5_Sub3_10.aClass76_17);
					this.aClass5_Sub3_10.method6295(0, this.anInt5123 / 3, this.anInt5120, 0, Static524.aClass87_7, this.anInterface14_4);
					return;
				}
			}
		}
	}
}
