import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	private int anInt8515;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
	private int anInt8517;

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!qm", name = "W", descriptor = "Lclient!np;")
	public Class22 aClass22_22;

	@OriginalMember(owner = "client!qm", name = "Y", descriptor = "Lclient!tc;")
	private Interface22 anInterface22_14;

	@OriginalMember(owner = "client!qm", name = "Z", descriptor = "Lclient!tc;")
	private Interface22 anInterface22_15;

	@OriginalMember(owner = "client!qm", name = "ab", descriptor = "[Lclient!eu;")
	private Class2_Sub15[] aClass2_Sub15Array1;

	@OriginalMember(owner = "client!qm", name = "bb", descriptor = "I")
	private int anInt8526;

	@OriginalMember(owner = "client!qm", name = "db", descriptor = "I")
	private int anInt8527;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "F")
	private float aFloat172 = -3.4028235E38F;

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "F")
	private float aFloat173 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "Lclient!uh;")
	private final Class341 aClass341_49 = new Class341();

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
	private final int anInt8516 = this.anInt9616 - 2;

	@OriginalMember(owner = "client!qm", name = "U", descriptor = "Lclient!wga;")
	public final Class20_Sub2 aClass20_Sub2_20;

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!qm", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "[[[Lclient!eu;")
	private Class2_Sub15[][][] aClass2_Sub15ArrayArrayArray1;

	@OriginalMember(owner = "client!qm", name = "P", descriptor = "[[B")
	private final byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
	private final int anInt8521;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "[[S")
	public final short[][] aShortArrayArray23;

	@OriginalMember(owner = "client!qm", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!qm", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!qm", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!qm", name = "T", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
	public final int anInt8510;

	@OriginalMember(owner = "client!qm", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!qm", name = "X", descriptor = "Lclient!eq;")
	private Class99 aClass99_64;

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "Lclient!dg;")
	private Class73 aClass73_2;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!wga;IIII[[I[[II)V")
	public Class65_Sub3(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass20_Sub2_20 = arg0;
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray12 = new float[super.anInt9615 + 1][super.anInt9618 + 1];
		this.aClass2_Sub15ArrayArrayArray1 = new Class2_Sub15[arg3][arg4][];
		this.aByteArrayArray21 = new byte[arg3][arg4];
		this.anInt8521 = 0x1 << this.anInt8516;
		this.aShortArrayArray23 = new short[arg3 * arg4][];
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt9615 + 1][super.anInt9618 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anInt8510 = arg2;
		this.aFloatArrayArray10 = new float[super.anInt9615 + 1][super.anInt9618 + 1];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt9618; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt9615 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray55[local125][local121];
				if ((float) local134 > this.aFloat172) {
					this.aFloat172 = local134;
				}
				if ((float) local134 < this.aFloat173) {
					this.aFloat173 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9615 > local125 && local121 < super.anInt9618) {
					@Pc(191) int local191 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(208) int local208 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(228) float local228 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local191 * local191 + local208 * local208)));
					this.aFloatArrayArray12[local125][local121] = (float) local191 * local228;
					this.aFloatArrayArray11[local125][local121] = (float) (-arg7 * 2) * local228;
					this.aFloatArrayArray10[local125][local121] = local228 * (float) local208;
				}
			}
		}
		this.aFloat173--;
		this.aFloat172++;
		this.aClass99_64 = new Class99(128);
		if ((this.anInt8510 & 0x10) != 0) {
			this.aClass73_2 = new Class73(this.aClass20_Sub2_20, this);
		}
	}

	@OriginalMember(owner = "client!qm", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub7 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub7 arg2) {
		if ((this.aByteArrayArray21[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9620 >> this.aClass20_Sub2_20.anInt1550;
		@Pc(27) Class2_Sub6_Sub7_Sub1 local27 = (Class2_Sub6_Sub7_Sub1) arg2;
		@Pc(37) Class2_Sub6_Sub7_Sub1 local37;
		if (local27 != null && local27.method3207(local24, local24)) {
			local37 = local27;
			local27.method3205();
		} else {
			local37 = new Class2_Sub6_Sub7_Sub1(this.aClass20_Sub2_20, local24, local24);
		}
		local37.method3202(local24, local24, 0, 0);
		this.method7207(local37, arg1, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!fc;III)V")
	private void method7207(@OriginalArg(0) Class2_Sub6_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int[] local21 = this.anIntArrayArrayArray17[arg2][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray15[arg2][arg1];
		@Pc(31) int local31 = local21.length;
		if (Static227.anIntArray254.length < local31) {
			Static227.anIntArray254 = new int[local31];
			Static521.anIntArray617 = new int[local31];
		}
		for (@Pc(43) int local43 = 0; local43 < local31; local43++) {
			Static227.anIntArray254[local43] = local21[local43] >> this.aClass20_Sub2_20.anInt1550;
			Static521.anIntArray617[local43] = local28[local43] >> this.aClass20_Sub2_20.anInt1550;
		}
		@Pc(75) int local75 = 0;
		while (local31 > local75) {
			@Pc(81) int local81 = Static227.anIntArray254[local75];
			@Pc(86) int local86 = Static521.anIntArray617[local75++];
			@Pc(90) int local90 = Static227.anIntArray254[local75];
			@Pc(95) int local95 = Static521.anIntArray617[local75++];
			@Pc(99) int local99 = Static227.anIntArray254[local75];
			@Pc(104) int local104 = Static521.anIntArray617[local75++];
			if (-((local99 - local90) * (local95 - local86)) + (local81 - local90) * (local95 - local104) > 0) {
				arg0.method3203(local86, local81, local90, local95, local104, local99);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass73_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass20_Sub2_20.anInt1560 >> 8) >> this.aClass20_Sub2_20.anInt1550;
			@Pc(38) int local38 = arg3 - (this.aClass20_Sub2_20.anInt1553 * arg2 >> 8) >> this.aClass20_Sub2_20.anInt1550;
			this.aClass73_2.method2566(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	@Override
	public void method7992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qm", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass73_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass20_Sub2_20.anInt1560 * arg2 >> 8) >> this.aClass20_Sub2_20.anInt1550;
			@Pc(39) int local39 = arg3 - (this.aClass20_Sub2_20.anInt1553 * arg2 >> 8) >> this.aClass20_Sub2_20.anInt1550;
			this.aClass73_2.method2570(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!qm", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8526 <= 0) {
			this.aClass73_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9615 + 1][super.anInt9618 + 1];
			for (@Pc(21) int local21 = 1; local21 < super.anInt9615; local21++) {
				for (@Pc(25) int local25 = 1; local25 < super.anInt9618; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray22[local21][local25 - 1] >> 2) + (this.aByteArrayArray22[local21 + 1][local25] >> 3) + (this.aByteArrayArray22[local21 + -1][local25] >> 2) + (this.aByteArrayArray22[local21][local25 + 1] >> 3) + (this.aByteArrayArray22[local21][local25] >> 1));
				}
			}
			@Pc(105) Class2_Sub15[] local105 = new Class2_Sub15[this.aClass99_64.method3050()];
			this.aClass99_64.method3053(local105);
			for (@Pc(113) int local113 = 0; local113 < local105.length; local113++) {
				local105[local113].method3101(this.anInt8526);
			}
			@Pc(129) int local129 = 20;
			if (this.anIntArrayArrayArray16 != null) {
				local129 += 4;
			}
			if ((this.anInt8510 & 0x7) != 0) {
				local129 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass20_Sub2_20.aNativeHeap4.a(this.anInt8526 * 4, false);
			@Pc(162) NativeHeapBuffer local162 = this.aClass20_Sub2_20.aNativeHeap4.a(this.anInt8526 * local129, false);
			@Pc(167) Stream local167 = new Stream(local162);
			@Pc(172) Stream local172 = new Stream(local152);
			@Pc(176) Class2_Sub15[] local176 = new Class2_Sub15[this.anInt8526];
			@Pc(183) int local183 = Static14.method293(this.anInt8526 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(193) Class99 local193 = new Class99(local183);
			@Pc(197) Class2_Sub15[] local197 = new Class2_Sub15[this.anInt8527];
			@Pc(203) int local203;
			for (@Pc(199) int local199 = 0; local199 < super.anInt9615; local199++) {
				for (local203 = 0; super.anInt9618 > local203; local203++) {
					if (this.anIntArrayArrayArray13[local199][local203] != null) {
						@Pc(219) Class2_Sub15[] local219 = this.aClass2_Sub15ArrayArrayArray1[local199][local203];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray17[local199][local203];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray15[local199][local203];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray12[local199][local203];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray13[local199][local203];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local199][local203];
						@Pc(271) int[] local271 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local199][local203];
						if (local240 == null) {
							local240 = local247;
						}
						@Pc(282) float local282 = this.aFloatArrayArray12[local199][local203];
						@Pc(289) float local289 = this.aFloatArrayArray11[local199][local203];
						@Pc(296) float local296 = this.aFloatArrayArray10[local199][local203];
						@Pc(305) float local305 = this.aFloatArrayArray12[local199][local203 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray11[local199][local203 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray10[local199][local203 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray12[local199 + 1][local203 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray11[local199 + 1][local203 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray10[local199 + 1][local203 + 1];
						@Pc(365) float local365 = this.aFloatArrayArray12[local199 + 1][local203];
						@Pc(374) float local374 = this.aFloatArrayArray11[local199 + 1][local203];
						@Pc(383) float local383 = this.aFloatArrayArray10[local199 + 1][local203];
						@Pc(391) int local391 = local19[local199][local203] & 0xFF;
						@Pc(401) int local401 = local19[local199][local203 + 1] & 0xFF;
						@Pc(413) int local413 = local19[local199 + 1][local203 + 1] & 0xFF;
						@Pc(423) int local423 = local19[local199 + 1][local203] & 0xFF;
						@Pc(425) int local425 = 0;
						@Pc(435) int local435;
						label355: for (@Pc(427) int local427 = 0; local427 < local247.length; local427++) {
							@Pc(433) Class2_Sub15 local433 = local219[local427];
							for (local435 = 0; local435 < local425; local435++) {
								if (local433 == local197[local435]) {
									continue label355;
								}
							}
							local197[local425++] = local433;
						}
						@Pc(477) short[] local477 = this.aShortArrayArray23[local203 * super.anInt9615 + local199] = new short[local247.length];
						for (local435 = 0; local435 < local247.length; local435++) {
							@Pc(490) int local490 = (local199 << super.anInt9616) + local226[local435];
							@Pc(500) int local500 = (local203 << super.anInt9616) + local233[local435];
							@Pc(505) int local505 = local490 >> this.anInt8516;
							@Pc(510) int local510 = local500 >> this.anInt8516;
							@Pc(514) int local514 = local247[local435];
							@Pc(518) int local518 = local240[local435];
							@Pc(526) int local526 = local259 == null ? 0 : local259[local435];
							@Pc(544) long local544 = (long) local510 | (long) local514 << 32 | (long) local518 << 48 | (long) (local505 << 16);
							@Pc(548) int local548 = local226[local435];
							@Pc(552) int local552 = local233[local435];
							@Pc(554) byte local554 = 74;
							@Pc(556) int local556 = 0;
							@Pc(587) float local587;
							@Pc(591) float local591;
							@Pc(589) float local589;
							@Pc(641) float local641;
							@Pc(595) int local595;
							if (local548 == 0 && local552 == 0) {
								local595 = local554 - local391;
								local591 = local289;
								local587 = local282;
								local589 = local296;
							} else if (local548 == 0 && local552 == super.anInt9620) {
								local595 = local554 - local401;
								local587 = local305;
								local591 = local314;
								local589 = local323;
							} else if (super.anInt9620 == local548 && super.anInt9620 == local552) {
								local587 = local334;
								local589 = local356;
								local591 = local345;
								local595 = local554 - local413;
							} else if (local548 == super.anInt9620 && local552 == 0) {
								local589 = local383;
								local587 = local365;
								local591 = local374;
								local595 = local554 - local423;
							} else {
								@Pc(617) float local617 = (float) local548 / (float) super.anInt9620;
								@Pc(624) float local624 = (float) local552 / (float) super.anInt9620;
								@Pc(632) float local632 = local282 + (local365 - local282) * local617;
								local641 = local289 + (local374 - local289) * local617;
								@Pc(649) float local649 = local617 * (local383 - local296) + local296;
								@Pc(658) float local658 = local617 * (local334 - local305) + local305;
								@Pc(666) float local666 = local314 + (local345 - local314) * local617;
								local587 = local632 + local624 * (local658 - local632);
								local591 = local641 + local624 * (local666 - local641);
								@Pc(692) float local692 = local323 + (local356 - local323) * local617;
								local589 = local649 + local624 * (local692 - local649);
								@Pc(712) int local712 = ((local423 - local391) * local548 >> super.anInt9616) + local391;
								@Pc(724) int local724 = local401 + (local548 * (local413 - local401) >> super.anInt9616);
								local595 = local554 - local712 - (local552 * (local724 - local712) >> super.anInt9616);
							}
							@Pc(777) float local777 = 1.0F;
							if (local514 != -1) {
								@Pc(788) int local788 = local595 * (local514 & 0x7F) >> 7;
								if (local788 < 2) {
									local788 = 2;
								} else if (local788 > 126) {
									local788 = 126;
								}
								local556 = Static195.anIntArray226[local788 | local514 & 0xFF80];
								if ((this.anInt8510 & 0x7) == 0) {
									local777 = local587 * this.aClass20_Sub2_20.aFloatArray33[0] + local591 * this.aClass20_Sub2_20.aFloatArray33[1] + this.aClass20_Sub2_20.aFloatArray33[2] * local589;
									local777 = local777 * (local777 > 0.0F ? this.aClass20_Sub2_20.aFloat62 : this.aClass20_Sub2_20.aFloat65) + this.aClass20_Sub2_20.aFloat51;
								}
							}
							@Pc(864) Class2 local864 = null;
							if ((local490 & this.anInt8521 - 1) == 0 && (this.anInt8521 - 1 & local500) == 0) {
								local864 = local193.method3056(local544);
							}
							@Pc(1197) int local1197;
							@Pc(918) int local918;
							if (local864 == null) {
								if (local518 == local514) {
									local918 = local556;
								} else {
									@Pc(896) int local896 = (local518 & 0x7F) * local595 >> 7;
									if (local896 < 2) {
										local896 = 2;
									} else if (local896 > 126) {
										local896 = 126;
									}
									local918 = Static195.anIntArray226[local896 | local518 & 0xFF80];
									if ((this.anInt8510 & 0x7) == 0) {
										local641 = this.aClass20_Sub2_20.aFloatArray33[2] * local589 + local591 * this.aClass20_Sub2_20.aFloatArray33[1] + this.aClass20_Sub2_20.aFloatArray33[0] * local587;
										local641 = this.aClass20_Sub2_20.aFloat51 + (local777 > 0.0F ? this.aClass20_Sub2_20.aFloat62 : this.aClass20_Sub2_20.aFloat65) * local777;
										@Pc(974) int local974 = local918 >> 16 & 0xFF;
										@Pc(980) int local980 = local918 >> 8 & 0xFF;
										@Pc(984) int local984 = local918 & 0xFF;
										local974 = (int) ((float) local974 * local641);
										local980 = (int) ((float) local980 * local641);
										if (local974 < 0) {
											local974 = 0;
										} else if (local974 > 255) {
											local974 = 255;
										}
										local984 = (int) ((float) local984 * local641);
										if (local980 < 0) {
											local980 = 0;
										} else if (local980 > 255) {
											local980 = 255;
										}
										if (local984 < 0) {
											local984 = 0;
										} else if (local984 > 255) {
											local984 = 255;
										}
										local918 = local974 << 16 | local980 << 8 | local984;
									}
								}
								if (Stream.c()) {
									local167.a((float) local490);
									local167.a((float) (local526 + this.method7999(local490, local500)));
									local167.a((float) local500);
									local167.a((float) local490);
									local167.a((float) local500);
									if (this.anIntArrayArrayArray16 != null) {
										local167.a((float) (local271 == null ? 0 : local271[local435] - 1));
									}
									if ((this.anInt8510 & 0x7) != 0) {
										local167.a(local587);
										local167.a(local591);
										local167.a(local589);
									}
								} else {
									local167.b((float) local490);
									local167.b((float) (this.method7999(local490, local500) + local526));
									local167.b((float) local500);
									local167.b((float) local490);
									local167.b((float) local500);
									if (this.anIntArrayArrayArray16 != null) {
										local167.b((float) (local271 == null ? 0 : local271[local435] - 1));
									}
									if ((this.anInt8510 & 0x7) != 0) {
										local167.b(local587);
										local167.b(local591);
										local167.b(local589);
									}
								}
								if (this.aClass20_Sub2_20.anInt1576 == 0) {
									local172.b(local918 | 0xFF000000);
								} else {
									local172.c(local918 | 0xFF000000);
								}
								local1197 = this.anInt8517++;
								local477[local435] = (short) local1197;
								if (local514 != -1) {
									local176[local1197] = local219[local435];
								}
								local193.method3059(local544, new Class2_Sub39(local477[local435]));
							} else {
								local477[local435] = ((Class2_Sub39) local864).aShort87;
								local1197 = local477[local435] & 0xFFFF;
								if (local514 != -1 && local219[local435].aLong278 < local176[local1197].aLong278) {
									local176[local1197] = local219[local435];
								}
							}
							for (local918 = 0; local918 < local425; local918++) {
								local197[local918].method3106(local1197, local777, local595, local556);
							}
							this.anInt8515++;
						}
					}
				}
			}
			for (local203 = 0; local203 < this.anInt8517; local203++) {
				@Pc(1312) Class2_Sub15 local1312 = local176[local203];
				if (local1312 != null) {
					local1312.method3109(local203);
				}
			}
			@Pc(1333) int local1333;
			@Pc(1352) int local1352;
			for (@Pc(1329) int local1329 = 0; local1329 < super.anInt9615; local1329++) {
				for (local1333 = 0; local1333 < super.anInt9618; local1333++) {
					@Pc(1346) short[] local1346 = this.aShortArrayArray23[local1333 * super.anInt9615 + local1329];
					if (local1346 != null) {
						@Pc(1350) int local1350 = 0;
						local1352 = 0;
						while (local1346.length > local1352) {
							@Pc(1361) int local1361 = local1346[local1352++] & 0xFFFF;
							@Pc(1368) int local1368 = local1346[local1352++] & 0xFFFF;
							@Pc(1375) int local1375 = local1346[local1352++] & 0xFFFF;
							@Pc(1379) Class2_Sub15 local1379 = local176[local1361];
							@Pc(1383) Class2_Sub15 local1383 = local176[local1368];
							@Pc(1387) Class2_Sub15 local1387 = local176[local1375];
							@Pc(1389) Class2_Sub15 local1389 = null;
							if (local1379 != null) {
								local1389 = local1379;
								local1379.method3107(local1350, local1333, local1329);
							}
							if (local1383 != null) {
								local1383.method3107(local1350, local1333, local1329);
								if (local1389 == null || local1389.aLong278 > local1383.aLong278) {
									local1389 = local1383;
								}
							}
							if (local1387 != null) {
								local1387.method3107(local1350, local1333, local1329);
								if (local1389 == null || local1389.aLong278 > local1387.aLong278) {
									local1389 = local1387;
								}
							}
							if (local1389 != null) {
								if (local1379 != null) {
									local1389.method3109(local1361);
								}
								if (local1383 != null) {
									local1389.method3109(local1368);
								}
								if (local1387 != null) {
									local1389.method3109(local1375);
								}
								local1389.method3107(local1350, local1333, local1329);
							}
							local1350++;
						}
					}
				}
			}
			local167.a();
			local172.a();
			this.anInterface22_14 = this.aClass20_Sub2_20.method1523(false);
			this.anInterface22_14.method761(local152, 4, this.anInt8517 * 4);
			this.anInterface22_15 = this.aClass20_Sub2_20.method1523(false);
			this.anInterface22_15.method761(local162, local129, local129 * this.anInt8517);
			if ((this.anInt8510 & 0x7) == 0) {
				if (this.anIntArrayArrayArray16 == null) {
					this.aClass22_22 = this.aClass20_Sub2_20.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_5 }), new Class168(Static88.aClass69_3) });
				} else {
					this.aClass22_22 = this.aClass20_Sub2_20.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_5, Static88.aClass69_4 }), new Class168(Static88.aClass69_3) });
				}
			} else if (this.anIntArrayArrayArray16 == null) {
				this.aClass22_22 = this.aClass20_Sub2_20.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_5, Static88.aClass69_2 }), new Class168(Static88.aClass69_3) });
			} else {
				this.aClass22_22 = this.aClass20_Sub2_20.method1446(new Class168[] { new Class168(new Class69[] { Static88.aClass69_1, Static88.aClass69_5, Static88.aClass69_4, Static88.aClass69_2 }), new Class168(Static88.aClass69_3) });
			}
			local1333 = 0;
			for (@Pc(1684) int local1684 = 0; local1684 < local105.length; local1684++) {
				if (local105[local1684].anInt3394 > 0) {
					local105[local1333++] = local105[local1684];
				}
			}
			this.aClass2_Sub15Array1 = new Class2_Sub15[local1333];
			@Pc(1713) long[] local1713 = new long[local1333];
			for (local1352 = 0; local1352 < local1333; local1352++) {
				@Pc(1721) Class2_Sub15 local1721 = local105[local1352];
				local1713[local1352] = local1721.aLong278;
				this.aClass2_Sub15Array1[local1352] = local1721;
				local1721.method3105(this.anInt8517);
			}
			Static114.method2848(this.aClass2_Sub15Array1, local1713);
			if (this.aClass73_2 != null) {
				this.aClass73_2.method2569();
			}
		}
		this.anIntArrayArrayArray14 = null;
		this.aClass99_64 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass2_Sub15ArrayArrayArray1 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray11 = this.aFloatArrayArray10 = null;
		this.anIntArrayArrayArray13 = null;
		this.aByteArrayArray22 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8002(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass73_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass20_Sub2_20.anInt1560 * arg2 >> 8) >> this.aClass20_Sub2_20.anInt1550;
			@Pc(40) int local40 = arg3 - (this.aClass20_Sub2_20.anInt1553 * arg2 >> 8) >> this.aClass20_Sub2_20.anInt1550;
			return this.aClass73_2.method2565(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!qm", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray22[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7209(arg0, arg1, arg5, arg4, arg3, arg6, arg2);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIZ[[ZIII)V")
	private void method7209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass2_Sub15Array1 == null) {
			return;
		}
		@Pc(15) int local15 = arg6 + arg6 + 1;
		@Pc(19) int local19 = local15 * local15;
		if (Static19.anIntArray19.length < local19) {
			Static19.anIntArray19 = new int[local19];
		}
		@Pc(35) int local35 = arg0 - arg6;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(46) int local46 = arg1 - arg6;
		@Pc(48) int local48 = local46;
		if (local46 < 0) {
			local46 = 0;
		}
		@Pc(56) int local56 = arg6 + arg0;
		if (super.anInt9615 - 1 < local56) {
			local56 = super.anInt9615 - 1;
		}
		@Pc(71) int local71 = arg1 + arg6;
		if (super.anInt9618 - 1 < local71) {
			local71 = super.anInt9618 - 1;
		}
		Static57.anInt1930 = 0;
		for (@Pc(90) int local90 = local35; local90 <= local56; local90++) {
			@Pc(98) boolean[] local98 = arg4[local90 - local37];
			for (@Pc(100) int local100 = local46; local100 <= local71; local100++) {
				if (local98[local100 - local48]) {
					Static19.anIntArray19[Static57.anInt1930++] = local90 + super.anInt9615 * local100;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass20_Sub2_20.method1459();
		} else {
			this.aClass20_Sub2_20.method1501((float) arg2);
			this.aClass20_Sub2_20.method1491();
		}
		this.aClass20_Sub2_20.method1576();
		this.aClass20_Sub2_20.method1500((this.anInt8510 & 0x7) != 0);
		this.aClass20_Sub2_20.method1448(false, false, -1);
		this.aClass20_Sub2_20.method1559(this.anInterface22_15, 0);
		for (@Pc(192) int local192 = 0; local192 < this.aClass2_Sub15Array1.length; local192++) {
			this.aClass2_Sub15Array1[local192].method3102(Static19.anIntArray19, Static57.anInt1930);
		}
		@Pc(213) Class30_Sub2 local213 = this.aClass20_Sub2_20.method1568();
		local213.method4649(0, -1, 0);
		this.aClass20_Sub2_20.method1549();
		if (!this.aClass341_49.method8531()) {
			@Pc(231) int local231 = this.aClass20_Sub2_20.anInt1563;
			@Pc(235) int local235 = this.aClass20_Sub2_20.anInt1541;
			this.aClass20_Sub2_20.L(0, local235, this.aClass20_Sub2_20.anInt1548);
			this.aClass20_Sub2_20.method1500(false);
			this.aClass20_Sub2_20.method1580(false);
			this.aClass20_Sub2_20.method1451(128);
			this.aClass20_Sub2_20.method1448(false, false, -2);
			this.aClass20_Sub2_20.method1484(this.aClass20_Sub2_20.anInterface7_3);
			this.aClass20_Sub2_20.method1508(Static492.aClass315_4, Static425.aClass315_3);
			this.aClass20_Sub2_20.method1483(0, Static165.aClass177_3);
			this.aClass20_Sub2_20.method1519(0, Static360.aClass177_5);
			for (@Pc(297) Class2 local297 = this.aClass341_49.method8524(); local297 != null; local297 = this.aClass341_49.method8519()) {
				@Pc(302) Class2_Sub46 local302 = (Class2_Sub46) local297;
				local302.method7829(arg1, arg6, arg4, arg0);
			}
			this.aClass20_Sub2_20.method1483(0, Static118.aClass177_1);
			this.aClass20_Sub2_20.method1519(0, Static118.aClass177_1);
			this.aClass20_Sub2_20.method1484(null);
			this.aClass20_Sub2_20.L(local231, local235, this.aClass20_Sub2_20.anInt1548);
		}
		if (this.aClass73_2 != null) {
			this.aClass20_Sub2_20.method1559(this.anInterface22_15, 0);
			this.aClass20_Sub2_20.method1559(this.anInterface22_14, 1);
			this.aClass20_Sub2_20.method1496(this.aClass22_22);
			this.aClass73_2.method2567(arg6, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ab;[I)V")
	@Override
	public void method7994(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass341_49.method8528(new Class2_Sub46(this.aClass20_Sub2_20, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!qm", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface4 local9 = this.aClass20_Sub2_20.anInterface4_12;
		if (arg5 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9615][super.anInt9618][];
		}
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9615][super.anInt9618][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray15[arg0][arg1] = arg4;
		this.anIntArrayArrayArray13[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub15[] local92 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1] = new Class2_Sub15[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt8510 & 0x20) != 0 && local100 != -1 && local9.method8048(local100).aBoolean338) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(146) long local146 = (long) local100 | (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(152) Class2 local152;
			for (local152 = this.aClass99_64.method3056(local146); local152 != null; local152 = this.aClass99_64.method3052()) {
				@Pc(157) Class2_Sub15 local157 = (Class2_Sub15) local152;
				if (local100 == local157.anInt3380 && local157.aFloat101 == (float) local104 && local157.anInt3384 == arg10 && local157.anInt3385 == arg11 && local157.anInt3382 == arg12) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class2_Sub15(this, local100, local104, arg10, arg11, arg12);
				this.aClass99_64.method3059(local146, local92[local94]);
			} else {
				local92[local94] = (Class2_Sub15) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray21[arg0][arg1] = (byte) (this.aByteArrayArray21[arg0][arg1] | 0x1);
		}
		if (this.anInt8527 < arg6.length) {
			this.anInt8527 = arg6.length;
		}
		this.anInt8526 += arg6.length;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7209(arg0, arg1, -1, arg4, arg3, arg5, arg2);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8000(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8526 <= 0) {
			return;
		}
		@Pc(16) Interface24 local16 = this.aClass20_Sub2_20.method1456(this.anInt8515);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method6477();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass20_Sub2_20.method1527(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(74) short[] local74;
				@Pc(78) int local78;
				@Pc(86) int local86;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = local45 * super.anInt9615 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray23[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										local41.d(local86);
										if (local86 > local22) {
											local22 = local86;
										}
										local18++;
										if (local86 < local20) {
											local20 = local86;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + local45 * super.anInt9615;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray23[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										local41.a(local86);
										if (local22 < local86) {
											local22 = local86;
										}
										local18++;
										if (local86 < local20) {
											local20 = local86;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.a();
				if (local16.method6474()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass20_Sub2_20.method1566();
		this.aClass20_Sub2_20.method1472(false);
		this.aClass20_Sub2_20.method1500(false);
		this.aClass20_Sub2_20.method1524(false);
		this.aClass20_Sub2_20.method1580(false);
		this.aClass20_Sub2_20.method1451(0);
		this.aClass20_Sub2_20.method1448(false, false, -2);
		this.aClass20_Sub2_20.method1484(null);
		@Pc(260) Class30_Sub2 local260 = this.aClass20_Sub2_20.method1568();
		@Pc(265) float[] local265 = this.aClass20_Sub2_20.method1471();
		local265[6] = 0.0F;
		local265[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass20_Sub2_20.anInt1428;
		local265[11] = 0.0F;
		local265[0] = (float) 1024 / ((float) this.aClass20_Sub2_20.anInt1398 * (float) super.anInt9620 * 128.0F);
		local265[14] = -this.aFloat173 / (this.aFloat172 - this.aFloat173);
		local265[2] = 0.0F;
		local265[15] = 1.0F;
		local265[5] = (float) 1024 / ((float) super.anInt9620 * 128.0F * (float) this.aClass20_Sub2_20.anInt1428);
		local265[4] = 0.0F;
		local265[3] = 0.0F;
		local265[8] = 0.0F;
		local265[7] = 0.0F;
		local265[10] = 1.0F / (this.aFloat172 - this.aFloat173);
		local265[9] = 0.0F;
		local265[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass20_Sub2_20.anInt1398;
		local265[1] = 0.0F;
		local260.method4055(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F);
		this.aClass20_Sub2_20.method1455();
		this.aClass20_Sub2_20.method1549();
		if ((this.anInt8510 & 0x7) == 0) {
			this.aClass20_Sub2_20.method1500(false);
		} else {
			this.aClass20_Sub2_20.method1500(true);
			this.aClass20_Sub2_20.method1526();
		}
		this.aClass20_Sub2_20.method1560(false);
		this.aClass20_Sub2_20.method1559(this.anInterface22_15, 0);
		this.aClass20_Sub2_20.method1559(this.anInterface22_14, 1);
		this.aClass20_Sub2_20.method1496(this.aClass22_22);
		this.aClass20_Sub2_20.method1572(Static539.aClass134_6, local18 / 3, local16, local20, 0, local22 + 1 - local20);
		this.aClass20_Sub2_20.method1560(true);
	}
}
