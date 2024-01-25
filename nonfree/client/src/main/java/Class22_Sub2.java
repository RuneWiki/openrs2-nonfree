import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!im", name = "v", descriptor = "I")
	private int anInt4463;

	@OriginalMember(owner = "client!im", name = "D", descriptor = "I")
	private int anInt4466;

	@OriginalMember(owner = "client!im", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!im", name = "gb", descriptor = "[Lclient!kja;")
	private Class5_Sub30[] aClass5_Sub30Array1;

	@OriginalMember(owner = "client!im", name = "S", descriptor = "I")
	private int anInt4472;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "Lclient!gn;")
	public Class147 aClass147_1;

	@OriginalMember(owner = "client!im", name = "db", descriptor = "Lclient!sfa;")
	private Interface25 anInterface25_3;

	@OriginalMember(owner = "client!im", name = "X", descriptor = "I")
	private int anInt4473;

	@OriginalMember(owner = "client!im", name = "Q", descriptor = "Lclient!sfa;")
	private Interface25 anInterface25_4;

	@OriginalMember(owner = "client!im", name = "o", descriptor = "F")
	private float aFloat60 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!im", name = "ab", descriptor = "F")
	private float aFloat61 = -3.4028235E38F;

	@OriginalMember(owner = "client!im", name = "F", descriptor = "Lclient!ef;")
	private final Class102 aClass102_32 = new Class102();

	@OriginalMember(owner = "client!im", name = "C", descriptor = "Lclient!kd;")
	public final Class57_Sub3 aClass57_Sub3_10;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "I")
	private final int anInt4464;

	@OriginalMember(owner = "client!im", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!im", name = "eb", descriptor = "I")
	private final int anInt4450;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!im", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "[[[Lclient!kja;")
	private Class5_Sub30[][][] aClass5_Sub30ArrayArrayArray1;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "I")
	public final int anInt4470;

	@OriginalMember(owner = "client!im", name = "cb", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!im", name = "T", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "[[B")
	private final byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!im", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!im", name = "O", descriptor = "Lclient!qha;")
	private Class291 aClass291_19;

	@OriginalMember(owner = "client!im", name = "U", descriptor = "Lclient!waa;")
	private Class377 aClass377_2;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!kd;IIII[[I[[II)V")
	public Class22_Sub2(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass57_Sub3_10 = arg0;
		this.anInt4464 = super.anInt9378 - 2;
		this.aFloatArrayArray6 = new float[super.anInt9376 + 1][super.anInt9375 + 1];
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		this.anInt4450 = 0x1 << this.anInt4464;
		this.aFloatArrayArray5 = new float[super.anInt9376 + 1][super.anInt9375 + 1];
		this.aFloatArrayArray7 = new float[super.anInt9376 + 1][super.anInt9375 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aClass5_Sub30ArrayArrayArray1 = new Class5_Sub30[arg3][arg4][];
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
		this.anInt4470 = arg2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aByteArrayArray9 = new byte[arg3][arg4];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt9375; local121++) {
			for (@Pc(127) int local127 = 0; super.anInt9376 >= local127; local127++) {
				@Pc(136) int local136 = super.anIntArrayArray52[local127][local121];
				if ((float) local136 > this.aFloat61) {
					this.aFloat61 = (float) local136;
				}
				if ((float) local136 < this.aFloat60) {
					this.aFloat60 = (float) local136;
				}
				if (local127 > 0 && local121 > 0 && super.anInt9376 > local127 && local121 < super.anInt9375) {
					@Pc(202) int local202 = arg6[local127 + 1][local121] - arg6[local127 - 1][local121];
					@Pc(219) int local219 = arg6[local127][local121 + 1] - arg6[local127][local121 - 1];
					@Pc(238) float local238 = (float) (1.0D / Math.sqrt((double) (local202 * local202 + arg7 * 4 * arg7 + local219 * local219)));
					this.aFloatArrayArray5[local127][local121] = (float) local202 * local238;
					this.aFloatArrayArray6[local127][local121] = (float) (-arg7 * 2) * local238;
					this.aFloatArrayArray7[local127][local121] = local238 * (float) local219;
				}
			}
		}
		this.aFloat61++;
		this.aFloat60--;
		this.aClass291_19 = new Class291(128);
		if ((this.anInt4470 & 0x10) != 0) {
			this.aClass377_2 = new Class377(this.aClass57_Sub3_10, this);
		}
	}

	@OriginalMember(owner = "client!im", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9376][super.anInt9375][];
		}
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9376][super.anInt9375][];
		}
		@Pc(41) Interface1 local41 = this.aClass57_Sub3_10.anInterface1_11;
		this.anIntArrayArrayArray12[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg3;
		}
		@Pc(104) Class5_Sub30[] local104 = this.aClass5_Sub30ArrayArrayArray1[arg0][arg1] = new Class5_Sub30[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt4470 & 0x20) != 0 && local114 != -1 && local41.method2863(local114).aBoolean482) {
				local114 = -1;
				local118 = 128;
			}
			@Pc(163) long local163 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (local118 << 14) | (long) local114;
			@Pc(169) Class5 local169;
			for (local169 = this.aClass291_19.method6993(local163, 1); local169 != null; local169 = this.aClass291_19.method6985(-107)) {
				@Pc(176) Class5_Sub30 local176 = (Class5_Sub30) local169;
				if (local114 == local176.anInt5547 && (float) local118 == local176.aFloat85 && local176.anInt5553 == arg10 && local176.anInt5558 == arg11 && arg12 == local176.anInt5561) {
					break;
				}
			}
			if (local169 == null) {
				local104[local106] = new Class5_Sub30(this, local114, local118, arg10, arg11, arg12);
				this.aClass291_19.method6984(local163, local104[local106]);
			} else {
				local104[local106] = (Class5_Sub30) local169;
			}
		}
		if (arg13) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4473) {
			this.anInt4473 = arg6.length;
		}
		this.anInt4472 += arg6.length;
	}

	@OriginalMember(owner = "client!im", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt4472 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9376 + 1][super.anInt9375 + 1];
			for (@Pc(23) int local23 = 1; local23 < super.anInt9376; local23++) {
				for (@Pc(29) int local29 = 1; super.anInt9375 > local29; local29++) {
					local21[local23][local29] = (byte) ((this.aByteArrayArray10[local23][local29] >> 1) + (this.aByteArrayArray10[local23][local29 - 1] >> 2) + (this.aByteArrayArray10[local23 - 1][local29] >> 2) + (this.aByteArrayArray10[local23 - -1][local29] >> 3) + (this.aByteArrayArray10[local23][local29 + 1] >> 3));
				}
			}
			@Pc(115) Class5_Sub30[] local115 = new Class5_Sub30[this.aClass291_19.method6995()];
			this.aClass291_19.method6990(local115);
			for (@Pc(125) int local125 = 0; local125 < local115.length; local125++) {
				local115[local125].method4759(this.anInt4472);
			}
			@Pc(143) int local143 = 20;
			if (this.anIntArrayArrayArray14 != null) {
				local143 += 4;
			}
			if ((this.anInt4470 & 0x7) != 0) {
				local143 += 12;
			}
			@Pc(172) NativeHeapBuffer local172 = this.aClass57_Sub3_10.aNativeHeap6.a(this.anInt4472 * 4, false);
			@Pc(182) NativeHeapBuffer local182 = this.aClass57_Sub3_10.aNativeHeap6.a(local143 * this.anInt4472, false);
			@Pc(187) Stream local187 = new Stream(local182);
			@Pc(192) Stream local192 = new Stream(local172);
			@Pc(196) Class5_Sub30[] local196 = new Class5_Sub30[this.anInt4472];
			@Pc(203) int local203 = Static228.method3242(this.anInt4472 / 4);
			if (local203 < 1) {
				local203 = 1;
			}
			@Pc(215) Class291 local215 = new Class291(local203);
			@Pc(219) Class5_Sub30[] local219 = new Class5_Sub30[this.anInt4473];
			@Pc(225) int local225;
			for (@Pc(221) int local221 = 0; super.anInt9376 > local221; local221++) {
				for (local225 = 0; super.anInt9375 > local225; local225++) {
					if (this.anIntArrayArrayArray10[local221][local225] != null) {
						@Pc(243) Class5_Sub30[] local243 = this.aClass5_Sub30ArrayArrayArray1[local221][local225];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray12[local221][local225];
						@Pc(257) int[] local257 = this.anIntArrayArrayArray13[local221][local225];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray11[local221][local225];
						@Pc(271) int[] local271 = this.anIntArrayArrayArray10[local221][local225];
						@Pc(284) int[] local284 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local221][local225];
						if (local264 == null) {
							local264 = local271;
						}
						@Pc(301) int[] local301 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local221][local225];
						@Pc(308) float local308 = this.aFloatArrayArray5[local221][local225];
						@Pc(315) float local315 = this.aFloatArrayArray6[local221][local225];
						@Pc(322) float local322 = this.aFloatArrayArray7[local221][local225];
						@Pc(331) float local331 = this.aFloatArrayArray5[local221][local225 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray6[local221][local225 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray7[local221][local225 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray5[local221 + 1][local225 + 1];
						@Pc(371) float local371 = this.aFloatArrayArray6[local221 + 1][local225 + 1];
						@Pc(382) float local382 = this.aFloatArrayArray7[local221 + 1][local225 + 1];
						@Pc(391) float local391 = this.aFloatArrayArray5[local221 + 1][local225];
						@Pc(400) float local400 = this.aFloatArrayArray6[local221 + 1][local225];
						@Pc(409) float local409 = this.aFloatArrayArray7[local221 + 1][local225];
						@Pc(417) int local417 = local21[local221][local225] & 0xFF;
						@Pc(427) int local427 = local21[local221][local225 + 1] & 0xFF;
						@Pc(439) int local439 = local21[local221 + 1][local225 + 1] & 0xFF;
						@Pc(449) int local449 = local21[local221 + 1][local225] & 0xFF;
						@Pc(451) int local451 = 0;
						@Pc(461) int local461;
						label355: for (@Pc(453) int local453 = 0; local453 < local271.length; local453++) {
							@Pc(459) Class5_Sub30 local459 = local243[local453];
							for (local461 = 0; local461 < local451; local461++) {
								if (local219[local461] == local459) {
									continue label355;
								}
							}
							local219[local451++] = local459;
						}
						@Pc(516) short[] local516 = this.aShortArrayArray5[local221 + local225 * super.anInt9376] = new short[local271.length];
						for (local461 = 0; local461 < local271.length; local461++) {
							@Pc(530) int local530 = (local221 << super.anInt9378) + local250[local461];
							@Pc(540) int local540 = (local225 << super.anInt9378) + local257[local461];
							@Pc(545) int local545 = local530 >> this.anInt4464;
							@Pc(550) int local550 = local540 >> this.anInt4464;
							@Pc(554) int local554 = local271[local461];
							@Pc(558) int local558 = local264[local461];
							@Pc(567) int local567 = local284 == null ? 0 : local284[local461];
							@Pc(585) long local585 = (long) local550 | (long) local554 << 32 | (long) local558 << 48 | (long) (local545 << 16);
							@Pc(589) int local589 = local250[local461];
							@Pc(593) int local593 = local257[local461];
							@Pc(595) byte local595 = 74;
							@Pc(597) int local597 = 0;
							@Pc(599) float local599 = 1.0F;
							@Pc(618) float local618;
							@Pc(612) float local612;
							@Pc(610) float local610;
							@Pc(703) float local703;
							@Pc(616) int local616;
							if (local589 == 0 && local593 == 0) {
								local610 = local322;
								local612 = local315;
								local616 = local595 - local417;
								local618 = local308;
							} else if (local589 == 0 && local593 == super.anInt9377) {
								local610 = local349;
								local616 = local595 - local427;
								local618 = local331;
								local612 = local340;
							} else if (local589 == super.anInt9377 && super.anInt9377 == local593) {
								local612 = local371;
								local618 = local360;
								local610 = local382;
								local616 = local595 - local439;
							} else if (super.anInt9377 == local589 && local593 == 0) {
								local618 = local391;
								local610 = local409;
								local616 = local595 - local449;
								local612 = local400;
							} else {
								@Pc(678) float local678 = (float) local589 / (float) super.anInt9377;
								@Pc(685) float local685 = (float) local593 / (float) super.anInt9377;
								@Pc(694) float local694 = (local391 - local308) * local678 + local308;
								local703 = (local400 - local315) * local678 + local315;
								@Pc(711) float local711 = (local409 - local322) * local678 + local322;
								@Pc(719) float local719 = (local360 - local331) * local678 + local331;
								@Pc(728) float local728 = local678 * (local371 - local340) + local340;
								local618 = local694 + (local719 - local694) * local685;
								@Pc(744) float local744 = local349 + local678 * (local382 - local349);
								local612 = local685 * (local728 - local703) + local703;
								local610 = local711 + (local744 - local711) * local685;
								@Pc(774) int local774 = local417 + ((local449 - local417) * local589 >> super.anInt9378);
								@Pc(786) int local786 = local427 + ((local439 - local427) * local589 >> super.anInt9378);
								local616 = local595 - ((local786 - local774) * local593 >> super.anInt9378) - local774;
							}
							if (local554 != -1) {
								@Pc(835) int local835 = (local554 & 0x7F) * local616 >> 7;
								if (local835 < 2) {
									local835 = 2;
								} else if (local835 > 126) {
									local835 = 126;
								}
								local597 = Static560.anIntArray534[local554 & 0xFF80 | local835];
								if ((this.anInt4470 & 0x7) == 0) {
									local599 = this.aClass57_Sub3_10.aFloatArray92[0] * local618 + local612 * this.aClass57_Sub3_10.aFloatArray92[1] + local610 * this.aClass57_Sub3_10.aFloatArray92[2];
									local599 = this.aClass57_Sub3_10.aFloat171 + local599 * (local599 > 0.0F ? this.aClass57_Sub3_10.aFloat174 : this.aClass57_Sub3_10.aFloat167);
								}
							}
							@Pc(912) Class5 local912 = null;
							if ((this.anInt4450 - 1 & local530) == 0 && (local540 & this.anInt4450 - 1) == 0) {
								local912 = local215.method6993(local585, 1);
							}
							@Pc(1287) int local1287;
							@Pc(946) int local946;
							if (local912 == null) {
								if (local554 == local558) {
									local946 = local597;
								} else {
									@Pc(956) int local956 = local616 * (local558 & 0x7F) >> 7;
									if (local956 < 2) {
										local956 = 2;
									} else if (local956 > 126) {
										local956 = 126;
									}
									local946 = Static560.anIntArray534[local956 | local558 & 0xFF80];
									if ((this.anInt4470 & 0x7) == 0) {
										local703 = this.aClass57_Sub3_10.aFloatArray92[2] * local610 + this.aClass57_Sub3_10.aFloatArray92[1] * local612 + this.aClass57_Sub3_10.aFloatArray92[0] * local618;
										local703 = this.aClass57_Sub3_10.aFloat171 + (local599 > 0.0F ? this.aClass57_Sub3_10.aFloat174 : this.aClass57_Sub3_10.aFloat167) * local599;
										@Pc(1035) int local1035 = local946 >> 16 & 0xFF;
										@Pc(1041) int local1041 = local946 >> 8 & 0xFF;
										@Pc(1045) int local1045 = local946 & 0xFF;
										local1035 = (int) ((float) local1035 * local703);
										if (local1035 < 0) {
											local1035 = 0;
										} else if (local1035 > 255) {
											local1035 = 255;
										}
										local1041 = (int) ((float) local1041 * local703);
										if (local1041 < 0) {
											local1041 = 0;
										} else if (local1041 > 255) {
											local1041 = 255;
										}
										local1045 = (int) ((float) local1045 * local703);
										if (local1045 < 0) {
											local1045 = 0;
										} else if (local1045 > 255) {
											local1045 = 255;
										}
										local946 = local1035 << 16 | local1041 << 8 | local1045;
									}
								}
								if (Stream.b()) {
									local187.b((float) local530);
									local187.b((float) (local567 + this.method8032(local530, local540)));
									local187.b((float) local540);
									local187.b((float) local530);
									local187.b((float) local540);
									if (this.anIntArrayArrayArray14 != null) {
										local187.b((float) (local301 == null ? 0 : local301[local461] - 1));
									}
									if ((this.anInt4470 & 0x7) != 0) {
										local187.b(local618);
										local187.b(local612);
										local187.b(local610);
									}
								} else {
									local187.a((float) local530);
									local187.a((float) (this.method8032(local530, local540) + local567));
									local187.a((float) local540);
									local187.a((float) local530);
									local187.a((float) local540);
									if (this.anIntArrayArrayArray14 != null) {
										local187.a((float) (local301 == null ? 0 : local301[local461] - 1));
									}
									if ((this.anInt4470 & 0x7) != 0) {
										local187.a(local618);
										local187.a(local612);
										local187.a(local610);
									}
								}
								if (this.aClass57_Sub3_10.anInt9165 == 0) {
									local192.e(local946 | 0xFF000000);
								} else {
									local192.f(local946 | 0xFF000000);
								}
								local1287 = this.anInt4466++;
								local516[local461] = (short) local1287;
								if (local554 != -1) {
									local196[local1287] = local243[local461];
								}
								local215.method6984(local585, new Class5_Sub17(local516[local461]));
							} else {
								local516[local461] = ((Class5_Sub17) local912).aShort35;
								local1287 = local516[local461] & 0xFFFF;
								if (local554 != -1 && local196[local1287].aLong314 > local243[local461].aLong314) {
									local196[local1287] = local243[local461];
								}
							}
							for (local946 = 0; local946 < local451; local946++) {
								local219[local946].method4764(local1287, local616, local597, local599);
							}
							this.anInt4463++;
						}
					}
				}
			}
			for (local225 = 0; local225 < this.anInt4466; local225++) {
				@Pc(1421) Class5_Sub30 local1421 = local196[local225];
				if (local1421 != null) {
					local1421.method4763(local225);
				}
			}
			@Pc(1442) int local1442;
			@Pc(1460) int local1460;
			for (@Pc(1436) int local1436 = 0; super.anInt9376 > local1436; local1436++) {
				for (local1442 = 0; super.anInt9375 > local1442; local1442++) {
					@Pc(1454) short[] local1454 = this.aShortArrayArray5[local1436 + local1442 * super.anInt9376];
					if (local1454 != null) {
						@Pc(1458) int local1458 = 0;
						local1460 = 0;
						while (local1454.length > local1460) {
							@Pc(1469) int local1469 = local1454[local1460++] & 0xFFFF;
							@Pc(1476) int local1476 = local1454[local1460++] & 0xFFFF;
							@Pc(1483) int local1483 = local1454[local1460++] & 0xFFFF;
							@Pc(1487) Class5_Sub30 local1487 = local196[local1469];
							@Pc(1491) Class5_Sub30 local1491 = local196[local1476];
							@Pc(1495) Class5_Sub30 local1495 = local196[local1483];
							@Pc(1497) Class5_Sub30 local1497 = null;
							if (local1487 != null) {
								local1487.method4762(local1436, local1458, local1442);
								local1497 = local1487;
							}
							if (local1491 != null) {
								local1491.method4762(local1436, local1458, local1442);
								if (local1497 == null || local1491.aLong314 < local1497.aLong314) {
									local1497 = local1491;
								}
							}
							if (local1495 != null) {
								local1495.method4762(local1436, local1458, local1442);
								if (local1497 == null || local1495.aLong314 < local1497.aLong314) {
									local1497 = local1495;
								}
							}
							if (local1497 != null) {
								if (local1487 != null) {
									local1497.method4763(local1469);
								}
								if (local1491 != null) {
									local1497.method4763(local1476);
								}
								if (local1495 != null) {
									local1497.method4763(local1483);
								}
								local1497.method4762(local1436, local1458, local1442);
							}
							local1458++;
						}
					}
				}
			}
			local187.c();
			local192.c();
			this.anInterface25_3 = this.aClass57_Sub3_10.method7784(false);
			this.anInterface25_3.method2906(4, this.anInt4466 * 4, local172);
			this.anInterface25_4 = this.aClass57_Sub3_10.method7784(false);
			this.anInterface25_4.method2906(local143, local143 * this.anInt4466, local182);
			if ((this.anInt4470 & 0x7) == 0) {
				if (this.anIntArrayArrayArray14 == null) {
					this.aClass147_1 = this.aClass57_Sub3_10.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_5 }), new Class14(Static662.aClass384_3) });
				} else {
					this.aClass147_1 = this.aClass57_Sub3_10.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_5, Static662.aClass384_4 }), new Class14(Static662.aClass384_3) });
				}
			} else if (this.anIntArrayArrayArray14 == null) {
				this.aClass147_1 = this.aClass57_Sub3_10.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_5, Static662.aClass384_2 }), new Class14(Static662.aClass384_3) });
			} else {
				this.aClass147_1 = this.aClass57_Sub3_10.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_5, Static662.aClass384_4, Static662.aClass384_2 }), new Class14(Static662.aClass384_3) });
			}
			local1442 = 0;
			for (@Pc(1828) int local1828 = 0; local1828 < local115.length; local1828++) {
				if (local115[local1828].anInt5559 > 0) {
					local115[local1442++] = local115[local1828];
				}
			}
			this.aClass5_Sub30Array1 = new Class5_Sub30[local1442];
			@Pc(1858) long[] local1858 = new long[local1442];
			for (local1460 = 0; local1460 < local1442; local1460++) {
				@Pc(1868) Class5_Sub30 local1868 = local115[local1460];
				local1858[local1460] = local1868.aLong314;
				this.aClass5_Sub30Array1[local1460] = local1868;
				local1868.method4760(this.anInt4466);
			}
			Static289.method9261(local1858, this.aClass5_Sub30Array1);
			if (this.aClass377_2 != null) {
				this.aClass377_2.method9040();
			}
		} else {
			this.aClass377_2 = null;
		}
		this.aByteArrayArray10 = null;
		this.aClass5_Sub30ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray12 = this.anIntArrayArrayArray13 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass291_19 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3801(arg1, arg3, arg2, arg5, arg6, arg0, arg4);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!uf;[I)V")
	@Override
	public void method8043(@OriginalArg(0) Class5_Sub43 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass102_32.method1921(new Class5_Sub46(this.aClass57_Sub3_10, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8037(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass377_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(27) int local27 = arg1 - (this.aClass57_Sub3_10.anInt9182 * arg2 >> 8) >> this.aClass57_Sub3_10.anInt9169;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass57_Sub3_10.anInt9154 >> 8) >> this.aClass57_Sub3_10.anInt9169;
			return this.aClass377_2.method9032(local42, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II[[ZIIIIZ)V")
	private void method3801(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass5_Sub30Array1 == null) {
			return;
		}
		@Pc(21) int local21 = arg2 + arg2 + 1;
		@Pc(25) int local25 = local21 * local21;
		if (local25 > Static510.anIntArray497.length) {
			Static510.anIntArray497 = new int[local25];
		}
		@Pc(39) int local39 = arg5 - arg2;
		@Pc(41) int local41 = local39;
		if (local39 < 0) {
			local39 = 0;
		}
		@Pc(53) int local53 = arg0 - arg2;
		@Pc(55) int local55 = local53;
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(63) int local63 = arg5 + arg2;
		if (super.anInt9376 - 1 < local63) {
			local63 = super.anInt9376 - 1;
		}
		@Pc(82) int local82 = arg2 + arg0;
		Static158.anInt2474 = 0;
		if (local82 > super.anInt9375 - 1) {
			local82 = super.anInt9375 - 1;
		}
		for (@Pc(97) int local97 = local39; local97 <= local63; local97++) {
			@Pc(106) boolean[] local106 = arg1[local97 - local41];
			for (@Pc(108) int local108 = local53; local108 <= local82; local108++) {
				if (local106[local108 - local55]) {
					Static510.anIntArray497[Static158.anInt2474++] = local97 + local108 * super.anInt9376;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass57_Sub3_10.method7842();
		} else {
			this.aClass57_Sub3_10.method7817((float) arg3);
			this.aClass57_Sub3_10.method7801();
		}
		this.aClass57_Sub3_10.method7861();
		this.aClass57_Sub3_10.method7820((this.anInt4470 & 0x7) != 0);
		this.aClass57_Sub3_10.method7827(false, -1, false);
		this.aClass57_Sub3_10.method7807(0, this.anInterface25_4);
		for (@Pc(213) int local213 = 0; local213 < this.aClass5_Sub30Array1.length; local213++) {
			this.aClass5_Sub30Array1[local213].method4766(Static158.anInt2474, Static510.anIntArray497);
		}
		@Pc(240) Class203_Sub1 local240 = this.aClass57_Sub3_10.method7815();
		local240.method8332(0, -1, 0);
		this.aClass57_Sub3_10.method7735();
		if (!this.aClass102_32.method1926()) {
			@Pc(262) int local262 = this.aClass57_Sub3_10.anInt9162;
			@Pc(266) int local266 = this.aClass57_Sub3_10.anInt9170;
			this.aClass57_Sub3_10.L(0, local266, this.aClass57_Sub3_10.anInt9148);
			this.aClass57_Sub3_10.method7820(false);
			this.aClass57_Sub3_10.method7821(false);
			this.aClass57_Sub3_10.method7800(128);
			this.aClass57_Sub3_10.method7827(false, -2, false);
			this.aClass57_Sub3_10.method7813(this.aClass57_Sub3_10.anInterface22_3);
			this.aClass57_Sub3_10.method7733(Static362.aClass34_172, Static313.aClass34_88);
			this.aClass57_Sub3_10.method7866(0, Static291.aClass312_3);
			this.aClass57_Sub3_10.method7781(0, Static625.aClass312_4);
			for (@Pc(326) Class5 local326 = this.aClass102_32.method1916(); local326 != null; local326 = this.aClass102_32.method1915()) {
				@Pc(331) Class5_Sub46 local331 = (Class5_Sub46) local326;
				local331.method7158(arg5, arg0, arg2, arg1);
			}
			this.aClass57_Sub3_10.method7866(0, Static57.aClass312_1);
			this.aClass57_Sub3_10.method7781(0, Static57.aClass312_1);
			this.aClass57_Sub3_10.method7813((Interface22) null);
			this.aClass57_Sub3_10.L(local262, local266, this.aClass57_Sub3_10.anInt9148);
		}
		if (this.aClass377_2 == null) {
			return;
		}
		this.aClass57_Sub3_10.method7807(0, this.anInterface25_4);
		this.aClass57_Sub3_10.method7807(1, this.anInterface25_3);
		this.aClass57_Sub3_10.method7745(this.aClass147_1);
		this.aClass377_2.method9033(arg6, arg1, arg0, arg5, arg2);
		return;
	}

	@OriginalMember(owner = "client!im", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub4 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub5_Sub4 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt9377 >> this.aClass57_Sub3_10.anInt9169;
		@Pc(25) Class5_Sub5_Sub4_Sub2 local25 = (Class5_Sub5_Sub4_Sub2) arg2;
		@Pc(37) Class5_Sub5_Sub4_Sub2 local37;
		if (local25 != null && local25.method9026(local22, local22)) {
			local37 = local25;
			local25.method9028();
		} else {
			local37 = new Class5_Sub5_Sub4_Sub2(this.aClass57_Sub3_10, local22, local22);
		}
		local37.method9029(local22, 0, 0, local22);
		this.method3803(local37, arg1, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method3801(arg1, arg3, arg2, -1, arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!im", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass377_2 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (arg2 * this.aClass57_Sub3_10.anInt9182 >> 8) >> this.aClass57_Sub3_10.anInt9169;
			@Pc(41) int local41 = arg3 - (arg2 * this.aClass57_Sub3_10.anInt9154 >> 8) >> this.aClass57_Sub3_10.anInt9169;
			this.aClass377_2.method9037(arg0, local41, local26);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!vu;II)V")
	private void method3803(@OriginalArg(1) Class5_Sub5_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray12[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static53.anIntArray42.length) {
			Static21.anIntArray25 = new int[local22];
			Static53.anIntArray42 = new int[local22];
		}
		for (@Pc(36) int local36 = 0; local36 < local22; local36++) {
			Static53.anIntArray42[local36] = local12[local36] >> this.aClass57_Sub3_10.anInt9169;
			Static21.anIntArray25[local36] = local19[local36] >> this.aClass57_Sub3_10.anInt9169;
		}
		@Pc(66) int local66 = 0;
		while (local66 < local22) {
			@Pc(74) int local74 = Static53.anIntArray42[local66];
			@Pc(79) int local79 = Static21.anIntArray25[local66++];
			@Pc(83) int local83 = Static53.anIntArray42[local66];
			@Pc(88) int local88 = Static21.anIntArray25[local66++];
			@Pc(92) int local92 = Static53.anIntArray42[local66];
			@Pc(97) int local97 = Static21.anIntArray25[local66++];
			if ((local74 - local83) * (local88 - local97) - (local92 - local83) * (-local79 + local88) > 0) {
				arg0.method9023(local92, local97, local74, local88, local79, local83);
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!im", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray10[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(48) int[] local48 = arg3 == null ? null : new int[local8 * 3];
		@Pc(58) int[] local58 = arg5 == null ? null : new int[local8 * 3];
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < local8; local62++) {
			@Pc(68) int local68 = arg6[local62];
			@Pc(72) int local72 = arg7[local62];
			@Pc(76) int local76 = arg8[local62];
			local13[local60] = arg2[local68];
			local18[local60] = arg4[local68];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local68];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local68];
			}
			local60++;
			local13[local60] = arg2[local72];
			local18[local60] = arg4[local72];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local72];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local72];
			}
			local60++;
			local13[local60] = arg2[local76];
			local18[local60] = arg4[local76];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local76];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local76];
			}
			local60++;
		}
		this.U(arg0, arg1, local13, local48, local18, local58, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8035(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4472 <= 0) {
			return;
		}
		@Pc(20) Interface9 local20 = this.aClass57_Sub3_10.method7773(this.anInt4463);
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 32767;
		@Pc(26) int local26 = -32768;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			local22 = 0;
			@Pc(39) Buffer local39 = local20.method2926();
			if (local39 != null) {
				@Pc(47) Stream local47 = this.aClass57_Sub3_10.method7826(local39);
				@Pc(51) int local51;
				@Pc(60) int local60;
				@Pc(62) int local62;
				@Pc(83) short[] local83;
				@Pc(87) int local87;
				@Pc(95) int local95;
				if (Stream.b()) {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = arg0 + super.anInt9376 * local51;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local83 = this.aShortArrayArray5[local60];
								if (local83 != null) {
									for (local87 = 0; local87 < local83.length; local87++) {
										local95 = local83[local87] & 0xFFFF;
										if (local24 > local95) {
											local24 = local95;
										}
										local47.d(local95);
										if (local26 < local95) {
											local26 = local95;
										}
										local22++;
									}
								}
							}
							local60++;
						}
					}
				} else {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = arg0 + super.anInt9376 * local51;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local83 = this.aShortArrayArray5[local60];
								if (local83 != null) {
									for (local87 = 0; local87 < local83.length; local87++) {
										local95 = local83[local87] & 0xFFFF;
										if (local24 > local95) {
											local24 = local95;
										}
										local47.c(local95);
										if (local95 > local26) {
											local26 = local95;
										}
										local22++;
									}
								}
							}
							local60++;
						}
					}
				}
				local47.c();
				if (local20.method2927()) {
					break;
				}
			}
		}
		if (local22 <= 0) {
			return;
		}
		this.aClass57_Sub3_10.method7772();
		this.aClass57_Sub3_10.method7785(false);
		this.aClass57_Sub3_10.method7820(false);
		this.aClass57_Sub3_10.method7789(false);
		this.aClass57_Sub3_10.method7821(false);
		this.aClass57_Sub3_10.method7800(0);
		this.aClass57_Sub3_10.method7827(false, -2, false);
		this.aClass57_Sub3_10.method7813((Interface22) null);
		@Pc(320) Class203_Sub1 local320 = this.aClass57_Sub3_10.method7815();
		@Pc(325) float[] local325 = this.aClass57_Sub3_10.method7840();
		local325[1] = 0.0F;
		local325[3] = 0.0F;
		local325[11] = 0.0F;
		local325[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass57_Sub3_10.anInt9094;
		local325[5] = (float) 1024 / ((float) super.anInt9377 * 128.0F * (float) this.aClass57_Sub3_10.anInt9025);
		local325[4] = 0.0F;
		local325[9] = 0.0F;
		local325[14] = -this.aFloat60 / (this.aFloat61 - this.aFloat60);
		local325[6] = 0.0F;
		local325[8] = 0.0F;
		local325[7] = 0.0F;
		local325[15] = 1.0F;
		local325[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass57_Sub3_10.anInt9025;
		local325[10] = 1.0F / (this.aFloat61 - this.aFloat60);
		local325[0] = (float) 1024 / ((float) this.aClass57_Sub3_10.anInt9094 * 128.0F * (float) super.anInt9377);
		local325[2] = 0.0F;
		local320.method4844(1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass57_Sub3_10.method7818();
		this.aClass57_Sub3_10.method7735();
		if ((this.anInt4470 & 0x7) == 0) {
			this.aClass57_Sub3_10.method7820(false);
		} else {
			this.aClass57_Sub3_10.method7820(true);
			this.aClass57_Sub3_10.method7847();
		}
		this.aClass57_Sub3_10.method7739(false);
		this.aClass57_Sub3_10.method7807(0, this.anInterface25_4);
		this.aClass57_Sub3_10.method7807(1, this.anInterface25_3);
		this.aClass57_Sub3_10.method7745(this.aClass147_1);
		this.aClass57_Sub3_10.method7814(local26 + 1 - local24, local20, local24, 0, Static175.aClass85_1, local22 / 3);
		this.aClass57_Sub3_10.method7739(true);
	}

	@OriginalMember(owner = "client!im", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass377_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass57_Sub3_10.anInt9182 >> 8) >> this.aClass57_Sub3_10.anInt9169;
			@Pc(42) int local42 = arg3 - (this.aClass57_Sub3_10.anInt9154 * arg2 >> 8) >> this.aClass57_Sub3_10.anInt9169;
			this.aClass377_2.method9035(local27, arg0, local42);
		}
	}
}
