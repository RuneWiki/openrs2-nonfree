import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fka")
public final class Class105 {

	@OriginalMember(owner = "client!fka", name = "k", descriptor = "Lclient!we;")
	private Class381 aClass381_7;

	@OriginalMember(owner = "client!fka", name = "l", descriptor = "Lclient!fha;")
	private Interface9 anInterface9_4;

	@OriginalMember(owner = "client!fka", name = "m", descriptor = "Lclient!we;")
	private Class381 aClass381_8;

	@OriginalMember(owner = "client!fka", name = "q", descriptor = "Lclient!we;")
	private Class381 aClass381_9;

	@OriginalMember(owner = "client!fka", name = "g", descriptor = "[F")
	private final float[] aFloatArray22 = new float[16];

	@OriginalMember(owner = "client!fka", name = "j", descriptor = "Lclient!uj;")
	private final Class3_Sub25_Sub2 aClass3_Sub25_Sub2_2 = new Class3_Sub25_Sub2(786336);

	@OriginalMember(owner = "client!fka", name = "n", descriptor = "I")
	private final int anInt3340 = Static673.method9349(1600);

	@OriginalMember(owner = "client!fka", name = "t", descriptor = "[I")
	private final int[] anIntArray293 = new int[1600];

	@OriginalMember(owner = "client!fka", name = "u", descriptor = "[I")
	private final int[] anIntArray294 = new int[64];

	@OriginalMember(owner = "client!fka", name = "r", descriptor = "[[Lclient!vj;")
	private final Class28_Sub4_Sub2[][] aClass28_Sub4_Sub2ArrayArray1 = new Class28_Sub4_Sub2[1600][64];

	@OriginalMember(owner = "client!fka", name = "s", descriptor = "I")
	private int anInt3343 = 0;

	@OriginalMember(owner = "client!fka", name = "v", descriptor = "[[Lclient!vj;")
	private final Class28_Sub4_Sub2[][] aClass28_Sub4_Sub2ArrayArray2 = new Class28_Sub4_Sub2[64][768];

