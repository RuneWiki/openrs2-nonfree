import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class247 {

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!pc;")
	private Class274 aClass274_10;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!pc;")
	private Class274 aClass274_11;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "Lclient!cq;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!pc;")
	private Class274 aClass274_12;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "[F")
	private final float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!bca;")
	private final Class2_Sub8_Sub1 aClass2_Sub8_Sub1_3 = new Class2_Sub8_Sub1(786336);

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
	private final int anInt7414 = Static8.method135(1600);

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	private int anInt7415 = 0;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "[[Lclient!bd;")
	private final Class15_Sub2_Sub1[][] aClass15_Sub2_Sub1ArrayArray3 = new Class15_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "[I")
	private final int[] anIntArray355 = new int[8191];

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "[I")
	private final int[] anIntArray354 = new int[64];

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "[[Lclient!bd;")
	private final Class15_Sub2_Sub1[][] aClass15_Sub2_Sub1ArrayArray4 = new Class15_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "[I")
	private final int[] anIntArray353 = new int[1600];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!gka;Lclient!lea;IB)V")
	public void method6592(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class101_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aClass76_Sub1_3 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method6595(arg1);
		} else {
			this.method6594(arg1, arg2);
		}
		@Pc(29) float local29 = arg1.aClass76_Sub1_3.aFloat103;
		@Pc(33) float local33 = arg1.aClass76_Sub1_3.aFloat95;
		@Pc(37) float local37 = arg1.aClass76_Sub1_3.aFloat102;
		@Pc(41) float local41 = arg1.aClass76_Sub1_3.aFloat93;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(51) int local51 = 0;
			@Pc(55) Class15_Sub2 local55 = arg0.aClass390_1.aClass15_Sub2_9;
			@Pc(58) Class15_Sub2 local58;
			@Pc(90) int local90;
			for (local58 = local55.aClass15_Sub2_8; local58 != local55; local58 = local58.aClass15_Sub2_8) {
				@Pc(63) Class15_Sub2_Sub1 local63 = (Class15_Sub2_Sub1) local58;
				local90 = (int) (local41 + (float) (local63.anInt10900 >> 12) * local37 + (float) (local63.anInt10896 >> 12) * local29 + (float) (local63.anInt10899 >> 12) * local33);
				if (local90 < local45) {
					local45 = local90;
				}
				this.anIntArray355[local43++] = local90;
				if (local90 > local51) {
					local51 = local90;
				}
			}
			@Pc(124) int local124 = local51 - local45;
			if (local124 + 2 <= 1600) {
				local90 = 0;
				local124 += 2;
			} else {
				local90 = Static8.method135(local124) + 1 - this.anInt7414;
				local124 = (local124 >> local90) + 2;
			}
			local43 = 0;
			local58 = local55.aClass15_Sub2_8;
			@Pc(158) int local158 = -2;
			@Pc(160) boolean local160 = true;
			@Pc(162) boolean local162 = true;
			while (local58 != local55) {
				this.anInt7415 = 0;
				for (@Pc(169) int local169 = 0; local169 < local124; local169++) {
					this.anIntArray353[local169] = 0;
				}
				for (@Pc(182) int local182 = 0; local182 < 64; local182++) {
					this.anIntArray354[local182] = 0;
				}
				while (local55 != local58) {
					@Pc(198) Class15_Sub2_Sub1 local198 = (Class15_Sub2_Sub1) local58;
					if (local162) {
						local160 = local198.aBoolean784;
						local162 = false;
						local158 = local198.anInt10902;
					}
					if (local43 > 0 && (local158 != local198.anInt10902 || local198.aBoolean784 != local160)) {
						local162 = true;
						break;
					}
					@Pc(236) int local236 = this.anIntArray355[local43++] - local45 >> local90;
					if (local236 < 1600) {
						if (this.anIntArray353[local236] < 64) {
							this.aClass15_Sub2_Sub1ArrayArray3[local236][this.anIntArray353[local236]++] = local198;
						} else {
							label96: {
								if (this.anIntArray353[local236] == 64) {
									if (this.anInt7415 == 64) {
										break label96;
									}
									this.anIntArray353[local236] += this.anInt7415++ + 1;
								}
								@Pc(304) Class15_Sub2_Sub1[] local304 = this.aClass15_Sub2_Sub1ArrayArray4[this.anIntArray353[local236] - 64 - 1];
								@Pc(312) int local312 = this.anIntArray353[local236] - 65;
								@Pc(314) int local314 = this.anIntArray354[this.anIntArray353[local236] - 65];
								this.anIntArray354[local312] = this.anIntArray354[this.anIntArray353[local236] - 65] + 1;
								local304[local314] = local198;
							}
						}
					}
					local58 = local58.aClass15_Sub2_8;
				}
				if (local158 < 0) {
					arg1.method5670(-1);
				} else {
					arg1.method5670(local158);
				}
				if (local160 && arg1.aFloat133 != Static512.aFloat179) {
					arg1.xa(Static512.aFloat179);
				} else if (arg1.aFloat133 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method6596(arg1, local124);
			}
		} catch (@Pc(368) Exception local368) {
		}
		this.method6593(arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!lea;)V")
	private void method6593(@OriginalArg(1) Class101_Sub2 arg0) {
		arg0.method5683(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat133 != Static512.aFloat179) {
			arg0.xa(Static512.aFloat179);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!lea;II)V")
	private void method6594(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static512.aFloat179 = arg0.aFloat133;
		arg0.method5625((float) arg1);
		arg0.method5666();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5683(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!lea;I)V")
	private void method6595(@OriginalArg(0) Class101_Sub2 arg0) {
		Static512.aFloat179 = arg0.aFloat133;
		arg0.method5620();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5683(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLclient!lea;I)V")
	private void method6596(@OriginalArg(1) Class101_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray50, 0);
		@Pc(15) float local15 = this.aFloatArray50[0];
		@Pc(20) float local20 = this.aFloatArray50[4];
		@Pc(25) float local25 = this.aFloatArray50[8];
		@Pc(30) float local30 = this.aFloatArray50[1];
		@Pc(39) float local39 = this.aFloatArray50[5];
		@Pc(44) float local44 = this.aFloatArray50[9];
		@Pc(48) float local48 = local30 + local15;
		@Pc(52) float local52 = local20 + local39;
		@Pc(56) float local56 = local44 + local25;
		@Pc(60) float local60 = local15 - local30;
		@Pc(64) float local64 = local20 - local39;
		@Pc(68) float local68 = local25 - local44;
		@Pc(73) float local73 = local30 - local15;
		@Pc(78) float local78 = local39 - local20;
		this.aClass2_Sub8_Sub1_3.anInt5725 = 0;
		@Pc(87) float local87 = local44 - local25;
		@Pc(94) int local94;
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(124) Class15_Sub2_Sub1 local124;
		@Pc(127) int local127;
		@Pc(132) byte local132;
		@Pc(137) byte local137;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(151) float local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(168) int local168;
		@Pc(484) float local484;
		@Pc(489) int local489;
		@Pc(429) int local429;
		@Pc(445) Class15_Sub2_Sub1 local445;
		@Pc(448) int local448;
		@Pc(461) byte local461;
		@Pc(466) byte local466;
		@Pc(478) float local478;
		if (arg0.aBoolean470) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray353[local94] <= 64 ? this.anIntArray353[local94] : 64;
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass15_Sub2_Sub1ArrayArray3[local94][local115];
						local127 = local124.anInt10898;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = (float) (local124.anInt10896 >> 12);
						local157 = (float) (local124.anInt10899 >> 12);
						local163 = (float) (local124.anInt10900 >> 12);
						local168 = local124.anInt10903 >> 12;
						this.aClass2_Sub8_Sub1_3.method789(0.0F);
						this.aClass2_Sub8_Sub1_3.method789(0.0F);
						this.aClass2_Sub8_Sub1_3.method789(local48 * (float) -local168 + local151);
						this.aClass2_Sub8_Sub1_3.method789((float) -local168 * local52 + local157);
						this.aClass2_Sub8_Sub1_3.method789((float) -local168 * local56 + local163);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
						this.aClass2_Sub8_Sub1_3.method789(1.0F);
						this.aClass2_Sub8_Sub1_3.method789(0.0F);
						this.aClass2_Sub8_Sub1_3.method789((float) local168 * local60 + local151);
						this.aClass2_Sub8_Sub1_3.method789(local157 + (float) local168 * local64);
						this.aClass2_Sub8_Sub1_3.method789(local163 + local68 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
						this.aClass2_Sub8_Sub1_3.method789(1.0F);
						this.aClass2_Sub8_Sub1_3.method789(1.0F);
						this.aClass2_Sub8_Sub1_3.method789(local151 + local48 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method789(local157 + local52 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method789(local56 * (float) local168 + local163);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
						this.aClass2_Sub8_Sub1_3.method789(0.0F);
						this.aClass2_Sub8_Sub1_3.method789(1.0F);
						this.aClass2_Sub8_Sub1_3.method789(local151 + local73 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method789((float) local168 * local78 + local157);
						this.aClass2_Sub8_Sub1_3.method789(local163 + local87 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
					}
					if (this.anIntArray353[local94] > 64) {
						local429 = this.anIntArray353[local94] - 64 - 1;
						for (local127 = this.anIntArray354[local429] - 1; local127 >= 0; local127--) {
							local445 = this.aClass15_Sub2_Sub1ArrayArray4[local429][local127];
							local448 = local445.anInt10898;
							local140 = (byte) (local448 >> 16);
							local145 = (byte) (local448 >> 8);
							local461 = (byte) local448;
							local466 = (byte) (local448 >>> 24);
							local163 = (float) (local445.anInt10896 >> 12);
							local478 = (float) (local445.anInt10899 >> 12);
							local484 = (float) (local445.anInt10900 >> 12);
							local489 = local445.anInt10903 >> 12;
							this.aClass2_Sub8_Sub1_3.method789(0.0F);
							this.aClass2_Sub8_Sub1_3.method789(0.0F);
							this.aClass2_Sub8_Sub1_3.method789(local48 * (float) -local489 + local163);
							this.aClass2_Sub8_Sub1_3.method789(local478 + local52 * (float) -local489);
							this.aClass2_Sub8_Sub1_3.method789((float) -local489 * local56 + local484);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
							this.aClass2_Sub8_Sub1_3.method789(1.0F);
							this.aClass2_Sub8_Sub1_3.method789(0.0F);
							this.aClass2_Sub8_Sub1_3.method789(local163 + (float) local489 * local60);
							this.aClass2_Sub8_Sub1_3.method789(local478 + local64 * (float) local489);
							this.aClass2_Sub8_Sub1_3.method789(local68 * (float) local489 + local484);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
							this.aClass2_Sub8_Sub1_3.method789(1.0F);
							this.aClass2_Sub8_Sub1_3.method789(1.0F);
							this.aClass2_Sub8_Sub1_3.method789(local163 + local48 * (float) local489);
							this.aClass2_Sub8_Sub1_3.method789(local478 + (float) local489 * local52);
							this.aClass2_Sub8_Sub1_3.method789((float) local489 * local56 + local484);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
							this.aClass2_Sub8_Sub1_3.method789(0.0F);
							this.aClass2_Sub8_Sub1_3.method789(1.0F);
							this.aClass2_Sub8_Sub1_3.method789((float) local489 * local73 + local163);
							this.aClass2_Sub8_Sub1_3.method789(local78 * (float) local489 + local478);
							this.aClass2_Sub8_Sub1_3.method789(local484 + local87 * (float) local489);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray353[local94] > 64 ? 64 : this.anIntArray353[local94];
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass15_Sub2_Sub1ArrayArray3[local94][local115];
						local127 = local124.anInt10898;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = (float) (local124.anInt10896 >> 12);
						local157 = (float) (local124.anInt10899 >> 12);
						local163 = (float) (local124.anInt10900 >> 12);
						local168 = local124.anInt10903 >> 12;
						this.aClass2_Sub8_Sub1_3.method788(0.0F);
						this.aClass2_Sub8_Sub1_3.method788(0.0F);
						this.aClass2_Sub8_Sub1_3.method788(local151 + (float) -local168 * local48);
						this.aClass2_Sub8_Sub1_3.method788(local157 + (float) -local168 * local52);
						this.aClass2_Sub8_Sub1_3.method788((float) -local168 * local56 + local163);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
						this.aClass2_Sub8_Sub1_3.method788(1.0F);
						this.aClass2_Sub8_Sub1_3.method788(0.0F);
						this.aClass2_Sub8_Sub1_3.method788(local151 + local60 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method788((float) local168 * local64 + local157);
						this.aClass2_Sub8_Sub1_3.method788(local68 * (float) local168 + local163);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
						this.aClass2_Sub8_Sub1_3.method788(1.0F);
						this.aClass2_Sub8_Sub1_3.method788(1.0F);
						this.aClass2_Sub8_Sub1_3.method788(local48 * (float) local168 + local151);
						this.aClass2_Sub8_Sub1_3.method788(local157 + local52 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method788((float) local168 * local56 + local163);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
						this.aClass2_Sub8_Sub1_3.method788(0.0F);
						this.aClass2_Sub8_Sub1_3.method788(1.0F);
						this.aClass2_Sub8_Sub1_3.method788(local151 + (float) local168 * local73);
						this.aClass2_Sub8_Sub1_3.method788(local157 + (float) local168 * local78);
						this.aClass2_Sub8_Sub1_3.method788(local163 + local87 * (float) local168);
						this.aClass2_Sub8_Sub1_3.method5170(local132);
						this.aClass2_Sub8_Sub1_3.method5170(local137);
						this.aClass2_Sub8_Sub1_3.method5170(local140);
						this.aClass2_Sub8_Sub1_3.method5170(local145);
					}
					if (this.anIntArray353[local94] > 64) {
						local429 = this.anIntArray353[local94] - 1 - 64;
						for (local127 = this.anIntArray354[local429] - 1; local127 >= 0; local127--) {
							local445 = this.aClass15_Sub2_Sub1ArrayArray4[local429][local127];
							local448 = local445.anInt10898;
							local140 = (byte) (local448 >> 16);
							local145 = (byte) (local448 >> 8);
							local461 = (byte) local448;
							local466 = (byte) (local448 >>> 24);
							local163 = (float) (local445.anInt10896 >> 12);
							local478 = (float) (local445.anInt10899 >> 12);
							local484 = (float) (local445.anInt10900 >> 12);
							local489 = local445.anInt10903 >> 12;
							this.aClass2_Sub8_Sub1_3.method788(0.0F);
							this.aClass2_Sub8_Sub1_3.method788(0.0F);
							this.aClass2_Sub8_Sub1_3.method788(local163 + local48 * (float) -local489);
							this.aClass2_Sub8_Sub1_3.method788(local478 + (float) -local489 * local52);
							this.aClass2_Sub8_Sub1_3.method788(local484 + local56 * (float) -local489);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
							this.aClass2_Sub8_Sub1_3.method788(1.0F);
							this.aClass2_Sub8_Sub1_3.method788(0.0F);
							this.aClass2_Sub8_Sub1_3.method788((float) local489 * local60 + local163);
							this.aClass2_Sub8_Sub1_3.method788(local64 * (float) local489 + local478);
							this.aClass2_Sub8_Sub1_3.method788(local68 * (float) local489 + local484);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
							this.aClass2_Sub8_Sub1_3.method788(1.0F);
							this.aClass2_Sub8_Sub1_3.method788(1.0F);
							this.aClass2_Sub8_Sub1_3.method788(local163 + local48 * (float) local489);
							this.aClass2_Sub8_Sub1_3.method788(local52 * (float) local489 + local478);
							this.aClass2_Sub8_Sub1_3.method788(local484 + local56 * (float) local489);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
							this.aClass2_Sub8_Sub1_3.method788(0.0F);
							this.aClass2_Sub8_Sub1_3.method788(1.0F);
							this.aClass2_Sub8_Sub1_3.method788(local163 + local73 * (float) local489);
							this.aClass2_Sub8_Sub1_3.method788(local78 * (float) local489 + local478);
							this.aClass2_Sub8_Sub1_3.method788(local484 + (float) local489 * local87);
							this.aClass2_Sub8_Sub1_3.method5170(local140);
							this.aClass2_Sub8_Sub1_3.method5170(local145);
							this.aClass2_Sub8_Sub1_3.method5170(local461);
							this.aClass2_Sub8_Sub1_3.method5170(local466);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub8_Sub1_3.anInt5725 != 0) {
			this.anInterface2_5.method6366(this.aClass2_Sub8_Sub1_3.lb, this.aClass2_Sub8_Sub1_3.anInt5725, 24);
			arg0.method5650((Class274) null, this.aClass274_12, this.aClass274_10, this.aClass274_11);
			arg0.method5648(this.aClass2_Sub8_Sub1_3.anInt5725 / 24);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Lclient!lea;I)V")
	public void method6597(@OriginalArg(0) Class101_Sub2 arg0) {
		this.anInterface2_5 = arg0.method5642((byte[]) null, 24, 196584, true);
		this.aClass274_11 = new Class274(this.anInterface2_5, 5126, 2, 0);
		this.aClass274_12 = new Class274(this.anInterface2_5, 5126, 3, 8);
		this.aClass274_10 = new Class274(this.anInterface2_5, 5121, 4, 20);
	}
}
