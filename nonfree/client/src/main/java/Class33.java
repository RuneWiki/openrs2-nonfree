import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class33 {

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Lclient!m;")
	private Class145 aClass145_1;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!m;")
	private Class145 aClass145_2;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!m;")
	private Class145 aClass145_3;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "Lclient!ms;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[F")
	private final float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!ns;")
	private final Class3_Sub25_Sub2 aClass3_Sub25_Sub2_1 = new Class3_Sub25_Sub2(786336);

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	private final int anInt882 = Static263.method5521(1600);

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "[[Lclient!rg;")
	private final Class23_Sub1_Sub2[][] aClass23_Sub1_Sub2ArrayArray1 = new Class23_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "[I")
	private final int[] anIntArray48 = new int[64];

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
	private final int[] anIntArray47 = new int[8191];

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "[I")
	private final int[] anIntArray49 = new int[1600];

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "[[Lclient!rg;")
	private final Class23_Sub1_Sub2[][] aClass23_Sub1_Sub2ArrayArray2 = new Class23_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	private int anInt884 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!fq;BLclient!nq;)V")
	public void method917(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class167_Sub1 arg1) {
		if (arg1.aClass11_Sub2_3 == null) {
			return;
		}
		this.method918(arg1);
		@Pc(17) float local17 = arg1.aClass11_Sub2_3.aFloat47;
		@Pc(21) float local21 = arg1.aClass11_Sub2_3.aFloat45;
		@Pc(25) float local25 = arg1.aClass11_Sub2_3.aFloat40;
		@Pc(29) float local29 = arg1.aClass11_Sub2_3.aFloat38;
		try {
			@Pc(39) int local39;
			@Pc(54) int local54;
			@Pc(72) Class23_Sub1 local72;
			@Pc(85) int local85;
			@Pc(228) Class23_Sub1_Sub2[] local228;
			@Pc(178) int local178;
			@Pc(238) int local238;
			@Pc(240) int local240;
			if (arg0.aBoolean124) {
				local39 = arg0.anInt2075 - arg0.anInt2077;
				if (local39 + 2 > 1600) {
					local54 = Static263.method5521(local39) + 1 - this.anInt882;
					local39 = (local39 >> local54) + 2;
				} else {
					local39 += 2;
					local54 = 0;
				}
				@Pc(69) Class23_Sub1 local69 = arg0.aClass222_1.aClass23_Sub1_9;
				local72 = local69.aClass23_Sub1_7;
				@Pc(74) int local74 = -2;
				@Pc(76) boolean local76 = true;
				@Pc(78) boolean local78 = true;
				while (local69 != local72) {
					this.anInt884 = 0;
					for (local85 = 0; local85 < local39; local85++) {
						this.anIntArray49[local85] = 0;
					}
					for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
						this.anIntArray48[local102] = 0;
					}
					while (local72 != local69) {
						@Pc(118) Class23_Sub1_Sub2 local118 = (Class23_Sub1_Sub2) local72;
						if (local78) {
							local74 = local118.anInt4416;
							local78 = false;
							local76 = local118.aBoolean321;
						} else if (local74 != local118.anInt4416 || local118.aBoolean321 != local76) {
							local78 = true;
							break;
						}
						local178 = (int) (local29 + local21 * (float) (local118.anInt4417 >> 12) + (float) (local118.anInt4414 >> 12) * local17 + (float) (local118.anInt4421 >> 12) * local25) - arg0.anInt2077 >> local54;
						if (local178 < 1600) {
							if (this.anIntArray49[local178] >= 64) {
								label193: {
									if (this.anIntArray49[local178] == 64) {
										if (this.anInt884 == 64) {
											break label193;
										}
										this.anIntArray49[local178] += this.anInt884++ + 1;
									}
									local228 = this.aClass23_Sub1_Sub2ArrayArray2[this.anIntArray49[local178] - 64 - 1];
									local238 = this.anIntArray49[local178] - 1 - 64;
									local240 = this.anIntArray48[this.anIntArray49[local178] - 1 - 64];
									this.anIntArray48[local238] = this.anIntArray48[this.anIntArray49[local178] - 1 - 64] + 1;
									local228[local240] = local118;
								}
							} else {
								this.aClass23_Sub1_Sub2ArrayArray1[local178][this.anIntArray49[local178]++] = local118;
							}
						}
						local72 = local72.aClass23_Sub1_7;
					}
					if (local74 >= 0) {
						arg1.method4028(arg1.aClass122_1.method3081(local74));
						arg1.method3998(arg1.anInterface7_8.method4417(local74).anInt3012);
					} else {
						arg1.method4028(null);
					}
					if (local76 && arg1.aFloat66 != Static412.aFloat99) {
						arg1.MA(Static412.aFloat99);
					} else if (arg1.aFloat66 != 1.0F) {
						arg1.MA(1.0F);
					}
					this.method923(arg1, local39);
				}
			} else {
				local39 = 0;
				local54 = Integer.MAX_VALUE;
				@Pc(333) int local333 = 0;
				local72 = arg0.aClass222_1.aClass23_Sub1_9;
				@Pc(340) Class23_Sub1 local340;
				@Pc(372) int local372;
				for (local340 = local72.aClass23_Sub1_7; local340 != local72; local340 = local340.aClass23_Sub1_7) {
					@Pc(345) Class23_Sub1_Sub2 local345 = (Class23_Sub1_Sub2) local340;
					local372 = (int) (local29 + local25 * (float) (local345.anInt4421 >> 12) + (float) (local345.anInt4414 >> 12) * local17 + (float) (local345.anInt4417 >> 12) * local21);
					if (local54 > local372) {
						local54 = local372;
					}
					this.anIntArray47[local39++] = local372;
					if (local372 > local333) {
						local333 = local372;
					}
				}
				@Pc(403) int local403 = local333 - local54;
				if (local403 + 2 <= 1600) {
					local403 += 2;
					local372 = 0;
				} else {
					local372 = Static263.method5521(local403) + 1 - this.anInt882;
					local403 = (local403 >> local372) + 2;
				}
				local340 = local72.aClass23_Sub1_7;
				local39 = 0;
				local85 = -2;
				@Pc(438) boolean local438 = true;
				@Pc(440) boolean local440 = true;
				while (local72 != local340) {
					this.anInt884 = 0;
					for (local178 = 0; local178 < local403; local178++) {
						this.anIntArray49[local178] = 0;
					}
					for (@Pc(464) int local464 = 0; local464 < 64; local464++) {
						this.anIntArray48[local464] = 0;
					}
					while (local340 != local72) {
						@Pc(480) Class23_Sub1_Sub2 local480 = (Class23_Sub1_Sub2) local340;
						if (local440) {
							local440 = false;
							local85 = local480.anInt4416;
							local438 = local480.aBoolean321;
						}
						if (local39 > 0 && (local85 != local480.anInt4416 || local438 != local480.aBoolean321)) {
							local440 = true;
							break;
						}
						@Pc(522) int local522 = this.anIntArray47[local39++] - local54 >> local372;
						if (local522 < 1600) {
							if (this.anIntArray49[local522] >= 64) {
								label143: {
									if (this.anIntArray49[local522] == 64) {
										if (this.anInt884 == 64) {
											break label143;
										}
										this.anIntArray49[local522] += this.anInt884++ + 1;
									}
									local228 = this.aClass23_Sub1_Sub2ArrayArray2[this.anIntArray49[local522] - 65];
									local238 = this.anIntArray49[local522] - 1 - 64;
									local240 = this.anIntArray48[this.anIntArray49[local522] - 1 - 64];
									this.anIntArray48[local238] = this.anIntArray48[this.anIntArray49[local522] - 1 - 64] + 1;
									local228[local240] = local480;
								}
							} else {
								this.aClass23_Sub1_Sub2ArrayArray1[local522][this.anIntArray49[local522]++] = local480;
							}
						}
						local340 = local340.aClass23_Sub1_7;
					}
					if (local85 < 0) {
						arg1.method4028(null);
					} else {
						arg1.method4028(arg1.aClass122_1.method3081(local85));
						arg1.method3998(arg1.anInterface7_8.method4417(local85).anInt3012);
					}
					if (local438 && arg1.aFloat66 != Static412.aFloat99) {
						arg1.MA(Static412.aFloat99);
					} else if (arg1.aFloat66 != 1.0F) {
						arg1.MA(1.0F);
					}
					this.method923(arg1, local403);
				}
			}
		} catch (@Pc(678) Exception local678) {
		}
		this.method922(arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!nq;)V")
	private void method918(@OriginalArg(1) Class167_Sub1 arg0) {
		Static412.aFloat99 = arg0.aFloat66;
		arg0.method4031();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4036(false);
		arg0.method3968(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!nq;I)V")
	public void method919(@OriginalArg(0) Class167_Sub1 arg0) {
		this.anInterface9_1 = arg0.method4001(null, 196584, true, 24);
		this.aClass145_1 = new Class145(this.anInterface9_1, 5126, 2, 0);
		this.aClass145_3 = new Class145(this.anInterface9_1, 5126, 3, 8);
		this.aClass145_2 = new Class145(this.anInterface9_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lclient!nq;I)V")
	private void method922(@OriginalArg(0) Class167_Sub1 arg0) {
		arg0.method4036(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static412.aFloat99 != arg0.aFloat66) {
			arg0.MA(Static412.aFloat99);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!nq;II)V")
	private void method923(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray5, 0);
		@Pc(15) float local15 = this.aFloatArray5[0];
		@Pc(20) float local20 = this.aFloatArray5[4];
		@Pc(25) float local25 = this.aFloatArray5[8];
		@Pc(30) float local30 = this.aFloatArray5[1];
		@Pc(39) float local39 = this.aFloatArray5[5];
		@Pc(44) float local44 = this.aFloatArray5[9];
		@Pc(48) float local48 = local15 + local30;
		@Pc(52) float local52 = local20 + local39;
		@Pc(56) float local56 = local25 + local44;
		@Pc(60) float local60 = local15 - local30;
		@Pc(65) float local65 = local20 - local39;
		@Pc(70) float local70 = local25 - local44;
		@Pc(74) float local74 = local30 - local15;
		@Pc(78) float local78 = local39 - local20;
		@Pc(82) float local82 = local44 - local25;
		this.aClass3_Sub25_Sub2_1.anInt4974 = 0;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class23_Sub1_Sub2 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(491) float local491;
		@Pc(496) int local496;
		@Pc(436) int local436;
		@Pc(452) Class23_Sub1_Sub2 local452;
		@Pc(455) int local455;
		@Pc(468) byte local468;
		@Pc(473) byte local473;
		@Pc(485) float local485;
		if (arg0.aBoolean349) {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray49[local93] <= 64 ? this.anIntArray49[local93] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass23_Sub1_Sub2ArrayArray1[local93][local114];
						local126 = local123.anInt4420;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4414 >> 12;
						local156 = local123.anInt4417 >> 12;
						local162 = local123.anInt4421 >> 12;
						local167 = local123.anInt4413 >> 12;
						this.aClass3_Sub25_Sub2_1.method4128(0.0F);
						this.aClass3_Sub25_Sub2_1.method4128(0.0F);
						this.aClass3_Sub25_Sub2_1.method4128(local48 * (float) -local167 + local150);
						this.aClass3_Sub25_Sub2_1.method4128(local156 + (float) -local167 * local52);
						this.aClass3_Sub25_Sub2_1.method4128(local162 + local56 * (float) -local167);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
						this.aClass3_Sub25_Sub2_1.method4128(1.0F);
						this.aClass3_Sub25_Sub2_1.method4128(0.0F);
						this.aClass3_Sub25_Sub2_1.method4128((float) local167 * local60 + local150);
						this.aClass3_Sub25_Sub2_1.method4128(local156 + (float) local167 * local65);
						this.aClass3_Sub25_Sub2_1.method4128(local162 + (float) local167 * local70);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
						this.aClass3_Sub25_Sub2_1.method4128(1.0F);
						this.aClass3_Sub25_Sub2_1.method4128(1.0F);
						this.aClass3_Sub25_Sub2_1.method4128(local150 + (float) local167 * local48);
						this.aClass3_Sub25_Sub2_1.method4128(local156 + (float) local167 * local52);
						this.aClass3_Sub25_Sub2_1.method4128(local56 * (float) local167 + local162);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
						this.aClass3_Sub25_Sub2_1.method4128(0.0F);
						this.aClass3_Sub25_Sub2_1.method4128(1.0F);
						this.aClass3_Sub25_Sub2_1.method4128((float) local167 * local74 + local150);
						this.aClass3_Sub25_Sub2_1.method4128(local78 * (float) local167 + local156);
						this.aClass3_Sub25_Sub2_1.method4128(local82 * (float) local167 + local162);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
					}
					if (this.anIntArray49[local93] > 64) {
						local436 = this.anIntArray49[local93] - 64 - 1;
						for (local126 = this.anIntArray48[local436] - 1; local126 >= 0; local126--) {
							local452 = this.aClass23_Sub1_Sub2ArrayArray2[local436][local126];
							local455 = local452.anInt4420;
							local139 = (byte) (local455 >> 16);
							local144 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local162 = local452.anInt4414 >> 12;
							local485 = local452.anInt4417 >> 12;
							local491 = local452.anInt4421 >> 12;
							local496 = local452.anInt4413 >> 12;
							this.aClass3_Sub25_Sub2_1.method4128(0.0F);
							this.aClass3_Sub25_Sub2_1.method4128(0.0F);
							this.aClass3_Sub25_Sub2_1.method4128(local162 + (float) -local496 * local48);
							this.aClass3_Sub25_Sub2_1.method4128(local485 + (float) -local496 * local52);
							this.aClass3_Sub25_Sub2_1.method4128((float) -local496 * local56 + local491);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
							this.aClass3_Sub25_Sub2_1.method4128(1.0F);
							this.aClass3_Sub25_Sub2_1.method4128(0.0F);
							this.aClass3_Sub25_Sub2_1.method4128((float) local496 * local60 + local162);
							this.aClass3_Sub25_Sub2_1.method4128(local65 * (float) local496 + local485);
							this.aClass3_Sub25_Sub2_1.method4128((float) local496 * local70 + local491);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
							this.aClass3_Sub25_Sub2_1.method4128(1.0F);
							this.aClass3_Sub25_Sub2_1.method4128(1.0F);
							this.aClass3_Sub25_Sub2_1.method4128((float) local496 * local48 + local162);
							this.aClass3_Sub25_Sub2_1.method4128(local485 + (float) local496 * local52);
							this.aClass3_Sub25_Sub2_1.method4128(local491 + (float) local496 * local56);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
							this.aClass3_Sub25_Sub2_1.method4128(0.0F);
							this.aClass3_Sub25_Sub2_1.method4128(1.0F);
							this.aClass3_Sub25_Sub2_1.method4128(local162 + (float) local496 * local74);
							this.aClass3_Sub25_Sub2_1.method4128(local485 + local78 * (float) local496);
							this.aClass3_Sub25_Sub2_1.method4128(local82 * (float) local496 + local491);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
						}
					}
				}
			}
		} else {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray49[local93] <= 64 ? this.anIntArray49[local93] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass23_Sub1_Sub2ArrayArray1[local93][local114];
						local126 = local123.anInt4420;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4414 >> 12;
						local156 = local123.anInt4417 >> 12;
						local162 = local123.anInt4421 >> 12;
						local167 = local123.anInt4413 >> 12;
						this.aClass3_Sub25_Sub2_1.method4130(0.0F);
						this.aClass3_Sub25_Sub2_1.method4130(0.0F);
						this.aClass3_Sub25_Sub2_1.method4130(local48 * (float) -local167 + local150);
						this.aClass3_Sub25_Sub2_1.method4130((float) -local167 * local52 + local156);
						this.aClass3_Sub25_Sub2_1.method4130((float) -local167 * local56 + local162);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
						this.aClass3_Sub25_Sub2_1.method4130(1.0F);
						this.aClass3_Sub25_Sub2_1.method4130(0.0F);
						this.aClass3_Sub25_Sub2_1.method4130(local150 + local60 * (float) local167);
						this.aClass3_Sub25_Sub2_1.method4130(local156 + (float) local167 * local65);
						this.aClass3_Sub25_Sub2_1.method4130((float) local167 * local70 + local162);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
						this.aClass3_Sub25_Sub2_1.method4130(1.0F);
						this.aClass3_Sub25_Sub2_1.method4130(1.0F);
						this.aClass3_Sub25_Sub2_1.method4130(local150 + local48 * (float) local167);
						this.aClass3_Sub25_Sub2_1.method4130(local156 + (float) local167 * local52);
						this.aClass3_Sub25_Sub2_1.method4130(local162 + local56 * (float) local167);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
						this.aClass3_Sub25_Sub2_1.method4130(0.0F);
						this.aClass3_Sub25_Sub2_1.method4130(1.0F);
						this.aClass3_Sub25_Sub2_1.method4130(local150 + local74 * (float) local167);
						this.aClass3_Sub25_Sub2_1.method4130(local156 + local78 * (float) local167);
						this.aClass3_Sub25_Sub2_1.method4130(local162 + local82 * (float) local167);
						this.aClass3_Sub25_Sub2_1.method4081(local131);
						this.aClass3_Sub25_Sub2_1.method4081(local136);
						this.aClass3_Sub25_Sub2_1.method4081(local139);
						this.aClass3_Sub25_Sub2_1.method4081(local144);
					}
					if (this.anIntArray49[local93] > 64) {
						local436 = this.anIntArray49[local93] - 1 - 64;
						for (local126 = this.anIntArray48[local436] - 1; local126 >= 0; local126--) {
							local452 = this.aClass23_Sub1_Sub2ArrayArray2[local436][local126];
							local455 = local452.anInt4420;
							local139 = (byte) (local455 >> 16);
							local144 = (byte) (local455 >> 8);
							local468 = (byte) local455;
							local473 = (byte) (local455 >>> 24);
							local162 = local452.anInt4414 >> 12;
							local485 = local452.anInt4417 >> 12;
							local491 = local452.anInt4421 >> 12;
							local496 = local452.anInt4413 >> 12;
							this.aClass3_Sub25_Sub2_1.method4130(0.0F);
							this.aClass3_Sub25_Sub2_1.method4130(0.0F);
							this.aClass3_Sub25_Sub2_1.method4130(local162 + (float) -local496 * local48);
							this.aClass3_Sub25_Sub2_1.method4130(local485 + (float) -local496 * local52);
							this.aClass3_Sub25_Sub2_1.method4130(local491 + (float) -local496 * local56);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
							this.aClass3_Sub25_Sub2_1.method4130(1.0F);
							this.aClass3_Sub25_Sub2_1.method4130(0.0F);
							this.aClass3_Sub25_Sub2_1.method4130((float) local496 * local60 + local162);
							this.aClass3_Sub25_Sub2_1.method4130((float) local496 * local65 + local485);
							this.aClass3_Sub25_Sub2_1.method4130(local491 + local70 * (float) local496);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
							this.aClass3_Sub25_Sub2_1.method4130(1.0F);
							this.aClass3_Sub25_Sub2_1.method4130(1.0F);
							this.aClass3_Sub25_Sub2_1.method4130((float) local496 * local48 + local162);
							this.aClass3_Sub25_Sub2_1.method4130((float) local496 * local52 + local485);
							this.aClass3_Sub25_Sub2_1.method4130((float) local496 * local56 + local491);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
							this.aClass3_Sub25_Sub2_1.method4130(0.0F);
							this.aClass3_Sub25_Sub2_1.method4130(1.0F);
							this.aClass3_Sub25_Sub2_1.method4130(local74 * (float) local496 + local162);
							this.aClass3_Sub25_Sub2_1.method4130(local485 + (float) local496 * local78);
							this.aClass3_Sub25_Sub2_1.method4130((float) local496 * local82 + local491);
							this.aClass3_Sub25_Sub2_1.method4081(local139);
							this.aClass3_Sub25_Sub2_1.method4081(local144);
							this.aClass3_Sub25_Sub2_1.method4081(local468);
							this.aClass3_Sub25_Sub2_1.method4081(local473);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub25_Sub2_1.anInt4974 != 0) {
			this.anInterface9_1.method2083(24, this.aClass3_Sub25_Sub2_1.anInt4974, this.aClass3_Sub25_Sub2_1.aByteArray88);
			arg0.method4045(this.aClass145_3, null, this.aClass145_1, this.aClass145_2);
			arg0.method3974(this.aClass3_Sub25_Sub2_1.anInt4974 / 24);
		}
	}
}
