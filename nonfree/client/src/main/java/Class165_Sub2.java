import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class165_Sub2 extends Class165 {

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
	private int anInt4501;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
	private int anInt4504;

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "Lclient!lm;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "Lclient!ft;")
	public Class87 aClass87_4;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "Lclient!ft;")
	public Class87 aClass87_5;

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lclient!ft;")
	private Class87 aClass87_6;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!ft;")
	public Class87 aClass87_7;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
	private int anInt4513;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "[Lclient!ic;")
	private Class7_Sub22[] aClass7_Sub22Array1;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
	private int anInt4514;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Lclient!fr;")
	private final Class85 aClass85_29 = new Class85();

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	private final int anInt4512 = this.anInt4488 - 2;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "Lclient!vd;")
	public final Class51_Sub2 aClass51_Sub2_29;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "[[I")
	private final int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	public final int anInt4498;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "[[[Lclient!ic;")
	private Class7_Sub22[][][] aClass7_Sub22ArrayArrayArray1;

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
	private final int anInt4499;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "Lclient!mt;")
	private Class164 aClass164_26;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!cn;")
	private Class42 aClass42_2;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!vd;IIII[[I[[II)V")
	public Class165_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass51_Sub2_29 = arg0;
		this.anIntArrayArray38 = arg5;
		this.aFloatArrayArray8 = new float[super.anInt4489 + 1][super.anInt4490 + 1];
		this.anInt4498 = arg2;
		this.aFloatArrayArray6 = new float[super.anInt4489 + 1][super.anInt4490 + 1];
		this.aClass7_Sub22ArrayArrayArray1 = new Class7_Sub22[arg3][arg4][];
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anInt4499 = 0x1 << this.anInt4512;
		this.aShortArrayArray2 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt4489 + 1][super.anInt4490 + 1];
		for (@Pc(117) int local117 = 1; super.anInt4490 > local117; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt4489; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + local140 * local140 + arg7 * 4 * arg7)));
				this.aFloatArrayArray8[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray7[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray6[local121][local117] = local176 * (float) local157;
			}
		}
		this.aClass164_26 = new Class164(128);
		if ((this.anInt4498 & 0x10) != 0) {
			this.aClass42_2 = new Class42(this.aClass51_Sub2_29, this);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass42_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass51_Sub2_29.anInt6921 >> 8) >> this.aClass51_Sub2_29.anInt6909;
			@Pc(38) int local38 = arg3 - (this.aClass51_Sub2_29.anInt6940 * arg2 >> 8) >> this.aClass51_Sub2_29.anInt6909;
			this.aClass42_2.method755(local23, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method3580(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass42_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass51_Sub2_29.anInt6921 >> 8) >> this.aClass51_Sub2_29.anInt6909;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass51_Sub2_29.anInt6940 >> 8) >> this.aClass51_Sub2_29.anInt6909;
			return this.aClass42_2.method747(local39, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	@Override
	public void method3581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!wr;[I)V")
	@Override
	public void method3577(@OriginalArg(0) Class7_Sub30 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass85_29.method2011(new Class7_Sub6(this.aClass51_Sub2_29, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt4488;
		@Pc(13) int local13 = arg1 >> super.anInt4488;
		if (local8 < 0 || local13 < 0 || super.anInt4489 - 1 < local8 || local13 > super.anInt4490 - 1) {
			return 0;
		}
		@Pc(52) int local52 = arg0 & super.anInt4485 - 1;
		@Pc(59) int local59 = super.anInt4485 - 1 & arg1;
		@Pc(86) int local86 = this.anIntArrayArray38[local8][local13] * (super.anInt4485 - local52) + local52 * this.anIntArrayArray38[local8 + 1][local13] >> super.anInt4488;
		@Pc(116) int local116 = this.anIntArrayArray38[local8 + 1][local13 + 1] * local52 + this.anIntArrayArray38[local8][local13 + 1] * (super.anInt4485 - local52) >> super.anInt4488;
		return local86 * (super.anInt4485 - local59) + local116 * local59 >> super.anInt4488;
	}

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class7_Sub4_Sub2 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub4_Sub2 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt4485 >> this.aClass51_Sub2_29.anInt6909;
		@Pc(24) Class7_Sub4_Sub2_Sub1 local24 = (Class7_Sub4_Sub2_Sub1) arg2;
		@Pc(40) Class7_Sub4_Sub2_Sub1 local40;
		if (local24 != null && local24.method1374(local21, local21)) {
			local40 = local24;
			local24.method1373();
		} else {
			local40 = new Class7_Sub4_Sub2_Sub1(this.aClass51_Sub2_29, local21, local21);
		}
		local40.method1377(0, local21, 0, local21);
		this.method3584(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!ds;I)V")
	private void method3584(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub4_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass51_Sub2_29.anIntArray594.length) {
			this.aClass51_Sub2_29.anIntArray592 = new int[local22];
			this.aClass51_Sub2_29.anIntArray594 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass51_Sub2_29.anIntArray594;
		@Pc(50) int[] local50 = this.aClass51_Sub2_29.anIntArray592;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = (local12[local52] & 0xFF) >> this.aClass51_Sub2_29.anInt6909;
			local50[local52] = (local19[local52] & 0xFF) >> this.aClass51_Sub2_29.anInt6909;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local46[local84];
			@Pc(95) int local95 = local50[local84++];
			@Pc(99) int local99 = local46[local84];
			@Pc(104) int local104 = local50[local84++];
			@Pc(108) int local108 = local46[local84];
			@Pc(113) int local113 = local50[local84++];
			if (-((local108 - local99) * (local104 - local95)) + (local104 - local113) * (local90 - local99) > 0) {
				arg1.method1376(local113, local104, local99, local90, local95, local108);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt4489][super.anInt4490][];
		}
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt4489][super.anInt4490][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(88) Class7_Sub22[] local88 = this.aClass7_Sub22ArrayArrayArray1[arg0][arg1] = new Class7_Sub22[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(125) Class7 local125;
			for (local125 = this.aClass164_26.method3512(local119); local125 != null; local125 = this.aClass164_26.method3510()) {
				@Pc(130) Class7_Sub22 local130 = (Class7_Sub22) local125;
				if (arg8[local90] == local130.anInt3047 && (float) arg9[local90] == local130.aFloat87 && local130.anInt3045 == arg10 && arg11 == local130.anInt3046 && local130.anInt3044 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class7_Sub22(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass164_26.method3508(local119, local88[local90]);
			} else {
				local88[local90] = (Class7_Sub22) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4513) {
			this.anInt4513 = arg6.length;
		}
		this.anInt4514 += arg6.length;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3585(arg1, arg0, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class7_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass42_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass51_Sub2_29.anInt6921 * arg2 >> 8) >> this.aClass51_Sub2_29.anInt6909;
			@Pc(38) int local38 = arg3 - (this.aClass51_Sub2_29.anInt6940 * arg2 >> 8) >> this.aClass51_Sub2_29.anInt6909;
			this.aClass42_2.method751(arg0, local23, local38);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray38[arg0][arg1];
	}

	@OriginalMember(owner = "client!ne", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		if (this.anInt4514 <= 0) {
			this.aClass42_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt4489 + 1][super.anInt4490 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; super.anInt4489 > local25; local25++) {
				for (local29 = 1; local29 < super.anInt4490; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray20[local25][local29] >> 1) + (this.aByteArrayArray20[local25][local29 + 1] >> 3) + (this.aByteArrayArray20[local25 + -1][local29] >> 2) + (this.aByteArrayArray20[local25 + 1][local29] >> 3) + (this.aByteArrayArray20[local25][local29 + -1] >> 2));
				}
			}
			this.aClass7_Sub22Array1 = new Class7_Sub22[this.aClass164_26.method3515()];
			this.aClass164_26.method3513(this.aClass7_Sub22Array1);
			for (local29 = 0; local29 < this.aClass7_Sub22Array1.length; local29++) {
				this.aClass7_Sub22Array1[local29].method2461(this.anInt4514);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray10 != null) {
				local137 += 4;
			}
			if ((this.anInt4498 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(156) NativeBuffer local156 = this.aClass51_Sub2_29.aNativeHeap2.a(this.anInt4514 * local137);
			@Pc(161) NativeStream local161 = new NativeStream(local156);
			@Pc(165) Class7_Sub22[] local165 = new Class7_Sub22[this.anInt4514];
			@Pc(172) int local172 = Static154.method2310(this.anInt4514 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(182) Class164 local182 = new Class164(local172);
			@Pc(186) Class7_Sub22[] local186 = new Class7_Sub22[this.anInt4513];
			@Pc(192) int local192;
			for (@Pc(188) int local188 = 0; super.anInt4489 > local188; local188++) {
				for (local192 = 0; local192 < super.anInt4490; local192++) {
					if (this.anIntArrayArrayArray8[local188][local192] != null) {
						@Pc(208) Class7_Sub22[] local208 = this.aClass7_Sub22ArrayArrayArray1[local188][local192];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray6[local188][local192];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray7[local188][local192];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray11[local188][local192];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray8[local188][local192];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local188][local192];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local188][local192];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray8[local188][local192];
						@Pc(278) float local278 = this.aFloatArrayArray7[local188][local192];
						@Pc(285) float local285 = this.aFloatArrayArray6[local188][local192];
						@Pc(294) float local294 = this.aFloatArrayArray8[local188][local192 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray7[local188][local192 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray6[local188][local192 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray8[local188 + 1][local192 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray7[local188 + 1][local192 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray6[local188 + 1][local192 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray8[local188 + 1][local192];
						@Pc(363) float local363 = this.aFloatArrayArray7[local188 + 1][local192];
						@Pc(372) float local372 = this.aFloatArrayArray6[local188 + 1][local192];
						@Pc(380) int local380 = local23[local188][local192] & 0xFF;
						@Pc(390) int local390 = local23[local188][local192 + 1] & 0xFF;
						@Pc(402) int local402 = local23[local188 + 1][local192 + 1] & 0xFF;
						@Pc(412) int local412 = local23[local188 + 1][local192] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(424) int local424;
						label335: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(422) Class7_Sub22 local422 = local208[local416];
							for (local424 = 0; local424 < local414; local424++) {
								if (local186[local424] == local422) {
									continue label335;
								}
							}
							local186[local414++] = local422;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray2[local188 + local192 * super.anInt4489] = new short[local236.length];
						for (local424 = 0; local424 < local236.length; local424++) {
							@Pc(478) int local478 = (local188 << super.anInt4488) + local215[local424];
							@Pc(487) int local487 = (local192 << super.anInt4488) + local222[local424];
							@Pc(492) int local492 = local478 >> this.anInt4512;
							@Pc(497) int local497 = local487 >> this.anInt4512;
							@Pc(501) int local501 = local236[local424];
							@Pc(505) int local505 = local229[local424];
							@Pc(513) int local513 = local248 == null ? 0 : local248[local424];
							@Pc(531) long local531 = (long) local497 | (long) local501 << 32 | (long) local505 << 48 | (long) (local492 << 16);
							@Pc(535) int local535 = local215[local424];
							@Pc(539) int local539 = local222[local424];
							@Pc(541) byte local541 = 74;
							@Pc(543) int local543 = 0;
							@Pc(556) float local556;
							@Pc(554) float local554;
							@Pc(552) float local552;
							@Pc(624) float local624;
							@Pc(560) int local560;
							if (local535 == 0 && local539 == 0) {
								local552 = local285;
								local554 = local278;
								local556 = local271;
								local560 = local541 - local380;
							} else if (local535 == 0 && super.anInt4485 == local539) {
								local554 = local303;
								local560 = local541 - local390;
								local552 = local312;
								local556 = local294;
							} else if (super.anInt4485 == local535 && super.anInt4485 == local539) {
								local560 = local541 - local402;
								local552 = local345;
								local556 = local323;
								local554 = local334;
							} else if (super.anInt4485 == local535 && local539 == 0) {
								local554 = local363;
								local556 = local354;
								local552 = local372;
								local560 = local541 - local412;
							} else {
								@Pc(600) float local600 = (float) local535 / (float) super.anInt4485;
								@Pc(607) float local607 = (float) local539 / (float) super.anInt4485;
								@Pc(615) float local615 = local271 + local600 * (local354 - local271);
								local624 = local600 * (local363 - local278) + local278;
								@Pc(633) float local633 = local285 + local600 * (local372 - local285);
								@Pc(641) float local641 = local600 * (local323 - local294) + local294;
								@Pc(650) float local650 = local303 + (local334 - local303) * local600;
								@Pc(659) float local659 = local600 * (local345 - local312) + local312;
								local554 = local624 + (local650 - local624) * local607;
								local556 = local615 + (local641 - local615) * local607;
								local552 = local607 * (local659 - local633) + local633;
								@Pc(697) int local697 = ((local412 - local380) * local535 >> super.anInt4488) + local380;
								@Pc(709) int local709 = ((local402 - local390) * local535 >> super.anInt4488) + local390;
								local560 = local541 - local697 - (local539 * (local709 - local697) >> super.anInt4488);
							}
							@Pc(762) float local762 = 1.0F;
							if (local501 != -1) {
								@Pc(774) int local774 = (local501 & 0x7F) * local560 >> 7;
								if (local774 < 2) {
									local774 = 2;
								} else if (local774 > 126) {
									local774 = 126;
								}
								local543 = Static165.anIntArray263[local774 | local501 & 0xFF80];
								if ((this.anInt4498 & 0x7) == 0) {
									local762 = local552 * this.aClass51_Sub2_29.aFloatArray30[2] + this.aClass51_Sub2_29.aFloatArray30[0] * local556 + local554 * this.aClass51_Sub2_29.aFloatArray30[1];
									local762 = this.aClass51_Sub2_29.aFloat199 + (local762 > 0.0F ? this.aClass51_Sub2_29.aFloat207 : this.aClass51_Sub2_29.aFloat208) * local762;
								}
							}
							@Pc(843) Class7 local843 = null;
							if ((this.anInt4499 - 1 & local478) == 0 && (this.anInt4499 - 1 & local487) == 0) {
								local843 = local182.method3512(local531);
							}
							@Pc(876) int local876;
							@Pc(937) int local937;
							if (local843 == null) {
								if (local505 == local501) {
									local937 = local543;
								} else {
									@Pc(913) int local913 = (local505 & 0x7F) * local560 >> 7;
									if (local913 < 2) {
										local913 = 2;
									} else if (local913 > 126) {
										local913 = 126;
									}
									local937 = Static165.anIntArray263[local505 & 0xFF80 | local913];
									if ((this.anInt4498 & 0x7) == 0) {
										local624 = this.aClass51_Sub2_29.aFloatArray30[2] * local552 + this.aClass51_Sub2_29.aFloatArray30[0] * local556 + local554 * this.aClass51_Sub2_29.aFloatArray30[1];
										local624 = (local762 > 0.0F ? this.aClass51_Sub2_29.aFloat207 : this.aClass51_Sub2_29.aFloat208) * local762 + this.aClass51_Sub2_29.aFloat199;
										@Pc(993) int local993 = local937 >> 16 & 0xFF;
										@Pc(999) int local999 = local937 >> 8 & 0xFF;
										@Pc(1003) int local1003 = local937 & 0xFF;
										local993 = (int) ((float) local993 * local624);
										local999 = (int) ((float) local999 * local624);
										if (local993 < 0) {
											local993 = 0;
										} else if (local993 > 255) {
											local993 = 255;
										}
										if (local999 < 0) {
											local999 = 0;
										} else if (local999 > 255) {
											local999 = 255;
										}
										local1003 = (int) ((float) local1003 * local624);
										if (local1003 < 0) {
											local1003 = 0;
										} else if (local1003 > 255) {
											local1003 = 255;
										}
										local937 = local1003 | local993 << 16 | local999 << 8;
									}
								}
								if (this.aClass51_Sub2_29.aBoolean461) {
									local161.a((float) local478);
									local161.a((float) (local513 + this.a(local478, local487)));
									local161.a((float) local487);
									local161.a((byte) (local937 >> 16));
									local161.a((byte) (local937 >> 8));
									local161.a((byte) local937);
									local161.a(-1);
									local161.a((float) local478);
									local161.a((float) local487);
									if (this.anIntArrayArrayArray10 != null) {
										local161.a((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt4498 & 0x7) != 0) {
										local161.a(local556);
										local161.a(local554);
										local161.a(local552);
									}
								} else {
									local161.b((float) local478);
									local161.b((float) (local513 + this.a(local478, local487)));
									local161.b((float) local487);
									local161.a((byte) (local937 >> 16));
									local161.a((byte) (local937 >> 8));
									local161.a((byte) local937);
									local161.a(-1);
									local161.b((float) local478);
									local161.b((float) local487);
									if (this.anIntArrayArrayArray10 != null) {
										local161.b((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt4498 & 0x7) != 0) {
										local161.b(local556);
										local161.b(local554);
										local161.b(local552);
									}
								}
								local876 = this.anInt4501++;
								local465[local424] = (short) local876;
								if (local501 != -1) {
									local165[local876] = local208[local424];
								}
								local182.method3508(local531, new Class7_Sub19(local465[local424]));
							} else {
								local465[local424] = ((Class7_Sub19) local843).aShort32;
								local876 = local465[local424] & 0xFFFF;
								if (local501 != -1 && local165[local876].aLong230 > local208[local424].aLong230) {
									local165[local876] = local208[local424];
								}
							}
							for (local937 = 0; local937 < local414; local937++) {
								local186[local937].method2462(local543, local560, local762, local876);
							}
							this.anInt4504++;
						}
					}
				}
			}
			for (local192 = 0; local192 < this.anInt4501; local192++) {
				@Pc(1306) Class7_Sub22 local1306 = local165[local192];
				if (local1306 != null) {
					local1306.method2466(local192);
				}
			}
			@Pc(1343) int local1343;
			for (@Pc(1323) int local1323 = 0; local1323 < super.anInt4489; local1323++) {
				for (@Pc(1327) int local1327 = 0; super.anInt4490 > local1327; local1327++) {
					@Pc(1339) short[] local1339 = this.aShortArrayArray2[super.anInt4489 * local1327 + local1323];
					if (local1339 != null) {
						local1343 = 0;
						@Pc(1345) int local1345 = 0;
						while (local1345 < local1339.length) {
							@Pc(1354) int local1354 = local1339[local1345++] & 0xFFFF;
							@Pc(1361) int local1361 = local1339[local1345++] & 0xFFFF;
							@Pc(1368) int local1368 = local1339[local1345++] & 0xFFFF;
							@Pc(1372) Class7_Sub22 local1372 = local165[local1354];
							@Pc(1376) Class7_Sub22 local1376 = local165[local1361];
							@Pc(1380) Class7_Sub22 local1380 = local165[local1368];
							@Pc(1382) Class7_Sub22 local1382 = null;
							if (local1372 != null) {
								local1382 = local1372;
								local1372.method2467(local1343, local1323, local1327);
							}
							if (local1376 != null) {
								local1376.method2467(local1343, local1323, local1327);
								if (local1382 == null || local1382.aLong230 > local1376.aLong230) {
									local1382 = local1376;
								}
							}
							if (local1380 != null) {
								local1380.method2467(local1343, local1323, local1327);
								if (local1382 == null || local1380.aLong230 < local1382.aLong230) {
									local1382 = local1380;
								}
							}
							if (local1382 != null) {
								if (local1372 != null) {
									local1382.method2466(local1354);
								}
								if (local1376 != null) {
									local1382.method2466(local1361);
								}
								if (local1380 != null) {
									local1382.method2466(local1368);
								}
								local1382.method2467(local1343, local1323, local1327);
							}
							local1343++;
						}
					}
				}
			}
			local161.c();
			this.anInterface8_3 = this.aClass51_Sub2_29.method5376(local156, local161.b(), local137);
			this.aClass87_4 = new Class87(this.anInterface8_3, 5126, 3, 0);
			this.aClass87_6 = new Class87(this.anInterface8_3, 5121, 4, 12);
			@Pc(1521) byte local1521;
			if (this.anIntArrayArrayArray10 == null) {
				this.aClass87_5 = new Class87(this.anInterface8_3, 5126, 2, 16);
				local1521 = 24;
			} else {
				this.aClass87_5 = new Class87(this.anInterface8_3, 5126, 3, 16);
				local1521 = 28;
			}
			if ((this.anInt4498 & 0x7) != 0) {
				this.aClass87_7 = new Class87(this.anInterface8_3, 5126, 3, local1521);
			}
			@Pc(1558) long[] local1558 = new long[this.aClass7_Sub22Array1.length];
			for (local1343 = 0; local1343 < this.aClass7_Sub22Array1.length; local1343++) {
				@Pc(1567) Class7_Sub22 local1567 = this.aClass7_Sub22Array1[local1343];
				local1558[local1343] = local1567.aLong230;
				local1567.method2463(this.anInt4501);
			}
			Static75.method1213(local1558, this.aClass7_Sub22Array1);
			if (this.aClass42_2 != null) {
				this.aClass42_2.method749();
			}
		}
		this.aFloatArrayArray8 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
		this.aByteArrayArray20 = null;
		this.aClass7_Sub22ArrayArrayArray1 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass164_26 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZ[[ZI)V")
	private void method3585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) boolean[][] arg3, @OriginalArg(6) int arg4) {
		if (this.aClass7_Sub22Array1 == null) {
			return;
		}
		@Pc(13) float local13 = this.aClass51_Sub2_29.aFloat205;
		@Pc(17) float local17 = this.aClass51_Sub2_29.aFloat191;
		@Pc(23) int local23 = arg4 + arg4 + 1;
		@Pc(27) int local27 = local23 * local23;
		if (this.aClass51_Sub2_29.anIntArray593.length < local27) {
			this.aClass51_Sub2_29.anIntArray593 = new int[local27];
		}
		if (this.aClass51_Sub2_29.aClass7_Sub14_Sub2_2.aByteArray75.length < this.anInt4504 * 2) {
			this.aClass51_Sub2_29.aClass7_Sub14_Sub2_2 = new Class7_Sub14_Sub2(this.anInt4504 * 2);
		}
		@Pc(63) int local63 = arg1 - arg4;
		@Pc(65) int local65 = local63;
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(77) int local77 = arg0 - arg4;
		@Pc(79) int local79 = local77;
		if (local77 < 0) {
			local77 = 0;
		}
		@Pc(87) int local87 = arg4 + arg1;
		if (local87 > super.anInt4489 - 1) {
			local87 = super.anInt4489 - 1;
		}
		@Pc(107) int local107 = arg0 + arg4;
		if (local107 > super.anInt4490 - 1) {
			local107 = super.anInt4490 - 1;
		}
		@Pc(124) int local124 = 0;
		@Pc(128) int[] local128 = this.aClass51_Sub2_29.anIntArray593;
		@Pc(141) int local141;
		for (@Pc(130) int local130 = local63; local130 <= local87; local130++) {
			@Pc(139) boolean[] local139 = arg3[local130 - local65];
			for (local141 = local77; local141 <= local107; local141++) {
				if (local139[local141 - local79]) {
					local128[local124++] = local141 * super.anInt4489 + local130;
				}
			}
		}
		this.aClass51_Sub2_29.method5384();
		this.aClass51_Sub2_29.method5392((this.anInt4498 & 0x7) != 0);
		for (@Pc(208) int local208 = 0; local208 < this.aClass7_Sub22Array1.length; local208++) {
			this.aClass7_Sub22Array1[local208].method2465(local124, local128);
		}
		if (!this.aClass85_29.method2007()) {
			local141 = this.aClass51_Sub2_29.anInt6954;
			@Pc(241) int local241 = this.aClass51_Sub2_29.anInt6950;
			this.aClass51_Sub2_29.UA(0, local241, this.aClass51_Sub2_29.anInt6945);
			this.aClass51_Sub2_29.g(local17, local13 - 4.0F);
			this.aClass51_Sub2_29.method5392(false);
			this.aClass51_Sub2_29.method5375(false);
			this.aClass51_Sub2_29.method5412(128);
			this.aClass51_Sub2_29.method5431(-2);
			this.aClass51_Sub2_29.method5364(this.aClass51_Sub2_29.aClass59_Sub3_5);
			this.aClass51_Sub2_29.method5394(8448, 7681);
			this.aClass51_Sub2_29.method5408(770, 34166, 0);
			this.aClass51_Sub2_29.method5374(34167, 0);
			for (@Pc(312) Class7 local312 = this.aClass85_29.method2010(); local312 != null; local312 = this.aClass85_29.method2000()) {
				@Pc(317) Class7_Sub6 local317 = (Class7_Sub6) local312;
				local317.method474(arg3, arg4, arg1, arg0);
			}
			this.aClass51_Sub2_29.method5408(768, 5890, 0);
			this.aClass51_Sub2_29.method5374(5890, 0);
			this.aClass51_Sub2_29.method5364(null);
			this.aClass51_Sub2_29.UA(local141, local241, this.aClass51_Sub2_29.anInt6945);
		}
		if (this.aClass42_2 != null) {
			this.aClass51_Sub2_29.g(local17, local13 - 8.0F);
			this.aClass51_Sub2_29.method5384();
			this.aClass51_Sub2_29.method5415(this.aClass87_4, null, null, this.aClass87_5);
			this.aClass42_2.method752(arg2, arg3, arg1, arg0, arg4);
		}
		this.aClass51_Sub2_29.g(local17, local13);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3579(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4514 <= 0) {
			return;
		}
		this.aClass51_Sub2_29.method5362();
		this.aClass51_Sub2_29.method5414(false);
		this.aClass51_Sub2_29.method5392(false);
		this.aClass51_Sub2_29.method5389(false);
		this.aClass51_Sub2_29.method5375(false);
		this.aClass51_Sub2_29.method5412(0);
		this.aClass51_Sub2_29.method5431(-2);
		this.aClass51_Sub2_29.method5364(null);
		Static63.aFloatArray2[7] = 0.0F;
		Static63.aFloatArray2[0] = (float) 1024 / ((float) super.anInt4485 * 128.0F * (float) this.aClass51_Sub2_29.anInt6816);
		Static63.aFloatArray2[2] = 0.0F;
		Static63.aFloatArray2[8] = 0.0F;
		Static63.aFloatArray2[11] = 0.0F;
		Static63.aFloatArray2[4] = 0.0F;
		Static63.aFloatArray2[10] = 0.0F;
		Static63.aFloatArray2[15] = 1.0F;
		Static63.aFloatArray2[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass51_Sub2_29.anInt6816) - 1.0F;
		Static63.aFloatArray2[5] = (float) 1024 / ((float) this.aClass51_Sub2_29.anInt6830 * (float) super.anInt4485 * 128.0F);
		Static63.aFloatArray2[14] = 0.0F;
		Static63.aFloatArray2[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass51_Sub2_29.anInt6830;
		Static63.aFloatArray2[3] = 0.0F;
		Static63.aFloatArray2[9] = 0.0F;
		Static63.aFloatArray2[1] = 0.0F;
		Static63.aFloatArray2[6] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static63.aFloatArray2, 0);
		Static63.aFloatArray2[6] = 1.0F;
		Static63.aFloatArray2[4] = 0.0F;
		Static63.aFloatArray2[3] = 0.0F;
		Static63.aFloatArray2[12] = 0.0F;
		Static63.aFloatArray2[2] = 0.0F;
		Static63.aFloatArray2[7] = 0.0F;
		Static63.aFloatArray2[13] = 0.0F;
		Static63.aFloatArray2[0] = 1.0F;
		Static63.aFloatArray2[14] = 0.0F;
		Static63.aFloatArray2[5] = 0.0F;
		Static63.aFloatArray2[11] = 0.0F;
		Static63.aFloatArray2[1] = 0.0F;
		Static63.aFloatArray2[10] = 0.0F;
		Static63.aFloatArray2[8] = 0.0F;
		Static63.aFloatArray2[9] = 1.0F;
		Static63.aFloatArray2[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static63.aFloatArray2, 0);
		if ((this.anInt4498 & 0x7) == 0) {
			this.aClass51_Sub2_29.method5392(false);
		} else {
			this.aClass51_Sub2_29.method5392(true);
			this.aClass51_Sub2_29.method5356();
		}
		this.aClass51_Sub2_29.method5415(this.aClass87_4, this.aClass87_6, this.aClass87_7, this.aClass87_5);
		if (this.anInt4504 * 2 > this.aClass51_Sub2_29.aClass7_Sub14_Sub2_2.aByteArray75.length) {
			this.aClass51_Sub2_29.aClass7_Sub14_Sub2_2 = new Class7_Sub14_Sub2(this.anInt4504 * 2);
		} else {
			this.aClass51_Sub2_29.aClass7_Sub14_Sub2_2.anInt4989 = 0;
		}
		@Pc(317) int local317 = 0;
		@Pc(321) Class7_Sub14_Sub2 local321 = this.aClass51_Sub2_29.aClass7_Sub14_Sub2_2;
		@Pc(327) int local327;
		@Pc(336) int local336;
		@Pc(338) int local338;
		@Pc(356) short[] local356;
		@Pc(360) int local360;
		if (this.aClass51_Sub2_29.aBoolean461) {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = arg0 + super.anInt4489 * local327;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local356 = this.aShortArrayArray2[local336];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local321.method3993(local356[local360] & 0xFFFF);
								local317++;
							}
						}
					}
					local336++;
				}
			}
		} else {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = arg0 + local327 * super.anInt4489;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local356 = this.aShortArrayArray2[local336];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local321.method3976(local356[local360] & 0xFFFF);
								local317++;
							}
						}
					}
					local336++;
				}
			}
		}
		if (local317 > 0) {
			@Pc(473) Class10_Sub2 local473 = new Class10_Sub2(this.aClass51_Sub2_29, 5123, local321.aByteArray75, local321.anInt4989);
			this.aClass51_Sub2_29.method5365(local473, 0, local317);
		}
	}
}
