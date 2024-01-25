import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "Lclient!vj;")
	private final Class3_Sub16 aClass3_Sub16_1;

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_1;

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "Lclient!tla;")
	private final Class313_Sub2 aClass313_Sub2_1;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
	private final int anInt174;

	@OriginalMember(owner = "client!aga", name = "D", descriptor = "I")
	private final int anInt175;

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
	private final int anInt165;

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
	private final int anInt171;

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "Lclient!gn;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!aga", name = "t", descriptor = "Lclient!fh;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!aga", name = "o", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "Lclient!lq;")
	private final Interface16 anInterface16_1;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!nb;Lclient!tla;Lclient!vj;[I)V")
	public Class3_Sub6(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) Class313_Sub2 arg1, @OriginalArg(2) Class3_Sub16 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub16_1 = arg2;
		this.aClass67_Sub1_1 = arg0;
		this.aClass313_Sub2_1 = arg1;
		@Pc(22) int local22 = this.aClass3_Sub16_1.method6324() - (arg1.anInt10871 >> 1);
		this.anInt174 = this.aClass3_Sub16_1.method6323() - local22 >> arg1.anInt10873;
		this.anInt175 = local22 + this.aClass3_Sub16_1.method6323() >> arg1.anInt10873;
		this.anInt165 = this.aClass3_Sub16_1.method6320() - local22 >> arg1.anInt10873;
		this.anInt171 = this.aClass3_Sub16_1.method6320() + local22 >> arg1.anInt10873;
		@Pc(76) int local76 = this.anInt175 + 1 - this.anInt174;
		@Pc(85) int local85 = this.anInt171 + 1 - this.anInt165;
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray2 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray1 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(180) int local180;
		@Pc(197) int local197;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt165;
			if (local121 > 0 && this.aClass313_Sub2_1.anInt10872 - 1 > local121) {
				for (local138 = 0; local138 <= local76; local138++) {
					local145 = this.anInt174 + local138;
					if (local145 > 0 && this.aClass313_Sub2_1.anInt10875 - 1 > local145) {
						local180 = arg1.method9095(local121, local145 + 1) - arg1.method9095(local121, local145 - 1);
						local197 = arg1.method9095(local121 + 1, local145) - arg1.method9095(local121 - 1, local145);
						@Pc(212) float local212 = (float) (1.0D / Math.sqrt((double) (local180 * local180 + local197 * local197 + 65536)));
						this.aFloatArrayArray1[local138][local114] = (float) local180 * local212;
						this.aFloatArrayArray3[local138][local114] = local212 * -256.0F;
						this.aFloatArrayArray2[local138][local114] = local212 * (float) local197;
					}
				}
			}
		}
		local121 = 0;
		@Pc(334) int local334;
		for (local138 = this.anInt165; local138 <= this.anInt171; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt10872) {
				for (local145 = this.anInt174; local145 <= this.anInt175; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt10875) {
						local180 = arg3[local121];
						@Pc(306) int[] local306 = arg1.anIntArrayArrayArray9[local145][local138];
						if (local306 != null && local180 != 0) {
							if (local180 == 1) {
								local334 = 0;
								while (local334 < local306.length) {
									if (local306[local334++] != -1 && local306[local334++] != -1 && local306[local334++] != -1) {
										this.anInt170 += 3;
									}
								}
							} else {
								this.anInt170 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt175 - this.anInt174;
			}
		}
		if (this.anInt170 > 0) {
			this.aClass136_1 = new Class136(Static60.method735(this.anInt170));
			this.anInterface5_1 = this.aClass67_Sub1_1.method5684(false);
			this.anInterface5_1.method9248(this.anInt170);
			@Pc(442) NativeHeapBuffer local442 = this.aClass67_Sub1_1.method5594(false, this.anInt170 * 16);
			this.aStream1 = new Stream(local442);
			while (true) {
				@Pc(454) Buffer local454;
				do {
					local454 = this.anInterface5_1.method9252();
				} while (local454 == null);
				this.aStream2 = new Stream(local454);
				local197 = 0;
				local121 = 0;
				for (local334 = this.anInt165; local334 <= this.anInt171; local334++) {
					if (local334 >= 0 && arg1.anInt10872 > local334) {
						@Pc(487) int local487 = 0;
						for (@Pc(490) int local490 = this.anInt174; local490 <= this.anInt175; local490++) {
							if (local490 >= 0 && local490 < arg1.anInt10875) {
								@Pc(513) int local513 = arg3[local121];
								@Pc(520) int[] local520 = arg1.anIntArrayArrayArray9[local490][local334];
								if (local520 != null && local513 != 0) {
									if (local513 == 1) {
										@Pc(540) int[] local540 = arg1.anIntArrayArrayArray14[local490][local334];
										@Pc(547) int[] local547 = arg1.anIntArrayArrayArray12[local490][local334];
										@Pc(549) int local549 = 0;
										label120: while (true) {
											while (true) {
												if (local549 >= local520.length) {
													break label120;
												}
												if (local520[local549] == -1 || local520[local549 + 1] == -1 || local520[local549 + 2] == -1) {
													local549 += 3;
												} else {
													this.method167(local487, local197, local490, local334, local540[local549], local547[local549]);
													local549++;
													this.method167(local487, local197, local490, local334, local540[local549], local547[local549]);
													local549++;
													this.method167(local487, local197, local490, local334, local540[local549], local547[local549]);
													local549++;
												}
											}
										}
									} else if (local513 == 3) {
										this.method167(local487, local197, local490, local334, 0, 0);
										this.method167(local487, local197, local490, local334, arg1.anInt10871, 0);
										this.method167(local487, local197, local490, local334, 0, arg1.anInt10871);
									} else if (local513 == 2) {
										this.method167(local487, local197, local490, local334, arg1.anInt10871, 0);
										this.method167(local487, local197, local490, local334, arg1.anInt10871, arg1.anInt10871);
										this.method167(local487, local197, local490, local334, 0, 0);
									} else if (local513 == 5) {
										this.method167(local487, local197, local490, local334, arg1.anInt10871, arg1.anInt10871);
										this.method167(local487, local197, local490, local334, 0, arg1.anInt10871);
										this.method167(local487, local197, local490, local334, arg1.anInt10871, 0);
									} else if (local513 == 4) {
										this.method167(local487, local197, local490, local334, 0, arg1.anInt10871);
										this.method167(local487, local197, local490, local334, 0, 0);
										this.method167(local487, local197, local490, local334, arg1.anInt10871, arg1.anInt10871);
									}
								}
							}
							local487++;
							local121++;
						}
					} else {
						local121 += this.anInt175 - this.anInt174;
					}
					local197++;
				}
				this.aStream2.a();
				if (this.anInterface5_1.method9250()) {
					this.aStream1.a();
					this.anInterface16_1 = this.aClass67_Sub1_1.method5649(false);
					this.anInterface16_1.method7125(local442, 16, this.anInt166 * 16);
					break;
				}
				this.aStream1.e(0);
				this.aClass136_1.method3505();
			}
		} else {
			this.anInterface16_1 = null;
			this.anInterface5_1 = null;
		}
		this.aFloatArrayArray1 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aStream1 = null;
		this.aClass136_1 = null;
		this.aStream2 = null;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(BS)V")
	private void method163(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream2.b(arg0);
		} else {
			this.aStream2.d(arg0);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[[ZII)V")
	public void method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface5_1 == null || (arg3 + arg1 < this.anInt174 || (this.anInt175 < arg3 - arg1 || (this.anInt165 > arg1 + arg0 || this.anInt171 < arg0 - arg1)))) {
			return;
		}
		for (@Pc(66) int local66 = this.anInt165; local66 <= this.anInt171; local66++) {
			for (@Pc(71) int local71 = this.anInt174; local71 <= this.anInt175; local71++) {
				@Pc(78) int local78 = local71 - arg3;
				@Pc(83) int local83 = local66 - arg0;
				if (-arg1 < local78 && arg1 > local78 && local83 > -arg1 && local83 < arg1 && arg2[local78 + arg1][local83 + arg1]) {
					this.aClass67_Sub1_1.method5637((byte) (int) (this.aClass3_Sub16_1.method6326() * 255.0F));
					this.aClass67_Sub1_1.method5620(this.anInterface16_1, 0);
					this.aClass67_Sub1_1.method5569(this.aClass67_Sub1_1.aClass212_19);
					this.aClass67_Sub1_1.method5659(this.anInterface5_1, 0, this.anInt166, this.anInt170 / 3, 0, Static508.aClass281_7);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIZIIII)V")
	private void method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass313_Sub2_1.anInt10873) + arg4;
		@Pc(24) int local24 = arg5 + (arg3 << this.aClass313_Sub2_1.anInt10873);
		@Pc(31) int local31 = this.aClass313_Sub2_1.method9096(local15, local24);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(64) Class3 local64 = this.aClass136_1.method3503(local7);
			if (local64 != null) {
				this.method163(((Class3_Sub40) local64).aShort116);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt166++;
		if (local7 != -1L) {
			this.aClass136_1.method3508(local7, new Class3_Sub40(local83));
		}
		@Pc(151) float local151;
		@Pc(162) float local162;
		@Pc(173) float local173;
		@Pc(226) float local226;
		@Pc(234) float local234;
		@Pc(241) float local241;
		@Pc(248) float local248;
		@Pc(255) float local255;
		@Pc(264) float local264;
		@Pc(273) float local273;
		@Pc(330) float local330;
		if (arg4 == 0 && arg5 == 0) {
			local151 = this.aFloatArrayArray1[arg0][arg1];
			local162 = this.aFloatArrayArray3[arg0][arg1];
			local173 = this.aFloatArrayArray2[arg0][arg1];
		} else if (arg4 == this.aClass313_Sub2_1.anInt10871 && arg5 == 0) {
			local151 = this.aFloatArrayArray1[arg0 + 1][arg1];
			local173 = this.aFloatArrayArray2[arg0 + 1][arg1];
			local162 = this.aFloatArrayArray3[arg0 + 1][arg1];
		} else if (arg4 == this.aClass313_Sub2_1.anInt10871 && arg5 == this.aClass313_Sub2_1.anInt10871) {
			local151 = this.aFloatArrayArray1[arg0 + 1][arg1 + 1];
			local162 = this.aFloatArrayArray3[arg0 + 1][arg1 + 1];
			local173 = this.aFloatArrayArray2[arg0 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass313_Sub2_1.anInt10871) {
			local151 = this.aFloatArrayArray1[arg0][arg1 + 1];
			local173 = this.aFloatArrayArray2[arg0][arg1 + 1];
			local162 = this.aFloatArrayArray3[arg0][arg1 + 1];
		} else {
			local226 = (float) arg4 / (float) this.aClass313_Sub2_1.anInt10871;
			local234 = (float) arg5 / (float) this.aClass313_Sub2_1.anInt10871;
			local241 = this.aFloatArrayArray1[arg0][arg1];
			local248 = this.aFloatArrayArray3[arg0][arg1];
			local255 = this.aFloatArrayArray2[arg0][arg1];
			local264 = this.aFloatArrayArray1[arg0 + 1][arg1];
			local273 = this.aFloatArrayArray3[arg0 + 1][arg1];
			@Pc(289) float local289 = local248 + local226 * (this.aFloatArrayArray3[arg0][arg1 + 1] - local248);
			@Pc(305) float local305 = local255 + (this.aFloatArrayArray2[arg0][arg1 + 1] - local255) * local226;
			@Pc(321) float local321 = local241 + (this.aFloatArrayArray1[arg0][arg1 + 1] - local241) * local226;
			local330 = this.aFloatArrayArray2[arg0 + 1][arg1];
			@Pc(348) float local348 = local264 + (this.aFloatArrayArray1[arg0 + 1][arg1 + 1] - local264) * local226;
			@Pc(365) float local365 = local273 + (this.aFloatArrayArray3[arg0 + 1][arg1 + 1] - local273) * local226;
			@Pc(383) float local383 = local330 + (this.aFloatArrayArray2[arg0 + 1][arg1 + 1] - local330) * local226;
			local162 = local289 + (local365 - local289) * local234;
			local151 = local321 + (local348 - local321) * local234;
			local173 = local305 + local234 * (local383 - local305);
		}
		local226 = (float) (this.aClass3_Sub16_1.method6323() - local15);
		local234 = (float) (this.aClass3_Sub16_1.method6322() - local31);
		local241 = (float) (this.aClass3_Sub16_1.method6320() - local24);
		local248 = (float) Math.sqrt((double) (local241 * local241 + local234 * local234 + local226 * local226));
		local255 = 1.0F / local248;
		local234 *= local255;
		local241 *= local255;
		local226 *= local255;
		local264 = local248 / (float) this.aClass3_Sub16_1.method6324();
		local273 = 1.0F - local264 * local264;
		if (local273 < 0.0F) {
			local273 = 0.0F;
		}
		local330 = local151 * local226 + local234 * local162 + local241 * local173;
		if (local330 < 0.0F) {
			local330 = 0.0F;
		}
		@Pc(561) float local561 = local330 * local273 * 2.0F;
		if (local561 > 1.0F) {
			local561 = 1.0F;
		}
		@Pc(572) int local572 = this.aClass3_Sub16_1.method6325();
		@Pc(590) int local590 = (int) (local561 * (float) (local572 >> 16 & 0xFF));
		if (local590 > 255) {
			local590 = 255;
		}
		@Pc(605) int local605 = (int) ((float) (local572 >> 8 & 0xFF) * local561);
		if (local605 > 255) {
			local605 = 255;
		}
		@Pc(620) int local620 = (int) (local561 * (float) (local572 & 0xFF));
		if (Stream.b()) {
			this.aStream1.a((float) local15);
			this.aStream1.a((float) local31);
			this.aStream1.a((float) local24);
		} else {
			this.aStream1.b((float) local15);
			this.aStream1.b((float) local31);
			this.aStream1.b((float) local24);
		}
		if (local620 > 255) {
			local620 = 255;
		}
		if (this.aClass67_Sub1_1.anInt6670 == 0) {
			this.aStream1.f(local620);
			this.aStream1.f(local605);
			this.aStream1.f(local590);
		} else {
			this.aStream1.f(local590);
			this.aStream1.f(local605);
			this.aStream1.f(local620);
		}
		this.aStream1.f(255);
		this.method163(local83);
	}
}
