import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!al", name = "A", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!al", name = "G", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!al", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!al", name = "U", descriptor = "[Lclient!ar;")
	private Class1_Sub6[] aClass1_Sub6Array1;

	@OriginalMember(owner = "client!al", name = "V", descriptor = "Lclient!fe;")
	public Class97 aClass97_3;

	@OriginalMember(owner = "client!al", name = "Y", descriptor = "Lclient!fe;")
	public Class97 aClass97_4;

	@OriginalMember(owner = "client!al", name = "Z", descriptor = "Lclient!fe;")
	private Class97 aClass97_5;

	@OriginalMember(owner = "client!al", name = "bb", descriptor = "Lclient!cw;")
	private Interface1 anInterface1_3;

	@OriginalMember(owner = "client!al", name = "cb", descriptor = "Lclient!fe;")
	public Class97 aClass97_6;

	@OriginalMember(owner = "client!al", name = "db", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!al", name = "fb", descriptor = "I")
	private int anInt607;

	@OriginalMember(owner = "client!al", name = "v", descriptor = "Lclient!wo;")
	private final Class361 aClass361_16 = new Class361();

	@OriginalMember(owner = "client!al", name = "R", descriptor = "Lclient!ag;")
	public final Class12_Sub1 aClass12_Sub1_7;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "I")
	private final int anInt589;

	@OriginalMember(owner = "client!al", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!al", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!al", name = "X", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!al", name = "F", descriptor = "I")
	public final int anInt597;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	private final int anInt588;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!al", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "[[[Lclient!ar;")
	private Class1_Sub6[][][] aClass1_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!al", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!al", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!al", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!al", name = "W", descriptor = "Lclient!wh;")
	private Class356 aClass356_2;

	@OriginalMember(owner = "client!al", name = "S", descriptor = "Lclient!sn;")
	private Class299 aClass299_2;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ag;IIII[[I[[II)V")
	public Class17_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass12_Sub1_7 = arg0;
		this.anInt589 = super.anInt7988 - 2;
		this.aFloatArrayArray2 = new float[super.anInt7983 + 1][super.anInt7984 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
		this.anInt597 = arg2;
		this.anInt588 = 0x1 << this.anInt589;
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aClass1_Sub6ArrayArrayArray1 = new Class1_Sub6[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt7983 + 1][super.anInt7984 + 1];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray1 = new float[super.anInt7983 + 1][super.anInt7984 + 1];
		this.aByteArrayArray2 = new byte[arg3][arg4];
		for (@Pc(115) int local115 = 1; local115 < super.anInt7984; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt7983 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + local138 * local138 + arg7 * 4 * arg7)));
				this.aFloatArrayArray3[local119][local115] = (float) local138 * local175;
				this.aFloatArrayArray1[local119][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray2[local119][local115] = local175 * (float) local155;
			}
		}
		this.aClass356_2 = new Class356(128);
		if ((this.anInt597 & 0x10) != 0) {
			this.aClass299_2 = new Class299(this.aClass12_Sub1_7, this);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!bd;IIZ)V")
	private void method535(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(24) int[] local24 = this.anIntArrayArrayArray4[arg2][arg1];
		@Pc(31) int[] local31 = this.anIntArrayArrayArray6[arg2][arg1];
		@Pc(34) int local34 = local24.length;
		if (this.aClass12_Sub1_7.anIntArray11.length < local34) {
			this.aClass12_Sub1_7.anIntArray11 = new int[local34];
			this.aClass12_Sub1_7.anIntArray12 = new int[local34];
		}
		@Pc(58) int[] local58 = this.aClass12_Sub1_7.anIntArray11;
		@Pc(62) int[] local62 = this.aClass12_Sub1_7.anIntArray12;
		for (@Pc(64) int local64 = 0; local64 < local34; local64++) {
			local58[local64] = local24[local64] >> this.aClass12_Sub1_7.anInt463;
			local62[local64] = local31[local64] >> this.aClass12_Sub1_7.anInt463;
		}
		@Pc(92) int local92 = 0;
		while (local92 < local34) {
			@Pc(98) int local98 = local58[local92];
			@Pc(103) int local103 = local62[local92++];
			@Pc(107) int local107 = local58[local92];
			@Pc(112) int local112 = local62[local92++];
			@Pc(116) int local116 = local58[local92];
			@Pc(121) int local121 = local62[local92++];
			if ((local112 - local121) * (-local107 + local98) - (local116 - local107) * (-local103 + local112) > 0) {
				arg0.method847(local112, local103, local107, local98, local121, local116);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt606 <= 0) {
			this.aClass299_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt7983 + 1][super.anInt7984 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; local25 < super.anInt7983; local25++) {
				for (local29 = 1; super.anInt7984 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray3[local25][local29 - 1] >> 2) + (this.aByteArrayArray3[local25 + 1][local29] >> 3) + (this.aByteArrayArray3[local25 - 1][local29] >> 2) + (this.aByteArrayArray3[local25][local29 - -1] >> 3) + (this.aByteArrayArray3[local25][local29] >> 1));
				}
			}
			this.aClass1_Sub6Array1 = new Class1_Sub6[this.aClass356_2.method7799()];
			this.aClass356_2.method7791(this.aClass1_Sub6Array1);
			for (local29 = 0; local29 < this.aClass1_Sub6Array1.length; local29++) {
				this.aClass1_Sub6Array1[local29].method600(this.anInt606);
			}
			@Pc(145) int local145 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local145 += 4;
			}
			if ((this.anInt597 & 0x7) != 0) {
				local145 += 12;
			}
			@Pc(165) NativeHeapBuffer local165 = this.aClass12_Sub1_7.aNativeHeap1.a(local145 * this.anInt606, false);
			@Pc(170) Stream local170 = new Stream(local165);
			@Pc(174) Class1_Sub6[] local174 = new Class1_Sub6[this.anInt606];
			@Pc(181) int local181 = Static549.method7478(this.anInt606 / 4);
			if (local181 < 1) {
				local181 = 1;
			}
			@Pc(193) Class356 local193 = new Class356(local181);
			@Pc(197) Class1_Sub6[] local197 = new Class1_Sub6[this.anInt607];
			@Pc(203) int local203;
			for (@Pc(199) int local199 = 0; local199 < super.anInt7983; local199++) {
				for (local203 = 0; super.anInt7984 > local203; local203++) {
					if (this.anIntArrayArrayArray1[local199][local203] != null) {
						@Pc(219) Class1_Sub6[] local219 = this.aClass1_Sub6ArrayArrayArray1[local199][local203];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray4[local199][local203];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray6[local199][local203];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray3[local199][local203];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray1[local199][local203];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local199][local203];
						@Pc(271) int[] local271 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local199][local203];
						if (local240 == null) {
							local240 = local247;
						}
						@Pc(282) float local282 = this.aFloatArrayArray3[local199][local203];
						@Pc(289) float local289 = this.aFloatArrayArray1[local199][local203];
						@Pc(296) float local296 = this.aFloatArrayArray2[local199][local203];
						@Pc(305) float local305 = this.aFloatArrayArray3[local199][local203 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray1[local199][local203 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray2[local199][local203 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray3[local199 + 1][local203 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray1[local199 + 1][local203 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray2[local199 + 1][local203 + 1];
						@Pc(365) float local365 = this.aFloatArrayArray3[local199 + 1][local203];
						@Pc(374) float local374 = this.aFloatArrayArray1[local199 + 1][local203];
						@Pc(383) float local383 = this.aFloatArrayArray2[local199 + 1][local203];
						@Pc(391) int local391 = local23[local199][local203] & 0xFF;
						@Pc(401) int local401 = local23[local199][local203 + 1] & 0xFF;
						@Pc(413) int local413 = local23[local199 + 1][local203 + 1] & 0xFF;
						@Pc(423) int local423 = local23[local199 + 1][local203] & 0xFF;
						@Pc(425) int local425 = 0;
						@Pc(435) int local435;
						label335: for (@Pc(427) int local427 = 0; local427 < local247.length; local427++) {
							@Pc(433) Class1_Sub6 local433 = local219[local427];
							for (local435 = 0; local435 < local425; local435++) {
								if (local197[local435] == local433) {
									continue label335;
								}
							}
							local197[local425++] = local433;
						}
						@Pc(472) short[] local472 = this.aShortArrayArray1[super.anInt7983 * local203 + local199] = new short[local247.length];
						for (local435 = 0; local435 < local247.length; local435++) {
							@Pc(485) int local485 = (local199 << super.anInt7988) + local226[local435];
							@Pc(495) int local495 = (local203 << super.anInt7988) + local233[local435];
							@Pc(500) int local500 = local485 >> this.anInt589;
							@Pc(505) int local505 = local495 >> this.anInt589;
							@Pc(509) int local509 = local247[local435];
							@Pc(513) int local513 = local240[local435];
							@Pc(521) int local521 = local259 == null ? 0 : local259[local435];
							@Pc(539) long local539 = (long) local513 << 48 | (long) local509 << 32 | (long) (local500 << 16) | (long) local505;
							@Pc(543) int local543 = local226[local435];
							@Pc(547) int local547 = local233[local435];
							@Pc(549) byte local549 = 74;
							@Pc(551) int local551 = 0;
							@Pc(562) float local562;
							@Pc(568) float local568;
							@Pc(560) float local560;
							@Pc(654) float local654;
							@Pc(566) int local566;
							if (local543 == 0 && local547 == 0) {
								local560 = local296;
								local562 = local282;
								local566 = local549 - local391;
								local568 = local289;
							} else if (local543 == 0 && super.anInt7986 == local547) {
								local560 = local323;
								local568 = local314;
								local566 = local549 - local401;
								local562 = local305;
							} else if (super.anInt7986 == local543 && local547 == super.anInt7986) {
								local566 = local549 - local413;
								local560 = local356;
								local568 = local345;
								local562 = local334;
							} else if (super.anInt7986 == local543 && local547 == 0) {
								local562 = local365;
								local560 = local383;
								local566 = local549 - local423;
								local568 = local374;
							} else {
								@Pc(631) float local631 = (float) local543 / (float) super.anInt7986;
								@Pc(638) float local638 = (float) local547 / (float) super.anInt7986;
								@Pc(646) float local646 = (local365 - local282) * local631 + local282;
								local654 = local289 + (local374 - local289) * local631;
								@Pc(663) float local663 = local296 + (local383 - local296) * local631;
								@Pc(672) float local672 = (local334 - local305) * local631 + local305;
								@Pc(680) float local680 = local314 + local631 * (local345 - local314);
								@Pc(688) float local688 = local323 + local631 * (local356 - local323);
								local568 = (local680 - local654) * local638 + local654;
								local562 = local638 * (local672 - local646) + local646;
								local560 = local663 + (local688 - local663) * local638;
								@Pc(725) int local725 = local391 + (local543 * (local423 - local391) >> super.anInt7988);
								@Pc(737) int local737 = ((local413 - local401) * local543 >> super.anInt7988) + local401;
								local566 = local549 - (local547 * (local737 - local725) >> super.anInt7988) - local725;
							}
							@Pc(765) float local765 = 1.0F;
							if (local509 != -1) {
								@Pc(777) int local777 = (local509 & 0x7F) * local566 >> 7;
								if (local777 < 2) {
									local777 = 2;
								} else if (local777 > 126) {
									local777 = 126;
								}
								local551 = Static279.anIntArray313[local777 | local509 & 0xFF80];
								if ((this.anInt597 & 0x7) == 0) {
									local765 = this.aClass12_Sub1_7.aFloatArray2[2] * local560 + local568 * this.aClass12_Sub1_7.aFloatArray2[1] + local562 * this.aClass12_Sub1_7.aFloatArray2[0];
									local765 = this.aClass12_Sub1_7.aFloat13 + local765 * (local765 > 0.0F ? this.aClass12_Sub1_7.aFloat19 : this.aClass12_Sub1_7.aFloat18);
								}
							}
							@Pc(851) Class1 local851 = null;
							if ((local485 & this.anInt588 - 1) == 0 && (local495 & this.anInt588 - 1) == 0) {
								local851 = local193.method7796(local539);
							}
							@Pc(884) int local884;
							@Pc(918) int local918;
							if (local851 == null) {
								if (local513 == local509) {
									local918 = local551;
								} else {
									@Pc(928) int local928 = (local513 & 0x7F) * local566 >> 7;
									if (local928 < 2) {
										local928 = 2;
									} else if (local928 > 126) {
										local928 = 126;
									}
									local918 = Static279.anIntArray313[local928 | local513 & 0xFF80];
									if ((this.anInt597 & 0x7) == 0) {
										local654 = local560 * this.aClass12_Sub1_7.aFloatArray2[2] + local568 * this.aClass12_Sub1_7.aFloatArray2[1] + local562 * this.aClass12_Sub1_7.aFloatArray2[0];
										local654 = local765 * (local765 > 0.0F ? this.aClass12_Sub1_7.aFloat19 : this.aClass12_Sub1_7.aFloat18) + this.aClass12_Sub1_7.aFloat13;
										@Pc(1003) int local1003 = local918 >> 16 & 0xFF;
										@Pc(1009) int local1009 = local918 >> 8 & 0xFF;
										local1003 = (int) ((float) local1003 * local654);
										@Pc(1019) int local1019 = local918 & 0xFF;
										local1009 = (int) ((float) local1009 * local654);
										if (local1003 < 0) {
											local1003 = 0;
										} else if (local1003 > 255) {
											local1003 = 255;
										}
										if (local1009 < 0) {
											local1009 = 0;
										} else if (local1009 > 255) {
											local1009 = 255;
										}
										local1019 = (int) ((float) local1019 * local654);
										if (local1019 < 0) {
											local1019 = 0;
										} else if (local1019 > 255) {
											local1019 = 255;
										}
										local918 = local1003 << 16 | local1009 << 8 | local1019;
									}
								}
								if (this.aClass12_Sub1_7.aBoolean23) {
									local170.b((float) local485);
									local170.b((float) (this.method6637(local485, local495) + local521));
									local170.b((float) local495);
									local170.d((byte) (local918 >> 16));
									local170.d((byte) (local918 >> 8));
									local170.d((byte) local918);
									local170.d(-1);
									local170.b((float) local485);
									local170.b((float) local495);
									if (this.anIntArrayArrayArray5 != null) {
										local170.b((float) (local271 == null ? 0 : local271[local435] - 1));
									}
									if ((this.anInt597 & 0x7) != 0) {
										local170.b(local562);
										local170.b(local568);
										local170.b(local560);
									}
								} else {
									local170.a((float) local485);
									local170.a((float) (local521 + this.method6637(local485, local495)));
									local170.a((float) local495);
									local170.d((byte) (local918 >> 16));
									local170.d((byte) (local918 >> 8));
									local170.d((byte) local918);
									local170.d(-1);
									local170.a((float) local485);
									local170.a((float) local495);
									if (this.anIntArrayArrayArray5 != null) {
										local170.a((float) (local271 == null ? 0 : local271[local435] - 1));
									}
									if ((this.anInt597 & 0x7) != 0) {
										local170.a(local562);
										local170.a(local568);
										local170.a(local560);
									}
								}
								local884 = this.anInt594++;
								local472[local435] = (short) local884;
								if (local509 != -1) {
									local174[local884] = local219[local435];
								}
								local193.method7800(local539, new Class1_Sub4(local472[local435]));
							} else {
								local472[local435] = ((Class1_Sub4) local851).aShort7;
								local884 = local472[local435] & 0xFFFF;
								if (local509 != -1 && local219[local435].aLong425 < local174[local884].aLong425) {
									local174[local884] = local219[local435];
								}
							}
							for (local918 = 0; local918 < local425; local918++) {
								local197[local918].method595(local765, local566, local551, local884);
							}
							this.anInt598++;
						}
					}
				}
			}
			for (local203 = 0; local203 < this.anInt594; local203++) {
				@Pc(1324) Class1_Sub6 local1324 = local174[local203];
				if (local1324 != null) {
					local1324.method597(local203);
				}
			}
			@Pc(1361) int local1361;
			for (@Pc(1341) int local1341 = 0; super.anInt7983 > local1341; local1341++) {
				for (@Pc(1345) int local1345 = 0; super.anInt7984 > local1345; local1345++) {
					@Pc(1357) short[] local1357 = this.aShortArrayArray1[local1341 + local1345 * super.anInt7983];
					if (local1357 != null) {
						local1361 = 0;
						@Pc(1363) int local1363 = 0;
						while (local1363 < local1357.length) {
							@Pc(1372) int local1372 = local1357[local1363++] & 0xFFFF;
							@Pc(1379) int local1379 = local1357[local1363++] & 0xFFFF;
							@Pc(1386) int local1386 = local1357[local1363++] & 0xFFFF;
							@Pc(1390) Class1_Sub6 local1390 = local174[local1372];
							@Pc(1394) Class1_Sub6 local1394 = local174[local1379];
							@Pc(1398) Class1_Sub6 local1398 = local174[local1386];
							@Pc(1400) Class1_Sub6 local1400 = null;
							if (local1390 != null) {
								local1390.method594(local1345, local1361, local1341);
								local1400 = local1390;
							}
							if (local1394 != null) {
								local1394.method594(local1345, local1361, local1341);
								if (local1400 == null || local1400.aLong425 > local1394.aLong425) {
									local1400 = local1394;
								}
							}
							if (local1398 != null) {
								local1398.method594(local1345, local1361, local1341);
								if (local1400 == null || local1400.aLong425 > local1398.aLong425) {
									local1400 = local1398;
								}
							}
							if (local1400 != null) {
								if (local1390 != null) {
									local1400.method597(local1372);
								}
								if (local1394 != null) {
									local1400.method597(local1379);
								}
								if (local1398 != null) {
									local1400.method597(local1386);
								}
								local1400.method594(local1345, local1361, local1341);
							}
							local1361++;
						}
					}
				}
			}
			local170.a();
			this.anInterface1_3 = this.aClass12_Sub1_7.method421(local170.b(), local145, local165);
			this.aClass97_4 = new Class97(this.anInterface1_3, 5126, 3, 0);
			this.aClass97_5 = new Class97(this.anInterface1_3, 5121, 4, 12);
			@Pc(1537) byte local1537;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass97_6 = new Class97(this.anInterface1_3, 5126, 2, 16);
				local1537 = 24;
			} else {
				local1537 = 28;
				this.aClass97_6 = new Class97(this.anInterface1_3, 5126, 3, 16);
			}
			if ((this.anInt597 & 0x7) != 0) {
				this.aClass97_3 = new Class97(this.anInterface1_3, 5126, 3, local1537);
			}
			@Pc(1584) long[] local1584 = new long[this.aClass1_Sub6Array1.length];
			for (local1361 = 0; local1361 < this.aClass1_Sub6Array1.length; local1361++) {
				@Pc(1593) Class1_Sub6 local1593 = this.aClass1_Sub6Array1[local1361];
				local1584[local1361] = local1593.aLong425;
				local1593.method598(this.anInt594);
			}
			Static343.method5090(this.aClass1_Sub6Array1, local1584);
			if (this.aClass299_2 != null) {
				this.aClass299_2.method6809();
			}
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray1 = this.aFloatArrayArray2 = null;
		this.aClass356_2 = null;
		this.anIntArrayArrayArray3 = null;
		this.aByteArrayArray3 = null;
		this.anIntArrayArrayArray1 = null;
		this.anIntArrayArrayArray4 = this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass1_Sub6ArrayArrayArray1 = null;
		this.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!al", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub3_Sub4 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub4 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt7986 >> this.aClass12_Sub1_7.anInt463;
		@Pc(27) Class1_Sub3_Sub4_Sub1 local27 = (Class1_Sub3_Sub4_Sub1) arg2;
		@Pc(37) Class1_Sub3_Sub4_Sub1 local37;
		if (local27 != null && local27.method846(local24, local24)) {
			local37 = local27;
			local27.method848();
		} else {
			local37 = new Class1_Sub3_Sub4_Sub1(this.aClass12_Sub1_7, local24, local24);
		}
		local37.method845(0, local24, 0, local24);
		this.method535(local37, arg1, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZI[[ZIII)V")
	private void method536(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass1_Sub6Array1 == null) {
			return;
		}
		@Pc(19) int local19 = arg5 + arg5 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (this.aClass12_Sub1_7.anIntArray13.length < local23) {
			this.aClass12_Sub1_7.anIntArray13 = new int[local23];
		}
		if (this.aClass12_Sub1_7.aClass1_Sub20_Sub2_1.aByteArray52.length < this.anInt598 * 2) {
			this.aClass12_Sub1_7.aClass1_Sub20_Sub2_1 = new Class1_Sub20_Sub2(this.anInt598 * 2);
		}
		@Pc(67) int local67 = arg1 - arg5;
		@Pc(69) int local69 = local67;
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(81) int local81 = arg4 - arg5;
		@Pc(83) int local83 = local81;
		if (local81 < 0) {
			local81 = 0;
		}
		@Pc(91) int local91 = arg1 + arg5;
		if (local91 > super.anInt7983 - 1) {
			local91 = super.anInt7983 - 1;
		}
		@Pc(111) int local111 = arg4 + arg5;
		if (super.anInt7984 - 1 < local111) {
			local111 = super.anInt7984 - 1;
		}
		@Pc(128) int local128 = 0;
		@Pc(132) int[] local132 = this.aClass12_Sub1_7.anIntArray13;
		@Pc(145) int local145;
		for (@Pc(134) int local134 = local67; local134 <= local91; local134++) {
			@Pc(143) boolean[] local143 = arg2[local134 - local69];
			for (local145 = local81; local145 <= local111; local145++) {
				if (local143[local145 - local83]) {
					local132[local128++] = local134 + super.anInt7983 * local145;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass12_Sub1_7.method416();
		} else {
			this.aClass12_Sub1_7.method379((float) arg3);
			this.aClass12_Sub1_7.method411();
		}
		this.aClass12_Sub1_7.method454((this.anInt597 & 0x7) != 0);
		for (@Pc(214) int local214 = 0; local214 < this.aClass1_Sub6Array1.length; local214++) {
			this.aClass1_Sub6Array1[local214].method601(local132, local128);
		}
		if (!this.aClass361_16.method7847()) {
			local145 = this.aClass12_Sub1_7.anInt474;
			@Pc(243) int local243 = this.aClass12_Sub1_7.anInt494;
			this.aClass12_Sub1_7.pa(0, local243, this.aClass12_Sub1_7.anInt475);
			this.aClass12_Sub1_7.method454(false);
			this.aClass12_Sub1_7.method404(false);
			this.aClass12_Sub1_7.method395(128);
			this.aClass12_Sub1_7.method444(-2);
			this.aClass12_Sub1_7.method378(this.aClass12_Sub1_7.aClass52_Sub1_2);
			this.aClass12_Sub1_7.method420(7681, 8448);
			this.aClass12_Sub1_7.method387(0, 770, 34166);
			this.aClass12_Sub1_7.method388(0, 34167);
			for (@Pc(305) Class1 local305 = this.aClass361_16.method7854(); local305 != null; local305 = this.aClass361_16.method7853()) {
				@Pc(310) Class1_Sub51 local310 = (Class1_Sub51) local305;
				local310.method7757(arg1, arg5, arg2, arg4);
			}
			this.aClass12_Sub1_7.method387(0, 768, 5890);
			this.aClass12_Sub1_7.method388(0, 5890);
			this.aClass12_Sub1_7.method378(null);
			this.aClass12_Sub1_7.pa(local145, local243, this.aClass12_Sub1_7.anInt475);
		}
		if (this.aClass299_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass12_Sub1_7.method428(this.aClass97_4, null, null, this.aClass97_6);
		this.aClass299_2.method6812(arg2, arg4, arg1, arg0, arg5);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!al", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass299_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass12_Sub1_7.anInt501 * arg2 >> 8) >> this.aClass12_Sub1_7.anInt463;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass12_Sub1_7.anInt496 >> 8) >> this.aClass12_Sub1_7.anInt463;
			this.aClass299_2.method6813(local38, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6646(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass299_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass12_Sub1_7.anInt501 >> 8) >> this.aClass12_Sub1_7.anInt463;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass12_Sub1_7.anInt496 >> 8) >> this.aClass12_Sub1_7.anInt463;
			return this.aClass299_2.method6816(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!al", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass299_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass12_Sub1_7.anInt501 * arg2 >> 8) >> this.aClass12_Sub1_7.anInt463;
			@Pc(39) int local39 = arg3 - (this.aClass12_Sub1_7.anInt496 * arg2 >> 8) >> this.aClass12_Sub1_7.anInt463;
			this.aClass299_2.method6810(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method536(arg4, arg0, arg3, -1, arg1, arg2);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qea;[I)V")
	@Override
	public void method6640(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass361_16.method7855(new Class1_Sub51(this.aClass12_Sub1_7, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray3[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray3[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	@Override
	public void method6644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6645(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt606 <= 0) {
			return;
		}
		this.aClass12_Sub1_7.method429();
		this.aClass12_Sub1_7.method381(false);
		this.aClass12_Sub1_7.method454(false);
		this.aClass12_Sub1_7.method390(false);
		this.aClass12_Sub1_7.method404(false);
		this.aClass12_Sub1_7.method395(0);
		this.aClass12_Sub1_7.method444(-2);
		this.aClass12_Sub1_7.method378(null);
		Static587.aFloatArray74[15] = 1.0F;
		Static587.aFloatArray74[10] = 0.0F;
		Static587.aFloatArray74[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass12_Sub1_7.anInt414;
		Static587.aFloatArray74[1] = 0.0F;
		Static587.aFloatArray74[0] = (float) 1024 / ((float) super.anInt7986 * 128.0F * (float) this.aClass12_Sub1_7.anInt297);
		Static587.aFloatArray74[3] = 0.0F;
		Static587.aFloatArray74[11] = 0.0F;
		Static587.aFloatArray74[2] = 0.0F;
		Static587.aFloatArray74[4] = 0.0F;
		Static587.aFloatArray74[5] = (float) 1024 / ((float) this.aClass12_Sub1_7.anInt414 * 128.0F * (float) super.anInt7986);
		Static587.aFloatArray74[6] = 0.0F;
		Static587.aFloatArray74[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass12_Sub1_7.anInt297;
		Static587.aFloatArray74[7] = 0.0F;
		Static587.aFloatArray74[9] = 0.0F;
		Static587.aFloatArray74[14] = 0.0F;
		Static587.aFloatArray74[8] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static587.aFloatArray74, 0);
		Static587.aFloatArray74[8] = 0.0F;
		Static587.aFloatArray74[3] = 0.0F;
		Static587.aFloatArray74[2] = 0.0F;
		Static587.aFloatArray74[4] = 0.0F;
		Static587.aFloatArray74[0] = 1.0F;
		Static587.aFloatArray74[7] = 0.0F;
		Static587.aFloatArray74[10] = 0.0F;
		Static587.aFloatArray74[11] = 0.0F;
		Static587.aFloatArray74[14] = 0.0F;
		Static587.aFloatArray74[6] = 1.0F;
		Static587.aFloatArray74[13] = 0.0F;
		Static587.aFloatArray74[1] = 0.0F;
		Static587.aFloatArray74[12] = 0.0F;
		Static587.aFloatArray74[15] = 1.0F;
		Static587.aFloatArray74[5] = 0.0F;
		Static587.aFloatArray74[9] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static587.aFloatArray74, 0);
		if ((this.anInt597 & 0x7) == 0) {
			this.aClass12_Sub1_7.method454(false);
		} else {
			this.aClass12_Sub1_7.method454(true);
			this.aClass12_Sub1_7.method385();
		}
		this.aClass12_Sub1_7.method428(this.aClass97_4, this.aClass97_3, this.aClass97_5, this.aClass97_6);
		if (this.aClass12_Sub1_7.aClass1_Sub20_Sub2_1.aByteArray52.length >= this.anInt598 * 2) {
			this.aClass12_Sub1_7.aClass1_Sub20_Sub2_1.anInt5238 = 0;
		} else {
			this.aClass12_Sub1_7.aClass1_Sub20_Sub2_1 = new Class1_Sub20_Sub2(this.anInt598 * 2);
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class1_Sub20_Sub2 local317 = this.aClass12_Sub1_7.aClass1_Sub20_Sub2_1;
		@Pc(323) int local323;
		@Pc(332) int local332;
		@Pc(334) int local334;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass12_Sub1_7.aBoolean23) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = arg0 + local323 * super.anInt7983;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray1[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local317.method4381(local353[local357] & 0xFFFF);
								local313++;
							}
						}
					}
					local332++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = arg0 + super.anInt7983 * local323;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray1[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local317.method4376(local353[local357] & 0xFFFF);
								local313++;
							}
						}
					}
					local332++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(466) Class14_Sub2 local466 = new Class14_Sub2(this.aClass12_Sub1_7, 5123, local317.aByteArray52, local317.anInt5238);
			this.aClass12_Sub1_7.method425(0, local466, local313);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method536(arg4, arg0, arg3, arg5, arg1, arg2);
	}

	@OriginalMember(owner = "client!al", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt7983][super.anInt7984][];
		}
		if (arg3 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[super.anInt7983][super.anInt7984][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray6[arg0][arg1] = arg4;
		this.anIntArrayArrayArray1[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub6[] local88 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1] = new Class1_Sub6[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.aClass356_2.method7796(local119); local125 != null; local125 = this.aClass356_2.method7801()) {
				@Pc(130) Class1_Sub6 local130 = (Class1_Sub6) local125;
				if (arg8[local90] == local130.anInt681 && (float) arg9[local90] == local130.aFloat24 && local130.anInt676 == arg10 && arg11 == local130.anInt675 && arg12 == local130.anInt685) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub6(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass356_2.method7800(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub6) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray2[arg0][arg1] = (byte) (this.aByteArrayArray2[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt607) {
			this.anInt607 = arg6.length;
		}
		this.anInt606 += arg6.length;
	}
}
