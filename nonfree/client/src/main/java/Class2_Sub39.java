import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
	private int anInt6042;

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
	private int anInt6043;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_36;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "Lclient!qp;")
	private final Class2_Sub36 aClass2_Sub36_1;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Lclient!je;")
	private final Class73_Sub1 aClass73_Sub1_3;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	private final int anInt6039;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
	private final int anInt6040;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
	private final int anInt6041;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
	private final int anInt6038;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "Lclient!hf;")
	private final Class81 aClass81_13;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!as;")
	private final Interface1 anInterface1_4;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!hf;")
	private final Class81 aClass81_14;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "Lclient!um;")
	private final Interface8 anInterface8_6;

	@OriginalMember(owner = "client!tc", name = "G", descriptor = "Lclient!dg;")
	private Class2_Sub10 aClass2_Sub10_8;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!pq;")
	private Class2_Sub10_Sub2 aClass2_Sub10_Sub2_3;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "Lclient!va;")
	private Class199 aClass199_29;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!ao;Lclient!je;Lclient!qp;[I)V")
	public Class2_Sub39(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class73_Sub1 arg1, @OriginalArg(2) Class2_Sub36 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass4_Sub1_36 = arg0;
		this.aClass2_Sub36_1 = arg2;
		this.aClass73_Sub1_3 = arg1;
		@Pc(20) int local20 = this.aClass2_Sub36_1.anInt5108 - (arg1.anInt3085 >> 1);
		this.anInt6039 = this.aClass2_Sub36_1.anInt5111 - local20 >> arg1.anInt3081;
		this.anInt6040 = this.aClass2_Sub36_1.anInt5111 + local20 >> arg1.anInt3081;
		this.anInt6041 = this.aClass2_Sub36_1.anInt5115 - local20 >> arg1.anInt3081;
		this.anInt6038 = local20 + this.aClass2_Sub36_1.anInt5115 >> arg1.anInt3081;
		@Pc(71) int local71 = this.anInt6040 + 1 - this.anInt6039;
		@Pc(80) int local80 = this.anInt6038 + 1 - this.anInt6041;
		this.aFloatArrayArray6 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray7 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray8 = new float[local71 + 1][local80 + 1];
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(175) int local175;
		@Pc(190) int local190;
		for (local109 = 0; local109 <= local80; local109++) {
			local117 = this.anInt6041 + local109;
			if (local117 > 0 && this.aClass73_Sub1_3.anInt5550 - 1 > local117) {
				for (local133 = 0; local133 <= local71; local133++) {
					local145 = local133 + this.anInt6039;
					if (local145 > 0 && local145 < this.aClass73_Sub1_3.anInt5546 - 1) {
						local175 = arg1.method4931(local145 + 1, local117) - arg1.method4931(local145 - 1, local117);
						local190 = arg1.method4931(local145, local117 + 1) - arg1.method4931(local145, local117 - 1);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + local190 * local190 + 65536)));
						this.aFloatArrayArray8[local133][local109] = local205 * (float) local175;
						this.aFloatArrayArray7[local133][local109] = local205 * -256.0F;
						this.aFloatArrayArray6[local133][local109] = (float) local190 * local205;
					}
				}
			}
		}
		local109 = 0;
		local117 = 0;
		for (local133 = this.anInt6041; local133 <= this.anInt6038; local133++) {
			if (local133 >= 0 && arg1.anInt5550 > local133) {
				for (local145 = this.anInt6039; local145 <= this.anInt6040; local145++) {
					if (local145 >= 0 && arg1.anInt5546 > local145) {
						local175 = arg3[local117];
						@Pc(284) int[] local284 = arg1.anIntArrayArrayArray8[local145][local133];
						if (local284 != null && local175 != 0) {
							if (local175 == 1) {
								local109 += local284.length;
							} else {
								local109 += 3;
							}
						}
					}
					local117++;
				}
			} else {
				local117 += this.anInt6040 - this.anInt6039;
			}
		}
		if (local109 <= 0) {
			this.aClass81_13 = null;
			this.anInterface1_4 = null;
			this.aClass81_14 = null;
			this.anInterface8_6 = null;
		} else {
			this.aClass2_Sub10_8 = new Class2_Sub10(local109 * 2);
			this.aClass2_Sub10_Sub2_3 = new Class2_Sub10_Sub2(local109 * 16);
			this.aClass199_29 = new Class199(Static216.method3815(local109));
			local117 = 0;
			local133 = 0;
			for (local145 = this.anInt6041; local145 <= this.anInt6038; local145++) {
				if (local145 >= 0 && local145 < arg1.anInt5550) {
					local175 = 0;
					for (local190 = this.anInt6039; local190 <= this.anInt6040; local190++) {
						if (local190 >= 0 && local190 < arg1.anInt5546) {
							@Pc(418) int local418 = arg3[local117];
							@Pc(425) int[] local425 = arg1.anIntArrayArrayArray8[local190][local145];
							@Pc(432) int[] local432 = arg1.anIntArrayArrayArray10[local190][local145];
							if (local425 != null && local418 != 0) {
								if (local418 == 1) {
									for (@Pc(586) int local586 = 0; local586 < local425.length; local586++) {
										this.method5283(local190, local175, local432[local586], local425[local586], local133, local145);
									}
								} else if (local418 == 3) {
									this.method5283(local190, local175, 0, 0, local133, local145);
									this.method5283(local190, local175, 0, arg1.anInt3085, local133, local145);
									this.method5283(local190, local175, arg1.anInt3085, 0, local133, local145);
								} else if (local418 == 2) {
									this.method5283(local190, local175, 0, arg1.anInt3085, local133, local145);
									this.method5283(local190, local175, arg1.anInt3085, arg1.anInt3085, local133, local145);
									this.method5283(local190, local175, 0, 0, local133, local145);
								} else if (local418 == 5) {
									this.method5283(local190, local175, arg1.anInt3085, arg1.anInt3085, local133, local145);
									this.method5283(local190, local175, arg1.anInt3085, 0, local133, local145);
									this.method5283(local190, local175, 0, arg1.anInt3085, local133, local145);
								} else if (local418 == 4) {
									this.method5283(local190, local175, arg1.anInt3085, 0, local133, local145);
									this.method5283(local190, local175, 0, 0, local133, local145);
									this.method5283(local190, local175, arg1.anInt3085, arg1.anInt3085, local133, local145);
								}
							}
						}
						local117++;
						local175++;
					}
				} else {
					local117 += this.anInt6040 - this.anInt6039;
				}
				local133++;
			}
			this.anInterface1_4 = this.aClass4_Sub1_36.method566(this.aClass2_Sub10_8.aByteArray57, this.aClass2_Sub10_8.anInt4807, false);
			this.anInterface8_6 = this.aClass4_Sub1_36.method551(16, this.aClass2_Sub10_Sub2_3.aByteArray57, this.aClass2_Sub10_Sub2_3.anInt4807, false);
			this.aClass81_14 = new Class81(this.aClass4_Sub1_36, this.anInterface8_6, 5126, 3, 0);
			this.aClass81_13 = new Class81(this.aClass4_Sub1_36, this.anInterface8_6, 5121, 4, 12);
		}
		this.aClass199_29 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
		this.aClass2_Sub10_Sub2_3 = null;
		this.aClass2_Sub10_8 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V")
	private void method5283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg0 << this.aClass73_Sub1_3.anInt3081) + arg3;
		@Pc(18) int local18 = arg2 + (arg5 << this.aClass73_Sub1_3.anInt3081);
		@Pc(24) int local24 = this.aClass73_Sub1_3.method4932(local9, local18);
		if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = (long) local9 & 0xFFFFL | ((long) local18 & 0xFFFFL) << 16;
			@Pc(54) Class2 local54 = this.aClass199_29.method5751(local1);
			if (local54 != null) {
				this.method5284(((Class2_Sub15) local54).aShort28);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt6043++;
		if (local1 != -1L) {
			this.aClass199_29.method5749(new Class2_Sub15(local73), local1);
		}
		@Pc(104) float local104;
		@Pc(118) float local118;
		@Pc(111) float local111;
		@Pc(255) float local255;
		@Pc(263) float local263;
		@Pc(270) float local270;
		@Pc(277) float local277;
		@Pc(284) float local284;
		@Pc(293) float local293;
		@Pc(302) float local302;
		@Pc(311) float local311;
		if (arg3 == 0 && arg2 == 0) {
			local104 = this.aFloatArrayArray8[arg1][arg4];
			local111 = this.aFloatArrayArray6[arg1][arg4];
			local118 = this.aFloatArrayArray7[arg1][arg4];
		} else if (this.aClass73_Sub1_3.anInt3085 == arg3 && arg2 == 0) {
			local118 = this.aFloatArrayArray7[arg1 + 1][arg4];
			local111 = this.aFloatArrayArray6[arg1 + 1][arg4];
			local104 = this.aFloatArrayArray8[arg1 + 1][arg4];
		} else if (this.aClass73_Sub1_3.anInt3085 == arg3 && this.aClass73_Sub1_3.anInt3085 == arg2) {
			local104 = this.aFloatArrayArray8[arg1 + 1][arg4 + 1];
			local118 = this.aFloatArrayArray7[arg1 + 1][arg4 + 1];
			local111 = this.aFloatArrayArray6[arg1 + 1][arg4 + 1];
		} else if (arg3 == 0 && arg2 == this.aClass73_Sub1_3.anInt3085) {
			local111 = this.aFloatArrayArray6[arg1][arg4 + 1];
			local104 = this.aFloatArrayArray8[arg1][arg4 + 1];
			local118 = this.aFloatArrayArray7[arg1][arg4 + 1];
		} else {
			local255 = (float) arg3 / (float) this.aClass73_Sub1_3.anInt3085;
			local263 = (float) arg2 / (float) this.aClass73_Sub1_3.anInt3085;
			local270 = this.aFloatArrayArray8[arg1][arg4];
			local277 = this.aFloatArrayArray7[arg1][arg4];
			local284 = this.aFloatArrayArray6[arg1][arg4];
			local293 = this.aFloatArrayArray8[arg1 + 1][arg4];
			local302 = this.aFloatArrayArray7[arg1 + 1][arg4];
			local311 = this.aFloatArrayArray6[arg1 + 1][arg4];
			@Pc(326) float local326 = local270 + (this.aFloatArrayArray8[arg1][arg4 + 1] - local270) * local255;
			@Pc(343) float local343 = local302 + local255 * (this.aFloatArrayArray7[arg1 + 1][arg4 + 1] - local302);
			@Pc(358) float local358 = local284 + local255 * (this.aFloatArrayArray6[arg1][arg4 + 1] - local284);
			@Pc(374) float local374 = local277 + (this.aFloatArrayArray7[arg1][arg4 + 1] - local277) * local255;
			@Pc(391) float local391 = local293 + local255 * (this.aFloatArrayArray8[arg1 + 1][arg4 + 1] - local293);
			@Pc(409) float local409 = local311 + (this.aFloatArrayArray6[arg1 + 1][arg4 + 1] - local311) * local255;
			local118 = local374 + local263 * (local343 - local374);
			local104 = local326 + (local391 - local326) * local263;
			local111 = (local409 - local358) * local263 + local358;
		}
		local255 = this.aClass2_Sub36_1.anInt5111 - local9;
		local263 = this.aClass2_Sub36_1.anInt5109 - local24;
		local270 = this.aClass2_Sub36_1.anInt5115 - local18;
		local277 = (float) Math.sqrt((double) (local255 * local255 + local263 * local263 + local270 * local270));
		local284 = 1.0F / local277;
		local263 *= local284;
		local255 *= local284;
		local270 *= local284;
		local293 = local277 / (float) this.aClass2_Sub36_1.anInt5108;
		local302 = 1.0F - local293 * local293;
		if (local302 < 0.0F) {
			local302 = 0.0F;
		}
		local311 = local270 * local111 + local118 * local263 + local255 * local104;
		if (local311 < 0.0F) {
			local311 = 0.0F;
		}
		@Pc(535) float local535 = local302 * local311 * 2.0F;
		if (local535 > 1.0F) {
			local535 = 1.0F;
		}
		@Pc(545) int local545 = this.aClass2_Sub36_1.anInt5117;
		@Pc(555) int local555 = (int) ((float) (local545 >> 16 & 0xFF) * local535);
		if (local555 > 255) {
			local555 = 255;
		}
		@Pc(572) int local572 = (int) ((float) (local545 >> 8 & 0xFF) * local535);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local545 & 0xFF) * local535);
		if (local586 > 255) {
			local586 = 255;
		}
		if (this.aClass4_Sub1_36.aBoolean32) {
			this.aClass2_Sub10_Sub2_3.method4466((float) local9);
			this.aClass2_Sub10_Sub2_3.method4466((float) local24);
			this.aClass2_Sub10_Sub2_3.method4466((float) local18);
		} else {
			this.aClass2_Sub10_Sub2_3.method4465((float) local9);
			this.aClass2_Sub10_Sub2_3.method4465((float) local24);
			this.aClass2_Sub10_Sub2_3.method4465((float) local18);
		}
		this.aClass2_Sub10_Sub2_3.method4430(local555);
		this.aClass2_Sub10_Sub2_3.method4430(local572);
		this.aClass2_Sub10_Sub2_3.method4430(local586);
		this.aClass2_Sub10_Sub2_3.method4430(255);
		this.method5284(local73);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IS)V")
	private void method5284(@OriginalArg(1) short arg0) {
		if (this.aClass4_Sub1_36.aBoolean32) {
			this.aClass2_Sub10_8.method4452(arg0);
		} else {
			this.aClass2_Sub10_8.method4456(arg0);
		}
		this.anInt6042++;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([[ZIBII)V")
	public void method5285(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface1_4 == null || (arg3 + arg2 < this.anInt6039 || (this.anInt6040 < arg2 - arg3 || (this.anInt6041 > arg1 + arg3 || this.anInt6038 < arg1 - arg3)))) {
			return;
		}
		for (@Pc(47) int local47 = this.anInt6041; local47 <= this.anInt6038; local47++) {
			for (@Pc(58) int local58 = this.anInt6039; local58 <= this.anInt6040; local58++) {
				@Pc(71) int local71 = local58 - arg2;
				@Pc(76) int local76 = local47 - arg1;
				if (-arg3 < local71 && local71 < arg3 && local76 > -arg3 && local76 < arg3 && arg0[arg3 + local71][arg3 + local76]) {
					this.aClass4_Sub1_36.method587((int) (this.aClass2_Sub36_1.aFloat71 * 255.0F) << 24);
					this.aClass4_Sub1_36.method584(this.aClass81_14, null, this.aClass81_13, null);
					this.aClass4_Sub1_36.method567(this.anInterface1_4, 0, this.anInt6042);
					return;
				}
			}
		}
	}
}
