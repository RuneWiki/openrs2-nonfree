import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class215_Sub2 extends Class215 {

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
	private int anInt7589;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	private int anInt7600;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "[Lclient!nda;")
	private Class12_Sub38[] aClass12_Sub38Array1;

	@OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
	private int anInt7607;

	@OriginalMember(owner = "client!ql", name = "W", descriptor = "Lclient!dd;")
	public Class65 aClass65_7;

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "Lclient!qd;")
	private Interface14 anInterface14_5;

	@OriginalMember(owner = "client!ql", name = "Z", descriptor = "Lclient!dd;")
	public Class65 aClass65_8;

	@OriginalMember(owner = "client!ql", name = "cb", descriptor = "Lclient!dd;")
	private Class65 aClass65_9;

	@OriginalMember(owner = "client!ql", name = "db", descriptor = "Lclient!dd;")
	public Class65 aClass65_10;

	@OriginalMember(owner = "client!ql", name = "eb", descriptor = "I")
	private int anInt7608;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Lclient!dm;")
	private final Class73 aClass73_65 = new Class73();

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "[[I")
	private final int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
	private final int anInt7605;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "Lclient!gi;")
	public final Class42_Sub3 aClass42_Sub3_31;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
	private final int anInt7595;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ql", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	public final int anInt7590;

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "[[B")
	private final byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "[[[Lclient!nda;")
	private Class12_Sub38[][][] aClass12_Sub38ArrayArrayArray1;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ql", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ql", name = "ab", descriptor = "Lclient!dea;")
	private Class68 aClass68_58;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!wh;")
	private Class315 aClass315_2;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!gi;IIII[[I[[II)V")
	public Class215_Sub2(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray70 = arg5;
		this.anInt7605 = super.anInt9453 - 2;
		this.aClass42_Sub3_31 = arg0;
		this.aShortArrayArray7 = new short[arg4 * arg3][];
		this.anInt7595 = 0x1 << this.anInt7605;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt9452 + 1][super.anInt9450 + 1];
		this.aFloatArrayArray6 = new float[super.anInt9452 + 1][super.anInt9450 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt7590 = arg2;
		this.aByteArrayArray24 = new byte[arg3 + 1][arg4 + 1];
		this.aByteArrayArray23 = new byte[arg3][arg4];
		this.aClass12_Sub38ArrayArrayArray1 = new Class12_Sub38[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt9452 + 1][super.anInt9450 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt9450 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt9452 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + local140 * local140 + arg7 * 4 * arg7)));
				this.aFloatArrayArray7[local121][local117] = (float) local140 * local177;
				this.aFloatArrayArray8[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray6[local121][local117] = (float) local157 * local177;
			}
		}
		this.aClass68_58 = new Class68(128);
		if ((this.anInt7590 & 0x10) != 0) {
			this.aClass315_2 = new Class315(this.aClass42_Sub3_31, this);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII[[ZIZ)V")
	private void method6335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean[][] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass12_Sub38Array1 == null) {
			return;
		}
		@Pc(14) float local14 = this.aClass42_Sub3_31.aFloat87;
		@Pc(18) float local18 = this.aClass42_Sub3_31.aFloat101;
		@Pc(24) int local24 = arg3 + arg3 + 1;
		@Pc(28) int local28 = local24 * local24;
		if (this.aClass42_Sub3_31.anIntArray295.length < local28) {
			this.aClass42_Sub3_31.anIntArray295 = new int[local28];
		}
		if (this.aClass42_Sub3_31.aClass12_Sub8_Sub1_1.aByteArray82.length < this.anInt7589 * 2) {
			this.aClass42_Sub3_31.aClass12_Sub8_Sub1_1 = new Class12_Sub8_Sub1(this.anInt7589 * 2);
		}
		@Pc(72) int local72 = arg1 - arg3;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(85) int local85 = arg0 - arg3;
		@Pc(87) int local87 = local85;
		if (local85 < 0) {
			local85 = 0;
		}
		@Pc(99) int local99 = arg1 + arg3;
		if (local99 > super.anInt9452 - 1) {
			local99 = super.anInt9452 - 1;
		}
		@Pc(118) int local118 = arg3 + arg0;
		if (local118 > super.anInt9450 - 1) {
			local118 = super.anInt9450 - 1;
		}
		@Pc(135) int local135 = 0;
		@Pc(139) int[] local139 = this.aClass42_Sub3_31.anIntArray295;
		@Pc(152) int local152;
		for (@Pc(141) int local141 = local72; local141 <= local99; local141++) {
			@Pc(150) boolean[] local150 = arg2[local141 - local74];
			for (local152 = local85; local152 <= local118; local152++) {
				if (local150[local152 - local87]) {
					local139[local135++] = local141 + super.anInt9452 * local152;
				}
			}
		}
		this.aClass42_Sub3_31.method3190();
		this.aClass42_Sub3_31.method3191((this.anInt7590 & 0x7) != 0);
		for (@Pc(225) int local225 = 0; local225 < this.aClass12_Sub38Array1.length; local225++) {
			this.aClass12_Sub38Array1[local225].method5092(local139, local135);
		}
		if (!this.aClass73_65.method2015()) {
			local152 = this.aClass42_Sub3_31.anInt3716;
			@Pc(256) int local256 = this.aClass42_Sub3_31.anInt3704;
			this.aClass42_Sub3_31.E(0, local256, this.aClass42_Sub3_31.anInt3711);
			this.aClass42_Sub3_31.la(local18, local14 - 4.0F);
			this.aClass42_Sub3_31.method3191(false);
			this.aClass42_Sub3_31.method3192(false);
			this.aClass42_Sub3_31.method3209(128);
			this.aClass42_Sub3_31.method3269(-2);
			this.aClass42_Sub3_31.method3219(this.aClass42_Sub3_31.aClass79_Sub2_2);
			this.aClass42_Sub3_31.method3250(8448, 7681);
			this.aClass42_Sub3_31.method3268(0, 770, 34166);
			this.aClass42_Sub3_31.method3201(0, 34167);
			for (@Pc(325) Class12 local325 = this.aClass73_65.method2005(); local325 != null; local325 = this.aClass73_65.method2009()) {
				@Pc(330) Class12_Sub49 local330 = (Class12_Sub49) local325;
				local330.method7506(arg2, arg0, arg1, arg3);
			}
			this.aClass42_Sub3_31.method3268(0, 768, 5890);
			this.aClass42_Sub3_31.method3201(0, 5890);
			this.aClass42_Sub3_31.method3219(null);
			this.aClass42_Sub3_31.E(local152, local256, this.aClass42_Sub3_31.anInt3711);
		}
		if (this.aClass315_2 != null) {
			this.aClass42_Sub3_31.la(local18, local14 - 8.0F);
			this.aClass42_Sub3_31.method3190();
			this.aClass42_Sub3_31.method3241(null, null, this.aClass65_10, this.aClass65_7);
			this.aClass315_2.method7891(arg3, arg2, arg1, arg4, arg0);
		}
		this.aClass42_Sub3_31.la(local18, local14);
	}

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt7608 <= 0) {
			this.aClass315_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt9452 + 1][super.anInt9450 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; super.anInt9452 > local24; local24++) {
				for (local28 = 1; local28 < super.anInt9450; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray24[local24][local28] >> 1) + (this.aByteArrayArray24[local24][local28 - 1] >> 2) + (this.aByteArrayArray24[local24 + 1][local28] >> 3) + (this.aByteArrayArray24[local24 + -1][local28] >> 2) + (this.aByteArrayArray24[local24][local28 + 1] >> 3));
				}
			}
			this.aClass12_Sub38Array1 = new Class12_Sub38[this.aClass68_58.method1925()];
			this.aClass68_58.method1921(this.aClass12_Sub38Array1);
			for (local28 = 0; local28 < this.aClass12_Sub38Array1.length; local28++) {
				this.aClass12_Sub38Array1[local28].method5090(this.anInt7608);
			}
			@Pc(144) int local144 = 24;
			if (this.anIntArrayArrayArray8 != null) {
				local144 += 4;
			}
			if ((this.anInt7590 & 0x7) != 0) {
				local144 += 12;
			}
			@Pc(164) NativeHeapBuffer local164 = this.aClass42_Sub3_31.aNativeHeap3.a(local144 * this.anInt7608, false);
			@Pc(169) Stream local169 = new Stream(local164);
			@Pc(173) Class12_Sub38[] local173 = new Class12_Sub38[this.anInt7608];
			@Pc(180) int local180 = Static472.method7121(this.anInt7608 / 4);
			if (local180 < 1) {
				local180 = 1;
			}
			@Pc(192) Class68 local192 = new Class68(local180);
			@Pc(196) Class12_Sub38[] local196 = new Class12_Sub38[this.anInt7607];
			@Pc(202) int local202;
			for (@Pc(198) int local198 = 0; local198 < super.anInt9452; local198++) {
				for (local202 = 0; super.anInt9450 > local202; local202++) {
					if (this.anIntArrayArrayArray13[local198][local202] != null) {
						@Pc(218) Class12_Sub38[] local218 = this.aClass12_Sub38ArrayArrayArray1[local198][local202];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray10[local198][local202];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray12[local198][local202];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray9[local198][local202];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray13[local198][local202];
						@Pc(258) int[] local258 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local198][local202];
						if (local239 == null) {
							local239 = local246;
						}
						@Pc(274) int[] local274 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local198][local202];
						@Pc(281) float local281 = this.aFloatArrayArray7[local198][local202];
						@Pc(288) float local288 = this.aFloatArrayArray8[local198][local202];
						@Pc(295) float local295 = this.aFloatArrayArray6[local198][local202];
						@Pc(304) float local304 = this.aFloatArrayArray7[local198][local202 + 1];
						@Pc(313) float local313 = this.aFloatArrayArray8[local198][local202 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray6[local198][local202 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray7[local198 + 1][local202 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray8[local198 + 1][local202 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray6[local198 + 1][local202 + 1];
						@Pc(364) float local364 = this.aFloatArrayArray7[local198 + 1][local202];
						@Pc(373) float local373 = this.aFloatArrayArray8[local198 + 1][local202];
						@Pc(382) float local382 = this.aFloatArrayArray6[local198 + 1][local202];
						@Pc(390) int local390 = local22[local198][local202] & 0xFF;
						@Pc(400) int local400 = local22[local198][local202 + 1] & 0xFF;
						@Pc(412) int local412 = local22[local198 + 1][local202 + 1] & 0xFF;
						@Pc(422) int local422 = local22[local198 + 1][local202] & 0xFF;
						@Pc(424) int local424 = 0;
						@Pc(434) int local434;
						label337: for (@Pc(426) int local426 = 0; local426 < local246.length; local426++) {
							@Pc(432) Class12_Sub38 local432 = local218[local426];
							for (local434 = 0; local434 < local424; local434++) {
								if (local196[local434] == local432) {
									continue label337;
								}
							}
							local196[local424++] = local432;
						}
						@Pc(475) short[] local475 = this.aShortArrayArray7[local198 + local202 * super.anInt9452] = new short[local246.length];
						for (local434 = 0; local434 < local246.length; local434++) {
							@Pc(488) int local488 = (local198 << super.anInt9453) + local225[local434];
							@Pc(498) int local498 = (local202 << super.anInt9453) + local232[local434];
							@Pc(503) int local503 = local488 >> this.anInt7605;
							@Pc(508) int local508 = local498 >> this.anInt7605;
							@Pc(512) int local512 = local246[local434];
							@Pc(516) int local516 = local239[local434];
							@Pc(524) int local524 = local258 == null ? 0 : local258[local434];
							@Pc(542) long local542 = (long) local512 << 32 | (long) local516 << 48 | (long) (local503 << 16) | (long) local508;
							@Pc(546) int local546 = local225[local434];
							@Pc(550) int local550 = local232[local434];
							@Pc(552) byte local552 = 74;
							@Pc(554) int local554 = 0;
							@Pc(567) float local567;
							@Pc(569) float local569;
							@Pc(571) float local571;
							@Pc(639) float local639;
							@Pc(565) int local565;
							if (local546 == 0 && local550 == 0) {
								local565 = local552 - local390;
								local567 = local281;
								local569 = local288;
								local571 = local295;
							} else if (local546 == 0 && super.anInt9451 == local550) {
								local567 = local304;
								local569 = local313;
								local571 = local322;
								local565 = local552 - local400;
							} else if (super.anInt9451 == local546 && local550 == super.anInt9451) {
								local571 = local355;
								local565 = local552 - local412;
								local569 = local344;
								local567 = local333;
							} else if (super.anInt9451 == local546 && local550 == 0) {
								local571 = local382;
								local569 = local373;
								local565 = local552 - local422;
								local567 = local364;
							} else {
								@Pc(615) float local615 = (float) local546 / (float) super.anInt9451;
								@Pc(622) float local622 = (float) local550 / (float) super.anInt9451;
								@Pc(631) float local631 = (local364 - local281) * local615 + local281;
								local639 = local288 + local615 * (local373 - local288);
								@Pc(647) float local647 = local295 + (local382 - local295) * local615;
								@Pc(656) float local656 = local304 + (local333 - local304) * local615;
								@Pc(664) float local664 = local313 + local615 * (local344 - local313);
								@Pc(672) float local672 = local615 * (local355 - local322) + local322;
								local569 = local639 + (local664 - local639) * local622;
								local567 = local622 * (local656 - local631) + local631;
								local571 = local647 + local622 * (local672 - local647);
								@Pc(707) int local707 = ((local422 - local390) * local546 >> super.anInt9453) + local390;
								@Pc(719) int local719 = local400 + ((local412 - local400) * local546 >> super.anInt9453);
								local565 = local552 - (local550 * (local719 - local707) >> super.anInt9453) - local707;
							}
							@Pc(771) float local771 = 1.0F;
							if (local512 != -1) {
								@Pc(783) int local783 = (local512 & 0x7F) * local565 >> 7;
								if (local783 < 2) {
									local783 = 2;
								} else if (local783 > 126) {
									local783 = 126;
								}
								if ((this.anInt7590 & 0x7) == 0) {
									local771 = this.aClass42_Sub3_31.aFloatArray33[0] * local567 + this.aClass42_Sub3_31.aFloatArray33[1] * local569 + local571 * this.aClass42_Sub3_31.aFloatArray33[2];
									local771 = this.aClass42_Sub3_31.aFloat85 + local771 * (local771 > 0.0F ? this.aClass42_Sub3_31.aFloat100 : this.aClass42_Sub3_31.aFloat88);
								}
								local554 = Static141.anIntArray234[local512 & 0xFF80 | local783];
							}
							@Pc(852) Class12 local852 = null;
							if ((local488 & this.anInt7595 - 1) == 0 && (this.anInt7595 - 1 & local498) == 0) {
								local852 = local192.method1917(local542);
							}
							@Pc(888) int local888;
							@Pc(919) int local919;
							if (local852 == null) {
								if (local512 == local516) {
									local919 = local554;
								} else {
									@Pc(929) int local929 = (local516 & 0x7F) * local565 >> 7;
									if (local929 < 2) {
										local929 = 2;
									} else if (local929 > 126) {
										local929 = 126;
									}
									local919 = Static141.anIntArray234[local929 | local516 & 0xFF80];
									if ((this.anInt7590 & 0x7) == 0) {
										@Pc(982) float local982 = local567 * this.aClass42_Sub3_31.aFloatArray33[0] + this.aClass42_Sub3_31.aFloatArray33[1] * local569 + this.aClass42_Sub3_31.aFloatArray33[2] * local571;
										local639 = this.aClass42_Sub3_31.aFloat85 + local771 * (local771 > 0.0F ? this.aClass42_Sub3_31.aFloat100 : this.aClass42_Sub3_31.aFloat88);
										@Pc(1007) int local1007 = local919 >> 16 & 0xFF;
										@Pc(1013) int local1013 = local919 >> 8 & 0xFF;
										local1007 = (int) ((float) local1007 * local639);
										@Pc(1023) int local1023 = local919 & 0xFF;
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local1013 = (int) ((float) local1013 * local639);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										local1023 = (int) ((float) local1023 * local639);
										if (local1023 < 0) {
											local1023 = 0;
										} else if (local1023 > 255) {
											local1023 = 255;
										}
										local919 = local1007 << 16 | local1013 << 8 | local1023;
									}
								}
								if (this.aClass42_Sub3_31.aBoolean292) {
									local169.a((float) local488);
									local169.a((float) (this.aa(local488, local498) + local524));
									local169.a((float) local498);
									local169.c((byte) (local919 >> 16));
									local169.c((byte) (local919 >> 8));
									local169.c((byte) local919);
									local169.c(-1);
									local169.a((float) local488);
									local169.a((float) local498);
									if (this.anIntArrayArrayArray8 != null) {
										local169.a((float) (local274 == null ? 0 : local274[local434] - 1));
									}
									if ((this.anInt7590 & 0x7) != 0) {
										local169.a(local567);
										local169.a(local569);
										local169.a(local571);
									}
								} else {
									local169.b((float) local488);
									local169.b((float) (this.aa(local488, local498) + local524));
									local169.b((float) local498);
									local169.c((byte) (local919 >> 16));
									local169.c((byte) (local919 >> 8));
									local169.c((byte) local919);
									local169.c(-1);
									local169.b((float) local488);
									local169.b((float) local498);
									if (this.anIntArrayArrayArray8 != null) {
										local169.b((float) (local274 == null ? 0 : local274[local434] - 1));
									}
									if ((this.anInt7590 & 0x7) != 0) {
										local169.b(local567);
										local169.b(local569);
										local169.b(local571);
									}
								}
								local888 = this.anInt7600++;
								local475[local434] = (short) local888;
								if (local512 != -1) {
									local173[local888] = local218[local434];
								}
								local192.method1916(new Class12_Sub31(local475[local434]), local542);
							} else {
								local475[local434] = ((Class12_Sub31) local852).aShort68;
								local888 = local475[local434] & 0xFFFF;
								if (local512 != -1 && local173[local888].aLong248 > local218[local434].aLong248) {
									local173[local888] = local218[local434];
								}
							}
							for (local919 = 0; local919 < local424; local919++) {
								local196[local919].method5095(local554, local888, local565, local771);
							}
							this.anInt7589++;
						}
					}
				}
			}
			for (local202 = 0; local202 < this.anInt7600; local202++) {
				@Pc(1326) Class12_Sub38 local1326 = local173[local202];
				if (local1326 != null) {
					local1326.method5089(local202);
				}
			}
			@Pc(1364) int local1364;
			for (@Pc(1343) int local1343 = 0; local1343 < super.anInt9452; local1343++) {
				for (@Pc(1347) int local1347 = 0; super.anInt9450 > local1347; local1347++) {
					@Pc(1360) short[] local1360 = this.aShortArrayArray7[local1347 * super.anInt9452 + local1343];
					if (local1360 != null) {
						local1364 = 0;
						@Pc(1366) int local1366 = 0;
						while (local1366 < local1360.length) {
							@Pc(1375) int local1375 = local1360[local1366++] & 0xFFFF;
							@Pc(1382) int local1382 = local1360[local1366++] & 0xFFFF;
							@Pc(1389) int local1389 = local1360[local1366++] & 0xFFFF;
							@Pc(1393) Class12_Sub38 local1393 = local173[local1375];
							@Pc(1397) Class12_Sub38 local1397 = local173[local1382];
							@Pc(1401) Class12_Sub38 local1401 = local173[local1389];
							@Pc(1403) Class12_Sub38 local1403 = null;
							if (local1393 != null) {
								local1403 = local1393;
								local1393.method5091(local1347, local1364, local1343);
							}
							if (local1397 != null) {
								local1397.method5091(local1347, local1364, local1343);
								if (local1403 == null || local1397.aLong248 < local1403.aLong248) {
									local1403 = local1397;
								}
							}
							if (local1401 != null) {
								local1401.method5091(local1347, local1364, local1343);
								if (local1403 == null || local1401.aLong248 < local1403.aLong248) {
									local1403 = local1401;
								}
							}
							if (local1403 != null) {
								if (local1393 != null) {
									local1403.method5089(local1375);
								}
								if (local1397 != null) {
									local1403.method5089(local1382);
								}
								if (local1401 != null) {
									local1403.method5089(local1389);
								}
								local1403.method5091(local1347, local1364, local1343);
							}
							local1364++;
						}
					}
				}
			}
			local169.a();
			this.anInterface14_5 = this.aClass42_Sub3_31.method3244(local144, local169.b(), local164);
			this.aClass65_10 = new Class65(this.anInterface14_5, 5126, 3, 0);
			this.aClass65_9 = new Class65(this.anInterface14_5, 5121, 4, 12);
			@Pc(1548) byte local1548;
			if (this.anIntArrayArrayArray8 == null) {
				local1548 = 24;
				this.aClass65_7 = new Class65(this.anInterface14_5, 5126, 2, 16);
			} else {
				local1548 = 28;
				this.aClass65_7 = new Class65(this.anInterface14_5, 5126, 3, 16);
			}
			if ((this.anInt7590 & 0x7) != 0) {
				this.aClass65_8 = new Class65(this.anInterface14_5, 5126, 3, local1548);
			}
			@Pc(1592) long[] local1592 = new long[this.aClass12_Sub38Array1.length];
			for (local1364 = 0; local1364 < this.aClass12_Sub38Array1.length; local1364++) {
				@Pc(1601) Class12_Sub38 local1601 = this.aClass12_Sub38Array1[local1364];
				local1592[local1364] = local1601.aLong248;
				local1601.method5094(this.anInt7600);
			}
			Static308.method4985(this.aClass12_Sub38Array1, local1592);
			if (this.aClass315_2 != null) {
				this.aClass315_2.method7893();
			}
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass12_Sub38ArrayArrayArray1 = null;
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray12 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray8 = this.aFloatArrayArray6 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass68_58 = null;
		this.anIntArrayArrayArray13 = null;
		this.aByteArrayArray24 = null;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method7839(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass315_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass42_Sub3_31.anInt3693 * arg2 >> 8) >> this.aClass42_Sub3_31.anInt3672;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass42_Sub3_31.anInt3683 >> 8) >> this.aClass42_Sub3_31.anInt3672;
			return this.aClass315_2.method7889(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7836(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7608 <= 0) {
			return;
		}
		this.aClass42_Sub3_31.method3238();
		this.aClass42_Sub3_31.method3263(false);
		this.aClass42_Sub3_31.method3191(false);
		this.aClass42_Sub3_31.method3236(false);
		this.aClass42_Sub3_31.method3192(false);
		this.aClass42_Sub3_31.method3209(0);
		this.aClass42_Sub3_31.method3269(-2);
		this.aClass42_Sub3_31.method3219(null);
		Static341.aFloatArray51[14] = 0.0F;
		Static341.aFloatArray51[15] = 1.0F;
		Static341.aFloatArray51[4] = 0.0F;
		Static341.aFloatArray51[5] = (float) 1024 / ((float) super.anInt9451 * 128.0F * (float) this.aClass42_Sub3_31.anInt3515);
		Static341.aFloatArray51[9] = 0.0F;
		Static341.aFloatArray51[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass42_Sub3_31.anInt3515;
		Static341.aFloatArray51[8] = 0.0F;
		Static341.aFloatArray51[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass42_Sub3_31.anInt3666;
		Static341.aFloatArray51[1] = 0.0F;
		Static341.aFloatArray51[10] = 0.0F;
		Static341.aFloatArray51[11] = 0.0F;
		Static341.aFloatArray51[7] = 0.0F;
		Static341.aFloatArray51[6] = 0.0F;
		Static341.aFloatArray51[0] = (float) 1024 / ((float) super.anInt9451 * 128.0F * (float) this.aClass42_Sub3_31.anInt3666);
		Static341.aFloatArray51[2] = 0.0F;
		Static341.aFloatArray51[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static341.aFloatArray51, 0);
		Static341.aFloatArray51[7] = 0.0F;
		Static341.aFloatArray51[1] = 0.0F;
		Static341.aFloatArray51[14] = 0.0F;
		Static341.aFloatArray51[3] = 0.0F;
		Static341.aFloatArray51[15] = 1.0F;
		Static341.aFloatArray51[10] = 0.0F;
		Static341.aFloatArray51[6] = 1.0F;
		Static341.aFloatArray51[12] = 0.0F;
		Static341.aFloatArray51[9] = 1.0F;
		Static341.aFloatArray51[8] = 0.0F;
		Static341.aFloatArray51[13] = 0.0F;
		Static341.aFloatArray51[4] = 0.0F;
		Static341.aFloatArray51[11] = 0.0F;
		Static341.aFloatArray51[0] = 1.0F;
		Static341.aFloatArray51[5] = 0.0F;
		Static341.aFloatArray51[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static341.aFloatArray51, 0);
		if ((this.anInt7590 & 0x7) == 0) {
			this.aClass42_Sub3_31.method3191(false);
		} else {
			this.aClass42_Sub3_31.method3191(true);
			this.aClass42_Sub3_31.method3235();
		}
		this.aClass42_Sub3_31.method3241(this.aClass65_9, this.aClass65_8, this.aClass65_10, this.aClass65_7);
		if (this.aClass42_Sub3_31.aClass12_Sub8_Sub1_1.aByteArray82.length >= this.anInt7589 * 2) {
			this.aClass42_Sub3_31.aClass12_Sub8_Sub1_1.anInt6217 = 0;
		} else {
			this.aClass42_Sub3_31.aClass12_Sub8_Sub1_1 = new Class12_Sub8_Sub1(this.anInt7589 * 2);
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class12_Sub8_Sub1 local318 = this.aClass42_Sub3_31.aClass12_Sub8_Sub1_1;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass42_Sub3_31.aBoolean292) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = super.anInt9452 * local324 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray7[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local314++;
								local318.method5190(local353[local357] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = super.anInt9452 * local324 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray7[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local314++;
								local318.method5201(local353[local357] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(473) Class168_Sub2 local473 = new Class168_Sub2(this.aClass42_Sub3_31, 5123, local318.aByteArray82, local318.anInt6217);
			this.aClass42_Sub3_31.method3227(local473, local314, 0);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!rh;[I)V")
	@Override
	public void method7834(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass73_65.method2012(new Class12_Sub49(this.aClass42_Sub3_31, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ql", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass315_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass42_Sub3_31.anInt3693 >> 8) >> this.aClass42_Sub3_31.anInt3672;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass42_Sub3_31.anInt3683 >> 8) >> this.aClass42_Sub3_31.anInt3672;
			this.aClass315_2.method7892(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
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
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
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
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.IA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass315_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass42_Sub3_31.anInt3693 >> 8) >> this.aClass42_Sub3_31.anInt3672;
			@Pc(39) int local39 = arg3 - (this.aClass42_Sub3_31.anInt3683 * arg2 >> 8) >> this.aClass42_Sub3_31.anInt3672;
			this.aClass315_2.method7890(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray24[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILclient!vh;)V")
	private void method6336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub4_Sub10_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray12[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (this.aClass42_Sub3_31.anIntArray296.length < local22) {
			this.aClass42_Sub3_31.anIntArray294 = new int[local22];
			this.aClass42_Sub3_31.anIntArray296 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass42_Sub3_31.anIntArray296;
		@Pc(46) int[] local46 = this.aClass42_Sub3_31.anIntArray294;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass42_Sub3_31.anInt3672;
			local46[local48] = local19[local48] >> this.aClass42_Sub3_31.anInt3672;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(86) int local86 = local42[local80];
			@Pc(91) int local91 = local46[local80++];
			@Pc(95) int local95 = local42[local80];
			@Pc(100) int local100 = local46[local80++];
			@Pc(104) int local104 = local42[local80];
			@Pc(109) int local109 = local46[local80++];
			if ((local86 - local95) * (local100 - local109) - (local100 - local91) * (local104 - local95) > 0) {
				arg2.method7616(local100, local91, local95, local86, local104, local109);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9453;
		@Pc(13) int local13 = arg1 >> super.anInt9453;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9452 - 1 || local13 > super.anInt9450 - 1) {
			return 0;
		}
		@Pc(49) int local49 = super.anInt9451 - 1 & arg0;
		@Pc(56) int local56 = arg1 & super.anInt9451 - 1;
		@Pc(83) int local83 = local49 * this.anIntArrayArray70[local8 + 1][local13] + (super.anInt9451 - local49) * this.anIntArrayArray70[local8][local13] >> super.anInt9453;
		@Pc(114) int local114 = local49 * this.anIntArrayArray70[local8 + 1][local13 + 1] + (super.anInt9451 - local49) * this.anIntArrayArray70[local8][local13 - -1] >> super.anInt9453;
		return (super.anInt9451 - local56) * local83 + local114 * local56 >> super.anInt9453;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	@Override
	public void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ql", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt9452][super.anInt9450][];
		}
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt9452][super.anInt9450][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray13[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class12_Sub38[] local88 = this.aClass12_Sub38ArrayArrayArray1[arg0][arg1] = new Class12_Sub38[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class12 local125;
			for (local125 = this.aClass68_58.method1917(local119); local125 != null; local125 = this.aClass68_58.method1918()) {
				@Pc(130) Class12_Sub38 local130 = (Class12_Sub38) local125;
				if (local130.anInt6074 == arg8[local90] && local130.aFloat126 == (float) arg9[local90] && local130.anInt6076 == arg10 && arg11 == local130.anInt6075 && local130.anInt6080 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class12_Sub38(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass68_58.method1916(local88[local90], local119);
			} else {
				local88[local90] = (Class12_Sub38) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray23[arg0][arg1] = (byte) (this.aByteArrayArray23[arg0][arg1] | 0x1);
		}
		if (this.anInt7607 < arg6.length) {
			this.anInt7607 = arg6.length;
		}
		this.anInt7608 += arg6.length;
	}

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class12_Sub4_Sub10 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub4_Sub10 arg2) {
		if ((this.aByteArrayArray23[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9451 >> this.aClass42_Sub3_31.anInt3672;
		@Pc(27) Class12_Sub4_Sub10_Sub2 local27 = (Class12_Sub4_Sub10_Sub2) arg2;
		@Pc(37) Class12_Sub4_Sub10_Sub2 local37;
		if (local27 != null && local27.method7617(local24, local24)) {
			local37 = local27;
			local27.method7614();
		} else {
			local37 = new Class12_Sub4_Sub10_Sub2(this.aClass42_Sub3_31, local24, local24);
		}
		local37.method7613(0, 0, local24, local24);
		this.method6336(arg1, arg0, local37);
		return local37;
	}

	@OriginalMember(owner = "client!ql", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray70[arg0][arg1];
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6335(arg1, arg0, arg3, arg2, arg4);
	}
}
