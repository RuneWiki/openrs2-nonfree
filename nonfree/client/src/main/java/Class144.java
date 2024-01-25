import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class144 {

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Lclient!mp;")
	private Interface6 anInterface6_3;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Lclient!kr;")
	private Class117 aClass117_4;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "Lclient!kr;")
	private Class117 aClass117_5;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "Lclient!kr;")
	private Class117 aClass117_6;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[F")
	private final float[] aFloatArray14 = new float[16];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "Lclient!ap;")
	private final Class3_Sub4_Sub1 aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(786336);

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "[[Lclient!in;")
	private final Class8_Sub4_Sub1[][] aClass8_Sub4_Sub1ArrayArray1 = new Class8_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "[I")
	private final int[] anIntArray350 = new int[8191];

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "[I")
	private final int[] anIntArray349 = new int[64];

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "[I")
	private final int[] anIntArray351 = new int[1600];

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "[[Lclient!in;")
	private final Class8_Sub4_Sub1[][] aClass8_Sub4_Sub1ArrayArray2 = new Class8_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
	private int anInt4337 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!se;I)V")
	private void method3720(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray14, 0);
		@Pc(11) float local11 = this.aFloatArray14[0];
		@Pc(16) float local16 = this.aFloatArray14[4];
		@Pc(21) float local21 = this.aFloatArray14[8];
		@Pc(26) float local26 = this.aFloatArray14[1];
		@Pc(31) float local31 = this.aFloatArray14[5];
		@Pc(36) float local36 = this.aFloatArray14[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass3_Sub4_Sub1_2.anInt4268 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class8_Sub4_Sub1 local113;
		@Pc(116) int local116;
		@Pc(121) byte local121;
		@Pc(126) byte local126;
		@Pc(129) byte local129;
		@Pc(134) byte local134;
		@Pc(140) float local140;
		@Pc(146) float local146;
		@Pc(152) float local152;
		@Pc(157) int local157;
		@Pc(477) int local477;
		@Pc(424) int local424;
		@Pc(433) Class8_Sub4_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean363) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray351[local83] > 64 ? 64 : this.anIntArray351[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass8_Sub4_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt2563;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2564 >> Static180.anInt3862;
						local146 = local113.anInt2558 >> Static180.anInt3862;
						local152 = local113.anInt2562 >> Static180.anInt3862;
						local157 = local113.anInt2559 >> Static180.anInt3862;
						this.aClass3_Sub4_Sub1_2.method382(0.0F);
						this.aClass3_Sub4_Sub1_2.method382(0.0F);
						this.aClass3_Sub4_Sub1_2.method382(local140 + local40 * (float) -local157);
						this.aClass3_Sub4_Sub1_2.method382(local146 + local44 * (float) -local157);
						this.aClass3_Sub4_Sub1_2.method382(local152 + local48 * (float) -local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
						this.aClass3_Sub4_Sub1_2.method382(1.0F);
						this.aClass3_Sub4_Sub1_2.method382(0.0F);
						this.aClass3_Sub4_Sub1_2.method382(local140 + local52 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method382(local146 + local56 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method382(local152 + local60 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
						this.aClass3_Sub4_Sub1_2.method382(1.0F);
						this.aClass3_Sub4_Sub1_2.method382(1.0F);
						this.aClass3_Sub4_Sub1_2.method382(local140 + local40 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method382(local146 + local44 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method382(local152 + local48 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
						this.aClass3_Sub4_Sub1_2.method382(0.0F);
						this.aClass3_Sub4_Sub1_2.method382(1.0F);
						this.aClass3_Sub4_Sub1_2.method382(local140 + local64 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method382(local146 + local68 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method382(local152 + local72 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
					}
					if (this.anIntArray351[local83] > 64) {
						local104 = this.anIntArray351[local83] - 64 - 1;
						for (local424 = this.anIntArray349[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass8_Sub4_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt2563;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2564 >> Static180.anInt3862;
							local152 = local433.anInt2558 >> Static180.anInt3862;
							local472 = local433.anInt2562 >> Static180.anInt3862;
							local477 = local433.anInt2559 >> Static180.anInt3862;
							this.aClass3_Sub4_Sub1_2.method382(0.0F);
							this.aClass3_Sub4_Sub1_2.method382(0.0F);
							this.aClass3_Sub4_Sub1_2.method382(local146 + local40 * (float) -local477);
							this.aClass3_Sub4_Sub1_2.method382(local152 + local44 * (float) -local477);
							this.aClass3_Sub4_Sub1_2.method382(local472 + local48 * (float) -local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
							this.aClass3_Sub4_Sub1_2.method382(1.0F);
							this.aClass3_Sub4_Sub1_2.method382(0.0F);
							this.aClass3_Sub4_Sub1_2.method382(local146 + local52 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method382(local152 + local56 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method382(local472 + local60 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
							this.aClass3_Sub4_Sub1_2.method382(1.0F);
							this.aClass3_Sub4_Sub1_2.method382(1.0F);
							this.aClass3_Sub4_Sub1_2.method382(local146 + local40 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method382(local152 + local44 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method382(local472 + local48 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
							this.aClass3_Sub4_Sub1_2.method382(0.0F);
							this.aClass3_Sub4_Sub1_2.method382(1.0F);
							this.aClass3_Sub4_Sub1_2.method382(local146 + local64 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method382(local152 + local68 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method382(local472 + local72 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray351[local83] > 64 ? 64 : this.anIntArray351[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass8_Sub4_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt2563;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2564 >> Static180.anInt3862;
						local146 = local113.anInt2558 >> Static180.anInt3862;
						local152 = local113.anInt2562 >> Static180.anInt3862;
						local157 = local113.anInt2559 >> Static180.anInt3862;
						this.aClass3_Sub4_Sub1_2.method383(0.0F);
						this.aClass3_Sub4_Sub1_2.method383(0.0F);
						this.aClass3_Sub4_Sub1_2.method383(local140 + local40 * (float) -local157);
						this.aClass3_Sub4_Sub1_2.method383(local146 + local44 * (float) -local157);
						this.aClass3_Sub4_Sub1_2.method383(local152 + local48 * (float) -local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
						this.aClass3_Sub4_Sub1_2.method383(1.0F);
						this.aClass3_Sub4_Sub1_2.method383(0.0F);
						this.aClass3_Sub4_Sub1_2.method383(local140 + local52 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method383(local146 + local56 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method383(local152 + local60 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
						this.aClass3_Sub4_Sub1_2.method383(1.0F);
						this.aClass3_Sub4_Sub1_2.method383(1.0F);
						this.aClass3_Sub4_Sub1_2.method383(local140 + local40 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method383(local146 + local44 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method383(local152 + local48 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
						this.aClass3_Sub4_Sub1_2.method383(0.0F);
						this.aClass3_Sub4_Sub1_2.method383(1.0F);
						this.aClass3_Sub4_Sub1_2.method383(local140 + local64 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method383(local146 + local68 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method383(local152 + local72 * (float) local157);
						this.aClass3_Sub4_Sub1_2.method3614(local121);
						this.aClass3_Sub4_Sub1_2.method3614(local126);
						this.aClass3_Sub4_Sub1_2.method3614(local129);
						this.aClass3_Sub4_Sub1_2.method3614(local134);
					}
					if (this.anIntArray351[local83] > 64) {
						local104 = this.anIntArray351[local83] - 64 - 1;
						for (local424 = this.anIntArray349[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass8_Sub4_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt2563;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2564 >> Static180.anInt3862;
							local152 = local433.anInt2558 >> Static180.anInt3862;
							local472 = local433.anInt2562 >> Static180.anInt3862;
							local477 = local433.anInt2559 >> Static180.anInt3862;
							this.aClass3_Sub4_Sub1_2.method383(0.0F);
							this.aClass3_Sub4_Sub1_2.method383(0.0F);
							this.aClass3_Sub4_Sub1_2.method383(local146 + local40 * (float) -local477);
							this.aClass3_Sub4_Sub1_2.method383(local152 + local44 * (float) -local477);
							this.aClass3_Sub4_Sub1_2.method383(local472 + local48 * (float) -local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
							this.aClass3_Sub4_Sub1_2.method383(1.0F);
							this.aClass3_Sub4_Sub1_2.method383(0.0F);
							this.aClass3_Sub4_Sub1_2.method383(local146 + local52 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method383(local152 + local56 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method383(local472 + local60 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
							this.aClass3_Sub4_Sub1_2.method383(1.0F);
							this.aClass3_Sub4_Sub1_2.method383(1.0F);
							this.aClass3_Sub4_Sub1_2.method383(local146 + local40 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method383(local152 + local44 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method383(local472 + local48 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
							this.aClass3_Sub4_Sub1_2.method383(0.0F);
							this.aClass3_Sub4_Sub1_2.method383(1.0F);
							this.aClass3_Sub4_Sub1_2.method383(local146 + local64 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method383(local152 + local68 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method383(local472 + local72 * (float) local477);
							this.aClass3_Sub4_Sub1_2.method3614(local126);
							this.aClass3_Sub4_Sub1_2.method3614(local129);
							this.aClass3_Sub4_Sub1_2.method3614(local134);
							this.aClass3_Sub4_Sub1_2.method3614(local454);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub4_Sub1_2.anInt4268 == 0) {
			return;
		}
		this.anInterface6_3.method3004(24, this.aClass3_Sub4_Sub1_2.aByteArray70, this.aClass3_Sub4_Sub1_2.anInt4268);
		arg0.method4827(0, this.aClass117_4);
		arg0.method4832(this.aClass117_5);
		arg0.method4851(this.aClass117_6);
		arg0.method4879();
		arg0.method4834(this.aClass3_Sub4_Sub1_2.anInt4268 / 24);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!se;)V")
	public void method3721(@OriginalArg(0) Class122_Sub2 arg0) {
		this.anInterface6_3 = arg0.method4883(24, null, 196584, true);
		this.aClass117_4 = new Class117(arg0, this.anInterface6_3, 5126, 2, 0);
		this.aClass117_5 = new Class117(arg0, this.anInterface6_3, 5126, 3, 8);
		this.aClass117_6 = new Class117(arg0, this.anInterface6_3, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!se;Lclient!ai;)V")
	public void method3722(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class9 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass56_Sub2_1 == null) {
			return;
		}
		this.method3724(arg0);
		@Pc(14) float local14 = arg0.aClass56_Sub2_1.aFloat45;
		@Pc(18) float local18 = arg0.aClass56_Sub2_1.aFloat41;
		@Pc(22) float local22 = arg0.aClass56_Sub2_1.aFloat40;
		@Pc(26) float local26 = arg0.aClass56_Sub2_1.aFloat42;
		try {
			@Pc(31) int local31;
			@Pc(48) Class8_Sub4_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean21) {
				local31 = arg1.anInt246 - arg1.anInt250;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class8_Sub4 local290 = arg1.aClass76_1.aClass8_Sub4_1;
				@Pc(293) Class8_Sub4 local293 = local290.aClass8_Sub4_7;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt4337 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray351[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray349[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class8_Sub4_Sub1) local293;
						if (local297) {
							local295 = local48.anInt2557;
							local297 = false;
						} else if (local295 != local48.anInt2557) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt2564 >> Static180.anInt3862) + local18 * (float) (local48.anInt2558 >> Static180.anInt3862) + local22 * (float) (local48.anInt2562 >> Static180.anInt3862) + local26) - arg1.anInt250;
						if (local75 <= 1600) {
							if (this.anIntArray351[local75] < 64) {
								this.aClass8_Sub4_Sub1ArrayArray1[local75][this.anIntArray351[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray351[local75] == 64) {
										if (this.anInt4337 == 64) {
											break label188;
										}
										this.anIntArray351[local75] += this.anInt4337++ + 1;
									}
									this.aClass8_Sub4_Sub1ArrayArray2[this.anIntArray351[local75] - 64 - 1][this.anIntArray349[this.anIntArray351[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass8_Sub4_7;
					}
					arg0.method4864(local295 >= 0 ? arg0.aClass29_1.method683(local295) : null);
					this.method3720(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class8_Sub4 local39 = arg1.aClass76_1.aClass8_Sub4_1;
				@Pc(42) Class8_Sub4 local42;
				for (local42 = local39.aClass8_Sub4_7; local42 != local39; local42 = local42.aClass8_Sub4_7) {
					local48 = (Class8_Sub4_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt2564 >> Static180.anInt3862) + local18 * (float) (local48.anInt2558 >> Static180.anInt3862) + local22 * (float) (local48.anInt2562 >> Static180.anInt3862) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray350[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass8_Sub4_7;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt4337 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray351[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray349[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class8_Sub4_Sub1 local149 = (Class8_Sub4_Sub1) local42;
						if (local113) {
							local75 = local149.anInt2557;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt2557) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray350[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray351[local173] < 64) {
								this.aClass8_Sub4_Sub1ArrayArray1[local173][this.anIntArray351[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray351[local173] == 64) {
										if (this.anInt4337 == 64) {
											break label186;
										}
										this.anIntArray351[local173] += this.anInt4337++ + 1;
									}
									this.aClass8_Sub4_Sub1ArrayArray2[this.anIntArray351[local173] - 64 - 1][this.anIntArray349[this.anIntArray351[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass8_Sub4_7;
					}
					arg0.method4864(local75 >= 0 ? arg0.aClass29_1.method683(local75) : null);
					this.method3720(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method3723(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(Lclient!se;)V")
	private void method3723(@OriginalArg(0) Class122_Sub2 arg0) {
		arg0.method4841(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(Lclient!se;)V")
	private void method3724(@OriginalArg(0) Class122_Sub2 arg0) {
		arg0.method4820();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method4841(false);
		arg0.method4810();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
