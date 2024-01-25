import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class260 {

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "Lclient!wu;")
	private Interface12 anInterface12_7;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "Lclient!gi;")
	private Class89 aClass89_14;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "Lclient!gi;")
	private Class89 aClass89_15;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "Lclient!gi;")
	private Class89 aClass89_16;

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "[F")
	private final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Lclient!uc;")
	private final Class1_Sub5_Sub2 aClass1_Sub5_Sub2_3 = new Class1_Sub5_Sub2(786336);

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
	private final int anInt7032 = Static317.method4489(1600);

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "[I")
	private final int[] anIntArray634 = new int[1600];

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "[[Lclient!ck;")
	private final Class4_Sub2_Sub1[][] aClass4_Sub2_Sub1ArrayArray1 = new Class4_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
	private int anInt7035 = 0;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "[I")
	private final int[] anIntArray635 = new int[8191];

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "[[Lclient!ck;")
	private final Class4_Sub2_Sub1[][] aClass4_Sub2_Sub1ArrayArray2 = new Class4_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "[I")
	private final int[] anIntArray636 = new int[64];

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!kd;)V")
	private void method5756(@OriginalArg(1) Class39_Sub2 arg0) {
		arg0.method3208(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static410.aFloat96 != arg0.aFloat49) {
			arg0.B(Static410.aFloat96);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!kd;Lclient!kp;)V")
	public void method5758(@OriginalArg(1) Class39_Sub2 arg0, @OriginalArg(2) Class140 arg1) {
		if (arg0.aClass33_Sub2_4 == null) {
			return;
		}
		this.method5761(arg0);
		@Pc(23) float local23 = arg0.aClass33_Sub2_4.aFloat84;
		@Pc(27) float local27 = arg0.aClass33_Sub2_4.aFloat83;
		@Pc(31) float local31 = arg0.aClass33_Sub2_4.aFloat77;
		@Pc(35) float local35 = arg0.aClass33_Sub2_4.aFloat86;
		try {
			@Pc(40) int local40;
			@Pc(42) int local42;
			@Pc(48) Class4_Sub2 local48;
			@Pc(146) int local146;
			@Pc(157) int local157;
			if (arg1.aBoolean280) {
				local40 = arg1.anInt3934 - arg1.anInt3933;
				if (local40 + 2 <= 1600) {
					local42 = 0;
					local40 += 2;
				} else {
					local42 = Static317.method4489(local40) + 1 - this.anInt7032;
					local40 = (local40 >> local42) + 2;
				}
				@Pc(420) Class4_Sub2 local420 = arg1.aClass232_1.aClass4_Sub2_7;
				local48 = local420.aClass4_Sub2_9;
				@Pc(425) int local425 = -2;
				@Pc(427) boolean local427 = true;
				@Pc(429) boolean local429 = true;
				while (local420 != local48) {
					this.anInt7035 = 0;
					for (local146 = 0; local146 < local40; local146++) {
						this.anIntArray634[local146] = 0;
					}
					for (@Pc(449) int local449 = 0; local449 < 64; local449++) {
						this.anIntArray636[local449] = 0;
					}
					while (local48 != local420) {
						@Pc(467) Class4_Sub2_Sub1 local467 = (Class4_Sub2_Sub1) local48;
						if (local429) {
							local425 = local467.anInt6950;
							local429 = false;
							local427 = local467.aBoolean486;
						} else if (local467.anInt6950 != local425 || local427 != local467.aBoolean486) {
							local429 = true;
							break;
						}
						local157 = (int) ((float) (local467.anInt6945 >> Static388.anInt6273) * local23 + local27 * (float) (local467.anInt6947 >> Static388.anInt6273) + (float) (local467.anInt6951 >> Static388.anInt6273) * local31 + local35) - arg1.anInt3933 >> local42;
						if (local157 < 1600) {
							if (this.anIntArray634[local157] < 64) {
								this.aClass4_Sub2_Sub1ArrayArray2[local157][this.anIntArray634[local157]++] = local467;
							} else {
								label141: {
									if (this.anIntArray634[local157] == 64) {
										if (this.anInt7035 == 64) {
											break label141;
										}
										this.anIntArray634[local157] += this.anInt7035++ + 1;
									}
									@Pc(594) Class4_Sub2_Sub1[] local594 = this.aClass4_Sub2_Sub1ArrayArray1[this.anIntArray634[local157] - 1 - 64];
									@Pc(602) int local602 = this.anIntArray634[local157] - 65;
									@Pc(604) int local604 = this.anIntArray636[this.anIntArray634[local157] - 65];
									this.anIntArray636[local602] = this.anIntArray636[this.anIntArray634[local157] - 65] + 1;
									local594[local604] = local467;
								}
							}
						}
						local48 = local48.aClass4_Sub2_9;
					}
					if (local425 < 0) {
						arg0.method3203(null);
					} else {
						arg0.method3203(arg0.aClass160_1.method3742(local425));
						arg0.method3162(arg0.anInterface4_12.method2450(local425).anInt4981);
					}
					if (local427 && Static410.aFloat96 != arg0.aFloat49) {
						arg0.B(Static410.aFloat96);
					} else if (arg0.aFloat49 != 1.0F) {
						arg0.B(1.0F);
					}
					this.method5762(local40, arg0);
				}
			} else {
				local40 = 0;
				local42 = Integer.MAX_VALUE;
				@Pc(44) int local44 = 0;
				local48 = arg1.aClass232_1.aClass4_Sub2_7;
				@Pc(51) Class4_Sub2 local51;
				@Pc(83) int local83;
				for (local51 = local48.aClass4_Sub2_9; local51 != local48; local51 = local51.aClass4_Sub2_9) {
					@Pc(56) Class4_Sub2_Sub1 local56 = (Class4_Sub2_Sub1) local51;
					local83 = (int) (local35 + local23 * (float) (local56.anInt6945 >> Static388.anInt6273) + local27 * (float) (local56.anInt6947 >> Static388.anInt6273) + local31 * (float) (local56.anInt6951 >> Static388.anInt6273));
					if (local42 > local83) {
						local42 = local83;
					}
					if (local83 > local44) {
						local44 = local83;
					}
					this.anIntArray635[local40++] = local83;
				}
				@Pc(114) int local114 = local44 - local42;
				if (local114 + 2 <= 1600) {
					local114 += 2;
					local83 = 0;
				} else {
					local83 = Static317.method4489(local114) + 1 - this.anInt7032;
					local114 = (local114 >> local83) + 2;
				}
				local40 = 0;
				local51 = local48.aClass4_Sub2_9;
				local146 = -2;
				@Pc(148) boolean local148 = true;
				@Pc(150) boolean local150 = true;
				while (local51 != local48) {
					this.anInt7035 = 0;
					for (local157 = 0; local157 < local114; local157++) {
						this.anIntArray634[local157] = 0;
					}
					for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
						this.anIntArray636[local174] = 0;
					}
					while (local48 != local51) {
						@Pc(190) Class4_Sub2_Sub1 local190 = (Class4_Sub2_Sub1) local51;
						if (local150) {
							local150 = false;
							local146 = local190.anInt6950;
							local148 = local190.aBoolean486;
						}
						if (local40 > 0 && (local146 != local190.anInt6950 || local148 != local190.aBoolean486)) {
							local150 = true;
							break;
						}
						@Pc(233) int local233 = this.anIntArray635[local40++] - local42 >> local83;
						if (local233 < 1600) {
							if (this.anIntArray634[local233] >= 64) {
								label186: {
									if (this.anIntArray634[local233] == 64) {
										if (this.anInt7035 == 64) {
											break label186;
										}
										this.anIntArray634[local233] += this.anInt7035++ + 1;
									}
									this.aClass4_Sub2_Sub1ArrayArray1[this.anIntArray634[local233] - 1 - 64][this.anIntArray636[this.anIntArray634[local233] - 64 - 1]++] = local190;
								}
							} else {
								this.aClass4_Sub2_Sub1ArrayArray2[local233][this.anIntArray634[local233]++] = local190;
							}
						}
						local51 = local51.aClass4_Sub2_9;
					}
					if (local146 < 0) {
						arg0.method3203(null);
					} else {
						arg0.method3203(arg0.aClass160_1.method3742(local146));
						arg0.method3162(arg0.anInterface4_12.method2450(local146).anInt4981);
					}
					if (local148 && Static410.aFloat96 != arg0.aFloat49) {
						arg0.B(Static410.aFloat96);
					} else if (arg0.aFloat49 != 1.0F) {
						arg0.B(1.0F);
					}
					this.method5762(local114, arg0);
				}
			}
		} catch (@Pc(671) Exception local671) {
		}
		this.method5756(arg0);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(ILclient!kd;)V")
	private void method5761(@OriginalArg(1) Class39_Sub2 arg0) {
		Static410.aFloat96 = arg0.aFloat49;
		arg0.method3185();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3208(false);
		arg0.method3218(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!kd;)V")
	private void method5762(@OriginalArg(0) int arg0, @OriginalArg(2) Class39_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray32, 0);
		@Pc(15) float local15 = this.aFloatArray32[0];
		@Pc(20) float local20 = this.aFloatArray32[4];
		@Pc(25) float local25 = this.aFloatArray32[8];
		@Pc(37) float local37 = this.aFloatArray32[1];
		@Pc(42) float local42 = this.aFloatArray32[5];
		@Pc(47) float local47 = this.aFloatArray32[9];
		@Pc(51) float local51 = local37 + local15;
		@Pc(55) float local55 = local42 + local20;
		@Pc(59) float local59 = local47 + local25;
		@Pc(63) float local63 = local15 - local37;
		@Pc(67) float local67 = local20 - local42;
		@Pc(71) float local71 = local25 - local47;
		@Pc(75) float local75 = local37 - local15;
		@Pc(80) float local80 = local42 - local20;
		@Pc(85) float local85 = local47 - local25;
		this.aClass1_Sub5_Sub2_3.anInt6475 = 0;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(131) Class4_Sub2_Sub1 local131;
		@Pc(134) int local134;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(147) byte local147;
		@Pc(152) byte local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(175) int local175;
		@Pc(506) float local506;
		@Pc(511) int local511;
		@Pc(451) int local451;
		@Pc(467) Class4_Sub2_Sub1 local467;
		@Pc(470) int local470;
		@Pc(483) byte local483;
		@Pc(488) byte local488;
		@Pc(500) float local500;
		if (arg1.aBoolean250) {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray634[local96] > 64 ? 64 : this.anIntArray634[local96];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass4_Sub2_Sub1ArrayArray2[local96][local122];
						local134 = local131.anInt6952;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt6945 >> Static388.anInt6273;
						local164 = local131.anInt6947 >> Static388.anInt6273;
						local170 = local131.anInt6951 >> Static388.anInt6273;
						local175 = local131.anInt6946 >> Static388.anInt6273;
						this.aClass1_Sub5_Sub2_3.method5422(0.0F);
						this.aClass1_Sub5_Sub2_3.method5422(0.0F);
						this.aClass1_Sub5_Sub2_3.method5422(local51 * (float) -local175 + local158);
						this.aClass1_Sub5_Sub2_3.method5422((float) -local175 * local55 + local164);
						this.aClass1_Sub5_Sub2_3.method5422(local59 * (float) -local175 + local170);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
						this.aClass1_Sub5_Sub2_3.method5422(1.0F);
						this.aClass1_Sub5_Sub2_3.method5422(0.0F);
						this.aClass1_Sub5_Sub2_3.method5422(local158 + (float) local175 * local63);
						this.aClass1_Sub5_Sub2_3.method5422((float) local175 * local67 + local164);
						this.aClass1_Sub5_Sub2_3.method5422(local170 + local71 * (float) local175);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
						this.aClass1_Sub5_Sub2_3.method5422(1.0F);
						this.aClass1_Sub5_Sub2_3.method5422(1.0F);
						this.aClass1_Sub5_Sub2_3.method5422((float) local175 * local51 + local158);
						this.aClass1_Sub5_Sub2_3.method5422(local164 + (float) local175 * local55);
						this.aClass1_Sub5_Sub2_3.method5422(local59 * (float) local175 + local170);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
						this.aClass1_Sub5_Sub2_3.method5422(0.0F);
						this.aClass1_Sub5_Sub2_3.method5422(1.0F);
						this.aClass1_Sub5_Sub2_3.method5422(local75 * (float) local175 + local158);
						this.aClass1_Sub5_Sub2_3.method5422(local80 * (float) local175 + local164);
						this.aClass1_Sub5_Sub2_3.method5422(local170 + (float) local175 * local85);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
					}
					if (this.anIntArray634[local96] > 64) {
						local451 = this.anIntArray634[local96] - 64 - 1;
						for (local134 = this.anIntArray636[local451] - 1; local134 >= 0; local134--) {
							local467 = this.aClass4_Sub2_Sub1ArrayArray1[local451][local134];
							local470 = local467.anInt6952;
							local147 = (byte) (local470 >> 16);
							local152 = (byte) (local470 >> 8);
							local483 = (byte) local470;
							local488 = (byte) (local470 >>> 24);
							local170 = local467.anInt6945 >> Static388.anInt6273;
							local500 = local467.anInt6947 >> Static388.anInt6273;
							local506 = local467.anInt6951 >> Static388.anInt6273;
							local511 = local467.anInt6946 >> Static388.anInt6273;
							this.aClass1_Sub5_Sub2_3.method5422(0.0F);
							this.aClass1_Sub5_Sub2_3.method5422(0.0F);
							this.aClass1_Sub5_Sub2_3.method5422(local170 + local51 * (float) -local511);
							this.aClass1_Sub5_Sub2_3.method5422((float) -local511 * local55 + local500);
							this.aClass1_Sub5_Sub2_3.method5422(local506 + local59 * (float) -local511);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
							this.aClass1_Sub5_Sub2_3.method5422(1.0F);
							this.aClass1_Sub5_Sub2_3.method5422(0.0F);
							this.aClass1_Sub5_Sub2_3.method5422((float) local511 * local63 + local170);
							this.aClass1_Sub5_Sub2_3.method5422(local500 + local67 * (float) local511);
							this.aClass1_Sub5_Sub2_3.method5422(local506 + (float) local511 * local71);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
							this.aClass1_Sub5_Sub2_3.method5422(1.0F);
							this.aClass1_Sub5_Sub2_3.method5422(1.0F);
							this.aClass1_Sub5_Sub2_3.method5422(local170 + (float) local511 * local51);
							this.aClass1_Sub5_Sub2_3.method5422((float) local511 * local55 + local500);
							this.aClass1_Sub5_Sub2_3.method5422(local59 * (float) local511 + local506);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
							this.aClass1_Sub5_Sub2_3.method5422(0.0F);
							this.aClass1_Sub5_Sub2_3.method5422(1.0F);
							this.aClass1_Sub5_Sub2_3.method5422((float) local511 * local75 + local170);
							this.aClass1_Sub5_Sub2_3.method5422(local500 + local80 * (float) local511);
							this.aClass1_Sub5_Sub2_3.method5422(local506 + (float) local511 * local85);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
						}
					}
				}
			}
		} else {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray634[local96] <= 64 ? this.anIntArray634[local96] : 64;
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass4_Sub2_Sub1ArrayArray2[local96][local122];
						local134 = local131.anInt6952;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt6945 >> Static388.anInt6273;
						local164 = local131.anInt6947 >> Static388.anInt6273;
						local170 = local131.anInt6951 >> Static388.anInt6273;
						local175 = local131.anInt6946 >> Static388.anInt6273;
						this.aClass1_Sub5_Sub2_3.method5420(0.0F);
						this.aClass1_Sub5_Sub2_3.method5420(0.0F);
						this.aClass1_Sub5_Sub2_3.method5420(local158 + local51 * (float) -local175);
						this.aClass1_Sub5_Sub2_3.method5420((float) -local175 * local55 + local164);
						this.aClass1_Sub5_Sub2_3.method5420(local170 + local59 * (float) -local175);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
						this.aClass1_Sub5_Sub2_3.method5420(1.0F);
						this.aClass1_Sub5_Sub2_3.method5420(0.0F);
						this.aClass1_Sub5_Sub2_3.method5420(local63 * (float) local175 + local158);
						this.aClass1_Sub5_Sub2_3.method5420(local67 * (float) local175 + local164);
						this.aClass1_Sub5_Sub2_3.method5420(local71 * (float) local175 + local170);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
						this.aClass1_Sub5_Sub2_3.method5420(1.0F);
						this.aClass1_Sub5_Sub2_3.method5420(1.0F);
						this.aClass1_Sub5_Sub2_3.method5420(local158 + (float) local175 * local51);
						this.aClass1_Sub5_Sub2_3.method5420((float) local175 * local55 + local164);
						this.aClass1_Sub5_Sub2_3.method5420(local59 * (float) local175 + local170);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
						this.aClass1_Sub5_Sub2_3.method5420(0.0F);
						this.aClass1_Sub5_Sub2_3.method5420(1.0F);
						this.aClass1_Sub5_Sub2_3.method5420((float) local175 * local75 + local158);
						this.aClass1_Sub5_Sub2_3.method5420(local164 + local80 * (float) local175);
						this.aClass1_Sub5_Sub2_3.method5420(local85 * (float) local175 + local170);
						this.aClass1_Sub5_Sub2_3.method5396(local139);
						this.aClass1_Sub5_Sub2_3.method5396(local144);
						this.aClass1_Sub5_Sub2_3.method5396(local147);
						this.aClass1_Sub5_Sub2_3.method5396(local152);
					}
					if (this.anIntArray634[local96] > 64) {
						local451 = this.anIntArray634[local96] - 64 - 1;
						for (local134 = this.anIntArray636[local451] - 1; local134 >= 0; local134--) {
							local467 = this.aClass4_Sub2_Sub1ArrayArray1[local451][local134];
							local470 = local467.anInt6952;
							local147 = (byte) (local470 >> 16);
							local152 = (byte) (local470 >> 8);
							local483 = (byte) local470;
							local488 = (byte) (local470 >>> 24);
							local170 = local467.anInt6945 >> Static388.anInt6273;
							local500 = local467.anInt6947 >> Static388.anInt6273;
							local506 = local467.anInt6951 >> Static388.anInt6273;
							local511 = local467.anInt6946 >> Static388.anInt6273;
							this.aClass1_Sub5_Sub2_3.method5420(0.0F);
							this.aClass1_Sub5_Sub2_3.method5420(0.0F);
							this.aClass1_Sub5_Sub2_3.method5420(local170 + local51 * (float) -local511);
							this.aClass1_Sub5_Sub2_3.method5420((float) -local511 * local55 + local500);
							this.aClass1_Sub5_Sub2_3.method5420((float) -local511 * local59 + local506);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
							this.aClass1_Sub5_Sub2_3.method5420(1.0F);
							this.aClass1_Sub5_Sub2_3.method5420(0.0F);
							this.aClass1_Sub5_Sub2_3.method5420(local63 * (float) local511 + local170);
							this.aClass1_Sub5_Sub2_3.method5420((float) local511 * local67 + local500);
							this.aClass1_Sub5_Sub2_3.method5420(local506 + local71 * (float) local511);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
							this.aClass1_Sub5_Sub2_3.method5420(1.0F);
							this.aClass1_Sub5_Sub2_3.method5420(1.0F);
							this.aClass1_Sub5_Sub2_3.method5420(local170 + local51 * (float) local511);
							this.aClass1_Sub5_Sub2_3.method5420(local500 + local55 * (float) local511);
							this.aClass1_Sub5_Sub2_3.method5420(local506 + local59 * (float) local511);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
							this.aClass1_Sub5_Sub2_3.method5420(0.0F);
							this.aClass1_Sub5_Sub2_3.method5420(1.0F);
							this.aClass1_Sub5_Sub2_3.method5420(local170 + (float) local511 * local75);
							this.aClass1_Sub5_Sub2_3.method5420(local80 * (float) local511 + local500);
							this.aClass1_Sub5_Sub2_3.method5420(local506 + (float) local511 * local85);
							this.aClass1_Sub5_Sub2_3.method5396(local147);
							this.aClass1_Sub5_Sub2_3.method5396(local152);
							this.aClass1_Sub5_Sub2_3.method5396(local483);
							this.aClass1_Sub5_Sub2_3.method5396(local488);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub5_Sub2_3.anInt6475 != 0) {
			this.anInterface12_7.method5068(this.aClass1_Sub5_Sub2_3.aByteArray89, this.aClass1_Sub5_Sub2_3.anInt6475, 24);
			arg1.method3181(null, this.aClass89_16, this.aClass89_14, this.aClass89_15);
			arg1.method3167(this.aClass1_Sub5_Sub2_3.anInt6475 / 24);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method5763(@OriginalArg(0) Class39_Sub2 arg0) {
		this.anInterface12_7 = arg0.method3234(24, true, null, 196584);
		this.aClass89_16 = new Class89(this.anInterface12_7, 5126, 2, 0);
		this.aClass89_14 = new Class89(this.anInterface12_7, 5126, 3, 8);
		this.aClass89_15 = new Class89(this.anInterface12_7, 5121, 4, 20);
	}
}
