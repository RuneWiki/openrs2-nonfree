import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
	private int anInt1697;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
	private int anInt1710;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "Lclient!kn;")
	private Class207 aClass207_5;

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "Lclient!kn;")
	public Class207 aClass207_6;

	@OriginalMember(owner = "client!dl", name = "Y", descriptor = "Lclient!kn;")
	public Class207 aClass207_7;

	@OriginalMember(owner = "client!dl", name = "bb", descriptor = "I")
	private int anInt1711;

	@OriginalMember(owner = "client!dl", name = "o", descriptor = "Lclient!kn;")
	public Class207 aClass207_8;

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "Lclient!ika;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
	private int anInt1712;

	@OriginalMember(owner = "client!dl", name = "cb", descriptor = "[Lclient!efa;")
	private Class5_Sub17[] aClass5_Sub17Array1;

	@OriginalMember(owner = "client!dl", name = "I", descriptor = "Lclient!at;")
	private final Class20 aClass20_6 = new Class20();

	@OriginalMember(owner = "client!dl", name = "Z", descriptor = "Lclient!vf;")
	public final Class100_Sub3 aClass100_Sub3_10;

	@OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
	private final int anInt1707;

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "[[S")
	public final short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!dl", name = "hb", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!dl", name = "P", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!dl", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	public final int anInt1703;

	@OriginalMember(owner = "client!dl", name = "eb", descriptor = "[[B")
	private final byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!dl", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!dl", name = "N", descriptor = "[[[Lclient!efa;")
	private Class5_Sub17[][][] aClass5_Sub17ArrayArrayArray1;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!dl", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!dl", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!dl", name = "T", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
	private final int anInt1705;

	@OriginalMember(owner = "client!dl", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!dl", name = "A", descriptor = "Lclient!qr;")
	private Class306 aClass306_9;

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Lclient!dh;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!vf;IIII[[I[[II)V")
	public Class84_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass100_Sub3_10 = arg0;
		this.anInt1707 = super.anInt8885 - 2;
		this.aShortArrayArray8 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt8883 + 1][super.anInt8878 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anInt1703 = arg2;
		this.aByteArrayArray4 = new byte[arg3][arg4];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aClass5_Sub17ArrayArrayArray1 = new Class5_Sub17[arg3][arg4][];
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray7 = new float[super.anInt8883 + 1][super.anInt8878 + 1];
		this.aFloatArrayArray5 = new float[super.anInt8883 + 1][super.anInt8878 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anInt1705 = 0x1 << this.anInt1707;
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt8878; local115++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt8883; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local115] - arg6[local121 - 1][local115];
				@Pc(157) int local157 = arg6[local121][local115 + 1] - arg6[local121][local115 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + arg7 * 4 * arg7 + local140 * local140)));
				this.aFloatArrayArray5[local121][local115] = (float) local140 * local176;
				this.aFloatArrayArray6[local121][local115] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray7[local121][local115] = (float) local157 * local176;
			}
		}
		this.aClass306_9 = new Class306(128);
		if ((this.anInt1703 & 0x10) != 0) {
			this.aClass80_1 = new Class80(this.aClass100_Sub3_10, this);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
	@Override
	public void method7621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dl", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass80_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass100_Sub3_10.anInt10287 * arg2 >> 8) >> this.aClass100_Sub3_10.anInt10256;
			@Pc(41) int local41 = arg3 - (this.aClass100_Sub3_10.anInt10290 * arg2 >> 8) >> this.aClass100_Sub3_10.anInt10256;
			this.aClass80_1.method1484(arg0, local27, local41);
		}
	}

	@OriginalMember(owner = "client!dl", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt1712 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt8883 + 1][super.anInt8878 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; super.anInt8883 > local23; local23++) {
				for (local27 = 1; super.anInt8878 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray5[local23][local27] >> 1) + (this.aByteArrayArray5[local23][local27 + 1] >> 3) + (this.aByteArrayArray5[local23][local27 - 1] >> 2) + (this.aByteArrayArray5[local23 + 1][local27] >> 3) + (this.aByteArrayArray5[local23 + -1][local27] >> 2));
				}
			}
			this.aClass5_Sub17Array1 = new Class5_Sub17[this.aClass306_9.method6939()];
			this.aClass306_9.method6938(this.aClass5_Sub17Array1);
			for (local27 = 0; local27 < this.aClass5_Sub17Array1.length; local27++) {
				this.aClass5_Sub17Array1[local27].method1774(this.anInt1712);
			}
			@Pc(149) int local149 = 24;
			if (this.anIntArrayArrayArray6 != null) {
				local149 += 4;
			}
			if ((this.anInt1703 & 0x7) != 0) {
				local149 += 12;
			}
			@Pc(178) NativeHeapBuffer local178 = this.aClass100_Sub3_10.aNativeHeap6.a(this.anInt1712 * local149, false);
			@Pc(183) Stream local183 = new Stream(local178);
			@Pc(187) Class5_Sub17[] local187 = new Class5_Sub17[this.anInt1712];
			@Pc(194) int local194 = Static186.method3180(this.anInt1712 / 4);
			if (local194 < 1) {
				local194 = 1;
			}
			@Pc(206) Class306 local206 = new Class306(local194);
			@Pc(210) Class5_Sub17[] local210 = new Class5_Sub17[this.anInt1711];
			@Pc(216) int local216;
			for (@Pc(212) int local212 = 0; local212 < super.anInt8883; local212++) {
				for (local216 = 0; local216 < super.anInt8878; local216++) {
					if (this.anIntArrayArrayArray3[local212][local216] != null) {
						@Pc(234) Class5_Sub17[] local234 = this.aClass5_Sub17ArrayArrayArray1[local212][local216];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray8[local212][local216];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray7[local212][local216];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray4[local212][local216];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray3[local212][local216];
						@Pc(275) int[] local275 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local212][local216];
						@Pc(288) int[] local288 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local212][local216];
						if (local255 == null) {
							local255 = local262;
						}
						@Pc(299) float local299 = this.aFloatArrayArray5[local212][local216];
						@Pc(306) float local306 = this.aFloatArrayArray6[local212][local216];
						@Pc(313) float local313 = this.aFloatArrayArray7[local212][local216];
						@Pc(322) float local322 = this.aFloatArrayArray5[local212][local216 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray6[local212][local216 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray7[local212][local216 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray5[local212 + 1][local216 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray6[local212 + 1][local216 + 1];
						@Pc(373) float local373 = this.aFloatArrayArray7[local212 + 1][local216 + 1];
						@Pc(382) float local382 = this.aFloatArrayArray5[local212 + 1][local216];
						@Pc(391) float local391 = this.aFloatArrayArray6[local212 + 1][local216];
						@Pc(400) float local400 = this.aFloatArrayArray7[local212 + 1][local216];
						@Pc(408) int local408 = local21[local212][local216] & 0xFF;
						@Pc(418) int local418 = local21[local212][local216 + 1] & 0xFF;
						@Pc(430) int local430 = local21[local212 + 1][local216 + 1] & 0xFF;
						@Pc(440) int local440 = local21[local212 + 1][local216] & 0xFF;
						@Pc(442) int local442 = 0;
						@Pc(452) int local452;
						label335: for (@Pc(444) int local444 = 0; local444 < local262.length; local444++) {
							@Pc(450) Class5_Sub17 local450 = local234[local444];
							for (local452 = 0; local452 < local442; local452++) {
								if (local210[local452] == local450) {
									continue label335;
								}
							}
							local210[local442++] = local450;
						}
						@Pc(503) short[] local503 = this.aShortArrayArray8[local212 + local216 * super.anInt8883] = new short[local262.length];
						for (local452 = 0; local452 < local262.length; local452++) {
							@Pc(516) int local516 = (local212 << super.anInt8885) + local241[local452];
							@Pc(525) int local525 = (local216 << super.anInt8885) + local248[local452];
							@Pc(530) int local530 = local516 >> this.anInt1707;
							@Pc(535) int local535 = local525 >> this.anInt1707;
							@Pc(539) int local539 = local262[local452];
							@Pc(543) int local543 = local255[local452];
							@Pc(552) int local552 = local275 == null ? 0 : local275[local452];
							@Pc(570) long local570 = (long) local535 | (long) (local530 << 16) | (long) local539 << 32 | (long) local543 << 48;
							@Pc(574) int local574 = local241[local452];
							@Pc(578) int local578 = local248[local452];
							@Pc(580) byte local580 = 74;
							@Pc(582) int local582 = 0;
							@Pc(608) float local608;
							@Pc(614) float local614;
							@Pc(606) float local606;
							@Pc(696) float local696;
							@Pc(612) int local612;
							if (local574 == 0 && local578 == 0) {
								local606 = local313;
								local608 = local299;
								local612 = local580 - local408;
								local614 = local306;
							} else if (local574 == 0 && super.anInt8881 == local578) {
								local606 = local340;
								local608 = local322;
								local612 = local580 - local418;
								local614 = local331;
							} else if (super.anInt8881 == local574 && local578 == super.anInt8881) {
								local608 = local351;
								local612 = local580 - local430;
								local606 = local373;
								local614 = local362;
							} else if (local574 == super.anInt8881 && local578 == 0) {
								local612 = local580 - local440;
								local608 = local382;
								local606 = local400;
								local614 = local391;
							} else {
								@Pc(672) float local672 = (float) local574 / (float) super.anInt8881;
								@Pc(679) float local679 = (float) local578 / (float) super.anInt8881;
								@Pc(688) float local688 = local672 * (local382 - local299) + local299;
								local696 = local672 * (local391 - local306) + local306;
								@Pc(704) float local704 = (local400 - local313) * local672 + local313;
								@Pc(713) float local713 = local672 * (local351 - local322) + local322;
								@Pc(722) float local722 = (local362 - local331) * local672 + local331;
								local608 = local688 + local679 * (local713 - local688);
								@Pc(739) float local739 = local672 * (local373 - local340) + local340;
								local614 = local696 + (local722 - local696) * local679;
								local606 = local679 * (local739 - local704) + local704;
								@Pc(767) int local767 = ((local440 - local408) * local574 >> super.anInt8885) + local408;
								@Pc(779) int local779 = (local574 * (local430 - local418) >> super.anInt8885) + local418;
								local612 = local580 - local767 - (local578 * (local779 - local767) >> super.anInt8885);
							}
							@Pc(807) float local807 = 1.0F;
							if (local539 != -1) {
								@Pc(819) int local819 = local612 * (local539 & 0x7F) >> 7;
								if (local819 < 2) {
									local819 = 2;
								} else if (local819 > 126) {
									local819 = 126;
								}
								local582 = Static408.anIntArray407[local819 | local539 & 0xFF80];
								if ((this.anInt1703 & 0x7) == 0) {
									local807 = this.aClass100_Sub3_10.aFloatArray71[1] * local614 + this.aClass100_Sub3_10.aFloatArray71[0] * local608 + this.aClass100_Sub3_10.aFloatArray71[2] * local606;
									local807 = local807 * (local807 > 0.0F ? this.aClass100_Sub3_10.aFloat193 : this.aClass100_Sub3_10.aFloat203) + this.aClass100_Sub3_10.aFloat196;
								}
							}
							@Pc(896) Class5 local896 = null;
							if ((local516 & this.anInt1705 - 1) == 0 && (local525 & this.anInt1705 - 1) == 0) {
								local896 = local206.method6943(local570);
							}
							@Pc(1278) int local1278;
							@Pc(956) int local956;
							if (local896 == null) {
								if (local539 == local543) {
									local956 = local582;
								} else {
									@Pc(932) int local932 = (local543 & 0x7F) * local612 >> 7;
									if (local932 < 2) {
										local932 = 2;
									} else if (local932 > 126) {
										local932 = 126;
									}
									local956 = Static408.anIntArray407[local543 & 0xFF80 | local932];
									if ((this.anInt1703 & 0x7) == 0) {
										local696 = this.aClass100_Sub3_10.aFloatArray71[2] * local606 + this.aClass100_Sub3_10.aFloatArray71[1] * local614 + this.aClass100_Sub3_10.aFloatArray71[0] * local608;
										local696 = local807 * (local807 > 0.0F ? this.aClass100_Sub3_10.aFloat193 : this.aClass100_Sub3_10.aFloat203) + this.aClass100_Sub3_10.aFloat196;
										@Pc(1010) int local1010 = local956 >> 16 & 0xFF;
										@Pc(1016) int local1016 = local956 >> 8 & 0xFF;
										local1010 = (int) ((float) local1010 * local696);
										@Pc(1026) int local1026 = local956 & 0xFF;
										local1016 = (int) ((float) local1016 * local696);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										if (local1016 < 0) {
											local1016 = 0;
										} else if (local1016 > 255) {
											local1016 = 255;
										}
										local1026 = (int) ((float) local1026 * local696);
										if (local1026 < 0) {
											local1026 = 0;
										} else if (local1026 > 255) {
											local1026 = 255;
										}
										local956 = local1010 << 16 | local1016 << 8 | local1026;
									}
								}
								if (this.aClass100_Sub3_10.aBoolean735) {
									local183.b((float) local516);
									local183.b((float) (local552 + this.method7625(local516, local525)));
									local183.b((float) local525);
									local183.e((byte) (local956 >> 16));
									local183.e((byte) (local956 >> 8));
									local183.e((byte) local956);
									local183.e(-1);
									local183.b((float) local516);
									local183.b((float) local525);
									if (this.anIntArrayArrayArray6 != null) {
										local183.b((float) (local288 == null ? 0 : local288[local452] - 1));
									}
									if ((this.anInt1703 & 0x7) != 0) {
										local183.b(local608);
										local183.b(local614);
										local183.b(local606);
									}
								} else {
									local183.a((float) local516);
									local183.a((float) (this.method7625(local516, local525) + local552));
									local183.a((float) local525);
									local183.e((byte) (local956 >> 16));
									local183.e((byte) (local956 >> 8));
									local183.e((byte) local956);
									local183.e(-1);
									local183.a((float) local516);
									local183.a((float) local525);
									if (this.anIntArrayArrayArray6 != null) {
										local183.a((float) (local288 == null ? 0 : local288[local452] - 1));
									}
									if ((this.anInt1703 & 0x7) != 0) {
										local183.a(local608);
										local183.a(local614);
										local183.a(local606);
									}
								}
								local1278 = this.anInt1697++;
								local503[local452] = (short) local1278;
								if (local539 != -1) {
									local187[local1278] = local234[local452];
								}
								local206.method6944(new Class5_Sub54(local503[local452]), local570, -12002);
							} else {
								local503[local452] = ((Class5_Sub54) local896).aShort127;
								local1278 = local503[local452] & 0xFFFF;
								if (local539 != -1 && local234[local452].aLong312 < local187[local1278].aLong312) {
									local187[local1278] = local234[local452];
								}
							}
							for (local956 = 0; local956 < local442; local956++) {
								local210[local956].method1773(local582, local807, local1278, local612);
							}
							this.anInt1710++;
						}
					}
				}
			}
			for (local216 = 0; local216 < this.anInt1697; local216++) {
				@Pc(1412) Class5_Sub17 local1412 = local187[local216];
				if (local1412 != null) {
					local1412.method1772(local216);
				}
			}
			@Pc(1447) int local1447;
			for (@Pc(1427) int local1427 = 0; local1427 < super.anInt8883; local1427++) {
				for (@Pc(1431) int local1431 = 0; local1431 < super.anInt8878; local1431++) {
					@Pc(1443) short[] local1443 = this.aShortArrayArray8[local1427 + local1431 * super.anInt8883];
					if (local1443 != null) {
						local1447 = 0;
						@Pc(1449) int local1449 = 0;
						while (local1449 < local1443.length) {
							@Pc(1458) int local1458 = local1443[local1449++] & 0xFFFF;
							@Pc(1465) int local1465 = local1443[local1449++] & 0xFFFF;
							@Pc(1472) int local1472 = local1443[local1449++] & 0xFFFF;
							@Pc(1476) Class5_Sub17 local1476 = local187[local1458];
							@Pc(1480) Class5_Sub17 local1480 = local187[local1465];
							@Pc(1484) Class5_Sub17 local1484 = local187[local1472];
							@Pc(1486) Class5_Sub17 local1486 = null;
							if (local1476 != null) {
								local1476.method1767(local1431, local1427, local1447);
								local1486 = local1476;
							}
							if (local1480 != null) {
								local1480.method1767(local1431, local1427, local1447);
								if (local1486 == null || local1486.aLong312 > local1480.aLong312) {
									local1486 = local1480;
								}
							}
							if (local1484 != null) {
								local1484.method1767(local1431, local1427, local1447);
								if (local1486 == null || local1486.aLong312 > local1484.aLong312) {
									local1486 = local1484;
								}
							}
							if (local1486 != null) {
								if (local1476 != null) {
									local1486.method1772(local1458);
								}
								if (local1480 != null) {
									local1486.method1772(local1465);
								}
								if (local1484 != null) {
									local1486.method1772(local1472);
								}
								local1486.method1767(local1431, local1427, local1447);
							}
							local1447++;
						}
					}
				}
			}
			local183.b();
			this.anInterface17_2 = this.aClass100_Sub3_10.method8694(local183.a(), local149, local178);
			this.aClass207_6 = new Class207(this.anInterface17_2, 5126, 3, 0);
			this.aClass207_5 = new Class207(this.anInterface17_2, 5121, 4, 12);
			@Pc(1655) byte local1655;
			if (this.anIntArrayArrayArray6 == null) {
				local1655 = 24;
				this.aClass207_8 = new Class207(this.anInterface17_2, 5126, 2, 16);
			} else {
				this.aClass207_8 = new Class207(this.anInterface17_2, 5126, 3, 16);
				local1655 = 28;
			}
			if ((this.anInt1703 & 0x7) != 0) {
				this.aClass207_7 = new Class207(this.anInterface17_2, 5126, 3, local1655);
			}
			@Pc(1694) long[] local1694 = new long[this.aClass5_Sub17Array1.length];
			for (local1447 = 0; local1447 < this.aClass5_Sub17Array1.length; local1447++) {
				@Pc(1705) Class5_Sub17 local1705 = this.aClass5_Sub17Array1[local1447];
				local1694[local1447] = local1705.aLong312;
				local1705.method1770(this.anInt1697);
			}
			Static610.method8373(local1694, this.aClass5_Sub17Array1);
			if (this.aClass80_1 != null) {
				this.aClass80_1.method1482();
			}
		} else {
			this.aClass80_1 = null;
		}
		this.aClass306_9 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass5_Sub17ArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray7 = null;
		this.aByteArrayArray5 = null;
		this.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1579(arg2, arg5, arg1, arg0, arg6, arg3, arg4);
	}

	@OriginalMember(owner = "client!dl", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface7 local9 = this.aClass100_Sub3_10.anInterface7_12;
		if (arg3 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt8883][super.anInt8878][];
		}
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt8883][super.anInt8878][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray4[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg3;
		}
		@Pc(104) Class5_Sub17[] local104 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1] = new Class5_Sub17[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt1703 & 0x20) != 0 && local114 != -1 && local9.method7423(local114).aBoolean56) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(164) long local164 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (local118 << 14) | (long) local114;
			@Pc(170) Class5 local170;
			for (local170 = this.aClass306_9.method6943(local164); local170 != null; local170 = this.aClass306_9.method6945()) {
				@Pc(177) Class5_Sub17 local177 = (Class5_Sub17) local170;
				if (local177.anInt1961 == local114 && (float) local118 == local177.aFloat59 && local177.anInt1953 == arg10 && local177.anInt1965 == arg11 && arg12 == local177.anInt1958) {
					break;
				}
			}
			if (local170 == null) {
				local104[local106] = new Class5_Sub17(this, local114, local118, arg10, arg11, arg12);
				this.aClass306_9.method6944(local104[local106], local164, -12002);
			} else {
				local104[local106] = (Class5_Sub17) local170;
			}
		}
		if (arg13) {
			this.aByteArrayArray4[arg0][arg1] = (byte) (this.aByteArrayArray4[arg0][arg1] | 0x1);
		}
		if (this.anInt1711 < arg6.length) {
			this.anInt1711 = arg6.length;
		}
		this.anInt1712 += arg6.length;
	}

	@OriginalMember(owner = "client!dl", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray5[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BIIIII[[ZZ)V")
	private void method1579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[][] arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass5_Sub17Array1 == null) {
			return;
		}
		@Pc(21) int local21 = arg0 + arg0 + 1;
		@Pc(25) int local25 = local21 * local21;
		if (this.aClass100_Sub3_10.anIntArray582.length < local25) {
			this.aClass100_Sub3_10.anIntArray582 = new int[local25];
		}
		if (this.aClass100_Sub3_10.aClass5_Sub36_Sub1_3.aByteArray89.length < this.anInt1710 * 2) {
			this.aClass100_Sub3_10.aClass5_Sub36_Sub1_3 = new Class5_Sub36_Sub1(this.anInt1710 * 2);
		}
		@Pc(68) int local68 = arg3 - arg0;
		@Pc(70) int local70 = local68;
		if (local68 < 0) {
			local68 = 0;
		}
		@Pc(79) int local79 = arg2 - arg0;
		@Pc(81) int local81 = local79;
		if (local79 < 0) {
			local79 = 0;
		}
		@Pc(92) int local92 = arg0 + arg3;
		if (local92 > super.anInt8883 - 1) {
			local92 = super.anInt8883 - 1;
		}
		@Pc(111) int local111 = arg0 + arg2;
		if (local111 > super.anInt8878 - 1) {
			local111 = super.anInt8878 - 1;
		}
		@Pc(128) int local128 = 0;
		@Pc(132) int[] local132 = this.aClass100_Sub3_10.anIntArray582;
		@Pc(145) int local145;
		for (@Pc(134) int local134 = local68; local134 <= local92; local134++) {
			@Pc(143) boolean[] local143 = arg5[local134 - local70];
			for (local145 = local79; local145 <= local111; local145++) {
				if (local143[local145 - local81]) {
					local132[local128++] = local134 + local145 * super.anInt8883;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass100_Sub3_10.method8745();
		} else {
			this.aClass100_Sub3_10.method8703((float) arg1);
			this.aClass100_Sub3_10.method8733();
		}
		this.aClass100_Sub3_10.method8720((this.anInt1703 & 0x7) != 0);
		for (@Pc(231) int local231 = 0; local231 < this.aClass5_Sub17Array1.length; local231++) {
			this.aClass5_Sub17Array1[local231].method1771(local128, local132);
		}
		if (!this.aClass20_6.method367()) {
			local145 = this.aClass100_Sub3_10.lb;
			@Pc(266) int local266 = this.aClass100_Sub3_10.anInt10292;
			this.aClass100_Sub3_10.L(0, local266, this.aClass100_Sub3_10.anInt10267);
			this.aClass100_Sub3_10.method8720(false);
			this.aClass100_Sub3_10.method8735(false);
			this.aClass100_Sub3_10.method8728(128);
			this.aClass100_Sub3_10.method8693(-2);
			this.aClass100_Sub3_10.method8743(this.aClass100_Sub3_10.aClass29_Sub3_6);
			this.aClass100_Sub3_10.method8738(7681, 8448);
			this.aClass100_Sub3_10.method8702(770, 34166, 0);
			this.aClass100_Sub3_10.method8673(34167, 0);
			for (@Pc(326) Class5 local326 = this.aClass20_6.method378(); local326 != null; local326 = this.aClass20_6.method366()) {
				@Pc(331) Class5_Sub47 local331 = (Class5_Sub47) local326;
				local331.method6549(arg0, arg5, arg2, arg3);
			}
			this.aClass100_Sub3_10.method8702(768, 5890, 0);
			this.aClass100_Sub3_10.method8673(5890, 0);
			this.aClass100_Sub3_10.method8743((Class29) null);
			this.aClass100_Sub3_10.L(local145, local266, this.aClass100_Sub3_10.anInt10267);
		}
		if (this.aClass80_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass100_Sub3_10.method8727((Class207) null, this.aClass207_8, this.aClass207_6, (Class207) null);
		this.aClass80_1.method1485(arg6, arg5, arg2, arg3, arg0);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!or;III)V")
	private void method1580(@OriginalArg(0) Class5_Sub1_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass100_Sub3_10.anIntArray581.length) {
			this.aClass100_Sub3_10.anIntArray583 = new int[local22];
			this.aClass100_Sub3_10.anIntArray581 = new int[local22];
		}
		@Pc(44) int[] local44 = this.aClass100_Sub3_10.anIntArray581;
		@Pc(48) int[] local48 = this.aClass100_Sub3_10.anIntArray583;
		for (@Pc(50) int local50 = 0; local50 < local22; local50++) {
			local44[local50] = local12[local50] >> this.aClass100_Sub3_10.anInt10256;
			local48[local50] = local19[local50] >> this.aClass100_Sub3_10.anInt10256;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(92) int local92 = local44[local84];
			@Pc(97) int local97 = local48[local84++];
			@Pc(101) int local101 = local44[local84];
			@Pc(106) int local106 = local48[local84++];
			@Pc(110) int local110 = local44[local84];
			@Pc(115) int local115 = local48[local84++];
			if (-((local106 - local97) * (-local101 + local110)) + (local92 - local101) * (local106 - local115) > 0) {
				arg0.method6263(local101, local92, local110, local97, local115, local106);
			}
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7624(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1712 <= 0) {
			return;
		}
		this.aClass100_Sub3_10.method8680();
		this.aClass100_Sub3_10.method8692(false);
		this.aClass100_Sub3_10.method8720(false);
		this.aClass100_Sub3_10.method8709(false);
		this.aClass100_Sub3_10.method8735(false);
		this.aClass100_Sub3_10.method8728(0);
		this.aClass100_Sub3_10.method8693(-2);
		this.aClass100_Sub3_10.method8743((Class29) null);
		Static185.aFloatArray52[15] = 1.0F;
		Static185.aFloatArray52[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass100_Sub3_10.anInt10175;
		Static185.aFloatArray52[10] = 0.0F;
		Static185.aFloatArray52[3] = 0.0F;
		Static185.aFloatArray52[14] = 0.0F;
		Static185.aFloatArray52[1] = 0.0F;
		Static185.aFloatArray52[9] = 0.0F;
		Static185.aFloatArray52[11] = 0.0F;
		Static185.aFloatArray52[6] = 0.0F;
		Static185.aFloatArray52[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass100_Sub3_10.anInt10154) - 1.0F;
		Static185.aFloatArray52[4] = 0.0F;
		Static185.aFloatArray52[5] = (float) 1024 / ((float) this.aClass100_Sub3_10.anInt10175 * (float) super.anInt8881 * 128.0F);
		Static185.aFloatArray52[7] = 0.0F;
		Static185.aFloatArray52[8] = 0.0F;
		Static185.aFloatArray52[2] = 0.0F;
		Static185.aFloatArray52[0] = (float) 1024 / ((float) super.anInt8881 * 128.0F * (float) this.aClass100_Sub3_10.anInt10154);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static185.aFloatArray52, 0);
		Static185.aFloatArray52[15] = 1.0F;
		Static185.aFloatArray52[1] = 0.0F;
		Static185.aFloatArray52[8] = 0.0F;
		Static185.aFloatArray52[9] = 1.0F;
		Static185.aFloatArray52[13] = 0.0F;
		Static185.aFloatArray52[4] = 0.0F;
		Static185.aFloatArray52[0] = 1.0F;
		Static185.aFloatArray52[12] = 0.0F;
		Static185.aFloatArray52[5] = 0.0F;
		Static185.aFloatArray52[10] = 0.0F;
		Static185.aFloatArray52[14] = 0.0F;
		Static185.aFloatArray52[2] = 0.0F;
		Static185.aFloatArray52[6] = 1.0F;
		Static185.aFloatArray52[11] = 0.0F;
		Static185.aFloatArray52[7] = 0.0F;
		Static185.aFloatArray52[3] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static185.aFloatArray52, 0);
		if ((this.anInt1703 & 0x7) == 0) {
			this.aClass100_Sub3_10.method8720(false);
		} else {
			this.aClass100_Sub3_10.method8720(true);
			this.aClass100_Sub3_10.method8721();
		}
		this.aClass100_Sub3_10.method8727(this.aClass207_5, this.aClass207_8, this.aClass207_6, this.aClass207_7);
		if (this.aClass100_Sub3_10.aClass5_Sub36_Sub1_3.aByteArray89.length >= this.anInt1710 * 2) {
			this.aClass100_Sub3_10.aClass5_Sub36_Sub1_3.anInt8456 = 0;
		} else {
			this.aClass100_Sub3_10.aClass5_Sub36_Sub1_3 = new Class5_Sub36_Sub1(this.anInt1710 * 2);
		}
		@Pc(324) int local324 = 0;
		@Pc(328) Class5_Sub36_Sub1 local328 = this.aClass100_Sub3_10.aClass5_Sub36_Sub1_3;
		@Pc(334) int local334;
		@Pc(343) int local343;
		@Pc(345) int local345;
		@Pc(366) short[] local366;
		@Pc(370) int local370;
		if (this.aClass100_Sub3_10.aBoolean735) {
			for (local334 = arg1; local334 < arg3; local334++) {
				local343 = super.anInt8883 * local334 + arg0;
				for (local345 = arg0; local345 < arg2; local345++) {
					if (arg4[local345 - arg0][local334 - arg1]) {
						local366 = this.aShortArrayArray8[local343];
						if (local366 != null) {
							for (local370 = 0; local370 < local366.length; local370++) {
								local324++;
								local328.method7296(local366[local370] & 0xFFFF);
							}
						}
					}
					local343++;
				}
			}
		} else {
			for (local334 = arg1; local334 < arg3; local334++) {
				local343 = arg0 + local334 * super.anInt8883;
				for (local345 = arg0; local345 < arg2; local345++) {
					if (arg4[local345 - arg0][local334 - arg1]) {
						local366 = this.aShortArrayArray8[local343];
						if (local366 != null) {
							for (local370 = 0; local370 < local366.length; local370++) {
								local324++;
								local328.method7279(local366[local370] & 0xFFFF);
							}
						}
					}
					local343++;
				}
			}
		}
		if (local324 > 0) {
			@Pc(511) Class276_Sub2 local511 = new Class276_Sub2(this.aClass100_Sub3_10, 5123, local328.aByteArray89, local328.anInt8456);
			this.aClass100_Sub3_10.method8707(local511, 0, local324);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1579(arg2, -1, arg1, arg0, arg5, arg3, arg4);
	}

	@OriginalMember(owner = "client!dl", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub1_Sub15 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub15 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(25) int local25 = super.anInt8881 >> this.aClass100_Sub3_10.anInt10256;
		@Pc(28) Class5_Sub1_Sub15_Sub1 local28 = (Class5_Sub1_Sub15_Sub1) arg2;
		@Pc(40) Class5_Sub1_Sub15_Sub1 local40;
		if (local28 != null && local28.method6260(local25, local25)) {
			local40 = local28;
			local28.method6262();
		} else {
			local40 = new Class5_Sub1_Sub15_Sub1(this.aClass100_Sub3_10, local25, local25);
		}
		local40.method6259(0, 0, local25, local25);
		this.method1580(local40, arg0, arg1);
		return local40;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!ih;[I)V")
	@Override
	public void method7623(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass20_6.method370(new Class5_Sub47(this.aClass100_Sub3_10, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!dl", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass80_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass100_Sub3_10.anInt10287 * arg2 >> 8) >> this.aClass100_Sub3_10.anInt10256;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass100_Sub3_10.anInt10290 >> 8) >> this.aClass100_Sub3_10.anInt10256;
			this.aClass80_1.method1486(local42, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7619(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass80_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass100_Sub3_10.anInt10287 >> 8) >> this.aClass100_Sub3_10.anInt10256;
			@Pc(42) int local42 = arg3 - (this.aClass100_Sub3_10.anInt10290 * arg2 >> 8) >> this.aClass100_Sub3_10.anInt10256;
			return this.aClass80_1.method1481(local27, arg0, local42);
		}
	}
}
