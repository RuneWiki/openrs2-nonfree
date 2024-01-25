import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class106_Sub2 extends Class106 {

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	private int anInt7004;

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
	private int anInt7021;

	@OriginalMember(owner = "client!ui", name = "W", descriptor = "Lclient!gs;")
	public Class100 aClass100_8;

	@OriginalMember(owner = "client!ui", name = "Y", descriptor = "Lclient!gs;")
	public Class100 aClass100_9;

	@OriginalMember(owner = "client!ui", name = "Z", descriptor = "Lclient!gs;")
	private Class100 aClass100_10;

	@OriginalMember(owner = "client!ui", name = "ab", descriptor = "Lclient!rg;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!ui", name = "bb", descriptor = "[Lclient!um;")
	private Class2_Sub40[] aClass2_Sub40Array1;

	@OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
	private int anInt7027;

	@OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
	private int anInt7028;

	@OriginalMember(owner = "client!ui", name = "hb", descriptor = "Lclient!gs;")
	public Class100 aClass100_11;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "Lclient!wl;")
	private final Class265 aClass265_48 = new Class265();

	@OriginalMember(owner = "client!ui", name = "U", descriptor = "Lclient!bo;")
	public final Class26_Sub1 aClass26_Sub1_35;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "[[I")
	private final int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
	private final int anInt7016;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
	private final int anInt7013;

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
	public final int anInt7024;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ui", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "[[[Lclient!um;")
	private Class2_Sub40[][][] aClass2_Sub40ArrayArrayArray1;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!ui", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ui", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!ui", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!ui", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ui", name = "eb", descriptor = "Lclient!ub;")
	private Class240 aClass240_36;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "Lclient!ts;")
	private Class236 aClass236_2;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!bo;IIII[[I[[II)V")
	public Class106_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass26_Sub1_35 = arg0;
		this.anIntArrayArray53 = arg5;
		this.anInt7016 = super.anInt7000 - 2;
		this.anInt7013 = 0x1 << this.anInt7016;
		this.anInt7024 = arg2;
		this.aByteArrayArray21 = new byte[arg3][arg4];
		this.aFloatArrayArray9 = new float[super.anInt6999 + 1][super.anInt7001 + 1];
		this.aClass2_Sub40ArrayArrayArray1 = new Class2_Sub40[arg3][arg4][];
		this.aShortArrayArray6 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt6999 + 1][super.anInt7001 + 1];
		this.aFloatArrayArray7 = new float[super.anInt6999 + 1][super.anInt7001 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aByteArrayArray22 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(117) int local117 = 1; super.anInt7001 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt6999 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray8[local121][local117] = local177 * (float) local140;
				this.aFloatArrayArray9[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray7[local121][local117] = local177 * (float) local157;
			}
		}
		this.aClass240_36 = new Class240(128);
		if ((this.anInt7024 & 0x10) != 0) {
			this.aClass236_2 = new Class236(this.aClass26_Sub1_35, this);
		}
	}

	@OriginalMember(owner = "client!ui", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt7000;
		@Pc(13) int local13 = arg1 >> super.anInt7000;
		if (local8 < 0 || local13 < 0 || super.anInt6999 - 1 < local8 || super.anInt7001 - 1 < local13) {
			return 0;
		}
		@Pc(42) int local42 = arg0 & super.anInt6997 - 1;
		@Pc(49) int local49 = super.anInt6997 - 1 & arg1;
		@Pc(75) int local75 = this.anIntArrayArray53[local8 + 1][local13] * local42 + this.anIntArrayArray53[local8][local13] * (super.anInt6997 - local42) >> super.anInt7000;
		@Pc(105) int local105 = this.anIntArrayArray53[local8][local13 + 1] * (super.anInt6997 - local42) + local42 * this.anIntArrayArray53[local8 + 1][local13 + 1] >> super.anInt7000;
		return (super.anInt6997 - local49) * local75 + local105 * local49 >> super.anInt7000;
	}

	@OriginalMember(owner = "client!ui", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray22[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ui", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt6999][super.anInt7001][];
		}
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt6999][super.anInt7001][];
		}
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray15[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray19[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub40[] local88 = this.aClass2_Sub40ArrayArrayArray1[arg0][arg1] = new Class2_Sub40[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class2 local125;
			for (local125 = this.aClass240_36.method5439(local119); local125 != null; local125 = this.aClass240_36.method5434()) {
				@Pc(130) Class2_Sub40 local130 = (Class2_Sub40) local125;
				if (local130.anInt7064 == arg8[local90] && (float) arg9[local90] == local130.aFloat210 && arg10 == local130.anInt7061 && arg11 == local130.anInt7067 && arg12 == local130.anInt7071) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub40(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass240_36.method5430(local119, local88[local90]);
			} else {
				local88[local90] = (Class2_Sub40) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray21[arg0][arg1] = (byte) (this.aByteArrayArray21[arg0][arg1] | 0x1);
		}
		if (this.anInt7028 < arg6.length) {
			this.anInt7028 = arg6.length;
		}
		this.anInt7027 += arg6.length;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!or;[I)V")
	@Override
	public void method5480(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass265_48.method5999(new Class2_Sub5(this.aClass26_Sub1_35, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "()V")
	@Override
	public void f() {
		if (this.anInt7027 <= 0) {
			this.aClass236_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt6999 + 1][super.anInt7001 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; super.anInt6999 > local28; local28++) {
				for (local32 = 1; super.anInt7001 > local32; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray22[local28][local32] >> 1) + (this.aByteArrayArray22[local28][local32 + 1] >> 3) + (this.aByteArrayArray22[local28 - -1][local32] >> 3) + (this.aByteArrayArray22[local28 + -1][local32] >> 2) + (this.aByteArrayArray22[local28][local32 + -1] >> 2));
				}
			}
			this.aClass2_Sub40Array1 = new Class2_Sub40[this.aClass240_36.method5431()];
			this.aClass240_36.method5432(this.aClass2_Sub40Array1);
			for (local32 = 0; local32 < this.aClass2_Sub40Array1.length; local32++) {
				this.aClass2_Sub40Array1[local32].method5522(this.anInt7027);
			}
			@Pc(140) int local140 = 24;
			if (this.anIntArrayArrayArray17 != null) {
				local140 += 4;
			}
			if ((this.anInt7024 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(162) NativeBuffer local162 = this.aClass26_Sub1_35.aNativeHeap2.a(local140 * this.anInt7027);
			@Pc(167) NativeStream local167 = new NativeStream(local162);
			@Pc(171) Class2_Sub40[] local171 = new Class2_Sub40[this.anInt7027];
			@Pc(179) Class240 local179 = new Class240(Static288.method4219(this.anInt7027));
			@Pc(183) Class2_Sub40[] local183 = new Class2_Sub40[this.anInt7028];
			@Pc(189) int local189;
			for (@Pc(185) int local185 = 0; super.anInt6999 > local185; local185++) {
				for (local189 = 0; local189 < super.anInt7001; local189++) {
					if (this.anIntArrayArrayArray16[local185][local189] != null) {
						@Pc(205) Class2_Sub40[] local205 = this.aClass2_Sub40ArrayArrayArray1[local185][local189];
						@Pc(212) int[] local212 = this.anIntArrayArrayArray18[local185][local189];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray15[local185][local189];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray19[local185][local189];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray16[local185][local189];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local185][local189];
						@Pc(257) int[] local257 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local185][local189];
						if (local226 == null) {
							local226 = local233;
						}
						@Pc(268) float local268 = this.aFloatArrayArray8[local185][local189];
						@Pc(275) float local275 = this.aFloatArrayArray9[local185][local189];
						@Pc(282) float local282 = this.aFloatArrayArray7[local185][local189];
						@Pc(291) float local291 = this.aFloatArrayArray8[local185][local189 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray9[local185][local189 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray7[local185][local189 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray8[local185 + 1][local189 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray9[local185 + 1][local189 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray7[local185 + 1][local189 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray8[local185 + 1][local189];
						@Pc(360) float local360 = this.aFloatArrayArray9[local185 + 1][local189];
						@Pc(369) float local369 = this.aFloatArrayArray7[local185 + 1][local189];
						@Pc(377) int local377 = local26[local185][local189] & 0xFF;
						@Pc(387) int local387 = local26[local185][local189 + 1] & 0xFF;
						@Pc(399) int local399 = local26[local185 + 1][local189 + 1] & 0xFF;
						@Pc(409) int local409 = local26[local185 + 1][local189] & 0xFF;
						@Pc(411) int local411 = 0;
						@Pc(421) int local421;
						label331: for (@Pc(413) int local413 = 0; local413 < local233.length; local413++) {
							@Pc(419) Class2_Sub40 local419 = local205[local413];
							for (local421 = 0; local421 < local411; local421++) {
								if (local183[local421] == local419) {
									continue label331;
								}
							}
							local183[local411++] = local419;
						}
						@Pc(458) short[] local458 = this.aShortArrayArray6[local185 + local189 * super.anInt6999] = new short[local233.length];
						for (local421 = 0; local421 < local233.length; local421++) {
							@Pc(472) int local472 = (local185 << super.anInt7000) + local212[local421];
							@Pc(481) int local481 = (local189 << super.anInt7000) + local219[local421];
							@Pc(486) int local486 = local472 >> this.anInt7016;
							@Pc(491) int local491 = local481 >> this.anInt7016;
							@Pc(495) int local495 = local233[local421];
							@Pc(499) int local499 = local226[local421];
							@Pc(507) int local507 = local245 == null ? 0 : local245[local421];
							@Pc(525) long local525 = (long) local499 << 48 | (long) local495 << 32 | (long) (local486 << 16) | (long) local491;
							@Pc(529) int local529 = local212[local421];
							@Pc(533) int local533 = local219[local421];
							@Pc(535) byte local535 = 74;
							@Pc(537) int local537 = 0;
							@Pc(539) float local539 = 1.0F;
							@Pc(559) float local559;
							@Pc(551) float local551;
							@Pc(557) float local557;
							@Pc(634) float local634;
							@Pc(555) int local555;
							if (local529 == 0 && local533 == 0) {
								local551 = local275;
								local555 = local535 - local377;
								local557 = local282;
								local559 = local268;
							} else if (local529 == 0 && local533 == super.anInt6997) {
								local557 = local309;
								local555 = local535 - local387;
								local559 = local291;
								local551 = local300;
							} else if (super.anInt6997 == local529 && super.anInt6997 == local533) {
								local559 = local320;
								local557 = local342;
								local551 = local331;
								local555 = local535 - local399;
							} else if (local529 == super.anInt6997 && local533 == 0) {
								local555 = local535 - local409;
								local559 = local351;
								local557 = local369;
								local551 = local360;
							} else {
								@Pc(611) float local611 = (float) local529 / (float) super.anInt6997;
								@Pc(618) float local618 = (float) local533 / (float) super.anInt6997;
								@Pc(626) float local626 = (local351 - local268) * local611 + local268;
								local634 = local275 + (local360 - local275) * local611;
								@Pc(643) float local643 = local282 + (local369 - local282) * local611;
								@Pc(651) float local651 = local291 + local611 * (local320 - local291);
								@Pc(660) float local660 = local611 * (local331 - local300) + local300;
								local551 = local634 + (local660 - local634) * local618;
								local559 = local626 + (local651 - local626) * local618;
								@Pc(685) float local685 = (local342 - local309) * local611 + local309;
								local557 = local643 + (local685 - local643) * local618;
								@Pc(705) int local705 = (local529 * (local409 - local377) >> super.anInt7000) + local377;
								@Pc(717) int local717 = local387 + ((local399 - local387) * local529 >> super.anInt7000);
								local555 = local535 - ((local717 - local705) * local533 >> super.anInt7000) - local705;
							}
							if (local495 != -1) {
								@Pc(766) int local766 = local555 * (local495 & 0x7F) >> 7;
								if (local766 < 2) {
									local766 = 2;
								} else if (local766 > 126) {
									local766 = 126;
								}
								local537 = Static130.anIntArray144[local495 & 0xFF80 | local766];
								if ((this.anInt7024 & 0x7) == 0) {
									local539 = local557 * this.aClass26_Sub1_35.aFloatArray3[2] + this.aClass26_Sub1_35.aFloatArray3[1] * local551 + this.aClass26_Sub1_35.aFloatArray3[0] * local559;
									local539 = (local539 > 0.0F ? this.aClass26_Sub1_35.aFloat24 : this.aClass26_Sub1_35.aFloat22) * local539 + this.aClass26_Sub1_35.aFloat33;
								}
							}
							@Pc(840) Class2 local840 = null;
							if ((local472 & this.anInt7013 - 1) == 0 && (local481 & this.anInt7013 - 1) == 0) {
								local840 = local179.method5439(local525);
							}
							@Pc(1192) int local1192;
							@Pc(895) int local895;
							if (local840 == null) {
								if (local499 == local495) {
									local895 = local537;
								} else {
									@Pc(875) int local875 = local555 * (local499 & 0x7F) >> 7;
									if (local875 < 2) {
										local875 = 2;
									} else if (local875 > 126) {
										local875 = 126;
									}
									local895 = Static130.anIntArray144[local499 & 0xFF80 | local875];
									if ((this.anInt7024 & 0x7) == 0) {
										local634 = this.aClass26_Sub1_35.aFloatArray3[0] * local559 + this.aClass26_Sub1_35.aFloatArray3[1] * local551 + local557 * this.aClass26_Sub1_35.aFloatArray3[2];
										local634 = this.aClass26_Sub1_35.aFloat33 + (local539 > 0.0F ? this.aClass26_Sub1_35.aFloat24 : this.aClass26_Sub1_35.aFloat22) * local539;
										@Pc(951) int local951 = local895 >> 16 & 0xFF;
										@Pc(957) int local957 = local895 >> 8 & 0xFF;
										@Pc(961) int local961 = local895 & 0xFF;
										local951 = (int) ((float) local951 * local634);
										if (local951 < 0) {
											local951 = 0;
										} else if (local951 > 255) {
											local951 = 255;
										}
										local957 = (int) ((float) local957 * local634);
										local961 = (int) ((float) local961 * local634);
										if (local957 < 0) {
											local957 = 0;
										} else if (local957 > 255) {
											local957 = 255;
										}
										if (local961 < 0) {
											local961 = 0;
										} else if (local961 > 255) {
											local961 = 255;
										}
										local895 = local957 << 8 | local951 << 16 | local961;
									}
								}
								if (this.aClass26_Sub1_35.aBoolean76) {
									local167.b((float) local472);
									local167.b((float) (this.va(local472, local481) + local507));
									local167.b((float) local481);
									local167.b((byte) (local895 >> 16));
									local167.b((byte) (local895 >> 8));
									local167.b((byte) local895);
									local167.b(-1);
									local167.b((float) local472);
									local167.b((float) local481);
									if (this.anIntArrayArrayArray17 != null) {
										local167.b((float) (local257 == null ? 0 : local257[local421] - 1));
									}
									if ((this.anInt7024 & 0x7) != 0) {
										local167.b(local559);
										local167.b(local551);
										local167.b(local557);
									}
								} else {
									local167.a((float) local472);
									local167.a((float) (this.va(local472, local481) + local507));
									local167.a((float) local481);
									local167.b((byte) (local895 >> 16));
									local167.b((byte) (local895 >> 8));
									local167.b((byte) local895);
									local167.b(-1);
									local167.a((float) local472);
									local167.a((float) local481);
									if (this.anIntArrayArrayArray17 != null) {
										local167.a((float) (local257 == null ? 0 : local257[local421] - 1));
									}
									if ((this.anInt7024 & 0x7) != 0) {
										local167.a(local559);
										local167.a(local551);
										local167.a(local557);
									}
								}
								local1192 = this.anInt7004++;
								local458[local421] = (short) local1192;
								if (local495 != -1) {
									local171[local1192] = local205[local421];
								}
								local179.method5430(local525, new Class2_Sub33(local458[local421]));
							} else {
								local458[local421] = ((Class2_Sub33) local840).aShort69;
								local1192 = local458[local421] & 0xFFFF;
								if (local495 != -1 && local171[local1192].aLong227 > local205[local421].aLong227) {
									local171[local1192] = local205[local421];
								}
							}
							for (local895 = 0; local895 < local411; local895++) {
								local183[local895].method5520(local555, local1192, local537, local539);
							}
							this.anInt7021++;
						}
					}
				}
			}
			for (local189 = 0; local189 < this.anInt7004; local189++) {
				@Pc(1308) Class2_Sub40 local1308 = local171[local189];
				if (local1308 != null) {
					local1308.method5518(local189);
				}
			}
			@Pc(1341) int local1341;
			for (@Pc(1321) int local1321 = 0; super.anInt6999 > local1321; local1321++) {
				for (@Pc(1325) int local1325 = 0; super.anInt7001 > local1325; local1325++) {
					@Pc(1337) short[] local1337 = this.aShortArrayArray6[local1325 * super.anInt6999 + local1321];
					if (local1337 != null) {
						local1341 = 0;
						@Pc(1343) int local1343 = 0;
						while (local1337.length > local1343) {
							@Pc(1352) int local1352 = local1337[local1343++] & 0xFFFF;
							@Pc(1359) int local1359 = local1337[local1343++] & 0xFFFF;
							@Pc(1366) int local1366 = local1337[local1343++] & 0xFFFF;
							@Pc(1370) Class2_Sub40 local1370 = local171[local1352];
							@Pc(1374) Class2_Sub40 local1374 = local171[local1359];
							@Pc(1378) Class2_Sub40 local1378 = local171[local1366];
							@Pc(1380) Class2_Sub40 local1380 = null;
							if (local1370 != null) {
								local1380 = local1370;
								local1370.method5523(local1321, local1325, local1341);
							}
							if (local1374 != null) {
								local1374.method5523(local1321, local1325, local1341);
								if (local1380 == null || local1374.aLong227 < local1380.aLong227) {
									local1380 = local1374;
								}
							}
							if (local1378 != null) {
								local1378.method5523(local1321, local1325, local1341);
								if (local1380 == null || local1380.aLong227 > local1378.aLong227) {
									local1380 = local1378;
								}
							}
							if (local1380 != null) {
								if (local1370 != null) {
									local1380.method5518(local1352);
								}
								if (local1374 != null) {
									local1380.method5518(local1359);
								}
								if (local1378 != null) {
									local1380.method5518(local1366);
								}
								local1380.method5523(local1321, local1325, local1341);
							}
							local1341++;
						}
					}
				}
			}
			local167.a();
			this.anInterface12_6 = this.aClass26_Sub1_35.method648(local167.b(), local140, local162);
			this.aClass100_11 = new Class100(this.aClass26_Sub1_35, this.anInterface12_6, 5126, 3, 0);
			this.aClass100_10 = new Class100(this.aClass26_Sub1_35, this.anInterface12_6, 5121, 4, 12);
			@Pc(1525) byte local1525;
			if (this.anIntArrayArrayArray17 == null) {
				this.aClass100_8 = new Class100(this.aClass26_Sub1_35, this.anInterface12_6, 5126, 2, 16);
				local1525 = 24;
			} else {
				this.aClass100_8 = new Class100(this.aClass26_Sub1_35, this.anInterface12_6, 5126, 3, 16);
				local1525 = 28;
			}
			if ((this.anInt7024 & 0x7) != 0) {
				this.aClass100_9 = new Class100(this.aClass26_Sub1_35, this.anInterface12_6, 5126, 3, local1525);
			}
			@Pc(1566) long[] local1566 = new long[this.aClass2_Sub40Array1.length];
			for (local1341 = 0; local1341 < this.aClass2_Sub40Array1.length; local1341++) {
				@Pc(1575) Class2_Sub40 local1575 = this.aClass2_Sub40Array1[local1341];
				local1566[local1341] = local1575.aLong227;
				local1575.method5524(this.anInt7004);
			}
			Static285.method4200(this.aClass2_Sub40Array1, local1566);
			if (this.aClass236_2 != null) {
				this.aClass236_2.method5375();
			}
		}
		this.anIntArrayArrayArray17 = null;
		this.aClass2_Sub40ArrayArrayArray1 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass240_36 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray9 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray15 = null;
		this.aByteArrayArray22 = null;
		this.anIntArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([[ZIZIIII)V")
	private void method5486(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass2_Sub40Array1 == null) {
			return;
		}
		@Pc(13) float local13 = this.aClass26_Sub1_35.aFloat38;
		@Pc(17) float local17 = this.aClass26_Sub1_35.aFloat27;
		@Pc(23) int local23 = arg2 + arg2 + 1;
		@Pc(27) int local27 = local23 * local23;
		if (Static285.anIntArray345.length < local27) {
			Static285.anIntArray345 = new int[local27];
		}
		if (Static188.aClass2_Sub20_3.aByteArray136.length < this.anInt7021 * 2) {
			Static188.aClass2_Sub20_3 = new Class2_Sub20(this.anInt7021 * 2);
		}
		@Pc(59) int local59 = arg4 - arg2;
		@Pc(61) int local61 = local59;
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(73) int local73 = arg3 - arg2;
		@Pc(75) int local75 = local73;
		if (local73 < 0) {
			local73 = 0;
		}
		@Pc(86) int local86 = arg2 + arg4;
		if (local86 > super.anInt6999 - 1) {
			local86 = super.anInt6999 - 1;
		}
		@Pc(102) int local102 = arg3 + arg2;
		Static322.anInt5770 = 0;
		if (super.anInt7001 - 1 < local102) {
			local102 = super.anInt7001 - 1;
		}
		@Pc(127) int local127;
		for (@Pc(117) int local117 = local59; local117 <= local86; local117++) {
			@Pc(125) boolean[] local125 = arg0[local117 - local61];
			for (local127 = local73; local127 <= local102; local127++) {
				if (local125[local127 - local75]) {
					Static285.anIntArray345[Static322.anInt5770++] = local117 + local127 * super.anInt6999;
				}
			}
		}
		this.aClass26_Sub1_35.method666();
		this.aClass26_Sub1_35.method662((this.anInt7024 & 0x7) != 0);
		for (@Pc(205) int local205 = 0; local205 < this.aClass2_Sub40Array1.length; local205++) {
			this.aClass2_Sub40Array1[local205].method5516(Static285.anIntArray345, Static322.anInt5770);
		}
		if (!this.aClass265_48.method5997()) {
			local127 = this.aClass26_Sub1_35.anInt952;
			@Pc(234) int local234 = this.aClass26_Sub1_35.anInt965;
			this.aClass26_Sub1_35.V(0, local234, this.aClass26_Sub1_35.anInt938);
			this.aClass26_Sub1_35.o(local17, local13 - 4.0F);
			this.aClass26_Sub1_35.method662(false);
			this.aClass26_Sub1_35.method644(false);
			this.aClass26_Sub1_35.method671(128);
			this.aClass26_Sub1_35.method628(-2);
			this.aClass26_Sub1_35.method673(this.aClass26_Sub1_35.aClass65_Sub3_1);
			this.aClass26_Sub1_35.method695(8448, 7681);
			this.aClass26_Sub1_35.method646(0, 770, 34166);
			this.aClass26_Sub1_35.method643(0, 34167);
			for (@Pc(301) Class2 local301 = this.aClass265_48.method6005(); local301 != null; local301 = this.aClass265_48.method6001()) {
				@Pc(306) Class2_Sub5 local306 = (Class2_Sub5) local301;
				local306.method387(arg2, arg4, arg0, arg3);
			}
			this.aClass26_Sub1_35.method646(0, 768, 5890);
			this.aClass26_Sub1_35.method643(0, 5890);
			this.aClass26_Sub1_35.method673(null);
			this.aClass26_Sub1_35.V(local127, local234, this.aClass26_Sub1_35.anInt938);
		}
		if (this.aClass236_2 != null) {
			this.aClass26_Sub1_35.o(local17, local13 - 8.0F);
			this.aClass26_Sub1_35.method666();
			this.aClass26_Sub1_35.method668(this.aClass100_8, this.aClass100_11, null, null);
			this.aClass236_2.method5374(arg4, arg1, arg3, arg0, arg2);
		}
		this.aClass26_Sub1_35.o(local17, local13);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5484(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7027 <= 0) {
			return;
		}
		this.aClass26_Sub1_35.method688();
		this.aClass26_Sub1_35.method638(false);
		this.aClass26_Sub1_35.method662(false);
		this.aClass26_Sub1_35.method675(false);
		this.aClass26_Sub1_35.method644(false);
		this.aClass26_Sub1_35.method671(0);
		this.aClass26_Sub1_35.method628(-2);
		this.aClass26_Sub1_35.method673(null);
		Static210.aFloatArray24[1] = 0.0F;
		Static210.aFloatArray24[8] = 0.0F;
		Static210.aFloatArray24[6] = 0.0F;
		Static210.aFloatArray24[10] = 0.0F;
		Static210.aFloatArray24[3] = 0.0F;
		Static210.aFloatArray24[9] = 0.0F;
		Static210.aFloatArray24[11] = 0.0F;
		Static210.aFloatArray24[2] = 0.0F;
		Static210.aFloatArray24[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass26_Sub1_35.anInt786;
		Static210.aFloatArray24[5] = (float) 1024 / ((float) super.anInt6997 * 128.0F * (float) this.aClass26_Sub1_35.anInt786);
		Static210.aFloatArray24[0] = (float) 1024 / ((float) this.aClass26_Sub1_35.anInt763 * 128.0F * (float) super.anInt6997);
		Static210.aFloatArray24[7] = 0.0F;
		Static210.aFloatArray24[4] = 0.0F;
		Static210.aFloatArray24[14] = 0.0F;
		Static210.aFloatArray24[15] = 1.0F;
		Static210.aFloatArray24[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass26_Sub1_35.anInt763) - 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static210.aFloatArray24, 0);
		Static210.aFloatArray24[15] = 1.0F;
		Static210.aFloatArray24[8] = 0.0F;
		Static210.aFloatArray24[11] = 0.0F;
		Static210.aFloatArray24[0] = 1.0F;
		Static210.aFloatArray24[10] = 0.0F;
		Static210.aFloatArray24[1] = 0.0F;
		Static210.aFloatArray24[7] = 0.0F;
		Static210.aFloatArray24[2] = 0.0F;
		Static210.aFloatArray24[13] = 0.0F;
		Static210.aFloatArray24[14] = 0.0F;
		Static210.aFloatArray24[6] = 1.0F;
		Static210.aFloatArray24[5] = 0.0F;
		Static210.aFloatArray24[9] = 1.0F;
		Static210.aFloatArray24[3] = 0.0F;
		Static210.aFloatArray24[12] = 0.0F;
		Static210.aFloatArray24[4] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static210.aFloatArray24, 0);
		if ((this.anInt7024 & 0x7) == 0) {
			this.aClass26_Sub1_35.method662(false);
		} else {
			this.aClass26_Sub1_35.method662(true);
			this.aClass26_Sub1_35.method661();
		}
		this.aClass26_Sub1_35.method668(this.aClass100_8, this.aClass100_11, this.aClass100_9, this.aClass100_10);
		if (Static188.aClass2_Sub20_3.aByteArray136.length < this.anInt7021 * 2) {
			Static188.aClass2_Sub20_3 = new Class2_Sub20(this.anInt7021 * 2);
		} else {
			Static188.aClass2_Sub20_3.anInt4608 = 0;
		}
		@Pc(308) int local308 = 0;
		@Pc(314) int local314;
		@Pc(323) int local323;
		@Pc(325) int local325;
		@Pc(344) short[] local344;
		@Pc(348) int local348;
		if (this.aClass26_Sub1_35.aBoolean76) {
			for (local314 = arg1; local314 < arg3; local314++) {
				local323 = arg0 + super.anInt6999 * local314;
				for (local325 = arg0; local325 < arg2; local325++) {
					if (arg4[local325 - arg0][local314 - arg1]) {
						local344 = this.aShortArrayArray6[local323];
						if (local344 != null) {
							for (local348 = 0; local348 < local344.length; local348++) {
								local308++;
								Static188.aClass2_Sub20_3.method3745(local344[local348] & 0xFFFF);
							}
						}
					}
					local323++;
				}
			}
		} else {
			for (local314 = arg1; local314 < arg3; local314++) {
				local323 = arg0 + super.anInt6999 * local314;
				for (local325 = arg0; local325 < arg2; local325++) {
					if (arg4[local325 - arg0][local314 - arg1]) {
						local344 = this.aShortArrayArray6[local323];
						if (local344 != null) {
							for (local348 = 0; local348 < local344.length; local348++) {
								local308++;
								Static188.aClass2_Sub20_3.method3714(local344[local348] & 0xFFFF);
							}
						}
					}
					local323++;
				}
			}
		}
		if (local308 > 0) {
			@Pc(469) Class53_Sub1 local469 = new Class53_Sub1(this.aClass26_Sub1_35, 5123, Static188.aClass2_Sub20_3.aByteArray136, Static188.aClass2_Sub20_3.anInt4608);
			this.aClass26_Sub1_35.method664(0, local308, local469);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBILclient!wg;)V")
	private void method5487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub9_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray18[arg1][arg0];
		@Pc(25) int[] local25 = this.anIntArrayArrayArray15[arg1][arg0];
		@Pc(28) int local28 = local12.length;
		if (local28 > Static154.anIntArray204.length) {
			Static154.anIntArray204 = new int[local28];
			Static1.anIntArray1 = new int[local28];
		}
		for (@Pc(44) int local44 = 0; local44 < local28; local44++) {
			Static154.anIntArray204[local44] = (local12[local44] & 0xFF) >> this.aClass26_Sub1_35.anInt924;
			Static1.anIntArray1[local44] = (local25[local44] & 0xFF) >> this.aClass26_Sub1_35.anInt924;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local28) {
			@Pc(86) int local86 = Static154.anIntArray204[local80];
			@Pc(91) int local91 = Static1.anIntArray1[local80++];
			@Pc(95) int local95 = Static154.anIntArray204[local80];
			@Pc(100) int local100 = Static1.anIntArray1[local80++];
			@Pc(104) int local104 = Static154.anIntArray204[local80];
			@Pc(109) int local109 = Static1.anIntArray1[local80++];
			if ((local86 - local95) * (local100 - local109) - (local100 - local91) * (local104 - local95) > 0) {
				arg2.method5941(local100, local104, local91, local86, local109, local95);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.JA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	@Override
	public void method5482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5486(arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass236_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass26_Sub1_35.anInt937 * arg2 >> 8) >> this.aClass26_Sub1_35.anInt924;
			@Pc(38) int local38 = arg3 - (this.aClass26_Sub1_35.anInt967 * arg2 >> 8) >> this.aClass26_Sub1_35.anInt924;
			this.aClass236_2.method5368(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass236_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass26_Sub1_35.anInt937 * arg2 >> 8) >> this.aClass26_Sub1_35.anInt924;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass26_Sub1_35.anInt967 >> 8) >> this.aClass26_Sub1_35.anInt924;
			this.aClass236_2.method5369(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray53[arg0][arg1];
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method5478(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass236_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass26_Sub1_35.anInt937 >> 8) >> this.aClass26_Sub1_35.anInt924;
			@Pc(39) int local39 = arg3 - (this.aClass26_Sub1_35.anInt967 * arg2 >> 8) >> this.aClass26_Sub1_35.anInt924;
			return this.aClass236_2.method5370(arg0, local25, local39);
		}
	}

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class2_Sub2_Sub9 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub9 arg2) {
		if ((this.aByteArrayArray21[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt6997 >> this.aClass26_Sub1_35.anInt924;
		@Pc(24) Class2_Sub2_Sub9_Sub1 local24 = (Class2_Sub2_Sub9_Sub1) arg2;
		@Pc(34) Class2_Sub2_Sub9_Sub1 local34;
		if (local24 != null && local24.method5942(local21, local21)) {
			local34 = local24;
			local24.method5944();
		} else {
			local34 = new Class2_Sub2_Sub9_Sub1(this.aClass26_Sub1_35, local21, local21);
		}
		local34.method5939(0, local21, local21, 0);
		this.method5487(arg1, arg0, local34);
		return local34;
	}
}
