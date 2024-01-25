import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	private int anInt6911;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
	private int anInt6930;

	@OriginalMember(owner = "client!ul", name = "X", descriptor = "[Lclient!wd;")
	private Class4_Sub45[] aClass4_Sub45Array1;

	@OriginalMember(owner = "client!ul", name = "bb", descriptor = "Lclient!og;")
	private Class190 aClass190_12;

	@OriginalMember(owner = "client!ul", name = "cb", descriptor = "Lclient!lc;")
	private Interface9 anInterface9_7;

	@OriginalMember(owner = "client!ul", name = "db", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
	private int anInt6937;

	@OriginalMember(owner = "client!ul", name = "hb", descriptor = "Lclient!og;")
	public Class190 aClass190_13;

	@OriginalMember(owner = "client!ul", name = "jb", descriptor = "Lclient!og;")
	public Class190 aClass190_14;

	@OriginalMember(owner = "client!ul", name = "kb", descriptor = "Lclient!og;")
	public Class190 aClass190_15;

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "Lclient!ub;")
	private final Class244 aClass244_47 = new Class244();

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	private final int anInt6916 = this.anInt6907 - 2;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!ug;")
	public final Class135_Sub2 aClass135_Sub2_40;

	@OriginalMember(owner = "client!ul", name = "T", descriptor = "[[I")
	private final int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public final int anInt6910;

	@OriginalMember(owner = "client!ul", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!ul", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "[[B")
	private final byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "[[[Lclient!wd;")
	private Class4_Sub45[][][] aClass4_Sub45ArrayArrayArray1;

	@OriginalMember(owner = "client!ul", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ul", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
	private final int anInt6922;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ul", name = "J", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!ul", name = "gb", descriptor = "Lclient!ek;")
	private Class67 aClass67_34;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Lclient!fu;")
	private Class89 aClass89_2;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!ug;IIII[[I[[II)V")
	public Class41_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass135_Sub2_40 = arg0;
		this.anIntArrayArray59 = arg5;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anInt6910 = arg2;
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray9 = new float[super.anInt6908 + 1][super.anInt6909 + 1];
		this.aByteArrayArray15 = new byte[arg3][arg4];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aClass4_Sub45ArrayArrayArray1 = new Class4_Sub45[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt6908 + 1][super.anInt6909 + 1];
		this.aFloatArrayArray8 = new float[super.anInt6908 + 1][super.anInt6909 + 1];
		this.anInt6922 = 0x1 << this.anInt6916;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aShortArrayArray7 = new short[arg3 * arg4][];
		for (@Pc(117) int local117 = 1; super.anInt6909 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt6908 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + arg7 * 4 * arg7 + local139 * local139)));
				this.aFloatArrayArray8[local121][local117] = local175 * (float) local139;
				this.aFloatArrayArray9[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray7[local121][local117] = (float) local156 * local175;
			}
		}
		this.aClass67_34 = new Class67(128);
		if ((this.anInt6910 & 0x10) != 0) {
			this.aClass89_2 = new Class89(this.aClass135_Sub2_40, this);
		}
	}

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt6908][super.anInt6909][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt6908][super.anInt6909][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray14[arg0][arg1] = arg6;
		this.anIntArrayArrayArray13[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub45[] local88 = this.aClass4_Sub45ArrayArrayArray1[arg0][arg1] = new Class4_Sub45[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14);
			@Pc(125) Class4 local125;
			for (local125 = this.aClass67_34.method1429(local119); local125 != null; local125 = this.aClass67_34.method1427()) {
				@Pc(130) Class4_Sub45 local130 = (Class4_Sub45) local125;
				if (local130.anInt7324 == arg8[local90] && (float) arg9[local90] == local130.aFloat100 && arg10 == local130.anInt7319 && arg11 == local130.anInt7323 && arg12 == local130.anInt7322) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub45(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass67_34.method1426(local88[local90], local119);
			} else {
				local88[local90] = (Class4_Sub45) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray15[arg0][arg1] = (byte) (this.aByteArrayArray15[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6936) {
			this.anInt6936 = arg6.length;
		}
		this.anInt6937 += arg6.length;
	}

	@OriginalMember(owner = "client!ul", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		if (this.anInt6937 <= 0) {
			this.aClass89_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt6908 + 1][super.anInt6909 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; super.anInt6908 > local28; local28++) {
				for (local32 = 1; local32 < super.anInt6909; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray16[local28 + 1][local32] >> 3) + (this.aByteArrayArray16[local28 - 1][local32] >> 2) + (this.aByteArrayArray16[local28][local32 + -1] >> 2) + (this.aByteArrayArray16[local28][local32 + 1] >> 3) + (this.aByteArrayArray16[local28][local32] >> 1));
				}
			}
			this.aClass4_Sub45Array1 = new Class4_Sub45[this.aClass67_34.method1432()];
			this.aClass67_34.method1423(this.aClass4_Sub45Array1);
			for (local32 = 0; local32 < this.aClass4_Sub45Array1.length; local32++) {
				this.aClass4_Sub45Array1[local32].method5860(this.anInt6937);
			}
			@Pc(144) int local144 = 24;
			if (this.anIntArrayArrayArray10 != null) {
				local144 += 4;
			}
			if ((this.anInt6910 & 0x7) != 0) {
				local144 += 12;
			}
			@Pc(166) NativeBuffer local166 = this.aClass135_Sub2_40.aNativeHeap2.a(local144 * this.anInt6937);
			@Pc(171) NativeStream local171 = new NativeStream(local166);
			@Pc(175) Class4_Sub45[] local175 = new Class4_Sub45[this.anInt6937];
			@Pc(182) int local182 = Static359.method4736(this.anInt6937 / 4);
			if (local182 < 1) {
				local182 = 1;
			}
			@Pc(194) Class67 local194 = new Class67(local182);
			@Pc(198) Class4_Sub45[] local198 = new Class4_Sub45[this.anInt6936];
			@Pc(204) int local204;
			for (@Pc(200) int local200 = 0; super.anInt6908 > local200; local200++) {
				for (local204 = 0; local204 < super.anInt6909; local204++) {
					if (this.anIntArrayArrayArray14[local200][local204] != null) {
						@Pc(220) Class4_Sub45[] local220 = this.aClass4_Sub45ArrayArrayArray1[local200][local204];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray9[local200][local204];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray12[local200][local204];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray13[local200][local204];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray14[local200][local204];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local200][local204];
						if (local241 == null) {
							local241 = local248;
						}
						@Pc(276) int[] local276 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local200][local204];
						@Pc(283) float local283 = this.aFloatArrayArray8[local200][local204];
						@Pc(290) float local290 = this.aFloatArrayArray9[local200][local204];
						@Pc(297) float local297 = this.aFloatArrayArray7[local200][local204];
						@Pc(306) float local306 = this.aFloatArrayArray8[local200][local204 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray9[local200][local204 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray7[local200][local204 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray8[local200 + 1][local204 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray9[local200 + 1][local204 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray7[local200 + 1][local204 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray8[local200 + 1][local204];
						@Pc(375) float local375 = this.aFloatArrayArray9[local200 + 1][local204];
						@Pc(384) float local384 = this.aFloatArrayArray7[local200 + 1][local204];
						@Pc(392) int local392 = local26[local200][local204] & 0xFF;
						@Pc(402) int local402 = local26[local200][local204 + 1] & 0xFF;
						@Pc(414) int local414 = local26[local200 + 1][local204 + 1] & 0xFF;
						@Pc(424) int local424 = local26[local200 + 1][local204] & 0xFF;
						@Pc(426) int local426 = 0;
						@Pc(436) int local436;
						label335: for (@Pc(428) int local428 = 0; local428 < local248.length; local428++) {
							@Pc(434) Class4_Sub45 local434 = local220[local428];
							for (local436 = 0; local436 < local426; local436++) {
								if (local434 == local198[local436]) {
									continue label335;
								}
							}
							local198[local426++] = local434;
						}
						@Pc(477) short[] local477 = this.aShortArrayArray7[local200 + super.anInt6908 * local204] = new short[local248.length];
						for (local436 = 0; local436 < local248.length; local436++) {
							@Pc(491) int local491 = (local200 << super.anInt6907) + local227[local436];
							@Pc(501) int local501 = (local204 << super.anInt6907) + local234[local436];
							@Pc(506) int local506 = local491 >> this.anInt6916;
							@Pc(511) int local511 = local501 >> this.anInt6916;
							@Pc(515) int local515 = local248[local436];
							@Pc(519) int local519 = local241[local436];
							@Pc(527) int local527 = local260 == null ? 0 : local260[local436];
							@Pc(545) long local545 = (long) local511 | (long) (local506 << 16) | (long) local515 << 32 | (long) local519 << 48;
							@Pc(549) int local549 = local227[local436];
							@Pc(553) int local553 = local234[local436];
							@Pc(555) byte local555 = 74;
							@Pc(557) int local557 = 0;
							@Pc(559) float local559 = 1.0F;
							@Pc(595) float local595;
							@Pc(597) float local597;
							@Pc(599) float local599;
							@Pc(654) float local654;
							@Pc(593) int local593;
							if (local549 == 0 && local553 == 0) {
								local599 = local297;
								local595 = local283;
								local593 = local555 - local392;
								local597 = local290;
							} else if (local549 == 0 && super.anInt6905 == local553) {
								local597 = local315;
								local595 = local306;
								local599 = local324;
								local593 = local555 - local402;
							} else if (super.anInt6905 == local549 && local553 == super.anInt6905) {
								local593 = local555 - local414;
								local595 = local335;
								local597 = local346;
								local599 = local357;
							} else if (super.anInt6905 == local549 && local553 == 0) {
								local595 = local366;
								local597 = local375;
								local599 = local384;
								local593 = local555 - local424;
							} else {
								@Pc(630) float local630 = (float) local549 / (float) super.anInt6905;
								@Pc(637) float local637 = (float) local553 / (float) super.anInt6905;
								@Pc(645) float local645 = (local366 - local283) * local630 + local283;
								local654 = local630 * (local375 - local290) + local290;
								@Pc(663) float local663 = local297 + local630 * (local384 - local297);
								@Pc(671) float local671 = local306 + local630 * (local335 - local306);
								@Pc(680) float local680 = local630 * (local346 - local315) + local315;
								local595 = local645 + (local671 - local645) * local637;
								@Pc(698) float local698 = local324 + (local357 - local324) * local630;
								local597 = local654 + (local680 - local654) * local637;
								local599 = local663 + (local698 - local663) * local637;
								@Pc(727) int local727 = ((local424 - local392) * local549 >> super.anInt6907) + local392;
								@Pc(740) int local740 = local402 + (local549 * (local414 - local402) >> super.anInt6907);
								local593 = local555 - ((local740 - local727) * local553 >> super.anInt6907) - local727;
							}
							if (local515 != -1) {
								@Pc(790) int local790 = (local515 & 0x7F) * local593 >> 7;
								if (local790 < 2) {
									local790 = 2;
								} else if (local790 > 126) {
									local790 = 126;
								}
								local557 = Static365.anIntArray475[local515 & 0xFF80 | local790];
								if ((this.anInt6910 & 0x7) == 0) {
									local559 = this.aClass135_Sub2_40.aFloatArray29[2] * local599 + this.aClass135_Sub2_40.aFloatArray29[1] * local597 + local595 * this.aClass135_Sub2_40.aFloatArray29[0];
									local559 = this.aClass135_Sub2_40.aFloat92 + (local559 > 0.0F ? this.aClass135_Sub2_40.aFloat97 : this.aClass135_Sub2_40.aFloat82) * local559;
								}
							}
							@Pc(861) Class4 local861 = null;
							if ((this.anInt6922 - 1 & local491) == 0 && (local501 & this.anInt6922 - 1) == 0) {
								local861 = local194.method1429(local545);
							}
							@Pc(897) int local897;
							@Pc(955) int local955;
							if (local861 == null) {
								if (local519 == local515) {
									local955 = local557;
								} else {
									@Pc(933) int local933 = (local519 & 0x7F) * local593 >> 7;
									if (local933 < 2) {
										local933 = 2;
									} else if (local933 > 126) {
										local933 = 126;
									}
									local955 = Static365.anIntArray475[local933 | local519 & 0xFF80];
									if ((this.anInt6910 & 0x7) == 0) {
										local654 = this.aClass135_Sub2_40.aFloatArray29[2] * local599 + this.aClass135_Sub2_40.aFloatArray29[1] * local597 + this.aClass135_Sub2_40.aFloatArray29[0] * local595;
										local654 = local559 * (local559 > 0.0F ? this.aClass135_Sub2_40.aFloat97 : this.aClass135_Sub2_40.aFloat82) + this.aClass135_Sub2_40.aFloat92;
										@Pc(1008) int local1008 = local955 >> 16 & 0xFF;
										@Pc(1014) int local1014 = local955 >> 8 & 0xFF;
										local1008 = (int) ((float) local1008 * local654);
										@Pc(1024) int local1024 = local955 & 0xFF;
										if (local1008 < 0) {
											local1008 = 0;
										} else if (local1008 > 255) {
											local1008 = 255;
										}
										local1014 = (int) ((float) local1014 * local654);
										local1024 = (int) ((float) local1024 * local654);
										if (local1014 < 0) {
											local1014 = 0;
										} else if (local1014 > 255) {
											local1014 = 255;
										}
										if (local1024 < 0) {
											local1024 = 0;
										} else if (local1024 > 255) {
											local1024 = 255;
										}
										local955 = local1008 << 16 | local1014 << 8 | local1024;
									}
								}
								if (this.aClass135_Sub2_40.aBoolean474) {
									local171.a((float) local491);
									local171.a((float) (this.a(local491, local501) + local527));
									local171.a((float) local501);
									local171.b((byte) (local955 >> 16));
									local171.b((byte) (local955 >> 8));
									local171.b((byte) local955);
									local171.b(-1);
									local171.a((float) local491);
									local171.a((float) local501);
									if (this.anIntArrayArrayArray10 != null) {
										local171.a((float) (local276 == null ? 0 : local276[local436] - 1));
									}
									if ((this.anInt6910 & 0x7) != 0) {
										local171.a(local595);
										local171.a(local597);
										local171.a(local599);
									}
								} else {
									local171.b((float) local491);
									local171.b((float) (local527 + this.a(local491, local501)));
									local171.b((float) local501);
									local171.b((byte) (local955 >> 16));
									local171.b((byte) (local955 >> 8));
									local171.b((byte) local955);
									local171.b(-1);
									local171.b((float) local491);
									local171.b((float) local501);
									if (this.anIntArrayArrayArray10 != null) {
										local171.b((float) (local276 == null ? 0 : local276[local436] - 1));
									}
									if ((this.anInt6910 & 0x7) != 0) {
										local171.b(local595);
										local171.b(local597);
										local171.b(local599);
									}
								}
								local897 = this.anInt6930++;
								local477[local436] = (short) local897;
								if (local515 != -1) {
									local175[local897] = local220[local436];
								}
								local194.method1426(new Class4_Sub43(local477[local436]), local545);
							} else {
								local477[local436] = ((Class4_Sub43) local861).aShort95;
								local897 = local477[local436] & 0xFFFF;
								if (local515 != -1 && local220[local436].aLong227 < local175[local897].aLong227) {
									local175[local897] = local220[local436];
								}
							}
							for (local955 = 0; local955 < local426; local955++) {
								local198[local955].method5866(local557, local559, local897, local593);
							}
							this.anInt6911++;
						}
					}
				}
			}
			for (local204 = 0; local204 < this.anInt6930; local204++) {
				@Pc(1323) Class4_Sub45 local1323 = local175[local204];
				if (local1323 != null) {
					local1323.method5867(local204);
				}
			}
			@Pc(1360) int local1360;
			for (@Pc(1340) int local1340 = 0; local1340 < super.anInt6908; local1340++) {
				for (@Pc(1344) int local1344 = 0; super.anInt6909 > local1344; local1344++) {
					@Pc(1356) short[] local1356 = this.aShortArrayArray7[local1340 + super.anInt6908 * local1344];
					if (local1356 != null) {
						local1360 = 0;
						@Pc(1362) int local1362 = 0;
						while (local1356.length > local1362) {
							@Pc(1371) int local1371 = local1356[local1362++] & 0xFFFF;
							@Pc(1378) int local1378 = local1356[local1362++] & 0xFFFF;
							@Pc(1385) int local1385 = local1356[local1362++] & 0xFFFF;
							@Pc(1389) Class4_Sub45 local1389 = local175[local1371];
							@Pc(1393) Class4_Sub45 local1393 = local175[local1378];
							@Pc(1397) Class4_Sub45 local1397 = local175[local1385];
							@Pc(1399) Class4_Sub45 local1399 = null;
							if (local1389 != null) {
								local1399 = local1389;
								local1389.method5865(local1344, local1340, local1360);
							}
							if (local1393 != null) {
								local1393.method5865(local1344, local1340, local1360);
								if (local1399 == null || local1393.aLong227 < local1399.aLong227) {
									local1399 = local1393;
								}
							}
							if (local1397 != null) {
								local1397.method5865(local1344, local1340, local1360);
								if (local1399 == null || local1397.aLong227 < local1399.aLong227) {
									local1399 = local1397;
								}
							}
							if (local1399 != null) {
								if (local1389 != null) {
									local1399.method5867(local1371);
								}
								if (local1393 != null) {
									local1399.method5867(local1378);
								}
								if (local1397 != null) {
									local1399.method5867(local1385);
								}
								local1399.method5865(local1344, local1340, local1360);
							}
							local1360++;
						}
					}
				}
			}
			local171.a();
			this.anInterface9_7 = this.aClass135_Sub2_40.method5486(local166, local144, local171.b());
			this.aClass190_13 = new Class190(this.anInterface9_7, 5126, 3, 0);
			this.aClass190_12 = new Class190(this.anInterface9_7, 5121, 4, 12);
			@Pc(1536) byte local1536;
			if (this.anIntArrayArrayArray10 == null) {
				this.aClass190_15 = new Class190(this.anInterface9_7, 5126, 2, 16);
				local1536 = 24;
			} else {
				local1536 = 28;
				this.aClass190_15 = new Class190(this.anInterface9_7, 5126, 3, 16);
			}
			if ((this.anInt6910 & 0x7) != 0) {
				this.aClass190_14 = new Class190(this.anInterface9_7, 5126, 3, local1536);
			}
			@Pc(1580) long[] local1580 = new long[this.aClass4_Sub45Array1.length];
			for (local1360 = 0; local1360 < this.aClass4_Sub45Array1.length; local1360++) {
				@Pc(1589) Class4_Sub45 local1589 = this.aClass4_Sub45Array1[local1360];
				local1580[local1360] = local1589.aLong227;
				local1589.method5864(this.anInt6930);
			}
			Static289.method3773(local1580, this.aClass4_Sub45Array1);
			if (this.aClass89_2 != null) {
				this.aClass89_2.method1728();
			}
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray10 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray9 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray12 = null;
		this.aByteArrayArray16 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass67_34 = null;
		this.aClass4_Sub45ArrayArrayArray1 = null;
		this.anIntArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5571(arg0, arg4, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class4_Sub2_Sub3 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub2_Sub3 arg2) {
		if ((this.aByteArrayArray15[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt6905 >> this.aClass135_Sub2_40.anInt6780;
		@Pc(24) Class4_Sub2_Sub3_Sub1 local24 = (Class4_Sub2_Sub3_Sub1) arg2;
		@Pc(40) Class4_Sub2_Sub3_Sub1 local40;
		if (local24 != null && local24.method5259(local21, local21)) {
			local40 = local24;
			local24.method5262();
		} else {
			local40 = new Class4_Sub2_Sub3_Sub1(this.aClass135_Sub2_40, local21, local21);
		}
		local40.method5261(0, 0, local21, local21);
		this.method5569(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ku;[I)V")
	@Override
	public void method5561(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass244_47.method5273(new Class4_Sub31(this.aClass135_Sub2_40, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method5562(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass89_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass135_Sub2_40.anInt6809 >> 8) >> this.aClass135_Sub2_40.anInt6780;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass135_Sub2_40.anInt6791 >> 8) >> this.aClass135_Sub2_40.anInt6780;
			return this.aClass89_2.method1732(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!ua;I)V")
	private void method5569(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub2_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray12[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass135_Sub2_40.anIntArray519.length) {
			this.aClass135_Sub2_40.anIntArray520 = new int[local22];
			this.aClass135_Sub2_40.anIntArray519 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass135_Sub2_40.anIntArray519;
		@Pc(50) int[] local50 = this.aClass135_Sub2_40.anIntArray520;
		for (@Pc(58) int local58 = 0; local58 < local22; local58++) {
			local46[local58] = (local12[local58] & 0xFF) >> this.aClass135_Sub2_40.anInt6780;
			local50[local58] = (local19[local58] & 0xFF) >> this.aClass135_Sub2_40.anInt6780;
		}
		@Pc(90) int local90 = 0;
		while (local22 > local90) {
			@Pc(96) int local96 = local46[local90];
			@Pc(101) int local101 = local50[local90++];
			@Pc(105) int local105 = local46[local90];
			@Pc(110) int local110 = local50[local90++];
			@Pc(114) int local114 = local46[local90];
			@Pc(119) int local119 = local50[local90++];
			if (-((local110 - local101) * (local114 - local105)) + (local96 - local105) * (local110 - local119) > 0) {
				arg1.method5260(local105, local114, local101, local110, local96, local119);
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIZIII[[Z)V")
	private void method5571(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass4_Sub45Array1 == null) {
			return;
		}
		@Pc(16) float local16 = this.aClass135_Sub2_40.aFloat85;
		@Pc(20) float local20 = this.aClass135_Sub2_40.aFloat88;
		@Pc(26) int local26 = arg2 + arg2 + 1;
		@Pc(30) int local30 = local26 * local26;
		if (local30 > this.aClass135_Sub2_40.anIntArray518.length) {
			this.aClass135_Sub2_40.anIntArray518 = new int[local30];
		}
		if (this.anInt6911 * 2 > this.aClass135_Sub2_40.aClass4_Sub9_Sub1_3.aByteArray81.length) {
			this.aClass135_Sub2_40.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(this.anInt6911 * 2);
		}
		@Pc(66) int local66 = arg0 - arg2;
		@Pc(68) int local68 = local66;
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(77) int local77 = arg3 - arg2;
		@Pc(79) int local79 = local77;
		if (local77 < 0) {
			local77 = 0;
		}
		@Pc(87) int local87 = arg0 + arg2;
		if (super.anInt6908 - 1 < local87) {
			local87 = super.anInt6908 - 1;
		}
		@Pc(102) int local102 = arg2 + arg3;
		if (local102 > super.anInt6909 - 1) {
			local102 = super.anInt6909 - 1;
		}
		@Pc(115) int local115 = 0;
		@Pc(119) int[] local119 = this.aClass135_Sub2_40.anIntArray518;
		@Pc(132) int local132;
		for (@Pc(121) int local121 = local66; local121 <= local87; local121++) {
			@Pc(130) boolean[] local130 = arg4[local121 - local68];
			for (local132 = local77; local132 <= local102; local132++) {
				if (local130[local132 - local79]) {
					local119[local115++] = local121 + super.anInt6908 * local132;
				}
			}
		}
		this.aClass135_Sub2_40.method5470();
		this.aClass135_Sub2_40.method5461((this.anInt6910 & 0x7) != 0);
		for (@Pc(200) int local200 = 0; local200 < this.aClass4_Sub45Array1.length; local200++) {
			this.aClass4_Sub45Array1[local200].method5863(local115, local119);
		}
		if (!this.aClass244_47.method5272()) {
			local132 = this.aClass135_Sub2_40.anInt6799;
			@Pc(229) int local229 = this.aClass135_Sub2_40.anInt6807;
			this.aClass135_Sub2_40.UA(0, local229, this.aClass135_Sub2_40.anInt6813);
			this.aClass135_Sub2_40.g(local20, local16 - 4.0F);
			this.aClass135_Sub2_40.method5461(false);
			this.aClass135_Sub2_40.method5473(false);
			this.aClass135_Sub2_40.method5426(128);
			this.aClass135_Sub2_40.method5485(-2);
			this.aClass135_Sub2_40.method5458(this.aClass135_Sub2_40.aClass65_Sub2_5);
			this.aClass135_Sub2_40.method5407(8448, 7681);
			this.aClass135_Sub2_40.method5474(34166, 0, 770);
			this.aClass135_Sub2_40.method5425(0, 34167);
			for (@Pc(296) Class4 local296 = this.aClass244_47.method5263(); local296 != null; local296 = this.aClass244_47.method5271()) {
				@Pc(301) Class4_Sub31 local301 = (Class4_Sub31) local296;
				local301.method3713(arg3, arg0, arg4, arg2);
			}
			this.aClass135_Sub2_40.method5474(5890, 0, 768);
			this.aClass135_Sub2_40.method5425(0, 5890);
			this.aClass135_Sub2_40.method5458(null);
			this.aClass135_Sub2_40.UA(local132, local229, this.aClass135_Sub2_40.anInt6813);
		}
		if (this.aClass89_2 != null) {
			this.aClass135_Sub2_40.g(local20, local16 - 8.0F);
			this.aClass135_Sub2_40.method5470();
			this.aClass135_Sub2_40.method5431(this.aClass190_15, this.aClass190_13, null, null);
			this.aClass89_2.method1725(arg1, arg2, arg0, arg3, arg4);
		}
		this.aClass135_Sub2_40.g(local20, local16);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)V")
	@Override
	public void method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5563(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6937 <= 0) {
			return;
		}
		this.aClass135_Sub2_40.method5469();
		this.aClass135_Sub2_40.method5480(false);
		this.aClass135_Sub2_40.method5461(false);
		this.aClass135_Sub2_40.method5447(false);
		this.aClass135_Sub2_40.method5473(false);
		this.aClass135_Sub2_40.method5426(0);
		this.aClass135_Sub2_40.method5485(-2);
		this.aClass135_Sub2_40.method5458(null);
		Static54.aFloatArray4[0] = (float) 1024 / ((float) super.anInt6905 * 128.0F * (float) this.aClass135_Sub2_40.anInt6656);
		Static54.aFloatArray4[4] = 0.0F;
		Static54.aFloatArray4[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass135_Sub2_40.anInt6656;
		Static54.aFloatArray4[6] = 0.0F;
		Static54.aFloatArray4[8] = 0.0F;
		Static54.aFloatArray4[10] = 0.0F;
		Static54.aFloatArray4[3] = 0.0F;
		Static54.aFloatArray4[7] = 0.0F;
		Static54.aFloatArray4[11] = 0.0F;
		Static54.aFloatArray4[15] = 1.0F;
		Static54.aFloatArray4[1] = 0.0F;
		Static54.aFloatArray4[2] = 0.0F;
		Static54.aFloatArray4[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass135_Sub2_40.anInt6646;
		Static54.aFloatArray4[5] = (float) 1024 / ((float) super.anInt6905 * 128.0F * (float) this.aClass135_Sub2_40.anInt6646);
		Static54.aFloatArray4[14] = 0.0F;
		Static54.aFloatArray4[9] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static54.aFloatArray4, 0);
		Static54.aFloatArray4[13] = 0.0F;
		Static54.aFloatArray4[5] = 0.0F;
		Static54.aFloatArray4[4] = 0.0F;
		Static54.aFloatArray4[3] = 0.0F;
		Static54.aFloatArray4[14] = 0.0F;
		Static54.aFloatArray4[12] = 0.0F;
		Static54.aFloatArray4[2] = 0.0F;
		Static54.aFloatArray4[6] = 1.0F;
		Static54.aFloatArray4[7] = 0.0F;
		Static54.aFloatArray4[15] = 1.0F;
		Static54.aFloatArray4[9] = 1.0F;
		Static54.aFloatArray4[8] = 0.0F;
		Static54.aFloatArray4[0] = 1.0F;
		Static54.aFloatArray4[1] = 0.0F;
		Static54.aFloatArray4[10] = 0.0F;
		Static54.aFloatArray4[11] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static54.aFloatArray4, 0);
		if ((this.anInt6910 & 0x7) == 0) {
			this.aClass135_Sub2_40.method5461(false);
		} else {
			this.aClass135_Sub2_40.method5461(true);
			this.aClass135_Sub2_40.method5437();
		}
		this.aClass135_Sub2_40.method5431(this.aClass190_15, this.aClass190_13, this.aClass190_12, this.aClass190_14);
		if (this.anInt6911 * 2 > this.aClass135_Sub2_40.aClass4_Sub9_Sub1_3.aByteArray81.length) {
			this.aClass135_Sub2_40.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(this.anInt6911 * 2);
		} else {
			this.aClass135_Sub2_40.aClass4_Sub9_Sub1_3.anInt6207 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class4_Sub9_Sub1 local318 = this.aClass135_Sub2_40.aClass4_Sub9_Sub1_3;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass135_Sub2_40.aBoolean474) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = super.anInt6908 * local324 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray7[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local314++;
								local318.method5029(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = arg0 + super.anInt6908 * local324;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray7[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local314++;
								local318.method5060(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(470) Class62_Sub2 local470 = new Class62_Sub2(this.aClass135_Sub2_40, 5123, local318.aByteArray81, local318.anInt6207);
			this.aClass135_Sub2_40.method5479(local470, 0, local314);
		}
	}

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray16[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass89_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass135_Sub2_40.anInt6809 >> 8) >> this.aClass135_Sub2_40.anInt6780;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass135_Sub2_40.anInt6791 >> 8) >> this.aClass135_Sub2_40.anInt6780;
			this.aClass89_2.method1731(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt6907;
		@Pc(13) int local13 = arg1 >> super.anInt6907;
		if (local8 < 0 || local13 < 0 || super.anInt6908 - 1 < local8 || super.anInt6909 - 1 < local13) {
			return 0;
		}
		@Pc(49) int local49 = super.anInt6905 - 1 & arg0;
		@Pc(56) int local56 = super.anInt6905 - 1 & arg1;
		@Pc(84) int local84 = (super.anInt6905 - local49) * this.anIntArrayArray59[local8][local13] + this.anIntArrayArray59[local8 + 1][local13] * local49 >> super.anInt6907;
		@Pc(115) int local115 = this.anIntArrayArray59[local8][local13 + 1] * (super.anInt6905 - local49) + local49 * this.anIntArrayArray59[local8 + 1][local13 + 1] >> super.anInt6907;
		return local56 * local115 + local84 * (super.anInt6905 - local56) >> super.anInt6907;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.B(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass89_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass135_Sub2_40.anInt6809 * arg2 >> 8) >> this.aClass135_Sub2_40.anInt6780;
			@Pc(39) int local39 = arg3 - (this.aClass135_Sub2_40.anInt6791 * arg2 >> 8) >> this.aClass135_Sub2_40.anInt6780;
			this.aClass89_2.method1726(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray59[arg0][arg1];
	}
}
