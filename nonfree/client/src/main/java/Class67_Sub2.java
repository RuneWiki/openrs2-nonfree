import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!dga", name = "A", descriptor = "I")
	private int anInt1977;

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!dga", name = "R", descriptor = "I")
	private int anInt1987;

	@OriginalMember(owner = "client!dga", name = "Y", descriptor = "Lclient!gv;")
	private Class131 aClass131_4;

	@OriginalMember(owner = "client!dga", name = "ab", descriptor = "I")
	private int anInt1990;

	@OriginalMember(owner = "client!dga", name = "bb", descriptor = "Lclient!gv;")
	public Class131 aClass131_5;

	@OriginalMember(owner = "client!dga", name = "cb", descriptor = "[Lclient!ci;")
	private Class2_Sub11[] aClass2_Sub11Array1;

	@OriginalMember(owner = "client!dga", name = "db", descriptor = "Lclient!gv;")
	public Class131 aClass131_6;

	@OriginalMember(owner = "client!dga", name = "fb", descriptor = "Lclient!gv;")
	public Class131 aClass131_7;

	@OriginalMember(owner = "client!dga", name = "gb", descriptor = "I")
	private int anInt1991;

	@OriginalMember(owner = "client!dga", name = "kb", descriptor = "Lclient!nl;")
	private Interface18 anInterface18_2;

	@OriginalMember(owner = "client!dga", name = "Q", descriptor = "Lclient!ae;")
	private final Class8 aClass8_10 = new Class8();

	@OriginalMember(owner = "client!dga", name = "z", descriptor = "I")
	private final int anInt1976 = this.anInt8108 - 2;

	@OriginalMember(owner = "client!dga", name = "F", descriptor = "Lclient!qj;")
	public final Class100_Sub3 aClass100_Sub3_13;

	@OriginalMember(owner = "client!dga", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!dga", name = "T", descriptor = "[[[Lclient!ci;")
	private Class2_Sub11[][][] aClass2_Sub11ArrayArrayArray1;

	@OriginalMember(owner = "client!dga", name = "V", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!dga", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!dga", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
	public final int anInt1980;

	@OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
	private final int anInt1975;

	@OriginalMember(owner = "client!dga", name = "I", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!dga", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!dga", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!dga", name = "X", descriptor = "[[B")
	private final byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!dga", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!dga", name = "jb", descriptor = "Lclient!il;")
	private Class162 aClass162_13;

	@OriginalMember(owner = "client!dga", name = "U", descriptor = "Lclient!iu;")
	private Class166 aClass166_1;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!qj;IIII[[I[[II)V")
	public Class67_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass100_Sub3_13 = arg0;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aClass2_Sub11ArrayArrayArray1 = new Class2_Sub11[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt8111 + 1][super.anInt8110 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aFloatArrayArray9 = new float[super.anInt8111 + 1][super.anInt8110 + 1];
		this.anInt1980 = arg2;
		this.anInt1975 = 0x1 << this.anInt1976;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aShortArrayArray2 = new short[arg4 * arg3][];
		this.aFloatArrayArray8 = new float[super.anInt8111 + 1][super.anInt8110 + 1];
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
		this.aByteArrayArray5 = new byte[arg3][arg4];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt8110; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt8111; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local138 * local138 + local155 * local155)));
				this.aFloatArrayArray9[local119][local115] = (float) local138 * local175;
				this.aFloatArrayArray7[local119][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray8[local119][local115] = (float) local155 * local175;
			}
		}
		this.aClass162_13 = new Class162(128);
		if ((this.anInt1980 & 0x10) != 0) {
			this.aClass166_1 = new Class166(this.aClass100_Sub3_13, this);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!gga;[I)V")
	@Override
	public void method6709(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_10.method212(new Class2_Sub9(this.aClass100_Sub3_13, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!dga", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt1990 <= 0) {
			this.aClass166_1 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt8111 + 1][super.anInt8110 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; local21 < super.anInt8111; local21++) {
				for (local25 = 1; super.anInt8110 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray6[local21 - 1][local25] >> 2) + (this.aByteArrayArray6[local21 + 1][local25] >> 3) + (this.aByteArrayArray6[local21][local25 + -1] >> 2) + (this.aByteArrayArray6[local21][local25 - -1] >> 3) + (this.aByteArrayArray6[local21][local25] >> 1));
				}
			}
			this.aClass2_Sub11Array1 = new Class2_Sub11[this.aClass162_13.method3524()];
			this.aClass162_13.method3520(this.aClass2_Sub11Array1);
			for (local25 = 0; local25 < this.aClass2_Sub11Array1.length; local25++) {
				this.aClass2_Sub11Array1[local25].method1020(this.anInt1990);
			}
			@Pc(133) int local133 = 24;
			if (this.anIntArrayArrayArray13 != null) {
				local133 += 4;
			}
			if ((this.anInt1980 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass100_Sub3_13.aNativeHeap6.a(this.anInt1990 * local133, false);
			@Pc(161) Stream local161 = new Stream(local156);
			@Pc(165) Class2_Sub11[] local165 = new Class2_Sub11[this.anInt1990];
			@Pc(172) int local172 = Static285.method5287(this.anInt1990 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(182) Class162 local182 = new Class162(local172);
			@Pc(186) Class2_Sub11[] local186 = new Class2_Sub11[this.anInt1991];
			@Pc(192) int local192;
			for (@Pc(188) int local188 = 0; super.anInt8111 > local188; local188++) {
				for (local192 = 0; local192 < super.anInt8110; local192++) {
					if (this.anIntArrayArrayArray11[local188][local192] != null) {
						@Pc(208) Class2_Sub11[] local208 = this.aClass2_Sub11ArrayArrayArray1[local188][local192];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray9[local188][local192];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray14[local188][local192];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray10[local188][local192];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray11[local188][local192];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local188][local192];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(264) int[] local264 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local188][local192];
						@Pc(271) float local271 = this.aFloatArrayArray9[local188][local192];
						@Pc(278) float local278 = this.aFloatArrayArray7[local188][local192];
						@Pc(285) float local285 = this.aFloatArrayArray8[local188][local192];
						@Pc(294) float local294 = this.aFloatArrayArray9[local188][local192 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray7[local188][local192 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray8[local188][local192 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray9[local188 + 1][local192 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray7[local188 + 1][local192 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray8[local188 + 1][local192 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray9[local188 + 1][local192];
						@Pc(363) float local363 = this.aFloatArrayArray7[local188 + 1][local192];
						@Pc(372) float local372 = this.aFloatArrayArray8[local188 + 1][local192];
						@Pc(380) int local380 = local19[local188][local192] & 0xFF;
						@Pc(390) int local390 = local19[local188][local192 + 1] & 0xFF;
						@Pc(402) int local402 = local19[local188 + 1][local192 + 1] & 0xFF;
						@Pc(412) int local412 = local19[local188 + 1][local192] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(424) int local424;
						label335: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(422) Class2_Sub11 local422 = local208[local416];
							for (local424 = 0; local424 < local414; local424++) {
								if (local186[local424] == local422) {
									continue label335;
								}
							}
							local186[local414++] = local422;
						}
						@Pc(462) short[] local462 = this.aShortArrayArray2[super.anInt8111 * local192 + local188] = new short[local236.length];
						for (local424 = 0; local424 < local236.length; local424++) {
							@Pc(475) int local475 = (local188 << super.anInt8108) + local215[local424];
							@Pc(484) int local484 = (local192 << super.anInt8108) + local222[local424];
							@Pc(489) int local489 = local475 >> this.anInt1976;
							@Pc(494) int local494 = local484 >> this.anInt1976;
							@Pc(498) int local498 = local236[local424];
							@Pc(502) int local502 = local229[local424];
							@Pc(510) int local510 = local248 == null ? 0 : local248[local424];
							@Pc(528) long local528 = (long) (local489 << 16) | (long) local502 << 48 | (long) local498 << 32 | (long) local494;
							@Pc(532) int local532 = local215[local424];
							@Pc(536) int local536 = local222[local424];
							@Pc(538) byte local538 = 74;
							@Pc(540) int local540 = 0;
							@Pc(557) float local557;
							@Pc(551) float local551;
							@Pc(549) float local549;
							@Pc(617) float local617;
							@Pc(555) int local555;
							if (local532 == 0 && local536 == 0) {
								local549 = local285;
								local551 = local278;
								local555 = local538 - local380;
								local557 = local271;
							} else if (local532 == 0 && super.anInt8104 == local536) {
								local551 = local303;
								local549 = local312;
								local555 = local538 - local390;
								local557 = local294;
							} else if (local532 == super.anInt8104 && super.anInt8104 == local536) {
								local557 = local323;
								local551 = local334;
								local555 = local538 - local402;
								local549 = local345;
							} else if (super.anInt8104 == local532 && local536 == 0) {
								local557 = local354;
								local549 = local372;
								local551 = local363;
								local555 = local538 - local412;
							} else {
								@Pc(593) float local593 = (float) local532 / (float) super.anInt8104;
								@Pc(600) float local600 = (float) local536 / (float) super.anInt8104;
								@Pc(608) float local608 = local271 + (local354 - local271) * local593;
								local617 = local278 + (local363 - local278) * local593;
								@Pc(626) float local626 = (local372 - local285) * local593 + local285;
								@Pc(634) float local634 = local294 + (local323 - local294) * local593;
								@Pc(642) float local642 = local593 * (local334 - local303) + local303;
								local551 = local617 + (local642 - local617) * local600;
								local557 = local600 * (local634 - local608) + local608;
								@Pc(666) float local666 = local312 + local593 * (local345 - local312);
								local549 = local626 + (local666 - local626) * local600;
								@Pc(686) int local686 = (local532 * (local412 - local380) >> super.anInt8108) + local380;
								@Pc(698) int local698 = local390 + ((local402 - local390) * local532 >> super.anInt8108);
								local555 = local538 - ((local698 - local686) * local536 >> super.anInt8108) - local686;
							}
							@Pc(750) float local750 = 1.0F;
							if (local498 != -1) {
								@Pc(762) int local762 = (local498 & 0x7F) * local555 >> 7;
								if (local762 < 2) {
									local762 = 2;
								} else if (local762 > 126) {
									local762 = 126;
								}
								local540 = Static250.anIntArray314[local498 & 0xFF80 | local762];
								if ((this.anInt1980 & 0x7) == 0) {
									local750 = local557 * this.aClass100_Sub3_13.aFloatArray62[0] + local551 * this.aClass100_Sub3_13.aFloatArray62[1] + local549 * this.aClass100_Sub3_13.aFloatArray62[2];
									local750 = local750 * (local750 > 0.0F ? this.aClass100_Sub3_13.aFloat214 : this.aClass100_Sub3_13.aFloat221) + this.aClass100_Sub3_13.aFloat223;
								}
							}
							@Pc(831) Class2 local831 = null;
							if ((local475 & this.anInt1975 - 1) == 0 && (local484 & this.anInt1975 - 1) == 0) {
								local831 = local182.method3519(local528);
							}
							@Pc(1190) int local1190;
							@Pc(864) int local864;
							if (local831 == null) {
								if (local498 == local502) {
									local864 = local540;
								} else {
									@Pc(874) int local874 = (local502 & 0x7F) * local555 >> 7;
									if (local874 < 2) {
										local874 = 2;
									} else if (local874 > 126) {
										local874 = 126;
									}
									local864 = Static250.anIntArray314[local502 & 0xFF80 | local874];
									if ((this.anInt1980 & 0x7) == 0) {
										local617 = this.aClass100_Sub3_13.aFloatArray62[2] * local549 + local551 * this.aClass100_Sub3_13.aFloatArray62[1] + local557 * this.aClass100_Sub3_13.aFloatArray62[0];
										local617 = this.aClass100_Sub3_13.aFloat223 + local750 * (local750 > 0.0F ? this.aClass100_Sub3_13.aFloat214 : this.aClass100_Sub3_13.aFloat221);
										@Pc(952) int local952 = local864 >> 16 & 0xFF;
										@Pc(958) int local958 = local864 >> 8 & 0xFF;
										@Pc(962) int local962 = local864 & 0xFF;
										local952 = (int) ((float) local952 * local617);
										local958 = (int) ((float) local958 * local617);
										if (local952 < 0) {
											local952 = 0;
										} else if (local952 > 255) {
											local952 = 255;
										}
										local962 = (int) ((float) local962 * local617);
										if (local958 < 0) {
											local958 = 0;
										} else if (local958 > 255) {
											local958 = 255;
										}
										if (local962 < 0) {
											local962 = 0;
										} else if (local962 > 255) {
											local962 = 255;
										}
										local864 = local962 | local952 << 16 | local958 << 8;
									}
								}
								if (this.aClass100_Sub3_13.aBoolean595) {
									local161.a((float) local475);
									local161.a((float) (local510 + this.method6711(local484, local475)));
									local161.a((float) local484);
									local161.d((byte) (local864 >> 16));
									local161.d((byte) (local864 >> 8));
									local161.d((byte) local864);
									local161.d(-1);
									local161.a((float) local475);
									local161.a((float) local484);
									if (this.anIntArrayArrayArray13 != null) {
										local161.a((float) (local264 == null ? 0 : local264[local424] - 1));
									}
									if ((this.anInt1980 & 0x7) != 0) {
										local161.a(local557);
										local161.a(local551);
										local161.a(local549);
									}
								} else {
									local161.b((float) local475);
									local161.b((float) (local510 + this.method6711(local484, local475)));
									local161.b((float) local484);
									local161.d((byte) (local864 >> 16));
									local161.d((byte) (local864 >> 8));
									local161.d((byte) local864);
									local161.d(-1);
									local161.b((float) local475);
									local161.b((float) local484);
									if (this.anIntArrayArrayArray13 != null) {
										local161.b((float) (local264 == null ? 0 : local264[local424] - 1));
									}
									if ((this.anInt1980 & 0x7) != 0) {
										local161.b(local557);
										local161.b(local551);
										local161.b(local549);
									}
								}
								local1190 = this.anInt1987++;
								local462[local424] = (short) local1190;
								if (local498 != -1) {
									local165[local1190] = local208[local424];
								}
								local182.method3522(new Class2_Sub29(local462[local424]), local528);
							} else {
								local462[local424] = ((Class2_Sub29) local831).aShort60;
								local1190 = local462[local424] & 0xFFFF;
								if (local498 != -1 && local165[local1190].aLong268 > local208[local424].aLong268) {
									local165[local1190] = local208[local424];
								}
							}
							for (local864 = 0; local864 < local414; local864++) {
								local186[local864].method1022(local555, local1190, local540, local750);
							}
							this.anInt1977++;
						}
					}
				}
			}
			for (local192 = 0; local192 < this.anInt1987; local192++) {
				@Pc(1307) Class2_Sub11 local1307 = local165[local192];
				if (local1307 != null) {
					local1307.method1025(local192);
				}
			}
			@Pc(1344) int local1344;
			for (@Pc(1324) int local1324 = 0; local1324 < super.anInt8111; local1324++) {
				for (@Pc(1328) int local1328 = 0; super.anInt8110 > local1328; local1328++) {
					@Pc(1340) short[] local1340 = this.aShortArrayArray2[local1324 + local1328 * super.anInt8111];
					if (local1340 != null) {
						local1344 = 0;
						@Pc(1346) int local1346 = 0;
						while (local1346 < local1340.length) {
							@Pc(1355) int local1355 = local1340[local1346++] & 0xFFFF;
							@Pc(1362) int local1362 = local1340[local1346++] & 0xFFFF;
							@Pc(1369) int local1369 = local1340[local1346++] & 0xFFFF;
							@Pc(1373) Class2_Sub11 local1373 = local165[local1355];
							@Pc(1377) Class2_Sub11 local1377 = local165[local1362];
							@Pc(1381) Class2_Sub11 local1381 = local165[local1369];
							@Pc(1383) Class2_Sub11 local1383 = null;
							if (local1373 != null) {
								local1383 = local1373;
								local1373.method1027(local1324, local1344, local1328);
							}
							if (local1377 != null) {
								local1377.method1027(local1324, local1344, local1328);
								if (local1383 == null || local1383.aLong268 > local1377.aLong268) {
									local1383 = local1377;
								}
							}
							if (local1381 != null) {
								local1381.method1027(local1324, local1344, local1328);
								if (local1383 == null || local1383.aLong268 > local1381.aLong268) {
									local1383 = local1381;
								}
							}
							if (local1383 != null) {
								if (local1373 != null) {
									local1383.method1025(local1355);
								}
								if (local1377 != null) {
									local1383.method1025(local1362);
								}
								if (local1381 != null) {
									local1383.method1025(local1369);
								}
								local1383.method1027(local1324, local1344, local1328);
							}
							local1344++;
						}
					}
				}
			}
			local161.c();
			this.anInterface18_2 = this.aClass100_Sub3_13.method6292(local133, local161.b(), local156);
			this.aClass131_5 = new Class131(this.anInterface18_2, 5126, 3, 0);
			this.aClass131_4 = new Class131(this.anInterface18_2, 5121, 4, 12);
			@Pc(1520) byte local1520;
			if (this.anIntArrayArrayArray13 == null) {
				this.aClass131_7 = new Class131(this.anInterface18_2, 5126, 2, 16);
				local1520 = 24;
			} else {
				local1520 = 28;
				this.aClass131_7 = new Class131(this.anInterface18_2, 5126, 3, 16);
			}
			if ((this.anInt1980 & 0x7) != 0) {
				this.aClass131_6 = new Class131(this.anInterface18_2, 5126, 3, local1520);
			}
			@Pc(1564) long[] local1564 = new long[this.aClass2_Sub11Array1.length];
			for (local1344 = 0; local1344 < this.aClass2_Sub11Array1.length; local1344++) {
				@Pc(1573) Class2_Sub11 local1573 = this.aClass2_Sub11Array1[local1344];
				local1564[local1344] = local1573.aLong268;
				local1573.method1024(this.anInt1987);
			}
			Static477.method6771(local1564, this.aClass2_Sub11Array1);
			if (this.aClass166_1 != null) {
				this.aClass166_1.method3634();
			}
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass2_Sub11ArrayArrayArray1 = null;
		this.aClass162_13 = null;
		this.aByteArrayArray6 = null;
		this.anIntArrayArrayArray12 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!dga", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass166_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass100_Sub3_13.anInt7701 >> 8) >> this.aClass100_Sub3_13.anInt7665;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass100_Sub3_13.anInt7702 >> 8) >> this.aClass100_Sub3_13.anInt7665;
			this.aClass166_1.method3637(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1446(arg2, arg4, arg3, arg5, arg1, arg0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6713(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1990 <= 0) {
			return;
		}
		this.aClass100_Sub3_13.method6333();
		this.aClass100_Sub3_13.method6288(false);
		this.aClass100_Sub3_13.method6327(false);
		this.aClass100_Sub3_13.method6324(false);
		this.aClass100_Sub3_13.method6270(false);
		this.aClass100_Sub3_13.method6334(0);
		this.aClass100_Sub3_13.method6278(-2);
		this.aClass100_Sub3_13.method6277(null);
		Static169.aFloatArray24[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass100_Sub3_13.anInt7521;
		Static169.aFloatArray24[8] = 0.0F;
		Static169.aFloatArray24[0] = (float) 1024 / ((float) this.aClass100_Sub3_13.anInt7626 * (float) super.anInt8104 * 128.0F);
		Static169.aFloatArray24[5] = (float) 1024 / ((float) this.aClass100_Sub3_13.anInt7521 * 128.0F * (float) super.anInt8104);
		Static169.aFloatArray24[2] = 0.0F;
		Static169.aFloatArray24[4] = 0.0F;
		Static169.aFloatArray24[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass100_Sub3_13.anInt7626) - 1.0F;
		Static169.aFloatArray24[15] = 1.0F;
		Static169.aFloatArray24[11] = 0.0F;
		Static169.aFloatArray24[7] = 0.0F;
		Static169.aFloatArray24[10] = 0.0F;
		Static169.aFloatArray24[1] = 0.0F;
		Static169.aFloatArray24[14] = 0.0F;
		Static169.aFloatArray24[6] = 0.0F;
		Static169.aFloatArray24[3] = 0.0F;
		Static169.aFloatArray24[9] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static169.aFloatArray24, 0);
		Static169.aFloatArray24[4] = 0.0F;
		Static169.aFloatArray24[10] = 0.0F;
		Static169.aFloatArray24[6] = 1.0F;
		Static169.aFloatArray24[1] = 0.0F;
		Static169.aFloatArray24[11] = 0.0F;
		Static169.aFloatArray24[2] = 0.0F;
		Static169.aFloatArray24[9] = 1.0F;
		Static169.aFloatArray24[5] = 0.0F;
		Static169.aFloatArray24[7] = 0.0F;
		Static169.aFloatArray24[3] = 0.0F;
		Static169.aFloatArray24[12] = 0.0F;
		Static169.aFloatArray24[14] = 0.0F;
		Static169.aFloatArray24[8] = 0.0F;
		Static169.aFloatArray24[0] = 1.0F;
		Static169.aFloatArray24[15] = 1.0F;
		Static169.aFloatArray24[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static169.aFloatArray24, 0);
		if ((this.anInt1980 & 0x7) == 0) {
			this.aClass100_Sub3_13.method6327(false);
		} else {
			this.aClass100_Sub3_13.method6327(true);
			this.aClass100_Sub3_13.method6279();
		}
		this.aClass100_Sub3_13.method6302(this.aClass131_5, this.aClass131_4, this.aClass131_7, this.aClass131_6);
		if (this.anInt1977 * 2 <= this.aClass100_Sub3_13.aClass2_Sub15_Sub1_2.aByteArray62.length) {
			this.aClass100_Sub3_13.aClass2_Sub15_Sub1_2.anInt5241 = 0;
		} else {
			this.aClass100_Sub3_13.aClass2_Sub15_Sub1_2 = new Class2_Sub15_Sub1(this.anInt1977 * 2);
		}
		@Pc(308) int local308 = 0;
		@Pc(312) Class2_Sub15_Sub1 local312 = this.aClass100_Sub3_13.aClass2_Sub15_Sub1_2;
		@Pc(318) int local318;
		@Pc(327) int local327;
		@Pc(329) int local329;
		@Pc(347) short[] local347;
		@Pc(351) int local351;
		if (this.aClass100_Sub3_13.aBoolean595) {
			for (local318 = arg1; local318 < arg3; local318++) {
				local327 = local318 * super.anInt8111 + arg0;
				for (local329 = arg0; local329 < arg2; local329++) {
					if (arg4[local329 - arg0][local318 - arg1]) {
						local347 = this.aShortArrayArray2[local327];
						if (local347 != null) {
							for (local351 = 0; local351 < local347.length; local351++) {
								local308++;
								local312.method4350(local347[local351] & 0xFFFF);
							}
						}
					}
					local327++;
				}
			}
		} else {
			for (local318 = arg1; local318 < arg3; local318++) {
				local327 = arg0 + super.anInt8111 * local318;
				for (local329 = arg0; local329 < arg2; local329++) {
					if (arg4[local329 - arg0][local318 - arg1]) {
						local347 = this.aShortArrayArray2[local327];
						if (local347 != null) {
							for (local351 = 0; local351 < local347.length; local351++) {
								local312.method4308(local347[local351] & 0xFFFF);
								local308++;
							}
						}
					}
					local327++;
				}
			}
		}
		if (local308 > 0) {
			@Pc(466) Class44_Sub2 local466 = new Class44_Sub2(this.aClass100_Sub3_13, 5123, local312.aByteArray62, local312.anInt5241);
			this.aClass100_Sub3_13.method6295(local308, 0, local466);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method1446(arg2, arg4, arg3, -1, arg1, arg0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZ[[ZIIBI)V")
	private void method1446(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass2_Sub11Array1 == null) {
			return;
		}
		@Pc(19) int local19 = arg0 + arg0 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (local23 > this.aClass100_Sub3_13.anIntArray512.length) {
			this.aClass100_Sub3_13.anIntArray512 = new int[local23];
		}
		if (this.aClass100_Sub3_13.aClass2_Sub15_Sub1_2.aByteArray62.length < this.anInt1977 * 2) {
			this.aClass100_Sub3_13.aClass2_Sub15_Sub1_2 = new Class2_Sub15_Sub1(this.anInt1977 * 2);
		}
		@Pc(59) int local59 = arg5 - arg0;
		@Pc(61) int local61 = local59;
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(70) int local70 = arg4 - arg0;
		@Pc(72) int local72 = local70;
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(83) int local83 = arg0 + arg5;
		if (local83 > super.anInt8111 - 1) {
			local83 = super.anInt8111 - 1;
		}
		@Pc(102) int local102 = arg0 + arg4;
		if (super.anInt8110 - 1 < local102) {
			local102 = super.anInt8110 - 1;
		}
		@Pc(119) int local119 = 0;
		@Pc(123) int[] local123 = this.aClass100_Sub3_13.anIntArray512;
		@Pc(136) int local136;
		for (@Pc(125) int local125 = local59; local125 <= local83; local125++) {
			@Pc(134) boolean[] local134 = arg2[local125 - local61];
			for (local136 = local70; local136 <= local102; local136++) {
				if (local134[local136 - local72]) {
					local123[local119++] = super.anInt8111 * local136 + local125;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass100_Sub3_13.method6305();
		} else {
			this.aClass100_Sub3_13.method6294((float) arg3);
			this.aClass100_Sub3_13.method6267();
		}
		this.aClass100_Sub3_13.method6327((this.anInt1980 & 0x7) != 0);
		for (@Pc(199) int local199 = 0; local199 < this.aClass2_Sub11Array1.length; local199++) {
			this.aClass2_Sub11Array1[local199].method1023(local119, local123);
		}
		if (!this.aClass8_10.method219()) {
			local136 = this.aClass100_Sub3_13.anInt7682;
			@Pc(228) int local228 = this.aClass100_Sub3_13.bf;
			this.aClass100_Sub3_13.pa(0, local228, this.aClass100_Sub3_13.anInt7679);
			this.aClass100_Sub3_13.method6327(false);
			this.aClass100_Sub3_13.method6270(false);
			this.aClass100_Sub3_13.method6334(128);
			this.aClass100_Sub3_13.method6278(-2);
			this.aClass100_Sub3_13.method6277(this.aClass100_Sub3_13.aClass23_Sub1_5);
			this.aClass100_Sub3_13.method6300(8448, 7681);
			this.aClass100_Sub3_13.method6283(0, 770, 34166);
			this.aClass100_Sub3_13.method6332(34167, 0);
			for (@Pc(288) Class2 local288 = this.aClass8_10.method210(); local288 != null; local288 = this.aClass8_10.method218()) {
				@Pc(293) Class2_Sub9 local293 = (Class2_Sub9) local288;
				local293.method980(arg2, arg5, arg0, arg4);
			}
			this.aClass100_Sub3_13.method6283(0, 768, 5890);
			this.aClass100_Sub3_13.method6332(5890, 0);
			this.aClass100_Sub3_13.method6277(null);
			this.aClass100_Sub3_13.pa(local136, local228, this.aClass100_Sub3_13.anInt7679);
		}
		if (this.aClass166_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass100_Sub3_13.method6302(this.aClass131_5, null, this.aClass131_7, null);
		this.aClass166_1.method3632(arg5, arg4, arg2, arg1, arg0);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6705(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass166_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass100_Sub3_13.anInt7701 >> 8) >> this.aClass100_Sub3_13.anInt7665;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass100_Sub3_13.anInt7702 >> 8) >> this.aClass100_Sub3_13.anInt7665;
			return this.aClass166_1.method3633(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!dga", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass166_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass100_Sub3_13.anInt7701 >> 8) >> this.aClass100_Sub3_13.anInt7665;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass100_Sub3_13.anInt7702 >> 8) >> this.aClass100_Sub3_13.anInt7665;
			this.aClass166_1.method3635(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub3_Sub6 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub6 arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8104 >> this.aClass100_Sub3_13.anInt7665;
		@Pc(24) Class2_Sub3_Sub6_Sub2 local24 = (Class2_Sub3_Sub6_Sub2) arg2;
		@Pc(40) Class2_Sub3_Sub6_Sub2 local40;
		if (local24 != null && local24.method7632(local21, local21)) {
			local40 = local24;
			local24.method7629();
		} else {
			local40 = new Class2_Sub3_Sub6_Sub2(this.aClass100_Sub3_13, local21, local21);
		}
		local40.method7628(0, 0, local21, local21);
		this.method1448(arg1, arg0, local40);
		return local40;
	}

	@OriginalMember(owner = "client!dga", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt8111][super.anInt8110][];
		}
		if (arg3 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt8111][super.anInt8110][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray14[arg0][arg1] = arg4;
		this.anIntArrayArrayArray11[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub11[] local88 = this.aClass2_Sub11ArrayArrayArray1[arg0][arg1] = new Class2_Sub11[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
			@Pc(125) Class2 local125;
			for (local125 = this.aClass162_13.method3519(local119); local125 != null; local125 = this.aClass162_13.method3528()) {
				@Pc(130) Class2_Sub11 local130 = (Class2_Sub11) local125;
				if (local130.anInt1470 == arg8[local90] && local130.aFloat26 == (float) arg9[local90] && local130.anInt1469 == arg10 && local130.anInt1471 == arg11 && local130.anInt1467 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub11(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass162_13.method3522(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub11) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray5[arg0][arg1] = (byte) (this.aByteArrayArray5[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt1991) {
			this.anInt1991 = arg6.length;
		}
		this.anInt1990 += arg6.length;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIILclient!vg;)V")
	private void method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub3_Sub6_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray14[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass100_Sub3_13.anIntArray513.length) {
			this.aClass100_Sub3_13.anIntArray511 = new int[local22];
			this.aClass100_Sub3_13.anIntArray513 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass100_Sub3_13.anIntArray513;
		@Pc(46) int[] local46 = this.aClass100_Sub3_13.anIntArray511;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass100_Sub3_13.anInt7665;
			local46[local48] = local19[local48] >> this.aClass100_Sub3_13.anInt7665;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(86) int local86 = local42[local80];
			@Pc(91) int local91 = local46[local80++];
			@Pc(95) int local95 = local42[local80];
			@Pc(100) int local100 = local46[local80++];
			@Pc(104) int local104 = local42[local80];
			@Pc(109) int local109 = local46[local80++];
			if (-((local100 - local91) * (local104 + -local95)) + (local86 - local95) * (-local109 + local100) > 0) {
				arg2.method7631(local109, local86, local104, local95, local91, local100);
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V")
	@Override
	public void method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray6[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray6[arg0][arg1] = (byte) arg2;
		}
	}
}