	@OriginalMember(owner = "client!fka", name = "y", descriptor = "[I")
	private final int[] anIntArray295 = new int[8191];

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(ILclient!dia;I)V")
	private void method3080(@OriginalArg(1) Class13_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static574.aFloat198 = arg0.aFloat61;
		arg0.method1984((float) arg1);
		arg0.method2021();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1954(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lclient!dia;B)V")
	private void method3081(@OriginalArg(0) Class13_Sub2 arg0) {
		arg0.method1954(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static574.aFloat198 != arg0.aFloat61) {
			arg0.xa(Static574.aFloat198);
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(ZLclient!dia;I)V")
	private void method3083(@OriginalArg(1) Class13_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray22, 0);
		@Pc(13) float local13 = this.aFloatArray22[0];
		@Pc(18) float local18 = this.aFloatArray22[4];
		@Pc(23) float local23 = this.aFloatArray22[8];
		@Pc(28) float local28 = this.aFloatArray22[1];
		@Pc(33) float local33 = this.aFloatArray22[5];
		@Pc(38) float local38 = this.aFloatArray22[9];
		@Pc(42) float local42 = local28 + local13;
		@Pc(46) float local46 = local18 + local33;
		@Pc(54) float local54 = local23 + local38;
		@Pc(58) float local58 = local13 - local28;
		@Pc(63) float local63 = local18 - local33;
		@Pc(68) float local68 = local23 - local38;
		@Pc(73) float local73 = local28 - local13;
		@Pc(78) float local78 = local33 - local18;
		this.aClass3_Sub25_Sub2_2.anInt9765 = 0;
		@Pc(87) float local87 = local38 - local23;
		@Pc(94) int local94;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(127) Class28_Sub4_Sub2 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(488) float local488;
		@Pc(493) int local493;
		@Pc(434) int local434;
		@Pc(449) Class28_Sub4_Sub2 local449;
		@Pc(452) int local452;
		@Pc(465) byte local465;
		@Pc(470) byte local470;
		@Pc(482) float local482;
		if (arg0.aBoolean166) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local110 = this.anIntArray293[local94] <= 64 ? this.anIntArray293[local94] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local127 = this.aClass28_Sub4_Sub2ArrayArray1[local94][local119];
						local130 = local127.anInt9658;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = (float) (local127.anInt9656 >> 12);
						local160 = (float) (local127.anInt9650 >> 12);
						local166 = (float) (local127.anInt9652 >> 12);
						local171 = local127.anInt9651 >> 12;
						this.aClass3_Sub25_Sub2_2.method8652(0.0F);
						this.aClass3_Sub25_Sub2_2.method8652(0.0F);
						this.aClass3_Sub25_Sub2_2.method8652(local154 + (float) -local171 * local42);
						this.aClass3_Sub25_Sub2_2.method8652(local160 + local46 * (float) -local171);
						this.aClass3_Sub25_Sub2_2.method8652(local54 * (float) -local171 + local166);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
						this.aClass3_Sub25_Sub2_2.method8652(1.0F);
						this.aClass3_Sub25_Sub2_2.method8652(0.0F);
						this.aClass3_Sub25_Sub2_2.method8652(local154 + (float) local171 * local58);
						this.aClass3_Sub25_Sub2_2.method8652(local160 + (float) local171 * local63);
						this.aClass3_Sub25_Sub2_2.method8652((float) local171 * local68 + local166);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
						this.aClass3_Sub25_Sub2_2.method8652(1.0F);
						this.aClass3_Sub25_Sub2_2.method8652(1.0F);
						this.aClass3_Sub25_Sub2_2.method8652(local154 + (float) local171 * local42);
						this.aClass3_Sub25_Sub2_2.method8652(local46 * (float) local171 + local160);
						this.aClass3_Sub25_Sub2_2.method8652((float) local171 * local54 + local166);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
						this.aClass3_Sub25_Sub2_2.method8652(0.0F);
						this.aClass3_Sub25_Sub2_2.method8652(1.0F);
						this.aClass3_Sub25_Sub2_2.method8652(local154 + local73 * (float) local171);
						this.aClass3_Sub25_Sub2_2.method8652(local78 * (float) local171 + local160);
						this.aClass3_Sub25_Sub2_2.method8652(local87 * (float) local171 + local166);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
					}
					if (this.anIntArray293[local94] > 64) {
						local434 = this.anIntArray293[local94] - 1 - 64;
						for (local130 = this.anIntArray294[local434] - 1; local130 >= 0; local130--) {
							local449 = this.aClass28_Sub4_Sub2ArrayArray2[local434][local130];
							local452 = local449.anInt9658;
							local143 = (byte) (local452 >> 16);
							local148 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local166 = (float) (local449.anInt9656 >> 12);
							local482 = (float) (local449.anInt9650 >> 12);
							local488 = (float) (local449.anInt9652 >> 12);
							local493 = local449.anInt9651 >> 12;
							this.aClass3_Sub25_Sub2_2.method8652(0.0F);
							this.aClass3_Sub25_Sub2_2.method8652(0.0F);
							this.aClass3_Sub25_Sub2_2.method8652(local166 + local42 * (float) -local493);
							this.aClass3_Sub25_Sub2_2.method8652(local46 * (float) -local493 + local482);
							this.aClass3_Sub25_Sub2_2.method8652((float) -local493 * local54 + local488);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
							this.aClass3_Sub25_Sub2_2.method8652(1.0F);
							this.aClass3_Sub25_Sub2_2.method8652(0.0F);
							this.aClass3_Sub25_Sub2_2.method8652(local166 + (float) local493 * local58);
							this.aClass3_Sub25_Sub2_2.method8652(local482 + local63 * (float) local493);
							this.aClass3_Sub25_Sub2_2.method8652(local68 * (float) local493 + local488);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
							this.aClass3_Sub25_Sub2_2.method8652(1.0F);
							this.aClass3_Sub25_Sub2_2.method8652(1.0F);
							this.aClass3_Sub25_Sub2_2.method8652(local166 + local42 * (float) local493);
							this.aClass3_Sub25_Sub2_2.method8652(local46 * (float) local493 + local482);
							this.aClass3_Sub25_Sub2_2.method8652(local54 * (float) local493 + local488);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
							this.aClass3_Sub25_Sub2_2.method8652(0.0F);
							this.aClass3_Sub25_Sub2_2.method8652(1.0F);
							this.aClass3_Sub25_Sub2_2.method8652((float) local493 * local73 + local166);
							this.aClass3_Sub25_Sub2_2.method8652((float) local493 * local78 + local482);
							this.aClass3_Sub25_Sub2_2.method8652(local488 + (float) local493 * local87);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local110 = this.anIntArray293[local94] > 64 ? 64 : this.anIntArray293[local94];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local127 = this.aClass28_Sub4_Sub2ArrayArray1[local94][local119];
						local130 = local127.anInt9658;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = (float) (local127.anInt9656 >> 12);
						local160 = (float) (local127.anInt9650 >> 12);
						local166 = (float) (local127.anInt9652 >> 12);
						local171 = local127.anInt9651 >> 12;
						this.aClass3_Sub25_Sub2_2.method8653(0.0F);
						this.aClass3_Sub25_Sub2_2.method8653(0.0F);
						this.aClass3_Sub25_Sub2_2.method8653(local42 * (float) -local171 + local154);
						this.aClass3_Sub25_Sub2_2.method8653((float) -local171 * local46 + local160);
						this.aClass3_Sub25_Sub2_2.method8653(local54 * (float) -local171 + local166);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
						this.aClass3_Sub25_Sub2_2.method8653(1.0F);
						this.aClass3_Sub25_Sub2_2.method8653(0.0F);
						this.aClass3_Sub25_Sub2_2.method8653((float) local171 * local58 + local154);
						this.aClass3_Sub25_Sub2_2.method8653(local160 + (float) local171 * local63);
						this.aClass3_Sub25_Sub2_2.method8653(local68 * (float) local171 + local166);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
						this.aClass3_Sub25_Sub2_2.method8653(1.0F);
						this.aClass3_Sub25_Sub2_2.method8653(1.0F);
						this.aClass3_Sub25_Sub2_2.method8653(local154 + local42 * (float) local171);
						this.aClass3_Sub25_Sub2_2.method8653(local46 * (float) local171 + local160);
						this.aClass3_Sub25_Sub2_2.method8653(local166 + (float) local171 * local54);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
						this.aClass3_Sub25_Sub2_2.method8653(0.0F);
						this.aClass3_Sub25_Sub2_2.method8653(1.0F);
						this.aClass3_Sub25_Sub2_2.method8653(local154 + (float) local171 * local73);
						this.aClass3_Sub25_Sub2_2.method8653(local78 * (float) local171 + local160);
						this.aClass3_Sub25_Sub2_2.method8653(local166 + (float) local171 * local87);
						this.aClass3_Sub25_Sub2_2.method8614(local135);
						this.aClass3_Sub25_Sub2_2.method8614(local140);
						this.aClass3_Sub25_Sub2_2.method8614(local143);
						this.aClass3_Sub25_Sub2_2.method8614(local148);
					}
					if (this.anIntArray293[local94] > 64) {
						local434 = this.anIntArray293[local94] - 64 - 1;
						for (local130 = this.anIntArray294[local434] - 1; local130 >= 0; local130--) {
							local449 = this.aClass28_Sub4_Sub2ArrayArray2[local434][local130];
							local452 = local449.anInt9658;
							local143 = (byte) (local452 >> 16);
							local148 = (byte) (local452 >> 8);
							local465 = (byte) local452;
							local470 = (byte) (local452 >>> 24);
							local166 = (float) (local449.anInt9656 >> 12);
							local482 = (float) (local449.anInt9650 >> 12);
							local488 = (float) (local449.anInt9652 >> 12);
							local493 = local449.anInt9651 >> 12;
							this.aClass3_Sub25_Sub2_2.method8653(0.0F);
							this.aClass3_Sub25_Sub2_2.method8653(0.0F);
							this.aClass3_Sub25_Sub2_2.method8653(local166 + (float) -local493 * local42);
							this.aClass3_Sub25_Sub2_2.method8653(local482 + (float) -local493 * local46);
							this.aClass3_Sub25_Sub2_2.method8653(local488 + (float) -local493 * local54);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
							this.aClass3_Sub25_Sub2_2.method8653(1.0F);
							this.aClass3_Sub25_Sub2_2.method8653(0.0F);
							this.aClass3_Sub25_Sub2_2.method8653((float) local493 * local58 + local166);
							this.aClass3_Sub25_Sub2_2.method8653((float) local493 * local63 + local482);
							this.aClass3_Sub25_Sub2_2.method8653(local488 + local68 * (float) local493);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
							this.aClass3_Sub25_Sub2_2.method8653(1.0F);
							this.aClass3_Sub25_Sub2_2.method8653(1.0F);
							this.aClass3_Sub25_Sub2_2.method8653(local166 + local42 * (float) local493);
							this.aClass3_Sub25_Sub2_2.method8653(local482 + (float) local493 * local46);
							this.aClass3_Sub25_Sub2_2.method8653(local488 + (float) local493 * local54);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
							this.aClass3_Sub25_Sub2_2.method8653(0.0F);
							this.aClass3_Sub25_Sub2_2.method8653(1.0F);
							this.aClass3_Sub25_Sub2_2.method8653(local73 * (float) local493 + local166);
							this.aClass3_Sub25_Sub2_2.method8653((float) local493 * local78 + local482);
							this.aClass3_Sub25_Sub2_2.method8653(local488 + (float) local493 * local87);
							this.aClass3_Sub25_Sub2_2.method8614(local143);
							this.aClass3_Sub25_Sub2_2.method8614(local148);
							this.aClass3_Sub25_Sub2_2.method8614(local465);
							this.aClass3_Sub25_Sub2_2.method8614(local470);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub25_Sub2_2.anInt9765 != 0) {
			this.anInterface9_4.method8391(this.aClass3_Sub25_Sub2_2.aByteArray106, 24, this.aClass3_Sub25_Sub2_2.anInt9765);
			arg0.method1971((Class381) null, this.aClass381_8, this.aClass381_7, this.aClass381_9);
			arg0.method1998(this.aClass3_Sub25_Sub2_2.anInt9765 / 24);
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(Lclient!dia;I)V")
	public void method3084(@OriginalArg(0) Class13_Sub2 arg0) {
		this.anInterface9_4 = arg0.method1967(196584, (byte[]) null, true, 24);
		this.aClass381_9 = new Class381(this.anInterface9_4, 5126, 2, 0);
		this.aClass381_7 = new Class381(this.anInterface9_4, 5126, 3, 8);
		this.aClass381_8 = new Class381(this.anInterface9_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(ILclient!ef;ILclient!dia;)V")
	public void method3087(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13_Sub2 arg2) {
		if (arg2.aClass239_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method3080(arg2, arg1);
		} else {
			this.method3088(arg2);
		}
		@Pc(23) float local23 = arg2.aClass239_Sub2_3.aFloat160;
		@Pc(27) float local27 = arg2.aClass239_Sub2_3.aFloat169;
		@Pc(31) float local31 = arg2.aClass239_Sub2_3.aFloat166;
		@Pc(35) float local35 = arg2.aClass239_Sub2_3.aFloat167;
		try {
			@Pc(41) int local41 = 0;
			@Pc(43) int local43 = Integer.MAX_VALUE;
			@Pc(45) int local45 = 0;
			@Pc(49) Class28_Sub4 local49 = arg0.aClass137_1.aClass28_Sub4_1;
			@Pc(52) Class28_Sub4 local52;
			@Pc(83) int local83;
			for (local52 = local49.aClass28_Sub4_9; local52 != local49; local52 = local52.aClass28_Sub4_9) {
				@Pc(56) Class28_Sub4_Sub2 local56 = (Class28_Sub4_Sub2) local52;
				local83 = (int) (local31 * (float) (local56.anInt9652 >> 12) + (float) (local56.anInt9656 >> 12) * local23 + (float) (local56.anInt9650 >> 12) * local27 + local35);
				if (local83 > local45) {
					local45 = local83;
				}
				this.anIntArray295[local41++] = local83;
				if (local83 < local43) {
					local43 = local83;
				}
			}
			@Pc(118) int local118 = local45 - local43;
			if (local118 + 2 <= 1600) {
				local118 += 2;
				local83 = 0;
			} else {
				local83 = Static673.method9349(local118) + 1 - this.anInt3340;
				local118 = (local118 >> local83) + 2;
			}
			local52 = local49.aClass28_Sub4_9;
			local41 = 0;
			@Pc(152) int local152 = -2;
			@Pc(154) boolean local154 = true;
			@Pc(156) boolean local156 = true;
			while (local49 != local52) {
				this.anInt3343 = 0;
				for (@Pc(162) int local162 = 0; local162 < local118; local162++) {
					this.anIntArray293[local162] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray294[local178] = 0;
				}
				while (local49 != local52) {
					@Pc(192) Class28_Sub4_Sub2 local192 = (Class28_Sub4_Sub2) local52;
					if (local156) {
						local156 = false;
						local154 = local192.aBoolean743;
						local152 = local192.anInt9657;
					}
					if (local41 > 0 && (local192.anInt9657 != local152 || local154 != local192.aBoolean743)) {
						local156 = true;
						break;
					}
					@Pc(226) int local226 = this.anIntArray295[local41++] - local43 >> local83;
					if (local226 < 1600) {
						if (this.anIntArray293[local226] < 64) {
							this.aClass28_Sub4_Sub2ArrayArray1[local226][this.anIntArray293[local226]++] = local192;
						} else {
							label97: {
								if (this.anIntArray293[local226] == 64) {
									if (this.anInt3343 == 64) {
										break label97;
									}
									this.anIntArray293[local226] += this.anInt3343++ + 1;
								}
								@Pc(296) Class28_Sub4_Sub2[] local296 = this.aClass28_Sub4_Sub2ArrayArray2[this.anIntArray293[local226] - 64 - 1];
								@Pc(306) int local306 = this.anIntArray293[local226] - 1 - 64;
								@Pc(308) int local308 = this.anIntArray294[this.anIntArray293[local226] - 1 - 64];
								this.anIntArray294[local306] = this.anIntArray294[this.anIntArray293[local226] - 1 - 64] + 1;
								local296[local308] = local192;
							}
						}
					}
					local52 = local52.aClass28_Sub4_9;
				}
				if (local152 < 0) {
					arg2.method2011(-1);
				} else {
					arg2.method2011(local152);
				}
				if (local154 && Static574.aFloat198 != arg2.aFloat61) {
					arg2.xa(Static574.aFloat198);
				} else if (arg2.aFloat61 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method3083(arg2, local118);
			}
		} catch (@Pc(360) Exception local360) {
		}
		this.method3081(arg2);
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(Lclient!dia;B)V")
	private void method3088(@OriginalArg(0) Class13_Sub2 arg0) {
		Static574.aFloat198 = arg0.aFloat61;
		arg0.method1959();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method1954(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
