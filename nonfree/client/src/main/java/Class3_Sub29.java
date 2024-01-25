import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
	private int anInt6422;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!qh;")
	private final Class274_Sub1 aClass274_Sub1_2;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "Lclient!pk;")
	private final Class3_Sub27 aClass3_Sub27_3;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_27;

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
	private final int anInt6426;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	private final int anInt6417;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
	private final int anInt6424;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
	private final int anInt6418;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	private int anInt6416;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "Lclient!ur;")
	private final Interface27 anInterface27_5;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "Lclient!qe;")
	private final Class270 aClass270_11;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "Lclient!qe;")
	private final Class270 aClass270_10;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "Lclient!jb;")
	private final Interface12 anInterface12_4;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "Lclient!tn;")
	private Class3_Sub15 aClass3_Sub15_5;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "Lclient!wb;")
	private Class3_Sub15_Sub2 aClass3_Sub15_Sub2_3;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "Lclient!sga;")
	private Class307 aClass307_31;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!eq;Lclient!qh;Lclient!pk;[I)V")
	public Class3_Sub29(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class274_Sub1 arg1, @OriginalArg(2) Class3_Sub27 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass274_Sub1_2 = arg1;
		this.aClass3_Sub27_3 = arg2;
		this.aClass33_Sub3_27 = arg0;
		@Pc(23) int local23 = this.aClass3_Sub27_3.method5624() - (arg1.anInt9722 >> 1);
		this.anInt6426 = this.aClass3_Sub27_3.method5627() - local23 >> arg1.anInt9727;
		this.anInt6417 = local23 + this.aClass3_Sub27_3.method5627() >> arg1.anInt9727;
		this.anInt6424 = this.aClass3_Sub27_3.method5630() - local23 >> arg1.anInt9727;
		this.anInt6418 = local23 + this.aClass3_Sub27_3.method5630() >> arg1.anInt9727;
		@Pc(78) int local78 = this.anInt6417 + 1 - this.anInt6426;
		@Pc(87) int local87 = this.anInt6418 + 1 - this.anInt6424;
		this.aFloatArrayArray9 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(137) int local137;
		@Pc(145) int local145;
		@Pc(174) int local174;
		@Pc(190) int local190;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt6424 + local116;
			if (local123 > 0 && local123 < this.aClass274_Sub1_2.anInt9723 - 1) {
				for (local137 = 0; local137 <= local78; local137++) {
					local145 = local137 + this.anInt6426;
					if (local145 > 0 && this.aClass274_Sub1_2.anInt9726 - 1 > local145) {
						local174 = arg1.method8041(local145 + 1, local123) - arg1.method8041(local145 - 1, local123);
						local190 = arg1.method8041(local145, local123 + 1) - arg1.method8041(local145, local123 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local190 * local190 + 65536)));
						this.aFloatArrayArray9[local137][local116] = local206 * (float) local174;
						this.aFloatArrayArray8[local137][local116] = -256.0F * local206;
						this.aFloatArrayArray7[local137][local116] = local206 * (float) local190;
					}
				}
			}
		}
		local123 = 0;
		@Pc(313) int local313;
		for (local137 = this.anInt6424; local137 <= this.anInt6418; local137++) {
			if (local137 >= 0 && arg1.anInt9723 > local137) {
				for (local145 = this.anInt6426; local145 <= this.anInt6417; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt9726) {
						local174 = arg3[local123];
						@Pc(293) int[] local293 = arg1.anIntArrayArrayArray7[local145][local137];
						if (local293 != null && local174 != 0) {
							if (local174 == 1) {
								local313 = 0;
								while (local293.length > local313) {
									if (local293[local313++] != -1 && local293[local313++] != -1 && local293[local313++] != -1) {
										this.anInt6416 += 3;
									}
								}
							} else {
								this.anInt6416 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt6417 - this.anInt6426;
			}
		}
		if (this.anInt6416 <= 0) {
			this.anInterface27_5 = null;
			this.aClass270_11 = null;
			this.aClass270_10 = null;
			this.anInterface12_4 = null;
		} else {
			this.aClass3_Sub15_5 = new Class3_Sub15(this.anInt6416 * 2);
			this.aClass3_Sub15_Sub2_3 = new Class3_Sub15_Sub2(this.anInt6416 * 16);
			this.aClass307_31 = new Class307(Static95.method2482(this.anInt6416));
			local123 = 0;
			local145 = 0;
			for (local174 = this.anInt6424; local174 <= this.anInt6418; local174++) {
				if (local174 >= 0 && local174 < arg1.anInt9723) {
					local190 = 0;
					for (local313 = this.anInt6426; local313 <= this.anInt6417; local313++) {
						if (local313 >= 0 && arg1.anInt9726 > local313) {
							@Pc(458) int local458 = arg3[local123];
							@Pc(465) int[] local465 = arg1.anIntArrayArrayArray7[local313][local174];
							if (local465 != null && local458 != 0) {
								if (local458 == 1) {
									@Pc(484) int[] local484 = arg1.anIntArrayArrayArray8[local313][local174];
									@Pc(491) int[] local491 = arg1.anIntArrayArrayArray5[local313][local174];
									@Pc(493) int local493 = 0;
									label107: while (true) {
										while (true) {
											if (local493 >= local465.length) {
												break label107;
											}
											if (local465[local493] == -1 || local465[local493 + 1] == -1 || local465[local493 + 2] == -1) {
												local493 += 3;
											} else {
												this.method5364(local145, local484[local493], local491[local493], local174, local313, local190);
												local493++;
												this.method5364(local145, local484[local493], local491[local493], local174, local313, local190);
												local493++;
												this.method5364(local145, local484[local493], local491[local493], local174, local313, local190);
												local493++;
											}
										}
									}
								} else if (local458 == 3) {
									this.method5364(local145, 0, 0, local174, local313, local190);
									this.method5364(local145, arg1.anInt9722, 0, local174, local313, local190);
									this.method5364(local145, 0, arg1.anInt9722, local174, local313, local190);
								} else if (local458 == 2) {
									this.method5364(local145, arg1.anInt9722, 0, local174, local313, local190);
									this.method5364(local145, arg1.anInt9722, arg1.anInt9722, local174, local313, local190);
									this.method5364(local145, 0, 0, local174, local313, local190);
								} else if (local458 == 5) {
									this.method5364(local145, arg1.anInt9722, arg1.anInt9722, local174, local313, local190);
									this.method5364(local145, 0, arg1.anInt9722, local174, local313, local190);
									this.method5364(local145, arg1.anInt9722, 0, local174, local313, local190);
								} else if (local458 == 4) {
									this.method5364(local145, 0, arg1.anInt9722, local174, local313, local190);
									this.method5364(local145, 0, 0, local174, local313, local190);
									this.method5364(local145, arg1.anInt9722, arg1.anInt9722, local174, local313, local190);
								}
							}
						}
						local123++;
						local190++;
					}
				} else {
					local123 += this.anInt6417 - this.anInt6426;
				}
				local145++;
			}
			this.anInterface12_4 = this.aClass33_Sub3_27.method3064(this.aClass3_Sub15_5.aByteArray106, false, this.aClass3_Sub15_5.anInt10282);
			this.anInterface27_5 = this.aClass33_Sub3_27.method3072(16, this.aClass3_Sub15_Sub2_3.anInt10282, this.aClass3_Sub15_Sub2_3.aByteArray106, false);
			this.aClass270_10 = new Class270(this.anInterface27_5, 5126, 3, 0);
			this.aClass270_11 = new Class270(this.anInterface27_5, 5121, 4, 12);
		}
		this.aClass3_Sub15_Sub2_3 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
		this.aClass3_Sub15_5 = null;
		this.aClass307_31 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[[ZBI)V")
	public void method5362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface12_4 == null || (arg0 + arg3 < this.anInt6426 || (this.anInt6417 < arg3 - arg0 || (arg0 + arg1 < this.anInt6424 || this.anInt6418 < arg1 - arg0)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt6424; local55 <= this.anInt6418; local55++) {
			for (@Pc(60) int local60 = this.anInt6426; local60 <= this.anInt6417; local60++) {
				@Pc(66) int local66 = local60 - arg3;
				@Pc(71) int local71 = local55 - arg1;
				if (local66 > -arg0 && arg0 > local66 && local71 > -arg0 && arg0 > local71 && arg2[local66 + arg0][local71 + arg0]) {
					this.aClass33_Sub3_27.method3010((int) (this.aClass3_Sub27_3.method5631() * 255.0F) << 24);
					this.aClass33_Sub3_27.method3073(null, this.aClass270_10, this.aClass270_11, null);
					this.aClass33_Sub3_27.method3075(this.anInt6416, 0, this.anInterface12_4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(SI)V")
	private void method5363(@OriginalArg(0) short arg0) {
		if (this.aClass33_Sub3_27.aBoolean264) {
			this.aClass3_Sub15_5.method8464(arg0);
		} else {
			this.aClass3_Sub15_5.method8405(arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
	private void method5364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) -1;
		@Pc(16) int local16 = arg1 + (arg4 << this.aClass274_Sub1_2.anInt9727);
		@Pc(24) int local24 = arg2 + (arg3 << this.aClass274_Sub1_2.anInt9727);
		@Pc(31) int local31 = this.aClass274_Sub1_2.method8043(local24, local16);
		if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local8 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local16 & 0xFFFFL;
			@Pc(59) Class3 local59 = this.aClass307_31.method7424(local8);
			if (local59 != null) {
				this.method5363(((Class3_Sub43) local59).aShort110);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt6422++;
		if (local8 != -1L) {
			this.aClass307_31.method7425(local8, new Class3_Sub43(local79));
		}
		@Pc(132) float local132;
		@Pc(123) float local123;
		@Pc(114) float local114;
		@Pc(162) float local162;
		@Pc(170) float local170;
		@Pc(177) float local177;
		@Pc(184) float local184;
		@Pc(191) float local191;
		@Pc(200) float local200;
		@Pc(209) float local209;
		@Pc(282) float local282;
		if (arg1 == 0 && arg2 == 0) {
			local132 = this.aFloatArrayArray9[arg5][arg0];
			local114 = this.aFloatArrayArray7[arg5][arg0];
			local123 = this.aFloatArrayArray8[arg5][arg0];
		} else if (arg1 == this.aClass274_Sub1_2.anInt9722 && arg2 == 0) {
			local114 = this.aFloatArrayArray7[arg5 + 1][arg0];
			local123 = this.aFloatArrayArray8[arg5 + 1][arg0];
			local132 = this.aFloatArrayArray9[arg5 + 1][arg0];
		} else if (arg1 == this.aClass274_Sub1_2.anInt9722 && this.aClass274_Sub1_2.anInt9722 == arg2) {
			local132 = this.aFloatArrayArray9[arg5 + 1][arg0 + 1];
			local123 = this.aFloatArrayArray8[arg5 + 1][arg0 + 1];
			local114 = this.aFloatArrayArray7[arg5 + 1][arg0 + 1];
		} else if (arg1 == 0 && arg2 == this.aClass274_Sub1_2.anInt9722) {
			local114 = this.aFloatArrayArray7[arg5][arg0 + 1];
			local132 = this.aFloatArrayArray9[arg5][arg0 + 1];
			local123 = this.aFloatArrayArray8[arg5][arg0 + 1];
		} else {
			local162 = (float) arg1 / (float) this.aClass274_Sub1_2.anInt9722;
			local170 = (float) arg2 / (float) this.aClass274_Sub1_2.anInt9722;
			local177 = this.aFloatArrayArray9[arg5][arg0];
			local184 = this.aFloatArrayArray8[arg5][arg0];
			local191 = this.aFloatArrayArray7[arg5][arg0];
			local200 = this.aFloatArrayArray9[arg5 + 1][arg0];
			local209 = this.aFloatArrayArray8[arg5 + 1][arg0];
			@Pc(224) float local224 = local177 + local162 * (this.aFloatArrayArray9[arg5][arg0 + 1] - local177);
			@Pc(240) float local240 = local191 + local162 * (this.aFloatArrayArray7[arg5][arg0 + 1] - local191);
			@Pc(255) float local255 = local184 + (this.aFloatArrayArray8[arg5][arg0 + 1] - local184) * local162;
			@Pc(273) float local273 = local200 + (this.aFloatArrayArray9[arg5 + 1][arg0 + 1] - local200) * local162;
			local282 = this.aFloatArrayArray7[arg5 + 1][arg0];
			@Pc(299) float local299 = local209 + local162 * (this.aFloatArrayArray8[arg5 + 1][arg0 + 1] - local209);
			local123 = local255 + (local299 - local255) * local170;
			@Pc(325) float local325 = local282 + local162 * (this.aFloatArrayArray7[arg5 + 1][arg0 + 1] - local282);
			local132 = local224 + (local273 - local224) * local170;
			local114 = (local325 - local240) * local170 + local240;
		}
		local162 = this.aClass3_Sub27_3.method5627() - local16;
		local170 = this.aClass3_Sub27_3.method5628() - local31;
		local177 = this.aClass3_Sub27_3.method5630() - local24;
		local184 = (float) Math.sqrt((double) (local177 * local177 + local162 * local162 + local170 * local170));
		local191 = 1.0F / local184;
		local162 *= local191;
		local177 *= local191;
		local170 *= local191;
		local200 = local184 / (float) this.aClass3_Sub27_3.method5624();
		local209 = 1.0F - local200 * local200;
		if (local209 < 0.0F) {
			local209 = 0.0F;
		}
		local282 = local170 * local123 + local132 * local162 + local114 * local177;
		if (local282 < 0.0F) {
			local282 = 0.0F;
		}
		@Pc(531) float local531 = local282 * local209 * 2.0F;
		if (local531 > 1.0F) {
			local531 = 1.0F;
		}
		@Pc(542) int local542 = this.aClass3_Sub27_3.method5626();
		@Pc(552) int local552 = (int) ((float) (local542 >> 16 & 0xFF) * local531);
		if (local552 > 255) {
			local552 = 255;
		}
		@Pc(567) int local567 = (int) (local531 * (float) (local542 >> 8 & 0xFF));
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local542 & 0xFF) * local531);
		if (this.aClass33_Sub3_27.aBoolean264) {
			this.aClass3_Sub15_Sub2_3.method8469((float) local16);
			this.aClass3_Sub15_Sub2_3.method8469((float) local31);
			this.aClass3_Sub15_Sub2_3.method8469((float) local24);
		} else {
			this.aClass3_Sub15_Sub2_3.method8470((float) local16);
			this.aClass3_Sub15_Sub2_3.method8470((float) local31);
			this.aClass3_Sub15_Sub2_3.method8470((float) local24);
		}
		if (local580 > 255) {
			local580 = 255;
		}
		this.aClass3_Sub15_Sub2_3.method8448(local552);
		this.aClass3_Sub15_Sub2_3.method8448(local567);
		this.aClass3_Sub15_Sub2_3.method8448(local580);
		this.aClass3_Sub15_Sub2_3.method8448(255);
		this.method5363(local79);
	}
}
