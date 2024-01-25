import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class109_Sub2 extends Class109 {

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray29;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
	private int anInt6151;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	private int anInt6156;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "Lclient!dea;")
	public Class79 aClass79_5;

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "Lclient!dea;")
	private Class79 aClass79_6;

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
	private int anInt6163;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "Lclient!nk;")
	private Interface17 anInterface17_5;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
	private int anInt6164;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "Lclient!dea;")
	public Class79 aClass79_7;

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "[Lclient!vja;")
	private Class5_Sub54[] aClass5_Sub54Array1;

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "Lclient!dea;")
	public Class79 aClass79_8;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "Lclient!fca;")
	private final Class114 aClass114_42 = new Class114();

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lclient!ck;")
	public final Class65_Sub1 aClass65_Sub1_18;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	private final int anInt6144;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	public final int anInt6146;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray26;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray28;

	@OriginalMember(owner = "client!lc", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray30;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "[[S")
	public final short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	private final int anInt6145;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray27;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "[[B")
	private final byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "[[[Lclient!vja;")
	private Class5_Sub54[][][] aClass5_Sub54ArrayArrayArray1;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray31;

	@OriginalMember(owner = "client!lc", name = "gb", descriptor = "Lclient!rda;")
	private Class300 aClass300_25;

	@OriginalMember(owner = "client!lc", name = "x", descriptor = "Lclient!we;")
	private Class383 aClass383_2;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!ck;IIII[[I[[II)V")
	public Class109_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass65_Sub1_18 = arg0;
		this.anInt6144 = super.anInt9066 - 2;
		this.aFloatArrayArray7 = new float[super.anInt9061 + 1][super.anInt9065 + 1];
		this.anInt6146 = arg2;
		this.anIntArrayArrayArray26 = new int[arg3][arg4][];
		this.anIntArrayArrayArray28 = new int[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt9061 + 1][super.anInt9065 + 1];
		this.anIntArrayArrayArray30 = new int[arg3][arg4][];
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray8 = new short[arg3 * arg4][];
		this.aFloatArrayArray6 = new float[super.anInt9061 + 1][super.anInt9065 + 1];
		this.anInt6145 = 0x1 << this.anInt6144;
		this.anIntArrayArrayArray27 = new int[arg3][arg4][];
		this.aByteArrayArray17 = new byte[arg3][arg4];
		this.aClass5_Sub54ArrayArrayArray1 = new Class5_Sub54[arg3][arg4][];
		this.anIntArrayArrayArray31 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; super.anInt9065 > local115; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt9061; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + local138 * local138 + arg7 * 4 * arg7)));
				this.aFloatArrayArray8[local119][local115] = local175 * (float) local138;
				this.aFloatArrayArray7[local119][local115] = (float) (-arg7 * 2) * local175;
				this.aFloatArrayArray6[local119][local115] = (float) local155 * local175;
			}
		}
		this.aClass300_25 = new Class300(128);
		if ((this.anInt6146 & 0x10) != 0) {
			this.aClass383_2 = new Class383(this.aClass65_Sub1_18, this);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(47) int[] local47 = arg3 == null ? null : new int[local8 * 3];
		@Pc(56) int[] local56 = arg5 == null ? null : new int[local8 * 3];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(66) int local66 = arg6[local60];
			@Pc(70) int local70 = arg7[local60];
			@Pc(74) int local74 = arg8[local60];
			local13[local58] = arg2[local66];
			local18[local58] = arg4[local66];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local66];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local66];
			}
			local58++;
			local13[local58] = arg2[local70];
			local18[local58] = arg4[local70];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local70];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local70];
			}
			local58++;
			local13[local58] = arg2[local74];
			local18[local58] = arg4[local74];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.U(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7693(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass383_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass65_Sub1_18.anInt1403 * arg2 >> 8) >> this.aClass65_Sub1_18.anInt1381;
			@Pc(40) int local40 = arg3 - (this.aClass65_Sub1_18.anInt1421 * arg2 >> 8) >> this.aClass65_Sub1_18.anInt1381;
			return this.aClass383_2.method8797(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[[ZIIIIIZ)V")
	private void method5122(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass5_Sub54Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg3 + arg3 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > this.aClass65_Sub1_18.anIntArray67.length) {
			this.aClass65_Sub1_18.anIntArray67 = new int[local14];
		}
		if (this.anInt6156 * 2 > this.aClass65_Sub1_18.aClass5_Sub41_Sub1_2.aByteArray93.length) {
			this.aClass65_Sub1_18.aClass5_Sub41_Sub1_2 = new Class5_Sub41_Sub1(this.anInt6156 * 2);
		}
		@Pc(53) int local53 = arg2 - arg3;
		@Pc(55) int local55 = local53;
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(63) int local63 = arg5 - arg3;
		@Pc(65) int local65 = local63;
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(74) int local74 = arg2 + arg3;
		if (super.anInt9061 - 1 < local74) {
			local74 = super.anInt9061 - 1;
		}
		@Pc(93) int local93 = arg5 + arg3;
		if (super.anInt9065 - 1 < local93) {
			local93 = super.anInt9065 - 1;
		}
		@Pc(106) int local106 = 0;
		@Pc(110) int[] local110 = this.aClass65_Sub1_18.anIntArray67;
		@Pc(122) int local122;
		for (@Pc(112) int local112 = local53; local112 <= local74; local112++) {
			@Pc(120) boolean[] local120 = arg1[local112 - local55];
			for (local122 = local63; local122 <= local93; local122++) {
				if (local120[local122 - local65]) {
					local110[local106++] = local112 + local122 * super.anInt9061;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass65_Sub1_18.method1261();
		} else {
			this.aClass65_Sub1_18.method1279((float) arg0);
			this.aClass65_Sub1_18.method1220();
		}
		this.aClass65_Sub1_18.method1285((this.anInt6146 & 0x7) != 0);
		for (@Pc(191) int local191 = 0; local191 < this.aClass5_Sub54Array1.length; local191++) {
			this.aClass5_Sub54Array1[local191].method8569(local110, local106);
		}
		if (!this.aClass114_42.method2810()) {
			local122 = this.aClass65_Sub1_18.anInt1399;
			@Pc(224) int local224 = this.aClass65_Sub1_18.anInt1394;
			this.aClass65_Sub1_18.L(0, local224, this.aClass65_Sub1_18.anInt1414);
			this.aClass65_Sub1_18.method1285(false);
			this.aClass65_Sub1_18.method1297(false);
			this.aClass65_Sub1_18.method1231(128);
			this.aClass65_Sub1_18.method1246(-2);
			this.aClass65_Sub1_18.method1286(this.aClass65_Sub1_18.aClass80_Sub2_1);
			this.aClass65_Sub1_18.method1228(8448, 7681);
			this.aClass65_Sub1_18.method1265(0, 770, 34166);
			this.aClass65_Sub1_18.method1233(0, 34167);
			for (@Pc(286) Class5 local286 = this.aClass114_42.method2805(); local286 != null; local286 = this.aClass114_42.method2814()) {
				@Pc(291) Class5_Sub4 local291 = (Class5_Sub4) local286;
				local291.method229(arg3, arg1, arg5, arg2);
			}
			this.aClass65_Sub1_18.method1265(0, 768, 5890);
			this.aClass65_Sub1_18.method1233(0, 5890);
			this.aClass65_Sub1_18.method1286((Class80) null);
			this.aClass65_Sub1_18.L(local122, local224, this.aClass65_Sub1_18.anInt1414);
		}
		if (this.aClass383_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass65_Sub1_18.method1258(this.aClass79_5, this.aClass79_8, (Class79) null, (Class79) null);
		this.aClass383_2.method8796(arg6, arg2, arg1, arg3, arg5);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	@Override
	public void method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!gu;[I)V")
	@Override
	public void method7694(@OriginalArg(0) Class5_Sub18 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass114_42.method2807(new Class5_Sub4(this.aClass65_Sub1_18, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5122(-1, arg3, arg0, arg2, arg5, arg1, arg4);
	}

	@OriginalMember(owner = "client!lc", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6163 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9061 + 1][super.anInt9065 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; super.anInt9061 > local19; local19++) {
				for (local23 = 1; super.anInt9065 > local23; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray18[local19][local23] >> 1) + (this.aByteArrayArray18[local19][local23 + 1] >> 3) + (this.aByteArrayArray18[local19][local23 + -1] >> 2) + (this.aByteArrayArray18[local19 + 1][local23] >> 3) + (this.aByteArrayArray18[local19 + -1][local23] >> 2));
				}
			}
			this.aClass5_Sub54Array1 = new Class5_Sub54[this.aClass300_25.method7190()];
			this.aClass300_25.method7184(this.aClass5_Sub54Array1);
			for (local23 = 0; local23 < this.aClass5_Sub54Array1.length; local23++) {
				this.aClass5_Sub54Array1[local23].method8560(this.anInt6163);
			}
			@Pc(131) int local131 = 24;
			if (this.anIntArrayArrayArray29 != null) {
				local131 += 4;
			}
			if ((this.anInt6146 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(151) NativeHeapBuffer local151 = this.aClass65_Sub1_18.aNativeHeap1.a(local131 * this.anInt6163, false);
			@Pc(156) Stream local156 = new Stream(local151);
			@Pc(160) Class5_Sub54[] local160 = new Class5_Sub54[this.anInt6163];
			@Pc(167) int local167 = Static180.method2993(this.anInt6163 / 4);
			if (local167 < 1) {
				local167 = 1;
			}
			@Pc(177) Class300 local177 = new Class300(local167);
			@Pc(181) Class5_Sub54[] local181 = new Class5_Sub54[this.anInt6164];
			@Pc(187) int local187;
			for (@Pc(183) int local183 = 0; super.anInt9061 > local183; local183++) {
				for (local187 = 0; local187 < super.anInt9065; local187++) {
					if (this.anIntArrayArrayArray26[local183][local187] != null) {
						@Pc(203) Class5_Sub54[] local203 = this.aClass5_Sub54ArrayArrayArray1[local183][local187];
						@Pc(210) int[] local210 = this.anIntArrayArrayArray27[local183][local187];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray28[local183][local187];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray31[local183][local187];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray26[local183][local187];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray30 == null ? null : this.anIntArrayArrayArray30[local183][local187];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray29 == null ? null : this.anIntArrayArrayArray29[local183][local187];
						if (local224 == null) {
							local224 = local231;
						}
						@Pc(266) float local266 = this.aFloatArrayArray8[local183][local187];
						@Pc(273) float local273 = this.aFloatArrayArray7[local183][local187];
						@Pc(280) float local280 = this.aFloatArrayArray6[local183][local187];
						@Pc(289) float local289 = this.aFloatArrayArray8[local183][local187 + 1];
						@Pc(298) float local298 = this.aFloatArrayArray7[local183][local187 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray6[local183][local187 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray8[local183 + 1][local187 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray7[local183 + 1][local187 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray6[local183 + 1][local187 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray8[local183 + 1][local187];
						@Pc(358) float local358 = this.aFloatArrayArray7[local183 + 1][local187];
						@Pc(367) float local367 = this.aFloatArrayArray6[local183 + 1][local187];
						@Pc(375) int local375 = local17[local183][local187] & 0xFF;
						@Pc(385) int local385 = local17[local183][local187 + 1] & 0xFF;
						@Pc(397) int local397 = local17[local183 + 1][local187 + 1] & 0xFF;
						@Pc(407) int local407 = local17[local183 + 1][local187] & 0xFF;
						@Pc(409) int local409 = 0;
						@Pc(419) int local419;
						label337: for (@Pc(411) int local411 = 0; local411 < local231.length; local411++) {
							@Pc(417) Class5_Sub54 local417 = local203[local411];
							for (local419 = 0; local419 < local409; local419++) {
								if (local181[local419] == local417) {
									continue label337;
								}
							}
							local181[local409++] = local417;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray8[local187 * super.anInt9061 + local183] = new short[local231.length];
						for (local419 = 0; local419 < local231.length; local419++) {
							@Pc(473) int local473 = (local183 << super.anInt9066) + local210[local419];
							@Pc(483) int local483 = (local187 << super.anInt9066) + local217[local419];
							@Pc(488) int local488 = local473 >> this.anInt6144;
							@Pc(493) int local493 = local483 >> this.anInt6144;
							@Pc(497) int local497 = local231[local419];
							@Pc(501) int local501 = local224[local419];
							@Pc(509) int local509 = local243 == null ? 0 : local243[local419];
							@Pc(527) long local527 = (long) local493 | (long) (local488 << 16) | (long) local497 << 32 | (long) local501 << 48;
							@Pc(531) int local531 = local210[local419];
							@Pc(535) int local535 = local217[local419];
							@Pc(537) byte local537 = 74;
							@Pc(539) int local539 = 0;
							@Pc(541) float local541 = 1.0F;
							@Pc(547) float local547;
							@Pc(553) float local553;
							@Pc(555) float local555;
							@Pc(631) float local631;
							@Pc(551) int local551;
							if (local531 == 0 && local535 == 0) {
								local547 = local266;
								local551 = local537 - local375;
								local553 = local273;
								local555 = local280;
							} else if (local531 == 0 && super.anInt9063 == local535) {
								local555 = local307;
								local547 = local289;
								local553 = local298;
								local551 = local537 - local385;
							} else if (local531 == super.anInt9063 && local535 == super.anInt9063) {
								local553 = local329;
								local551 = local537 - local397;
								local547 = local318;
								local555 = local340;
							} else if (local531 == super.anInt9063 && local535 == 0) {
								local555 = local367;
								local551 = local537 - local407;
								local547 = local349;
								local553 = local358;
							} else {
								@Pc(608) float local608 = (float) local531 / (float) super.anInt9063;
								@Pc(615) float local615 = (float) local535 / (float) super.anInt9063;
								@Pc(623) float local623 = local266 + local608 * (local349 - local266);
								local631 = local608 * (local358 - local273) + local273;
								@Pc(640) float local640 = (local367 - local280) * local608 + local280;
								@Pc(649) float local649 = local289 + local608 * (local318 - local289);
								@Pc(658) float local658 = (local329 - local298) * local608 + local298;
								local547 = local623 + local615 * (local649 - local623);
								local553 = local631 + local615 * (local658 - local631);
								@Pc(683) float local683 = local307 + local608 * (local340 - local307);
								local555 = local640 + (local683 - local640) * local615;
								@Pc(704) int local704 = (local531 * (local407 - local375) >> super.anInt9066) + local375;
								@Pc(716) int local716 = ((local397 - local385) * local531 >> super.anInt9066) + local385;
								local551 = local537 - local704 - ((local716 - local704) * local535 >> super.anInt9066);
							}
							if (local497 != -1) {
								@Pc(766) int local766 = (local497 & 0x7F) * local551 >> 7;
								if (local766 < 2) {
									local766 = 2;
								} else if (local766 > 126) {
									local766 = 126;
								}
								if ((this.anInt6146 & 0x7) == 0) {
									local541 = this.aClass65_Sub1_18.aFloatArray5[0] * local547 + local553 * this.aClass65_Sub1_18.aFloatArray5[1] + local555 * this.aClass65_Sub1_18.aFloatArray5[2];
									local541 = this.aClass65_Sub1_18.aFloat13 + (local541 > 0.0F ? this.aClass65_Sub1_18.aFloat26 : this.aClass65_Sub1_18.aFloat28) * local541;
								}
								local539 = Static336.anIntArray357[local766 | local497 & 0xFF80];
							}
							@Pc(837) Class5 local837 = null;
							if ((this.anInt6145 - 1 & local473) == 0 && (local483 & this.anInt6145 - 1) == 0) {
								local837 = local177.method7188(local527);
							}
							@Pc(1201) int local1201;
							@Pc(866) int local866;
							if (local837 == null) {
								if (local497 == local501) {
									local866 = local539;
								} else {
									@Pc(876) int local876 = (local501 & 0x7F) * local551 >> 7;
									if (local876 < 2) {
										local876 = 2;
									} else if (local876 > 126) {
										local876 = 126;
									}
									local866 = Static336.anIntArray357[local876 | local501 & 0xFF80];
									if ((this.anInt6146 & 0x7) == 0) {
										local631 = local555 * this.aClass65_Sub1_18.aFloatArray5[2] + this.aClass65_Sub1_18.aFloatArray5[0] * local547 + local553 * this.aClass65_Sub1_18.aFloatArray5[1];
										local631 = this.aClass65_Sub1_18.aFloat13 + (local541 > 0.0F ? this.aClass65_Sub1_18.aFloat26 : this.aClass65_Sub1_18.aFloat28) * local541;
										@Pc(953) int local953 = local866 >> 16 & 0xFF;
										@Pc(959) int local959 = local866 >> 8 & 0xFF;
										local953 = (int) ((float) local953 * local631);
										@Pc(969) int local969 = local866 & 0xFF;
										local959 = (int) ((float) local959 * local631);
										if (local953 < 0) {
											local953 = 0;
										} else if (local953 > 255) {
											local953 = 255;
										}
										if (local959 < 0) {
											local959 = 0;
										} else if (local959 > 255) {
											local959 = 255;
										}
										local969 = (int) ((float) local969 * local631);
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local866 = local969 | local953 << 16 | local959 << 8;
									}
								}
								if (this.aClass65_Sub1_18.aBoolean97) {
									local156.a((float) local473);
									local156.a((float) (local509 + this.method7702(local473, local483)));
									local156.a((float) local483);
									local156.f((byte) (local866 >> 16));
									local156.f((byte) (local866 >> 8));
									local156.f((byte) local866);
									local156.f(-1);
									local156.a((float) local473);
									local156.a((float) local483);
									if (this.anIntArrayArrayArray29 != null) {
										local156.a((float) (local255 == null ? 0 : local255[local419] - 1));
									}
									if ((this.anInt6146 & 0x7) != 0) {
										local156.a(local547);
										local156.a(local553);
										local156.a(local555);
									}
								} else {
									local156.b((float) local473);
									local156.b((float) (this.method7702(local473, local483) + local509));
									local156.b((float) local483);
									local156.f((byte) (local866 >> 16));
									local156.f((byte) (local866 >> 8));
									local156.f((byte) local866);
									local156.f(-1);
									local156.b((float) local473);
									local156.b((float) local483);
									if (this.anIntArrayArrayArray29 != null) {
										local156.b((float) (local255 == null ? 0 : local255[local419] - 1));
									}
									if ((this.anInt6146 & 0x7) != 0) {
										local156.b(local547);
										local156.b(local553);
										local156.b(local555);
									}
								}
								local1201 = this.anInt6151++;
								local460[local419] = (short) local1201;
								if (local497 != -1) {
									local160[local1201] = local203[local419];
								}
								local177.method7191(new Class5_Sub37(local460[local419]), local527);
							} else {
								local460[local419] = ((Class5_Sub37) local837).aShort54;
								local1201 = local460[local419] & 0xFFFF;
								if (local497 != -1 && local203[local419].aLong307 < local160[local1201].aLong307) {
									local160[local1201] = local203[local419];
								}
							}
							for (local866 = 0; local866 < local409; local866++) {
								local181[local866].method8566(local1201, local551, local541, local539);
							}
							this.anInt6156++;
						}
					}
				}
			}
			for (local187 = 0; local187 < this.anInt6151; local187++) {
				@Pc(1322) Class5_Sub54 local1322 = local160[local187];
				if (local1322 != null) {
					local1322.method8564(local187);
				}
			}
			@Pc(1355) int local1355;
			for (@Pc(1335) int local1335 = 0; super.anInt9061 > local1335; local1335++) {
				for (@Pc(1339) int local1339 = 0; super.anInt9065 > local1339; local1339++) {
					@Pc(1351) short[] local1351 = this.aShortArrayArray8[local1335 + super.anInt9061 * local1339];
					if (local1351 != null) {
						local1355 = 0;
						@Pc(1357) int local1357 = 0;
						while (local1357 < local1351.length) {
							@Pc(1366) int local1366 = local1351[local1357++] & 0xFFFF;
							@Pc(1373) int local1373 = local1351[local1357++] & 0xFFFF;
							@Pc(1380) int local1380 = local1351[local1357++] & 0xFFFF;
							@Pc(1384) Class5_Sub54 local1384 = local160[local1366];
							@Pc(1388) Class5_Sub54 local1388 = local160[local1373];
							@Pc(1392) Class5_Sub54 local1392 = local160[local1380];
							@Pc(1394) Class5_Sub54 local1394 = null;
							if (local1384 != null) {
								local1394 = local1384;
								local1384.method8565(local1355, local1335, local1339);
							}
							if (local1388 != null) {
								local1388.method8565(local1355, local1335, local1339);
								if (local1394 == null || local1394.aLong307 > local1388.aLong307) {
									local1394 = local1388;
								}
							}
							if (local1392 != null) {
								local1392.method8565(local1355, local1335, local1339);
								if (local1394 == null || local1394.aLong307 > local1392.aLong307) {
									local1394 = local1392;
								}
							}
							if (local1394 != null) {
								if (local1384 != null) {
									local1394.method8564(local1366);
								}
								if (local1388 != null) {
									local1394.method8564(local1373);
								}
								if (local1392 != null) {
									local1394.method8564(local1380);
								}
								local1394.method8565(local1355, local1335, local1339);
							}
							local1355++;
						}
					}
				}
			}
			local156.a();
			this.anInterface17_5 = this.aClass65_Sub1_18.method1281(local131, local156.b(), local151);
			this.aClass79_5 = new Class79(this.anInterface17_5, 5126, 3, 0);
			this.aClass79_6 = new Class79(this.anInterface17_5, 5121, 4, 12);
			@Pc(1541) byte local1541;
			if (this.anIntArrayArrayArray29 == null) {
				this.aClass79_8 = new Class79(this.anInterface17_5, 5126, 2, 16);
				local1541 = 24;
			} else {
				local1541 = 28;
				this.aClass79_8 = new Class79(this.anInterface17_5, 5126, 3, 16);
			}
			if ((this.anInt6146 & 0x7) != 0) {
				this.aClass79_7 = new Class79(this.anInterface17_5, 5126, 3, local1541);
			}
			@Pc(1575) long[] local1575 = new long[this.aClass5_Sub54Array1.length];
			for (local1355 = 0; local1355 < this.aClass5_Sub54Array1.length; local1355++) {
				@Pc(1584) Class5_Sub54 local1584 = this.aClass5_Sub54Array1[local1355];
				local1575[local1355] = local1584.aLong307;
				local1584.method8567(this.anInt6151);
			}
			Static324.method8035(this.aClass5_Sub54Array1, local1575);
			if (this.aClass383_2 != null) {
				this.aClass383_2.method8795();
			}
		} else {
			this.aClass383_2 = null;
		}
		this.anIntArrayArrayArray31 = null;
		this.aClass5_Sub54ArrayArrayArray1 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
		this.anIntArrayArrayArray29 = null;
		this.aByteArrayArray18 = null;
		this.anIntArrayArrayArray26 = null;
		this.aClass300_25 = null;
		this.anIntArrayArrayArray30 = null;
		this.anIntArrayArrayArray27 = this.anIntArrayArrayArray28 = null;
	}

	@OriginalMember(owner = "client!lc", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass383_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass65_Sub1_18.anInt1403 >> 8) >> this.aClass65_Sub1_18.anInt1381;
			@Pc(39) int local39 = arg3 - (this.aClass65_Sub1_18.anInt1421 * arg2 >> 8) >> this.aClass65_Sub1_18.anInt1381;
			this.aClass383_2.method8798(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5122(arg5, arg3, arg0, arg2, arg6, arg1, arg4);
	}

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface4 local9 = this.aClass65_Sub1_18.anInterface4_11;
		if (arg3 != null && this.anIntArrayArrayArray30 == null) {
			this.anIntArrayArrayArray30 = new int[super.anInt9061][super.anInt9065][];
		}
		if (arg5 != null && this.anIntArrayArrayArray29 == null) {
			this.anIntArrayArrayArray29 = new int[super.anInt9061][super.anInt9065][];
		}
		this.anIntArrayArrayArray27[arg0][arg1] = arg2;
		this.anIntArrayArrayArray28[arg0][arg1] = arg4;
		this.anIntArrayArrayArray26[arg0][arg1] = arg6;
		this.anIntArrayArrayArray31[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray29 != null) {
			this.anIntArrayArrayArray29[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray30 != null) {
			this.anIntArrayArrayArray30[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub54[] local92 = this.aClass5_Sub54ArrayArrayArray1[arg0][arg1] = new Class5_Sub54[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt6146 & 0x20) != 0 && local100 != -1 && local9.method358(local100).aBoolean315) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(145) long local145 = (long) local100 | (long) (local104 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
			@Pc(151) Class5 local151;
			for (local151 = this.aClass300_25.method7188(local145); local151 != null; local151 = this.aClass300_25.method7187()) {
				@Pc(156) Class5_Sub54 local156 = (Class5_Sub54) local151;
				if (local156.anInt10341 == local100 && (float) local104 == local156.aFloat210 && local156.anInt10337 == arg10 && local156.anInt10339 == arg11 && arg12 == local156.anInt10345) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class5_Sub54(this, local100, local104, arg10, arg11, arg12);
				this.aClass300_25.method7191(local92[local94], local145);
			} else {
				local92[local94] = (Class5_Sub54) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray17[arg0][arg1] = (byte) (this.aByteArrayArray17[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6164) {
			this.anInt6164 = arg6.length;
		}
		this.anInt6163 += arg6.length;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7700(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6163 <= 0) {
			return;
		}
		this.aClass65_Sub1_18.method1238();
		this.aClass65_Sub1_18.method1234(false);
		this.aClass65_Sub1_18.method1285(false);
		this.aClass65_Sub1_18.method1289(false);
		this.aClass65_Sub1_18.method1297(false);
		this.aClass65_Sub1_18.method1231(0);
		this.aClass65_Sub1_18.method1246(-2);
		this.aClass65_Sub1_18.method1286((Class80) null);
		Static406.aFloatArray67[9] = 0.0F;
		Static406.aFloatArray67[14] = 0.0F;
		Static406.aFloatArray67[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass65_Sub1_18.anInt1240;
		Static406.aFloatArray67[4] = 0.0F;
		Static406.aFloatArray67[15] = 1.0F;
		Static406.aFloatArray67[8] = 0.0F;
		Static406.aFloatArray67[3] = 0.0F;
		Static406.aFloatArray67[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass65_Sub1_18.anInt1374;
		Static406.aFloatArray67[10] = 0.0F;
		Static406.aFloatArray67[5] = (float) 1024 / ((float) super.anInt9063 * 128.0F * (float) this.aClass65_Sub1_18.anInt1374);
		Static406.aFloatArray67[11] = 0.0F;
		Static406.aFloatArray67[0] = (float) 1024 / ((float) super.anInt9063 * 128.0F * (float) this.aClass65_Sub1_18.anInt1240);
		Static406.aFloatArray67[7] = 0.0F;
		Static406.aFloatArray67[1] = 0.0F;
		Static406.aFloatArray67[6] = 0.0F;
		Static406.aFloatArray67[2] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static406.aFloatArray67, 0);
		Static406.aFloatArray67[11] = 0.0F;
		Static406.aFloatArray67[0] = 1.0F;
		Static406.aFloatArray67[12] = 0.0F;
		Static406.aFloatArray67[14] = 0.0F;
		Static406.aFloatArray67[4] = 0.0F;
		Static406.aFloatArray67[5] = 0.0F;
		Static406.aFloatArray67[2] = 0.0F;
		Static406.aFloatArray67[8] = 0.0F;
		Static406.aFloatArray67[13] = 0.0F;
		Static406.aFloatArray67[6] = 1.0F;
		Static406.aFloatArray67[15] = 1.0F;
		Static406.aFloatArray67[9] = 1.0F;
		Static406.aFloatArray67[1] = 0.0F;
		Static406.aFloatArray67[3] = 0.0F;
		Static406.aFloatArray67[7] = 0.0F;
		Static406.aFloatArray67[10] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static406.aFloatArray67, 0);
		if ((this.anInt6146 & 0x7) == 0) {
			this.aClass65_Sub1_18.method1285(false);
		} else {
			this.aClass65_Sub1_18.method1285(true);
			this.aClass65_Sub1_18.method1240();
		}
		this.aClass65_Sub1_18.method1258(this.aClass79_5, this.aClass79_8, this.aClass79_6, this.aClass79_7);
		if (this.aClass65_Sub1_18.aClass5_Sub41_Sub1_2.aByteArray93.length >= this.anInt6156 * 2) {
			this.aClass65_Sub1_18.aClass5_Sub41_Sub1_2.anInt9230 = 0;
		} else {
			this.aClass65_Sub1_18.aClass5_Sub41_Sub1_2 = new Class5_Sub41_Sub1(this.anInt6156 * 2);
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class5_Sub41_Sub1 local317 = this.aClass65_Sub1_18.aClass5_Sub41_Sub1_2;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass65_Sub1_18.aBoolean97) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = super.anInt9061 * local323 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray8[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local313++;
								local317.method7848(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = super.anInt9061 * local323 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray8[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local313++;
								local317.method7821(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(471) Class274_Sub2 local471 = new Class274_Sub2(this.aClass65_Sub1_18, 5123, local317.aByteArray93, local317.anInt9230);
			this.aClass65_Sub1_18.method1291(local471, local313, 0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub3_Sub7 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub3_Sub7 arg2) {
		if ((this.aByteArrayArray17[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9063 >> this.aClass65_Sub1_18.anInt1381;
		@Pc(27) Class5_Sub3_Sub7_Sub2 local27 = (Class5_Sub3_Sub7_Sub2) arg2;
		@Pc(43) Class5_Sub3_Sub7_Sub2 local43;
		if (local27 != null && local27.method6130(local24, local24)) {
			local43 = local27;
			local27.method6126();
		} else {
			local43 = new Class5_Sub3_Sub7_Sub2(this.aClass65_Sub1_18, local24, local24);
		}
		local43.method6127(0, 0, local24, local24);
		this.method5124(arg1, arg0, local43);
		return local43;
	}

	@OriginalMember(owner = "client!lc", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass383_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass65_Sub1_18.anInt1403 * arg2 >> 8) >> this.aClass65_Sub1_18.anInt1381;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass65_Sub1_18.anInt1421 >> 8) >> this.aClass65_Sub1_18.anInt1381;
			this.aClass383_2.method8793(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZLclient!oaa;)V")
	private void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub3_Sub7_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray27[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray28[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (this.aClass65_Sub1_18.anIntArray69.length < local22) {
			this.aClass65_Sub1_18.anIntArray68 = new int[local22];
			this.aClass65_Sub1_18.anIntArray69 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass65_Sub1_18.anIntArray69;
		@Pc(46) int[] local46 = this.aClass65_Sub1_18.anIntArray68;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass65_Sub1_18.anInt1381;
			local46[local48] = local19[local48] >> this.aClass65_Sub1_18.anInt1381;
		}
		@Pc(86) int local86 = 0;
		while (local22 > local86) {
			@Pc(92) int local92 = local42[local86];
			@Pc(97) int local97 = local46[local86++];
			@Pc(101) int local101 = local42[local86];
			@Pc(106) int local106 = local46[local86++];
			@Pc(110) int local110 = local42[local86];
			@Pc(115) int local115 = local46[local86++];
			if (-((local110 - local101) * (local106 - local97)) + (local106 - local115) * (local92 - local101) > 0) {
				arg2.method6131(local97, local92, local115, local106, local110, local101);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray18[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray18[arg0][arg1] = (byte) arg2;
		}
	}
}
