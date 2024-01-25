import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	private int anInt6504;

	@OriginalMember(owner = "client!op", name = "D", descriptor = "Lclient!tg;")
	private final Class2_Sub11 aClass2_Sub11_3;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "Lclient!vfa;")
	private final Class151_Sub2 aClass151_Sub2_2;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_31;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	private final int anInt6497;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "I")
	private final int anInt6499;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "I")
	private final int anInt6502;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	private final int anInt6503;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "I")
	private int anInt6507;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "Lclient!gv;")
	private final Class133 aClass133_6;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "Lclient!re;")
	private final Interface21 anInterface21_1;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Lclient!fba;")
	private final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "Lclient!gv;")
	private final Class133 aClass133_5;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!gk;")
	private Class2_Sub7 aClass2_Sub7_6;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "Lclient!bca;")
	private Class2_Sub7_Sub1 aClass2_Sub7_Sub1_2;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "Lclient!efa;")
	private Class90 aClass90_22;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!uca;Lclient!vfa;Lclient!tg;[I)V")
	public Class2_Sub36(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class151_Sub2 arg1, @OriginalArg(2) Class2_Sub11 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub11_3 = arg2;
		this.aClass151_Sub2_2 = arg1;
		this.aClass162_Sub3_31 = arg0;
		@Pc(23) int local23 = this.aClass2_Sub11_3.method7277() - (arg1.anInt9573 >> 1);
		this.anInt6497 = this.aClass2_Sub11_3.method7276() - local23 >> arg1.anInt9568;
		this.anInt6499 = local23 + this.aClass2_Sub11_3.method7276() >> arg1.anInt9568;
		this.anInt6502 = this.aClass2_Sub11_3.method7271() - local23 >> arg1.anInt9568;
		this.anInt6503 = this.aClass2_Sub11_3.method7271() + local23 >> arg1.anInt9568;
		@Pc(75) int local75 = this.anInt6499 + 1 - this.anInt6497;
		@Pc(84) int local84 = this.anInt6503 + 1 - this.anInt6502;
		this.aFloatArrayArray9 = new float[local75 + 1][local84 + 1];
		this.aFloatArrayArray8 = new float[local75 + 1][local84 + 1];
		this.aFloatArrayArray10 = new float[local75 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(177) int local177;
		@Pc(194) int local194;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = this.anInt6502 + local113;
			if (local120 > 0 && this.aClass151_Sub2_2.anInt9574 - 1 > local120) {
				for (local138 = 0; local138 <= local75; local138++) {
					local145 = this.anInt6497 + local138;
					if (local145 > 0 && this.aClass151_Sub2_2.anInt9572 - 1 > local145) {
						local177 = arg1.method7676(local120, local145 + 1) - arg1.method7676(local120, local145 - 1);
						local194 = arg1.method7676(local120 + 1, local145) - arg1.method7676(local120 - 1, local145);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local194 * local194 + local177 * local177 + 65536)));
						this.aFloatArrayArray8[local138][local113] = (float) local177 * local209;
						this.aFloatArrayArray9[local138][local113] = local209 * -256.0F;
						this.aFloatArrayArray10[local138][local113] = (float) local194 * local209;
					}
				}
			}
		}
		local120 = 0;
		@Pc(313) int local313;
		for (local138 = this.anInt6502; local138 <= this.anInt6503; local138++) {
			if (local138 >= 0 && arg1.anInt9574 > local138) {
				for (local145 = this.anInt6497; local145 <= this.anInt6499; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt9572) {
						local177 = arg3[local120];
						@Pc(299) int[] local299 = arg1.anIntArrayArrayArray14[local145][local138];
						if (local299 != null && local177 != 0) {
							if (local177 == 1) {
								local313 = 0;
								while (local299.length > local313) {
									if (local299[local313++] != -1 && local299[local313++] != -1 && local299[local313++] != -1) {
										this.anInt6507 += 3;
									}
								}
							} else {
								this.anInt6507 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt6499 - this.anInt6497;
			}
		}
		if (this.anInt6507 <= 0) {
			this.aClass133_6 = null;
			this.anInterface21_1 = null;
			this.anInterface10_3 = null;
			this.aClass133_5 = null;
		} else {
			this.aClass2_Sub7_6 = new Class2_Sub7(this.anInt6507 * 2);
			this.aClass2_Sub7_Sub1_2 = new Class2_Sub7_Sub1(this.anInt6507 * 16);
			this.aClass90_22 = new Class90(Static355.method5078(this.anInt6507));
			local145 = 0;
			local120 = 0;
			for (local177 = this.anInt6502; local177 <= this.anInt6503; local177++) {
				if (local177 >= 0 && local177 < arg1.anInt9574) {
					local194 = 0;
					for (local313 = this.anInt6497; local313 <= this.anInt6499; local313++) {
						if (local313 >= 0 && arg1.anInt9572 > local313) {
							@Pc(457) int local457 = arg3[local120];
							@Pc(464) int[] local464 = arg1.anIntArrayArrayArray14[local313][local177];
							if (local464 != null && local457 != 0) {
								if (local457 == 1) {
									@Pc(626) int[] local626 = arg1.anIntArrayArrayArray16[local313][local177];
									@Pc(633) int[] local633 = arg1.anIntArrayArrayArray19[local313][local177];
									@Pc(635) int local635 = 0;
									label105: while (true) {
										while (true) {
											if (local635 >= local464.length) {
												break label105;
											}
											if (local464[local635] == -1 || local464[local635 + 1] == -1 || local464[local635 + 2] == -1) {
												local635 += 3;
											} else {
												this.method5410(local626[local635], local177, local194, local633[local635], local145, local313);
												local635++;
												this.method5410(local626[local635], local177, local194, local633[local635], local145, local313);
												local635++;
												this.method5410(local626[local635], local177, local194, local633[local635], local145, local313);
												local635++;
											}
										}
									}
								} else if (local457 == 3) {
									this.method5410(0, local177, local194, 0, local145, local313);
									this.method5410(arg1.anInt9573, local177, local194, 0, local145, local313);
									this.method5410(0, local177, local194, arg1.anInt9573, local145, local313);
								} else if (local457 == 2) {
									this.method5410(arg1.anInt9573, local177, local194, 0, local145, local313);
									this.method5410(arg1.anInt9573, local177, local194, arg1.anInt9573, local145, local313);
									this.method5410(0, local177, local194, 0, local145, local313);
								} else if (local457 == 5) {
									this.method5410(arg1.anInt9573, local177, local194, arg1.anInt9573, local145, local313);
									this.method5410(0, local177, local194, arg1.anInt9573, local145, local313);
									this.method5410(arg1.anInt9573, local177, local194, 0, local145, local313);
								} else if (local457 == 4) {
									this.method5410(0, local177, local194, arg1.anInt9573, local145, local313);
									this.method5410(0, local177, local194, 0, local145, local313);
									this.method5410(arg1.anInt9573, local177, local194, arg1.anInt9573, local145, local313);
								}
							}
						}
						local120++;
						local194++;
					}
				} else {
					local120 += this.anInt6499 - this.anInt6497;
				}
				local145++;
			}
			this.anInterface21_1 = this.aClass162_Sub3_31.method6921(this.aClass2_Sub7_6.anInt5186, false, this.aClass2_Sub7_6.aByteArray52);
			this.anInterface10_3 = this.aClass162_Sub3_31.method6955(16, this.aClass2_Sub7_Sub1_2.aByteArray52, this.aClass2_Sub7_Sub1_2.anInt5186, false);
			this.aClass133_6 = new Class133(this.anInterface10_3, 5126, 3, 0);
			this.aClass133_5 = new Class133(this.anInterface10_3, 5121, 4, 12);
		}
		this.aClass90_22 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray9 = this.aFloatArrayArray10 = null;
		this.aClass2_Sub7_6 = null;
		this.aClass2_Sub7_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IZI[[ZI)V")
	public void method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface21_1 == null || (arg1 + arg0 < this.anInt6497 || (this.anInt6499 < arg0 - arg1 || (arg1 + arg3 < this.anInt6502 || arg3 - arg1 > this.anInt6503)))) {
			return;
		}
		for (@Pc(61) int local61 = this.anInt6502; local61 <= this.anInt6503; local61++) {
			for (@Pc(66) int local66 = this.anInt6497; local66 <= this.anInt6499; local66++) {
				@Pc(73) int local73 = local66 - arg0;
				@Pc(78) int local78 = local61 - arg3;
				if (local73 > -arg1 && local73 < arg1 && -arg1 < local78 && arg1 > local78 && arg2[local73 + arg1][arg1 + local78]) {
					this.aClass162_Sub3_31.method6961((int) (this.aClass2_Sub11_3.method7280() * 255.0F) << 24);
					this.aClass162_Sub3_31.method6916(null, null, this.aClass133_5, this.aClass133_6);
					this.aClass162_Sub3_31.method6904(0, this.anInt6507, this.anInterface21_1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII)V")
	private void method5410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(19) int local19 = (arg5 << this.aClass151_Sub2_2.anInt9568) + arg0;
		@Pc(27) int local27 = arg3 + (arg1 << this.aClass151_Sub2_2.anInt9568);
		@Pc(34) int local34 = this.aClass151_Sub2_2.method7680(local19, local27);
		if ((arg0 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local27 << 16 | (long) local19 & 0xFFFFL;
			@Pc(68) Class2 local68 = this.aClass90_22.method1685(local7);
			if (local68 != null) {
				this.method5412(((Class2_Sub43) local68).aShort96);
				return;
			}
		}
		@Pc(88) short local88 = (short) this.anInt6504++;
		if (local7 != -1L) {
			this.aClass90_22.method1684(new Class2_Sub43(local88), local7);
		}
		@Pc(137) float local137;
		@Pc(128) float local128;
		@Pc(146) float local146;
		@Pc(206) float local206;
		@Pc(214) float local214;
		@Pc(221) float local221;
		@Pc(228) float local228;
		@Pc(235) float local235;
		@Pc(244) float local244;
		@Pc(253) float local253;
		@Pc(277) float local277;
		if (arg0 == 0 && arg3 == 0) {
			local146 = this.aFloatArrayArray10[arg2][arg4];
			local137 = this.aFloatArrayArray8[arg2][arg4];
			local128 = this.aFloatArrayArray9[arg2][arg4];
		} else if (arg0 == this.aClass151_Sub2_2.anInt9573 && arg3 == 0) {
			local128 = this.aFloatArrayArray9[arg2 + 1][arg4];
			local137 = this.aFloatArrayArray8[arg2 + 1][arg4];
			local146 = this.aFloatArrayArray10[arg2 + 1][arg4];
		} else if (this.aClass151_Sub2_2.anInt9573 == arg0 && arg3 == this.aClass151_Sub2_2.anInt9573) {
			local146 = this.aFloatArrayArray10[arg2 + 1][arg4 + 1];
			local128 = this.aFloatArrayArray9[arg2 + 1][arg4 + 1];
			local137 = this.aFloatArrayArray8[arg2 + 1][arg4 + 1];
		} else if (arg0 == 0 && arg3 == this.aClass151_Sub2_2.anInt9573) {
			local146 = this.aFloatArrayArray10[arg2][arg4 + 1];
			local128 = this.aFloatArrayArray9[arg2][arg4 + 1];
			local137 = this.aFloatArrayArray8[arg2][arg4 + 1];
		} else {
			local206 = (float) arg0 / (float) this.aClass151_Sub2_2.anInt9573;
			local214 = (float) arg3 / (float) this.aClass151_Sub2_2.anInt9573;
			local221 = this.aFloatArrayArray8[arg2][arg4];
			local228 = this.aFloatArrayArray9[arg2][arg4];
			local235 = this.aFloatArrayArray10[arg2][arg4];
			local244 = this.aFloatArrayArray8[arg2 + 1][arg4];
			local253 = this.aFloatArrayArray9[arg2 + 1][arg4];
			@Pc(268) float local268 = local235 + local206 * (this.aFloatArrayArray10[arg2][arg4 + 1] - local235);
			local277 = this.aFloatArrayArray10[arg2 + 1][arg4];
			@Pc(294) float local294 = local244 + local206 * (this.aFloatArrayArray8[arg2 + 1][arg4 + 1] - local244);
			@Pc(310) float local310 = local221 + (this.aFloatArrayArray8[arg2][arg4 + 1] - local221) * local206;
			@Pc(327) float local327 = local253 + local206 * (this.aFloatArrayArray9[arg2 + 1][arg4 + 1] - local253);
			@Pc(342) float local342 = local228 + local206 * (this.aFloatArrayArray9[arg2][arg4 + 1] - local228);
			@Pc(359) float local359 = local277 + local206 * (this.aFloatArrayArray10[arg2 + 1][arg4 + 1] - local277);
			local128 = local214 * (local327 - local342) + local342;
			local137 = local310 + local214 * (local294 - local310);
			local146 = local214 * (local359 - local268) + local268;
		}
		local206 = this.aClass2_Sub11_3.method7276() - local19;
		local214 = this.aClass2_Sub11_3.method7270() - local34;
		local221 = this.aClass2_Sub11_3.method7271() - local27;
		local228 = (float) Math.sqrt((double) (local221 * local221 + local206 * local206 + local214 * local214));
		local235 = 1.0F / local228;
		local206 *= local235;
		local221 *= local235;
		local214 *= local235;
		local244 = local228 / (float) this.aClass2_Sub11_3.method7277();
		local253 = 1.0F - local244 * local244;
		if (local253 < 0.0F) {
			local253 = 0.0F;
		}
		local277 = local214 * local128 + local206 * local137 + local146 * local221;
		if (local277 < 0.0F) {
			local277 = 0.0F;
		}
		@Pc(546) float local546 = local253 * local277 * 2.0F;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass2_Sub11_3.method7274();
		@Pc(567) int local567 = (int) (local546 * (float) (local557 >> 16 & 0xFF));
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(582) int local582 = (int) ((float) (local557 >> 8 & 0xFF) * local546);
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(597) int local597 = (int) (local546 * (float) (local557 & 0xFF));
		if (local597 > 255) {
			local597 = 255;
		}
		if (this.aClass162_Sub3_31.aBoolean720) {
			this.aClass2_Sub7_Sub1_2.method546((float) local19);
			this.aClass2_Sub7_Sub1_2.method546((float) local34);
			this.aClass2_Sub7_Sub1_2.method546((float) local27);
		} else {
			this.aClass2_Sub7_Sub1_2.method545((float) local19);
			this.aClass2_Sub7_Sub1_2.method545((float) local34);
			this.aClass2_Sub7_Sub1_2.method545((float) local27);
		}
		this.aClass2_Sub7_Sub1_2.method4459(local567);
		this.aClass2_Sub7_Sub1_2.method4459(local582);
		this.aClass2_Sub7_Sub1_2.method4459(local597);
		this.aClass2_Sub7_Sub1_2.method4459(255);
		this.method5412(local88);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(SI)V")
	private void method5412(@OriginalArg(0) short arg0) {
		if (this.aClass162_Sub3_31.aBoolean720) {
			this.aClass2_Sub7_6.method4511(arg0);
		} else {
			this.aClass2_Sub7_6.method4469(arg0);
		}
	}
}
