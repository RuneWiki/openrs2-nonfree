import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class227 {

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "Lclient!ee;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "Lclient!cd;")
	private Class43 aClass43_12;

	@OriginalMember(owner = "client!ow", name = "o", descriptor = "Lclient!cd;")
	private Class43 aClass43_13;

	@OriginalMember(owner = "client!ow", name = "p", descriptor = "Lclient!cd;")
	private Class43 aClass43_14;

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "[F")
	private final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "Lclient!aw;")
	private final Class1_Sub6_Sub1 aClass1_Sub6_Sub1_2 = new Class1_Sub6_Sub1(786336);

	@OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
	private final int anInt6300 = Static515.method7051(1600);

	@OriginalMember(owner = "client!ow", name = "r", descriptor = "[I")
	private final int[] anIntArray640 = new int[8191];

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
	private int anInt6301 = 0;

	@OriginalMember(owner = "client!ow", name = "t", descriptor = "[I")
	private final int[] anIntArray642 = new int[64];

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "[[Lclient!is;")
	private final Class72_Sub1_Sub1[][] aClass72_Sub1_Sub1ArrayArray3 = new Class72_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "[I")
	private final int[] anIntArray643 = new int[1600];

	@OriginalMember(owner = "client!ow", name = "w", descriptor = "[[Lclient!is;")
	private final Class72_Sub1_Sub1[][] aClass72_Sub1_Sub1ArrayArray4 = new Class72_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!uq;)V")
	private void method5330(@OriginalArg(1) Class122_Sub3 arg0) {
		arg0.method6915(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static202.aFloat90 != arg0.aFloat169) {
			arg0.M(Static202.aFloat90);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLclient!uq;)V")
	private void method5332(@OriginalArg(1) Class122_Sub3 arg0) {
		Static202.aFloat90 = arg0.aFloat169;
		arg0.method6891();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6915(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!uq;I)V")
	private void method5333(@OriginalArg(1) Class122_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray42, 0);
		@Pc(15) float local15 = this.aFloatArray42[0];
		@Pc(20) float local20 = this.aFloatArray42[4];
		@Pc(25) float local25 = this.aFloatArray42[8];
		@Pc(30) float local30 = this.aFloatArray42[1];
		@Pc(35) float local35 = this.aFloatArray42[5];
		@Pc(46) float local46 = this.aFloatArray42[9];
		@Pc(50) float local50 = local30 + local15;
		@Pc(54) float local54 = local20 + local35;
		@Pc(58) float local58 = local25 + local46;
		@Pc(63) float local63 = local15 - local30;
		@Pc(67) float local67 = local20 - local35;
		@Pc(71) float local71 = local25 - local46;
		@Pc(76) float local76 = local30 - local15;
		@Pc(80) float local80 = local35 - local20;
		@Pc(84) float local84 = local46 - local25;
		this.aClass1_Sub6_Sub1_2.anInt4555 = 0;
		@Pc(95) int local95;
		@Pc(112) int local112;
		@Pc(118) int local118;
		@Pc(127) Class72_Sub1_Sub1 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(485) float local485;
		@Pc(490) int local490;
		@Pc(430) int local430;
		@Pc(446) Class72_Sub1_Sub1 local446;
		@Pc(449) int local449;
		@Pc(462) byte local462;
		@Pc(467) byte local467;
		@Pc(479) float local479;
		if (arg0.aBoolean594) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray643[local95] <= 64 ? this.anIntArray643[local95] : 64;
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass72_Sub1_Sub1ArrayArray3[local95][local118];
						local130 = local127.anInt2182;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt2189 >> 12;
						local160 = local127.anInt2190 >> 12;
						local166 = local127.anInt2187 >> 12;
						local171 = local127.anInt2184 >> 12;
						this.aClass1_Sub6_Sub1_2.method726(0.0F);
						this.aClass1_Sub6_Sub1_2.method726(0.0F);
						this.aClass1_Sub6_Sub1_2.method726(local154 + local50 * (float) -local171);
						this.aClass1_Sub6_Sub1_2.method726(local160 + local54 * (float) -local171);
						this.aClass1_Sub6_Sub1_2.method726((float) -local171 * local58 + local166);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
						this.aClass1_Sub6_Sub1_2.method726(1.0F);
						this.aClass1_Sub6_Sub1_2.method726(0.0F);
						this.aClass1_Sub6_Sub1_2.method726(local154 + (float) local171 * local63);
						this.aClass1_Sub6_Sub1_2.method726((float) local171 * local67 + local160);
						this.aClass1_Sub6_Sub1_2.method726((float) local171 * local71 + local166);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
						this.aClass1_Sub6_Sub1_2.method726(1.0F);
						this.aClass1_Sub6_Sub1_2.method726(1.0F);
						this.aClass1_Sub6_Sub1_2.method726(local50 * (float) local171 + local154);
						this.aClass1_Sub6_Sub1_2.method726((float) local171 * local54 + local160);
						this.aClass1_Sub6_Sub1_2.method726(local58 * (float) local171 + local166);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
						this.aClass1_Sub6_Sub1_2.method726(0.0F);
						this.aClass1_Sub6_Sub1_2.method726(1.0F);
						this.aClass1_Sub6_Sub1_2.method726(local154 + (float) local171 * local76);
						this.aClass1_Sub6_Sub1_2.method726((float) local171 * local80 + local160);
						this.aClass1_Sub6_Sub1_2.method726((float) local171 * local84 + local166);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
					}
					if (this.anIntArray643[local95] > 64) {
						local430 = this.anIntArray643[local95] - 1 - 64;
						for (local130 = this.anIntArray642[local430] - 1; local130 >= 0; local130--) {
							local446 = this.aClass72_Sub1_Sub1ArrayArray4[local430][local130];
							local449 = local446.anInt2182;
							local143 = (byte) (local449 >> 16);
							local148 = (byte) (local449 >> 8);
							local462 = (byte) local449;
							local467 = (byte) (local449 >>> 24);
							local166 = local446.anInt2189 >> 12;
							local479 = local446.anInt2190 >> 12;
							local485 = local446.anInt2187 >> 12;
							local490 = local446.anInt2184 >> 12;
							this.aClass1_Sub6_Sub1_2.method726(0.0F);
							this.aClass1_Sub6_Sub1_2.method726(0.0F);
							this.aClass1_Sub6_Sub1_2.method726(local166 + local50 * (float) -local490);
							this.aClass1_Sub6_Sub1_2.method726(local479 + local54 * (float) -local490);
							this.aClass1_Sub6_Sub1_2.method726((float) -local490 * local58 + local485);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
							this.aClass1_Sub6_Sub1_2.method726(1.0F);
							this.aClass1_Sub6_Sub1_2.method726(0.0F);
							this.aClass1_Sub6_Sub1_2.method726(local166 + local63 * (float) local490);
							this.aClass1_Sub6_Sub1_2.method726((float) local490 * local67 + local479);
							this.aClass1_Sub6_Sub1_2.method726((float) local490 * local71 + local485);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
							this.aClass1_Sub6_Sub1_2.method726(1.0F);
							this.aClass1_Sub6_Sub1_2.method726(1.0F);
							this.aClass1_Sub6_Sub1_2.method726(local166 + local50 * (float) local490);
							this.aClass1_Sub6_Sub1_2.method726(local54 * (float) local490 + local479);
							this.aClass1_Sub6_Sub1_2.method726((float) local490 * local58 + local485);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
							this.aClass1_Sub6_Sub1_2.method726(0.0F);
							this.aClass1_Sub6_Sub1_2.method726(1.0F);
							this.aClass1_Sub6_Sub1_2.method726(local76 * (float) local490 + local166);
							this.aClass1_Sub6_Sub1_2.method726(local80 * (float) local490 + local479);
							this.aClass1_Sub6_Sub1_2.method726(local485 + (float) local490 * local84);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray643[local95] <= 64 ? this.anIntArray643[local95] : 64;
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass72_Sub1_Sub1ArrayArray3[local95][local118];
						local130 = local127.anInt2182;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt2189 >> 12;
						local160 = local127.anInt2190 >> 12;
						local166 = local127.anInt2187 >> 12;
						local171 = local127.anInt2184 >> 12;
						this.aClass1_Sub6_Sub1_2.method724(0.0F);
						this.aClass1_Sub6_Sub1_2.method724(0.0F);
						this.aClass1_Sub6_Sub1_2.method724(local154 + (float) -local171 * local50);
						this.aClass1_Sub6_Sub1_2.method724(local160 + (float) -local171 * local54);
						this.aClass1_Sub6_Sub1_2.method724(local166 + (float) -local171 * local58);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
						this.aClass1_Sub6_Sub1_2.method724(1.0F);
						this.aClass1_Sub6_Sub1_2.method724(0.0F);
						this.aClass1_Sub6_Sub1_2.method724((float) local171 * local63 + local154);
						this.aClass1_Sub6_Sub1_2.method724((float) local171 * local67 + local160);
						this.aClass1_Sub6_Sub1_2.method724((float) local171 * local71 + local166);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
						this.aClass1_Sub6_Sub1_2.method724(1.0F);
						this.aClass1_Sub6_Sub1_2.method724(1.0F);
						this.aClass1_Sub6_Sub1_2.method724(local154 + (float) local171 * local50);
						this.aClass1_Sub6_Sub1_2.method724(local54 * (float) local171 + local160);
						this.aClass1_Sub6_Sub1_2.method724(local166 + local58 * (float) local171);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
						this.aClass1_Sub6_Sub1_2.method724(0.0F);
						this.aClass1_Sub6_Sub1_2.method724(1.0F);
						this.aClass1_Sub6_Sub1_2.method724(local154 + local76 * (float) local171);
						this.aClass1_Sub6_Sub1_2.method724(local160 + local80 * (float) local171);
						this.aClass1_Sub6_Sub1_2.method724(local166 + local84 * (float) local171);
						this.aClass1_Sub6_Sub1_2.method3937(local135);
						this.aClass1_Sub6_Sub1_2.method3937(local140);
						this.aClass1_Sub6_Sub1_2.method3937(local143);
						this.aClass1_Sub6_Sub1_2.method3937(local148);
					}
					if (this.anIntArray643[local95] > 64) {
						local430 = this.anIntArray643[local95] - 65;
						for (local130 = this.anIntArray642[local430] - 1; local130 >= 0; local130--) {
							local446 = this.aClass72_Sub1_Sub1ArrayArray4[local430][local130];
							local449 = local446.anInt2182;
							local143 = (byte) (local449 >> 16);
							local148 = (byte) (local449 >> 8);
							local462 = (byte) local449;
							local467 = (byte) (local449 >>> 24);
							local166 = local446.anInt2189 >> 12;
							local479 = local446.anInt2190 >> 12;
							local485 = local446.anInt2187 >> 12;
							local490 = local446.anInt2184 >> 12;
							this.aClass1_Sub6_Sub1_2.method724(0.0F);
							this.aClass1_Sub6_Sub1_2.method724(0.0F);
							this.aClass1_Sub6_Sub1_2.method724(local166 + (float) -local490 * local50);
							this.aClass1_Sub6_Sub1_2.method724(local479 + (float) -local490 * local54);
							this.aClass1_Sub6_Sub1_2.method724(local58 * (float) -local490 + local485);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
							this.aClass1_Sub6_Sub1_2.method724(1.0F);
							this.aClass1_Sub6_Sub1_2.method724(0.0F);
							this.aClass1_Sub6_Sub1_2.method724(local166 + (float) local490 * local63);
							this.aClass1_Sub6_Sub1_2.method724(local479 + (float) local490 * local67);
							this.aClass1_Sub6_Sub1_2.method724((float) local490 * local71 + local485);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
							this.aClass1_Sub6_Sub1_2.method724(1.0F);
							this.aClass1_Sub6_Sub1_2.method724(1.0F);
							this.aClass1_Sub6_Sub1_2.method724(local166 + (float) local490 * local50);
							this.aClass1_Sub6_Sub1_2.method724(local479 + local54 * (float) local490);
							this.aClass1_Sub6_Sub1_2.method724(local58 * (float) local490 + local485);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
							this.aClass1_Sub6_Sub1_2.method724(0.0F);
							this.aClass1_Sub6_Sub1_2.method724(1.0F);
							this.aClass1_Sub6_Sub1_2.method724(local76 * (float) local490 + local166);
							this.aClass1_Sub6_Sub1_2.method724(local479 + local80 * (float) local490);
							this.aClass1_Sub6_Sub1_2.method724(local485 + (float) local490 * local84);
							this.aClass1_Sub6_Sub1_2.method3937(local143);
							this.aClass1_Sub6_Sub1_2.method3937(local148);
							this.aClass1_Sub6_Sub1_2.method3937(local462);
							this.aClass1_Sub6_Sub1_2.method3937(local467);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub6_Sub1_2.anInt4555 != 0) {
			this.anInterface2_5.method4390(this.aClass1_Sub6_Sub1_2.aByteArray66, 24, this.aClass1_Sub6_Sub1_2.anInt4555);
			arg0.method6890(this.aClass43_14, this.aClass43_13, null, this.aClass43_12);
			arg0.method6930(this.aClass1_Sub6_Sub1_2.anInt4555 / 24);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!uq;I)V")
	public void method5335(@OriginalArg(0) Class122_Sub3 arg0) {
		this.anInterface2_5 = arg0.method6892(null, 24, true, 196584);
		this.aClass43_14 = new Class43(this.anInterface2_5, 5126, 2, 0);
		this.aClass43_13 = new Class43(this.anInterface2_5, 5126, 3, 8);
		this.aClass43_12 = new Class43(this.anInterface2_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public void method5336(@OriginalArg(0) Class175 arg0, @OriginalArg(2) Class122_Sub3 arg1) {
		if (arg1.aClass118_Sub1_4 == null) {
			return;
		}
		this.method5332(arg1);
		@Pc(21) float local21 = arg1.aClass118_Sub1_4.aFloat38;
		@Pc(25) float local25 = arg1.aClass118_Sub1_4.aFloat41;
		@Pc(29) float local29 = arg1.aClass118_Sub1_4.aFloat35;
		@Pc(33) float local33 = arg1.aClass118_Sub1_4.aFloat44;
		try {
			@Pc(43) int local43;
			@Pc(57) int local57;
			@Pc(75) Class72_Sub1 local75;
			@Pc(88) int local88;
			@Pc(179) int local179;
			if (arg0.aBoolean357) {
				local43 = arg0.anInt5059 - arg0.anInt5060;
				if (local43 + 2 > 1600) {
					local57 = Static515.method7051(local43) + 1 - this.anInt6300;
					local43 = (local43 >> local57) + 2;
				} else {
					local43 += 2;
					local57 = 0;
				}
				@Pc(72) Class72_Sub1 local72 = arg0.aClass193_1.aClass72_Sub1_7;
				local75 = local72.aClass72_Sub1_10;
				@Pc(77) int local77 = -2;
				@Pc(79) boolean local79 = true;
				@Pc(81) boolean local81 = true;
				while (local72 != local75) {
					this.anInt6301 = 0;
					for (local88 = 0; local88 < local43; local88++) {
						this.anIntArray643[local88] = 0;
					}
					for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
						this.anIntArray642[local105] = 0;
					}
					while (local72 != local75) {
						@Pc(123) Class72_Sub1_Sub1 local123 = (Class72_Sub1_Sub1) local75;
						if (local81) {
							local81 = false;
							local79 = local123.aBoolean136;
							local77 = local123.anInt2188;
						} else if (local77 != local123.anInt2188 || local79 != local123.aBoolean136) {
							local81 = true;
							break;
						}
						local179 = (int) (local21 * (float) (local123.anInt2189 >> 12) + (float) (local123.anInt2190 >> 12) * local25 + (float) (local123.anInt2187 >> 12) * local29 + local33) - arg0.anInt5060 >> local57;
						if (local179 < 1600) {
							if (this.anIntArray643[local179] >= 64) {
								label191: {
									if (this.anIntArray643[local179] == 64) {
										if (this.anInt6301 == 64) {
											break label191;
										}
										this.anIntArray643[local179] += this.anInt6301++ + 1;
									}
									@Pc(227) Class72_Sub1_Sub1[] local227 = this.aClass72_Sub1_Sub1ArrayArray4[this.anIntArray643[local179] - 64 - 1];
									@Pc(237) int local237 = this.anIntArray643[local179] - 1 - 64;
									@Pc(239) int local239 = this.anIntArray642[this.anIntArray643[local179] - 1 - 64];
									this.anIntArray642[local237] = this.anIntArray642[this.anIntArray643[local179] - 1 - 64] + 1;
									local227[local239] = local123;
								}
							} else {
								this.aClass72_Sub1_Sub1ArrayArray3[local179][this.anIntArray643[local179]++] = local123;
							}
						}
						local75 = local75.aClass72_Sub1_10;
					}
					if (local77 < 0) {
						arg1.method6926(-1);
					} else {
						arg1.method6926(local77);
					}
					if (local79 && arg1.aFloat169 != Static202.aFloat90) {
						arg1.M(Static202.aFloat90);
					} else if (arg1.aFloat169 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method5333(arg1, local43);
				}
			} else {
				local43 = 0;
				local57 = Integer.MAX_VALUE;
				@Pc(318) int local318 = 0;
				local75 = arg0.aClass193_1.aClass72_Sub1_7;
				@Pc(325) Class72_Sub1 local325;
				@Pc(357) int local357;
				for (local325 = local75.aClass72_Sub1_10; local325 != local75; local325 = local325.aClass72_Sub1_10) {
					@Pc(330) Class72_Sub1_Sub1 local330 = (Class72_Sub1_Sub1) local325;
					local357 = (int) ((float) (local330.anInt2187 >> 12) * local29 + local25 * (float) (local330.anInt2190 >> 12) + local21 * (float) (local330.anInt2189 >> 12) + local33);
					if (local357 > local318) {
						local318 = local357;
					}
					this.anIntArray640[local43++] = local357;
					if (local57 > local357) {
						local57 = local357;
					}
				}
				@Pc(384) int local384 = local318 - local57;
				if (local384 + 2 <= 1600) {
					local384 += 2;
					local357 = 0;
				} else {
					local357 = Static515.method7051(local384) + 1 - this.anInt6300;
					local384 = (local384 >> local357) + 2;
				}
				local43 = 0;
				local325 = local75.aClass72_Sub1_10;
				local88 = -2;
				@Pc(419) boolean local419 = true;
				@Pc(421) boolean local421 = true;
				while (local325 != local75) {
					this.anInt6301 = 0;
					for (local179 = 0; local179 < local384; local179++) {
						this.anIntArray643[local179] = 0;
					}
					for (@Pc(445) int local445 = 0; local445 < 64; local445++) {
						this.anIntArray642[local445] = 0;
					}
					while (local325 != local75) {
						@Pc(463) Class72_Sub1_Sub1 local463 = (Class72_Sub1_Sub1) local325;
						if (local421) {
							local88 = local463.anInt2188;
							local421 = false;
							local419 = local463.aBoolean136;
						}
						if (local43 > 0 && (local463.anInt2188 != local88 || local463.aBoolean136 != local419)) {
							local421 = true;
							break;
						}
						@Pc(512) int local512 = this.anIntArray640[local43++] - local57 >> local357;
						if (local512 < 1600) {
							if (this.anIntArray643[local512] >= 64) {
								label142: {
									if (this.anIntArray643[local512] == 64) {
										if (this.anInt6301 == 64) {
											break label142;
										}
										this.anIntArray643[local512] += this.anInt6301++ + 1;
									}
									this.aClass72_Sub1_Sub1ArrayArray4[this.anIntArray643[local512] - 64 - 1][this.anIntArray642[this.anIntArray643[local512] - 64 - 1]++] = local463;
								}
							} else {
								this.aClass72_Sub1_Sub1ArrayArray3[local512][this.anIntArray643[local512]++] = local463;
							}
						}
						local325 = local325.aClass72_Sub1_10;
					}
					if (local88 < 0) {
						arg1.method6926(-1);
					} else {
						arg1.method6926(local88);
					}
					if (local419 && Static202.aFloat90 != arg1.aFloat169) {
						arg1.M(Static202.aFloat90);
					} else if (arg1.aFloat169 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method5333(arg1, local384);
				}
			}
		} catch (@Pc(649) Exception local649) {
		}
		this.method5330(arg1);
	}
}
