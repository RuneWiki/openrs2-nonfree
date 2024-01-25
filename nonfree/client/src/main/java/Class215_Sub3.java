import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class215_Sub3 extends Class215 {

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	private int anInt9068;

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
	private int anInt9079;

	@OriginalMember(owner = "client!uw", name = "V", descriptor = "I")
	private int anInt9092;

	@OriginalMember(owner = "client!uw", name = "W", descriptor = "I")
	private int anInt9093;

	@OriginalMember(owner = "client!uw", name = "X", descriptor = "Lclient!tq;")
	public Class287 aClass287_20;

	@OriginalMember(owner = "client!uw", name = "Z", descriptor = "[Lclient!ws;")
	private Class12_Sub51[] aClass12_Sub51Array1;

	@OriginalMember(owner = "client!uw", name = "cb", descriptor = "Lclient!lu;")
	private Interface10 anInterface10_12;

	@OriginalMember(owner = "client!uw", name = "db", descriptor = "Lclient!tq;")
	private Class287 aClass287_21;

	@OriginalMember(owner = "client!uw", name = "Q", descriptor = "Lclient!dm;")
	private final Class73 aClass73_72 = new Class73();

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray83;

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
	private final int anInt9073;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "Lclient!wr;")
	public final Class42_Sub1 aClass42_Sub1_18;

	@OriginalMember(owner = "client!uw", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!uw", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!uw", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!uw", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
	private final int anInt9069;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "[[B")
	private final byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!uw", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "[[S")
	public final short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!uw", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
	public final int anInt9071;

	@OriginalMember(owner = "client!uw", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!uw", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "[[[Lclient!ws;")
	private Class12_Sub51[][][] aClass12_Sub51ArrayArrayArray1;

	@OriginalMember(owner = "client!uw", name = "eb", descriptor = "Lclient!dea;")
	private Class68 aClass68_75;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "Lclient!tv;")
	private Class290 aClass290_2;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!wr;IIII[[I[[II)V")
	public Class215_Sub3(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray83 = arg5;
		this.anInt9073 = super.anInt9453 - 2;
		this.aClass42_Sub1_18 = arg0;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt9452 + 1][super.anInt9450 + 1];
		this.aFloatArrayArray12 = new float[super.anInt9452 + 1][super.anInt9450 + 1];
		this.anInt9069 = 0x1 << this.anInt9073;
		this.aByteArrayArray30 = new byte[arg3][arg4];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aShortArrayArray12 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.anInt9071 = arg2;
		this.aFloatArrayArray10 = new float[super.anInt9452 + 1][super.anInt9450 + 1];
		this.aByteArrayArray31 = new byte[arg3 + 1][arg4 + 1];
		this.aClass12_Sub51ArrayArrayArray1 = new Class12_Sub51[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt9450 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt9452 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray11[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray12[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray10[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass68_75 = new Class68(128);
		if ((this.anInt9071 & 0x10) != 0) {
			this.aClass290_2 = new Class290(this.aClass42_Sub1_18, this);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.IA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)V")
	@Override
	public void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uw", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class12_Sub4_Sub10 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub4_Sub10 arg2) {
		if ((this.aByteArrayArray30[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9451 >> this.aClass42_Sub1_18.anInt7103;
		@Pc(27) Class12_Sub4_Sub10_Sub1 local27 = (Class12_Sub4_Sub10_Sub1) arg2;
		@Pc(37) Class12_Sub4_Sub10_Sub1 local37;
		if (local27 != null && local27.method3813(local24, local24)) {
			local37 = local27;
			local27.method3807();
		} else {
			local37 = new Class12_Sub4_Sub10_Sub1(this.aClass42_Sub1_18, local24, local24);
		}
		local37.method3809(0, local24, 0, local24);
		this.method7481(arg0, local37, arg1);
		return local37;
	}

	@OriginalMember(owner = "client!uw", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9452][super.anInt9450][];
		}
		if (arg3 != null && this.anIntArrayArrayArray20 == null) {
			this.anIntArrayArrayArray20 = new int[super.anInt9452][super.anInt9450][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray19[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray20 != null) {
			this.anIntArrayArrayArray20[arg0][arg1] = arg3;
		}
		@Pc(88) Class12_Sub51[] local88 = this.aClass12_Sub51ArrayArrayArray1[arg0][arg1] = new Class12_Sub51[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14);
			@Pc(125) Class12 local125;
			for (local125 = this.aClass68_75.method1917(local119); local125 != null; local125 = this.aClass68_75.method1918()) {
				@Pc(130) Class12_Sub51 local130 = (Class12_Sub51) local125;
				if (local130.anInt9636 == arg8[local90] && (float) arg9[local90] == local130.aFloat198 && local130.anInt9623 == arg10 && arg11 == local130.anInt9631 && arg12 == local130.anInt9624) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class12_Sub51(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass68_75.method1916(local88[local90], local119);
			} else {
				local88[local90] = (Class12_Sub51) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray30[arg0][arg1] = (byte) (this.aByteArrayArray30[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9092) {
			this.anInt9092 = arg6.length;
		}
		this.anInt9093 += arg6.length;
	}

	@OriginalMember(owner = "client!uw", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray31[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray31[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!uw", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass290_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass42_Sub1_18.anInt7100 * arg2 >> 8) >> this.aClass42_Sub1_18.anInt7103;
			@Pc(39) int local39 = arg3 - (this.aClass42_Sub1_18.anInt7117 * arg2 >> 8) >> this.aClass42_Sub1_18.anInt7103;
			this.aClass290_2.method7200(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method7839(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass290_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass42_Sub1_18.anInt7100 >> 8) >> this.aClass42_Sub1_18.anInt7103;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass42_Sub1_18.anInt7117 >> 8) >> this.aClass42_Sub1_18.anInt7103;
			return this.aClass290_2.method7203(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7836(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9093 <= 0) {
			return;
		}
		@Pc(19) Interface18 local19 = this.aClass42_Sub1_18.method5901(this.anInt9068);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7895();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass42_Sub1_18.method5871(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = super.anInt9452 * local48 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray12[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local25 < local90) {
											local25 = local90;
										}
										local21++;
										local44.a(local90);
										if (local23 > local90) {
											local23 = local90;
										}
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt9452 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray12[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 > local25) {
											local25 = local90;
										}
										local21++;
										local44.d(local90);
										if (local23 > local90) {
											local23 = local90;
										}
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method7899()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass42_Sub1_18.method5970();
		this.aClass42_Sub1_18.method5928(false);
		this.aClass42_Sub1_18.method5886(false);
		this.aClass42_Sub1_18.method5927(false);
		this.aClass42_Sub1_18.method5885(false);
		this.aClass42_Sub1_18.method5955(0);
		this.aClass42_Sub1_18.method5997(-2, false, false);
		this.aClass42_Sub1_18.method5868(null);
		@Pc(275) Class91_Sub2 local275 = this.aClass42_Sub1_18.method5994();
		@Pc(280) float[] local280 = this.aClass42_Sub1_18.method5961();
		local280[5] = (float) 1024 / ((float) this.aClass42_Sub1_18.anInt7054 * 128.0F * (float) super.anInt9451);
		local280[10] = 0.0F;
		local280[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass42_Sub1_18.anInt7027;
		local280[14] = 0.0F;
		local280[3] = 0.0F;
		local280[0] = (float) 1024 / ((float) this.aClass42_Sub1_18.anInt7027 * (float) super.anInt9451 * 128.0F);
		local280[4] = 0.0F;
		local280[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass42_Sub1_18.anInt7054;
		local280[8] = 0.0F;
		local280[1] = 0.0F;
		local280[11] = 0.0F;
		local280[15] = 1.0F;
		local280[9] = 0.0F;
		local280[7] = 0.0F;
		local280[6] = 0.0F;
		local280[2] = 0.0F;
		local275.method5497(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
		this.aClass42_Sub1_18.method5998();
		this.aClass42_Sub1_18.method5899();
		if ((this.anInt9071 & 0x7) == 0) {
			this.aClass42_Sub1_18.method5886(false);
		} else {
			this.aClass42_Sub1_18.method5886(true);
			this.aClass42_Sub1_18.method5874();
		}
		this.aClass42_Sub1_18.method5985(false);
		this.aClass42_Sub1_18.method5999(this.aClass287_21);
		this.aClass42_Sub1_18.method5877(this.anInterface10_12, 0);
		this.aClass42_Sub1_18.method5986(local25 + 1 - local23, local19, local23, local21 / 3, 0, Static480.aClass147_8);
		this.aClass42_Sub1_18.method5985(true);
	}

	@OriginalMember(owner = "client!uw", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray83[arg0][arg1];
	}

	@OriginalMember(owner = "client!uw", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9453;
		@Pc(13) int local13 = arg1 >> super.anInt9453;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9452 - 1 || super.anInt9450 - 1 < local13) {
			return 0;
		}
		@Pc(46) int local46 = arg0 & super.anInt9451 - 1;
		@Pc(53) int local53 = super.anInt9451 - 1 & arg1;
		@Pc(80) int local80 = local46 * this.anIntArrayArray83[local8 + 1][local13] + this.anIntArrayArray83[local8][local13] * (super.anInt9451 - local46) >> super.anInt9453;
		@Pc(112) int local112 = this.anIntArrayArray83[local8][local13 + 1] * (super.anInt9451 - local46) + local46 * this.anIntArrayArray83[local8 + 1][local13 + 1] >> super.anInt9453;
		return (super.anInt9451 - local53) * local80 + local53 * local112 >> super.anInt9453;
	}

	@OriginalMember(owner = "client!uw", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass290_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass42_Sub1_18.anInt7100 * arg2 >> 8) >> this.aClass42_Sub1_18.anInt7103;
			@Pc(39) int local39 = arg3 - (this.aClass42_Sub1_18.anInt7117 * arg2 >> 8) >> this.aClass42_Sub1_18.anInt7103;
			this.aClass290_2.method7202(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!rh;[I)V")
	@Override
	public void method7834(@OriginalArg(0) Class12_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass73_72.method2012(new Class12_Sub21(this.aClass42_Sub1_18, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!uw", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt9093 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9452 + 1][super.anInt9450 + 1];
			for (@Pc(20) int local20 = 1; super.anInt9452 > local20; local20++) {
				for (@Pc(24) int local24 = 1; super.anInt9450 > local24; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray31[local20][local24] >> 1) + (this.aByteArrayArray31[local20 + 1][local24] >> 3) + (this.aByteArrayArray31[local20 + -1][local24] >> 2) + (this.aByteArrayArray31[local20][local24 + -1] >> 2) + (this.aByteArrayArray31[local20][local24 + 1] >> 3));
				}
			}
			@Pc(104) Class12_Sub51[] local104 = new Class12_Sub51[this.aClass68_75.method1925()];
			this.aClass68_75.method1921(local104);
			for (@Pc(112) int local112 = 0; local112 < local104.length; local112++) {
				local104[local112].method7983(this.anInt9093);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray16 != null) {
				local132 += 4;
			}
			if ((this.anInt9071 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass42_Sub1_18.aNativeHeap5.a(local132 * this.anInt9093, false);
			@Pc(160) Stream local160 = new Stream(local155);
			@Pc(164) Class12_Sub51[] local164 = new Class12_Sub51[this.anInt9093];
			@Pc(171) int local171 = Static472.method7121(this.anInt9093 / 4);
			if (local171 < 1) {
				local171 = 1;
			}
			@Pc(181) Class68 local181 = new Class68(local171);
			@Pc(185) Class12_Sub51[] local185 = new Class12_Sub51[this.anInt9092];
			@Pc(191) int local191;
			for (@Pc(187) int local187 = 0; local187 < super.anInt9452; local187++) {
				for (local191 = 0; local191 < super.anInt9450; local191++) {
					if (this.anIntArrayArrayArray15[local187][local191] != null) {
						@Pc(207) Class12_Sub51[] local207 = this.aClass12_Sub51ArrayArrayArray1[local187][local191];
						@Pc(214) int[] local214 = this.anIntArrayArrayArray17[local187][local191];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray18[local187][local191];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray19[local187][local191];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray15[local187][local191];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray20 == null ? null : this.anIntArrayArrayArray20[local187][local191];
						if (local228 == null) {
							local228 = local235;
						}
						@Pc(263) int[] local263 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local187][local191];
						@Pc(270) float local270 = this.aFloatArrayArray11[local187][local191];
						@Pc(277) float local277 = this.aFloatArrayArray12[local187][local191];
						@Pc(284) float local284 = this.aFloatArrayArray10[local187][local191];
						@Pc(293) float local293 = this.aFloatArrayArray11[local187][local191 + 1];
						@Pc(302) float local302 = this.aFloatArrayArray12[local187][local191 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray10[local187][local191 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray11[local187 + 1][local191 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray12[local187 + 1][local191 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray10[local187 + 1][local191 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray11[local187 + 1][local191];
						@Pc(362) float local362 = this.aFloatArrayArray12[local187 + 1][local191];
						@Pc(371) float local371 = this.aFloatArrayArray10[local187 + 1][local191];
						@Pc(379) int local379 = local18[local187][local191] & 0xFF;
						@Pc(389) int local389 = local18[local187][local191 + 1] & 0xFF;
						@Pc(401) int local401 = local18[local187 + 1][local191 + 1] & 0xFF;
						@Pc(411) int local411 = local18[local187 + 1][local191] & 0xFF;
						@Pc(413) int local413 = 0;
						@Pc(423) int local423;
						label357: for (@Pc(415) int local415 = 0; local415 < local235.length; local415++) {
							@Pc(421) Class12_Sub51 local421 = local207[local415];
							for (local423 = 0; local423 < local413; local423++) {
								if (local185[local423] == local421) {
									continue label357;
								}
							}
							local185[local413++] = local421;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray12[local187 + super.anInt9452 * local191] = new short[local235.length];
						for (local423 = 0; local423 < local235.length; local423++) {
							@Pc(474) int local474 = (local187 << super.anInt9453) + local214[local423];
							@Pc(483) int local483 = (local191 << super.anInt9453) + local221[local423];
							@Pc(488) int local488 = local474 >> this.anInt9073;
							@Pc(493) int local493 = local483 >> this.anInt9073;
							@Pc(497) int local497 = local235[local423];
							@Pc(501) int local501 = local228[local423];
							@Pc(509) int local509 = local247 == null ? 0 : local247[local423];
							@Pc(527) long local527 = (long) local493 | (long) local501 << 48 | (long) local497 << 32 | (long) (local488 << 16);
							@Pc(531) int local531 = local214[local423];
							@Pc(535) int local535 = local221[local423];
							@Pc(537) byte local537 = 74;
							@Pc(539) int local539 = 0;
							@Pc(541) float local541 = 1.0F;
							@Pc(587) float local587;
							@Pc(583) float local583;
							@Pc(585) float local585;
							@Pc(646) float local646;
							@Pc(581) int local581;
							if (local531 == 0 && local535 == 0) {
								local587 = local270;
								local583 = local277;
								local581 = local537 - local379;
								local585 = local284;
							} else if (local531 == 0 && super.anInt9451 == local535) {
								local583 = local302;
								local581 = local537 - local389;
								local585 = local311;
								local587 = local293;
							} else if (local531 == super.anInt9451 && local535 == super.anInt9451) {
								local581 = local537 - local401;
								local583 = local333;
								local585 = local344;
								local587 = local322;
							} else if (super.anInt9451 == local531 && local535 == 0) {
								local587 = local353;
								local585 = local371;
								local581 = local537 - local411;
								local583 = local362;
							} else {
								@Pc(621) float local621 = (float) local531 / (float) super.anInt9451;
								@Pc(628) float local628 = (float) local535 / (float) super.anInt9451;
								@Pc(637) float local637 = local621 * (local353 - local270) + local270;
								local646 = local277 + local621 * (local362 - local277);
								@Pc(654) float local654 = local284 + local621 * (local371 - local284);
								@Pc(662) float local662 = (local322 - local293) * local621 + local293;
								@Pc(671) float local671 = local302 + local621 * (local333 - local302);
								@Pc(679) float local679 = local621 * (local344 - local311) + local311;
								local583 = local646 + local628 * (local671 - local646);
								local587 = local628 * (local662 - local637) + local637;
								local585 = local654 + local628 * (local679 - local654);
								@Pc(715) int local715 = (local531 * (local411 - local379) >> super.anInt9453) + local379;
								@Pc(727) int local727 = ((local401 - local389) * local531 >> super.anInt9453) + local389;
								local581 = local537 - local715 - (local535 * (local727 - local715) >> super.anInt9453);
							}
							if (local497 != -1) {
								@Pc(776) int local776 = local581 * (local497 & 0x7F) >> 7;
								if (local776 < 2) {
									local776 = 2;
								} else if (local776 > 126) {
									local776 = 126;
								}
								if ((this.anInt9071 & 0x7) == 0) {
									local541 = local583 * this.aClass42_Sub1_18.aFloatArray63[1] + this.aClass42_Sub1_18.aFloatArray63[0] * local587 + local585 * this.aClass42_Sub1_18.aFloatArray63[2];
									local541 = this.aClass42_Sub1_18.aFloat165 + (local541 > 0.0F ? this.aClass42_Sub1_18.aFloat167 : this.aClass42_Sub1_18.aFloat163) * local541;
								}
								local539 = Static141.anIntArray234[local776 | local497 & 0xFF80];
							}
							@Pc(849) Class12 local849 = null;
							if ((this.anInt9069 - 1 & local474) == 0 && (local483 & this.anInt9069 - 1) == 0) {
								local849 = local181.method1917(local527);
							}
							@Pc(885) int local885;
							@Pc(916) int local916;
							if (local849 == null) {
								if (local497 == local501) {
									local916 = local539;
								} else {
									@Pc(926) int local926 = local581 * (local501 & 0x7F) >> 7;
									if (local926 < 2) {
										local926 = 2;
									} else if (local926 > 126) {
										local926 = 126;
									}
									local916 = Static141.anIntArray234[local501 & 0xFF80 | local926];
									if ((this.anInt9071 & 0x7) == 0) {
										local646 = this.aClass42_Sub1_18.aFloatArray63[2] * local585 + local583 * this.aClass42_Sub1_18.aFloatArray63[1] + local587 * this.aClass42_Sub1_18.aFloatArray63[0];
										local646 = (local541 > 0.0F ? this.aClass42_Sub1_18.aFloat167 : this.aClass42_Sub1_18.aFloat163) * local541 + this.aClass42_Sub1_18.aFloat165;
										@Pc(1004) int local1004 = local916 >> 16 & 0xFF;
										@Pc(1010) int local1010 = local916 >> 8 & 0xFF;
										@Pc(1014) int local1014 = local916 & 0xFF;
										local1004 = (int) ((float) local1004 * local646);
										local1010 = (int) ((float) local1010 * local646);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local1014 = (int) ((float) local1014 * local646);
										if (local1014 < 0) {
											local1014 = 0;
										} else if (local1014 > 255) {
											local1014 = 255;
										}
										local916 = local1010 << 8 | local1004 << 16 | local1014;
									}
								}
								if (Stream.c()) {
									local160.a((float) local474);
									local160.a((float) (this.aa(local474, local483) + local509));
									local160.a((float) local483);
									local160.a((float) local474);
									local160.a((float) local483);
									if (this.anIntArrayArrayArray16 != null) {
										local160.a((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt9071 & 0x7) != 0) {
										local160.a(local587);
										local160.a(local583);
										local160.a(local585);
									}
								} else {
									local160.b((float) local474);
									local160.b((float) (this.aa(local474, local483) + local509));
									local160.b((float) local483);
									local160.b((float) local474);
									local160.b((float) local483);
									if (this.anIntArrayArrayArray16 != null) {
										local160.b((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt9071 & 0x7) != 0) {
										local160.b(local587);
										local160.b(local583);
										local160.b(local585);
									}
								}
								if (this.aClass42_Sub1_18.anInt7114 == 0) {
									local160.f(local916 | 0xFF000000);
								} else {
									local160.b(local916 | 0xFF000000);
								}
								local885 = this.anInt9079++;
								local460[local423] = (short) local885;
								if (local497 != -1) {
									local164[local885] = local207[local423];
								}
								local181.method1916(new Class12_Sub31(local460[local423]), local527);
							} else {
								local460[local423] = ((Class12_Sub31) local849).aShort68;
								local885 = local460[local423] & 0xFFFF;
								if (local497 != -1 && local164[local885].aLong248 > local207[local423].aLong248) {
									local164[local885] = local207[local423];
								}
							}
							for (local916 = 0; local916 < local413; local916++) {
								local185[local916].method7981(local539, local581, local885, local541);
							}
							this.anInt9068++;
						}
					}
				}
			}
			for (local191 = 0; local191 < this.anInt9079; local191++) {
				@Pc(1303) Class12_Sub51 local1303 = local164[local191];
				if (local1303 != null) {
					local1303.method7980(local191);
				}
			}
			@Pc(1320) int local1320;
			@Pc(1338) int local1338;
			for (@Pc(1316) int local1316 = 0; local1316 < super.anInt9452; local1316++) {
				for (local1320 = 0; local1320 < super.anInt9450; local1320++) {
					@Pc(1332) short[] local1332 = this.aShortArrayArray12[local1316 + local1320 * super.anInt9452];
					if (local1332 != null) {
						@Pc(1336) int local1336 = 0;
						local1338 = 0;
						while (local1338 < local1332.length) {
							@Pc(1347) int local1347 = local1332[local1338++] & 0xFFFF;
							@Pc(1354) int local1354 = local1332[local1338++] & 0xFFFF;
							@Pc(1361) int local1361 = local1332[local1338++] & 0xFFFF;
							@Pc(1365) Class12_Sub51 local1365 = local164[local1347];
							@Pc(1369) Class12_Sub51 local1369 = local164[local1354];
							@Pc(1373) Class12_Sub51 local1373 = local164[local1361];
							@Pc(1375) Class12_Sub51 local1375 = null;
							if (local1365 != null) {
								local1375 = local1365;
								local1365.method7979(local1336, local1320, local1316);
							}
							if (local1369 != null) {
								local1369.method7979(local1336, local1320, local1316);
								if (local1375 == null || local1375.aLong248 > local1369.aLong248) {
									local1375 = local1369;
								}
							}
							if (local1373 != null) {
								local1373.method7979(local1336, local1320, local1316);
								if (local1375 == null || local1373.aLong248 < local1375.aLong248) {
									local1375 = local1373;
								}
							}
							if (local1375 != null) {
								if (local1365 != null) {
									local1375.method7980(local1347);
								}
								if (local1369 != null) {
									local1375.method7980(local1354);
								}
								if (local1373 != null) {
									local1375.method7980(local1361);
								}
								local1375.method7979(local1336, local1320, local1316);
							}
							local1336++;
						}
					}
				}
			}
			local160.a();
			this.anInterface10_12 = this.aClass42_Sub1_18.method5930(false);
			this.anInterface10_12.method7896(local132, this.anInt9079 * local132, local155);
			if ((this.anInt9071 & 0x7) == 0) {
				if (this.anIntArrayArrayArray16 == null) {
					this.aClass287_21 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_3 }) });
					this.aClass287_20 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5 }), new Class75(Static427.aClass262_3) });
				} else {
					this.aClass287_21 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_4, Static427.aClass262_3 }) });
					this.aClass287_20 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_4 }), new Class75(Static427.aClass262_3) });
				}
			} else if (this.anIntArrayArrayArray16 == null) {
				this.aClass287_21 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_2, Static427.aClass262_3 }) });
				this.aClass287_20 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_2 }), new Class75(Static427.aClass262_3) });
			} else {
				this.aClass287_21 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_4, Static427.aClass262_2, Static427.aClass262_3 }) });
				this.aClass287_20 = this.aClass42_Sub1_18.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_5, Static427.aClass262_4, Static427.aClass262_2 }), new Class75(Static427.aClass262_3) });
			}
			local1320 = 0;
			for (@Pc(1783) int local1783 = 0; local1783 < local104.length; local1783++) {
				if (local104[local1783].anInt9633 > 0) {
					local104[local1320++] = local104[local1783];
				}
			}
			this.aClass12_Sub51Array1 = new Class12_Sub51[local1320];
			@Pc(1816) long[] local1816 = new long[local1320];
			for (local1338 = 0; local1338 < local1320; local1338++) {
				@Pc(1824) Class12_Sub51 local1824 = local104[local1338];
				local1816[local1338] = local1824.aLong248;
				this.aClass12_Sub51Array1[local1338] = local1824;
				local1824.method7982(this.anInt9079);
			}
			Static308.method4985(this.aClass12_Sub51Array1, local1816);
			if (this.aClass290_2 != null) {
				this.aClass290_2.method7205();
			}
		} else {
			this.aClass290_2 = null;
		}
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray18 = null;
		this.aByteArrayArray31 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray12 = this.aFloatArrayArray10 = null;
		this.aClass12_Sub51ArrayArrayArray1 = null;
		this.anIntArrayArrayArray15 = null;
		this.aClass68_75 = null;
		this.anIntArrayArrayArray19 = null;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIBI[[ZZI)V")
	private void method7480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean[][] arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4) {
		if (this.aClass12_Sub51Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg0 + arg0 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > Static385.anIntArray653.length) {
			Static385.anIntArray653 = new int[local18];
		}
		@Pc(29) int local29 = arg4 - arg0;
		@Pc(31) int local31 = local29;
		if (local29 < 0) {
			local29 = 0;
		}
		@Pc(39) int local39 = arg1 - arg0;
		@Pc(41) int local41 = local39;
		if (local39 < 0) {
			local39 = 0;
		}
		@Pc(52) int local52 = arg0 + arg4;
		if (local52 > super.anInt9452 - 1) {
			local52 = super.anInt9452 - 1;
		}
		@Pc(71) int local71 = arg0 + arg1;
		Static222.anInt4797 = 0;
		if (local71 > super.anInt9450 - 1) {
			local71 = super.anInt9450 - 1;
		}
		for (@Pc(90) int local90 = local29; local90 <= local52; local90++) {
			@Pc(99) boolean[] local99 = arg2[local90 - local31];
			for (@Pc(101) int local101 = local39; local101 <= local71; local101++) {
				if (local99[local101 - local41]) {
					Static385.anIntArray653[Static222.anInt4797++] = local101 * super.anInt9452 + local90;
				}
			}
		}
		this.aClass42_Sub1_18.method5889();
		this.aClass42_Sub1_18.method5990();
		this.aClass42_Sub1_18.method5886((this.anInt9071 & 0x7) != 0);
		this.aClass42_Sub1_18.method5997(-1, false, false);
		this.aClass42_Sub1_18.method5877(this.anInterface10_12, 0);
		for (@Pc(192) int local192 = 0; local192 < this.aClass12_Sub51Array1.length; local192++) {
			this.aClass12_Sub51Array1[local192].method7974(Static222.anInt4797, Static385.anIntArray653);
		}
		@Pc(213) Class91_Sub2 local213 = this.aClass42_Sub1_18.method5994();
		local213.oa(0, -1, 0);
		this.aClass42_Sub1_18.method5899();
		if (!this.aClass73_72.method2015()) {
			@Pc(231) int local231 = this.aClass42_Sub1_18.anInt7132;
			@Pc(235) int local235 = this.aClass42_Sub1_18.anInt7104;
			this.aClass42_Sub1_18.E(0, local235, this.aClass42_Sub1_18.anInt7120);
			this.aClass42_Sub1_18.method5886(false);
			this.aClass42_Sub1_18.method5885(false);
			this.aClass42_Sub1_18.method5955(128);
			this.aClass42_Sub1_18.method5997(-2, false, false);
			this.aClass42_Sub1_18.method5868(this.aClass42_Sub1_18.anInterface3_3);
			this.aClass42_Sub1_18.method5945(Static191.aClass129_3, Static506.aClass129_5);
			this.aClass42_Sub1_18.method5951(Static371.aClass302_2, 0);
			this.aClass42_Sub1_18.method5967(0, Static388.aClass302_3);
			for (@Pc(295) Class12 local295 = this.aClass73_72.method2005(); local295 != null; local295 = this.aClass73_72.method2009()) {
				@Pc(300) Class12_Sub21 local300 = (Class12_Sub21) local295;
				local300.method3702(arg1, arg2, arg4, arg0);
			}
			this.aClass42_Sub1_18.method5951(Static159.aClass302_1, 0);
			this.aClass42_Sub1_18.method5967(0, Static159.aClass302_1);
			this.aClass42_Sub1_18.method5868(null);
			this.aClass42_Sub1_18.E(local231, local235, this.aClass42_Sub1_18.anInt7120);
		}
		if (this.aClass290_2 != null) {
			this.aClass42_Sub1_18.method5877(this.anInterface10_12, 0);
			this.aClass42_Sub1_18.method5999(this.aClass287_21);
			this.aClass290_2.method7207(arg1, arg2, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method7480(arg2, arg1, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!iba;BI)V")
	private void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub4_Sub10_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray17[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray18[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (Static33.anIntArray313.length < local22) {
			Static33.anIntArray313 = new int[local22];
			Static295.anIntArray399 = new int[local22];
		}
		for (@Pc(45) int local45 = 0; local45 < local22; local45++) {
			Static33.anIntArray313[local45] = local12[local45] >> this.aClass42_Sub1_18.anInt7103;
			Static295.anIntArray399[local45] = local19[local45] >> this.aClass42_Sub1_18.anInt7103;
		}
		@Pc(73) int local73 = 0;
		while (local73 < local22) {
			@Pc(79) int local79 = Static33.anIntArray313[local73];
			@Pc(84) int local84 = Static295.anIntArray399[local73++];
			@Pc(88) int local88 = Static33.anIntArray313[local73];
			@Pc(93) int local93 = Static295.anIntArray399[local73++];
			@Pc(97) int local97 = Static33.anIntArray313[local73];
			@Pc(102) int local102 = Static295.anIntArray399[local73++];
			if ((local79 - local88) * (local93 - local102) - (local93 - local84) * (local97 - local88) > 0) {
				arg1.method3808(local93, local79, local84, local88, local97, local102);
			}
		}
	}
}
