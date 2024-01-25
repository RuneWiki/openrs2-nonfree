import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class264 {

	@OriginalMember(owner = "client!w", name = "j", descriptor = "Lclient!lm;")
	private Interface8 anInterface8_7;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!ft;")
	private Class87 aClass87_14;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Lclient!ft;")
	private Class87 aClass87_15;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!ft;")
	private Class87 aClass87_16;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[F")
	private final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!pb;")
	private final Class7_Sub14_Sub2 aClass7_Sub14_Sub2_3 = new Class7_Sub14_Sub2(786336);

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	private final int anInt7321 = Static88.method1559(1600);

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	private int anInt7323 = 0;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "[[Lclient!bq;")
	private final Class28_Sub1_Sub1[][] aClass28_Sub1_Sub1ArrayArray1 = new Class28_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!w", name = "r", descriptor = "[I")
	private final int[] anIntArray614 = new int[8191];

	@OriginalMember(owner = "client!w", name = "v", descriptor = "[I")
	private final int[] anIntArray615 = new int[1600];

	@OriginalMember(owner = "client!w", name = "w", descriptor = "[[Lclient!bq;")
	private final Class28_Sub1_Sub1[][] aClass28_Sub1_Sub1ArrayArray2 = new Class28_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!w", name = "x", descriptor = "[I")
	private final int[] anIntArray616 = new int[64];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!vd;I)V")
	public void method5620(@OriginalArg(0) Class51_Sub2 arg0) {
		this.anInterface8_7 = arg0.method5433(null, true, 24, 196584);
		this.aClass87_15 = new Class87(this.anInterface8_7, 5126, 2, 0);
		this.aClass87_16 = new Class87(this.anInterface8_7, 5126, 3, 8);
		this.aClass87_14 = new Class87(this.anInterface8_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!vd;B)V")
	private void method5621(@OriginalArg(0) Class51_Sub2 arg0) {
		Static46.aFloat22 = arg0.aFloat199;
		arg0.method5384();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5375(false);
		arg0.method5431(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!pv;Lclient!vd;)V")
	public void method5623(@OriginalArg(1) Class201 arg0, @OriginalArg(2) Class51_Sub2 arg1) {
		if (arg1.aClass33_Sub2_3 == null) {
			return;
		}
		this.method5621(arg1);
		@Pc(17) float local17 = arg1.aClass33_Sub2_3.aFloat80;
		@Pc(21) float local21 = arg1.aClass33_Sub2_3.aFloat78;
		@Pc(25) float local25 = arg1.aClass33_Sub2_3.aFloat74;
		@Pc(29) float local29 = arg1.aClass33_Sub2_3.aFloat72;
		try {
			@Pc(39) int local39;
			@Pc(56) int local56;
			@Pc(74) Class28_Sub1 local74;
			@Pc(87) int local87;
			@Pc(179) int local179;
			if (arg0.aBoolean333) {
				local39 = arg0.anInt5204 - arg0.anInt5203;
				if (local39 + 2 > 1600) {
					local56 = Static88.method1559(local39) + 1 - this.anInt7321;
					local39 = (local39 >> local56) + 2;
				} else {
					local56 = 0;
					local39 += 2;
				}
				@Pc(71) Class28_Sub1 local71 = arg0.aClass232_1.aClass28_Sub1_7;
				local74 = local71.aClass28_Sub1_10;
				@Pc(76) int local76 = -2;
				@Pc(78) boolean local78 = true;
				@Pc(80) boolean local80 = true;
				while (local71 != local74) {
					this.anInt7323 = 0;
					for (local87 = 0; local87 < local39; local87++) {
						this.anIntArray615[local87] = 0;
					}
					for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
						this.anIntArray616[local104] = 0;
					}
					while (local74 != local71) {
						@Pc(120) Class28_Sub1_Sub1 local120 = (Class28_Sub1_Sub1) local74;
						if (local80) {
							local76 = local120.anInt4771;
							local78 = local120.aBoolean300;
							local80 = false;
						} else if (local76 != local120.anInt4771 || local120.aBoolean300 != local78) {
							local80 = true;
							break;
						}
						local179 = (int) (local29 + local17 * (float) (local120.anInt4770 >> Static13.anInt158) + (float) (local120.anInt4763 >> Static13.anInt158) * local21 + local25 * (float) (local120.anInt4765 >> Static13.anInt158)) - arg0.anInt5203 >> local56;
						if (local179 < 1600) {
							if (this.anIntArray615[local179] < 64) {
								this.aClass28_Sub1_Sub1ArrayArray2[local179][this.anIntArray615[local179]++] = local120;
							} else {
								label187: {
									if (this.anIntArray615[local179] == 64) {
										if (this.anInt7323 == 64) {
											break label187;
										}
										this.anIntArray615[local179] += this.anInt7323++ + 1;
									}
									@Pc(245) Class28_Sub1_Sub1[] local245 = this.aClass28_Sub1_Sub1ArrayArray1[this.anIntArray615[local179] - 64 - 1];
									@Pc(255) int local255 = this.anIntArray615[local179] - 64 - 1;
									@Pc(257) int local257 = this.anIntArray616[this.anIntArray615[local179] - 64 - 1];
									this.anIntArray616[local255] = this.anIntArray616[this.anIntArray615[local179] - 64 - 1] + 1;
									local245[local257] = local120;
								}
							}
						}
						local74 = local74.aClass28_Sub1_10;
					}
					if (local76 < 0) {
						arg1.method5364(null);
					} else {
						arg1.method5364(arg1.aClass269_1.method5750(local76));
						arg1.method5400(arg1.anInterface4_8.method3138(local76).anInt5348);
					}
					if (local78 && Static46.aFloat22 != arg1.aFloat199) {
						arg1.B(Static46.aFloat22);
					} else if (arg1.aFloat199 != 1.0F) {
						arg1.B(1.0F);
					}
					this.method5626(local39, arg1);
				}
			} else {
				local39 = 0;
				local56 = Integer.MAX_VALUE;
				@Pc(333) int local333 = 0;
				local74 = arg0.aClass232_1.aClass28_Sub1_7;
				@Pc(340) Class28_Sub1 local340;
				@Pc(372) int local372;
				for (local340 = local74.aClass28_Sub1_10; local340 != local74; local340 = local340.aClass28_Sub1_10) {
					@Pc(345) Class28_Sub1_Sub1 local345 = (Class28_Sub1_Sub1) local340;
					local372 = (int) ((float) (local345.anInt4770 >> Static13.anInt158) * local17 + local21 * (float) (local345.anInt4763 >> Static13.anInt158) + local25 * (float) (local345.anInt4765 >> Static13.anInt158) + local29);
					if (local333 < local372) {
						local333 = local372;
					}
					if (local372 < local56) {
						local56 = local372;
					}
					this.anIntArray614[local39++] = local372;
				}
				@Pc(407) int local407 = local333 - local56;
				if (local407 + 2 <= 1600) {
					local372 = 0;
					local407 += 2;
				} else {
					local372 = Static88.method1559(local407) + 1 - this.anInt7321;
					local407 = (local407 >> local372) + 2;
				}
				local39 = 0;
				local340 = local74.aClass28_Sub1_10;
				local87 = -2;
				@Pc(445) boolean local445 = true;
				@Pc(447) boolean local447 = true;
				while (local340 != local74) {
					this.anInt7323 = 0;
					for (local179 = 0; local179 < local407; local179++) {
						this.anIntArray615[local179] = 0;
					}
					for (@Pc(467) int local467 = 0; local467 < 64; local467++) {
						this.anIntArray616[local467] = 0;
					}
					while (local74 != local340) {
						@Pc(483) Class28_Sub1_Sub1 local483 = (Class28_Sub1_Sub1) local340;
						if (local447) {
							local447 = false;
							local87 = local483.anInt4771;
							local445 = local483.aBoolean300;
						}
						if (local39 > 0 && (local483.anInt4771 != local87 || local483.aBoolean300 != local445)) {
							local447 = true;
							break;
						}
						@Pc(526) int local526 = this.anIntArray614[local39++] - local56 >> local372;
						if (local526 < 1600) {
							if (this.anIntArray615[local526] < 64) {
								this.aClass28_Sub1_Sub1ArrayArray2[local526][this.anIntArray615[local526]++] = local483;
							} else {
								label138: {
									if (this.anIntArray615[local526] == 64) {
										if (this.anInt7323 == 64) {
											break label138;
										}
										this.anIntArray615[local526] += this.anInt7323++ + 1;
									}
									this.aClass28_Sub1_Sub1ArrayArray1[this.anIntArray615[local526] - 65][this.anIntArray616[this.anIntArray615[local526] - 64 - 1]++] = local483;
								}
							}
						}
						local340 = local340.aClass28_Sub1_10;
					}
					if (local87 >= 0) {
						arg1.method5364(arg1.aClass269_1.method5750(local87));
						arg1.method5400(arg1.anInterface4_8.method3138(local87).anInt5348);
					} else {
						arg1.method5364(null);
					}
					if (local445 && Static46.aFloat22 != arg1.aFloat199) {
						arg1.B(Static46.aFloat22);
					} else if (arg1.aFloat199 != 1.0F) {
						arg1.B(1.0F);
					}
					this.method5626(local407, arg1);
				}
			}
		} catch (@Pc(680) Exception local680) {
		}
		this.method5625(arg1);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLclient!vd;)V")
	private void method5625(@OriginalArg(1) Class51_Sub2 arg0) {
		arg0.method5375(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static46.aFloat22 != arg0.aFloat199) {
			arg0.B(Static46.aFloat22);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BILclient!vd;)V")
	private void method5626(@OriginalArg(1) int arg0, @OriginalArg(2) Class51_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray32, 0);
		@Pc(15) float local15 = this.aFloatArray32[0];
		@Pc(20) float local20 = this.aFloatArray32[4];
		@Pc(25) float local25 = this.aFloatArray32[8];
		@Pc(30) float local30 = this.aFloatArray32[1];
		@Pc(35) float local35 = this.aFloatArray32[5];
		@Pc(40) float local40 = this.aFloatArray32[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(60) float local60 = local20 - local35;
		@Pc(64) float local64 = local25 - local40;
		@Pc(69) float local69 = local30 - local15;
		@Pc(74) float local74 = local35 - local20;
		this.aClass7_Sub14_Sub2_3.anInt4989 = 0;
		@Pc(86) float local86 = local40 - local25;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(114) int local114;
		@Pc(123) Class28_Sub1_Sub1 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(483) float local483;
		@Pc(488) int local488;
		@Pc(428) int local428;
		@Pc(444) Class28_Sub1_Sub1 local444;
		@Pc(447) int local447;
		@Pc(460) byte local460;
		@Pc(465) byte local465;
		@Pc(477) float local477;
		if (arg1.aBoolean461) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray615[local93] <= 64 ? this.anIntArray615[local93] : 64;
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass28_Sub1_Sub1ArrayArray2[local93][local114];
						local126 = local123.anInt4767;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4770 >> Static13.anInt158;
						local156 = local123.anInt4763 >> Static13.anInt158;
						local162 = local123.anInt4765 >> Static13.anInt158;
						local167 = local123.anInt4760 >> Static13.anInt158;
						this.aClass7_Sub14_Sub2_3.method3996(0.0F);
						this.aClass7_Sub14_Sub2_3.method3996(0.0F);
						this.aClass7_Sub14_Sub2_3.method3996((float) -local167 * local44 + local150);
						this.aClass7_Sub14_Sub2_3.method3996(local48 * (float) -local167 + local156);
						this.aClass7_Sub14_Sub2_3.method3996(local52 * (float) -local167 + local162);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
						this.aClass7_Sub14_Sub2_3.method3996(1.0F);
						this.aClass7_Sub14_Sub2_3.method3996(0.0F);
						this.aClass7_Sub14_Sub2_3.method3996((float) local167 * local56 + local150);
						this.aClass7_Sub14_Sub2_3.method3996(local60 * (float) local167 + local156);
						this.aClass7_Sub14_Sub2_3.method3996(local162 + local64 * (float) local167);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
						this.aClass7_Sub14_Sub2_3.method3996(1.0F);
						this.aClass7_Sub14_Sub2_3.method3996(1.0F);
						this.aClass7_Sub14_Sub2_3.method3996(local150 + local44 * (float) local167);
						this.aClass7_Sub14_Sub2_3.method3996(local156 + (float) local167 * local48);
						this.aClass7_Sub14_Sub2_3.method3996((float) local167 * local52 + local162);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
						this.aClass7_Sub14_Sub2_3.method3996(0.0F);
						this.aClass7_Sub14_Sub2_3.method3996(1.0F);
						this.aClass7_Sub14_Sub2_3.method3996(local69 * (float) local167 + local150);
						this.aClass7_Sub14_Sub2_3.method3996((float) local167 * local74 + local156);
						this.aClass7_Sub14_Sub2_3.method3996(local86 * (float) local167 + local162);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
					}
					if (this.anIntArray615[local93] > 64) {
						local428 = this.anIntArray615[local93] - 64 - 1;
						for (local126 = this.anIntArray616[local428] - 1; local126 >= 0; local126--) {
							local444 = this.aClass28_Sub1_Sub1ArrayArray1[local428][local126];
							local447 = local444.anInt4767;
							local139 = (byte) (local447 >> 16);
							local144 = (byte) (local447 >> 8);
							local460 = (byte) local447;
							local465 = (byte) (local447 >>> 24);
							local162 = local444.anInt4770 >> Static13.anInt158;
							local477 = local444.anInt4763 >> Static13.anInt158;
							local483 = local444.anInt4765 >> Static13.anInt158;
							local488 = local444.anInt4760 >> Static13.anInt158;
							this.aClass7_Sub14_Sub2_3.method3996(0.0F);
							this.aClass7_Sub14_Sub2_3.method3996(0.0F);
							this.aClass7_Sub14_Sub2_3.method3996(local162 + (float) -local488 * local44);
							this.aClass7_Sub14_Sub2_3.method3996(local48 * (float) -local488 + local477);
							this.aClass7_Sub14_Sub2_3.method3996(local483 + (float) -local488 * local52);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
							this.aClass7_Sub14_Sub2_3.method3996(1.0F);
							this.aClass7_Sub14_Sub2_3.method3996(0.0F);
							this.aClass7_Sub14_Sub2_3.method3996((float) local488 * local56 + local162);
							this.aClass7_Sub14_Sub2_3.method3996((float) local488 * local60 + local477);
							this.aClass7_Sub14_Sub2_3.method3996(local483 + local64 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
							this.aClass7_Sub14_Sub2_3.method3996(1.0F);
							this.aClass7_Sub14_Sub2_3.method3996(1.0F);
							this.aClass7_Sub14_Sub2_3.method3996(local162 + local44 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3996(local477 + local48 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3996(local52 * (float) local488 + local483);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
							this.aClass7_Sub14_Sub2_3.method3996(0.0F);
							this.aClass7_Sub14_Sub2_3.method3996(1.0F);
							this.aClass7_Sub14_Sub2_3.method3996(local162 + local69 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3996(local477 + local74 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3996(local483 + local86 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray615[local93] > 64 ? 64 : this.anIntArray615[local93];
				if (local108 > 0) {
					for (local114 = local108 - 1; local114 >= 0; local114--) {
						local123 = this.aClass28_Sub1_Sub1ArrayArray2[local93][local114];
						local126 = local123.anInt4767;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = local123.anInt4770 >> Static13.anInt158;
						local156 = local123.anInt4763 >> Static13.anInt158;
						local162 = local123.anInt4765 >> Static13.anInt158;
						local167 = local123.anInt4760 >> Static13.anInt158;
						this.aClass7_Sub14_Sub2_3.method3994(0.0F);
						this.aClass7_Sub14_Sub2_3.method3994(0.0F);
						this.aClass7_Sub14_Sub2_3.method3994((float) -local167 * local44 + local150);
						this.aClass7_Sub14_Sub2_3.method3994(local156 + local48 * (float) -local167);
						this.aClass7_Sub14_Sub2_3.method3994(local52 * (float) -local167 + local162);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
						this.aClass7_Sub14_Sub2_3.method3994(1.0F);
						this.aClass7_Sub14_Sub2_3.method3994(0.0F);
						this.aClass7_Sub14_Sub2_3.method3994(local150 + (float) local167 * local56);
						this.aClass7_Sub14_Sub2_3.method3994(local156 + (float) local167 * local60);
						this.aClass7_Sub14_Sub2_3.method3994(local162 + local64 * (float) local167);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
						this.aClass7_Sub14_Sub2_3.method3994(1.0F);
						this.aClass7_Sub14_Sub2_3.method3994(1.0F);
						this.aClass7_Sub14_Sub2_3.method3994(local150 + (float) local167 * local44);
						this.aClass7_Sub14_Sub2_3.method3994((float) local167 * local48 + local156);
						this.aClass7_Sub14_Sub2_3.method3994((float) local167 * local52 + local162);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
						this.aClass7_Sub14_Sub2_3.method3994(0.0F);
						this.aClass7_Sub14_Sub2_3.method3994(1.0F);
						this.aClass7_Sub14_Sub2_3.method3994(local150 + local69 * (float) local167);
						this.aClass7_Sub14_Sub2_3.method3994((float) local167 * local74 + local156);
						this.aClass7_Sub14_Sub2_3.method3994(local162 + (float) local167 * local86);
						this.aClass7_Sub14_Sub2_3.method3970(local131);
						this.aClass7_Sub14_Sub2_3.method3970(local136);
						this.aClass7_Sub14_Sub2_3.method3970(local139);
						this.aClass7_Sub14_Sub2_3.method3970(local144);
					}
					if (this.anIntArray615[local93] > 64) {
						local428 = this.anIntArray615[local93] - 1 - 64;
						for (local126 = this.anIntArray616[local428] - 1; local126 >= 0; local126--) {
							local444 = this.aClass28_Sub1_Sub1ArrayArray1[local428][local126];
							local447 = local444.anInt4767;
							local139 = (byte) (local447 >> 16);
							local144 = (byte) (local447 >> 8);
							local460 = (byte) local447;
							local465 = (byte) (local447 >>> 24);
							local162 = local444.anInt4770 >> Static13.anInt158;
							local477 = local444.anInt4763 >> Static13.anInt158;
							local483 = local444.anInt4765 >> Static13.anInt158;
							local488 = local444.anInt4760 >> Static13.anInt158;
							this.aClass7_Sub14_Sub2_3.method3994(0.0F);
							this.aClass7_Sub14_Sub2_3.method3994(0.0F);
							this.aClass7_Sub14_Sub2_3.method3994(local162 + (float) -local488 * local44);
							this.aClass7_Sub14_Sub2_3.method3994((float) -local488 * local48 + local477);
							this.aClass7_Sub14_Sub2_3.method3994(local483 + local52 * (float) -local488);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
							this.aClass7_Sub14_Sub2_3.method3994(1.0F);
							this.aClass7_Sub14_Sub2_3.method3994(0.0F);
							this.aClass7_Sub14_Sub2_3.method3994(local56 * (float) local488 + local162);
							this.aClass7_Sub14_Sub2_3.method3994(local477 + (float) local488 * local60);
							this.aClass7_Sub14_Sub2_3.method3994(local483 + (float) local488 * local64);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
							this.aClass7_Sub14_Sub2_3.method3994(1.0F);
							this.aClass7_Sub14_Sub2_3.method3994(1.0F);
							this.aClass7_Sub14_Sub2_3.method3994(local162 + (float) local488 * local44);
							this.aClass7_Sub14_Sub2_3.method3994(local477 + local48 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3994(local52 * (float) local488 + local483);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
							this.aClass7_Sub14_Sub2_3.method3994(0.0F);
							this.aClass7_Sub14_Sub2_3.method3994(1.0F);
							this.aClass7_Sub14_Sub2_3.method3994((float) local488 * local69 + local162);
							this.aClass7_Sub14_Sub2_3.method3994((float) local488 * local74 + local477);
							this.aClass7_Sub14_Sub2_3.method3994(local483 + local86 * (float) local488);
							this.aClass7_Sub14_Sub2_3.method3970(local139);
							this.aClass7_Sub14_Sub2_3.method3970(local144);
							this.aClass7_Sub14_Sub2_3.method3970(local460);
							this.aClass7_Sub14_Sub2_3.method3970(local465);
						}
					}
				}
			}
		}
		if (this.aClass7_Sub14_Sub2_3.anInt4989 != 0) {
			this.anInterface8_7.method4988(this.aClass7_Sub14_Sub2_3.aByteArray75, this.aClass7_Sub14_Sub2_3.anInt4989, 24);
			arg1.method5415(this.aClass87_16, this.aClass87_14, null, this.aClass87_15);
			arg1.method5423(this.aClass7_Sub14_Sub2_3.anInt4989 / 24);
		}
	}
}
