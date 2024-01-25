import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "[I")
	public static final int[] anIntArray186 = new int[128];

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
	private int anInt2088;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_4;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "Lclient!bh;")
	private final Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "Lclient!uea;")
	private final Class112_Sub3 aClass112_Sub3_1;

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "I")
	private final int anInt2091;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
	private final int anInt2085;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	private final int anInt2084;

	@OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
	private final int anInt2092;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
	private int anInt2090;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!ud;")
	private Class2_Sub34 aClass2_Sub34_5;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "Lclient!mea;")
	private Class2_Sub34_Sub1 aClass2_Sub34_Sub1_1;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "Lclient!mp;")
	private Class222 aClass222_7;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "Lclient!ff;")
	private final Interface9 anInterface9_1;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Lclient!tda;")
	private final Interface23 anInterface23_2;

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "Lclient!dda;")
	private final Class66 aClass66_2;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Lclient!dda;")
	private final Class66 aClass66_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray186.length; local4++) {
			anIntArray186[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray186[local20] = local20 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray186[local35] = local35 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray186[local50] = local50 + 52 - 48;
		}
		anIntArray186[45] = anIntArray186[47] = 63;
		anIntArray186[42] = anIntArray186[43] = 62;
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!oea;Lclient!uea;Lclient!bh;[I)V")
	public Class2_Sub17(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class112_Sub3 arg1, @OriginalArg(2) Class2_Sub4 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass87_Sub2_4 = arg0;
		this.aClass2_Sub4_1 = arg2;
		this.aClass112_Sub3_1 = arg1;
		@Pc(22) int local22 = this.aClass2_Sub4_1.method8154() - (arg1.anInt9344 >> 1);
		this.anInt2091 = this.aClass2_Sub4_1.method8150() - local22 >> arg1.anInt9341;
		this.anInt2085 = local22 + this.aClass2_Sub4_1.method8150() >> arg1.anInt9341;
		this.anInt2084 = this.aClass2_Sub4_1.method8151() - local22 >> arg1.anInt9341;
		this.anInt2092 = this.aClass2_Sub4_1.method8151() + local22 >> arg1.anInt9341;
		@Pc(76) int local76 = this.anInt2085 + 1 - this.anInt2091;
		@Pc(85) int local85 = this.anInt2092 + 1 - this.anInt2084;
		this.aFloatArrayArray4 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray5 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(173) int local173;
		@Pc(189) int local189;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt2084 + local114;
			if (local121 > 0 && this.aClass112_Sub3_1.anInt9340 - 1 > local121) {
				for (local132 = 0; local132 <= local76; local132++) {
					local140 = local132 + this.anInt2091;
					if (local140 > 0 && local140 < this.aClass112_Sub3_1.anInt9348 - 1) {
						local173 = arg1.method7819(local121, local140 + 1) - arg1.method7819(local121, local140 - 1);
						local189 = arg1.method7819(local121 + 1, local140) - arg1.method7819(local121 - 1, local140);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local173 * local173 + local189 * local189 + 65536)));
						this.aFloatArrayArray3[local132][local114] = local205 * (float) local173;
						this.aFloatArrayArray5[local132][local114] = local205 * -256.0F;
						this.aFloatArrayArray4[local132][local114] = (float) local189 * local205;
					}
				}
			}
		}
		local121 = 0;
		@Pc(310) int local310;
		for (local132 = this.anInt2084; local132 <= this.anInt2092; local132++) {
			if (local132 >= 0 && arg1.anInt9340 > local132) {
				for (local140 = this.anInt2091; local140 <= this.anInt2085; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt9348) {
						local173 = arg3[local121];
						@Pc(296) int[] local296 = arg1.anIntArrayArrayArray19[local140][local132];
						if (local296 != null && local173 != 0) {
							if (local173 == 1) {
								local310 = 0;
								while (local296.length > local310) {
									if (local296[local310++] != -1 && local296[local310++] != -1 && local296[local310++] != -1) {
										this.anInt2090 += 3;
									}
								}
							} else {
								this.anInt2090 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt2085 - this.anInt2091;
			}
		}
		if (this.anInt2090 > 0) {
			this.aClass2_Sub34_5 = new Class2_Sub34(this.anInt2090 * 2);
			this.aClass2_Sub34_Sub1_1 = new Class2_Sub34_Sub1(this.anInt2090 * 16);
			this.aClass222_7 = new Class222(Static347.method5404(this.anInt2090));
			local140 = 0;
			local121 = 0;
			for (local173 = this.anInt2084; local173 <= this.anInt2092; local173++) {
				if (local173 >= 0 && local173 < arg1.anInt9340) {
					local189 = 0;
					for (local310 = this.anInt2091; local310 <= this.anInt2085; local310++) {
						if (local310 >= 0 && arg1.anInt9348 > local310) {
							@Pc(429) int local429 = arg3[local121];
							@Pc(436) int[] local436 = arg1.anIntArrayArrayArray19[local310][local173];
							if (local436 != null && local429 != 0) {
								if (local429 == 1) {
									@Pc(592) int[] local592 = arg1.anIntArrayArrayArray17[local310][local173];
									@Pc(599) int[] local599 = arg1.anIntArrayArrayArray18[local310][local173];
									@Pc(601) int local601 = 0;
									label106: while (true) {
										while (true) {
											if (local601 >= local436.length) {
												break label106;
											}
											if (local436[local601] == -1 || local436[local601 + 1] == -1 || local436[local601 + 2] == -1) {
												local601 += 3;
											} else {
												this.method1758(local189, local173, local140, local592[local601], local310, local599[local601]);
												local601++;
												this.method1758(local189, local173, local140, local592[local601], local310, local599[local601]);
												local601++;
												this.method1758(local189, local173, local140, local592[local601], local310, local599[local601]);
												local601++;
											}
										}
									}
								} else if (local429 == 3) {
									this.method1758(local189, local173, local140, 0, local310, 0);
									this.method1758(local189, local173, local140, arg1.anInt9344, local310, 0);
									this.method1758(local189, local173, local140, 0, local310, arg1.anInt9344);
								} else if (local429 == 2) {
									this.method1758(local189, local173, local140, arg1.anInt9344, local310, 0);
									this.method1758(local189, local173, local140, arg1.anInt9344, local310, arg1.anInt9344);
									this.method1758(local189, local173, local140, 0, local310, 0);
								} else if (local429 == 5) {
									this.method1758(local189, local173, local140, arg1.anInt9344, local310, arg1.anInt9344);
									this.method1758(local189, local173, local140, 0, local310, arg1.anInt9344);
									this.method1758(local189, local173, local140, arg1.anInt9344, local310, 0);
								} else if (local429 == 4) {
									this.method1758(local189, local173, local140, 0, local310, arg1.anInt9344);
									this.method1758(local189, local173, local140, 0, local310, 0);
									this.method1758(local189, local173, local140, arg1.anInt9344, local310, arg1.anInt9344);
								}
							}
						}
						local121++;
						local189++;
					}
				} else {
					local121 += this.anInt2085 - this.anInt2091;
				}
				local140++;
			}
			this.anInterface9_1 = this.aClass87_Sub2_4.method6157(this.aClass2_Sub34_5.anInt8188, false, this.aClass2_Sub34_5.aByteArray77);
			this.anInterface23_2 = this.aClass87_Sub2_4.method6160(false, this.aClass2_Sub34_Sub1_1.aByteArray77, 16, this.aClass2_Sub34_Sub1_1.anInt8188);
			this.aClass66_2 = new Class66(this.anInterface23_2, 5126, 3, 0);
			this.aClass66_1 = new Class66(this.anInterface23_2, 5121, 4, 12);
		} else {
			this.aClass66_2 = null;
			this.anInterface9_1 = null;
			this.aClass66_1 = null;
			this.anInterface23_2 = null;
		}
		this.aClass2_Sub34_5 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray5 = this.aFloatArrayArray4 = null;
		this.aClass222_7 = null;
		this.aClass2_Sub34_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BS)V")
	private void method1757(@OriginalArg(1) short arg0) {
		if (this.aClass87_Sub2_4.aBoolean559) {
			this.aClass2_Sub34_5.method6854(arg0);
		} else {
			this.aClass2_Sub34_5.method6868(arg0);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)V")
	private void method1758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) -1;
		@Pc(16) int local16 = (arg4 << this.aClass112_Sub3_1.anInt9341) + arg3;
		@Pc(24) int local24 = (arg1 << this.aClass112_Sub3_1.anInt9341) + arg5;
		@Pc(31) int local31 = this.aClass112_Sub3_1.method7826(local16, local24);
		if ((arg3 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local8 = ((long) local24 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(63) Class2 local63 = this.aClass222_7.method5468(local8);
			if (local63 != null) {
				this.method1757(((Class2_Sub19) local63).aShort41);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt2088++;
		if (local8 != -1L) {
			this.aClass222_7.method5476(new Class2_Sub19(local81), local8);
		}
		@Pc(124) float local124;
		@Pc(117) float local117;
		@Pc(110) float local110;
		@Pc(201) float local201;
		@Pc(209) float local209;
		@Pc(216) float local216;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(239) float local239;
		@Pc(248) float local248;
		@Pc(323) float local323;
		if (arg3 == 0 && arg5 == 0) {
			local110 = this.aFloatArrayArray4[arg0][arg2];
			local117 = this.aFloatArrayArray5[arg0][arg2];
			local124 = this.aFloatArrayArray3[arg0][arg2];
		} else if (this.aClass112_Sub3_1.anInt9344 == arg3 && arg5 == 0) {
			local124 = this.aFloatArrayArray3[arg0 + 1][arg2];
			local110 = this.aFloatArrayArray4[arg0 + 1][arg2];
			local117 = this.aFloatArrayArray5[arg0 + 1][arg2];
		} else if (arg3 == this.aClass112_Sub3_1.anInt9344 && arg5 == this.aClass112_Sub3_1.anInt9344) {
			local124 = this.aFloatArrayArray3[arg0 + 1][arg2 + 1];
			local117 = this.aFloatArrayArray5[arg0 + 1][arg2 + 1];
			local110 = this.aFloatArrayArray4[arg0 + 1][arg2 + 1];
		} else if (arg3 == 0 && arg5 == this.aClass112_Sub3_1.anInt9344) {
			local117 = this.aFloatArrayArray5[arg0][arg2 + 1];
			local124 = this.aFloatArrayArray3[arg0][arg2 + 1];
			local110 = this.aFloatArrayArray4[arg0][arg2 + 1];
		} else {
			local201 = (float) arg3 / (float) this.aClass112_Sub3_1.anInt9344;
			local209 = (float) arg5 / (float) this.aClass112_Sub3_1.anInt9344;
			local216 = this.aFloatArrayArray3[arg0][arg2];
			local223 = this.aFloatArrayArray5[arg0][arg2];
			local230 = this.aFloatArrayArray4[arg0][arg2];
			local239 = this.aFloatArrayArray3[arg0 + 1][arg2];
			local248 = this.aFloatArrayArray5[arg0 + 1][arg2];
			@Pc(265) float local265 = local248 + local201 * (this.aFloatArrayArray5[arg0 + 1][arg2 + 1] - local248);
			@Pc(280) float local280 = local216 + (this.aFloatArrayArray3[arg0][arg2 + 1] - local216) * local201;
			@Pc(298) float local298 = local239 + local201 * (this.aFloatArrayArray3[arg0 + 1][arg2 + 1] - local239);
			@Pc(314) float local314 = local230 + local201 * (this.aFloatArrayArray4[arg0][arg2 + 1] - local230);
			local323 = this.aFloatArrayArray4[arg0 + 1][arg2];
			@Pc(339) float local339 = local223 + (this.aFloatArrayArray5[arg0][arg2 + 1] - local223) * local201;
			@Pc(356) float local356 = local323 + (this.aFloatArrayArray4[arg0 + 1][arg2 + 1] - local323) * local201;
			local124 = local280 + local209 * (local298 - local280);
			local117 = (local265 - local339) * local209 + local339;
			local110 = local209 * (local356 - local314) + local314;
		}
		local201 = this.aClass2_Sub4_1.method8150() - local16;
		local209 = this.aClass2_Sub4_1.method8158() - local31;
		local216 = this.aClass2_Sub4_1.method8151() - local24;
		local223 = (float) Math.sqrt((double) (local209 * local209 + local201 * local201 + local216 * local216));
		local230 = 1.0F / local223;
		local209 *= local230;
		local216 *= local230;
		local201 *= local230;
		local239 = local223 / (float) this.aClass2_Sub4_1.method8154();
		local248 = 1.0F - local239 * local239;
		if (local248 < 0.0F) {
			local248 = 0.0F;
		}
		local323 = local117 * local209 + local201 * local124 + local216 * local110;
		if (local323 < 0.0F) {
			local323 = 0.0F;
		}
		@Pc(546) float local546 = local323 * local248 * 2.0F;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass2_Sub4_1.method8152();
		@Pc(567) int local567 = (int) ((float) (local557 >> 16 & 0xFF) * local546);
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(584) int local584 = (int) ((float) (local557 >> 8 & 0xFF) * local546);
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(599) int local599 = (int) ((float) (local557 & 0xFF) * local546);
		if (this.aClass87_Sub2_4.aBoolean559) {
			this.aClass2_Sub34_Sub1_1.method5393((float) local16);
			this.aClass2_Sub34_Sub1_1.method5393((float) local31);
			this.aClass2_Sub34_Sub1_1.method5393((float) local24);
		} else {
			this.aClass2_Sub34_Sub1_1.method5392((float) local16);
			this.aClass2_Sub34_Sub1_1.method5392((float) local31);
			this.aClass2_Sub34_Sub1_1.method5392((float) local24);
		}
		if (local599 > 255) {
			local599 = 255;
		}
		this.aClass2_Sub34_Sub1_1.method6894(local567);
		this.aClass2_Sub34_Sub1_1.method6894(local584);
		this.aClass2_Sub34_Sub1_1.method6894(local599);
		this.aClass2_Sub34_Sub1_1.method6894(255);
		this.method1757(local81);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII[[Z)V")
	public void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface9_1 == null || (this.anInt2091 > arg0 + arg1 || (this.anInt2085 < arg0 - arg1 || (arg2 + arg1 < this.anInt2084 || this.anInt2092 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt2084; local54 <= this.anInt2092; local54++) {
			for (@Pc(59) int local59 = this.anInt2091; local59 <= this.anInt2085; local59++) {
				@Pc(66) int local66 = local59 - arg0;
				@Pc(70) int local70 = local54 - arg2;
				if (-arg1 < local66 && local66 < arg1 && local70 > -arg1 && arg1 > local70 && arg3[local66 + arg1][local70 + arg1]) {
					this.aClass87_Sub2_4.method6203((int) (this.aClass2_Sub4_1.method8156() * 255.0F) << 24);
					this.aClass87_Sub2_4.method6151(this.aClass66_2, null, this.aClass66_1, null);
					this.aClass87_Sub2_4.method6162(this.anInt2090, this.anInterface9_1, 0);
					return;
				}
			}
		}
	}
}
