import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class159 {

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!sf;")
	private Class327 aClass327_11;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!en;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!sf;")
	private Class327 aClass327_12;

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!sf;")
	private Class327 aClass327_13;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[F")
	private final float[] aFloatArray20 = new float[16];

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!wja;")
	private final Class4_Sub11_Sub2 aClass4_Sub11_Sub2_2 = new Class4_Sub11_Sub2(786336);

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
	private final int anInt3728 = Static214.method3192(1600);

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "[[Lclient!qg;")
	private final Class3_Sub3_Sub1[][] aClass3_Sub3_Sub1ArrayArray1 = new Class3_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	private int anInt3729 = 0;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "[[Lclient!qg;")
	private final Class3_Sub3_Sub1[][] aClass3_Sub3_Sub1ArrayArray2 = new Class3_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "[I")
	private final int[] anIntArray262 = new int[8191];

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
	private final int[] anIntArray261 = new int[1600];

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "[I")
	private final int[] anIntArray263 = new int[64];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!pc;)V")
	private void method3420(@OriginalArg(1) Class33_Sub3 arg0) {
		arg0.method6312(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static591.aFloat207 != arg0.aFloat176) {
			arg0.xa(Static591.aFloat207);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pc;I)V")
	private void method3421(@OriginalArg(0) Class33_Sub3 arg0) {
		Static591.aFloat207 = arg0.aFloat176;
		arg0.method6346();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6312(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pc;IILclient!af;)V")
	public void method3422(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2) {
		if (arg0.aClass92_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method3427(arg1, arg0);
		} else {
			this.method3421(arg0);
		}
		@Pc(29) float local29 = arg0.aClass92_Sub2_3.aFloat85;
		@Pc(33) float local33 = arg0.aClass92_Sub2_3.aFloat79;
		@Pc(37) float local37 = arg0.aClass92_Sub2_3.aFloat76;
		@Pc(41) float local41 = arg0.aClass92_Sub2_3.aFloat83;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class3_Sub3 local51 = arg2.aClass87_1.aClass3_Sub3_7;
			@Pc(54) Class3_Sub3 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass3_Sub3_9; local54 != local51; local54 = local54.aClass3_Sub3_9) {
				@Pc(59) Class3_Sub3_Sub1 local59 = (Class3_Sub3_Sub1) local54;
				local86 = (int) ((float) (local59.anInt1699 >> 12) * local37 + (float) (local59.anInt1692 >> 12) * local29 + local33 * (float) (local59.anInt1696 >> 12) + local41);
				if (local45 > local86) {
					local45 = local86;
				}
				this.anIntArray262[local43++] = local86;
				if (local47 < local86) {
					local47 = local86;
				}
			}
			@Pc(117) int local117 = local47 - local45;
			if (local117 + 2 <= 1600) {
				local117 += 2;
				local86 = 0;
			} else {
				local86 = Static214.method3192(local117) + 1 - this.anInt3728;
				local117 = (local117 >> local86) + 2;
			}
			local43 = 0;
			local54 = local51.aClass3_Sub3_9;
			@Pc(151) int local151 = -2;
			@Pc(153) boolean local153 = true;
			@Pc(155) boolean local155 = true;
			while (local54 != local51) {
				this.anInt3729 = 0;
				for (@Pc(162) int local162 = 0; local162 < local117; local162++) {
					this.anIntArray261[local162] = 0;
				}
				for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
					this.anIntArray263[local179] = 0;
				}
				while (local51 != local54) {
					@Pc(195) Class3_Sub3_Sub1 local195 = (Class3_Sub3_Sub1) local54;
					if (local155) {
						local153 = local195.aBoolean113;
						local151 = local195.anInt1694;
						local155 = false;
					}
					if (local43 > 0 && (local195.anInt1694 != local151 || local195.aBoolean113 != local153)) {
						local155 = true;
						break;
					}
					@Pc(238) int local238 = this.anIntArray262[local43++] - local45 >> local86;
					if (local238 < 1600) {
						if (this.anIntArray261[local238] >= 64) {
							label106: {
								if (this.anIntArray261[local238] == 64) {
									if (this.anInt3729 == 64) {
										break label106;
									}
									this.anIntArray261[local238] += this.anInt3729++ + 1;
								}
								@Pc(286) Class3_Sub3_Sub1[] local286 = this.aClass3_Sub3_Sub1ArrayArray2[this.anIntArray261[local238] - 64 - 1];
								@Pc(294) int local294 = this.anIntArray261[local238] - 65;
								@Pc(296) int local296 = this.anIntArray263[this.anIntArray261[local238] - 65];
								this.anIntArray263[local294] = this.anIntArray263[this.anIntArray261[local238] - 65] + 1;
								local286[local296] = local195;
							}
						} else {
							this.aClass3_Sub3_Sub1ArrayArray1[local238][this.anIntArray261[local238]++] = local195;
						}
					}
					local54 = local54.aClass3_Sub3_9;
				}
				if (local151 >= 0) {
					arg0.method6305(local151);
				} else {
					arg0.method6305(-1);
				}
				if (local153 && arg0.aFloat176 != Static591.aFloat207) {
					arg0.xa(Static591.aFloat207);
				} else if (arg0.aFloat176 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method3423(arg0, local117);
			}
		} catch (@Pc(375) Exception local375) {
		}
		this.method3420(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pc;II)V")
	private void method3423(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray20, 0);
		@Pc(15) float local15 = this.aFloatArray20[0];
		@Pc(20) float local20 = this.aFloatArray20[4];
		@Pc(25) float local25 = this.aFloatArray20[8];
		@Pc(30) float local30 = this.aFloatArray20[1];
		@Pc(35) float local35 = this.aFloatArray20[5];
		@Pc(44) float local44 = this.aFloatArray20[9];
		@Pc(48) float local48 = local30 + local15;
		@Pc(52) float local52 = local35 + local20;
		@Pc(56) float local56 = local44 + local25;
		@Pc(61) float local61 = local15 - local30;
		@Pc(66) float local66 = local20 - local35;
		@Pc(70) float local70 = local25 - local44;
		@Pc(74) float local74 = local30 - local15;
		@Pc(78) float local78 = local35 - local20;
		@Pc(83) float local83 = local44 - local25;
		this.aClass4_Sub11_Sub2_2.anInt10466 = 0;
		@Pc(94) int local94;
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(124) Class3_Sub3_Sub1 local124;
		@Pc(127) int local127;
		@Pc(132) byte local132;
		@Pc(137) byte local137;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(151) float local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(168) int local168;
		@Pc(510) float local510;
		@Pc(515) int local515;
		@Pc(455) int local455;
		@Pc(471) Class3_Sub3_Sub1 local471;
		@Pc(474) int local474;
		@Pc(487) byte local487;
		@Pc(492) byte local492;
		@Pc(504) float local504;
		if (arg0.aBoolean555) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray261[local94] <= 64 ? this.anIntArray261[local94] : 64;
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass3_Sub3_Sub1ArrayArray1[local94][local115];
						local127 = local124.anInt1695;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = (float) (local124.anInt1692 >> 12);
						local157 = (float) (local124.anInt1696 >> 12);
						local163 = (float) (local124.anInt1699 >> 12);
						local168 = local124.anInt1698 >> 12;
						this.aClass4_Sub11_Sub2_2.method8897(0.0F);
						this.aClass4_Sub11_Sub2_2.method8897(0.0F);
						this.aClass4_Sub11_Sub2_2.method8897((float) -local168 * local48 + local151);
						this.aClass4_Sub11_Sub2_2.method8897(local157 + local52 * (float) -local168);
						this.aClass4_Sub11_Sub2_2.method8897(local56 * (float) -local168 + local163);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
						this.aClass4_Sub11_Sub2_2.method8897(1.0F);
						this.aClass4_Sub11_Sub2_2.method8897(0.0F);
						this.aClass4_Sub11_Sub2_2.method8897((float) local168 * local61 + local151);
						this.aClass4_Sub11_Sub2_2.method8897(local157 + local66 * (float) local168);
						this.aClass4_Sub11_Sub2_2.method8897(local163 + (float) local168 * local70);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
						this.aClass4_Sub11_Sub2_2.method8897(1.0F);
						this.aClass4_Sub11_Sub2_2.method8897(1.0F);
						this.aClass4_Sub11_Sub2_2.method8897(local48 * (float) local168 + local151);
						this.aClass4_Sub11_Sub2_2.method8897(local52 * (float) local168 + local157);
						this.aClass4_Sub11_Sub2_2.method8897(local56 * (float) local168 + local163);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
						this.aClass4_Sub11_Sub2_2.method8897(0.0F);
						this.aClass4_Sub11_Sub2_2.method8897(1.0F);
						this.aClass4_Sub11_Sub2_2.method8897(local151 + local74 * (float) local168);
						this.aClass4_Sub11_Sub2_2.method8897(local157 + (float) local168 * local78);
						this.aClass4_Sub11_Sub2_2.method8897(local163 + local83 * (float) local168);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
					}
					if (this.anIntArray261[local94] > 64) {
						local455 = this.anIntArray261[local94] - 64 - 1;
						for (local127 = this.anIntArray263[local455] - 1; local127 >= 0; local127--) {
							local471 = this.aClass3_Sub3_Sub1ArrayArray2[local455][local127];
							local474 = local471.anInt1695;
							local140 = (byte) (local474 >> 16);
							local145 = (byte) (local474 >> 8);
							local487 = (byte) local474;
							local492 = (byte) (local474 >>> 24);
							local163 = (float) (local471.anInt1692 >> 12);
							local504 = (float) (local471.anInt1696 >> 12);
							local510 = (float) (local471.anInt1699 >> 12);
							local515 = local471.anInt1698 >> 12;
							this.aClass4_Sub11_Sub2_2.method8897(0.0F);
							this.aClass4_Sub11_Sub2_2.method8897(0.0F);
							this.aClass4_Sub11_Sub2_2.method8897(local48 * (float) -local515 + local163);
							this.aClass4_Sub11_Sub2_2.method8897(local504 + local52 * (float) -local515);
							this.aClass4_Sub11_Sub2_2.method8897((float) -local515 * local56 + local510);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
							this.aClass4_Sub11_Sub2_2.method8897(1.0F);
							this.aClass4_Sub11_Sub2_2.method8897(0.0F);
							this.aClass4_Sub11_Sub2_2.method8897(local61 * (float) local515 + local163);
							this.aClass4_Sub11_Sub2_2.method8897(local504 + local66 * (float) local515);
							this.aClass4_Sub11_Sub2_2.method8897(local510 + local70 * (float) local515);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
							this.aClass4_Sub11_Sub2_2.method8897(1.0F);
							this.aClass4_Sub11_Sub2_2.method8897(1.0F);
							this.aClass4_Sub11_Sub2_2.method8897(local48 * (float) local515 + local163);
							this.aClass4_Sub11_Sub2_2.method8897(local504 + local52 * (float) local515);
							this.aClass4_Sub11_Sub2_2.method8897(local56 * (float) local515 + local510);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
							this.aClass4_Sub11_Sub2_2.method8897(0.0F);
							this.aClass4_Sub11_Sub2_2.method8897(1.0F);
							this.aClass4_Sub11_Sub2_2.method8897(local74 * (float) local515 + local163);
							this.aClass4_Sub11_Sub2_2.method8897(local504 + local78 * (float) local515);
							this.aClass4_Sub11_Sub2_2.method8897(local510 + (float) local515 * local83);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray261[local94] > 64 ? 64 : this.anIntArray261[local94];
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass3_Sub3_Sub1ArrayArray1[local94][local115];
						local127 = local124.anInt1695;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = (float) (local124.anInt1692 >> 12);
						local157 = (float) (local124.anInt1696 >> 12);
						local163 = (float) (local124.anInt1699 >> 12);
						local168 = local124.anInt1698 >> 12;
						this.aClass4_Sub11_Sub2_2.method8895(0.0F);
						this.aClass4_Sub11_Sub2_2.method8895(0.0F);
						this.aClass4_Sub11_Sub2_2.method8895((float) -local168 * local48 + local151);
						this.aClass4_Sub11_Sub2_2.method8895((float) -local168 * local52 + local157);
						this.aClass4_Sub11_Sub2_2.method8895(local163 + (float) -local168 * local56);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
						this.aClass4_Sub11_Sub2_2.method8895(1.0F);
						this.aClass4_Sub11_Sub2_2.method8895(0.0F);
						this.aClass4_Sub11_Sub2_2.method8895(local151 + local61 * (float) local168);
						this.aClass4_Sub11_Sub2_2.method8895(local157 + (float) local168 * local66);
						this.aClass4_Sub11_Sub2_2.method8895(local163 + local70 * (float) local168);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
						this.aClass4_Sub11_Sub2_2.method8895(1.0F);
						this.aClass4_Sub11_Sub2_2.method8895(1.0F);
						this.aClass4_Sub11_Sub2_2.method8895(local48 * (float) local168 + local151);
						this.aClass4_Sub11_Sub2_2.method8895((float) local168 * local52 + local157);
						this.aClass4_Sub11_Sub2_2.method8895(local163 + (float) local168 * local56);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
						this.aClass4_Sub11_Sub2_2.method8895(0.0F);
						this.aClass4_Sub11_Sub2_2.method8895(1.0F);
						this.aClass4_Sub11_Sub2_2.method8895((float) local168 * local74 + local151);
						this.aClass4_Sub11_Sub2_2.method8895(local78 * (float) local168 + local157);
						this.aClass4_Sub11_Sub2_2.method8895((float) local168 * local83 + local163);
						this.aClass4_Sub11_Sub2_2.method8822(local132);
						this.aClass4_Sub11_Sub2_2.method8822(local137);
						this.aClass4_Sub11_Sub2_2.method8822(local140);
						this.aClass4_Sub11_Sub2_2.method8822(local145);
					}
					if (this.anIntArray261[local94] > 64) {
						local455 = this.anIntArray261[local94] - 1 - 64;
						for (local127 = this.anIntArray263[local455] - 1; local127 >= 0; local127--) {
							local471 = this.aClass3_Sub3_Sub1ArrayArray2[local455][local127];
							local474 = local471.anInt1695;
							local140 = (byte) (local474 >> 16);
							local145 = (byte) (local474 >> 8);
							local487 = (byte) local474;
							local492 = (byte) (local474 >>> 24);
							local163 = (float) (local471.anInt1692 >> 12);
							local504 = (float) (local471.anInt1696 >> 12);
							local510 = (float) (local471.anInt1699 >> 12);
							local515 = local471.anInt1698 >> 12;
							this.aClass4_Sub11_Sub2_2.method8895(0.0F);
							this.aClass4_Sub11_Sub2_2.method8895(0.0F);
							this.aClass4_Sub11_Sub2_2.method8895(local163 + (float) -local515 * local48);
							this.aClass4_Sub11_Sub2_2.method8895(local504 + local52 * (float) -local515);
							this.aClass4_Sub11_Sub2_2.method8895(local56 * (float) -local515 + local510);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
							this.aClass4_Sub11_Sub2_2.method8895(1.0F);
							this.aClass4_Sub11_Sub2_2.method8895(0.0F);
							this.aClass4_Sub11_Sub2_2.method8895(local163 + (float) local515 * local61);
							this.aClass4_Sub11_Sub2_2.method8895(local504 + local66 * (float) local515);
							this.aClass4_Sub11_Sub2_2.method8895(local510 + (float) local515 * local70);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
							this.aClass4_Sub11_Sub2_2.method8895(1.0F);
							this.aClass4_Sub11_Sub2_2.method8895(1.0F);
							this.aClass4_Sub11_Sub2_2.method8895(local163 + local48 * (float) local515);
							this.aClass4_Sub11_Sub2_2.method8895(local52 * (float) local515 + local504);
							this.aClass4_Sub11_Sub2_2.method8895((float) local515 * local56 + local510);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
							this.aClass4_Sub11_Sub2_2.method8895(0.0F);
							this.aClass4_Sub11_Sub2_2.method8895(1.0F);
							this.aClass4_Sub11_Sub2_2.method8895((float) local515 * local74 + local163);
							this.aClass4_Sub11_Sub2_2.method8895((float) local515 * local78 + local504);
							this.aClass4_Sub11_Sub2_2.method8895((float) local515 * local83 + local510);
							this.aClass4_Sub11_Sub2_2.method8822(local140);
							this.aClass4_Sub11_Sub2_2.method8822(local145);
							this.aClass4_Sub11_Sub2_2.method8822(local487);
							this.aClass4_Sub11_Sub2_2.method8822(local492);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub11_Sub2_2.anInt10466 != 0) {
			this.anInterface11_4.method7229(this.aClass4_Sub11_Sub2_2.anInt10466, 24, this.aClass4_Sub11_Sub2_2.aByteArray107);
			arg0.method6339(this.aClass327_11, this.aClass327_13, this.aClass327_12, (Class327) null);
			arg0.method6349(this.aClass4_Sub11_Sub2_2.anInt10466 / 24);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!pc;I)V")
	public void method3426(@OriginalArg(0) Class33_Sub3 arg0) {
		this.anInterface11_4 = arg0.method6308(196584, true, (byte[]) null, 24);
		this.aClass327_11 = new Class327(this.anInterface11_4, 5126, 2, 0);
		this.aClass327_13 = new Class327(this.anInterface11_4, 5126, 3, 8);
		this.aClass327_12 = new Class327(this.anInterface11_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!pc;I)V")
	private void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) Class33_Sub3 arg1) {
		Static591.aFloat207 = arg1.aFloat176;
		arg1.method6362((float) arg0);
		arg1.method6338();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method6312(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
