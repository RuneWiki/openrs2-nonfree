import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "Lclient!ga;")
	public Class88 aClass88_1;

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
	private int anInt139;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "Lclient!ga;")
	public Class88 aClass88_2;

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "[Lclient!wo;")
	private Class3_Sub44[] aClass3_Sub44Array1;

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "Lclient!ht;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "Lclient!ga;")
	public Class88 aClass88_3;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "Lclient!ga;")
	private Class88 aClass88_4;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "Lclient!kr;")
	private final Class138 aClass138_2 = new Class138();

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "Lclient!mi;")
	public final Class155_Sub1 aClass155_Sub1_3;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "[[I")
	private final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
	public final int anInt136;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
	public final int anInt134;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "[[[Lclient!wo;")
	private Class3_Sub44[][][] aClass3_Sub44ArrayArrayArray1;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "[[B")
	private final byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ag", name = "G", descriptor = "Lclient!cp;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "Lclient!rr;")
	private Class208 aClass208_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!mi;IIII[[I[[II)V")
	public Class7_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass155_Sub1_3 = arg0;
		this.anIntArrayArray2 = arg5;
		this.anInt136 = arg2;
		while (arg7 > 1) {
			this.anInt133++;
			arg7 >>= 0x1;
		}
		this.anInt134 = 0x1 << this.anInt133;
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aClass3_Sub44ArrayArrayArray1 = new Class3_Sub44[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aByteArrayArray1 = new byte[arg3][arg4];
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray2 = new float[this.anInt6380 + 1][this.anInt6381 + 1];
		this.aFloatArrayArray3 = new float[this.anInt6380 + 1][this.anInt6381 + 1];
		this.aFloatArrayArray1 = new float[this.anInt6380 + 1][this.anInt6381 + 1];
		for (@Pc(122) int local122 = 1; local122 < this.anInt6381; local122++) {
			for (@Pc(128) int local128 = 1; local128 < this.anInt6380; local128++) {
				@Pc(148) int local148 = arg6[local128 + 1][local122] - arg6[local128 - 1][local122];
				@Pc(164) int local164 = arg6[local128][local122 + 1] - arg6[local128][local122 - 1];
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local148 * local148 + local164 * local164 + 65536)));
				this.aFloatArrayArray2[local128][local122] = (float) local148 * local179;
				this.aFloatArrayArray3[local128][local122] = -256.0F * local179;
				this.aFloatArrayArray1[local128][local122] = (float) local164 * local179;
			}
		}
		this.aClass44_1 = new Class44(128);
		if ((this.anInt136 & 0x10) != 0) {
			this.aClass208_1 = new Class208(this.aClass155_Sub1_3, this);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	@Override
	public void method5644() {
		if (this.anInt140 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt6380 + 1][this.anInt6381 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt6380; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt6381; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray2[local14 - 1][local20] >> 2) + (this.aByteArrayArray2[local14 + 1][local20] >> 3) + (this.aByteArrayArray2[local14][local20 - 1] >> 2) + (this.aByteArrayArray2[local14][local20 + 1] >> 3) + (this.aByteArrayArray2[local14][local20] >> 1));
				}
			}
			this.aClass3_Sub44Array1 = new Class3_Sub44[this.aClass44_1.method943()];
			this.aClass44_1.method945(this.aClass3_Sub44Array1);
			for (local14 = 0; local14 < this.aClass3_Sub44Array1.length; local14++) {
				this.aClass3_Sub44Array1[local14].method5707(this.anInt140);
			}
			local14 = 24;
			if (this.anIntArrayArrayArray6 != null) {
				local14 += 4;
			}
			if ((this.anInt136 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt140 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class3_Sub44[] local141 = new Class3_Sub44[this.anInt140];
			@Pc(149) Class44 local149 = new Class44(Static338.method5141(this.anInt140));
			@Pc(153) Class3_Sub44[] local153 = new Class3_Sub44[this.anInt139];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt6380; local155++) {
				for (local161 = 0; local161 < this.anInt6381; local161++) {
					if (this.anIntArrayArrayArray3[local155][local161] != null) {
						@Pc(180) Class3_Sub44[] local180 = this.aClass3_Sub44ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray5[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray2[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray4[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray3[local155][local161];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray1 == null ? null : this.anIntArrayArrayArray1[local155][local161];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local155][local161];
						if (local201 == null) {
							local201 = local208;
						}
						@Pc(243) float local243 = this.aFloatArrayArray2[local155][local161];
						@Pc(250) float local250 = this.aFloatArrayArray3[local155][local161];
						@Pc(257) float local257 = this.aFloatArrayArray1[local155][local161];
						@Pc(266) float local266 = this.aFloatArrayArray2[local155][local161 + 1];
						@Pc(275) float local275 = this.aFloatArrayArray3[local155][local161 + 1];
						@Pc(284) float local284 = this.aFloatArrayArray1[local155][local161 + 1];
						@Pc(295) float local295 = this.aFloatArrayArray2[local155 + 1][local161 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray3[local155 + 1][local161 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray1[local155 + 1][local161 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray2[local155 + 1][local161];
						@Pc(335) float local335 = this.aFloatArrayArray3[local155 + 1][local161];
						@Pc(344) float local344 = this.aFloatArrayArray1[local155 + 1][local161];
						@Pc(352) int local352 = local12[local155][local161] & 0xFF;
						@Pc(362) int local362 = local12[local155][local161 + 1] & 0xFF;
						@Pc(374) int local374 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(384) int local384 = local12[local155 + 1][local161] & 0xFF;
						@Pc(386) int local386 = 0;
						@Pc(398) int local398;
						label314: for (@Pc(388) int local388 = 0; local388 < local208.length; local388++) {
							@Pc(396) Class3_Sub44 local396 = local180[local388];
							for (local398 = 0; local398 < local386; local398++) {
								if (local153[local398] == local396) {
									continue label314;
								}
							}
							local153[local386++] = local396;
						}
						@Pc(430) short[] local430 = this.aShortArrayArray1[local161 * this.anInt6380 + local155] = new short[local208.length];
						for (@Pc(432) int local432 = 0; local432 < local208.length; local432++) {
							@Pc(445) int local445 = (local155 << this.anInt133) + local187[local432];
							@Pc(454) int local454 = (local161 << this.anInt133) + local194[local432];
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
							} else if (local492 == 0 && local496 == this.anInt134) {
								local508 = local266;
								local510 = local275;
								local512 = local284;
								local516 = 74 - local362;
							} else if (local492 == this.anInt134 && local496 == this.anInt134) {
								local508 = local295;
								local510 = local306;
								local512 = local317;
								local516 = 74 - local374;
							} else if (local492 == this.anInt134 && local496 == 0) {
								local508 = local326;
								local510 = local335;
								local512 = local344;
								local516 = 74 - local384;
							} else {
								@Pc(577) float local577 = (float) local492 / (float) this.anInt134;
								@Pc(584) float local584 = (float) local496 / (float) this.anInt134;
								@Pc(592) float local592 = local243 + (local326 - local243) * local577;
								local600 = local250 + (local335 - local250) * local577;
								@Pc(608) float local608 = local257 + (local344 - local257) * local577;
								@Pc(616) float local616 = local266 + (local295 - local266) * local577;
								@Pc(624) float local624 = local275 + (local306 - local275) * local577;
								@Pc(632) float local632 = local284 + (local317 - local284) * local577;
								local508 = local592 + (local616 - local592) * local584;
								local510 = local600 + (local624 - local600) * local584;
								local512 = local608 + (local632 - local608) * local584;
								@Pc(667) int local667 = local352 + ((local384 - local352) * local492 >> this.anInt133);
								@Pc(678) int local678 = local362 + ((local374 - local362) * local492 >> this.anInt133);
								local516 = 74 - local667 - ((local678 - local667) * local496 >> this.anInt133);
							}
							if (local458 != -1) {
								@Pc(702) int local702 = (local458 & 0x7F) * local516 >> 7;
								if (local702 < 2) {
									local702 = 2;
								} else if (local702 > 126) {
									local702 = 126;
								}
								local500 = Static145.anIntArray290[local458 & 0xFF80 | local702];
								if ((this.anInt136 & 0x7) == 0) {
									local502 = this.aClass155_Sub1_3.aFloatArray21[0] * local508 + this.aClass155_Sub1_3.aFloatArray21[1] * local510 + this.aClass155_Sub1_3.aFloatArray21[2] * local512;
									local502 = this.aClass155_Sub1_3.aFloat46 + local502 * (local502 > 0.0F ? this.aClass155_Sub1_3.aFloat55 : this.aClass155_Sub1_3.aFloat54);
								}
							}
							@Pc(773) Class3 local773 = local149.method942(local488);
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
									local805 = Static145.anIntArray290[local462 & 0xFF80 | local786];
									if ((this.anInt136 & 0x7) == 0) {
										@Pc(833) float local833 = this.aClass155_Sub1_3.aFloatArray21[0] * local508 + this.aClass155_Sub1_3.aFloatArray21[1] * local510 + this.aClass155_Sub1_3.aFloatArray21[2] * local512;
										local600 = this.aClass155_Sub1_3.aFloat46 + local502 * (local502 > 0.0F ? this.aClass155_Sub1_3.aFloat55 : this.aClass155_Sub1_3.aFloat54);
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
								local137.putFloat((float) (this.method5638(local445, local454) + local470));
								local137.putFloat((float) local454);
								local137.put((byte) (local805 >> 16));
								local137.put((byte) (local805 >> 8));
								local137.put((byte) local805);
								local137.put((byte) -1);
								local137.putFloat((float) local445);
								local137.putFloat((float) local454);
								if (this.anIntArrayArrayArray6 != null) {
									local137.putFloat(local232 == null ? 0.0F : (float) local232[local432]);
								}
								if ((this.anInt136 & 0x7) != 0) {
									local137.putFloat(local508);
									local137.putFloat(local510);
									local137.putFloat(local512);
								}
								local398 = this.anInt138++;
								local430[local432] = (short) local398;
								if (local458 != -1) {
									local141[local398] = local180[local432];
								}
								local149.method948(local488, new Class3_Sub6(local430[local432]));
							} else {
								local430[local432] = ((Class3_Sub6) local773).aShort13;
								local398 = local430[local432] & 0xFFFF;
								if (local458 != -1 && local180[local432].aLong240 < local141[local398].aLong240) {
									local141[local398] = local180[local432];
								}
							}
							for (local805 = 0; local805 < local386; local805++) {
								local153[local805].method5708(local398, local516, local502, local500);
							}
							this.anInt137++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt138; local155++) {
				@Pc(1115) Class3_Sub44 local1115 = local141[local155];
				if (local1115 != null) {
					local1115.method5706(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt6380; local155++) {
				for (local161 = 0; local161 < this.anInt6381; local161++) {
					@Pc(1145) short[] local1145 = this.aShortArrayArray1[local161 * this.anInt6380 + local155];
					if (local1145 != null) {
						@Pc(1149) int local1149 = 0;
						@Pc(1151) int local1151 = 0;
						while (local1151 < local1145.length) {
							@Pc(1162) int local1162 = local1145[local1151++] & 0xFFFF;
							@Pc(1169) int local1169 = local1145[local1151++] & 0xFFFF;
							@Pc(1176) int local1176 = local1145[local1151++] & 0xFFFF;
							@Pc(1180) Class3_Sub44 local1180 = local141[local1162];
							@Pc(1184) Class3_Sub44 local1184 = local141[local1169];
							@Pc(1188) Class3_Sub44 local1188 = local141[local1176];
							@Pc(1190) Class3_Sub44 local1190 = null;
							if (local1180 != null) {
								local1180.method5704(local161, local1149, local155);
								local1190 = local1180;
							}
							if (local1184 != null) {
								local1184.method5704(local161, local1149, local155);
								if (local1190 == null || local1184.aLong240 < local1190.aLong240) {
									local1190 = local1184;
								}
							}
							if (local1188 != null) {
								local1188.method5704(local161, local1149, local155);
								if (local1190 == null || local1188.aLong240 < local1190.aLong240) {
									local1190 = local1188;
								}
							}
							if (local1190 != null) {
								if (local1180 != null) {
									local1190.method5706(local1162);
								}
								if (local1184 != null) {
									local1190.method5706(local1169);
								}
								if (local1188 != null) {
									local1190.method5706(local1176);
								}
								local1190.method5704(local161, local1149, local155);
							}
							local1149++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface5_1 = this.aClass155_Sub1_3.method3625(local14, local137);
			this.aClass88_2 = new Class88(this.aClass155_Sub1_3, this.anInterface5_1, 5126, 3, 0);
			this.aClass88_4 = new Class88(this.aClass155_Sub1_3, this.anInterface5_1, 5121, 4, 12);
			@Pc(1320) byte local1320;
			if (this.anIntArrayArrayArray6 == null) {
				this.aClass88_1 = new Class88(this.aClass155_Sub1_3, this.anInterface5_1, 5126, 2, 16);
				local1320 = 24;
			} else {
				this.aClass88_1 = new Class88(this.aClass155_Sub1_3, this.anInterface5_1, 5126, 3, 16);
				local1320 = 28;
			}
			if ((this.anInt136 & 0x7) != 0) {
				this.aClass88_3 = new Class88(this.aClass155_Sub1_3, this.anInterface5_1, 5126, 3, local1320);
			}
			@Pc(1357) long[] local1357 = new long[this.aClass3_Sub44Array1.length];
			for (@Pc(1359) int local1359 = 0; local1359 < this.aClass3_Sub44Array1.length; local1359++) {
				@Pc(1369) Class3_Sub44 local1369 = this.aClass3_Sub44Array1[local1359];
				local1357[local1359] = local1369.aLong240;
				local1369.method5705(this.anInt138);
			}
			Static38.method622(this.aClass3_Sub44Array1, local1357);
			if (this.aClass208_1 != null) {
				this.aClass208_1.method4708();
			}
		} else {
			this.aClass208_1 = null;
		}
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass3_Sub44ArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aByteArrayArray2 = null;
		this.aClass44_1 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[this.anInt6380][this.anInt6381][];
		}
		if (arg3 != null && this.anIntArrayArrayArray1 == null) {
			this.anIntArrayArrayArray1 = new int[this.anInt6380][this.anInt6381][];
		}
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray2[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray4[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray1 != null) {
			this.anIntArrayArrayArray1[arg0][arg1] = arg3;
		}
		@Pc(82) Class3_Sub44[] local82 = this.aClass3_Sub44ArrayArrayArray1[arg0][arg1] = new Class3_Sub44[arg6.length];
		for (@Pc(84) int local84 = 0; local84 < arg6.length; local84++) {
			@Pc(115) long local115 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local84] << 14) | (long) arg8[local84];
			@Pc(121) Class3 local121;
			for (local121 = this.aClass44_1.method942(local115); local121 != null; local121 = this.aClass44_1.method946()) {
				@Pc(126) Class3_Sub44 local126 = (Class3_Sub44) local121;
				if (local126.anInt6466 == arg8[local84] && local126.aFloat77 == (float) arg9[local84] && local126.anInt6465 == arg10 && local126.anInt6464 == arg11 && local126.anInt6467 == arg12) {
					break;
				}
			}
			if (local121 == null) {
				local82[local84] = new Class3_Sub44(this, arg8[local84], arg9[local84], arg10, arg11, arg12);
				this.aClass44_1.method948(local115, local82[local84]);
			} else {
				local82[local84] = (Class3_Sub44) local121;
			}
		}
		if (arg13) {
			this.aByteArrayArray1[arg0][arg1] = (byte) (this.aByteArrayArray1[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt139) {
			this.anInt139 = arg6.length;
		}
		this.anInt140 += arg6.length;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!tm;)Lclient!tm;")
	@Override
	public Class3_Sub7_Sub6 method5641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub6 arg2) {
		if ((this.aByteArrayArray1[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt134 >> this.aClass155_Sub1_3.anInt3848;
		@Pc(20) Class3_Sub7_Sub6_Sub1 local20 = (Class3_Sub7_Sub6_Sub1) arg2;
		@Pc(30) Class3_Sub7_Sub6_Sub1 local30;
		if (local20 != null && local20.method1973(local17, local17)) {
			local30 = local20;
			local20.method1975();
		} else {
			local30 = new Class3_Sub7_Sub6_Sub1(this.aClass155_Sub1_3, local17, local17);
		}
		local30.method1974(0, 0, local17, local17);
		this.method126(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5650(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt140 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass155_Sub1_3.anOpengl1;
		this.aClass155_Sub1_3.method3597();
		this.aClass155_Sub1_3.method3612(false);
		this.aClass155_Sub1_3.method3568(false);
		this.aClass155_Sub1_3.method3573(false);
		this.aClass155_Sub1_3.method3584(false);
		this.aClass155_Sub1_3.method3613(0);
		this.aClass155_Sub1_3.method3620();
		this.aClass155_Sub1_3.method3585(null);
		Static7.aFloatArray1[0] = (float) 1024 / ((float) this.anInt134 * 128.0F * (float) this.aClass155_Sub1_3.anInt3849);
		Static7.aFloatArray1[1] = 0.0F;
		Static7.aFloatArray1[2] = 0.0F;
		Static7.aFloatArray1[3] = 0.0F;
		Static7.aFloatArray1[4] = 0.0F;
		Static7.aFloatArray1[5] = (float) 1024 / ((float) this.anInt134 * 128.0F * (float) this.aClass155_Sub1_3.anInt3843);
		Static7.aFloatArray1[6] = 0.0F;
		Static7.aFloatArray1[7] = 0.0F;
		Static7.aFloatArray1[8] = 0.0F;
		Static7.aFloatArray1[9] = 0.0F;
		Static7.aFloatArray1[10] = 0.0F;
		Static7.aFloatArray1[11] = 0.0F;
		Static7.aFloatArray1[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass155_Sub1_3.anInt3849;
		Static7.aFloatArray1[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass155_Sub1_3.anInt3843;
		Static7.aFloatArray1[14] = 0.0F;
		Static7.aFloatArray1[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static7.aFloatArray1, 0);
		Static7.aFloatArray1[0] = 1.0F;
		Static7.aFloatArray1[1] = 0.0F;
		Static7.aFloatArray1[2] = 0.0F;
		Static7.aFloatArray1[3] = 0.0F;
		Static7.aFloatArray1[4] = 0.0F;
		Static7.aFloatArray1[5] = 0.0F;
		Static7.aFloatArray1[6] = 1.0F;
		Static7.aFloatArray1[7] = 0.0F;
		Static7.aFloatArray1[8] = 0.0F;
		Static7.aFloatArray1[9] = 1.0F;
		Static7.aFloatArray1[10] = 0.0F;
		Static7.aFloatArray1[11] = 0.0F;
		Static7.aFloatArray1[12] = 0.0F;
		Static7.aFloatArray1[13] = 0.0F;
		Static7.aFloatArray1[14] = 0.0F;
		Static7.aFloatArray1[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static7.aFloatArray1, 0);
		if ((this.anInt136 & 0x7) == 0) {
			this.aClass155_Sub1_3.method3568(false);
		} else {
			this.aClass155_Sub1_3.method3568(true);
			this.aClass155_Sub1_3.method3636();
		}
		this.aClass155_Sub1_3.method3626(this.aClass88_2, this.aClass88_3, this.aClass88_4, this.aClass88_1);
		if (Static7.aClass3_Sub5_1.aByteArray42.length < this.anInt137 * 2) {
			Static7.aClass3_Sub5_1 = new Class3_Sub5(this.anInt137 * 2);
		} else {
			Static7.aClass3_Sub5_1.anInt3121 = 0;
		}
		@Pc(288) int local288 = 0;
		@Pc(294) int local294;
		@Pc(304) int local304;
		@Pc(306) int local306;
		@Pc(324) short[] local324;
		@Pc(328) int local328;
		if (this.aClass155_Sub1_3.aBoolean298) {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt6380 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray1[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static7.aClass3_Sub5_1.method2749(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		} else {
			for (local294 = arg1; local294 < arg3; local294++) {
				local304 = local294 * this.anInt6380 + arg0;
				for (local306 = arg0; local306 < arg2; local306++) {
					if (arg4[local306 - arg0][local294 - arg1]) {
						local324 = this.aShortArrayArray1[local304];
						if (local324 != null) {
							for (local328 = 0; local328 < local324.length; local328++) {
								Static7.aClass3_Sub5_1.method2729(local324[local328] & 0xFFFF);
								local288++;
							}
						}
					}
					local304++;
				}
			}
		}
		if (local288 > 0) {
			@Pc(418) Class109_Sub1 local418 = new Class109_Sub1(this.aClass155_Sub1_3, 5123, Static7.aClass3_Sub5_1.aByteArray42, Static7.aClass3_Sub5_1.anInt3121);
			this.aClass155_Sub1_3.method3616(local418, 0, local288);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass3_Sub44Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass155_Sub1_3.aFloat43;
		@Pc(10) float local10 = this.aClass155_Sub1_3.aFloat37;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static7.anIntArray16.length < local20) {
			Static7.anIntArray16 = new int[local20];
		}
		if (Static7.aClass3_Sub5_1.aByteArray42.length < this.anInt137 * 2) {
			Static7.aClass3_Sub5_1 = new Class3_Sub5(this.anInt137 * 2);
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
		if (local67 > this.anInt6380 - 1) {
			local67 = this.anInt6380 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt6381 - 1) {
			local82 = this.anInt6381 - 1;
		}
		Static7.anInt135 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static7.anIntArray16[Static7.anInt135++] = local108 * this.anInt6380 + local97;
				}
			}
		}
		this.aClass155_Sub1_3.method3576();
		this.aClass155_Sub1_3.method3568((this.anInt136 & 0x7) != 0);
		for (local97 = 0; local97 < this.aClass3_Sub44Array1.length; local97++) {
			this.aClass3_Sub44Array1[local97].method5709(Static7.anInt135, Static7.anIntArray16);
		}
		if (!this.aClass138_2.method3059()) {
			local97 = this.aClass155_Sub1_3.anInt3855;
			@Pc(180) int local180 = this.aClass155_Sub1_3.anInt3879;
			this.aClass155_Sub1_3.method4915(0, local180);
			this.aClass155_Sub1_3.method4856(local10, local6 - 4.0F);
			this.aClass155_Sub1_3.method3568(false);
			this.aClass155_Sub1_3.method3584(false);
			this.aClass155_Sub1_3.method3613(130);
			this.aClass155_Sub1_3.method3620();
			this.aClass155_Sub1_3.method3585(this.aClass155_Sub1_3.aClass30_Sub3_3);
			this.aClass155_Sub1_3.method3610(8448, 7681);
			this.aClass155_Sub1_3.method3624(0, 34166, 770);
			this.aClass155_Sub1_3.method3635(0, 34167);
			for (@Pc(236) Class3 local236 = this.aClass138_2.method3051(); local236 != null; local236 = this.aClass138_2.method3050()) {
				@Pc(241) Class3_Sub21 local241 = (Class3_Sub21) local236;
				local241.method2533(arg1, arg3, arg0, arg2);
			}
			this.aClass155_Sub1_3.method3624(0, 5890, 768);
			this.aClass155_Sub1_3.method3635(0, 5890);
			this.aClass155_Sub1_3.method3585(null);
			this.aClass155_Sub1_3.method4915(local97, local180);
		}
		if (this.aClass208_1 != null) {
			this.aClass155_Sub1_3.method4856(local10, local6 - 8.0F);
			this.aClass155_Sub1_3.method3576();
			this.aClass155_Sub1_3.method3626(this.aClass88_2, null, null, this.aClass88_1);
			this.aClass208_1.method4710(arg3, arg4, arg1, arg2, arg0);
		}
		this.aClass155_Sub1_3.method4856(local10, local6);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!eo;[I)V")
	@Override
	public void method5645(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass138_2.method3053(new Class3_Sub21(this.aClass155_Sub1_3, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!tm;IIIIZ)V")
	@Override
	public void method5642(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass208_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass155_Sub1_3.anInt3856 >> 8) >> this.aClass155_Sub1_3.anInt3848;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass155_Sub1_3.anInt3869 >> 8) >> this.aClass155_Sub1_3.anInt3848;
			this.aClass208_1.method4712(local33, local19, arg0);
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)V")
	@Override
	public void method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.method5649(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lclient!tm;IIIIZ)Z")
	@Override
	public boolean method5643(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass208_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass155_Sub1_3.anInt3856 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass155_Sub1_3.anInt3869 >> 8) >> 3;
			return this.aClass208_1.method4704(arg0, local30, local18);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	@Override
	public void method5637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!gr;II)V")
	private void method126(@OriginalArg(0) Class3_Sub7_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray2[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static7.anIntArray15.length < local16) {
			Static7.anIntArray15 = new int[local16];
			Static7.anIntArray17 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static7.anIntArray15[local28] = (local6[local28] & 0xFF) >> this.aClass155_Sub1_3.anInt3848;
			Static7.anIntArray17[local28] = (local13[local28] & 0xFF) >> this.aClass155_Sub1_3.anInt3848;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static7.anIntArray15[local28];
			@Pc(71) int local71 = Static7.anIntArray17[local28++];
			@Pc(75) int local75 = Static7.anIntArray15[local28];
			@Pc(80) int local80 = Static7.anIntArray17[local28++];
			@Pc(84) int local84 = Static7.anIntArray15[local28];
			@Pc(89) int local89 = Static7.anIntArray17[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method1976(local66, local84, local75, local89, local71, local80);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	@Override
	public int method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt133;
		@Pc(9) int local9 = arg1 >> this.anInt133;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt6380 - 1 || local9 > this.anInt6381 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt134 - 1;
		@Pc(41) int local41 = arg1 & this.anInt134 - 1;
		@Pc(67) int local67 = this.anIntArrayArray2[local4][local9] * (this.anInt134 - local34) + this.anIntArrayArray2[local4 + 1][local9] * local34 >> this.anInt133;
		@Pc(97) int local97 = this.anIntArrayArray2[local4][local9 + 1] * (this.anInt134 - local34) + this.anIntArrayArray2[local4 + 1][local9 + 1] * local34 >> this.anInt133;
		return local67 * (this.anInt134 - local41) + local97 * local41 >> this.anInt133;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
	@Override
	public int method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(Lclient!tm;IIIIZ)V")
	@Override
	public void method5646(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass208_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass155_Sub1_3.anInt3856 >> 8) >> this.aClass155_Sub1_3.anInt3848;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass155_Sub1_3.anInt3869 >> 8) >> this.aClass155_Sub1_3.anInt3848;
			this.aClass208_1.method4705(local33, arg0, local19);
		}
	}
}
