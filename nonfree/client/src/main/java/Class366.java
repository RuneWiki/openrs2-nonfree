import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class366 {

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "Lclient!so;")
	private Class332 aClass332_14;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Lclient!aj;")
	private Interface2 anInterface2_7;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "Lclient!so;")
	private Class332 aClass332_15;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "Lclient!so;")
	private Class332 aClass332_16;

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "[F")
	private final float[] aFloatArray76 = new float[16];

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "Lclient!fca;")
	private final Class6_Sub15_Sub2 aClass6_Sub15_Sub2_3 = new Class6_Sub15_Sub2(786336);

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
	private final int anInt9867 = Static23.method257(1600);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "[[Lclient!ts;")
	private final Class60_Sub2_Sub1[][] aClass60_Sub2_Sub1ArrayArray4 = new Class60_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "[[Lclient!ts;")
	private final Class60_Sub2_Sub1[][] aClass60_Sub2_Sub1ArrayArray3 = new Class60_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "[I")
	private final int[] anIntArray647 = new int[8191];

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
	private int anInt9868 = 0;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "[I")
	private final int[] anIntArray646 = new int[64];

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "[I")
	private final int[] anIntArray648 = new int[1600];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ml;I)V")
	public void method8565(@OriginalArg(0) Class75_Sub3 arg0) {
		this.anInterface2_7 = arg0.method5805(24, 196584, true, (byte[]) null);
		this.aClass332_15 = new Class332(this.anInterface2_7, 5126, 2, 0);
		this.aClass332_14 = new Class332(this.anInterface2_7, 5126, 3, 8);
		this.aClass332_16 = new Class332(this.anInterface2_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!kia;IILclient!ml;)V")
	public void method8566(@OriginalArg(0) Class209 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75_Sub3 arg2) {
		if (arg2.aClass109_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method8570(arg2, arg1);
		} else {
			this.method8571(arg2);
		}
		@Pc(34) float local34 = arg2.aClass109_Sub2_3.aFloat74;
		@Pc(38) float local38 = arg2.aClass109_Sub2_3.aFloat83;
		@Pc(42) float local42 = arg2.aClass109_Sub2_3.aFloat75;
		@Pc(46) float local46 = arg2.aClass109_Sub2_3.aFloat72;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class60_Sub2 local56 = arg0.aClass46_1.aClass60_Sub2_1;
			@Pc(59) Class60_Sub2 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass60_Sub2_10; local59 != local56; local59 = local59.aClass60_Sub2_10) {
				@Pc(64) Class60_Sub2_Sub1 local64 = (Class60_Sub2_Sub1) local59;
				local91 = (int) (local42 * (float) (local64.anInt5627 >> 12) + local34 * (float) (local64.anInt5624 >> 12) + local38 * (float) (local64.anInt5625 >> 12) + local46);
				this.anIntArray647[local48++] = local91;
				if (local52 < local91) {
					local52 = local91;
				}
				if (local91 < local50) {
					local50 = local91;
				}
			}
			local91 = local52 - local50;
			@Pc(136) int local136;
			if (local91 + 2 <= 1600) {
				local91 += 2;
				local136 = 0;
			} else {
				local136 = Static23.method257(local91) + 1 - this.anInt9867;
				local91 = (local91 >> local136) + 2;
			}
			local59 = local56.aClass60_Sub2_10;
			local48 = 0;
			@Pc(160) int local160 = -2;
			@Pc(162) boolean local162 = true;
			@Pc(164) boolean local164 = true;
			while (local59 != local56) {
				this.anInt9868 = 0;
				for (@Pc(173) int local173 = 0; local173 < local91; local173++) {
					this.anIntArray648[local173] = 0;
				}
				for (@Pc(192) int local192 = 0; local192 < 64; local192++) {
					this.anIntArray646[local192] = 0;
				}
				while (local56 != local59) {
					@Pc(218) Class60_Sub2_Sub1 local218 = (Class60_Sub2_Sub1) local59;
					if (local164) {
						local164 = false;
						local162 = local218.aBoolean420;
						local160 = local218.anInt5623;
					}
					if (local48 > 0 && (local218.anInt5623 != local160 || local162 != local218.aBoolean420)) {
						local164 = true;
						break;
					}
					@Pc(257) int local257 = this.anIntArray647[local48++] - local50 >> local136;
					if (local257 < 1600) {
						if (this.anIntArray648[local257] < 64) {
							this.aClass60_Sub2_Sub1ArrayArray3[local257][this.anIntArray648[local257]++] = local218;
						} else {
							label96: {
								if (this.anIntArray648[local257] == 64) {
									if (this.anInt9868 == 64) {
										break label96;
									}
									this.anIntArray648[local257] += this.anInt9868++ + 1;
								}
								@Pc(332) Class60_Sub2_Sub1[] local332 = this.aClass60_Sub2_Sub1ArrayArray4[this.anIntArray648[local257] - 65];
								@Pc(342) int local342 = this.anIntArray648[local257] - 64 - 1;
								@Pc(344) int local344 = this.anIntArray646[this.anIntArray648[local257] - 64 - 1];
								this.anIntArray646[local342] = this.anIntArray646[this.anIntArray648[local257] - 64 - 1] + 1;
								local332[local344] = local218;
							}
						}
					}
					local59 = local59.aClass60_Sub2_10;
				}
				if (local160 >= 0) {
					arg2.method5781(local160);
				} else {
					arg2.method5781(-1);
				}
				if (local162 && Static513.aFloat172 != arg2.aFloat132) {
					arg2.xa(Static513.aFloat172);
				} else if (arg2.aFloat132 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method8568(arg2, local91);
			}
		} catch (@Pc(414) Exception local414) {
		}
		this.method8569(arg2);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ml;II)V")
	private void method8568(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray76, 0);
		@Pc(20) float local20 = this.aFloatArray76[0];
		@Pc(25) float local25 = this.aFloatArray76[4];
		@Pc(30) float local30 = this.aFloatArray76[8];
		@Pc(35) float local35 = this.aFloatArray76[1];
		@Pc(40) float local40 = this.aFloatArray76[5];
		@Pc(45) float local45 = this.aFloatArray76[9];
		@Pc(49) float local49 = local20 + local35;
		@Pc(53) float local53 = local25 + local40;
		@Pc(57) float local57 = local30 + local45;
		@Pc(62) float local62 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(70) float local70 = local30 - local45;
		@Pc(75) float local75 = local35 - local20;
		@Pc(79) float local79 = local40 - local25;
		@Pc(84) float local84 = local45 - local30;
		this.aClass6_Sub15_Sub2_3.anInt3174 = 0;
		@Pc(95) int local95;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(133) Class60_Sub2_Sub1 local133;
		@Pc(136) int local136;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(149) byte local149;
		@Pc(154) byte local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(172) float local172;
		@Pc(177) int local177;
		@Pc(528) float local528;
		@Pc(533) int local533;
		@Pc(473) int local473;
		@Pc(489) Class60_Sub2_Sub1 local489;
		@Pc(492) int local492;
		@Pc(505) byte local505;
		@Pc(510) byte local510;
		@Pc(522) float local522;
		if (arg0.aBoolean480) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local113 = this.anIntArray648[local95] > 64 ? 64 : this.anIntArray648[local95];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local133 = this.aClass60_Sub2_Sub1ArrayArray3[local95][local122];
						local136 = local133.anInt5621;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = (float) (local133.anInt5624 >> 12);
						local166 = (float) (local133.anInt5625 >> 12);
						local172 = (float) (local133.anInt5627 >> 12);
						local177 = local133.anInt5628 >> 12;
						this.aClass6_Sub15_Sub2_3.method3052(0.0F);
						this.aClass6_Sub15_Sub2_3.method3052(0.0F);
						this.aClass6_Sub15_Sub2_3.method3052(local160 + local49 * (float) -local177);
						this.aClass6_Sub15_Sub2_3.method3052(local166 + local53 * (float) -local177);
						this.aClass6_Sub15_Sub2_3.method3052(local172 + (float) -local177 * local57);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
						this.aClass6_Sub15_Sub2_3.method3052(1.0F);
						this.aClass6_Sub15_Sub2_3.method3052(0.0F);
						this.aClass6_Sub15_Sub2_3.method3052(local160 + (float) local177 * local62);
						this.aClass6_Sub15_Sub2_3.method3052((float) local177 * local66 + local166);
						this.aClass6_Sub15_Sub2_3.method3052(local172 + (float) local177 * local70);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
						this.aClass6_Sub15_Sub2_3.method3052(1.0F);
						this.aClass6_Sub15_Sub2_3.method3052(1.0F);
						this.aClass6_Sub15_Sub2_3.method3052(local49 * (float) local177 + local160);
						this.aClass6_Sub15_Sub2_3.method3052(local166 + local53 * (float) local177);
						this.aClass6_Sub15_Sub2_3.method3052(local172 + (float) local177 * local57);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
						this.aClass6_Sub15_Sub2_3.method3052(0.0F);
						this.aClass6_Sub15_Sub2_3.method3052(1.0F);
						this.aClass6_Sub15_Sub2_3.method3052(local160 + (float) local177 * local75);
						this.aClass6_Sub15_Sub2_3.method3052((float) local177 * local79 + local166);
						this.aClass6_Sub15_Sub2_3.method3052(local172 + local84 * (float) local177);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
					}
					if (this.anIntArray648[local95] > 64) {
						local473 = this.anIntArray648[local95] - 1 - 64;
						for (local136 = this.anIntArray646[local473] - 1; local136 >= 0; local136--) {
							local489 = this.aClass60_Sub2_Sub1ArrayArray4[local473][local136];
							local492 = local489.anInt5621;
							local149 = (byte) (local492 >> 16);
							local154 = (byte) (local492 >> 8);
							local505 = (byte) local492;
							local510 = (byte) (local492 >>> 24);
							local172 = (float) (local489.anInt5624 >> 12);
							local522 = (float) (local489.anInt5625 >> 12);
							local528 = (float) (local489.anInt5627 >> 12);
							local533 = local489.anInt5628 >> 12;
							this.aClass6_Sub15_Sub2_3.method3052(0.0F);
							this.aClass6_Sub15_Sub2_3.method3052(0.0F);
							this.aClass6_Sub15_Sub2_3.method3052(local172 + (float) -local533 * local49);
							this.aClass6_Sub15_Sub2_3.method3052((float) -local533 * local53 + local522);
							this.aClass6_Sub15_Sub2_3.method3052((float) -local533 * local57 + local528);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
							this.aClass6_Sub15_Sub2_3.method3052(1.0F);
							this.aClass6_Sub15_Sub2_3.method3052(0.0F);
							this.aClass6_Sub15_Sub2_3.method3052((float) local533 * local62 + local172);
							this.aClass6_Sub15_Sub2_3.method3052(local66 * (float) local533 + local522);
							this.aClass6_Sub15_Sub2_3.method3052(local528 + local70 * (float) local533);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
							this.aClass6_Sub15_Sub2_3.method3052(1.0F);
							this.aClass6_Sub15_Sub2_3.method3052(1.0F);
							this.aClass6_Sub15_Sub2_3.method3052(local172 + local49 * (float) local533);
							this.aClass6_Sub15_Sub2_3.method3052(local53 * (float) local533 + local522);
							this.aClass6_Sub15_Sub2_3.method3052((float) local533 * local57 + local528);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
							this.aClass6_Sub15_Sub2_3.method3052(0.0F);
							this.aClass6_Sub15_Sub2_3.method3052(1.0F);
							this.aClass6_Sub15_Sub2_3.method3052((float) local533 * local75 + local172);
							this.aClass6_Sub15_Sub2_3.method3052((float) local533 * local79 + local522);
							this.aClass6_Sub15_Sub2_3.method3052(local528 + local84 * (float) local533);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local113 = this.anIntArray648[local95] <= 64 ? this.anIntArray648[local95] : 64;
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local133 = this.aClass60_Sub2_Sub1ArrayArray3[local95][local122];
						local136 = local133.anInt5621;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = (float) (local133.anInt5624 >> 12);
						local166 = (float) (local133.anInt5625 >> 12);
						local172 = (float) (local133.anInt5627 >> 12);
						local177 = local133.anInt5628 >> 12;
						this.aClass6_Sub15_Sub2_3.method3055(0.0F);
						this.aClass6_Sub15_Sub2_3.method3055(0.0F);
						this.aClass6_Sub15_Sub2_3.method3055(local160 + local49 * (float) -local177);
						this.aClass6_Sub15_Sub2_3.method3055(local166 + local53 * (float) -local177);
						this.aClass6_Sub15_Sub2_3.method3055(local172 + local57 * (float) -local177);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
						this.aClass6_Sub15_Sub2_3.method3055(1.0F);
						this.aClass6_Sub15_Sub2_3.method3055(0.0F);
						this.aClass6_Sub15_Sub2_3.method3055(local160 + (float) local177 * local62);
						this.aClass6_Sub15_Sub2_3.method3055((float) local177 * local66 + local166);
						this.aClass6_Sub15_Sub2_3.method3055(local172 + local70 * (float) local177);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
						this.aClass6_Sub15_Sub2_3.method3055(1.0F);
						this.aClass6_Sub15_Sub2_3.method3055(1.0F);
						this.aClass6_Sub15_Sub2_3.method3055(local160 + (float) local177 * local49);
						this.aClass6_Sub15_Sub2_3.method3055(local53 * (float) local177 + local166);
						this.aClass6_Sub15_Sub2_3.method3055(local172 + (float) local177 * local57);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
						this.aClass6_Sub15_Sub2_3.method3055(0.0F);
						this.aClass6_Sub15_Sub2_3.method3055(1.0F);
						this.aClass6_Sub15_Sub2_3.method3055(local160 + (float) local177 * local75);
						this.aClass6_Sub15_Sub2_3.method3055(local166 + (float) local177 * local79);
						this.aClass6_Sub15_Sub2_3.method3055(local172 + local84 * (float) local177);
						this.aClass6_Sub15_Sub2_3.method3016(local141);
						this.aClass6_Sub15_Sub2_3.method3016(local146);
						this.aClass6_Sub15_Sub2_3.method3016(local149);
						this.aClass6_Sub15_Sub2_3.method3016(local154);
					}
					if (this.anIntArray648[local95] > 64) {
						local473 = this.anIntArray648[local95] - 64 - 1;
						for (local136 = this.anIntArray646[local473] - 1; local136 >= 0; local136--) {
							local489 = this.aClass60_Sub2_Sub1ArrayArray4[local473][local136];
							local492 = local489.anInt5621;
							local149 = (byte) (local492 >> 16);
							local154 = (byte) (local492 >> 8);
							local505 = (byte) local492;
							local510 = (byte) (local492 >>> 24);
							local172 = (float) (local489.anInt5624 >> 12);
							local522 = (float) (local489.anInt5625 >> 12);
							local528 = (float) (local489.anInt5627 >> 12);
							local533 = local489.anInt5628 >> 12;
							this.aClass6_Sub15_Sub2_3.method3055(0.0F);
							this.aClass6_Sub15_Sub2_3.method3055(0.0F);
							this.aClass6_Sub15_Sub2_3.method3055(local172 + (float) -local533 * local49);
							this.aClass6_Sub15_Sub2_3.method3055(local522 + local53 * (float) -local533);
							this.aClass6_Sub15_Sub2_3.method3055(local57 * (float) -local533 + local528);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
							this.aClass6_Sub15_Sub2_3.method3055(1.0F);
							this.aClass6_Sub15_Sub2_3.method3055(0.0F);
							this.aClass6_Sub15_Sub2_3.method3055(local172 + (float) local533 * local62);
							this.aClass6_Sub15_Sub2_3.method3055(local66 * (float) local533 + local522);
							this.aClass6_Sub15_Sub2_3.method3055(local70 * (float) local533 + local528);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
							this.aClass6_Sub15_Sub2_3.method3055(1.0F);
							this.aClass6_Sub15_Sub2_3.method3055(1.0F);
							this.aClass6_Sub15_Sub2_3.method3055(local172 + (float) local533 * local49);
							this.aClass6_Sub15_Sub2_3.method3055(local522 + (float) local533 * local53);
							this.aClass6_Sub15_Sub2_3.method3055(local57 * (float) local533 + local528);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
							this.aClass6_Sub15_Sub2_3.method3055(0.0F);
							this.aClass6_Sub15_Sub2_3.method3055(1.0F);
							this.aClass6_Sub15_Sub2_3.method3055(local172 + (float) local533 * local75);
							this.aClass6_Sub15_Sub2_3.method3055(local79 * (float) local533 + local522);
							this.aClass6_Sub15_Sub2_3.method3055((float) local533 * local84 + local528);
							this.aClass6_Sub15_Sub2_3.method3016(local149);
							this.aClass6_Sub15_Sub2_3.method3016(local154);
							this.aClass6_Sub15_Sub2_3.method3016(local505);
							this.aClass6_Sub15_Sub2_3.method3016(local510);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub15_Sub2_3.anInt3174 != 0) {
			this.anInterface2_7.method7558(this.aClass6_Sub15_Sub2_3.anInt3174, 24, this.aClass6_Sub15_Sub2_3.aByteArray20);
			arg0.method5809(this.aClass332_16, this.aClass332_15, (Class332) null, this.aClass332_14);
			arg0.method5779(this.aClass6_Sub15_Sub2_3.anInt3174 / 24);
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lclient!ml;I)V")
	private void method8569(@OriginalArg(0) Class75_Sub3 arg0) {
		arg0.method5788(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat132 != Static513.aFloat172) {
			arg0.xa(Static513.aFloat172);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLclient!ml;I)V")
	private void method8570(@OriginalArg(1) Class75_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static513.aFloat172 = arg0.aFloat132;
		arg0.method5808((float) arg1);
		arg0.method5842();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5788(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!ml;)V")
	private void method8571(@OriginalArg(1) Class75_Sub3 arg0) {
		Static513.aFloat172 = arg0.aFloat132;
		arg0.method5792();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5788(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
