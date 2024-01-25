import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	private int anInt3579;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
	private int anInt3581;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "Lclient!ec;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "[Lclient!np;")
	private Class1_Sub32[] aClass1_Sub32Array1;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "Lclient!jt;")
	private Class126 aClass126_7;

	@OriginalMember(owner = "client!lg", name = "Q", descriptor = "Lclient!jt;")
	public Class126 aClass126_8;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
	private int anInt3585;

	@OriginalMember(owner = "client!lg", name = "S", descriptor = "Lclient!jt;")
	public Class126 aClass126_9;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
	private int anInt3586;

	@OriginalMember(owner = "client!lg", name = "U", descriptor = "Lclient!jt;")
	public Class126 aClass126_10;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Lclient!at;")
	private final Class17 aClass17_34 = new Class17();

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!nm;")
	public final Class164_Sub1 aClass164_Sub1_26;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "[[I")
	private final int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
	public final int anInt3580;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
	public int anInt3582;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
	public final int anInt3584;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "[[[Lclient!np;")
	private Class1_Sub32[][][] aClass1_Sub32ArrayArrayArray1;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "[[B")
	private final byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "Lclient!fa;")
	private Class77 aClass77_25;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "Lclient!mk;")
	private Class156 aClass156_1;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!nm;IIII[[I[[II)V")
	public Class42_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass164_Sub1_26 = arg0;
		this.anIntArrayArray42 = arg5;
		this.anInt3580 = arg2;
		while (arg7 > 1) {
			this.anInt3582++;
			arg7 >>= 0x1;
		}
		this.anInt3584 = 0x1 << this.anInt3582;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass1_Sub32ArrayArrayArray1 = new Class1_Sub32[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aShortArrayArray7 = new short[arg3 * arg4][];
		this.aByteArrayArray11 = new byte[arg3][arg4];
		this.aByteArrayArray12 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[this.anInt3739 + 1][this.anInt3742 + 1];
		this.aFloatArrayArray7 = new float[this.anInt3739 + 1][this.anInt3742 + 1];
		this.aFloatArrayArray6 = new float[this.anInt3739 + 1][this.anInt3742 + 1];
		for (@Pc(122) int local122 = 1; local122 < this.anInt3742; local122++) {
			for (@Pc(128) int local128 = 1; local128 < this.anInt3739; local128++) {
				@Pc(148) int local148 = arg6[local128 + 1][local122] - arg6[local128 - 1][local122];
				@Pc(164) int local164 = arg6[local128][local122 + 1] - arg6[local128][local122 - 1];
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local148 * local148 + local164 * local164 + 65536)));
				this.aFloatArrayArray5[local128][local122] = (float) local148 * local179;
				this.aFloatArrayArray7[local128][local122] = -256.0F * local179;
				this.aFloatArrayArray6[local128][local122] = (float) local164 * local179;
			}
		}
		this.aClass77_25 = new Class77(128);
		if ((this.anInt3580 & 0x10) != 0) {
			this.aClass156_1 = new Class156(this.aClass164_Sub1_26, this);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
	@Override
	public void method3056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
	@Override
	public void method3057() {
		if (this.anInt3586 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt3739 + 1][this.anInt3742 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt3739; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt3742; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray12[local14 - 1][local20] >> 2) + (this.aByteArrayArray12[local14 + 1][local20] >> 3) + (this.aByteArrayArray12[local14][local20 - 1] >> 2) + (this.aByteArrayArray12[local14][local20 + 1] >> 3) + (this.aByteArrayArray12[local14][local20] >> 1));
				}
			}
			this.aClass1_Sub32Array1 = new Class1_Sub32[this.aClass77_25.method1365()];
			this.aClass77_25.method1367(this.aClass1_Sub32Array1);
			for (local14 = 0; local14 < this.aClass1_Sub32Array1.length; local14++) {
				this.aClass1_Sub32Array1[local14].method3668(this.anInt3586);
			}
			local14 = 24;
			if (this.anIntArrayArrayArray9 != null) {
				local14 += 4;
			}
			if ((this.anInt3580 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt3586 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class1_Sub32[] local141 = new Class1_Sub32[this.anInt3586];
			@Pc(149) Class77 local149 = new Class77(Static257.method3933(this.anInt3586));
			@Pc(153) Class1_Sub32[] local153 = new Class1_Sub32[this.anInt3585];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt3739; local155++) {
				for (local161 = 0; local161 < this.anInt3742; local161++) {
					if (this.anIntArrayArrayArray7[local155][local161] != null) {
						@Pc(180) Class1_Sub32[] local180 = this.aClass1_Sub32ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray6[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray5[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray8[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray7[local155][local161];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local155][local161];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local155][local161];
						if (local201 == null) {
							local201 = local208;
						}
						@Pc(243) float local243 = this.aFloatArrayArray5[local155][local161];
						@Pc(250) float local250 = this.aFloatArrayArray7[local155][local161];
						@Pc(257) float local257 = this.aFloatArrayArray6[local155][local161];
						@Pc(266) float local266 = this.aFloatArrayArray5[local155][local161 + 1];
						@Pc(275) float local275 = this.aFloatArrayArray7[local155][local161 + 1];
						@Pc(284) float local284 = this.aFloatArrayArray6[local155][local161 + 1];
						@Pc(295) float local295 = this.aFloatArrayArray5[local155 + 1][local161 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray7[local155 + 1][local161 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray6[local155 + 1][local161 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray5[local155 + 1][local161];
						@Pc(335) float local335 = this.aFloatArrayArray7[local155 + 1][local161];
						@Pc(344) float local344 = this.aFloatArrayArray6[local155 + 1][local161];
						@Pc(352) int local352 = local12[local155][local161] & 0xFF;
						@Pc(362) int local362 = local12[local155][local161 + 1] & 0xFF;
						@Pc(374) int local374 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(384) int local384 = local12[local155 + 1][local161] & 0xFF;
						@Pc(386) int local386 = 0;
						@Pc(398) int local398;
						label314: for (@Pc(388) int local388 = 0; local388 < local208.length; local388++) {
							@Pc(396) Class1_Sub32 local396 = local180[local388];
							for (local398 = 0; local398 < local386; local398++) {
								if (local153[local398] == local396) {
									continue label314;
								}
							}
							local153[local386++] = local396;
						}
						@Pc(430) short[] local430 = this.aShortArrayArray7[local161 * this.anInt3739 + local155] = new short[local208.length];
						for (@Pc(432) int local432 = 0; local432 < local208.length; local432++) {
							@Pc(445) int local445 = (local155 << this.anInt3582) + local187[local432];
							@Pc(454) int local454 = (local161 << this.anInt3582) + local194[local432];
							@Pc(458) int local458 = local208[local432];
							@Pc(462) int local462 = local201[local432];
							@Pc(470) int local470 = local220 == null ? 0 : local220[local432];
							@Pc(488) long local488 = (long) local462 << 48 | (long) local458 << 32 | (long) (local445 << 16) | (long) local454;
							@Pc(492) int local492 = local187[local432];
							@Pc(496) int local496 = local194[local432];
							@Pc(500) int local500 = 0;
							@Pc(502) float local502 = 1.0F;
							@Pc(516) int local516;
							@Pc(508) float local508;
							@Pc(510) float local510;
							@Pc(512) float local512;
							@Pc(600) float local600;
							if (local492 == 0 && local496 == 0) {
								local508 = local243;
								local510 = local250;
								local512 = local257;
								local516 = 74 - local352;
							} else if (local492 == 0 && local496 == this.anInt3584) {
								local508 = local266;
								local510 = local275;
								local512 = local284;
								local516 = 74 - local362;
							} else if (local492 == this.anInt3584 && local496 == this.anInt3584) {
								local508 = local295;
								local510 = local306;
								local512 = local317;
								local516 = 74 - local374;
							} else if (local492 == this.anInt3584 && local496 == 0) {
								local508 = local326;
								local510 = local335;
								local512 = local344;
								local516 = 74 - local384;
							} else {
								@Pc(577) float local577 = (float) local492 / (float) this.anInt3584;
								@Pc(584) float local584 = (float) local496 / (float) this.anInt3584;
								@Pc(592) float local592 = local243 + (local326 - local243) * local577;
								local600 = local250 + (local335 - local250) * local577;
								@Pc(608) float local608 = local257 + (local344 - local257) * local577;
								@Pc(616) float local616 = local266 + (local295 - local266) * local577;
								@Pc(624) float local624 = local275 + (local306 - local275) * local577;
								@Pc(632) float local632 = local284 + (local317 - local284) * local577;
								local508 = local592 + (local616 - local592) * local584;
								local510 = local600 + (local624 - local600) * local584;
								local512 = local608 + (local632 - local608) * local584;
								@Pc(667) int local667 = local352 + ((local384 - local352) * local492 >> this.anInt3582);
								@Pc(678) int local678 = local362 + ((local374 - local362) * local492 >> this.anInt3582);
								local516 = 74 - local667 - ((local678 - local667) * local496 >> this.anInt3582);
							}
							if (local458 != -1) {
								@Pc(702) int local702 = (local458 & 0x7F) * local516 >> 7;
								if (local702 < 2) {
									local702 = 2;
								} else if (local702 > 126) {
									local702 = 126;
								}
								local500 = Static325.anIntArray638[local458 & 0xFF80 | local702];
								if ((this.anInt3580 & 0x7) == 0) {
									local502 = this.aClass164_Sub1_26.aFloatArray22[0] * local508 + this.aClass164_Sub1_26.aFloatArray22[1] * local510 + this.aClass164_Sub1_26.aFloatArray22[2] * local512;
									local502 = this.aClass164_Sub1_26.aFloat53 + local502 * (local502 > 0.0F ? this.aClass164_Sub1_26.aFloat41 : this.aClass164_Sub1_26.aFloat51);
								}
							}
							@Pc(773) Class1 local773 = local149.method1368(local488);
							@Pc(805) int local805;
							if (local773 == null) {
								if (local462 == local458) {
									local805 = local500;
								} else {
									@Pc(786) int local786 = (local462 & 0x7F) * local516 >> 7;
									if (local786 < 2) {
										local786 = 2;
									} else if (local786 > 126) {
										local786 = 126;
									}
									local805 = Static325.anIntArray638[local462 & 0xFF80 | local786];
									if ((this.anInt3580 & 0x7) == 0) {
										@Pc(833) float local833 = this.aClass164_Sub1_26.aFloatArray22[0] * local508 + this.aClass164_Sub1_26.aFloatArray22[1] * local510 + this.aClass164_Sub1_26.aFloatArray22[2] * local512;
										local600 = this.aClass164_Sub1_26.aFloat53 + local502 * (local502 > 0.0F ? this.aClass164_Sub1_26.aFloat41 : this.aClass164_Sub1_26.aFloat51);
										@Pc(858) int local858 = local805 >> 16 & 0xFF;
										@Pc(864) int local864 = local805 >> 8 & 0xFF;
										@Pc(868) int local868 = local805 & 0xFF;
										local858 = (int) ((float) local858 * local600);
										if (local858 < 0) {
											local858 = 0;
										} else if (local858 > 255) {
											local858 = 255;
										}
										local864 = (int) ((float) local864 * local600);
										if (local864 < 0) {
											local864 = 0;
										} else if (local864 > 255) {
											local864 = 255;
										}
										local868 = (int) ((float) local868 * local600);
										if (local868 < 0) {
											local868 = 0;
										} else if (local868 > 255) {
											local868 = 255;
										}
										local805 = local858 << 16 | local864 << 8 | local868;
									}
								}
								local137.putFloat((float) local445);
								local137.putFloat((float) (this.method3043(local445, local454) + local470));
								local137.putFloat((float) local454);
								local137.put((byte) (local805 >> 16));
								local137.put((byte) (local805 >> 8));
								local137.put((byte) local805);
								local137.put((byte) -1);
								local137.putFloat((float) local445);
								local137.putFloat((float) local454);
								if (this.anIntArrayArrayArray9 != null) {
									local137.putFloat(local232 == null ? 0.0F : (float) local232[local432]);
								}
								if ((this.anInt3580 & 0x7) != 0) {
									local137.putFloat(local508);
									local137.putFloat(local510);
									local137.putFloat(local512);
								}
								local398 = this.anInt3581++;
								local430[local432] = (short) local398;
								if (local458 != -1) {
									local141[local398] = local180[local432];
								}
								local149.method1370(local488, new Class1_Sub41(local430[local432]));
							} else {
								local430[local432] = ((Class1_Sub41) local773).aShort84;
								local398 = local430[local432] & 0xFFFF;
								if (local458 != -1 && local180[local432].aLong207 < local141[local398].aLong207) {
									local141[local398] = local180[local432];
								}
							}
							for (local805 = 0; local805 < local386; local805++) {
								local153[local805].method3665(local500, local516, local398, local502);
							}
							this.anInt3579++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt3581; local155++) {
				@Pc(1115) Class1_Sub32 local1115 = local141[local155];
				if (local1115 != null) {
					local1115.method3664(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt3739; local155++) {
				for (local161 = 0; local161 < this.anInt3742; local161++) {
					@Pc(1145) short[] local1145 = this.aShortArrayArray7[local161 * this.anInt3739 + local155];
					if (local1145 != null) {
						@Pc(1149) int local1149 = 0;
						@Pc(1151) int local1151 = 0;
						while (local1151 < local1145.length) {
							@Pc(1162) int local1162 = local1145[local1151++] & 0xFFFF;
							@Pc(1169) int local1169 = local1145[local1151++] & 0xFFFF;
							@Pc(1176) int local1176 = local1145[local1151++] & 0xFFFF;
							@Pc(1180) Class1_Sub32 local1180 = local141[local1162];
							@Pc(1184) Class1_Sub32 local1184 = local141[local1169];
							@Pc(1188) Class1_Sub32 local1188 = local141[local1176];
							@Pc(1190) Class1_Sub32 local1190 = null;
							if (local1180 != null) {
								local1180.method3666(local1149, local155, local161);
								local1190 = local1180;
							}
							if (local1184 != null) {
								local1184.method3666(local1149, local155, local161);
								if (local1190 == null || local1184.aLong207 < local1190.aLong207) {
									local1190 = local1184;
								}
							}
							if (local1188 != null) {
								local1188.method3666(local1149, local155, local161);
								if (local1190 == null || local1188.aLong207 < local1190.aLong207) {
									local1190 = local1188;
								}
							}
							if (local1190 != null) {
								if (local1180 != null) {
									local1190.method3664(local1162);
								}
								if (local1184 != null) {
									local1190.method3664(local1169);
								}
								if (local1188 != null) {
									local1190.method3664(local1176);
								}
								local1190.method3666(local1149, local155, local161);
							}
							local1149++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface3_4 = this.aClass164_Sub1_26.method3568(local14, local137);
			this.aClass126_10 = new Class126(this.aClass164_Sub1_26, this.anInterface3_4, 5126, 3, 0);
			this.aClass126_7 = new Class126(this.aClass164_Sub1_26, this.anInterface3_4, 5121, 4, 12);
			@Pc(1320) byte local1320;
			if (this.anIntArrayArrayArray9 == null) {
				this.aClass126_8 = new Class126(this.aClass164_Sub1_26, this.anInterface3_4, 5126, 2, 16);
				local1320 = 24;
			} else {
				this.aClass126_8 = new Class126(this.aClass164_Sub1_26, this.anInterface3_4, 5126, 3, 16);
				local1320 = 28;
			}
			if ((this.anInt3580 & 0x7) != 0) {
				this.aClass126_9 = new Class126(this.aClass164_Sub1_26, this.anInterface3_4, 5126, 3, local1320);
			}
			@Pc(1357) long[] local1357 = new long[this.aClass1_Sub32Array1.length];
			for (@Pc(1359) int local1359 = 0; local1359 < this.aClass1_Sub32Array1.length; local1359++) {
				@Pc(1369) Class1_Sub32 local1369 = this.aClass1_Sub32Array1[local1359];
				local1357[local1359] = local1369.aLong207;
				local1369.method3667(this.anInt3581);
			}
			Static279.method4281(local1357, this.aClass1_Sub32Array1);
			if (this.aClass156_1 != null) {
				this.aClass156_1.method3113();
			}
		} else {
			this.aClass156_1 = null;
		}
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass1_Sub32ArrayArrayArray1 = null;
		this.anIntArrayArrayArray7 = null;
		this.aByteArrayArray12 = null;
		this.aClass77_25 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!uj;II)V")
	private void method2926(@OriginalArg(0) Class1_Sub6_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static204.anIntArray429.length < local16) {
			Static204.anIntArray429 = new int[local16];
			Static204.anIntArray431 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static204.anIntArray429[local28] = (local6[local28] & 0xFF) >> this.aClass164_Sub1_26.anInt4065;
			Static204.anIntArray431[local28] = (local13[local28] & 0xFF) >> this.aClass164_Sub1_26.anInt4065;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static204.anIntArray429[local28];
			@Pc(71) int local71 = Static204.anIntArray431[local28++];
			@Pc(75) int local75 = Static204.anIntArray429[local28];
			@Pc(80) int local80 = Static204.anIntArray431[local28++];
			@Pc(84) int local84 = Static204.anIntArray429[local28];
			@Pc(89) int local89 = Static204.anIntArray431[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method4997(local71, local89, local75, local80, local84, local66);
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ma;[I)V")
	@Override
	public void method3050(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass17_34.method199(new Class1_Sub17(this.aClass164_Sub1_26, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILclient!fq;)Lclient!fq;")
	@Override
	public Class1_Sub6_Sub5 method3047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub6_Sub5 arg2) {
		if ((this.aByteArrayArray11[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt3584 >> this.aClass164_Sub1_26.anInt4065;
		@Pc(20) Class1_Sub6_Sub5_Sub1 local20 = (Class1_Sub6_Sub5_Sub1) arg2;
		@Pc(30) Class1_Sub6_Sub5_Sub1 local30;
		if (local20 != null && local20.method4998(local17, local17)) {
			local30 = local20;
			local20.method4996();
		} else {
			local30 = new Class1_Sub6_Sub5_Sub1(this.aClass164_Sub1_26, local17, local17);
		}
		local30.method4999(local17, local17, 0, 0);
		this.method2926(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	@Override
	public void method3045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray12[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray12[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)I")
	@Override
	public int method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray42[arg0][arg1];
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!fq;IIIIZ)V")
	@Override
	public void method3054(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass156_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass164_Sub1_26.anInt4088 >> 8) >> this.aClass164_Sub1_26.anInt4065;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass164_Sub1_26.anInt4076 >> 8) >> this.aClass164_Sub1_26.anInt4065;
			this.aClass156_1.method3109(local19, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			if (arg10 != null) {
				local22[local52] = arg10[local54];
			}
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			if (arg10 != null) {
				local22[local52] = arg10[local54];
			}
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			if (arg10 != null) {
				local22[local52] = arg10[local54];
			}
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method3058(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!fq;IIIIZ)Z")
	@Override
	public boolean method3046(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass156_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass164_Sub1_26.anInt4088 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass164_Sub1_26.anInt4076 >> 8) >> 3;
			return this.aClass156_1.method3108(local30, local18, arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass1_Sub32Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass164_Sub1_26.aFloat45;
		@Pc(10) float local10 = this.aClass164_Sub1_26.aFloat46;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static204.anIntArray430.length < local20) {
			Static204.anIntArray430 = new int[local20];
		}
		if (Static204.aClass1_Sub33_5.aByteArray86.length < this.anInt3579 * 2) {
			Static204.aClass1_Sub33_5 = new Class1_Sub33(this.anInt3579 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt3739 - 1) {
			local67 = this.anInt3739 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt3742 - 1) {
			local82 = this.anInt3742 - 1;
		}
		Static204.anInt3583 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static204.anIntArray430[Static204.anInt3583++] = local108 * this.anInt3739 + local97;
				}
			}
		}
		this.aClass164_Sub1_26.method3582();
		this.aClass164_Sub1_26.method3581((this.anInt3580 & 0x7) != 0);
		for (local97 = 0; local97 < this.aClass1_Sub32Array1.length; local97++) {
			this.aClass1_Sub32Array1[local97].method3669(Static204.anInt3583, Static204.anIntArray430);
		}
		if (!this.aClass17_34.method204()) {
			local97 = this.aClass164_Sub1_26.anInt4067;
			@Pc(180) int local180 = this.aClass164_Sub1_26.anInt4074;
			this.aClass164_Sub1_26.method5361(0, local180);
			this.aClass164_Sub1_26.method5314(local10, local6 - 4.0F);
			this.aClass164_Sub1_26.method3581(false);
			this.aClass164_Sub1_26.method3606(false);
			this.aClass164_Sub1_26.method3607(130);
			this.aClass164_Sub1_26.method3630();
			this.aClass164_Sub1_26.method3603(this.aClass164_Sub1_26.aClass15_Sub2_6);
			this.aClass164_Sub1_26.method3629(8448, 7681);
			this.aClass164_Sub1_26.method3571(0, 34166, 770);
			this.aClass164_Sub1_26.method3612(0, 34167);
			for (@Pc(236) Class1 local236 = this.aClass17_34.method202(); local236 != null; local236 = this.aClass17_34.method207()) {
				@Pc(241) Class1_Sub17 local241 = (Class1_Sub17) local236;
				local241.method2341(arg1, arg0, arg2, arg3);
			}
			this.aClass164_Sub1_26.method3571(0, 5890, 768);
			this.aClass164_Sub1_26.method3612(0, 5890);
			this.aClass164_Sub1_26.method3603(null);
			this.aClass164_Sub1_26.method5361(local97, local180);
		}
		if (this.aClass156_1 != null) {
			this.aClass164_Sub1_26.method5314(local10, local6 - 8.0F);
			this.aClass164_Sub1_26.method3582();
			this.aClass164_Sub1_26.method3624(this.aClass126_10, null, null, this.aClass126_8);
			this.aClass156_1.method3106(arg0, arg2, arg3, arg1, arg4);
		}
		this.aClass164_Sub1_26.method5314(local10, local6);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
	@Override
	public int method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt3582;
		@Pc(9) int local9 = arg1 >> this.anInt3582;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt3739 - 1 || local9 > this.anInt3742 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt3584 - 1;
		@Pc(41) int local41 = arg1 & this.anInt3584 - 1;
		@Pc(67) int local67 = this.anIntArrayArray42[local4][local9] * (this.anInt3584 - local34) + this.anIntArrayArray42[local4 + 1][local9] * local34 >> this.anInt3582;
		@Pc(97) int local97 = this.anIntArrayArray42[local4][local9 + 1] * (this.anInt3584 - local34) + this.anIntArrayArray42[local4 + 1][local9 + 1] * local34 >> this.anInt3582;
		return local67 * (this.anInt3584 - local41) + local97 * local41 >> this.anInt3582;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[this.anInt3739][this.anInt3742][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt3739][this.anInt3742][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(82) Class1_Sub32[] local82 = this.aClass1_Sub32ArrayArrayArray1[arg0][arg1] = new Class1_Sub32[arg6.length];
		for (@Pc(84) int local84 = 0; local84 < arg6.length; local84++) {
			@Pc(115) long local115 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local84] << 14) | (long) arg8[local84];
			@Pc(121) Class1 local121;
			for (local121 = this.aClass77_25.method1368(local115); local121 != null; local121 = this.aClass77_25.method1369()) {
				@Pc(126) Class1_Sub32 local126 = (Class1_Sub32) local121;
				if (local126.anInt4130 == arg8[local84] && local126.aFloat54 == (float) arg9[local84] && local126.anInt4127 == arg10 && local126.anInt4129 == arg11 && local126.anInt4128 == arg12) {
					break;
				}
			}
			if (local121 == null) {
				local82[local84] = new Class1_Sub32(this, arg8[local84], arg9[local84], arg10, arg11, arg12);
				this.aClass77_25.method1370(local115, local82[local84]);
			} else {
				local82[local84] = (Class1_Sub32) local121;
			}
		}
		if (arg13) {
			this.aByteArrayArray11[arg0][arg1] = (byte) (this.aByteArrayArray11[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt3585) {
			this.anInt3585 = arg6.length;
		}
		this.anInt3586 += arg6.length;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3051(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3586 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass164_Sub1_26.anOpengl1;
		this.aClass164_Sub1_26.method3632();
		this.aClass164_Sub1_26.method3602(false);
		this.aClass164_Sub1_26.method3581(false);
		this.aClass164_Sub1_26.method3563(false);
		this.aClass164_Sub1_26.method3606(false);
		this.aClass164_Sub1_26.method3607(0);
		this.aClass164_Sub1_26.method3630();
		this.aClass164_Sub1_26.method3603(null);
		Static204.aFloatArray11[0] = (float) 1024 / ((float) this.anInt3584 * 128.0F * (float) this.aClass164_Sub1_26.anInt4066);
		Static204.aFloatArray11[1] = 0.0F;
		Static204.aFloatArray11[2] = 0.0F;
		Static204.aFloatArray11[3] = 0.0F;
		Static204.aFloatArray11[4] = 0.0F;
		Static204.aFloatArray11[5] = (float) 1024 / ((float) this.anInt3584 * 128.0F * (float) this.aClass164_Sub1_26.anInt4064);
		Static204.aFloatArray11[6] = 0.0F;
		Static204.aFloatArray11[7] = 0.0F;
		Static204.aFloatArray11[8] = 0.0F;
		Static204.aFloatArray11[9] = 0.0F;
		Static204.aFloatArray11[10] = 0.0F;
		Static204.aFloatArray11[11] = 0.0F;
		Static204.aFloatArray11[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass164_Sub1_26.anInt4066;
		Static204.aFloatArray11[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass164_Sub1_26.anInt4064;
		Static204.aFloatArray11[14] = 0.0F;
		Static204.aFloatArray11[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static204.aFloatArray11, 0);
		Static204.aFloatArray11[0] = 1.0F;
		Static204.aFloatArray11[1] = 0.0F;
		Static204.aFloatArray11[2] = 0.0F;
		Static204.aFloatArray11[3] = 0.0F;
		Static204.aFloatArray11[4] = 0.0F;
		Static204.aFloatArray11[5] = 0.0F;
		Static204.aFloatArray11[6] = 1.0F;
		Static204.aFloatArray11[7] = 0.0F;
		Static204.aFloatArray11[8] = 0.0F;
		Static204.aFloatArray11[9] = 1.0F;
		Static204.aFloatArray11[10] = 0.0F;
		Static204.aFloatArray11[11] = 0.0F;
		Static204.aFloatArray11[12] = 0.0F;
		Static204.aFloatArray11[13] = 0.0F;
		Static204.aFloatArray11[14] = 0.0F;
		Static204.aFloatArray11[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static204.aFloatArray11, 0);
		if ((this.anInt3580 & 0x7) == 0) {
			this.aClass164_Sub1_26.method3581(false);
		} else {
			this.aClass164_Sub1_26.method3581(true);
			this.aClass164_Sub1_26.method3573();
		}
		this.aClass164_Sub1_26.method3624(this.aClass126_10, this.aClass126_9, this.aClass126_7, this.aClass126_8);
		if (Static204.aClass1_Sub33_5.aByteArray86.length < this.anInt3579 * 2) {
			Static204.aClass1_Sub33_5 = new Class1_Sub33(this.anInt3579 * 2);
		} else {
			Static204.aClass1_Sub33_5.lb = 0;
		}
		@Pc(288) int local288 = 0;
		@Pc(294) int local294;
		@Pc(304) int local304;
		@Pc(306) int local306;
		@Pc(324) short[] local324;
		@Pc(328) int local328;
		if (this.aClass164_Sub1_26.aBoolean413) {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt3739 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray7[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static204.aClass1_Sub33_5.method5138(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		} else {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt3739 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray7[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static204.aClass1_Sub33_5.method5169(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		}
		if (local288 > 0) {
			@Pc(418) Class21_Sub1 local418 = new Class21_Sub1(this.aClass164_Sub1_26, 5123, Static204.aClass1_Sub33_5.aByteArray86, Static204.aClass1_Sub33_5.lb);
			this.aClass164_Sub1_26.method3614(local418, 0, local288);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lclient!fq;IIIIZ)V")
	@Override
	public void method3055(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass156_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass164_Sub1_26.anInt4088 >> 8) >> this.aClass164_Sub1_26.anInt4065;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass164_Sub1_26.anInt4076 >> 8) >> this.aClass164_Sub1_26.anInt4065;
			this.aClass156_1.method3107(arg0, local33, local19);
		}
	}
}
