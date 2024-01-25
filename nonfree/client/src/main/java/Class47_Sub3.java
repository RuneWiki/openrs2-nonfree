import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class47_Sub3 extends Class47 {

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
	private int anInt9217;

	@OriginalMember(owner = "client!vfa", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!vfa", name = "N", descriptor = "I")
	private int anInt9229;

	@OriginalMember(owner = "client!vfa", name = "Y", descriptor = "Lclient!lq;")
	private Class213 aClass213_13;

	@OriginalMember(owner = "client!vfa", name = "ab", descriptor = "Lclient!lq;")
	public Class213 aClass213_14;

	@OriginalMember(owner = "client!vfa", name = "bb", descriptor = "Lclient!lq;")
	public Class213 aClass213_15;

	@OriginalMember(owner = "client!vfa", name = "eb", descriptor = "Lclient!cd;")
	private Interface5 anInterface5_7;

	@OriginalMember(owner = "client!vfa", name = "fb", descriptor = "Lclient!lq;")
	public Class213 aClass213_16;

	@OriginalMember(owner = "client!vfa", name = "hb", descriptor = "I")
	private int anInt9235;

	@OriginalMember(owner = "client!vfa", name = "jb", descriptor = "[Lclient!nm;")
	private Class1_Sub37[] aClass1_Sub37Array1;

	@OriginalMember(owner = "client!vfa", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!vfa", name = "T", descriptor = "Lclient!wba;")
	private final Class353 aClass353_63 = new Class353();

	@OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
	private final int anInt9227 = this.anInt9205 - 2;

	@OriginalMember(owner = "client!vfa", name = "z", descriptor = "Lclient!ok;")
	public final Class134_Sub2 aClass134_Sub2_42;

	@OriginalMember(owner = "client!vfa", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!vfa", name = "D", descriptor = "[[B")
	private final byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!vfa", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!vfa", name = "Z", descriptor = "[[B")
	private byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!vfa", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!vfa", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!vfa", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!vfa", name = "w", descriptor = "I")
	private final int anInt9221;

	@OriginalMember(owner = "client!vfa", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!vfa", name = "J", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!vfa", name = "H", descriptor = "[[[Lclient!nm;")
	private Class1_Sub37[][][] aClass1_Sub37ArrayArrayArray1;

	@OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
	public final int anInt9214;

	@OriginalMember(owner = "client!vfa", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!vfa", name = "B", descriptor = "[[S")
	public final short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!vfa", name = "mb", descriptor = "Lclient!kea;")
	private Class187 aClass187_42;

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "Lclient!fda;")
	private Class100 aClass100_2;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!ok;IIII[[I[[II)V")
	public Class47_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass134_Sub2_42 = arg0;
		this.aFloatArrayArray14 = new float[super.anInt9209 + 1][super.anInt9210 + 1];
		this.aByteArrayArray34 = new byte[arg3][arg4];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aByteArrayArray35 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray13 = new float[super.anInt9209 + 1][super.anInt9210 + 1];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.anInt9221 = 0x1 << this.anInt9227;
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aClass1_Sub37ArrayArrayArray1 = new Class1_Sub37[arg3][arg4][];
		this.anInt9214 = arg2;
		this.aFloatArrayArray15 = new float[super.anInt9209 + 1][super.anInt9210 + 1];
		this.aShortArrayArray13 = new short[arg4 * arg3][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9210; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9209 > local119; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (local154 * local154 + local137 * local137 + arg7 * 4 * arg7)));
				this.aFloatArrayArray15[local119][local115] = local173 * (float) local137;
				this.aFloatArrayArray13[local119][local115] = local173 * (float) (-arg7 * 2);
				this.aFloatArrayArray14[local119][local115] = local173 * (float) local154;
			}
		}
		this.aClass187_42 = new Class187(128);
		if ((this.anInt9214 & 0x10) != 0) {
			this.aClass100_2 = new Class100(this.aClass134_Sub2_42, this);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt9235 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9209 + 1][super.anInt9210 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; local23 < super.anInt9209; local23++) {
				for (local27 = 1; local27 < super.anInt9210; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray35[local23][local27 + 1] >> 3) + (this.aByteArrayArray35[local23][local27 - 1] >> 2) + (this.aByteArrayArray35[local23 - -1][local27] >> 3) + (this.aByteArrayArray35[local23 - 1][local27] >> 2) + (this.aByteArrayArray35[local23][local27] >> 1));
				}
			}
			this.aClass1_Sub37Array1 = new Class1_Sub37[this.aClass187_42.method3796()];
			this.aClass187_42.method3802(this.aClass1_Sub37Array1);
			for (local27 = 0; local27 < this.aClass1_Sub37Array1.length; local27++) {
				this.aClass1_Sub37Array1[local27].method4857(this.anInt9235);
			}
			@Pc(135) int local135 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local135 += 4;
			}
			if ((this.anInt9214 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass134_Sub2_42.aNativeHeap5.a(this.anInt9235 * local135, false);
			@Pc(160) Stream local160 = new Stream(local155);
			@Pc(164) Class1_Sub37[] local164 = new Class1_Sub37[this.anInt9235];
			@Pc(171) int local171 = Static558.method7589(this.anInt9235 / 4);
			if (local171 < 1) {
				local171 = 1;
			}
			@Pc(183) Class187 local183 = new Class187(local171);
			@Pc(187) Class1_Sub37[] local187 = new Class1_Sub37[this.lb];
			@Pc(193) int local193;
			for (@Pc(189) int local189 = 0; super.anInt9209 > local189; local189++) {
				for (local193 = 0; local193 < super.anInt9210; local193++) {
					if (this.anIntArrayArrayArray20[local189][local193] != null) {
						@Pc(209) Class1_Sub37[] local209 = this.aClass1_Sub37ArrayArrayArray1[local189][local193];
						@Pc(216) int[] local216 = this.anIntArrayArrayArray19[local189][local193];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray17[local189][local193];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray18[local189][local193];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray20[local189][local193];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local189][local193];
						if (local230 == null) {
							local230 = local237;
						}
						@Pc(265) int[] local265 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local189][local193];
						@Pc(272) float local272 = this.aFloatArrayArray15[local189][local193];
						@Pc(279) float local279 = this.aFloatArrayArray13[local189][local193];
						@Pc(286) float local286 = this.aFloatArrayArray14[local189][local193];
						@Pc(295) float local295 = this.aFloatArrayArray15[local189][local193 + 1];
						@Pc(304) float local304 = this.aFloatArrayArray13[local189][local193 + 1];
						@Pc(313) float local313 = this.aFloatArrayArray14[local189][local193 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray15[local189 + 1][local193 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray13[local189 + 1][local193 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray14[local189 + 1][local193 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray15[local189 + 1][local193];
						@Pc(364) float local364 = this.aFloatArrayArray13[local189 + 1][local193];
						@Pc(373) float local373 = this.aFloatArrayArray14[local189 + 1][local193];
						@Pc(381) int local381 = local21[local189][local193] & 0xFF;
						@Pc(391) int local391 = local21[local189][local193 + 1] & 0xFF;
						@Pc(403) int local403 = local21[local189 + 1][local193 + 1] & 0xFF;
						@Pc(413) int local413 = local21[local189 + 1][local193] & 0xFF;
						@Pc(415) int local415 = 0;
						@Pc(425) int local425;
						label335: for (@Pc(417) int local417 = 0; local417 < local237.length; local417++) {
							@Pc(423) Class1_Sub37 local423 = local209[local417];
							for (local425 = 0; local425 < local415; local425++) {
								if (local187[local425] == local423) {
									continue label335;
								}
							}
							local187[local415++] = local423;
						}
						@Pc(462) short[] local462 = this.aShortArrayArray13[local189 + super.anInt9209 * local193] = new short[local237.length];
						for (local425 = 0; local425 < local237.length; local425++) {
							@Pc(475) int local475 = (local189 << super.anInt9205) + local216[local425];
							@Pc(485) int local485 = (local193 << super.anInt9205) + local223[local425];
							@Pc(490) int local490 = local475 >> this.anInt9227;
							@Pc(495) int local495 = local485 >> this.anInt9227;
							@Pc(499) int local499 = local237[local425];
							@Pc(503) int local503 = local230[local425];
							@Pc(511) int local511 = local249 == null ? 0 : local249[local425];
							@Pc(529) long local529 = (long) local503 << 48 | (long) local499 << 32 | (long) (local490 << 16) | (long) local495;
							@Pc(533) int local533 = local216[local425];
							@Pc(537) int local537 = local223[local425];
							@Pc(539) byte local539 = 74;
							@Pc(541) int local541 = 0;
							@Pc(543) float local543 = 1.0F;
							@Pc(556) float local556;
							@Pc(560) float local560;
							@Pc(558) float local558;
							@Pc(624) float local624;
							@Pc(554) int local554;
							if (local533 == 0 && local537 == 0) {
								local554 = local539 - local381;
								local556 = local272;
								local558 = local286;
								local560 = local279;
							} else if (local533 == 0 && super.anInt9208 == local537) {
								local560 = local304;
								local558 = local313;
								local556 = local295;
								local554 = local539 - local391;
							} else if (super.anInt9208 == local533 && super.anInt9208 == local537) {
								local558 = local346;
								local554 = local539 - local403;
								local560 = local335;
								local556 = local324;
							} else if (local533 == super.anInt9208 && local537 == 0) {
								local558 = local373;
								local554 = local539 - local413;
								local560 = local364;
								local556 = local355;
							} else {
								@Pc(600) float local600 = (float) local533 / (float) super.anInt9208;
								@Pc(607) float local607 = (float) local537 / (float) super.anInt9208;
								@Pc(615) float local615 = (local355 - local272) * local600 + local272;
								local624 = local279 + (local364 - local279) * local600;
								@Pc(633) float local633 = local286 + (local373 - local286) * local600;
								@Pc(641) float local641 = local295 + local600 * (local324 - local295);
								@Pc(650) float local650 = (local335 - local304) * local600 + local304;
								local560 = local607 * (local650 - local624) + local624;
								@Pc(667) float local667 = local313 + (local346 - local313) * local600;
								local556 = local615 + (local641 - local615) * local607;
								local558 = local607 * (local667 - local633) + local633;
								@Pc(697) int local697 = ((local413 - local381) * local533 >> super.anInt9205) + local381;
								@Pc(709) int local709 = (local533 * (local403 - local391) >> super.anInt9205) + local391;
								local554 = local539 - local697 - ((local709 - local697) * local537 >> super.anInt9205);
							}
							if (local499 != -1) {
								@Pc(771) int local771 = (local499 & 0x7F) * local554 >> 7;
								if (local771 < 2) {
									local771 = 2;
								} else if (local771 > 126) {
									local771 = 126;
								}
								local541 = Static379.anIntArray506[local771 | local499 & 0xFF80];
								if ((this.anInt9214 & 0x7) == 0) {
									local543 = local560 * this.aClass134_Sub2_42.aFloatArray40[1] + this.aClass134_Sub2_42.aFloatArray40[0] * local556 + local558 * this.aClass134_Sub2_42.aFloatArray40[2];
									local543 = local543 * (local543 > 0.0F ? this.aClass134_Sub2_42.aFloat141 : this.aClass134_Sub2_42.aFloat144) + this.aClass134_Sub2_42.aFloat157;
								}
							}
							@Pc(844) Class1 local844 = null;
							if ((this.anInt9221 - 1 & local475) == 0 && (local485 & this.anInt9221 - 1) == 0) {
								local844 = local183.method3797(local529);
							}
							@Pc(880) int local880;
							@Pc(906) int local906;
							if (local844 == null) {
								if (local499 == local503) {
									local906 = local541;
								} else {
									@Pc(916) int local916 = (local503 & 0x7F) * local554 >> 7;
									if (local916 < 2) {
										local916 = 2;
									} else if (local916 > 126) {
										local916 = 126;
									}
									local906 = Static379.anIntArray506[local916 | local503 & 0xFF80];
									if ((this.anInt9214 & 0x7) == 0) {
										local624 = local556 * this.aClass134_Sub2_42.aFloatArray40[0] + this.aClass134_Sub2_42.aFloatArray40[1] * local560 + local558 * this.aClass134_Sub2_42.aFloatArray40[2];
										local624 = (local543 > 0.0F ? this.aClass134_Sub2_42.aFloat141 : this.aClass134_Sub2_42.aFloat144) * local543 + this.aClass134_Sub2_42.aFloat157;
										@Pc(991) int local991 = local906 >> 16 & 0xFF;
										@Pc(997) int local997 = local906 >> 8 & 0xFF;
										local991 = (int) ((float) local991 * local624);
										@Pc(1007) int local1007 = local906 & 0xFF;
										if (local991 < 0) {
											local991 = 0;
										} else if (local991 > 255) {
											local991 = 255;
										}
										local997 = (int) ((float) local997 * local624);
										if (local997 < 0) {
											local997 = 0;
										} else if (local997 > 255) {
											local997 = 255;
										}
										local1007 = (int) ((float) local1007 * local624);
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local906 = local997 << 8 | local991 << 16 | local1007;
									}
								}
								if (this.aClass134_Sub2_42.aBoolean517) {
									local160.a((float) local475);
									local160.a((float) (this.method7550(local475, local485) + local511));
									local160.a((float) local485);
									local160.f((byte) (local906 >> 16));
									local160.f((byte) (local906 >> 8));
									local160.f((byte) local906);
									local160.f(-1);
									local160.a((float) local475);
									local160.a((float) local485);
									if (this.anIntArrayArrayArray15 != null) {
										local160.a((float) (local265 == null ? 0 : local265[local425] - 1));
									}
									if ((this.anInt9214 & 0x7) != 0) {
										local160.a(local556);
										local160.a(local560);
										local160.a(local558);
									}
								} else {
									local160.b((float) local475);
									local160.b((float) (this.method7550(local475, local485) + local511));
									local160.b((float) local485);
									local160.f((byte) (local906 >> 16));
									local160.f((byte) (local906 >> 8));
									local160.f((byte) local906);
									local160.f(-1);
									local160.b((float) local475);
									local160.b((float) local485);
									if (this.anIntArrayArrayArray15 != null) {
										local160.b((float) (local265 == null ? 0 : local265[local425] - 1));
									}
									if ((this.anInt9214 & 0x7) != 0) {
										local160.b(local556);
										local160.b(local560);
										local160.b(local558);
									}
								}
								local880 = this.anInt9229++;
								local462[local425] = (short) local880;
								if (local499 != -1) {
									local164[local880] = local209[local425];
								}
								local183.method3795(new Class1_Sub24(local462[local425]), local529);
							} else {
								local462[local425] = ((Class1_Sub24) local844).aShort48;
								local880 = local462[local425] & 0xFFFF;
								if (local499 != -1 && local164[local880].aLong301 > local209[local425].aLong301) {
									local164[local880] = local209[local425];
								}
							}
							for (local906 = 0; local906 < local415; local906++) {
								local187[local906].method4861(local880, local543, local541, local554);
							}
							this.anInt9217++;
						}
					}
				}
			}
			for (local193 = 0; local193 < this.anInt9229; local193++) {
				@Pc(1320) Class1_Sub37 local1320 = local164[local193];
				if (local1320 != null) {
					local1320.method4854(local193);
				}
			}
			@Pc(1358) int local1358;
			for (@Pc(1337) int local1337 = 0; local1337 < super.anInt9209; local1337++) {
				for (@Pc(1341) int local1341 = 0; super.anInt9210 > local1341; local1341++) {
					@Pc(1354) short[] local1354 = this.aShortArrayArray13[super.anInt9209 * local1341 + local1337];
					if (local1354 != null) {
						local1358 = 0;
						@Pc(1360) int local1360 = 0;
						while (local1360 < local1354.length) {
							@Pc(1369) int local1369 = local1354[local1360++] & 0xFFFF;
							@Pc(1376) int local1376 = local1354[local1360++] & 0xFFFF;
							@Pc(1383) int local1383 = local1354[local1360++] & 0xFFFF;
							@Pc(1387) Class1_Sub37 local1387 = local164[local1369];
							@Pc(1391) Class1_Sub37 local1391 = local164[local1376];
							@Pc(1395) Class1_Sub37 local1395 = local164[local1383];
							@Pc(1397) Class1_Sub37 local1397 = null;
							if (local1387 != null) {
								local1397 = local1387;
								local1387.method4863(local1341, local1358, local1337);
							}
							if (local1391 != null) {
								local1391.method4863(local1341, local1358, local1337);
								if (local1397 == null || local1397.aLong301 > local1391.aLong301) {
									local1397 = local1391;
								}
							}
							if (local1395 != null) {
								local1395.method4863(local1341, local1358, local1337);
								if (local1397 == null || local1397.aLong301 > local1395.aLong301) {
									local1397 = local1395;
								}
							}
							if (local1397 != null) {
								if (local1387 != null) {
									local1397.method4854(local1369);
								}
								if (local1391 != null) {
									local1397.method4854(local1376);
								}
								if (local1395 != null) {
									local1397.method4854(local1383);
								}
								local1397.method4863(local1341, local1358, local1337);
							}
							local1358++;
						}
					}
				}
			}
			local160.a();
			this.anInterface5_7 = this.aClass134_Sub2_42.method5230(local155, local160.b(), local135);
			this.aClass213_14 = new Class213(this.anInterface5_7, 5126, 3, 0);
			this.aClass213_13 = new Class213(this.anInterface5_7, 5121, 4, 12);
			@Pc(1530) byte local1530;
			if (this.anIntArrayArrayArray15 == null) {
				local1530 = 24;
				this.aClass213_15 = new Class213(this.anInterface5_7, 5126, 2, 16);
			} else {
				local1530 = 28;
				this.aClass213_15 = new Class213(this.anInterface5_7, 5126, 3, 16);
			}
			if ((this.anInt9214 & 0x7) != 0) {
				this.aClass213_16 = new Class213(this.anInterface5_7, 5126, 3, local1530);
			}
			@Pc(1574) long[] local1574 = new long[this.aClass1_Sub37Array1.length];
			for (local1358 = 0; local1358 < this.aClass1_Sub37Array1.length; local1358++) {
				@Pc(1583) Class1_Sub37 local1583 = this.aClass1_Sub37Array1[local1358];
				local1574[local1358] = local1583.aLong301;
				local1583.method4860(this.anInt9229);
			}
			Static589.method7832(local1574, this.aClass1_Sub37Array1);
			if (this.aClass100_2 != null) {
				this.aClass100_2.method2040();
			}
		} else {
			this.aClass100_2 = null;
		}
		this.anIntArrayArrayArray15 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray13 = this.aFloatArrayArray14 = null;
		this.anIntArrayArrayArray19 = this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray20 = null;
		this.aByteArrayArray35 = null;
		this.aClass1_Sub37ArrayArrayArray1 = null;
		this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass187_42 = null;
	}

	@OriginalMember(owner = "client!vfa", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class1_Sub6_Sub5 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub6_Sub5 arg2) {
		if ((this.aByteArrayArray34[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9208 >> this.aClass134_Sub2_42.anInt6550;
		@Pc(27) Class1_Sub6_Sub5_Sub1 local27 = (Class1_Sub6_Sub5_Sub1) arg2;
		@Pc(37) Class1_Sub6_Sub5_Sub1 local37;
		if (local27 != null && local27.method7150(local24, local24)) {
			local37 = local27;
			local27.method7151();
		} else {
			local37 = new Class1_Sub6_Sub5_Sub1(this.aClass134_Sub2_42, local24, local24);
		}
		local37.method7148(local24, 0, local24, 0);
		this.method7556(arg0, arg1, local37);
		return local37;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7548(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9235 <= 0) {
			return;
		}
		this.aClass134_Sub2_42.method5225();
		this.aClass134_Sub2_42.method5236(false);
		this.aClass134_Sub2_42.method5190(false);
		this.aClass134_Sub2_42.method5268(false);
		this.aClass134_Sub2_42.method5231(false);
		this.aClass134_Sub2_42.method5233(0);
		this.aClass134_Sub2_42.method5207(-2);
		this.aClass134_Sub2_42.method5202(null);
		Static98.aFloatArray37[14] = 0.0F;
		Static98.aFloatArray37[7] = 0.0F;
		Static98.aFloatArray37[4] = 0.0F;
		Static98.aFloatArray37[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass134_Sub2_42.anInt6489;
		Static98.aFloatArray37[3] = 0.0F;
		Static98.aFloatArray37[10] = 0.0F;
		Static98.aFloatArray37[6] = 0.0F;
		Static98.aFloatArray37[9] = 0.0F;
		Static98.aFloatArray37[1] = 0.0F;
		Static98.aFloatArray37[15] = 1.0F;
		Static98.aFloatArray37[5] = (float) 1024 / ((float) this.aClass134_Sub2_42.anInt6489 * (float) super.anInt9208 * 128.0F);
		Static98.aFloatArray37[8] = 0.0F;
		Static98.aFloatArray37[11] = 0.0F;
		Static98.aFloatArray37[0] = (float) 1024 / ((float) this.aClass134_Sub2_42.anInt6392 * (float) super.anInt9208 * 128.0F);
		Static98.aFloatArray37[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass134_Sub2_42.anInt6392) - 1.0F;
		Static98.aFloatArray37[2] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static98.aFloatArray37, 0);
		Static98.aFloatArray37[6] = 1.0F;
		Static98.aFloatArray37[0] = 1.0F;
		Static98.aFloatArray37[1] = 0.0F;
		Static98.aFloatArray37[11] = 0.0F;
		Static98.aFloatArray37[5] = 0.0F;
		Static98.aFloatArray37[8] = 0.0F;
		Static98.aFloatArray37[2] = 0.0F;
		Static98.aFloatArray37[9] = 1.0F;
		Static98.aFloatArray37[14] = 0.0F;
		Static98.aFloatArray37[15] = 1.0F;
		Static98.aFloatArray37[3] = 0.0F;
		Static98.aFloatArray37[7] = 0.0F;
		Static98.aFloatArray37[12] = 0.0F;
		Static98.aFloatArray37[4] = 0.0F;
		Static98.aFloatArray37[13] = 0.0F;
		Static98.aFloatArray37[10] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static98.aFloatArray37, 0);
		if ((this.anInt9214 & 0x7) == 0) {
			this.aClass134_Sub2_42.method5190(false);
		} else {
			this.aClass134_Sub2_42.method5190(true);
			this.aClass134_Sub2_42.method5214();
		}
		this.aClass134_Sub2_42.method5259(this.aClass213_15, this.aClass213_16, this.aClass213_13, this.aClass213_14);
		if (this.aClass134_Sub2_42.aClass1_Sub35_Sub1_2.aByteArray85.length < this.anInt9217 * 2) {
			this.aClass134_Sub2_42.aClass1_Sub35_Sub1_2 = new Class1_Sub35_Sub1(this.anInt9217 * 2);
		} else {
			this.aClass134_Sub2_42.aClass1_Sub35_Sub1_2.anInt7214 = 0;
		}
		@Pc(316) int local316 = 0;
		@Pc(320) Class1_Sub35_Sub1 local320 = this.aClass134_Sub2_42.aClass1_Sub35_Sub1_2;
		@Pc(326) int local326;
		@Pc(335) int local335;
		@Pc(337) int local337;
		@Pc(356) short[] local356;
		@Pc(360) int local360;
		if (this.aClass134_Sub2_42.aBoolean517) {
			for (local326 = arg1; local326 < arg3; local326++) {
				local335 = arg0 + local326 * super.anInt9209;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local326 - arg1]) {
						local356 = this.aShortArrayArray13[local335];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local316++;
								local320.method5776(local356[local360] & 0xFFFF);
							}
						}
					}
					local335++;
				}
			}
		} else {
			for (local326 = arg1; local326 < arg3; local326++) {
				local335 = arg0 + super.anInt9209 * local326;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local326 - arg1]) {
						local356 = this.aShortArrayArray13[local335];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local316++;
								local320.method5767(local356[local360] & 0xFFFF);
							}
						}
					}
					local335++;
				}
			}
		}
		if (local316 > 0) {
			@Pc(475) Class167_Sub1 local475 = new Class167_Sub1(this.aClass134_Sub2_42, 5123, local320.aByteArray85, local320.anInt7214);
			this.aClass134_Sub2_42.method5219(0, local475, local316);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!rc;[I)V")
	@Override
	public void method7542(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass353_63.method7679(new Class1_Sub45(this.aClass134_Sub2_42, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7557(arg1, arg2, arg3, arg0, arg5, arg4);
	}

	@OriginalMember(owner = "client!vfa", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass100_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass134_Sub2_42.anInt6587 >> 8) >> this.aClass134_Sub2_42.anInt6550;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass134_Sub2_42.anInt6588 >> 8) >> this.aClass134_Sub2_42.anInt6550;
			this.aClass100_2.method2039(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9209][super.anInt9210][];
		}
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9209][super.anInt9210][];
		}
		this.anIntArrayArrayArray19[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray20[arg0][arg1] = arg6;
		this.anIntArrayArrayArray18[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub37[] local88 = this.aClass1_Sub37ArrayArrayArray1[arg0][arg1] = new Class1_Sub37[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.aClass187_42.method3797(local119); local125 != null; local125 = this.aClass187_42.method3803()) {
				@Pc(130) Class1_Sub37 local130 = (Class1_Sub37) local125;
				if (arg8[local90] == local130.anInt5934 && (float) arg9[local90] == local130.aFloat135 && local130.anInt5927 == arg10 && local130.anInt5931 == arg11 && local130.anInt5929 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub37(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass187_42.method3795(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub37) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray34[arg0][arg1] = (byte) (this.aByteArrayArray34[arg0][arg1] | 0x1);
		}
		if (this.lb < arg6.length) {
			this.lb = arg6.length;
		}
		this.anInt9235 += arg6.length;
	}

	@OriginalMember(owner = "client!vfa", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass100_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass134_Sub2_42.anInt6587 >> 8) >> this.aClass134_Sub2_42.anInt6550;
			@Pc(38) int local38 = arg3 - (this.aClass134_Sub2_42.anInt6588 * arg2 >> 8) >> this.aClass134_Sub2_42.anInt6550;
			this.aClass100_2.method2038(arg0, local23, local38);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method7557(arg1, arg2, arg3, arg0, -1, arg4);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7543(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass100_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass134_Sub2_42.anInt6587 * arg2 >> 8) >> this.aClass134_Sub2_42.anInt6550;
			@Pc(40) int local40 = arg3 - (this.aClass134_Sub2_42.anInt6588 * arg2 >> 8) >> this.aClass134_Sub2_42.anInt6550;
			return this.aClass100_2.method2044(local40, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray35[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray35[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BIILclient!tv;)V")
	private void method7556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub6_Sub5_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray19[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray17[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (this.aClass134_Sub2_42.anIntArray512.length < local22) {
			this.aClass134_Sub2_42.anIntArray513 = new int[local22];
			this.aClass134_Sub2_42.anIntArray512 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass134_Sub2_42.anIntArray512;
		@Pc(46) int[] local46 = this.aClass134_Sub2_42.anIntArray513;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass134_Sub2_42.anInt6550;
			local46[local48] = local19[local48] >> this.aClass134_Sub2_42.anInt6550;
		}
		@Pc(82) int local82 = 0;
		while (local22 > local82) {
			@Pc(88) int local88 = local42[local82];
			@Pc(93) int local93 = local46[local82++];
			@Pc(97) int local97 = local42[local82];
			@Pc(102) int local102 = local46[local82++];
			@Pc(106) int local106 = local42[local82];
			@Pc(111) int local111 = local46[local82++];
			if ((local88 - local97) * (local102 - local111) - (local106 - local97) * (local102 - local93) > 0) {
				arg2.method7152(local106, local88, local97, local111, local93, local102);
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	@Override
	public void method7549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II[[ZIIIZ)V")
	private void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (this.aClass1_Sub37Array1 == null) {
			return;
		}
		@Pc(20) int local20 = arg1 + arg1 + 1;
		@Pc(24) int local24 = local20 * local20;
		if (this.aClass134_Sub2_42.anIntArray511.length < local24) {
			this.aClass134_Sub2_42.anIntArray511 = new int[local24];
		}
		if (this.aClass134_Sub2_42.aClass1_Sub35_Sub1_2.aByteArray85.length < this.anInt9217 * 2) {
			this.aClass134_Sub2_42.aClass1_Sub35_Sub1_2 = new Class1_Sub35_Sub1(this.anInt9217 * 2);
		}
		@Pc(67) int local67 = arg3 - arg1;
		@Pc(69) int local69 = local67;
		if (local67 < 0) {
			local67 = 0;
		}
		@Pc(78) int local78 = arg0 - arg1;
		@Pc(80) int local80 = local78;
		if (local78 < 0) {
			local78 = 0;
		}
		@Pc(88) int local88 = arg3 + arg1;
		if (local88 > super.anInt9209 - 1) {
			local88 = super.anInt9209 - 1;
		}
		@Pc(107) int local107 = arg1 + arg0;
		if (local107 > super.anInt9210 - 1) {
			local107 = super.anInt9210 - 1;
		}
		@Pc(120) int local120 = 0;
		@Pc(124) int[] local124 = this.aClass134_Sub2_42.anIntArray511;
		@Pc(137) int local137;
		for (@Pc(126) int local126 = local67; local126 <= local88; local126++) {
			@Pc(135) boolean[] local135 = arg2[local126 - local69];
			for (local137 = local78; local137 <= local107; local137++) {
				if (local135[local137 - local80]) {
					local124[local120++] = local126 + local137 * super.anInt9209;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass134_Sub2_42.method5258();
		} else {
			this.aClass134_Sub2_42.method5208((float) arg4);
			this.aClass134_Sub2_42.method5196();
		}
		this.aClass134_Sub2_42.method5190((this.anInt9214 & 0x7) != 0);
		for (@Pc(202) int local202 = 0; local202 < this.aClass1_Sub37Array1.length; local202++) {
			this.aClass1_Sub37Array1[local202].method4856(local124, local120);
		}
		if (!this.aClass353_63.method7686()) {
			local137 = this.aClass134_Sub2_42.anInt6582;
			@Pc(235) int local235 = this.aClass134_Sub2_42.anInt6562;
			this.aClass134_Sub2_42.pa(0, local235, this.aClass134_Sub2_42.anInt6576);
			this.aClass134_Sub2_42.method5190(false);
			this.aClass134_Sub2_42.method5231(false);
			this.aClass134_Sub2_42.method5233(128);
			this.aClass134_Sub2_42.method5207(-2);
			this.aClass134_Sub2_42.method5202(this.aClass134_Sub2_42.aClass40_Sub3_4);
			this.aClass134_Sub2_42.method5224(8448, 7681);
			this.aClass134_Sub2_42.method5200(0, 34166, 770);
			this.aClass134_Sub2_42.method5271(34167, 0);
			for (@Pc(301) Class1 local301 = this.aClass353_63.method7677(); local301 != null; local301 = this.aClass353_63.method7687()) {
				@Pc(306) Class1_Sub45 local306 = (Class1_Sub45) local301;
				local306.method6478(arg3, arg1, arg0, arg2);
			}
			this.aClass134_Sub2_42.method5200(0, 5890, 768);
			this.aClass134_Sub2_42.method5271(5890, 0);
			this.aClass134_Sub2_42.method5202(null);
			this.aClass134_Sub2_42.pa(local137, local235, this.aClass134_Sub2_42.anInt6576);
		}
		if (this.aClass100_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass134_Sub2_42.method5259(this.aClass213_15, null, null, this.aClass213_14);
		this.aClass100_2.method2046(arg1, arg0, arg3, arg2, arg5);
		OpenGL.glPopMatrix();
		return;
	}
}
