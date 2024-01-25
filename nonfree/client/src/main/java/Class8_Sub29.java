import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class8_Sub29 extends Class8 {

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
	private int anInt5368;

	@OriginalMember(owner = "client!iw", name = "x", descriptor = "Lclient!ada;")
	private final Class8_Sub1 aClass8_Sub1_2;

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_22;

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "Lclient!eo;")
	private final Class86_Sub1 aClass86_Sub1_1;

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "I")
	private final int anInt5374;

	@OriginalMember(owner = "client!iw", name = "y", descriptor = "I")
	private final int anInt5370;

	@OriginalMember(owner = "client!iw", name = "A", descriptor = "I")
	private final int anInt5372;

	@OriginalMember(owner = "client!iw", name = "z", descriptor = "I")
	private final int anInt5371;

	@OriginalMember(owner = "client!iw", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!iw", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
	private int anInt5373;

	@OriginalMember(owner = "client!iw", name = "q", descriptor = "Lclient!pw;")
	private final Class268 aClass268_5;

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "Lclient!id;")
	private final Interface9 anInterface9_2;

	@OriginalMember(owner = "client!iw", name = "u", descriptor = "Lclient!pw;")
	private final Class268 aClass268_6;

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "Lclient!tv;")
	private final Interface23 anInterface23_1;

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "Lclient!ig;")
	private Class8_Sub8 aClass8_Sub8_6;

	@OriginalMember(owner = "client!iw", name = "w", descriptor = "Lclient!bs;")
	private Class8_Sub8_Sub1 aClass8_Sub8_Sub1_1;

	@OriginalMember(owner = "client!iw", name = "K", descriptor = "Lclient!pfa;")
	private Class253 aClass253_17;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!nv;Lclient!eo;Lclient!ada;[I)V")
	public Class8_Sub29(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class86_Sub1 arg1, @OriginalArg(2) Class8_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass8_Sub1_2 = arg2;
		this.aClass16_Sub3_22 = arg0;
		this.aClass86_Sub1_1 = arg1;
		@Pc(23) int local23 = this.aClass8_Sub1_2.method5200() - (arg1.anInt9958 >> 1);
		this.anInt5374 = this.aClass8_Sub1_2.method5206() - local23 >> arg1.anInt9954;
		this.anInt5370 = local23 + this.aClass8_Sub1_2.method5206() >> arg1.anInt9954;
		this.anInt5372 = this.aClass8_Sub1_2.method5207() - local23 >> arg1.anInt9954;
		this.anInt5371 = this.aClass8_Sub1_2.method5207() + local23 >> arg1.anInt9954;
		@Pc(79) int local79 = this.anInt5370 + 1 - this.anInt5374;
		@Pc(88) int local88 = this.anInt5371 + 1 - this.anInt5372;
		this.aFloatArrayArray13 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray11 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray12 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(174) int local174;
		@Pc(191) int local191;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = this.anInt5372 + local117;
			if (local124 > 0 && this.aClass86_Sub1_1.anInt9953 - 1 > local124) {
				for (local138 = 0; local138 <= local79; local138++) {
					local145 = local138 + this.anInt5374;
					if (local145 > 0 && this.aClass86_Sub1_1.anInt9955 - 1 > local145) {
						local174 = arg1.method8086(local124, local145 + 1) - arg1.method8086(local124, local145 - 1);
						local191 = arg1.method8086(local124 + 1, local145) - arg1.method8086(local124 - 1, local145);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local191 * local191 + local174 * local174 + 65536)));
						this.aFloatArrayArray11[local138][local117] = (float) local174 * local206;
						this.aFloatArrayArray12[local138][local117] = local206 * -256.0F;
						this.aFloatArrayArray13[local138][local117] = (float) local191 * local206;
					}
				}
			}
		}
		local124 = 0;
		@Pc(313) int local313;
		for (local138 = this.anInt5372; local138 <= this.anInt5371; local138++) {
			if (local138 >= 0 && arg1.anInt9953 > local138) {
				for (local145 = this.anInt5374; local145 <= this.anInt5370; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt9955) {
						local174 = arg3[local124];
						@Pc(296) int[] local296 = arg1.anIntArrayArrayArray7[local145][local138];
						if (local296 != null && local174 != 0) {
							if (local174 == 1) {
								local313 = 0;
								while (local313 < local296.length) {
									if (local296[local313++] != -1 && local296[local313++] != -1 && local296[local313++] != -1) {
										this.anInt5373 += 3;
									}
								}
							} else {
								this.anInt5373 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt5370 - this.anInt5374;
			}
		}
		if (this.anInt5373 <= 0) {
			this.aClass268_5 = null;
			this.anInterface9_2 = null;
			this.aClass268_6 = null;
			this.anInterface23_1 = null;
		} else {
			this.aClass8_Sub8_6 = new Class8_Sub8(this.anInt5373 * 2);
			this.aClass8_Sub8_Sub1_1 = new Class8_Sub8_Sub1(this.anInt5373 * 16);
			this.aClass253_17 = new Class253(Static629.method8469(this.anInt5373));
			local145 = 0;
			local124 = 0;
			for (local174 = this.anInt5372; local174 <= this.anInt5371; local174++) {
				if (local174 >= 0 && local174 < arg1.anInt9953) {
					local191 = 0;
					for (local313 = this.anInt5374; local313 <= this.anInt5370; local313++) {
						if (local313 >= 0 && local313 < arg1.anInt9955) {
							@Pc(451) int local451 = arg3[local124];
							@Pc(458) int[] local458 = arg1.anIntArrayArrayArray7[local313][local174];
							if (local458 != null && local451 != 0) {
								if (local451 == 1) {
									@Pc(477) int[] local477 = arg1.anIntArrayArrayArray2[local313][local174];
									@Pc(484) int[] local484 = arg1.anIntArrayArrayArray4[local313][local174];
									@Pc(486) int local486 = 0;
									label105: while (true) {
										while (true) {
											if (local486 >= local458.length) {
												break label105;
											}
											if (local458[local486] == -1 || local458[local486 + 1] == -1 || local458[local486 + 2] == -1) {
												local486 += 3;
											} else {
												this.method4383(local145, local313, local484[local486], local174, local191, local477[local486]);
												local486++;
												this.method4383(local145, local313, local484[local486], local174, local191, local477[local486]);
												local486++;
												this.method4383(local145, local313, local484[local486], local174, local191, local477[local486]);
												local486++;
											}
										}
									}
								} else if (local451 == 3) {
									this.method4383(local145, local313, 0, local174, local191, 0);
									this.method4383(local145, local313, 0, local174, local191, arg1.anInt9958);
									this.method4383(local145, local313, arg1.anInt9958, local174, local191, 0);
								} else if (local451 == 2) {
									this.method4383(local145, local313, 0, local174, local191, arg1.anInt9958);
									this.method4383(local145, local313, arg1.anInt9958, local174, local191, arg1.anInt9958);
									this.method4383(local145, local313, 0, local174, local191, 0);
								} else if (local451 == 5) {
									this.method4383(local145, local313, arg1.anInt9958, local174, local191, arg1.anInt9958);
									this.method4383(local145, local313, arg1.anInt9958, local174, local191, 0);
									this.method4383(local145, local313, 0, local174, local191, arg1.anInt9958);
								} else if (local451 == 4) {
									this.method4383(local145, local313, arg1.anInt9958, local174, local191, 0);
									this.method4383(local145, local313, 0, local174, local191, 0);
									this.method4383(local145, local313, arg1.anInt9958, local174, local191, arg1.anInt9958);
								}
							}
						}
						local191++;
						local124++;
					}
				} else {
					local124 += this.anInt5370 - this.anInt5374;
				}
				local145++;
			}
			this.anInterface23_1 = this.aClass16_Sub3_22.method6007(this.aClass8_Sub8_6.anInt10588, false, this.aClass8_Sub8_6.aByteArray107);
			this.anInterface9_2 = this.aClass16_Sub3_22.method5997(this.aClass8_Sub8_Sub1_1.aByteArray107, false, this.aClass8_Sub8_Sub1_1.anInt10588, 16);
			this.aClass268_5 = new Class268(this.anInterface9_2, 5126, 3, 0);
			this.aClass268_6 = new Class268(this.anInterface9_2, 5121, 4, 12);
		}
		this.aClass253_17 = null;
		this.aClass8_Sub8_6 = null;
		this.aClass8_Sub8_Sub1_1 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray12 = this.aFloatArrayArray13 = null;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIBI[[Z)V")
	public void method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface23_1 == null || (this.anInt5374 > arg1 + arg2 || (this.anInt5370 < arg2 - arg1 || (arg1 + arg0 < this.anInt5372 || this.anInt5371 < arg0 - arg1)))) {
			return;
		}
		for (@Pc(49) int local49 = this.anInt5372; local49 <= this.anInt5371; local49++) {
			for (@Pc(54) int local54 = this.anInt5374; local54 <= this.anInt5370; local54++) {
				@Pc(61) int local61 = local54 - arg2;
				@Pc(65) int local65 = local49 - arg0;
				if (-arg1 < local61 && arg1 > local61 && local65 > -arg1 && arg1 > local65 && arg3[arg1 + local61][local65 + arg1]) {
					this.aClass16_Sub3_22.method5980((int) (this.aClass8_Sub1_2.method5205() * 255.0F) << 24);
					this.aClass16_Sub3_22.method5988(this.aClass268_6, null, null, this.aClass268_5);
					this.aClass16_Sub3_22.method5992(this.anInt5373, this.anInterface23_1, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIZII)V")
	private void method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg1 << this.aClass86_Sub1_1.anInt9954) + arg5;
		@Pc(23) int local23 = (arg3 << this.aClass86_Sub1_1.anInt9954) + arg2;
		@Pc(30) int local30 = this.aClass86_Sub1_1.method8088(local23, local15);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(61) Class8 local61 = this.aClass253_17.method6594(local7);
			if (local61 != null) {
				this.method4384(((Class8_Sub38) local61).aShort79);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt5368++;
		if (local7 != -1L) {
			this.aClass253_17.method6591(new Class8_Sub38(local79), local7);
		}
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(109) float local109;
		@Pc(200) float local200;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(229) float local229;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(286) float local286;
		if (arg5 == 0 && arg2 == 0) {
			local109 = this.aFloatArrayArray13[arg4][arg0];
			local116 = this.aFloatArrayArray11[arg4][arg0];
			local123 = this.aFloatArrayArray12[arg4][arg0];
		} else if (arg5 == this.aClass86_Sub1_1.anInt9958 && arg2 == 0) {
			local116 = this.aFloatArrayArray11[arg4 + 1][arg0];
			local109 = this.aFloatArrayArray13[arg4 + 1][arg0];
			local123 = this.aFloatArrayArray12[arg4 + 1][arg0];
		} else if (arg5 == this.aClass86_Sub1_1.anInt9958 && arg2 == this.aClass86_Sub1_1.anInt9958) {
			local123 = this.aFloatArrayArray12[arg4 + 1][arg0 + 1];
			local116 = this.aFloatArrayArray11[arg4 + 1][arg0 + 1];
			local109 = this.aFloatArrayArray13[arg4 + 1][arg0 + 1];
		} else if (arg5 == 0 && this.aClass86_Sub1_1.anInt9958 == arg2) {
			local123 = this.aFloatArrayArray12[arg4][arg0 + 1];
			local109 = this.aFloatArrayArray13[arg4][arg0 + 1];
			local116 = this.aFloatArrayArray11[arg4][arg0 + 1];
		} else {
			local200 = (float) arg5 / (float) this.aClass86_Sub1_1.anInt9958;
			local208 = (float) arg2 / (float) this.aClass86_Sub1_1.anInt9958;
			local215 = this.aFloatArrayArray11[arg4][arg0];
			local222 = this.aFloatArrayArray12[arg4][arg0];
			local229 = this.aFloatArrayArray13[arg4][arg0];
			local238 = this.aFloatArrayArray11[arg4 + 1][arg0];
			local247 = this.aFloatArrayArray12[arg4 + 1][arg0];
			@Pc(262) float local262 = local222 + local200 * (this.aFloatArrayArray12[arg4][arg0 + 1] - local222);
			@Pc(277) float local277 = local229 + local200 * (this.aFloatArrayArray13[arg4][arg0 + 1] - local229);
			local286 = this.aFloatArrayArray13[arg4 + 1][arg0];
			@Pc(303) float local303 = local247 + (this.aFloatArrayArray12[arg4 + 1][arg0 + 1] - local247) * local200;
			@Pc(320) float local320 = local238 + (this.aFloatArrayArray11[arg4 + 1][arg0 + 1] - local238) * local200;
			@Pc(336) float local336 = local215 + (this.aFloatArrayArray11[arg4][arg0 + 1] - local215) * local200;
			@Pc(353) float local353 = local286 + local200 * (this.aFloatArrayArray13[arg4 + 1][arg0 + 1] - local286);
			local116 = (local320 - local336) * local208 + local336;
			local123 = local262 + (local303 - local262) * local208;
			local109 = local208 * (local353 - local277) + local277;
		}
		local200 = this.aClass8_Sub1_2.method5206() - local15;
		local208 = this.aClass8_Sub1_2.method5198() - local30;
		local215 = this.aClass8_Sub1_2.method5207() - local23;
		local222 = (float) Math.sqrt((double) (local208 * local208 + local200 * local200 + local215 * local215));
		local229 = 1.0F / local222;
		local215 *= local229;
		local208 *= local229;
		local200 *= local229;
		local238 = local222 / (float) this.aClass8_Sub1_2.method5200();
		local247 = 1.0F - local238 * local238;
		if (local247 < 0.0F) {
			local247 = 0.0F;
		}
		local286 = local208 * local123 + local200 * local116 + local215 * local109;
		if (local286 < 0.0F) {
			local286 = 0.0F;
		}
		@Pc(545) float local545 = local247 * local286 * 2.0F;
		if (local545 > 1.0F) {
			local545 = 1.0F;
		}
		@Pc(556) int local556 = this.aClass8_Sub1_2.method5203();
		@Pc(566) int local566 = (int) ((float) (local556 >> 16 & 0xFF) * local545);
		if (local566 > 255) {
			local566 = 255;
		}
		@Pc(583) int local583 = (int) (local545 * (float) (local556 >> 8 & 0xFF));
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(600) int local600 = (int) ((float) (local556 & 0xFF) * local545);
		if (local600 > 255) {
			local600 = 255;
		}
		if (this.aClass16_Sub3_22.aBoolean519) {
			this.aClass8_Sub8_Sub1_1.method1576((float) local15);
			this.aClass8_Sub8_Sub1_1.method1576((float) local30);
			this.aClass8_Sub8_Sub1_1.method1576((float) local23);
		} else {
			this.aClass8_Sub8_Sub1_1.method1578((float) local15);
			this.aClass8_Sub8_Sub1_1.method1578((float) local30);
			this.aClass8_Sub8_Sub1_1.method1578((float) local23);
		}
		this.aClass8_Sub8_Sub1_1.method8562(local566);
		this.aClass8_Sub8_Sub1_1.method8562(local583);
		this.aClass8_Sub8_Sub1_1.method8562(local600);
		this.aClass8_Sub8_Sub1_1.method8562(255);
		this.method4384(local79);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(SI)V")
	private void method4384(@OriginalArg(0) short arg0) {
		if (this.aClass16_Sub3_22.aBoolean519) {
			this.aClass8_Sub8_6.method8548(arg0);
		} else {
			this.aClass8_Sub8_6.method8534(arg0);
		}
	}
}
