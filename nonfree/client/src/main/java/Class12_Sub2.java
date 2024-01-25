import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
	private int anInt3169;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
	private int anInt3172;

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "Lclient!gm;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "[Lclient!md;")
	private Class1_Sub24[] aClass1_Sub24Array1;

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "Lclient!na;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!kk", name = "L", descriptor = "Lclient!gm;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "Lclient!gm;")
	private Class84 aClass84_3;

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
	private int anInt3176;

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "Lclient!gm;")
	private Class84 aClass84_4;

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "Lclient!gm;")
	private Class84 aClass84_5;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Lclient!ar;")
	private final Class14 aClass14_11 = new Class14();

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "Lclient!nf;")
	public final Class105_Sub1 aClass105_Sub1_20;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "[[I")
	private final int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!kk", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
	public final int anInt3173;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	public int anInt3170;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	public final int anInt3171;

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "[[[Lclient!md;")
	private Class1_Sub24[][][] aClass1_Sub24ArrayArrayArray1;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "[[B")
	private final byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!kk", name = "R", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!kk", name = "S", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!kk", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "Lclient!vk;")
	private Class207 aClass207_23;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!om;")
	private Class152 aClass152_2;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!nf;IIII[[I[[II)V")
	public Class12_Sub2(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass105_Sub1_20 = arg0;
		this.anIntArrayArray28 = arg5;
		this.anIntArrayArray29 = arg6;
		this.anInt3173 = arg2;
		while (arg7 > 1) {
			this.anInt3170++;
			arg7 >>= 0x1;
		}
		this.anInt3171 = 0x1 << this.anInt3170;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aClass1_Sub24ArrayArrayArray1 = new Class1_Sub24[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aShortArrayArray10 = new short[arg3 * arg4][];
		this.aByteArrayArray9 = new byte[arg3][arg4];
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray3 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[arg3 + 1][arg4 + 1];
		for (@Pc(119) int local119 = 1; local119 < arg4; local119++) {
			for (@Pc(124) int local124 = 1; local124 < arg3; local124++) {
				@Pc(145) int local145 = this.anIntArrayArray28[local124 + 1][local119] - this.anIntArrayArray28[local124 - 1][local119];
				@Pc(163) int local163 = this.anIntArrayArray28[local124][local119 + 1] - this.anIntArrayArray28[local124][local119 - 1];
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local145 * local145 + local163 * local163 + 65536)));
				this.aFloatArrayArray3[local124][local119] = (float) local145 * local178;
				this.aFloatArrayArray4[local124][local119] = -256.0F * local178;
				this.aFloatArrayArray5[local124][local119] = (float) local163 * local178;
			}
		}
		this.aClass207_23 = new Class207(128);
		if ((this.anInt3173 & 0x10) != 0) {
			this.aClass152_2 = new Class152(this.aClass105_Sub1_20, this);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!wc;[I)V")
	@Override
	public void method2695(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass14_11.method300(new Class1_Sub27(this.aClass105_Sub1_20, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(Lclient!ri;IIIIZ)V")
	@Override
	public void method2706(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass152_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass105_Sub1_20.anInt4179 >> 8) >> this.aClass105_Sub1_20.anInt4173;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass105_Sub1_20.anInt4188 >> 8) >> this.aClass105_Sub1_20.anInt4173;
			this.aClass152_2.method4023(local19, local33, arg0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method2708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray10[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
	@Override
	public void method2701() {
		if (this.anInt3176 > 0) {
			@Pc(12) byte[][] local12 = new byte[this.anInt3162 + 1][this.anInt3163 + 1];
			@Pc(14) int local14;
			for (local14 = 1; local14 < this.anInt3162; local14++) {
				for (@Pc(20) int local20 = 1; local20 < this.anInt3163; local20++) {
					local12[local14][local20] = (byte) ((this.aByteArrayArray10[local14 - 1][local20] >> 2) + (this.aByteArrayArray10[local14 + 1][local20] >> 3) + (this.aByteArrayArray10[local14][local20 - 1] >> 2) + (this.aByteArrayArray10[local14][local20 + 1] >> 3) + (this.aByteArrayArray10[local14][local20] >> 1));
				}
			}
			this.aClass1_Sub24Array1 = new Class1_Sub24[this.aClass207_23.method5554()];
			this.aClass207_23.method5556(this.aClass1_Sub24Array1);
			for (local14 = 0; local14 < this.aClass1_Sub24Array1.length; local14++) {
				this.aClass1_Sub24Array1[local14].method3204(this.anInt3176);
			}
			local14 = 24;
			if (this.anIntArrayArray29 != null) {
				local14 += 4;
			}
			if ((this.anInt3173 & 0x7) != 0) {
				local14 += 12;
			}
			@Pc(137) ByteBuffer local137 = ByteBuffer.allocateDirect(this.anInt3176 * local14).order(ByteOrder.nativeOrder());
			@Pc(141) Class1_Sub24[] local141 = new Class1_Sub24[this.anInt3176];
			@Pc(149) Class207 local149 = new Class207(Static351.method3411(this.anInt3176));
			@Pc(153) Class1_Sub24[] local153 = new Class1_Sub24[this.anInt3175];
			@Pc(155) int local155;
			@Pc(161) int local161;
			for (local155 = 0; local155 < this.anInt3162; local155++) {
				for (local161 = 0; local161 < this.anInt3163; local161++) {
					if (this.anIntArrayArrayArray6[local155][local161] != null) {
						@Pc(180) Class1_Sub24[] local180 = this.aClass1_Sub24ArrayArrayArray1[local155][local161];
						@Pc(187) int[] local187 = this.anIntArrayArrayArray9[local155][local161];
						@Pc(194) int[] local194 = this.anIntArrayArrayArray8[local155][local161];
						@Pc(201) int[] local201 = this.anIntArrayArrayArray5[local155][local161];
						@Pc(208) int[] local208 = this.anIntArrayArrayArray7[local155][local161];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray6[local155][local161];
						if (local208 == null) {
							local208 = local215;
						}
						@Pc(226) float local226 = this.aFloatArrayArray3[local155][local161];
						@Pc(233) float local233 = this.aFloatArrayArray4[local155][local161];
						@Pc(240) float local240 = this.aFloatArrayArray5[local155][local161];
						@Pc(249) float local249 = this.aFloatArrayArray3[local155][local161 + 1];
						@Pc(258) float local258 = this.aFloatArrayArray4[local155][local161 + 1];
						@Pc(267) float local267 = this.aFloatArrayArray5[local155][local161 + 1];
						@Pc(278) float local278 = this.aFloatArrayArray3[local155 + 1][local161 + 1];
						@Pc(289) float local289 = this.aFloatArrayArray4[local155 + 1][local161 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray5[local155 + 1][local161 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray3[local155 + 1][local161];
						@Pc(318) float local318 = this.aFloatArrayArray4[local155 + 1][local161];
						@Pc(327) float local327 = this.aFloatArrayArray5[local155 + 1][local161];
						@Pc(335) int local335 = local12[local155][local161] & 0xFF;
						@Pc(345) int local345 = local12[local155][local161 + 1] & 0xFF;
						@Pc(357) int local357 = local12[local155 + 1][local161 + 1] & 0xFF;
						@Pc(367) int local367 = local12[local155 + 1][local161] & 0xFF;
						@Pc(378) float local378;
						@Pc(388) float local388;
						@Pc(400) float local400;
						@Pc(410) float local410;
						if (this.anIntArrayArray29 == null) {
							local410 = 0.0F;
							local400 = 0.0F;
							local388 = 0.0F;
							local378 = 0.0F;
						} else {
							local378 = this.anIntArrayArray29[local155][local161];
							local388 = this.anIntArrayArray29[local155][local161 + 1];
							local400 = this.anIntArrayArray29[local155 + 1][local161 + 1];
							local410 = this.anIntArrayArray29[local155 + 1][local161];
						}
						@Pc(421) int local421 = 0;
						@Pc(433) int local433;
						label303: for (@Pc(423) int local423 = 0; local423 < local215.length; local423++) {
							@Pc(431) Class1_Sub24 local431 = local180[local423];
							for (local433 = 0; local433 < local421; local433++) {
								if (local153[local433] == local431) {
									continue label303;
								}
							}
							local153[local421++] = local431;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray10[local161 * this.anInt3162 + local155] = new short[local215.length];
						for (@Pc(467) int local467 = 0; local467 < local215.length; local467++) {
							@Pc(480) int local480 = (local155 << this.anInt3170) + local194[local467];
							@Pc(489) int local489 = (local161 << this.anInt3170) + local201[local467];
							@Pc(493) int local493 = local215[local467];
							@Pc(497) int local497 = local208[local467];
							@Pc(505) int local505 = local187 == null ? 0 : local187[local467];
							@Pc(523) long local523 = (long) local497 << 48 | (long) local493 << 32 | (long) (local480 << 16) | (long) local489;
							@Pc(527) int local527 = local194[local467];
							@Pc(531) int local531 = local201[local467];
							@Pc(535) int local535 = 0;
							@Pc(537) float local537 = 1.0F;
							@Pc(553) int local553;
							@Pc(543) float local543;
							@Pc(545) float local545;
							@Pc(547) float local547;
							@Pc(549) float local549;
							@Pc(643) float local643;
							if (local527 == 0 && local531 == 0) {
								local543 = local226;
								local545 = local233;
								local547 = local240;
								local549 = local378;
								local553 = 74 - local335;
							} else if (local527 == 0 && local531 == this.anInt3171) {
								local543 = local249;
								local545 = local258;
								local547 = local267;
								local549 = local388;
								local553 = 74 - local345;
							} else if (local527 == this.anInt3171 && local531 == this.anInt3171) {
								local543 = local278;
								local545 = local289;
								local547 = local300;
								local549 = local400;
								local553 = 74 - local357;
							} else if (local527 == this.anInt3171 && local531 == 0) {
								local543 = local309;
								local545 = local318;
								local547 = local327;
								local549 = local410;
								local553 = 74 - local367;
							} else {
								@Pc(620) float local620 = (float) local527 / (float) this.anInt3171;
								@Pc(627) float local627 = (float) local531 / (float) this.anInt3171;
								@Pc(635) float local635 = local226 + (local309 - local226) * local620;
								local643 = local233 + (local318 - local233) * local620;
								@Pc(651) float local651 = local240 + (local327 - local240) * local620;
								@Pc(659) float local659 = local249 + (local278 - local249) * local620;
								@Pc(667) float local667 = local258 + (local289 - local258) * local620;
								@Pc(675) float local675 = local267 + (local300 - local267) * local620;
								local543 = local635 + (local659 - local635) * local627;
								local545 = local643 + (local667 - local643) * local627;
								local547 = local651 + (local675 - local651) * local627;
								@Pc(710) int local710 = local335 + ((local367 - local335) * local527 >> this.anInt3170);
								@Pc(721) int local721 = local345 + ((local357 - local345) * local527 >> this.anInt3170);
								local553 = 74 - local710 - ((local721 - local710) * local531 >> this.anInt3170);
								@Pc(742) float local742 = local378 + (local410 - local378) * local620;
								@Pc(750) float local750 = local388 + (local400 - local388) * local620;
								local549 = local742 + (local750 - local742) * local627;
							}
							if (local493 != -1) {
								@Pc(769) int local769 = (local493 & 0x7F) * local553 >> 7;
								if (local769 < 2) {
									local769 = 2;
								} else if (local769 > 126) {
									local769 = 126;
								}
								local535 = Static77.anIntArray118[local493 & 0xFF80 | local769];
								if ((this.anInt3173 & 0x7) == 0) {
									local537 = this.aClass105_Sub1_20.aFloatArray12[0] * local543 + this.aClass105_Sub1_20.aFloatArray12[1] * local545 + this.aClass105_Sub1_20.aFloatArray12[2] * local547;
									local537 = this.aClass105_Sub1_20.aFloat38 + local537 * (local537 > 0.0F ? this.aClass105_Sub1_20.aFloat36 : this.aClass105_Sub1_20.aFloat52);
								}
							}
							@Pc(840) Class1 local840 = local149.method5555(local523);
							@Pc(872) int local872;
							if (local840 == null) {
								if (local497 == local493) {
									local872 = local535;
								} else {
									@Pc(853) int local853 = (local497 & 0x7F) * local553 >> 7;
									if (local853 < 2) {
										local853 = 2;
									} else if (local853 > 126) {
										local853 = 126;
									}
									local872 = Static77.anIntArray118[local497 & 0xFF80 | local853];
									if ((this.anInt3173 & 0x7) == 0) {
										@Pc(900) float local900 = this.aClass105_Sub1_20.aFloatArray12[0] * local543 + this.aClass105_Sub1_20.aFloatArray12[1] * local545 + this.aClass105_Sub1_20.aFloatArray12[2] * local547;
										local643 = this.aClass105_Sub1_20.aFloat38 + local537 * (local537 > 0.0F ? this.aClass105_Sub1_20.aFloat36 : this.aClass105_Sub1_20.aFloat52);
										@Pc(925) int local925 = local872 >> 16 & 0xFF;
										@Pc(931) int local931 = local872 >> 8 & 0xFF;
										@Pc(935) int local935 = local872 & 0xFF;
										local925 = (int) ((float) local925 * local643);
										if (local925 < 0) {
											local925 = 0;
										} else if (local925 > 255) {
											local925 = 255;
										}
										local931 = (int) ((float) local931 * local643);
										if (local931 < 0) {
											local931 = 0;
										} else if (local931 > 255) {
											local931 = 255;
										}
										local935 = (int) ((float) local935 * local643);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local872 = local925 << 16 | local931 << 8 | local935;
									}
								}
								local137.putFloat((float) local480);
								local137.putFloat((float) (this.method2698(local480, local489) + local505));
								local137.putFloat((float) local489);
								local137.putFloat((float) local480);
								local137.putFloat((float) local489);
								local137.put((byte) (local872 >> 16));
								local137.put((byte) (local872 >> 8));
								local137.put((byte) local872);
								local137.put((byte) -1);
								if ((this.anInt3173 & 0x7) != 0) {
									local137.putFloat(local543);
									local137.putFloat(local545);
									local137.putFloat(local547);
								}
								if (this.anIntArrayArray29 != null) {
									local137.putFloat(local549 + (float) local505);
								}
								local433 = this.anInt3169++;
								local465[local467] = (short) local433;
								if (local493 != -1) {
									local141[local433] = local180[local467];
								}
								local149.method5552(new Class1_Sub36(local465[local467]), local523);
							} else {
								local465[local467] = ((Class1_Sub36) local840).aShort75;
								local433 = local465[local467] & 0xFFFF;
								if (local493 != -1 && local180[local467].aLong214 < local141[local433].aLong214) {
									local141[local433] = local180[local467];
								}
							}
							for (local872 = 0; local872 < local421; local872++) {
								local153[local872].method3205(local535, local537, local553, local433);
							}
							this.anInt3172++;
						}
					}
				}
			}
			for (local155 = 0; local155 < this.anInt3169; local155++) {
				@Pc(1178) Class1_Sub24 local1178 = local141[local155];
				if (local1178 != null) {
					local1178.method3208(local155);
				}
			}
			for (local155 = 0; local155 < this.anInt3162; local155++) {
				for (local161 = 0; local161 < this.anInt3163; local161++) {
					@Pc(1208) short[] local1208 = this.aShortArrayArray10[local161 * this.anInt3162 + local155];
					if (local1208 != null) {
						@Pc(1212) int local1212 = 0;
						@Pc(1214) int local1214 = 0;
						while (local1214 < local1208.length) {
							@Pc(1225) int local1225 = local1208[local1214++] & 0xFFFF;
							@Pc(1232) int local1232 = local1208[local1214++] & 0xFFFF;
							@Pc(1239) int local1239 = local1208[local1214++] & 0xFFFF;
							@Pc(1243) Class1_Sub24 local1243 = local141[local1225];
							@Pc(1247) Class1_Sub24 local1247 = local141[local1232];
							@Pc(1251) Class1_Sub24 local1251 = local141[local1239];
							@Pc(1253) Class1_Sub24 local1253 = null;
							if (local1243 != null) {
								local1243.method3207(local155, local161, local1212);
								local1253 = local1243;
							}
							if (local1247 != null) {
								local1247.method3207(local155, local161, local1212);
								if (local1253 == null || local1247.aLong214 < local1253.aLong214) {
									local1253 = local1247;
								}
							}
							if (local1251 != null) {
								local1251.method3207(local155, local161, local1212);
								if (local1253 == null || local1251.aLong214 < local1253.aLong214) {
									local1253 = local1251;
								}
							}
							if (local1253 != null) {
								if (local1243 != null) {
									local1253.method3208(local1225);
								}
								if (local1247 != null) {
									local1253.method3208(local1232);
								}
								if (local1251 != null) {
									local1253.method3208(local1239);
								}
								local1253.method3207(local155, local161, local1212);
							}
							local1212++;
						}
					}
				}
			}
			local137.flip();
			this.anInterface9_2 = this.aClass105_Sub1_20.method3564(local14, local137);
			local155 = 24;
			this.aClass84_2 = new Class84(this.aClass105_Sub1_20, this.anInterface9_2, 5126, 3, 0);
			this.aClass84_1 = new Class84(this.aClass105_Sub1_20, this.anInterface9_2, 5126, 2, 12);
			this.aClass84_3 = new Class84(this.aClass105_Sub1_20, this.anInterface9_2, 5121, 4, 20);
			if ((this.anInt3173 & 0x7) != 0) {
				this.aClass84_5 = new Class84(this.aClass105_Sub1_20, this.anInterface9_2, 5126, 3, 24);
				local155 += 12;
			}
			if (this.anIntArrayArray29 != null) {
				this.aClass84_4 = new Class84(this.aClass105_Sub1_20, this.anInterface9_2, 5126, 1, local155);
				local155 += 4;
			}
			@Pc(1419) long[] local1419 = new long[this.aClass1_Sub24Array1.length];
			for (@Pc(1421) int local1421 = 0; local1421 < this.aClass1_Sub24Array1.length; local1421++) {
				@Pc(1431) Class1_Sub24 local1431 = this.aClass1_Sub24Array1[local1421];
				local1419[local1421] = local1431.aLong214;
				local1431.method3206(this.anInt3169);
			}
			Static273.method4896(local1419, this.aClass1_Sub24Array1);
			if (this.aClass152_2 != null) {
				this.aClass152_2.method4026();
			}
		} else {
			this.aClass152_2 = null;
		}
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass1_Sub24ArrayArrayArray1 = null;
		this.anIntArrayArrayArray6 = null;
		this.aByteArrayArray10 = null;
		this.aClass207_23 = null;
		this.anIntArrayArray29 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray4 = this.aFloatArrayArray5 = null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(2) int local2 = arg8.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local2; local45++) {
			@Pc(52) int local52 = arg5[local45];
			@Pc(56) int local56 = arg6[local45];
			@Pc(60) int local60 = arg7[local45];
			local7[local43] = arg2[local52];
			local12[local43] = arg4[local52];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local52];
			}
			local43++;
			local7[local43] = arg2[local56];
			local12[local43] = arg4[local56];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local56];
			}
			local43++;
			local7[local43] = arg2[local60];
			local12[local43] = arg4[local60];
			local17[local43] = arg8[local45];
			local22[local43] = arg9[local45];
			local27[local43] = arg10[local45];
			local32[local43] = arg11[local45];
			if (arg3 != null) {
				local41[local43] = arg3[local60];
			}
			local43++;
		}
		this.method2700(arg0, arg1, local7, local41, local12, local17, local22, local27, local32, arg12, arg13, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!ri;)Lclient!ri;")
	@Override
	public Class1_Sub2_Sub5 method2693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub5 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(17) int local17 = this.anInt3171 >> this.aClass105_Sub1_20.anInt4173;
		@Pc(20) Class1_Sub2_Sub5_Sub1 local20 = (Class1_Sub2_Sub5_Sub1) arg2;
		@Pc(30) Class1_Sub2_Sub5_Sub1 local30;
		if (local20 != null && local20.method1701(local17, local17)) {
			local30 = local20;
			local20.method1699();
		} else {
			local30 = new Class1_Sub2_Sub5_Sub1(this.aClass105_Sub1_20, local17, local17);
		}
		local30.method1697(0, local17, 0, local17);
		this.method2712(local30, arg0, arg1);
		return local30;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		@Pc(45) Class1_Sub24[] local45 = this.aClass1_Sub24ArrayArrayArray1[arg0][arg1] = new Class1_Sub24[arg5.length];
		for (@Pc(47) int local47 = 0; local47 < arg5.length; local47++) {
			@Pc(73) long local73 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[local47] << 16) | (long) arg8[local47];
			@Pc(79) Class1 local79 = this.aClass207_23.method5555(local73);
			if (local79 == null) {
				local45[local47] = new Class1_Sub24(this, arg7[local47], arg8[local47], arg9, arg10);
				this.aClass207_23.method5552(local45[local47], local73);
			} else {
				local45[local47] = (Class1_Sub24) local79;
			}
		}
		if (arg11) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (arg5.length > this.anInt3175) {
			this.anInt3175 = arg5.length;
		}
		this.anInt3176 += arg5.length;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
	@Override
	public int method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt3170;
		@Pc(9) int local9 = arg1 >> this.anInt3170;
		if (local4 < 0 || local9 < 0 || local4 > this.anInt3162 - 1 || local9 > this.anInt3163 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt3171 - 1;
		@Pc(41) int local41 = arg1 & this.anInt3171 - 1;
		@Pc(67) int local67 = this.anIntArrayArray28[local4][local9] * (this.anInt3171 - local34) + this.anIntArrayArray28[local4 + 1][local9] * local34 >> this.anInt3170;
		@Pc(97) int local97 = this.anIntArrayArray28[local4][local9 + 1] * (this.anInt3171 - local34) + this.anIntArrayArray28[local4 + 1][local9 + 1] * local34 >> this.anInt3170;
		return local67 * (this.anInt3171 - local41) + local97 * local41 >> this.anInt3170;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2694(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3176 <= 0) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass105_Sub1_20.anOpengl1;
		this.aClass105_Sub1_20.method3596();
		this.aClass105_Sub1_20.method3594(false);
		this.aClass105_Sub1_20.method3570(false);
		this.aClass105_Sub1_20.method3621(false);
		this.aClass105_Sub1_20.method3589(false);
		this.aClass105_Sub1_20.method3603(0);
		this.aClass105_Sub1_20.method3613();
		this.aClass105_Sub1_20.method3591(null);
		Static155.aFloatArray4[0] = (float) 1024 / ((float) this.anInt3171 * 128.0F * (float) this.aClass105_Sub1_20.anInt4171);
		Static155.aFloatArray4[1] = 0.0F;
		Static155.aFloatArray4[2] = 0.0F;
		Static155.aFloatArray4[3] = 0.0F;
		Static155.aFloatArray4[4] = 0.0F;
		Static155.aFloatArray4[5] = (float) 1024 / ((float) this.anInt3171 * 128.0F * (float) this.aClass105_Sub1_20.anInt4172);
		Static155.aFloatArray4[6] = 0.0F;
		Static155.aFloatArray4[7] = 0.0F;
		Static155.aFloatArray4[8] = 0.0F;
		Static155.aFloatArray4[9] = 0.0F;
		Static155.aFloatArray4[10] = 0.0F;
		Static155.aFloatArray4[11] = 0.0F;
		Static155.aFloatArray4[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass105_Sub1_20.anInt4171;
		Static155.aFloatArray4[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass105_Sub1_20.anInt4172;
		Static155.aFloatArray4[14] = 0.0F;
		Static155.aFloatArray4[15] = 1.0F;
		local7.glMatrixMode(5889);
		local7.glLoadMatrixf(Static155.aFloatArray4, 0);
		Static155.aFloatArray4[0] = 1.0F;
		Static155.aFloatArray4[1] = 0.0F;
		Static155.aFloatArray4[2] = 0.0F;
		Static155.aFloatArray4[3] = 0.0F;
		Static155.aFloatArray4[4] = 0.0F;
		Static155.aFloatArray4[5] = 0.0F;
		Static155.aFloatArray4[6] = 1.0F;
		Static155.aFloatArray4[7] = 0.0F;
		Static155.aFloatArray4[8] = 0.0F;
		Static155.aFloatArray4[9] = 1.0F;
		Static155.aFloatArray4[10] = 0.0F;
		Static155.aFloatArray4[11] = 0.0F;
		Static155.aFloatArray4[12] = 0.0F;
		Static155.aFloatArray4[13] = 0.0F;
		Static155.aFloatArray4[14] = 0.0F;
		Static155.aFloatArray4[15] = 1.0F;
		local7.glMatrixMode(5888);
		local7.glLoadMatrixf(Static155.aFloatArray4, 0);
		this.aClass105_Sub1_20.method3567();
		this.aClass105_Sub1_20.method3611();
		this.aClass105_Sub1_20.method3569(this.aClass84_3);
		this.aClass105_Sub1_20.method3578(this.aClass84_2);
		this.aClass105_Sub1_20.method3625(0, this.aClass84_1);
		if ((this.anInt3173 & 0x7) == 0) {
			this.aClass105_Sub1_20.method3570(false);
		} else {
			this.aClass105_Sub1_20.method3582(this.aClass84_5);
			this.aClass105_Sub1_20.method3570(true);
		}
		if (Static155.aClass1_Sub21_3.aByteArray82.length < this.anInt3172 * 2) {
			Static155.aClass1_Sub21_3 = new Class1_Sub21(this.anInt3172 * 2);
		} else {
			Static155.aClass1_Sub21_3.anInt6611 = 0;
		}
		@Pc(301) int local301 = 0;
		@Pc(307) int local307;
		@Pc(317) int local317;
		@Pc(319) int local319;
		@Pc(337) short[] local337;
		@Pc(341) int local341;
		if (this.aClass105_Sub1_20.aBoolean316) {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt3162 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray10[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static155.aClass1_Sub21_3.method5698(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		} else {
			for (local307 = arg1; local307 < arg3; local307++) {
				local317 = local307 * this.anInt3162 + arg0;
				for (local319 = arg0; local319 < arg2; local319++) {
					if (arg4[local319 - arg0][local307 - arg1]) {
						local337 = this.aShortArrayArray10[local317];
						if (local337 != null) {
							for (local341 = 0; local341 < local337.length; local341++) {
								Static155.aClass1_Sub21_3.method5731(local337[local341]);
								local301++;
							}
						}
					}
					local317++;
				}
			}
		}
		if (local301 > 0) {
			this.aClass105_Sub1_20.anInterface8_5.method1583(Static155.aClass1_Sub21_3.aByteArray82, Static155.aClass1_Sub21_3.anInt6611);
			this.aClass105_Sub1_20.method3590(this.aClass105_Sub1_20.anInterface8_5, 0, local301);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I")
	@Override
	public int method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray28[arg0][arg1];
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!gr;II)V")
	private void method2712(@OriginalArg(0) Class1_Sub2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray5[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (Static155.anIntArray312.length < local16) {
			Static155.anIntArray312 = new int[local16];
			Static155.anIntArray310 = new int[local16];
		}
		@Pc(28) int local28;
		for (local28 = 0; local28 < local16; local28++) {
			Static155.anIntArray312[local28] = (local6[local28] & 0xFF) >> this.aClass105_Sub1_20.anInt4173;
			Static155.anIntArray310[local28] = (local13[local28] & 0xFF) >> this.aClass105_Sub1_20.anInt4173;
		}
		local28 = 0;
		while (local28 < local16) {
			@Pc(66) int local66 = Static155.anIntArray312[local28];
			@Pc(71) int local71 = Static155.anIntArray310[local28++];
			@Pc(75) int local75 = Static155.anIntArray312[local28];
			@Pc(80) int local80 = Static155.anIntArray310[local28++];
			@Pc(84) int local84 = Static155.anIntArray312[local28];
			@Pc(89) int local89 = Static155.anIntArray310[local28++];
			if ((local66 - local75) * (local80 - local89) - (local80 - local71) * (local84 - local75) > 0) {
				arg0.method1698(local80, local84, local89, local66, local75, local71);
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass1_Sub24Array1 == null) {
			return;
		}
		@Pc(6) float local6 = this.aClass105_Sub1_20.aFloat41;
		@Pc(10) float local10 = this.aClass105_Sub1_20.aFloat35;
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static155.anIntArray311.length < local20) {
			Static155.anIntArray311 = new int[local20];
		}
		if (Static155.aClass1_Sub21_3.aByteArray82.length < this.anInt3172 * 2) {
			Static155.aClass1_Sub21_3 = new Class1_Sub21(this.anInt3172 * 2);
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
		if (local67 > this.anInt3162 - 1) {
			local67 = this.anInt3162 - 1;
		}
		@Pc(82) int local82 = arg1 + arg2;
		if (local82 > this.anInt3163 - 1) {
			local82 = this.anInt3163 - 1;
		}
		Static155.anInt3174 = 0;
		@Pc(97) int local97;
		for (local97 = local47; local97 <= local67; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local49];
			for (@Pc(108) int local108 = local57; local108 <= local82; local108++) {
				if (local106[local108 - local59]) {
					Static155.anIntArray311[Static155.anInt3174++] = local108 * this.anInt3162 + local97;
				}
			}
		}
		this.aClass105_Sub1_20.method3561();
		this.aClass105_Sub1_20.method3611();
		this.aClass105_Sub1_20.method3578(this.aClass84_2);
		if (this.aClass84_4 != null) {
			this.aClass105_Sub1_20.method3625(1, this.aClass84_4);
		}
		this.aClass105_Sub1_20.method3625(0, this.aClass84_1);
		if ((this.anInt3173 & 0x7) == 0) {
			this.aClass105_Sub1_20.method3570(false);
		} else {
			this.aClass105_Sub1_20.method3582(this.aClass84_5);
			this.aClass105_Sub1_20.method3570(true);
		}
		for (local97 = 0; local97 < this.aClass1_Sub24Array1.length; local97++) {
			this.aClass1_Sub24Array1[local97].method3203(Static155.anIntArray311, Static155.anInt3174);
		}
		if (!this.aClass14_11.method308()) {
			local97 = this.aClass105_Sub1_20.anInt4195;
			@Pc(211) int local211 = this.aClass105_Sub1_20.anInt4208;
			this.aClass105_Sub1_20.method4281(0, local211);
			this.aClass105_Sub1_20.method4207(local10, local6 - 4.0F);
			this.aClass105_Sub1_20.method3570(false);
			this.aClass105_Sub1_20.method3589(false);
			this.aClass105_Sub1_20.method3603(130);
			this.aClass105_Sub1_20.method3613();
			this.aClass105_Sub1_20.method3591(this.aClass105_Sub1_20.aClass44_Sub1_6);
			this.aClass105_Sub1_20.method3562(8448, 7681);
			this.aClass105_Sub1_20.method3568(0, 34166, 770);
			this.aClass105_Sub1_20.method3628(0, 34167);
			for (@Pc(267) Class1 local267 = this.aClass14_11.method302(); local267 != null; local267 = this.aClass14_11.method313()) {
				@Pc(272) Class1_Sub27 local272 = (Class1_Sub27) local267;
				local272.method3259(arg2, arg1, arg0, arg3);
			}
			this.aClass105_Sub1_20.method3568(0, 5890, 768);
			this.aClass105_Sub1_20.method3628(0, 5890);
			this.aClass105_Sub1_20.method3591(null);
			this.aClass105_Sub1_20.method4281(local97, local211);
		}
		if (this.aClass152_2 != null) {
			this.aClass105_Sub1_20.method4207(local10, local6 - 8.0F);
			this.aClass105_Sub1_20.method3561();
			this.aClass105_Sub1_20.method3611();
			this.aClass105_Sub1_20.method3578(this.aClass84_2);
			this.aClass105_Sub1_20.method3625(0, this.aClass84_1);
			this.aClass152_2.method4020(arg3, arg1, arg2, arg0, arg4);
		}
		this.aClass105_Sub1_20.method4207(local10, local6);
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V")
	@Override
	public void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!ri;IIIIZ)V")
	@Override
	public void method2696(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass152_2 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass105_Sub1_20.anInt4179 >> 8) >> this.aClass105_Sub1_20.anInt4173;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass105_Sub1_20.anInt4188 >> 8) >> this.aClass105_Sub1_20.anInt4173;
			this.aClass152_2.method4027(arg0, local33, local19);
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lclient!ri;IIIIZ)Z")
	@Override
	public boolean method2702(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass152_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(18) int local18 = arg1 - (arg2 * this.aClass105_Sub1_20.anInt4179 >> 8) >> 3;
			@Pc(30) int local30 = arg3 - (arg2 * this.aClass105_Sub1_20.anInt4188 >> 8) >> 3;
			return this.aClass152_2.method4025(local30, local18, arg0);
		}
	}
}
