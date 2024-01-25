import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fla")
public final class Class117 {

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "Lclient!rt;")
	private Interface24 anInterface24_2;

	@OriginalMember(owner = "client!fla", name = "c", descriptor = "Lclient!li;")
	private Class229 aClass229_3;

	@OriginalMember(owner = "client!fla", name = "i", descriptor = "Lclient!li;")
	private Class229 aClass229_4;

	@OriginalMember(owner = "client!fla", name = "o", descriptor = "Lclient!li;")
	private Class229 aClass229_5;

	@OriginalMember(owner = "client!fla", name = "w", descriptor = "[F")
	private final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!fla", name = "r", descriptor = "Lclient!je;")
	private final Class3_Sub28_Sub1 aClass3_Sub28_Sub1_2 = new Class3_Sub28_Sub1(786336);

	@OriginalMember(owner = "client!fla", name = "f", descriptor = "I")
	private final int anInt3260 = Static700.method9156(1600);

	@OriginalMember(owner = "client!fla", name = "g", descriptor = "[I")
	private final int[] anIntArray164 = new int[1600];

	@OriginalMember(owner = "client!fla", name = "s", descriptor = "[[Lclient!u;")
	private final Class19_Sub4_Sub1[][] aClass19_Sub4_Sub1ArrayArray1 = new Class19_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!fla", name = "n", descriptor = "[I")
	private final int[] anIntArray165 = new int[8191];

	@OriginalMember(owner = "client!fla", name = "l", descriptor = "[[Lclient!u;")
	private final Class19_Sub4_Sub1[][] aClass19_Sub4_Sub1ArrayArray2 = new Class19_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!fla", name = "h", descriptor = "[I")
	private final int[] anIntArray166 = new int[64];

	@OriginalMember(owner = "client!fla", name = "p", descriptor = "I")
	private int anInt3261 = 0;

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(BLclient!gia;)V")
	private void method2802(@OriginalArg(1) Class67_Sub2 arg0) {
		arg0.method3227(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static57.aFloat161 != arg0.aFloat70) {
			arg0.xa(Static57.aFloat161);
		}
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(Lclient!gia;IB)V")
	private void method2804(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray32, 0);
		@Pc(15) float local15 = this.aFloatArray32[0];
		@Pc(20) float local20 = this.aFloatArray32[4];
		@Pc(25) float local25 = this.aFloatArray32[8];
		@Pc(40) float local40 = this.aFloatArray32[1];
		@Pc(45) float local45 = this.aFloatArray32[5];
		@Pc(50) float local50 = this.aFloatArray32[9];
		@Pc(54) float local54 = local40 + local15;
		@Pc(58) float local58 = local45 + local20;
		@Pc(62) float local62 = local50 + local25;
		@Pc(66) float local66 = local15 - local40;
		@Pc(70) float local70 = local20 - local45;
		@Pc(75) float local75 = local25 - local50;
		@Pc(80) float local80 = local40 - local15;
		@Pc(85) float local85 = local45 - local20;
		this.aClass3_Sub28_Sub1_2.anInt6241 = 0;
		@Pc(93) float local93 = local50 - local25;
		@Pc(100) int local100;
		@Pc(118) int local118;
		@Pc(127) int local127;
		@Pc(138) Class19_Sub4_Sub1 local138;
		@Pc(141) int local141;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(154) byte local154;
		@Pc(159) byte local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(177) float local177;
		@Pc(182) int local182;
		@Pc(517) float local517;
		@Pc(522) int local522;
		@Pc(462) int local462;
		@Pc(478) Class19_Sub4_Sub1 local478;
		@Pc(481) int local481;
		@Pc(494) byte local494;
		@Pc(499) byte local499;
		@Pc(511) float local511;
		if (arg0.aBoolean322) {
			for (local100 = arg1 - 1; local100 >= 0; local100--) {
				local118 = this.anIntArray164[local100] <= 64 ? this.anIntArray164[local100] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass19_Sub4_Sub1ArrayArray1[local100][local127];
						local141 = local138.anInt3423;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt3427 >> 12);
						local171 = (float) (local138.anInt3425 >> 12);
						local177 = (float) (local138.anInt3429 >> 12);
						local182 = local138.anInt3428 >> 12;
						this.aClass3_Sub28_Sub1_2.method4573(0.0F);
						this.aClass3_Sub28_Sub1_2.method4573(0.0F);
						this.aClass3_Sub28_Sub1_2.method4573(local54 * (float) -local182 + local165);
						this.aClass3_Sub28_Sub1_2.method4573(local171 + local58 * (float) -local182);
						this.aClass3_Sub28_Sub1_2.method4573(local177 + (float) -local182 * local62);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
						this.aClass3_Sub28_Sub1_2.method4573(1.0F);
						this.aClass3_Sub28_Sub1_2.method4573(0.0F);
						this.aClass3_Sub28_Sub1_2.method4573(local165 + (float) local182 * local66);
						this.aClass3_Sub28_Sub1_2.method4573(local70 * (float) local182 + local171);
						this.aClass3_Sub28_Sub1_2.method4573(local177 + (float) local182 * local75);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
						this.aClass3_Sub28_Sub1_2.method4573(1.0F);
						this.aClass3_Sub28_Sub1_2.method4573(1.0F);
						this.aClass3_Sub28_Sub1_2.method4573((float) local182 * local54 + local165);
						this.aClass3_Sub28_Sub1_2.method4573(local171 + (float) local182 * local58);
						this.aClass3_Sub28_Sub1_2.method4573(local177 + (float) local182 * local62);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
						this.aClass3_Sub28_Sub1_2.method4573(0.0F);
						this.aClass3_Sub28_Sub1_2.method4573(1.0F);
						this.aClass3_Sub28_Sub1_2.method4573(local165 + (float) local182 * local80);
						this.aClass3_Sub28_Sub1_2.method4573(local85 * (float) local182 + local171);
						this.aClass3_Sub28_Sub1_2.method4573(local93 * (float) local182 + local177);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
					}
					if (this.anIntArray164[local100] > 64) {
						local462 = this.anIntArray164[local100] - 64 - 1;
						for (local141 = this.anIntArray166[local462] - 1; local141 >= 0; local141--) {
							local478 = this.aClass19_Sub4_Sub1ArrayArray2[local462][local141];
							local481 = local478.anInt3423;
							local154 = (byte) (local481 >> 16);
							local159 = (byte) (local481 >> 8);
							local494 = (byte) local481;
							local499 = (byte) (local481 >>> 24);
							local177 = (float) (local478.anInt3427 >> 12);
							local511 = (float) (local478.anInt3425 >> 12);
							local517 = (float) (local478.anInt3429 >> 12);
							local522 = local478.anInt3428 >> 12;
							this.aClass3_Sub28_Sub1_2.method4573(0.0F);
							this.aClass3_Sub28_Sub1_2.method4573(0.0F);
							this.aClass3_Sub28_Sub1_2.method4573((float) -local522 * local54 + local177);
							this.aClass3_Sub28_Sub1_2.method4573((float) -local522 * local58 + local511);
							this.aClass3_Sub28_Sub1_2.method4573(local517 + (float) -local522 * local62);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
							this.aClass3_Sub28_Sub1_2.method4573(1.0F);
							this.aClass3_Sub28_Sub1_2.method4573(0.0F);
							this.aClass3_Sub28_Sub1_2.method4573(local66 * (float) local522 + local177);
							this.aClass3_Sub28_Sub1_2.method4573((float) local522 * local70 + local511);
							this.aClass3_Sub28_Sub1_2.method4573((float) local522 * local75 + local517);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
							this.aClass3_Sub28_Sub1_2.method4573(1.0F);
							this.aClass3_Sub28_Sub1_2.method4573(1.0F);
							this.aClass3_Sub28_Sub1_2.method4573(local177 + (float) local522 * local54);
							this.aClass3_Sub28_Sub1_2.method4573(local511 + (float) local522 * local58);
							this.aClass3_Sub28_Sub1_2.method4573(local517 + (float) local522 * local62);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
							this.aClass3_Sub28_Sub1_2.method4573(0.0F);
							this.aClass3_Sub28_Sub1_2.method4573(1.0F);
							this.aClass3_Sub28_Sub1_2.method4573(local80 * (float) local522 + local177);
							this.aClass3_Sub28_Sub1_2.method4573(local511 + (float) local522 * local85);
							this.aClass3_Sub28_Sub1_2.method4573(local517 + local93 * (float) local522);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
						}
					}
				}
			}
		} else {
			for (local100 = arg1 - 1; local100 >= 0; local100--) {
				local118 = this.anIntArray164[local100] <= 64 ? this.anIntArray164[local100] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass19_Sub4_Sub1ArrayArray1[local100][local127];
						local141 = local138.anInt3423;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt3427 >> 12);
						local171 = (float) (local138.anInt3425 >> 12);
						local177 = (float) (local138.anInt3429 >> 12);
						local182 = local138.anInt3428 >> 12;
						this.aClass3_Sub28_Sub1_2.method4574(0.0F);
						this.aClass3_Sub28_Sub1_2.method4574(0.0F);
						this.aClass3_Sub28_Sub1_2.method4574(local165 + local54 * (float) -local182);
						this.aClass3_Sub28_Sub1_2.method4574(local58 * (float) -local182 + local171);
						this.aClass3_Sub28_Sub1_2.method4574(local177 + (float) -local182 * local62);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
						this.aClass3_Sub28_Sub1_2.method4574(1.0F);
						this.aClass3_Sub28_Sub1_2.method4574(0.0F);
						this.aClass3_Sub28_Sub1_2.method4574(local66 * (float) local182 + local165);
						this.aClass3_Sub28_Sub1_2.method4574((float) local182 * local70 + local171);
						this.aClass3_Sub28_Sub1_2.method4574(local177 + (float) local182 * local75);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
						this.aClass3_Sub28_Sub1_2.method4574(1.0F);
						this.aClass3_Sub28_Sub1_2.method4574(1.0F);
						this.aClass3_Sub28_Sub1_2.method4574(local54 * (float) local182 + local165);
						this.aClass3_Sub28_Sub1_2.method4574(local58 * (float) local182 + local171);
						this.aClass3_Sub28_Sub1_2.method4574(local62 * (float) local182 + local177);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
						this.aClass3_Sub28_Sub1_2.method4574(0.0F);
						this.aClass3_Sub28_Sub1_2.method4574(1.0F);
						this.aClass3_Sub28_Sub1_2.method4574(local165 + local80 * (float) local182);
						this.aClass3_Sub28_Sub1_2.method4574(local171 + (float) local182 * local85);
						this.aClass3_Sub28_Sub1_2.method4574(local93 * (float) local182 + local177);
						this.aClass3_Sub28_Sub1_2.method5329(local146);
						this.aClass3_Sub28_Sub1_2.method5329(local151);
						this.aClass3_Sub28_Sub1_2.method5329(local154);
						this.aClass3_Sub28_Sub1_2.method5329(local159);
					}
					if (this.anIntArray164[local100] > 64) {
						local462 = this.anIntArray164[local100] - 64 - 1;
						for (local141 = this.anIntArray166[local462] - 1; local141 >= 0; local141--) {
							local478 = this.aClass19_Sub4_Sub1ArrayArray2[local462][local141];
							local481 = local478.anInt3423;
							local154 = (byte) (local481 >> 16);
							local159 = (byte) (local481 >> 8);
							local494 = (byte) local481;
							local499 = (byte) (local481 >>> 24);
							local177 = (float) (local478.anInt3427 >> 12);
							local511 = (float) (local478.anInt3425 >> 12);
							local517 = (float) (local478.anInt3429 >> 12);
							local522 = local478.anInt3428 >> 12;
							this.aClass3_Sub28_Sub1_2.method4574(0.0F);
							this.aClass3_Sub28_Sub1_2.method4574(0.0F);
							this.aClass3_Sub28_Sub1_2.method4574((float) -local522 * local54 + local177);
							this.aClass3_Sub28_Sub1_2.method4574(local58 * (float) -local522 + local511);
							this.aClass3_Sub28_Sub1_2.method4574(local62 * (float) -local522 + local517);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
							this.aClass3_Sub28_Sub1_2.method4574(1.0F);
							this.aClass3_Sub28_Sub1_2.method4574(0.0F);
							this.aClass3_Sub28_Sub1_2.method4574(local66 * (float) local522 + local177);
							this.aClass3_Sub28_Sub1_2.method4574(local511 + local70 * (float) local522);
							this.aClass3_Sub28_Sub1_2.method4574(local517 + local75 * (float) local522);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
							this.aClass3_Sub28_Sub1_2.method4574(1.0F);
							this.aClass3_Sub28_Sub1_2.method4574(1.0F);
							this.aClass3_Sub28_Sub1_2.method4574(local177 + local54 * (float) local522);
							this.aClass3_Sub28_Sub1_2.method4574(local58 * (float) local522 + local511);
							this.aClass3_Sub28_Sub1_2.method4574(local517 + (float) local522 * local62);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
							this.aClass3_Sub28_Sub1_2.method4574(0.0F);
							this.aClass3_Sub28_Sub1_2.method4574(1.0F);
							this.aClass3_Sub28_Sub1_2.method4574(local177 + local80 * (float) local522);
							this.aClass3_Sub28_Sub1_2.method4574((float) local522 * local85 + local511);
							this.aClass3_Sub28_Sub1_2.method4574(local517 + (float) local522 * local93);
							this.aClass3_Sub28_Sub1_2.method5329(local154);
							this.aClass3_Sub28_Sub1_2.method5329(local159);
							this.aClass3_Sub28_Sub1_2.method5329(local494);
							this.aClass3_Sub28_Sub1_2.method5329(local499);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub28_Sub1_2.anInt6241 != 0) {
			this.anInterface24_2.method9135(this.aClass3_Sub28_Sub1_2.anInt6241, this.aClass3_Sub28_Sub1_2.aByteArray50, 24);
			arg0.method3283(this.aClass229_5, this.aClass229_4, this.aClass229_3, (Class229) null);
			arg0.method3287(this.aClass3_Sub28_Sub1_2.anInt6241 / 24);
		}
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(Lclient!gia;ILclient!hu;I)V")
	public void method2805(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass181_Sub2_3 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method2807(arg0);
		} else {
			this.method2806(arg2, arg0);
		}
		@Pc(33) float local33 = arg0.aClass181_Sub2_3.aFloat132;
		@Pc(37) float local37 = arg0.aClass181_Sub2_3.aFloat136;
		@Pc(41) float local41 = arg0.aClass181_Sub2_3.aFloat135;
		@Pc(45) float local45 = arg0.aClass181_Sub2_3.aFloat133;
		try {
			@Pc(47) int local47 = 0;
			@Pc(56) int local56 = Integer.MAX_VALUE;
			@Pc(58) int local58 = 0;
			@Pc(62) Class19_Sub4 local62 = arg1.aClass372_1.aClass19_Sub4_9;
			@Pc(65) Class19_Sub4 local65;
			@Pc(97) int local97;
			for (local65 = local62.aClass19_Sub4_7; local65 != local62; local65 = local65.aClass19_Sub4_7) {
				@Pc(70) Class19_Sub4_Sub1 local70 = (Class19_Sub4_Sub1) local65;
				local97 = (int) ((float) (local70.anInt3427 >> 12) * local33 + local37 * (float) (local70.anInt3425 >> 12) + local41 * (float) (local70.anInt3429 >> 12) + local45);
				if (local56 > local97) {
					local56 = local97;
				}
				if (local97 > local58) {
					local58 = local97;
				}
				this.anIntArray165[local47++] = local97;
			}
			@Pc(123) int local123 = local58 - local56;
			if (local123 + 2 > 1600) {
				local97 = Static700.method9156(local123) + 1 - this.anInt3260;
				local123 = (local123 >> local97) + 2;
			} else {
				local123 += 2;
				local97 = 0;
			}
			local65 = local62.aClass19_Sub4_7;
			local47 = 0;
			@Pc(161) int local161 = -2;
			@Pc(163) boolean local163 = true;
			@Pc(165) boolean local165 = true;
			while (local62 != local65) {
				this.anInt3261 = 0;
				for (@Pc(174) int local174 = 0; local174 < local123; local174++) {
					this.anIntArray164[local174] = 0;
				}
				for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
					this.anIntArray166[local193] = 0;
				}
				while (local65 != local62) {
					@Pc(217) Class19_Sub4_Sub1 local217 = (Class19_Sub4_Sub1) local65;
					if (local165) {
						local163 = local217.aBoolean279;
						local161 = local217.anInt3422;
						local165 = false;
					}
					if (local47 > 0 && (local217.anInt3422 != local161 || local163 != local217.aBoolean279)) {
						local165 = true;
						break;
					}
					@Pc(268) int local268 = this.anIntArray165[local47++] - local56 >> local97;
					if (local268 < 1600) {
						if (this.anIntArray164[local268] >= 64) {
							label102: {
								if (this.anIntArray164[local268] == 64) {
									if (this.anInt3261 == 64) {
										break label102;
									}
									this.anIntArray164[local268] += this.anInt3261++ + 1;
								}
								@Pc(333) Class19_Sub4_Sub1[] local333 = this.aClass19_Sub4_Sub1ArrayArray2[this.anIntArray164[local268] - 64 - 1];
								@Pc(341) int local341 = this.anIntArray164[local268] - 65;
								@Pc(343) int local343 = this.anIntArray166[this.anIntArray164[local268] - 65];
								this.anIntArray166[local341] = this.anIntArray166[this.anIntArray164[local268] - 65] + 1;
								local333[local343] = local217;
							}
						} else {
							this.aClass19_Sub4_Sub1ArrayArray1[local268][this.anIntArray164[local268]++] = local217;
						}
					}
					local65 = local65.aClass19_Sub4_7;
				}
				if (local161 < 0) {
					arg0.method3245(-1);
				} else {
					arg0.method3245(local161);
				}
				if (local163 && arg0.aFloat70 != Static57.aFloat161) {
					arg0.xa(Static57.aFloat161);
				} else if (arg0.aFloat70 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method2804(arg0, local123);
			}
		} catch (@Pc(435) Exception local435) {
		}
		this.method2802(arg0);
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(IILclient!gia;)V")
	private void method2806(@OriginalArg(0) int arg0, @OriginalArg(2) Class67_Sub2 arg1) {
		Static57.aFloat161 = arg1.aFloat70;
		arg1.method3254((float) arg0);
		arg1.method3263();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method3227(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fla", name = "a", descriptor = "(ILclient!gia;)V")
	private void method2807(@OriginalArg(1) Class67_Sub2 arg0) {
		Static57.aFloat161 = arg0.aFloat70;
		arg0.method3220();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3227(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fla", name = "b", descriptor = "(BLclient!gia;)V")
	public void method2808(@OriginalArg(1) Class67_Sub2 arg0) {
		this.anInterface24_2 = arg0.method3273(196584, true, (byte[]) null, 24);
		this.aClass229_5 = new Class229(this.anInterface24_2, 5126, 2, 0);
		this.aClass229_3 = new Class229(this.anInterface24_2, 5126, 3, 8);
		this.aClass229_4 = new Class229(this.anInterface24_2, 5121, 4, 20);
	}
}
