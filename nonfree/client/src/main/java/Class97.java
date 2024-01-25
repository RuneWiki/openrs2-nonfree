import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class97 {

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Lclient!se;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!tp;")
	private Class238 aClass238_3;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!tp;")
	private Class238 aClass238_4;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!tp;")
	private Class238 aClass238_5;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "[F")
	private final float[] aFloatArray8 = new float[16];

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!uo;")
	private final Class1_Sub28_Sub2 aClass1_Sub28_Sub2_2 = new Class1_Sub28_Sub2(786336);

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	private final int anInt2527 = Static428.method5666(1600);

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
	private final int[] anIntArray171 = new int[1600];

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "[[Lclient!ls;")
	private final Class4_Sub1_Sub2[][] aClass4_Sub1_Sub2ArrayArray2 = new Class4_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	private int anInt2529 = 0;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
	private final int[] anIntArray172 = new int[64];

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "[[Lclient!ls;")
	private final Class4_Sub1_Sub2[][] aClass4_Sub1_Sub2ArrayArray1 = new Class4_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "[I")
	private final int[] anIntArray173 = new int[8191];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ur;II)V")
	private void method2177(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray8, 0);
		@Pc(15) float local15 = this.aFloatArray8[0];
		@Pc(20) float local20 = this.aFloatArray8[4];
		@Pc(25) float local25 = this.aFloatArray8[8];
		@Pc(30) float local30 = this.aFloatArray8[1];
		@Pc(35) float local35 = this.aFloatArray8[5];
		@Pc(40) float local40 = this.aFloatArray8[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(62) float local62 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(70) float local70 = local30 - local15;
		@Pc(74) float local74 = local35 - local20;
		@Pc(78) float local78 = local40 - local25;
		this.aClass1_Sub28_Sub2_2.anInt6812 = 0;
		@Pc(89) int local89;
		@Pc(104) int local104;
		@Pc(113) int local113;
		@Pc(122) Class4_Sub1_Sub2 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(484) float local484;
		@Pc(489) int local489;
		@Pc(429) int local429;
		@Pc(445) Class4_Sub1_Sub2 local445;
		@Pc(448) int local448;
		@Pc(461) byte local461;
		@Pc(466) byte local466;
		@Pc(478) float local478;
		if (arg0.aBoolean751) {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local104 = this.anIntArray171[local89] <= 64 ? this.anIntArray171[local89] : 64;
				if (local104 > 0) {
					for (local113 = local104 - 1; local113 >= 0; local113--) {
						local122 = this.aClass4_Sub1_Sub2ArrayArray2[local89][local113];
						local125 = local122.anInt5822;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt5820 >> 12;
						local155 = local122.anInt5823 >> 12;
						local161 = local122.anInt5814 >> 12;
						local166 = local122.anInt5819 >> 12;
						this.aClass1_Sub28_Sub2_2.method5401(0.0F);
						this.aClass1_Sub28_Sub2_2.method5401(0.0F);
						this.aClass1_Sub28_Sub2_2.method5401((float) -local166 * local44 + local149);
						this.aClass1_Sub28_Sub2_2.method5401(local155 + local48 * (float) -local166);
						this.aClass1_Sub28_Sub2_2.method5401(local161 + local52 * (float) -local166);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
						this.aClass1_Sub28_Sub2_2.method5401(1.0F);
						this.aClass1_Sub28_Sub2_2.method5401(0.0F);
						this.aClass1_Sub28_Sub2_2.method5401(local57 * (float) local166 + local149);
						this.aClass1_Sub28_Sub2_2.method5401((float) local166 * local62 + local155);
						this.aClass1_Sub28_Sub2_2.method5401(local66 * (float) local166 + local161);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
						this.aClass1_Sub28_Sub2_2.method5401(1.0F);
						this.aClass1_Sub28_Sub2_2.method5401(1.0F);
						this.aClass1_Sub28_Sub2_2.method5401((float) local166 * local44 + local149);
						this.aClass1_Sub28_Sub2_2.method5401(local155 + (float) local166 * local48);
						this.aClass1_Sub28_Sub2_2.method5401(local161 + (float) local166 * local52);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
						this.aClass1_Sub28_Sub2_2.method5401(0.0F);
						this.aClass1_Sub28_Sub2_2.method5401(1.0F);
						this.aClass1_Sub28_Sub2_2.method5401(local149 + (float) local166 * local70);
						this.aClass1_Sub28_Sub2_2.method5401((float) local166 * local74 + local155);
						this.aClass1_Sub28_Sub2_2.method5401((float) local166 * local78 + local161);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
					}
					if (this.anIntArray171[local89] > 64) {
						local429 = this.anIntArray171[local89] - 64 - 1;
						for (local125 = this.anIntArray172[local429] - 1; local125 >= 0; local125--) {
							local445 = this.aClass4_Sub1_Sub2ArrayArray1[local429][local125];
							local448 = local445.anInt5822;
							local138 = (byte) (local448 >> 16);
							local143 = (byte) (local448 >> 8);
							local461 = (byte) local448;
							local466 = (byte) (local448 >>> 24);
							local161 = local445.anInt5820 >> 12;
							local478 = local445.anInt5823 >> 12;
							local484 = local445.anInt5814 >> 12;
							local489 = local445.anInt5819 >> 12;
							this.aClass1_Sub28_Sub2_2.method5401(0.0F);
							this.aClass1_Sub28_Sub2_2.method5401(0.0F);
							this.aClass1_Sub28_Sub2_2.method5401(local44 * (float) -local489 + local161);
							this.aClass1_Sub28_Sub2_2.method5401((float) -local489 * local48 + local478);
							this.aClass1_Sub28_Sub2_2.method5401(local52 * (float) -local489 + local484);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
							this.aClass1_Sub28_Sub2_2.method5401(1.0F);
							this.aClass1_Sub28_Sub2_2.method5401(0.0F);
							this.aClass1_Sub28_Sub2_2.method5401(local161 + (float) local489 * local57);
							this.aClass1_Sub28_Sub2_2.method5401(local62 * (float) local489 + local478);
							this.aClass1_Sub28_Sub2_2.method5401(local484 + (float) local489 * local66);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
							this.aClass1_Sub28_Sub2_2.method5401(1.0F);
							this.aClass1_Sub28_Sub2_2.method5401(1.0F);
							this.aClass1_Sub28_Sub2_2.method5401((float) local489 * local44 + local161);
							this.aClass1_Sub28_Sub2_2.method5401(local478 + local48 * (float) local489);
							this.aClass1_Sub28_Sub2_2.method5401(local484 + (float) local489 * local52);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
							this.aClass1_Sub28_Sub2_2.method5401(0.0F);
							this.aClass1_Sub28_Sub2_2.method5401(1.0F);
							this.aClass1_Sub28_Sub2_2.method5401(local70 * (float) local489 + local161);
							this.aClass1_Sub28_Sub2_2.method5401(local74 * (float) local489 + local478);
							this.aClass1_Sub28_Sub2_2.method5401(local78 * (float) local489 + local484);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
						}
					}
				}
			}
		} else {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local104 = this.anIntArray171[local89] > 64 ? 64 : this.anIntArray171[local89];
				if (local104 > 0) {
					for (local113 = local104 - 1; local113 >= 0; local113--) {
						local122 = this.aClass4_Sub1_Sub2ArrayArray2[local89][local113];
						local125 = local122.anInt5822;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt5820 >> 12;
						local155 = local122.anInt5823 >> 12;
						local161 = local122.anInt5814 >> 12;
						local166 = local122.anInt5819 >> 12;
						this.aClass1_Sub28_Sub2_2.method5400(0.0F);
						this.aClass1_Sub28_Sub2_2.method5400(0.0F);
						this.aClass1_Sub28_Sub2_2.method5400(local149 + (float) -local166 * local44);
						this.aClass1_Sub28_Sub2_2.method5400(local155 + local48 * (float) -local166);
						this.aClass1_Sub28_Sub2_2.method5400(local161 + (float) -local166 * local52);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
						this.aClass1_Sub28_Sub2_2.method5400(1.0F);
						this.aClass1_Sub28_Sub2_2.method5400(0.0F);
						this.aClass1_Sub28_Sub2_2.method5400(local149 + (float) local166 * local57);
						this.aClass1_Sub28_Sub2_2.method5400(local155 + (float) local166 * local62);
						this.aClass1_Sub28_Sub2_2.method5400((float) local166 * local66 + local161);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
						this.aClass1_Sub28_Sub2_2.method5400(1.0F);
						this.aClass1_Sub28_Sub2_2.method5400(1.0F);
						this.aClass1_Sub28_Sub2_2.method5400(local44 * (float) local166 + local149);
						this.aClass1_Sub28_Sub2_2.method5400(local48 * (float) local166 + local155);
						this.aClass1_Sub28_Sub2_2.method5400(local161 + local52 * (float) local166);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
						this.aClass1_Sub28_Sub2_2.method5400(0.0F);
						this.aClass1_Sub28_Sub2_2.method5400(1.0F);
						this.aClass1_Sub28_Sub2_2.method5400(local70 * (float) local166 + local149);
						this.aClass1_Sub28_Sub2_2.method5400((float) local166 * local74 + local155);
						this.aClass1_Sub28_Sub2_2.method5400(local161 + local78 * (float) local166);
						this.aClass1_Sub28_Sub2_2.method5398(local130);
						this.aClass1_Sub28_Sub2_2.method5398(local135);
						this.aClass1_Sub28_Sub2_2.method5398(local138);
						this.aClass1_Sub28_Sub2_2.method5398(local143);
					}
					if (this.anIntArray171[local89] > 64) {
						local429 = this.anIntArray171[local89] - 64 - 1;
						for (local125 = this.anIntArray172[local429] - 1; local125 >= 0; local125--) {
							local445 = this.aClass4_Sub1_Sub2ArrayArray1[local429][local125];
							local448 = local445.anInt5822;
							local138 = (byte) (local448 >> 16);
							local143 = (byte) (local448 >> 8);
							local461 = (byte) local448;
							local466 = (byte) (local448 >>> 24);
							local161 = local445.anInt5820 >> 12;
							local478 = local445.anInt5823 >> 12;
							local484 = local445.anInt5814 >> 12;
							local489 = local445.anInt5819 >> 12;
							this.aClass1_Sub28_Sub2_2.method5400(0.0F);
							this.aClass1_Sub28_Sub2_2.method5400(0.0F);
							this.aClass1_Sub28_Sub2_2.method5400(local161 + (float) -local489 * local44);
							this.aClass1_Sub28_Sub2_2.method5400(local478 + local48 * (float) -local489);
							this.aClass1_Sub28_Sub2_2.method5400(local52 * (float) -local489 + local484);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
							this.aClass1_Sub28_Sub2_2.method5400(1.0F);
							this.aClass1_Sub28_Sub2_2.method5400(0.0F);
							this.aClass1_Sub28_Sub2_2.method5400((float) local489 * local57 + local161);
							this.aClass1_Sub28_Sub2_2.method5400(local62 * (float) local489 + local478);
							this.aClass1_Sub28_Sub2_2.method5400(local484 + local66 * (float) local489);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
							this.aClass1_Sub28_Sub2_2.method5400(1.0F);
							this.aClass1_Sub28_Sub2_2.method5400(1.0F);
							this.aClass1_Sub28_Sub2_2.method5400(local161 + local44 * (float) local489);
							this.aClass1_Sub28_Sub2_2.method5400(local48 * (float) local489 + local478);
							this.aClass1_Sub28_Sub2_2.method5400(local484 + (float) local489 * local52);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
							this.aClass1_Sub28_Sub2_2.method5400(0.0F);
							this.aClass1_Sub28_Sub2_2.method5400(1.0F);
							this.aClass1_Sub28_Sub2_2.method5400(local161 + (float) local489 * local70);
							this.aClass1_Sub28_Sub2_2.method5400((float) local489 * local74 + local478);
							this.aClass1_Sub28_Sub2_2.method5400(local484 + (float) local489 * local78);
							this.aClass1_Sub28_Sub2_2.method5398(local138);
							this.aClass1_Sub28_Sub2_2.method5398(local143);
							this.aClass1_Sub28_Sub2_2.method5398(local461);
							this.aClass1_Sub28_Sub2_2.method5398(local466);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub28_Sub2_2.anInt6812 != 0) {
			this.anInterface10_2.method5245(this.aClass1_Sub28_Sub2_2.aByteArray86, 24, this.aClass1_Sub28_Sub2_2.anInt6812);
			arg0.method5550(this.aClass238_4, this.aClass238_5, this.aClass238_3, null);
			arg0.method5552(this.aClass1_Sub28_Sub2_2.anInt6812 / 24);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!eu;Lclient!ur;I)V")
	public void method2179(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class34_Sub2 arg1) {
		if (arg1.aClass32_Sub2_4 == null) {
			return;
		}
		this.method2180(arg1);
		@Pc(23) float local23 = arg1.aClass32_Sub2_4.aFloat56;
		@Pc(27) float local27 = arg1.aClass32_Sub2_4.aFloat46;
		@Pc(31) float local31 = arg1.aClass32_Sub2_4.aFloat47;
		@Pc(35) float local35 = arg1.aClass32_Sub2_4.aFloat51;
		try {
			@Pc(40) int local40;
			@Pc(42) int local42;
			@Pc(48) Class4_Sub1 local48;
			@Pc(148) int local148;
			@Pc(159) int local159;
			if (arg0.aBoolean218) {
				local40 = arg0.anInt1849 - arg0.anInt1850;
				if (local40 + 2 > 1600) {
					local42 = Static428.method5666(local40) + 1 - this.anInt2527;
					local40 = (local40 >> local42) + 2;
				} else {
					local40 += 2;
					local42 = 0;
				}
				@Pc(420) Class4_Sub1 local420 = arg0.aClass95_1.aClass4_Sub1_3;
				local48 = local420.aClass4_Sub1_9;
				@Pc(425) int local425 = -2;
				@Pc(427) boolean local427 = true;
				@Pc(429) boolean local429 = true;
				while (local420 != local48) {
					this.anInt2529 = 0;
					for (local148 = 0; local148 < local40; local148++) {
						this.anIntArray171[local148] = 0;
					}
					for (@Pc(453) int local453 = 0; local453 < 64; local453++) {
						this.anIntArray172[local453] = 0;
					}
					while (local48 != local420) {
						@Pc(469) Class4_Sub1_Sub2 local469 = (Class4_Sub1_Sub2) local48;
						if (local429) {
							local427 = local469.aBoolean664;
							local425 = local469.anInt5816;
							local429 = false;
						} else if (local469.anInt5816 != local425 || local469.aBoolean664 != local427) {
							local429 = true;
							break;
						}
						local159 = (int) (local35 + local27 * (float) (local469.anInt5823 >> 12) + (float) (local469.anInt5820 >> 12) * local23 + (float) (local469.anInt5814 >> 12) * local31) - arg0.anInt1850 >> local42;
						if (local159 < 1600) {
							if (this.anIntArray171[local159] < 64) {
								this.aClass4_Sub1_Sub2ArrayArray2[local159][this.anIntArray171[local159]++] = local469;
							} else {
								label142: {
									if (this.anIntArray171[local159] == 64) {
										if (this.anInt2529 == 64) {
											break label142;
										}
										this.anIntArray171[local159] += this.anInt2529++ + 1;
									}
									this.aClass4_Sub1_Sub2ArrayArray1[this.anIntArray171[local159] - 65][this.anIntArray172[this.anIntArray171[local159] - 64 - 1]++] = local469;
								}
							}
						}
						local48 = local48.aClass4_Sub1_9;
					}
					if (local425 >= 0) {
						arg1.method5493(arg1.aClass228_1.method4984(local425));
						arg1.method5517(arg1.anInterface6_8.method3937(local425).anInt2891);
					} else {
						arg1.method5493(null);
					}
					if (local427 && arg1.aFloat83 != Static446.aFloat105) {
						arg1.JA(Static446.aFloat105);
					} else if (arg1.aFloat83 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method2177(arg1, local40);
				}
			} else {
				local40 = 0;
				local42 = Integer.MAX_VALUE;
				@Pc(44) int local44 = 0;
				local48 = arg0.aClass95_1.aClass4_Sub1_3;
				@Pc(51) Class4_Sub1 local51;
				@Pc(83) int local83;
				for (local51 = local48.aClass4_Sub1_9; local51 != local48; local51 = local51.aClass4_Sub1_9) {
					@Pc(56) Class4_Sub1_Sub2 local56 = (Class4_Sub1_Sub2) local51;
					local83 = (int) (local35 + (float) (local56.anInt5820 >> 12) * local23 + local27 * (float) (local56.anInt5823 >> 12) + (float) (local56.anInt5814 >> 12) * local31);
					if (local83 < local42) {
						local42 = local83;
					}
					if (local44 < local83) {
						local44 = local83;
					}
					this.anIntArray173[local40++] = local83;
				}
				@Pc(114) int local114 = local44 - local42;
				if (local114 + 2 > 1600) {
					local83 = Static428.method5666(local114) + 1 - this.anInt2527;
					local114 = (local114 >> local83) + 2;
				} else {
					local114 += 2;
					local83 = 0;
				}
				local51 = local48.aClass4_Sub1_9;
				local40 = 0;
				local148 = -2;
				@Pc(150) boolean local150 = true;
				@Pc(152) boolean local152 = true;
				while (local51 != local48) {
					this.anInt2529 = 0;
					for (local159 = 0; local159 < local114; local159++) {
						this.anIntArray171[local159] = 0;
					}
					for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
						this.anIntArray172[local172] = 0;
					}
					while (local48 != local51) {
						@Pc(190) Class4_Sub1_Sub2 local190 = (Class4_Sub1_Sub2) local51;
						if (local152) {
							local148 = local190.anInt5816;
							local150 = local190.aBoolean664;
							local152 = false;
						}
						if (local40 > 0 && (local148 != local190.anInt5816 || local190.aBoolean664 != local150)) {
							local152 = true;
							break;
						}
						@Pc(236) int local236 = this.anIntArray173[local40++] - local42 >> local83;
						if (local236 < 1600) {
							if (this.anIntArray171[local236] >= 64) {
								label187: {
									if (this.anIntArray171[local236] == 64) {
										if (this.anInt2529 == 64) {
											break label187;
										}
										this.anIntArray171[local236] += this.anInt2529++ + 1;
									}
									@Pc(288) Class4_Sub1_Sub2[] local288 = this.aClass4_Sub1_Sub2ArrayArray1[this.anIntArray171[local236] - 64 - 1];
									@Pc(296) int local296 = this.anIntArray171[local236] - 65;
									@Pc(298) int local298 = this.anIntArray172[this.anIntArray171[local236] - 65];
									this.anIntArray172[local296] = this.anIntArray172[this.anIntArray171[local236] - 65] + 1;
									local288[local298] = local190;
								}
							} else {
								this.aClass4_Sub1_Sub2ArrayArray2[local236][this.anIntArray171[local236]++] = local190;
							}
						}
						local51 = local51.aClass4_Sub1_9;
					}
					if (local148 < 0) {
						arg1.method5493(null);
					} else {
						arg1.method5493(arg1.aClass228_1.method4984(local148));
						arg1.method5517(arg1.anInterface6_8.method3937(local148).anInt2891);
					}
					if (local150 && arg1.aFloat83 != Static446.aFloat105) {
						arg1.JA(Static446.aFloat105);
					} else if (arg1.aFloat83 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method2177(arg1, local114);
				}
			}
		} catch (@Pc(674) Exception local674) {
		}
		this.method2183(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ur;)V")
	private void method2180(@OriginalArg(1) Class34_Sub2 arg0) {
		Static446.aFloat105 = arg0.aFloat83;
		arg0.method5539();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5546(false);
		arg0.method5556(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!ur;)V")
	public void method2182(@OriginalArg(1) Class34_Sub2 arg0) {
		this.anInterface10_2 = arg0.method5564(null, 196584, true, 24);
		this.aClass238_5 = new Class238(this.anInterface10_2, 5126, 2, 0);
		this.aClass238_4 = new Class238(this.anInterface10_2, 5126, 3, 8);
		this.aClass238_3 = new Class238(this.anInterface10_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ur;I)V")
	private void method2183(@OriginalArg(0) Class34_Sub2 arg0) {
		arg0.method5546(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static446.aFloat105 != arg0.aFloat83) {
			arg0.JA(Static446.aFloat105);
		}
	}
}
